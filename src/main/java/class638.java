@deob.ObfuscatedName("mb")
public class class638 {
   @deob.ObfuscatedName("mb.af")
   private static final int[] field5787 = new int[4];
   @deob.ObfuscatedName("mb.o")
   private final int field5771;
   @deob.ObfuscatedName("mb.a")
   private final int field5757;
   @deob.ObfuscatedName("mb.x")
   private final int field5765;
   @deob.ObfuscatedName("mb.s")
   private final boolean field5766;
   @deob.ObfuscatedName("mb.l")
   private final int field5778;
   @deob.ObfuscatedName("mb.u")
   private final int field5768;
   @deob.ObfuscatedName("mb.p")
   private final int field5758;
   @deob.ObfuscatedName("mb.r")
   private final int field5761;
   @deob.ObfuscatedName("mb.i")
   private int field5775;
   @deob.ObfuscatedName("mb.t")
   private int field5776;
   @deob.ObfuscatedName("mb.c")
   private int field5767;
   @deob.ObfuscatedName("mb.z")
   private int field5764;
   @deob.ObfuscatedName("mb.v")
   private int field5769;
   @deob.ObfuscatedName("mb.g")
   private int field5770;
   @deob.ObfuscatedName("mb.e")
   private int field5772;
   @deob.ObfuscatedName("mb.h")
   public int field5779;
   @deob.ObfuscatedName("mb.m")
   private class383 field5774;

