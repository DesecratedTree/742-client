@deob.ObfuscatedName("afc")
public class class140 extends class847 {
   public class140(class127 arg0) {
      super(arg0);
   }

   public class140(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afc.g(I)V")
   public void method2070() {
      if (this.field8668.field963.method2099() == 2 && this.field8670 == 2) {
         this.field8670 = 1;
      }

      if (this.field8670 < 0 || this.field8670 > 2) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afc.n(I)I")
   protected int method1443() {
      return 2;
   }

   @deob.ObfuscatedName("afc.k(II)I")
   public int method1446(int arg0) {
      return 1;
   }

   @deob.ObfuscatedName("afc.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afc.h(I)I")
   public int method2071() {
      return this.field8670;
   }
}
