import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

@deob.ObfuscatedName("nb")
public class class665 {
   @deob.ObfuscatedName("nb.n")
   private Robot field6079 = new Robot();

   public class665() throws Exception {
   }

   private void movemouse(int arg0, int arg1) {
      this.field6079.mouseMove(arg0, arg1);
   }

   public void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
      if (arg1 != null) {
         BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
         var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
         arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, (String)null));
      } else {
         arg0.setCursor((Cursor)null);
      }

   }
}
