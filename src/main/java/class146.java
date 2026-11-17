@deob.ObfuscatedName("afi")
public class class146 extends class847 {
   public class146(class127 arg0) {
      super(arg0);
   }

   public class146(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afi.g(I)V")
   public void method2122() {
      if (this.field8670 != 0 && this.field8668.field960.method2128() != 1) {
         this.field8670 = 0;
      }

      if (this.field8670 != 0 && this.field8668.field963.method2099() == 2) {
         this.field8670 = 0;
      }

      if (this.field8670 < 0 || this.field8670 > 1) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afi.n(I)I")
   protected int method1443() {
      return 1;
   }

   @deob.ObfuscatedName("afi.h(I)Z")
   public boolean method2120() {
      return true;
   }

   @deob.ObfuscatedName("afi.k(II)I")
   public int method1446(int arg0) {
      if (arg0 != 0 && this.field8668.field963.method2099() == 2) {
         return 3;
      } else {
         return arg0 != 0 && this.field8668.field960.method2128() != 1 ? 2 : 1;
      }
   }

   @deob.ObfuscatedName("afi.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afi.e(I)I")
   public int method2119() {
      return this.field8670;
   }
}
