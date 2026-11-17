import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@deob.ObfuscatedName("uh")
public final class class860 {
   @deob.ObfuscatedName("uh.n")
   private RandomAccessFile field8786;
   @deob.ObfuscatedName("uh.k")
   private final long field8787;
   @deob.ObfuscatedName("uh.d")
   private long field8785;

   public class860(File arg0, String arg1, long arg2) throws IOException {
      if (arg2 == -1L) {
         arg2 = Long.MAX_VALUE;
      }

      if (arg0.length() > arg2) {
         arg0.delete();
      }

      this.field8786 = new RandomAccessFile(arg0, arg1);
      this.field8787 = arg2;
      this.field8785 = 0L;
      int var5 = this.field8786.read();
      if (var5 != -1 && !arg1.equals("r")) {
         this.field8786.seek(0L);
         this.field8786.write(var5);
      }

      this.field8786.seek(0L);
   }

   @deob.ObfuscatedName("uh.n(J)V")
   public final void method15147(long arg0) throws IOException {
      this.field8786.seek(arg0);
      this.field8785 = arg0;
   }

   @deob.ObfuscatedName("uh.k([BIIB)V")
   public final void method15146(byte[] arg0, int arg1, int arg2) throws IOException {
      if (this.field8785 + (long)arg2 > this.field8787) {
         this.field8786.seek(this.field8787);
         this.field8786.write(1);
         throw new EOFException();
      } else {
         this.field8786.write(arg0, arg1, arg2);
         this.field8785 += (long)arg2;
      }
   }

   @deob.ObfuscatedName("uh.d(I)V")
   public final void method15151() throws IOException {
      if (this.field8786 != null) {
         this.field8786.close();
         this.field8786 = null;
      }

   }

   @deob.ObfuscatedName("uh.b(I)J")
   public final long method15148() throws IOException {
      return this.field8786.length();
   }

   @deob.ObfuscatedName("uh.r([BIII)I")
   public final int method15149(byte[] arg0, int arg1, int arg2) throws IOException {
      int var4 = this.field8786.read(arg0, arg1, arg2);
      if (var4 > 0) {
         this.field8785 += (long)var4;
      }

      return var4;
   }

   public void finalize() throws Throwable {
      if (this.field8786 != null) {
         System.out.println("");
         this.method15151();
      }

   }
}
