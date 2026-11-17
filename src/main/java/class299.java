@deob.ObfuscatedName("al")
public class class299 {
   @deob.ObfuscatedName("al.n")
   private static boolean field1891 = false;
   @deob.ObfuscatedName("al.k")
   private static boolean field1883 = false;
   @deob.ObfuscatedName("al.d")
   private static int field1884 = -1;
   @deob.ObfuscatedName("al.b")
   private static int field1885 = 0;
   @deob.ObfuscatedName("al.r")
   private static int[] field1888 = new int[1007];
   @deob.ObfuscatedName("al.p")
   private static int[] field1886 = new int[1004];
   @deob.ObfuscatedName("al.o")
   private static int[] field1887 = new int[1012];
   @deob.ObfuscatedName("al.a")
   private static class849 field1889 = new class849();
   @deob.ObfuscatedName("al.x")
   public static int field1890 = -1;
   @deob.ObfuscatedName("al.s")
   public static int field1895 = -1;
   @deob.ObfuscatedName("al.l")
   public static boolean field1892 = true;
   @deob.ObfuscatedName("al.u")
   private static boolean field1893 = false;
   @deob.ObfuscatedName("al.g")
   public static int field1882 = 0;

   private class299() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("z.n(I)V")
   public static void method17040() {
      field1882 = 0;
      field1884 = -1;
      field1890 = -1;
      field1895 = -1;
   }

   @deob.ObfuscatedName("l.d(S)V")
   public static void method8733() {
      Statics.field562 = null;
      field1884 = -1;
   }

   @deob.ObfuscatedName("ol.b(Lra;B)V")
   public static void method10325(class772 arg0) {
      if (field1884 != Statics.field5701.field1032) {
         if (client.field2468.method9639() != null) {
            class431.method2169();
            if (method1322(arg0, Statics.field5701.field1032)) {
               field1884 = Statics.field5701.field1032;
            }

         }
      }
   }

