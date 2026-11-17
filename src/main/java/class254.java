import java.awt.Point;

@deob.ObfuscatedName("aji")
public class class254 extends class102 {
   @deob.ObfuscatedName("aji.ae")
   private static class254[] field1684 = new class254[0];
   @deob.ObfuscatedName("aji.as")
   private int field1679;
   @deob.ObfuscatedName("aji.am")
   private int field1699;
   @deob.ObfuscatedName("aji.ar")
   private int field1701;
   @deob.ObfuscatedName("aji.ad")
   private int field1704;
   @deob.ObfuscatedName("aji.au")
   private long field1703;

   @deob.ObfuscatedName("xv.ap(II)V")
   public static void method16043(int arg0) {
      Statics.field666 = arg0;
      field1684 = new class254[arg0];
      Statics.field909 = 0;
   }

   @deob.ObfuscatedName("vk.av(IIIII)Laji;")
   public static class254 method15509(int arg0, int arg1, int arg2, int arg3) {
      class254[] var4 = field1684;
      synchronized(field1684) {
         class254 var5;
         if (Statics.field909 == 0) {
            var5 = new class254();
         } else {
            var5 = field1684[--Statics.field909];
         }

         var5.field1704 = arg0;
         var5.field1699 = arg1;
         var5.field1701 = arg2;
         var5.field1679 = arg3;
         var5.field1703 = class431.method2169();
         return var5;
      }
   }

   private class254() {
   }

   @deob.ObfuscatedName("aji.o(I)V")
   public void method1370() {
      class254[] var1 = field1684;
      synchronized(field1684) {
         if (Statics.field909 < Statics.field666 - 1) {
            field1684[++Statics.field909 - 1] = this;
         }

      }
   }

   @deob.ObfuscatedName("aji.ax(I)I")
   public int method3427() {
      return this.field1679;
   }

   @deob.ObfuscatedName("aji.af(I)I")
   public int method3428() {
      return this.field1701;
   }

   @deob.ObfuscatedName("aji.at(I)Z")
   public boolean method3441() {
      switch(this.field1701) {
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 672:
      case 674:
         return true;
      default:
         return false;
      }
   }

   @deob.ObfuscatedName("aji.b(I)I")
   public int method1368() {
      switch(this.field1701) {
      case 160:
      case 512:
         return 0;
      case 163:
      case 166:
      case 169:
      case 173:
      case 515:
      case 518:
      case 521:
      case 525:
         return 2;
      default:
         return 1;
      }
   }

   @deob.ObfuscatedName("aji.n(I)I")
   public int method1365() {
      switch(this.field1701) {
      case 160:
      case 512:
         return -1;
      case 161:
      case 163:
      case 513:
      case 515:
         return 0;
      case 162:
      case 514:
         return 3;
      case 164:
      case 166:
      case 516:
      case 518:
         return 2;
      case 165:
      case 517:
         return 5;
      case 167:
      case 169:
      case 519:
      case 521:
         return 1;
      case 168:
      case 520:
         return 4;
      case 170:
      case 522:
         return 6;
      default:
         return -2;
      }
   }

   @deob.ObfuscatedName("aji.ah(Ljava/awt/Point;B)V")
   public void method3430(Point arg0) {
      this.field1704 -= arg0.x;
      this.field1699 -= arg0.y;
   }

   @deob.ObfuscatedName("aji.r(B)J")
   public long method1377() {
      return this.field1703;
   }

   @deob.ObfuscatedName("aji.k(B)I")
   public int method1375() {
      return this.field1704;
   }

   @deob.ObfuscatedName("aji.d(B)I")
   public int method1367() {
      return this.field1699;
   }
}
