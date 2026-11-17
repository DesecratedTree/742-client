@deob.ObfuscatedName("zv")
public class class1009 extends class389 {
   @deob.ObfuscatedName("zv.k")
   private final int field10636;
   @deob.ObfuscatedName("zv.d")
   private final int field10633;
   @deob.ObfuscatedName("zv.b")
   private final int field10634;
   @deob.ObfuscatedName("zv.r")
   private final int field10635;
   @deob.ObfuscatedName("zv.p")
   private final int field10632;

   public class1009(class124 arg0) {
      super(arg0);
      this.field10636 = arg0.method1587();
      int var2 = arg0.method1591();
      this.field10633 = var2 >>> 16;
      this.field10634 = var2 & 65535;
      this.field10635 = arg0.method1688();
      this.field10632 = arg0.method1688();
   }

   @deob.ObfuscatedName("zv.k(I)V")
   public void method74() {
      Statics.field3643[this.field10636].method5531(this.field10635, this.field10633, this.field10634, this.field10632);
   }
}
