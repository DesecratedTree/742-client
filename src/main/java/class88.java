@deob.ObfuscatedName("ade")
public class class88 extends class674 {
   @deob.ObfuscatedName("ade.b")
   private static class88[] field672 = new class88[0];
   @deob.ObfuscatedName("ade.p")
   public int field671;
   @deob.ObfuscatedName("ade.o")
   public int field670;
   @deob.ObfuscatedName("ade.a")
   public int field669;
   @deob.ObfuscatedName("ade.x")
   public int field667;

   @deob.ObfuscatedName("wc.n(IIIIB)Lade;")
   public static class88 method15740(int arg0, int arg1, int arg2, int arg3) {
      class88[] var4 = field672;
      synchronized(field672) {
         if (Statics.field668 == 0) {
            return new class88(arg0, arg1, arg2, arg3);
         } else {
            field672[--Statics.field668].method1231(arg0, arg1, arg2, arg3);
            return field672[Statics.field668];
         }
      }
   }

   public class88(int arg0, int arg1, int arg2, int arg3) {
      this.field671 = arg0;
      this.field670 = arg1;
      this.field669 = arg2;
      this.field667 = arg3;
   }

   @deob.ObfuscatedName("ade.k(IIIII)V")
   private void method1231(int arg0, int arg1, int arg2, int arg3) {
      this.field671 = arg0;
      this.field670 = arg1;
      this.field669 = arg2;
      this.field667 = arg3;
   }

   @deob.ObfuscatedName("ade.d(B)Lkb;")
   public class584 method1232() {
      return new class584((float)this.field670, (float)this.field669, (float)this.field667);
   }

   public String toString() {
      return "Level: " + this.field671 + " Coord: " + this.field670 + "," + this.field669 + "," + this.field667 + " Coord Split: " + (this.field670 >> 15) + "," + (this.field667 >> 15) + "," + (this.field670 >> 9 & 63) + "," + (this.field667 >> 9 & 63) + "," + (this.field670 & 511) + "," + (this.field667 & 511);
   }
}
