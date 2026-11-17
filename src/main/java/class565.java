import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.class553;

@deob.ObfuscatedName("jj")
public class class565 implements class508 {
   @deob.ObfuscatedName("jj.p")
   public long field4956 = 0L;
   @deob.ObfuscatedName("jj.n")
   private final class197 field4952;
   @deob.ObfuscatedName("jj.r")
   private final boolean field4955;
   @deob.ObfuscatedName("jj.b")
   private byte field4954;
   @deob.ObfuscatedName("jj.k")
   private int field4951;
   @deob.ObfuscatedName("jj.d")
   private int field4953;

   public class565(class197 arg0, boolean arg1) {
      this.field4952 = arg0;
      this.field4955 = arg1;
      this.field4952.method16317(this);
   }

   @deob.ObfuscatedName("jj.l()I")
   public int method709() {
      return this.field4953;
   }

   @deob.ObfuscatedName("jj.y()I")
   public int method7954() {
      return this.field4954;
   }

   @deob.ObfuscatedName("jj.n(II)Z")
   public boolean method728(int arg0, int arg1) {
      this.field4953 = arg0;
      this.field4954 = (byte)arg1;
      if (this.field4953 > this.field4951) {
         int var3 = 8;
         byte var4;
         if (this.field4955) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if (this.field4956 != 0L) {
            IUnknown.Release(this.field4956);
         }

         this.field4956 = IDirect3DDevice.CreateVertexBuffer(this.field4952.field1256, this.field4953, var3, 0, var4);
         this.field4951 = this.field4953;
      }

      return this.field4956 != 0L;
   }

   @deob.ObfuscatedName("jj.v(II)J")
   public long method698(int arg0, int arg1) {
      return IDirect3DVertexBuffer.Lock(this.field4956, arg0, arg1, this.field4955 ? 8192 : 0);
   }

   @deob.ObfuscatedName("jj.g()V")
   public void method699() {
      IDirect3DVertexBuffer.Unlock(this.field4956);
   }

   @deob.ObfuscatedName("jj.u(IIJ)Z")
   public boolean method700(int arg0, int arg1, long arg2) {
      return class553.method7842(IDirect3DVertexBuffer.Upload(this.field4956, arg0, arg1, this.field4955 ? 8192 : 0, arg2));
   }

   @deob.ObfuscatedName("jj.d()V")
   public void method302() {
      if (this.field4956 != 0L) {
         IUnknown.Release(this.field4956);
         this.field4956 = 0L;
      }

      this.field4951 = 0;
      this.field4953 = 0;
      this.field4952.method16305(this);
   }

   @deob.ObfuscatedName("jj.j()V")
   private void method7953() {
      if (this.field4956 != 0L) {
         this.field4952.method2586(this.field4956);
         this.field4956 = 0L;
         this.field4951 = 0;
         this.field4953 = 0;
      }

   }

   public void finalize() {
      this.method7953();
   }
}
