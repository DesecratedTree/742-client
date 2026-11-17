import java.nio.ByteBuffer;

@deob.ObfuscatedName("hz")
public class class519 {
   @deob.ObfuscatedName("hz.n")
   private final class979 field4118;
   @deob.ObfuscatedName("hz.k")
   private final class970 field4119;
   @deob.ObfuscatedName("hz.d")
   public final int field4120;
   @deob.ObfuscatedName("hz.b")
   private final int field4121;
   @deob.ObfuscatedName("hz.r")
   public final byte[] field4122;
   @deob.ObfuscatedName("hz.a")
   private final int field4124;
   @deob.ObfuscatedName("hz.p")
   private final int field4123;
   @deob.ObfuscatedName("hz.o")
   private final int field4125;
   @deob.ObfuscatedName("hz.x")
   private class498[][] field4126;

   public class519(class979 arg0, class970 arg1) {
      this.field4118 = arg0;
      this.field4119 = arg1;
      this.field4120 = (this.field4119.field9463 * this.field4119.field9460 >> this.field4118.field10057) + 2;
      this.field4121 = (this.field4119.field9461 * this.field4119.field9460 >> this.field4118.field10057) + 2;
      this.field4122 = new byte[this.field4121 * this.field4120];
      this.field4124 = this.field4118.field10057 + 7 - this.field4119.field9464;
      this.field4123 = this.field4119.field9463 >> this.field4124;
      this.field4125 = this.field4119.field9461 >> this.field4124;
   }

   @deob.ObfuscatedName("hz.n()V")
   public void method7213() {
      this.field4126 = new class498[this.field4123][this.field4125];

      for(int var1 = 0; var1 < this.field4125; ++var1) {
         for(int var2 = 0; var2 < this.field4123; ++var2) {
            this.field4126[var2][var1] = new class498(this.field4118, this, this.field4119, var2, var1, this.field4124, var2 * 128 + 1, var1 * 128 + 1);
            if (this.field4126[var2][var1].field4015 == 0) {
               this.field4126[var2][var1] = null;
            }
         }
      }

   }

