@deob.ObfuscatedName("abj")
public class class39 extends class499 {
   @deob.ObfuscatedName("abj.b")
   public static float field274 = 0.25F;
   @deob.ObfuscatedName("abj.r")
   public static float field275 = 1.0F;
   @deob.ObfuscatedName("abj.p")
   public static float field280 = 1.0F;
   @deob.ObfuscatedName("abj.o")
   public static float field276 = 1.0F;
   @deob.ObfuscatedName("abj.z")
   private class225 field273;
   @deob.ObfuscatedName("abj.e")
   private class225 field277;
   @deob.ObfuscatedName("abj.g")
   private class225 field284;
   @deob.ObfuscatedName("abj.h")
   private class225 field286;
   @deob.ObfuscatedName("abj.m")
   private class225 field288;
   @deob.ObfuscatedName("abj.i")
   private class225 field290;
   @deob.ObfuscatedName("abj.s")
   private class422 field279;
   @deob.ObfuscatedName("abj.l")
   private class422 field281;
   @deob.ObfuscatedName("abj.u")
   private class422 field282;
   @deob.ObfuscatedName("abj.v")
   private class422 field283;
   @deob.ObfuscatedName("abj.x")
   private class422 field289;
   @deob.ObfuscatedName("abj.a")
   private class434 field285;
   @deob.ObfuscatedName("abj.t")
   private boolean field287;

   public class39(class979 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("abj.ap()Z")
   private boolean method611() {
      return this.field4023.field10111 && this.field4023.method2498();
   }

   @deob.ObfuscatedName("abj.n()Z")
   public boolean method597() {
      return this.field287;
   }

   @deob.ObfuscatedName("abj.k()Z")
   public boolean method598() {
      if (this.method611()) {
         this.field285 = this.field4023.method2579("FilterBloom");
         if (this.field285 == null) {
            return false;
         } else {
            try {
               this.field284 = this.field285.method6037("sceneTex");
               this.field286 = this.field285.method6037("bloomTex1");
               this.field277 = this.field285.method6037("params");
               this.field273 = this.field285.method6037("sampleSize");
               this.field288 = this.field285.method6037("pixelOffsetAndBloomScale");
               this.field290 = this.field285.method6037("PosAndTexCoords");
               this.field285.method6039("test");
               this.field289 = this.field285.method6039("techFullscreenTri");
               this.field279 = this.field285.method6039("brightpass");
               this.field281 = this.field285.method6039("blur");
               this.field282 = this.field285.method6039("composite");
               this.field283 = this.field285.method6039("techDefault");
            } catch (class283 var3) {
               return false;
            } catch (class295 var4) {
               return false;
            }

            if (!this.field289.method284()) {
               return false;
            } else if (!this.field279.method284()) {
               return false;
            } else if (!this.field281.method284()) {
               return false;
            } else if (!this.field282.method284()) {
               return false;
            } else if (!this.field283.method284()) {
               return false;
            } else {
               this.field287 = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("abj.r(II)V")
   public void method603(int arg0, int arg1) {
   }

   @deob.ObfuscatedName("abj.b()V")
   public void method599() {
   }

   @deob.ObfuscatedName("abj.a()I")
   public int method600() {
      return 4;
   }

   @deob.ObfuscatedName("abj.p(ILym;Lhr;Ldh;Lhr;)V")
   public void method601(int arg0, class973 arg1, class511 arg2, class393 arg3, class511 arg4) {
      float var6 = this.field4023.method2510();
      float var7 = (float)arg1.method566();
      float var8 = (float)arg1.method559();
      class511 var9 = arg2;
      float var10 = var6 * 2.0F / var7;
      float var11 = -var6 * 2.0F / var8;
      float[] var12 = new float[]{var10 + -1.0F, var11 + 1.0F, 0.0F, 0.0F, var10 + -1.0F, var11 + -3.0F, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F};
      int var13 = (int)var7;
      int var14 = (int)var8;
      int var15 = var13;
      int var16 = var14;
      if (arg0 == 0) {
         var13 = 256;
         var14 = 256;
         this.field285.method267(this.field279);
         this.field285.method264();
      } else if (arg0 == 1) {
         var13 = 256;
         var14 = 256;
         var15 = var13;
         var16 = var14;
         this.field285.method267(this.field281);
         this.field285.method264();
         this.field285.method6098(this.field273, field276 / var7, 0.0F);
      } else if (arg0 == 2) {
         var13 = 256;
         var14 = 256;
         var15 = var13;
         var16 = var14;
         this.field285.method267(this.field281);
         this.field285.method264();
         this.field285.method6098(this.field273, 0.0F, field276 / var8);
      } else if (arg0 == 3) {
         this.field285.method267(this.field282);
         var9 = arg4;
         this.field285.method6030(this.field286, 1, arg2);
         this.field285.method264();
      }

      float var17 = (float)var13 / var7;
      float var18 = (float)var14 / var8;
      float var19 = (float)var15 / var7;
      float var20 = (float)var16 / var8;
      var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
      var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
      var12[10] *= var19;
      var12[7] *= var20;
      this.field285.method6029(this.field290, var12);
      this.field285.method6030(this.field284, 0, var9);
      this.field285.method6023(this.field277, field280, field274, field275, 0.0F);
      this.field285.method6023(this.field288, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8);
      this.field4023.method7505(0, 0, var13, var14);
      this.field4023.method7716(0, 0, var13, var14);
   }

   @deob.ObfuscatedName("abj.o(I)V")
   public void method602(int arg0) {
      this.field285.method254();
   }

   @deob.ObfuscatedName("abj.x()I")
   public int method595() {
      return 1;
   }
}
