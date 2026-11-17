@deob.ObfuscatedName("qk")
public class class755 {
   @deob.ObfuscatedName("qk.b")
   private static boolean field6952 = false;

   private class755() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("cx.n(II)Laed;")
   public static class114 method5207(int arg0) {
      return field6952 && arg0 >= Statics.field6955 && arg0 <= Statics.field6951 ? Statics.field6954[arg0 - Statics.field6955] : null;
   }

   @deob.ObfuscatedName("pj.k([BI)Z")
   public static boolean method10740(byte[] arg0) {
      class124 var1 = new class124(arg0);
      int var2 = var1.method1688();
      if (var2 != 2) {
         return false;
      } else {
         boolean var3 = var1.method1688() == 1;
         if (var3) {
            method10164(var1);
         }

         method15060(var1);
         return true;
      }
   }

   @deob.ObfuscatedName("od.d(Laen;I)V")
   private static void method10164(class124 arg0) {
      int var1 = arg0.method1604();
      Statics.field6078 = new class753[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Statics.field6078[var2] = new class753();
         Statics.field6078[var2].field6948 = arg0.method1604();
         Statics.field6078[var2].field6947 = arg0.method1600();
      }

      Statics.field6955 = arg0.method1604();
      Statics.field6951 = arg0.method1604();
      Statics.field6635 = arg0.method1604();
      Statics.field6954 = new class114[Statics.field6951 - Statics.field6955 + 1];

      for(int var3 = 0; var3 < Statics.field6635; ++var3) {
         int var4 = arg0.method1604();
         class114 var5 = Statics.field6954[var4] = new class114();
         var5.field6945 = arg0.method1688();
         var5.field6944 = arg0.method1591();
         var5.field897 = Statics.field6955 + var4;
         var5.field896 = arg0.method1600();
         var5.field894 = arg0.method1600();
      }

      Statics.field6956 = arg0.method1591();
      field6952 = true;
   }

   @deob.ObfuscatedName("u.b(Laen;I)V")
   private static void method15060(class124 arg0) {
      for(int var1 = 0; var1 < Statics.field6635; ++var1) {
         int var2 = arg0.method1604();
         int var3 = arg0.method1587();
         if (var3 == 65535) {
            var3 = -1;
         }

         if (Statics.field6954[var2] != null) {
            Statics.field6954[var2].field6946 = var3;
         }
      }

   }
}
