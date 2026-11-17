@deob.ObfuscatedName("kt")
public class class602 {
   @deob.ObfuscatedName("kt.n")
   private final class584[] field5451 = new class584[4];
   @deob.ObfuscatedName("kt.k")
   private float field5452;
   @deob.ObfuscatedName("kt.d")
   private float[] field5453;

   public class602() {
      for(int var1 = 0; var1 < 4; ++var1) {
         this.field5451[var1] = new class584();
      }

      this.method8570();
   }

   @deob.ObfuscatedName("kt.n()V")
   private void method8570() {
      this.field5452 = -1.0F;
      this.field5453 = null;
   }

   @deob.ObfuscatedName("kt.k(ILkb;)V")
   public void method8557(int arg0, class584 arg1) {
      this.field5451[arg0].method8177(arg1);
      this.method8570();
   }

   @deob.ObfuscatedName("kt.d(I)Lkb;")
   public class584 method8558(int arg0) {
      return this.field5451[arg0];
   }

   @deob.ObfuscatedName("kt.b(F)Lkb;")
   public class584 method8574(float arg0) {
      class584 var2 = new class584();
      float var3 = arg0 * arg0;
      float var4 = arg0 * var3;
      float var5 = (this.field5451[1].field5328 - this.field5451[0].field5328) * 3.0F;
      float var6 = (this.field5451[2].field5328 - this.field5451[1].field5328) * 3.0F - var5;
      float var7 = this.field5451[3].field5328 - this.field5451[0].field5328 - var5 - var6;
      var2.field5328 = arg0 * var5 + var3 * var6 + var4 * var7 + this.field5451[0].field5328;
      float var8 = (this.field5451[1].field5330 - this.field5451[0].field5330) * 3.0F;
      float var9 = (this.field5451[2].field5330 - this.field5451[1].field5330) * 3.0F - var8;
      float var10 = this.field5451[3].field5330 - this.field5451[0].field5330 - var8 - var9;
      var2.field5330 = arg0 * var8 + var3 * var9 + var4 * var10 + this.field5451[0].field5330;
      float var11 = (this.field5451[1].field5331 - this.field5451[0].field5331) * 3.0F;
      float var12 = (this.field5451[2].field5331 - this.field5451[1].field5331) * 3.0F - var11;
      float var13 = this.field5451[3].field5331 - this.field5451[0].field5331 - var11 - var12;
      var2.field5331 = arg0 * var11 + var3 * var12 + var4 * var13 + this.field5451[0].field5331;
      return var2;
   }

   @deob.ObfuscatedName("kt.r()F")
   public float method8560() {
      if (this.field5452 == -1.0F) {
         this.method8562();
      }

      return this.field5452;
   }

   @deob.ObfuscatedName("kt.p(F)F")
   public float method8568(float arg0) {
      if (this.field5452 == -1.0F) {
         this.method8562();
      }

      if (arg0 <= 0.0F) {
         return 0.0F;
      } else if (arg0 >= this.field5452) {
         return 1.0F;
      } else {
         float var2 = 0.0F;
         float var3 = this.field5453[0];

         for(int var4 = 0; var4 < this.field5453.length; ++var4) {
            if (arg0 < var3) {
               float var5 = (arg0 - var2) / (var3 - var2);
               float var6 = (float)(var4 - 1) / (float)this.field5453.length;
               float var7 = (float)var4 / (float)this.field5453.length;
               return (var7 - var6) * var5 + var6;
            }

            var2 = var3;
            var3 += this.field5453[var4];
         }

         float var8 = (arg0 - var2) / (var3 - var2);
         float var9 = (float)(this.field5453.length - 1) / (float)this.field5453.length;
         return (1.0F - var9) * var8 + var9;
      }
   }

   @deob.ObfuscatedName("kt.o()V")
   private void method8562() {
      byte var1 = 20;
      class584 var2 = this.method8574(0.0F);
      float var3 = 0.0F;

      for(int var4 = 1; var4 <= var1; ++var4) {
         class584 var5 = this.method8574((float)var4 / (float)var1);
         var3 += class584.method8152(var5, var2).method8157();
         var2 = var5;
      }

      int var6 = (int)(var3 / 20.0F);
      if (var6 < var1) {
         var6 = var1;
      }

      this.field5453 = new float[var6];
      class584 var7 = this.method8574(0.0F);
      float var8 = 0.0F;

      for(int var9 = 1; var9 <= var6; ++var9) {
         class584 var10 = this.method8574((float)var9 / (float)var6);
         float var11 = class584.method8152(var10, var7).method8157();
         var8 += var11;
         this.field5453[var9 - 1] = var11;
         var7 = var10;
      }

      this.field5452 = var8;
   }
}
