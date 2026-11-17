@deob.ObfuscatedName("pi")
public class class726 implements class768 {
   @deob.ObfuscatedName("pi.k")
   public int field6687;
   @deob.ObfuscatedName("pi.n")
   public int field6688;
   @deob.ObfuscatedName("pi.d")
   public int field6689;

   @deob.ObfuscatedName("pi.n(Laen;B)V")
   public void method10730(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method10729(arg0, var2);
      }
   }

   @deob.ObfuscatedName("pi.k(Laen;IB)V")
   private void method10729(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field6688 = arg0.method1587();
         this.field6687 = arg0.method1688();
         this.field6689 = arg0.method1688();
      }

   }
}
