import java.util.ArrayList;
import java.util.Iterator;

@deob.ObfuscatedName("og")
public class class697 {
   @deob.ObfuscatedName("og.x")
   private static class875 field6391 = new class875(16);
   @deob.ObfuscatedName("og.s")
   protected static int field6392 = (int)(Math.random() * 11.0D) - 5;
   @deob.ObfuscatedName("og.l")
   protected static int field6395 = (int)(Math.random() * 17.0D) - 8;
   @deob.ObfuscatedName("og.g")
   private static int[] field6396 = new int[1];
   @deob.ObfuscatedName("og.h")
   private static byte[] field6405 = new byte[1];
   @deob.ObfuscatedName("og.i")
   public static class849 field6415 = new class849();

   public class697() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("og.n(Llc;Lrn;Luf;Ltf;Lpd;Lwl;Lum;)V")
   public static void method10202(class612 arg0, class785 arg1, class858 arg2, class831 arg3, class721 arg4, class918 arg5, class865 arg6) {
      Statics.field6387 = arg0;
      Statics.field6399 = arg1;
      Statics.field6384 = arg2;
      Statics.field6385 = arg3;
      Statics.field6386 = arg4;
      Statics.field6416 = arg5;
      Statics.field6388 = arg6;
      field6391.method15312();
      int var7 = Statics.field6387.method8786("details");
      int[] var8 = Statics.field6387.method8780(var7);
      if (var8 != null) {
         for(int var9 = 0; var9 < var8.length; ++var9) {
            class252 var10 = class252.method10178(Statics.field6387, var7, var8[var9]);
            field6391.method15311(var10, (long)var10.field1666);
         }
      }

      class789.method6469(true, false);
   }

   @deob.ObfuscatedName("og.k()V")
   protected static void method10224() {
      Statics.field6407 = new byte[Statics.field6404 * Statics.field6403];
      Statics.field6410 = new byte[Statics.field6404 * Statics.field6403];
      Statics.field6411 = new byte[Statics.field6404 * Statics.field6403];
      Statics.field6412 = new Object[Statics.field6404 * Statics.field6403];
      Statics.field6390 = new byte[Statics.field6404 * Statics.field6403];
      Statics.field6414 = new ArrayList[3][Statics.field6404 >> 6][Statics.field6403 >> 6];
      Statics.field6406 = new int[Statics.field6399.field7180 + 1];
   }

   @deob.ObfuscatedName("og.d()V")
   public static void method10201() {
      Statics.field6407 = null;
      Statics.field6408 = null;
      Statics.field6409 = null;
      Statics.field6410 = null;
      Statics.field6411 = null;
      Statics.field6412 = null;
      Statics.field6390 = null;
      Statics.field6414 = (ArrayList[][][])null;
      Statics.field6406 = null;
   }

   @deob.ObfuscatedName("og.b(I)V")
   protected static void method10205(int arg0) {
      Statics.field6389 = (class252)field6391.method15322((long)arg0);
   }

