@deob.ObfuscatedName("vl")
public class class891 {
   @deob.ObfuscatedName("vl.n")
   public int field9086 = 0;
   @deob.ObfuscatedName("vl.k")
   public int field9084 = 0;
   @deob.ObfuscatedName("vl.d")
   public int field9082 = 2048;
   @deob.ObfuscatedName("vl.b")
   public int field9085 = 2048;

   @deob.ObfuscatedName("vl.n(Laen;B)V")
   public void method15510(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15511(arg0, var2);
      }
   }

   @deob.ObfuscatedName("vl.k(Laen;II)V")
   private void method15511(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field9086 = arg0.method1688();
      } else if (arg1 == 2) {
         this.field9085 = arg0.method1587();
      } else if (arg1 == 3) {
         this.field9082 = arg0.method1587();
      } else if (arg1 == 4) {
         this.field9084 = arg0.method1723();
      }

   }
}
