@deob.ObfuscatedName("e")
public class class412 {
   private class412() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("aey.n(Lra;IILem;I)V")
   public static void method2045(class772 arg0, int arg1, int arg2, class425 arg3) {
      byte var4 = 63;
      byte var5 = 7;

      for(int var6 = 63; var6 >= 0; --var6) {
         int var7 = (var6 & 63) << 10 | (var5 & 7) << 7 | var4 & 127;
         class789.method6469(false, true);
         int var8 = Statics.field7196[var7];
         class789.method9269(false, true);
         arg0.method7513(arg1, (arg3.field3557 * (63 - var6) >> 6) + arg2, arg3.field3405, (arg3.field3557 >> 6) + 1, -16777216 | var8, 0);
      }

   }

   @deob.ObfuscatedName("eb.k(Lra;IILem;II)V")
   public static void method5673(class772 arg0, int arg1, int arg2, class425 arg3, int arg4) {
      for(int var5 = 7; var5 >= 0; --var5) {
         for(int var6 = 127; var6 >= 0; --var6) {
            int var7 = (arg4 & 63) << 10 | (var5 & 7) << 7 | var6 & 127;
            class789.method6469(false, true);
            int var8 = Statics.field7196[var7];
            class789.method9269(false, true);
            arg0.method7513((arg3.field3405 * var6 >> 7) + arg1, (arg3.field3557 * (7 - var5) >> 3) + arg2, (arg3.field3405 >> 7) + 1, (arg3.field3557 >> 3) + 1, -16777216 | var8, 0);
         }
      }

   }
}
