import java.io.IOException;
import java.net.URL;

@deob.ObfuscatedName("d")
public class class385 {
   @deob.ObfuscatedName("d.r")
   private static boolean field2791 = false;
   @deob.ObfuscatedName("d.o")
   private static boolean field2793 = false;
   @deob.ObfuscatedName("d.a")
   private static int field2794 = -1;
   @deob.ObfuscatedName("d.x")
   private static long field2795 = -1L;
   @deob.ObfuscatedName("d.aw")
   private static int field2820 = 1;
   @deob.ObfuscatedName("d.al")
   private static long field2821 = 0L;
   @deob.ObfuscatedName("d.an")
   public static String field2822 = "";
   @deob.ObfuscatedName("d.ag")
   public static String field2823 = "";
   @deob.ObfuscatedName("d.ak")
   private static int field2813 = 0;
   @deob.ObfuscatedName("d.aa")
   private static int field2827 = 0;
   @deob.ObfuscatedName("d.az")
   public static int field2802 = -2;
   @deob.ObfuscatedName("d.aq")
   public static int field2832 = -2;
   @deob.ObfuscatedName("d.ar")
   public static int field2787 = -2;
   @deob.ObfuscatedName("d.as")
   public static int field2829 = -1;
   @deob.ObfuscatedName("d.au")
   public static int field2831 = -1;
   @deob.ObfuscatedName("d.ad")
   public static int field2815 = 0;
   @deob.ObfuscatedName("d.am")
   public static int field2801 = -1;
   @deob.ObfuscatedName("d.aj")
   public static int field2833 = -1;
   @deob.ObfuscatedName("d.ac")
   public static int field2818 = 0;
   @deob.ObfuscatedName("d.ay")
   public static boolean field2835 = false;
   @deob.ObfuscatedName("d.bf")
   public static int field2836 = 0;
   @deob.ObfuscatedName("d.bp")
   private static boolean field2837 = false;

   private class385() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("cx.n(B)Z")
   public static boolean method5210() {
      if (client.field2509 != null) {
         return method2154();
      } else {
         return field2794 != -1 ? method9252() : method6507(field2822, field2823);
      }
   }

   @deob.ObfuscatedName("aap.k(B)Z")
   public static boolean method391() {
      if (client.field2509 != null) {
         return method14505();
      } else {
         return field2794 != -1 ? method14842() : method5688(field2822, field2823);
      }
   }

   @deob.ObfuscatedName("vm.d(B)V")
   public static final void method15553() {
      field2820 = 1;
      field2832 = -2;
      field2802 = -2;
   }

   @deob.ObfuscatedName("ob.b(I)V")
   private static final void method10134() {
      field2795 = -1L;
      field2821 = 0L;
      field2794 = -1;
   }

   @deob.ObfuscatedName("df.r(B)V")
   public static final void method5385() {
      if (field2820 != 1) {
         Statics.field2790.method1411();
         method15553();
         method5389();
      }

   }

   @deob.ObfuscatedName("sc.p(I)Z")
   public static final boolean method14262() {
      return field2820 != 1;
   }

   @deob.ObfuscatedName("fz.o(B)V")
   public static void method6554() {
      if (field2820 == 107) {
         field2820 = 118;
      }
   }

   @deob.ObfuscatedName("ju.a(Ljava/lang/String;Ljava/lang/String;I)V")
   public static void method8022(String arg0, String arg1) {
      if (arg0.length() <= 320) {
         if (method8277()) {
            method10134();
            field2822 = arg0;
            field2823 = arg1;
            client.method14844(18);
         }
      }
   }

   @deob.ObfuscatedName("we.x(II)V")
   public static void method15760(int arg0) {
      if (method8277()) {
         if (field2794 != arg0) {
            field2795 = -1L;
         }

         field2794 = arg0;
         client.method14844(18);
      }
   }

   @deob.ObfuscatedName("y.s(Ljava/lang/String;Ljava/lang/String;I)V")
   public static void method16061(String arg0, String arg1) {
      if (arg0.length() <= 320) {
         if (method8277()) {
            client.field2462.method1411();
            method10134();
            field2822 = arg0;
            field2823 = arg1;
            client.method14844(3);
         }
      }
   }

   @deob.ObfuscatedName("el.l(II)V")
   public static void method5807(int arg0) {
      if (method8277()) {
         if (field2794 != arg0) {
            field2795 = -1L;
         }

         field2794 = arg0;
         client.field2462.method1411();
         client.method14844(3);
      }
   }

   @deob.ObfuscatedName("yh.u(I)V")
   public static void method16102() {
      if (client.field2410 == 15) {
         if (!method14262() && !Statics.method3955()) {
            client.method14844(11);
         }
      }
   }

   @deob.ObfuscatedName("ll.v(B)V")
   public static void method8948() {
      field2823 = "";
      field2822 = "";
   }

