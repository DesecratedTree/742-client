@deob.ObfuscatedName("rc")
public class class774 {
   @deob.ObfuscatedName("rc.n")
   public class722 field7126;

   public class774(class612 arg0) {
      byte[] var2 = arg0.method8809(class780.field7159.field7155);
      this.method11593(new class124(var2));
   }

   @deob.ObfuscatedName("rc.n(Laen;I)V")
   private void method11593(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.field7126 = Statics.method1512(arg0);
         }
      }
   }
}
