@deob.ObfuscatedName("aam")
public class class15 extends class389 {
   @deob.ObfuscatedName("aam.k")
   private final int field155;
   @deob.ObfuscatedName("aam.d")
   private final int field156;
   @deob.ObfuscatedName("aam.b")
   private final int field159;
   @deob.ObfuscatedName("aam.r")
   private final int field158;
   @deob.ObfuscatedName("aam.p")
   private class678 field157;

   public class15(class124 arg0) {
      super(arg0);
      this.field155 = arg0.method1587();
      this.field156 = arg0.method1688();
      this.field159 = arg0.method1688();
      this.field158 = arg0.method1688();
   }

   @deob.ObfuscatedName("aam.k(I)V")
   public void method74() {
      this.field157 = class677.method1342(this.field155, this.field158, 0, this.field156, this.field159);
   }

   @deob.ObfuscatedName("aam.d(B)V")
   public void method369() {
      if (this.field157 != null) {
         class677.method9251(this.field157);
         this.field157 = null;
      }

   }
}
