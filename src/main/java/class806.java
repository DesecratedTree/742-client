@deob.ObfuscatedName("sh")
public class class806 {
   @deob.ObfuscatedName("sh.n")
   public static boolean field8355 = false;
   @deob.ObfuscatedName("sh.a")
   public int field8362 = -1;
   @deob.ObfuscatedName("sh.s")
   public int field8365 = 5;
   @deob.ObfuscatedName("sh.l")
   public int field8361 = -1;
   @deob.ObfuscatedName("sh.u")
   public int field8366 = -1;
   @deob.ObfuscatedName("sh.v")
   public int field8364 = 99;
   @deob.ObfuscatedName("sh.g")
   public int field8368 = -1;
   @deob.ObfuscatedName("sh.h")
   public int field8369 = -1;
   @deob.ObfuscatedName("sh.e")
   public int field8370 = 2;
   @deob.ObfuscatedName("sh.z")
   public boolean field8371 = false;
   @deob.ObfuscatedName("sh.m")
   public boolean field8372 = false;
   @deob.ObfuscatedName("sh.i")
   public boolean field8367 = false;
   @deob.ObfuscatedName("sh.y")
   public int field8378 = -1;
   @deob.ObfuscatedName("sh.d")
   public int field8357;
   @deob.ObfuscatedName("sh.k")
   public class818 field8356;
   @deob.ObfuscatedName("sh.q")
   private class875 field8377;
   @deob.ObfuscatedName("sh.b")
   public int[] field8358;
   @deob.ObfuscatedName("sh.t")
   public int[] field8359;
   @deob.ObfuscatedName("sh.r")
   public int[] field8360;
   @deob.ObfuscatedName("sh.c")
   public int[] field8373;
   @deob.ObfuscatedName("sh.p")
   public int[] field8374;
   @deob.ObfuscatedName("sh.w")
   public int[] field8376;
   @deob.ObfuscatedName("sh.x")
   public boolean[] field8363;
   @deob.ObfuscatedName("sh.o")
   public int[][] field8375;

   @deob.ObfuscatedName("sh.n(Laen;B)V")
   public void method14320(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method14308(arg0, var2);
      }
   }

   @deob.ObfuscatedName("sh.k(Laen;II)V")
   private void method14308(class124 arg0, int arg1) {
      if (arg1 == 1) {
         int var3 = arg0.method1587();
         this.field8374 = new int[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field8374[var4] = arg0.method1587();
         }

         this.field8358 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            this.field8358[var5] = arg0.method1587();
         }

         for(int var6 = 0; var6 < var3; ++var6) {
            this.field8358[var6] += arg0.method1587() << 16;
         }
      } else if (arg1 == 2) {
         this.field8362 = arg0.method1587();
      } else if (arg1 == 3) {
         this.field8363 = new boolean[256];
         int var7 = arg0.method1688();

         for(int var8 = 0; var8 < var7; ++var8) {
            this.field8363[arg0.method1688()] = true;
         }
      } else if (arg1 == 5) {
         this.field8365 = arg0.method1688();
      } else if (arg1 == 6) {
         this.field8361 = arg0.method1587();
      } else if (arg1 == 7) {
         this.field8366 = arg0.method1587();
      } else if (arg1 == 8) {
         this.field8364 = arg0.method1688();
      } else if (arg1 == 9) {
         this.field8368 = arg0.method1688();
      } else if (arg1 == 10) {
         this.field8369 = arg0.method1688();
      } else if (arg1 == 11) {
         this.field8370 = arg0.method1688();
      } else if (arg1 == 12) {
         int var9 = arg0.method1688();
         this.field8360 = new int[var9];

         for(int var10 = 0; var10 < var9; ++var10) {
            this.field8360[var10] = arg0.method1587();
         }

         for(int var11 = 0; var11 < var9; ++var11) {
            this.field8360[var11] += arg0.method1587() << 16;
         }
      } else if (arg1 == 13) {
         int var12 = arg0.method1587();
         this.field8375 = new int[var12][];

         for(int var13 = 0; var13 < var12; ++var13) {
            int var14 = arg0.method1688();
            if (var14 > 0) {
               this.field8375[var13] = new int[var14];
               this.field8375[var13][0] = arg0.method1589();

               for(int var15 = 1; var15 < var14; ++var15) {
                  this.field8375[var13][var15] = arg0.method1587();
               }
            }
         }
      } else if (arg1 == 14) {
         this.field8371 = true;
      } else if (arg1 == 15) {
         this.field8372 = true;
      } else if (arg1 != 16) {
         if (arg1 == 18) {
            this.field8367 = true;
         } else if (arg1 == 19) {
            if (this.field8359 == null) {
               this.field8359 = new int[this.field8375.length];

               for(int var16 = 0; var16 < this.field8375.length; ++var16) {
                  this.field8359[var16] = 255;
               }
            }

            this.field8359[arg0.method1688()] = arg0.method1688();
         } else if (arg1 == 20) {
            if (this.field8373 == null || this.field8376 == null) {
               this.field8373 = new int[this.field8375.length];
               this.field8376 = new int[this.field8375.length];

               for(int var17 = 0; var17 < this.field8375.length; ++var17) {
                  this.field8373[var17] = 256;
                  this.field8376[var17] = 256;
               }
            }

            int var18 = arg0.method1688();
            this.field8373[var18] = arg0.method1587();
            this.field8376[var18] = arg0.method1587();
         } else if (arg1 == 22) {
            this.field8378 = arg0.method1688();
         } else if (arg1 == 249) {
            int var19 = arg0.method1688();
            if (this.field8377 == null) {
               int var20 = class887.method4053(var19);
               this.field8377 = new class875(var20);
            }

            for(int var21 = 0; var21 < var19; ++var21) {
               boolean var22 = arg0.method1688() == 1;
               int var23 = arg0.method1589();
               class674 var24;
               if (var22) {
                  var24 = new class106(arg0.method1599());
               } else {
                  var24 = new class108(arg0.method1591());
               }

               this.field8377.method15311(var24, (long)var23);
            }
         }
      }

   }

   @deob.ObfuscatedName("sh.d(I)V")
   public void method14309() {
      if (this.field8368 == -1) {
         if (this.field8363 != null) {
            this.field8368 = 2;
         } else {
            this.field8368 = 0;
         }
      }

      if (this.field8369 == -1) {
         if (this.field8363 != null) {
            this.field8369 = 2;
         } else {
            this.field8369 = 0;
         }
      }

   }

   @deob.ObfuscatedName("sh.b(I)Z")
   public boolean method14319() {
      if (this.field8358 == null) {
         return true;
      } else {
         boolean var1 = true;
         int[] var2 = this.field8358;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            if (this.field8356.method14480(var4 >>> 16) == null) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @deob.ObfuscatedName("sh.r(IIB)I")
   public int method14311(int arg0, int arg1) {
      if (this.field8377 == null) {
         return arg1;
      } else {
         class108 var3 = (class108)this.field8377.method15322((long)arg0);
         return var3 == null ? arg1 : var3.field811;
      }
   }

   @deob.ObfuscatedName("sh.p(ILjava/lang/String;B)Ljava/lang/String;")
   public String method14307(int arg0, String arg1) {
      if (this.field8377 == null) {
         return arg1;
      } else {
         class106 var3 = (class106)this.field8377.method15322((long)arg0);
         return var3 == null ? arg1 : (String)var3.field807;
      }
   }
}
