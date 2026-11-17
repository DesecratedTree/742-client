@deob.ObfuscatedName("afr")
public class class155 extends class847 {
   public class155(class127 arg0) {
      super(arg0);
   }

   public class155(int arg0, class127 arg1) {
      super(arg0, arg1);
   }

   @deob.ObfuscatedName("afr.g(I)V")
   public void method2196() {
      int var1 = this.field8668.field979.method2236();
      if (var1 != 3 && var1 != 5) {
         this.field8670 = 0;
      }

      if (this.field8668.method1861().method14685() < 2) {
         this.field8670 = 0;
      }

      if (this.field8670 != 0 && this.field8670 != 1) {
         this.field8670 = this.method1443();
      }

   }

   @deob.ObfuscatedName("afr.n(I)I")
   protected int method1443() {
      int var1 = this.field8668.field979.method2236();
      return var1 != 3 && var1 != 5 ? 0 : 0;
   }

   @deob.ObfuscatedName("afr.k(II)I")
   public int method1446(int arg0) {
      if (arg0 == 0) {
         return 1;
      } else if (this.field8668.method1861().method14685() < 2) {
         return 3;
      } else {
         int var2 = this.field8668.field979.method2236();
         return var2 != 3 && var2 != 5 ? 3 : 1;
      }
   }

   @deob.ObfuscatedName("afr.b(II)V")
   protected void method1447(int arg0) {
      this.field8670 = arg0;
   }

   @deob.ObfuscatedName("afr.h(I)I")
   public int method2195() {
      return this.field8670;
   }
}
