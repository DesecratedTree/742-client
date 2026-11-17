import jaclib.memory.Stream;
import jaggl.OpenGL;

@deob.ObfuscatedName("yk")
public class class971 extends class745 {
   @deob.ObfuscatedName("yk.e")
   private boolean field9776 = false;
   @deob.ObfuscatedName("yk.z")
   private boolean field9722 = false;
   @deob.ObfuscatedName("yk.m")
   private int field9723 = 0;
   @deob.ObfuscatedName("yk.i")
   private int field9730 = 0;
   @deob.ObfuscatedName("yk.j")
   private int field9777 = 0;
   @deob.ObfuscatedName("yk.ah")
   private int field9738 = 0;
   @deob.ObfuscatedName("yk.aw")
   private int field9739 = 0;
   @deob.ObfuscatedName("yk.aj")
   private boolean field9755 = true;
   @deob.ObfuscatedName("yk.bf")
   private boolean field9779 = false;
   @deob.ObfuscatedName("yk.s")
   private final class983 field9715;
   @deob.ObfuscatedName("yk.l")
   private int field9716;
   @deob.ObfuscatedName("yk.u")
   private int field9721;
   @deob.ObfuscatedName("yk.az")
   private class340 field9764;
   @deob.ObfuscatedName("yk.as")
   private class340 field9751;
   @deob.ObfuscatedName("yk.ar")
   private class340 field9750;
   @deob.ObfuscatedName("yk.aq")
   private class340 field9749;
   @deob.ObfuscatedName("yk.au")
   private class335 field9742;
   @deob.ObfuscatedName("yk.bq")
   private int[] field9766;
   @deob.ObfuscatedName("yk.t")
   private int[] field9725;
   @deob.ObfuscatedName("yk.c")
   private int[] field9737;
   @deob.ObfuscatedName("yk.w")
   private int[] field9727;
   @deob.ObfuscatedName("yk.y")
   private short[] field9729;
   @deob.ObfuscatedName("yk.bx")
   private class408[] field9736;
   @deob.ObfuscatedName("yk.bm")
   private class370[] field9769;
   @deob.ObfuscatedName("yk.bh")
   private int field9726;
   @deob.ObfuscatedName("yk.bn")
   private class368[] field9771;
   @deob.ObfuscatedName("yk.bk")
   private class353[] field9756;
   @deob.ObfuscatedName("yk.f")
   private short[] field9752;
   @deob.ObfuscatedName("yk.ai")
   private short[] field9770;
   @deob.ObfuscatedName("yk.ap")
   private short[] field9710;
   @deob.ObfuscatedName("yk.av")
   private byte[] field9734;
   @deob.ObfuscatedName("yk.af")
   private float[] field9778;
   @deob.ObfuscatedName("yk.at")
   private float[] field9708;
   @deob.ObfuscatedName("yk.al")
   private short[] field9731;
   @deob.ObfuscatedName("yk.an")
   private byte[] field9735;
   @deob.ObfuscatedName("yk.ag")
   private short[] field9758;
   @deob.ObfuscatedName("yk.ak")
   private short[] field9743;
   @deob.ObfuscatedName("yk.aa")
   private short[] field9744;
   @deob.ObfuscatedName("yk.ao")
   private short[] field9745;
   @deob.ObfuscatedName("yk.ae")
   private short[] field9747;
   @deob.ObfuscatedName("yk.g")
   private short field9763;
   @deob.ObfuscatedName("yk.h")
   private short field9732;
   @deob.ObfuscatedName("yk.by")
   private short[] field9767;
   @deob.ObfuscatedName("yk.bw")
   private int[] field9765;
   @deob.ObfuscatedName("yk.q")
   private int[][] field9728;
   @deob.ObfuscatedName("yk.bo")
   private int[][] field9773;
   @deob.ObfuscatedName("yk.ab")
   private int[][] field9746;
   @deob.ObfuscatedName("yk.bv")
   private static float[] field9775 = new float[2];
   @deob.ObfuscatedName("yk.bd")
   private static final int[] field9759 = new int[8];
   @deob.ObfuscatedName("yk.bi")
   private static final int[] field9754 = new int[8];
   @deob.ObfuscatedName("yk.bz")
   private static final int[] field9733 = new int[8];
   @deob.ObfuscatedName("yk.v")
   private byte field9718;
   @deob.ObfuscatedName("yk.ac")
   private int field9717;
   @deob.ObfuscatedName("yk.ay")
   private int field9757;
   @deob.ObfuscatedName("yk.am")
   private class341 field9772;
   @deob.ObfuscatedName("yk.ad")
   private class369 field9748;
   @deob.ObfuscatedName("yk.ax")
   private class381 field9740;
   @deob.ObfuscatedName("yk.bc")
   private short field9714;
   @deob.ObfuscatedName("yk.bg")
   private short field9719;
   @deob.ObfuscatedName("yk.bp")
   private short field9741;
   @deob.ObfuscatedName("yk.bs")
   private short field9760;
   @deob.ObfuscatedName("yk.br")
   private short field9761;
   @deob.ObfuscatedName("yk.ba")
   private short field9762;

   public class971(class983 arg0, class396 arg1, int arg2, int arg3, int arg4, int arg5) {
      this.field9715 = arg0;
      this.field9716 = arg2;
      this.field9721 = arg5;
      if (class356.method4326(arg2, arg5)) {
         this.field9764 = new class340((class341)null, 5126, 3, 0);
      }

      if (class356.method4329(arg2, arg5)) {
         this.field9751 = new class340((class341)null, 5126, 2, 0);
      }

      if (class356.method4375(arg2, arg5)) {
         this.field9750 = new class340((class341)null, 5126, 3, 0);
      }

      if (class356.method4328(arg2, arg5)) {
         this.field9749 = new class340((class341)null, 5121, 4, 0);
      }

      if (class356.method4330(arg2, arg5)) {
         this.field9742 = new class335();
      }

      class637 var7 = arg0.field7118;
      int[] var8 = new int[arg1.field2914];
      this.field9766 = new int[arg1.field2909 + 1];

      for(int var9 = 0; var9 < arg1.field2914; ++var9) {
         if (arg1.field2919 == null || arg1.field2919[var9] != 2) {
            if (arg1.field2924 != null && arg1.field2924[var9] != -1) {
               class360 var10 = var7.method5112(arg1.field2924[var9] & 65535);
               if (((this.field9721 & 64) == 0 || !var10.field2331) && var10.field2333) {
                  continue;
               }
            }

            int var10003 = this.field9738 * -1431655765;
            int var10001 = this.field9738 * -1431655765;
            this.field9738 = (var10003 + 1) * 3;
            var8[var10001] = var9;
            ++this.field9766[arg1.field2916[var9]];
            ++this.field9766[arg1.field2912[var9]];
            ++this.field9766[arg1.field2918[var9]];
         }
      }

      this.field9739 = this.field9738 * -1431655765;
      long[] var11 = new long[this.field9738 * -1431655765];
      boolean var12 = (this.field9716 & 256) != 0;

      for(int var13 = 0; var13 < this.field9738 * -1431655765; ++var13) {
         int var14 = var8[var13];
         class360 var15 = null;
         int var16 = 0;
         byte var17 = 0;
         byte var18 = 0;
         byte var19 = 0;
         if (arg1.field2937 != null) {
            boolean var20 = false;

            for(int var21 = 0; var21 < arg1.field2937.length; ++var21) {
               class395 var22 = arg1.field2937[var21];
               if (var22.field2903 == var14) {
                  class532 var23 = class532.method8879(var22.field2905);
                  if (var23.field4195) {
                     var20 = true;
                  }

                  if (var23.field4189 != -1) {
                     class360 var24 = var7.method5112(var23.field4189);
                     if (class725.field6684 == var24.field2323) {
                        this.field9776 = true;
                     }
                  }
               }
            }

            if (var20) {
               var11[var13] = Long.MAX_VALUE;
               --this.field9739;
               continue;
            }
         }

         short var25 = -1;
         if (arg1.field2924 != null) {
            var25 = arg1.field2924[var14];
            if (var25 != -1) {
               var15 = var7.method5112(var25 & 65535);
               if ((this.field9721 & 64) != 0 && var15.field2331) {
                  var25 = -1;
                  var15 = null;
               } else {
                  var18 = var15.field2324;
                  var19 = var15.field2325;
                  if (var15.field2330 != 0 || var15.field2317 != 0) {
                     this.field9722 = true;
                  }
               }
            }
         }

         boolean var26 = arg1.field2921 != null && arg1.field2921[var14] != 0 || var15 != null && class725.field6686 != var15.field2323;
         if ((var12 || var26) && arg1.field2943 != null) {
            var16 += arg1.field2943[var14] << 17;
         }

         if (var26) {
            var16 += 65536;
         }

         int var27 = ((var18 & 255) << 8) + var16;
         int var28 = (var19 & 255) + var27;
         int var29 = ((var25 & 65535) << 16) + var17;
         int var30 = (var13 & 65535) + var29;
         var11[var13] = ((long)var28 << 32) + (long)var30;
         this.field9776 |= var26;
         this.field9722 |= var15 != null && (var15.field2330 != 0 || var15.field2317 != 0);
      }

      class781.method10914(var11, var8);
      this.field9723 = arg1.field2908;
      this.field9730 = arg1.field2909;
      this.field9725 = arg1.field2910;
      this.field9737 = arg1.field2911;
      this.field9727 = arg1.field2940;
      this.field9729 = arg1.field2926;
      class357[] var31 = new class357[this.field9730];
      this.field9736 = arg1.field2941;
      this.field9769 = arg1.field2929;
      if (arg1.field2937 != null) {
         this.field9726 = arg1.field2937.length;
         this.field9771 = new class368[this.field9726];
         this.field9756 = new class353[this.field9726];

         for(int var32 = 0; var32 < this.field9726; ++var32) {
            class395 var33 = arg1.field2937[var32];
            class532 var34 = class532.method8879(var33.field2905);
            int var35 = -1;

            for(int var36 = 0; var36 < this.field9738 * -1431655765; ++var36) {
               if (var33.field2903 == var8[var36]) {
                  var35 = var36;
                  break;
               }
            }

            if (var35 == -1) {
               throw new RuntimeException();
            }

            int var37 = Statics.field7196[arg1.field2927[var33.field2903] & 65535] & 16777215;
            int var38 = var37 | 255 - (arg1.field2921 != null ? arg1.field2921[var33.field2903] : 0) << 24;
            this.field9771[var32] = new class368(var35, arg1.field2916[var33.field2903], arg1.field2912[var33.field2903], arg1.field2918[var33.field2903], var34.field4190, var34.field4187, var34.field4189, var34.field4191, var34.field4194, var34.field4195, var34.field4186, var33.field2902);
            this.field9756[var32] = new class353(var38);
         }
      }

      int var39 = this.field9738;
      this.field9752 = new short[var39];
      this.field9770 = new short[var39];
      this.field9710 = new short[var39];
      this.field9734 = new byte[var39];
      this.field9778 = new float[var39];
      this.field9708 = new float[var39];
      this.field9731 = new short[this.field9738 * -1431655765];
      this.field9735 = new byte[this.field9738 * -1431655765];
      this.field9758 = new short[this.field9738 * -1431655765];
      this.field9743 = new short[this.field9738 * -1431655765];
      this.field9744 = new short[this.field9738 * -1431655765];
      this.field9745 = new short[this.field9738 * -1431655765];
      if (arg1.field2907 != null) {
         this.field9747 = new short[this.field9738 * -1431655765];
      }

      this.field9763 = (short)arg3;
      this.field9732 = (short)arg4;
      this.field9767 = new short[var39];
      Statics.field9774 = new long[var39];
      int var40 = 0;

      for(int var41 = 0; var41 < arg1.field2909; ++var41) {
         int var42 = this.field9766[var41];
         this.field9766[var41] = var40;
         var40 += var42;
         var31[var41] = new class357();
      }

      this.field9766[arg1.field2909] = var40;
      class409 var43 = this.method11001(arg1, var8, this.field9738 * -1431655765);
      class342[] var44 = new class342[arg1.field2914];

      for(int var45 = 0; var45 < arg1.field2914; ++var45) {
         short var46 = arg1.field2916[var45];
         short var47 = arg1.field2912[var45];
         short var48 = arg1.field2918[var45];
         int var49 = this.field9725[var47] - this.field9725[var46];
         int var50 = this.field9737[var47] - this.field9737[var46];
         int var51 = this.field9727[var47] - this.field9727[var46];
         int var52 = this.field9725[var48] - this.field9725[var46];
         int var53 = this.field9737[var48] - this.field9737[var46];
         int var54 = this.field9727[var48] - this.field9727[var46];
         int var55 = var50 * var54 - var51 * var53;
         int var56 = var51 * var52 - var49 * var54;

         int var57;
         for(var57 = var49 * var53 - var50 * var52; var55 > 8192 || var56 > 8192 || var57 > 8192 || var55 < -8192 || var56 < -8192 || var57 < -8192; var57 >>= 1) {
            var55 >>= 1;
            var56 >>= 1;
         }

         int var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
         if (var58 <= 0) {
            var58 = 1;
         }

         int var59 = var55 * 256 / var58;
         int var60 = var56 * 256 / var58;
         int var61 = var57 * 256 / var58;
         byte var62 = arg1.field2919 == null ? 0 : arg1.field2919[var45];
         if (var62 == 0) {
            class357 var63 = var31[var46];
            var63.field2281 += var59;
            var63.field2280 += var60;
            var63.field2279 += var61;
            ++var63.field2282;
            class357 var64 = var31[var47];
            var64.field2281 += var59;
            var64.field2280 += var60;
            var64.field2279 += var61;
            ++var64.field2282;
            class357 var65 = var31[var48];
            var65.field2281 += var59;
            var65.field2280 += var60;
            var65.field2279 += var61;
            ++var65.field2282;
         } else if (var62 == 1) {
            class342 var66 = var44[var45] = new class342();
            var66.field2148 = var59;
            var66.field2149 = var60;
            var66.field2150 = var61;
         }
      }

      for(int var67 = 0; var67 < this.field9738 * -1431655765; ++var67) {
         int var68 = var8[var67];
         int var69 = arg1.field2927[var68] & 65535;
         int var70;
         if (arg1.field2922 == null) {
            var70 = -1;
         } else {
            var70 = arg1.field2922[var68];
         }

         int var71;
         if (arg1.field2921 == null) {
            var71 = 0;
         } else {
            var71 = arg1.field2921[var68] & 255;
         }

         short var72 = arg1.field2924 == null ? -1 : arg1.field2924[var68];
         if (var72 != -1 && (this.field9721 & 64) != 0) {
            class360 var73 = var7.method5112(var72 & 65535);
            if (var73.field2331) {
               var72 = -1;
            }
         }

         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         byte var80 = 0;
         byte var81 = 0;
         int var82 = 0;
         if (var72 != -1) {
            if (var70 == -1) {
               var74 = 0.0F;
               var75 = 1.0F;
               var76 = 1.0F;
               var77 = 1.0F;
               var80 = 1;
               var78 = 0.0F;
               var79 = 0.0F;
               var81 = 2;
            } else {
               var70 &= 255;
               byte var83 = arg1.field2920[var70];
               if (var83 == 0) {
                  short var84 = arg1.field2916[var68];
                  short var85 = arg1.field2912[var68];
                  short var86 = arg1.field2918[var68];
                  short var87 = arg1.field2930[var70];
                  short var88 = arg1.field2931[var70];
                  short var89 = arg1.field2932[var70];
                  float var90 = (float)arg1.field2910[var87];
                  float var91 = (float)arg1.field2911[var87];
                  float var92 = (float)arg1.field2940[var87];
                  float var93 = (float)arg1.field2910[var88] - var90;
                  float var94 = (float)arg1.field2911[var88] - var91;
                  float var95 = (float)arg1.field2940[var88] - var92;
                  float var96 = (float)arg1.field2910[var89] - var90;
                  float var97 = (float)arg1.field2911[var89] - var91;
                  float var98 = (float)arg1.field2940[var89] - var92;
                  float var99 = (float)arg1.field2910[var84] - var90;
                  float var100 = (float)arg1.field2911[var84] - var91;
                  float var101 = (float)arg1.field2940[var84] - var92;
                  float var102 = (float)arg1.field2910[var85] - var90;
                  float var103 = (float)arg1.field2911[var85] - var91;
                  float var104 = (float)arg1.field2940[var85] - var92;
                  float var105 = (float)arg1.field2910[var86] - var90;
                  float var106 = (float)arg1.field2911[var86] - var91;
                  float var107 = (float)arg1.field2940[var86] - var92;
                  float var108 = var94 * var98 - var95 * var97;
                  float var109 = var95 * var96 - var93 * var98;
                  float var110 = var93 * var97 - var94 * var96;
                  float var111 = var97 * var110 - var98 * var109;
                  float var112 = var98 * var108 - var96 * var110;
                  float var113 = var96 * var109 - var97 * var108;
                  float var114 = 1.0F / (var95 * var113 + var93 * var111 + var94 * var112);
                  var74 = (var101 * var113 + var99 * var111 + var100 * var112) * var114;
                  var76 = (var104 * var113 + var102 * var111 + var103 * var112) * var114;
                  var78 = (var107 * var113 + var105 * var111 + var106 * var112) * var114;
                  float var115 = var94 * var110 - var95 * var109;
                  float var116 = var95 * var108 - var93 * var110;
                  float var117 = var93 * var109 - var94 * var108;
                  float var118 = 1.0F / (var98 * var117 + var96 * var115 + var97 * var116);
                  var75 = (var101 * var117 + var99 * var115 + var100 * var116) * var118;
                  var77 = (var104 * var117 + var102 * var115 + var103 * var116) * var118;
                  var79 = (var107 * var117 + var105 * var115 + var106 * var116) * var118;
               } else {
                  short var119 = arg1.field2916[var68];
                  short var120 = arg1.field2912[var68];
                  short var121 = arg1.field2918[var68];
                  int var122 = var43.field3089[var70];
                  int var123 = var43.field3090[var70];
                  int var124 = var43.field3088[var70];
                  float[] var125 = var43.field3087[var70];
                  byte var126 = arg1.field2915[var70];
                  float var127 = (float)arg1.field2936[var70] / 256.0F;
                  if (var83 == 1) {
                     float var128 = (float)arg1.field2935[var70] / 1024.0F;
                     this.method11000(arg1.field2910[var119], arg1.field2911[var119], arg1.field2940[var119], var122, var123, var124, var125, var128, var126, var127, field9775);
                     var74 = field9775[0];
                     var75 = field9775[1];
                     this.method11000(arg1.field2910[var120], arg1.field2911[var120], arg1.field2940[var120], var122, var123, var124, var125, var128, var126, var127, field9775);
                     var76 = field9775[0];
                     var77 = field9775[1];
                     this.method11000(arg1.field2910[var121], arg1.field2911[var121], arg1.field2940[var121], var122, var123, var124, var125, var128, var126, var127, field9775);
                     var78 = field9775[0];
                     var79 = field9775[1];
                     float var129 = var128 / 2.0F;
                     if ((var126 & 1) == 0) {
                        if (var76 - var74 > var129) {
                           var76 -= var128;
                           var80 = 1;
                        } else if (var74 - var76 > var129) {
                           var76 += var128;
                           var80 = 2;
                        }

                        if (var78 - var74 > var129) {
                           var78 -= var128;
                           var81 = 1;
                        } else if (var74 - var78 > var129) {
                           var78 += var128;
                           var81 = 2;
                        }
                     } else {
                        if (var77 - var75 > var129) {
                           var77 -= var128;
                           var80 = 1;
                        } else if (var75 - var77 > var129) {
                           var77 += var128;
                           var80 = 2;
                        }

                        if (var79 - var75 > var129) {
                           var79 -= var128;
                           var81 = 1;
                        } else if (var75 - var79 > var129) {
                           var79 += var128;
                           var81 = 2;
                        }
                     }
                  } else if (var83 == 2) {
                     float var130 = (float)arg1.field2942[var70] / 256.0F;
                     float var131 = (float)arg1.field2938[var70] / 256.0F;
                     int var132 = arg1.field2910[var120] - arg1.field2910[var119];
                     int var133 = arg1.field2911[var120] - arg1.field2911[var119];
                     int var134 = arg1.field2940[var120] - arg1.field2940[var119];
                     int var135 = arg1.field2910[var121] - arg1.field2910[var119];
                     int var136 = arg1.field2911[var121] - arg1.field2911[var119];
                     int var137 = arg1.field2940[var121] - arg1.field2940[var119];
                     int var138 = var133 * var137 - var134 * var136;
                     int var139 = var134 * var135 - var132 * var137;
                     int var140 = var132 * var136 - var133 * var135;
                     float var141 = 64.0F / (float)arg1.field2933[var70];
                     float var142 = 64.0F / (float)arg1.field2917[var70];
                     float var143 = 64.0F / (float)arg1.field2935[var70];
                     float var144 = (var125[2] * (float)var140 + var125[0] * (float)var138 + var125[1] * (float)var139) / var141;
                     float var145 = (var125[5] * (float)var140 + var125[3] * (float)var138 + var125[4] * (float)var139) / var142;
                     float var146 = (var125[8] * (float)var140 + var125[6] * (float)var138 + var125[7] * (float)var139) / var143;
                     var82 = this.method11013(var144, var145, var146);
                     this.method11015(arg1.field2910[var119], arg1.field2911[var119], arg1.field2940[var119], var122, var123, var124, var82, var125, var126, var127, var130, var131, field9775);
                     var74 = field9775[0];
                     var75 = field9775[1];
                     this.method11015(arg1.field2910[var120], arg1.field2911[var120], arg1.field2940[var120], var122, var123, var124, var82, var125, var126, var127, var130, var131, field9775);
                     var76 = field9775[0];
                     var77 = field9775[1];
                     this.method11015(arg1.field2910[var121], arg1.field2911[var121], arg1.field2940[var121], var122, var123, var124, var82, var125, var126, var127, var130, var131, field9775);
                     var78 = field9775[0];
                     var79 = field9775[1];
                  } else if (var83 == 3) {
                     this.method10999(arg1.field2910[var119], arg1.field2911[var119], arg1.field2940[var119], var122, var123, var124, var125, var126, var127, field9775);
                     var74 = field9775[0];
                     var75 = field9775[1];
                     this.method10999(arg1.field2910[var120], arg1.field2911[var120], arg1.field2940[var120], var122, var123, var124, var125, var126, var127, field9775);
                     var76 = field9775[0];
                     var77 = field9775[1];
                     this.method10999(arg1.field2910[var121], arg1.field2911[var121], arg1.field2940[var121], var122, var123, var124, var125, var126, var127, field9775);
                     var78 = field9775[0];
                     var79 = field9775[1];
                     if ((var126 & 1) == 0) {
                        if (var76 - var74 > 0.5F) {
                           --var76;
                           var80 = 1;
                        } else if (var74 - var76 > 0.5F) {
                           ++var76;
                           var80 = 2;
                        }

                        if (var78 - var74 > 0.5F) {
                           --var78;
                           var81 = 1;
                        } else if (var74 - var78 > 0.5F) {
                           ++var78;
                           var81 = 2;
                        }
                     } else {
                        if (var77 - var75 > 0.5F) {
                           --var77;
                           var80 = 1;
                        } else if (var75 - var77 > 0.5F) {
                           ++var77;
                           var80 = 2;
                        }

                        if (var79 - var75 > 0.5F) {
                           --var79;
                           var81 = 1;
                        } else if (var75 - var79 > 0.5F) {
                           ++var79;
                           var81 = 2;
                        }
                     }
                  }
               }
            }
         }

         byte var147;
         if (arg1.field2919 == null) {
            var147 = 0;
         } else {
            var147 = arg1.field2919[var68];
         }

         if (var147 == 0) {
            long var148 = ((long)(var69 << 8) + (long)(var82 << 24) + (long)var71 << 32) + (long)(var70 << 2);
            short var150 = arg1.field2916[var68];
            short var151 = arg1.field2912[var68];
            short var152 = arg1.field2918[var68];
            class357 var153 = var31[var150];
            this.field9758[var67] = this.method16116(arg1, var150, var148, var153.field2281, var153.field2280, var153.field2279, var153.field2282, var74, var75);
            class357 var154 = var31[var151];
            this.field9743[var67] = this.method16116(arg1, var151, (long)var80 + var148, var154.field2281, var154.field2280, var154.field2279, var154.field2282, var76, var77);
            class357 var155 = var31[var152];
            this.field9744[var67] = this.method16116(arg1, var152, (long)var81 + var148, var155.field2281, var155.field2280, var155.field2279, var155.field2282, var78, var79);
         } else if (var147 == 1) {
            class342 var156 = var44[var68];
            long var157 = (long)((var70 << 2) + (var156.field2148 > 0 ? 1024 : 2048) + (var156.field2149 + 256 << 12) + (var156.field2150 + 256 << 22)) + ((long)(var69 << 8) + (long)(var82 << 24) + (long)var71 << 32);
            this.field9758[var67] = this.method16116(arg1, arg1.field2916[var68], var157, var156.field2148, var156.field2149, var156.field2150, 0, var74, var75);
            this.field9743[var67] = this.method16116(arg1, arg1.field2912[var68], (long)var80 + var157, var156.field2148, var156.field2149, var156.field2150, 0, var76, var77);
            this.field9744[var67] = this.method16116(arg1, arg1.field2918[var68], (long)var81 + var157, var156.field2148, var156.field2149, var156.field2150, 0, var78, var79);
         }

         if (arg1.field2921 != null) {
            this.field9735[var67] = arg1.field2921[var68];
         }

         if (arg1.field2907 != null) {
            this.field9747[var67] = arg1.field2907[var68];
         }

         this.field9731[var67] = arg1.field2927[var68];
         this.field9745[var67] = var72;
      }

      int var159 = 0;
      short var160 = -10000;

      for(int var161 = 0; var161 < this.field9739; ++var161) {
         short var162 = this.field9745[var161];
         if (var160 != var162) {
            ++var159;
            var160 = var162;
         }
      }

      this.field9765 = new int[var159 + 1];
      int var163 = 0;
      short var164 = -10000;

      for(int var165 = 0; var165 < this.field9739; ++var165) {
         short var166 = this.field9745[var165];
         if (var164 != var166) {
            this.field9765[var163++] = var165;
            var164 = var166;
         }
      }

      this.field9765[var163] = this.field9739;
      Statics.field9774 = null;
      this.field9752 = method16115(this.field9752, this.field9777);
      this.field9770 = method16115(this.field9770, this.field9777);
      this.field9710 = method16115(this.field9710, this.field9777);
      this.field9734 = method16114(this.field9734, this.field9777);
      this.field9778 = method16132(this.field9778, this.field9777);
      this.field9708 = method16132(this.field9708, this.field9777);
      if (arg1.field2913 != null && class356.method4347(arg2, this.field9721)) {
         this.field9728 = arg1.method5420(false);
      }

      if (arg1.field2937 != null && class356.method4335(arg2, this.field9721)) {
         this.field9773 = arg1.method5422();
      }

      if (arg1.field2925 != null && class356.method4339(arg2, this.field9721)) {
         int var167 = 0;
         int[] var168 = new int[256];

         for(int var169 = 0; var169 < this.field9738 * -1431655765; ++var169) {
            int var170 = arg1.field2925[var8[var169]];
            if (var170 >= 0) {
               int var10002 = var168[var170]++;
               if (var170 > var167) {
                  var167 = var170;
               }
            }
         }

         this.field9746 = new int[var167 + 1][];

         for(int var171 = 0; var171 <= var167; ++var171) {
            this.field9746[var171] = new int[var168[var171]];
            var168[var171] = 0;
         }

         for(int var172 = 0; var172 < this.field9738 * -1431655765; ++var172) {
            int var173 = arg1.field2925[var8[var172]];
            if (var173 >= 0) {
               this.field9746[var173][var168[var173]++] = var172;
            }
         }
      }

   }

