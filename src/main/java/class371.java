import jaggl.OpenGL;

@deob.ObfuscatedName("cm")
public class class371 {
   @deob.ObfuscatedName("cm.n")
   private final class983 field2727;
   @deob.ObfuscatedName("cm.k")
   private final class976 field2725;
   @deob.ObfuscatedName("cm.d")
   public final int field2726;
   @deob.ObfuscatedName("cm.b")
   private final int field2730;
   @deob.ObfuscatedName("cm.r")
   public final byte[] field2724;
   @deob.ObfuscatedName("cm.a")
   private final int field2731;
   @deob.ObfuscatedName("cm.p")
   private final int field2732;
   @deob.ObfuscatedName("cm.o")
   private final int field2729;
   @deob.ObfuscatedName("cm.x")
   private class334[][] field2728;

   public class371(class983 arg0, class976 arg1) {
      this.field2727 = arg0;
      this.field2725 = arg1;
      this.field2726 = (this.field2725.field9463 * this.field2725.field9460 >> this.field2727.field10264) + 2;
      this.field2730 = (this.field2725.field9461 * this.field2725.field9460 >> this.field2727.field10264) + 2;
      this.field2724 = new byte[this.field2730 * this.field2726];
      this.field2731 = this.field2727.field10264 + 7 - this.field2725.field9464;
      this.field2732 = this.field2725.field9463 >> this.field2731;
      this.field2729 = this.field2725.field9461 >> this.field2731;
   }

   @deob.ObfuscatedName("cm.n()V")
   public void method5011() {
      this.field2728 = new class334[this.field2732][this.field2729];

      for(int var1 = 0; var1 < this.field2729; ++var1) {
         for(int var2 = 0; var2 < this.field2732; ++var2) {
            this.field2728[var2][var1] = new class334(this.field2727, this, this.field2725, var2, var1, this.field2731, var2 * 128 + 1, var1 * 128 + 1);
         }
      }

   }

   @deob.ObfuscatedName("cm.k(III[[ZZ)V")
   public void method5012(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
      this.field2727.method16610(false);
      this.field2727.method16714(false);
      this.field2727.method16617(-2);
      this.field2727.method16640(1);
      this.field2727.method16652(1);
      float var6 = 1.0F / (float)(this.field2727.field10263 * 128);
      if (arg4) {
         for(int var7 = 0; var7 < this.field2729; ++var7) {
            int var8 = var7 << this.field2731;
            int var9 = var7 + 1 << this.field2731;

            label128:
            for(int var10 = 0; var10 < this.field2732; ++var10) {
               int var11 = var10 << this.field2731;
               int var12 = var10 + 1 << this.field2731;

               for(int var13 = var11; var13 < var12; ++var13) {
                  if (var13 - arg0 >= -arg2 && var13 - arg0 <= arg2) {
                     for(int var14 = var8; var14 < var9; ++var14) {
                        if (var14 - arg1 >= -arg2 && var14 - arg1 <= arg2 && arg3[var13 - arg0 + arg2][var14 - arg1 + arg2]) {
                           OpenGL.glMatrixMode(5890);
                           OpenGL.glLoadIdentity();
                           OpenGL.glScalef(var6, var6, 1.0F);
                           OpenGL.glTranslatef((float)(-var10) / var6, (float)(-var7) / var6, 1.0F);
                           OpenGL.glMatrixMode(5888);
                           this.field2728[var10][var7].method4125();
                           continue label128;
                        }
                     }
                  }
               }
            }
         }
      } else {
         for(int var15 = 0; var15 < this.field2729; ++var15) {
            int var16 = var15 << this.field2731;
            int var17 = var15 + 1 << this.field2731;

            for(int var18 = 0; var18 < this.field2732; ++var18) {
               int var19 = 0;
               int var20 = var18 << this.field2731;
               int var21 = var18 + 1 << this.field2731;
               class268 var22 = this.field2727.field10296;
               var22.field935 = 0;

               for(int var23 = var16; var23 < var17; ++var23) {
                  if (var23 - arg1 >= -arg2 && var23 - arg1 <= arg2) {
                     int var24 = this.field2725.field9463 * var23 + var20;

                     for(int var25 = var20; var25 < var21; ++var25) {
                        if (var25 - arg0 >= -arg2 && var25 - arg0 <= arg2 && arg3[var25 - arg0 + arg2][var23 - arg1 + arg2]) {
                           short[] var26 = this.field2725.field9893[var24];
                           if (var26 != null) {
                              if (this.field2727.field10274) {
                                 for(int var27 = 0; var27 < var26.length; ++var27) {
                                    var22.method1569(var26[var27] & 65535);
                                    ++var19;
                                 }
                              } else {
                                 for(int var28 = 0; var28 < var26.length; ++var28) {
                                    var22.method1668(var26[var28] & 65535);
                                    ++var19;
                                 }
                              }
                           }
                        }

                        ++var24;
                     }
                  }
               }

               if (var19 > 0) {
                  OpenGL.glMatrixMode(5890);
                  OpenGL.glLoadIdentity();
                  OpenGL.glScalef(var6, var6, 1.0F);
                  OpenGL.glTranslatef((float)(-var18) / var6, (float)(-var15) / var6, 1.0F);
                  OpenGL.glMatrixMode(5888);
                  this.field2728[var18][var15].method4126(var22.field931, var19);
               }
            }
         }
      }

      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
   }

