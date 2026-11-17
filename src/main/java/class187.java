@deob.ObfuscatedName("agw")
public class class187 extends class828 {
   @deob.ObfuscatedName("agw.k")
   private class604 field1209 = null;
   @deob.ObfuscatedName("agw.d")
   private class13 field1210 = null;

   public class187(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("agw.n(FI)V")
   public void method2311(float arg0) {
   }

   @deob.ObfuscatedName("agw.k(B)Z")
   public boolean method2300() {
      return this.field1209 != null && this.field1210 != null && this.field1210.method195();
   }

   @deob.ObfuscatedName("agw.d(S)Lkb;")
   public class584 method2301() {
      return class584.method8135(this.field1209.method8584(this.field1210.method350()));
   }

   @deob.ObfuscatedName("agw.b(Lfv;Lka;IIB)V")
   public void method2302(class461 arg0, class583 arg1, int arg2, int arg3) {
      class584 var5 = class584.method8135(this.field8476.method6420());
      var5.field5328 -= (float)arg2;
      var5.field5331 -= (float)arg3;
      float var6 = this.field1210.method350();
      class584 var7 = class584.method8135(this.field1209.method8584(var6));
      var7.field5328 -= (float)arg2;
      var7.field5331 -= (float)arg3;
      float var8 = this.field1209.method8586(var6);
      class584 var9 = class584.method8152(var7, var5);
      var9.method8146();
      class606 var10 = new class606();
      var10.method8611(var9, var8);
      class584 var11 = class584.method8136(0.0F, 1.0F, 0.0F);
      class584 var12 = class584.method8156(var9, var11);
      class584 var13 = class584.method8156(var12, var9);
      var13.method8150(var10);
      var5.field5330 *= -1.0F;
      var7.field5330 *= -1.0F;
      arg1.method8060(var5.field5328, var5.field5330, var5.field5331, var7.field5328, var7.field5330, var7.field5331, var13.field5328, var13.field5330, var13.field5331);
      var5.method8201();
      var7.method8201();
      var13.method8201();
   }

   @deob.ObfuscatedName("agw.r(Laen;I)V")
   public void method2296(class124 arg0) {
      this.field1209 = new class604(arg0);
   }
}
