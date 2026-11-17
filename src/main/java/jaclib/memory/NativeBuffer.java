package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
   @deob.ObfuscatedName("jaclib/memory/NativeBuffer.n")
   private int field4404 = -1;
   @deob.ObfuscatedName("jaclib/memory/NativeBuffer.k")
   private long field4405;

   @deob.ObfuscatedName("jaclib/memory/NativeBuffer.n()I")
   public final int method7782() {
      return this.field4404;
   }

   @deob.ObfuscatedName("jaclib/memory/NativeBuffer.k()J")
   public final long method7783() {
      return this.field4405;
   }

   @deob.ObfuscatedName("jaclib/memory/NativeBuffer.d([BIII)V")
   public void method7784(byte[] arg0, int arg1, int arg2, int arg3) {
      if (this.field4405 == 0L | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field4404) {
         throw new RuntimeException();
      } else {
         this.put(this.field4405, arg0, arg1, arg2, arg3);
      }
   }

   private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

   private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
