@deob.ObfuscatedName("wq")
public class class923 {
   @deob.ObfuscatedName("wq.b")
   public boolean field9390 = true;
   @deob.ObfuscatedName("wq.n")
   private char field9391;
   @deob.ObfuscatedName("wq.k")
   public int field9388;
   @deob.ObfuscatedName("wq.d")
   public String field9389;

   @deob.ObfuscatedName("wq.n(Laen;I)V")
   public void method15882(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15881(arg0, var2);
      }
   }

   @deob.ObfuscatedName("wq.k(Laen;IB)V")
   private void method15881(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field9391 = class813.method10307(arg0.method1623());
      } else if (arg1 == 2) {
         this.field9388 = arg0.method1591();
      } else if (arg1 == 4) {
         this.field9390 = false;
      } else if (arg1 == 5) {
         this.field9389 = arg0.method1599();
      }

   }

   @deob.ObfuscatedName("wq.d(I)Z")
   public boolean method15884() {
      return this.field9391 == 's';
   }
}
