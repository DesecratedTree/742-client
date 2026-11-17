@deob.ObfuscatedName("sc")
public class class801 {
   @deob.ObfuscatedName("sc.n")
   public static final class801 field7297 = new class801("runescape", "RuneScape", 0);
   @deob.ObfuscatedName("sc.k")
   public static final class801 field7298 = new class801("stellardawn", "Stellar Dawn", 1);
   @deob.ObfuscatedName("sc.d")
   private static final class801 field7299 = new class801("game3", "Game 3", 2);
   @deob.ObfuscatedName("sc.b")
   private static final class801 field7301 = new class801("game4", "Game 4", 3);
   @deob.ObfuscatedName("sc.r")
   private static final class801 field7303 = new class801("game5", "Game 5", 4);
   @deob.ObfuscatedName("sc.p")
   public final String field7302;
   @deob.ObfuscatedName("sc.o")
   public final String field7300;
   @deob.ObfuscatedName("sc.a")
   public final int field7304;

   @deob.ObfuscatedName("d.n(S)[Lsc;")
   private static class801[] method5338() {
      return new class801[]{field7301, field7303, field7298, field7297, field7299};
   }

   private class801(String arg0, String arg1, int arg2) {
      this.field7302 = arg0;
      this.field7300 = arg1;
      this.field7304 = arg2;
   }

   @deob.ObfuscatedName("en.k(IB)Lsc;")
   public static class801 method5912(int arg0) {
      class801[] var1 = method5338();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class801 var3 = var1[var2];
         if (var3.field7304 == arg0) {
            return var3;
         }
      }

      return null;
   }
}
