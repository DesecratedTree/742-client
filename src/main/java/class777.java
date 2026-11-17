@deob.ObfuscatedName("rf")
public class class777 {
   @deob.ObfuscatedName("rf.k")
   public static final int[] field7143 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @deob.ObfuscatedName("rf.d")
   public static int[] field7144 = new int[120];

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 120; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field7144[var1] = var0 / 4;
      }

   }

   private class777() throws Throwable {
      throw new Error();
   }
}
