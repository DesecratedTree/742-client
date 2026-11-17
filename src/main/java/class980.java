@deob.ObfuscatedName("yt")
public class class980 extends class826 {
   @deob.ObfuscatedName("yt.n")
   public final class186 field10131;

   private class980(class983 arg0, int arg1, int arg2, byte[] arg3) {
      this.field10131 = class186.method2453(arg0, class372.field2735, class405.field3052, arg1, arg2, false, arg3, class372.field2735);
      this.field10131.method15984(false, false);
   }

   @deob.ObfuscatedName("yt.n(Lyw;II[I[I)Lyt;")
   public static class980 method16522(class983 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
      byte[] var5 = new byte[arg1 * arg2];

      for(int var6 = 0; var6 < arg2; ++var6) {
         int var7 = arg1 * var6 + arg3[var6];

         for(int var8 = 0; var8 < arg4[var6]; ++var8) {
            var5[var7++] = -1;
         }
      }

      return new class980(arg0, arg1, arg2, var5);
   }
}
