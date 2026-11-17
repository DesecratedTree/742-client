import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@deob.ObfuscatedName("yp")
public class class976 extends class934 {
   @deob.ObfuscatedName("yp.j")
   private class849 field9897 = new class849();
   @deob.ObfuscatedName("yp.a")
   public final class983 field9886;
   @deob.ObfuscatedName("yp.x")
   private int field9887;
   @deob.ObfuscatedName("yp.s")
   private int field9910;
   @deob.ObfuscatedName("yp.l")
   private int field9894;
   @deob.ObfuscatedName("yp.u")
   public final int field9890;
   @deob.ObfuscatedName("yp.c")
   private int[][][] field9884;
   @deob.ObfuscatedName("yp.e")
   private class65[][][] field9903;
   @deob.ObfuscatedName("yp.i")
   public int[][][] field9915;
   @deob.ObfuscatedName("yp.t")
   public int[][][] field9885;
   @deob.ObfuscatedName("yp.z")
   public int[][][] field9900;
   @deob.ObfuscatedName("yp.m")
   private int[][][] field9896;
   @deob.ObfuscatedName("yp.h")
   public short[][] field9893;
   @deob.ObfuscatedName("yp.q")
   private byte[][] field9889;
   @deob.ObfuscatedName("yp.aw")
   private byte[][] field9912;
   @deob.ObfuscatedName("yp.al")
   private float[][] field9913;
   @deob.ObfuscatedName("yp.an")
   private float[][] field9914;
   @deob.ObfuscatedName("yp.ag")
   private float[][] field9901;
   @deob.ObfuscatedName("yp.ak")
   private class875 field9916;
   @deob.ObfuscatedName("yp.y")
   private class371 field9895;
   @deob.ObfuscatedName("yp.aa")
   private static final float[] field9917 = new float[16];
   @deob.ObfuscatedName("yp.v")
   private int field9891;
   @deob.ObfuscatedName("yp.ah")
   private int field9892;
   @deob.ObfuscatedName("yp.g")
   private int field9899;
   @deob.ObfuscatedName("yp.at")
   private int field9902;
   @deob.ObfuscatedName("yp.ap")
   public class340 field9906;
   @deob.ObfuscatedName("yp.av")
   private class340 field9907;
   @deob.ObfuscatedName("yp.ax")
   public class340 field9908;
   @deob.ObfuscatedName("yp.af")
   public class340 field9909;
   @deob.ObfuscatedName("yp.ai")
   private class341 field9905;
   @deob.ObfuscatedName("yp.f")
   private class674[] field9904;
   @deob.ObfuscatedName("yp.w")
   private int[][][] field9888;

   public class976(class983 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field9886 = arg0;
      this.field9887 = this.field9464 - 2;
      this.field9910 = 1 << this.field9887;
      this.field9894 = arg1;
      this.field9890 = arg2;
      this.field9884 = new int[arg3][arg4][];
      this.field9903 = new class65[arg3][arg4][];
      this.field9915 = new int[arg3][arg4][];
      this.field9885 = new int[arg3][arg4][];
      this.field9900 = new int[arg3][arg4][];
      this.field9896 = new int[arg3][arg4][];
      this.field9893 = new short[arg3 * arg4][];
      this.field9889 = new byte[arg3][arg4];
      this.field9912 = new byte[arg3 + 1][arg4 + 1];
      this.field9913 = new float[this.field9463 + 1][this.field9461 + 1];
      this.field9914 = new float[this.field9463 + 1][this.field9461 + 1];
      this.field9901 = new float[this.field9463 + 1][this.field9461 + 1];

      for(int var9 = 1; var9 < this.field9461; ++var9) {
         for(int var10 = 1; var10 < this.field9463; ++var10) {
            int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
            int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
            float var13 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
            this.field9913[var10][var9] = (float)var11 * var13;
            this.field9914[var10][var9] = (float)(-arg7 * 2) * var13;
            this.field9901[var10][var9] = (float)var12 * var13;
         }
      }

      this.field9916 = new class875(128);
      if ((this.field9890 & 16) != 0) {
         this.field9895 = new class371(this.field9886, this);
      }

   }

