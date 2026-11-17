import java.util.Arrays;
import java.util.Random;

@deob.ObfuscatedName("mi")
public class class645 {
   @deob.ObfuscatedName("mi.x")
   private int[] field5841 = new int[]{0, 0, 0, 0, 0};
   @deob.ObfuscatedName("mi.s")
   private int[] field5825 = new int[]{0, 0, 0, 0, 0};
   @deob.ObfuscatedName("mi.l")
   private int[] field5826 = new int[]{0, 0, 0, 0, 0};
   @deob.ObfuscatedName("mi.u")
   private int field5827 = 0;
   @deob.ObfuscatedName("mi.v")
   private int field5836 = 100;
   @deob.ObfuscatedName("mi.e")
   public int field5831 = 500;
   @deob.ObfuscatedName("mi.z")
   public int field5817 = 0;
   @deob.ObfuscatedName("mi.i")
   private static int[] field5824 = new int[32768];
   @deob.ObfuscatedName("mi.t")
   private static int[] field5834;
   @deob.ObfuscatedName("mi.m")
   private static int[] field5833;
   @deob.ObfuscatedName("mi.w")
   private static int[] field5837;
   @deob.ObfuscatedName("mi.q")
   private static int[] field5838;
   @deob.ObfuscatedName("mi.y")
   private static int[] field5835;
   @deob.ObfuscatedName("mi.j")
   private static int[] field5840;
   @deob.ObfuscatedName("mi.f")
   private static int[] field5828;
   @deob.ObfuscatedName("mi.h")
   private class662 field5816;
   @deob.ObfuscatedName("mi.b")
   private class662 field5819;
   @deob.ObfuscatedName("mi.r")
   private class662 field5820;
   @deob.ObfuscatedName("mi.p")
   private class662 field5821;
   @deob.ObfuscatedName("mi.o")
   private class662 field5822;
   @deob.ObfuscatedName("mi.a")
   private class662 field5823;
   @deob.ObfuscatedName("mi.d")
   private class662 field5830;
   @deob.ObfuscatedName("mi.k")
   private class662 field5832;
   @deob.ObfuscatedName("mi.n")
   private class662 field5839;
   @deob.ObfuscatedName("mi.g")
   private class669 field5829;

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field5824[var1] = (var0.nextInt() & 2) - 1;
      }

      field5834 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field5834[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field5833 = new int[220500];
      field5837 = new int[5];
      field5838 = new int[5];
      field5835 = new int[5];
      field5840 = new int[5];
      field5828 = new int[5];
   }

   @deob.ObfuscatedName("mi.n(II)[I")
   public final int[] method9282(int arg0, int arg1) {
      Arrays.fill(field5833, 0, arg0, 0);
      if (arg1 < 10) {
         return field5833;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field5839.method9686();
         this.field5832.method9686();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field5830 != null) {
            this.field5830.method9686();
            this.field5819.method9686();
            var5 = (int)((double)(this.field5830.field6067 - this.field5830.field6069) * 32.768D / var3);
            var6 = (int)((double)this.field5830.field6069 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field5820 != null) {
            this.field5820.method9686();
            this.field5821.method9686();
            var8 = (int)((double)(this.field5820.field6067 - this.field5820.field6069) * 32.768D / var3);
            var9 = (int)((double)this.field5820.field6069 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field5841[var11] != 0) {
               field5837[var11] = 0;
               field5838[var11] = (int)((double)this.field5826[var11] * var3);
               field5835[var11] = (this.field5841[var11] << 14) / 100;
               field5840[var11] = (int)((double)(this.field5839.field6067 - this.field5839.field6069) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field5825[var11]) / var3);
               field5828[var11] = (int)((double)this.field5839.field6069 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var13 = this.field5839.method9690(arg0);
            int var14 = this.field5832.method9690(arg0);
            if (this.field5830 != null) {
               int var15 = this.field5830.method9690(arg0);
               int var16 = this.field5819.method9690(arg0);
               var13 += this.method9287(var7, var16, this.field5830.field6068) >> 1;
               var7 += (var5 * var15 >> 16) + var6;
            }

            if (this.field5820 != null) {
               int var17 = this.field5820.method9690(arg0);
               int var18 = this.field5821.method9690(arg0);
               var14 = var14 * ((this.method9287(var10, var18, this.field5820.field6068) >> 1) + 32768) >> 15;
               var10 += (var8 * var17 >> 16) + var9;
            }

            for(int var19 = 0; var19 < 5; ++var19) {
               if (this.field5841[var19] != 0) {
                  int var20 = field5838[var19] + var12;
                  if (var20 < arg0) {
                     field5833[var20] += this.method9287(field5837[var19], field5835[var19] * var14 >> 15, this.field5839.field6068);
                     field5837[var19] += (field5840[var19] * var13 >> 16) + field5828[var19];
                  }
               }
            }
         }

         if (this.field5822 != null) {
            this.field5822.method9686();
            this.field5823.method9686();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;

            for(int var24 = 0; var24 < arg0; ++var24) {
               int var25 = this.field5822.method9690(arg0);
               int var26 = this.field5823.method9690(arg0);
               int var27;
               if (var23) {
                  var27 = ((this.field5822.field6067 - this.field5822.field6069) * var25 >> 8) + this.field5822.field6069;
               } else {
                  var27 = ((this.field5822.field6067 - this.field5822.field6069) * var26 >> 8) + this.field5822.field6069;
               }

               var21 += 256;
               if (var21 >= var27) {
                  var21 = 0;
                  var23 = !var23;
               }

               if (var23) {
                  field5833[var24] = 0;
               }
            }
         }

         if (this.field5827 > 0 && this.field5836 > 0) {
            int var28 = (int)((double)this.field5827 * var3);

            for(int var29 = var28; var29 < arg0; ++var29) {
               field5833[var29] += field5833[var29 - var28] * this.field5836 / 100;
            }
         }

         if (this.field5829.field6087[0] > 0 || this.field5829.field6087[1] > 0) {
            this.field5816.method9686();
            int var30 = this.field5816.method9690(arg0 + 1);
            int var31 = this.field5829.method9736(0, (float)var30 / 65536.0F);
            int var32 = this.field5829.method9736(1, (float)var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
               int var33 = 0;
               int var34 = var32;
               if (var32 > arg0 - var31) {
                  var34 = arg0 - var31;
               }

               while(var33 < var34) {
                  int var35 = (int)((long)field5833[var31 + var33] * (long)Statics.field6091 >> 16);

                  for(int var36 = 0; var36 < var31; ++var36) {
                     var35 += (int)((long)field5833[var31 + var33 - 1 - var36] * (long)class669.field6086[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var33; ++var37) {
                     var35 -= (int)((long)field5833[var33 - 1 - var37] * (long)class669.field6086[1][var37] >> 16);
                  }

                  field5833[var33] = var35;
                  var30 = this.field5816.method9690(arg0 + 1);
                  ++var33;
               }

               int var38 = 128;

               while(true) {
                  if (var38 > arg0 - var31) {
                     var38 = arg0 - var31;
                  }

                  while(var33 < var38) {
                     int var39 = (int)((long)field5833[var31 + var33] * (long)Statics.field6091 >> 16);

                     for(int var40 = 0; var40 < var31; ++var40) {
                        var39 += (int)((long)field5833[var31 + var33 - 1 - var40] * (long)class669.field6086[0][var40] >> 16);
                     }

                     for(int var41 = 0; var41 < var32; ++var41) {
                        var39 -= (int)((long)field5833[var33 - 1 - var41] * (long)class669.field6086[1][var41] >> 16);
                     }

                     field5833[var33] = var39;
                     var30 = this.field5816.method9690(arg0 + 1);
                     ++var33;
                  }

                  if (var33 >= arg0 - var31) {
                     while(var33 < arg0) {
                        int var42 = 0;

                        for(int var43 = var31 + var33 - arg0; var43 < var31; ++var43) {
                           var42 += (int)((long)field5833[var31 + var33 - 1 - var43] * (long)class669.field6086[0][var43] >> 16);
                        }

                        for(int var44 = 0; var44 < var32; ++var44) {
                           var42 -= (int)((long)field5833[var33 - 1 - var44] * (long)class669.field6086[1][var44] >> 16);
                        }

                        field5833[var33] = var42;
                        this.field5816.method9690(arg0 + 1);
                        ++var33;
                     }
                     break;
                  }

                  var31 = this.field5829.method9736(0, (float)var30 / 65536.0F);
                  var32 = this.field5829.method9736(1, (float)var30 / 65536.0F);
                  var38 += 128;
               }
            }
         }

         for(int var46 = 0; var46 < arg0; ++var46) {
            if (field5833[var46] < -32768) {
               field5833[var46] = -32768;
            }

            if (field5833[var46] > 32767) {
               field5833[var46] = 32767;
            }
         }

         return field5833;
      }
   }

   @deob.ObfuscatedName("mi.k(III)I")
   private final int method9287(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field5834[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field5824[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }

   @deob.ObfuscatedName("mi.d(Laen;)V")
   public final void method9281(class124 arg0) {
      this.field5839 = new class662();
      this.field5839.method9680(arg0);
      this.field5832 = new class662();
      this.field5832.method9680(arg0);
      int var2 = arg0.method1688();
      if (var2 != 0) {
         --arg0.field935;
         this.field5830 = new class662();
         this.field5830.method9680(arg0);
         this.field5819 = new class662();
         this.field5819.method9680(arg0);
      }

      int var3 = arg0.method1688();
      if (var3 != 0) {
         --arg0.field935;
         this.field5820 = new class662();
         this.field5820.method9680(arg0);
         this.field5821 = new class662();
         this.field5821.method9680(arg0);
      }

      int var4 = arg0.method1688();
      if (var4 != 0) {
         --arg0.field935;
         this.field5822 = new class662();
         this.field5822.method9680(arg0);
         this.field5823 = new class662();
         this.field5823.method9680(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method1604();
         if (var6 == 0) {
            break;
         }

         this.field5841[var5] = var6;
         this.field5825[var5] = arg0.method1603();
         this.field5826[var5] = arg0.method1604();
      }

      this.field5827 = arg0.method1604();
      this.field5836 = arg0.method1604();
      this.field5831 = arg0.method1587();
      this.field5817 = arg0.method1587();
      this.field5829 = new class669();
      this.field5816 = new class662();
      this.field5829.method9733(arg0, this.field5816);
   }
}
