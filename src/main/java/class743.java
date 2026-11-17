import java.util.Iterator;

@deob.ObfuscatedName("pz")
public class class743 {
   @deob.ObfuscatedName("pz.k")
   public int field6811 = -1;
   @deob.ObfuscatedName("pz.d")
   public int[] field6812 = null;
   @deob.ObfuscatedName("pz.b")
   public int[] field6813 = null;
   @deob.ObfuscatedName("pz.r")
   private int field6814 = 0;
   @deob.ObfuscatedName("pz.p")
   public int field6815 = -1;
   @deob.ObfuscatedName("pz.o")
   public int field6816 = -1;
   @deob.ObfuscatedName("pz.a")
   public int field6817 = -1;
   @deob.ObfuscatedName("pz.x")
   public int field6818 = -1;
   @deob.ObfuscatedName("pz.s")
   public int field6819 = -1;
   @deob.ObfuscatedName("pz.l")
   public int field6820 = -1;
   @deob.ObfuscatedName("pz.u")
   public int field6848 = -1;
   @deob.ObfuscatedName("pz.v")
   public int field6822 = -1;
   @deob.ObfuscatedName("pz.g")
   public int field6823 = -1;
   @deob.ObfuscatedName("pz.h")
   public int field6837 = -1;
   @deob.ObfuscatedName("pz.e")
   public int field6825 = -1;
   @deob.ObfuscatedName("pz.z")
   public int field6843 = -1;
   @deob.ObfuscatedName("pz.m")
   public int field6827 = -1;
   @deob.ObfuscatedName("pz.i")
   public int field6833 = -1;
   @deob.ObfuscatedName("pz.t")
   public int field6829 = -1;
   @deob.ObfuscatedName("pz.c")
   public int field6830 = -1;
   @deob.ObfuscatedName("pz.w")
   public int field6828 = -1;
   @deob.ObfuscatedName("pz.q")
   public int field6844 = -1;
   @deob.ObfuscatedName("pz.y")
   public int field6838 = -1;
   @deob.ObfuscatedName("pz.j")
   public int field6834 = -1;
   @deob.ObfuscatedName("pz.f")
   public int field6835 = 0;
   @deob.ObfuscatedName("pz.ai")
   public int field6836 = 0;
   @deob.ObfuscatedName("pz.ap")
   public int field6821 = 0;
   @deob.ObfuscatedName("pz.av")
   public int field6842 = 0;
   @deob.ObfuscatedName("pz.al")
   public int field6824 = 0;
   @deob.ObfuscatedName("pz.an")
   public int field6810 = 0;
   @deob.ObfuscatedName("pz.ag")
   public int field6832 = 0;
   @deob.ObfuscatedName("pz.ak")
   public int field6847 = 0;
   @deob.ObfuscatedName("pz.aa")
   public int field6851 = 0;
   @deob.ObfuscatedName("pz.ao")
   public int field6849 = 0;
   @deob.ObfuscatedName("pz.ab")
   public int field6850 = 0;
   @deob.ObfuscatedName("pz.ae")
   public int field6826 = 0;
   @deob.ObfuscatedName("pz.az")
   public int field6852 = -1;
   @deob.ObfuscatedName("pz.aq")
   public int field6853 = -1;
   @deob.ObfuscatedName("pz.ar")
   public boolean field6854 = true;
   @deob.ObfuscatedName("pz.n")
   public class731 field6831;
   @deob.ObfuscatedName("pz.aw")
   public int[] field6845;
   @deob.ObfuscatedName("pz.ah")
   public int[] field6846;
   @deob.ObfuscatedName("pz.at")
   private class583[] field6841;
   @deob.ObfuscatedName("pz.ax")
   public int[][] field6839;
   @deob.ObfuscatedName("pz.af")
   public int[][] field6840;

