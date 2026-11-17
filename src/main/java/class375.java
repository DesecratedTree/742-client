import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@deob.ObfuscatedName("cq")
public class class375 {
   private class375() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("cq.n(Llc;II)Ldv;")
   public static class407 method5065(class612 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method8771(arg1, arg2);
      return var3 == null ? null : method5068(var3)[0];
   }

   @deob.ObfuscatedName("cq.k(Llc;I)Ldv;")
   public static class407 method5066(class612 arg0, int arg1) {
      byte[] var2 = arg0.method8809(arg1);
      return var2 == null ? null : method5068(var2)[0];
   }

   @deob.ObfuscatedName("cq.d(Llc;II)[Ldv;")
   public static class407[] method5064(class612 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method8771(arg1, arg2);
      return var3 == null ? null : method5068(var3);
   }

   @deob.ObfuscatedName("cq.b(Llc;I)[Ldv;")
   public static class407[] method5067(class612 arg0, int arg1) {
      byte[] var2 = arg0.method8809(arg1);
      return var2 == null ? null : method5068(var2);
   }

   @deob.ObfuscatedName("cq.r([B)[Ldv;")
   public static class407[] method5068(byte[] arg0) {
      class124 var1 = new class124(arg0);
      var1.field935 = arg0.length - 2;
      int var2 = var1.method1587();
      if (var2 != 65535) {
         class998[] var3 = new class998[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = new class998();
         }

         var1.field935 = arg0.length - 7 - var2 * 8;
         int var5 = var1.method1587();
         int var6 = var1.method1587();
         int var7 = (var1.method1688() & 255) + 1;

         for(int var8 = 0; var8 < var2; ++var8) {
            var3[var8].field10575 = var1.method1587();
         }

         for(int var9 = 0; var9 < var2; ++var9) {
            var3[var9].field10576 = var1.method1587();
         }

         for(int var10 = 0; var10 < var2; ++var10) {
            var3[var10].field10574 = var1.method1587();
         }

         for(int var11 = 0; var11 < var2; ++var11) {
            var3[var11].field10572 = var1.method1587();
         }

         for(int var12 = 0; var12 < var2; ++var12) {
            class998 var13 = var3[var12];
            var13.field10580 = var5 - var13.field10574 - var13.field10575;
            var13.field10577 = var6 - var13.field10572 - var13.field10576;
         }

         var1.field935 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
         int[] var14 = new int[var7];

         for(int var15 = 1; var15 < var7; ++var15) {
            var14[var15] = var1.method1589();
            if (var14[var15] == 0) {
               var14[var15] = 1;
            }
         }

         for(int var16 = 0; var16 < var2; ++var16) {
            var3[var16].field10578 = var14;
         }

         var1.field935 = 0;

         for(int var17 = 0; var17 < var2; ++var17) {
            class998 var18 = var3[var17];
            int var19 = var18.field10574 * var18.field10572;
            var18.field10579 = new byte[var19];
            int var20 = var1.method1688();
            if ((var20 & 2) == 0) {
               if ((var20 & 1) == 0) {
                  for(int var21 = 0; var21 < var19; ++var21) {
                     var18.field10579[var21] = var1.method1623();
                  }
               } else {
                  for(int var22 = 0; var22 < var18.field10574; ++var22) {
                     for(int var23 = 0; var23 < var18.field10572; ++var23) {
                        var18.field10579[var18.field10574 * var23 + var22] = var1.method1623();
                     }
                  }
               }
            } else {
               boolean var24 = false;
               var18.field10573 = new byte[var19];
               if ((var20 & 1) == 0) {
                  for(int var25 = 0; var25 < var19; ++var25) {
                     var18.field10579[var25] = var1.method1623();
                  }

                  for(int var26 = 0; var26 < var19; ++var26) {
                     byte var27 = var18.field10573[var26] = var1.method1623();
                     var24 |= var27 != -1;
                  }
               } else {
                  for(int var28 = 0; var28 < var18.field10574; ++var28) {
                     for(int var29 = 0; var29 < var18.field10572; ++var29) {
                        var18.field10579[var18.field10574 * var29 + var28] = var1.method1623();
                     }
                  }

                  for(int var30 = 0; var30 < var18.field10574; ++var30) {
                     for(int var31 = 0; var31 < var18.field10572; ++var31) {
                        byte var32 = var18.field10573[var18.field10574 * var31 + var30] = var1.method1623();
                        var24 |= var32 != -1;
                     }
                  }
               }

               if (!var24) {
                  var18.field10573 = null;
               }
            }
         }

         return var3;
      } else {
         var1.field935 = 0;
         int var33 = var1.method1688();
         if (var33 != 0) {
            if (var33 == 1) {
               try {
                  BufferedImage var41 = ImageIO.read(new ByteArrayInputStream(var1.field931, var1.field935, var1.field931.length - var1.field935));
                  int var42 = var41.getWidth();
                  int var43 = var41.getHeight();
                  class966 var44 = new class966(var42, var43, var41.getData().getPixels(0, 0, var42, var43, new int[var42 * var43]));
                  return new class407[]{var44};
               } catch (IOException var46) {
                  throw new RuntimeException();
               }
            } else {
               throw new RuntimeException();
            }
         } else {
            boolean var34 = var1.method1688() == 1;
            int var35 = var1.method1587();
            int var36 = var1.method1587();
            int[] var37 = new int[var35 * var36];

            for(int var38 = 0; var38 < var35 * var36; ++var38) {
               var37[var38] = -16777216 | var1.method1589();
            }

            if (var34) {
               for(int var39 = 0; var39 < var35 * var36; ++var39) {
                  var37[var39] &= 16777215;
                  var37[var39] |= var1.method1688() << 24;
               }
            }

            class966 var40 = new class966(var35, var36, var37);
            return new class407[]{var40};
         }
      }
   }
}