   public class971(class983 arg0) {
      this.field9715 = arg0;
      this.field9764 = new class340((class341)null, 5126, 3, 0);
      this.field9751 = new class340((class341)null, 5126, 2, 0);
      this.field9750 = new class340((class341)null, 5126, 3, 0);
      this.field9749 = new class340((class341)null, 5121, 4, 0);
      this.field9742 = new class335();
   }

   @deob.ObfuscatedName("yk.z(Ldk;IJIIIIFF)S")
   private short method16116(class396 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
      int var11 = this.field9766[arg1];
      int var12 = this.field9766[arg1 + 1];
      int var13 = 0;

      for(int var14 = var11; var14 < var12; ++var14) {
         short var15 = this.field9767[var14];
         if (var15 == 0) {
            var13 = var14;
            break;
         }

         if (Statics.field9774[var14] == arg2) {
            return (short)(var15 - 1);
         }
      }

      this.field9767[var13] = (short)(this.field9777 + 1);
      Statics.field9774[var13] = arg2;
      this.field9752[this.field9777] = (short)arg3;
      this.field9770[this.field9777] = (short)arg4;
      this.field9710[this.field9777] = (short)arg5;
      this.field9734[this.field9777] = (byte)arg6;
      this.field9778[this.field9777] = arg7;
      this.field9708[this.field9777] = arg8;
      return (short)(this.field9777++);
   }

   @deob.ObfuscatedName("yk.y([BI)[B")
   private static byte[] method16114(byte[] arg0, int arg1) {
      byte[] var2 = new byte[arg1];
      System.arraycopy(arg0, 0, var2, 0, arg1);
      return var2;
   }

   @deob.ObfuscatedName("yk.aa([SI)[S")
   private static short[] method16115(short[] arg0, int arg1) {
      short[] var2 = new short[arg1];
      System.arraycopy(arg0, 0, var2, 0, arg1);
      return var2;
   }

   @deob.ObfuscatedName("yk.ba([FI)[F")
   private static float[] method16132(float[] arg0, int arg1) {
      float[] var2 = new float[arg1];
      System.arraycopy(arg0, 0, var2, 0, arg1);
      return var2;
   }

   @deob.ObfuscatedName("yk.m()I")
   public int method6980() {
      return this.field9716;
   }

   @deob.ObfuscatedName("yk.KA(I)V")
   public void method6916(int arg0) {
      this.field9716 = arg0;
      if (this.field9740 != null && (this.field9716 & 65536) == 0) {
         this.field9752 = this.field9740.field2768;
         this.field9770 = this.field9740.field2766;
         this.field9710 = this.field9740.field2767;
         this.field9734 = this.field9740.field2769;
         this.field9740 = null;
      }

      this.field9755 = true;
      this.method16118();
   }

   @deob.ObfuscatedName("yk.l()V")
   public void method6918() {
      if (this.field9777 > 0 && this.field9739 > 0) {
         this.method16128(false);
         if ((this.field9718 & 16) == 0 && this.field9742.field2127 == null) {
            this.method16158(false);
         }

         this.method16118();
      }
   }

   @deob.ObfuscatedName("yk.s(BIZ)Lqa;")
   public class745 method6914(byte arg0, int arg1, boolean arg2) {
      boolean var4 = false;
      class971 var5;
      class971 var6;
      if (arg0 > 0 && arg0 <= 7) {
         var5 = this.field9715.field10391[arg0 - 1];
         var6 = this.field9715.field10390[arg0 - 1];
         var4 = true;
      } else {
         var6 = var5 = new class971(this.field9715);
      }

      return this.method16117(var6, var5, arg1, var4, arg2);
   }

