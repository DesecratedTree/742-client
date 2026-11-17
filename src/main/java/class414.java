@deob.ObfuscatedName("eb")
public class class414 {
   @deob.ObfuscatedName("eb.n")
   public String field3112;
   @deob.ObfuscatedName("eb.b")
   public class428[] field3109;
   @deob.ObfuscatedName("eb.r")
   public class428[] field3111;
   @deob.ObfuscatedName("eb.p")
   public class432[] field3110;

   public class414(byte[] arg0) throws class189 {
      this.method5672(arg0);
   }

   @deob.ObfuscatedName("eb.n([BI)V")
   private void method5672(byte[] arg0) throws class189 {
      class438 var2 = new class438(arg0);
      int var3 = var2.method6129();
      if (var3 != 4) {
         throw new class189(this, var3, 4);
      } else {
         this.field3112 = var2.method6128();
         this.field3109 = new class428[var2.method6129()];
         this.field3111 = new class428[var2.method6129()];
         this.field3110 = new class432[var2.method6129()];

         for(int var4 = 0; var4 < this.field3109.length; ++var4) {
            this.field3109[var4] = new class428();
            this.field3109[var4].method5931(var2);
         }

         for(int var5 = 0; var5 < this.field3111.length; ++var5) {
            this.field3111[var5] = new class428();
            this.field3111[var5].method5931(var2);
         }

         for(int var6 = 0; var6 < this.field3110.length; ++var6) {
            this.field3110[var6] = new class432();
            this.field3110[var6].method5965(var2);
         }

      }
   }
}
