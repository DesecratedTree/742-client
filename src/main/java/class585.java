import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@deob.ObfuscatedName("kc")
public class class585 implements class592 {
   @deob.ObfuscatedName("kc.n")
   private static final byte[] field5339 = new byte[]{31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0};
   @deob.ObfuscatedName("kc.k")
   private static class737 field5332 = new class737(128, 4);
   @deob.ObfuscatedName("kc.d")
   private final class916 field5334;
   @deob.ObfuscatedName("kc.r")
   private final int field5336;
   @deob.ObfuscatedName("kc.p")
   private final int field5335;
   @deob.ObfuscatedName("kc.b")
   private final class479[] field5337;
   @deob.ObfuscatedName("kc.o")
   private class772 field5338;
   @deob.ObfuscatedName("kc.a")
   private boolean field5333;

   @deob.ObfuscatedName("sh.n(B)V")
   public static void method14329() {
      field5332.method10883();
   }

   public class585(class916 arg0, int arg1, int arg2, class469 arg3) {
      this.field5334 = arg0;
      this.field5336 = arg1;
      this.field5335 = arg2;
      this.field5337 = new class479[this.field5334.field9347.length];

      for(int var5 = 0; var5 < this.field5337.length; ++var5) {
         this.field5337[var5] = arg3.method6586(this.field5334.field9347[var5]);
      }

   }

   @deob.ObfuscatedName("kc.o(B)V")
   public void method8233() {
      if (Statics.field8847 != this.field5338) {
         this.field5338 = Statics.field8847;
         this.field5333 = true;
      }

      this.field5338.method2522(3, 0);
      class479[] var1 = this.field5337;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class479 var3 = var1[var2];
         if (var3 != null) {
            var3.method383();
         }
      }

   }

   @deob.ObfuscatedName("kc.d(ZI)V")
   public void method8234(boolean arg0) {
      boolean var2 = true;
      class479[] var3 = this.field5337;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class479 var5 = var3[var4];
         if (var5 != null) {
            var5.method394(var2 || this.field5333);
         }
      }

      this.field5333 = false;
   }

   @deob.ObfuscatedName("kc.a(I)I")
   public int method8235() {
      int var1 = 0;
      class479[] var2 = this.field5337;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class479 var4 = var2[var3];
         if (var4 == null || var4.method384()) {
            ++var1;
         }
      }

      return var1 * 100 / this.field5337.length;
   }

   @deob.ObfuscatedName("kc.p(I)V")
   public void method8236() {
   }

   @deob.ObfuscatedName("kc.x(J)Z")
   public boolean method8237(long arg0) {
      return class431.method2169() >= (long)this.field5336 + arg0;
   }

   @deob.ObfuscatedName("agc.k(Llc;II)Lcy;")
   public static class383 method2314(class612 arg0, int arg1) {
      class383 var2 = (class383)field5332.method10909((long)arg1);
      if (var2 == null) {
         if (Statics.field3677) {
            var2 = Statics.field8847.method7529(class375.method5066(arg0, arg1), true);
         } else {
            var2 = method16064(arg0.method8809(arg1));
         }

         field5332.method10880(var2, (long)arg1);
      }

      return var2;
   }

   @deob.ObfuscatedName("ug.b(I)Z")
   public static boolean method15145() {
      try {
         class951 var0 = new class951();
         byte[] var1 = var0.method16023(field5339);
         method16064(var1);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   @deob.ObfuscatedName("y.r([BI)Lcy;")
   private static class383 method16064(byte[] arg0) {
      if (arg0 == null) {
         throw new RuntimeException("");
      } else {
         while(true) {
            try {
               Image var1 = Toolkit.getDefaultToolkit().createImage(arg0);
               MediaTracker var2 = new MediaTracker(Statics.field6978);
               var2.addImage(var1, 0);
               var2.waitForAll();
               int var3 = var1.getWidth(Statics.field6978);
               int var4 = var1.getHeight(Statics.field6978);
               if (!var2.isErrorAny() && var3 >= 0 && var4 >= 0) {
                  int[] var5 = new int[var3 * var4];
                  PixelGrabber var6 = new PixelGrabber(var1, 0, 0, var3, var4, var5, 0, var3);
                  var6.grabPixels();
                  return Statics.field8847.method11534(var5, 0, var3, var3, var4);
               }

               throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
         }
      }
   }

   @deob.ObfuscatedName("kc.s(I)I")
   public int method8259() {
      return this.field5335;
   }
}
