@deob.ObfuscatedName("gn")
public class class480 implements class768 {
   @deob.ObfuscatedName("gn.x")
   private int[] field3880 = new int[]{-1, -1, -1, -1, -1};
   @deob.ObfuscatedName("gn.s")
   public static final int[] field3887 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   @deob.ObfuscatedName("gn.l")
   public static final int[] field3886 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @deob.ObfuscatedName("gn.n")
   public class476 field3881;
   @deob.ObfuscatedName("gn.o")
   private byte[] field3884;
   @deob.ObfuscatedName("gn.a")
   private byte[] field3885;
   @deob.ObfuscatedName("gn.k")
   private int[] field3879;
   @deob.ObfuscatedName("gn.b")
   private short[] field3878;
   @deob.ObfuscatedName("gn.r")
   private short[] field3882;
   @deob.ObfuscatedName("gn.p")
   private short[] field3883;
   @deob.ObfuscatedName("gn.d")
   private short[] field3888;

   @deob.ObfuscatedName("gn.n(Laen;S)V")
   public void method6744(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method6745(arg0, var2);
      }
   }

   @deob.ObfuscatedName("gn.k(Laen;II)V")
   private void method6745(class124 arg0, int arg1) {
      if (arg1 == 1) {
         arg0.method1688();
      } else if (arg1 == 2) {
         int var3 = arg0.method1688();
         this.field3879 = new int[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field3879[var4] = arg0.method1608();
         }
      } else if (arg1 != 3) {
         if (arg1 == 40) {
            int var5 = arg0.method1688();
            this.field3888 = new short[var5];
            this.field3878 = new short[var5];

            for(int var6 = 0; var6 < var5; ++var6) {
               this.field3888[var6] = (short)arg0.method1587();
               this.field3878[var6] = (short)arg0.method1587();
            }
         } else if (arg1 == 41) {
            int var7 = arg0.method1688();
            this.field3882 = new short[var7];
            this.field3883 = new short[var7];

            for(int var8 = 0; var8 < var7; ++var8) {
               this.field3882[var8] = (short)arg0.method1587();
               this.field3883[var8] = (short)arg0.method1587();
            }
         } else if (arg1 == 44) {
            int var9 = arg0.method1587();
            int var10 = 0;

            for(int var11 = var9; var11 > 0; var11 >>= 1) {
               ++var10;
            }

            this.field3884 = new byte[var10];
            byte var12 = 0;

            for(int var13 = 0; var13 < var10; ++var13) {
               if ((var9 & 1 << var13) > 0) {
                  this.field3884[var13] = var12++;
               } else {
                  this.field3884[var13] = -1;
               }
            }
         } else if (arg1 == 45) {
            int var14 = arg0.method1587();
            int var15 = 0;

            for(int var16 = var14; var16 > 0; var16 >>= 1) {
               ++var15;
            }

            this.field3885 = new byte[var15];
            byte var17 = 0;

            for(int var18 = 0; var18 < var15; ++var18) {
               if ((var14 & 1 << var18) > 0) {
                  this.field3885[var18] = var17++;
               } else {
                  this.field3885[var18] = -1;
               }
            }
         } else if (arg1 >= 60 && arg1 < 70) {
            this.field3880[arg1 - 60] = arg0.method1608();
         }
      }

   }

   @deob.ObfuscatedName("gn.d(S)Z")
   public boolean method6760() {
      if (this.field3879 == null) {
         return true;
      } else {
         boolean var1 = true;
         class612 var2 = this.field3881.field3869;
         synchronized(this.field3881.field3869) {
            for(int var3 = 0; var3 < this.field3879.length; ++var3) {
               if (!this.field3881.field3869.method8773(this.field3879[var3], 0)) {
                  var1 = false;
               }
            }

            return var1;
         }
      }
   }

   @deob.ObfuscatedName("gn.b(B)Ldk;")
   public class396 method6746() {
      if (this.field3879 == null) {
         return null;
      } else {
         class396[] var1 = new class396[this.field3879.length];
         class612 var2 = this.field3881.field3869;
         synchronized(this.field3881.field3869) {
            int var3 = 0;

            while(true) {
               if (var3 >= this.field3879.length) {
                  break;
               }

               var1[var3] = class396.method5419(this.field3881.field3869, this.field3879[var3], 0);
               ++var3;
            }
         }

         for(int var5 = 0; var5 < this.field3879.length; ++var5) {
            if (var1[var5].field2934 < 13) {
               var1[var5].method5427(2);
            }
         }

         class396 var6;
         if (var1.length == 1) {
            var6 = var1[0];
         } else {
            var6 = new class396(var1, var1.length);
         }

         if (var6 == null) {
            return null;
         } else {
            if (this.field3888 != null) {
               for(int var7 = 0; var7 < this.field3888.length; ++var7) {
                  var6.method5449(this.field3888[var7], this.field3878[var7]);
               }
            }

            if (this.field3882 != null) {
               for(int var8 = 0; var8 < this.field3882.length; ++var8) {
                  var6.method5410(this.field3882[var8], this.field3883[var8]);
               }
            }

            return var6;
         }
      }
   }

   @deob.ObfuscatedName("gn.r(I)Z")
   public boolean method6747() {
      boolean var1 = true;
      class612 var2 = this.field3881.field3869;
      synchronized(this.field3881.field3869) {
         for(int var3 = 0; var3 < 5; ++var3) {
            if (this.field3880[var3] != -1 && !this.field3881.field3869.method8773(this.field3880[var3], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @deob.ObfuscatedName("gn.p(I)Ldk;")
   public class396 method6748() {
      class396[] var1 = new class396[5];
      int var2 = 0;
      class612 var3 = this.field3881.field3869;
      synchronized(this.field3881.field3869) {
         int var4 = 0;

         while(true) {
            if (var4 >= 5) {
               break;
            }

            if (this.field3880[var4] != -1) {
               var1[var2++] = class396.method5419(this.field3881.field3869, this.field3880[var4], 0);
            }

            ++var4;
         }
      }

      for(int var6 = 0; var6 < 5; ++var6) {
         if (var1[var6] != null && var1[var6].field2934 < 13) {
            var1[var6].method5427(2);
         }
      }

      class396 var7 = new class396(var1, var2);
      if (this.field3888 != null) {
         for(int var8 = 0; var8 < this.field3888.length; ++var8) {
            var7.method5449(this.field3888[var8], this.field3878[var8]);
         }
      }

      if (this.field3882 != null) {
         for(int var9 = 0; var9 < this.field3882.length; ++var9) {
            var7.method5410(this.field3882[var9], this.field3883[var9]);
         }
      }

      return var7;
   }
}
