import java.io.IOException;

@deob.ObfuscatedName("adc")
public class class86 extends class674 {
   @deob.ObfuscatedName("adc.c")
   private static boolean field636 = false;
   @deob.ObfuscatedName("adc.an")
   private int field661 = 0;
   @deob.ObfuscatedName("adc.ak")
   private int field663 = 0;
   @deob.ObfuscatedName("adc.o")
   private int field632;
   @deob.ObfuscatedName("adc.p")
   private int field633;
   @deob.ObfuscatedName("adc.q")
   private int field638;
   @deob.ObfuscatedName("adc.r")
   private int field641;
   @deob.ObfuscatedName("adc.y")
   private int field649;
   @deob.ObfuscatedName("adc.a")
   private int field657;
   @deob.ObfuscatedName("adc.ag")
   private int field662;
   @deob.ObfuscatedName("adc.x")
   private boolean field634;
   @deob.ObfuscatedName("adc.j")
   private boolean field650;
   @deob.ObfuscatedName("adc.w")
   private float[] field647;
   @deob.ObfuscatedName("adc.al")
   private float[] field660;
   @deob.ObfuscatedName("adc.b")
   private byte[][] field630;

   private class86(byte[] arg0) throws IOException {
      this.method1166(arg0);
   }

   @deob.ObfuscatedName("adc.n(I)F")
   public static float method1184(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @deob.ObfuscatedName("adc.k([BI)V")
   private static void method1163(byte[] arg0, int arg1) {
      Statics.field659 = arg0;
      Statics.field648 = arg1;
      Statics.field637 = 0;
   }

   @deob.ObfuscatedName("adc.d()I")
   public static int method1164() {
      int var0 = Statics.field659[Statics.field648] >> Statics.field637 & 1;
      ++Statics.field637;
      Statics.field648 += Statics.field637 >> 3;
      Statics.field637 &= 7;
      return var0;
   }

   @deob.ObfuscatedName("adc.b(I)I")
   public static int method1202(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - Statics.field637) {
         int var3 = 8 - Statics.field637;
         int var4 = (1 << var3) - 1;
         var1 += (Statics.field659[Statics.field648] >> Statics.field637 & var4) << var2;
         Statics.field637 = 0;
         ++Statics.field648;
         var2 += var3;
         arg0 -= var3;
      }

      if (arg0 > 0) {
         int var5 = (1 << arg0) - 1;
         var1 += (Statics.field659[Statics.field648] >> Statics.field637 & var5) << var2;
         Statics.field637 += arg0;
      }

      return var1;
   }

