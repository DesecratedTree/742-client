@deob.ObfuscatedName("pq")
public class class734 {
   private class734() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("vq.n(FLkb;Lkx;Lkb;Lkb;Lkb;Lkb;FFB)V")
   public static void method15584(float arg0, class584 arg1, class606 arg2, class584 arg3, class584 arg4, class584 arg5, class584 arg6, float arg7, float arg8) {
      if (!arg3.method8144(arg1)) {
         class584 var9 = class584.method8136(0.0F, 0.0F, 0.0F);
         class584 var10 = class584.method8135(class584.method8152(arg3, arg1));
         var10.method8150(arg2);
         class584 var11 = class584.method8152(var10, var9);
         float var12 = var11.method8157();
         if (arg7 > 0.0F) {
            arg5 = class584.method8135(arg5);
            arg5.method8161(var12 / arg7 * arg8);
         }

         if (arg5.field5328 != Float.POSITIVE_INFINITY && !Float.isNaN(arg1.field5328) && !(var12 > 5120.0F)) {
            arg2.method8616();
            class584 var13 = class584.method8136(1.0F, 0.0F, 0.0F);
            class584 var14 = class584.method8136(0.0F, 1.0F, 0.0F);
            class584 var15 = class584.method8136(0.0F, 0.0F, 1.0F);
            var13.method8150(arg2);
            var14.method8150(arg2);
            var15.method8150(arg2);
            class584 var16 = class584.method8136(class584.method8154(var13, arg4), class584.method8154(var14, arg4), class584.method8154(var15, arg4));
            class584 var17 = class584.method8135(var16);
            var17.method8195();
            class584 var18 = class584.method8212(class584.method8160(var17, var17), class584.method8165(arg5, 2.0F));
            class584 var19 = class584.method8135(var11);
            var19.method8195();
            class584 var20 = class584.method8135(var16);
            if (var18.field5328 > var19.field5328) {
               if (var11.field5328 < 0.0F) {
                  var20.field5328 += arg5.field5328 * arg0;
                  if (var20.field5328 > 0.0F) {
                     var20.field5328 = 0.0F;
                  }
               } else {
                  var20.field5328 -= arg5.field5328 * arg0;
                  if (var20.field5328 < 0.0F) {
                     var20.field5328 = 0.0F;
                  }
               }
            } else if (var17.field5328 < arg6.field5328) {
               if (var11.field5328 < 0.0F) {
                  var20.field5328 -= arg5.field5328 * arg0;
                  if (var20.field5328 < -arg6.field5328) {
                     var20.field5328 = -arg6.field5328;
                  }
               } else {
                  var20.field5328 += arg5.field5328 * arg0;
                  if (var20.field5328 > arg6.field5328) {
                     var20.field5328 = arg6.field5328;
                  }
               }
            }

            if (var18.field5330 > var19.field5330) {
               if (var11.field5330 < 0.0F) {
                  var20.field5330 += arg5.field5330 * arg0;
                  if (var20.field5330 > 0.0F) {
                     var20.field5330 = 0.0F;
                  }
               } else {
                  var20.field5330 -= arg5.field5330 * arg0;
                  if (var20.field5330 < 0.0F) {
                     var20.field5330 = 0.0F;
                  }
               }
            } else if (var17.field5330 < arg6.field5330) {
               if (var11.field5330 < 0.0F) {
                  var20.field5330 -= arg5.field5330 * arg0;
                  if (var20.field5330 < -arg6.field5330) {
                     var20.field5330 = -arg6.field5330;
                  }
               } else {
                  var20.field5330 += arg5.field5330 * arg0;
                  if (var20.field5330 > arg6.field5330) {
                     var20.field5330 = arg6.field5330;
                  }
               }
            }

            if (var18.field5331 > var19.field5331) {
               if (var11.field5331 < 0.0F) {
                  var20.field5331 += arg5.field5331 * arg0;
                  if (var20.field5331 > 0.0F) {
                     var20.field5331 = 0.0F;
                  }
               } else {
                  var20.field5331 -= arg5.field5331 * arg0;
                  if (var20.field5331 < 0.0F) {
                     var20.field5331 = 0.0F;
                  }
               }
            } else if (var17.field5331 < arg6.field5331) {
               if (var11.field5331 < 0.0F) {
                  var20.field5331 -= arg5.field5331 * arg0;
                  if (var20.field5331 < -arg6.field5331) {
                     var20.field5331 = -arg6.field5331;
                  }
               } else {
                  var20.field5331 += arg5.field5331 * arg0;
                  if (var20.field5331 > arg6.field5331) {
                     var20.field5331 = arg6.field5331;
                  }
               }
            }

            class584 var21 = class584.method8165(var13, var20.field5328);
            var21.method8148(var14, var20.field5330);
            var21.method8148(var15, var20.field5331);
            arg4.method8169(var21, 0.8F);
            if (var12 < 10.0F) {
               arg1.method8177(arg3);
               arg4.method8143();
            } else {
               arg1.method8147(class584.method8165(arg4, arg0));
            }

            var17.method8201();
            var20.method8201();
            var19.method8201();
         } else {
            arg1.method8177(arg3);
            arg4.method8143();
         }

      }
   }
}
