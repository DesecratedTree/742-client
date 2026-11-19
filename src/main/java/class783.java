import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import net.ClientProt;

@deob.ObfuscatedName("rl")
public final class class783 {
   @deob.ObfuscatedName("rl.d")
   private static int field7170 = 0;
   @deob.ObfuscatedName("rl.b")
   private static int[] field7178 = new int[3];
   @deob.ObfuscatedName("rl.r")
   public static class737 field7172 = new class737(4);
   @deob.ObfuscatedName("rl.p")
   private static class584[] field7173 = new class584[2];
   @deob.ObfuscatedName("rl.o")
   private static boolean field7174 = false;
   @deob.ObfuscatedName("rl.a")
   private static String field7175 = null;
   @deob.ObfuscatedName("rl.x")
   private static ArrayList field7168 = new ArrayList();
   @deob.ObfuscatedName("rl.s")
   private static int field7176 = 0;
   @deob.ObfuscatedName("rl.l")
   private static int field7171 = 0;

   private class783() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("pi.n(I)Lrs;")
   public static final class790 method10734() {
      if (field7176 == field7168.size()) {
         field7168.add(new class790());
      }

      class790 var0 = (class790)field7168.get(field7176);
      ++field7176;
      return var0;
   }

   @deob.ObfuscatedName("nx.k(I)V")
   private static final void method10061() {
      --field7176;
   }

   @deob.ObfuscatedName("vd.d(Ladg;I)V")
   public static void method15429(class90 arg0) {
      method10736(arg0, 200000);
   }

   @deob.ObfuscatedName("of.b(I[II)V")
   public static void method10196(int arg0, int[] arg1) {
      if (arg0 != -1) {
         if (class425.method4009(arg0, arg1)) {
            class425[] var2 = Statics.field844[arg0].field3569;
            Statics.method10200(var2);
         }
      }
   }

   @deob.ObfuscatedName("pi.p(Ladg;IB)V")
   public static void method10736(class90 arg0, int arg1) {
      Object[] var2 = arg0.field683;
      int var3 = (Integer)var2[0];
      class248 var4 = class795.method10712(var3);
      if (var4 != null) {
         class790 var5 = method10734();
         var5.field7211 = new int[var4.field1645];
         int var6 = 0;
         var5.field7199 = new String[var4.field1646];
         int var7 = 0;
         var5.field7200 = new long[var4.field1651];
         int var8 = 0;

         for(int var9 = 1; var9 < var2.length; ++var9) {
            if (var2[var9] instanceof Integer) {
               int var10 = (Integer)var2[var9];
               if (var10 == -2147483647) {
                  var10 = arg0.field680;
               }

               if (var10 == -2147483646) {
                  var10 = arg0.field681;
               }

               if (var10 == -2147483645) {
                  var10 = arg0.field679 != null ? arg0.field679.field3465 : -1;
               }

               if (var10 == -2147483644) {
                  var10 = arg0.field682;
               }

               if (var10 == -2147483643) {
                  var10 = arg0.field679 != null ? arg0.field679.field3401 : -1;
               }

               if (var10 == -2147483642) {
                  var10 = arg0.field685 != null ? arg0.field685.field3465 : -1;
               }

               if (var10 == -2147483641) {
                  var10 = arg0.field685 != null ? arg0.field685.field3401 : -1;
               }

               if (var10 == -2147483640) {
                  var10 = arg0.field684;
               }

               if (var10 == -2147483639) {
                  var10 = arg0.field677;
               }

               var5.field7211[var6++] = var10;
            } else if (var2[var9] instanceof String) {
               String var11 = (String)var2[var9];
               if (var11.equals("event_opbase")) {
                  var11 = arg0.field678;
               }

               var5.field7199[var7++] = var11;
            } else if (var2[var9] instanceof Long) {
               long var12 = (Long)var2[var9];
               var5.field7200[var8++] = var12;
            }
         }

         var5.field7198 = arg0.field687;
         method8895(var4, arg1, var5);
      }
   }

   @deob.ObfuscatedName("ee.o(Lwz;IILaab;IB)V")
   public static void method5726(class932 arg0, int arg1, int arg2, class4 arg3, int arg4) {
      class790 var5 = method10734();
      var5.field7216 = arg3;
      var5.field7220 = arg4;
      method10679(arg0, arg1, arg2, var5);
      var5.field7216 = null;
      var5.field7220 = -1;
   }

   @deob.ObfuscatedName("ig.a(Lwz;IILcr;I)V")
   public static void method7343(class932 arg0, int arg1, int arg2, class376 arg3) {
      class790 var4 = method10734();
      var4.field7217 = arg3;
      method10679(arg0, arg1, arg2, var4);
      var4.field7217 = null;
   }

   @deob.ObfuscatedName("oc.x(Lwz;IILrb;Laln;I)V")
   public static void method10138(class932 arg0, int arg1, int arg2, class773 arg3, class309 arg4) {
      class790 var5 = method10734();
      var5.field7218 = arg4;
      method10679(arg0, arg1, arg2, var5);
      var5.field7218 = null;
   }

   @deob.ObfuscatedName("rx.s(Lwz;III)V")
   public static void method14203(class932 arg0, int arg1, int arg2) {
      class790 var3 = method10734();
      method10679(arg0, arg1, arg2, var3);
   }

   @deob.ObfuscatedName("pc.l(Lwz;IILrs;I)V")
   private static void method10679(class932 arg0, int arg1, int arg2, class790 arg3) {
      class248 var4 = Statics.method10133(arg0, arg1, arg2);
      if (var4 == null) {
         method10061();
      } else {
         arg3.field7211 = new int[var4.field1645];
         arg3.field7199 = new Object[var4.field1646];
         if (class932.field9457 != var4.field1639 && class932.field9445 != var4.field1639 && class932.field9444 != var4.field1639) {
            if (class932.field9451 == var4.field1639) {
               arg3.field7211[0] = arg3.field7220;
            }
         } else {
            int var5 = 0;
            int var6 = 0;
            if (Statics.field818 != null) {
               var5 = Statics.field818.field3398;
               var6 = Statics.field818.field3487;
            }

            arg3.field7211[0] = Statics.field336.method1896() - var5;
            arg3.field7211[1] = Statics.field336.method1897() - var6;
         }

         method8895(var4, 200000, arg3);
      }
   }

   @deob.ObfuscatedName("lh.v(Lajc;ILrs;I)V")
   public static void method8895(class248 arg0, int arg1, class790 arg2) {
      arg2.field7204 = 0;
      arg2.field7205 = 0;
      arg2.field7206 = -1;
      arg2.field7225 = arg0;
      arg2.field7201 = arg2.field7225.field1641;
      arg2.field7222 = arg2.field7225.field1642;
      class805 var3 = null;
      arg2.field7209 = 0;

      try {
         field7170 = 0;

         while(true) {
            ++field7170;
            if (field7170 > arg1) {
               throw new RuntimeException("");
            }

            var3 = arg2.field7201[++arg2.field7206];
            if (field7174 && (field7175 == null || arg2.field7225.field1640 != null && arg2.field7225.field1640.indexOf(field7175) != -1)) {
               System.out.println(arg2.field7225.field1640 + ": " + var3);
            }

            if (arg2.field7222[arg2.field7206] == 1) {
               arg2.field7219 = true;
            } else {
               arg2.field7219 = false;
            }

            if (class805.field7321 == var3 && arg2.field7209 == 0) {
               return;
            }

            method2233(var3, arg2);
         }
      } catch (Exception var10) {
         StringBuilder var5 = new StringBuilder(30);
         var5.append("").append(arg2.field7225.field6137).append(" ");

         for(int var6 = arg2.field7209 - 1; var6 >= 0; --var6) {
            var5.append("").append(arg2.field7210[var6].field7189.field6137).append(" ");
         }

         var5.append("").append(var3.field8353);
         class285.method15864(var5.toString(), var10);
      } finally {
         method10061();
      }
   }

   @deob.ObfuscatedName("qb.g(Leo;IIIZLrs;B)V")
   private static void method11045(class427 arg0, int arg1, int arg2, int arg3, boolean arg4, class790 arg5) {
      if (arg2 == 0) {
         throw new RuntimeException();
      } else {
         class425 var6 = arg0.field3569[arg1];
         if (var6.field3551 == null) {
            var6.field3551 = new class425[arg3 + 1];
            var6.field3552 = var6.field3551;
         }

         if (var6.field3551.length <= arg3) {
            if (var6.field3552 == var6.field3551) {
               class425[] var7 = new class425[arg3 + 1];

               for(int var8 = 0; var8 < var6.field3551.length; ++var8) {
                  var7[var8] = var6.field3551[var8];
               }

               var6.field3551 = var6.field3552 = var7;
            } else {
               class425[] var9 = new class425[arg3 + 1];
               class425[] var10 = new class425[arg3 + 1];

               for(int var11 = 0; var11 < var6.field3551.length; ++var11) {
                  var9[var11] = var6.field3551[var11];
                  var10[var11] = var6.field3552[var11];
               }

               var6.field3551 = var9;
               var6.field3552 = var10;
            }
         }

         if (arg3 > 0 && var6.field3551[arg3 - 1] == null) {
            throw new RuntimeException("" + (arg3 - 1));
         } else {
            class425 var12 = new class425();
            var12.field3402 = arg2;
            var12.field3462 = var12.field3465 = var6.field3465;
            var12.field3401 = arg3;
            var6.field3551[arg3] = var12;
            if (var6.field3552 != var6.field3551) {
               var6.field3552[arg3] = var12;
            }

            class778 var13;
            if (arg4) {
               var13 = arg5.field7212;
            } else {
               var13 = arg5.field7223;
            }

            var13.field7148 = arg0;
            var13.field7147 = var12;
            client.method7309(var6);
         }
      }
   }

   @deob.ObfuscatedName("qy.h(Leo;Lem;I)V")
   private static void method11455(class427 arg0, class425 arg1) {
      if (arg1 != null) {
         if (arg1.field3401 != -1) {
            class425 var2 = arg0.method5917(arg1.field3462);
            if (var2 != null) {
               if (var2.field3552 == var2.field3551) {
                  var2.field3552 = new class425[var2.field3551.length];
                  var2.field3552[var2.field3552.length - 1] = arg1;
                  class803.method14271(var2.field3551, 0, var2.field3552, 0, arg1.field3401);
                  class803.method14271(var2.field3551, arg1.field3401 + 1, var2.field3552, arg1.field3401, var2.field3551.length - arg1.field3401 - 1);
               } else {
                  int var3 = 0;
                  class425[] var4 = var2.field3552;

                  while(var3 < var4.length && var4[var3] != arg1) {
                     ++var3;
                  }

                  if (var3 >= var4.length) {
                     return;
                  }

                  class803.method14271(var4, var3 + 1, var4, var3, var4.length - var3 - 1);
                  var4[var2.field3552.length - 1] = arg1;
               }
            }
         } else {
            class425[] var5 = arg0.method5919();

            int var6;
            for(var6 = 0; var6 < var5.length && var5[var6] != arg1; ++var6) {
            }

            if (var6 >= var5.length) {
               return;
            }

            class803.method14271(var5, var6 + 1, var5, var6, var5.length - var6 - 1);
            var5[var5.length - 1] = arg1;
         }
      }

   }

   @deob.ObfuscatedName("pu.e(Leo;Lem;I)V")
   private static void method10931(class427 arg0, class425 arg1) {
      if (arg1 != null) {
         if (arg1.field3401 != -1) {
            class425 var2 = arg0.field3569[arg1.field3462 & 65535];
            if (var2 != null) {
               if (var2.field3552 == var2.field3551) {
                  var2.field3552 = new class425[var2.field3551.length];
                  var2.field3552[0] = arg1;
                  class803.method14271(var2.field3551, 0, var2.field3552, 1, arg1.field3401);
                  class803.method14271(var2.field3551, arg1.field3401 + 1, var2.field3552, arg1.field3401 + 1, var2.field3551.length - arg1.field3401 - 1);
               } else {
                  int var3 = 0;
                  class425[] var4 = var2.field3552;

                  while(var3 < var4.length && var4[var3] != arg1) {
                     ++var3;
                  }

                  if (var3 >= var4.length) {
                     return;
                  }

                  class803.method14271(var4, 0, var4, 1, var3);
                  var4[0] = arg1;
               }
            }
         } else {
            class425[] var5 = arg0.method5919();

            int var6;
            for(var6 = 0; var6 < var5.length && var5[var6] != arg1; ++var6) {
            }

            if (var6 >= var5.length) {
               return;
            }

            class803.method14271(var5, 0, var5, 1, var6);
            var5[0] = arg1;
         }
      }

   }

   @deob.ObfuscatedName("abl.z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZS)V")
   public static void method663(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) {
      class110 var5 = Statics.method8951();
      if (var5.method1413() != null) {
         class109 var6 = class109.method15110(ClientProt.URL_REQUEST, var5.field832);
         var6.field814.method1569(class124.method1229(arg0) + class124.method1229(arg1) + class124.method1229(arg2) + 1);
         var6.field814.method1577(arg0);
         var6.field814.method1577(arg1);
         var6.field814.method1577(arg2);
         int var7 = 0;
         if (arg3) {
            var7 |= 1;
         }

         if (arg4) {
            var7 |= 2;
         }

         var6.field814.method1568(var7);
         var5.method1408(var6);
      }

   }

   @deob.ObfuscatedName("ob.m(Lajp;Lrs;I)V")
   private static final void method10130(class261 arg0, class790 arg1) {
      arg1.field7203[++arg1.field7204 - 1] = class987.method6886(arg0);
      arg1.field7226[++arg1.field7205 - 1] = Statics.method8533(arg0);
      arg1.field7226[++arg1.field7205 - 1] = class987.method5521(arg0);
      arg1.field7226[++arg1.field7205 - 1] = class987.method5925(arg0);
   }

