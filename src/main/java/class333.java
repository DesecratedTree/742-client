import jaggl.OpenGL;

@deob.ObfuscatedName("bb")
public class class333 implements class352 {
   @deob.ObfuscatedName("bb.k")
   private final int field2113;
   @deob.ObfuscatedName("bb.d")
   private final class936 field2114;
   @deob.ObfuscatedName("bb.n")
   private final int field2112;

   public class333(class936 arg0, int arg1, int arg2) {
      this.field2113 = arg2;
      this.field2114 = arg0;
      this.field2112 = arg1;
   }

   @deob.ObfuscatedName("bb.n()I")
   public int method3939() {
      return this.field2114.field9479;
   }

   @deob.ObfuscatedName("bb.k()I")
   public int method3938() {
      return this.field2114.field9479;
   }

   @deob.ObfuscatedName("bb.o(I)V")
   public void method4121(int arg0) {
      OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field2112, this.field2114.field2271, this.field2113);
   }

   @deob.ObfuscatedName("bb.d()V")
   public void method302() {
   }
}
