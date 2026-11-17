@deob.ObfuscatedName("ya")
public class class961 extends class383 {
   @deob.ObfuscatedName("ya.p")
   private boolean field9616;
   @deob.ObfuscatedName("ya.o")
   private int field9613;
   @deob.ObfuscatedName("ya.a")
   private int field9614;
   @deob.ObfuscatedName("ya.x")
   private int field9615;
   @deob.ObfuscatedName("ya.s")
   private int field9609;
   @deob.ObfuscatedName("ya.n")
   private final class979 field9620;
   @deob.ObfuscatedName("ya.b")
   private final int field9610;
   @deob.ObfuscatedName("ya.r")
   private final int field9611;
   @deob.ObfuscatedName("ya.d")
   private final class398 field9619;
   @deob.ObfuscatedName("ya.k")
   private final class511 field9608;
   @deob.ObfuscatedName("ya.l")
   private final boolean field9617;
   @deob.ObfuscatedName("ya.u")
   private final boolean field9618;
   @deob.ObfuscatedName("ya.v")
   private final boolean field9612;
   @deob.ObfuscatedName("ya.g")
   private final boolean field9607;

   public class961(class979 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      this.field9616 = false;
      this.field9613 = 0;
      this.field9614 = 0;
      this.field9615 = 0;
      this.field9609 = 0;
      this.field9620 = arg0;
      this.field9610 = arg1;
      this.field9611 = arg2;
      this.field9619 = null;
      this.field9608 = arg0.method2542(arg1, arg2, false, arg3, arg4, arg5);
      this.field9608.method497(true, true);
      this.field9617 = this.field9608.method507() != arg1;
      this.field9618 = this.field9608.method491() != arg2;
      this.field9612 = !this.field9617 && this.field9608.method496();
      this.field9607 = !this.field9618 && this.field9608.method496();
      this.field9620.method16312(12);
   }

   private class961(class979 arg0, class511 arg1, int arg2, int arg3) {
      this.field9616 = false;
      this.field9613 = 0;
      this.field9614 = 0;
      this.field9615 = 0;
      this.field9609 = 0;
      this.field9620 = arg0;
      this.field9610 = arg2;
      this.field9611 = arg3;
      this.field9608 = arg1;
      this.field9619 = null;
      this.field9617 = this.field9608.method507() != arg2;
      this.field9618 = this.field9608.method491() != arg3;
      this.field9612 = !this.field9617 && this.field9608.method496();
      this.field9607 = !this.field9618 && this.field9608.method496();
      this.field9620.method16312(12);
   }

   public class961(class979 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      this.field9616 = false;
      this.field9613 = 0;
      this.field9614 = 0;
      this.field9615 = 0;
      this.field9609 = 0;
      this.field9620 = arg0;
      this.field9610 = arg1;
      this.field9611 = arg2;
      if (arg4) {
         class529 var6 = arg0.method2545(arg3 ? class372.field2736 : class372.field2733, class405.field3052, arg1, arg2);
         this.field9619 = var6.method500(0);
         this.field9608 = var6;
      } else {
         this.field9608 = arg0.method2541(arg3 ? class372.field2736 : class372.field2733, class405.field3052, arg1, arg2);
         this.field9619 = null;
      }

      this.field9608.method497(true, true);
      this.field9617 = this.field9608.method507() != arg1;
      this.field9618 = this.field9608.method491() != arg2;
      this.field9612 = !this.field9617 && this.field9608.method496();
      this.field9607 = !this.field9618 && this.field9608.method496();
      this.field9620.method16312(12);
   }

   public class961(class979 arg0, class511 arg1) {
      this(arg0, arg1, arg1.method507(), arg1.method491());
   }

