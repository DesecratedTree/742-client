import java.io.IOException;
import net.ClientProt;

@deob.ObfuscatedName("me")
public class class641 {
   private class641() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("yb.n(ZB)V")
   public static void method16069(boolean arg0) {
      class677.method9259();
      if (client.method6612(client.field2410)) {
         class110[] var1 = client.field2464;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            class110 var3 = var1[var2];
            ++var3.field820;
            if (var3.field820 < 50 && !arg0) {
               return;
            }

            var3.field820 = 0;
            if (!var3.field840 && var3.method1413() != null) {
               class109 var4 = class109.method15110(ClientProt.NO_TIMEOUT, var3.field832);
               var3.method1408(var4);

               try {
                  var3.method1407();
               } catch (IOException var6) {
                  var3.field840 = true;
               }
            }
         }

         class677.method9259();
      }
   }
}
