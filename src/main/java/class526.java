@deob.ObfuscatedName("if")
public class class526 {
   @deob.ObfuscatedName("if.n")
   private static final class526 field4158 = new class526();
   @deob.ObfuscatedName("if.k")
   private static final class526 field4157 = new class526();
   @deob.ObfuscatedName("if.d")
   private static final class526 field4159 = new class526();

   @deob.ObfuscatedName("tf.n(I)[Lif;")
   public static class526[] method14659() {
      return new class526[]{field4158, field4157, field4159};
   }

   private class526() {
   }

   @deob.ObfuscatedName("if.k(IIB)I")
   public int method7329(int arg0, int arg1) {
      int var3 = Statics.field6354 > arg1 ? Statics.field6354 : arg1;
      if (field4158 == this) {
         return 0;
      } else if (field4159 == this) {
         return var3 - arg0;
      } else {
         return field4157 == this ? (var3 - arg0) / 2 : 0;
      }
   }
}
