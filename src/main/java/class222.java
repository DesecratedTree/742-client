@deob.ObfuscatedName("aid")
public class class222 extends class77 {
   // $FF: synthetic field
   private final class471 this$0;
   @deob.ObfuscatedName("aid.b")
   private long field1515;
   @deob.ObfuscatedName("aid.r")
   private String field1514;

   public class222(class471 arg0) {
      this.this$0 = arg0;
      this.field1515 = -1L;
      this.field1514 = null;
   }

   @deob.ObfuscatedName("aid.n(Laen;I)V")
   public void method1095(class124 arg0) {
      if (arg0.method1688() != 255) {
         --arg0.field935;
         this.field1515 = arg0.method1621();
      }

      this.field1514 = arg0.method1598();
   }

   @deob.ObfuscatedName("aid.k(Lgq;I)V")
   public void method1094(class483 arg0) {
      arg0.method6801(this.field1515, this.field1514, 0);
   }
}
