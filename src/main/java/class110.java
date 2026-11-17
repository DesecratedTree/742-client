import java.io.IOException;

@deob.ObfuscatedName("ae")
public class class110 {
   @deob.ObfuscatedName("ae.d")
   private class849 field822 = new class849();
   @deob.ObfuscatedName("ae.b")
   private int field825 = 0;
   @deob.ObfuscatedName("ae.r")
   private class124 field828 = new class124(1600);
   @deob.ObfuscatedName("ae.o")
   public class251 field835 = new class251(15000);
   @deob.ObfuscatedName("ae.x")
   public class567 field826 = null;
   @deob.ObfuscatedName("ae.s")
   public int field829 = 0;
   @deob.ObfuscatedName("ae.l")
   public boolean field830 = true;
   @deob.ObfuscatedName("ae.u")
   public int field831 = 0;
   @deob.ObfuscatedName("ae.v")
   public int field820 = 0;
   @deob.ObfuscatedName("ae.c")
   public boolean field840 = false;
   @deob.ObfuscatedName("ae.w")
   public class663 field841 = new class663();
   @deob.ObfuscatedName("ae.e")
   public int field824;
   @deob.ObfuscatedName("ae.g")
   private int field833;
   @deob.ObfuscatedName("ae.h")
   public int field834;
   @deob.ObfuscatedName("ae.z")
   public int field836;
   @deob.ObfuscatedName("ae.m")
   public class567 field837;
   @deob.ObfuscatedName("ae.i")
   public class567 field838;
   @deob.ObfuscatedName("ae.t")
   public class567 field839;
   @deob.ObfuscatedName("ae.k")
   private class711 field821;
   @deob.ObfuscatedName("ae.a")
   public class872 field827;
   @deob.ObfuscatedName("ae.p")
   public class872 field832;

   public class110() {
      Thread var1 = new Thread(this.field841);
      var1.setPriority(1);
      var1.start();
   }

   @deob.ObfuscatedName("ae.n(B)V")
   public final void method1434() {
      this.field822.method14958();
      this.field825 = 0;
   }

   @deob.ObfuscatedName("ae.k(I)V")
   public final void method1407() throws IOException {
      if (this.field821 != null && this.field825 > 0) {
         this.field828.field935 = 0;

         while(true) {
            class109 var1 = (class109)this.field822.method14964();
            if (var1 == null || var1.field816 > this.field828.field931.length - this.field828.field935) {
               this.field821.method1530(this.field828.field931, 0, this.field828.field935);
               this.field833 += this.field828.field935;
               this.field820 = 0;
               break;
            }

            this.field828.method1753(var1.field814.field931, 0, var1.field816);
            this.field825 -= var1.field816;
            var1.method9864();
            var1.field814.method1567();
            var1.method1398();
         }
      }

   }

   @deob.ObfuscatedName("ae.d(Ladz;B)V")
   public final void method1408(class109 arg0) {
      this.field822.method14959(arg0);
      arg0.field816 = arg0.field814.field935;
      arg0.field814.field935 = 0;
      this.field825 += arg0.field816;
   }

   @deob.ObfuscatedName("ae.b(B)V")
   public void method1412() {
      if (client.field2418 % 50 == 0) {
         this.field824 = this.field833;
         this.field833 = 0;
         this.field836 = this.field834;
         this.field834 = 0;
      }

   }

   @deob.ObfuscatedName("ae.r(Lou;Ljava/lang/String;B)V")
   public void method1410(class711 arg0, String arg1) {
      this.field821 = arg0;
      this.field841.method9694(arg1);
   }

   @deob.ObfuscatedName("ae.p(I)V")
   public void method1411() {
      if (this.field821 != null) {
         this.field821.method1532();
         this.field821 = null;
      }

      this.field841.method9694((String)null);
   }

   @deob.ObfuscatedName("ae.o(I)V")
   public void method1431() {
      this.field821 = null;
      this.field841.method9694((String)null);
   }

   @deob.ObfuscatedName("ae.a(B)Lou;")
   public class711 method1413() {
      return this.field821;
   }
}
