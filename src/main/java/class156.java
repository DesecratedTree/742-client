@deob.ObfuscatedName("afs")
public class class156 extends class847 {
   public class156(class127 arg0) {
      super(arg0);
   }

   public class156(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afs.g(I)V")
   public void method2202() {
      if (this.field8668.field972.method2268() == 0) {
         this.field8670 = 0;
      }

      if (this.field8670 < 0 || this.field8670 > 2) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afs.n(I)I")
   protected int method1443() {
      return 2;
   }

   @deob.ObfuscatedName("afs.h(I)Z")
   public boolean method2203() {
      return this.field8668.field972.method2268() != 0;
   }

   @deob.ObfuscatedName("afs.k(II)I")
   public int method1446(int arg0) {
      return this.field8668.field972.method2268() == 0 ? 3 : 1;
   }

   @deob.ObfuscatedName("afs.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afs.e(B)I")
   public int method2210() {
      return this.field8670;
   }
}
