@deob.ObfuscatedName("fu")
public class class460 {
   @deob.ObfuscatedName("fu.n")
   public static final class460 field3800 = new class460(0, true);
   @deob.ObfuscatedName("fu.k")
   public static final class460 field3802 = new class460(1, true);
   @deob.ObfuscatedName("fu.d")
   public static final class460 field3799 = new class460(2, false);
   @deob.ObfuscatedName("fu.b")
   private int field3801;
   @deob.ObfuscatedName("fu.r")
   public boolean field3798;

   private class460(int arg0, boolean arg1) {
      this.field3801 = arg0;
      this.field3798 = arg1;
   }

   @deob.ObfuscatedName("sy.n(IB)Lfu;")
   public static class460 method14541(int arg0) {
      if (field3800.field3801 == arg0) {
         return field3800;
      } else if (field3802.field3801 == arg0) {
         return field3802;
      } else {
         return field3799.field3801 == arg0 ? field3799 : null;
      }
   }
}
