@deob.ObfuscatedName("aio")
public class class233 extends class77 {
   // $FF: synthetic field
   private final class471 this$0;
   @deob.ObfuscatedName("aio.b")
   private long field1577;
   @deob.ObfuscatedName("aio.r")
   private String field1578;
   @deob.ObfuscatedName("aio.p")
   private int field1576;

   public class233(class471 arg0) {
      this.this$0 = arg0;
      this.field1577 = -1L;
      this.field1578 = null;
      this.field1576 = 0;
   }

   @deob.ObfuscatedName("aio.n(Laen;I)V")
   public void method1095(class124 arg0) {
      if (arg0.method1688() != 255) {
         --arg0.field935;
         this.field1577 = arg0.method1621();
      }

      this.field1578 = arg0.method1598();
      this.field1576 = arg0.method1587();
   }

   @deob.ObfuscatedName("aio.k(Lgq;I)V")
   public void method1094(class483 arg0) {
      arg0.method6801(this.field1577, this.field1578, this.field1576);
   }
}
