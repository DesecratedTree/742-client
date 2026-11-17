@deob.ObfuscatedName("qq")
public class class761 {
   @deob.ObfuscatedName("qq.n")
   public char field7002;
   @deob.ObfuscatedName("qq.b")
   public int field7000;
   @deob.ObfuscatedName("qq.k")
   public int field7001;
   @deob.ObfuscatedName("qq.d")
   public int field7003;

   @deob.ObfuscatedName("qq.n(Laen;I)V")
   public void method11283(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method11286(arg0, var2);
      }
   }

   @deob.ObfuscatedName("qq.k(Laen;IB)V")
   private void method11286(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field7002 = class813.method10307(arg0.method1623());
      } else if (arg1 == 2) {
         this.field7001 = arg0.method1587();
         this.field7003 = arg0.method1688();
         this.field7000 = arg0.method1688();
      }

   }
}
