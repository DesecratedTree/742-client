@deob.ObfuscatedName("yf")
public class class966 extends class407 {
   @deob.ObfuscatedName("yf.n")
   private int field9643;
   @deob.ObfuscatedName("yf.k")
   private int field9642;
   @deob.ObfuscatedName("yf.o")
   private int[] field9648;
   @deob.ObfuscatedName("yf.d")
   private int field9644;
   @deob.ObfuscatedName("yf.b")
   private int field9645;
   @deob.ObfuscatedName("yf.r")
   private int field9646;
   @deob.ObfuscatedName("yf.p")
   private int field9647;
   @deob.ObfuscatedName("yf.a")
   private boolean field9649;

   public class966(int arg0, int arg1, int[] arg2) {
      this.field9643 = arg0;
      this.field9642 = arg1;
      this.field9648 = arg2;
   }

   @deob.ObfuscatedName("yf.n()Z")
   public boolean method5562() {
      return false;
   }

   @deob.ObfuscatedName("yf.k()Z")
   public boolean method5603() {
      return this.field9649;
   }

   @deob.ObfuscatedName("yf.d()I")
   public int method5551() {
      return this.field9643;
   }

   @deob.ObfuscatedName("yf.b()I")
   public int method5554() {
      return this.field9642;
   }

   @deob.ObfuscatedName("yf.s()I")
   public int method5547() {
      return this.field9644 + this.field9643 + this.field9645;
   }

   @deob.ObfuscatedName("yf.l()I")
   public int method5548() {
      return this.field9646 + this.field9642 + this.field9647;
   }

   @deob.ObfuscatedName("yf.r()I")
   public int method5542() {
      return this.field9644;
   }

   @deob.ObfuscatedName("yf.p()I")
   public int method5543() {
      return this.field9645;
   }

   @deob.ObfuscatedName("yf.o()I")
   public int method5544() {
      return this.field9646;
   }

   @deob.ObfuscatedName("yf.a()I")
   public int method5545() {
      return this.field9647;
   }

   @deob.ObfuscatedName("yf.x()V")
   public void method5546() {
      this.field9647 = 0;
      this.field9646 = 0;
      this.field9645 = 0;
      this.field9644 = 0;
   }

   @deob.ObfuscatedName("yf.u(I)V")
   public void method5549(int arg0) {
      int var2 = this.method5547();
      int var3 = this.method5548();
      if (this.field9643 != var2 || this.field9642 != var3) {
         int var4 = arg0;
         if (arg0 > this.field9644) {
            var4 = this.field9644;
         }

         int var5 = arg0;
         if (this.field9644 + arg0 + this.field9643 > var2) {
            var5 = var2 - this.field9644 - this.field9643;
         }

         int var6 = arg0;
         if (arg0 > this.field9646) {
            var6 = this.field9646;
         }

         int var7 = arg0;
         if (this.field9646 + arg0 + this.field9642 > var3) {
            var7 = var3 - this.field9646 - this.field9642;
         }

         int var8 = this.field9643 + var4 + var5;
         int var9 = this.field9642 + var6 + var7;
         int[] var10 = new int[var8 * var9];

         for(int var11 = 0; var11 < this.field9642; ++var11) {
            int var12 = this.field9643 * var11;
            int var13 = (var6 + var11) * var8 + var4;

            for(int var14 = 0; var14 < this.field9643; ++var14) {
               var10[var13++] = this.field9648[var12++];
            }
         }

         this.field9644 -= var4;
         this.field9646 -= var6;
         this.field9645 -= var5;
         this.field9647 -= var7;
         this.field9643 = var8;
         this.field9642 = var9;
         this.field9648 = var10;
      }
   }

   @deob.ObfuscatedName("yf.v(I)V")
   public void method5550(int arg0) {
      int var2 = 0;
      int[] var3 = new int[this.field9643 * this.field9642];

      for(int var4 = 0; var4 < this.field9642; ++var4) {
         for(int var5 = 0; var5 < this.field9643; ++var5) {
            int var6 = this.field9648[var2];
            if ((var6 & -16777216) == 0) {
               if (var5 > 0 && (this.field9648[var2 - 1] & -16777216) != 0) {
                  var6 = arg0;
               } else if (var4 > 0 && (this.field9648[var2 - this.field9643] & -16777216) != 0) {
                  var6 = arg0;
               } else if (var5 < this.field9643 - 1 && (this.field9648[var2 + 1] & -16777216) != 0) {
                  var6 = arg0;
               } else if (var4 < this.field9642 - 1 && (this.field9648[this.field9643 + var2] & -16777216) != 0) {
                  var6 = arg0;
               }
            }

            var3[var2++] = var6;
         }
      }

      this.field9648 = var3;
   }

