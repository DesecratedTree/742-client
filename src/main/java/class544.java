@deob.ObfuscatedName("ix")
public class class544 {
   @deob.ObfuscatedName("ix.n")
   private static final class544 field4351 = new class544();
   @deob.ObfuscatedName("ix.k")
   private static final class544 field4350 = new class544();
   @deob.ObfuscatedName("ix.d")
   private static final class544 field4352 = new class544();

   @deob.ObfuscatedName("c.n(B)[Lix;")
   public static class544[] method4414() {
      return new class544[]{field4351, field4350, field4352};
   }

   private class544() {
   }

   @deob.ObfuscatedName("ix.k(IIB)I")
   public int method7443(int arg0, int arg1) {
      int var3 = Statics.field6104 > arg1 ? Statics.field6104 : arg1;
      if (field4351 == this) {
         return 0;
      } else if (field4352 == this) {
         return var3 - arg0;
      } else {
         return field4350 == this ? (var3 - arg0) / 2 : 0;
      }
   }
}
