@deob.ObfuscatedName("an")
public class class318 {
   @deob.ObfuscatedName("an.n")
   private static boolean field1976 = false;

   private class318() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("li.n(I)V")
   public static void method8926() {
      if (!field1976) {
         method11588(client.field2468.method9639().field6581);
         if (client.field2468.method9639().field6596 != null) {
            method11588(client.field2468.method9639().field6596);
         }

         field1976 = true;
      }
   }

   @deob.ObfuscatedName("rb.k([[[Lom;I)V")
   private static void method11588(class703[][][] arg0) {
      for(int var1 = 0; var1 < arg0.length; ++var1) {
         class703[][] var2 = arg0[var1];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            for(int var4 = 0; var4 < var2[var3].length; ++var4) {
               class703 var5 = var2[var3][var4];
               if (var5 != null) {
                  if (var5.field6482 instanceof class376) {
                     ((class376)var5.field6482).method5085();
                  }

                  if (var5.field6480 instanceof class376) {
                     ((class376)var5.field6480).method5085();
                  }

                  if (var5.field6486 instanceof class376) {
                     ((class376)var5.field6486).method5085();
                  }

                  if (var5.field6481 instanceof class376) {
                     ((class376)var5.field6481).method5085();
                  }

                  if (var5.field6479 instanceof class376) {
                     ((class376)var5.field6479).method5085();
                  }

                  for(class699 var6 = var5.field6484; var6 != null; var6 = var6.field6457) {
                     class290 var7 = var6.field6458;
                     if (var7 instanceof class376) {
                        ((class376)var7).method5085();
                     }
                  }
               }
            }
         }
      }

   }
}
