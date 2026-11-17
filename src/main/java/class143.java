@deob.ObfuscatedName("aff")
public class class143 extends class847 {
   public class143(class127 arg0) {
      super(arg0);
   }

   public class143(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("aff.g(B)V")
   public void method2094() {
      int var1 = this.field8668.method1861().method14684();
      if (var1 < 245) {
         this.field8670 = class441.field3655.field3657;
      }

      if (class441.field3658.field3657 == this.field8670 && var1 < 500) {
         this.field8670 = class441.field3656.field3657;
      }

      if (this.field8670 < class441.field3655.field3657 || this.field8670 > class441.field3659.field3657) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("aff.n(I)I")
   protected int method1443() {
      return class441.field3655.field3657;
   }

   @deob.ObfuscatedName("aff.h(I)Z")
   public boolean method2093() {
      int var1 = this.field8668.method1861().method14684();
      return var1 >= 245;
   }

   @deob.ObfuscatedName("aff.k(II)I")
   public int method1446(int arg0) {
      int var2 = this.field8668.method1861().method14684();
      if (var2 < 245) {
         return 3;
      } else {
         return class441.field3658.field3657 == arg0 && var2 < 500 ? 3 : 1;
      }
   }

   @deob.ObfuscatedName("aff.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("aff.e(I)I")
   public int method2096() {
      return this.field8670;
   }
}
