import java.io.IOException;
import java.net.Socket;

@deob.ObfuscatedName("ou")
public abstract class class711 {
   protected class711() {
   }

   @deob.ObfuscatedName("ts.n(Ljava/net/Socket;II)Lou;")
   public static class711 method14916(Socket arg0, int arg1) throws IOException {
      return new class120(arg0, arg1);
   }

   @deob.ObfuscatedName("ou.o(I)V")
   public abstract void method1534();

   @deob.ObfuscatedName("ou.d(I)I")
   public abstract int method1529() throws IOException;

   @deob.ObfuscatedName("ou.b([BIII)I")
   public abstract int method1541(byte[] arg0, int arg1, int arg2) throws IOException;

   @deob.ObfuscatedName("ou.r([BIIB)V")
   public abstract void method1530(byte[] arg0, int arg1, int arg2) throws IOException;

   @deob.ObfuscatedName("ou.k(IB)Z")
   public abstract boolean method1527(int arg0) throws IOException;

   @deob.ObfuscatedName("ou.p(B)V")
   public abstract void method1532();
}
