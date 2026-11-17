import jaggl.OpenGL;

@deob.ObfuscatedName("bw")
public abstract class class354 {
   @deob.ObfuscatedName("bw.v")
   private boolean field2275 = false;
   @deob.ObfuscatedName("bw.o")
   protected final class983 field2264;
   @deob.ObfuscatedName("bw.x")
   public final int field2263;
   @deob.ObfuscatedName("bw.s")
   protected final class372 field2270;
   @deob.ObfuscatedName("bw.l")
   protected final class405 field2273;
   @deob.ObfuscatedName("bw.u")
   private boolean field2274;
   @deob.ObfuscatedName("bw.g")
   private final int field2276;
   @deob.ObfuscatedName("bw.a")
   public int field2271;
   @deob.ObfuscatedName("bw.h")
   private static final int[] field2277 = new int[1];

   protected class354(class983 arg0, int arg1, class372 arg2, class405 arg3, int arg4, boolean arg5) {
      this.field2264 = arg0;
      this.field2263 = arg1;
      this.field2270 = arg2;
      this.field2273 = arg3;
      this.field2274 = arg5;
      this.field2276 = arg4;
      OpenGL.glGenTextures(1, field2277, 0);
      this.field2271 = field2277[0];
      this.method4282(0);
   }

   @deob.ObfuscatedName("bw.n(Z)V")
   public void method2448(boolean arg0) {
      if (this.field2275 != arg0) {
         this.field2275 = arg0;
         this.method4292();
      }

   }

   @deob.ObfuscatedName("bw.k()V")
   private void method4292() {
      this.field2264.method16639(this);
      if (this.field2275) {
         OpenGL.glTexParameteri(this.field2263, 10241, this.field2274 ? 9987 : 9729);
         OpenGL.glTexParameteri(this.field2263, 10240, 9729);
      } else {
         OpenGL.glTexParameteri(this.field2263, 10241, this.field2274 ? 9984 : 9728);
         OpenGL.glTexParameteri(this.field2263, 10240, 9728);
      }

   }

