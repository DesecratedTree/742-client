@deob.ObfuscatedName("rx")
public class class795 {
   @deob.ObfuscatedName("rx.n")
   public static class735 field7264 = new class735(128);

   private class795() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("nn.n(I)V")
   public static void method9946() {
      field7264.method10863();
   }

   @deob.ObfuscatedName("pg.k(II)Lajc;")
   public static class248 method10712(int arg0) {
      class248 var1 = (class248)field7264.method10867((long)arg0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Statics.field3827.method8771(arg0, 0);
         if (var2 != null && var2.length > 1) {
            class248 var3;
            try {
               var3 = method2232(var2);
            } catch (Exception var5) {
               throw new RuntimeException(var5.getMessage() + " " + arg0);
            }

            field7264.method10862(var3, (long)arg0);
            return var3;
         } else {
            return null;
         }
      }
   }

   @deob.ObfuscatedName("afv.b([BB)Lajc;")
   public static class248 method2232(byte[] arg0) {
      return new class248(new class124(arg0));
   }
}
