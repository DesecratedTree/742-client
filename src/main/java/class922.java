@deob.ObfuscatedName("wp")
public class class922 {
   @deob.ObfuscatedName("wp.n")
   public char field9385;
   @deob.ObfuscatedName("wp.k")
   public int field9383;
   @deob.ObfuscatedName("wp.d")
   public int field9384;
   @deob.ObfuscatedName("wp.b")
   public int field9386;

   @deob.ObfuscatedName("wp.n(Laen;I)V")
   public void method15869(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15870(arg0, var2);
      }
   }

   @deob.ObfuscatedName("wp.k(Laen;II)V")
   private void method15870(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field9385 = class813.method10307(arg0.method1623());
      } else if (arg1 == 3) {
         this.field9383 = arg0.method1587();
         this.field9384 = arg0.method1688();
         this.field9386 = arg0.method1688();
      }

   }
}
