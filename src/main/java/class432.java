@deob.ObfuscatedName("et")
public class class432 {
   @deob.ObfuscatedName("et.k")
   public String field3596;
   @deob.ObfuscatedName("et.n")
   public String field3598;
   @deob.ObfuscatedName("et.d")
   public String field3599;
   @deob.ObfuscatedName("et.r")
   public class429[] field3595;
   @deob.ObfuscatedName("et.b")
   public class429[] field3597;

   @deob.ObfuscatedName("et.n(Lez;B)V")
   public void method5965(class438 arg0) {
      this.field3598 = arg0.method6128();
      this.field3596 = arg0.method6128();
      this.field3599 = arg0.method6128();
      int var2 = arg0.method6129();
      int var3 = arg0.method6129();
      this.field3597 = var2 == 0 ? null : new class429[var2];
      this.field3595 = var3 == 0 ? null : new class429[var3];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field3597[var4] = new class429();
         this.field3597[var4].method5934(arg0);
      }

      for(int var5 = 0; var5 < var3; ++var5) {
         this.field3595[var5] = new class429();
         this.field3595[var5].method5934(arg0);
      }

   }
}
