@deob.ObfuscatedName("dy")
public class class410 {
   @deob.ObfuscatedName("dy.d")
   private final int[] field3092;
   @deob.ObfuscatedName("dy.b")
   private final int[] field3094;

   public class410(class124 arg0) {
      int var2 = arg0.method1604();
      this.field3092 = new int[var2];
      this.field3094 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = arg0.method1688();
         this.field3092[var3] = var4;
         int var5 = arg0.method1587();
         int var6 = arg0.method1587();
         this.field3094[var3] = (var5 << 16) + var6;
      }

   }

   @deob.ObfuscatedName("dy.n(Ldz;II)V")
   public void method5632(class411 arg0, int arg1) {
      int var3 = this.field3094[0];
      arg0.method5644(arg1, var3 >>> 16, var3 & 65535);
      class4 var4 = arg0.method5645();
      var4.field60 = 0;

      for(int var5 = this.field3092.length - 1; var5 >= 0; --var5) {
         int var6 = this.field3092[var5];
         int var7 = this.field3094[var5];
         var4.field16[var4.field60] = var7 >> 16;
         var4.field62[var4.field60] = var7 & 65535;
         byte var8 = class647.field5875.field5871;
         if (var6 == 0) {
            var8 = class647.field5872.field5871;
         } else if (var6 == 2) {
            var8 = class647.field5874.field5871;
         }

         var4.field63[var4.field60] = var8;
         ++var4.field60;
      }

   }
}
