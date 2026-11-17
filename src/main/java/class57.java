@deob.ObfuscatedName("aca")
public class class57 extends class679 {
   @deob.ObfuscatedName("aca.d")
   private static class839 field418 = new class839();
   @deob.ObfuscatedName("aca.b")
   private static int field419 = 0;
   @deob.ObfuscatedName("aca.p")
   public int field421;
   @deob.ObfuscatedName("aca.o")
   public int field422;
   @deob.ObfuscatedName("aca.a")
   public int field423;
   @deob.ObfuscatedName("aca.x")
   public int field424;
   @deob.ObfuscatedName("aca.r")
   public class4 field420;

   private class57() {
   }

   @deob.ObfuscatedName("ye.r(B)Laca;")
   public static class57 method16089() {
      class57 var0 = (class57)field418.method14797();
      if (var0 != null) {
         --field419;
         return var0;
      } else {
         return new class57();
      }
   }

   @deob.ObfuscatedName("zf.p(Laca;I)V")
   public static void method17064(class57 arg0) {
      arg0.field420 = null;
      if (field419 < 20) {
         field418.method14795(arg0);
         ++field419;
      }

   }
}
