@deob.ObfuscatedName("j")
public class class547 {
   @deob.ObfuscatedName("j.n")
   public static class737 field4362 = new class737(32);

   private class547() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ph.n(Lra;IIIIILqa;IIIILtk;I)Lqa;")
   public static class745 method10727(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class745 arg6, int arg7, int arg8, int arg9, int arg10, class836 arg11) {
      if (arg6 == null) {
         return null;
      } else {
         int var12 = 2055;
         if (arg11 != null) {
            int var13 = var12 | arg11.method14779();
            var12 = var13 & -513;
         }

         long var14 = ((long)arg8 << 48) + ((long)arg7 << 32) + (long)((arg10 << 24) + (arg9 << 16) + arg5);
         class737 var16 = field4362;
         class745 var17;
         synchronized(field4362) {
            var17 = (class745)field4362.method10909(var14);
         }

         if (var17 == null || arg0.method7534(var17.method6980(), var12) != 0) {
            if (var17 != null) {
               var12 = arg0.method7535(var12, var17.method6980());
            }

            byte var19;
            if (arg5 == 1) {
               var19 = 9;
            } else if (arg5 == 2) {
               var19 = 12;
            } else if (arg5 == 3) {
               var19 = 15;
            } else if (arg5 == 4) {
               var19 = 18;
            } else {
               var19 = 21;
            }

            byte var20 = 3;
            int[] var21 = new int[]{64, 96, 128};
            class396 var22 = new class396(var19 * var20 + 1, var19 * var20 * 2 - var19, 0);
            int var23 = var22.method5417(0, 0, 0);
            int[][] var24 = new int[var20][var19];

            for(int var25 = 0; var25 < var20; ++var25) {
               int var26 = var21[var25];
               int var27 = var21[var25];

               for(int var28 = 0; var28 < var19; ++var28) {
                  int var29 = (var28 << 14) / var19;
                  int var30 = class603.field5469[var29] * var26 >> 14;
                  int var31 = class603.field5471[var29] * var27 >> 14;
                  var24[var25][var28] = var22.method5417(var30, 0, var31);
               }
            }

            for(int var32 = 0; var32 < var20; ++var32) {
               int var33 = (var32 * 256 + 128) / var20;
               int var34 = 256 - var33;
               byte var35 = (byte)(arg9 * var34 + arg10 * var33 >> 8);
               short var36 = (short)(((arg7 & 127) * var34 + (arg8 & 127) * var33 & 32512) + ((arg7 & 64512) * var34 + (arg8 & 64512) * var33 & 16515072) + ((arg7 & 896) * var34 + (arg8 & 896) * var33 & 229376) >> 8);

               for(int var37 = 0; var37 < var19; ++var37) {
                  if (var32 == 0) {
                     var22.method5436(var23, var24[0][(var37 + 1) % var19], var24[0][var37], (byte)1, (byte)-1, var36, var35, (short)-1);
                  } else {
                     var22.method5436(var24[var32 - 1][var37], var24[var32 - 1][(var37 + 1) % var19], var24[var32][(var37 + 1) % var19], (byte)1, (byte)-1, var36, var35, (short)-1);
                     var22.method5436(var24[var32 - 1][var37], var24[var32][(var37 + 1) % var19], var24[var32][var37], (byte)1, (byte)-1, var36, var35, (short)-1);
                  }
               }
            }

            var17 = arg0.method7528(var22, var12, Statics.field4363, 64, 768);
            class737 var38 = field4362;
            synchronized(field4362) {
               field4362.method10880(var17, var14);
            }
         }

         int var40 = arg6.method7033();
         int var41 = arg6.method6940();
         int var42 = arg6.method7046();
         int var43 = arg6.method6943();
         class745 var44;
         if (arg11 != null) {
            var44 = var17.method6914((byte)3, var12, true);
            var44.method6924(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var44.method7078(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            arg11.method14748(var44);
         } else {
            var44 = var17.method6914((byte)3, var12, true);
            var44.method6924(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var44.method7078(var40 + var41 >> 1, 0, var42 + var43 >> 1);
         }

         if (arg2 != 0) {
            var44.method6921(arg2);
         }

         if (arg3 != 0) {
            var44.method6999(arg3);
         }

         if (arg4 != 0) {
            var44.method7078(0, arg4, 0);
         }

         return var44;
      }
   }

   @deob.ObfuscatedName("jt.k(II)V")
   public static void method8017(int arg0) {
      Statics.field4363 = arg0;
      class737 var1 = field4362;
      synchronized(field4362) {
         field4362.method10883();
      }
   }

   @deob.ObfuscatedName("np.d(I)V")
   public static void method9965() {
      class737 var0 = field4362;
      synchronized(field4362) {
         field4362.method10883();
      }
   }

   @deob.ObfuscatedName("lu.r(I)V")
   public static void method9118() {
      class737 var0 = field4362;
      synchronized(field4362) {
         field4362.method10887();
      }
   }
}
