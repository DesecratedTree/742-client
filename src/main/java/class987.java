import java.util.Iterator;
import java.util.List;
import net.ClientProt;
import net.ClientPacket;

@deob.ObfuscatedName("z")
public class class987 {
   @deob.ObfuscatedName("z.b")
   private static int field10489 = 16;
   @deob.ObfuscatedName("z.o")
   public static boolean field10492 = false;
   @deob.ObfuscatedName("z.a")
   private static boolean field10513 = false;
   @deob.ObfuscatedName("z.x")
   private static class256 field10494 = null;
   @deob.ObfuscatedName("z.v")
   private static int field10517 = 0;
   @deob.ObfuscatedName("z.m")
   public static int field10501 = 0;
   @deob.ObfuscatedName("z.i")
   public static int field10502 = 0;
   @deob.ObfuscatedName("z.t")
   private static class849 field10487 = new class849();
   @deob.ObfuscatedName("z.c")
   private static class875 field10504 = new class875(16);
   @deob.ObfuscatedName("z.w")
   private static class846 field10505 = new class846();
   @deob.ObfuscatedName("z.q")
   private static class849 field10499 = new class849();
   @deob.ObfuscatedName("z.y")
   private static class849 field10507 = new class849();
   @deob.ObfuscatedName("z.j")
   public static class737 field10508 = new class737(30);
   @deob.ObfuscatedName("z.aw")
   public static class425 field10503 = null;
   @deob.ObfuscatedName("z.al")
   public static int field10495 = -1;
   @deob.ObfuscatedName("z.an")
   public static int field10510 = -1;
   @deob.ObfuscatedName("z.ag")
   private static int field10486 = -1;
   @deob.ObfuscatedName("z.ak")
   private static int field10516 = -1;
   @deob.ObfuscatedName("z.aa")
   private static int field10514 = 0;
   @deob.ObfuscatedName("z.ao")
   private static int field10488 = 0;
   @deob.ObfuscatedName("z.ab")
   private static class597 field10498 = null;
   @deob.ObfuscatedName("z.ae")
   public static class597 field10491 = new class597();
   @deob.ObfuscatedName("z.az")
   private static class583 field10518 = new class583();
   @deob.ObfuscatedName("z.aq")
   public static boolean field10527 = false;
   @deob.ObfuscatedName("z.bk")
   private static int field10521 = 0;
   @deob.ObfuscatedName("z.bj")
   public static int field10522 = -1;
   @deob.ObfuscatedName("z.bv")
   public static class737 field10523 = new class737(8);
   @deob.ObfuscatedName("z.be")
   private static float[] field10524 = new float[4];

   private class987() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("px.n(I)Z")
   private static boolean method10952() {
      return method14037(Statics.field3302.field7245);
   }

   @deob.ObfuscatedName("agh.k(I)Z")
   private static boolean method2349() {
      return method14037(Statics.field3302.field7248);
   }

   @deob.ObfuscatedName("rn.d(I)Z")
   private static boolean method14057() {
      return method14037(Statics.field3302.field7250);
   }

   @deob.ObfuscatedName("rl.b(Lpj;I)Z")
   private static boolean method14037(class727 arg0) {
      return method8526(arg0, (class102)null);
   }

   @deob.ObfuscatedName("kp.r(Lpe;Lads;I)Z")
   private static boolean method8526(class722 arg0, class102 arg1) {
      return arg0 != null && arg0.method10704(arg1, client.field2441, client.field2458, Statics.field2111);
   }

   @deob.ObfuscatedName("uu.p(B)V")
   public static void method15289() {
      Statics.field10493 = new class261(class881.field8888.method15374(Statics.field243), "", client.field2451, 1006, -1, 0L, 0, 0, true, false, 0L, true);
   }

   @deob.ObfuscatedName("qi.o(I)V")
   public static void method11189() {
      if (client.field2475 < 0) {
         class883 var0 = method11659();
         if (!field10492) {
            field10513 = field10522 != -1 && field10501 >= field10522 || field10501 * field10489 + (field10527 ? 26 : 22) > Statics.field6354;
         }

         field10499.method14958();
         field10507.method14958();

         for(class261 var1 = (class261)field10487.method14964(); var1 != null; var1 = (class261)field10487.method15006()) {
            int var2 = var1.field1747;
            if (var2 < 1000) {
               var1.method9864();
               if (var2 != 59 && var2 != 2 && var2 != 8 && var2 != 17 && var2 != 15 && var2 != 16 && var2 != 58) {
                  field10499.method14959(var1);
               } else {
                  field10507.method14959(var1);
               }
            }
         }

         field10499.method14963(field10487);
         field10507.method14963(field10487);
         if (field10501 > 1) {
            if (method2349() && field10501 > 2) {
               Statics.field6368 = (class261)field10487.field8711.field6135.field6135;
            } else {
               Statics.field6368 = (class261)field10487.field8711.field6135;
            }

            Statics.field10500 = (class261)field10487.field8711.field6135;
            if (field10501 > 2) {
               Statics.field6367 = (class261)Statics.field10500.field6135;
            } else {
               Statics.field6367 = null;
            }
         } else {
            Statics.field6368 = null;
            Statics.field10500 = null;
            Statics.field6367 = null;
         }

         class102 var3 = (class102)client.field2434.method14964();
         int var4;
         int var5;
         if (var3 != null) {
            var4 = var3.method1375();
            var5 = var3.method1367();
         } else {
            var4 = Statics.field336.method1896();
            var5 = Statics.field336.method1897();
         }

         if (field10492) {
            if (method8526(Statics.field3302.field7244, var3)) {
               if (field10494 != null && var4 >= Statics.field8746 && var4 <= Statics.field9260 + Statics.field8746 && var5 >= Statics.field9398 && var5 <= Statics.field9398 + Statics.field2959) {
                  int var6 = -1;

                  for(int var7 = 0; var7 < field10494.field1707; ++var7) {
                     if (field10527) {
                        int var8 = field10489 * var7 + var0.field9061 + Statics.field9398 + 20 + 1;
                        if (var5 > var8 - var0.field9061 - 1 && var5 < var0.field9062 + var8) {
                           var6 = var7;
                        }
                     } else {
                        int var9 = field10489 * var7 + Statics.field9398 + 31;
                        if (var5 > var9 - 13 && var5 < var9 + 3) {
                           var6 = var7;
                        }
                     }
                  }

                  if (var6 != -1) {
                     int var10 = 0;
                     class833 var11 = new class833(field10494.field1709);

                     for(class261 var12 = (class261)var11.method14668(); var12 != null; var12 = (class261)var11.next()) {
                        if (var6 == var10) {
                           method15566(var12, var4, var5);
                           break;
                        }

                        ++var10;
                     }
                  }

                  method11730();
               } else if (var4 >= Statics.field9533 && var4 <= Statics.field9533 + Statics.field8870 && var5 >= Statics.field3653 && var5 <= Statics.field5194 + Statics.field3653) {
                  if (!field10513) {
                     int var13 = -1;

                     for(int var14 = 0; var14 < field10501; ++var14) {
                        if (field10527) {
                           int var15 = field10489 * (field10501 - 1 - var14) + var0.field9061 + Statics.field3653 + 20 + 1;
                           if (var5 > var15 - var0.field9061 - 1 && var5 < var0.field9062 + var15) {
                              var13 = var14;
                           }
                        } else {
                           int var16 = field10489 * (field10501 - 1 - var14) + Statics.field3653 + 31;
                           if (var5 > var16 - 13 && var5 < var16 + 3) {
                              var13 = var14;
                           }
                        }
                     }

                     if (var13 != -1) {
                        int var17 = 0;
                        class844 var18 = new class844(field10487);

                        for(class261 var19 = (class261)var18.method14915(); var19 != null; var19 = (class261)var18.next()) {
                           if (var13 == var17) {
                              method15566(var19, var4, var5);
                              break;
                           }

                           ++var17;
                        }
                     }

                     method11730();
                  } else {
                     int var20 = -1;

                     for(int var21 = 0; var21 < field10502; ++var21) {
                        if (field10527) {
                           int var22 = field10489 * var21 + var0.field9061 + Statics.field3653 + 20 + 1;
                           if (var5 > var22 - var0.field9061 - 1 && var5 < var0.field9062 + var22) {
                              var20 = var21;
                              break;
                           }
                        } else {
                           int var23 = field10489 * var21 + Statics.field3653 + 31;
                           if (var5 > var23 - 13 && var5 < var23 + 3) {
                              var20 = var21;
                              break;
                           }
                        }
                     }

                     if (var20 != -1) {
                        int var24 = 0;
                        class833 var25 = new class833(field10505);

                        for(class256 var26 = (class256)var25.method14668(); var26 != null; var26 = (class256)var25.next()) {
                           if (var20 == var24) {
                              method15566((class261)var26.field1709.field8664.field809, var4, var5);
                              method11730();
                              break;
                           }

                           ++var24;
                        }
                     }
                  }
               }
            } else {
               boolean var27 = false;
               if (field10494 != null) {
                  if (var4 >= Statics.field8746 - 10 && var4 <= Statics.field9260 + Statics.field8746 + 10 && var5 >= Statics.field9398 - 10 && var5 <= Statics.field9398 + Statics.field2959 + 10) {
                     var27 = true;
                  } else {
                     method16086();
                  }
               }

               if (!var27) {
                  if (var4 >= Statics.field9533 - 10 && var4 <= Statics.field9533 + Statics.field8870 + 10 && var5 >= Statics.field3653 - 10 && var5 <= Statics.field5194 + Statics.field3653 + 10) {
                     if (field10513) {
                        int var28 = -1;
                        int var29 = -1;

                        for(int var30 = 0; var30 < field10502; ++var30) {
                           if (field10527) {
                              int var31 = field10489 * var30 + var0.field9061 + Statics.field3653 + 20 + 1;
                              if (var5 > var31 - var0.field9061 - 1 && var5 < var0.field9062 + var31) {
                                 var28 = var30;
                                 var29 = var31 - var0.field9061 - 1;
                                 break;
                              }
                           } else {
                              int var32 = field10489 * var30 + Statics.field3653 + 31;
                              if (var5 > var32 - 13 && var5 < var32 + 3) {
                                 var28 = var30;
                                 var29 = var32 - 13;
                                 break;
                              }
                           }
                        }

                        if (var28 != -1) {
                           int var33 = 0;
                           class833 var34 = new class833(field10505);

                           for(class256 var35 = (class256)var34.method14668(); var35 != null; var35 = (class256)var34.next()) {
                              if (var28 == var33) {
                                 if (var35.field1707 > 1) {
                                    method14473(var35, var29);
                                 }
                                 break;
                              }

                              ++var33;
                           }
                        }
                     }
                  } else {
                     method11730();
                  }
               }
            }
         } else {
            boolean var36 = method8526(Statics.field3302.field7251, var3);
            boolean var37 = method8526(Statics.field3302.field7247, var3);
            boolean var38 = method8526(Statics.field3302.field7246, var3);
            if ((var36 || var37) && (client.field2583 == 1 && field10501 > 2 || method896())) {
               var38 = true;
            }

            if (var38 && field10501 > 0) {
               if (client.field2501 == null && client.field2617 == 0) {
                  method9676(var4, var5);
               } else {
                  field10517 = 2;
               }
            } else if (var37) {
               if (Statics.field6367 != null) {
                  method15566(Statics.field6367, var4, var5);
               }
            } else if (var36) {
               if (Statics.field6368 == null) {
                  if (client.field2588) {
                     client.method14495();
                  }
               } else {
                  boolean var39 = client.field2501 != null || client.field2617 > 0;
                  if (var39) {
                     field10517 = 1;
                     Statics.field10512 = Statics.field6368;
                  } else {
                     method15566(Statics.field6368, var4, var5);
                  }
               }
            }

            if (client.field2501 == null && client.field2617 == 0) {
               field10517 = 0;
               Statics.field10512 = null;
            }
         }

      }
   }

