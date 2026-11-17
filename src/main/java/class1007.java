@deob.ObfuscatedName("zt")
public class class1007 extends class389 {
   @deob.ObfuscatedName("zt.k")
   private final int field10626;
   @deob.ObfuscatedName("zt.d")
   private final int field10623;
   @deob.ObfuscatedName("zt.b")
   private final int field10624;
   @deob.ObfuscatedName("zt.r")
   private final int field10625;
   @deob.ObfuscatedName("zt.p")
   private final int field10622;

   public class1007(class124 arg0) {
      super(arg0);
      this.field10626 = arg0.method1587();
      int var2 = arg0.method1591();
      this.field10623 = var2 >>> 16;
      this.field10624 = var2 & 65535;
      this.field10625 = arg0.method1688();
      this.field10622 = arg0.method1603();
   }

   @deob.ObfuscatedName("zt.k(I)V")
   public void method74() {
      Statics.field9261[this.field10626].method5647(this.field10623, this.field10624, this.field10625, this.field10622);
   }
}
