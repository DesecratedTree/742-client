import jaggl.OpenGL;

@deob.ObfuscatedName("lt")
public class class629 implements class398, class393, class622 {
   @deob.ObfuscatedName("lt.k")
   private final class372 field5714;
   @deob.ObfuscatedName("lt.n")
   private final class405 field5715;
   @deob.ObfuscatedName("lt.d")
   private final int field5713;
   @deob.ObfuscatedName("lt.b")
   private final int field5716;
   @deob.ObfuscatedName("lt.r")
   private final class214 field5717;
   @deob.ObfuscatedName("lt.p")
   private int field5718;

   public class629(class214 arg0, class372 arg1, class405 arg2, int arg3, int arg4) {
      this.field5714 = arg1;
      this.field5715 = arg2;
      this.field5713 = arg3;
      this.field5716 = arg4;
      this.field5717 = arg0;
      int[] var6 = new int[1];
      OpenGL.glGenRenderbuffersEXT(1, var6, 0);
      this.field5718 = var6[0];
      OpenGL.glBindRenderbufferEXT(36161, this.field5718);
      OpenGL.glRenderbufferStorageEXT(36161, class214.method2903(this.field5714, this.field5715), arg3, arg4);
   }

   public class629(class214 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5) {
      this.field5714 = arg1;
      this.field5715 = arg2;
      this.field5713 = arg3;
      this.field5716 = arg4;
      this.field5717 = arg0;
      int[] var7 = new int[1];
      OpenGL.glGenRenderbuffersEXT(1, var7, 0);
      this.field5718 = var7[0];
      OpenGL.glBindRenderbufferEXT(36161, this.field5718);
      OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, class214.method2903(this.field5714, this.field5715), arg3, arg4);
   }

   @deob.ObfuscatedName("lt.n()I")
   public int method3939() {
      return this.field5713;
   }

   @deob.ObfuscatedName("lt.k()I")
   public int method3938() {
      return this.field5716;
   }

   @deob.ObfuscatedName("lt.o(I)V")
   public void method8881(int arg0) {
      OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field5718);
   }

   @deob.ObfuscatedName("lt.d()V")
   public void method302() {
      if (this.field5718 > 0) {
         int[] var1 = new int[]{this.field5718};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.field5718 = 0;
      }

   }

   @deob.ObfuscatedName("lt.h()V")
   private void method9105() {
      if (this.field5718 > 0) {
         this.field5717.method2891(this.field5718, this.field5715.field3055 * this.field5716 * this.field5713 * this.field5714.field2744);
         this.field5718 = 0;
      }

   }

   public void finalize() throws Throwable {
      this.method9105();
      super.finalize();
   }
}
