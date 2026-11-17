@deob.ObfuscatedName("ly")
public class class634 {
   @deob.ObfuscatedName("ly.n")
   private byte field5748;
   @deob.ObfuscatedName("ly.k")
   public int field5749;
   @deob.ObfuscatedName("ly.d")
   public int field5750;
   @deob.ObfuscatedName("ly.b")
   public int field5752;
   @deob.ObfuscatedName("ly.r")
   public int field5751;
   @deob.ObfuscatedName("ly.p")
   public int field5753;

   public class634() {
   }

   public class634(class124 arg0) {
      this.field5748 = arg0.method1623();
      this.field5749 = arg0.method1587();
      this.field5750 = arg0.method1591();
      this.field5752 = arg0.method1591();
      this.field5751 = arg0.method1591();
      this.field5753 = arg0.method1591();
   }

   @deob.ObfuscatedName("ly.n(I)I")
   public int method9167() {
      return this.field5748 & 7;
   }

   @deob.ObfuscatedName("ly.k(B)I")
   public int method9168() {
      return (this.field5748 & 8) == 8 ? 1 : 0;
   }
}
