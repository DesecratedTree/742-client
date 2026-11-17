package jaclib.memory.heap;

public final class NativeHeap {
   private long peer;
   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeap.n")
   private final int field4398;
   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeap.k")
   private boolean field4399;

   public NativeHeap(int arg0) {
      this.field4398 = arg0;
      this.allocateHeap(this.field4398);
      this.field4399 = true;
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeap.n()Z")
   public synchronized boolean method7792() {
      return this.field4399;
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeap.k(IZ)Ljaclib/memory/heap/NativeHeapBuffer;")
   public NativeHeapBuffer method7793(int arg0, boolean arg1) {
      if (!this.field4399) {
         throw new IllegalStateException();
      } else {
         return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
      }
   }

   @deob.ObfuscatedName("jaclib/memory/heap/NativeHeap.d()V")
   public synchronized void method7794() {
      if (this.field4399) {
         this.deallocateHeap();
      }

      this.field4399 = false;
   }

   public synchronized void finalize() throws Throwable {
      super.finalize();
      this.method7794();
   }

   private native void allocateHeap(int arg0);

   private native void deallocateHeap();

   private synchronized native int allocateBuffer(int arg0, boolean arg1);

   public synchronized native long getBufferAddress(int arg0);

   private synchronized native void get(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

   public synchronized native void put(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

   public synchronized native void deallocateBuffer(int arg0);

   public synchronized native void copy(long arg0, long arg1, int arg2);
}
