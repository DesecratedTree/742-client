@deob.ObfuscatedName("agb")
public abstract class class166 extends class828 {
   @deob.ObfuscatedName("agb.d")
   protected float field1163 = 0.0F;
   @deob.ObfuscatedName("agb.b")
   private float field1162 = 0.0F;
   @deob.ObfuscatedName("agb.k")
   private class604 field1164;

   public class166(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("agb.g(Lkv;IS)V")
   public void method2307(class604 arg0, int arg1) {
      this.field1164 = arg0;
      this.field1163 = 0.0F;
      this.field1162 = 0.0F;
   }

   @deob.ObfuscatedName("agb.n(FI)V")
   public void method2311(float arg0) {
      float var2 = this.field1164.method8593();
      if (!(this.field1163 >= var2)) {
         this.field1162 = this.method2299(var2, this.field1162, arg0);
         this.field1163 += this.field1162;
         if (this.field1163 > var2) {
            this.field1163 = var2;
         }

      }
   }

   @deob.ObfuscatedName("agb.k(B)Z")
   public boolean method2300() {
      return this.field1164 != null;
   }

   @deob.ObfuscatedName("agb.d(S)Lkb;")
   public class584 method2301() {
      return class584.method8135(this.field1164.method8587(this.field1163));
   }

   @deob.ObfuscatedName("agb.b(Lfv;Lka;IIB)V")
   public void method2302(class461 arg0, class583 arg1, int arg2, int arg3) {
      class584 var5 = class584.method8135(this.field8476.method6420());
      var5.field5328 -= (float)arg2;
      var5.field5331 -= (float)arg3;
      class584 var6 = class584.method8135(this.field1164.method8587(this.field1163));
      var6.field5328 -= (float)arg2;
      var6.field5331 -= (float)arg3;
      float var7 = this.field1164.method8585(this.field1163);
      class584 var8 = class584.method8152(var6, var5);
      var8.method8146();
      class606 var9 = new class606();
      var9.method8611(var8, var7);
      class584 var10 = class584.method8136(0.0F, 1.0F, 0.0F);
      class584 var11 = class584.method8156(var8, var10);
      class584 var12 = class584.method8156(var11, var8);
      var12.method8150(var9);
      var5.field5330 *= -1.0F;
      var6.field5330 *= -1.0F;
      arg1.method8060(var5.field5328, var5.field5330, var5.field5331, var6.field5328, var6.field5330, var6.field5331, var12.field5328, var12.field5330, var12.field5331);
      var5.method8201();
      var6.method8201();
      var12.method8201();
   }

   @deob.ObfuscatedName("agb.r(Laen;I)V")
   public void method2296(class124 arg0) {
      this.field1164 = new class604(arg0);
      this.field1163 = 0.0F;
      this.field1162 = 0.0F;
   }

   @deob.ObfuscatedName("agb.h(FFFB)F")
   protected abstract float method2299(float arg0, float arg1, float arg2);
}
