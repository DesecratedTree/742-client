@deob.ObfuscatedName("km")
public class class595 {
   @deob.ObfuscatedName("km.b")
   public float field5409;
   @deob.ObfuscatedName("km.k")
   public float field5410;
   @deob.ObfuscatedName("km.n")
   public float field5411;
   @deob.ObfuscatedName("km.d")
   public float field5412;

   public class595() {
      this.method8361();
   }

   public class595(float arg0, float arg1, float arg2, float arg3) {
      this.method8356(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("km.n(FFFF)V")
   public void method8356(float arg0, float arg1, float arg2, float arg3) {
      this.field5411 = arg0;
      this.field5410 = arg1;
      this.field5412 = arg2;
      this.field5409 = arg3;
   }

   @deob.ObfuscatedName("km.k(Lkm;)V")
   public void method8357(class595 arg0) {
      this.method8356(arg0.field5411, arg0.field5410, arg0.field5412, arg0.field5409);
   }

   @deob.ObfuscatedName("km.d(I)V")
   public void method8358(int arg0) {
      this.method8356((float)(arg0 >> 16 & 255) * 0.003921569F, (float)(arg0 >> 8 & 255) * 0.003921569F, (float)(arg0 >> 0 & 255) * 0.003921569F, (float)(arg0 >> 24 & 255) * 0.003921569F);
   }

   @deob.ObfuscatedName("km.b()V")
   private final void method8361() {
      this.field5409 = 0.0F;
      this.field5412 = 0.0F;
      this.field5410 = 0.0F;
      this.field5411 = 0.0F;
   }

   @deob.ObfuscatedName("km.r()V")
   public final void method8360() {
      this.field5411 = -this.field5411;
      this.field5410 = -this.field5410;
      this.field5412 = -this.field5412;
      this.field5409 = -this.field5409;
   }

   @deob.ObfuscatedName("km.p(F)V")
   public final void method8369(float arg0) {
      this.field5411 *= arg0;
      this.field5410 *= arg0;
      this.field5412 *= arg0;
      this.field5409 *= arg0;
   }

   @deob.ObfuscatedName("km.o(Lko;)V")
   public final void method8368(class597 arg0) {
      float var2 = this.field5411;
      float var3 = this.field5410;
      float var4 = this.field5412;
      float var5 = this.field5409;
      this.field5411 = arg0.field5413[12] * var5 + arg0.field5413[8] * var4 + arg0.field5413[0] * var2 + arg0.field5413[4] * var3;
      this.field5410 = arg0.field5413[13] * var5 + arg0.field5413[9] * var4 + arg0.field5413[1] * var2 + arg0.field5413[5] * var3;
      this.field5412 = arg0.field5413[14] * var5 + arg0.field5413[10] * var4 + arg0.field5413[2] * var2 + arg0.field5413[6] * var3;
      this.field5409 = arg0.field5413[15] * var5 + arg0.field5413[11] * var4 + arg0.field5413[3] * var2 + arg0.field5413[7] * var3;
   }

   public String toString() {
      return this.field5411 + "," + this.field5410 + "," + this.field5412 + "," + this.field5409;
   }
}
