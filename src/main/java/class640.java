@deob.ObfuscatedName("md")
public class class640 {
   @deob.ObfuscatedName("md.n")
   public int field5801;
   @deob.ObfuscatedName("md.k")
   private int field5798;
   @deob.ObfuscatedName("md.d")
   private int[] field5799;
   @deob.ObfuscatedName("md.b")
   private int[] field5800;
   @deob.ObfuscatedName("md.r")
   private float[][] field5797;
   @deob.ObfuscatedName("md.p")
   private int[] field5802;

   @deob.ObfuscatedName("md.n(II)I")
   private static int method9241(int arg0, int arg1) {
      int var2;
      for(var2 = (int)Math.pow((double)arg0, 1.0D / (double)arg1) + 1; class887.method14595(var2, arg1) > arg0; --var2) {
      }

      return var2;
   }

   public class640() {
      class86.method1202(24);
      this.field5801 = class86.method1202(16);
      this.field5798 = class86.method1202(24);
      this.field5799 = new int[this.field5798];
      boolean var1 = class86.method1164() != 0;
      if (var1) {
         int var2 = 0;
         int var3 = class86.method1202(5) + 1;

         while(var2 < this.field5798) {
            int var4 = class86.method1202(class887.method5009(this.field5798 - var2));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.field5799[var2++] = var3;
            }

            ++var3;
         }
      } else {
         boolean var6 = class86.method1164() != 0;

         for(int var7 = 0; var7 < this.field5798; ++var7) {
            if (var6 && class86.method1164() == 0) {
               this.field5799[var7] = 0;
            } else {
               this.field5799[var7] = class86.method1202(5) + 1;
            }
         }
      }

      this.method9239();
      int var8 = class86.method1202(4);
      if (var8 > 0) {
         float var9 = class86.method1184(class86.method1202(32));
         float var10 = class86.method1184(class86.method1202(32));
         int var11 = class86.method1202(4) + 1;
         boolean var12 = class86.method1164() != 0;
         int var13;
         if (var8 == 1) {
            var13 = method9241(this.field5798, this.field5801);
         } else {
            var13 = this.field5801 * this.field5798;
         }

         this.field5800 = new int[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field5800[var14] = class86.method1202(var11);
         }

         this.field5797 = new float[this.field5798][this.field5801];
         if (var8 == 1) {
            for(int var15 = 0; var15 < this.field5798; ++var15) {
               float var16 = 0.0F;
               int var17 = 1;

               for(int var18 = 0; var18 < this.field5801; ++var18) {
                  int var19 = var15 / var17 % var13;
                  float var20 = (float)this.field5800[var19] * var10 + var9 + var16;
                  this.field5797[var15][var18] = var20;
                  if (var12) {
                     var16 = var20;
                  }

                  var17 = var13 * var17;
               }
            }
         } else {
            for(int var21 = 0; var21 < this.field5798; ++var21) {
               float var22 = 0.0F;
               int var23 = this.field5801 * var21;

               for(int var24 = 0; var24 < this.field5801; ++var24) {
                  float var25 = (float)this.field5800[var23] * var10 + var9 + var22;
                  this.field5797[var21][var24] = var25;
                  if (var12) {
                     var22 = var25;
                  }

                  ++var23;
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("md.k()V")
   private void method9239() {
      int[] var1 = new int[this.field5798];
      int[] var2 = new int[33];

      for(int var3 = 0; var3 < this.field5798; ++var3) {
         int var4 = this.field5799[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(int var8 = var4 - 1; var8 >= 1; --var8) {
                  int var9 = var2[var8];
                  if (var6 != var9) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(int var11 = var4 + 1; var11 <= 32; ++var11) {
               int var12 = var2[var11];
               if (var6 == var12) {
                  var2[var11] = var7;
               }
            }
         }
      }

      this.field5802 = new int[8];
      int var13 = 0;

      for(int var14 = 0; var14 < this.field5798; ++var14) {
         int var15 = this.field5799[var14];
         if (var15 != 0) {
            int var16 = var1[var14];
            int var17 = 0;

            for(int var18 = 0; var18 < var15; ++var18) {
               int var19 = Integer.MIN_VALUE >>> var18;
               if ((var16 & var19) != 0) {
                  if (this.field5802[var17] == 0) {
                     this.field5802[var17] = var13;
                  }

                  var17 = this.field5802[var17];
               } else {
                  ++var17;
               }

               if (var17 >= this.field5802.length) {
                  int[] var20 = new int[this.field5802.length * 2];

                  for(int var21 = 0; var21 < this.field5802.length; ++var21) {
                     var20[var21] = this.field5802[var21];
                  }

                  this.field5802 = var20;
               }

               int var22 = var19 >>> 1;
            }

            this.field5802[var17] = ~var14;
            if (var17 >= var13) {
               var13 = var17 + 1;
            }
         }
      }

   }

   @deob.ObfuscatedName("md.d()I")
   public int method9232() {
      int var1;
      for(var1 = 0; this.field5802[var1] >= 0; var1 = class86.method1164() != 0 ? this.field5802[var1] : var1 + 1) {
      }

      return ~this.field5802[var1];
   }

   @deob.ObfuscatedName("md.b()[F")
   public float[] method9233() {
      return this.field5797[this.method9232()];
   }
}
