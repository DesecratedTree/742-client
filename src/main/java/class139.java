@deob.ObfuscatedName("afb")
public class class139 extends class847 {
   public class139(class127 arg0) {
      super(arg0);
   }

   public class139(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afb.g(B)V")
   public void method2067() {
      if (this.field8670 < 1 || this.field8670 > 3) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afb.n(I)I")
   protected int method1443() {
      return this.field8668.method1861().method14686() ? 3 : 2;
   }

   @deob.ObfuscatedName("afb.k(II)I")
   public int method1446(int arg0) {
      return 1;
   }

   @deob.ObfuscatedName("afb.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afb.h(I)I")
   public int method2066() {
      return this.field8670;
   }
}
