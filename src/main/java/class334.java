@deob.ObfuscatedName("bc")
public class class334 {
   @deob.ObfuscatedName("bc.o")
   public boolean field2117 = true;
   @deob.ObfuscatedName("bc.a")
   private int field2122 = -1;
   @deob.ObfuscatedName("bc.d")
   private final class983 field2115;
   @deob.ObfuscatedName("bc.b")
   private final class371 field2118;
   @deob.ObfuscatedName("bc.r")
   private final int field2119;
   @deob.ObfuscatedName("bc.p")
   private final int field2124;
   @deob.ObfuscatedName("bc.x")
   private final int field2121;
   @deob.ObfuscatedName("bc.s")
   private class369 field2123;
   @deob.ObfuscatedName("bc.l")
   private class946 field2125;
   @deob.ObfuscatedName("bc.u")
   private class939 field2126;

   public class334(class983 arg0, class371 arg1, class976 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.field2115 = arg0;
      this.field2118 = arg1;
      this.field2119 = arg6;
      this.field2124 = arg7;
      int var9 = 1 << arg5;
      int var10 = 0;
      int var11 = arg3 << arg5;
      int var12 = arg4 << arg5;

      for(int var13 = 0; var13 < var9; ++var13) {
         int var14 = arg2.field9463 * (var12 + var13) + var11;

         for(int var15 = 0; var15 < var9; ++var15) {
            short[] var16 = arg2.field9893[var14++];
            if (var16 != null) {
               var10 += var16.length;
            }
         }
      }

      this.field2121 = var10;
      if (var10 > 0) {
         class124 var17 = new class124(var10 * 2);
         if (this.field2115.field10274) {
            for(int var18 = 0; var18 < var9; ++var18) {
               int var19 = arg2.field9463 * (var12 + var18) + var11;

               for(int var20 = 0; var20 < var9; ++var20) {
                  short[] var21 = arg2.field9893[var19++];
                  if (var21 != null) {
                     for(int var22 = 0; var22 < var21.length; ++var22) {
                        var17.method1569(var21[var22] & 65535);
                     }
                  }
               }
            }
         } else {
            for(int var23 = 0; var23 < var9; ++var23) {
               int var24 = arg2.field9463 * (var12 + var23) + var11;

               for(int var25 = 0; var25 < var9; ++var25) {
                  short[] var26 = arg2.field9893[var24++];
                  if (var26 != null) {
                     for(int var27 = 0; var27 < var26.length; ++var27) {
                        var17.method1668(var26[var27] & 65535);
                     }
                  }
               }
            }
         }

         this.field2123 = this.field2115.method16746(5123, var17.field931, var17.field935, false);
         this.field2125 = new class946(this.field2115, 5123, (byte[])null, 1);
      } else {
         this.field2126 = null;
      }

   }

   @deob.ObfuscatedName("bc.n()V")
   public void method4125() {
      this.method4129(this.field2123, this.field2121);
   }

   @deob.ObfuscatedName("bc.k([BI)V")
   public void method4126(byte[] arg0, int arg1) {
      this.field2125.method4539(5123, arg0, arg1 * 2);
      this.method4129(this.field2125, arg1);
   }

   @deob.ObfuscatedName("bc.d(Lck;I)V")
   private void method4129(class369 arg0, int arg1) {
      if (arg1 != 0) {
         this.method4134();
         this.field2115.method16639(this.field2126);
         this.field2115.method16633(arg0, 4, 0, arg1);
      }
   }

   @deob.ObfuscatedName("bc.b()V")
   private void method4134() {
      if (this.field2117) {
         this.field2117 = false;
         byte[] var1 = this.field2118.field2724;
         byte[] var2 = this.field2115.field10402;
         int var3 = 0;
         int var4 = this.field2118.field2726;
         int var5 = this.field2118.field2726 * this.field2124 + this.field2119;

         for(int var6 = -128; var6 < 0; ++var6) {
            var3 = (var3 << 8) - var3;

            for(int var7 = -128; var7 < 0; ++var7) {
               if (var1[var5++] != 0) {
                  ++var3;
               }
            }

            var5 += var4 - 128;
         }

         if (this.field2126 != null && this.field2122 == var3) {
            this.field2117 = false;
         } else {
            this.field2122 = var3;
            int var8 = 0;
            int var9 = this.field2124 * var4 + this.field2119;

            for(int var10 = -128; var10 < 0; ++var10) {
               for(int var11 = -128; var11 < 0; ++var11) {
                  if (var1[var9] != 0) {
                     var2[var8++] = 68;
                  } else {
                     int var12 = 0;
                     if (var1[var9 - 1] != 0) {
                        ++var12;
                     }

                     if (var1[var9 + 1] != 0) {
                        ++var12;
                     }

                     if (var1[var9 - var4] != 0) {
                        ++var12;
                     }

                     if (var1[var4 + var9] != 0) {
                        ++var12;
                     }

                     var2[var8++] = (byte)(var12 * 17);
                  }

                  ++var9;
               }

               var9 += this.field2118.field2726 - 128;
            }

            if (this.field2126 == null) {
               this.field2126 = new class939(this.field2115, 3553, class372.field2735, class405.field3052, 128, 128, false, this.field2115.field10402, class372.field2735, false);
               this.field2126.method15984(false, false);
               this.field2126.method2448(true);
            } else {
               this.field2126.method15983(0, 0, 128, 128, this.field2115.field10402, class372.field2735, 0, 0, false);
            }

         }
      }
   }
}
