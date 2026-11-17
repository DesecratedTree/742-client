@deob.ObfuscatedName("aeu")
public class class131 extends class697 {
   @deob.ObfuscatedName("aeu.ab")
   private static int field1019 = -1;
   @deob.ObfuscatedName("aeu.ae")
   public static int field1015 = 0;
   @deob.ObfuscatedName("aeu.au")
   public static int field1016 = -1;
   @deob.ObfuscatedName("aeu.ad")
   public static int field1017 = -1;
   @deob.ObfuscatedName("aeu.ay")
   public static boolean field1018 = false;
   @deob.ObfuscatedName("aeu.bs")
   private static int field1025 = -1;
   @deob.ObfuscatedName("aeu.br")
   private static int field1020 = -1;
   @deob.ObfuscatedName("aeu.ba")
   private static boolean field1021 = false;
   @deob.ObfuscatedName("aeu.bn")
   public static String[] field1022 = new String[5];
   @deob.ObfuscatedName("aeu.bk")
   private static int field1028 = -1;
   @deob.ObfuscatedName("aeu.bo")
   private static int field1024 = -1;
   @deob.ObfuscatedName("aeu.bi")
   public static boolean field1023 = false;
   @deob.ObfuscatedName("aeu.bz")
   public static class875 field1026 = new class875(8);
   @deob.ObfuscatedName("aeu.bt")
   public static class875 field1027 = new class875(8);
   @deob.ObfuscatedName("aeu.be")
   private static class844 field1014 = new class844(new class849());

   private class131() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("pm.bv(Lra;Lma;I)V")
   private static final void method10793(class772 arg0, class637 arg1) {
      if (Statics.field6389 != null) {
         class431.method2169();
         class431.method2169();
         if (field1015 < 10) {
            if (!Statics.field6387.method8793(Statics.field6389.field1659)) {
               field1015 = Statics.field2508.method8811(Statics.field6389.field1659) / 10;
               return;
            }

            client.method15750();
            field1015 = 10;
         }

         if (field1015 == 10) {
            Statics.field6402 = Statics.field6389.field1665 >> 6 << 6;
            Statics.field6418 = Statics.field6389.field1669 >> 6 << 6;
            Statics.field6404 = (Statics.field6389.field1661 >> 6 << 6) - Statics.field6402 + 64;
            Statics.field6403 = (Statics.field6389.field1668 >> 6 << 6) - Statics.field6418 + 64;
            int[] var2 = new int[3];
            int var3 = -1;
            int var4 = -1;
            class584 var5 = Statics.field5701.method11602().field5446;
            class723 var6 = client.field2468.method9649();
            if (Statics.field6389.method3412(Statics.field5701.field1032, ((int)var5.field5328 >> 9) + var6.field6676, ((int)var5.field5331 >> 9) + var6.field6677, var2)) {
               var3 = var2[1] - Statics.field6402;
               var4 = var2[2] - Statics.field6418;
            }

            if (!field1021 && var3 >= 0 && var3 < Statics.field6404 && var4 >= 0 && var4 < Statics.field6403) {
               int var7 = var3 + ((int)(Math.random() * 10.0D) - 5);
               int var8 = var4 + ((int)(Math.random() * 10.0D) - 5);
               Statics.field7271 = var7;
               Statics.field9883 = var8;
            } else if (field1025 != -1 && field1020 != -1) {
               Statics.field6389.method3409(field1025, field1020, var2);
               if (var2 != null) {
                  Statics.field7271 = var2[1] - Statics.field6402;
                  Statics.field9883 = var2[2] - Statics.field6418;
               }

               field1020 = -1;
               field1025 = -1;
               field1021 = false;
            } else {
               Statics.field6389.method3409(Statics.field6389.field1658 >> 14 & 16383, Statics.field6389.field1658 & 16383, var2);
               Statics.field7271 = var2[1] - Statics.field6402;
               Statics.field9883 = var2[2] - Statics.field6418;
            }

            if (Statics.field6389.field1664 == 37) {
               Statics.field6398 = 3.0F;
               Statics.field6419 = 3.0F;
            } else if (Statics.field6389.field1664 == 50) {
               Statics.field6398 = 4.0F;
               Statics.field6419 = 4.0F;
            } else if (Statics.field6389.field1664 == 75) {
               Statics.field6398 = 6.0F;
               Statics.field6419 = 6.0F;
            } else if (Statics.field6389.field1664 == 100) {
               Statics.field6398 = 8.0F;
               Statics.field6419 = 8.0F;
            } else if (Statics.field6389.field1664 == 200) {
               Statics.field6398 = 16.0F;
               Statics.field6419 = 16.0F;
            } else {
               Statics.field6398 = 8.0F;
               Statics.field6419 = 8.0F;
            }

            Statics.field6417 = (int)Statics.field6398 >> 1;
            Statics.field6394 = class666.method4214(Statics.field6417);
            method10854();
            method10224();
            Statics.field6489 = new class849();
            field6392 += (int)(Math.random() * 5.0D) - 2;
            if (field6392 < -8) {
               field6392 = -8;
            }

            if (field6392 > 8) {
               field6392 = 8;
            }

            field6395 += (int)(Math.random() * 5.0D) - 2;
            if (field6395 < -16) {
               field6395 = -16;
            }

            if (field6395 > 16) {
               field6395 = 16;
            }

            method10227(arg1, field6392 >> 2 << 10, field6395 >> 1);
            Statics.field6386.method10690(1024, 256);
            Statics.field6416.method15832(256, 256);
            Statics.field6385.method14636(4096);
            Statics.field5610.method10755(256);
            field1015 = 20;
         } else if (field1015 == 20) {
            class641.method16069(true);
            method10211(arg0, field6392, field6395);
            field1015 = 60;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 60) {
            if (Statics.field6387.method8788(Statics.field6389.field1659 + "_staticelements")) {
               if (!Statics.field6387.method8793(Statics.field6389.field1659 + "_staticelements")) {
                  return;
               }

               Statics.field6400 = class701.method14491(Statics.field6387, Statics.field6389.field1659 + "_staticelements", client.field2561);
            } else {
               Statics.field6400 = new class701(0);
            }

            method10249();
            field1015 = 70;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 70) {
            Statics.field7082 = new class191(arg0, 11, true, Statics.field5796);
            field1015 = 73;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 73) {
            Statics.field1198 = new class191(arg0, 12, true, Statics.field5796);
            field1015 = 76;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 76) {
            Statics.field6232 = new class191(arg0, 14, true, Statics.field5796);
            field1015 = 79;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 79) {
            Statics.field5795 = new class191(arg0, 17, true, Statics.field5796);
            field1015 = 82;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 82) {
            Statics.field8494 = new class191(arg0, 19, true, Statics.field5796);
            field1015 = 85;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 85) {
            Statics.field242 = new class191(arg0, 22, true, Statics.field5796);
            field1015 = 88;
            class641.method16069(true);
            class671.method5268();
         } else if (field1015 == 88) {
            Statics.field5711 = new class191(arg0, 26, true, Statics.field5796);
            field1015 = 91;
            class641.method16069(true);
            class671.method5268();
         } else {
            Statics.field6659 = new class191(arg0, 30, true, Statics.field5796);
            field1015 = 100;
            class641.method16069(true);
            class671.method5268();
            System.gc();
         }
      }
   }

