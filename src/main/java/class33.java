import jaggl.OpenGL;

@deob.ObfuscatedName("abd")
public class class33 extends class619 implements class467 {
   @deob.ObfuscatedName("abd.h")
   private final int field259;
   @deob.ObfuscatedName("abd.e")
   private final int field260;
   @deob.ObfuscatedName("abd.z")
   private final int field258;

   public class33(class214 arg0, class372 arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
      super(arg0, 32879, arg1, class405.field3052, arg2 * arg3 * arg4, arg5);
      this.field259 = arg2;
      this.field260 = arg3;
      this.field258 = arg4;
      this.field5576.method16470(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(this.field5580, 0, class214.method2903(this.field5574, this.field5581), this.field259, this.field260, this.field258, 0, class214.method2900(this.field5574), 5121, arg6, 0);
      OpenGL.glPixelStorei(3317, 4);
      if (arg5) {
         this.method501();
      }

   }

   @deob.ObfuscatedName("abd.aq()V")
   public void method502() {
      super.method502();
   }

   @deob.ObfuscatedName("abd.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }

   @deob.ObfuscatedName("abd.d()V")
   public void method302() {
      super.method302();
   }
}
