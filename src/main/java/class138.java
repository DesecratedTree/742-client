@deob.ObfuscatedName("afa")
public class class138 extends class847 {
   public class138(class127 arg0) {
      super(arg0);
      class764.method14492(this.field8670);
   }

   public class138(int arg0, class127 arg1) {
      super(arg0, arg1);
      class764.method14492(this.field8670);
   }

   @deob.ObfuscatedName("afa.g(I)V")
   public void method2054() {
      if (this.field8668.method1861().method14684() < 245) {
         this.field8670 = 0;
      }

      if (this.field8670 < 0 || this.field8670 > 2) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afa.n(I)I")
   protected int method1443() {
      return this.field8668.method1861().method14684() < 245 ? 0 : 2;
   }

   @deob.ObfuscatedName("afa.h(I)Z")
   public boolean method2060() {
      return this.field8668.method1861().method14684() >= 245;
   }

   @deob.ObfuscatedName("afa.k(II)I")
   public int method1446(int arg0) {
      return this.field8668.method1861().method14684() < 245 ? 3 : 1;
   }

   @deob.ObfuscatedName("afa.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
      class764.method14492(this.field8670);
   }

   @deob.ObfuscatedName("afa.e(I)I")
   public int method2055() {
      return this.field8670;
   }
}
