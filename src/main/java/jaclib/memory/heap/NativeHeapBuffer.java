package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.b")
   private boolean field4403 = true;
   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.k")
   public final NativeHeap field4401;
   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.d")
   private final int field4402;
   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.n")
   private final int field4400;

   public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
      this.field4401 = arg0;
      this.field4402 = arg1;
      this.field4400 = arg2;
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.l()Z")
   private final synchronized boolean method7799() {
      return this.field4401.method7792() && this.field4403;
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.k()J")
   public final long method7783() {
      return this.field4401.getBufferAddress(this.field4402);
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.n()I")
   public final int method7782() {
      return this.field4400;
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.d([BIII)V")
   public final synchronized void method7784(byte[] arg0, int arg1, int arg2, int arg3) {
      if (!this.method7799() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field4400) {
         throw new RuntimeException();
      } else {
         this.field4401.put(this.field4402, arg0, arg1, arg2, arg3);
      }
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.u()V")
   public final synchronized void method7800() {
      if (this.method7799()) {
         this.field4401.deallocateBuffer(this.field4402);
      }

      this.field4403 = false;
   }

   public final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method7800();
   }
}