   @deob.ObfuscatedName("pq.bd(B)V")
   private static void method10854() {
      if (Statics.field7271 < 0) {
         Statics.field7271 = 0;
         field1016 = -1;
         field1017 = -1;
      }

      if (Statics.field7271 > Statics.field6404) {
         Statics.field7271 = Statics.field6404;
         field1016 = -1;
         field1017 = -1;
      }

      if (Statics.field9883 < 0) {
         Statics.field9883 = 0;
         field1016 = -1;
         field1017 = -1;
      }

      if (Statics.field9883 > Statics.field6403) {
         Statics.field9883 = Statics.field6403;
         field1016 = -1;
         field1017 = -1;
      }

   }

   @deob.ObfuscatedName("wm.bz(I)V")
   public static void method15862() {
      field1026.method15312();
      field1027.method15312();
   }

   @deob.ObfuscatedName("rl.bt(Lra;Lma;IIIII)V")
   public static void method14035(class772 arg0, class637 arg1, int arg2, int arg3, int arg4, int arg5) {
      if (field1015 < 100) {
         method10793(arg0, arg1);
      }

      arg0.method7716(arg2, arg3, arg2 + arg4, arg3 + arg5);
      if (field1015 < 100) {
         byte var6 = 20;
         int var7 = arg4 / 2 + arg2;
         int var8 = arg5 / 2 + arg3 - 18 - var6;
         arg0.method7513(arg2, arg3, arg4, arg5, -16777216, 0);
         arg0.method7751(var7 - 152, var8, 304, 34, client.field2443[client.field2647].getRGB(), 0);
         arg0.method7513(var7 - 150, var8 + 2, field1015 * 3, 30, client.field2442[client.field2647].getRGB(), 0);
         Statics.field7095.method8691(class881.field9001.method15374(Statics.field243), var7, var6 + var8, client.field2444[client.field2647].getRGB(), -1);
      } else {
         int var9 = Statics.field7271 - (int)((float)arg4 / Statics.field6398);
         int var10 = Statics.field9883 + (int)((float)arg5 / Statics.field6398);
         int var11 = Statics.field7271 + (int)((float)arg4 / Statics.field6398);
         int var12 = Statics.field9883 - (int)((float)arg5 / Statics.field6398);
         Statics.field3644 = Statics.field7271 - (int)((float)arg4 / Statics.field6398);
         Statics.field7128 = Statics.field9883 - (int)((float)arg5 / Statics.field6398);
         Statics.field5595 = (int)((float)(arg4 * 2) / Statics.field6398);
         Statics.field9063 = (int)((float)(arg5 * 2) / Statics.field6398);
         method10216(Statics.field6402 + var9, Statics.field6418 + var10, Statics.field6402 + var11, Statics.field6418 + var12, arg2, arg3, arg2 + arg4, arg3 + arg5 + 1);
         method10217(arg0);
         class849 var13 = method10221(arg0);
         method10322(arg0, var13, 0, 0);
         if (Statics.field8823 > 0) {
            --Statics.field3678;
            if (Statics.field3678 == 0) {
               --Statics.field8823;
               Statics.field3678 = 20;
            }
         }

         if (client.field2665) {
            int var14 = arg2 + arg4 - 5;
            int var15 = arg3 + arg5 - 8;
            Statics.field6177.method8711("Fps:" + class671.field6099, var14, var15, 16776960, -1);
            int var19 = var15 - 15;
            Runtime var16 = Runtime.getRuntime();
            int var17 = (int)((var16.totalMemory() - var16.freeMemory()) / 1024L);
            int var18 = 16776960;
            if (var17 > 65536) {
               var18 = 16711680;
            }

            Statics.field6177.method8711("Mem:" + var17 + "k", var14, var19, var18, -1);
            var15 = var19 - 15;
         }

      }
   }