   @deob.ObfuscatedName("dl.a(IIB)V")
   public static void method5483(int arg0, int arg1) {
      if (field10517 == 1) {
         method15566(Statics.field10512, arg0, arg1);
      } else if (field10517 == 2) {
         method9676(arg0, arg1);
      }

      field10517 = 0;
      Statics.field10512 = null;
   }

   @deob.ObfuscatedName("aca.x(I)Z")
   public static boolean method896() {
      if (Statics.field10500 == null) {
         return false;
      } else {
         if (Statics.field10500.field1747 >= 2000) {
            Statics.field10500.field1747 -= 2000;
         }

         return Statics.field10500.field1747 == 1007;
      }
   }

   @deob.ObfuscatedName("my.s(III)V")
   private static void method9676(int arg0, int arg1) {
      if (!Statics.field5740.field7285) {
         if (field10501 == 1) {
            return;
         }

         if (Statics.field9387 && field10501 == 2 && Statics.field10500.field1737.equals(class881.field9014.method15374(Statics.field243))) {
            return;
         }
      }

      class883 var2 = method11659();
      int var3 = var2.method15384(class881.field8894.method15374(Statics.field243));
      int var6;
      if (!field10513) {
         for(class261 var4 = (class261)field10487.method14964(); var4 != null; var4 = (class261)field10487.method15006()) {
            int var5 = method17101(var4, var2);
            if (var5 > var3) {
               var3 = var5;
            }
         }

         var3 += 8;
         var6 = field10501 * field10489 + 21;
         Statics.field5194 = (field10527 ? 26 : 22) + field10501 * field10489;
      } else {
         for(class256 var7 = (class256)field10505.method14944(); var7 != null; var7 = (class256)field10505.method14929()) {
            int var8;
            if (var7.field1707 == 1) {
               var8 = method17101((class261)var7.field1709.field8664.field809, var2);
            } else {
               var8 = method2273(var7, var2);
            }

            if (var8 > var3) {
               var3 = var8;
            }
         }

         var3 += 8;
         var6 = field10502 * field10489 + 21;
         Statics.field5194 = (field10527 ? 26 : 22) + field10502 * field10489;
      }

      var3 += 10;
      int var9 = arg0 - var3 / 2;
      if (var3 + var9 > Statics.field6104) {
         var9 = Statics.field6104 - var3;
      }

      if (var9 < 0) {
         var9 = 0;
      }

      int var10 = arg1;
      if (var6 + arg1 > Statics.field6354) {
         var10 = Statics.field6354 - var6;
      }

      if (var10 < 0) {
         var10 = 0;
      }

      Statics.field9533 = var9;
      Statics.field3653 = var10;
      Statics.field8870 = var3;
      field10521 = (int)(Math.random() * 24.0D);
      field10492 = true;
   }

   @deob.ObfuscatedName("ss.l(Lajk;II)V")
   private static void method14473(class256 arg0, int arg1) {
      if (field10492) {
         class883 var2 = method11659();
         int var3 = 0;

         for(class261 var4 = (class261)arg0.field1709.method14944(); var4 != null; var4 = (class261)arg0.field1709.method14929()) {
            int var5 = method17101(var4, var2);
            if (var5 > var3) {
               var3 = var5;
            }
         }

         var3 += 8;
         int var6 = field10489 * arg0.field1707 + 21;
         Statics.field2959 = field10489 * arg0.field1707 + (field10527 ? 26 : 22);
         int var7 = Statics.field9533 + Statics.field8870;
         if (var3 + var7 > Statics.field6104) {
            var7 = Statics.field9533 - var3;
         }

         if (var7 < 0) {
            var7 = 0;
         }

         int var8 = field10527 ? var2.field9061 + 20 + 1 : 31;
         int var9 = var2.field9061 + (arg1 - var8) + 1;
         if (var6 + var9 > Statics.field6354) {
            var9 = Statics.field6354 - var6;
         }

         if (var9 < 0) {
            var9 = 0;
         }

         Statics.field8746 = var7;
         Statics.field9398 = var9;
         Statics.field9260 = var3;
         field10494 = arg0;
      }
   }

   @deob.ObfuscatedName("rf.u(B)Lvd;")
   private static class883 method11659() {
      class883 var0;
      if (field10527) {
         if (Statics.field1165 != null && Statics.field3067 != null) {
            var0 = Statics.field3067;
         } else {
            var0 = Statics.field1855;
         }
      } else {
         var0 = Statics.field1855;
      }

      field10489 = var0.field9062 + var0.field9061;
      return var0;
   }

   @deob.ObfuscatedName("rj.v(I)V")
   public static void method11730() {
      method16086();
      field10492 = false;
      client.method10741(Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194);
      Statics.field6368 = null;
      Statics.field6367 = null;
   }

   @deob.ObfuscatedName("yd.g(B)V")
   private static void method16086() {
      if (field10494 != null) {
         field10494 = null;
         client.method10741(Statics.field8746, Statics.field9398, Statics.field9260, Statics.field2959);
      }
   }

