@deob.ObfuscatedName("zk")
public class class998 extends class407 {
   @deob.ObfuscatedName("zk.k")
   public int field10572;
   @deob.ObfuscatedName("zk.n")
   public int field10574;
   @deob.ObfuscatedName("zk.d")
   public int field10575;
   @deob.ObfuscatedName("zk.r")
   public int field10576;
   @deob.ObfuscatedName("zk.p")
   public int field10577;
   @deob.ObfuscatedName("zk.b")
   public int field10580;
   @deob.ObfuscatedName("zk.x")
   public byte[] field10573;
   @deob.ObfuscatedName("zk.a")
   public byte[] field10579;
   @deob.ObfuscatedName("zk.o")
   public int[] field10578;

   @deob.ObfuscatedName("zk.n()Z")
   public boolean method5562() {
      return true;
   }

   @deob.ObfuscatedName("zk.k()Z")
   public boolean method5603() {
      return this.field10573 != null;
   }

   @deob.ObfuscatedName("zk.d()I")
   public int method5551() {
      return this.field10574;
   }

   @deob.ObfuscatedName("zk.b()I")
   public int method5554() {
      return this.field10572;
   }

   @deob.ObfuscatedName("zk.s()I")
   public int method5547() {
      return this.field10575 + this.field10574 + this.field10580;
   }

   @deob.ObfuscatedName("zk.l()I")
   public int method5548() {
      return this.field10576 + this.field10572 + this.field10577;
   }

   @deob.ObfuscatedName("zk.r()I")
   public int method5542() {
      return this.field10575;
   }

   @deob.ObfuscatedName("zk.p()I")
   public int method5543() {
      return this.field10580;
   }

   @deob.ObfuscatedName("zk.o()I")
   public int method5544() {
      return this.field10576;
   }

   @deob.ObfuscatedName("zk.a()I")
   public int method5545() {
      return this.field10577;
   }

   @deob.ObfuscatedName("zk.x()V")
   public void method5546() {
      this.field10577 = 0;
      this.field10576 = 0;
      this.field10580 = 0;
      this.field10575 = 0;
   }

