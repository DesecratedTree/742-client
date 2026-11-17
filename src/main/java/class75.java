@deob.ObfuscatedName("acs")
public final class class75 extends class674 {
   @deob.ObfuscatedName("acs.h")
   private boolean field554 = true;
   @deob.ObfuscatedName("acs.e")
   public boolean field555 = false;
   @deob.ObfuscatedName("acs.z")
   public static class849 field556 = new class849();
   @deob.ObfuscatedName("acs.m")
   public static class849 field544 = new class849();
   @deob.ObfuscatedName("acs.i")
   public static long field549 = 1L;
   @deob.ObfuscatedName("acs.r")
   private int field543;
   @deob.ObfuscatedName("acs.p")
   public int field545;
   @deob.ObfuscatedName("acs.o")
   public int field546;
   @deob.ObfuscatedName("acs.a")
   private int field547;
   @deob.ObfuscatedName("acs.v")
   private int field548;
   @deob.ObfuscatedName("acs.l")
   private int field550;
   @deob.ObfuscatedName("acs.u")
   private int field551;
   @deob.ObfuscatedName("acs.s")
   private int field552;
   @deob.ObfuscatedName("acs.x")
   private int field557;
   @deob.ObfuscatedName("acs.b")
   public int field558;
   @deob.ObfuscatedName("acs.g")
   private class832 field553;

   private class75() {
   }

   @deob.ObfuscatedName("rw.n(IIIIIIII)V")
   public static void method14184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      class75 var7 = null;

      for(class75 var8 = (class75)field556.method14964(); var8 != null; var8 = (class75)field556.method15006()) {
         if (var8.field558 == arg0 && var8.field545 == arg1 && var8.field546 == arg2 && var8.field543 == arg3) {
            var7 = var8;
            break;
         }
      }

      if (var7 == null) {
         var7 = new class75();
         var7.field558 = arg0;
         var7.field543 = arg3;
         var7.field545 = arg1;
         var7.field546 = arg2;
         if (arg1 >= 0 && arg2 >= 0 && arg1 < client.field2468.method9648() && arg2 < client.field2468.method9604()) {
            method11428(var7);
         }

         field556.method14959(var7);
      }

