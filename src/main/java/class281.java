@deob.ObfuscatedName("aki")
public class class281 extends class166 {
   @deob.ObfuscatedName("aki.r")
   private float field1835;
   @deob.ObfuscatedName("aki.p")
   private float field1836;

   public class281(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("aki.h(FFFB)F")
   protected float method2299(float arg0, float arg1, float arg2) {
      float var4 = this.field1163 / arg0;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      return (this.field1836 - this.field1835) * var4 + this.field1835;
   }
}
