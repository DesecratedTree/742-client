import jaggl.OpenGL;

@deob.ObfuscatedName("lz")
public class class635 implements class622 {
   @deob.ObfuscatedName("lz.n")
   private final int field5756;
   @deob.ObfuscatedName("lz.k")
   private final class30 field5755;

   public class635(class30 arg0, int arg1) {
      this.field5756 = arg1;
      this.field5755 = arg0;
   }

   @deob.ObfuscatedName("lz.n()I")
   public int method3939() {
      return this.field5755.method507();
   }

   @deob.ObfuscatedName("lz.k()I")
   public int method3938() {
      return this.field5755.method491();
   }

   @deob.ObfuscatedName("lz.o(I)V")
   public void method8881(int arg0) {
      OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field5755.field5580, this.field5755.field5585, this.field5756);
   }

   @deob.ObfuscatedName("lz.d()V")
   public void method302() {
   }
}
