import java.awt.Canvas;

@deob.ObfuscatedName("ai")
public class class218 {
   private class218() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("wz.k(B)I")
   public static int method15958() {
      Canvas var0 = new Canvas();
      var0.setSize(100, 100);
      class772 var1 = class772.method10665(0, var0, (class637)null, (class612)null, 0);
      long var2 = class431.method2169();

      for(int var4 = 0; var4 < 10000; ++var4) {
         var1.method7475(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
      }

      int var5 = (int)(class431.method2169() - var2);
      var1.method11524(0, 0, 100, 100, -16777216);
      var1.method11494();
      return var5;
   }
}
