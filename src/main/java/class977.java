@deob.ObfuscatedName("yq")
public class class977 extends class934 {
   @deob.ObfuscatedName("yq.l")
   private final class984 field9933;
   @deob.ObfuscatedName("yq.u")
   private final int field9924;
   @deob.ObfuscatedName("yq.aw")
   private byte[][] field9925;
   @deob.ObfuscatedName("yq.al")
   private byte[][] field9947;
   @deob.ObfuscatedName("yq.m")
   private float field9918;
   @deob.ObfuscatedName("yq.at")
   private float field9919;
   @deob.ObfuscatedName("yq.i")
   private float field9930;
   @deob.ObfuscatedName("yq.t")
   private float field9932;
   @deob.ObfuscatedName("yq.w")
   private float field9934;
   @deob.ObfuscatedName("yq.q")
   private float field9935;
   @deob.ObfuscatedName("yq.y")
   private float field9936;
   @deob.ObfuscatedName("yq.c")
   private float field9938;
   @deob.ObfuscatedName("yq.ai")
   private float field9939;
   @deob.ObfuscatedName("yq.ap")
   private float field9940;
   @deob.ObfuscatedName("yq.av")
   private float field9941;
   @deob.ObfuscatedName("yq.af")
   private float field9943;
   @deob.ObfuscatedName("yq.f")
   private float field9944;
   @deob.ObfuscatedName("yq.ah")
   private float field9945;
   @deob.ObfuscatedName("yq.j")
   private float field9946;
   @deob.ObfuscatedName("yq.ax")
   private float field9949;
   @deob.ObfuscatedName("yq.e")
   private class329[][] field9928;
   @deob.ObfuscatedName("yq.v")
   private class337[][] field9931;
   @deob.ObfuscatedName("yq.z")
   private class347[][] field9929;
   @deob.ObfuscatedName("yq.h")
   private class56[][] field9927;
   @deob.ObfuscatedName("yq.g")
   private class83[][] field9926;

