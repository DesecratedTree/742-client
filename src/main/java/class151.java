@deob.ObfuscatedName("afn")
public class class151 extends class847 {
   public class151(class127 arg0) {
      super(arg0);
   }

   public class151(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afn.g(I)V")
   public void method2161() {
      if (this.field8668.field974.method2234() && !class772.method15719(this.field8668.field974.method2236())) {
         this.field8670 = 0;
      }

      if (this.field8670 < 0 || this.field8670 > 1) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afn.n(I)I")
   protected int method1443() {
      return 0;
   }

   @deob.ObfuscatedName("afn.h(I)Z")
   public boolean method2162() {
      return class772.method15719(this.field8668.field974.method2236());
   }

   @deob.ObfuscatedName("afn.k(II)I")
   public int method1446(int arg0) {
      return !class772.method15719(this.field8668.field974.method2236()) ? 3 : 1;
   }

   @deob.ObfuscatedName("afn.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afn.e(I)I")
   public int method2163() {
      return this.field8670;
   }
}