      var7.field550 = arg4;
      var7.field548 = arg5;
      var7.field551 = arg6;
      var7.field554 = true;
      var7.field555 = false;
   }

   @deob.ObfuscatedName("we.k(IIIIIILtg;I)V")
   public static void method15758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class832 arg6) {
      class75 var7 = null;

      for(class75 var8 = (class75)field544.method14964(); var8 != null; var8 = (class75)field544.method15006()) {
         if (var8.field558 == arg0 && var8.field545 == arg1 && var8.field546 == arg2 && var8.field543 == arg3) {
            var7 = var8;
            break;
         }
      }

      if (var7 == null) {
         var7 = new class75();
         var7.field558 = arg0;
         var7.field543 = arg3;
         var7.field545 = arg1;
         var7.field546 = arg2;
         field544.method14959(var7);
      }

      var7.field550 = arg4;
      var7.field548 = arg5;
      var7.field553 = arg6;
      var7.field554 = true;
      var7.field555 = false;
   }

   @deob.ObfuscatedName("aav.d(I)V")
   public static final void method443() {
      for(class75 var0 = (class75)field556.method14964(); var0 != null; var0 = (class75)field556.method15006()) {
         if (!var0.field555) {
            var0.field554 = true;
            if (var0.field545 >= 0 && var0.field546 >= 0 && var0.field545 < client.field2468.method9648() && var0.field546 < client.field2468.method9604()) {
               method11428(var0);
            }
         } else {
            var0.method9864();
         }
      }

      for(class75 var1 = (class75)field544.method14964(); var1 != null; var1 = (class75)field544.method15006()) {
         if (!var1.field555) {
            var1.field554 = true;
         } else {
            var1.method9864();
         }
      }

   }

   @deob.ObfuscatedName("qw.b(Lacs;B)V")
   private static final void method11428(class75 arg0) {
      class713 var1 = client.field2468.method9639();
      if (var1 != null) {
         class376 var2 = null;
         if (arg0.field543 == 0) {
            var2 = (class376)var1.method10510(arg0.field558, arg0.field545, arg0.field546);
         }

         if (arg0.field543 == 1) {
            var2 = (class376)var1.method10577(arg0.field558, arg0.field545, arg0.field546);
         }

         if (arg0.field543 == 2) {
            var2 = (class376)var1.method10514(arg0.field558, arg0.field545, arg0.field546, client.field2704);
         }

         if (arg0.field543 == 3) {
            var2 = (class376)var1.method10516(arg0.field558, arg0.field545, arg0.field546);
         }

         if (var2 != null) {
            arg0.field547 = var2.method5093();
            arg0.field552 = var2.method5083();
            arg0.field557 = var2.method5084();
         } else {
            arg0.field547 = -1;
            arg0.field552 = 0;
            arg0.field557 = 0;
         }

      }
   }

   @deob.ObfuscatedName("fu.r(I)V")
   public static final void method6528() {
      for(class75 var0 = (class75)field556.method14964(); var0 != null; var0 = (class75)field556.method15006()) {
         method282(var0, false);
      }

      for(class75 var1 = (class75)field544.method14964(); var1 != null; var1 = (class75)field544.method15006()) {
         method282(var1, true);
      }

   }

   @deob.ObfuscatedName("aai.p(Lacs;ZI)V")
   private static final void method282(class75 arg0, boolean arg1) {
      if (arg0.field555) {
         if (arg0.field547 < 0 || class54.method16030(client.field2468.method9636(), arg0.field547, arg0.field552)) {
            if (!arg1) {
               method11661(arg0.field558, arg0.field543, arg0.field545, arg0.field546, arg0.field547, arg0.field557, arg0.field552, -1);
            } else {
               method14065(arg0.field558, arg0.field543, arg0.field545, arg0.field546, (class832)null);
            }

            arg0.method9864();
         }
      } else if (arg0.field554 && arg0.field545 >= 1 && arg0.field546 >= 1 && arg0.field545 <= client.field2468.method9648() - 2 && arg0.field546 <= client.field2468.method9604() - 2 && (arg0.field550 < 0 || class54.method16030(client.field2468.method9636(), arg0.field550, arg0.field548))) {
         if (!arg1) {
            method11661(arg0.field558, arg0.field543, arg0.field545, arg0.field546, arg0.field550, arg0.field551, arg0.field548, -1);
         } else {
            method14065(arg0.field558, arg0.field543, arg0.field545, arg0.field546, arg0.field553);
         }

         arg0.field554 = false;
         if (!arg1 && arg0.field550 == arg0.field547 && arg0.field547 == -1) {
            arg0.method9864();
         } else if (!arg1 && arg0.field550 == arg0.field547 && arg0.field557 == arg0.field551 && arg0.field552 == arg0.field548) {
            arg0.method9864();
         }
      }

   }

   @deob.ObfuscatedName("rf.o(IIIIIIIII)V")
   public static final void method11661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg2 >= 1 && arg3 >= 1 && arg2 <= client.field2468.method9648() - 2 && arg3 <= client.field2468.method9604() - 2) {
         int var8 = arg0;
         if (arg0 < 3 && client.field2468.method9592().method8746(arg2, arg3)) {
            var8 = arg0 + 1;
         }

         if (client.field2468.method9639() == null) {
            return;
         }

         client.field2468.method9528().method863(Statics.field8847, arg0, arg1, arg2, arg3, client.field2468.method9521(arg0));
         if (arg4 >= 0) {
            int var9 = Statics.field9361.field982.method2079();
            Statics.field9361.method1857(Statics.field9361.field982, 1);
            client.field2468.method9528().method861(Statics.field8847, var8, arg0, arg2, arg3, arg4, arg5, arg6, client.field2468.method9521(arg0), arg7);
            Statics.field9361.method1857(Statics.field9361.field982, var9);
         }
      }

   }

   @deob.ObfuscatedName("ro.a(IIIILtg;I)V")
   private static final void method14065(int arg0, int arg1, int arg2, int arg3, class832 arg4) {
      if (arg2 >= 1 && arg3 >= 1 && arg2 <= client.field2468.method9648() - 2 && arg3 <= client.field2468.method9604() - 2) {
         if (client.field2468.method9639() == null) {
            return;
         }

         class376 var5 = client.field2468.method9528().method856(arg0, arg1, arg2, arg3);
         if (var5 != null) {
            if (var5 instanceof class941) {
               ((class941)var5).method16010(arg4);
            } else if (var5 instanceof class956) {
               ((class956)var5).method16045(arg4);
            } else if (var5 instanceof class965) {
               ((class965)var5).method16087(arg4);
            } else if (var5 instanceof class968) {
               ((class968)var5).method16099(arg4);
            }
         }
      }

   }
}