   @deob.ObfuscatedName("zk.u(I)V")
   public void method5549(int arg0) {
      int var2 = this.method5547();
      int var3 = this.method5548();
      if (this.field10574 != var2 || this.field10572 != var3) {
         int var4 = arg0;
         if (arg0 > this.field10575) {
            var4 = this.field10575;
         }

         int var5 = arg0;
         if (this.field10575 + arg0 + this.field10574 > var2) {
            var5 = var2 - this.field10575 - this.field10574;
         }

         int var6 = arg0;
         if (arg0 > this.field10576) {
            var6 = this.field10576;
         }

         int var7 = arg0;
         if (this.field10576 + arg0 + this.field10572 > var3) {
            var7 = var3 - this.field10576 - this.field10572;
         }

         int var8 = this.field10574 + var4 + var5;
         int var9 = this.field10572 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field10573 == null) {
            for(int var11 = 0; var11 < this.field10572; ++var11) {
               int var12 = this.field10574 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field10574; ++var14) {
                  var10[var13++] = this.field10579[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field10572; ++var16) {
               int var17 = this.field10574 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field10574; ++var19) {
                  var15[var18] = this.field10573[var17];
                  var10[var18++] = this.field10579[var17++];
               }
            }

            this.field10573 = var15;
         }

         this.field10575 -= var4;
         this.field10576 -= var6;
         this.field10580 -= var5;
         this.field10577 -= var7;
         this.field10574 = var8;
         this.field10572 = var9;
         this.field10579 = var10;
      }
   }

   @deob.ObfuscatedName("zk.v(I)V")
   public void method5550(int arg0) {
      int var2 = -1;
      if (this.field10578.length < 255) {
         for(int var3 = 0; var3 < this.field10578.length; ++var3) {
            if (this.field10578[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field10578.length;
            int[] var4 = new int[this.field10578.length + 1];
            System.arraycopy(this.field10578, 0, var4, 0, this.field10578.length);
            this.field10578 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field10578.length; ++var9) {
            int var10 = this.field10578[var9];
            int var11 = var10 >> 16 & 255;
            int var12 = var10 >> 8 & 255;
            int var13 = var10 & 255;
            int var14 = var6 - var11;
            if (var14 < 0) {
               var14 = -var14;
            }

            int var15 = var7 - var12;
            if (var15 < 0) {
               var15 = -var15;
            }

            int var16 = var8 - var13;
            if (var16 < 0) {
               var16 = -var16;
            }

            int var17 = var14 + var15 + var16;
            if (var17 < var5) {
               var5 = var17;
               var2 = var9;
            }
         }
      }

      int var18 = 0;
      byte[] var19 = new byte[this.field10574 * this.field10572];

      for(int var20 = 0; var20 < this.field10572; ++var20) {
         for(int var21 = 0; var21 < this.field10574; ++var21) {
            int var22 = this.field10579[var18] & 255;
            if (this.field10578[var22] == 0) {
               if (var21 > 0 && this.field10578[this.field10579[var18 - 1] & 255] != 0) {
                  var22 = var2;
               } else if (var20 > 0 && this.field10578[this.field10579[var18 - this.field10574] & 255] != 0) {
                  var22 = var2;
               } else if (var21 < this.field10574 - 1 && this.field10578[this.field10579[var18 + 1] & 255] != 0) {
                  var22 = var2;
               } else if (var20 < this.field10572 - 1 && this.field10578[this.field10579[this.field10574 + var18] & 255] != 0) {
                  var22 = var2;
               }
            }

            var19[var18++] = (byte)var22;
         }
      }

      this.field10579 = var19;
   }

   @deob.ObfuscatedName("zk.g(I)V")
   public void method5539(int arg0) {
      int var2 = -1;
      if (this.field10578.length < 255) {
         for(int var3 = 0; var3 < this.field10578.length; ++var3) {
            if (this.field10578[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field10578.length;
            int[] var4 = new int[this.field10578.length + 1];
            System.arraycopy(this.field10578, 0, var4, 0, this.field10578.length);
            this.field10578 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field10578.length; ++var9) {
            int var10 = this.field10578[var9];
            int var11 = var10 >> 16 & 255;
            int var12 = var10 >> 8 & 255;
            int var13 = var10 & 255;
            int var14 = var6 - var11;
            if (var14 < 0) {
               var14 = -var14;
            }

            int var15 = var7 - var12;
            if (var15 < 0) {
               var15 = -var15;
            }

            int var16 = var8 - var13;
            if (var16 < 0) {
               var16 = -var16;
            }

            int var17 = var14 + var15 + var16;
            if (var17 < var5) {
               var5 = var17;
               var2 = var9;
            }
         }
      }

      for(int var18 = this.field10572 - 1; var18 > 0; --var18) {
         int var19 = this.field10574 * var18;

         for(int var20 = this.field10574 - 1; var20 > 0; --var20) {
            if (this.field10578[this.field10579[var19 + var20] & 255] == 0 && this.field10578[this.field10579[var19 + var20 - 1 - this.field10574] & 255] != 0) {
               this.field10579[var19 + var20] = (byte)var2;
            }
         }
      }

   }

   @deob.ObfuscatedName("zk.h()V")
   public void method5540() {
      byte[] var1 = this.field10579;
      if (this.field10573 == null) {
         for(int var2 = this.field10572 - 1; var2 >= 0; --var2) {
            int var3 = this.field10574 * var2;
            int var4 = (var2 + 1) * this.field10574;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field10573;

         for(int var7 = this.field10572 - 1; var7 >= 0; --var7) {
            int var8 = this.field10574 * var7;
            int var9 = (var7 + 1) * this.field10574;

            while(var8 < var9) {
               --var9;
               byte var10 = var1[var8];
               var1[var8] = var1[var9];
               var1[var9] = var10;
               byte var11 = var6[var8];
               var6[var8] = var6[var9];
               var6[var9] = var11;
               ++var8;
            }
         }
      }

      int var12 = this.field10575;
      this.field10575 = this.field10580;
      this.field10580 = var12;
   }

   @deob.ObfuscatedName("zk.e()V")
   public void method5570() {
      byte[] var1 = this.field10579;
      if (this.field10573 == null) {
         for(int var2 = (this.field10572 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field10574 * var2;
            int var4 = (this.field10572 - var2 - 1) * this.field10574;

            for(int var5 = -this.field10574; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field10573;

         for(int var8 = (this.field10572 >> 1) - 1; var8 >= 0; --var8) {
            int var9 = this.field10574 * var8;
            int var10 = (this.field10572 - var8 - 1) * this.field10574;

            for(int var11 = -this.field10574; var11 < 0; ++var11) {
               byte var12 = var1[var9];
               var1[var9] = var1[var10];
               var1[var10] = var12;
               byte var13 = var7[var9];
               var7[var9] = var7[var10];
               var7[var10] = var13;
               ++var9;
               ++var10;
            }
         }
      }

      int var14 = this.field10576;
      this.field10576 = this.field10577;
      this.field10577 = var14;
   }

   @deob.ObfuscatedName("zk.z()V")
   public void method5612() {
      byte[] var1 = new byte[this.field10574 * this.field10572];
      int var2 = 0;
      if (this.field10573 == null) {
         for(int var3 = 0; var3 < this.field10574; ++var3) {
            for(int var4 = this.field10572 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field10579[this.field10574 * var4 + var3];
            }
         }

         this.field10579 = var1;
      } else {
         byte[] var5 = new byte[this.field10574 * this.field10572];

         for(int var6 = 0; var6 < this.field10574; ++var6) {
            for(int var7 = this.field10572 - 1; var7 >= 0; --var7) {
               var1[var2] = this.field10579[this.field10574 * var7 + var6];
               var5[var2++] = this.field10573[this.field10574 * var7 + var6];
            }
         }

         this.field10579 = var1;
         this.field10573 = var5;
      }

      int var8 = this.field10576;
      this.field10576 = this.field10575;
      this.field10575 = this.field10577;
      this.field10577 = this.field10580;
      this.field10580 = this.field10576;
      int var9 = this.field10572;
      this.field10572 = this.field10574;
      this.field10574 = var9;
   }

   @deob.ObfuscatedName("zk.m(Z)[I")
   public int[] method5555(boolean arg0) {
      int[] var3;
      if (arg0) {
         int var2 = this.method5547();
         var3 = new int[var2 * this.method5548()];
         if (this.field10573 != null) {
            for(int var4 = 0; var4 < this.field10572; ++var4) {
               int var5 = this.field10574 * var4;
               int var6 = (this.field10576 + var4) * var2 + this.field10575;

               for(int var7 = 0; var7 < this.field10574; ++var7) {
                  var3[var6++] = this.field10573[var5] << 24 | this.field10578[this.field10579[var5] & 255];
                  ++var5;
               }
            }
         } else {
            for(int var8 = 0; var8 < this.field10572; ++var8) {
               int var9 = this.field10574 * var8;
               int var10 = (this.field10576 + var8) * var2 + this.field10575;

               for(int var11 = 0; var11 < this.field10574; ++var11) {
                  int var12 = this.field10578[this.field10579[var9++] & 255];
                  if (var12 != 0) {
                     var3[var10++] = -16777216 | var12;
                  } else {
                     var3[var10++] = 0;
                  }
               }
            }
         }
      } else {
         var3 = new int[this.field10574 * this.field10572];
         int var13 = 0;
         int var14 = 0;
         if (this.field10573 != null) {
            for(int var15 = 0; var15 < this.field10572; ++var15) {
               for(int var16 = 0; var16 < this.field10574; ++var16) {
                  var3[var14++] = this.field10573[var13] << 24 | this.field10578[this.field10579[var13] & 255];
                  ++var13;
               }
            }
         } else {
            for(int var17 = 0; var17 < this.field10572; ++var17) {
               for(int var18 = 0; var18 < this.field10574; ++var18) {
                  int var19 = this.field10578[this.field10579[var13++] & 255];
                  var3[var14++] = var19 != 0 ? -16777216 | var19 : 0;
               }
            }
         }
      }

      return var3;
   }

   @deob.ObfuscatedName("zk.i(III)V")
   public void method5598(int arg0, int arg1, int arg2) {
      for(int var4 = 1; var4 < this.field10578.length; ++var4) {
         if (this.field10578[var4] != 1 && this.field10578[var4] != 16711935) {
            int var5 = this.field10578[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
               var6 = 0;
            } else if (var6 > 255) {
               var6 = 255;
            }

            int var7 = this.field10578[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
               var8 = 0;
            } else if (var8 > 255) {
               var8 = 255;
            }

            int var9 = this.field10578[var4] >> 0 & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
               var10 = 0;
            } else if (var10 > 255) {
               var10 = 255;
            }

            this.field10578[var4] = var6 << 16 | var8 << 8 | var10;
         }
      }

   }

   @deob.ObfuscatedName("zk.t(II)I")
   public int method5557(int arg0, int arg1) {
      return this.field10578[this.field10579[this.field10574 * arg1 + arg0] & 255];
   }
}
