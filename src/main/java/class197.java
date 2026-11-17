import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.class549;
import jagdx.class551;
import jagdx.class553;
import java.awt.Canvas;

@deob.ObfuscatedName("ahf")
public class class197 extends class979 {
   @deob.ObfuscatedName("ahf.gl")
   public long field1255 = 0L;
   @deob.ObfuscatedName("ahf.gs")
   public long field1256 = 0L;
   @deob.ObfuscatedName("ahf.gq")
   private class849 field1258 = new class849();
   @deob.ObfuscatedName("ahf.ge")
   private int field1259 = 0;
   @deob.ObfuscatedName("ahf.gx")
   private long field1260 = 0L;
   @deob.ObfuscatedName("ahf.go")
   private long field1261 = 0L;
   @deob.ObfuscatedName("ahf.gt")
   private long field1272 = 0L;
   @deob.ObfuscatedName("ahf.gk")
   private boolean field1263 = false;
   @deob.ObfuscatedName("ahf.hy")
   private final float[] field1279 = new float[16];
   @deob.ObfuscatedName("ahf.hr")
   private int field1277 = 128;
   @deob.ObfuscatedName("ahf.hb")
   private int field1280 = 0;
   @deob.ObfuscatedName("ahf.hg")
   private long[] field1253 = new long[this.field1277];
   @deob.ObfuscatedName("ahf.gd")
   public final int field1268;
   @deob.ObfuscatedName("ahf.gm")
   public final int field1254;
   @deob.ObfuscatedName("ahf.gf")
   private final D3DPRESENT_PARAMETERS field1257;
   @deob.ObfuscatedName("ahf.hm")
   private final D3DCAPS field1273;
   @deob.ObfuscatedName("ahf.he")
   public final boolean field1278;
   @deob.ObfuscatedName("ahf.hn")
   public final boolean field1276;
   @deob.ObfuscatedName("ahf.hz")
   public final boolean field1275;
   @deob.ObfuscatedName("ahf.gh")
   private boolean[] field1264;
   @deob.ObfuscatedName("ahf.ga")
   private boolean[] field1265;
   @deob.ObfuscatedName("ahf.gp")
   private boolean[] field1267;
   @deob.ObfuscatedName("ahf.ho")
   private class500[] field1281;
   @deob.ObfuscatedName("ahf.gg")
   private boolean[] field1274;
   @deob.ObfuscatedName("ahf.hu")
   private int[] field1269;
   @deob.ObfuscatedName("ahf.hl")
   private class597 field1270;
   @deob.ObfuscatedName("ahf.ha")
   private static final int[] field1266 = new int[]{77, 80};
   @deob.ObfuscatedName("ahf.hp")
   private static final int[] field1283 = new int[]{22, 23};
   @deob.ObfuscatedName("ahf.hw")
   private long field1282;
   @deob.ObfuscatedName("ahf.hf")
   public class12 field1271;
   @deob.ObfuscatedName("ahf.hc")
   private boolean field1262;

