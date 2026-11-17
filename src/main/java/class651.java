@deob.ObfuscatedName("mo")
public final class class651 {
   @deob.ObfuscatedName("mo.d")
   public static int[][] field5940 = new int[128][128];
   @deob.ObfuscatedName("mo.b")
   public static int[][] field5941 = new int[128][128];
   @deob.ObfuscatedName("mo.a")
   public static int[] field5943 = new int[4096];
   @deob.ObfuscatedName("mo.x")
   public static int[] field5944 = new int[4096];

   private class651() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("oy.k(IILpg;Lml;B)Z")
   public static final boolean method10652(int arg0, int arg1, class724 arg2, class648 arg3) {
      int var4 = arg0;
      int var5 = arg1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = arg0 - var6;
      int var9 = arg1 - var7;
      field5940[var6][var7] = 99;
      field5941[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      field5943[var10] = arg0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      field5944[var10001] = arg1;
      int[][] var12 = arg3.field5878;

      while(var18 != var11) {
         var4 = field5943[var11];
         var5 = field5944[var11];
         var11 = var11 + 1 & 4095;
         int var13 = var4 - var8;
         int var14 = var5 - var9;
         int var15 = var4 - arg3.field5923;
         int var16 = var5 - arg3.field5924;
         if (arg2.method1515(1, var4, var5, arg3)) {
            Statics.field5937 = var4;
            Statics.field7306 = var5;
            return true;
         }

         int var17 = field5941[var13][var14] + 1;
         if (var13 > 0 && field5940[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 1109655552) == 0) {
            field5943[var18] = var4 - 1;
            field5944[var18] = var5;
            var18 = var18 + 1 & 4095;
            field5940[var13 - 1][var14] = 2;
            field5941[var13 - 1][var14] = var17;
         }

         if (var13 < 127 && field5940[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 1612972032) == 0) {
            field5943[var18] = var4 + 1;
            field5944[var18] = var5;
            var18 = var18 + 1 & 4095;
            field5940[var13 + 1][var14] = 8;
            field5941[var13 + 1][var14] = var17;
         }

         if (var14 > 0 && field5940[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 1084489728) == 0) {
            field5943[var18] = var4;
            field5944[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            field5940[var13][var14 - 1] = 1;
            field5941[var13][var14 - 1] = var17;
         }

         if (var14 < 127 && field5940[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 1210318848) == 0) {
            field5943[var18] = var4;
            field5944[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            field5940[var13][var14 + 1] = 4;
            field5941[var13][var14 + 1] = var17;
         }

         if (var13 > 0 && var14 > 0 && field5940[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 1134821376) == 0 && (var12[var15 - 1][var16] & 1109655552) == 0 && (var12[var15][var16 - 1] & 1084489728) == 0) {
            field5943[var18] = var4 - 1;
            field5944[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 - 1][var14 - 1] = 3;
            field5941[var13 - 1][var14 - 1] = var17;
         }

         if (var13 < 127 && var14 > 0 && field5940[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 1625554944) == 0 && (var12[var15 + 1][var16] & 1612972032) == 0 && (var12[var15][var16 - 1] & 1084489728) == 0) {
            field5943[var18] = var4 + 1;
            field5944[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 + 1][var14 - 1] = 9;
            field5941[var13 + 1][var14 - 1] = var17;
         }

         if (var13 > 0 && var14 < 127 && field5940[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 1310982144) == 0 && (var12[var15 - 1][var16] & 1109655552) == 0 && (var12[var15][var16 + 1] & 1210318848) == 0) {
            field5943[var18] = var4 - 1;
            field5944[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 - 1][var14 + 1] = 6;
            field5941[var13 - 1][var14 + 1] = var17;
         }

         if (var13 < 127 && var14 < 127 && field5940[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 2015625216) == 0 && (var12[var15 + 1][var16] & 1612972032) == 0 && (var12[var15][var16 + 1] & 1210318848) == 0) {
            field5943[var18] = var4 + 1;
            field5944[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 + 1][var14 + 1] = 12;
            field5941[var13 + 1][var14 + 1] = var17;
         }
      }

      Statics.field5937 = var4;
      Statics.field7306 = var5;
      return false;
   }

   @deob.ObfuscatedName("fb.d(IILpg;Lml;I)Z")
   public static final boolean method6217(int arg0, int arg1, class724 arg2, class648 arg3) {
      int var4 = arg0;
      int var5 = arg1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = arg0 - var6;
      int var9 = arg1 - var7;
      field5940[var6][var7] = 99;
      field5941[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      field5943[var10] = arg0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      field5944[var10001] = arg1;
      int[][] var12 = arg3.field5878;

      while(var18 != var11) {
         var4 = field5943[var11];
         var5 = field5944[var11];
         var11 = var11 + 1 & 4095;
         int var13 = var4 - var8;
         int var14 = var5 - var9;
         int var15 = var4 - arg3.field5923;
         int var16 = var5 - arg3.field5924;
         if (arg2.method1515(2, var4, var5, arg3)) {
            Statics.field5937 = var4;
            Statics.field7306 = var5;
            return true;
         }

         int var17 = field5941[var13][var14] + 1;
         if (var13 > 0 && field5940[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 1134821376) == 0 && (var12[var15 - 1][var16 + 1] & 1310982144) == 0) {
            field5943[var18] = var4 - 1;
            field5944[var18] = var5;
            var18 = var18 + 1 & 4095;
            field5940[var13 - 1][var14] = 2;
            field5941[var13 - 1][var14] = var17;
         }

         if (var13 < 126 && field5940[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 1625554944) == 0 && (var12[var15 + 2][var16 + 1] & 2015625216) == 0) {
            field5943[var18] = var4 + 1;
            field5944[var18] = var5;
            var18 = var18 + 1 & 4095;
            field5940[var13 + 1][var14] = 8;
            field5941[var13 + 1][var14] = var17;
         }

         if (var14 > 0 && field5940[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 1134821376) == 0 && (var12[var15 + 1][var16 - 1] & 1625554944) == 0) {
            field5943[var18] = var4;
            field5944[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            field5940[var13][var14 - 1] = 1;
            field5941[var13][var14 - 1] = var17;
         }

         if (var14 < 126 && field5940[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 1310982144) == 0 && (var12[var15 + 1][var16 + 2] & 2015625216) == 0) {
            field5943[var18] = var4;
            field5944[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            field5940[var13][var14 + 1] = 4;
            field5941[var13][var14 + 1] = var17;
         }

         if (var13 > 0 && var14 > 0 && field5940[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 1336147968) == 0 && (var12[var15 - 1][var16 - 1] & 1134821376) == 0 && (var12[var15][var16 - 1] & 1675886592) == 0) {
            field5943[var18] = var4 - 1;
            field5944[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 - 1][var14 - 1] = 3;
            field5941[var13 - 1][var14 - 1] = var17;
         }

         if (var13 < 126 && var14 > 0 && field5940[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 1675886592) == 0 && (var12[var15 + 2][var16 - 1] & 1625554944) == 0 && (var12[var15 + 2][var16] & 2028208128) == 0) {
            field5943[var18] = var4 + 1;
            field5944[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 + 1][var14 - 1] = 9;
            field5941[var13 + 1][var14 - 1] = var17;
         }

         if (var13 > 0 && var14 < 126 && field5940[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 1336147968) == 0 && (var12[var15 - 1][var16 + 2] & 1310982144) == 0 && (var12[var15][var16 + 2] & 2116288512) == 0) {
            field5943[var18] = var4 - 1;
            field5944[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 - 1][var14 + 1] = 6;
            field5941[var13 - 1][var14 + 1] = var17;
         }

         if (var13 < 126 && var14 < 126 && field5940[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 2116288512) == 0 && (var12[var15 + 2][var16 + 2] & 2015625216) == 0 && (var12[var15 + 2][var16 + 1] & 2028208128) == 0) {
            field5943[var18] = var4 + 1;
            field5944[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            field5940[var13 + 1][var14 + 1] = 12;
            field5941[var13 + 1][var14 + 1] = var17;
         }
      }

      Statics.field5937 = var4;
      Statics.field7306 = var5;
      return false;
   }

   @deob.ObfuscatedName("jw.b(IIILpg;Lml;I)Z")
   public static final boolean method8029(int arg0, int arg1, int arg2, class724 arg3, class648 arg4) {
      int var5 = arg0;
      int var6 = arg1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = arg0 - var7;
      int var10 = arg1 - var8;
      field5940[var7][var8] = 99;
      field5941[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      field5943[var11] = arg0;
      int var27 = var11 + 1;
      field5944[var11] = arg1;
      int[][] var13 = arg4.field5878;

      while(true) {
         label265:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            do {
               do {
                  do {
                     label242:
                     do {
                        if (var27 == var12) {
                           Statics.field5937 = var5;
                           Statics.field7306 = var6;
                           return false;
                        }

                        var5 = field5943[var12];
                        var6 = field5944[var12];
                        var12 = var12 + 1 & 4095;
                        var14 = var5 - var9;
                        var15 = var6 - var10;
                        var16 = var5 - arg4.field5923;
                        var17 = var6 - arg4.field5924;
                        if (arg3.method1515(arg2, var5, var6, arg4)) {
                           Statics.field5937 = var5;
                           Statics.field7306 = var6;
                           return true;
                        }

                        var18 = field5941[var14][var15] + 1;
                        if (var14 > 0 && field5940[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 1134821376) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 1310982144) == 0) {
                           int var19 = 1;

                           while(true) {
                              if (var19 >= arg2 - 1) {
                                 field5943[var27] = var5 - 1;
                                 field5944[var27] = var6;
                                 var27 = var27 + 1 & 4095;
                                 field5940[var14 - 1][var15] = 2;
                                 field5941[var14 - 1][var15] = var18;
                                 break;
                              }

                              if ((var13[var16 - 1][var17 + var19] & 1336147968) != 0) {
                                 break;
                              }

                              ++var19;
                           }
                        }

                        if (var14 < 128 - arg2 && field5940[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 1625554944) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 2015625216) == 0) {
                           int var20 = 1;

                           while(true) {
                              if (var20 >= arg2 - 1) {
                                 field5943[var27] = var5 + 1;
                                 field5944[var27] = var6;
                                 var27 = var27 + 1 & 4095;
                                 field5940[var14 + 1][var15] = 8;
                                 field5941[var14 + 1][var15] = var18;
                                 break;
                              }

                              if ((var13[arg2 + var16][var17 + var20] & 2028208128) != 0) {
                                 break;
                              }

                              ++var20;
                           }
                        }

                        if (var15 > 0 && field5940[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 1134821376) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 1625554944) == 0) {
                           int var21 = 1;

                           while(true) {
                              if (var21 >= arg2 - 1) {
                                 field5943[var27] = var5;
                                 field5944[var27] = var6 - 1;
                                 var27 = var27 + 1 & 4095;
                                 field5940[var14][var15 - 1] = 1;
                                 field5941[var14][var15 - 1] = var18;
                                 break;
                              }

                              if ((var13[var16 + var21][var17 - 1] & 1675886592) != 0) {
                                 break;
                              }

                              ++var21;
                           }
                        }

                        if (var15 < 128 - arg2 && field5940[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 1310982144) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 2015625216) == 0) {
                           int var22 = 1;

                           while(true) {
                              if (var22 >= arg2 - 1) {
                                 field5943[var27] = var5;
                                 field5944[var27] = var6 + 1;
                                 var27 = var27 + 1 & 4095;
                                 field5940[var14][var15 + 1] = 4;
                                 field5941[var14][var15 + 1] = var18;
                                 break;
                              }

                              if ((var13[var16 + var22][arg2 + var17] & 2116288512) != 0) {
                                 break;
                              }

                              ++var22;
                           }
                        }

                        if (var14 > 0 && var15 > 0 && field5940[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 1134821376) == 0) {
                           int var23 = 1;

                           while(true) {
                              if (var23 >= arg2) {
                                 field5943[var27] = var5 - 1;
                                 field5944[var27] = var6 - 1;
                                 var27 = var27 + 1 & 4095;
                                 field5940[var14 - 1][var15 - 1] = 3;
                                 field5941[var14 - 1][var15 - 1] = var18;
                                 break;
                              }

                              if ((var13[var16 - 1][var17 - 1 + var23] & 1336147968) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 1675886592) != 0) {
                                 break;
                              }

                              ++var23;
                           }
                        }

                        if (var14 < 128 - arg2 && var15 > 0 && field5940[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 1625554944) == 0) {
                           int var24 = 1;

                           while(true) {
                              if (var24 >= arg2) {
                                 field5943[var27] = var5 + 1;
                                 field5944[var27] = var6 - 1;
                                 var27 = var27 + 1 & 4095;
                                 field5940[var14 + 1][var15 - 1] = 9;
                                 field5941[var14 + 1][var15 - 1] = var18;
                                 break;
                              }

                              if ((var13[arg2 + var16][var17 - 1 + var24] & 2028208128) != 0 || (var13[var16 + var24][var17 - 1] & 1675886592) != 0) {
                                 break;
                              }

                              ++var24;
                           }
                        }

                        if (var14 > 0 && var15 < 128 - arg2 && field5940[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 1310982144) == 0) {
                           for(int var25 = 1; var25 < arg2; ++var25) {
                              if ((var13[var16 - 1][var17 + var25] & 1336147968) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 2116288512) != 0) {
                                 continue label242;
                              }
                           }

                           field5943[var27] = var5 - 1;
                           field5944[var27] = var6 + 1;
                           var27 = var27 + 1 & 4095;
                           field5940[var14 - 1][var15 + 1] = 6;
                           field5941[var14 - 1][var15 + 1] = var18;
                        }
                     } while(var14 >= 128 - arg2);
                  } while(var15 >= 128 - arg2);
               } while(field5940[var14 + 1][var15 + 1] != 0);
            } while((var13[arg2 + var16][arg2 + var17] & 2015625216) != 0);

            for(int var26 = 1; var26 < arg2; ++var26) {
               if ((var13[var16 + var26][arg2 + var17] & 2116288512) != 0 || (var13[arg2 + var16][var17 + var26] & 2028208128) != 0) {
                  continue label265;
               }
            }

            field5943[var27] = var5 + 1;
            field5944[var27] = var6 + 1;
            var27 = var27 + 1 & 4095;
            field5940[var14 + 1][var15 + 1] = 12;
            field5941[var14 + 1][var15 + 1] = var18;
         }
      }
   }
}
