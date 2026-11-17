import java.util.Random;

@deob.ObfuscatedName("l")
public abstract class class609 {
   @deob.ObfuscatedName("l.r")
   private static int field5499 = -1;
   @deob.ObfuscatedName("l.p")
   private static int field5495 = -1;
   @deob.ObfuscatedName("l.o")
   private static int field5496 = 0;
   @deob.ObfuscatedName("l.a")
   private static int field5497 = 0;
   @deob.ObfuscatedName("l.x")
   private static int field5494 = 0;
   @deob.ObfuscatedName("l.s")
   private static int field5492 = 0;
   @deob.ObfuscatedName("l.l")
   private static int field5500 = 0;
   @deob.ObfuscatedName("l.u")
   private static int field5493 = 0;
   @deob.ObfuscatedName("l.v")
   private static String[] field5502 = new String[100];
   @deob.ObfuscatedName("l.k")
   private class772 field5491;
   @deob.ObfuscatedName("l.n")
   private class883 field5501;

   protected class609(class772 arg0, class883 arg1) {
      this.field5491 = arg0;
      this.field5501 = arg1;
   }

   @deob.ObfuscatedName("l.k(Ljava/lang/String;IIIIB)V")
   public void method8709(String arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 != null) {
         this.method8699(arg3, arg4);
         this.method8702(arg0, arg1, arg2, (class383[])null, (int[])null, (class826)null, 0, 0);
      }
   }

   @deob.ObfuscatedName("l.d(Ljava/lang/String;IIIIB)V")
   public void method8711(String arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 != null) {
         this.method8699(arg3, arg4);
         this.method8702(arg0, arg1 - this.field5501.method15384(arg0), arg2, (class383[])null, (int[])null, (class826)null, 0, 0);
      }
   }

   @deob.ObfuscatedName("l.b(Ljava/lang/String;IIIIB)V")
   public void method8691(String arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 != null) {
         this.method8699(arg3, arg4);
         this.method8702(arg0, arg1 - this.field5501.method15384(arg0) / 2, arg2, (class383[])null, (int[])null, (class826)null, 0, 0);
      }
   }

   @deob.ObfuscatedName("l.r(Ljava/lang/String;IIIIIIIII[Lcy;[ILta;III)I")
   public int method8692(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class383[] arg10, int[] arg11, class826 arg12, int arg13, int arg14) {
      return this.method8720(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
   }

   @deob.ObfuscatedName("l.p(Ljava/lang/String;IIIIIIIIII[Lcy;[ILta;III)I")
   public int method8720(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class383[] arg11, int[] arg12, class826 arg13, int arg14, int arg15) {
      if (arg0 == null) {
         return 0;
      } else {
         this.method8699(arg5, arg6);
         if (arg9 == 0) {
            arg9 = this.field5501.field9059;
         }

         int[] var17;
         if (arg4 < this.field5501.field9062 + this.field5501.field9061 + arg9 && arg4 < arg9 + arg9) {
            var17 = null;
         } else {
            var17 = new int[]{arg3};
         }

         int var18 = this.field5501.method15400(arg0, var17, field5502, arg11);
         if (arg10 == -1) {
            arg10 = arg4 / arg9;
            if (arg10 <= 0) {
               arg10 = 1;
            }
         }

         if (arg10 > 0 && var18 >= arg10) {
            field5502[arg10 - 1] = this.field5501.method15386(field5502[arg10 - 1], arg3, arg11);
            var18 = arg10;
         }

         if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
         }

         int var19;
         if (arg8 == 0) {
            var19 = this.field5501.field9061 + arg2;
         } else if (arg8 == 1) {
            var19 = (arg4 - this.field5501.field9061 - this.field5501.field9062 - (var18 - 1) * arg9) / 2 + this.field5501.field9061 + arg2;
         } else if (arg8 == 2) {
            var19 = arg2 + arg4 - this.field5501.field9062 - (var18 - 1) * arg9;
         } else {
            int var20 = (arg4 - this.field5501.field9061 - this.field5501.field9062 - (var18 - 1) * arg9) / (var18 + 1);
            if (var20 < 0) {
               var20 = 0;
            }

            var19 = this.field5501.field9061 + arg2 + var20;
            arg9 += var20;
         }

         for(int var21 = 0; var21 < var18; ++var21) {
            if (arg7 == 0) {
               this.method8702(field5502[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
            } else if (arg7 == 1) {
               this.method8702(field5502[var21], arg1 + (arg3 - this.field5501.method15384(field5502[var21])) / 2, var19, arg11, arg12, arg13, arg14, arg15);
            } else if (arg7 == 2) {
               this.method8702(field5502[var21], arg1 + arg3 - this.field5501.method15384(field5502[var21]), var19, arg11, arg12, arg13, arg14, arg15);
            } else if (var18 - 1 == var21) {
               this.method8702(field5502[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
            } else {
               this.method8700(field5502[var21], arg3);
               this.method8702(field5502[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
               field5500 = 0;
            }

            var19 += arg9;
         }

         return var18;
      }
   }

   @deob.ObfuscatedName("l.o(Ljava/lang/String;IIIIII)V")
   public void method8694(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 != null) {
         this.method8699(arg3, arg4);
         int var7 = arg0.length();
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < var7; ++var9) {
            var8[var9] = (int)(Math.sin((double)arg5 / 5.0D + (double)var9 / 2.0D) * 5.0D);
         }

         this.method8701(arg0, arg1 - this.field5501.method15384(arg0) / 2, arg2, (class383[])null, (int[])null, (int[])null, var8);
      }
   }

   @deob.ObfuscatedName("l.a(Ljava/lang/String;IIIIII)V")
   public void method8695(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 != null) {
         this.method8699(arg3, arg4);
         int var7 = arg0.length();
         int[] var8 = new int[var7];
         int[] var9 = new int[var7];

         for(int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = (int)(Math.sin((double)arg5 / 5.0D + (double)var10 / 5.0D) * 5.0D);
            var9[var10] = (int)(Math.sin((double)arg5 / 5.0D + (double)var10 / 3.0D) * 5.0D);
         }

         this.method8701(arg0, arg1 - this.field5501.method15384(arg0) / 2, arg2, (class383[])null, (int[])null, var8, var9);
      }
   }

   @deob.ObfuscatedName("l.x(Ljava/lang/String;IIIIIIB)V")
   public void method8690(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (arg0 != null) {
         this.method8699(arg3, arg4);
         double var8 = 7.0D - (double)arg6 / 8.0D;
         if (var8 < 0.0D) {
            var8 = 0.0D;
         }

         int var10 = arg0.length();
         int[] var11 = new int[var10];

         for(int var12 = 0; var12 < var10; ++var12) {
            var11[var12] = (int)(Math.sin((double)arg5 / 1.0D + (double)var12 / 1.5D) * var8);
         }

         this.method8701(arg0, arg1 - this.field5501.method15384(arg0) / 2, arg2, (class383[])null, (int[])null, (int[])null, var11);
      }
   }

   @deob.ObfuscatedName("l.s(Ljava/lang/String;IIIILjava/util/Random;I[Lcy;[II)I")
   public int method8697(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6, class383[] arg7, int[] arg8) {
      if (arg0 == null) {
         return 0;
      } else {
         arg5.setSeed((long)arg6);
         int var10 = 192 + (arg5.nextInt() & 31);
         this.method8699(var10 << 24 | arg3 & 16777215, var10 << 24 | arg4 & 16777215);
         int var11 = arg0.length();
         int[] var12 = new int[var11];
         int var13 = 0;

         for(int var14 = 0; var14 < var11; ++var14) {
            var12[var14] = var13;
            if ((arg5.nextInt() & 3) == 0) {
               ++var13;
            }
         }

         this.method8701(arg0, arg1, arg2, arg7, arg8, var12, (int[])null);
         return var13;
      }
   }

   @deob.ObfuscatedName("l.l(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lcy;[II)I")
   public int method8698(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11, class383[] arg12, int[] arg13) {
      if (arg0 == null) {
         return 0;
      } else {
         arg9.setSeed((long)arg10);
         int var15 = 192 + (arg9.nextInt() & 31);
         this.method8699(var15 << 24 | arg5 & 16777215, arg6 == -1 ? 0 : var15 << 24 | arg6 & 16777215);
         int var16 = arg0.length();
         int[] var17 = new int[var16];
         int var18 = 0;

         for(int var19 = 0; var19 < var16; ++var19) {
            var17[var19] = var18;
            if ((arg9.nextInt() & 3) == 0) {
               ++var18;
            }
         }

         int var20 = arg1;
         int var21 = this.field5501.field9061 + arg2;
         int var22 = -1;
         if (arg8 == 1) {
            var21 += (arg4 - this.field5501.field9061 - this.field5501.field9062) / 2;
         } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field5501.field9062;
         }

         if (arg7 == 1) {
            var22 = this.field5501.method15384(arg0) + var18;
            var20 = (arg3 - var22) / 2 + arg1;
         } else if (arg7 == 2) {
            var22 = this.field5501.method15384(arg0) + var18;
            var20 = arg3 - var22 + arg1;
         }

         this.method8701(arg0, var20, var21, arg12, arg13, var17, (int[])null);
         if (arg11 != null) {
            if (var22 == -1) {
               var22 = this.field5501.method15384(arg0) + var18;
            }

            arg11[0] = var20;
            arg11[1] = var21 - this.field5501.field9061;
            arg11[2] = var22;
            arg11[3] = this.field5501.field9062 + this.field5501.field9061;
         }

         return var18;
      }
   }

   @deob.ObfuscatedName("l.u(III)V")
   private void method8699(int arg0, int arg1) {
      field5499 = -1;
      field5495 = -1;
      field5496 = arg0;
      field5497 = arg0;
      field5500 = 0;
      field5493 = 0;
      if (arg1 == -1) {
         arg1 = 0;
      }

      field5494 = arg1;
      field5492 = arg1;
   }

   @deob.ObfuscatedName("l.v(Ljava/lang/String;S)V")
   private void method8710(String arg0) {
      try {
         if (arg0.startsWith("col=")) {
            field5497 = field5497 & -16777216 | class816.method14330(arg0.substring(4), 16) & 16777215;
         } else if (arg0.equals("/col")) {
            field5497 = field5497 & -16777216 | field5496 & 16777215;
         }

         if (arg0.startsWith("argb=")) {
            field5497 = class816.method14330(arg0.substring(5), 16);
         } else if (arg0.equals("/argb")) {
            field5497 = field5496;
         } else if (arg0.startsWith("str=")) {
            field5499 = field5497 & -16777216 | class816.method14330(arg0.substring(4), 16);
         } else if (arg0.equals("str")) {
            field5499 = field5497 & -16777216 | 8388608;
         } else if (arg0.equals("/str")) {
            field5499 = -1;
         } else if (arg0.startsWith("u=")) {
            field5495 = field5497 & -16777216 | class816.method14330(arg0.substring(2), 16);
         } else if (arg0.equals("u")) {
            field5495 = field5497 & -16777216;
         } else if (arg0.equals("/u")) {
            field5495 = -1;
         } else if (arg0.equalsIgnoreCase("shad=-1")) {
            field5492 = 0;
         } else if (arg0.startsWith("shad=")) {
            field5492 = field5497 & -16777216 | class816.method14330(arg0.substring(5), 16);
         } else if (arg0.equals("shad")) {
            field5492 = field5497 & -16777216;
         } else if (arg0.equals("/shad")) {
            field5492 = field5494;
         } else if (arg0.equals("br")) {
            this.method8699(field5496, field5494);
         }
      } catch (Exception var3) {
      }

   }

   @deob.ObfuscatedName("l.g(Ljava/lang/String;II)V")
   private void method8700(String arg0, int arg1) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < arg0.length(); ++var5) {
         char var6 = arg0.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         field5500 = (arg1 - this.field5501.method15384(arg0) << 8) / var3;
      }

   }

   @deob.ObfuscatedName("l.h(Ljava/lang/String;II[Lcy;[ILta;III)V")
   private void method8702(String arg0, int arg1, int arg2, class383[] arg3, int[] arg4, class826 arg5, int arg6, int arg7) {
      int var9 = arg2 - this.field5501.field9059;
      int var10 = -1;
      int var11 = -1;
      int var12 = arg0.length();

      for(int var13 = 0; var13 < var12; ++var13) {
         char var14 = (char)(class813.method9501(arg0.charAt(var13)) & 255);
         if (var14 == '<') {
            var10 = var13;
         } else {
            if (var14 == '>' && var10 != -1) {
               String var15 = arg0.substring(var10 + 1, var13);
               var10 = -1;
               if (var15.equals("lt")) {
                  var14 = '<';
               } else if (var15.equals("gt")) {
                  var14 = '>';
               } else if (var15.equals("nbsp")) {
                  var14 = 160;
               } else if (var15.equals("shy")) {
                  var14 = 173;
               } else if (var15.equals("times")) {
                  var14 = 215;
               } else if (var15.equals("euro")) {
                  var14 = 8364;
               } else if (var15.equals("copy")) {
                  var14 = 169;
               } else {
                  if (!var15.equals("reg")) {
                     if (var15.startsWith("img=")) {
                        try {
                           int var16 = class816.method5626(var15.substring(4));
                           class383 var17 = arg3[var16];
                           int var18 = arg4 != null ? arg4[var16] : var17.method5213();
                           if ((field5497 & -16777216) == -16777216) {
                              var17.method2388(arg1, this.field5501.field9059 + var9 - var18, 1, -1, 1);
                           } else {
                              var17.method2388(arg1, this.field5501.field9059 + var9 - var18, 0, field5497 & -16777216 | 16777215, 1);
                           }

                           arg1 += arg3[var16].method5259();
                           var11 = -1;
                        } catch (Exception var21) {
                        }
                     } else {
                        this.method8710(var15);
                     }
                     continue;
                  }

                  var14 = 174;
               }
            }

            if (var10 == -1) {
               if (var11 != -1) {
                  arg1 += this.field5501.method15382(var11, var14);
               }

               if (var14 != ' ') {
                  if (arg5 == null) {
                     if ((field5492 & -16777216) != 0) {
                        this.method5659(var14, arg1 + 1, var9 + 1, field5492, true);
                     }

                     this.method5659(var14, arg1, var9, field5497, false);
                  } else {
                     if ((field5492 & -16777216) != 0) {
                        this.method5671(var14, arg1 + 1, var9 + 1, field5492, true, arg5, arg6, arg7);
                     }

                     this.method5671(var14, arg1, var9, field5497, false, arg5, arg6, arg7);
                  }
               } else if (field5500 > 0) {
                  field5493 += field5500;
                  arg1 += field5493 >> 8;
                  field5493 &= 255;
               }

               int var20 = this.field5501.method15383(var14);
               if (field5499 != -1) {
                  this.field5491.method11493(arg1, (int)((double)this.field5501.field9059 * 0.7D) + var9, var20, field5499);
               }

               if (field5495 != -1) {
                  this.field5491.method11493(arg1, this.field5501.field9059 + var9 + 1, var20, field5495);
               }

               arg1 += var20;
               var11 = var14;
            }
         }
      }

   }

   @deob.ObfuscatedName("l.e(Ljava/lang/String;II[Lcy;[I[I[IB)V")
   private void method8701(String arg0, int arg1, int arg2, class383[] arg3, int[] arg4, int[] arg5, int[] arg6) {
      int var8 = arg2 - this.field5501.field9059;
      int var9 = -1;
      int var10 = -1;
      int var11 = 0;
      int var12 = arg0.length();

      for(int var13 = 0; var13 < var12; ++var13) {
         char var14 = (char)(class813.method9501(arg0.charAt(var13)) & 255);
         if (var14 == '<') {
            var9 = var13;
         } else {
            if (var14 == '>' && var9 != -1) {
               String var15 = arg0.substring(var9 + 1, var13);
               var9 = -1;
               if (var15.equals("lt")) {
                  var14 = '<';
               } else if (var15.equals("gt")) {
                  var14 = '>';
               } else if (var15.equals("nbsp")) {
                  var14 = 160;
               } else if (var15.equals("shy")) {
                  var14 = 173;
               } else if (var15.equals("times")) {
                  var14 = 215;
               } else if (var15.equals("euro")) {
                  var14 = 8364;
               } else if (var15.equals("copy")) {
                  var14 = 169;
               } else {
                  if (!var15.equals("reg")) {
                     if (var15.startsWith("img=")) {
                        try {
                           int var16;
                           if (arg5 != null) {
                              var16 = arg5[var11];
                           } else {
                              var16 = 0;
                           }

                           int var17;
                           if (arg6 != null) {
                              var17 = arg6[var11];
                           } else {
                              var17 = 0;
                           }

                           ++var11;
                           int var18 = class816.method5626(var15.substring(4));
                           class383 var19 = arg3[var18];
                           int var20 = arg4 != null ? arg4[var18] : var19.method5213();
                           var19.method2388(arg1 + var16, this.field5501.field9059 + var8 - var20 + var17, 1, -1, 1);
                           arg1 += arg3[var18].method5259();
                           var10 = -1;
                        } catch (Exception var25) {
                        }
                     } else {
                        this.method8710(var15);
                     }
                     continue;
                  }

                  var14 = 174;
               }
            }

            if (var9 == -1) {
               if (var10 != -1) {
                  arg1 += this.field5501.method15382(var10, var14);
               }

               int var22;
               if (arg5 != null) {
                  var22 = arg5[var11];
               } else {
                  var22 = 0;
               }

               int var23;
               if (arg6 != null) {
                  var23 = arg6[var11];
               } else {
                  var23 = 0;
               }

               ++var11;
               if (var14 != ' ') {
                  if ((field5492 & -16777216) != 0) {
                     this.method5659(var14, arg1 + 1 + var22, var8 + 1 + var23, field5492, true);
                  }

                  this.method5659(var14, arg1 + var22, var8 + var23, field5497, false);
               } else if (field5500 > 0) {
                  field5493 += field5500;
                  arg1 += field5493 >> 8;
                  field5493 &= 255;
               }

               int var24 = this.field5501.method15383(var14);
               if (field5499 != -1) {
                  this.field5491.method11493(arg1, (int)((double)this.field5501.field9059 * 0.7D) + var8, var24, field5499);
               }

               if (field5495 != -1) {
                  this.field5491.method11493(arg1, this.field5501.field9059 + var8, var24, field5495);
               }

               arg1 += var24;
               var10 = var14;
            }
         }
      }

   }

   @deob.ObfuscatedName("l.m(CIIIZLta;II)V")
   protected abstract void method5671(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7);

   @deob.ObfuscatedName("l.UA(CIIIZ)V")
   protected abstract void method5659(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
