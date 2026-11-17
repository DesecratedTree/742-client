import jaggl.OpenGL;

@deob.ObfuscatedName("xq")
public class class950 extends class354 {
   @deob.ObfuscatedName("xq.e")
   private final int field9530;

   public class950(class983 arg0, class372 arg1, class405 arg2, int arg3, byte[] arg4, class372 arg5) {
      super(arg0, 3552, arg1, arg2, arg3, false);
      this.field9530 = arg3;
      this.field2264.method16639(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage1Dub(this.field2263, 0, class983.method16696(this.field2270, this.field2273), this.field9530, 0, class983.method16659(arg5), 5121, arg4, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method2448(true);
   }

   @deob.ObfuscatedName("xq.af(Z)V")
   public void method16020(boolean arg0) {
      this.field2264.method16639(this);
      OpenGL.glTexParameteri(this.field2263, 10242, arg0 ? 10497 : 33071);
   }
}
