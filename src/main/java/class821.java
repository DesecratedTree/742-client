@deob.ObfuscatedName("sw")
public class class821 {
   @deob.ObfuscatedName("sw.n")
   private static char[] field8438 = new char[64];
   @deob.ObfuscatedName("sw.k")
   private static char[] field8437;
   @deob.ObfuscatedName("sw.d")
   private static int[] field8436;

   static {
      for(int var0 = 0; var0 < 26; ++var0) {
         field8438[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field8438[var1] = (char)(var1 + 97 - 26);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field8438[var2] = (char)(var2 + 48 - 52);
      }

      field8438[62] = '+';
      field8438[63] = '/';
      field8437 = new char[64];

      for(int var3 = 0; var3 < 26; ++var3) {
         field8437[var3] = (char)(var3 + 65);
      }

      for(int var4 = 26; var4 < 52; ++var4) {
         field8437[var4] = (char)(var4 + 97 - 26);
      }

      for(int var5 = 52; var5 < 62; ++var5) {
         field8437[var5] = (char)(var5 + 48 - 52);
      }

      field8437[62] = '*';
      field8437[63] = '-';
      field8436 = new int[128];

      for(int var6 = 0; var6 < field8436.length; ++var6) {
         field8436[var6] = -1;
      }

      for(int var7 = 65; var7 <= 90; ++var7) {
         field8436[var7] = var7 - 65;
      }

      for(int var8 = 97; var8 <= 122; ++var8) {
         field8436[var8] = var8 - 97 + 26;
      }

      for(int var9 = 48; var9 <= 57; ++var9) {
         field8436[var9] = var9 - 48 + 52;
      }

      int[] var10 = field8436;
      field8436[43] = 62;
      var10[42] = 62;
      int[] var11 = field8436;
      field8436[47] = 63;
      var11[45] = 63;
   }

   private class821() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("kq.n(CI)I")
   private static int method8531(char arg0) {
      return arg0 >= 0 && arg0 < field8436.length ? field8436[arg0] : -1;
   }

   @deob.ObfuscatedName("re.k(Ljava/lang/String;[BIB)I")
   private static int method11650(String arg0, byte[] arg1, int arg2) {
      int var3 = arg2;
      int var4 = arg0.length();

      for(int var5 = 0; var5 < var4; var5 += 4) {
         int var6 = method8531(arg0.charAt(var5));
         int var7 = var5 + 1 < var4 ? method8531(arg0.charAt(var5 + 1)) : -1;
         int var8 = var5 + 2 < var4 ? method8531(arg0.charAt(var5 + 2)) : -1;
         int var9 = var5 + 3 < var4 ? method8531(arg0.charAt(var5 + 3)) : -1;
         arg1[arg2++] = (byte)(var6 << 2 | var7 >>> 4);
         if (var8 == -1) {
            break;
         }

         arg1[arg2++] = (byte)((var7 & 15) << 4 | var8 >>> 2);
         if (var9 == -1) {
            break;
         }

         arg1[arg2++] = (byte)((var8 & 3) << 6 | var9);
      }

      return arg2 - var3;
   }

   @deob.ObfuscatedName("af.d(Ljava/lang/String;I)[B")
   public static byte[] method2050(String arg0) {
      int var1 = arg0.length();
      if (var1 == 0) {
         return new byte[0];
      } else {
         int var2 = var1 + 3 & -4;
         int var3 = var2 / 4 * 3;
         if (var2 - 2 < var1 && method8531(arg0.charAt(var2 - 2)) != -1) {
            if (var2 - 1 >= var1 || method8531(arg0.charAt(var2 - 1)) == -1) {
               --var3;
            }
         } else {
            var3 -= 2;
         }

         byte[] var4 = new byte[var3];
         method11650(arg0, var4, 0);
         return var4;
      }
   }
}
