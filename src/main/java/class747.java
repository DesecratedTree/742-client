@deob.ObfuscatedName("qc")
public class class747 {
   @deob.ObfuscatedName("qc.x")
   public int field6888 = -1;
   @deob.ObfuscatedName("qc.g")
   private static final int[] field6892 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   @deob.ObfuscatedName("qc.h")
   public static class737 field6893 = new class737(260);
   @deob.ObfuscatedName("qc.e")
   public static class737 field6885 = new class737(5);
   @deob.ObfuscatedName("qc.b")
   private int field6890;
   @deob.ObfuscatedName("qc.s")
   private long field6889;
   @deob.ObfuscatedName("qc.l")
   private long field6894;
   @deob.ObfuscatedName("qc.a")
   public boolean field6887;
   @deob.ObfuscatedName("qc.r")
   private int[] field6880;
   @deob.ObfuscatedName("qc.o")
   public int[] field6886;
   @deob.ObfuscatedName("qc.p")
   private class880[] field6883;

   @deob.ObfuscatedName("qc.n(I[I[Lva;[IZII)V")
   public void method11053(int arg0, int[] arg1, class880[] arg2, int[] arg3, boolean arg4, int arg5) {
      if (this.field6890 != arg0) {
         this.field6890 = arg0;
      }

      this.field6880 = arg1;
      this.field6883 = arg2;
      this.field6886 = arg3;
      this.field6887 = arg4;
      this.field6888 = arg5;
      this.method11059();
   }

   @deob.ObfuscatedName("qc.k(IILgj;B)V")
   public void method11058(int arg0, int arg1, class476 arg2) {
      int var4 = field6892[arg0];
      if (arg2.method6627(arg1) != null) {
         this.field6880[var4] = arg1 | Integer.MIN_VALUE;
         this.method11059();
      }
   }

   @deob.ObfuscatedName("qc.d(IIB)V")
   public void method11056(int arg0, int arg1) {
      this.field6886[arg0] = arg1;
      this.method11059();
   }

   @deob.ObfuscatedName("qc.b(ZI)V")
   public void method11057(boolean arg0) {
      this.field6887 = arg0;
      this.method11059();
   }

   @deob.ObfuscatedName("qc.r(IILvm;B)V")
   public void method11064(int arg0, int arg1, class892 arg2) {
      if (arg1 == -1) {
         this.field6880[arg0] = 0;
      } else {
         if (arg2.method15540(arg1) == null) {
            return;
         }

         this.field6880[arg0] = arg1 | 1073741824;
         this.method11059();
      }

   }

