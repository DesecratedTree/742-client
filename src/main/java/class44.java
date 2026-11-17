import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;

@deob.ObfuscatedName("abo")
public class class44 extends class570 implements class535 {
   @deob.ObfuscatedName("abo.p")
   private final int field322;

   public class44(class197 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class372.field2736, class405.field3052, arg2 && arg0.field1276, arg1 * arg1 * 6);
      this.field322 = arg1;
      if (this.field5146) {
         this.field5147 = IDirect3DDevice.CreateCubeTexture(this.field5144.field1256, this.field322, 0, 1024, 21, 1);
      } else {
         this.field5147 = IDirect3DDevice.CreateCubeTexture(this.field5144.field1256, this.field322, 1, 0, 21, 1);
      }

      ByteBuffer var5 = this.field5144.field9975;

      for(int var6 = 0; var6 < 6; ++var6) {
         var5.clear();
         var5.asIntBuffer().put(arg3[var6]);
         IDirect3DCubeTexture.Upload(this.field5147, var6, 0, 0, 0, this.field322, this.field322, this.field322 * 4, 0, this.field5144.field9976);
      }

   }

   @deob.ObfuscatedName("abo.aq()V")
   public void method502() {
      this.field5144.method2709(this);
   }

   @deob.ObfuscatedName("abo.d()V")
   public void method302() {
      super.method302();
   }

   @deob.ObfuscatedName("abo.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }
}
