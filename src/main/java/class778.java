@deob.ObfuscatedName("rg")
public class class778 {
   @deob.ObfuscatedName("rg.n")
   public class425 field7147;
   @deob.ObfuscatedName("rg.k")
   public class427 field7148;

   @deob.ObfuscatedName("rg.n(I)Lem;")
   public class425 method11662() {
      return this.field7148.method5917(this.field7147.field3465);
   }

   @deob.ObfuscatedName("rg.k(III)Z")
   public boolean method11663(int arg0, int arg1) {
      class425 var3 = Statics.method886(arg0, arg1);
      if (var3 != null) {
         this.field7148 = Statics.field844[arg0 >> 16];
         this.field7147 = var3;
         return true;
      } else {
         this.method11668();
         return false;
      }
   }

   @deob.ObfuscatedName("rg.d(Leo;III)Z")
   public boolean method11664(class427 arg0, int arg1, int arg2) {
      if (arg0 != null) {
         class425 var4 = arg0.method5917(arg1);
         if (var4 != null) {
            this.field7148 = arg0;
            this.field7147 = var4;
            return true;
         }
      }

      this.method11668();
      return false;
   }

   @deob.ObfuscatedName("rg.b(I)V")
   private void method11668() {
      this.field7148 = null;
      this.field7147 = null;
   }
}
