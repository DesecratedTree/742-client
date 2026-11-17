@deob.ObfuscatedName("q")
public class class744 {
   @deob.ObfuscatedName("q.n")
   private static boolean field6856 = false;

   private class744() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ju.n(I)V")
   public static void method8021() {
      Statics.field7127 = new class8(client.field2674);
      Statics.field7127.method6291(class443.field3668);

      try {
         class5 var0 = (class5)Statics.field7127.method6293(class444.field3676, false);
         class190 var1 = (class190)Statics.field7127.method6292(class449.field3708, false);
         var0.method205(Statics.field6895.method6367());
         var1.method2467(new class606(0.0F, 0.0F, 0.0F));
      } catch (class168 var3) {
      }

      Statics.field6855 = Statics.field336.method1896();
      Statics.field7161 = Statics.field336.method1897();
      field6856 = true;
   }

   @deob.ObfuscatedName("nm.k(B)V")
   public static void method9884() {
      Statics.field7127 = null;
      field6856 = false;
   }

   @deob.ObfuscatedName("sp.d(I)Z")
   public static boolean method14383() {
      return field6856;
   }

   @deob.ObfuscatedName("jl.b(I)V")
   public static void method7968() {
      class5 var0 = (class5)Statics.field7127.method6316();
      class190 var1 = (class190)Statics.field7127.method6373();
      class584 var2 = var0.method188();
      class606 var3 = var1.method2466();
      if (client.field2601 != null) {
         int var4 = client.field2601.field3405;
         int var5 = client.field2601.field3557;
         float var6 = 1000.0F;
         float var7 = (float)(2.0D * Math.atan((double)((float)var4 / 2.0F / var6)));
         float var8 = (float)(2.0D * Math.atan((double)((float)var5 / 2.0F / var6)));

         try {
            Statics.field7127.method6306(var7, var8);
         } catch (class168 var18) {
         }
      }

      if (Statics.field336.method1894()) {
         class606 var10 = class606.method8602();
         var10.method8612(1.0F, 0.0F, 0.0F, (float)(Statics.field336.method1897() - Statics.field7161) / 200.0F);
         var3.method8622(var10);
         class584 var11 = class584.method8136(0.0F, 1.0F, 0.0F);
         var11.method8150(var3);
         class606 var12 = class606.method8602();
         var12.method8611(var11, (float)(Statics.field6855 - Statics.field336.method1896()) / 200.0F);
         var3.method8622(var12);
         var1.method2467(var3);
      }

      Statics.field6855 = Statics.field336.method1896();
      Statics.field7161 = Statics.field336.method1897();
      var3.method8616();
      if (Statics.field2111.method1803(98)) {
         class584 var13 = class584.method8136(0.0F, 0.0F, 25.0F);
         var13.method8150(var3);
         var13.field5330 *= -1.0F;
         var2.method8147(var13);
      }

      if (Statics.field2111.method1803(99)) {
         class584 var14 = class584.method8136(0.0F, 0.0F, -25.0F);
         var14.method8150(var3);
         var14.field5330 *= -1.0F;
         var2.method8147(var14);
      }

      if (Statics.field2111.method1803(96)) {
         class584 var15 = class584.method8136(-25.0F, 0.0F, 0.0F);
         var15.method8150(var3);
         var15.field5330 *= -1.0F;
         var2.method8147(var15);
      }

      if (Statics.field2111.method1803(97)) {
         class584 var16 = class584.method8136(25.0F, 0.0F, 0.0F);
         var16.method8150(var3);
         var16.field5330 *= -1.0F;
         var2.method8147(var16);
      }

      class88 var17 = new class88(0, (int)var2.field5328, (int)var2.field5330, (int)var2.field5331);
      var0.method205(var17);
      Statics.field7127.method6289(0.02F, client.field2468.method9521(Statics.field1977), client.field2468.method9528().field5626);
   }
}
