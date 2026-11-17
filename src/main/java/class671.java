import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

@deob.ObfuscatedName("nh")
public abstract class class671 implements class670, Runnable, FocusListener, WindowListener {
   @deob.ObfuscatedName("nh.k")
   private static long field6118 = 20000000L;
   @deob.ObfuscatedName("nh.d")
   public static int field6099 = 0;
   @deob.ObfuscatedName("nh.p")
   private static long[] field6133 = new long[32];
   @deob.ObfuscatedName("nh.a")
   private static long[] field6098 = new long[32];
   @deob.ObfuscatedName("nh.e")
   public static int field6105 = 0;
   @deob.ObfuscatedName("nh.z")
   public static int field6119 = 0;
   @deob.ObfuscatedName("nh.i")
   protected static String field6107 = null;
   @deob.ObfuscatedName("nh.y")
   protected static volatile boolean field6112 = true;
   @deob.ObfuscatedName("nh.f")
   private static int field6109 = 500;
   @deob.ObfuscatedName("nh.ai")
   protected static volatile boolean field6106 = false;
   @deob.ObfuscatedName("nh.ap")
   private static volatile long field6111 = 0L;
   @deob.ObfuscatedName("nh.ax")
   protected static boolean field6101 = false;
   @deob.ObfuscatedName("nh.af")
   private static volatile boolean field6113 = true;
   @deob.ObfuscatedName("nh.aq")
   private static class859 field6121 = null;
   @deob.ObfuscatedName("nh.ar")
   protected static class859 field6122 = null;
   @deob.ObfuscatedName("nh.as")
   private static class859 field6131 = null;
   @deob.ObfuscatedName("nh.bf")
   private static class686 field6126 = null;
   @deob.ObfuscatedName("nh.bp")
   private static long field6127 = 0L;
   @deob.ObfuscatedName("nh.bs")
   private static boolean field6128 = false;
   @deob.ObfuscatedName("nh.ba")
   public static int field6130 = -1;
   @deob.ObfuscatedName("nh.bg")
   public static int field6097 = 1;
   @deob.ObfuscatedName("nh.br")
   private boolean field6129 = false;
   @deob.ObfuscatedName("nh.bc")
   private boolean field6132 = false;

   public void supplyApplet(Applet arg0) {
      Statics.field6978 = arg0;
   }

