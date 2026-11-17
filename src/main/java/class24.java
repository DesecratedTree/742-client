@deob.ObfuscatedName("aav")
public class class24 extends class489 {
   @deob.ObfuscatedName("aav.u")
   private class383 field194;
   @deob.ObfuscatedName("aav.a")
   private class383 field195;
   @deob.ObfuscatedName("aav.o")
   protected class383 field196;
   @deob.ObfuscatedName("aav.s")
   private class383 field197;
   @deob.ObfuscatedName("aav.x")
   private class383 field198;
   @deob.ObfuscatedName("aav.l")
   private class383 field199;

   public class24(class612 arg0, class612 arg1, class38 arg2) {
      super(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("aav.n(I)V")
   public void method383() {
      super.method383();
      class38 var1 = (class38)this.field3947;
      this.field196 = class585.method2314(this.field3949, var1.field270);
      this.field195 = class585.method2314(this.field3949, var1.field268);
      this.field198 = class585.method2314(this.field3949, var1.field269);
      this.field197 = class585.method2314(this.field3949, var1.field271);
      this.field199 = class585.method2314(this.field3949, var1.field267);
      this.field194 = class585.method2314(this.field3949, var1.field272);
   }

   @deob.ObfuscatedName("aav.x(ZIII)V")
   protected void method374(boolean arg0, int arg1, int arg2) {
      if (arg0) {
         int[] var4 = new int[4];
         Statics.field8847.method7511(var4);
         Statics.field8847.method7716(arg1, arg2, this.field3947.field4357 + arg1, this.field3947.field4358 + arg2);
         int var5 = this.field198.method5259();
         int var6 = this.field198.method5213();
         int var7 = this.field197.method5259();
         int var8 = this.field197.method5213();
         this.field198.method5221(arg1, (this.field3947.field4358 - var6) / 2 + arg2);
         this.field197.method5221(this.field3947.field4357 + arg1 - var7, (this.field3947.field4358 - var8) / 2 + arg2);
         Statics.field8847.method7716(arg1, arg2, this.field3947.field4357 + arg1, arg2 + this.field199.method5213());
         this.field199.method5235(arg1 + var5, arg2, this.field3947.field4357 - var5 - var7, this.field3947.field4358);
         int var9 = this.field194.method5213();
         Statics.field8847.method7716(arg1, this.field3947.field4358 + arg2 - var9, this.field3947.field4357 + arg1, this.field3947.field4358 + arg2);
         this.field194.method5235(arg1 + var5, this.field3947.field4358 + arg2 - var9, this.field3947.field4357 - var5 - var7, this.field3947.field4358);
         Statics.field8847.method7716(var4[0], var4[1], var4[2], var4[3]);
      }

   }

   @deob.ObfuscatedName("aav.s(ZIII)V")
   protected void method373(boolean arg0, int arg1, int arg2) {
      int var4 = arg1 + this.field198.method5259();
      int var5 = this.field3947.field4357 + arg1 - this.field197.method5259();
      int var6 = arg2 + this.field199.method5213();
      int var7 = this.field3947.field4358 + arg2 - this.field194.method5213();
      int var8 = var5 - var4;
      int var9 = var7 - var6;
      int var10 = this.method6885() * var8 / 10000;
      int[] var11 = new int[4];
      Statics.field8847.method7511(var11);
      Statics.field8847.method7716(var4, var6, var4 + var10, var7);
      this.method440(var4, var6, var8, var9);
      Statics.field8847.method7716(var4 + var10, var6, var5, var7);
      this.field195.method5235(var4, var6, var8, var9);
      Statics.field8847.method7716(var11[0], var11[1], var11[2], var11[3]);
   }

   @deob.ObfuscatedName("aav.e(IIIIB)V")
   protected void method440(int arg0, int arg1, int arg2, int arg3) {
      this.field196.method5235(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("aav.d(B)Z")
   public boolean method384() {
      if (!super.method384()) {
         return false;
      } else {
         class38 var1 = (class38)this.field3947;
         if (!this.field3949.method8790(var1.field270)) {
            return false;
         } else if (!this.field3949.method8790(var1.field268)) {
            return false;
         } else if (!this.field3949.method8790(var1.field269)) {
            return false;
         } else if (!this.field3949.method8790(var1.field271)) {
            return false;
         } else if (!this.field3949.method8790(var1.field267)) {
            return false;
         } else {
            return this.field3949.method8790(var1.field272);
         }
      }
   }
}
