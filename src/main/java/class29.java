import java.io.IOException;

@deob.ObfuscatedName("ab")
public class class29 {
   @deob.ObfuscatedName("ab.g")
   public static boolean field239 = false;
   @deob.ObfuscatedName("ab.h")
   public static boolean field228 = false;
   @deob.ObfuscatedName("ab.e")
   public static boolean field236 = false;

   private class29() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("da.n(B)Laeq;")
   public static class127 method5341() {
      class860 var0 = null;
      class127 var1 = new class127(client.field2584, 0);

      try {
         var0 = class671.method9175("", client.field2584.field7302, false);
         byte[] var2 = new byte[(int)var0.method15148()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method15149(var2, var3, var2.length - var3);
            if (var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new class127(new class124(var2), client.field2584, 0);
      } catch (Exception var8) {
      }

      try {
         if (var0 != null) {
            var0.method15151();
         }
      } catch (Exception var7) {
      }

      return var1;
   }

   @deob.ObfuscatedName("if.k(B)V")
   public static void method7336() {
      class860 var0 = null;

      try {
         var0 = class671.method9175("", client.field2584.field7302, true);
         class124 var1 = Statics.field9361.method1884();
         var0.method15146(var1.field931, 0, var1.field935);
      } catch (Exception var5) {
      }

      try {
         if (var0 != null) {
            var0.method15151();
         }
      } catch (Exception var4) {
      }

   }

   @deob.ObfuscatedName("pg.d(B)I")
   public static int method10719() {
      class171 var0 = Statics.method5930();
      class864.method8680(var0);
      return var0.method15916();
   }

   @deob.ObfuscatedName("w.r(Lagg;I)V")
   public static void method15728(class171 arg0) {
      arg0.method2336(0);
      byte var2;
      if (class671.field6130 >= 96) {
         int var1 = class218.method15958();
         if (var1 <= 104) {
            method9130();
            var2 = 4;
         } else if (var1 <= 500) {
            method5683();
            var2 = 3;
         } else if (var1 <= 1000) {
            Statics.method8993();
            var2 = 2;
         } else {
            method9719(true);
            var2 = 1;
         }

         arg0.method2329(0, var1);
      } else {
         method9719(true);
         var2 = 1;
         arg0.method2327(64);
      }

      if (Statics.field9361.field974.method2236() != 0) {
         Statics.field9361.method1857(Statics.field9361.field979, 0);
         client.method5788(0, false);
      } else {
         Statics.field9361.method1858(Statics.field9361.field974, true);
      }

      method7336();
      arg0.method2326(var2);
   }

   @deob.ObfuscatedName("on.p(Lagg;II)V")
   public static void method10346(class171 arg0, int arg1) {
      arg0.method2336(2);
      byte var2;
      if (arg1 > 12020) {
         method9130();
         var2 = 4;
      } else if (arg1 > 5005) {
         method5683();
         var2 = 3;
      } else if (arg1 > 2020) {
         Statics.method8993();
         var2 = 2;
      } else {
         method9719(true);
         var2 = 1;
      }

      if (Statics.field9361.field974.method2236() != 2) {
         Statics.field9361.method1857(Statics.field9361.field979, 2);
         client.method5788(2, false);
      } else {
         Statics.field9361.method1858(Statics.field9361.field974, true);
      }

      method7336();
      arg0.method2326(var2);
   }

   @deob.ObfuscatedName("pg.o(Lagg;IIB)V")
   public static void method10721(class171 arg0, int arg1, int arg2) {
      arg0.method2336(arg1);
      byte var3;
      if (arg2 > 20083) {
         method9130();
         var3 = 4;
      } else if (arg2 > 10038) {
         method5683();
         var3 = 3;
      } else if (arg2 > 5041) {
         Statics.method8993();
         var3 = 2;
      } else {
         method9719(true);
         var3 = 1;
      }

      if (Statics.field9361.field974.method2236() != arg1) {
         Statics.field9361.method1857(Statics.field9361.field979, arg1);
         client.method5788(arg1, false);
      } else {
         Statics.field9361.method1858(Statics.field9361.field974, true);
      }

      method7336();
      arg0.method2326(var3);
   }

   @deob.ObfuscatedName("lw.a(B)V")
   public static void method9130() {
      Statics.field9361.method1857(Statics.field9361.field948, 2);
      Statics.field9361.method1857(Statics.field9361.field968, 2);
      Statics.field9361.method1857(Statics.field9361.field982, 1);
      Statics.field9361.method1857(Statics.field9361.field960, 1);
      Statics.field9361.method1857(Statics.field9361.field962, 1);
      Statics.field9361.method1857(Statics.field9361.field958, 1);
      Statics.field9361.method1857(Statics.field9361.field971, 1);
      Statics.field9361.method1857(Statics.field9361.field972, 1);
      Statics.field9361.method1857(Statics.field9361.field964, 2);
      Statics.field9361.method1857(Statics.field9361.field951, 1);
      Statics.field9361.method1857(Statics.field9361.field975, 2);
      Statics.field9361.method1857(Statics.field9361.field986, 1);
      Statics.field9361.method1857(Statics.field9361.field952, 0);
      Statics.field9361.method1857(Statics.field9361.field946, 0);
      Statics.field9361.method1857(Statics.field9361.field965, 2);
      Statics.field9361.method1857(Statics.field9361.field961, class441.field3655.field3657);
      Statics.field9361.method1857(Statics.field9361.field954, 0);
      if (Statics.field8847 != null && Statics.field8847.method7492() && Statics.field8847.method7574()) {
         Statics.field8847.method7559();
      }

      Statics.field9361.method1857(Statics.field9361.field970, 1);
      method895();
      Statics.field9361.method1857(Statics.field9361.field973, 0);
      Statics.field9361.method1857(Statics.field9361.field966, 4);
      client.method7899();
      client.field2468.method9512().method11128();
      client.field2429 = true;
   }

   @deob.ObfuscatedName("ec.x(I)V")
   public static void method5683() {
      Statics.field9361.method1857(Statics.field9361.field948, 2);
      Statics.field9361.method1857(Statics.field9361.field968, 2);
      Statics.field9361.method1857(Statics.field9361.field982, 1);
      Statics.field9361.method1857(Statics.field9361.field960, 1);
      Statics.field9361.method1857(Statics.field9361.field962, 1);
      Statics.field9361.method1857(Statics.field9361.field958, 1);
      Statics.field9361.method1857(Statics.field9361.field971, 1);
      Statics.field9361.method1857(Statics.field9361.field972, 1);
      Statics.field9361.method1857(Statics.field9361.field964, 1);
      Statics.field9361.method1857(Statics.field9361.field951, 1);
      Statics.field9361.method1857(Statics.field9361.field975, 0);
      Statics.field9361.method1857(Statics.field9361.field986, 1);
      Statics.field9361.method1857(Statics.field9361.field952, 0);
      Statics.field9361.method1857(Statics.field9361.field946, 0);
      Statics.field9361.method1857(Statics.field9361.field965, 1);
      Statics.field9361.method1857(Statics.field9361.field961, class441.field3655.field3657);
      Statics.field9361.method1857(Statics.field9361.field954, 0);
      if (Statics.field8847 != null && Statics.field8847.method7492() && Statics.field8847.method7574()) {
         Statics.field8847.method7559();
      }

      Statics.field9361.method1857(Statics.field9361.field970, 1);
      method895();
      Statics.field9361.method1857(Statics.field9361.field973, 1);
      Statics.field9361.method1857(Statics.field9361.field966, 3);
      client.method7899();
      client.field2468.method9512().method11128();
      client.field2429 = true;
   }

   @deob.ObfuscatedName("nc.l(ZI)V")
   public static void method9719(boolean arg0) {
      Statics.field9361.method1857(Statics.field9361.field948, 1);
      Statics.field9361.method1857(Statics.field9361.field968, 1);
      Statics.field9361.method1857(Statics.field9361.field982, 0);
      Statics.field9361.method1857(Statics.field9361.field986, 0);
      Statics.field9361.method1857(Statics.field9361.field960, 0);
      Statics.field9361.method1857(Statics.field9361.field962, 0);
      Statics.field9361.method1857(Statics.field9361.field958, 0);
      Statics.field9361.method1857(Statics.field9361.field971, 0);
      Statics.field9361.method1857(Statics.field9361.field964, 0);
      Statics.field9361.method1857(Statics.field9361.field972, 0);
      Statics.field9361.method1857(Statics.field9361.field951, 0);
      Statics.field9361.method1857(Statics.field9361.field975, 0);
      Statics.field9361.method1857(Statics.field9361.field952, 0);
      Statics.field9361.method1857(Statics.field9361.field946, 0);
      Statics.field9361.method1857(Statics.field9361.field965, 0);
      Statics.field9361.method1857(Statics.field9361.field961, class441.field3655.field3657);
      Statics.field9361.method1857(Statics.field9361.field954, 0);
      if (Statics.field8847 != null && Statics.field8847.method7492() && Statics.field8847.method7574()) {
         Statics.field8847.method7559();
      }

      Statics.field9361.method1857(Statics.field9361.field970, 0);
      method895();
      Statics.field9361.method1857(Statics.field9361.field973, 2);
      Statics.field9361.method1857(Statics.field9361.field966, 1);
      client.method7899();
      client.field2468.method9512().method11128();
      client.field2429 = true;
   }

   @deob.ObfuscatedName("aca.u(I)V")
   public static void method895() {
      if (class671.field6097 > 1) {
         Statics.field9361.method1857(Statics.field9361.field980, 4);
      } else {
         Statics.field9361.method1857(Statics.field9361.field980, 2);
      }

   }
}
