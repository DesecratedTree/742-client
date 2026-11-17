import jaggl.OpenGL;

@deob.ObfuscatedName("lj")
public abstract class class619 implements class536 {
   @deob.ObfuscatedName("lj.u")
   private class500 field5583 = class500.field4024;
   @deob.ObfuscatedName("lj.p")
   protected final class214 field5576;
   @deob.ObfuscatedName("lj.a")
   public final int field5580;
   @deob.ObfuscatedName("lj.x")
   protected final class372 field5574;
   @deob.ObfuscatedName("lj.s")
   protected final class405 field5581;
   @deob.ObfuscatedName("lj.l")
   private boolean field5582;
   @deob.ObfuscatedName("lj.v")
   private final int field5579;
   @deob.ObfuscatedName("lj.o")
   public int field5585;
   @deob.ObfuscatedName("lj.g")
   private static final int[] field5584 = new int[1];

   protected class619(class214 arg0, int arg1, class372 arg2, class405 arg3, int arg4, boolean arg5) {
      this.field5576 = arg0;
      this.field5580 = arg1;
      this.field5574 = arg2;
      this.field5581 = arg3;
      this.field5582 = arg5;
      this.field5579 = arg4;
      OpenGL.glGenTextures(1, field5584, 0);
      this.field5585 = field5584[0];
      this.method8927();
      this.method8930(0);
   }

   @deob.ObfuscatedName("lj.aq()V")
   public void method502() {
      int var1 = this.field5576.method16382();
      int var2 = this.field5576.field1428[var1];
      if (this.field5580 != var2) {
         if (var2 != 0) {
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
         }

         OpenGL.glEnable(this.field5580);
         this.field5576.field1428[var1] = this.field5580;
      }

      OpenGL.glBindTexture(this.field5580, this.field5585);
   }

   @deob.ObfuscatedName("lj.ar(Lhg;)V")
   public void method503(class500 arg0) {
      if (this.field5583 != arg0) {
         this.field5583 = arg0;
         this.method8927();
      }

   }

   @deob.ObfuscatedName("lj.bf()V")
   private void method8927() {
      this.field5576.method16470(this);
      if (class500.field4024 == this.field5583) {
         OpenGL.glTexParameteri(this.field5580, 10241, this.field5582 ? 9987 : 9729);
         OpenGL.glTexParameteri(this.field5580, 10240, 9729);
      } else {
         OpenGL.glTexParameteri(this.field5580, 10241, this.field5582 ? 9984 : 9728);
         OpenGL.glTexParameteri(this.field5580, 10240, 9728);
      }

   }

   @deob.ObfuscatedName("lj.h()Z")
   public boolean method501() {
      int var1 = this.method8931();
      this.field5576.method16470(this);
      OpenGL.glGenerateMipmapEXT(this.field5580);
      this.field5582 = true;
      this.method8927();
      this.method8930(var1);
      return true;
   }

