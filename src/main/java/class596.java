@deob.ObfuscatedName("kn")
public class class596 {
   private class596() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("kn.n(Lkb;Lkb;Lkb;F[Lkb;)V")
   public static void method8380(class584 arg0, class584 arg1, class584 arg2, float arg3, class584[] arg4) {
      class584 var5 = class584.method8152(arg0, arg2);
      float var6 = class584.method8154(var5, var5) - arg3 * arg3;
      float var7 = class584.method8154(arg1, var5);
      float var8 = var7 * var7 - var6;
      if (var8 < 0.0F) {
         arg4[1] = null;
         arg4[0] = null;
      } else if (var8 >= 9.765625E-4F) {
         float var10 = (float)Math.sqrt((double)var8);
         arg4[0] = class584.method8133();
         arg4[0].method8177(arg0);
         arg4[0].method8147(class584.method8165(class584.method8135(arg1), -var7 - var10));
         arg4[1] = class584.method8133();
         arg4[1].method8177(arg0);
         arg4[1].method8147(class584.method8165(class584.method8135(arg1), -var7 + var10));
      } else {
         arg4[0] = class584.method8133();
         arg4[0].method8177(arg0);
         arg4[0].method8147(class584.method8165(class584.method8135(arg1), -var7));
         arg4[1] = null;
      }

   }
}
