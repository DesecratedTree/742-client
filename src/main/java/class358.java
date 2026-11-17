import java.net.InetAddress;
import java.net.UnknownHostException;

@deob.ObfuscatedName("c")
public class class358 implements Runnable {
   @deob.ObfuscatedName("c.n")
   private InetAddress field2284;
   @deob.ObfuscatedName("c.k")
   private volatile String field2283;

   public class358(int arg0) throws UnknownHostException {
      this.field2284 = InetAddress.getByAddress(new byte[]{(byte)(arg0 >> 24 & 255), (byte)(arg0 >> 16 & 255), (byte)(arg0 >> 8 & 255), (byte)(arg0 & 255)});
   }

   @deob.ObfuscatedName("c.n(B)Ljava/lang/String;")
   public String method4411() {
      return this.field2283;
   }

   public void run() {
      this.field2283 = this.field2284.getHostName();
   }
}
