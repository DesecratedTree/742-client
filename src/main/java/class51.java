@deob.ObfuscatedName("abv")
public abstract class class51 extends class486 {
   @deob.ObfuscatedName("abv.av")
   private static final class597 field372 = new class597();
   @deob.ObfuscatedName("abv.af")
   private float[] field374 = new float[3];
   @deob.ObfuscatedName("abv.ax")
   private class597[] field373;
   @deob.ObfuscatedName("abv.ai")
   private int field345;
   @deob.ObfuscatedName("abv.d")
   private class225 field346;
   @deob.ObfuscatedName("abv.b")
   private class225 field347;
   @deob.ObfuscatedName("abv.p")
   private class225 field348;
   @deob.ObfuscatedName("abv.a")
   private class225 field349;
   @deob.ObfuscatedName("abv.o")
   private class225 field350;
   @deob.ObfuscatedName("abv.v")
   private class225 field352;
   @deob.ObfuscatedName("abv.s")
   private class225 field353;
   @deob.ObfuscatedName("abv.l")
   private class225 field354;
   @deob.ObfuscatedName("abv.u")
   private class225 field355;
   @deob.ObfuscatedName("abv.r")
   private class225 field356;
   @deob.ObfuscatedName("abv.x")
   private class225 field357;
   @deob.ObfuscatedName("abv.e")
   private class225 field358;
   @deob.ObfuscatedName("abv.g")
   private class225 field359;
   @deob.ObfuscatedName("abv.z")
   private class225 field360;
   @deob.ObfuscatedName("abv.m")
   private class225 field361;
   @deob.ObfuscatedName("abv.h")
   private class225 field364;
   @deob.ObfuscatedName("abv.k")
   protected class434 field363;
   @deob.ObfuscatedName("abv.ap")
   private int[] field371;

   protected class51(class979 arg0) {
      super(arg0);
      new class583();
      this.field373 = new class597[this.field3940.field10099];

      for(int var2 = 0; var2 < this.field3940.field10099; ++var2) {
         this.field373[var2] = new class597();
      }

   }

   @deob.ObfuscatedName("abv.ah(Ljava/lang/String;)Z")
   protected boolean method764(String arg0) throws class185 {
      this.field363 = this.field3940.method2579(arg0);
      if (this.field363 == null) {
         throw new class185("");
      } else {
         this.field346 = this.field363.method6100("textureMatrix");
         this.field347 = this.field363.method6100("modelMatrix");
         this.field356 = this.field363.method6100("viewMatrix");
         this.field348 = this.field363.method6100("projectionMatrix");
         this.field349 = this.field363.method6100("modelViewMatrix");
         this.field357 = this.field363.method6100("modelViewProjectionMatrix");
         this.field353 = this.field363.method6100("viewProjectionMatrix");
         this.field359 = this.field363.method6100("ambientColour");
         this.field360 = this.field363.method6100("sunDirection");
         this.field364 = this.field363.method6100("sunColour");
         this.field358 = this.field363.method6100("antiSunColour");
         this.field361 = this.field363.method6100("sunExponent");
         this.field354 = this.field363.method6100("eyePosition");
         this.field355 = this.field363.method6100("eyePositionOS");
         this.field352 = this.field363.method6100("sunDirectionOS");
         if (!this.method813()) {
            this.field363 = null;
            this.field346 = null;
            this.field347 = null;
            this.field356 = null;
            this.field348 = null;
            this.field349 = null;
            this.field357 = null;
            this.field353 = null;
            this.field359 = null;
            this.field360 = null;
            this.field364 = null;
            this.field358 = null;
            this.field361 = null;
            this.field354 = null;
            this.field355 = null;
            this.field352 = null;
            return false;
         } else {
            if (this.field363.method6017() == null) {
               class422 var2 = this.field363.method6074();
               if (var2 == null) {
                  throw new class185(this.field363.method6012() + "");
               }

               this.field363.method267(var2);
            }

            this.field345 = this.field363.method6014();
            this.field371 = new int[this.field345];
            return true;
         }
      }
   }

   @deob.ObfuscatedName("abv.n()V")
   public void method766() {
      this.field363.method264();
      this.field371[this.field363.method6018()] = -1;
      this.method778(0);
      this.method767();
   }

   @deob.ObfuscatedName("abv.al()V")
   private void method767() {
      this.method807(this.field3940.field10004);
      this.method769(this.field3940.method16466());
      this.method770();
      this.method781();
   }

   @deob.ObfuscatedName("abv.k()V")
   public void method768() {
      if (this.field363 != null) {
         this.field363.method254();
      }

   }

   @deob.ObfuscatedName("abv.an(Lko;)V")
   protected void method769(class597 arg0) {
      if (this.field363 != null && this.field363.method255() && this.field3940.method16382() == 0) {
         int var2 = this.field363.method6018();
         if ((this.field371[var2] & 128) != 0 && this.field346 != null) {
            this.field363.method6028(this.field346, arg0);
            this.field371[var2] &= -129;
         }
      }

   }

