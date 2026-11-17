@deob.ObfuscatedName("acj")
public class class66 extends class674 {
   @deob.ObfuscatedName("acj.b")
   private final class983 field470;
   @deob.ObfuscatedName("acj.p")
   private final class81 field487;
   @deob.ObfuscatedName("acj.r")
   private final class976 field484;
   @deob.ObfuscatedName("acj.o")
   private int field471;
   @deob.ObfuscatedName("acj.a")
   private int field469;
   @deob.ObfuscatedName("acj.x")
   private int field474;
   @deob.ObfuscatedName("acj.s")
   private int field475;
   @deob.ObfuscatedName("acj.z")
   private float[][] field482;
   @deob.ObfuscatedName("acj.m")
   private float[][] field483;
   @deob.ObfuscatedName("acj.i")
   private float[][] field481;
   @deob.ObfuscatedName("acj.u")
   private int field477;
   @deob.ObfuscatedName("acj.t")
   private class124 field485;
   @deob.ObfuscatedName("acj.c")
   private class268 field486;
   @deob.ObfuscatedName("acj.w")
   private class875 field479;
   @deob.ObfuscatedName("acj.v")
   private final class369 field478;
   @deob.ObfuscatedName("acj.g")
   private final class341 field473;
   @deob.ObfuscatedName("acj.h")
   private final class340 field480;
   @deob.ObfuscatedName("acj.e")
   private final class340 field472;
   @deob.ObfuscatedName("acj.l")
   private int field476;

