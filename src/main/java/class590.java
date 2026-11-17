import java.io.IOException;

@deob.ObfuscatedName("kh")
public class class590 {
   @deob.ObfuscatedName("kh.n")
   private static final int[] field5378 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0};
   @deob.ObfuscatedName("kh.b")
   private static int field5373 = -1;
   @deob.ObfuscatedName("kh.e")
   private static boolean field5379 = false;
   @deob.ObfuscatedName("kh.i")
   private static int field5372 = -1;

   private class590() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("vk.n(S)V")
   public static void method15507() {
      field5379 = true;
      Statics.field5593 = class385.field2822;
      Statics.field3582 = class385.field2823;
      client.method5519(false);
      Statics.field8739 = null;
      Statics.field8782 = null;
      client.method14844(12);
   }

   @deob.ObfuscatedName("gs.k(I)V")
   public static void method6861() {
      if (Statics.field8739 == null) {
         Statics.field8739 = class588.method8282();
         Statics.field3854 = Statics.field8739[0];
         Statics.field2209 = class431.method2169();
      }

      if (Statics.field9392 == null) {
         method5401();
      }

      class588 var0 = Statics.field3854;
      int var1 = method4107();
      if (Statics.field3854 == var0) {
         Statics.field5936 = Statics.field3854.field5344.method15374(Statics.field243);
         if (Statics.field3854.field5357) {
            Statics.field10596 = (Statics.field3854.field5368 - Statics.field3854.field5365) * var1 / 100 + Statics.field3854.field5365;
         }

         if (Statics.field3854.field5367) {
            Statics.field5936 = Statics.field5936 + Statics.field10596 + "%";
         }
      } else if (class588.field5361 == Statics.field3854) {
         Statics.field9392 = null;
         client.method14844(6);
         if (field5379) {
            field5379 = false;
            class385.method8022(Statics.field5593, Statics.field3582);
         }
      } else {
         Statics.field5936 = var0.field5364.method15374(Statics.field243);
         if (Statics.field3854.field5367) {
            Statics.field5936 = Statics.field5936 + var0.field5368 + "%";
         }

         Statics.field10596 = var0.field5368;
         if (Statics.field3854.field5357 || var0.field5357) {
            Statics.field2209 = class431.method2169();
         }
      }

      if (Statics.field9392 != null) {
         Statics.field9392.method8490(Statics.field2209, Statics.field5936, Statics.field10596, Statics.field3854);
         if (Statics.field7184 != null) {
            for(int var2 = field5373 + 1; var2 < Statics.field7184.length; ++var2) {
               if (Statics.field7184[var2].method8235() >= 100 && field5373 == var2 - 1 && client.field2410 != 12 && Statics.field9392.method8485()) {
                  try {
                     Statics.field7184[var2].method8233();
                  } catch (Exception var4) {
                     Statics.field7184 = null;
                     break;
                  }

                  Statics.field9392.method8497(Statics.field7184[var2]);
                  ++field5373;
                  if (field5373 >= Statics.field7184.length - 1 && Statics.field7184.length > 1) {
                     field5373 = Statics.field5380.method15745() ? 0 : -1;
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("dj.d(I)V")
   private static void method5401() {
      if (Statics.field3854 != null) {
         Statics.field9392 = new class598();
         Statics.field9392.method8490(Statics.field2209, Statics.field3854.field5344.method15374(Statics.field243), Statics.field3854.field5365, Statics.field3854);
         Statics.field6691 = new Thread(Statics.field9392, "");
         Statics.field6691.start();
      }
   }

   @deob.ObfuscatedName("dl.b(ZB)V")
   public static void method5489(boolean arg0) {
      if (Statics.field9392 == null) {
         method5401();
      }

      if (arg0) {
         Statics.field9392.method8487();
      }

   }

   @deob.ObfuscatedName("aev.r(I)I")
   public static int method2001() {
      return Statics.field9392.method8508();
   }

   @deob.ObfuscatedName("kh.p(B)V")
   public static void method8326() {
      if (Statics.field7184 != null) {
         class592[] var0 = Statics.field7184;

         for(int var1 = 0; var1 < var0.length; ++var1) {
            class592 var2 = var0[var1];
            var2.method8233();
         }
      }

   }

   @deob.ObfuscatedName("vp.o(I)I")
   private static int method15563() {
      int var0 = Statics.field3854.field5362;
      if (var0 < Statics.field8739.length - 1) {
         Statics.field3854 = Statics.field8739[var0 + 1];
      }

      return 100;
   }

   @deob.ObfuscatedName("b.a(B)I")
   private static int method4107() {
      if (Statics.field9361.field956.method2157() == 0) {
         for(int var0 = 0; var0 < client.field2437; ++var0) {
            if (client.field2438[var0].method1296() == 's' || client.field2438[var0].method1296() == 'S') {
               Statics.field9361.method1857(Statics.field9361.field956, 1);
               client.field2399 = true;
               class864.method10009(class917.field9357);
               break;
            }
         }
      }

      if (class588.field5358 == Statics.field3854) {
         if (Statics.field8782 == null) {
            Statics.field8782 = new class624(Statics.field9401, Statics.field3048, class320.field1998, class320.field1999);
         }

         if (!Statics.field8782.method8979()) {
            return 0;
         }

         client.method1274(0, (String)null, true);
         Statics.field3677 = !class585.method15145();
         Statics.field5375 = client.method4523(Statics.field3677 ? class421.field3296 : class421.field3273, false, 1, true);
         Statics.field5376 = client.method4523(class421.field3295, false, 1, true);
         Statics.field4891 = client.method4523(class421.field3275, false, 1, true);
      }

      if (class588.field5345 == Statics.field3854) {
         boolean var1 = Statics.field5376.method8776();
         int var2 = Statics.field8846[class421.field3295.method5782()].method619();
         int var3 = var2 + Statics.field8846[Statics.field3677 ? class421.field3296.method5782() : class421.field3273.method5782()].method619();
         int var4 = var3 + Statics.field8846[class421.field3275.method5782()].method619();
         int var5 = var4 + (var1 ? 100 : Statics.field5376.method8778());
         if (var5 != 400) {
            return var5 / 4;
         }

         Statics.field5377 = Statics.field5375.method8766();
         Statics.field5374 = Statics.field5376.method8766();
         class771.method5691(Statics.field5375);
         int var6 = Statics.field9361.field981.method2179();
         Statics.field5380 = new class910(client.field2584, Statics.field243, Statics.field5376);
         class914[] var7 = Statics.field5380.method15744(var6);
         if (var7.length == 0) {
            var7 = Statics.field5380.method15744(0);
         }

         class469 var8 = new class469(Statics.field5375, Statics.field4891);
         if (var7.length > 0) {
            Statics.field7184 = new class592[var7.length];

            for(int var9 = 0; var9 < Statics.field7184.length; ++var9) {
               Statics.field7184[var9] = new class585(Statics.field5380.method15743(var7[var9].field9276), var7[var9].field9277, var7[var9].field9275, var8);
            }
         }
      }

      if (class588.field5353 == Statics.field3854) {
         Statics.field10616 = new class557(Statics.field5375, Statics.field4891, class771.method438());
      }

      if (class588.field5347 == Statics.field3854) {
         int var10 = Statics.field10616.method7867();
         int var11 = Statics.field10616.method7869();
         if (var10 < var11) {
            return var10 * 100 / var11;
         }
      }

      if (class588.field5348 == Statics.field3854) {
         if (Statics.field7184 != null && Statics.field7184.length > 0) {
            if (Statics.field7184[0].method8235() < 100) {
               return 0;
            }

            if (Statics.field7184.length > 1 && Statics.field5380.method15745() && Statics.field7184[1].method8235() < 100) {
               return 0;
            }
         }

         Statics.field10616.method7865(client.field2430);
         class771.method7316(Statics.field8847);
         client.method14844(2);
      }

      if (class588.field5359 == Statics.field3854) {
         Statics.field6723 = client.method4523(class421.field3270, false, 1, false);
         Statics.field8866 = client.method4523(class421.field3291, false, 1, false);
         Statics.field9961 = client.method4523(class421.field3263, false, 1, false);
         Statics.field3567 = client.method4523(class421.field3264, false, 1, true);
         Statics.field132 = client.method4523(class421.field3265, false, 1, true);
         Statics.field2775 = client.method4523(class421.field3266, false, 1, false);
         Statics.field1805 = client.method4523(class421.field3301, true, 1, false);
         Statics.field6467 = client.method4523(class421.field3268, true, 1, false);
         Statics.field8828 = client.method4523(class421.field3269, false, 1, false);
         Statics.field200 = client.method4523(class421.field3299, true, 1, false);
         Statics.field9250 = client.method4523(class421.field3293, true, 1, false);
         Statics.field3937 = client.method4523(class421.field3272, false, 1, false);
         Statics.field3965 = client.method4523(class421.field3283, false, 1, false);
         Statics.field3827 = client.method4523(class421.field3274, false, 1, true);
         Statics.field7262 = client.method4523(class421.field3276, false, 1, false);
         Statics.field6046 = client.method4523(class421.field3277, false, 1, false);
         Statics.field6724 = client.method4523(class421.field3278, false, 1, true);
         Statics.field8546 = client.method4523(class421.field3279, false, 1, true);
         Statics.field9437 = client.method4523(class421.field3280, false, 1, true);
         Statics.field452 = client.method4523(class421.field3281, false, 1, true);
         Statics.field1169 = client.method4523(class421.field3267, false, 1, true);
         Statics.field6084 = client.method4523(class421.field3262, false, 1, true);
         Statics.field6858 = client.method4523(class421.field3284, false, 1, true);
         Statics.field2508 = client.method4523(class421.field3285, true, 1, false);
         Statics.field8783 = client.method4523(class421.field3300, false, 1, true);
         Statics.field1995 = client.method4523(class421.field3287, false, 1, true);
         Statics.field8465 = client.method4523(class421.field3288, true, 1, true);
         Statics.field7197 = client.method4523(class421.field3289, false, 1, true);
         Statics.field2838 = client.method4523(class421.field3290, true, 1, true);
         Statics.field9246 = client.method4523(class421.field3282, false, 1, true);
         Statics.field160 = client.method4523(class421.field3297, true, 1, false);
         Statics.field9882 = client.method4523(class421.field3292, true, 1, false);
         Statics.field6375 = client.method4523(class421.field3286, true, 1, true);
         Statics.field7162 = client.method4523(class421.field3298, true, 2, false);
      }

      if (class588.field5350 == Statics.field3854) {
         int var12 = 0;

         for(int var13 = 0; var13 < Statics.field8846.length; ++var13) {
            if (Statics.field8846[var13] != null) {
               var12 += Statics.field8846[var13].method619() * field5378[var13] / 100;
            }
         }

         if (var12 != 100) {
            if (field5372 < 0) {
               field5372 = var12;
            }

            return (var12 - field5372) * 100 / (100 - field5372);
         }

         class771.method5405(Statics.field6723);
         Statics.field10616 = new class557(Statics.field6723, Statics.field4891, class771.method438());
      }

      if (class588.field5346 == Statics.field3854) {
         byte[] var14 = Statics.field2838.method8809(class780.field7157.field7155);
         if (var14 == null) {
            return 0;
         }

         method4095(var14);
         class677.method7418();
         client.method14844(10);
      }

      if (class588.field5352 == Statics.field3854 && Statics.field3855 == null) {
         Statics.field3855 = new class680(Statics.field9882);
         class926.method6114(Statics.field3855);
      }

      if (class588.field5349 == Statics.field3854) {
         int var15 = class601.method7317();
         if (var15 < 100) {
            return var15;
         }

         method14901(Statics.field2838.method8809(class780.field7160.field7155));
         Statics.field5740 = new class797(Statics.field2838);
         Statics.field3671 = Statics.field5740.field7286;
         Statics.field6884 = Statics.field5740.field7274;
         if (Statics.field5740.field7292 != -1 && Statics.field5740.field7291 != -1) {
            client.field2555 = Statics.field5740.field7292;
            client.field2556 = Statics.field5740.field7291;
         }

         Statics.field3828 = new class794(Statics.field2838);
         Statics.field3302 = new class793(Statics.field2838);
         Statics.field3681 = new class774(Statics.field2838);
      }

      if (class588.field5354 == Statics.field3854) {
         if (Statics.field5740.field7287 != -1 && !Statics.field8828.method8773(Statics.field5740.field7287, 0)) {
            return 99;
         }

         Statics.field6508 = new class378(Statics.field8465, Statics.field200, Statics.field9250);
         Statics.field5946 = new class929(client.field2584, Statics.field243, Statics.field3567);
         Statics.field8402 = new class731(client.field2584, Statics.field243, Statics.field3567, Statics.field3828);
         Statics.field2839 = new class886(client.field2584, Statics.field243, Statics.field3567, Statics.field6723);
         Statics.field3086 = new class866(client.field2584, Statics.field243, Statics.field8546);
         Statics.field1613 = new class785(client.field2584, Statics.field243, Statics.field3567);
         Statics.field8466 = new class858(client.field2584, Statics.field243, Statics.field3567);
         Statics.field5741 = new class740(client.field2584, Statics.field243, Statics.field3567, Statics.field6723);
         Statics.field2958 = new class695(client.field2584, Statics.field243, Statics.field3567, Statics.field6723);
         Statics.field9434 = new class476(client.field2584, Statics.field243, Statics.field3567, Statics.field8828);
         Statics.field9258 = new class911(client.field2584, Statics.field243, Statics.field3567);
         Statics.field6797 = new class897(client.field2584, Statics.field243, Statics.field3567);
         Statics.field9422 = new class831(client.field2584, Statics.field243, true, Statics.field6724, Statics.field8828);
         client.field2468.method9529(Statics.field9422);
         Statics.field4892.method8953(new class831(client.field2584, Statics.field243, true, Statics.field6724, Statics.field8828));
         Statics.field6782 = new class721(client.field2584, Statics.field243, Statics.field3567, Statics.field6723);
         Statics.field7163 = new class918(client.field2584, Statics.field243, Statics.field3567, Statics.field6723);
         Statics.field93 = new class919(client.field2584, Statics.field243, true, Statics.field9437, Statics.field8828);
         Statics.field4196 = new class892(client.field2584, Statics.field243, true, Statics.field5946, Statics.field452, Statics.field8828);
         Statics.field3757 = new class766(client.field2584, Statics.field243, Statics.field3567, true);
         Statics.field2046 = new class818(client.field2584, Statics.field243, Statics.field1169, Statics.field8866, Statics.field9961);
         Statics.field7125 = new class707(client.field2584, Statics.field243, Statics.field3567);
         Statics.field6768 = new class445(client.field2584, Statics.field243, Statics.field3567);
         Statics.field3758 = new class796(client.field2584, Statics.field243, Statics.field6084, Statics.field8828);
         Statics.field5700 = new class903(client.field2584, Statics.field243, Statics.field3567, true);
         Statics.field819 = new class909(client.field2584, Statics.field243, Statics.field3567);
         Statics.field7033 = new class900(client.field2584, Statics.field243, Statics.field3567);
         Statics.field5610 = new class729(client.field2584, Statics.field243, Statics.field6858);
         Statics.field8710 = new class559(client.field2584, Statics.field243, Statics.field3567);
         Statics.field490 = new class878(client.field2584, Statics.field243, Statics.field3567);
         Statics.field3060 = new class800(client.field2584, Statics.field243, Statics.field3567);
         Statics.field6159 = new class928(client.field2584, Statics.field243, Statics.field3567);
         Statics.field9068 = new class763(client.field2584, Statics.field243, Statics.field3567);
         class425.method10667(Statics.field132, Statics.field8828, Statics.field6723, Statics.field4891);
         class532.method11084(Statics.field9246);
         Statics.field8671 = new class617(Statics.field243, Statics.field8783, Statics.field1995);
         Statics.field8477 = new class904(Statics.field243, Statics.field8783, Statics.field1995, new class546());
         Statics.field10637 = new class439();
         client.method7899();
         class836.method10716(Statics.field2046);
         class764.method10641(Statics.field7197);
         class656.method5480(Statics.field8828, Statics.field6508);
         class458 var16 = new class458(Statics.field3937.method8823("huffman", ""));
         class450.method482(var16);
         Statics.field1166 = class672.method15477();
         Statics.field8859 = new class112(true);
      }

      if (class588.field5355 == Statics.field3854) {
         int var17 = class771.method7975(Statics.field6723) + Statics.field10616.method7884(true);
         int var18 = class771.method14947() + Statics.field10616.method7869();
         if (var17 < var18) {
            return var17 * 100 / var18;
         }
      }

      if (class588.field5356 == Statics.field3854) {
         class697.method10202(Statics.field2508, Statics.field1613, Statics.field8466, client.field2468.method9636(), Statics.field6782, Statics.field7163, Statics.field10637);
      }

      if (class588.field5351 == Statics.field3854) {
         Statics.field8854 = new int[Statics.field7033.field9192];
         Statics.field8400 = new boolean[Statics.field7033.field9192];
         Statics.field9056 = new String[Statics.field819.field9249];

         for(int var19 = 0; var19 < Statics.field7033.field9192; ++var19) {
            if (Statics.field7033.method15668(var19).field9239 == 0) {
               Statics.field8400[var19] = true;
               ++client.field2472;
            }

            Statics.field8854[var19] = -1;
         }

         method2946();
         Statics.field1805.method8856(false, true);
         Statics.field6467.method8856(true, true);
         Statics.field6723.method8856(true, true);
         Statics.field4891.method8856(true, true);
         Statics.field3937.method8856(true, true);
         client.field2425 = true;
      }

      if (class588.field5366 == Statics.field3854) {
         if (!class425.method4009(Statics.field5740.field7283, (int[])null)) {
            return 0;
         }

         boolean var20 = true;

         for(int var21 = 0; var21 < Statics.field844[Statics.field5740.field7283].field3569.length; ++var21) {
            class425 var22 = Statics.field844[Statics.field5740.field7283].field3569[var21];
            if (var22.field3402 == 5 && var22.field3494 != -1 && !Statics.field6723.method8773(var22.field3494, 0)) {
               var20 = false;
            }
         }

         if (!var20) {
            return 0;
         }
      }

      if (class588.field5360 == Statics.field3854) {
         client.method272(true);
      }

      if (class588.field5363 == Statics.field3854) {
         Statics.field9392.method8496();

         try {
            Statics.field6691.join();
         } catch (InterruptedException var24) {
            return 0;
         }

         Statics.field9392 = null;
         Statics.field6691 = null;
         Statics.field5375 = null;
         Statics.field5376 = null;
         Statics.field5380 = null;
         Statics.field7184 = null;
         class585.method14329();
         client.field2398 = Statics.field9361.field956.method2157() == 1;
         Statics.field9361.method1857(Statics.field9361.field956, 1);
         if (client.field2398) {
            Statics.field9361.method1857(Statics.field9361.field979, 0);
         } else if (Statics.field9361.field979.field1142 && Statics.field8859.field845 < 512 && Statics.field8859.field845 != 0) {
            Statics.field9361.method1857(Statics.field9361.field979, 0);
         }

         class29.method7336();
         if (client.field2398) {
            client.method5788(0, false);
            if (!client.field2399) {
               class864.method10009(class917.field9358);
            }
         } else {
            client.method5788(Statics.field9361.field979.method2236(), false);
            if (Statics.field9361.field979.method2236() == 0) {
               class864.method10009(class917.field9359);
            }
         }

         client.method10176(Statics.field9361.field967.method2066(), -1, -1, false);
         Statics.field10616.method7865(client.field2430);
         class771.method7316(Statics.field8847);
         class771.method10818(Statics.field8847, Statics.field6723);
         class987.method7391(Statics.field6914);
      }

      return method15563();
   }

   @deob.ObfuscatedName("tr.x([BI)V")
   private static void method14901(byte[] arg0) {
      class124 var1 = new class124(arg0);

      while(true) {
         int var2 = var1.method1688();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            int[] var3 = Statics.field1211 = new int[6];
            var3[0] = var1.method1587();
            var3[1] = var1.method1587();
            var3[2] = var1.method1587();
            var3[3] = var1.method1587();
            var3[4] = var1.method1587();
            var3[5] = var1.method1587();
         }
      }
   }

   @deob.ObfuscatedName("az.s([BI)V")
   private static void method4095(byte[] arg0) {
      class124 var1 = new class124(arg0);

      while(true) {
         int var2 = var1.method1688();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            int var3 = var1.method1587();
            if (class677.field6157 == -1) {
               class677.field6157 = var3;
            }
         }
      }
   }

   @deob.ObfuscatedName("ai.l(I)V")
   private static void method2946() {
      class860 var0 = null;

      try {
         var0 = class671.method9175("2", client.field2584.field7302, false);
         byte[] var1 = new byte[(int)var0.method15148()];

         int var3;
         for(int var2 = 0; var2 < var1.length; var2 += var3) {
            var3 = var0.method15149(var1, var2, var1.length - var2);
            if (var3 == -1) {
               throw new IOException();
            }
         }

         method2047(new class124(var1));
      } catch (Exception var7) {
      }

      try {
         if (var0 != null) {
            var0.method15151();
         }
      } catch (Exception var6) {
      }

   }

   @deob.ObfuscatedName("aez.u(Laen;B)V")
   private static void method2047(class124 arg0) {
      if (arg0.field931.length - arg0.field935 >= 1) {
         int var1 = arg0.method1688();
         if (var1 >= 0 && var1 <= 1) {
            if (arg0.field931.length - arg0.field935 >= 2) {
               int var2 = arg0.method1587();
               if (arg0.field931.length - arg0.field935 >= var2 * 6) {
                  for(int var3 = 0; var3 < var2; ++var3) {
                     int var4 = arg0.method1587();
                     int var5 = arg0.method1591();
                     if (var4 < Statics.field8854.length && Statics.field8400[var4] && (Statics.field7033.method15668(var4).field9240 != '1' || var5 >= -1 && var5 <= 1)) {
                        Statics.field8854[var4] = var5;
                     }
                  }

               }
            }
         }
      }
   }

   @deob.ObfuscatedName("lc.v(I)I")
   public static int method8872() {
      return Statics.field5374;
   }

   @deob.ObfuscatedName("aaq.g(B)I")
   public static int method397() {
      return Statics.field5377;
   }

   @deob.ObfuscatedName("fe.h(I)V")
   public static void method6239() {
      if (Statics.field9392 != null) {
         Statics.field9392.method8496();
      }

      if (Statics.field6691 != null) {
         while(true) {
            try {
               Statics.field6691.join();
               break;
            } catch (InterruptedException var1) {
            }
         }
      }

   }
}
