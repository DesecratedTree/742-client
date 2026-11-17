@deob.ObfuscatedName("pk")
public class class728 {
   private class728() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("np.n(FLkb;Lkb;Lkb;Lkb;Lkb;FFI)V")
   public static void method9963(float arg0, class584 arg1, class584 arg2, class584 arg3, class584 arg4, class584 arg5, float arg6, float arg7) {
      if (!arg2.method8144(arg1)) {
         class584 var8 = class584.method8152(arg2, arg1);
         float var9 = var8.method8157();
         if (arg6 > 0.0F) {
            arg4 = class584.method8135(arg4);
            arg4.method8161(var9 / arg6 * arg7);
         }

         if (arg4.field5328 != Float.POSITIVE_INFINITY && !Float.isNaN(arg1.field5328) && !(var9 > 5120.0F)) {
            class584 var10 = class584.method8135(arg3);
            var10.method8195();
            class584 var11 = class584.method8212(var10, arg4);
            class584 var12 = class584.method8160(var10, var11);
            class584 var13 = class584.method8135(arg3);
            class584 var14 = class584.method8135(var8);
            var14.method8195();
            if (var12.field5328 > var14.field5328) {
               if (var8.field5328 < 0.0F) {
                  var13.field5328 += arg4.field5328 * arg0;
                  if (var13.field5328 > 0.0F) {
                     var13.field5328 = 0.0F;
                  }
               } else {
                  var13.field5328 -= arg4.field5328 * arg0;
                  if (var13.field5328 < 0.0F) {
                     var13.field5328 = 0.0F;
                  }
               }
            } else if (var10.field5328 < arg5.field5328) {
               if (var8.field5328 < 0.0F) {
                  var13.field5328 -= arg4.field5328 * arg0;
                  if (var13.field5328 < -arg5.field5328) {
                     var13.field5328 = -arg5.field5328;
                  }
               } else {
                  var13.field5328 += arg4.field5328 * arg0;
                  if (var13.field5328 > arg5.field5328) {
                     var13.field5328 = arg5.field5328;
                  }
               }
            }

            if (var12.field5330 > var14.field5330) {
               if (var8.field5330 < 0.0F) {
                  var13.field5330 += arg4.field5330 * arg0;
                  if (var13.field5330 > 0.0F) {
                     var13.field5330 = 0.0F;
                  }
               } else {
                  var13.field5330 -= arg4.field5330 * arg0;
                  if (var13.field5330 < 0.0F) {
                     var13.field5330 = 0.0F;
                  }
               }
            } else if (var10.field5330 < arg5.field5330) {
               if (var8.field5330 < 0.0F) {
                  var13.field5330 -= arg4.field5330 * arg0;
                  if (var13.field5330 < -arg5.field5330) {
                     var13.field5330 = -arg5.field5330;
                  }
               } else {
                  var13.field5330 += arg4.field5330 * arg0;
                  if (var13.field5330 > arg5.field5330) {
                     var13.field5330 = arg5.field5330;
                  }
               }
            }

            if (var12.field5331 > var14.field5331) {
               if (var8.field5331 < 0.0F) {
                  var13.field5331 += arg4.field5331 * arg0;
                  if (var13.field5331 > 0.0F) {
                     var13.field5331 = 0.0F;
                  }
               } else {
                  var13.field5331 -= arg4.field5331 * arg0;
                  if (var13.field5331 < 0.0F) {
                     var13.field5331 = 0.0F;
                  }
               }
            } else if (var10.field5331 < arg5.field5331) {
               if (var8.field5331 < 0.0F) {
                  var13.field5331 -= arg4.field5331 * arg0;
                  if (var13.field5331 < -arg5.field5331) {
                     var13.field5331 = -arg5.field5331;
                  }
               } else {
                  var13.field5331 += arg4.field5331 * arg0;
                  if (var13.field5331 > arg5.field5331) {
                     var13.field5331 = arg5.field5331;
                  }
               }
            }

            arg3.method8169(var13, 0.8F);
            if (var9 < 10.0F && arg3.method8157() < 10.0F) {
               arg1.method8177(arg2);
               arg3.method8143();
            } else {
               arg1.method8147(class584.method8165(arg3, arg0));
            }

            var10.method8201();
            var13.method8201();
            var14.method8201();
         } else {
            arg1.method8177(arg2);
            arg3.method8143();
         }

      }
   }
}