   @deob.ObfuscatedName("ya.t(IIIIII)V")
   public void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int[] var7 = this.field9620.method2609(arg4, arg5, arg2, arg3);
      if (var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method16066(arg0, arg1, arg2, arg3, var7, 0, arg2);
      }

   }

   @deob.ObfuscatedName("ya.c(III)V")
   public void method2390(int arg0, int arg1, int arg2) {
      int[] var4 = this.field9620.method2609(arg0, arg1, this.field9610, this.field9611);
      int[] var5 = new int[this.field9611 * this.field9610];
      this.field9608.method535(0, 0, this.field9610, this.field9611, var5, 0);
      if (arg2 == 0) {
         for(int var6 = 0; var6 < this.field9611; ++var6) {
            int var7 = this.field9610 * var6;

            for(int var8 = 0; var8 < this.field9610; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
            }
         }
      } else if (arg2 == 1) {
         for(int var9 = 0; var9 < this.field9611; ++var9) {
            int var10 = this.field9610 * var9;

            for(int var11 = 0; var11 < this.field9610; ++var11) {
               var5[var10 + var11] = var5[var10 + var11] & 16777215 | var4[var10 + var11] << 16 & -16777216;
            }
         }
      } else if (arg2 == 2) {
         for(int var12 = 0; var12 < this.field9611; ++var12) {
            int var13 = this.field9610 * var12;

            for(int var14 = 0; var14 < this.field9610; ++var14) {
               var5[var13 + var14] = var5[var13 + var14] & 16777215 | var4[var13 + var14] << 24 & -16777216;
            }
         }
      } else if (arg2 == 3) {
         for(int var15 = 0; var15 < this.field9611; ++var15) {
            int var16 = this.field9610 * var15;

            for(int var17 = 0; var17 < this.field9610; ++var17) {
               var5[var16 + var17] = var5[var16 + var17] & 16777215 | (var4[var16 + var17] != 0 ? -16777216 : 0);
            }
         }
      }

      this.method16066(0, 0, this.field9610, this.field9611, var5, 0, this.field9610);
   }

   @deob.ObfuscatedName("ya.l(IIII)V")
   public void method5214(int arg0, int arg1, int arg2, int arg3) {
      this.field9614 = arg0;
      this.field9613 = arg1;
      this.field9609 = arg2;
      this.field9615 = arg3;
      this.field9616 = this.field9614 != 0 || this.field9613 != 0 || this.field9609 != 0 || this.field9615 != 0;
   }

   @deob.ObfuscatedName("ya.u([I)V")
   public void method5215(int[] arg0) {
      arg0[0] = this.field9614;
      arg0[1] = this.field9613;
      arg0[2] = this.field9609;
      arg0[3] = this.field9615;
   }

   @deob.ObfuscatedName("ya.v()I")
   public int method5216() {
      return this.field9610;
   }

   @deob.ObfuscatedName("ya.g()I")
   public int method5259() {
      return this.field9614 + this.field9610 + this.field9609;
   }

   @deob.ObfuscatedName("ya.h()I")
   public int method5218() {
      return this.field9611;
   }

   @deob.ObfuscatedName("ya.m()I")
   public int method5213() {
      return this.field9613 + this.field9611 + this.field9615;
   }

   @deob.ObfuscatedName("ya.i()Ldm;")
   public class398 method2391() {
      return this.field9619;
   }

   @deob.ObfuscatedName("ya.n(IIII[III)V")
   private void method16066(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      this.field9608.method498(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("ya.q(IIIII)V")
   public void method2388(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (this.field9620.method16323() != class474.field3857) {
         int var6 = this.field9614 + arg0;
         int var7 = this.field9613 + arg1;
         this.field9620.field10079.method7155((float)var6, (float)var7, (float)(this.field9610 + var6), (float)(this.field9611 + var7), 0.0F, 0.0F, this.field9608.method508(), this.field9608.method495(), this.field9608, arg3);
      } else {
         this.field9620.method16338();
         this.field9620.method16521(arg4);
         class475 var8 = this.field9620.field10077;
         var8.field3860 = this.field9608;
         var8.method405(arg2, arg3);
         int var9 = this.field9614 + arg0;
         int var10 = this.field9613 + arg1;
         float var11 = (float)this.field9620.method11517().method566();
         float var12 = (float)this.field9620.method11517().method559();
         var8.field3861.method8392((float)this.field9610 * 2.0F / var11, (float)this.field9611 * 2.0F / var12, 1.0F, 1.0F);
         var8.field3861.field5413[12] = ((float)var9 + this.field9620.method2510()) * 2.0F / var11 - 1.0F;
         var8.field3861.field5413[13] = ((float)var10 + this.field9620.method2510()) * 2.0F / var12 - 1.0F;
         var8.field3861.field5413[14] = -1.0F;
         var8.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
         var8.field3865 = this.field9620.field10117;
         var8.field3863 = 0;
         var8.field3862 = this.field9620.field10120;
         var8.method406();
      }

   }

   @deob.ObfuscatedName("ya.f(IILta;II)V")
   public void method2393(int arg0, int arg1, class826 arg2, int arg3, int arg4) {
      this.field9620.method16338();
      class475 var6 = this.field9620.field10077;
      var6.field3860 = this.field9608;
      var6.method405(1, -1);
      int var7 = this.field9614 + arg0;
      int var8 = this.field9613 + arg1;
      float var9 = (float)this.field9620.method11517().method566();
      float var10 = (float)this.field9620.method11517().method559();
      var6.field3861.method8392((float)this.field9610 * 2.0F / var9, (float)this.field9611 * 2.0F / var10, 1.0F, 1.0F);
      var6.field3861.field5413[12] = ((float)var7 + this.field9620.method2510()) * 2.0F / var9 - 1.0F;
      var6.field3861.field5413[13] = ((float)var8 + this.field9620.method2510()) * 2.0F / var10 - 1.0F;
      var6.field3861.field5413[14] = -1.0F;
      var6.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
      var6.field3865 = this.field9620.field10117;
      var6.field3863 = 0;
      var6.field3862 = this.field9620.field10120;
      class511 var11 = ((class982)arg2).field10207;
      var6.field3866 = var11;
      var6.field3864.method8392(var11.method492((float)this.field9610), var11.method493((float)this.field9611), 1.0F, 1.0F);
      var6.field3864.field5413[12] = var11.method492((float)(var7 - arg3));
      var6.field3864.field5413[13] = var11.method493((float)(var8 - arg4));
      var6.method407();
   }

   @deob.ObfuscatedName("ya.av(IIIIIIII)V")
   protected void method2394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (this.field9620.method16323() != class474.field3857) {
         if (this.field9616) {
            arg2 = this.field9610 * arg2 / this.method5259();
            arg3 = this.field9611 * arg3 / this.method5213();
            arg0 += this.field9614 * arg2 / this.field9610;
            arg1 += this.field9613 * arg3 / this.field9611;
         }

         this.field9620.field10079.method7155((float)arg0, (float)arg1, (float)(arg0 + arg2), (float)(arg1 + arg3), this.field9608.method492(0.0F), this.field9608.method493(0.0F), this.field9608.method492((float)this.field9610), this.field9608.method493((float)this.field9611), this.field9608, arg5);
      } else {
         this.field9620.method16338();
         this.field9620.method16521(arg6);
         class475 var9 = this.field9620.field10077;
         var9.field3860 = this.field9608;
         var9.method405(arg4, arg5);
         if (this.field9616) {
            arg2 = this.field9610 * arg2 / this.method5259();
            arg3 = this.field9611 * arg3 / this.method5213();
            arg0 += this.field9614 * arg2 / this.field9610;
            arg1 += this.field9613 * arg3 / this.field9611;
         }

         float var10 = (float)this.field9620.method11517().method566();
         float var11 = (float)this.field9620.method11517().method559();
         var9.field3861.method8392((float)arg2 * 2.0F / var10, (float)arg3 * 2.0F / var11, 1.0F, 1.0F);
         var9.field3861.field5413[12] = ((float)arg0 + this.field9620.method2510()) * 2.0F / var10 - 1.0F;
         var9.field3861.field5413[13] = ((float)arg1 + this.field9620.method2510()) * 2.0F / var11 - 1.0F;
         var9.field3861.field5413[14] = -1.0F;
         var9.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
         var9.field3865 = this.field9620.field10117;
         var9.field3863 = 0;
         var9.field3862 = this.field9620.field10120;
         var9.method406();
      }

   }

   @deob.ObfuscatedName("ya.af(IIIIIII)V")
   public void method5219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field9620.method16323() != class474.field3857) {
         int var8 = arg1 + arg3;
         int var9 = arg0 + arg2;
         int var10 = this.method5259();
         int var11 = this.method5213();
         int var12 = this.field9613 + arg1;

         for(int var13 = this.field9611 + var12; var13 <= var8; var13 += var11) {
            int var14 = this.field9614 + arg0;

            for(int var15 = this.field9610 + var14; var15 <= var9; var15 += var10) {
               this.field9620.field10079.method7155((float)var14, (float)var12, (float)(this.field9610 + var14), (float)(this.field9611 + var12), 0.0F, 0.0F, this.field9608.method508(), this.field9608.method495(), this.field9608, arg5);
               var14 += var10;
            }

            if (var14 < var9) {
               int var16 = var9 - var14;
               this.field9620.field10079.method7155((float)var14, (float)var12, (float)(var14 + var16), (float)(this.field9611 + var12), 0.0F, 0.0F, (float)var16 / (float)this.field9610 * this.field9608.method508(), this.field9608.method495(), this.field9608, arg5);
            }

            var12 += var11;
         }

         if (var12 < var8) {
            int var17 = var8 - var12;
            float var18 = (float)var17 / (float)this.field9611 * this.field9608.method495();
            int var19 = this.field9614 + arg0;

            for(int var20 = this.field9610 + var19; var20 <= var9; var20 += var10) {
               this.field9620.field10079.method7155((float)var19, (float)var12, (float)(this.field9610 + var19), (float)(var12 + var17), 0.0F, 0.0F, this.field9608.method508(), var18, this.field9608, arg5);
               var19 += var10;
            }

            if (var19 < var9) {
               int var21 = var9 - var19;
               this.field9620.field10079.method7155((float)var19, (float)var12, (float)(var19 + var21), (float)(var12 + var17), 0.0F, 0.0F, (float)var21 / (float)this.field9610 * this.field9608.method508(), var18, this.field9608, arg5);
            }
         }
      } else {
         this.field9620.method16338();
         this.field9620.method16521(arg6);
         class475 var22 = this.field9620.field10077;
         var22.field3860 = this.field9608;
         var22.method405(arg4, arg5);
         float var23 = (float)this.field9620.method11517().method566();
         float var24 = (float)this.field9620.method11517().method559();
         var22.field3865 = this.field9620.field10117;
         var22.field3863 = 0;
         var22.field3862 = this.field9620.field10120;
         boolean var25 = this.field9607 && this.field9613 == 0 && this.field9615 == 0;
         boolean var26 = this.field9612 && this.field9614 == 0 && this.field9609 == 0;
         if (var26 & var25) {
            var22.field3861.method8392((float)arg2 * 2.0F / var23, (float)arg3 * 2.0F / var24, 1.0F, 1.0F);
            var22.field3861.field5413[12] = ((float)arg0 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
            var22.field3861.field5413[13] = ((float)arg1 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
            var22.field3861.field5413[14] = -1.0F;
            var22.field3859.method8392(this.field9608.method492((float)arg2), this.field9608.method493((float)arg3), 1.0F, 1.0F);
            var22.method406();
         } else if (var26) {
            int var27 = arg1 + arg3;
            int var28 = this.method5213();
            var22.field3859.method8392(this.field9608.method492((float)arg2), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
            int var29 = this.field9613 + arg1;

            for(int var30 = this.field9611 + var29; var30 <= var27; var30 += var28) {
               var22.field3861.method8392((float)arg2 * 2.0F / var23, (float)this.field9611 * 2.0F / var24, 1.0F, 1.0F);
               var22.field3861.field5413[12] = ((float)arg0 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
               var22.field3861.field5413[13] = ((float)var29 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
               var22.field3861.field5413[14] = -1.0F;
               var22.method406();
               var29 += var28;
            }

            if (var29 < var27) {
               int var31 = var27 - var29;
               var22.field3859.method8392(this.field9608.method492((float)arg2), this.field9608.method493((float)var31), 1.0F, 1.0F);
               var22.field3861.method8392((float)arg2 * 2.0F / var23, (float)var31 * 2.0F / var24, 1.0F, 1.0F);
               var22.field3861.field5413[12] = ((float)arg0 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
               var22.field3861.field5413[13] = ((float)var29 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
               var22.field3861.field5413[14] = -1.0F;
               var22.method406();
            }
         } else if (var25) {
            int var32 = arg0 + arg2;
            int var33 = this.method5259();
            var22.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)arg3), 1.0F, 1.0F);
            int var34 = this.field9614 + arg0;

            for(int var35 = this.field9610 + var34; var35 <= var32; var35 += var33) {
               var22.field3861.method8392((float)this.field9610 * 2.0F / var23, (float)arg3 * 2.0F / var24, 1.0F, 1.0F);
               var22.field3861.field5413[12] = ((float)var34 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
               var22.field3861.field5413[13] = ((float)arg1 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
               var22.field3861.field5413[14] = -1.0F;
               var22.method406();
               var34 += var33;
            }

            if (var34 < var32) {
               int var36 = var32 - var34;
               var22.field3859.method8392(this.field9608.method492((float)var36), this.field9608.method493((float)arg3), 1.0F, 1.0F);
               var22.field3861.method8392((float)var36 * 2.0F / var23, (float)arg3 * 2.0F / var24, 1.0F, 1.0F);
               var22.field3861.field5413[12] = ((float)var34 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
               var22.field3861.field5413[13] = ((float)arg1 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
               var22.field3861.field5413[14] = -1.0F;
               var22.method406();
            }
         } else {
            int var37 = arg1 + arg3;
            int var38 = arg0 + arg2;
            int var39 = this.method5259();
            int var40 = this.method5213();
            int var41 = this.field9613 + arg1;

            for(int var42 = this.field9611 + var41; var42 <= var37; var42 += var40) {
               var22.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
               int var43 = this.field9614 + arg0;

               for(int var44 = this.field9610 + var43; var44 <= var38; var44 += var39) {
                  var22.field3861.method8392((float)this.field9610 * 2.0F / var23, (float)this.field9611 * 2.0F / var24, 1.0F, 1.0F);
                  var22.field3861.field5413[12] = ((float)var43 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
                  var22.field3861.field5413[13] = ((float)var41 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
                  var22.field3861.field5413[14] = -1.0F;
                  var22.method406();
                  var43 += var39;
               }

               if (var43 < var38) {
                  int var45 = var38 - var43;
                  var22.field3859.method8392(this.field9608.method492((float)var45), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
                  var22.field3861.method8392((float)var45 * 2.0F / var23, (float)this.field9611 * 2.0F / var24, 1.0F, 1.0F);
                  var22.field3861.field5413[12] = ((float)var43 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
                  var22.field3861.field5413[13] = ((float)var41 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
                  var22.field3861.field5413[14] = -1.0F;
                  var22.method406();
               }

               var41 += var40;
            }

            if (var41 < var37) {
               int var46 = var37 - var41;
               var22.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)var46), 1.0F, 1.0F);
               int var47 = this.field9614 + arg0;

               for(int var48 = this.field9610 + var47; var48 <= var38; var48 += var39) {
                  var22.field3861.method8392((float)this.field9610 * 2.0F / var23, (float)var46 * 2.0F / var24, 1.0F, 1.0F);
                  var22.field3861.field5413[12] = ((float)var47 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
                  var22.field3861.field5413[13] = ((float)var41 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
                  var22.field3861.field5413[14] = -1.0F;
                  var22.method406();
                  var47 += var39;
               }

               if (var47 < var38) {
                  int var49 = var38 - var47;
                  var22.field3859.method8392(this.field9608.method492((float)var49), this.field9608.method493((float)var46), 1.0F, 1.0F);
                  var22.field3861.method8392((float)var49 * 2.0F / var23, (float)var46 * 2.0F / var24, 1.0F, 1.0F);
                  var22.field3861.field5413[12] = ((float)var47 + this.field9620.method2510()) * 2.0F / var23 - 1.0F;
                  var22.field3861.field5413[13] = ((float)var41 + this.field9620.method2510()) * 2.0F / var24 - 1.0F;
                  var22.field3861.field5413[14] = -1.0F;
                  var22.method406();
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ya.ak(FFFFFFIIII)V")
   protected void method5231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field9620.method16323() != class474.field3857) {
         this.field9620.field10079.method7156(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.field9608.method508(), 0.0F, 0.0F, this.field9608.method495(), this.field9608.method508(), this.field9608.method495(), this.field9608, arg7);
      } else {
         this.field9620.method16338();
         this.field9620.method16521(arg8);
         if (this.field9616) {
            float var11 = (float)this.method5259();
            float var12 = (float)this.method5213();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float)this.field9613 * var15;
            float var18 = (float)this.field9613 * var16;
            float var19 = (float)this.field9614 * var13;
            float var20 = (float)this.field9614 * var14;
            float var21 = (float)this.field9609 * -var13;
            float var22 = (float)this.field9609 * -var14;
            float var23 = (float)this.field9615 * -var15;
            float var24 = (float)this.field9615 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
         }

         class475 var25 = this.field9620.field10077;
         var25.field3860 = this.field9608;
         var25.method405(arg6, arg7);
         float var26 = (float)this.field9620.method11517().method566();
         float var27 = (float)this.field9620.method11517().method559();
         var25.field3861.method8480();
         var25.field3861.field5413[0] = (arg2 - arg0) * 2.0F / var26;
         var25.field3861.field5413[1] = (arg3 - arg1) * 2.0F / var27;
         var25.field3861.field5413[4] = (arg4 - arg0) * 2.0F / var26;
         var25.field3861.field5413[5] = (arg5 - arg1) * 2.0F / var27;
         var25.field3861.field5413[12] = (arg0 + this.field9620.method2510()) * 2.0F / var26 - 1.0F;
         var25.field3861.field5413[13] = (arg1 + this.field9620.method2510()) * 2.0F / var27 - 1.0F;
         var25.field3861.field5413[14] = -1.0F;
         var25.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
         var25.field3865 = this.field9620.field10117;
         var25.field3863 = 0;
         var25.field3862 = this.field9620.field10120;
         var25.method406();
      }

   }

   @deob.ObfuscatedName("ya.ab(FFFFFFILta;II)V")
   public void method5232(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class826 arg7, int arg8, int arg9) {
      this.field9620.method16338();
      class475 var11 = this.field9620.field10077;
      var11.field3860 = this.field9608;
      var11.method405(1, -1);
      float var12 = (float)this.field9620.method11517().method566();
      float var13 = (float)this.field9620.method11517().method559();
      var11.field3861.method8480();
      if (this.field9616) {
         float var14 = (float)this.field9610 / (float)this.method5259();
         float var15 = (float)this.field9611 / (float)this.method5213();
         var11.field3861.field5413[0] = (arg2 - arg0) * var14;
         var11.field3861.field5413[1] = (arg3 - arg1) * var14;
         var11.field3861.field5413[4] = (arg4 - arg0) * var15;
         var11.field3861.field5413[5] = (arg5 - arg1) * var15;
         var11.field3861.field5413[12] = ((float)this.field9614 + arg0) * var14 + this.field9620.method2510();
         var11.field3861.field5413[13] = ((float)this.field9613 + arg1) * var15 + this.field9620.method2510();
      } else {
         var11.field3861.field5413[0] = arg2 - arg0;
         var11.field3861.field5413[1] = arg3 - arg1;
         var11.field3861.field5413[4] = arg4 - arg0;
         var11.field3861.field5413[5] = arg5 - arg1;
         var11.field3861.field5413[12] = arg0 + this.field9620.method2510();
         var11.field3861.field5413[13] = arg1 + this.field9620.method2510();
      }

      class597 var16 = this.field9620.field9995;
      var16.method8480();
      var16.field5413[0] = 2.0F / var12;
      var16.field5413[5] = 2.0F / var13;
      var16.field5413[12] = -1.0F;
      var16.field5413[13] = -1.0F;
      var16.field5413[14] = -1.0F;
      var11.field3861.method8388(var16);
      var11.field3859.method8392(this.field9608.method492((float)this.field9610), this.field9608.method493((float)this.field9611), 1.0F, 1.0F);
      var11.field3865 = this.field9620.field10117;
      var11.field3863 = 0;
      var11.field3862 = this.field9620.field10120;
      class511 var17 = ((class982)arg7).field10207;
      var11.field3866 = var17;
      var11.field3864.method8480();
      var11.field3864.field5413[0] = (arg2 - arg0) * var17.method492(1.0F);
      var11.field3864.field5413[1] = (arg3 - arg1) * var17.method492(1.0F);
      var11.field3864.field5413[4] = (arg4 - arg0) * var17.method493(1.0F);
      var11.field3864.field5413[5] = (arg5 - arg1) * var17.method493(1.0F);
      var11.field3864.field5413[12] = (arg0 - (float)arg8) * var17.method492(1.0F);
      var11.field3864.field5413[13] = (arg1 - (float)arg9) * var17.method493(1.0F);
      var11.method407();
   }
}
