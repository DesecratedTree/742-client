@deob.ObfuscatedName("kl")
public class class594 implements class884 {
   @deob.ObfuscatedName("kl.n")
   private final String field5406;
   @deob.ObfuscatedName("kl.k")
   private boolean field5407;

   public class594(String arg0) {
      this.field5406 = arg0;
   }

   @deob.ObfuscatedName("kl.n(I)I")
   public int method8265() {
      if (this.field5407) {
         return 100;
      } else {
         int var1 = Statics.field3855.method9970(this.field5406);
         if (var1 >= 0 && var1 <= 100) {
            return var1;
         } else {
            this.field5407 = true;
            return 100;
         }
      }
   }

   @deob.ObfuscatedName("kl.a(B)Z")
   public boolean method8347() {
      return this.field5407;
   }

   @deob.ObfuscatedName("kl.k(I)Lvi;")
   public class888 method8268() {
      return class888.field9075;
   }
}
