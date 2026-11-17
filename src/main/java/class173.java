import jaggl.OpenGL;

@deob.ObfuscatedName("agi")
public class class173 extends class973 {
   @deob.ObfuscatedName("agi.s")
   private final class352[] field1170 = new class352[4];
   @deob.ObfuscatedName("agi.d")
   private final class983 field1171;
   @deob.ObfuscatedName("agi.b")
   private int field1177;
   @deob.ObfuscatedName("agi.r")
   private int field1173;
   @deob.ObfuscatedName("agi.p")
   private int field1174;
   @deob.ObfuscatedName("agi.o")
   private int field1175;
   @deob.ObfuscatedName("agi.a")
   private int field1176;
   @deob.ObfuscatedName("agi.x")
   private class352 field1178;

   public class173(class983 arg0) {
      if (!arg0.field10331) {
         throw new IllegalStateException("");
      } else {
         this.field1171 = arg0;
         int[] var2 = new int[1];
         OpenGL.glGenFramebuffersEXT(1, var2, 0);
         this.field1177 = var2[0];
      }
   }

   @deob.ObfuscatedName("agi.k()I")
   public int method566() {
      return this.field1173;
   }

   @deob.ObfuscatedName("agi.d()I")
   public int method559() {
      return this.field1174;
   }

   @deob.ObfuscatedName("agi.z(ILdm;)V")
   public void method2351(int arg0, class398 arg1) {
      int var3 = 1 << arg0;
      class352 var4 = (class352)arg1;
      if (arg1 == null) {
         this.field1175 &= ~var3;
         this.field1170[arg0] = null;
         if (this.field1175 == 0) {
            this.field1174 = 0;
            this.field1173 = 0;
         }
      } else {
         if ((this.field1175 | var3) != var3) {
            if (this.field1173 != var4.method3939() || this.field1174 != var4.method3938()) {
               throw new RuntimeException();
            }
         } else {
            this.field1174 = var4.method3938();
            this.field1173 = var4.method3939();
            if (this == this.field1171.method11517()) {
               this.field1171.method16599();
            }
         }

         this.field1175 |= var3;
         this.field1170[arg0] = var4;
      }

      if (this == this.field1171.method11517()) {
         this.method2366(arg0);
      } else {
         this.field1176 |= var3;
      }

   }

   @deob.ObfuscatedName("agi.n(Ldh;)V")
   public void method2352(class393 arg0) {
      class352 var2 = (class352)arg0;
      if (arg0 == null) {
         this.field1175 &= -17;
         this.field1178 = null;
         if (this.field1175 == 0) {
            this.field1174 = 0;
            this.field1173 = 0;
         }
      } else {
         if ((this.field1175 | 16) != 16) {
            if (this.field1173 != var2.method3939() || this.field1174 != var2.method3938()) {
               throw new RuntimeException();
            }
         } else {
            this.field1174 = var2.method3938();
            this.field1173 = var2.method3939();
            if (this == this.field1171.method11517()) {
               this.field1171.method16599();
            }
         }

         this.field1175 |= 16;
         this.field1178 = var2;
      }

      if (this == this.field1171.method11517()) {
         this.method2353();
      } else {
         this.field1176 |= 16;
      }

   }

   @deob.ObfuscatedName("agi.ah(I)V")
   private void method2366(int arg0) {
      class352 var2 = this.field1170[arg0];
      if (var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
      } else {
         var2.method4121(arg0 + 36064);
      }

   }

   @deob.ObfuscatedName("agi.aw()V")
   private void method2353() {
      if (this.field1178 == null) {
         OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
      } else {
         this.field1178.method4121(36096);
      }

   }

   @deob.ObfuscatedName("agi.c()Z")
   public boolean method2354() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
      return var1 == 36053;
   }

   @deob.ObfuscatedName("agi.r()Z")
   public boolean method540() {
      OpenGL.glBindFramebufferEXT(36160, this.field1177);

      for(int var1 = 0; var1 < 4; ++var1) {
         if ((this.field1176 & 1 << var1) != 0) {
            this.method2366(var1);
         }
      }

      if ((this.field1176 & 16) != 0) {
         this.method2353();
      }

      this.field1176 = 0;
      this.field1171.method16598();
      return true;
   }

   @deob.ObfuscatedName("agi.p()Z")
   public boolean method541() {
      OpenGL.glBindFramebufferEXT(36160, 0);
      return true;
   }

   @deob.ObfuscatedName("agi.al(I)V")
   public void method2368(int arg0) {
      OpenGL.glDrawBuffer(arg0 + 36064);
   }

   @deob.ObfuscatedName("agi.w(IIIIIIZZ)V")
   public void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      if (arg6 | arg7) {
         int var9 = this.field1174;
         int var10 = this.field1171.method11517().method559();
         int var11 = 0;
         if (arg7) {
            var11 |= 256;
         }

         if (arg6) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT(36008, this.field1177);
         OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg2 + arg4, var10 - arg5, var11, 9728);
         OpenGL.glBindFramebufferEXT(36008, 0);
      }

   }

   @deob.ObfuscatedName("agi.b()V")
   public void method570() {
      if (this.field1177 != 0) {
         this.field1171.method16656(this.field1177);
         this.field1177 = 0;
      }

   }

   public void finalize() throws Throwable {
      super.finalize();
      this.method570();
   }
}