   @deob.ObfuscatedName("lj.bp(III[I)V")
   protected void method8928(int arg0, int arg1, int arg2, int[] arg3) {
      if (arg1 > 0 && !class887.method15054(arg1)) {
         throw new IllegalArgumentException("");
      } else if (arg2 > 0 && !class887.method15054(arg2)) {
         throw new IllegalArgumentException("");
      } else if (class372.field2736 != this.field5574) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = 0;
         int var6 = arg1 < arg2 ? arg1 : arg2;
         int var7 = arg1 >> 1;
         int var8 = arg2 >> 1;
         int[] var9 = arg3;
         int[] var10 = new int[var7 * var8];

         while(true) {
            OpenGL.glTexImage2Di(arg0, var5, class214.method2903(this.field5574, this.field5581), arg1, arg2, 0, 32993, this.field5576.field1418, var9, 0);
            if (var6 <= 1) {
               return;
            }

            int var11 = 0;
            int var12 = 0;
            int var13 = arg1 + var12;

            for(int var14 = 0; var14 < var8; ++var14) {
               for(int var15 = 0; var15 < var7; ++var15) {
                  int var16 = var9[var12++];
                  int var17 = var9[var12++];
                  int var18 = var9[var13++];
                  int var19 = var9[var13++];
                  int var20 = var16 >> 24 & 255;
                  int var21 = var16 >> 16 & 255;
                  int var22 = var16 >> 8 & 255;
                  int var23 = var16 & 255;
                  int var24 = (var17 >> 24 & 255) + var20;
                  int var25 = (var17 >> 16 & 255) + var21;
                  int var26 = (var17 >> 8 & 255) + var22;
                  int var27 = (var17 & 255) + var23;
                  int var28 = (var18 >> 24 & 255) + var24;
                  int var29 = (var18 >> 16 & 255) + var25;
                  int var30 = (var18 >> 8 & 255) + var26;
                  int var31 = (var18 & 255) + var27;
                  int var32 = (var19 >> 24 & 255) + var28;
                  int var33 = (var19 >> 16 & 255) + var29;
                  int var34 = (var19 >> 8 & 255) + var30;
                  int var35 = (var19 & 255) + var31;
                  var10[var11++] = (var32 & 1020) << 22 | (var33 & 1020) << 14 | (var34 & 1020) << 6 | (var35 & 1020) >> 2;
               }

               var12 += arg1;
               var13 += arg1;
            }

            int[] var36 = var10;
            var10 = var9;
            var9 = var36;
            arg1 = var7;
            arg2 = var8;
            var7 >>= 1;
            var8 >>= 1;
            var6 >>= 1;
            ++var5;
         }
      }
   }

   @deob.ObfuscatedName("lj.bs(III[B)V")
   protected void method8932(int arg0, int arg1, int arg2, byte[] arg3) {
      if (arg1 > 0 && !class887.method15054(arg1)) {
         throw new IllegalArgumentException("");
      } else if (arg2 > 0 && !class887.method15054(arg2)) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = this.field5574.field2744;
         int var6 = 0;
         int var7 = arg1 < arg2 ? arg1 : arg2;
         int var8 = arg1 >> 1;
         int var9 = arg2 >> 1;
         byte[] var10 = arg3;
         byte[] var11 = new byte[var8 * var9 * var5];

         while(true) {
            OpenGL.glTexImage2Dub(arg0, var6, class214.method2903(this.field5574, this.field5581), arg1, arg2, 0, class214.method2900(this.field5574), 5121, var10, 0);
            if (var7 <= 1) {
               return;
            }

            int var12 = arg1 * var5;

            for(int var13 = 0; var13 < var5; ++var13) {
               int var14 = var13;
               int var15 = var13;
               int var16 = var12 + var13;

               for(int var17 = 0; var17 < var9; ++var17) {
                  for(int var18 = 0; var18 < var8; ++var18) {
                     byte var19 = var10[var15];
                     int var20 = var5 + var15;
                     int var21 = var10[var20] + var19;
                     var15 = var5 + var20;
                     int var22 = var10[var16] + var21;
                     int var23 = var5 + var16;
                     int var24 = var10[var23] + var22;
                     var16 = var5 + var23;
                     var11[var14] = (byte)(var24 >> 2);
                     var14 += var5;
                  }

                  var15 += var12;
                  var16 += var12;
               }
            }

            byte[] var25 = var11;
            var11 = var10;
            var10 = var25;
            arg1 = var8;
            arg2 = var9;
            var8 >>= 1;
            var9 >>= 1;
            var7 >>= 1;
            ++var6;
         }
      }
   }

   @deob.ObfuscatedName("lj.br(III[F)V")
   protected void method8929(int arg0, int arg1, int arg2, float[] arg3) {
      if (arg1 > 0 && !class887.method15054(arg1)) {
         throw new IllegalArgumentException("");
      } else if (arg2 > 0 && !class887.method15054(arg2)) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = this.field5574.field2744;
         int var6 = 0;
         int var7 = arg1 < arg2 ? arg1 : arg2;
         int var8 = arg1 >> 1;
         int var9 = arg2 >> 1;
         float[] var10 = arg3;
         float[] var11 = new float[var8 * var9 * var5];

         while(true) {
            OpenGL.glTexImage2Df(arg0, var6, class214.method2903(this.field5574, this.field5581), arg1, arg2, 0, class214.method2900(this.field5574), 5126, var10, 0);
            if (var7 <= 1) {
               return;
            }

            int var12 = arg1 * var5;

            for(int var13 = 0; var13 < var5; ++var13) {
               int var14 = var13;
               int var15 = var13;
               int var16 = var12 + var13;

               for(int var17 = 0; var17 < var9; ++var17) {
                  for(int var18 = 0; var18 < var8; ++var18) {
                     float var19 = var10[var15];
                     int var20 = var5 + var15;
                     float var21 = var10[var20] + var19;
                     var15 = var5 + var20;
                     float var22 = var10[var16] + var21;
                     int var23 = var5 + var16;
                     float var24 = var10[var23] + var22;
                     var16 = var5 + var23;
                     var11[var14] = var24 * 0.25F;
                     var14 += var5;
                  }

                  var15 += var12;
                  var16 += var12;
               }
            }

            float[] var25 = var11;
            var11 = var10;
            var10 = var25;
            arg1 = var8;
            arg2 = var9;
            var8 >>= 1;
            var9 >>= 1;
            var7 >>= 1;
            ++var6;
         }
      }
   }

   @deob.ObfuscatedName("lj.ba(I)V")
   private void method8930(int arg0) {
      this.field5576.field10017 -= arg0;
      this.field5576.field10017 += this.method8931();
   }

   @deob.ObfuscatedName("lj.bg()I")
   private int method8931() {
      int var1 = this.field5581.field3055 * this.field5574.field2744 * this.field5579;
      return this.field5582 ? var1 * 4 / 3 : var1;
   }

   @deob.ObfuscatedName("lj.d()V")
   public void method302() {
      if (this.field5585 > 0) {
         this.field5576.method2921(this.field5585, this.method8931());
         this.field5585 = 0;
      }

   }

   public void finalize() throws Throwable {
      this.method302();
      super.finalize();
   }
}
