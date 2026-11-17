@deob.ObfuscatedName("afd")
public class class141 extends class847 {
   public class141(class127 arg0) {
      super(arg0);
   }

   public class141(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afd.g(I)V")
   public void method2076() {
      if (this.field8668.method1860() != class801.field7297) {
         this.field8670 = 1;
      }

      if (this.field8670 != 0 && this.field8670 != 1) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afd.n(I)I")
   protected int method1443() {
      return 1;
   }

   @deob.ObfuscatedName("afd.h(S)Z")
   public boolean method2082() {
      return this.field8668.method1860() == class801.field7297;
   }

   @deob.ObfuscatedName("afd.k(II)I")
   public int method1446(int arg0) {
      return this.field8668.method1860() == class801.field7297 ? 1 : 3;
   }

   @deob.ObfuscatedName("afd.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afd.e(I)I")
   public int method2079() {
      return this.field8670;
   }
}
