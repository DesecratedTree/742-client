import java.io.IOException;
import java.net.Socket;

@deob.ObfuscatedName("aej")
public class class120 extends class711 {
   @deob.ObfuscatedName("aej.n")
   private Socket field915;
   @deob.ObfuscatedName("aej.k")
   private class696 field913;
   @deob.ObfuscatedName("aej.d")
   private class710 field914;

   public class120(Socket arg0, int arg1) throws IOException {
      this.field915 = arg0;
      this.field915.setSoTimeout(30000);
      this.field915.setTcpNoDelay(true);
      this.field913 = new class696(this.field915.getInputStream(), arg1);
      this.field914 = new class710(this.field915.getOutputStream(), arg1);
   }

   @deob.ObfuscatedName("aej.k(IB)Z")
   public boolean method1527(int arg0) throws IOException {
      return this.field913.method10181(arg0);
   }

   @deob.ObfuscatedName("aej.d(I)I")
   public int method1529() throws IOException {
      return this.field913.method10183();
   }

   @deob.ObfuscatedName("aej.b([BIII)I")
   public int method1541(byte[] arg0, int arg1, int arg2) throws IOException {
      return this.field913.method10184(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("aej.r([BIIB)V")
   public void method1530(byte[] arg0, int arg1, int arg2) throws IOException {
      this.field914.method10449(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("aej.p(B)V")
   public void method1532() {
      this.field914.method10457();

      try {
         this.field915.close();
      } catch (IOException var2) {
      }

      this.field913.method10193();
   }

   @deob.ObfuscatedName("aej.o(I)V")
   public void method1534() {
      this.field913.method10191();
      this.field914.method10450();
   }

   public void finalize() {
      this.method1532();
   }
}
