@deob.ObfuscatedName("akv")
public class class294 extends class235 {
   public class294(class302 arg0, int arg1, int arg2, int arg3) {
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

   @deob.ObfuscatedName("akv.p([III)V")
   public synchronized void method1244(int[] arg0, int arg1, int arg2) {
      if (this.field1582 == 0 && this.field1595 == 0) {
         this.method1254(arg2);
      } else {
         int var4 = this.field1592 << 8;
         int var5 = this.field1581 << 8;
         int var6 = ((class302)this.field675).field1910.length << 8;
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
                  var8 = this.method3750(arg0, arg1, var4, var9, ((class302)this.field675).field1910[this.field1592]);
                  if (this.field1586 >= var4) {
                     return;
                  }

                  this.field1586 = var4 + var4 - 1 - this.field1586;
                  this.field1594 = -(this.field1594 * 1151273631) * -274099873;
               }

               while(true) {
                  int var10 = this.method3749(arg0, var8, var5, var9, ((class302)this.field675).field1910[this.field1581 - 1]);
                  if (this.field1586 < var5) {
                     return;
                  }

                  this.field1586 = var5 + var5 - 1 - this.field1586;
                  this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                  var8 = this.method3750(arg0, var10, var4, var9, ((class302)this.field675).field1910[this.field1592]);
                  if (this.field1586 >= var4) {
                     return;
                  }

                  this.field1586 = var4 + var4 - 1 - this.field1586;
                  this.field1594 = -(this.field1594 * 1151273631) * -274099873;
               }
            } else if (this.field1594 < 0) {
               while(true) {
                  var8 = this.method3750(arg0, var8, var4, var9, ((class302)this.field675).field1910[this.field1581 - 1]);
                  if (this.field1586 >= var4) {
                     return;
                  }

                  this.field1586 = var5 - 1 - (var5 - 1 - this.field1586) % var7;
               }
            } else {
               while(true) {
                  var8 = this.method3749(arg0, var8, var5, var9, ((class302)this.field675).field1910[this.field1592]);
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
                        var8 = this.method3750(arg0, arg1, var4, var9, ((class302)this.field675).field1910[this.field1592]);
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
                        var8 = this.method3749(arg0, var8, var5, var9, ((class302)this.field675).field1910[this.field1581 - 1]);
                        if (this.field1586 < var5) {
                           return;
                        }

                        this.field1586 = var5 + var5 - 1 - this.field1586;
                        this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                        if (--this.field1591 == 0) {
                           break;
                        }

                        var8 = this.method3750(arg0, var8, var4, var9, ((class302)this.field675).field1910[this.field1592]);
                        if (this.field1586 >= var4) {
                           return;
                        }

                        this.field1586 = var4 + var4 - 1 - this.field1586;
                        this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                     } while(--this.field1591 != 0);
                  }
               } else if (this.field1594 < 0) {
                  while(true) {
                     var8 = this.method3750(arg0, var8, var4, var9, ((class302)this.field675).field1910[this.field1581 - 1]);
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
                     var8 = this.method3749(arg0, var8, var5, var9, ((class302)this.field675).field1910[this.field1592]);
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
               this.method3750(arg0, var8, 0, var9, 0);
               if (this.field1586 < 0) {
                  this.field1586 = -1;
                  this.method3257();
                  this.method9864();
               }
            } else {
               this.method3749(arg0, var8, var6, var9, 0);
               if (this.field1586 >= var6) {
                  this.field1586 = var6;
                  this.method3257();
                  this.method9864();
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("akv.dp([IIIII)I")
   private int method3749(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      while(true) {
         if (this.field1595 > 0) {
            int var6 = this.field1595 + arg1;
            if (var6 > arg3) {
               var6 = arg3;
            }

            this.field1595 += arg1;
            if (this.field1594 == 256 && (this.field1586 & 255) == 0) {
               if (Statics.field5844) {
                  arg1 = method3764(0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this);
               } else {
                  arg1 = method3807(((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this);
               }
            } else if (Statics.field5844) {
               arg1 = method3784(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this, this.field1594, arg4);
            } else {
               arg1 = method3801(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this, this.field1594, arg4);
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
               return method3756(0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this);
            }

            return method3751(((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this);
         }

         if (Statics.field5844) {
            return method3804(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this, this.field1594, arg4);
         }

         return method3792(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this, this.field1594, arg4);
      }
   }

   @deob.ObfuscatedName("akv.dh([IIIII)I")
   private int method3750(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      while(true) {
         if (this.field1595 > 0) {
            int var6 = this.field1595 + arg1;
            if (var6 > arg3) {
               var6 = arg3;
            }

            this.field1595 += arg1;
            if (this.field1594 == -256 && (this.field1586 & 255) == 0) {
               if (Statics.field5844) {
                  arg1 = method3762(0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this);
               } else {
                  arg1 = method3761(((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this);
               }
            } else if (Statics.field5844) {
               arg1 = method3766(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, this.field1589, this.field1590, 0, var6, arg2, this, this.field1594, arg4);
            } else {
               arg1 = method3758(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, this.field1583, 0, var6, arg2, this, this.field1594, arg4);
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
               return method3754(0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this);
            }

            return method3753(((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this);
         }

         if (Statics.field5844) {
            return method3748(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1588, this.field1587, 0, arg3, arg2, this, this.field1594, arg4);
         }

         return method3757(0, 0, ((class302)this.field675).field1910, arg0, this.field1586, arg1, this.field1585, 0, arg3, arg2, this, this.field1594, arg4);
      }
   }

   @deob.ObfuscatedName("akv.dc([B[IIIIIIILakv;)I")
   private static int method3751(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class294 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12;
      if ((var12 = arg3 + var10 - var9) > arg6) {
         var12 = arg6;
      }

      var12 -= 3;

      int var10001;
      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9++] * var11;
         int var13 = arg3++;
         arg1[var13] += arg0[var9++] * var11;
         int var14 = arg3++;
         arg1[var14] += arg0[var9++] * var11;
         int var15 = arg3++;
         arg1[var15] += arg0[var9++] * var11;
      }

      var12 += 3;

      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9++] * var11;
      }

      arg8.field1586 = var9 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("akv.dw(I[B[IIIIIIIILakv;)I")
   private static int method3756(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15;
      if ((var15 = arg4 + var12 - var11) > arg8) {
         var15 = arg8;
      }

      int var16 = arg4 << 1;
      int var17 = var15 << 1;
      int var23 = var17 - 6;

      while(var16 < var23) {
         byte var18 = arg1[var11++];
         int var24 = var16++;
         arg2[var24] += var13 * var18;
         int var25 = var16++;
         arg2[var25] += var14 * var18;
         byte var19 = arg1[var11++];
         int var27 = var16++;
         arg2[var27] += var13 * var19;
         int var28 = var16++;
         arg2[var28] += var14 * var19;
         byte var20 = arg1[var11++];
         int var30 = var16++;
         arg2[var30] += var13 * var20;
         int var31 = var16++;
         arg2[var31] += var14 * var20;
         byte var21 = arg1[var11++];
         int var33 = var16++;
         arg2[var33] += var13 * var21;
         int var34 = var16++;
         arg2[var34] += var14 * var21;
      }

      var17 = var23 + 6;

      while(var16 < var17) {
         byte var22 = arg1[var11++];
         int var10001 = var16++;
         arg2[var10001] += var13 * var22;
         int var35 = var16++;
         arg2[var35] += var14 * var22;
      }

      arg10.field1586 = var11 << 8;
      return var16 >> 1;
   }

   @deob.ObfuscatedName("akv.ds([B[IIIIIIILakv;)I")
   private static int method3753(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class294 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12;
      if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
         var12 = arg6;
      }

      var12 -= 3;

      int var10001;
      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9--] * var11;
         int var13 = arg3++;
         arg1[var13] += arg0[var9--] * var11;
         int var14 = arg3++;
         arg1[var14] += arg0[var9--] * var11;
         int var15 = arg3++;
         arg1[var15] += arg0[var9--] * var11;
      }

      var12 += 3;

      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9--] * var11;
      }

      arg8.field1586 = var9 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("akv.dm(I[B[IIIIIIIILakv;)I")
   private static int method3754(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15;
      if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
         var15 = arg8;
      }

      int var16 = arg4 << 1;
      int var17 = var15 << 1;
      int var23 = var17 - 6;

      while(var16 < var23) {
         byte var18 = arg1[var11--];
         int var24 = var16++;
         arg2[var24] += var13 * var18;
         int var25 = var16++;
         arg2[var25] += var14 * var18;
         byte var19 = arg1[var11--];
         int var27 = var16++;
         arg2[var27] += var13 * var19;
         int var28 = var16++;
         arg2[var28] += var14 * var19;
         byte var20 = arg1[var11--];
         int var30 = var16++;
         arg2[var30] += var13 * var20;
         int var31 = var16++;
         arg2[var31] += var14 * var20;
         byte var21 = arg1[var11--];
         int var33 = var16++;
         arg2[var33] += var13 * var21;
         int var34 = var16++;
         arg2[var34] += var14 * var21;
      }

      var17 = var23 + 6;

      while(var16 < var17) {
         byte var22 = arg1[var11--];
         int var10001 = var16++;
         arg2[var10001] += var13 * var22;
         int var35 = var16++;
         arg2[var35] += var14 * var22;
      }

      arg10.field1586 = var11 << 8;
      return var16 >> 1;
   }

   @deob.ObfuscatedName("akv.dq(II[B[IIIIIIILakv;II)I")
   private static int method3792(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10, int arg11, int arg12) {
      int var13;
      if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
         var13 = arg8;
      }

      int var10001;
      while(arg5 < var13) {
         int var14 = arg4 >> 8;
         byte var15 = arg2[var14];
         var10001 = arg5++;
         arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
         arg4 += arg11;
      }

      int var16;
      if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
         var16 = arg8;
      }

      int var17 = arg12;

      while(arg5 < var16) {
         byte var18 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (var17 - var18)) * arg6 >> 6;
         arg4 += arg11;
      }

      arg10.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("akv.db(II[B[IIIIIIIILakv;II)I")
   private static int method3804(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
      int var14;
      if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var15 = arg5 << 1;
      int var16 = var14 << 1;

      int var10001;
      while(var15 < var16) {
         int var17 = arg4 >> 8;
         byte var18 = arg2[var17];
         int var19 = (var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18);
         var10001 = var15++;
         arg3[var10001] += arg6 * var19 >> 6;
         int var25 = var15++;
         arg3[var25] += arg7 * var19 >> 6;
         arg4 += arg12;
      }

      int var20;
      if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
         var20 = arg9;
      }

      int var21 = var20 << 1;
      int var22 = arg13;

      while(var15 < var21) {
         byte var23 = arg2[arg4 >> 8];
         int var24 = (var23 << 8) + (arg4 & 255) * (var22 - var23);
         var10001 = var15++;
         arg3[var10001] += arg6 * var24 >> 6;
         var10001 = var15++;
         arg3[var10001] += arg7 * var24 >> 6;
         arg4 += arg12;
      }

      arg11.field1586 = arg4;
      return var15 >> 1;
   }

