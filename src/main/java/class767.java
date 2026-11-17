@deob.ObfuscatedName("qw")
public class class767 {
   @deob.ObfuscatedName("qw.p")
   public int field7052 = 0;
   @deob.ObfuscatedName("qw.o")
   public int field7040 = 0;
   @deob.ObfuscatedName("qw.a")
   public boolean field7041 = false;
   @deob.ObfuscatedName("qw.q")
   public int field7036 = -1;
   @deob.ObfuscatedName("qw.x")
   public int field7042;
   @deob.ObfuscatedName("qw.v")
   public int field7046;
   @deob.ObfuscatedName("qw.n")
   public class766 field7056;
   @deob.ObfuscatedName("qw.w")
   private class875 field7055;
   @deob.ObfuscatedName("qw.k")
   public String field7035;
   @deob.ObfuscatedName("qw.d")
   public String field7037;
   @deob.ObfuscatedName("qw.h")
   private int[] field7034;
   @deob.ObfuscatedName("qw.e")
   private int[] field7038;
   @deob.ObfuscatedName("qw.s")
   private int[] field7043;
   @deob.ObfuscatedName("qw.l")
   public int[] field7044;
   @deob.ObfuscatedName("qw.g")
   public int[] field7047;
   @deob.ObfuscatedName("qw.m")
   public int[] field7051;
   @deob.ObfuscatedName("qw.t")
   private int[] field7053;
   @deob.ObfuscatedName("qw.i")
   private int[] field7054;
   @deob.ObfuscatedName("qw.c")
   public String[] field7049;
   @deob.ObfuscatedName("qw.z")
   public String[] field7050;
   @deob.ObfuscatedName("qw.r")
   private int[][] field7039;
   @deob.ObfuscatedName("qw.u")
   public int[][] field7045;
   @deob.ObfuscatedName("qw.b")
   private int[][] field7048;

