import java.util.Iterator;

@deob.ObfuscatedName("akq")
public class class289 extends class194 {
   @deob.ObfuscatedName("akq.h")
   public class746 field1865;
   @deob.ObfuscatedName("akq.m")
   private short field1863;
   @deob.ObfuscatedName("akq.z")
   private short field1869;
   @deob.ObfuscatedName("akq.c")
   private short field1866;
   @deob.ObfuscatedName("akq.w")
   private short field1870;
   @deob.ObfuscatedName("akq.q")
   private short field1871;
   @deob.ObfuscatedName("akq.t")
   private int field1868;
   @deob.ObfuscatedName("akq.i")
   private int field1867;
   @deob.ObfuscatedName("akq.e")
   private short field1864;

   public class289(class746 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field1865 = arg0;
      this.field1246 = arg1 << 12;
      this.field1245 = arg2 << 12;
      this.field1244 = arg3 << 12;
      this.field1241 = arg9;
      this.field1869 = this.field1863 = (short)arg8;
      this.field1247 = arg10;
      this.field1239 = arg11;
      this.field1242 = arg13;
      this.field1866 = (short)arg4;
      this.field1870 = (short)arg5;
      this.field1871 = (short)arg6;
      this.field1868 = arg7;
      this.field1248 = this.field1865.field6872.field3073;
      this.method3728();
   }

   @deob.ObfuscatedName("akq.o(Lqb;IIIIIIIIIIIZZ)V")
   public void method3727(class746 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field1865 = arg0;
      this.field1246 = arg1 << 12;
      this.field1245 = arg2 << 12;
      this.field1244 = arg3 << 12;
      this.field1241 = arg9;
      this.field1869 = this.field1863 = (short)arg8;
      this.field1247 = arg10;
      this.field1239 = arg11;
      this.field1242 = arg13;
      this.field1866 = (short)arg4;
      this.field1870 = (short)arg5;
      this.field1871 = (short)arg6;
      this.field1868 = arg7;
      this.field1248 = this.field1865.field6872.field3073;
      this.method3728();
   }

   @deob.ObfuscatedName("akq.a()V")
   private void method3728() {
      int var1 = this.field1865.field6863.field6960;
      if (this.field1865.field6863.field6959[var1] != null) {
         this.field1865.field6863.field6959[var1].method3731();
      }

      this.field1865.field6863.field6959[var1] = this;
      this.field1864 = (short)this.field1865.field6863.field6960;
      this.field1865.field6863.field6960 = var1 + 1 & 8191;
      this.field1865.field6865.method14795(this);
   }

   @deob.ObfuscatedName("akq.x(JI)V")
   public void method3729(long arg0, int arg1) {
      this.field1863 = (short)(this.field1863 - arg1);
      if (this.field1863 <= 0) {
         this.method3731();
      } else {
         int var4 = this.field1246 >> 12;
         int var5 = this.field1245 >> 12;
         int var6 = this.field1244 >> 12;
         class756 var7 = this.field1865.field6863;
         class539 var8 = this.field1865.field6862;
         if (var8.field4279 != 0) {
            if (this.field1869 - this.field1863 <= var8.field4319) {
               int var9 = var8.field4321 * arg1 + (this.field1867 >> 16 & 255) + (this.field1241 >> 8 & 65280);
               int var10 = var8.field4322 * arg1 + (this.field1867 >> 8 & 255) + (this.field1241 & 65280);
               int var11 = var8.field4323 * arg1 + (this.field1241 << 8 & 65280) + (this.field1867 & 255);
               if (var9 < 0) {
                  var9 = 0;
               } else if (var9 > 65535) {
                  var9 = 65535;
               }

               if (var10 < 0) {
                  var10 = 0;
               } else if (var10 > 65535) {
                  var10 = 65535;
               }

               if (var11 < 0) {
                  var11 = 0;
               } else if (var11 > 65535) {
                  var11 = 65535;
               }

               this.field1241 &= -16777216;
               this.field1241 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field1867 &= -16777216;
               this.field1867 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field1869 - this.field1863 <= var8.field4320) {
               int var12 = var8.field4324 * arg1 + (this.field1867 >> 24 & 255) + (this.field1241 >> 16 & 65280);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               this.field1241 &= 16777215;
               this.field1241 |= (var12 & 65280) << 16;
               this.field1867 &= 16777215;
               this.field1867 |= (var12 & 255) << 24;
            }
         }

         if (var8.field4289 != -1 && this.field1869 - this.field1863 <= var8.field4325) {
            this.field1868 += var8.field4326 * arg1;
         }

         if (var8.field4274 != -1 && this.field1869 - this.field1863 <= var8.field4327) {
            this.field1247 += var8.field4328 * arg1;
         }

         double var13 = (double)this.field1866;
         double var15 = (double)this.field1870;
         double var17 = (double)this.field1871;
         boolean var19 = false;
         if (var8.field4268 == 1) {
            int var20 = var4 - this.field1865.field6869.field7078;
            int var21 = var5 - this.field1865.field6869.field7071;
            int var22 = var6 - this.field1865.field6869.field7077;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field4313 * var23 * arg1);
            this.field1868 = (int)((long)this.field1868 - ((long)this.field1868 * var24 >> 18));
         } else if (var8.field4268 == 2) {
            int var26 = var4 - this.field1865.field6869.field7078;
            int var27 = var5 - this.field1865.field6869.field7071;
            int var28 = var6 - this.field1865.field6869.field7077;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field4313 * var29 * arg1);
            this.field1868 = (int)((long)this.field1868 - ((long)this.field1868 * var30 >> 28));
         }

