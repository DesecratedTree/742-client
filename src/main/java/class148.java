@deob.ObfuscatedName("afk")
public class class148 extends class847 {
   public class148(class127 arg0) {
      super(arg0);
   }

   public class148(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afk.g(I)V")
   public void method2138() {
      if (this.field8670 < 0 || this.field8670 > 2) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afk.n(I)I")
   protected int method1443() {
      return this.field8668.field974.method2234() && class772.method10011(this.field8668.field974.method2236()) ? 1 : 0;
   }

   @deob.ObfuscatedName("afk.h(B)Z")
   public boolean method2136() {
      return true;
   }

   @deob.ObfuscatedName("afk.k(II)I")
   public int method1446(int arg0) {
      return 1;
   }

   @deob.ObfuscatedName("afk.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afk.e(I)I")
   public int method2137() {
      return this.field8670;
   }
}
