@deob.ObfuscatedName("at")
public class class324 {
   @deob.ObfuscatedName("at.d")
   private static byte[] field2051 = new byte[2048];
   @deob.ObfuscatedName("at.b")
   public static byte[] field2058 = new byte[2048];
   @deob.ObfuscatedName("at.r")
   private static class124[] field2055 = new class124[2048];
   @deob.ObfuscatedName("at.p")
   public static int field2053 = 0;
   @deob.ObfuscatedName("at.o")
   public static int[] field2057 = new int[2048];
   @deob.ObfuscatedName("at.a")
   private static int field2056 = 0;
   @deob.ObfuscatedName("at.x")
   private static int[] field2062 = new int[2048];
   @deob.ObfuscatedName("at.s")
   public static class852[] field2060 = new class852[2048];
   @deob.ObfuscatedName("at.l")
   public static int field2061 = 0;
   @deob.ObfuscatedName("at.u")
   public static int[] field2059 = new int[2048];

   private class324() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ym.n(Lajf;I)V")
   public static final void method16246(class251 arg0) {
      arg0.method3389();
      int var1 = client.field2452;
      class211 var2 = Statics.field5701 = client.field2408[var1] = new class211(client.field2468.method9639());
      var2.field12 = var1;
      int var3 = arg0.method3394(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      class723 var7 = client.field2468.method9649();
      var2.field16[0] = var5 - var7.field6676;
      var2.field62[0] = var6 - var7.field6677;
      var2.method11608((float)((var2.field16[0] << 9) + (var2.method96() << 8)), var2.method11622().field5446.field5330, (float)((var2.field62[0] << 9) + (var2.method96() << 8)));
      Statics.field1977 = var2.field1032 = var2.field1034 = var4;
      if (client.field2468.method9592().method8746(var2.field16[0], var2.field62[0])) {
         ++var2.field1034;
      }

      if (field2055[var1] != null) {
         var2.method2871(field2055[var1]);
      }

      field2053 = 0;
      field2057[++field2053 - 1] = var1;
      field2051[var1] = 0;
      field2056 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var1 != var8) {
            int var9 = arg0.method3394(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 255;
            int var12 = var9 & 255;
            class852 var13 = field2060[var8] = new class852();
            var13.field8742 = (var10 << 28) + (var11 << 14) + var12;
            var13.field8741 = 0;
            var13.field8740 = -1;
            var13.field8743 = false;
            var13.field8744 = false;
            field2062[++field2056 - 1] = var8;
            field2051[var8] = 0;
         }
      }

      arg0.method3391();
   }

   @deob.ObfuscatedName("cv.k(Lajf;IS)V")
   public static final void method5205(class251 arg0, int arg1) {
      field2061 = 0;
      method17039(arg0);
      method11655(arg0);
      if (arg0.field935 != arg1) {
         throw new RuntimeException(arg0.field935 + " " + arg1);
      }
   }

