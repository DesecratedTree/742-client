@deob.ObfuscatedName("up")
public class class868 {
   @deob.ObfuscatedName("up.n")
   public static final class868 field8821 = new class868(0);
   @deob.ObfuscatedName("up.k")
   public static final class868 field8820 = new class868(1);
   @deob.ObfuscatedName("up.d")
   public static final class868 field8822 = new class868(2);
   @deob.ObfuscatedName("up.b")
   public final int field8819;

   private class868(int arg0) {
      this.field8819 = arg0;
   }

   @deob.ObfuscatedName("xt.k(IB)Lup;")
   public static class868 method16038(int arg0) {
      class868[] var1 = Statics.method8943();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class868 var3 = var1[var2];
         if (var3.field8819 == arg0) {
            return var3;
         }
      }

      return null;
   }
}
