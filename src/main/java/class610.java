import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@deob.ObfuscatedName("la")
public abstract class class610 implements class495 {
   @deob.ObfuscatedName("la.p")
   private int field5503 = -1;
   @deob.ObfuscatedName("la.d")
   private final class214 field5505;
   @deob.ObfuscatedName("la.b")
   private final int field5510;
   @deob.ObfuscatedName("la.r")
   private final boolean field5507;
   @deob.ObfuscatedName("la.s")
   private static final int[] field5512 = new int[1];
   @deob.ObfuscatedName("la.a")
   private int field5504;
   @deob.ObfuscatedName("la.o")
   private int field5509;
   @deob.ObfuscatedName("la.x")
   private NativeHeapBuffer field5511;

   protected class610(class214 arg0, int arg1, boolean arg2) {
      this.field5505 = arg0;
      this.field5510 = arg1;
      this.field5507 = arg2;
   }

   @deob.ObfuscatedName("la.ai()V")
   private void method8738() {
      if (this.field5503 < 0) {
         if (this.field5505.field1434) {
            OpenGL.glGenBuffersARB(1, field5512, 0);
            this.field5503 = field5512[0];
            OpenGL.glBindBufferARB(this.field5510, this.field5503);
         } else {
            this.field5503 = 0;
         }

      }
   }

   @deob.ObfuscatedName("la.l()I")
   public int method709() {
      return this.field5509;
   }

   @deob.ObfuscatedName("la.ap()J")
   public long method8739() {
      return this.field5503 == 0 ? this.field5511.method7783() : 0L;
   }

   @deob.ObfuscatedName("la.av()V")
   public void method8740() {
      if (this.field5505.field1434) {
         OpenGL.glBindBufferARB(this.field5510, this.field5503);
      }

   }

   @deob.ObfuscatedName("la.y(I)V")
   public void method695(int arg0) {
      if (arg0 > this.field5504) {
         this.method8738();
         if (this.field5503 > 0) {
            OpenGL.glBindBufferARB(this.field5510, this.field5503);
            OpenGL.glBufferDataARBub(this.field5510, arg0, (byte[])null, 0, this.field5507 ? 35040 : 35044);
            this.field5505.field9983 += arg0 - this.field5504;
         } else {
            this.field5511 = this.field5505.method16322(arg0, false);
         }

         this.field5504 = arg0;
      }

      this.field5509 = arg0;
   }

   @deob.ObfuscatedName("la.v(II)J")
   public long method698(int arg0, int arg1) {
      OpenGL.glBindBufferARB(this.field5510, this.field5503);
      return OpenGL.glMapBufferARB(this.field5510, 35001) + (long)arg0;
   }

   @deob.ObfuscatedName("la.g()V")
   public void method699() {
      OpenGL.glUnmapBufferARB(this.field5510);
   }

   @deob.ObfuscatedName("la.u(IIJ)Z")
   public boolean method700(int arg0, int arg1, long arg2) {
      this.method8738();
      if (this.field5503 > 0) {
         OpenGL.glBindBufferARB(this.field5510, this.field5503);
         OpenGL.glBufferSubDataARBa(this.field5510, arg0, arg1, arg2);
      } else {
         this.field5511.field4401.copy(this.field5511.method7783() + (long)arg0, arg2, arg1);
      }

      return true;
   }

   @deob.ObfuscatedName("la.d()V")
   public void method302() {
      if (this.field5503 > 0) {
         this.field5505.method2897(this.field5503, this.field5509);
         this.field5503 = -1;
      }

   }

   public void finalize() throws Throwable {
      this.method302();
      super.finalize();
   }
}
