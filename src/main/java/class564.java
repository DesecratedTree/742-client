import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.class553;

@deob.ObfuscatedName("ji")
public class class564 implements class534 {
   @deob.ObfuscatedName("ji.p")
   public long field4948 = 0L;
   @deob.ObfuscatedName("ji.n")
   private final class197 field4945;
   @deob.ObfuscatedName("ji.r")
   private final class405 field4949;
   @deob.ObfuscatedName("ji.b")
   private final boolean field4950;
   @deob.ObfuscatedName("ji.k")
   private int field4946;
   @deob.ObfuscatedName("ji.d")
   private int field4947;

   public class564(class197 arg0, class405 arg1, boolean arg2) {
      this.field4945 = arg0;
      this.field4949 = arg1;
      this.field4950 = arg2;
      this.field4945.method16317(this);
   }

   @deob.ObfuscatedName("ji.l()I")
   public int method709() {
      return this.field4946;
   }

   @deob.ObfuscatedName("ji.n()Ldt;")
   public class405 method694() {
      return this.field4949;
   }

   @deob.ObfuscatedName("ji.y(I)V")
   public void method695(int arg0) {
      this.field4946 = this.field4949.field3055 * arg0;
      if (this.field4946 > this.field4947) {
         if (this.field4948 != 0L) {
            IUnknown.Release(this.field4948);
         }

         int var2 = 8;
         byte var3;
         if (this.field4950) {
            var3 = 0;
            var2 |= 512;
         } else {
            var3 = 1;
         }

         this.field4948 = IDirect3DDevice.CreateIndexBuffer(this.field4945.field1256, this.field4946, var2, class405.field3053 == this.field4949 ? 101 : 102, var3);
         this.field4947 = this.field4946;
      }

   }

   @deob.ObfuscatedName("ji.v(II)J")
   public long method698(int arg0, int arg1) {
      return IDirect3DIndexBuffer.Lock(this.field4948, arg0, arg1, this.field4950 ? 8192 : 0);
   }

   @deob.ObfuscatedName("ji.g()V")
   public void method699() {
      IDirect3DIndexBuffer.Unlock(this.field4948);
   }

   @deob.ObfuscatedName("ji.u(IIJ)Z")
   public boolean method700(int arg0, int arg1, long arg2) {
      return class553.method7842(IDirect3DIndexBuffer.Upload(this.field4948, arg0, arg1, this.field4950 ? 8192 : 0, arg2));
   }

   @deob.ObfuscatedName("ji.d()V")
   public void method302() {
      if (this.field4948 != 0L) {
         IUnknown.Release(this.field4948);
         this.field4948 = 0L;
      }

      this.field4947 = 0;
      this.field4946 = 0;
      this.field4945.method16305(this);
   }

   @deob.ObfuscatedName("ji.p()V")
   private void method7948() {
      if (this.field4948 != 0L) {
         this.field4945.method2586(this.field4948);
         this.field4948 = 0L;
      }

      this.field4947 = 0;
      this.field4946 = 0;
   }

   public void finalize() {
      this.method7948();
   }
}
