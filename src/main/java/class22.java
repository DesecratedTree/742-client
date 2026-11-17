@deob.ObfuscatedName("aat")
public class class22 extends class485 {
   @deob.ObfuscatedName("aat.d")
   private final class584 field185 = new class584();
   @deob.ObfuscatedName("aat.b")
   private final class606 field186 = new class606();
   @deob.ObfuscatedName("aat.p")
   private int field188 = 200;
   @deob.ObfuscatedName("aat.a")
   private final class584 field190 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("aat.x")
   private final class584 field184 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("aat.s")
   private final class584 field192 = new class584();
   @deob.ObfuscatedName("aat.l")
   private final class606 field193 = new class606();
   @deob.ObfuscatedName("aat.o")
   private int field191;
   @deob.ObfuscatedName("aat.k")
   private class446 field189;
   @deob.ObfuscatedName("aat.r")
   private boolean field187;

   public class22(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("aat.c(Lfg;Lkb;Lkx;ZILml;[[[IB)V")
   public void method418(class446 arg0, class584 arg1, class606 arg2, boolean arg3, int arg4, class648 arg5, int[][][] arg6) {
      this.field189 = arg0;
      this.field185.method8177(arg1);
      this.field186.method8645(arg2);
      this.field187 = arg3;
      this.field188 = arg4;
      this.field191 = this.field189.method2823().field671;
      this.method425(arg5, arg6);
   }

   @deob.ObfuscatedName("aat.n(FLml;[[[II)V")
   public void method187(float arg0, class648 arg1, int[][][] arg2) {
      if (this.field189 != null) {
         this.method425(arg1, arg2);
         class606 var4 = this.method419();
         this.field193.method8626(var4, this.field3939.method6330());
         var4.method8654();
         this.field184.method8177(this.field189.method2823().method1232());
         this.field3939.method6290(true, arg0, this.field190, this.field3939.method6418(), this.field184, this.field192);
      }
   }

   @deob.ObfuscatedName("aat.w(I)Lkx;")
   private class606 method419() {
      class606 var1 = class606.method8604(this.field186);
      if (this.field187) {
         class584 var2 = this.field189.method2798();
         if (var2.method8157() < (float)this.field188) {
            var2 = class584.method8136(0.0F, 0.0F, 1.0F);
            class606 var3 = this.field189.method2797();
            var2.method8150(var3);
         }

         var2.field5330 = 0.0F;
         float var4 = (float)Math.atan2((double)var2.field5328, (double)var2.field5331);
         var2.method8201();
         class606 var5 = new class606();
         var5.method8612(0.0F, 1.0F, 0.0F, var4);
         var1.method8622(var5);
      }

      return var1;
   }

   @deob.ObfuscatedName("aat.q(Lml;[[[II)V")
   private void method425(class648 arg0, int[][][] arg1) {
      if (this.method195() && (this.field3939.method6335() || this.field3939.method6336())) {
         class606 var3 = this.method419();
         if (this.field3939.method6336() && arg1 != null) {
         }

         var3.method8654();
      }

   }

   @deob.ObfuscatedName("aat.k(I)Z")
   public boolean method195() {
      return !Float.isNaN(this.field190.field5328);
   }

   @deob.ObfuscatedName("aat.d(S)Lkb;")
   public class584 method188() {
      class584 var1 = class584.method8135(this.field185);
      var1.method8150(this.field193);
      class584 var2 = class584.method8149(this.field190, var1);
      var1.method8201();
      return var2;
   }

   @deob.ObfuscatedName("aat.b(B)Lade;")
   public class88 method190() {
      class584 var1 = this.method188();
      class88 var2 = new class88(this.field191, (int)var1.field5328, (int)var1.field5330, (int)var1.field5331);
      var1.method8201();
      return var2;
   }

   @deob.ObfuscatedName("aat.y(I)Lkb;")
   public class584 method420() {
      return this.field190;
   }

   @deob.ObfuscatedName("aat.j(I)Lkb;")
   public class584 method421() {
      return this.field185;
   }

   @deob.ObfuscatedName("aat.f(I)F")
   public float method422() {
      return class652.method8030(this.field186);
   }

   @deob.ObfuscatedName("aat.ai(I)F")
   public float method423() {
      return class652.method6135(this.field186);
   }

   @deob.ObfuscatedName("aat.r(Lfv;IIB)V")
   public void method197(class461 arg0, int arg1, int arg2) {
      class584 var4 = this.method188();
      arg0.field3806 = (int)var4.field5328 - arg1;
      arg0.field3807 = (int)(-var4.field5330);
      arg0.field3805 = (int)var4.field5331 - arg2;
      var4.method8201();
   }

   @deob.ObfuscatedName("aat.p(Laen;I)V")
   public void method207(class124 arg0) {
      class455 var2 = class455.method5179(arg0.method1688());
      int var3 = arg0.method1587();
      this.field185.method8140(arg0);
      this.field186.method8609(arg0);
      if (arg0.method1688() == 1) {
         this.field187 = true;
      } else {
         this.field187 = false;
      }

      this.field188 = arg0.method1587();
      this.field189 = this.field3939.method6318().method6263(var2, var3);
   }
}
