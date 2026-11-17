import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.class553;
import java.awt.Canvas;

@deob.ObfuscatedName("abb")
public class class31 extends class212 implements class569 {
   @deob.ObfuscatedName("abb.a")
   private boolean field253 = false;
   @deob.ObfuscatedName("abb.x")
   private boolean field254 = false;
   @deob.ObfuscatedName("abb.k")
   private final Canvas field250;
   @deob.ObfuscatedName("abb.n")
   private final class197 field247;
   @deob.ObfuscatedName("abb.p")
   private int field251;
   @deob.ObfuscatedName("abb.o")
   private int field252;
   @deob.ObfuscatedName("abb.r")
   private long field246;
   @deob.ObfuscatedName("abb.d")
   private long field248;
   @deob.ObfuscatedName("abb.b")
   private long field249;
   @deob.ObfuscatedName("abb.s")
   private D3DPRESENT_PARAMETERS field255;

   public class31(class197 arg0, Canvas arg1, int arg2, int arg3, boolean arg4) {
      super(arg0);
      this.field250 = arg1;
      this.field247 = arg0;
      this.field251 = arg2;
      this.field252 = arg3;
      this.field254 = arg4;
      this.method564();
      this.field247.method2517(this);
   }

   @deob.ObfuscatedName("abb.n()V")
   public void method564() {
      this.method570();
      this.field255 = new D3DPRESENT_PARAMETERS(this.field250);
      this.field255.Windowed = true;
      this.field255.BackBufferCount = 1;
      this.field255.BackBufferWidth = this.field251;
      this.field255.BackBufferHeight = this.field252;
      if (this.field254) {
         this.field248 = IDirect3DDevice.GetSwapChain(this.field247.field1256, 0);
         this.field246 = IDirect3DSwapChain.GetBackBuffer(this.field248, 0, 0);
         this.field249 = IDirect3DDevice.GetDepthStencilSurface(this.field247.field1256);
      } else {
         if (!class197.method2682(this.field247.field1268, this.field247.field1254, this.field247.field1255, this.field247.field10103, this.field255)) {
            throw new RuntimeException();
         }

         int var1 = this.field255.AutoDepthStencilFormat;
         this.field248 = IDirect3DDevice.CreateAdditionalSwapChain(this.field247.field1256, this.field255);
         this.field246 = IDirect3DSwapChain.GetBackBuffer(this.field248, 0, 0);
         this.field249 = IDirect3DDevice.CreateDepthStencilSurface(this.field247.field1256, this.field251, this.field252, var1, this.field255.MultiSampleType, this.field255.MultiSampleQuality, false);
      }

      if (this.field253) {
         this.method540();
      }

   }

   @deob.ObfuscatedName("abb.k()I")
   public int method566() {
      return this.field251;
   }

   @deob.ObfuscatedName("abb.d()I")
   public int method559() {
      return this.field252;
   }

   @deob.ObfuscatedName("abb.r()Z")
   public boolean method540() {
      this.field253 = true;
      if (class553.method7841(IDirect3DDevice.SetRenderTarget(this.field247.field1256, 0, this.field246))) {
         return false;
      } else {
         return class553.method7841(IDirect3DDevice.SetDepthStencilSurface(this.field247.field1256, this.field249)) ? false : super.method540();
      }
   }

   @deob.ObfuscatedName("abb.p()Z")
   public boolean method541() {
      this.field253 = false;
      return class553.method7842(IDirect3DDevice.SetDepthStencilSurface(this.field247.field1256, 0L));
   }

   @deob.ObfuscatedName("abb.w()I")
   public int method542() {
      return IDirect3DSwapChain.Present(this.field248, 0);
   }

   @deob.ObfuscatedName("abb.q(II)I")
   public int method543(int arg0, int arg1) {
      return IDirect3DSwapChain.Present(this.field248, 0);
   }

   @deob.ObfuscatedName("abb.j(II)V")
   public void method544(int arg0, int arg1) {
      this.method570();
      this.field251 = arg0;
      this.field252 = arg1;
      if (this.field254) {
         this.field247.method2614();
      }

      this.method564();
      super.method544(arg0, arg1);
   }

   @deob.ObfuscatedName("abb.b()V")
   public void method570() {
      if (this.field246 != 0L) {
         IUnknown.Release(this.field246);
         this.field246 = 0L;
      }

      if (this.field249 != 0L) {
         IUnknown.Release(this.field249);
         this.field249 = 0L;
      }

      if (this.field248 != 0L) {
         IUnknown.Release(this.field248);
         this.field248 = 0L;
      }

      this.field247.method2518(this);
   }

   @deob.ObfuscatedName("abb.c()V")
   private void method546() {
      if (this.field246 != 0L) {
         IUnknown.Release(this.field246);
         this.field246 = 0L;
      }

      if (this.field249 != 0L) {
         IUnknown.Release(this.field249);
         this.field249 = 0L;
      }

      if (this.field248 != 0L) {
         IUnknown.Release(this.field248);
         this.field248 = 0L;
      }

      this.field247.method2518(this);
   }

   public void finalize() throws Throwable {
      this.method546();
      super.finalize();
   }
}
