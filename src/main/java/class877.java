import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@deob.ObfuscatedName("uy")
public final class class877 {
   private class877() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("qb.n(Ljava/io/File;[BII)V")
   private static void method11050(File arg0, byte[] arg1, int arg2) throws IOException {
      DataInputStream var3 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));

      try {
         var3.readFully(arg1, 0, arg2);
      } catch (EOFException var5) {
      }

      var3.close();
   }

   @deob.ObfuscatedName("lk.k(Ljava/io/File;II)[B")
   public static byte[] method8944(File arg0, int arg1) {
      try {
         byte[] var2 = new byte[arg1];
         method11050(arg0, var2, arg1);
         return var2;
      } catch (IOException var4) {
         return null;
      }
   }
}
