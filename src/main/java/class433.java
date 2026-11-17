@deob.ObfuscatedName("eu")
public class class433 {
   @deob.ObfuscatedName("eu.n")
   private class124 field3602 = new class124((byte[])null);
   @deob.ObfuscatedName("eu.s")
   private static final byte[] field3610 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @deob.ObfuscatedName("eu.k")
   public int field3604;
   @deob.ObfuscatedName("eu.o")
   private int field3607;
   @deob.ObfuscatedName("eu.x")
   private long field3609;
   @deob.ObfuscatedName("eu.d")
   private int[] field3603;
   @deob.ObfuscatedName("eu.r")
   public int[] field3605;
   @deob.ObfuscatedName("eu.b")
   private int[] field3608;
   @deob.ObfuscatedName("eu.p")
   private int[] field3612;

   public class433(byte[] arg0) {
      this.method5972(arg0);
   }

   public class433() {
   }

   @deob.ObfuscatedName("eu.n([B)V")
   public void method5972(byte[] arg0) {
      this.field3602.field931 = arg0;
      this.field3602.field935 = 10;
      int var2 = this.field3602.method1587();
      this.field3604 = this.field3602.method1587();
      this.field3607 = 500000;
      this.field3603 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var4 = this.field3602.method1591();
         int var5 = this.field3602.method1591();
         if (var4 == 1297379947) {
            this.field3603[var3] = this.field3602.field935;
            ++var3;
         }

         this.field3602.field935 += var5;
      }

      this.field3609 = 0L;
      this.field3608 = new int[var2];

      for(int var6 = 0; var6 < var2; ++var6) {
         this.field3608[var6] = this.field3603[var6];
      }

      this.field3605 = new int[var2];
      this.field3612 = new int[var2];
   }

   @deob.ObfuscatedName("eu.k()V")
   public void method5973() {
      this.field3602.field931 = null;
      this.field3603 = null;
      this.field3608 = null;
      this.field3605 = null;
      this.field3612 = null;
   }

   @deob.ObfuscatedName("eu.d()Z")
   public boolean method5974() {
      return this.field3602.field931 != null;
   }

   @deob.ObfuscatedName("eu.b()I")
   public int method5977() {
      return this.field3608.length;
   }

   @deob.ObfuscatedName("eu.r(I)V")
   public void method5976(int arg0) {
      this.field3602.field935 = this.field3608[arg0];
   }

   @deob.ObfuscatedName("eu.p(I)V")
   public void method5996(int arg0) {
      this.field3608[arg0] = this.field3602.field935;
   }

   @deob.ObfuscatedName("eu.o()V")
   public void method6006() {
      this.field3602.field935 = -1;
   }

   @deob.ObfuscatedName("eu.a(I)V")
   public void method5979(int arg0) {
      int var2 = this.field3602.method1596();
      this.field3605[arg0] += var2;
   }

   @deob.ObfuscatedName("eu.x(I)I")
   public int method5975(int arg0) {
      return this.method5981(arg0);
   }

   @deob.ObfuscatedName("eu.s(I)I")
   private int method5981(int arg0) {
      byte var2 = this.field3602.field931[this.field3602.field935];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field3612[arg0] = var3;
         ++this.field3602.field935;
      } else {
         var3 = this.field3612[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method5982(arg0, var3);
      } else {
         int var4 = this.field3602.method1596();
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field3602.field931[this.field3602.field935] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field3602.field935;
               this.field3612[arg0] = var5;
               return this.method5982(arg0, var5);
            }
         }

         this.field3602.field935 += var4;
         return 0;
      }
   }

   @deob.ObfuscatedName("eu.l(II)I")
   private int method5982(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field3602.method1688();
         int var4 = this.field3602.method1596();
         if (var3 == 47) {
            this.field3602.field935 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field3602.method1589();
            var4 -= 3;
            int var6 = this.field3605[arg0];
            this.field3609 += (long)(this.field3607 - var5) * (long)var6;
            this.field3607 = var5;
            this.field3602.field935 += var4;
            return 2;
         } else {
            this.field3602.field935 += var4;
            return 3;
         }
      } else {
         byte var7 = field3610[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field3602.method1688() << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field3602.method1688() << 16;
         }

         return var8;
      }
   }

   @deob.ObfuscatedName("eu.u(I)J")
   public long method5983(int arg0) {
      return (long)this.field3607 * (long)arg0 + this.field3609;
   }

   @deob.ObfuscatedName("eu.v()I")
   public int method5978() {
      int var1 = this.field3608.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field3608[var4] >= 0 && this.field3605[var4] < var3) {
            var2 = var4;
            var3 = this.field3605[var4];
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("eu.g()Z")
   public boolean method5985() {
      int var1 = this.field3608.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field3608[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @deob.ObfuscatedName("eu.h(J)V")
   public void method5988(long arg0) {
      this.field3609 = arg0;
      int var3 = this.field3608.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field3605[var4] = 0;
         this.field3612[var4] = 0;
         this.field3602.field935 = this.field3603[var4];
         this.method5979(var4);
         this.field3608[var4] = this.field3602.field935;
      }

   }
}
