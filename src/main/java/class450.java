@deob.ObfuscatedName("fk")
public class class450 {
   private class450() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ab.n(Lfs;I)V")
   public static void method482(class458 arg0) {
      Statics.field3713 = arg0;
   }

   @deob.ObfuscatedName("qm.k(Laen;Ljava/lang/String;S)I")
   public static int method11264(class124 arg0, String arg1) {
      int var2 = arg0.field935;
      byte[] var3 = class813.method6450(arg1);
      arg0.method1638(var3.length);
      arg0.field935 += Statics.field3713.method6493(var3, 0, var3.length, arg0.field931, arg0.field935);
      return arg0.field935 - var2;
   }

   @deob.ObfuscatedName("sa.d(Laen;B)Ljava/lang/String;")
   public static String method14241(class124 arg0) {
      return Statics.method1134(arg0, 32767);
   }
}
