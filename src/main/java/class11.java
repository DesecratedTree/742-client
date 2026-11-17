@deob.ObfuscatedName("aai")
public class class11 extends class447 {
   @deob.ObfuscatedName("aai.ac")
   private final class597 field128 = new class597();
   @deob.ObfuscatedName("aai.ay")
   private final class422[] field129 = new class422[19];
   @deob.ObfuscatedName("aai.bf")
   private final int[][] field103 = new int[19][17];
   @deob.ObfuscatedName("aai.y")
   private class434 field122;
   @deob.ObfuscatedName("aai.bp")
   private int[] field131;

   public class11(class979 arg0) throws class185 {
      super(arg0);
      this.method276();
   }

   @deob.ObfuscatedName("aai.ap(B)Z")
   private boolean method276() throws class185 {
      this.field122 = this.field3684.method2579("Model");
      class225 var1 = this.field122.method6037("DiffuseSampler");
      class225 var2 = this.field122.method6037("EnvironmentSampler");
      class225 var3 = this.field122.method6037("PointLightsPosAndRadiusSq");
      class225 var4 = this.field122.method6037("PointLightsDiffuseColour");
      class225 var5 = this.field122.method6037("WVPMatrix");
      class225 var6 = this.field122.method6037("TexCoordMatrix");
      class225 var7 = this.field122.method6037("HeightFogPlane");
      class225 var8 = this.field122.method6037("HeightFogColour");
      class225 var9 = this.field122.method6037("DistanceFogPlane");
      class225 var10 = this.field122.method6037("DistanceFogColour");
      class225 var11 = this.field122.method6037("SunDir");
      class225 var12 = this.field122.method6037("SunColour");
      class225 var13 = this.field122.method6037("AntiSunColour");
      class225 var14 = this.field122.method6037("AmbientColour");
      class225 var15 = this.field122.method6037("EyePos");
      class225 var16 = this.field122.method6037("SpecularExponent");
      class225 var17 = this.field122.method6037("WorldMatrix");
      this.field129[0] = this.field122.method6039("Unlit");
      this.field129[1] = this.field122.method6039("Unlit_IgnoreAlpha");
      this.field129[17] = this.field122.method6039("UnderwaterGround");
      this.field129[18] = this.field122.method6039("UnderwaterGroundSpecular");

      for(int var18 = 0; var18 <= 4; ++var18) {
         this.field129[var18 + 2] = this.field122.method6039("Standard_" + var18 + "PointLights");
         this.field129[var18 + 7] = this.field122.method6039("Specular_" + var18 + "PointLights");
         this.field129[var18 + 12] = this.field122.method6039("EnvironmentalMapping_" + var18 + "PointLights");
      }

      for(int var19 = 0; var19 < 19; ++var19) {
         int var20 = this.field122.method6016(this.field129[var19]);
         this.field103[var19][2] = var1.method3122(var20);
         this.field103[var19][3] = var2.method3122(var20);
         this.field103[var19][1] = var3.method3122(var20);
         this.field103[var19][0] = var4.method3122(var20);
         this.field103[var19][4] = var5.method3122(var20);
         this.field103[var19][5] = var6.method3122(var20);
         this.field103[var19][7] = var7.method3122(var20);
         this.field103[var19][8] = var8.method3122(var20);
         this.field103[var19][9] = var9.method3122(var20);
         this.field103[var19][10] = var10.method3122(var20);
         this.field103[var19][11] = var11.method3122(var20);
         this.field103[var19][12] = var12.method3122(var20);
         this.field103[var19][13] = var13.method3122(var20);
         this.field103[var19][14] = var14.method3122(var20);
         this.field103[var19][6] = var15.method3122(var20);
         this.field103[var19][15] = var17.method3122(var20);
         this.field103[var19][16] = var16.method3122(var20);
      }

      this.field122.method267(this.field129[2]);
      return true;
   }

   @deob.ObfuscatedName("aai.k(Lko;)V")
   public void method212(class597 arg0) {
      this.field128.method8386(arg0);
      this.field128.method8388(this.field3684.field10076);
   }

