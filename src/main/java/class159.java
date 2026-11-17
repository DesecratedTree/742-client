@deob.ObfuscatedName("afv")
public class class159 extends class847 {
   public class159(class127 arg0) {
      super(arg0);
   }

   public class159(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afv.g(B)V")
   public void method2224() {
      if (this.field8668.field974.method2234() && !class772.method15719(this.field8668.field974.method2236())) {
         this.field8670 = 0;
      }

      if (this.field8670 < 0 || this.field8670 > 2) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afv.n(I)I")
   protected int method1443() {
      return 0;
   }

   @deob.ObfuscatedName("afv.h(I)Z")
   public boolean method2227() {
      return class772.method15719(this.field8668.field974.method2236());
   }

   @deob.ObfuscatedName("afv.k(II)I")
   public int method1446(int arg0) {
      return !class772.method15719(this.field8668.field974.method2236()) ? 3 : 1;
   }

   @deob.ObfuscatedName("afv.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afv.e(B)I")
   public int method2226() {
      return this.field8670;
   }
}
