import jaggl.OpenGL;

@deob.ObfuscatedName("lf")
public class class615 implements class622 {
   @deob.ObfuscatedName("lf.n")
   private final int field5545;
   @deob.ObfuscatedName("lf.k")
   private final class32 field5544;

   public class615(class32 arg0, int arg1) {
      this.field5545 = arg1;
      this.field5544 = arg0;
   }

   @deob.ObfuscatedName("lf.n()I")
   public int method3939() {
      return this.field5544.method507();
   }

   @deob.ObfuscatedName("lf.k()I")
   public int method3938() {
      return this.field5544.method491();
   }

   @deob.ObfuscatedName("lf.o(I)V")
   public void method8881(int arg0) {
      OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field5544.field5580, this.field5544.field5585, this.field5545);
   }

   @deob.ObfuscatedName("lf.d()V")
   public void method302() {
   }
}
