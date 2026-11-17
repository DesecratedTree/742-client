@deob.ObfuscatedName("ail")
public class class230 extends class77 {
   // $FF: synthetic field
   private final class471 this$0;
   @deob.ObfuscatedName("ail.b")
   private long field1542;
   @deob.ObfuscatedName("ail.r")
   private String field1541;

   public class230(class471 arg0) {
      this.this$0 = arg0;
      this.field1542 = -1L;
      this.field1541 = null;
   }

   @deob.ObfuscatedName("ail.n(Laen;I)V")
   public void method1095(class124 arg0) {
      if (arg0.method1688() != 255) {
         --arg0.field935;
         this.field1542 = arg0.method1621();
      }

      this.field1541 = arg0.method1598();
   }

   @deob.ObfuscatedName("ail.k(Lgq;I)V")
   public void method1094(class483 arg0) {
      arg0.method6823(this.field1542, this.field1541);
   }
}
