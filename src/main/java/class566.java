import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@deob.ObfuscatedName("jk")
public class class566 implements class577 {
   @deob.ObfuscatedName("jk.n")
   private final class197 field4957;
   @deob.ObfuscatedName("jk.d")
   private final int field4959;
   @deob.ObfuscatedName("jk.b")
   private final int field4960;
   @deob.ObfuscatedName("jk.k")
   private final class405 field4958;
   @deob.ObfuscatedName("jk.r")
   private long field4961;

   public class566(class197 arg0, class405 arg1, int arg2, int arg3, int arg4) {
      this.field4957 = arg0;
      this.field4959 = arg2;
      this.field4960 = arg3;
      this.field4958 = arg1;
      this.field4961 = IDirect3DDevice.CreateDepthStencilSurface(this.field4957.field1256, arg2, arg3, class197.method2582(this.field4958), arg4 + 0, 0, false);
      this.field4957.method16317(this);
   }

   @deob.ObfuscatedName("jk.n()I")
   public int method3939() {
      return this.field4959;
   }

   @deob.ObfuscatedName("jk.k()I")
   public int method3938() {
      return this.field4960;
   }

   @deob.ObfuscatedName("jk.o()J")
   public long method7920() {
      return this.field4961;
   }

   @deob.ObfuscatedName("jk.d()V")
   public void method302() {
      if (this.field4961 != 0L) {
         IUnknown.Release(this.field4961);
         this.field4961 = 0L;
      }

      this.field4957.method16305(this);
   }

   @deob.ObfuscatedName("jk.l()V")
   public void method7921() {
      if (this.field4961 != 0L) {
         this.field4957.method2586(this.field4961);
         this.field4961 = 0L;
      }

   }

   public void finalize() {
      this.method7921();
   }
}
