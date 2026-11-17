@deob.ObfuscatedName("lg")
public class class616 {
   @deob.ObfuscatedName("lg.k")
   public int field5547;
   @deob.ObfuscatedName("lg.d")
   private byte[] field5548;
   @deob.ObfuscatedName("lg.b")
   public int field5549;
   @deob.ObfuscatedName("lg.r")
   public int field5550;
   @deob.ObfuscatedName("lg.x")
   public int field5554;
   @deob.ObfuscatedName("lg.a")
   public class465 field5553;
   @deob.ObfuscatedName("lg.z")
   public int[] field5551;
   @deob.ObfuscatedName("lg.o")
   public int[] field5552;
   @deob.ObfuscatedName("lg.s")
   public int[] field5555;
   @deob.ObfuscatedName("lg.v")
   public int[] field5556;
   @deob.ObfuscatedName("lg.u")
   public int[] field5557;
   @deob.ObfuscatedName("lg.p")
   public int[] field5562;
   @deob.ObfuscatedName("lg.e")
   public class465[] field5561;
   @deob.ObfuscatedName("lg.l")
   public byte[][] field5546;
   @deob.ObfuscatedName("lg.g")
   public int[][] field5559;
   @deob.ObfuscatedName("lg.h")
   public int[][] field5560;

   public class616(byte[] arg0, int arg1, byte[] arg2) {
      this.field5547 = class124.method15424(arg0, arg0.length);
      if (this.field5547 != arg1) {
         throw new RuntimeException();
      } else {
         if (arg2 != null) {
            if (arg2.length != 64) {
               throw new RuntimeException();
            }

            this.field5548 = class856.method5512(arg0, 0, arg0.length);

            for(int var4 = 0; var4 < 64; ++var4) {
               if (this.field5548[var4] != arg2[var4]) {
                  throw new RuntimeException();
               }
            }
         }

         this.method8887(arg0);
      }
   }

   @deob.ObfuscatedName("lg.n([BI)V")
   private void method8887(byte[] arg0) {
      class124 var2 = new class124(class612.method8525(arg0));
      int var3 = var2.method1688();
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            this.field5549 = var2.method1591();
         } else {
            this.field5549 = 0;
         }

         int var4 = var2.method1688();
         boolean var5 = (var4 & 1) != 0;
         boolean var6 = (var4 & 2) != 0;
         if (var3 >= 7) {
            this.field5550 = var2.method1607();
         } else {
            this.field5550 = var2.method1587();
         }

         int var7 = 0;
         int var8 = -1;
         this.field5562 = new int[this.field5550];
         if (var3 >= 7) {
            for(int var9 = 0; var9 < this.field5550; ++var9) {
               this.field5562[var9] = var7 += var2.method1607();
               if (this.field5562[var9] > var8) {
                  var8 = this.field5562[var9];
               }
            }
         } else {
            for(int var10 = 0; var10 < this.field5550; ++var10) {
               this.field5562[var10] = var7 += var2.method1587();
               if (this.field5562[var10] > var8) {
                  var8 = this.field5562[var10];
               }
            }
         }

         this.field5554 = var8 + 1;
         this.field5555 = new int[this.field5554];
         if (var6) {
            this.field5546 = new byte[this.field5554][];
         }

         this.field5557 = new int[this.field5554];
         this.field5556 = new int[this.field5554];
         this.field5559 = new int[this.field5554][];
         this.field5551 = new int[this.field5554];
         if (var5) {
            this.field5552 = new int[this.field5554];

            for(int var11 = 0; var11 < this.field5554; ++var11) {
               this.field5552[var11] = -1;
            }

            for(int var12 = 0; var12 < this.field5550; ++var12) {
               this.field5552[this.field5562[var12]] = var2.method1591();
            }

            this.field5553 = new class465(this.field5552);
         }

         for(int var13 = 0; var13 < this.field5550; ++var13) {
            this.field5555[this.field5562[var13]] = var2.method1591();
         }

         if (var6) {
            for(int var14 = 0; var14 < this.field5550; ++var14) {
               byte[] var15 = new byte[64];
               var2.method1602(var15, 0, 64);
               this.field5546[this.field5562[var14]] = var15;
            }
         }

         for(int var16 = 0; var16 < this.field5550; ++var16) {
            this.field5557[this.field5562[var16]] = var2.method1591();
         }

         if (var3 >= 7) {
            for(int var17 = 0; var17 < this.field5550; ++var17) {
               this.field5556[this.field5562[var17]] = var2.method1607();
            }

            for(int var18 = 0; var18 < this.field5550; ++var18) {
               int var19 = this.field5562[var18];
               int var20 = this.field5556[var19];
               int var21 = 0;
               int var22 = -1;
               this.field5559[var19] = new int[var20];

               for(int var23 = 0; var23 < var20; ++var23) {
                  int var24 = this.field5559[var19][var23] = var21 += var2.method1607();
                  if (var24 > var22) {
                     var22 = var24;
                  }
               }

               this.field5551[var19] = var22 + 1;
               if (var22 + 1 == var20) {
                  this.field5559[var19] = null;
               }
            }
         } else {
            for(int var25 = 0; var25 < this.field5550; ++var25) {
               this.field5556[this.field5562[var25]] = var2.method1587();
            }

            for(int var26 = 0; var26 < this.field5550; ++var26) {
               int var27 = this.field5562[var26];
               int var28 = this.field5556[var27];
               int var29 = 0;
               int var30 = -1;
               this.field5559[var27] = new int[var28];

               for(int var31 = 0; var31 < var28; ++var31) {
                  int var32 = this.field5559[var27][var31] = var29 += var2.method1587();
                  if (var32 > var30) {
                     var30 = var32;
                  }
               }

               this.field5551[var27] = var30 + 1;
               if (var30 + 1 == var28) {
                  this.field5559[var27] = null;
               }
            }
         }

         if (var5) {
            this.field5560 = new int[var8 + 1][];
            this.field5561 = new class465[var8 + 1];

            for(int var33 = 0; var33 < this.field5550; ++var33) {
               int var34 = this.field5562[var33];
               int var35 = this.field5556[var34];
               this.field5560[var34] = new int[this.field5551[var34]];

               for(int var36 = 0; var36 < this.field5551[var34]; ++var36) {
                  this.field5560[var34][var36] = -1;
               }

               for(int var37 = 0; var37 < var35; ++var37) {
                  int var38;
                  if (this.field5559[var34] != null) {
                     var38 = this.field5559[var34][var37];
                  } else {
                     var38 = var37;
                  }

                  this.field5560[var34][var38] = var2.method1591();
               }

               this.field5561[var34] = new class465(this.field5560[var34]);
            }
         }

      } else {
         throw new RuntimeException();
      }
   }
}
