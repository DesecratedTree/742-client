@deob.ObfuscatedName("afj")
public class class147 extends class847 {
   public class147(class127 arg0) {
      super(arg0);
   }

   public class147(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afj.g(B)V")
   public void method2126() {
      if (this.field8668.method1860() != class801.field7297) {
         this.field8670 = 1;
      }

      if (this.field8670 != 0 && this.field8670 != 1) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afj.n(I)I")
   protected int method1443() {
      return 1;
   }

   @deob.ObfuscatedName("afj.h(S)Z")
   public boolean method2135() {
      return this.field8668.method1860() == class801.field7297;
   }

   @deob.ObfuscatedName("afj.k(II)I")
   public int method1446(int arg0) {
      if (this.field8668.method1860() == class801.field7297) {
         if (arg0 == 0) {
            if (this.field8668.field986.method2119() == 1) {
               return 2;
            }

            if (this.field8668.field972.method2268() == 1) {
               return 2;
            }

            if (this.field8668.field975.method2254() > 0) {
               return 2;
            }
         }

         return 1;
      } else {
         return 3;
      }
   }

   @deob.ObfuscatedName("afj.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afj.e(I)I")
   public int method2128() {
      return this.field8670;
   }
}
