@deob.ObfuscatedName("hv")
public class class515 {
   @deob.ObfuscatedName("hv.k")
   public boolean field4085;
   @deob.ObfuscatedName("hv.b")
   public class508 field4086;
   @deob.ObfuscatedName("hv.d")
   public class508 field4087;
   @deob.ObfuscatedName("hv.n")
   public boolean field4084;

   public class515(boolean arg0) {
      this.field4085 = arg0;
   }

   @deob.ObfuscatedName("hv.n()Z")
   public boolean method7185() {
      return this.field4084 && !this.field4085;
   }

   @deob.ObfuscatedName("hv.k()V")
   public void method7184() {
      if (this.field4086 != null) {
         this.field4086.method302();
      }

      this.field4084 = false;
   }
}
