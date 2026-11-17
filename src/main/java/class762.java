import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

@deob.ObfuscatedName("qr")
public class class762 {
   @deob.ObfuscatedName("qr.n")
   public static long field7005 = -1L;
   @deob.ObfuscatedName("qr.k")
   public static int field7008 = 0;
   @deob.ObfuscatedName("qr.d")
   public static boolean field7006 = true;
   @deob.ObfuscatedName("qr.b")
   public static final class123 field7009 = new class123();
   @deob.ObfuscatedName("qr.r")
   public static final class113 field7007 = new class113();
   @deob.ObfuscatedName("qr.p")
   public static Queue field7004 = new LinkedList();

   private class762() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("dl.n(I)V")
   public static void method5484() {
      if (Statics.method15426()) {
         class126.method10371(new class749());
      }

   }

   @deob.ObfuscatedName("ti.k(I)V")
   public static void method14679() {
      class126.method9504();
   }

   @deob.ObfuscatedName("iv.b(Lads;I)V")
   public static void method7431(class102 arg0) {
      if (!client.method6612(client.field2410)) {
         arg0.method1370();
      } else {
         field7009.method11250(arg0);
      }
   }

   @deob.ObfuscatedName("adk.r(B)V")
   public static void method1314() {
      Queue var0 = field7004;
      synchronized(field7004) {
         Point var1;
         if (Statics.field5796.isShowing()) {
            var1 = Statics.field5796.getLocationOnScreen();
         } else {
            var1 = null;
         }

         while(true) {
            while(true) {
               class254 var2 = (class254)field7004.poll();
               if (var2 == null) {
                  return;
               }

               if (var1 != null && Statics.field5796.isShowing() && Statics.field6857) {
                  var2.method3430(var1);
                  if (!var2.method3441() && var2.method1375() < Statics.field6104 && var2.method1367() < Statics.field6354 && var2.method1375() >= 0 && var2.method1367() >= 0) {
                     int var3 = var2.method1365();
                     if (var2.method1365() == -1) {
                        field7007.method11250(var2);
                     } else if (class102.method5689(var3)) {
                        field7007.method1479(var2);
                     }
                  }
               } else {
                  var2.method1370();
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("qe.p(I)V")
   public static void method11097() {
      Queue var0 = field7004;
      synchronized(field7004) {
         while(true) {
            class254 var1 = (class254)field7004.poll();
            if (var1 == null) {
               return;
            }

            var1.method1370();
         }
      }
   }
}
