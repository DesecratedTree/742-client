import jaggl.OpenGL;

@deob.ObfuscatedName("xy")
public class class958 extends class344 {
   @deob.ObfuscatedName("xy.o")
   private static final float[] field9583 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   @deob.ObfuscatedName("xy.b")
   private final class346 field9580;
   @deob.ObfuscatedName("xy.p")
   private class950 field9578;
   @deob.ObfuscatedName("xy.r")
   private class355 field9581;

   public class958(class983 arg0, class346 arg1) {
      super(arg0);
      this.field9580 = arg1;
      this.method16049();
      this.field9578 = new class950(this.field2169, class372.field2735, class405.field3052, 2, new byte[]{0, -1}, class372.field2735);
      this.field9578.method16020(false);
   }

   @deob.ObfuscatedName("xy.n()Z")
   public boolean method4182() {
      return true;
   }

   @deob.ObfuscatedName("xy.k(Z)V")
   public void method4187(boolean arg0) {
      if (this.field2169.field10340 > 0) {
         float var2 = -0.5F / (float)this.field2169.field10340;
         this.field2169.method16638(1);
         field9583[0] = 0.0F;
         field9583[1] = 0.0F;
         field9583[2] = var2;
         field9583[3] = this.field2169.field10342 * var2 + 0.25F;
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glTexGenfv(8192, 9474, field9583, 0);
         OpenGL.glPopMatrix();
         this.field2169.method16650(0.5F, (float)this.field2169.field10340);
         this.field2169.method16639(this.field9578);
         this.field2169.method16638(0);
      }

      this.field9581.method4305('\u0000');
      OpenGL.glMatrixMode(5890);
      OpenGL.glPushMatrix();
      OpenGL.glScalef(0.25F, 0.25F, 1.0F);
      OpenGL.glMatrixMode(5888);
   }

   @deob.ObfuscatedName("xy.d(Z)V")
   public void method4184(boolean arg0) {
      this.field2169.method16642(260, 8448);
   }

   @deob.ObfuscatedName("xy.b()V")
   public void method4196() {
      this.field9581.method4305('\u0001');
      if (this.field2169.field10340 > 0) {
         this.field2169.method16638(1);
         this.field2169.method16639((class354)null);
         this.field2169.method16650(1.0F, 0.0F);
         this.field2169.method16638(0);
      }

      this.field2169.method16642(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }

   @deob.ObfuscatedName("xy.r(II)V")
   public void method4199(int arg0, int arg1) {
      if ((arg0 & 1) == 1) {
         if (this.field9580.field2181) {
            this.field2169.method16639(this.field9580.field2183);
            field9583[0] = 0.0F;
            field9583[1] = 0.0F;
            field9583[2] = 0.0F;
            field9583[3] = (float)(this.field2169.field10374 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, field9583, 0);
         } else {
            int var3 = this.field2169.field10374 % 4000 * 16 / 4000;
            this.field2169.method16639(this.field9580.field2182[var3]);
         }
      } else if (this.field9580.field2181) {
         this.field2169.method16639(this.field9580.field2183);
         field9583[0] = 0.0F;
         field9583[1] = 0.0F;
         field9583[2] = 0.0F;
         field9583[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, field9583, 0);
      } else {
         this.field2169.method16639(this.field9580.field2182[0]);
      }

   }

   @deob.ObfuscatedName("xy.p(Lbw;I)V")
   public void method4183(class354 arg0, int arg1) {
   }

   @deob.ObfuscatedName("xy.t()V")
   private void method16049() {
      this.field9581 = new class355(this.field2169, 2);
      this.field9581.method4307(0);
      this.field2169.method16638(1);
      this.field2169.method16642(7681, 260);
      this.field2169.method16643(0, 34168, 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glEnable(3168);
      this.field2169.method16638(0);
      OpenGL.glTexEnvf(8960, 34163, 2.0F);
      if (this.field9580.field2181) {
         OpenGL.glTexGeni(8194, 9472, 9217);
         OpenGL.glTexGeni(8195, 9472, 9217);
         OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
         OpenGL.glEnable(3170);
         OpenGL.glEnable(3171);
      }

      this.field9581.method4303();
      this.field9581.method4307(1);
      this.field2169.method16638(1);
      this.field2169.method16642(8448, 8448);
      this.field2169.method16643(0, 5890, 768);
      OpenGL.glDisable(3168);
      this.field2169.method16638(0);
      OpenGL.glTexEnvf(8960, 34163, 1.0F);
      if (this.field9580.field2181) {
         OpenGL.glDisable(3170);
         OpenGL.glDisable(3171);
      }

      this.field9581.method4303();
   }
}
