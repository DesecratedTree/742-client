@deob.ObfuscatedName("aix")
public class class242 extends class95 {
   // $FF: synthetic field
   private final class490 this$0;
   @deob.ObfuscatedName("aix.p")
   private byte field1616;
   @deob.ObfuscatedName("aix.r")
   private byte field1617;
   @deob.ObfuscatedName("aix.b")
   private String field1618;

   public class242(class490 arg0) {
      this.this$0 = arg0;
   }

   @deob.ObfuscatedName("aix.n(Laen;I)V")
   public void method1316(class124 arg0) {
      this.field1618 = arg0.method1598();
      if (this.field1618 != null) {
         arg0.method1688();
         this.field1617 = arg0.method1623();
         this.field1616 = arg0.method1623();
      }

   }

   @deob.ObfuscatedName("aix.k(Lada;B)V")
   public void method1315(class84 arg0) {
      arg0.field620 = this.field1618;
      if (this.field1618 != null) {
         arg0.field626 = this.field1617;
         arg0.field627 = this.field1616;
      }

   }
}
