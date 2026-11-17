@deob.ObfuscatedName("afw")
public class class160 extends class847 {
   @deob.ObfuscatedName("afw.p")
   private boolean field1141 = true;
   @deob.ObfuscatedName("afw.o")
   public boolean field1142 = false;

   public class160(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   public class160(class127 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("afw.g(I)V")
   public void method2235() {
      if (this.field8670 < 0 || this.field8670 > 5) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afw.n(I)I")
   protected int method1443() {
      this.field1142 = true;
      return 2;
   }

   @deob.ObfuscatedName("afw.h(I)Z")
   public boolean method2238() {
      return true;
   }

   @deob.ObfuscatedName("afw.k(II)I")
   public int method1446(int arg0) {
      return arg0 == 3 && !class926.method5940().method9982("jagdx") ? 3 : 2;
   }

   @deob.ObfuscatedName("afw.b(II)V")
   protected void method1447(int arg0) {
      this.field1142 = false;
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afw.e(S)I")
   public int method2236() {
      return this.field8670;
   }

   @deob.ObfuscatedName("afw.z(I)Z")
   public boolean method2234() {
      return this.field1141;
   }

   @deob.ObfuscatedName("afw.m(ZI)V")
   public void method2241(boolean arg0) {
      this.field1141 = arg0;
   }
}
