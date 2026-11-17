import jaggl.OpenGL;

@deob.ObfuscatedName("cd")
public class class362 implements class352 {
   @deob.ObfuscatedName("cd.n")
   private final int field2344;
   @deob.ObfuscatedName("cd.k")
   private final class939 field2343;

   public class362(class939 arg0, int arg1) {
      this.field2344 = arg1;
      this.field2343 = arg0;
   }

   @deob.ObfuscatedName("cd.n()I")
   public int method3939() {
      return this.field2343.field9486;
   }

   @deob.ObfuscatedName("cd.k()I")
   public int method3938() {
      return this.field2343.field9485;
   }

   @deob.ObfuscatedName("cd.o(I)V")
   public void method4121(int arg0) {
      OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field2343.field2263, this.field2343.field2271, this.field2344);
   }

   @deob.ObfuscatedName("cd.d()V")
   public void method302() {
   }
}