   @deob.ObfuscatedName("aai.d(Z)V")
   public void method231(boolean arg0) {
      if (arg0) {
         this.field122.method267(this.field129[1]);
      } else {
         this.field122.method267(this.field129[0]);
      }

      this.field131 = this.field103[this.field122.method6018()];
      this.field122.method264();
      this.field122.method6066(this.field131[2], 0, this.field3687);
      this.field122.method6099(this.field131[4], this.field128);
      this.field122.method6040(this.field131[5], this.field3696);
      this.field122.method6035(this.field131[7], this.field3689.field5411, this.field3689.field5410, this.field3689.field5412, this.field3689.field5409);
      this.field122.method6031(this.field131[8], this.field3694.field5328, this.field3694.field5330, this.field3694.field5331);
      this.field122.method6035(this.field131[9], this.field3695.field5411, this.field3695.field5410, this.field3695.field5412, this.field3695.field5409);
      this.field122.method6031(this.field131[10], this.field3685.field5328, this.field3685.field5330, this.field3685.field5331);
      this.field3684.method2577(class522.field4132, this.field3702, this.field3703, this.field3686, this.field3705);
   }

   @deob.ObfuscatedName("aai.o()V")
   public void method218() {
      this.field122.method267(this.field129[17]);
      this.field131 = this.field103[this.field122.method6018()];
      this.field122.method264();
      this.method277(0);
   }

   @deob.ObfuscatedName("aai.a()V")
   public void method216() {
      this.field122.method267(this.field129[18]);
      this.field131 = this.field103[this.field122.method6018()];
      this.field122.method264();
      this.field122.method6031(this.field131[6], this.field3698.field5328, this.field3698.field5330, this.field3698.field5331);
      this.field122.method6035(this.field131[16], this.field3691, this.field3692, 0.0F, 0.0F);
      this.method277(0);
   }

   @deob.ObfuscatedName("aai.av(II)V")
   private void method277(int arg0) {
      this.field122.method6066(this.field131[2], 0, this.field3687);
      this.field122.method6099(this.field131[4], this.field128);
      this.field122.method6040(this.field131[5], this.field3696);
      this.field122.method6035(this.field131[7], this.field3689.field5411, this.field3689.field5410, this.field3689.field5412, this.field3689.field5409);
      this.field122.method6031(this.field131[8], this.field3694.field5328, this.field3694.field5330, this.field3694.field5331);
      this.field122.method6035(this.field131[9], this.field3695.field5411, this.field3695.field5410, this.field3695.field5412, this.field3695.field5409);
      this.field122.method6031(this.field131[10], this.field3685.field5328, this.field3685.field5330, this.field3685.field5331);
      this.field122.method6052(this.field131[11], this.field3697);
      this.field122.method6052(this.field131[12], this.field3688);
      this.field122.method6052(this.field131[13], this.field3699);
      this.field122.method6052(this.field131[14], this.field3690);
      if (arg0 > 0) {
         this.field122.method6032(this.field131[1], this.field3700, arg0 * 4);
         this.field122.method6032(this.field131[0], this.field3704, arg0 * 4);
      }

      this.field3684.method2577(class522.field4132, this.field3702, this.field3703, this.field3686, this.field3705);
   }

   @deob.ObfuscatedName("aai.b(I)V")
   public void method215(int arg0) {
      this.field122.method267(this.field129[arg0 + 2]);
      this.field131 = this.field103[this.field122.method6018()];
      this.field122.method264();
      this.method277(arg0);
   }

   @deob.ObfuscatedName("aai.r(I)V")
   public void method222(int arg0) {
      this.field122.method267(this.field129[arg0 + 7]);
      this.field131 = this.field103[this.field122.method6018()];
      this.field122.method264();
      this.field122.method6031(this.field131[6], this.field3698.field5328, this.field3698.field5330, this.field3698.field5331);
      this.field122.method6035(this.field131[16], this.field3691, this.field3692, 0.0F, 0.0F);
      this.method277(arg0);
   }

   @deob.ObfuscatedName("aai.p(I)V")
   public void method217(int arg0) {
      this.field122.method267(this.field129[arg0 + 12]);
      this.field131 = this.field103[this.field122.method6018()];
      this.field122.method264();
      this.field122.method6025(this.field131[15], this.field3701);
      this.field122.method6031(this.field131[6], this.field3698.field5328, this.field3698.field5330, this.field3698.field5331);
      this.field122.method6066(this.field131[3], 1, this.field3683);
      this.method277(arg0);
   }
}