   @deob.ObfuscatedName("qw.n(Laen;B)V")
   public void method11388(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method11404(arg0, var2);
      }
   }

   @deob.ObfuscatedName("qw.k(Laen;II)V")
   private void method11404(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field7035 = arg0.method1600();
      } else if (arg1 == 2) {
         this.field7037 = arg0.method1600();
      } else if (arg1 == 3) {
         int var3 = arg0.method1688();
         this.field7048 = new int[var3][3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field7048[var4][0] = arg0.method1587();
            this.field7048[var4][1] = arg0.method1591();
            this.field7048[var4][2] = arg0.method1591();
         }
      } else if (arg1 == 4) {
         int var5 = arg0.method1688();
         this.field7039 = new int[var5][3];

         for(int var6 = 0; var6 < var5; ++var6) {
            this.field7039[var6][0] = arg0.method1587();
            this.field7039[var6][1] = arg0.method1591();
            this.field7039[var6][2] = arg0.method1591();
         }
      } else if (arg1 == 5) {
         arg0.method1587();
      } else if (arg1 == 6) {
         this.field7052 = arg0.method1688();
      } else if (arg1 == 7) {
         this.field7040 = arg0.method1688();
      } else if (arg1 == 8) {
         this.field7041 = true;
      } else if (arg1 == 9) {
         this.field7042 = arg0.method1688();
      } else if (arg1 == 10) {
         int var7 = arg0.method1688();
         this.field7043 = new int[var7];

         for(int var8 = 0; var8 < var7; ++var8) {
            this.field7043[var8] = arg0.method1591();
         }
      } else if (arg1 == 12) {
         arg0.method1591();
      } else if (arg1 == 13) {
         int var9 = arg0.method1688();
         this.field7044 = new int[var9];

         for(int var10 = 0; var10 < var9; ++var10) {
            this.field7044[var10] = arg0.method1587();
         }
      } else if (arg1 == 14) {
         int var11 = arg0.method1688();
         this.field7045 = new int[var11][2];

         for(int var12 = 0; var12 < var11; ++var12) {
            this.field7045[var12][0] = arg0.method1688();
            this.field7045[var12][1] = arg0.method1688();
         }
      } else if (arg1 == 15) {
         this.field7046 = arg0.method1587();
      } else if (arg1 == 17) {
         this.field7036 = arg0.method1608();
      } else if (arg1 == 18) {
         int var13 = arg0.method1688();
         this.field7047 = new int[var13];
         this.field7034 = new int[var13];
         this.field7038 = new int[var13];
         this.field7050 = new String[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field7047[var14] = arg0.method1591();
            this.field7034[var14] = arg0.method1591();
            this.field7038[var14] = arg0.method1591();
            this.field7050[var14] = arg0.method1599();
         }
      } else if (arg1 == 19) {
         int var15 = arg0.method1688();
         this.field7051 = new int[var15];
         this.field7054 = new int[var15];
         this.field7053 = new int[var15];
         this.field7049 = new String[var15];

         for(int var16 = 0; var16 < var15; ++var16) {
            this.field7051[var16] = arg0.method1591();
            this.field7054[var16] = arg0.method1591();
            this.field7053[var16] = arg0.method1591();
            this.field7049[var16] = arg0.method1599();
         }
      } else if (arg1 == 249) {
         int var17 = arg0.method1688();
         if (this.field7055 == null) {
            int var18 = class887.method4053(var17);
            this.field7055 = new class875(var18);
         }

         for(int var19 = 0; var19 < var17; ++var19) {
            boolean var20 = arg0.method1688() == 1;
            int var21 = arg0.method1589();
            class674 var22;
            if (var20) {
               var22 = new class106(arg0.method1599());
            } else {
               var22 = new class108(arg0.method1591());
            }

            this.field7055.method15311(var22, (long)var21);
         }
      }

   }

   @deob.ObfuscatedName("qw.d(B)V")
   public void method11390() {
      if (this.field7037 == null) {
         this.field7037 = this.field7035;
      }

   }

   @deob.ObfuscatedName("qw.b(III)I")
   public int method11412(int arg0, int arg1) {
      if (this.field7055 == null) {
         return arg1;
      } else {
         class108 var3 = (class108)this.field7055.method15322((long)arg0);
         return var3 == null ? arg1 : var3.field811;
      }
   }

   @deob.ObfuscatedName("qw.r(ILjava/lang/String;I)Ljava/lang/String;")
   public String method11392(int arg0, String arg1) {
      if (this.field7055 == null) {
         return arg1;
      } else {
         class106 var3 = (class106)this.field7055.method15322((long)arg0);
         return var3 == null ? arg1 : (String)var3.field807;
      }
   }

   @deob.ObfuscatedName("qw.p(Lum;I)Z")
   public boolean method11393(class865 arg0) {
      if (this.field7048 != null) {
         for(int var2 = 0; var2 < this.field7048.length; ++var2) {
            if (arg0.method5491(this.field7048[var2][0]) >= this.field7048[var2][1]) {
               return true;
            }
         }
      }

      if (this.field7039 != null) {
         for(int var3 = 0; var3 < this.field7039.length; ++var3) {
            if (arg0.method5490(this.field7039[var3][0]) >= this.field7039[var3][1]) {
               return true;
            }
         }
      }

      return false;
   }

   @deob.ObfuscatedName("qw.o(Lum;I)Z")
   public boolean method11394(class865 arg0) {
      if (this.field7048 != null) {
         for(int var2 = 0; var2 < this.field7048.length; ++var2) {
            if (arg0.method5491(this.field7048[var2][0]) >= this.field7048[var2][2]) {
               return true;
            }
         }
      }

      if (this.field7039 != null) {
         for(int var3 = 0; var3 < this.field7039.length; ++var3) {
            if (arg0.method5490(this.field7039[var3][0]) >= this.field7039[var3][2]) {
               return true;
            }
         }
      }

      return false;
   }

   @deob.ObfuscatedName("qw.a(Lum;[II)Z")
   public boolean method11391(class865 arg0, int[] arg1) {
      if (this.field7056.method11376(arg0) < this.field7046) {
         return false;
      } else {
         if (this.field7045 != null) {
            for(int var3 = 0; var3 < this.field7045.length; ++var3) {
               if (arg1[this.field7045[var3][0]] < this.field7045[var3][1]) {
                  return false;
               }
            }
         }

         if (this.field7044 != null) {
            for(int var4 = 0; var4 < this.field7044.length; ++var4) {
               if (!this.field7056.method11377(this.field7044[var4]).method11394(arg0)) {
                  return false;
               }
            }
         }

         if (this.field7047 != null) {
            for(int var5 = 0; var5 < this.field7047.length; ++var5) {
               int var6 = arg0.method5491(this.field7047[var5]);
               if (var6 < this.field7034[var5] || var6 > this.field7038[var5]) {
                  return false;
               }
            }
         }

         if (this.field7051 != null) {
            for(int var7 = 0; var7 < this.field7051.length; ++var7) {
               int var8 = arg0.method5490(this.field7051[var7]);
               if (var8 < this.field7054[var7] || var8 > this.field7053[var7]) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   @deob.ObfuscatedName("qw.x(Lum;B)Z")
   public boolean method11396(class865 arg0) {
      return this.field7056.method11376(arg0) >= this.field7046;
   }

   @deob.ObfuscatedName("qw.s([III)Z")
   public boolean method11397(int[] arg0, int arg1) {
      if (this.field7045 != null && arg1 >= 0 && arg1 < this.field7045.length) {
         return arg0[this.field7045[arg1][0]] >= this.field7045[arg1][1];
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("qw.l(Lum;II)Z")
   public boolean method11395(class865 arg0, int arg1) {
      if (this.field7044 != null && arg1 >= 0 && arg1 < this.field7044.length) {
         return this.field7056.method11377(this.field7044[arg1]).method11394(arg0);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("qw.u(Lum;IB)Z")
   public boolean method11399(class865 arg0, int arg1) {
      if (this.field7047 != null && arg1 >= 0 && arg1 < this.field7047.length) {
         int var3 = arg0.method5491(this.field7047[arg1]);
         return var3 >= this.field7034[arg1] && var3 <= this.field7038[arg1];
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("qw.v(Lum;II)Z")
   public boolean method11416(class865 arg0, int arg1) {
      if (this.field7051 != null && arg1 >= 0 && arg1 < this.field7051.length) {
         int var3 = arg0.method5490(this.field7051[arg1]);
         return var3 >= this.field7054[arg1] && var3 <= this.field7053[arg1];
      } else {
         return false;
      }
   }
}