   @deob.ObfuscatedName("z.d(Lajf;I)V")
   private static final void method17039(class251 arg0) {
      int var1 = 0;
      arg0.method3389();

      for(int var2 = 0; var2 < field2053; ++var2) {
         int var3 = field2057[var2];
         if ((field2051[var3] & 1) == 0) {
            if (var1 > 0) {
               --var1;
               field2051[var3] = (byte)(field2051[var3] | 2);
            } else {
               int var4 = arg0.method3394(1);
               if (var4 == 0) {
                  var1 = Statics.method15959(arg0);
                  field2051[var3] = (byte)(field2051[var3] | 2);
               } else {
                  Statics.method15425(arg0, var3);
               }
            }
         }
      }

      arg0.method3391();
      if (var1 != 0) {
         throw new RuntimeException();
      } else {
         arg0.method3389();

         for(int var5 = 0; var5 < field2053; ++var5) {
            int var6 = field2057[var5];
            if ((field2051[var6] & 1) != 0) {
               if (var1 > 0) {
                  --var1;
                  field2051[var6] = (byte)(field2051[var6] | 2);
               } else {
                  int var7 = arg0.method3394(1);
                  if (var7 == 0) {
                     var1 = Statics.method15959(arg0);
                     field2051[var6] = (byte)(field2051[var6] | 2);
                  } else {
                     Statics.method15425(arg0, var6);
                  }
               }
            }
         }

         arg0.method3391();
         if (var1 != 0) {
            throw new RuntimeException();
         } else {
            arg0.method3389();

            for(int var8 = 0; var8 < field2056; ++var8) {
               int var9 = field2062[var8];
               if ((field2051[var9] & 1) != 0) {
                  if (var1 > 0) {
                     --var1;
                     field2051[var9] = (byte)(field2051[var9] | 2);
                  } else {
                     int var10 = arg0.method3394(1);
                     if (var10 == 0) {
                        var1 = Statics.method15959(arg0);
                        field2051[var9] = (byte)(field2051[var9] | 2);
                     } else if (method3854(arg0, var9)) {
                        field2051[var9] = (byte)(field2051[var9] | 2);
                     }
                  }
               }
            }

            arg0.method3391();
            if (var1 != 0) {
               throw new RuntimeException();
            } else {
               arg0.method3389();

               for(int var11 = 0; var11 < field2056; ++var11) {
                  int var12 = field2062[var11];
                  if ((field2051[var12] & 1) == 0) {
                     if (var1 > 0) {
                        --var1;
                        field2051[var12] = (byte)(field2051[var12] | 2);
                     } else {
                        int var13 = arg0.method3394(1);
                        if (var13 == 0) {
                           var1 = Statics.method15959(arg0);
                           field2051[var12] = (byte)(field2051[var12] | 2);
                        } else if (method3854(arg0, var12)) {
                           field2051[var12] = (byte)(field2051[var12] | 2);
                        }
                     }
                  }
               }

               arg0.method3391();
               if (var1 != 0) {
                  throw new RuntimeException();
               } else {
                  field2053 = 0;
                  field2056 = 0;

                  for(int var14 = 1; var14 < 2048; ++var14) {
                     field2051[var14] = (byte)(field2051[var14] >> 1);
                     class211 var15 = client.field2408[var14];
                     if (var15 != null) {
                        field2057[++field2053 - 1] = var14;
                     } else {
                        field2062[++field2056 - 1] = var14;
                     }
                  }

               }
            }
         }
      }
   }