   @deob.ObfuscatedName("og.r(II)Lajg;")
   public static class252 method10206(int arg0, int arg1) {
      for(class252 var2 = (class252)field6391.method15313(); var2 != null; var2 = (class252)field6391.method15314()) {
         if (var2.field1667 && var2.method3425(arg0, arg1)) {
            return var2;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("og.p(I)Lajg;")
   public static class252 method10207(int arg0) {
      return (class252)field6391.method15322((long)arg0);
   }

   @deob.ObfuscatedName("og.o(II)Ltu;")
   public static class846 method10208(int arg0, int arg1) {
      class846 var2 = new class846();

      for(class252 var3 = (class252)field6391.method15313(); var3 != null; var3 = (class252)field6391.method15314()) {
         if (var3.field1667 && var3.method3425(arg0, arg1)) {
            var2.method14938(var3);
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("og.a(Lma;II)V")
   protected static void method10227(class637 arg0, int arg1, int arg2) {
      for(int var3 = 0; var3 < Statics.field6399.field7180; ++var3) {
         Statics.field6406[var3 + 1] = method10210(arg0, var3, arg1, arg2);
      }

   }

   @deob.ObfuscatedName("og.x(Lma;III)I")
   private static int method10210(class637 arg0, int arg1, int arg2, int arg3) {
      class792 var4 = Statics.field6399.method14043(arg1);
      if (var4 == null) {
         return 0;
      } else {
         int var5 = var4.field7241;
         if (var5 >= 0 && arg0.method5112(var5).field2331) {
            var5 = -1;
         }

         int var9;
         if (var4.field7237 >= 0) {
            int var6 = var4.field7237;
            int var7 = (var6 & 127) + arg3;
            if (var7 < 0) {
               var7 = 0;
            } else if (var7 > 127) {
               var7 = 127;
            }

            int var8 = (arg2 + var6 & 64512) + (var6 & 896) + var7;
            var9 = -16777216 | Statics.field7263[Statics.method4006(class789.method6522(var8, 96)) & 65535];
         } else if (var5 >= 0) {
            var9 = -16777216 | Statics.field7263[Statics.method4006(class789.method6522(arg0.method5112(var5).field2322, 96)) & 65535];
         } else if (var4.field7233 == -1) {
            var9 = 0;
         } else {
            int var10 = var4.field7233;
            int var11 = (var10 & 127) + arg3;
            if (var11 < 0) {
               var11 = 0;
            } else if (var11 > 127) {
               var11 = 127;
            }

            int var12 = (arg2 + var10 & 64512) + (var10 & 896) + var11;
            var9 = -16777216 | Statics.field7263[Statics.method4006(class789.method6522(var12, 96)) & 65535];
         }

         return var9;
      }
   }

   @deob.ObfuscatedName("og.s(Lra;II)V")
   protected static void method10211(class772 arg0, int arg1, int arg2) {
      class124 var3 = new class124(Statics.field6387.method8823(Statics.field6389.field1659, "area"));
      int var4 = var3.method1688();
      int[] var5 = new int[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         var5[var6] = var3.method1688();
      }

      int var7 = var3.method1688();
      int[] var8 = new int[var7];

      for(int var9 = 0; var9 < var7; ++var9) {
         var8[var9] = var3.method1688();
      }

      while(true) {
         while(var3.field935 < var3.field931.length) {
            if (var3.method1688() == 0) {
               int var10 = var3.method1688();
               int var11 = var3.method1688();

               for(int var12 = 0; var12 < 64; ++var12) {
                  for(int var13 = 0; var13 < 64; ++var13) {
                     int var14 = var10 * 64 + var12 - Statics.field6402;
                     int var15 = var11 * 64 + var13 - Statics.field6418;
                     method10260(arg0, var3, var10, var11, var14, var15, var5, var8);
                  }
               }
            } else {
               int var16 = var3.method1688();
               int var17 = var3.method1688();
               int var18 = var3.method1688();
               int var19 = var3.method1688();

               for(int var20 = 0; var20 < 8; ++var20) {
                  for(int var21 = 0; var21 < 8; ++var21) {
                     int var22 = var16 * 64 + var18 * 8 + var20 - Statics.field6402;
                     int var23 = var17 * 64 + var19 * 8 + var21 - Statics.field6418;
                     method10260(arg0, var3, var16, var17, var22, var23, var5, var8);
                  }
               }
            }
         }

         Object var24 = null;
         Statics.field6408 = new byte[Statics.field6404 * Statics.field6403];
         Statics.field6409 = new short[Statics.field6404 * Statics.field6403];

         for(int var25 = 0; var25 < 3; ++var25) {
            byte[] var26 = new byte[Statics.field6404 * Statics.field6403];

            for(int var27 = 0; var27 < Statics.field6414[var25].length; ++var27) {
               for(int var28 = 0; var28 < Statics.field6414[var25][0].length; ++var28) {
                  ArrayList var29 = Statics.field6414[var25][var27][var28];
                  if (var29 != null) {
                     Iterator var30 = var29.iterator();

                     while(var30.hasNext()) {
                        class685 var31 = (class685)var30.next();
                        var26[(var28 * 64 + var31.field6203) * Statics.field6404 + var27 * 64 + var31.field6204] = (byte)var31.field6206;
                     }
                  }
               }
            }

            method10214(var26, Statics.field6408, Statics.field6409, arg1, arg2);

            for(int var32 = 0; var32 < Statics.field6414[var25].length; ++var32) {
               for(int var33 = 0; var33 < Statics.field6414[var25][0].length; ++var33) {
                  ArrayList var34 = Statics.field6414[var25][var32][var33];
                  if (var34 != null) {
                     Iterator var35 = var34.iterator();

                     while(var35.hasNext()) {
                        class685 var36 = (class685)var35.next();
                        int var37 = (var33 * 64 + var36.field6203) * Statics.field6404 + var32 * 64 + var36.field6204;
                        var36.field6206 = (Statics.field6408[var37] & 255) << 16 | Statics.field6409[var37] & 65535;
                        if (var36.field6206 != 0) {
                           var36.field6206 |= -16777216;
                        }
                     }
                  }
               }
            }
         }

         method10214(Statics.field6407, Statics.field6408, Statics.field6409, arg1, arg2);
         Statics.field6407 = null;
         method10213();
         return;
      }
   }

   @deob.ObfuscatedName("og.l(Lra;Laen;IIII[I[I)V")
   private static void method10260(class772 arg0, class124 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
      int var8 = arg1.method1688();
      if ((var8 & 1) == 0) {
         boolean var9 = (var8 & 2) == 0;
         int var10 = var8 >> 2 & 63;
         if (var10 == 62) {
            return;
         }

         int var11;
         if (var10 == 63) {
            var11 = arg1.method1688();
         } else if (var9) {
            var11 = arg6[var10];
         } else {
            var11 = arg7[var10];
         }

         if (var9) {
            Statics.field6407[Statics.field6404 * arg5 + arg4] = (byte)var11;
            Statics.field6410[Statics.field6404 * arg5 + arg4] = 0;
         } else {
            Statics.field6410[Statics.field6404 * arg5 + arg4] = (byte)var11;
            Statics.field6411[Statics.field6404 * arg5 + arg4] = 0;
            Statics.field6407[Statics.field6404 * arg5 + arg4] = arg1.method1623();
         }
      } else {
         int var12 = (var8 >> 1 & 3) + 1;
         boolean var13 = (var8 & 8) != 0;
         boolean var14 = (var8 & 16) != 0;

         for(int var15 = 0; var15 < var12; ++var15) {
            int var16 = arg1.method1688();
            int var17 = 0;
            int var18 = 0;
            if (var13) {
               var17 = arg1.method1688();
               var18 = arg1.method1688();
            }

            int var19 = 0;
            if (var14) {
               var19 = arg1.method1688();
            }

            if (var15 == 0) {
               Statics.field6407[Statics.field6404 * arg5 + arg4] = (byte)var16;
               Statics.field6410[Statics.field6404 * arg5 + arg4] = (byte)var17;
               Statics.field6411[Statics.field6404 * arg5 + arg4] = (byte)var18;
               if (var19 == 1) {
                  Statics.field6412[Statics.field6404 * arg5 + arg4] = new Integer(arg1.method1608());
                  Statics.field6390[Statics.field6404 * arg5 + arg4] = arg1.method1623();
               } else if (var19 > 1) {
                  int[] var20 = new int[var19];
                  byte[] var21 = new byte[var19];

                  for(int var22 = 0; var22 < var19; ++var22) {
                     var20[var22] = arg1.method1608();
                     var21[var22] = arg1.method1623();
                  }

                  Statics.field6412[Statics.field6404 * arg5 + arg4] = new class104(var20, var21);
               }
            } else {
               int[] var23 = null;
               byte[] var24 = null;
               if (var19 > 0) {
                  var23 = new int[var19];
                  var24 = new byte[var19];

                  for(int var25 = 0; var25 < var19; ++var25) {
                     var23[var25] = arg1.method1608();
                     var24[var25] = arg1.method1623();
                  }
               }

               if (Statics.field6414[var15 - 1][arg2 - (Statics.field6402 >> 6)][arg3 - (Statics.field6418 >> 6)] == null) {
                  Statics.field6414[var15 - 1][arg2 - (Statics.field6402 >> 6)][arg3 - (Statics.field6418 >> 6)] = new ArrayList();
               }

               class685 var26 = new class685(arg4 & 63, arg5 & 63, var16, var17, var18, var23, var24);
               Statics.field6414[var15 - 1][arg2 - (Statics.field6402 >> 6)][arg3 - (Statics.field6418 >> 6)].add(var26);
            }
         }
      }

   }

   @deob.ObfuscatedName("og.u()V")
   private static void method10213() {
      for(int var0 = 0; var0 < Statics.field6404; ++var0) {
         for(int var1 = 0; var1 < Statics.field6403; ++var1) {
            Object var2 = Statics.field6412[Statics.field6404 * var1 + var0];
            if (var2 != null) {
               if (var2 instanceof class104) {
                  class104 var3 = (class104)var2;
                  if (var3 != null) {
                     for(int var4 = 0; var4 < var3.field797.length; ++var4) {
                        class843 var5 = Statics.field6385.method14651(var3.field797[var4]);
                        int var6 = var5.field8603;
                        if (var5.field8609 != null) {
                           class843 var7 = var5.method14853(Statics.field6388);
                           if (var7 != null) {
                              var6 = var7.field8603;
                           }
                        }

                        if (var6 != -1) {
                           class99 var8 = new class99(var6);
                           var8.field767 = var0;
                           var8.field770 = var1;
                           field6415.method14959(var8);
                        }
                     }
                  }
               } else {
                  Integer var9 = (Integer)var2;
                  class843 var10 = Statics.field6385.method14651(var9);
                  int var11 = var10.field8603;
                  if (var10.field8609 != null) {
                     class843 var12 = var10.method14853(Statics.field6388);
                     if (var12 != null) {
                        var11 = var12.field8603;
                     }
                  }

                  if (var11 != -1) {
                     class99 var13 = new class99(var11);
                     var13.field767 = var0;
                     var13.field770 = var1;
                     field6415.method14959(var13);
                  }
               }
            }
         }
      }

      for(int var14 = 0; var14 < 3; ++var14) {
         for(int var15 = 0; var15 < Statics.field6414[0].length; ++var15) {
            label89:
            for(int var16 = 0; var16 < Statics.field6414[0][0].length; ++var16) {
               ArrayList var17 = Statics.field6414[var14][var15][var16];
               if (var17 != null) {
                  Iterator var18 = var17.iterator();

                  while(true) {
                     class685 var19;
                     do {
                        if (!var18.hasNext()) {
                           continue label89;
                        }

                        var19 = (class685)var18.next();
                     } while(var19.field6207 == null);

                     for(int var20 = 0; var20 < var19.field6207.length; ++var20) {
                        class843 var21 = Statics.field6385.method14651(var19.field6207[var20]);
                        int var22 = var21.field8603;
                        if (var21.field8609 != null) {
                           class843 var23 = var21.method14853(Statics.field6388);
                           if (var23 != null) {
                              var22 = var23.field8603;
                           }
                        }

                        if (var22 != -1) {
                           class99 var24 = new class99(var22);
                           var24.field767 = ((Statics.field6402 >> 6) + var15) * 64 + var19.field6204 - Statics.field6402;
                           var24.field770 = ((Statics.field6418 >> 6) + var16) * 64 + var19.field6203 - Statics.field6418;
                           field6415.method14959(var24);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("og.v([B[B[SII)V")
   private static void method10214(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
      int[] var5 = new int[Statics.field6403];
      int[] var6 = new int[Statics.field6403];
      int[] var7 = new int[Statics.field6403];
      int[] var8 = new int[Statics.field6403];
      int[] var9 = new int[Statics.field6403];

      for(int var10 = -5; var10 < Statics.field6404; ++var10) {
         int var11 = var10 + 5;
         int var12 = var10 - 5;

         for(int var13 = 0; var13 < Statics.field6403; ++var13) {
            int var10002;
            if (var11 < Statics.field6404) {
               int var14 = arg0[Statics.field6404 * var13 + var11] & 255;
               if (var14 > 0) {
                  class863 var15 = Statics.field6384.method15099(var14 - 1);
                  var5[var13] += var15.field8802;
                  var6[var13] += var15.field8809;
                  var7[var13] += var15.field8807;
                  var8[var13] += var15.field8810;
                  var10002 = var9[var13]++;
               }
            }

            if (var12 >= 0) {
               int var16 = arg0[Statics.field6404 * var13 + var12] & 255;
               if (var16 > 0) {
                  class863 var17 = Statics.field6384.method15099(var16 - 1);
                  var5[var13] -= var17.field8802;
                  var6[var13] -= var17.field8809;
                  var7[var13] -= var17.field8807;
                  var8[var13] -= var17.field8810;
                  var10002 = var9[var13]--;
               }
            }
         }

         if (var10 >= 0) {
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;

            for(int var23 = -5; var23 < Statics.field6403; ++var23) {
               int var24 = var23 + 5;
               if (var24 < Statics.field6403) {
                  var18 += var5[var24];
                  var19 += var6[var24];
                  var20 += var7[var24];
                  var21 += var8[var24];
                  var22 += var9[var24];
               }

               int var25 = var23 - 5;
               if (var25 >= 0) {
                  var18 -= var5[var25];
                  var19 -= var6[var25];
                  var20 -= var7[var25];
                  var21 -= var8[var25];
                  var22 -= var9[var25];
               }

               if (var23 >= 0 && var22 > 0) {
                  if ((arg0[Statics.field6404 * var23 + var10] & 255) == 0) {
                     int var26 = Statics.field6404 * var23 + var10;
                     arg1[var26] = 0;
                     arg2[var26] = 0;
                  } else {
                     int var27 = var21 == 0 ? 0 : class789.method3944(var18 * 256 / var21, var19 / var22, var20 / var22);
                     int var28 = (var27 & 127) + arg4;
                     if (var28 < 0) {
                        var28 = 0;
                     } else if (var28 > 127) {
                        var28 = 127;
                     }

                     int var29 = (arg3 + var27 & 64512) + (var27 & 896) + var28;
                     int var30 = Statics.field6404 * var23 + var10;
                     int var31 = Statics.field7263[Statics.method4006(class789.method15840(var29, 96)) & 65535];
                     arg1[var30] = (byte)(var31 >> 16 & 255);
                     arg2[var30] = (short)(var31 & 65535);
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("og.g()V")
   protected static void method10249() {
      int[] var0 = new int[3];

      for(int var1 = 0; var1 < Statics.field6400.field6465; ++var1) {
         boolean var2 = Statics.field6389.method3412(Statics.field6400.field6466[var1] >> 28 & 3, Statics.field6400.field6466[var1] >> 14 & 16383, Statics.field6400.field6466[var1] & 16383, var0);
         if (var2) {
            class99 var3 = new class99(Statics.field6400.field6464[var1]);
            var3.field767 = var0[1] - Statics.field6402;
            var3.field770 = var0[2] - Statics.field6418;
            field6415.method14959(var3);
         }
      }

   }

   @deob.ObfuscatedName("og.h(IIIIIIII)V")
   protected static void method10216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      Statics.field6393 = arg0 - Statics.field6402;
      Statics.field6397 = arg1 - Statics.field6418;
      Statics.field6413 = arg2 - Statics.field6402;
      Statics.field6401 = arg3 - Statics.field6418;
      Statics.field6383 = arg4;
      Statics.field6420 = arg5;
      Statics.field6421 = arg6;
      Statics.field6422 = arg7;
   }

   @deob.ObfuscatedName("og.e(Lra;)V")
   protected static void method10217(class772 arg0) {
      int var1 = Statics.field6413 - Statics.field6393;
      int var2 = Statics.field6397 - Statics.field6401;
      int var3 = (Statics.field6421 - Statics.field6383 << 16) / var1;
      int var4 = (Statics.field6422 - Statics.field6420 << 16) / var2;
      method10218(arg0, var3, var4, 0, 0);
   }

   @deob.ObfuscatedName("og.z(Lra;IIII)V")
   private static void method10218(class772 arg0, int arg1, int arg2, int arg3, int arg4) {
      int var5 = Statics.field6413 - Statics.field6393;
      int var6 = Statics.field6397 - Statics.field6401;
      if (Statics.field6413 < Statics.field6404) {
         ++var5;
      }

      if (Statics.field6397 < Statics.field6403) {
         ++var6;
      }

      for(int var7 = 0; var7 < var5; ++var7) {
         int var8 = (arg1 * var7 + arg3 >> 16) + Statics.field6383;
         int var9 = ((var7 + 1) * arg1 + arg3 >> 16) + Statics.field6383;
         int var10 = var9 - var8;
         if (var10 > 0) {
            int var11 = Statics.field6393 + var7;
            if (var11 >= 0 && var11 < Statics.field6404) {
               for(int var12 = 0; var12 < var6; ++var12) {
                  int var13 = Statics.field6422 - ((var12 + 1) * arg2 + arg4 >> 16);
                  int var14 = Statics.field6422 - (arg2 * var12 + arg4 >> 16);
                  int var15 = var14 - var13;
                  if (var15 > 0) {
                     int var16 = Statics.field6401 + var12;
                     int var17 = Statics.field6404 * var16 + var11;
                     int var18 = 0;
                     int var19 = 0;
                     Object var20 = null;
                     if (var16 >= 0 && var16 < Statics.field6403) {
                        var18 = (Statics.field6408[var17] & 255) << 16 | Statics.field6409[var17] & 65535;
                        if (var18 != 0) {
                           var18 |= -16777216;
                        }

                        var19 = Statics.field6410[var17] & 255;
                        var20 = Statics.field6412[var17];
                     }

                     if (var18 == 0 && var19 == 0 && var20 == null) {
                        int var21;
                        if (Statics.field6389.field1663 != -1) {
                           var21 = -16777216 | Statics.field6389.field1663;
                        } else if ((Statics.field6397 + var12 & 4) != (Statics.field6393 + var7 & 4)) {
                           var21 = -11840664;
                        } else {
                           var21 = Statics.field6406[Statics.field6399.field7183 + 1];
                        }

                        if (var21 == 0) {
                           var21 = -16777216;
                        }

                        arg0.method7513(var8, var13, var10, var15, var21, 0);
                     } else if (var20 != null) {
                        if (var20 instanceof class104) {
                           class104 var22 = (class104)var20;
                           if (var22 != null) {
                              method10219(arg0, var8, var13, var10, var15, var18, var19, Statics.field6411[var17], var22.field797, var22.field798, true);
                           }
                        } else {
                           Integer var23 = (Integer)var20;
                           field6396[0] = var23;
                           field6405[0] = Statics.field6390[var17];
                           method10219(arg0, var8, var13, var10, var15, var18, var19, Statics.field6411[var17], field6396, field6405, true);
                        }
                     } else {
                        method10219(arg0, var8, var13, var10, var15, var18, var19, Statics.field6411[var17], (int[])null, (byte[])null, true);
                     }
                  }
               }
            } else {
               for(int var24 = 0; var24 < var6; ++var24) {
                  int var25 = Statics.field6422 - ((var24 + 1) * arg2 + arg4 >> 16);
                  int var26 = Statics.field6422 - (arg2 * var24 + arg4 >> 16);
                  int var27 = var26 - var25;
                  int var28;
                  if (Statics.field6389.field1663 != -1) {
                     var28 = -16777216 | Statics.field6389.field1663;
                  } else if ((Statics.field6397 + var24 & 4) != (Statics.field6393 + var7 & 4)) {
                     var28 = -11840664;
                  } else {
                     var28 = Statics.field6406[Statics.field6399.field7183 + 1];
                  }

                  if (var28 == 0) {
                     var28 = -16777216;
                  }

                  arg0.method7513(var8, var25, var10, var27, var28, 0);
               }
            }
         }
      }

      for(int var29 = -16; var29 < var5 + 16; ++var29) {
         int var30 = (arg1 * var29 + arg3 >> 16) + Statics.field6383;
         int var31 = ((var29 + 1) * arg1 + arg3 >> 16) + Statics.field6383;
         int var32 = var31 - var30;
         if (var32 > 0) {
            int var33 = Statics.field6393 + var29;
            if (var33 >= 0 && var33 < Statics.field6404) {
               for(int var34 = -16; var34 < var6 + 16; ++var34) {
                  int var35 = Statics.field6422 - ((var34 + 1) * arg2 + arg4 >> 16);
                  int var36 = Statics.field6422 - (arg2 * var34 + arg4 >> 16);
                  int var37 = var36 - var35;
                  if (var37 > 0) {
                     int var38 = Statics.field6401 + var34;
                     if (var38 >= 0 && var38 < Statics.field6403) {
                        Object var39 = Statics.field6412[Statics.field6404 * var38 + var33];
                        if (var39 != null) {
                           if (var39 instanceof class104) {
                              class104 var40 = (class104)var39;
                              if (var40 != null) {
                                 method10220(arg0, var30, var35, var32, var37, var40.field797, var40.field798);
                              }
                           } else {
                              Integer var41 = (Integer)var39;
                              field6396[0] = var41;
                              field6405[0] = Statics.field6390[Statics.field6404 * var38 + var33];
                              method10220(arg0, var30, var35, var32, var37, field6396, field6405);
                           }
                        } else {
                           method10220(arg0, var30, var35, var32, var37, (int[])null, (byte[])null);
                        }
                     }
                  }
               }
            }
         }
      }

      int var42 = Statics.field6393 >> 6;
      int var43 = Statics.field6401 >> 6;
      if (var42 < 0) {
         var42 = 0;
      }

      if (var43 < 0) {
         var43 = 0;
      }

      int var44 = Statics.field6413 >> 6;
      int var45 = Statics.field6397 >> 6;
      if (var44 >= Statics.field6414[0].length) {
         var44 = Statics.field6414[0].length - 1;
      }

      if (var45 >= Statics.field6414[0][0].length) {
         var45 = Statics.field6414[0][0].length - 1;
      }

      for(int var46 = 0; var46 < 3; ++var46) {
         for(int var47 = var42; var47 <= var44; ++var47) {
            for(int var48 = var43; var48 <= var45; ++var48) {
               ArrayList var49 = Statics.field6414[var46][var47][var48];
               if (var49 != null) {
                  int var50 = ((Statics.field6402 >> 6) + var47) * 64;
                  int var51 = ((Statics.field6418 >> 6) + var48) * 64;
                  Iterator var52 = var49.iterator();

                  while(var52.hasNext()) {
                     class685 var53 = (class685)var52.next();
                     int var54 = var53.field6204 + var50 - Statics.field6402 - Statics.field6393;
                     int var55 = var53.field6203 + var51 - Statics.field6418 - Statics.field6401;
                     int var56 = (arg1 * var54 + arg3 >> 16) + Statics.field6383;
                     int var57 = ((var54 + 1) * arg1 + arg3 >> 16) + Statics.field6383;
                     int var58 = Statics.field6422 - ((var55 + 1) * arg2 + arg4 >> 16);
                     int var59 = Statics.field6422 - (arg2 * var55 + arg4 >> 16);
                     method10219(arg0, var56, var58, var57 - var56, var59 - var58, var53.field6206, var53.field6205 & 255, var53.field6202, var53.field6207, var53.field6208, false);
                  }
               }
            }
         }

         for(int var60 = var42; var60 <= var44; ++var60) {
            for(int var61 = var43; var61 <= var45; ++var61) {
               ArrayList var62 = Statics.field6414[var46][var60][var61];
               if (var62 != null) {
                  int var63 = ((Statics.field6402 >> 6) + var60) * 64;
                  int var64 = ((Statics.field6418 >> 6) + var61) * 64;
                  Iterator var65 = var62.iterator();

                  while(var65.hasNext()) {
                     class685 var66 = (class685)var65.next();
                     int var67 = var66.field6204 + var63 - Statics.field6402 - Statics.field6393;
                     int var68 = var66.field6203 + var64 - Statics.field6418 - Statics.field6401;
                     int var69 = (arg1 * var67 + arg3 >> 16) + Statics.field6383;
                     int var70 = ((var67 + 1) * arg1 + arg3 >> 16) + Statics.field6383;
                     int var71 = Statics.field6422 - ((var68 + 1) * arg2 + arg4 >> 16);
                     int var72 = Statics.field6422 - (arg2 * var68 + arg4 >> 16);
                     method10220(arg0, var69, var71, var70 - var69, var72 - var71, var66.field6207, var66.field6208);
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("og.m(Lra;IIIIIII[I[BZ)V")
   private static void method10219(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, boolean arg10) {
      if (arg10 || arg5 != 0 || arg6 > 0) {
         if (arg6 == 0) {
            arg0.method7513(arg1, arg2, arg3, arg4, arg5, 0);
         } else {
            int var11 = arg7 & 63;
            if (var11 != 0 && arg3 > 1 && arg4 > 1) {
               int var12 = arg10 ? 0 : 1;
               class666.method7397(arg0, Statics.field6394, Statics.field6417, arg1, arg2, arg5, Statics.field6406[arg6], arg3, arg4, var11, arg7 >> 6 & 3, var12);
            } else {
               int var13 = Statics.field6406[arg6];
               if (arg10 || var13 != 0) {
                  arg0.method7513(arg1, arg2, arg3, arg4, var13, 0);
               }
            }
         }
      }

      if (arg8 != null) {
         int var14;
         if (arg3 == 1) {
            var14 = arg1;
         } else {
            var14 = arg1 + arg3 - 1;
         }

         int var15;
         if (arg4 == 1) {
            var15 = arg2;
         } else {
            var15 = arg2 + arg4 - 1;
         }

         for(int var16 = 0; var16 < arg8.length; ++var16) {
            int var17 = arg9[var16] & 63;
            if (class850.field8735.field8736 == var17 || class850.field8715.field8736 == var17 || class850.field8725.field8736 == var17 || class850.field8717.field8736 == var17) {
               class843 var18 = Statics.field6385.method14651(arg8[var16]);
               if (var18.field8613 == -1) {
                  int var19 = -3355444;
                  if (var18.field8638 == 1) {
                     var19 = -3407872;
                  }

                  int var20 = arg9[var16] >> 6 & 3;
                  if (class850.field8735.field8736 == var17) {
                     if (var20 == 0) {
                        arg0.method7516(arg1, arg2, arg4, var19, 0);
                     } else if (var20 == 1) {
                        arg0.method7514(arg1, arg2, arg3, var19, 0);
                     } else if (var20 == 2) {
                        arg0.method7516(var14, arg2, arg4, var19, 0);
                     } else {
                        arg0.method7514(arg1, var15, arg3, var19, 0);
                     }
                  } else if (class850.field8715.field8736 == var17) {
                     if (var20 == 0) {
                        arg0.method7516(arg1, arg2, arg4, -1, 0);
                        arg0.method7514(arg1, arg2, arg3, var19, 0);
                     } else if (var20 == 1) {
                        arg0.method7516(var14, arg2, arg4, -1, 0);
                        arg0.method7514(arg1, arg2, arg3, var19, 0);
                     } else if (var20 == 2) {
                        arg0.method7516(var14, arg2, arg4, -1, 0);
                        arg0.method7514(arg1, var15, arg3, var19, 0);
                     } else {
                        arg0.method7516(arg1, arg2, arg4, -1, 0);
                        arg0.method7514(arg1, var15, arg3, var19, 0);
                     }
                  } else if (class850.field8725.field8736 == var17) {
                     if (var20 == 0) {
                        arg0.method7514(arg1, arg2, 1, var19, 0);
                     } else if (var20 == 1) {
                        arg0.method7514(var14, arg2, 1, var19, 0);
                     } else if (var20 == 2) {
                        arg0.method7514(var14, var15, 1, var19, 0);
                     } else {
                        arg0.method7514(arg1, var15, 1, var19, 0);
                     }
                  } else if (class850.field8717.field8736 == var17) {
                     if (var20 != 0 && var20 != 2) {
                        for(int var21 = 0; var21 < arg4; ++var21) {
                           arg0.method7514(arg1 + var21, arg2 + var21, 1, var19, 0);
                        }
                     } else {
                        for(int var22 = 0; var22 < arg4; ++var22) {
                           arg0.method7514(arg1 + var22, var15 - var22, 1, var19, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("og.i(Lra;IIII[I[B)V")
   private static void method10220(class772 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6) {
      if (arg5 != null) {
         for(int var7 = 0; var7 < arg5.length; ++var7) {
            class843 var8 = Statics.field6385.method14651(arg5[var7]);
            int var9 = var8.field8613;
            if (var9 != -1) {
               class890 var10 = Statics.field6416.method15830(var9);
               class383 var11 = var10.method15498(arg0, var8.field8605 ? arg6[var7] >> 6 & 3 : 0, var8.field8607 ? var8.field8608 : false);
               if (var11 != null) {
                  int var12 = arg3 * var11.method5259() >> 2;
                  int var13 = arg4 * var11.method5213() >> 2;
                  if (var10.field9078) {
                     int var14 = var8.field8585;
                     int var15 = var8.field8570;
                     if ((arg6[var7] >> 6 & 1) == 1) {
                        int var16 = var14;
                        var14 = var15;
                        var15 = var16;
                     }

                     var12 = arg3 * var14;
                     var13 = arg4 * var15;
                  }

                  if (var12 != 0 && var13 != 0) {
                     if (var10.field9080 != 0) {
                        var11.method5263(arg1, arg2 - var13 + arg4, var12, var13, 0, -16777216 | var10.field9080, 1);
                     } else {
                        var11.method5222(arg1, arg2 - var13 + arg4, var12, var13);
                     }
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("og.t(Lra;)Ltx;")
   protected static class849 method10221(class772 arg0) {
      int var1 = Statics.field6413 - Statics.field6393;
      int var2 = Statics.field6397 - Statics.field6401;
      int var3 = (Statics.field6421 - Statics.field6383 << 16) / var1;
      int var4 = (Statics.field6422 - Statics.field6420 << 16) / var2;
      return method10264(arg0, var3, var4, 0, 0);
   }

   @deob.ObfuscatedName("og.c(Lra;IIII)Ltx;")
   private static class849 method10264(class772 arg0, int arg1, int arg2, int arg3, int arg4) {
      for(class99 var5 = (class99)field6415.method14964(); var5 != null; var5 = (class99)field6415.method15006()) {
         method10222(arg0, var5, arg1, arg2, arg3, arg4);
      }

      return field6415;
   }

   @deob.ObfuscatedName("og.w(Lra;Ladp;IIII)V")
   private static void method10222(class772 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5) {
      arg1.field771 = ((arg1.field767 - Statics.field6393) * arg2 + arg4 >> 16) + Statics.field6383;
      arg1.field772 = Statics.field6422 - ((arg1.field770 - Statics.field6401) * arg3 + arg5 >> 16);
   }

   @deob.ObfuscatedName("og.q(Lra;Ladp;Lpp;)V")
   protected static void method10261(class772 arg0, class99 arg1, class733 arg2) {
      if (arg2.field6754 != null) {
         int[] var3 = new int[arg2.field6754.length];

         for(int var4 = 0; var4 < var3.length / 2; ++var4) {
            int var5 = arg1.field767 + arg2.field6754[var4 * 2];
            int var6 = arg1.field770 + arg2.field6754[var4 * 2 + 1];
            var3[var4 * 2] = (Statics.field6421 - Statics.field6383) * (var5 - Statics.field6393) / (Statics.field6413 - Statics.field6393) + Statics.field6383;
            var3[var4 * 2 + 1] = Statics.field6422 - (Statics.field6422 - Statics.field6420) * (var6 - Statics.field6401) / (Statics.field6397 - Statics.field6401);
         }

         class388.method5354(arg0, var3, arg2.field6757);
         if (arg2.field6750 > 0) {
            for(int var7 = 0; var7 < var3.length / 2 - 1; ++var7) {
               int var8 = var3[var7 * 2];
               int var9 = var3[var7 * 2 + 1];
               int var10 = var3[(var7 + 1) * 2];
               int var11 = var3[(var7 + 1) * 2 + 1];
               if (var10 < var8) {
                  int var12 = var8;
                  int var13 = var9;
                  var8 = var10;
                  var9 = var11;
                  var10 = var12;
                  var11 = var13;
               } else if (var8 == var10 && var11 < var9) {
                  int var14 = var9;
                  var9 = var11;
                  var11 = var14;
               }

               arg0.method7522(var8, var9, var10, var11, arg2.field6763[arg2.field6764[var7] & 255], 1, arg2.field6750, arg2.field6752, arg2.field6760);
            }

            int var15 = var3[var3.length - 2];
            int var16 = var3[var3.length - 1];
            int var17 = var3[0];
            int var18 = var3[1];
            if (var17 < var15) {
               int var19 = var15;
               int var20 = var16;
               var15 = var17;
               var16 = var18;
               var17 = var19;
               var18 = var20;
            } else if (var15 == var17 && var18 < var16) {
               int var21 = var16;
               var16 = var18;
               var18 = var21;
            }

            arg0.method7522(var15, var16, var17, var18, arg2.field6763[arg2.field6764[arg2.field6764.length - 1] & 255], 1, arg2.field6750, arg2.field6752, arg2.field6760);
         } else {
            for(int var22 = 0; var22 < var3.length / 2 - 1; ++var22) {
               arg0.method11529(var3[var22 * 2], var3[var22 * 2 + 1], var3[(var22 + 1) * 2], var3[(var22 + 1) * 2 + 1], arg2.field6763[arg2.field6764[var22] & 255]);
            }

            arg0.method11529(var3[var3.length - 2], var3[var3.length - 1], var3[0], var3[1], arg2.field6763[arg2.field6764[arg2.field6764.length - 1] & 255]);
         }
      }

   }
}
