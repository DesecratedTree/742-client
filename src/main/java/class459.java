@deob.ObfuscatedName("ft")
public class class459 {
   @deob.ObfuscatedName("ft.n")
   public static final class459 field3796 = new class459(0, 4);
   @deob.ObfuscatedName("ft.k")
   private static final class459 field3793 = new class459(1, 5);
   @deob.ObfuscatedName("ft.d")
   public static final class459 field3794 = new class459(2, 6);
   @deob.ObfuscatedName("ft.b")
   public final int field3792;
   @deob.ObfuscatedName("ft.r")
   public final int field3795;

   @deob.ObfuscatedName("li.n(I)[Lft;")
   private static class459[] method8924() {
      return new class459[]{field3796, field3793, field3794};
   }

   private class459(int arg0, int arg1) {
      this.field3792 = arg0;
      this.field3795 = arg1;
   }

   @deob.ObfuscatedName("aam.k(II)Lft;")
   public static class459 method372(int arg0) {
      class459[] var1 = method8924();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class459 var3 = var1[var2];
         if (var3.field3792 == arg0) {
            return var3;
         }
      }

      return null;
   }
}
