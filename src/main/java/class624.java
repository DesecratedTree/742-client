import java.math.BigInteger;

@deob.ObfuscatedName("lo")
public class class624 {
   @deob.ObfuscatedName("lo.n")
   private class630 field5608;
   @deob.ObfuscatedName("lo.k")
   private class618 field5604;
   @deob.ObfuscatedName("lo.d")
   private BigInteger field5609;
   @deob.ObfuscatedName("lo.b")
   private BigInteger field5605;
   @deob.ObfuscatedName("lo.r")
   private class313 field5607;
   @deob.ObfuscatedName("lo.p")
   private class124 field5606;
   @deob.ObfuscatedName("lo.o")
   private class41[] field5603;

   public class624(class630 arg0, class618 arg1, BigInteger arg2, BigInteger arg3) {
      this.field5608 = arg0;
      this.field5604 = arg1;
      this.field5609 = arg2;
      this.field5605 = arg3;
      if (!this.field5608.method9109()) {
         this.field5607 = this.field5608.method9107(255, 255, (byte)0, true);
      }

   }

   @deob.ObfuscatedName("lo.n(I)Z")
   public boolean method8979() {
      if (this.field5606 != null) {
         return true;
      } else {
         if (this.field5607 == null) {
            if (this.field5608.method9109()) {
               return false;
            }

            this.field5607 = this.field5608.method9107(255, 255, (byte)0, true);
         }

         if (this.field5607.field1758) {
            return false;
         } else {
            class124 var1 = new class124(this.field5607.method3514());
            var1.field935 = 5;
            int var2 = var1.method1688();
            var1.field935 += var2 * 72;
            byte[] var3 = new byte[var1.field931.length - var1.field935];
            var1.method1602(var3, 0, var3.length);
            byte[] var6;
            if (this.field5609 != null && this.field5605 != null) {
               BigInteger var4 = new BigInteger(var3);
               BigInteger var5 = var4.modPow(this.field5609, this.field5605);
               var6 = var5.toByteArray();
            } else {
               var6 = var3;
            }

            if (var6.length != 65) {
               throw new RuntimeException();
            } else {
               byte[] var7 = class856.method5512(var1.field931, 5, var1.field935 - var3.length - 5);

               for(int var8 = 0; var8 < 64; ++var8) {
                  if (var6[var8 + 1] != var7[var8]) {
                     throw new RuntimeException();
                  }
               }

               this.field5606 = var1;
               if (this.field5603 == null) {
                  this.field5603 = new class41[var2];
               } else {
                  for(int var9 = 0; var9 < this.field5603.length; ++var9) {
                     if (this.field5603[var9] != null) {
                        this.field5606.field935 = var9 * 72 + 6;
                        int var10 = this.field5606.method1591();
                        int var11 = this.field5606.method1591();
                        byte[] var12 = new byte[64];
                        this.field5606.method1602(var12, 0, 64);
                        this.field5603[var9].method618(var10, var12, var11);
                     }
                  }
               }

               return true;
            }
         }
      }
   }

   @deob.ObfuscatedName("lo.k(ILon;Lon;B)Labl;")
   public class41 method8984(int arg0, class704 arg1, class704 arg2) {
      return this.method8981(arg0, arg1, arg2, true);
   }

   @deob.ObfuscatedName("lo.d(ILon;Lon;ZB)Labl;")
   private class41 method8981(int arg0, class704 arg1, class704 arg2, boolean arg3) {
      if (this.field5606 == null) {
         throw new RuntimeException();
      } else if (arg0 >= 0 && arg0 < this.field5603.length) {
         if (this.field5603[arg0] != null) {
            return this.field5603[arg0];
         } else {
            this.field5606.field935 = arg0 * 72 + 6;
            int var5 = this.field5606.method1591();
            int var6 = this.field5606.method1591();
            byte[] var7 = new byte[64];
            this.field5606.method1602(var7, 0, 64);
            class41 var8 = new class41(arg0, arg1, arg2, this.field5608, this.field5604, var5, var7, var6, arg3);
            this.field5603[arg0] = var8;
            return var8;
         }
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("lo.b(I)V")
   public void method8980() {
      if (this.field5603 != null) {
         for(int var1 = 0; var1 < this.field5603.length; ++var1) {
            if (this.field5603[var1] != null) {
               this.field5603[var1].method623();
            }
         }

         for(int var2 = 0; var2 < this.field5603.length; ++var2) {
            if (this.field5603[var2] != null) {
               this.field5603[var2].method652();
            }
         }

      }
   }
}
