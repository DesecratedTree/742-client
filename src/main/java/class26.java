@deob.ObfuscatedName("aax")
public class class26 extends class487 {
   @deob.ObfuscatedName("aax.b")
   private class225 field205;
   @deob.ObfuscatedName("aax.r")
   private class422 field204;
   @deob.ObfuscatedName("aax.d")
   private class434 field206;

   public class26(class979 arg0) throws class185 {
      super(arg0);
      this.method445();
   }

   @deob.ObfuscatedName("aax.b(I)Z")
   private boolean method445() throws class185 {
      this.field206 = this.field3941.method2579("BatchedSprite");
      this.field205 = this.field206.method6037("SpriteSampler");
      this.field204 = this.field206.method6039("Normal");
      this.field206.method267(this.field204);
      return true;
   }

   @deob.ObfuscatedName("aax.n()V")
   public void method444() {
      this.field206.method264();
      this.field206.method6030(this.field205, 0, this.field3942);
   }
}
