@deob.ObfuscatedName("ahh")
public class class199 extends class969 {
   @deob.ObfuscatedName("ahh.x")
   private static final int[] field1295 = new int[6];
   @deob.ObfuscatedName("ahh.s")
   private static final int[][] field1293 = new int[6][];
   @deob.ObfuscatedName("ahh.n")
   private final class983 field1292;
   @deob.ObfuscatedName("ahh.r")
   private final int field1291;
   @deob.ObfuscatedName("ahh.p")
   private final int field1287;
   @deob.ObfuscatedName("ahh.o")
   private final int field1288;
   @deob.ObfuscatedName("ahh.a")
   private final int field1294;
   @deob.ObfuscatedName("ahh.d")
   private final int field1289;
   @deob.ObfuscatedName("ahh.b")
   private final int field1296;
   @deob.ObfuscatedName("ahh.k")
   private class936 field1290;

   public class199(class983 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field1292 = arg0;
      this.field1291 = arg3;
      this.field1287 = arg4;
      this.field1288 = arg5;
      this.field1294 = arg6;
      this.field1289 = arg1;
      this.field1296 = arg2;
   }

   @deob.ObfuscatedName("ahh.n()Lxc;")
   public class936 method2786() {
      if (this.field1290 == null) {
         class637 var1 = this.field1292.field7118;
         field1295[0] = this.field1289;
         field1295[1] = this.field1296;
         field1295[2] = this.field1291;
         field1295[3] = this.field1287;
         field1295[4] = this.field1288;
         field1295[5] = this.field1294;
         boolean var2 = false;
         int var3 = 0;

         for(int var4 = 0; var4 < 6; ++var4) {
            if (field1295[var4] < 0) {
               return null;
            }

            class360 var5 = var1.method5112(field1295[var4]);
            int var6 = var5.field2315;
            if (var6 > var3) {
               var3 = var6;
            }

            if (!var1.method5108(field1295[var4], class742.field6809, 1.0F, var3, var3, false)) {
               return null;
            }

            if (var5.field2335 > 0) {
               var2 = true;
            }
         }

         for(int var7 = 0; var7 < 6; ++var7) {
            field1293[var7] = var1.method5146(field1295[var7], 1.0F, var3, var3, false);
            if (var3 * var3 != field1293[var7].length) {
               class360 var8 = var1.method5112(field1295[var7]);
               int var9 = var3 / var8.field2315;
               int[] var10 = new int[var3 * var3];

               for(int var11 = 0; var11 < var8.field2315; ++var11) {
                  for(int var12 = 0; var12 < var8.field2315; ++var12) {
                     int var13 = var8.field2315 * var12 + var11;
                     int var14 = (var3 * var12 + var11) * var9;

                     for(int var15 = 0; var15 < var9; ++var15) {
                        for(int var16 = 0; var16 < var9; ++var16) {
                           var10[var9 * var16 + var14 + var15] = field1293[var7][var13];
                        }
                     }
                  }
               }

               field1293[var7] = var10;
            }
         }

         this.field1290 = new class936(this.field1292, class372.field2733, class405.field3052, var3, var2, field1293);
      }

      return this.field1290;
   }
}
