@deob.ObfuscatedName("mp")
public class class652 {
   private class652() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("jw.n(Lkx;I)F")
   public static float method8030(class606 arg0) {
      class584 var1 = class584.method8136(0.0F, 0.0F, 1.0F);
      var1.method8150(arg0);
      double var2 = 1.5707963267948966D - Math.acos((double)var1.field5330);
      var1.method8201();
      return (float)var2;
   }

   @deob.ObfuscatedName("em.k(FFI)F")
   public static float method5901(float arg0, float arg1) {
      double var2 = Math.atan2((double)arg0, (double)arg1);
      if (var2 < 0.0D) {
         var2 = var2 + 3.141592653589793D + 3.141592653589793D;
      }

      return (float)var2;
   }

   @deob.ObfuscatedName("ez.d(Lkx;S)F")
   public static float method6135(class606 arg0) {
      class584 var1 = class584.method8136(0.0F, 0.0F, 1.0F);
      var1.method8150(arg0);
      double var2 = Math.atan2((double)var1.field5328, (double)var1.field5331);
      var1.method8201();
      if (var2 < 0.0D) {
         var2 = var2 + 3.141592653589793D + 3.141592653589793D;
      }

      return (float)var2;
   }
}
