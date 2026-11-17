import jaggl.OpenGL;

@deob.ObfuscatedName("ake")
public class class277 extends class180 {
   @deob.ObfuscatedName("ake.l")
   private final class622[] field1828 = new class622[4];
   @deob.ObfuscatedName("ake.b")
   private final class214 field1821;
   @deob.ObfuscatedName("ake.r")
   private int field1823;
   @deob.ObfuscatedName("ake.p")
   private int field1820;
   @deob.ObfuscatedName("ake.x")
   private int field1822;
   @deob.ObfuscatedName("ake.o")
   private int field1824;
   @deob.ObfuscatedName("ake.a")
   private int field1825;
   @deob.ObfuscatedName("ake.s")
   private class622 field1826;

   public class277(class214 arg0) {
      super(arg0);
      this.field1821 = arg0;
      int[] var2 = new int[1];
      OpenGL.glGenFramebuffersEXT(1, var2, 0);
      this.field1823 = var2[0];
   }

   @deob.ObfuscatedName("ake.k()I")
   public int method566() {
      return this.field1820;
   }

   @deob.ObfuscatedName("ake.d()I")
   public int method559() {
      return this.field1824;
   }

   @deob.ObfuscatedName("ake.z(ILdm;)V")
   public void method2351(int arg0, class398 arg1) {
      int var3 = 1 << arg0;
      class622 var4 = (class622)arg1;
      if (arg1 == null) {
         this.field1825 &= ~var3;
         this.field1828[arg0] = null;
         if (this.field1825 == 0) {
            this.field1824 = 0;
            this.field1820 = 0;
         }
      } else {
         if (this.field1825 != 0) {
            if (this.field1820 != var4.method3939() || this.field1824 != var4.method3938()) {
               throw new RuntimeException();
            }
         } else {
            this.field1824 = var4.method3938();
            this.field1820 = var4.method3939();
            this.method2433();
         }

         this.field1825 |= var3;
         this.field1828[arg0] = var4;
      }

      if (this == this.field1821.method11517()) {
         this.method3617(arg0);
      } else {
         this.field1822 |= var3;
      }

   }

   @deob.ObfuscatedName("ake.n(Ldh;)V")
   public void method2352(class393 arg0) {
      class622 var2 = (class622)arg0;
      if (arg0 == null) {
         this.field1825 &= -17;
         this.field1826 = null;
         if (this.field1825 == 0) {
            this.field1824 = 0;
            this.field1820 = 0;
         }
      } else {
         if (this.field1825 != 0) {
            if (this.field1820 != var2.method3939() || this.field1824 != var2.method3938()) {
               throw new RuntimeException();
            }
         } else {
            this.field1824 = var2.method3938();
            this.field1820 = var2.method3939();
            this.method2433();
         }

         this.field1825 |= 16;
         this.field1826 = var2;
      }

      if (this == this.field1821.method11517()) {
         this.method3615();
      } else {
         this.field1822 |= 16;
      }

   }

   @deob.ObfuscatedName("ake.ag(I)V")
   private void method3617(int arg0) {
      class622 var2 = this.field1828[arg0];
      if (var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
      } else {
         var2.method8881(arg0 + 36064);
      }

   }

   @deob.ObfuscatedName("ake.ak()V")
   private void method3615() {
      if (this.field1826 == null) {
         OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
      } else {
         this.field1826.method8881(36096);
      }

   }

   @deob.ObfuscatedName("ake.c()Z")
   public boolean method2354() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
      return var1 == 36053;
   }

   @deob.ObfuscatedName("ake.r()Z")
   public boolean method540() {
      OpenGL.glBindFramebufferEXT(36160, this.field1823);

      for(int var1 = 0; var1 < 4; ++var1) {
         if ((this.field1822 & 1 << var1) != 0) {
            this.method3617(var1);
         }
      }

      if ((this.field1822 & 16) != 0) {
         this.method3615();
      }

      this.field1822 = 0;
      return super.method540();
   }

   @deob.ObfuscatedName("ake.p()Z")
   public boolean method541() {
      OpenGL.glBindFramebufferEXT(36160, 0);
      return true;
   }

   @deob.ObfuscatedName("ake.w(IIIIIIZZ)V")
   public void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      if (arg6 | arg7) {
         int var9 = this.field1824;
         int var10 = this.field1821.method11517().method559();
         int var11 = 0;
         if (arg7) {
            var11 |= 256;
         }

         if (arg6) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT(36008, this.field1823);
         OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg2 + arg4, var10 - arg5, var11, 9728);
         OpenGL.glBindFramebufferEXT(36008, 0);
      }

   }

   @deob.ObfuscatedName("ake.b()V")
   public void method570() {
      if (this.field1823 != 0) {
         this.field1821.method2895(this.field1823);
         this.field1823 = 0;
      }

   }

   public void finalize() throws Throwable {
      super.finalize();
      this.method570();
   }
}
