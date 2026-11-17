@deob.ObfuscatedName("wt")
public class class926 {
   private class926() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ew.n(Lwn;I)V")
   public static void method6114(class920 arg0) {
      if (Statics.field9399 != null) {
         throw new IllegalStateException("");
      } else {
         Statics.field9399 = arg0;
      }
   }

   @deob.ObfuscatedName("eq.k(S)Lwn;")
   public static class920 method5940() {
      if (Statics.field9399 == null) {
         throw new IllegalStateException("");
      } else {
         return Statics.field9399;
      }
   }

   @deob.ObfuscatedName("va.d(I)Z")
   public static boolean method15369() {
      return Statics.field9399 != null;
   }
}