   @deob.ObfuscatedName("abv.ag()V")
   private void method770() {
      if (this.field363 != null && this.field363.method255()) {
         int var1 = this.field363.method6018();
         int var2 = this.field371[var1];
         if ((var2 & 1) != 0 && this.field347 != null) {
            this.field363.method6076(this.field347, this.field3940.method16378());
         }

         if ((var2 & 2) != 0) {
            if (this.field356 != null) {
               this.field363.method6076(this.field356, this.field3940.method16403());
            }

            if (this.field354 != null) {
               this.field374[0] = 0.0F;
               this.field374[1] = 0.0F;
               this.field374[2] = 0.0F;
               this.field3940.method7544().method8076(this.field374[0], this.field374[1], this.field374[2], this.field374);
               this.field363.method6022(this.field354, this.field374[0], this.field374[1], this.field374[2]);
            }
         }

         if ((var2 & 16) != 0 && this.field349 != null) {
            this.field363.method6076(this.field349, this.field3940.method16335());
         }

         if ((var2 & 8) != 0 && this.field350 != null) {
            this.field363.method6076(this.field350, this.field3940.method16331());
         }

         if ((var2 & 4) != 0 && this.field348 != null) {
            this.field363.method6076(this.field348, this.field3940.method16508());
         }

         if ((var2 & 32) != 0 && this.field357 != null) {
            field372.method8387(this.field3940.method16335(), this.field3940.method16508());
            this.field363.method6076(this.field357, field372);
         }

         if ((var2 & 64) != 0 && this.field353 != null) {
            field372.method8387(this.field3940.method16403(), this.field3940.method16508());
            this.field363.method6076(this.field353, field372);
         }

         if (this.field3940.method16382() == 0 && (this.field371[var1] & 128) != 0 && this.field346 != null) {
            this.field363.method6028(this.field346, this.field3940.method16466());
            this.field371[var1] &= -129;
         }

         this.field371[var1] = 0;
      }

   }

   @deob.ObfuscatedName("abv.ak(ILka;)V")
   private void method771(int arg0, class583 arg1) {
      if (this.field355 != null) {
         class597 var3 = this.field3940.method16331();
         float[] var4 = new float[]{var3.field5413[12], var3.field5413[13], var3.field5413[14]};
         float[] var5 = new float[]{0.0F, 0.0F, 0.0F};
         var3.method8420(var5);
         float[] var6 = new float[]{0.0F, 0.0F, 0.0F};
         this.field3940.method7544().method8123(0.0F, 0.0F, 0.0F, var6);
         arg1.method8121(var4);
         this.field363.method6022(this.field355, var4[0], var4[1], var4[2]);
      }

   }

   @deob.ObfuscatedName("abv.aa(ILka;)V")
   private void method772(int arg0, class583 arg1) {
      if (this.field352 != null) {
         float[] var3 = new float[]{this.field3940.field10042[0], this.field3940.field10042[1], this.field3940.field10042[2]};
         arg1.method8078(var3);
         this.field363.method6022(this.field352, var3[0], var3[1], var3[2]);
      }

   }

   @deob.ObfuscatedName("abv.ao(Z)V")
   protected void method807(boolean arg0) {
      if (this.field363 != null && this.field363.method255()) {
         if (this.field359 != null) {
            this.field363.method6022(this.field359, this.field3940.field10050 * this.field3940.field10047, this.field3940.field10050 * this.field3940.field10048, this.field3940.field10058 * this.field3940.field10050);
         }

         if (this.field360 != null) {
            this.field363.method6022(this.field360, this.field3940.field10042[0], this.field3940.field10042[1], this.field3940.field10042[2]);
         }

         if (this.field364 != null) {
            this.field363.method6022(this.field364, this.field3940.field10051 * this.field3940.field10047, this.field3940.field10051 * this.field3940.field10048, this.field3940.field10058 * this.field3940.field10051);
         }

         if (this.field358 != null) {
            this.field363.method6022(this.field358, -this.field3940.field10047 * this.field3940.field9996, -this.field3940.field10048 * this.field3940.field9996, -this.field3940.field10058 * this.field3940.field9996);
         }

         if (this.field361 != null) {
            this.field363.method6020(this.field361, 64.0F + Math.abs(this.field3940.field10042[1]) * 928.0F);
         }
      }

   }

   @deob.ObfuscatedName("abv.r()V")
   public void method781() {
   }

   @deob.ObfuscatedName("abv.ab(I)V")
   private void method775(int arg0) {
      for(int var2 = 0; var2 < this.field345; ++var2) {
         this.field371[var2] |= 128 << arg0;
      }

   }

   @deob.ObfuscatedName("abv.ae(Lka;)V")
   private void method773(class583 arg0) {
      class597 var2 = this.field3940.field9995;
      var2.method8391(arg0);
      int var3 = this.field363.method6018();
      if (this.field347 != null) {
         this.field363.method6076(this.field347, var2);
         this.field371[var3] &= -2;
      }

      if (this.field349 != null) {
         field372.method8387(var2, this.field3940.method16403());
         this.field363.method6076(this.field349, field372);
         this.field371[var3] &= -17;
      }

      if (this.field357 != null) {
         field372.method8387(var2, this.field3940.method16336());
         this.field363.method6076(this.field357, field372);
         this.field371[var3] &= -33;
      }

      this.method771(var3, arg0);
      this.method772(var3, arg0);
   }

   @deob.ObfuscatedName("abv.o()V")
   public void method777() {
      this.method773(class583.field5325);
   }

   @deob.ObfuscatedName("abv.az(I)V")
   private void method778(int arg0) {
      this.field373[0].method8480();
      this.method775(arg0);
   }

   @deob.ObfuscatedName("abv.aw()Z")
   protected abstract boolean method813() throws class185;
}
