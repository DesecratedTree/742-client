import java.util.Random;

@deob.ObfuscatedName("vp")
public class class895 {
   @deob.ObfuscatedName("vp.p")
   private static class633 field9107 = new class633(16, class628.field5708);

   private class895() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("vp.n(III)V")
   public static void method15561(int arg0, int arg1) {
      if (Statics.field9103 != arg0) {
         Statics.field9105 = new int[arg0];

         for(int var2 = 0; var2 < arg0; ++var2) {
            Statics.field9105[var2] = (var2 << 12) / arg0;
         }

         Statics.field9103 = arg0;
      }

      if (Statics.field9104 != arg1) {
         if (Statics.field9103 != arg1) {
            Statics.field9106 = new int[arg1];

            for(int var3 = 0; var3 < arg1; ++var3) {
               Statics.field9106[var3] = (var3 << 12) / arg1;
            }
         } else {
            Statics.field9106 = Statics.field9105;
         }

         Statics.field9104 = arg1;
      }

   }

   @deob.ObfuscatedName("vp.k(II)[B")
   public static byte[] method15559(int arg0) {
      byte[] var1 = (byte[])((byte[])field9107.method9140(arg0));
      if (var1 == null) {
         var1 = new byte[512];
         Random var2 = new Random((long)arg0);

         for(int var3 = 0; var3 < 255; ++var3) {
            var1[var3] = (byte)var3;
         }

         for(int var4 = 0; var4 < 255; ++var4) {
            int var5 = 255 - var4;
            int var6 = class887.method15494(var2, var5);
            byte var7 = var1[var6];
            var1[var6] = var1[var5];
            var1[var5] = var1[511 - var4] = var7;
         }

         field9107.method9141(arg0, var1);
      }

      return var1;
   }
}
