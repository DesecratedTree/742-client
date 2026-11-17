import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

@deob.ObfuscatedName("ahs")
public class class210 extends class963 {
   @deob.ObfuscatedName("ahs.o")
   private boolean field1379;
   @deob.ObfuscatedName("ahs.n")
   private final class983 field1375;
   @deob.ObfuscatedName("ahs.k")
   private final Canvas field1380;
   @deob.ObfuscatedName("ahs.d")
   private final OpenGL field1376;
   @deob.ObfuscatedName("ahs.b")
   private final long field1377;
   @deob.ObfuscatedName("ahs.r")
   private int field1374;
   @deob.ObfuscatedName("ahs.p")
   private int field1378;

   public class210(class983 arg0, Canvas arg1, long arg2) {
      this.field1379 = false;
      this.field1375 = arg0;
      this.field1380 = arg1;
      this.field1376 = arg0.field10251;
      this.field1377 = arg2;
      this.method2858();
   }

   public class210(class983 arg0, Canvas arg1) {
      this(arg0, arg1, arg0.field10251.prepareSurface(arg1));
   }

   @deob.ObfuscatedName("ahs.k()I")
   public int method566() {
      return this.field1374;
   }

   @deob.ObfuscatedName("ahs.d()I")
   public int method559() {
      return this.field1378;
   }

   @deob.ObfuscatedName("ahs.j(II)V")
   public void method544(int arg0, int arg1) {
      if (this.field1379) {
         throw new IllegalStateException();
      } else {
         this.field1376.surfaceResized(this.field1377);
         this.method2858();
         if (this == this.field1375.method11517()) {
            this.field1375.method16599();
         }

      }
   }

   @deob.ObfuscatedName("ahs.n()V")
   private void method2858() {
      Dimension var1 = this.field1380.getSize();
      this.field1378 = var1.height;
      this.field1374 = var1.width;
   }

   @deob.ObfuscatedName("ahs.w()I")
   public int method542() {
      if (this.field1379) {
         throw new IllegalStateException();
      } else {
         this.field1376.swapBuffers(this.field1377);
         return 0;
      }
   }

   @deob.ObfuscatedName("ahs.q(II)I")
   public int method543(int arg0, int arg1) {
      return 0;
   }

   @deob.ObfuscatedName("ahs.r()Z")
   public boolean method540() {
      if (this.field1379) {
         throw new IllegalStateException();
      } else {
         this.field1376.setSurface(this.field1377);
         this.field1375.method16598();
         return true;
      }
   }

   @deob.ObfuscatedName("ahs.p()Z")
   public boolean method541() {
      return true;
   }

   @deob.ObfuscatedName("ahs.b()V")
   public void method570() {
      if (this.field1379) {
         throw new IllegalStateException();
      } else {
         this.field1376.releaseSurface(this.field1380, this.field1377);
         this.field1379 = true;
      }
   }
}
