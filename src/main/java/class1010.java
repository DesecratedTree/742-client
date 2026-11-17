@deob.ObfuscatedName("zw")
public abstract class class1010 extends class389 {
   @deob.ObfuscatedName("zw.k")
   protected final int field10639;
   @deob.ObfuscatedName("zw.d")
   protected final int field10638;
   @deob.ObfuscatedName("zw.b")
   protected final int field10640;

   public class1010(class124 arg0) {
      super(arg0);
      this.field10639 = arg0.method1587();
      this.field10638 = arg0.method1587();
      this.field10640 = arg0.method1688();
   }

   @deob.ObfuscatedName("zw.b(I)Z")
   public boolean method239() {
      class815 var1 = Statics.field3758.method14209(this.field10639);
      boolean var2 = var1.method14384();
      class806 var3 = Statics.field2046.method14475(var1.field8406);
      return var2 & var3.method14319();
   }
}