   @deob.ObfuscatedName("yk.fp(Lyk;Lyk;IZZ)Lqa;")
   private class745 method16117(class971 arg0, class971 arg1, int arg2, boolean arg3, boolean arg4) {
      arg0.field9718 = 0;
      arg0.field9716 = arg2;
      arg0.field9721 = this.field9721;
      arg0.field9763 = this.field9763;
      arg0.field9732 = this.field9732;
      arg0.field9723 = this.field9723;
      arg0.field9730 = this.field9730;
      arg0.field9777 = this.field9777;
      arg0.field9738 = this.field9738;
      arg0.field9739 = this.field9739;
      arg0.field9726 = this.field9726;
      if ((arg2 & 256) != 0) {
         arg0.field9776 = true;
      } else {
         arg0.field9776 = this.field9776;
      }

      arg0.field9722 = this.field9722;
      boolean var6 = class356.method4315(arg2, this.field9721);
      boolean var7 = class356.method4316(arg2, this.field9721);
      boolean var8 = class356.method4363(arg2, this.field9721);
      boolean var9 = var6 | var7 | var8;
      if (var9) {
         if (var6) {
            if (arg1.field9725 != null && arg1.field9725.length >= this.field9723) {
               arg0.field9725 = arg1.field9725;
            } else {
               arg0.field9725 = arg1.field9725 = new int[this.field9723];
            }
         } else {
            arg0.field9725 = this.field9725;
         }

         if (var7) {
            if (arg1.field9737 != null && arg1.field9737.length >= this.field9723) {
               arg0.field9737 = arg1.field9737;
            } else {
               arg0.field9737 = arg1.field9737 = new int[this.field9723];
            }
         } else {
            arg0.field9737 = this.field9737;
         }

         if (var8) {
            if (arg1.field9727 != null && arg1.field9727.length >= this.field9723) {
               arg0.field9727 = arg1.field9727;
            } else {
               arg0.field9727 = arg1.field9727 = new int[this.field9723];
            }
         } else {
            arg0.field9727 = this.field9727;
         }

         for(int var10 = 0; var10 < this.field9723; ++var10) {
            if (var6) {
               arg0.field9725[var10] = this.field9725[var10];
            }

            if (var7) {
               arg0.field9737[var10] = this.field9737[var10];
            }

            if (var8) {
               arg0.field9727[var10] = this.field9727[var10];
            }
         }
      } else {
         arg0.field9725 = this.field9725;
         arg0.field9737 = this.field9737;
         arg0.field9727 = this.field9727;
      }

      if (class356.method4391(arg2, this.field9721)) {
         if (arg3) {
            arg0.field9718 = (byte)(arg0.field9718 | 1);
         }

         arg0.field9764 = arg1.field9764;
         arg0.field9764.field2147 = this.field9764.field2147;
         arg0.field9764.field2144 = this.field9764.field2144;
      } else if (class356.method4326(arg2, this.field9721)) {
         arg0.field9764 = this.field9764;
      } else {
         arg0.field9764 = null;
      }

      if (class356.method4370(arg2, this.field9721)) {
         if (arg1.field9731 != null && arg1.field9731.length >= this.field9738 * -1431655765) {
            arg0.field9731 = arg1.field9731;
         } else {
            arg0.field9731 = arg1.field9731 = new short[this.field9738 * -1431655765];
         }

         for(int var11 = 0; var11 < this.field9738 * -1431655765; ++var11) {
            arg0.field9731[var11] = this.field9731[var11];
         }
      } else {
         arg0.field9731 = this.field9731;
      }

      if (class356.method4353(arg2, this.field9721)) {
         if (arg1.field9735 != null && arg1.field9735.length >= this.field9738 * -1431655765) {
            arg0.field9735 = arg1.field9735;
         } else {
            arg0.field9735 = arg1.field9735 = new byte[this.field9738 * -1431655765];
         }

         for(int var12 = 0; var12 < this.field9738 * -1431655765; ++var12) {
            arg0.field9735[var12] = this.field9735[var12];
         }
      } else {
         arg0.field9735 = this.field9735;
      }

      if (class356.method4377(arg2, this.field9721)) {
         if (arg3) {
            arg0.field9718 = (byte)(arg0.field9718 | 2);
         }

         arg0.field9749 = arg1.field9749;
         arg0.field9749.field2147 = this.field9749.field2147;
         arg0.field9749.field2144 = this.field9749.field2144;
      } else if (class356.method4328(arg2, this.field9721)) {
         arg0.field9749 = this.field9749;
      } else {
         arg0.field9749 = null;
      }

      if (class356.method4319(arg2, this.field9721)) {
         if (arg1.field9752 != null && arg1.field9752.length >= this.field9777) {
            arg0.field9752 = arg1.field9752;
            arg0.field9770 = arg1.field9770;
            arg0.field9710 = arg1.field9710;
         } else {
            int var13 = this.field9777;
            arg0.field9752 = arg1.field9752 = new short[var13];
            arg0.field9770 = arg1.field9770 = new short[var13];
            arg0.field9710 = arg1.field9710 = new short[var13];
         }

         if (this.field9740 != null) {
            if (arg1.field9740 == null) {
               arg1.field9740 = new class381();
            }

            class381 var14 = arg0.field9740 = arg1.field9740;
            if (var14.field2768 == null || var14.field2768.length < this.field9777) {
               int var15 = this.field9777;
               var14.field2768 = new short[var15];
               var14.field2766 = new short[var15];
               var14.field2767 = new short[var15];
               var14.field2769 = new byte[var15];
            }

            for(int var16 = 0; var16 < this.field9777; ++var16) {
               arg0.field9752[var16] = this.field9752[var16];
               arg0.field9770[var16] = this.field9770[var16];
               arg0.field9710[var16] = this.field9710[var16];
               var14.field2768[var16] = this.field9740.field2768[var16];
               var14.field2766[var16] = this.field9740.field2766[var16];
               var14.field2767[var16] = this.field9740.field2767[var16];
               var14.field2769[var16] = this.field9740.field2769[var16];
            }
         } else {
            for(int var17 = 0; var17 < this.field9777; ++var17) {
               arg0.field9752[var17] = this.field9752[var17];
               arg0.field9770[var17] = this.field9770[var17];
               arg0.field9710[var17] = this.field9710[var17];
            }
         }

         arg0.field9734 = this.field9734;
      } else {
         arg0.field9740 = this.field9740;
         arg0.field9752 = this.field9752;
         arg0.field9770 = this.field9770;
         arg0.field9710 = this.field9710;
         arg0.field9734 = this.field9734;
      }

      if (class356.method4332(arg2, this.field9721)) {
         if (arg3) {
            arg0.field9718 = (byte)(arg0.field9718 | 4);
         }

         arg0.field9750 = arg1.field9750;
         arg0.field9750.field2147 = this.field9750.field2147;
         arg0.field9750.field2144 = this.field9750.field2144;
      } else if (class356.method4375(arg2, this.field9721)) {
         arg0.field9750 = this.field9750;
      } else {
         arg0.field9750 = null;
      }

      if (class356.method4321(arg2, this.field9721)) {
         if (arg1.field9778 != null && arg1.field9778.length >= this.field9738 * -1431655765) {
            arg0.field9778 = arg1.field9778;
            arg0.field9708 = arg1.field9708;
         } else {
            int var18 = this.field9777;
            arg0.field9778 = arg1.field9778 = new float[var18];
            arg0.field9708 = arg1.field9708 = new float[var18];
         }

         for(int var19 = 0; var19 < this.field9777; ++var19) {
            arg0.field9778[var19] = this.field9778[var19];
            arg0.field9708[var19] = this.field9708[var19];
         }
      } else {
         arg0.field9778 = this.field9778;
         arg0.field9708 = this.field9708;
      }

      if (class356.method4398(arg2, this.field9721)) {
         if (arg3) {
            arg0.field9718 = (byte)(arg0.field9718 | 8);
         }

         arg0.field9751 = arg1.field9751;
         arg0.field9751.field2147 = this.field9751.field2147;
         arg0.field9751.field2144 = this.field9751.field2144;
      } else if (class356.method4329(arg2, this.field9721)) {
         arg0.field9751 = this.field9751;
      } else {
         arg0.field9751 = null;
      }

      if (class356.method4322(arg2, this.field9721)) {
         if (arg1.field9758 != null && arg1.field9758.length >= this.field9738 * -1431655765) {
            arg0.field9758 = arg1.field9758;
            arg0.field9743 = arg1.field9743;
            arg0.field9744 = arg1.field9744;
         } else {
            int var20 = this.field9738 * -1431655765;
            arg0.field9758 = arg1.field9758 = new short[var20];
            arg0.field9743 = arg1.field9743 = new short[var20];
            arg0.field9744 = arg1.field9744 = new short[var20];
         }

         for(int var21 = 0; var21 < this.field9738 * -1431655765; ++var21) {
            arg0.field9758[var21] = this.field9758[var21];
            arg0.field9743[var21] = this.field9743[var21];
            arg0.field9744[var21] = this.field9744[var21];
         }
      } else {
         arg0.field9758 = this.field9758;
         arg0.field9743 = this.field9743;
         arg0.field9744 = this.field9744;
      }

      if (class356.method4371(arg2, this.field9721)) {
         if (arg3) {
            arg0.field9718 = (byte)(arg0.field9718 | 16);
         }

         arg0.field9742 = arg1.field9742;
         arg0.field9742.field2127 = this.field9742.field2127;
      } else if (class356.method4330(arg2, this.field9721)) {
         arg0.field9742 = this.field9742;
      } else {
         arg0.field9742 = null;
      }

      if (class356.method4323(arg2, this.field9721)) {
         if (arg1.field9745 != null && arg1.field9745.length >= this.field9738 * -1431655765) {
            arg0.field9745 = arg1.field9745;
         } else {
            int var22 = this.field9738 * -1431655765;
            arg0.field9745 = arg1.field9745 = new short[var22];
         }

         for(int var23 = 0; var23 < this.field9738 * -1431655765; ++var23) {
            arg0.field9745[var23] = this.field9745[var23];
         }
      } else {
         arg0.field9745 = this.field9745;
      }

      if (class356.method4324(arg2, this.field9721)) {
         if (arg1.field9756 != null && arg1.field9756.length >= this.field9726) {
            arg0.field9756 = arg1.field9756;

            for(int var24 = 0; var24 < this.field9726; ++var24) {
               arg0.field9756[var24].method4271(this.field9756[var24]);
            }
         } else {
            int var25 = this.field9726;
            arg0.field9756 = arg1.field9756 = new class353[var25];

            for(int var26 = 0; var26 < this.field9726; ++var26) {
               arg0.field9756[var26] = this.field9756[var26].method4272();
            }
         }
      } else {
         arg0.field9756 = this.field9756;
      }

      arg0.field9771 = this.field9771;
      if (this.field9779) {
         arg0.field9717 = this.field9717;
         arg0.field9757 = this.field9757;
         arg0.field9761 = this.field9761;
         arg0.field9762 = this.field9762;
         arg0.field9741 = this.field9741;
         arg0.field9760 = this.field9760;
         arg0.field9719 = this.field9719;
         arg0.field9714 = this.field9714;
         arg0.field9779 = true;
      } else {
         arg0.field9779 = false;
      }

      arg0.field9728 = this.field9728;
      arg0.field9746 = this.field9746;
      arg0.field9773 = this.field9773;
      arg0.field9767 = this.field9767;
      arg0.field9766 = this.field9766;
      arg0.field9729 = this.field9729;
      arg0.field9747 = this.field9747;
      arg0.field9765 = this.field9765;
      arg0.field9736 = this.field9736;
      arg0.field9769 = this.field9769;
      return arg0;
   }

   @deob.ObfuscatedName("yk.fg()V")
   private void method16118() {
      if (this.field9755) {
         this.field9755 = false;
         if (this.field9736 == null && this.field9769 == null && this.field9771 == null && !class356.method4318(this.field9716, this.field9721)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (this.field9725 != null && !class356.method4333(this.field9716, this.field9721)) {
               if (this.field9764 != null && this.field9764.field2144 == null) {
                  this.field9755 = true;
               } else {
                  if (!this.field9779) {
                     this.method16120();
                  }

                  var1 = true;
               }
            }

            if (this.field9737 != null && !class356.method4401(this.field9716, this.field9721)) {
               if (this.field9764 != null && this.field9764.field2144 == null) {
                  this.field9755 = true;
               } else {
                  if (!this.field9779) {
                     this.method16120();
                  }

                  var2 = true;
               }
            }

            if (this.field9727 != null && !class356.method4338(this.field9716, this.field9721)) {
               if (this.field9764 != null && this.field9764.field2144 == null) {
                  this.field9755 = true;
               } else {
                  if (!this.field9779) {
                     this.method16120();
                  }

                  var3 = true;
               }
            }

            if (var1) {
               this.field9725 = null;
            }

            if (var2) {
               this.field9737 = null;
            }

            if (var3) {
               this.field9727 = null;
            }
         }

         if (this.field9767 != null && this.field9725 == null && this.field9737 == null && this.field9727 == null) {
            this.field9767 = null;
            this.field9766 = null;
         }

         if (this.field9734 != null && !class356.method4383(this.field9716, this.field9721)) {
            if (this.field9750 != null) {
               if (this.field9750.field2144 != null) {
                  this.field9710 = null;
                  this.field9770 = null;
                  this.field9752 = null;
                  this.field9734 = null;
               } else {
                  this.field9755 = true;
               }
            } else if (this.field9749 != null && this.field9749.field2144 == null) {
               this.field9755 = true;
            } else {
               this.field9710 = null;
               this.field9770 = null;
               this.field9752 = null;
               this.field9734 = null;
            }
         }

         if (this.field9731 != null && !class356.method4340(this.field9716, this.field9721)) {
            if (this.field9749 != null && this.field9749.field2144 == null) {
               this.field9755 = true;
            } else {
               this.field9731 = null;
            }
         }

         if (this.field9735 != null && !class356.method4341(this.field9716, this.field9721)) {
            if (this.field9749 != null && this.field9749.field2144 == null) {
               this.field9755 = true;
            } else {
               this.field9735 = null;
            }
         }

         if (this.field9778 != null && !class356.method4342(this.field9716, this.field9721)) {
            if (this.field9751 != null && this.field9751.field2144 == null) {
               this.field9755 = true;
            } else {
               this.field9708 = null;
               this.field9778 = null;
            }
         }

         if (this.field9745 != null && !class356.method4361(this.field9716, this.field9721)) {
            if (this.field9749 != null && this.field9749.field2144 == null) {
               this.field9755 = true;
            } else {
               this.field9745 = null;
            }
         }

         if (this.field9758 != null && !class356.method4409(this.field9716, this.field9721)) {
            if ((this.field9742 == null || this.field9742.field2127 != null) && (this.field9749 == null || this.field9749.field2144 != null)) {
               this.field9744 = null;
               this.field9743 = null;
               this.field9758 = null;
            } else {
               this.field9755 = true;
            }
         }

         if (this.field9746 != null && !class356.method4339(this.field9716, this.field9721)) {
            this.field9746 = (int[][])null;
            this.field9747 = null;
         }

         if (this.field9728 != null && !class356.method4347(this.field9716, this.field9721)) {
            this.field9728 = (int[][])null;
            this.field9729 = null;
         }

         if (this.field9773 != null && !class356.method4335(this.field9716, this.field9721)) {
            this.field9773 = (int[][])null;
         }

         if (this.field9765 != null && (this.field9716 & 2048) == 0 && (this.field9716 & 262144) == 0) {
            this.field9765 = null;
         }

      }
   }