   public class638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
      this.field5771 = arg2;
      this.field5757 = arg3;
      this.field5765 = arg4;
      this.field5766 = arg7;
      this.field5778 = arg1;
      this.field5768 = arg6;
      this.field5758 = arg5;
      this.field5761 = arg0;
      this.field5775 = arg8;
      this.field5776 = arg9;
      this.field5767 = arg10;
   }

   @deob.ObfuscatedName("mb.n()V")
   public static void method9190() {
      Statics.field5777 = null;
      Statics.field5786 = null;
   }

   @deob.ObfuscatedName("mb.k(IIII)Z")
   public boolean method9199(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field5766) {
         int var5 = this.field5771 - arg0;
         int var6 = this.field5757 - arg1;
         int var7 = this.field5765 - arg2;
         this.field5779 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field5779 == 0) {
            this.field5779 = 1;
         }

         var8 = (var5 << 8) / this.field5779;
         var9 = (var6 << 8) / this.field5779;
         var10 = (var7 << 8) / this.field5779;
      } else {
         this.field5779 = 1073741823;
         var8 = this.field5771;
         var9 = this.field5757;
         var10 = this.field5765;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field5764 = this.field5758 * arg3 / (this.field5766 ? 1024 : this.field5779);
      } else {
         this.field5764 = 0;
      }

      if (this.field5764 < 8) {
         this.field5774 = null;
         return false;
      } else {
         int var12 = class887.method4053(this.field5764);
         if (var12 > arg3) {
            var12 = class887.method14787(arg3);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field5772 != var12) {
            this.field5772 = var12;
         }

         this.field5769 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field5770 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field5774 = null;
         return true;
      }
   }

   @deob.ObfuscatedName("mb.d(Lra;Lmb;)Z")
   public boolean method9191(class772 arg0, class638 arg1) {
      return this.field5774 != null || this.method9193(arg0, arg1);
   }

   @deob.ObfuscatedName("mb.b(Lra;IIIIIIIIII)V")
   public void method9203(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      if (this.field5774 != null) {
         float[] var12 = new float[3];
         float var13 = (float)(-(this.field5771 - arg7 << 16));
         float var14 = (float)(this.field5757 - arg8 << 15);
         float var15 = (float)(-(this.field5765 - arg9 << 16));
         float[] var16 = new float[3];
         arg0.method7544().method8079(var16);
         float var17 = var16[0] + var13;
         float var18 = var16[1] + var14;
         float var19 = var16[2] + var15;
         arg0.method7736(var17, var18, var19, var12);
         if (!(var12[2] < 0.0F)) {
            int var20 = (int)(var12[0] - (float)(this.field5764 / 2));
            int var21 = (int)(var12[1] - (float)(this.field5764 / 2));
            if (var21 < arg4 && this.field5764 + var21 > 0 && var20 < arg3 && this.field5764 + var20 > 0) {
               this.field5774.method5263(var20, var21, this.field5764, this.field5764, 0, arg10 << 24 | 16777215, 1);
            }
         }

      }
   }

   @deob.ObfuscatedName("mb.r(Lra;Lmb;)Z")
   private boolean method9193(class772 arg0, class638 arg1) {
      if (this.field5774 == null) {
         if (this.field5761 == 0) {
            if (Statics.field3640.method5108(this.field5778, class742.field6808, 0.7F, this.field5772, this.field5772, false)) {
               int[] var3 = Statics.field3640.method5115(this.field5778, 0.7F, this.field5772, this.field5772, false);
               this.field5774 = arg0.method11534(var3, 0, this.field5772, this.field5772, this.field5772);
            }
         } else if (this.field5761 == 2) {
            this.method9194(arg0, arg1);
         } else if (this.field5761 == 1) {
            this.method9198(arg0, arg1);
         }
      }

      return this.field5774 != null;
   }

   @deob.ObfuscatedName("mb.p(Lra;Lmb;)V")
   private void method9194(class772 arg0, class638 arg1) {
      class396 var3 = class396.method5419(Statics.field4152, this.field5778, 0);
      if (var3 != null) {
         arg0.method7511(field5787);
         arg0.method7716(0, 0, this.field5772, this.field5772);
         arg0.method2522(2, 0);
         arg0.method7513(0, 0, this.field5772, this.field5772, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field5766) {
               var4 = -arg1.field5771;
               var5 = -arg1.field5757;
               var6 = -arg1.field5765;
            } else {
               var4 = this.field5771 - arg1.field5771;
               var5 = this.field5757 - arg1.field5757;
               var6 = this.field5765 - arg1.field5765;
            }
         }

         if (this.field5769 != 0) {
            int var7 = -this.field5769 & 16383;
            int var8 = class603.field5469[var7];
            int var9 = class603.field5471[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field5770 != 0) {
            int var11 = -this.field5770 & 16383;
            int var12 = class603.field5469[var11];
            int var13 = class603.field5471[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method7547(1.0F);
         arg0.method7588(this.field5768, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         var3.method5426(this.field5775 & 16383, this.field5776 & 16383, this.field5767 & 16383);
         class745 var15 = arg0.method7528(var3, 2048, 0, 64, 768);
         int var16 = var15.method6940() - var15.method7033();
         int var17 = var15.method6951() - var15.method6941();
         int var18 = var16 > var17 ? var16 : var17;
         int var19 = this.field5772 * 1024 / var18;
         class597 var20 = arg0.method7498();
         class597 var21 = arg0.method7509();
         var21.method8424((float)(this.field5772 / 2), (float)(this.field5772 / 2), (float)var19, (float)var19, 50.0F, 50000.0F, (float)arg0.method11517().method566(), (float)arg0.method11517().method559(), 1024.0F);
         arg0.method7545(var21);
         class583 var22 = new class583();
         arg0.method7778(var22);
         class583 var23 = arg0.method7763();
         var23.method8071(0.0F, 0.0F, (float)(50 - var15.method7046()));
         var15.method7001(var23, (class394)null, 1);
         this.field5774 = arg0.method7530(0, 0, this.field5772, this.field5772, true);
         this.field5774.method2390(0, 0, 3);
         arg0.method7545(var20);
         arg0.method7716(field5787[0], field5787[1], field5787[2], field5787[3]);
      }
   }

   @deob.ObfuscatedName("mb.o(Lra;Lmb;)V")
   private void method9198(class772 arg0, class638 arg1) {
      method9196(arg0);
      method9197(arg0);
      arg0.method7511(field5787);
      arg0.method7716(0, 0, this.field5772, this.field5772);
      arg0.method2522(2, 0);
      arg0.method7513(0, 0, this.field5772, this.field5772, -16777216 | this.field5768, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field5766) {
            var3 = -arg1.field5771;
            var4 = -arg1.field5757;
            var5 = -arg1.field5765;
         } else {
            var3 = arg1.field5771 - this.field5771;
            var4 = arg1.field5757 - this.field5757;
            var5 = arg1.field5765 - this.field5765;
         }
      }

      if (this.field5769 != 0) {
         int var6 = class603.field5469[this.field5769];
         int var7 = class603.field5471[this.field5769];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field5770 != 0) {
         int var9 = class603.field5469[this.field5770];
         int var10 = class603.field5471[this.field5770];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class745 var12 = Statics.field5777.method6914((byte)0, 51200, true);
      var12.method6952((short)0, (short)this.field5778);
      arg0.method7547(1.0F);
      arg0.method7588(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field5772 * 1024 / (var12.method6940() - var12.method7033());
      if (this.field5768 != 0) {
         var13 = var13 * 13 / 16;
      }

      class597 var14 = arg0.method7498();
      class597 var15 = arg0.method7509();
      var15.method8424((float)(this.field5772 / 2), (float)(this.field5772 / 2), (float)var13, (float)var13, 50.0F, 50000.0F, (float)arg0.method11517().method566(), (float)arg0.method11517().method559(), 1024.0F);
      arg0.method7545(var15);
      arg0.method7778(new class583());
      class583 var16 = new class583();
      var16.method8071(0.0F, 0.0F, (float)(50 - var12.method7046()));
      var12.method7001(var16, (class394)null, 1);
      int var17 = this.field5772 * 13 / 16;
      int var18 = (this.field5772 - var17) / 2;
      Statics.field5785.method5263(var18, var18, var17, var17, 0, -16777216 | this.field5768, 1);
      this.field5774 = arg0.method7530(0, 0, this.field5772, this.field5772, true);
      arg0.method2522(2, 0);
      arg0.method7513(0, 0, this.field5772, this.field5772, 0, 0);
      Statics.field5786.method5263(0, 0, this.field5772, this.field5772, 1, 0, 0);
      this.field5774.method2390(0, 0, 3);
      arg0.method7545(var14);
      arg0.method7716(field5787[0], field5787[1], field5787[2], field5787[3]);
   }

   @deob.ObfuscatedName("mb.a(Lra;)V")
   private static void method9196(class772 arg0) {
      if (Statics.field5777 == null) {
         class396 var1 = new class396(580, 1104, 1);
         var1.method5456((short)0, (short)32767, (short)0, (short)1024, (short)1024, (short)1024, (byte)0, (byte)0, (byte)0);
         var1.method5417(0, 128, 0);
         var1.method5417(0, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class603.field5469[var3];
            int var5 = class603.field5471[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var7 = var6 * 8192 / 24;
               int var8 = class603.field5471[var7] >> 7;
               int var9 = class603.field5469[var7] * var4 >> 21;
               int var10 = class603.field5469[var7] * var5 >> 21;
               var1.method5417(var10, var8, -var9);
            }

            if (var2 > 0) {
               int var11 = var2 * 23 + 2;
               int var12 = var11 - 23;
               var1.method5436(0, var12, var11, (byte)0, (byte)0, (short)127, (byte)0, (short)0);

               for(int var13 = 1; var13 < 23; ++var13) {
                  int var14 = var12 + 1;
                  int var15 = var11 + 1;
                  var1.method5436(var12, var14, var11, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var1.method5436(var14, var15, var11, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var12 = var14;
                  var11 = var15;
               }

               var1.method5436(var11, var12, 1, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
            }
         }

         var1.field2909 = var1.field2908;
         var1.field2925 = null;
         var1.field2913 = null;
         var1.field2943 = null;
         Statics.field5777 = arg0.method7528(var1, 51200, 33, 64, 768);
      }

   }

   @deob.ObfuscatedName("mb.x(Lra;)V")
   private static void method9197(class772 arg0) {
      if (Statics.field5786 == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;

            for(int var9 = 0; var9 < 64; ++var9) {
               int var10 = 64 - var9;
               int var11 = var10 * var10;
               int var12 = 128 - var9 - 1;
               int var13 = 256 - (var5 + var11 << 8) / 4096;
               int var14 = var13 * 3072 / 1536;
               if (var14 < 0) {
                  var14 = 0;
               } else if (var14 > 255) {
                  var14 = 255;
               }

               int var15 = var14 / 2;
               var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = -16777216 | var14 << 16;
               var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 16777215;
            }
         }

         Statics.field5786 = arg0.method11534(var2, 0, 128, 128, 128);
         Statics.field5785 = arg0.method11534(var1, 0, 128, 128, 128);
      }

   }
}
