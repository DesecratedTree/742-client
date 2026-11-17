@deob.ObfuscatedName("akg")
public class class279 extends class166 {
   public class279(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("akg.h(FFFB)F")
   protected float method2299(float arg0, float arg1, float arg2) {
      float var4 = arg0 - this.field1163;
      if (this.field8476.method6328().field5328 == Float.POSITIVE_INFINITY) {
         arg1 = this.field8476.method6331().method8157();
      } else {
         float var5 = arg1 / this.field8476.method6328().method8157();
         float var6 = arg1 / 2.0F * var5;
         if (var6 > var4) {
            arg1 -= this.field8476.method6328().method8157() * arg2;
            if (arg1 < 0.0F) {
               arg1 = 0.0F;
            }
         } else if (arg1 < this.field8476.method6331().method8157()) {
            arg1 += this.field8476.method6328().method8157() * arg2;
            if (arg1 > this.field8476.method6331().method8157()) {
               arg1 = this.field8476.method6331().method8157();
            }
         }
      }

      return arg1;
   }
}