   public class66(class983 arg0, class976 arg1, class81 arg2, int[] arg3) {
      this.field470 = arg0;
      this.field487 = arg2;
      this.field484 = arg1;
      int var5 = this.field487.method1112() - (arg1.field9460 >> 1);
      this.field471 = this.field487.method1123() - var5 >> arg1.field9464;
      this.field469 = this.field487.method1123() + var5 >> arg1.field9464;
      this.field474 = this.field487.method1111() - var5 >> arg1.field9464;
      this.field475 = this.field487.method1111() + var5 >> arg1.field9464;
      int var6 = this.field469 - this.field471 + 1;
      int var7 = this.field475 - this.field474 + 1;
      this.field482 = new float[var6 + 1][var7 + 1];
      this.field483 = new float[var6 + 1][var7 + 1];
      this.field481 = new float[var6 + 1][var7 + 1];

      for(int var8 = 0; var8 <= var7; ++var8) {
         int var9 = this.field474 + var8;
         if (var9 > 0 && var9 < this.field484.field9461 - 1) {
            for(int var10 = 0; var10 <= var6; ++var10) {
               int var11 = this.field471 + var10;
               if (var11 > 0 && var11 < this.field484.field9463 - 1) {
                  int var12 = arg1.method15966(var11 + 1, var9) - arg1.method15966(var11 - 1, var9);
                  int var13 = arg1.method15966(var11, var9 + 1) - arg1.method15966(var11, var9 - 1);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + var12 * var12 + 65536)));
                  this.field482[var10][var8] = (float)var12 * var14;
                  this.field483[var10][var8] = var14 * -256.0F;
                  this.field481[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      int var15 = 0;

      for(int var16 = this.field474; var16 <= this.field475; ++var16) {
         if (var16 >= 0 && var16 < arg1.field9461) {
            for(int var17 = this.field471; var17 <= this.field469; ++var17) {
               if (var17 >= 0 && var17 < arg1.field9463) {
                  int var18 = arg3[var15];
                  int[] var19 = arg1.field9900[var17][var16];
                  if (var19 != null && var18 != 0) {
                     if (var18 == 1) {
                        for(int var20 = 0; var20 < var19.length; var20 += 3) {
                           if (var19[var20] != -1 && var19[var20 + 1] != -1 && var19[var20 + 2] != -1) {
                              this.field477 += 3;
                           }
                        }
                     } else {
                        this.field477 += 3;
                     }
                  }
               }

               ++var15;
            }
         } else {
            var15 += this.field469 - this.field471;
         }
      }

      if (this.field477 > 0) {
         this.field485 = new class124(this.field477 * 2);
         this.field486 = new class268(this.field477 * 16);
         this.field479 = new class875(class887.method4053(this.field477));
         int var21 = 0;
         int var22 = 0;

         for(int var23 = this.field474; var23 <= this.field475; ++var23) {
            if (var23 >= 0 && var23 < arg1.field9461) {
               int var24 = 0;

               for(int var25 = this.field471; var25 <= this.field469; ++var25) {
                  if (var25 >= 0 && var25 < arg1.field9463) {
                     int var26 = arg3[var22];
                     int[] var27 = arg1.field9900[var25][var23];
                     if (var27 != null && var26 != 0) {
                        if (var26 != 1) {
                           if (var26 == 3) {
                              this.method998(var24, var21, var25, var23, 0, 0);
                              this.method998(var24, var21, var25, var23, arg1.field9460, 0);
                              this.method998(var24, var21, var25, var23, 0, arg1.field9460);
                           } else if (var26 == 2) {
                              this.method998(var24, var21, var25, var23, arg1.field9460, 0);
                              this.method998(var24, var21, var25, var23, arg1.field9460, arg1.field9460);
                              this.method998(var24, var21, var25, var23, 0, 0);
                           } else if (var26 == 5) {
                              this.method998(var24, var21, var25, var23, arg1.field9460, arg1.field9460);
                              this.method998(var24, var21, var25, var23, 0, arg1.field9460);
                              this.method998(var24, var21, var25, var23, arg1.field9460, 0);
                           } else if (var26 == 4) {
                              this.method998(var24, var21, var25, var23, 0, arg1.field9460);
                              this.method998(var24, var21, var25, var23, 0, 0);
                              this.method998(var24, var21, var25, var23, arg1.field9460, arg1.field9460);
                           }
                        } else {
                           int[] var28 = arg1.field9915[var25][var23];
                           int[] var29 = arg1.field9885[var25][var23];
                           int var30 = 0;

                           label110:
                           while(true) {
                              while(true) {
                                 if (var30 >= var27.length) {
                                    break label110;
                                 }

                                 if (var27[var30] != -1 && var27[var30 + 1] != -1 && var27[var30 + 2] != -1) {
                                    this.method998(var24, var21, var25, var23, var28[var30], var29[var30]);
                                    ++var30;
                                    this.method998(var24, var21, var25, var23, var28[var30], var29[var30]);
                                    ++var30;
                                    this.method998(var24, var21, var25, var23, var28[var30], var29[var30]);
                                    ++var30;
                                 } else {
                                    var30 += 3;
                                 }
                              }
                           }
                        }
                     }
                  }

                  ++var22;
                  ++var24;
               }
            } else {
               var22 += this.field469 - this.field471;
            }

            ++var21;
         }

         this.field478 = this.field470.method16746(5123, this.field485.field931, this.field485.field935, false);
         this.field473 = this.field470.method16627(16, this.field486.field931, this.field486.field935, false);
         this.field480 = new class340(this.field473, 5126, 3, 0);
         this.field472 = new class340(this.field473, 5121, 4, 12);
      } else {
         this.field478 = null;
         this.field473 = null;
         this.field480 = null;
         this.field472 = null;
      }

      this.field486 = null;
      this.field485 = null;
      this.field479 = null;
      this.field481 = (float[][])null;
      this.field483 = (float[][])null;
      this.field482 = (float[][])null;
   }

   @deob.ObfuscatedName("acj.n(S)V")
   private void method1004(short arg0) {
      if (this.field470.field10274) {
         this.field485.method1569(arg0);
      } else {
         this.field485.method1668(arg0);
      }

   }

   @deob.ObfuscatedName("acj.k(IIIIII)V")
   private void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      long var7 = -1L;
      int var9 = (arg2 << this.field484.field9464) + arg4;
      int var10 = (arg3 << this.field484.field9464) + arg5;
      int var11 = this.field484.method15965(var9, var10);
      if ((arg4 & 127) == 0 || (arg5 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         class103 var12 = (class103)this.field479.method15322(var7);
         if (var12 != null) {
            this.method1004(var12.field796);
            return;
         }
      }

      short var13 = (short)(this.field476++);
      if (var7 != -1L) {
         this.field479.method15311(new class103(var13), var7);
      }

      float var14;
      float var15;
      float var16;
      if (arg4 == 0 && arg5 == 0) {
         var14 = this.field482[arg0][arg1];
         var15 = this.field483[arg0][arg1];
         var16 = this.field481[arg0][arg1];
      } else if (this.field484.field9460 == arg4 && arg5 == 0) {
         var14 = this.field482[arg0 + 1][arg1];
         var15 = this.field483[arg0 + 1][arg1];
         var16 = this.field481[arg0 + 1][arg1];
      } else if (this.field484.field9460 == arg4 && this.field484.field9460 == arg5) {
         var14 = this.field482[arg0 + 1][arg1 + 1];
         var15 = this.field483[arg0 + 1][arg1 + 1];
         var16 = this.field481[arg0 + 1][arg1 + 1];
      } else if (arg4 == 0 && this.field484.field9460 == arg5) {
         var14 = this.field482[arg0][arg1 + 1];
         var15 = this.field483[arg0][arg1 + 1];
         var16 = this.field481[arg0][arg1 + 1];
      } else {
         float var17 = (float)arg4 / (float)this.field484.field9460;
         float var18 = (float)arg5 / (float)this.field484.field9460;
         float var19 = this.field482[arg0][arg1];
         float var20 = this.field483[arg0][arg1];
         float var21 = this.field481[arg0][arg1];
         float var22 = this.field482[arg0 + 1][arg1];
         float var23 = this.field483[arg0 + 1][arg1];
         float var24 = this.field481[arg0 + 1][arg1];
         float var25 = (this.field482[arg0][arg1 + 1] - var19) * var17 + var19;
         float var26 = (this.field483[arg0][arg1 + 1] - var20) * var17 + var20;
         float var27 = (this.field481[arg0][arg1 + 1] - var21) * var17 + var21;
         float var28 = (this.field482[arg0 + 1][arg1 + 1] - var22) * var17 + var22;
         float var29 = (this.field483[arg0 + 1][arg1 + 1] - var23) * var17 + var23;
         float var30 = (this.field481[arg0 + 1][arg1 + 1] - var24) * var17 + var24;
         var14 = (var28 - var25) * var18 + var25;
         var15 = (var29 - var26) * var18 + var26;
         var16 = (var30 - var27) * var18 + var27;
      }

      float var31 = (float)(this.field487.method1123() - var9);
      float var32 = (float)(this.field487.method1110() - var11);
      float var33 = (float)(this.field487.method1111() - var10);
      float var34 = (float)Math.sqrt((double)(var33 * var33 + var31 * var31 + var32 * var32));
      float var35 = 1.0F / var34;
      float var36 = var31 * var35;
      float var37 = var32 * var35;
      float var38 = var33 * var35;
      float var39 = var34 / (float)this.field487.method1112();
      float var40 = 1.0F - var39 * var39;
      if (var40 < 0.0F) {
         var40 = 0.0F;
      }

      float var41 = var16 * var38 + var14 * var36 + var15 * var37;
      if (var41 < 0.0F) {
         var41 = 0.0F;
      }

      float var42 = var40 * var41 * 2.0F;
      if (var42 > 1.0F) {
         var42 = 1.0F;
      }

      int var43 = this.field487.method1113();
      int var44 = (int)((float)(var43 >> 16 & 255) * var42);
      if (var44 > 255) {
         var44 = 255;
      }

      int var45 = (int)((float)(var43 >> 8 & 255) * var42);
      if (var45 > 255) {
         var45 = 255;
      }

      int var46 = (int)((float)(var43 & 255) * var42);
      if (var46 > 255) {
         var46 = 255;
      }

      if (this.field470.field10274) {
         this.field486.method3569((float)var9);
         this.field486.method3569((float)var11);
         this.field486.method3569((float)var10);
      } else {
         this.field486.method3570((float)var9);
         this.field486.method3570((float)var11);
         this.field486.method3570((float)var10);
      }

      this.field486.method1568(var44);
      this.field486.method1568(var45);
      this.field486.method1568(var46);
      this.field486.method1568(255);
      this.method1004(var13);
   }

   @deob.ObfuscatedName("acj.d(III[[Z)V")
   public void method999(int arg0, int arg1, int arg2, boolean[][] arg3) {
      if (this.field478 != null) {
         if (this.field471 <= arg0 + arg2) {
            if (this.field469 >= arg0 - arg2) {
               if (this.field474 <= arg1 + arg2) {
                  if (this.field475 >= arg1 - arg2) {
                     for(int var5 = this.field474; var5 <= this.field475; ++var5) {
                        for(int var6 = this.field471; var6 <= this.field469; ++var6) {
                           int var7 = var6 - arg0;
                           int var8 = var5 - arg1;
                           if (var7 > -arg2 && var7 < arg2 && var8 > -arg2 && var8 < arg2 && arg3[arg2 + var7][arg2 + var8]) {
                              this.field470.method16604((int)(this.field487.method1114() * 255.0F) << 24);
                              this.field470.method16631(this.field480, (class340)null, this.field472, (class340)null);
                              this.field470.method16633(this.field478, 4, 0, this.field477);
                              return;
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }
}
