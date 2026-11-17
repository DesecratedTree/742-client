@deob.ObfuscatedName("ahp")
public class class207 extends class13 {
   @deob.ObfuscatedName("ahp.p")
   private float field1369;
   @deob.ObfuscatedName("ahp.r")
   private float field1370;

   public class207(class452 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("ahp.w(FFFS)F")
   protected float method349(float arg0, float arg1, float arg2) {
      float var4 = this.field145 / arg0;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      return (this.field1369 - this.field1370) * var4 + this.field1370;
   }
}
