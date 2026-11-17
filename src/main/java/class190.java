@deob.ObfuscatedName("agz")
public class class190 extends class828 {
   @deob.ObfuscatedName("agz.k")
   private final class606 field1217 = new class606();
   @deob.ObfuscatedName("agz.d")
   private final class606 field1218 = new class606(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

   public class190(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("agz.g(Lkx;B)V")
   public void method2467(class606 arg0) {
      this.field1218.field5478 = arg0.field5478;
      this.field1218.field5475 = arg0.field5475;
      this.field1218.field5480 = arg0.field5480;
      this.field1218.field5481 = arg0.field5481;
      this.field1217.method8645(this.field1218);
   }

   @deob.ObfuscatedName("agz.d(S)Lkb;")
   public class584 method2301() {
      class584 var1 = new class584(0.0F, 0.0F, 1000.0F);
      var1.method8150(class606.method8617(this.field1217));
      var1.field5330 *= -1.0F;
      var1.method8147(this.field8476.method6420());
      return var1;
   }

   @deob.ObfuscatedName("agz.n(FI)V")
   public void method2311(float arg0) {
      this.field1217.method8645(this.field1218);
   }

   @deob.ObfuscatedName("agz.k(B)Z")
   public boolean method2300() {
      return !Float.isNaN(this.field1217.field5478);
   }

   @deob.ObfuscatedName("agz.h(I)Lkx;")
   public class606 method2466() {
      return new class606(this.field1217);
   }

   @deob.ObfuscatedName("agz.b(Lfv;Lka;IIB)V")
   public void method2302(class461 arg0, class583 arg1, int arg2, int arg3) {
      class584 var5 = class584.method8135(this.field8476.method6420());
      var5.field5328 -= (float)arg2;
      var5.field5331 -= (float)arg3;
      var5.field5330 *= -1.0F;
      arg1.method8066(class606.method8617(this.field1217));
      arg1.method8083(var5);
      arg1.method8130();
      var5.method8201();
   }

   @deob.ObfuscatedName("agz.r(Laen;I)V")
   public void method2296(class124 arg0) {
      this.field1218.method8609(arg0);
   }
}
