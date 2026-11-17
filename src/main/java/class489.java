@deob.ObfuscatedName("gw")
public abstract class class489 implements class479 {
   @deob.ObfuscatedName("gw.n")
   protected final class612 field3949;
   @deob.ObfuscatedName("gw.k")
   private final class612 field3945;
   @deob.ObfuscatedName("gw.d")
   protected final class545 field3947;
   @deob.ObfuscatedName("gw.r")
   private int field3946;
   @deob.ObfuscatedName("gw.p")
   private long field3950;
   @deob.ObfuscatedName("gw.b")
   private class609 field3948;

   protected class489(class612 arg0, class612 arg1, class545 arg2) {
      this.field3949 = arg0;
      this.field3945 = arg1;
      this.field3947 = arg2;
   }

   @deob.ObfuscatedName("gw.k(ZI)V")
   public void method394(boolean arg0) {
      int var2 = this.field3947.field4361.method7443(this.field3947.field4357, client.field2555) + this.field3947.field4355;
      int var3 = this.field3947.field4354.method7329(this.field3947.field4358, client.field2556) + this.field3947.field4356;
      this.method374(arg0, var2, var3);
      this.method373(arg0, var2, var3);
      String var4 = Statics.field9392.method8493();
      if (class431.method2169() - this.field3950 > 10000L) {
         var4 = var4 + " (" + Statics.field9392.method8488().field5362 + ")";
      }

      this.field3948.method8691(var4, this.field3947.field4357 / 2 + var2, this.field3947.field4353 + this.field3947.field4358 / 2 + var3 + 4, this.field3947.field4359, -1);
   }

   @deob.ObfuscatedName("gw.n(I)V")
   public void method383() {
      class883 var1 = class883.method7898(this.field3945, this.field3947.field4360);
      this.field3948 = Statics.field8847.method7606(var1, (class998[])((class998[])class375.method5067(this.field3949, this.field3947.field4360)), true);
   }

   @deob.ObfuscatedName("gw.d(B)Z")
   public boolean method384() {
      boolean var1 = true;
      if (!this.field3949.method8790(this.field3947.field4360)) {
         var1 = false;
      }

      if (!this.field3945.method8790(this.field3947.field4360)) {
         var1 = false;
      }

      return var1;
   }

   @deob.ObfuscatedName("gw.l(I)I")
   protected int method6885() {
      int var1 = Statics.field9392.method8492();
      int var2 = var1 * 100;
      if (this.field3946 == var1 && var1 != 0) {
         int var3 = Statics.field9392.method8491();
         if (var3 > var1) {
            long var4 = this.field3950 - Statics.field9392.method8486();
            if (var4 > 0L) {
               long var6 = var4 * 10000L / (long)var1 * (long)(var3 - var1);
               long var8 = (class431.method2169() - this.field3950) * 10000L;
               if (var8 < var6) {
                  var2 = (int)((long)(var3 - var1) * var8 * 100L / var6 + (long)(var1 * 100));
               } else {
                  var2 = var3 * 100;
               }
            }
         }
      } else {
         this.field3946 = var1;
         this.field3950 = class431.method2169();
      }

      return var2;
   }

   @deob.ObfuscatedName("gw.s(ZIII)V")
   protected abstract void method373(boolean arg0, int arg1, int arg2);

   @deob.ObfuscatedName("gw.x(ZIII)V")
   protected abstract void method374(boolean arg0, int arg1, int arg2);
}
