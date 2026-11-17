import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

@deob.ObfuscatedName("jp")
public class class571 implements class593, class577 {
   @deob.ObfuscatedName("jp.n")
   private final int field5148;
   @deob.ObfuscatedName("jp.k")
   private final class34 field5149;
   @deob.ObfuscatedName("jp.d")
   private long field5150;

   public class571(class34 arg0, int arg1) {
      this.field5148 = arg1;
      this.field5149 = arg0;
      this.field5149.field5144.method16317(this);
   }

   @deob.ObfuscatedName("jp.n()I")
   public int method3939() {
      return this.field5149.method507();
   }

   @deob.ObfuscatedName("jp.k()I")
   public int method3938() {
      return this.field5149.method491();
   }

   @deob.ObfuscatedName("jp.o()J")
   public long method7920() {
      if (this.field5150 == 0L) {
         this.field5150 = IDirect3DTexture.GetSurfaceLevel(this.field5149.field5147, this.field5148);
      }

      return this.field5150;
   }

   @deob.ObfuscatedName("jp.d()V")
   public void method302() {
      if (this.field5150 != 0L) {
         IUnknown.Release(this.field5150);
         this.field5150 = 0L;
      }

      this.field5149.field5144.method16305(this);
   }

   @deob.ObfuscatedName("jp.l()V")
   public void method7921() {
      if (this.field5150 != 0L) {
         this.field5149.field5144.method2586(this.field5150);
         this.field5150 = 0L;
      }

   }

   public void finalize() {
      this.method7921();
   }
}
