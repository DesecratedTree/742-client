@deob.ObfuscatedName("ku")
public class class603 {
   @deob.ObfuscatedName("ku.z")
   public static final int[] field5469 = new int[16384];
   @deob.ObfuscatedName("ku.m")
   public static final int[] field5471 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field5469[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
         field5471[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }

   private class603() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ku.n(I)F")
   public static float method8577(int arg0) {
      int var1 = arg0 & 16383;
      return (float)((double)((float)var1 / 16384.0F) * 6.283185307179586D);
   }
}