         if (var8.field4287 != null) {
            Iterator var32 = var7.field6957.iterator();

            label215:
            while(true) {
               class105 var33;
               class537 var34;
               do {
                  if (!var32.hasNext()) {
                     break label215;
                  }

                  var33 = (class105)var32.next();
                  var34 = var33.field799;
               } while(var34.field4240 == 1);

               boolean var35 = false;

               for(int var36 = 0; var36 < var8.field4287.length; ++var36) {
                  if (var34.field4242 == var8.field4287[var36]) {
                     var35 = true;
                     break;
                  }
               }

               if (var35) {
                  double var37 = (double)(var4 - var33.field801);
                  double var39 = (double)(var5 - var33.field800);
                  double var41 = (double)(var6 - var33.field803);
                  double var43 = var41 * var41 + var37 * var37 + var39 * var39;
                  if (!(var43 > (double)var34.field4244)) {
                     double var45 = Math.sqrt(var43);
                     if (var45 == 0.0D) {
                        var45 = 1.0D;
                     }

                     double var47 = ((double)var33.field805 * var41 + (double)var33.field804 * var37 + (double)var34.field4231 * var39) * 65535.0D / ((double)var34.field4219 * var45);
                     if (!(var47 < (double)var34.field4245)) {
                        double var49 = 0.0D;
                        if (var34.field4238 == 1) {
                           var49 = var45 / 16.0D * (double)var34.field4239;
                        } else if (var34.field4238 == 2) {
                           var49 = var45 / 16.0D * (var45 / 16.0D) * (double)var34.field4239;
                        }

                        if (var34.field4241 == 0) {
                           if (var34.field4243 == 0) {
                              var13 += ((double)var33.field804 - var49) * (double)arg1;
                              var15 += ((double)var34.field4231 - var49) * (double)arg1;
                              var17 += ((double)var33.field805 - var49) * (double)arg1;
                              var19 = true;
                           } else {
                              this.field1246 = (int)((double)this.field1246 + ((double)var33.field804 - var49) * (double)arg1);
                              this.field1245 = (int)((double)this.field1245 + ((double)var34.field4231 - var49) * (double)arg1);
                              this.field1244 = (int)((double)this.field1244 + ((double)var33.field805 - var49) * (double)arg1);
                           }
                        } else {
                           double var51 = var37 / var45 * (double)var34.field4219;
                           double var53 = var39 / var45 * (double)var34.field4219;
                           double var55 = var41 / var45 * (double)var34.field4219;
                           if (var34.field4243 == 0) {
                              var13 += (double)arg1 * var51;
                              var15 += (double)arg1 * var53;
                              var17 += (double)arg1 * var55;
                              var19 = true;
                           } else {
                              this.field1246 = (int)((double)this.field1246 + (double)arg1 * var51);
                              this.field1245 = (int)((double)this.field1245 + (double)arg1 * var53);
                              this.field1244 = (int)((double)this.field1244 + (double)arg1 * var55);
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field4300 != null) {
            for(int var57 = 0; var57 < var8.field4300.length; ++var57) {
               class105 var58 = (class105)class764.field7020.method15322((long)var8.field4300[var57]);

               while(var58 != null) {
                  class537 var59 = var58.field799;
                  double var60 = (double)(var4 - var58.field801);
                  double var62 = (double)(var5 - var58.field800);
                  double var64 = (double)(var6 - var58.field803);
                  double var66 = var64 * var64 + var60 * var60 + var62 * var62;
                  if (var66 > (double)var59.field4244) {
                     var58 = (class105)class764.field7020.method15308();
                  } else {
                     double var68 = Math.sqrt(var66);
                     if (var68 == 0.0D) {
                        var68 = 1.0D;
                     }

                     double var70 = ((double)var58.field805 * var64 + (double)var58.field804 * var60 + (double)var59.field4231 * var62) * 65535.0D / ((double)var59.field4219 * var68);
                     if (var70 < (double)var59.field4245) {
                        var58 = (class105)class764.field7020.method15308();
                     } else {
                        double var72 = 0.0D;
                        if (var59.field4238 == 1) {
                           var72 = var68 / 16.0D * (double)var59.field4239;
                        } else if (var59.field4238 == 2) {
                           var72 = var68 / 16.0D * (var68 / 16.0D) * (double)var59.field4239;
                        }

                        if (var59.field4241 == 0) {
                           if (var59.field4243 == 0) {
                              var13 += ((double)var58.field804 - var72) * (double)arg1;
                              var15 += ((double)var59.field4231 - var72) * (double)arg1;
                              var17 += ((double)var58.field805 - var72) * (double)arg1;
                              var19 = true;
                           } else {
                              this.field1246 = (int)((double)this.field1246 + ((double)var58.field804 - var72) * (double)arg1);
                              this.field1245 = (int)((double)this.field1245 + ((double)var59.field4231 - var72) * (double)arg1);
                              this.field1244 = (int)((double)this.field1244 + ((double)var58.field805 - var72) * (double)arg1);
                           }
                        } else {
                           double var74 = var60 / var68 * (double)var59.field4219;
                           double var76 = var62 / var68 * (double)var59.field4219;
                           double var78 = var64 / var68 * (double)var59.field4219;
                           if (var59.field4243 == 0) {
                              var13 += (double)arg1 * var74;
                              var15 += (double)arg1 * var76;
                              var17 += (double)arg1 * var78;
                              var19 = true;
                           } else {
                              this.field1246 = (int)((double)this.field1246 + (double)arg1 * var74);
                              this.field1245 = (int)((double)this.field1245 + (double)arg1 * var76);
                              this.field1244 = (int)((double)this.field1244 + (double)arg1 * var78);
                           }
                        }

                        var58 = (class105)class764.field7020.method15308();
                     }
                  }
               }
            }
         }

         if (var8.field4285 != null) {
            if (var8.field4290 == null) {
               var8.field4290 = new int[var8.field4285.length];

               for(int var80 = 0; var80 < var8.field4285.length; ++var80) {
                  class537.method5770(var8.field4285[var80]);
                  var8.field4290[var80] = ((class108)class537.field4230.method15322((long)var8.field4285[var80])).field811;
               }
            }

            for(int var81 = 0; var81 < var8.field4290.length; ++var81) {
               class537 var82 = class537.field4228[var8.field4290[var81]];
               if (var82.field4243 == 0) {
                  var13 += (double)(var82.field4235 * arg1);
                  var15 += (double)(var82.field4231 * arg1);
                  var17 += (double)(var82.field4236 * arg1);
                  var19 = true;
               } else {
                  this.field1246 += var82.field4235 * arg1;
                  this.field1245 += var82.field4231 * arg1;
                  this.field1244 += var82.field4236 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field1866 = (short)((int)var13);
                  this.field1870 = (short)((int)var15);
                  this.field1871 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field1868 <<= 1;
            }
         }

         this.field1246 = (int)((long)this.field1246 + ((long)(this.field1868 << 2) * (long)this.field1866 >> 23) * (long)arg1);
         this.field1245 = (int)((long)this.field1245 + ((long)(this.field1868 << 2) * (long)this.field1870 >> 23) * (long)arg1);
         this.field1244 = (int)((long)this.field1244 + ((long)(this.field1868 << 2) * (long)this.field1871 >> 23) * (long)arg1);
      }
   }

   @deob.ObfuscatedName("akq.s(Low;Lra;J)V")
   public void method3730(class713 arg0, class772 arg1, long arg2) {
      int var5 = this.field1246 >> arg0.field6567 + 12;
      int var6 = this.field1244 >> arg0.field6567 + 12;
      int var7 = this.field1245 >> 12;
      if (var7 <= 262144 && var7 >= -262144 && var5 >= 0 && var5 < arg0.field6577 && var6 >= 0 && var6 < arg0.field6578) {
         class756 var8 = this.field1865.field6863;
         class539 var9 = this.field1865.field6862;
         class934[] var10 = arg0.field6580;
         int var11 = var8.field6968;
         class703 var12 = arg0.field6579[var8.field6968][var5][var6];
         if (var12 != null) {
            var11 = var12.field6477;
         }

         int var13 = var10[var11].method15966(var5, var6);
         int var14;
         if (var11 < arg0.field6614 - 1) {
            var14 = var10[var11 + 1].method15966(var5, var6);
         } else {
            var14 = var13 - (8 << arg0.field6567);
         }

         if (var9.field4306) {
            if (var9.field4277 == -1 && var7 > var13) {
               this.method3731();
               return;
            }

            if (var9.field4277 >= 0 && var7 > var10[var9.field4277].method15966(var5, var6)) {
               this.method3731();
               return;
            }

            if (var9.field4266 == -1 && var7 < var14) {
               this.method3731();
               return;
            }

            if (var9.field4266 >= 0 && var7 < var10[var9.field4266 + 1].method15966(var5, var6)) {
               this.method3731();
               return;
            }
         }

         int var15;
         for(var15 = arg0.field6614 - 1; var15 > 0 && var7 > var10[var15].method15966(var5, var6); --var15) {
         }

         if (var9.field4318 && var15 == 0 && var7 > var10[0].method15966(var5, var6)) {
            this.method3731();
         } else if (arg0.field6614 - 1 == var15 && var10[var15].method15966(var5, var6) - var7 > 8 << arg0.field6567) {
            this.method3731();
         } else {
            class703 var16 = arg0.field6579[var15][var5][var6];
            if (var16 == null) {
               if (var15 == 0 || arg0.field6579[0][var5][var6] == null) {
                  var16 = arg0.field6579[0][var5][var6] = new class703(0);
               }

               boolean var17 = arg0.field6579[0][var5][var6].field6478 != null;
               if (var15 == 3 && var17) {
                  this.method3731();
                  return;
               }

               for(int var18 = 1; var18 <= var15; ++var18) {
                  if (arg0.field6579[var18][var5][var6] == null) {
                     var16 = arg0.field6579[var18][var5][var6] = new class703(var18);
                     if (var17) {
                        ++var16.field6477;
                     }
                  }
               }
            }

            if (var9.field4304) {
               int var19 = this.field1246 >> 12;
               int var20 = this.field1244 >> 12;
               if (var16.field6481 != null) {
                  class712 var21 = var16.field6481.method2011(arg1);
                  if (var21 != null && var21.method10476(var19, var7, var20)) {
                     this.method3731();
                     return;
                  }
               }

               if (var16.field6479 != null) {
                  class712 var22 = var16.field6479.method2011(arg1);
                  if (var22 != null && var22.method10476(var19, var7, var20)) {
                     this.method3731();
                     return;
                  }
               }

               if (var16.field6482 != null) {
                  class712 var23 = var16.field6482.method2011(arg1);
                  if (var23 != null && var23.method10476(var19, var7, var20)) {
                     this.method3731();
                     return;
                  }
               }

               for(class699 var24 = var16.field6484; var24 != null; var24 = var24.field6457) {
                  class712 var25 = var24.field6458.method2011(arg1);
                  if (var25 != null && var25.method10476(var19, var7, var20)) {
                     this.method3731();
                     return;
                  }
               }
            }

            var8.field6970.field2886.method14831(this);
         }
      } else {
         this.method3731();
      }
   }

   @deob.ObfuscatedName("akq.l()V")
   public void method3731() {
      this.field1865.field6863.field6959[this.field1864] = null;
      Statics.field7013[class764.field7016] = this;
      class764.field7016 = class764.field7016 + 1 & 1023;
      this.method9960();
      this.method1009();
   }
}
