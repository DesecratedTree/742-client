@deob.ObfuscatedName("akr")
public abstract class class290 extends class134 {
   @deob.ObfuscatedName("akr.z")
   public short field1875;
   @deob.ObfuscatedName("akr.m")
   public short field1873;
   @deob.ObfuscatedName("akr.i")
   public short field1874;
   @deob.ObfuscatedName("akr.t")
   public short field1876;
   @deob.ObfuscatedName("akr.c")
   public boolean field9624;
   @deob.ObfuscatedName("akr.w")
   public byte field1877;

   protected class290(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11) {
      super(arg0);
      this.field1032 = (byte)arg1;
      this.field1034 = (byte)arg2;
      this.method11626(new class584((float)arg3, (float)arg4, (float)arg5));
      this.field1875 = (short)arg6;
      this.field1873 = (short)arg7;
      this.field1874 = (short)arg8;
      this.field1876 = (short)arg9;
      this.field9624 = arg10;
      this.field1877 = arg11;
   }

   @deob.ObfuscatedName("akr.ds(B)V")
   public void method184() {
   }

   @deob.ObfuscatedName("akr.fx([Lacy;B)I")
   public int method2012(class81[] arg0) {
      int var2 = 0;

      label115:
      for(int var3 = this.field1875; var3 <= this.field1873; ++var3) {
         label113:
         for(int var4 = this.field1874; var4 <= this.field1876; ++var4) {
            long var5 = this.field1033.field6620[this.field1032][var3][var4];
            long var7 = 0L;

            while(true) {
               label108:
               while(true) {
                  if (var7 > 48L) {
                     continue label113;
                  }

                  int var9 = (int)(var5 >>> (int)var7 & 65535L);
                  if (var9 <= 0) {
                     continue label113;
                  }

                  class698 var10 = this.field1033.field6621[var9 - 1];

                  for(int var11 = 0; var11 < var2; ++var11) {
                     if (arg0[var11] == var10.field6435) {
                        var7 += 16L;
                        continue label108;
                     }
                  }

                  arg0[var2++] = var10.field6435;
                  if (var2 == 4) {
                     break label115;
                  }

                  var7 += 16L;
               }
            }
         }
      }

      for(int var12 = var2; var12 < 4; ++var12) {
         arg0[var12] = null;
      }

      if (this.field1877 != 0) {
         int var13 = this.field1875 - this.field1033.field6603;
         int var14 = this.field1874 - this.field1033.field6604;
         short var15;
         int var16;
         int var17;
         short var18;
         if (this.field1877 == 1) {
            if (var14 > var13) {
               var15 = this.field1875;
               var16 = this.field1874 - 1;
               var17 = this.field1875 + 1;
               var18 = this.field1874;
            } else {
               var15 = this.field1875;
               var16 = this.field1874 + 1;
               var17 = this.field1875 - 1;
               var18 = this.field1874;
            }
         } else if (var14 > -var13) {
            var15 = this.field1875;
            var16 = this.field1874 - 1;
            var17 = this.field1875 - 1;
            var18 = this.field1874;
         } else {
            var15 = this.field1875;
            var16 = this.field1874 + 1;
            var17 = this.field1875 + 1;
            var18 = this.field1874;
         }

         label79:
         for(int var19 = 0; var19 < var2; ++var19) {
            long var20 = this.field1033.field6620[this.field1032][var15][var16];

            while(var20 != 0L) {
               class698 var22 = this.field1033.field6621[(int)((var20 & 65535L) - 1L)];
               var20 >>>= 16;
               if (arg0[var19] == var22.field6435) {
                  continue label79;
               }
            }

            long var23 = this.field1033.field6620[this.field1032][var17][var18];

            while(var23 != 0L) {
               class698 var25 = this.field1033.field6621[(int)((var23 & 65535L) - 1L)];
               var23 >>>= 16;
               if (arg0[var19] == var25.field6435) {
                  continue label79;
               }
            }

            for(int var26 = var19; var26 < var2 - 1; ++var26) {
               arg0[var26] = arg0[var26 + 1];
            }

            --var2;
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("akr.gu(Lra;I)Z")
   public boolean method2015(class772 arg0) {
      return this.field1033.field6566.method10404(this.field1034, this.field1875, this.field1873, this.field1874, this.field1876, this.method2011(arg0));
   }

   @deob.ObfuscatedName("akr.gi(B)Z")
   public boolean method2014() {
      for(int var1 = this.field1875; var1 <= this.field1873; ++var1) {
         for(int var2 = this.field1874; var2 <= this.field1876; ++var2) {
            int var3 = this.field1033.field6599 + (var1 - this.field1033.field6603);
            if (var3 >= 0 && var3 < this.field1033.field6616.length) {
               int var4 = this.field1033.field6599 + (var2 - this.field1033.field6604);
               if (var4 >= 0 && var4 < this.field1033.field6616.length && this.field1033.field6616[var3][var4]) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
