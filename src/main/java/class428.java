@deob.ObfuscatedName("ep")
public class class428 {
   @deob.ObfuscatedName("ep.d")
   public int field3574 = -1;
   @deob.ObfuscatedName("ep.n")
   public class420 field3573;
   @deob.ObfuscatedName("ep.k")
   public class420 field3575;
   @deob.ObfuscatedName("ep.b")
   public String field3576;
   @deob.ObfuscatedName("ep.r")
   public String field3577;
   @deob.ObfuscatedName("ep.p")
   public int[] field3578;
   @deob.ObfuscatedName("ep.o")
   public int[] field3579;

   @deob.ObfuscatedName("ep.n(Lez;I)V")
   public void method5931(class438 arg0) {
      int var2 = arg0.method6129();
      this.field3573 = class420.method6585()[var2];
      if (class420.field3138 == this.field3573) {
         int var3 = arg0.method6129();
         this.field3575 = class420.method6585()[var3];
         this.field3574 = arg0.method6129();
      }

      this.field3576 = arg0.method6128();
      this.field3577 = arg0.method6128();
      int var4 = arg0.method6129();
      this.field3578 = new int[var4];
      this.field3579 = new int[var4];

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field3578[var5] = arg0.method6129();
         this.field3579[var5] = arg0.method6129();
      }

   }
}
