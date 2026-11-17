@deob.ObfuscatedName("acd")
public class class60 extends class679 {
   @deob.ObfuscatedName("acd.b")
   private class839 field437 = new class839();
   @deob.ObfuscatedName("acd.d")
   public class694 field438;

   public class60(class694 arg0) {
      this.field438 = arg0;
   }

   @deob.ObfuscatedName("acd.r(IIIIB)V")
   public void method949(int arg0, int arg1, int arg2, int arg3) {
      class70 var5 = null;
      int var6 = 0;

      for(class70 var7 = (class70)this.field437.method14798(); var7 != null; var7 = (class70)this.field437.method14793()) {
         ++var6;
         if (var7.field514 == arg0) {
            var7.method1017(arg0, arg1, arg2, arg3);
            return;
         }

         if (var7.field514 <= arg0) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < Statics.field5740.field7293) {
            this.field437.method14809(new class70(arg0, arg1, arg2, arg3));
         }

      } else {
         class839.method17072(new class70(arg0, arg1, arg2, arg3), var5);
         if (var6 >= Statics.field5740.field7293) {
            this.field437.method14798().method9960();
         }

      }
   }

   @deob.ObfuscatedName("acd.p(II)Lacn;")
   public class70 method953(int arg0) {
      class70 var2 = (class70)this.field437.method14798();
      if (var2 != null && var2.field514 <= arg0) {
         for(class70 var3 = (class70)this.field437.method14793(); var3 != null && var3.field514 <= arg0; var3 = (class70)this.field437.method14793()) {
            var2.method9960();
            var2 = var3;
         }

         if (this.field438.field6362 + var2.field517 + var2.field514 > arg0) {
            return var2;
         } else {
            var2.method9960();
            return null;
         }
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("acd.o(I)Z")
   public boolean method950() {
      return this.field437.method14805();
   }
}
