@deob.ObfuscatedName("fy")
public class class464 {
   @deob.ObfuscatedName("fy.n")
   public static final class464 field3817 = new class464(0);
   @deob.ObfuscatedName("fy.k")
   private static final class464 field3815 = new class464(1);
   @deob.ObfuscatedName("fy.d")
   private static final class464 field3816 = new class464(2);
   @deob.ObfuscatedName("fy.b")
   private int field3814;

   private class464(int arg0) {
      this.field3814 = arg0;
   }

   @deob.ObfuscatedName("me.n(IB)Lfy;")
   public static class464 method9257(int arg0) {
      if (field3817.field3814 == arg0) {
         return field3817;
      } else if (field3815.field3814 == arg0) {
         return field3815;
      } else {
         return field3816.field3814 == arg0 ? field3816 : null;
      }
   }
}
