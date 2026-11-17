@deob.ObfuscatedName("ahj")
public class class201 extends class51 {
   @deob.ObfuscatedName("ahj.ak")
   public final class597 field1314 = new class597();
   @deob.ObfuscatedName("ahj.ao")
   public final class597 field1321 = new class597();
   @deob.ObfuscatedName("ahj.ae")
   private final float[] field1330 = new float[4];
   @deob.ObfuscatedName("ahj.aq")
   private final float[] field1319 = new float[4];
   @deob.ObfuscatedName("ahj.at")
   private final class481 field1313;
   @deob.ObfuscatedName("ahj.ar")
   private float field1326;
   @deob.ObfuscatedName("ahj.am")
   public int field1320;
   @deob.ObfuscatedName("ahj.as")
   public int field1327;
   @deob.ObfuscatedName("ahj.au")
   public int field1328;
   @deob.ObfuscatedName("ahj.ad")
   public int field1329;
   @deob.ObfuscatedName("ahj.aw")
   private class225 field1315;
   @deob.ObfuscatedName("ahj.ag")
   private class225 field1318;
   @deob.ObfuscatedName("ahj.ab")
   private class225 field1322;
   @deob.ObfuscatedName("ahj.ah")
   private class225 field1323;
   @deob.ObfuscatedName("ahj.az")
   private class225 field1324;
   @deob.ObfuscatedName("ahj.aa")
   private class225 field1325;
   @deob.ObfuscatedName("ahj.al")
   private class422 field1316;
   @deob.ObfuscatedName("ahj.an")
   private class422 field1317;

   public class201(class979 arg0, class481 arg1) throws class185 {
      super(arg0);
      this.field1313 = arg1;
      if (this.field1313.method6772() && arg0.method2631()) {
         this.method764("Waterfall");
      }

   }

   @deob.ObfuscatedName("ahj.aw()Z")
   protected boolean method813() throws class185 {
      this.field1325 = this.field363.method6037("WorldMatrix");
      this.field1318 = this.field363.method6037("WVPMatrix");
      this.field1322 = this.field363.method6037("UGenerationPlane");
      this.field1324 = this.field363.method6037("VGenerationPlane");
      this.field1323 = this.field363.method6037("Time");
      this.field1315 = this.field363.method6037("billowSampler3D");
      if (this.field1313.field3894) {
         this.field1316 = this.field363.method6039("Waterfall3D");
         this.field363.method267(this.field1316);
      } else {
         this.field1317 = this.field363.method6039("Waterfall2D");
         this.field363.method267(this.field1317);
      }

      return true;
   }

   @deob.ObfuscatedName("ahj.bn(III)V")
   public void method2834(int arg0, int arg1) {
      float var3 = (float)((arg0 & 3) + 1) * -5.0E-4F;
      float var4 = (float)((arg0 >> 3 & 3) + 1) * 5.0E-4F;
      float var5 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
      boolean var6 = (arg0 & 128) != 0;
      if (var6) {
         this.field1330[0] = var5;
         this.field1330[1] = 0.0F;
         this.field1330[2] = 0.0F;
         this.field1330[3] = 0.0F;
      } else {
         this.field1330[0] = 0.0F;
         this.field1330[1] = 0.0F;
         this.field1330[2] = var5;
         this.field1330[3] = 0.0F;
      }

      this.field1319[0] = 0.0F;
      this.field1319[1] = var5;
      this.field1319[2] = 0.0F;
      this.field1319[3] = (float)this.field3940.field10104 * var3 % 1.0F;
      if (!this.field1313.field3894) {
         int var7 = (int)((float)this.field3940.field10104 * var4 * 16.0F);
         this.field3940.method16470(this.field1313.field3897[var7 % 16]);
      } else {
         this.field1326 = (float)((double)var4 * (double)this.field3940.field10104 % 1.0D);
      }

   }

   @deob.ObfuscatedName("ahj.bk(I)V")
   public void method2833() {
      if (this.field1313.field3894) {
         this.field363.method267(this.field1316);
      } else {
         this.field363.method267(this.field1317);
      }

      this.field363.method264();
      if (this.field1313.field3894) {
         this.field363.method6030(this.field1315, 0, this.field1313.field3890);
      }

      this.field363.method6076(this.field1325, this.field1321);
      this.field363.method6076(this.field1318, this.field1314);
      this.field363.method6043(this.field1322, new class595(this.field1330[0], this.field1330[1], this.field1330[2], this.field1330[3]));
      this.field363.method6043(this.field1324, new class595(this.field1319[0], this.field1319[1], this.field1319[2], this.field1319[3]));
      this.field363.method6043(this.field1323, new class595(this.field1326, 0.0F, 0.0F, 0.0F));
      this.field3940.method2577(class522.field4132, this.field1327, this.field1328, this.field1329 * 3, this.field1320);
   }
}
