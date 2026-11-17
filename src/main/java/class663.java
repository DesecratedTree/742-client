import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;

@deob.ObfuscatedName("n")
public class class663 implements Runnable {
   @deob.ObfuscatedName("n.d")
   private volatile long field6074 = -1L;
   @deob.ObfuscatedName("n.b")
   private volatile boolean field6077 = true;
   @deob.ObfuscatedName("n.n")
   private String field6075;
   @deob.ObfuscatedName("n.k")
   private InetAddress field6076;

   @deob.ObfuscatedName("n.n(Ljava/lang/String;B)V")
   public void method9694(String arg0) {
      this.field6075 = arg0;
      this.field6076 = null;
      this.field6074 = -1L;
      if (this.field6075 != null) {
         try {
            this.field6076 = InetAddress.getByName(this.field6075);
         } catch (UnknownHostException var3) {
         }
      }

   }

   @deob.ObfuscatedName("n.k(B)J")
   public long method9692() {
      return this.field6074;
   }

   @deob.ObfuscatedName("n.d(I)V")
   public void method9700() {
      this.field6077 = false;
   }

   public void run() {
      while(this.field6077) {
         this.method9693();
      }

   }

   @deob.ObfuscatedName("n.b(B)V")
   private void method9693() {
      if (this.field6076 != null) {
         try {
            byte[] var1 = this.field6076.getAddress();
            this.field6074 = (long)Ping.method7829(var1[0], var1[1], var1[2], var1[3], 10000L);
         } catch (Throwable var3) {
         }
      }

      Statics.method14813(1000L);
   }
}
