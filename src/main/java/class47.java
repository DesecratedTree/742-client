import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;

@deob.ObfuscatedName("abr")
public class class47 extends class570 implements class467 {
   @deob.ObfuscatedName("abr.p")
   private final int field332;
   @deob.ObfuscatedName("abr.o")
   private final int field331;
   @deob.ObfuscatedName("abr.a")
   private final int field330;

   public class47(class197 arg0, class372 arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
      super(arg0, arg1, class405.field3052, false, arg2 * arg3 * arg4);
      this.field332 = arg2;
      this.field331 = arg3;
      this.field330 = arg4;
      this.field5147 = IDirect3DDevice.CreateVolumeTexture(this.field5144.field1256, arg2, arg3, arg4, 1, 0, class197.method2581(arg1, this.field5145), 1);
      ByteBuffer var8 = this.field5144.field9975;
      var8.clear();
      var8.put(arg6);
      IDirect3DVolumeTexture.Upload(this.field5147, 0, 0, 0, 0, this.field332, this.field331, this.field330, arg1.field2744 * this.field332, 0, this.field5144.field9976);
   }

   @deob.ObfuscatedName("abr.bf()J")
   public long method713() {
      return this.field5147;
   }

   @deob.ObfuscatedName("abr.aq()V")
   public void method502() {
      this.field5144.method2694(this);
   }

   @deob.ObfuscatedName("abr.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }

   @deob.ObfuscatedName("abr.d()V")
   public void method302() {
      super.method302();
   }
}
