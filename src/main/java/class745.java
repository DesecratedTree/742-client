@deob.ObfuscatedName("qa")
public abstract class class745 {
   @deob.ObfuscatedName("qa.k")
   protected boolean field6860 = false;

   protected class745() {
   }

   @deob.ObfuscatedName("qa.k(IIIIII[FIF[F)V")
   protected void method10999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8, float[] arg9) {
      int var11 = arg0 - arg3;
      int var12 = arg1 - arg4;
      int var13 = arg2 - arg5;
      float var14 = arg6[2] * (float)var13 + arg6[0] * (float)var11 + arg6[1] * (float)var12;
      float var15 = arg6[5] * (float)var13 + arg6[3] * (float)var11 + arg6[4] * (float)var12;
      float var16 = arg6[8] * (float)var13 + arg6[6] * (float)var11 + arg6[7] * (float)var12;
      float var17 = (float)Math.sqrt((double)(var16 * var16 + var14 * var14 + var15 * var15));
      float var18 = (float)Math.atan2((double)var14, (double)var16) / 6.2831855F + 0.5F;
      float var19 = (float)Math.asin((double)(var15 / var17)) / 3.1415927F + 0.5F + arg8;
      if (arg7 == 1) {
         float var20 = var18;
         var18 = -var19;
         var19 = var20;
      } else if (arg7 == 2) {
         var18 = -var18;
         var19 = -var19;
      } else if (arg7 == 3) {
         float var21 = var18;
         var18 = var19;
         var19 = -var21;
      }

      arg9[0] = var18;
      arg9[1] = var19;
   }

   @deob.ObfuscatedName("qa.d(IIIIII[FFIF[F)V")
   protected void method11000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9, float[] arg10) {
      int var12 = arg0 - arg3;
      int var13 = arg1 - arg4;
      int var14 = arg2 - arg5;
      float var15 = arg6[2] * (float)var14 + arg6[0] * (float)var12 + arg6[1] * (float)var13;
      float var16 = arg6[5] * (float)var14 + arg6[3] * (float)var12 + arg6[4] * (float)var13;
      float var17 = arg6[8] * (float)var14 + arg6[6] * (float)var12 + arg6[7] * (float)var13;
      float var18 = (float)Math.atan2((double)var15, (double)var17) / 6.2831855F + 0.5F;
      if (arg7 != 1.0F) {
         var18 = arg7 * var18;
      }

      float var19 = var16 + 0.5F + arg9;
      if (arg8 == 1) {
         float var20 = var18;
         var18 = -var19;
         var19 = var20;
      } else if (arg8 == 2) {
         var18 = -var18;
         var19 = -var19;
      } else if (arg8 == 3) {
         float var21 = var18;
         var18 = var19;
         var19 = -var21;
      }

      arg10[0] = var18;
      arg10[1] = var19;
   }

   @deob.ObfuscatedName("qa.b(FFF)I")
   protected int method11013(float arg0, float arg1, float arg2) {
      float var4 = arg0 < 0.0F ? -arg0 : arg0;
      float var5 = arg1 < 0.0F ? -arg1 : arg1;
      float var6 = arg2 < 0.0F ? -arg2 : arg2;
      if (var5 > var4 && var5 > var6) {
         return arg1 > 0.0F ? 0 : 1;
      } else if (var6 > var4 && var6 > var5) {
         return arg2 > 0.0F ? 2 : 3;
      } else {
         return arg0 > 0.0F ? 4 : 5;
      }
   }

   @deob.ObfuscatedName("qa.r(IIIIIII[FIFFF[F)V")
   protected void method11015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11, float[] arg12) {
      int var14 = arg0 - arg3;
      int var15 = arg1 - arg4;
      int var16 = arg2 - arg5;
      float var17 = arg7[2] * (float)var16 + arg7[0] * (float)var14 + arg7[1] * (float)var15;
      float var18 = arg7[5] * (float)var16 + arg7[3] * (float)var14 + arg7[4] * (float)var15;
      float var19 = arg7[8] * (float)var16 + arg7[6] * (float)var14 + arg7[7] * (float)var15;
      float var20;
      float var21;
      if (arg6 == 0) {
         var20 = arg9 + var17 + 0.5F;
         var21 = -var19 + arg11 + 0.5F;
      } else if (arg6 == 1) {
         var20 = arg9 + var17 + 0.5F;
         var21 = arg11 + var19 + 0.5F;
      } else if (arg6 == 2) {
         var20 = -var17 + arg9 + 0.5F;
         var21 = -var18 + arg10 + 0.5F;
      } else if (arg6 == 3) {
         var20 = arg9 + var17 + 0.5F;
         var21 = -var18 + arg10 + 0.5F;
      } else if (arg6 == 4) {
         var20 = arg11 + var19 + 0.5F;
         var21 = -var18 + arg10 + 0.5F;
      } else {
         var20 = -var19 + arg11 + 0.5F;
         var21 = -var18 + arg10 + 0.5F;
      }

      if (arg8 == 1) {
         float var22 = var20;
         var20 = -var21;
         var21 = var22;
      } else if (arg8 == 2) {
         var20 = -var20;
         var21 = -var21;
      } else if (arg8 == 3) {
         float var23 = var20;
         var20 = var21;
         var21 = -var23;
      }

      arg12[0] = var20;
      arg12[1] = var21;
   }

   @deob.ObfuscatedName("qa.a(Ldk;[II)Ldx;")
   protected class409 method11001(class396 arg0, int[] arg1, int arg2) {
      int[] var4 = null;
      int[] var5 = null;
      int[] var6 = null;
      float[][] var7 = (float[][])null;
      if (arg0.field2922 != null) {
         int var8 = arg0.field2928;
         int[] var9 = new int[var8];
         int[] var10 = new int[var8];
         int[] var11 = new int[var8];
         int[] var12 = new int[var8];
         int[] var13 = new int[var8];
         int[] var14 = new int[var8];

         for(int var15 = 0; var15 < var8; ++var15) {
            var9[var15] = Integer.MAX_VALUE;
            var10[var15] = -2147483647;
            var11[var15] = Integer.MAX_VALUE;
            var12[var15] = -2147483647;
            var13[var15] = Integer.MAX_VALUE;
            var14[var15] = -2147483647;
         }

         for(int var16 = 0; var16 < arg2; ++var16) {
            int var17 = arg1[var16];
            if (arg0.field2922[var17] != -1) {
               int var18 = arg0.field2922[var17] & 255;

               for(int var19 = 0; var19 < 3; ++var19) {
                  short var20;
                  if (var19 == 0) {
                     var20 = arg0.field2916[var17];
                  } else if (var19 == 1) {
                     var20 = arg0.field2912[var17];
                  } else {
                     var20 = arg0.field2918[var17];
                  }

                  int var21 = arg0.field2910[var20];
                  int var22 = arg0.field2911[var20];
                  int var23 = arg0.field2940[var20];
                  if (var21 < var9[var18]) {
                     var9[var18] = var21;
                  }

                  if (var21 > var10[var18]) {
                     var10[var18] = var21;
                  }

                  if (var22 < var11[var18]) {
                     var11[var18] = var22;
                  }

                  if (var22 > var12[var18]) {
                     var12[var18] = var22;
                  }

                  if (var23 < var13[var18]) {
                     var13[var18] = var23;
                  }

                  if (var23 > var14[var18]) {
                     var14[var18] = var23;
                  }
               }
            }
         }

         var4 = new int[var8];
         var5 = new int[var8];
         var6 = new int[var8];
         var7 = new float[var8][];

         for(int var24 = 0; var24 < var8; ++var24) {
            byte var25 = arg0.field2920[var24];
            if (var25 > 0) {
               var4[var24] = (var9[var24] + var10[var24]) / 2;
               var5[var24] = (var11[var24] + var12[var24]) / 2;
               var6[var24] = (var13[var24] + var14[var24]) / 2;
               float var27;
               float var28;
               float var29;
               if (var25 == 1) {
                  int var26 = arg0.field2933[var24];
                  if (var26 == 0) {
                     var27 = 1.0F;
                     var28 = 1.0F;
                  } else if (var26 > 0) {
                     var27 = 1.0F;
                     var28 = (float)var26 / 1024.0F;
                  } else {
                     var28 = 1.0F;
                     var27 = (float)(-var26) / 1024.0F;
                  }

                  var29 = 64.0F / (float)arg0.field2917[var24];
               } else if (var25 == 2) {
                  var27 = 64.0F / (float)arg0.field2933[var24];
                  var29 = 64.0F / (float)arg0.field2917[var24];
                  var28 = 64.0F / (float)arg0.field2935[var24];
               } else {
                  var27 = (float)arg0.field2933[var24] / 1024.0F;
                  var29 = (float)arg0.field2917[var24] / 1024.0F;
                  var28 = (float)arg0.field2935[var24] / 1024.0F;
               }

               var7[var24] = this.method11002(arg0.field2930[var24], arg0.field2931[var24], arg0.field2932[var24], arg0.field2939[var24] & 255, var27, var29, var28);
            }
         }
      }

      return new class409(this, var4, var5, var6, var7);
   }

   @deob.ObfuscatedName("qa.x(IIIIFFF)[F")
   private float[] method11002(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
      float[] var8 = new float[9];
      float[] var9 = new float[9];
      float var10 = (float)Math.cos((double)((float)arg3 * 0.024543693F));
      float var11 = (float)Math.sin((double)((float)arg3 * 0.024543693F));
      float var12 = 1.0F - var10;
      var8[0] = var10;
      var8[1] = 0.0F;
      var8[2] = var11;
      var8[3] = 0.0F;
      var8[4] = 1.0F;
      var8[5] = 0.0F;
      var8[6] = -var11;
      var8[7] = 0.0F;
      var8[8] = var10;
      float[] var13 = new float[9];
      float var14 = 1.0F;
      float var15 = 0.0F;
      float var16 = (float)arg1 / 32767.0F;
      float var17 = -((float)Math.sqrt((double)(1.0F - var16 * var16)));
      float var18 = 1.0F - var16;
      float var19 = (float)Math.sqrt((double)(arg0 * arg0 + arg2 * arg2));
      if (var19 == 0.0F && var16 == 0.0F) {
         var9 = var8;
      } else {
         if (var19 != 0.0F) {
            var14 = (float)(-arg2) / var19;
            var15 = (float)arg0 / var19;
         }

         var13[0] = var14 * var14 * var18 + var16;
         var13[1] = var15 * var17;
         var13[2] = var14 * var15 * var18;
         var13[3] = -var15 * var17;
         var13[4] = var16;
         var13[5] = var14 * var17;
         var13[6] = var14 * var15 * var18;
         var13[7] = -var14 * var17;
         var13[8] = var15 * var15 * var18 + var16;
         var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
         var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
         var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
         var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
         var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
         var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
         var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
         var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
         var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
      }

      var9[0] *= arg4;
      var9[1] *= arg4;
      var9[2] *= arg4;
      var9[3] *= arg5;
      var9[4] *= arg5;
      var9[5] *= arg5;
      var9[6] *= arg6;
      var9[7] *= arg6;
      var9[8] *= arg6;
      return var9;
   }

   @deob.ObfuscatedName("qa.v(Lxa;IIIIIII)V")
   protected void method11004(class934 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      int var12 = -arg4 / 2;
      int var13 = -arg5 / 2;
      int var14 = arg0.method15965(arg1 + var12, arg3 + var13);
      int var15 = arg4 / 2;
      int var16 = -arg5 / 2;
      int var17 = arg0.method15965(arg1 + var15, arg3 + var16);
      int var18 = -arg4 / 2;
      int var19 = arg5 / 2;
      int var20 = arg0.method15965(arg1 + var18, arg3 + var19);
      int var21 = arg4 / 2;
      int var22 = arg5 / 2;
      int var23 = arg0.method15965(arg1 + var21, arg3 + var22);
      int var24 = var14 < var17 ? var14 : var17;
      int var25 = var20 < var23 ? var20 : var23;
      int var26 = var17 < var23 ? var17 : var23;
      int var27 = var14 < var20 ? var14 : var20;
      if (arg5 != 0) {
         int var28 = (int)(Math.atan2((double)(var24 - var25), (double)arg5) * 2607.5945876176133D) & 16383;
         if (var28 != 0) {
            if (arg6 != 0) {
               if (var28 > 8192) {
                  int var29 = 16384 - arg6;
                  if (var28 < var29) {
                     var28 = var29;
                  }
               } else if (var28 > arg6) {
                  var28 = arg6;
               }
            }

            this.method6921(var28);
         }
      }

      if (arg4 != 0) {
         int var30 = (int)(Math.atan2((double)(var27 - var26), (double)arg4) * 2607.5945876176133D) & 16383;
         if (var30 != 0) {
            if (arg7 != 0) {
               if (var30 > 8192) {
                  int var31 = 16384 - arg7;
                  if (var30 < var31) {
                     var30 = var31;
                  }
               } else if (var30 > arg7) {
                  var30 = arg7;
               }
            }

            this.method6999(var30);
         }
      }

      int var32 = var14 + var23;
      if (var17 + var20 < var32) {
         var32 = var17 + var20;
      }

      int var33 = (var32 >> 1) - arg2;
      if (var33 != 0) {
         this.method7078(0, var33, 0);
      }

   }

   @deob.ObfuscatedName("qa.q(Lajb;ILajb;IIIIZ)V")
   public final void method11005(class247 arg0, int arg1, class247 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      if (arg1 != -1) {
         this.method6926();
         if (!this.method6927()) {
            this.method7027();
         } else {
            class387 var9 = arg0.field1638[arg1];
            class69 var10 = var9.field2849;
            class387 var11 = null;
            if (arg2 != null) {
               var11 = arg2.field1638[arg3];
               if (var11.field2849 != var10) {
                  var11 = null;
               }
            }

            this.method11009(var10, var9, var11, arg4, arg5, arg6, (boolean[])null, false, arg7, 65535, (int[])null);
            this.method6932();
            this.method7027();
         }
      }
   }

   @deob.ObfuscatedName("qa.j(Lajb;ILajb;IIIIIZ[I)V")
   public final void method11006(class247 arg0, int arg1, class247 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int[] arg9) {
      if (arg1 != -1) {
         this.method6926();
         if (!this.method6927()) {
            this.method7027();
         } else {
            class387 var11 = arg0.field1638[arg1];
            class69 var12 = var11.field2849;
            class387 var13 = null;
            if (arg2 != null) {
               var13 = arg2.field1638[arg3];
               if (var13.field2849 != var12) {
                  var13 = null;
               }
            }

            this.method11009(var12, var11, var13, arg4, arg5, arg6, (boolean[])null, false, arg8, arg7, arg9);
            this.method6932();
            this.method7027();
         }
      }
   }

   @deob.ObfuscatedName("qa.ai(Lajb;ILajb;IIILajb;ILajb;III[ZZ)V")
   public final void method11007(class247 arg0, int arg1, class247 arg2, int arg3, int arg4, int arg5, class247 arg6, int arg7, class247 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
      if (arg1 != -1) {
         if (arg12 != null && arg7 != -1) {
            this.method6926();
            if (!this.method6927()) {
               this.method7027();
            } else {
               class387 var15 = arg0.field1638[arg1];
               class69 var16 = var15.field2849;
               class387 var17 = null;
               if (arg2 != null) {
                  var17 = arg2.field1638[arg3];
                  if (var17.field2849 != var16) {
                     var17 = null;
                  }
               }

               this.method11009(var16, var15, var17, arg4, arg5, 0, arg12, false, arg13, 65535, (int[])null);
               class387 var18 = arg6.field1638[arg7];
               class387 var19 = null;
               if (arg8 != null) {
                  var19 = arg8.field1638[arg9];
                  if (var19.field2849 != var16) {
                     var19 = null;
                  }
               }

               this.method6928(0, new int[0], 0, 0, 0, 0, arg13);
               this.method11009(var18.field2849, var18, var19, arg10, arg11, 0, arg12, true, arg13, 65535, (int[])null);
               this.method6932();
               this.method7027();
            }
         } else {
            this.method11005(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
         }
      }
   }

   @deob.ObfuscatedName("qa.ap(Lajb;I)V")
   public final void method11008(class247 arg0, int arg1) {
      if (arg1 != -1) {
         this.method6926();
         if (!this.method6927()) {
            this.method7027();
         } else {
            class387 var3 = arg0.field1638[arg1];
            class69 var4 = var3.field2849;

            for(int var5 = 0; var5 < var3.field2856; ++var5) {
               short var6 = var3.field2851[var5];
               if (var4.field512[var6]) {
                  if (var3.field2852[var5] != -1) {
                     this.method6931(0, 0, 0, 0);
                  }

                  this.method6931(var4.field499[var6], var3.field2855[var5], var3.field2853[var5], var3.field2860[var5]);
               }
            }

            this.method6932();
            this.method7027();
         }
      }
   }

   @deob.ObfuscatedName("qa.av(Lacm;Ldb;Ldb;III[ZZZI[I)V")
   private void method11009(class69 arg0, class387 arg1, class387 arg2, int arg3, int arg4, int arg5, boolean[] arg6, boolean arg7, boolean arg8, int arg9, int[] arg10) {
      if (arg2 != null && arg3 != 0) {
         int var12 = 0;
         int var13 = 0;

         for(int var14 = 0; var14 < arg0.field509; ++var14) {
            boolean var15 = false;
            if (var12 < arg1.field2856 && arg1.field2851[var12] == var14) {
               var15 = true;
            }

            boolean var16 = false;
            if (var13 < arg2.field2856 && arg2.field2851[var13] == var14) {
               var16 = true;
            }

            if (var15 || var16) {
               if (arg6 != null && arg6[var14] != arg7 && arg0.field499[var14] != 0) {
                  if (var15) {
                     ++var12;
                  }

                  if (var16) {
                     ++var13;
                  }
               } else {
                  short var17 = 0;
                  int var18 = arg0.field499[var14];
                  if (var18 == 3 || var18 == 10) {
                     var17 = 128;
                  }

                  short var19;
                  short var20;
                  short var21;
                  short var22;
                  byte var23;
                  if (var15) {
                     var19 = arg1.field2855[var12];
                     var20 = arg1.field2853[var12];
                     var21 = arg1.field2860[var12];
                     var22 = arg1.field2852[var12];
                     var23 = arg1.field2845[var12];
                     ++var12;
                  } else {
                     var19 = var17;
                     var20 = var17;
                     var21 = var17;
                     var22 = -1;
                     var23 = 0;
                  }

                  short var24;
                  short var25;
                  short var26;
                  short var27;
                  byte var28;
                  if (var16) {
                     var24 = arg2.field2855[var13];
                     var25 = arg2.field2853[var13];
                     var26 = arg2.field2860[var13];
                     var27 = arg2.field2852[var13];
                     var28 = arg2.field2845[var13];
                     ++var13;
                  } else {
                     var24 = var17;
                     var25 = var17;
                     var26 = var17;
                     var27 = -1;
                     var28 = 0;
                  }

                  int var32;
                  int var33;
                  int var34;
                  if ((var23 & 2) == 0 && (var28 & 1) == 0) {
                     if (var18 == 2) {
                        int var29 = var24 - var19 & 16383;
                        int var30 = var25 - var20 & 16383;
                        int var31 = var26 - var21 & 16383;
                        if (var29 >= 8192) {
                           var29 -= 16384;
                        }

                        if (var30 >= 8192) {
                           var30 -= 16384;
                        }

                        if (var31 >= 8192) {
                           var31 -= 16384;
                        }

                        var32 = arg3 * var29 / arg4 + var19 & 16383;
                        var33 = arg3 * var30 / arg4 + var20 & 16383;
                        var34 = arg3 * var31 / arg4 + var21 & 16383;
                     } else if (var18 == 9) {
                        int var35 = var24 - var19 & 16383;
                        if (var35 >= 8192) {
                           var35 -= 16384;
                        }

                        var32 = arg3 * var35 / arg4 + var19 & 16383;
                        var34 = 0;
                        var33 = 0;
                     } else if (var18 == 7) {
                        int var36 = var24 - var19 & 63;
                        if (var36 >= 32) {
                           var36 -= 64;
                        }

                        var32 = arg3 * var36 / arg4 + var19 & 63;
                        var33 = (var25 - var20) * arg3 / arg4 + var20;
                        var34 = (var26 - var21) * arg3 / arg4 + var21;
                     } else {
                        var32 = (var24 - var19) * arg3 / arg4 + var19;
                        var33 = (var25 - var20) * arg3 / arg4 + var20;
                        var34 = (var26 - var21) * arg3 / arg4 + var21;
                     }
                  } else {
                     var32 = var19;
                     var33 = var20;
                     var34 = var21;
                  }

                  if (var22 != -1) {
                     this.method11010(0, arg0.field511[var22], 0, 0, 0, arg5, arg8, arg9 & arg0.field510[var22], arg10);
                  } else if (var27 != -1) {
                     this.method11010(0, arg0.field511[var27], 0, 0, 0, arg5, arg8, arg9 & arg0.field510[var27], arg10);
                  }

                  this.method11010(var18, arg0.field511[var14], var32, var33, var34, arg5, arg8, arg9 & arg0.field510[var14], arg10);
               }
            }
         }

      } else {
         for(int var37 = 0; var37 < arg1.field2856; ++var37) {
            short var38 = arg1.field2851[var37];
            if (arg6 == null || arg6[var38] == arg7 || arg0.field499[var38] == 0) {
               short var39 = arg1.field2852[var37];
               if (var39 != -1) {
                  this.method11010(0, arg0.field511[var39], 0, 0, 0, arg5, arg8, arg9 & arg0.field510[var39], arg10);
               }

               this.method11010(arg0.field499[var38], arg0.field511[var38], arg1.field2855[var37], arg1.field2853[var37], arg1.field2860[var37], arg5, arg8, arg9 & arg0.field510[var38], arg10);
            }
         }

      }
   }

   @deob.ObfuscatedName("qa.ax(I[IIIIIZI[I)V")
   private void method11010(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8) {
      if (arg5 == 1) {
         if (arg0 != 0 && arg0 != 1) {
            if (arg0 == 3) {
               int var10 = arg2;
               arg2 = arg4;
               arg4 = var10;
            } else if (arg0 == 2) {
               int var11 = arg2;
               arg2 = -arg4 & 16383;
               arg4 = var11 & 16383;
            }
         } else {
            int var12 = -arg2;
            arg2 = arg4;
            arg4 = var12;
         }
      } else if (arg5 == 2) {
         if (arg0 != 0 && arg0 != 1) {
            if (arg0 == 2) {
               arg2 = -arg2 & 16383;
               arg4 = -arg4 & 16383;
            }
         } else {
            arg2 = -arg2;
            arg4 = -arg4;
         }
      } else if (arg5 == 3) {
         if (arg0 != 0 && arg0 != 1) {
            if (arg0 == 3) {
               int var13 = arg2;
               arg2 = arg4;
               arg4 = var13;
            } else if (arg0 == 2) {
               int var14 = arg2;
               arg2 = arg4 & 16383;
               arg4 = -var14 & 16383;
            }
         } else {
            int var15 = arg2;
            arg2 = -arg4;
            arg4 = var15;
         }
      }

      if (arg7 != 65535) {
         this.method6930(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
      } else {
         this.method6928(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
      }

   }

   @deob.ObfuscatedName("qa.m()I")
   public abstract int method6980();

   @deob.ObfuscatedName("qa.s(BIZ)Lqa;")
   public abstract class745 method6914(byte arg0, int arg1, boolean arg2);

   @deob.ObfuscatedName("qa.l()V")
   public abstract void method6918();

   @deob.ObfuscatedName("qa.f(I)V")
   public abstract void method7008(int arg0);

   @deob.ObfuscatedName("qa.ka()V")
   protected abstract void method6932();

   @deob.ObfuscatedName("qa.EA(I)V")
   public abstract void method6999(int arg0);

   @deob.ObfuscatedName("qa.ia(III)V")
   public abstract void method7078(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("qa.wa()V")
   public abstract void method7075();

   @deob.ObfuscatedName("qa.oa(III)V")
   public abstract void method6924(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("qa.pa(IILxa;Lxa;III)V")
   public abstract void method6925(int arg0, int arg1, class934 arg2, class934 arg3, int arg4, int arg5, int arg6);

   @deob.ObfuscatedName("qa.g()V")
   protected abstract void method6926();

   @deob.ObfuscatedName("qa.h()V")
   protected abstract void method7027();

   @deob.ObfuscatedName("qa.ea()Z")
   protected abstract boolean method6927();

   @deob.ObfuscatedName("qa.af(I[IIIIIZ)V")
   protected abstract void method6928(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @deob.ObfuscatedName("qa.i()Z")
   public abstract boolean method6949();

   @deob.ObfuscatedName("qa.t(I)V")
   public abstract void method6921(int arg0);

   @deob.ObfuscatedName("qa.ah(Lka;Ldi;I)V")
   public abstract void method7001(class583 arg0, class394 arg1, int arg2);

   @deob.ObfuscatedName("qa.aw(IILka;ZI)Z")
   public abstract boolean method6935(int arg0, int arg1, class583 arg2, boolean arg3, int arg4);

   @deob.ObfuscatedName("qa.ga(Lna;)Lna;")
   public abstract class664 method7072(class664 arg0);

   @deob.ObfuscatedName("qa.N()I")
   public abstract int method7004();

   @deob.ObfuscatedName("qa.ya()I")
   public abstract int method6940();

   @deob.ObfuscatedName("qa.YA()I")
   public abstract int method6941();

   @deob.ObfuscatedName("qa.o()I")
   public abstract int method6951();

   @deob.ObfuscatedName("qa.ha()I")
   public abstract int method6943();

   @deob.ObfuscatedName("qa.p(I)V")
   public abstract void method6944(int arg0);

   @deob.ObfuscatedName("qa.Q(I)V")
   public abstract void method6969(int arg0);

   @deob.ObfuscatedName("qa.c()I")
   public abstract int method6946();

   @deob.ObfuscatedName("qa.Z()I")
   public abstract int method6947();

   @deob.ObfuscatedName("qa.al()[B")
   public abstract byte[] method6948();

   @deob.ObfuscatedName("qa.X(SS)V")
   public abstract void method7023(short arg0, short arg1);

   @deob.ObfuscatedName("qa.an(B[B)V")
   public abstract void method6950(byte arg0, byte[] arg1);

   @deob.ObfuscatedName("qa.KA(I)V")
   public abstract void method6916(int arg0);

   @deob.ObfuscatedName("qa.u()Z")
   public abstract boolean method6956();

   @deob.ObfuscatedName("qa.ao()[Ldw;")
   public abstract class408[] method6957();

   @deob.ObfuscatedName("qa.ab()[Lcl;")
   public abstract class370[] method6958();

   @deob.ObfuscatedName("qa.ae(Lqa;IIIZ)V")
   public abstract void method6959(class745 arg0, int arg1, int arg2, int arg3, boolean arg4);

   @deob.ObfuscatedName("qa.PA(IIII)V")
   public abstract void method6953(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("qa.ak(Lka;)V")
   public abstract void method7024(class583 arg0);

   @deob.ObfuscatedName("qa.S(I)V")
   public abstract void method6920(int arg0);

   @deob.ObfuscatedName("qa.e(I[IIIIZI[I)V")
   protected abstract void method6930(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @deob.ObfuscatedName("qa.W(SS)V")
   public abstract void method6952(short arg0, short arg1);

   @deob.ObfuscatedName("qa.AA()I")
   public abstract int method7046();

   @deob.ObfuscatedName("qa.ag()Z")
   public abstract boolean method6954();

   @deob.ObfuscatedName("qa.RA()I")
   public abstract int method7033();

   @deob.ObfuscatedName("qa.at(Lka;IZ)V")
   public abstract void method6983(class583 arg0, int arg1, boolean arg2);

   @deob.ObfuscatedName("qa.w(IIII)V")
   protected abstract void method6931(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("qa.n()I")
   public abstract int method6938();
}