   @deob.ObfuscatedName("nh.n(Lnx;Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
   protected final void method9780(class687 arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      try {
         this.method9777(class686.field6210, arg7);
         Statics.field9255 = Statics.field6104 = arg0.method10042();
         Statics.field7012 = Statics.field6354 = arg0.method10045();
         field6105 = 0;
         field6119 = 0;
         if (method11178() == class686.field6211) {
            Statics.field9255 += 2 * arg0.method10055();
            Statics.field7012 += 2 * arg0.method10041();
            this.method9760(arg0.method10046());
         }

         Statics.field1851 = Statics.field6978;
         this.method9762(arg1, arg2, arg3, arg4, arg5, arg6);
      } catch (Throwable var10) {
         class285.method15864((String)null, var10);
         this.method9774("crash");
      }

   }

   @deob.ObfuscatedName("nh.k(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
   private final void method9762(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
      Statics.field8391 = arg3;
      Statics.field4779 = arg2;
      Statics.field1852 = arg4;
      Statics.field1853 = arg5;
      Statics.field5425 = "Unknown";
      Statics.field5702 = "1.1";

      try {
         Statics.field5425 = System.getProperty("java.vendor");
         Statics.field5702 = System.getProperty("java.version");
      } catch (Exception var33) {
      }

      try {
         Statics.field1199 = System.getProperty("os.name");
      } catch (Exception var32) {
         Statics.field1199 = "Unknown";
      }

      Statics.field6120 = Statics.field1199.toLowerCase();

      try {
         Statics.field4156 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var31) {
         Statics.field4156 = "";
      }

      try {
         Statics.field5999 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var30) {
         Statics.field5999 = "";
      }

      try {
         Statics.field4905 = System.getProperty("user.home");
         if (Statics.field4905 != null) {
            Statics.field4905 = Statics.field4905 + "/";
         }
      } catch (Exception var29) {
      }

      try {
         if (Statics.field6120.startsWith("win")) {
            if (Statics.field4905 == null) {
               Statics.field4905 = System.getenv("USERPROFILE");
            }
         } else if (Statics.field4905 == null) {
            Statics.field4905 = System.getenv("HOME");
         }

         if (Statics.field4905 != null) {
            Statics.field4905 = Statics.field4905 + "/";
         }
      } catch (Exception var28) {
      }

      if (Statics.field4905 == null) {
         Statics.field4905 = "~/";
      }

      try {
         Statics.field6666 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var27) {
      }

      Statics.field6474 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field4905, "/tmp/", ""};
      Statics.field6674 = new String[]{".jagex_cache_" + Statics.field4779, ".file_store_" + Statics.field4779};
      int var14 = 0;

      label131:
      while(var14 < 4) {
         Statics.field4170 = this.method9756(arg0, arg1, var14);
         if (!Statics.field4170.exists()) {
            Statics.field4170.mkdirs();
         }

         File[] var15 = Statics.field4170.listFiles();
         if (var15 == null) {
            break;
         }

         File[] var16 = var15;
         int var17 = 0;

         while(true) {
            if (var17 >= var16.length) {
               break label131;
            }

            File var18 = var16[var17];
            if (!this.method9759(var18, false)) {
               ++var14;
               break;
            }

            ++var17;
         }
      }

      class676.method4452(Statics.field4170);
      method8875();
      field6122 = new class859(new class860(class676.method6284("main_file_cache.dat2"), "rw", 786432000L), 5200, 0);
      field6131 = new class859(new class860(class676.method6284("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      Statics.field698 = new class859[Statics.field8391];

      for(int var19 = 0; var19 < Statics.field8391; ++var19) {
         Statics.field698[var19] = new class859(new class860(class676.method6284("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
      }

      try {
         Statics.field6776 = new class876();
      } catch (Exception var26) {
         class854.field8745 = false;
      }

      Statics.field3759 = new class665();
      ThreadGroup var21 = Thread.currentThread().getThreadGroup();

      for(ThreadGroup var22 = var21.getParent(); var22 != null; var22 = var22.getParent()) {
         var21 = var22;
      }

      Thread[] var23 = new Thread[1000];
      var21.enumerate(var23);

      for(int var24 = 0; var24 < var23.length; ++var24) {
         if (var23[var24] != null && var23[var24].getName().startsWith("AWT")) {
            var23[var24].setPriority(1);
         }
      }

      Thread var25 = new Thread(this);
      var25.setDaemon(true);
      var25.start();
      var25.setPriority(1);
   }

   @deob.ObfuscatedName("nh.d(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
   private File method9756(String arg0, String arg1, int arg2) {
      String var4 = arg2 == 0 ? "" : "" + arg2;
      Statics.field1127 = new File(Statics.field4905, "jagex_cl_" + arg0 + "_" + arg1 + var4 + ".dat");
      String var5 = null;
      String var6 = null;
      boolean var7 = false;
      if (Statics.field1127.exists()) {
         try {
            class860 var8 = new class860(Statics.field1127, "rw", 10000L);
            class124 var9 = new class124((int)var8.method15148());

            while(var9.field935 < var9.field931.length) {
               int var10 = var8.method15149(var9.field931, var9.field935, var9.field931.length - var9.field935);
               if (var10 == -1) {
                  throw new IOException();
               }

               var9.field935 += var10;
            }

            var9.field935 = 0;
            int var11 = var9.method1688();
            if (var11 < 1 || var11 > 3) {
               throw new IOException("" + var11);
            }

            int var12 = 0;
            if (var11 > 1) {
               var12 = var9.method1688();
            }

            if (var11 <= 2) {
               var5 = var9.method1600();
               if (var12 == 1) {
                  var6 = var9.method1600();
               }
            } else {
               var5 = var9.method1641();
               if (var12 == 1) {
                  var6 = var9.method1641();
               }
            }

            var8.method15151();
         } catch (IOException var29) {
            var29.printStackTrace();
         }

         if (var5 != null) {
            File var14 = new File(var5);
            if (!var14.exists()) {
               var5 = null;
            }
         }

         if (var5 != null) {
            File var15 = new File(var5, "test.dat");
            if (!this.method9759(var15, true)) {
               var5 = null;
            }
         }
      }

      if (var5 == null && arg2 == 0) {
         label103:
         for(int var16 = 0; var16 < Statics.field6674.length; ++var16) {
            for(int var17 = 0; var17 < Statics.field6474.length; ++var17) {
               File var18 = new File(Statics.field6474[var17] + Statics.field6674[var16] + File.separatorChar + arg0 + File.separatorChar);
               if (var18.exists() && this.method9759(new File(var18, "test.dat"), true)) {
                  var5 = var18.toString();
                  var7 = true;
                  break label103;
               }
            }
         }
      }

      if (var5 == null) {
         var5 = Statics.field4905 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
         var7 = true;
      }

      if (var6 != null) {
         File var19 = new File(var6);
         File var20 = new File(var5);

         try {
            File[] var21 = var19.listFiles();
            File[] var22 = var21;

            for(int var23 = 0; var23 < var22.length; ++var23) {
               File var24 = var22[var23];
               File var25 = new File(var20, var24.getName());
               boolean var26 = var24.renameTo(var25);
               if (!var26) {
                  throw new IOException();
               }
            }
         } catch (Exception var28) {
            var28.printStackTrace();
         }

         var7 = true;
      }

      if (var7) {
         this.method9758(new File(var5), (File)null);
      }

      return new File(var5);
   }

   @deob.ObfuscatedName("nh.b(Ljava/io/File;B)Z")
   public boolean method9816(File arg0) {
      if (arg0 == null) {
         return false;
      } else if (!arg0.exists()) {
         return false;
      } else if (!arg0.isDirectory()) {
         return false;
      } else if (arg0.listFiles().length != 0) {
         return false;
      } else if (!this.method9759(new File(arg0, "test.dat"), true)) {
         return false;
      } else {
         this.method9758(arg0, Statics.field4170);
         return true;
      }
   }

   @deob.ObfuscatedName("nh.r(Ljava/io/File;Ljava/io/File;I)V")
   private void method9758(File arg0, File arg1) {
      try {
         class860 var3 = new class860(Statics.field1127, "rw", 10000L);
         class124 var4 = new class124(500);
         var4.method1568(3);
         var4.method1568(arg1 != null ? 1 : 0);
         var4.method1581(arg0.getPath());
         if (arg1 != null) {
            var4.method1581(arg1.getPath());
         }

         var3.method15146(var4.field931, 0, var4.field935);
         var3.method15151();
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   @deob.ObfuscatedName("nh.p(Ljava/io/File;ZI)Z")
   private boolean method9759(File arg0, boolean arg1) {
      try {
         RandomAccessFile var3 = new RandomAccessFile(arg0, "rw");
         int var4 = var3.read();
         var3.seek(0L);
         var3.write(var4);
         var3.seek(0L);
         var3.close();
         if (arg1) {
            arg0.delete();
         }

         return true;
      } catch (Exception var6) {
         return false;
      }
   }

   @deob.ObfuscatedName("ly.a(Ljava/lang/String;Ljava/lang/String;ZI)Luh;")
   public static class860 method9175(String arg0, String arg1, boolean arg2) {
      File var3 = new File(Statics.field4170, "preferences" + arg0 + ".dat");
      if (var3.exists()) {
         try {
            return new class860(var3, "rw", 10000L);
         } catch (IOException var14) {
         }
      }

      String var6 = "";
      if (Statics.field4779 == 33) {
         var6 = "_rc";
      } else if (Statics.field4779 == 34) {
         var6 = "_wip";
      }

      File var7 = new File(Statics.field4905, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
      if (!arg2 && var7.exists()) {
         try {
            return new class860(var7, "rw", 10000L);
         } catch (IOException var13) {
         }
      }

      try {
         return new class860(var3, "rw", 10000L);
      } catch (IOException var12) {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("le.x(I)V")
   private static void method8875() {
      try {
         File var0 = new File(Statics.field4905, "random.dat");
         if (var0.exists()) {
            field6121 = new class859(new class860(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < Statics.field6674.length; ++var1) {
               for(int var2 = 0; var2 < Statics.field6474.length; ++var2) {
                  File var3 = new File(Statics.field6474[var2] + Statics.field6674[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     field6121 = new class859(new class860(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (field6121 == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            int var5 = var4.read();
            var4.seek(0L);
            var4.write(var5);
            var4.seek(0L);
            var4.close();
            field6121 = new class859(new class860(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var7) {
      }

   }

   @deob.ObfuscatedName("gr.s(Laen;I)V")
   public static void method6859(class124 arg0) {
      byte[] var1 = new byte[24];

      try {
         field6121.method15115(0L);
         field6121.method15117(var1);

         int var2;
         for(var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
         }

         if (var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var5) {
         for(int var4 = 0; var4 < 24; ++var4) {
            var1[var4] = -1;
         }
      }

      arg0.method1753(var1, 0, 24);
   }

   @deob.ObfuscatedName("jm.l(Laen;IB)V")
   protected static void method7972(class124 arg0, int arg1) {
      if (field6121 != null) {
         try {
            field6121.method15115(0L);
            field6121.method15122(arg0.field931, arg1, 24);
         } catch (Exception var3) {
         }
      }

   }

   @deob.ObfuscatedName("nh.v(Ljava/lang/String;I)V")
   private synchronized void method9760(String arg0) {
      Statics.field4149 = new Frame();
      Statics.field4149.setTitle(arg0);
      Statics.field4149.setResizable(true);
      Statics.field4149.addWindowListener(this);
      Statics.field4149.setBackground(Color.black);
      Statics.field4149.setVisible(true);
      Statics.field4149.toFront();
      Insets var2 = Statics.field4149.getInsets();
      Statics.field4149.setSize(Statics.field9255 + var2.left + var2.right, Statics.field7012 + var2.top + var2.bottom);
   }

   @deob.ObfuscatedName("nh.g(B)V")
   protected synchronized void method9761() {
      this.method9763();
      Container var1 = method8973();
      Statics.field5796 = new class293(var1);
      this.method9755(var1);
   }

   @deob.ObfuscatedName("ln.h(S)Ljava/awt/Container;")
   public static Container method8973() {
      if (Statics.field688 != null) {
         return Statics.field688;
      } else {
         return Statics.field4149 != null ? Statics.field4149 : Statics.field6978;
      }
   }

   @deob.ObfuscatedName("nh.e(Ljava/awt/Container;I)V")
   private void method9755(Container arg0) {
      arg0.setBackground(Color.black);
      arg0.setLayout((LayoutManager)null);
      arg0.add(Statics.field5796);
      Statics.field5796.setSize(Statics.field6104, Statics.field6354);
      Statics.field5796.setVisible(true);
      if (Statics.field4149 == arg0) {
         Insets var2 = Statics.field4149.getInsets();
         Statics.field5796.setLocation(field6105 + var2.left, field6119 + var2.top);
      } else {
         Statics.field5796.setLocation(field6105, field6119);
      }

      Statics.field5796.addFocusListener(this);
      Statics.field5796.requestFocus();
      Statics.field6857 = true;
      field6113 = true;
      Statics.field5796.setFocusTraversalKeysEnabled(false);
      field6112 = true;
      field6106 = false;
      field6111 = class431.method2169();
   }

   @deob.ObfuscatedName("nh.z(I)V")
   private void method9763() {
      if (Statics.field5796 != null) {
         Statics.field5796.removeFocusListener(this);
         Statics.field5796.getParent().setBackground(Color.black);
         Statics.field5796.getParent().remove(Statics.field5796);
      }

   }

   @deob.ObfuscatedName("nh.m(B)Z")
   protected final boolean method9754() {
      String var1 = Statics.field6978.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (!var1.equals("stellardawn.com") && !var1.endsWith(".stellardawn.com")) {
               if (var1.endsWith("127.0.0.1")) {
                  return true;
               } else {
                  while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                     var1 = var1.substring(0, var1.length() - 1);
                  }

                  if (var1.endsWith("")) {
                     return true;
                  } else {
                     this.method9774("invalidhost");
                     return false;
                  }
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void run() {
      try {
         this.method9764();
      } catch (ThreadDeath var7) {
         throw var7;
      } catch (Throwable var8) {
         class285.method15864(this.method4556(), var8);
         this.method9774("crash");
      } finally {
         this.method9767(true);
      }

   }

   @deob.ObfuscatedName("nh.i(B)V")
   private void method9764() {
      if (Statics.field5425 != null) {
         String var1 = Statics.field5425.toLowerCase();
         if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
            String var2 = Statics.field5702;
            if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
               this.method9774("wrongjava");
               return;
            }

            if (var2.startsWith("1.6.0_")) {
               int var3;
               for(var3 = 6; var3 < var2.length() && class816.method9128(var2.charAt(var3)); ++var3) {
               }

               String var4 = var2.substring(6, var3);
               if (class816.method14597(var4) && class816.method5626(var4) < 10) {
                  this.method9774("wrongjava");
                  return;
               }
            }
         }
      }

      method8973().setFocusCycleRoot(true);
      field6130 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      field6097 = Runtime.getRuntime().availableProcessors();
      this.method9761();
      this.method4822();
      Statics.field1166 = class672.method15477();

      while(field6127 == 0L || class431.method2169() < field6127) {
         Statics.field6115 = Statics.field1166.method9845(field6118);

         for(int var5 = 0; var5 < Statics.field6115; ++var5) {
            this.method9765();
         }

         this.method9766();
         method9492(Statics.field5796);
      }

   }

   @deob.ObfuscatedName("mt.t(Ljava/lang/Object;I)V")
   public static void method9492(Object arg0) {
      if (Statics.field6666 != null) {
         for(int var1 = 0; var1 < 50 && Statics.field6666.peekEvent() != null; ++var1) {
            Statics.method14813(1L);
         }

         try {
            if (arg0 != null) {
               Statics.field6666.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
         } catch (Exception var3) {
         }

      }
   }

   @deob.ObfuscatedName("nh.c(I)V")
   private void method9765() {
      long var1 = class431.method2169();
      long var3 = field6098[Statics.field161];
      field6098[Statics.field161] = var1;
      Statics.field161 = Statics.field161 + 1 & 31;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         Statics.field6857 = field6113;
      }

      this.method4906();
   }

   @deob.ObfuscatedName("nh.w(I)V")
   private void method9766() {
      long var1 = class431.method2169();
      long var3 = field6133[Statics.field6102];
      field6133[Statics.field6102] = var1;
      Statics.field6102 = Statics.field6102 + 1 & 31;
      if (var3 != 0L && var1 > var3) {
         int var5 = (int)(var1 - var3);
         field6099 = ((var5 >> 1) + 32000) / var5;
      }

      if (++field6109 - 1 > 50) {
         field6109 -= 50;
         field6112 = true;
         Statics.field5796.setSize(Statics.field6104, Statics.field6354);
         Statics.field5796.setVisible(true);
         if (Statics.field4149 != null && Statics.field688 == null) {
            Insets var6 = Statics.field4149.getInsets();
            Statics.field5796.setLocation(field6105 + var6.left, field6119 + var6.top);
         } else {
            Statics.field5796.setLocation(field6105, field6119);
         }
      }

      this.method4553();
   }

   @deob.ObfuscatedName("nh.q(I)Ljava/lang/String;")
   public String method4556() {
      return null;
   }

   @deob.ObfuscatedName("nh.y(ZI)V")
   private final void method9767(boolean arg0) {
      synchronized(this) {
         if (field6128) {
            return;
         }

         field6128 = true;
      }

      try {
         this.method4950();
      } catch (Exception var11) {
      }

      try {
         field6122.method15130();

         for(int var5 = 0; var5 < Statics.field8391; ++var5) {
            Statics.field698[var5].method15130();
         }

         field6131.method15130();
         field6121.method15130();
      } catch (Exception var12) {
      }

      if (this.field6132) {
         try {
            QueryPerformanceCounter.quit();
         } catch (Throwable var10) {
         }
      }

      class374.method5050(true);
      if (class926.method15369()) {
         class926.method5940().method9975();
      }

      if (Statics.field5796 != null) {
         try {
            Statics.field5796.removeFocusListener(this);
            Statics.field5796.getParent().remove(Statics.field5796);
         } catch (Exception var9) {
         }
      }

      if (Statics.field4149 != null) {
         Statics.field4149.setVisible(false);
         Statics.field4149.dispose();
         Statics.field4149 = null;
      }

   }

   @deob.ObfuscatedName("fc.j(I)I")
   public static final int method6226() {
      return (int)(1000000000L / field6118);
   }

   @deob.ObfuscatedName("cz.f(I)V")
   public static final void method5268() {
      Statics.field1166.method743();

      for(int var0 = 0; var0 < 32; ++var0) {
         field6133[var0] = 0L;
      }

      for(int var1 = 0; var1 < 32; ++var1) {
         field6098[var1] = 0L;
      }

      Statics.field6115 = 0;
   }

   @deob.ObfuscatedName("af.ai(B)J")
   protected static long method2049() {
      return Statics.field1166.method746();
   }

   public void start() {
      if (!field6128) {
         field6127 = 0L;
      }
   }

   public void stop() {
      if (!field6128) {
         field6127 = class431.method2169() + 4000L;
      }
   }

   public void destroy() {
      if (!field6128) {
         field6127 = class431.method2169();
         Statics.method14813(5000L);
         this.method9767(false);
      }
   }

   public final void update(Graphics arg0) {
      this.paint(arg0);
   }

   public final synchronized void paint(Graphics arg0) {
      if (!field6128) {
         field6112 = true;
         if (class431.method2169() - field6111 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field9255 && var2.height >= Statics.field7012) {
               field6106 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent arg0) {
      field6113 = true;
      field6112 = true;
   }

   public final void focusLost(FocusEvent arg0) {
      field6113 = false;
   }

   public final void windowActivated(WindowEvent arg0) {
   }

   public final void windowClosed(WindowEvent arg0) {
   }

   public final void windowClosing(WindowEvent arg0) {
      field6101 = true;
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent arg0) {
   }

   public final void windowDeiconified(WindowEvent arg0) {
   }

   public final void windowIconified(WindowEvent arg0) {
   }

   public final void windowOpened(WindowEvent arg0) {
   }

   @deob.ObfuscatedName("nm.at(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V")
   public static final void method9880(int arg0, String arg1, Color arg2, Color arg3, Color arg4) {
      try {
         Graphics var5 = Statics.field5796.getGraphics();
         if (Statics.field1633 == null) {
            Statics.field1633 = new Font("Helvetica", 1, 13);
         }

         if (arg2 == null) {
            arg2 = new Color(140, 17, 17);
         }

         if (arg3 == null) {
            arg3 = new Color(140, 17, 17);
         }

         if (arg4 == null) {
            arg4 = new Color(255, 255, 255);
         }

         try {
            if (Statics.field1652 == null) {
               Statics.field1652 = Statics.field5796.createImage(Statics.field6104, Statics.field6354);
            }

            Graphics var6 = Statics.field1652.getGraphics();
            var6.setColor(Color.black);
            var6.fillRect(0, 0, Statics.field6104, Statics.field6354);
            int var7 = Statics.field6104 / 2 - 152;
            int var8 = Statics.field6354 / 2 - 18;
            var6.setColor(arg3);
            var6.drawRect(var7, var8, 303, 33);
            var6.setColor(arg2);
            var6.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(var7 + 1, var8 + 1, 301, 31);
            var6.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
            var6.setFont(Statics.field1633);
            var6.setColor(arg4);
            var6.drawString(arg1, var7 + (304 - arg1.length() * 6) / 2, var8 + 22);
            if (field6107 != null) {
               var6.setFont(Statics.field1633);
               var6.setColor(arg4);
               var6.drawString(field6107, Statics.field6104 / 2 - field6107.length() * 6 / 2, Statics.field6354 / 2 - 26);
            }

            var5.drawImage(Statics.field1652, 0, 0, (ImageObserver)null);
         } catch (Exception var13) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, Statics.field6104, Statics.field6354);
            int var10 = Statics.field6104 / 2 - 152;
            int var11 = Statics.field6354 / 2 - 18;
            var5.setColor(arg3);
            var5.drawRect(var10, var11, 303, 33);
            var5.setColor(arg2);
            var5.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var10 + 1, var11 + 1, 301, 31);
            var5.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - arg0 * 3, 30);
            var5.setFont(Statics.field1633);
            var5.setColor(arg4);
            if (field6107 != null) {
               var5.setFont(Statics.field1633);
               var5.setColor(arg4);
               var5.drawString(field6107, Statics.field6104 / 2 - field6107.length() * 6 / 2, Statics.field6354 / 2 - 26);
            }

            var5.drawString(arg1, var10 + (304 - arg1.length() * 6) / 2, var11 + 22);
         }
      } catch (Exception var14) {
         Statics.field5796.repaint();
      }

   }

   @deob.ObfuscatedName("nh.aw(Ljava/lang/String;B)V")
   protected void method9774(String arg0) {
      if (!this.field6129) {
         this.field6129 = true;
         System.out.println("error_game_" + arg0);

         try {
            class855.method15072(Statics.field6978, "loggedout");
         } catch (Throwable var5) {
         }

         try {
            Statics.field6978.getAppletContext().showDocument(new URL(Statics.field6978.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
         } catch (Exception var4) {
         }

      }
   }

   @deob.ObfuscatedName("nh.al(I)Z")
   public boolean method9775() {
      this.field6132 = class926.method5940().method9973("jaclib");
      if (this.field6132) {
         try {
            QueryPerformanceCounter.init();
         } catch (Throwable var2) {
         }
      }

      return this.field6132;
   }

   @deob.ObfuscatedName("nh.an(I)Z")
   public boolean method9776() {
      return class926.method5940().method9973("jagtheora");
   }

   @deob.ObfuscatedName("nh.ag(Lnw;ZI)V")
   private void method9777(class686 arg0, boolean arg1) {
      if (arg0 == null) {
         throw new NullPointerException();
      } else if (class686.field6210 != arg0 && class686.field6209 != arg0) {
         throw new IllegalStateException();
      } else {
         field6126 = arg0;
         if (class686.field6209 != field6126) {
            if (arg1) {
               field6126 = class686.field6211;
            }

         }
      }
   }

   @deob.ObfuscatedName("qh.ak(I)Lnw;")
   public static class686 method11178() {
      return field6126;
   }

   public abstract void init();

   @deob.ObfuscatedName("nh.ap(B)V")
   protected abstract void method4822();

   @deob.ObfuscatedName("nh.av(B)V")
   protected abstract void method4906();

   @deob.ObfuscatedName("nh.af(I)V")
   protected abstract void method4950();

   @deob.ObfuscatedName("nh.ax(B)V")
   protected abstract void method4553();
}
