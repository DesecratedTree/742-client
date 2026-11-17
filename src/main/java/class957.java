import jaggl.OpenGL;

@deob.ObfuscatedName("xx")
public class class957 extends class344 {
   @deob.ObfuscatedName("xx.p")
   private static final float[] field9577 = new float[4];
   @deob.ObfuscatedName("xx.r")
   private class346 field9573;
   @deob.ObfuscatedName("xx.b")
   private class355 field9575;

   public class957(class983 arg0, class346 arg1) {
      super(arg0);
      this.field9573 = arg1;
      this.field9575 = new class355(arg0, 2);
      this.field9575.method4307(0);
      this.field2169.method16638(1);
      if (this.field9573.field2181) {
         OpenGL.glTexGeni(8194, 9472, 9217);
         OpenGL.glEnable(3170);
      }

      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      this.field2169.method16638(0);
      this.field9575.method4303();
      this.field9575.method4307(1);
      this.field2169.method16638(1);
      if (this.field9573.field2181) {
         OpenGL.glDisable(3170);
      }

      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field2169.method16638(0);
      this.field9575.method4303();
   }

   @deob.ObfuscatedName("xx.n()Z")
   public boolean method4182() {
      return true;
   }

   @deob.ObfuscatedName("xx.k(Z)V")
   public void method4187(boolean arg0) {
      this.field9575.method4305('\u0000');
      if (this.field9573.field2181) {
         this.field2169.method16638(1);
         this.field2169.method16639(this.field9573.field2177);
         this.field2169.method16638(0);
      }

   }

   @deob.ObfuscatedName("xx.d(Z)V")
   public void method4184(boolean arg0) {
   }

   @deob.ObfuscatedName("xx.b()V")
   public void method4196() {
      this.field9575.method4305('\u0001');
      this.field2169.method16638(1);
      this.field2169.method16639((class354)null);
      this.field2169.method16638(0);
   }

   @deob.ObfuscatedName("xx.r(II)V")
   public void method4199(int arg0, int arg1) {
      float var3 = (float)((arg0 & 3) + 1) * -5.0E-4F;
      float var4 = (float)((arg0 >> 3 & 3) + 1) * 5.0E-4F;
      float var5 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
      boolean var6 = (arg0 & 128) != 0;
      this.field2169.method16638(1);
      if (var6) {
         field9577[0] = var5;
         field9577[1] = 0.0F;
         field9577[2] = 0.0F;
         field9577[3] = 0.0F;
      } else {
         field9577[0] = 0.0F;
         field9577[1] = 0.0F;
         field9577[2] = var5;
         field9577[3] = 0.0F;
      }

      OpenGL.glTexGenfv(8192, 9474, field9577, 0);
      field9577[0] = 0.0F;
      field9577[1] = var5;
      field9577[2] = 0.0F;
      field9577[3] = (float)this.field2169.field10374 * var3 % 1.0F;
      OpenGL.glTexGenfv(8193, 9474, field9577, 0);
      if (!this.field9573.field2181) {
         int var7 = (int)((float)this.field2169.field10374 * var4 * 16.0F);
         this.field2169.method16639(this.field9573.field2184[var7 % 16]);
      } else {
         field9577[0] = 0.0F;
         field9577[1] = 0.0F;
         field9577[2] = 0.0F;
         field9577[3] = (float)this.field2169.field10374 * var4 % 1.0F;
         OpenGL.glTexGenfv(8194, 9473, field9577, 0);
      }

      this.field2169.method16638(0);
   }

   @deob.ObfuscatedName("xx.p(Lbw;I)V")
   public void method4183(class354 arg0, int arg1) {
      this.field2169.method16639(arg0);
      this.field2169.method16640(arg1);
   }
}
