@deob.ObfuscatedName("afq")
public class class154 extends class847 {
   public class154(class127 arg0) {
      super(arg0);
   }

   public class154(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afq.g(I)V")
   public void method2188() {
      if (this.field8670 < 0 || this.field8670 > 1) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afq.n(I)I")
   protected int method1443() {
      return 1;
   }

   @deob.ObfuscatedName("afq.h(I)Z")
   public boolean method2187() {
      return class772.method15719(this.field8668.field974.method2236());
   }

   @deob.ObfuscatedName("afq.k(II)I")
   public int method1446(int arg0) {
      return !class772.method15719(this.field8668.field974.method2236()) ? 3 : 1;
   }

   @deob.ObfuscatedName("afq.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afq.e(I)I")
   public int method2189() {
      return this.field8670;
   }
}