   @deob.ObfuscatedName("ed.g(Ljava/lang/String;Ljava/lang/String;B)Z")
   private static boolean method5688(String arg0, String arg1) {
      Statics.field2830 = 131;
      Statics.field2790 = client.field2462;
      return method77(false, false, arg0, arg1, -1L);
   }

   @deob.ObfuscatedName("sv.h(I)Z")
   private static boolean method14505() {
      Statics.field2830 = 131;
      Statics.field2790 = client.field2462;
      if (client.field2509 != null) {
         class124 var0 = new class124(client.field2509);
         field2795 = var0.method1621();
         field2821 = var0.method1621();
      }

      if (field2795 < 0L) {
         Statics.method8289(35);
         return false;
      } else {
         return method77(false, true, "", "", field2795);
      }
   }

   @deob.ObfuscatedName("fs.e(Ljava/lang/String;Ljava/lang/String;B)Z")
   private static boolean method6507(String arg0, String arg1) {
      Statics.field2830 = 262;
      Statics.field2790 = client.field2463;
      return method77(false, false, arg0, arg1, -1L);
   }

   @deob.ObfuscatedName("afl.z(B)Z")
   private static boolean method2154() {
      Statics.field2830 = 262;
      Statics.field2790 = client.field2463;
      if (client.field2509 != null) {
         class124 var0 = new class124(client.field2509);
         field2795 = var0.method1621();
         field2821 = var0.method1621();
      }

      if (field2795 < 0L) {
         Statics.method8289(35);
         return false;
      } else {
         return method77(false, true, "", "", field2795);
      }
   }

   @deob.ObfuscatedName("me.m(I)Z")
   private static boolean method9252() {
      Statics.field2830 = 262;
      Statics.field2790 = client.field2463;
      return method77(field2795 == -1L, true, "", "", field2795);
   }

   @deob.ObfuscatedName("tq.i(B)Z")
   private static boolean method14842() {
      Statics.field2830 = 131;
      Statics.field2790 = client.field2462;
      return method77(field2795 == -1L, true, "", "", field2795);
   }

   @deob.ObfuscatedName("aaa.t(ZZLjava/lang/String;Ljava/lang/String;J)Z")
   private static boolean method77(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
      field2793 = arg0;
      if (!arg1) {
         field2794 = -1;
      }

      field2791 = arg1;
      field2822 = arg2;
      field2823 = arg3;
      field2795 = arg4;
      if (field2791 || !field2822.equals("") && !field2823.equals("")) {
         if (Statics.field2830 != 131) {
            field2815 = 0;
            field2833 = -1;
            field2801 = -1;
         }

         Statics.field2790.field840 = false;
         Statics.method8289(-3);
         field2820 = 18;
         field2813 = 0;
         field2827 = 0;
         return true;
      } else {
         Statics.method8289(3);
         method5389();
         return false;
      }
   }

