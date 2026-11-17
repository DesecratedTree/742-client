import jaggl.OpenGL;

@deob.ObfuscatedName("bx")
public class class355 {
   @deob.ObfuscatedName("bx.n")
   private final int field2278;

   public class355(class983 arg0, int arg1) {
      this.field2278 = OpenGL.glGenLists(arg1);
   }

   @deob.ObfuscatedName("bx.n(I)V")
   public void method4307(int arg0) {
      OpenGL.glNewList(this.field2278 + arg0, 4864);
   }

   @deob.ObfuscatedName("bx.k()V")
   public void method4303() {
      OpenGL.glEndList();
   }

   @deob.ObfuscatedName("bx.d(C)V")
   public void method4305(char arg0) {
      OpenGL.glCallList(this.field2278 + arg0);
   }
}
