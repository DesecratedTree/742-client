@deob.ObfuscatedName("ps")
public class class736 {
   private class736() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("nq.n(FLkb;Lkx;Lkb;Lkb;Lkb;FI)V")
   public static void method9996(float arg0, class584 arg1, class606 arg2, class584 arg3, class584 arg4, class584 arg5, float arg6) {
      if (!arg3.method8144(arg1)) {
         class584 var7 = class584.method8136(0.0F, 0.0F, 0.0F);
         class584 var8 = class584.method8135(class584.method8152(arg3, arg1));
         var8.method8150(arg2);
         class584 var9 = class584.method8152(var8, var7);
         float var10 = var9.method8157();
         if (arg5.field5328 != Float.POSITIVE_INFINITY && !Float.isNaN(arg1.field5328) && !(var10 > 5120.0F)) {
            arg2.method8616();
            class584 var11 = class584.method8136(1.0F, 0.0F, 0.0F);
            class584 var12 = class584.method8136(0.0F, 1.0F, 0.0F);
            class584 var13 = class584.method8136(0.0F, 0.0F, 1.0F);
            var11.method8150(arg2);
            var12.method8150(arg2);
            var13.method8150(arg2);
            class584 var14 = class584.method8136(class584.method8154(var11, arg4), class584.method8154(var12, arg4), class584.method8154(var13, arg4));
            class584 var15 = class584.method8135(var14);
            class584 var16 = class584.method8136(arg5.field5328 * var9.field5328, arg5.field5330 * var9.field5330, arg5.field5331 * var9.field5331);
            var15.method8148(var16, arg0);
            var15.method8164(arg6);
            class584 var17 = class584.method8165(var11, var15.field5328);
            var17.method8148(var12, var15.field5330);
            var17.method8148(var13, var15.field5331);
            arg4.method8177(var17);
            if (var10 < 1.0F) {
               arg1.method8177(arg3);
               arg4.method8143();
            } else {
               arg1.method8147(class584.method8165(arg4, arg0));
            }
         } else {
            arg1.method8177(arg3);
            arg4.method8143();
         }

      }
   }
}