   @deob.ObfuscatedName("afv.i(Lsg;Lrs;B)V")
   private static final void method2233(class805 arg0, class790 arg1) throws class168 {
      switch(arg0.field8353) {
      case 0:
         method14066(arg1);
         return;
      case 1:
         method4004(arg1);
         return;
      case 2:
         method5678(arg1);
         return;
      case 3:
         method8005(arg1);
         return;
      case 4:
         method9499(arg1);
         return;
      case 5:
         method8283(arg1);
         return;
      case 6:
         method8922(arg1);
         return;
      case 7:
         method9418(arg1);
         return;
      case 8:
         method10714(arg1);
         return;
      case 9:
         method11466(arg1);
         return;
      case 10:
         method7337(arg1);
         return;
      case 11:
         method6479(arg1);
         return;
      case 12:
         method6505(arg1);
         return;
      case 13:
         method15370(arg1);
         return;
      case 14:
         method16015(arg1);
         return;
      case 15:
         method10709(arg1);
         return;
      case 16:
         method5926(arg1);
         return;
      case 17:
         method6441(arg1);
         return;
      case 18:
         method7985(arg1);
         return;
      case 19:
         method1796(arg1);
         return;
      case 20:
         method14786(arg1);
         return;
      case 21:
         method14918(arg1);
         return;
      case 22:
         Statics.method11177(arg1);
         return;
      case 23:
         method10654(arg1);
         return;
      case 24:
         method16037(arg1);
         return;
      case 25:
         method209(arg1);
         return;
      case 26:
         method11679(arg1);
         return;
      case 27:
         method10816(arg1);
         return;
      case 28:
         method10296(arg1);
         return;
      case 29:
         method14544(arg1);
         return;
      case 30:
         method10942(arg1);
         return;
      case 31:
         Statics.method10165(arg1);
         return;
      case 32:
         method16036(arg1);
         return;
      case 33:
         method14783(arg1);
         return;
      case 34:
         class788.method5913(arg1);
         return;
      case 35:
         method14197(arg1);
         return;
      case 36:
         Statics.method14448(arg1);
         return;
      case 37:
         method11383(arg1);
         return;
      case 38:
         method2084(arg1);
         return;
      case 39:
         method5636(arg1);
         return;
      case 40:
         method11698(arg1);
         return;
      case 41:
         Statics.method398(arg1);
         return;
      case 42:
         method6105(arg1);
         return;
      case 43:
         method4087(arg1);
         return;
      case 44:
         method1525(arg1);
         return;
      case 45:
         Statics.method14956(arg1);
         return;
      case 46:
         method14228(arg1);
         return;
      case 47:
         method14493(arg1);
         return;
      case 48:
         Statics.method15188(arg1);
         return;
      case 49:
         method15440(arg1);
         return;
      case 50:
         method5344(arg1);
         return;
      case 51:
         method5637(arg1);
         return;
      case 52:
         method6622(arg1);
         return;
      case 53:
         Statics.method5043(arg1);
         return;
      case 54:
         method10471(arg1);
         return;
      case 55:
         method6552(arg1);
         return;
      case 56:
         method5743(arg1);
         return;
      case 57:
         method7895(arg1);
         return;
      case 58:
         method6286(arg1);
         return;
      case 59:
         method7428(arg1);
         return;
      case 60:
         method15960(arg1);
         return;
      case 61:
         method5380(arg1);
         return;
      case 62:
         method4046(arg1);
         return;
      case 63:
         method6153(arg1);
         return;
      case 64:
         method4108(arg1);
         return;
      case 65:
         method16063(arg1);
         return;
      case 66:
         method6449(arg1);
         return;
      case 67:
         method16070(arg1);
         return;
      case 68:
         method10197(arg1);
         return;
      case 69:
         method9964(arg1);
         return;
      case 70:
         method9393(arg1);
         return;
      case 71:
         method15376(arg1);
         return;
      case 72:
         method10344(arg1);
         return;
      case 73:
         method10008(arg1);
         return;
      case 74:
         method9841(arg1);
         return;
      case 75:
         method5791(arg1);
         return;
      case 76:
         method11739(arg1);
         return;
      case 77:
         Statics.method10647(arg1);
         return;
      case 78:
         method11649(arg1);
         return;
      case 79:
         Statics.method9262(arg1);
         return;
      case 80:
         Statics.method5391(arg1);
         return;
      case 81:
         Statics.method11691(arg1);
         return;
      case 82:
         method16031(arg1);
         return;
      case 83:
         method14665(arg1);
         return;
      case 84:
         method7439(arg1);
         return;
      case 85:
         method10946(arg1);
         return;
      case 86:
         method11458(arg1);
         return;
      case 87:
         method15288(arg1);
         return;
      case 88:
         method14216(arg1);
         return;
      case 89:
         method11728(arg1);
         return;
      case 90:
         method3575(arg1);
         return;
      case 91:
         method11206(arg1);
         return;
      case 92:
         method6221(arg1);
         return;
      case 93:
         method14176(arg1);
         return;
      case 94:
         method1438(arg1);
         return;
      case 95:
         method6738(arg1);
         return;
      case 96:
         method15219(arg1);
         return;
      case 97:
         Statics.method14402(arg1);
         return;
      case 98:
         Statics.method10341(arg1);
         return;
      case 99:
         method9463(arg1);
         return;
      case 100:
         method4065(arg1);
         return;
      case 101:
         method15560(arg1);
         return;
      case 102:
         method2951(arg1);
         return;
      case 103:
         method9119(arg1);
         return;
      case 104:
         method11347(arg1);
         return;
      case 105:
         method584(arg1);
         return;
      case 106:
         method15478(arg1);
         return;
      case 107:
         method17055(arg1);
         return;
      case 108:
         method9885(arg1);
         return;
      case 109:
         method14155(arg1);
         return;
      case 110:
         method4478(arg1);
         return;
      case 111:
         method6124(arg1);
         return;
      case 112:
         method7903(arg1);
         return;
      case 113:
         method9659(arg1);
         return;
      case 114:
         method15164(arg1);
         return;
      case 115:
         method3992(arg1);
         return;
      case 116:
         method11731(arg1);
         return;
      case 117:
         method10315(arg1);
         return;
      case 118:
         method8033(arg1);
         return;
      case 119:
         method11051(arg1);
         return;
      case 120:
         method3568(arg1);
         return;
      case 121:
         method9502(arg1);
         return;
      case 122:
         method10390(arg1);
         return;
      case 123:
         method8992(arg1);
         return;
      case 124:
         method15439(arg1);
         return;
      case 125:
         method1387(arg1);
         return;
      case 126:
         method3470(arg1);
         return;
      case 127:
         Statics.method11653(arg1);
         return;
      case 128:
         method9272(arg1);
         return;
      case 129:
         method3995(arg1);
         return;
      case 130:
         method10956(arg1);
         return;
      case 131:
         method15287(arg1);
         return;
      case 132:
         method5798(arg1);
         return;
      case 133:
         method6538(arg1);
         return;
      case 134:
         method4045(arg1);
         return;
      case 135:
         method665(arg1);
         return;
      case 136:
         method5631(arg1);
         return;
      case 137:
         method1103(arg1);
         return;
      case 138:
         method9997(arg1);
         return;
      case 139:
         method3326(arg1);
         return;
      case 140:
         method14512(arg1);
         return;
      case 141:
         method5212(arg1);
         return;
      case 142:
         method7376(arg1);
         return;
      case 143:
         method2260(arg1);
         return;
      case 144:
         method7967(arg1);
         return;
      case 145:
         method9273(arg1);
         return;
      case 146:
         method8286(arg1);
         return;
      case 147:
         method10461(arg1);
         return;
      case 148:
         method15754(arg1);
         return;
      case 149:
         method11382(arg1);
         return;
      case 150:
         method8323(arg1);
         return;
      case 151:
         method10659(arg1);
         return;
      case 152:
         method10961(arg1);
         return;
      case 153:
         method1091(arg1);
         return;
      case 154:
         method14127(arg1);
         return;
      case 155:
         method8683(arg1);
         return;
      case 156:
         Statics.method10953(arg1);
         return;
      case 157:
         method7457(arg1);
         return;
      case 158:
         method3347(arg1);
         return;
      case 159:
         method5729(arg1);
         return;
      case 160:
         method9120(arg1);
         return;
      case 161:
         method15963(arg1);
         return;
      case 162:
         method15479(arg1);
         return;
      case 163:
         method10855(arg1);
         return;
      case 164:
         method10655(arg1);
         return;
      case 165:
         method10168(arg1);
         return;
      case 166:
         method11456(arg1);
         return;
      case 167:
         method4521(arg1);
         return;
      case 168:
         method1886(arg1);
         return;
      case 169:
         method16262(arg1);
         return;
      case 170:
         method9343(arg1);
         return;
      case 171:
         method6525(arg1);
         return;
      case 172:
         method11692(arg1);
         return;
      case 173:
         method10033(arg1);
         return;
      case 174:
         method15062(arg1);
         return;
      case 175:
         method4477(arg1);
         return;
      case 176:
         method10954(arg1);
         return;
      case 177:
         method10718(arg1);
         return;
      case 178:
         method6742(arg1);
         return;
      case 179:
         method6488(arg1);
         return;
      case 180:
         method5779(arg1);
         return;
      case 181:
         method11736(arg1);
         return;
      case 182:
         method10807(arg1);
         return;
      case 183:
         Statics.method1391(arg1);
         return;
      case 184:
         method367(arg1);
         return;
      case 185:
         method14226(arg1);
         return;
      case 186:
         method8023(arg1);
         return;
      case 187:
         method1496(arg1);
         return;
      case 188:
         method10463(arg1);
         return;
      case 189:
         method4454(arg1);
         return;
      case 190:
         method5676(arg1);
         return;
      case 191:
         method15889(arg1);
         return;
      case 192:
         method11331(arg1);
         return;
      case 193:
         method8687(arg1);
         return;
      case 194:
         method5384(arg1);
         return;
      case 195:
         method10142(arg1);
         return;
      case 196:
         method5153(arg1);
         return;
      case 197:
         Statics.method9072(arg1);
         return;
      case 198:
         method10789(arg1);
         return;
      case 199:
         Statics.method9675(arg1);
         return;
      case 200:
         method5517(arg1);
         return;
      case 201:
         method6531(arg1);
         return;
      case 202:
         class788.method1385(arg1);
         return;
      case 203:
         method14447(arg1);
         return;
      case 204:
         method6219(arg1);
         return;
      case 205:
         method15093(arg1);
         return;
      case 206:
         method14839(arg1);
         return;
      case 207:
         method5742(arg1);
         return;
      case 208:
         method5180(arg1);
         return;
      case 209:
         method8275(arg1);
         return;
      case 210:
         method6595(arg1);
         return;
      case 211:
         method10060(arg1);
         return;
      case 212:
         method76(arg1);
         return;
      case 213:
         method10748(arg1);
         return;
      case 214:
         method6898(arg1);
         return;
      case 215:
         method5769(arg1);
         return;
      case 216:
         method9954(arg1);
         return;
      case 217:
         method10681(arg1);
         return;
      case 218:
         method15038(arg1);
         return;
      case 219:
         method9391(arg1);
         return;
      case 220:
         method14948(arg1);
         return;
      case 221:
         method11386(arg1);
         return;
      case 222:
         Statics.method1851(arg1);
         return;
      case 223:
         method7352(arg1);
         return;
      case 224:
         method15427(arg1);
         return;
      case 225:
         method4453(arg1);
         return;
      case 226:
         method8024(arg1);
         return;
      case 227:
         method11312(arg1);
         return;
      case 228:
         method16265(arg1);
         return;
      case 229:
         method249(arg1);
         return;
      case 230:
         method10343(arg1);
         return;
      case 231:
         method10661(arg1);
         return;
      case 232:
         Statics.method6541(arg1);
         return;
      case 233:
         method10365(arg1);
         return;
      case 234:
         method9342(arg1);
         return;
      case 235:
         method5406(arg1);
         return;
      case 236:
         method5747(arg1);
         return;
      case 237:
         method14538(arg1);
         return;
      case 238:
         method8522(arg1);
         return;
      case 239:
         method14591(arg1);
         return;
      case 240:
         method483(arg1);
         return;
      case 241:
         method9711(arg1);
         return;
      case 242:
         Statics.method2948(arg1);
         return;
      case 243:
         method15354(arg1);
         return;
      case 244:
         method10469(arg1);
         return;
      case 245:
         method10713(arg1);
         return;
      case 246:
         method10739(arg1);
         return;
      case 247:
         method3349(arg1);
         return;
      case 248:
         method10996(arg1);
         return;
      case 249:
         method6255(arg1);
         return;
      case 250:
         method2160(arg1);
         return;
      case 251:
         method14199(arg1);
         return;
      case 252:
         method14401(arg1);
         return;
      case 253:
         method14594(arg1);
         return;
      case 254:
         method5271(arg1);
         return;
      case 255:
         method9714(arg1);
         return;
      case 256:
         method452(arg1);
         return;
      case 257:
         method5640(arg1);
         return;
      case 258:
         method762(arg1);
         return;
      case 259:
         method15367(arg1);
         return;
      case 260:
         method5799(arg1);
         return;
      case 261:
         method15094(arg1);
         return;
      case 262:
         method8352(arg1);
         return;
      case 263:
         method14060(arg1);
         return;
      case 264:
         method10997(arg1);
         return;
      case 265:
         method10856(arg1);
         return;
      case 266:
         method14182(arg1);
         return;
      case 267:
         method2212(arg1);
         return;
      case 268:
         method15890(arg1);
         return;
      case 269:
         method14175(arg1);
         return;
      case 270:
         method5152(arg1);
         return;
      case 271:
         method5806(arg1);
         return;
      case 272:
         method11385(arg1);
         return;
      case 273:
         method15863(arg1);
         return;
      case 274:
         method14218(arg1);
         return;
      case 275:
         method16302(arg1);
         return;
      case 276:
         method14255(arg1);
         return;
      case 277:
         method210(arg1);
         return;
      case 278:
         Statics.method4054(arg1);
         return;
      case 279:
         method7325(arg1);
         return;
      case 280:
         method9725(arg1);
         return;
      case 281:
         class788.method14231(arg1);
         return;
      case 282:
         method3953(arg1);
         return;
      case 283:
         method11162(arg1);
         return;
      case 284:
         method6619(arg1);
         return;
      case 285:
         method2856(arg1);
         return;
      case 286:
         method7914(arg1);
         return;
      case 287:
         Statics.method17091(arg1);
         return;
      case 288:
         Statics.method691(arg1);
         return;
      case 289:
         method11295(arg1);
         return;
      case 290:
         method14543(arg1);
         return;
      case 291:
         method6545(arg1);
         return;
      case 292:
         method6573(arg1);
         return;
      case 293:
         method10949(arg1);
         return;
      case 294:
         Statics.method11647(arg1);
         return;
      case 295:
         method10100(arg1);
         return;
      case 296:
         method4066(arg1);
         return;
      case 297:
         method10745(arg1);
         return;
      case 298:
         method6266(arg1);
         return;
      case 299:
         method15731(arg1);
         return;
      case 300:
         method9228(arg1);
         return;
      case 301:
         Statics.method14546(arg1);
         return;
      case 302:
         method14198(arg1);
         return;
      case 303:
         method6254(arg1);
         return;
      case 304:
         method10648(arg1);
         return;
      case 305:
         method10459(arg1);
         return;
      case 306:
         method5680(arg1);
         return;
      case 307:
         method10653(arg1);
         return;
      case 308:
         method14663(arg1);
         return;
      case 309:
         method14450(arg1);
         return;
      case 310:
         method6154(arg1);
         return;
      case 311:
         method7894(arg1);
         return;
      case 312:
         method9458(arg1);
         return;
      case 313:
         method1497(arg1);
         return;
      case 314:
         method10027(arg1);
         return;
      case 315:
         method10715(arg1);
         return;
      case 316:
         method8974(arg1);
         return;
      case 317:
         method8876(arg1);
         return;
      case 318:
         method14130(arg1);
         return;
      case 319:
         method5503(arg1);
         return;
      case 320:
         method10928(arg1);
         return;
      case 321:
         Statics.method15063(arg1);
         return;
      case 322:
         method16085(arg1);
         return;
      case 323:
         method5767(arg1);
         return;
      case 324:
         method6504(arg1);
         return;
      case 325:
         method5746(arg1);
         return;
      case 326:
         method9277(arg1);
         return;
      case 327:
         method11652(arg1);
         return;
      case 328:
         method11465(arg1);
         return;
      case 329:
         method10988(arg1);
         return;
      case 330:
         method7395(arg1);
         return;
      case 331:
         method9732(arg1);
         return;
      case 332:
         method9263(arg1);
         return;
      case 333:
         method5378(arg1);
         return;
      case 334:
         method3088(arg1);
         return;
      case 335:
         class788.method14058(arg1);
         return;
      case 336:
         method15332(arg1);
         return;
      case 337:
         method9337(arg1);
         return;
      case 338:
         method2432(arg1);
         return;
      case 339:
         Statics.method9264(arg1);
         return;
      case 340:
         class788.method9267(arg1);
         return;
      case 341:
         method9131(arg1);
         return;
      case 342:
         method6137(arg1);
         return;
      case 343:
         method7392(arg1);
         return;
      case 344:
         Statics.method11578(arg1);
         return;
      case 345:
         Statics.method9462(arg1);
         return;
      case 346:
         method6890(arg1);
         return;
      case 347:
         method14922(arg1);
         return;
      case 348:
         Statics.method2953(arg1);
         return;
      case 349:
         method8547(arg1);
         return;
      case 350:
         method5787(arg1);
         return;
      case 351:
         class788.method5532(arg1);
         return;
      case 352:
         method459(arg1);
         return;
      case 353:
         method11330(arg1);
         return;
      case 354:
         method9165(arg1);
         return;
      case 355:
         method10141(arg1);
         return;
      case 356:
         method2145(arg1);
         return;
      case 357:
         method8325(arg1);
         return;
      case 358:
         method5502(arg1);
         return;
      case 359:
         method2288(arg1);
         return;
      case 360:
         method6527(arg1);
         return;
      case 361:
         Statics.method11263(arg1);
         return;
      case 362:
         method15556(arg1);
         return;
      case 363:
         method4528(arg1);
         return;
      case 364:
         method5337(arg1);
         return;
      case 365:
         method1510(arg1);
         return;
      case 366:
         method10140(arg1);
         return;
      case 367:
         method1341(arg1);
         return;
      case 368:
         method15920(arg1);
         return;
      case 369:
         method6610(arg1);
         return;
      case 370:
         Statics.method7327(arg1);
         return;
      case 371:
         method9722(arg1);
         return;
      case 372:
         method10913(arg1);
         return;
      case 373:
         method10664(arg1);
         return;
      case 374:
         method7916(arg1);
         return;
      case 375:
         method9411(arg1);
         return;
      case 376:
         method7422(arg1);
         return;
      case 377:
         method3605(true, arg1);
         return;
      case 378:
         method7345(arg1);
         return;
      case 379:
         method14631(arg1);
         return;
      case 380:
         method14342(arg1);
         return;
      case 381:
         method14587(arg1);
         return;
      case 382:
         Statics.method11695(arg1);
         return;
      case 383:
         method8027(arg1);
         return;
      case 384:
         method15286(arg1);
         return;
      case 385:
         method5379(arg1);
         return;
      case 386:
         method14056(arg1);
         return;
      case 387:
         method7419(arg1);
         return;
      case 388:
         method741(arg1);
         return;
      case 389:
         class788.method15061(arg1);
         return;
      case 390:
         method4479(arg1);
         return;
      case 391:
         method4522(arg1);
         return;
      case 392:
         method14227(arg1);
         return;
      case 393:
         method16032(arg1);
         return;
      case 394:
         method6539(arg1);
         return;
      case 395:
         method7936(arg1);
         return;
      case 396:
         method6503(arg1);
         return;
      case 397:
         method5533(arg1);
         return;
      case 398:
         method14236(arg1);
         return;
      case 399:
         Statics.method7915(arg1);
         return;
      case 400:
         method6136(true, arg1);
         return;
      case 401:
         method1511(arg1);
         return;
      case 402:
         method15163(arg1);
         return;
      case 403:
         method5957(arg1);
         return;
      case 404:
         method5182(arg1);
         return;
      case 405:
         method10372(arg1);
         return;
      case 406:
         method4527(arg1);
         return;
      case 407:
         method14233(arg1);
         return;
      case 408:
         Statics.method14811(arg1);
         return;
      case 409:
         method14200(arg1);
         return;
      case 410:
         Statics.method8946(arg1);
         return;
      case 411:
         method11328(arg1);
         return;
      case 412:
         method14069(arg1);
         return;
      case 413:
         method7932(arg1);
         return;
      case 414:
         method4100(arg1);
         return;
      case 415:
         method10284(arg1);
         return;
      case 416:
         method2464(arg1);
         return;
      case 417:
         method10735(arg1);
         return;
      case 418:
         method4525(arg1);
         return;
      case 419:
         method11205(arg1);
         return;
      case 420:
         method9872(arg1);
         return;
      case 421:
         method3614(arg1);
         return;
      case 422:
         Statics.method15825(arg1);
         return;
      case 423:
         method17073(arg1);
         return;
      case 424:
         class788.method5184(arg1);
         return;
      case 425:
         method10943(arg1);
         return;
      case 426:
         method2287(arg1);
         return;
      case 427:
         method8763(arg1);
         return;
      case 428:
         Statics.method15599(arg1);
         return;
      case 429:
         method6231(arg1);
         return;
      case 430:
         method10697(arg1);
         return;
      case 431:
         method5956(arg1);
         return;
      case 432:
         method7305(arg1);
         return;
      case 433:
         method8878(arg1);
         return;
      case 434:
         method15488(arg1);
         return;
      case 435:
         method5809(arg1);
         return;
      case 436:
         method10682(arg1);
         return;
      case 437:
         method7356(arg1);
         return;
      case 438:
         method7450(arg1);
         return;
      case 439:
         method9133(arg1);
         return;
      case 440:
         method14067(arg1);
         return;
      case 441:
         method7933(arg1);
         return;
      case 442:
         method9102(arg1);
         return;
      case 443:
         method10470(arg1);
         return;
      case 444:
         method6474(arg1);
         return;
      case 445:
         method4096(arg1);
         return;
      case 446:
         method5158(arg1);
         return;
      case 447:
         method10699(arg1);
         return;
      case 448:
         Statics.method7902(arg1);
         return;
      case 449:
         method6583(arg1);
         return;
      case 450:
         method15223(arg1);
         return;
      case 451:
         method7986(arg1);
         return;
      case 452:
         method8007(arg1);
         return;
      case 453:
         method5154(arg1);
         return;
      case 454:
         method5045(arg1);
         return;
      case 455:
         method17057(arg1);
         return;
      case 456:
         method10744(arg1);
         return;
      case 457:
         method6887(arg1);
         return;
      case 458:
         method14041(arg1);
         return;
      case 459:
         method17093(arg1);
         return;
      case 460:
         method6106(arg1);
         return;
      case 461:
         method10294(arg1);
         return;
      case 462:
         method8920(arg1);
         return;
      case 463:
         method6268(arg1);
         return;
      case 464:
         method11329(arg1);
         return;
      case 465:
         method6257(arg1);
         return;
      case 466:
         method1092(arg1);
         return;
      case 467:
         method15480(arg1);
         return;
      case 468:
         method9164(arg1);
         return;
      case 469:
         class788.method6517(arg1);
         return;
      case 470:
         method5628(arg1);
         return;
      case 471:
         method5911(arg1);
         return;
      case 472:
         method9271(arg1);
         return;
      case 473:
         method10746(arg1);
         return;
      case 474:
         method9392(arg1);
         return;
      case 475:
         method11310(arg1);
         return;
      case 476:
         method7963(arg1);
         return;
      case 477:
         Statics.method14059(arg1);
         return;
      case 478:
         method11100(arg1);
         return;
      case 479:
         method6535(arg1);
         return;
      case 480:
         method9255(arg1);
         return;
      case 481:
         method6903(arg1);
         return;
      case 482:
         method11693(arg1);
         return;
      case 483:
         method10028(arg1);
         return;
      case 484:
         Statics.method10058(arg1);
         return;
      case 485:
         method5486(arg1);
         return;
      case 486:
         method14169(arg1);
         return;
      case 487:
         method14545(arg1);
         return;
      case 488:
         method6529(arg1);
         return;
      case 489:
         method6439(arg1);
         return;
      case 490:
         method7471(arg1);
         return;
      case 491:
         method6235(arg1);
         return;
      case 492:
         method7470(arg1);
         return;
      case 493:
         Statics.method11052(arg1);
         return;
      case 494:
         method6768(arg1);
         return;
      case 495:
         class788.method5639(arg1);
         return;
      case 496:
         method8274(arg1);
         return;
      case 497:
         method15363(arg1);
         return;
      case 498:
         method11656(arg1);
         return;
      case 499:
         method8880(arg1);
         return;
      case 500:
         method4443(arg1);
         return;
      case 501:
         method10995(arg1);
         return;
      case 502:
         method15091(arg1);
         return;
      case 503:
         method10347(arg1);
         return;
      case 504:
         method8012(arg1);
         return;
      case 505:
         method10104(arg1);
         return;
      case 506:
         method6906(arg1);
         return;
      case 507:
         method5910(arg1);
         return;
      case 508:
         method4215(arg1);
         return;
      case 509:
         method5201(arg1);
         return;
      case 510:
         method6285(arg1);
         return;
      case 511:
         method9408(arg1);
         return;
      case 512:
         method10040(arg1);
         return;
      case 513:
         method17038(arg1);
         return;
      case 514:
         method8009(arg1);
         return;
      case 515:
         method6596(arg1);
         return;
      case 516:
         method11676(arg1);
         return;
      case 517:
         method15090(arg1);
         return;
      case 518:
         method6491(arg1);
         return;
      case 519:
         method6620(arg1);
         return;
      case 520:
         method4529(arg1);
         return;
      case 521:
         method5625(arg1);
         return;
      case 522:
         method6553(arg1);
         return;
      case 523:
         method3243(arg1);
         return;
      case 524:
         method5968(arg1);
         return;
      case 525:
         method9731(arg1);
         return;
      case 526:
         method6882(arg1);
         return;
      case 527:
         method9177(arg1);
         return;
      case 528:
         method1936(arg1);
         return;
      case 529:
         method8921(arg1);
         return;
      case 530:
         method10308(arg1);
         return;
      case 531:
         Statics.method14486(arg1);
         return;
      case 532:
         method5771(arg1);
         return;
      case 533:
         method6543(arg1);
         return;
      case 534:
         method11589(arg1);
         return;
      case 535:
         method14254(arg1);
         return;
      case 536:
         method15059(arg1);
         return;
      case 537:
         method10139(arg1);
         return;
      case 538:
         method7351(arg1);
         return;
      case 539:
         method10132(arg1);
         return;
      case 540:
         method4520(arg1);
         return;
      case 541:
         method9162(arg1);
         return;
      case 542:
         method11675(arg1);
         return;
      case 543:
         method16103(arg1);
         return;
      case 544:
         method5927(arg1);
         return;
      case 545:
         method17036(arg1);
         return;
      case 546:
         method9254(arg1);
         return;
      case 547:
         method9339(arg1);
         return;
      case 548:
         method15372(arg1);
         return;
      case 549:
         method14253(arg1);
         return;
      case 550:
         method3990(arg1);
         return;
      case 551:
         method3948(arg1);
         return;
      case 552:
         method9887(arg1);
         return;
      case 553:
         method9710(arg1);
         return;
      case 554:
         method14598(arg1);
         return;
      case 555:
         method15162(arg1);
         return;
      case 556:
         method6502(arg1);
         return;
      case 557:
         Statics.method3946(arg1);
         return;
      case 558:
         Statics.method959(arg1);
         return;
      case 559:
         method8529(arg1);
         return;
      case 560:
         method6579(arg1);
         return;
      case 561:
         method7966(arg1);
         return;
      case 562:
         method8877(arg1);
         return;
      case 563:
         method6574(arg1);
         return;
      case 564:
         Statics.method10849(arg1);
         return;
      case 565:
         method11426(arg1);
         return;
      case 566:
         method14585(arg1);
         return;
      case 567:
         method11278(arg1);
         return;
      case 568:
         Statics.method17096(arg1);
         return;
      case 569:
         method7944(arg1);
         return;
      case 570:
         method11164(arg1);
         return;
      case 571:
         method4418(arg1);
         return;
      case 572:
         class788.method9658(arg1);
         return;
      case 573:
         method5928(arg1);
         return;
      case 574:
         method11700(arg1);
         return;
      case 575:
         method4524(arg1);
         return;
      case 576:
         method11597(arg1);
         return;
      case 577:
         method10810(arg1);
         return;
      case 578:
         method7306(arg1);
         return;
      case 579:
         method8322(arg1);
         return;
      case 580:
         method11581(arg1);
         return;
      case 581:
         method15841(arg1);
         return;
      case 582:
         method3316(arg1);
         return;
      case 583:
         method7984(arg1);
         return;
      case 584:
         Statics.method5682(arg1);
         return;
      case 585:
         method5810(arg1);
         return;
      case 586:
         Statics.method15768(arg1);
         return;
      case 587:
         Statics.method7896(arg1);
         return;
      case 588:
         method6581(arg1);
         return;
      case 589:
         Statics.method15065(arg1);
         return;
      case 590:
         method15891(arg1);
         return;
      case 591:
         method6107(arg1);
         return;
      case 592:
         Statics.method10875(arg1);
         return;
      case 593:
         method9258(arg1);
         return;
      case 594:
         method6220(arg1);
         return;
      case 595:
         method15216(arg1);
         return;
      case 596:
         method5959(arg1);
         return;
      case 597:
         method16014(arg1);
         return;
      case 598:
         Statics.method578(arg1);
         return;
      case 599:
         method10791(arg1);
         return;
      case 600:
         method14683(arg1);
         return;
      case 601:
         method14955(arg1);
         return;
      case 602:
         method11082(arg1);
         return;
      case 603:
         method5674(arg1);
         return;
      case 604:
         method2074(arg1);
         return;
      case 605:
         method6447(arg1);
         return;
      case 606:
         method11163(arg1);
         return;
      case 607:
         method5653(arg1);
         return;
      case 608:
         method6487(arg1);
         return;
      case 609:
         method5958(arg1);
         return;
      case 610:
         Statics.method2323(arg1);
         return;
      case 611:
         method11489(arg1);
         return;
      case 612:
         method7375(arg1);
         return;
      case 613:
         method5343(arg1);
         return;
      case 614:
         method6155(arg1);
         return;
      case 615:
         method8273(arg1);
         return;
      case 616:
         method10723(arg1);
         return;
      case 617:
         method11187(arg1);
         return;
      case 618:
         method11734(arg1);
         return;
      case 619:
         method6592(arg1);
         return;
      case 620:
         method5652(arg1);
         return;
      case 621:
         method6609(arg1);
         return;
      case 622:
         method11276(arg1);
         return;
      case 623:
         method11488(arg1);
         return;
      case 624:
         method10851(arg1);
         return;
      case 625:
         method6232(arg1);
         return;
      case 626:
         method6542(arg1);
         return;
      case 627:
         method11646(arg1);
         return;
      case 628:
         method6233(arg1);
         return;
      case 629:
         method15915(arg1);
         return;
      case 630:
         method1329(arg1);
         return;
      case 631:
         method1386(arg1);
         return;
      case 632:
         method16870(arg1);
         return;
      case 633:
         method2116(arg1);
         return;
      case 634:
         method10859(arg1);
         return;
      case 635:
         method6767(arg1);
         return;
      case 636:
         method10007(arg1);
         return;
      case 637:
         method11083(arg1);
         return;
      case 638:
         Statics.method5488(arg1);
         return;
      case 639:
         method10720(arg1);
         return;
      case 640:
         class788.method10293(arg1);
         return;
      case 641:
         class788.method11098(arg1);
         return;
      case 642:
         method10282(arg1);
         return;
      case 643:
         method15957(arg1);
         return;
      case 644:
         method368(arg1);
         return;
      case 645:
         method6451(arg1);
         return;
      case 646:
         method14235(arg1);
         return;
      case 647:
         Statics.method15371(arg1);
         return;
      case 648:
         method8263(arg1);
         return;
      case 649:
         Statics.method10113(arg1);
         return;
      case 650:
         method10103(arg1);
         return;
      case 651:
         method10391(arg1);
         return;
      case 652:
         method10955(arg1);
         return;
      case 653:
         method8524(arg1);
         return;
      case 654:
         method9070(arg1);
         return;
      case 655:
         method9126(arg1);
         return;
      case 656:
         method5623(arg1);
         return;
      case 657:
         method6766(arg1);
         return;
      case 658:
         Statics.method8004(arg1);
         return;
      case 659:
         method14034(arg1);
         return;
      case 660:
         method15348(arg1);
         return;
      case 661:
         method9104(arg1);
         return;
      case 662:
         method4055(arg1);
         return;
      case 663:
         method9278(arg1);
         return;
      case 664:
         method5202(arg1);
         return;
      case 665:
         method10805(arg1);
         return;
      case 666:
         Statics.method1101(arg1);
         return;
      case 667:
         method10462(arg1);
         return;
      case 668:
         Statics.method5964(arg1);
         return;
      case 669:
         method10983(arg1);
         return;
      case 670:
         method14305(arg1);
         return;
      case 671:
         method11697(arg1);
         return;
      case 672:
         method15908(arg1);
         return;
      case 673:
         method14238(arg1);
         return;
      case 674:
         method1090(arg1);
         return;
      case 675:
         method1440(arg1);
         return;
      case 676:
         method2947(arg1);
         return;
      case 677:
         method8272(arg1);
         return;
      case 678:
         method10326(arg1);
         return;
      case 679:
         method8897(arg1);
         return;
      case 680:
         method4064(arg1);
         return;
      case 681:
         method6739(arg1);
         return;
      case 682:
         method7310(arg1);
         return;
      case 683:
         method14781(arg1);
         return;
      case 684:
         method11657(arg1);
         return;
      case 685:
         Statics.method6737(arg1);
         return;
      case 686:
         method7421(arg1);
         return;
      case 687:
         method14038(arg1);
         return;
      case 688:
         Statics.method15730(arg1);
         return;
      case 689:
         method9994(arg1);
         return;
      case 690:
         method9721(arg1);
         return;
      case 691:
         method16304(arg1);
         return;
      case 692:
         method9720(arg1);
         return;
      case 693:
         method5499(arg1);
         return;
      case 694:
         method460(arg1);
         return;
      case 695:
         method11702(arg1);
         return;
      case 696:
         Statics.method10698(arg1);
         return;
      case 697:
         method2472(arg1);
         return;
      case 698:
         method11311(arg1);
         return;
      case 699:
         method4481(arg1);
         return;
      case 700:
         method17070(arg1);
         return;
      case 701:
         method14234(arg1);
         return;
      case 702:
         method17068(arg1);
         return;
      case 703:
         method11467(arg1);
         return;
      case 704:
         method14540(arg1);
         return;
      case 705:
         method6540(arg1);
         return;
      case 706:
         method9869(arg1);
         return;
      case 707:
         method15826(arg1);
         return;
      case 708:
         method14343(arg1);
         return;
      case 709:
         Statics.method17037(arg1);
         return;
      case 710:
         method8288(arg1);
         return;
      case 711:
         method10944(arg1);
         return;
      case 712:
         method2286(arg1);
         return;
      case 713:
         method15673(arg1);
         return;
      case 714:
         method6446(arg1);
         return;
      case 715:
         method11101(arg1);
         return;
      case 716:
         method15727(arg1);
         return;
      case 717:
         method11699(arg1);
         return;
      case 718:
         method4530(arg1);
         return;
      case 719:
         method5157(arg1);
         return;
      case 720:
         method10663(arg1);
         return;
      case 721:
         method7469(arg1);
         return;
      case 722:
         method14061(arg1);
         return;
      case 723:
         Statics.method7451(arg1);
         return;
      case 724:
         Statics.method14185(arg1);
         return;
      case 725:
         method6237(arg1);
         return;
      case 726:
         method10683(arg1);
         return;
      case 727:
         method14592(arg1);
         return;
      case 728:
         method11596(arg1);
         return;
      case 729:
         method5963(arg1);
         return;
      case 730:
         method10817(arg1);
         return;
      case 731:
         method4067(arg1);
         return;
      case 732:
         method8025(arg1);
         return;
      case 733:
         method2170(arg1);
         return;
      case 734:
         method15064(arg1);
         return;
      case 735:
         method10874(arg1);
         return;
      case 736:
         method14380(arg1);
         return;
      case 737:
         method10761(arg1);
         return;
      case 738:
         method5768(arg1);
         return;
      case 739:
         method6465(arg1);
         return;
      case 740:
         method6110(arg1);
         return;
      case 741:
         method8896(arg1);
         return;
      case 742:
         method9488(arg1);
         return;
      case 743:
         method1323(arg1);
         return;
      case 744:
         method11165(arg1);
         return;
      case 745:
         class788.method6901(arg1);
         return;
      case 746:
         method5681(arg1);
         return;
      case 747:
         method9657(arg1);
         return;
      case 748:
         Statics.method9950(arg1);
         return;
      case 749:
         method5044(arg1);
         return;
      case 750:
         method6526(arg1);
         return;
      case 751:
         Statics.method11294(arg1);
         return;
      case 752:
         method6524(arg1);
         return;
      case 753:
         method6736(arg1);
         return;
      case 754:
         method14239(arg1);
         return;
      case 755:
         method6234(arg1);
         return;
      case 756:
         method11185(arg1);
         return;
      case 757:
         method6645(arg1);
         return;
      case 758:
         method17102(arg1);
         return;
      case 759:
         method5939(arg1);
         return;
      case 760:
         method1492(arg1);
         return;
      case 761:
         method8287(arg1);
         return;
      case 762:
         method2295(arg1);
         return;
      case 763:
         method6467(arg1);
         return;
      case 764:
         method14379(arg1);
         return;
      case 765:
         Statics.method8013(arg1);
         return;
      case 766:
         method11315(arg1);
         return;
      case 767:
         method14354(arg1);
         return;
      case 768:
         method16039(arg1);
         return;
      case 769:
         method6572(arg1);
         return;
      case 770:
         method5903(arg1);
         return;
      case 771:
         method10917(arg1);
         return;
      case 772:
         method2950(arg1);
         return;
      case 773:
         method9956(arg1);
         return;
      case 774:
         method7965(arg1);
         return;
      case 775:
         method11694(arg1);
         return;
      case 776:
         method1074(arg1);
         return;
      case 777:
         method11381(arg1);
         return;
      case 778:
         method2857(arg1);
         return;
      case 779:
         method7339(arg1);
         return;
      case 780:
         method7304(arg1);
         return;
      case 781:
         method17069(arg1);
         return;
      case 782:
         method5511(arg1);
         return;
      case 783:
         method10059(arg1);
         return;
      case 784:
         Statics.method14586(arg1);
         return;
      case 785:
         method16264(arg1);
         return;
      case 786:
         method8523(arg1);
         return;
      case 787:
         method8888(arg1);
         return;
      case 788:
         method11599(arg1);
         return;
      case 789:
         Statics.method14589(arg1);
         return;
      case 790:
         method6444(arg1);
         return;
      case 791:
         method7906(arg1);
         return;
      case 792:
         class788.method17065(arg1);
         return;
      case 793:
         method15143(arg1);
         return;
      case 794:
         method6253(arg1);
         return;
      case 795:
         method11348(arg1);
         return;
      case 796:
         method15583(arg1);
         return;
      case 797:
         method10131(arg1);
         return;
      case 798:
         method5524(arg1);
         return;
      case 799:
         class788.method10696(arg1);
         return;
      case 800:
         method6138(arg1);
         return;
      case 801:
         method11111(arg1);
         return;
      case 802:
         method4456(arg1);
         return;
      case 803:
         method8989(arg1);
         return;
      case 804:
         method6580(arg1);
         return;
      case 805:
         method1014(arg1);
         return;
      case 806:
         method5679(arg1);
         return;
      case 807:
         method9993(arg1);
         return;
      case 808:
         method11457(arg1);
         return;
      case 809:
         method5342(arg1);
         return;
      case 810:
         method11468(arg1);
         return;
      case 811:
         method9340(arg1);
         return;
      case 812:
         method6577(arg1);
         return;
      case 813:
         method11277(arg1);
         return;
      case 814:
         method6267(arg1);
         return;
      case 815:
         method5780(arg1);
         return;
      case 816:
         method5501(arg1);
         return;
      case 817:
         method6530(arg1);
         return;
      case 818:
         method3350(arg1);
         return;
      case 819:
         method10743(arg1);
         return;
      case 820:
         method487(arg1);
         return;
      case 821:
         method11186(arg1);
         return;
      case 822:
         method4003(arg1);
         return;
      case 823:
         Statics.method6127(arg1);
         return;
      case 824:
         Statics.method11648(arg1);
         return;
      case 825:
         method5797(arg1);
         return;
      case 826:
         method10369(arg1);
         return;
      case 827:
         Statics.method7943(arg1);
         return;
      case 828:
         method10733(arg1);
         return;
      case 829:
         method15111(arg1);
         return;
      case 830:
         method7472(arg1);
         return;
      case 831:
         method7973(arg1);
         return;
      case 832:
         method8734(arg1);
         return;
      case 833:
         method10114(arg1);
         return;
      case 834:
         Statics.method14584(arg1);
         return;
      case 835:
         method15682(arg1);
         return;
      case 836:
         class788.method5658(arg1);
         return;
      case 837:
         method10987(arg1);
         return;
      case 838:
         method10368(arg1);
         return;
      case 839:
         method8264(arg1);
         return;
      case 840:
         method3352(arg1);
         return;
      case 841:
         Statics.method10858(arg1);
         return;
      case 842:
         method6218(arg1);
         return;
      case 843:
         Statics.method6740(arg1);
         return;
      case 844:
         Statics.method15456(arg1);
         return;
      case 845:
         method17067(arg1);
         return;
      case 846:
         Statics.method6113(arg1);
         return;
      case 847:
         method10099(arg1);
         return;
      case 848:
         Statics.method7937(arg1);
         return;
      case 849:
         method6269(arg1);
         return;
      case 850:
         method14196(arg1);
         return;
      case 851:
         method15039(arg1);
         return;
      case 852:
         method15485(arg1);
         return;
      case 853:
         Statics.method1137(arg1);
         return;
      case 854:
         method11102(arg1);
         return;
      case 855:
         Statics.method1321(arg1);
         return;
      case 856:
         method3945(arg1);
         return;
      case 857:
         method10460(arg1);
         return;
      case 858:
         method11182(arg1);
         return;
      case 859:
         method9410(arg1);
         return;
      case 860:
         method8353(arg1);
         return;
      case 861:
         method14219(arg1);
         return;
      case 862:
         Statics.method7917(arg1);
         return;
      case 863:
         class788.method10711(arg1);
         return;
      case 864:
         method9724(arg1);
         return;
      case 865:
         method10649(arg1);
         return;
      case 866:
         Statics.method9852(arg1);
         return;
      case 867:
         method11598(arg1);
         return;
      case 868:
         method4058(arg1);
         return;
      case 869:
         method7400(arg1);
         return;
      case 870:
         method5206(arg1);
         return;
      case 871:
         method9487(arg1);
         return;
      case 872:
         method10726(arg1);
         return;
      case 873:
         method5500(arg1);
         return;
      case 874:
         method14542(arg1);
         return;
      case 875:
         method6578(arg1);
         return;
      case 876:
         method6902(arg1);
         return;
      case 877:
         method9085(arg1);
         return;
      case 878:
         method14513(arg1);
         return;
      case 879:
         method14232(arg1);
         return;
      case 880:
         Statics.method2115(arg1);
         return;
      case 881:
         Statics.method5938(arg1);
         return;
      case 882:
         method6856(arg1);
         return;
      case 883:
         method9709(arg1);
         return;
      case 884:
         method15962(arg1);
         return;
      case 885:
         method15442(arg1);
         return;
      case 886:
         method3947(arg1);
         return;
      case 887:
         method2083(arg1);
         return;
      case 888:
         class788.method7905(arg1);
         return;
      case 889:
         method7440(arg1);
         return;
      case 890:
         method9125(arg1);
         return;
      case 891:
         method6575(arg1);
         return;
      case 892:
         method8344(arg1);
         return;
      case 893:
         method5485(arg1);
         return;
      case 894:
         Statics.method8011(arg1);
         return;
      case 895:
         class788.method3612(arg1);
         return;
      case 896:
         method10031(arg1);
         return;
      case 897:
         method7935(arg1);
         return;
      case 898:
         method1850(arg1);
         return;
      case 899:
         method2200(arg1);
         return;
      case 900:
         method2344(arg1);
         return;
      case 901:
         method10643(arg1);
         return;
      case 902:
         method6445(arg1);
         return;
      case 903:
         Statics.method5518(arg1);
         return;
      case 904:
         method9071(arg1);
         return;
      case 905:
         method6466(arg1);
         return;
      case 906:
         method6862(arg1);
         return;
      case 907:
         method11207(arg1);
         return;
      case 908:
         method14040(arg1);
         return;
      case 909:
         method10918(arg1);
         return;
      case 910:
         method6597(arg1);
         return;
      case 911:
         method9881(arg1);
         return;
      case 912:
         method1395(arg1);
         return;
      case 913:
         method4217(arg1);
         return;
      case 914:
         Statics.method11733(arg1);
         return;
      case 915:
         method16247(arg1);
         return;
      case 916:
         method7393(arg1);
         return;
      case 917:
         method6626(arg1);
         return;
      case 918:
         method8052(arg1);
         return;
      case 919:
         method15217(arg1);
         return;
      case 920:
         method14494(arg1);
         return;
      case 921:
         method5794(arg1);
         return;
      case 922:
         method4218(arg1);
         return;
      case 923:
         class788.method4002(arg1);
         return;
      case 924:
         Statics.method9338(arg1);
         return;
      case 925:
         method5748(arg1);
         return;
      case 926:
         method399(arg1);
         return;
      case 927:
         method5795(arg1);
         return;
      case 928:
         method11490(arg1);
         return;
      case 929:
         method10850(arg1);
         return;
      case 930:
         Statics.method15961(arg1);
         return;
      case 931:
         method9838(arg1);
         return;
      case 932:
         Statics.method6443(arg1);
         return;
      case 933:
         method10034(arg1);
         return;
      case 934:
         method10790(arg1);
         return;
      case 935:
         method15892(arg1);
         return;
      case 936:
         method14785(arg1);
         return;
      case 937:
         class788.method15228(arg1);
         return;
      case 938:
         method15222(arg1);
         return;
      case 939:
         method8527(arg1);
         return;
      case 940:
         method8685(arg1);
         return;
      case 941:
         method14153(arg1);
         return;
      case 942:
         method10101(arg1);
         return;
      case 943:
         method14593(arg1);
         return;
      case 944:
         method6104(arg1);
         return;
      case 945:
         method2345(arg1);
         return;
      case 946:
         method11660(arg1);
         return;
      case 947:
         method9955(arg1);
         return;
      case 948:
         Statics.method396(arg1);
         return;
      case 949:
         method3994(arg1);
         return;
      case 950:
         method9124(arg1);
         return;
      case 951:
         method7430(arg1);
         return;
      case 952:
         method11099(arg1);
         return;
      case 953:
         method1396(arg1);
         return;
      case 954:
         method15482(arg1);
         return;
      case 955:
         method8949(arg1);
         return;
      case 956:
         method5181(arg1);
         return;
      case 957:
         method15814(arg1);
         return;
      case 958:
         method15732(arg1);
         return;
      case 959:
         method6501(arg1);
         return;
      case 960:
         method241(arg1);
         return;
      case 961:
         method14662(arg1);
         return;
      case 962:
         method4416(arg1);
         return;
      case 963:
         method8870(arg1);
         return;
      case 964:
         method9260(arg1);
         return;
      case 965:
         method7344(arg1);
         return;
      case 966:
         Statics.method15765(arg1);
         return;
      case 967:
         method15842(arg1);
         return;
      case 968:
         method15368(arg1);
         return;
      case 969:
         method10366(arg1);
         return;
      case 970:
         method6593(arg1);
         return;
      case 971:
         method7437(arg1);
         return;
      case 972:
         method10323(arg1);
         return;
      case 973:
         method8891(arg1);
         return;
      case 974:
         method17099(arg1);
         return;
      case 975:
         method1275(arg1);
         return;
      case 976:
         method5727(arg1);
         return;
      case 977:
         method14346(arg1);
         return;
      case 978:
         method9132(arg1);
         return;
      case 979:
         method4547(arg1);
         return;
      case 980:
         method8008(arg1);
         return;
      case 981:
         Statics.method11582(arg1);
         return;
      case 982:
         method14129(arg1);
         return;
      case 983:
         method5902(arg1);
         return;
      case 984:
         method5510(arg1);
         return;
      case 985:
         method16098(arg1);
         return;
      case 986:
         method8762(arg1);
         return;
      case 987:
         method5408(arg1);
         return;
      case 988:
         method11380(arg1);
         return;
      case 989:
         Statics.method2442(arg1);
         return;
      case 990:
         Statics.method6613(arg1);
         return;
      case 991:
         method14328(arg1);
         return;
      case 992:
         method6523(arg1);
         return;
      case 993:
         method15428(arg1);
         return;
      case 994:
         method5792(arg1);
         return;
      case 995:
         method8686(arg1);
         return;
      case 996:
         method9398(arg1);
         return;
      case 997:
         method5728(arg1);
         return;
      case 998:
         method11729(arg1);
         return;
      case 999:
         method10166(arg1);
         return;
      case 1000:
         method15140(arg1);
         return;
      case 1001:
         method1071(arg1);
         return;
      case 1002:
         class74.add(arg1, -469647615);
         return;
      case 1003:
         Statics.method14177(arg1);
         return;
      case 1004:
         method8871(arg1);
         return;
      case 1005:
         method10348(arg1);
         return;
      case 1006:
         method7974(arg1);
         return;
      case 1007:
         method8947(arg1);
         return;
      case 1008:
         method15970(arg1);
         return;
      case 1009:
         method5776(arg1);
         return;
      case 1010:
         method4051(arg1);
         return;
      case 1011:
         method9500(arg1);
         return;
      case 1012:
         method3852(arg1);
         return;
      case 1013:
         Statics.method8942(arg1);
         return;
      case 1014:
         method6518(arg1);
         return;
      case 1015:
         method9087(arg1);
         return;
      case 1016:
         Statics.method10029(arg1);
         return;
      case 1017:
         Statics.method7313(arg1);
         return;
      case 1018:
         method9958(arg1);
         return;
      case 1019:
         method5377(arg1);
         return;
      case 1020:
         method15729(arg1);
         return;
      case 1021:
         method15373(arg1);
         return;
      case 1022:
         method5537(arg1);
         return;
      case 1023:
         method5778(arg1);
         return;
      case 1024:
         method10198(arg1);
         return;
      case 1025:
         method3605(false, arg1);
         return;
      case 1026:
         method9229(arg1);
         return;
      case 1027:
         method10320(arg1);
         return;
      case 1028:
         method5208(arg1);
         return;
      case 1029:
         method11296(arg1);
         return;
      case 1030:
         method9397(arg1);
         return;
      case 1031:
         method10345(arg1);
         return;
      case 1032:
         method17112(arg1);
         return;
      case 1033:
         method10680(arg1);
         return;
      case 1034:
         method9103(arg1);
         return;
      case 1035:
         method7429(arg1);
         return;
      case 1036:
         method9409(arg1);
         return;
      case 1037:
         method5960(arg1);
         return;
      case 1038:
         method8034(arg1);
         return;
      case 1039:
         method15378(arg1);
         return;
      case 1040:
         method6136(false, arg1);
         return;
      case 1041:
         method7455(arg1);
         return;
      case 1042:
         method11113(arg1);
         return;
      case 1043:
         Statics.method5775(arg1);
         return;
      case 1044:
         method6625(arg1);
         return;
      case 1045:
         method17095(arg1);
         return;
      default:
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("is.t(Lrs;B)V")
   private static final void method7419(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7222[arg0.field7206];
   }

   @deob.ObfuscatedName("ox.c(Lrs;B)V")
   private static final void method10643(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field10637.field3651[var1];
   }

   @deob.ObfuscatedName("mo.w(Lrs;I)V")
   private static final void method9408(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      Statics.field10637.method6144(var1, arg0.field7203[--arg0.field7204]);
   }

   @deob.ObfuscatedName("aw.q(Lrs;I)V")
   private static final void method4064(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = arg0.field7225.field1643[arg0.field7206];
   }

   @deob.ObfuscatedName("rj.y(Lrs;S)V")
   private static final void method11731(class790 arg0) {
      arg0.field7206 += arg0.field7222[arg0.field7206];
   }

   @deob.ObfuscatedName("nm.j(Lrs;B)V")
   private static final void method9881(class790 arg0) {
      arg0.field7204 -= 2;
      if (arg0.field7203[arg0.field7204] != arg0.field7203[arg0.field7204 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("sb.ai(Lrs;S)V")
   private static final void method14255(class790 arg0) {
      arg0.field7204 -= 2;
      if (arg0.field7203[arg0.field7204] < arg0.field7203[arg0.field7204 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("en.ap(Lrs;B)V")
   private static final void method5910(class790 arg0) {
      arg0.field7204 -= 2;
      if (arg0.field7203[arg0.field7204] > arg0.field7203[arg0.field7204 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("su.av(Lrs;B)V")
   private static final void method14493(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7203[++arg0.field7204 - 1] = ((class211)arg0.field7216).field1402.method5187(var1);
   }

   @deob.ObfuscatedName("rf.ax(Lrs;I)V")
   private static final void method11656(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7203[++arg0.field7204 - 1] = ((class211)arg0.field7216).field1402.method5188(var1);
   }

   @deob.ObfuscatedName("ok.at(Lrs;I)V")
   private static final void method10315(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7203[++arg0.field7204 - 1] = ((class200)arg0.field7216).field1306.method4444(var1);
   }

   @deob.ObfuscatedName("qe.aw(Lrs;I)V")
   private static final void method11099(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field10637.method5490(var1);
   }

   @deob.ObfuscatedName("ek.al(Lrs;B)V")
   private static final void method5798(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      Statics.field10637.method6147(var1, arg0.field7203[--arg0.field7204]);
   }

   @deob.ObfuscatedName("rv.an(Lrs;I)V")
   private static final void method14175(class790 arg0) {
      arg0.field7204 -= 2;
      if (arg0.field7203[arg0.field7204] <= arg0.field7203[arg0.field7204 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("dj.ag(Lrs;B)V")
   private static final void method5406(class790 arg0) {
      arg0.field7204 -= 2;
      if (arg0.field7203[arg0.field7204] >= arg0.field7203[arg0.field7204 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("ey.ak(Lrs;S)V")
   private static final void method6124(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7211[arg0.field7222[arg0.field7206]];
   }

   @deob.ObfuscatedName("gz.aa(Lrs;I)V")
   private static final void method6903(class790 arg0) {
      arg0.field7211[arg0.field7222[arg0.field7206]] = arg0.field7203[--arg0.field7204];
   }

   @deob.ObfuscatedName("f.ae(Lrs;B)V")
   private static final void method6153(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7205 -= var1;
      String var2 = class816.method17075(arg0.field7226, arg0.field7205, var1);
      arg0.field7226[++arg0.field7205 - 1] = var2;
   }

   @deob.ObfuscatedName("br.az(Lrs;I)V")
   private static final void method4218(class790 arg0) {
      --arg0.field7204;
   }

   @deob.ObfuscatedName("mo.aq(Lrs;B)V")
   private static final void method9409(class790 arg0) {
      --arg0.field7205;
   }

   @deob.ObfuscatedName("sz.ar(Lrs;I)V")
   private static final void method14545(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      class248 var2 = class795.method10712(var1);
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         int[] var3 = new int[var2.field1645];
         Object[] var4 = new Object[var2.field1646];
         long[] var5 = new long[var2.field1651];

         for(int var6 = 0; var6 < var2.field1650; ++var6) {
            var3[var6] = arg0.field7203[arg0.field7204 - var2.field1650 + var6];
         }

         for(int var7 = 0; var7 < var2.field1649; ++var7) {
            var4[var7] = arg0.field7226[arg0.field7205 - var2.field1649 + var7];
         }

         for(int var8 = 0; var8 < var2.field1647; ++var8) {
            var5[var8] = arg0.field7207[arg0.field7208 - var2.field1647 + var8];
         }

         arg0.field7204 -= var2.field1650;
         arg0.field7205 -= var2.field1649;
         arg0.field7208 -= var2.field1647;
         class787 var9 = new class787();
         var9.field7189 = arg0.field7225;
         var9.field7188 = arg0.field7206;
         var9.field7190 = arg0.field7211;
         var9.field7187 = arg0.field7199;
         var9.field7191 = arg0.field7200;
         if (arg0.field7209 >= arg0.field7210.length) {
            throw new RuntimeException();
         } else {
            arg0.field7210[++arg0.field7209 - 1] = var9;
            arg0.field7225 = var2;
            arg0.field7201 = arg0.field7225.field1641;
            arg0.field7222 = arg0.field7225.field1642;
            arg0.field7206 = -1;
            arg0.field7211 = var3;
            arg0.field7199 = var4;
            arg0.field7200 = var5;
         }
      }
   }

   @deob.ObfuscatedName("aaz.as(Lrs;B)V")
   private static final void method459(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8854[arg0.field7222[arg0.field7206]];
   }

   @deob.ObfuscatedName("sw.au(Lrs;I)V")
   private static final void method14513(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      Statics.field8854[var1] = arg0.field7203[--arg0.field7204];
      class231.method4219(var1);
      client.field2644 |= Statics.field8400[var1];
   }

   @deob.ObfuscatedName("eh.ad(Lrs;I)V")
   private static final void method5780(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206] >> 16;
      int var2 = arg0.field7222[arg0.field7206] & 65535;
      int var3 = arg0.field7203[--arg0.field7204];
      if (var3 >= 0 && var3 <= 5000) {
         arg0.field7224[var1] = var3;
         byte var4 = -1;
         if (var2 == 105) {
            var4 = 0;
         }

         for(int var5 = 0; var5 < var3; ++var5) {
            arg0.field7202[var1][var5] = var4;
         }

      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("sp.am(Lrs;B)V")
   private static final void method14379(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      int var2 = arg0.field7203[--arg0.field7204];
      if (var2 >= 0 && var2 < arg0.field7224[var1]) {
         arg0.field7203[++arg0.field7204 - 1] = arg0.field7202[var1][var2];
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("qi.aj(Lrs;I)V")
   private static final void method11185(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      arg0.field7204 -= 2;
      int var2 = arg0.field7203[arg0.field7204];
      if (var2 >= 0 && var2 < arg0.field7224[var1]) {
         arg0.field7202[var1][var2] = arg0.field7203[arg0.field7204 + 1];
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("dn.ac(Lrs;B)V")
   private static final void method5499(class790 arg0) {
      String var1 = Statics.field9056[arg0.field7222[arg0.field7206]];
      if (var1 == null) {
         var1 = "";
      }

      arg0.field7226[++arg0.field7205 - 1] = var1;
   }

   @deob.ObfuscatedName("em.ay(Lrs;B)V")
   private static final void method5902(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      Statics.field9056[var1] = (String)arg0.field7226[--arg0.field7205];
      Statics.method1926(var1);
   }

   @deob.ObfuscatedName("mt.bf(Lrs;B)V")
   private static final void method9487(class790 arg0) {
      class875 var1 = arg0.field7225.field1648[arg0.field7222[arg0.field7206]];
      class108 var2 = (class108)var1.method15322((long)arg0.field7203[--arg0.field7204]);
      if (var2 != null) {
         arg0.field7206 += var2.field811;
      }

   }

   @deob.ObfuscatedName("nc.bp(Lrs;B)V")
   private static final void method9720(class790 arg0) {
      arg0.field7207[++arg0.field7208 - 1] = arg0.field7225.field1644[arg0.field7206];
   }

   @deob.ObfuscatedName("fz.bs(Lrs;I)V")
   private static final void method6553(class790 arg0) {
      --arg0.field7208;
   }

   @deob.ObfuscatedName("gx.ba(Lrs;B)V")
   private static final void method6898(class790 arg0) {
      arg0.field7200[arg0.field7222[arg0.field7206]] = arg0.field7207[--arg0.field7208];
   }

   @deob.ObfuscatedName("at.bg(Lrs;B)V")
   private static final void method4046(class790 arg0) {
      arg0.field7208 -= 2;
      if (arg0.field7207[arg0.field7208] != arg0.field7207[arg0.field7208 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("ge.bc(Lrs;B)V")
   private static final void method6619(class790 arg0) {
      arg0.field7208 -= 2;
      if (arg0.field7207[arg0.field7208] == arg0.field7207[arg0.field7208 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("pm.bw(Lrs;B)V")
   private static final void method10789(class790 arg0) {
      arg0.field7208 -= 2;
      if (arg0.field7207[arg0.field7208] < arg0.field7207[arg0.field7208 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("kq.bq(Lrs;I)V")
   private static final void method8529(class790 arg0) {
      arg0.field7208 -= 2;
      if (arg0.field7207[arg0.field7208] > arg0.field7207[arg0.field7208 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("zb.by(Lrs;I)V")
   private static final void method17055(class790 arg0) {
      arg0.field7208 -= 2;
      if (arg0.field7207[arg0.field7208] <= arg0.field7207[arg0.field7208 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("cv.bx(Lrs;B)V")
   private static final void method5201(class790 arg0) {
      arg0.field7208 -= 2;
      if (arg0.field7207[arg0.field7208] >= arg0.field7207[arg0.field7208 + 1]) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("ml.bm(Lrs;I)V")
   private static final void method9393(class790 arg0) {
      if (arg0.field7203[--arg0.field7204] == 1) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("rv.bh(Lrs;I)V")
   private static final void method14176(class790 arg0) {
      if (arg0.field7203[--arg0.field7204] == 0) {
         arg0.field7206 += arg0.field7222[arg0.field7206];
      }

   }

   @deob.ObfuscatedName("wy.bn(Lrs;B)V")
   private static final void method15957(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      Integer var2 = (Integer)Statics.field3804[var1];
      if (var2 == null) {
         class922 var3 = Statics.field6159.method15922(var1);
         if (var3.field9385 != 'i' && var3.field9385 != '1') {
            arg0.field7203[++arg0.field7204 - 1] = -1;
         } else {
            arg0.field7203[++arg0.field7204 - 1] = 0;
         }
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2;
      }

   }

   @deob.ObfuscatedName("ry.bk(Lrs;I)V")
   private static final void method14218(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      class922 var2 = Statics.field6159.method15922(var1);
      if (var2.field9385 != 1) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

      Integer var3 = (Integer)Statics.field3804[var2.field9383];
      if (var3 == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         int var4 = var2.field9386 == 31 ? -1 : (1 << var2.field9386 + 1) - 1;
         arg0.field7203[++arg0.field7204 - 1] = (var3 & var4) >>> var2.field9384;
      }

   }

   @deob.ObfuscatedName("qv.bo(Lrs;I)V")
   private static final void method11380(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      Long var2 = (Long)Statics.field3804[var1];
      if (var2 == null) {
         arg0.field7207[++arg0.field7208 - 1] = -1L;
      } else {
         arg0.field7207[++arg0.field7208 - 1] = var2;
      }

   }

   @deob.ObfuscatedName("dw.bj(Lrs;I)V")
   private static final void method5628(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      String var2 = (String)Statics.field3804[var1];
      if (var2 == null) {
         arg0.field7226[++arg0.field7205 - 1] = "";
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var2;
      }

   }

   @deob.ObfuscatedName("oj.bv(Lrs;I)V")
   private static final void method10308(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      class761 var2 = Statics.field9068.method11317(var1);
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         Integer var3 = arg0.field7214.method6799(client.field2584.field7304 << 16 | var1);
         int var4;
         if (var3 == null) {
            if (var2.field7002 != 'i' && var2.field7002 != '1') {
               var4 = -1;
            } else {
               var4 = 0;
            }
         } else {
            var4 = var3;
         }

         arg0.field7203[++arg0.field7204 - 1] = var4;
      }
   }

   @deob.ObfuscatedName("lg.bd(Lrs;I)V")
   private static final void method8888(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      class761 var2 = Statics.field9068.method11317(var1);
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         Integer var3 = arg0.field7214.method6797(client.field2584.field7304 << 16 | var2.field7001, var2.field7003, var2.field7000);
         int var4;
         if (var3 == null) {
            var4 = 0;
         } else {
            var4 = var3;
         }

         arg0.field7203[++arg0.field7204 - 1] = var4;
      }
   }

   @deob.ObfuscatedName("rc.bi(Lrs;B)V")
   private static final void method11599(class790 arg0) {
      int var1 = arg0.field7222[arg0.field7206];
      Long var2 = arg0.field7214.method6798(client.field2584.field7304 << 16 | var1);
      long var3;
      if (var2 == null) {
         var3 = -1L;
      } else {
         var3 = var2;
      }

      arg0.field7207[++arg0.field7208 - 1] = var3;
   }

   @deob.ObfuscatedName("yo.bt(Lrs;B)V")
   private static final void method16265(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class425.method11190(var1);
      method11045(Statics.field844[var1 >>> 16], var1 & 65535, var2, var3, arg0.field7219, arg0);
   }

   @deob.ObfuscatedName("vb.be(Lrs;I)V")
   private static final void method15373(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      if (var1.field7147.field3401 == -1) {
         if (arg0.field7219) {
            throw new RuntimeException("");
         } else {
            throw new RuntimeException("");
         }
      } else {
         class425 var2 = var1.method11662();
         var2.field3551[var1.field7147.field3401] = null;
         client.method7309(var2);
      }
   }

   @deob.ObfuscatedName("ct.bb(Lrs;I)V")
   private static final void method5152(class790 arg0) {
      class425 var1 = class425.method11190(arg0.field7203[--arg0.field7204]);
      var1.field3551 = null;
      var1.field3552 = null;
      client.method7309(var1);
   }

   @deob.ObfuscatedName("fo.bl(Lrs;I)V")
   private static final void method6465(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class778 var2;
      if (arg0.field7219) {
         var2 = arg0.field7212;
      } else {
         var2 = arg0.field7223;
      }

      arg0.field7203[++arg0.field7204 - 1] = var2.method11663(var1, -1) ? 1 : 0;
   }

   @deob.ObfuscatedName("ez.cm(ZLrs;I)V")
   private static final void method6136(boolean arg0, class790 arg1) {
      int var2 = arg1.field7203[--arg1.field7204];
      class425 var3 = class425.method11190(var2);
      class427 var4 = Statics.field844[var2 >> 16];
      if (arg0) {
         method11455(var4, var3);
      } else {
         method10931(var4, var3);
      }

   }

   @deob.ObfuscatedName("ajy.co(ZLrs;I)V")
   private static final void method3605(boolean arg0, class790 arg1) {
      class778 var2 = arg1.field7219 ? arg1.field7212 : arg1.field7223;
      class425 var3 = var2.field7147;
      class427 var4 = var2.field7148;
      if (arg0) {
         method11455(var4, var3);
      } else {
         method10931(var4, var3);
      }

   }

   @deob.ObfuscatedName("ic.ca(Lrs;I)V")
   private static final void method7310(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method3851(var2, arg0);
   }

   @deob.ObfuscatedName("aw.ce(Lrs;I)V")
   private static final void method4067(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      method3851(var2, arg0);
   }

   @deob.ObfuscatedName("al.cf(Lem;Lrs;S)V")
   private static final void method3851(class425 arg0, class790 arg1) {
      if (client.method4871(arg0).method898() && client.field2596 == null) {
         client.method5536(arg0.field3465, arg0.field3401);
         client.field2596 = Statics.method886(arg0.field3465, arg0.field3401);
         client.method7309(client.field2596);
      }

   }

   @deob.ObfuscatedName("vb.cj(Lrs;I)V")
   private static final void method15376(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (Statics.field5701.field1386 != null) {
         for(int var3 = 0; var3 < class480.field3887.length; ++var3) {
            if (class480.field3887[var3] == var1) {
               Statics.field5701.field1386.method11058(var3, var2, Statics.field9434);
               return;
            }
         }

         for(int var4 = 0; var4 < class480.field3886.length; ++var4) {
            if (class480.field3886[var4] == var1) {
               Statics.field5701.field1386.method11058(var4, var2, Statics.field9434);
               return;
            }
         }

      }
   }

   @deob.ObfuscatedName("ais.cw(Lrs;B)V")
   private static final void method3347(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (Statics.field5701.field1386 != null) {
         Statics.field5701.field1386.method11056(var1, var2);
      }
   }

   @deob.ObfuscatedName("l.cd(Lrs;I)V")
   private static final void method8734(class790 arg0) {
      boolean var1 = arg0.field7203[--arg0.field7204] != 0;
      if (Statics.field5701.field1386 != null) {
         Statics.field5701.field1386.method11057(var1);
      }
   }

   @deob.ObfuscatedName("le.ck(Lrs;B)V")
   private static final void method8878(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (Statics.field5701.field1386 != null) {
         Statics.field5701.field1386.method11064(var1, var2, Statics.field4196);
      }
   }

   @deob.ObfuscatedName("on.cs(Lem;Leo;Lrs;I)V")
   public static final void method10342(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 4;
      arg0.field3408 = arg2.field7203[arg2.field7204];
      arg0.field3553 = arg2.field7203[arg2.field7204 + 1];
      int var3 = arg2.field7203[arg2.field7204 + 2];
      if (var3 < 0) {
         var3 = 0;
      } else if (var3 > 5) {
         var3 = 5;
      }

      int var4 = arg2.field7203[arg2.field7204 + 3];
      if (var4 < 0) {
         var4 = 0;
      } else if (var4 > 5) {
         var4 = 5;
      }

      arg0.field3531 = (byte)var3;
      arg0.field3500 = (byte)var4;
      client.method7309(arg0);
      client.method6621(arg1, arg0);
      if (arg0.field3402 == 0) {
         client.method8010(arg1, arg0, false);
      }

      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method5535(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("aaq.cp(Lrs;B)V")
   private static final void method399(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10342(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qz.cv(Lem;Leo;Lrs;I)V")
   private static final void method11464(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 4;
      arg0.field3450 = arg2.field7203[arg2.field7204];
      arg0.field3411 = arg2.field7203[arg2.field7204 + 1];
      arg0.field3455 = 0;
      arg0.field3456 = 0;
      int var3 = arg2.field7203[arg2.field7204 + 2];
      if (var3 < 0) {
         var3 = 0;
      } else if (var3 > 4) {
         var3 = 4;
      }

      int var4 = arg2.field7203[arg2.field7204 + 3];
      if (var4 < 0) {
         var4 = 0;
      } else if (var4 > 4) {
         var4 = 4;
      }

      arg0.field3406 = (byte)var3;
      arg0.field3422 = (byte)var4;
      client.method7309(arg0);
      client.method6621(arg1, arg0);
      if (arg0.field3402 == 0) {
         client.method8010(arg1, arg0, false);
      }

   }

   @deob.ObfuscatedName("ap.cr(Lrs;I)V")
   private static final void method3994(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method11464(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ajv.cc(Lrs;S)V")
   private static final void method3568(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method11464(var2, var3, arg0);
   }

   @deob.ObfuscatedName("t.cx(Lem;Leo;Lrs;I)V")
   private static final void method14588(class425 arg0, class427 arg1, class790 arg2) {
      boolean var3 = arg2.field7203[--arg2.field7204] == 1;
      if (arg0.field3419 != var3) {
         arg0.field3419 = var3;
         client.method7309(arg0);
      }

      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7433(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("r.ch(Lrs;I)V")
   private static final void method11488(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method14588(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qv.cu(Lrs;I)V")
   private static final void method11386(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method14588(var2, var3, arg0);
   }

   @deob.ObfuscatedName("abg.cy(Lem;Leo;Lrs;B)V")
   public static final void method585(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      arg0.field3396 = arg2.field7203[arg2.field7204];
      arg0.field3417 = arg2.field7203[arg2.field7204 + 1];
      client.method7309(arg0);
      client.method6621(arg1, arg0);
      if (arg0.field3402 == 0) {
         client.method8010(arg1, arg0, false);
      }

   }

   @deob.ObfuscatedName("rc.cb(Lrs;I)V")
   private static final void method11596(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method585(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mk.ci(Lem;Leo;Lrs;I)V")
   private static final void method9341(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3423 = arg2.field7203[--arg2.field7204] == 1;
   }

   @deob.ObfuscatedName("z.cz(Lrs;B)V")
   private static final void method17036(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method9341(var2, var3, arg0);
   }

   @deob.ObfuscatedName("jb.ct(Lrs;I)V")
   private static final void method7894(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method9341(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ot.cn(Lem;Leo;Lrs;B)V")
   private static final void method10458(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      arg0.field3400 = arg2.field7203[arg2.field7204];
      if (arg0.field3400 > arg0.field3426 - arg0.field3405) {
         arg0.field3400 = arg0.field3426 - arg0.field3405;
      }

      if (arg0.field3400 < 0) {
         arg0.field3400 = 0;
      }

      arg0.field3425 = arg2.field7203[arg2.field7204 + 1];
      if (arg0.field3425 > arg0.field3461 - arg0.field3557) {
         arg0.field3425 = arg0.field3461 - arg0.field3557;
      }

      if (arg0.field3425 < 0) {
         arg0.field3425 = 0;
      }

      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method2091(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("nt.cq(Lrs;B)V")
   private static final void method10007(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10458(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pt.dr(Lrs;I)V")
   private static final void method10913(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10458(var2, var3, arg0);
   }

   @deob.ObfuscatedName("eo.df(Lrs;I)V")
   private static final void method5928(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method5383(var2, var3, arg0);
   }

   @deob.ObfuscatedName("sj.dk(Lrs;I)V")
   private static final void method14343(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method5383(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ic.de(Lem;Leo;Lrs;I)V")
   private static final void method7303(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3429 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("me.dp(Lrs;I)V")
   private static final void method9255(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method7303(var2, var3, arg0);
   }

   @deob.ObfuscatedName("kh.dh(Lrs;I)V")
   private static final void method8325(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method7303(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pu.dc(Lem;Leo;Lrs;I)V")
   private static final void method10927(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3430 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("c.dw(Lrs;I)V")
   private static final void method4416(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10927(var2, var3, arg0);
   }

   @deob.ObfuscatedName("wd.ds(Lrs;I)V")
   private static final void method15754(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10927(var2, var3, arg0);
   }

   @deob.ObfuscatedName("py.dm(Lem;Leo;Lrs;B)V")
   private static final void method10960(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3431 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("pd.dq(Lrs;I)V")
   private static final void method10697(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10960(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mt.db(Lrs;S)V")
   private static final void method9488(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10960(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dj.dt(Lem;Leo;Lrs;I)V")
   private static final void method5402(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204];
      if (arg0.field3494 != var3) {
         arg0.field3494 = var3;
         client.method7309(arg0);
      }

      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method5772(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("ug.dv(Lrs;B)V")
   private static final void method15143(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method5402(var2, var3, arg0);
   }

   @deob.ObfuscatedName("od.dj(Lrs;B)V")
   private static final void method10166(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5402(var2, var3, arg0);
   }

   @deob.ObfuscatedName("om.dl(Lrs;B)V")
   private static final void method10326(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method9882(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ky.da(Lem;Leo;Lrs;B)V")
   private static final void method8684(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3547 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("act.dg(Lrs;I)V")
   private static final void method1092(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8684(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dw.du(Lrs;I)V")
   private static final void method5623(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8684(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qb.dn(Lem;Leo;Lrs;S)V")
   private static final void method11046(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3442 = 1;
      arg0.field3498 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7423(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("no.dz(Lrs;I)V")
   private static final void method9956(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method11046(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mu.dd(Lrs;B)V")
   private static final void method9502(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method11046(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gf.dy(Lem;Leo;Lrs;B)V")
   private static final void method6624(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 6;
      arg0.field3375 = arg2.field7203[arg2.field7204];
      arg0.field3447 = arg2.field7203[arg2.field7204 + 1];
      arg0.field3394 = arg2.field7203[arg2.field7204 + 2];
      arg0.field3415 = arg2.field7203[arg2.field7204 + 3];
      arg0.field3440 = arg2.field7203[arg2.field7204 + 4];
      arg0.field3454 = arg2.field7203[arg2.field7204 + 5];
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7919(arg0.field3465);
         class231.method1999(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("ks.ea(Lrs;B)V")
   private static final void method8547(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6624(var2, var3, arg0);
   }

   @deob.ObfuscatedName("eb.ef(Lrs;I)V")
   private static final void method5676(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6624(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pq.ed(Lrs;B)V")
   private static final void method10855(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method273(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pk.ee(Lrs;I)V")
   private static final void method10748(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method273(var2, var3, arg0);
   }

   @deob.ObfuscatedName("t.ec(Lem;Leo;Lrs;I)V")
   private static final void method14583(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3457 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("gf.er(Lrs;I)V")
   private static final void method6625(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method14583(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gb.eu(Lrs;B)V")
   private static final void method6577(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method14583(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ml.ek(Lem;Leo;Lrs;I)V")
   private static final void method9396(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 4;
      arg0.field3449 = arg2.field7203[arg2.field7204];
      arg0.field3434 = arg2.field7203[arg2.field7204 + 1];
      arg0.field3466 = arg2.field7203[arg2.field7204 + 2];
      arg0.field3467 = arg2.field7203[arg2.field7204 + 3];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("vu.ew(Lrs;I)V")
   private static final void method15673(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method9396(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qs.el(Lrs;B)V")
   private static final void method11328(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method9396(var2, var3, arg0);
   }

   @deob.ObfuscatedName("kh.ei(Lem;Leo;Lrs;S)V")
   private static final void method8321(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (!var3.equals(arg0.field3470)) {
         arg0.field3470 = var3;
         client.method7309(arg0);
      }

      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method1104(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("rp.ex(Lrs;S)V")
   private static final void method14066(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8321(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lb.eo(Lrs;I)V")
   private static final void method8762(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8321(var2, var3, arg0);
   }

   @deob.ObfuscatedName("oc.en(Lrs;B)V")
   private static final void method10139(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method4085(var2, var3, arg0);
   }

   @deob.ObfuscatedName("zu.ej(Lem;Leo;Lrs;I)V")
   private static final void method17097(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 3;
      arg0.field3472 = arg2.field7203[arg2.field7204];
      arg0.field3473 = arg2.field7203[arg2.field7204 + 1];
      arg0.field3471 = arg2.field7203[arg2.field7204 + 2];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("mk.ez(Lrs;S)V")
   private static final void method9337(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method17097(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lw.eh(Lrs;I)V")
   private static final void method9131(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method17097(var2, var3, arg0);
   }

   @deob.ObfuscatedName("wx.eq(Lem;Leo;Lrs;B)V")
   public static final void method15954(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3474 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("ec.ep(Lem;Leo;Lrs;B)V")
   public static final void method5677(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3478 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method2002(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("fv.ey(Lrs;I)V")
   private static final void method6530(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5677(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ao.fs(Lem;Leo;Lrs;S)V")
   private static final void method3989(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3436 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("abl.fk(Lrs;B)V")
   private static final void method665(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method3989(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ct.fc(Lrs;I)V")
   private static final void method5157(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method3989(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ais.fn(Lem;Leo;Lrs;B)V")
   public static final void method3324(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3376 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("nu.fo(Lrs;I)V")
   private static final void method10031(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method3324(var2, var3, arg0);
   }

   @deob.ObfuscatedName("y.fz(Lem;Leo;Lrs;I)V")
   private static final void method16065(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3407 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("lc.fb(Lrs;I)V")
   private static final void method8871(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method16065(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dw.ft(Lrs;B)V")
   private static final void method5631(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method16065(var2, var3, arg0);
   }

   @deob.ObfuscatedName("uz.fr(Lem;Leo;Lrs;I)V")
   public static final void method15365(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3439 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("qb.fj(Lrs;I)V")
   private static final void method11051(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15365(var2, var3, arg0);
   }

   @deob.ObfuscatedName("wu.fq(Lem;Leo;Lrs;I)V")
   private static final void method15919(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      arg0.field3426 = arg2.field7203[arg2.field7204];
      arg0.field3461 = arg2.field7203[arg2.field7204 + 1];
      client.method7309(arg0);
      if (arg0.field3402 == 0) {
         client.method8010(arg1, arg0, false);
      }

   }

   @deob.ObfuscatedName("agg.fw(Lrs;S)V")
   private static final void method2344(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15919(var2, var3, arg0);
   }

   @deob.ObfuscatedName("xr.fe(Lrs;I)V")
   private static final void method16032(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15919(var2, var3, arg0);
   }

   @deob.ObfuscatedName("sr.fu(Lem;Leo;Lrs;I)V")
   public static final void method14449(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3476 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("afn.fy(Lrs;B)V")
   private static final void method2170(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method14449(var2, var3, arg0);
   }

   @deob.ObfuscatedName("jw.fv(Lem;Leo;Lrs;I)V")
   private static final void method8035(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3454 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7919(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("ek.fi(Lrs;I)V")
   private static final void method5797(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8035(var2, var3, arg0);
   }

   @deob.ObfuscatedName("aef.fp(Lrs;B)V")
   private static final void method1510(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8035(var2, var3, arg0);
   }

   @deob.ObfuscatedName("acd.fg(Lem;Leo;Lrs;I)V")
   private static final void method958(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204];
      arg0.field3432 = var3 == 1;
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("eh.fa(Lrs;B)V")
   private static final void method5776(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method958(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lw.fm(Lrs;B)V")
   private static final void method9132(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method958(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ol.fh(Lem;Leo;Lrs;I)V")
   private static final void method10321(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      arg0.field3451 = arg2.field7203[arg2.field7204];
      arg0.field3452 = arg2.field7203[arg2.field7204 + 1];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("ec.fx(Lrs;B)V")
   private static final void method5678(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10321(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rp.gu(Lrs;B)V")
   private static final void method14067(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10321(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lh.gi(Lem;Leo;Lrs;B)V")
   private static final void method8898(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3475 = arg2.field7203[--arg2.field7204];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("mh.gn(Lrs;I)V")
   private static final void method9277(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8898(var2, var3, arg0);
   }

   @deob.ObfuscatedName("afh.gj(Lrs;I)V")
   private static final void method2116(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8898(var2, var3, arg0);
   }

   @deob.ObfuscatedName("nm.gb(Lem;Leo;Lrs;I)V")
   private static final void method9883(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      int var3 = arg2.field7203[arg2.field7204];
      int var4 = arg2.field7203[arg2.field7204 + 1];
      class923 var5 = Statics.field5946.method15930(var3);
      if (var5.field9388 != var4) {
         arg0.method5827(var3, var4);
      } else {
         arg0.method5829(var3);
      }

   }

   @deob.ObfuscatedName("yo.gv(Lrs;I)V")
   private static final void method16262(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method9883(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mf.gw(Lrs;I)V")
   private static final void method9260(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method9883(var2, var3, arg0);
   }

   @deob.ObfuscatedName("aaa.gz(Lem;Leo;Lrs;I)V")
   private static final void method78(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204];
      String var4 = (String)arg2.field7226[--arg2.field7205];
      class923 var5 = Statics.field5946.method15930(var3);
      if (!var5.field9389.equals(var4)) {
         arg0.method5828(var3, var4);
      } else {
         arg0.method5829(var3);
      }

   }

   @deob.ObfuscatedName("ny.gc(Lrs;B)V")
   private static final void method10101(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method78(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ej.gy(Lrs;I)V")
   private static final void method5791(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method78(var2, var3, arg0);
   }

   @deob.ObfuscatedName("tu.gr(Lem;Leo;Lrs;I)V")
   private static final void method14949(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 3;
      int var3 = arg2.field7203[arg2.field7204];
      short var4 = (short)arg2.field7203[arg2.field7204 + 1];
      short var5 = (short)arg2.field7203[arg2.field7204 + 2];
      if (var3 >= 0 && var3 < 5) {
         arg0.method5830(var3, var4, var5);
         client.method7309(arg0);
         if (arg0.field3401 == -1 && !arg1.field3570) {
            class231.method15759(arg0.field3465, var3);
         }

      }
   }

   @deob.ObfuscatedName("dr.gd(Lrs;I)V")
   private static final void method5517(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method14949(var2, var3, arg0);
   }

   @deob.ObfuscatedName("afc.gm(Lrs;I)V")
   private static final void method2074(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method14949(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fy.gl(Lem;Leo;Lrs;I)V")
   private static final void method6537(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204];
      if (arg0.field3480 != var3) {
         arg0.field3480 = var3;
         client.method7309(arg0);
      }

      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method11678(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("jh.gs(Lem;Leo;Lrs;I)V")
   private static final void method7947(class425 arg0, class427 arg1, class790 arg2) {
      if (arg0.field3402 == 5) {
         method6537(arg0, arg1, arg2);
      }
   }

   @deob.ObfuscatedName("fn.gf(Lrs;B)V")
   private static final void method6447(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method7947(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pk.gq(Lrs;I)V")
   private static final void method10746(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method7947(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fr.ge(Lem;Leo;Lrs;B)V")
   private static final void method6490(class425 arg0, class427 arg1, class790 arg2) {
      if (arg0.field3402 == 4) {
         method6537(arg0, arg1, arg2);
      }
   }

   @deob.ObfuscatedName("vh.gx(Lrs;B)V")
   private static final void method15480(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6490(var2, var3, arg0);
   }

   @deob.ObfuscatedName("abg.go(Lrs;I)V")
   private static final void method584(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6490(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ci.gt(Lem;Leo;Lrs;I)V")
   private static final void method4526(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 3;
      int var3 = arg2.field7203[arg2.field7204];
      short var4 = (short)arg2.field7203[arg2.field7204 + 1];
      short var5 = (short)arg2.field7203[arg2.field7204 + 2];
      if (var3 >= 0 && var3 < 5) {
         arg0.method5831(var3, var4, var5);
         client.method7309(arg0);
         if (arg0.field3401 == -1 && !arg1.field3570) {
            class231.method10998(arg0.field3465, var3);
         }

      }
   }

   @deob.ObfuscatedName("fm.gk(Lrs;B)V")
   private static final void method6441(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method4526(var2, var3, arg0);
   }

   @deob.ObfuscatedName("el.gh(Lrs;B)V")
   private static final void method5810(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method4526(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ky.ga(Lem;Leo;Lrs;B)V")
   public static final void method8679(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3410 = arg2.field7203[--arg2.field7204] == 1;
      client.method7309(arg0);
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method2954(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("et.gg(Lrs;S)V")
   private static final void method5968(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8679(var2, var3, arg0);
   }

   @deob.ObfuscatedName("k.ho(Lrs;I)V")
   private static final void method8052(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7204 -= 2;
      int var3 = arg0.field7203[arg0.field7204];
      int var4 = arg0.field7203[arg0.field7204 + 1];
      class923 var5 = Statics.field5946.method15930(var3);
      if (var5.field9388 != var4) {
         var2.method5827(var3, var4);
      } else {
         var2.method5829(var3);
      }

   }

   @deob.ObfuscatedName("p.hl(Lrs;I)V")
   private static final void method10653(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method7904(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qv.hf(Lrs;B)V")
   private static final void method11381(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method7904(var2, var3, arg0);
   }

   @deob.ObfuscatedName("od.hw(Lem;Leo;Lrs;I)V")
   private static final void method10167(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3442 = 2;
      arg0.field3566 = null;
      arg0.field3498 = arg2.field7203[--arg2.field7204];
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7423(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("uh.hm(Lrs;S)V")
   private static final void method15163(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10167(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dn.he(Lrs;I)V")
   private static final void method5503(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10167(var2, var3, arg0);
   }

   @deob.ObfuscatedName("wy.hz(Lem;Leo;Lrs;I)V")
   private static final void method15955(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3442 = 3;
      arg0.field3498 = client.field2452;
      arg0.field3444 = 0;
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7423(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("ej.hn(Lrs;I)V")
   private static final void method5792(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15955(var2, var3, arg0);
   }

   @deob.ObfuscatedName("wt.hc(Lrs;I)V")
   private static final void method15915(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15955(var2, var3, arg0);
   }

   @deob.ObfuscatedName("zv.hy(Lem;Leo;ZILrs;I)V")
   public static final void method17100(class425 arg0, class427 arg1, boolean arg2, int arg3, class790 arg4) {
      arg4.field7204 -= 2;
      int var5 = arg4.field7203[arg4.field7204];
      int var6 = arg4.field7203[arg4.field7204 + 1];
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method4417(arg0.field3465);
         class231.method7919(arg0.field3465);
         class231.method1999(arg0.field3465);
      }

      if (var5 == -1) {
         arg0.field3442 = 1;
         arg0.field3498 = -1;
         arg0.field3539 = -1;
      } else {
         arg0.field3539 = var5;
         arg0.field3540 = var6;
         arg0.field3541 = arg2;
         class899 var7 = Statics.field4196.method15540(var5);
         arg0.field3394 = var7.field9129;
         arg0.field3415 = var7.field9124;
         arg0.field3440 = var7.field9140;
         arg0.field3375 = var7.field9131;
         arg0.field3447 = var7.field9150;
         arg0.field3454 = var7.field9137;
         arg0.field3459 = arg3;
         if (arg0.field3455 > 0) {
            arg0.field3454 = arg0.field3454 * 32 / arg0.field3455;
         } else if (arg0.field3450 > 0) {
            arg0.field3454 = arg0.field3454 * 32 / arg0.field3450;
         }

      }
   }

   @deob.ObfuscatedName("eb.hb(Lrs;I)V")
   private static final void method5674(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method17100(var2, var3, false, 2, arg0);
   }

   @deob.ObfuscatedName("sa.hg(Lrs;I)V")
   private static final void method14239(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method17100(var2, var3, false, 0, arg0);
   }

   @deob.ObfuscatedName("op.ha(Lrs;I)V")
   private static final void method10368(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method17100(var2, var3, false, 0, arg0);
   }

   @deob.ObfuscatedName("vh.hp(Lrs;I)V")
   private static final void method15479(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method17100(var2, var3, true, 2, arg0);
   }

   @deob.ObfuscatedName("wu.hq(Lrs;I)V")
   private static final void method15920(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method17100(var2, var3, true, 0, arg0);
   }

   @deob.ObfuscatedName("wr.hv(Lrs;I)V")
   private static final void method15891(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method17100(var2, var3, true, 0, arg0);
   }

   @deob.ObfuscatedName("va.ht(Lrs;I)V")
   private static final void method15372(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method17100(var2, var3, false, 1, arg0);
   }

   @deob.ObfuscatedName("cv.hk(Lrs;B)V")
   private static final void method5202(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method17100(var2, var3, false, 1, arg0);
   }

   @deob.ObfuscatedName("px.hj(Lrs;I)V")
   private static final void method10949(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method17100(var2, var3, true, 1, arg0);
   }

   @deob.ObfuscatedName("up.hi(Lrs;I)V")
   private static final void method15222(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method17100(var2, var3, true, 1, arg0);
   }

   @deob.ObfuscatedName("d.hs(Lem;Leo;Lrs;B)V")
   private static final void method5336(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3442 = 6;
      arg0.field3566 = null;
      arg0.field3498 = arg2.field7203[--arg2.field7204];
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7423(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("av.hx(Lrs;I)V")
   private static final void method4051(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method5336(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ez.ip(Lrs;I)V")
   private static final void method6137(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5336(var2, var3, arg0);
   }

   @deob.ObfuscatedName("iq.ib(Lem;Leo;Lrs;I)V")
   private static final void method7396(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3442 = 5;
      arg0.field3498 = arg2.field7203[--arg2.field7204];
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7423(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("rk.it(Lrs;I)V")
   private static final void method11736(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method7396(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fb.ii(Lrs;B)V")
   private static final void method6218(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method7396(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dw.in(Lem;Leo;Lrs;B)V")
   private static final void method5624(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 4;
      arg0.field3542 = arg2.field7203[arg2.field7204];
      arg0.field3545 = arg2.field7203[arg2.field7204 + 1];
      arg0.field3546 = arg2.field7203[arg2.field7204 + 2];
      arg0.field3437 = arg2.field7203[arg2.field7204 + 3];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("ih.io(Lrs;I)V")
   private static final void method7352(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method5624(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gn.id(Lrs;B)V")
   private static final void method6768(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5624(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gw.iv(Lem;Leo;Lrs;I)V")
   private static final void method6889(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      arg0.field3543 = arg2.field7203[arg2.field7204];
      arg0.field3521 = arg2.field7203[arg2.field7204 + 1];
      client.method7309(arg0);
   }

   @deob.ObfuscatedName("afm.iy(Lrs;I)V")
   private static final void method2160(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6889(var2, var3, arg0);
   }

   @deob.ObfuscatedName("vf.if(Lrs;I)V")
   private static final void method15439(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6889(var2, var3, arg0);
   }

   @deob.ObfuscatedName("r.ix(Lrs;I)V")
   private static final void method11489(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method8890(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ri.ir(Lrs;I)V")
   private static final void method11697(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method8890(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dj.ia(Lem;Leo;Lrs;I)V")
   private static final void method5403(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3442 = 5;
      arg0.field3498 = client.field2452;
      arg0.field3444 = 0;
      if (arg0.field3401 == -1 && !arg1.field3570) {
         class231.method7423(arg0.field3465);
      }

   }

   @deob.ObfuscatedName("ki.iw(Lrs;I)V")
   private static final void method8344(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method5403(var2, var3, arg0);
   }

   @deob.ObfuscatedName("iu.ic(Lrs;B)V")
   private static final void method7421(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5403(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mc.ig(Lem;Leo;Lrs;I)V")
   private static final void method9225(class425 arg0, class427 arg1, class790 arg2) {
      int var3 = arg2.field7203[--arg2.field7204] - 1;
      if (var3 >= 0 && var3 <= 9) {
         arg0.method5832(var3, (String)arg2.field7226[--arg2.field7205]);
      } else {
         --arg2.field7205;
      }
   }

   @deob.ObfuscatedName("qr.ih(Lrs;I)V")
   private static final void method11310(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method9225(var2, var3, arg0);
   }

   @deob.ObfuscatedName("cu.iz(Lrs;I)V")
   private static final void method5180(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method9225(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fz.il(Lem;Leo;Lrs;I)V")
   public static final void method6556(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      int var3 = arg2.field7203[arg2.field7204];
      int var4 = arg2.field7203[arg2.field7204 + 1];
      if (var3 == -1 && var4 == -1) {
         arg0.field3492 = null;
      } else {
         arg0.field3492 = Statics.method886(var3, var4);
      }

   }

   @deob.ObfuscatedName("tf.is(Lrs;I)V")
   private static final void method14662(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6556(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ju.ie(Lrs;B)V")
   private static final void method8023(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method15058(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ads.im(Lrs;B)V")
   private static final void method1386(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method15058(var2, var3, arg0);
   }

   @deob.ObfuscatedName("vp.jt(Lrs;I)V")
   private static final void method15560(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method14521(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ss.ju(Lem;Leo;Lrs;I)V")
   private static final void method14472(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3556 = arg2.field7203[--arg2.field7204];
   }

   @deob.ObfuscatedName("sy.ja(Lrs;B)V")
   private static final void method14543(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method14472(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rf.jw(Lrs;I)V")
   private static final void method11660(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method14472(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gj.jl(Lem;Leo;Lrs;I)V")
   private static final void method6644(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3548 = (String)arg2.field7226[--arg2.field7205];
   }

   @deob.ObfuscatedName("tg.jr(Lrs;I)V")
   private static final void method14665(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6644(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qf.jg(Lrs;I)V")
   private static final void method11111(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6644(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gs.js(Lem;Leo;Lrs;B)V")
   private static final void method6864(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3490 = (String)arg2.field7226[--arg2.field7205];
   }

   @deob.ObfuscatedName("jd.jm(Lrs;I)V")
   private static final void method7914(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6864(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mv.jh(Lrs;I)V")
   private static final void method9659(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6864(var2, var3, arg0);
   }

   @deob.ObfuscatedName("oy.jz(Lrs;B)V")
   private static final void method10649(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method8988(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rz.jy(Lrs;I)V")
   private static final void method14226(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method8988(var2, var3, arg0);
   }

   @deob.ObfuscatedName("aaa.jb(Lem;Leo;Lrs;I)V")
   private static final void method75(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3421 = arg2.field7203[--arg2.field7204];
      arg0.field3420 = arg2.field7203[--arg2.field7204];
   }

   @deob.ObfuscatedName("qv.jf(Lrs;I)V")
   private static final void method11382(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method75(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lx.jd(Lrs;B)V")
   private static final void method9165(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method75(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rs.jx(Lrs;I)V")
   private static final void method14155(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method14036(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mk.jp(Lrs;I)V")
   private static final void method9342(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method5534(var2, var3, arg0);
   }

   @deob.ObfuscatedName("zl.jo(Lrs;B)V")
   private static final void method17073(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method5534(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mf.jj(Lem;Leo;Lrs;I)V")
   private static final void method9261(class425 arg0, class427 arg1, class790 arg2) {
      arg0.field3491 = arg2.field7203[--arg2.field7204];
   }

   @deob.ObfuscatedName("oc.je(Lrs;B)V")
   private static final void method10142(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method9261(var2, var3, arg0);
   }

   @deob.ObfuscatedName("jl.jk(Lrs;I)V")
   private static final void method7963(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method9261(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fz.kk(Lem;IILrs;I)V")
   private static final void method6551(class425 arg0, int arg1, int arg2, class790 arg3) {
      if (arg0.field3482 == null) {
         if (arg2 <= 0) {
            return;
         }

         arg0.field3479 = new byte[11][];
         arg0.field3435 = new byte[11][];
         arg0.field3481 = new int[11];
         arg0.field3482 = new int[11];
      }

      arg0.field3482[arg1] = arg2;
      if (arg2 > 0) {
         arg0.field3524 = true;
      } else {
         arg0.field3524 = false;

         for(int var4 = 0; var4 < arg0.field3479.length; ++var4) {
            if (arg0.field3479[var4] != null || arg0.field3482[var4] > 0) {
               arg0.field3524 = true;
               break;
            }
         }
      }

   }

   @deob.ObfuscatedName("nq.kp(Lem;Lrs;B)V")
   private static final void method9995(class425 arg0, class790 arg1) {
      arg1.field7204 -= 2;
      int var2 = arg1.field7203[arg1.field7204] - 1;
      int var3 = arg1.field7203[arg1.field7204 + 1];
      if (var2 >= 0 && var2 <= 9) {
         method6551(arg0, var2, var3, arg1);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("ge.ki(Lrs;B)V")
   private static final void method6622(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method9995(var2, arg0);
   }

   @deob.ObfuscatedName("fo.kf(Lrs;I)V")
   private static final void method6466(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      method9995(var2, arg0);
   }

   @deob.ObfuscatedName("vw.kc(Lem;Lrs;S)V")
   private static final void method15706(class425 arg0, class790 arg1) {
      byte var2 = 10;
      int var3 = arg1.field7203[--arg1.field7204];
      method6551(arg0, var2, var3, arg1);
   }

   @deob.ObfuscatedName("nz.kh(Lrs;I)V")
   private static final void method10114(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method15706(var2, arg0);
   }

   @deob.ObfuscatedName("ap.kj(Lrs;B)V")
   private static final void method3995(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      method15706(var2, arg0);
   }

   @deob.ObfuscatedName("wi.km(Lem;I[B[BLrs;I)V")
   public static final void method15816(class425 arg0, int arg1, byte[] arg2, byte[] arg3, class790 arg4) {
      if (arg0.field3479 == null) {
         if (arg2 == null) {
            return;
         }

         arg0.field3479 = new byte[11][];
         arg0.field3435 = new byte[11][];
         arg0.field3481 = new int[11];
         arg0.field3482 = new int[11];
      }

      arg0.field3479[arg1] = arg2;
      if (arg2 != null) {
         arg0.field3524 = true;
      } else {
         arg0.field3524 = false;

         for(int var5 = 0; var5 < arg0.field3479.length; ++var5) {
            if (arg0.field3479[var5] != null || arg0.field3482[var5] > 0) {
               arg0.field3524 = true;
               break;
            }
         }
      }

      arg0.field3435[arg1] = arg3;
   }

   @deob.ObfuscatedName("ek.kd(Lrs;I)V")
   private static final void method5794(class790 arg0) {
      arg0.field7204 -= 3;
      byte[] var1 = new byte[]{(byte)arg0.field7203[arg0.field7204]};
      byte[] var2 = new byte[]{(byte)arg0.field7203[arg0.field7204 + 1]};
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class425 var4 = class425.method11190(var3);
      Statics.method15215(var4, var1, var2, arg0);
   }

   @deob.ObfuscatedName("vb.kr(Lem;Leo;Lrs;I)V")
   private static final void method15377(class425 arg0, class427 arg1, class790 arg2) {
      arg2.field7204 -= 2;
      byte var3 = 10;
      byte[] var4 = new byte[]{(byte)arg2.field7203[arg2.field7204]};
      byte[] var5 = new byte[]{(byte)arg2.field7203[arg2.field7204 + 1]};
      method15816(arg0, var3, var4, var5, arg2);
   }

   @deob.ObfuscatedName("act.kx(Lrs;I)V")
   private static final void method1091(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15377(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ado.kb(Lrs;I)V")
   private static final void method1341(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15377(var2, var3, arg0);
   }

   @deob.ObfuscatedName("cu.kw(Lrs;B)V")
   private static final void method5181(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method9677(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qg.ko(Lrs;I)V")
   private static final void method11162(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method9677(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ks.kt(Lem;Leo;Lrs;B)V")
   private static final void method8553(class425 arg0, class427 arg1, class790 arg2) {
      arg0.method5821();
   }

   @deob.ObfuscatedName("na.kv(Lrs;I)V")
   private static final void method9711(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8553(var2, var3, arg0);
   }

   @deob.ObfuscatedName("iv.kg(Lrs;I)V")
   private static final void method7428(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8553(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gq.ky(Ljava/lang/String;Lrs;I)[I")
   public static final int[] method6858(String arg0, class790 arg1) {
      int[] var2 = null;
      if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
         int var3 = arg1.field7203[--arg1.field7204];
         if (var3 > 0) {
            var2 = new int[var3];

            while(var3-- > 0) {
               var2[var3] = arg1.field7203[--arg1.field7204];
            }
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("aej.ke(Ljava/lang/String;Lrs;B)[Ljava/lang/Object;")
   public static final Object[] method1549(String arg0, class790 arg1) {
      Object[] var2 = new Object[arg0.length() + 1];

      for(int var3 = var2.length - 1; var3 >= 1; --var3) {
         if (arg0.charAt(var3 - 1) == 's') {
            var2[var3] = arg1.field7226[--arg1.field7205];
         } else if (arg0.charAt(var3 - 1) == 167) {
            var2[var3] = new Long(arg1.field7207[--arg1.field7208]);
         } else {
            var2[var3] = new Integer(arg1.field7203[--arg1.field7204]);
         }
      }

      int var4 = arg1.field7203[--arg1.field7204];
      if (var4 != -1) {
         var2[0] = new Integer(var4);
      } else {
         var2 = null;
      }

      return var2;
   }

   @deob.ObfuscatedName("qf.ks(Lem;Leo;Lrs;I)V")
   private static final void method11112(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3499 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("ud.kl(Lrs;B)V")
   private static final void method15094(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method11112(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fs.kq(Lrs;I)V")
   private static final void method6501(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method11112(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ff.le(Lrs;B)V")
   private static final void method6253(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method3815(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rm.lo(Lrs;I)V")
   private static final void method14040(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method3815(var2, var3, arg0);
   }

   @deob.ObfuscatedName("az.lg(Lem;Leo;Lrs;B)V")
   private static final void method4097(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3458 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("ec.lw(Lrs;I)V")
   private static final void method5679(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method4097(var2, var3, arg0);
   }

   @deob.ObfuscatedName("na.lc(Lrs;I)V")
   private static final void method9709(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method4097(var2, var3, arg0);
   }

   @deob.ObfuscatedName("lk.lk(Lem;Leo;Lrs;I)V")
   private static final void method8941(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3503 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("cx.li(Lrs;I)V")
   private static final void method5212(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8941(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pn.lu(Lrs;B)V")
   private static final void method10805(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8941(var2, var3, arg0);
   }

   @deob.ObfuscatedName("kh.lb(Lem;Leo;Lrs;I)V")
   private static final void method8324(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3505 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("ls.lq(Lrs;I)V")
   private static final void method9102(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8324(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ae.lp(Lrs;B)V")
   private static final void method1438(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8324(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pr.lh(Lem;Leo;Lrs;I)V")
   public static final void method10868(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3506 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("v.ls(Lrs;I)V")
   private static final void method15368(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10868(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ak.lx(Lem;Leo;Lrs;I)V")
   private static final void method3613(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3509 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("ta.lz(Lrs;B)V")
   private static final void method14591(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method3613(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mg.lf(Lrs;I)V")
   private static final void method9271(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method3613(var2, var3, arg0);
   }

   @deob.ObfuscatedName("cv.lj(Lem;Leo;Lrs;S)V")
   private static final void method5204(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      int[] var4 = method6858(var3, arg2);
      if (var4 != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3510 = method1549(var3, arg2);
      arg0.field3511 = var4;
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("nh.la(Lrs;B)V")
   private static final void method9838(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method5204(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rz.lm(Lrs;I)V")
   private static final void method14227(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5204(var2, var3, arg0);
   }

   @deob.ObfuscatedName("do.ld(Lem;Leo;Lrs;I)V")
   private static final void method5505(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3563 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("qo.lt(Lrs;I)V")
   private static final void method11276(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method5505(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gc.ly(Lrs;I)V")
   private static final void method6592(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method5505(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pn.lv(Lem;Leo;Lrs;B)V")
   private static final void method10809(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3523 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("acm.ln(Lrs;I)V")
   private static final void method1014(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10809(var2, var3, arg0);
   }

   @deob.ObfuscatedName("jm.ll(Lrs;B)V")
   private static final void method7973(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10809(var2, var3, arg0);
   }

   @deob.ObfuscatedName("l.me(Lem;Leo;Lrs;I)V")
   private static final void method8736(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3502 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("lv.mf(Lrs;I)V")
   private static final void method9124(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method8736(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dj.mn(Lrs;I)V")
   private static final void method5408(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method8736(var2, var3, arg0);
   }

   @deob.ObfuscatedName("oi.mv(Lem;Leo;Lrs;B)V")
   private static final void method10295(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3532 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("fy.mu(Lrs;I)V")
   private static final void method6538(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10295(var2, var3, arg0);
   }

   @deob.ObfuscatedName("no.ml(Lrs;I)V")
   private static final void method9954(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10295(var2, var3, arg0);
   }

   @deob.ObfuscatedName("aaf.mp(Lem;Leo;Lrs;B)V")
   private static final void method247(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3504 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("an.mo(Lrs;I)V")
   private static final void method3953(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method247(var2, var3, arg0);
   }

   @deob.ObfuscatedName("zv.my(Lrs;B)V")
   private static final void method17099(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method247(var2, var3, arg0);
   }

   @deob.ObfuscatedName("xu.mk(Lem;Leo;Lrs;I)V")
   public static final void method16040(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      int[] var4 = method6858(var3, arg2);
      if (var4 != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3413 = method1549(var3, arg2);
      arg0.field3513 = var4;
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("ou.mt(Lrs;I)V")
   private static final void method10469(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method16040(var2, var3, arg0);
   }

   @deob.ObfuscatedName("fm.mr(Lrs;I)V")
   private static final void method6439(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method10199(var2, var3, arg0);
   }

   @deob.ObfuscatedName("yg.mx(Lrs;B)V")
   private static final void method16098(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      Statics.method10199(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rj.mz(Lem;Leo;Lrs;B)V")
   private static final void method11732(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3508 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("r.ma(Lrs;B)V")
   private static final void method11490(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method11732(var2, var3, arg0);
   }

   @deob.ObfuscatedName("re.mg(Lrs;I)V")
   private static final void method11646(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method11732(var2, var3, arg0);
   }

   @deob.ObfuscatedName("wd.mh(Lem;Leo;Lrs;B)V")
   private static final void method15752(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3525 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("oc.mj(Lrs;I)V")
   private static final void method10140(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15752(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ri.mc(Lrs;B)V")
   private static final void method11698(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15752(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ai.ms(Lrs;I)V")
   private static final void method2947(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      Statics.method5404(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ads.mw(Lem;Leo;Lrs;I)V")
   private static final void method1384(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3527 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("j.mi(Lrs;I)V")
   private static final void method7469(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method1384(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ch.nf(Lrs;I)V")
   private static final void method4524(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method1384(var2, var3, arg0);
   }

   @deob.ObfuscatedName("vk.ns(Lem;Leo;Lrs;I)V")
   private static final void method15508(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3528 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("fu.nz(Lrs;I)V")
   private static final void method6523(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15508(var2, var3, arg0);
   }

   @deob.ObfuscatedName("vb.nw(Lrs;B)V")
   private static final void method15378(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15508(var2, var3, arg0);
   }

   @deob.ObfuscatedName("pq.nh(Lem;Leo;Lrs;B)V")
   private static final void method10857(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3529 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("j.nb(Lrs;I)V")
   private static final void method7470(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method10857(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qs.nq(Lrs;I)V")
   private static final void method11330(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method10857(var2, var3, arg0);
   }

   @deob.ObfuscatedName("me.ng(Lem;Leo;Lrs;I)V")
   private static final void method9253(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3414 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("s.nu(Lrs;S)V")
   private static final void method14236(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method9253(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rr.ne(Lrs;I)V")
   private static final void method14153(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method9253(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gr.np(Lem;Leo;Lrs;B)V")
   private static final void method6860(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3416 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("xu.nk(Lrs;I)V")
   private static final void method16039(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6860(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ae.nl(Lrs;B)V")
   private static final void method1440(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6860(var2, var3, arg0);
   }

   @deob.ObfuscatedName("uq.nj(Lem;Leo;Lrs;I)V")
   private static final void method15227(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3464 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("nu.na(Lrs;I)V")
   private static final void method10027(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15227(var2, var3, arg0);
   }

   @deob.ObfuscatedName("yo.nr(Lrs;I)V")
   private static final void method16264(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15227(var2, var3, arg0);
   }

   @deob.ObfuscatedName("na.ny(Lem;Leo;Lrs;B)V")
   private static final void method9715(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3533 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("js.nc(Lrs;I)V")
   private static final void method8007(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method9715(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ll.nv(Lrs;I)V")
   private static final void method8947(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method9715(var2, var3, arg0);
   }

   @deob.ObfuscatedName("qq.ok(Lem;Leo;Lrs;I)V")
   private static final void method11289(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3536 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("gn.ol(Lrs;I)V")
   private static final void method6766(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method11289(var2, var3, arg0);
   }

   @deob.ObfuscatedName("mc.og(Lrs;B)V")
   private static final void method9228(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method11289(var2, var3, arg0);
   }

   @deob.ObfuscatedName("sx.of(Lem;Leo;Lrs;I)V")
   private static final void method14524(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3537 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("ch.on(Lrs;S)V")
   private static final void method4520(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method14524(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ud.ou(Lrs;B)V")
   private static final void method15091(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method14524(var2, var3, arg0);
   }

   @deob.ObfuscatedName("jl.oa(Lem;Leo;Lrs;I)V")
   private static final void method7964(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      int[] var4 = method6858(var3, arg2);
      if (var4 != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3516 = method1549(var3, arg2);
      arg0.field3517 = var4;
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("kg.ot(Lrs;I)V")
   private static final void method8286(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method7964(var2, var3, arg0);
   }

   @deob.ObfuscatedName("rg.ob(Lrs;I)V")
   private static final void method11676(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method7964(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ex.op(Lem;Leo;Lrs;S)V")
   private static final void method6121(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      int[] var4 = method6858(var3, arg2);
      if (var4 != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3518 = method1549(var3, arg2);
      arg0.field3409 = var4;
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("pa.od(Lrs;I)V")
   private static final void method10661(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6121(var2, var3, arg0);
   }

   @deob.ObfuscatedName("kg.oe(Lrs;I)V")
   private static final void method8287(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6121(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ey.oj(Lem;Leo;Lrs;I)V")
   public static final void method6125(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3403 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("w.oq(Lrs;B)V")
   private static final void method15729(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6125(var2, var3, arg0);
   }

   @deob.ObfuscatedName("vk.oc(Lem;Leo;Lrs;I)V")
   public static final void method15506(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3496 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("lq.oo(Lrs;I)V")
   private static final void method9085(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15506(var2, var3, arg0);
   }

   @deob.ObfuscatedName("gc.om(Lem;Leo;Lrs;I)V")
   private static final void method6594(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3387 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("pg.oy(Lrs;B)V")
   private static final void method10713(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method6594(var2, var3, arg0);
   }

   @deob.ObfuscatedName("yx.oz(Lrs;I)V")
   private static final void method16870(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method6594(var2, var3, arg0);
   }

   @deob.ObfuscatedName("uy.oh(Lem;Leo;Lrs;I)V")
   private static final void method15355(class425 arg0, class427 arg1, class790 arg2) {
      String var3 = (String)arg2.field7226[--arg2.field7205];
      if (method6858(var3, arg2) != null) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      arg0.field3520 = method1549(var3, arg2);
      arg0.field3463 = true;
   }

   @deob.ObfuscatedName("fw.os(Lrs;B)V")
   private static final void method6535(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >> 16];
      method15355(var2, var3, arg0);
   }

   @deob.ObfuscatedName("ig.ov(Lrs;B)V")
   private static final void method7344(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      method15355(var2, var3, arg0);
   }

   @deob.ObfuscatedName("dz.oi(Lrs;I)V")
   private static final void method5652(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3398;
   }

   @deob.ObfuscatedName("ln.pb(Lrs;I)V")
   private static final void method8974(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3487;
   }

   @deob.ObfuscatedName("vi.pl(Lrs;I)V")
   private static final void method15485(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3405;
   }

   @deob.ObfuscatedName("pt.pi(Lrs;I)V")
   private static final void method10918(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3557;
   }

   @deob.ObfuscatedName("tv.pc(Lrs;I)V")
   private static final void method14955(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3419 ? 1 : 0;
   }

   @deob.ObfuscatedName("cc.pg(Lrs;B)V")
   private static final void method4453(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3462;
   }

   @deob.ObfuscatedName("fd.ps(Lrs;I)V")
   private static final void method6231(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      class427 var3 = var1.field7148;
      class425 var4 = client.method17098(var3, var2);
      arg0.field7203[++arg0.field7204 - 1] = var4 == null ? -1 : var4.field3465;
   }

   @deob.ObfuscatedName("rn.pk(Lrs;I)V")
   private static final void method14056(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3448;
   }

   @deob.ObfuscatedName("wq.pq(Lrs;I)V")
   private static final void method15889(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3400;
   }

   @deob.ObfuscatedName("tt.pz(Lrs;I)V")
   private static final void method14922(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3425;
   }

   @deob.ObfuscatedName("oq.pn(Lrs;I)V")
   private static final void method10391(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7226[++arg0.field7205 - 1] = var2.field3470;
   }

   @deob.ObfuscatedName("pj.pm(Lrs;B)V")
   private static final void method10739(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3426;
   }

   @deob.ObfuscatedName("kz.pw(Lrs;I)V")
   private static final void method8685(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3461;
   }

   @deob.ObfuscatedName("ps.pp(Lrs;I)V")
   private static final void method10874(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3454;
   }

   @deob.ObfuscatedName("rg.pd(Lrs;I)V")
   private static final void method11679(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3394;
   }

   @deob.ObfuscatedName("aal.pe(Lrs;I)V")
   private static final void method367(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3440;
   }

   @deob.ObfuscatedName("if.po(Lrs;I)V")
   private static final void method7337(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3415;
   }

   @deob.ObfuscatedName("agg.pa(Lrs;B)V")
   private static final void method2345(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3430;
   }

   @deob.ObfuscatedName("ob.px(Lrs;I)V")
   private static final void method10131(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3375;
   }

   @deob.ObfuscatedName("jl.pj(Lrs;I)V")
   private static final void method7965(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3494;
   }

   @deob.ObfuscatedName("ke.pt(Lrs;I)V")
   private static final void method8272(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      int var3 = arg0.field7203[--arg0.field7204];
      class923 var4 = Statics.field5946.method15930(var3);
      if (var4.method15884()) {
         arg0.field7226[++arg0.field7205 - 1] = var2.method5826(var3, var4.field9389);
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.method5850(var3, var4.field9388);
      }

   }

   @deob.ObfuscatedName("pl.pr(Lrs;S)V")
   private static final void method10761(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3534;
   }

   @deob.ObfuscatedName("em.pf(Lrs;I)V")
   private static final void method5903(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3442 == 1 ? var2.field3498 : -1;
   }

   @deob.ObfuscatedName("lh.pv(Lrs;I)V")
   private static final void method8896(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3468;
   }

   @deob.ObfuscatedName("nk.py(Lrs;I)V")
   private static final void method9869(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      int var3 = -1;
      int var4 = -1;
      class436 var5 = var2.method5824(Statics.field8847);
      if (var5 != null) {
         var3 = var5.field3629;
         var4 = var5.field3625;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
      arg0.field7203[++arg0.field7204 - 1] = var4;
   }

   @deob.ObfuscatedName("ap.ph(Lrs;I)V")
   private static final void method3992(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3468;
   }

   @deob.ObfuscatedName("nu.qi(Lrs;I)V")
   private static final void method10028(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = var2.field3401;
   }

   @deob.ObfuscatedName("er.qh(Lrs;B)V")
   private static final void method5956(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      arg0.field7203[++arg0.field7204 - 1] = client.method4871(var2).method911();
   }

   @deob.ObfuscatedName("qt.qk(Lrs;I)V")
   private static final void method11347(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      int var3 = arg0.field7203[--arg0.field7204];
      int var4 = var3 - 1;
      if (var2.field3488 != null && var4 < var2.field3488.length && var2.field3488[var4] != null) {
         arg0.field7226[++arg0.field7205 - 1] = var2.field3488[var4];
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("me.qn(Lrs;I)V")
   private static final void method9254(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      if (var2.field3548 == null) {
         arg0.field7226[++arg0.field7205 - 1] = "";
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var2.field3548;
      }

   }

   @deob.ObfuscatedName("fr.qp(Lem;Lrs;I)V")
   private static final void method6486(class425 arg0, class790 arg1) {
      if (arg1.field7198 >= 10) {
         throw new RuntimeException();
      } else if (arg0.field3537 != null) {
         class90 var2 = new class90();
         var2.field679 = arg0;
         var2.field683 = arg0.field3537;
         var2.field687 = arg1.field7198 + 1;
         client.field2646.method14959(var2);
      }
   }

   @deob.ObfuscatedName("ch.qx(Lrs;B)V")
   private static final void method4525(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method6486(var2, arg0);
   }

   @deob.ObfuscatedName("ta.qb(Lrs;I)V")
   private static final void method14592(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      method6486(var2, arg0);
   }

   @deob.ObfuscatedName("ix.qz(Lrs;I)V")
   private static final void method7450(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      Statics.method16062(var2, arg0);
   }

   @deob.ObfuscatedName("iw.qg(Lem;Lrs;B)V")
   public static final void method7441(class425 arg0, class790 arg1) {
      class883 var2 = arg0.method5817(Statics.field10616, client.field2430);
      int var3 = arg1.field7203[--arg1.field7204];
      Point var4 = var2.method15422(arg0.field3470, arg0.field3405, arg0.field3471, var3, Statics.field6914);
      arg1.field7203[++arg1.field7204 - 1] = var4.x;
      arg1.field7203[++arg1.field7204 - 1] = var4.y;
   }

   @deob.ObfuscatedName("uz.qy(Lrs;B)V")
   private static final void method15363(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method7441(var2, arg0);
   }

   @deob.ObfuscatedName("ej.qd(I)J")
   public static final long method5793() {
      return (long)(++field7171 - 1) << 32 | 4294967295L;
   }

   @deob.ObfuscatedName("es.qq(Lrs;B)V")
   private static final void method5963(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      Statics.method8530(var2, arg0);
   }

   @deob.ObfuscatedName("no.qs(Lrs;B)V")
   private static final void method9955(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      Statics.method8530(var2, arg0);
   }

   @deob.ObfuscatedName("sr.qa(Lem;Lrs;B)V")
   private static final void method14445(class425 arg0, class790 arg1) {
      int var2 = arg1.field7203[--arg1.field7204];
      int var3 = arg1.field7203[--arg1.field7204] - 1;
      if (arg0.field3442 != 2) {
         throw new RuntimeException("");
      } else {
         class915 var4 = Statics.field93.method15857(arg0.field3498);
         if (arg0.field3566 == null) {
            arg0.field3566 = new class921(var4, false);
         }

         arg0.field3566.field9378 = method5793();
         if (var3 >= 0 && var3 < var4.field9298.length) {
            arg0.field3566.field9380[var3] = var2;
            client.method7309(arg0);
         } else {
            throw new RuntimeException("");
         }
      }
   }

   @deob.ObfuscatedName("pw.qe(Lrs;I)V")
   private static final void method10946(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method14445(var2, arg0);
   }

   @deob.ObfuscatedName("eq.qr(Lrs;B)V")
   private static final void method5939(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      method14445(var2, arg0);
   }

   @deob.ObfuscatedName("e.qm(Lem;Lrs;B)V")
   private static final void method5657(class425 arg0, class790 arg1) {
      int var2 = arg1.field7203[--arg1.field7204];
      int var3 = arg1.field7203[--arg1.field7204] - 1;
      int var4 = var3;
      if (arg0.field3442 != 6 && arg0.field3442 != 2) {
         throw new RuntimeException("");
      } else {
         class915 var5 = Statics.field93.method15857(arg0.field3498);
         if (arg0.field3566 == null) {
            arg0.field3566 = new class921(var5, arg0.field3442 == 6);
         }

         arg0.field3566.field9378 = method5793();
         if (var5.field9293 != null) {
            if (var3 < 0 || var3 >= var5.field9293.length) {
               throw new RuntimeException("");
            }

            var4 = var5.field9293[var3];
         }

         if (var5.field9289 != null && var4 >= 0 && var4 < var5.field9289.length) {
            arg0.field3566.field9379[var4] = (short)var2;
            client.method7309(arg0);
         } else {
            throw new RuntimeException("");
         }
      }
   }

   @deob.ObfuscatedName("sy.qo(Lrs;B)V")
   private static final void method14540(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method5657(var2, arg0);
   }

   @deob.ObfuscatedName("ou.qv(Lrs;I)V")
   private static final void method10470(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      method5657(var2, arg0);
   }

   @deob.ObfuscatedName("qn.qw(Lem;Lrs;I)V")
   private static final void method11266(class425 arg0, class790 arg1) {
      int var2 = arg1.field7203[--arg1.field7204];
      int var3 = arg1.field7203[--arg1.field7204] - 1;
      int var4 = var3;
      if (arg0.field3442 != 6 && arg0.field3442 != 2) {
         throw new RuntimeException("");
      } else {
         class915 var5 = Statics.field93.method15857(arg0.field3498);
         if (arg0.field3566 == null) {
            arg0.field3566 = new class921(var5, arg0.field3442 == 6);
         }

         arg0.field3566.field9378 = method5793();
         if (var5.field9294 != null) {
            if (var3 < 0 || var3 >= var5.field9294.length) {
               throw new RuntimeException("");
            }

            var4 = var5.field9294[var3];
         }

         if (var5.field9292 != null && var4 >= 0 && var4 < var5.field9292.length) {
            arg0.field3566.field9381[var4] = (short)var2;
            client.method7309(arg0);
         } else {
            throw new RuntimeException("");
         }
      }
   }

   @deob.ObfuscatedName("ju.rr(Lrs;B)V")
   private static final void method8027(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      method11266(var2, arg0);
   }

   @deob.ObfuscatedName("lu.ru(Lrs;I)V")
   private static final void method9119(class790 arg0) {
      class778 var1 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      class425 var2 = var1.field7147;
      method11266(var2, arg0);
   }

   @deob.ObfuscatedName("zh.rn(Lrs;B)V")
   private static final void method17067(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3398;
   }

   @deob.ObfuscatedName("wk.rj(Lrs;I)V")
   private static final void method15826(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3487;
   }

   @deob.ObfuscatedName("cn.rd(Lrs;B)V")
   private static final void method5044(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3405;
   }

   @deob.ObfuscatedName("mg.rv(Lrs;S)V")
   private static final void method9272(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3557;
   }

   @deob.ObfuscatedName("qk.rk(Lrs;B)V")
   private static final void method11207(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3419 ? 1 : 0;
   }

   @deob.ObfuscatedName("yh.rf(Lrs;I)V")
   private static final void method16103(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      class427 var3 = Statics.field844[var1 >>> 16];
      class425 var4 = client.method17098(var3, var2);
      arg0.field7203[++arg0.field7204 - 1] = var4 == null ? -1 : var4.field3465;
   }

   @deob.ObfuscatedName("fn.ri(Lrs;I)V")
   private static final void method6444(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3448;
   }

   @deob.ObfuscatedName("uu.rz(Lrs;I)V")
   private static final void method15287(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3400;
   }

   @deob.ObfuscatedName("ws.rw(Lrs;B)V")
   private static final void method15908(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3425;
   }

   @deob.ObfuscatedName("jq.rt(Lrs;I)V")
   private static final void method7986(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7226[++arg0.field7205 - 1] = var2.field3470;
   }

   @deob.ObfuscatedName("sb.ro(Lrs;I)V")
   private static final void method14253(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3426;
   }

   @deob.ObfuscatedName("qq.rm(Lrs;I)V")
   private static final void method11296(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3461;
   }

   @deob.ObfuscatedName("ke.ra(Lrs;S)V")
   private static final void method8275(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3454;
   }

   @deob.ObfuscatedName("mc.re(Lrs;B)V")
   private static final void method9229(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3394;
   }

   @deob.ObfuscatedName("lq.rx(Lrs;I)V")
   private static final void method9087(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3440;
   }

   @deob.ObfuscatedName("sr.rp(Lrs;I)V")
   private static final void method14447(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3415;
   }

   @deob.ObfuscatedName("on.rq(Lrs;B)V")
   private static final void method10348(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3430;
   }

   @deob.ObfuscatedName("ax.rh(Lrs;I)V")
   private static final void method4087(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3375;
   }

   @deob.ObfuscatedName("fy.rl(Lrs;I)V")
   private static final void method6545(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3447;
   }

   @deob.ObfuscatedName("eh.rs(Lrs;I)V")
   private static final void method5778(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3494;
   }

   @deob.ObfuscatedName("aac.rg(Lrs;I)V")
   private static final void method209(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3534;
   }

   @deob.ObfuscatedName("lu.rb(Lrs;I)V")
   private static final void method9120(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3442 == 1 ? var2.field3498 : -1;
   }

   @deob.ObfuscatedName("rc.ry(Lrs;I)V")
   private static final void method11598(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3468;
   }

   @deob.ObfuscatedName("kh.sq(Lrs;S)V")
   private static final void method8322(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      int var3 = -1;
      int var4 = -1;
      class436 var5 = var2.method5824(Statics.field8847);
      if (var5 != null) {
         var3 = var5.field3629;
         var4 = var5.field3625;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
      arg0.field7203[++arg0.field7204 - 1] = var4;
   }

   @deob.ObfuscatedName("cx.sg(Lrs;B)V")
   private static final void method5208(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field3468;
   }

   @deob.ObfuscatedName("fd.st(Lrs;B)V")
   private static final void method6232(class790 arg0) {
      class425 var1 = class425.method11190(arg0.field7203[--arg0.field7204]);
      if (var1.field3539 != -1) {
         arg0.field7203[++arg0.field7204 - 1] = var1.field3540;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("x.sz(Lrs;B)V")
   private static final void method15962(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class118 var2 = (class118)client.field2594.method15322((long)var1);
      if (var2 != null) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("nq.sm(Lrs;B)V")
   private static final void method9993(class790 arg0) {
      class425 var1 = class425.method11190(arg0.field7203[--arg0.field7204]);
      if (var1.field3551 == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         int var2 = var1.field3551.length;

         for(int var3 = 0; var3 < var1.field3551.length; ++var3) {
            if (var1.field3551[var3] == null) {
               var2 = var3;
               break;
            }
         }

         arg0.field7203[++arg0.field7204 - 1] = var2;
      }
   }

   @deob.ObfuscatedName("ap.sl(Lrs;I)V")
   private static final void method3993(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class118 var3 = (class118)client.field2594.method15322((long)var1);
      if (var3 != null && var3.field911 == var2) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("rj.si(Lrs;B)V")
   private static final void method11728(class790 arg0) {
      method3993(arg0);
   }

   @deob.ObfuscatedName("xt.su(Lrs;I)V")
   private static final void method16036(class790 arg0) {
      method3993(arg0);
   }

   @deob.ObfuscatedName("jt.sn(Lrs;I)V")
   private static final void method8012(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      arg0.field7203[++arg0.field7204 - 1] = client.method4871(var2).method911();
   }

   @deob.ObfuscatedName("tp.sd(Lrs;B)V")
   private static final void method14839(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      int var3 = arg0.field7203[--arg0.field7204];
      int var4 = var3 - 1;
      if (var2.field3488 != null && var4 < var2.field3488.length && var2.field3488[var4] != null) {
         arg0.field7226[++arg0.field7205 - 1] = var2.field3488[var4];
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("oh.sp(Lrs;I)V")
   private static final void method10282(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class425 var2 = class425.method11190(var1);
      if (var2.field3548 == null) {
         arg0.field7226[++arg0.field7205 - 1] = "";
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var2.field3548;
      }

   }

   @deob.ObfuscatedName("du.sy(Lrs;B)V")
   private static final void method5533(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      class419.method5635(var1);
   }

   @deob.ObfuscatedName("eo.sa(Lrs;I)V")
   private static final void method5926(class790 arg0) {
      arg0.field7204 -= 2;
      client.method11738(Statics.field5701, arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1]);
   }

   @deob.ObfuscatedName("aaf.ss(Lrs;I)V")
   private static final void method249(class790 arg0) {
      client.method9491(true);
   }

   @deob.ObfuscatedName("uh.sf(Lrs;I)V")
   private static final void method15164(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      int var2 = 0;
      if (class816.method14597(var1)) {
         var2 = class816.method5626(var1);
      }

      class109 var3 = class109.method15110(ClientProt.RESUME_P_COUNTDIALOG, client.field2463.field832);
      var3.field814.method1572(var2);
      client.field2463.method1408(var3);
   }

   @deob.ObfuscatedName("qy.sj(Lrs;S)V")
   private static final void method11456(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      class109 var2 = class109.method15110(ClientProt.RESUME_P_NAMEDIALOG, client.field2463.field832);
      var2.field814.method1568(var1.length() + 1);
      var2.field814.method1577(var1);
      client.field2463.method1408(var2);
   }

   @deob.ObfuscatedName("ot.so(Lrs;B)V")
   private static final void method10461(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      class109 var2 = class109.method15110(ClientProt.RESUME_P_STRINGDIALOG, client.field2463.field832);
      var2.field814.method1568(var1.length() + 1);
      var2.field814.method1577(var1);
      client.field2463.method1408(var2);
   }

   @deob.ObfuscatedName("kl.sw(Lrs;I)V")
   private static final void method8352(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      String var2 = (String)arg0.field7226[--arg0.field7205];
      client.method11701(var1, var2);
   }

   @deob.ObfuscatedName("afd.sr(Lrs;I)V")
   private static final void method2084(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class425 var4 = class425.method11190(var3);
      client.method9461(var4, var1, var2);
   }

   @deob.ObfuscatedName("pb.sc(Lrs;I)V")
   private static final void method10664(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class778 var3 = arg0.field7219 ? arg0.field7212 : arg0.field7223;
      client.method9461(var3.field7147, var1, var2);
   }

   @deob.ObfuscatedName("ms.sx(Lrs;I)V")
   private static final void method9458(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class109 var2 = class109.method15110(ClientProt.RESUME_P_OBJDIALOG, client.field2463.field832);
      var2.field814.method1569(var1);
      client.field2463.method1408(var2);
   }

   @deob.ObfuscatedName("lv.sb(Lrs;S)V")
   private static final void method9126(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      client.method14630(var1, new class118(var2, 3), (int[])null, true);
   }

   @deob.ObfuscatedName("gb.se(Lrs;I)V")
   private static final void method6578(class790 arg0) {
      client.method6643((String)arg0.field7226[--arg0.field7205]);
   }

   @deob.ObfuscatedName("ci.sk(Lrs;I)V")
   private static final void method4527(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      String var3 = (String)arg0.field7226[--arg0.field7205];
      if (var1 == 99) {
         class319.method10037(var3);
      } else if (var1 == 98) {
         class319.method6571(var3);
      } else {
         class419.method3849(var1, var2, "", "", "", var3);
      }

   }

   @deob.ObfuscatedName("dn.ta(Lrs;I)V")
   private static final void method5500(class790 arg0) {
      arg0.field7204 -= 11;
      class544[] var1 = class544.method4414();
      class526[] var2 = class526.method14659();
      class327.method1404(var1[arg0.field7203[arg0.field7204]], var2[arg0.field7203[arg0.field7204 + 1]], arg0.field7203[arg0.field7204 + 2], arg0.field7203[arg0.field7204 + 3], arg0.field7203[arg0.field7204 + 4], arg0.field7203[arg0.field7204 + 5], arg0.field7203[arg0.field7204 + 6], arg0.field7203[arg0.field7204 + 7], arg0.field7203[arg0.field7204 + 8], arg0.field7203[arg0.field7204 + 9], arg0.field7203[arg0.field7204 + 10]);
   }

   @deob.ObfuscatedName("pm.te(Lrs;S)V")
   private static final void method10791(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class109 var2 = class109.method15110(ClientProt.RESUME_P_HSLDIALOG, client.field2463.field832);
      var2.field814.method1569(var1);
      client.field2463.method1408(var2);
   }

   @deob.ObfuscatedName("abt.tt(Lrs;B)V")
   private static final void method741(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      class109 var2 = class109.method15110(ClientProt.RESUME_P_CLANFORUMQFCDIALOG, client.field2463.field832);
      var2.field814.method1568(var1.length() + 1);
      var2.field814.method1577(var1);
      client.field2463.method1408(var2);
   }

   @deob.ObfuscatedName("fy.ti(Lrs;I)V")
   private static final void method6539(class790 arg0) {
      arg0.field7204 -= 3;
      class677.method1342(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2], 255, 256);
   }

   @deob.ObfuscatedName("tk.tq(Lrs;B)V")
   private static final void method14783(class790 arg0) {
      class677.method5269(arg0.field7203[--arg0.field7204], 255, 50);
   }

   @deob.ObfuscatedName("fk.tv(Lrs;I)V")
   private static final void method6285(class790 arg0) {
      arg0.field7204 -= 2;
      class677.method5390(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], 255);
   }

   @deob.ObfuscatedName("fv.tj(Lrs;B)V")
   private static final void method6529(class790 arg0) {
      arg0.field7204 -= 4;
      class677.method1342(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2], arg0.field7203[arg0.field7204 + 3], 256);
   }

   @deob.ObfuscatedName("aaa.tg(Lrs;I)V")
   private static final void method76(class790 arg0) {
      arg0.field7204 -= 3;
      class677.method5269(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2]);
   }

   @deob.ObfuscatedName("ro.tr(Lrs;B)V")
   private static final void method14060(class790 arg0) {
      arg0.field7204 -= 3;
      class677.method5390(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2]);
   }

   @deob.ObfuscatedName("pq.tf(Lrs;I)V")
   private static final void method10859(class790 arg0) {
      arg0.field7204 -= 4;
      class677.method6230(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2], arg0.field7203[arg0.field7204 + 3], false, 256);
   }

   @deob.ObfuscatedName("mn.ty(Lrs;I)V")
   private static final void method9397(class790 arg0) {
      arg0.field7204 -= 4;
      class677.method6230(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2], arg0.field7203[arg0.field7204 + 3], true, 256);
   }

   @deob.ObfuscatedName("oc.tw(Lrs;I)V")
   private static final void method10141(class790 arg0) {
      arg0.field7204 -= 5;
      class677.method1342(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], arg0.field7203[arg0.field7204 + 2], arg0.field7203[arg0.field7204 + 3], arg0.field7203[arg0.field7204 + 4]);
   }

   @deob.ObfuscatedName("lp.to(Lrs;B)V")
   private static final void method9070(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2418;
   }

   @deob.ObfuscatedName("po.tx(Lrs;B)V")
   private static final void method10816(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method8037(var1, var2, false);
   }

   @deob.ObfuscatedName("yr.tn(Lrs;B)V")
   private static final void method16302(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method14689(var1, var2, false);
   }

   @deob.ObfuscatedName("mv.ts(Lrs;I)V")
   private static final void method9657(class790 arg0) {
      arg0.field7204 -= 2;
      class122 var1 = Statics.field9258.method15756(arg0.field7203[arg0.field7204]);
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = -1;

      for(int var4 = 0; var4 < var1.field927; ++var4) {
         if (var1.field926[var4] == var2) {
            var3 = var1.field925[var4];
            break;
         }
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("fn.th(Lrs;I)V")
   private static final void method6449(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2580[var1];
   }

   @deob.ObfuscatedName("kp.tu(Lrs;I)V")
   private static final void method8522(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2663[var1];
   }

   @deob.ObfuscatedName("q.tk(Lrs;B)V")
   private static final void method10995(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2490[var1];
   }

   @deob.ObfuscatedName("w.tm(Lrs;I)V")
   private static final void method15732(class790 arg0) {
      byte var1 = Statics.field5701.field1032;
      class584 var2 = Statics.field5701.method11602().field5446;
      class723 var3 = client.field2468.method9649();
      int var4 = ((int)var2.field5328 >> 9) + var3.field6676;
      int var5 = ((int)var2.field5331 >> 9) + var3.field6677;
      arg0.field7203[++arg0.field7204 - 1] = (var1 << 28) + (var4 << 14) + var5;
   }

   @deob.ObfuscatedName("fd.tz(Lrs;I)V")
   private static final void method6233(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = var1 >> 14 & 16383;
   }

   @deob.ObfuscatedName("of.tl(Lrs;B)V")
   private static final void method10197(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = var1 >> 28;
   }

   @deob.ObfuscatedName("fn.ul(Lrs;I)V")
   private static final void method6451(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2561 ? 1 : 0;
   }

   @deob.ObfuscatedName("nc.up(Lrs;B)V")
   private static final void method9721(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method2000(var1, var2, true);
   }

   @deob.ObfuscatedName("dq.ux(Lrs;I)V")
   private static final void method5510(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method14689(var1, var2, true);
   }

   @deob.ObfuscatedName("aja.uo(Lrs;I)V")
   private static final void method3352(class790 arg0) {
      if (client.field2562 >= 2) {
         arg0.field7203[++arg0.field7204 - 1] = client.field2562;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ais.uf(Lrs;I)V")
   private static final void method3326(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2479;
   }

   @deob.ObfuscatedName("dl.uk(Lrs;I)V")
   private static final void method5486(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8789.field8851;
   }

   @deob.ObfuscatedName("ef.uw(Lrs;I)V")
   private static final void method5746(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2597;
   }

   @deob.ObfuscatedName("on.uv(Lrs;I)V")
   private static final void method10343(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2598;
   }

   @deob.ObfuscatedName("qy.um(Lrs;I)V")
   private static final void method11457(class790 arg0) {
      if (client.field2563 >= 5 && client.field2563 <= 9) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("aaz.ua(Lrs;I)V")
   private static final void method460(class790 arg0) {
      if (client.field2563 >= 5 && client.field2563 <= 9) {
         arg0.field7203[++arg0.field7204 - 1] = client.field2563;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ol.ut(Lrs;B)V")
   private static final void method10320(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2722 ? 1 : 0;
   }

   @deob.ObfuscatedName("vv.ud(Lrs;B)V")
   private static final void method15682(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field5701.field1382;
   }

   @deob.ObfuscatedName("ajx.uj(Lrs;B)V")
   private static final void method3575(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field5701.field1386 != null && Statics.field5701.field1386.field6887 ? 1 : 0;
   }

   @deob.ObfuscatedName("qy.uz(Lrs;I)V")
   private static final void method11458(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2569 ? 1 : 0;
   }

   @deob.ObfuscatedName("gl.ur(Lrs;B)V")
   private static final void method6738(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = class72.method14625(var1, false);
   }

   @deob.ObfuscatedName("tk.uu(Lrs;B)V")
   private static final void method14781(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method14782(var1, var2, false, false);
   }

   @deob.ObfuscatedName("nq.ui(Lrs;I)V")
   private static final void method9997(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class72.method14782(var1, var2, true, false);
   }

   @deob.ObfuscatedName("fq.uy(Lrs;B)V")
   private static final void method6474(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field243.method9329();
   }

   @deob.ObfuscatedName("qz.uh(Lrs;B)V")
   private static final void method11466(class790 arg0) {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      int var5 = (var2 << 14) + var1;
      int var6 = (var3 << 28) + var5;
      int var7 = var4 + var6;
      arg0.field7203[++arg0.field7204 - 1] = var7;
   }

   @deob.ObfuscatedName("qr.ug(Lrs;B)V")
   private static final void method11311(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2393;
   }

   @deob.ObfuscatedName("j.un(Lrs;I)V")
   private static final void method7471(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class218.method15958();
   }

   @deob.ObfuscatedName("jb.us(Lrs;I)V")
   private static final void method7895(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = 0;
   }

   @deob.ObfuscatedName("fd.ue(Lrs;B)V")
   private static final void method6234(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2395 ? 1 : 0;
   }

   @deob.ObfuscatedName("gz.uc(Lrs;B)V")
   private static final void method6906(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field336.method1896();
   }

   @deob.ObfuscatedName("ke.vj(Lrs;I)V")
   private static final void method8273(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field336.method1897();
   }

   @deob.ObfuscatedName("un.vy(Lrs;I)V")
   private static final void method15217(class790 arg0) {
      method10130(Statics.method10915(), arg0);
   }

   @deob.ObfuscatedName("az.vi(Lrs;B)V")
   private static final void method4100(class790 arg0) {
      method10130(class987.method10370(), arg0);
   }

   @deob.ObfuscatedName("afs.ve(Lrs;I)V")
   private static final void method2212(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class987.field10501;
      arg0.field7203[++arg0.field7204 - 1] = class987.field10502;
   }

   @deob.ObfuscatedName("cg.vv(Lrs;B)V")
   private static final void method4477(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2421;
   }

   @deob.ObfuscatedName("gw.vb(Lrs;I)V")
   private static final void method6890(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field5701.field57.method6560() >> 3;
   }

   @deob.ObfuscatedName("wr.vp(Lrs;I)V")
   private static final void method15890(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (Statics.field5813 != null && Statics.field5813.equalsIgnoreCase(var1)) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("el.vq(Lrs;B)V")
   private static final void method5809(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field336.method1893() ? 1 : 0;
      arg0.field7203[++arg0.field7204 - 1] = Statics.field336.method1894() ? 1 : 0;
      arg0.field7203[++arg0.field7204 - 1] = Statics.field336.method1895() ? 1 : 0;
   }

   @deob.ObfuscatedName("dw.vs(Lrs;I)V")
   private static final void method5625(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2452;
   }

   @deob.ObfuscatedName("li.vt(Lrs;I)V")
   private static final void method8920(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2588 ? 1 : 0;
      arg0.field7226[++arg0.field7205 - 1] = client.field2592 == null ? "" : client.field2592;
      arg0.field7226[++arg0.field7205 - 1] = client.field2591 == null ? "" : client.field2591;
   }

   @deob.ObfuscatedName("vf.va(Lrs;B)V")
   private static final void method15440(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class871 var3 = Statics.field3086.method15214(var1);
      if (var3.field8830 != 's') {
      }

      arg0.field7226[++arg0.field7205 - 1] = var3.method15239(var2);
   }

   @deob.ObfuscatedName("ab.vm(Lrs;I)V")
   private static final void method487(class790 arg0) {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      class871 var5 = Statics.field3086.method15214(var3);
      if (var5.field8835 == var1 && var5.field8830 == var2) {
         if (var2 == 115) {
            arg0.field7226[++arg0.field7205 - 1] = var5.method15239(var4);
         } else {
            arg0.field7203[++arg0.field7204 - 1] = var5.method15235(var4);
         }

      } else {
         throw new RuntimeException(var3 + " " + var4);
      }
   }

   @deob.ObfuscatedName("ym.vh(Lrs;I)V")
   private static final void method16247(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      if (var2 == -1) {
         throw new RuntimeException();
      } else {
         class871 var4 = Statics.field3086.method15214(var2);
         if (var4.field8830 != var1) {
            throw new RuntimeException();
         } else {
            arg0.field7203[++arg0.field7204 - 1] = var4.method15256(var3) ? 1 : 0;
         }
      }
   }

   @deob.ObfuscatedName("rg.vc(Lrs;I)V")
   private static final void method11675(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      String var2 = (String)arg0.field7226[--arg0.field7205];
      if (var1 == -1) {
         throw new RuntimeException();
      } else {
         class871 var3 = Statics.field3086.method15214(var1);
         if (var3.field8830 != 's') {
            throw new RuntimeException();
         } else {
            arg0.field7203[++arg0.field7204 - 1] = var3.method15256(var2) ? 1 : 0;
         }
      }
   }

   @deob.ObfuscatedName("ft.vz(Lrs;B)V")
   private static final void method6518(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class871 var2 = Statics.field3086.method15214(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.method15243();
   }

   @deob.ObfuscatedName("fj.vu(Lrs;I)V")
   private static final void method6269(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      if (var2 == -1) {
         throw new RuntimeException();
      } else {
         class871 var4 = Statics.field3086.method15214(var2);
         if (var4.field8830 != var1) {
            throw new RuntimeException();
         } else {
            int[] var5 = var4.method15242(var3);
            int var6 = 0;
            if (var5 != null) {
               var6 = var5.length;
            }

            arg0.field7203[++arg0.field7204 - 1] = var6;
         }
      }
   }

   @deob.ObfuscatedName("sg.vf(Lrs;I)V")
   private static final void method14305(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      String var2 = (String)arg0.field7226[--arg0.field7205];
      if (var1 == -1) {
         throw new RuntimeException();
      } else {
         class871 var3 = Statics.field3086.method15214(var1);
         if (var3.field8830 != 's') {
            throw new RuntimeException();
         } else {
            int[] var4 = var3.method15242(var2);
            int var5 = 0;
            if (var4 != null) {
               var5 = var4.length;
            }

            arg0.field7203[++arg0.field7204 - 1] = var5;
         }
      }
   }

   @deob.ObfuscatedName("gq.vg(Lrs;I)V")
   private static final void method6856(class790 arg0) {
      arg0.field7204 -= 5;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      int var5 = arg0.field7203[arg0.field7204 + 4];
      if (var3 == -1) {
         throw new RuntimeException();
      } else {
         class871 var6 = Statics.field3086.method15214(var3);
         if (var6.field8835 != var2) {
            throw new RuntimeException();
         } else if (var6.field8830 != var1) {
            throw new RuntimeException();
         } else {
            int[] var7 = var6.method15242(var4);
            if (var5 >= 0 && var7 != null && var7.length > var5) {
               arg0.field7203[++arg0.field7204 - 1] = var7[var5];
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   @deob.ObfuscatedName("ez.vx(Lrs;I)V")
   private static final void method6138(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      String var4 = (String)arg0.field7226[--arg0.field7205];
      if (var2 == -1) {
         throw new RuntimeException();
      } else {
         class871 var5 = Statics.field3086.method15214(var2);
         if (var5.field8835 != var1) {
            throw new RuntimeException();
         } else if (var5.field8830 != 's') {
            throw new RuntimeException();
         } else {
            int[] var6 = var5.method15242(var4);
            if (var3 >= 0 && var6 != null && var6.length > var3) {
               arg0.field7203[++arg0.field7204 - 1] = var6[var3];
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   @deob.ObfuscatedName("iz.vo(Lrs;B)V")
   private static final void method7457(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      class109 var2 = class109.method15110(ClientProt.SEND_EMAIL_VALIDATION_CODE, client.field2462.field832);
      var2.field814.method1568(class124.method1229(var1));
      var2.field814.method1577(var1);
      client.field2462.method1408(var2);
   }

   @deob.ObfuscatedName("br.vd(Lrs;I)V")
   private static final void method4215(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      String var2 = (String)arg0.field7226[--arg0.field7205];
      class109 var3 = class109.method15110(ClientProt.CHANGE_EMAIL_ADDRESS, client.field2462.field832);
      var3.field814.method1569(class124.method1229(var1) + class124.method1229(var2));
      var3.field814.method1577(var1);
      var3.field814.method1577(var2);
      client.field2462.method1408(var3);
   }

   @deob.ObfuscatedName("gb.vw(Lrs;I)V")
   private static final void method6579(class790 arg0) {
      --arg0.field7205;
      arg0.field7204 -= 3;
      String var1 = (String)arg0.field7226[arg0.field7205];
      boolean var2 = arg0.field7203[arg0.field7204] == 1;
      boolean var3 = arg0.field7203[arg0.field7204 + 1] == 1;
      boolean var4 = arg0.field7203[arg0.field7204 + 2] == 1;
      class109 var5 = class109.method15110(ClientProt.ADD_NEW_EMAIL_ADDRESS, client.field2462.field832);
      var5.field814.method1569(class124.method1229(var1) + 1);
      var5.field814.method1577(var1);
      int var6 = 0;
      if (var2) {
         var6 |= 1;
      }

      if (var3) {
         var6 |= 2;
      }

      if (var4) {
         var6 |= 4;
      }

      var5.field814.method1568(var6);
      client.field2462.method1408(var5);
   }

   @deob.ObfuscatedName("uu.vn(Lrs;B)V")
   private static final void method15288(class790 arg0) {
      if (client.field2695 == 0) {
         arg0.field7203[++arg0.field7204 - 1] = -2;
      } else if (client.field2695 == 1) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = client.field2694;
      }

   }

   @deob.ObfuscatedName("cg.vr(Lrs;I)V")
   private static final void method4481(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 == 2 && var1 < client.field2694) {
         class960 var2 = client.field2697[var1];
         arg0.field7226[++arg0.field7205 - 1] = var2.field9601;
         if (var2.field9599 != null) {
            arg0.field7226[++arg0.field7205 - 1] = var2.field9599;
         } else {
            arg0.field7226[++arg0.field7205 - 1] = "";
         }
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("aip.vl(Lrs;I)V")
   private static final void method3243(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 == 2 && var1 < client.field2694) {
         arg0.field7203[++arg0.field7204 - 1] = client.field2697[var1].field9605;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("pg.vk(Lrs;I)V")
   private static final void method10720(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 == 2 && var1 < client.field2694) {
         arg0.field7203[++arg0.field7204 - 1] = client.field2697[var1].field9598;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ef.wl(Lrs;I)V")
   private static final void method5747(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 == 2 && var1 < client.field2694) {
         arg0.field7203[++arg0.field7204 - 1] = client.field2697[var1].field9604;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ls.wm(Lrs;I)V")
   private static final void method9104(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      client.method15815(var1);
   }

   @deob.ObfuscatedName("dt.wq(Lrs;B)V")
   private static final void method5524(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      Statics.method15142(var1, false);
   }

   @deob.ObfuscatedName("po.ws(Lrs;I)V")
   private static final void method10817(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (var1.startsWith(class582.method5969(0)) || var1.startsWith(class582.method5969(1))) {
         var1 = var1.substring(7);
      }

      arg0.field7203[++arg0.field7204 - 1] = client.method6111(var1) ? 1 : 0;
   }

   @deob.ObfuscatedName("ic.wy(Lrs;B)V")
   private static final void method7304(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 == 2 && var1 < client.field2694) {
         arg0.field7226[++arg0.field7205 - 1] = client.field2697[var1].field9600;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("wm.wn(Lrs;I)V")
   private static final void method15863(class790 arg0) {
      if (client.field2578 != null) {
         arg0.field7226[++arg0.field7205 - 1] = class808.method7432(client.field2578);
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("qe.wt(Lrs;B)V")
   private static final void method11100(class790 arg0) {
      if (client.field2578 != null) {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field6939;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("rl.wz(Lrs;I)V")
   private static final void method14038(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2578 != null && var1 < Statics.field6939) {
         arg0.field7226[++arg0.field7205 - 1] = Statics.field3105[var1].field1799;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("sy.wb(Lrs;I)V")
   private static final void method14538(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2578 != null && var1 < Statics.field6939) {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field3105[var1].field1800;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("aid.wr(Lrs;I)V")
   private static final void method3088(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field2757;
   }

   @deob.ObfuscatedName("iv.we(Lrs;I)V")
   private static final void method7429(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      Statics.method15600(var1);
   }

   @deob.ObfuscatedName("x.wg(Lrs;B)V")
   private static final void method15960(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8884;
   }

   @deob.ObfuscatedName("aet.wx(Lrs;I)V")
   private static final void method1936(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      Statics.method11491(var1);
   }

   @deob.ObfuscatedName("f.wv(Lrs;S)V")
   private static final void method6154(class790 arg0) {
      client.method5382();
   }

   @deob.ObfuscatedName("nk.wa(Lrs;S)V")
   private static final void method9872(class790 arg0) {
      if (client.field2695 == 0) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = client.field2699;
      }

   }

   @deob.ObfuscatedName("aiu.wp(Lrs;I)V")
   private static final void method3350(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 != 0 && var1 < client.field2699) {
         class906 var2 = client.field2701[var1];
         arg0.field7226[++arg0.field7205 - 1] = var2.field9244;
         if (var2.field9245 != null) {
            arg0.field7226[++arg0.field7205 - 1] = var2.field9245;
         } else {
            arg0.field7226[++arg0.field7205 - 1] = "";
         }
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("cc.wk(Lrs;I)V")
   private static final void method4454(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (var1.startsWith(class582.method5969(0)) || var1.startsWith(class582.method5969(1))) {
         var1 = var1.substring(7);
      }

      arg0.field7203[++arg0.field7204 - 1] = client.method14784(var1) ? 1 : 0;
   }

   @deob.ObfuscatedName("aw.wu(Lrs;B)V")
   private static final void method4065(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (Statics.field3105 != null && var1 < Statics.field6939 && Statics.field3105[var1].field1802.equalsIgnoreCase(Statics.field5701.field1381)) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("rf.wf(Lrs;I)V")
   private static final void method11657(class790 arg0) {
      if (client.field2427 != null) {
         arg0.field7226[++arg0.field7205 - 1] = client.field2427;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("ls.wd(Lrs;I)V")
   private static final void method9103(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2578 != null && var1 < Statics.field6939) {
         arg0.field7226[++arg0.field7205 - 1] = Statics.field3105[var1].field1803;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("wr.wj(Lrs;B)V")
   private static final void method15892(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 == 2 && var1 >= 0 && var1 < client.field2694) {
         arg0.field7203[++arg0.field7204 - 1] = client.field2697[var1].field9603;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("t.wh(Lrs;I)V")
   private static final void method14587(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (var1.startsWith(class582.method5969(0)) || var1.startsWith(class582.method5969(1))) {
         var1 = var1.substring(7);
      }

      arg0.field7203[++arg0.field7204 - 1] = client.method2052(var1);
   }

   @deob.ObfuscatedName("cu.xt(Lrs;B)V")
   private static final void method5182(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (var1.startsWith(class582.method5969(0)) || var1.startsWith(class582.method5969(1))) {
         var1 = var1.substring(7);
      }

      arg0.field7203[++arg0.field7204 - 1] = client.method15557(var1);
   }

   @deob.ObfuscatedName("mu.xu(Lrs;B)V")
   private static final void method9499(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field182;
   }

   @deob.ObfuscatedName("mk.xr(Lrs;B)V")
   private static final void method9339(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      Statics.method15142(var1, true);
   }

   @deob.ObfuscatedName("mo.xj(Lrs;I)V")
   private static final void method9410(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2701[var1].field9243 ? 1 : 0;
   }

   @deob.ObfuscatedName("li.xv(Lrs;B)V")
   private static final void method8922(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2578 != null && var1 < Statics.field6939) {
         arg0.field7226[++arg0.field7205 - 1] = Statics.field3105[var1].field1802;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("cn.xo(Lrs;I)V")
   private static final void method5045(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2695 != 0 && var1 < client.field2699) {
         arg0.field7226[++arg0.field7205 - 1] = client.field2701[var1].field9244;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("nd.xc(Lrs;I)V")
   private static final void method9725(class790 arg0) {
      if (Statics.field10534 != null) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
         arg0.field7214 = Statics.field10534;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("rk.xq(Lrs;I)V")
   private static final void method11734(class790 arg0) {
      if (Statics.field9397 != null) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
         arg0.field7214 = Statics.field9397;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("rq.xg(Lrs;I)V")
   private static final void method14129(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = arg0.field7214.field3912;
   }

   @deob.ObfuscatedName("ne.xe(Lrs;I)V")
   private static final void method9731(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3914 ? 1 : 0;
   }

   @deob.ObfuscatedName("su.xx(Lrs;B)V")
   private static final void method14494(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3926;
   }

   @deob.ObfuscatedName("kp.xl(Lrs;I)V")
   private static final void method8527(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3929;
   }

   @deob.ObfuscatedName("ta.xy(Lrs;I)V")
   private static final void method14593(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3917;
   }

   @deob.ObfuscatedName("wl.xi(Lrs;I)V")
   private static final void method15842(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3933;
   }

   @deob.ObfuscatedName("gf.xz(Lrs;I)V")
   private static final void method6626(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3911;
   }

   @deob.ObfuscatedName("on.xk(Lrs;I)V")
   private static final void method10345(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = arg0.field7214.field3907[var1];
   }

   @deob.ObfuscatedName("ef.xn(Lrs;I)V")
   private static final void method5748(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3921[var1];
   }

   @deob.ObfuscatedName("oi.xd(Lrs;S)V")
   private static final void method10296(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3919;
   }

   @deob.ObfuscatedName("fr.xp(Lrs;B)V")
   private static final void method6491(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = arg0.field7214.field3930[var1];
   }

   @deob.ObfuscatedName("qs.xs(Lrs;I)V")
   private static final void method11331(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.method6841(var1, var2, var3);
   }

   @deob.ObfuscatedName("aax.xm(Lrs;I)V")
   private static final void method452(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3920;
   }

   @deob.ObfuscatedName("fu.xb(Lrs;B)V")
   private static final void method6524(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3918;
   }

   @deob.ObfuscatedName("pb.xa(Lrs;B)V")
   private static final void method10663(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.method6821((String)arg0.field7226[--arg0.field7205]);
   }

   @deob.ObfuscatedName("kz.xh(Lrs;I)V")
   private static final void method8687(class790 arg0) {
      arg0.field7203[arg0.field7204 - 1] = arg0.field7214.method6800()[arg0.field7203[arg0.field7204 - 1]];
   }

   @deob.ObfuscatedName("rw.xw(Lrs;B)V")
   private static final void method14182(class790 arg0) {
      client.method16090(arg0.field7203[--arg0.field7204]);
   }

   @deob.ObfuscatedName("afx.yd(Lrs;I)V")
   private static final void method2260(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7214.field3924[var1];
   }

   @deob.ObfuscatedName("na.yr(Lrs;I)V")
   private static final void method9714(class790 arg0) {
      if (Statics.field3822 != null) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
         arg0.field7215 = Statics.field3822;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ph.yo(Lrs;I)V")
   private static final void method10726(class790 arg0) {
      if (Statics.field4336 != null) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
         arg0.field7215 = Statics.field4336;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("aei.yh(Lrs;B)V")
   private static final void method1525(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = arg0.field7215.field620;
   }

   @deob.ObfuscatedName("gj.ye(Lrs;I)V")
   private static final void method6645(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7215.field627;
   }

   @deob.ObfuscatedName("ob.yg(Lrs;I)V")
   private static final void method10132(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7215.field626;
   }

   @deob.ObfuscatedName("p.yz(Lrs;I)V")
   private static final void method10654(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7215.field622;
   }

   @deob.ObfuscatedName("uz.yy(Lrs;I)V")
   private static final void method15367(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = arg0.field7215.field621[var1].field3851;
   }

   @deob.ObfuscatedName("lp.ya(Lrs;I)V")
   private static final void method9071(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7215.field621[var1].field3852;
   }

   @deob.ObfuscatedName("acp.yb(Lrs;I)V")
   private static final void method1071(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7215.field621[var1].field3853;
   }

   @deob.ObfuscatedName("op.yt(Lrs;B)V")
   private static final void method10372(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      client.method14682(Statics.field4336 == arg0.field7215, var1);
   }

   @deob.ObfuscatedName("fj.yv(Lrs;I)V")
   private static final void method6266(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7215.method1143((String)arg0.field7226[--arg0.field7205]);
   }

   @deob.ObfuscatedName("ci.yp(Lrs;I)V")
   private static final void method4530(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field3804 != null ? 1 : 0;
   }

   @deob.ObfuscatedName("ag.yj(Lrs;I)V")
   private static final void method2286(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2681[var1].method9168();
   }

   @deob.ObfuscatedName("od.ym(Lrs;I)V")
   private static final void method10168(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2681[var1].field5749;
   }

   @deob.ObfuscatedName("lx.yc(Lrs;I)V")
   private static final void method9162(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2681[var1].field5750;
   }

   @deob.ObfuscatedName("gb.yl(Lrs;B)V")
   private static final void method6580(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2681[var1].field5752;
   }

   @deob.ObfuscatedName("fb.yk(Lrs;I)V")
   private static final void method6219(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2681[var1].field5751;
   }

   @deob.ObfuscatedName("am.yu(Lrs;B)V")
   private static final void method3945(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = client.field2681[var1].field5753;
   }

   @deob.ObfuscatedName("qe.yi(Lrs;I)V")
   private static final void method11101(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int var2 = client.field2681[var1].method9167();
      arg0.field7203[++arg0.field7204 - 1] = var2 == 0 ? 1 : 0;
   }

   @deob.ObfuscatedName("aed.yn(Lrs;B)V")
   private static final void method1497(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int var2 = client.field2681[var1].method9167();
      arg0.field7203[++arg0.field7204 - 1] = var2 == 2 ? 1 : 0;
   }

   @deob.ObfuscatedName("al.yw(Lrs;S)V")
   private static final void method3852(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int var2 = client.field2681[var1].method9167();
      arg0.field7203[++arg0.field7204 - 1] = var2 == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("nx.ys(Lrs;B)V")
   private static final void method10059(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 + var2;
   }

   @deob.ObfuscatedName("im.yf(Lrs;B)V")
   private static final void method7375(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 - var2;
   }

   @deob.ObfuscatedName("fe.zk(Lrs;I)V")
   private static final void method6237(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 * var2;
   }

   @deob.ObfuscatedName("qe.zf(Lrs;I)V")
   private static final void method11102(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 / var2;
   }

   @deob.ObfuscatedName("fv.zy(Lrs;I)V")
   private static final void method6531(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = (int)(Math.random() * (double)(var1 + 1));
   }

   @deob.ObfuscatedName("qc.zg(Lrs;I)V")
   private static final void method11082(class790 arg0) {
      arg0.field7204 -= 5;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      int var5 = arg0.field7203[arg0.field7204 + 4];
      arg0.field7203[++arg0.field7204 - 1] = (var2 - var1) * (var5 - var3) / (var4 - var3) + var1;
   }

   @deob.ObfuscatedName("pn.zm(Lrs;I)V")
   private static final void method10810(class790 arg0) {
      arg0.field7204 -= 2;
      long var1 = (long)arg0.field7203[arg0.field7204];
      long var3 = (long)arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = (int)(var1 * var3 / 100L + var1);
   }

   @deob.ObfuscatedName("vq.zs(Lrs;I)V")
   private static final void method15583(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 | 1 << var2;
   }

   @deob.ObfuscatedName("pw.ze(Lrs;I)V")
   private static final void method10942(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 & -1 - (1 << var2);
   }

   @deob.ObfuscatedName("ec.zx(Lrs;I)V")
   private static final void method5680(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = (var1 & 1 << var2) != 0 ? 1 : 0;
   }

   @deob.ObfuscatedName("jw.zt(Lrs;I)V")
   private static final void method8034(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 % var2;
   }

   @deob.ObfuscatedName("eg.zz(Lrs;B)V")
   private static final void method5767(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (var1 == 0) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = (int)Math.pow((double)var1, (double)var2);
      }

   }

   @deob.ObfuscatedName("f.zc(Lrs;I)V")
   private static final void method6155(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (var1 == 0) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else if (var2 == 0) {
         arg0.field7203[++arg0.field7204 - 1] = Integer.MAX_VALUE;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = (int)Math.pow((double)var1, 1.0D / (double)var2);
      }

   }

   @deob.ObfuscatedName("ci.zo(Lrs;I)V")
   private static final void method4528(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 | var2;
   }

   @deob.ObfuscatedName("wi.or(Lrs;B)V")
   private static final void method15814(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 < var2 ? var1 : var2;
   }

   @deob.ObfuscatedName("op.zd(Lrs;I)V")
   private static final void method10365(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = var1 > var2 ? var1 : var2;
   }

   @deob.ObfuscatedName("yr.zh(Lrs;B)V")
   private static final void method16304(class790 arg0) {
      arg0.field7204 -= 3;
      long var1 = (long)arg0.field7203[arg0.field7204];
      long var3 = (long)arg0.field7203[arg0.field7204 + 1];
      long var5 = (long)arg0.field7203[arg0.field7204 + 2];
      arg0.field7203[++arg0.field7204 - 1] = (int)(var1 * var5 / var3);
   }

   @deob.ObfuscatedName("lw.zb(Lrs;I)V")
   private static final void method9133(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (var1 > 700 || var2 > 700) {
         arg0.field7203[++arg0.field7204 - 1] = 256;
      }

      double var3 = (Math.random() * (double)(var1 + var2) - (double)var1 + 800.0D) / 100.0D;
      arg0.field7203[++arg0.field7204 - 1] = (int)(Math.pow(2.0D, var3) + 0.5D);
   }

   @deob.ObfuscatedName("s.zr(Lrs;B)V")
   private static final void method14232(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field7263[Statics.method4006(var1) & 65535];
   }

   @deob.ObfuscatedName("lb.zw(Lrs;I)V")
   private static final void method8763(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = ~var1;
   }

   @deob.ObfuscatedName("zi.zv(Lrs;I)V")
   private static final void method17068(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      int var2 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = var1 + var2;
   }

   @deob.ObfuscatedName("vi.zn(Lrs;B)V")
   private static final void method15482(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      arg0.field7226[++arg0.field7205 - 1] = var1 + var2;
   }

   @deob.ObfuscatedName("iq.zi(Lrs;I)V")
   private static final void method7392(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = class582.method7399(var1);
   }

   @deob.ObfuscatedName("rx.zq(Lrs;I)V")
   private static final void method14196(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7226[++arg0.field7205 - 1] = var1.toLowerCase();
   }

   @deob.ObfuscatedName("lx.zj(Lrs;I)V")
   private static final void method9164(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = class902.method5745(class902.method9394(arg0.field7203[--arg0.field7204]), Statics.field243.method9329());
   }

   @deob.ObfuscatedName("ky.za(Lrs;I)V")
   private static final void method8683(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      if (Statics.field5701.field1386 != null && Statics.field5701.field1386.field6887) {
         arg0.field7226[++arg0.field7205 - 1] = var2;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var1;
      }

   }

   @deob.ObfuscatedName("fr.aah(Lrs;I)V")
   private static final void method6487(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = Integer.toString(var1);
   }

   @deob.ObfuscatedName("nq.aaa(Lrs;B)V")
   private static final void method9994(class790 arg0) {
      arg0.field7205 -= 2;
      arg0.field7203[++arg0.field7204 - 1] = class804.method8354((String)arg0.field7226[arg0.field7205], (String)arg0.field7226[arg0.field7205 + 1], Statics.field243);
   }

   @deob.ObfuscatedName("er.aam(Lrs;I)V")
   private static final void method5957(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7204 -= 2;
      int var2 = arg0.field7203[arg0.field7204];
      int var3 = arg0.field7203[arg0.field7204 + 1];
      class883 var4 = class883.method2003(Statics.field4891, var3, 0);
      arg0.field7203[++arg0.field7204 - 1] = var4.method15406(var1, var2, Statics.field6914);
   }

   @deob.ObfuscatedName("z.aae(Lrs;I)V")
   private static final void method17038(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7204 -= 2;
      int var2 = arg0.field7203[arg0.field7204];
      int var3 = arg0.field7203[arg0.field7204 + 1];
      class883 var4 = class883.method2003(Statics.field4891, var3, 0);
      arg0.field7203[++arg0.field7204 - 1] = var4.method15388(var1, var2, Statics.field6914);
   }

   @deob.ObfuscatedName("kz.aaj(Lrs;I)V")
   private static final void method8686(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7226[++arg0.field7205 - 1] = Statics.method9135(var1);
   }

   @deob.ObfuscatedName("pk.aao(Lrs;I)V")
   private static final void method10743(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      int var2 = arg0.field7203[--arg0.field7204];
      if (var2 == -1) {
         throw new RuntimeException("");
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var1 + (char)var2;
      }
   }

   @deob.ObfuscatedName("zq.aaw(Lrs;S)V")
   private static final void method17093(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = class816.method2193((char)var1) ? 1 : 0;
   }

   @deob.ObfuscatedName("rk.aag(Lrs;I)V")
   private static final void method11739(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = class816.method5270((char)var1) ? 1 : 0;
   }

   @deob.ObfuscatedName("kh.aaf(Lrs;S)V")
   private static final void method8323(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = class816.method9128((char)var1) ? 1 : 0;
   }

   @deob.ObfuscatedName("u.aad(Lrs;I)V")
   private static final void method15062(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (var1 != null) {
         arg0.field7203[++arg0.field7204 - 1] = var1.length();
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("afd.aai(Lrs;I)V")
   private static final void method2083(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7204 -= 2;
      int var2 = arg0.field7203[arg0.field7204];
      int var3 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7226[++arg0.field7205 - 1] = var1.substring(var2, var3);
   }

   @deob.ObfuscatedName("df.aar(Lrs;B)V")
   private static final void method5384(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      StringBuilder var2 = new StringBuilder(var1.length());
      boolean var3 = false;

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if (var5 == '<') {
            var3 = true;
         } else if (var5 == '>') {
            var3 = false;
         } else if (!var3) {
            var2.append(var5);
         }
      }

      arg0.field7226[++arg0.field7205 - 1] = var2.toString();
   }

   @deob.ObfuscatedName("xa.aay(Lrs;I)V")
   private static final void method15970(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      int var3 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = var1.indexOf(var2, var3);
   }

   @deob.ObfuscatedName("dq.aax(Lrs;I)V")
   private static final void method5511(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Character.toLowerCase((char)var1);
   }

   @deob.ObfuscatedName("nm.aas(Lrs;B)V")
   private static final void method9885(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Character.toUpperCase((char)var1);
   }

   @deob.ObfuscatedName("pt.aaz(Lrs;I)V")
   private static final void method10917(class790 arg0) {
      boolean var1 = arg0.field7203[--arg0.field7204] != 0;
      int var2 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = class804.method6440((long)var2, 0, var1, Statics.field243);
   }

   @deob.ObfuscatedName("rh.aaq(Lrs;I)V")
   private static final void method11692(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      int var2 = arg0.field7203[--arg0.field7204];
      class883 var3 = class883.method2003(Statics.field4891, var2, 0);
      arg0.field7203[++arg0.field7204 - 1] = var3.method15393(var1, Statics.field6914);
   }

   @deob.ObfuscatedName("mu.aan(Lrs;I)V")
   private static final void method9500(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = class902.method4442((long)arg0.field7203[--arg0.field7204] * 60000L, Statics.field243.method9329(), true) + " UTC";
   }

   @deob.ObfuscatedName("t.aav(Lrs;I)V")
   private static final void method14585(class790 arg0) {
      long var1 = arg0.field7207[--arg0.field7208];
      arg0.field7226[++arg0.field7205 - 1] = var1 == -1L ? "" : Long.toString(var1, 36).toUpperCase();
   }

   @deob.ObfuscatedName("qr.aap(Lrs;I)V")
   private static final void method11315(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = Statics.field4196.method15540(var1).field9158;
   }

   @deob.ObfuscatedName("aed.aac(Lrs;B)V")
   private static final void method1496(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class899 var3 = Statics.field4196.method15540(var1);
      if (var2 >= 1 && var2 <= 5 && var3.field9147[var2 - 1] != null) {
         arg0.field7226[++arg0.field7205 - 1] = var3.field9147[var2 - 1];
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("pk.aat(Lrs;B)V")
   private static final void method10744(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class899 var3 = Statics.field4196.method15540(var1);
      if (var2 >= 1 && var2 <= 5 && var3.field9148[var2 - 1] != null) {
         arg0.field7226[++arg0.field7205 - 1] = var3.field9148[var2 - 1];
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("jf.aak(Lrs;I)V")
   private static final void method7932(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4196.method15540(var1).field9176;
   }

   @deob.ObfuscatedName("ke.abv(Lrs;I)V")
   private static final void method8274(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4196.method15540(var1).field9164 == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("uo.abr(Lrs;B)V")
   private static final void method15219(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class899 var2 = Statics.field4196.method15540(var1);
      if (var2.field9173 == -1 && var2.field9172 >= 0) {
         arg0.field7203[++arg0.field7204 - 1] = var2.field9172;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var1;
      }

   }

   @deob.ObfuscatedName("cz.abd(Lrs;I)V")
   private static final void method5271(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class899 var2 = Statics.field4196.method15540(var1);
      if (var2.field9173 >= 0 && var2.field9172 >= 0) {
         arg0.field7203[++arg0.field7204 - 1] = var2.field9172;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var1;
      }

   }

   @deob.ObfuscatedName("pd.abs(Lrs;I)V")
   private static final void method10699(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4196.method15540(var1).field9151;
   }

   @deob.ObfuscatedName("ny.abh(Lrs;B)V")
   private static final void method10103(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4196.method15540(var1).field9152;
   }

   @deob.ObfuscatedName("fb.abk(Lrs;I)V")
   private static final void method6220(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4196.method15540(var1).field9153;
   }

   @deob.ObfuscatedName("fs.abj(Lrs;B)V")
   private static final void method6502(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4196.method15540(var1).field9130 ? 1 : 0;
   }

   @deob.ObfuscatedName("eh.abe(Lrs;I)V")
   private static final void method5779(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1] - 1;
      class899 var3 = Statics.field4196.method15540(var1);
      arg0.field7203[++arg0.field7204 - 1] = var3.method15621(var2);
   }

   @deob.ObfuscatedName("py.aba(Lrs;I)V")
   private static final void method10954(class790 arg0) {
      if (Statics.field3776 != null && Statics.field5278 < Statics.field6134) {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field3776[++Statics.field5278 - 1] & 65535;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      }

   }

   @deob.ObfuscatedName("on.abn(Lrs;B)V")
   private static final void method10344(class790 arg0) {
      Statics.field5278 = 0;
   }

   @deob.ObfuscatedName("vi.abo(Lrs;I)V")
   private static final void method15488(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4196.method15540(var1).field9144;
   }

   @deob.ObfuscatedName("aec.abp(Lrs;B)V")
   private static final void method1492(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7204 -= 3;
      int var2 = arg0.field7203[arg0.field7204];
      int var3 = arg0.field7203[arg0.field7204 + 1];
      int var4 = arg0.field7203[arg0.field7204 + 2];
      Statics.method3115(var1, var2 == 1, var3, var4);
      arg0.field7203[++arg0.field7204 - 1] = Statics.field6134;
   }

   @deob.ObfuscatedName("tk.abg(Lrs;I)V")
   private static final void method14786(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class899 var2 = Statics.field4196.method15540(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field9189 ? 1 : 0;
   }

   @deob.ObfuscatedName("pi.abt(Lrs;B)V")
   private static final void method10735(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class899 var2 = Statics.field4196.method15540(var1);
      int var3;
      if (var2.field9189) {
         var3 = var2.field9120;
      } else if (var2.field9130) {
         var3 = Statics.field3302.field7253;
      } else {
         var3 = Statics.field3302.field7252;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("pg.abf(Lrs;B)V")
   private static final void method10718(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class923 var3 = Statics.field5946.method15930(var2);
      if (var3.method15884()) {
         arg0.field7226[++arg0.field7205 - 1] = Statics.field93.method15857(var1).method15777(var2, var3.field9389);
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field93.method15857(var1).method15776(var2, var3.field9388);
      }

   }

   @deob.ObfuscatedName("gc.abw(Lrs;I)V")
   private static final void method6595(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class923 var3 = Statics.field5946.method15930(var2);
      if (var3.method15884()) {
         arg0.field7226[++arg0.field7205 - 1] = client.field2468.method9636().method14651(var1).method14855(var2, var3.field9389);
      } else {
         arg0.field7203[++arg0.field7204 - 1] = client.field2468.method9636().method14651(var1).method14888(var2, var3.field9388);
      }

   }

   @deob.ObfuscatedName("s.abz(Lrs;B)V")
   private static final void method14235(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class923 var3 = Statics.field5946.method15930(var2);
      if (var3.method15884()) {
         arg0.field7226[++arg0.field7205 - 1] = Statics.field5700.method15709(var1).method3472(var2, var3.field9389);
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field5700.method15709(var1).method3471(var2, var3.field9388);
      }

   }

   @deob.ObfuscatedName("mk.abb(Lrs;I)V")
   private static final void method9343(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class923 var3 = Statics.field5946.method15930(var2);
      if (var3.method15884()) {
         arg0.field7226[++arg0.field7205 - 1] = Statics.field2046.method14475(var1).method14307(var2, var3.field9389);
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field2046.method14475(var1).method14311(var2, var3.field9388);
      }

   }

   @deob.ObfuscatedName("b.abl(Lrs;B)V")
   private static final void method4108(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class743 var2 = Statics.field8402.method10795(var1);
      if (var2.field6812 != null && var2.field6812.length > 0) {
         int var3 = 0;
         int var4 = var2.field6813[0];

         for(int var5 = 1; var5 < var2.field6812.length; ++var5) {
            if (var2.field6813[var5] > var4) {
               var3 = var5;
               var4 = var2.field6813[var5];
            }
         }

         arg0.field7203[++arg0.field7204 - 1] = var2.field6812[var3];
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field6811;
      }

   }

   @deob.ObfuscatedName("gw.abm(Lrs;I)V")
   private static final void method6887(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2567 ? 1 : 0;
   }

   @deob.ObfuscatedName("ag.abu(Lrs;I)V")
   private static final void method2287(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2582;
   }

   @deob.ObfuscatedName("av.acl(Lrs;I)V")
   private static final void method4058(class790 arg0) {
      arg0.field7204 -= 3;
      client.field2582 = arg0.field7203[arg0.field7204];
      Statics.field8784 = class868.method16038(arg0.field7203[arg0.field7204 + 1]);
      if (Statics.field8784 == null) {
         Statics.field8784 = class868.field8820;
      }

      client.field2411 = arg0.field7203[arg0.field7204 + 2];
      class110 var1 = Statics.method8951();
      class109 var2 = class109.method15110(ClientProt.SET_CHATFILTERSETTINGS, var1.field832);
      var2.field814.method1568(client.field2582);
      var2.field814.method1568(Statics.field8784.field8819);
      var2.field814.method1568(client.field2411);
      var1.method1408(var2);
   }

   @deob.ObfuscatedName("gn.aca(Lrs;B)V")
   private static final void method6767(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      arg0.field7204 -= 2;
      int var3 = arg0.field7203[arg0.field7204];
      int var4 = arg0.field7203[arg0.field7204 + 1];
      if (var2 == null) {
         var2 = "";
      }

      if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      class110 var5 = Statics.method8951();
      class109 var6 = class109.method15110(ClientProt.SEND_SNAPSHOT, var5.field832);
      var6.field814.method1568(class124.method1229(var1) + 2 + class124.method1229(var2));
      var6.field814.method1577(var1);
      var6.field814.method1568(var3 - 1);
      var6.field814.method1568(var4);
      var6.field814.method1577(var2);
      var5.method1408(var6);
   }

   @deob.ObfuscatedName("oh.acr(Lrs;I)V")
   private static final void method10284(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      String var3 = "";
      if (var2 != null && var2.field3639 != null) {
         var3 = var2.field3639;
      }

      arg0.field7226[++arg0.field7205 - 1] = var3;
   }

   @deob.ObfuscatedName("ch.ace(Lrs;I)V")
   private static final void method4521(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      int var3 = -1;
      if (var2 != null) {
         var3 = var2.field3632;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("adl.ack(Lrs;I)V")
   private static final void method1323(class790 arg0) {
      if (Statics.field8784 == null) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field8784.field8819;
      }

   }

   @deob.ObfuscatedName("g.acd(Lrs;I)V")
   private static final void method6572(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class110 var2 = Statics.method8951();
      class109 var3 = class109.method15110(ClientProt.CHAT_SET_MODE, var2.field832);
      var3.field814.method1568(var1);
      var2.method1408(var3);
   }

   @deob.ObfuscatedName("on.acn(Lrs;I)V")
   private static final void method10347(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (client.field2562 != 0 || (!client.field2635 || client.field2680) && !client.field2569) {
         String var2 = var1.toLowerCase();
         byte var3 = 0;
         if (var2.startsWith(class881.field8924.method15374(class823.field8446))) {
            var3 = 0;
            var1 = var1.substring(class881.field8924.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9038.method15374(class823.field8446))) {
            var3 = 1;
            var1 = var1.substring(class881.field9038.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field8966.method15374(class823.field8446))) {
            var3 = 2;
            var1 = var1.substring(class881.field8966.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9040.method15374(class823.field8446))) {
            var3 = 3;
            var1 = var1.substring(class881.field9040.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9033.method15374(class823.field8446))) {
            var3 = 4;
            var1 = var1.substring(class881.field9033.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9042.method15374(class823.field8446))) {
            var3 = 5;
            var1 = var1.substring(class881.field9042.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field8979.method15374(class823.field8446))) {
            var3 = 6;
            var1 = var1.substring(class881.field8979.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9044.method15374(class823.field8446))) {
            var3 = 7;
            var1 = var1.substring(class881.field9044.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9045.method15374(class823.field8446))) {
            var3 = 8;
            var1 = var1.substring(class881.field9045.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9046.method15374(class823.field8446))) {
            var3 = 9;
            var1 = var1.substring(class881.field9046.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field8952.method15374(class823.field8446))) {
            var3 = 10;
            var1 = var1.substring(class881.field8952.method15374(class823.field8446).length());
         } else if (var2.startsWith(class881.field9048.method15374(class823.field8446))) {
            var3 = 11;
            var1 = var1.substring(class881.field9048.method15374(class823.field8446).length());
         } else if (class823.field8446 != Statics.field243) {
            if (var2.startsWith(class881.field8924.method15374(Statics.field243))) {
               var3 = 0;
               var1 = var1.substring(class881.field8924.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9038.method15374(Statics.field243))) {
               var3 = 1;
               var1 = var1.substring(class881.field9038.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field8966.method15374(Statics.field243))) {
               var3 = 2;
               var1 = var1.substring(class881.field8966.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9040.method15374(Statics.field243))) {
               var3 = 3;
               var1 = var1.substring(class881.field9040.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9033.method15374(Statics.field243))) {
               var3 = 4;
               var1 = var1.substring(class881.field9033.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9042.method15374(Statics.field243))) {
               var3 = 5;
               var1 = var1.substring(class881.field9042.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field8979.method15374(Statics.field243))) {
               var3 = 6;
               var1 = var1.substring(class881.field8979.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9044.method15374(Statics.field243))) {
               var3 = 7;
               var1 = var1.substring(class881.field9044.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9045.method15374(Statics.field243))) {
               var3 = 8;
               var1 = var1.substring(class881.field9045.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9046.method15374(Statics.field243))) {
               var3 = 9;
               var1 = var1.substring(class881.field9046.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field8952.method15374(Statics.field243))) {
               var3 = 10;
               var1 = var1.substring(class881.field8952.method15374(Statics.field243).length());
            } else if (var2.startsWith(class881.field9048.method15374(Statics.field243))) {
               var3 = 11;
               var1 = var1.substring(class881.field9048.method15374(Statics.field243).length());
            }
         }

         String var4 = var1.toLowerCase();
         byte var5 = 0;
         if (var4.startsWith(class881.field9049.method15374(class823.field8446))) {
            var5 = 1;
            var1 = var1.substring(class881.field9049.method15374(class823.field8446).length());
         } else if (var4.startsWith(class881.field9050.method15374(class823.field8446))) {
            var5 = 2;
            var1 = var1.substring(class881.field9050.method15374(class823.field8446).length());
         } else if (var4.startsWith(class881.field9051.method15374(class823.field8446))) {
            var5 = 3;
            var1 = var1.substring(class881.field9051.method15374(class823.field8446).length());
         } else if (var4.startsWith(class881.field8958.method15374(class823.field8446))) {
            var5 = 4;
            var1 = var1.substring(class881.field8958.method15374(class823.field8446).length());
         } else if (var4.startsWith(class881.field9053.method15374(class823.field8446))) {
            var5 = 5;
            var1 = var1.substring(class881.field9053.method15374(class823.field8446).length());
         } else if (class823.field8446 != Statics.field243) {
            if (var4.startsWith(class881.field9049.method15374(Statics.field243))) {
               var5 = 1;
               var1 = var1.substring(class881.field9049.method15374(Statics.field243).length());
            } else if (var4.startsWith(class881.field9050.method15374(Statics.field243))) {
               var5 = 2;
               var1 = var1.substring(class881.field9050.method15374(Statics.field243).length());
            } else if (var4.startsWith(class881.field9051.method15374(Statics.field243))) {
               var5 = 3;
               var1 = var1.substring(class881.field9051.method15374(Statics.field243).length());
            } else if (var4.startsWith(class881.field8958.method15374(Statics.field243))) {
               var5 = 4;
               var1 = var1.substring(class881.field8958.method15374(Statics.field243).length());
            } else if (var4.startsWith(class881.field9053.method15374(Statics.field243))) {
               var5 = 5;
               var1 = var1.substring(class881.field9053.method15374(Statics.field243).length());
            }
         }

         class110 var6 = Statics.method8951();
         class109 var7 = class109.method15110(ClientProt.MESSAGE_PUBLIC, var6.field832);
         var7.field814.method1568(0);
         int var8 = var7.field814.field935;
         var7.field814.method1568(var3);
         var7.field814.method1568(var5);
         class450.method11264(var7.field814, var1);
         var7.field814.method1664(var7.field814.field935 - var8);
         var6.method1408(var7);
      }
   }

   @deob.ObfuscatedName("en.acp(Lrs;I)V")
   private static final void method5911(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      if (client.field2562 != 0 || (!client.field2635 || client.field2680) && !client.field2569) {
         class110 var3 = Statics.method8951();
         class109 var4 = class109.method15110(ClientProt.MESSAGE_PRIVATE, var3.field832);
         var4.field814.method1569(0);
         int var5 = var4.field814.field935;
         var4.field814.method1577(var1);
         class450.method11264(var4.field814, var2);
         var4.field814.method1582(var4.field814.field935 - var5);
         var3.method1408(var4);
      }
   }

   @deob.ObfuscatedName("uw.acs(Lrs;I)V")
   private static final void method15332(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      String var3 = "";
      if (var2 != null && var2.field3633 != null) {
         var3 = var2.field3633;
      }

      arg0.field7226[++arg0.field7205 - 1] = var3;
   }

   @deob.ObfuscatedName("lo.acv(Lrs;B)V")
   private static final void method8989(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      int var3 = -1;
      if (var2 != null) {
         var3 = var2.field3638;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("jl.acw(Lrs;I)V")
   private static final void method7967(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2411;
   }

   @deob.ObfuscatedName("sa.ach(Lrs;I)V")
   private static final void method14238(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class419.method9279();
   }

   @deob.ObfuscatedName("qg.acc(Lrs;I)V")
   private static final void method11163(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      int var3 = 0;
      if (var2 != null) {
         var3 = var2.field3634;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("nc.acj(Lrs;S)V")
   private static final void method9722(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      String var3 = "";
      if (var2 != null && var2.field3635 != null) {
         var3 = var2.field3635;
      }

      arg0.field7226[++arg0.field7205 - 1] = var3;
   }

   @deob.ObfuscatedName("ju.aci(Lrs;B)V")
   private static final void method8024(class790 arg0) {
      String var1;
      if (Statics.field5701 != null && Statics.field5701.field1391 != null) {
         var1 = Statics.field5701.method2863(false);
      } else {
         var1 = "";
      }

      arg0.field7226[++arg0.field7205 - 1] = var1;
   }

   @deob.ObfuscatedName("xt.acm(Lrs;S)V")
   private static final void method16037(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      int var3 = -1;
      if (var2 != null) {
         var3 = var2.field3637;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("eg.acy(Lrs;B)V")
   private static final void method5768(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      int var3 = -1;
      if (var2 != null) {
         var3 = var2.field3631;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("fj.acq(Lrs;I)V")
   private static final void method6268(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class437 var2 = class419.method9086(var1);
      String var3 = "";
      if (var2 != null && var2.field3636 != null) {
         var3 = var2.field3636;
      }

      arg0.field7226[++arg0.field7205 - 1] = var3;
   }

   @deob.ObfuscatedName("op.aco(Lrs;I)V")
   private static final void method10369(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = Statics.field8671.method8893(var1).field1789;
   }

   @deob.ObfuscatedName("up.acz(Lrs;I)V")
   private static final void method15223(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class267 var2 = Statics.field8671.method8893(var1);
      if (var2.field1786 == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field1786.length;
      }

   }

   @deob.ObfuscatedName("ux.acb(Lrs;S)V")
   private static final void method15348(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class267 var2 = Statics.field8671.method8893(var1);
      if (var2.field1788 == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field1788.length;
      }

   }

   @deob.ObfuscatedName("cv.act(Lrs;I)V")
   private static final void method5206(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8671.method8893(var1).field1788[var2];
   }

   @deob.ObfuscatedName("x.acu(Lrs;I)V")
   private static final void method15963(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7226[++arg0.field7205 - 1] = Statics.field8477.method15712(var1).method3579();
   }

   @deob.ObfuscatedName("dz.ada(Lrs;I)V")
   private static final void method5653(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class270 var2 = Statics.field8477.method15712(var1);
      if (var2.field1794 == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field1794.length;
      }

   }

   @deob.ObfuscatedName("cg.adl(Lrs;I)V")
   private static final void method4478(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8477.method15712(var1).field1794[var2];
   }

   @deob.ObfuscatedName("ab.adr(Lrs;B)V")
   private static final void method483(class790 arg0) {
      arg0.field7213 = new class528();
      arg0.field7213.field4168 = arg0.field7203[--arg0.field7204];
      arg0.field7213.field4167 = Statics.field8477.method15712(arg0.field7213.field4168);
      arg0.field7213.field4169 = new int[arg0.field7213.field4167.method3582()];
   }

   @deob.ObfuscatedName("ai.adm(Lrs;I)V")
   private static final void method2950(class790 arg0) {
      class110 var1 = Statics.method8951();
      class109 var2 = class109.method15110(ClientProt.MESSAGE_QUICKCHAT_PUBLIC, var1.field832);
      var2.field814.method1568(0);
      int var3 = var2.field814.field935;
      var2.field814.method1568(0);
      var2.field814.method1569(arg0.field7213.field4168);
      arg0.field7213.field4167.method3580(var2.field814, arg0.field7213.field4169);
      var2.field814.method1664(var2.field814.field935 - var3);
      var1.method1408(var2);
   }

   @deob.ObfuscatedName("qg.adz(Lrs;I)V")
   private static final void method11164(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      class110 var2 = Statics.method8951();
      class109 var3 = class109.method15110(ClientProt.MESSAGE_QUICKCHAT_PRIVATE, var2.field832);
      var3.field814.method1568(0);
      int var4 = var3.field814.field935;
      var3.field814.method1577(var1);
      var3.field814.method1569(arg0.field7213.field4168);
      arg0.field7213.field4167.method3580(var3.field814, arg0.field7213.field4169);
      var3.field814.method1664(var3.field814.field935 - var4);
      var2.method1408(var3);
   }

   @deob.ObfuscatedName("aac.adf(Lrs;I)V")
   private static final void method210(class790 arg0) {
      class110 var1 = Statics.method8951();
      class109 var2 = class109.method15110(ClientProt.MESSAGE_QUICKCHAT_PUBLIC, var1.field832);
      var2.field814.method1568(0);
      int var3 = var2.field814.field935;
      var2.field814.method1568(1);
      var2.field814.method1569(arg0.field7213.field4168);
      arg0.field7213.field4167.method3580(var2.field814, arg0.field7213.field4169);
      var2.field814.method1664(var2.field814.field935 - var3);
      var1.method1408(var2);
   }

   @deob.ObfuscatedName("sq.adb(Lrs;B)V")
   private static final void method14401(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8671.method8893(var1).field1785[var2];
   }

   @deob.ObfuscatedName("dy.adc(Lrs;I)V")
   private static final void method5636(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (var2 == -1) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field8671.method8893(var1).method3559((char)var2);
      }

   }

   @deob.ObfuscatedName("fd.ado(Lrs;I)V")
   private static final void method6235(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (var2 == -1) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field8671.method8893(var1).method3555((char)var2);
      }

   }

   @deob.ObfuscatedName("le.adw(Lrs;I)V")
   private static final void method8876(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8477.method15712(var1).method3582();
   }

   @deob.ObfuscatedName("gc.adt(Lrs;I)V")
   private static final void method6596(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = Statics.field8477.method15712(var1).method3583(var2).field6910;
      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("ll.adx(Lrs;I)V")
   private static final void method8949(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7213.field4169[var1] = var2;
   }

   @deob.ObfuscatedName("mo.adn(Lrs;B)V")
   private static final void method9411(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7213.field4169[var1] = var2;
   }

   @deob.ObfuscatedName("kp.ady(Lrs;B)V")
   private static final void method8523(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class270 var4 = Statics.field8477.method15712(var1);
      if (var4.method3583(var2).field6910 != 0) {
         throw new RuntimeException("");
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var4.method3584(var2, var3);
      }
   }

   @deob.ObfuscatedName("gl.adq(Lrs;I)V")
   private static final void method6736(class790 arg0) {
      if (Statics.field3776 != null && Statics.field5278 < Statics.field6134) {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field3776[++Statics.field5278 - 1] & 65535;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      }

   }

   @deob.ObfuscatedName("pg.adu(Lrs;I)V")
   private static final void method10714(class790 arg0) {
      Statics.field5278 = 0;
   }

   @deob.ObfuscatedName("lc.adp(Lrs;I)V")
   private static final void method8870(class790 arg0) {
      class110 var1 = Statics.method8951();
      class109 var2 = class109.method15110(ClientProt.MESSAGE_QUICKCHAT_PUBLIC, var1.field832);
      var2.field814.method1568(0);
      int var3 = var2.field814.field935;
      var2.field814.method1568(2);
      var2.field814.method1569(arg0.field7213.field4168);
      arg0.field7213.field4167.method3580(var2.field814, arg0.field7213.field4169);
      var2.field814.method1664(var2.field814.field935 - var3);
      var1.method1408(var2);
   }

   @deob.ObfuscatedName("air.adh(Lrs;I)V")
   private static final void method3316(class790 arg0) {
      class110 var1 = Statics.method8951();
      class109 var2 = class109.method15110(ClientProt.MESSAGE_QUICKCHAT_PUBLIC, var1.field832);
      var2.field814.method1568(0);
      int var3 = var2.field814.field935;
      var2.field814.method1568(3);
      var2.field814.method1569(arg0.field7213.field4168);
      arg0.field7213.field4167.method3580(var2.field814, arg0.field7213.field4169);
      var2.field814.method1664(var2.field814.field935 - var3);
      var1.method1408(var2);
   }

   @deob.ObfuscatedName("xr.adj(Lrs;I)V")
   private static final void method16031(class790 arg0) {
      if (Statics.field2111.method1803(86)) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("dn.ads(Lrs;I)V")
   private static final void method5501(class790 arg0) {
      if (Statics.field2111.method1803(82)) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("oq.ade(Lrs;B)V")
   private static final void method10390(class790 arg0) {
      if (Statics.field2111.method1803(81)) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ahr.adv(Lrs;I)V")
   private static final void method2857(class790 arg0) {
      class131.method15766(arg0.field7203[--arg0.field7204]);
   }

   @deob.ObfuscatedName("ra.adg(Lrs;I)V")
   private static final void method11581(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class131.method8053();
   }

   @deob.ObfuscatedName("pc.adk(Lrs;I)V")
   private static final void method10682(class790 arg0) {
      class131.method8991(arg0.field7203[--arg0.field7204], -1, -1, false);
   }

   @deob.ObfuscatedName("fy.aen(Lrs;I)V")
   private static final void method6540(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class252 var2 = class697.method10206(var1 >> 14 & 16383, var1 & 16383);
      if (var2 == null) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field1666;
      }

   }

   @deob.ObfuscatedName("iw.aeh(Lrs;I)V")
   private static final void method7439(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field5595;
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9063;
   }

   @deob.ObfuscatedName("fs.aeb(Lrs;B)V")
   private static final void method6503(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field7271 + Statics.field6402;
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9883 + Statics.field6418;
   }

   @deob.ObfuscatedName("jg.aef(Lrs;I)V")
   private static final void method7936(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class252 var2 = class697.method10207(var1);
      if (var2 == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field1658 >> 14 & 16383;
         arg0.field7203[++arg0.field7204 - 1] = var2.field1658 & 16383;
      }

   }

   @deob.ObfuscatedName("er.aek(Lrs;I)V")
   private static final void method5959(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class252 var2 = class697.method10207(var1);
      if (var2 == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field1661 - var2.field1665;
         arg0.field7203[++arg0.field7204 - 1] = var2.field1668 - var2.field1669;
      }

   }

   @deob.ObfuscatedName("jf.aee(Lrs;I)V")
   private static final void method7935(class790 arg0) {
      class99 var1 = class131.method10929();
      if (var1 == null) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var1.field773;
         int var2 = var1.field768 << 28 | var1.field767 + Statics.field6402 << 14 | var1.field770 + Statics.field6418;
         arg0.field7203[++arg0.field7204 - 1] = var2;
      }

   }

   @deob.ObfuscatedName("el.aet(Lrs;I)V")
   private static final void method5806(class790 arg0) {
      class99 var1 = class131.method10951();
      if (var1 == null) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var1.field773;
         int var2 = var1.field768 << 28 | var1.field767 + Statics.field6402 << 14 | var1.field770 + Statics.field6418;
         arg0.field7203[++arg0.field7204 - 1] = var2;
      }

   }

   @deob.ObfuscatedName("uh.aeu(Lrs;I)V")
   private static final void method15162(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class252 var2 = class131.method5345();
      if (var2 != null) {
         boolean var3 = var2.method3412(var1 >> 28 & 3, var1 >> 14 & 16383, var1 & 16383, field7178);
         if (var3) {
            class131.method1010(field7178[1], field7178[2]);
         }
      }

   }

   @deob.ObfuscatedName("rh.aeo(Lrs;I)V")
   private static final void method11693(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class252 var2 = class697.method10207(var1);
      if (var2 == null) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var2.field1664;
      }

   }

   @deob.ObfuscatedName("aq.aes(Lrs;B)V")
   private static final void method4003(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class131.field1015 == 100 ? 1 : 0;
   }

   @deob.ObfuscatedName("adg.aew(Lrs;I)V")
   private static final void method1275(class790 arg0) {
      class252 var1 = class131.method5345();
      if (var1 != null) {
         boolean var2 = var1.method3410(Statics.field7271 + Statics.field6402, Statics.field9883 + Statics.field6418, field7178);
         if (var2) {
            arg0.field7203[++arg0.field7204 - 1] = field7178[1];
            arg0.field7203[++arg0.field7204 - 1] = field7178[2];
         } else {
            arg0.field7203[++arg0.field7204 - 1] = -1;
            arg0.field7203[++arg0.field7204 - 1] = -1;
         }
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7203[++arg0.field7204 - 1] = -1;
      }

   }

   @deob.ObfuscatedName("rh.aez(Lrs;I)V")
   private static final void method11694(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class131.method8991(var1, var2 >> 14 & 16383, var2 & 16383, false);
   }

   @deob.ObfuscatedName("yc.aey(Lrs;I)V")
   private static final void method16070(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class252 var2 = class131.method5345();
      if (var2 != null) {
         boolean var3 = var2.method3412(var1 >> 28 & 3, var1 >> 14 & 16383, var1 & 16383, field7178);
         if (var3) {
            arg0.field7203[++arg0.field7204 - 1] = field7178[1];
            arg0.field7203[++arg0.field7204 - 1] = field7178[2];
         } else {
            arg0.field7203[++arg0.field7204 - 1] = -1;
            arg0.field7203[++arg0.field7204 - 1] = -1;
         }
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7203[++arg0.field7204 - 1] = -1;
      }

   }

   @deob.ObfuscatedName("qo.aei(Lrs;I)V")
   private static final void method11277(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class252 var2 = class131.method5345();
      if (var2 != null) {
         boolean var3 = var2.method3410(var1 >> 14 & 16383, var1 & 16383, field7178);
         if (var3) {
            arg0.field7203[++arg0.field7204 - 1] = field7178[1];
            arg0.field7203[++arg0.field7204 - 1] = field7178[2];
         } else {
            arg0.field7203[++arg0.field7204 - 1] = -1;
            arg0.field7203[++arg0.field7204 - 1] = -1;
         }
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7203[++arg0.field7204 - 1] = -1;
      }

   }

   @deob.ObfuscatedName("ny.aed(Lrs;I)V")
   private static final void method10104(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class131.method8991(var1, var2 >> 14 & 16383, var2 & 16383, true);
   }

   @deob.ObfuscatedName("tx.ael(Lrs;I)V")
   private static final void method15038(class790 arg0) {
      class131.field1023 = arg0.field7203[--arg0.field7204] == 1;
   }

   @deob.ObfuscatedName("uy.aec(Lrs;I)V")
   private static final void method15354(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class131.field1023 ? 1 : 0;
   }

   @deob.ObfuscatedName("gb.aem(Lrs;B)V")
   private static final void method6583(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class131.method3746(var1);
   }

   @deob.ObfuscatedName("gd.aex(Lrs;I)V")
   private static final void method6609(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      boolean var2 = arg0.field7203[arg0.field7204 + 1] == 1;
      if (class131.field1027 != null) {
         class674 var3 = class131.field1027.method15322((long)var1);
         if (var3 != null && !var2) {
            var3.method9864();
         } else if (var3 == null && var2) {
            class674 var4 = new class674();
            class131.field1027.method15311(var4, (long)var1);
         }
      }

   }

   @deob.ObfuscatedName("dn.aep(Lrs;I)V")
   private static final void method5502(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (class131.field1027 != null) {
         class674 var2 = class131.field1027.method15322((long)var1);
         arg0.field7203[++arg0.field7204 - 1] = var2 != null ? 1 : 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("ec.aea(Lrs;I)V")
   private static final void method5681(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      boolean var2 = arg0.field7203[arg0.field7204 + 1] == 1;
      if (class131.field1026 != null) {
         class674 var3 = class131.field1026.method15322((long)var1);
         if (var3 != null && !var2) {
            var3.method9864();
         } else if (var3 == null && var2) {
            class674 var4 = new class674();
            class131.field1026.method15311(var4, (long)var1);
         }
      }

   }

   @deob.ObfuscatedName("jf.aev(Lrs;S)V")
   private static final void method7933(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (class131.field1026 != null) {
         class674 var2 = class131.field1026.method15322((long)var1);
         arg0.field7203[++arg0.field7204 - 1] = var2 != null ? 1 : 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("kg.aft(Lrs;I)V")
   private static final void method8288(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field6389 != null ? Statics.field6389.field1666 : -1;
   }

   @deob.ObfuscatedName("rx.afz(Lrs;I)V")
   private static final void method14197(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = var2 >> 14 & 16383;
      int var4 = var2 & 16383;
      int var5 = class131.method11469(var1, var3, var4);
      if (var5 < 0) {
         arg0.field7203[++arg0.field7204 - 1] = -1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = var5;
      }

   }

   @deob.ObfuscatedName("jq.afi(Lrs;I)V")
   private static final void method7984(class790 arg0) {
      client.method6555();
   }

   @deob.ObfuscatedName("dd.afh(Lrs;I)V")
   private static final void method5377(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (class854.field8745) {
         client.method10176(3, var1, var2, false);
         arg0.field7203[++arg0.field7204 - 1] = Statics.field688 != null ? 1 : 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("fu.afa(Lrs;I)V")
   private static final void method6527(class790 arg0) {
      if (class854.field8745 && Statics.field688 != null) {
         client.method10176(Statics.field9361.field967.method2066(), -1, -1, false);
      }

   }

   @deob.ObfuscatedName("rz.afd(Lrs;B)V")
   private static final void method14228(class790 arg0) {
      if (class854.field8745) {
         class867[] var1 = client.method14680();
         arg0.field7203[++arg0.field7204 - 1] = var1.length;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("q.afc(Lrs;I)V")
   private static final void method10997(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (class854.field8745) {
         class867[] var2 = client.method14680();
         arg0.field7203[++arg0.field7204 - 1] = var2[var1].field8814;
         arg0.field7203[++arg0.field7204 - 1] = var2[var1].field8815;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("sb.afg(Lrs;I)V")
   private static final void method14254(class790 arg0) {
      int var1 = Statics.field3666;
      int var2 = Statics.field3600;
      int var3 = -1;
      if (class854.field8745) {
         class867[] var4 = client.method14680();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            class867 var6 = var4[var5];
            if (var6.field8814 == var1 && var6.field8815 == var2) {
               var3 = var5;
               break;
            }
         }
      }

      arg0.field7203[++arg0.field7204 - 1] = var3;
   }

   @deob.ObfuscatedName("q.afs(Lrs;B)V")
   private static final void method10996(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.method10038();
   }

   @deob.ObfuscatedName("iw.afb(Lrs;I)V")
   private static final void method7437(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field967.method2066();
   }

   @deob.ObfuscatedName("ot.afw(Lrs;B)V")
   private static final void method10463(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 >= 1 && var1 <= 2) {
         Statics.field9361.method1857(Statics.field9361.field967, var1);
         Statics.field9361.method1857(Statics.field9361.field959, var1);
         class29.method7336();
      }
   }

   @deob.ObfuscatedName("rb.afq(Lrs;I)V")
   private static final void method11589(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (var1 >= 0 && var1 < 2) {
         client.field2520[var1] = new int[var2 << 1][4];
      }

   }

   @deob.ObfuscatedName("oy.afn(Lrs;I)V")
   private static final void method10648(class790 arg0) {
      arg0.field7204 -= 7;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1] << 1;
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      int var5 = arg0.field7203[arg0.field7204 + 4];
      int var6 = arg0.field7203[arg0.field7204 + 5];
      int var7 = arg0.field7203[arg0.field7204 + 6];
      if (var1 >= 0 && var1 < 2 && client.field2520[var1] != null && var2 >= 0 && var2 < client.field2520[var1].length) {
         client.field2520[var1][var2] = new int[]{(var3 >> 14 & 16383) << 9, var4 << 2, (var3 & 16383) << 9, var7};
         client.field2520[var1][var2 + 1] = new int[]{(var5 >> 14 & 16383) << 9, var6 << 2, (var5 & 16383) << 9};
      }

   }

   @deob.ObfuscatedName("g.afv(Lrs;I)V")
   private static final void method6573(class790 arg0) {
      int var1 = client.field2520[arg0.field7203[--arg0.field7204]].length >> 1;
      arg0.field7203[++arg0.field7204 - 1] = var1;
   }

   @deob.ObfuscatedName("pi.afl(Lrs;I)V")
   private static final void method10733(class790 arg0) {
      if (class854.field8745 && Statics.field688 != null) {
         client.method10176(Statics.field9361.field967.method2066(), -1, -1, false);
      }

      if (class671.method11178() == class686.field6209) {
         client.method430();
         System.exit(0);
      } else {
         client.method11587();
      }

   }

   @deob.ObfuscatedName("fj.afj(Lrs;I)V")
   private static final void method6267(class790 arg0) {
      String var1 = null;
      if (Statics.field2285 != null) {
         var1 = Statics.field2285.method4411();
      }

      if (var1 == null) {
         var1 = "";
      }

      arg0.field7226[++arg0.field7205 - 1] = var1;
   }

   @deob.ObfuscatedName("ju.afy(Lrs;I)V")
   private static final void method8025(class790 arg0) {
      if (class854.field8745 && Statics.field688 != null) {
         client.method10176(Statics.field9361.field967.method2066(), -1, -1, false);
      }

      String var1 = (String)arg0.field7226[--arg0.field7205];
      boolean var2 = arg0.field7203[--arg0.field7204] == 1;
      String var3 = client.method366() + var1;
      class689.method690(var3, var2, Statics.field9361.field974.method2236() == 5, client.field2643, client.field2403);
   }

   @deob.ObfuscatedName("gs.afp(Lrs;B)V")
   private static final void method6862(class790 arg0) {
      System.out.println(arg0.field7226[--arg0.field7205]);
   }

   @deob.ObfuscatedName("dy.afo(Lrs;I)V")
   private static final void method5640(class790 arg0) {
      arg0.field7204 -= 12;
      class987.method11730();
      class987.method392();
      Statics.field6374 = arg0.field7203[arg0.field7204];
      Statics.field6641 = arg0.field7203[arg0.field7204 + 1];
      Statics.field10520 = arg0.field7203[arg0.field7204 + 2];
      Statics.field3871 = arg0.field7203[arg0.field7204 + 3];
      Statics.field525 = arg0.field7203[arg0.field7204 + 4];
      Statics.field3889 = arg0.field7203[arg0.field7204 + 5];
      Statics.field6080 = arg0.field7203[arg0.field7204 + 6];
      Statics.field3571 = arg0.field7203[arg0.field7204 + 7];
      Statics.field4246 = arg0.field7203[arg0.field7204 + 8];
      Statics.field9568 = arg0.field7203[arg0.field7204 + 9];
      Statics.field6796 = arg0.field7203[arg0.field7204 + 10];
      Statics.field4906 = arg0.field7203[arg0.field7204 + 11];
      Statics.field6723.method8790(Statics.field525);
      Statics.field6723.method8790(Statics.field3889);
      Statics.field6723.method8790(Statics.field6080);
      Statics.field6723.method8790(Statics.field3571);
      Statics.field6723.method8790(Statics.field4246);
      Statics.field6723.method8790(Statics.field4906);
      Statics.field4891.method8790(Statics.field4906);
      Statics.field4165 = null;
      Statics.field2895 = null;
      Statics.field9606 = null;
      Statics.field6083 = null;
      Statics.field1993 = null;
      Statics.field6475 = null;
      Statics.field6555 = null;
      Statics.field5243 = null;
      class987.field10527 = true;
   }

   @deob.ObfuscatedName("uu.afe(Lrs;I)V")
   private static final void method15286(class790 arg0) {
      class987.method5962();
      class987.field10527 = false;
   }

   @deob.ObfuscatedName("iq.afm(Lrs;I)V")
   private static final void method7395(class790 arg0) {
      arg0.field7204 -= 2;
      client.field2557 = arg0.field7203[arg0.field7204];
      client.field2586 = arg0.field7203[arg0.field7204 + 1];
   }

   @deob.ObfuscatedName("da.afr(Lrs;B)V")
   private static final void method5342(class790 arg0) {
      arg0.field7204 -= 2;
   }

   @deob.ObfuscatedName("pu.afu(Lrs;I)V")
   private static final void method10928(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      arg0.field7203[++arg0.field7204 - 1] = class987.method1293(var1, var2) ? 1 : 0;
   }

   @deob.ObfuscatedName("az.agf(Lrs;B)V")
   private static final void method4096(class790 arg0) {
      class319.method8552((String)arg0.field7226[--arg0.field7205], false, false);
   }

   @deob.ObfuscatedName("zr.agk(Lrs;B)V")
   private static final void method17095(class790 arg0) {
      class573.field5180.method7991();
   }

   @deob.ObfuscatedName("ef.agn(Lrs;I)V")
   private static final void method5742(class790 arg0) {
      class573.field5181.method7991();
   }

   @deob.ObfuscatedName("jr.agr(Lrs;I)V")
   private static final void method8005(class790 arg0) {
      class987.field10522 = arg0.field7203[--arg0.field7204];
   }

   @deob.ObfuscatedName("xj.agb(Lrs;I)V")
   private static final void method16015(class790 arg0) {
      arg0.field7205 -= 3;
      method663((String)arg0.field7226[arg0.field7205], (String)arg0.field7226[arg0.field7205 + 1], (String)arg0.field7226[arg0.field7205 + 2], arg0.field7203[--arg0.field7204] == 1, true);
   }

   @deob.ObfuscatedName("tg.agw(Lrs;I)V")
   private static final void method14663(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2390 ? 1 : 0;
   }

   @deob.ObfuscatedName("ic.age(Lrs;I)V")
   private static final void method7305(class790 arg0) {
      if (Statics.field8859.field876 < 6) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else if (Statics.field8859.field876 == 6 && Statics.field8859.field891 < 10) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      }

   }

   @deob.ObfuscatedName("op.ags(Lrs;I)V")
   private static final void method10366(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.method6612(client.field2410) ? 1 : 0;
   }

   @deob.ObfuscatedName("re.agt(Lrs;B)V")
   private static final void method11652(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = Statics.method15867().toString();
   }

   @deob.ObfuscatedName("zx.agg(Lrs;B)V")
   private static final void method17102(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      arg0.field7221 = new class328(var1, true);
   }

   @deob.ObfuscatedName("qk.agc(Lrs;I)V")
   private static final void method11205(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      boolean var2 = Statics.field561.method9816(new File(var1));
      arg0.field7203[++arg0.field7204 - 1] = var2 ? 1 : 0;
   }

   @deob.ObfuscatedName("qv.agh(Lrs;I)V")
   private static final void method11385(class790 arg0) {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      class723 var5 = client.field2468.method9649();
      client.method9870((var1 >> 14 & 16383) - var5.field6676, (var1 & 16383) - var5.field6677, var2 << 2, var3, var4, false);
   }

   @deob.ObfuscatedName("pz.agj(Lrs;B)V")
   private static final void method10988(class790 arg0) {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      class723 var5 = client.field2468.method9649();
      client.method14327((var1 >> 14 & 16383) - var5.field6676, (var1 & 16383) - var5.field6677, var2 << 2, var3, var4);
   }

   @deob.ObfuscatedName("agw.aga(Lrs;I)V")
   private static final void method2464(class790 arg0) {
      arg0.field7204 -= 6;
      int var1 = arg0.field7203[arg0.field7204];
      if (var1 >= 2) {
         throw new RuntimeException();
      } else {
         client.field2521 = var1;
         int var2 = arg0.field7203[arg0.field7204 + 1];
         if (var2 + 1 >= client.field2520[client.field2521].length >> 1) {
            throw new RuntimeException();
         } else {
            client.field2523 = var2;
            client.field2525 = 0;
            client.field2526 = arg0.field7203[arg0.field7204 + 2];
            client.field2454 = arg0.field7203[arg0.field7204 + 3];
            int var3 = arg0.field7203[arg0.field7204 + 4];
            if (var3 >= 2) {
               throw new RuntimeException();
            } else {
               client.field2698 = var3;
               int var4 = arg0.field7203[arg0.field7204 + 5];
               if (var4 + 1 >= client.field2520[client.field2698].length >> 1) {
                  throw new RuntimeException();
               } else {
                  client.field2402 = var4;
                  Statics.field5998 = 1;
                  Statics.field6637 = -1;
                  Statics.field5929 = -1;
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("pc.agy(Lrs;I)V")
   private static final void method10680(class790 arg0) {
      client.method6770();
   }

   @deob.ObfuscatedName("aen.agu(Lrs;I)V")
   private static final void method1796(class790 arg0) {
      arg0.field7204 -= 2;
      client.method8975(arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1], 0);
   }

   @deob.ObfuscatedName("ahp.agd(Lrs;I)V")
   private static final void method2856(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2603 >> 3;
   }

   @deob.ObfuscatedName("er.agv(Lrs;S)V")
   private static final void method5960(class790 arg0) {
      if (Statics.field5998 == 2) {
         arg0.field7203[++arg0.field7204 - 1] = (int)((double)Statics.field6895.method6425() * 2607.5945876176133D) >> 3;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = (int)client.field2502 >> 3;
      }

   }

   @deob.ObfuscatedName("y.agl(Lrs;B)V")
   private static final void method16063(class790 arg0) {
      client.method8945();
   }

   @deob.ObfuscatedName("ee.ago(Lrs;I)V")
   private static final void method5729(class790 arg0) {
      client.method6532();
   }

   @deob.ObfuscatedName("aep.agx(Lrs;B)V")
   private static final void method1850(class790 arg0) {
      client.method9489();
   }

   @deob.ObfuscatedName("iw.agi(Lrs;I)V")
   private static final void method7440(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 < 0) {
         var1 = 0;
      }

      client.field2579 = client.field2514 + var1;
   }

   @deob.ObfuscatedName("adt.agp(Lrs;I)V")
   private static final void method1387(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2579 - client.field2514;
   }

   @deob.ObfuscatedName("fo.ahy(Lrs;I)V")
   private static final void method6467(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int var2 = var1 >> 14 & 16383;
      int var3 = var1 & 16383;
      class723 var4 = client.field2468.method9649();
      int var5 = var2 - var4.field6676;
      if (var5 < 0) {
         var5 = 0;
      } else if (var5 >= client.field2468.method9648()) {
         var5 = client.field2468.method9648();
      }

      int var6 = var3 - var4.field6677;
      if (var6 < 0) {
         var6 = 0;
      } else if (var6 >= client.field2468.method9604()) {
         var6 = client.field2468.method9604();
      }

      client.field2506 = (var5 << 9) + 256;
      client.field2507 = (var6 << 9) + 256;
      Statics.field5998 = 5;
      Statics.field6637 = -1;
      Statics.field5929 = -1;
   }

   @deob.ObfuscatedName("d.ahs(Lrs;I)V")
   private static final void method5337(class790 arg0) {
      Statics.method9678();
   }

   @deob.ObfuscatedName("iu.ahu(Lrs;I)V")
   private static final void method7422(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 == -1) {
         int var2 = var1 >> 14 & 16383;
         int var3 = var1 & 16383;
         class723 var4 = client.field2468.method9649();
         int var5 = var2 - var4.field6676;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 >= client.field2468.method9648()) {
            var5 = client.field2468.method9648();
         }

         int var6 = var3 - var4.field6677;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 >= client.field2468.method9604()) {
            var6 = client.field2468.method9604();
         }

         Statics.field5929 = (var5 << 9) + 256;
         Statics.field6637 = (var6 << 9) + 256;
      } else {
         Statics.field5929 = -1;
         Statics.field6637 = -1;
      }

   }

   @deob.ObfuscatedName("qk.aho(Lrs;B)V")
   private static final void method11206(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field5998 == 4 ? 1 : 0;
   }

   @deob.ObfuscatedName("ry.ahh(Lrs;I)V")
   private static final void method14219(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      class385.method8022(var1, var2);
   }

   @deob.ObfuscatedName("qs.aha(Lrs;I)V")
   private static final void method11329(class790 arg0) throws class168 {
      int var1 = arg0.field7203[--arg0.field7204];
      Statics.field6895.method6292(class449.method9879(var1), true);
   }

   @deob.ObfuscatedName("rq.ahf(Lrs;I)V")
   private static final void method14127(class790 arg0) throws class168 {
      int var1 = arg0.field7203[--arg0.field7204];
      Statics.field6895.method6293(class444.method14381(var1), true);
   }

   @deob.ObfuscatedName("uf.ahw(Lrs;B)V")
   private static final void method15111(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class584 var3 = class584.method8136((float)var1, (float)var1, (float)var1);
      if (var3.field5328 == -1.0F) {
         var3.field5328 = Float.POSITIVE_INFINITY;
      }

      if (var3.field5330 == -1.0F) {
         var3.field5330 = Float.POSITIVE_INFINITY;
      }

      if (var3.field5331 == -1.0F) {
         var3.field5331 = Float.POSITIVE_INFINITY;
      }

      Statics.field6895.method6374(var3);
      Statics.field6895.method6421((float)var2 / 1000.0F);
      var3.method8201();
   }

   @deob.ObfuscatedName("ph.ahg(Lrs;I)V")
   private static final void method10723(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class584 var3 = class584.method8136((float)var1, (float)var1, (float)var1);
      if (var3.field5328 == -1.0F) {
         var3.field5328 = Float.POSITIVE_INFINITY;
      }

      if (var3.field5330 == -1.0F) {
         var3.field5330 = Float.POSITIVE_INFINITY;
      }

      if (var3.field5331 == -1.0F) {
         var3.field5331 = Float.POSITIVE_INFINITY;
      }

      Statics.field6895.method6299(var3);
      Statics.field6895.method6296((float)var2 / 1000.0F);
      var3.method8201();
   }

   @deob.ObfuscatedName("aef.ahd(Lrs;I)V")
   private static final void method1511(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      class584 var2 = class584.method8136((float)var1, (float)var1, (float)var1);
      Statics.field6895.method6300(var2);
      var2.method8201();
   }

   @deob.ObfuscatedName("gc.aht(Lrs;I)V")
   private static final void method6597(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      class584 var2 = class584.method8136((float)var1, (float)var1, (float)var1);
      Statics.field6895.method6301(var2);
      var2.method8201();
   }

   @deob.ObfuscatedName("rq.ahi(Lrs;I)V")
   private static final void method14130(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      Statics.field6895.method6392((float)var1, (float)var2);
   }

   @deob.ObfuscatedName("nm.ahr(Lrs;I)V")
   private static final void method9887(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      Statics.field6895.method6306((float)((double)var1 * 3.141592653589793D * 2.0D / 16384.0D), (float)((double)var2 * 3.141592653589793D * 2.0D / 16384.0D));
   }

   @deob.ObfuscatedName("fs.ahq(Lrs;I)V")
   private static final void method6504(class790 arg0) {
      class88 var1 = (class88)arg0.field7226[--arg0.field7205];
      if (Statics.field6895.method6313() != class449.field3707) {
         throw new RuntimeException();
      } else {
         class178 var2 = (class178)Statics.field6895.method6373();
         var2.method2430(var1);
      }
   }

   @deob.ObfuscatedName("dd.ahp(Lrs;I)V")
   private static final void method5378(class790 arg0) {
      class88 var1 = (class88)arg0.field7226[--arg0.field7205];
      if (Statics.field6895.method6320() != class444.field3676) {
         throw new RuntimeException();
      } else {
         class5 var2 = (class5)Statics.field6895.method6316();
         var2.method205(var1);
      }
   }

   @deob.ObfuscatedName("ih.ahj(Lrs;I)V")
   private static final void method7351(class790 arg0) {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      boolean var4 = arg0.field7203[arg0.field7204 + 3] == 1;
      if (Statics.field6895.method6313() != class449.field3709) {
         throw new RuntimeException();
      } else {
         class182 var5 = (class182)Statics.field6895.method6373();
         class211 var6 = Statics.field5701;
         if (var6 != null) {
            var5.method2439(var6, new class584((float)var1, (float)var2, (float)var3), var4);
         }

      }
   }

   @deob.ObfuscatedName("aal.ahl(Lrs;I)V")
   private static final void method368(class790 arg0) {
      arg0.field7204 -= 7;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      int var5 = arg0.field7203[arg0.field7204 + 4];
      boolean var6 = arg0.field7203[arg0.field7204 + 5] == 1;
      int var7 = arg0.field7203[arg0.field7204 + 6];
      if (Statics.field6895.method6320() != class444.field3672) {
         throw new RuntimeException();
      } else {
         class22 var8 = (class22)Statics.field6895.method6316();
         class606 var9 = new class606();
         class606 var10 = new class606();
         var9.method8612(0.0F, 1.0F, 0.0F, (float)((double)var5 * 3.141592653589793D * 2.0D / 16384.0D));
         class584 var11 = new class584(1.0F, 0.0F, 0.0F);
         var11.method8150(var9);
         var11.method8228();
         var10.method8611(var11, (float)((double)var4 * 3.141592653589793D * 2.0D / 16384.0D));
         var9.method8622(var10);
         class211 var12 = Statics.field5701;
         if (var12 != null) {
            var8.method418(var12, new class584((float)var1, (float)var2, (float)var3), var9, var6, var7, client.field2468.method9521(Statics.field1977), client.field2468.method9528().field5626);
         }

      }
   }

   @deob.ObfuscatedName("ti.ahx(Lrs;I)V")
   private static final void method14683(class790 arg0) throws class168 {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      float var4 = (float)(2.0D * Math.atan((double)((float)var1 / 2.0F / (float)var3)));
      float var5 = (float)(2.0D * Math.atan((double)((float)var2 / 2.0F / (float)var3)));
      Statics.field6895.method6306(var4, var5);
   }

   @deob.ObfuscatedName("ch.ahk(Lrs;B)V")
   private static final void method4522(class790 arg0) {
      if (Statics.field6895.method6313() != class449.field3706) {
         throw new RuntimeException();
      } else {
         class166 var1 = (class166)Statics.field6895.method6373();
         var1.method2307(Statics.field7305, -1);
      }
   }

   @deob.ObfuscatedName("afr.ahn(Lrs;B)V")
   private static final void method2200(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field6895.method6433().field3670;
   }

   @deob.ObfuscatedName("ie.ahv(Lrs;I)V")
   private static final void method7325(class790 arg0) {
      if (Statics.field6895.method6320() != class444.field3672) {
         throw new RuntimeException();
      } else {
         class22 var1 = (class22)Statics.field6895.method6316();
         arg0.field7203[++arg0.field7204 - 1] = (int)((double)var1.method422() * 2607.5945876176133D) & 16383;
         arg0.field7203[++arg0.field7204 - 1] = (int)((double)var1.method423() * 2607.5945876176133D) & 16383;
      }
   }

   @deob.ObfuscatedName("dl.ahc(Lrs;B)V")
   private static final void method5485(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class453 var4 = class453.method5178(var1);
      float var5 = (float)var2;
      if (class453.field3747 == var4 || class453.field3746 == var4 || class453.field3749 == var4) {
         var5 = class603.method8577(var2);
      }

      class307 var6 = new class307(Statics.field6895.method246(), var4, var5, (float)var3 / 1000.0F);
      Statics.field6895.method6309(var6);
      arg0.field7203[++arg0.field7204 - 1] = var6.field1735;
   }

   @deob.ObfuscatedName("adn.ahz(Lrs;I)V")
   private static final void method1329(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      Statics.field6895.method6310(var1);
   }

   @deob.ObfuscatedName("js.ahm(Lrs;B)V")
   private static final void method8008(class790 arg0) throws class168 {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      class584 var5 = class584.method8136((float)var1, (float)var2, (float)var3);
      if (var5.field5328 == -1.0F) {
         var5.field5328 = Float.POSITIVE_INFINITY;
      }

      if (var5.field5330 == -1.0F) {
         var5.field5330 = Float.POSITIVE_INFINITY;
      }

      if (var5.field5331 == -1.0F) {
         var5.field5331 = Float.POSITIVE_INFINITY;
      }

      Statics.field6895.method6374(var5);
      Statics.field6895.method6421((float)var4 / 1000.0F);
      var5.method8201();
   }

   @deob.ObfuscatedName("fs.aig(Lrs;B)V")
   private static final void method6505(class790 arg0) throws class168 {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      int var4 = arg0.field7203[arg0.field7204 + 3];
      class584 var5 = class584.method8136((float)var1, (float)var2, (float)var3);
      if (var5.field5328 == -1.0F) {
         var5.field5328 = Float.POSITIVE_INFINITY;
      }

      if (var5.field5330 == -1.0F) {
         var5.field5330 = Float.POSITIVE_INFINITY;
      }

      if (var5.field5331 == -1.0F) {
         var5.field5331 = Float.POSITIVE_INFINITY;
      }

      Statics.field6895.method6299(var5);
      Statics.field6895.method6296((float)var4 / 1000.0F);
      var5.method8201();
   }

   @deob.ObfuscatedName("rl.aid(Lrs;B)V")
   private static final void method14034(class790 arg0) throws class168 {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class584 var4 = class584.method8136((float)var1, (float)var2, (float)var3);
      Statics.field6895.method6300(var4);
      var4.method8201();
   }

   @deob.ObfuscatedName("ts.air(Lrs;I)V")
   private static final void method14918(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (Statics.field6895.method6320() == class444.field3672 && Statics.field6895.method6313() == class449.field3709) {
         class22 var2 = (class22)Statics.field6895.method6316();
         class182 var3 = (class182)Statics.field6895.method6373();
         class584 var4 = var2.method420();
         class584 var5 = class584.method8135(var4);
         var5.field5330 += (float)var1;
         class584 var6 = class584.method8152(var3.method2301(), var5);
         var6.method8146();
         float var7 = var2.method421().method8157();
         class596.method8380(var3.method2301(), var6, var4, var7, field7173);
         Object var8 = null;
         if (field7173[0] == null) {
            throw new RuntimeException("");
         } else {
            class584 var9;
            if (field7173[1] == null) {
               var9 = field7173[0];
            } else if (class584.method8152(var3.method2301(), field7173[0]).method8157() < class584.method8152(var3.method2301(), field7173[1]).method8157()) {
               var9 = field7173[1];
            } else {
               var9 = field7173[0];
            }

            float var10 = class652.method5901(var4.field5328 - var9.field5328, var4.field5331 - var9.field5331);
            arg0.field7203[++arg0.field7204 - 1] = 0;
            arg0.field7203[++arg0.field7204 - 1] = (int)((double)var10 * 2607.5945876176133D) & 16383;
         }
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("fn.aiw(Lrs;I)V")
   private static final void method6445(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      boolean var1 = arg0.field7203[arg0.field7204] == 1;
      boolean var2 = arg0.field7203[arg0.field7204 + 1] == 1;
      Statics.field6895.method6355(var1, var2);
   }

   @deob.ObfuscatedName("rp.aih(Lrs;I)V")
   private static final void method14069(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      float var2 = class603.method8577(arg0.field7203[arg0.field7204 + 1]);
      class260 var3 = Statics.field6895.method6380(var1);
      if (var3 == null) {
         throw new RuntimeException("");
      } else if (!(var3 instanceof class316)) {
         throw new RuntimeException("");
      } else {
         ((class316)var3).method3937(var2);
      }
   }

   @deob.ObfuscatedName("pc.aiv(Lrs;I)V")
   private static final void method10683(class790 arg0) throws class168 {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      float var2 = (float)arg0.field7203[arg0.field7204 + 1] / 1000.0F;
      Statics.field6895.method6308(var1, var2);
   }

   @deob.ObfuscatedName("tk.ait(Lrs;S)V")
   private static final void method14785(class790 arg0) throws class168 {
      int var1 = arg0.field7203[--arg0.field7204];
      class460 var2 = class460.method14541(var1);
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         Statics.field6895.method6297(var2);
      }
   }

   @deob.ObfuscatedName("nw.aiy(Lrs;B)V")
   private static final void method10033(class790 arg0) throws class168 {
      arg0.field7204 -= 4;
      float var1 = (float)arg0.field7203[arg0.field7204];
      float var2 = (float)arg0.field7203[arg0.field7204 + 1];
      float var3 = (float)arg0.field7203[arg0.field7204 + 2];
      float var4 = (float)arg0.field7203[arg0.field7204 + 3] / 1000.0F;
      Statics.field6895.method6302(class584.method8136(var1, var2, var3), var4);
   }

   @deob.ObfuscatedName("jw.aio(Lrs;I)V")
   private static final void method8033(class790 arg0) throws class168 {
      Statics.field6895.method6421((float)arg0.field7203[--arg0.field7204] / 1000.0F);
   }

   @deob.ObfuscatedName("pz.aiu(Lrs;I)V")
   private static final void method10987(class790 arg0) throws class168 {
      Statics.field6895.method6296((float)arg0.field7203[--arg0.field7204] / 1000.0F);
   }

   @deob.ObfuscatedName("ff.ain(Lrs;I)V")
   private static final void method6257(class790 arg0) throws class168 {
      arg0.field7204 -= 4;
      float var1 = (float)arg0.field7203[arg0.field7204];
      float var2 = (float)arg0.field7203[arg0.field7204 + 1];
      float var3 = (float)arg0.field7203[arg0.field7204 + 2];
      float var4 = (float)arg0.field7203[arg0.field7204 + 3] / 1000.0F;
      Statics.field6895.method6357(class584.method8136(var1, var2, var3), var4);
   }

   @deob.ObfuscatedName("pm.aik(Lrs;I)V")
   private static final void method10790(class790 arg0) throws class168 {
      arg0.field7204 -= 4;
      float var1 = (float)arg0.field7203[arg0.field7204];
      float var2 = (float)arg0.field7203[arg0.field7204 + 1];
      float var3 = (float)arg0.field7203[arg0.field7204 + 2];
      float var4 = (float)arg0.field7203[arg0.field7204 + 3] / 1000.0F;
      Statics.field6895.method6304(class584.method8136(var1, var2, var3), var4);
   }

   @deob.ObfuscatedName("un.aib(Lrs;I)V")
   private static final void method15216(class790 arg0) {
      boolean var1 = arg0.field7203[--arg0.field7204] == 1;
      if (var1) {
         Statics.field5998 = 2;
      } else {
         client.method6770();
      }

   }

   @deob.ObfuscatedName("cl.aip(Lrs;I)V")
   private static final void method4547(class790 arg0) {
      class385.method6554();
   }

   @deob.ObfuscatedName("am.aii(Lrs;I)V")
   private static final void method3947(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      Statics.method11332(var1);
   }

   @deob.ObfuscatedName("pz.aia(Lrs;I)V")
   private static final void method10983(class790 arg0) {
      class825.method2048();
   }

   @deob.ObfuscatedName("sm.aic(Lrs;I)V")
   private static final void method14354(class790 arg0) {
      arg0.field7205 -= 2;
      arg0.field7204 -= 2;
      class825.method10984((String)arg0.field7226[arg0.field7205], (String)arg0.field7226[arg0.field7205 + 1], arg0.field7203[arg0.field7204], arg0.field7203[arg0.field7204 + 1] == 1);
   }

   @deob.ObfuscatedName("dd.aiq(Lrs;I)V")
   private static final void method5379(class790 arg0) {
      class825.method5914(arg0.field7203[--arg0.field7204]);
   }

   @deob.ObfuscatedName("acs.aie(Lrs;I)V")
   private static final void method1090(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2832;
   }

   @deob.ObfuscatedName("g.ais(Lrs;I)V")
   private static final void method6575(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2815;
   }

   @deob.ObfuscatedName("fu.aif(Lrs;I)V")
   private static final void method6525(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2836;
   }

   @deob.ObfuscatedName("am.aiz(Lrs;I)V")
   private static final void method3948(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class825.method6900().method9329();
   }

   @deob.ObfuscatedName("of.aim(Lrs;I)V")
   private static final void method10198(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class825.method2350().method9329();
   }

   @deob.ObfuscatedName("aae.ajp(Lrs;I)V")
   private static final void method241(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class825.method10958().method9329();
   }

   @deob.ObfuscatedName("qr.aja(Lrs;I)V")
   private static final void method11312(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2833;
   }

   @deob.ObfuscatedName("eo.ajk(Lrs;I)V")
   private static final void method5927(class790 arg0) {
      class385.method16102();
   }

   @deob.ObfuscatedName("fr.ajb(Lrs;I)V")
   private static final void method6488(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2832;
   }

   @deob.ObfuscatedName("ri.ajo(Lrs;I)V")
   private static final void method11700(class790 arg0) {
      arg0.field7205 -= 2;
      String var1 = (String)arg0.field7226[arg0.field7205];
      String var2 = (String)arg0.field7226[arg0.field7205 + 1];
      class385.method16061(var1, var2);
   }

   @deob.ObfuscatedName("ct.ajs(Lrs;I)V")
   private static final void method5153(class790 arg0) {
      client.method5519(false);
   }

   @deob.ObfuscatedName("fy.ajv(Lrs;I)V")
   private static final void method6542(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2802;
   }

   @deob.ObfuscatedName("ij.ajd(Lrs;I)V")
   private static final void method7356(class790 arg0) {
      if (client.field2509 != null) {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      }

   }

   @deob.ObfuscatedName("pq.ajz(Lrs;B)V")
   private static final void method10851(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = (int)(client.field2397 >> 32);
      arg0.field7203[++arg0.field7204 - 1] = (int)(client.field2397 & -1L);
   }

   @deob.ObfuscatedName("va.ajc(Lrs;B)V")
   private static final void method15370(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2433 ? 1 : 0;
   }

   @deob.ObfuscatedName("mf.ajy(Lrs;I)V")
   private static final void method9263(class790 arg0) {
      client.field2433 = true;
      Statics.method4099();
   }

   @deob.ObfuscatedName("vh.ajm(Lrs;I)V")
   private static final void method15478(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2787;
      arg0.field7203[++arg0.field7204 - 1] = class385.field2831;
      arg0.field7203[++arg0.field7204 - 1] = class385.field2829;
      class385.field2787 = -2;
      class385.field2831 = -1;
      class385.field2829 = -1;
   }

   @deob.ObfuscatedName("kc.ajn(Lrs;I)V")
   private static final void method8264(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.method14262() ? 1 : 0;
   }

   @deob.ObfuscatedName("pq.ajt(Lrs;I)V")
   private static final void method10856(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2818;
   }

   @deob.ObfuscatedName("c.aju(Lrs;B)V")
   private static final void method4418(class790 arg0) {
      class385.method5385();
   }

   @deob.ObfuscatedName("ms.ajr(Lrs;I)V")
   private static final void method9463(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class385.method5807(var1);
   }

   @deob.ObfuscatedName("ai.aji(Lrs;I)V")
   private static final void method2951(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class385.field2801;
   }

   @deob.ObfuscatedName("sj.ajw(Lrs;I)V")
   private static final void method14346(class790 arg0) {
      if (client.field2409 != null) {
         arg0.field7226[++arg0.field7205 - 1] = client.field2409;
      } else {
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("li.ajf(Lrs;B)V")
   private static final void method8921(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      Statics.field9361.method1857(Statics.field9361.field955, var1);
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("sw.ajh(Lrs;I)V")
   private static final void method14512(class790 arg0) {
      boolean var1 = arg0.field7203[--arg0.field7204] == 1;
      Statics.field9361.method1857(Statics.field9361.field948, var1 ? 2 : 1);
      Statics.field9361.method1857(Statics.field9361.field968, var1 ? 2 : 1);
      client.method15057();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("zi.ajx(Lrs;I)V")
   private static final void method17069(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field982, arg0.field7203[--arg0.field7204] == 1 ? 1 : 0);
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("nt.aje(Lrs;I)V")
   private static final void method10008(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field962, arg0.field7203[--arg0.field7204]);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("qf.ajq(Lrs;I)V")
   private static final void method11113(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field958, arg0.field7203[--arg0.field7204] == 1 ? 1 : 0);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("sh.ajl(Lrs;B)V")
   private static final void method14328(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field971, arg0.field7203[--arg0.field7204] == 1 ? 1 : 0);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("zy.akc(Lrs;I)V")
   private static final void method17112(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field964, arg0.field7203[--arg0.field7204]);
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("ze.akp(Lrs;I)V")
   private static final void method17057(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field951, arg0.field7203[--arg0.field7204] == 1 ? 1 : 0);
      client.method7899();
      client.field2468.method9512().method11128();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("rm.akd(Lrs;B)V")
   private static final void method14041(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field975, arg0.field7203[--arg0.field7204] == 1 ? 2 : 0);
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("ee.aky(Lrs;I)V")
   private static final void method5727(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field986, arg0.field7203[--arg0.field7204] == 1 ? 1 : 0);
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("rc.akr(Lrs;B)V")
   private static final void method11597(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field946, arg0.field7203[--arg0.field7204]);
      client.method5788(Statics.field9361.field974.method2236(), false);
      class29.method7336();
   }

   @deob.ObfuscatedName("gc.akg(Lrs;I)V")
   private static final void method6593(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field989, arg0.field7203[--arg0.field7204] == 1 ? 1 : 0);
      class677.method4068();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("ud.aki(Lrs;I)V")
   private static final void method15093(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field984, arg0.field7203[--arg0.field7204]);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("br.akf(Lrs;B)V")
   private static final void method4217(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      int var2 = Statics.field9361.field987.method2319();
      if (var1 != var2) {
         if (client.method6612(client.field2410)) {
            if (var2 == 0 && class677.field6149 != -1) {
               class417.method15349(Statics.field6467, class677.field6149, 0, var1, false);
               class677.method8735();
               class677.field6153 = false;
            } else if (var1 == 0) {
               Statics.method1797();
               class677.field6153 = false;
            } else {
               class417.method9121(var1);
            }
         }

         Statics.field9361.method1857(Statics.field9361.field987, var1);
         class29.method7336();
         client.field2419 = false;
      }

   }

   @deob.ObfuscatedName("aq.akl(Lrs;I)V")
   private static final void method4004(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field985, arg0.field7203[--arg0.field7204]);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("fz.aku(Lrs;B)V")
   private static final void method6552(class790 arg0) {
      int var1 = Statics.field9361.field948.method2071();
      Statics.field9361.method1857(Statics.field9361.field968, arg0.field7203[--arg0.field7204] == 1 ? 0 : var1);
      client.method15057();
   }

   @deob.ObfuscatedName("da.akb(Lrs;I)V")
   private static final void method5343(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      Statics.field9361.method1857(Statics.field9361.field965, var1);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("vm.akz(Lrs;I)V")
   private static final void method15556(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field952, arg0.field7203[--arg0.field7204]);
      class29.method7336();
   }

   @deob.ObfuscatedName("at.akt(Lrs;I)V")
   private static final void method4045(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field961, arg0.field7203[--arg0.field7204]);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("lv.akm(Lrs;I)V")
   private static final void method9125(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 < 0 || var1 > 1) {
         var1 = 0;
      }

      client.method4043(var1 == 1);
   }

   @deob.ObfuscatedName("w.akk(Lrs;I)V")
   private static final void method15731(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field978, arg0.field7203[--arg0.field7204] != 0 ? 1 : 0);
      class29.method7336();
   }

   @deob.ObfuscatedName("dy.akw(Lrs;B)V")
   private static final void method5637(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field962, arg0.field7203[--arg0.field7204]);
      class29.method7336();
   }

   private static final void dns(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field960, arg0.field7203[--arg0.field7204] != 0 ? 1 : 0);
      class29.method7336();
      client.field2468.method9531();
   }

   @deob.ObfuscatedName("g.aks(Lrs;B)V")
   private static final void method6574(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field960, arg0.field7203[--arg0.field7204] != 0 ? 1 : 0);
      class29.method7336();
      client.field2468.method9531();
   }

   @deob.ObfuscatedName("cc.akj(Lrs;I)V")
   private static final void method4456(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 < 0 || var1 > 5) {
         var1 = 2;
      }

      client.method5788(var1, false);
   }

   @deob.ObfuscatedName("mp.ake(Lrs;B)V")
   private static final void method9418(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      boolean var2 = arg0.field7203[arg0.field7204 + 1] == 1;
      Statics.field9361.method1857(Statics.field9361.field979, var1);
      if (!var2) {
         Statics.field9361.method1857(Statics.field9361.field966, 0);
      }

      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("yd.aka(Lrs;I)V")
   private static final void method16085(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field980, arg0.field7203[--arg0.field7204]);
      class29.method7336();
   }

   @deob.ObfuscatedName("jd.akq(Lrs;I)V")
   private static final void method7916(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field973, arg0.field7203[--arg0.field7204]);
      class29.method7336();
      client.field2429 = true;
   }

   @deob.ObfuscatedName("ot.akx(Lrs;I)V")
   private static final void method10462(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field969, arg0.field7203[--arg0.field7204]);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("sp.akv(Lrs;I)V")
   private static final void method14380(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 > 255 || var1 < 0) {
         var1 = 0;
      }

      if (var1 != Statics.field9361.field981.method2179()) {
         Statics.field9361.method1857(Statics.field9361.field981, var1);
         class29.method7336();
         client.field2419 = false;
      }

   }

   @deob.ObfuscatedName("wl.ako(Lrs;I)V")
   private static final void method15841(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 != Statics.field9361.field970.method2189()) {
         Statics.field9361.method1857(Statics.field9361.field970, var1);
         class29.method7336();
         client.field2419 = false;
      }

   }

   @deob.ObfuscatedName("nx.alw(Lrs;I)V")
   private static final void method10060(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field955.method1996();
   }

   @deob.ObfuscatedName("qq.ald(Lrs;I)V")
   private static final void method11295(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field948.method2071() == 2 ? 1 : 0;
   }

   @deob.ObfuscatedName("nc.alm(Lrs;B)V")
   private static final void method9724(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field982.method2079() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("sy.ala(Lrs;I)V")
   private static final void method14544(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field962.method2148();
   }

   @deob.ObfuscatedName("py.all(Lrs;I)V")
   private static final void method10955(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field971.method2104() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("ro.alo(Lrs;I)V")
   private static final void method14061(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field964.method2210();
   }

   @deob.ObfuscatedName("afk.ale(Lrs;B)V")
   private static final void method2145(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field975.method2254() == 2 ? 1 : 0;
   }

   @deob.ObfuscatedName("qz.alu(Lrs;I)V")
   private static final void method11467(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field986.method2119() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("qh.ali(Lrs;B)V")
   private static final void method11182(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field946.method2226();
   }

   @deob.ObfuscatedName("pa.alq(Lrs;B)V")
   private static final void method10659(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field989.method2220() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("ri.aln(Lrs;I)V")
   private static final void method11699(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field984.method2319();
   }

   @deob.ObfuscatedName("me.alr(Lrs;I)V")
   private static final void method9258(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field987.method2319();
   }

   @deob.ObfuscatedName("sj.alc(Lrs;B)V")
   private static final void method14342(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field985.method2319();
   }

   @deob.ObfuscatedName("mn.alf(Lrs;B)V")
   private static final void method9398(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = class764.method5741();
   }

   @deob.ObfuscatedName("u.alg(Lrs;I)V")
   private static final void method15064(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field952.method2226();
   }

   @deob.ObfuscatedName("zi.alb(Lrs;I)V")
   private static final void method17070(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field961.method2096();
   }

   @deob.ObfuscatedName("qz.aly(Lrs;I)V")
   private static final void method11465(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field954.method2163() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("ek.alk(Lrs;B)V")
   private static final void method5799(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field978.method2381() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("oi.alv(Lrs;B)V")
   private static final void method10294(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field962.method2148();
   }

   @deob.ObfuscatedName("ny.alt(Lrs;I)V")
   private static final void method10099(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field960.method2128() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("p.alh(Lrs;I)V")
   private static final void method10655(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field974.method2236();
   }

   @deob.ObfuscatedName("pq.alx(Lrs;B)V")
   private static final void method10850(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field979.method2236();
   }

   @deob.ObfuscatedName("s.alj(Lrs;B)V")
   private static final void method14233(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field980.method2087();
   }

   @deob.ObfuscatedName("ru.alp(Lrs;B)V")
   private static final void method14169(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field972.method2268() == 1 ? 1 : 0;
   }

   @deob.ObfuscatedName("lg.ams(Lrs;I)V")
   private static final void method8891(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.method11313(Statics.field9361.field974.method2236(), 200);
   }

   @deob.ObfuscatedName("iq.amt(Lrs;B)V")
   private static final void method7393(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field973.method2137();
   }

   @deob.ObfuscatedName("lo.amd(Lrs;I)V")
   private static final void method8992(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2398 ? 1 : 0;
   }

   @deob.ObfuscatedName("kl.amc(Lrs;I)V")
   private static final void method8353(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field981.method2179();
   }

   @deob.ObfuscatedName("kf.amw(Lrs;I)V")
   private static final void method8283(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field963.method2099();
   }

   @deob.ObfuscatedName("eg.amr(Lrs;I)V")
   private static final void method5769(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8859.field845 >= 512 && !client.field2398 && !client.field2415 ? 0 : 1;
   }

   @deob.ObfuscatedName("sy.amo(Lrs;B)V")
   private static final void method14542(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2399 ? 1 : 0;
   }

   @deob.ObfuscatedName("ee.ami(Lrs;I)V")
   private static final void method5728(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field970.method2189();
   }

   @deob.ObfuscatedName("qi.amx(Lrs;I)V")
   private static final void method11186(class790 arg0) {
      arg0.field7204 -= 2;
      client.field2559 = (short)arg0.field7203[arg0.field7204];
      if (client.field2559 <= 0) {
         client.field2559 = 256;
      }

      client.field2664 = (short)arg0.field7203[arg0.field7204 + 1];
      if (client.field2664 <= 0) {
         client.field2664 = 205;
      }

   }

   @deob.ObfuscatedName("rx.amf(Lrs;B)V")
   private static final void method14198(class790 arg0) {
      arg0.field7204 -= 2;
      client.field2683 = (short)arg0.field7203[arg0.field7204];
      if (client.field2683 <= 0) {
         client.field2683 = 256;
      }

      client.field2627 = (short)arg0.field7203[arg0.field7204 + 1];
      if (client.field2627 <= 0) {
         client.field2627 = 320;
      }

   }

   @deob.ObfuscatedName("ry.amh(Lrs;I)V")
   private static final void method14216(class790 arg0) {
      arg0.field7204 -= 4;
      client.field2629 = (short)arg0.field7203[arg0.field7204];
      if (client.field2629 <= 0) {
         client.field2629 = 1;
      }

      client.field2686 = (short)arg0.field7203[arg0.field7204 + 1];
      if (client.field2686 <= 0) {
         client.field2686 = 32767;
      } else if (client.field2686 < client.field2629) {
         client.field2686 = client.field2629;
      }

      client.field2687 = (short)arg0.field7203[arg0.field7204 + 2];
      if (client.field2687 <= 0) {
         client.field2687 = 1;
      }

      client.field2688 = (short)arg0.field7203[arg0.field7204 + 3];
      if (client.field2688 <= 0) {
         client.field2688 = 32767;
      } else if (client.field2688 < client.field2687) {
         client.field2688 = client.field2687;
      }

   }

   @deob.ObfuscatedName("ct.ama(Lrs;B)V")
   private static final void method5158(class790 arg0) {
      Statics.method4098(0, 0, client.field2601.field3405, client.field2601.field3557, false);
      arg0.field7203[++arg0.field7204 - 1] = client.field2431;
      arg0.field7203[++arg0.field7204 - 1] = client.field2692;
   }

   @deob.ObfuscatedName("ic.amm(Lrs;B)V")
   private static final void method7306(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2559;
      arg0.field7203[++arg0.field7204 - 1] = client.field2664;
   }

   @deob.ObfuscatedName("na.amb(Lrs;I)V")
   private static final void method9710(class790 arg0) {
      long var1 = class431.method2169();
      arg0.field7203[++arg0.field7204 - 1] = (int)(var1 / 60000L);
   }

   @deob.ObfuscatedName("rx.amj(Lrs;I)V")
   private static final void method14199(class790 arg0) {
      long var1 = class431.method2169();
      arg0.field7203[++arg0.field7204 - 1] = (int)(var1 / 86400000L) - 11745;
   }

   @deob.ObfuscatedName("ug.aml(Lrs;S)V")
   private static final void method15140(class790 arg0) {
      long var1 = class431.method2169();
      arg0.field7203[++arg0.field7204 - 1] = class902.method9493(var1);
   }

   @deob.ObfuscatedName("ev.amu(Lrs;I)V")
   private static final void method6104(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      boolean var2 = true;
      if (var1 < 0) {
         var2 = (var1 + 1) % 4 == 0;
      } else if (var1 < 1582) {
         var2 = var1 % 4 == 0;
      } else if (var1 % 4 != 0) {
         var2 = false;
      } else if (var1 % 100 != 0) {
         var2 = true;
      } else if (var1 % 400 != 0) {
         var2 = false;
      }

      arg0.field7203[++arg0.field7204 - 1] = var2 ? 1 : 0;
   }

   @deob.ObfuscatedName("mh.amy(Lrs;B)V")
   private static final void method9278(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = (int)(class902.method9394(var1) / 60000L);
   }

   @deob.ObfuscatedName("kp.amg(Lrs;B)V")
   private static final void method8524(class790 arg0) {
      if (client.field2410 == 15 && !class385.method14262()) {
         if (class861.field8793) {
            arg0.field7203[++arg0.field7204 - 1] = 0;
         } else if (Statics.field7307 > class431.method2169() - 1000L) {
            arg0.field7203[++arg0.field7204 - 1] = 1;
         } else {
            class861.field8793 = true;
            class109 var1 = class109.method15110(ClientProt.WORLDLIST_FETCH, client.field2462.field832);
            var1.field814.method1572(Statics.field6956);
            client.field2462.method1408(var1);
            arg0.field7203[++arg0.field7204 - 1] = 0;
         }

      } else {
         arg0.field7203[++arg0.field7204 - 1] = 1;
      }
   }

   @deob.ObfuscatedName("nw.ame(Lrs;I)V")
   private static final void method10034(class790 arg0) {
      class114 var1 = class861.method5684();
      if (var1 != null) {
         arg0.field7203[++arg0.field7204 - 1] = var1.field897;
         arg0.field7203[++arg0.field7204 - 1] = var1.field6944;
         arg0.field7226[++arg0.field7205 - 1] = var1.field896;
         class753 var2 = var1.method1493();
         arg0.field7203[++arg0.field7204 - 1] = var2.field6948;
         arg0.field7226[++arg0.field7205 - 1] = var2.field6947;
         arg0.field7203[++arg0.field7204 - 1] = var1.field6946;
         arg0.field7203[++arg0.field7204 - 1] = var1.field895;
         arg0.field7226[++arg0.field7205 - 1] = var1.field894;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("rx.amz(Lrs;B)V")
   private static final void method14200(class790 arg0) {
      class114 var1 = class861.method7438();
      if (var1 != null) {
         arg0.field7203[++arg0.field7204 - 1] = var1.field897;
         arg0.field7203[++arg0.field7204 - 1] = var1.field6944;
         arg0.field7226[++arg0.field7205 - 1] = var1.field896;
         class753 var2 = var1.method1493();
         arg0.field7203[++arg0.field7204 - 1] = var2.field6948;
         arg0.field7226[++arg0.field7205 - 1] = var2.field6947;
         arg0.field7203[++arg0.field7204 - 1] = var1.field6946;
         arg0.field7203[++arg0.field7204 - 1] = var1.field895;
         arg0.field7226[++arg0.field7205 - 1] = var1.field894;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("le.anh(Lrs;B)V")
   private static final void method8877(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class114 var2 = class755.method5207(var1);
      if (var2 != null) {
         arg0.field7203[++arg0.field7204 - 1] = var2.field6944;
         arg0.field7226[++arg0.field7205 - 1] = var2.field896;
         class753 var3 = var2.method1493();
         arg0.field7203[++arg0.field7204 - 1] = var3.field6948;
         arg0.field7226[++arg0.field7205 - 1] = var3.field6947;
         arg0.field7203[++arg0.field7204 - 1] = var2.field6946;
         arg0.field7203[++arg0.field7204 - 1] = var2.field895;
         arg0.field7226[++arg0.field7205 - 1] = var2.field894;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = -1;
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7203[++arg0.field7204 - 1] = 0;
         arg0.field7226[++arg0.field7205 - 1] = "";
      }

   }

   @deob.ObfuscatedName("fn.any(Lrs;I)V")
   private static final void method6446(class790 arg0) {
      arg0.field7204 -= 4;
      int var1 = arg0.field7203[arg0.field7204];
      boolean var2 = arg0.field7203[arg0.field7204 + 1] == 1;
      int var3 = arg0.field7203[arg0.field7204 + 2];
      boolean var4 = arg0.field7203[arg0.field7204 + 3] == 1;
      class861.method15877(var1, var2, var3, var4);
   }

   @deob.ObfuscatedName("fy.anf(Lrs;I)V")
   private static final void method6543(class790 arg0) {
      if (client.field2410 == 15) {
         class861.field8799 = arg0.field7203[--arg0.field7204] == 1;
      }
   }

   @deob.ObfuscatedName("aiu.anz(Lrs;I)V")
   private static final void method3349(class790 arg0) {
      class114 var1 = class861.method14183();
      arg0.field7203[++arg0.field7204 - 1] = var1 == null ? 0 : var1.field6944;
   }

   @deob.ObfuscatedName("ny.anv(Lrs;I)V")
   private static final void method10100(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2593;
   }

   @deob.ObfuscatedName("gl.ano(Lrs;I)V")
   private static final void method6742(class790 arg0) {
      int var1 = client.field2594.method15321();
      if (client.field2593 != -1) {
         ++var1;
      }

      arg0.field7203[++arg0.field7204 - 1] = var1;
   }

   @deob.ObfuscatedName("qz.anx(Lrs;B)V")
   private static final void method11468(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (client.field2593 != -1) {
         if (var1 == 0) {
            arg0.field7203[++arg0.field7204 - 1] = client.field2593;
            return;
         }

         --var1;
      }

      class118 var2 = (class118)client.field2594.method15313();

      while(var1-- > 0) {
         var2 = (class118)client.field2594.method15314();
      }

      arg0.field7203[++arg0.field7204 - 1] = var2.field911;
   }

   @deob.ObfuscatedName("ne.anm(Lrs;I)V")
   private static final void method9732(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (Statics.field844[var1] == null) {
         arg0.field7226[++arg0.field7205 - 1] = "";
      } else {
         String var2 = Statics.field844[var1].field3569[0].field3438;
         if (var2 == null) {
            arg0.field7226[++arg0.field7205 - 1] = "";
         } else {
            arg0.field7226[++arg0.field7205 - 1] = var2.substring(0, var2.indexOf(58));
         }
      }

   }

   @deob.ObfuscatedName("abu.ana(Lrs;I)V")
   private static final void method762(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (Statics.field844[var1] == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field844[var1].field3569.length;
      }

   }

   @deob.ObfuscatedName("ev.ant(Lrs;B)V")
   private static final void method6105(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (Statics.field844[var1] == null) {
         arg0.field7226[++arg0.field7205 - 1] = "";
      } else {
         String var3 = Statics.field844[var1].field3569[var2].field3438;
         if (var3 == null) {
            arg0.field7226[++arg0.field7205 - 1] = "";
         } else {
            arg0.field7226[++arg0.field7205 - 1] = var3;
         }
      }

   }

   @deob.ObfuscatedName("gb.ann(Lrs;B)V")
   private static final void method6581(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (Statics.field844[var1] == null) {
         arg0.field7203[++arg0.field7204 - 1] = 0;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field844[var1].field3569[var2].field3399;
      }

   }

   @deob.ObfuscatedName("tz.anj(Lrs;B)V")
   private static final void method15059(class790 arg0) {
   }

   @deob.ObfuscatedName("aeq.anq(Lrs;I)V")
   private static final void method1886(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(1, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("pf.ani(Lrs;B)V")
   private static final void method10709(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(2, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("er.ane(Lrs;B)V")
   private static final void method5958(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(3, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("ag.ang(Lrs;I)V")
   private static final void method2288(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(5, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("ig.anu(Lrs;B)V")
   private static final void method7345(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(6, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("acr.anp(Lrs;I)V")
   private static final void method1074(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(7, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("tu.anb(Lrs;B)V")
   private static final void method14948(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(8, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("pn.anw(Lrs;B)V")
   private static final void method10807(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(9, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("rj.and(Lrs;I)V")
   private static final void method11729(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      client.method14178(10, var1 << 16 | var2, var3, "");
   }

   @deob.ObfuscatedName("iv.anr(Lrs;B)V")
   private static final void method7430(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      class425 var4 = Statics.method886(var1 << 16 | var2, var3);
      client.method14495();
      class58 var5 = client.method4871(var4);
      client.method5929(var4, var5.method911(), var5.field434);
   }

   @deob.ObfuscatedName("qc.anl(Lrs;B)V")
   private static final void method11083(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = field7170;
   }

   @deob.ObfuscatedName("ou.aoi(Lrs;I)V")
   private static final void method10471(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class733 var2 = Statics.field6782.method10685(var1);
      if (var2.field6729 == null) {
         arg0.field7226[++arg0.field7205 - 1] = "";
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var2.field6729;
      }

   }

   @deob.ObfuscatedName("agz.aol(Lrs;B)V")
   private static final void method2472(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class733 var2 = Statics.field6782.method10685(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field6727;
   }

   @deob.ObfuscatedName("fq.aoz(Lrs;I)V")
   private static final void method6479(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class733 var2 = Statics.field6782.method10685(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field6730;
   }

   @deob.ObfuscatedName("jl.aoj(Lrs;I)V")
   private static final void method7966(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class733 var2 = Statics.field6782.method10685(var1);
      arg0.field7203[++arg0.field7204 - 1] = var2.field6735;
   }

   @deob.ObfuscatedName("ev.aon(Lrs;B)V")
   private static final void method6110(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class923 var3 = Statics.field5946.method15930(var2);
      if (var3.method15884()) {
         arg0.field7226[++arg0.field7205 - 1] = Statics.field6782.method10685(var1).method10827(var2, var3.field9389);
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field6782.method10685(var1).method10826(var2, var3.field9388);
      }

   }

   @deob.ObfuscatedName("ao.aoh(Lrs;S)V")
   private static final void method3990(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2635 && !client.field2680 ? 1 : 0;
   }

   @deob.ObfuscatedName("ot.aor(Lrs;I)V")
   private static final void method10459(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = (int)(Statics.field9348 / 60000L);
      arg0.field7203[++arg0.field7204 - 1] = (int)((Statics.field9348 - class431.method2169() - Statics.field8538) / 60000L);
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9073 ? 1 : 0;
   }

   @deob.ObfuscatedName("pg.aox(Lrs;I)V")
   private static final void method10715(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field6798;
   }

   @deob.ObfuscatedName("aga.aob(Lrs;I)V")
   private static final void method2295(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field7025;
   }

   @deob.ObfuscatedName("ta.aof(Lrs;I)V")
   private static final void method14594(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9868;
   }

   @deob.ObfuscatedName("pc.aoc(Lrs;I)V")
   private static final void method10681(class790 arg0) {
      String var1 = null;
      if (Statics.field2285 != null) {
         var1 = Statics.field2285.method4411();
      }

      if (var1 == null) {
         var1 = "";
      }

      arg0.field7226[++arg0.field7205 - 1] = var1;
   }

   @deob.ObfuscatedName("cb.aou(Lrs;I)V")
   private static final void method4443(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8518;
   }

   @deob.ObfuscatedName("ly.aod(Lrs;I)V")
   private static final void method9177(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8467;
   }

   @deob.ObfuscatedName("vd.aow(Lrs;I)V")
   private static final void method15428(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field10597;
   }

   @deob.ObfuscatedName("gy.aog(Lrs;I)V")
   private static final void method6902(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8665 ? 1 : 0;
   }

   @deob.ObfuscatedName("jc.aok(Lrs;I)V")
   private static final void method7903(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field6495;
   }

   @deob.ObfuscatedName("qo.aoo(Lrs;I)V")
   private static final void method11278(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8478;
   }

   @deob.ObfuscatedName("np.aoe(Lrs;I)V")
   private static final void method9964(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field6667;
   }

   @deob.ObfuscatedName("ajl.aos(Lrs;I)V")
   private static final void method3470(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field4780;
   }

   @deob.ObfuscatedName("pk.aop(Lrs;I)V")
   private static final void method10745(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field7164 ? 1 : 0;
   }

   @deob.ObfuscatedName("iy.aom(Lrs;B)V")
   private static final void method7455(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field8650;
   }

   @deob.ObfuscatedName("ff.aov(Lrs;B)V")
   private static final void method6254(class790 arg0) {
      int var1 = class29.method10719();
      arg0.field7203[++arg0.field7204 - 1] = Statics.field2388 = Statics.field9361.field974.method2236();
      arg0.field7203[++arg0.field7204 - 1] = var1;
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("ml.aoy(Lrs;B)V")
   private static final void method9391(class790 arg0) {
      class29.method9130();
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("if.aoa(Lrs;B)V")
   private static final void method7339(class790 arg0) {
      class29.method5683();
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("ady.aoq(Lrs;I)V")
   private static final void method1396(class790 arg0) {
      Statics.method8993();
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("ta.aot(Lrs;B)V")
   private static final void method14598(class790 arg0) {
      class29.method9719(true);
      client.field2468.method9531();
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("vf.apg(Lrs;I)V")
   private static final void method15442(class790 arg0) {
      Statics.field9361.method1857(Statics.field9361.field966, 0);
      class29.method7336();
      client.field2419 = false;
   }

   @deob.ObfuscatedName("js.apq(Lrs;I)V")
   private static final void method8009(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field966.method2172();
   }

   @deob.ObfuscatedName("vz.apf(Lrs;B)V")
   private static final void method15727(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      if (var1 != -1) {
         if (var2 > 255) {
            var2 = 255;
         } else if (var2 < 0) {
            var2 = 0;
         }

         class817.method486(var1, var2, false);
      }

   }

   @deob.ObfuscatedName("gl.apa(Lrs;I)V")
   private static final void method6739(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 != -1) {
         class817.method8682(var1);
      }

   }

   @deob.ObfuscatedName("ev.apz(Lrs;I)V")
   private static final void method6106(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (var1 != -1) {
         class817.method5482(var1);
      }

   }

   @deob.ObfuscatedName("adx.apo(Lrs;B)V")
   private static final void method1395(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field3855.method9972("jagtheora") ? 1 : 0;
   }

   @deob.ObfuscatedName("pw.apj(Lrs;I)V")
   private static final void method10944(class790 arg0) {
      boolean var1 = false;
      if (client.field2390) {
         try {
            Object var2 = class573.field5183.method7989(new Object[]{Statics.field6495, Statics.field5701.field1396 == 1, arg0.field7203[--arg0.field7204]});
            if (var2 != null) {
               var1 = (Boolean)var2;
            }
         } catch (Throwable var4) {
         }
      }

      arg0.field7203[++arg0.field7204 - 1] = var1 ? 1 : 0;
   }

   @deob.ObfuscatedName("jc.apn(Lrs;I)V")
   private static final void method7906(class790 arg0) {
      if (client.field2390) {
         class573.field5184.method7991();
      }

   }

   @deob.ObfuscatedName("mg.aph(Lrs;S)V")
   private static final void method9273(class790 arg0) {
      if (client.field2390) {
         class573.field5185.method7991();
      }

   }

   @deob.ObfuscatedName("nw.apk(Lrs;S)V")
   private static final void method10040(class790 arg0) {
      boolean var1 = true;
      if (client.field2390) {
         try {
            Object var2 = class573.field5189.method7996();
            if (var2 != null) {
               var1 = (Boolean)var2;
            }
         } catch (Throwable var4) {
         }
      }

      arg0.field7203[++arg0.field7204 - 1] = var1 ? 1 : 0;
   }

   @deob.ObfuscatedName("jq.apb(Lrs;S)V")
   private static final void method7985(class790 arg0) {
      boolean var1 = true;
      String var2 = (String)arg0.field7226[--arg0.field7205];
      if (client.field2390) {
         try {
            Object var3 = class573.field5190.method7989(new Object[]{var2});
            if (var3 != null) {
               var1 = (Boolean)var3;
            }
         } catch (Throwable var5) {
         }
      }

      arg0.field7203[++arg0.field7204 - 1] = var1 ? 1 : 0;
   }

   @deob.ObfuscatedName("ef.apw(Lrs;I)V")
   private static final void method5743(class790 arg0) {
      boolean var1 = false;
      String var2 = (String)arg0.field7226[--arg0.field7205];
      if (client.field2390) {
         try {
            Object var3 = class573.field5179.method7989(new Object[]{var2});
            if (var3 != null) {
               var1 = (Boolean)var3;
            }
         } catch (Throwable var5) {
         }
      }

      arg0.field7203[++arg0.field7204 - 1] = var1 ? 1 : 0;
   }

   @deob.ObfuscatedName("jm.apy(Lrs;B)V")
   private static final void method7974(class790 arg0) {
      String var1 = (String)arg0.field7226[--arg0.field7205];
      if (client.field2390) {
         try {
            class573.field5191.method7989(new Object[]{var1});
         } catch (Throwable var3) {
         }
      }

   }

   @deob.ObfuscatedName("aw.apx(Lrs;I)V")
   private static final void method4066(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field982.method2082() ? 1 : 0;
   }

   @deob.ObfuscatedName("qv.apl(Lrs;B)V")
   private static final void method11383(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field971.method2105() ? 1 : 0;
   }

   @deob.ObfuscatedName("xj.apc(Lrs;I)V")
   private static final void method16014(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field964.method2203() ? 1 : 0;
   }

   @deob.ObfuscatedName("ol.ape(Lrs;B)V")
   private static final void method10323(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field975.method2251() ? 1 : 0;
   }

   @deob.ObfuscatedName("agn.apr(Lrs;I)V")
   private static final void method2432(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field952.method2227() && Statics.field8847.method7495() ? 1 : 0;
   }

   @deob.ObfuscatedName("gd.api(Lrs;I)V")
   private static final void method6610(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field965.method2060() ? 1 : 0;
   }

   @deob.ObfuscatedName("lh.aps(Lrs;I)V")
   private static final void method8897(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field961.method2093() ? 1 : 0;
   }

   @deob.ObfuscatedName("ff.apv(Lrs;I)V")
   private static final void method6255(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field954.method2162() && Statics.field8847.method7492() ? 1 : 0;
   }

   @deob.ObfuscatedName("fk.apu(Lrs;B)V")
   private static final void method6286(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field960.method2135() ? 1 : 0;
   }

   @deob.ObfuscatedName("dd.app(Lrs;B)V")
   private static final void method5380(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field972.method2270() ? 1 : 0;
   }

   @deob.ObfuscatedName("nh.apm(Lrs;B)V")
   private static final void method9841(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field973.method2136() ? 1 : 0;
   }

   @deob.ObfuscatedName("s.apd(Lrs;I)V")
   private static final void method14234(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field986.method2120() ? 1 : 0;
   }

   @deob.ObfuscatedName("sr.aqf(Lrs;I)V")
   private static final void method14450(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field963.method2101() ? 1 : 0;
   }

   @deob.ObfuscatedName("ei.aqq(Lrs;S)V")
   private static final void method5787(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field979.method2238() ? 1 : 0;
   }

   @deob.ObfuscatedName("ml.aqp(Lrs;I)V")
   private static final void method9392(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field970.method2187() ? 1 : 0;
   }

   @deob.ObfuscatedName("pw.aqk(Lrs;I)V")
   private static final void method10943(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field982.method1446(var1);
   }

   @deob.ObfuscatedName("qt.aqa(Lrs;B)V")
   private static final void method11348(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field971.method1446(var1);
   }

   @deob.ObfuscatedName("ot.aqn(Lrs;I)V")
   private static final void method10460(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field964.method1446(var1);
   }

   @deob.ObfuscatedName("gv.aqv(Lrs;B)V")
   private static final void method6882(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field975.method1446(var1);
   }

   @deob.ObfuscatedName("ir.aqi(Lrs;I)V")
   private static final void method7400(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (!Statics.field8847.method7495()) {
         arg0.field7203[++arg0.field7204 - 1] = 3;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field952.method1446(var1);
      }

   }

   @deob.ObfuscatedName("ak.aqh(Lrs;I)V")
   private static final void method3614(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field961.method1446(var1);
   }

   @deob.ObfuscatedName("fu.aql(Lrs;I)V")
   private static final void method6526(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      if (!Statics.field8847.method7492()) {
         arg0.field7203[++arg0.field7204 - 1] = 3;
      } else {
         arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field954.method1446(var1);
      }

   }

   @deob.ObfuscatedName("kc.aqd(Lrs;I)V")
   private static final void method8263(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field960.method1446(var1);
   }

   @deob.ObfuscatedName("ek.aqe(Lrs;B)V")
   private static final void method5795(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field972.method1446(var1);
   }

   @deob.ObfuscatedName("fb.aqt(Lrs;B)V")
   private static final void method6221(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field973.method1446(var1);
   }

   @deob.ObfuscatedName("no.aqs(Lrs;I)V")
   private static final void method9958(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field979.method1446(var1);
   }

   @deob.ObfuscatedName("qw.aqb(Lrs;I)V")
   private static final void method11426(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7203[++arg0.field7204 - 1] = Statics.field9361.field970.method1446(var1);
   }

   @deob.ObfuscatedName("te.aqc(Lrs;I)V")
   private static final void method14631(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7216.field72;
   }

   @deob.ObfuscatedName("py.aqm(Lrs;B)V")
   private static final void method10961(class790 arg0) {
      class379 var1 = arg0.field7216.method97();
      if (var1 == null) {
         arg0.field7226[++arg0.field7205 - 1] = "";
      } else {
         arg0.field7226[++arg0.field7205 - 1] = var1.method5164();
      }

   }

   @deob.ObfuscatedName("re.aqu(Lrs;I)V")
   private static final void method11649(class790 arg0) {
      arg0.field7226[++arg0.field7205 - 1] = ((class211)arg0.field7216).method2862(true);
   }

   @deob.ObfuscatedName("tx.aqj(Lrs;B)V")
   private static final void method15039(class790 arg0) {
      arg0.field7204 -= 2;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      class778 var3;
      if (arg0.field7219) {
         var3 = arg0.field7212;
      } else {
         var3 = arg0.field7223;
      }

      arg0.field7203[++arg0.field7204 - 1] = var3.method11664(arg0.field7216.field20, var1, var2) ? 1 : 0;
   }

   @deob.ObfuscatedName("qi.aqy(Lrs;B)V")
   private static final void method11187(class790 arg0) {
      arg0.field7204 -= 3;
      int var1 = arg0.field7203[arg0.field7204];
      int var2 = arg0.field7203[arg0.field7204 + 1];
      int var3 = arg0.field7203[arg0.field7204 + 2];
      method11045(arg0.field7216.field20, var1 & 65535, var2, var3, arg0.field7219, arg0);
   }

   @deob.ObfuscatedName("ud.aqg(Lrs;B)V")
   private static final void method15090(class790 arg0) {
      class200 var1 = (class200)arg0.field7216;
      String var2 = var1.field1302;
      class915 var3 = var1.field1312;
      if (var3.field9319 != null) {
         class915 var4 = var3.method15778(Statics.field10637);
         if (var4 == null) {
            var2 = "";
         } else {
            var2 = var4.field9282;
         }
      }

      if (var2 == null) {
         var2 = "";
      }

      arg0.field7226[++arg0.field7205 - 1] = var2;
   }

   @deob.ObfuscatedName("du.aqo(Lrs;I)V")
   private static final void method5537(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class778 var2;
      if (arg0.field7219) {
         var2 = arg0.field7212;
      } else {
         var2 = arg0.field7223;
      }

      arg0.field7203[++arg0.field7204 - 1] = var2.method11664(arg0.field7216.field20, var1, -1) ? 1 : 0;
   }

   @deob.ObfuscatedName("ev.arn(Lrs;I)V")
   private static final void method6107(class790 arg0) {
      client.method9713(arg0.field7216, arg0.field7203[--arg0.field7204]);
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[0];
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[1];
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[2];
   }

   @deob.ObfuscatedName("jh.arg(Lrs;I)V")
   private static final void method7944(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2601 == null ? -1 : client.field2601.field3465;
   }

   @deob.ObfuscatedName("qg.are(Lrs;I)V")
   private static final void method11165(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7216.method162();
   }

   @deob.ObfuscatedName("py.ark(Lrs;I)V")
   private static final void method10956(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      class200 var2 = (class200)arg0.field7216;
      int var3 = var2.method2794(var1);
      int var4 = var2.method2796(var1);
      arg0.field7203[++arg0.field7204 - 1] = var3;
      arg0.field7203[++arg0.field7204 - 1] = var4;
   }

   @deob.ObfuscatedName("ct.arj(Lrs;I)V")
   private static final void method5154(class790 arg0) {
      class200 var1 = (class200)arg0.field7216;
      boolean var2 = false;
      class915 var3 = var1.field1312;
      if (var3.field9319 != null) {
         var3 = var3.method15778(Statics.field10637);
      }

      if (var3 != null) {
         var2 = var3.field9308;
      }

      arg0.field7203[++arg0.field7204 - 1] = var2 ? 1 : 0;
   }

   @deob.ObfuscatedName("im.ars(Lrs;I)V")
   private static final void method7376(class790 arg0) {
      class200 var1 = (class200)arg0.field7216;
      class915 var2 = var1.field1312;
      if (var2.field9319 != null) {
         var2 = var2.method15778(Statics.field10637);
      }

      arg0.field7203[++arg0.field7204 - 1] = var2 != null ? 1 : 0;
   }

   @deob.ObfuscatedName("av.arw(Lrs;B)V")
   private static final void method4055(class790 arg0) {
      class425 var1 = arg0.field7216.field20.method5917(arg0.field7203[--arg0.field7204]);
      var1.field3551 = null;
      var1.field3552 = null;
      client.method7309(var1);
   }

   @deob.ObfuscatedName("mk.arq(Lrs;B)V")
   private static final void method9340(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = ((class200)arg0.field7216).field1312.field9281;
   }

   @deob.ObfuscatedName("j.arz(Lrs;B)V")
   private static final void method7472(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = client.field2406 == arg0.field7216.method138() ? 1 : 0;
   }

   @deob.ObfuscatedName("ci.arm(Lrs;I)V")
   private static final void method4529(class790 arg0) {
      client.method9713((class134)arg0.field7217, arg0.field7203[--arg0.field7204]);
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[0];
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[1];
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[2];
   }

   @deob.ObfuscatedName("le.art(Lrs;I)V")
   private static final void method8880(class790 arg0) {
      client.method9713(arg0.field7218, arg0.field7203[--arg0.field7204]);
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[0];
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[1];
      arg0.field7203[++arg0.field7204 - 1] = (int)client.field2573[2];
   }

   @deob.ObfuscatedName("ge.arv(Lrs;I)V")
   private static final void method6620(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = ((class134)arg0.field7217).method162();
   }

   @deob.ObfuscatedName("cg.arf(Lrs;I)V")
   private static final void method4479(class790 arg0) {
      arg0.field7203[++arg0.field7204 - 1] = arg0.field7218.method162();
   }

   @deob.ObfuscatedName("dy.ari(Laex;Lrs;B)V")
   private static final void method5638(class134 arg0, class790 arg1) {
      boolean var2 = false;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if (arg0.field1036 != null) {
         for(int var7 = 0; var7 < arg0.field1036.length; ++var7) {
            class394 var8 = arg0.field1036[var7];
            if (var8.field2896) {
               int var9;
               int var10;
               if (var8.field2899 < var8.field2900) {
                  var9 = var8.field2899 - var8.field2901;
                  var10 = var8.field2901 + var8.field2900;
               } else {
                  var9 = var8.field2900 - var8.field2901;
                  var10 = var8.field2901 + var8.field2899;
               }

               int var11;
               int var12;
               if (var8.field2898 < var8.field2897) {
                  var11 = var8.field2898 - var8.field2901;
                  var12 = var8.field2901 + var8.field2897;
               } else {
                  var11 = var8.field2897 - var8.field2901;
                  var12 = var8.field2901 + var8.field2898;
               }

               if (!var2 || var9 < var3) {
                  var3 = var9;
               }

               if (!var2 || var11 < var4) {
                  var4 = var11;
               }

               if (!var2 || var10 > var5) {
                  var5 = var10;
               }

               if (!var2 || var12 > var6) {
                  var6 = var12;
               }

               var2 = true;
            }
         }
      }

      arg1.field7203[++arg1.field7204 - 1] = var2 ? 1 : 0;
      arg1.field7203[++arg1.field7204 - 1] = var3;
      arg1.field7203[++arg1.field7204 - 1] = var4;
      arg1.field7203[++arg1.field7204 - 1] = var5;
      arg1.field7203[++arg1.field7204 - 1] = var6;
   }

   @deob.ObfuscatedName("vd.ary(Lrs;I)V")
   private static final void method15427(class790 arg0) {
      method5638((class134)arg0.field7217, arg0);
   }

   @deob.ObfuscatedName("eg.aru(Lrs;I)V")
   private static final void method5771(class790 arg0) {
      method5638(arg0.field7218, arg0);
   }

   @deob.ObfuscatedName("ri.aro(Lrs;I)V")
   private static final void method11702(class790 arg0) {
      method5638(arg0.field7216, arg0);
   }

   @deob.ObfuscatedName("da.arr(Lrs;I)V")
   private static final void method5344(class790 arg0) {
      int var1 = arg0.field7203[--arg0.field7204];
      arg0.field7205 -= 2;
      String var2 = (String)arg0.field7226[arg0.field7205];
      String var3 = (String)arg0.field7226[arg0.field7205 + 1];
      if (var2.length() <= 500) {
         if (var3.length() <= 500) {
            method14446(var1, var2, var3);
         }
      }
   }

   @deob.ObfuscatedName("sr.arb(ILjava/lang/String;Ljava/lang/String;B)V")
   private static void method14446(int arg0, String arg1, String arg2) {
      if (client.field2463 != null) {
         class109 var3 = class109.method15110(ClientProt.BUG_REPORT, client.field2463.field832);
         var3.field814.method1569(1 + class124.method14353(arg1) + class124.method14353(arg2));
         var3.field814.method1578(arg2);
         var3.field814.method1772(arg0);
         var3.field814.method1578(arg1);
         client.field2463.method1408(var3);
      }

   }

   @deob.ObfuscatedName("acv.arl(Lrs;I)V")
   private static void method1103(class790 arg0) {
      int var1 = arg0.field7203[arg0.field7204 - 3];
      int var2 = arg0.field7203[arg0.field7204 - 2];
      int var3 = arg0.field7203[arg0.field7204 - 1];
      arg0.field7204 -= 3;
      if (var1 > arg0.field7224[var2]) {
         throw new RuntimeException();
      } else if (var1 > arg0.field7224[var3]) {
         throw new RuntimeException();
      } else if (var2 == var3) {
         throw new RuntimeException();
      } else {
         class781.method14256(arg0.field7202[var2], arg0.field7202[var3], 0, var1 - 1);
      }
   }
}
