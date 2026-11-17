@deob.ObfuscatedName("rr")
public class class789 {
   @deob.ObfuscatedName("rr.n")
   private static int field7195 = 0;
   @deob.ObfuscatedName("rr.k")
   private static int field7194 = 0;

   private class789() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("fo.n(ZZI)V")
   public static void method6469(boolean arg0, boolean arg1) {
      if (arg0) {
         ++field7195;
         Statics.method1015();
      }

      if (arg1) {
         ++field7194;
         method10319();
      }

   }

   @deob.ObfuscatedName("mf.k(ZZI)V")
   public static void method9269(boolean arg0, boolean arg1) {
      if (arg0) {
         --field7195;
         if (field7195 == 0) {
            Statics.field7263 = null;
         }
      }

      if (arg1) {
         --field7194;
         if (field7194 == 0) {
            Statics.field7196 = null;
         }
      }

   }

   @deob.ObfuscatedName("ol.b(I)V")
   private static void method10319() {
      if (Statics.field7196 == null) {
         Statics.field7196 = new int[65536];
         Statics.field7193 = new int[65536];
         double var0 = 0.7D + (Math.random() * 0.03D - 0.015D);

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
            double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0D) {
               double var15;
               if (var7 < 0.5D) {
                  var15 = (var5 + 1.0D) * var7;
               } else {
                  var15 = var5 + var7 - var5 * var7;
               }

               double var17 = var7 * 2.0D - var15;
               double var19 = var3 + 0.3333333333333333D;
               if (var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if (var23 < 0.0D) {
                  ++var23;
               }

               if (var19 * 6.0D < 1.0D) {
                  var9 = (var15 - var17) * 6.0D * var19 + var17;
               } else if (var19 * 2.0D < 1.0D) {
                  var9 = var15;
               } else if (var19 * 3.0D < 2.0D) {
                  var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
               } else {
                  var9 = var17;
               }

               if (var3 * 6.0D < 1.0D) {
                  var11 = (var15 - var17) * 6.0D * var3 + var17;
               } else if (var3 * 2.0D < 1.0D) {
                  var11 = var15;
               } else if (var3 * 3.0D < 2.0D) {
                  var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0D < 1.0D) {
                  var13 = (var15 - var17) * 6.0D * var23 + var17;
               } else if (var23 * 2.0D < 1.0D) {
                  var13 = var15;
               } else if (var23 * 3.0D < 2.0D) {
                  var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
               } else {
                  var13 = var17;
               }
            }

            double var25 = Math.pow(var9, var0);
            double var27 = Math.pow(var11, var0);
            double var29 = Math.pow(var13, var0);
            int var31 = (int)(var25 * 256.0D);
            int var32 = (int)(var27 * 256.0D);
            int var33 = (int)(var29 * 256.0D);
            int var34 = (var31 << 16) + (var32 << 8) + var33;
            Statics.field7196[var2] = var34 & 16777215;
            int var35 = (var32 << 8) + (var33 << 16) + var31;
            Statics.field7193[var2] = var35;
         }

      }
   }

   @deob.ObfuscatedName("li.o(III)I")
   public static int method8925(int arg0, int arg1) {
      int var2 = arg1 >>> 24;
      int var3 = 255 - var2;
      int var4 = ((arg1 & 16711935) * var2 & -16711936 | (arg1 & 65280) * var2 & 16711680) >>> 8;
      return (((arg0 & 16711935) * var3 & -16711936 | (arg0 & 65280) * var3 & 16711680) >>> 8) + var4;
   }

   @deob.ObfuscatedName("adz.a(IIII)I")
   public static int method1403(int arg0, int arg1, int arg2) {
      int var3 = 255 - arg2;
      int var4 = ((arg1 & 16711935) * arg2 & -16711936 | (arg1 & 65280) * arg2 & 16711680) >>> 8;
      return (((arg0 & 16711935) * var3 & -16711936 | (arg0 & 65280) * var3 & 16711680) >>> 8) + var4;
   }

   @deob.ObfuscatedName("pf.x(IIFI)I")
   public static int method10708(int arg0, int arg1, float arg2) {
      return method1403(arg0, arg1, (int)arg2);
   }

   @deob.ObfuscatedName("wl.l(III)I")
   public static final int method15840(int arg0, int arg1) {
      if (arg0 == -1) {
         return 12345678;
      } else {
         int var2 = (arg0 & 127) * arg1 >> 7;
         if (var2 < 2) {
            var2 = 2;
         } else if (var2 > 126) {
            var2 = 126;
         }

         return (arg0 & 65408) + var2;
      }
   }

   @deob.ObfuscatedName("fu.u(IIB)I")
   public static final int method6522(int arg0, int arg1) {
      if (arg0 == -2) {
         return 12345678;
      } else if (arg0 == -1) {
         if (arg1 < 2) {
            arg1 = 2;
         } else if (arg1 > 126) {
            arg1 = 126;
         }

         return arg1;
      } else {
         int var2 = (arg0 & 127) * arg1 >> 7;
         if (var2 < 2) {
            var2 = 2;
         } else if (var2 > 126) {
            var2 = 126;
         }

         return (arg0 & 65408) + var2;
      }
   }

   @deob.ObfuscatedName("am.v(IIIB)I")
   public static final int method3944(int arg0, int arg1, int arg2) {
      if (arg2 > 243) {
         arg1 >>= 4;
      } else if (arg2 > 217) {
         arg1 >>= 3;
      } else if (arg2 > 192) {
         arg1 >>= 2;
      } else if (arg2 > 179) {
         arg1 >>= 1;
      }

      return (arg2 >> 1) + ((arg0 & 255) >> 2 << 10) + (arg1 >> 5 << 7);
   }
}
