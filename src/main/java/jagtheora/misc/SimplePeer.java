package jagtheora.misc;

public abstract class SimplePeer {
   private long peer;

   static {
      init0();
   }

   @deob.ObfuscatedName("jagtheora/misc/SimplePeer.n()Z")
   public final boolean method7855() {
      return this.peer == 0L;
   }

   private final void setPeer(long arg0) {
      this.peer = arg0;
   }

   @deob.ObfuscatedName("jagtheora/misc/SimplePeer.k()V")
   public final void method7856() {
      if (!this.method7855()) {
         this.clear();
      }

   }

   public void finalize() throws Throwable {
      if (!this.method7855()) {
         this.method7856();
      }

      super.finalize();
   }

   protected static native void init0();

   protected abstract void clear();
}
