@deob.ObfuscatedName("ka")
public class class583 {
   @deob.ObfuscatedName("ka.n")
   public static final class583 field5325 = new class583();
   @deob.ObfuscatedName("ka.r")
   public float field5313;
   @deob.ObfuscatedName("ka.k")
   public float field5314;
   @deob.ObfuscatedName("ka.d")
   public float field5315;
   @deob.ObfuscatedName("ka.u")
   public float field5316;
   @deob.ObfuscatedName("ka.v")
   public float field5317;
   @deob.ObfuscatedName("ka.p")
   public float field5318;
   @deob.ObfuscatedName("ka.o")
   public float field5319;
   @deob.ObfuscatedName("ka.a")
   public float field5320;
   @deob.ObfuscatedName("ka.b")
   public float field5321;
   @deob.ObfuscatedName("ka.x")
   public float field5322;
   @deob.ObfuscatedName("ka.l")
   public float field5323;
   @deob.ObfuscatedName("ka.s")
   public float field5324;

   public class583() {
      this.method8059();
   }

   public class583(class583 arg0) {
      this.method8089(arg0);
   }

   @deob.ObfuscatedName("ka.n(Lka;)V")
   public void method8089(class583 arg0) {
      this.field5314 = arg0.field5314;
      this.field5313 = arg0.field5313;
      this.field5320 = arg0.field5320;
      this.field5323 = arg0.field5323;
      this.field5315 = arg0.field5315;
      this.field5318 = arg0.field5318;
      this.field5322 = arg0.field5322;
      this.field5316 = arg0.field5316;
      this.field5321 = arg0.field5321;
      this.field5319 = arg0.field5319;
      this.field5324 = arg0.field5324;
      this.field5317 = arg0.field5317;
   }

   @deob.ObfuscatedName("ka.k(Lkr;)V")
   public void method8110(class600 arg0) {
      this.method8066(arg0.field5447);
      this.method8083(arg0.field5446);
   }

   @deob.ObfuscatedName("ka.d(Lkr;)V")
   public void method8075(class600 arg0) {
      float var2 = arg0.field5447.field5481 * arg0.field5447.field5481;
      float var3 = arg0.field5447.field5481 * arg0.field5447.field5478;
      float var4 = arg0.field5447.field5481 * arg0.field5447.field5475;
      float var5 = arg0.field5447.field5481 * arg0.field5447.field5480;
      float var6 = arg0.field5447.field5478 * arg0.field5447.field5478;
      float var7 = arg0.field5447.field5478 * arg0.field5447.field5475;
      float var8 = arg0.field5447.field5480 * arg0.field5447.field5478;
      float var9 = arg0.field5447.field5475 * arg0.field5447.field5475;
      float var10 = arg0.field5447.field5480 * arg0.field5447.field5475;
      float var11 = arg0.field5447.field5480 * arg0.field5447.field5480;
      this.field5314 = var2 + var6 - var11 - var9;
      this.field5315 = var5 + var7 + var7 + var5;
      this.field5321 = var8 - var4 - var4 + var8;
      this.field5313 = var7 - var5 - var5 + var7;
      this.field5318 = var2 + var9 - var6 - var11;
      this.field5319 = var3 + var10 + var10 + var3;
      this.field5320 = var4 + var8 + var8 + var4;
      this.field5322 = var10 - var3 - var3 + var10;
      this.field5324 = var2 + var11 - var9 - var6;
      this.field5323 = arg0.field5446.field5328;
      this.field5316 = arg0.field5446.field5330;
      this.field5317 = arg0.field5446.field5331;
   }

   @deob.ObfuscatedName("ka.b()V")
   public void method8059() {
      this.field5317 = 0.0F;
      this.field5316 = 0.0F;
      this.field5323 = 0.0F;
      this.field5322 = 0.0F;
      this.field5320 = 0.0F;
      this.field5319 = 0.0F;
      this.field5313 = 0.0F;
      this.field5321 = 0.0F;
      this.field5315 = 0.0F;
      this.field5324 = 1.0F;
      this.field5318 = 1.0F;
      this.field5314 = 1.0F;
   }

