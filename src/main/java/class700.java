@deob.ObfuscatedName("oj")
public class class700 {
   @deob.ObfuscatedName("oj.n")
   public int field6459 = -1;
   @deob.ObfuscatedName("oj.k")
   public int field6460 = -1;
   @deob.ObfuscatedName("oj.b")
   public class714 field6462 = class714.field6629;
   @deob.ObfuscatedName("oj.r")
   public int field6461 = -1;
   @deob.ObfuscatedName("oj.d")
   public int[] field6463;

   @deob.ObfuscatedName("oj.n(Laen;B)V")
   public void method10303(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method10298(arg0, var2);
      }
   }

   @deob.ObfuscatedName("oj.k(Laen;II)V")
   private void method10298(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field6459 = arg0.method1587();
      } else if (arg1 == 2) {
         this.field6463 = new int[arg0.method1688()];

         for(int var3 = 0; var3 < this.field6463.length; ++var3) {
            this.field6463[var3] = arg0.method1587();
         }
      } else if (arg1 == 3) {
         this.field6460 = arg0.method1688();
      } else if (arg1 == 4) {
         this.field6462 = (class714)class814.method4102(class714.method275(), arg0.method1688());
      } else if (arg1 == 5) {
         this.field6461 = arg0.method1608();
      }

   }
}
