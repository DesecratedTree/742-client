@deob.ObfuscatedName("ako")
public class class287 extends class235 {
   public class287(class315 arg0, int arg1, int arg2, int arg3) {
      this.field675 = arg0;
      this.field1592 = arg0.field1521;
      this.field1581 = arg0.field1522;
      this.field1593 = arg0.field1523;
      this.field1594 = arg1;
      this.field1582 = arg2;
      this.field1584 = arg3;
      this.field1586 = 0;
      this.method3245();
   }

   @deob.ObfuscatedName("ako.p([III)V")
   public synchronized void method1244(int[] arg0, int arg1, int arg2) throws IllegalStateException {
      if (this.field1582 == 0 && this.field1595 == 0) {
         this.method1254(arg2);
      } else {
         int var4 = this.field1592 << 8;
         int var5 = this.field1581 << 8;
         int var6 = ((class315)this.field675).method3113() << 8;
         int var7 = var5 - var4;
         if (var7 <= 0) {
            this.field1591 = 0;
         }

         int var8 = arg1;
         int var9 = arg1 + arg2;
         if (this.field1586 < 0) {
            if (this.field1594 <= 0) {
               this.method3257();
               this.method9864();
               return;
            }

            this.field1586 = 0;
         }

         if (this.field1586 >= var6) {
            if (this.field1594 >= 0) {
               this.method3257();
               this.method9864();
               return;
            }

            this.field1586 = var6 - 1;
         }

         if (this.field1591 < 0) {
            if (this.field1593) {
               if (this.field1594 < 0) {
                  var8 = this.method3677(arg0, arg1, var4, var9, ((class315)this.field675).method3935()[this.field1592]);
                  if (this.field1586 >= var4) {
                     return;
                  }

                  this.field1586 = var4 + var4 - 1 - this.field1586;
                  this.field1594 = -(this.field1594 * 1151273631) * -274099873;
               }

               while(true) {
                  int var10 = this.method3710(arg0, var8, var5, var9, ((class315)this.field675).method3935()[this.field1581 - 1]);
                  if (this.field1586 < var5) {
                     return;
                  }

                  this.field1586 = var5 + var5 - 1 - this.field1586;
                  this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                  var8 = this.method3677(arg0, var10, var4, var9, ((class315)this.field675).method3935()[this.field1592]);
                  if (this.field1586 >= var4) {
                     return;
                  }

                  this.field1586 = var4 + var4 - 1 - this.field1586;
                  this.field1594 = -(this.field1594 * 1151273631) * -274099873;
               }
            } else if (this.field1594 < 0) {
               while(true) {
                  var8 = this.method3677(arg0, var8, var4, var9, ((class315)this.field675).method3935()[this.field1581 - 1]);
                  if (this.field1586 >= var4) {
                     return;
                  }

                  this.field1586 = var5 - 1 - (var5 - 1 - this.field1586) % var7;
               }
            } else {
               while(true) {
                  var8 = this.method3710(arg0, var8, var5, var9, ((class315)this.field675).method3935()[this.field1592]);
                  if (this.field1586 < var5) {
                     return;
                  }

                  this.field1586 = (this.field1586 - var4) % var7 + var4;
               }
            }
         } else {
            if (this.field1591 > 0) {
               if (this.field1593) {
                  label131: {
                     if (this.field1594 < 0) {
                        var8 = this.method3677(arg0, arg1, var4, var9, ((class315)this.field675).method3935()[this.field1592]);
                        if (this.field1586 >= var4) {
                           return;
                        }

                        this.field1586 = var4 + var4 - 1 - this.field1586;
                        this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                        if (--this.field1591 == 0) {
                           break label131;
                        }
                     }

                     do {
                        var8 = this.method3710(arg0, var8, var5, var9, ((class315)this.field675).method3935()[this.field1581 - 1]);
                        if (this.field1586 < var5) {
                           return;
                        }

                        this.field1586 = var5 + var5 - 1 - this.field1586;
                        this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                        if (--this.field1591 == 0) {
                           break;
                        }

                        var8 = this.method3677(arg0, var8, var4, var9, ((class315)this.field675).method3935()[this.field1592]);
                        if (this.field1586 >= var4) {
                           return;
                        }

                        this.field1586 = var4 + var4 - 1 - this.field1586;
                        this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                     } while(--this.field1591 != 0);
                  }
               } else if (this.field1594 < 0) {
                  while(true) {
                     var8 = this.method3677(arg0, var8, var4, var9, ((class315)this.field675).method3935()[this.field1581 - 1]);
                     if (this.field1586 >= var4) {
                        return;
                     }

                     int var11 = (var5 - 1 - this.field1586) / var7;
                     if (var11 >= this.field1591) {
                        this.field1586 += this.field1591 * var7;
                        this.field1591 = 0;
                        break;
                     }

                     this.field1586 += var7 * var11;
                     this.field1591 -= var11;
                  }
               } else {
                  while(true) {
                     var8 = this.method3710(arg0, var8, var5, var9, ((class315)this.field675).method3935()[this.field1592]);
                     if (this.field1586 < var5) {
                        return;
                     }

                     int var12 = (this.field1586 - var4) / var7;
                     if (var12 >= this.field1591) {
                        this.field1586 -= this.field1591 * var7;
                        this.field1591 = 0;
                        break;
                     }

                     this.field1586 -= var7 * var12;
                     this.field1591 -= var12;
                  }
               }
            }

            if (this.field1594 < 0) {
               this.method3677(arg0, var8, 0, var9, 0.0F);
               if (this.field1586 < 0) {
                  this.field1586 = -1;
                  this.method3257();
                  this.method9864();
               }
            } else {
               this.method3710(arg0, var8, var6, var9, 0.0F);
               if (this.field1586 >= var6) {
                  this.field1586 = var6;
                  this.method3257();
                  this.method9864();
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("ako.dp([IIIIF)I")
   private int method3710(int[] arg0, int arg1, int arg2, int arg3, float arg4) {
      while(true) {
         if (this.field1595 > 0) {
            int var6 = this.field1595 + arg1;
            if (var6 > arg3) {
               var6 = arg3;
            }

            this.field1595 += arg1;
            if (this.field1594 == 256 && (this.field1586 & 255) == 0) {
               if (Statics.field5844) {
                  arg1 = method3702(0.0F, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this);
               } else {
                  arg1 = method3686(((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this);
               }
            } else if (Statics.field5844) {
               arg1 = method3691(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this, this.field1594, arg4);
            } else {
               arg1 = method3687(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this, this.field1594, arg4);
            }

            this.field1595 -= arg1;
            if (this.field1595 != 0) {
               return arg1;
            }

            if (!this.method3263()) {
               continue;
            }

            return arg3;
         }

         if (this.field1594 == 256 && (this.field1586 & 255) == 0) {
            if (Statics.field5844) {
               return method3679(0.0F, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this);
            }

            return method3678(((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this);
         }

         if (Statics.field5844) {
            return method3683(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this, this.field1594, arg4);
         }

         return method3682(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this, this.field1594, arg4);
      }
   }

   @deob.ObfuscatedName("ako.dh([IIIIF)I")
   private int method3677(int[] arg0, int arg1, int arg2, int arg3, float arg4) {
      while(true) {
         if (this.field1595 > 0) {
            int var6 = this.field1595 + arg1;
            if (var6 > arg3) {
               var6 = arg3;
            }

            this.field1595 += arg1;
            if (this.field1594 == -256 && (this.field1586 & 255) == 0) {
               if (Statics.field5844) {
                  arg1 = method3689(0.0F, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this);
               } else {
                  arg1 = method3700(((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this);
               }
            } else if (Statics.field5844) {
               arg1 = method3681(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this, this.field1594, arg4);
            } else {
               arg1 = method3692(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this, this.field1594, arg4);
            }

            this.field1595 -= arg1;
            if (this.field1595 != 0) {
               return arg1;
            }

            if (!this.method3263()) {
               continue;
            }

            return arg3;
         }

         if (this.field1594 == -256 && (this.field1586 & 255) == 0) {
            if (Statics.field5844) {
               return method3714(0.0F, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this);
            }

            return method3680(((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this);
         }

         if (Statics.field5844) {
            return method3685(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this, this.field1594, arg4);
         }

         return method3684(0.0F, 0, ((class315)this.field675).method3935(), arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this, this.field1594, arg4);
      }
   }

   @deob.ObfuscatedName("ako.dc([F[IIIIIIILako;)I")
   private static int method3678(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class287 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12 = var11 * 128;
      int var13;
      if ((var13 = arg3 + var10 - var9) > arg6) {
         var13 = arg6;
      }

      var13 -= 3;

      int var10001;
      while(arg3 < var13) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var9++] * (float)var12);
         int var14 = arg3++;
         arg1[var14] = (int)((float)arg1[var14] + arg0[var9++] * (float)var12);
         int var15 = arg3++;
         arg1[var15] = (int)((float)arg1[var15] + arg0[var9++] * (float)var12);
         int var16 = arg3++;
         arg1[var16] = (int)((float)arg1[var16] + arg0[var9++] * (float)var12);
      }

      var13 += 3;

      while(arg3 < var13) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var9++] * (float)var12);
      }

      arg8.field1586 = var9 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("ako.dw(F[F[IIIIIIIILako;)I")
   private static int method3679(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15 = var13 * 128;
      int var16 = var14 * 128;
      int var17;
      if ((var17 = arg4 + var12 - var11) > arg8) {
         var17 = arg8;
      }

      int var18 = arg4 << 1;
      int var19 = var17 << 1;
      int var31 = var19 - 6;

      while(var18 < var31) {
         float var20 = arg1[var11++];
         int var25 = var18++;
         arg2[var25] = (int)((float)arg2[var25] + (float)var15 * var20);
         int var26 = var18++;
         arg2[var26] = (int)((float)arg2[var26] + (float)var16 * var20);
         float var21 = arg1[var11++];
         int var28 = var18++;
         arg2[var28] = (int)((float)arg2[var28] + (float)var15 * var21);
         int var29 = var18++;
         arg2[var29] = (int)((float)arg2[var29] + (float)var16 * var21);
         float var22 = arg1[var11++];
         int var32 = var18++;
         arg2[var32] = (int)((float)arg2[var32] + (float)var15 * var22);
         int var33 = var18++;
         arg2[var33] = (int)((float)arg2[var33] + (float)var16 * var22);
         float var23 = arg1[var11++];
         int var35 = var18++;
         arg2[var35] = (int)((float)arg2[var35] + (float)var15 * var23);
         int var36 = var18++;
         arg2[var36] = (int)((float)arg2[var36] + (float)var16 * var23);
      }

      var19 = var31 + 6;

      while(var18 < var19) {
         float var24 = arg1[var11++];
         int var10001 = var18++;
         arg2[var10001] = (int)((float)arg2[var10001] + (float)var15 * var24);
         int var37 = var18++;
         arg2[var37] = (int)((float)arg2[var37] + (float)var16 * var24);
      }

      arg10.field1586 = var11 << 8;
      return var18 >> 1;
   }

   @deob.ObfuscatedName("ako.ds([F[IIIIIIILako;)I")
   private static int method3680(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class287 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12 = var11 * 128;
      int var13;
      if ((var13 = arg3 + var9 - (var10 - 1)) > arg6) {
         var13 = arg6;
      }

      var13 -= 3;

      int var10001;
      while(arg3 < var13) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var9--] * (float)var12);
         int var14 = arg3++;
         arg1[var14] = (int)((float)arg1[var14] + arg0[var9--] * (float)var12);
         int var15 = arg3++;
         arg1[var15] = (int)((float)arg1[var15] + arg0[var9--] * (float)var12);
         int var16 = arg3++;
         arg1[var16] = (int)((float)arg1[var16] + arg0[var9--] * (float)var12);
      }

      var13 += 3;

      while(arg3 < var13) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var9--] * (float)var12);
      }

      arg8.field1586 = var9 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("ako.dm(F[F[IIIIIIIILako;)I")
   private static int method3714(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15 = var13 * 128;
      int var16 = var14 * 128;
      int var17;
      if ((var17 = arg4 + var11 - (var12 - 1)) > arg8) {
         var17 = arg8;
      }

      int var18 = arg4 << 1;
      int var19 = var17 << 1;
      int var31 = var19 - 6;

      while(var18 < var31) {
         float var20 = arg1[var11--];
         int var25 = var18++;
         arg2[var25] = (int)((float)arg2[var25] + (float)var15 * var20);
         int var26 = var18++;
         arg2[var26] = (int)((float)arg2[var26] + (float)var16 * var20);
         float var21 = arg1[var11--];
         int var28 = var18++;
         arg2[var28] = (int)((float)arg2[var28] + (float)var15 * var21);
         int var29 = var18++;
         arg2[var29] = (int)((float)arg2[var29] + (float)var16 * var21);
         float var22 = arg1[var11--];
         int var32 = var18++;
         arg2[var32] = (int)((float)arg2[var32] + (float)var15 * var22);
         int var33 = var18++;
         arg2[var33] = (int)((float)arg2[var33] + (float)var16 * var22);
         float var23 = arg1[var11--];
         int var35 = var18++;
         arg2[var35] = (int)((float)arg2[var35] + (float)var15 * var23);
         int var36 = var18++;
         arg2[var36] = (int)((float)arg2[var36] + (float)var16 * var23);
      }

      var19 = var31 + 6;

      while(var18 < var19) {
         float var24 = arg1[var11--];
         int var10001 = var18++;
         arg2[var10001] = (int)((float)arg2[var10001] + (float)var15 * var24);
         int var37 = var18++;
         arg2[var37] = (int)((float)arg2[var37] + (float)var16 * var24);
      }

      arg10.field1586 = var11 << 8;
      return var18 >> 1;
   }

   @deob.ObfuscatedName("ako.dq(FI[F[IIIIIIILako;IF)I")
   private static int method3682(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10, int arg11, float arg12) {
      int var13 = arg6 * 128;
      int var14;
      if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
         var14 = arg8;
      }

      int var10001;
      while(arg5 < var14) {
         int var15 = arg4 >> 8;
         float var16 = arg2[var15];
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg2[var15 + 1] - var16) * (float)(arg4 & 255) + var16 * 256.0F) * (float)var13) >> 6;
         arg4 += arg11;
      }

