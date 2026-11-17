@deob.ObfuscatedName("eg")
public class class419 {
   @deob.ObfuscatedName("eg.d")
   private static final class437[] field3134 = new class437[100];
   @deob.ObfuscatedName("eg.b")
   private static int field3132 = 0;

   private class419() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ie.n(I)I")
   public static int method7324() {
      return ++field3132 - 1;
   }

   @deob.ObfuscatedName("dy.k(Ljava/lang/String;B)V")
   public static void method5635(String arg0) {
      method3849(0, 0, "", "", "", arg0);
   }

   @deob.ObfuscatedName("pt.d(ILjava/lang/String;I)V")
   public static void method10919(int arg0, String arg1) {
      method3849(arg0, 0, "", "", "", arg1);
   }

   @deob.ObfuscatedName("al.b(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
   public static void method3849(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5) {
      method10662(arg0, arg1, arg2, arg3, arg4, arg5, (String)null, -1);
   }

   @deob.ObfuscatedName("pa.r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   public static void method10662(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7) {
      class437 var8 = field3134[99];

      for(int var9 = 99; var9 > 0; --var9) {
         field3134[var9] = field3134[var9 - 1];
      }

      if (var8 == null) {
         var8 = new class437(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5);
      } else {
         var8.method6123(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5);
      }

      field3134[0] = var8;
      ++Statics.field3135;
      client.field2548 = client.field2447;
   }

   @deob.ObfuscatedName("lq.p(II)Ley;")
   public static class437 method9086(int arg0) {
      return arg0 >= 0 && arg0 < 100 ? field3134[arg0] : null;
   }

   @deob.ObfuscatedName("mh.o(I)I")
   public static int method9279() {
      return Statics.field3135;
   }

   @deob.ObfuscatedName("tp.a(I)V")
   public static void method14838() {
      for(int var0 = 0; var0 < 100; ++var0) {
         field3134[var0] = null;
      }

      Statics.field3135 = 0;
   }
}