   @deob.ObfuscatedName("cm.d(Lna;II)V")
   public void method5013(class664 arg0, int arg1, int arg2) {
      class308 var4 = (class308)arg0;
      int var5 = var4.field1924 + 1 + arg1;
      int var6 = var4.field1922 + 1 + arg2;
      int var7 = this.field2726 * var6 + var5;
      int var8 = 0;
      int var9 = var4.field1921;
      int var10 = var4.field1920;
      int var11 = this.field2726 - var10;
      int var12 = 0;
      if (var6 <= 0) {
         int var13 = 1 - var6;
         var9 -= var13;
         var8 += var10 * var13;
         var7 += this.field2726 * var13;
         var6 = 1;
      }

      if (var6 + var9 >= this.field2730) {
         int var14 = var6 + var9 + 1 - this.field2730;
         var9 -= var14;
      }

      if (var5 <= 0) {
         int var15 = 1 - var5;
         var10 -= var15;
         var8 += var15;
         var7 += var15;
         var12 += var15;
         var11 += var15;
         var5 = 1;
      }

      if (var5 + var10 >= this.field2726) {
         int var16 = var5 + var10 + 1 - this.field2726;
         var10 -= var16;
         var12 += var16;
         var11 += var16;
      }

      if (var10 > 0 && var9 > 0) {
         method5010(this.field2724, var4.field1923, var8, var7, var10, var9, var11, var12);
         this.method5016(var5, var6, var10, var9);
      }
   }

   @deob.ObfuscatedName("cm.b(Lna;II)V")
   public void method5014(class664 arg0, int arg1, int arg2) {
      class308 var4 = (class308)arg0;
      int var5 = var4.field1924 + 1 + arg1;
      int var6 = var4.field1922 + 1 + arg2;
      int var7 = this.field2726 * var6 + var5;
      int var8 = 0;
      int var9 = var4.field1921;
      int var10 = var4.field1920;
      int var11 = this.field2726 - var10;
      int var12 = 0;
      if (var6 <= 0) {
         int var13 = 1 - var6;
         var9 -= var13;
         var8 += var10 * var13;
         var7 += this.field2726 * var13;
         var6 = 1;
      }

      if (var6 + var9 >= this.field2730) {
         int var14 = var6 + var9 + 1 - this.field2730;
         var9 -= var14;
      }

      if (var5 <= 0) {
         int var15 = 1 - var5;
         var10 -= var15;
         var8 += var15;
         var7 += var15;
         var12 += var15;
         var11 += var15;
         var5 = 1;
      }

      if (var5 + var10 >= this.field2726) {
         int var16 = var5 + var10 + 1 - this.field2726;
         var10 -= var16;
         var12 += var16;
         var11 += var16;
      }

      if (var10 > 0 && var9 > 0) {
         method5018(this.field2724, var4.field1923, var8, var7, var10, var9, var11, var12);
         this.method5016(var5, var6, var10, var9);
      }
   }

