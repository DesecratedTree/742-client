@deob.ObfuscatedName("aib")
public class class220 extends class95 {
   // $FF: synthetic field
   private final class490 this$0;
   @deob.ObfuscatedName("aib.b")
   private int field1475;
   @deob.ObfuscatedName("aib.r")
   private byte field1476;
   @deob.ObfuscatedName("aib.p")
   private int field1477;
   @deob.ObfuscatedName("aib.o")
   private String field1478;

   public class220(class490 arg0) {
      this.this$0 = arg0;
      this.field1475 = -1;
   }

   @deob.ObfuscatedName("aib.n(Laen;I)V")
   public void method1316(class124 arg0) {
      this.field1475 = arg0.method1587();
      this.field1476 = arg0.method1623();
      this.field1477 = arg0.method1587();
      arg0.method1621();
      this.field1478 = arg0.method1599();
   }

   @deob.ObfuscatedName("aib.k(Lada;B)V")
   public void method1315(class84 arg0) {
      class472 var2 = arg0.field621[this.field1475];
      var2.field3852 = this.field1476;
      var2.field3853 = this.field1477;
      var2.field3851 = this.field1478;
   }
}
