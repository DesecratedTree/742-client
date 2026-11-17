@deob.ObfuscatedName("aii")
public class class227 extends class95 {
   // $FF: synthetic field
   private final class490 this$0;
   @deob.ObfuscatedName("aii.b")
   private String field1534;
   @deob.ObfuscatedName("aii.p")
   private byte field1535;
   @deob.ObfuscatedName("aii.r")
   private int field1533;

   public class227(class490 arg0) {
      this.this$0 = arg0;
      this.field1534 = null;
   }

   @deob.ObfuscatedName("aii.n(Laen;I)V")
   public void method1316(class124 arg0) {
      if (arg0.method1688() != 255) {
         --arg0.field935;
         arg0.method1621();
      }

      this.field1534 = arg0.method1598();
      this.field1533 = arg0.method1587();
      this.field1535 = arg0.method1623();
      arg0.method1621();
   }

   @deob.ObfuscatedName("aii.k(Lada;B)V")
   public void method1315(class84 arg0) {
      class472 var2 = new class472();
      var2.field3851 = this.field1534;
      var2.field3853 = this.field1533;
      var2.field3852 = this.field1535;
      arg0.method1139(var2);
   }
}