   @deob.ObfuscatedName("ka.r(FFFFFFFFF)V")
   public void method8060(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
      float var10 = arg3 - arg0;
      float var11 = arg4 - arg1;
      float var12 = arg5 - arg2;
      float var13 = arg7 * var12 - arg8 * var11;
      float var14 = arg8 * var10 - arg6 * var12;
      float var15 = arg6 * var11 - arg7 * var10;
      float var16 = (float)(1.0D / Math.sqrt((double)(var15 * var15 + var13 * var13 + var14 * var14)));
      float var17 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + var10 * var10 + var11 * var11)));
      this.field5314 = var13 * var16;
      this.field5313 = var14 * var16;
      this.field5320 = var15 * var16;
      this.field5321 = var10 * var17;
      this.field5319 = var11 * var17;
      this.field5324 = var12 * var17;
      this.field5315 = this.field5320 * this.field5319 - this.field5324 * this.field5313;
      this.field5318 = this.field5324 * this.field5314 - this.field5321 * this.field5320;
      this.field5322 = this.field5321 * this.field5313 - this.field5319 * this.field5314;
      this.field5323 = -(this.field5320 * arg2 + this.field5314 * arg0 + this.field5313 * arg1);
      this.field5316 = -(this.field5322 * arg2 + this.field5318 * arg1 + this.field5315 * arg0);
      this.field5317 = -(this.field5324 * arg2 + this.field5321 * arg0 + this.field5319 * arg1);
   }

   @deob.ObfuscatedName("ka.p(IIIFFF)V")
   public void method8061(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
      if (arg0 != 0) {
         float var7 = class586.field5341[arg0 & 16383];
         float var8 = class586.field5340[arg0 & 16383];
         this.field5324 = 1.0F;
         this.field5322 = 0.0F;
         this.field5320 = 0.0F;
         this.field5319 = 0.0F;
         this.field5321 = 0.0F;
         this.field5314 = var7 * 2.0F * (float)arg1;
         this.field5318 = var7 * 2.0F * (float)arg2;
         this.field5315 = var8 * 2.0F * (float)arg1;
         this.field5313 = var8 * -2.0F * (float)arg2;
         this.field5323 = (var8 * 0.5F - var7 * 0.5F) * (float)(arg1 * 2) + arg3;
         this.field5316 = (var8 * -0.5F - var7 * 0.5F) * (float)(arg2 * 2) + arg4;
         this.field5317 = arg5;
      } else {
         this.field5322 = 0.0F;
         this.field5320 = 0.0F;
         this.field5319 = 0.0F;
         this.field5313 = 0.0F;
         this.field5321 = 0.0F;
         this.field5315 = 0.0F;
         this.field5314 = (float)(arg1 * 2);
         this.field5318 = (float)(arg2 * 2);
         this.field5324 = 1.0F;
         this.field5323 = arg3 - (float)arg1;
         this.field5316 = arg4 - (float)arg2;
         this.field5317 = arg5;
      }

   }

   @deob.ObfuscatedName("ka.o(FFFFFFFFF)V")
   public void method8062(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
      this.field5314 = arg0;
      this.field5313 = arg3;
      this.field5320 = arg6;
      this.field5323 = 0.0F;
      this.field5315 = arg1;
      this.field5318 = arg4;
      this.field5322 = arg7;
      this.field5316 = 0.0F;
      this.field5321 = arg2;
      this.field5319 = arg5;
      this.field5324 = arg8;
      this.field5317 = 0.0F;
   }

   @deob.ObfuscatedName("ka.a(Lka;)V")
   public void method8063(class583 arg0) {
      if (this == arg0) {
         this.method8130();
      } else {
         this.field5314 = arg0.field5314;
         this.field5313 = arg0.field5315;
         this.field5320 = arg0.field5321;
         this.field5315 = arg0.field5313;
         this.field5318 = arg0.field5318;
         this.field5322 = arg0.field5319;
         this.field5321 = arg0.field5320;
         this.field5319 = arg0.field5322;
         this.field5324 = arg0.field5324;
         this.field5323 = -(this.field5320 * arg0.field5317 + this.field5314 * arg0.field5323 + this.field5313 * arg0.field5316);
         this.field5316 = -(this.field5322 * arg0.field5317 + this.field5318 * arg0.field5316 + this.field5315 * arg0.field5323);
         this.field5317 = -(this.field5324 * arg0.field5317 + this.field5321 * arg0.field5323 + this.field5319 * arg0.field5316);
      }

   }

   @deob.ObfuscatedName("ka.x()V")
   public void method8130() {
      float var1 = this.field5323;
      float var2 = this.field5316;
      float var3 = this.field5313;
      this.field5313 = this.field5315;
      this.field5315 = var3;
      float var4 = this.field5320;
      this.field5320 = this.field5321;
      this.field5321 = var4;
      float var5 = this.field5322;
      this.field5322 = this.field5319;
      this.field5319 = var5;
      this.field5323 = -(this.field5320 * this.field5317 + this.field5314 * var1 + this.field5313 * var2);
      this.field5316 = -(this.field5322 * this.field5317 + this.field5318 * var2 + this.field5315 * var1);
      this.field5317 = -(this.field5324 * this.field5317 + this.field5321 * var1 + this.field5319 * var2);
   }

   @deob.ObfuscatedName("ka.s(FFFF)V")
   public void method8128(float arg0, float arg1, float arg2, float arg3) {
      float var5 = (float)Math.cos((double)arg3);
      float var6 = (float)Math.sin((double)arg3);
      this.field5314 = arg0 * arg0 * (1.0F - var5) + var5;
      this.field5315 = arg0 * arg1 * (1.0F - var5) + arg2 * var6;
      this.field5321 = arg0 * arg2 * (1.0F - var5) + -arg1 * var6;
      this.field5313 = arg0 * arg1 * (1.0F - var5) + -arg2 * var6;
      this.field5318 = arg1 * arg1 * (1.0F - var5) + var5;
      this.field5319 = arg1 * arg2 * (1.0F - var5) + arg0 * var6;
      this.field5320 = arg0 * arg2 * (1.0F - var5) + arg1 * var6;
      this.field5322 = arg1 * arg2 * (1.0F - var5) + -arg0 * var6;
      this.field5324 = arg2 * arg2 * (1.0F - var5) + var5;
      this.field5317 = 0.0F;
      this.field5316 = 0.0F;
      this.field5323 = 0.0F;
   }

   @deob.ObfuscatedName("ka.l(Lkx;)V")
   public void method8066(class606 arg0) {
      this.method8067(arg0.field5478, arg0.field5475, arg0.field5480, arg0.field5481);
   }

   @deob.ObfuscatedName("ka.u(FFFF)V")
   private void method8067(float arg0, float arg1, float arg2, float arg3) {
      float var5 = arg0 * arg0;
      float var6 = arg0 * arg1;
      float var7 = arg0 * arg2;
      float var8 = arg0 * arg3;
      float var9 = arg1 * arg1;
      float var10 = arg1 * arg2;
      float var11 = arg1 * arg3;
      float var12 = arg2 * arg2;
      float var13 = arg2 * arg3;
      this.field5314 = 1.0F - (var9 + var12) * 2.0F;
      this.field5313 = (var6 - var13) * 2.0F;
      this.field5320 = (var7 + var11) * 2.0F;
      this.field5315 = (var6 + var13) * 2.0F;
      this.field5318 = 1.0F - (var5 + var12) * 2.0F;
      this.field5322 = (var10 - var8) * 2.0F;
      this.field5321 = (var7 - var11) * 2.0F;
      this.field5319 = (var8 + var10) * 2.0F;
      this.field5324 = 1.0F - (var5 + var9) * 2.0F;
      this.field5317 = 0.0F;
      this.field5316 = 0.0F;
      this.field5323 = 0.0F;
   }

   @deob.ObfuscatedName("ka.v(FFFF)V")
   public void method8126(float arg0, float arg1, float arg2, float arg3) {
      float var5 = (float)Math.cos((double)arg3);
      float var6 = (float)Math.sin((double)arg3);
      float var7 = arg0 * arg0 * (1.0F - var5) + var5;
      float var8 = arg0 * arg1 * (1.0F - var5) + arg2 * var6;
      float var9 = arg0 * arg2 * (1.0F - var5) + -arg1 * var6;
      float var10 = arg0 * arg1 * (1.0F - var5) + -arg2 * var6;
      float var11 = arg1 * arg1 * (1.0F - var5) + var5;
      float var12 = arg1 * arg2 * (1.0F - var5) + arg0 * var6;
      float var13 = arg0 * arg2 * (1.0F - var5) + arg1 * var6;
      float var14 = arg1 * arg2 * (1.0F - var5) + -arg0 * var6;
      float var15 = arg2 * arg2 * (1.0F - var5) + var5;
      float var16 = this.field5314;
      float var17 = this.field5315;
      float var18 = this.field5313;
      float var19 = this.field5318;
      float var20 = this.field5320;
      float var21 = this.field5322;
      float var22 = this.field5323;
      float var23 = this.field5316;
      this.field5314 = this.field5321 * var13 + var7 * var16 + var10 * var17;
      this.field5315 = this.field5321 * var14 + var8 * var16 + var11 * var17;
      this.field5321 = this.field5321 * var15 + var9 * var16 + var12 * var17;
      this.field5313 = this.field5319 * var13 + var7 * var18 + var10 * var19;
      this.field5318 = this.field5319 * var14 + var8 * var18 + var11 * var19;
      this.field5319 = this.field5319 * var15 + var9 * var18 + var12 * var19;
      this.field5320 = this.field5324 * var13 + var7 * var20 + var10 * var21;
      this.field5322 = this.field5324 * var14 + var8 * var20 + var11 * var21;
      this.field5324 = this.field5324 * var15 + var9 * var20 + var12 * var21;
      this.field5323 = this.field5317 * var13 + var7 * var22 + var10 * var23;
      this.field5316 = this.field5317 * var14 + var8 * var22 + var11 * var23;
      this.field5317 = this.field5317 * var15 + var9 * var22 + var12 * var23;
   }

   @deob.ObfuscatedName("ka.g(FFF)V")
   public void method8069(float arg0, float arg1, float arg2) {
      this.field5314 = arg0;
      this.field5313 = 0.0F;
      this.field5320 = 0.0F;
      this.field5323 = 0.0F;
      this.field5315 = 0.0F;
      this.field5318 = arg1;
      this.field5322 = 0.0F;
      this.field5316 = 0.0F;
      this.field5321 = 0.0F;
      this.field5319 = 0.0F;
      this.field5324 = arg2;
      this.field5317 = 0.0F;
   }

   @deob.ObfuscatedName("ka.h(FFF)V")
   public void method8070(float arg0, float arg1, float arg2) {
      this.field5314 *= arg0;
      this.field5313 *= arg0;
      this.field5320 *= arg0;
      this.field5323 *= arg0;
      this.field5315 *= arg1;
      this.field5318 *= arg1;
      this.field5322 *= arg1;
      this.field5316 *= arg1;
      this.field5321 *= arg2;
      this.field5319 *= arg2;
      this.field5324 *= arg2;
      this.field5317 *= arg2;
   }

   @deob.ObfuscatedName("ka.e(FFF)V")
   public void method8071(float arg0, float arg1, float arg2) {
      this.field5322 = 0.0F;
      this.field5320 = 0.0F;
      this.field5319 = 0.0F;
      this.field5313 = 0.0F;
      this.field5321 = 0.0F;
      this.field5315 = 0.0F;
      this.field5324 = 1.0F;
      this.field5318 = 1.0F;
      this.field5314 = 1.0F;
      this.field5323 = arg0;
      this.field5316 = arg1;
      this.field5317 = arg2;
   }

   @deob.ObfuscatedName("ka.z(Lkb;)V")
   public void method8083(class584 arg0) {
      this.method8072(arg0.field5328, arg0.field5330, arg0.field5331);
   }

   @deob.ObfuscatedName("ka.m(FFF)V")
   public void method8072(float arg0, float arg1, float arg2) {
      this.field5323 += arg0;
      this.field5316 += arg1;
      this.field5317 += arg2;
   }

   @deob.ObfuscatedName("ka.i(Lka;)V")
   public void method8054(class583 arg0) {
      float var2 = this.field5314;
      float var3 = this.field5315;
      float var4 = this.field5313;
      float var5 = this.field5318;
      float var6 = this.field5320;
      float var7 = this.field5322;
      float var8 = this.field5323;
      float var9 = this.field5316;
      float var10 = this.field5321;
      float var11 = this.field5319;
      float var12 = this.field5324;
      float var13 = this.field5317;
      this.field5314 = arg0.field5320 * var10 + arg0.field5314 * var2 + arg0.field5313 * var3;
      this.field5315 = arg0.field5322 * var10 + arg0.field5318 * var3 + arg0.field5315 * var2;
      this.field5321 = arg0.field5324 * var10 + arg0.field5321 * var2 + arg0.field5319 * var3;
      this.field5313 = arg0.field5320 * var11 + arg0.field5314 * var4 + arg0.field5313 * var5;
      this.field5318 = arg0.field5322 * var11 + arg0.field5318 * var5 + arg0.field5315 * var4;
      this.field5319 = arg0.field5324 * var11 + arg0.field5321 * var4 + arg0.field5319 * var5;
      this.field5320 = arg0.field5320 * var12 + arg0.field5314 * var6 + arg0.field5313 * var7;
      this.field5322 = arg0.field5322 * var12 + arg0.field5318 * var7 + arg0.field5315 * var6;
      this.field5324 = arg0.field5324 * var12 + arg0.field5321 * var6 + arg0.field5319 * var7;
      this.field5323 = arg0.field5320 * var13 + arg0.field5314 * var8 + arg0.field5313 * var9 + arg0.field5323;
      this.field5316 = arg0.field5322 * var13 + arg0.field5318 * var9 + arg0.field5315 * var8 + arg0.field5316;
      this.field5317 = arg0.field5324 * var13 + arg0.field5321 * var8 + arg0.field5319 * var9 + arg0.field5317;
   }

   @deob.ObfuscatedName("ka.t(Lka;Lka;)V")
   public void method8074(class583 arg0, class583 arg1) {
      this.field5314 = arg0.field5321 * arg1.field5320 + arg0.field5315 * arg1.field5313 + arg0.field5314 * arg1.field5314;
      this.field5315 = arg0.field5321 * arg1.field5322 + arg0.field5315 * arg1.field5318 + arg0.field5314 * arg1.field5315;
      this.field5321 = arg0.field5321 * arg1.field5324 + arg0.field5315 * arg1.field5319 + arg0.field5314 * arg1.field5321;
      this.field5313 = arg0.field5319 * arg1.field5320 + arg0.field5318 * arg1.field5313 + arg0.field5313 * arg1.field5314;
      this.field5318 = arg0.field5319 * arg1.field5322 + arg0.field5318 * arg1.field5318 + arg0.field5313 * arg1.field5315;
      this.field5319 = arg0.field5319 * arg1.field5324 + arg0.field5318 * arg1.field5319 + arg0.field5313 * arg1.field5321;
      this.field5320 = arg0.field5324 * arg1.field5320 + arg0.field5322 * arg1.field5313 + arg0.field5320 * arg1.field5314;
      this.field5322 = arg0.field5324 * arg1.field5322 + arg0.field5322 * arg1.field5318 + arg0.field5320 * arg1.field5315;
      this.field5324 = arg0.field5324 * arg1.field5324 + arg0.field5322 * arg1.field5319 + arg0.field5320 * arg1.field5321;
      this.field5323 = arg0.field5317 * arg1.field5320 + arg0.field5323 * arg1.field5314 + arg0.field5316 * arg1.field5313 + arg1.field5323;
      this.field5316 = arg0.field5317 * arg1.field5322 + arg0.field5323 * arg1.field5315 + arg0.field5316 * arg1.field5318 + arg1.field5316;
      this.field5317 = arg0.field5317 * arg1.field5324 + arg0.field5323 * arg1.field5321 + arg0.field5316 * arg1.field5319 + arg1.field5317;
   }

   @deob.ObfuscatedName("ka.c(FFF[F)V")
   public void method8123(float arg0, float arg1, float arg2, float[] arg3) {
      arg3[0] = this.field5320 * arg2 + this.field5314 * arg0 + this.field5313 * arg1 + this.field5323;
      arg3[1] = this.field5322 * arg2 + this.field5318 * arg1 + this.field5315 * arg0 + this.field5316;
      arg3[2] = this.field5324 * arg2 + this.field5321 * arg0 + this.field5319 * arg1 + this.field5317;
   }

   @deob.ObfuscatedName("ka.w(FFF[F)V")
   public void method8076(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = arg0 - this.field5323;
      float var6 = arg1 - this.field5316;
      float var7 = arg2 - this.field5317;
      arg3[0] = (float)((int)(this.field5321 * var7 + this.field5315 * var6 + this.field5314 * var5));
      arg3[1] = (float)((int)(this.field5319 * var7 + this.field5318 * var6 + this.field5313 * var5));
      arg3[2] = (float)((int)(this.field5324 * var7 + this.field5322 * var6 + this.field5320 * var5));
   }

   @deob.ObfuscatedName("ka.q([F)V")
   public void method8121(float[] arg0) {
      float var2 = arg0[0] - this.field5323;
      float var3 = arg0[1] - this.field5316;
      float var4 = arg0[2] - this.field5317;
      arg0[0] = (float)((int)(this.field5321 * var4 + this.field5315 * var3 + this.field5314 * var2));
      arg0[1] = (float)((int)(this.field5319 * var4 + this.field5318 * var3 + this.field5313 * var2));
      arg0[2] = (float)((int)(this.field5324 * var4 + this.field5322 * var3 + this.field5320 * var2));
   }

   @deob.ObfuscatedName("ka.y([F)V")
   public void method8078(float[] arg0) {
      float var2 = arg0[0];
      float var3 = arg0[1];
      float var4 = arg0[2];
      arg0[0] = this.field5321 * var4 + this.field5315 * var3 + this.field5314 * var2;
      arg0[1] = this.field5319 * var4 + this.field5318 * var3 + this.field5313 * var2;
      arg0[2] = this.field5324 * var4 + this.field5322 * var3 + this.field5320 * var2;
   }

   @deob.ObfuscatedName("ka.j([F)[F")
   public float[] method8079(float[] arg0) {
      arg0[0] = this.field5323;
      arg0[1] = this.field5316;
      arg0[2] = this.field5317;
      return arg0;
   }

   public String toString() {
      return this.field5314 + "," + this.field5313 + "," + this.field5320 + "," + this.field5323 + " - " + this.field5315 + "," + this.field5318 + "," + this.field5322 + "," + this.field5316 + " - " + this.field5321 + "," + this.field5319 + "," + this.field5324 + "," + this.field5317;
   }
}
