@deob.ObfuscatedName("kd")
public class class586 {
   @deob.ObfuscatedName("kd.n")
   public static final float[] field5340 = new float[16384];
   @deob.ObfuscatedName("kd.k")
   public static final float[] field5341 = new float[16384];

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field5340[var2] = (float)Math.sin((double)var2 * var0);
         field5341[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   private class586() throws Throwable {
      throw new Error();
   }
}
