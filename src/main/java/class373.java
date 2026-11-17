@deob.ObfuscatedName("co")
public class class373 {
   @deob.ObfuscatedName("co.n")
   public static final float[] field2746 = new float[16384];
   @deob.ObfuscatedName("co.k")
   public static final float[] field2745 = new float[16384];

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field2746[var2] = (float)Math.sin((double)var2 * var0);
         field2745[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   private class373() throws Throwable {
      throw new Error();
   }
}
