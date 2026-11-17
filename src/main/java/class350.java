@deob.ObfuscatedName("bs")
public class class350 {
   @deob.ObfuscatedName("bs.n")
   private boolean field2233 = false;
   @deob.ObfuscatedName("bs.k")
   public boolean field2229 = true;
   @deob.ObfuscatedName("bs.d")
   public boolean field2212 = false;
   @deob.ObfuscatedName("bs.b")
   public int field2213 = 0;
   @deob.ObfuscatedName("bs.r")
   public boolean field2238 = false;
   @deob.ObfuscatedName("bs.p")
   private boolean field2230 = false;
   @deob.ObfuscatedName("bs.o")
   public int[] field2216 = new int[4096];
   @deob.ObfuscatedName("bs.u")
   public float field2221 = 0.0F;
   @deob.ObfuscatedName("bs.v")
   public float field2215 = 1.0F;
   @deob.ObfuscatedName("bs.w")
   private int field2231 = -1;
   @deob.ObfuscatedName("bs.q")
   private int[] field2232 = null;
   @deob.ObfuscatedName("bs.y")
   private int field2227 = 0;
   @deob.ObfuscatedName("bs.j")
   private int field2234 = 0;
   @deob.ObfuscatedName("bs.f")
   private float field2235 = 0.0F;
   @deob.ObfuscatedName("bs.ap")
   private boolean field2237 = true;
   @deob.ObfuscatedName("bs.av")
   private int field2240 = -1;
   @deob.ObfuscatedName("bs.ax")
   private int[] field2239 = null;
   @deob.ObfuscatedName("bs.af")
   private int field2241 = 0;
   @deob.ObfuscatedName("bs.at")
   private int field2222 = 0;
   @deob.ObfuscatedName("bs.ah")
   private float field2242 = 0.0F;
   @deob.ObfuscatedName("bs.aw")
   private int field2223 = -1;
   @deob.ObfuscatedName("bs.al")
   private int[] field2244 = null;
   @deob.ObfuscatedName("bs.an")
   private int field2245 = 0;
   @deob.ObfuscatedName("bs.ag")
   private int field2246 = 0;
   @deob.ObfuscatedName("bs.ak")
   private float field2247 = 0.0F;
   @deob.ObfuscatedName("bs.e")
   private class984 field2211;
   @deob.ObfuscatedName("bs.z")
   private class321 field2218;
   @deob.ObfuscatedName("bs.m")
   private int field2219;
   @deob.ObfuscatedName("bs.i")
   private int[] field2228;
   @deob.ObfuscatedName("bs.t")
   private float[] field2220;
   @deob.ObfuscatedName("bs.ai")
   private class725 field2236;
   @deob.ObfuscatedName("bs.l")
   public float field2210;
   @deob.ObfuscatedName("bs.x")
   public float field2214;
   @deob.ObfuscatedName("bs.a")
   public float field2217;
   @deob.ObfuscatedName("bs.s")
   public float field2226;
   @deob.ObfuscatedName("bs.h")
   public int field2224;
   @deob.ObfuscatedName("bs.g")
   public int field2225;
   @deob.ObfuscatedName("bs.c")
   private int field2243;

   public class350(class984 arg0, class321 arg1) {
      this.field2211 = arg0;
      this.field2218 = arg1;
      this.field2219 = this.field2211.field10407;
      this.field2228 = this.field2211.field10406;
      this.field2220 = this.field2211.field10414;
      this.field2236 = class725.field6686;
   }

   @deob.ObfuscatedName("bs.n()I")
   public int method4221() {
      return this.field2216[0] % this.field2219;
   }

   @deob.ObfuscatedName("bs.k()I")
   public int method4222() {
      return this.field2216[0] / this.field2219;
   }

   @deob.ObfuscatedName("bs.d(Z)V")
   public final void method4223(boolean arg0) {
      this.field2233 = arg0;
   }

