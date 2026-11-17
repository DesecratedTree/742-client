@deob.ObfuscatedName("ba")
public class class332 extends class879 implements class853 {
   private long nativeid;

   public class332(class548 arg0, int arg1) {
      this.method4111(arg0, arg1);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("ba.sa(Lja;I)V")
   private native void method4111(class548 arg0, int arg1);

   @deob.ObfuscatedName("ba.ma(Z)V")
   public native void method9(boolean arg0);

   @deob.ObfuscatedName("ba.ha()V")
   public native void method4112();

   @deob.ObfuscatedName("ba.u()V")
   public native void method4118();
}
