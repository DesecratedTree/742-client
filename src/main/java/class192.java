@deob.ObfuscatedName("aha")
public class class192 extends class974 {
   @deob.ObfuscatedName("aha.x")
   private static final int[] field1229 = new int[6];
   @deob.ObfuscatedName("aha.s")
   private static final int[][] field1228 = new int[6][];
   @deob.ObfuscatedName("aha.n")
   private final class979 field1237;
   @deob.ObfuscatedName("aha.r")
   private final int field1232;
   @deob.ObfuscatedName("aha.p")
   private final int field1233;
   @deob.ObfuscatedName("aha.o")
   private final int field1234;
   @deob.ObfuscatedName("aha.a")
   private final int field1230;
   @deob.ObfuscatedName("aha.d")
   private final int field1236;
   @deob.ObfuscatedName("aha.b")
   private final int field1231;
   @deob.ObfuscatedName("aha.k")
   private class535 field1235;

   public class192(class979 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field1237 = arg0;
      this.field1232 = arg3;
      this.field1233 = arg4;
      this.field1234 = arg5;
      this.field1230 = arg6;
      this.field1236 = arg1;
      this.field1231 = arg2;
   }

   @deob.ObfuscatedName("aha.n()Lio;")
   public class535 method2488() {
      if (this.field1235 == null) {
         class637 var1 = this.field1237.field7118;
         field1229[0] = this.field1236;
         field1229[1] = this.field1231;
         field1229[2] = this.field1232;
         field1229[3] = this.field1233;
         field1229[4] = this.field1234;
         field1229[5] = this.field1230;
         boolean var2 = false;
         int var3 = 0;

         for(int var4 = 0; var4 < 6; ++var4) {
            if (field1229[var4] == -1) {
               return null;
            }

            class360 var5 = var1.method5112(field1229[var4]);
            int var6 = var5.field2315;
            if (var6 > var3) {
               var3 = var6;
            }

            if (!var1.method5108(field1229[var4], class742.field6809, 1.0F, var3, var3, false)) {
               return null;
            }

            if (var5.field2335 > 0) {
               var2 = true;
            }
         }

         for(int var7 = 0; var7 < 6; ++var7) {
            field1228[var7] = var1.method5146(field1229[var7], 1.0F, var3, var3, false);
            if (var3 * var3 != field1228[var7].length) {
               class360 var8 = var1.method5112(field1229[var7]);
               int var9 = var3 / var8.field2315;
               int[] var10 = new int[var3 * var3];

               for(int var11 = 0; var11 < var8.field2315; ++var11) {
                  for(int var12 = 0; var12 < var8.field2315; ++var12) {
                     int var13 = var8.field2315 * var12 + var11;
                     int var14 = (var3 * var12 + var11) * var9;

                     for(int var15 = 0; var15 < var9; ++var15) {
                        for(int var16 = 0; var16 < var9; ++var16) {
                           var10[var9 * var16 + var14 + var15] = field1228[var7][var13];
                        }
                     }
                  }
               }

               field1228[var7] = var10;
            }
         }

         this.field1235 = this.field1237.method2596(var3, var2, field1228);
      }

      return this.field1235;
   }
}
