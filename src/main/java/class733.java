@deob.ObfuscatedName("pp")
public class class733 {
   @deob.ObfuscatedName("pp.d")
   public int field6727 = -1;
   @deob.ObfuscatedName("pp.b")
   public int field6728 = -1;
   @deob.ObfuscatedName("pp.o")
   public int field6759 = -1;
   @deob.ObfuscatedName("pp.a")
   public int field6730 = 0;
   @deob.ObfuscatedName("pp.g")
   public boolean field6738 = true;
   @deob.ObfuscatedName("pp.h")
   public boolean field6753 = false;
   @deob.ObfuscatedName("pp.e")
   public boolean field6731 = true;
   @deob.ObfuscatedName("pp.z")
   public String[] field6741 = new String[5];
   @deob.ObfuscatedName("pp.i")
   private int field6740 = -1;
   @deob.ObfuscatedName("pp.w")
   private int field6749 = -1;
   @deob.ObfuscatedName("pp.q")
   private int field6747 = -1;
   @deob.ObfuscatedName("pp.f")
   private int field6767 = -1;
   @deob.ObfuscatedName("pp.ai")
   private int field6751 = -1;
   @deob.ObfuscatedName("pp.av")
   public int field6758 = Integer.MAX_VALUE;
   @deob.ObfuscatedName("pp.ax")
   public int field6744 = Integer.MAX_VALUE;
   @deob.ObfuscatedName("pp.af")
   public int field6755 = Integer.MIN_VALUE;
   @deob.ObfuscatedName("pp.at")
   public int field6756 = Integer.MIN_VALUE;
   @deob.ObfuscatedName("pp.aw")
   public int field6750 = -1;
   @deob.ObfuscatedName("pp.al")
   public int field6752 = -1;
   @deob.ObfuscatedName("pp.an")
   public int field6760 = -1;
   @deob.ObfuscatedName("pp.ab")
   public boolean field6765 = true;
   @deob.ObfuscatedName("pp.ae")
   public int field6735 = -1;
   @deob.ObfuscatedName("pp.t")
   private int field6725;
   @deob.ObfuscatedName("pp.k")
   public int field6726;
   @deob.ObfuscatedName("pp.u")
   public int field6736;
   @deob.ObfuscatedName("pp.v")
   public int field6737;
   @deob.ObfuscatedName("pp.p")
   public int field6739;
   @deob.ObfuscatedName("pp.c")
   private int field6745;
   @deob.ObfuscatedName("pp.y")
   private int field6748;
   @deob.ObfuscatedName("pp.ah")
   public int field6757;
   @deob.ObfuscatedName("pp.ag")
   public int field6761;
   @deob.ObfuscatedName("pp.ak")
   public int field6762;
   @deob.ObfuscatedName("pp.j")
   private int field6766;
   @deob.ObfuscatedName("pp.n")
   public class721 field6734;
   @deob.ObfuscatedName("pp.az")
   private class875 field6746;
   @deob.ObfuscatedName("pp.r")
   public String field6729;
   @deob.ObfuscatedName("pp.m")
   public String field6742;
   @deob.ObfuscatedName("pp.ao")
   public byte[] field6764;
   @deob.ObfuscatedName("pp.ap")
   public int[] field6754;
   @deob.ObfuscatedName("pp.aa")
   public int[] field6763;

