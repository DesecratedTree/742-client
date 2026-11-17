@deob.ObfuscatedName("mx")
public class class660 {
   @deob.ObfuscatedName("mx.k")
   private class645[] field6050 = new class645[10];
   @deob.ObfuscatedName("mx.d")
   private int field6049;
   @deob.ObfuscatedName("mx.b")
   private int field6051;

   private class660(class124 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method1688();
         if (var3 != 0) {
            --arg0.field935;
            this.field6050[var2] = new class645();
            this.field6050[var2].method9281(arg0);
         }
      }

      this.field6049 = arg0.method1587();
      this.field6051 = arg0.method1587();
   }

   @deob.ObfuscatedName("mx.n(Llc;II)Lmx;")
   public static class660 method9661(class612 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method8771(arg1, arg2);
      return var3 == null ? null : new class660(new class124(var3));
   }

   @deob.ObfuscatedName("mx.k()Lald;")
   public class302 method9662() {
      byte[] var1 = this.method9663();
      return new class302(22050, var1, this.field6049 * 22050 / 1000, this.field6051 * 22050 / 1000);
   }

   @deob.ObfuscatedName("mx.d()I")
   public final int method9668() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field6050[var2] != null && this.field6050[var2].field5817 / 20 < var1) {
            var1 = this.field6050[var2].field5817 / 20;
         }
      }

      if (this.field6049 < this.field6051 && this.field6049 / 20 < var1) {
         var1 = this.field6049 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field6050[var3] != null) {
               this.field6050[var3].field5817 -= var1 * 20;
            }
         }

         if (this.field6049 < this.field6051) {
            this.field6049 -= var1 * 20;
            this.field6051 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @deob.ObfuscatedName("mx.b()[B")
   private final byte[] method9663() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field6050[var2] != null && this.field6050[var2].field5831 + this.field6050[var2].field5817 > var1) {
            var1 = this.field6050[var2].field5831 + this.field6050[var2].field5817;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field6050[var5] != null) {
               int var6 = this.field6050[var5].field5831 * 22050 / 1000;
               int var7 = this.field6050[var5].field5817 * 22050 / 1000;
               int[] var8 = this.field6050[var5].method9282(var6, this.field6050[var5].field5831);

               for(int var9 = 0; var9 < var6; ++var9) {
                  int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                  if ((var10 + 128 & -256) != 0) {
                     var10 = var10 >> 31 ^ 127;
                  }

                  var4[var7 + var9] = (byte)var10;
               }
            }
         }

         return var4;
      }
   }
}
