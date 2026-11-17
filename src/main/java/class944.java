import jaggl.OpenGL;

@deob.ObfuscatedName("xk")
public class class944 extends class344 {
   @deob.ObfuscatedName("xk.v")
   private boolean field9518 = false;
   @deob.ObfuscatedName("xk.g")
   private class936[] field9513;
   @deob.ObfuscatedName("xk.l")
   private class355 field9516;
   @deob.ObfuscatedName("xk.u")
   private boolean field9512;

   public class944(class983 arg0) {
      super(arg0);
      if (arg0.field10378) {
         byte[][] var2 = new byte[6][16384];
         byte[][] var3 = new byte[6][16384];
         byte[][] var4 = new byte[6][16384];
         int var5 = 0;
         class584 var6 = new class584(0.0F, -1.0F, 0.0F);

         for(int var7 = 0; var7 < 128; ++var7) {
            for(int var8 = 0; var8 < 128; ++var8) {
               float var9 = (float)var8 * 2.0F / 128.0F - 1.0F;
               float var10 = (float)var7 * 2.0F / 128.0F - 1.0F;
               float var11 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var9 * var9 + 1.0F)));
               float var12 = var9 * var11;
               float var13 = var10 * var11;

               for(int var14 = 0; var14 < 6; ++var14) {
                  class584 var15;
                  if (var14 == 0) {
                     var15 = new class584(-var11, -var12, var13);
                  } else if (var14 == 1) {
                     var15 = new class584(var11, var12, var13);
                  } else if (var14 == 2) {
                     var15 = new class584(-var12, var13, -var11);
                  } else if (var14 == 3) {
                     var15 = new class584(-var12, -var13, var11);
                  } else if (var14 == 4) {
                     var15 = new class584(var12, var11, -var13);
                  } else {
                     var15 = new class584(var12, -var11, var13);
                  }

                  float var16 = var15.method8231(var6);
                  float var17 = Math.max(0.0F, Math.min(1.0F, var16));
                  int var18;
                  int var19;
                  int var20;
                  if (var17 > 0.0F) {
                     var18 = Math.min(255, (int)(Math.pow((double)var17, 128.0D) * 400.0D));
                     var19 = Math.min(255, (int)(Math.pow((double)var17, 24.0D) * 400.0D));
                     var20 = Math.min(255, (int)(Math.pow((double)var17, 5.0D) * 400.0D));
                  } else {
                     var20 = 0;
                     var19 = 0;
                     var18 = 0;
                  }

                  var3[var14][var5] = (byte)var18;
                  var4[var14][var5] = (byte)var19;
                  var2[var14][var5] = (byte)var20;
               }

               ++var5;
            }
         }

         this.field9513 = new class936[3];
         this.field9513[0] = new class936(this.field2169, class372.field2735, class405.field3052, 128, false, var3, class372.field2735);
         this.field9513[1] = new class936(this.field2169, class372.field2735, class405.field3052, 128, false, var4, class372.field2735);
         this.field9513[2] = new class936(this.field2169, class372.field2735, class405.field3052, 128, false, var2, class372.field2735);
         this.method16016();
      }

   }

   @deob.ObfuscatedName("xk.n()Z")
   public boolean method4182() {
      return true;
   }

   @deob.ObfuscatedName("xk.t()V")
   private void method16016() {
      this.field9516 = new class355(this.field2169, 2);
      this.field9516.method4307(0);
      this.field2169.method16638(1);
      OpenGL.glTexGeni(8192, 9472, 34065);
      OpenGL.glTexGeni(8193, 9472, 34065);
      OpenGL.glTexGeni(8194, 9472, 34065);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glEnable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
      OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
      OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      OpenGL.glMatrixMode(5888);
      if (!this.field9512) {
         this.field2169.method16642(7681, 8448);
         this.field2169.method16643(0, 34168, 768);
         this.field2169.method16638(2);
         this.field2169.method16642(260, 7681);
         this.field2169.method16643(0, 34168, 768);
         this.field2169.method16643(1, 34168, 770);
         this.field2169.method16616(0, 34167, 770);
      } else {
         this.field2169.method16642(260, 7681);
         this.field2169.method16643(0, 5890, 770);
         this.field2169.method16616(0, 34167, 770);
      }

      this.field2169.method16638(0);
      this.field9516.method4303();
      this.field9516.method4307(1);
      this.field2169.method16638(1);
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      OpenGL.glDisable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      if (!this.field9512) {
         this.field2169.method16642(8448, 8448);
         this.field2169.method16643(0, 5890, 768);
         this.field2169.method16638(2);
         this.field2169.method16642(8448, 8448);
         this.field2169.method16643(0, 5890, 768);
         this.field2169.method16643(1, 34168, 768);
         this.field2169.method16616(0, 5890, 770);
      } else {
         this.field2169.method16642(8448, 8448);
         this.field2169.method16643(0, 5890, 768);
         this.field2169.method16616(0, 5890, 770);
      }

      this.field2169.method16638(0);
      this.field9516.method4303();
   }

   @deob.ObfuscatedName("xk.k(Z)V")
   public void method4187(boolean arg0) {
      if (this.field9516 != null && arg0) {
         if (!this.field9512) {
            this.field2169.method16638(2);
            this.field2169.method16639(this.field2169.field10358);
            this.field2169.method16638(0);
         }

         this.field9516.method4305('\u0000');
         this.field9518 = true;
      } else {
         this.field2169.method16616(0, 34168, 770);
      }

   }

   @deob.ObfuscatedName("xk.d(Z)V")
   public void method4184(boolean arg0) {
      this.field2169.method16642(8448, 7681);
   }

   @deob.ObfuscatedName("xk.b()V")
   public void method4196() {
      if (this.field9518) {
         if (!this.field9512) {
            this.field2169.method16638(2);
            this.field2169.method16639((class354)null);
         }

         this.field2169.method16638(1);
         this.field2169.method16639((class354)null);
         this.field2169.method16638(0);
         this.field9516.method4305('\u0001');
         this.field9518 = false;
      } else {
         this.field2169.method16616(0, 5890, 770);
      }

      this.field2169.method16642(8448, 8448);
   }

   @deob.ObfuscatedName("xk.r(II)V")
   public void method4199(int arg0, int arg1) {
      if (this.field9518) {
         this.field2169.method16638(1);
         this.field2169.method16639(this.field9513[arg0 - 1]);
         this.field2169.method16638(0);
      }

   }

   @deob.ObfuscatedName("xk.p(Lbw;I)V")
   public void method4183(class354 arg0, int arg1) {
      this.field2169.method16639(arg0);
      this.field2169.method16640(arg1);
   }
}