   @deob.ObfuscatedName("pz.n(Laen;I)V")
   public void method10963(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method10964(arg0, var2);
      }
   }

   @deob.ObfuscatedName("pz.k(Laen;IB)V")
   private void method10964(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field6811 = arg0.method1608();
         this.field6817 = arg0.method1608();
      } else if (arg1 == 2) {
         this.field6825 = arg0.method1608();
      } else if (arg1 == 3) {
         this.field6843 = arg0.method1608();
      } else if (arg1 == 4) {
         this.field6827 = arg0.method1608();
      } else if (arg1 == 5) {
         this.field6833 = arg0.method1608();
      } else if (arg1 == 6) {
         this.field6848 = arg0.method1608();
      } else if (arg1 == 7) {
         this.field6822 = arg0.method1608();
      } else if (arg1 == 8) {
         this.field6823 = arg0.method1608();
      } else if (arg1 == 9) {
         this.field6837 = arg0.method1608();
      } else if (arg1 == 26) {
         this.field6835 = (short)(arg0.method1688() * 4);
         this.field6836 = (short)(arg0.method1688() * 4);
      } else if (arg1 == 27) {
         if (this.field6839 == null) {
            this.field6839 = new int[this.field6831.field6718.field7256.length][];
         }

         int var3 = arg0.method1688();
         this.field6839[var3] = new int[6];

         for(int var4 = 0; var4 < 6; ++var4) {
            this.field6839[var3][var4] = arg0.method1723();
         }
      } else if (arg1 == 28) {
         int var5 = arg0.method1688();
         this.field6845 = new int[var5];

         for(int var6 = 0; var6 < var5; ++var6) {
            this.field6845[var6] = arg0.method1688();
            if (this.field6845[var6] == 255) {
               this.field6845[var6] = -1;
            }
         }
      } else if (arg1 == 29) {
         this.field6824 = arg0.method1688();
      } else if (arg1 == 30) {
         this.field6810 = arg0.method1587();
      } else if (arg1 == 31) {
         this.field6832 = arg0.method1688();
      } else if (arg1 == 32) {
         this.field6847 = arg0.method1587();
      } else if (arg1 == 33) {
         this.field6851 = arg0.method1723();
      } else if (arg1 == 34) {
         this.field6849 = arg0.method1688();
      } else if (arg1 == 35) {
         this.field6850 = arg0.method1587();
      } else if (arg1 == 36) {
         this.field6826 = arg0.method1723();
      } else if (arg1 == 37) {
         this.field6852 = arg0.method1688();
      } else if (arg1 == 38) {
         this.field6815 = arg0.method1608();
      } else if (arg1 == 39) {
         this.field6816 = arg0.method1608();
      } else if (arg1 == 40) {
         this.field6818 = arg0.method1608();
      } else if (arg1 == 41) {
         this.field6819 = arg0.method1608();
      } else if (arg1 == 42) {
         this.field6820 = arg0.method1608();
      } else if (arg1 == 43) {
         arg0.method1587();
      } else if (arg1 == 44) {
         arg0.method1587();
      } else if (arg1 == 45) {
         this.field6853 = arg0.method1587();
      } else if (arg1 == 46) {
         this.field6829 = arg0.method1608();
      } else if (arg1 == 47) {
         this.field6830 = arg0.method1608();
      } else if (arg1 == 48) {
         this.field6828 = arg0.method1608();
      } else if (arg1 == 49) {
         this.field6844 = arg0.method1608();
      } else if (arg1 == 50) {
         this.field6838 = arg0.method1608();
      } else if (arg1 == 51) {
         this.field6834 = arg0.method1608();
      } else if (arg1 == 52) {
         int var7 = arg0.method1688();
         this.field6812 = new int[var7];
         this.field6813 = new int[var7];

         for(int var8 = 0; var8 < var7; ++var8) {
            this.field6812[var8] = arg0.method1608();
            int var9 = arg0.method1688();
            this.field6813[var8] = var9;
            this.field6814 += var9;
         }
      } else if (arg1 == 53) {
         this.field6854 = false;
      } else if (arg1 == 54) {
         this.field6821 = arg0.method1688() << 6;
         this.field6842 = arg0.method1688() << 6;
      } else if (arg1 == 55) {
         if (this.field6846 == null) {
            this.field6846 = new int[this.field6831.field6718.field7256.length];
         }

         int var10 = arg0.method1688();
         this.field6846[var10] = arg0.method1587();
      } else if (arg1 == 56) {
         if (this.field6840 == null) {
            this.field6840 = new int[this.field6831.field6718.field7256.length][];
         }

         int var11 = arg0.method1688();
         this.field6840[var11] = new int[3];

         for(int var12 = 0; var12 < 3; ++var12) {
            this.field6840[var11][var12] = arg0.method1723();
         }
      }

   }

   @deob.ObfuscatedName("pz.d(I)I")
   public int method10965() {
      if (this.field6811 != -1) {
         return this.field6811;
      } else if (this.field6812 == null) {
         return -1;
      } else {
         int var1 = (int)(Math.random() * (double)this.field6814);

         int var2;
         for(var2 = 0; var1 >= this.field6813[var2]; ++var2) {
            var1 -= this.field6813[var2];
         }

         return this.field6812[var2];
      }
   }

   @deob.ObfuscatedName("pz.b(IS)Z")
   public boolean method10966(int arg0) {
      if (arg0 == -1) {
         return false;
      } else if (this.field6811 == arg0) {
         return true;
      } else {
         if (this.field6812 != null) {
            for(int var2 = 0; var2 < this.field6812.length; ++var2) {
               if (this.field6812[var2] == arg0) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @deob.ObfuscatedName("pz.r(B)[Lka;")
   public class583[] method10977() {
      if (this.field6841 != null) {
         return this.field6841;
      } else if (this.field6839 == null) {
         return null;
      } else {
         this.field6841 = new class583[this.field6839.length];

         for(int var1 = 0; var1 < this.field6839.length; ++var1) {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            if (this.field6839[var1] != null) {
               var2 = this.field6839[var1][0];
               var3 = this.field6839[var1][1];
               var4 = this.field6839[var1][2];
               var5 = this.field6839[var1][3] << 3;
               var6 = this.field6839[var1][4] << 3;
               var7 = this.field6839[var1][5] << 3;
            }

            if (var2 != 0 || var3 != 0 || var4 != 0 || var5 != 0 || var6 != 0 || var7 != 0) {
               class583 var8 = this.field6841[var1] = new class583();
               if (var7 != 0) {
                  var8.method8126(0.0F, 0.0F, 1.0F, class603.method8577(var7));
               }

               if (var5 != 0) {
                  var8.method8126(1.0F, 0.0F, 0.0F, class603.method8577(var5));
               }

               if (var6 != 0) {
                  var8.method8126(0.0F, 1.0F, 0.0F, class603.method8577(var6));
               }

               var8.method8072((float)var2, (float)var3, (float)var4);
            }
         }

         return this.field6841;
      }
   }

   @deob.ObfuscatedName("pz.p(I)[I")
   public int[] method10981() {
      class875 var1 = new class875(16);
      method9674(this.field6811, var1);
      if (this.field6812 != null) {
         int[] var2 = this.field6812;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            method9674(var4, var1);
         }
      }

      method9674(this.field6815, var1);
      method9674(this.field6816, var1);
      method9674(this.field6817, var1);
      method9674(this.field6818, var1);
      method9674(this.field6819, var1);
      method9674(this.field6820, var1);
      method9674(this.field6848, var1);
      method9674(this.field6822, var1);
      method9674(this.field6823, var1);
      method9674(this.field6837, var1);
      method9674(this.field6825, var1);
      method9674(this.field6843, var1);
      method9674(this.field6827, var1);
      method9674(this.field6833, var1);
      method9674(this.field6829, var1);
      method9674(this.field6830, var1);
      method9674(this.field6828, var1);
      method9674(this.field6844, var1);
      method9674(this.field6838, var1);
      method9674(this.field6834, var1);
      int[] var5 = new int[var1.method15321()];
      int var6 = 0;
      Iterator var7 = var1.iterator();

      while(var7.hasNext()) {
         class674 var8 = (class674)var7.next();
         var5[var6++] = (int)var8.field6137;
      }

      return var5;
   }

   @deob.ObfuscatedName("my.o(ILuw;I)V")
   private static final void method9674(int arg0, class875 arg1) {
      if (arg0 != -1) {
         if (arg1.method15322((long)arg0) == null) {
            arg1.method15311(new class674(), (long)arg0);
         }
      }
   }
}
