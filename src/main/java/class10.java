@deob.ObfuscatedName("aah")
public class class10 extends class389 {
   @deob.ObfuscatedName("aah.k")
   private final int field100;
   @deob.ObfuscatedName("aah.d")
   private final int field99;

   public class10(class124 arg0) {
      super(arg0);
      this.field100 = arg0.method1587();
      this.field99 = arg0.method1591();
   }

   @deob.ObfuscatedName("aah.k(I)V")
   public void method74() {
      client.field2480 = client.field2418;
      client.field2460 = client.field2418 + this.field100;
      Statics.field3374 = client.field2482;
      Statics.field3113 = client.field2483;
      Statics.field6636 = client.field2484;
      Statics.field3667 = client.field2389;
      client.field2482 = this.field99 >>> 24;
      client.field2483 = this.field99 >>> 16 & 255;
      client.field2484 = this.field99 >>> 8 & 255;
      client.field2389 = this.field99 & 255;
   }
}
