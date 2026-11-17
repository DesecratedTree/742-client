import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.class553;

@deob.ObfuscatedName("abe")
public class class34 extends class46 implements class529 {
   public class34(class197 arg0, class372 arg1, class405 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
   }

   @deob.ObfuscatedName("abe.am(I)Ldm;")
   public class398 method500(int arg0) {
      return new class571(this, arg0);
   }

   @deob.ObfuscatedName("abe.u(IIII[II)V")
   public void method535(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.field5147, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.field5144.field1256, arg2, arg3, 21, 0, 0, true);
      if (class553.method7842(IDirect3DDevice.StretchRect(this.field5144.field1256, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.field5144.field9976);
         this.field5144.field9975.clear();
         this.field5144.field9975.asIntBuffer().get(arg4);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   @deob.ObfuscatedName("abe.n()I")
   public int method507() {
      return super.method507();
   }

   @deob.ObfuscatedName("abe.k()I")
   public int method491() {
      return super.method491();
   }

   @deob.ObfuscatedName("abe.b(F)F")
   public float method492(float arg0) {
      return super.method492(arg0);
   }

   @deob.ObfuscatedName("abe.r(F)F")
   public float method493(float arg0) {
      return super.method493(arg0);
   }

   @deob.ObfuscatedName("abe.p()Z")
   public boolean method496() {
      return super.method496();
   }

   @deob.ObfuscatedName("abe.o(ZZ)V")
   public void method497(boolean arg0, boolean arg1) {
      super.method497(arg0, arg1);
   }

   @deob.ObfuscatedName("abe.a(IIII[III)V")
   public void method498(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      super.method498(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("abe.l(IIII[BLcn;II)V")
   public void method499(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class372 arg5, int arg6, int arg7) {
      super.method499(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @deob.ObfuscatedName("abe.v()F")
   public float method508() {
      return super.method508();
   }

   @deob.ObfuscatedName("abe.g()F")
   public float method495() {
      return super.method495();
   }

   @deob.ObfuscatedName("abe.h()Z")
   public boolean method501() {
      return super.method501();
   }

   @deob.ObfuscatedName("abe.aq()V")
   public void method502() {
      super.method502();
   }

   @deob.ObfuscatedName("abe.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }

   @deob.ObfuscatedName("abe.d()V")
   public void method302() {
      super.method302();
   }
}
