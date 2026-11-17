import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.class553;

@deob.ObfuscatedName("akj")
public class class282 extends class180 {
   @deob.ObfuscatedName("akj.x")
   private class577 field1840 = null;
   @deob.ObfuscatedName("akj.s")
   private final class593[] field1844 = new class593[4];
   @deob.ObfuscatedName("akj.b")
   private final class197 field1843;
   @deob.ObfuscatedName("akj.p")
   private int field1837;
   @deob.ObfuscatedName("akj.r")
   private int field1839;
   @deob.ObfuscatedName("akj.o")
   private int field1841;
   @deob.ObfuscatedName("akj.a")
   private boolean field1842;

   public class282(class197 arg0) {
      super(arg0);
      this.field1843 = arg0;
   }

   @deob.ObfuscatedName("akj.k()I")
   public int method566() {
      return this.field1839;
   }

   @deob.ObfuscatedName("akj.d()I")
   public int method559() {
      return this.field1837;
   }

   @deob.ObfuscatedName("akj.n(Ldh;)V")
   public void method2352(class393 arg0) {
      class577 var2 = (class577)arg0;
      if (arg0 != null) {
         if (this.field1841 != 0) {
            if (this.field1839 != var2.method3939() || this.field1837 != var2.method3938()) {
               throw new RuntimeException();
            }
         } else {
            this.field1837 = var2.method3938();
            this.field1839 = var2.method3939();
            this.method2433();
         }

         this.field1841 |= 16;
         this.field1840 = var2;
         if (this.field1842) {
            this.method3629(var2.method7920());
         }
      } else {
         this.field1841 &= -17;
         this.field1840 = null;
         if (this.field1842) {
            this.method3629(0L);
         }

         if (this.field1841 == 0) {
            this.field1837 = 0;
            this.field1839 = 0;
         }
      }

   }

   @deob.ObfuscatedName("akj.z(ILdm;)V")
   public void method2351(int arg0, class398 arg1) {
      int var3 = 1 << arg0;
      class593 var4 = (class593)arg1;
      if (arg1 != null) {
         if (this.field1841 != 0) {
            if (this.field1839 != var4.method3939() || this.field1837 != var4.method3938()) {
               throw new RuntimeException();
            }
         } else {
            this.field1837 = var4.method3938();
            this.field1839 = var4.method3939();
            this.method2433();
         }

         this.field1841 |= var3;
         this.field1844[arg0] = var4;
         if (this.field1842) {
            this.method3627(arg0, var4.method7920());
         }
      } else {
         this.field1841 &= ~var3;
         this.field1844[arg0] = null;
         if (this.field1842) {
            this.method3627(arg0, 0L);
         }

         if (this.field1841 == 0) {
            this.field1837 = 0;
            this.field1839 = 0;
         }
      }

   }

   @deob.ObfuscatedName("akj.ag(IJ)Z")
   private boolean method3627(int arg0, long arg1) {
      return class553.method7842(IDirect3DDevice.SetRenderTarget(this.field1843.field1256, arg0, arg1));
   }

   @deob.ObfuscatedName("akj.ak(J)Z")
   private boolean method3629(long arg0) {
      return class553.method7842(IDirect3DDevice.SetDepthStencilSurface(this.field1843.field1256, arg0));
   }

   @deob.ObfuscatedName("akj.c()Z")
   public boolean method2354() {
      return this.field1844[0] != null;
   }

   @deob.ObfuscatedName("akj.r()Z")
   public boolean method540() {
      for(int var1 = 0; var1 < 4; ++var1) {
         class593 var2 = this.field1844[var1];
         if (var2 != null) {
            long var3 = var2.method7920();
            this.method3627(var1, var3);
         }
      }

      if (this.field1840 != null) {
         this.method3629(this.field1840.method7920());
      }

      this.field1842 = true;
      return super.method540();
   }

   @deob.ObfuscatedName("akj.p()Z")
   public boolean method541() {
      for(int var1 = 1; var1 < 4; ++var1) {
         class593 var2 = this.field1844[var1];
         if (var2 != null) {
            this.method3627(var1, 0L);
         }
      }

      if (this.field1840 != null) {
         this.method3629(0L);
      }

      this.field1842 = false;
      return true;
   }

   @deob.ObfuscatedName("akj.w(IIIIIIZZ)V")
   public void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      if (arg6) {
         long var9 = IDirect3DDevice.GetRenderTarget(this.field1843.field1256, 0);
         IDirect3DDevice.StretchRect(this.field1843.field1256, this.field1844[0].method7920(), arg0, arg1, arg2, arg3, var9, arg4, arg5, arg2, arg3, 0);
         IUnknown.Release(var9);
      }

   }

   @deob.ObfuscatedName("akj.b()V")
   public void method570() {
      if (this.field1840 != null) {
         this.field1840.method302();
      }

      for(int var1 = 0; var1 < this.field1844.length; ++var1) {
         if (this.field1844[var1] != null) {
            this.field1844[var1].method302();
         }
      }

   }

   @deob.ObfuscatedName("akj.aa()V")
   private void method3630() {
      if (this.field1840 != null) {
         this.field1840.method7921();
      }

      for(int var1 = 0; var1 < this.field1844.length; ++var1) {
         if (this.field1844[var1] != null) {
            this.field1844[var1].method7921();
         }
      }

   }

   public void finalize() throws Throwable {
      this.method3630();
      super.finalize();
   }
}