   @deob.ObfuscatedName("cm.r(Lna;II)Z")
   public boolean method5015(class664 arg0, int arg1, int arg2) {
      class308 var4 = (class308)arg0;
      int var5 = var4.field1924 + 1 + arg1;
      int var6 = var4.field1922 + 1 + arg2;
      int var7 = this.field2726 * var6 + var5;
      int var8 = var4.field1921;
      int var9 = var4.field1920;
      int var10 = this.field2726 - var9;
      if (var6 <= 0) {
         int var11 = 1 - var6;
         var8 -= var11;
         var7 += this.field2726 * var11;
         var6 = 1;
      }

      if (var6 + var8 >= this.field2730) {
         int var12 = var6 + var8 + 1 - this.field2730;
         var8 -= var12;
      }

      if (var5 <= 0) {
         int var13 = 1 - var5;
         var9 -= var13;
         var7 += var13;
         var10 += var13;
         var5 = 1;
      }

      if (var5 + var9 >= this.field2726) {
         int var14 = var5 + var9 + 1 - this.field2726;
         var9 -= var14;
         var10 += var14;
      }

      if (var9 > 0 && var8 > 0) {
         byte var15 = 8;
         int var16 = (var15 - 1) * this.field2726 + var10;
         return method5019(this.field2724, var7, var9, var8, var16, var15);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("cm.p(IIII)V")
   private void method5016(int arg0, int arg1, int arg2, int arg3) {
      if (this.field2728 != null) {
         int var5 = arg0 - 1 >> 7;
         int var6 = arg0 - 1 + arg2 - 1 >> 7;
         int var7 = arg1 - 1 >> 7;
         int var8 = arg1 - 1 + arg3 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            class334[] var10 = this.field2728[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               var10[var11].field2117 = true;
            }
         }

      }
   }

   @deob.ObfuscatedName("cm.o([B[BIIIIII)V")
   private static final void method5010(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      int var8 = -(arg4 >> 2);
      int var9 = -(arg4 & 3);

      for(int var10 = -arg5; var10 < 0; ++var10) {
         int var10001;
         for(int var11 = var8; var11 < 0; ++var11) {
            var10001 = arg3++;
            arg0[var10001] += arg1[arg2++];
            int var13 = arg3++;
            arg0[var13] += arg1[arg2++];
            int var14 = arg3++;
            arg0[var14] += arg1[arg2++];
            int var15 = arg3++;
            arg0[var15] += arg1[arg2++];
         }

         for(int var12 = var9; var12 < 0; ++var12) {
            var10001 = arg3++;
            arg0[var10001] += arg1[arg2++];
         }

         arg3 += arg6;
         arg2 += arg7;
      }

   }

   @deob.ObfuscatedName("cm.a([B[BIIIIII)V")
   private static final void method5018(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      int var8 = -(arg4 >> 2);
      int var9 = -(arg4 & 3);

      for(int var10 = -arg5; var10 < 0; ++var10) {
         int var10001;
         for(int var11 = var8; var11 < 0; ++var11) {
            var10001 = arg3++;
            arg0[var10001] -= arg1[arg2++];
            int var13 = arg3++;
            arg0[var13] -= arg1[arg2++];
            int var14 = arg3++;
            arg0[var14] -= arg1[arg2++];
            int var15 = arg3++;
            arg0[var15] -= arg1[arg2++];
         }

         for(int var12 = var9; var12 < 0; ++var12) {
            var10001 = arg3++;
            arg0[var10001] -= arg1[arg2++];
         }

         arg3 += arg6;
         arg2 += arg7;
      }

   }

   @deob.ObfuscatedName("cm.x([BIIIII)Z")
   private static final boolean method5019(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = arg2 % arg5;
      int var7;
      if (var6 != 0) {
         var7 = arg5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((arg3 + arg5 - 1) / arg5);
      int var9 = -((arg2 + arg5 - 1) / arg5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if (arg0[arg1] == 0) {
               return true;
            }

            arg1 += arg5;
         }

         int var12 = arg1 - var7;
         if (arg0[var12 - 1] == 0) {
            return true;
         }

         arg1 = arg4 + var12;
      }

      return false;
   }
}