   @deob.ObfuscatedName("akv.dt(II[B[IIIIIIILakv;II)I")
   private static int method3757(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10, int arg11, int arg12) {
      int var13;
      if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var13 = arg8;
      }

      int var10001;
      while(arg5 < var13) {
         int var14 = arg4 >> 8;
         byte var15 = arg2[var14 - 1];
         var10001 = arg5++;
         arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[var14] - var15)) * arg6 >> 6;
         arg4 += arg11;
      }

      int var16;
      if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var16 = arg8;
      }

      int var17 = arg12;
      int var18 = arg11;

      while(arg5 < var16) {
         var10001 = arg5++;
         arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
         arg4 += var18;
      }

      arg10.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("akv.dv(II[B[IIIIIIIILakv;II)I")
   private static int method3748(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
      int var14;
      if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var15 = arg5 << 1;
      int var16 = var14 << 1;

      int var10001;
      while(var15 < var16) {
         int var17 = arg4 >> 8;
         byte var18 = arg2[var17 - 1];
         int var19 = (var18 << 8) + (arg4 & 255) * (arg2[var17] - var18);
         var10001 = var15++;
         arg3[var10001] += arg6 * var19 >> 6;
         int var24 = var15++;
         arg3[var24] += arg7 * var19 >> 6;
         arg4 += arg12;
      }

      int var20;
      if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
         var20 = arg9;
      }

      int var21 = var20 << 1;
      int var22 = arg13;

      while(var15 < var21) {
         int var23 = (var22 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var22);
         var10001 = var15++;
         arg3[var10001] += arg6 * var23 >> 6;
         var10001 = var15++;
         arg3[var10001] += arg7 * var23 >> 6;
         arg4 += arg12;
      }

      arg11.field1586 = arg4;
      return var15 >> 1;
   }

   @deob.ObfuscatedName("akv.dj([B[IIIIIIIILakv;)I")
   private static int method3807(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class294 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var11 - var10) > arg7) {
         var14 = arg7;
      }

      arg9.field1588 += arg9.field1589 * (var14 - arg3);
      arg9.field1587 += arg9.field1590 * (var14 - arg3);
      var14 -= 3;

      int var10001;
      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10++] * var12;
         int var15 = var12 + var13;
         int var18 = arg3++;
         arg1[var18] += arg0[var10++] * var15;
         int var16 = var13 + var15;
         int var19 = arg3++;
         arg1[var19] += arg0[var10++] * var16;
         int var17 = var13 + var16;
         int var20 = arg3++;
         arg1[var20] += arg0[var10++] * var17;
         var12 = var13 + var17;
      }

      var14 += 3;

      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10++] * var12;
         var12 += var13;
      }

      arg9.field1585 = var12 >> 2;
      arg9.field1586 = var10 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("akv.di(I[B[IIIIIIIIIILakv;)I")
   private static int method3764(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class294 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19;
      if ((var19 = arg4 + var14 - var13) > arg10) {
         var19 = arg10;
      }

      arg12.field1585 += arg12.field1583 * (var19 - arg4);
      int var20 = arg4 << 1;
      int var21 = var19 << 1;
      int var44 = var21 - 6;

      while(var20 < var44) {
         byte var22 = arg1[var13++];
         int var33 = var20++;
         arg2[var33] += var15 * var22;
         int var23 = var15 + var17;
         int var34 = var20++;
         arg2[var34] += var16 * var22;
         int var24 = var16 + var18;
         byte var25 = arg1[var13++];
         int var36 = var20++;
         arg2[var36] += var23 * var25;
         int var26 = var17 + var23;
         int var37 = var20++;
         arg2[var37] += var24 * var25;
         int var27 = var18 + var24;
         byte var28 = arg1[var13++];
         int var39 = var20++;
         arg2[var39] += var26 * var28;
         int var29 = var17 + var26;
         int var40 = var20++;
         arg2[var40] += var27 * var28;
         int var30 = var18 + var27;
         byte var31 = arg1[var13++];
         int var42 = var20++;
         arg2[var42] += var29 * var31;
         var15 = var17 + var29;
         int var43 = var20++;
         arg2[var43] += var30 * var31;
         var16 = var18 + var30;
      }

      var21 = var44 + 6;

      while(var20 < var21) {
         byte var32 = arg1[var13++];
         int var10001 = var20++;
         arg2[var10001] += var15 * var32;
         var15 += var17;
         int var45 = var20++;
         arg2[var45] += var16 * var32;
         var16 += var18;
      }

      arg12.field1588 = var15 >> 2;
      arg12.field1587 = var16 >> 2;
      arg12.field1586 = var13 << 8;
      return var20 >> 1;
   }

   @deob.ObfuscatedName("akv.dx([B[IIIIIIIILakv;)I")
   private static int method3761(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class294 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
         var14 = arg7;
      }

      arg9.field1588 += arg9.field1589 * (var14 - arg3);
      arg9.field1587 += arg9.field1590 * (var14 - arg3);
      var14 -= 3;

      int var10001;
      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10--] * var12;
         int var15 = var12 + var13;
         int var18 = arg3++;
         arg1[var18] += arg0[var10--] * var15;
         int var16 = var13 + var15;
         int var19 = arg3++;
         arg1[var19] += arg0[var10--] * var16;
         int var17 = var13 + var16;
         int var20 = arg3++;
         arg1[var20] += arg0[var10--] * var17;
         var12 = var13 + var17;
      }

      var14 += 3;

      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10--] * var12;
         var12 += var13;
      }

      arg9.field1585 = var12 >> 2;
      arg9.field1586 = var10 << 8;
      return arg3;
   }

   @deob.ObfuscatedName("akv.dl(I[B[IIIIIIIIIILakv;)I")
   private static int method3762(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class294 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19;
      if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
         var19 = arg10;
      }

      arg12.field1585 += arg12.field1583 * (var19 - arg4);
      int var20 = arg4 << 1;
      int var21 = var19 << 1;
      int var44 = var21 - 6;

      while(var20 < var44) {
         byte var22 = arg1[var13--];
         int var33 = var20++;
         arg2[var33] += var15 * var22;
         int var23 = var15 + var17;
         int var34 = var20++;
         arg2[var34] += var16 * var22;
         int var24 = var16 + var18;
         byte var25 = arg1[var13--];
         int var36 = var20++;
         arg2[var36] += var23 * var25;
         int var26 = var17 + var23;
         int var37 = var20++;
         arg2[var37] += var24 * var25;
         int var27 = var18 + var24;
         byte var28 = arg1[var13--];
         int var39 = var20++;
         arg2[var39] += var26 * var28;
         int var29 = var17 + var26;
         int var40 = var20++;
         arg2[var40] += var27 * var28;
         int var30 = var18 + var27;
         byte var31 = arg1[var13--];
         int var42 = var20++;
         arg2[var42] += var29 * var31;
         var15 = var17 + var29;
         int var43 = var20++;
         arg2[var43] += var30 * var31;
         var16 = var18 + var30;
      }

      var21 = var44 + 6;

      while(var20 < var21) {
         byte var32 = arg1[var13--];
         int var10001 = var20++;
         arg2[var10001] += var15 * var32;
         var15 += var17;
         int var45 = var20++;
         arg2[var45] += var16 * var32;
         var16 += var18;
      }

      arg12.field1588 = var15 >> 2;
      arg12.field1587 = var16 >> 2;
      arg12.field1586 = var13 << 8;
      return var20 >> 1;
   }

   @deob.ObfuscatedName("akv.da(II[B[IIIIIIIILakv;II)I")
   private static int method3801(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
      arg11.field1588 -= arg11.field1589 * arg5;
      arg11.field1587 -= arg11.field1590 * arg5;
      int var14;
      if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var10001;
      while(arg5 < var14) {
         int var15 = arg4 >> 8;
         byte var16 = arg2[var15];
         var10001 = arg5++;
         arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      int var17;
      if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
         var17 = arg9;
      }

      int var18 = arg13;

      while(arg5 < var17) {
         byte var19 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (var18 - var19)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      arg11.field1588 += arg11.field1589 * arg5;
      arg11.field1587 += arg11.field1590 * arg5;
      arg11.field1585 = arg6;
      arg11.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("akv.dg(II[B[IIIIIIIIIILakv;II)I")
   private static int method3784(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class294 arg13, int arg14, int arg15) {
      arg13.field1585 -= arg13.field1583 * arg5;
      int var16;
      if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
         var16 = arg11;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var19 = arg4 >> 8;
         byte var20 = arg2[var19];
         int var21 = (var20 << 8) + (arg4 & 255) * (arg2[var19 + 1] - var20);
         var10001 = var17++;
         arg3[var10001] += arg6 * var21 >> 6;
         arg6 += arg8;
         int var28 = var17++;
         arg3[var28] += arg7 * var21 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var22;
      if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
         var22 = arg11;
      }

      int var23 = var22 << 1;
      int var24 = arg15;

      while(var17 < var23) {
         byte var25 = arg2[arg4 >> 8];
         int var26 = (var25 << 8) + (arg4 & 255) * (var24 - var25);
         var10001 = var17++;
         arg3[var10001] += arg6 * var26 >> 6;
         arg6 += arg8;
         var10001 = var17++;
         arg3[var10001] += arg7 * var26 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var27 = var17 >> 1;
      arg13.field1585 += arg13.field1583 * var27;
      arg13.field1588 = arg6;
      arg13.field1587 = arg7;
      arg13.field1586 = arg4;
      return var27;
   }

   @deob.ObfuscatedName("akv.du(II[B[IIIIIIIILakv;II)I")
   private static int method3758(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
      arg11.field1588 -= arg11.field1589 * arg5;
      arg11.field1587 -= arg11.field1590 * arg5;
      int var14;
      if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var10001;
      while(arg5 < var14) {
         int var15 = arg4 >> 8;
         byte var16 = arg2[var15 - 1];
         var10001 = arg5++;
         arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[var15] - var16)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      int var17;
      if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var17 = arg9;
      }

      int var18 = arg13;
      int var19 = arg12;

      while(arg5 < var17) {
         var10001 = arg5++;
         arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += var19;
      }

      arg11.field1588 += arg11.field1589 * arg5;
      arg11.field1587 += arg11.field1590 * arg5;
      arg11.field1585 = arg6;
      arg11.field1586 = arg4;
      return arg5;
   }

   @deob.ObfuscatedName("akv.dn(II[B[IIIIIIIIIILakv;II)I")
   private static int method3766(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class294 arg13, int arg14, int arg15) {
      arg13.field1585 -= arg13.field1583 * arg5;
      int var16;
      if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
         var16 = arg11;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var19 = arg4 >> 8;
         byte var20 = arg2[var19 - 1];
         int var21 = (var20 << 8) + (arg4 & 255) * (arg2[var19] - var20);
         var10001 = var17++;
         arg3[var10001] += arg6 * var21 >> 6;
         arg6 += arg8;
         int var27 = var17++;
         arg3[var27] += arg7 * var21 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var22;
      if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
         var22 = arg11;
      }

      int var23 = var22 << 1;
      int var24 = arg15;

      while(var17 < var23) {
         int var25 = (var24 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var24);
         var10001 = var17++;
         arg3[var10001] += arg6 * var25 >> 6;
         arg6 += arg8;
         var10001 = var17++;
         arg3[var10001] += arg7 * var25 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var26 = var17 >> 1;
      arg13.field1585 += arg13.field1583 * var26;
      arg13.field1588 = arg6;
      arg13.field1587 = arg7;
      arg13.field1586 = arg4;
      return var26;
   }
}