   @deob.ObfuscatedName("adc.r([B)V")
   private void method1166(byte[] arg0) throws IOException {
      class124 var2 = new class124(arg0);
      this.field641 = var2.method1591();
      this.field633 = var2.method1591();
      this.field632 = var2.method1591();
      this.field657 = var2.method1591();
      if (this.field657 < 0) {
         this.field657 = ~this.field657;
         this.field634 = true;
      }

      int var3 = var2.method1591();
      if (var3 < 0) {
         throw new IOException();
      } else {
         this.field630 = new byte[var3][];

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
               var6 = var2.method1688();
               var5 += var6;
            } while(var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.method1602(var7, 0, var5);
            this.field630[var4] = var7;
         }

      }
   }

   @deob.ObfuscatedName("adc.p([B)V")
   private static void method1167(byte[] arg0) {
      method1163(arg0, 0);
      Statics.field631 = 1 << method1202(4);
      Statics.field639 = 1 << method1202(4);
      Statics.field651 = new float[Statics.field639];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var2 = var1 != 0 ? Statics.field639 : Statics.field631;
         int var3 = var2 >> 1;
         int var4 = var2 >> 2;
         int var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var8 = new float[var3];

         for(int var9 = 0; var9 < var4; ++var9) {
            var8[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var8[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var10 = new float[var4];

         for(int var11 = 0; var11 < var5; ++var11) {
            var10[var11 * 2] = (float)Math.cos((double)(var11 * 4 + 2) * 3.141592653589793D / (double)var2);
            var10[var11 * 2 + 1] = -((float)Math.sin((double)(var11 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var12 = new int[var5];
         int var13 = class887.method5009(var5 - 1);

         for(int var14 = 0; var14 < var5; ++var14) {
            var12[var14] = Statics.method378(var14, var13);
         }

         if (var1 != 0) {
            Statics.field655 = var6;
            Statics.field656 = var8;
            Statics.field646 = var10;
            Statics.field629 = var12;
         } else {
            Statics.field652 = var6;
            Statics.field653 = var8;
            Statics.field654 = var10;
            Statics.field635 = var12;
         }
      }

      int var15 = method1202(8) + 1;
      Statics.field640 = new class640[var15];

      for(int var16 = 0; var16 < var15; ++var16) {
         Statics.field640[var16] = new class640();
      }

      int var17 = method1202(6) + 1;

      for(int var18 = 0; var18 < var17; ++var18) {
         method1202(16);
      }

      int var19 = method1202(6) + 1;
      Statics.field645 = new class653[var19];

      for(int var20 = 0; var20 < var19; ++var20) {
         Statics.field645[var20] = new class653();
      }

      int var21 = method1202(6) + 1;
      Statics.field642 = new class682[var21];

      for(int var22 = 0; var22 < var21; ++var22) {
         Statics.field642[var22] = new class682();
      }

      int var23 = method1202(6) + 1;
      Statics.field643 = new class649[var23];

      for(int var24 = 0; var24 < var23; ++var24) {
         Statics.field643[var24] = new class649();
      }

      int var25 = method1202(6) + 1;
      Statics.field644 = new boolean[var25];
      Statics.field658 = new int[var25];

      for(int var26 = 0; var26 < var25; ++var26) {
         Statics.field644[var26] = method1164() != 0;
         method1202(16);
         method1202(16);
         Statics.field658[var26] = method1202(8);
      }

      field636 = true;
   }

   @deob.ObfuscatedName("adc.o(I)[F")
   private float[] method1169(int arg0) {
      method1163(this.field630[arg0], 0);
      method1164();
      int var2 = method1202(class887.method5009(Statics.field658.length - 1));
      boolean var3 = Statics.field644[var2];
      int var4 = var3 ? Statics.field639 : Statics.field631;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method1164() != 0;
         var6 = method1164() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (Statics.field631 >> 2);
         var9 = (Statics.field631 >> 2) + (var4 >> 2);
         var10 = Statics.field631 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (Statics.field631 >> 2);
         var12 = (Statics.field631 >> 2) + (var4 - (var4 >> 2));
         var13 = Statics.field631 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class649 var14 = Statics.field643[Statics.field658[var2]];
      int var15 = var14.field5931;
      int var16 = var14.field5932[var15];
      boolean var17 = !Statics.field645[var16].method9425();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field5930; ++var19) {
         class682 var20 = Statics.field642[var14.field5933[var19]];
         float[] var21 = Statics.field651;
         var20.method10005(var21, var4 >> 1, var18);
      }

      if (!var17) {
         int var22 = var14.field5931;
         int var23 = var14.field5932[var22];
         Statics.field645[var23].method9426(Statics.field651, var4 >> 1);
      }

      if (var17) {
         for(int var24 = var4 >> 1; var24 < var4; ++var24) {
            Statics.field651[var24] = 0.0F;
         }
      } else {
         int var25 = var4 >> 1;
         int var26 = var4 >> 2;
         int var27 = var4 >> 3;
         float[] var28 = Statics.field651;

         for(int var29 = 0; var29 < var25; ++var29) {
            var28[var29] *= 0.5F;
         }

         for(int var30 = var25; var30 < var4; ++var30) {
            var28[var30] = -var28[var4 - var30 - 1];
         }

         float[] var31 = var3 ? Statics.field655 : Statics.field652;
         float[] var32 = var3 ? Statics.field656 : Statics.field653;
         float[] var33 = var3 ? Statics.field646 : Statics.field654;
         int[] var34 = var3 ? Statics.field629 : Statics.field635;

         for(int var35 = 0; var35 < var26; ++var35) {
            float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
            float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
            float var38 = var31[var35 * 2];
            float var39 = var31[var35 * 2 + 1];
            var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
            var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
         }

         for(int var40 = 0; var40 < var27; ++var40) {
            float var41 = var28[var40 * 4 + var25 + 3];
            float var42 = var28[var40 * 4 + var25 + 1];
            float var43 = var28[var40 * 4 + 3];
            float var44 = var28[var40 * 4 + 1];
            var28[var40 * 4 + var25 + 3] = var41 + var43;
            var28[var40 * 4 + var25 + 1] = var42 + var44;
            float var45 = var31[var25 - 4 - var40 * 4];
            float var46 = var31[var25 - 3 - var40 * 4];
            var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
            var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
         }

         int var47 = class887.method5009(var4 - 1);

         for(int var48 = 0; var48 < var47 - 3; ++var48) {
            int var49 = var4 >> var48 + 2;
            int var50 = 8 << var48;

            for(int var51 = 0; var51 < 2 << var48; ++var51) {
               int var52 = var4 - var49 * 2 * var51;
               int var53 = var4 - (var51 * 2 + 1) * var49;

               for(int var54 = 0; var54 < var4 >> var48 + 4; ++var54) {
                  int var55 = var54 * 4;
                  float var56 = var28[var52 - 1 - var55];
                  float var57 = var28[var52 - 3 - var55];
                  float var58 = var28[var53 - 1 - var55];
                  float var59 = var28[var53 - 3 - var55];
                  var28[var52 - 1 - var55] = var56 + var58;
                  var28[var52 - 3 - var55] = var57 + var59;
                  float var60 = var31[var50 * var54];
                  float var61 = var31[var50 * var54 + 1];
                  var28[var53 - 1 - var55] = (var56 - var58) * var60 - (var57 - var59) * var61;
                  var28[var53 - 3 - var55] = (var56 - var58) * var61 + (var57 - var59) * var60;
               }
            }
         }

         for(int var62 = 1; var62 < var27 - 1; ++var62) {
            int var63 = var34[var62];
            if (var62 < var63) {
               int var64 = var62 * 8;
               int var65 = var63 * 8;
               float var66 = var28[var64 + 1];
               var28[var64 + 1] = var28[var65 + 1];
               var28[var65 + 1] = var66;
               float var67 = var28[var64 + 3];
               var28[var64 + 3] = var28[var65 + 3];
               var28[var65 + 3] = var67;
               float var68 = var28[var64 + 5];
               var28[var64 + 5] = var28[var65 + 5];
               var28[var65 + 5] = var68;
               float var69 = var28[var64 + 7];
               var28[var64 + 7] = var28[var65 + 7];
               var28[var65 + 7] = var69;
            }
         }

         for(int var70 = 0; var70 < var25; ++var70) {
            var28[var70] = var28[var70 * 2 + 1];
         }

         for(int var71 = 0; var71 < var27; ++var71) {
            var28[var4 - 1 - var71 * 2] = var28[var71 * 4];
            var28[var4 - 2 - var71 * 2] = var28[var71 * 4 + 1];
            var28[var4 - var26 - 1 - var71 * 2] = var28[var71 * 4 + 2];
            var28[var4 - var26 - 2 - var71 * 2] = var28[var71 * 4 + 3];
         }

         for(int var72 = 0; var72 < var27; ++var72) {
            float var73 = var33[var72 * 2];
            float var74 = var33[var72 * 2 + 1];
            float var75 = var28[var72 * 2 + var25];
            float var76 = var28[var72 * 2 + var25 + 1];
            float var77 = var28[var4 - 2 - var72 * 2];
            float var78 = var28[var4 - 1 - var72 * 2];
            float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
            var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
            var28[var4 - 2 - var72 * 2] = (var75 + var77 - var79) * 0.5F;
            float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
            var28[var72 * 2 + var25 + 1] = (var76 - var78 + var80) * 0.5F;
            var28[var4 - 1 - var72 * 2] = (-var76 + var78 + var80) * 0.5F;
         }

         for(int var81 = 0; var81 < var26; ++var81) {
            var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + 1 + var25];
            var28[var25 - 1 - var81] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + 1 + var25];
         }

         for(int var82 = 0; var82 < var26; ++var82) {
            var28[var4 - var26 + var82] = -var28[var82];
         }

         for(int var83 = 0; var83 < var26; ++var83) {
            var28[var83] = var28[var26 + var83];
         }

         for(int var84 = 0; var84 < var26; ++var84) {
            var28[var26 + var84] = -var28[var26 - var84 - 1];
         }

         for(int var85 = 0; var85 < var26; ++var85) {
            var28[var25 + var85] = var28[var4 - var85 - 1];
         }

         for(int var86 = var8; var86 < var9; ++var86) {
            float var87 = (float)Math.sin(((double)(var86 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            Statics.field651[var86] *= (float)Math.sin((double)var87 * 1.5707963267948966D * (double)var87);
         }

         for(int var88 = var11; var88 < var12; ++var88) {
            float var89 = (float)Math.sin(((double)(var88 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            Statics.field651[var88] *= (float)Math.sin((double)var89 * 1.5707963267948966D * (double)var89);
         }
      }

      float[] var90 = null;
      if (this.field638 > 0) {
         int var91 = this.field638 + var4 >> 2;
         var90 = new float[var91];
         if (!this.field650) {
            for(int var92 = 0; var92 < this.field649; ++var92) {
               int var93 = (this.field638 >> 1) + var92;
               var90[var92] += this.field647[var93];
            }
         }

         if (!var17) {
            for(int var94 = var8; var94 < var4 >> 1; ++var94) {
               int var95 = var90.length - (var4 >> 1) + var94;
               var90[var95] += Statics.field651[var94];
            }
         }
      }

      float[] var96 = this.field647;
      this.field647 = Statics.field651;
      Statics.field651 = var96;
      this.field638 = var4;
      this.field649 = var12 - (var4 >> 1);
      this.field650 = var17;
      return var90;
   }

   @deob.ObfuscatedName("adc.a(Llc;)Z")
   private static boolean method1172(class612 arg0) {
      if (!field636) {
         byte[] var1 = arg0.method8771(0, 0);
         if (var1 == null) {
            return false;
         }

         method1167(var1);
      }

      return true;
   }

   @deob.ObfuscatedName("adc.x(Llc;II)Ladc;")
   public static class86 method1170(class612 arg0, int arg1, int arg2) {
      if (!method1172(arg0)) {
         arg0.method8773(arg1, arg2);
         return null;
      } else {
         byte[] var3 = arg0.method8771(arg1, arg2);
         if (var3 == null) {
            return null;
         } else {
            class86 var4 = null;

            try {
               var4 = new class86(var3);
            } catch (IOException var6) {
               var6.printStackTrace();
            }

            return var4;
         }
      }
   }

   @deob.ObfuscatedName("adc.s(Llc;I)Ladc;")
   public static class86 method1171(class612 arg0, int arg1) {
      if (!method1172(arg0)) {
         arg0.method8790(arg1);
         return null;
      } else {
         byte[] var2 = arg0.method8809(arg1);
         if (var2 == null) {
            return null;
         } else {
            class86 var3 = null;

            try {
               var3 = new class86(var2);
            } catch (IOException var5) {
               var5.printStackTrace();
            }

            return var3;
         }
      }
   }

   @deob.ObfuscatedName("adc.l()Lalw;")
   public class315 method1200() {
      class644.method6473(this);
      return !this.method1176() || this.field661 > this.field641 && this.field663 > this.field641 / class671.method6226() ? new class315(this.field641, this, this.field660, this.field632, this.field657, this.field634) : null;
   }

   @deob.ObfuscatedName("adc.u(I)I")
   private int method1173(int arg0) {
      int var2 = 0;
      if (this.field660 == null) {
         this.field638 = 0;
         this.field647 = new float[Statics.field639];
         this.field660 = new float[this.field633];
         this.field661 = 0;
         this.field662 = 0;
      }

      while(arg0 > this.field661 && this.field662 < this.field630.length) {
         float[] var3 = this.method1169(this.field662);
         if (var3 != null) {
            int var4 = this.field661;
            int var5 = var3.length;
            if (var5 > this.field633 - var4) {
               var5 = this.field633 - var4;
            }

            for(int var6 = 0; var6 < var5; ++var6) {
               this.field660[var4++] = var3[var6];
            }

            var2 += var4 - this.field661;
            this.field661 = var4;
         }

         ++this.field662;
      }

      return var2;
   }

   @deob.ObfuscatedName("adc.z(I)V")
   public void method1168(int arg0) {
      if (arg0 > this.field633 - 1) {
         arg0 = this.field633 - 1;
      }

      if (arg0 > this.field661) {
         this.field663 = this.method1173(arg0);
      } else {
         this.field663 = 0;
      }

      if (!this.method1176()) {
         this.field647 = null;
      }

   }

   @deob.ObfuscatedName("adc.t()I")
   public int method1175() {
      return this.field661;
   }

   @deob.ObfuscatedName("adc.c()Z")
   public boolean method1176() {
      return this.field661 < this.field633 - 1;
   }

   @deob.ObfuscatedName("adc.w()I")
   public int method1204() {
      return this.field641;
   }
}
