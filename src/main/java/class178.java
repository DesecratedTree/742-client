@deob.ObfuscatedName("agn")
public class class178 extends class828 {
   @deob.ObfuscatedName("agn.k")
   private final class584 field1186 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("agn.d")
   private final class584 field1185 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("agn.b")
   private final class584 field1187 = new class584();

   public class178(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("agn.g(Lade;I)V")
   public void method2430(class88 arg0) {
      this.field1185.field5328 = (float)arg0.field670;
      this.field1185.field5330 = (float)arg0.field669;
      this.field1185.field5331 = (float)arg0.field667;
      if (Float.isNaN(this.field1186.field5328)) {
         this.field1186.method8177(this.field1185);
         this.field1187.method8143();
      }

   }

   @deob.ObfuscatedName("agn.n(FI)V")
   public void method2311(float arg0) {
      this.field8476.method6290(false, arg0, this.field1186, this.field8476.method6418(), this.field1185, this.field1187);
   }

   @deob.ObfuscatedName("agn.k(B)Z")
   public boolean method2300() {
      return !Float.isNaN(this.field1186.field5328);
   }

   @deob.ObfuscatedName("agn.b(Lfv;Lka;IIB)V")
   public void method2302(class461 arg0, class583 arg1, int arg2, int arg3) {
      class584 var5 = class584.method8135(this.field8476.method6420());
      var5.field5328 -= (float)arg2;
      var5.field5331 -= (float)arg3;
      var5.field5330 *= -1.0F;
      class584 var6 = class584.method8135(this.field1186);
      var6.field5328 -= (float)arg2;
      var6.field5331 -= (float)arg3;
      var6.field5330 *= -1.0F;
      arg1.method8060(var5.field5328, var5.field5330, var5.field5331, var6.field5328, var6.field5330, var6.field5331, 0.0F, 1.0F, 0.0F);
      var5.method8201();
      var6.method8201();
   }

   @deob.ObfuscatedName("agn.d(S)Lkb;")
   public class584 method2301() {
      return class584.method8135(this.field1186);
   }

   @deob.ObfuscatedName("agn.r(Laen;I)V")
   public void method2296(class124 arg0) {
      this.field1185.method8140(arg0);
   }
}
