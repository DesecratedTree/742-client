@deob.ObfuscatedName("g")
public class class466 {
   @deob.ObfuscatedName("g.n")
   public int field3820;
   @deob.ObfuscatedName("g.k")
   private int field3821;

   @deob.ObfuscatedName("g.n(IIII)Z")
   public boolean method6564(int arg0, int arg1, int arg2) {
      int var4 = this.field3821;
      if (this.field3820 == arg0 && this.field3821 == 0) {
         return false;
      } else {
         boolean var5;
         if (this.field3821 != 0) {
            if (this.field3821 > 0 && arg0 > this.field3820) {
               int var6 = this.field3821 * this.field3821 / (arg1 * 2);
               int var7 = this.field3820 + var6;
               if (var7 < arg0 && var7 >= this.field3820) {
                  var5 = true;
               } else {
                  var5 = false;
               }
            } else if (this.field3821 < 0 && arg0 < this.field3820) {
               int var8 = this.field3821 * this.field3821 / (arg1 * 2);
               int var9 = this.field3820 - var8;
               if (var9 > arg0 && var9 <= this.field3820) {
                  var5 = true;
               } else {
                  var5 = false;
               }
            } else {
               var5 = false;
            }
         } else {
            if (arg0 > this.field3820 && arg0 <= this.field3820 + arg1 || arg0 < this.field3820 && arg0 >= this.field3820 - arg1) {
               this.field3820 = arg0;
               return false;
            }

            var5 = true;
         }

         if (var5) {
            if (arg0 > this.field3820) {
               this.field3821 += arg1;
               if (arg2 != 0 && this.field3821 > arg2) {
                  this.field3821 = arg2;
               }
            } else {
               this.field3821 -= arg1;
               if (arg2 != 0 && this.field3821 < -arg2) {
                  this.field3821 = -arg2;
               }
            }

            if (this.field3821 != var4) {
               int var10 = this.field3821 * this.field3821 / (arg1 * 2);
               if (arg0 > this.field3820) {
                  if (this.field3820 + var10 > arg0) {
                     this.field3821 = var4;
                  }
               } else if (arg0 < this.field3820 && this.field3820 - var10 < arg0) {
                  this.field3821 = var4;
               }
            }
         } else if (this.field3821 > 0) {
            this.field3821 -= arg1;
            if (this.field3821 < 0) {
               this.field3821 = 0;
            }
         } else {
            this.field3821 += arg1;
            if (this.field3821 > 0) {
               this.field3821 = 0;
            }
         }

         this.field3820 += this.field3821 + var4 >> 1;
         return var5;
      }
   }

   @deob.ObfuscatedName("g.k(II)V")
   public void method6559(int arg0) {
      this.field3820 = arg0;
      this.field3821 = 0;
   }

   @deob.ObfuscatedName("g.d(I)I")
   public int method6560() {
      return this.field3820 & 16383;
   }

   @deob.ObfuscatedName("g.b(B)V")
   public void method6570() {
      this.field3820 &= 16383;
   }
}
