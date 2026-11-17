package jaclib.ping;

public abstract class IcmpService implements Runnable {
   protected abstract void notify(int arg0);

   protected abstract void notify(int arg0, int arg1, int arg2);

   public native void run();

   protected native void quit();

   public static native boolean available();
}
