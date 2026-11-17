@deob.ObfuscatedName("pu")
public class class738 {
   @deob.ObfuscatedName("pu.n")
   public static final class738 field6785 = new class738(0);
   @deob.ObfuscatedName("pu.k")
   public static final class738 field6784 = new class738(1);
   @deob.ObfuscatedName("pu.d")
   public static final class738 field6783 = new class738(2);
   @deob.ObfuscatedName("pu.b")
   private final int field6786;

   @deob.ObfuscatedName("jr.n(I)[Lpu;")
   private static class738[] method8003() {
      return new class738[]{field6784, field6785, field6783};
   }

   private class738(int arg0) {
      this.field6786 = arg0;
   }

   @deob.ObfuscatedName("am.k(IB)Lpu;")
   public static class738 method3950(int arg0) {
      class738[] var1 = method8003();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class738 var3 = var1[var2];
         if (var3.field6786 == arg0) {
            return var3;
         }
      }

      return null;
   }
}
