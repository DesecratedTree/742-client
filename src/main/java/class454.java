@deob.ObfuscatedName("fo")
public class class454 {
   @deob.ObfuscatedName("fo.n")
   private class875 field3753;
   @deob.ObfuscatedName("fo.k")
   private class76[] field3752;
   @deob.ObfuscatedName("fo.d")
   private final class451 field3751;

   public class454(int arg0, class451 arg1) {
      int var3;
      for(var3 = 1; var3 < arg0; var3 += var3) {
      }

      this.field3753 = new class875(var3);
      this.field3752 = new class76[var3];
      this.field3751 = arg1;
   }

   @deob.ObfuscatedName("fo.n(II)Lact;")
   public class76 method6461(int arg0) {
      return arg0 >= this.field3752.length ? null : this.field3752[arg0];
   }

   @deob.ObfuscatedName("fo.k(Ljava/lang/String;I)Lact;")
   public class76 method6454(String arg0) {
      long var2 = this.field3751.method5906(arg0);

      for(class76 var4 = (class76)this.field3753.method15322(var2); var4 != null; var4 = (class76)this.field3753.method15308()) {
         if (var4.field559.equals(arg0)) {
            return var4;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("fo.d(IS)V")
   private void method6455(int arg0) {
      class76 var2 = this.method6461(arg0);
      if (var2 != null) {
         var2.method9864();
         this.field3752[var2.field560] = null;
      }

   }

   @deob.ObfuscatedName("fo.b(ILjava/lang/String;Lact;I)V")
   public void method6456(int arg0, String arg1, class76 arg2) {
      class76 var4 = this.method6454(arg1);
      if (var4 != null && var4.field560 != arg0) {
         throw new IllegalArgumentException(arg1);
      } else {
         this.method6455(arg0);
         if (arg0 >= this.field3752.length) {
            int var5;
            for(var5 = this.field3752.length; arg0 >= var5; var5 += var5) {
            }

            this.field3753 = new class875(var5);

            for(int var6 = 0; var6 < this.field3752.length; ++var6) {
               class76 var7 = this.field3752[var6];
               if (var7 != null) {
                  this.field3753.method15311(var7, var7.field6137);
               }
            }

            class76[] var8 = new class76[var5];

            for(int var9 = 0; var9 < this.field3752.length; ++var9) {
               var8[var9] = this.field3752[var9];
            }

            this.field3752 = var8;
         }

         arg2.field560 = arg0;
         arg2.field559 = arg1;
         this.field3753.method15311(arg2, this.field3751.method5906(arg1));
         this.field3752[arg0] = arg2;
      }
   }
}
