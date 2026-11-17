@deob.ObfuscatedName("jf")
public class class561 implements class768 {
   @deob.ObfuscatedName("jf.n")
   public int field4903 = 0;
   @deob.ObfuscatedName("jf.k")
   public char field4904;

   @deob.ObfuscatedName("jf.n(Laen;I)V")
   public void method7926(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method7929(arg0, var2);
      }
   }

   @deob.ObfuscatedName("jf.k(Laen;II)V")
   private void method7929(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field4904 = class813.method10307(arg0.method1623());
      } else if (arg1 == 5) {
         this.field4903 = arg0.method1587();
      }

   }
}
