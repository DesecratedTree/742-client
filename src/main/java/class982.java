@deob.ObfuscatedName("yv")
public class class982 extends class826 {
   @deob.ObfuscatedName("yv.n")
   public final class511 field10207;

   private class982(class979 arg0, int arg1, int arg2, byte[] arg3) {
      this.field10207 = arg0.method16348(class372.field2735, arg1, arg2, false, arg3);
      this.field10207.method497(false, false);
   }

   private class982(class979 arg0, int arg1, int arg2, int[] arg3) {
      this.field10207 = arg0.method16347(arg1, arg2, false, arg3);
      this.field10207.method497(false, false);
   }

   @deob.ObfuscatedName("yv.n(Lys;II[I[I)Lyv;")
   public static class982 method16587(class979 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
      if (arg0.method2735(class372.field2735, class405.field3052)) {
         byte[] var5 = new byte[arg1 * arg2];

         for(int var6 = 0; var6 < arg2; ++var6) {
            int var7 = arg1 * var6 + arg3[var6];

            for(int var8 = 0; var8 < arg4[var6]; ++var8) {
               var5[var7++] = -1;
            }
         }

         return new class982(arg0, arg1, arg2, var5);
      } else {
         int[] var9 = new int[arg1 * arg2];

         for(int var10 = 0; var10 < arg2; ++var10) {
            int var11 = arg1 * var10 + arg3[var10];

            for(int var12 = 0; var12 < arg4[var10]; ++var12) {
               var9[var11++] = -16777216;
            }
         }

         return new class982(arg0, arg1, arg2, var9);
      }
   }
}
