import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Entry point for the deobfuscated 742 client.
 *
 * The gamepack is an applet, so this supplies the applet stub and its parameters (fetched from the
 * server's jav_config.ws) and runs the deobfuscated {@code client} class in a frame.
 *
 * <pre>
 * ./gradlew run
 * ./gradlew run --args="http://127.0.0.1:8080/jav_config.ws 18=2 8=2"
 * ./gradlew run --args="http://127.0.0.1:8080/jav_config.ws fps=120"   (ClientConfig.FPS_LIMIT sets the default)
 * </pre>
 */
public final class AppletViewer implements AppletStub, AppletContext {
    private final Map<String, String> config = new HashMap<String, String>();
    private final Map<String, String> params = new HashMap<String, String>();
    private Applet applet;

    public static void main(String[] args) throws Exception {
        // 742's client reads java.version as 1.x.y_zz; anything else opens the login screen's
        // Unsupported Java Warning (cs2 op 432 wants 1.6.0_10+).
        if (!System.getProperty("java.version", "").startsWith("1.")) {
            System.setProperty("java.version", "1.7.0_80");
        }
        prepareNatives();
        String url = args.length > 0 ? args[0] : ClientConfig.CONFIG_URL;
        String[] overrides = args.length > 1 ? Arrays.copyOfRange(args, 1, args.length) : new String[0];
        new AppletViewer().run(URI.create(url).toURL(), overrides);
    }

    /**
     * jaclib.dll imports jawt.dll, which ships in the JDK's {@code jre/bin} (or {@code bin} on 9+) and is
     * not on the DLL search path when {@code java.exe} runs from the JDK's {@code bin} directory. Loading
     * it up front by absolute path makes that import resolve, whatever launched the game.
     */
    private static void prepareNatives() {
        if (!System.getProperty("os.name", "").toLowerCase().startsWith("win")) {
            return;
        }
        String home = System.getProperty("java.home", "");
        String[] candidates = {
                home + File.separator + "bin" + File.separator + "jawt.dll",
                home + File.separator + "jre" + File.separator + "bin" + File.separator + "jawt.dll",
                home + File.separator + ".." + File.separator + "jre" + File.separator + "bin" + File.separator + "jawt.dll"
        };
        for (String candidate : candidates) {
            try {
                File file = new File(candidate).getCanonicalFile();
                if (file.isFile()) {
                    System.load(file.getPath());
                    return;
                }
            } catch (Throwable ignored) {
                // Already loaded, or the runtime refuses to load it this way: the client reports its own
                // failure from class680 if a native library does not come up.
            }
        }
    }

    private static void call(Object target, String name, Class<?> type, Object arg) {
        try {
            if (type == null) {
                target.getClass().getMethod(name).invoke(target);
            } else {
                target.getClass().getMethod(name, type).invoke(target, arg);
            }
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(name, e);
        }
    }

    /** The applet a non-applet client draws into. */
    private static final class Host extends Applet {
        private static final long serialVersionUID = 1L;
        private final Object game;

        Host(Object game) {
            this.game = game;
        }

        @Override
        public void paint(Graphics g) {
            call(game, "paint", Graphics.class, g);
        }

        @Override
        public void update(Graphics g) {
            call(game, "update", Graphics.class, g);
        }
    }

    private static String read(URL url) throws IOException {
        InputStream in = url.openStream();
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[8192];
            for (int n; (n = in.read(buffer)) > 0; ) {
                out.write(buffer, 0, n);
            }
            return new String(out.toByteArray(), StandardCharsets.ISO_8859_1);
        } finally {
            in.close();
        }
    }

    private void run(URL configUrl, String[] overrides) throws Exception {
        String text = read(configUrl);
        for (String line : text.split("\r?\n")) {
            int eq = line.indexOf('=');
            if (eq < 0) {
                continue;
            }
            String key = line.substring(0, eq);
            String value = line.substring(eq + 1);
            if (key.equals("param")) {
                put(value);
            } else {
                config.put(key, value);
            }
        }
        for (String override : overrides) {
            put(override);
        }
        if (!params.containsKey("fps")) {
            params.put("fps", Integer.toString(ClientConfig.FPS_LIMIT));
        }
        // The world's jav_config advertises the address it expects clients on (the live host).
        // When it is fetched from somewhere else, as it is locally, point the client there.
        pointAtConfigHost(configUrl);
        params.put("10", ClientConfig.SERVER_HOST);
        String main = config.containsKey("initial_class") ? config.get("initial_class") : "client.class";
        // The deobfuscated client keeps its original (private) constructor.
        java.lang.reflect.Constructor<?> constructor = Class.forName(main.replace(".class", "")).getDeclaredConstructor();
        constructor.setAccessible(true);
        Object game = constructor.newInstance();
        Applet applet = game instanceof Applet ? (Applet) game : new Host(game);
        this.applet = applet;
        applet.setStub(this);

        Frame frame = new Frame(config.containsKey("title") ? config.get("title") : "RuneScape");
        applet.setPreferredSize(new Dimension(
                Integer.parseInt(config.containsKey("applet_minwidth") ? config.get("applet_minwidth") : "1024"),
                Integer.parseInt(config.containsKey("applet_minheight") ? config.get("applet_minheight") : "768")));
        frame.add(applet);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
        if (game == applet) {
            applet.init();
            applet.start();
        } else {
            call(game, "supplyApplet", Applet.class, applet);
            call(game, "init", null, null);
            call(game, "start", null, null);
        }
    }

    private void pointAtConfigHost(URL configUrl) {
        String advertised = config.get("codebase");
        if (advertised == null || configUrl.getHost().isEmpty()) {
            return;
        }
        String advertisedHost;
        try {
            advertisedHost = URI.create(advertised).getHost();
        } catch (Exception e) {
            return;
        }
        if (advertisedHost == null || advertisedHost.equals(configUrl.getHost())) {
            return;
        }
        String origin = configUrl.getProtocol() + "://" + configUrl.getHost()
                + (configUrl.getPort() != -1 ? ":" + configUrl.getPort() : "");
        config.put("codebase", origin);
        if (advertisedHost.equals(params.get("10"))) {
            params.put("10", configUrl.getHost());
        }
    }

    /**
     * Overrides: a numeric key is an applet param (18=2), {@code fps} is the one named parameter the client
     * reads from the applet (frame limit, -1 for none), anything else a jav_config entry (codebase=...).
     */
    private void put(String param) {
        int split = param.indexOf('=');
        if (split <= 0) {
            return;
        }
        String key = param.substring(0, split);
        String value = param.substring(split + 1);
        if (key.matches("[0-9]+") || key.equals("fps")) {
            params.put(key, value);
        } else {
            config.put(key, value);
        }
    }

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public URL getDocumentBase() {
        return getCodeBase();
    }

    @Override
    public URL getCodeBase() {
        try {
            String base = config.containsKey("codebase") ? config.get("codebase") : "http://127.0.0.1/";
            return URI.create(base.endsWith("/") ? base : base + "/").toURL();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public String getParameter(String name) {
        return params.get(name);
    }

    @Override
    public AppletContext getAppletContext() {
        return this;
    }

    @Override
    public void appletResize(int width, int height) {
    }

    @Override
    public AudioClip getAudioClip(URL url) {
        return null;
    }

    @Override
    public Image getImage(URL url) {
        return null;
    }

    @Override
    public Applet getApplet(String name) {
        return applet;
    }

    @Override
    public Enumeration<Applet> getApplets() {
        return Collections.enumeration(Collections.singletonList(applet));
    }

    @Override
    public void showDocument(URL url) {
    }

    @Override
    public void showDocument(URL url, String target) {
    }

    @Override
    public void showStatus(String status) {
    }

    @Override
    public void setStream(String key, InputStream stream) {
    }

    @Override
    public InputStream getStream(String key) {
        return null;
    }

    /**
     * Not in the Java 8 AppletContext, but some JDK 8 builds (and every 9+) declare it, so it is
     * present here without {@code @Override} and does no harm where the interface lacks it.
     */
    public java.util.Iterator<String> getStreamKeys() {
        return Collections.<String>emptyIterator();
    }
}
