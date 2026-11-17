@deob.ObfuscatedName("gb")
public class class468 implements class479 {
   @deob.ObfuscatedName("gb.k")
   private final class612 field3826;
   @deob.ObfuscatedName("gb.n")
   protected final class527 field3825;
   @deob.ObfuscatedName("gb.d")
   protected class383 field3824;

   public class468(class612 arg0, class527 arg1) {
      this.field3826 = arg0;
      this.field3825 = arg1;
   }

   @deob.ObfuscatedName("gb.n(I)V")
   public void method383() {
      this.field3824 = class585.method2314(this.field3826, this.field3825.field4164);
   }

   @deob.ObfuscatedName("gb.k(ZI)V")
   public void method394(boolean arg0) {
      if (arg0) {
         int var2 = this.field3825.field4163.method7443(this.field3824.method5259(), client.field2555) + this.field3825.field4160;
         int var3 = this.field3825.field4162.method7329(this.field3824.method5213(), client.field2556) + this.field3825.field4161;
         this.field3824.method5221(var2, var3);
      }

   }

   @deob.ObfuscatedName("gb.d(B)Z")
   public boolean method384() {
      return this.field3826.method8790(this.field3825.field4164);
   }
}
