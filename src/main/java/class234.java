@deob.ObfuscatedName("aip")
public class class234 extends class95 {
   // $FF: synthetic field
   private final class490 this$0;
   @deob.ObfuscatedName("aip.b")
   private int field1580;

   public class234(class490 arg0) {
      this.this$0 = arg0;
      this.field1580 = -1;
   }

   @deob.ObfuscatedName("aip.n(Laen;I)V")
   public void method1316(class124 arg0) {
      this.field1580 = arg0.method1587();
      arg0.method1688();
      if (arg0.method1688() != 255) {
         --arg0.field935;
         arg0.method1621();
      }

   }

   @deob.ObfuscatedName("aip.k(Lada;B)V")
   public void method1315(class84 arg0) {
      arg0.method1142(this.field1580);
   }
}
