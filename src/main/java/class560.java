import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@deob.ObfuscatedName("je")
public class class560 implements class593 {
   @deob.ObfuscatedName("je.n")
   private final class197 field4898;
   @deob.ObfuscatedName("je.b")
   private final int field4900;
   @deob.ObfuscatedName("je.r")
   private final int field4901;
   @deob.ObfuscatedName("je.d")
   private final class372 field4899;
   @deob.ObfuscatedName("je.k")
   private final class405 field4897;
   @deob.ObfuscatedName("je.p")
   private long field4902;

   public class560(class197 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5) {
      this.field4898 = arg0;
      this.field4900 = arg3;
      this.field4901 = arg4;
      this.field4899 = arg1;
      this.field4897 = arg2;
      this.field4902 = IDirect3DDevice.CreateRenderTarget(this.field4898.field1256, arg3, arg4, class197.method2581(this.field4899, this.field4897), arg5 + 0, 0, false);
      this.field4898.method16317(this);
   }

   @deob.ObfuscatedName("je.n()I")
   public int method3939() {
      return this.field4900;
   }

   @deob.ObfuscatedName("je.k()I")
   public int method3938() {
      return this.field4901;
   }

   @deob.ObfuscatedName("je.o()J")
   public long method7920() {
      return this.field4902;
   }

   @deob.ObfuscatedName("je.d()V")
   public void method302() {
      if (this.field4902 != 0L) {
         IUnknown.Release(this.field4902);
         this.field4902 = 0L;
      }

      this.field4898.method16305(this);
   }

   @deob.ObfuscatedName("je.l()V")
   public void method7921() {
      if (this.field4902 != 0L) {
         this.field4898.method2586(this.field4902);
         this.field4902 = 0L;
      }

   }

   public void finalize() {
      this.method7921();
   }
}
