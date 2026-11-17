@deob.ObfuscatedName("nf")
public class class669 {
   @deob.ObfuscatedName("nf.n")
   public int[] field6087 = new int[2];
   @deob.ObfuscatedName("nf.d")
   private int[][][] field6093 = new int[2][2][4];
   @deob.ObfuscatedName("nf.b")
   private int[][][] field6088 = new int[2][2][4];
   @deob.ObfuscatedName("nf.r")
   private int[] field6089 = new int[2];
   @deob.ObfuscatedName("nf.p")
   private static float[][] field6090 = new float[2][8];
   @deob.ObfuscatedName("nf.o")
   public static int[][] field6086 = new int[2][8];

   @deob.ObfuscatedName("nf.n(IIF)F")
   private float method9734(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field6088[arg0][1][arg1] - this.field6088[arg0][0][arg1]) * arg2 + (float)this.field6088[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }

   @deob.ObfuscatedName("nf.k(F)F")
   private static float method9738(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @deob.ObfuscatedName("nf.d(IIF)F")
   private float method9735(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field6093[arg0][1][arg1] - this.field6093[arg0][0][arg1]) * arg2 + (float)this.field6093[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method9738(var5);
   }

   @deob.ObfuscatedName("nf.b(IF)I")
   public int method9736(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field6089[1] - this.field6089[0]) * arg1 + (float)this.field6089[0];
         float var4 = var3 * 0.0030517578F;
         Statics.field6092 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         Statics.field6091 = (int)(Statics.field6092 * 65536.0F);
      }

      if (this.field6087[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method9734(arg0, 0, arg1);
         field6090[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method9735(arg0, 0, arg1));
         field6090[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field6087[arg0]; ++var6) {
            float var7 = this.method9734(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float)Math.cos((double)this.method9735(arg0, var6, arg1));
            float var9 = var7 * var7;
            field6090[arg0][var6 * 2 + 1] = field6090[arg0][var6 * 2 - 1] * var9;
            field6090[arg0][var6 * 2] = field6090[arg0][var6 * 2 - 1] * var8 + field6090[arg0][var6 * 2 - 2] * var9;

            for(int var10 = var6 * 2 - 1; var10 >= 2; --var10) {
               field6090[arg0][var10] += field6090[arg0][var10 - 1] * var8 + field6090[arg0][var10 - 2] * var9;
            }

            field6090[arg0][1] += field6090[arg0][0] * var8 + var9;
            field6090[arg0][0] += var8;
         }

         if (arg0 == 0) {
            for(int var11 = 0; var11 < this.field6087[0] * 2; ++var11) {
               field6090[0][var11] *= Statics.field6092;
            }
         }

         for(int var12 = 0; var12 < this.field6087[arg0] * 2; ++var12) {
            field6086[arg0][var12] = (int)(field6090[arg0][var12] * 65536.0F);
         }

         return this.field6087[arg0] * 2;
      }
   }

   @deob.ObfuscatedName("nf.r(Laen;Lmz;)V")
   public final void method9733(class124 arg0, class662 arg1) {
      int var3 = arg0.method1688();
      this.field6087[0] = var3 >> 4;
      this.field6087[1] = var3 & 15;
      if (var3 != 0) {
         this.field6089[0] = arg0.method1587();
         this.field6089[1] = arg0.method1587();
         int var4 = arg0.method1688();

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var6 = 0; var6 < this.field6087[var5]; ++var6) {
               this.field6093[var5][0][var6] = arg0.method1587();
               this.field6088[var5][0][var6] = arg0.method1587();
            }
         }

         for(int var7 = 0; var7 < 2; ++var7) {
            for(int var8 = 0; var8 < this.field6087[var7]; ++var8) {
               if ((var4 & 1 << var7 * 4 << var8) != 0) {
                  this.field6093[var7][1][var8] = arg0.method1587();
                  this.field6088[var7][1][var8] = arg0.method1587();
               } else {
                  this.field6093[var7][1][var8] = this.field6093[var7][0][var8];
                  this.field6088[var7][1][var8] = this.field6088[var7][0][var8];
               }
            }
         }

         if (var4 != 0 || this.field6089[1] != this.field6089[0]) {
            arg1.method9682(arg0);
         }
      } else {
         int[] var9 = this.field6089;
         this.field6089[1] = 0;
         var9[0] = 0;
      }

   }
}
