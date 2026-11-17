import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

@deob.ObfuscatedName("gd")
public class class470 implements Runnable {
   @deob.ObfuscatedName("gd.k")
   private Thread field3833;
   @deob.ObfuscatedName("gd.d")
   private volatile boolean field3834;
   @deob.ObfuscatedName("gd.n")
   private class492[] field3832;

   @deob.ObfuscatedName("gd.n(II)Lgz;")
   public class492 method6600(int arg0) {
      return this.field3832 != null && arg0 >= 0 && arg0 < this.field3832.length ? this.field3832[arg0] : null;
   }

   @deob.ObfuscatedName("gd.k(I)Z")
   public boolean method6601() {
      if (this.field3834) {
         return true;
      } else {
         if (this.field3833 == null) {
            this.field3833 = new Thread(this);
            this.field3833.start();
         }

         return this.field3834;
      }
   }

   public void run() {
      try {
         int var1 = class819.field8428 == Statics.field4896 ? 80 : Statics.field8790.field8851 + 7000;
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Statics.field8790.field8849 + ":" + var1 + "/news.ws?game=" + client.field2584.field7304)).openStream())));
         String var3 = var2.readLine();
         ArrayList var4 = new ArrayList();

         while(var3 != null) {
            var4.add(var3);
            var3 = var2.readLine();
         }

         String[] var5 = new String[var4.size()];
         var4.toArray(var5);
         if (var5.length % 3 != 0) {
            return;
         }

         this.field3832 = new class492[var5.length / 3];

         for(int var6 = 0; var6 < var5.length; var6 += 3) {
            this.field3832[var6 / 3] = new class492(var5[var6], var5[var6 + 1], var5[var6 + 2]);
         }
      } catch (IOException var8) {
      }

      this.field3834 = true;
   }
}
