@deob.ObfuscatedName("qf")
public class class750 {
   @deob.ObfuscatedName("qf.n")
   public static final class750 field6907 = new class750(0, 2, 2, 1);
   @deob.ObfuscatedName("qf.k")
   public static final class750 field6897 = new class750(1, 2, 2, 0);
   @deob.ObfuscatedName("qf.d")
   private static final class750 field6905 = new class750(2, 4, 4, 0);
   @deob.ObfuscatedName("qf.b")
   private static final class750 field6899 = new class750(4, 1, 1, 1);
   @deob.ObfuscatedName("qf.r")
   public static final class750 field6908 = new class750(6, 0, 4, 2);
   @deob.ObfuscatedName("qf.p")
   public static final class750 field6901 = new class750(7, 0, 1, 1);
   @deob.ObfuscatedName("qf.o")
   private static final class750 field6900 = new class750(8, 0, 4, 1);
   @deob.ObfuscatedName("qf.a")
   private static final class750 field6903 = new class750(9, 0, 4, 1);
   @deob.ObfuscatedName("qf.x")
   public static final class750 field6904 = new class750(10, 2, 2, 0);
   @deob.ObfuscatedName("qf.s")
   public static final class750 field6911 = new class750(11, 0, 1, 2);
   @deob.ObfuscatedName("qf.l")
   private static final class750 field6906 = new class750(12, 0, 1, 0);
   @deob.ObfuscatedName("qf.u")
   private static final class750 field6902 = new class750(13, 0, 1, 0);
   @deob.ObfuscatedName("qf.v")
   private static final class750 field6909 = new class750(14, 0, 4, 1);
   @deob.ObfuscatedName("qf.g")
   private static final class750 field6898 = new class750(15, 0, 1, 0);
   @deob.ObfuscatedName("qf.h")
   public int field6910;
   @deob.ObfuscatedName("qf.e")
   public int field6896;
   @deob.ObfuscatedName("qf.z")
   public int field6912;
   @deob.ObfuscatedName("qf.m")
   public int field6913;

   @deob.ObfuscatedName("rf.n(I)[Lqf;")
   private static class750[] method11658() {
      return new class750[]{field6911, field6901, field6906, field6903, field6897, field6898, field6908, field6904, field6907, field6900, field6909, field6899, field6905, field6902};
   }

   private class750(int arg0, int arg1, int arg2, int arg3) {
      this.field6910 = arg0;
      this.field6896 = arg1;
      this.field6912 = arg2;
      this.field6913 = arg3;
   }

   @deob.ObfuscatedName("ix.k(IS)Lqf;")
   public static class750 method7449(int arg0) {
      class750[] var1 = method11658();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2].field6910 == arg0) {
            return var1[var2];
         }
      }

      return null;
   }
}