   @deob.ObfuscatedName("al.p(Lajf;IB)Z")
   public static boolean method3854(class251 arg0, int arg1) {
      int var2 = arg0.method3394(2);
      if (var2 == 0) {
         if (arg0.method3394(1) != 0) {
            method3854(arg0, arg1);
         }

         int var3 = arg0.method3394(6);
         int var4 = arg0.method3394(6);
         boolean var5 = arg0.method3394(1) == 1;
         if (var5) {
            field2059[++field2061 - 1] = arg1;
         }

         if (client.field2408[arg1] != null) {
            throw new RuntimeException();
         } else {
            class852 var6 = field2060[arg1];
            class211 var7 = client.field2408[arg1] = new class211(client.field2468.method9639());
            var7.field12 = arg1;
            if (field2055[arg1] != null) {
               var7.method2871(field2055[arg1]);
            }

            var7.method117(var6.field8741, true);
            var7.field34 = var6.field8740;
            int var8 = var6.field8742;
            int var9 = var8 >> 28;
            int var10 = var8 >> 14 & 255;
            int var11 = var8 & 255;
            class723 var12 = client.field2468.method9649();
            int var13 = (var10 << 6) + var3 - var12.field6676;
            int var14 = (var11 << 6) + var4 - var12.field6677;
            var7.field1410 = var6.field8743;
            var7.field1409 = var6.field8744;
            var7.field63[0] = field2058[arg1];
            var7.field1032 = var7.field1034 = (byte)var9;
            if (client.field2468.method9592().method8746(var13, var14)) {
               ++var7.field1034;
            }

            var7.method2865(var13, var14);
            var7.field1404 = false;
            field2060[arg1] = null;
            return true;
         }
      } else if (var2 == 1) {
         int var15 = arg0.method3394(2);
         int var16 = field2060[arg1].field8742;
         field2060[arg1].field8742 = (((var16 >> 28) + var15 & 3) << 28) + (var16 & 268435455);
         return false;
      } else if (var2 == 2) {
         int var17 = arg0.method3394(5);
         int var18 = var17 >> 3;
         int var19 = var17 & 7;
         int var20 = field2060[arg1].field8742;
         int var21 = (var20 >> 28) + var18 & 3;
         int var22 = var20 >> 14 & 255;
         int var23 = var20 & 255;
         if (var19 == 0) {
            --var22;
            --var23;
         }

         if (var19 == 1) {
            --var23;
         }

         if (var19 == 2) {
            ++var22;
            --var23;
         }

         if (var19 == 3) {
            --var22;
         }

         if (var19 == 4) {
            ++var22;
         }

         if (var19 == 5) {
            --var22;
            ++var23;
         }

         if (var19 == 6) {
            ++var23;
         }

         if (var19 == 7) {
            ++var22;
            ++var23;
         }

         field2060[arg1].field8742 = (var21 << 28) + (var22 << 14) + var23;
         return false;
      } else {
         int var24 = arg0.method3394(18);
         int var25 = var24 >> 16;
         int var26 = var24 >> 8 & 255;
         int var27 = var24 & 255;
         int var28 = field2060[arg1].field8742;
         int var29 = (var28 >> 28) + var25 & 3;
         int var30 = (var28 >> 14) + var26 & 255;
         int var31 = var27 + var28 & 255;
         field2060[arg1].field8742 = (var29 << 28) + (var30 << 14) + var31;
         return false;
      }
   }

   @deob.ObfuscatedName("re.o(Lajf;I)V")
   private static final void method11655(class251 arg0) {
      for(int var1 = 0; var1 < field2061; ++var1) {
         int var2 = field2059[var1];
         class211 var3 = client.field2408[var2];
         int var4 = arg0.method1688();
         if ((var4 & 8) != 0) {
            var4 += arg0.method1688() << 8;
         }

         if ((var4 & 8192) != 0) {
            var4 += arg0.method1688() << 16;
         }

         method6741(arg0, var2, var3, var4);
      }

   }