   @deob.ObfuscatedName("yp.LA(III)V")
   public void method7246(int arg0, int arg1, int arg2) {
      if ((this.field9912[arg0][arg1] & 255) < arg2) {
         this.field9912[arg0][arg1] = (byte)arg2;
      }

   }

   @deob.ObfuscatedName("yp.n(II[I[I[I[I[I[I[I[ILdq;Z)V")
   public void method7247(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class402 arg10, boolean arg11) {
      class637 var13 = this.field9886.field7118;
      if (arg5 != null && this.field9888 == null) {
         this.field9888 = new int[this.field9463][this.field9461][];
      }

      if (arg3 != null && this.field9884 == null) {
         this.field9884 = new int[this.field9463][this.field9461][];
      }

      this.field9915[arg0][arg1] = arg2;
      this.field9885[arg0][arg1] = arg4;
      this.field9900[arg0][arg1] = arg6;
      this.field9896[arg0][arg1] = arg7;
      if (this.field9888 != null) {
         this.field9888[arg0][arg1] = arg5;
      }

      if (this.field9884 != null) {
         this.field9884[arg0][arg1] = arg3;
      }

      class65[] var14 = this.field9903[arg0][arg1] = new class65[arg6.length];

      for(int var15 = 0; var15 < arg6.length; ++var15) {
         int var16 = arg8[var15];
         int var17 = arg9[var15];
         if ((this.field9890 & 32) != 0 && var16 != -1 && var13.method5112(var16).field2331) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)arg10.field2962 << 48 | (long)arg10.field2964 << 42 | (long)arg10.field2965 << 28 | (long)(var17 << 14) | (long)var16;

         class674 var20;
         for(var20 = this.field9916.method15322(var18); var20 != null; var20 = this.field9916.method15308()) {
            class65 var21 = (class65)var20;
            if (var21.field461 == var16 && (float)var17 == var21.field459 && var21.field463.method5508(arg10)) {
               break;
            }
         }

         if (var20 == null) {
            var14[var15] = new class65(this, var16, var17, arg10);
            this.field9916.method15311(var14[var15], var18);
         } else {
            var14[var15] = (class65)var20;
         }
      }

      if (arg11) {
         this.field9889[arg0][arg1] = (byte)(this.field9889[arg0][arg1] | 1);
      }

      if (arg6.length > this.field9892) {
         this.field9892 = arg6.length;
      }

