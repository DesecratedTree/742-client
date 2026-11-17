@deob.ObfuscatedName("aak")
public abstract class class13 extends class485 {
   @deob.ObfuscatedName("aak.d")
   protected float field145 = 0.0F;
   @deob.ObfuscatedName("aak.b")
   private float field147 = 0.0F;
   @deob.ObfuscatedName("aak.k")
   private class604 field146;

   public class13(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("aak.c(Lkv;II)V")
   public void method348(class604 arg0, int arg1) {
      this.field146 = arg0;
      this.field145 = 0.0F;
      this.field147 = 0.0F;
   }

   @deob.ObfuscatedName("aak.n(FLml;[[[II)V")
   public void method187(float arg0, class648 arg1, int[][][] arg2) {
      float var4 = this.field146.method8593();
      if (!(this.field145 >= var4)) {
         this.field147 = this.method349(var4, this.field147, arg0);
         this.field145 += this.field147;
         if (this.field145 > var4) {
            this.field145 = var4;
         }

      }
   }

   @deob.ObfuscatedName("aak.k(I)Z")
   public boolean method195() {
      return this.field146 != null;
   }

   @deob.ObfuscatedName("aak.d(S)Lkb;")
   public class584 method188() {
      return class584.method8135(this.field146.method8587(this.field145));
   }

   @deob.ObfuscatedName("aak.b(B)Lade;")
   public class88 method190() {
      class584 var1 = this.field146.method8587(this.field145);
      return new class88(0, (int)var1.field5328, (int)var1.field5330, (int)var1.field5331);
   }

   @deob.ObfuscatedName("aak.q(S)F")
   public float method350() {
      return this.field146.method8583(this.field145);
   }

   @deob.ObfuscatedName("aak.r(Lfv;IIB)V")
   public void method197(class461 arg0, int arg1, int arg2) {
      class584 var4 = this.field146.method8587(this.field145);
      arg0.field3806 = (int)var4.field5328 - arg1;
      arg0.field3807 = (int)(-var4.field5330);
      arg0.field3805 = (int)var4.field5331 - arg2;
   }

   @deob.ObfuscatedName("aak.p(Laen;I)V")
   public void method207(class124 arg0) {
      this.field146 = new class604(arg0);
      this.field145 = 0.0F;
      this.field147 = 0.0F;
   }

   @deob.ObfuscatedName("aak.w(FFFS)F")
   protected abstract float method349(float arg0, float arg1, float arg2);
}