      int var17;
      if (arg11 == 0 || (var17 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
         var17 = arg8;
      }

      while(arg5 < var17) {
         float var18 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg12 - var18) * (float)(arg4 & 255) + var18 * 256.0F) * (float)var13) >> 6;
         arg4 += arg11;
      }

      arg10.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("ako.db(FI[F[IIIIIIIILako;IF)I")
   private static int method3683(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, float arg13) {
      int var14 = arg6 * 128;
      int var15 = arg7 * 128;
      int var16;
      if (arg12 == 0 || (var16 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var16 = arg9;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var19 = arg4 >> 8;
         float var20 = arg2[var19];
         float var21 = (arg2[var19 + 1] - var20) * (float)(arg4 & 255) + var20 * 256.0F;
         var10001 = var17++;
         arg3[var10001] += (int)((float)var14 * var21) >> 6;
         int var26 = var17++;
         arg3[var26] += (int)((float)var15 * var21) >> 6;
         arg4 += arg12;
      }

      int var22;
      if (arg12 == 0 || (var22 = (var17 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
         var22 = arg9;
      }

      int var23 = var22 << 1;

      while(var17 < var23) {
         float var24 = arg2[arg4 >> 8];
         float var25 = (arg13 - var24) * (float)(arg4 & 255) + var24 * 256.0F;
         var10001 = var17++;
         arg3[var10001] += (int)((float)var14 * var25) >> 6;
         var10001 = var17++;
         arg3[var10001] += (int)((float)var15 * var25) >> 6;
         arg4 += arg12;
      }

      arg11.field1586 = arg4;
      return var17 >> 1;
   }

   @deob.ObfuscatedName("ako.dt(FI[F[IIIIIIILako;IF)I")
   private static int method3684(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10, int arg11, float arg12) {
      int var13 = arg6 * 128;
      int var14;
      if (arg11 == 0 || (var14 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var14 = arg8;
      }

      int var10001;
      while(arg5 < var14) {
         int var15 = arg4 >> 8;
         float var16 = arg2[var15 - 1];
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg2[var15] - var16) * (float)(arg4 & 255) + var16 * 256.0F) * (float)var13) >> 6;
         arg4 += arg11;
      }

      int var17;
      if (arg11 == 0 || (var17 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var17 = arg8;
      }

      float var18 = arg12;

      while(arg5 < var17) {
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg2[arg4 >> 8] - var18) * (float)(arg4 & 255) + var18 * 256.0F) * (float)var13) >> 6;
         arg4 += arg11;
      }

      arg10.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("ako.dv(FI[F[IIIIIIIILako;IF)I")
   private static int method3685(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, float arg13) {
      int var14 = arg6 * 128;
      int var15 = arg7 * 128;
      int var16;
      if (arg12 == 0 || (var16 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var16 = arg9;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var19 = arg4 >> 8;
         float var20 = arg2[var19 - 1];
         float var21 = (arg2[var19] - var20) * (float)(arg4 & 255) + var20 * 256.0F;
         var10001 = var17++;
         arg3[var10001] += (int)((float)var14 * var21) >> 6;
         int var25 = var17++;
         arg3[var25] += (int)((float)var15 * var21) >> 6;
         arg4 += arg12;
      }

      int var22;
      if (arg12 == 0 || (var22 = (var17 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
         var22 = arg9;
      }

      int var23 = var22 << 1;

      while(var17 < var23) {
         float var24 = (arg2[arg4 >> 8] - arg13) * (float)(arg4 & 255) + arg13 * 256.0F;
         var10001 = var17++;
         arg3[var10001] += (int)((float)var14 * var24) >> 6;
         var10001 = var17++;
         arg3[var10001] += (int)((float)var15 * var24) >> 6;
         arg4 += arg12;
      }

      arg11.field1586 = arg4;
      return var17 >> 1;
   }

   @deob.ObfuscatedName("ako.dj([F[IIIIIIIILako;)I")
   private static int method3686(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class287 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14 = var12 * 128;
      int var15 = var13 * 128;
      int var16;
      if ((var16 = arg3 + var11 - var10) > arg7) {
         var16 = arg7;
      }

      arg9.field1588 += arg9.field1589 * (var16 - arg3);
      arg9.field1587 += arg9.field1590 * (var16 - arg3);
      var16 -= 3;

      int var10001;
      while(arg3 < var16) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var10++] * (float)var14);
         int var17 = var14 + var15;
         int var20 = arg3++;
         arg1[var20] = (int)((float)arg1[var20] + arg0[var10++] * (float)var17);
         int var18 = var15 + var17;
         int var21 = arg3++;
         arg1[var21] = (int)((float)arg1[var21] + arg0[var10++] * (float)var18);
         int var19 = var15 + var18;
         int var22 = arg3++;
         arg1[var22] = (int)((float)arg1[var22] + arg0[var10++] * (float)var19);
         var14 = var15 + var19;
      }

      var16 += 3;

      while(arg3 < var16) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var10++] * (float)var14);
         var14 += var15;
      }

      arg9.field1585 = var14 / 128 >> 2;
      arg9.field1586 = var10 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("ako.di(F[F[IIIIIIIIIILako;)I")
   private static int method3702(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class287 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19 = var15 * 128;
      int var20 = var17 * 128;
      int var21 = var16 * 128;
      int var22 = var18 * 128;
      int var23;
      if ((var23 = arg4 + var14 - var13) > arg10) {
         var23 = arg10;
      }

      arg12.field1585 += arg12.field1583 * (var23 - arg4);
      int var24 = arg4 << 1;
      int var25 = var23 << 1;
      int var48 = var25 - 6;

      while(var24 < var48) {
         float var26 = arg1[var13++];
         int var37 = var24++;
         arg2[var37] = (int)((float)arg2[var37] + (float)var19 * var26);
         int var27 = var19 + var20;
         int var38 = var24++;
         arg2[var38] = (int)((float)arg2[var38] + (float)var21 * var26);
         int var28 = var21 + var22;
         float var29 = arg1[var13++];
         int var40 = var24++;
         arg2[var40] = (int)((float)arg2[var40] + (float)var27 * var29);
         int var30 = var20 + var27;
         int var41 = var24++;
         arg2[var41] = (int)((float)arg2[var41] + (float)var28 * var29);
         int var31 = var22 + var28;
         float var32 = arg1[var13++];
         int var43 = var24++;
         arg2[var43] = (int)((float)arg2[var43] + (float)var30 * var32);
         int var33 = var20 + var30;
         int var44 = var24++;
         arg2[var44] = (int)((float)arg2[var44] + (float)var31 * var32);
         int var34 = var22 + var31;
         float var35 = arg1[var13++];
         int var46 = var24++;
         arg2[var46] = (int)((float)arg2[var46] + (float)var33 * var35);
         var19 = var20 + var33;
         int var47 = var24++;
         arg2[var47] = (int)((float)arg2[var47] + (float)var34 * var35);
         var21 = var22 + var34;
      }

      var25 = var48 + 6;

      while(var24 < var25) {
         float var36 = arg1[var13++];
         int var10001 = var24++;
         arg2[var10001] = (int)((float)arg2[var10001] + (float)var19 * var36);
         var19 += var20;
         int var49 = var24++;
         arg2[var49] = (int)((float)arg2[var49] + (float)var21 * var36);
         var21 += var22;
      }

      arg12.field1588 = var19 / 128 >> 2;
      arg12.field1587 = var21 / 128 >> 2;
      arg12.field1586 = var13 << 8;
      return var24 >> 1;
   }

   @deob.ObfuscatedName("ako.dx([F[IIIIIIIILako;)I")
   private static int method3700(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class287 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14 = var12 * 128;
      int var15 = var13 * 128;
      int var16;
      if ((var16 = arg3 + var10 - (var11 - 1)) > arg7) {
         var16 = arg7;
      }

      arg9.field1588 += arg9.field1589 * (var16 - arg3);
      arg9.field1587 += arg9.field1590 * (var16 - arg3);
      var16 -= 3;

      int var10001;
      while(arg3 < var16) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var10--] * (float)var14);
         int var17 = var14 + var15;
         int var20 = arg3++;
         arg1[var20] = (int)((float)arg1[var20] + arg0[var10--] * (float)var17);
         int var18 = var15 + var17;
         int var21 = arg3++;
         arg1[var21] = (int)((float)arg1[var21] + arg0[var10--] * (float)var18);
         int var19 = var15 + var18;
         int var22 = arg3++;
         arg1[var22] = (int)((float)arg1[var22] + arg0[var10--] * (float)var19);
         var14 = var15 + var19;
      }

      var16 += 3;

      while(arg3 < var16) {
         var10001 = arg3++;
         arg1[var10001] = (int)((float)arg1[var10001] + arg0[var10--] * (float)var14);
         var14 += var15;
      }

      arg9.field1585 = var14 / 128 >> 2;
      arg9.field1586 = var10 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("ako.dl(F[F[IIIIIIIIIILako;)I")
   private static int method3689(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class287 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19 = var15 * 128;
      int var20 = var17 * 128;
      int var21 = var16 * 128;
      int var22 = var18 * 128;
      int var23;
      if ((var23 = arg4 + var13 - (var14 - 1)) > arg10) {
         var23 = arg10;
      }

      arg12.field1585 += arg12.field1583 * (var23 - arg4);
      int var24 = arg4 << 1;
      int var25 = var23 << 1;
      int var48 = var25 - 6;

      while(var24 < var48) {
         float var26 = arg1[var13--];
         int var37 = var24++;
         arg2[var37] = (int)((float)arg2[var37] + (float)var19 * var26);
         int var27 = var19 + var20;
         int var38 = var24++;
         arg2[var38] = (int)((float)arg2[var38] + (float)var21 * var26);
         int var28 = var21 + var22;
         float var29 = arg1[var13--];
         int var40 = var24++;
         arg2[var40] = (int)((float)arg2[var40] + (float)var27 * var29);
         int var30 = var20 + var27;
         int var41 = var24++;
         arg2[var41] = (int)((float)arg2[var41] + (float)var28 * var29);
         int var31 = var22 + var28;
         float var32 = arg1[var13--];
         int var43 = var24++;
         arg2[var43] = (int)((float)arg2[var43] + (float)var30 * var32);
         int var33 = var20 + var30;
         int var44 = var24++;
         arg2[var44] = (int)((float)arg2[var44] + (float)var31 * var32);
         int var34 = var22 + var31;
         float var35 = arg1[var13--];
         int var46 = var24++;
         arg2[var46] = (int)((float)arg2[var46] + (float)var33 * var35);
         var19 = var20 + var33;
         int var47 = var24++;
         arg2[var47] = (int)((float)arg2[var47] + (float)var34 * var35);
         var21 = var22 + var34;
      }

      var25 = var48 + 6;

      while(var24 < var25) {
         float var36 = arg1[var13--];
         int var10001 = var24++;
         arg2[var10001] = (int)((float)arg2[var10001] + (float)var19 * var36);
         var19 += var20;
         int var49 = var24++;
         arg2[var49] = (int)((float)arg2[var49] + (float)var21 * var36);
         var21 += var22;
      }

      arg12.field1588 = var19 / 128 >> 2;
      arg12.field1587 = var21 / 128 >> 2;
      arg12.field1586 = var13 << 8;
      return var24 >> 1;
   }

   @deob.ObfuscatedName("ako.da(FI[F[IIIIIIIILako;IF)I")
   private static int method3687(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, float arg13) {
      int var14 = arg6 * 128;
      int var15 = arg7 * 128;
      arg11.field1588 -= arg11.field1589 * arg5;
      arg11.field1587 -= arg11.field1590 * arg5;
      int var16;
      if (arg12 == 0 || (var16 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var16 = arg9;
      }

      int var10001;
      while(arg5 < var16) {
         int var17 = arg4 >> 8;
         float var18 = arg2[var17];
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg2[var17 + 1] - var18) * (float)(arg4 & 255) + var18 * 256.0F) * (float)var14) >> 6;
         var14 += var15;
         arg4 += arg12;
      }

      int var19;
      if (arg12 == 0 || (var19 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
         var19 = arg9;
      }

      while(arg5 < var19) {
         float var20 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg13 - var20) * (float)(arg4 & 255) + var20 * 256.0F) * (float)var14) >> 6;
         var14 += var15;
         arg4 += arg12;
      }

      arg11.field1588 += arg11.field1589 * arg5;
      arg11.field1587 += arg11.field1590 * arg5;
      arg11.field1585 = var14 / 128;
      arg11.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("ako.dg(FI[F[IIIIIIIIIILako;IF)I")
   private static int method3691(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class287 arg13, int arg14, float arg15) {
      int var16 = arg6 * 128;
      int var17 = arg8 * 128;
      int var18 = arg7 * 128;
      int var19 = arg9 * 128;
      arg13.field1585 -= arg13.field1583 * arg5;
      int var20;
      if (arg14 == 0 || (var20 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
         var20 = arg11;
      }

      int var21 = arg5 << 1;
      int var22 = var20 << 1;

      int var10001;
      while(var21 < var22) {
         int var23 = arg4 >> 8;
         float var24 = arg2[var23];
         float var25 = (arg2[var23 + 1] - var24) * (float)(arg4 & 255) + var24 * 256.0F;
         var10001 = var21++;
         arg3[var10001] += (int)((float)var16 * var25) >> 6;
         var16 += var17;
         int var31 = var21++;
         arg3[var31] += (int)((float)var18 * var25) >> 6;
         var18 += var19;
         arg4 += arg14;
      }

      int var26;
      if (arg14 == 0 || (var26 = (var21 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
         var26 = arg11;
      }

      int var27 = var26 << 1;

      while(var21 < var27) {
         float var28 = arg2[arg4 >> 8];
         float var29 = (arg15 - var28) * (float)(arg4 & 255) + var28 * 256.0F;
         var10001 = var21++;
         arg3[var10001] += (int)((float)var16 * var29) >> 6;
         var16 += var17;
         var10001 = var21++;
         arg3[var10001] += (int)((float)var18 * var29) >> 6;
         var18 += var19;
         arg4 += arg14;
      }

      int var30 = var21 >> 1;
      arg13.field1585 += arg13.field1583 * var30;
      arg13.field1588 = var16 / 128;
      arg13.field1587 = var18 / 128;
      arg13.field1586 = arg4;
      return var30;
   }

   @deob.ObfuscatedName("ako.du(FI[F[IIIIIIIILako;IF)I")
   private static int method3692(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, float arg13) {
      int var14 = arg6 * 128;
      int var15 = arg7 * 128;
      arg11.field1588 -= arg11.field1589 * arg5;
      arg11.field1587 -= arg11.field1590 * arg5;
      int var16;
      if (arg12 == 0 || (var16 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var16 = arg9;
      }

      int var10001;
      while(arg5 < var16) {
         int var17 = arg4 >> 8;
         float var18 = arg2[var17 - 1];
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg2[var17] - var18) * (float)(arg4 & 255) + var18 * 256.0F) * (float)var14) >> 6;
         var14 += var15;
         arg4 += arg12;
      }

      int var19;
      if (arg12 == 0 || (var19 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var19 = arg9;
      }

      float var20 = arg13;

      while(arg5 < var19) {
         var10001 = arg5++;
         arg3[var10001] += (int)(((arg2[arg4 >> 8] - var20) * (float)(arg4 & 255) + var20 * 256.0F) * (float)var14) >> 6;
         var14 += var15;
         arg4 += arg12;
      }

      arg11.field1588 += arg11.field1589 * arg5;
      arg11.field1587 += arg11.field1590 * arg5;
      arg11.field1585 = var14 / 128;
      arg11.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("ako.dn(FI[F[IIIIIIIIIILako;IF)I")
   private static int method3681(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class287 arg13, int arg14, float arg15) {
      int var16 = arg6 * 128;
      int var17 = arg8 * 128;
      int var18 = arg7 * 128;
      int var19 = arg9 * 128;
      arg13.field1585 -= arg13.field1583 * arg5;
      int var20;
      if (arg14 == 0 || (var20 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
         var20 = arg11;
      }

      int var21 = arg5 << 1;
      int var22 = var20 << 1;

      int var10001;
      while(var21 < var22) {
         int var23 = arg4 >> 8;
         float var24 = arg2[var23 - 1];
         float var25 = (arg2[var23] - var24) * (float)(arg4 & 255) + var24 * 256.0F;
         var10001 = var21++;
         arg3[var10001] += (int)((float)var16 * var25) >> 6;
         var16 += var17;
         int var30 = var21++;
         arg3[var30] += (int)((float)var18 * var25) >> 6;
         var18 += var19;
         arg4 += arg14;
      }

      int var26;
      if (arg14 == 0 || (var26 = (var21 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
         var26 = arg11;
      }

      int var27 = var26 << 1;

      while(var21 < var27) {
         float var28 = (arg2[arg4 >> 8] - arg15) * (float)(arg4 & 255) + arg15 * 256.0F;
         var10001 = var21++;
         arg3[var10001] += (int)((float)var16 * var28) >> 6;
         var16 += var17;
         var10001 = var21++;
         arg3[var10001] += (int)((float)var18 * var28) >> 6;
         var18 += var19;
         arg4 += arg14;
      }

      int var29 = var21 >> 1;
      arg13.field1585 += arg13.field1583 * var29;
      arg13.field1588 = var16 / 128;
      arg13.field1587 = var18 / 128;
      arg13.field1586 = arg4;
      return var29;
   }
}
