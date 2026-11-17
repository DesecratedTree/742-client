@deob.ObfuscatedName("xj")
public class class943 {
   private class943() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("w.k(Ljava/lang/CharSequence;B)Ljava/lang/String;")
   public static String method15733(CharSequence arg0) {
      int var1 = arg0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = arg0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class813.method9501(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               int var7 = var5 & 15;
               if (var7 >= 10) {
                  var2.append((char)(var7 + 55));
               } else {
                  var2.append((char)(var7 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }
}
