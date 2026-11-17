@deob.ObfuscatedName("afz")
public class class163 extends class847 {
   public class163(class127 arg0) {
      super(arg0);
   }

   public class163(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afz.g(B)V")
   public void method2267() {
      if (this.field8668.method1860() != class801.field7297) {
         this.field8670 = 1;
      }

      if (this.field8670 != 0 && this.field8670 != 1) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afz.n(I)I")
   protected int method1443() {
      return 1;
   }

   @deob.ObfuscatedName("afz.h(I)Z")
   public boolean method2270() {
      return this.field8668.method1860() == class801.field7297;
   }

   @deob.ObfuscatedName("afz.k(II)I")
   public int method1446(int arg0) {
      if (this.field8668.method1860() == class801.field7297) {
         return arg0 != 0 && this.field8668.field960.method2128() != 1 ? 2 : 1;
      } else {
         return 3;
      }
   }

   @deob.ObfuscatedName("afz.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afz.e(I)I")
   public int method2268() {
      return this.field8670;
   }
}
