@deob.ObfuscatedName("sr")
public final class class816 {
   private class816() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ev.n(Ljava/lang/CharSequence;CB)I")
   public static int method6108(CharSequence arg0, char arg1) {
      int var2 = 0;
      int var3 = arg0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         if (arg0.charAt(var4) == arg1) {
            ++var2;
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("zo.k([Ljava/lang/Object;III)Ljava/lang/String;")
   public static String method17075(Object[] arg0, int arg1, int arg2) {
      if (arg2 == 0) {
         return "";
      } else if (arg2 == 1) {
         CharSequence var3 = (CharSequence)arg0[arg1];
         return var3 == null ? "null" : var3.toString();
      } else {
         int var4 = arg1 + arg2;
         int var5 = 0;

         for(int var6 = arg1; var6 < var4; ++var6) {
            CharSequence var7 = (CharSequence)arg0[var6];
            if (var7 == null) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var8 = new StringBuilder(var5);

         for(int var9 = arg1; var9 < var4; ++var9) {
            CharSequence var10 = (CharSequence)arg0[var9];
            if (var10 == null) {
               var8.append("null");
            } else {
               var8.append(var10);
            }
         }

         return var8.toString();
      }
   }

   @deob.ObfuscatedName("ta.d(Ljava/lang/CharSequence;B)Z")
   public static boolean method14597(CharSequence arg0) {
      return method14511(arg0, 10, true);
   }

   @deob.ObfuscatedName("sw.b(Ljava/lang/CharSequence;IZS)Z")
   private static boolean method14511(CharSequence arg0, int arg1, boolean arg2) {
      if (arg1 >= 2 && arg1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = arg0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = arg0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if (var8 == '+' && arg2) {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - '0';
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - '7';
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  return false;
               }

               var10 = var8 - 'W';
            }

            if (var10 >= arg1) {
               return false;
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + arg1);
      }
   }

   @deob.ObfuscatedName("dw.r(Ljava/lang/CharSequence;I)I")
   public static int method5626(CharSequence arg0) {
      return method14596(arg0, 10, true);
   }

   @deob.ObfuscatedName("si.p(Ljava/lang/CharSequence;II)I")
   public static int method14330(CharSequence arg0, int arg1) {
      return method14596(arg0, arg1, true);
   }

   @deob.ObfuscatedName("ta.o(Ljava/lang/CharSequence;IZI)I")
   private static int method14596(CharSequence arg0, int arg1, boolean arg2) {
      if (arg1 >= 2 && arg1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = arg0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = arg0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if (var8 == '+' && arg2) {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - '0';
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - '7';
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 'W';
            }

            if (var10 >= arg1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + arg1);
      }
   }

   @deob.ObfuscatedName("ev.a(IZB)Ljava/lang/String;")
   public static String method6109(int arg0, boolean arg1) {
      return arg1 && arg0 >= 0 ? method14816(arg0, 10, arg1) : Integer.toString(arg0);
   }

   @deob.ObfuscatedName("to.x(IIZI)Ljava/lang/String;")
   private static String method14816(int arg0, int arg1, boolean arg2) {
      if (arg1 >= 2 && arg1 <= 36) {
         if (arg2 && arg0 >= 0) {
            int var3 = 2;
            int var4 = arg0 / arg1;

            while(var4 != 0) {
               var4 /= arg1;
               ++var3;
            }

            char[] var5 = new char[var3];
            var5[0] = '+';

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = arg0;
               arg0 /= arg1;
               int var8 = var7 - arg0 * arg1;
               if (var8 >= 10) {
                  var5[var6] = (char)(var8 + 87);
               } else {
                  var5[var6] = (char)(var8 + 48);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(arg0, arg1);
         }
      } else {
         throw new IllegalArgumentException("" + arg1);
      }
   }

   @deob.ObfuscatedName("ul.s(Ljava/lang/CharSequence;B)I")
   public static int method15213(CharSequence arg0) {
      int var1 = arg0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class813.method9501(arg0.charAt(var3));
      }

      return var2;
   }

   @deob.ObfuscatedName("nh.l(Ljava/lang/CharSequence;I)I")
   public static int method9839(CharSequence arg0) {
      int var1 = arg0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + arg0.charAt(var3);
      }

      return var2;
   }

   @deob.ObfuscatedName("ai.u(Ljava/lang/CharSequence;I)J")
   public static long method2949(CharSequence arg0) {
      int var1 = arg0.length();
      long var2 = 0L;

      for(int var4 = 0; var4 < var1; ++var4) {
         var2 = (var2 << 5) - var2 + (long)arg0.charAt(var4);
      }

      return var2;
   }

   @deob.ObfuscatedName("lv.g(CI)Z")
   public static boolean method9128(char arg0) {
      return arg0 >= '0' && arg0 <= '9';
   }

   @deob.ObfuscatedName("cz.h(CB)Z")
   public static boolean method5270(char arg0) {
      return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
   }

   @deob.ObfuscatedName("rq.e(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;")
   public static String method14128(String arg0, char arg1, String arg2) {
      int var3 = arg0.length();
      int var4 = arg2.length();
      int var5 = var3;
      int var6 = var4 - 1;
      if (var6 != 0) {
         int var7 = 0;

         while(true) {
            var7 = arg0.indexOf(arg1, var7);
            if (var7 < 0) {
               break;
            }

            ++var7;
            var5 += var6;
         }
      }

      StringBuilder var8 = new StringBuilder(var5);
      int var9 = 0;

      while(true) {
         int var10 = arg0.indexOf(arg1, var9);
         if (var10 < 0) {
            var8.append(arg0.substring(var9));
            return var8.toString();
         }

         var8.append(arg0.substring(var9, var10));
         var8.append(arg2);
         var9 = var10 + 1;
      }
   }

   @deob.ObfuscatedName("afq.m(CS)Z")
   public static boolean method2193(char arg0) {
      if (arg0 >= ' ' && arg0 <= '~') {
         return true;
      } else if (arg0 >= 160 && arg0 <= 255) {
         return true;
      } else {
         return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
      }
   }
}
