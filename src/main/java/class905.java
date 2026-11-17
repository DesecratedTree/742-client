@deob.ObfuscatedName("vz")
public class class905 {
   @deob.ObfuscatedName("vz.b")
   public int field9239 = 1;
   @deob.ObfuscatedName("vz.d")
   public char field9240;

   @deob.ObfuscatedName("vz.n(Laen;B)V")
   public void method15720(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15722(arg0, var2);
      }
   }

   @deob.ObfuscatedName("vz.k(Laen;II)V")
   private void method15722(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field9240 = class813.method10307(arg0.method1623());
      } else if (arg1 == 2) {
         this.field9239 = 0;
      }

   }
}
