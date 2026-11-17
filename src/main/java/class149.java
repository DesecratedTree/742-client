@deob.ObfuscatedName("afl")
public class class149 extends class847 {
   public class149(class127 arg0) {
      super(arg0);
   }

   public class149(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afl.g(I)V")
   public void method2147() {
      if (this.field8668.method1860() == class801.field7298) {
         this.field8670 = 2;
      }

      if (this.field8670 < 0 || this.field8670 > 2) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afl.n(I)I")
   protected int method1443() {
      return 1;
   }

   @deob.ObfuscatedName("afl.k(II)I")
   public int method1446(int arg0) {
      return 1;
   }

   @deob.ObfuscatedName("afl.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afl.h(I)I")
   public int method2148() {
      return this.field8670;
   }
}
