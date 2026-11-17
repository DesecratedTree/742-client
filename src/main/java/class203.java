@deob.ObfuscatedName("ahl")
public class class203 extends class51 {
   @deob.ObfuscatedName("ahl.ag")
   public final class597 field1358 = new class597();
   @deob.ObfuscatedName("ahl.aa")
   public final class597 field1339 = new class597();
   @deob.ObfuscatedName("ahl.ab")
   public final class584 field1341 = new class584();
   @deob.ObfuscatedName("ahl.aq")
   private final class595 field1344 = new class595();
   @deob.ObfuscatedName("ahl.as")
   private final class595 field1346 = new class595();
   @deob.ObfuscatedName("ahl.ad")
   private final class595 field1348 = new class595();
   @deob.ObfuscatedName("ahl.aj")
   public final class595 field1361 = new class595();
   @deob.ObfuscatedName("ahl.ay")
   public final class584 field1352 = new class584();
   @deob.ObfuscatedName("ahl.bp")
   public final class595 field1354 = new class595();
   @deob.ObfuscatedName("ahl.br")
   public final class584 field1356 = new class584();
   @deob.ObfuscatedName("ahl.bq")
   private float field1340 = 0.0F;
   @deob.ObfuscatedName("ahl.ah")
   private final class481 field1360;
   @deob.ObfuscatedName("ahl.by")
   private boolean field1362;
   @deob.ObfuscatedName("ahl.at")
   private final boolean field1355;
   @deob.ObfuscatedName("ahl.bg")
   public int field1332;
   @deob.ObfuscatedName("ahl.bc")
   public int field1337;
   @deob.ObfuscatedName("ahl.ae")
   public int field1342;
   @deob.ObfuscatedName("ahl.bw")
   public int field1353;
   @deob.ObfuscatedName("ahl.ba")
   public int field1357;
   @deob.ObfuscatedName("ahl.ao")
   private class225 field1333;
   @deob.ObfuscatedName("ahl.aw")
   private class225 field1334;
   @deob.ObfuscatedName("ahl.al")
   private class225 field1335;
   @deob.ObfuscatedName("ahl.an")
   private class225 field1336;
   @deob.ObfuscatedName("ahl.au")
   private class225 field1338;
   @deob.ObfuscatedName("ahl.az")
   private class225 field1343;
   @deob.ObfuscatedName("ahl.ar")
   private class225 field1345;
   @deob.ObfuscatedName("ahl.bf")
   private class225 field1347;
   @deob.ObfuscatedName("ahl.am")
   private class225 field1349;
   @deob.ObfuscatedName("ahl.ak")
   private class225 field1350;
   @deob.ObfuscatedName("ahl.bs")
   private class225 field1351;
   @deob.ObfuscatedName("ahl.ac")
   private class225 field1359;
   @deob.ObfuscatedName("ahl.bx")
   private class422 field1363;

   public class203(class979 arg0, class481 arg1, boolean arg2) throws class185 {
      super(arg0);
      new class597();
      this.field1360 = arg1;
      this.field1362 = arg2;
      if (arg0.method2631() && arg0.method2498()) {
         this.field1355 = this.method764("EnvMappedWater");
      } else {
         this.field1355 = false;
      }

   }

   @deob.ObfuscatedName("ahl.aw()Z")
   protected boolean method813() throws class185 {
      if (!this.field1360.method6779()) {
         return false;
      } else {
         this.field1334 = this.field363.method6037("NormalSampler");
         this.field1335 = this.field363.method6037("EnvMapSampler");
         this.field1336 = this.field363.method6037("WVPMatrix");
         this.field1350 = this.field363.method6037("TexCoordMatrix");
         this.field1333 = this.field363.method6037("EyePosAndTime");
         this.field1343 = this.field363.method6037("SunDirectionAndExponent");
         this.field1345 = this.field363.method6037("SunColourAndWaveExponent");
         this.field1338 = this.field363.method6037("WaveIntensityAndBreakWaterDepthAndOffset");
         this.field1349 = this.field363.method6037("HeightFogPlane");
         this.field1359 = this.field363.method6037("HeightFogColour");
         this.field1347 = this.field363.method6037("DistanceFogPlane");
         this.field1351 = this.field363.method6037("DistanceFogColour");
         this.field1363 = this.field363.method6039(this.field1362 ? "EnvMappedSea" : "EnvMappedWater");
         this.field363.method267(this.field1363);
         return true;
      }
   }

   @deob.ObfuscatedName("ahl.bn(I)Z")
   public boolean method2840() {
      return this.field1355;
   }

   @deob.ObfuscatedName("ahl.an(Lko;)V")
   protected void method769(class597 arg0) {
      class597 var2 = new class597();
      var2.method8392(this.field1340, this.field1340, 1.0F, 1.0F);
      var2.method8387(arg0, var2);
      super.method769(var2);
   }

   @deob.ObfuscatedName("ahl.ao(Z)V")
   protected void method807(boolean arg0) {
      float var2 = 1.0F + (1.0F - Math.abs(this.field3940.field10042[1])) * 2.0F;
      float var3 = this.field3940.field10051;
      this.field3940.field10051 *= var2;
      super.method807(arg0);
      this.field3940.field10051 = var3;
   }

   @deob.ObfuscatedName("ahl.bk(I)V")
   public void method2841() {
      this.method2842();
      this.field363.method267(this.field1363);
      this.field363.method264();
      this.field363.method6030(this.field1334, 0, this.field1360.field3898);
      this.field363.method6030(this.field1335, 1, this.field3940.method16497());
      this.field363.method6076(this.field1336, this.field1358);
      this.field363.method6028(this.field1350, this.field1339);
      int var1 = 1 << (this.field1342 & 3);
      this.field363.method6023(this.field1333, this.field1341.field5328, this.field1341.field5330, this.field1341.field5331, (float)(this.field3940.field10104 * var1 % 40000) / 40000.0F);
      this.field363.method6043(this.field1343, this.field1344);
      this.field363.method6043(this.field1345, this.field1346);
      this.field363.method6043(this.field1338, this.field1348);
      this.field363.method6043(this.field1349, this.field1361);
      this.field363.method6024(this.field1359, this.field1352);
      this.field363.method6043(this.field1347, this.field1354);
      this.field363.method6024(this.field1351, this.field1356);
      this.field3940.method2577(class522.field4132, this.field1357, this.field1332, this.field1337, this.field1353);
   }

   @deob.ObfuscatedName("ahl.bo(I)V")
   private void method2842() {
      this.field1340 = 2.4414062E-4F;
      short var1 = 256;
      float var2 = 0.3F;
      float var3 = 0.4F;
      float var4 = 0.1F;
      byte var5 = 5;
      this.field1339.method8392(this.field1340, this.field1340, this.field1340, this.field1340);
      this.field1344.method8356(-this.field3940.field10042[0], -this.field3940.field10042[1], -this.field3940.field10042[2], 32.0F);
      this.field1346.method8356(this.field3940.field10047, this.field3940.field10048, this.field3940.field10058, (float)var5);
      this.field1348.method8356(var4, var3, (float)var1, var2);
   }
}
