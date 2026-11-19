import java.io.IOException;
import net.ClientProt;

@deob.ObfuscatedName("t")
public class class825 {
   @deob.ObfuscatedName("t.d")
   private static int field8460 = 0;
   @deob.ObfuscatedName("t.b")
   private static int field8462 = 0;

   private class825() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("aez.n(I)V")
   public static void method2048() {
      if (client.field2410 == 6) {
         if (!class385.method14262() && !Statics.method3955()) {
            client.method14844(8);
         }
      }
   }

   @deob.ObfuscatedName("ih.k(B)V")
   public static void method7353() {
      Statics.field8826 = class717.field6638;
      Statics.field8459 = class845.field8654;
      Statics.field8464 = class834.field8505;
      Statics.field3714 = class842.field8565;
   }

   @deob.ObfuscatedName("pz.r(Ljava/lang/String;Ljava/lang/String;IZI)V")
   public static void method10984(String arg0, String arg1, int arg2, boolean arg3) {
      if (client.field2410 == 14) {
         class109 var4 = class109.method15110(ClientProt.CREATE_ACCOUNT, client.field2462.field832);
         var4.field814.method1569(0);
         int var5 = var4.field814.field935;
         var4.field814.method1577(arg0);
         var4.field814.method1577(arg1);
         var4.field814.method1568(arg2);
         var4.field814.method1568(arg3 ? 1 : 0);
         var4.field814.field935 += 7;
         var4.field814.method1673(Statics.field8463, var5, var4.field814.field935);
         var4.field814.method1582(var4.field814.field935 - var5);
         client.field2462.method1408(var4);
         if (arg2 < 13) {
            client.field2433 = true;
            Statics.method4099();
         }

         Statics.field8464 = class834.field8504;
      }
   }

   @deob.ObfuscatedName("en.p(II)V")
   public static void method5914(int arg0) {
      if (client.field2410 == 14) {
         class109 var1 = class109.method15110(ClientProt.CREATE_LOG_PROGRESS, client.field2462.field832);
         var1.field814.method1568(arg0);
         client.field2462.method1408(var1);
      }
   }

   @deob.ObfuscatedName("py.o(B)Ltt;")
   public static class845 method10958() {
      return Statics.field8459 == null ? class845.field8652 : Statics.field8459;
   }

   @deob.ObfuscatedName("gy.a(B)Lti;")
   public static class834 method6900() {
      return Statics.field8464 == null ? class834.field8505 : Statics.field8464;
   }

   @deob.ObfuscatedName("agh.x(B)Ltq;")
   public static class842 method2350() {
      return Statics.field3714 == null ? class842.field8565 : Statics.field3714;
   }

   @deob.ObfuscatedName("pk.s(Lti;B)V")
   public static void method10749(class834 arg0) {
      Statics.field8464 = arg0;
   }

   @deob.ObfuscatedName("nu.l(Ltq;B)V")
   public static void method10026(class842 arg0) {
      Statics.field3714 = arg0;
   }

   @deob.ObfuscatedName("jt.u(I)V")
   public static void method8014() {
      if (Statics.field8826 != null) {
         try {
            short var0;
            if (field8462 == 0) {
               var0 = 250;
            } else {
               var0 = 2000;
            }

            ++field8460;
            if (field8460 > var0) {
               method11183();
            }

            if (class717.field6638 == Statics.field8826) {
               client.field2462.method1410(class711.method14916(Statics.field8792.method15275(), 15000), Statics.field8792.field8849);
               client.field2462.method1434();
               class109 var1 = Statics.method11181();
               var1.field814.method1568(class576.field5279.field5290);
               var1.field814.method1569(0);
               int var2 = var1.field814.field935;
               var1.field814.method1569(742);
               var1.field814.method1569(1);
               Statics.field8463 = method5150(var1);
               int var3 = var1.field814.field935;
               var1.field814.method1577(client.field2636);
               var1.field814.method1569(client.field2393);
               var1.field814.method1575(client.field2397);
               var1.field814.method1577(Statics.field6769);
               var1.field814.method1568(Statics.field243.method9329());
               var1.field814.method1568(client.field2584.field7304);
               class671.method6859(var1.field814);
               String var4 = client.field2400;
               var1.field814.method1568(var4 == null ? 0 : 1);
               if (var4 != null) {
                  var1.field814.method1577(var4);
               }

               Statics.field8859.method1458(var1.field814);
               var1.field814.field935 += 7;
               var1.field814.method1673(Statics.field8463, var3, var1.field814.field935);
               var1.field814.method1582(var1.field814.field935 - var2);
               client.field2462.method1408(var1);
               client.field2462.method1407();
               Statics.field8826 = class717.field6639;
            }

            if (class717.field6639 == Statics.field8826) {
               if (client.field2462.method1413() == null) {
                  method11183();
                  return;
               }

               if (!client.field2462.method1413().method1527(1)) {
                  return;
               }

               client.field2462.method1413().method1541(client.field2462.field835.field931, 0, 1);
               Statics.field8459 = (class845)class814.method4102(class845.method10367(), client.field2462.field835.field931[0] & 255);
               if (class845.field8659 != Statics.field8459) {
                  client.field2462.method1411();
               } else {
                  client.field2462.field832 = new class872(Statics.field8463);
                  int[] var5 = new int[4];

                  for(int var6 = 0; var6 < 4; ++var6) {
                     var5[var6] = Statics.field8463[var6] + 50;
                  }

                  client.field2462.field827 = new class872(var5);
                  new class872(var5);
                  client.field2462.field835.method3384(client.field2462.field827);
                  client.method14844(14);
                  client.field2462.method1434();
                  client.field2462.field835.field935 = 0;
                  client.field2462.field837 = null;
                  client.field2462.field838 = null;
                  client.field2462.field839 = null;
                  client.field2462.field831 = 0;
               }

               client.field2462.field826 = null;
               Statics.field8826 = null;
            }
         } catch (IOException var8) {
            method11183();
         }

      }
   }

   @deob.ObfuscatedName("ct.v(Ladz;B)[I")
   private static int[] method5150(class109 arg0) {
      class124 var1 = new class124(518);
      int[] var2 = new int[4];

      for(int var3 = 0; var3 < 4; ++var3) {
         var2[var3] = (int)(Math.random() * 9.9999999E7D);
      }

      var1.method1568(10);
      var1.method1572(var2[0]);
      var1.method1572(var2[1]);
      var1.method1572(var2[2]);
      var1.method1572(var2[3]);

      for(int var4 = 0; var4 < 10; ++var4) {
         var1.method1572((int)(Math.random() * 9.9999999E7D));
      }

      var1.method1569((int)(Math.random() * 9.9999999E7D));
      var1.method1601(class320.field1996, class320.field1997);
      arg0.field814.method1753(var1.field931, 0, var1.field935);
      return var2;
   }

   @deob.ObfuscatedName("qh.g(I)V")
   private static void method11183() {
      client.field2462.method1411();
      if (field8462 < 2) {
         Statics.field8792.method15276();
         field8460 = 0;
         ++field8462;
         Statics.field8826 = class717.field6638;
      } else {
         Statics.field8826 = null;
         Statics.field8459 = class845.field8656;
         client.method14844(6);
      }

   }
}

