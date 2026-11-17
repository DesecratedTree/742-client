@deob.ObfuscatedName("ajy")
public class class270 extends class107 {
   @deob.ObfuscatedName("ajy.u")
   public boolean field1791 = true;
   @deob.ObfuscatedName("ajy.o")
   public class904 field1795;
   @deob.ObfuscatedName("ajy.l")
   public int[] field1794;
   @deob.ObfuscatedName("ajy.x")
   private int[] field1796;
   @deob.ObfuscatedName("ajy.a")
   private String[] field1792;
   @deob.ObfuscatedName("ajy.s")
   private int[][] field1793;

   @deob.ObfuscatedName("ajy.n(Laen;I)V")
   public void method3601(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method3597(arg0, var2);
      }
   }

   @deob.ObfuscatedName("ajy.k(Laen;IB)V")
   private void method3597(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field1792 = Statics.method14220(arg0.method1599(), '<');
      } else if (arg1 == 2) {
         int var3 = arg0.method1688();
         this.field1794 = new int[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field1794[var4] = arg0.method1587();
         }
      } else if (arg1 == 3) {
         int var5 = arg0.method1688();
         this.field1796 = new int[var5];
         this.field1793 = new int[var5][];

         for(int var6 = 0; var6 < var5; ++var6) {
            int var7 = arg0.method1587();
            class750 var8 = class750.method7449(var7);
            if (var8 != null) {
               this.field1796[var6] = var7;
               this.field1793[var6] = new int[var8.field6913];

               for(int var9 = 0; var9 < var8.field6913; ++var9) {
                  this.field1793[var6][var9] = arg0.method1587();
               }
            }
         }
      } else if (arg1 == 4) {
         this.field1791 = false;
      }

   }

   @deob.ObfuscatedName("ajy.d(Laen;[II)V")
   public void method3580(class124 arg0, int[] arg1) {
      if (this.field1796 != null) {
         for(int var3 = 0; var3 < this.field1796.length && var3 < arg1.length; ++var3) {
            int var4 = this.method3583(var3).field6896;
            if (var4 > 0) {
               arg0.method1576((long)arg1[var3], var4);
            }
         }

      }
   }

   @deob.ObfuscatedName("ajy.b(Laen;B)Ljava/lang/String;")
   public String method3581(class124 arg0) {
      StringBuilder var2 = new StringBuilder(80);
      if (this.field1796 != null) {
         for(int var3 = 0; var3 < this.field1796.length; ++var3) {
            var2.append(this.field1792[var3]);
            var2.append(this.field1795.method15714(this.method3583(var3), this.field1793[var3], arg0.method1764(class750.method7449(this.field1796[var3]).field6912)));
         }
      }

      var2.append(this.field1792[this.field1792.length - 1]);
      return var2.toString();
   }

   @deob.ObfuscatedName("ajy.r(I)Ljava/lang/String;")
   public String method3579() {
      StringBuilder var1 = new StringBuilder(80);
      if (this.field1792 == null) {
         return "";
      } else {
         var1.append(this.field1792[0]);

         for(int var2 = 1; var2 < this.field1792.length; ++var2) {
            for(int var3 = 0; var3 < 3; ++var3) {
               var1.append('.');
            }

            var1.append(this.field1792[var2]);
         }

         return var1.toString();
      }
   }

   @deob.ObfuscatedName("ajy.p(B)I")
   public int method3582() {
      return this.field1796 == null ? 0 : this.field1796.length;
   }

   @deob.ObfuscatedName("ajy.o(IB)Lqf;")
   public class750 method3583(int arg0) {
      return this.field1796 != null && arg0 >= 0 && arg0 <= this.field1796.length ? class750.method7449(this.field1796[arg0]) : null;
   }

   @deob.ObfuscatedName("ajy.a(III)I")
   public int method3584(int arg0, int arg1) {
      if (this.field1796 != null && arg0 >= 0 && arg0 <= this.field1796.length) {
         return this.field1793[arg0] != null && arg1 >= 0 && arg1 <= this.field1793[arg0].length ? this.field1793[arg0][arg1] : -1;
      } else {
         return -1;
      }
   }

   @deob.ObfuscatedName("ajy.x(I)V")
   public void method3585() {
      if (this.field1794 != null) {
         for(int var1 = 0; var1 < this.field1794.length; ++var1) {
            this.field1794[var1] |= 32768;
         }
      }

   }
}
