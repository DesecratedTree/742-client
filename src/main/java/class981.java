import java.nio.ByteBuffer;
import sun.misc.Unsafe;

@deob.ObfuscatedName("yu")
public class class981 extends class745 {
   @deob.ObfuscatedName("yu.s")
   private int field10206;
   @deob.ObfuscatedName("yu.l")
   private int field10140;
   @deob.ObfuscatedName("yu.z")
   private int field10205;
   @deob.ObfuscatedName("yu.ai")
   private int field10156;
   @deob.ObfuscatedName("yu.ap")
   private int field10157;
   @deob.ObfuscatedName("yu.ae")
   private boolean field10204;
   @deob.ObfuscatedName("yu.az")
   private boolean field10191;
   @deob.ObfuscatedName("yu.aq")
   private boolean field10173;
   @deob.ObfuscatedName("yu.ar")
   private boolean field10190;
   @deob.ObfuscatedName("yu.ad")
   private boolean field10177;
   @deob.ObfuscatedName("yu.bk")
   private float[] field10196;
   @deob.ObfuscatedName("yu.bo")
   private int[] field10197;
   @deob.ObfuscatedName("yu.bj")
   private int[] field10198;
   @deob.ObfuscatedName("yu.bv")
   private final int[] field10199;
   @deob.ObfuscatedName("yu.bd")
   private final int[] field10200;
   @deob.ObfuscatedName("yu.bi")
   private final int[] field10201;
   @deob.ObfuscatedName("yu.r")
   private final class979 field10141;
   @deob.ObfuscatedName("yu.p")
   private int field10135;
   @deob.ObfuscatedName("yu.o")
   private int field10185;
   @deob.ObfuscatedName("yu.ak")
   private class515 field10132;
   @deob.ObfuscatedName("yu.ab")
   private class515 field10170;
   @deob.ObfuscatedName("yu.aa")
   private class515 field10168;
   @deob.ObfuscatedName("yu.ao")
   private class515 field10169;
   @deob.ObfuscatedName("yu.ag")
   private class482 field10166;
   @deob.ObfuscatedName("yu.bg")
   private int[] field10136;
   @deob.ObfuscatedName("yu.u")
   private int[] field10174;
   @deob.ObfuscatedName("yu.v")
   private int[] field10142;
   @deob.ObfuscatedName("yu.g")
   private int[] field10143;
   @deob.ObfuscatedName("yu.e")
   private short[] field10145;
   @deob.ObfuscatedName("yu.bw")
   private class408[] field10151;
   @deob.ObfuscatedName("yu.bq")
   private class370[] field10193;
   @deob.ObfuscatedName("yu.by")
   private int field10144;
   @deob.ObfuscatedName("yu.bx")
   private class501[] field10175;
   @deob.ObfuscatedName("yu.bm")
   private class507[] field10148;
   @deob.ObfuscatedName("yu.m")
   private short[] field10147;
   @deob.ObfuscatedName("yu.i")
   private short[] field10192;
   @deob.ObfuscatedName("yu.t")
   private short[] field10149;
   @deob.ObfuscatedName("yu.c")
   private short[] field10150;
   @deob.ObfuscatedName("yu.w")
   private short[] field10171;
   @deob.ObfuscatedName("yu.q")
   private byte[] field10152;
   @deob.ObfuscatedName("yu.y")
   private float[] field10153;
   @deob.ObfuscatedName("yu.j")
   private float[] field10154;
   @deob.ObfuscatedName("yu.av")
   private short[] field10158;
   @deob.ObfuscatedName("yu.ax")
   private byte[] field10159;
   @deob.ObfuscatedName("yu.af")
   private short[] field10160;
   @deob.ObfuscatedName("yu.at")
   private short[] field10161;
   @deob.ObfuscatedName("yu.ah")
   private short[] field10162;
   @deob.ObfuscatedName("yu.aw")
   private short[] field10203;
   @deob.ObfuscatedName("yu.an")
   private short[] field10186;
   @deob.ObfuscatedName("yu.a")
   private short field10146;
   @deob.ObfuscatedName("yu.x")
   private short field10138;
   @deob.ObfuscatedName("yu.bc")
   private short[] field10188;
   @deob.ObfuscatedName("yu.bn")
   private long[] field10195;
   @deob.ObfuscatedName("yu.br")
   private int[] field10134;
   @deob.ObfuscatedName("yu.ba")
   private int[] field10165;
   @deob.ObfuscatedName("yu.bs")
   private int[] field10184;
   @deob.ObfuscatedName("yu.h")
   private int[][] field10181;
   @deob.ObfuscatedName("yu.bh")
   private int[][] field10194;
   @deob.ObfuscatedName("yu.al")
   private int[][] field10164;
   @deob.ObfuscatedName("yu.ay")
   private int field10139;
   @deob.ObfuscatedName("yu.as")
   private int field10155;
   @deob.ObfuscatedName("yu.be")
   private int field10163;
   @deob.ObfuscatedName("yu.au")
   private int field10176;
   @deob.ObfuscatedName("yu.am")
   private int field10178;
   @deob.ObfuscatedName("yu.aj")
   private int field10179;
   @deob.ObfuscatedName("yu.ac")
   private int field10180;
   @deob.ObfuscatedName("yu.bf")
   private int field10182;
   @deob.ObfuscatedName("yu.bp")
   private int field10183;
   @deob.ObfuscatedName("yu.bt")
   private int field10187;
   @deob.ObfuscatedName("yu.bz")
   private int field10202;
   @deob.ObfuscatedName("yu.f")
   private class540 field10189;
   @deob.ObfuscatedName("yu.bb")
   private boolean field10167;

   public class981(class979 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      this.field10206 = 0;
      this.field10140 = 0;
      this.field10205 = 0;
      this.field10156 = 0;
      this.field10157 = 0;
      this.field10204 = false;
      this.field10191 = true;
      this.field10173 = false;
      this.field10190 = false;
      this.field10177 = false;
      this.field10196 = new float[2];
      this.field10197 = new int[1];
      this.field10198 = new int[1];
      this.field10199 = new int[8];
      this.field10200 = new int[8];
      this.field10201 = new int[8];
      this.field10141 = arg0;
      this.field10135 = arg1;
      this.field10185 = arg2;
      this.field10204 = arg4;
      if (arg3 || class477.method6705(this.field10135, this.field10185)) {
         this.field10132 = new class515(class477.method6664(this.field10135, this.field10185));
      }

      if (arg3 || class477.method6662(this.field10135, this.field10185)) {
         this.field10170 = new class515(class477.method6649(this.field10135, this.field10185));
      }

      if (arg3 || class477.method6734(this.field10135, this.field10185)) {
         this.field10168 = new class515(class477.method6724(this.field10135, this.field10185));
      }

      if (arg3 || class477.method6660(this.field10135, this.field10185)) {
         this.field10169 = new class515(class477.method6665(this.field10135, this.field10185));
      }

      if (arg3 || class477.method6653(this.field10135, this.field10185)) {
         this.field10166 = new class482(class477.method6707(this.field10135, this.field10185));
      }

      if (arg3 && arg4) {
         this.field10132.field4086 = this.field10132.field4087 = this.field10141.method2570(this.field10204);
         this.field10170.field4086 = this.field10170.field4087 = this.field10141.method2570(this.field10204);
         this.field10168.field4086 = this.field10168.field4087 = this.field10141.method2570(this.field10204);
         this.field10169.field4086 = this.field10169.field4087 = this.field10141.method2570(this.field10204);
      }

   }