   @deob.ObfuscatedName("ol.be(Lra;Ltx;IIS)V")
   private static void method10322(class772 arg0, class849 arg1, int arg2, int arg3) {
      Statics.field6489.method14958();
      if (!field1023) {
         for(class99 var4 = (class99)arg1.method14964(); var4 != null; var4 = (class99)arg1.method15006()) {
            class733 var5 = Statics.field6386.method10685(var4.field773);
            if (method11470(var5)) {
               boolean var6 = method9728(arg0, var4, var5, arg2, arg3);
               if (var6) {
                  method1439(arg0, var4, var5);
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("qz.bb(Lpp;B)Z")
   private static boolean method11470(class733 arg0) {
      if (arg0 == null) {
         return false;
      } else if (!arg0.field6738) {
         return false;
      } else if (!arg0.method10825(Statics.field6388)) {
         return false;
      } else if (field1026.method15322((long)arg0.field6726) != null) {
         return false;
      } else {
         return field1027.method15322((long)arg0.field6735) == null;
      }
   }

   @deob.ObfuscatedName("nd.bu(Lra;Ladp;Lpp;III)Z")
   private static boolean method9728(class772 arg0, class99 arg1, class733 arg2, int arg3, int arg4) {
      int var5 = Integer.MAX_VALUE;
      int var6 = Integer.MIN_VALUE;
      int var7 = Integer.MAX_VALUE;
      int var8 = Integer.MIN_VALUE;
      if (arg2.field6754 != null) {
         var5 = (arg1.field767 + arg2.field6758 - Statics.field6393) * (Statics.field6421 - Statics.field6383) / (Statics.field6413 - Statics.field6393) + Statics.field6383;
         var6 = (arg1.field767 + arg2.field6755 - Statics.field6393) * (Statics.field6421 - Statics.field6383) / (Statics.field6413 - Statics.field6393) + Statics.field6383;
         var8 = Statics.field6422 - (arg1.field770 + arg2.field6744 - Statics.field6401) * (Statics.field6422 - Statics.field6420) / (Statics.field6397 - Statics.field6401);
         var7 = Statics.field6422 - (arg1.field770 + arg2.field6756 - Statics.field6401) * (Statics.field6422 - Statics.field6420) / (Statics.field6397 - Statics.field6401);
      }

      class383 var9 = null;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      if (arg2.field6727 != -1) {
         if (arg1.field769 && arg2.field6728 != -1) {
            var9 = arg2.method10824(arg0, true);
         } else {
            var9 = arg2.method10824(arg0, false);
         }

         if (var9 != null) {
            var10 = arg1.field771 - (var9.method5259() + 1 >> 1);
            if (var10 < var5) {
               var5 = var10;
            }

            var11 = arg1.field771 + (var9.method5259() + 1 >> 1);
            if (var11 > var6) {
               var6 = var11;
            }

            var12 = arg1.field772 - (var9.method5213() + 1 >> 1);
            if (var12 < var7) {
               var7 = var12;
            }

            var13 = arg1.field772 + (var9.method5213() + 1 >> 1);
            if (var13 > var8) {
               var8 = var13;
            }
         }
      }

      class191 var14 = null;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      if (arg2.field6729 != null) {
         var14 = method15824(arg2.field6730);
         if (var14 != null) {
            var15 = Statics.field7093.method15400(arg2.field6729, (int[])null, field1022, (class894[])null);
            var16 = arg2.field6761 * (Statics.field6421 - Statics.field6383) / (Statics.field6413 - Statics.field6393) + arg1.field771;
            int var23 = arg1.field772 - arg2.field6762 * (Statics.field6422 - Statics.field6420) / (Statics.field6397 - Statics.field6401);
            if (var9 == null) {
               var17 = var23 - var14.method2475() * var15 / 2;
            } else {
               var17 = var23 - ((var9.method5213() >> 1) + var14.method2476() * var15);
            }

            for(int var24 = 0; var24 < var15; ++var24) {
               String var25 = field1022[var24];
               if (var24 < var15 - 1) {
                  var25 = var25.substring(0, var25.length() - 4);
               }

               int var26 = var14.method2477(var25);
               if (var26 > var18) {
                  var18 = var26;
               }
            }

            var19 = var16 - var18 / 2 + arg3;
            if (var19 < var5) {
               var5 = var19;
            }

            var20 = var18 / 2 + var16 + arg3;
            if (var20 > var6) {
               var6 = var20;
            }

            var21 = arg4 + var17;
            if (var21 < var7) {
               var7 = var21;
            }

            var22 = var17 + var15 * var14.method2476() + arg4;
            if (var22 > var8) {
               var8 = var22;
            }
         }
      }

      if (var6 >= Statics.field6383 && var5 <= Statics.field6421 && var8 >= Statics.field6420 && var7 <= Statics.field6422) {
         method10261(arg0, arg1, arg2);
         if (var9 != null) {
            if (Statics.field8823 > 0 && (field1028 != -1 && field1028 == arg1.field773 || field1024 != -1 && field1024 == arg2.field6735)) {
               int var27;
               if (Statics.field3678 > 50) {
                  var27 = 200 - Statics.field3678 * 2;
               } else {
                  var27 = Statics.field3678 * 2;
               }

               int var28 = var27 << 24 | 16776960;
               arg0.method11535(arg1.field771, arg1.field772, var9.method5216() / 2 + 7, var28);
               arg0.method11535(arg1.field771, arg1.field772, var9.method5216() / 2 + 5, var28);
               arg0.method11535(arg1.field771, arg1.field772, var9.method5216() / 2 + 3, var28);
               arg0.method11535(arg1.field771, arg1.field772, var9.method5216() / 2 + 1, var28);
               arg0.method11535(arg1.field771, arg1.field772, var9.method5216() / 2, var28);
            }

            var9.method5221(arg1.field771 - (var9.method5259() >> 1), arg1.field772 - (var9.method5213() >> 1));
         }

         if (arg2.field6729 != null && var14 != null) {
            Statics.method9256(arg0, arg1, arg2, var15, var16, var17, var18, var14);
         }

         if (arg2.field6727 != -1 || arg2.field6729 != null) {
            class80 var29 = new class80(arg1);
            var29.field578 = var10;
            var29.field570 = var11;
            var29.field572 = var12;
            var29.field573 = var13;
            var29.field576 = var19;
            var29.field575 = var20;
            var29.field574 = var21;
            var29.field577 = var22;
            Statics.field6489.method14959(var29);
         }

         return false;
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("ae.bl(Lra;Ladp;Lpp;I)V")
   private static void method1439(class772 arg0, class99 arg1, class733 arg2) {
      class383 var3 = arg2.method10845(arg0);
      if (var3 != null) {
         int var4 = var3.method5216();
         if (var3.method5218() > var4) {
            var4 = var3.method5218();
         }

         byte var5 = 10;
         int var6 = arg1.field771;
         int var7 = arg1.field772;
         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (arg2.field6729 != null) {
            var8 = Statics.field7093.method15400(arg2.field6729, (int[])null, field1022, (class894[])null);

            for(int var11 = 0; var11 < var8; ++var11) {
               String var12 = field1022[var11];
               if (var11 < var8 - 1) {
                  var12 = var12.substring(0, var12.length() - 4);
               }

               int var13 = Statics.field6232.method2477(var12);
               if (var13 > var9) {
                  var9 = var13;
               }
            }

            var10 = Statics.field6232.method2476() * var8 + Statics.field6232.method2475() / 2;
         }

         int var14 = var4 / 2 + arg1.field771;
         int var15 = arg1.field772;
         if (var6 < Statics.field6383 + var4) {
            var6 = Statics.field6383;
            var14 = var9 / 2 + var4 / 2 + Statics.field6383 + var5 + 5;
         } else if (var6 > Statics.field6421 - var4) {
            var6 = Statics.field6421 - var4;
            var14 = Statics.field6421 - var4 / 2 - var5 - var9 / 2 - 5;
         }

         if (var7 < Statics.field6420 + var4) {
            var7 = Statics.field6420;
            var15 = var4 / 2 + Statics.field6420 + var5;
         } else if (var7 > Statics.field6422 - var4) {
            var7 = Statics.field6422 - var4;
            var15 = Statics.field6422 - var4 / 2 - var5 - var10;
         }

         int var16 = (int)(Math.atan2((double)(var6 - arg1.field771), (double)(var7 - arg1.field772)) / 3.141592653589793D * 32767.0D) & 65535;
         var3.method5223((float)var4 / 2.0F + (float)var6, (float)var4 / 2.0F + (float)var7, 4096, var16);
         int var17 = -2;
         int var18 = -2;
         int var19 = -2;
         int var20 = -2;
         if (arg2.field6729 != null) {
            var17 = var14 - var9 / 2 - 5;
            var18 = var15;
            var19 = var9 + var17 + 10;
            var20 = var15 + Statics.field6232.method2476() * var8 + 3;
            if (arg2.field6736 != 0) {
               arg0.method11524(var17, var15, var19 - var17, var20 - var15, arg2.field6736);
            }

            if (arg2.field6737 != 0) {
               arg0.method11505(var17, var15, var19 - var17, var20 - var15, arg2.field6737);
            }

            for(int var21 = 0; var21 < var8; ++var21) {
               String var22 = field1022[var21];
               if (var21 < var8 - 1) {
                  var22 = var22.substring(0, var22.length() - 4);
               }

               Statics.field6232.method2484(arg0, var22, var14, var15, arg2.field6739, true);
               var15 += Statics.field6232.method2476();
            }
         }

         if (arg2.field6727 != -1 || arg2.field6729 != null) {
            class80 var23 = new class80(arg1);
            int var24 = var4 >> 1;
            var23.field578 = var6 - var24;
            var23.field570 = var6 + var24;
            var23.field572 = var7 - var24;
            var23.field573 = var7 + var24;
            var23.field576 = var17;
            var23.field575 = var19;
            var23.field574 = var18;
            var23.field577 = var20;
            Statics.field6489.method14959(var23);
         }

      }
   }

   @deob.ObfuscatedName("wj.cm(II)Lah;")
   private static class191 method15824(int arg0) {
      if (arg0 == 0) {
         if ((double)Statics.field6398 == 3.0D) {
            return Statics.field7082;
         }

         if ((double)Statics.field6398 == 4.0D) {
            return Statics.field1198;
         }

         if ((double)Statics.field6398 == 6.0D) {
            return Statics.field6232;
         }

         if ((double)Statics.field6398 >= 8.0D) {
            return Statics.field5795;
         }
      } else if (arg0 == 1) {
         if ((double)Statics.field6398 == 3.0D) {
            return Statics.field6232;
         }

         if ((double)Statics.field6398 == 4.0D) {
            return Statics.field5795;
         }

         if ((double)Statics.field6398 == 6.0D) {
            return Statics.field8494;
         }

         if ((double)Statics.field6398 >= 8.0D) {
            return Statics.field242;
         }
      } else if (arg0 == 2) {
         if ((double)Statics.field6398 == 3.0D) {
            return Statics.field8494;
         }

         if ((double)Statics.field6398 == 4.0D) {
            return Statics.field242;
         }

         if ((double)Statics.field6398 == 6.0D) {
            return Statics.field5711;
         }

         if ((double)Statics.field6398 >= 8.0D) {
            return Statics.field6659;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("zq.ca(Lra;IIIIB)V")
   public static final void method17092(class772 arg0, int arg1, int arg2, int arg3, int arg4) {
      arg0.method7716(arg1, arg2, arg1 + arg3, arg2 + arg4);
      arg0.method11524(arg1, arg2, arg3, arg4, -16777216);
      if (field1015 >= 100) {
         float var5 = (float)Statics.field6403 / (float)Statics.field6404;
         int var6 = arg3;
         int var7 = arg4;
         if (var5 < 1.0F) {
            var7 = (int)((float)arg3 * var5);
         } else {
            var6 = (int)((float)arg4 / var5);
         }

         int var8 = (arg3 - var6) / 2 + arg1;
         int var9 = (arg4 - var7) / 2 + arg2;
         if (Statics.field95 == null || Statics.field95.method5216() != arg3 || Statics.field95.method5218() != arg4) {
            method10216(Statics.field6402, Statics.field6418 + Statics.field6403, Statics.field6404 + Statics.field6402, Statics.field6418, var8, var9, var6 + var8, var7 + var9);
            method10217(arg0);
            Statics.field95 = arg0.method7530(var8, var9, var6, var7, false);
         }

         Statics.field95.method5221(var8, var9);
         int var10 = Statics.field5595 * var6 / Statics.field6404;
         int var11 = Statics.field9063 * var7 / Statics.field6403;
         int var12 = Statics.field3644 * var6 / Statics.field6404 + var8;
         int var13 = var7 + var9 - Statics.field7128 * var7 / Statics.field6403 - var11;
         int var14 = -1996554240;
         if (client.field2584 == class801.field7298) {
            var14 = -1996488705;
         }

         arg0.method7513(var12, var13, var10, var11, var14, 1);
         arg0.method7751(var12, var13, var10, var11, var14, 0);
         if (Statics.field8823 > 0) {
            int var15;
            if (Statics.field3678 > 50) {
               var15 = 500 - Statics.field3678 * 5;
            } else {
               var15 = Statics.field3678 * 5;
            }

            for(class99 var16 = (class99)field6415.method14964(); var16 != null; var16 = (class99)field6415.method15006()) {
               class733 var17 = Statics.field6386.method10685(var16.field773);
               if (method11470(var17)) {
                  if (field1028 == var16.field773) {
                     int var18 = var16.field767 * var6 / Statics.field6404 + var8;
                     int var19 = (Statics.field6403 - var16.field770) * var7 / Statics.field6403 + var9;
                     arg0.method11524(var18 - 2, var19 - 2, 4, 4, var15 << 24 | 16776960);
                  } else if (field1024 != -1 && field1024 == var17.field6735) {
                     int var20 = var16.field767 * var6 / Statics.field6404 + var8;
                     int var21 = (Statics.field6403 - var16.field770) * var7 / Statics.field6403 + var9;
                     arg0.method11524(var20 - 2, var21 - 2, 4, 4, var15 << 24 | 16776960);
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("nt.ce(IIB)V")
   public static final void method10010(int arg0, int arg1) {
      if (Statics.field6398 < Statics.field6419) {
         Statics.field6398 = (float)((double)Statics.field6398 / 30.0D + (double)Statics.field6398);
         if (Statics.field6398 > Statics.field6419) {
            Statics.field6398 = Statics.field6419;
         }

         method10854();
         Statics.field6417 = (int)Statics.field6398 >> 1;
         Statics.field6394 = class666.method4214(Statics.field6417);
      } else if (Statics.field6398 > Statics.field6419) {
         Statics.field6398 = (float)((double)Statics.field6398 - (double)Statics.field6398 / 30.0D);
         if (Statics.field6398 < Statics.field6419) {
            Statics.field6398 = Statics.field6419;
         }

         method10854();
         Statics.field6417 = (int)Statics.field6398 >> 1;
         Statics.field6394 = class666.method4214(Statics.field6417);
      }

      if (field1016 != -1 && field1017 != -1) {
         int var2 = field1016 - Statics.field7271;
         if (var2 < 2 || var2 > 2) {
            var2 /= 8;
         }

         int var3 = field1017 - Statics.field9883;
         if (var3 < 2 || var3 > 2) {
            var3 /= 8;
         }

         Statics.field7271 += var2;
         Statics.field9883 += var3;
         if (var2 == 0 && var3 == 0) {
            field1016 = -1;
            field1017 = -1;
         }

         method10854();
      }

      if (Statics.field8823 > 0) {
         --Statics.field3678;
         if (Statics.field3678 == 0) {
            --Statics.field8823;
            Statics.field3678 = 100;
         }
      } else {
         field1028 = -1;
         field1024 = -1;
      }

      if (field1018 && Statics.field6489 != null) {
         for(class80 var4 = (class80)Statics.field6489.method14964(); var4 != null; var4 = (class80)Statics.field6489.method15006()) {
            class733 var5 = Statics.field6386.method10685(var4.field571.field773);
            if (var4.method1106(arg0, arg1)) {
               if (var5.field6741 != null) {
                  if (var5.field6741[4] != null) {
                     class987.method15520(var5.field6741[4], var5.field6742, -1, 1012, -1, (long)var4.field571.field773, var5.field6735, 0, true, false, (long)var4.field571.field773, false);
                  }

                  if (var5.field6741[3] != null) {
                     class987.method15520(var5.field6741[3], var5.field6742, -1, 1011, -1, (long)var4.field571.field773, var5.field6735, 0, true, false, (long)var4.field571.field773, false);
                  }

                  if (var5.field6741[2] != null) {
                     class987.method15520(var5.field6741[2], var5.field6742, -1, 1010, -1, (long)var4.field571.field773, var5.field6735, 0, true, false, (long)var4.field571.field773, false);
                  }

                  if (var5.field6741[1] != null) {
                     class987.method15520(var5.field6741[1], var5.field6742, -1, 1009, -1, (long)var4.field571.field773, var5.field6735, 0, true, false, (long)var4.field571.field773, false);
                  }

                  if (var5.field6741[0] != null) {
                     class987.method15520(var5.field6741[0], var5.field6742, -1, 1008, -1, (long)var4.field571.field773, var5.field6735, 0, true, false, (long)var4.field571.field773, false);
                  }
               }

               if (!var4.field571.field769) {
                  var4.field571.field769 = true;
                  class783.method14203(class932.field9457, var4.field571.field773, var5.field6735);
               }

               if (var4.field571.field769) {
                  class783.method14203(class932.field9445, var4.field571.field773, var5.field6735);
               }
            } else if (var4.field571.field769) {
               var4.field571.field769 = false;
               class783.method14203(class932.field9444, var4.field571.field773, var5.field6735);
            }
         }
      }

   }

   @deob.ObfuscatedName("tl.cf(IIIB)V")
   public static void method14788(int arg0, int arg1, int arg2) {
      if (arg0 == 1008) {
         class783.method14203(class932.field9454, arg1, arg2);
      } else if (arg0 == 1009) {
         class783.method14203(class932.field9439, arg1, arg2);
      } else if (arg0 == 1010) {
         class783.method14203(class932.field9438, arg1, arg2);
      } else if (arg0 == 1011) {
         class783.method14203(class932.field9441, arg1, arg2);
      } else if (arg0 == 1012) {
         class783.method14203(class932.field9453, arg1, arg2);
      }

   }

   @deob.ObfuscatedName("lo.cj(IIIZI)V")
   public static void method8991(int arg0, int arg1, int arg2, boolean arg3) {
      if (Statics.field9361.field974.method2236() != 0) {
         field1019 = Statics.field9361.field974.method2236();
         client.method5788(0, true);
      } else {
         Statics.method15823(false);
      }

      field1025 = arg1;
      field1020 = arg2;
      field1021 = arg3;
      method10205(arg0);
   }

   @deob.ObfuscatedName("av.cw(I)V")
   public static void method4057() {
      Statics.method15823(false);
      if (field1019 >= 0 && field1019 != 0) {
         client.method5788(field1019, false);
         if (Statics.field9361.field974.method2236() != field1019) {
            switch(field1019) {
            case 1:
               class864.method10009(class917.field9355);
               break;
            case 2:
               class864.method10009(class917.field9354);
               break;
            case 3:
               class864.method10009(class917.field9356);
            }
         }

         field1019 = -1;
      }

   }

   @deob.ObfuscatedName("qo.cd(I)V")
   public static void method11281() {
      if (Statics.field924 != -1) {
         method8991(Statics.field924, -1, -1, false);
         Statics.field924 = -1;
      }

   }

   @deob.ObfuscatedName("da.ck(S)Lajg;")
   public static class252 method5345() {
      return Statics.field6389;
   }

   @deob.ObfuscatedName("qy.cs(II)V")
   public static void method11459(int arg0) {
      Statics.field7271 = arg0;
      field1016 = -1;
      field1017 = -1;
      method10854();
   }

   @deob.ObfuscatedName("oy.cg(II)V")
   public static void method10650(int arg0) {
      Statics.field9883 = arg0;
      field1017 = -1;
      field1017 = -1;
      method10854();
   }

   @deob.ObfuscatedName("wg.cp(IB)V")
   public static void method15766(int arg0) {
      if (arg0 == 37) {
         Statics.field6419 = 3.0F;
      } else if (arg0 == 50) {
         Statics.field6419 = 4.0F;
      } else if (arg0 == 75) {
         Statics.field6419 = 6.0F;
      } else if (arg0 == 100) {
         Statics.field6419 = 8.0F;
      } else if (arg0 == 200) {
         Statics.field6419 = 16.0F;
      }

      field1017 = -1;
      field1017 = -1;
   }

   @deob.ObfuscatedName("wx.cv(IIIII)V")
   public static void method15953(int arg0, int arg1, int arg2, int arg3) {
      float var4 = (float)Statics.field6403 / (float)Statics.field6404;
      int var5 = arg2;
      int var6 = arg3;
      if (var4 < 1.0F) {
         var6 = (int)((float)arg2 * var4);
      } else {
         var5 = (int)((float)arg3 / var4);
      }

      int var7 = arg0 - (arg2 - var5) / 2;
      int var8 = arg1 - (arg3 - var6) / 2;
      Statics.field7271 = Statics.field6404 * var7 / var5;
      Statics.field9883 = Statics.field6403 - Statics.field6403 * var8 / var6;
      field1016 = -1;
      field1017 = -1;
      method10854();
   }

   @deob.ObfuscatedName("k.cr(S)I")
   public static int method8053() {
      if ((double)Statics.field6419 == 3.0D) {
         return 37;
      } else if ((double)Statics.field6419 == 4.0D) {
         return 50;
      } else if ((double)Statics.field6419 == 6.0D) {
         return 75;
      } else {
         return (double)Statics.field6419 == 8.0D ? 100 : 200;
      }
   }

   @deob.ObfuscatedName("gz.cc(II)V")
   public static void method6905(int arg0) {
      field1028 = arg0;
      field1024 = -1;
      Statics.field8823 = 3;
      Statics.field3678 = 100;
   }

   @deob.ObfuscatedName("aku.cx(IB)V")
   public static void method3746(int arg0) {
      field1028 = -1;
      field1024 = arg0;
      Statics.field8823 = 3;
      Statics.field3678 = 100;
   }

   @deob.ObfuscatedName("qz.ch(IIII)I")
   public static int method11469(int arg0, int arg1, int arg2) {
      if (field1015 < 100) {
         return -2;
      } else {
         int var3 = -2;
         int var4 = Integer.MAX_VALUE;
         int var5 = arg1 - Statics.field6402;
         int var6 = arg2 - Statics.field6418;

         for(class99 var7 = (class99)field6415.method14964(); var7 != null; var7 = (class99)field6415.method15006()) {
            if (var7.field773 == arg0) {
               int var8 = var7.field767;
               int var9 = var7.field770;
               int var10 = Statics.field6402 + var8 << 14 | Statics.field6418 + var9;
               int var11 = (var5 - var8) * (var5 - var8) + (var6 - var9) * (var6 - var9);
               if (var3 < 0 || var11 < var4) {
                  var3 = var10;
                  var4 = var11;
               }
            }
         }

         return var3;
      }
   }

   @deob.ObfuscatedName("pu.cu(B)Ladp;")
   public static class99 method10929() {
      if (field6415 != null && field1014 != null) {
         field1014.method14903(field6415);
         class99 var0 = (class99)field1014.method14915();
         if (var0 == null) {
            return null;
         } else {
            class733 var1 = Statics.field6386.method10685(var0.field773);
            return var1 != null && var1.field6765 && var1.method10825(Statics.field6388) ? var0 : method10951();
         }
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("px.cy(I)Ladp;")
   public static class99 method10951() {
      if (field6415 != null && field1014 != null) {
         for(class99 var0 = (class99)field1014.next(); var0 != null; var0 = (class99)field1014.next()) {
            class733 var1 = Statics.field6386.method10685(var0.field773);
            if (var1 != null && var1.field6765 && var1.method10825(Statics.field6388)) {
               return var0;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("ack.cl(III)V")
   public static void method1010(int arg0, int arg1) {
      field1016 = arg0 - Statics.field6402;
      field1017 = arg1 - Statics.field6418;
   }
}