   @deob.ObfuscatedName("yk.f(I)V")
   public void method7008(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field9730; ++var4) {
         int var5 = this.field9727[var4] * var2 + this.field9725[var4] * var3 >> 14;
         this.field9727[var4] = this.field9727[var4] * var3 - this.field9725[var4] * var2 >> 14;
         this.field9725[var4] = var5;
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.S(I)V")
   public void method6920(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field9730; ++var4) {
         int var5 = this.field9727[var4] * var2 + this.field9725[var4] * var3 >> 14;
         this.field9727[var4] = this.field9727[var4] * var3 - this.field9725[var4] * var2 >> 14;
         this.field9725[var4] = var5;
      }

      for(int var6 = 0; var6 < this.field9777; ++var6) {
         int var7 = this.field9752[var6] * var3 + this.field9710[var6] * var2 >> 14;
         this.field9710[var6] = (short)(this.field9710[var6] * var3 - this.field9752[var6] * var2 >> 14);
         this.field9752[var6] = (short)var7;
      }

      if (this.field9750 == null && this.field9749 != null) {
         this.field9749.field2144 = null;
      }

      if (this.field9750 != null) {
         this.field9750.field2144 = null;
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.t(I)V")
   public void method6921(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field9730; ++var4) {
         int var5 = this.field9737[var4] * var3 - this.field9727[var4] * var2 >> 14;
         this.field9727[var4] = this.field9737[var4] * var2 + this.field9727[var4] * var3 >> 14;
         this.field9737[var4] = var5;
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.EA(I)V")
   public void method6999(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field9730; ++var4) {
         int var5 = this.field9737[var4] * var2 + this.field9725[var4] * var3 >> 14;
         this.field9737[var4] = this.field9737[var4] * var3 - this.field9725[var4] * var2 >> 14;
         this.field9725[var4] = var5;
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.ia(III)V")
   public void method7078(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field9730; ++var4) {
         if (arg0 != 0) {
            this.field9725[var4] += arg0;
         }

         if (arg1 != 0) {
            this.field9737[var4] += arg1;
         }

         if (arg2 != 0) {
            this.field9727[var4] += arg2;
         }
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.wa()V")
   public void method7075() {
      for(int var1 = 0; var1 < this.field9730; ++var1) {
         this.field9727[var1] = -this.field9727[var1];
      }

      for(int var2 = 0; var2 < this.field9777; ++var2) {
         this.field9710[var2] = (short)(-this.field9710[var2]);
      }

      for(int var3 = 0; var3 < this.field9738 * -1431655765; ++var3) {
         short var4 = this.field9758[var3];
         this.field9758[var3] = this.field9744[var3];
         this.field9744[var3] = var4;
      }

      if (this.field9750 == null && this.field9749 != null) {
         this.field9749.field2144 = null;
      }

      if (this.field9750 != null) {
         this.field9750.field2144 = null;
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      if (this.field9742 != null) {
         this.field9742.field2127 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.oa(III)V")
   public void method6924(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field9730; ++var4) {
         if (arg0 != 128) {
            this.field9725[var4] = this.field9725[var4] * arg0 >> 7;
         }

         if (arg1 != 128) {
            this.field9737[var4] = this.field9737[var4] * arg1 >> 7;
         }

         if (arg2 != 128) {
            this.field9727[var4] = this.field9727[var4] * arg2 >> 7;
         }
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.pa(IILxa;Lxa;III)V")
   public void method6925(int arg0, int arg1, class934 arg2, class934 arg3, int arg4, int arg5, int arg6) {
      if (!this.field9779) {
         this.method16120();
      }

      int var8 = this.field9761 + arg4;
      int var9 = this.field9762 + arg4;
      int var10 = this.field9719 + arg6;
      int var11 = this.field9714 + arg6;
      if (arg0 != 1 && arg0 != 2 && arg0 != 3 && arg0 != 5 || var8 >= 0 && arg2.field9460 + var9 >> arg2.field9464 < arg2.field9463 && var10 >= 0 && arg2.field9460 + var11 >> arg2.field9464 < arg2.field9461) {
         if (arg0 != 4 && arg0 != 5) {
            int var12 = var8 >> arg2.field9464;
            int var13 = arg2.field9460 - 1 + var9 >> arg2.field9464;
            int var14 = var10 >> arg2.field9464;
            int var15 = arg2.field9460 - 1 + var11 >> arg2.field9464;
            if (arg2.method15966(var12, var14) == arg5 && arg2.method15966(var13, var14) == arg5 && arg2.method15966(var12, var15) == arg5 && arg2.method15966(var13, var15) == arg5) {
               return;
            }
         } else {
            if (arg3 == null) {
               return;
            }

            if (var8 < 0 || arg3.field9460 + var9 >> arg3.field9464 >= arg3.field9463 || var10 < 0 || arg3.field9460 + var11 >> arg3.field9464 >= arg3.field9461) {
               return;
            }
         }

         if (arg0 == 1) {
            for(int var16 = 0; var16 < this.field9730; ++var16) {
               this.field9737[var16] = this.field9737[var16] + arg2.method15965(this.field9725[var16] + arg4, this.field9727[var16] + arg6) - arg5;
            }
         } else if (arg0 == 2) {
            short var17 = this.field9741;
            if (var17 == 0) {
               return;
            }

            for(int var18 = 0; var18 < this.field9730; ++var18) {
               int var19 = (this.field9737[var18] << 16) / var17;
               if (var19 < arg1) {
                  this.field9737[var18] += (arg2.method15965(this.field9725[var18] + arg4, this.field9727[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
               }
            }
         } else if (arg0 == 3) {
            int var20 = (arg1 & 255) * 4;
            int var21 = (arg1 >> 8 & 255) * 4;
            int var22 = (arg1 >> 16 & 255) << 6;
            int var23 = (arg1 >> 24 & 255) << 6;
            if (arg4 - (var20 >> 1) < 0 || arg2.field9460 + (var20 >> 1) + arg4 >= arg2.field9463 << arg2.field9464 || arg6 - (var21 >> 1) < 0 || arg2.field9460 + (var21 >> 1) + arg6 >= arg2.field9461 << arg2.field9464) {
               return;
            }

            this.method11004(arg2, arg4, arg5, arg6, var20, var21, var22, var23);
         } else if (arg0 == 4) {
            int var24 = this.field9760 - this.field9741;

            for(int var25 = 0; var25 < this.field9730; ++var25) {
               this.field9737[var25] = this.field9737[var25] + (arg3.method15965(this.field9725[var25] + arg4, this.field9727[var25] + arg6) - arg5) + var24;
            }
         } else if (arg0 == 5) {
            int var26 = this.field9760 - this.field9741;

            for(int var27 = 0; var27 < this.field9730; ++var27) {
               int var28 = this.field9725[var27] + arg4;
               int var29 = this.field9727[var27] + arg6;
               int var30 = arg2.method15965(var28, var29);
               int var31 = arg3.method15965(var28, var29);
               int var32 = var30 - var31 - arg1;
               this.field9737[var27] = ((this.field9737[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
            }
         }

         if (this.field9764 != null) {
            this.field9764.field2144 = null;
         }

         this.field9779 = false;
      }
   }

   @deob.ObfuscatedName("yk.fa()V")
   private void method16120() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.field9730; ++var9) {
         int var10 = this.field9725[var9];
         int var11 = this.field9737[var9];
         int var12 = this.field9727[var9];
         if (var10 < var1) {
            var1 = var10;
         }

         if (var10 > var4) {
            var4 = var10;
         }

         if (var11 < var2) {
            var2 = var11;
         }

         if (var11 > var5) {
            var5 = var11;
         }

         if (var12 < var3) {
            var3 = var12;
         }

         if (var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if (var13 > var7) {
            var7 = var13;
         }

         int var14 = var11 * var11 + var10 * var10 + var12 * var12;
         if (var14 > var8) {
            var8 = var14;
         }
      }

      this.field9761 = (short)var1;
      this.field9762 = (short)var4;
      this.field9741 = (short)var2;
      this.field9760 = (short)var5;
      this.field9719 = (short)var3;
      this.field9714 = (short)var6;
      this.field9757 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.field9717 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.field9779 = true;
   }

   @deob.ObfuscatedName("yk.N()I")
   public int method7004() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9757;
   }

   @deob.ObfuscatedName("yk.n()I")
   public int method6938() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9717;
   }

   @deob.ObfuscatedName("yk.RA()I")
   public int method7033() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9761;
   }

   @deob.ObfuscatedName("yk.ya()I")
   public int method6940() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9762;
   }

   @deob.ObfuscatedName("yk.YA()I")
   public int method6941() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9741;
   }

   @deob.ObfuscatedName("yk.o()I")
   public int method6951() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9760;
   }

   @deob.ObfuscatedName("yk.AA()I")
   public int method7046() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9719;
   }

   @deob.ObfuscatedName("yk.ha()I")
   public int method6943() {
      if (!this.field9779) {
         this.method16120();
      }

      return this.field9714;
   }

   @deob.ObfuscatedName("yk.ae(Lqa;IIIZ)V")
   public void method6959(class745 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      class971 var6 = (class971)arg0;
      if (this.field9738 * -1431655765 != 0 && var6.field9738 * -1431655765 != 0) {
         int var7 = var6.field9730;
         int[] var8 = var6.field9725;
         int[] var9 = var6.field9737;
         int[] var10 = var6.field9727;
         short[] var11 = var6.field9752;
         short[] var12 = var6.field9770;
         short[] var13 = var6.field9710;
         byte[] var14 = var6.field9734;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if (this.field9740 != null) {
            var15 = this.field9740.field2768;
            var16 = this.field9740.field2766;
            var17 = this.field9740.field2767;
            var18 = this.field9740.field2769;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if (var6.field9740 != null) {
            var19 = var6.field9740.field2768;
            var20 = var6.field9740.field2766;
            var21 = var6.field9740.field2767;
            var22 = var6.field9740.field2769;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.field9766;
         short[] var24 = var6.field9767;
         if (!var6.field9779) {
            var6.method16120();
         }

         short var25 = var6.field9741;
         short var26 = var6.field9760;
         short var27 = var6.field9761;
         short var28 = var6.field9762;
         short var29 = var6.field9719;
         short var30 = var6.field9714;

         for(int var31 = 0; var31 < this.field9730; ++var31) {
            int var32 = this.field9737[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
               int var33 = this.field9725[var31] - arg1;
               if (var33 >= var27 && var33 <= var28) {
                  int var34 = this.field9727[var31] - arg3;
                  if (var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.field9766[var31];
                     int var37 = this.field9766[var31 + 1];

                     for(int var38 = var36; var38 < var37; ++var38) {
                        var35 = this.field9767[var38] - 1;
                        if (var35 == -1 || this.field9734[var35] != 0) {
                           break;
                        }
                     }

                     if (var35 != -1) {
                        for(int var39 = 0; var39 < var7; ++var39) {
                           if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                              int var40 = -1;
                              int var41 = var23[var39];
                              int var42 = var23[var39 + 1];

                              for(int var43 = var41; var43 < var42; ++var43) {
                                 var40 = var24[var43] - 1;
                                 if (var40 == -1 || var14[var40] != 0) {
                                    break;
                                 }
                              }

                              if (var40 != -1) {
                                 if (var15 == null) {
                                    this.field9740 = new class381();
                                    var15 = this.field9740.field2768 = class820.method15161(this.field9752);
                                    var16 = this.field9740.field2766 = class820.method15161(this.field9770);
                                    var17 = this.field9740.field2767 = class820.method15161(this.field9710);
                                    var18 = this.field9740.field2769 = class820.method956(this.field9734);
                                 }

                                 if (var19 == null) {
                                    class381 var44 = var6.field9740 = new class381();
                                    var19 = var44.field2768 = class820.method15161(var11);
                                    var20 = var44.field2766 = class820.method15161(var12);
                                    var21 = var44.field2767 = class820.method15161(var13);
                                    var22 = var44.field2769 = class820.method956(var14);
                                 }

                                 short var45 = this.field9752[var35];
                                 short var46 = this.field9770[var35];
                                 short var47 = this.field9710[var35];
                                 byte var48 = this.field9734[var35];
                                 int var49 = var23[var39];
                                 int var50 = var23[var39 + 1];

                                 for(int var51 = var49; var51 < var50; ++var51) {
                                    int var52 = var24[var51] - 1;
                                    if (var52 == -1) {
                                       break;
                                    }

                                    if (var22[var52] != 0) {
                                       var19[var52] += var45;
                                       var20[var52] += var46;
                                       var21[var52] += var47;
                                       var22[var52] += var48;
                                    }
                                 }

                                 short var53 = var11[var40];
                                 short var54 = var12[var40];
                                 short var55 = var13[var40];
                                 byte var56 = var14[var40];
                                 int var57 = this.field9766[var31];
                                 int var58 = this.field9766[var31 + 1];

                                 for(int var59 = var57; var59 < var58; ++var59) {
                                    int var60 = this.field9767[var59] - 1;
                                    if (var60 == -1) {
                                       break;
                                    }

                                    if (var18[var60] != 0) {
                                       var15[var60] += var53;
                                       var16[var60] += var54;
                                       var17[var60] += var55;
                                       var18[var60] += var56;
                                    }
                                 }

                                 if (this.field9750 == null && this.field9749 != null) {
                                    this.field9749.field2144 = null;
                                 }

                                 if (this.field9750 != null) {
                                    this.field9750.field2144 = null;
                                 }

                                 if (var6.field9750 == null && var6.field9749 != null) {
                                    var6.field9749.field2144 = null;
                                 }

                                 if (var6.field9750 != null) {
                                    var6.field9750.field2144 = null;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yk.p(I)V")
   public void method6944(int arg0) {
      this.field9763 = (short)arg0;
      if (this.field9749 != null) {
         this.field9749.field2144 = null;
      }

   }

   @deob.ObfuscatedName("yk.Q(I)V")
   public void method6969(int arg0) {
      this.field9732 = (short)arg0;
      if (this.field9749 != null) {
         this.field9749.field2144 = null;
      }

      if (this.field9750 != null) {
         this.field9750.field2144 = null;
      }

   }

   @deob.ObfuscatedName("yk.c()I")
   public int method6946() {
      return this.field9763;
   }

   @deob.ObfuscatedName("yk.Z()I")
   public int method6947() {
      return this.field9732;
   }

   @deob.ObfuscatedName("yk.al()[B")
   public byte[] method6948() {
      return this.field9735;
   }

   @deob.ObfuscatedName("yk.X(SS)V")
   public void method7023(short arg0, short arg1) {
      for(int var3 = 0; var3 < this.field9738 * -1431655765; ++var3) {
         if (this.field9731[var3] == arg0) {
            this.field9731[var3] = arg1;
         }
      }

      if (this.field9771 != null) {
         for(int var4 = 0; var4 < this.field9726; ++var4) {
            class368 var5 = this.field9771[var4];
            class353 var6 = this.field9756[var4];
            var6.field2262 = var6.field2262 & -16777216 | Statics.field7196[this.field9731[var5.field2374] & 65535] & 16777215;
         }
      }

      if (this.field9749 != null) {
         this.field9749.field2144 = null;
      }

   }

   @deob.ObfuscatedName("yk.an(B[B)V")
   public void method6950(byte arg0, byte[] arg1) {
      if (arg1 == null) {
         for(int var3 = 0; var3 < this.field9738 * -1431655765; ++var3) {
            this.field9735[var3] = arg0;
         }
      } else {
         for(int var4 = 0; var4 < this.field9738 * -1431655765; ++var4) {
            int var5 = 255 - (255 - (arg1[var4] & 255)) * (255 - (arg0 & 255)) / 255;
            this.field9735[var4] = (byte)var5;
         }
      }

      if (this.field9749 != null) {
         this.field9749.field2144 = null;
      }

   }

   @deob.ObfuscatedName("yk.W(SS)V")
   public void method6952(short arg0, short arg1) {
      class637 var3 = this.field9715.field7118;

      for(int var4 = 0; var4 < this.field9738 * -1431655765; ++var4) {
         if (this.field9745[var4] == arg0) {
            this.field9745[var4] = arg1;
         }
      }

      byte var5 = 0;
      byte var6 = 0;
      if (arg0 != -1) {
         class360 var7 = var3.method5112(arg0 & 65535);
         var5 = var7.field2328;
         var6 = var7.field2307;
      }

      byte var8 = 0;
      byte var9 = 0;
      if (arg1 != -1) {
         class360 var10 = var3.method5112(arg1 & 65535);
         var8 = var10.field2328;
         var9 = var10.field2307;
         if (var10.field2330 != 0 || var10.field2317 != 0) {
            this.field9722 = true;
         }
      }

      if (var5 != var8 | var6 != var9) {
         if (this.field9771 != null) {
            for(int var11 = 0; var11 < this.field9726; ++var11) {
               class368 var12 = this.field9771[var11];
               class353 var13 = this.field9756[var11];
               var13.field2262 = var13.field2262 & -16777216 | Statics.field7196[this.field9731[var12.field2374] & 65535] & 16777215;
            }
         }

         if (this.field9749 != null) {
            this.field9749.field2144 = null;
         }
      }

   }

   @deob.ObfuscatedName("yk.PA(IIII)V")
   public void method6953(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field9738 * -1431655765; ++var5) {
         int var6 = this.field9731[var5] & 65535;
         int var7 = var6 >> 10 & 63;
         int var8 = var6 >> 7 & 7;
         int var9 = var6 & 127;
         if (arg0 != -1) {
            var7 += (arg0 - var7) * arg3 >> 7;
         }

         if (arg1 != -1) {
            var8 += (arg1 - var8) * arg3 >> 7;
         }

         if (arg2 != -1) {
            var9 += (arg2 - var9) * arg3 >> 7;
         }

         this.field9731[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if (this.field9771 != null) {
         for(int var10 = 0; var10 < this.field9726; ++var10) {
            class368 var11 = this.field9771[var10];
            class353 var12 = this.field9756[var10];
            var12.field2262 = var12.field2262 & -16777216 | Statics.field7196[this.field9731[var11.field2374] & 65535] & 16777215;
         }
      }

      if (this.field9749 != null) {
         this.field9749.field2144 = null;
      }

   }

   @deob.ObfuscatedName("yk.ag()Z")
   public boolean method6954() {
      if (this.field9745 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.field9745.length; ++var1) {
            if (this.field9745[var1] != -1 && !this.field9715.field10297.method4463(this.field9745[var1], -1)) {
               return false;
            }
         }

         return true;
      }
   }

   @deob.ObfuscatedName("yk.i()Z")
   public boolean method6949() {
      return this.field9776;
   }

   @deob.ObfuscatedName("yk.u()Z")
   public boolean method6956() {
      return this.field9722;
   }

   @deob.ObfuscatedName("yk.g()V")
   protected void method6926() {
   }

   @deob.ObfuscatedName("yk.h()V")
   protected void method7027() {
   }

   @deob.ObfuscatedName("yk.ea()Z")
   protected boolean method6927() {
      if (this.field9728 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.field9723; ++var1) {
            this.field9725[var1] <<= 4;
            this.field9737[var1] <<= 4;
            this.field9727[var1] <<= 4;
         }

         Statics.field9724 = 0;
         Statics.field9780 = 0;
         Statics.field9781 = 0;
         return true;
      }
   }

   @deob.ObfuscatedName("yk.e(I[IIIIZI[I)V")
   protected void method6930(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      int var9 = arg1.length;
      if (arg0 == 0) {
         int var10 = arg2 << 4;
         int var11 = arg3 << 4;
         int var12 = arg4 << 4;
         int var13 = 0;
         Statics.field9724 = 0;
         Statics.field9780 = 0;
         Statics.field9781 = 0;

         for(int var14 = 0; var14 < var9; ++var14) {
            int var15 = arg1[var14];
            if (var15 < this.field9728.length) {
               int[] var16 = this.field9728[var15];

               for(int var17 = 0; var17 < var16.length; ++var17) {
                  int var18 = var16[var17];
                  if (this.field9729 == null || (arg6 & this.field9729[var18]) != 0) {
                     Statics.field9724 += this.field9725[var18];
                     Statics.field9780 += this.field9737[var18];
                     Statics.field9781 += this.field9727[var18];
                     ++var13;
                  }
               }
            }
         }

         if (var13 > 0) {
            Statics.field9724 = Statics.field9724 / var13 + var10;
            Statics.field9780 = Statics.field9780 / var13 + var11;
            Statics.field9781 = Statics.field9781 / var13 + var12;
            Statics.field9782 = true;
         } else {
            Statics.field9724 = var10;
            Statics.field9780 = var11;
            Statics.field9781 = var12;
         }

      } else if (arg0 == 1) {
         if (arg7 != null) {
            int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
            int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
            int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
            arg2 = var19;
            arg3 = var20;
            arg4 = var21;
         }

         int var22 = arg2 << 4;
         int var23 = arg3 << 4;
         int var24 = arg4 << 4;

         for(int var25 = 0; var25 < var9; ++var25) {
            int var26 = arg1[var25];
            if (var26 < this.field9728.length) {
               int[] var27 = this.field9728[var26];

               for(int var28 = 0; var28 < var27.length; ++var28) {
                  int var29 = var27[var28];
                  if (this.field9729 == null || (arg6 & this.field9729[var29]) != 0) {
                     this.field9725[var29] += var22;
                     this.field9737[var29] += var23;
                     this.field9727[var29] += var24;
                  }
               }
            }
         }

      } else if (arg0 == 2) {
         if (arg7 != null) {
            int var30 = arg7[9] << 4;
            int var31 = arg7[10] << 4;
            int var32 = arg7[11] << 4;
            int var33 = arg7[12] << 4;
            int var34 = arg7[13] << 4;
            int var35 = arg7[14] << 4;
            if (Statics.field9782) {
               int var36 = arg7[6] * Statics.field9781 + arg7[0] * Statics.field9724 + arg7[3] * Statics.field9780 + 8192 >> 14;
               int var37 = arg7[7] * Statics.field9781 + arg7[1] * Statics.field9724 + arg7[4] * Statics.field9780 + 8192 >> 14;
               int var38 = arg7[8] * Statics.field9781 + arg7[2] * Statics.field9724 + arg7[5] * Statics.field9780 + 8192 >> 14;
               int var39 = var33 + var36;
               int var40 = var34 + var37;
               int var41 = var35 + var38;
               Statics.field9724 = var39;
               Statics.field9780 = var40;
               Statics.field9781 = var41;
               Statics.field9782 = false;
            }

            int[] var42 = new int[9];
            int var43 = class603.field5471[arg2];
            int var44 = class603.field5469[arg2];
            int var45 = class603.field5471[arg3];
            int var46 = class603.field5469[arg3];
            int var47 = class603.field5471[arg4];
            int var48 = class603.field5469[arg4];
            int var49 = var44 * var47 + 8192 >> 14;
            int var50 = var44 * var48 + 8192 >> 14;
            var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
            var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
            var42[2] = var43 * var46 + 8192 >> 14;
            var42[3] = var43 * var48 + 8192 >> 14;
            var42[4] = var43 * var47 + 8192 >> 14;
            var42[5] = -var44;
            var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
            var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
            var42[8] = var43 * var45 + 8192 >> 14;
            int var51 = var42[2] * -Statics.field9781 + var42[0] * -Statics.field9724 + var42[1] * -Statics.field9780 + 8192 >> 14;
            int var52 = var42[5] * -Statics.field9781 + var42[3] * -Statics.field9724 + var42[4] * -Statics.field9780 + 8192 >> 14;
            int var53 = var42[8] * -Statics.field9781 + var42[6] * -Statics.field9724 + var42[7] * -Statics.field9780 + 8192 >> 14;
            int var54 = Statics.field9724 + var51;
            int var55 = Statics.field9780 + var52;
            int var56 = Statics.field9781 + var53;
            int[] var57 = new int[9];

            for(int var58 = 0; var58 < 3; ++var58) {
               for(int var59 = 0; var59 < 3; ++var59) {
                  int var60 = 0;

                  for(int var61 = 0; var61 < 3; ++var61) {
                     var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                  }

                  var57[var58 * 3 + var59] = var60 + 8192 >> 14;
               }
            }

            int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 8192 >> 14;
            int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 8192 >> 14;
            int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 8192 >> 14;
            int var65 = var54 + var62;
            int var66 = var55 + var63;
            int var67 = var56 + var64;
            int[] var68 = new int[9];

            for(int var69 = 0; var69 < 3; ++var69) {
               for(int var70 = 0; var70 < 3; ++var70) {
                  int var71 = 0;

                  for(int var72 = 0; var72 < 3; ++var72) {
                     var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                  }

                  var68[var69 * 3 + var70] = var71 + 8192 >> 14;
               }
            }

            int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 8192 >> 14;
            int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 8192 >> 14;
            int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 8192 >> 14;
            int var76 = var30 + var73;
            int var77 = var31 + var74;
            int var78 = var32 + var75;

            for(int var79 = 0; var79 < var9; ++var79) {
               int var80 = arg1[var79];
               if (var80 < this.field9728.length) {
                  int[] var81 = this.field9728[var80];

                  for(int var82 = 0; var82 < var81.length; ++var82) {
                     int var83 = var81[var82];
                     if (this.field9729 == null || (arg6 & this.field9729[var83]) != 0) {
                        int var84 = this.field9727[var83] * var68[2] + this.field9737[var83] * var68[1] + this.field9725[var83] * var68[0] + 8192 >> 14;
                        int var85 = this.field9727[var83] * var68[5] + this.field9737[var83] * var68[4] + this.field9725[var83] * var68[3] + 8192 >> 14;
                        int var86 = this.field9727[var83] * var68[8] + this.field9737[var83] * var68[7] + this.field9725[var83] * var68[6] + 8192 >> 14;
                        int var87 = var76 + var84;
                        int var88 = var77 + var85;
                        int var89 = var78 + var86;
                        this.field9725[var83] = var87;
                        this.field9737[var83] = var88;
                        this.field9727[var83] = var89;
                     }
                  }
               }
            }
         } else {
            for(int var90 = 0; var90 < var9; ++var90) {
               int var91 = arg1[var90];
               if (var91 < this.field9728.length) {
                  int[] var92 = this.field9728[var91];

                  for(int var93 = 0; var93 < var92.length; ++var93) {
                     int var94 = var92[var93];
                     if (this.field9729 == null || (arg6 & this.field9729[var94]) != 0) {
                        this.field9725[var94] -= Statics.field9724;
                        this.field9737[var94] -= Statics.field9780;
                        this.field9727[var94] -= Statics.field9781;
                        if (arg4 != 0) {
                           int var95 = class603.field5469[arg4];
                           int var96 = class603.field5471[arg4];
                           int var97 = this.field9737[var94] * var95 + this.field9725[var94] * var96 + 16383 >> 14;
                           this.field9737[var94] = this.field9737[var94] * var96 - this.field9725[var94] * var95 + 16383 >> 14;
                           this.field9725[var94] = var97;
                        }

                        if (arg2 != 0) {
                           int var98 = class603.field5469[arg2];
                           int var99 = class603.field5471[arg2];
                           int var100 = this.field9737[var94] * var99 - this.field9727[var94] * var98 + 16383 >> 14;
                           this.field9727[var94] = this.field9737[var94] * var98 + this.field9727[var94] * var99 + 16383 >> 14;
                           this.field9737[var94] = var100;
                        }

                        if (arg3 != 0) {
                           int var101 = class603.field5469[arg3];
                           int var102 = class603.field5471[arg3];
                           int var103 = this.field9727[var94] * var101 + this.field9725[var94] * var102 + 16383 >> 14;
                           this.field9727[var94] = this.field9727[var94] * var102 - this.field9725[var94] * var101 + 16383 >> 14;
                           this.field9725[var94] = var103;
                        }

                        this.field9725[var94] += Statics.field9724;
                        this.field9737[var94] += Statics.field9780;
                        this.field9727[var94] += Statics.field9781;
                     }
                  }
               }
            }

            if (arg5) {
               for(int var104 = 0; var104 < var9; ++var104) {
                  int var105 = arg1[var104];
                  if (var105 < this.field9728.length) {
                     int[] var106 = this.field9728[var105];

                     for(int var107 = 0; var107 < var106.length; ++var107) {
                        int var108 = var106[var107];
                        if (this.field9729 == null || (arg6 & this.field9729[var108]) != 0) {
                           int var109 = this.field9766[var108];
                           int var110 = this.field9766[var108 + 1];

                           for(int var111 = var109; var111 < var110; ++var111) {
                              int var112 = this.field9767[var111] - 1;
                              if (var112 == -1) {
                                 break;
                              }

                              if (arg4 != 0) {
                                 int var113 = class603.field5469[arg4];
                                 int var114 = class603.field5471[arg4];
                                 int var115 = this.field9770[var112] * var113 + this.field9752[var112] * var114 + 16383 >> 14;
                                 this.field9770[var112] = (short)(this.field9770[var112] * var114 - this.field9752[var112] * var113 + 16383 >> 14);
                                 this.field9752[var112] = (short)var115;
                              }

                              if (arg2 != 0) {
                                 int var116 = class603.field5469[arg2];
                                 int var117 = class603.field5471[arg2];
                                 int var118 = this.field9770[var112] * var117 - this.field9710[var112] * var116 + 16383 >> 14;
                                 this.field9710[var112] = (short)(this.field9770[var112] * var116 + this.field9710[var112] * var117 + 16383 >> 14);
                                 this.field9770[var112] = (short)var118;
                              }

                              if (arg3 != 0) {
                                 int var119 = class603.field5469[arg3];
                                 int var120 = class603.field5471[arg3];
                                 int var121 = this.field9752[var112] * var120 + this.field9710[var112] * var119 + 16383 >> 14;
                                 this.field9710[var112] = (short)(this.field9710[var112] * var120 - this.field9752[var112] * var119 + 16383 >> 14);
                                 this.field9752[var112] = (short)var121;
                              }
                           }
                        }
                     }
                  }
               }

               if (this.field9750 == null && this.field9749 != null) {
                  this.field9749.field2144 = null;
               }

               if (this.field9750 != null) {
                  this.field9750.field2144 = null;
               }
            }
         }

      } else if (arg0 == 3) {
         if (arg7 != null) {
            int var122 = arg7[9] << 4;
            int var123 = arg7[10] << 4;
            int var124 = arg7[11] << 4;
            int var125 = arg7[12] << 4;
            int var126 = arg7[13] << 4;
            int var127 = arg7[14] << 4;
            if (Statics.field9782) {
               int var128 = arg7[6] * Statics.field9781 + arg7[0] * Statics.field9724 + arg7[3] * Statics.field9780 + 8192 >> 14;
               int var129 = arg7[7] * Statics.field9781 + arg7[1] * Statics.field9724 + arg7[4] * Statics.field9780 + 8192 >> 14;
               int var130 = arg7[8] * Statics.field9781 + arg7[2] * Statics.field9724 + arg7[5] * Statics.field9780 + 8192 >> 14;
               int var131 = var125 + var128;
               int var132 = var126 + var129;
               int var133 = var127 + var130;
               Statics.field9724 = var131;
               Statics.field9780 = var132;
               Statics.field9781 = var133;
               Statics.field9782 = false;
            }

            int var134 = arg2 << 15 >> 7;
            int var135 = arg3 << 15 >> 7;
            int var136 = arg4 << 15 >> 7;
            int var137 = -Statics.field9724 * var134 + 8192 >> 14;
            int var138 = -Statics.field9780 * var135 + 8192 >> 14;
            int var139 = -Statics.field9781 * var136 + 8192 >> 14;
            int var140 = Statics.field9724 + var137;
            int var141 = Statics.field9780 + var138;
            int var142 = Statics.field9781 + var139;
            int[] var143 = new int[]{arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14};
            int var144 = var125 * var134 + 8192 >> 14;
            int var145 = var126 * var135 + 8192 >> 14;
            int var146 = var127 * var136 + 8192 >> 14;
            int var147 = var140 + var144;
            int var148 = var141 + var145;
            int var149 = var142 + var146;
            int[] var150 = new int[9];

            for(int var151 = 0; var151 < 3; ++var151) {
               for(int var152 = 0; var152 < 3; ++var152) {
                  int var153 = 0;

                  for(int var154 = 0; var154 < 3; ++var154) {
                     var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                  }

                  var150[var151 * 3 + var152] = var153 + 8192 >> 14;
               }
            }

            int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 8192 >> 14;
            int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 8192 >> 14;
            int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 8192 >> 14;
            int var158 = var122 + var155;
            int var159 = var123 + var156;
            int var160 = var124 + var157;

            for(int var161 = 0; var161 < var9; ++var161) {
               int var162 = arg1[var161];
               if (var162 < this.field9728.length) {
                  int[] var163 = this.field9728[var162];

                  for(int var164 = 0; var164 < var163.length; ++var164) {
                     int var165 = var163[var164];
                     if (this.field9729 == null || (arg6 & this.field9729[var165]) != 0) {
                        int var166 = this.field9727[var165] * var150[2] + this.field9737[var165] * var150[1] + this.field9725[var165] * var150[0] + 8192 >> 14;
                        int var167 = this.field9727[var165] * var150[5] + this.field9737[var165] * var150[4] + this.field9725[var165] * var150[3] + 8192 >> 14;
                        int var168 = this.field9727[var165] * var150[8] + this.field9737[var165] * var150[7] + this.field9725[var165] * var150[6] + 8192 >> 14;
                        int var169 = var158 + var166;
                        int var170 = var159 + var167;
                        int var171 = var160 + var168;
                        this.field9725[var165] = var169;
                        this.field9737[var165] = var170;
                        this.field9727[var165] = var171;
                     }
                  }
               }
            }
         } else {
            for(int var172 = 0; var172 < var9; ++var172) {
               int var173 = arg1[var172];
               if (var173 < this.field9728.length) {
                  int[] var174 = this.field9728[var173];

                  for(int var175 = 0; var175 < var174.length; ++var175) {
                     int var176 = var174[var175];
                     if (this.field9729 == null || (arg6 & this.field9729[var176]) != 0) {
                        this.field9725[var176] -= Statics.field9724;
                        this.field9737[var176] -= Statics.field9780;
                        this.field9727[var176] -= Statics.field9781;
                        this.field9725[var176] = this.field9725[var176] * arg2 >> 7;
                        this.field9737[var176] = this.field9737[var176] * arg3 >> 7;
                        this.field9727[var176] = this.field9727[var176] * arg4 >> 7;
                        this.field9725[var176] += Statics.field9724;
                        this.field9737[var176] += Statics.field9780;
                        this.field9727[var176] += Statics.field9781;
                     }
                  }
               }
            }
         }

      } else if (arg0 == 5) {
         if (this.field9746 != null) {
            for(int var177 = 0; var177 < var9; ++var177) {
               int var178 = arg1[var177];
               if (var178 < this.field9746.length) {
                  int[] var179 = this.field9746[var178];

                  for(int var180 = 0; var180 < var179.length; ++var180) {
                     int var181 = var179[var180];
                     if (this.field9747 == null || (arg6 & this.field9747[var181]) != 0) {
                        int var182 = (this.field9735[var181] & 255) + arg2 * 8;
                        if (var182 < 0) {
                           var182 = 0;
                        } else if (var182 > 255) {
                           var182 = 255;
                        }

                        this.field9735[var181] = (byte)var182;
                        if (this.field9749 != null) {
                           this.field9749.field2144 = null;
                        }
                     }
                  }
               }
            }

            if (this.field9771 != null) {
               for(int var183 = 0; var183 < this.field9726; ++var183) {
                  class368 var184 = this.field9771[var183];
                  class353 var185 = this.field9756[var183];
                  var185.field2262 = var185.field2262 & 16777215 | 255 - (this.field9735[var184.field2374] & 255) << 24;
               }
            }
         }

      } else if (arg0 == 7) {
         if (this.field9746 != null) {
            for(int var186 = 0; var186 < var9; ++var186) {
               int var187 = arg1[var186];
               if (var187 < this.field9746.length) {
                  int[] var188 = this.field9746[var187];

                  for(int var189 = 0; var189 < var188.length; ++var189) {
                     int var190 = var188[var189];
                     if (this.field9747 == null || (arg6 & this.field9747[var190]) != 0) {
                        int var191 = this.field9731[var190] & 65535;
                        int var192 = var191 >> 10 & 63;
                        int var193 = var191 >> 7 & 7;
                        int var194 = var191 & 127;
                        int var195 = arg2 + var192 & 63;
                        int var196 = arg3 / 4 + var193;
                        if (var196 < 0) {
                           var196 = 0;
                        } else if (var196 > 7) {
                           var196 = 7;
                        }

                        int var197 = arg4 + var194;
                        if (var197 < 0) {
                           var197 = 0;
                        } else if (var197 > 127) {
                           var197 = 127;
                        }

                        this.field9731[var190] = (short)(var195 << 10 | var196 << 7 | var197);
                        if (this.field9749 != null) {
                           this.field9749.field2144 = null;
                        }
                     }
                  }
               }
            }

            if (this.field9771 != null) {
               for(int var198 = 0; var198 < this.field9726; ++var198) {
                  class368 var199 = this.field9771[var198];
                  class353 var200 = this.field9756[var198];
                  var200.field2262 = var200.field2262 & -16777216 | Statics.field7196[this.field9731[var199.field2374] & 65535] & 16777215;
               }
            }
         }

      } else if (arg0 == 8) {
         if (this.field9773 != null) {
            for(int var201 = 0; var201 < var9; ++var201) {
               int var202 = arg1[var201];
               if (var202 < this.field9773.length) {
                  int[] var203 = this.field9773[var202];

                  for(int var204 = 0; var204 < var203.length; ++var204) {
                     class353 var205 = this.field9756[var203[var204]];
                     var205.field2260 += arg2;
                     var205.field2258 += arg3;
                  }
               }
            }
         }

      } else if (arg0 == 10) {
         if (this.field9773 != null) {
            for(int var206 = 0; var206 < var9; ++var206) {
               int var207 = arg1[var206];
               if (var207 < this.field9773.length) {
                  int[] var208 = this.field9773[var207];

                  for(int var209 = 0; var209 < var208.length; ++var209) {
                     class353 var210 = this.field9756[var208[var209]];
                     var210.field2261 = var210.field2261 * arg2 >> 7;
                     var210.field2259 = var210.field2259 * arg3 >> 7;
                  }
               }
            }
         }

      } else if (arg0 == 9) {
         if (this.field9773 != null) {
            for(int var211 = 0; var211 < var9; ++var211) {
               int var212 = arg1[var211];
               if (var212 < this.field9773.length) {
                  int[] var213 = this.field9773[var212];

                  for(int var214 = 0; var214 < var213.length; ++var214) {
                     class353 var215 = this.field9756[var213[var214]];
                     var215.field2257 = var215.field2257 + arg2 & 16383;
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yk.w(IIII)V")
   protected void method6931(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 == 0) {
         int var5 = 0;
         Statics.field9724 = 0;
         Statics.field9780 = 0;
         Statics.field9781 = 0;

         for(int var6 = 0; var6 < this.field9730; ++var6) {
            Statics.field9724 += this.field9725[var6];
            Statics.field9780 += this.field9737[var6];
            Statics.field9781 += this.field9727[var6];
            ++var5;
         }

         if (var5 > 0) {
            Statics.field9724 = Statics.field9724 / var5 + arg1;
            Statics.field9780 = Statics.field9780 / var5 + arg2;
            Statics.field9781 = Statics.field9781 / var5 + arg3;
         } else {
            Statics.field9724 = arg1;
            Statics.field9780 = arg2;
            Statics.field9781 = arg3;
         }

      } else if (arg0 == 1) {
         for(int var7 = 0; var7 < this.field9730; ++var7) {
            this.field9725[var7] += arg1;
            this.field9737[var7] += arg2;
            this.field9727[var7] += arg3;
         }

      } else if (arg0 == 2) {
         for(int var8 = 0; var8 < this.field9730; ++var8) {
            this.field9725[var8] -= Statics.field9724;
            this.field9737[var8] -= Statics.field9780;
            this.field9727[var8] -= Statics.field9781;
            if (arg3 != 0) {
               int var9 = class603.field5469[arg3];
               int var10 = class603.field5471[arg3];
               int var11 = this.field9737[var8] * var9 + this.field9725[var8] * var10 + 16383 >> 14;
               this.field9737[var8] = this.field9737[var8] * var10 - this.field9725[var8] * var9 + 16383 >> 14;
               this.field9725[var8] = var11;
            }

            if (arg1 != 0) {
               int var12 = class603.field5469[arg1];
               int var13 = class603.field5471[arg1];
               int var14 = this.field9737[var8] * var13 - this.field9727[var8] * var12 + 16383 >> 14;
               this.field9727[var8] = this.field9737[var8] * var12 + this.field9727[var8] * var13 + 16383 >> 14;
               this.field9737[var8] = var14;
            }

            if (arg2 != 0) {
               int var15 = class603.field5469[arg2];
               int var16 = class603.field5471[arg2];
               int var17 = this.field9727[var8] * var15 + this.field9725[var8] * var16 + 16383 >> 14;
               this.field9727[var8] = this.field9727[var8] * var16 - this.field9725[var8] * var15 + 16383 >> 14;
               this.field9725[var8] = var17;
            }

            this.field9725[var8] += Statics.field9724;
            this.field9737[var8] += Statics.field9780;
            this.field9727[var8] += Statics.field9781;
         }

      } else if (arg0 == 3) {
         for(int var18 = 0; var18 < this.field9730; ++var18) {
            this.field9725[var18] -= Statics.field9724;
            this.field9737[var18] -= Statics.field9780;
            this.field9727[var18] -= Statics.field9781;
            this.field9725[var18] = this.field9725[var18] * arg1 / 128;
            this.field9737[var18] = this.field9737[var18] * arg2 / 128;
            this.field9727[var18] = this.field9727[var18] * arg3 / 128;
            this.field9725[var18] += Statics.field9724;
            this.field9737[var18] += Statics.field9780;
            this.field9727[var18] += Statics.field9781;
         }

      } else if (arg0 == 5) {
         for(int var19 = 0; var19 < this.field9738 * -1431655765; ++var19) {
            int var20 = (this.field9735[var19] & 255) + arg1 * 8;
            if (var20 < 0) {
               var20 = 0;
            } else if (var20 > 255) {
               var20 = 255;
            }

            this.field9735[var19] = (byte)var20;
         }

         if (this.field9749 != null) {
            this.field9749.field2144 = null;
         }

         if (this.field9771 != null) {
            for(int var21 = 0; var21 < this.field9726; ++var21) {
               class368 var22 = this.field9771[var21];
               class353 var23 = this.field9756[var21];
               var23.field2262 = var23.field2262 & 16777215 | 255 - (this.field9735[var22.field2374] & 255) << 24;
            }
         }

      } else if (arg0 == 7) {
         for(int var24 = 0; var24 < this.field9738 * -1431655765; ++var24) {
            int var25 = this.field9731[var24] & 65535;
            int var26 = var25 >> 10 & 63;
            int var27 = var25 >> 7 & 7;
            int var28 = var25 & 127;
            int var29 = arg1 + var26 & 63;
            int var30 = arg2 / 4 + var27;
            if (var30 < 0) {
               var30 = 0;
            } else if (var30 > 7) {
               var30 = 7;
            }

            int var31 = arg3 + var28;
            if (var31 < 0) {
               var31 = 0;
            } else if (var31 > 127) {
               var31 = 127;
            }

            this.field9731[var24] = (short)(var29 << 10 | var30 << 7 | var31);
         }

         if (this.field9749 != null) {
            this.field9749.field2144 = null;
         }

         if (this.field9771 != null) {
            for(int var32 = 0; var32 < this.field9726; ++var32) {
               class368 var33 = this.field9771[var32];
               class353 var34 = this.field9756[var32];
               var34.field2262 = var34.field2262 & -16777216 | Statics.field7196[this.field9731[var33.field2374] & 65535] & 16777215;
            }
         }

      } else if (arg0 == 8) {
         for(int var35 = 0; var35 < this.field9726; ++var35) {
            class353 var36 = this.field9756[var35];
            var36.field2260 += arg1;
            var36.field2258 += arg2;
         }

      } else if (arg0 == 10) {
         for(int var37 = 0; var37 < this.field9726; ++var37) {
            class353 var38 = this.field9756[var37];
            var38.field2261 = var38.field2261 * arg1 >> 7;
            var38.field2259 = var38.field2259 * arg2 >> 7;
         }

      } else if (arg0 == 9) {
         for(int var39 = 0; var39 < this.field9726; ++var39) {
            class353 var40 = this.field9756[var39];
            var40.field2257 = var40.field2257 + arg1 & 16383;
         }

      }
   }

   @deob.ObfuscatedName("yk.af(I[IIIIIZ)V")
   protected void method6928(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      int var8 = arg1.length;
      if (arg0 == 0) {
         int var9 = arg2 << 4;
         int var10 = arg3 << 4;
         int var11 = arg4 << 4;
         int var12 = 0;
         Statics.field9724 = 0;
         Statics.field9780 = 0;
         Statics.field9781 = 0;

         for(int var13 = 0; var13 < var8; ++var13) {
            int var14 = arg1[var13];
            if (var14 < this.field9728.length) {
               int[] var15 = this.field9728[var14];

               for(int var16 = 0; var16 < var15.length; ++var16) {
                  int var17 = var15[var16];
                  Statics.field9724 += this.field9725[var17];
                  Statics.field9780 += this.field9737[var17];
                  Statics.field9781 += this.field9727[var17];
                  ++var12;
               }
            }
         }

         if (var12 > 0) {
            Statics.field9724 = Statics.field9724 / var12 + var9;
            Statics.field9780 = Statics.field9780 / var12 + var10;
            Statics.field9781 = Statics.field9781 / var12 + var11;
         } else {
            Statics.field9724 = var9;
            Statics.field9780 = var10;
            Statics.field9781 = var11;
         }

      } else if (arg0 == 1) {
         int var18 = arg2 << 4;
         int var19 = arg3 << 4;
         int var20 = arg4 << 4;

         for(int var21 = 0; var21 < var8; ++var21) {
            int var22 = arg1[var21];
            if (var22 < this.field9728.length) {
               int[] var23 = this.field9728[var22];

               for(int var24 = 0; var24 < var23.length; ++var24) {
                  int var25 = var23[var24];
                  this.field9725[var25] += var18;
                  this.field9737[var25] += var19;
                  this.field9727[var25] += var20;
               }
            }
         }

      } else if (arg0 == 2) {
         for(int var26 = 0; var26 < var8; ++var26) {
            int var27 = arg1[var26];
            if (var27 < this.field9728.length) {
               int[] var28 = this.field9728[var27];
               if ((arg5 & 1) == 0) {
                  for(int var29 = 0; var29 < var28.length; ++var29) {
                     int var30 = var28[var29];
                     this.field9725[var30] -= Statics.field9724;
                     this.field9737[var30] -= Statics.field9780;
                     this.field9727[var30] -= Statics.field9781;
                     if (arg4 != 0) {
                        int var31 = class603.field5469[arg4];
                        int var32 = class603.field5471[arg4];
                        int var33 = this.field9737[var30] * var31 + this.field9725[var30] * var32 + 16383 >> 14;
                        this.field9737[var30] = this.field9737[var30] * var32 - this.field9725[var30] * var31 + 16383 >> 14;
                        this.field9725[var30] = var33;
                     }

                     if (arg2 != 0) {
                        int var34 = class603.field5469[arg2];
                        int var35 = class603.field5471[arg2];
                        int var36 = this.field9737[var30] * var35 - this.field9727[var30] * var34 + 16383 >> 14;
                        this.field9727[var30] = this.field9737[var30] * var34 + this.field9727[var30] * var35 + 16383 >> 14;
                        this.field9737[var30] = var36;
                     }

                     if (arg3 != 0) {
                        int var37 = class603.field5469[arg3];
                        int var38 = class603.field5471[arg3];
                        int var39 = this.field9727[var30] * var37 + this.field9725[var30] * var38 + 16383 >> 14;
                        this.field9727[var30] = this.field9727[var30] * var38 - this.field9725[var30] * var37 + 16383 >> 14;
                        this.field9725[var30] = var39;
                     }

                     this.field9725[var30] += Statics.field9724;
                     this.field9737[var30] += Statics.field9780;
                     this.field9727[var30] += Statics.field9781;
                  }
               } else {
                  for(int var40 = 0; var40 < var28.length; ++var40) {
                     int var41 = var28[var40];
                     this.field9725[var41] -= Statics.field9724;
                     this.field9737[var41] -= Statics.field9780;
                     this.field9727[var41] -= Statics.field9781;
                     if (arg2 != 0) {
                        int var42 = class603.field5469[arg2];
                        int var43 = class603.field5471[arg2];
                        int var44 = this.field9737[var41] * var43 - this.field9727[var41] * var42 + 16383 >> 14;
                        this.field9727[var41] = this.field9737[var41] * var42 + this.field9727[var41] * var43 + 16383 >> 14;
                        this.field9737[var41] = var44;
                     }

                     if (arg4 != 0) {
                        int var45 = class603.field5469[arg4];
                        int var46 = class603.field5471[arg4];
                        int var47 = this.field9737[var41] * var45 + this.field9725[var41] * var46 + 16383 >> 14;
                        this.field9737[var41] = this.field9737[var41] * var46 - this.field9725[var41] * var45 + 16383 >> 14;
                        this.field9725[var41] = var47;
                     }

                     if (arg3 != 0) {
                        int var48 = class603.field5469[arg3];
                        int var49 = class603.field5471[arg3];
                        int var50 = this.field9727[var41] * var48 + this.field9725[var41] * var49 + 16383 >> 14;
                        this.field9727[var41] = this.field9727[var41] * var49 - this.field9725[var41] * var48 + 16383 >> 14;
                        this.field9725[var41] = var50;
                     }

                     this.field9725[var41] += Statics.field9724;
                     this.field9737[var41] += Statics.field9780;
                     this.field9727[var41] += Statics.field9781;
                  }
               }
            }
         }

         if (arg6) {
            for(int var51 = 0; var51 < var8; ++var51) {
               int var52 = arg1[var51];
               if (var52 < this.field9728.length) {
                  int[] var53 = this.field9728[var52];

                  for(int var54 = 0; var54 < var53.length; ++var54) {
                     int var55 = var53[var54];
                     int var56 = this.field9766[var55];
                     int var57 = this.field9766[var55 + 1];

                     for(int var58 = var56; var58 < var57; ++var58) {
                        int var59 = this.field9767[var58] - 1;
                        if (var59 == -1) {
                           break;
                        }

                        if (arg4 != 0) {
                           int var60 = class603.field5469[arg4];
                           int var61 = class603.field5471[arg4];
                           int var62 = this.field9770[var59] * var60 + this.field9752[var59] * var61 + 16383 >> 14;
                           this.field9770[var59] = (short)(this.field9770[var59] * var61 - this.field9752[var59] * var60 + 16383 >> 14);
                           this.field9752[var59] = (short)var62;
                        }

                        if (arg2 != 0) {
                           int var63 = class603.field5469[arg2];
                           int var64 = class603.field5471[arg2];
                           int var65 = this.field9770[var59] * var64 - this.field9710[var59] * var63 + 16383 >> 14;
                           this.field9710[var59] = (short)(this.field9770[var59] * var63 + this.field9710[var59] * var64 + 16383 >> 14);
                           this.field9770[var59] = (short)var65;
                        }

                        if (arg3 != 0) {
                           int var66 = class603.field5469[arg3];
                           int var67 = class603.field5471[arg3];
                           int var68 = this.field9752[var59] * var67 + this.field9710[var59] * var66 + 16383 >> 14;
                           this.field9710[var59] = (short)(this.field9710[var59] * var67 - this.field9752[var59] * var66 + 16383 >> 14);
                           this.field9752[var59] = (short)var68;
                        }
                     }
                  }
               }
            }

            if (this.field9750 == null && this.field9749 != null) {
               this.field9749.field2144 = null;
            }

            if (this.field9750 != null) {
               this.field9750.field2144 = null;
            }
         }

      } else if (arg0 == 3) {
         for(int var69 = 0; var69 < var8; ++var69) {
            int var70 = arg1[var69];
            if (var70 < this.field9728.length) {
               int[] var71 = this.field9728[var70];

               for(int var72 = 0; var72 < var71.length; ++var72) {
                  int var73 = var71[var72];
                  this.field9725[var73] -= Statics.field9724;
                  this.field9737[var73] -= Statics.field9780;
                  this.field9727[var73] -= Statics.field9781;
                  this.field9725[var73] = this.field9725[var73] * arg2 >> 7;
                  this.field9737[var73] = this.field9737[var73] * arg3 >> 7;
                  this.field9727[var73] = this.field9727[var73] * arg4 >> 7;
                  this.field9725[var73] += Statics.field9724;
                  this.field9737[var73] += Statics.field9780;
                  this.field9727[var73] += Statics.field9781;
               }
            }
         }

      } else if (arg0 == 5) {
         if (this.field9746 != null) {
            for(int var74 = 0; var74 < var8; ++var74) {
               int var75 = arg1[var74];
               if (var75 < this.field9746.length) {
                  int[] var76 = this.field9746[var75];

                  for(int var77 = 0; var77 < var76.length; ++var77) {
                     int var78 = var76[var77];
                     int var79 = (this.field9735[var78] & 255) + arg2 * 8;
                     if (var79 < 0) {
                        var79 = 0;
                     } else if (var79 > 255) {
                        var79 = 255;
                     }

                     this.field9735[var78] = (byte)var79;
                  }

                  if (var76.length > 0 && this.field9749 != null) {
                     this.field9749.field2144 = null;
                  }
               }
            }

            if (this.field9771 != null) {
               for(int var80 = 0; var80 < this.field9726; ++var80) {
                  class368 var81 = this.field9771[var80];
                  class353 var82 = this.field9756[var80];
                  var82.field2262 = var82.field2262 & 16777215 | 255 - (this.field9735[var81.field2374] & 255) << 24;
               }
            }
         }

      } else if (arg0 == 7) {
         if (this.field9746 != null) {
            for(int var83 = 0; var83 < var8; ++var83) {
               int var84 = arg1[var83];
               if (var84 < this.field9746.length) {
                  int[] var85 = this.field9746[var84];

                  for(int var86 = 0; var86 < var85.length; ++var86) {
                     int var87 = var85[var86];
                     int var88 = this.field9731[var87] & 65535;
                     int var89 = var88 >> 10 & 63;
                     int var90 = var88 >> 7 & 7;
                     int var91 = var88 & 127;
                     int var92 = arg2 + var89 & 63;
                     int var93 = arg3 / 4 + var90;
                     if (var93 < 0) {
                        var93 = 0;
                     } else if (var93 > 7) {
                        var93 = 7;
                     }

                     int var94 = arg4 + var91;
                     if (var94 < 0) {
                        var94 = 0;
                     } else if (var94 > 127) {
                        var94 = 127;
                     }

                     this.field9731[var87] = (short)(var92 << 10 | var93 << 7 | var94);
                  }

                  if (var85.length > 0 && this.field9749 != null) {
                     this.field9749.field2144 = null;
                  }
               }
            }

            if (this.field9771 != null) {
               for(int var95 = 0; var95 < this.field9726; ++var95) {
                  class368 var96 = this.field9771[var95];
                  class353 var97 = this.field9756[var95];
                  var97.field2262 = var97.field2262 & -16777216 | Statics.field7196[this.field9731[var96.field2374] & 65535] & 16777215;
               }
            }
         }

      } else if (arg0 == 8) {
         if (this.field9773 != null) {
            for(int var98 = 0; var98 < var8; ++var98) {
               int var99 = arg1[var98];
               if (var99 < this.field9773.length) {
                  int[] var100 = this.field9773[var99];

                  for(int var101 = 0; var101 < var100.length; ++var101) {
                     class353 var102 = this.field9756[var100[var101]];
                     var102.field2260 += arg2;
                     var102.field2258 += arg3;
                  }
               }
            }
         }

      } else if (arg0 == 10) {
         if (this.field9773 != null) {
            for(int var103 = 0; var103 < var8; ++var103) {
               int var104 = arg1[var103];
               if (var104 < this.field9773.length) {
                  int[] var105 = this.field9773[var104];

                  for(int var106 = 0; var106 < var105.length; ++var106) {
                     class353 var107 = this.field9756[var105[var106]];
                     var107.field2261 = var107.field2261 * arg2 >> 7;
                     var107.field2259 = var107.field2259 * arg3 >> 7;
                  }
               }
            }
         }

      } else if (arg0 == 9) {
         if (this.field9773 != null) {
            for(int var108 = 0; var108 < var8; ++var108) {
               int var109 = arg1[var108];
               if (var109 < this.field9773.length) {
                  int[] var110 = this.field9773[var109];

                  for(int var111 = 0; var111 < var110.length; ++var111) {
                     class353 var112 = this.field9756[var110[var111]];
                     var112.field2257 = var112.field2257 + arg2 & 16383;
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yk.ka()V")
   protected void method6932() {
      for(int var1 = 0; var1 < this.field9723; ++var1) {
         this.field9725[var1] = this.field9725[var1] + 7 >> 4;
         this.field9737[var1] = this.field9737[var1] + 7 >> 4;
         this.field9727[var1] = this.field9727[var1] + 7 >> 4;
      }

      if (this.field9764 != null) {
         this.field9764.field2144 = null;
      }

      this.field9779 = false;
   }

   @deob.ObfuscatedName("yk.at(Lka;IZ)V")
   public void method6983(class583 arg0, int arg1, boolean arg2) {
      if (this.field9729 != null) {
         class583 var4 = arg0;
         if (arg2) {
            var4 = this.field9715.field10303;
            var4.method8063(arg0);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.field9730; ++var6) {
            if ((arg1 & this.field9729[var6]) != 0) {
               var4.method8123((float)this.field9725[var6], (float)this.field9737[var6], (float)this.field9727[var6], var5);
               this.field9725[var6] = (int)var5[0];
               this.field9737[var6] = (int)var5[1];
               this.field9727[var6] = (int)var5[2];
            }
         }

      }
   }

   @deob.ObfuscatedName("yk.ab()[Lcl;")
   public class370[] method6958() {
      return this.field9769;
   }

   @deob.ObfuscatedName("yk.ao()[Ldw;")
   public class408[] method6957() {
      return this.field9736;
   }

   @deob.ObfuscatedName("yk.ak(Lka;)V")
   public void method7024(class583 arg0) {
      class597 var2 = this.field9715.field10304;
      var2.method8391(arg0);
      if (this.field9736 != null) {
         for(int var3 = 0; var3 < this.field9736.length; ++var3) {
            class408 var4 = this.field9736[var3];
            class408 var5 = var4;
            if (var4.field3072 != null) {
               var5 = var4.field3072;
            }

            var5.field3074 = (int)(var2.field5413[8] * (float)this.field9727[var4.field3079] + var2.field5413[0] * (float)this.field9725[var4.field3079] + var2.field5413[4] * (float)this.field9737[var4.field3079] + var2.field5413[12]);
            var5.field3075 = (int)(var2.field5413[9] * (float)this.field9727[var4.field3079] + var2.field5413[1] * (float)this.field9725[var4.field3079] + var2.field5413[5] * (float)this.field9737[var4.field3079] + var2.field5413[13]);
            var5.field3076 = (int)(var2.field5413[10] * (float)this.field9727[var4.field3079] + var2.field5413[2] * (float)this.field9725[var4.field3079] + var2.field5413[6] * (float)this.field9737[var4.field3079] + var2.field5413[14]);
            var5.field3069 = (int)(var2.field5413[8] * (float)this.field9727[var4.field3071] + var2.field5413[0] * (float)this.field9725[var4.field3071] + var2.field5413[4] * (float)this.field9737[var4.field3071] + var2.field5413[12]);
            var5.field3077 = (int)(var2.field5413[9] * (float)this.field9727[var4.field3071] + var2.field5413[1] * (float)this.field9725[var4.field3071] + var2.field5413[5] * (float)this.field9737[var4.field3071] + var2.field5413[13]);
            var5.field3082 = (int)(var2.field5413[10] * (float)this.field9727[var4.field3071] + var2.field5413[2] * (float)this.field9725[var4.field3071] + var2.field5413[6] * (float)this.field9737[var4.field3071] + var2.field5413[14]);
            var5.field3080 = (int)(var2.field5413[8] * (float)this.field9727[var4.field3068] + var2.field5413[0] * (float)this.field9725[var4.field3068] + var2.field5413[4] * (float)this.field9737[var4.field3068] + var2.field5413[12]);
            var5.field3070 = (int)(var2.field5413[9] * (float)this.field9727[var4.field3068] + var2.field5413[1] * (float)this.field9725[var4.field3068] + var2.field5413[5] * (float)this.field9737[var4.field3068] + var2.field5413[13]);
            var5.field3078 = (int)(var2.field5413[10] * (float)this.field9727[var4.field3068] + var2.field5413[2] * (float)this.field9725[var4.field3068] + var2.field5413[6] * (float)this.field9737[var4.field3068] + var2.field5413[14]);
         }
      }

      if (this.field9769 != null) {
         for(int var6 = 0; var6 < this.field9769.length; ++var6) {
            class370 var7 = this.field9769[var6];
            class370 var8 = var7;
            if (var7.field2387 != null) {
               var8 = var7.field2387;
            }

            if (var7.field2386 != null) {
               var7.field2386.method8386(var2);
            } else {
               var7.field2386 = new class597(var2);
            }

            var8.field2384 = (int)(var2.field5413[8] * (float)this.field9727[var7.field2383] + var2.field5413[0] * (float)this.field9725[var7.field2383] + var2.field5413[4] * (float)this.field9737[var7.field2383] + var2.field5413[12]);
            var8.field2381 = (int)(var2.field5413[9] * (float)this.field9727[var7.field2383] + var2.field5413[1] * (float)this.field9725[var7.field2383] + var2.field5413[5] * (float)this.field9737[var7.field2383] + var2.field5413[13]);
            var8.field2385 = (int)(var2.field5413[10] * (float)this.field9727[var7.field2383] + var2.field5413[2] * (float)this.field9725[var7.field2383] + var2.field5413[6] * (float)this.field9737[var7.field2383] + var2.field5413[14]);
         }
      }

   }

   @deob.ObfuscatedName("yk.aw(IILka;ZI)Z")
   public boolean method6935(int arg0, int arg1, class583 arg2, boolean arg3, int arg4) {
      class597 var6 = this.field9715.field10304;
      var6.method8391(arg2);
      var6.method8388(this.field9715.field10292);
      boolean var7 = false;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;
      int var10 = Integer.MAX_VALUE;
      int var11 = Integer.MIN_VALUE;
      if (!this.field9779) {
         this.method16120();
      }

      int var12 = this.field9762 - this.field9761 >> 1;
      int var13 = this.field9760 - this.field9741 >> 1;
      int var14 = this.field9714 - this.field9719 >> 1;
      int var15 = this.field9761 + var12;
      int var16 = this.field9741 + var13;
      int var17 = this.field9719 + var14;
      int var18 = var15 - (var12 << arg4);
      int var19 = var16 - (var13 << arg4);
      int var20 = var17 - (var14 << arg4);
      int var21 = (var12 << arg4) + var15;
      int var22 = (var13 << arg4) + var16;
      int var23 = (var14 << arg4) + var17;
      field9759[0] = var18;
      field9754[0] = var19;
      field9733[0] = var20;
      field9759[1] = var21;
      field9754[1] = var19;
      field9733[1] = var20;
      field9759[2] = var18;
      field9754[2] = var22;
      field9733[2] = var20;
      field9759[3] = var21;
      field9754[3] = var22;
      field9733[3] = var20;
      field9759[4] = var18;
      field9754[4] = var19;
      field9733[4] = var23;
      field9759[5] = var21;
      field9754[5] = var19;
      field9733[5] = var23;
      field9759[6] = var18;
      field9754[6] = var22;
      field9733[6] = var23;
      field9759[7] = var21;
      field9754[7] = var22;
      field9733[7] = var23;

      for(int var24 = 0; var24 < 8; ++var24) {
         int var25 = field9759[var24];
         int var26 = field9754[var24];
         int var27 = field9733[var24];
         float var28 = var6.field5413[10] * (float)var27 + var6.field5413[2] * (float)var25 + var6.field5413[6] * (float)var26 + var6.field5413[14];
         float var29 = var6.field5413[11] * (float)var27 + var6.field5413[3] * (float)var25 + var6.field5413[7] * (float)var26 + var6.field5413[15];
         if (var28 >= -var29) {
            float var30 = var6.field5413[8] * (float)var27 + var6.field5413[0] * (float)var25 + var6.field5413[4] * (float)var26 + var6.field5413[12];
            float var31 = var6.field5413[9] * (float)var27 + var6.field5413[1] * (float)var25 + var6.field5413[5] * (float)var26 + var6.field5413[13];
            int var32 = (int)(this.field9715.field10356 * var30 / var29 + this.field9715.field10338);
            int var33 = (int)(this.field9715.field10295 * var31 / var29 + this.field9715.field10277);
            if (var32 < var8) {
               var8 = var32;
            }

            if (var32 > var9) {
               var9 = var32;
            }

            if (var33 < var10) {
               var10 = var33;
            }

            if (var33 > var11) {
               var11 = var33;
            }

            var7 = true;
         }
      }

      if (var7 && arg0 > var8 && arg0 < var9 && arg1 > var10 && arg1 < var11) {
         if (arg3) {
            return true;
         }

         if (this.field9715.field10235.length < this.field9777) {
            this.field9715.field10235 = new int[this.field9777];
            this.field9715.field10400 = new int[this.field9777];
         }

         int[] var34 = this.field9715.field10235;
         int[] var35 = this.field9715.field10400;

         for(int var36 = 0; var36 < this.field9730; ++var36) {
            int var37 = this.field9725[var36];
            int var38 = this.field9737[var36];
            int var39 = this.field9727[var36];
            float var40 = var6.field5413[10] * (float)var39 + var6.field5413[2] * (float)var37 + var6.field5413[6] * (float)var38 + var6.field5413[14];
            float var41 = var6.field5413[11] * (float)var39 + var6.field5413[3] * (float)var37 + var6.field5413[7] * (float)var38 + var6.field5413[15];
            if (var40 >= -var41) {
               float var42 = var6.field5413[8] * (float)var39 + var6.field5413[0] * (float)var37 + var6.field5413[4] * (float)var38 + var6.field5413[12];
               float var43 = var6.field5413[9] * (float)var39 + var6.field5413[1] * (float)var37 + var6.field5413[5] * (float)var38 + var6.field5413[13];
               int var44 = this.field9766[var36];
               int var45 = this.field9766[var36 + 1];

               for(int var46 = var44; var46 < var45; ++var46) {
                  int var47 = this.field9767[var46] - 1;
                  if (var47 == -1) {
                     break;
                  }

                  var34[var47] = (int)(this.field9715.field10356 * var42 / var41 + this.field9715.field10338);
                  var35[var47] = (int)(this.field9715.field10295 * var43 / var41 + this.field9715.field10277);
               }
            } else {
               int var48 = this.field9766[var36];
               int var49 = this.field9766[var36 + 1];

               for(int var50 = var48; var50 < var49; ++var50) {
                  int var51 = this.field9767[var50] - 1;
                  if (var51 == -1) {
                     break;
                  }

                  var34[this.field9767[var50] - 1] = -999999;
               }
            }
         }

         for(int var52 = 0; var52 < this.field9738 * -1431655765; ++var52) {
            if (var34[this.field9758[var52]] != -999999 && var34[this.field9743[var52]] != -999999 && var34[this.field9744[var52]] != -999999 && this.method16133(arg0, arg1, var35[this.field9758[var52]], var35[this.field9743[var52]], var35[this.field9744[var52]], var34[this.field9758[var52]], var34[this.field9743[var52]], var34[this.field9744[var52]])) {
               return true;
            }
         }
      }

      return false;
   }

   @deob.ObfuscatedName("yk.fm(IIIIIIII)Z")
   private boolean method16133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
         return false;
      } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
         return false;
      } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
         return false;
      } else {
         return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
      }
   }

   @deob.ObfuscatedName("yk.ga(Lna;)Lna;")
   public class664 method7072(class664 arg0) {
      if (this.field9777 == 0) {
         return null;
      } else {
         if (!this.field9779) {
            this.method16120();
         }

         int var2;
         int var3;
         if (this.field9715.field10208 > 0) {
            var2 = this.field9761 - (this.field9715.field10208 * this.field9760 >> 8) >> this.field9715.field10264;
            var3 = this.field9762 - (this.field9715.field10208 * this.field9741 >> 8) >> this.field9715.field10264;
         } else {
            var2 = this.field9761 - (this.field9715.field10208 * this.field9741 >> 8) >> this.field9715.field10264;
            var3 = this.field9762 - (this.field9715.field10208 * this.field9760 >> 8) >> this.field9715.field10264;
         }

         int var4;
         int var5;
         if (this.field9715.field10370 > 0) {
            var4 = this.field9719 - (this.field9715.field10370 * this.field9760 >> 8) >> this.field9715.field10264;
            var5 = this.field9714 - (this.field9715.field10370 * this.field9741 >> 8) >> this.field9715.field10264;
         } else {
            var4 = this.field9719 - (this.field9715.field10370 * this.field9741 >> 8) >> this.field9715.field10264;
            var5 = this.field9714 - (this.field9715.field10370 * this.field9760 >> 8) >> this.field9715.field10264;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         class308 var8 = (class308)arg0;
         class308 var9;
         if (var8 != null && var8.method3893(var6, var7)) {
            var9 = var8;
            var8.method3906();
         } else {
            var9 = new class308(this.field9715, var6, var7);
         }

         var9.method3892(var2, var4, var3, var5);
         this.method16125(var9);
         return var9;
      }
   }

   @deob.ObfuscatedName("yk.fh(Lalm;)V")
   private void method16125(class308 arg0) {
      if (this.field9715.field10235.length < this.field9777) {
         this.field9715.field10235 = new int[this.field9777];
         this.field9715.field10400 = new int[this.field9777];
      }

      int[] var2 = this.field9715.field10235;
      int[] var3 = this.field9715.field10400;

      for(int var4 = 0; var4 < this.field9730; ++var4) {
         int var5 = (this.field9725[var4] - (this.field9737[var4] * this.field9715.field10208 >> 8) >> this.field9715.field10264) - arg0.field1924;
         int var6 = (this.field9727[var4] - (this.field9737[var4] * this.field9715.field10370 >> 8) >> this.field9715.field10264) - arg0.field1922;
         int var7 = this.field9766[var4];
         int var8 = this.field9766[var4 + 1];

         for(int var9 = var7; var9 < var8; ++var9) {
            int var10 = (this.field9767[var9] & 65535) - 1;
            if (var10 == -1) {
               break;
            }

            var2[var10] = var5;
            var3[var10] = var6;
         }
      }

      for(int var11 = 0; var11 < this.field9739; ++var11) {
         if (this.field9735 == null || this.field9735[var11] <= 128) {
            int var12 = this.field9758[var11] & 65535;
            int var13 = this.field9743[var11] & 65535;
            int var14 = this.field9744[var11] & 65535;
            int var15 = var2[var12];
            int var16 = var2[var13];
            int var17 = var2[var14];
            int var18 = var3[var12];
            int var19 = var3[var13];
            int var20 = var3[var14];
            if ((var15 - var16) * (var19 - var20) - (var17 - var16) * (var19 - var18) > 0) {
               arg0.method3895(var18, var19, var20, var15, var16, var17);
            }
         }
      }

   }

   @deob.ObfuscatedName("yk.ah(Lka;Ldi;I)V")
   public void method7001(class583 arg0, class394 arg1, int arg2) {
      if ((arg2 & 2) != 0) {
         OpenGL.glPolygonMode(1032, 6913);
      }

      if (this.field9777 != 0) {
         class597 var4 = this.field9715.field10290;
         class597 var5 = this.field9715.field10304;
         class597 var6 = this.field9715.field10255;
         var5.method8391(arg0);
         var6.method8386(var5);
         var6.method8388(this.field9715.field10292);
         if (!this.field9779) {
            this.method16120();
         }

         float[] var7 = this.field9715.field10294;
         var5.method8394(0.0F, (float)this.field9741, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method8394(0.0F, (float)this.field9760, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.field9715.field10336[var14];
            float var16 = var15[2] * var10 + var15[0] * var8 + var15[1] * var9 + var15[3] + (float)this.field9757;
            float var17 = var15[2] * var13 + var15[0] * var11 + var15[1] * var12 + var15[3] + (float)this.field9757;
            if (var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field9762 + this.field9761 >> 1;
            int var21 = this.field9719 + this.field9714 >> 1;
            short var23 = this.field9741;
            float var25 = var6.field5413[8] * (float)var21 + var6.field5413[0] * (float)var20 + var6.field5413[4] * (float)var23 + var6.field5413[12];
            float var26 = var6.field5413[9] * (float)var21 + var6.field5413[1] * (float)var20 + var6.field5413[5] * (float)var23 + var6.field5413[13];
            float var27 = var6.field5413[10] * (float)var21 + var6.field5413[2] * (float)var20 + var6.field5413[6] * (float)var23 + var6.field5413[14];
            float var28 = var6.field5413[11] * (float)var21 + var6.field5413[3] * (float)var20 + var6.field5413[7] * (float)var23 + var6.field5413[15];
            if (var27 >= -var28) {
               arg1.field2900 = (int)(this.field9715.field10356 * var25 / var28 + this.field9715.field10338);
               arg1.field2897 = (int)(this.field9715.field10295 * var26 / var28 + this.field9715.field10277);
            } else {
               var18 = true;
            }

            short var30 = this.field9760;
            float var32 = var6.field5413[8] * (float)var21 + var6.field5413[0] * (float)var20 + var6.field5413[4] * (float)var30 + var6.field5413[12];
            float var33 = var6.field5413[9] * (float)var21 + var6.field5413[1] * (float)var20 + var6.field5413[5] * (float)var30 + var6.field5413[13];
            float var34 = var6.field5413[10] * (float)var21 + var6.field5413[2] * (float)var20 + var6.field5413[6] * (float)var30 + var6.field5413[14];
            float var35 = var6.field5413[11] * (float)var21 + var6.field5413[3] * (float)var20 + var6.field5413[7] * (float)var30 + var6.field5413[15];
            if (var34 >= -var35) {
               arg1.field2899 = (int)(this.field9715.field10356 * var32 / var35 + this.field9715.field10338);
               arg1.field2898 = (int)(this.field9715.field10295 * var33 / var35 + this.field9715.field10277);
            } else {
               var18 = true;
            }

            if (var18) {
               if (var27 < -var28 && var34 < -var35) {
                  var19 = false;
               } else if (var27 < -var28) {
                  float var36 = (var27 + var28) / (var34 + var35) - 1.0F;
                  float var37 = (var32 - var25) * var36 + var25;
                  float var38 = (var33 - var26) * var36 + var26;
                  float var39 = (var35 - var28) * var36 + var28;
                  arg1.field2900 = (int)(this.field9715.field10356 * var37 / var39 + this.field9715.field10338);
                  arg1.field2897 = (int)(this.field9715.field10295 * var38 / var39 + this.field9715.field10277);
               } else if (var34 < -var35) {
                  float var40 = (var34 + var35) / (var27 + var28) - 1.0F;
                  float var41 = (var25 - var32) * var40 + var32;
                  float var42 = (var26 - var33) * var40 + var33;
                  float var43 = (var28 - var35) * var40 + var35;
                  arg1.field2899 = (int)(this.field9715.field10356 * var41 / var43 + this.field9715.field10338);
                  arg1.field2898 = (int)(this.field9715.field10295 * var42 / var43 + this.field9715.field10277);
               }
            }

            if (var19) {
               if (var27 / var28 > var34 / var35) {
                  float var44 = var4.field5413[0] * (float)this.field9757 + var25 + var4.field5413[12];
                  float var45 = var4.field5413[3] * (float)this.field9757 + var28 + var4.field5413[15];
                  arg1.field2901 = (int)(this.field9715.field10356 * var44 / var45 + (this.field9715.field10338 - (float)arg1.field2900));
               } else {
                  float var46 = var4.field5413[0] * (float)this.field9757 + var32 + var4.field5413[12];
                  float var47 = var4.field5413[3] * (float)this.field9757 + var35 + var4.field5413[15];
                  arg1.field2901 = (int)(this.field9715.field10356 * var46 / var47 + (this.field9715.field10338 - (float)arg1.field2899));
               }

               arg1.field2896 = true;
            }
         }

         this.field9715.method16636();
         this.field9715.method16612(var5);
         this.method16126();
         this.field9715.method16688();
         var5.method8388(this.field9715.field10269);
         this.method16127(var5);
         if ((arg2 & 2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
         }

      }
   }

   @deob.ObfuscatedName("yk.fx()V")
   private void method16126() {
      if (this.field9739 != 0) {
         if (this.field9718 != 0) {
            this.method16128(true);
         }

         this.method16128(false);
         if (this.field9742 != null) {
            if (this.field9742.field2127 == null) {
               this.method16158((this.field9718 & 16) != 0);
            }

            if (this.field9742.field2127 != null) {
               this.field9715.method16610(this.field9750 != null);
               this.field9715.method16631(this.field9764, this.field9750, this.field9749, this.field9751);
               int var1 = this.field9765.length - 1;

               for(int var2 = 0; var2 < var1; ++var2) {
                  int var3 = this.field9765[var2];
                  int var4 = this.field9765[var2 + 1];
                  int var5 = this.field9745[var3] & 65535;
                  if (var5 == 65535) {
                     var5 = -1;
                  }

                  this.field9715.method16637(var5, this.field9750 != null);
                  this.field9715.method16633(this.field9742.field2127, 4, var3 * 3, (var4 - var3) * 3);
               }
            }
         }

         this.method16118();
      }
   }

   @deob.ObfuscatedName("yk.gu(Lko;)V")
   private void method16127(class597 arg0) {
      if (this.field9771 != null) {
         class597 var2 = this.field9715.field10259;
         this.field9715.method16611();
         this.field9715.method7551(!this.field9776);
         this.field9715.method16610(false);
         this.field9715.method16631(this.field9715.field10393, (class340)null, (class340)null, this.field9715.field10394);

         for(int var3 = 0; var3 < this.field9726; ++var3) {
            class368 var4 = this.field9771[var3];
            class353 var5 = this.field9756[var3];
            if (!var4.field2379 || !this.field9715.method7574()) {
               float var6 = (float)(this.field9725[var4.field2376] + this.field9725[var4.field2372] + this.field9725[var4.field2373]) * 0.3333333F;
               float var7 = (float)(this.field9737[var4.field2376] + this.field9737[var4.field2372] + this.field9737[var4.field2373]) * 0.3333333F;
               float var8 = (float)(this.field9727[var4.field2376] + this.field9727[var4.field2372] + this.field9727[var4.field2373]) * 0.3333333F;
               float var9 = arg0.field5413[8] * var8 + arg0.field5413[0] * var6 + arg0.field5413[4] * var7 + arg0.field5413[12];
               float var10 = arg0.field5413[9] * var8 + arg0.field5413[1] * var6 + arg0.field5413[5] * var7 + arg0.field5413[13];
               float var11 = arg0.field5413[10] * var8 + arg0.field5413[2] * var6 + arg0.field5413[6] * var7 + arg0.field5413[14];
               float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var9 * var9 + var10 * var10))) * (float)var4.field2380;
               var2.method8481(var5.field2257, var4.field2375 * var5.field2261 >> 7, var4.field2371 * var5.field2259 >> 7, (float)var5.field2260 + var9 - var9 * var12, (float)var5.field2258 + var10 - var10 * var12, var11 - var11 * var12);
               this.field9715.method16613(var2);
               int var13 = var5.field2262;
               OpenGL.glColor4ub((byte)(var13 >> 16), (byte)(var13 >> 8), (byte)var13, (byte)(var13 >> 24));
               this.field9715.method16617(var4.field2377);
               this.field9715.method16652(var4.field2378);
               this.field9715.method16632(7, 0, 4);
            }
         }

         this.field9715.method7551(true);
         this.field9715.method16688();
      }

   }

   @deob.ObfuscatedName("yk.gi(Z)V")
   private void method16158(boolean arg0) {
      if (this.field9715.field10296.field931.length < this.field9739 * 6) {
         this.field9715.field10296 = new class268((this.field9739 + 100) * 6);
      } else {
         this.field9715.field10296.field935 = 0;
      }

      class268 var2 = this.field9715.field10296;
      if (this.field9715.field10274) {
         for(int var3 = 0; var3 < this.field9739; ++var3) {
            var2.method1569(this.field9758[var3]);
            var2.method1569(this.field9743[var3]);
            var2.method1569(this.field9744[var3]);
         }
      } else {
         for(int var4 = 0; var4 < this.field9739; ++var4) {
            var2.method1668(this.field9758[var4]);
            var2.method1668(this.field9743[var4]);
            var2.method1668(this.field9744[var4]);
         }
      }

      if (var2.field935 != 0) {
         if (arg0) {
            if (this.field9748 == null) {
               this.field9748 = this.field9715.method16746(5123, var2.field931, var2.field935, true);
            } else {
               this.field9748.method4539(5123, var2.field931, var2.field935);
            }

            this.field9742.field2127 = this.field9748;
         } else {
            this.field9742.field2127 = this.field9715.method16746(5123, var2.field931, var2.field935, false);
         }

         if (!arg0) {
            this.field9755 = true;
         }

      }
   }

   @deob.ObfuscatedName("yk.gn(Z)V")
   private void method16128(boolean arg0) {
      boolean var2 = this.field9749 != null && this.field9749.field2144 == null;
      boolean var3 = this.field9750 != null && this.field9750.field2144 == null;
      boolean var4 = this.field9764 != null && this.field9764.field2144 == null;
      boolean var5 = this.field9751 != null && this.field9751.field2144 == null;
      if (arg0) {
         var2 &= (this.field9718 & 2) != 0;
         var3 &= (this.field9718 & 4) != 0;
         var4 &= (this.field9718 & 1) != 0;
         var5 &= (this.field9718 & 8) != 0;
      }

      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      if (var4) {
         var7 = var6;
         var6 = (byte)(var6 + 12);
      }

      if (var2) {
         var8 = var6;
         var6 = (byte)(var6 + 4);
      }

      if (var3) {
         var9 = var6;
         var6 = (byte)(var6 + 12);
      }

      if (var5) {
         var10 = var6;
         var6 = (byte)(var6 + 8);
      }

      if (var6 != 0) {
         if (this.field9715.field10296.field931.length < this.field9777 * var6) {
            this.field9715.field10296 = new class268((this.field9777 + 100) * var6);
         } else {
            this.field9715.field10296.field935 = 0;
         }

         class268 var11 = this.field9715.field10296;
         if (var4) {
            if (this.field9715.field10274) {
               for(int var12 = 0; var12 < this.field9730; ++var12) {
                  int var13 = Stream.floatToRawIntBits((float)this.field9725[var12]);
                  int var14 = Stream.floatToRawIntBits((float)this.field9737[var12]);
                  int var15 = Stream.floatToRawIntBits((float)this.field9727[var12]);
                  int var16 = this.field9766[var12];
                  int var17 = this.field9766[var12 + 1];

                  for(int var18 = var16; var18 < var17; ++var18) {
                     int var19 = this.field9767[var18] - 1;
                     if (var19 == -1) {
                        break;
                     }

                     var11.field935 = var6 * var19;
                     var11.method1572(var13);
                     var11.method1572(var14);
                     var11.method1572(var15);
                  }
               }
            } else {
               for(int var20 = 0; var20 < this.field9730; ++var20) {
                  int var21 = Stream.floatToRawIntBits((float)this.field9725[var20]);
                  int var22 = Stream.floatToRawIntBits((float)this.field9737[var20]);
                  int var23 = Stream.floatToRawIntBits((float)this.field9727[var20]);
                  int var24 = this.field9766[var20];
                  int var25 = this.field9766[var20 + 1];

                  for(int var26 = var24; var26 < var25; ++var26) {
                     int var27 = (this.field9767[var26] & 65535) - 1;
                     if (var27 == -1) {
                        break;
                     }

                     var11.field935 = var6 * var27;
                     var11.method1573(var21);
                     var11.method1573(var22);
                     var11.method1573(var23);
                  }
               }
            }
         }

         if (var2) {
            if (this.field9750 == null) {
               short[] var28;
               short[] var29;
               short[] var30;
               byte[] var31;
               if (this.field9740 != null) {
                  var28 = this.field9740.field2768;
                  var29 = this.field9740.field2766;
                  var30 = this.field9740.field2767;
                  var31 = this.field9740.field2769;
               } else {
                  var28 = this.field9752;
                  var29 = this.field9770;
                  var30 = this.field9710;
                  var31 = this.field9734;
               }

               float var32 = this.field9715.field10324[0];
               float var33 = this.field9715.field10324[1];
               float var34 = this.field9715.field10324[2];
               float var35 = this.field9715.field10330;
               float var36 = this.field9715.field10288 * 768.0F / (float)this.field9732;
               float var37 = this.field9715.field10332 * 768.0F / (float)this.field9732;

               for(int var38 = 0; var38 < this.field9738 * -1431655765; ++var38) {
                  int var39 = this.method16121(this.field9731[var38], this.field9745[var38], this.field9763, this.field9735[var38]);
                  float var40 = (float)(var39 >>> 24) * this.field9715.field10327;
                  float var41 = (float)(var39 >> 16 & 255) * this.field9715.field10215;
                  float var42 = (float)(var39 >> 8 & 255) * this.field9715.field10329;
                  short var43 = this.field9758[var38];
                  short var44 = (short)var31[var43];
                  float var45;
                  if (var44 == 0) {
                     var45 = ((float)var30[var43] * var34 + (float)var28[var43] * var32 + (float)var29[var43] * var33) * 0.0026041667F;
                  } else {
                     var45 = ((float)var30[var43] * var34 + (float)var28[var43] * var32 + (float)var29[var43] * var33) / (float)(var44 * 256);
                  }

                  float var46 = var35 + var45 * (var45 < 0.0F ? var37 : var36);
                  int var47 = (int)(var40 * var46);
                  if (var47 < 0) {
                     var47 = 0;
                  } else if (var47 > 255) {
                     var47 = 255;
                  }

                  int var48 = (int)(var41 * var46);
                  if (var48 < 0) {
                     var48 = 0;
                  } else if (var48 > 255) {
                     var48 = 255;
                  }

                  int var49 = (int)(var42 * var46);
                  if (var49 < 0) {
                     var49 = 0;
                  } else if (var49 > 255) {
                     var49 = 255;
                  }

                  var11.field935 = var6 * var43 + var8;
                  var11.method1568(var47);
                  var11.method1568(var48);
                  var11.method1568(var49);
                  var11.method1568(255 - (this.field9735[var38] & 255));
                  short var50 = this.field9743[var38];
                  short var51 = (short)var31[var50];
                  float var52;
                  if (var51 == 0) {
                     var52 = ((float)var30[var50] * var34 + (float)var28[var50] * var32 + (float)var29[var50] * var33) * 0.0026041667F;
                  } else {
                     var52 = ((float)var30[var50] * var34 + (float)var28[var50] * var32 + (float)var29[var50] * var33) / (float)(var51 * 256);
                  }

                  float var53 = var35 + var52 * (var52 < 0.0F ? var37 : var36);
                  int var54 = (int)(var40 * var53);
                  if (var54 < 0) {
                     var54 = 0;
                  } else if (var54 > 255) {
                     var54 = 255;
                  }

                  int var55 = (int)(var41 * var53);
                  if (var55 < 0) {
                     var55 = 0;
                  } else if (var55 > 255) {
                     var55 = 255;
                  }

                  int var56 = (int)(var42 * var53);
                  if (var56 < 0) {
                     var56 = 0;
                  } else if (var56 > 255) {
                     var56 = 255;
                  }

                  var11.field935 = var6 * var50 + var8;
                  var11.method1568(var54);
                  var11.method1568(var55);
                  var11.method1568(var56);
                  var11.method1568(255 - (this.field9735[var38] & 255));
                  short var57 = this.field9744[var38];
                  short var58 = (short)var31[var57];
                  float var59;
                  if (var58 == 0) {
                     var59 = ((float)var30[var57] * var34 + (float)var28[var57] * var32 + (float)var29[var57] * var33) * 0.0026041667F;
                  } else {
                     var59 = ((float)var30[var57] * var34 + (float)var28[var57] * var32 + (float)var29[var57] * var33) / (float)(var58 * 256);
                  }

                  float var60 = var35 + var59 * (var59 < 0.0F ? var37 : var36);
                  int var61 = (int)(var40 * var60);
                  if (var61 < 0) {
                     var61 = 0;
                  } else if (var61 > 255) {
                     var61 = 255;
                  }

                  int var62 = (int)(var41 * var60);
                  if (var62 < 0) {
                     var62 = 0;
                  } else if (var62 > 255) {
                     var62 = 255;
                  }

                  int var63 = (int)(var42 * var60);
                  if (var63 < 0) {
                     var63 = 0;
                  } else if (var63 > 255) {
                     var63 = 255;
                  }

                  var11.field935 = var6 * var57 + var8;
                  var11.method1568(var61);
                  var11.method1568(var62);
                  var11.method1568(var63);
                  var11.method1568(255 - (this.field9735[var38] & 255));
               }
            } else {
               for(int var64 = 0; var64 < this.field9738 * -1431655765; ++var64) {
                  int var65 = this.method16121(this.field9731[var64], this.field9745[var64], this.field9763, this.field9735[var64]);
                  var11.field935 = (this.field9758[var64] & 65535) * var6 + var8;
                  var11.method1572(var65);
                  var11.field935 = (this.field9743[var64] & 65535) * var6 + var8;
                  var11.method1572(var65);
                  var11.field935 = (this.field9744[var64] & 65535) * var6 + var8;
                  var11.method1572(var65);
               }
            }
         }

         if (var3) {
            short[] var66;
            short[] var67;
            short[] var68;
            byte[] var69;
            if (this.field9740 != null) {
               var66 = this.field9740.field2768;
               var67 = this.field9740.field2766;
               var68 = this.field9740.field2767;
               var69 = this.field9740.field2769;
            } else {
               var66 = this.field9752;
               var67 = this.field9770;
               var68 = this.field9710;
               var69 = this.field9734;
            }

            float var70 = 3.0F / (float)this.field9732;
            float var71 = 3.0F / (float)(this.field9732 / 2 + this.field9732);
            var11.field935 = var9;
            if (this.field9715.field10274) {
               for(int var72 = 0; var72 < this.field9777; ++var72) {
                  int var73 = var69[var72] & 255;
                  if (var73 == 0) {
                     var11.method3569((float)var66[var72] * var71);
                     var11.method3569((float)var67[var72] * var71);
                     var11.method3569((float)var68[var72] * var71);
                  } else {
                     float var74 = var70 / (float)var73;
                     var11.method3569((float)var66[var72] * var74);
                     var11.method3569((float)var67[var72] * var74);
                     var11.method3569((float)var68[var72] * var74);
                  }

                  var11.field935 += var6 - 12;
               }
            } else {
               for(int var75 = 0; var75 < this.field9777; ++var75) {
                  int var76 = var69[var75] & 255;
                  if (var76 == 0) {
                     var11.method3570((float)var66[var75] * var71);
                     var11.method3570((float)var67[var75] * var71);
                     var11.method3570((float)var68[var75] * var71);
                  } else {
                     float var77 = var70 / (float)var76;
                     var11.method3570((float)var66[var75] * var77);
                     var11.method3570((float)var67[var75] * var77);
                     var11.method3570((float)var68[var75] * var77);
                  }

                  var11.field935 += var6 - 12;
               }
            }
         }

         if (var5) {
            var11.field935 = var10;
            if (this.field9715.field10274) {
               for(int var78 = 0; var78 < this.field9777; ++var78) {
                  var11.method3569(this.field9778[var78]);
                  var11.method3569(this.field9708[var78]);
                  var11.field935 += var6 - 8;
               }
            } else {
               for(int var79 = 0; var79 < this.field9777; ++var79) {
                  var11.method3570(this.field9778[var79]);
                  var11.method3570(this.field9708[var79]);
                  var11.field935 += var6 - 8;
               }
            }
         }

         var11.field935 = this.field9777 * var6;
         class341 var80;
         if (arg0) {
            if (this.field9772 == null) {
               this.field9772 = this.field9715.method16627(var6, var11.field931, var11.field935, true);
            } else {
               this.field9772.method4156(var6, var11.field931, var11.field935);
            }

            var80 = this.field9772;
            this.field9718 = 0;
         } else {
            var80 = this.field9715.method16627(var6, var11.field931, var11.field935, false);
            this.field9755 = true;
         }

         if (var4) {
            this.field9764.field2144 = var80;
            this.field9764.field2147 = var7;
         }

         if (var5) {
            this.field9751.field2144 = var80;
            this.field9751.field2147 = var10;
         }

         if (var2) {
            this.field9749.field2144 = var80;
            this.field9749.field2147 = var8;
         }

         if (var3) {
            this.field9750.field2144 = var80;
            this.field9750.field2147 = var9;
         }

      }
   }

   @deob.ObfuscatedName("yk.gj(ISIB)I")
   private int method16121(int arg0, short arg1, int arg2, byte arg3) {
      int var5 = Statics.field7196[method16129(arg0, arg2)];
      if (arg1 != -1) {
         class360 var6 = this.field9715.field7118.method5112(arg1 & 65535);
         int var7 = var6.field2328 & 255;
         if (var7 != 0) {
            int var8;
            if (arg2 < 0) {
               var8 = 0;
            } else if (arg2 > 127) {
               var8 = 16777215;
            } else {
               var8 = arg2 * 131586;
            }

            if (var7 == 256) {
               var5 = var8;
            } else {
               int var10 = 256 - var7;
               var5 = ((var5 & 16711935) * var10 + (var8 & 16711935) * var7 & -16711936) + ((var5 & 65280) * var10 + (var8 & 65280) * var7 & 16711680) >> 8;
            }
         }

         int var11 = var6.field2307 & 255;
         if (var11 != 0) {
            var11 += 256;
            int var12 = ((var5 & 16711680) >> 16) * var11;
            if (var12 > 65535) {
               var12 = 65535;
            }

            int var13 = ((var5 & 65280) >> 8) * var11;
            if (var13 > 65535) {
               var13 = 65535;
            }

            int var14 = (var5 & 255) * var11;
            if (var14 > 65535) {
               var14 = 65535;
            }

            var5 = (var14 >> 8) + (var12 << 8 & 16711680) + (var13 & 65280);
         }
      }

      return var5 << 8 | 255 - (arg3 & 255);
   }

   @deob.ObfuscatedName("yk.gb(II)I")
   private static final int method16129(int arg0, int arg1) {
      int var2 = (arg0 & 127) * arg1 >> 7;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 126) {
         var2 = 126;
      }

      return (arg0 & 65408) + var2;
   }
}