   public class977(class984 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field9933 = arg0;
      this.field9924 = arg2;
      this.field9925 = new byte[arg3 + 1][arg4 + 1];
      int var9 = this.field9933.field10419 >> 9;

      for(int var10 = 1; var10 < arg4; ++var10) {
         for(int var11 = 1; var11 < arg3; ++var11) {
            int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
            int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var14 * var14 + arg7 * 512 + var13 * var13));
            int var16 = (var13 << 8) / var15;
            int var17 = arg7 * -512 / var15;
            int var18 = (var14 << 8) / var15;
            int var19 = (this.field9933.field10410 * var18 + this.field9933.field10435 * var17 + this.field9933.field10420 * var16 >> 17) + var9;
            int var20 = var19 >> 1;
            if (var20 < 2) {
               var20 = 2;
            } else if (var20 > 126) {
               var20 = 126;
            }

            this.field9925[var11][var10] = (byte)var20;
         }
      }

      this.field9947 = new byte[arg3 + 1][arg4 + 1];
   }

   @deob.ObfuscatedName("yq.LA(III)V")
   public void method7246(int arg0, int arg1, int arg2) {
      if (this.field9947[arg0][arg1] < arg2) {
         this.field9947[arg0][arg1] = (byte)arg2;
      }

   }

   @deob.ObfuscatedName("yq.k(II[I[I[I[I[I[I[I[I[I[I[ILdq;Z)V")
   public void method7250(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class402 arg13, boolean arg14) {
      if (this.field9931 == null) {
         this.field9931 = new class337[this.field9463][this.field9461];
         this.field9926 = new class83[this.field9463][this.field9461];
      } else if (this.field9927 != null || this.field9929 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            int var18 = arg2[arg6[var17]];
            int var19 = arg4[arg6[var17]];
            if (var18 != 0 && this.field9460 != var18 || var19 != 0 && this.field9460 != var19) {
               var16 = false;
               break;
            }
         }
      }

      if (!var16) {
         class83 var20 = new class83();
         short var21 = (short)arg2.length;
         short var22 = (short)arg9.length;
         var20.field606 = var21;
         var20.field605 = new short[var21];
         var20.field608 = new short[var21];
         var20.field609 = new short[var21];
         var20.field615 = new short[var21];

         for(int var23 = 0; var23 < var21; ++var23) {
            int var24 = arg2[var23];
            int var25 = arg4[var23];
            if (var24 == 0 && var25 == 0) {
               var20.field605[var23] = (short)(this.field9925[arg0][arg1] - this.field9947[arg0][arg1]);
            } else if (var24 == 0 && this.field9460 == var25) {
               var20.field605[var23] = (short)(this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]);
            } else if (this.field9460 == var24 && this.field9460 == var25) {
               var20.field605[var23] = (short)(this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]);
            } else if (this.field9460 == var24 && var25 == 0) {
               var20.field605[var23] = (short)(this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]);
            } else {
               int var26 = (this.field9460 - var24) * (this.field9925[arg0][arg1] - this.field9947[arg0][arg1]) + (this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]) * var24;
               int var27 = (this.field9460 - var24) * (this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]) + (this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]) * var24;
               var20.field605[var23] = (short)((this.field9460 - var25) * var26 + var25 * var27 >> this.field9464 * 2);
            }

            int var28 = (arg0 << this.field9464) + var24;
            int var29 = (arg1 << this.field9464) + var25;
            var20.field608[var23] = (short)var24;
            var20.field615[var23] = (short)var25;
            var20.field609[var23] = (short)(this.method15965(var28, var29) + (arg3 != null ? arg3[var23] : 0));
            if (var20.field605[var23] < 2) {
               var20.field605[var23] = 2;
            }
         }

         boolean var30 = false;
         int var31 = 0;

         for(int var32 = 0; var32 < var22; ++var32) {
            if (arg9[var32] >= 0 || arg10 != null && arg10[var32] >= 0) {
               ++var31;
            }

            int var33 = arg11[var32];
            if (var33 != -1) {
               class360 var34 = this.field9933.field7118.method5112(var33);
               if (!var34.field2331) {
                  var30 = true;
                  if (this.method16291(var34.field2324) || var34.field2330 != 0 || var34.field2317 != 0) {
                     var20.field607 = (byte)(var20.field607 | 4);
                  }
               }
            }
         }

         var20.field611 = new int[var31];
         if (arg10 != null) {
            var20.field618 = new int[var31];
         }

         var20.field612 = new short[var31];
         var20.field613 = new short[var31];
         var20.field614 = new short[var31];
         if (var30) {
            var20.field617 = new short[var31];
            var20.field616 = new short[var31];
         }

         for(int var35 = 0; var35 < var22; ++var35) {
            if (arg9[var35] >= 0 || arg10 != null && arg10[var35] >= 0) {
               if (arg9[var35] >= 0) {
                  var20.field611[var20.field610] = Statics.method4006(arg9[var35]);
               } else {
                  var20.field611[var20.field610] = -1;
               }

               if (arg10 != null) {
                  if (arg10[var35] != -1) {
                     var20.field618[var20.field610] = Statics.method4006(arg10[var35]);
                  } else {
                     var20.field618[var20.field610] = -1;
                  }
               }

               var20.field612[var20.field610] = (short)arg6[var35];
               var20.field613[var20.field610] = (short)arg7[var35];
               var20.field614[var20.field610] = (short)arg8[var35];
               if (var30) {
                  if (arg11[var35] != -1 && !this.field9933.field7118.method5112(arg11[var35]).field2331) {
                     var20.field617[var20.field610] = (short)arg11[var35];
                     var20.field616[var20.field610] = (short)arg12[var35];
                  } else {
                     var20.field617[var20.field610] = -1;
                  }
               }

               ++var20.field610;
            }
         }

         this.field9926[arg0][arg1] = var20;
      } else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
         class337 var36 = new class337();
         int var37 = arg9[0];
         int var38 = arg11[0];
         if (arg10 != null) {
            var36.field2130 = Statics.method4415(Statics.method4006(arg10[0]), this.field9925[arg0][arg1] - this.field9947[arg0][arg1]);
            if (var37 == -1) {
               var36.field2135 = (byte)(var36.field2135 | 2);
            }
         }

         if (this.field9462[arg0 + 1][arg1] == this.field9462[arg0][arg1] && this.field9462[arg0 + 1][arg1 + 1] == this.field9462[arg0][arg1] && this.field9462[arg0][arg1 + 1] == this.field9462[arg0][arg1]) {
            var36.field2135 = (byte)(var36.field2135 | 1);
         }

         class360 var39 = null;
         if (var38 != -1) {
            var39 = this.field9933.field7118.method5112(var38);
         }

         if (var39 != null && (var36.field2135 & 2) == 0 && !var39.field2331) {
            var36.field2131 = (short)(this.field9925[arg0][arg1] - this.field9947[arg0][arg1]);
            var36.field2132 = (short)(this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]);
            var36.field2133 = (short)(this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]);
            var36.field2134 = (short)(this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]);
            var36.field2136 = (short)var38;
            if (this.method16291(var39.field2324) || var39.field2330 != 0 || var39.field2317 != 0) {
               var36.field2135 = (byte)(var36.field2135 | 4);
            }
         } else {
            short var40 = Statics.method4006(var37);
            var36.field2131 = (short)Statics.method4415(var40, this.field9925[arg0][arg1] - this.field9947[arg0][arg1]);
            var36.field2132 = (short)Statics.method4415(var40, this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]);
            var36.field2133 = (short)Statics.method4415(var40, this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]);
            var36.field2134 = (short)Statics.method4415(var40, this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]);
            var36.field2136 = -1;
         }

         this.field9931[arg0][arg1] = var36;
      }

   }

   @deob.ObfuscatedName("yq.n(II[I[I[I[I[I[I[I[ILdq;Z)V")
   public void method7247(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class402 arg10, boolean arg11) {
      boolean var13 = (this.field9924 & 32) == 0;
      if (this.field9927 == null && !var13) {
         this.field9927 = new class56[this.field9463][this.field9461];
         this.field9928 = new class329[this.field9463][this.field9461];
      } else if (this.field9929 == null && var13) {
         this.field9929 = new class347[this.field9463][this.field9461];
      } else if (this.field9931 != null) {
         throw new IllegalStateException();
      }

      if (arg2 != null && arg2.length != 0) {
         for(int var14 = 0; var14 < arg6.length; ++var14) {
            if (arg6[var14] == -1) {
               arg6[var14] = 0;
            } else {
               arg6[var14] = Statics.field7263[Statics.method4006(arg6[var14]) & 65535] << 8 | 255;
            }
         }

         if (arg7 != null) {
            for(int var15 = 0; var15 < arg7.length; ++var15) {
               if (arg7[var15] == -1) {
                  arg7[var15] = 0;
               } else {
                  arg7[var15] = Statics.field7263[Statics.method4006(arg7[var15]) & 65535] << 8 | 255;
               }
            }
         }

         if (var13) {
            class347 var16 = new class347();
            var16.field2191 = (short)arg2.length;
            var16.field2197 = (short)(arg2.length / 3);
            var16.field2192 = new short[var16.field2191];
            var16.field2195 = new short[var16.field2191];
            var16.field2194 = new short[var16.field2191];
            var16.field2190 = new int[var16.field2191];
            var16.field2198 = new short[var16.field2191];
            var16.field2196 = new short[var16.field2191];
            var16.field2199 = new byte[var16.field2191];
            if (arg5 != null) {
               var16.field2193 = new short[var16.field2191];
            }

            for(int var17 = 0; var17 < var16.field2191; ++var17) {
               int var18 = arg2[var17];
               int var19 = arg4[var17];
               boolean var20 = false;
               int var21;
               if (var18 == 0 && var19 == 0) {
                  var21 = this.field9925[arg0][arg1] - this.field9947[arg0][arg1];
               } else if (var18 == 0 && this.field9460 == var19) {
                  var21 = this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1];
               } else if (this.field9460 == var18 && this.field9460 == var19) {
                  var21 = this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1];
               } else if (this.field9460 == var18 && var19 == 0) {
                  var21 = this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1];
               } else {
                  int var22 = (this.field9460 - var18) * (this.field9925[arg0][arg1] - this.field9947[arg0][arg1]) + (this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]) * var18;
                  int var23 = (this.field9460 - var18) * (this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]) + (this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]) * var18;
                  var21 = (this.field9460 - var19) * var22 + var19 * var23 >> this.field9464 * 2;
               }

               int var24 = (arg0 << this.field9464) + var18;
               int var25 = (arg1 << this.field9464) + var19;
               var16.field2192[var17] = (short)var18;
               var16.field2194[var17] = (short)var19;
               var16.field2195[var17] = (short)(this.method15965(var24, var25) + (arg3 != null ? arg3[var17] : 0));
               if (var21 < 0) {
                  var21 = 0;
               }

               if (arg6[var17] == 0) {
                  var16.field2190[var17] = 0;
                  if (arg7 != null) {
                     var16.field2199[var17] = (byte)var21;
                  }
               } else {
                  int var26 = 0;
                  if (arg5 != null) {
                     short var27 = var16.field2193[var17] = (short)arg5[var17];
                     if (arg10.field2964 != 0) {
                        var26 = var27 * 255 / arg10.field2964;
                        if (var26 < 0) {
                           var26 = 0;
                        } else if (var26 > 255) {
                           var26 = 255;
                        }
                     }
                  }

                  int var28 = -16777216;
                  if (arg8[var17] != -1 && this.method16291(this.field9933.field7118.method5112(arg8[var17]).field2324)) {
                     var28 = -1694498816;
                  }

                  var16.field2190[var17] = var28 | class789.method1403(method16275(arg6[var17] >> 8, var21), arg10.field2965, var26);
                  if (arg7 != null) {
                     var16.field2199[var17] = (byte)var21;
                  }
               }

               var16.field2198[var17] = (short)arg8[var17];
               var16.field2196[var17] = (short)arg9[var17];
            }

            if (arg7 != null) {
               var16.field2200 = new int[var16.field2197];
            }

            for(int var29 = 0; var29 < var16.field2197; ++var29) {
               int var30 = var29 * 3;
               if (arg7 != null && arg7[var30] != 0) {
                  var16.field2200[var29] = -16777216 | arg7[var30] >> 8;
               }
            }

            this.field9929[arg0][arg1] = var16;
         } else {
            boolean var31 = true;
            int var32 = -1;
            int var33 = -1;
            int var34 = -1;
            int var35 = -1;
            if (arg2.length != 6) {
               var31 = false;
            } else {
               for(int var36 = 0; var36 < 6; ++var36) {
                  if (arg2[var36] == 0 && arg4[var36] == 0) {
                     if (var32 != -1 && arg6[var32] != arg6[var36]) {
                        var31 = false;
                        break;
                     }

                     var32 = var36;
                  } else if (this.field9460 == arg2[var36] && arg4[var36] == 0) {
                     if (var33 != -1 && arg6[var33] != arg6[var36]) {
                        var31 = false;
                        break;
                     }

                     var33 = var36;
                  } else if (this.field9460 == arg2[var36] && this.field9460 == arg4[var36]) {
                     if (var34 != -1 && arg6[var34] != arg6[var36]) {
                        var31 = false;
                        break;
                     }

                     var34 = var36;
                  } else if (arg2[var36] == 0 && this.field9460 == arg4[var36]) {
                     if (var35 != -1 && arg6[var35] != arg6[var36]) {
                        var31 = false;
                        break;
                     }

                     var35 = var36;
                  }
               }

               if (var32 == -1 || var33 == -1 || var34 == -1 || var35 == -1) {
                  var31 = false;
               }

               if (var31) {
                  if (arg3 != null) {
                     for(int var37 = 0; var37 < 4; ++var37) {
                        if (arg3[var37] != 0) {
                           var31 = false;
                           break;
                        }
                     }
                  }

                  if (var31) {
                     for(int var38 = 1; var38 < 4; ++var38) {
                        if (arg2[var38] != arg2[0] && this.field9460 + arg2[0] != arg2[var38] && arg2[0] - this.field9460 != arg2[var38]) {
                           var31 = false;
                           break;
                        }

                        if (arg4[var38] != arg4[0] && this.field9460 + arg4[0] != arg4[var38] && arg4[0] - this.field9460 != arg4[var38]) {
                           var31 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if (var31) {
               class56 var39 = new class56();
               int var40 = arg6[0];
               int var41 = arg8[0];
               if (arg7 != null) {
                  var39.field417 = arg7[0] >> 8;
                  if (var40 == 0) {
                     var39.field408 = (byte)(var39.field408 | 2);
                  }
               } else if (var40 == 0) {
                  return;
               }

               if (this.field9462[arg0 + 1][arg1] == this.field9462[arg0][arg1] && this.field9462[arg0 + 1][arg1 + 1] == this.field9462[arg0][arg1] && this.field9462[arg0][arg1 + 1] == this.field9462[arg0][arg1]) {
                  var39.field408 = (byte)(var39.field408 | 1);
               }

               if (var41 != -1 && (var39.field408 & 2) == 0 && !this.field9933.field7118.method5112(var41).field2331) {
                  int var42;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var42 = arg5[var32] * 255 / arg10.field2964;
                     if (var42 < 0) {
                        var42 = 0;
                     } else if (var42 > 255) {
                        var42 = 255;
                     }
                  } else {
                     var42 = 0;
                  }

                  var39.field415 = class789.method1403(method16275(arg6[var32] >> 8, this.field9925[arg0][arg1] - this.field9947[arg0][arg1]), arg10.field2965, var42);
                  if (var39.field417 != 0) {
                     var39.field415 |= 255 - (this.field9925[arg0][arg1] - this.field9947[arg0][arg1]) << 25;
                  }

                  int var43;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var43 = arg5[var33] * 255 / arg10.field2964;
                     if (var43 < 0) {
                        var43 = 0;
                     } else if (var43 > 255) {
                        var43 = 255;
                     }
                  } else {
                     var43 = 0;
                  }

                  var39.field416 = class789.method1403(method16275(arg6[var33] >> 8, this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]), arg10.field2965, var43);
                  if (var39.field417 != 0) {
                     var39.field416 |= 255 - (this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]) << 25;
                  }

                  int var44;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var44 = arg5[var34] * 255 / arg10.field2964;
                     if (var44 < 0) {
                        var44 = 0;
                     } else if (var44 > 255) {
                        var44 = 255;
                     }
                  } else {
                     var44 = 0;
                  }

                  var39.field410 = class789.method1403(method16275(arg6[var34] >> 8, this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]), arg10.field2965, var44);
                  if (var39.field417 != 0) {
                     var39.field410 |= 255 - (this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var45;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var45 = arg5[var35] * 255 / arg10.field2964;
                     if (var45 < 0) {
                        var45 = 0;
                     } else if (var45 > 255) {
                        var45 = 255;
                     }
                  } else {
                     var45 = 0;
                  }

                  var39.field411 = class789.method1403(method16275(arg6[var35] >> 8, this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]), arg10.field2965, var45);
                  var39.field409 = (short)var41;
               } else {
                  int var46;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var46 = arg5[var32] * 255 / arg10.field2964;
                     if (var46 < 0) {
                        var46 = 0;
                     } else if (var46 > 255) {
                        var46 = 255;
                     }
                  } else {
                     var46 = 0;
                  }

                  var39.field415 = class789.method1403(method16275(arg6[var32] >> 8, this.field9925[arg0][arg1] - this.field9947[arg0][arg1]), arg10.field2965, var46);
                  if (var39.field417 != 0) {
                     var39.field415 |= 255 - (this.field9925[arg0][arg1] - this.field9947[arg0][arg1]) << 25;
                  }

                  int var47;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var47 = arg5[var33] * 255 / arg10.field2964;
                     if (var47 < 0) {
                        var47 = 0;
                     } else if (var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var39.field416 = class789.method1403(method16275(arg6[var33] >> 8, this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]), arg10.field2965, var47);
                  if (var39.field417 != 0) {
                     var39.field416 |= 255 - (this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]) << 25;
                  }

                  int var48;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var48 = arg5[var34] * 255 / arg10.field2964;
                     if (var48 < 0) {
                        var48 = 0;
                     } else if (var48 > 255) {
                        var48 = 255;
                     }
                  } else {
                     var48 = 0;
                  }

                  var39.field410 = class789.method1403(method16275(arg6[var34] >> 8, this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]), arg10.field2965, var48);
                  if (var39.field417 != 0) {
                     var39.field410 |= 255 - (this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var49;
                  if (arg5 != null && arg10.field2964 != 0) {
                     var49 = arg5[var35] * 255 / arg10.field2964;
                     if (var49 < 0) {
                        var49 = 0;
                     } else if (var49 > 255) {
                        var49 = 255;
                     }
                  } else {
                     var49 = 0;
                  }

                  var39.field411 = class789.method1403(method16275(arg6[var35] >> 8, this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]), arg10.field2965, var49);
                  if (var39.field417 != 0) {
                     var39.field411 |= 255 - (this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]) << 25;
                  }

                  var39.field409 = -1;
               }

               if (arg5 != null) {
                  var39.field414 = (short)arg5[var34];
                  var39.field407 = (short)arg5[var35];
                  var39.field413 = (short)arg5[var33];
                  var39.field412 = (short)arg5[var32];
               }

               this.field9927[arg0][arg1] = var39;
            } else {
               class329 var50 = new class329();
               var50.field2089 = (short)arg2.length;
               var50.field2088 = (short)(arg2.length / 3);
               var50.field2091 = new short[var50.field2089];
               var50.field2092 = new short[var50.field2089];
               var50.field2095 = new short[var50.field2089];
               var50.field2094 = new int[var50.field2089];
               if (arg5 != null) {
                  var50.field2093 = new short[var50.field2089];
               }

               for(int var51 = 0; var51 < var50.field2089; ++var51) {
                  int var52 = arg2[var51];
                  int var53 = arg4[var51];
                  boolean var54 = false;
                  int var55;
                  if (var52 == 0 && var53 == 0) {
                     var55 = this.field9925[arg0][arg1] - this.field9947[arg0][arg1];
                  } else if (var52 == 0 && this.field9460 == var53) {
                     var55 = this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1];
                  } else if (this.field9460 == var52 && this.field9460 == var53) {
                     var55 = this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1];
                  } else if (this.field9460 == var52 && var53 == 0) {
                     var55 = this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1];
                  } else {
                     int var56 = (this.field9460 - var52) * (this.field9925[arg0][arg1] - this.field9947[arg0][arg1]) + (this.field9925[arg0 + 1][arg1] - this.field9947[arg0 + 1][arg1]) * var52;
                     int var57 = (this.field9460 - var52) * (this.field9925[arg0][arg1 + 1] - this.field9947[arg0][arg1 + 1]) + (this.field9925[arg0 + 1][arg1 + 1] - this.field9947[arg0 + 1][arg1 + 1]) * var52;
                     var55 = (this.field9460 - var53) * var56 + var53 * var57 >> this.field9464 * 2;
                  }

                  int var58 = (arg0 << this.field9464) + var52;
                  int var59 = (arg1 << this.field9464) + var53;
                  var50.field2091[var51] = (short)var52;
                  var50.field2095[var51] = (short)var53;
                  var50.field2092[var51] = (short)(this.method15965(var58, var59) + (arg3 != null ? arg3[var51] : 0));
                  if (var55 < 0) {
                     var55 = 0;
                  }

                  if (arg6[var51] == 0) {
                     if (arg7 != null) {
                        var50.field2094[var51] = var55 << 25;
                     } else {
                        var50.field2094[var51] = 0;
                     }
                  } else {
                     int var60 = 0;
                     if (arg5 != null) {
                        short var61 = var50.field2093[var51] = (short)arg5[var51];
                        if (arg10.field2964 != 0) {
                           var60 = var61 * 255 / arg10.field2964;
                           if (var60 < 0) {
                              var60 = 0;
                           } else if (var60 > 255) {
                              var60 = 255;
                           }
                        }
                     }

                     var50.field2094[var51] = class789.method1403(method16275(arg6[var51] >> 8, var55), arg10.field2965, var60);
                     if (arg7 != null) {
                        var50.field2094[var51] |= var55 << 25;
                     }
                  }
               }

               boolean var62 = false;

               for(int var63 = 0; var63 < var50.field2088; ++var63) {
                  if (arg8[var63 * 3] != -1 && !this.field9933.field7118.method5112(arg8[var63 * 3]).field2331) {
                     var62 = true;
                  }
               }

               if (arg7 != null) {
                  var50.field2098 = new int[var50.field2088];
               }

               if (var62) {
                  var50.field2096 = new short[var50.field2088];
                  var50.field2097 = new short[var50.field2088];
               }

               for(int var64 = 0; var64 < var50.field2088; ++var64) {
                  int var65 = var64 * 3;
                  if (arg7 != null && arg7[var65] != 0) {
                     var50.field2098[var64] = arg7[var65] >> 8;
                  }

                  if (var62) {
                     int var66 = var65 + 1;
                     int var67 = var66 + 1;
                     boolean var68 = false;
                     boolean var69 = true;
                     int var70 = arg8[var65];
                     if (var70 != -1 && !this.field9933.field7118.method5112(var70).field2331) {
                        var68 = true;
                     } else {
                        var69 = false;
                     }

                     int var71 = arg8[var66];
                     if (var71 != -1 && !this.field9933.field7118.method5112(var71).field2331) {
                        var68 = true;
                     } else {
                        var69 = false;
                     }

                     int var72 = arg8[var67];
                     if (var72 != -1 && !this.field9933.field7118.method5112(var72).field2331) {
                        var68 = true;
                     } else {
                        var69 = false;
                     }

                     if (var69) {
                        var50.field2096[var64] = (short)var72;
                        var50.field2097[var64] = (short)arg9[var65];
                     } else {
                        if (var68) {
                           int var73 = arg8[var65];
                           if (var73 != -1 && !this.field9933.field7118.method5112(var73).field2331) {
                              var50.field2094[var65] = Statics.field7263[Statics.method4006(this.field9933.field7118.method5112(var73).field2322 & 65535) & 65535];
                           }

                           int var74 = arg8[var66];
                           if (var74 != -1 && !this.field9933.field7118.method5112(var74).field2331) {
                              var50.field2094[var66] = Statics.field7263[Statics.method4006(this.field9933.field7118.method5112(var74).field2322 & 65535) & 65535];
                           }

                           int var75 = arg8[var67];
                           if (var75 != -1 && !this.field9933.field7118.method5112(var75).field2331) {
                              var50.field2094[var67] = Statics.field7263[Statics.method4006(this.field9933.field7118.method5112(var75).field2322 & 65535) & 65535];
                           }
                        }

                        var50.field2096[var64] = -1;
                     }
                  }
               }

               this.field9928[arg0][arg1] = var50;
            }
         }

      }
   }

   @deob.ObfuscatedName("yq.z(II)I")
   private static int method16275(int arg0, int arg1) {
      int var2 = (arg0 & 16711680) * arg1 >> 23;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 253) {
         var2 = 253;
      }

      int var3 = (arg0 & 65280) * arg1 >> 15;
      if (var3 < 2) {
         var3 = 2;
      } else if (var3 > 253) {
         var3 = 253;
      }

      int var4 = (arg0 & 255) * arg1 >> 7;
      if (var4 < 2) {
         var4 = 2;
      } else if (var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   @deob.ObfuscatedName("yq.SA()V")
   public void method7249() {
      this.field9925 = (byte[][])null;
      this.field9947 = (byte[][])null;
   }

   @deob.ObfuscatedName("yq.d(III[[ZZI)V")
   public void method7262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      if (this.field9933.field10406 != null && this.field9933.field10414 != null) {
         class597 var7 = this.field9933.field10423;
         this.field9918 = var7.field5413[0];
         this.field9930 = var7.field5413[1];
         this.field9932 = var7.field5413[2];
         this.field9938 = var7.field5413[3];
         this.field9934 = var7.field5413[4];
         this.field9935 = var7.field5413[5];
         this.field9936 = var7.field5413[6];
         this.field9946 = var7.field5413[7];
         this.field9944 = var7.field5413[8];
         this.field9939 = var7.field5413[9];
         this.field9940 = var7.field5413[10];
         this.field9941 = var7.field5413[11];
         this.field9949 = var7.field5413[12];
         this.field9943 = var7.field5413[13];
         this.field9919 = var7.field5413[14];
         this.field9945 = var7.field5413[15];

         for(int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
               if (arg3[var8][var9]) {
                  int var10 = arg0 - arg2 + var8;
                  int var11 = arg1 - arg2 + var9;
                  if (var10 >= 0 && var10 < this.field9463 && var11 >= 0 && var11 < this.field9461) {
                     this.method16273(var10, var11, arg5);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   @deob.ObfuscatedName("yq.t(III)V")
   private void method16273(int arg0, int arg1, int arg2) {
      class321 var4 = this.field9933.method16838(Thread.currentThread());
      var4.field2014.field2213 = 0;
      if (this.field9927 != null) {
         this.method16279(arg0, arg1, var4.field2008, var4, var4.field2014, var4.field2032, var4.field2025, var4.field2005, var4.field2043, var4.field2044, arg2);
      } else if (this.field9931 != null) {
         this.method16278(arg0, arg1, var4.field2014, var4.field2032, var4.field2025, var4.field2005, var4.field2043, var4.field2044, arg2);
      } else if (this.field9929 != null) {
         this.method16277(arg0, arg1, var4.field2008, var4, var4.field2014, var4.field2032, var4.field2025, var4.field2005, var4.field2043, var4.field2044, arg2);
      }

   }

   @deob.ObfuscatedName("yq.y(IILbs;[F[F[F[F[FI)V")
   private void method16278(int arg0, int arg1, class350 arg2, float[] arg3, float[] arg4, float[] arg5, float[] arg6, float[] arg7, int arg8) {
      class337 var10 = this.field9931[arg0][arg1];
      if (var10 != null) {
         if ((var10.field2135 & 2) == 0) {
            if (arg8 != 0) {
               if ((var10.field2135 & 4) != 0) {
                  if ((arg8 & 1) != 0) {
                     return;
                  }
               } else if ((arg8 & 2) != 0) {
                  return;
               }
            }

            int var11 = this.field9460 * arg0;
            int var12 = this.field9460 + var11;
            int var13 = this.field9460 * arg1;
            int var14 = this.field9460 + var13;
            float var19;
            float var21;
            float var23;
            float var25;
            float var29;
            float var31;
            float var32;
            float var34;
            float var36;
            float var37;
            float var39;
            float var41;
            float var42;
            float var44;
            float var46;
            float var47;
            if ((var10.field2135 & 1) != 0) {
               int var15 = this.field9462[arg0][arg1];
               float var16 = (float)var15 * this.field9936;
               float var17 = (float)var15 * this.field9946;
               float var18 = (float)var13 * this.field9940 + (float)var11 * this.field9932 + var16 + this.field9919;
               var19 = (float)var13 * this.field9941 + (float)var11 * this.field9938 + var17 + this.field9945;
               if (var18 < -var19) {
                  return;
               }

               float var20 = (float)var13 * this.field9940 + (float)var12 * this.field9932 + var16 + this.field9919;
               var21 = (float)var13 * this.field9941 + (float)var12 * this.field9938 + var17 + this.field9945;
               if (var20 < -var21) {
                  return;
               }

               float var22 = (float)var14 * this.field9940 + (float)var12 * this.field9932 + var16 + this.field9919;
               var23 = (float)var14 * this.field9941 + (float)var12 * this.field9938 + var17 + this.field9945;
               if (var22 < -var23) {
                  return;
               }

               float var24 = (float)var14 * this.field9940 + (float)var11 * this.field9932 + var16 + this.field9919;
               var25 = (float)var14 * this.field9941 + (float)var11 * this.field9938 + var17 + this.field9945;
               if (var24 < -var25) {
                  return;
               }

               float var26 = (float)var15 * this.field9934;
               float var27 = (float)var15 * this.field9935;
               float var28 = (float)var13 * this.field9944 + (float)var11 * this.field9918 + var26 + this.field9949;
               var29 = arg2.field2214 * var28 / var19 + arg2.field2217;
               float var30 = (float)var13 * this.field9939 + (float)var11 * this.field9930 + var27 + this.field9943;
               var31 = arg2.field2210 * var30 / var19 + arg2.field2226;
               var32 = arg2.field2215 * var18 / var19 + arg2.field2221;
               float var33 = (float)var13 * this.field9944 + (float)var12 * this.field9918 + var26 + this.field9949;
               var34 = arg2.field2214 * var33 / var21 + arg2.field2217;
               float var35 = (float)var13 * this.field9939 + (float)var12 * this.field9930 + var27 + this.field9943;
               var36 = arg2.field2210 * var35 / var21 + arg2.field2226;
               var37 = arg2.field2215 * var20 / var21 + arg2.field2221;
               float var38 = (float)var14 * this.field9944 + (float)var12 * this.field9918 + var26 + this.field9949;
               var39 = arg2.field2214 * var38 / var23 + arg2.field2217;
               float var40 = (float)var14 * this.field9939 + (float)var12 * this.field9930 + var27 + this.field9943;
               var41 = arg2.field2210 * var40 / var23 + arg2.field2226;
               var42 = arg2.field2215 * var22 / var23 + arg2.field2221;
               float var43 = (float)var14 * this.field9944 + (float)var11 * this.field9918 + var26 + this.field9949;
               var44 = arg2.field2214 * var43 / var25 + arg2.field2217;
               float var45 = (float)var14 * this.field9939 + (float)var11 * this.field9930 + var27 + this.field9943;
               var46 = arg2.field2210 * var45 / var25 + arg2.field2226;
               var47 = arg2.field2215 * var24 / var25 + arg2.field2221;
            } else {
               int var48 = this.field9462[arg0][arg1];
               int var49 = this.field9462[arg0 + 1][arg1];
               int var50 = this.field9462[arg0 + 1][arg1 + 1];
               int var51 = this.field9462[arg0][arg1 + 1];
               float var52 = (float)var13 * this.field9940 + (float)var11 * this.field9932 + (float)var48 * this.field9936 + this.field9919;
               var19 = (float)var13 * this.field9941 + (float)var11 * this.field9938 + (float)var48 * this.field9946 + this.field9945;
               if (var52 < -var19) {
                  return;
               }

               float var53 = (float)var13 * this.field9940 + (float)var12 * this.field9932 + (float)var49 * this.field9936 + this.field9919;
               var21 = (float)var13 * this.field9941 + (float)var12 * this.field9938 + (float)var49 * this.field9946 + this.field9945;
               if (var53 < -var21) {
                  return;
               }

               float var54 = (float)var14 * this.field9940 + (float)var12 * this.field9932 + (float)var50 * this.field9936 + this.field9919;
               var23 = (float)var14 * this.field9941 + (float)var12 * this.field9938 + (float)var50 * this.field9946 + this.field9945;
               if (var54 < -var23) {
                  return;
               }

               float var55 = (float)var14 * this.field9940 + (float)var11 * this.field9932 + (float)var51 * this.field9936 + this.field9919;
               var25 = (float)var14 * this.field9941 + (float)var11 * this.field9938 + (float)var51 * this.field9946 + this.field9945;
               if (var55 < -var25) {
                  return;
               }

               float var56 = (float)var13 * this.field9944 + (float)var11 * this.field9918 + (float)var48 * this.field9934 + this.field9949;
               var29 = arg2.field2214 * var56 / var19 + arg2.field2217;
               float var57 = (float)var13 * this.field9939 + (float)var11 * this.field9930 + (float)var48 * this.field9935 + this.field9943;
               var31 = arg2.field2210 * var57 / var19 + arg2.field2226;
               var32 = arg2.field2215 * var52 / var19 + arg2.field2221;
               float var58 = (float)var13 * this.field9944 + (float)var12 * this.field9918 + (float)var49 * this.field9934 + this.field9949;
               var34 = arg2.field2214 * var58 / var21 + arg2.field2217;
               float var59 = (float)var13 * this.field9939 + (float)var12 * this.field9930 + (float)var49 * this.field9935 + this.field9943;
               var36 = arg2.field2210 * var59 / var21 + arg2.field2226;
               var37 = arg2.field2215 * var53 / var21 + arg2.field2221;
               float var60 = (float)var14 * this.field9944 + (float)var12 * this.field9918 + (float)var50 * this.field9934 + this.field9949;
               var39 = arg2.field2214 * var60 / var23 + arg2.field2217;
               float var61 = (float)var14 * this.field9939 + (float)var12 * this.field9930 + (float)var50 * this.field9935 + this.field9943;
               var41 = arg2.field2210 * var61 / var23 + arg2.field2226;
               var42 = arg2.field2215 * var54 / var23 + arg2.field2221;
               float var62 = (float)var14 * this.field9944 + (float)var11 * this.field9918 + (float)var51 * this.field9934 + this.field9949;
               var44 = arg2.field2214 * var62 / var25 + arg2.field2217;
               float var63 = (float)var14 * this.field9939 + (float)var11 * this.field9930 + (float)var51 * this.field9935 + this.field9943;
               var46 = arg2.field2210 * var63 / var25 + arg2.field2226;
               var47 = arg2.field2215 * var55 / var25 + arg2.field2221;
            }

            if ((var36 - var46) * (var39 - var44) - (var34 - var44) * (var41 - var46) > 0.0F) {
               arg2.field2238 = var39 < 0.0F || var44 < 0.0F || var34 < 0.0F || var39 > (float)(arg2.field2225 * 824681839) || var44 > (float)(arg2.field2225 * 824681839) || var34 > (float)(arg2.field2225 * 824681839);
               if (var10.field2136 >= 0) {
                  arg2.method4230(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, var23, var25, var21, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | Statics.field7263[var10.field2133 & 65535] & 16777215, -16777216 | Statics.field7263[var10.field2134 & 65535] & 16777215, -16777216 | Statics.field7263[var10.field2132 & 65535] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.field2136);
               } else {
                  arg2.method4237(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, (float)(var10.field2133 & 65535), (float)(var10.field2134 & 65535), (float)(var10.field2132 & 65535));
               }
            }

            if ((var29 - var34) * (var46 - var36) - (var31 - var36) * (var44 - var34) > 0.0F) {
               arg2.field2238 = var29 < 0.0F || var34 < 0.0F || var44 < 0.0F || var29 > (float)(arg2.field2225 * 824681839) || var34 > (float)(arg2.field2225 * 824681839) || var44 > (float)(arg2.field2225 * 824681839);
               if (var10.field2136 >= 0) {
                  arg2.method4230(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, var19, var21, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | Statics.field7263[var10.field2131 & 65535] & 16777215, -16777216 | Statics.field7263[var10.field2132 & 65535] & 16777215, -16777216 | Statics.field7263[var10.field2134 & 65535] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.field2136);
               } else {
                  arg2.method4237(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, (float)(var10.field2131 & 65535), (float)(var10.field2132 & 65535), (float)(var10.field2134 & 65535));
               }
            }

         }
      } else {
         class83 var64 = this.field9926[arg0][arg1];
         if (var64 != null) {
            if (arg8 != 0) {
               if ((var64.field607 & 4) != 0) {
                  if ((arg8 & 1) != 0) {
                     return;
                  }
               } else if ((arg8 & 2) != 0) {
                  return;
               }
            }

            for(int var65 = 0; var65 < var64.field606; ++var65) {
               int var66 = (arg0 << this.field9464) + var64.field608[var65];
               short var67 = var64.field609[var65];
               int var68 = (arg1 << this.field9464) + var64.field615[var65];
               float var69 = (float)var68 * this.field9940 + (float)var66 * this.field9932 + (float)var67 * this.field9936 + this.field9919;
               float var70 = (float)var68 * this.field9941 + (float)var66 * this.field9938 + (float)var67 * this.field9946 + this.field9945;
               if (var69 < -var70) {
                  return;
               }

               float var71 = (float)var68 * this.field9944 + (float)var66 * this.field9918 + (float)var67 * this.field9934 + this.field9949;
               float var72 = (float)var68 * this.field9939 + (float)var66 * this.field9930 + (float)var67 * this.field9935 + this.field9943;
               arg3[var65] = arg2.field2214 * var71 / var70 + arg2.field2217;
               arg4[var65] = arg2.field2210 * var72 / var70 + arg2.field2226;
               arg5[var65] = arg2.field2215 * var69 / var70 + arg2.field2221;
               arg6[var65] = var70;
            }

            if (var64.field617 != null) {
               for(int var73 = 0; var73 < var64.field610; ++var73) {
                  short var74 = var64.field612[var73];
                  short var75 = var64.field613[var73];
                  short var76 = var64.field614[var73];
                  float var77 = arg3[var74];
                  float var78 = arg3[var75];
                  float var79 = arg3[var76];
                  float var80 = arg4[var74];
                  float var81 = arg4[var75];
                  float var82 = arg4[var76];
                  if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0.0F) {
                     arg2.field2238 = var77 < 0.0F || var78 < 0.0F || var79 < 0.0F || var77 > (float)(arg2.field2225 * 824681839) || var78 > (float)(arg2.field2225 * 824681839) || var79 > (float)(arg2.field2225 * 824681839);
                     short var83 = var64.field617[var73];
                     if (var83 != -1) {
                        arg2.method4230(true, true, false, var80, var81, var82, var77, var78, var79, arg5[var74], arg5[var75], arg5[var76], arg6[var74], arg6[var75], arg6[var76], (float)var64.field608[var74] / (float)this.field9460, (float)var64.field608[var75] / (float)this.field9460, (float)var64.field608[var76] / (float)this.field9460, (float)var64.field615[var74] / (float)this.field9460, (float)var64.field615[var75] / (float)this.field9460, (float)var64.field615[var76] / (float)this.field9460, -16777216 | Statics.field7263[var64.field605[var74] & 65535] & 16777215, -16777216 | Statics.field7263[var64.field605[var75] & 65535] & 16777215, -16777216 | Statics.field7263[var64.field605[var76] & 65535] & 16777215, 0, 0.0F, 0.0F, 0.0F, var83);
                     } else {
                        int var84 = var64.field611[var73];
                        if (var84 != -1) {
                           arg2.method4237(true, true, false, var80, var81, var82, var77, var78, var79, arg5[var74], arg5[var75], arg5[var76], (float)Statics.method4415(var84, var64.field605[var74]), (float)Statics.method4415(var84, var64.field605[var75]), (float)Statics.method4415(var84, var64.field605[var76]));
                        }
                     }
                  }
               }
            } else {
               for(int var85 = 0; var85 < var64.field610; ++var85) {
                  short var86 = var64.field612[var85];
                  short var87 = var64.field613[var85];
                  short var88 = var64.field614[var85];
                  float var89 = arg3[var86];
                  float var90 = arg3[var87];
                  float var91 = arg3[var88];
                  float var92 = arg4[var86];
                  float var93 = arg4[var87];
                  float var94 = arg4[var88];
                  if ((var89 - var90) * (var94 - var93) - (var91 - var90) * (var92 - var93) > 0.0F) {
                     int var95 = var64.field611[var85];
                     if (var95 != -1) {
                        arg2.field2238 = var89 < 0.0F || var90 < 0.0F || var91 < 0.0F || var89 > (float)(arg2.field2225 * 824681839) || var90 > (float)(arg2.field2225 * 824681839) || var91 > (float)(arg2.field2225 * 824681839);
                        arg2.method4237(true, true, false, var92, var93, var94, var89, var90, var91, arg5[var86], arg5[var87], arg5[var88], (float)Statics.method4415(var95, var64.field605[var86]), (float)Statics.method4415(var95, var64.field605[var87]), (float)Statics.method4415(var95, var64.field605[var88]));
                     }
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yq.ab(IIZLaq;Lbs;[F[F[F[F[FI)V")
   private void method16279(int arg0, int arg1, boolean arg2, class321 arg3, class350 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
      class56 var12 = this.field9927[arg0][arg1];
      if (var12 != null) {
         if ((var12.field408 & 2) == 0) {
            if (arg10 != 0) {
               if ((var12.field408 & 4) != 0) {
                  if ((arg10 & 1) != 0) {
                     return;
                  }
               } else if ((arg10 & 2) != 0) {
                  return;
               }
            }

            int var13 = this.field9460 * arg0;
            int var14 = this.field9460 + var13;
            int var15 = this.field9460 * arg1;
            int var16 = this.field9460 + var15;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;
            float var25;
            float var27;
            float var29;
            float var31;
            float var32;
            float var33;
            float var34;
            float var35;
            float var43;
            float var45;
            float var47;
            float var49;
            float var51;
            float var53;
            float var55;
            float var57;
            if ((var12.field408 & 1) != 0 && !arg2) {
               int var21 = this.field9462[arg0][arg1];
               float var22 = (float)var21 * this.field9936;
               float var23 = (float)var21 * this.field9946;
               float var24 = (float)var15 * this.field9940 + (float)var13 * this.field9932 + var22 + this.field9919;
               var25 = (float)var15 * this.field9941 + (float)var13 * this.field9938 + var23 + this.field9945;
               if (var24 < -var25) {
                  return;
               }

               float var26 = (float)var15 * this.field9940 + (float)var14 * this.field9932 + var22 + this.field9919;
               var27 = (float)var15 * this.field9941 + (float)var14 * this.field9938 + var23 + this.field9945;
               if (var26 < -var27) {
                  return;
               }

               float var28 = (float)var16 * this.field9940 + (float)var14 * this.field9932 + var22 + this.field9919;
               var29 = (float)var16 * this.field9941 + (float)var14 * this.field9938 + var23 + this.field9945;
               if (var28 < -var29) {
                  return;
               }

               float var30 = (float)var16 * this.field9940 + (float)var13 * this.field9932 + var22 + this.field9919;
               var31 = (float)var16 * this.field9941 + (float)var13 * this.field9938 + var23 + this.field9945;
               if (var30 < -var31) {
                  return;
               }

               var32 = arg4.field2215 * var24 / var25 + arg4.field2221;
               var33 = arg4.field2215 * var26 / var27 + arg4.field2221;
               var34 = arg4.field2215 * var28 / var29 + arg4.field2221;
               var35 = arg4.field2215 * var30 / var31 + arg4.field2221;
               if (arg3.field2003) {
                  float var36 = var24 - arg3.field2004;
                  if (var36 > 0.0F) {
                     var17 = var36 / arg3.field2018;
                     if (var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  float var37 = var26 - arg3.field2004;
                  if (var37 > 0.0F) {
                     var18 = var37 / arg3.field2018;
                     if (var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  float var38 = var28 - arg3.field2004;
                  if (var38 > 0.0F) {
                     var19 = var38 / arg3.field2018;
                     if (var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  float var39 = var30 - arg3.field2004;
                  if (var39 > 0.0F) {
                     var20 = var39 / arg3.field2018;
                     if (var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               float var40 = (float)var21 * this.field9934;
               float var41 = (float)var21 * this.field9935;
               float var42 = (float)var15 * this.field9944 + (float)var13 * this.field9918 + var40 + this.field9949;
               var43 = arg4.field2214 * var42 / var25 + arg4.field2217;
               float var44 = (float)var15 * this.field9939 + (float)var13 * this.field9930 + var41 + this.field9943;
               var45 = arg4.field2210 * var44 / var25 + arg4.field2226;
               float var46 = (float)var15 * this.field9944 + (float)var14 * this.field9918 + var40 + this.field9949;
               var47 = arg4.field2214 * var46 / var27 + arg4.field2217;
               float var48 = (float)var15 * this.field9939 + (float)var14 * this.field9930 + var41 + this.field9943;
               var49 = arg4.field2210 * var48 / var27 + arg4.field2226;
               float var50 = (float)var16 * this.field9944 + (float)var14 * this.field9918 + var40 + this.field9949;
               var51 = arg4.field2214 * var50 / var29 + arg4.field2217;
               float var52 = (float)var16 * this.field9939 + (float)var14 * this.field9930 + var41 + this.field9943;
               var53 = arg4.field2210 * var52 / var29 + arg4.field2226;
               float var54 = (float)var16 * this.field9944 + (float)var13 * this.field9918 + var40 + this.field9949;
               var55 = arg4.field2214 * var54 / var31 + arg4.field2217;
               float var56 = (float)var16 * this.field9939 + (float)var13 * this.field9930 + var41 + this.field9943;
               var57 = arg4.field2210 * var56 / var31 + arg4.field2226;
            } else {
               int var58 = this.field9462[arg0][arg1];
               int var59 = this.field9462[arg0 + 1][arg1];
               int var60 = this.field9462[arg0 + 1][arg1 + 1];
               int var61 = this.field9462[arg0][arg1 + 1];
               float var62 = (float)var15 * this.field9940 + (float)var13 * this.field9932 + (float)var58 * this.field9936 + this.field9919;
               var25 = (float)var15 * this.field9941 + (float)var13 * this.field9938 + (float)var58 * this.field9946 + this.field9945;
               if (var62 < -var25) {
                  return;
               }

               float var63 = (float)var15 * this.field9940 + (float)var14 * this.field9932 + (float)var59 * this.field9936 + this.field9919;
               var27 = (float)var15 * this.field9941 + (float)var14 * this.field9938 + (float)var59 * this.field9946 + this.field9945;
               if (var63 < -var27) {
                  return;
               }

               float var64 = (float)var16 * this.field9940 + (float)var14 * this.field9932 + (float)var60 * this.field9936 + this.field9919;
               var29 = (float)var16 * this.field9941 + (float)var14 * this.field9938 + (float)var60 * this.field9946 + this.field9945;
               if (var64 < -var29) {
                  return;
               }

               float var65 = (float)var16 * this.field9940 + (float)var13 * this.field9932 + (float)var61 * this.field9936 + this.field9919;
               var31 = (float)var16 * this.field9941 + (float)var13 * this.field9938 + (float)var61 * this.field9946 + this.field9945;
               if (var65 < -var31) {
                  return;
               }

               var32 = arg4.field2215 * var62 / var25 + arg4.field2221;
               var33 = arg4.field2215 * var63 / var27 + arg4.field2221;
               var34 = arg4.field2215 * var64 / var29 + arg4.field2221;
               var35 = arg4.field2215 * var65 / var31 + arg4.field2221;
               if (arg2) {
                  float var66 = var62 - arg3.field2004;
                  if (var66 > 0.0F) {
                     float var67 = var66 / arg3.field2018;
                     if (var67 > 1.0F) {
                        var67 = 1.0F;
                     }

                     var17 = var67;
                     int var68 = (int)((float)var12.field412 * var67);
                     if (var68 > 0) {
                        var58 -= var68;
                     }
                  }

                  float var69 = var63 - arg3.field2004;
                  if (var69 > 0.0F) {
                     float var70 = var69 / arg3.field2018;
                     if (var70 > 1.0F) {
                        var70 = 1.0F;
                     }

                     var18 = var70;
                     int var71 = (int)((float)var12.field413 * var70);
                     if (var71 > 0) {
                        var59 -= var71;
                     }
                  }

                  float var72 = var64 - arg3.field2004;
                  if (var72 > 0.0F) {
                     float var73 = var72 / arg3.field2018;
                     if (var73 > 1.0F) {
                        var73 = 1.0F;
                     }

                     var19 = var73;
                     int var74 = (int)((float)var12.field414 * var73);
                     if (var74 > 0) {
                        var60 -= var74;
                     }
                  }

                  float var75 = var65 - arg3.field2004;
                  if (var75 > 0.0F) {
                     float var76 = var75 / arg3.field2018;
                     if (var76 > 1.0F) {
                        var76 = 1.0F;
                     }

                     var20 = var76;
                     int var77 = (int)((float)var12.field407 * var76);
                     if (var77 > 0) {
                        var61 -= var77;
                     }
                  }
               } else if (arg3.field2003) {
                  float var78 = var62 - arg3.field2004;
                  if (var78 > 0.0F) {
                     var17 = var78 / arg3.field2018;
                     if (var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  float var79 = var63 - arg3.field2004;
                  if (var79 > 0.0F) {
                     var18 = var79 / arg3.field2018;
                     if (var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  float var80 = var64 - arg3.field2004;
                  if (var80 > 0.0F) {
                     var19 = var80 / arg3.field2018;
                     if (var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  float var81 = var65 - arg3.field2004;
                  if (var81 > 0.0F) {
                     var20 = var81 / arg3.field2018;
                     if (var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               float var82 = (float)var15 * this.field9944 + (float)var13 * this.field9918 + (float)var58 * this.field9934 + this.field9949;
               var43 = arg4.field2214 * var82 / var25 + arg4.field2217;
               float var83 = (float)var15 * this.field9939 + (float)var13 * this.field9930 + (float)var58 * this.field9935 + this.field9943;
               var45 = arg4.field2210 * var83 / var25 + arg4.field2226;
               float var84 = (float)var15 * this.field9944 + (float)var14 * this.field9918 + (float)var59 * this.field9934 + this.field9949;
               var47 = arg4.field2214 * var84 / var27 + arg4.field2217;
               float var85 = (float)var15 * this.field9939 + (float)var14 * this.field9930 + (float)var59 * this.field9935 + this.field9943;
               var49 = arg4.field2210 * var85 / var27 + arg4.field2226;
               float var86 = (float)var16 * this.field9944 + (float)var14 * this.field9918 + (float)var60 * this.field9934 + this.field9949;
               var51 = arg4.field2214 * var86 / var29 + arg4.field2217;
               float var87 = (float)var16 * this.field9939 + (float)var14 * this.field9930 + (float)var60 * this.field9935 + this.field9943;
               var53 = arg4.field2210 * var87 / var29 + arg4.field2226;
               float var88 = (float)var16 * this.field9944 + (float)var13 * this.field9918 + (float)var61 * this.field9934 + this.field9949;
               var55 = arg4.field2214 * var88 / var31 + arg4.field2217;
               float var89 = (float)var16 * this.field9939 + (float)var13 * this.field9930 + (float)var61 * this.field9935 + this.field9943;
               var57 = arg4.field2210 * var89 / var31 + arg4.field2226;
            }

            boolean var90 = var12.field409 != -1 && this.method16291(this.field9933.field7118.method5112(var12.field409).field2324);
            float var91 = var18 + var19 + var20;
            if ((var49 - var57) * (var51 - var55) - (var47 - var55) * (var53 - var57) > 0.0F) {
               arg4.field2238 = var51 < 0.0F || var55 < 0.0F || var47 < 0.0F || var51 > (float)(arg4.field2225 * 824681839) || var55 > (float)(arg4.field2225 * 824681839) || var47 > (float)(arg4.field2225 * 824681839);
               if (var91 < 3.0F) {
                  if (var91 > 0.0F) {
                     if (var12.field409 >= 0) {
                        int var92 = -16777216;
                        if (var90) {
                           var92 = -1694498816;
                        }

                        arg4.method4230(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var92 | var12.field410 & 16777215, var92 | var12.field411 & 16777215, var92 | var12.field416 & 16777215, arg3.field2006, var19 * 255.0F, var20 * 255.0F, var18 * 255.0F, var12.field409);
                     } else {
                        if (var90) {
                           arg4.field2213 = 100;
                        }

                        arg4.method4226(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, class789.method8925(var12.field410, (int)(var19 * 255.0F) << 24 | arg3.field2006), class789.method8925(var12.field411, (int)(var20 * 255.0F) << 24 | arg3.field2006), class789.method8925(var12.field416, (int)(var18 * 255.0F) << 24 | arg3.field2006));
                        arg4.field2213 = 0;
                     }
                  } else if (var12.field409 >= 0) {
                     int var93 = -16777216;
                     if (var90) {
                        var93 = -1694498816;
                     }

                     arg4.method4230(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var93 | var12.field410 & 16777215, var93 | var12.field411 & 16777215, var93 | var12.field416 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.field409);
                  } else {
                     if (var90) {
                        arg4.field2213 = 100;
                     }

                     arg4.method4226(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var12.field410, var12.field411, var12.field416);
                     arg4.field2213 = 0;
                  }
               } else {
                  arg4.method4220(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, arg3.field2006);
               }
            }

            float var94 = var17 + var18 + var20;
            if ((var43 - var47) * (var57 - var49) - (var45 - var49) * (var55 - var47) > 0.0F) {
               arg4.field2238 = var43 < 0.0F || var47 < 0.0F || var55 < 0.0F || var43 > (float)(arg4.field2225 * 824681839) || var47 > (float)(arg4.field2225 * 824681839) || var55 > (float)(arg4.field2225 * 824681839);
               if (var94 < 3.0F) {
                  if (var90) {
                     arg4.field2213 = -1694498816;
                  }

                  if (var94 > 0.0F) {
                     if (var12.field409 >= 0) {
                        int var95 = -16777216;
                        if (var90) {
                           var95 = -1694498816;
                        }

                        arg4.method4230(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var95 | var12.field415 & 16777215, var95 | var12.field416 & 16777215, var95 | var12.field411 & 16777215, arg3.field2006, var17 * 255.0F, var18 * 255.0F, var20 * 255.0F, var12.field409);
                     } else {
                        if (var90) {
                           arg4.field2213 = 100;
                        }

                        arg4.method4226(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, class789.method8925(var12.field415, (int)(var17 * 255.0F) << 24 | arg3.field2006), class789.method8925(var12.field416, (int)(var18 * 255.0F) << 24 | arg3.field2006), class789.method8925(var12.field411, (int)(var20 * 255.0F) << 24 | arg3.field2006));
                        arg4.field2213 = 0;
                     }
                  } else if (var12.field409 >= 0) {
                     int var96 = -16777216;
                     if (var90) {
                        var96 = -1694498816;
                     }

                     arg4.method4230(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var96 | var12.field415 & 16777215, var96 | var12.field416 & 16777215, var96 | var12.field411 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.field409);
                  } else {
                     if (var90) {
                        arg4.field2213 = 100;
                     }

                     arg4.method4226(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var12.field415, var12.field416, var12.field411);
                     arg4.field2213 = 0;
                  }
               } else {
                  arg4.method4220(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, arg3.field2006);
               }
            }

         }
      } else {
         class329 var97 = this.field9928[arg0][arg1];
         if (var97 != null) {
            if (arg10 != 0) {
               if ((var97.field2090 & 4) != 0) {
                  if ((arg10 & 1) != 0) {
                     return;
                  }
               } else if ((arg10 & 2) != 0) {
                  return;
               }
            }

            for(int var98 = 0; var98 < var97.field2089; ++var98) {
               int var99 = (arg0 << this.field9464) + var97.field2091[var98];
               int var100 = var97.field2092[var98];
               int var101 = (arg1 << this.field9464) + var97.field2095[var98];
               float var102 = (float)var101 * this.field9940 + (float)var99 * this.field9932 + (float)var100 * this.field9936 + this.field9919;
               float var103 = (float)var101 * this.field9941 + (float)var99 * this.field9938 + (float)var100 * this.field9946 + this.field9945;
               if (var102 < -var103) {
                  return;
               }

               float var104 = arg4.field2215 * var102 / var103 + arg4.field2221;
               arg9[var98] = 0.0F;
               if (arg2) {
                  float var105 = var102 - arg3.field2004;
                  if (var105 > 0.0F) {
                     float var106 = var105 / arg3.field2018;
                     if (var106 > 1.0F) {
                        var106 = 1.0F;
                     }

                     arg9[var98] = var106;
                     int var107 = (int)((float)var97.field2093[var98] * var106);
                     if (var107 > 0) {
                        var100 -= var107;
                     }
                  }
               } else if (arg3.field2003) {
                  float var108 = var102 - arg3.field2004;
                  if (var108 > 0.0F) {
                     arg9[var98] = var108 / arg3.field2018;
                     if (arg9[var98] > 1.0F) {
                        arg9[var98] = 1.0F;
                     }
                  }
               }

               float var109 = (float)var101 * this.field9944 + (float)var99 * this.field9918 + (float)var100 * this.field9934 + this.field9949;
               float var110 = (float)var101 * this.field9939 + (float)var99 * this.field9930 + (float)var100 * this.field9935 + this.field9943;
               arg5[var98] = arg4.field2214 * var109 / var103 + arg4.field2217;
               arg6[var98] = arg4.field2210 * var110 / var103 + arg4.field2226;
               arg7[var98] = var104;
               arg8[var98] = var103;
            }

            if (var97.field2096 != null) {
               for(int var111 = 0; var111 < var97.field2088; ++var111) {
                  int var112 = var111 * 3;
                  int var113 = var112 + 1;
                  int var114 = var113 + 1;
                  float var115 = arg5[var112];
                  float var116 = arg5[var113];
                  float var117 = arg5[var114];
                  float var118 = arg6[var112];
                  float var119 = arg6[var113];
                  float var120 = arg6[var114];
                  float var121 = arg9[var112] + arg9[var113] + arg9[var114];
                  if ((var115 - var116) * (var120 - var119) - (var117 - var116) * (var118 - var119) > 0.0F) {
                     arg4.field2238 = var115 < 0.0F || var116 < 0.0F || var117 < 0.0F || var115 > (float)(arg4.field2225 * 824681839) || var116 > (float)(arg4.field2225 * 824681839) || var117 > (float)(arg4.field2225 * 824681839);
                     short var122 = var97.field2096[var111];
                     if (var121 < 3.0F) {
                        if (var121 > 0.0F) {
                           if (var122 != -1) {
                              int var123 = -16777216;
                              if (var122 != -1 && this.method16291(this.field9933.field7118.method5112(var122).field2324)) {
                                 var123 = -1694498816;
                              }

                              arg4.method4230(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], arg8[var112], arg8[var113], arg8[var114], (float)var97.field2091[var112] / (float)this.field9460, (float)var97.field2091[var113] / (float)this.field9460, (float)var97.field2091[var114] / (float)this.field9460, (float)var97.field2095[var112] / (float)this.field9460, (float)var97.field2095[var113] / (float)this.field9460, (float)var97.field2095[var114] / (float)this.field9460, var123 | var97.field2094[var112] & 16777215, var123 | var97.field2094[var113] & 16777215, var123 | var97.field2094[var114] & 16777215, arg3.field2006, arg9[var112] * 255.0F, arg9[var113] * 255.0F, arg9[var114] * 255.0F, var122);
                           } else if ((var97.field2094[var112] & 16777215) != 0) {
                              if (var122 != -1 && this.method16291(this.field9933.field7118.method5112(var122).field2324)) {
                                 arg4.field2213 = -1694498816;
                              }

                              arg4.method4226(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], class789.method8925(var97.field2094[var112], (int)(arg9[var112] * 255.0F) << 24 | arg3.field2006), class789.method8925(var97.field2094[var113], (int)(arg9[var113] * 255.0F) << 24 | arg3.field2006), class789.method8925(var97.field2094[var114], (int)(arg9[var114] * 255.0F) << 24 | arg3.field2006));
                              arg4.field2213 = 0;
                           }
                        } else if (var122 != -1) {
                           int var124 = -16777216;
                           if (var122 != -1 && this.method16291(this.field9933.field7118.method5112(var122).field2324)) {
                              var124 = -1694498816;
                           }

                           arg4.method4230(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], arg8[var112], arg8[var113], arg8[var114], (float)var97.field2091[var112] / (float)this.field9460, (float)var97.field2091[var113] / (float)this.field9460, (float)var97.field2091[var114] / (float)this.field9460, (float)var97.field2095[var112] / (float)this.field9460, (float)var97.field2095[var113] / (float)this.field9460, (float)var97.field2095[var114] / (float)this.field9460, var124 | var97.field2094[var112] & 16777215, var124 | var97.field2094[var113] & 16777215, var124 | var97.field2094[var114] & 16777215, 0, 0.0F, 0.0F, 0.0F, var122);
                        } else if ((var97.field2094[var112] & 16777215) != 0) {
                           if (var122 != -1 && this.method16291(this.field9933.field7118.method5112(var122).field2324)) {
                              arg4.field2213 = -1694498816;
                           }

                           arg4.method4226(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], var97.field2094[var112], var97.field2094[var113], var97.field2094[var114]);
                           arg4.field2213 = 0;
                        }
                     } else {
                        arg4.method4220(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], arg3.field2006);
                     }
                  }
               }
            } else {
               for(int var125 = 0; var125 < var97.field2088; ++var125) {
                  int var126 = var125 * 3;
                  int var127 = var126 + 1;
                  int var128 = var127 + 1;
                  float var129 = arg5[var126];
                  float var130 = arg5[var127];
                  float var131 = arg5[var128];
                  float var132 = arg6[var126];
                  float var133 = arg6[var127];
                  float var134 = arg6[var128];
                  float var135 = arg9[var126] + arg9[var127] + arg9[var128];
                  if ((var129 - var130) * (var134 - var133) - (var131 - var130) * (var132 - var133) > 0.0F) {
                     arg4.field2238 = var129 < 0.0F || var130 < 0.0F || var131 < 0.0F || var129 > (float)(arg4.field2225 * 824681839) || var130 > (float)(arg4.field2225 * 824681839) || var131 > (float)(arg4.field2225 * 824681839);
                     if (var135 < 3.0F) {
                        if (var135 > 0.0F) {
                           if ((var97.field2094[var126] & 16777215) != 0) {
                              arg4.method4226(true, true, false, var132, var133, var134, var129, var130, var131, arg7[var126], arg7[var127], arg7[var128], class789.method10708(var97.field2094[var126], arg3.field2006, arg9[var126] * 255.0F), class789.method10708(var97.field2094[var127], arg3.field2006, arg9[var127] * 255.0F), class789.method10708(var97.field2094[var128], arg3.field2006, arg9[var128] * 255.0F));
                           }
                        } else if ((var97.field2094[var126] & 16777215) != 0) {
                           arg4.method4226(true, true, false, var132, var133, var134, var129, var130, var131, arg7[var126], arg7[var127], arg7[var128], var97.field2094[var126], var97.field2094[var127], var97.field2094[var128]);
                        }
                     } else {
                        arg4.method4220(true, true, false, var132, var133, var134, var129, var130, var131, arg7[var126], arg7[var127], arg7[var128], arg3.field2006);
                     }
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yq.ae(IIZLaq;Lbs;[F[F[F[F[FI)V")
   private void method16277(int arg0, int arg1, boolean arg2, class321 arg3, class350 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
      class347 var12 = this.field9929[arg0][arg1];
      if (arg10 == 0 || (arg10 & 2) == 0) {
         if (var12 != null) {
            for(int var13 = 0; var13 < var12.field2191; ++var13) {
               int var14 = (arg0 << this.field9464) + var12.field2192[var13];
               int var15 = var12.field2195[var13];
               int var16 = (arg1 << this.field9464) + var12.field2194[var13];
               float var17 = (float)var16 * this.field9940 + (float)var14 * this.field9932 + (float)var15 * this.field9936 + this.field9919;
               float var18 = (float)var16 * this.field9941 + (float)var14 * this.field9938 + (float)var15 * this.field9946 + this.field9945;
               if (var17 < -var18) {
                  return;
               }

               arg9[var13] = 0.0F;
               if (arg2) {
                  float var19 = var17 - arg3.field2004;
                  if (var19 > 0.0F) {
                     float var20 = var19 / arg3.field2018;
                     if (var20 > 1.0F) {
                        var20 = 1.0F;
                     }

                     arg9[var13] = var20;
                     int var21 = (int)((float)var12.field2193[var13] * var20);
                     if (var21 > 0) {
                        var15 -= var21;
                     }
                  }
               } else if (arg3.field2003) {
                  float var22 = var17 - arg3.field2004;
                  if (var22 > 0.0F) {
                     arg9[var13] = var22 / arg3.field2018;
                     if (arg9[var13] > 1.0F) {
                        arg9[var13] = 1.0F;
                     }
                  }
               }

               float var23 = (float)var16 * this.field9944 + (float)var14 * this.field9918 + (float)var15 * this.field9934 + this.field9949;
               float var24 = (float)var16 * this.field9939 + (float)var14 * this.field9930 + (float)var15 * this.field9935 + this.field9943;
               arg5[var13] = arg4.field2214 * var23 / var18 + arg4.field2217;
               arg6[var13] = arg4.field2210 * var24 / var18 + arg4.field2226;
               arg7[var13] = arg4.field2215 * var17 / var18 + arg4.field2221;
               arg8[var13] = var18;
            }

            float var25 = (float)this.field9460;

            for(int var26 = 0; var26 < var12.field2197; ++var26) {
               int var27 = var26 * 3;
               int var28 = var27 + 1;
               int var29 = var28 + 1;
               float var30 = arg5[var27];
               float var31 = arg5[var28];
               float var32 = arg5[var29];
               float var33 = arg6[var27];
               float var34 = arg6[var28];
               float var35 = arg6[var29];
               if ((var30 - var31) * (var35 - var34) - (var32 - var31) * (var33 - var34) > 0.0F) {
                  arg4.field2238 = var30 < 0.0F || var31 < 0.0F || var32 < 0.0F || var30 > (float)(arg4.field2225 * 824681839) || var31 > (float)(arg4.field2225 * 824681839) || var32 > (float)(arg4.field2225 * 824681839);
                  if (arg9[var27] + arg9[var28] + arg9[var29] < 3.0F) {
                     int var36 = arg0 << this.field9464;
                     int var37 = arg1 << this.field9464;
                     if ((var12.field2190[var27] & 16777215) != 0) {
                        if (var12.field2198[var27] == var12.field2198[var28] && var12.field2198[var27] == var12.field2198[var29] && var12.field2196[var27] == var12.field2196[var28] && var12.field2196[var27] == var12.field2196[var29]) {
                           arg4.method4230(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg8[var27], arg8[var28], arg8[var29], (float)(var12.field2192[var27] + var36) / (float)var12.field2196[var27], (float)(var12.field2192[var28] + var36) / (float)var12.field2196[var28], (float)(var12.field2192[var29] + var36) / (float)var12.field2196[var29], (float)(var12.field2194[var27] + var37) / (float)var12.field2196[var27], (float)(var12.field2194[var28] + var37) / (float)var12.field2196[var28], (float)(var12.field2194[var29] + var37) / (float)var12.field2196[var29], var12.field2190[var27], var12.field2190[var28], var12.field2190[var29], arg3.field2006, arg9[var27] * 255.0F, arg9[var28] * 255.0F, arg9[var29] * 255.0F, var12.field2198[var27]);
                        } else {
                           arg4.method4232(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg8[var27], arg8[var28], arg8[var29], (float)(var12.field2192[var27] + var36) / var25, (float)(var12.field2192[var28] + var36) / var25, (float)(var12.field2192[var29] + var36) / var25, (float)(var12.field2194[var27] + var37) / var25, (float)(var12.field2194[var28] + var37) / var25, (float)(var12.field2194[var29] + var37) / var25, var12.field2190[var27], var12.field2190[var28], var12.field2190[var29], arg3.field2006, arg9[var27] * 255.0F, arg9[var28] * 255.0F, arg9[var29] * 255.0F, var12.field2198[var27], var25 / (float)var12.field2196[var27], var12.field2198[var28], var25 / (float)var12.field2196[var28], var12.field2198[var29], var25 / (float)var12.field2196[var29]);
                        }
                     }
                  } else {
                     arg4.method4220(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg3.field2006);
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yq.az(I)Z")
   private boolean method16291(int arg0) {
      if ((this.field9924 & 8) == 0) {
         return false;
      } else if (arg0 == 4) {
         return true;
      } else if (arg0 == 8) {
         return true;
      } else {
         return arg0 == 9;
      }
   }

   @deob.ObfuscatedName("yq.b(IIIIIII[[Z)V")
   public void method7288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class321 var9 = this.field9933.method16838(Thread.currentThread());
      class350 var10 = var9.field2014;
      var10.field2213 = 0;
      var10.field2238 = true;
      this.field9933.method16860();
      if (this.field9927 == null && this.field9929 == null) {
         if (this.field9931 != null) {
            this.method16292(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field2032, var9.field2025);
         }
      } else {
         this.method16287(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field2032, var9.field2025);
      }

   }

   @deob.ObfuscatedName("yq.aq(IIIIIII[[ZLaq;Lbs;[F[F)V")
   private void method16292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class321 arg8, class350 arg9, float[] arg10, float[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field2011;
      this.field9933.method7551(false);
      arg9.field2229 = false;
      arg9.field2212 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field9931[var18][var19] != null) {
                  class337 var20 = this.field9931[var18][var19];
                  if (var20.field2136 != -1 && (var20.field2135 & 2) == 0 && var20.field2130 == -1) {
                     int var21 = this.field9933.method16833(var20.field2136);
                     arg9.method4237(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)Statics.method4415(var21, var20.field2133 & 65535), (float)Statics.method4415(var21, var20.field2134 & 65535), (float)Statics.method4415(var21, var20.field2132 & 65535));
                     arg9.method4237(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)Statics.method4415(var21, var20.field2131 & 65535), (float)Statics.method4415(var21, var20.field2132 & 65535), (float)Statics.method4415(var21, var20.field2134 & 65535));
                  } else if (var20.field2130 == -1) {
                     arg9.method4237(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)(var20.field2133 & 65535), (float)(var20.field2134 & 65535), (float)(var20.field2132 & 65535));
                     arg9.method4237(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var20.field2131 & 65535), (float)(var20.field2132 & 65535), (float)(var20.field2134 & 65535));
                  } else {
                     int var22 = var20.field2130;
                     arg9.method4237(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                     arg9.method4237(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                  }
               } else if (this.field9926[var18][var19] != null) {
                  class83 var23 = this.field9926[var18][var19];

                  for(int var24 = 0; var24 < var23.field606; ++var24) {
                     arg10[var24] = (float)(var23.field608[var24] * var14 / this.field9460 + var16);
                     arg11[var24] = (float)(var17 - var23.field615[var24] * var14 / this.field9460);
                  }

                  for(int var25 = 0; var25 < var23.field610; ++var25) {
                     short var26 = var23.field612[var25];
                     short var27 = var23.field613[var25];
                     short var28 = var23.field614[var25];
                     float var29 = arg10[var26];
                     float var30 = arg10[var27];
                     float var31 = arg10[var28];
                     float var32 = arg11[var26];
                     float var33 = arg11[var27];
                     float var34 = arg11[var28];
                     if (var23.field618 != null && var23.field618[var25] != -1) {
                        int var35 = var23.field618[var25];
                        arg9.method4237(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float)Statics.method4415(var35, var23.field605[var26]), (float)Statics.method4415(var35, var23.field605[var27]), (float)Statics.method4415(var35, var23.field605[var28]));
                     } else if (var23.field617 != null && var23.field617[var25] != -1) {
                        int var36 = this.field9933.method16833(var23.field617[var25]);
                        arg9.method4237(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float)Statics.method4415(var36, var23.field605[var26]), (float)Statics.method4415(var36, var23.field605[var27]), (float)Statics.method4415(var36, var23.field605[var28]));
                     } else {
                        int var37 = var23.field611[var25];
                        arg9.method4237(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float)Statics.method4415(var37, var23.field605[var26]), (float)Statics.method4415(var37, var23.field605[var27]), (float)Statics.method4415(var37, var23.field605[var28]));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field2229 = true;
      this.field9933.method7551(var15);
   }

   @deob.ObfuscatedName("yq.ar(IIIIIII[[ZLaq;Lbs;[F[F)V")
   private void method16287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class321 arg8, class350 arg9, float[] arg10, float[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field2011;
      this.field9933.method7551(false);
      arg9.field2229 = false;
      arg9.field2212 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field9927 != null) {
                  if (this.field9927[var18][var19] != null) {
                     class56 var20 = this.field9927[var18][var19];
                     if (var20.field409 != -1 && (var20.field408 & 2) == 0 && var20.field417 == 0) {
                        int var21 = this.field9933.method16833(var20.field409);
                        arg9.method4237(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)Statics.method4415(var21, var20.field410), (float)Statics.method4415(var21, var20.field411), (float)Statics.method4415(var21, var20.field416));
                        arg9.method4237(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)Statics.method4415(var21, var20.field415), (float)Statics.method4415(var21, var20.field416), (float)Statics.method4415(var21, var20.field411));
                     } else if (var20.field417 == 0) {
                        arg9.method4226(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, var20.field410, var20.field411, var20.field416);
                        arg9.method4226(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, var20.field415, var20.field416, var20.field411);
                     } else {
                        int var22 = var20.field417;
                        arg9.method4226(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, class789.method8925(var22, var20.field410 & -16777216), class789.method8925(var22, var20.field411 & -16777216), class789.method8925(var22, var20.field416 & -16777216));
                        arg9.method4226(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, class789.method8925(var22, var20.field415 & -16777216), class789.method8925(var22, var20.field416 & -16777216), class789.method8925(var22, var20.field411 & -16777216));
                     }
                  } else if (this.field9928[var18][var19] != null) {
                     class329 var23 = this.field9928[var18][var19];

                     for(int var24 = 0; var24 < var23.field2089; ++var24) {
                        arg10[var24] = (float)(var23.field2091[var24] * var14 / this.field9460 + var16);
                        arg11[var24] = (float)(var17 - var23.field2095[var24] * var14 / this.field9460);
                     }

                     for(int var25 = 0; var25 < var23.field2088; ++var25) {
                        int var26 = var25 * 3;
                        int var27 = var26 + 1;
                        int var28 = var27 + 1;
                        float var29 = arg10[var26];
                        float var30 = arg10[var27];
                        float var31 = arg10[var28];
                        float var32 = arg11[var26];
                        float var33 = arg11[var27];
                        float var34 = arg11[var28];
                        if (var23.field2098 != null && var23.field2098[var25] != 0 && (var23.field2096 == null || var23.field2096 != null && var23.field2096[var25] == -1)) {
                           int var35 = var23.field2098[var25];
                           arg9.method4226(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, class789.method8925(var35, -16777216 - (var23.field2094[var26] & -16777216)), class789.method8925(var35, -16777216 - (var23.field2094[var27] & -16777216)), class789.method8925(var35, -16777216 - (var23.field2094[var28] & -16777216)));
                        } else if (var23.field2096 != null && var23.field2096[var25] != -1) {
                           int var36 = this.field9933.method16833(var23.field2096[var25]);
                           arg9.method4237(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float)var36, (float)var36, (float)var36);
                        } else {
                           arg9.method4226(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, var23.field2094[var26], var23.field2094[var27], var23.field2094[var28]);
                        }
                     }
                  }
               } else if (this.field9929[var18][var19] != null) {
                  class347 var37 = this.field9929[var18][var19];

                  for(int var38 = 0; var38 < var37.field2191; ++var38) {
                     arg10[var38] = (float)(var37.field2192[var38] * var14 / this.field9460 + var16);
                     arg11[var38] = (float)(var17 - var37.field2194[var38] * var14 / this.field9460);
                  }

                  for(int var39 = 0; var39 < var37.field2197; ++var39) {
                     int var40 = var39 * 3;
                     int var41 = var40 + 1;
                     int var42 = var41 + 1;
                     float var43 = arg10[var40];
                     float var44 = arg10[var41];
                     float var45 = arg10[var42];
                     float var46 = arg11[var40];
                     float var47 = arg11[var41];
                     float var48 = arg11[var42];
                     if (var37.field2200 != null && var37.field2200[var39] != 0) {
                        int var49 = var37.field2200[var39];
                        arg9.method4226(true, true, false, var46, var47, var48, var43, var44, var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                     } else {
                        arg9.method4226(true, true, false, var46, var47, var48, var43, var44, var45, 100.0F, 100.0F, 100.0F, var37.field2190[var40], var37.field2190[var41], var37.field2190[var42]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field2229 = true;
      this.field9933.method7551(var15);
   }

   @deob.ObfuscatedName("yq.w(IILna;)Lna;")
   public class664 method7253(int arg0, int arg1, class664 arg2) {
      return null;
   }

   @deob.ObfuscatedName("yq.UA(Lna;IIIIZ)V")
   public void method7251(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @deob.ObfuscatedName("yq.o(Lna;IIIIZ)Z")
   public boolean method7278(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return false;
   }

   @deob.ObfuscatedName("yq.NA(Lna;IIIIZ)V")
   public void method7255(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @deob.ObfuscatedName("yq.a(Lacy;[I)V")
   public void method7257(class81 arg0, int[] arg1) {
   }
}