   @deob.ObfuscatedName("pp.n(Laen;I)V")
   public void method10820(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method10821(arg0, var2);
      }
   }

   @deob.ObfuscatedName("pp.k(Laen;II)V")
   private void method10821(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field6727 = arg0.method1608();
      } else if (arg1 == 2) {
         this.field6728 = arg0.method1608();
      } else if (arg1 == 3) {
         this.field6729 = arg0.method1599();
      } else if (arg1 == 4) {
         this.field6739 = arg0.method1589();
      } else if (arg1 == 5) {
         this.field6759 = arg0.method1589();
      } else if (arg1 == 6) {
         this.field6730 = arg0.method1688();
      } else if (arg1 == 7) {
         int var3 = arg0.method1688();
         if ((var3 & 1) == 0) {
            this.field6738 = false;
         }

         if ((var3 & 2) == 2) {
            this.field6753 = true;
         }
      } else if (arg1 == 8) {
         this.field6731 = arg0.method1688() == 1;
      } else if (arg1 == 9) {
         this.field6749 = arg0.method1587();
         if (this.field6749 == 65535) {
            this.field6749 = -1;
         }

         this.field6747 = arg0.method1587();
         if (this.field6747 == 65535) {
            this.field6747 = -1;
         }

         this.field6725 = arg0.method1591();
         this.field6745 = arg0.method1591();
      } else if (arg1 >= 10 && arg1 <= 14) {
         this.field6741[arg1 - 10] = arg0.method1599();
      } else if (arg1 == 15) {
         int var4 = arg0.method1688();
         this.field6754 = new int[var4 * 2];

         for(int var5 = 0; var5 < var4 * 2; ++var5) {
            this.field6754[var5] = arg0.method1723();
         }

         this.field6757 = arg0.method1591();
         int var6 = arg0.method1688();
         this.field6763 = new int[var6];

         for(int var7 = 0; var7 < this.field6763.length; ++var7) {
            this.field6763[var7] = arg0.method1591();
         }

         this.field6764 = new byte[var4];

         for(int var8 = 0; var8 < var4; ++var8) {
            this.field6764[var8] = arg0.method1623();
         }
      } else if (arg1 == 16) {
         this.field6765 = false;
      } else if (arg1 == 17) {
         this.field6742 = arg0.method1599();
      } else if (arg1 == 18) {
         this.field6740 = arg0.method1608();
      } else if (arg1 == 19) {
         this.field6735 = arg0.method1587();
      } else if (arg1 == 20) {
         this.field6767 = arg0.method1587();
         if (this.field6767 == 65535) {
            this.field6767 = -1;
         }

         this.field6751 = arg0.method1587();
         if (this.field6751 == 65535) {
            this.field6751 = -1;
         }

         this.field6748 = arg0.method1591();
         this.field6766 = arg0.method1591();
      } else if (arg1 == 21) {
         this.field6737 = arg0.method1591();
      } else if (arg1 == 22) {
         this.field6736 = arg0.method1591();
      } else if (arg1 == 23) {
         this.field6750 = arg0.method1688();
         this.field6752 = arg0.method1688();
         this.field6760 = arg0.method1688();
      } else if (arg1 == 24) {
         this.field6761 = arg0.method1723();
         this.field6762 = arg0.method1723();
      } else if (arg1 == 249) {
         int var9 = arg0.method1688();
         if (this.field6746 == null) {
            int var10 = class887.method4053(var9);
            this.field6746 = new class875(var10);
         }

         for(int var11 = 0; var11 < var9; ++var11) {
            boolean var12 = arg0.method1688() == 1;
            int var13 = arg0.method1589();
            class674 var14;
            if (var12) {
               var14 = new class106(arg0.method1599());
            } else {
               var14 = new class108(arg0.method1591());
            }

            this.field6746.method15311(var14, (long)var13);
         }
      }

   }

   @deob.ObfuscatedName("pp.d(B)V")
   public void method10819() {
      if (this.field6754 != null) {
         for(int var1 = 0; var1 < this.field6754.length; var1 += 2) {
            if (this.field6754[var1] < this.field6758) {
               this.field6758 = this.field6754[var1];
            } else if (this.field6754[var1] > this.field6755) {
               this.field6755 = this.field6754[var1];
            }

            if (this.field6754[var1 + 1] < this.field6744) {
               this.field6744 = this.field6754[var1 + 1];
            } else if (this.field6754[var1 + 1] > this.field6756) {
               this.field6756 = this.field6754[var1 + 1];
            }
         }
      }

   }

   @deob.ObfuscatedName("pp.b(Lum;I)Z")
   public boolean method10825(class865 arg0) {
      int var2;
      if (this.field6747 != -1) {
         var2 = arg0.method5491(this.field6747);
      } else {
         if (this.field6749 == -1) {
            return true;
         }

         var2 = arg0.method5490(this.field6749);
      }

      if (var2 >= this.field6725 && var2 <= this.field6745) {
         boolean var3 = false;
         int var4;
         if (this.field6751 != -1) {
            var4 = arg0.method5491(this.field6751);
         } else {
            if (this.field6767 == -1) {
               return true;
            }

            var4 = arg0.method5490(this.field6767);
         }

         return var4 >= this.field6748 && var4 <= this.field6766;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("pp.r(Lra;ZI)Lcy;")
   public class383 method10824(class772 arg0, boolean arg1) {
      int var3 = arg1 ? this.field6728 : this.field6727;
      int var4 = var3 | arg0.field7106 << 29;
      class383 var5 = (class383)this.field6734.field6673.method10909((long)var4);
      if (var5 != null) {
         return var5;
      } else if (!this.field6734.field6669.method8790(var3)) {
         return null;
      } else {
         class407 var6 = class375.method5065(this.field6734.field6669, var3, 0);
         if (var6 != null) {
            var5 = arg0.method7529(var6, true);
            this.field6734.field6673.method10880(var5, (long)var4);
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("pp.p(Lra;I)Lcy;")
   public class383 method10845(class772 arg0) {
      class383 var2 = (class383)this.field6734.field6673.method10909((long)(this.field6740 | 131072 | arg0.field7106 << 29));
      if (var2 != null) {
         return var2;
      } else {
         this.field6734.field6669.method8790(this.field6740);
         class407 var3 = class375.method5065(this.field6734.field6669, this.field6740, 0);
         if (var3 != null) {
            var2 = arg0.method7529(var3, true);
            this.field6734.field6673.method10880(var2, (long)(this.field6740 | 131072 | arg0.field7106 << 29));
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("pp.o(III)I")
   public int method10826(int arg0, int arg1) {
      if (this.field6746 == null) {
         return arg1;
      } else {
         class108 var3 = (class108)this.field6746.method15322((long)arg0);
         return var3 == null ? arg1 : var3.field811;
      }
   }

   @deob.ObfuscatedName("pp.a(ILjava/lang/String;I)Ljava/lang/String;")
   public String method10827(int arg0, String arg1) {
      if (this.field6746 == null) {
         return arg1;
      } else {
         class106 var3 = (class106)this.field6746.method15322((long)arg0);
         return var3 == null ? arg1 : (String)var3.field807;
      }
   }
}