   @deob.ObfuscatedName("rz.c(I)V")
   public static final void method14229() {
      if (field2820 != 1 && field2820 != 107) {
         try {
            short var0;
            if (field2827 == 0) {
               var0 = 500;
            } else {
               var0 = 2000;
            }

            if (field2793 && field2820 >= 60) {
               var0 = 6000;
            }

            if (Statics.field2830 == 262 && field2820 != 206 && field2832 != 42 || Statics.field2830 == 131 && field2802 != 49 && field2802 != 52) {
               ++field2813;
            }

            if (field2813 > var0) {
               Statics.field2790.method1411();
               if (field2827 >= 3) {
                  field2820 = 1;
                  Statics.method8289(-5);
                  method5389();
                  return;
               }

               if (Statics.field2830 == 262) {
                  Statics.field8789.method15276();
               } else {
                  Statics.field8792.method15276();
               }

               field2813 = 0;
               ++field2827;
               field2820 = 18;
            }

            if (field2820 == 18) {
               if (Statics.field2830 == 262) {
                  Statics.field2790.method1410(class711.method14916(Statics.field8789.method15275(), 15000), Statics.field8789.field8849);
               } else {
                  Statics.field2790.method1410(class711.method14916(Statics.field8792.method15275(), 15000), Statics.field8792.field8849);
               }

               Statics.field2790.method1434();
               class109 var1 = Statics.method11181();
               if (field2793) {
                  var1.field814.method1568(class576.field5288.field5290);
                  var1.field814.method1569(0);
                  int var2 = var1.field814.field935;
                  var1.field814.method1572(742);
                  var1.field814.method1572(1);
                  if (Statics.field2830 == 262) {
                     var1.field814.method1568(client.field2410 == 9 ? 1 : 0);
                  }

                  class124 var3 = method15887();
                  var3.method1568(field2794);
                  var3.method1569((int)(Math.random() * 9.9999999E7D));
                  var3.method1568(Statics.field243.method9329());
                  var3.method1572(client.field2393);

                  for(int var4 = 0; var4 < 6; ++var4) {
                     var3.method1572((int)(Math.random() * 9.9999999E7D));
                  }

                  var3.method1575(client.field2527);
                  var3.method1568(client.field2584.field7304);
                  var3.method1568((int)(Math.random() * 9.9999999E7D));
                  var3.method1601(class320.field1996, class320.field1997);
                  var1.field814.method1753(var3.field931, 0, var3.field935);
                  var1.field814.method1582(var1.field814.field935 - var2);
               } else {
                  var1.field814.method1568(class576.field5287.field5290);
               }

               Statics.field2790.method1408(var1);
               Statics.field2790.method1407();
               field2820 = 33;
            }

            if (field2820 == 33) {
               if (!Statics.field2790.method1413().method1527(1)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 1);
               Statics.field2790.field835.field935 = 0;
               int var5 = Statics.field2790.field835.method1688();
               if (var5 != 0) {
                  field2820 = 1;
                  Statics.method8732(var5);
                  Statics.method8289(var5);
                  Statics.field2790.method1411();
                  method5389();
                  return;
               }

               Statics.field2790.field835.field935 = 0;
               if (field2793) {
                  field2820 = 40;
               } else {
                  field2820 = 88;
               }
            }

            if (field2820 == 40) {
               if (!Statics.field2790.method1413().method1527(2)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 2);
               Statics.field2790.field835.field935 = 0;
               Statics.field2790.field835.field935 = Statics.field2790.field835.method1587();
               field2820 = 50;
            }

            if (field2820 == 50) {
               if (!Statics.field2790.method1413().method1527(Statics.field2790.field835.field935)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, Statics.field2790.field835.field935);
               Statics.field2790.field835.method1610(Statics.field2804);
               Statics.field2790.field835.field935 = 0;
               String var6 = Statics.field2790.field835.method1600();
               Statics.field2790.field835.field935 = 0;
               String var7 = class573.field5187.method7988();
               if (!client.field2390 || !class689.method7945(var6, 1, var7)) {
                  class689.method8031(var6, true, Statics.field9361.field974.method2236() == 5, var7, client.field2643, client.field2403);
               }

               field2820 = 60;
            }

            if (field2820 == 60) {
               if (!Statics.field2790.method1413().method1527(1)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 1);
               if ((Statics.field2790.field835.field931[0] & 255) == 1) {
                  field2820 = 77;
               }
            }

            if (field2820 == 77) {
               if (!Statics.field2790.method1413().method1527(16)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 16);
               Statics.field2790.field835.field935 = 16;
               Statics.field2790.field835.method1610(Statics.field2804);
               Statics.field2790.field835.field935 = 0;
               field2795 = Statics.field2790.field835.method1621();
               field2821 = Statics.field2790.field835.method1621();
               field2820 = 88;
            }

            if (field2820 == 88) {
               Statics.field2790.field835.field935 = 0;
               Statics.field2790.method1434();
               class109 var8 = Statics.method11181();
               class251 var9 = var8.field814;
               if (Statics.field2830 == 262) {
                  class576 var10;
                  if (field2793) {
                     var10 = class576.field5289;
                  } else {
                     var10 = class576.field5281;
                  }

                  var9.method1568(var10.field5290);
                  var9.method1569(0);
                  int var11 = var9.field935;
                  int var12 = var9.field935;
                  if (!field2793) {
                     var9.method1572(742);
                     var9.method1572(1);
                     var9.method1568(client.field2410 == 9 ? 1 : 0);
                     int var13 = var9.field935;
                     class124 var14 = method6222();
                     var9.method1753(var14.field931, 0, var14.field935);
                     var12 = var9.field935;
                     var9.method1568(field2795 == -1L ? 1 : 0);
                     if (field2795 == -1L) {
                        var9.method1577(field2822);
                     } else {
                        var9.method1575(field2795);
                     }
                  }

                  var9.method1568(client.method10038());
                  var9.method1569(Statics.field6104);
                  var9.method1569(Statics.field6354);
                  var9.method1568(Statics.field9361.field946.method2226());
                  class671.method6859(var9);
                  var9.method1577(client.field2626);
                  var9.method1572(client.field2393);
                  class124 var15 = Statics.field9361.method1884();
                  var9.method1568(var15.field935);
                  var9.method1753(var15.field931, 0, var15.field935);
                  client.field2419 = true;
                  class124 var16 = new class124(Statics.field8859.method1466());
                  Statics.field8859.method1458(var16);
                  var9.method1753(var16.field931, 0, var16.field931.length);
                  var9.method1572(client.field2465);
                  var9.method1575(client.field2397);
                  var9.method1577(Statics.field6769);
                  var9.method1568(client.field2400 == null ? 0 : 1);
                  if (client.field2400 != null) {
                     var9.method1577(client.field2400);
                  }

                  var9.method1568(Statics.field3855.method9972("jagtheora") ? 1 : 0);
                  var9.method1568(client.field2390 ? 1 : 0);
                  var9.method1568(client.field2404 ? 1 : 0);
                  var9.method1568(Statics.field8398);
                  var9.method1572(client.field2407);
                  var9.method1577(client.field2636);
                  var9.method1568(Statics.field8788 != null && Statics.field8789.field8851 == Statics.field8788.field8851 ? 0 : 1);
                  method2117(var9);
                  var9.method1673(Statics.field2804, var12, var9.field935);
                  var9.method1582(var9.field935 - var11);
               } else {
                  class576 var17;
                  if (field2793) {
                     var17 = class576.field5289;
                  } else {
                     var17 = class576.field5286;
                  }

                  var9.method1568(var17.field5290);
                  var9.method1569(0);
                  int var18 = var9.field935;
                  int var19 = var9.field935;
                  if (!field2793) {
                     var9.method1572(742);
                     var9.method1572(1);
                     class124 var20 = method6222();
                     var9.method1753(var20.field931, 0, var20.field935);
                     var19 = var9.field935;
                     var9.method1568(field2795 == -1L ? 1 : 0);
                     if (field2795 == -1L) {
                        var9.method1577(field2822);
                     } else {
                        var9.method1575(field2795);
                     }
                  }

                  var9.method1568(client.field2584.field7304);
                  var9.method1568(Statics.field243.method9329());
                  class671.method6859(var9);
                  var9.method1577(client.field2626);
                  class124 var21 = Statics.field9361.method1884();
                  var9.method1568(var21.field935);
                  var9.method1753(var21.field931, 0, var21.field935);
                  class124 var22 = new class124(Statics.field8859.method1466());
                  Statics.field8859.method1458(var22);
                  var9.method1753(var22.field931, 0, var22.field931.length);
                  var9.method1577(Statics.field6769);
                  var9.method1572(client.field2393);
                  var9.method1572(client.field2407);
                  var9.method1577(client.field2636);
                  method2117(var9);
                  var9.method1673(Statics.field2804, var19, var9.field935);
                  var9.method1582(var9.field935 - var18);
               }

               Statics.field2790.method1408(var8);
               Statics.field2790.method1407();
               Statics.field2790.field832 = new class872(Statics.field2804);

               for(int var23 = 0; var23 < 4; ++var23) {
                  Statics.field2804[var23] += 50;
               }

               Statics.field2790.field827 = new class872(Statics.field2804);
               new class872(Statics.field2804);
               Statics.field2790.field835.method3384(Statics.field2790.field827);
               Statics.field2804 = null;
               field2820 = 97;
            }

            if (field2820 == 97) {
               if (!Statics.field2790.method1413().method1527(1)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 1);
               int var24 = Statics.field2790.field835.method1688();
               Statics.field2790.field835.field935 = 0;
               if (var24 == 21) {
                  field2820 = 128;
               } else if (var24 != 29 && var24 != 45) {
                  if (var24 == 1) {
                     field2820 = 107;
                     Statics.method8289(var24);
                     return;
                  }

                  if (var24 == 52) {
                     Statics.field8392 = var24;
                     field2820 = 218;
                  } else if (var24 == 2) {
                     if (field2837) {
                        field2837 = false;
                        field2820 = 18;
                        return;
                     }

                     field2820 = 132;
                  } else if (var24 == 15) {
                     Statics.field2790.field829 = -2;
                     field2820 = 193;
                  } else {
                     if (var24 == 23 && field2827 < 3) {
                        field2813 = 0;
                        ++field2827;
                        field2820 = 18;
                        Statics.field2790.method1411();
                        return;
                     }

                     if (var24 == 42) {
                        field2820 = 206;
                        Statics.method8289(var24);
                        return;
                     }

                     if (Statics.field2830 == 131 && var24 == 49 && client.field2410 != 4) {
                        if (field2802 != 52) {
                           Statics.method8289(var24);
                        }

                        return;
                     }

                     if (field2791 && !field2793 && field2794 != -1 && var24 == 35) {
                        field2793 = true;
                        field2813 = 0;
                        field2820 = 18;
                        Statics.field2790.method1411();
                        return;
                     }

                     if (var24 != 53) {
                        field2820 = 1;
                        Statics.method8289(var24);
                        Statics.field2790.method1411();
                        method5389();
                        return;
                     }

                     field2820 = 233;
                  }
               } else {
                  Statics.field8392 = var24;
                  field2820 = 185;
               }
            }

            if (field2820 == 118) {
               Statics.field2790.method1434();
               class109 var25 = Statics.method11181();
               class251 var26 = var25.field814;
               var26.method3384(Statics.field2790.field832);
               var26.method3385(class576.field5285.field5290);
               Statics.field2790.method1408(var25);
               Statics.field2790.method1407();
               field2820 = 97;
               return;
            }

            if (field2820 == 128) {
               if (!Statics.field2790.method1413().method1527(1)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 1);
               int var27 = Statics.field2790.field835.field931[0] & 255;
               field2815 = var27 * 50;
               field2820 = 1;
               Statics.method8289(21);
               Statics.field2790.method1411();
               method5389();
               return;
            }

            if (field2820 == 206) {
               if (!Statics.field2790.method1413().method1527(2)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 2);
               field2818 = ((Statics.field2790.field835.field931[0] & 255) << 8) + (Statics.field2790.field835.field931[1] & 255);
               field2820 = 97;
               return;
            }

            if (field2820 == 233) {
               if (!Statics.field2790.method1413().method1527(4)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 4);
               field2836 = Statics.field2790.field835.method1591();
               Statics.field2790.field835.field935 = 0;
               field2820 = 1;
               Statics.method8289(53);
               Statics.field2790.method1411();
               method5389();
               return;
            }

            if (field2820 == 185) {
               if (Statics.field8392 == 29) {
                  if (!Statics.field2790.method1413().method1527(1)) {
                     return;
                  }

                  Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 1);
                  field2833 = Statics.field2790.field835.field931[0] & 255;
               } else {
                  if (Statics.field8392 != 45) {
                     throw new IllegalStateException();
                  }

                  if (!Statics.field2790.method1413().method1527(3)) {
                     return;
                  }

                  Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 3);
                  field2833 = Statics.field2790.field835.field931[0] & 255;
                  field2801 = ((Statics.field2790.field835.field931[1] & 255) << 8) + (Statics.field2790.field835.field931[2] & 255);
               }

               field2820 = 1;
               Statics.method8289(Statics.field8392);
               Statics.field2790.method1411();
               method5389();
               return;
            }

            if (field2820 == 218) {
               if (!Statics.field2790.method1413().method1527(2)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 2);
               Statics.field2790.field835.field935 = 0;
               Statics.field7145 = Statics.field2790.field835.method1587();
               Statics.field2790.field835.field935 = 0;
               field2820 = 225;
               return;
            }

            if (field2820 == 225) {
               if (!Statics.field2790.method1413().method1527(Statics.field7145)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, Statics.field7145);
               Statics.field2790.field835.field935 = 0;
               byte[] var28 = new byte[Statics.field7145 + 1];
               Statics.field2790.field835.method3388(var28, 0, Statics.field7145);
               Statics.field2790.field835.field935 = 0;
               class124 var29 = new class124(var28);
               String var30 = var29.method1599();
               class689.method690(var30, true, Statics.field9361.field974.method2236() == 5, client.field2643, client.field2403);
               Statics.method8289(Statics.field8392);
               if (Statics.field2830 == 131 && client.field2410 != 4) {
                  field2820 = 97;
               } else {
                  field2820 = 1;
                  Statics.field2790.method1411();
                  method5389();
               }

               return;
            }

            if (field2820 == 132) {
               if (!Statics.field2790.method1413().method1527(1)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 1);
               Statics.field5803 = Statics.field2790.field835.field931[0] & 255;
               field2820 = 145;
               return;
            }

            if (field2820 == 145) {
               class251 var31 = Statics.field2790.field835;
               if (Statics.field2830 == 262) {
                  if (!Statics.field2790.method1413().method1527(Statics.field5803)) {
                     return;
                  }

                  Statics.field2790.method1413().method1541(var31.field931, 0, Statics.field5803);
                  var31.field935 = 0;
                  client.field2562 = var31.method1688();
                  client.field2563 = var31.method1688();
                  client.field2635 = var31.method1688() == 1;
                  client.field2680 = var31.method1688() == 1;
                  client.field2566 = var31.method1688() == 1;
                  client.field2569 = var31.method1688() == 1;
                  client.field2452 = var31.method1587();
                  client.field2722 = var31.method1688() == 1;
                  Statics.field6495 = var31.method1590();
                  client.field2561 = var31.method1688() == 1;
                  Statics.field5813 = var31.method1599();
                  client.field2468.method9636().method14634(client.field2561);
                  Statics.field4892.method8956().method9636().method14634(client.field2561);
                  Statics.field4196.method15522(client.field2561);
                  Statics.field93.method15845(client.field2561);
               } else {
                  if (!Statics.field2790.method1413().method1527(Statics.field5803)) {
                     return;
                  }

                  Statics.field2790.method1413().method1541(var31.field931, 0, Statics.field5803);
                  var31.field935 = 0;
                  client.field2562 = var31.method1688();
                  client.field2563 = var31.method1688();
                  client.field2635 = var31.method1688() == 1;
                  Statics.field6495 = var31.method1590();
                  Statics.field5701.field1396 = (byte)var31.method1688();
                  client.field2680 = var31.method1688() == 1;
                  client.field2566 = var31.method1688() == 1;
                  Statics.field9348 = var31.method1621();
                  Statics.field8538 = Statics.field9348 - class431.method2169() - var31.method1715();
                  int var32 = var31.method1688();
                  client.field2722 = (var32 & 1) != 0;
                  Statics.field9073 = (var32 & 2) != 0;
                  Statics.field4780 = var31.method1591();
                  Statics.field7164 = var31.method1688() == 1;
                  Statics.field8650 = var31.method1591();
                  Statics.field6798 = var31.method1587();
                  Statics.field7025 = var31.method1587();
                  Statics.field9868 = var31.method1587();
                  Statics.field9532 = var31.method1591();
                  Statics.field2285 = new class358(Statics.field9532);
                  (new Thread(Statics.field2285)).start();
                  Statics.field8518 = var31.method1688();
                  Statics.field8467 = var31.method1587();
                  Statics.field10597 = var31.method1587();
                  Statics.field8665 = var31.method1688() == 1;
                  Statics.field5701.field1381 = Statics.field5701.field1391 = Statics.field1854 = var31.method1600();
                  Statics.field8478 = var31.method1688();
                  Statics.field6667 = var31.method1591();
                  client.field2567 = var31.method1688() == 1;
                  Statics.field8788 = new class873();
                  Statics.field8788.field8851 = var31.method1587();
                  if (Statics.field8788.field8851 == 65535) {
                     Statics.field8788.field8851 = -1;
                  }

                  Statics.field8788.field8849 = var31.method1600();
                  if (class819.field8428 != Statics.field4896) {
                     Statics.field8788.field8850 = Statics.field8788.field8851 + 40000;
                     Statics.field8788.field8852 = Statics.field8788.field8851 + 50000;
                  }

                  if (class819.field8433 != Statics.field4896 && (class819.field8431 != Statics.field4896 || client.field2562 < 2) && Statics.field8789.method15277(Statics.field8790)) {
                     class861.method5744();
                  }
               }

               if ((!client.field2635 || client.field2566) && !client.field2722) {
                  try {
                     class855.method15072(Statics.field6978, "unzap");
                  } catch (Throwable var42) {
                  }
               } else {
                  try {
                     class855.method15072(Statics.field6978, "zap");
                  } catch (Throwable var44) {
                     if (client.field2391) {
                        try {
                           Statics.field6978.getAppletContext().showDocument(new URL(Statics.field6978.getCodeBase(), "blank.ws"), "tbi");
                        } catch (Exception var43) {
                        }
                     }
                  }
               }

               if (class819.field8428 == Statics.field4896) {
                  class573.field5186.method7991();
               }

               if (Statics.field2830 != 262) {
                  field2820 = 1;
                  Statics.method8289(2);
                  method5909();
                  client.method14844(15);
                  Statics.field2790.field826 = null;
                  return;
               }

               field2820 = 167;
            }

            if (field2820 == 167) {
               if (!Statics.field2790.method1413().method1527(3)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 3);
               field2820 = 176;
            }

            if (field2820 == 176) {
               class251 var36 = Statics.field2790.field835;
               var36.field935 = 0;
               if (var36.method3402()) {
                  if (!Statics.field2790.method1413().method1527(1)) {
                     return;
                  }

                  Statics.field2790.method1413().method1541(var36.field931, 3, 1);
               }

               Statics.field2790.field826 = class567.method2125()[var36.method3403()];
               Statics.field2790.field829 = var36.method1587();
               field2820 = 154;
            }

            if (field2820 == 154) {
               if (!Statics.field2790.method1413().method1527(Statics.field2790.field829)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, Statics.field2790.field829);
               Statics.field2790.field835.field935 = 0;
               int var37 = Statics.field2790.field829;
               field2820 = 1;
               Statics.method8289(2);
               method2285();
               class324.method16246(Statics.field2790.field835);
               int var38 = var37 - Statics.field2790.field835.field935;
               class251 var39 = new class251(var38);
               System.arraycopy(Statics.field2790.field835.field931, Statics.field2790.field835.field935, var39.field931, 0, var38);
               Statics.field2790.field835.field935 += var38;
               if (class567.field5002 == Statics.field2790.field826) {
                  client.field2468.method9537(new class650(class657.field5991, var39));
               } else {
                  client.field2468.method9537(new class650(class657.field5990, var39));
               }

               if (Statics.field2790.field835.field935 != var37) {
                  throw new RuntimeException(Statics.field2790.field835.field935 + " " + var37);
               }

               Statics.field2790.field826 = null;
               return;
            }

            if (field2820 == 193) {
               if (Statics.field2790.field829 == -2) {
                  if (!Statics.field2790.method1413().method1527(2)) {
                     return;
                  }

                  Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, 2);
                  Statics.field2790.field835.field935 = 0;
                  Statics.field2790.field829 = Statics.field2790.field835.method1587();
               }

               if (!Statics.field2790.method1413().method1527(Statics.field2790.field829)) {
                  return;
               }

               Statics.field2790.method1413().method1541(Statics.field2790.field835.field931, 0, Statics.field2790.field829);
               Statics.field2790.field835.field935 = 0;
               int var40 = Statics.field2790.field829;
               field2820 = 1;
               Statics.method8289(15);
               method6492();
               class324.method16246(Statics.field2790.field835);
               if (Statics.field2790.field835.field935 != var40) {
                  throw new RuntimeException(Statics.field2790.field835.field935 + " " + var40);
               }

               Statics.field2790.field826 = null;
               return;
            }
         } catch (IOException var45) {
            Statics.field2790.method1411();
            if (field2827 < 3) {
               if (Statics.field2830 == 262) {
                  Statics.field8789.method15276();
               } else {
                  Statics.field8792.method15276();
               }

               field2813 = 0;
               ++field2827;
               field2820 = 18;
            } else {
               field2820 = 1;
               Statics.method8289(-4);
               method5389();
            }
         }

      }
   }

   @deob.ObfuscatedName("wq.q(S)Laen;")
   private static class124 method15887() {
      class124 var0 = new class124(518);
      Statics.field2804 = new int[4];
      Statics.field2804[0] = (int)(Math.random() * 9.9999999E7D);
      Statics.field2804[1] = (int)(Math.random() * 9.9999999E7D);
      Statics.field2804[2] = (int)(Math.random() * 9.9999999E7D);
      Statics.field2804[3] = (int)(Math.random() * 9.9999999E7D);
      var0.method1568(10);
      var0.method1572(Statics.field2804[0]);
      var0.method1572(Statics.field2804[1]);
      var0.method1572(Statics.field2804[2]);
      var0.method1572(Statics.field2804[3]);
      return var0;
   }

   @deob.ObfuscatedName("fb.y(B)Laen;")
   private static class124 method6222() {
      class124 var0 = method15887();
      var0.method1575(0L);
      var0.method1577(field2823);
      var0.method1575(field2821);
      var0.method1575(client.field2527);
      var0.method1601(class320.field1996, class320.field1997);
      return var0;
   }

   @deob.ObfuscatedName("dg.f(B)V")
   private static void method5389() {
      if (client.method8950(client.field2410)) {
         if (client.field2462.method1413() == null) {
            client.method14844(3);
         } else {
            client.method14844(15);
         }
      } else if (client.field2410 != 3 && client.field2410 != 18) {
         if (client.field2410 == 4) {
            client.method14844(6);
         }
      } else {
         client.method14844(6);
      }

   }

   @deob.ObfuscatedName("afh.ai(Lajf;I)V")
   private static void method2117(class251 arg0) {
      arg0.method1572(Statics.field8866.method8766());
      arg0.method1572(Statics.field9961.method8766());
      arg0.method1572(Statics.field3567.method8766());
      arg0.method1572(Statics.field132.method8766());
      arg0.method1572(Statics.field2775.method8766());
      arg0.method1572(Statics.field1805.method8766());
      arg0.method1572(Statics.field6467.method8766());
      arg0.method1572(Statics.field8828.method8766());
      arg0.method1572(Statics.field6723.method8766());
      arg0.method1572(Statics.field200.method8766());
      arg0.method1572(Statics.field3937.method8766());
      arg0.method1572(Statics.field3965.method8766());
      arg0.method1572(Statics.field3827.method8766());
      arg0.method1572(Statics.field4891.method8766());
      arg0.method1572(Statics.field7262.method8766());
      arg0.method1572(Statics.field6046.method8766());
      arg0.method1572(Statics.field6724.method8766());
      arg0.method1572(Statics.field8546.method8766());
      arg0.method1572(Statics.field9437.method8766());
      arg0.method1572(Statics.field452.method8766());
      arg0.method1572(Statics.field1169.method8766());
      arg0.method1572(Statics.field6084.method8766());
      arg0.method1572(Statics.field6858.method8766());
      arg0.method1572(Statics.field2508.method8766());
      arg0.method1572(Statics.field8783.method8766());
      arg0.method1572(Statics.field1995.method8766());
      arg0.method1572(Statics.field8465.method8766());
      arg0.method1572(Statics.field7197.method8766());
      arg0.method1572(Statics.field2838.method8766());
      arg0.method1572(Statics.field9246.method8766());
      arg0.method1572(Statics.field9882.method8766());
      arg0.method1572(Statics.field6375.method8766());
      arg0.method1572(class590.method397());
      arg0.method1572(class590.method8872());
      arg0.method1572(Statics.field160.method8766());
      arg0.method1572(Statics.field7162.method8766());
      arg0.method1572(Statics.field9250.method8766());
   }

   @deob.ObfuscatedName("cg.ap(I)V")
   private static void method4480() {
      Statics.field2790.method1434();
      Statics.field2790.field835.field935 = 0;
      Statics.field2790.field837 = null;
      Statics.field2790.field838 = null;
      Statics.field2790.field839 = null;
      Statics.field2790.field831 = 0;
      client.field2479 = 0;
      class419.method14838();
      client.field2695 = 0;
      client.field2694 = 0;
      client.field2699 = 0;
      client.field2578 = null;
      Statics.field6939 = 0;
      Statics.field3105 = null;
      Statics.field10534 = null;
      Statics.field9397 = null;
      Statics.method10642();

      for(int var0 = 0; var0 < 25; ++var0) {
         client.field2580[var0] = 0;
         client.field2663[var0] = 0;
         client.field2490[var0] = 0;
      }

   }

   @deob.ObfuscatedName("en.av(B)V")
   private static void method5909() {
      method4480();
   }

   @deob.ObfuscatedName("ag.ax(B)V")
   private static void method2285() {
      if (client.field2410 == 0) {
         client.method1102();
      }

      method4480();
      client.field2462.method1411();
      Statics.field6857 = true;
      class896.method10916();

      for(int var0 = 0; var0 < client.field2423.length; ++var0) {
         client.field2423[var0] = null;
      }

      client.field2588 = false;
      class677.method5481();
      client.field2478 = (int)(Math.random() * 100.0D) - 50;
      client.field2618 = (int)(Math.random() * 110.0D) - 55;
      client.field2496 = (int)(Math.random() * 80.0D) - 40;
      client.field2519 = (int)(Math.random() * 120.0D) - 60;
      client.field2619 = (int)(Math.random() * 30.0D) - 20;
      client.field2502 = (float)((int)(Math.random() * 160.0D) - 80 & 16383);
      class299.method17040();

      for(int var1 = 0; var1 < 2048; ++var1) {
         client.field2408[var1] = null;
      }

      Statics.field5701 = null;
      client.field2455 = 0;
      client.field2492 = 0;
      client.field2615.method15312();
      client.field2577.method14958();
      client.field2494.method15312();
      client.field2590.method14794();
      client.field2576.method15312();
      class75.field556 = new class849();
      class75.field544 = new class849();
      Statics.field10637.method6141();
      class231.method8554();
      Statics.field5127 = 0;
      Statics.field1994 = 0;
      Statics.field1734 = 0;
      Statics.field5794 = 0;
      Statics.field8399 = 0;
      Statics.field262 = 0;
      Statics.field8651 = 0;
      Statics.field3823 = 0;
      Statics.field2957 = 0;
      Statics.field10584 = 0;

      for(int var2 = 0; var2 < Statics.field8854.length; ++var2) {
         if (!Statics.field8400[var2]) {
            Statics.field8854[var2] = -1;
         }
      }

      if (client.field2593 != -1) {
         class425.method15487(client.field2593);
      }

      for(class118 var3 = (class118)client.field2594.method15313(); var3 != null; var3 = (class118)client.field2594.method15314()) {
         if (!var3.method9863()) {
            var3 = (class118)client.field2594.method15313();
            if (var3 == null) {
               break;
            }
         }

         Statics.method689(var3, true, false);
      }

      client.field2593 = -1;
      client.field2594 = new class875(8);
      class425.method15708();
      client.field2596 = null;

      for(int var4 = 0; var4 < 8; ++var4) {
         client.field2712[var4] = null;
         client.field2428[var4] = false;
         client.field2574[var4] = -1;
      }

      class72.method442();
      client.field2416 = true;

      for(int var5 = 0; var5 < 103; ++var5) {
         client.field2558[var5] = true;
      }

      for(int var6 = 0; var6 < 6; ++var6) {
         client.field2681[var6] = new class634();
      }

      client.field2468.method9512().method11128();
      client.field2432 = true;
      Statics.field8747 = class843.field8572 = class915.field9279 = class899.field9149 = new short[256];
      Statics.field5177 = class881.field9013.method15374(Statics.field243);
      Statics.field9361.method1857(Statics.field9361.field968, Statics.field9361.field948.method2071());
      client.field2465 = 0;
      class987.method17094();
      client.method15555();
      Statics.field207 = null;
      Statics.field5703 = 0L;
   }

   @deob.ObfuscatedName("fr.af(B)V")
   private static void method6492() {
      Statics.field2790.method1434();
      Statics.field2790.field835.field935 = 0;
      Statics.field2790.field826 = null;
      Statics.field2790.field837 = null;
      Statics.field2790.field838 = null;
      Statics.field2790.field839 = null;
      Statics.field2790.field829 = 0;
      Statics.field2790.field831 = 0;
      client.field2479 = 0;
      class987.method17094();
      Statics.method2964();

      for(int var0 = 0; var0 < 2048; ++var0) {
         client.field2408[var0] = null;
      }

      Statics.field5701 = null;

      for(int var1 = 0; var1 < client.field2492; ++var1) {
         class4 var2 = (class4)client.field2453[var1].field807;
         if (var2 != null) {
            var2.field34 = -1;
         }
      }

      class72.method442();
      Statics.field5998 = 4;
      Statics.field6637 = -1;
      Statics.field5929 = -1;
      client.method14844(1);

      for(int var3 = 0; var3 < 103; ++var3) {
         client.field2558[var3] = true;
      }

      client.method15555();
      Statics.field207 = null;
      Statics.field5703 = 0L;
      client.method6227();
   }

   @deob.ObfuscatedName("kf.at(I)Z")
   private static boolean method8277() {
      if (client.field2410 != 6) {
         return false;
      } else {
         return !method14262() && !Statics.method3955();
      }
   }
}
