import java.io.IOException;
import java.net.Socket;

@deob.ObfuscatedName("uq")
public abstract class class869 {
   @deob.ObfuscatedName("uq.k")
   protected int field8825;
   @deob.ObfuscatedName("uq.n")
   protected String field8824;

   @deob.ObfuscatedName("nh.n(Ljava/lang/String;II)Luq;")
   public static class869 method9840(String arg0, int arg1) {
      class177 var2 = new class177();
      var2.field8824 = arg0;
      var2.field8825 = arg1;
      return var2;
   }

   @deob.ObfuscatedName("uq.d(B)Ljava/net/Socket;")
   protected Socket method15224() throws IOException {
      return new Socket(this.field8824, this.field8825);
   }

   @deob.ObfuscatedName("uq.k(I)Ljava/net/Socket;")
   public abstract Socket method2420() throws IOException;
}
