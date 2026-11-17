@deob.ObfuscatedName("ui")
public class class861 {
   @deob.ObfuscatedName("ui.o")
   public static boolean field8793 = false;
   @deob.ObfuscatedName("ui.s")
   public static class114[] field8796 = new class114[0];
   @deob.ObfuscatedName("ui.l")
   private static int field8797 = 1000478;
   @deob.ObfuscatedName("ui.u")
   public static int field8791 = 0;
   @deob.ObfuscatedName("ui.v")
   public static class786 field8798 = null;
   @deob.ObfuscatedName("ui.g")
   public static boolean field8799 = false;

   private class861() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("lv.k(ILjava/lang/String;I)Z")
   public static boolean method9127(int arg0, String arg1) {
      Statics.field8789 = new class873();
      Statics.field8789.field8851 = arg0;
      Statics.field8789.field8849 = arg1;
      if (class819.field8428 != Statics.field4896) {
         Statics.field8789.field8850 = Statics.field8789.field8851 + 40000;
         Statics.field8789.field8852 = Statics.field8789.field8851 + 50000;
      }

      return true;
   }

   @deob.ObfuscatedName("aax.d(Ljava/lang/String;II)V")
   public static void method451(String arg0, int arg1) {
      if (Statics.field8792 == null) {
         Statics.field8792 = new class873();
      }

      Statics.field8792.field8849 = arg0;
      Statics.field8792.field8851 = arg1 + 1099;
      Statics.field8792.field8850 = Statics.field8792.field8851 + 40000;
      Statics.field8792.field8852 = Statics.field8792.field8851 + 50000;
   }

   @deob.ObfuscatedName("ef.b(B)V")
   public static void method5744() {
      if (Statics.field8788.field8851 != -1) {
         method9127(Statics.field8788.field8851, Statics.field8788.field8849);
      }

   }

   @deob.ObfuscatedName("ec.p(B)Laed;")
   public static class114 method5684() {
      field8797 = 0;
      return method7438();
   }

   @deob.ObfuscatedName("iw.o(I)Laed;")
   public static class114 method7438() {
      return field8797 < field8796.length ? field8796[++field8797 - 1] : null;
   }

   @deob.ObfuscatedName("rw.a(B)Laed;")
   public static class114 method14183() {
      return class755.method5207(Statics.field8789.field8851);
   }

   @deob.ObfuscatedName("wp.x(IZIZI)V")
   public static void method15877(int arg0, boolean arg1, int arg2, boolean arg3) {
      method6258(0, field8796.length - 1, arg0, arg1, arg2, arg3);
      field8791 = 0;
      field8798 = null;
   }

   @deob.ObfuscatedName("ff.s(IIIZIZI)V")
   private static void method6258(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
      if (arg0 < arg1) {
         int var6 = (arg0 + arg1) / 2;
         int var7 = arg0;
         class114 var8 = field8796[var6];
         field8796[var6] = field8796[arg1];
         field8796[arg1] = var8;

         for(int var9 = arg0; var9 < arg1; ++var9) {
            if (method4052(field8796[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
               class114 var10 = field8796[var9];
               field8796[var9] = field8796[var7];
               field8796[var7++] = var10;
            }
         }

         field8796[arg1] = field8796[var7];
         field8796[var7] = var8;
         method6258(arg0, var7 - 1, arg2, arg3, arg4, arg5);
         method6258(var7 + 1, arg1, arg2, arg3, arg4, arg5);
      }

   }

   @deob.ObfuscatedName("av.l(Laed;Laed;IZIZI)I")
   private static int method4052(class114 arg0, class114 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
      int var6 = method11651(arg0, arg1, arg2, arg3);
      if (var6 != 0) {
         return arg3 ? -var6 : var6;
      } else if (arg4 == -1) {
         return 0;
      } else {
         int var7 = method11651(arg0, arg1, arg4, arg5);
         return arg5 ? -var7 : var7;
      }
   }

   @deob.ObfuscatedName("re.u(Laed;Laed;IZB)I")
   private static int method11651(class114 arg0, class114 arg1, int arg2, boolean arg3) {
      if (arg2 == 1) {
         int var4 = arg0.field6946;
         int var5 = arg1.field6946;
         if (!arg3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (arg2 == 2) {
         return class804.method8354(arg0.method1493().field6947, arg1.method1493().field6947, Statics.field243);
      } else if (arg2 == 3) {
         if (arg0.field896.equals("-")) {
            if (arg1.field896.equals("-")) {
               return 0;
            } else {
               return arg3 ? -1 : 1;
            }
         } else if (arg1.field896.equals("-")) {
            return arg3 ? 1 : -1;
         } else {
            return class804.method8354(arg0.field896, arg1.field896, Statics.field243);
         }
      } else if (arg2 == 4) {
         return arg0.method11173() ? (arg1.method11173() ? 0 : 1) : (arg1.method11173() ? -1 : 0);
      } else if (arg2 == 5) {
         return arg0.method11168() ? (arg1.method11168() ? 0 : 1) : (arg1.method11168() ? -1 : 0);
      } else if (arg2 == 6) {
         return arg0.method11169() ? (arg1.method11169() ? 0 : 1) : (arg1.method11169() ? -1 : 0);
      } else if (arg2 == 7) {
         return arg0.method11167() ? (arg1.method11167() ? 0 : 1) : (arg1.method11167() ? -1 : 0);
      } else if (arg2 == 8) {
         int var6 = arg0.field895;
         int var7 = arg1.field895;
         if (arg3) {
            if (var6 == 1000) {
               var6 = -1;
            }

            if (var7 == 1000) {
               var7 = -1;
            }
         } else {
            if (var6 == -1) {
               var6 = 1000;
            }

            if (var7 == -1) {
               var7 = 1000;
            }
         }

         return var6 - var7;
      } else {
         return arg0.field897 - arg1.field897;
      }
   }
}
