import jaggl.OpenGL;

@deob.ObfuscatedName("xo")
public class class948 extends class354 {
   @deob.ObfuscatedName("xo.e")
   public final int field9526;
   @deob.ObfuscatedName("xo.z")
   public final int field9527;
   @deob.ObfuscatedName("xo.m")
   public final int field9528;

   public class948(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5) {
      super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
      this.field9526 = arg3;
      this.field9527 = arg4;
      this.field9528 = arg5;
      this.field2264.method16639(this);
      OpenGL.glTexImage3Dub(this.field2263, 0, class983.method16696(this.field2270, this.field2273), this.field9526, this.field9527, this.field9528, 0, class983.method16659(this.field2270), 5121, (byte[])null, 0);
      this.method2448(true);
   }

   public class948(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5, byte[] arg6, class372 arg7) {
      super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
      this.field9526 = arg3;
      this.field9527 = arg4;
      this.field9528 = arg5;
      this.field2264.method16639(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(this.field2263, 0, class983.method16696(this.field2270, this.field2273), this.field9526, this.field9527, this.field9528, 0, class983.method16659(arg7), 5121, arg6, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method2448(true);
   }

   @deob.ObfuscatedName("xo.af(IIIIIII)V")
   public void method16017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field2264.method16639(this);
      OpenGL.glCopyTexSubImage3D(this.field2263, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
      OpenGL.glFlush();
   }
}
