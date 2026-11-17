import jaggl.OpenGL;

@deob.ObfuscatedName("aba")
public class class30 extends class619 implements class529 {
   @deob.ObfuscatedName("aba.h")
   private final int field245;
   @deob.ObfuscatedName("aba.e")
   private final int field244;

   public class30(class214 arg0, class372 arg1, class405 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
      this.field245 = arg3;
      this.field244 = arg4;
      this.field5576.method16470(this);
      OpenGL.glTexImage2Dub(this.field5580, 0, class214.method2903(this.field5574, this.field5581), arg3, arg4, 0, class214.method2900(this.field5574), class214.method2918(this.field5581), (byte[])null, 0);
   }

   public class30(class214 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class372.field2736, class405.field3052, arg1 * arg2, false);
      this.field245 = arg1;
      this.field244 = arg2;
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3314, arg5);
      OpenGL.glTexImage2Di(this.field5580, 0, 6408, this.field245, this.field244, 0, 32993, this.field5576.field1418, arg3, arg4 * 4);
      OpenGL.glPixelStorei(3314, 0);
   }

   public class30(class214 arg0, class372 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class405.field3052, arg2 * arg3, false);
      this.field245 = arg2;
      this.field244 = arg3;
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, arg6);
      OpenGL.glTexImage2Dub(this.field5580, 0, class214.method2903(this.field5574, this.field5581), arg2, arg3, 0, class214.method2900(this.field5574), 5121, arg4, arg5);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public class30(class214 arg0, class372 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class405.field3057, arg2 * arg3, false);
      this.field245 = arg2;
      this.field244 = arg3;
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3314, arg6);
      OpenGL.glTexImage2Df(this.field5580, 0, class214.method2903(this.field5574, this.field5581), arg2, arg3, 0, class214.method2900(this.field5574), 5126, arg4, arg5 * 4);
      OpenGL.glPixelStorei(3314, 0);
   }

   @deob.ObfuscatedName("aba.n()I")
   public int method507() {
      return this.field245;
   }

   @deob.ObfuscatedName("aba.k()I")
   public int method491() {
      return this.field244;
   }

   @deob.ObfuscatedName("aba.b(F)F")
   public float method492(float arg0) {
      return arg0;
   }

   @deob.ObfuscatedName("aba.r(F)F")
   public float method493(float arg0) {
      return arg0;
   }

   @deob.ObfuscatedName("aba.v()F")
   public float method508() {
      return 1.0F;
   }

   @deob.ObfuscatedName("aba.g()F")
   public float method495() {
      return 1.0F;
   }

   @deob.ObfuscatedName("aba.p()Z")
   public boolean method496() {
      return false;
   }

   @deob.ObfuscatedName("aba.o(ZZ)V")
   public void method497(boolean arg0, boolean arg1) {
   }

   @deob.ObfuscatedName("aba.a(IIII[III)V")
   public void method498(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      if (arg6 == 0) {
         arg6 = arg2;
      }

      this.field5576.method16470(this);
      if (arg2 != arg6) {
         OpenGL.glPixelStorei(3314, arg6);
      }

      OpenGL.glTexSubImage2Di(this.field5580, 0, arg0, arg1, arg2, arg3, 32993, this.field5576.field1418, arg4, arg5);
      if (arg2 != arg6) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   @deob.ObfuscatedName("aba.l(IIII[BLcn;II)V")
   public void method499(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class372 arg5, int arg6, int arg7) {
      if (arg7 == 0) {
         arg7 = arg2;
      }

      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3317, 1);
      if (arg2 != arg7) {
         OpenGL.glPixelStorei(3314, arg7);
      }

      OpenGL.glTexSubImage2Dub(this.field5580, 0, arg0, arg1, arg2, arg3, class214.method2900(arg5), 5121, arg4, arg6);
      if (arg2 != arg7) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   @deob.ObfuscatedName("aba.u(IIII[II)V")
   public void method535(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
      int[] var7 = new int[this.field245 * this.field244];
      this.field5576.method16470(this);
      OpenGL.glGetTexImagei(this.field5580, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < arg3; ++var8) {
         System.arraycopy(var7, (arg3 - 1 + arg1 - var8) * this.field245, arg4, arg2 * var8 + arg5, arg2);
      }

   }

   @deob.ObfuscatedName("aba.am(I)Ldm;")
   public class398 method500(int arg0) {
      return new class635(this, arg0);
   }

   @deob.ObfuscatedName("aba.h()Z")
   public boolean method501() {
      return super.method501();
   }

   @deob.ObfuscatedName("aba.aq()V")
   public void method502() {
      super.method502();
   }

   @deob.ObfuscatedName("aba.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }

   @deob.ObfuscatedName("aba.d()V")
   public void method302() {
      super.method302();
   }
}