   @deob.ObfuscatedName("hz.k(Lfh;III[[ZZ)V")
   public void method7214(class447 arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
      this.field4118.method7551(false);
      float var7 = 1.0F / (float)(this.field4118.field10040 * 128);
      if (arg5) {
         for(int var8 = 0; var8 < this.field4125; ++var8) {
            int var9 = var8 << this.field4124;
            int var10 = var8 + 1 << this.field4124;

            label144:
            for(int var11 = 0; var11 < this.field4123; ++var11) {
               if (this.field4126[var11][var8] != null) {
                  int var12 = var11 << this.field4124;
                  int var13 = var11 + 1 << this.field4124;

                  for(int var14 = var12; var14 < var13; ++var14) {
                     if (var14 - arg1 >= -arg3 && var14 - arg1 <= arg3) {
                        for(int var15 = var9; var15 < var10; ++var15) {
                           if (var15 - arg2 >= -arg3 && var15 - arg2 <= arg3 && arg4[var14 - arg1 + arg3][var15 - arg2 + arg3]) {
                              arg0.field3696.method8392(var7, var7, 1.0F, 1.0F);
                              arg0.field3696.field5413[12] = (float)(-var11);
                              arg0.field3696.field5413[13] = (float)(-var8);
                              this.field4126[var11][var8].method7101(arg0);
                              continue label144;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         int[] var16 = new int[this.field4125 * this.field4123];
         ByteBuffer var17 = this.field4118.field9975;
         var17.clear();
         int var18 = 0;

         for(int var19 = 0; var19 < this.field4125; ++var19) {
            int var20 = var19 << this.field4124;
            int var21 = var19 + 1 << this.field4124;

            for(int var22 = 0; var22 < this.field4123; ++var22) {
               class498 var23 = this.field4126[var22][var19];
               int var24 = 0;
               if (var23 != null) {
                  int var25 = var22 << this.field4124;
                  int var26 = var22 + 1 << this.field4124;

                  for(int var27 = var20; var27 < var21; ++var27) {
                     if (var27 - arg2 >= -arg3 && var27 - arg2 <= arg3) {
                        int var28 = this.field4119.field9463 * var27 + var25;

                        for(int var29 = var25; var29 < var26; ++var29) {
                           if (var29 - arg1 >= -arg3 && var29 - arg1 <= arg3 && arg4[var29 - arg1 + arg3][var27 - arg2 + arg3]) {
                              short[] var30 = this.field4119.field9674[var28];
                              if (var30 != null) {
                                 for(int var31 = 0; var31 < var30.length; ++var31) {
                                    var17.putShort(var30[var31]);
                                    ++var24;
                                 }
                              }
                           }

                           ++var28;
                        }
                     }
                  }
               }

               var16[var18] = var24;
               ++var18;
            }
         }

         if (var17.position() != 0) {
            int var32 = var17.position();
            class534 var33 = this.field4118.method16446(var32 / 2);
            var33.method700(0, var32, this.field4118.field9976);
            int var34 = 0;
            int var35 = 0;

            for(int var36 = 0; var36 < this.field4125; ++var36) {
               for(int var37 = 0; var37 < this.field4123; ++var37) {
                  if (var16[var35] != 0) {
                     arg0.field3696.method8392(var7, var7, 1.0F, 1.0F);
                     arg0.field3696.field5413[12] = (float)(-var37);
                     arg0.field3696.field5413[13] = (float)(-var36);
                     this.field4126[var37][var36].method7103(arg0, var33, var34, var16[var35] / 3);
                     var34 += var16[var35];
                  }

                  ++var35;
               }
            }
         }
      }

      this.field4118.method7551(true);
   }

   @deob.ObfuscatedName("hz.d(Lna;II)V")
   public void method7224(class664 arg0, int arg1, int arg2) {
      class300 var4 = (class300)arg0;
      int var5 = var4.field1900 + 1 + arg1;
      int var6 = var4.field1901 + 1 + arg2;
      int var7 = this.field4120 * var6 + var5;
      int var8 = 0;
      int var9 = var4.field1902;
      int var10 = var4.field1898;
      int var11 = this.field4120 - var10;
      int var12 = 0;
      if (var6 <= 0) {
         int var13 = 1 - var6;
         var9 -= var13;
         var8 += var10 * var13;
         var7 += this.field4120 * var13;
         var6 = 1;
      }

      if (var6 + var9 >= this.field4121) {
         int var14 = var6 + var9 + 1 - this.field4121;
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

      if (var5 + var10 >= this.field4120) {
         int var16 = var5 + var10 + 1 - this.field4120;
         var10 -= var16;
         var12 += var16;
         var11 += var16;
      }

      if (var10 > 0 && var9 > 0) {
         method7219(this.field4122, var4.field1897, var8, var7, var10, var9, var11, var12);
         this.method7218(var5, var6, var10, var9);
      }
   }

   @deob.ObfuscatedName("hz.b(Lna;II)V")
   public void method7216(class664 arg0, int arg1, int arg2) {
      class300 var4 = (class300)arg0;
      int var5 = var4.field1900 + 1 + arg1;
      int var6 = var4.field1901 + 1 + arg2;
      int var7 = this.field4120 * var6 + var5;
      int var8 = 0;
      int var9 = var4.field1902;
      int var10 = var4.field1898;
      int var11 = this.field4120 - var10;
      int var12 = 0;
      if (var6 <= 0) {
         int var13 = 1 - var6;
         var9 -= var13;
         var8 += var10 * var13;
         var7 += this.field4120 * var13;
         var6 = 1;
      }

      if (var6 + var9 >= this.field4121) {
         int var14 = var6 + var9 + 1 - this.field4121;
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

      if (var5 + var10 >= this.field4120) {
         int var16 = var5 + var10 + 1 - this.field4120;
         var10 -= var16;
         var12 += var16;
         var11 += var16;
      }

      if (var10 > 0 && var9 > 0) {
         method7220(this.field4122, var4.field1897, var8, var7, var10, var9, var11, var12);
         this.method7218(var5, var6, var10, var9);
      }
   }

   @deob.ObfuscatedName("hz.r(Lna;II)Z")
   public boolean method7217(class664 arg0, int arg1, int arg2) {
      class300 var4 = (class300)arg0;
      int var5 = var4.field1900 + 1 + arg1;
      int var6 = var4.field1901 + 1 + arg2;
      int var7 = this.field4120 * var6 + var5;
      int var8 = var4.field1902;
      int var9 = var4.field1898;
      int var10 = this.field4120 - var9;
      if (var6 <= 0) {
         int var11 = 1 - var6;
         var8 -= var11;
         var7 += this.field4120 * var11;
         var6 = 1;
      }

      if (var6 + var8 >= this.field4121) {
         int var12 = var6 + var8 + 1 - this.field4121;
         var8 -= var12;
      }

      if (var5 <= 0) {
         int var13 = 1 - var5;
         var9 -= var13;
         var7 += var13;
         var10 += var13;
         var5 = 1;
      }

      if (var5 + var9 >= this.field4120) {
         int var14 = var5 + var9 + 1 - this.field4120;
         var9 -= var14;
         var10 += var14;
      }

      if (var9 > 0 && var8 > 0) {
         byte var15 = 8;
         int var16 = (var15 - 1) * this.field4120 + var10;
         return method7228(this.field4122, var7, var9, var8, var16, var15);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("hz.p(IIII)V")
   private void method7218(int arg0, int arg1, int arg2, int arg3) {
      if (this.field4126 != null) {
         int var5 = arg0 - 1 >> 7;
         int var6 = arg0 - 1 + arg2 - 1 >> 7;
         int var7 = arg1 - 1 >> 7;
         int var8 = arg1 - 1 + arg3 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            class498[] var10 = this.field4126[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               if (var10[var11] != null) {
                  var10[var11].field4013 = true;
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("hz.o([B[BIIIIII)V")
   private static final void method7219(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

   @deob.ObfuscatedName("hz.a([B[BIIIIII)V")
   private static final void method7220(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

   @deob.ObfuscatedName("hz.x([BIIIII)Z")
   private static final boolean method7228(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
