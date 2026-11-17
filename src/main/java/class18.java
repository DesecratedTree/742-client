@deob.ObfuscatedName("aap")
public class class18 extends class489 {
   @deob.ObfuscatedName("aap.o")
   private class383 field181;

   public class18(class612 arg0, class612 arg1, class36 arg2) {
      super(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("aap.n(I)V")
   public void method383() {
      super.method383();
      this.field181 = class585.method2314(this.field3949, ((class36)this.field3947).field264);
   }

   @deob.ObfuscatedName("aap.s(ZIII)V")
   protected void method373(boolean arg0, int arg1, int arg2) {
      int var4 = this.method6885() * this.field3947.field4357 / 10000;
      int[] var5 = new int[4];
      Statics.field8847.method7511(var5);
      Statics.field8847.method7716(arg1, arg2 + 2, arg1 + var4, this.field3947.field4358 + arg2);
      this.field181.method5235(arg1, arg2 + 2, this.field3947.field4357, this.field3947.field4358);
      Statics.field8847.method7716(var5[0], var5[1], var5[2], var5[3]);
   }

   @deob.ObfuscatedName("aap.x(ZIII)V")
   protected void method374(boolean arg0, int arg1, int arg2) {
      Statics.field8847.method7751(arg1 - 2, arg2, this.field3947.field4357 + 4, this.field3947.field4358 + 2, ((class36)this.field3947).field263, 0);
      Statics.field8847.method7751(arg1 - 1, arg2 + 1, this.field3947.field4357 + 2, this.field3947.field4358, 0, 0);
   }

   @deob.ObfuscatedName("aap.d(B)Z")
   public boolean method384() {
      return !super.method384() ? false : this.field3949.method8790(((class36)this.field3947).field264);
   }
}
