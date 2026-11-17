package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {
   @deob.ObfuscatedName("jaggl/MapBuffer.d")
   private int field4569;

   @deob.ObfuscatedName("jaggl/MapBuffer.d([BIII)V")
   public void method7784(byte[] arg0, int arg1, int arg2, int arg3) {
      if (this.field4569 == 0) {
         throw new RuntimeException();
      } else {
         super.method7784(arg0, arg1, arg2, arg3);
      }
   }
}