   @deob.ObfuscatedName("yf.g(I)V")
   public void method5539(int arg0) {
      for(int var2 = this.field9642 - 1; var2 > 0; --var2) {
         int var3 = this.field9643 * var2;

         for(int var4 = this.field9643 - 1; var4 > 0; --var4) {
            if ((this.field9648[var3 + var4] & -16777216) == 0 && (this.field9648[var3 + var4 - 1 - this.field9643] & -16777216) != 0) {
               this.field9648[var3 + var4] = arg0;
            }
         }
      }

   }

   @deob.ObfuscatedName("yf.h()V")
   public void method5540() {
      int[] var1 = this.field9648;

      for(int var2 = this.field9642 - 1; var2 >= 0; --var2) {
         int var3 = this.field9643 * var2;
         int var4 = (var2 + 1) * this.field9643;

         while(var3 < var4) {
            --var4;
            int var5 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var5;
            ++var3;
         }
      }

      int var6 = this.field9644;
      this.field9644 = this.field9645;
      this.field9645 = var6;
   }

   @deob.ObfuscatedName("yf.e()V")
   public void method5570() {
      int[] var1 = this.field9648;

      for(int var2 = (this.field9642 >> 1) - 1; var2 >= 0; --var2) {
         int var3 = this.field9643 * var2;
         int var4 = (this.field9642 - var2 - 1) * this.field9643;

         for(int var5 = -this.field9643; var5 < 0; ++var5) {
            int var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            ++var3;
            ++var4;
         }
      }

      int var7 = this.field9646;
      this.field9646 = this.field9647;
      this.field9647 = var7;
   }

   @deob.ObfuscatedName("yf.z()V")
   public void method5612() {
      int[] var1 = new int[this.field9643 * this.field9642];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field9643; ++var3) {
         for(int var4 = this.field9642 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field9648[this.field9643 * var4 + var3];
         }
      }

      this.field9648 = var1;
      int var5 = this.field9646;
      this.field9646 = this.field9644;
      this.field9644 = this.field9647;
      this.field9647 = this.field9645;
      this.field9645 = this.field9646;
      int var6 = this.field9642;
      this.field9642 = this.field9643;
      this.field9643 = var6;
   }

   @deob.ObfuscatedName("yf.m(Z)[I")
   public int[] method5555(boolean arg0) {
      if (!arg0 || this.method5547() == this.field9643 && this.method5548() == this.field9642) {
         return this.field9648;
      } else {
         int var2 = this.method5547();
         int[] var3 = new int[var2 * this.method5548()];

         for(int var4 = 0; var4 < this.field9642; ++var4) {
            int var5 = this.field9643 * var4;
            int var6 = (this.field9646 + var4) * var2 + this.field9644;

            for(int var7 = 0; var7 < this.field9643; ++var7) {
               var3[var6++] = this.field9648[var5];
               ++var5;
            }
         }

         return var3;
      }
   }

   @deob.ObfuscatedName("yf.i(III)V")
   public void method5598(int arg0, int arg1, int arg2) {
      for(int var4 = 1; var4 < this.field9648.length; ++var4) {
         int var5 = this.field9648[var4] >> 16 & 255;
         int var6 = arg0 + var5;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field9648[var4] >> 8 & 255;
         int var8 = arg1 + var7;
         if (var8 < 0) {
            var8 = 0;
         } else if (var8 > 255) {
            var8 = 255;
         }

         int var9 = this.field9648[var4] >> 0 & 255;
         int var10 = arg2 + var9;
         if (var10 < 0) {
            var10 = 0;
         } else if (var10 > 255) {
            var10 = 255;
         }

         this.field9648[var4] = this.field9648[var4] & -16777216 | var6 << 16 | var8 << 8 | var10;
      }

   }

   @deob.ObfuscatedName("yf.t(II)I")
   public int method5557(int arg0, int arg1) {
      return this.field9648[this.field9643 * arg1 + arg0];
   }
}
