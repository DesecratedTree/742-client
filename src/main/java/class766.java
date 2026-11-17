@deob.ObfuscatedName("qv")
public class class766 {
   @deob.ObfuscatedName("qv.n")
   private final class612 field7032;
   @deob.ObfuscatedName("qv.k")
   private int field7031;
   @deob.ObfuscatedName("qv.d")
   private class767[] field7030;

   public class766(class801 arg0, class823 arg1, class612 arg2, boolean arg3) {
      this.field7032 = arg2;
      if (this.field7032 != null) {
         this.field7031 = this.field7032.method8792(class424.field3320.field3349);
      } else {
         this.field7031 = 0;
      }

      if (arg3) {
         this.field7030 = new class767[this.field7031];

         for(int var5 = 0; var5 < this.field7031; ++var5) {
            class612 var6 = this.field7032;
            byte[] var7;
            synchronized(this.field7032) {
               var7 = this.field7032.method8771(class424.field3320.field3349, var5);
            }

            class767 var9 = new class767();
            if (var7 != null) {
               var9.method11388(new class124(var7));
            }

            var9.method11390();
            this.field7030[var5] = var9;
            this.field7030[var5].field7056 = this;
         }
      }

   }

   @deob.ObfuscatedName("qv.n(II)Lqw;")
   public class767 method11377(int arg0) {
      return this.field7030[arg0];
   }

   @deob.ObfuscatedName("qv.k(Lum;I)I")
   public int method11376(class865 arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.field7031; ++var3) {
         class767 var4 = this.method11377(var3);
         if (var4.method11394(arg0)) {
            var2 += var4.field7042;
         }
      }

      return var2;
   }
}
