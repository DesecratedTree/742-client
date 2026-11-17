@deob.ObfuscatedName("sx")
public class class822 {
   @deob.ObfuscatedName("sx.k")
   public int field8439;
   @deob.ObfuscatedName("sx.n")
   public int field8440;
   @deob.ObfuscatedName("sx.d")
   public int field8441;

   @deob.ObfuscatedName("sx.n(Laen;I)V")
   public void method14520(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method14515(arg0, var2);
      }
   }

   @deob.ObfuscatedName("sx.k(Laen;IB)V")
   private void method14515(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field8440 = arg0.method1587();
         this.field8439 = arg0.method1688();
         this.field8441 = arg0.method1688();
      }

   }
}
