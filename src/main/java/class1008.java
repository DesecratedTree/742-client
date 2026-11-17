@deob.ObfuscatedName("zu")
public class class1008 extends class389 {
   @deob.ObfuscatedName("zu.k")
   private final int field10631;
   @deob.ObfuscatedName("zu.d")
   private final int field10628;
   @deob.ObfuscatedName("zu.b")
   private final int field10629;
   @deob.ObfuscatedName("zu.r")
   private final int field10630;
   @deob.ObfuscatedName("zu.p")
   private final int field10627;

   public class1008(class124 arg0) {
      super(arg0);
      this.field10631 = arg0.method1587();
      int var2 = arg0.method1688();
      if ((var2 & 1) != 0) {
         this.field10628 = arg0.method1587();
         this.field10629 = arg0.method1587();
      } else {
         this.field10628 = -1;
         this.field10629 = -1;
      }

      if ((var2 & 2) != 0) {
         this.field10630 = arg0.method1587();
         this.field10627 = arg0.method1587();
      } else {
         this.field10630 = -1;
         this.field10627 = -1;
      }

      if ((var2 & 4) != 0) {
         int var3 = arg0.method1587();
         int var4 = arg0.method1587();
         int var5 = var3 * 255 / var4;
         if (var3 > 0 && var5 < 1) {
            boolean var6 = true;
         }
      }

   }

   @deob.ObfuscatedName("zu.k(I)V")
   public void method74() {
      class4 var1 = Statics.field9261[this.field10631].method5645();
      var1.method91(this.field10628, this.field10629, this.field10630, this.field10627, client.field2418, 0);
   }
}