      this.field9902 += arg6.length;
   }

   @deob.ObfuscatedName("yp.k(II[I[I[I[I[I[I[I[I[I[I[ILdq;Z)V")
   public void method7250(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class402 arg13, boolean arg14) {
      int var16 = arg9.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = arg10 != null ? new int[var16 * 3] : null;
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = arg3 != null ? new int[var16 * 3] : null;
      int[] var24 = arg5 != null ? new int[var16 * 3] : null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = arg6[var26];
         int var28 = arg7[var26];
         int var29 = arg8[var26];
         var17[var25] = arg2[var27];
         var18[var25] = arg4[var27];
         var19[var25] = arg9[var26];
         var21[var25] = arg11[var26];
         var22[var25] = arg12[var26];
         if (arg10 != null) {
            var20[var25] = arg10[var26];
         }

         if (arg3 != null) {
            var23[var25] = arg3[var27];
         }

         if (arg5 != null) {
            var24[var25] = arg5[var27];
         }

         ++var25;
         var17[var25] = arg2[var28];
         var18[var25] = arg4[var28];
         var19[var25] = arg9[var26];
         var21[var25] = arg11[var26];
         var22[var25] = arg12[var26];
         if (arg10 != null) {
            var20[var25] = arg10[var26];
         }

         if (arg3 != null) {
            var23[var25] = arg3[var28];
         }

         if (arg5 != null) {
            var24[var25] = arg5[var28];
         }

         ++var25;
         var17[var25] = arg2[var29];
         var18[var25] = arg4[var29];
         var19[var25] = arg9[var26];
         var21[var25] = arg11[var26];
         var22[var25] = arg12[var26];
         if (arg10 != null) {
            var20[var25] = arg10[var26];
         }

         if (arg3 != null) {
            var23[var25] = arg3[var29];
         }

         if (arg5 != null) {
            var24[var25] = arg5[var29];
         }

         ++var25;
      }

      this.method7247(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
   }

   @deob.ObfuscatedName("yp.SA()V")
   public void method7249() {
      if (this.field9902 > 0) {
         byte[][] var1 = new byte[this.field9463 + 1][this.field9461 + 1];

         for(int var2 = 1; var2 < this.field9463; ++var2) {
            for(int var3 = 1; var3 < this.field9461; ++var3) {
               var1[var2][var3] = (byte)((this.field9912[var2][var3] >> 1) + (this.field9912[var2][var3 + 1] >> 3) + (this.field9912[var2][var3 - 1] >> 2) + (this.field9912[var2 - 1][var3] >> 2) + (this.field9912[var2 + 1][var3] >> 3));
            }
         }

         this.field9904 = new class674[this.field9916.method15321()];
         this.field9916.method15317(this.field9904);

         for(int var4 = 0; var4 < this.field9904.length; ++var4) {
            ((class65)this.field9904[var4]).method984(this.field9902);
         }

         int var5 = 24;
         if (this.field9888 != null) {
            var5 += 4;
         }

         if ((this.field9890 & 7) != 0) {
            var5 += 12;
         }

         NativeHeapBuffer var6 = this.field9886.field10267.method7793(this.field9902 * var5, false);
         Stream var7 = new Stream(var6);
         class65[] var8 = new class65[this.field9902];
         int var9 = class887.method14787(this.field9902 / 4);
         if (var9 < 1) {
            var9 = 1;
         }

         class875 var10 = new class875(var9);
         class65[] var11 = new class65[this.field9892];

         for(int var12 = 0; var12 < this.field9463; ++var12) {
            for(int var13 = 0; var13 < this.field9461; ++var13) {
               if (this.field9900[var12][var13] != null) {
                  class65[] var14 = this.field9903[var12][var13];
                  int[] var15 = this.field9915[var12][var13];
                  int[] var16 = this.field9885[var12][var13];
                  int[] var17 = this.field9896[var12][var13];
                  int[] var18 = this.field9900[var12][var13];
                  int[] var19 = this.field9884 != null ? this.field9884[var12][var13] : null;
                  int[] var20 = this.field9888 != null ? this.field9888[var12][var13] : null;
                  if (var17 == null) {
                     var17 = var18;
                  }

                  float var21 = this.field9913[var12][var13];
                  float var22 = this.field9914[var12][var13];
                  float var23 = this.field9901[var12][var13];
                  float var24 = this.field9913[var12][var13 + 1];
                  float var25 = this.field9914[var12][var13 + 1];
                  float var26 = this.field9901[var12][var13 + 1];
                  float var27 = this.field9913[var12 + 1][var13 + 1];
                  float var28 = this.field9914[var12 + 1][var13 + 1];
                  float var29 = this.field9901[var12 + 1][var13 + 1];
                  float var30 = this.field9913[var12 + 1][var13];
                  float var31 = this.field9914[var12 + 1][var13];
                  float var32 = this.field9901[var12 + 1][var13];
                  int var33 = var1[var12][var13] & 255;
                  int var34 = var1[var12][var13 + 1] & 255;
                  int var35 = var1[var12 + 1][var13 + 1] & 255;
                  int var36 = var1[var12 + 1][var13] & 255;
                  int var37 = 0;

                  label346:
                  for(int var38 = 0; var38 < var18.length; ++var38) {
                     class65 var39 = var14[var38];

                     for(int var40 = 0; var40 < var37; ++var40) {
                        if (var11[var40] == var39) {
                           continue label346;
                        }
                     }

                     var11[var37++] = var39;
                  }

                  short[] var41 = this.field9893[this.field9463 * var13 + var12] = new short[var18.length];

                  for(int var42 = 0; var42 < var18.length; ++var42) {
                     int var43 = (var12 << this.field9464) + var15[var42];
                     int var44 = (var13 << this.field9464) + var16[var42];
                     int var45 = var43 >> this.field9887;
                     int var46 = var44 >> this.field9887;
                     int var47 = var18[var42];
                     int var48 = var17[var42];
                     int var49 = var19 != null ? var19[var42] : 0;
                     long var50 = (long)var48 << 48 | (long)var47 << 32 | (long)(var45 << 16) | (long)var46;
                     int var52 = var15[var42];
                     int var53 = var16[var42];
                     byte var54 = 74;
                     int var55 = 0;
                     float var56 = 1.0F;
                     float var57;
                     float var58;
                     float var59;
                     int var60;
                     if (var52 == 0 && var53 == 0) {
                        var57 = var21;
                        var58 = var22;
                        var59 = var23;
                        var60 = var54 - var33;
                     } else if (var52 == 0 && this.field9460 == var53) {
                        var57 = var24;
                        var58 = var25;
                        var59 = var26;
                        var60 = var54 - var34;
                     } else if (this.field9460 == var52 && this.field9460 == var53) {
                        var57 = var27;
                        var58 = var28;
                        var59 = var29;
                        var60 = var54 - var35;
                     } else if (this.field9460 == var52 && var53 == 0) {
                        var57 = var30;
                        var58 = var31;
                        var59 = var32;
                        var60 = var54 - var36;
                     } else {
                        float var61 = (float)var52 / (float)this.field9460;
                        float var62 = (float)var53 / (float)this.field9460;
                        float var63 = (var30 - var21) * var61 + var21;
                        float var64 = (var31 - var22) * var61 + var22;
                        float var65 = (var32 - var23) * var61 + var23;
                        float var66 = (var27 - var24) * var61 + var24;
                        float var67 = (var28 - var25) * var61 + var25;
                        float var68 = (var29 - var26) * var61 + var26;
                        var57 = (var66 - var63) * var62 + var63;
                        var58 = (var67 - var64) * var62 + var64;
                        var59 = (var68 - var65) * var62 + var65;
                        int var69 = ((var36 - var33) * var52 >> this.field9464) + var33;
                        int var70 = ((var35 - var34) * var52 >> this.field9464) + var34;
                        var60 = var54 - (((var70 - var69) * var53 >> this.field9464) + var69);
                     }

                     if (var47 != -1) {
                        int var71 = (var47 & 127) * var60 >> 7;
                        if (var71 < 2) {
                           var71 = 2;
                        } else if (var71 > 126) {
                           var71 = 126;
                        }

                        var55 = Statics.field7196[var47 & 65408 | var71];
                        if ((this.field9890 & 7) == 0) {
                           float var72 = this.field9886.field10324[2] * var59 + this.field9886.field10324[0] * var57 + this.field9886.field10324[1] * var58;
                           var56 = this.field9886.field10330 + var72 * (var72 > 0.0F ? this.field9886.field10288 : this.field9886.field10332);
                        }
                     }

                     class674 var73 = null;
                     if ((var43 & this.field9910 - 1) == 0 && (var44 & this.field9910 - 1) == 0) {
                        var73 = var10.method15322(var50);
                     }

                     int var84;
                     if (var73 == null) {
                        int var75;
                        if (var47 != var48) {
                           int var74 = (var48 & 127) * var60 >> 7;
                           if (var74 < 2) {
                              var74 = 2;
                           } else if (var74 > 126) {
                              var74 = 126;
                           }

                           var75 = Statics.field7196[var48 & 65408 | var74];
                           if ((this.field9890 & 7) == 0) {
                              float var76 = this.field9886.field10324[2] * var59 + this.field9886.field10324[0] * var57 + this.field9886.field10324[1] * var58;
                              float var77 = this.field9886.field10330 + var56 * (var56 > 0.0F ? this.field9886.field10288 : this.field9886.field10332);
                              int var78 = var75 >> 16 & 255;
                              int var79 = var75 >> 8 & 255;
                              int var80 = var75 & 255;
                              int var81 = (int)((float)var78 * var77);
                              if (var81 < 0) {
                                 var81 = 0;
                              } else if (var81 > 255) {
                                 var81 = 255;
                              }

                              int var82 = (int)((float)var79 * var77);
                              if (var82 < 0) {
                                 var82 = 0;
                              } else if (var82 > 255) {
                                 var82 = 255;
                              }

                              int var83 = (int)((float)var80 * var77);
                              if (var83 < 0) {
                                 var83 = 0;
                              } else if (var83 > 255) {
                                 var83 = 255;
                              }

                              var75 = var81 << 16 | var82 << 8 | var83;
                           }
                        } else {
                           var75 = var55;
                        }

                        if (this.field9886.field10274) {
                           var7.method7809((float)var43);
                           var7.method7809((float)(this.method15965(var43, var44) + var49));
                           var7.method7809((float)var44);
                           var7.method7808((byte)(var75 >> 16));
                           var7.method7808((byte)(var75 >> 8));
                           var7.method7808((byte)var75);
                           var7.method7808(-1);
                           var7.method7809((float)var43);
                           var7.method7809((float)var44);
                           if (this.field9888 != null) {
                              var7.method7809(var20 != null ? (float)(var20[var42] - 1) : 0.0F);
                           }

                           if ((this.field9890 & 7) != 0) {
                              var7.method7809(var57);
                              var7.method7809(var58);
                              var7.method7809(var59);
                           }
                        } else {
                           var7.method7810((float)var43);
                           var7.method7810((float)(this.method15965(var43, var44) + var49));
                           var7.method7810((float)var44);
                           var7.method7808((byte)(var75 >> 16));
                           var7.method7808((byte)(var75 >> 8));
                           var7.method7808((byte)var75);
                           var7.method7808(-1);
                           var7.method7810((float)var43);
                           var7.method7810((float)var44);
                           if (this.field9888 != null) {
                              var7.method7810(var20 != null ? (float)(var20[var42] - 1) : 0.0F);
                           }

                           if ((this.field9890 & 7) != 0) {
                              var7.method7810(var57);
                              var7.method7810(var58);
                              var7.method7810(var59);
                           }
                        }

                        var84 = this.field9891++;
                        var41[var42] = (short)var84;
                        if (var47 != -1) {
                           var8[var84] = var14[var42];
                        }

                        var10.method15311(new class103(var41[var42]), var50);
                     } else {
                        var41[var42] = ((class103)var73).field796;
                        var84 = var41[var42] & 65535;
                        if (var47 != -1 && var14[var42].field6137 < var8[var84].field6137) {
                           var8[var84] = var14[var42];
                        }
                     }

                     for(int var85 = 0; var85 < var37; ++var85) {
                        var11[var85].method981(var84, var55, var60, var56);
                     }

                     ++this.field9899;
                  }
               }
            }
         }

         for(int var86 = 0; var86 < this.field9891; ++var86) {
            class65 var87 = var8[var86];
            if (var87 != null) {
               var87.method986(var86);
            }
         }

         for(int var88 = 0; var88 < this.field9463; ++var88) {
            for(int var89 = 0; var89 < this.field9461; ++var89) {
               short[] var90 = this.field9893[this.field9463 * var89 + var88];
               if (var90 != null) {
                  int var91 = 0;
                  int var92 = 0;

                  while(var92 < var90.length) {
                     int var93 = var90[var92++] & 65535;
                     int var94 = var90[var92++] & 65535;
                     int var95 = var90[var92++] & 65535;
                     class65 var96 = var8[var93];
                     class65 var97 = var8[var94];
                     class65 var98 = var8[var95];
                     class65 var99 = null;
                     if (var96 != null) {
                        var96.method980(var88, var89, var91);
                        var99 = var96;
                     }

                     if (var97 != null) {
                        var97.method980(var88, var89, var91);
                        if (var99 == null || var97.field6137 < var99.field6137) {
                           var99 = var97;
                        }
                     }

                     if (var98 != null) {
                        var98.method980(var88, var89, var91);
                        if (var99 == null || var98.field6137 < var99.field6137) {
                           var99 = var98;
                        }
                     }

                     if (var99 != null) {
                        if (var96 != null) {
                           var99.method986(var93);
                        }

                        if (var97 != null) {
                           var99.method986(var94);
                        }

                        if (var98 != null) {
                           var99.method986(var95);
                        }

                        var99.method980(var88, var89, var91);
                     }

                     ++var91;
                  }
               }
            }
         }

         var7.method7811();
         this.field9905 = this.field9886.method16628(var5, var6, var7.method7806(), false);
         if (this.field9905 instanceof class949) {
            var6.method7800();
         }

         this.field9906 = new class340(this.field9905, 5126, 3, 0);
         this.field9907 = new class340(this.field9905, 5121, 4, 12);
         byte var100;
         if (this.field9888 != null) {
            this.field9909 = new class340(this.field9905, 5126, 3, 16);
            var100 = 28;
         } else {
            this.field9909 = new class340(this.field9905, 5126, 2, 16);
            var100 = 24;
         }

         if ((this.field9890 & 7) != 0) {
            this.field9908 = new class340(this.field9905, 5126, 3, var100);
         }

         long[] var101 = new long[this.field9904.length];

         for(int var102 = 0; var102 < this.field9904.length; ++var102) {
            class65 var103 = (class65)this.field9904[var102];
            var101[var102] = var103.field6137;
            var103.method982(this.field9891);
         }

         class781.method5516(var101, this.field9904);
         if (this.field9895 != null) {
            this.field9895.method5011();
         }
      } else {
         this.field9895 = null;
      }

      if ((this.field9894 & 2) == 0) {
         this.field9885 = (int[][][])null;
         this.field9915 = (int[][][])null;
         this.field9900 = (int[][][])null;
      }

      this.field9888 = (int[][][])null;
      this.field9896 = (int[][][])null;
      this.field9884 = (int[][][])null;
      this.field9903 = (class65[][][])null;
      this.field9912 = (byte[][])null;
      this.field9916 = null;
      this.field9901 = (float[][])null;
      this.field9914 = (float[][])null;
      this.field9913 = (float[][])null;
   }

   @deob.ObfuscatedName("yp.d(III[[ZZI)V")
   public void method7262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      this.method16266(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("yp.z(III[[ZZI)V")
   private void method16266(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      if (this.field9904 != null) {
         int var7 = arg2 + arg2 + 1;
         int var8 = var7 * var7;
         if (this.field9886.field10401.length < var8) {
            this.field9886.field10401 = new int[var8];
         }

         if (this.field9886.field10296.field931.length < this.field9899 * 2) {
            this.field9886.field10296 = new class268(this.field9899 * 2);
         }

         int var9 = arg0 - arg2;
         int var10 = var9;
         if (var9 < 0) {
            var9 = 0;
         }

         int var11 = arg1 - arg2;
         int var12 = var11;
         if (var11 < 0) {
            var11 = 0;
         }

         int var13 = arg0 + arg2;
         if (var13 > this.field9463 - 1) {
            var13 = this.field9463 - 1;
         }

         int var14 = arg1 + arg2;
         if (var14 > this.field9461 - 1) {
            var14 = this.field9461 - 1;
         }

         int var15 = 0;
         int[] var16 = this.field9886.field10401;

         for(int var17 = var9; var17 <= var13; ++var17) {
            boolean[] var18 = arg3[var17 - var10];

            for(int var19 = var11; var19 <= var14; ++var19) {
               if (var18[var19 - var12]) {
                  var16[var15++] = this.field9463 * var19 + var17;
               }
            }
         }

         this.field9886.method16636();
         this.field9886.method16610((this.field9890 & 7) != 0);

         for(int var20 = 0; var20 < this.field9904.length - 0; ++var20) {
            ((class65)this.field9904[var20]).method983(var16, var15);
         }

         if (!this.field9897.method15024()) {
            int var21 = this.field9886.field10339;
            int var22 = this.field9886.field10340;
            this.field9886.method7550(0, var22, this.field9886.field10261);
            this.field9886.method16610(false);
            this.field9886.method16714(false);
            this.field9886.method16652(128);
            this.field9886.method16617(-2);
            this.field9886.method16639(this.field9886.field10358);
            this.field9886.method16642(8448, 7681);
            this.field9886.method16643(0, 34166, 770);
            this.field9886.method16616(0, 34167, 770);

            for(class674 var23 = this.field9897.method14964(); var23 != null; var23 = this.field9897.method15006()) {
               class66 var24 = (class66)var23;
               var24.method999(arg0, arg1, arg2, arg3);
            }

            this.field9886.method16643(0, 5890, 768);
            this.field9886.method16616(0, 5890, 770);
            this.field9886.method16639((class354)null);
            this.field9886.method7550(var21, var22, this.field9886.field10261);
         }

         if (this.field9895 != null) {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
            this.field9886.method16631(this.field9906, (class340)null, (class340)null, this.field9909);
            this.field9895.method5012(arg0, arg1, arg2, arg3, arg4);
            OpenGL.glPopMatrix();
         }
      }

   }

   @deob.ObfuscatedName("yp.b(IIIIIII[[Z)V")
   public void method7288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class403 var9 = this.field9886.method11517();
      if (this.field9902 > 0 && var9 != null) {
         this.field9886.method16672();
         this.field9886.method16646(false);
         this.field9886.method16610(false);
         this.field9886.method16649(false);
         this.field9886.method16714(false);
         this.field9886.method16652(0);
         this.field9886.method16617(-2);
         this.field9886.method16639((class354)null);
         field9917[0] = (float)arg2 / ((float)this.field9460 * 128.0F * (float)var9.method566());
         field9917[1] = 0.0F;
         field9917[2] = 0.0F;
         field9917[3] = 0.0F;
         field9917[4] = 0.0F;
         field9917[5] = (float)arg2 / ((float)this.field9460 * 128.0F * (float)var9.method559());
         field9917[6] = 0.0F;
         field9917[7] = 0.0F;
         field9917[8] = 0.0F;
         field9917[9] = 0.0F;
         field9917[10] = 0.0F;
         field9917[11] = 0.0F;
         field9917[12] = -1.0F - ((float)(arg2 * arg3) / 128.0F - (float)(arg0 * 2)) / (float)var9.method566();
         field9917[13] = 1.0F - ((float)(arg2 * arg6) / 128.0F + (float)(arg1 * 2)) / (float)var9.method559();
         field9917[14] = 0.0F;
         field9917[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(field9917, 0);
         field9917[0] = 1.0F;
         field9917[1] = 0.0F;
         field9917[2] = 0.0F;
         field9917[3] = 0.0F;
         field9917[4] = 0.0F;
         field9917[5] = 0.0F;
         field9917[6] = 1.0F;
         field9917[7] = 0.0F;
         field9917[8] = 0.0F;
         field9917[9] = 1.0F;
         field9917[10] = 0.0F;
         field9917[11] = 0.0F;
         field9917[12] = 0.0F;
         field9917[13] = 0.0F;
         field9917[14] = 0.0F;
         field9917[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(field9917, 0);
         if ((this.field9890 & 7) != 0) {
            this.field9886.method16610(true);
            this.field9886.method16624();
         } else {
            this.field9886.method16610(false);
         }

         this.field9886.method16631(this.field9906, this.field9908, this.field9907, this.field9909);
         if (this.field9886.field10296.field931.length < this.field9899 * 2) {
            this.field9886.field10296 = new class268(this.field9899 * 2);
         } else {
            this.field9886.field10296.field935 = 0;
         }

         int var10 = 0;
         class268 var11 = this.field9886.field10296;
         if (this.field9886.field10274) {
            for(int var12 = arg4; var12 < arg6; ++var12) {
               int var13 = this.field9463 * var12 + arg3;

               for(int var14 = arg3; var14 < arg5; ++var14) {
                  if (arg7[var14 - arg3][var12 - arg4]) {
                     short[] var15 = this.field9893[var13];
                     if (var15 != null) {
                        for(int var16 = 0; var16 < var15.length; ++var16) {
                           var11.method1569(var15[var16] & 65535);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(int var17 = arg4; var17 < arg6; ++var17) {
               int var18 = this.field9463 * var17 + arg3;

               for(int var19 = arg3; var19 < arg5; ++var19) {
                  if (arg7[var19 - arg3][var17 - arg4]) {
                     short[] var20 = this.field9893[var18];
                     if (var20 != null) {
                        for(int var21 = 0; var21 < var20.length; ++var21) {
                           var11.method1668(var20[var21] & 65535);
                           ++var10;
                        }
                     }
                  }

                  ++var18;
               }
            }
         }

         if (var10 > 0) {
            class946 var22 = new class946(this.field9886, 5123, var11.field931, var11.field935);
            this.field9886.method16633(var22, 4, 0, var10);
         }

      }
   }

   @deob.ObfuscatedName("yp.w(IILna;)Lna;")
   public class664 method7253(int arg0, int arg1, class664 arg2) {
      if ((this.field9889[arg0][arg1] & 1) == 0) {
         return null;
      } else {
         int var4 = this.field9460 >> this.field9886.field10264;
         class308 var5 = (class308)arg2;
         class308 var6;
         if (var5 != null && var5.method3893(var4, var4)) {
            var6 = var5;
            var5.method3906();
         } else {
            var6 = new class308(this.field9886, var4, var4);
         }

         var6.method3892(0, 0, var4, var4);
         this.method16267(var6, arg0, arg1);
         return var6;
      }
   }

   @deob.ObfuscatedName("yp.t(Lalm;II)V")
   private void method16267(class308 arg0, int arg1, int arg2) {
      int[] var4 = this.field9915[arg1][arg2];
      int[] var5 = this.field9885[arg1][arg2];
      int var6 = var4.length;
      if (this.field9886.field10235.length < var6) {
         this.field9886.field10235 = new int[var6];
         this.field9886.field10400 = new int[var6];
      }

      int[] var7 = this.field9886.field10235;
      int[] var8 = this.field9886.field10400;

      for(int var9 = 0; var9 < var6; ++var9) {
         var7[var9] = var4[var9] >> this.field9886.field10264;
         var8[var9] = var5[var9] >> this.field9886.field10264;
      }

      int var10 = 0;

      while(var10 < var6) {
         int var11 = var7[var10];
         int var12 = var8[var10++];
         int var13 = var7[var10];
         int var14 = var8[var10++];
         int var15 = var7[var10];
         int var16 = var8[var10++];
         if ((var11 - var13) * (var14 - var16) - (var14 - var12) * (var15 - var13) > 0) {
            arg0.method3895(var12, var14, var16, var11, var13, var15);
         }
      }

   }

   @deob.ObfuscatedName("yp.o(Lna;IIIIZ)Z")
   public boolean method7278(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (this.field9895 != null && arg0 != null) {
         int var7 = arg1 - (this.field9886.field10208 * arg2 >> 8) >> this.field9886.field10264;
         int var8 = arg3 - (this.field9886.field10370 * arg2 >> 8) >> this.field9886.field10264;
         return this.field9895.method5015(arg0, var7, var8);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("yp.UA(Lna;IIIIZ)V")
   public void method7251(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (this.field9895 != null && arg0 != null) {
         int var7 = arg1 - (this.field9886.field10208 * arg2 >> 8) >> this.field9886.field10264;
         int var8 = arg3 - (this.field9886.field10370 * arg2 >> 8) >> this.field9886.field10264;
         this.field9895.method5013(arg0, var7, var8);
      }
   }

   @deob.ObfuscatedName("yp.NA(Lna;IIIIZ)V")
   public void method7255(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (this.field9895 != null && arg0 != null) {
         int var7 = arg1 - (this.field9886.field10208 * arg2 >> 8) >> this.field9886.field10264;
         int var8 = arg3 - (this.field9886.field10370 * arg2 >> 8) >> this.field9886.field10264;
         this.field9895.method5014(arg0, var7, var8);
      }
   }

   @deob.ObfuscatedName("yp.a(Lacy;[I)V")
   public void method7257(class81 arg0, int[] arg1) {
      this.field9897.method14959(new class66(this.field9886, this, arg0, arg1));
   }
}
