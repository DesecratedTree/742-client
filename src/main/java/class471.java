@deob.ObfuscatedName("ge")
public class class471 {
   @deob.ObfuscatedName("ge.k")
   private int field3836 = -1;
   @deob.ObfuscatedName("ge.d")
   private class849 field3837 = new class849();
   @deob.ObfuscatedName("ge.n")
   private long field3845;

   public class471(class124 arg0) {
      this.method6618(arg0);
   }

   @deob.ObfuscatedName("ge.n(Laen;B)V")
   private void method6618(class124 arg0) {
      this.field3845 = arg0.method1621();
      this.field3836 = arg0.method1591();

      for(int var2 = arg0.method1688(); var2 != 0; var2 = arg0.method1688()) {
         class77 var3;
         if (var2 == 3) {
            var3 = new class230(this);
         } else if (var2 == 1) {
            var3 = new class222(this);
         } else if (var2 == 13) {
            var3 = new class233(this);
         } else if (var2 == 4) {
            var3 = new class243(this);
         } else if (var2 == 6) {
            var3 = new class232(this);
         } else if (var2 == 5) {
            var3 = new class228(this);
         } else if (var2 == 2) {
            var3 = new class241(this);
         } else if (var2 == 7) {
            var3 = new class226(this);
         } else if (var2 == 8) {
            var3 = new class239(this);
         } else if (var2 == 9) {
            var3 = new class236(this);
         } else if (var2 == 10) {
            var3 = new class240(this);
         } else if (var2 == 11) {
            var3 = new class229(this);
         } else {
            if (var2 != 12) {
               throw new RuntimeException("");
            }

            var3 = new class238(this);
         }

         var3.method1095(arg0);
         this.field3837.method14959(var3);
      }

   }

   @deob.ObfuscatedName("ge.k(Lgq;I)V")
   public void method6616(class483 arg0) {
      if (this.field3845 == arg0.field3910 && this.field3836 == arg0.field3925) {
         for(class77 var2 = (class77)this.field3837.method14964(); var2 != null; var2 = (class77)this.field3837.method15006()) {
            var2.method1094(arg0);
         }

         ++arg0.field3925;
      } else {
         throw new RuntimeException("");
      }
   }
}