   @deob.ObfuscatedName("qc.p(B)V")
   private void method11059() {
      long[] var1 = class124.field929;
      this.field6889 = -1L;
      this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(this.field6890 >> 8)) & 255L)];
      this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)this.field6890) & 255L)];

      for(int var2 = 0; var2 < this.field6880.length; ++var2) {
         this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(this.field6880[var2] >> 24)) & 255L)];
         this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(this.field6880[var2] >> 16)) & 255L)];
         this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(this.field6880[var2] >> 8)) & 255L)];
         this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)this.field6880[var2]) & 255L)];
      }

      if (this.field6883 != null) {
         for(int var3 = 0; var3 < this.field6883.length; ++var3) {
            if (this.field6883[var3] != null) {
               int[] var4;
               int[] var5;
               if (this.field6887) {
                  var4 = this.field6883[var3].field8874;
                  var5 = this.field6883[var3].field8881;
               } else {
                  var4 = this.field6883[var3].field8879;
                  var5 = this.field6883[var3].field8880;
               }

               if (var4 != null) {
                  for(int var6 = 0; var6 < var4.length; ++var6) {
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(var4[var6] >> 8)) & 255L)];
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)var4[var6]) & 255L)];
                  }
               }

               if (var5 != null) {
                  for(int var7 = 0; var7 < var5.length; ++var7) {
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(var5[var7] >> 8)) & 255L)];
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)var5[var7]) & 255L)];
                  }
               }

               if (this.field6883[var3].field8882 != null) {
                  for(int var8 = 0; var8 < this.field6883[var3].field8882.length; ++var8) {
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(this.field6883[var3].field8882[var8] >> 8)) & 255L)];
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)this.field6883[var3].field8882[var8]) & 255L)];
                  }
               }

               if (this.field6883[var3].field8883 != null) {
                  for(int var9 = 0; var9 < this.field6883[var3].field8883.length; ++var9) {
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(this.field6883[var3].field8883[var9] >> 8)) & 255L)];
                     this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)this.field6883[var3].field8883[var9]) & 255L)];
                  }
               }
            }
         }
      }

      for(int var10 = 0; var10 < 10; ++var10) {
         this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)this.field6886[var10]) & 255L)];
      }

      this.field6889 = this.field6889 >>> 8 ^ var1[(int)((this.field6889 ^ (long)(this.field6887 ? 1 : 0)) & 255L)];
   }

   @deob.ObfuscatedName("qc.o(Lra;ILpn;Lgj;Lwm;Lvm;Lst;Lum;Ltk;Ltk;[Ltk;[IIZLrw;I)Lqa;")
   public class745 method11060(class772 arg0, int arg1, class731 arg2, class476 arg3, class919 arg4, class892 arg5, class818 arg6, class865 arg7, class836 arg8, class836 arg9, class836[] arg10, int[] arg11, int arg12, boolean arg13, class794 arg14) {
      if (this.field6888 != -1) {
         return arg4.method15857(this.field6888).method15773(arg0, arg1, arg2, arg7, arg8, arg9, arg10, arg11, arg12, (class921)null);
      } else {
         int var16 = arg1;
         long var17 = this.field6889;
         int[] var19 = this.field6880;
         boolean var20 = false;
         boolean var21 = false;
         if (arg8 != null) {
            class806 var22 = arg8.method14698();
            if (var22 != null && (var22.field8361 >= 0 || var22.field8366 >= 0)) {
               var19 = new int[this.field6880.length];

               for(int var23 = 0; var23 < var19.length; ++var23) {
                  var19[var23] = this.field6880[var23];
               }

               if (var22.field8361 >= 0 && arg14.field7257 != -1) {
                  var20 = true;
                  if (var22.field8361 == 65535) {
                     var19[arg14.field7257] = 0;

                     for(int var24 = 0; var24 < arg14.field7260.length; ++var24) {
                        var19[arg14.field7260[var24]] = 0;
                     }

                     var17 ^= -4294967296L;
                  } else {
                     var19[arg14.field7257] = var22.field8361 | 1073741824;

                     for(int var25 = 0; var25 < arg14.field7260.length; ++var25) {
                        var19[arg14.field7260[var25]] = 0;
                     }

                     var17 ^= (long)var19[arg14.field7257] << 32;
                  }
               }

               if (var22.field8366 >= 0 && arg14.field7254 != -1) {
                  var21 = true;
                  if (var22.field8366 == 65535) {
                     var19[arg14.field7254] = 0;

                     for(int var26 = 0; var26 < arg14.field7258.length; ++var26) {
                        var19[arg14.field7258[var26]] = 0;
                     }

                     var17 ^= 4294967295L;
                  } else {
                     var19[arg14.field7254] = var22.field8366 | 1073741824;

                     for(int var27 = 0; var27 < arg14.field7258.length; ++var27) {
                        var19[arg14.field7258[var27]] = 0;
                     }

                     var17 ^= (long)var19[arg14.field7254];
                  }
               }
            }
         }

         boolean var28 = false;
         int var29 = arg10 != null ? arg10.length : 0;

         for(int var30 = 0; var30 < var29; ++var30) {
            if (arg10[var30] != null) {
               var16 |= arg10[var30].method14779();
               var28 = true;
            }
         }

         if (arg8 != null) {
            var16 |= arg8.method14779();
            var28 = true;
         }

         if (arg9 != null) {
            var16 |= arg9.method14779();
            var28 = true;
         }

         boolean var31 = false;
         if (arg11 != null) {
            for(int var32 = 0; var32 < arg11.length; ++var32) {
               if (arg11[var32] != -1) {
                  var16 |= 32;
                  var31 = true;
               }
            }
         }

         class737 var33 = field6893;
         class745 var34;
         synchronized(field6893) {
            var34 = (class745)field6893.method10909(var17);
         }

         class743 var36 = null;
         if (this.field6890 != -1) {
            var36 = arg2.method10795(this.field6890);
         }

         if (var34 == null || arg0.method7534(var34.method6980(), var16) != 0) {
            if (var34 != null) {
               var16 = arg0.method7535(var16, var34.method6980());
            }

            boolean var38 = false;
            int var39 = 0;

            while(true) {
               if (var39 >= var19.length) {
                  if (var38) {
                     if (this.field6894 != -1L) {
                        class737 var45 = field6893;
                        synchronized(field6893) {
                           var34 = (class745)field6893.method10909(this.field6894);
                        }
                     }

                     if (var34 != null && arg0.method7534(var34.method6980(), var16) == 0) {
                        break;
                     }

                     return null;
                  }

                  class396[] var47 = new class396[var19.length];

                  for(int var48 = 0; var48 < var19.length; ++var48) {
                     int var49 = var19[var48];
                     class880 var50 = null;
                     boolean var51 = var48 == 5 && var20 || var48 == 3 && var21;
                     if ((var49 & 1073741824) != 0) {
                        if (!var51 && this.field6883 != null && this.field6883[var48] != null) {
                           var50 = this.field6883[var48];
                        }

                        class396 var52 = arg5.method15540(var49 & 1073741823).method15615(this.field6887, var50);
                        if (var52 != null) {
                           var47[var48] = var52;
                        }
                     } else if ((var49 & Integer.MIN_VALUE) != 0) {
                        class396 var53 = arg3.method6627(var49 & 1073741823).method6746();
                        if (var53 != null) {
                           var47[var48] = var53;
                        }
                     }
                  }

                  if (var36 != null && var36.field6839 != null) {
                     for(int var54 = 0; var54 < var36.field6839.length; ++var54) {
                        if (var47[var54] != null) {
                           int var55 = 0;
                           int var56 = 0;
                           int var57 = 0;
                           int var58 = 0;
                           int var59 = 0;
                           int var60 = 0;
                           if (var36.field6839[var54] != null) {
                              var55 = var36.field6839[var54][0];
                              var56 = var36.field6839[var54][1];
                              var57 = var36.field6839[var54][2];
                              var58 = var36.field6839[var54][3] << 3;
                              var59 = var36.field6839[var54][4] << 3;
                              var60 = var36.field6839[var54][5] << 3;
                           }

                           if (var58 != 0 || var59 != 0 || var60 != 0) {
                              var47[var54].method5426(var58, var59, var60);
                           }

                           if (var55 != 0 || var56 != 0 || var57 != 0) {
                              var47[var54].method5425(var55, var56, var57);
                           }
                        }
                     }
                  }

                  class396 var61 = new class396(var47, var47.length);
                  int var62 = var16 | 16384;
                  var34 = arg0.method7528(var61, var62, Statics.field8558, 64, 850);

                  for(int var63 = 0; var63 < 10; ++var63) {
                     for(int var64 = 0; var64 < Statics.field3671[var63].length; ++var64) {
                        if (this.field6886[var63] < Statics.field6884[var63][var64].length) {
                           var34.method7023(Statics.field3671[var63][var64], Statics.field6884[var63][var64][this.field6886[var63]]);
                        }
                     }
                  }

                  if (arg13) {
                     var34.method6916(var16);
                     class737 var65 = field6893;
                     synchronized(field6893) {
                        field6893.method10880(var34, var17);
                     }

                     this.field6894 = var17;
                  }
                  break;
               }

               int var40 = var19[var39];
               class880 var41 = null;
               boolean var42 = false;
               if (var20) {
                  if (arg14.field7257 == var39) {
                     var42 = true;
                  } else {
                     for(int var43 = 0; var43 < arg14.field7260.length; ++var43) {
                        if (arg14.field7260[var43] == var39) {
                           var42 = true;
                           break;
                        }
                     }
                  }
               }

               if (var21) {
                  if (arg14.field7254 == var39) {
                     var42 = true;
                  } else {
                     for(int var44 = 0; var44 < arg14.field7258.length; ++var44) {
                        if (arg14.field7258[var44] == var39) {
                           var42 = true;
                           break;
                        }
                     }
                  }
               }

               if ((var40 & 1073741824) != 0) {
                  if (!var42 && this.field6883 != null && this.field6883[var39] != null) {
                     var41 = this.field6883[var39];
                  }

                  if (!arg5.method15540(var40 & 1073741823).method15614(this.field6887, var41)) {
                     var38 = true;
                  }
               } else if ((var40 & Integer.MIN_VALUE) != 0 && !arg3.method6627(var40 & 1073741823).method6760()) {
                  var38 = true;
               }

               ++var39;
            }
         }

         class745 var67 = var34.method6914((byte)4, var16, true);
         if (!var28 && !var31) {
            return var67;
         } else {
            class583[] var68 = null;
            if (var36 != null) {
               var68 = var36.method10977();
            }

            if (var31 && var68 != null) {
               for(int var69 = 0; var69 < arg11.length; ++var69) {
                  if (var68[var69] != null) {
                     var67.method6983(var68[var69], 1 << var69, true);
                  }
               }
            }

            int var70 = 0;
            int var71 = 1;

            while(var70 < var29) {
               if (arg10[var70] != null) {
                  arg10[var70].method14734(var67, 0, var71);
               }

               ++var70;
               var71 <<= 1;
            }

            if (var31) {
               for(int var72 = 0; var72 < arg11.length; ++var72) {
                  if (arg11[var72] != -1) {
                     int var73 = arg11[var72] - arg12;
                     int var74 = var73 & 16383;
                     class583 var75 = new class583();
                     var75.method8128(0.0F, 1.0F, 0.0F, class603.method8577(var74));
                     var67.method6983(var75, 1 << var72, false);
                  }
               }
            }

            if (var31 && var68 != null) {
               for(int var76 = 0; var76 < arg11.length; ++var76) {
                  if (var68[var76] != null) {
                     var67.method6983(var68[var76], 1 << var76, false);
                  }
               }
            }

            if (arg8 != null && arg9 != null) {
               class836.method9843(var67, arg8, arg9);
            } else if (arg8 != null) {
               arg8.method14704(var67, 0);
            } else if (arg9 != null) {
               arg9.method14704(var67, 0);
            }

            return var67;
         }
      }
   }

   @deob.ObfuscatedName("qc.a(Lra;ILgj;Lwm;Lvm;Lst;Lum;Ltk;B)Lqa;")
   public class745 method11075(class772 arg0, int arg1, class476 arg2, class919 arg3, class892 arg4, class818 arg5, class865 arg6, class836 arg7) {
      if (this.field6888 != -1) {
         return arg3.method15857(this.field6888).method15775(arg0, arg1, arg6, arg7, (class921)null);
      } else {
         int var9 = arg7 != null ? arg1 | arg7.method14779() : arg1;
         class737 var10 = field6885;
         class745 var11;
         synchronized(field6885) {
            var11 = (class745)field6885.method10909(this.field6889);
         }

         if (var11 == null || arg0.method7534(var11.method6980(), var9) != 0) {
            if (var11 != null) {
               var9 = arg0.method7535(var9, var11.method6980());
            }

            boolean var14 = false;

            for(int var15 = 0; var15 < this.field6880.length; ++var15) {
               int var16 = this.field6880[var15];
               class880 var17 = null;
               if ((var16 & 1073741824) != 0) {
                  if (this.field6883 != null && this.field6883[var15] != null) {
                     var17 = this.field6883[var15];
                  }

                  if (!arg4.method15540(var16 & 1073741823).method15616(this.field6887, var17)) {
                     var14 = true;
                  }
               } else if ((var16 & Integer.MIN_VALUE) != 0 && !arg2.method6627(var16 & 1073741823).method6747()) {
                  var14 = true;
               }
            }

            if (var14) {
               return null;
            }

            class396[] var18 = new class396[this.field6880.length];
            int var19 = 0;

            for(int var20 = 0; var20 < this.field6880.length; ++var20) {
               int var21 = this.field6880[var20];
               class880 var22 = null;
               if ((var21 & 1073741824) != 0) {
                  if (this.field6883 != null && this.field6883[var20] != null) {
                     var22 = this.field6883[var20];
                  }

                  class396 var23 = arg4.method15540(var21 & 1073741823).method15617(this.field6887, var22);
                  if (var23 != null) {
                     var18[var19++] = var23;
                  }
               } else if ((var21 & Integer.MIN_VALUE) != 0) {
                  class396 var24 = arg2.method6627(var21 & 1073741823).method6748();
                  if (var24 != null) {
                     var18[var19++] = var24;
                  }
               }
            }

            class396 var25 = new class396(var18, var19);
            int var26 = var9 | 16384;
            var11 = arg0.method7528(var25, var26, Statics.field8558, 64, 768);

            for(int var27 = 0; var27 < 10; ++var27) {
               for(int var28 = 0; var28 < Statics.field3671[var27].length; ++var28) {
                  if (this.field6886[var27] < Statics.field6884[var27][var28].length) {
                     var11.method7023(Statics.field3671[var27][var28], Statics.field6884[var27][var28][this.field6886[var27]]);
                  }
               }
            }

            var11.method6916(var9);
            class737 var29 = field6885;
            synchronized(field6885) {
               field6885.method10880(var11, this.field6889);
            }
         }

         if (arg7 == null) {
            return var11;
         } else {
            class745 var31 = var11.method6914((byte)4, var9, true);
            arg7.method14704(var31, 0);
            return var31;
         }
      }
   }

   @deob.ObfuscatedName("qc.x(Lra;ILgj;Lst;Ltk;IIII)Lqa;")
   public class745 method11074(class772 arg0, int arg1, class476 arg2, class818 arg3, class836 arg4, int arg5, int arg6, int arg7) {
      int var9 = arg4 != null ? arg1 | arg4.method14779() : arg1;
      long var10 = (long)arg7 << 32 | (long)(arg6 << 16) | (long)arg5;
      class737 var12 = field6885;
      class745 var13;
      synchronized(field6885) {
         var13 = (class745)field6885.method10909(var10);
      }

      if (var13 == null || arg0.method7534(var13.method6980(), var9) != 0) {
         if (var13 != null) {
            var9 = arg0.method7535(var9, var13.method6980());
         }

         class396[] var16 = new class396[3];
         int var17 = 0;
         if (!arg2.method6627(arg5).method6747() || !arg2.method6627(arg6).method6747() || !arg2.method6627(arg7).method6747()) {
            return null;
         }

         class396 var18 = arg2.method6627(arg5).method6748();
         if (var18 != null) {
            var16[var17++] = var18;
         }

         class396 var19 = arg2.method6627(arg6).method6748();
         if (var19 != null) {
            var16[var17++] = var19;
         }

         class396 var20 = arg2.method6627(arg7).method6748();
         if (var20 != null) {
            var16[var17++] = var20;
         }

         class396 var21 = new class396(var16, var17);
         int var22 = var9 | 16384;
         var13 = arg0.method7528(var21, var22, Statics.field8558, 64, 768);

         for(int var23 = 0; var23 < 10; ++var23) {
            for(int var24 = 0; var24 < Statics.field3671[var23].length; ++var24) {
               if (this.field6886[var23] < Statics.field6884[var23][var24].length) {
                  var13.method7023(Statics.field3671[var23][var24], Statics.field6884[var23][var24][this.field6886[var23]]);
               }
            }
         }

         var13.method6916(var9);
         class737 var25 = field6885;
         synchronized(field6885) {
            field6885.method10880(var13, var10);
         }
      }

      if (arg4 == null) {
         return var13;
      } else {
         class745 var27 = var13.method6914((byte)4, var9, true);
         arg4.method14704(var27, 0);
         return var27;
      }
   }

   @deob.ObfuscatedName("ff.s(I)I")
   public static int method6252() {
      class737 var0 = field6893;
      synchronized(field6893) {
         return field6893.method10886();
      }
   }

   @deob.ObfuscatedName("po.l(II)V")
   public static void method10815(int arg0) {
      Statics.field8558 = arg0;
      class737 var1 = field6885;
      synchronized(field6885) {
         field6885.method10883();
      }

      class737 var3 = field6893;
      synchronized(field6893) {
         field6893.method10883();
      }
   }

   @deob.ObfuscatedName("gq.u(I)V")
   public static void method6855() {
      class737 var0 = field6893;
      synchronized(field6893) {
         field6893.method10883();
      }

      class737 var2 = field6885;
      synchronized(field6885) {
         field6885.method10883();
      }
   }

   @deob.ObfuscatedName("ou.g(I)V")
   public static void method10472() {
      class737 var0 = field6893;
      synchronized(field6893) {
         field6893.method10887();
      }

      class737 var2 = field6885;
      synchronized(field6885) {
         field6885.method10887();
      }
   }
}
