import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

@deob.ObfuscatedName("akh")
public class class280 extends class212 {
   @deob.ObfuscatedName("akh.k")
   private final Canvas field1833;
   @deob.ObfuscatedName("akh.d")
   private final OpenGL field1830;
   @deob.ObfuscatedName("akh.b")
   private final long field1832;
   @deob.ObfuscatedName("akh.r")
   private int field1831;
   @deob.ObfuscatedName("akh.p")
   private int field1834;

   public class280(class214 arg0, Canvas arg1) {
      this(arg0, arg1, arg0.field1439.prepareSurface(arg1));
   }

   public class280(class214 arg0, Canvas arg1, long arg2) {
      super(arg0);
      this.field1833 = arg1;
      this.field1830 = arg0.field1439;
      this.field1832 = arg2;
      this.method3622();
   }

   @deob.ObfuscatedName("akh.k()I")
   public int method566() {
      return this.field1831;
   }

   @deob.ObfuscatedName("akh.d()I")
   public int method559() {
      return this.field1834;
   }

   @deob.ObfuscatedName("akh.j(II)V")
   public void method544(int arg0, int arg1) {
      this.field1830.surfaceResized(this.field1832);
      this.method3622();
      super.method544(arg0, arg1);
   }

   @deob.ObfuscatedName("akh.n()V")
   private void method3622() {
      Dimension var1 = this.field1833.getSize();
      this.field1834 = var1.height;
      this.field1831 = var1.width;
   }

   @deob.ObfuscatedName("akh.w()I")
   public int method542() {
      this.field1830.swapBuffers(this.field1832);
      return 0;
   }

   @deob.ObfuscatedName("akh.q(II)I")
   public int method543(int arg0, int arg1) {
      return 0;
   }

   @deob.ObfuscatedName("akh.r()Z")
   public boolean method540() {
      return this.field1830.setSurface(this.field1832) && super.method540();
   }

   @deob.ObfuscatedName("akh.p()Z")
   public boolean method541() {
      return true;
   }

   @deob.ObfuscatedName("akh.b()V")
   public void method570() {
      this.field1830.releaseSurface(this.field1833, this.field1832);
   }
}