   @deob.ObfuscatedName("bs.b(ZZZFFFFFFFFFFFF)V")
   public final void method4237(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14) {
      if (!arg0) {
         this.method4220(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
      } else if (this.field2233) {
         this.field2211.method11529((int)arg6, (int)arg3, (int)arg7, (int)arg4, Statics.field7263[(int)arg12 & 65535]);
         this.field2211.method11529((int)arg7, (int)arg4, (int)arg8, (int)arg5, Statics.field7263[(int)arg12 & 65535]);
         this.field2211.method11529((int)arg8, (int)arg5, (int)arg6, (int)arg3, Statics.field7263[(int)arg12 & 65535]);
      } else {
         float var16 = arg7 - arg6;
         float var17 = arg4 - arg3;
         float var18 = arg8 - arg6;
         float var19 = arg5 - arg3;
         float var20 = arg13 - arg12;
         float var21 = arg14 - arg12;
         float var22 = arg10 - arg9;
         float var23 = arg11 - arg9;
         float var24;
         if (arg4 != arg5) {
            var24 = (arg8 - arg7) / (arg5 - arg4);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if (arg3 != arg4) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if (arg3 != arg5) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var17 * var18;
         if (var27 != 0.0F) {
            float var28 = (var19 * var20 - var17 * var21) / var27;
            float var29 = (var16 * var21 - var18 * var20) / var27;
            float var30 = (var19 * var22 - var17 * var23) / var27;
            float var31 = (var16 * var23 - var18 * var22) / var27;
            if (arg3 <= arg4 && arg3 <= arg5) {
               if (!(arg3 >= (float)this.field2224)) {
                  if (arg4 > (float)this.field2224) {
                     arg4 = (float)this.field2224;
                  }

                  if (arg5 > (float)this.field2224) {
                     arg5 = (float)this.field2224;
                  }

                  float var32 = arg12 - arg6 * var28 + var28;
                  float var33 = arg9 - arg6 * var30 + var30;
                  if (arg4 < arg5) {
                     float var34 = arg6;
                     if (arg3 < 0.0F) {
                        var34 = arg6 - arg3 * var26;
                        arg6 -= arg3 * var25;
                        var32 -= arg3 * var29;
                        var33 -= arg3 * var31;
                        arg3 = 0.0F;
                     }

                     if (arg4 < 0.0F) {
                        arg7 -= arg4 * var24;
                        arg4 = 0.0F;
                     }

                     if (arg3 != arg4 && var26 < var25 || arg3 == arg4 && var26 > var24) {
                        float var35 = (float)((int)(arg3 + 0.5F));
                        float var36 = (float)((int)(arg4 + 0.5F));
                        float var37 = (float)((int)(arg5 + 0.5F)) - var36;
                        float var38 = var36 - var35;
                        float var39 = (float)this.field2216[(int)var35];

                        while(--var38 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var39, 0, 0, (int)var34, (int)arg6, var32, var28, var33, var30);
                           var34 += var26;
                           arg6 += var25;
                           var32 += var29;
                           var33 += var31;
                           var39 += (float)this.field2219;
                        }

                        while(--var37 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var39, 0, 0, (int)var34, (int)arg7, var32, var28, var33, var30);
                           var34 += var26;
                           arg7 += var24;
                           var32 += var29;
                           var33 += var31;
                           var39 += (float)this.field2219;
                        }

                     } else {
                        float var40 = (float)((int)(arg3 + 0.5F));
                        float var41 = (float)((int)(arg4 + 0.5F));
                        float var42 = (float)((int)(arg5 + 0.5F)) - var41;
                        float var43 = var41 - var40;
                        float var44 = (float)this.field2216[(int)var40];

                        while(--var43 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var44, 0, 0, (int)arg6, (int)var34, var32, var28, var33, var30);
                           var34 += var26;
                           arg6 += var25;
                           var32 += var29;
                           var33 += var31;
                           var44 += (float)this.field2219;
                        }

                        while(--var42 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var44, 0, 0, (int)arg7, (int)var34, var32, var28, var33, var30);
                           var34 += var26;
                           arg7 += var24;
                           var32 += var29;
                           var33 += var31;
                           var44 += (float)this.field2219;
                        }

                     }
                  } else {
                     float var45 = arg6;
                     if (arg3 < 0.0F) {
                        var45 = arg6 - arg3 * var26;
                        arg6 -= arg3 * var25;
                        var32 -= arg3 * var29;
                        var33 -= arg3 * var31;
                        arg3 = 0.0F;
                     }

                     if (arg5 < 0.0F) {
                        arg8 -= arg5 * var24;
                        arg5 = 0.0F;
                     }

                     if (arg3 != arg5 && var26 < var25 || arg3 == arg5 && var24 > var25) {
                        float var46 = (float)((int)(arg3 + 0.5F));
                        float var47 = (float)((int)(arg5 + 0.5F));
                        float var48 = (float)((int)(arg4 + 0.5F)) - var47;
                        float var49 = var47 - var46;
                        float var50 = (float)this.field2216[(int)var46];

                        while(--var49 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var50, 0, 0, (int)var45, (int)arg6, var32, var28, var33, var30);
                           var45 += var26;
                           arg6 += var25;
                           var32 += var29;
                           var33 += var31;
                           var50 += (float)this.field2219;
                        }

                        while(--var48 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var50, 0, 0, (int)arg8, (int)arg6, var32, var28, var33, var30);
                           arg8 += var24;
                           arg6 += var25;
                           var32 += var29;
                           var33 += var31;
                           var50 += (float)this.field2219;
                        }

                     } else {
                        float var51 = (float)((int)(arg3 + 0.5F));
                        float var52 = (float)((int)(arg5 + 0.5F));
                        float var53 = (float)((int)(arg4 + 0.5F)) - var52;
                        float var54 = var52 - var51;
                        float var55 = (float)this.field2216[(int)var51];

                        while(--var54 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var55, 0, 0, (int)arg6, (int)var45, var32, var28, var33, var30);
                           var45 += var26;
                           arg6 += var25;
                           var32 += var29;
                           var33 += var31;
                           var55 += (float)this.field2219;
                        }

                        while(--var53 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var55, 0, 0, (int)arg6, (int)arg8, var32, var28, var33, var30);
                           arg8 += var24;
                           arg6 += var25;
                           var32 += var29;
                           var33 += var31;
                           var55 += (float)this.field2219;
                        }

                     }
                  }
               }
            } else if (arg4 <= arg5) {
               if (!(arg4 >= (float)this.field2224)) {
                  if (arg5 > (float)this.field2224) {
                     arg5 = (float)this.field2224;
                  }

                  if (arg3 > (float)this.field2224) {
                     arg3 = (float)this.field2224;
                  }

                  float var56 = arg13 - arg7 * var28 + var28;
                  float var57 = arg10 - arg7 * var30 + var30;
                  if (arg5 < arg3) {
                     float var58 = arg7;
                     if (arg4 < 0.0F) {
                        var58 = arg7 - arg4 * var25;
                        arg7 -= arg4 * var24;
                        var56 -= arg4 * var29;
                        var57 -= arg4 * var31;
                        arg4 = 0.0F;
                     }

                     if (arg5 < 0.0F) {
                        arg8 -= arg5 * var26;
                        arg5 = 0.0F;
                     }

                     if (arg4 != arg5 && var25 < var24 || arg4 == arg5 && var25 > var26) {
                        float var59 = (float)((int)(arg4 + 0.5F));
                        float var60 = (float)((int)(arg5 + 0.5F));
                        float var61 = (float)((int)(arg3 + 0.5F)) - var60;
                        float var62 = var60 - var59;
                        float var63 = (float)this.field2216[(int)var59];

                        while(--var62 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var63, 0, 0, (int)var58, (int)arg7, var56, var28, var57, var30);
                           var58 += var25;
                           arg7 += var24;
                           var56 += var29;
                           var57 += var31;
                           var63 += (float)this.field2219;
                        }

                        while(--var61 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var63, 0, 0, (int)var58, (int)arg8, var56, var28, var57, var30);
                           var58 += var25;
                           arg8 += var26;
                           var56 += var29;
                           var57 += var31;
                           var63 += (float)this.field2219;
                        }

                     } else {
                        float var64 = (float)((int)(arg4 + 0.5F));
                        float var65 = (float)((int)(arg5 + 0.5F));
                        float var66 = (float)((int)(arg3 + 0.5F)) - var65;
                        float var67 = var65 - var64;
                        float var68 = (float)this.field2216[(int)var64];

                        while(--var67 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var68, 0, 0, (int)arg7, (int)var58, var56, var28, var57, var30);
                           var58 += var25;
                           arg7 += var24;
                           var56 += var29;
                           var57 += var31;
                           var68 += (float)this.field2219;
                        }

                        while(--var66 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var68, 0, 0, (int)arg8, (int)var58, var56, var28, var57, var30);
                           var58 += var25;
                           arg8 += var26;
                           var56 += var29;
                           var57 += var31;
                           var68 += (float)this.field2219;
                        }

                     }
                  } else {
                     float var69 = arg7;
                     if (arg4 < 0.0F) {
                        var69 = arg7 - arg4 * var25;
                        arg7 -= arg4 * var24;
                        var56 -= arg4 * var29;
                        var57 -= arg4 * var31;
                        arg4 = 0.0F;
                     }

                     if (arg3 < 0.0F) {
                        arg6 -= arg3 * var26;
                        arg3 = 0.0F;
                     }

                     if (var25 < var24) {
                        float var70 = (float)((int)(arg4 + 0.5F));
                        float var71 = (float)((int)(arg3 + 0.5F));
                        float var72 = (float)((int)(arg5 + 0.5F)) - var71;
                        float var73 = var71 - var70;
                        float var74 = (float)this.field2216[(int)var70];

                        while(--var73 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var74, 0, 0, (int)var69, (int)arg7, var56, var28, var57, var30);
                           var69 += var25;
                           arg7 += var24;
                           var56 += var29;
                           var57 += var31;
                           var74 += (float)this.field2219;
                        }

                        while(--var72 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var74, 0, 0, (int)arg6, (int)arg7, var56, var28, var57, var30);
                           arg6 += var26;
                           arg7 += var24;
                           var56 += var29;
                           var57 += var31;
                           var74 += (float)this.field2219;
                        }

                     } else {
                        float var75 = (float)((int)(arg4 + 0.5F));
                        float var76 = (float)((int)(arg3 + 0.5F));
                        float var77 = (float)((int)(arg5 + 0.5F)) - var76;
                        float var78 = var76 - var75;
                        float var79 = (float)this.field2216[(int)var75];

                        while(--var78 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var79, 0, 0, (int)arg7, (int)var69, var56, var28, var57, var30);
                           var69 += var25;
                           arg7 += var24;
                           var56 += var29;
                           var57 += var31;
                           var79 += (float)this.field2219;
                        }

                        while(--var77 >= 0.0F) {
                           this.method4254(arg1, arg2, this.field2228, (int)var79, 0, 0, (int)arg7, (int)arg6, var56, var28, var57, var30);
                           arg6 += var26;
                           arg7 += var24;
                           var56 += var29;
                           var57 += var31;
                           var79 += (float)this.field2219;
                        }

                     }
                  }
               }
            } else if (!(arg5 >= (float)this.field2224)) {
               if (arg3 > (float)this.field2224) {
                  arg3 = (float)this.field2224;
               }

               if (arg4 > (float)this.field2224) {
                  arg4 = (float)this.field2224;
               }

               float var80 = arg14 - arg8 * var28 + var28;
               float var81 = arg11 - arg8 * var30 + var30;
               if (arg3 < arg4) {
                  float var82 = arg8;
                  if (arg5 < 0.0F) {
                     var82 = arg8 - arg5 * var24;
                     arg8 -= arg5 * var26;
                     var80 -= arg5 * var29;
                     var81 -= arg5 * var31;
                     arg5 = 0.0F;
                  }

                  if (arg3 < 0.0F) {
                     arg6 -= arg3 * var25;
                     arg3 = 0.0F;
                  }

                  if (var24 < var26) {
                     float var83 = (float)((int)(arg5 + 0.5F));
                     float var84 = (float)((int)(arg3 + 0.5F));
                     float var85 = (float)((int)(arg4 + 0.5F)) - var84;
                     float var86 = var84 - var83;
                     float var87 = (float)this.field2216[(int)var83];

                     while(--var86 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var87, 0, 0, (int)var82, (int)arg8, var80, var28, var81, var30);
                        var82 += var24;
                        arg8 += var26;
                        var80 += var29;
                        var81 += var31;
                        var87 += (float)this.field2219;
                     }

                     while(--var85 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var87, 0, 0, (int)var82, (int)arg6, var80, var28, var81, var30);
                        var82 += var24;
                        arg6 += var25;
                        var80 += var29;
                        var81 += var31;
                        var87 += (float)this.field2219;
                     }

                  } else {
                     float var88 = (float)((int)(arg5 + 0.5F));
                     float var89 = (float)((int)(arg3 + 0.5F));
                     float var90 = (float)((int)(arg4 + 0.5F)) - var89;
                     float var91 = var89 - var88;
                     float var92 = (float)this.field2216[(int)var88];

                     while(--var91 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var92, 0, 0, (int)arg8, (int)var82, var80, var28, var81, var30);
                        var82 += var24;
                        arg8 += var26;
                        var80 += var29;
                        var81 += var31;
                        var92 += (float)this.field2219;
                     }

                     while(--var90 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var92, 0, 0, (int)arg6, (int)var82, var80, var28, var81, var30);
                        var82 += var24;
                        arg6 += var25;
                        var80 += var29;
                        var81 += var31;
                        var92 += (float)this.field2219;
                     }

                  }
               } else {
                  float var93 = arg8;
                  if (arg5 < 0.0F) {
                     var93 = arg8 - arg5 * var24;
                     arg8 -= arg5 * var26;
                     var80 -= arg5 * var29;
                     var81 -= arg5 * var31;
                     arg5 = 0.0F;
                  }

                  if (arg4 < 0.0F) {
                     arg7 -= arg4 * var25;
                     arg4 = 0.0F;
                  }

                  if (var24 < var26) {
                     float var94 = (float)((int)(arg5 + 0.5F));
                     float var95 = (float)((int)(arg4 + 0.5F));
                     float var96 = (float)((int)(arg3 + 0.5F)) - var95;
                     float var97 = var95 - var94;
                     float var98 = (float)this.field2216[(int)var94];

                     while(--var97 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var98, 0, 0, (int)var93, (int)arg8, var80, var28, var81, var30);
                        var93 += var24;
                        arg8 += var26;
                        var80 += var29;
                        var81 += var31;
                        var98 += (float)this.field2219;
                     }

                     while(--var96 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var98, 0, 0, (int)arg7, (int)arg8, var80, var28, var81, var30);
                        arg7 += var25;
                        arg8 += var26;
                        var80 += var29;
                        var81 += var31;
                        var98 += (float)this.field2219;
                     }

                  } else {
                     float var99 = (float)((int)(arg5 + 0.5F));
                     float var100 = (float)((int)(arg4 + 0.5F));
                     float var101 = (float)((int)(arg3 + 0.5F)) - var100;
                     float var102 = var100 - var99;
                     float var103 = (float)this.field2216[(int)var99];

                     while(--var102 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var103, 0, 0, (int)arg8, (int)var93, var80, var28, var81, var30);
                        var93 += var24;
                        arg8 += var26;
                        var80 += var29;
                        var81 += var31;
                        var103 += (float)this.field2219;
                     }

                     while(--var101 >= 0.0F) {
                        this.method4254(arg1, arg2, this.field2228, (int)var103, 0, 0, (int)arg8, (int)arg7, var80, var28, var81, var30);
                        arg7 += var25;
                        arg8 += var26;
                        var80 += var29;
                        var81 += var31;
                        var103 += (float)this.field2219;
                     }

                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("bs.r(ZZ[IIIIIIFFFF)V")
   private final void method4254(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, float arg11) {
      if (this.field2238) {
         if (arg7 > this.field2225 * 824681839) {
            arg7 = this.field2225 * 824681839;
         }

         if (arg6 < 0) {
            arg6 = 0;
         }
      }

      if (arg6 < arg7) {
         int var13 = arg6 - 1 + arg3;
         float var14 = (float)arg6 * arg9 + arg8;
         float var15 = (float)arg6 * arg11 + arg10;
         if (this.field2218.field2011) {
            if (this.field2229) {
               int var16 = arg7 - arg6 >> 2;
               float var17 = arg9 * 4.0F;
               if (this.field2213 == 0) {
                  if (var16 > 0) {
                     do {
                        int var18 = Statics.field7263[(int)var14 & 65535];
                        var14 += var17;
                        ++var13;
                        if (!arg0 || var15 < this.field2220[var13]) {
                           arg2[var13] = var18;
                           if (arg0) {
                              this.field2220[var13] = var15;
                           }
                        }

                        float var19 = arg11 + var15;
                        ++var13;
                        if (!arg0 || var19 < this.field2220[var13]) {
                           arg2[var13] = var18;
                           if (arg0) {
                              this.field2220[var13] = var19;
                           }
                        }

                        float var20 = arg11 + var19;
                        ++var13;
                        if (!arg0 || var20 < this.field2220[var13]) {
                           arg2[var13] = var18;
                           if (arg0) {
                              this.field2220[var13] = var20;
                           }
                        }

                        float var21 = arg11 + var20;
                        ++var13;
                        if (!arg0 || var21 < this.field2220[var13]) {
                           arg2[var13] = var18;
                           if (arg0) {
                              this.field2220[var13] = var21;
                           }
                        }

                        var15 = arg11 + var21;
                        --var16;
                     } while(var16 > 0);
                  }

                  int var22 = arg7 - arg6 & 3;
                  if (var22 > 0) {
                     int var23 = Statics.field7263[(int)var14 & 65535];

                     do {
                        ++var13;
                        if (!arg0 || var15 < this.field2220[var13]) {
                           arg2[var13] = var23;
                           if (arg0) {
                              this.field2220[var13] = var15;
                           }
                        }

                        var15 += arg11;
                        --var22;
                     } while(var22 > 0);
                  }
               } else {
                  int var24 = this.field2213;
                  int var25 = 256 - this.field2213;
                  if (var16 > 0) {
                     do {
                        int var26 = Statics.field7263[(int)var14 & 65535];
                        var14 += var17;
                        int var27 = ((var26 & 16711935) * var25 >> 8 & 16711935) + ((var26 & 65280) * var25 >> 8 & 65280);
                        ++var13;
                        if (!arg0 || var15 < this.field2220[var13]) {
                           int var28 = arg2[var13];
                           if (arg1) {
                              arg2[var13] = (var25 | var28 >> 24) << 24 | ((var28 & 65280) * var24 >> 8 & 65280) + ((var28 & 16711935) * var24 >> 8 & 16711935) + var27;
                           } else {
                              arg2[var13] = ((var28 & 65280) * var24 >> 8 & 65280) + ((var28 & 16711935) * var24 >> 8 & 16711935) + var27;
                           }

                           if (arg0) {
                              this.field2220[var13] = var15;
                           }
                        }

                        float var29 = arg11 + var15;
                        ++var13;
                        if (!arg0 || var29 < this.field2220[var13]) {
                           int var30 = arg2[var13];
                           if (arg1) {
                              arg2[var13] = (var25 | var30 >> 24) << 24 | ((var30 & 65280) * var24 >> 8 & 65280) + ((var30 & 16711935) * var24 >> 8 & 16711935) + var27;
                           } else {
                              arg2[var13] = ((var30 & 65280) * var24 >> 8 & 65280) + ((var30 & 16711935) * var24 >> 8 & 16711935) + var27;
                           }

                           if (arg0) {
                              this.field2220[var13] = var29;
                           }
                        }

                        float var31 = arg11 + var29;
                        ++var13;
                        if (!arg0 || var31 < this.field2220[var13]) {
                           int var32 = arg2[var13];
                           if (arg1) {
                              arg2[var13] = (var25 | var32 >> 24) << 24 | ((var32 & 65280) * var24 >> 8 & 65280) + ((var32 & 16711935) * var24 >> 8 & 16711935) + var27;
                           } else {
                              arg2[var13] = ((var32 & 65280) * var24 >> 8 & 65280) + ((var32 & 16711935) * var24 >> 8 & 16711935) + var27;
                           }

                           if (arg0) {
                              this.field2220[var13] = var31;
                           }
                        }

                        float var33 = arg11 + var31;
                        ++var13;
                        if (!arg0 || var33 < this.field2220[var13]) {
                           int var34 = arg2[var13];
                           if (arg1) {
                              arg2[var13] = (var25 | var34 >> 24) << 24 | ((var34 & 65280) * var24 >> 8 & 65280) + ((var34 & 16711935) * var24 >> 8 & 16711935) + var27;
                           } else {
                              arg2[var13] = ((var34 & 65280) * var24 >> 8 & 65280) + ((var34 & 16711935) * var24 >> 8 & 16711935) + var27;
                           }

                           if (arg0) {
                              this.field2220[var13] = var33;
                           }
                        }

                        var15 = arg11 + var33;
                        --var16;
                     } while(var16 > 0);
                  }

                  int var35 = arg7 - arg6 & 3;
                  if (var35 > 0) {
                     int var36 = Statics.field7263[(int)var14 & 65535];
                     int var37 = ((var36 & 16711935) * var25 >> 8 & 16711935) + ((var36 & 65280) * var25 >> 8 & 65280);

                     do {
                        ++var13;
                        if (!arg0 || var15 < this.field2220[var13]) {
                           int var38 = arg2[var13];
                           if (arg1) {
                              arg2[var13] = (var25 | var38 >> 24) << 24 | ((var38 & 65280) * var24 >> 8 & 65280) + ((var38 & 16711935) * var24 >> 8 & 16711935) + var37;
                           } else {
                              arg2[var13] = ((var38 & 65280) * var24 >> 8 & 65280) + ((var38 & 16711935) * var24 >> 8 & 16711935) + var37;
                           }

                           if (arg0) {
                              this.field2220[var13] = var15;
                           }
                        }

                        var15 += arg11;
                        --var35;
                     } while(var35 > 0);
                  }
               }
            } else {
               int var39 = arg7 - arg6;
               if (this.field2213 != 0) {
                  int var40 = this.field2213;
                  int var41 = 256 - this.field2213;

                  do {
                     ++var13;
                     if (!arg0 || var15 < this.field2220[var13]) {
                        int var42 = Statics.field7263[(int)var14 & 65535];
                        int var43 = ((var42 & 16711935) * var41 >> 8 & 16711935) + ((var42 & 65280) * var41 >> 8 & 65280);
                        int var44 = arg2[var13];
                        if (arg1) {
                           arg2[var13] = (var41 | var44 >> 24) << 24 | ((var44 & 65280) * var40 >> 8 & 65280) + ((var44 & 16711935) * var40 >> 8 & 16711935) + var43;
                        } else {
                           arg2[var13] = ((var44 & 65280) * var40 >> 8 & 65280) + ((var44 & 16711935) * var40 >> 8 & 16711935) + var43;
                        }

                        if (arg0) {
                           this.field2220[var13] = var15;
                        }
                     }

                     var14 += arg9;
                     var15 += arg11;
                     --var39;
                  } while(var39 > 0);
               } else {
                  do {
                     ++var13;
                     if (!arg0 || var15 < this.field2220[var13]) {
                        arg2[var13] = Statics.field7263[(int)var14 & 65535];
                        if (arg0) {
                           this.field2220[var13] = var15;
                        }
                     }

                     var15 += arg11;
                     var14 += arg9;
                     --var39;
                  } while(var39 > 0);
               }
            }
         } else if (this.field2229) {
            int var45 = arg7 - arg6 >> 2;
            float var46 = arg9 * 4.0F;
            if (this.field2213 == 0) {
               if (var45 > 0) {
                  do {
                     int var47 = Statics.field7263[(int)var14 & 65535];
                     var14 += var46;
                     ++var13;
                     if (!arg0 || var15 < this.field2220[var13]) {
                        arg2[var13] = var47;
                     }

                     float var48 = arg11 + var15;
                     ++var13;
                     if (!arg0 || var48 < this.field2220[var13]) {
                        arg2[var13] = var47;
                     }

                     float var49 = arg11 + var48;
                     ++var13;
                     if (!arg0 || var49 < this.field2220[var13]) {
                        arg2[var13] = var47;
                     }

                     float var50 = arg11 + var49;
                     ++var13;
                     if (!arg0 || var50 < this.field2220[var13]) {
                        arg2[var13] = var47;
                     }

                     var15 = arg11 + var50;
                     --var45;
                  } while(var45 > 0);
               }

               int var51 = arg7 - arg6 & 3;
               if (var51 > 0) {
                  int var52 = Statics.field7263[(int)var14 & 65535];

                  do {
                     ++var13;
                     if (!arg0 || var15 < this.field2220[var13]) {
                        arg2[var13] = var52;
                     }

                     var15 += arg11;
                     --var51;
                  } while(var51 > 0);
               }
            } else {
               int var53 = this.field2213;
               int var54 = 256 - this.field2213;
               if (var45 > 0) {
                  do {
                     int var55 = Statics.field7263[(int)var14 & 65535];
                     var14 += var46;
                     int var56 = ((var55 & 16711935) * var54 >> 8 & 16711935) + ((var55 & 65280) * var54 >> 8 & 65280);
                     ++var13;
                     if (!arg0 || var15 < this.field2220[var13]) {
                        int var57 = arg2[var13];
                        if (arg1) {
                           arg2[var13] = (var54 | var57 >> 24) << 24 | ((var57 & 65280) * var53 >> 8 & 65280) + ((var57 & 16711935) * var53 >> 8 & 16711935) + var56;
                        } else {
                           arg2[var13] = ((var57 & 65280) * var53 >> 8 & 65280) + ((var57 & 16711935) * var53 >> 8 & 16711935) + var56;
                        }
                     }

                     float var58 = arg11 + var15;
                     ++var13;
                     if (!arg0 || var58 < this.field2220[var13]) {
                        int var59 = arg2[var13];
                        if (arg1) {
                           arg2[var13] = (var54 | var59 >> 24) << 24 | ((var59 & 65280) * var53 >> 8 & 65280) + ((var59 & 16711935) * var53 >> 8 & 16711935) + var56;
                        } else {
                           arg2[var13] = ((var59 & 65280) * var53 >> 8 & 65280) + ((var59 & 16711935) * var53 >> 8 & 16711935) + var56;
                        }
                     }

                     float var60 = arg11 + var58;
                     ++var13;
                     if (!arg0 || var60 < this.field2220[var13]) {
                        int var61 = arg2[var13];
                        if (arg1) {
                           arg2[var13] = (var54 | var61 >> 24) << 24 | ((var61 & 65280) * var53 >> 8 & 65280) + ((var61 & 16711935) * var53 >> 8 & 16711935) + var56;
                        } else {
                           arg2[var13] = ((var61 & 65280) * var53 >> 8 & 65280) + ((var61 & 16711935) * var53 >> 8 & 16711935) + var56;
                        }
                     }

                     float var62 = arg11 + var60;
                     ++var13;
                     if (!arg0 || var62 < this.field2220[var13]) {
                        int var63 = arg2[var13];
                        if (arg1) {
                           arg2[var13] = (var54 | var63 >> 24) << 24 | ((var63 & 65280) * var53 >> 8 & 65280) + ((var63 & 16711935) * var53 >> 8 & 16711935) + var56;
                        } else {
                           arg2[var13] = ((var63 & 65280) * var53 >> 8 & 65280) + ((var63 & 16711935) * var53 >> 8 & 16711935) + var56;
                        }
                     }

                     var15 = arg11 + var62;
                     --var45;
                  } while(var45 > 0);
               }

               int var64 = arg7 - arg6 & 3;
               if (var64 > 0) {
                  int var65 = Statics.field7263[(int)var14 & 65535];
                  int var66 = ((var65 & 16711935) * var54 >> 8 & 16711935) + ((var65 & 65280) * var54 >> 8 & 65280);

                  do {
                     ++var13;
                     if (!arg0 || var15 < this.field2220[var13]) {
                        int var67 = arg2[var13];
                        if (arg1) {
                           arg2[var13] = (var54 | var67 >> 24) << 24 | ((var67 & 65280) * var53 >> 8 & 65280) + ((var67 & 16711935) * var53 >> 8 & 16711935) + var66;
                        } else {
                           arg2[var13] = ((var67 & 65280) * var53 >> 8 & 65280) + ((var67 & 16711935) * var53 >> 8 & 16711935) + var66;
                        }
                     }

                     var15 += arg11;
                     --var64;
                  } while(var64 > 0);
               }
            }
         } else {
            int var68 = arg7 - arg6;
            if (this.field2213 != 0) {
               int var69 = this.field2213;
               int var70 = 256 - this.field2213;

               do {
                  ++var13;
                  if (!arg0 || var15 < this.field2220[var13]) {
                     int var71 = Statics.field7263[(int)var14 & 65535];
                     int var72 = ((var71 & 16711935) * var70 >> 8 & 16711935) + ((var71 & 65280) * var70 >> 8 & 65280);
                     int var73 = arg2[var13];
                     if (arg1) {
                        arg2[var13] = (var70 | var73 >> 24) << 24 | ((var73 & 65280) * var69 >> 8 & 65280) + ((var73 & 16711935) * var69 >> 8 & 16711935) + var72;
                     } else {
                        arg2[var13] = ((var73 & 65280) * var69 >> 8 & 65280) + ((var73 & 16711935) * var69 >> 8 & 16711935) + var72;
                     }
                  }

                  var14 += arg9;
                  var15 += arg11;
                  --var68;
               } while(var68 > 0);
            } else {
               do {
                  ++var13;
                  if (!arg0 || var15 < this.field2220[var13]) {
                     arg2[var13] = Statics.field7263[(int)var14 & 65535];
                  }

                  var15 += arg11;
                  var14 += arg9;
                  --var68;
               } while(var68 > 0);
            }
         }

      }
   }

   @deob.ObfuscatedName("bs.p(ZZZFFFFFFFFFIII)V")
   public final void method4226(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, int arg12, int arg13, int arg14) {
      if (!arg0) {
         this.method4220(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
      } else if (this.field2233) {
         this.field2211.method11529((int)arg6, (int)arg3, (int)arg7, (int)arg4, -16777216 | arg12);
         this.field2211.method11529((int)arg7, (int)arg4, (int)arg8, (int)arg5, -16777216 | arg12);
         this.field2211.method11529((int)arg8, (int)arg5, (int)arg6, (int)arg3, -16777216 | arg12);
      } else {
         float var16 = arg7 - arg6;
         float var17 = arg4 - arg3;
         float var18 = arg8 - arg6;
         float var19 = arg5 - arg3;
         float var20 = arg10 - arg9;
         float var21 = arg11 - arg9;
         float var22 = (float)((arg13 & 16711680) - (arg12 & 16711680));
         float var23 = (float)((arg14 & 16711680) - (arg12 & 16711680));
         float var24 = (float)((arg13 & 65280) - (arg12 & 65280));
         float var25 = (float)((arg14 & 65280) - (arg12 & 65280));
         float var26 = (float)((arg13 & 255) - (arg12 & 255));
         float var27 = (float)((arg14 & 255) - (arg12 & 255));
         float var28;
         if (arg4 != arg5) {
            var28 = (arg8 - arg7) / (arg5 - arg4);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if (arg3 != arg4) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if (arg3 != arg5) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var17 * var18;
         if (var31 != 0.0F) {
            float var32 = (var19 * var20 - var17 * var21) / var31;
            float var33 = (var16 * var21 - var18 * var20) / var31;
            float var34 = (var19 * var22 - var17 * var23) / var31;
            float var35 = (var16 * var23 - var18 * var22) / var31;
            float var36 = (var19 * var24 - var17 * var25) / var31;
            float var37 = (var16 * var25 - var18 * var24) / var31;
            float var38 = (var19 * var26 - var17 * var27) / var31;
            float var39 = (var16 * var27 - var18 * var26) / var31;
            if (arg3 <= arg4 && arg3 <= arg5) {
               if (!(arg3 >= (float)this.field2224)) {
                  if (arg4 > (float)this.field2224) {
                     arg4 = (float)this.field2224;
                  }

                  if (arg5 > (float)this.field2224) {
                     arg5 = (float)this.field2224;
                  }

                  float var40 = arg9 - arg6 * var32 + var32;
                  float var41 = (float)(arg12 & 16711680) - arg6 * var34 + var34;
                  float var42 = (float)(arg12 & 65280) - arg6 * var36 + var36;
                  float var43 = (float)(arg12 & 255) - arg6 * var38 + var38;
                  if (arg4 < arg5) {
                     float var44 = arg6;
                     if (arg3 < 0.0F) {
                        var44 = arg6 - arg3 * var30;
                        arg6 -= arg3 * var29;
                        var40 -= arg3 * var33;
                        var41 -= arg3 * var35;
                        var42 -= arg3 * var37;
                        var43 -= arg3 * var39;
                        arg3 = 0.0F;
                     }

                     if (arg4 < 0.0F) {
                        arg7 -= arg4 * var28;
                        arg4 = 0.0F;
                     }

                     if (arg3 != arg4 && var30 < var29 || arg3 == arg4 && var30 > var28) {
                        float var45 = (float)((int)(arg3 + 0.5F));
                        float var46 = (float)((int)(arg4 + 0.5F));
                        float var47 = (float)((int)(arg5 + 0.5F)) - var46;
                        float var48 = var46 - var45;
                        float var49 = (float)this.field2216[(int)var45];

                        while(--var48 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var49, 0, 0, (int)var44, (int)arg6, var40, var32, var41, var34, var42, var36, var43, var38);
                           var44 += var30;
                           arg6 += var29;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var49 += (float)this.field2219;
                        }

                        while(--var47 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var49, 0, 0, (int)var44, (int)arg7, var40, var32, var41, var34, var42, var36, var43, var38);
                           var44 += var30;
                           arg7 += var28;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var49 += (float)this.field2219;
                        }

                     } else {
                        float var50 = (float)((int)(arg3 + 0.5F));
                        float var51 = (float)((int)(arg4 + 0.5F));
                        float var52 = (float)((int)(arg5 + 0.5F)) - var51;
                        float var53 = var51 - var50;
                        float var54 = (float)this.field2216[(int)var50];

                        while(--var53 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var54, 0, 0, (int)arg6, (int)var44, var40, var32, var41, var34, var42, var36, var43, var38);
                           var44 += var30;
                           arg6 += var29;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var54 += (float)this.field2219;
                        }

                        while(--var52 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var54, 0, 0, (int)arg7, (int)var44, var40, var32, var41, var34, var42, var36, var43, var38);
                           var44 += var30;
                           arg7 += var28;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var54 += (float)this.field2219;
                        }

                     }
                  } else {
                     float var55 = arg6;
                     if (arg3 < 0.0F) {
                        var55 = arg6 - arg3 * var30;
                        arg6 -= arg3 * var29;
                        var40 -= arg3 * var33;
                        var41 -= arg3 * var35;
                        var42 -= arg3 * var37;
                        var43 -= arg3 * var39;
                        arg3 = 0.0F;
                     }

                     if (arg5 < 0.0F) {
                        arg8 -= arg5 * var28;
                        arg5 = 0.0F;
                     }

                     if (arg3 != arg5 && var30 < var29 || arg3 == arg5 && var28 > var29) {
                        float var56 = (float)((int)(arg3 + 0.5F));
                        float var57 = (float)((int)(arg5 + 0.5F));
                        float var58 = (float)((int)(arg4 + 0.5F)) - var57;
                        float var59 = var57 - var56;
                        float var60 = (float)this.field2216[(int)var56];

                        while(--var59 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var60, 0, 0, (int)var55, (int)arg6, var40, var32, var41, var34, var42, var36, var43, var38);
                           var55 += var30;
                           arg6 += var29;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var60 += (float)this.field2219;
                        }

                        while(--var58 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var60, 0, 0, (int)arg8, (int)arg6, var40, var32, var41, var34, var42, var36, var43, var38);
                           arg8 += var28;
                           arg6 += var29;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var60 += (float)this.field2219;
                        }

                     } else {
                        float var61 = (float)((int)(arg3 + 0.5F));
                        float var62 = (float)((int)(arg5 + 0.5F));
                        float var63 = (float)((int)(arg4 + 0.5F)) - var62;
                        float var64 = var62 - var61;
                        float var65 = (float)this.field2216[(int)var61];

                        while(--var64 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var65, 0, 0, (int)arg6, (int)var55, var40, var32, var41, var34, var42, var36, var43, var38);
                           var55 += var30;
                           arg6 += var29;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var65 += (float)this.field2219;
                        }

                        while(--var63 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var65, 0, 0, (int)arg6, (int)arg8, var40, var32, var41, var34, var42, var36, var43, var38);
                           arg8 += var28;
                           arg6 += var29;
                           var40 += var33;
                           var41 += var35;
                           var42 += var37;
                           var43 += var39;
                           var65 += (float)this.field2219;
                        }

                     }
                  }
               }
            } else if (arg4 <= arg5) {
               if (!(arg4 >= (float)this.field2224)) {
                  if (arg5 > (float)this.field2224) {
                     arg5 = (float)this.field2224;
                  }

                  if (arg3 > (float)this.field2224) {
                     arg3 = (float)this.field2224;
                  }

                  float var66 = arg10 - arg7 * var32 + var32;
                  float var67 = (float)(arg13 & 16711680) - arg7 * var34 + var34;
                  float var68 = (float)(arg13 & 65280) - arg7 * var36 + var36;
                  float var69 = (float)(arg13 & 255) - arg7 * var38 + var38;
                  if (arg5 < arg3) {
                     float var70 = arg7;
                     if (arg4 < 0.0F) {
                        var70 = arg7 - arg4 * var29;
                        arg7 -= arg4 * var28;
                        var66 -= arg4 * var33;
                        var67 -= arg4 * var35;
                        var68 -= arg4 * var37;
                        var69 -= arg4 * var39;
                        arg4 = 0.0F;
                     }

                     if (arg5 < 0.0F) {
                        arg8 -= arg5 * var30;
                        arg5 = 0.0F;
                     }

                     if (arg4 != arg5 && var29 < var28 || arg4 == arg5 && var29 > var30) {
                        float var71 = (float)((int)(arg4 + 0.5F));
                        float var72 = (float)((int)(arg5 + 0.5F));
                        float var73 = (float)((int)(arg3 + 0.5F)) - var72;
                        float var74 = var72 - var71;
                        float var75 = (float)this.field2216[(int)var71];

                        while(--var74 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var75, 0, 0, (int)var70, (int)arg7, var66, var32, var67, var34, var68, var36, var69, var38);
                           var70 += var29;
                           arg7 += var28;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var75 += (float)this.field2219;
                        }

                        while(--var73 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var75, 0, 0, (int)var70, (int)arg8, var66, var32, var67, var34, var68, var36, var69, var38);
                           var70 += var29;
                           arg8 += var30;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var75 += (float)this.field2219;
                        }

                     } else {
                        float var76 = (float)((int)(arg4 + 0.5F));
                        float var77 = (float)((int)(arg5 + 0.5F));
                        float var78 = (float)((int)(arg3 + 0.5F)) - var77;
                        float var79 = var77 - var76;
                        float var80 = (float)this.field2216[(int)var76];

                        while(--var79 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var80, 0, 0, (int)arg7, (int)var70, var66, var32, var67, var34, var68, var36, var69, var38);
                           var70 += var29;
                           arg7 += var28;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var80 += (float)this.field2219;
                        }

                        while(--var78 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var80, 0, 0, (int)arg8, (int)var70, var66, var32, var67, var34, var68, var36, var69, var38);
                           var70 += var29;
                           arg8 += var30;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var80 += (float)this.field2219;
                        }

                     }
                  } else {
                     float var81 = arg7;
                     if (arg4 < 0.0F) {
                        var81 = arg7 - arg4 * var29;
                        arg7 -= arg4 * var28;
                        var66 -= arg4 * var33;
                        var67 -= arg4 * var35;
                        var68 -= arg4 * var37;
                        var69 -= arg4 * var39;
                        arg4 = 0.0F;
                     }

                     if (arg3 < 0.0F) {
                        arg6 -= arg3 * var30;
                        arg3 = 0.0F;
                     }

                     if (var29 < var28) {
                        float var82 = (float)((int)(arg4 + 0.5F));
                        float var83 = (float)((int)(arg3 + 0.5F));
                        float var84 = (float)((int)(arg5 + 0.5F)) - var83;
                        float var85 = var83 - var82;
                        float var86 = (float)this.field2216[(int)var82];

                        while(--var85 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var86, 0, 0, (int)var81, (int)arg7, var66, var32, var67, var34, var68, var36, var69, var38);
                           var81 += var29;
                           arg7 += var28;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var86 += (float)this.field2219;
                        }

                        while(--var84 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var86, 0, 0, (int)arg6, (int)arg7, var66, var32, var67, var34, var68, var36, var69, var38);
                           arg6 += var30;
                           arg7 += var28;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var86 += (float)this.field2219;
                        }

                     } else {
                        float var87 = (float)((int)(arg4 + 0.5F));
                        float var88 = (float)((int)(arg3 + 0.5F));
                        float var89 = (float)((int)(arg5 + 0.5F)) - var88;
                        float var90 = var88 - var87;
                        float var91 = (float)this.field2216[(int)var87];

                        while(--var90 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var91, 0, 0, (int)arg7, (int)var81, var66, var32, var67, var34, var68, var36, var69, var38);
                           var81 += var29;
                           arg7 += var28;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var91 += (float)this.field2219;
                        }

                        while(--var89 >= 0.0F) {
                           this.method4227(arg1, arg2, this.field2228, (int)var91, 0, 0, (int)arg7, (int)arg6, var66, var32, var67, var34, var68, var36, var69, var38);
                           arg6 += var30;
                           arg7 += var28;
                           var66 += var33;
                           var67 += var35;
                           var68 += var37;
                           var69 += var39;
                           var91 += (float)this.field2219;
                        }

                     }
                  }
               }
            } else if (!(arg5 >= (float)this.field2224)) {
               if (arg3 > (float)this.field2224) {
                  arg3 = (float)this.field2224;
               }

               if (arg4 > (float)this.field2224) {
                  arg4 = (float)this.field2224;
               }

               float var92 = arg11 - arg8 * var32 + var32;
               float var93 = (float)(arg14 & 16711680) - arg8 * var34 + var34;
               float var94 = (float)(arg14 & 65280) - arg8 * var36 + var36;
               float var95 = (float)(arg14 & 255) - arg8 * var38 + var38;
               if (arg3 < arg4) {
                  float var96 = arg8;
                  if (arg5 < 0.0F) {
                     var96 = arg8 - arg5 * var28;
                     arg8 -= arg5 * var30;
                     var92 -= arg5 * var33;
                     var93 -= arg5 * var35;
                     var94 -= arg5 * var37;
                     var95 -= arg5 * var39;
                     arg5 = 0.0F;
                  }

                  if (arg3 < 0.0F) {
                     arg6 -= arg3 * var29;
                     arg3 = 0.0F;
                  }

                  if (var28 < var30) {
                     float var97 = (float)((int)(arg5 + 0.5F));
                     float var98 = (float)((int)(arg3 + 0.5F));
                     float var99 = (float)((int)(arg4 + 0.5F)) - var98;
                     float var100 = var98 - var97;
                     float var101 = (float)this.field2216[(int)var97];

                     while(--var100 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var101, 0, 0, (int)var96, (int)arg8, var92, var32, var93, var34, var94, var36, var95, var38);
                        var96 += var28;
                        arg8 += var30;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var101 += (float)this.field2219;
                     }

                     while(--var99 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var101, 0, 0, (int)var96, (int)arg6, var92, var32, var93, var34, var94, var36, var95, var38);
                        var96 += var28;
                        arg6 += var29;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var101 += (float)this.field2219;
                     }

                  } else {
                     float var102 = (float)((int)(arg5 + 0.5F));
                     float var103 = (float)((int)(arg3 + 0.5F));
                     float var104 = (float)((int)(arg4 + 0.5F)) - var103;
                     float var105 = var103 - var102;
                     float var106 = (float)this.field2216[(int)var102];

                     while(--var105 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var106, 0, 0, (int)arg8, (int)var96, var92, var32, var93, var34, var94, var36, var95, var38);
                        var96 += var28;
                        arg8 += var30;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var106 += (float)this.field2219;
                     }

                     while(--var104 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var106, 0, 0, (int)arg6, (int)var96, var92, var32, var93, var34, var94, var36, var95, var38);
                        var96 += var28;
                        arg6 += var29;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var106 += (float)this.field2219;
                     }

                  }
               } else {
                  float var107 = arg8;
                  if (arg5 < 0.0F) {
                     var107 = arg8 - arg5 * var28;
                     arg8 -= arg5 * var30;
                     var92 -= arg5 * var33;
                     var93 -= arg5 * var35;
                     var94 -= arg5 * var37;
                     var95 -= arg5 * var39;
                     arg5 = 0.0F;
                  }

                  if (arg4 < 0.0F) {
                     arg7 -= arg4 * var29;
                     arg4 = 0.0F;
                  }

                  if (var28 < var30) {
                     float var108 = (float)((int)(arg5 + 0.5F));
                     float var109 = (float)((int)(arg4 + 0.5F));
                     float var110 = (float)((int)(arg3 + 0.5F)) - var109;
                     float var111 = var109 - var108;
                     float var112 = (float)this.field2216[(int)var108];

                     while(--var111 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var112, 0, 0, (int)var107, (int)arg8, var92, var32, var93, var34, var94, var36, var95, var38);
                        var107 += var28;
                        arg8 += var30;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var112 += (float)this.field2219;
                     }

                     while(--var110 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var112, 0, 0, (int)arg7, (int)arg8, var92, var32, var93, var34, var94, var36, var95, var38);
                        arg7 += var29;
                        arg8 += var30;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var112 += (float)this.field2219;
                     }

                  } else {
                     float var113 = (float)((int)(arg5 + 0.5F));
                     float var114 = (float)((int)(arg4 + 0.5F));
                     float var115 = (float)((int)(arg3 + 0.5F)) - var114;
                     float var116 = var114 - var113;
                     float var117 = (float)this.field2216[(int)var113];

                     while(--var116 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var117, 0, 0, (int)arg8, (int)var107, var92, var32, var93, var34, var94, var36, var95, var38);
                        var107 += var28;
                        arg8 += var30;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var117 += (float)this.field2219;
                     }

                     while(--var115 >= 0.0F) {
                        this.method4227(arg1, arg2, this.field2228, (int)var117, 0, 0, (int)arg8, (int)arg7, var92, var32, var93, var34, var94, var36, var95, var38);
                        arg7 += var29;
                        arg8 += var30;
                        var92 += var33;
                        var93 += var35;
                        var94 += var37;
                        var95 += var39;
                        var117 += (float)this.field2219;
                     }

                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("bs.o(ZZ[IIIIIIFFFFFFFF)V")
   private final void method4227(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15) {
      if (this.field2238) {
         if (arg7 > this.field2225 * 824681839) {
            arg7 = this.field2225 * 824681839;
         }

         if (arg6 < 0) {
            arg6 = 0;
         }
      }

      if (arg6 < arg7) {
         if (this.field2230) {
            int var17 = arg3 + arg6;
            float var18 = (float)arg6 * arg11 + arg10;
            float var19 = (float)arg6 * arg13 + arg12;
            float var20 = (float)arg6 * arg15 + arg14;
            if (this.field2229) {
               int var21 = arg7 - arg6 >> 2;
               float var22 = arg11 * 4.0F;
               float var23 = arg13 * 4.0F;
               float var24 = arg15 * 4.0F;
               if (this.field2213 == 0) {
                  if (var21 > 0) {
                     do {
                        int var25 = -16777216 | (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;
                        var18 += var22;
                        var19 += var23;
                        var20 += var24;
                        arg2[var17++] = var25;
                        arg2[var17++] = var25;
                        arg2[var17++] = var25;
                        arg2[var17++] = var25;
                        --var21;
                     } while(var21 > 0);
                  }

                  int var26 = arg7 - arg6 & 3;
                  if (var26 > 0) {
                     int var27 = -16777216 | (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;

                     do {
                        arg2[var17++] = var27;
                        --var26;
                     } while(var26 > 0);
                  }
               } else if (!this.field2212) {
                  int var28 = this.field2213;
                  int var29 = 256 - this.field2213;
                  if (var21 > 0) {
                     do {
                        int var30 = -16777216 | (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;
                        var18 += var22;
                        var19 += var23;
                        var20 += var24;
                        int var31 = ((var30 & 16711935) * var29 >> 8 & 16711935) + ((var30 & 65280) * var29 >> 8 & 65280);
                        int var32 = arg2[var17];
                        if (arg1) {
                           arg2[var17++] = (var29 | var32 >> 24) << 24 | ((var32 & 65280) * var28 >> 8 & 65280) + ((var32 & 16711935) * var28 >> 8 & 16711935) + var31;
                           int var33 = arg2[var17];
                           arg2[var17++] = (var29 | var33 >> 24) << 24 | ((var33 & 65280) * var28 >> 8 & 65280) + ((var33 & 16711935) * var28 >> 8 & 16711935) + var31;
                           int var34 = arg2[var17];
                           arg2[var17++] = (var29 | var34 >> 24) << 24 | ((var34 & 65280) * var28 >> 8 & 65280) + ((var34 & 16711935) * var28 >> 8 & 16711935) + var31;
                           int var35 = arg2[var17];
                           arg2[var17++] = (var29 | var35 >> 24) << 24 | ((var35 & 65280) * var28 >> 8 & 65280) + ((var35 & 16711935) * var28 >> 8 & 16711935) + var31;
                        } else {
                           arg2[var17++] = ((var32 & 65280) * var28 >> 8 & 65280) + ((var32 & 16711935) * var28 >> 8 & 16711935) + var31;
                           int var36 = arg2[var17];
                           arg2[var17++] = ((var36 & 65280) * var28 >> 8 & 65280) + ((var36 & 16711935) * var28 >> 8 & 16711935) + var31;
                           int var37 = arg2[var17];
                           arg2[var17++] = ((var37 & 65280) * var28 >> 8 & 65280) + ((var37 & 16711935) * var28 >> 8 & 16711935) + var31;
                           int var38 = arg2[var17];
                           arg2[var17++] = ((var38 & 65280) * var28 >> 8 & 65280) + ((var38 & 16711935) * var28 >> 8 & 16711935) + var31;
                        }

                        --var21;
                     } while(var21 > 0);
                  }

                  int var39 = arg7 - arg6 & 3;
                  if (var39 > 0) {
                     int var40 = -16777216 | (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;
                     int var41 = ((var40 & 16711935) * var29 >> 8 & 16711935) + ((var40 & 65280) * var29 >> 8 & 65280);

                     do {
                        int var42 = arg2[var17];
                        if (arg1) {
                           arg2[var17++] = (var29 | var42 >> 24) << 24 | ((var42 & 65280) * var28 >> 8 & 65280) + ((var42 & 16711935) * var28 >> 8 & 16711935) + var41;
                        } else {
                           arg2[var17++] = ((var42 & 65280) * var28 >> 8 & 65280) + ((var42 & 16711935) * var28 >> 8 & 16711935) + var41;
                        }

                        --var39;
                     } while(var39 > 0);
                  }
               } else {
                  if (var21 > 0) {
                     do {
                        int var43 = (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;
                        var18 += var22;
                        var19 += var23;
                        var20 += var24;
                        int var45 = var17++;
                        int var47 = arg2[var45];
                        int var48 = var43 + var47;
                        int var49 = (var43 & 16711935) + (var47 & 16711935);
                        int var50 = (var48 - var49 & 65536) + (var49 & 16777472);
                        arg2[var45] = -16777216 | var48 - var50 | var50 - (var50 >>> 8);
                        int var52 = var17++;
                        int var54 = arg2[var52];
                        int var55 = var43 + var54;
                        int var56 = (var43 & 16711935) + (var54 & 16711935);
                        int var57 = (var55 - var56 & 65536) + (var56 & 16777472);
                        arg2[var52] = -16777216 | var55 - var57 | var57 - (var57 >>> 8);
                        int var59 = var17++;
                        int var61 = arg2[var59];
                        int var62 = var43 + var61;
                        int var63 = (var43 & 16711935) + (var61 & 16711935);
                        int var64 = (var62 - var63 & 65536) + (var63 & 16777472);
                        arg2[var59] = -16777216 | var62 - var64 | var64 - (var64 >>> 8);
                        int var66 = var17++;
                        int var68 = arg2[var66];
                        int var69 = var43 + var68;
                        int var70 = (var43 & 16711935) + (var68 & 16711935);
                        int var71 = (var69 - var70 & 65536) + (var70 & 16777472);
                        arg2[var66] = -16777216 | var69 - var71 | var71 - (var71 >>> 8);
                        --var21;
                     } while(var21 > 0);
                  }

                  int var72 = arg7 - arg6 & 3;
                  if (var72 > 0) {
                     int var73 = (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;

                     do {
                        int var75 = var17++;
                        int var77 = arg2[var75];
                        int var78 = var73 + var77;
                        int var79 = (var73 & 16711935) + (var77 & 16711935);
                        int var80 = (var78 - var79 & 65536) + (var79 & 16777472);
                        arg2[var75] = -16777216 | var78 - var80 | var80 - (var80 >>> 8);
                        --var72;
                     } while(var72 > 0);
                  }
               }
            } else {
               int var81 = arg7 - arg6;
               if (this.field2213 == 0) {
                  do {
                     arg2[var17++] = -16777216 | (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;
                     var18 += arg11;
                     var19 += arg13;
                     var20 += arg15;
                     --var81;
                  } while(var81 > 0);
               } else if (!this.field2212) {
                  int var82 = this.field2213;
                  int var83 = 256 - this.field2213;

                  do {
                     int var84 = -16777216 | (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;
                     var18 += arg11;
                     var19 += arg13;
                     var20 += arg15;
                     int var85 = ((var84 & 16711935) * var83 >> 8 & 16711935) + ((var84 & 65280) * var83 >> 8 & 65280);
                     int var86 = arg2[var17];
                     if (arg1) {
                        arg2[var17++] = (var83 | var86 >> 24) << 24 | ((var86 & 65280) * var82 >> 8 & 65280) + ((var86 & 16711935) * var82 >> 8 & 16711935) + var85;
                     } else {
                        arg2[var17++] = ((var86 & 65280) * var82 >> 8 & 65280) + ((var86 & 16711935) * var82 >> 8 & 16711935) + var85;
                     }

                     --var81;
                  } while(var81 > 0);
               } else {
                  do {
                     int var88 = var17++;
                     int var89 = (int)var18 & 16711680 | (int)var19 & 65280 | (int)var20 & 255;
                     int var90 = arg2[var88];
                     int var91 = var89 + var90;
                     int var92 = (var89 & 16711935) + (var90 & 16711935);
                     int var93 = (var91 - var92 & 65536) + (var92 & 16777472);
                     arg2[var88] = -16777216 | var91 - var93 | var93 - (var93 >>> 8);
                     var18 += arg11;
                     var19 += arg13;
                     var20 += arg15;
                     --var81;
                  } while(var81 > 0);
               }
            }

         } else {
            int var94 = arg6 - 1 + arg3;
            float var95 = (float)arg6 * arg9 + arg8;
            float var96 = (float)arg6 * arg11 + arg10;
            float var97 = (float)arg6 * arg13 + arg12;
            float var98 = (float)arg6 * arg15 + arg14;
            if (this.field2218.field2011) {
               if (this.field2229) {
                  int var99 = arg7 - arg6 >> 2;
                  float var100 = arg11 * 4.0F;
                  float var101 = arg13 * 4.0F;
                  float var102 = arg15 * 4.0F;
                  if (this.field2213 == 0) {
                     if (var99 > 0) {
                        do {
                           int var103 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                           var96 += var100;
                           var97 += var101;
                           var98 += var102;
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              arg2[var94] = var103;
                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           float var104 = arg9 + var95;
                           ++var94;
                           if (!arg0 || var104 < this.field2220[var94]) {
                              arg2[var94] = var103;
                              if (arg0) {
                                 this.field2220[var94] = var104;
                              }
                           }

                           float var105 = arg9 + var104;
                           ++var94;
                           if (!arg0 || var105 < this.field2220[var94]) {
                              arg2[var94] = var103;
                              if (arg0) {
                                 this.field2220[var94] = var105;
                              }
                           }

                           float var106 = arg9 + var105;
                           ++var94;
                           if (!arg0 || var106 < this.field2220[var94]) {
                              arg2[var94] = var103;
                              if (arg0) {
                                 this.field2220[var94] = var106;
                              }
                           }

                           var95 = arg9 + var106;
                           --var99;
                        } while(var99 > 0);
                     }

                     int var107 = arg7 - arg6 & 3;
                     if (var107 > 0) {
                        int var108 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;

                        do {
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              arg2[var94] = var108;
                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           var95 += arg9;
                           --var107;
                        } while(var107 > 0);
                     }
                  } else if (!this.field2212) {
                     int var109 = this.field2213;
                     int var110 = 256 - this.field2213;
                     if (var99 > 0) {
                        do {
                           int var111 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                           var96 += var100;
                           var97 += var101;
                           var98 += var102;
                           int var112 = ((var111 & 16711935) * var110 >> 8 & 16711935) + ((var111 & 65280) * var110 >> 8 & 65280);
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              int var113 = arg2[var94];
                              if (arg1) {
                                 arg2[var94] = (var110 | var113 >> 24) << 24 | ((var113 & 65280) * var109 >> 8 & 65280) + ((var113 & 16711935) * var109 >> 8 & 16711935) + var112;
                              } else {
                                 arg2[var94] = ((var113 & 65280) * var109 >> 8 & 65280) + ((var113 & 16711935) * var109 >> 8 & 16711935) + var112;
                              }

                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           float var114 = arg9 + var95;
                           ++var94;
                           if (!arg0 || var114 < this.field2220[var94]) {
                              int var115 = arg2[var94];
                              if (arg1) {
                                 arg2[var94] = (var110 | var115 >> 24) << 24 | ((var115 & 65280) * var109 >> 8 & 65280) + ((var115 & 16711935) * var109 >> 8 & 16711935) + var112;
                              } else {
                                 arg2[var94] = ((var115 & 65280) * var109 >> 8 & 65280) + ((var115 & 16711935) * var109 >> 8 & 16711935) + var112;
                              }

                              if (arg0) {
                                 this.field2220[var94] = var114;
                              }
                           }

                           float var116 = arg9 + var114;
                           ++var94;
                           if (!arg0 || var116 < this.field2220[var94]) {
                              int var117 = arg2[var94];
                              if (arg1) {
                                 arg2[var94] = (var110 | var117 >> 24) << 24 | ((var117 & 65280) * var109 >> 8 & 65280) + ((var117 & 16711935) * var109 >> 8 & 16711935) + var112;
                              } else {
                                 arg2[var94] = ((var117 & 65280) * var109 >> 8 & 65280) + ((var117 & 16711935) * var109 >> 8 & 16711935) + var112;
                              }

                              if (arg0) {
                                 this.field2220[var94] = var116;
                              }
                           }

                           float var118 = arg9 + var116;
                           ++var94;
                           if (!arg0 || var118 < this.field2220[var94]) {
                              int var119 = arg2[var94];
                              if (arg1) {
                                 arg2[var94] = (var110 | var119 >> 24) << 24 | ((var119 & 65280) * var109 >> 8 & 65280) + ((var119 & 16711935) * var109 >> 8 & 16711935) + var112;
                              } else {
                                 arg2[var94] = ((var119 & 65280) * var109 >> 8 & 65280) + ((var119 & 16711935) * var109 >> 8 & 16711935) + var112;
                              }

                              if (arg0) {
                                 this.field2220[var94] = var118;
                              }
                           }

                           var95 = arg9 + var118;
                           --var99;
                        } while(var99 > 0);
                     }

                     int var120 = arg7 - arg6 & 3;
                     if (var120 > 0) {
                        int var121 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                        int var122 = ((var121 & 16711935) * var110 >> 8 & 16711935) + ((var121 & 65280) * var110 >> 8 & 65280);

                        do {
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              int var123 = arg2[var94];
                              if (arg1) {
                                 arg2[var94] = (var110 | var123 >> 24) << 24 | ((var123 & 65280) * var109 >> 8 & 65280) + ((var123 & 16711935) * var109 >> 8 & 16711935) + var122;
                              } else {
                                 arg2[var94] = ((var123 & 65280) * var109 >> 8 & 65280) + ((var123 & 16711935) * var109 >> 8 & 16711935) + var122;
                              }

                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           var95 += arg9;
                           --var120;
                        } while(var120 > 0);
                     }
                  } else {
                     if (var99 > 0) {
                        do {
                           int var124 = (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                           var96 += var100;
                           var97 += var101;
                           var98 += var102;
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              int var128 = arg2[var94];
                              int var129 = var124 + var128;
                              int var130 = (var124 & 16711935) + (var128 & 16711935);
                              int var131 = (var129 - var130 & 65536) + (var130 & 16777472);
                              arg2[var94] = -16777216 | var129 - var131 | var131 - (var131 >>> 8);
                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           float var132 = arg9 + var95;
                           ++var94;
                           if (!arg0 || var132 < this.field2220[var94]) {
                              int var136 = arg2[var94];
                              int var137 = var124 + var136;
                              int var138 = (var124 & 16711935) + (var136 & 16711935);
                              int var139 = (var137 - var138 & 65536) + (var138 & 16777472);
                              arg2[var94] = -16777216 | var137 - var139 | var139 - (var139 >>> 8);
                              if (arg0) {
                                 this.field2220[var94] = var132;
                              }
                           }

                           float var140 = arg9 + var132;
                           ++var94;
                           if (!arg0 || var140 < this.field2220[var94]) {
                              int var144 = arg2[var94];
                              int var145 = var124 + var144;
                              int var146 = (var124 & 16711935) + (var144 & 16711935);
                              int var147 = (var145 - var146 & 65536) + (var146 & 16777472);
                              arg2[var94] = -16777216 | var145 - var147 | var147 - (var147 >>> 8);
                              if (arg0) {
                                 this.field2220[var94] = var140;
                              }
                           }

                           float var148 = arg9 + var140;
                           ++var94;
                           if (!arg0 || var148 < this.field2220[var94]) {
                              int var152 = arg2[var94];
                              int var153 = var124 + var152;
                              int var154 = (var124 & 16711935) + (var152 & 16711935);
                              int var155 = (var153 - var154 & 65536) + (var154 & 16777472);
                              arg2[var94] = -16777216 | var153 - var155 | var155 - (var155 >>> 8);
                              if (arg0) {
                                 this.field2220[var94] = var148;
                              }
                           }

                           var95 = arg9 + var148;
                           --var99;
                        } while(var99 > 0);
                     }

                     int var156 = arg7 - arg6 & 3;
                     if (var156 > 0) {
                        int var157 = (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;

                        do {
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              int var161 = arg2[var94];
                              int var162 = var157 + var161;
                              int var163 = (var157 & 16711935) + (var161 & 16711935);
                              int var164 = (var162 - var163 & 65536) + (var163 & 16777472);
                              arg2[var94] = -16777216 | var162 - var164 | var164 - (var164 >>> 8);
                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           var95 += arg9;
                           --var156;
                        } while(var156 > 0);
                     }
                  }

               } else {
                  int var165 = arg7 - arg6;
                  if (this.field2213 != 0) {
                     if (this.field2212) {
                        do {
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              int var173 = (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                              int var174 = arg2[var94];
                              int var175 = var173 + var174;
                              int var176 = (var173 & 16711935) + (var174 & 16711935);
                              int var177 = (var175 - var176 & 65536) + (var176 & 16777472);
                              arg2[var94] = -16777216 | var175 - var177 | var177 - (var177 >>> 8);
                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           var95 += arg9;
                           var96 += arg11;
                           var97 += arg13;
                           var98 += arg15;
                           --var165;
                        } while(var165 > 0);
                     } else {
                        int var166 = this.field2213;
                        int var167 = 256 - this.field2213;

                        do {
                           ++var94;
                           if (!arg0 || var95 < this.field2220[var94]) {
                              int var168 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                              int var169 = ((var168 & 16711935) * var167 >> 8 & 16711935) + ((var168 & 65280) * var167 >> 8 & 65280);
                              int var170 = arg2[var94];
                              if (arg1) {
                                 arg2[var94] = (var167 | var170 >> 24) << 24 | ((var170 & 65280) * var166 >> 8 & 65280) + ((var170 & 16711935) * var166 >> 8 & 16711935) + var169;
                              } else {
                                 arg2[var94] = ((var170 & 65280) * var166 >> 8 & 65280) + ((var170 & 16711935) * var166 >> 8 & 16711935) + var169;
                              }

                              if (arg0) {
                                 this.field2220[var94] = var95;
                              }
                           }

                           var95 += arg9;
                           var96 += arg11;
                           var97 += arg13;
                           var98 += arg15;
                           --var165;
                        } while(var165 > 0);
                     }
                  } else {
                     do {
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           arg2[var94] = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                           if (arg0) {
                              this.field2220[var94] = var95;
                           }
                        }

                        var95 += arg9;
                        var96 += arg11;
                        var97 += arg13;
                        var98 += arg15;
                        --var165;
                     } while(var165 > 0);
                  }

               }
            } else if (this.field2229) {
               int var178 = arg7 - arg6 >> 2;
               float var179 = arg11 * 4.0F;
               float var180 = arg13 * 4.0F;
               float var181 = arg15 * 4.0F;
               if (this.field2213 == 0) {
                  if (var178 > 0) {
                     do {
                        int var182 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                        var96 += var179;
                        var97 += var180;
                        var98 += var181;
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           arg2[var94] = var182;
                        }

                        float var183 = arg9 + var95;
                        ++var94;
                        if (!arg0 || var183 < this.field2220[var94]) {
                           arg2[var94] = var182;
                        }

                        float var184 = arg9 + var183;
                        ++var94;
                        if (!arg0 || var184 < this.field2220[var94]) {
                           arg2[var94] = var182;
                        }

                        float var185 = arg9 + var184;
                        ++var94;
                        if (!arg0 || var185 < this.field2220[var94]) {
                           arg2[var94] = var182;
                        }

                        var95 = arg9 + var185;
                        --var178;
                     } while(var178 > 0);
                  }

                  int var186 = arg7 - arg6 & 3;
                  if (var186 > 0) {
                     int var187 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;

                     do {
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           arg2[var94] = var187;
                        }

                        var95 += arg9;
                        --var186;
                     } while(var186 > 0);
                  }
               } else if (!this.field2212) {
                  int var188 = this.field2213;
                  int var189 = 256 - this.field2213;
                  if (var178 > 0) {
                     do {
                        int var190 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                        var96 += var179;
                        var97 += var180;
                        var98 += var181;
                        int var191 = ((var190 & 16711935) * var189 >> 8 & 16711935) + ((var190 & 65280) * var189 >> 8 & 65280);
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           int var192 = arg2[var94];
                           if (arg1) {
                              arg2[var94] = (var189 | var192 >> 24) << 24 | ((var192 & 65280) * var188 >> 8 & 65280) + ((var192 & 16711935) * var188 >> 8 & 16711935) + var191;
                           } else {
                              arg2[var94] = ((var192 & 65280) * var188 >> 8 & 65280) + ((var192 & 16711935) * var188 >> 8 & 16711935) + var191;
                           }
                        }

                        float var193 = arg9 + var95;
                        ++var94;
                        if (!arg0 || var193 < this.field2220[var94]) {
                           int var194 = arg2[var94];
                           if (arg1) {
                              arg2[var94] = (var189 | var194 >> 24) << 24 | ((var194 & 65280) * var188 >> 8 & 65280) + ((var194 & 16711935) * var188 >> 8 & 16711935) + var191;
                           } else {
                              arg2[var94] = ((var194 & 65280) * var188 >> 8 & 65280) + ((var194 & 16711935) * var188 >> 8 & 16711935) + var191;
                           }
                        }

                        float var195 = arg9 + var193;
                        ++var94;
                        if (!arg0 || var195 < this.field2220[var94]) {
                           int var196 = arg2[var94];
                           if (arg1) {
                              arg2[var94] = (var189 | var196 >> 24) << 24 | ((var196 & 65280) * var188 >> 8 & 65280) + ((var196 & 16711935) * var188 >> 8 & 16711935) + var191;
                           } else {
                              arg2[var94] = ((var196 & 65280) * var188 >> 8 & 65280) + ((var196 & 16711935) * var188 >> 8 & 16711935) + var191;
                           }
                        }

                        float var197 = arg9 + var195;
                        ++var94;
                        if (!arg0 || var197 < this.field2220[var94]) {
                           int var198 = arg2[var94];
                           if (arg1) {
                              arg2[var94] = (var189 | var198 >> 24) << 24 | ((var198 & 65280) * var188 >> 8 & 65280) + ((var198 & 16711935) * var188 >> 8 & 16711935) + var191;
                           } else {
                              arg2[var94] = ((var198 & 65280) * var188 >> 8 & 65280) + ((var198 & 16711935) * var188 >> 8 & 16711935) + var191;
                           }
                        }

                        var95 = arg9 + var197;
                        --var178;
                     } while(var178 > 0);
                  }

                  int var199 = arg7 - arg6 & 3;
                  if (var199 > 0) {
                     int var200 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                     int var201 = ((var200 & 16711935) * var189 >> 8 & 16711935) + ((var200 & 65280) * var189 >> 8 & 65280);

                     do {
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           int var202 = arg2[var94];
                           if (arg1) {
                              arg2[var94] = (var189 | var202 >> 24) << 24 | ((var202 & 65280) * var188 >> 8 & 65280) + ((var202 & 16711935) * var188 >> 8 & 16711935) + var201;
                           } else {
                              arg2[var94] = ((var202 & 65280) * var188 >> 8 & 65280) + ((var202 & 16711935) * var188 >> 8 & 16711935) + var201;
                           }
                        }

                        var95 += arg9;
                        --var199;
                     } while(var199 > 0);
                  }
               } else {
                  if (var178 > 0) {
                     do {
                        int var203 = (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                        var96 += var179;
                        var97 += var180;
                        var98 += var181;
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           int var207 = arg2[var94];
                           int var208 = var203 + var207;
                           int var209 = (var203 & 16711935) + (var207 & 16711935);
                           int var210 = (var208 - var209 & 65536) + (var209 & 16777472);
                           arg2[var94] = -16777216 | var208 - var210 | var210 - (var210 >>> 8);
                        }

                        float var211 = arg9 + var95;
                        ++var94;
                        if (!arg0 || var211 < this.field2220[var94]) {
                           int var215 = arg2[var94];
                           int var216 = var203 + var215;
                           int var217 = (var203 & 16711935) + (var215 & 16711935);
                           int var218 = (var216 - var217 & 65536) + (var217 & 16777472);
                           arg2[var94] = -16777216 | var216 - var218 | var218 - (var218 >>> 8);
                        }

                        float var219 = arg9 + var211;
                        ++var94;
                        if (!arg0 || var219 < this.field2220[var94]) {
                           int var223 = arg2[var94];
                           int var224 = var203 + var223;
                           int var225 = (var203 & 16711935) + (var223 & 16711935);
                           int var226 = (var224 - var225 & 65536) + (var225 & 16777472);
                           arg2[var94] = -16777216 | var224 - var226 | var226 - (var226 >>> 8);
                        }

                        float var227 = arg9 + var219;
                        ++var94;
                        if (!arg0 || var227 < this.field2220[var94]) {
                           int var231 = arg2[var94];
                           int var232 = var203 + var231;
                           int var233 = (var203 & 16711935) + (var231 & 16711935);
                           int var234 = (var232 - var233 & 65536) + (var233 & 16777472);
                           arg2[var94] = -16777216 | var232 - var234 | var234 - (var234 >>> 8);
                        }

                        var95 = arg9 + var227;
                        --var178;
                     } while(var178 > 0);
                  }

                  int var235 = arg7 - arg6 & 3;
                  if (var235 > 0) {
                     int var236 = (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;

                     do {
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           int var240 = arg2[var94];
                           int var241 = var236 + var240;
                           int var242 = (var236 & 16711935) + (var240 & 16711935);
                           int var243 = (var241 - var242 & 65536) + (var242 & 16777472);
                           arg2[var94] = -16777216 | var241 - var243 | var243 - (var243 >>> 8);
                        }

                        var95 += arg9;
                        --var235;
                     } while(var235 > 0);
                  }
               }

            } else {
               int var244 = arg7 - arg6;
               if (this.field2213 != 0) {
                  if (this.field2212) {
                     do {
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           int var252 = (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                           int var253 = arg2[var94];
                           int var254 = var252 + var253;
                           int var255 = (var252 & 16711935) + (var253 & 16711935);
                           int var256 = (var254 - var255 & 65536) + (var255 & 16777472);
                           arg2[var94] = -16777216 | var254 - var256 | var256 - (var256 >>> 8);
                        }

                        var95 += arg9;
                        var96 += arg11;
                        var97 += arg13;
                        var98 += arg15;
                        --var244;
                     } while(var244 > 0);
                  } else {
                     int var245 = this.field2213;
                     int var246 = 256 - this.field2213;

                     do {
                        ++var94;
                        if (!arg0 || var95 < this.field2220[var94]) {
                           int var247 = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                           int var248 = ((var247 & 16711935) * var246 >> 8 & 16711935) + ((var247 & 65280) * var246 >> 8 & 65280);
                           int var249 = arg2[var94];
                           if (arg1) {
                              arg2[var94] = (var246 | var249 >> 24) << 24 | ((var249 & 65280) * var245 >> 8 & 65280) + ((var249 & 16711935) * var245 >> 8 & 16711935) + var248;
                           } else {
                              arg2[var94] = ((var249 & 65280) * var245 >> 8 & 65280) + ((var249 & 16711935) * var245 >> 8 & 16711935) + var248;
                           }
                        }

                        var95 += arg9;
                        var96 += arg11;
                        var97 += arg13;
                        var98 += arg15;
                        --var244;
                     } while(var244 > 0);
                  }
               } else {
                  do {
                     ++var94;
                     if (!arg0 || var95 < this.field2220[var94]) {
                        arg2[var94] = -16777216 | (int)var96 & 16711680 | (int)var97 & 65280 | (int)var98 & 255;
                     }

                     var95 += arg9;
                     var96 += arg11;
                     var97 += arg13;
                     var98 += arg15;
                     --var244;
                  } while(var244 > 0);
               }

            }
         }
      }
   }

   @deob.ObfuscatedName("bs.a(ZZZFFFFFFFFFI)V")
   public final void method4220(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, int arg12) {
      if (this.field2233) {
         this.field2211.method11529((int)arg6, (int)arg3, (int)arg7, (int)arg4, arg12);
         this.field2211.method11529((int)arg7, (int)arg4, (int)arg8, (int)arg5, arg12);
         this.field2211.method11529((int)arg8, (int)arg5, (int)arg6, (int)arg3, arg12);
      } else {
         float var14 = arg7 - arg6;
         float var15 = arg4 - arg3;
         float var16 = arg8 - arg6;
         float var17 = arg5 - arg3;
         float var18 = arg10 - arg9;
         float var19 = arg11 - arg9;
         float var20 = 0.0F;
         if (arg3 != arg4) {
            var20 = (arg7 - arg6) / (arg4 - arg3);
         }

         float var21 = 0.0F;
         if (arg4 != arg5) {
            var21 = (arg8 - arg7) / (arg5 - arg4);
         }

         float var22 = 0.0F;
         if (arg3 != arg5) {
            var22 = (arg6 - arg8) / (arg3 - arg5);
         }

         float var23 = var14 * var17 - var15 * var16;
         if (var23 != 0.0F) {
            float var24 = (var17 * var18 - var15 * var19) / var23;
            float var25 = (var14 * var19 - var16 * var18) / var23;
            if (arg3 <= arg4 && arg3 <= arg5) {
               if (!(arg3 >= (float)this.field2224)) {
                  if (arg4 > (float)this.field2224) {
                     arg4 = (float)this.field2224;
                  }

                  if (arg5 > (float)this.field2224) {
                     arg5 = (float)this.field2224;
                  }

                  float var26 = arg9 - arg6 * var24 + var24;
                  if (arg4 < arg5) {
                     float var27 = arg6;
                     if (arg3 < 0.0F) {
                        var27 = arg6 - arg3 * var22;
                        arg6 -= arg3 * var20;
                        var26 -= arg3 * var25;
                        arg3 = 0.0F;
                     }

                     if (arg4 < 0.0F) {
                        arg7 -= arg4 * var21;
                        arg4 = 0.0F;
                     }

                     if (arg3 != arg4 && var22 < var20 || arg3 == arg4 && var22 > var21) {
                        float var28 = (float)((int)(arg3 + 0.5F));
                        float var29 = (float)((int)(arg4 + 0.5F));
                        float var30 = (float)((int)(arg5 + 0.5F)) - var29;
                        float var31 = var29 - var28;
                        float var32 = (float)this.field2216[(int)var28];

                        while(--var31 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var32, arg12, 0, (int)var27, (int)arg6, var26, var24);
                           var27 += var22;
                           arg6 += var20;
                           var26 += var25;
                           var32 += (float)this.field2219;
                        }

                        while(--var30 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var32, arg12, 0, (int)var27, (int)arg7, var26, var24);
                           var27 += var22;
                           arg7 += var21;
                           var26 += var25;
                           var32 += (float)this.field2219;
                        }

                     } else {
                        float var33 = (float)((int)(arg3 + 0.5F));
                        float var34 = (float)((int)(arg4 + 0.5F));
                        float var35 = (float)((int)(arg5 + 0.5F)) - var34;
                        float var36 = var34 - var33;
                        float var37 = (float)this.field2216[(int)var33];

                        while(--var36 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var37, arg12, 0, (int)arg6, (int)var27, var26, var24);
                           var27 += var22;
                           arg6 += var20;
                           var26 += var25;
                           var37 += (float)this.field2219;
                        }

                        while(--var35 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var37, arg12, 0, (int)arg7, (int)var27, var26, var24);
                           var27 += var22;
                           arg7 += var21;
                           var26 += var25;
                           var37 += (float)this.field2219;
                        }

                     }
                  } else {
                     float var38 = arg6;
                     if (arg3 < 0.0F) {
                        var38 = arg6 - arg3 * var22;
                        arg6 -= arg3 * var20;
                        var26 -= arg3 * var25;
                        arg3 = 0.0F;
                     }

                     if (arg5 < 0.0F) {
                        arg8 -= arg5 * var21;
                        arg5 = 0.0F;
                     }

                     if ((arg3 == arg5 || !(var22 < var20)) && (arg3 != arg5 || !(var21 > var20))) {
                        float var44 = (float)((int)(arg3 + 0.5F));
                        float var45 = (float)((int)(arg5 + 0.5F));
                        float var46 = (float)((int)(arg4 + 0.5F)) - var45;
                        float var47 = var45 - var44;
                        float var48 = (float)this.field2216[(int)var44];

                        while(--var47 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var48, arg12, 0, (int)arg6, (int)var38, var26, var24);
                           var38 += var22;
                           arg6 += var20;
                           var26 += var25;
                           var48 += (float)this.field2219;
                        }

                        while(--var46 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var48, arg12, 0, (int)arg6, (int)arg8, var26, var24);
                           arg8 += var21;
                           arg6 += var20;
                           var26 += var25;
                           var48 += (float)this.field2219;
                        }

                     } else {
                        float var39 = (float)((int)(arg3 + 0.5F));
                        float var40 = (float)((int)(arg5 + 0.5F));
                        float var41 = (float)((int)(arg4 + 0.5F)) - var40;
                        float var42 = var40 - var39;
                        float var43 = (float)this.field2216[(int)var39];

                        while(--var42 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var43, arg12, 0, (int)var38, (int)arg6, var26, var24);
                           var38 += var22;
                           arg6 += var20;
                           var26 += var25;
                           var43 += (float)this.field2219;
                        }

                        while(--var41 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var43, arg12, 0, (int)arg8, (int)arg6, var26, var24);
                           arg8 += var21;
                           arg6 += var20;
                           var26 += var25;
                           var43 += (float)this.field2219;
                        }

                     }
                  }
               }
            } else if (arg4 <= arg5) {
               if (!(arg4 >= (float)this.field2224)) {
                  if (arg5 > (float)this.field2224) {
                     arg5 = (float)this.field2224;
                  }

                  if (arg3 > (float)this.field2224) {
                     arg3 = (float)this.field2224;
                  }

                  float var49 = arg10 - arg7 * var24 + var24;
                  if (arg5 < arg3) {
                     float var50 = arg7;
                     if (arg4 < 0.0F) {
                        var50 = arg7 - arg4 * var20;
                        arg7 -= arg4 * var21;
                        var49 -= arg4 * var25;
                        arg4 = 0.0F;
                     }

                     if (arg5 < 0.0F) {
                        arg8 -= arg5 * var22;
                        arg5 = 0.0F;
                     }

                     if (arg4 != arg5 && var20 < var21 || arg4 == arg5 && var20 > var22) {
                        float var51 = (float)((int)(arg4 + 0.5F));
                        float var52 = (float)((int)(arg5 + 0.5F));
                        float var53 = (float)((int)(arg3 + 0.5F)) - var52;
                        float var54 = var52 - var51;
                        float var55 = (float)this.field2216[(int)var51];

                        while(--var54 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var55, arg12, 0, (int)var50, (int)arg7, var49, var24);
                           var50 += var20;
                           arg7 += var21;
                           var49 += var25;
                           var55 += (float)this.field2219;
                        }

                        while(--var53 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var55, arg12, 0, (int)var50, (int)arg8, var49, var24);
                           var50 += var20;
                           arg8 += var22;
                           var49 += var25;
                           var55 += (float)this.field2219;
                        }

                     } else {
                        float var56 = (float)((int)(arg4 + 0.5F));
                        float var57 = (float)((int)(arg5 + 0.5F));
                        float var58 = (float)((int)(arg3 + 0.5F)) - var57;
                        float var59 = var57 - var56;
                        float var60 = (float)this.field2216[(int)var56];

                        while(--var59 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var60, arg12, 0, (int)arg7, (int)var50, var49, var24);
                           var50 += var20;
                           arg7 += var21;
                           var49 += var25;
                           var60 += (float)this.field2219;
                        }

                        while(--var58 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var60, arg12, 0, (int)arg8, (int)var50, var49, var24);
                           var50 += var20;
                           arg8 += var22;
                           var49 += var25;
                           var60 += (float)this.field2219;
                        }

                     }
                  } else {
                     float var61 = arg7;
                     if (arg4 < 0.0F) {
                        var61 = arg7 - arg4 * var20;
                        arg7 -= arg4 * var21;
                        var49 -= arg4 * var25;
                        arg4 = 0.0F;
                     }

                     if (arg3 < 0.0F) {
                        arg6 -= arg3 * var22;
                        arg3 = 0.0F;
                     }

                     if (var20 < var21) {
                        float var62 = (float)((int)(arg4 + 0.5F));
                        float var63 = (float)((int)(arg3 + 0.5F));
                        float var64 = (float)((int)(arg5 + 0.5F)) - var63;
                        float var65 = var63 - var62;
                        float var66 = (float)this.field2216[(int)var62];

                        while(--var65 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var66, arg12, 0, (int)var61, (int)arg7, var49, var24);
                           var61 += var20;
                           arg7 += var21;
                           var49 += var25;
                           var66 += (float)this.field2219;
                        }

                        while(--var64 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var66, arg12, 0, (int)arg6, (int)arg7, var49, var24);
                           arg6 += var22;
                           arg7 += var21;
                           var49 += var25;
                           var66 += (float)this.field2219;
                        }

                     } else {
                        float var67 = (float)((int)(arg4 + 0.5F));
                        float var68 = (float)((int)(arg3 + 0.5F));
                        float var69 = (float)((int)(arg5 + 0.5F)) - var68;
                        float var70 = var68 - var67;
                        float var71 = (float)this.field2216[(int)var67];

                        while(--var70 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var71, arg12, 0, (int)arg7, (int)var61, var49, var24);
                           var61 += var20;
                           arg7 += var21;
                           var49 += var25;
                           var71 += (float)this.field2219;
                        }

                        while(--var69 >= 0.0F) {
                           this.method4229(arg0, arg1, arg2, this.field2228, (int)var71, arg12, 0, (int)arg7, (int)arg6, var49, var24);
                           arg6 += var22;
                           arg7 += var21;
                           var49 += var25;
                           var71 += (float)this.field2219;
                        }

                     }
                  }
               }
            } else if (!(arg5 >= (float)this.field2224)) {
               if (arg3 > (float)this.field2224) {
                  arg3 = (float)this.field2224;
               }

               if (arg4 > (float)this.field2224) {
                  arg4 = (float)this.field2224;
               }

               float var72 = arg11 - arg8 * var24 + var24;
               if (arg3 < arg4) {
                  float var73 = arg8;
                  if (arg5 < 0.0F) {
                     var73 = arg8 - arg5 * var21;
                     arg8 -= arg5 * var22;
                     var72 -= arg5 * var25;
                     arg5 = 0.0F;
                  }

                  if (arg3 < 0.0F) {
                     arg6 -= arg3 * var20;
                     arg3 = 0.0F;
                  }

                  if (var21 < var22) {
                     float var74 = (float)((int)(arg5 + 0.5F));
                     float var75 = (float)((int)(arg3 + 0.5F));
                     float var76 = (float)((int)(arg4 + 0.5F)) - var75;
                     float var77 = var75 - var74;
                     float var78 = (float)this.field2216[(int)var74];

                     while(--var77 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var78, arg12, 0, (int)var73, (int)arg8, var72, var24);
                        var73 += var21;
                        arg8 += var22;
                        var72 += var25;
                        var78 += (float)this.field2219;
                     }

                     while(--var76 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var78, arg12, 0, (int)var73, (int)arg6, var72, var24);
                        var73 += var21;
                        arg6 += var20;
                        var72 += var25;
                        var78 += (float)this.field2219;
                     }

                  } else {
                     float var79 = (float)((int)(arg5 + 0.5F));
                     float var80 = (float)((int)(arg3 + 0.5F));
                     float var81 = (float)((int)(arg4 + 0.5F)) - var80;
                     float var82 = var80 - var79;
                     float var83 = (float)this.field2216[(int)var79];

                     while(--var82 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var83, arg12, 0, (int)arg8, (int)var73, var72, var24);
                        var73 += var21;
                        arg8 += var22;
                        var72 += var25;
                        var83 += (float)this.field2219;
                     }

                     while(--var81 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var83, arg12, 0, (int)arg6, (int)var73, var72, var24);
                        var73 += var21;
                        arg6 += var20;
                        var72 += var25;
                        var83 += (float)this.field2219;
                     }

                  }
               } else {
                  float var84 = arg8;
                  if (arg5 < 0.0F) {
                     var84 = arg8 - arg5 * var21;
                     arg8 -= arg5 * var22;
                     var72 -= arg5 * var25;
                     arg5 = 0.0F;
                  }

                  if (arg4 < 0.0F) {
                     arg7 -= arg4 * var20;
                     arg4 = 0.0F;
                  }

                  if (var21 < var22) {
                     float var85 = (float)((int)(arg5 + 0.5F));
                     float var86 = (float)((int)(arg4 + 0.5F));
                     float var87 = (float)((int)(arg3 + 0.5F)) - var86;
                     float var88 = var86 - var85;
                     float var89 = (float)this.field2216[(int)var85];

                     while(--var88 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var89, arg12, 0, (int)var84, (int)arg8, var72, var24);
                        var84 += var21;
                        arg8 += var22;
                        var72 += var25;
                        var89 += (float)this.field2219;
                     }

                     while(--var87 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var89, arg12, 0, (int)arg7, (int)arg8, var72, var24);
                        arg7 += var20;
                        arg8 += var22;
                        var72 += var25;
                        var89 += (float)this.field2219;
                     }

                  } else {
                     float var90 = (float)((int)(arg5 + 0.5F));
                     float var91 = (float)((int)(arg4 + 0.5F));
                     float var92 = (float)((int)(arg3 + 0.5F)) - var91;
                     float var93 = var91 - var90;
                     float var94 = (float)this.field2216[(int)var90];

                     while(--var93 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var94, arg12, 0, (int)arg8, (int)var84, var72, var24);
                        var84 += var21;
                        arg8 += var22;
                        var72 += var25;
                        var94 += (float)this.field2219;
                     }

                     while(--var92 >= 0.0F) {
                        this.method4229(arg0, arg1, arg2, this.field2228, (int)var94, arg12, 0, (int)arg8, (int)arg7, var72, var24);
                        arg7 += var20;
                        arg8 += var22;
                        var72 += var25;
                        var94 += (float)this.field2219;
                     }

                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("bs.x(ZZZ[IIIIIIFF)V")
   private final void method4229(boolean arg0, boolean arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10) {
      if (this.field2238) {
         if (arg8 > this.field2225 * 824681839) {
            arg8 = this.field2225 * 824681839;
         }

         if (arg7 < 0) {
            arg7 = 0;
         }
      }

      if (arg7 < arg8) {
         int var12 = arg7 - 1 + arg4;
         int var13 = arg8 - arg7 >> 2;
         float var14 = (float)arg7 * arg10 + arg9;
         if (!this.field2218.field2011) {
            if (arg0) {
               if (this.field2213 == 0) {
                  while(true) {
                     --var13;
                     if (var13 < 0) {
                        int var38 = arg8 - arg7 & 3;

                        while(true) {
                           --var38;
                           if (var38 < 0) {
                              return;
                           }

                           ++var12;
                           if (!arg1 || var14 < this.field2220[var12]) {
                              arg3[var12] = arg5;
                           }

                           var14 += arg10;
                        }
                     }

                     ++var12;
                     if (!arg1 || var14 < this.field2220[var12]) {
                        arg3[var12] = arg5;
                     }

                     float var35 = arg10 + var14;
                     ++var12;
                     if (!arg1 || var35 < this.field2220[var12]) {
                        arg3[var12] = arg5;
                     }

                     float var36 = arg10 + var35;
                     ++var12;
                     if (!arg1 || var36 < this.field2220[var12]) {
                        arg3[var12] = arg5;
                     }

                     float var37 = arg10 + var36;
                     ++var12;
                     if (!arg1 || var37 < this.field2220[var12]) {
                        arg3[var12] = arg5;
                     }

                     var14 = arg10 + var37;
                  }
               } else if (this.field2213 == 254) {
                  if (arg7 != 0 && arg8 <= this.field2225 * 824681839 - 1) {
                     while(true) {
                        --var13;
                        if (var13 < 0) {
                           int var42 = arg8 - arg7 & 3;

                           while(true) {
                              --var42;
                              if (var42 < 0) {
                                 return;
                              }

                              ++var12;
                              if (!arg1 || var14 < this.field2220[var12]) {
                                 arg3[var12 - 1] = arg3[var12];
                              }

                              var14 += arg10;
                           }
                        }

                        ++var12;
                        if (!arg1 || var14 < this.field2220[var12]) {
                           arg3[var12 - 1] = arg3[var12];
                        }

                        float var39 = arg10 + var14;
                        ++var12;
                        if (!arg1 || var39 < this.field2220[var12]) {
                           arg3[var12 - 1] = arg3[var12];
                        }

                        float var40 = arg10 + var39;
                        ++var12;
                        if (!arg1 || var40 < this.field2220[var12]) {
                           arg3[var12 - 1] = arg3[var12];
                        }

                        float var41 = arg10 + var40;
                        ++var12;
                        if (!arg1 || var41 < this.field2220[var12]) {
                           arg3[var12 - 1] = arg3[var12];
                        }

                        var14 = arg10 + var41;
                     }
                  }
               } else {
                  int var43 = this.field2213;
                  int var44 = 256 - this.field2213;
                  int var45 = ((arg5 & 16711935) * var44 >> 8 & 16711935) + ((arg5 & 65280) * var44 >> 8 & 65280);

                  while(true) {
                     --var13;
                     if (var13 < 0) {
                        int var53 = arg8 - arg7 & 3;

                        while(true) {
                           --var53;
                           if (var53 < 0) {
                              return;
                           }

                           ++var12;
                           if (!arg1 || var14 < this.field2220[var12]) {
                              int var54 = arg3[var12];
                              if (arg2) {
                                 arg3[var12] = (var44 | var54 >> 24) << 24 | ((var54 & 65280) * var43 >> 8 & 65280) + ((var54 & 16711935) * var43 >> 8 & 16711935) + var45;
                              } else {
                                 arg3[var12] = ((var54 & 65280) * var43 >> 8 & 65280) + ((var54 & 16711935) * var43 >> 8 & 16711935) + var45;
                              }
                           }

                           var14 += arg10;
                        }
                     }

                     ++var12;
                     if (!arg1 || var14 < this.field2220[var12]) {
                        int var46 = arg3[var12];
                        if (arg2) {
                           arg3[var12] = (var44 | var46 >> 24) << 24 | ((var46 & 65280) * var43 >> 8 & 65280) + ((var46 & 16711935) * var43 >> 8 & 16711935) + var45;
                        } else {
                           arg3[var12] = ((var46 & 65280) * var43 >> 8 & 65280) + ((var46 & 16711935) * var43 >> 8 & 16711935) + var45;
                        }
                     }

                     float var47 = arg10 + var14;
                     ++var12;
                     if (!arg1 || var47 < this.field2220[var12]) {
                        int var48 = arg3[var12];
                        if (arg2) {
                           arg3[var12] = (var44 | var48 >> 24) << 24 | ((var48 & 65280) * var43 >> 8 & 65280) + ((var48 & 16711935) * var43 >> 8 & 16711935) + var45;
                        } else {
                           arg3[var12] = ((var48 & 65280) * var43 >> 8 & 65280) + ((var48 & 16711935) * var43 >> 8 & 16711935) + var45;
                        }
                     }

                     float var49 = arg10 + var47;
                     ++var12;
                     if (!arg1 || var49 < this.field2220[var12]) {
                        int var50 = arg3[var12];
                        if (arg2) {
                           arg3[var12] = (var44 | var50 >> 24) << 24 | ((var50 & 65280) * var43 >> 8 & 65280) + ((var50 & 16711935) * var43 >> 8 & 16711935) + var45;
                        } else {
                           arg3[var12] = ((var50 & 65280) * var43 >> 8 & 65280) + ((var50 & 16711935) * var43 >> 8 & 16711935) + var45;
                        }
                     }

                     float var51 = arg10 + var49;
                     ++var12;
                     if (!arg1 || var51 < this.field2220[var12]) {
                        int var52 = arg3[var12];
                        if (arg2) {
                           arg3[var12] = (var44 | var52 >> 24) << 24 | ((var52 & 65280) * var43 >> 8 & 65280) + ((var52 & 16711935) * var43 >> 8 & 16711935) + var45;
                        } else {
                           arg3[var12] = ((var52 & 65280) * var43 >> 8 & 65280) + ((var52 & 16711935) * var43 >> 8 & 16711935) + var45;
                        }
                     }

                     var14 = arg10 + var51;
                  }
               }
            }
         } else if (this.field2213 == 0) {
            while(true) {
               --var13;
               if (var13 < 0) {
                  int var18 = arg8 - arg7 & 3;

                  while(true) {
                     --var18;
                     if (var18 < 0) {
                        return;
                     }

                     ++var12;
                     if (!arg1 || var14 < this.field2220[var12]) {
                        if (arg0) {
                           arg3[var12] = arg5;
                        }

                        if (arg1) {
                           this.field2220[var12] = var14;
                        }
                     }

                     var14 += arg10;
                  }
               }

               ++var12;
               if (!arg1 || var14 < this.field2220[var12]) {
                  if (arg0) {
                     arg3[var12] = arg5;
                  }

                  if (arg1) {
                     this.field2220[var12] = var14;
                  }
               }

               float var15 = arg10 + var14;
               ++var12;
               if (!arg1 || var15 < this.field2220[var12]) {
                  if (arg0) {
                     arg3[var12] = arg5;
                  }

                  if (arg1) {
                     this.field2220[var12] = var15;
                  }
               }

               float var16 = arg10 + var15;
               ++var12;
               if (!arg1 || var16 < this.field2220[var12]) {
                  if (arg0) {
                     arg3[var12] = arg5;
                  }

                  if (arg1) {
                     this.field2220[var12] = var16;
                  }
               }

               float var17 = arg10 + var16;
               ++var12;
               if (!arg1 || var17 < this.field2220[var12]) {
                  if (arg0) {
                     arg3[var12] = arg5;
                  }

                  if (arg1) {
                     this.field2220[var12] = var17;
                  }
               }

               var14 = arg10 + var17;
            }
         } else if (this.field2213 != 254) {
            int var23 = this.field2213;
            int var24 = 256 - this.field2213;
            int var25 = ((arg5 & 16711935) * var24 >> 8 & 16711935) + ((arg5 & 65280) * var24 >> 8 & 65280);

            while(true) {
               --var13;
               if (var13 < 0) {
                  int var33 = arg8 - arg7 & 3;

                  while(true) {
                     --var33;
                     if (var33 < 0) {
                        return;
                     }

                     ++var12;
                     if (!arg1 || var14 < this.field2220[var12]) {
                        if (arg0) {
                           int var34 = arg3[var12];
                           if (arg2) {
                              arg3[var12] = (var24 | var34 >> 24) << 24 | ((var34 & 65280) * var23 >> 8 & 65280) + ((var34 & 16711935) * var23 >> 8 & 16711935) + var25;
                           } else {
                              arg3[var12] = ((var34 & 65280) * var23 >> 8 & 65280) + ((var34 & 16711935) * var23 >> 8 & 16711935) + var25;
                           }
                        }

                        if (arg1) {
                           this.field2220[var12] = var14;
                        }
                     }

                     var14 += arg10;
                  }
               }

               ++var12;
               if (!arg1 || var14 < this.field2220[var12]) {
                  if (arg0) {
                     int var26 = arg3[var12];
                     if (arg2) {
                        arg3[var12] = (var24 | var26 >> 24) << 24 | ((var26 & 65280) * var23 >> 8 & 65280) + ((var26 & 16711935) * var23 >> 8 & 16711935) + var25;
                     } else {
                        arg3[var12] = ((var26 & 65280) * var23 >> 8 & 65280) + ((var26 & 16711935) * var23 >> 8 & 16711935) + var25;
                     }
                  }

                  if (arg1) {
                     this.field2220[var12] = var14;
                  }
               }

               float var27 = arg10 + var14;
               ++var12;
               if (!arg1 || var27 < this.field2220[var12]) {
                  if (arg0) {
                     int var28 = arg3[var12];
                     if (arg2) {
                        arg3[var12] = (var24 | var28 >> 24) << 24 | ((var28 & 65280) * var23 >> 8 & 65280) + ((var28 & 16711935) * var23 >> 8 & 16711935) + var25;
                     } else {
                        arg3[var12] = ((var28 & 65280) * var23 >> 8 & 65280) + ((var28 & 16711935) * var23 >> 8 & 16711935) + var25;
                     }
                  }

                  if (arg1) {
                     this.field2220[var12] = var27;
                  }
               }

               float var29 = arg10 + var27;
               ++var12;
               if (!arg1 || var29 < this.field2220[var12]) {
                  if (arg0) {
                     int var30 = arg3[var12];
                     if (arg2) {
                        arg3[var12] = (var24 | var30 >> 24) << 24 | ((var30 & 65280) * var23 >> 8 & 65280) + ((var30 & 16711935) * var23 >> 8 & 16711935) + var25;
                     } else {
                        arg3[var12] = ((var30 & 65280) * var23 >> 8 & 65280) + ((var30 & 16711935) * var23 >> 8 & 16711935) + var25;
                     }
                  }

                  if (arg1) {
                     this.field2220[var12] = var29;
                  }
               }

               float var31 = arg10 + var29;
               ++var12;
               if (!arg1 || var31 < this.field2220[var12]) {
                  if (arg0) {
                     int var32 = arg3[var12];
                     if (arg2) {
                        arg3[var12] = (var24 | var32 >> 24) << 24 | ((var32 & 65280) * var23 >> 8 & 65280) + ((var32 & 16711935) * var23 >> 8 & 16711935) + var25;
                     } else {
                        arg3[var12] = ((var32 & 65280) * var23 >> 8 & 65280) + ((var32 & 16711935) * var23 >> 8 & 16711935) + var25;
                     }
                  }

                  if (arg1) {
                     this.field2220[var12] = var31;
                  }
               }

               var14 = arg10 + var31;
            }
         } else if (arg7 != 0 && arg8 <= this.field2225 * 824681839 - 1) {
            while(true) {
               --var13;
               if (var13 < 0) {
                  int var22 = arg8 - arg7 & 3;

                  while(true) {
                     --var22;
                     if (var22 < 0) {
                        return;
                     }

                     ++var12;
                     if ((!arg1 || var14 < this.field2220[var12]) && arg0) {
                        arg3[var12 - 1] = arg3[var12];
                     }

                     var14 += arg10;
                  }
               }

               ++var12;
               if ((!arg1 || var14 < this.field2220[var12]) && arg0) {
                  arg3[var12 - 1] = arg3[var12];
               }

               float var19 = arg10 + var14;
               ++var12;
               if ((!arg1 || var19 < this.field2220[var12]) && arg0) {
                  arg3[var12 - 1] = arg3[var12];
               }

               float var20 = arg10 + var19;
               ++var12;
               if ((!arg1 || var20 < this.field2220[var12]) && arg0) {
                  arg3[var12 - 1] = arg3[var12];
               }

               float var21 = arg10 + var20;
               ++var12;
               if ((!arg1 || var21 < this.field2220[var12]) && arg0) {
                  arg3[var12 - 1] = arg3[var12];
               }

               var14 = arg10 + var21;
            }
         }
      }
   }

   @deob.ObfuscatedName("bs.s(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFI)V")
   public final void method4230(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, int arg21, int arg22, int arg23, int arg24, float arg25, float arg26, float arg27, int arg28) {
      if (!arg0) {
         this.method4220(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
      } else {
         if (this.field2231 != arg28) {
            this.field2232 = this.field2211.method16807(arg28);
            if (this.field2232 == null) {
               this.field2213 = 255 - (arg21 >> 24 & 255);
               int var30 = Statics.field7263[Statics.method4006(this.field2211.method16833(arg28)) & 65535];
               int var31 = -16777216 | (arg21 >> 16 & 255) * (var30 >> 16 & 255) << 8 & 16711680 | (arg21 >> 8 & 255) * (var30 >> 8 & 255) & 65280 | (arg21 & 255) * (var30 & 255) >> 8;
               this.method4226(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, class789.method10708(var31, arg24, arg25), class789.method10708(var31, arg24, arg26), class789.method10708(var31, arg24, arg27));
               return;
            }

            this.field2227 = this.field2211.method16845(arg28);
            this.field2234 = this.field2227 - 1;
            this.field2236 = this.field2211.method16808(arg28);
            this.field2237 = this.field2211.method16809(arg28);
         }

         this.field2243 = arg24;
         if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
            if (arg4 <= arg5) {
               float var32 = arg6;
               arg6 = arg7;
               arg7 = var32;
               float var33 = arg3;
               arg3 = arg4;
               arg4 = var33;
               float var34 = arg9;
               arg9 = arg10;
               arg10 = var34;
               float var35 = arg15;
               arg15 = arg16;
               arg16 = var35;
               float var36 = arg18;
               arg18 = arg19;
               arg19 = var36;
               float var37 = arg12;
               arg12 = arg13;
               arg13 = var37;
               float var38 = arg25;
               arg25 = arg26;
               arg26 = var38;
               int var39 = arg21;
               arg21 = arg22;
               arg22 = var39;
            } else {
               float var40 = arg6;
               arg6 = arg8;
               arg8 = var40;
               float var41 = arg3;
               arg3 = arg5;
               arg5 = var41;
               float var42 = arg9;
               arg9 = arg11;
               arg11 = var42;
               float var43 = arg15;
               arg15 = arg17;
               arg17 = var43;
               float var44 = arg18;
               arg18 = arg20;
               arg20 = var44;
               float var45 = arg12;
               arg12 = arg14;
               arg14 = var45;
               float var46 = arg25;
               arg25 = arg27;
               arg27 = var46;
               int var47 = arg21;
               arg21 = arg23;
               arg23 = var47;
            }
         }

         float var48 = arg15 / arg12;
         float var49 = arg16 / arg13;
         float var50 = arg17 / arg14;
         float var51 = arg18 / arg12;
         float var52 = arg19 / arg13;
         float var53 = arg20 / arg14;
         float var54 = 1.0F / arg9;
         float var55 = 1.0F / arg10;
         float var56 = 1.0F / arg11;
         float var57 = 1.0F / arg12;
         float var58 = 1.0F / arg13;
         float var59 = 1.0F / arg14;
         float var60 = (float)(arg21 >> 24 & 255);
         float var61 = (float)(arg22 >> 24 & 255);
         float var62 = (float)(arg23 >> 24 & 255);
         float var63 = (float)(arg21 >> 16 & 255);
         float var64 = (float)(arg22 >> 16 & 255);
         float var65 = (float)(arg23 >> 16 & 255);
         float var66 = (float)(arg21 >> 8 & 255);
         float var67 = (float)(arg22 >> 8 & 255);
         float var68 = (float)(arg23 >> 8 & 255);
         float var69 = (float)(arg21 & 255);
         float var70 = (float)(arg22 & 255);
         float var71 = (float)(arg23 & 255);
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80 = 0.0F;
         float var81 = 0.0F;
         if (arg3 != arg4) {
            float var82 = arg4 - arg3;
            var72 = (arg7 - arg6) / var82;
            var73 = (var55 - var54) / var82;
            var74 = (var58 - var57) / var82;
            var75 = (var49 - var48) / var82;
            var76 = (var52 - var51) / var82;
            var77 = (arg26 - arg25) / var82;
            var78 = (var61 - var60) / var82;
            var79 = (var64 - var63) / var82;
            var80 = (var67 - var66) / var82;
            var81 = (var70 - var69) / var82;
         }

         float var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         if (arg4 != arg5) {
            float var93 = arg5 - arg4;
            var83 = (arg8 - arg7) / var93;
            var84 = (var56 - var55) / var93;
            var85 = (var59 - var58) / var93;
            var86 = (var50 - var49) / var93;
            var87 = (var53 - var52) / var93;
            var88 = (arg27 - arg26) / var93;
            var89 = (var62 - var61) / var93;
            var90 = (var65 - var64) / var93;
            var91 = (var68 - var67) / var93;
            var92 = (var71 - var70) / var93;
         }

         float var94 = 0.0F;
         float var95 = 0.0F;
         float var96 = 0.0F;
         float var97 = 0.0F;
         float var98 = 0.0F;
         float var99 = 0.0F;
         float var100 = 0.0F;
         float var101 = 0.0F;
         float var102 = 0.0F;
         float var103 = 0.0F;
         if (arg3 != arg5) {
            float var104 = arg3 - arg5;
            var94 = (arg6 - arg8) / var104;
            var95 = (var54 - var56) / var104;
            var96 = (var57 - var59) / var104;
            var97 = (var48 - var50) / var104;
            var98 = (var51 - var53) / var104;
            var99 = (arg25 - arg27) / var104;
            var100 = (var60 - var62) / var104;
            var101 = (var63 - var65) / var104;
            var102 = (var66 - var68) / var104;
            var103 = (var69 - var71) / var104;
         }

         if (!(arg3 >= (float)this.field2224)) {
            if (arg4 > (float)this.field2224) {
               arg4 = (float)this.field2224;
            }

            if (arg5 > (float)this.field2224) {
               arg5 = (float)this.field2224;
            }

            if (arg4 < arg5) {
               float var105 = arg6;
               float var106 = var54;
               float var107 = var57;
               float var108 = var48;
               float var109 = var51;
               float var110 = arg25;
               float var111 = var60;
               float var112 = var63;
               float var113 = var66;
               float var114 = var69;
               if (arg3 < 0.0F) {
                  arg6 -= arg3 * var72;
                  var105 -= arg3 * var94;
                  var54 -= arg3 * var73;
                  var106 -= arg3 * var95;
                  var57 -= arg3 * var74;
                  var107 -= arg3 * var96;
                  var48 -= arg3 * var75;
                  var108 -= arg3 * var97;
                  var51 -= arg3 * var76;
                  var109 -= arg3 * var98;
                  arg25 -= arg3 * var77;
                  var110 -= arg3 * var99;
                  var60 -= arg3 * var78;
                  var111 -= arg3 * var100;
                  var63 -= arg3 * var78;
                  var112 -= arg3 * var100;
                  var66 -= arg3 * var78;
                  var113 -= arg3 * var100;
                  var69 -= arg3 * var78;
                  var114 -= arg3 * var100;
                  arg3 = 0.0F;
               }

               if (arg4 < 0.0F) {
                  arg7 -= arg4 * var83;
                  var55 -= arg4 * var84;
                  var58 -= arg4 * var85;
                  var49 -= arg4 * var86;
                  var52 -= arg4 * var87;
                  arg26 -= arg4 * var88;
                  var61 -= arg4 * var89;
                  var64 -= arg4 * var90;
                  var67 -= arg4 * var91;
                  var70 -= arg4 * var92;
                  arg4 = 0.0F;
               }

               if ((arg3 == arg4 || !(var94 < var72)) && (arg3 != arg4 || !(var94 > var83))) {
                  float var120 = (float)((int)(arg3 + 0.5F));
                  float var121 = (float)((int)(arg4 + 0.5F));
                  float var122 = (float)((int)(arg5 + 0.5F)) - var121;
                  float var123 = var121 - var120;
                  float var124 = (float)this.field2216[(int)var120];

                  while(--var123 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var124, (int)arg6, (int)var105, var54, var106, var57, var107, var48, var108, var51, var109, arg25, var110, var60, var111, var63, var112, var66, var113, var69, var114);
                     arg6 += var72;
                     var105 += var94;
                     var54 += var73;
                     var106 += var95;
                     var57 += var74;
                     var107 += var96;
                     var48 += var75;
                     var108 += var97;
                     var51 += var76;
                     var109 += var98;
                     arg25 += var77;
                     var110 += var99;
                     var60 += var78;
                     var111 += var100;
                     var63 += var79;
                     var112 += var101;
                     var66 += var80;
                     var113 += var102;
                     var69 += var81;
                     var114 += var103;
                     var124 += (float)this.field2219;
                  }

                  while(--var122 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var124, (int)arg7, (int)var105, var55, var106, var58, var107, var49, var108, var52, var109, arg26, var110, var61, var111, var64, var112, var67, var113, var70, var114);
                     arg7 += var83;
                     var105 += var94;
                     var55 += var84;
                     var106 += var95;
                     var58 += var85;
                     var107 += var96;
                     var49 += var86;
                     var108 += var97;
                     var52 += var87;
                     var109 += var98;
                     arg26 += var88;
                     var110 += var99;
                     var61 += var89;
                     var111 += var100;
                     var64 += var90;
                     var112 += var101;
                     var67 += var91;
                     var113 += var102;
                     var70 += var92;
                     var114 += var103;
                     var124 += (float)this.field2219;
                  }
               } else {
                  float var115 = (float)((int)(arg3 + 0.5F));
                  float var116 = (float)((int)(arg4 + 0.5F));
                  float var117 = (float)((int)(arg5 + 0.5F)) - var116;
                  float var118 = var116 - var115;
                  float var119 = (float)this.field2216[(int)var115];

                  while(--var118 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var119, (int)var105, (int)arg6, var106, var54, var107, var57, var108, var48, var109, var51, var110, arg25, var111, var60, var112, var63, var113, var66, var114, var69);
                     arg6 += var72;
                     var105 += var94;
                     var54 += var73;
                     var106 += var95;
                     var57 += var74;
                     var107 += var96;
                     var48 += var75;
                     var108 += var97;
                     var51 += var76;
                     var109 += var98;
                     arg25 += var77;
                     var110 += var99;
                     var60 += var78;
                     var111 += var100;
                     var63 += var79;
                     var112 += var101;
                     var66 += var80;
                     var113 += var102;
                     var69 += var81;
                     var114 += var103;
                     var119 += (float)this.field2219;
                  }

                  while(--var117 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var119, (int)var105, (int)arg7, var106, var55, var107, var58, var108, var49, var109, var52, var110, arg26, var111, var61, var112, var64, var113, var67, var114, var70);
                     arg7 += var83;
                     var105 += var94;
                     var55 += var84;
                     var106 += var95;
                     var58 += var85;
                     var107 += var96;
                     var49 += var86;
                     var108 += var97;
                     var52 += var87;
                     var109 += var98;
                     arg26 += var88;
                     var110 += var99;
                     var61 += var89;
                     var111 += var100;
                     var64 += var90;
                     var112 += var101;
                     var67 += var91;
                     var113 += var102;
                     var70 += var92;
                     var114 += var103;
                     var119 += (float)this.field2219;
                  }
               }
            } else {
               float var125 = arg6;
               float var126 = var54;
               float var127 = var57;
               float var128 = var48;
               float var129 = var51;
               float var130 = arg25;
               float var131 = var60;
               float var132 = var63;
               float var133 = var66;
               float var134 = var69;
               if (arg3 < 0.0F) {
                  arg6 -= arg3 * var72;
                  var125 -= arg3 * var94;
                  var54 -= arg3 * var73;
                  var126 -= arg3 * var95;
                  var57 -= arg3 * var74;
                  var127 -= arg3 * var96;
                  var48 -= arg3 * var75;
                  var128 -= arg3 * var97;
                  var51 -= arg3 * var76;
                  var129 -= arg3 * var98;
                  arg25 -= arg3 * var77;
                  var130 -= arg3 * var99;
                  var60 -= arg3 * var78;
                  var131 -= arg3 * var100;
                  var63 -= arg3 * var78;
                  var132 -= arg3 * var100;
                  var66 -= arg3 * var78;
                  var133 -= arg3 * var100;
                  var69 -= arg3 * var78;
                  var134 -= arg3 * var100;
                  arg3 = 0.0F;
               }

               if (arg5 < 0.0F) {
                  arg8 -= arg5 * var83;
                  var56 -= arg5 * var84;
                  var59 -= arg5 * var85;
                  var50 -= arg5 * var86;
                  var53 -= arg5 * var87;
                  arg27 -= arg5 * var88;
                  var62 -= arg5 * var89;
                  var65 -= arg5 * var90;
                  var68 -= arg5 * var91;
                  var71 -= arg5 * var92;
                  arg5 = 0.0F;
               }

               if (arg3 != arg5 && var94 < var72 || arg3 == arg5 && var83 > var72) {
                  float var135 = (float)((int)(arg3 + 0.5F));
                  float var136 = (float)((int)(arg5 + 0.5F));
                  float var137 = (float)((int)(arg4 + 0.5F)) - var136;
                  float var138 = var136 - var135;
                  float var139 = (float)this.field2216[(int)var135];

                  while(--var138 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var139, (int)var125, (int)arg6, var126, var54, var127, var57, var128, var48, var129, var51, var130, arg25, var131, var60, var132, var63, var133, var66, var134, var69);
                     arg6 += var72;
                     var125 += var94;
                     var54 += var73;
                     var126 += var95;
                     var57 += var74;
                     var127 += var96;
                     var48 += var75;
                     var128 += var97;
                     var51 += var76;
                     var129 += var98;
                     arg25 += var77;
                     var130 += var99;
                     var60 += var78;
                     var131 += var100;
                     var63 += var79;
                     var132 += var101;
                     var66 += var80;
                     var133 += var102;
                     var69 += var81;
                     var134 += var103;
                     var139 += (float)this.field2219;
                  }

                  while(--var137 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var139, (int)arg8, (int)arg6, var56, var54, var59, var57, var50, var48, var53, var51, arg27, arg25, var62, var60, var65, var63, var68, var66, var71, var69);
                     arg8 += var83;
                     arg6 += var72;
                     var56 += var84;
                     var54 += var73;
                     var59 += var85;
                     var57 += var74;
                     var50 += var86;
                     var48 += var75;
                     var53 += var87;
                     var51 += var76;
                     arg27 += var88;
                     arg25 += var77;
                     var62 += var89;
                     var60 += var78;
                     var65 += var90;
                     var63 += var79;
                     var68 += var91;
                     var66 += var80;
                     var71 += var92;
                     var69 += var81;
                     var139 += (float)this.field2219;
                  }
               } else {
                  float var140 = (float)((int)(arg3 + 0.5F));
                  float var141 = (float)((int)(arg5 + 0.5F));
                  float var142 = (float)((int)(arg4 + 0.5F)) - var141;
                  float var143 = var141 - var140;
                  float var144 = (float)this.field2216[(int)var140];

                  while(--var143 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var144, (int)arg6, (int)var125, var54, var126, var57, var127, var48, var128, var51, var129, arg25, var130, var60, var131, var63, var132, var66, var133, var69, var134);
                     var125 += var94;
                     arg6 += var72;
                     var126 += var95;
                     var54 += var73;
                     var127 += var96;
                     var57 += var74;
                     var128 += var97;
                     var48 += var75;
                     var129 += var98;
                     var51 += var76;
                     var130 += var99;
                     arg25 += var77;
                     var131 += var100;
                     var60 += var78;
                     var132 += var101;
                     var63 += var79;
                     var133 += var102;
                     var66 += var80;
                     var134 += var103;
                     var69 += var81;
                     var144 += (float)this.field2219;
                  }

                  while(--var142 >= 0.0F) {
                     this.method4231(arg1, arg2, this.field2228, this.field2232, (int)var144, (int)arg6, (int)arg8, var54, var56, var57, var59, var48, var50, var51, var53, arg25, arg27, var60, var62, var63, var65, var66, var68, var69, var71);
                     arg6 += var72;
                     arg8 += var83;
                     var54 += var73;
                     var56 += var84;
                     var57 += var74;
                     var59 += var85;
                     var48 += var75;
                     var50 += var86;
                     var51 += var76;
                     var53 += var87;
                     arg25 += var77;
                     arg27 += var88;
                     var60 += var78;
                     var62 += var89;
                     var63 += var79;
                     var65 += var90;
                     var66 += var80;
                     var68 += var91;
                     var69 += var81;
                     var71 += var92;
                     var144 += (float)this.field2219;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("bs.l(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V")
   private final void method4231(boolean arg0, boolean arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, float arg21, float arg22, float arg23, float arg24) {
      int var26 = arg6 - arg5;
      float var27 = 1.0F / (float)var26;
      float var28 = (arg8 - arg7) * var27;
      float var29 = (arg10 - arg9) * var27;
      float var30 = (arg12 - arg11) * var27;
      float var31 = (arg14 - arg13) * var27;
      float var32 = (arg16 - arg15) * var27;
      float var33 = (arg18 - arg17) * var27;
      float var34 = (arg20 - arg19) * var27;
      float var35 = (arg22 - arg21) * var27;
      float var36 = (arg24 - arg23) * var27;
      if (this.field2238) {
         if (arg6 > this.field2225 * 824681839) {
            arg6 = this.field2225 * 824681839;
         }

         if (arg5 < 0) {
            arg7 -= (float)arg5 * var28;
            arg9 -= (float)arg5 * var29;
            arg11 -= (float)arg5 * var30;
            arg13 -= (float)arg5 * var31;
            arg15 -= (float)arg5 * var32;
            arg17 -= (float)arg5 * var33;
            arg19 -= (float)arg5 * var34;
            arg21 -= (float)arg5 * var35;
            arg23 -= (float)arg5 * var36;
            arg5 = 0;
         }
      }

      if (arg5 < arg6) {
         int var37 = arg6 - arg5;
         int var38 = arg4 + arg5;

         while(var37-- > 0) {
            float var39 = 1.0F / arg7;
            float var40 = 1.0F / arg9;
            if (!arg0 || var39 < this.field2220[var38]) {
               int var41 = (int)(arg11 * var40 * (float)this.field2227);
               if (this.field2237) {
                  var41 &= this.field2234;
               } else if (var41 < 0) {
                  var41 = 0;
               } else if (var41 > this.field2234) {
                  var41 = this.field2234;
               }

               int var42 = (int)(arg13 * var40 * (float)this.field2227);
               if (this.field2237) {
                  var42 &= this.field2234;
               } else if (var42 < 0) {
                  var42 = 0;
               } else if (var42 > this.field2234) {
                  var42 = this.field2234;
               }

               int var43 = this.field2232[this.field2227 * var42 + var41];
               boolean var44 = true;
               int var45;
               if (class725.field6684 == this.field2236) {
                  var45 = (int)((float)(var43 >> 24 & 255) * arg17 / 255.0F);
               } else if (class725.field6683 == this.field2236) {
                  var45 = var43 == 0 ? 0 : 255;
               } else {
                  var45 = (int)arg17;
               }

               if (var45 != 0) {
                  if (var45 != 255) {
                     int var46 = -16777216 | (int)((float)(var43 >> 16 & 255) * arg19) << 8 & 16711680 | (int)((float)(var43 >> 8 & 255) * arg21) & 65280 | (int)((float)(var43 & 255) * arg23) >> 8;
                     if (arg15 != 0.0F) {
                        int var47 = (int)(255.0F - arg15);
                        int var48 = ((this.field2243 & 16711935) * (int)arg15 & -16711936 | (this.field2243 & 65280) * (int)arg15 & 16711680) >>> 8;
                        var46 = (((var46 & 16711935) * var47 & -16711936 | (var46 & 65280) * var47 & 16711680) >>> 8) + var48;
                     }

                     int var49 = arg2[var38];
                     int var50 = 255 - var45;
                     int var51 = ((var46 & 16711935) * var45 + (var49 & 16711935) * var50 & -16711936) + ((var46 & 65280) * var45 + (var49 & 65280) * var50 & 16711680) >> 8;
                     if (arg1) {
                        arg2[var38] = (var45 | arg2[var38] >> 24) << 24 | var51;
                     } else {
                        arg2[var38] = var51;
                     }

                     if (arg0) {
                        this.field2220[var38] = var39;
                     }
                  } else {
                     int var52 = -16777216 | (int)((float)(var43 >> 16 & 255) * arg19) << 8 & 16711680 | (int)((float)(var43 >> 8 & 255) * arg21) & 65280 | (int)((float)(var43 & 255) * arg23) >> 8;
                     if (arg15 != 0.0F) {
                        int var53 = (int)(255.0F - arg15);
                        int var54 = ((this.field2243 & 16711935) * (int)arg15 & -16711936 | (this.field2243 & 65280) * (int)arg15 & 16711680) >>> 8;
                        var52 = (((var52 & 16711935) * var53 & -16711936 | (var52 & 65280) * var53 & 16711680) >>> 8) + var54;
                     }

                     if (arg1) {
                        arg2[var38] = var45 << 24 | var52;
                     } else {
                        arg2[var38] = var52;
                     }

                     if (arg0) {
                        this.field2220[var38] = var39;
                     }
                  }
               }
            }

            ++var38;
            arg7 += var28;
            arg9 += var29;
            arg11 += var30;
            arg13 += var31;
            arg15 += var32;
            arg17 += var33;
            arg19 += var34;
            arg21 += var35;
            arg23 += var36;
         }

      }
   }

   @deob.ObfuscatedName("bs.u(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIFIFIF)V")
   public final void method4232(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, int arg21, int arg22, int arg23, int arg24, float arg25, float arg26, float arg27, int arg28, float arg29, int arg30, float arg31, int arg32, float arg33) {
      if (!arg0) {
         this.method4220(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
      } else {
         this.field2243 = arg24;
         if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
            if (arg4 <= arg5) {
               float var35 = arg6;
               arg6 = arg7;
               arg7 = var35;
               float var36 = arg3;
               arg3 = arg4;
               arg4 = var36;
               float var37 = arg9;
               arg9 = arg10;
               arg10 = var37;
               float var38 = arg15;
               arg15 = arg16;
               arg16 = var38;
               float var39 = arg18;
               arg18 = arg19;
               arg19 = var39;
               float var40 = arg12;
               arg12 = arg13;
               arg13 = var40;
               float var41 = arg25;
               arg25 = arg26;
               arg26 = var41;
               float var42 = arg29;
               arg29 = arg31;
               arg31 = var42;
               int var43 = arg21;
               arg21 = arg22;
               arg22 = var43;
               int var44 = arg28;
               arg28 = arg30;
               arg30 = var44;
            } else {
               float var45 = arg6;
               arg6 = arg8;
               arg8 = var45;
               float var46 = arg3;
               arg3 = arg5;
               arg5 = var46;
               float var47 = arg9;
               arg9 = arg11;
               arg11 = var47;
               float var48 = arg15;
               arg15 = arg17;
               arg17 = var48;
               float var49 = arg18;
               arg18 = arg20;
               arg20 = var49;
               float var50 = arg12;
               arg12 = arg14;
               arg14 = var50;
               float var51 = arg25;
               arg25 = arg27;
               arg27 = var51;
               float var52 = arg29;
               arg29 = arg33;
               arg33 = var52;
               int var53 = arg21;
               arg21 = arg23;
               arg23 = var53;
               int var54 = arg28;
               arg28 = arg32;
               arg32 = var54;
            }
         }

         if (this.field2231 != arg28) {
            this.field2232 = this.field2211.method16807(arg28);
            if (this.field2232 == null) {
               this.field2213 = 255 - (arg21 >> 24 & 255);
               int var55 = Statics.field7263[Statics.method4006(this.field2211.method16833(arg28)) & 65535];
               int var56 = -16777216 | (arg21 >> 16 & 255) * (var55 >> 16 & 255) << 8 & 16711680 | (arg21 >> 8 & 255) * (var55 >> 8 & 255) & 65280 | (arg21 & 255) * (var55 & 255) >> 8;
               this.method4226(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, class789.method10708(var56, arg24, arg25), class789.method10708(var56, arg24, arg26), class789.method10708(var56, arg24, arg27));
               return;
            }

            this.field2227 = this.field2211.method16845(arg28);
            this.field2234 = this.field2227 - 1;
            this.field2236 = this.field2211.method16808(arg28);
         }

         this.field2235 = arg29;
         if (this.field2240 != arg30) {
            this.field2239 = this.field2211.method16807(arg30);
            if (this.field2239 == null) {
               this.field2213 = 255 - (arg21 >> 24 & 255);
               int var57 = Statics.field7263[Statics.method4006(this.field2211.method16833(arg30)) & 65535];
               int var58 = -16777216 | (arg21 >> 16 & 255) * (var57 >> 16 & 255) << 8 & 16711680 | (arg21 >> 8 & 255) * (var57 >> 8 & 255) & 65280 | (arg21 & 255) * (var57 & 255) >> 8;
               this.method4226(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, class789.method10708(var58, arg24, arg25), class789.method10708(var58, arg24, arg26), class789.method10708(var58, arg24, arg27));
               return;
            }

            this.field2241 = this.field2211.method16845(arg30);
            this.field2222 = this.field2241 - 1;
         }

         this.field2242 = arg31;
         if (this.field2223 != arg32) {
            this.field2244 = this.field2211.method16807(arg32);
            if (this.field2244 == null) {
               this.field2213 = 255 - (arg21 >> 24 & 255);
               int var59 = Statics.field7263[Statics.method4006(this.field2211.method16833(arg32)) & 65535];
               int var60 = -16777216 | (arg21 >> 16 & 255) * (var59 >> 16 & 255) << 8 & 16711680 | (arg21 >> 8 & 255) * (var59 >> 8 & 255) & 65280 | (arg21 & 255) * (var59 & 255) >> 8;
               this.method4226(true, arg1, arg2, (float)((int)arg3), (float)((int)arg4), (float)((int)arg5), (float)((int)arg6), (float)((int)arg7), (float)((int)arg8), (float)((int)arg9), (float)((int)arg10), (float)((int)arg11), class789.method10708(var60, arg24, arg25), class789.method10708(var60, arg24, arg26), class789.method10708(var60, arg24, arg27));
               return;
            }

            this.field2245 = this.field2211.method16845(arg32);
            this.field2246 = this.field2245 - 1;
         }

         this.field2247 = arg33;
         float var61 = arg15 / arg12;
         float var62 = arg16 / arg13;
         float var63 = arg17 / arg14;
         float var64 = arg18 / arg12;
         float var65 = arg19 / arg13;
         float var66 = arg20 / arg14;
         float var67 = 1.0F / arg9;
         float var68 = 1.0F / arg10;
         float var69 = 1.0F / arg11;
         float var70 = 1.0F / arg12;
         float var71 = 1.0F / arg13;
         float var72 = 1.0F / arg14;
         float var73 = (float)(arg21 >> 24 & 255);
         float var74 = (float)(arg22 >> 24 & 255);
         float var75 = (float)(arg23 >> 24 & 255);
         float var76 = (float)(arg21 >> 16 & 255);
         float var77 = (float)(arg22 >> 16 & 255);
         float var78 = (float)(arg23 >> 16 & 255);
         float var79 = (float)(arg21 >> 8 & 255);
         float var80 = (float)(arg22 >> 8 & 255);
         float var81 = (float)(arg23 >> 8 & 255);
         float var82 = (float)(arg21 & 255);
         float var83 = (float)(arg22 & 255);
         float var84 = (float)(arg23 & 255);
         float var85 = 1.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 1.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         float var95 = 0.0F;
         float var96 = 0.0F;
         float var97 = 0.0F;
         float var98 = 0.0F;
         float var99 = 0.0F;
         float var100 = 0.0F;
         float var101 = 0.0F;
         float var102 = 0.0F;
         if (arg3 != arg4) {
            float var103 = arg4 - arg3;
            var91 = (arg7 - arg6) / var103;
            var92 = (var68 - var67) / var103;
            var93 = (var71 - var70) / var103;
            var94 = (var62 - var61) / var103;
            var95 = (var65 - var64) / var103;
            var96 = (arg26 - arg25) / var103;
            var97 = (var74 - var73) / var103;
            var98 = (var77 - var76) / var103;
            var99 = (var80 - var79) / var103;
            var100 = (var83 - var82) / var103;
            var101 = (var86 - var85) / var103;
            var102 = (var89 - var88) / var103;
         }

         float var104 = 0.0F;
         float var105 = 0.0F;
         float var106 = 0.0F;
         float var107 = 0.0F;
         float var108 = 0.0F;
         float var109 = 0.0F;
         float var110 = 0.0F;
         float var111 = 0.0F;
         float var112 = 0.0F;
         float var113 = 0.0F;
         float var114 = 0.0F;
         float var115 = 0.0F;
         if (arg4 != arg5) {
            float var116 = arg5 - arg4;
            var104 = (arg8 - arg7) / var116;
            var105 = (var69 - var68) / var116;
            var106 = (var72 - var71) / var116;
            var107 = (var63 - var62) / var116;
            var108 = (var66 - var65) / var116;
            var109 = (arg27 - arg26) / var116;
            var110 = (var75 - var74) / var116;
            var111 = (var78 - var77) / var116;
            var112 = (var81 - var80) / var116;
            var113 = (var84 - var83) / var116;
            var114 = (var87 - var86) / var116;
            var115 = (var90 - var89) / var116;
         }

         float var117 = 0.0F;
         float var118 = 0.0F;
         float var119 = 0.0F;
         float var120 = 0.0F;
         float var121 = 0.0F;
         float var122 = 0.0F;
         float var123 = 0.0F;
         float var124 = 0.0F;
         float var125 = 0.0F;
         float var126 = 0.0F;
         float var127 = 0.0F;
         float var128 = 0.0F;
         if (arg3 != arg5) {
            float var129 = arg3 - arg5;
            var117 = (arg6 - arg8) / var129;
            var118 = (var67 - var69) / var129;
            var119 = (var70 - var72) / var129;
            var120 = (var61 - var63) / var129;
            var121 = (var64 - var66) / var129;
            var122 = (arg25 - arg27) / var129;
            var123 = (var73 - var75) / var129;
            var124 = (var76 - var78) / var129;
            var125 = (var79 - var81) / var129;
            var126 = (var82 - var84) / var129;
            var127 = (var85 - var87) / var129;
            var128 = (var88 - var90) / var129;
         }

         if (!(arg3 >= (float)this.field2224)) {
            if (arg4 > (float)this.field2224) {
               arg4 = (float)this.field2224;
            }

            if (arg5 > (float)this.field2224) {
               arg5 = (float)this.field2224;
            }

            if (arg4 < arg5) {
               float var130 = arg6;
               float var131 = var67;
               float var132 = var70;
               float var133 = var61;
               float var134 = var64;
               float var135 = arg25;
               float var136 = var73;
               float var137 = var76;
               float var138 = var79;
               float var139 = var82;
               float var140 = var85;
               float var141 = var88;
               if (arg3 < 0.0F) {
                  arg6 -= arg3 * var91;
                  var130 -= arg3 * var117;
                  var67 -= arg3 * var92;
                  var131 -= arg3 * var118;
                  var70 -= arg3 * var93;
                  var132 -= arg3 * var119;
                  var61 -= arg3 * var94;
                  var133 -= arg3 * var120;
                  var64 -= arg3 * var95;
                  var134 -= arg3 * var121;
                  arg25 -= arg3 * var96;
                  var135 -= arg3 * var122;
                  var73 -= arg3 * var97;
                  var136 -= arg3 * var123;
                  var76 -= arg3 * var98;
                  var137 -= arg3 * var124;
                  var79 -= arg3 * var99;
                  var138 -= arg3 * var125;
                  var82 -= arg3 * var100;
                  var139 -= arg3 * var126;
                  var85 -= arg3 * var101;
                  var140 -= arg3 * var127;
                  var88 -= arg3 * var102;
                  var141 -= arg3 * var128;
                  arg3 = 0.0F;
               }

               if (arg4 < 0.0F) {
                  arg7 -= arg4 * var104;
                  var68 -= arg4 * var105;
                  var71 -= arg4 * var106;
                  var62 -= arg4 * var107;
                  var65 -= arg4 * var108;
                  arg26 -= arg4 * var109;
                  var74 -= arg4 * var110;
                  var77 -= arg4 * var111;
                  var80 -= arg4 * var112;
                  var83 -= arg4 * var113;
                  var86 -= arg4 * var114;
                  var89 -= arg4 * var115;
                  arg4 = 0.0F;
               }

               if (arg3 != arg4 && var117 < var91 || arg3 == arg4 && var117 > var104) {
                  float var142 = (float)((int)(arg3 + 0.5F));
                  float var143 = (float)((int)(arg4 + 0.5F));
                  float var144 = (float)((int)(arg5 + 0.5F)) - var143;
                  float var145 = var143 - var142;
                  float var146 = (float)this.field2216[(int)var142];

                  while(--var145 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var146, (int)var130, (int)arg6, var131, var67, var132, var70, var133, var61, var134, var64, var135, arg25, var136, var73, var137, var76, var138, var79, var139, var82, var140, var85, var141, var88);
                     arg6 += var91;
                     var130 += var117;
                     var67 += var92;
                     var131 += var118;
                     var70 += var93;
                     var132 += var119;
                     var61 += var94;
                     var133 += var120;
                     var64 += var95;
                     var134 += var121;
                     arg25 += var96;
                     var135 += var122;
                     var73 += var97;
                     var136 += var123;
                     var76 += var98;
                     var137 += var124;
                     var79 += var99;
                     var138 += var125;
                     var82 += var100;
                     var139 += var126;
                     var85 += var101;
                     var140 += var127;
                     var88 += var102;
                     var141 += var128;
                     var146 += (float)this.field2219;
                  }

                  while(--var144 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var146, (int)var130, (int)arg7, var131, var68, var132, var71, var133, var62, var134, var65, var135, arg26, var136, var74, var137, var77, var138, var80, var139, var83, var140, var86, var141, var89);
                     arg7 += var104;
                     var130 += var117;
                     var68 += var105;
                     var131 += var118;
                     var71 += var106;
                     var132 += var119;
                     var62 += var107;
                     var133 += var120;
                     var65 += var108;
                     var134 += var121;
                     arg26 += var109;
                     var135 += var122;
                     var74 += var110;
                     var136 += var123;
                     var77 += var111;
                     var137 += var124;
                     var80 += var112;
                     var138 += var125;
                     var83 += var113;
                     var139 += var126;
                     var86 += var114;
                     var140 += var127;
                     var89 += var115;
                     var141 += var128;
                     var146 += (float)this.field2219;
                  }
               } else {
                  float var147 = (float)((int)(arg3 + 0.5F));
                  float var148 = (float)((int)(arg4 + 0.5F));
                  float var149 = (float)((int)(arg5 + 0.5F)) - var148;
                  float var150 = var148 - var147;
                  float var151 = (float)this.field2216[(int)var147];

                  while(--var150 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var151, (int)arg6, (int)var130, var67, var131, var70, var132, var61, var133, var64, var134, arg25, var135, var73, var136, var76, var137, var79, var138, var82, var139, var85, var140, var88, var141);
                     arg6 += var91;
                     var130 += var117;
                     var67 += var92;
                     var131 += var118;
                     var70 += var93;
                     var132 += var119;
                     var61 += var94;
                     var133 += var120;
                     var64 += var95;
                     var134 += var121;
                     arg25 += var96;
                     var135 += var122;
                     var73 += var97;
                     var136 += var123;
                     var76 += var98;
                     var137 += var124;
                     var79 += var99;
                     var138 += var125;
                     var82 += var100;
                     var139 += var126;
                     var85 += var101;
                     var140 += var127;
                     var88 += var102;
                     var141 += var128;
                     var151 += (float)this.field2219;
                  }

                  while(--var149 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var151, (int)arg7, (int)var130, var68, var131, var71, var132, var62, var133, var65, var134, arg26, var135, var74, var136, var77, var137, var80, var138, var83, var139, var86, var140, var89, var141);
                     arg7 += var104;
                     var130 += var117;
                     var68 += var105;
                     var131 += var118;
                     var71 += var106;
                     var132 += var119;
                     var62 += var107;
                     var133 += var120;
                     var65 += var108;
                     var134 += var121;
                     arg26 += var109;
                     var135 += var122;
                     var74 += var110;
                     var136 += var123;
                     var77 += var111;
                     var137 += var124;
                     var80 += var112;
                     var138 += var125;
                     var83 += var113;
                     var139 += var126;
                     var86 += var114;
                     var140 += var127;
                     var89 += var115;
                     var141 += var128;
                     var151 += (float)this.field2219;
                  }
               }
            } else {
               float var152 = arg6;
               float var153 = var67;
               float var154 = var70;
               float var155 = var61;
               float var156 = var64;
               float var157 = arg25;
               float var158 = var73;
               float var159 = var76;
               float var160 = var79;
               float var161 = var82;
               float var162 = var85;
               float var163 = var88;
               if (arg3 < 0.0F) {
                  arg6 -= arg3 * var91;
                  var152 -= arg3 * var117;
                  var67 -= arg3 * var92;
                  var153 -= arg3 * var118;
                  var70 -= arg3 * var93;
                  var154 -= arg3 * var119;
                  var61 -= arg3 * var94;
                  var155 -= arg3 * var120;
                  var64 -= arg3 * var95;
                  var156 -= arg3 * var121;
                  arg25 -= arg3 * var96;
                  var157 -= arg3 * var122;
                  var73 -= arg3 * var97;
                  var158 -= arg3 * var123;
                  var76 -= arg3 * var98;
                  var159 -= arg3 * var124;
                  var79 -= arg3 * var99;
                  var160 -= arg3 * var125;
                  var82 -= arg3 * var100;
                  var161 -= arg3 * var126;
                  var85 -= arg3 * var101;
                  var162 -= arg3 * var127;
                  var88 -= arg3 * var102;
                  var163 -= arg3 * var128;
                  arg3 = 0.0F;
               }

               if (arg5 < 0.0F) {
                  arg8 -= arg5 * var104;
                  var69 -= arg5 * var105;
                  var72 -= arg5 * var106;
                  var63 -= arg5 * var107;
                  var66 -= arg5 * var108;
                  arg27 -= arg5 * var109;
                  var75 -= arg5 * var110;
                  var78 -= arg5 * var111;
                  var81 -= arg5 * var112;
                  var84 -= arg5 * var113;
                  var87 -= arg5 * var114;
                  var90 -= arg5 * var115;
                  arg5 = 0.0F;
               }

               if (arg3 != arg5 && var117 < var91 || arg3 == arg5 && var104 > var91) {
                  float var164 = (float)((int)(arg3 + 0.5F));
                  float var165 = (float)((int)(arg5 + 0.5F));
                  float var166 = (float)((int)(arg4 + 0.5F)) - var165;
                  float var167 = var165 - var164;
                  float var168 = (float)this.field2216[(int)var164];

                  while(--var167 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var168, (int)var152, (int)arg6, var153, var67, var154, var70, var155, var61, var156, var64, var157, arg25, var158, var73, var159, var76, var160, var79, var161, var82, var162, var85, var163, var88);
                     arg6 += var91;
                     var152 += var117;
                     var67 += var92;
                     var153 += var118;
                     var70 += var93;
                     var154 += var119;
                     var61 += var94;
                     var155 += var120;
                     var64 += var95;
                     var156 += var121;
                     arg25 += var96;
                     var157 += var122;
                     var73 += var97;
                     var158 += var123;
                     var76 += var98;
                     var159 += var124;
                     var79 += var99;
                     var160 += var125;
                     var82 += var100;
                     var161 += var126;
                     var85 += var101;
                     var162 += var127;
                     var88 += var102;
                     var163 += var128;
                     var168 += (float)this.field2219;
                  }

                  while(--var166 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var168, (int)arg8, (int)arg6, var69, var67, var72, var70, var63, var61, var66, var64, arg27, arg25, var75, var73, var78, var76, var81, var79, var84, var82, var87, var85, var90, var88);
                     arg8 += var104;
                     arg6 += var91;
                     var69 += var105;
                     var67 += var92;
                     var72 += var106;
                     var70 += var93;
                     var63 += var107;
                     var61 += var94;
                     var66 += var108;
                     var64 += var95;
                     arg27 += var109;
                     arg25 += var96;
                     var75 += var110;
                     var73 += var97;
                     var78 += var111;
                     var76 += var98;
                     var81 += var112;
                     var79 += var99;
                     var84 += var113;
                     var82 += var100;
                     var87 += var114;
                     var85 += var101;
                     var90 += var115;
                     var88 += var102;
                     var168 += (float)this.field2219;
                  }
               } else {
                  float var169 = (float)((int)(arg3 + 0.5F));
                  float var170 = (float)((int)(arg5 + 0.5F));
                  float var171 = (float)((int)(arg4 + 0.5F)) - var170;
                  float var172 = var170 - var169;
                  float var173 = (float)this.field2216[(int)var169];

                  while(--var172 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var173, (int)arg6, (int)var152, var67, var153, var70, var154, var61, var155, var64, var156, arg25, var157, var73, var158, var76, var159, var79, var160, var82, var161, var85, var162, var88, var163);
                     var152 += var117;
                     arg6 += var91;
                     var153 += var118;
                     var67 += var92;
                     var154 += var119;
                     var70 += var93;
                     var155 += var120;
                     var61 += var94;
                     var156 += var121;
                     var64 += var95;
                     var157 += var122;
                     arg25 += var96;
                     var158 += var123;
                     var73 += var97;
                     var159 += var124;
                     var76 += var98;
                     var160 += var125;
                     var79 += var99;
                     var161 += var126;
                     var82 += var100;
                     var162 += var127;
                     var85 += var101;
                     var163 += var128;
                     var88 += var102;
                     var173 += (float)this.field2219;
                  }

                  while(--var171 >= 0.0F) {
                     this.method4233(arg1, arg2, this.field2228, (int)var173, (int)arg6, (int)arg8, var67, var69, var70, var72, var61, var63, var64, var66, arg25, arg27, var73, var75, var76, var78, var79, var81, var82, var84, var85, var87, var88, var90);
                     arg6 += var91;
                     arg8 += var104;
                     var67 += var92;
                     var69 += var105;
                     var70 += var93;
                     var72 += var106;
                     var61 += var94;
                     var63 += var107;
                     var64 += var95;
                     var66 += var108;
                     arg25 += var96;
                     arg27 += var109;
                     var73 += var97;
                     var75 += var110;
                     var76 += var98;
                     var78 += var111;
                     var79 += var99;
                     var81 += var112;
                     var82 += var100;
                     var84 += var113;
                     var85 += var101;
                     var87 += var114;
                     var88 += var102;
                     var90 += var115;
                     var173 += (float)this.field2219;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("bs.v(ZZ[IIIIFFFFFFFFFFFFFFFFFFFFFF)V")
   private final void method4233(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, float arg21, float arg22, float arg23, float arg24, float arg25, float arg26, float arg27) {
      int var29 = arg5 - arg4;
      float var30 = 1.0F / (float)var29;
      float var31 = (arg7 - arg6) * var30;
      float var32 = (arg9 - arg8) * var30;
      float var33 = (arg11 - arg10) * var30;
      float var34 = (arg13 - arg12) * var30;
      float var35 = (arg15 - arg14) * var30;
      float var36 = (arg17 - arg16) * var30;
      float var37 = (arg19 - arg18) * var30;
      float var38 = (arg21 - arg20) * var30;
      float var39 = (arg23 - arg22) * var30;
      float var40 = (arg25 - arg24) * var30;
      float var41 = (arg27 - arg26) * var30;
      if (this.field2238) {
         if (arg5 > this.field2225 * 824681839) {
            arg5 = this.field2225 * 824681839;
         }

         if (arg4 < 0) {
            arg6 -= (float)arg4 * var31;
            arg8 -= (float)arg4 * var32;
            arg10 -= (float)arg4 * var33;
            arg12 -= (float)arg4 * var34;
            arg14 -= (float)arg4 * var35;
            arg16 -= (float)arg4 * var36;
            arg18 -= (float)arg4 * var37;
            arg20 -= (float)arg4 * var38;
            arg22 -= (float)arg4 * var39;
            arg24 -= (float)arg4 * var40;
            arg26 -= (float)arg4 * var41;
            arg4 = 0;
         }
      }

      if (arg4 < arg5) {
         int var42 = arg5 - arg4;
         int var43 = arg3 + arg4;

         while(var42-- > 0) {
            float var44 = 1.0F / arg6;
            float var45 = 1.0F / arg8;
            if (!arg0 || var44 < this.field2220[var43]) {
               float var46 = arg10 * var45;
               float var47 = arg12 * var45;
               int var48 = (int)((float)this.field2227 * var46 * this.field2235) & this.field2234;
               int var49 = (int)((float)this.field2227 * var47 * this.field2235) & this.field2234;
               int var50 = this.field2232[this.field2227 * var49 + var48];
               int var51 = (int)((float)this.field2241 * var46 * this.field2242) & this.field2222;
               int var52 = (int)((float)this.field2241 * var47 * this.field2242) & this.field2222;
               int var53 = this.field2239[this.field2241 * var52 + var51];
               int var54 = (int)((float)this.field2245 * var46 * this.field2247) & this.field2246;
               int var55 = (int)((float)this.field2245 * var47 * this.field2247) & this.field2246;
               int var56 = this.field2244[this.field2245 * var55 + var54];
               float var57 = 1.0F - (arg24 + arg26);
               int var58 = -16777216 | (int)((float)(var50 >> 16 & 255) * arg24) << 16 | (int)((float)(var50 >> 8 & 255) * arg24) << 8 | (int)((float)(var50 & 255) * arg24);
               int var59 = -16777216 | (int)((float)(var53 >> 16 & 255) * arg26) << 16 | (int)((float)(var53 >> 8 & 255) * arg26) << 8 | (int)((float)(var53 & 255) * arg26);
               int var60 = -16777216 | (int)((float)(var56 >> 16 & 255) * var57) << 16 | (int)((float)(var56 >> 8 & 255) * var57) << 8 | (int)((float)(var56 & 255) * var57);
               int var61 = var58 + var59 + var60;
               int var62 = -16777216 | (int)((float)(var61 >> 16 & 255) * arg18) << 8 & 16711680 | (int)((float)(var61 >> 8 & 255) * arg20) & 65280 | (int)((float)(var61 & 255) * arg22) >> 8;
               if (arg14 != 0.0F) {
                  int var63 = (int)(255.0F - arg14);
                  int var64 = ((this.field2243 & 16711935) * (int)arg14 & -16711936 | (this.field2243 & 65280) * (int)arg14 & 16711680) >>> 8;
                  var62 = (((var62 & 16711935) * var63 & -16711936 | (var62 & 65280) * var63 & 16711680) >>> 8) + var64;
               }

               if (arg1) {
                  arg2[var43] = ((int)arg16 | arg2[var43] >> 24) << 24 | var62;
               } else {
                  arg2[var43] = var62;
               }

               if (arg0) {
                  this.field2220[var43] = var44;
               }
            }

            ++var43;
            arg6 += var31;
            arg8 += var32;
            arg10 += var33;
            arg12 += var34;
            arg14 += var35;
            arg16 += var36;
            arg18 += var37;
            arg20 += var38;
            arg22 += var39;
            arg24 += var40;
            arg26 += var41;
         }

      }
   }
}
