import jaggl.OpenGL;

@deob.ObfuscatedName("xb")
public class class935 extends class107 implements class352 {
   @deob.ObfuscatedName("xb.l")
   private static final int[] field9469 = new int[1];
   @deob.ObfuscatedName("xb.b")
   private final class983 field9470;
   @deob.ObfuscatedName("xb.p")
   private final int field9465;
   @deob.ObfuscatedName("xb.o")
   private final int field9468;
   @deob.ObfuscatedName("xb.x")
   private final class372 field9467;
   @deob.ObfuscatedName("xb.a")
   private final class405 field9472;
   @deob.ObfuscatedName("xb.r")
   private int field9466;
   @deob.ObfuscatedName("xb.s")
   private final int field9471;

   public class935(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4) {
      this.field9470 = arg0;
      this.field9465 = arg3;
      this.field9468 = arg4;
      this.field9467 = arg1;
      this.field9472 = arg2;
      OpenGL.glGenRenderbuffersEXT(1, field9469, 0);
      this.field9466 = field9469[0];
      OpenGL.glBindRenderbufferEXT(36161, this.field9466);
      OpenGL.glRenderbufferStorageEXT(36161, class983.method16696(this.field9467, this.field9472), this.field9465, this.field9468);
      this.field9471 = this.field9467.field2744 * this.field9468 * this.field9465 * this.field9472.field3055;
   }

   public class935(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5) {
      this.field9470 = arg0;
      this.field9465 = arg3;
      this.field9468 = arg4;
      this.field9467 = arg1;
      this.field9472 = arg2;
      OpenGL.glGenRenderbuffersEXT(1, field9469, 0);
      this.field9466 = field9469[0];
      OpenGL.glBindRenderbufferEXT(36161, this.field9466);
      OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, class983.method16696(this.field9467, this.field9472), this.field9465, this.field9468);
      this.field9471 = this.field9467.field2744 * this.field9468 * this.field9465 * this.field9472.field3055;
   }

   @deob.ObfuscatedName("xb.n()I")
   public int method3939() {
      return this.field9465;
   }

   @deob.ObfuscatedName("xb.k()I")
   public int method3938() {
      return this.field9468;
   }

   @deob.ObfuscatedName("xb.o(I)V")
   public void method4121(int arg0) {
      OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field9466);
   }

   @deob.ObfuscatedName("xb.d()V")
   public void method302() {
      if (this.field9466 > 0) {
         int[] var1 = new int[]{this.field9466};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.field9466 = 0;
      }

   }

   @deob.ObfuscatedName("xb.z()V")
   private void method15973() {
      if (this.field9466 > 0) {
         this.field9470.method16615(this.field9466, this.field9471);
         this.field9466 = 0;
      }

   }

   public void finalize() throws Throwable {
      this.method15973();
      super.finalize();
   }
}
