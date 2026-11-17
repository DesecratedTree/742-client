import jaggl.OpenGL;

@deob.ObfuscatedName("xf")
public class class939 extends class354 {
   @deob.ObfuscatedName("xf.e")
   public final int field9486;
   @deob.ObfuscatedName("xf.z")
   public final int field9485;

   public class939(class983 arg0, int arg1, class372 arg2, class405 arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4 * arg5, false);
      this.field9486 = arg4;
      this.field9485 = arg5;
      this.field2264.method16639(this);
      OpenGL.glTexImage2Dub(this.field2263, 0, class983.method16696(this.field2270, this.field2273), arg4, arg5, 0, class983.method16659(this.field2270), 5121, (byte[])null, 0);
      this.method2448(true);
   }

   protected class939(class983 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, class372.field2733, class405.field3052, arg4 * arg5, false);
      this.field9486 = arg4;
      this.field9485 = arg5;
      this.field2264.method16639(this);
      class403 var7 = this.field2264.method11517();
      if (var7 != null) {
         int var8 = var7.method559() - (arg3 + arg5);
         int var9 = class983.method16696(this.field2270, this.field2273);
         OpenGL.glCopyTexImage2D(this.field2263, 0, var9, arg2, var8, arg4, arg5, 0);
      }

      this.method2448(true);
   }

   public class939(class983 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, boolean arg8) {
      super(arg0, arg1, class372.field2736, class405.field3052, arg2 * arg3, arg4);
      this.field9486 = arg2;
      this.field9485 = arg3;
      if (arg8) {
         int[] var10 = new int[arg5.length];

         for(int var11 = 0; var11 < arg3; ++var11) {
            int var12 = arg2 * var11;
            int var13 = (arg3 - var11 - 1) * arg2;

            for(int var14 = 0; var14 < arg2; ++var14) {
               var10[var12++] = arg5[var13++];
            }
         }

         arg5 = var10;
      }

      this.field2264.method16639(this);
      if (this.field2263 != 34037 && arg4 && arg6 == 0 && arg7 == 0) {
         method4283(this.field2263, class983.method16696(this.field2270, this.field2273), this.field9486, this.field9485, 32993, this.field2264.field10387, arg5);
         this.method4278(true);
      } else {
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Di(this.field2263, 0, class983.method16696(this.field2270, this.field2273), this.field9486, this.field9485, 0, 32993, this.field2264.field10387, arg5, arg7 * 4);
         OpenGL.glPixelStorei(3314, 0);
         this.method4278(false);
      }

      this.method2448(true);
   }

   public class939(class983 arg0, int arg1, class372 arg2, class405 arg3, int arg4, int arg5, boolean arg6, byte[] arg7, class372 arg8, boolean arg9) {
      super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
      this.field9486 = arg4;
      this.field9485 = arg5;
      if (arg9) {
         byte[] var11 = new byte[arg7.length];

         for(int var12 = 0; var12 < arg5; ++var12) {
            int var13 = arg4 * var12;
            int var14 = (arg5 - var12 - 1) * arg4;

            for(int var15 = 0; var15 < arg4; ++var15) {
               var11[var13++] = arg7[var14++];
            }
         }

         arg7 = var11;
      }

      this.field2264.method16639(this);
      OpenGL.glPixelStorei(3317, 1);
      if (arg6 && this.field2263 != 34037) {
         method4294(arg1, class983.method16696(this.field2270, this.field2273), arg4, arg5, arg8, arg7);
         this.method4278(true);
      } else {
         OpenGL.glTexImage2Dub(this.field2263, 0, class983.method16696(this.field2270, this.field2273), this.field9486, this.field9485, 0, class983.method16659(arg8), 5121, arg7, 0);
         this.method4278(false);
      }

      OpenGL.glPixelStorei(3317, 4);
      this.method2448(true);
   }

   public class939(class983 arg0, int arg1, class372 arg2, class405 arg3, int arg4, int arg5, boolean arg6, float[] arg7, class372 arg8) {
      super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
      this.field9486 = arg4;
      this.field9485 = arg5;
      this.field2264.method16639(this);
      if (arg6 && this.field2263 != 34037) {
         method4285(arg1, class983.method16696(this.field2270, this.field2273), arg4, arg5, arg8, arg7);
         this.method4278(true);
      } else {
         OpenGL.glTexImage2Df(this.field2263, 0, class983.method16696(this.field2270, this.field2273), this.field9486, this.field9485, 0, class983.method16659(arg8), 5126, arg7, 0);
         this.method4278(false);
      }

      this.method2448(true);
   }

   @deob.ObfuscatedName("xf.af(ZZ)V")
   public void method15984(boolean arg0, boolean arg1) {
      if (this.field2263 == 3553) {
         this.field2264.method16639(this);
         OpenGL.glTexParameteri(this.field2263, 10242, arg0 ? 10497 : 33071);
         OpenGL.glTexParameteri(this.field2263, 10243, arg1 ? 10497 : 33071);
      }

   }

   @deob.ObfuscatedName("xf.at(IIII[BLcn;IIZ)V")
   public void method15983(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class372 arg5, int arg6, int arg7, boolean arg8) {
      if (arg7 == 0) {
         arg7 = arg2;
      }

      if (arg8) {
         int var10 = arg5.field2744;
         int var11 = arg2 * var10;
         int var12 = arg7 * var10;
         byte[] var13 = new byte[arg3 * var11];

         for(int var14 = 0; var14 < arg3; ++var14) {
            int var15 = var11 * var14;
            int var16 = (arg3 - var14 - 1) * var12 + arg6;

            for(int var17 = 0; var17 < var11; ++var17) {
               var13[var15++] = arg4[var16++];
            }
         }

         arg4 = var13;
      }

      this.field2264.method16639(this);
      OpenGL.glPixelStorei(3317, 1);
      if (arg2 != arg7) {
         OpenGL.glPixelStorei(3314, arg7);
      }

      OpenGL.glTexSubImage2Dub(this.field2263, 0, arg0, this.field9485 - arg1 - arg3, arg2, arg3, class983.method16659(arg5), 5121, arg4, arg6);
      if (arg2 != arg7) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   @deob.ObfuscatedName("xf.ah(IIII[IIIZ)V")
   public void method15985(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
      if (arg6 == 0) {
         arg6 = arg2;
      }

      if (arg7) {
         int[] var9 = new int[arg2 * arg3];

         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg2 * var10;
            int var12 = (arg3 - var10 - 1) * arg6 + arg5;

            for(int var13 = 0; var13 < arg2; ++var13) {
               var9[var11++] = arg4[var12++];
            }
         }

         arg4 = var9;
      }

      this.field2264.method16639(this);
      if (arg2 != arg6) {
         OpenGL.glPixelStorei(3314, arg6);
      }

      OpenGL.glTexSubImage2Di(this.field2263, 0, arg0, this.field9485 - arg1 - arg3, arg2, arg3, 32993, this.field2264.field10387, arg4, arg5);
      if (arg2 != arg6) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   @deob.ObfuscatedName("xf.aw(IIIIII)V")
   public void method15982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      class403 var7 = this.field2264.method11517();
      if (var7 != null) {
         int var8 = var7.method559() - (arg3 + arg5);
         this.field2264.method16639(this);
         OpenGL.glCopyTexSubImage2D(this.field2263, 0, arg0, this.field9485 - (arg1 + arg3), arg4, var8, arg2, arg3);
         OpenGL.glFlush();
      }

   }

   @deob.ObfuscatedName("xf.al(I)Ldh;")
   public class393 method15997(int arg0) {
      return new class362(this, arg0);
   }

   @deob.ObfuscatedName("xf.an(I)Ldm;")
   public class398 method15995(int arg0) {
      return new class362(this, arg0);
   }
}
