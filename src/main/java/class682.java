@deob.ObfuscatedName("ns")
public class class682 {
   @deob.ObfuscatedName("ns.n")
   private int field6184 = class86.method1202(16);
   @deob.ObfuscatedName("ns.k")
   private int field6185 = class86.method1202(24);
   @deob.ObfuscatedName("ns.d")
   private int field6188 = class86.method1202(24);
   @deob.ObfuscatedName("ns.b")
   private int field6186 = class86.method1202(24) + 1;
   @deob.ObfuscatedName("ns.r")
   private int field6187 = class86.method1202(6) + 1;
   @deob.ObfuscatedName("ns.p")
   private int field6189 = class86.method1202(8);
   @deob.ObfuscatedName("ns.o")
   private int[] field6190;

   public class682() {
      int[] var1 = new int[this.field6187];

      for(int var2 = 0; var2 < this.field6187; ++var2) {
         int var3 = 0;
         int var4 = class86.method1202(3);
         boolean var5 = class86.method1164() != 0;
         if (var5) {
            var3 = class86.method1202(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field6190 = new int[this.field6187 * 8];

      for(int var6 = 0; var6 < this.field6187 * 8; ++var6) {
         this.field6190[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? class86.method1202(8) : -1;
      }

   }

   @deob.ObfuscatedName("ns.n([FIZ)V")
   public void method10005(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = Statics.field640[this.field6189].field5801;
         int var6 = this.field6188 - this.field6185;
         int var7 = var6 / this.field6186;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = Statics.field640[this.field6189].method9232();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field6187;
                     }

                     var11 /= this.field6187;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field6190[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field6186 * var10 + this.field6185;
                     class640 var17 = Statics.field640[var15];
                     if (this.field6184 == 0) {
                        int var18 = this.field6186 / var17.field5801;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method9233();

                           for(int var21 = 0; var21 < var17.field5801; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field6186) {
                           float[] var23 = var17.method9233();

                           for(int var24 = 0; var24 < var17.field5801; ++var24) {
                              arg0[var16 + var22] += var23[var24];
                              ++var22;
                           }
                        }
                     }
                  }

                  ++var10;
                  if (var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }
}
