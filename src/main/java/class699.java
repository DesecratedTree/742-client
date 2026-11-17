@deob.ObfuscatedName("oi")
public class class699 {
   @deob.ObfuscatedName("oi.d")
   private static int field6456 = 0;
   @deob.ObfuscatedName("oi.n")
   public class290 field6458;
   @deob.ObfuscatedName("oi.k")
   public class699 field6457;

   private class699() {
   }

   @deob.ObfuscatedName("aw.n(Lakr;I)Loi;")
   public static class699 method4063(class290 arg0) {
      class699 var1;
      if (Statics.field6141 == null) {
         var1 = new class699();
      } else {
         var1 = Statics.field6141;
         Statics.field6141 = Statics.field6141.field6457;
         var1.field6457 = null;
         --field6456;
      }

      var1.field6458 = arg0;
      return var1;
   }

   @deob.ObfuscatedName("oi.k(B)V")
   public void method10288() {
      if (field6456 < 500) {
         this.field6458 = null;
         this.field6457 = Statics.field6141;
         Statics.field6141 = this;
         ++field6456;
      }
   }
}
