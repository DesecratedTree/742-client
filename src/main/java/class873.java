import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@deob.ObfuscatedName("uu")
public class class873 {
   @deob.ObfuscatedName("uu.d")
   public int field8850 = 43594;
   @deob.ObfuscatedName("uu.b")
   public int field8852 = 443;
   @deob.ObfuscatedName("uu.r")
   private boolean field8848 = true;
   @deob.ObfuscatedName("uu.p")
   private boolean field8853 = false;
   @deob.ObfuscatedName("uu.n")
   public int field8851;
   @deob.ObfuscatedName("uu.k")
   public String field8849;

   @deob.ObfuscatedName("uu.n(I)Ljava/net/Socket;")
   public Socket method15275() throws IOException {
      return !this.field8853 ? new Socket(InetAddress.getByName(this.field8849), this.field8848 ? this.field8852 : this.field8850) : class869.method9840(this.field8849, this.field8848 ? this.field8852 : this.field8850).method2420();
   }

   @deob.ObfuscatedName("uu.k(B)V")
   public void method15276() {
      if (!this.field8848) {
         this.field8848 = true;
         this.field8853 = true;
      } else if (this.field8853) {
         this.field8853 = false;
      } else {
         this.field8848 = false;
      }

   }

   @deob.ObfuscatedName("uu.d(Luu;B)Z")
   public boolean method15277(class873 arg0) {
      if (arg0 == null) {
         return false;
      } else {
         return this.field8851 == arg0.field8851 && this.field8849.equals(arg0.field8849);
      }
   }
}