   public class981(class979 arg0, class396 arg1, int arg2, int arg3, int arg4, int arg5) {
      this(arg0, arg2, arg5, true, false);
      class637 var7 = arg0.field7118;
      int[] var8 = new int[arg1.field2914];
      this.field10136 = new int[arg1.field2909 + 1];

      for(int var9 = 0; var9 < arg1.field2914; ++var9) {
         if (arg1.field2919 == null || arg1.field2919[var9] != 2) {
            if (arg1.field2924 != null && arg1.field2924[var9] != -1) {
               class360 var10 = var7.method5112(arg1.field2924[var9] & 65535);
               if (((this.field10185 & 64) == 0 || !var10.field2331) && var10.field2333) {
                  continue;
               }
            }

            int var10003 = this.field10156 * -1431655765;
            int var10001 = this.field10156 * -1431655765;
            this.field10156 = (var10003 + 1) * 3;
            var8[var10001] = var9;
            ++this.field10136[arg1.field2916[var9]];
            ++this.field10136[arg1.field2912[var9]];
            ++this.field10136[arg1.field2918[var9]];
         }
      }

      this.field10157 = this.field10156 * -1431655765;
      long[] var11 = new long[this.field10156 * -1431655765];
      boolean var12 = (this.field10135 & 256) != 0;

      for(int var13 = 0; var13 < this.field10156 * -1431655765; ++var13) {
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
                        this.field10173 = true;
                     }
                  }
               }
            }

            if (var20) {
               var11[var13] = Long.MAX_VALUE;
               --this.field10157;
               continue;
            }
         }

         short var25 = -1;
         if (arg1.field2924 != null) {
            var25 = arg1.field2924[var14];
            if (var25 != -1) {
               var15 = var7.method5112(var25 & 65535);
               if ((this.field10185 & 64) != 0 && var15.field2331) {
                  var25 = -1;
                  var15 = null;
               } else {
                  var18 = var15.field2324;
                  var19 = var15.field2325;
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
         this.field10173 |= var26;
         this.field10190 |= var15 != null && (var15.field2330 != 0 || var15.field2317 != 0);
      }

      class781.method10914(var11, var8);
      this.field10206 = arg1.field2908;
      this.field10140 = arg1.field2909;
      this.field10174 = arg1.field2910;
      this.field10142 = arg1.field2911;
      this.field10143 = arg1.field2940;
      this.field10145 = arg1.field2926;
      class502[] var31 = new class502[this.field10140];
      this.field10151 = arg1.field2941;
      this.field10193 = arg1.field2929;
      if (arg1.field2937 != null) {
         this.field10144 = arg1.field2937.length;
         this.field10175 = new class501[this.field10144];
         this.field10148 = new class507[this.field10144];

         for(int var32 = 0; var32 < this.field10144; ++var32) {
            class395 var33 = arg1.field2937[var32];
            class532 var34 = class532.method8879(var33.field2905);
            int var35 = -1;

            for(int var36 = 0; var36 < this.field10156 * -1431655765; ++var36) {
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
            this.field10175[var32] = new class501(var35, arg1.field2916[var33.field2903], arg1.field2912[var33.field2903], arg1.field2918[var33.field2903], var34.field4190, var34.field4187, var34.field4189, var34.field4191, var34.field4194, var34.field4195, var34.field4186, var33.field2902);
            this.field10148[var32] = new class507(var38);
         }
      }

      int var39 = this.field10156;
      this.field10147 = new short[var39];
      this.field10192 = new short[var39];
      this.field10149 = new short[var39];
      this.field10150 = new short[var39];
      this.field10171 = new short[var39];
      this.field10152 = new byte[var39];
      this.field10153 = new float[var39];
      this.field10154 = new float[var39];
      this.field10158 = new short[this.field10156 * -1431655765];
      this.field10159 = new byte[this.field10156 * -1431655765];
      this.field10160 = new short[this.field10156 * -1431655765];
      this.field10161 = new short[this.field10156 * -1431655765];
      this.field10162 = new short[this.field10156 * -1431655765];
      this.field10203 = new short[this.field10156 * -1431655765];
      if (arg1.field2907 != null) {
         this.field10186 = new short[this.field10156 * -1431655765];
      }

      this.field10146 = (short)arg3;
      this.field10138 = (short)arg4;
      this.field10188 = new short[var39];
      this.field10195 = new long[var39];
      int var40 = 0;

      for(int var41 = 0; var41 < arg1.field2909; ++var41) {
         int var42 = this.field10136[var41];
         this.field10136[var41] = var40;
         var40 += var42;
         var31[var41] = new class502();
      }

      this.field10136[arg1.field2909] = var40;
      class409 var43 = this.method11001(arg1, var8, this.field10156 * -1431655765);
      class510[] var44 = new class510[arg1.field2914];

      for(int var45 = 0; var45 < arg1.field2914; ++var45) {
         short var46 = arg1.field2916[var45];
         short var47 = arg1.field2912[var45];
         short var48 = arg1.field2918[var45];
         int var49 = this.field10174[var47] - this.field10174[var46];
         int var50 = this.field10142[var47] - this.field10142[var46];
         int var51 = this.field10143[var47] - this.field10143[var46];
         int var52 = this.field10174[var48] - this.field10174[var46];
         int var53 = this.field10142[var48] - this.field10142[var46];
         int var54 = this.field10143[var48] - this.field10143[var46];
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
            class502 var63 = var31[var46];
            var63.field4035 += var59;
            var63.field4036 += var60;
            var63.field4037 += var61;
            ++var63.field4038;
            class502 var64 = var31[var47];
            var64.field4035 += var59;
            var64.field4036 += var60;
            var64.field4037 += var61;
            ++var64.field4038;
            class502 var65 = var31[var48];
            var65.field4035 += var59;
            var65.field4036 += var60;
            var65.field4037 += var61;
            ++var65.field4038;
         } else if (var62 == 1) {
            class510 var66 = var44[var45] = new class510();
            var66.field4065 = var59;
            var66.field4063 = var60;
            var66.field4064 = var61;
         }
      }

      for(int var67 = 0; var67 < this.field10156 * -1431655765; ++var67) {
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
         if (var72 != -1 && (this.field10185 & 64) != 0) {
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
                     this.method11000(arg1.field2910[var119], arg1.field2911[var119], arg1.field2940[var119], var122, var123, var124, var125, var128, var126, var127, this.field10196);
                     var74 = this.field10196[0];
                     var75 = this.field10196[1];
                     this.method11000(arg1.field2910[var120], arg1.field2911[var120], arg1.field2940[var120], var122, var123, var124, var125, var128, var126, var127, this.field10196);
                     var76 = this.field10196[0];
                     var77 = this.field10196[1];
                     this.method11000(arg1.field2910[var121], arg1.field2911[var121], arg1.field2940[var121], var122, var123, var124, var125, var128, var126, var127, this.field10196);
                     var78 = this.field10196[0];
                     var79 = this.field10196[1];
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
                     this.method11015(arg1.field2910[var119], arg1.field2911[var119], arg1.field2940[var119], var122, var123, var124, var82, var125, var126, var127, var130, var131, this.field10196);
                     var74 = this.field10196[0];
                     var75 = this.field10196[1];
                     this.method11015(arg1.field2910[var120], arg1.field2911[var120], arg1.field2940[var120], var122, var123, var124, var82, var125, var126, var127, var130, var131, this.field10196);
                     var76 = this.field10196[0];
                     var77 = this.field10196[1];
                     this.method11015(arg1.field2910[var121], arg1.field2911[var121], arg1.field2940[var121], var122, var123, var124, var82, var125, var126, var127, var130, var131, this.field10196);
                     var78 = this.field10196[0];
                     var79 = this.field10196[1];
                  } else if (var83 == 3) {
                     this.method10999(arg1.field2910[var119], arg1.field2911[var119], arg1.field2940[var119], var122, var123, var124, var125, var126, var127, this.field10196);
                     var74 = this.field10196[0];
                     var75 = this.field10196[1];
                     this.method10999(arg1.field2910[var120], arg1.field2911[var120], arg1.field2940[var120], var122, var123, var124, var125, var126, var127, this.field10196);
                     var76 = this.field10196[0];
                     var77 = this.field10196[1];
                     this.method10999(arg1.field2910[var121], arg1.field2911[var121], arg1.field2940[var121], var122, var123, var124, var125, var126, var127, this.field10196);
                     var78 = this.field10196[0];
                     var79 = this.field10196[1];
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
            class502 var153 = var31[var150];
            this.field10160[var67] = this.method16525(arg1, var150, var67, var148, var153.field4035, var153.field4036, var153.field4037, var153.field4038, var74, var75);
            class502 var154 = var31[var151];
            this.field10161[var67] = this.method16525(arg1, var151, var67, (long)var80 + var148, var154.field4035, var154.field4036, var154.field4037, var154.field4038, var76, var77);
            class502 var155 = var31[var152];
            this.field10162[var67] = this.method16525(arg1, var152, var67, (long)var81 + var148, var155.field4035, var155.field4036, var155.field4037, var155.field4038, var78, var79);
         } else if (var147 == 1) {
            class510 var156 = var44[var68];
            long var157 = (long)((var70 << 2) + (var156.field4065 > 0 ? 1024 : 2048) + (var156.field4063 + 256 << 12) + (var156.field4064 + 256 << 22)) + ((long)(var69 << 8) + (long)(var82 << 24) + (long)var71 << 32);
            this.field10160[var67] = this.method16525(arg1, arg1.field2916[var68], var67, var157, var156.field4065, var156.field4063, var156.field4064, 0, var74, var75);
            this.field10161[var67] = this.method16525(arg1, arg1.field2912[var68], var67, (long)var80 + var157, var156.field4065, var156.field4063, var156.field4064, 0, var76, var77);
            this.field10162[var67] = this.method16525(arg1, arg1.field2918[var68], var67, (long)var81 + var157, var156.field4065, var156.field4063, var156.field4064, 0, var78, var79);
         }

         if (arg1.field2921 != null) {
            this.field10159[var67] = arg1.field2921[var68];
         }

         if (arg1.field2907 != null) {
            this.field10186[var67] = arg1.field2907[var68];
         }

         this.field10158[var67] = arg1.field2927[var68];
         this.field10203[var67] = var72;
      }

      if (this.field10157 > 0) {
         int var159 = 1;
         short var160 = this.field10203[0];

         for(int var161 = 0; var161 < this.field10157; ++var161) {
            short var162 = this.field10203[var161];
            if (var160 != var162) {
               ++var159;
               var160 = var162;
            }
         }

         this.field10134 = new int[var159];
         this.field10165 = new int[var159];
         this.field10184 = new int[var159 + 1];
         this.field10184[0] = 0;
         int var163 = this.field10205;
         short var164 = 0;
         int var165 = 0;
         short var166 = this.field10203[0];

         for(int var167 = 0; var167 < this.field10157; ++var167) {
            short var168 = this.field10203[var167];
            if (var166 != var168) {
               this.field10134[var165] = var163;
               this.field10165[var165] = var164 - var163 + 1;
               ++var165;
               this.field10184[var165] = var167;
               var163 = this.field10205;
               var164 = 0;
               var166 = var168;
            }

            short var169 = this.field10160[var167];
            if (var169 < var163) {
               var163 = var169;
            }

            if (var169 > var164) {
               var164 = var169;
            }

            short var170 = this.field10161[var167];
            if (var170 < var163) {
               var163 = var170;
            }

            if (var170 > var164) {
               var164 = var170;
            }

            short var171 = this.field10162[var167];
            if (var171 < var163) {
               var163 = var171;
            }

            if (var171 > var164) {
               var164 = var171;
            }
         }

         this.field10134[var165] = var163;
         this.field10165[var165] = var164 - var163 + 1;
         ++var165;
         this.field10184[var165] = this.field10157;
      }

      this.field10195 = null;
      this.field10147 = method16527(this.field10147, this.field10205);
      this.field10192 = method16527(this.field10192, this.field10205);
      this.field10149 = method16527(this.field10149, this.field10205);
      this.field10150 = method16527(this.field10150, this.field10205);
      this.field10171 = method16527(this.field10171, this.field10205);
      this.field10152 = method16526(this.field10152, this.field10205);
      this.field10153 = method16528(this.field10153, this.field10205);
      this.field10154 = method16528(this.field10154, this.field10205);
      if (arg1.field2913 != null && class477.method6677(arg2, this.field10185)) {
         this.field10181 = arg1.method5420(false);
      }

      if (arg1.field2937 != null && class477.method6706(arg2, this.field10185)) {
         this.field10194 = arg1.method5422();
      }

      if (arg1.field2925 != null && class477.method6689(arg2, this.field10185)) {
         int var172 = 0;
         int[] var173 = new int[256];

         for(int var174 = 0; var174 < this.field10156 * -1431655765; ++var174) {
            int var175 = arg1.field2925[var8[var174]];
            if (var175 >= 0) {
               int var10002 = var173[var175]++;
               if (var175 > var172) {
                  var172 = var175;
               }
            }
         }

         this.field10164 = new int[var172 + 1][];

         for(int var176 = 0; var176 <= var172; ++var176) {
            this.field10164[var176] = new int[var173[var176]];
            var173[var176] = 0;
         }

         for(int var177 = 0; var177 < this.field10156 * -1431655765; ++var177) {
            int var178 = arg1.field2925[var8[var177]];
            if (var178 >= 0) {
               this.field10164[var178][var173[var178]++] = var177;
            }
         }
      }

   }

   @deob.ObfuscatedName("yu.z(Ldk;IIJIIIIFF)S")
   private short method16525(class396 arg0, int arg1, int arg2, long arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9) {
      int var12 = this.field10136[arg1];
      int var13 = this.field10136[arg1 + 1];
      int var14 = 0;

      for(int var15 = var12; var15 < var13; ++var15) {
         short var16 = this.field10188[var15];
         if (var16 == 0) {
            var14 = var15;
            break;
         }

         if (this.field10195[var15] == arg3) {
            return (short)(var16 - 1);
         }
      }

      this.field10188[var14] = (short)(this.field10205 + 1);
      this.field10195[var14] = arg3;
      this.field10192[this.field10205] = (short)arg2;
      this.field10147[this.field10205] = (short)arg1;
      this.field10149[this.field10205] = (short)arg4;
      this.field10150[this.field10205] = (short)arg5;
      this.field10171[this.field10205] = (short)arg6;
      this.field10152[this.field10205] = (byte)arg7;
      this.field10153[this.field10205] = arg8;
      this.field10154[this.field10205] = arg9;
      return (short)(this.field10205++);
   }

   @deob.ObfuscatedName("yu.y([BI)[B")
   private static byte[] method16526(byte[] arg0, int arg1) {
      byte[] var2 = new byte[arg1];
      System.arraycopy(arg0, 0, var2, 0, arg1);
      return var2;
   }

   @deob.ObfuscatedName("yu.aa([SI)[S")
   private static short[] method16527(short[] arg0, int arg1) {
      short[] var2 = new short[arg1];
      System.arraycopy(arg0, 0, var2, 0, arg1);
      return var2;
   }

   @deob.ObfuscatedName("yu.ba([FI)[F")
   private static float[] method16528(float[] arg0, int arg1) {
      float[] var2 = new float[arg1];
      System.arraycopy(arg0, 0, var2, 0, arg1);
      return var2;
   }

   @deob.ObfuscatedName("yu.m()I")
   public int method6980() {
      return this.field10135;
   }

   @deob.ObfuscatedName("yu.KA(I)V")
   public void method6916(int arg0) {
      if (this.field10132 != null) {
         this.field10132.field4085 = class477.method6664(arg0, this.field10185);
      }

      if (this.field10170 != null) {
         this.field10170.field4085 = class477.method6649(arg0, this.field10185);
      }

      if (this.field10168 != null) {
         this.field10168.field4085 = class477.method6724(arg0, this.field10185);
      }

      if (this.field10169 != null) {
         this.field10169.field4085 = class477.method6665(arg0, this.field10185);
      }

      this.field10135 = arg0;
      if (this.field10189 != null && (this.field10135 & 65536) == 0) {
         this.field10149 = this.field10189.field4331;
         this.field10150 = this.field10189.field4330;
         this.field10171 = this.field10189.field4332;
         this.field10152 = this.field10189.field4329;
         this.field10189 = null;
      }

      this.field10191 = true;
      this.method16531();
   }

   @deob.ObfuscatedName("yu.l()V")
   public void method6918() {
      if (this.field10205 > 0 && this.field10157 > 0) {
         this.method16557();
         this.method16524();
         this.method16531();
      }
   }

   @deob.ObfuscatedName("yu.s(BIZ)Lqa;")
   public class745 method6914(byte arg0, int arg1, boolean arg2) {
      boolean var4 = false;
      class981 var5;
      class981 var6;
      if (arg0 > 0 && arg0 <= 7) {
         var5 = this.field10141.field10126[arg0 - 1];
         var6 = this.field10141.field10056[arg0 - 1];
         var4 = true;
      } else {
         var6 = var5 = new class981(this.field10141, 0, 0, true, false);
      }

      return this.method16530(var6, var5, arg1, var4, arg2);
   }

   @deob.ObfuscatedName("yu.fp(Lyu;Lyu;IZZ)Lqa;")
   private class745 method16530(class981 arg0, class981 arg1, int arg2, boolean arg3, boolean arg4) {
      arg0.field10135 = arg2;
      arg0.field10185 = this.field10185;
      arg0.field10146 = this.field10146;
      arg0.field10138 = this.field10138;
      arg0.field10206 = this.field10206;
      arg0.field10140 = this.field10140;
      arg0.field10205 = this.field10205;
      arg0.field10156 = this.field10156;
      arg0.field10157 = this.field10157;
      arg0.field10144 = this.field10144;
      if ((arg2 & 256) != 0) {
         arg0.field10173 = true;
      } else {
         arg0.field10173 = this.field10173;
      }

      arg0.field10190 = this.field10190;
      boolean var6 = class477.method6722(arg2, this.field10185);
      boolean var7 = class477.method6648(arg2, this.field10185);
      boolean var8 = class477.method6681(arg2, this.field10185);
      boolean var9 = var6 | var7 | var8;
      if (var9) {
         if (var6) {
            if (arg1.field10174 != null && arg1.field10174.length >= this.field10206) {
               arg0.field10174 = arg1.field10174;
            } else {
               arg0.field10174 = arg1.field10174 = new int[this.field10206];
            }
         } else {
            arg0.field10174 = this.field10174;
         }

         if (var7) {
            if (arg1.field10142 != null && arg1.field10142.length >= this.field10206) {
               arg0.field10142 = arg1.field10142;
            } else {
               arg0.field10142 = arg1.field10142 = new int[this.field10206];
            }
         } else {
            arg0.field10142 = this.field10142;
         }

         if (var8) {
            if (arg1.field10143 != null && arg1.field10143.length >= this.field10206) {
               arg0.field10143 = arg1.field10143;
            } else {
               arg0.field10143 = arg1.field10143 = new int[this.field10206];
            }
         } else {
            arg0.field10143 = this.field10143;
         }

         for(int var10 = 0; var10 < this.field10206; ++var10) {
            if (var6) {
               arg0.field10174[var10] = this.field10174[var10];
            }

            if (var7) {
               arg0.field10142[var10] = this.field10142[var10];
            }

            if (var8) {
               arg0.field10143[var10] = this.field10143[var10];
            }
         }
      } else {
         arg0.field10174 = this.field10174;
         arg0.field10142 = this.field10142;
         arg0.field10143 = this.field10143;
      }

      if (class477.method6664(arg2, this.field10185)) {
         arg0.field10132 = arg1.field10132;
         arg0.field10132.field4087 = this.field10132.field4087;
         arg0.field10132.field4084 = this.field10132.field4084;
         arg0.field10132.field4085 = true;
      } else if (class477.method6705(arg2, this.field10185)) {
         arg0.field10132 = this.field10132;
      } else {
         arg0.field10132 = null;
      }

      if (class477.method6652(arg2, this.field10185)) {
         if (arg1.field10158 != null && arg1.field10158.length >= this.field10156 * -1431655765) {
            arg0.field10158 = arg1.field10158;
         } else {
            arg0.field10158 = arg1.field10158 = new short[this.field10156 * -1431655765];
         }

         for(int var11 = 0; var11 < this.field10156 * -1431655765; ++var11) {
            arg0.field10158[var11] = this.field10158[var11];
         }
      } else {
         arg0.field10158 = this.field10158;
      }

      if (class477.method6661(arg2, this.field10185)) {
         if (arg1.field10159 != null && arg1.field10159.length >= this.field10156 * -1431655765) {
            arg0.field10159 = arg1.field10159;
         } else {
            arg0.field10159 = arg1.field10159 = new byte[this.field10156 * -1431655765];
         }

         for(int var12 = 0; var12 < this.field10156 * -1431655765; ++var12) {
            arg0.field10159[var12] = this.field10159[var12];
         }
      } else {
         arg0.field10159 = this.field10159;
      }

      if (class477.method6724(arg2, this.field10185)) {
         arg0.field10168 = arg1.field10168;
         arg0.field10168.field4087 = this.field10168.field4087;
         arg0.field10168.field4084 = this.field10168.field4084;
         arg0.field10168.field4085 = true;
      } else if (class477.method6734(arg2, this.field10185)) {
         arg0.field10168 = this.field10168;
      } else {
         arg0.field10168 = null;
      }

      if (class477.method6651(arg2, this.field10185)) {
         if (arg1.field10149 != null && arg1.field10149.length >= this.field10205) {
            arg0.field10149 = arg1.field10149;
            arg0.field10150 = arg1.field10150;
            arg0.field10171 = arg1.field10171;
         } else {
            int var13 = this.field10205;
            arg0.field10149 = arg1.field10149 = new short[var13];
            arg0.field10150 = arg1.field10150 = new short[var13];
            arg0.field10171 = arg1.field10171 = new short[var13];
         }

         if (this.field10189 != null) {
            if (arg1.field10189 == null) {
               arg1.field10189 = new class540();
            }

            class540 var14 = arg0.field10189 = arg1.field10189;
            if (var14.field4331 == null || var14.field4331.length < this.field10205) {
               int var15 = this.field10205;
               var14.field4331 = new short[var15];
               var14.field4330 = new short[var15];
               var14.field4332 = new short[var15];
               var14.field4329 = new byte[var15];
            }

            for(int var16 = 0; var16 < this.field10205; ++var16) {
               arg0.field10149[var16] = this.field10149[var16];
               arg0.field10150[var16] = this.field10150[var16];
               arg0.field10171[var16] = this.field10171[var16];
               var14.field4331[var16] = this.field10189.field4331[var16];
               var14.field4330[var16] = this.field10189.field4330[var16];
               var14.field4332[var16] = this.field10189.field4332[var16];
               var14.field4329[var16] = this.field10189.field4329[var16];
            }
         } else {
            arg0.field10189 = null;

            for(int var17 = 0; var17 < this.field10205; ++var17) {
               arg0.field10149[var17] = this.field10149[var17];
               arg0.field10150[var17] = this.field10150[var17];
               arg0.field10171[var17] = this.field10171[var17];
            }
         }

         arg0.field10152 = this.field10152;
      } else {
         arg0.field10189 = this.field10189;
         arg0.field10149 = this.field10149;
         arg0.field10150 = this.field10150;
         arg0.field10171 = this.field10171;
         arg0.field10152 = this.field10152;
      }

      if (class477.method6665(arg2, this.field10185)) {
         arg0.field10169 = arg1.field10169;
         arg0.field10169.field4087 = this.field10169.field4087;
         arg0.field10169.field4084 = this.field10169.field4084;
         arg0.field10169.field4085 = true;
      } else if (class477.method6660(arg2, this.field10185)) {
         arg0.field10169 = this.field10169;
      } else {
         arg0.field10169 = null;
      }

      if (class477.method6654(arg2, this.field10185)) {
         if (arg1.field10153 != null && arg1.field10153.length >= this.field10156 * -1431655765) {
            arg0.field10153 = arg1.field10153;
            arg0.field10154 = arg1.field10154;
         } else {
            int var18 = this.field10205;
            arg0.field10153 = arg1.field10153 = new float[var18];
            arg0.field10154 = arg1.field10154 = new float[var18];
         }

         for(int var19 = 0; var19 < this.field10205; ++var19) {
            arg0.field10153[var19] = this.field10153[var19];
            arg0.field10154[var19] = this.field10154[var19];
         }
      } else {
         arg0.field10153 = this.field10153;
         arg0.field10154 = this.field10154;
      }

      if (class477.method6649(arg2, this.field10185)) {
         arg0.field10170 = arg1.field10170;
         arg0.field10170.field4087 = this.field10170.field4087;
         arg0.field10170.field4084 = this.field10170.field4084;
         arg0.field10170.field4085 = true;
      } else if (class477.method6662(arg2, this.field10185)) {
         arg0.field10170 = this.field10170;
      } else {
         arg0.field10170 = null;
      }

      if (class477.method6675(arg2, this.field10185)) {
         if (arg1.field10160 != null && arg1.field10160.length >= this.field10156 * -1431655765) {
            arg0.field10160 = arg1.field10160;
            arg0.field10161 = arg1.field10161;
            arg0.field10162 = arg1.field10162;
         } else {
            int var20 = this.field10156 * -1431655765;
            arg0.field10160 = arg1.field10160 = new short[var20];
            arg0.field10161 = arg1.field10161 = new short[var20];
            arg0.field10162 = arg1.field10162 = new short[var20];
         }

         for(int var21 = 0; var21 < this.field10156 * -1431655765; ++var21) {
            arg0.field10160[var21] = this.field10160[var21];
            arg0.field10161[var21] = this.field10161[var21];
            arg0.field10162[var21] = this.field10162[var21];
         }
      } else {
         arg0.field10160 = this.field10160;
         arg0.field10161 = this.field10161;
         arg0.field10162 = this.field10162;
      }

      if (class477.method6707(arg2, this.field10185)) {
         arg0.field10166 = arg1.field10166;
         arg0.field10166.field3906 = this.field10166.field3906;
         arg0.field10166.field3903 = this.field10166.field3903;
         arg0.field10166.field3904 = true;
      } else if (class477.method6653(arg2, this.field10185)) {
         arg0.field10166 = this.field10166;
      } else {
         arg0.field10166 = null;
      }

      if (class477.method6656(arg2, this.field10185)) {
         if (arg1.field10203 != null && arg1.field10203.length >= this.field10156 * -1431655765) {
            arg0.field10203 = arg1.field10203;
         } else {
            int var22 = this.field10156 * -1431655765;
            arg0.field10203 = arg1.field10203 = new short[var22];
         }

         for(int var23 = 0; var23 < this.field10156 * -1431655765; ++var23) {
            arg0.field10203[var23] = this.field10203[var23];
         }
      } else {
         arg0.field10203 = this.field10203;
      }

      if (class477.method6657(arg2, this.field10185)) {
         if (arg1.field10148 != null && arg1.field10148.length >= this.field10144) {
            arg0.field10148 = arg1.field10148;

            for(int var24 = 0; var24 < this.field10144; ++var24) {
               arg0.field10148[var24].method7132(this.field10148[var24]);
            }
         } else {
            int var25 = this.field10144;
            arg0.field10148 = arg1.field10148 = new class507[var25];

            for(int var26 = 0; var26 < this.field10144; ++var26) {
               arg0.field10148[var26] = this.field10148[var26].method7130();
            }
         }
      } else {
         arg0.field10148 = this.field10148;
      }

      arg0.field10175 = this.field10175;
      if (this.field10177) {
         arg0.field10155 = this.field10155;
         arg0.field10176 = this.field10176;
         arg0.field10180 = this.field10180;
         arg0.field10139 = this.field10139;
         arg0.field10178 = this.field10178;
         arg0.field10179 = this.field10179;
         arg0.field10182 = this.field10182;
         arg0.field10183 = this.field10183;
         arg0.field10177 = true;
      } else {
         arg0.field10177 = false;
      }

      arg0.field10181 = this.field10181;
      arg0.field10164 = this.field10164;
      arg0.field10194 = this.field10194;
      arg0.field10188 = this.field10188;
      arg0.field10136 = this.field10136;
      arg0.field10147 = this.field10147;
      arg0.field10192 = this.field10192;
      arg0.field10145 = this.field10145;
      arg0.field10186 = this.field10186;
      arg0.field10184 = this.field10184;
      arg0.field10165 = this.field10165;
      arg0.field10134 = this.field10134;
      arg0.field10151 = this.field10151;
      arg0.field10193 = this.field10193;
      return arg0;
   }

   @deob.ObfuscatedName("yu.fg()V")
   private void method16531() {
      if (this.field10191) {
         this.field10191 = false;
         if (this.field10151 == null && this.field10193 == null && this.field10175 == null && !class477.method6650(this.field10135, this.field10185)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (this.field10174 != null && !class477.method6669(this.field10135, this.field10185)) {
               if (this.field10132 != null && !this.field10132.method7185()) {
                  this.field10191 = true;
               } else {
                  if (!this.field10177) {
                     this.method16581();
                  }

                  var1 = true;
               }
            }

            if (this.field10142 != null && !class477.method6670(this.field10135, this.field10185)) {
               if (this.field10132 != null && !this.field10132.method7185()) {
                  this.field10191 = true;
               } else {
                  if (!this.field10177) {
                     this.method16581();
                  }

                  var2 = true;
               }
            }

            if (this.field10143 != null && !class477.method6671(this.field10135, this.field10185)) {
               if (this.field10132 != null && !this.field10132.method7185()) {
                  this.field10191 = true;
               } else {
                  if (!this.field10177) {
                     this.method16581();
                  }

                  var3 = true;
               }
            }

            if (var1) {
               this.field10174 = null;
            }

            if (var2) {
               this.field10142 = null;
            }

            if (var3) {
               this.field10143 = null;
            }
         }

         if (this.field10188 != null && this.field10174 == null && this.field10142 == null && this.field10143 == null) {
            this.field10188 = null;
            this.field10136 = null;
         }

         if (this.field10152 != null && !class477.method6672(this.field10135, this.field10185)) {
            label211: {
               label210: {
                  if ((this.field10185 & 55) != 0) {
                     if (this.field10169 != null && !this.field10169.method7185()) {
                        break label210;
                     }
                  } else if (this.field10168 != null && !this.field10168.method7185()) {
                     break label210;
                  }

                  this.field10171 = null;
                  this.field10150 = null;
                  this.field10149 = null;
                  this.field10152 = null;
                  break label211;
               }

               this.field10191 = true;
            }
         }

         if (this.field10158 != null && !class477.method6673(this.field10135, this.field10185)) {
            if (this.field10168 != null && !this.field10168.method7185()) {
               this.field10191 = true;
            } else {
               this.field10158 = null;
            }
         }

         if (this.field10159 != null && !class477.method6674(this.field10135, this.field10185)) {
            if (this.field10168 != null && !this.field10168.method7185()) {
               this.field10191 = true;
            } else {
               this.field10159 = null;
            }
         }

         if (this.field10153 != null && !class477.method6721(this.field10135, this.field10185)) {
            if (this.field10170 != null && !this.field10170.method7185()) {
               this.field10191 = true;
            } else {
               this.field10154 = null;
               this.field10153 = null;
            }
         }

         if (this.field10203 != null && !class477.method6680(this.field10135, this.field10185)) {
            if (this.field10168 != null && !this.field10168.method7185()) {
               this.field10191 = true;
            } else {
               this.field10203 = null;
            }
         }

         if (this.field10160 != null && !class477.method6679(this.field10135, this.field10185)) {
            if ((this.field10166 == null || this.field10166.method6782()) && (this.field10168 == null || this.field10168.method7185())) {
               this.field10162 = null;
               this.field10161 = null;
               this.field10160 = null;
            } else {
               this.field10191 = true;
            }
         }

         if (this.field10147 != null) {
            if (this.field10132 != null && !this.field10132.method7185()) {
               this.field10191 = true;
            } else {
               this.field10147 = null;
            }
         }

         if (this.field10192 != null) {
            if (this.field10168 != null && !this.field10168.method7185()) {
               this.field10191 = true;
            } else {
               this.field10192 = null;
            }
         }

         if (this.field10164 != null && !class477.method6689(this.field10135, this.field10185)) {
            this.field10164 = (int[][])null;
            this.field10186 = null;
         }

         if (this.field10181 != null && !class477.method6677(this.field10135, this.field10185)) {
            this.field10181 = (int[][])null;
            this.field10145 = null;
         }

         if (this.field10194 != null && !class477.method6706(this.field10135, this.field10185)) {
            this.field10194 = (int[][])null;
         }

         if (this.field10184 != null && (this.field10135 & 2048) == 0 && (this.field10135 & 262144) == 0) {
            this.field10184 = null;
            this.field10165 = null;
            this.field10134 = null;
         }

      }
   }

   @deob.ObfuscatedName("yu.fa()V")
   private void method16532() {
      if (this.field10132 != null) {
         this.field10132.field4084 = false;
      }

   }

   @deob.ObfuscatedName("yu.fm()V")
   private void method16533() {
      if (this.field10168 != null) {
         this.field10168.field4084 = false;
      }

   }

   @deob.ObfuscatedName("yu.fh()V")
   private void method16534() {
      if ((this.field10185 & 55) != 0) {
         if (this.field10169 != null) {
            this.field10169.field4084 = false;
         }
      } else if (this.field10168 != null) {
         this.field10168.field4084 = false;
      }

   }

   @deob.ObfuscatedName("yu.fx()V")
   private void method16555() {
      if (this.field10166 != null) {
         this.field10166.field3903 = false;
      }

   }

   @deob.ObfuscatedName("yu.f(I)V")
   public void method7008(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field10140; ++var4) {
         int var5 = this.field10174[var4] * var3 + this.field10143[var4] * var2 >> 14;
         this.field10143[var4] = this.field10143[var4] * var3 - this.field10174[var4] * var2 >> 14;
         this.field10174[var4] = var5;
      }

      this.method16532();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.S(I)V")
   public void method6920(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field10140; ++var4) {
         int var5 = this.field10174[var4] * var3 + this.field10143[var4] * var2 >> 14;
         this.field10143[var4] = this.field10143[var4] * var3 - this.field10174[var4] * var2 >> 14;
         this.field10174[var4] = var5;
      }

      for(int var6 = 0; var6 < this.field10205; ++var6) {
         int var7 = this.field10171[var6] * var2 + this.field10149[var6] * var3 >> 14;
         this.field10171[var6] = (short)(this.field10171[var6] * var3 - this.field10149[var6] * var2 >> 14);
         this.field10149[var6] = (short)var7;
      }

      this.method16532();
      this.method16534();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.t(I)V")
   public void method6921(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field10140; ++var4) {
         int var5 = this.field10142[var4] * var3 - this.field10143[var4] * var2 >> 14;
         this.field10143[var4] = this.field10143[var4] * var3 + this.field10142[var4] * var2 >> 14;
         this.field10142[var4] = var5;
      }

      this.method16532();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.EA(I)V")
   public void method6999(int arg0) {
      int var2 = class603.field5469[arg0];
      int var3 = class603.field5471[arg0];

      for(int var4 = 0; var4 < this.field10140; ++var4) {
         int var5 = this.field10174[var4] * var3 + this.field10142[var4] * var2 >> 14;
         this.field10142[var4] = this.field10142[var4] * var3 - this.field10174[var4] * var2 >> 14;
         this.field10174[var4] = var5;
      }

      this.method16532();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.ia(III)V")
   public void method7078(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field10140; ++var4) {
         if (arg0 != 0) {
            this.field10174[var4] += arg0;
         }

         if (arg1 != 0) {
            this.field10142[var4] += arg1;
         }

         if (arg2 != 0) {
            this.field10143[var4] += arg2;
         }
      }

      this.method16532();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.wa()V")
   public void method7075() {
      for(int var1 = 0; var1 < this.field10140; ++var1) {
         this.field10143[var1] = -this.field10143[var1];
      }

      for(int var2 = 0; var2 < this.field10205; ++var2) {
         this.field10171[var2] = (short)(-this.field10171[var2]);
      }

      for(int var3 = 0; var3 < this.field10156 * -1431655765; ++var3) {
         short var4 = this.field10160[var3];
         this.field10160[var3] = this.field10162[var3];
         this.field10162[var3] = var4;
      }

      this.method16532();
      this.method16534();
      this.method16555();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.oa(III)V")
   public void method6924(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field10140; ++var4) {
         if (arg0 != 128) {
            this.field10174[var4] = this.field10174[var4] * arg0 >> 7;
         }

         if (arg1 != 128) {
            this.field10142[var4] = this.field10142[var4] * arg1 >> 7;
         }

         if (arg2 != 128) {
            this.field10143[var4] = this.field10143[var4] * arg2 >> 7;
         }
      }

      this.method16532();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.pa(IILxa;Lxa;III)V")
   public void method6925(int arg0, int arg1, class934 arg2, class934 arg3, int arg4, int arg5, int arg6) {
      if (!this.field10177) {
         this.method16581();
      }

      int var8 = this.field10180 + arg4;
      int var9 = this.field10139 + arg4;
      int var10 = this.field10182 + arg6;
      int var11 = this.field10183 + arg6;
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
            for(int var16 = 0; var16 < this.field10140; ++var16) {
               this.field10142[var16] = this.field10142[var16] + arg2.method15965(this.field10174[var16] + arg4, this.field10143[var16] + arg6) - arg5;
            }
         } else if (arg0 == 2) {
            int var17 = this.field10178;
            if (var17 == 0) {
               return;
            }

            for(int var18 = 0; var18 < this.field10140; ++var18) {
               int var19 = (this.field10142[var18] << 16) / var17;
               if (var19 < arg1) {
                  this.field10142[var18] += (arg2.method15965(this.field10174[var18] + arg4, this.field10143[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
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
            int var24 = this.field10179 - this.field10178;

            for(int var25 = 0; var25 < this.field10140; ++var25) {
               this.field10142[var25] = this.field10142[var25] + (arg3.method15965(this.field10174[var25] + arg4, this.field10143[var25] + arg6) - arg5) + var24;
            }
         } else if (arg0 == 5) {
            int var26 = this.field10179 - this.field10178;

            for(int var27 = 0; var27 < this.field10140; ++var27) {
               int var28 = this.field10174[var27] + arg4;
               int var29 = this.field10143[var27] + arg6;
               int var30 = arg2.method15965(var28, var29);
               int var31 = arg3.method15965(var28, var29);
               int var32 = var30 - var31 - arg1;
               this.field10142[var27] = ((this.field10142[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
            }
         }

         this.method16532();
         this.field10177 = false;
      }
   }

   @deob.ObfuscatedName("yu.gu()V")
   private void method16581() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.field10140; ++var9) {
         int var10 = this.field10174[var9];
         int var11 = this.field10142[var9];
         int var12 = this.field10143[var9];
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

      this.field10180 = var1;
      this.field10139 = var4;
      this.field10178 = var2;
      this.field10179 = var5;
      this.field10182 = var3;
      this.field10183 = var6;
      this.field10176 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.field10155 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.field10177 = true;
   }

   @deob.ObfuscatedName("yu.N()I")
   public int method7004() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10176;
   }

   @deob.ObfuscatedName("yu.n()I")
   public int method6938() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10155;
   }

   @deob.ObfuscatedName("yu.RA()I")
   public int method7033() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10180;
   }

   @deob.ObfuscatedName("yu.ya()I")
   public int method6940() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10139;
   }

   @deob.ObfuscatedName("yu.YA()I")
   public int method6941() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10178;
   }

   @deob.ObfuscatedName("yu.o()I")
   public int method6951() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10179;
   }

   @deob.ObfuscatedName("yu.AA()I")
   public int method7046() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10182;
   }

   @deob.ObfuscatedName("yu.ha()I")
   public int method6943() {
      if (!this.field10177) {
         this.method16581();
      }

      return this.field10183;
   }

   @deob.ObfuscatedName("yu.ae(Lqa;IIIZ)V")
   public void method6959(class745 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      class981 var6 = (class981)arg0;
      if (this.field10156 * -1431655765 != 0 && var6.field10156 * -1431655765 != 0) {
         int var7 = var6.field10140;
         int[] var8 = var6.field10174;
         int[] var9 = var6.field10142;
         int[] var10 = var6.field10143;
         short[] var11 = var6.field10149;
         short[] var12 = var6.field10150;
         short[] var13 = var6.field10171;
         byte[] var14 = var6.field10152;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if (this.field10189 != null) {
            var15 = this.field10189.field4331;
            var16 = this.field10189.field4330;
            var17 = this.field10189.field4332;
            var18 = this.field10189.field4329;
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
         if (var6.field10189 != null) {
            var19 = var6.field10189.field4331;
            var20 = var6.field10189.field4330;
            var21 = var6.field10189.field4332;
            var22 = var6.field10189.field4329;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.field10136;
         short[] var24 = var6.field10188;
         if (!var6.field10177) {
            var6.method16581();
         }

         int var25 = var6.field10178;
         int var26 = var6.field10179;
         int var27 = var6.field10180;
         int var28 = var6.field10139;
         int var29 = var6.field10182;
         int var30 = var6.field10183;

         for(int var31 = 0; var31 < this.field10140; ++var31) {
            int var32 = this.field10142[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
               int var33 = this.field10174[var31] - arg1;
               if (var33 >= var27 && var33 <= var28) {
                  int var34 = this.field10143[var31] - arg3;
                  if (var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.field10136[var31];
                     int var37 = this.field10136[var31 + 1];

                     for(int var38 = var36; var38 < var37; ++var38) {
                        var35 = this.field10188[var38] - 1;
                        if (var35 == -1 || this.field10152[var35] != 0) {
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
                                    this.field10189 = new class540();
                                    var15 = this.field10189.field4331 = class820.method15161(this.field10149);
                                    var16 = this.field10189.field4330 = class820.method15161(this.field10150);
                                    var17 = this.field10189.field4332 = class820.method15161(this.field10171);
                                    var18 = this.field10189.field4329 = class820.method956(this.field10152);
                                 }

                                 if (var19 == null) {
                                    class540 var44 = var6.field10189 = new class540();
                                    var19 = var44.field4331 = class820.method15161(var11);
                                    var20 = var44.field4330 = class820.method15161(var12);
                                    var21 = var44.field4332 = class820.method15161(var13);
                                    var22 = var44.field4329 = class820.method956(var14);
                                 }

                                 short var45 = this.field10149[var35];
                                 short var46 = this.field10150[var35];
                                 short var47 = this.field10171[var35];
                                 byte var48 = this.field10152[var35];
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
                                 int var57 = this.field10136[var31];
                                 int var58 = this.field10136[var31 + 1];

                                 for(int var59 = var57; var59 < var58; ++var59) {
                                    int var60 = this.field10188[var59] - 1;
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

                                 var6.method16534();
                                 this.method16534();
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

   @deob.ObfuscatedName("yu.p(I)V")
   public void method6944(int arg0) {
      this.field10146 = (short)arg0;
      this.method16533();
   }

   @deob.ObfuscatedName("yu.Q(I)V")
   public void method6969(int arg0) {
      this.field10138 = (short)arg0;
      this.method16532();
      this.method16534();
   }

   @deob.ObfuscatedName("yu.c()I")
   public int method6946() {
      return this.field10146;
   }

   @deob.ObfuscatedName("yu.Z()I")
   public int method6947() {
      return this.field10138;
   }

   @deob.ObfuscatedName("yu.al()[B")
   public byte[] method6948() {
      return this.field10159;
   }

   @deob.ObfuscatedName("yu.X(SS)V")
   public void method7023(short arg0, short arg1) {
      for(int var3 = 0; var3 < this.field10156 * -1431655765; ++var3) {
         if (this.field10158[var3] == arg0) {
            this.field10158[var3] = arg1;
         }
      }

      if (this.field10175 != null) {
         for(int var4 = 0; var4 < this.field10144; ++var4) {
            class501 var5 = this.field10175[var4];
            class507 var6 = this.field10148[var4];
            var6.field4060 = var6.field4060 & -16777216 | Statics.field7196[this.field10158[var5.field4029] & 65535] & 16777215;
         }
      }

      this.method16533();
   }

   @deob.ObfuscatedName("yu.an(B[B)V")
   public void method6950(byte arg0, byte[] arg1) {
      if (arg1 == null) {
         for(int var3 = 0; var3 < this.field10156 * -1431655765; ++var3) {
            this.field10159[var3] = arg0;
         }
      } else {
         for(int var4 = 0; var4 < this.field10156 * -1431655765; ++var4) {
            int var5 = 255 - (255 - (arg1[var4] & 255)) * (255 - (arg0 & 255)) / 255;
            this.field10159[var4] = (byte)var5;
         }
      }

      this.method16533();
   }

   @deob.ObfuscatedName("yu.W(SS)V")
   public void method6952(short arg0, short arg1) {
      class637 var3 = this.field10141.field7118;

      for(int var4 = 0; var4 < this.field10156 * -1431655765; ++var4) {
         if (this.field10203[var4] == arg0) {
            this.field10203[var4] = arg1;
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
            this.field10190 = true;
         }
      }

      if (var5 != var8 | var6 != var9) {
         if (this.field10175 != null) {
            for(int var11 = 0; var11 < this.field10144; ++var11) {
               class501 var12 = this.field10175[var11];
               class507 var13 = this.field10148[var11];
               var13.field4060 = var13.field4060 & -16777216 | Statics.field7196[this.field10158[var12.field4029] & 65535] & 16777215;
            }
         }

         this.method16533();
      }

   }

   @deob.ObfuscatedName("yu.PA(IIII)V")
   public void method6953(int arg0, int arg1, int arg2, int arg3) {
      for(int var5 = 0; var5 < this.field10156 * -1431655765; ++var5) {
         int var6 = this.field10158[var5] & 65535;
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

         this.field10158[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if (this.field10175 != null) {
         for(int var10 = 0; var10 < this.field10144; ++var10) {
            class501 var11 = this.field10175[var10];
            class507 var12 = this.field10148[var10];
            var12.field4060 = var12.field4060 & -16777216 | Statics.field7196[this.field10158[var11.field4029] & 65535] & 16777215;
         }
      }

      this.method16533();
   }

   @deob.ObfuscatedName("yu.ag()Z")
   public boolean method6954() {
      if (this.field10203 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.field10203.length; ++var1) {
            if (this.field10203[var1] != -1 && !this.field10141.field10067.method7117(this.field10203[var1], -1)) {
               return false;
            }
         }

         return true;
      }
   }

   @deob.ObfuscatedName("yu.i()Z")
   public boolean method6949() {
      return this.field10173;
   }

   @deob.ObfuscatedName("yu.u()Z")
   public boolean method6956() {
      return this.field10190;
   }

   @deob.ObfuscatedName("yu.g()V")
   protected void method6926() {
   }

   @deob.ObfuscatedName("yu.h()V")
   protected void method7027() {
   }

   @deob.ObfuscatedName("yu.ea()Z")
   protected boolean method6927() {
      if (this.field10181 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.field10206; ++var1) {
            this.field10174[var1] <<= 4;
            this.field10142[var1] <<= 4;
            this.field10143[var1] <<= 4;
         }

         this.field10202 = 0;
         this.field10187 = 0;
         this.field10163 = 0;
         return true;
      }
   }

   @deob.ObfuscatedName("yu.e(I[IIIIZI[I)V")
   protected void method6930(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      int var9 = arg1.length;
      if (arg0 == 0) {
         int var10 = arg2 << 4;
         int var11 = arg3 << 4;
         int var12 = arg4 << 4;
         int var13 = 0;
         this.field10202 = 0;
         this.field10187 = 0;
         this.field10163 = 0;

         for(int var14 = 0; var14 < var9; ++var14) {
            int var15 = arg1[var14];
            if (var15 < this.field10181.length) {
               int[] var16 = this.field10181[var15];

               for(int var17 = 0; var17 < var16.length; ++var17) {
                  int var18 = var16[var17];
                  if (this.field10145 == null || (arg6 & this.field10145[var18]) != 0) {
                     this.field10202 += this.field10174[var18];
                     this.field10187 += this.field10142[var18];
                     this.field10163 += this.field10143[var18];
                     ++var13;
                  }
               }
            }
         }

         if (var13 > 0) {
            this.field10202 = this.field10202 / var13 + var10;
            this.field10187 = this.field10187 / var13 + var11;
            this.field10163 = this.field10163 / var13 + var12;
            this.field10167 = true;
         } else {
            this.field10202 = var10;
            this.field10187 = var11;
            this.field10163 = var12;
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
            if (var26 < this.field10181.length) {
               int[] var27 = this.field10181[var26];

               for(int var28 = 0; var28 < var27.length; ++var28) {
                  int var29 = var27[var28];
                  if (this.field10145 == null || (arg6 & this.field10145[var29]) != 0) {
                     this.field10174[var29] += var22;
                     this.field10142[var29] += var23;
                     this.field10143[var29] += var24;
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
            if (this.field10167) {
               int var36 = arg7[6] * this.field10163 + arg7[0] * this.field10202 + arg7[3] * this.field10187 + 8192 >> 14;
               int var37 = arg7[7] * this.field10163 + arg7[1] * this.field10202 + arg7[4] * this.field10187 + 8192 >> 14;
               int var38 = arg7[8] * this.field10163 + arg7[2] * this.field10202 + arg7[5] * this.field10187 + 8192 >> 14;
               int var39 = var33 + var36;
               int var40 = var34 + var37;
               int var41 = var35 + var38;
               this.field10202 = var39;
               this.field10187 = var40;
               this.field10163 = var41;
               this.field10167 = false;
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
            int var51 = var42[2] * -this.field10163 + var42[0] * -this.field10202 + var42[1] * -this.field10187 + 8192 >> 14;
            int var52 = var42[5] * -this.field10163 + var42[3] * -this.field10202 + var42[4] * -this.field10187 + 8192 >> 14;
            int var53 = var42[8] * -this.field10163 + var42[6] * -this.field10202 + var42[7] * -this.field10187 + 8192 >> 14;
            int var54 = this.field10202 + var51;
            int var55 = this.field10187 + var52;
            int var56 = this.field10163 + var53;
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
               if (var80 < this.field10181.length) {
                  int[] var81 = this.field10181[var80];

                  for(int var82 = 0; var82 < var81.length; ++var82) {
                     int var83 = var81[var82];
                     if (this.field10145 == null || (arg6 & this.field10145[var83]) != 0) {
                        int var84 = this.field10143[var83] * var68[2] + this.field10174[var83] * var68[0] + this.field10142[var83] * var68[1] + 8192 >> 14;
                        int var85 = this.field10143[var83] * var68[5] + this.field10174[var83] * var68[3] + this.field10142[var83] * var68[4] + 8192 >> 14;
                        int var86 = this.field10143[var83] * var68[8] + this.field10174[var83] * var68[6] + this.field10142[var83] * var68[7] + 8192 >> 14;
                        int var87 = var76 + var84;
                        int var88 = var77 + var85;
                        int var89 = var78 + var86;
                        this.field10174[var83] = var87;
                        this.field10142[var83] = var88;
                        this.field10143[var83] = var89;
                     }
                  }
               }
            }
         } else {
            for(int var90 = 0; var90 < var9; ++var90) {
               int var91 = arg1[var90];
               if (var91 < this.field10181.length) {
                  int[] var92 = this.field10181[var91];

                  for(int var93 = 0; var93 < var92.length; ++var93) {
                     int var94 = var92[var93];
                     if (this.field10145 == null || (arg6 & this.field10145[var94]) != 0) {
                        this.field10174[var94] -= this.field10202;
                        this.field10142[var94] -= this.field10187;
                        this.field10143[var94] -= this.field10163;
                        if (arg4 != 0) {
                           int var95 = class603.field5469[arg4];
                           int var96 = class603.field5471[arg4];
                           int var97 = this.field10174[var94] * var96 + this.field10142[var94] * var95 + 16383 >> 14;
                           this.field10142[var94] = this.field10142[var94] * var96 - this.field10174[var94] * var95 + 16383 >> 14;
                           this.field10174[var94] = var97;
                        }

                        if (arg2 != 0) {
                           int var98 = class603.field5469[arg2];
                           int var99 = class603.field5471[arg2];
                           int var100 = this.field10142[var94] * var99 - this.field10143[var94] * var98 + 16383 >> 14;
                           this.field10143[var94] = this.field10143[var94] * var99 + this.field10142[var94] * var98 + 16383 >> 14;
                           this.field10142[var94] = var100;
                        }

                        if (arg3 != 0) {
                           int var101 = class603.field5469[arg3];
                           int var102 = class603.field5471[arg3];
                           int var103 = this.field10174[var94] * var102 + this.field10143[var94] * var101 + 16383 >> 14;
                           this.field10143[var94] = this.field10143[var94] * var102 - this.field10174[var94] * var101 + 16383 >> 14;
                           this.field10174[var94] = var103;
                        }

                        this.field10174[var94] += this.field10202;
                        this.field10142[var94] += this.field10187;
                        this.field10143[var94] += this.field10163;
                     }
                  }
               }
            }

            if (arg5) {
               for(int var104 = 0; var104 < var9; ++var104) {
                  int var105 = arg1[var104];
                  if (var105 < this.field10181.length) {
                     int[] var106 = this.field10181[var105];

                     for(int var107 = 0; var107 < var106.length; ++var107) {
                        int var108 = var106[var107];
                        if (this.field10145 == null || (arg6 & this.field10145[var108]) != 0) {
                           int var109 = this.field10136[var108];
                           int var110 = this.field10136[var108 + 1];

                           for(int var111 = var109; var111 < var110; ++var111) {
                              int var112 = this.field10188[var111] - 1;
                              if (var112 == -1) {
                                 break;
                              }

                              if (arg4 != 0) {
                                 int var113 = class603.field5469[arg4];
                                 int var114 = class603.field5471[arg4];
                                 int var115 = this.field10150[var112] * var113 + this.field10149[var112] * var114 + 16383 >> 14;
                                 this.field10150[var112] = (short)(this.field10150[var112] * var114 - this.field10149[var112] * var113 + 16383 >> 14);
                                 this.field10149[var112] = (short)var115;
                              }

                              if (arg2 != 0) {
                                 int var116 = class603.field5469[arg2];
                                 int var117 = class603.field5471[arg2];
                                 int var118 = this.field10150[var112] * var117 - this.field10171[var112] * var116 + 16383 >> 14;
                                 this.field10171[var112] = (short)(this.field10171[var112] * var117 + this.field10150[var112] * var116 + 16383 >> 14);
                                 this.field10150[var112] = (short)var118;
                              }

                              if (arg3 != 0) {
                                 int var119 = class603.field5469[arg3];
                                 int var120 = class603.field5471[arg3];
                                 int var121 = this.field10171[var112] * var119 + this.field10149[var112] * var120 + 16383 >> 14;
                                 this.field10171[var112] = (short)(this.field10171[var112] * var120 - this.field10149[var112] * var119 + 16383 >> 14);
                                 this.field10149[var112] = (short)var121;
                              }
                           }
                        }
                     }
                  }
               }

               this.method16534();
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
            if (this.field10167) {
               int var128 = arg7[6] * this.field10163 + arg7[0] * this.field10202 + arg7[3] * this.field10187 + 8192 >> 14;
               int var129 = arg7[7] * this.field10163 + arg7[1] * this.field10202 + arg7[4] * this.field10187 + 8192 >> 14;
               int var130 = arg7[8] * this.field10163 + arg7[2] * this.field10202 + arg7[5] * this.field10187 + 8192 >> 14;
               int var131 = var125 + var128;
               int var132 = var126 + var129;
               int var133 = var127 + var130;
               this.field10202 = var131;
               this.field10187 = var132;
               this.field10163 = var133;
               this.field10167 = false;
            }

            int var134 = arg2 << 15 >> 7;
            int var135 = arg3 << 15 >> 7;
            int var136 = arg4 << 15 >> 7;
            int var137 = -this.field10202 * var134 + 8192 >> 14;
            int var138 = -this.field10187 * var135 + 8192 >> 14;
            int var139 = -this.field10163 * var136 + 8192 >> 14;
            int var140 = this.field10202 + var137;
            int var141 = this.field10187 + var138;
            int var142 = this.field10163 + var139;
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
               if (var162 < this.field10181.length) {
                  int[] var163 = this.field10181[var162];

                  for(int var164 = 0; var164 < var163.length; ++var164) {
                     int var165 = var163[var164];
                     if (this.field10145 == null || (arg6 & this.field10145[var165]) != 0) {
                        int var166 = this.field10143[var165] * var150[2] + this.field10174[var165] * var150[0] + this.field10142[var165] * var150[1] + 8192 >> 14;
                        int var167 = this.field10143[var165] * var150[5] + this.field10174[var165] * var150[3] + this.field10142[var165] * var150[4] + 8192 >> 14;
                        int var168 = this.field10143[var165] * var150[8] + this.field10174[var165] * var150[6] + this.field10142[var165] * var150[7] + 8192 >> 14;
                        int var169 = var158 + var166;
                        int var170 = var159 + var167;
                        int var171 = var160 + var168;
                        this.field10174[var165] = var169;
                        this.field10142[var165] = var170;
                        this.field10143[var165] = var171;
                     }
                  }
               }
            }
         } else {
            for(int var172 = 0; var172 < var9; ++var172) {
               int var173 = arg1[var172];
               if (var173 < this.field10181.length) {
                  int[] var174 = this.field10181[var173];

                  for(int var175 = 0; var175 < var174.length; ++var175) {
                     int var176 = var174[var175];
                     if (this.field10145 == null || (arg6 & this.field10145[var176]) != 0) {
                        this.field10174[var176] -= this.field10202;
                        this.field10142[var176] -= this.field10187;
                        this.field10143[var176] -= this.field10163;
                        this.field10174[var176] = this.field10174[var176] * arg2 >> 7;
                        this.field10142[var176] = this.field10142[var176] * arg3 >> 7;
                        this.field10143[var176] = this.field10143[var176] * arg4 >> 7;
                        this.field10174[var176] += this.field10202;
                        this.field10142[var176] += this.field10187;
                        this.field10143[var176] += this.field10163;
                     }
                  }
               }
            }
         }

      } else if (arg0 == 5) {
         if (this.field10164 != null) {
            boolean var177 = false;

            for(int var178 = 0; var178 < var9; ++var178) {
               int var179 = arg1[var178];
               if (var179 < this.field10164.length) {
                  int[] var180 = this.field10164[var179];

                  for(int var181 = 0; var181 < var180.length; ++var181) {
                     int var182 = var180[var181];
                     if (this.field10186 == null || (arg6 & this.field10186[var182]) != 0) {
                        int var183 = (this.field10159[var182] & 255) + arg2 * 8;
                        if (var183 < 0) {
                           var183 = 0;
                        } else if (var183 > 255) {
                           var183 = 255;
                        }

                        this.field10159[var182] = (byte)var183;
                     }
                  }

                  var177 |= var180.length > 0;
               }
            }

            if (var177) {
               if (this.field10175 != null) {
                  for(int var184 = 0; var184 < this.field10144; ++var184) {
                     class501 var185 = this.field10175[var184];
                     class507 var186 = this.field10148[var184];
                     var186.field4060 = var186.field4060 & 16777215 | 255 - (this.field10159[var185.field4029] & 255) << 24;
                  }
               }

               this.method16533();
            }
         }

      } else if (arg0 == 7) {
         if (this.field10164 != null) {
            boolean var187 = false;

            for(int var188 = 0; var188 < var9; ++var188) {
               int var189 = arg1[var188];
               if (var189 < this.field10164.length) {
                  int[] var190 = this.field10164[var189];

                  for(int var191 = 0; var191 < var190.length; ++var191) {
                     int var192 = var190[var191];
                     if (this.field10186 == null || (arg6 & this.field10186[var192]) != 0) {
                        int var193 = this.field10158[var192] & 65535;
                        int var194 = var193 >> 10 & 63;
                        int var195 = var193 >> 7 & 7;
                        int var196 = var193 & 127;
                        int var197 = arg2 + var194 & 63;
                        int var198 = arg3 / 4 + var195;
                        if (var198 < 0) {
                           var198 = 0;
                        } else if (var198 > 7) {
                           var198 = 7;
                        }

                        int var199 = arg4 + var196;
                        if (var199 < 0) {
                           var199 = 0;
                        } else if (var199 > 127) {
                           var199 = 127;
                        }

                        this.field10158[var192] = (short)(var197 << 10 | var198 << 7 | var199);
                     }
                  }

                  var187 |= var190.length > 0;
               }
            }

            if (var187) {
               if (this.field10175 != null) {
                  for(int var200 = 0; var200 < this.field10144; ++var200) {
                     class501 var201 = this.field10175[var200];
                     class507 var202 = this.field10148[var200];
                     var202.field4060 = var202.field4060 & -16777216 | Statics.field7196[this.field10158[var201.field4029] & 65535] & 16777215;
                  }
               }

               this.method16533();
            }
         }

      } else if (arg0 == 8) {
         if (this.field10194 != null) {
            for(int var203 = 0; var203 < var9; ++var203) {
               int var204 = arg1[var203];
               if (var204 < this.field10194.length) {
                  int[] var205 = this.field10194[var204];

                  for(int var206 = 0; var206 < var205.length; ++var206) {
                     class507 var207 = this.field10148[var205[var206]];
                     var207.field4058 += arg2;
                     var207.field4059 += arg3;
                  }
               }
            }
         }

      } else if (arg0 == 10) {
         if (this.field10194 != null) {
            for(int var208 = 0; var208 < var9; ++var208) {
               int var209 = arg1[var208];
               if (var209 < this.field10194.length) {
                  int[] var210 = this.field10194[var209];

                  for(int var211 = 0; var211 < var210.length; ++var211) {
                     class507 var212 = this.field10148[var210[var211]];
                     var212.field4056 = var212.field4056 * arg2 >> 7;
                     var212.field4055 = var212.field4055 * arg3 >> 7;
                  }
               }
            }
         }

      } else if (arg0 == 9) {
         if (this.field10194 != null) {
            for(int var213 = 0; var213 < var9; ++var213) {
               int var214 = arg1[var213];
               if (var214 < this.field10194.length) {
                  int[] var215 = this.field10194[var214];

                  for(int var216 = 0; var216 < var215.length; ++var216) {
                     class507 var217 = this.field10148[var215[var216]];
                     var217.field4057 = var217.field4057 + arg2 & 16383;
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yu.w(IIII)V")
   protected void method6931(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 == 0) {
         int var5 = 0;
         this.field10202 = 0;
         this.field10187 = 0;
         this.field10163 = 0;

         for(int var6 = 0; var6 < this.field10140; ++var6) {
            this.field10202 += this.field10174[var6];
            this.field10187 += this.field10142[var6];
            this.field10163 += this.field10143[var6];
            ++var5;
         }

         if (var5 > 0) {
            this.field10202 = this.field10202 / var5 + arg1;
            this.field10187 = this.field10187 / var5 + arg2;
            this.field10163 = this.field10163 / var5 + arg3;
         } else {
            this.field10202 = arg1;
            this.field10187 = arg2;
            this.field10163 = arg3;
         }

      } else if (arg0 == 1) {
         for(int var7 = 0; var7 < this.field10140; ++var7) {
            this.field10174[var7] += arg1;
            this.field10142[var7] += arg2;
            this.field10143[var7] += arg3;
         }

      } else if (arg0 == 2) {
         for(int var8 = 0; var8 < this.field10140; ++var8) {
            this.field10174[var8] -= this.field10202;
            this.field10142[var8] -= this.field10187;
            this.field10143[var8] -= this.field10163;
            if (arg3 != 0) {
               int var9 = class603.field5469[arg3];
               int var10 = class603.field5471[arg3];
               int var11 = this.field10174[var8] * var10 + this.field10142[var8] * var9 + 16383 >> 14;
               this.field10142[var8] = this.field10142[var8] * var10 - this.field10174[var8] * var9 + 16383 >> 14;
               this.field10174[var8] = var11;
            }

            if (arg1 != 0) {
               int var12 = class603.field5469[arg1];
               int var13 = class603.field5471[arg1];
               int var14 = this.field10142[var8] * var13 - this.field10143[var8] * var12 + 16383 >> 14;
               this.field10143[var8] = this.field10143[var8] * var13 + this.field10142[var8] * var12 + 16383 >> 14;
               this.field10142[var8] = var14;
            }

            if (arg2 != 0) {
               int var15 = class603.field5469[arg2];
               int var16 = class603.field5471[arg2];
               int var17 = this.field10174[var8] * var16 + this.field10143[var8] * var15 + 16383 >> 14;
               this.field10143[var8] = this.field10143[var8] * var16 - this.field10174[var8] * var15 + 16383 >> 14;
               this.field10174[var8] = var17;
            }

            this.field10174[var8] += this.field10202;
            this.field10142[var8] += this.field10187;
            this.field10143[var8] += this.field10163;
         }

      } else if (arg0 == 3) {
         for(int var18 = 0; var18 < this.field10140; ++var18) {
            this.field10174[var18] -= this.field10202;
            this.field10142[var18] -= this.field10187;
            this.field10143[var18] -= this.field10163;
            this.field10174[var18] = this.field10174[var18] * arg1 / 128;
            this.field10142[var18] = this.field10142[var18] * arg2 / 128;
            this.field10143[var18] = this.field10143[var18] * arg3 / 128;
            this.field10174[var18] += this.field10202;
            this.field10142[var18] += this.field10187;
            this.field10143[var18] += this.field10163;
         }

      } else if (arg0 == 5) {
         for(int var19 = 0; var19 < this.field10156 * -1431655765; ++var19) {
            int var20 = (this.field10159[var19] & 255) + arg1 * 8;
            if (var20 < 0) {
               var20 = 0;
            } else if (var20 > 255) {
               var20 = 255;
            }

            this.field10159[var19] = (byte)var20;
         }

         if (this.field10175 != null) {
            for(int var21 = 0; var21 < this.field10144; ++var21) {
               class501 var22 = this.field10175[var21];
               class507 var23 = this.field10148[var21];
               var23.field4060 = var23.field4060 & 16777215 | 255 - (this.field10159[var22.field4029] & 255) << 24;
            }
         }

         this.method16533();
      } else if (arg0 == 7) {
         for(int var24 = 0; var24 < this.field10156 * -1431655765; ++var24) {
            int var25 = this.field10158[var24] & 65535;
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

            this.field10158[var24] = (short)(var29 << 10 | var30 << 7 | var31);
         }

         if (this.field10175 != null) {
            for(int var32 = 0; var32 < this.field10144; ++var32) {
               class501 var33 = this.field10175[var32];
               class507 var34 = this.field10148[var32];
               var34.field4060 = var34.field4060 & -16777216 | Statics.field7196[this.field10158[var33.field4029] & 65535] & 16777215;
            }
         }

         this.method16533();
      } else if (arg0 == 8) {
         for(int var35 = 0; var35 < this.field10144; ++var35) {
            class507 var36 = this.field10148[var35];
            var36.field4058 += arg1;
            var36.field4059 += arg2;
         }

      } else if (arg0 == 10) {
         for(int var37 = 0; var37 < this.field10144; ++var37) {
            class507 var38 = this.field10148[var37];
            var38.field4056 = var38.field4056 * arg1 >> 7;
            var38.field4055 = var38.field4055 * arg2 >> 7;
         }

      } else if (arg0 == 9) {
         for(int var39 = 0; var39 < this.field10144; ++var39) {
            class507 var40 = this.field10148[var39];
            var40.field4057 = var40.field4057 + arg1 & 16383;
         }

      }
   }

   @deob.ObfuscatedName("yu.af(I[IIIIIZ)V")
   protected void method6928(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      int var8 = arg1.length;
      if (arg0 == 0) {
         int var9 = arg2 << 4;
         int var10 = arg3 << 4;
         int var11 = arg4 << 4;
         int var12 = 0;
         this.field10202 = 0;
         this.field10187 = 0;
         this.field10163 = 0;

         for(int var13 = 0; var13 < var8; ++var13) {
            int var14 = arg1[var13];
            if (var14 < this.field10181.length) {
               int[] var15 = this.field10181[var14];

               for(int var16 = 0; var16 < var15.length; ++var16) {
                  int var17 = var15[var16];
                  this.field10202 += this.field10174[var17];
                  this.field10187 += this.field10142[var17];
                  this.field10163 += this.field10143[var17];
                  ++var12;
               }
            }
         }

         if (var12 > 0) {
            this.field10202 = this.field10202 / var12 + var9;
            this.field10187 = this.field10187 / var12 + var10;
            this.field10163 = this.field10163 / var12 + var11;
         } else {
            this.field10202 = var9;
            this.field10187 = var10;
            this.field10163 = var11;
         }

      } else if (arg0 == 1) {
         int var18 = arg2 << 4;
         int var19 = arg3 << 4;
         int var20 = arg4 << 4;

         for(int var21 = 0; var21 < var8; ++var21) {
            int var22 = arg1[var21];
            if (var22 < this.field10181.length) {
               int[] var23 = this.field10181[var22];

               for(int var24 = 0; var24 < var23.length; ++var24) {
                  int var25 = var23[var24];
                  this.field10174[var25] += var18;
                  this.field10142[var25] += var19;
                  this.field10143[var25] += var20;
               }
            }
         }

      } else if (arg0 == 2) {
         for(int var26 = 0; var26 < var8; ++var26) {
            int var27 = arg1[var26];
            if (var27 < this.field10181.length) {
               int[] var28 = this.field10181[var27];
               if ((arg5 & 1) == 0) {
                  for(int var29 = 0; var29 < var28.length; ++var29) {
                     int var30 = var28[var29];
                     this.field10174[var30] -= this.field10202;
                     this.field10142[var30] -= this.field10187;
                     this.field10143[var30] -= this.field10163;
                     if (arg4 != 0) {
                        int var31 = class603.field5469[arg4];
                        int var32 = class603.field5471[arg4];
                        int var33 = this.field10174[var30] * var32 + this.field10142[var30] * var31 + 16383 >> 14;
                        this.field10142[var30] = this.field10142[var30] * var32 - this.field10174[var30] * var31 + 16383 >> 14;
                        this.field10174[var30] = var33;
                     }

                     if (arg2 != 0) {
                        int var34 = class603.field5469[arg2];
                        int var35 = class603.field5471[arg2];
                        int var36 = this.field10142[var30] * var35 - this.field10143[var30] * var34 + 16383 >> 14;
                        this.field10143[var30] = this.field10143[var30] * var35 + this.field10142[var30] * var34 + 16383 >> 14;
                        this.field10142[var30] = var36;
                     }

                     if (arg3 != 0) {
                        int var37 = class603.field5469[arg3];
                        int var38 = class603.field5471[arg3];
                        int var39 = this.field10174[var30] * var38 + this.field10143[var30] * var37 + 16383 >> 14;
                        this.field10143[var30] = this.field10143[var30] * var38 - this.field10174[var30] * var37 + 16383 >> 14;
                        this.field10174[var30] = var39;
                     }

                     this.field10174[var30] += this.field10202;
                     this.field10142[var30] += this.field10187;
                     this.field10143[var30] += this.field10163;
                  }
               } else {
                  for(int var40 = 0; var40 < var28.length; ++var40) {
                     int var41 = var28[var40];
                     this.field10174[var41] -= this.field10202;
                     this.field10142[var41] -= this.field10187;
                     this.field10143[var41] -= this.field10163;
                     if (arg2 != 0) {
                        int var42 = class603.field5469[arg2];
                        int var43 = class603.field5471[arg2];
                        int var44 = this.field10142[var41] * var43 - this.field10143[var41] * var42 + 16383 >> 14;
                        this.field10143[var41] = this.field10143[var41] * var43 + this.field10142[var41] * var42 + 16383 >> 14;
                        this.field10142[var41] = var44;
                     }

                     if (arg4 != 0) {
                        int var45 = class603.field5469[arg4];
                        int var46 = class603.field5471[arg4];
                        int var47 = this.field10174[var41] * var46 + this.field10142[var41] * var45 + 16383 >> 14;
                        this.field10142[var41] = this.field10142[var41] * var46 - this.field10174[var41] * var45 + 16383 >> 14;
                        this.field10174[var41] = var47;
                     }

                     if (arg3 != 0) {
                        int var48 = class603.field5469[arg3];
                        int var49 = class603.field5471[arg3];
                        int var50 = this.field10174[var41] * var49 + this.field10143[var41] * var48 + 16383 >> 14;
                        this.field10143[var41] = this.field10143[var41] * var49 - this.field10174[var41] * var48 + 16383 >> 14;
                        this.field10174[var41] = var50;
                     }

                     this.field10174[var41] += this.field10202;
                     this.field10142[var41] += this.field10187;
                     this.field10143[var41] += this.field10163;
                  }
               }
            }
         }

         if (arg6) {
            for(int var51 = 0; var51 < var8; ++var51) {
               int var52 = arg1[var51];
               if (var52 < this.field10181.length) {
                  int[] var53 = this.field10181[var52];

                  for(int var54 = 0; var54 < var53.length; ++var54) {
                     int var55 = var53[var54];
                     int var56 = this.field10136[var55];
                     int var57 = this.field10136[var55 + 1];

                     for(int var58 = var56; var58 < var57; ++var58) {
                        int var59 = this.field10188[var58] - 1;
                        if (var59 == -1) {
                           break;
                        }

                        if (arg4 != 0) {
                           int var60 = class603.field5469[arg4];
                           int var61 = class603.field5471[arg4];
                           int var62 = this.field10150[var59] * var60 + this.field10149[var59] * var61 + 16383 >> 14;
                           this.field10150[var59] = (short)(this.field10150[var59] * var61 - this.field10149[var59] * var60 + 16383 >> 14);
                           this.field10149[var59] = (short)var62;
                        }

                        if (arg2 != 0) {
                           int var63 = class603.field5469[arg2];
                           int var64 = class603.field5471[arg2];
                           int var65 = this.field10150[var59] * var64 - this.field10171[var59] * var63 + 16383 >> 14;
                           this.field10171[var59] = (short)(this.field10171[var59] * var64 + this.field10150[var59] * var63 + 16383 >> 14);
                           this.field10150[var59] = (short)var65;
                        }

                        if (arg3 != 0) {
                           int var66 = class603.field5469[arg3];
                           int var67 = class603.field5471[arg3];
                           int var68 = this.field10171[var59] * var66 + this.field10149[var59] * var67 + 16383 >> 14;
                           this.field10171[var59] = (short)(this.field10171[var59] * var67 - this.field10149[var59] * var66 + 16383 >> 14);
                           this.field10149[var59] = (short)var68;
                        }
                     }
                  }
               }
            }

            this.method16534();
         }

      } else if (arg0 == 3) {
         for(int var69 = 0; var69 < var8; ++var69) {
            int var70 = arg1[var69];
            if (var70 < this.field10181.length) {
               int[] var71 = this.field10181[var70];

               for(int var72 = 0; var72 < var71.length; ++var72) {
                  int var73 = var71[var72];
                  this.field10174[var73] -= this.field10202;
                  this.field10142[var73] -= this.field10187;
                  this.field10143[var73] -= this.field10163;
                  this.field10174[var73] = this.field10174[var73] * arg2 >> 7;
                  this.field10142[var73] = this.field10142[var73] * arg3 >> 7;
                  this.field10143[var73] = this.field10143[var73] * arg4 >> 7;
                  this.field10174[var73] += this.field10202;
                  this.field10142[var73] += this.field10187;
                  this.field10143[var73] += this.field10163;
               }
            }
         }

      } else if (arg0 == 5) {
         if (this.field10164 != null) {
            boolean var74 = false;

            for(int var75 = 0; var75 < var8; ++var75) {
               int var76 = arg1[var75];
               if (var76 < this.field10164.length) {
                  int[] var77 = this.field10164[var76];

                  for(int var78 = 0; var78 < var77.length; ++var78) {
                     int var79 = var77[var78];
                     int var80 = (this.field10159[var79] & 255) + arg2 * 8;
                     if (var80 < 0) {
                        var80 = 0;
                     } else if (var80 > 255) {
                        var80 = 255;
                     }

                     this.field10159[var79] = (byte)var80;
                  }

                  var74 |= var77.length > 0;
               }
            }

            if (var74) {
               if (this.field10175 != null) {
                  for(int var81 = 0; var81 < this.field10144; ++var81) {
                     class501 var82 = this.field10175[var81];
                     class507 var83 = this.field10148[var81];
                     var83.field4060 = var83.field4060 & 16777215 | 255 - (this.field10159[var82.field4029] & 255) << 24;
                  }
               }

               this.method16533();
            }
         }

      } else if (arg0 == 7) {
         if (this.field10164 != null) {
            boolean var84 = false;

            for(int var85 = 0; var85 < var8; ++var85) {
               int var86 = arg1[var85];
               if (var86 < this.field10164.length) {
                  int[] var87 = this.field10164[var86];

                  for(int var88 = 0; var88 < var87.length; ++var88) {
                     int var89 = var87[var88];
                     int var90 = this.field10158[var89] & 65535;
                     int var91 = var90 >> 10 & 63;
                     int var92 = var90 >> 7 & 7;
                     int var93 = var90 & 127;
                     int var94 = arg2 + var91 & 63;
                     int var95 = arg3 / 4 + var92;
                     if (var95 < 0) {
                        var95 = 0;
                     } else if (var95 > 7) {
                        var95 = 7;
                     }

                     int var96 = arg4 + var93;
                     if (var96 < 0) {
                        var96 = 0;
                     } else if (var96 > 127) {
                        var96 = 127;
                     }

                     this.field10158[var89] = (short)(var94 << 10 | var95 << 7 | var96);
                  }

                  var84 |= var87.length > 0;
               }
            }

            if (var84) {
               if (this.field10175 != null) {
                  for(int var97 = 0; var97 < this.field10144; ++var97) {
                     class501 var98 = this.field10175[var97];
                     class507 var99 = this.field10148[var97];
                     var99.field4060 = var99.field4060 & -16777216 | Statics.field7196[this.field10158[var98.field4029] & 65535] & 16777215;
                  }
               }

               this.method16533();
            }
         }

      } else if (arg0 == 8) {
         if (this.field10194 != null) {
            for(int var100 = 0; var100 < var8; ++var100) {
               int var101 = arg1[var100];
               if (var101 < this.field10194.length) {
                  int[] var102 = this.field10194[var101];

                  for(int var103 = 0; var103 < var102.length; ++var103) {
                     class507 var104 = this.field10148[var102[var103]];
                     var104.field4058 += arg2;
                     var104.field4059 += arg3;
                  }
               }
            }
         }

      } else if (arg0 == 10) {
         if (this.field10194 != null) {
            for(int var105 = 0; var105 < var8; ++var105) {
               int var106 = arg1[var105];
               if (var106 < this.field10194.length) {
                  int[] var107 = this.field10194[var106];

                  for(int var108 = 0; var108 < var107.length; ++var108) {
                     class507 var109 = this.field10148[var107[var108]];
                     var109.field4056 = var109.field4056 * arg2 >> 7;
                     var109.field4055 = var109.field4055 * arg3 >> 7;
                  }
               }
            }
         }

      } else if (arg0 == 9) {
         if (this.field10194 != null) {
            for(int var110 = 0; var110 < var8; ++var110) {
               int var111 = arg1[var110];
               if (var111 < this.field10194.length) {
                  int[] var112 = this.field10194[var111];

                  for(int var113 = 0; var113 < var112.length; ++var113) {
                     class507 var114 = this.field10148[var112[var113]];
                     var114.field4057 = var114.field4057 + arg2 & 16383;
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yu.ka()V")
   protected void method6932() {
      for(int var1 = 0; var1 < this.field10206; ++var1) {
         this.field10174[var1] = this.field10174[var1] + 7 >> 4;
         this.field10142[var1] = this.field10142[var1] + 7 >> 4;
         this.field10143[var1] = this.field10143[var1] + 7 >> 4;
      }

      this.method16532();
      this.field10177 = false;
   }

   @deob.ObfuscatedName("yu.at(Lka;IZ)V")
   public void method6983(class583 arg0, int arg1, boolean arg2) {
      if (this.field10145 != null) {
         class583 var4 = arg0;
         if (arg2) {
            var4 = this.field10141.field9994;
            var4.method8063(arg0);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.field10140; ++var6) {
            if ((arg1 & this.field10145[var6]) != 0) {
               var4.method8123((float)this.field10174[var6], (float)this.field10142[var6], (float)this.field10143[var6], var5);
               this.field10174[var6] = (int)var5[0];
               this.field10142[var6] = (int)var5[1];
               this.field10143[var6] = (int)var5[2];
            }
         }

      }
   }

   @deob.ObfuscatedName("yu.ab()[Lcl;")
   public class370[] method6958() {
      return this.field10193;
   }

   @deob.ObfuscatedName("yu.ao()[Ldw;")
   public class408[] method6957() {
      return this.field10151;
   }

   @deob.ObfuscatedName("yu.ak(Lka;)V")
   public void method7024(class583 arg0) {
      class597 var2 = this.field10141.field9995;
      var2.method8391(arg0);
      if (this.field10151 != null) {
         for(int var3 = 0; var3 < this.field10151.length; ++var3) {
            class408 var4 = this.field10151[var3];
            class408 var5 = var4;
            if (var4.field3072 != null) {
               var5 = var4.field3072;
            }

            var5.field3074 = (int)(var2.field5413[8] * (float)this.field10143[var4.field3079] + var2.field5413[0] * (float)this.field10174[var4.field3079] + var2.field5413[4] * (float)this.field10142[var4.field3079] + var2.field5413[12]);
            var5.field3075 = (int)(var2.field5413[9] * (float)this.field10143[var4.field3079] + var2.field5413[1] * (float)this.field10174[var4.field3079] + var2.field5413[5] * (float)this.field10142[var4.field3079] + var2.field5413[13]);
            var5.field3076 = (int)(var2.field5413[10] * (float)this.field10143[var4.field3079] + var2.field5413[2] * (float)this.field10174[var4.field3079] + var2.field5413[6] * (float)this.field10142[var4.field3079] + var2.field5413[14]);
            var5.field3069 = (int)(var2.field5413[8] * (float)this.field10143[var4.field3071] + var2.field5413[0] * (float)this.field10174[var4.field3071] + var2.field5413[4] * (float)this.field10142[var4.field3071] + var2.field5413[12]);
            var5.field3077 = (int)(var2.field5413[9] * (float)this.field10143[var4.field3071] + var2.field5413[1] * (float)this.field10174[var4.field3071] + var2.field5413[5] * (float)this.field10142[var4.field3071] + var2.field5413[13]);
            var5.field3082 = (int)(var2.field5413[10] * (float)this.field10143[var4.field3071] + var2.field5413[2] * (float)this.field10174[var4.field3071] + var2.field5413[6] * (float)this.field10142[var4.field3071] + var2.field5413[14]);
            var5.field3080 = (int)(var2.field5413[8] * (float)this.field10143[var4.field3068] + var2.field5413[0] * (float)this.field10174[var4.field3068] + var2.field5413[4] * (float)this.field10142[var4.field3068] + var2.field5413[12]);
            var5.field3070 = (int)(var2.field5413[9] * (float)this.field10143[var4.field3068] + var2.field5413[1] * (float)this.field10174[var4.field3068] + var2.field5413[5] * (float)this.field10142[var4.field3068] + var2.field5413[13]);
            var5.field3078 = (int)(var2.field5413[10] * (float)this.field10143[var4.field3068] + var2.field5413[2] * (float)this.field10174[var4.field3068] + var2.field5413[6] * (float)this.field10142[var4.field3068] + var2.field5413[14]);
         }
      }

      if (this.field10193 != null) {
         for(int var6 = 0; var6 < this.field10193.length; ++var6) {
            class370 var7 = this.field10193[var6];
            class370 var8 = var7;
            if (var7.field2387 != null) {
               var8 = var7.field2387;
            }

            if (var7.field2386 != null) {
               var7.field2386.method8386(var2);
            } else {
               var7.field2386 = new class597(var2);
            }

            var8.field2384 = (int)(var2.field5413[8] * (float)this.field10143[var7.field2383] + var2.field5413[0] * (float)this.field10174[var7.field2383] + var2.field5413[4] * (float)this.field10142[var7.field2383] + var2.field5413[12]);
            var8.field2381 = (int)(var2.field5413[9] * (float)this.field10143[var7.field2383] + var2.field5413[1] * (float)this.field10174[var7.field2383] + var2.field5413[5] * (float)this.field10142[var7.field2383] + var2.field5413[13]);
            var8.field2385 = (int)(var2.field5413[10] * (float)this.field10143[var7.field2383] + var2.field5413[2] * (float)this.field10174[var7.field2383] + var2.field5413[6] * (float)this.field10142[var7.field2383] + var2.field5413[14]);
         }
      }

   }

   @deob.ObfuscatedName("yu.aw(IILka;ZI)Z")
   public boolean method6935(int arg0, int arg1, class583 arg2, boolean arg3, int arg4) {
      return this.method16544(arg0, arg1, 0, 0, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("yu.gi(IIIILka;ZI)Z")
   private boolean method16544(int arg0, int arg1, int arg2, int arg3, class583 arg4, boolean arg5, int arg6) {
      class597 var8 = this.field10141.field9995;
      var8.method8391(arg4);
      var8.method8388(this.field10141.field10009);
      boolean var9 = false;
      float var10 = Float.MAX_VALUE;
      float var11 = -3.4028235E38F;
      float var12 = Float.MAX_VALUE;
      float var13 = -3.4028235E38F;
      if (!this.field10177) {
         this.method16581();
      }

      int var14 = this.field10139 - this.field10180 >> 1;
      int var15 = this.field10179 - this.field10178 >> 1;
      int var16 = this.field10183 - this.field10182 >> 1;
      int var17 = this.field10180 + var14;
      int var18 = this.field10178 + var15;
      int var19 = this.field10182 + var16;
      int var20 = var17 - (var14 << arg6);
      int var21 = var18 - (var15 << arg6);
      int var22 = var19 - (var16 << arg6);
      int var23 = (var14 << arg6) + var17;
      int var24 = (var15 << arg6) + var18;
      int var25 = (var16 << arg6) + var19;
      this.field10199[0] = var20;
      this.field10200[0] = var21;
      this.field10201[0] = var22;
      this.field10199[1] = var23;
      this.field10200[1] = var21;
      this.field10201[1] = var22;
      this.field10199[2] = var20;
      this.field10200[2] = var24;
      this.field10201[2] = var22;
      this.field10199[3] = var23;
      this.field10200[3] = var24;
      this.field10201[3] = var22;
      this.field10199[4] = var20;
      this.field10200[4] = var21;
      this.field10201[4] = var25;
      this.field10199[5] = var23;
      this.field10200[5] = var21;
      this.field10201[5] = var25;
      this.field10199[6] = var20;
      this.field10200[6] = var24;
      this.field10201[6] = var25;
      this.field10199[7] = var23;
      this.field10200[7] = var24;
      this.field10201[7] = var25;

      for(int var26 = 0; var26 < 8; ++var26) {
         float var27 = (float)this.field10199[var26];
         float var28 = (float)this.field10200[var26];
         float var29 = (float)this.field10201[var26];
         float var30 = var8.field5413[10] * var29 + var8.field5413[2] * var27 + var8.field5413[6] * var28 + var8.field5413[14];
         float var31 = var8.field5413[11] * var29 + var8.field5413[3] * var27 + var8.field5413[7] * var28 + var8.field5413[15];
         if (var30 >= -var31) {
            float var32 = var8.field5413[8] * var29 + var8.field5413[0] * var27 + var8.field5413[4] * var28 + var8.field5413[12];
            float var33 = var8.field5413[9] * var29 + var8.field5413[1] * var27 + var8.field5413[5] * var28 + var8.field5413[13];
            float var34 = this.field10141.field10013 * var32 / var31 + this.field10141.field10012;
            float var35 = this.field10141.field10015 * var33 / var31 + this.field10141.field10014;
            if (var34 < var10) {
               var10 = var34;
            }

            if (var34 > var11) {
               var11 = var34;
            }

            if (var35 < var12) {
               var12 = var35;
            }

            if (var35 > var13) {
               var13 = var35;
            }

            var9 = true;
         }
      }

      int var36 = arg0 + arg2;
      int var37 = arg1 + arg3;
      if (var9 && (float)var36 > var10 && (float)arg0 < var11 && (float)var37 > var12 && (float)arg1 < var13) {
         if (arg5) {
            return true;
         }

         if (this.field10197.length < this.field10205) {
            this.field10197 = new int[this.field10205];
            this.field10198 = new int[this.field10205];
         }

         for(int var38 = 0; var38 < this.field10140; ++var38) {
            float var39 = (float)this.field10174[var38];
            float var40 = (float)this.field10142[var38];
            float var41 = (float)this.field10143[var38];
            float var42 = var8.field5413[10] * var41 + var8.field5413[2] * var39 + var8.field5413[6] * var40 + var8.field5413[14];
            float var43 = var8.field5413[11] * var41 + var8.field5413[3] * var39 + var8.field5413[7] * var40 + var8.field5413[15];
            if (var42 >= -var43) {
               float var44 = var8.field5413[8] * var41 + var8.field5413[0] * var39 + var8.field5413[4] * var40 + var8.field5413[12];
               float var45 = var8.field5413[9] * var41 + var8.field5413[1] * var39 + var8.field5413[5] * var40 + var8.field5413[13];
               int var46 = this.field10136[var38];
               int var47 = this.field10136[var38 + 1];

               for(int var48 = var46; var48 < var47; ++var48) {
                  int var49 = this.field10188[var48] - 1;
                  if (var49 == -1) {
                     break;
                  }

                  this.field10197[var49] = (int)(this.field10141.field10013 * var44 / var43 + this.field10141.field10012);
                  this.field10198[var49] = (int)(this.field10141.field10015 * var45 / var43 + this.field10141.field10014);
               }
            } else {
               int var50 = this.field10136[var38];
               int var51 = this.field10136[var38 + 1];

               for(int var52 = var50; var52 < var51; ++var52) {
                  int var53 = this.field10188[var52] - 1;
                  if (var53 == -1) {
                     break;
                  }

                  this.field10197[this.field10188[var52] - 1] = -999999;
               }
            }
         }

         for(int var54 = 0; var54 < this.field10156 * -1431655765; ++var54) {
            if (this.field10197[this.field10160[var54]] != -999999 && this.field10197[this.field10161[var54]] != -999999 && this.field10197[this.field10162[var54]] != -999999 && this.method16542(arg0, arg1, var36, var37, this.field10198[this.field10160[var54]], this.field10198[this.field10161[var54]], this.field10198[this.field10162[var54]], this.field10197[this.field10160[var54]], this.field10197[this.field10161[var54]], this.field10197[this.field10162[var54]])) {
               return true;
            }
         }
      }

      return false;
   }

   @deob.ObfuscatedName("yu.gn(IIIIIIIIII)Z")
   private boolean method16542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
         return false;
      } else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
         return false;
      } else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
         return false;
      } else {
         return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
      }
   }

   @deob.ObfuscatedName("yu.ga(Lna;)Lna;")
   public class664 method7072(class664 arg0) {
      if (this.field10205 == 0) {
         return null;
      } else {
         if (!this.field10177) {
            this.method16581();
         }

         int var2;
         int var3;
         if (this.field10141.field10019 > 0) {
            var2 = this.field10180 - (this.field10141.field10019 * this.field10179 >> 8) >> this.field10141.field10057;
            var3 = this.field10139 - (this.field10141.field10019 * this.field10178 >> 8) >> this.field10141.field10057;
         } else {
            var2 = this.field10180 - (this.field10141.field10019 * this.field10178 >> 8) >> this.field10141.field10057;
            var3 = this.field10139 - (this.field10141.field10019 * this.field10179 >> 8) >> this.field10141.field10057;
         }

         int var4;
         int var5;
         if (this.field10141.field9993 > 0) {
            var4 = this.field10182 - (this.field10141.field9993 * this.field10179 >> 8) >> this.field10141.field10057;
            var5 = this.field10183 - (this.field10141.field9993 * this.field10178 >> 8) >> this.field10141.field10057;
         } else {
            var4 = this.field10182 - (this.field10141.field9993 * this.field10178 >> 8) >> this.field10141.field10057;
            var5 = this.field10183 - (this.field10141.field9993 * this.field10179 >> 8) >> this.field10141.field10057;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         class300 var8 = (class300)arg0;
         class300 var9;
         if (var8 != null && var8.method3857(var6, var7)) {
            var9 = var8;
            var8.method3858();
         } else {
            var9 = new class300(this.field10141, var6, var7);
         }

         var9.method3855(var2, var4, var3, var5);
         this.method16545(var9);
         return var9;
      }
   }

   @deob.ObfuscatedName("yu.gj(Lala;)V")
   private void method16545(class300 arg0) {
      if (this.field10197.length < this.field10205) {
         this.field10197 = new int[this.field10205];
         this.field10198 = new int[this.field10205];
      }

      for(int var2 = 0; var2 < this.field10140; ++var2) {
         int var3 = (this.field10174[var2] - (this.field10142[var2] * this.field10141.field10019 >> 8) >> this.field10141.field10057) - arg0.field1900;
         int var4 = (this.field10143[var2] - (this.field10142[var2] * this.field10141.field9993 >> 8) >> this.field10141.field10057) - arg0.field1901;
         int var5 = this.field10136[var2];
         int var6 = this.field10136[var2 + 1];

         for(int var7 = var5; var7 < var6; ++var7) {
            int var8 = this.field10188[var7] - 1;
            if (var8 == -1) {
               break;
            }

            this.field10197[var8] = var3;
            this.field10198[var8] = var4;
         }
      }

      for(int var9 = 0; var9 < this.field10157; ++var9) {
         if (this.field10159 == null || this.field10159[var9] <= 128) {
            short var10 = this.field10160[var9];
            short var11 = this.field10161[var9];
            short var12 = this.field10162[var9];
            int var13 = this.field10197[var10];
            int var14 = this.field10197[var11];
            int var15 = this.field10197[var12];
            int var16 = this.field10198[var10];
            int var17 = this.field10198[var11];
            int var18 = this.field10198[var12];
            if ((var13 - var14) * (var17 - var18) - (var15 - var14) * (var17 - var16) > 0) {
               arg0.method3856(var16, var17, var18, var13, var14, var15);
            }
         }
      }

   }

   @deob.ObfuscatedName("yu.ah(Lka;Ldi;I)V")
   public void method7001(class583 arg0, class394 arg1, int arg2) {
      if (Statics.field10137 != null) {
         Statics.field10137.method7182();
      }

      if (arg1 != null) {
         arg1.field2896 = false;
      }

      if (this.field10205 != 0) {
         class597 var4 = this.field10141.field10005;
         class597 var5 = this.field10141.field9995;
         class597 var6 = this.field10141.field9979;
         var5.method8391(arg0);
         var6.method8386(var5);
         var6.method8388(this.field10141.field10009);
         if (!this.field10177) {
            this.method16581();
         }

         float[] var7 = this.field10141.field9998;
         var5.method8394(0.0F, (float)this.field10178, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method8394(0.0F, (float)this.field10179, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.field10141.field9991[var14];
            float var16 = var15[2] * var10 + var15[0] * var8 + var15[1] * var9 + var15[3] + (float)this.field10176;
            float var17 = var15[2] * var13 + var15[0] * var11 + var15[1] * var12 + var15[3] + (float)this.field10176;
            if (var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field10180 + this.field10139 >> 1;
            int var21 = this.field10183 + this.field10182 >> 1;
            int var23 = this.field10178;
            float var25 = var6.field5413[8] * (float)var21 + var6.field5413[0] * (float)var20 + var6.field5413[4] * (float)var23 + var6.field5413[12];
            float var26 = var6.field5413[9] * (float)var21 + var6.field5413[1] * (float)var20 + var6.field5413[5] * (float)var23 + var6.field5413[13];
            float var27 = var6.field5413[10] * (float)var21 + var6.field5413[2] * (float)var20 + var6.field5413[6] * (float)var23 + var6.field5413[14];
            float var28 = var6.field5413[11] * (float)var21 + var6.field5413[3] * (float)var20 + var6.field5413[7] * (float)var23 + var6.field5413[15];
            if (var27 >= -var28) {
               arg1.field2900 = (int)(this.field10141.field10013 * var25 / var28 + this.field10141.field10012);
               arg1.field2897 = (int)(this.field10141.field10015 * var26 / var28 + this.field10141.field10014);
            } else {
               var18 = true;
            }

            int var30 = this.field10179;
            float var32 = var6.field5413[8] * (float)var21 + var6.field5413[0] * (float)var20 + var6.field5413[4] * (float)var30 + var6.field5413[12];
            float var33 = var6.field5413[9] * (float)var21 + var6.field5413[1] * (float)var20 + var6.field5413[5] * (float)var30 + var6.field5413[13];
            float var34 = var6.field5413[10] * (float)var21 + var6.field5413[2] * (float)var20 + var6.field5413[6] * (float)var30 + var6.field5413[14];
            float var35 = var6.field5413[11] * (float)var21 + var6.field5413[3] * (float)var20 + var6.field5413[7] * (float)var30 + var6.field5413[15];
            if (var34 >= -var35) {
               arg1.field2899 = (int)(this.field10141.field10013 * var32 / var35 + this.field10141.field10012);
               arg1.field2898 = (int)(this.field10141.field10015 * var33 / var35 + this.field10141.field10014);
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
                  arg1.field2900 = (int)(this.field10141.field10013 * var37 / var39 + this.field10141.field10012);
                  arg1.field2897 = (int)(this.field10141.field10015 * var38 / var39 + this.field10141.field10014);
               } else if (var34 < -var35) {
                  float var40 = (var34 + var35) / (var27 + var28) - 1.0F;
                  float var41 = (var25 - var32) * var40 + var32;
                  float var42 = (var26 - var33) * var40 + var33;
                  float var43 = (var28 - var35) * var40 + var35;
                  arg1.field2899 = (int)(this.field10141.field10013 * var41 / var43 + this.field10141.field10012);
                  arg1.field2898 = (int)(this.field10141.field10015 * var42 / var43 + this.field10141.field10014);
               }
            }

            if (var19) {
               if (var27 / var28 > var34 / var35) {
                  float var44 = var4.field5413[0] * (float)this.field10176 + var25 + var4.field5413[12];
                  float var45 = var4.field5413[3] * (float)this.field10176 + var28 + var4.field5413[15];
                  arg1.field2901 = (int)(this.field10141.field10013 * var44 / var45 + (this.field10141.field10012 - (float)arg1.field2900));
               } else {
                  float var46 = var4.field5413[0] * (float)this.field10176 + var32 + var4.field5413[12];
                  float var47 = var4.field5413[3] * (float)this.field10176 + var35 + var4.field5413[15];
                  arg1.field2901 = (int)(this.field10141.field10013 * var46 / var47 + (this.field10141.field10012 - (float)arg1.field2899));
               }

               arg1.field2896 = true;
            }
         }

         this.field10141.method2500(arg2);
         this.method16538(arg0);
         this.field10141.method2500(0);
         var5.method8391(arg0);
         var5.method8388(this.field10141.field10066);
         this.method16547(var5);
      }
   }

   @deob.ObfuscatedName("yu.gb(Lka;)V")
   private void method16538(class583 arg0) {
      if (this.field10157 != 0) {
         if (this.method16557() && this.method16524()) {
            if (Statics.field10137 != null) {
            }

            this.field10141.method16383();
            class447 var2 = this.field10141.field10033;
            this.field10141.method2539(0, this.field10132.field4087);
            this.field10141.method2539(1, this.field10168.field4087);
            this.field10141.method2539(2, this.field10170.field4087);
            this.field10141.method2624(this.field10166.field3906);
            this.field10141.field9995.method8391(arg0);
            var2.method212(this.field10141.field9995);
            var2.field3696.method8480();
            if (this.field10141.field10088) {
               class402 var3 = this.field10141.method16360();
               var2.field3689.method8356(0.0F, 1.0F, 0.0F, (float)(-this.field10141.field9963));
               var2.field3689.method8369(3.0F / (float)var3.field2964);
               var2.field3694.method8141((float)(var3.field2965 >> 16 & 255) / 255.0F, (float)(var3.field2965 >> 8 & 255) / 255.0F, (float)(var3.field2965 >> 0 & 255) / 255.0F);
            } else {
               var2.field3689.method8356(0.0F, 0.0F, 0.0F, 0.0F);
               var2.field3694.method8141(0.0F, 0.0F, 0.0F);
            }

            if (this.field10141.field10065 > 0) {
               var2.field3695.method8356(0.0F, 0.0F, 1.0F, -this.field10141.field10109);
               var2.field3685.method8141((float)(this.field10141.field10112 >> 16 & 255) / 255.0F, (float)(this.field10141.field10112 >> 8 & 255) / 255.0F, (float)(this.field10141.field10112 >> 0 & 255) / 255.0F);
               this.field10141.field9995.method8391(arg0);
               this.field10141.field9995.method8419();
               var2.field3689.method8368(this.field10141.field9995);
               this.field10141.field9995.method8391(arg0);
               this.field10141.field9995.method8388(this.field10141.field10066);
               this.field10141.field9995.method8419();
               var2.field3695.method8368(this.field10141.field9995);
               var2.field3695.method8369(1.0F / (this.field10141.field10060 - this.field10141.field10109));
            } else {
               var2.field3695.method8356(0.0F, 0.0F, 0.0F, 0.0F);
               var2.field3685.method8141(0.0F, 0.0F, 0.0F);
            }

            if ((this.field10185 & 55) == 0) {
               this.field10141.method2572(this.field10141.field10121);
               if (this.field10141.field9973) {
                  this.field10141.method16343(false);
               }

               for(int var4 = 0; var4 < this.field10134.length; ++var4) {
                  int var5 = this.field10184[var4];
                  int var6 = this.field10184[var4 + 1];
                  int var7 = this.field10203[var5] & 65535;
                  boolean var8 = false;
                  if (var7 != 65535) {
                     var2.field3687 = this.field10141.field10067.method7115(var7);
                     class360 var9 = this.field10141.field7118.method5112(var7);
                     var8 = !class360.method9505(var9.field2324);
                     var2.field3696.field5413[12] = (float)(this.field10141.field10104 % 128000) / 1000.0F * (float)var9.field2330 / 64.0F % 1.0F;
                     var2.field3696.field5413[13] = (float)(this.field10141.field10104 % 128000) / 1000.0F * (float)var9.field2317 / 64.0F % 1.0F;
                  } else {
                     var2.field3687 = this.field10141.field10068;
                     float[] var10 = var2.field3696.field5413;
                     var2.field3696.field5413[13] = 0.0F;
                     var10[12] = 0.0F;
                  }

                  var2.field3702 = this.field10134[var4];
                  var2.field3703 = this.field10165[var4];
                  var2.field3686 = var5 * 3;
                  var2.field3705 = var6 - var5;
                  var2.method231(var8);
               }
            } else {
               this.field10141.method2539(3, this.field10169.field4087);
               this.field10141.method2572(this.field10141.field10122);
               class583 var11 = this.field10141.field9994;
               var11.method8089(arg0);
               var11.method8130();
               int var12 = 0;
               if (this.field10141.field9973) {
                  this.field10141.method16343(true);
               } else {
                  var2.field3697.method8141(this.field10141.field10042[0], this.field10141.field10042[1], this.field10141.field10042[2]);
                  var2.field3697.method8168(var11);
                  var2.field3688.method8141(this.field10141.field10051 * this.field10141.field10047, this.field10141.field10051 * this.field10141.field10048, this.field10141.field10058 * this.field10141.field10051);
                  var2.field3699.method8141(-this.field10141.field9996 * this.field10141.field10047, -this.field10141.field9996 * this.field10141.field10048, -this.field10141.field9996 * this.field10141.field10058);
                  var2.field3690.method8141(this.field10141.field10050 * this.field10141.field10047, this.field10141.field10050 * this.field10141.field10048, this.field10141.field10058 * this.field10141.field10050);
                  if (this.field10141.field10045 > 0) {
                     var12 = this.field10141.field10045;
                     class584 var13 = this.field10141.field9997;

                     for(int var14 = 0; var14 < var12; ++var14) {
                        class81 var15 = this.field10141.field9962[var14];
                        int var16 = var15.method1113();
                        var13.method8177(var15.field582);
                        var13.method8167(var11);
                        var2.field3700[var14 * 4 + 0] = var13.field5328;
                        var2.field3700[var14 * 4 + 1] = var13.field5330;
                        var2.field3700[var14 * 4 + 2] = var13.field5331;
                        var2.field3700[var14 * 4 + 3] = (float)(var15.method1112() * var15.method1112());
                        float var17 = var15.method1114() / 255.0F;
                        var2.field3704[var14 * 4 + 0] = (float)(var16 >> 16 & 255) * var17;
                        var2.field3704[var14 * 4 + 1] = (float)(var16 >> 8 & 255) * var17;
                        var2.field3704[var14 * 4 + 2] = (float)(var16 & 255) * var17;
                        var2.field3704[var14 * 4 + 3] = 1.0F;
                     }
                  }
               }

               for(int var18 = 0; var18 < this.field10134.length; ++var18) {
                  int var19 = this.field10184[var18];
                  int var20 = this.field10184[var18 + 1];
                  int var21 = this.field10203[var19] & 65535;
                  byte var22 = 11;
                  if (var21 != 65535) {
                     var2.field3687 = this.field10141.field10067.method7115(var21);
                     class360 var23 = this.field10141.field7118.method5112(var21);
                     var22 = var23.field2324;
                     var2.method6259(var23);
                     var2.field3696.field5413[12] = (float)(this.field10141.field10104 % 128000) / 1000.0F * (float)var23.field2330 / 64.0F % 1.0F;
                     var2.field3696.field5413[13] = (float)(this.field10141.field10104 % 128000) / 1000.0F * (float)var23.field2317 / 64.0F % 1.0F;
                  } else {
                     var2.field3687 = this.field10141.field10068;
                     float[] var24 = var2.field3696.field5413;
                     var2.field3696.field5413[13] = 0.0F;
                     var24[12] = 0.0F;
                  }

                  var2.field3702 = this.field10134[var18];
                  var2.field3703 = this.field10165[var18];
                  var2.field3686 = var19 * 3;
                  var2.field3705 = var20 - var19;
                  switch(var22) {
                  case 1:
                     var2.field3698.method8141(this.field10141.field9970.field5413[12], this.field10141.field9970.field5413[13], this.field10141.field9970.field5413[14]);
                     var2.field3698.method8167(var11);
                     var2.method222(var12);
                     break;
                  case 2:
                  case 3:
                  case 4:
                  default:
                     var2.method215(var12);
                     break;
                  case 5:
                     if (!this.field10141.field9973) {
                        class201 var25 = this.field10141.field10082;
                        class360 var26 = this.field10141.field7118.method5112(var21);
                        var25.method2834(var26.field2325, var26.field2337);
                        var25.field1321.method8391(arg0);
                        var25.field1314.method8391(arg0);
                        var25.field1314.method8388(this.field10141.field10076);
                        var25.field1327 = this.field10134[var18];
                        var25.field1328 = this.field10165[var18];
                        var25.field1329 = var19;
                        var25.field1320 = var20 - var19;
                        var25.method2833();
                     } else {
                        var2.method215(var12);
                     }
                     break;
                  case 6:
                     var2.method231(!class360.method9505(var22));
                     break;
                  case 7:
                     var2.field3698.method8141(this.field10141.field9970.field5413[12], this.field10141.field9970.field5413[13], this.field10141.field9970.field5413[14]);
                     var2.field3698.method8167(var11);
                     var2.field3701.method8391(arg0);
                     var2.field3683 = this.field10141.method16497();
                     var2.method217(var12);
                  }
               }
            }

            this.method16531();
         }
      }
   }

   @deob.ObfuscatedName("yu.gv(Lko;)V")
   private void method16547(class597 arg0) {
      if (this.field10175 != null) {
         this.field10141.method7551(!this.field10173);
         class583 var2 = this.field10141.field9994;
         class463 var3 = this.field10141.field9968;

         for(int var4 = 0; var4 < this.field10144; ++var4) {
            class501 var5 = this.field10175[var4];
            class507 var6 = this.field10148[var4];
            if (!var5.field4026 || !this.field10141.method7574()) {
               float var7 = (float)(this.field10174[var5.field4028] + this.field10174[var5.field4027] + this.field10174[var5.field4030]) * 0.3333333F;
               float var8 = (float)(this.field10142[var5.field4028] + this.field10142[var5.field4027] + this.field10142[var5.field4030]) * 0.3333333F;
               float var9 = (float)(this.field10143[var5.field4028] + this.field10143[var5.field4027] + this.field10143[var5.field4030]) * 0.3333333F;
               float var10 = arg0.field5413[8] * var9 + arg0.field5413[0] * var7 + arg0.field5413[4] * var8 + arg0.field5413[12];
               float var11 = arg0.field5413[9] * var9 + arg0.field5413[1] * var7 + arg0.field5413[5] * var8 + arg0.field5413[13];
               float var12 = arg0.field5413[10] * var9 + arg0.field5413[2] * var7 + arg0.field5413[6] * var8 + arg0.field5413[14];
               float var13 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + var10 * var10 + var11 * var11))) * (float)var5.field4034;
               var2.method8061(var6.field4057, var5.field4033 * var6.field4056 >> 7, var5.field4031 * var6.field4055 >> 7, (float)var6.field4058 + var10 - var10 * var13, (float)var6.field4059 + var11 - var11 * var13, var12 - var12 * var13);
               var2.method8054(this.field10141.field9988);
               this.field10141.field9979.method8391(var2);
               var3.method358(this.field10141.field9979);
               var3.field3810.method8480();
               var3.field3813 = var6.field4060;
               var3.field3812 = this.field10141.field10067.method7115(var5.field4032);
               var3.method360();
            }
         }

         this.field10141.method7551(true);
      }
   }

   @deob.ObfuscatedName("yu.gw()Z")
   private boolean method16524() {
      if (this.field10166.field3903) {
         return true;
      } else {
         if (this.field10166.field3905 == null) {
            this.field10166.field3905 = this.field10141.method2569(false);
         }

         class534 var1 = this.field10166.field3905;
         var1.method695(this.field10157 * 6);
         Unsafe var2 = this.field10141.field9978;
         if (var2 != null) {
            int var3 = this.field10157 * 6;
            long var4 = var1.method698(0, var3);
            if (var4 == 0L) {
               return false;
            } else {
               for(int var6 = 0; var6 < this.field10157; ++var6) {
                  var2.putShort(var4, this.field10160[var6]);
                  long var7 = var4 + 2L;
                  var2.putShort(var7, this.field10161[var6]);
                  long var9 = var7 + 2L;
                  var2.putShort(var9, this.field10162[var6]);
                  var4 = var9 + 2L;
               }

               var1.method699();
               this.field10166.field3906 = var1;
               this.field10166.field3903 = true;
               this.field10191 = true;
               return true;
            }
         } else {
            ByteBuffer var11 = this.field10141.field9975;
            var11.clear();

            for(int var12 = 0; var12 < this.field10157; ++var12) {
               var11.putShort(this.field10160[var12]);
               var11.putShort(this.field10161[var12]);
               var11.putShort(this.field10162[var12]);
            }

            if (var1.method700(0, var11.position(), this.field10141.field9976)) {
               this.field10166.field3906 = var1;
               this.field10166.field3903 = true;
               this.field10191 = true;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @deob.ObfuscatedName("yu.gz()Z")
   private boolean method16557() {
      boolean var1 = !this.field10168.field4084;
      boolean var2 = (this.field10185 & 55) != 0 && !this.field10169.field4084;
      boolean var3 = !this.field10132.field4084;
      boolean var4 = !this.field10170.field4084;
      if (!var3 && !var1 && !var2 && !var4) {
         return true;
      } else {
         boolean var5 = true;
         if (var3 && this.field10147 != null) {
            if (this.field10132.field4086 == null) {
               this.field10132.field4086 = this.field10141.method2570(this.field10204);
            }

            class508 var6 = this.field10132.field4086;
            var6.method728(this.field10205 * 12, 12);
            Unsafe var7 = this.field10141.field9978;
            if (var7 != null) {
               int var8 = this.field10205 * 12;
               long var9 = var6.method698(0, var8);

               for(int var11 = 0; var11 < this.field10205; ++var11) {
                  short var12 = this.field10147[var11];
                  var7.putFloat(var9, (float)this.field10174[var12]);
                  long var13 = var9 + 4L;
                  var7.putFloat(var13, (float)this.field10142[var12]);
                  long var15 = var13 + 4L;
                  var7.putFloat(var15, (float)this.field10143[var12]);
                  var9 = var15 + 4L;
               }

               var6.method699();
            } else {
               ByteBuffer var17 = this.field10141.field9975;
               var17.clear();

               for(int var18 = 0; var18 < this.field10205; ++var18) {
                  var17.putFloat((float)this.field10174[this.field10147[var18]]);
                  var17.putFloat((float)this.field10142[this.field10147[var18]]);
                  var17.putFloat((float)this.field10143[this.field10147[var18]]);
               }

               var6.method700(0, var17.position(), this.field10141.field9976);
            }

            this.field10132.field4087 = var6;
            this.field10132.field4084 = true;
         }

         if (var1) {
            if (this.field10168.field4086 == null) {
               this.field10168.field4086 = this.field10141.method2570(this.field10204);
            }

            class508 var19 = this.field10168.field4086;
            var19.method728(this.field10205 * 4, 4);
            Unsafe var20 = this.field10141.field9978;
            if (var20 != null) {
               int var21 = this.field10205 * 4;
               long var22 = var19.method698(0, var21);
               if ((this.field10185 & 55) == 0) {
                  short[] var24;
                  short[] var25;
                  short[] var26;
                  byte[] var27;
                  if (this.field10189 != null) {
                     var24 = this.field10189.field4331;
                     var25 = this.field10189.field4330;
                     var26 = this.field10189.field4332;
                     var27 = this.field10189.field4329;
                  } else {
                     var24 = this.field10149;
                     var25 = this.field10150;
                     var26 = this.field10171;
                     var27 = this.field10152;
                  }

                  float var28 = this.field10141.field10051 * 768.0F / (float)this.field10138;
                  float var29 = this.field10141.field9996 * 768.0F / (float)this.field10138;

                  for(int var30 = 0; var30 < this.field10205; ++var30) {
                     short var31 = this.field10192[var30];
                     int var32 = this.method16529(this.field10158[var31] & 65535, this.field10203[var31], this.field10146);
                     float var33 = (float)(var32 >> 16 & 255) * this.field10141.field10047;
                     float var34 = (float)(var32 >> 8 & 255) * this.field10141.field10048;
                     float var35 = (float)(var32 & 255) * this.field10141.field10058;
                     byte var36 = var27[var30];
                     float var37;
                     if (var36 == 0) {
                        var37 = (this.field10141.field10042[2] * (float)var26[var30] + this.field10141.field10042[0] * (float)var24[var30] + this.field10141.field10042[1] * (float)var25[var30]) * 0.0026041667F;
                     } else {
                        var37 = (this.field10141.field10042[2] * (float)var26[var30] + this.field10141.field10042[0] * (float)var24[var30] + this.field10141.field10042[1] * (float)var25[var30]) / ((float)var36 * 256.0F);
                     }

                     float var38 = this.field10141.field10050 + var37 * (var37 < 0.0F ? var29 : var28);
                     int var39 = (int)(var33 * var38);
                     if (var39 < 0) {
                        var39 = 0;
                     } else if (var39 > 255) {
                        var39 = 255;
                     }

                     int var40 = (int)(var34 * var38);
                     if (var40 < 0) {
                        var40 = 0;
                     } else if (var40 > 255) {
                        var40 = 255;
                     }

                     int var41 = (int)(var35 * var38);
                     if (var41 < 0) {
                        var41 = 0;
                     } else if (var41 > 255) {
                        var41 = 255;
                     }

                     var20.putInt(var22, 255 - this.field10159[var31] << 24 | var39 << 16 | var40 << 8 | var41);
                     var22 += 4L;
                  }
               } else {
                  for(int var42 = 0; var42 < this.field10205; ++var42) {
                     short var43 = this.field10192[var42];
                     int var44 = 255 - this.field10159[var43] << 24 | this.method16529(this.field10158[var43] & 65535, this.field10203[var43], this.field10146);
                     var20.putInt(var22, var44);
                     var22 += 4L;
                  }
               }

               var19.method699();
            } else {
               ByteBuffer var45 = this.field10141.field9975;
               var45.clear();
               if ((this.field10185 & 55) == 0) {
                  short[] var46;
                  short[] var47;
                  short[] var48;
                  byte[] var49;
                  if (this.field10189 != null) {
                     var46 = this.field10189.field4331;
                     var47 = this.field10189.field4330;
                     var48 = this.field10189.field4332;
                     var49 = this.field10189.field4329;
                  } else {
                     var46 = this.field10149;
                     var47 = this.field10150;
                     var48 = this.field10171;
                     var49 = this.field10152;
                  }

                  float var50 = this.field10141.field10051 * 768.0F / (float)this.field10138;
                  float var51 = this.field10141.field9996 * 768.0F / (float)this.field10138;

                  for(int var52 = 0; var52 < this.field10205; ++var52) {
                     short var53 = this.field10192[var52];
                     int var54 = this.method16529(this.field10158[var53] & 65535, this.field10203[var53], this.field10146);
                     float var55 = (float)(var54 >> 16 & 255) * this.field10141.field10047;
                     float var56 = (float)(var54 >> 8 & 255) * this.field10141.field10048;
                     float var57 = (float)(var54 & 255) * this.field10141.field10058;
                     byte var58 = var49[var52];
                     float var59;
                     if (var58 == 0) {
                        var59 = (this.field10141.field10042[2] * (float)var48[var52] + this.field10141.field10042[0] * (float)var46[var52] + this.field10141.field10042[1] * (float)var47[var52]) * 0.0026041667F;
                     } else {
                        var59 = (this.field10141.field10042[2] * (float)var48[var52] + this.field10141.field10042[0] * (float)var46[var52] + this.field10141.field10042[1] * (float)var47[var52]) / ((float)var58 * 256.0F);
                     }

                     float var60 = this.field10141.field10050 + var59 * (var59 < 0.0F ? var51 : var50);
                     int var61 = (int)(var55 * var60);
                     if (var61 < 0) {
                        var61 = 0;
                     } else if (var61 > 255) {
                        var61 = 255;
                     }

                     int var62 = (int)(var56 * var60);
                     if (var62 < 0) {
                        var62 = 0;
                     } else if (var62 > 255) {
                        var62 = 255;
                     }

                     int var63 = (int)(var57 * var60);
                     if (var63 < 0) {
                        var63 = 0;
                     } else if (var63 > 255) {
                        var63 = 255;
                     }

                     var45.putInt(255 - this.field10159[var53] << 24 | var61 << 16 | var62 << 8 | var63);
                  }
               } else {
                  for(int var64 = 0; var64 < this.field10205; ++var64) {
                     short var65 = this.field10192[var64];
                     int var66 = 255 - this.field10159[var65] << 24 | this.method16529(this.field10158[var65] & 65535, this.field10203[var65], this.field10146);
                     var45.putInt(var66);
                  }
               }

               var19.method700(0, var45.position(), this.field10141.field9976);
            }

            this.field10168.field4087 = var19;
            this.field10168.field4084 = true;
         }

         if (var2) {
            if (this.field10169.field4086 == null) {
               this.field10169.field4086 = this.field10141.method2570(this.field10204);
            }

            class508 var67 = this.field10169.field4086;
            var67.method728(this.field10205 * 12, 12);
            short[] var68;
            short[] var69;
            short[] var70;
            byte[] var71;
            if (this.field10189 != null) {
               var68 = this.field10189.field4331;
               var69 = this.field10189.field4330;
               var70 = this.field10189.field4332;
               var71 = this.field10189.field4329;
            } else {
               var68 = this.field10149;
               var69 = this.field10150;
               var70 = this.field10171;
               var71 = this.field10152;
            }

            float var72 = 3.0F / (float)this.field10138;
            float var73 = 3.0F / (float)(this.field10138 / 2 + this.field10138);
            Unsafe var74 = this.field10141.field9978;
            if (var74 != null) {
               int var75 = this.field10205 * 12;
               long var76 = var67.method698(0, var75);

               for(int var78 = 0; var78 < this.field10205; ++var78) {
                  float var79 = var71[var78] == 0 ? var73 : var72 / (float)var71[var78];
                  float var80 = (float)var68[var78] * var79;
                  float var81 = (float)var69[var78] * var79;
                  float var82 = (float)var70[var78] * var79;
                  var74.putFloat(var76, var80);
                  long var83 = var76 + 4L;
                  var74.putFloat(var83, var81);
                  long var85 = var83 + 4L;
                  var74.putFloat(var85, var82);
                  var76 = var85 + 4L;
               }

               var67.method699();
            } else {
               ByteBuffer var87 = this.field10141.field9975;
               var87.clear();

               for(int var88 = 0; var88 < this.field10205; ++var88) {
                  float var89 = var71[var88] == 0 ? var73 : var72 / (float)var71[var88];
                  float var90 = (float)var68[var88] * var89;
                  float var91 = (float)var69[var88] * var89;
                  float var92 = (float)var70[var88] * var89;
                  var87.putFloat(var90);
                  var87.putFloat(var91);
                  var87.putFloat(var92);
               }

               var67.method700(0, var87.position(), this.field10141.field9976);
            }

            this.field10169.field4087 = var67;
            this.field10169.field4084 = true;
         }

         if (var4) {
            if (this.field10170.field4086 == null) {
               this.field10170.field4086 = this.field10141.method2570(this.field10204);
            }

            class508 var93 = this.field10170.field4086;
            var93.method728(this.field10205 * 8, 8);
            Unsafe var94 = this.field10141.field9978;
            if (var94 != null) {
               int var95 = this.field10205 * 8;
               long var96 = var93.method698(0, var95);

               for(int var98 = 0; var98 < this.field10205; ++var98) {
                  var94.putFloat(var96, this.field10153[var98]);
                  long var99 = var96 + 4L;
                  var94.putFloat(var99, this.field10154[var98]);
                  var96 = var99 + 4L;
               }

               var93.method699();
            } else {
               ByteBuffer var101 = this.field10141.field9975;
               var101.clear();

               for(int var102 = 0; var102 < this.field10205; ++var102) {
                  var101.putFloat(this.field10153[var102]);
                  var101.putFloat(this.field10154[var102]);
               }

               var93.method700(0, var101.position(), this.field10141.field9976);
            }

            this.field10170.field4087 = var93;
            this.field10170.field4084 = true;
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("yu.gc()V")
   public void method16548() {
      if (this.field10132 != null) {
         this.field10132.method7184();
      }

      if (this.field10170 != null) {
         this.field10170.method7184();
      }

      if (this.field10168 != null) {
         this.field10168.method7184();
      }

      if (this.field10169 != null) {
         this.field10169.method7184();
      }

      if (this.field10166 != null) {
         this.field10166.method6783();
      }

   }

   @deob.ObfuscatedName("yu.gy(II)I")
   private int method16549(int arg0, int arg1) {
      int var3 = (arg0 & 127) * arg1 >> 7;
      if (var3 < 2) {
         var3 = 2;
      } else if (var3 > 126) {
         var3 = 126;
      }

      return (arg0 & 65408) + var3;
   }

   @deob.ObfuscatedName("yu.gr(ISI)I")
   private int method16529(int arg0, short arg1, int arg2) {
      int var4 = this.field10141.field9974[this.method16549(arg0, arg2)];
      if (arg1 != -1) {
         class360 var5 = this.field10141.field7118.method5112(arg1 & 65535);
         int var6 = var5.field2328 & 255;
         if (var6 != 0) {
            int var7 = arg2 * 131586;
            if (var6 == 256) {
               var4 = var7;
            } else {
               int var9 = 256 - var6;
               var4 = ((var4 & 16711935) * var9 + (var7 & 16711935) * var6 & -16711936) + ((var4 & 65280) * var9 + (var7 & 65280) * var6 & 16711680) >> 8;
            }
         }

         int var10 = var5.field2307 & 255;
         if (var10 != 0) {
            var10 += 256;
            int var11 = ((var4 & 16711680) >> 16) * var10;
            if (var11 > 65535) {
               var11 = 65535;
            }

            int var12 = ((var4 & 65280) >> 8) * var10;
            if (var12 > 65535) {
               var12 = 65535;
            }

            int var13 = (var4 & 255) * var10;
            if (var13 > 65535) {
               var13 = 65535;
            }

            var4 = (var13 >> 8) + (var11 << 8 & 16711680) + (var12 & 65280);
         }
      }

      return var4 & 16777215;
   }
}
