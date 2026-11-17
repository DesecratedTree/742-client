@deob.ObfuscatedName("gy")
public class class491 implements class479 {
   @deob.ObfuscatedName("gy.k")
   private final class612 field3960;
   @deob.ObfuscatedName("gy.n")
   private final class543 field3959;
   @deob.ObfuscatedName("gy.d")
   private class383 field3961;

   public class491(class612 arg0, class543 arg1) {
      this.field3960 = arg0;
      this.field3959 = arg1;
   }

   @deob.ObfuscatedName("gy.n(I)V")
   public void method383() {
      this.field3961 = class585.method2314(this.field3960, this.field3959.field4349);
   }

   @deob.ObfuscatedName("gy.k(ZI)V")
   public void method394(boolean arg0) {
      if (arg0) {
         int var2 = Statics.field6104 > client.field2555 ? Statics.field6104 : client.field2555;
         int var3 = Statics.field6354 > client.field2556 ? Statics.field6354 : client.field2556;
         int var4 = this.field3961.method5259();
         int var5 = this.field3961.method5213();
         int var6 = 0;
         int var7 = var2;
         int var8 = var2 * var5 / var4;
         int var9 = (var3 - var8) / 2;
         if (var8 > var3) {
            var9 = 0;
            var8 = var3;
            var7 = var3 * var4 / var5;
            var6 = (var2 - var7) / 2;
         }

         this.field3961.method5222(var6, var9, var7, var8);
      }

   }

   @deob.ObfuscatedName("gy.d(B)Z")
   public boolean method384() {
      return this.field3960.method8790(this.field3959.field4349);
   }
}
