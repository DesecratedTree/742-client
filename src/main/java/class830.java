import java.nio.ByteBuffer;
import java.util.Arrays;

@deob.ObfuscatedName("te")
public abstract class class830 {
   private class830() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ij.n([BZB)Ljava/lang/Object;")
   public static Object method7357(byte[] arg0, boolean arg1) {
      if (arg0 == null) {
         return null;
      } else if (arg0.length > 136) {
         ByteBuffer var2 = ByteBuffer.allocateDirect(arg0.length);
         var2.position(0);
         var2.put(arg0);
         return var2;
      } else {
         return arg1 ? Arrays.copyOf(arg0, arg0.length) : arg0;
      }
   }

   @deob.ObfuscatedName("tf.k(Ljava/lang/Object;ZI)[B")
   public static byte[] method14661(Object arg0, boolean arg1) {
      if (arg0 == null) {
         return null;
      } else if (arg0 instanceof byte[]) {
         byte[] var2 = (byte[])((byte[])arg0);
         return arg1 ? Arrays.copyOf(var2, var2.length) : var2;
      } else if (arg0 instanceof ByteBuffer) {
         ByteBuffer var3 = (ByteBuffer)arg0;
         byte[] var4 = new byte[var3.capacity()];
         var3.position(0);
         var3.get(var4);
         return var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("ph.d(Ljava/lang/Object;III)[B")
   public static byte[] method10724(Object arg0, int arg1, int arg2) {
      if (arg0 == null) {
         return null;
      } else if (arg0 instanceof byte[]) {
         byte[] var3 = (byte[])((byte[])arg0);
         return Arrays.copyOfRange(var3, arg1, arg1 + arg2);
      } else if (arg0 instanceof ByteBuffer) {
         ByteBuffer var4 = (ByteBuffer)arg0;
         byte[] var5 = new byte[arg2];
         var4.position(arg1);
         var4.get(var5, 0, arg2);
         return var5;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
