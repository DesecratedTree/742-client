@deob.ObfuscatedName("go")
public class class481 {
   @deob.ObfuscatedName("go.p")
   private class511[] field3895 = null;
   @deob.ObfuscatedName("go.o")
   private class467 field3896 = null;
   @deob.ObfuscatedName("go.a")
   public class511[] field3897 = null;
   @deob.ObfuscatedName("go.x")
   public class467 field3890 = null;
   @deob.ObfuscatedName("go.s")
   public class467 field3898 = null;
   @deob.ObfuscatedName("go.b")
   private class979 field3893;
   @deob.ObfuscatedName("go.r")
   public boolean field3894;

   public class481(class979 arg0) {
      this.field3893 = arg0;
      this.field3894 = this.field3893.field10115;
      if (this.field3894 && !this.field3893.method2540(class372.field2737, class405.field3052)) {
         this.field3894 = false;
      }

      if (this.field3894 || this.field3893.method2735(class372.field2737, class405.field3052)) {
         method6780();
         if (!this.field3894) {
            this.field3895 = new class511[16];

            for(int var2 = 0; var2 < 16; ++var2) {
               byte[] var3 = class830.method10724(Statics.field3900, var2 * 32768, 32768);
               this.field3895[var2] = this.field3893.method16348(class372.field2737, 128, 128, true, var3);
            }

            this.field3897 = new class511[16];

            for(int var4 = 0; var4 < 16; ++var4) {
               byte[] var5 = class830.method10724(Statics.field3892, var4 * 32768, 32768);
               this.field3897[var4] = this.field3893.method16348(class372.field2737, 128, 128, true, var5);
            }
         } else {
            byte[] var6 = class830.method14661(Statics.field3900, false);
            this.field3896 = this.field3893.method2547(class372.field2737, 128, 128, 16, true, var6);
            byte[] var7 = class830.method14661(Statics.field3892, false);
            this.field3890 = this.field3893.method2547(class372.field2737, 128, 128, 16, true, var7);
         }

      }
   }

   @deob.ObfuscatedName("go.n()V")
   private static void method6780() {
      if (Statics.field3900 == null) {
         class213 var0 = new class213();
         byte[] var1 = var0.method2886(128, 128, 16);
         Statics.field3900 = class830.method7357(var1, false);
      }

      if (Statics.field3892 == null) {
         class202 var2 = new class202();
         byte[] var3 = var2.method2837(128, 128, 16);
         Statics.field3892 = class830.method7357(var3, false);
      }

   }

   @deob.ObfuscatedName("go.k()Z")
   public boolean method6772() {
      return this.field3894 ? this.field3896 != null : this.field3895 != null;
   }

   @deob.ObfuscatedName("go.d()Z")
   public boolean method6779() {
      if (!this.field3893.field10115) {
         return false;
      } else {
         if (this.field3898 == null) {
            if (Statics.field3902 == null) {
               byte[] var1 = class673.method9857(128, 128, 16, 8, new class115(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
               Statics.field3902 = class830.method7357(var1, false);
            }

            byte[] var2 = class830.method14661(Statics.field3902, false);
            byte[] var3 = new byte[var2.length * 4];
            int var4 = 0;

            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = var5 * 16384;
               int var7 = var6;

               for(int var8 = 0; var8 < 128; ++var8) {
                  int var9 = var8 * 128 + var7;
                  int var10 = (var8 - 1 & 127) * 128 + var7;
                  int var11 = (var8 + 1 & 127) * 128 + var7;

                  for(int var12 = 0; var12 < 128; ++var12) {
                     float var13 = (float)((var2[var10 + var12] & 255) - (var2[var11 + var12] & 255));
                     float var14 = (float)((var2[(var12 - 1 & 127) + var9] & 255) - (var2[(var12 + 1 & 127) + var9] & 255));
                     float var15 = (float)(128.0D / Math.sqrt((double)(var13 * var13 + var14 * var14 + 16384.0F)));
                     var3[var4++] = (byte)((int)(var14 * var15 + 127.0F));
                     var3[var4++] = (byte)((int)(var15 * 128.0F + 127.0F));
                     var3[var4++] = (byte)((int)(var13 * var15 + 127.0F));
                     var3[var4++] = var2[var6++];
                  }
               }
            }

            this.field3898 = this.field3893.method2547(class372.field2736, 128, 128, 16, true, var3);
         }

         return this.field3898 != null;
      }
   }
}
