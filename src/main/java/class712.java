@deob.ObfuscatedName("ov")
public class class712 {
   @deob.ObfuscatedName("ov.n")
   private int field6558;
   @deob.ObfuscatedName("ov.k")
   private int field6557;
   @deob.ObfuscatedName("ov.d")
   private int field6560;
   @deob.ObfuscatedName("ov.b")
   private int field6559;
   @deob.ObfuscatedName("ov.r")
   public int field6556;
   @deob.ObfuscatedName("ov.p")
   public int field6561;
   @deob.ObfuscatedName("ov.o")
   public int field6562;
   @deob.ObfuscatedName("ov.a")
   public int field6563;
   @deob.ObfuscatedName("ov.x")
   public int field6564;
   @deob.ObfuscatedName("ov.s")
   public int field6565;

   public class712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      this.field6558 = arg0;
      this.field6557 = arg1;
      this.field6560 = arg2;
      this.field6559 = arg3 * arg3;
      this.field6556 = this.field6558 + arg4;
      this.field6561 = this.field6558 + arg5;
      this.field6562 = this.field6557 + arg6;
      this.field6563 = this.field6557 + arg7;
      this.field6564 = this.field6560 + arg8;
      this.field6565 = this.field6560 + arg9;
   }

   @deob.ObfuscatedName("ov.n(IIIIIIIIII)V")
   public void method10475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      this.field6558 = arg0;
      this.field6557 = arg1;
      this.field6560 = arg2;
      this.field6559 = arg3 * arg3;
      this.field6556 = this.field6558 + arg4;
      this.field6561 = this.field6558 + arg5;
      this.field6562 = this.field6557 + arg6;
      this.field6563 = this.field6557 + arg7;
      this.field6564 = this.field6560 + arg8;
      this.field6565 = this.field6560 + arg9;
   }

   @deob.ObfuscatedName("ov.k(III)Z")
   public boolean method10476(int arg0, int arg1, int arg2) {
      if (arg0 >= this.field6556 && arg0 <= this.field6561) {
         if (arg1 >= this.field6562 && arg1 <= this.field6563) {
            if (arg2 >= this.field6564 && arg2 <= this.field6565) {
               int var4 = arg0 - this.field6558;
               int var5 = arg2 - this.field6560;
               return var4 * var4 + var5 * var5 < this.field6559;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
