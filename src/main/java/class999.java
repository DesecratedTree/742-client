@deob.ObfuscatedName("zl")
public class class999 extends class389 {
   @deob.ObfuscatedName("zl.k")
   private final int field10583;
   @deob.ObfuscatedName("zl.d")
   private final int field10581;
   @deob.ObfuscatedName("zl.b")
   private class430 field10582;

   public class999(class124 arg0) {
      super(arg0);
      this.field10583 = arg0.method1587();
      this.field10581 = arg0.method1688();
   }

   @deob.ObfuscatedName("zl.k(I)V")
   public void method74() {
      class677.method6478(this.field10582, this.field10581);
   }

   @deob.ObfuscatedName("zl.b(I)Z")
   public boolean method239() {
      if (this.field10582 == null) {
         this.field10582 = new class430(Statics.field6467, this.field10583);
      }

      return this.field10582.method5954();
   }
}
