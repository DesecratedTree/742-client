@deob.ObfuscatedName("aac")
public class class5 extends class485 {
   @deob.ObfuscatedName("aac.d")
   private final class584 field75 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("aac.b")
   private final class584 field77 = new class584(Float.NaN, Float.NaN, Float.NaN);
   @deob.ObfuscatedName("aac.r")
   private final class584 field74 = new class584();
   @deob.ObfuscatedName("aac.k")
   private int field76;

   public class5(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("aac.c(Lade;I)V")
   public void method205(class88 arg0) {
      this.field77.field5328 = (float)arg0.field670;
      this.field77.field5330 = (float)arg0.field669;
      this.field77.field5331 = (float)arg0.field667;
      if (Float.isNaN(this.field75.field5328)) {
         this.field75.method8177(this.field77);
         this.field74.method8143();
      }

      this.field76 = arg0.field671;
   }

   @deob.ObfuscatedName("aac.n(FLml;[[[II)V")
   public void method187(float arg0, class648 arg1, int[][][] arg2) {
      this.field3939.method6290(true, arg0, this.field75, this.field3939.method6418(), this.field77, this.field74);
   }

   @deob.ObfuscatedName("aac.k(I)Z")
   public boolean method195() {
      return !Float.isNaN(this.field75.field5328);
   }

   @deob.ObfuscatedName("aac.d(S)Lkb;")
   public class584 method188() {
      return class584.method8135(this.field75);
   }

   @deob.ObfuscatedName("aac.b(B)Lade;")
   public class88 method190() {
      return new class88(this.field76, (int)this.field75.field5328, (int)this.field75.field5330, (int)this.field75.field5331);
   }

   @deob.ObfuscatedName("aac.r(Lfv;IIB)V")
   public void method197(class461 arg0, int arg1, int arg2) {
      arg0.field3806 = (int)this.field75.field5328 - arg1;
      arg0.field3807 = (int)(-this.field75.field5330);
      arg0.field3805 = (int)this.field75.field5331 - arg2;
   }

   @deob.ObfuscatedName("aac.p(Laen;I)V")
   public void method207(class124 arg0) {
      this.field77.method8140(arg0);
   }
}
