@deob.ObfuscatedName("ahq")
public class class208 extends class13 {
   public class208(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("ahq.w(FFFS)F")
   protected float method349(float arg0, float arg1, float arg2) {
      float var4 = arg0 - this.field145;
      if (this.field3939.method6329().field5328 == Float.POSITIVE_INFINITY) {
         arg1 = this.field3939.method6332().method8157();
      } else {
         float var5 = arg1 / this.field3939.method6329().method8157();
         float var6 = arg1 / 2.0F * var5;
         if (var6 > var4) {
            arg1 -= this.field3939.method6329().method8157() * arg2;
            if (arg1 < 0.0F) {
               arg1 = 0.0F;
            }
         } else if (arg1 < this.field3939.method6332().method8157()) {
            arg1 += this.field3939.method6329().method8157() * arg2;
            if (arg1 > this.field3939.method6332().method8157()) {
               arg1 = this.field3939.method6332().method8157();
            }
         }
      }

      return arg1;
   }
}
