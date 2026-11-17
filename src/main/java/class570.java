import jagdx.IUnknown;

@deob.ObfuscatedName("jo")
public abstract class class570 implements class473 {
   @deob.ObfuscatedName("jo.r")
   public long field5147 = 0L;
   @deob.ObfuscatedName("jo.n")
   public final class197 field5144;
   @deob.ObfuscatedName("jo.k")
   protected final class372 field5143;
   @deob.ObfuscatedName("jo.d")
   protected final class405 field5145;
   @deob.ObfuscatedName("jo.b")
   protected boolean field5146;

   protected class570(class197 arg0, class372 arg1, class405 arg2, boolean arg3, int arg4) {
      this.field5144 = arg0;
      this.field5143 = arg1;
      this.field5145 = arg2;
      this.field5146 = arg3;
      this.field5144.method16317(this);
   }

   @deob.ObfuscatedName("jo.bf()J")
   public long method713() {
      return this.field5147;
   }

   @deob.ObfuscatedName("jo.ar(Lhg;)V")
   public void method503(class500 arg0) {
   }

   @deob.ObfuscatedName("jo.d()V")
   public void method302() {
      if (this.field5147 != 0L) {
         IUnknown.Release(this.field5147);
         this.field5147 = 0L;
      }

      this.field5144.method16305(this);
   }

   @deob.ObfuscatedName("jo.bp()V")
   private void method7978() {
      if (this.field5147 != 0L) {
         this.field5144.method2586(this.field5147);
         this.field5147 = 0L;
      }

   }

   public void finalize() {
      this.method7978();
   }
}
