@deob.ObfuscatedName("ael")
public class class122 extends class107 implements class768 {
   @deob.ObfuscatedName("ael.o")
   public int field927 = 0;
   @deob.ObfuscatedName("ael.s")
   public int field928 = 0;
   @deob.ObfuscatedName("ael.x")
   public int[] field925;
   @deob.ObfuscatedName("ael.a")
   public int[] field926;

   @deob.ObfuscatedName("ael.n(Laen;I)V")
   public void method1555(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method1552(arg0, var2);
      }
   }

   @deob.ObfuscatedName("ael.k(Laen;II)V")
   private void method1552(class124 arg0, int arg1) {
      if (arg1 == 2) {
         this.field928 = arg0.method1587();
      } else if (arg1 == 4) {
         this.field927 = arg0.method1688();
         this.field926 = new int[this.field927];
         this.field925 = new int[this.field927];

         for(int var3 = 0; var3 < this.field927; ++var3) {
            this.field926[var3] = arg0.method1587();
            this.field925[var3] = arg0.method1587();
         }
      }

   }
}
