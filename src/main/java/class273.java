import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@deob.ObfuscatedName("aka")
public final class class273 extends class216 {
   @deob.ObfuscatedName("aka.a")
   private Image field1806;

   public class273(class984 arg0, Canvas arg1, int arg2, int arg3) {
      super(arg0, arg1, arg2, arg3);
      new Rectangle();
      this.method2936();
   }

   @deob.ObfuscatedName("aka.z(I)V")
   protected void method2936() {
      super.method2936();
      DataBufferInt var1 = new DataBufferInt(this.field1448, this.field1448.length);
      DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.field1444, this.field1447), var1, (Point)null);
      this.field1806 = new BufferedImage(var2, var3, false, new Hashtable());
   }

   @deob.ObfuscatedName("aka.w()I")
   public int method542() {
      return this.method543(0, 0);
   }

   @deob.ObfuscatedName("aka.q(II)I")
   public final int method543(int arg0, int arg1) {
      Graphics var3 = this.field1445.getGraphics();
      if (var3 == null) {
         return 0;
      } else {
         var3.drawImage(this.field1806, arg0, arg1, this.field1445);
         return 0;
      }
   }

   @deob.ObfuscatedName("aka.b()V")
   public void method570() {
   }
}
