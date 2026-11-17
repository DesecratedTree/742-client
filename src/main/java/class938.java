import jaggl.OpenGL;

@deob.ObfuscatedName("xe")
public class class938 extends class344 {
   @deob.ObfuscatedName("xe.r")
   private boolean field9482 = false;
   @deob.ObfuscatedName("xe.b")
   private class355 field9483;

   public class938(class983 arg0) {
      super(arg0);
      if (arg0.field10378) {
         this.field9483 = new class355(arg0, 2);
         this.field9483.method4307(0);
         this.field2169.method16638(1);
         this.field2169.method16642(34165, 7681);
         this.field2169.method16643(2, 34168, 770);
         this.field2169.method16616(0, 34167, 770);
         OpenGL.glTexGeni(8192, 9472, 34066);
         OpenGL.glTexGeni(8193, 9472, 34066);
         OpenGL.glTexGeni(8194, 9472, 34066);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         OpenGL.glEnable(3170);
         this.field2169.method16638(0);
         this.field9483.method4303();
         this.field9483.method4307(1);
         this.field2169.method16638(1);
         this.field2169.method16642(8448, 8448);
         this.field2169.method16643(2, 34166, 770);
         this.field2169.method16616(0, 5890, 770);
         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         OpenGL.glDisable(3170);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         this.field2169.method16638(0);
         this.field9483.method4303();
      }

   }

   @deob.ObfuscatedName("xe.n()Z")
   public boolean method4182() {
      return true;
   }

   @deob.ObfuscatedName("xe.k(Z)V")
   public void method4187(boolean arg0) {
      class936 var2 = this.field2169.method16626();
      if (this.field9483 != null && var2 != null && arg0) {
         this.field9483.method4305('\u0000');
         this.field2169.method16638(1);
         this.field2169.method16639(var2);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.field2169.field10289.method8413(this.field2169.field10306), 0);
         OpenGL.glScalef(-1.0F, -1.0F, -1.0F);
         OpenGL.glMatrixMode(5888);
         this.field2169.method16638(0);
         this.field9482 = true;
      } else {
         this.field2169.method16616(0, 34168, 770);
      }

   }

   @deob.ObfuscatedName("xe.d(Z)V")
   public void method4184(boolean arg0) {
      this.field2169.method16642(8448, 7681);
   }

   @deob.ObfuscatedName("xe.b()V")
   public void method4196() {
      if (this.field9482) {
         this.field9483.method4305('\u0001');
         this.field2169.method16638(1);
         this.field2169.method16639((class354)null);
         this.field2169.method16638(0);
      } else {
         this.field2169.method16616(0, 5890, 770);
      }

      this.field2169.method16642(8448, 8448);
      this.field9482 = false;
   }

   @deob.ObfuscatedName("xe.r(II)V")
   public void method4199(int arg0, int arg1) {
   }

   @deob.ObfuscatedName("xe.p(Lbw;I)V")
   public void method4183(class354 arg0, int arg1) {
      this.field2169.method16639(arg0);
      this.field2169.method16640(arg1);
   }
}
