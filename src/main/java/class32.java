import jaggl.OpenGL;

@deob.ObfuscatedName("abc")
public class class32 extends class619 implements class529 {
   @deob.ObfuscatedName("abc.h")
   private final int field257;
   @deob.ObfuscatedName("abc.e")
   private final int field256;

   public class32(class214 arg0, class372 arg1, class405 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
      this.field257 = arg3;
      this.field256 = arg4;
      this.field5576.method16470(this);
      OpenGL.glTexImage2Dub(this.field5580, 0, class214.method2903(this.field5574, this.field5581), arg3, arg4, 0, class214.method2900(this.field5574), class214.method2918(this.field5581), (byte[])null, 0);
   }

   public class32(class214 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class372.field2736, class405.field3052, arg1 * arg2, arg3);
      this.field257 = arg1;
      this.field256 = arg2;
      this.field5576.method16470(this);
      if (arg3 && arg6 == 0 && arg5 == 0) {
         this.method8928(this.field5580, arg1, arg2, arg4);
      } else {
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Di(this.field5580, 0, 6408, this.field257, this.field256, 0, 32993, this.field5576.field1418, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public class32(class214 arg0, class372 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class405.field3052, arg2 * arg3, arg4);
      this.field257 = arg2;
      this.field256 = arg3;
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3317, 1);
      if (arg4 && arg7 == 0 && arg6 == 0) {
         this.method8932(this.field5580, arg2, arg3, arg5);
      } else {
         OpenGL.glPixelStorei(3314, arg7);
         class372 var10001 = this.field5574;
         if (this.field5574 == class372.field2741) {
            OpenGL.glCompressedTexImage2Dub(this.field5580, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
         } else {
            var10001 = this.field5574;
            if (this.field5574 == class372.field2742) {
               OpenGL.glCompressedTexImage2Dub(this.field5580, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
            } else {
               OpenGL.glTexImage2Dub(this.field5580, 0, class214.method2903(this.field5574, this.field5581), arg2, arg3, 0, class214.method2900(this.field5574), 5121, arg5, arg6);
            }
         }

         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   public class32(class214 arg0, class372 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class405.field3057, arg2 * arg3, arg4);
      this.field257 = arg2;
      this.field256 = arg3;
      this.field5576.method16470(this);
      if (arg4 && arg7 == 0 && arg6 == 0) {
         this.method8929(this.field5580, arg2, arg3, arg5);
      } else {
         OpenGL.glPixelStorei(3314, arg7);
         OpenGL.glTexImage2Df(this.field5580, 0, class214.method2903(this.field5574, this.field5581), arg2, arg3, 0, class214.method2900(this.field5574), 5126, arg5, arg6 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   @deob.ObfuscatedName("abc.n()I")
   public int method507() {
      return this.field257;
   }

   @deob.ObfuscatedName("abc.k()I")
   public int method491() {
      return this.field256;
   }

   @deob.ObfuscatedName("abc.b(F)F")
   public float method492(float arg0) {
      return arg0 / (float)this.field257;
   }

   @deob.ObfuscatedName("abc.r(F)F")
   public float method493(float arg0) {
      return arg0 / (float)this.field256;
   }

   @deob.ObfuscatedName("abc.v()F")
   public float method508() {
      return 1.0F;
   }

   @deob.ObfuscatedName("abc.g()F")
   public float method495() {
      return 1.0F;
   }

   @deob.ObfuscatedName("abc.p()Z")
   public boolean method496() {
      return true;
   }

   @deob.ObfuscatedName("abc.o(ZZ)V")
   public void method497(boolean arg0, boolean arg1) {
      this.field5576.method16470(this);
      OpenGL.glTexParameteri(this.field5580, 10242, arg0 ? 10497 : 33071);
      OpenGL.glTexParameteri(this.field5580, 10243, arg1 ? 10497 : 33071);
   }

   @deob.ObfuscatedName("abc.a(IIII[III)V")
   public void method498(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3314, arg6);
      OpenGL.glTexSubImage2Di(this.field5580, 0, arg0, arg1, arg2, arg3, 32993, this.field5576.field1418, arg4, arg5);
      OpenGL.glPixelStorei(3314, 0);
   }

   @deob.ObfuscatedName("abc.l(IIII[BLcn;II)V")
   public void method499(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class372 arg5, int arg6, int arg7) {
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, arg7);
      OpenGL.glTexSubImage2Dub(this.field5580, 0, arg0, arg1, arg2, arg3, class214.method2900(arg5), 5121, arg4, arg6);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   @deob.ObfuscatedName("abc.bn(IIII[FLcn;II)V")
   public void method571(int arg0, int arg1, int arg2, int arg3, float[] arg4, class372 arg5, int arg6, int arg7) {
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3314, arg7);
      OpenGL.glTexSubImage2Df(this.field5580, 0, arg0, arg1, arg2, arg3, class214.method2900(arg5), 5121, arg4, arg6);
      OpenGL.glPixelStorei(3314, 0);
   }

   @deob.ObfuscatedName("abc.u(IIII[II)V")
   public void method535(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
      int[] var7 = new int[this.field257 * this.field256];
      this.field5576.method16470(this);
      OpenGL.glGetTexImagei(this.field5580, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < arg3; ++var8) {
         System.arraycopy(var7, (arg3 - 1 + arg1 - var8) * this.field257, arg4, arg2 * var8 + arg5, arg2);
      }

   }

   @deob.ObfuscatedName("abc.am(I)Ldm;")
   public class398 method500(int arg0) {
      return new class615(this, arg0);
   }

   @deob.ObfuscatedName("abc.h()Z")
   public boolean method501() {
      return super.method501();
   }

   @deob.ObfuscatedName("abc.aq()V")
   public void method502() {
      super.method502();
   }

   @deob.ObfuscatedName("abc.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }

   @deob.ObfuscatedName("abc.d()V")
   public void method302() {
      super.method302();
   }
}
