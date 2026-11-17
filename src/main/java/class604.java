@deob.ObfuscatedName("kv")
public class class604 {
   @deob.ObfuscatedName("kv.n")
   private class602[] field5473 = new class602[1];
   @deob.ObfuscatedName("kv.k")
   private float[] field5472 = new float[2];

   public class604(class124 arg0) {
      int var2 = arg0.method1604();
      this.field5473[0] = new class602();
      this.field5473[0].method8557(0, new class584(arg0));
      this.field5473[0].method8557(1, new class584(arg0));
      this.field5472[0] = arg0.method1660();
      this.field5473[0].method8557(3, new class584(arg0));
      this.field5473[0].method8557(2, new class584(arg0));
      this.field5472[1] = arg0.method1660();

      for(int var3 = 2; var3 < var2; ++var3) {
         class584 var4 = new class584(arg0);
         class584 var5 = new class584(arg0);
         this.method8582(var4, var5, arg0.method1660());
      }

   }

   @deob.ObfuscatedName("kv.n(Lkb;Lkb;F)V")
   private void method8582(class584 arg0, class584 arg1, float arg2) {
      class602[] var4 = new class602[this.field5473.length + 1];
      System.arraycopy(this.field5473, 0, var4, 0, this.field5473.length);
      class602 var5 = new class602();
      class602 var6 = this.field5473[this.field5473.length - 1];
      var5.method8557(0, var6.method8558(3));
      class584 var7 = class584.method8152(var6.method8558(3), var6.method8558(2));
      var5.method8557(1, class584.method8149(var6.method8558(3), var7));
      var5.method8557(3, arg0);
      var5.method8557(2, arg1);
      var4[var4.length - 1] = var5;
      this.field5473 = var4;
      float[] var8 = new float[this.field5472.length + 1];
      System.arraycopy(this.field5472, 0, var8, 0, this.field5472.length);
      var8[var8.length - 1] = arg2;
      this.field5472 = var8;
   }

   @deob.ObfuscatedName("kv.k(I)F")
   private float method8581(int arg0) {
      return this.field5472[arg0];
   }

   @deob.ObfuscatedName("kv.d()F")
   public float method8593() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 < this.field5473.length; ++var2) {
         var1 += this.field5473[var2].method8560();
      }

      return var1;
   }

   @deob.ObfuscatedName("kv.b(F)Lkb;")
   public class584 method8587(float arg0) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.field5473.length; ++var4) {
         var3 += this.field5473[var4].method8560();
         if (arg0 < var3) {
            float var5 = this.field5473[var4].method8568(arg0 - var2);
            return this.field5473[var4].method8574(var5);
         }

         var2 = var3;
      }

      return this.field5473[this.field5473.length - 1].method8574(1.0F);
   }

   @deob.ObfuscatedName("kv.r(F)F")
   public float method8583(float arg0) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.field5473.length; ++var4) {
         var3 += this.field5473[var4].method8560();
         if (arg0 < var3) {
            return this.field5473[var4].method8568(arg0 - var2) + (float)var4;
         }

         var2 = var3;
      }

      return (float)this.field5473.length;
   }

   @deob.ObfuscatedName("kv.p(F)Lkb;")
   public class584 method8584(float arg0) {
      int var2 = (int)arg0;
      return var2 < this.field5473.length ? this.field5473[var2].method8574(arg0 - (float)var2) : this.field5473[this.field5473.length - 1].method8574(1.0F);
   }

   @deob.ObfuscatedName("kv.o(F)F")
   public float method8585(float arg0) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      float var4 = this.method8581(0);
      float var5 = 0.0F;

      for(int var6 = 0; var6 < this.field5473.length; ++var6) {
         var3 += this.field5473[var6].method8560();
         float var7 = this.method8581(var6 + 1);
         if (arg0 < var3) {
            float var8 = (arg0 - var2) / (var3 - var2);
            float var9 = var7 - var4;
            if ((double)var9 > 3.141592653589793D) {
               var9 -= 6.2831855F;
            } else if ((double)var9 < -3.141592653589793D) {
               var9 += 6.2831855F;
            }

            return var8 * var9 + var4;
         }

         var2 = var3;
         var4 = var7;
      }

      return this.field5472[this.field5472.length - 1];
   }

   @deob.ObfuscatedName("kv.a(F)F")
   public float method8586(float arg0) {
      int var2 = (int)arg0;
      if (var2 + 1 < this.field5472.length) {
         float var3 = this.field5472[var2];
         float var4 = this.field5472[var2 + 1];
         float var5 = arg0 - (float)var2;
         return (1.0F - var5) * var3 + var4 * var5;
      } else {
         return this.field5472[this.field5472.length - 1];
      }
   }
}