   @deob.ObfuscatedName("vl.h(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZI)V")
   public static void method15520(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      if (!field10492 && field10501 < 512) {
         int var14 = arg2 != -1 ? arg2 : client.field2451;
         class261 var15 = new class261(arg0, arg1, var14, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
         method8028(var15);
      }
   }

   @deob.ObfuscatedName("ju.e(Lajp;I)V")
   private static void method8028(class261 arg0) {
      if (arg0 != null) {
         field10487.method14959(arg0);
         ++field10501;
         Object var1 = null;
         class256 var4;
         if (!arg0.field1746 && !"".equals(arg0.field1743)) {
            long var2 = arg0.field1744;

            for(var4 = (class256)field10504.method15322(var2); var4 != null && !var4.field1708.equals(arg0.field1743); var4 = (class256)field10504.method15308()) {
            }

            if (var4 == null) {
               var4 = (class256)field10508.method10909(var2);
               if (var4 != null && !var4.field1708.equals(arg0.field1743)) {
                  var4 = null;
               }

               if (var4 == null) {
                  var4 = new class256(arg0.field1743);
               }

               field10504.method15311(var4, var2);
               ++field10502;
            }
         } else {
            var4 = new class256(arg0.field1743);
            ++field10502;
         }

         if (var4.method3443(arg0)) {
            method11579(var4);
         }

      }
   }

   @deob.ObfuscatedName("ra.z(Lajk;B)V")
   private static void method11579(class256 arg0) {
      boolean var1 = false;
      arg0.method1393();

      for(class256 var2 = (class256)field10505.method14944(); var2 != null; var2 = (class256)field10505.method14929()) {
         if (method15972(arg0.method3447(), var2.method3447())) {
            class846.method5941(arg0, var2);
            var1 = true;
            break;
         }
      }

      if (!var1) {
         field10505.method14938(arg0);
      }

   }

   @deob.ObfuscatedName("qq.m(Lem;III)V")
   public static void method11291(class425 arg0, int arg1, int arg2) {
      if (client.field2588) {
         class923 var3 = Statics.field3131 != -1 ? Statics.field5946.method15930(Statics.field3131) : null;
         if (client.method4871(arg0).method906() && (Statics.field9110 & 32) != 0 && (var3 == null || arg0.method5850(Statics.field3131, var3.field9388) != var3.field9388)) {
            method15520(client.field2591, client.field2592 + " " + class582.field5309 + " " + arg0.field3548, Statics.field6160, 58, arg0.field3539, 0L, arg0.field3401, arg0.field3465, true, false, (long)(arg0.field3401 << 32 | arg0.field3465), false);
         }
      }

      for(int var4 = 9; var4 >= 5; --var4) {
         String var5 = method8026(arg0, var4);
         if (var5 != null) {
            method15520(var5, arg0.field3548, client.method14837(arg0, var4), 1007, arg0.field3539, (long)(var4 + 1), arg0.field3401, arg0.field3465, true, false, (long)(arg0.field3401 << 32 | arg0.field3465), false);
         }
      }

      String var6 = client.method9706(arg0);
      if (var6 != null) {
         method15520(var6, arg0.field3548, arg0.field3491, 25, arg0.field3539, 0L, arg0.field3401, arg0.field3465, true, false, (long)(arg0.field3401 << 32 | arg0.field3465), false);
      }

      for(int var7 = 4; var7 >= 0; --var7) {
         String var8 = method8026(arg0, var7);
         if (var8 != null) {
            method15520(var8, arg0.field3548, client.method14837(arg0, var7), 57, arg0.field3539, (long)(var7 + 1), arg0.field3401, arg0.field3465, true, false, (long)(arg0.field3401 << 32 | arg0.field3465), false);
         }
      }

      if (client.method4871(arg0).method898()) {
         if (arg0.field3564 != null) {
            method15520(arg0.field3564, "", -1, 30, arg0.field3539, 0L, arg0.field3401, arg0.field3465, true, false, (long)(arg0.field3401 << 32 | arg0.field3465), false);
         } else {
            method15520(class881.field8898.method15374(Statics.field243), "", -1, 30, arg0.field3539, 0L, arg0.field3401, arg0.field3465, true, false, (long)(arg0.field3401 << 32 | arg0.field3465), false);
         }
      }

   }

   @deob.ObfuscatedName("jl.i(Laab;B)V")
   public static void method7971(class4 arg0) {
      if (arg0 instanceof class200) {
         class200 var1 = (class200)arg0;
         if (var1.field1312 != null) {
            Statics.method7468(var1, Statics.field5701.field1032 != var1.field1032);
         }
      } else if (arg0 instanceof class211) {
         class211 var2 = (class211)arg0;
         method5781(var2, Statics.field5701.field1032 != var2.field1032);
      }

   }

   @deob.ObfuscatedName("ra.t(Lra;III)V")
   public static void method11584(class772 arg0, int arg1, int arg2) {
      if (arg1 >= 0 && arg2 >= 0 && field10498 != null) {
         class723 var3 = client.field2468.method9649();
         class597 var4 = arg0.method7509();
         arg0.method7545(field10498);
         arg0.method7778(field10518);
         arg0.method7716(field10486, field10516, field10514 + field10486, field10516 + field10488);
         arg0.method7505(field10486, field10516, field10514, field10488);
         var4.method8391(field10518);
         var4.method8388(field10498);
         var4.method8423();
         int var5 = arg1 - field10486;
         int var6 = arg2 - field10516;
         if (client.field2468.method9639() != null && (!client.field2588 || (Statics.field9110 & 64) != 0)) {
            int var7 = -1;
            int var8 = -1;
            float var9 = (float)var5 * 2.0F / (float)field10514 - 1.0F;
            float var10 = (float)var6 * 2.0F / (float)field10488 - 1.0F;
            var4.method8394(var9, var10, -1.0F, field10524);
            float var11 = field10524[0] / field10524[3];
            float var12 = field10524[1] / field10524[3];
            float var13 = field10524[2] / field10524[3];
            var4.method8394(var9, var10, 1.0F, field10524);
            float var14 = field10524[0] / field10524[3];
            float var15 = field10524[1] / field10524[3];
            float var16 = field10524[2] / field10524[3];
            float var17 = method11188(var11, var12, var13, var14, var15, var16, 4);
            if (var17 > 0.0F) {
               float var18 = var14 - var11;
               float var19 = var16 - var13;
               int var20 = (int)(var17 * var18 + var11);
               int var21 = (int)(var17 * var19 + var13);
               var7 = var20 + (Statics.field5701.method96() - 1 << 8) >> 9;
               var8 = var21 + (Statics.field5701.method96() - 1 << 8) >> 9;
               byte var22 = Statics.field5701.field1032;
               if (var22 < 3 && (client.field2468.method9592().field5520[1][var20 >> 9][var21 >> 9] & 2) != 0) {
                  int var91 = var22 + 1;
               }
            }

            if (var7 != -1 && var8 != -1) {
               if (client.field2588 && (Statics.field9110 & 64) != 0) {
                  class425 var23 = Statics.method886(Statics.field4335, client.field2589);
                  if (var23 != null) {
                     method15520(client.field2591, " " + class582.field5309 + " ", Statics.field6160, 59, -1, 0L, var7, var8, true, false, (long)(var7 << 32 | var8), true);
                  } else {
                     client.method14495();
                  }
               } else {
                  if (Statics.field9387) {
                     method15520(class881.field9014.method15374(Statics.field243), "", -1, 60, -1, 0L, var7, var8, true, false, (long)(var7 << 32 | var8), true);
                  }

                  method15520(Statics.field5177, "", client.field2575, 23, -1, 0L, var7, var8, true, false, (long)(var7 << 32 | var8), true);
               }
            }
         }

         class693 var24 = client.field2468.method9639().field6589;
         int var25 = arg1;
         int var26 = arg2;
         List var27 = var24.field6351;
         Iterator var28 = var27.iterator();

         while(true) {
            int var32;
            int var33;
            class376 var83;
            class843 var84;
            String[] var86;
            do {
               class715 var29;
               do {
                  do {
                     do {
                        while(true) {
                           while(true) {
                              do {
                                 do {
                                    if (!var28.hasNext()) {
                                       return;
                                    }

                                    var29 = (class715)var28.next();
                                 } while(!client.field2536 && Statics.field5701.field1032 != var29.field6632.field1032);
                              } while(!var29.method10645(arg0, var25, var26));

                              boolean var30 = false;
                              boolean var31 = false;
                              if (var29.field6632 instanceof class290) {
                                 var32 = ((class290)var29.field6632).field1875;
                                 var33 = ((class290)var29.field6632).field1874;
                              } else {
                                 class584 var34 = var29.field6632.method11602().field5446;
                                 var32 = (int)var34.field5328 >> 9;
                                 var33 = (int)var34.field5331 >> 9;
                              }

                              if (!(var29.field6632 instanceof class211)) {
                                 break;
                              }

                              class211 var35 = (class211)var29.field6632;
                              int var36 = var35.method96();
                              class584 var37 = var35.method11602().field5446;
                              if ((var36 & 1) == 0 && ((int)var37.field5328 & 511) == 0 && ((int)var37.field5331 & 511) == 0 || (var36 & 1) == 1 && ((int)var37.field5328 & 511) == 256 && ((int)var37.field5331 & 511) == 256) {
                                 int var38 = (int)var37.field5328 - (var35.method96() - 1 << 8);
                                 int var39 = (int)var37.field5331 - (var35.method96() - 1 << 8);

                                 for(int var40 = 0; var40 < client.field2455; ++var40) {
                                    class106 var41 = (class106)client.field2615.method15322((long)client.field2456[var40]);
                                    if (var41 != null) {
                                       class200 var42 = (class200)var41.field807;
                                       if (client.field2418 != var42.field18 && var42.field59) {
                                          class584 var43 = var42.method11602().field5446;
                                          int var44 = (int)var43.field5328 - (var42.field1312.field9328 - 1 << 8);
                                          int var45 = (int)var43.field5331 - (var42.field1312.field9328 - 1 << 8);
                                          if (var44 >= var38 && var42.field1312.field9328 <= var35.method96() - (var44 - var38 >> 9) && var45 >= var39 && var42.field1312.field9328 <= var35.method96() - (var45 - var39 >> 9)) {
                                             Statics.method7468(var42, Statics.field5701.field1032 != var29.field6632.field1032);
                                             var42.field18 = client.field2418;
                                          }
                                       }
                                    }
                                 }

                                 int var46 = class324.field2053;
                                 int[] var47 = class324.field2057;

                                 for(int var48 = 0; var48 < var46; ++var48) {
                                    class211 var49 = client.field2408[var47[var48]];
                                    if (var49 != null && client.field2418 != var49.field18 && var35 != var49 && var49.field59) {
                                       class584 var50 = var49.method11602().field5446;
                                       int var51 = (int)var50.field5328 - (var49.method96() - 1 << 8);
                                       int var52 = (int)var50.field5331 - (var49.method96() - 1 << 8);
                                       if (var51 >= var38 && var49.method96() <= var35.method96() - (var51 - var38 >> 9) && var52 >= var39 && var49.method96() <= var35.method96() - (var52 - var39 >> 9)) {
                                          method5781(var49, Statics.field5701.field1032 != var29.field6632.field1032);
                                          var49.field18 = client.field2418;
                                       }
                                    }
                                 }
                              }

                              if (client.field2418 != var35.field18) {
                                 method5781(var35, Statics.field5701.field1032 != var29.field6632.field1032);
                                 var35.field18 = client.field2418;
                                 break;
                              }
                           }

                           if (!(var29.field6632 instanceof class200)) {
                              break;
                           }

                           class200 var53 = (class200)var29.field6632;
                           if (var53.field1312 == null) {
                              break;
                           }

                           class584 var54 = var53.method11602().field5446;
                           if ((var53.field1312.field9328 & 1) == 0 && ((int)var54.field5328 & 511) == 0 && ((int)var54.field5331 & 511) == 0 || (var53.field1312.field9328 & 1) == 1 && ((int)var54.field5328 & 511) == 256 && ((int)var54.field5331 & 511) == 256) {
                              int var55 = (int)var54.field5328 - (var53.field1312.field9328 - 1 << 8);
                              int var56 = (int)var54.field5331 - (var53.field1312.field9328 - 1 << 8);

                              for(int var57 = 0; var57 < client.field2455; ++var57) {
                                 class106 var58 = (class106)client.field2615.method15322((long)client.field2456[var57]);
                                 if (var58 != null) {
                                    class200 var59 = (class200)var58.field807;
                                    if (client.field2418 != var59.field18 && var53 != var59 && var59.field59) {
                                       class584 var60 = var59.method11602().field5446;
                                       int var61 = (int)var60.field5328 - (var59.field1312.field9328 - 1 << 8);
                                       int var62 = (int)var60.field5331 - (var59.field1312.field9328 - 1 << 8);
                                       if (var61 >= var55 && var59.field1312.field9328 <= var53.field1312.field9328 - (var61 - var55 >> 9) && var62 >= var56 && var59.field1312.field9328 <= var53.field1312.field9328 - (var62 - var56 >> 9)) {
                                          Statics.method7468(var59, Statics.field5701.field1032 != var29.field6632.field1032);
                                          var59.field18 = client.field2418;
                                       }
                                    }
                                 }
                              }

                              int var63 = class324.field2053;
                              int[] var64 = class324.field2057;

                              for(int var65 = 0; var65 < var63; ++var65) {
                                 class211 var66 = client.field2408[var64[var65]];
                                 if (var66 != null && client.field2418 != var66.field18 && var66.field59) {
                                    class584 var67 = var66.method11602().field5446;
                                    int var68 = (int)var67.field5328 - (var66.method96() - 1 << 8);
                                    int var69 = (int)var67.field5331 - (var66.method96() - 1 << 8);
                                    if (var68 >= var55 && var66.method96() <= var53.field1312.field9328 - (var68 - var55 >> 9) && var69 >= var56 && var66.method96() <= var53.field1312.field9328 - (var69 - var56 >> 9)) {
                                       method5781(var66, Statics.field5701.field1032 != var29.field6632.field1032);
                                       var66.field18 = client.field2418;
                                    }
                                 }
                              }
                           }

                           if (client.field2418 != var53.field18) {
                              Statics.method7468(var53, Statics.field5701.field1032 != var29.field6632.field1032);
                              var53.field18 = client.field2418;
                              break;
                           }
                        }

                        if (var29.field6632 instanceof class309) {
                           int var70 = var3.field6676 + var32;
                           int var71 = var3.field6677 + var33;
                           class79 var72 = (class79)client.field2576.method15322((long)(var29.field6632.field1032 << 28 | var71 << 14 | var70));
                           if (var72 != null) {
                              int var73 = 0;
                              class62 var74 = (class62)var72.field569.method14976();

                              while(var74 != null) {
                                 class899 var75 = Statics.field4196.method15540(var74.field442);
                                 int var76;
                                 if (var75.field9189) {
                                    var76 = var75.field9120;
                                 } else if (var75.field9130) {
                                    var76 = Statics.field3302.field7253;
                                 } else {
                                    var76 = Statics.field3302.field7252;
                                 }

                                 if (client.field2588 && Statics.field5701.field1032 == var29.field6632.field1032) {
                                    class923 var77 = Statics.field3131 != -1 ? Statics.field5946.method15930(Statics.field3131) : null;
                                    if ((Statics.field9110 & 1) != 0 && (var77 == null || var75.method15630(Statics.field3131, var77.field9388) != var77.field9388)) {
                                       method15520(client.field2591, client.field2592 + " " + class582.field5309 + " " + class582.method7399(var76) + var75.field9158, Statics.field6160, 17, -1, (long)var74.field442, var32, var33, true, false, (long)var73, false);
                                    }
                                 }

                                 if (Statics.field5701.field1032 == var29.field6632.field1032) {
                                    String[] var78 = var75.field9147;

                                    for(int var79 = var78.length - 1; var79 >= 0; --var79) {
                                       if (var78[var79] != null) {
                                          short var80 = 0;
                                          int var81 = client.field2586;
                                          if (var79 == 0) {
                                             var80 = 18;
                                          }

                                          if (var79 == 1) {
                                             var80 = 19;
                                          }

                                          if (var79 == 2) {
                                             var80 = 20;
                                          }

                                          if (var79 == 3) {
                                             var80 = 21;
                                          }

                                          if (var79 == 4) {
                                             var80 = 22;
                                          }

                                          if (var79 == 5) {
                                             var80 = 1004;
                                          }

                                          int var82 = var75.method15620(var79);
                                          if (var82 != -1) {
                                             var81 = var82;
                                          }

                                          method15520(var78[var79], class582.method7399(var76) + var75.field9158, var81, var80, -1, (long)var74.field442, var32, var33, true, false, (long)var73, false);
                                       }
                                    }
                                 }

                                 var74 = (class62)var72.field569.method15010();
                                 ++var73;
                              }
                           }
                        }
                     } while(!(var29.field6632 instanceof class376));

                     var83 = (class376)var29.field6632;
                     var84 = client.field2468.method9636().method14651(var83.method5093());
                     if (var84.field8609 != null) {
                        var84 = var84.method14853(Statics.field10637);
                     }
                  } while(var84 == null);

                  if (client.field2588 && Statics.field5701.field1032 == var29.field6632.field1032) {
                     class923 var85 = Statics.field3131 != -1 ? Statics.field5946.method15930(Statics.field3131) : null;
                     if ((Statics.field9110 & 4) != 0 && (var85 == null || var84.method14888(Statics.field3131, var85.field9388) != var85.field9388)) {
                        method15520(client.field2591, client.field2592 + " " + class582.field5309 + " " + class582.method7399(65535) + var84.field8573, Statics.field6160, 2, -1, method5504(var83, var32, var33), var32, var33, true, false, (long)var83.hashCode(), false);
                     }
                  }
               } while(Statics.field5701.field1032 != var29.field6632.field1032);

               var86 = var84.field8601;
            } while(var86 == null);

            for(int var87 = var86.length - 1; var87 >= 0; --var87) {
               if (var86[var87] != null) {
                  short var88 = 0;
                  int var89 = client.field2586;
                  if (var87 == 0) {
                     var88 = 3;
                  }

                  if (var87 == 1) {
                     var88 = 4;
                  }

                  if (var87 == 2) {
                     var88 = 5;
                  }

                  if (var87 == 3) {
                     var88 = 6;
                  }

                  if (var87 == 4) {
                     var88 = 1001;
                  }

                  if (var87 == 5) {
                     var88 = 1002;
                  }

                  int var90 = var84.method14862(var87);
                  if (var90 != -1) {
                     var89 = var90;
                  }

                  method15520(var86[var87], class582.method7399(65535) + var84.field8573, var89, var88, -1, method5504(var83, var32, var33), var32, var33, true, false, (long)var83.hashCode(), false);
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("do.c(Lcr;III)J")
   private static long method5504(class376 arg0, int arg1, int arg2) {
      long var3 = 4194304L;
      long var5 = Long.MIN_VALUE;
      class843 var7 = client.field2468.method9636().method14651(arg0.method5093());
      long var8 = (long)(arg1 | arg2 << 7 | arg0.method5083() << 14 | arg0.method5084() << 20 | 1073741824);
      if (var7.field8638 == 0) {
         var8 |= var5;
      }

      if (var7.field8621 == 1) {
         var8 |= var3;
      }

      return var8 | (long)arg0.method5093() << 32;
   }

   @deob.ObfuscatedName("agm.w(Lajp;I)V")
   private static void method2429(class261 arg0) {
      if (!field10492) {
         arg0.method9864();
         --field10501;
         if (!arg0.field1746) {
            long var1 = arg0.field1744;

            class256 var3;
            for(var3 = (class256)field10504.method15322(var1); var3 != null && !var3.field1708.equals(arg0.field1743); var3 = (class256)field10504.method15308()) {
            }

            if (var3 != null && var3.method3444(arg0)) {
               method11579(var3);
            }
         } else {
            for(class256 var4 = (class256)field10505.method14944(); var4 != null; var4 = (class256)field10505.method14929()) {
               if (var4.field1708.equals(arg0.field1743)) {
                  boolean var5 = false;

                  for(class261 var6 = (class261)var4.field1709.method14944(); var6 != null; var6 = (class261)var4.field1709.method14929()) {
                     if (arg0 == var6) {
                        if (var4.method3444(arg0)) {
                           method11579(var4);
                        }

                        var5 = true;
                        break;
                     }
                  }

                  if (var5) {
                     break;
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("aq.q(B)V")
   public static void method4005() {
      for(class261 var0 = (class261)field10487.method14964(); var0 != null; var0 = (class261)field10487.method15006()) {
         if (method439(var0.field1747)) {
            method2429(var0);
         }
      }

   }

   @deob.ObfuscatedName("qk.y(II)Z")
   public static boolean method11208(int arg0) {
      for(class261 var1 = (class261)field10487.method14964(); var1 != null; var1 = (class261)field10487.method15006()) {
         if (method10035(var1.field1747) && var1.field1740 == (long)arg0) {
            return true;
         }
      }

      return false;
   }

   @deob.ObfuscatedName("il.j(B)Z")
   public static boolean method7372() {
      return field10501 > 0;
   }

   @deob.ObfuscatedName("aap.f(Lra;I)V")
   public static void method390(class772 arg0) {
      if (field10492) {
         method7473(arg0);
      } else {
         method11047(arg0);
      }

   }

   @deob.ObfuscatedName("dq.ai(I)V")
   public static void method5514() {
      for(class256 var0 = (class256)field10505.method14944(); var0 != null; var0 = (class256)field10505.method14929()) {
         if (var0.field1707 > 1) {
            var0.field1707 = 0;
            field10508.method10880(var0, ((class261)var0.field1709.field8664.field809).field1744);
            var0.field1709.method14924();
         }
      }

      field10502 = 0;
      field10501 = 0;
      field10487.method14958();
      field10504.method15312();
      field10505.method14924();
      method8028(Statics.field10493);
   }

   @deob.ObfuscatedName("zr.ap(I)V")
   public static void method17094() {
      for(class256 var0 = (class256)field10505.method14944(); var0 != null; var0 = (class256)field10505.method14929()) {
         if (var0.field1707 > 1) {
            var0.field1707 = 0;
            field10508.method10880(var0, ((class261)var0.field1709.field8664.field809).field1744);
            var0.field1709.method14924();
         }
      }

      field10502 = 0;
      field10501 = 0;
      field10487.method14958();
      field10504.method15312();
      field10505.method14924();
      field10492 = false;
   }

   @deob.ObfuscatedName("aap.av(I)V")
   public static void method392() {
      Statics.field1993 = null;
      Statics.field6083 = null;
      Statics.field6475 = null;
      Statics.field5243 = null;
      Statics.field6555 = null;
      Statics.field4165 = null;
      Statics.field9606 = null;
      Statics.field2895 = null;
      Statics.field1165 = null;
      Statics.field3067 = null;
   }

   @deob.ObfuscatedName("es.ax(B)V")
   public static void method5962() {
      method392();
      Statics.field1373 = null;
   }

   @deob.ObfuscatedName("iq.af([Lcy;B)V")
   public static void method7391(class383[] arg0) {
      Statics.field1896 = arg0.length;
      Statics.field1373 = new class383[Statics.field1896 + 10];
      Statics.field6803 = new int[Statics.field1896 + 10];
      System.arraycopy(arg0, 0, Statics.field1373, 0, Statics.field1896);

      for(int var1 = 0; var1 < Statics.field1896; ++var1) {
         Statics.field6803[var1] = Statics.field1373[var1].method5213();
      }

      for(int var2 = Statics.field1896; var2 < Statics.field1373.length; ++var2) {
         Statics.field6803[var2] = 12;
      }

   }

   @deob.ObfuscatedName("lu.at(III)V")
   public static void method9122(int arg0, int arg1) {
      field10486 = arg0;
      field10516 = arg1;
   }

   @deob.ObfuscatedName("gs.aw(I)I")
   public static int method6865() {
      if (client.field2501 == null) {
         if (!field10492) {
            if (Statics.field3302.field7249) {
               if (Statics.field6367 != null) {
                  return Statics.field6367.field1738;
               }
            } else if (Statics.field6368 != null) {
               return Statics.field6368.field1738;
            }
         } else {
            class883 var0 = method11659();
            int var1 = Statics.field336.method1896();
            int var2 = Statics.field336.method1897();
            if (!field10513) {
               if (var1 > Statics.field9533 && var1 < Statics.field9533 + Statics.field8870) {
                  int var3 = -1;

                  for(int var4 = 0; var4 < field10501; ++var4) {
                     if (field10527) {
                        int var5 = field10489 * (field10501 - 1 - var4) + var0.field9061 + Statics.field3653 + 20 + 1;
                        if (var2 > var5 - var0.field9061 - 1 && var2 < var0.field9062 + var5) {
                           var3 = var4;
                        }
                     } else {
                        int var6 = field10489 * (field10501 - 1 - var4) + Statics.field3653 + 31;
                        if (var2 > var6 - var0.field9061 - 1 && var2 < var0.field9062 + var6) {
                           var3 = var4;
                        }
                     }
                  }

                  if (var3 != -1) {
                     int var7 = 0;
                     class844 var8 = new class844(field10487);

                     for(class261 var9 = (class261)var8.method14915(); var9 != null; var9 = (class261)var8.next()) {
                        if (var7++ == var3) {
                           return var9.field1738;
                        }
                     }
                  }
               }
            } else if (var1 > Statics.field9533 && var1 < Statics.field9533 + Statics.field8870) {
               int var10 = -1;

               for(int var11 = 0; var11 < field10502; ++var11) {
                  if (field10527) {
                     int var12 = field10489 * var11 + var0.field9061 + Statics.field3653 + 20 + 1;
                     if (var2 > var12 - var0.field9061 - 1 && var2 < var0.field9062 + var12) {
                        var10 = var11;
                     }
                  } else {
                     int var13 = field10489 * var11 + Statics.field3653 + 31;
                     if (var2 > var13 - var0.field9061 - 1 && var2 < var0.field9062 + var13) {
                        var10 = var11;
                     }
                  }
               }

               if (var10 != -1) {
                  int var14 = 0;
                  class833 var15 = new class833(field10505);

                  for(class256 var16 = (class256)var15.method14668(); var16 != null; var16 = (class256)var15.next()) {
                     if (var14++ == var10) {
                        return ((class261)var16.field1709.field8664.field809).field1738;
                     }
                  }
               }
            } else if (field10494 != null && var1 > Statics.field8746 && var1 < Statics.field9260 + Statics.field8746) {
               int var17 = -1;

               for(int var18 = 0; var18 < field10494.field1707; ++var18) {
                  if (field10527) {
                     int var19 = field10489 * var18 + var0.field9061 + Statics.field9398 + 20 + 1;
                     if (var2 > var19 - var0.field9061 - 1 && var2 < var0.field9062 + var19) {
                        var17 = var18;
                     }
                  } else {
                     int var20 = field10489 * var18 + Statics.field9398 + 31;
                     if (var2 > var20 - var0.field9061 - 1 && var2 < var0.field9062 + var20) {
                        var17 = var18;
                     }
                  }
               }

               if (var17 != -1) {
                  int var21 = 0;
                  class833 var22 = new class833(field10494.field1709);

                  for(class261 var23 = (class261)var22.method14668(); var23 != null; var23 = (class261)var22.next()) {
                     if (var21++ == var17) {
                        return var23.field1738;
                     }
                  }
               }
            }
         }
      }

      return -1;
   }

   @deob.ObfuscatedName("adh.al(III)Z")
   public static boolean method1293(int arg0, int arg1) {
      if (!field10492) {
         return false;
      } else {
         int var2 = arg0 >> 16;
         int var3 = arg0 & 65535;
         if (Statics.field844[var2] != null && Statics.field844[var2].field3569[var3] != null) {
            class425 var4 = Statics.field844[var2].field3569[var3];
            if (arg1 == -1 && var4.field3402 == 0) {
               for(class261 var5 = (class261)field10487.method14964(); var5 != null; var5 = (class261)field10487.method15006()) {
                  if (var5.field1747 == 58 || var5.field1747 == 1007 || var5.field1747 == 25 || var5.field1747 == 57 || var5.field1747 == 30) {
                     for(class425 var6 = class425.method11190(var5.field1742); var6 != null; var6 = client.method17098(Statics.field844[var6.field3465 >> 16], var6)) {
                        if (var4.field3465 == var6.field3465) {
                           return true;
                        }
                     }
                  }
               }
            } else {
               for(class261 var7 = (class261)field10487.method14964(); var7 != null; var7 = (class261)field10487.method15006()) {
                  if (var7.field1741 == arg1 && var4.field3465 == var7.field1742 && (var7.field1747 == 58 || var7.field1747 == 1007 || var7.field1747 == 25 || var7.field1747 == 57 || var7.field1747 == 30)) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }

   @deob.ObfuscatedName("op.ag(I)Lajp;")
   public static class261 method10370() {
      return Statics.field6367;
   }

   @deob.ObfuscatedName("dt.aa(Lajp;I)Ljava/lang/String;")
   public static String method5521(class261 arg0) {
      if (!field10492 && arg0 != null) {
         return (arg0.field1743 == null || arg0.field1743.length() == 0) && arg0.field1748 != null && arg0.field1748.length() > 0 ? arg0.field1748 : arg0.field1743;
      } else {
         return "";
      }
   }

   @deob.ObfuscatedName("gw.ao(Lajp;I)I")
   public static int method6886(class261 arg0) {
      if (field10492) {
         return 6;
      } else if (arg0 == null) {
         return 0;
      } else {
         int var1 = arg0.field1747;
         if (method439(var1)) {
            return 1;
         } else if (method10318(var1)) {
            return 2;
         } else if (method450(var1)) {
            return 3;
         } else if (method10035(var1)) {
            return 4;
         } else if (method5970(var1)) {
            return 7;
         } else {
            return var1 == 16 ? 8 : 5;
         }
      }
   }

   @deob.ObfuscatedName("eo.ab(Lajp;I)Ljava/lang/String;")
   public static String method5925(class261 arg0) {
      if (!field10492 && arg0 != null) {
         int[] var1 = method15585(arg0);
         return var1 == null ? "" : method10725(var1);
      } else {
         return "";
      }
   }

   @deob.ObfuscatedName("lv.ae(Lka;Lko;IIB)V")
   public static void method9123(class583 arg0, class597 arg1, int arg2, int arg3) {
      if (field10498 == null) {
         field10498 = new class597(arg1);
      } else {
         field10498.method8386(arg1);
      }

      field10518.method8089(arg0);
      field10514 = arg2;
      field10488 = arg3;
   }

   @deob.ObfuscatedName("j.aq(Lra;I)V")
   private static void method7473(class772 arg0) {
      if (!field10527) {
         method9088(arg0);
      } else {
         method4548(arg0);
      }

   }

   @deob.ObfuscatedName("qb.ar(Lra;I)V")
   private static void method11047(class772 arg0) {
      if ((field10501 >= 2 || client.field2588) && client.field2501 == null) {
         String var1;
         if (client.field2588 && field10501 < 2) {
            var1 = client.field2591 + class881.field9020.method15374(Statics.field243) + client.field2592 + " " + class582.field5309;
         } else if (method2349() && field10501 > 2) {
            var1 = method7454(Statics.field6368);
         } else {
            class261 var2 = Statics.field6368;
            if (var2 == null) {
               return;
            }

            var1 = method7454(var2);
            int[] var3 = method15585(var2);
            if (var3 != null) {
               var1 = var1 + method10725(var3);
            }
         }

         if (field10501 > 2) {
            var1 = var1 + class582.method7399(16777215) + " / " + (field10501 - 2) + class881.field9012.method15374(Statics.field243);
         }

         if (field10503 != null) {
            class609 var4 = field10503.method5816(Statics.field10616, client.field2430);
            if (var4 == null) {
               var4 = Statics.field7095;
            }

            var4.method8698(var1, field10495, field10510, field10503.field3405, field10503.field3557, field10503.field3448, field10503.field3376, field10503.field3472, field10503.field3473, client.field2485, Statics.field9346, client.field2676, Statics.field1373, Statics.field6803);
            client.method10741(client.field2676[0], client.field2676[1], client.field2676[2], client.field2676[3]);
         }

      }
   }

   @deob.ObfuscatedName("vq.au(Lajp;B)[I")
   private static int[] method15585(class261 arg0) {
      int[] var1 = null;
      if (method10318(arg0.field1747)) {
         var1 = Statics.field4196.method15540((int)arg0.field1740).field9185;
      } else if (arg0.field1739 != -1) {
         var1 = Statics.field4196.method15540(arg0.field1739).field9185;
      } else if (method10035(arg0.field1747)) {
         class106 var2 = (class106)client.field2615.method15322((long)((int)arg0.field1740));
         if (var2 != null) {
            class200 var3 = (class200)var2.field807;
            class915 var4 = var3.field1312;
            if (var4.field9319 != null) {
               var4 = var4.method15778(Statics.field10637);
            }

            if (var4 != null) {
               var1 = var4.field9339;
            }
         }
      } else if (method450(arg0.field1747)) {
         class843 var5 = client.field2468.method9636().method14651((int)(arg0.field1740 >>> 32 & 2147483647L));
         if (var5.field8609 != null) {
            var5 = var5.method14853(Statics.field10637);
         }

         if (var5 != null) {
            var1 = var5.field8568;
         }
      }

      return var1;
   }

   @deob.ObfuscatedName("az.ad(IIIIIIILajp;Ll;Lvd;III)V")
   private static void method4101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class261 arg7, class609 arg8, class883 arg9, int arg10, int arg11) {
      if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field9061 - 1 && arg1 < arg9.field9062 + arg6 && arg7.field1736) {
         arg10 = arg11;
      }

      int[] var12 = method15585(arg7);
      String var13 = method7454(arg7);
      if (var12 != null) {
         var13 = var13 + method10725(var12);
      }

      arg8.method8697(var13, arg2 + 3, arg6, arg10, 0, client.field2485, Statics.field9346, Statics.field1373, Statics.field6803);
      if (arg7.field1745) {
         Statics.field9426.method5221(arg2 + 5 + arg9.method15384(var13), arg6 - arg9.field9061);
      }

   }

   @deob.ObfuscatedName("ax.am(IIIIIIILajk;Ll;Lvd;III)V")
   private static void method4086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class256 arg7, class609 arg8, class883 arg9, int arg10, int arg11) {
      if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field9061 - 1 && arg1 < arg9.field9062 + arg6) {
         arg10 = arg11;
      }

      String var12 = method579(arg7);
      arg8.method8697(var12, arg2 + 3, arg6, arg10, 0, client.field2485, Statics.field9346, Statics.field1373, Statics.field6803);
   }

   @deob.ObfuscatedName("lq.aj(Lra;I)V")
   private static void method9088(class772 arg0) {
      int var1 = -10660793;
      Statics.method6477(arg0, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var1, -16777216);
      Statics.field7095.method8709(class881.field8894.method15374(Statics.field243), Statics.field9533 + 3, Statics.field3653 + 14, var1, -1);
      int var2 = Statics.field336.method1896();
      int var3 = Statics.field336.method1897();
      if (!field10513) {
         int var4 = 0;

         for(class261 var5 = (class261)field10487.method14964(); var5 != null; var5 = (class261)field10487.method15006()) {
            int var6 = field10489 * (field10501 - 1 - var4) + Statics.field3653 + 31;
            method4101(var2, var3, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var6, var5, Statics.field7095, Statics.field1855, -1, -256);
            ++var4;
         }
      } else {
         int var7 = 0;

         for(class256 var8 = (class256)field10505.method14944(); var8 != null; var8 = (class256)field10505.method14929()) {
            int var9 = field10489 * var7 + Statics.field3653 + 31;
            if (var8.field1707 == 1) {
               method4101(var2, var3, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var9, (class261)var8.field1709.field8664.field809, Statics.field7095, Statics.field1855, -1, -256);
            } else {
               method4086(var2, var3, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var9, var8, Statics.field7095, Statics.field1855, -1, -256);
            }

            ++var7;
         }

         if (field10494 != null) {
            Statics.method6477(arg0, Statics.field8746, Statics.field9398, Statics.field9260, Statics.field2959, var1, -16777216);
            Statics.field7095.method8709(field10494.field1708, Statics.field8746 + 3, Statics.field9398 + 14, var1, -1);
            int var10 = 0;

            for(class261 var11 = (class261)field10494.field1709.method14944(); var11 != null; var11 = (class261)field10494.field1709.method14929()) {
               int var12 = field10489 * var10 + Statics.field9398 + 31;
               method4101(var2, var3, Statics.field8746, Statics.field9398, Statics.field9260, Statics.field2959, var12, var11, Statics.field7095, Statics.field1855, -1, -256);
               ++var10;
            }
         }
      }

   }

   @deob.ObfuscatedName("il.ac(Lra;IIIIILl;Lvd;Ljava/lang/String;I)V")
   private static void method7374(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class609 arg6, class883 arg7, String arg8) {
      int var9 = 255 - Statics.field6641 - field10521;
      if (var9 < 0) {
         var9 = 0;
      }

      if (Statics.field6475 == null || Statics.field1993 == null) {
         if (Statics.field6723.method8790(Statics.field525) && Statics.field6723.method8790(Statics.field3889)) {
            Statics.field6475 = arg0.method7529(class375.method5065(Statics.field6723, Statics.field525, 0), true);
            class407 var10 = class375.method5065(Statics.field6723, Statics.field3889, 0);
            Statics.field1993 = arg0.method7529(var10, true);
            var10.method5540();
            Statics.field6083 = arg0.method7529(var10, true);
         } else {
            arg0.method7513(arg1, arg2, arg3, arg5, var9 << 24 | Statics.field6374, 1);
         }
      }

      if (Statics.field6475 != null && Statics.field1993 != null) {
         int var11 = (arg3 - Statics.field1993.method5216() * 2) / Statics.field6475.method5216();

         for(int var12 = 0; var12 < var11; ++var12) {
            Statics.field6475.method5221(arg1 + Statics.field1993.method5216() + var12 * Statics.field6475.method5216(), arg2);
         }

         Statics.field1993.method5221(arg1, arg2);
         Statics.field6083.method5221(arg1 + arg3 - Statics.field6083.method5216(), arg2);
      }

      arg6.method8709(arg8, arg1 + 3, (20 - arg7.field9061) / 2 + arg7.field9061 + arg2, Statics.field9568 | -16777216, -1);
      arg0.method7513(arg1, arg2 + arg5, arg3, arg4 - arg5, var9 << 24 | Statics.field6374, 1);
   }

   @deob.ObfuscatedName("ir.ay(Lra;IIIIIB)V")
   private static void method7401(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if ((Statics.field4165 == null || Statics.field5243 == null || Statics.field9606 == null) && Statics.field6723.method8790(Statics.field6080) && Statics.field6723.method8790(Statics.field3571) && Statics.field6723.method8790(Statics.field4246)) {
         class407 var6 = class375.method5065(Statics.field6723, Statics.field3571, 0);
         Statics.field5243 = arg0.method7529(var6, true);
         var6.method5540();
         Statics.field6555 = arg0.method7529(var6, true);
         Statics.field4165 = arg0.method7529(class375.method5065(Statics.field6723, Statics.field6080, 0), true);
         class407 var7 = class375.method5065(Statics.field6723, Statics.field4246, 0);
         Statics.field9606 = arg0.method7529(var7, true);
         var7.method5540();
         Statics.field2895 = arg0.method7529(var7, true);
      }

      if (Statics.field4165 != null && Statics.field5243 != null && Statics.field9606 != null) {
         int var8 = (arg3 - Statics.field9606.method5216() * 2) / Statics.field4165.method5216();

         for(int var9 = 0; var9 < var8; ++var9) {
            Statics.field4165.method5221(arg1 + Statics.field9606.method5216() + var9 * Statics.field4165.method5216(), arg2 + arg4 - Statics.field4165.method5218());
         }

         int var10 = (arg4 - arg5 - Statics.field9606.method5218()) / Statics.field5243.method5218();

         for(int var11 = 0; var11 < var10; ++var11) {
            Statics.field5243.method5221(arg1, arg2 + arg5 + var11 * Statics.field5243.method5218());
            Statics.field6555.method5221(arg1 + arg3 - Statics.field6555.method5216(), arg2 + arg5 + var11 * Statics.field5243.method5218());
         }

         Statics.field9606.method5221(arg1, arg2 + arg4 - Statics.field9606.method5218());
         Statics.field2895.method5221(arg1 + arg3 - Statics.field9606.method5216(), arg2 + arg4 - Statics.field9606.method5218());
      }

   }

   @deob.ObfuscatedName("cl.bf(Lra;B)V")
   private static void method4548(class772 arg0) {
      int var1 = Statics.field9533;
      int var2 = Statics.field3653;
      int var3 = Statics.field8870;
      int var4 = Statics.field5194 - 3;
      byte var5 = 20;
      if (Statics.field1165 == null || Statics.field3067 == null) {
         Statics.field1165 = (class609)Statics.field10616.method7870(client.field2430, Statics.field4906, true, true);
         Statics.field3067 = Statics.field10616.method7871(client.field2430, Statics.field4906);
         if (Statics.field1165 != null && Statics.field3067 != null) {
            method11730();
            int var6 = var3 / 2 + var1;
            if (var3 + var6 > Statics.field6104) {
               var6 = Statics.field6104 - var3;
            }

            if (var6 < 0) {
               var6 = 0;
            }

            method9676(var6, Statics.field3653);
            return;
         }
      }

      class609 var7;
      if (Statics.field1165 != null && Statics.field3067 != null) {
         var7 = Statics.field1165;
      } else {
         var7 = Statics.field7095;
      }

      class883 var8 = method11659();
      method7374(arg0, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var5, var7, var8, class881.field8894.method15374(Statics.field243));
      int var9 = 255 - Statics.field3871 - field10521;
      if (var9 < 0) {
         var9 = 0;
      }

      int var10 = Statics.field336.method1896();
      int var11 = Statics.field336.method1897();
      if (!field10513) {
         int var12 = 0;

         for(class261 var13 = (class261)field10487.method14964(); var13 != null; var13 = (class261)field10487.method15006()) {
            int var14 = field10489 * (field10501 - 1 - var12) + var8.field9061 + var2 + var5 + 1;
            if (var10 > Statics.field9533 && var10 < Statics.field9533 + Statics.field8870 && var11 > var14 - var8.field9061 - 1 && var11 < var8.field9062 + var14 && var13.field1736) {
               arg0.method7513(Statics.field9533, var14 - var8.field9061, Statics.field8870, field10489, var9 << 24 | Statics.field10520, 1);
            }

            ++var12;
         }
      } else {
         int var15 = 0;

         for(class256 var16 = (class256)field10505.method14944(); var16 != null; var16 = (class256)field10505.method14929()) {
            int var17 = field10489 * var15 + var8.field9061 + var2 + var5 + 1;
            if (var10 > Statics.field9533 && var10 < Statics.field9533 + Statics.field8870 && var11 > var17 - var8.field9061 - 1 && var11 < var8.field9062 + var17 && (var16.field1707 > 1 || ((class261)var16.field1709.field8664.field809).field1736)) {
               arg0.method7513(Statics.field9533, var17 - var8.field9061, Statics.field8870, field10489, var9 << 24 | Statics.field10520, 1);
            }

            ++var15;
         }

         if (field10494 != null) {
            method7374(arg0, Statics.field8746, Statics.field9398, Statics.field9260, Statics.field2959, var5, var7, var8, field10494.field1708);
            int var18 = 0;

            for(class261 var19 = (class261)field10494.field1709.method14944(); var19 != null; var19 = (class261)field10494.field1709.method14929()) {
               int var20 = field10489 * var18 + var8.field9061 + Statics.field9398 + var5 + 1;
               if (var10 > Statics.field8746 && var10 < Statics.field9260 + Statics.field8746 && var11 > var20 - var8.field9061 - 1 && var11 < var8.field9062 + var20 && var19.field1736) {
                  arg0.method7513(Statics.field8746, var20 - var8.field9061, Statics.field9260, field10489, var9 << 24 | Statics.field10520, 1);
               }

               ++var18;
            }

            method7401(arg0, Statics.field8746, Statics.field9398, Statics.field9260, Statics.field2959, var5);
         }
      }

      method7401(arg0, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var5);
      if (!field10513) {
         int var21 = 0;

         for(class261 var22 = (class261)field10487.method14964(); var22 != null; var22 = (class261)field10487.method15006()) {
            int var23 = field10489 * (field10501 - 1 - var21) + var8.field9061 + var2 + var5 + 1;
            method4101(var10, var11, var1, var2, var3, var4, var23, var22, var7, var8, Statics.field9568 | -16777216, Statics.field6796 | -16777216);
            ++var21;
         }
      } else {
         int var24 = 0;

         for(class256 var25 = (class256)field10505.method14944(); var25 != null; var25 = (class256)field10505.method14929()) {
            int var26 = field10489 * var24 + var8.field9061 + Statics.field3653 + var5 + 1;
            if (var25.field1707 == 1) {
               method4101(var10, var11, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var26, (class261)var25.field1709.field8664.field809, var7, var8, Statics.field9568 | -16777216, Statics.field6796 | -16777216);
            } else {
               method4086(var10, var11, Statics.field9533, Statics.field3653, Statics.field8870, Statics.field5194, var26, var25, var7, var8, Statics.field9568 | -16777216, Statics.field6796 | -16777216);
            }

            ++var24;
         }

         if (field10494 != null) {
            int var27 = 0;

            for(class261 var28 = (class261)field10494.field1709.method14944(); var28 != null; var28 = (class261)field10494.field1709.method14929()) {
               int var29 = field10489 * var27 + var8.field9061 + Statics.field9398 + var5 + 1;
               method4101(var10, var11, Statics.field8746, Statics.field9398, Statics.field9260, Statics.field2959, var29, var28, var7, var8, Statics.field9568 | -16777216, Statics.field6796 | -16777216);
               ++var27;
            }
         }
      }

   }

   @deob.ObfuscatedName("iy.bp(Lajp;B)Ljava/lang/String;")
   private static String method7454(class261 arg0) {
      if (arg0.field1748 != null && arg0.field1748.length() != 0) {
         return arg0.field1743 != null && arg0.field1743.length() > 0 ? arg0.field1737 + class881.field9020.method15374(Statics.field243) + arg0.field1743 + class881.field9020.method15374(Statics.field243) + arg0.field1748 : arg0.field1737 + class881.field9020.method15374(Statics.field243) + arg0.field1748;
      } else {
         return arg0.field1743 != null && arg0.field1743.length() > 0 ? arg0.field1737 + class881.field9020.method15374(Statics.field243) + arg0.field1743 : arg0.field1737;
      }
   }

   @deob.ObfuscatedName("abf.bs(Lajk;I)Ljava/lang/String;")
   private static String method579(class256 arg0) {
      return arg0.field1708 + class582.method7399(16777215) + " >";
   }

   @deob.ObfuscatedName("afz.br(Lajk;Lvd;B)I")
   private static int method2273(class256 arg0, class883 arg1) {
      String var2 = method579(arg0);
      return arg1.method15393(var2, Statics.field1373);
   }

   @deob.ObfuscatedName("zw.ba(Lajp;Lvd;I)I")
   private static int method17101(class261 arg0, class883 arg1) {
      String var2 = method7454(arg0);
      int[] var3 = method15585(arg0);
      if (var3 != null) {
         var2 = var2 + method10725(var3);
      }

      int var4 = arg1.method15393(var2, Statics.field1373);
      if (arg0.field1745) {
         var4 += Statics.field9426.method5216() + 4;
      }

      return var4;
   }

   @deob.ObfuscatedName("ph.bg([II)Ljava/lang/String;")
   private static String method10725(int[] arg0) {
      StringBuilder var1 = new StringBuilder();
      int var2 = Statics.field1896;

      for(int var3 = 0; var3 < arg0.length; ++var3) {
         class767 var4 = Statics.field3757.method11377(arg0[var3]);
         if (var4.field7036 != -1) {
            class383 var5 = (class383)field10523.method10909((long)var4.field7036);
            if (var5 == null) {
               class407 var6 = class375.method5065(Statics.field6723, var4.field7036, 0);
               if (var6 != null) {
                  var5 = Statics.field8847.method7529(var6, true);
                  field10523.method10880(var5, (long)var4.field7036);
               }
            }

            if (var5 != null) {
               Statics.field1373[var2] = var5;
               var1.append(" <img=").append(var2).append(">");
               ++var2;
            }
         }
      }

      return var1.toString();
   }

   @deob.ObfuscatedName("aau.bc(IS)Z")
   private static boolean method439(int arg0) {
      return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
   }

   @deob.ObfuscatedName("ok.bw(II)Z")
   private static boolean method10318(int arg0) {
      if (arg0 != 18 && arg0 != 19 && arg0 != 20 && arg0 != 21 && arg0 != 22 && arg0 != 1004) {
         return arg0 == 17;
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("nw.bq(II)Z")
   private static boolean method10035(int arg0) {
      if (arg0 != 9 && arg0 != 10 && arg0 != 11 && arg0 != 12 && arg0 != 13 && arg0 != 1003) {
         return arg0 == 8;
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("et.by(II)Z")
   private static boolean method5970(int arg0) {
      return arg0 == 44 || arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 50 || arg0 == 51 || arg0 == 52 || arg0 == 53 || arg0 == 15;
   }

   @deob.ObfuscatedName("aax.bx(II)Z")
   private static boolean method450(int arg0) {
      if (arg0 != 3 && arg0 != 4 && arg0 != 5 && arg0 != 6 && arg0 != 1001 && arg0 != 1002) {
         return arg0 == 2;
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("eh.bh(Laht;ZI)V")
   private static void method5781(class211 arg0, boolean arg1) {
      if (field10501 < 406) {
         if (Statics.field5701 == arg0) {
            if (client.field2588 && (Statics.field9110 & 16) != 0) {
               method15520(client.field2591, client.field2592 + " " + class582.field5309 + " " + class582.method7399(16777215) + class881.field9026.method15374(Statics.field243), Statics.field6160, 16, -1, 0L, 0, 0, true, false, (long)arg0.field12, false);
            }

         } else {
            String var6;
            if (arg0.field1392 == 0) {
               boolean var2 = true;
               if (Statics.field5701.field1405 != -1 && arg0.field1405 != -1) {
                  int var3 = Statics.field5701.field1405 < arg0.field1405 ? Statics.field5701.field1405 : arg0.field1405;
                  int var4 = Statics.field5701.field1382 - arg0.field1382;
                  if (var4 < 0) {
                     var4 = -var4;
                  }

                  if (var4 > var3) {
                     var2 = false;
                  }
               }

               String var5 = client.field2584 == class801.field7298 ? class881.field9017.method15374(Statics.field243) : class881.field8940.method15374(Statics.field243);
               if (arg0.field1382 >= arg0.field1390) {
                  var6 = arg0.method2862(true) + (var2 ? method14590(arg0.field1382, Statics.field5701.field1382) : class582.method7399(16777215)) + class582.field5307 + var5 + arg0.field1382 + class582.field5308;
               } else {
                  var6 = arg0.method2862(true) + (var2 ? method14590(arg0.field1382, Statics.field5701.field1382) : class582.method7399(16777215)) + class582.field5307 + var5 + arg0.field1382 + "+" + (arg0.field1390 - arg0.field1382) + class582.field5308;
               }
            } else if (arg0.field1392 == -1) {
               var6 = arg0.method2862(true);
            } else {
               var6 = arg0.method2862(true) + class582.field5307 + class881.field9039.method15374(Statics.field243) + arg0.field1392 + class582.field5308;
            }

            if (client.field2588 && !arg1 && (Statics.field9110 & 8) != 0) {
               method15520(client.field2591, client.field2592 + " " + class582.field5309 + " " + class582.method7399(16777215) + var6, Statics.field6160, 15, -1, (long)arg0.field12, 0, 0, true, false, (long)arg0.field12, false);
            }

            if (!arg1) {
               for(int var7 = 7; var7 >= 0; --var7) {
                  if (client.field2712[var7] != null) {
                     short var8 = 0;
                     if (client.field2584 == class801.field7297 && client.field2712[var7].equalsIgnoreCase(class881.field9010.method15374(Statics.field243))) {
                        if (client.field2682 && arg0.field1382 > Statics.field5701.field1382) {
                           var8 = 2000;
                        }

                        if (Statics.field5701.field1395 != 0 && arg0.field1395 != 0) {
                           if (Statics.field5701.field1395 == arg0.field1395) {
                              var8 = 2000;
                           } else {
                              var8 = 0;
                           }
                        } else if (arg0.field1409) {
                           var8 = 2000;
                        }
                     } else if (client.field2428[var7]) {
                        var8 = 2000;
                     }

                     short var9 = (short)(client.field2571[var7] + var8);
                     int var10 = client.field2574[var7] != -1 ? client.field2574[var7] : client.field2586;
                     method15520(client.field2712[var7], class582.method7399(16777215) + var6, var10, var9, -1, (long)arg0.field12, 0, 0, true, false, (long)arg0.field12, false);
                  }
               }
            } else {
               method15520(class582.method7399(13421772) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long)arg0.field12, false);
            }

            if (!arg1) {
               for(class261 var11 = (class261)field10487.method14964(); var11 != null; var11 = (class261)field10487.method15006()) {
                  if (var11.field1747 == 23) {
                     var11.field1748 = class582.method7399(16777215) + var6;
                     break;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("ju.bn(Lem;II)Ljava/lang/String;")
   private static String method8026(class425 arg0, int arg1) {
      if (!client.method4871(arg0).method899(arg1) && arg0.field3523 == null) {
         return null;
      } else if (arg0.field3488 != null && arg0.field3488.length > arg1 && arg0.field3488[arg1] != null && arg0.field3488[arg1].trim().length() != 0) {
         return arg0.field3488[arg1];
      } else {
         return client.field2599 ? "Hidden-" + arg1 : null;
      }
   }

   @deob.ObfuscatedName("ta.bk(III)Ljava/lang/String;")
   public static String method14590(int arg0, int arg1) {
      int var2 = arg1 - arg0;
      if (var2 < -9) {
         return class582.method7399(16711680);
      } else if (var2 < -6) {
         return class582.method7399(16723968);
      } else if (var2 < -3) {
         return class582.method7399(16740352);
      } else if (var2 < 0) {
         return class582.method7399(16756736);
      } else if (var2 > 9) {
         return class582.method7399(65280);
      } else if (var2 > 6) {
         return class582.method7399(4259584);
      } else if (var2 > 3) {
         return class582.method7399(8453888);
      } else {
         return var2 > 0 ? class582.method7399(12648192) : class582.method7399(16776960);
      }
   }

   @deob.ObfuscatedName("vp.bo(Lajp;III)V")
   private static void method15566(class261 arg0, int arg1, int arg2) {
      if (arg0 != null && field10487.field8711 != arg0) {
         int var3 = arg0.field1741;
         int var4 = arg0.field1742;
         int var5 = arg0.field1747;
         int var6 = (int)arg0.field1740;
         long var7 = arg0.field1740;
         if (var5 >= 2000) {
            var5 -= 2000;
         }

         class723 var9 = client.field2468.method9649();
         if (var5 == 1008 || var5 == 1009 || var5 == 1010 || var5 == 1011 || var5 == 1012) {
            class131.method14788(var5, var6, var3);
         }

         if (var5 == 30 && client.field2596 == null) {
            client.method5536(var4, var3);
            client.field2596 = Statics.method886(var4, var3);
            if (client.field2596 != null) {
               client.method7309(client.field2596);
            }
         }

         if (var5 == 16) {
            client.field2537 = arg1;
            client.field2504 = arg2;
            client.field2517 = 2;
            client.field2539 = 0;
            class109 var10 = class109.method15110(ClientProt.OPPLAYERT, client.field2463.field832);
            var10.field814.method1718(client.field2622);
            var10.field814.method1738(method10952() ? 1 : 0);
            var10.field814.method1627(Statics.field5701.field12);
            var10.field814.method1636(Statics.field4335);
            var10.field814.method1718(client.field2589);
            client.field2463.method1408(var10);
         }

         if (var5 == 8) {
            class106 var11 = (class106)client.field2615.method15322((long)var6);
            if (var11 != null) {
               class200 var12 = (class200)var11.field807;
               client.field2537 = arg1;
               client.field2504 = arg2;
               client.field2517 = 2;
               client.field2539 = 0;
               class109 var13 = class109.method15110(ClientProt.OPNPCT, client.field2463.field832);
               var13.field814.method1738(method10952() ? 1 : 0);
               var13.field814.method1569(var6);
               var13.field814.method1572(Statics.field4335);
               var13.field814.method1627(client.field2622);
               var13.field814.method1718(client.field2589);
               client.field2463.method1408(var13);
               client.method11583(var12.field16[0], var12.field62[0], true, class720.method5346(var12.field16[0], var12.field62[0], var12.method96(), var12.method96(), 0));
            }
         }

         if (var5 == 59) {
            client.field2537 = arg1;
            client.field2504 = arg2;
            client.field2517 = 1;
            client.field2539 = 0;
            class109 var14 = class109.method15110(ClientProt.APCOORDT, client.field2463.field832);
            var14.field814.method1569(client.field2622);
            var14.field814.method1569(client.field2589);
            var14.field814.method1627(var9.field6676 + var3);
            var14.field814.method1719(Statics.field4335);
            var14.field814.method1627(var9.field6677 + var4);
            client.field2463.method1408(var14);
            client.method11583(var3, var4, true, class720.method15739(var3, var4));
         }

         if (var5 == 58) {
            class425 var15 = Statics.method886(var4, var3);
            if (var15 != null) {
               client.method9967(var15);
            }
         }

         ClientPacket var16 = null;
         if (var5 == 18) {
            var16 = ClientProt.OPOBJ1;
         } else if (var5 == 19) {
            var16 = ClientProt.OPOBJ2;
         } else if (var5 == 20) {
            var16 = ClientProt.OPOBJ3;
         } else if (var5 == 21) {
            var16 = ClientProt.OPOBJ4;
         } else if (var5 == 22) {
            var16 = ClientProt.OPOBJ5;
         } else if (var5 == 1004) {
            var16 = ClientProt.OPOBJ6;
         }

         if (var16 != null) {
            client.field2537 = arg1;
            client.field2504 = arg2;
            client.field2517 = 2;
            client.field2539 = 0;
            class109 var17 = class109.method15110(var16, client.field2463.field832);
            var17.field814.method1568(method10952() ? 1 : 0);
            var17.field814.method1718(var9.field6676 + var3);
            var17.field814.method1750(var6);
            var17.field814.method1627(var9.field6677 + var4);
            client.field2463.method1408(var17);
            client.method15092(var3, var4);
         }

         ClientPacket var18 = null;
         if (var5 == 3) {
            var18 = ClientProt.OPLOC1;
         } else if (var5 == 4) {
            var18 = ClientProt.OPLOC2;
         } else if (var5 == 5) {
            var18 = ClientProt.OPLOC3;
         } else if (var5 == 6) {
            var18 = ClientProt.OPLOC4;
         } else if (var5 == 1001) {
            var18 = ClientProt.OPLOC5;
         } else if (var5 == 1002) {
            var18 = ClientProt.OPLOC6;
         }

         if (var18 != null) {
            client.field2537 = arg1;
            client.field2504 = arg2;
            client.field2517 = 2;
            client.field2539 = 0;
            class109 var19 = class109.method15110(var18, client.field2463.field832);
            var19.field814.method1569(var9.field6676 + var3);
            var19.field814.method1718(var9.field6677 + var4);
            var19.field814.method1719((int)(var7 >>> 32) & Integer.MAX_VALUE);
            var19.field814.method1738(method10952() ? 1 : 0);
            client.field2463.method1408(var19);
            client.method7970(var3, var4, var7);
         }

         if (var5 == 15) {
            class211 var20 = client.field2408[var6];
            if (var20 != null) {
               client.field2537 = arg1;
               client.field2504 = arg2;
               client.field2517 = 2;
               client.field2539 = 0;
               class109 var21 = class109.method15110(ClientProt.OPPLAYERT, client.field2463.field832);
               var21.field814.method1718(client.field2622);
               var21.field814.method1738(method10952() ? 1 : 0);
               var21.field814.method1627(var6);
               var21.field814.method1636(Statics.field4335);
               var21.field814.method1718(client.field2589);
               client.field2463.method1408(var21);
               client.method11583(var20.field16[0], var20.field62[0], true, class720.method5346(var20.field16[0], var20.field62[0], var20.method96(), var20.method96(), 0));
            }
         }

         if (var5 == 60) {
            if (client.field2562 > 0 && method14057()) {
               client.method15056(Statics.field5701.field1032, var9.field6676 + var3, var9.field6677 + var4);
            } else {
               client.field2537 = arg1;
               client.field2504 = arg2;
               client.field2517 = 1;
               client.field2539 = 0;
               class109 var22 = class109.method15110(ClientProt.FACE_SQUARE, client.field2463.field832);
               var22.field814.method1627(var9.field6677 + var4);
               var22.field814.method1569(var9.field6676 + var3);
               client.field2463.method1408(var22);
            }
         }

         ClientPacket var23 = null;
         if (var5 == 9) {
            var23 = ClientProt.OPNPC1;
         } else if (var5 == 10) {
            var23 = ClientProt.OPNPC2;
         } else if (var5 == 11) {
            var23 = ClientProt.OPNPC3;
         } else if (var5 == 12) {
            var23 = ClientProt.OPNPC4;
         } else if (var5 == 13) {
            var23 = ClientProt.OPNPC5;
         } else if (var5 == 1003) {
            var23 = ClientProt.OPNPC6;
         }

         if (var23 != null) {
            class106 var24 = (class106)client.field2615.method15322((long)var6);
            if (var24 != null) {
               class200 var25 = (class200)var24.field807;
               client.field2537 = arg1;
               client.field2504 = arg2;
               client.field2517 = 2;
               client.field2539 = 0;
               class109 var26 = class109.method15110(var23, client.field2463.field832);
               var26.field814.method1568(method10952() ? 1 : 0);
               var26.field814.method1718(var6);
               client.field2463.method1408(var26);
               client.method11583(var25.field16[0], var25.field62[0], true, class720.method5346(var25.field16[0], var25.field62[0], var25.method96(), var25.method96(), 0));
            }
         }

         if (var5 == 2) {
            client.field2537 = arg1;
            client.field2504 = arg2;
            client.field2517 = 2;
            client.field2539 = 0;
            class109 var27 = class109.method15110(ClientProt.OPLOCT, client.field2463.field832);
            var27.field814.method1636(Statics.field4335);
            var27.field814.method1568(method10952() ? 1 : 0);
            var27.field814.method1750(var9.field6676 + var3);
            var27.field814.method1750(var9.field6677 + var4);
            var27.field814.method1569(client.field2589);
            var27.field814.method1572((int)(var7 >>> 32) & Integer.MAX_VALUE);
            var27.field814.method1750(client.field2622);
            client.field2463.method1408(var27);
            client.method7970(var3, var4, var7);
         }

         if (var5 == 23) {
            if (client.field2562 > 0 && method14057()) {
               client.method15056(Statics.field5701.field1032, var9.field6676 + var3, var9.field6677 + var4);
            } else {
               class109 var28 = method6611(var3, var4, var6);
               if (var6 == 1) {
                  var28.field814.method1568(-1);
                  var28.field814.method1568(-1);
                  var28.field814.method1569((int)client.field2502);
                  var28.field814.method1568(57);
                  var28.field814.method1568(client.field2519);
                  var28.field814.method1568(client.field2619);
                  var28.field814.method1568(89);
                  class584 var29 = Statics.field5701.method11602().field5446;
                  var28.field814.method1569((int)var29.field5328);
                  var28.field814.method1569((int)var29.field5331);
                  var28.field814.method1568(63);
               } else {
                  client.field2537 = arg1;
                  client.field2504 = arg2;
                  client.field2517 = 1;
                  client.field2539 = 0;
               }

               client.field2463.method1408(var28);
               client.method11583(var3, var4, true, class720.method15739(var3, var4));
            }
         }

         ClientPacket var30 = null;
         if (var5 == 44) {
            var30 = ClientProt.OPPLAYER1;
         } else if (var5 == 45) {
            var30 = ClientProt.OPPLAYER2;
         } else if (var5 == 46) {
            var30 = ClientProt.OPPLAYER3;
         } else if (var5 == 47) {
            var30 = ClientProt.OPPLAYER4;
         } else if (var5 == 48) {
            var30 = ClientProt.OPPLAYER5;
         } else if (var5 == 49) {
            var30 = ClientProt.OPPLAYER6;
         } else if (var5 == 50) {
            var30 = ClientProt.OPPLAYER7;
         } else if (var5 == 51) {
            var30 = ClientProt.OPPLAYER8;
         } else if (var5 == 52) {
            var30 = ClientProt.OPPLAYER9;
         } else if (var5 == 53) {
            var30 = ClientProt.OPPLAYER10;
         }

         if (var30 != null) {
            class211 var31 = client.field2408[var6];
            if (var31 != null) {
               client.field2537 = arg1;
               client.field2504 = arg2;
               client.field2517 = 2;
               client.field2539 = 0;
               class109 var32 = class109.method15110(var30, client.field2463.field832);
               var32.field814.method1568(method10952() ? 1 : 0);
               var32.field814.method1718(var6);
               client.field2463.method1408(var32);
               client.method11583(var31.field16[0], var31.field62[0], true, class720.method5346(var31.field16[0], var31.field62[0], var31.method96(), var31.method96(), 0));
            }
         }

         if (var5 == 17) {
            client.field2537 = arg1;
            client.field2504 = arg2;
            client.field2517 = 2;
            client.field2539 = 0;
            class109 var33 = class109.method15110(ClientProt.OPOBJT, client.field2463.field832);
            var33.field814.method1718(var6);
            var33.field814.method1627(client.field2589);
            var33.field814.method1750(var9.field6677 + var4);
            var33.field814.method1627(var9.field6676 + var3);
            var33.field814.method1718(client.field2622);
            var33.field814.method1738(method10952() ? 1 : 0);
            var33.field814.method1636(Statics.field4335);
            client.field2463.method1408(var33);
            client.method15092(var3, var4);
         }

         if (var5 == 57 || var5 == 1007) {
            client.method14178(var6, var4, var3, arg0.field1743);
         }

         if (var5 == 25) {
            class425 var34 = Statics.method886(var4, var3);
            if (var34 != null) {
               client.method14495();
               class58 var35 = client.method4871(var34);
               client.method5929(var34, var35.method911(), var35.field434);
               client.field2591 = client.method9706(var34);
               if (client.field2591 == null) {
                  client.field2591 = "Null";
               }

               client.field2592 = var34.field3548 + class582.method7399(16777215);
            }

         } else {
            if (client.field2588) {
               client.method14495();
            }

            if (Statics.field9382 != null && client.field2541 == 0) {
               client.method7309(Statics.field9382);
            }

         }
      }
   }

   @deob.ObfuscatedName("gd.bj(IIII)Ladz;")
   private static class109 method6611(int arg0, int arg1, int arg2) {
      class109 var3 = null;
      if (arg2 == 0) {
         var3 = class109.method15110(ClientProt.MOVE_GAMECLICK, client.field2463.field832);
      }

      if (arg2 == 1) {
         var3 = class109.method15110(ClientProt.MOVE_MINIMAPCLICK, client.field2463.field832);
      }

      class723 var4 = client.field2468.method9649();
      var3.field814.method1750(var4.field6676 + arg0);
      var3.field814.method1627(var4.field6677 + arg1);
      var3.field814.method1738(method10952() ? 1 : 0);
      class299.field1890 = arg0;
      class299.field1895 = arg1;
      class299.field1892 = false;
      class231.method11314();
      return var3;
   }

   @deob.ObfuscatedName("xa.bv(IIB)Z")
   public static boolean method15972(int arg0, int arg1) {
      if (arg1 >= 1000 && arg0 < 1000) {
         return true;
      } else if (arg1 < 1000 && arg0 < 1000) {
         if (method9174(arg0)) {
            return true;
         } else {
            return !method9174(arg1);
         }
      } else {
         return arg1 >= 1000 && arg0 >= 1000;
      }
   }

   @deob.ObfuscatedName("ly.bd(IB)Z")
   private static boolean method9174(int arg0) {
      return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
   }

   @deob.ObfuscatedName("qi.bi(FFFFFFII)F")
   private static float method11188(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
      float var7 = 0.0F;
      float var8 = arg3 - arg0;
      float var9 = arg4 - arg1;
      float var10 = arg5 - arg2;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      class713 var14 = client.field2468.method9639();

      while(var7 < 1.1F) {
         float var15 = var7 * var8 + arg0;
         float var16 = var7 * var9 + arg1;
         float var17 = var7 * var10 + arg2;
         int var18 = (int)var15 >> 9;
         int var19 = (int)var17 >> 9;
         if (var18 > 0 && var19 > 0 && var18 < client.field2468.method9648() && var19 < client.field2468.method9604()) {
            int var20 = Statics.field5701.field1032;
            if (var20 < 3 && (client.field2468.method9592().field5520[1][var18][var19] & 2) != 0) {
               ++var20;
            }

            int var21 = var14.field6582[var20].method15965((int)var15, (int)var17);
            if ((float)var21 < var16) {
               if (arg6 >= 2) {
                  return var7 - 0.1F + method11188(var11, var12, var13, var15, var16, var17, arg6 - 1) * 0.1F;
               }

               return var7;
            }
         }

         var11 = var15;
         var12 = var16;
         var13 = var17;
         var7 += 0.1F;
      }

      return -1.0F;
   }
}
