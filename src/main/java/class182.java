@deob.ObfuscatedName("agr")
public class class182 extends class828 {
   @deob.ObfuscatedName("agr.d")
   private final class584 field1193 = new class584();
   @deob.ObfuscatedName("agr.r")
   private final class584 field1194 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("agr.p")
   private final class584 field1196 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("agr.o")
   private final class584 field1197 = new class584();
   @deob.ObfuscatedName("agr.k")
   private class446 field1195;
   @deob.ObfuscatedName("agr.b")
   private boolean field1192;

   public class182(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("agr.g(Lfg;Lkb;ZI)V")
   public void method2439(class446 arg0, class584 arg1, boolean arg2) {
      this.field1195 = arg0;
      this.field1193.method8177(arg1);
      this.field1192 = arg2;
      arg0.method2823();
   }

   @deob.ObfuscatedName("agr.n(FI)V")
   public void method2311(float arg0) {
      if (this.field1195 != null) {
         this.field1196.method8177(this.field1195.method2823().method1232());
         this.field8476.method6290(false, arg0, this.field1194, this.field8476.method6418(), this.field1196, this.field1197);
      }
   }

   @deob.ObfuscatedName("agr.k(B)Z")
   public boolean method2300() {
      return !Float.isNaN(this.field1194.field5328);
   }

   @deob.ObfuscatedName("agr.b(Lfv;Lka;IIB)V")
   public void method2302(class461 arg0, class583 arg1, int arg2, int arg3) {
      class584 var5 = class584.method8135(this.field8476.method6420());
      var5.field5328 -= (float)arg2;
      var5.field5331 -= (float)arg3;
      var5.field5330 *= -1.0F;
      class584 var6 = this.method2301();
      var6.field5328 -= (float)arg2;
      var6.field5331 -= (float)arg3;
      var6.field5330 *= -1.0F;
      arg1.method8060(var5.field5328, var5.field5330, var5.field5331, var6.field5328, var6.field5330, var6.field5331, 0.0F, 1.0F, 0.0F);
      var5.method8201();
      var6.method8201();
   }

   @deob.ObfuscatedName("agr.d(S)Lkb;")
   public class584 method2301() {
      class584 var1 = class584.method8135(this.field1194);
      class584 var2 = class584.method8135(this.field1193);
      if (this.field1192) {
         var2.method8150(this.field1195.method2797());
      }

      var1.method8147(var2);
      var2.method8201();
      return var1;
   }

   @deob.ObfuscatedName("agr.r(Laen;I)V")
   public void method2296(class124 arg0) {
      class455 var2 = class455.method5179(arg0.method1688());
      int var3 = arg0.method1587();
      this.field1195 = this.field8476.method6318().method6263(var2, var3);
      this.field1193.method8140(arg0);
      if (arg0.method1688() == 1) {
         this.field1192 = true;
      } else {
         this.field1192 = false;
      }

   }
}