   private class197(int arg0, int arg1, long arg2, long arg3, D3DPRESENT_PARAMETERS arg4, D3DCAPS arg5, class637 arg6, class612 arg7, int arg8) {
      super(arg6, arg7, arg8, 0);

      try {
         this.field1268 = arg0;
         this.field1254 = arg1;
         this.field1255 = arg2;
         this.field1256 = arg3;
         this.field1257 = arg4;
         this.field1273 = arg5;
         this.field1260 = D3DLIGHT.Create();
         this.field1261 = D3DLIGHT.Create();
         this.field1272 = D3DLIGHT.Create();
         this.field10099 = this.field1273.MaxSimultaneousTextures;
         this.field9982 = this.field1273.MaxActiveLights > 0 ? this.field1273.MaxActiveLights : 8;
         this.field1278 = (this.field1273.TextureCaps & 2) == 0;
         this.field10115 = (this.field1273.TextureCaps & 8192) != 0;
         this.field1276 = (this.field1273.TextureCaps & 65536) != 0;
         this.field1275 = (this.field1273.TextureCaps & 16384) != 0;
         this.field10111 = this.field1273.NumSimultaneousRTs > 0;
         this.field9972 = this.field1273.NumSimultaneousRTs > 0;
         this.field10114 = this.field10103 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field1255, this.field1268, this.field1254, this.field1257.BackBufferFormat, true, 2) == 0;
         this.field10080 = this.field1273.NumSimultaneousRTs > 0 && this.field10103 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field1255, this.field1268, this.field1254, 113, true, 2) == 0;
         this.field1264 = new boolean[this.field10099];
         this.field1265 = new boolean[this.field10099];
         this.field1267 = new boolean[this.field10099];
         this.field1281 = new class500[this.field10099];
         this.field1274 = new boolean[this.field10099];
         this.field1269 = new int[this.field10099];
         class583 var12 = new class583();
         var12.method8069(1.0F, -1.0F, 0.5F);
         var12.method8072(0.0F, 0.0F, 0.5F);
         this.field1270 = new class597();
         this.field1270.method8391(var12);
         IDirect3DDevice.BeginScene(this.field1256);
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method11494();
         throw new RuntimeException("");
      }
   }

   @deob.ObfuscatedName("ahf.h()Z")
   public boolean method2631() {
      return (this.field1273.VertexShaderVersion & 65535) >= 257;
   }

   @deob.ObfuscatedName("ahf.z()Z")
   public boolean method2498() {
      return (this.field1273.PixelShaderVersion & 65535) >= 257;
   }

   @deob.ObfuscatedName("ahf.acm(Ljava/awt/Canvas;Lma;Llc;Ljava/lang/Integer;)Lra;")
   public static class772 method2499(Canvas arg0, class637 arg1, class612 arg2, Integer arg3) {
      class197 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         long var7 = IDirect3D.Direct3DCreate();
         D3DCAPS var9 = new D3DCAPS();
         IDirect3D.GetDeviceCaps(var7, var5, var6, var9);
         if (var9.MaxSimultaneousTextures < 2) {
            throw new RuntimeException("");
         } else if ((var9.TextureOpCaps & 2) == 0) {
            throw new RuntimeException("");
         } else if ((var9.TextureOpCaps & 8) == 0) {
            throw new RuntimeException("");
         } else if ((var9.TextureOpCaps & 64) == 0) {
            throw new RuntimeException("");
         } else if ((var9.TextureOpCaps & 512) == 0) {
            throw new RuntimeException("");
         } else if ((var9.TextureOpCaps & 33554432) == 0) {
            throw new RuntimeException("");
         } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 16) == 0) {
            throw new RuntimeException("");
         } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 32) == 0) {
            throw new RuntimeException("");
         } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 2) == 0) {
            throw new RuntimeException("");
         } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
            throw new RuntimeException("");
         } else if (var9.MaxStreams < 5) {
            throw new RuntimeException("");
         } else {
            D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
            var10.Windowed = true;
            var10.EnableAutoDepthStencil = true;
            var10.BackBufferWidth = arg0.getWidth();
            var10.BackBufferHeight = arg0.getHeight();
            var10.BackBufferCount = 1;
            var10.PresentationInterval = Integer.MIN_VALUE;
            if (!method2682(var5, var6, var7, arg3, var10)) {
               throw new RuntimeException("");
            } else {
               int var11 = 0;
               if ((var9.DevCaps & 1048576) != 0) {
                  var11 |= 16;
               }

               long var12 = 0L;

               long var14;
               try {
                  var14 = IDirect3D.CreateDeviceContext(var7, var5, var6, arg0, var11 | 64, var10);
               } catch (class549 var18) {
                  var14 = IDirect3D.CreateDeviceContext(var7, var5, var6, arg0, var11 & -1048577 | 32, var10);
               }

               var4 = new class197(var5, var6, var7, var14, var10, var9, arg1, arg2, arg3);
               if (!var4.field7111.containsKey(arg0)) {
                  class772.method5151(arg0);
                  var4.method11499(arg0, new class31(var4, arg0, arg0.getWidth(), arg0.getHeight(), true));
               }

               var4.method11519(arg0);
               var4.method16310();
               return var4;
            }
         }
      } catch (RuntimeException var19) {
         if (var4 != null) {
            var4.method2508();
         }

         throw var19;
      }
   }

   @deob.ObfuscatedName("ahf.ny()V")
   protected void method2501() {
      for(class106 var1 = (class106)this.field1258.method14964(); var1 != null; var1 = (class106)this.field1258.method15006()) {
         class569 var2 = (class569)var1.field807;
         var2.method564();
         if (this.field7109 == var2) {
            var2.method540();
         }
      }

      super.method2501();
   }

   @deob.ObfuscatedName("ahf.nr()V")
   protected void method2675() {
      for(class106 var1 = (class106)this.field1258.method14964(); var1 != null; var1 = (class106)this.field1258.method15006()) {
         class569 var2 = (class569)var1.field807;
         var2.method570();
      }

      super.method2675();
   }

   @deob.ObfuscatedName("ahf.acy()Z")
   public boolean method2614() {
      int var1 = IDirect3DDevice.TestCooperativeLevel(this.field1256);
      if (var1 == 0 || var1 == -2005530519) {
         IDirect3DDevice.SetDepthStencilSurface(this.field1256, 0L);

         for(int var2 = 0; var2 < 4; ++var2) {
            IDirect3DDevice.SetRenderTarget(this.field1256, var2, 0L);
         }

         for(int var3 = 0; var3 < 4; ++var3) {
            IDirect3DDevice.SetStreamSource(this.field1256, var3, 0L, 0, 0);
         }

         for(int var4 = 0; var4 < 4; ++var4) {
            IDirect3DDevice.SetTexture(this.field1256, var4, 0L);
         }

         IDirect3DDevice.SetIndices(this.field1256, 0L);
         this.method2675();
         this.field1257.BackBufferWidth = 0;
         this.field1257.BackBufferHeight = 0;
         if (method2682(this.field1268, this.field1254, this.field1255, this.field10103, this.field1257)) {
            int var5 = IDirect3DDevice.Reset(this.field1256, this.field1257);
            if (class553.method7842(var5)) {
               this.method2501();
               this.method2549();
               return true;
            }

            System.exit(0);
         }
      }

      return false;
   }

   @deob.ObfuscatedName("ahf.nj()V")
   protected void method2549() {
      for(int var1 = 0; var1 < this.field10099; ++var1) {
         IDirect3DDevice.SetSamplerState(this.field1256, var1, 7, 2);
         IDirect3DDevice.SetSamplerState(this.field1256, var1, 6, 2);
         IDirect3DDevice.SetSamplerState(this.field1256, var1, 5, 2);
         IDirect3DDevice.SetSamplerState(this.field1256, var1, 1, 1);
         IDirect3DDevice.SetSamplerState(this.field1256, var1, 2, 1);
         this.field1281[var1] = class500.field4024;
         boolean[] var2 = this.field1264;
         this.field1265[var1] = true;
         var2[var1] = true;
         this.field1274[var1] = false;
         this.field1269[var1] = 0;
      }

      IDirect3DDevice.SetTextureStageState(this.field1256, 0, 6, 1);
      IDirect3DDevice.SetRenderState(this.field1256, 9, 2);
      IDirect3DDevice.SetRenderState(this.field1256, 23, 4);
      IDirect3DDevice.SetRenderState(this.field1256, 25, 5);
      IDirect3DDevice.SetRenderState(this.field1256, 24, 0);
      IDirect3DDevice.SetRenderState(this.field1256, 22, 2);
      IDirect3DDevice.SetRenderState(this.field1256, 147, 1);
      IDirect3DDevice.SetRenderState(this.field1256, 145, 1);
      IDirect3DDevice.method7836(this.field1256, 38, 0.95F);
      IDirect3DDevice.SetRenderState(this.field1256, 35, 3);
      IDirect3DDevice.method7836(this.field1256, 154, 1.0F);
      D3DLIGHT.SetType(this.field1260, 3);
      D3DLIGHT.SetType(this.field1261, 3);
      D3DLIGHT.SetType(this.field1272, 1);
      IDirect3DDevice.SetRenderState(this.field1256, 206, 1);
      this.field1263 = false;
      super.method2549();
   }

   @deob.ObfuscatedName("ahf.s()Lcz;")
   public class384 method2505() {
      D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
      IDirect3D.GetAdapterIdentifier(this.field1255, this.field1268, 0, var1);
      return new class384(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
   }

   @deob.ObfuscatedName("ahf.u(II)V")
   protected void method2745(int arg0, int arg1) throws class165 {
      IDirect3DDevice.EndScene(this.field1256);
      int var3 = this.field7120.method542();
      if (class553.method7841(var3)) {
         if (var3 != -2005530520) {
            if (++this.field1259 > 50) {
               throw new class165(var3);
            }
         } else {
            this.field7120.method570();
            this.method2614();
            ((class31)this.field7120).method564();
         }
      } else {
         this.field1259 = 0;
      }

      IDirect3DDevice.BeginScene(this.field1256);
      if (this.field7118 != null) {
         this.field7118.method5113();
      }

   }

   @deob.ObfuscatedName("ahf.v()V")
   public void method2507() {
      long var1 = IDirect3DDevice.CreateEventQuery(this.field1256);
      if (class553.method7842(IDirect3DEventQuery.Issue(var1))) {
         while(true) {
            int var3 = IDirect3DEventQuery.IsSignaled(var1);
            if (var3 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      IUnknown.Release(var1);
   }

   @deob.ObfuscatedName("ahf.e()V")
   protected void method2508() {
      super.method2508();
      if (this.field1260 != 0L) {
         D3DLIGHT.Destroy(this.field1260);
         this.field1260 = 0L;
      }

      if (this.field1261 != 0L) {
         D3DLIGHT.Destroy(this.field1261);
         this.field1261 = 0L;
      }

      if (this.field1272 != 0L) {
         D3DLIGHT.Destroy(this.field1272);
         this.field1272 = 0L;
      }

      if (this.field1256 != 0L) {
         IDirect3DDevice.Destroy(this.field1256);
         this.field1256 = 0L;
      }

      if (this.field1255 != 0L) {
         IUnknown.Release(this.field1255);
         this.field1255 = 0L;
      }

   }

   public void finalize() {
      super.finalize();
   }

   @deob.ObfuscatedName("ahf.og()F")
   public float method2510() {
      return -0.5F;
   }

   @deob.ObfuscatedName("ahf.ar()Lym;")
   public class973 method2513() {
      return new class282(this);
   }

   @deob.ObfuscatedName("ahf.aq(Ljava/awt/Canvas;II)Lyc;")
   protected class963 method2512(Canvas arg0, int arg1, int arg2) {
      return new class31(this, arg0, arg1, arg2, false);
   }

   @deob.ObfuscatedName("ahf.as(IILcn;Ldt;I)Ldm;")
   public class398 method2679(int arg0, int arg1, class372 arg2, class405 arg3, int arg4) {
      return new class560(this, arg2, arg3, arg0, arg1, arg4);
   }

   @deob.ObfuscatedName("ahf.au(II)Ldh;")
   public class393 method2514(int arg0, int arg1) {
      return new class566(this, class405.field3058, arg0, arg1, 0);
   }

   @deob.ObfuscatedName("ahf.ad(III)Ldh;")
   public class393 method2649(int arg0, int arg1, int arg2) {
      return new class566(this, class405.field3058, arg0, arg1, arg2);
   }

   private class106 add(class569 arg0) {
      for(class106 var2 = (class106)this.field1258.method14964(); var2 != null; var2 = (class106)this.field1258.method15006()) {
         if (var2.field807 == arg0) {
            return var2;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ahf.acq(Ljn;)Ladw;")
   private class106 method2763(class569 arg0) {
      for(class106 var2 = (class106)this.field1258.method14964(); var2 != null; var2 = (class106)this.field1258.method15006()) {
         if (var2.field807 == arg0) {
            return var2;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ahf.aco(Ljn;)V")
   public void method2517(class569 arg0) {
      if (this.method2763(arg0) == null) {
         this.field1258.method14959(new class106(arg0));
      }

   }

   @deob.ObfuscatedName("ahf.acz(Ljn;)V")
   public void method2518(class569 arg0) {
      class106 var2 = this.method2763(arg0);
      if (var2 != null) {
         var2.method9864();
      }

   }

   @deob.ObfuscatedName("ahf.am(IIII)[I")
   public int[] method2609(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      long var6 = IDirect3DDevice.GetRenderTarget(this.field1256, 0);
      long var8 = IDirect3DDevice.CreateRenderTarget(this.field1256, arg2, arg3, 21, 0, 0, true);
      if (class553.method7842(IDirect3DDevice.StretchRect(this.field1256, var6, arg0, arg1, arg2, arg3, var8, 0, 0, arg2, arg3, 1))) {
         var5 = new int[arg2 * arg3];
         IDirect3DSurface.Download(var8, 0, 0, arg2, arg3, arg2 * 4, 16, this.field9976);
         this.field9975.clear();
         this.field9975.asIntBuffer().get(var5);
      }

      IUnknown.Release(var6);
      IUnknown.Release(var8);
      return var5;
   }

   @deob.ObfuscatedName("ahf.aj()V")
   public void method2520() {
   }

   @deob.ObfuscatedName("ahf.cb(Ldo;Ldo;FLdo;)Ldo;")
   public class400 method2521(class400 arg0, class400 arg1, float arg2, class400 arg3) {
      return arg2 < 0.5F ? arg0 : arg1;
   }

   @deob.ObfuscatedName("ahf.ba(II)V")
   public void method2522(int arg0, int arg1) {
      IDirect3DDevice.Clear(this.field1256, arg0, arg1, 1.0F, 0);
   }

   @deob.ObfuscatedName("ahf.od()V")
   protected void method2523() {
      if (this.field7109 != null) {
         IDirect3DDevice.SetViewport(this.field1256, this.field10034 + this.field10030, this.field10035 + this.field10031, this.field10032, this.field10061, this.field10016, this.field10118);
      }

   }

   @deob.ObfuscatedName("ahf.oe()V")
   protected void method2765() {
      IDirect3DDevice.SetScissorRect(this.field1256, this.field10034 + this.field10024, this.field10035 + this.field10022, this.field9966, this.field10023);
   }

   @deob.ObfuscatedName("ahf.oj()V")
   protected void method2525() {
      IDirect3DDevice.method7837(this.field1256, 174, this.field10072);
   }

   @deob.ObfuscatedName("ahf.acg(J)V")
   public final void method2526(long arg0) {
      this.field1282 = arg0;
      IDirect3DDevice.SetVertexShader(this.field1256, arg0);
   }

   @deob.ObfuscatedName("ahf.acb(J)V")
   public final void method2527(long arg0) {
      IDirect3DDevice.SetPixelShader(this.field1256, arg0);
   }

   @deob.ObfuscatedName("ahf.nu(Lko;Lko;Lko;)V")
   public void method2528(class597 arg0, class597 arg1, class597 arg2) {
      IDirect3DDevice.SetTransform(this.field1256, 256, arg0.field5413);
      IDirect3DDevice.SetTransform(this.field1256, 2, arg1.field5413);
      IDirect3DDevice.SetTransform(this.field1256, 3, arg2.field5413);
   }

   @deob.ObfuscatedName("ahf.os(Lko;)V")
   public void method2647(class597 arg0) {
      arg0.method8388(this.field1270);
   }

   @deob.ObfuscatedName("ahf.pz()V")
   protected void method2529() {
      IDirect3DDevice.method7837(this.field1256, 7, this.field10038);
   }

   @deob.ObfuscatedName("ahf.pn()V")
   protected void method2531() {
      IDirect3DDevice.method7837(this.field1256, 14, this.field10036 && this.field10037);
   }

   @deob.ObfuscatedName("ahf.pw()V")
   protected void method2697() {
      if (this.field9973) {
         IDirect3DDevice.method7837(this.field1256, 137, this.field10004 && !this.field10090);
      }

   }

   @deob.ObfuscatedName("ahf.pp()V")
   protected void method2533() {
      if (this.field9973) {
         D3DLIGHT.SetAmbient(this.field1260, this.field10050 * this.field10047, this.field10050 * this.field10048, this.field10058 * this.field10050, 0.0F);
         this.field1263 = false;
      }

   }

   @deob.ObfuscatedName("ahf.pd()V")
   protected void method2534() {
      if (this.field9973) {
         float var1 = this.field10075 ? this.field10051 : 0.0F;
         float var2 = this.field10075 ? -this.field9996 : 0.0F;
         D3DLIGHT.SetDiffuse(this.field1260, this.field10047 * var1, this.field10048 * var1, this.field10058 * var1, 0.0F);
         D3DLIGHT.SetDiffuse(this.field1261, this.field10047 * var2, this.field10048 * var2, this.field10058 * var2, 0.0F);
         this.field1263 = false;
      }

   }

   @deob.ObfuscatedName("ahf.pe()V")
   protected void method2535() {
      if (this.field9973) {
         D3DLIGHT.SetDirection(this.field1260, -this.field10042[0], -this.field10042[1], -this.field10042[2]);
         D3DLIGHT.SetDirection(this.field1261, -this.field10043[0], -this.field10043[1], -this.field10043[2]);
         this.field1263 = false;
      }

   }

   @deob.ObfuscatedName("ahf.pa()V")
   protected void method2536() {
      this.method2534();
      this.method2732();
   }

   @deob.ObfuscatedName("ahf.po()V")
   protected void method2732() {
      if (this.field9973 && !this.field1263) {
         IDirect3DDevice.LightEnable(this.field1256, 0, false);
         IDirect3DDevice.LightEnable(this.field1256, 1, false);
         IDirect3DDevice.SetLight(this.field1256, 0, this.field1260);
         IDirect3DDevice.SetLight(this.field1256, 1, this.field1261);
         IDirect3DDevice.LightEnable(this.field1256, 0, true);
         IDirect3DDevice.LightEnable(this.field1256, 1, true);
         this.field1263 = true;
      }

   }

   @deob.ObfuscatedName("ahf.pu()V")
   protected void method2538() {
      int var1;
      for(var1 = 0; var1 < this.field10055; ++var1) {
         class81 var2 = this.field9962[var1];
         int var3 = var1 + 2;
         int var4 = var2.method1113();
         float var5 = var2.method1114() / 255.0F;
         D3DLIGHT.SetPosition(this.field1272, (float)var2.method1123(), (float)var2.method1110(), (float)var2.method1111());
         D3DLIGHT.SetDiffuse(this.field1272, (float)(var4 >> 16 & 255) * var5, (float)(var4 >> 8 & 255) * var5, (float)(var4 & 255) * var5, 0.0F);
         D3DLIGHT.SetAttenuation(this.field1272, 0.0F, 0.0F, 1.0F / (float)(var2.method1112() * var2.method1112()));
         D3DLIGHT.SetRange(this.field1272, (float)var2.method1112());
         IDirect3DDevice.SetLight(this.field1256, var3, this.field1272);
         IDirect3DDevice.LightEnable(this.field1256, var3, true);
      }

      while(var1 < this.field10045) {
         IDirect3DDevice.LightEnable(this.field1256, var1 + 2, false);
         ++var1;
      }

   }

   @deob.ObfuscatedName("ahf.pj(Lcn;Ldt;)Z")
   public boolean method2735(class372 arg0, class405 arg1) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return class553.method7842(IDirect3D.GetAdapterDisplayMode(this.field1255, this.field1268, var3)) && class553.method7842(IDirect3D.CheckDeviceFormat(this.field1255, this.field1268, this.field1254, var3.Format, 0, 3, method2581(arg0, arg1)));
   }

   @deob.ObfuscatedName("ahf.pt(Lcn;Ldt;)Z")
   public boolean method2540(class372 arg0, class405 arg1) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return class553.method7842(IDirect3D.GetAdapterDisplayMode(this.field1255, this.field1268, var3)) && class553.method7842(IDirect3D.CheckDeviceFormat(this.field1255, this.field1268, this.field1254, var3.Format, 0, 4, method2581(arg0, arg1)));
   }

   @deob.ObfuscatedName("ahf.py(Lcn;Ldt;II)Lhr;")
   public class511 method2541(class372 arg0, class405 arg1, int arg2, int arg3) {
      return new class46(this, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ahf.qu(IIZ[III)Lhr;")
   public class511 method2542(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
      return new class46(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ahf.ph(Lcn;IIZ[BII)Lhr;")
   protected class511 method2543(class372 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
      return new class46(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("ahf.qj(Lcn;IIZ[FII)Lhr;")
   protected class511 method2544(class372 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
      return new class46(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("ahf.qk(Lcn;Ldt;II)Lii;")
   public class529 method2545(class372 arg0, class405 arg1, int arg2, int arg3) {
      return new class34(this, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ahf.qi(IZ[[I)Lio;")
   public class535 method2596(int arg0, boolean arg1, int[][] arg2) {
      return new class44(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ahf.qh(Lcn;IIIZ[B)Lga;")
   public class467 method2547(class372 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
      return new class47(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ahf.act(Ljo;)V")
   public final void method2709(class570 arg0) {
      IDirect3DDevice.SetTexture(this.field1256, this.field10113, arg0.method713());
      if (this.field9973 && !this.field1267[this.field10113]) {
         this.field1267[this.field10113] = true;
         this.method2555();
         this.method2554();
      }

   }

   @deob.ObfuscatedName("ahf.acu(Labq;)V")
   public final void method2568(class46 arg0) {
      this.method2709(arg0);
      if (this.field1264[this.field10113] != arg0.field329) {
         IDirect3DDevice.SetSamplerState(this.field1256, this.field10113, 1, arg0.field329 ? 1 : 3);
         this.field1264[this.field10113] = arg0.field329;
      }

      if (this.field1265[this.field10113] != arg0.field328) {
         IDirect3DDevice.SetSamplerState(this.field1256, this.field10113, 2, arg0.field328 ? 1 : 3);
         this.field1265[this.field10113] = arg0.field328;
      }

   }

   @deob.ObfuscatedName("ahf.ada(Labr;)V")
   public final void method2694(class47 arg0) {
      this.method2709(arg0);
      if (!this.field1264[this.field10113]) {
         IDirect3DDevice.SetSamplerState(this.field1256, this.field10113, 1, 1);
         this.field1264[this.field10113] = true;
      }

      if (!this.field1265[this.field10113]) {
         IDirect3DDevice.SetSamplerState(this.field1256, this.field10113, 2, 1);
         this.field1265[this.field10113] = true;
      }

   }

   @deob.ObfuscatedName("ahf.qb()V")
   public void method2551() {
      if (this.field1267[this.field10113]) {
         this.field1267[this.field10113] = false;
         IDirect3DDevice.SetTexture(this.field1256, this.field10113, 0L);
         this.method2555();
         this.method2554();
      }

   }

   @deob.ObfuscatedName("ahf.qo()V")
   protected void method2552() {
      if (this.field1282 == 0L && this.field10063[this.field10113] != class503.field4043) {
         if (this.field10063[this.field10113] == class503.field4041) {
            IDirect3DDevice.SetTransform(this.field1256, this.field10113 + 16, this.field10062[this.field10113].method8384(this.field1279));
         } else {
            IDirect3DDevice.SetTransform(this.field1256, this.field10113 + 16, this.field10062[this.field10113].method8412(this.field1279));
         }

         int var1 = method2640(this.field10063[this.field10113]);
         if (this.field1269[this.field10113] != var1) {
            IDirect3DDevice.SetTextureStageState(this.field1256, this.field10113, 24, var1);
            this.field1269[this.field10113] = var1;
         }
      } else {
         IDirect3DDevice.SetTextureStageState(this.field1256, this.field10113, 24, 0);
         this.field1269[this.field10113] = 0;
      }

   }

   @deob.ObfuscatedName("ahf.qv()V")
   protected void method2695() {
   }

   @deob.ObfuscatedName("ahf.qw()V")
   protected void method2554() {
      if (this.field9973) {
         int var1 = this.field1267[this.field10113] ? method2559(this.field10064[this.field10113]) : 1;
         IDirect3DDevice.SetTextureStageState(this.field1256, this.field10113, 1, var1);
      }

   }

   @deob.ObfuscatedName("ahf.rr()V")
   protected void method2555() {
      if (this.field9973) {
         int var1 = this.field1267[this.field10113] ? method2559(this.field10025[this.field10113]) : 1;
         IDirect3DDevice.SetTextureStageState(this.field1256, this.field10113, 4, var1);
      }

   }

   @deob.ObfuscatedName("ahf.qg(ILhk;ZZ)V")
   protected final void method2556(int arg0, class504 arg1, boolean arg2, boolean arg3) {
      if (this.field9973) {
         int var5 = 0;
         byte var6;
         switch(arg0) {
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = 26;
            break;
         default:
            var6 = 2;
         }

         if (arg2) {
            var5 |= 32;
         }

         if (arg3) {
            var5 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.field1256, this.field10113, var6, method2762(arg1) | var5);
      }

   }

   @deob.ObfuscatedName("ahf.qc(ILhk;Z)V")
   protected final void method2557(int arg0, class504 arg1, boolean arg2) {
      if (this.field9973) {
         int var4 = 0;
         byte var5;
         switch(arg0) {
         case 1:
            var5 = 6;
            break;
         case 2:
            var5 = 27;
            break;
         default:
            var5 = 5;
         }

         if (arg2) {
            var4 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.field1256, this.field10113, var5, method2762(arg1) | var4);
      }

   }

   @deob.ObfuscatedName("ahf.qm()V")
   protected final void method2558() {
      if (this.field9973) {
         IDirect3DDevice.SetRenderState(this.field1256, 60, this.field9969);
      }

   }

   @deob.ObfuscatedName("ahf.adl(Lhx;)I")
   private static final int method2559(class517 arg0) {
      switch(arg0.field4114) {
      case 0:
         return 4;
      case 1:
         return 2;
      case 2:
         return 26;
      case 3:
         return 7;
      case 4:
         return 10;
      default:
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("ahf.adr(Lhk;)I")
   private static final int method2762(class504 arg0) {
      switch(arg0.field4049) {
      case 0:
         return 3;
      case 1:
         return 2;
      case 2:
         return 0;
      case 3:
         return 1;
      default:
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("ahf.adm(Lhj;)I")
   private static final int method2640(class503 arg0) {
      switch(arg0.field4045) {
      case 0:
         return 256;
      case 1:
         return 2;
      case 2:
         return 4;
      case 3:
      default:
         return 0;
      case 4:
         return 1;
      case 5:
         return 3;
      }
   }

   @deob.ObfuscatedName("ahf.rd(I)V")
   public void method2562(int arg0) {
      IDirect3DDevice.SetRenderState(this.field1256, 168, arg0);
   }

   @deob.ObfuscatedName("ahf.rv()V")
   protected void method2563() {
      IDirect3DDevice.method7837(this.field1256, 15, this.field10102);
   }

   @deob.ObfuscatedName("ahf.rk()V")
   protected void method2509() {
      switch(this.field10100.field4082) {
      case 0:
         IDirect3DDevice.SetRenderState(this.field1256, 19, 5);
         IDirect3DDevice.SetRenderState(this.field1256, 20, 6);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.field1256, 19, 9);
         IDirect3DDevice.SetRenderState(this.field1256, 20, 2);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.field1256, 19, 2);
         IDirect3DDevice.SetRenderState(this.field1256, 20, 2);
         break;
      case 3:
         IDirect3DDevice.SetRenderState(this.field1256, 19, 2);
         IDirect3DDevice.SetRenderState(this.field1256, 20, 1);
      }

      switch(this.field10130) {
      case 0:
         IDirect3DDevice.SetRenderState(this.field1256, 207, 1);
         IDirect3DDevice.SetRenderState(this.field1256, 208, 1);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.field1256, 207, 2);
         IDirect3DDevice.SetRenderState(this.field1256, 208, 1);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.field1256, 207, 2);
         IDirect3DDevice.SetRenderState(this.field1256, 208, 2);
      }

   }

   @deob.ObfuscatedName("ahf.rc()V")
   protected void method2565() {
      IDirect3DDevice.method7837(this.field1256, 27, this.field10101);
   }

   @deob.ObfuscatedName("ahf.rw()V")
   protected void method2566() {
      if (this.field9973) {
         IDirect3DDevice.method7837(this.field1256, 28, this.field10093 && this.field10092 && this.field10065 >= 0);
      }

   }

   @deob.ObfuscatedName("ahf.rz()V")
   protected void method2550() {
      this.field10060 = this.field10021 - (float)this.field10041;
      this.field10109 = this.field10060 - (float)this.field10065;
      if (this.field10109 < this.field10020) {
         this.field10109 = this.field10020;
      }

      if (this.field9973) {
         IDirect3DDevice.method7836(this.field1256, 36, this.field10109);
         IDirect3DDevice.method7836(this.field1256, 37, this.field10060);
         IDirect3DDevice.SetRenderState(this.field1256, 34, this.field10112);
      }

   }

   @deob.ObfuscatedName("ahf.rt(Z)V")
   protected void method2607(boolean arg0) {
      IDirect3DDevice.method7837(this.field1256, 161, arg0);
   }

   @deob.ObfuscatedName("ahf.ro(Z)Lin;")
   public final class534 method2569(boolean arg0) {
      return new class564(this, class405.field3053, arg0);
   }

   @deob.ObfuscatedName("ahf.rm(Z)Lho;")
   public final class508 method2570(boolean arg0) {
      return new class565(this, arg0);
   }

   @deob.ObfuscatedName("ahf.ra([Lhp;)Lhl;")
   public class505 method2571(class509[] arg0) {
      return new class37(this, arg0);
   }

   @deob.ObfuscatedName("ahf.re(Lhl;)V")
   public void method2572(class505 arg0) {
      class37 var2 = (class37)arg0;
      IDirect3DDevice.SetVertexDeclaration(this.field1256, var2.field265);
   }

   @deob.ObfuscatedName("ahf.rx(ILho;)V")
   public void method2539(int arg0, class508 arg1) {
      class565 var3 = (class565)arg1;
      IDirect3DDevice.SetStreamSource(this.field1256, arg0, var3.field4956, 0, var3.method7954());
   }

   @deob.ObfuscatedName("ahf.rp(Lin;)V")
   public void method2624(class534 arg0) {
      IDirect3DDevice.SetIndices(this.field1256, ((class564)arg0).field4948);
   }

   @deob.ObfuscatedName("ahf.rs(Lib;II)V")
   public final void method2575(class522 arg0, int arg1, int arg2) {
      if (this.field1271 != null) {
         this.field1271.method289();
      }

      IDirect3DDevice.DrawPrimitive(this.field1256, method2567(arg0), arg1, arg2);
   }

   @deob.ObfuscatedName("ahf.rg(Lin;Lib;IIII)V")
   public final void method2736(class534 arg0, class522 arg1, int arg2, int arg3, int arg4, int arg5) {
      if (this.field1271 != null) {
         this.field1271.method289();
      }

      IDirect3DDevice.DrawIndexedPrimitiveIB(this.field1256, ((class564)arg0).field4948, 4, 0, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ahf.rb(Lib;IIII)V")
   public final void method2577(class522 arg0, int arg1, int arg2, int arg3, int arg4) {
      if (this.field1271 != null) {
         this.field1271.method289();
      }

      IDirect3DDevice.DrawIndexedPrimitive(this.field1256, method2567(arg0), 0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("ahf.adz(Ljava/lang/String;)[B")
   public byte[] method2578(String arg0) {
      return this.method16308("dx", arg0);
   }

   @deob.ObfuscatedName("ahf.y(Ljava/lang/String;)Lev;")
   public class434 method2579(String arg0) {
      byte[] var2 = this.method2578(arg0);
      if (var2 == null) {
         return null;
      } else {
         class414 var3 = this.method16391(var2);
         return new class25(this, var3);
      }
   }

   @deob.ObfuscatedName("ahf.i(I)V")
   public final synchronized void method2580(int arg0) {
      for(int var2 = 0; var2 < this.field1280; ++var2) {
         IUnknown.Release(this.field1253[var2]);
      }

      this.field1280 = 0;
      super.method2580(arg0);
   }

   @deob.ObfuscatedName("ahf.adf(Lcn;Ldt;)I")
   public static final int method2581(class372 arg0, class405 arg1) {
      switch(arg1.field3054) {
      case 2:
         if (class372.field2736 == arg0) {
            return 113;
         }
         break;
      case 4:
         if (class372.field2736 == arg0) {
            return 116;
         }
         break;
      case 7:
         switch(arg0.field2743) {
         case 0:
            return 51;
         case 1:
            return 50;
         case 2:
            return class551.field4430;
         case 3:
            return 21;
         case 4:
         case 7:
         default:
            break;
         case 5:
            return 22;
         case 6:
            return 77;
         case 8:
            return 28;
         case 9:
            return class551.field4429;
         }
      }

      throw new IllegalArgumentException("");
   }

   @deob.ObfuscatedName("ahf.adb(Ldt;)I")
   public static final int method2582(class405 arg0) {
      if (class405.field3053 == arg0) {
         return 80;
      } else if (class405.field3058 == arg0) {
         return 77;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @deob.ObfuscatedName("ahf.adi(Lib;)I")
   private static final int method2567(class522 arg0) {
      switch(arg0.field4135) {
      case 0:
         return 4;
      case 1:
         return 2;
      case 2:
         return 1;
      case 3:
         return 3;
      case 4:
         return 6;
      case 5:
         return 5;
      default:
         throw new IllegalArgumentException("");
      }
   }

   @deob.ObfuscatedName("ahf.dc(Z)V")
   public void method2506(boolean arg0) {
   }

   @deob.ObfuscatedName("ahf.adc(IIJILjagdx/D3DPRESENT_PARAMETERS;)Z")
   public static boolean method2682(int arg0, int arg1, long arg2, int arg3, D3DPRESENT_PARAMETERS arg4) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      try {
         D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
         if (class553.method7841(IDirect3D.GetAdapterDisplayMode(arg2, arg0, var9))) {
            return false;
         } else {
            label76:
            while(arg3 >= 0) {
               if (arg3 != 1) {
                  var8 = arg3 + 0;

                  for(int var10 = 0; var10 < field1283.length; ++var10) {
                     if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, var9.Format, field1283[var10], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, var9.Format, 1, 1, field1283[var10]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, field1283[var10], true, var8) == 0)) {
                        for(int var11 = 0; var11 < field1266.length; ++var11) {
                           if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, var9.Format, 2, 1, field1266[var11]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, var9.Format, field1283[var10], field1266[var11]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, field1266[var10], true, var8) == 0)) {
                              var7 = field1283[var10];
                              var6 = field1266[var11];
                              break label76;
                           }
                        }
                     }
                  }
               }

               --arg3;
            }

            if (arg3 >= 0 && var7 != 0 && var6 != 0) {
               arg4.BackBufferFormat = var7;
               arg4.AutoDepthStencilFormat = var6;
               arg4.MultiSampleType = var8;
               arg4.MultiSampleQuality = 0;
               return true;
            } else {
               return false;
            }
         }
      } catch (Throwable var13) {
         return false;
      }
   }

   @deob.ObfuscatedName("ahf.ado(J)V")
   public synchronized void method2586(long arg0) {
      if (this.field1280 == this.field1277) {
         this.field1277 *= 2;
         long[] var3 = new long[this.field1277];
         System.arraycopy(this.field1253, 0, var3, 0, this.field1280);
         this.field1253 = var3;
      }

      this.field1253[this.field1280] = arg0;
      ++this.field1280;
   }

   @deob.ObfuscatedName("ahf.sg(I)V")
   public void method2500(int arg0) {
      if (!this.field1262) {
         int var2 = (arg0 & 2) != 0 ? 2 : 3;
         IDirect3DDevice.SetRenderState(this.field1256, 8, var2);
      }

   }
}