   @deob.ObfuscatedName("adl.r(Lra;II)Z")
   private static boolean method1322(class772 arg0, int arg1) {
      arg0.method11515();
      class431.method2169();
      if (!arg0.method11501()) {
         return false;
      } else {
         int var2 = client.field2468.method9648();
         int var3 = client.field2468.method9604();
         class611 var4 = client.field2468.method9592();
         class713 var5 = client.field2468.method9639();
         int var6 = var2 / 2;
         byte var7 = 0;
         byte var8 = 0;
         boolean var9 = true;

         for(int var10 = var7; var10 < var2 + var7; ++var10) {
            for(int var11 = var8; var11 < var3 + var8; ++var11) {
               for(int var12 = arg1; var12 <= 3; ++var12) {
                  if (var4.method8750(arg1, var12, var10, var11)) {
                     int var13 = var12;
                     if (var4.method8746(var10, var11)) {
                        var13 = var12 - 1;
                     }

                     if (var13 >= 0) {
                        var9 &= method8279(var13, var10, var11);
                     }
                  }
               }
            }
         }

         if (!var9) {
            return false;
         } else {
            int var14 = var2 * 4 + 48 + 48;
            int[] var15 = new int[var14 * var14];

            for(int var16 = 0; var16 < var15.length; ++var16) {
               var15[var16] = -16777216;
            }

            class973 var17 = null;
            byte var18 = 0;
            byte var19 = 0;
            if (field1883) {
               Statics.field562 = arg0.method7612(var14, var14, false, true);
               var17 = arg0.method2513();
               var17.method2351(0, Statics.field562.method2391());
               class393 var20 = arg0.method2514(var14, var14);
               var17.method2352(var20);
               arg0.method11502(var17);
               var6 = var2;
               var18 = 48;
               var19 = 48;
               arg0.method2522(1, 0);
            } else {
               Statics.field562 = arg0.method11534(var15, 0, var14, var14, var14);
            }

            client.field2468.method9512().method11132();
            int var21 = -16777216 | (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
            int var22 = -16777216 | 238 + (int)(Math.random() * 20.0D) - 10 << 16;
            int var23 = (int)(Math.random() * 8.0D) << 16 | (int)(Math.random() * 8.0D) << 8 | (int)(Math.random() * 8.0D);
            boolean[][] var24 = new boolean[var6 + 1 + 2][var6 + 1 + 2];

            for(int var25 = var7; var25 < var2 + var7; var25 += var6) {
               for(int var26 = var8; var26 < var3 + var8; var26 += var6) {
                  int var27 = var18;
                  int var28 = var19;
                  int var29 = var25;
                  if (var25 > 0) {
                     var29 = var25 - 1;
                     var27 = var18 + 4;
                  }

                  int var30 = var26;
                  if (var26 > 0) {
                     var30 = var26 - 1;
                  }

                  int var31 = var6 + var25;
                  if (var31 < var2) {
                     ++var31;
                  }

                  int var32 = var6 + var26;
                  if (var32 < var3) {
                     ++var32;
                     var28 = var19 + 4;
                  }

                  if (field1891) {
                     arg0.method7508();
                  } else {
                     arg0.method7716(0, 0, var6 * 4 + var27, var6 * 4 + var28);
                  }

                  arg0.method2522(3, -16777216);
                  int var33 = var6;
                  if (var6 > var2 - 1) {
                     var33 = var2 - 1;
                  }

                  for(int var34 = arg1; var34 <= 3; ++var34) {
                     for(int var35 = 0; var35 <= var33; ++var35) {
                        for(int var36 = 0; var36 <= var33; ++var36) {
                           var24[var35][var36] = var4.method8750(arg1, var34, var29 + var35, var30 + var36);
                        }
                     }

                     var5.field6582[var34].method7288(var18, var19, 1024, var29, var30, var31, var32, var24);
                     if (!field1893) {
                        for(int var37 = -4; var37 < var6; ++var37) {
                           for(int var38 = -4; var38 < var6; ++var38) {
                              int var39 = var25 + var37;
                              int var40 = var26 + var38;
                              if (var39 >= var7 && var40 >= var8 && var4.method8750(arg1, var34, var39, var40)) {
                                 int var41 = var34;
                                 if (var4.method8746(var39, var40)) {
                                    var41 = var34 - 1;
                                 }

                                 if (var41 >= 0) {
                                    method9948(arg0, var41, var39, var40, var37 * 4 + var27, (var6 - var38) * 4 + var28 - 4, var21, var22);
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (field1893) {
                     class648 var42 = client.field2468.method9521(arg1);

                     for(int var43 = 0; var43 < var6; ++var43) {
                        for(int var44 = 0; var44 < var6; ++var44) {
                           int var45 = var25 + var43;
                           int var46 = var26 + var44;
                           int var47 = var42.field5878[var45 - var42.field5923][var46 - var42.field5924];
                           if ((var47 & 1076101120) != 0) {
                              arg0.method11524(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4, 4, 4, -1713569622);
                           } else if ((var47 & 8388608) != 0) {
                              arg0.method11493(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4, 4, -1713569622);
                           } else if ((var47 & 33554432) != 0) {
                              arg0.method11506(var43 * 4 + var27 + 3, (var6 - var44) * 4 + var28 - 4, 4, -1713569622);
                           } else if ((var47 & 134217728) != 0) {
                              arg0.method11493(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4 + 3, 4, -1713569622);
                           } else if ((var47 & 536870912) != 0) {
                              arg0.method11506(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4, 4, -1713569622);
                           }
                        }
                     }
                  }

                  arg0.method7513(var27, var28, var6 * 4, var6 * 4, var23, 2);
                  arg0.method11515();
                  if (!field1883) {
                     Statics.field562.method2389((var25 - var7) * 4 + 48, var3 * 4 + 48 - (var26 - var8) * 4 - var6 * 4, var6 * 4, var6 * 4, var27, var28);
                     if (field1891) {
                        Statics.field562.method5221(256, 0);

                        try {
                           arg0.method11522();
                           Statics.method14813(2000L);
                        } catch (Exception var76) {
                        }
                     }
                  }
               }
            }

            if (field1883) {
               arg0.method11503(var17);
               if (field1891) {
                  Statics.field562.method5221(256, 0);

                  try {
                     arg0.method11522();
                     Statics.method14813(2000L);
                  } catch (Exception var75) {
                  }
               }
            }

            arg0.method7508();
            arg0.method2522(1, 1);
            client.method208();
            class831 var50 = client.field2468.method9636();
            field1885 = 0;
            field1889.method14958();
            if (!field1893) {
               for(int var51 = var7; var51 < var2 + var7; ++var51) {
                  for(int var52 = var8; var52 < var3 + var8; ++var52) {
                     for(int var53 = arg1; var53 <= arg1 + 1 && var53 <= 3; ++var53) {
                        if (var4.method8750(arg1, var53, var51, var52)) {
                           class376 var54 = (class376)var5.method10516(var53, var51, var52);
                           if (var54 == null) {
                              var54 = (class376)var5.method10514(var53, var51, var52, client.field2704);
                           }

                           if (var54 == null) {
                              var54 = (class376)var5.method10510(var53, var51, var52);
                           }

                           if (var54 == null) {
                              var54 = (class376)var5.method10577(var53, var51, var52);
                           }

                           if (var54 != null) {
                              class843 var55 = var50.method14651(var54.method5093());
                              if (!var55.field8567 || client.field2561) {
                                 int var56 = var55.field8603;
                                 if (var55.field8609 != null) {
                                    for(int var57 = 0; var57 < var55.field8609.length; ++var57) {
                                       if (var55.field8609[var57] != -1) {
                                          class843 var58 = var50.method14651(var55.field8609[var57]);
                                          if (var58.field8603 >= 0) {
                                             var56 = var58.field8603;
                                          }
                                       }
                                    }
                                 }

                                 if (var56 >= 0) {
                                    boolean var59 = false;
                                    if (var56 >= 0) {
                                       class733 var60 = Statics.field6782.method10685(var56);
                                       if (var60 != null && var60.field6731) {
                                          var59 = true;
                                       }
                                    }

                                    int var61 = var51;
                                    int var62 = var52;
                                    if (var59) {
                                       int[][] var63 = client.field2468.method9521(var53).field5878;
                                       int var64 = client.field2468.method9521(var53).field5923;
                                       int var65 = client.field2468.method9521(var53).field5924;

                                       for(int var66 = 0; var66 < 10; ++var66) {
                                          int var67 = (int)(Math.random() * 4.0D);
                                          if (var67 == 0 && var61 > var7 && var61 > var51 - 3 && (var63[var61 - 1 - var64][var62 - var65] & 2883848) == 0) {
                                             --var61;
                                          }

                                          if (var67 == 1 && var61 < var2 + var7 - 1 && var61 < var51 + 3 && (var63[var61 + 1 - var64][var62 - var65] & 2883968) == 0) {
                                             ++var61;
                                          }

                                          if (var67 == 2 && var62 > var8 && var62 > var52 - 3 && (var63[var61 - var64][var62 - 1 - var65] & 2883842) == 0) {
                                             --var62;
                                          }

                                          if (var67 == 3 && var62 < var3 + var8 - 1 && var62 < var52 + 3 && (var63[var61 - var64][var62 + 1 - var65] & 2883872) == 0) {
                                             ++var62;
                                          }
                                       }
                                    }

                                    field1887[field1885] = var55.field8577;
                                    field1888[field1885] = var61;
                                    field1886[field1885] = var62;
                                    ++field1885;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               class701 var68 = client.field2468.method9617();
               if (var68 != null) {
                  Statics.field6782.method10690(1024, 64);
                  class723 var69 = client.field2468.method9649();

                  for(int var70 = 0; var70 < var68.field6465; ++var70) {
                     int var71 = var68.field6466[var70];
                     if (var71 >> 28 == Statics.field5701.field1032) {
                        int var72 = (var71 >> 14 & 16383) - var69.field6676;
                        int var73 = (var71 & 16383) - var69.field6677;
                        if (var72 >= 0 && var72 < var2 && var73 >= 0 && var73 < var3) {
                           field1889.method14959(new class108(var70));
                        } else {
                           class733 var74 = Statics.field6782.method10685(var68.field6464[var70]);
                           if (var74.field6754 != null && var74.field6755 + var72 >= 0 && var74.field6758 + var72 < var2 && var74.field6756 + var73 >= 0 && var74.field6744 + var73 < var3) {
                              field1889.method14959(new class108(var70));
                           }
                        }
                     }
                  }

                  Statics.field6782.method10690(128, 64);
               }
            }

            return true;
         }
      }
   }

   @deob.ObfuscatedName("kf.p(IIII)Z")
   private static boolean method8279(int arg0, int arg1, int arg2) {
      class713 var3 = client.field2468.method9639();
      boolean var4 = true;
      class376 var5 = (class376)var3.method10510(arg0, arg1, arg2);
      if (var5 != null) {
         var4 &= method8923(var5);
      }

      class376 var6 = (class376)var3.method10514(arg0, arg1, arg2, client.field2704);
      if (var6 != null) {
         var4 &= method8923(var6);
      }

      class376 var7 = (class376)var3.method10516(arg0, arg1, arg2);
      if (var7 != null) {
         var4 &= method8923(var7);
      }

      return var4;
   }

   @deob.ObfuscatedName("li.o(Lcr;B)Z")
   private static boolean method8923(class376 arg0) {
      class843 var1 = client.field2468.method9636().method14651(arg0.method5093());
      if (var1.field8613 == -1) {
         return true;
      } else {
         class890 var2 = Statics.field7163.method15830(var1.field8613);
         return var2.field9079 == -1 ? true : var2.method15499();
      }
   }

   @deob.ObfuscatedName("nn.a(Lra;IIIIIIIB)V")
   private static void method9948(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      class713 var8 = client.field2468.method9639();
      class376 var9 = (class376)var8.method10510(arg1, arg2, arg3);
      if (var9 != null) {
         class843 var10 = client.field2468.method9636().method14651(var9.method5093());
         int var11 = var9.method5084() & 3;
         int var12 = var9.method5083();
         if (var10.field8613 != -1) {
            method14954(arg0, var10, var11, arg4, arg5);
         } else {
            int var13 = arg6;
            if (var10.field8638 > 0) {
               var13 = arg7;
            }

            if (class850.field8735.field8736 == var12 || class850.field8715.field8736 == var12) {
               if (var11 == 0) {
                  arg0.method11506(arg4, arg5, 4, var13);
               } else if (var11 == 1) {
                  arg0.method11493(arg4, arg5, 4, var13);
               } else if (var11 == 2) {
                  arg0.method11506(arg4 + 3, arg5, 4, var13);
               } else if (var11 == 3) {
                  arg0.method11493(arg4, arg5 + 3, 4, var13);
               }
            }

            if (class850.field8725.field8736 == var12) {
               if (var11 == 0) {
                  arg0.method11524(arg4, arg5, 1, 1, var13);
               } else if (var11 == 1) {
                  arg0.method11524(arg4 + 3, arg5, 1, 1, var13);
               } else if (var11 == 2) {
                  arg0.method11524(arg4 + 3, arg5 + 3, 1, 1, var13);
               } else if (var11 == 3) {
                  arg0.method11524(arg4, arg5 + 3, 1, 1, var13);
               }
            }

            if (class850.field8715.field8736 == var12) {
               if (var11 == 0) {
                  arg0.method11493(arg4, arg5, 4, var13);
               } else if (var11 == 1) {
                  arg0.method11506(arg4 + 3, arg5, 4, var13);
               } else if (var11 == 2) {
                  arg0.method11493(arg4, arg5 + 3, 4, var13);
               } else if (var11 == 3) {
                  arg0.method11506(arg4, arg5, 4, var13);
               }
            }
         }
      }

      class376 var14 = (class376)var8.method10514(arg1, arg2, arg3, client.field2704);
      if (var14 != null) {
         class843 var15 = client.field2468.method9636().method14651(var14.method5093());
         int var16 = var14.method5084() & 3;
         int var17 = var14.method5083();
         if (var15.field8613 != -1) {
            method14954(arg0, var15, var16, arg4, arg5);
         } else if (class850.field8717.field8736 == var17) {
            int var18 = -1118482;
            if (var15.field8638 > 0) {
               var18 = -1179648;
            }

            if (var16 != 0 && var16 != 2) {
               arg0.method11529(arg4, arg5, arg4 + 3, arg5 + 3, var18);
            } else {
               arg0.method11529(arg4, arg5 + 3, arg4 + 3, arg5, var18);
            }
         }
      }

      class376 var19 = (class376)var8.method10516(arg1, arg2, arg3);
      if (var19 != null) {
         class843 var20 = client.field2468.method9636().method14651(var19.method5093());
         int var21 = var19.method5084() & 3;
         if (var20.field8613 != -1) {
            method14954(arg0, var20, var21, arg4, arg5);
         }
      }

   }

   @deob.ObfuscatedName("tv.x(Lra;Ltr;IIIB)V")
   private static void method14954(class772 arg0, class843 arg1, int arg2, int arg3, int arg4) {
      class890 var5 = Statics.field7163.method15830(arg1.field8613);
      if (var5.field9079 != -1) {
         int var7;
         if (arg1.field8605) {
            int var6 = arg1.field8606 + arg2;
            var7 = var6 & 3;
         } else {
            var7 = 0;
         }

         class383 var8 = var5.method15498(arg0, var7, arg1.field8607);
         if (var8 != null) {
            int var9 = arg1.field8585;
            int var10 = arg1.field8570;
            if ((var7 & 1) == 1) {
               var9 = arg1.field8570;
               var10 = arg1.field8585;
            }

            int var11 = var8.method5259();
            int var12 = var8.method5213();
            if (var5.field9078) {
               var11 = var9 * 4;
               var12 = var10 * 4;
            }

            if (var5.field9080 != 0) {
               var8.method5263(arg3, arg4 - (var10 - 1) * 4, var11, var12, 0, -16777216 | var5.field9080, 1);
            } else {
               var8.method5222(arg3, arg4 - (var10 - 1) * 4, var11, var12);
            }

         }
      }
   }

   @deob.ObfuscatedName("qq.s(Lra;Lem;IIB)V")
   public static void method11290(class772 arg0, class425 arg1, int arg2, int arg3) {
      if (Statics.field5701 != null) {
         arg0.method11515();
         class436 var4 = arg1.method5824(arg0);
         if (var4 != null) {
            class826 var5 = var4.field3624;
            arg0.method7716(arg2, arg3, arg1.field3405 + arg2, arg1.field3557 + arg3);
            if (arg1.field3405 == var4.field3629 && arg1.field3557 == var4.field3625) {
               if (field1882 != 2 && field1882 != 5 && Statics.field562 != null) {
                  class723 var6 = client.field2468.method9649();
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  if (Statics.field5998 == 5) {
                     var7 = client.field2506;
                     var8 = client.field2507;
                     var9 = (int)(-client.field2502) & 16383;
                     var10 = 4096;
                  } else {
                     class584 var11 = Statics.field5701.method11602().field5446;
                     var7 = (int)var11.field5328;
                     var8 = (int)var11.field5331;
                     var9 = client.field2519 + (int)(-client.field2502) & 16383;
                     var10 = 4096 - client.field2619 * 16;
                  }

                  int var12 = var7 / 128 + 48;
                  int var13 = 48 + client.field2468.method9604() * 4 - var8 / 128;
                  Statics.field562.method5229((float)arg1.field3405 / 2.0F + (float)arg2, (float)arg1.field3557 / 2.0F + (float)arg3, (float)var12, (float)var13, var10, var9 << 2, var5, arg2, arg3);
                  class701 var14 = client.field2468.method9617();

                  for(class108 var15 = (class108)field1889.method14964(); var15 != null; var15 = (class108)field1889.method15006()) {
                     int var16 = var15.field811;
                     int var17 = (var14.field6466[var16] >> 14 & 16383) - var6.field6676;
                     int var18 = (var14.field6466[var16] & 16383) - var6.field6677;
                     int var19 = var17 * 4 + 2 - var7 / 128;
                     int var20 = var18 * 4 + 2 - var8 / 128;
                     method9074(arg0, var5, arg1, arg2, arg3, var19, var20, var14.field6464[var16]);
                  }

                  for(int var21 = 0; var21 < field1885; ++var21) {
                     int var22 = field1888[var21] * 4 + 2 - var7 / 128;
                     int var23 = field1886[var21] * 4 + 2 - var8 / 128;
                     class843 var24 = client.field2468.method9636().method14651(field1887[var21]);
                     if (var24.field8609 != null) {
                        var24 = var24.method14853(Statics.field10637);
                        if (var24 == null || var24.field8603 == -1) {
                           continue;
                        }
                     }

                     method9074(arg0, var5, arg1, arg2, arg3, var22, var23, var24.field8603);
                  }

                  for(class79 var25 = (class79)client.field2576.method15313(); var25 != null; var25 = (class79)client.field2576.method15314()) {
                     int var26 = (int)(var25.field6137 >> 28 & 3L);
                     if (field1884 == var26) {
                        int var27 = (int)(var25.field6137 & 16383L) - var6.field6676;
                        int var28 = (int)(var25.field6137 >> 14 & 16383L) - var6.field6677;
                        int var29 = var27 * 4 + 2 - var7 / 128;
                        int var30 = var28 * 4 + 2 - var8 / 128;
                        method1089(arg1, var5, arg2, arg3, var29, var30, Statics.field5594[0]);
                     }
                  }

                  method8281(arg0, var7, var8, arg1, var5, arg2, arg3);
                  Statics.method3315(var7, var8, arg1, var5, arg2, arg3);
                  method6223(var7, var8, arg1, var4, arg2, arg3);
                  if (Statics.field5998 != 5) {
                     if (field1890 != 0) {
                        int var31 = field1890 * 4 + 2 - var7 / 128 + (Statics.field5701.method96() - 1) * 2;
                        int var32 = field1895 * 4 + 2 - var8 / 128 + (Statics.field5701.method96() - 1) * 2;
                        method1089(arg1, var5, arg2, arg3, var31, var32, Statics.field3083[field1892 ? 1 : 0]);
                     }

                     if (!Statics.field5701.field1408) {
                        arg0.method11524(arg1.field3405 / 2 + arg2 - 1, arg1.field3557 / 2 + arg3 - 1, 3, 3, -1);
                     }
                  }
               } else {
                  arg0.method7593(-16777216, var5, arg2, arg3);
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   @deob.ObfuscatedName("kf.l(Lra;IILem;Lta;IIB)V")
   private static void method8281(class772 arg0, int arg1, int arg2, class425 arg3, class826 arg4, int arg5, int arg6) {
      for(int var7 = 0; var7 < client.field2455; ++var7) {
         class106 var8 = (class106)client.field2615.method15322((long)client.field2456[var7]);
         if (var8 != null) {
            class200 var9 = (class200)var8.field807;
            if (var9.method2791() && Statics.field5701.field1032 == var9.field1032) {
               class915 var10 = var9.field1312;
               if (var10 != null && var10.field9319 != null) {
                  var10 = var10.method15778(Statics.field10637);
               }

               if (var10 != null && var10.field9314 && var10.field9308) {
                  class584 var11 = var9.method11602().field5446;
                  int var12 = (int)var11.field5328 / 128 - arg1 / 128;
                  int var13 = (int)var11.field5331 / 128 - arg2 / 128;
                  if (var10.field9338 != -1) {
                     method9074(arg0, arg4, arg3, arg5, arg6, var12, var13, var10.field9338);
                  } else {
                     method1089(arg3, arg4, arg5, arg6, var12, var13, Statics.field5594[1]);
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("fb.v(IILem;Lex;III)V")
   private static void method6223(int arg0, int arg1, class425 arg2, class436 arg3, int arg4, int arg5) {
      class164[] var6 = client.field2423;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         class164 var8 = var6[var7];
         if (var8 != null && var8.field1156 != 0 && client.field2418 % 20 < 10) {
            if (var8.field1156 == 1) {
               class106 var9 = (class106)client.field2615.method15322((long)var8.field1150);
               if (var9 != null) {
                  class200 var10 = (class200)var9.field807;
                  class584 var11 = var10.method11602().field5446;
                  int var12 = (int)var11.field5328 / 128 - arg0 / 128;
                  int var13 = (int)var11.field5331 / 128 - arg1 / 128;
                  method5386(arg2, arg3, arg4, arg5, var12, var13, var8.field1153, 360000L);
               }
            }

            if (var8.field1156 == 2) {
               int var14 = var8.field1152 / 128 - arg0 / 128;
               int var15 = var8.field1155 / 128 - arg1 / 128;
               long var16 = (long)(var8.field1148 << 7);
               long var18 = var16 * var16;
               method5386(arg2, arg3, arg4, arg5, var14, var15, var8.field1153, var18);
            }

            if (var8.field1156 == 10 && var8.field1150 >= 0 && var8.field1150 < client.field2408.length) {
               class211 var20 = client.field2408[var8.field1150];
               if (var20 != null) {
                  class584 var21 = var20.method11602().field5446;
                  int var22 = (int)var21.field5328 / 128 - arg0 / 128;
                  int var23 = (int)var21.field5331 / 128 - arg1 / 128;
                  method5386(arg2, arg3, arg4, arg5, var22, var23, var8.field1153, 360000L);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("lp.g(Lra;Lta;Lem;IIIIIB)V")
   private static void method9074(class772 arg0, class826 arg1, class425 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      class733 var8 = Statics.field6782.method10685(arg7);
      if (var8 != null && var8.field6753 && var8.method10825(Statics.field10637)) {
         if (var8.field6754 != null) {
            int[] var9 = new int[var8.field6754.length];

            for(int var10 = 0; var10 < var9.length / 2; ++var10) {
               int var11;
               if (Statics.field5998 == 5) {
                  var11 = (int)client.field2502 & 16383;
               } else {
                  var11 = client.field2519 + (int)client.field2502 & 16383;
               }

               int var12 = class603.field5469[var11];
               int var13 = class603.field5471[var11];
               if (Statics.field5998 != 5) {
                  var12 = var12 * 256 / (client.field2619 + 256);
                  var13 = var13 * 256 / (client.field2619 + 256);
               }

               var9[var10 * 2] = ((var8.field6754[var10 * 2] * 4 + arg5) * var13 + (var8.field6754[var10 * 2 + 1] * 4 + arg6) * var12 >> 14) + arg2.field3405 / 2 + arg3;
               var9[var10 * 2 + 1] = arg2.field3557 / 2 + arg4 - ((var8.field6754[var10 * 2 + 1] * 4 + arg6) * var13 - (var8.field6754[var10 * 2] * 4 + arg5) * var12 >> 14);
            }

            class436 var14 = arg2.method5824(arg0);
            if (var14 != null) {
               class388.method5363(arg0, var9, var8.field6757, var14.field3627, var14.field3626);
            }

            if (var8.field6750 > 0) {
               for(int var15 = 0; var15 < var9.length / 2 - 1; ++var15) {
                  int var16 = var9[var15 * 2];
                  int var17 = var9[var15 * 2 + 1];
                  int var18 = var9[(var15 + 1) * 2];
                  int var19 = var9[(var15 + 1) * 2 + 1];
                  if (var18 < var16) {
                     int var20 = var16;
                     int var21 = var17;
                     var16 = var18;
                     var17 = var19;
                     var18 = var20;
                     var19 = var21;
                  } else if (var16 == var18 && var19 < var17) {
                     int var22 = var17;
                     var17 = var19;
                     var19 = var22;
                  }

                  arg0.method7521(var16, var17, var18, var19, var8.field6763[var8.field6764[var15] & 255], 1, arg1, arg3, arg4, var8.field6750, var8.field6752, var8.field6760);
               }

               int var23 = var9[var9.length - 2];
               int var24 = var9[var9.length - 1];
               int var25 = var9[0];
               int var26 = var9[1];
               if (var25 < var23) {
                  int var27 = var23;
                  int var28 = var24;
                  var23 = var25;
                  var24 = var26;
                  var25 = var27;
                  var26 = var28;
               } else if (var23 == var25 && var26 < var24) {
                  int var29 = var24;
                  var24 = var26;
                  var26 = var29;
               }

               arg0.method7521(var23, var24, var25, var26, var8.field6763[var8.field6764[var8.field6764.length - 1] & 255], 1, arg1, arg3, arg4, var8.field6750, var8.field6752, var8.field6760);
            } else {
               for(int var30 = 0; var30 < var9.length / 2 - 1; ++var30) {
                  arg0.method7518(var9[var30 * 2], var9[var30 * 2 + 1], var9[(var30 + 1) * 2], var9[(var30 + 1) * 2 + 1], var8.field6763[var8.field6764[var30] & 255], 1, arg1, arg3, arg4);
               }

               arg0.method7518(var9[var9.length - 2], var9[var9.length - 1], var9[0], var9[1], var8.field6763[var8.field6764[var8.field6764.length - 1] & 255], 1, arg1, arg3, arg4);
            }
         }

         class383 var31 = null;
         if (var8.field6727 != -1) {
            var31 = var8.method10824(arg0, false);
            if (var31 != null) {
               method1089(arg2, arg1, arg3, arg4, arg5, arg6, var31);
            }
         }

         if (var8.field6729 != null) {
            int var32 = 0;
            if (var31 != null) {
               var32 = var31.method5218();
            }

            class609 var33 = Statics.field5483;
            class883 var34 = Statics.field7093;
            if (var8.field6730 == 1) {
               var33 = Statics.field6177;
               var34 = Statics.field7094;
            }

            if (var8.field6730 == 2) {
               var33 = Statics.field7095;
               var34 = Statics.field1855;
            }

            method6271(arg2, arg1, arg3, arg4, arg5, arg6, var32, var8.field6729, var33, var34, var8.field6739);
         }
      }

   }

   @deob.ObfuscatedName("df.h(Lem;Lex;IIIIIJ)V")
   private static void method5386(class425 arg0, class436 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
      int var9 = arg4 * arg4 + arg5 * arg5;
      if ((long)var9 <= arg7) {
         int var10;
         if (Statics.field5998 == 5) {
            var10 = (int)client.field2502 & 16383;
         } else {
            var10 = client.field2519 + (int)client.field2502 & 16383;
         }

         int var11 = class603.field5469[var10];
         int var12 = class603.field5471[var10];
         if (Statics.field5998 != 5) {
            var11 = var11 * 256 / (client.field2619 + 256);
            var12 = var12 * 256 / (client.field2619 + 256);
         }

         int var13 = arg4 * var12 + arg5 * var11 >> 14;
         int var14 = arg5 * var12 - arg4 * var11 >> 14;
         class383 var15 = Statics.field7090[arg6];
         int var16 = var15.method5216();
         int var17 = var15.method5218();
         int var18 = arg0.field3405 / 2 + var13 - var16 / 2;
         int var19 = var16 + var18;
         int var20 = arg0.field3557 / 2 + -var14 - var17;
         int var21 = var17 + var20;
         if (arg1.method6118(var18, var20) && arg1.method6118(var19, var20) && arg1.method6118(var18, var21) && arg1.method6118(var19, var21)) {
            var15.method2393(arg2 + var18, arg3 + var20, arg1.field3624, arg2, arg3);
         } else {
            double var22 = Math.atan2((double)var13, (double)var14);
            int var24 = Math.min(arg0.field3405 / 2, arg0.field3557 / 2);
            int var27 = var24 - 6;
            int var25 = (int)(Math.sin(var22) * (double)var27);
            int var26 = (int)(Math.cos(var22) * (double)var27);
            Statics.field5489[arg6].method5223((float)arg0.field3405 / 2.0F + (float)arg2 + (float)var25, (float)arg0.field3557 / 2.0F + (float)arg3 - (float)var26, 4096, (int)(-var22 / 6.283185307179586D * 65535.0D));
         }

      }
   }

   @deob.ObfuscatedName("acs.e(Lem;Lta;IIIILcy;I)V")
   public static void method1089(class425 arg0, class826 arg1, int arg2, int arg3, int arg4, int arg5, class383 arg6) {
      if (arg6 != null) {
         int var7;
         if (Statics.field5998 == 5) {
            var7 = (int)client.field2502 & 16383;
         } else {
            var7 = client.field2519 + (int)client.field2502 & 16383;
         }

         int var8 = Math.max(arg0.field3405 / 2, arg0.field3557 / 2) + 10;
         int var9 = arg4 * arg4 + arg5 * arg5;
         if (var9 <= var8 * var8) {
            int var10 = class603.field5469[var7];
            int var11 = class603.field5471[var7];
            if (Statics.field5998 != 5) {
               var10 = var10 * 256 / (client.field2619 + 256);
               var11 = var11 * 256 / (client.field2619 + 256);
            }

            int var12 = arg4 * var11 + arg5 * var10 >> 14;
            int var13 = arg5 * var11 - arg4 * var10 >> 14;
            arg6.method2393(arg0.field3405 / 2 + arg2 + var12 - arg6.method5259() / 2, arg0.field3557 / 2 + arg3 - var13 - arg6.method5213() / 2, arg1, arg2, arg3);
         }
      }
   }

   @deob.ObfuscatedName("fj.z(Lem;Lta;IIIIILjava/lang/String;Ll;Lvd;II)V")
   private static void method6271(class425 arg0, class826 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, class609 arg8, class883 arg9, int arg10) {
      int var11;
      if (Statics.field5998 == 5) {
         var11 = (int)client.field2502 & 16383;
      } else {
         var11 = client.field2519 + (int)client.field2502 & 16383;
      }

      int var12 = Math.max(arg0.field3405 / 2, arg0.field3557 / 2) + 10;
      int var13 = arg4 * arg4 + arg5 * arg5;
      if (var13 <= var12 * var12) {
         int var14 = class603.field5469[var11];
         int var15 = class603.field5471[var11];
         if (Statics.field5998 != 5) {
            var14 = var14 * 256 / (client.field2619 + 256);
            var15 = var15 * 256 / (client.field2619 + 256);
         }

         int var16 = arg4 * var15 + arg5 * var14 >> 14;
         int var17 = arg5 * var15 - arg4 * var14 >> 14;
         int var18 = arg9.method15388(arg7, 100, (class894[])null);
         int var19 = arg9.method15390(arg7, 100, 0, (class894[])null);
         int var20 = var16 - var18 / 2;
         if (var20 >= -arg0.field3405 && var20 <= arg0.field3405 && var17 >= -arg0.field3557 && var17 <= arg0.field3557) {
            arg8.method8692(arg7, arg0.field3405 / 2 + arg2 + var20, arg0.field3557 / 2 + arg3 - var17 - arg6 - var19, var18, 50, arg10, 0, 1, 0, 0, (class383[])null, (int[])null, arg1, arg2, arg3);
         }
      }
   }
}
