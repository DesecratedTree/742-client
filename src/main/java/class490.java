@deob.ObfuscatedName("gx")
public class class490 {
   @deob.ObfuscatedName("gx.k")
   private long field3953 = -1L;
   @deob.ObfuscatedName("gx.d")
   private class849 field3954 = new class849();
   @deob.ObfuscatedName("gx.n")
   private long field3952;

   public class490(class124 arg0) {
      this.method6892(arg0);
   }

   @deob.ObfuscatedName("gx.n(Laen;I)V")
   private void method6892(class124 arg0) {
      this.field3952 = arg0.method1621();
      this.field3953 = arg0.method1621();

      for(int var2 = arg0.method1688(); var2 != 0; var2 = arg0.method1688()) {
         class95 var3;
         if (var2 == 1) {
            var3 = new class227(this);
         } else if (var2 == 4) {
            var3 = new class242(this);
         } else if (var2 == 3) {
            var3 = new class234(this);
         } else {
            if (var2 != 2) {
               throw new RuntimeException("");
            }

            var3 = new class220(this);
         }

         var3.method1316(arg0);
         this.field3954.method14959(var3);
      }

   }

   @deob.ObfuscatedName("gx.k(Lada;I)V")
   public void method6893(class84 arg0) {
      if (this.field3952 == arg0.field6137 && this.field3953 == arg0.field619) {
         for(class95 var2 = (class95)this.field3954.method14964(); var2 != null; var2 = (class95)this.field3954.method15006()) {
            var2.method1315(arg0);
         }

         ++arg0.field619;
      } else {
         throw new RuntimeException("");
      }
   }
}