   @deob.ObfuscatedName("bw.d()Z")
   public boolean method4277() {
      if (this.field2264.field10331) {
         int var1 = this.method4276();
         this.field2264.method16639(this);
         OpenGL.glGenerateMipmapEXT(this.field2263);
         this.field2274 = true;
         this.method4292();
         this.method4282(var1);
         return true;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("bw.b(Z)V")
   protected void method4278(boolean arg0) {
      if (this.field2274 != arg0) {
         int var2 = this.method4276();
         this.field2274 = true;
         this.method4292();
         this.method4282(var2);
      }

   }

   @deob.ObfuscatedName("bw.r()V")
   public void method4279() {
      if (this.field2271 > 0) {
         this.field2264.field10268 -= this.method4276();
         int[] var1 = new int[]{this.field2271};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.field2271 = 0;
      }

   }

   @deob.ObfuscatedName("bw.p()V")
   public void method4280() {
      if (this.field2271 > 0) {
         this.field2264.method16655(this.field2271, this.method4276());
         this.field2271 = 0;
      }

   }

   public void finalize() throws Throwable {
      this.method4280();
      super.finalize();
   }

   @deob.ObfuscatedName("bw.o(I)V")
   private void method4282(int arg0) {
      this.field2264.field10268 -= arg0;
      this.field2264.field10268 += this.method4276();
   }

   @deob.ObfuscatedName("bw.a()I")
   private int method4276() {
      int var1 = this.field2273.field3055 * this.field2270.field2744 * this.field2276;
      return this.field2274 ? var1 * 4 / 3 : var1;
   }

   @deob.ObfuscatedName("bw.x(IIIIII[I)V")
   protected static void method4283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
      if (arg2 > 0 && !class887.method15054(arg2)) {
         throw new IllegalArgumentException("");
      } else if (arg3 > 0 && !class887.method15054(arg3)) {
         throw new IllegalArgumentException("");
      } else if (arg4 != 32993) {
         throw new IllegalArgumentException("");
      } else {
         int var7 = 0;
         int var8 = arg2 < arg3 ? arg2 : arg3;
         int var9 = arg2 >> 1;
         int var10 = arg3 >> 1;
         int[] var11 = arg6;
         int[] var12 = new int[var9 * var10];

         while(true) {
            OpenGL.glTexImage2Di(arg0, var7, arg1, arg2, arg3, 0, arg4, arg5, var11, 0);
            if (var8 <= 1) {
               return;
            }

            int var13 = 0;
            int var14 = 0;
            int var15 = arg2 + var14;

            for(int var16 = 0; var16 < var10; ++var16) {
               for(int var17 = 0; var17 < var9; ++var17) {
                  int var18 = var11[var14++];
                  int var19 = var11[var14++];
                  int var20 = var11[var15++];
                  int var21 = var11[var15++];
                  int var22 = var18 >> 24 & 255;
                  int var23 = var18 >> 16 & 255;
                  int var24 = var18 >> 8 & 255;
                  int var25 = var18 & 255;
                  int var26 = (var19 >> 24 & 255) + var22;
                  int var27 = (var19 >> 16 & 255) + var23;
                  int var28 = (var19 >> 8 & 255) + var24;
                  int var29 = (var19 & 255) + var25;
                  int var30 = (var20 >> 24 & 255) + var26;
                  int var31 = (var20 >> 16 & 255) + var27;
                  int var32 = (var20 >> 8 & 255) + var28;
                  int var33 = (var20 & 255) + var29;
                  int var34 = (var21 >> 24 & 255) + var30;
                  int var35 = (var21 >> 16 & 255) + var31;
                  int var36 = (var21 >> 8 & 255) + var32;
                  int var37 = (var21 & 255) + var33;
                  var12[var13++] = (var34 & 1020) << 22 | (var35 & 1020) << 14 | (var36 & 1020) << 6 | (var37 & 1020) >> 2;
               }

               var14 += arg2;
               var15 += arg2;
            }

            int[] var38 = var12;
            var12 = var11;
            var11 = var38;
            arg2 = var9;
            arg3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   @deob.ObfuscatedName("bw.s(IIIILcn;[B)V")
   protected static void method4294(int arg0, int arg1, int arg2, int arg3, class372 arg4, byte[] arg5) {
      if (arg2 > 0 && !class887.method15054(arg2)) {
         throw new IllegalArgumentException("");
      } else if (arg3 > 0 && !class887.method15054(arg3)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = arg4.field2744;
         int var7 = 0;
         int var8 = arg2 < arg3 ? arg2 : arg3;
         int var9 = arg2 >> 1;
         int var10 = arg3 >> 1;
         byte[] var11 = arg5;
         byte[] var12 = new byte[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Dub(arg0, var7, arg1, arg2, arg3, 0, class983.method16659(arg4), 5121, var11, 0);
            if (var8 <= 1) {
               return;
            }

            int var13 = arg2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var13 + var14;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     byte var20 = var11[var16];
                     int var21 = var6 + var16;
                     int var22 = var11[var21] + var20;
                     var16 = var6 + var21;
                     int var23 = var11[var17] + var22;
                     int var24 = var6 + var17;
                     int var25 = var11[var24] + var23;
                     var17 = var6 + var24;
                     var12[var15] = (byte)(var25 >> 2);
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            byte[] var26 = var12;
            var12 = var11;
            var11 = var26;
            arg2 = var9;
            arg3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   @deob.ObfuscatedName("bw.l(IIIILcn;[F)V")
   protected static void method4285(int arg0, int arg1, int arg2, int arg3, class372 arg4, float[] arg5) {
      if (arg2 > 0 && !class887.method15054(arg2)) {
         throw new IllegalArgumentException("");
      } else if (arg3 > 0 && !class887.method15054(arg3)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = arg4.field2744;
         int var7 = 0;
         int var8 = arg2 < arg3 ? arg2 : arg3;
         int var9 = arg2 >> 1;
         int var10 = arg3 >> 1;
         float[] var11 = arg5;
         float[] var12 = new float[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Df(arg0, var7, arg1, arg2, arg3, 0, class983.method16659(arg4), 5126, var11, 0);
            if (var8 <= 1) {
               return;
            }

            int var13 = arg2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var13 + var14;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     float var20 = var11[var16];
                     int var21 = var6 + var16;
                     float var22 = var11[var21] + var20;
                     var16 = var6 + var21;
                     float var23 = var11[var17] + var22;
                     int var24 = var6 + var17;
                     float var25 = var11[var24] + var23;
                     var17 = var6 + var24;
                     var12[var15] = var25 * 0.25F;
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            float[] var26 = var12;
            var12 = var11;
            var11 = var26;
            arg2 = var9;
            arg3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }
}
