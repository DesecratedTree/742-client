@deob.ObfuscatedName("ajl")
public class class257 extends class116 {
   @deob.ObfuscatedName("ajl.z")
   private byte[] field1717 = new byte[512];
   @deob.ObfuscatedName("ajl.m")
   private int field1722 = 0;
   @deob.ObfuscatedName("ajl.i")
   private int field1719 = 4;
   @deob.ObfuscatedName("ajl.t")
   private int field1720 = 4;
   @deob.ObfuscatedName("ajl.c")
   private int field1721 = 4;
   @deob.ObfuscatedName("ajl.w")
   private int field1710 = 1638;
   @deob.ObfuscatedName("ajl.q")
   private boolean field1723 = true;
   @deob.ObfuscatedName("ajl.h")
   private short[] field1715;
   @deob.ObfuscatedName("ajl.e")
   private short[] field1716;

   private class257() {
      super(0, true);
   }

   @deob.ObfuscatedName("ajl.n(I[II)V")
   private void method3456(int arg0, int[] arg1) {
      int var3 = this.field1720 * Statics.field9106[arg0];
      if (this.field1721 == 1) {
         short var4 = this.field1715[0];
         int var5 = this.field1716[0] << 12;
         int var6 = this.field1720 * var5 >> 12;
         int var7 = this.field1719 * var5 >> 12;
         int var8 = var3 * var5 >> 12;
         int var9 = var8 >> 12;
         int var10 = var9 + 1;
         if (var10 >= var6) {
            var10 = 0;
         }

         int var11 = var8 & 4095;
         int var12 = class581.field5294[var11];
         int var13 = this.field1717[var9 & 255] & 255;
         int var14 = this.field1717[var10 & 255] & 255;
         if (this.field1723) {
            for(int var15 = 0; var15 < Statics.field9103; ++var15) {
               int var16 = this.field1719 * Statics.field9105[var15];
               int var17 = this.method3457(var5 * var16 >> 12, var11, var13, var14, var12, var7);
               int var18 = var4 * var17 >> 12;
               arg1[var15] = (var18 >> 1) + 2048;
            }
         } else {
            for(int var19 = 0; var19 < Statics.field9103; ++var19) {
               int var20 = this.field1719 * Statics.field9105[var19];
               int var21 = this.method3457(var5 * var20 >> 12, var11, var13, var14, var12, var7);
               arg1[var19] = var4 * var21 >> 12;
            }
         }
      } else {
         short var22 = this.field1715[0];
         if (var22 > 8 || var22 < -8) {
            int var23 = this.field1716[0] << 12;
            int var24 = this.field1720 * var23 >> 12;
            int var25 = this.field1719 * var23 >> 12;
            int var26 = var3 * var23 >> 12;
            int var27 = var26 >> 12;
            int var28 = var27 + 1;
            if (var28 >= var24) {
               var28 = 0;
            }

            int var29 = var26 & 4095;
            int var30 = class581.field5294[var29];
            int var31 = this.field1717[var27 & 255] & 255;
            int var32 = this.field1717[var28 & 255] & 255;

            for(int var33 = 0; var33 < Statics.field9103; ++var33) {
               int var34 = this.field1719 * Statics.field9105[var33];
               int var35 = this.method3457(var23 * var34 >> 12, var29, var31, var32, var30, var25);
               arg1[var33] = var22 * var35 >> 12;
            }
         }

         for(int var36 = 1; var36 < this.field1721; ++var36) {
            short var37 = this.field1715[var36];
            if (var37 > 8 || var37 < -8) {
               int var38 = this.field1716[var36] << 12;
               int var39 = this.field1720 * var38 >> 12;
               int var40 = this.field1719 * var38 >> 12;
               int var41 = var3 * var38 >> 12;
               int var42 = var41 >> 12;
               int var43 = var42 + 1;
               if (var43 >= var39) {
                  var43 = 0;
               }

               int var44 = var41 & 4095;
               int var45 = class581.field5294[var44];
               int var46 = this.field1717[var42 & 255] & 255;
               int var47 = this.field1717[var43 & 255] & 255;
               if (this.field1723 && this.field1721 - 1 == var36) {
                  for(int var48 = 0; var48 < Statics.field9103; ++var48) {
                     int var49 = this.field1719 * Statics.field9105[var48];
                     int var50 = this.method3457(var38 * var49 >> 12, var44, var46, var47, var45, var40);
                     int var51 = (var37 * var50 >> 12) + arg1[var48];
                     arg1[var48] = (var51 >> 1) + 2048;
                  }
               } else {
                  for(int var52 = 0; var52 < Statics.field9103; ++var52) {
                     int var53 = this.field1719 * Statics.field9105[var52];
                     int var54 = this.method3457(var38 * var53 >> 12, var44, var46, var47, var45, var40);
                     arg1[var52] += var37 * var54 >> 12;
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ajl.k(IIIIIII)I")
   private int method3457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg0 >> 12;
      int var8 = var7 + 1;
      if (var8 >= arg5) {
         var8 = 0;
      }

      int var9 = arg0 & 4095;
      int var10 = var7 & 255;
      int var11 = var8 & 255;
      int var12 = var9 - 4096;
      int var13 = arg1 - 4096;
      int var14 = class581.field5294[var9];
      int var15 = this.field1717[arg2 + var10] & 3;
      int var16;
      if (var15 <= 1) {
         var16 = var15 == 0 ? arg1 + var9 : arg1 - var9;
      } else {
         var16 = var15 == 2 ? var9 - arg1 : -var9 - arg1;
      }

      int var17 = this.field1717[arg2 + var11] & 3;
      int var18;
      if (var17 <= 1) {
         var18 = var17 == 0 ? arg1 + var12 : arg1 - var12;
      } else {
         var18 = var17 == 2 ? var12 - arg1 : -var12 - arg1;
      }

      int var19 = ((var18 - var16) * var14 >> 12) + var16;
      int var20 = this.field1717[arg3 + var10] & 3;
      int var21;
      if (var20 <= 1) {
         var21 = var20 == 0 ? var9 + var13 : var13 - var9;
      } else {
         var21 = var20 == 2 ? var9 - var13 : -var9 - var13;
      }

      int var22 = this.field1717[arg3 + var11] & 3;
      int var23;
      if (var22 <= 1) {
         var23 = var22 == 0 ? var12 + var13 : var13 - var12;
      } else {
         var23 = var22 == 2 ? var12 - var13 : -var12 - var13;
      }

      int var24 = ((var23 - var21) * var14 >> 12) + var21;
      return ((var24 - var19) * arg4 >> 12) + var19;
   }

   @deob.ObfuscatedName("ajl.d(B)V")
   private void method3458() {
      this.field1717 = class895.method15559(this.field1722);
      this.method3459();

      for(int var1 = this.field1721 - 1; var1 >= 1; --var1) {
         short var2 = this.field1715[var1];
         if (var2 > 8 || var2 < -8) {
            break;
         }

         --this.field1721;
      }

   }

   @deob.ObfuscatedName("ajl.b(I)V")
   private void method3459() {
      if (this.field1710 > 0) {
         this.field1715 = new short[this.field1721];
         this.field1716 = new short[this.field1721];

         for(int var1 = 0; var1 < this.field1721; ++var1) {
            this.field1715[var1] = (short)((int)(Math.pow((double)((float)this.field1710 / 4096.0F), (double)var1) * 4096.0D));
            this.field1716[var1] = (short)((int)Math.pow(2.0D, (double)var1));
         }
      } else if (this.field1715 != null && this.field1721 == this.field1715.length) {
         this.field1716 = new short[this.field1721];

         for(int var2 = 0; var2 < this.field1721; ++var2) {
            this.field1716[var2] = (short)((int)Math.pow(2.0D, (double)var2));
         }
      }

   }

   @deob.ObfuscatedName("jr.r(IIIIIFZI)[I")
   public static int[] method8006(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6) {
      int[] var7 = new int[arg0];
      class257 var8 = new class257();
      var8.field1722 = arg1;
      var8.field1723 = arg6;
      var8.field1719 = arg2;
      var8.field1720 = arg3;
      var8.field1721 = arg4;
      var8.field1710 = (int)(arg5 * 4096.0F);
      var8.method3458();
      class895.method15561(arg0, 1);
      var8.method3456(0, var7);
      return var7;
   }

   @deob.ObfuscatedName("ae.p(IIIIIIFZB)[[I")
   public static int[][] method1441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7) {
      int[][] var8 = new int[arg1][arg0];
      class257 var9 = new class257();
      var9.field1723 = arg7;
      var9.field1719 = arg3;
      var9.field1720 = arg4;
      var9.field1721 = arg5;
      var9.field1710 = (int)(arg6 * 4096.0F);
      var9.method3458();
      class895.method15561(arg0, arg1);

      for(int var10 = 0; var10 < arg1; ++var10) {
         var9.method3456(var10, var8[var10]);
      }

      return var8;
   }
}