   @deob.ObfuscatedName("gl.a(Lajf;ILaht;II)V")
   private static final void method6741(class251 arg0, int arg1, class211 arg2, int arg3) {
      byte var4 = class647.field5873.field5871;
      if ((arg3 & 128) != 0) {
         field2058[arg1] = arg0.method1622();
      }

      if ((arg3 & 262144) != 0) {
         arg2.field47 = arg0.method1730();
         arg2.field48 = arg0.method1594();
         arg2.field22 = arg0.method1594();
         arg2.field50 = (byte)arg0.method1688();
         arg2.field45 = client.field2418 + arg0.method1587();
         arg2.field46 = client.field2418 + arg0.method1780();
      }

      if ((arg3 & 4) != 0) {
         int var5 = arg0.method1619();
         if (var5 > 0) {
            for(int var6 = 0; var6 < var5; ++var6) {
               int var7 = -1;
               boolean var8 = true;
               int var9 = -1;
               int var10 = arg0.method1604();
               int var11;
               if (var10 == 32767) {
                  var10 = arg0.method1604();
                  var11 = arg0.method1604();
                  var7 = arg0.method1604();
                  var9 = arg0.method1604();
               } else if (var10 != 32766) {
                  var11 = arg0.method1604();
               } else {
                  var10 = -1;
                  var11 = arg0.method1778();
               }

               int var12 = arg0.method1604();
               arg2.method91(var10, var11, var7, var9, client.field2418, var12);
            }
         }

         int var13 = arg0.method1619();
         if (var13 > 0) {
            for(int var14 = 0; var14 < var13; ++var14) {
               int var15 = arg0.method1604();
               int var16 = arg0.method1604();
               if (var16 != 32767) {
                  int var17 = arg0.method1604();
                  int var18 = arg0.method1688();
                  int var19 = var16 > 0 ? arg0.method1778() : var18;
                  arg2.method83(var15, client.field2418, var16, var17, var18, var19);
               } else {
                  arg2.method93(var15);
               }
            }
         }
      }

      if ((arg3 & 64) != 0) {
         int[] var20 = new int[class647.method15598().length];

         for(int var21 = 0; var21 < class647.method15598().length; ++var21) {
            var20[var21] = arg0.method1608();
         }

         int var22 = arg0.method1688();
         client.method2051(arg2, var20, var22, false);
      }

      if ((arg3 & 32768) != 0) {
         var4 = arg0.method1594();
      }

      if ((arg3 & 1024) != 0) {
         String var23 = arg0.method1599();
         if (Statics.field5701 == arg2) {
            class419.method3849(2, 0, arg2.method2862(true), arg2.method2863(false), arg2.field1391, var23);
         }

         arg2.method2869(var23, 0, 0);
      }

      if ((arg3 & 131072) != 0) {
         int var24 = arg0.method1778();
         int[] var25 = new int[var24];
         int[] var26 = new int[var24];

         for(int var27 = 0; var27 < var24; ++var27) {
            int var28 = arg0.method1628();
            if ((var28 & 49152) == 49152) {
               int var29 = arg0.method1587();
               var25[var27] = var28 << 16 | var29;
            } else {
               var25[var27] = var28;
            }

            var26[var27] = arg0.method1587();
         }

         arg2.method177(var25, var26);
      }

      if ((arg3 & 524288) != 0) {
         arg2.field1402.method5194();
         int var30 = arg0.field931[++arg0.field935 - 1] & 255;

         for(int var31 = 0; var31 < var30; ++var31) {
            int var32 = arg0.method1780();
            int var33 = arg0.method1640();
            arg2.field1402.method5186(var32, var33);
         }
      }

      if ((arg3 & 2) != 0) {
         arg2.field1383 = arg0.method1628();
         if (arg2.field60 == 0) {
            arg2.method182(arg2.field1383);
            arg2.field1383 = -1;
         }
      }

      if ((arg3 & 1048576) != 0) {
         int var34 = arg0.field931[++arg0.field935 - 1] & 255;

         for(int var35 = 0; var35 < var34; ++var35) {
            int var36 = arg0.method1629();
            int var37 = arg0.method1640();
            arg2.field1402.method5186(var36, var37);
         }
      }

      if ((arg3 & 4096) != 0) {
         arg2.field1410 = arg0.method1778() == 1;
      }

      if ((arg3 & 16384) != 0) {
         int var38 = arg0.method1778();
         int[] var39 = new int[var38];
         int[] var40 = new int[var38];
         int[] var41 = new int[var38];

         for(int var42 = 0; var42 < var38; ++var42) {
            var39[var42] = arg0.method1608();
            var40[var42] = arg0.method1619();
            var41[var42] = arg0.method1628();
         }

         client.method11048(arg2, var39, var40, var41);
      }

      if ((arg3 & 2097152) != 0) {
         int var43 = arg0.method1629();
         int var44 = arg0.method1639();
         if (var43 == 65535) {
            var43 = -1;
         }

         int var45 = arg0.method1688();
         int var46 = var45 & 7;
         int var47 = var45 >> 3 & 15;
         if (var47 == 15) {
            var47 = -1;
         }

         boolean var48 = (var45 >> 7 & 1) == 1;
         arg2.method89(var43, var44, var46, var47, var48, 2);
      }

      if ((arg3 & 4194304) != 0) {
         int var49 = arg0.method1587();
         int var50 = arg0.method1640();
         if (var49 == 65535) {
            var49 = -1;
         }

         int var51 = arg0.method1688();
         int var52 = var51 & 7;
         int var53 = var51 >> 3 & 15;
         if (var53 == 15) {
            var53 = -1;
         }

         boolean var54 = (var51 >> 7 & 1) == 1;
         arg2.method89(var49, var50, var52, var53, var54, 3);
      }

      if ((arg3 & 8388608) != 0) {
         arg2.field1409 = arg0.method1619() == 1;
      }

      if ((arg3 & 65536) != 0) {
         String var55 = arg0.method1599();
         int var56 = arg0.method1579();
         if ((var56 & 1) != 0) {
            class419.method3849(2, var56, arg2.method2862(true), arg2.method2863(false), arg2.field1391, var55);
         }

         arg2.method2869(var55, 0, 0);
      }

      if ((arg3 & 16) != 0) {
         int var57 = arg0.method1587();
         if (var57 == 65535) {
            var57 = -1;
         }

         arg2.field34 = var57;
      }

      if ((arg3 & 256) != 0) {
         int var58 = arg0.method1628();
         int var59 = arg0.method1591();
         if (var58 == 65535) {
            var58 = -1;
         }

         int var60 = arg0.method1688();
         int var61 = var60 & 7;
         int var62 = var60 >> 3 & 15;
         if (var62 == 15) {
            var62 = -1;
         }

         boolean var63 = (var60 >> 7 & 1) == 1;
         arg2.method89(var58, var59, var61, var62, var63, 1);
      }

      if ((arg3 & 32) != 0) {
         int var64 = arg0.method1688();
         byte[] var65 = new byte[var64];
         class124 var66 = new class124(var65);
         arg0.method1747(var65, 0, var64);
         field2055[arg1] = var66;
         arg2.method2871(var66);
      }

      if ((arg3 & 1) != 0) {
         int var67 = arg0.method1780();
         int var68 = arg0.method1591();
         if (var67 == 65535) {
            var67 = -1;
         }

         int var69 = arg0.method1579();
         int var70 = var69 & 7;
         int var71 = var69 >> 3 & 15;
         if (var71 == 15) {
            var71 = -1;
         }

         boolean var72 = (var69 >> 7 & 1) == 1;
         arg2.method89(var67, var68, var70, var71, var72, 0);
      }

      if ((arg3 & 512) != 0) {
         arg2.field69 = arg0.method1594();
         arg2.field73 = arg0.method1623();
         arg2.field39 = arg0.method1730();
         arg2.field10 = arg0.method1623();
         arg2.field40 = arg0.method1629() + client.field2418;
         arg2.field43 = arg0.method1628() + client.field2418;
         arg2.field44 = arg0.method1587();
         if (arg2.field1404) {
            arg2.field69 += arg2.field1407;
            arg2.field73 += arg2.field1406;
            arg2.field39 += arg2.field1407;
            arg2.field10 += arg2.field1406;
            arg2.field60 = 0;
         } else {
            arg2.field69 += arg2.field16[0];
            arg2.field73 += arg2.field62[0];
            arg2.field39 += arg2.field16[0];
            arg2.field10 += arg2.field62[0];
            arg2.field60 = 1;
         }

         arg2.field65 = 0;
      }

      if (arg2.field1404) {
         if (var4 == 127) {
            arg2.method2865(arg2.field1407, arg2.field1406);
         } else {
            byte var73;
            if (class647.field5873.field5871 != var4) {
               var73 = var4;
            } else {
               var73 = field2058[arg1];
            }

            client.method11115(arg2, var73);
            arg2.method2864(arg2.field1407, arg2.field1406, var73);
         }
      }

   }

   @deob.ObfuscatedName("su.x(I)V")
   public static void method14496() {
      field2053 = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         field2055[var0] = null;
         field2058[var0] = class647.field5875.field5871;
         field2060[var0] = null;
      }

   }
}
