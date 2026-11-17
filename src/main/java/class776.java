import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

@deob.ObfuscatedName("re")
public class class776 implements Runnable {
   @deob.ObfuscatedName("re.n")
   private final Object field7141 = new Object();
   @deob.ObfuscatedName("re.d")
   private final Queue field7139 = new LinkedList();
   @deob.ObfuscatedName("re.k")
   private Thread field7140 = new Thread(this);

   public class776() {
      this.field7140.setDaemon(true);
      this.field7140.start();
   }

   @deob.ObfuscatedName("re.n(Ljava/lang/String;I)Lro;")
   public class786 method11637(String arg0) {
      if (this.field7140 == null) {
         throw new IllegalStateException("");
      } else if (arg0 == null) {
         throw new IllegalArgumentException("");
      } else {
         class786 var2 = new class786(arg0);
         this.method11639(var2);
         return var2;
      }
   }

   @deob.ObfuscatedName("re.k(I)V")
   public void method11638() {
      if (this.field7140 != null) {
         this.method11639(this.field7141);

         try {
            this.field7140.join();
         } catch (InterruptedException var2) {
         }

         this.field7140 = null;
      }
   }

   @deob.ObfuscatedName("re.d(Ljava/lang/Object;I)V")
   private void method11639(Object arg0) {
      Queue var2 = this.field7139;
      synchronized(this.field7139) {
         this.field7139.add(arg0);
         this.field7139.notify();
      }
   }

   public void run() {
      while(true) {
         Queue var1 = this.field7139;
         class786 var4;
         synchronized(this.field7139) {
            Object var2;
            for(var2 = this.field7139.poll(); var2 == null; var2 = this.field7139.poll()) {
               try {
                  this.field7139.wait();
               } catch (InterruptedException var10) {
               }
            }

            if (this.field7141 == var2) {
               return;
            }

            var4 = (class786)var2;
         }

         int var7;
         try {
            byte[] var6 = InetAddress.getByName(var4.field7186).getAddress();
            var7 = Ping.method7829(var6[0], var6[1], var6[2], var6[3], 1000L);
         } catch (Throwable var9) {
            var7 = 1000;
         }

         var4.field7185 = var7;
      }
   }
}
