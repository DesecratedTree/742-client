@deob.ObfuscatedName("qo")
public final class class759 {
   private class759() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("mg.n(Ljava/lang/CharSequence;B)I")
   public static int method9270(CharSequence arg0) {
      int var1 = arg0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = arg0.charAt(var3);
         if (var4 <= 127) {
            ++var2;
         } else if (var4 <= 2047) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("dt.k([BILjava/lang/CharSequence;S)I")
   public static int method5522(byte[] arg0, int arg1, CharSequence arg2) {
      int var3 = arg2.length();
      int var4 = arg1;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = arg2.charAt(var5);
         if (var6 <= 127) {
            arg0[var4++] = (byte)var6;
         } else if (var6 <= 2047) {
            arg0[var4++] = (byte)(192 | var6 >> 6);
            arg0[var4++] = (byte)(128 | var6 & 63);
         } else {
            arg0[var4++] = (byte)(224 | var6 >> 12);
            arg0[var4++] = (byte)(128 | var6 >> 6 & 63);
            arg0[var4++] = (byte)(128 | var6 & 63);
         }
      }

      return var4 - arg1;
   }

   @deob.ObfuscatedName("ajm.d([BIII)Ljava/lang/String;")
   public static String method3481(byte[] arg0, int arg1, int arg2) {
      char[] var3 = new char[arg2];
      int var4 = 0;
      int var5 = arg1;
      int var6 = arg1 + arg2;

      while(var5 < var6) {
         int var7 = arg0[var5++] & 255;
         int var8;
         if (var7 < 128) {
            if (var7 == 0) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if (var7 < 192) {
            var8 = 65533;
         } else if (var7 < 224) {
            if (var5 < var6 && (arg0[var5] & 192) == 128) {
               var8 = (var7 & 31) << 6 | arg0[var5++] & 63;
               if (var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 240) {
            if (var5 + 1 < var6 && (arg0[var5] & 192) == 128 && (arg0[var5 + 1] & 192) == 128) {
               var8 = (var7 & 15) << 12 | (arg0[var5++] & 63) << 6 | arg0[var5++] & 63;
               if (var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 248) {
            if (var5 + 2 < var6 && (arg0[var5] & 192) == 128 && (arg0[var5 + 1] & 192) == 128 && (arg0[var5 + 2] & 192) == 128) {
               int var9 = (var7 & 7) << 18 | (arg0[var5++] & 63) << 12 | (arg0[var5++] & 63) << 6 | arg0[var5++] & 63;
               if (var9 >= 65536 && var9 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }

         var3[var4++] = (char)var8;
      }

      return new String(var3, 0, var4);
   }
}
