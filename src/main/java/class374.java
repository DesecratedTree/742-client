@deob.ObfuscatedName("cp")
public class class374 {
   @deob.ObfuscatedName("cp.n")
   private static int field2749 = 0;
   @deob.ObfuscatedName("cp.k")
   private static boolean field2748 = false;
   @deob.ObfuscatedName("cp.d")
   private static final class849 field2747 = new class849();

   private class374() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("cp.n(Lua;B)V")
   public static synchronized void method5047(class853 arg0) {
      if (!field2748) {
         if (field2749 > 0) {
            class106 var1 = new class106(arg0);
            field2747.method14959(var1);
         } else {
            arg0.method9(false);
         }

      }
   }

   @deob.ObfuscatedName("cp.k(I)V")
   public static synchronized void method5048() {
      while(true) {
         class106 var0 = (class106)field2747.method14961();
         if (var0 == null) {
            return;
         }

         ((class853)var0.field807).method9(true);
         var0.method9864();
      }
   }

   @deob.ObfuscatedName("cp.d(I)V")
   public static synchronized void method5052() {
      ++field2749;
   }

   @deob.ObfuscatedName("cp.b(B)V")
   public static synchronized void method5056() {
      --field2749;
      if (field2749 == 0) {
         method5048();
      }

   }

   @deob.ObfuscatedName("cp.r(ZI)V")
   public static synchronized void method5050(boolean arg0) {
      field2748 = arg0;
   }
}
