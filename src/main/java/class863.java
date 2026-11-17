@deob.ObfuscatedName("uk")
public class class863 {
   @deob.ObfuscatedName("uk.n")
   private int field8808 = 0;
   @deob.ObfuscatedName("uk.k")
   public int field8803 = -1;
   @deob.ObfuscatedName("uk.d")
   public int field8804 = 512;
   @deob.ObfuscatedName("uk.b")
   public boolean field8805 = true;
   @deob.ObfuscatedName("uk.r")
   public boolean field8806 = true;
   @deob.ObfuscatedName("uk.p")
   public int field8802;
   @deob.ObfuscatedName("uk.a")
   public int field8807;
   @deob.ObfuscatedName("uk.o")
   public int field8809;
   @deob.ObfuscatedName("uk.x")
   public int field8810;

   @deob.ObfuscatedName("uk.n(Laen;I)V")
   public void method15196(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15198(arg0, var2);
      }
   }

   @deob.ObfuscatedName("uk.k(Laen;II)V")
   private void method15198(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field8808 = arg0.method1589();
         this.method15201(this.field8808);
      } else if (arg1 == 2) {
         this.field8803 = arg0.method1587();
         if (this.field8803 == 65535) {
            this.field8803 = -1;
         }
      } else if (arg1 == 3) {
         this.field8804 = arg0.method1587() << 2;
      } else if (arg1 == 4) {
         this.field8805 = false;
      } else if (arg1 == 5) {
         this.field8806 = false;
      }

   }

   @deob.ObfuscatedName("uk.d(IB)V")
   private void method15201(int arg0) {
      double var2 = (double)(arg0 >> 16 & 255) / 256.0D;
      double var4 = (double)(arg0 >> 8 & 255) / 256.0D;
      double var6 = (double)(arg0 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      double var18 = var12 / 6.0D;
      this.field8809 = (int)(var14 * 256.0D);
      this.field8807 = (int)(var16 * 256.0D);
      if (this.field8809 < 0) {
         this.field8809 = 0;
      } else if (this.field8809 > 255) {
         this.field8809 = 255;
      }

      if (this.field8807 < 0) {
         this.field8807 = 0;
      } else if (this.field8807 > 255) {
         this.field8807 = 255;
      }

      if (var16 > 0.5D) {
         this.field8810 = (int)((1.0D - var16) * var14 * 512.0D);
      } else {
         this.field8810 = (int)(var14 * var16 * 512.0D);
      }

      if (this.field8810 < 1) {
         this.field8810 = 1;
      }

      this.field8802 = (int)((double)this.field8810 * var18);
   }
}
