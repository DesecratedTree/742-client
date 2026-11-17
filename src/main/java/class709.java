@deob.ObfuscatedName("os")
public class class709 {
   @deob.ObfuscatedName("os.n")
   public boolean field6516 = true;
   @deob.ObfuscatedName("os.k")
   public boolean field6517 = true;
   @deob.ObfuscatedName("os.a")
   private boolean field6523 = false;
   @deob.ObfuscatedName("os.m")
   private int field6533 = 0;
   @deob.ObfuscatedName("os.ai")
   private final float[] field6542 = new float[3];
   @deob.ObfuscatedName("os.ap")
   private final int[] field6543 = new int[2];
   @deob.ObfuscatedName("os.av")
   public int field6544 = -1;
   @deob.ObfuscatedName("os.ax")
   public int field6545 = -1;
   @deob.ObfuscatedName("os.af")
   private boolean field6546 = true;
   @deob.ObfuscatedName("os.x")
   private int field6524;
   @deob.ObfuscatedName("os.s")
   private int field6525;
   @deob.ObfuscatedName("os.p")
   private class713 field6521;
   @deob.ObfuscatedName("os.v")
   private class719[] field6532;
   @deob.ObfuscatedName("os.u")
   private int field6541;
   @deob.ObfuscatedName("os.h")
   private class719[] field6522;
   @deob.ObfuscatedName("os.g")
   private int field6529;
   @deob.ObfuscatedName("os.z")
   private class719[] field6528;
   @deob.ObfuscatedName("os.e")
   private int field6531;
   @deob.ObfuscatedName("os.i")
   private class719[] field6534;
   @deob.ObfuscatedName("os.l")
   private int[][][] field6526;
   @deob.ObfuscatedName("os.o")
   private class705 field6520;
   @deob.ObfuscatedName("os.t")
   public int[] field6535;
   @deob.ObfuscatedName("os.c")
   public int[] field6536;
   @deob.ObfuscatedName("os.w")
   public int[] field6537;
   @deob.ObfuscatedName("os.q")
   public int[] field6538;
   @deob.ObfuscatedName("os.y")
   public int[] field6539;
   @deob.ObfuscatedName("os.j")
   public int[] field6540;

   public class709(class713 arg0) {
      this.field6524 = arg0.field6605;
      this.field6525 = arg0.field6605;
      this.field6521 = arg0;
      this.field6532 = new class719[509];
      this.field6541 = 0;
      this.field6522 = new class719[2038];
      this.field6529 = 0;
      this.field6528 = new class719[1046];
      this.field6531 = 0;
      this.field6534 = new class719[1043];
      this.field6533 = 0;
      this.field6526 = new int[this.field6521.field6614][this.field6521.field6577 + 1][this.field6521.field6578 + 1];
      this.field6523 = false;
      if (this.field6521.field6571 instanceof class548) {
         this.field6516 = false;
      } else {
         this.field6516 = true;
      }

      if (this.field6516) {
         this.field6520 = new class705(this);
      }

   }

   @deob.ObfuscatedName("os.n(IIIIII)V")
   public void method10418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 != 8 && arg0 != 16) {
         class703 var7 = this.field6521.field6579[arg1][arg2][arg3];
         if (var7 == null) {
            this.field6521.field6579[arg1][arg2][arg3] = var7 = new class703(arg1);
         }

         if (arg0 == 1) {
            var7.field6485 = (short)arg4;
            var7.field6487 = (short)arg5;
         } else if (arg0 == 2) {
            var7.field6488 = (short)arg4;
            var7.field6476 = (short)arg5;
         }

         if (this.field6523) {
            this.method10433();
         }
      } else if (arg0 == 8) {
         int var8 = arg2 << this.field6521.field6567;
         int var9 = this.field6521.field6605 + var8;
         int var10 = arg3 << this.field6521.field6567;
         int var11 = this.field6521.field6605 + var10;
         int var12 = this.field6521.field6582[arg1].method15966(arg2, arg3);
         int var13 = this.field6521.field6582[arg1].method15966(arg2 + 1, arg3 + 1);
         this.field6528[this.field6531++] = new class719(this.field6521, arg0, arg1, var8, var9, var9, var8, var12, var13, var13 - arg4, var12 - arg4, var10, var11, var11, var10);
      } else {
         int var14 = (arg2 << this.field6521.field6567) + this.field6521.field6605;
         int var15 = var14 - this.field6521.field6605;
         int var16 = arg3 << this.field6521.field6567;
         int var17 = this.field6521.field6605 + var16;
         int var18 = this.field6521.field6582[arg1].method15966(arg2 + 1, arg3);
         int var19 = this.field6521.field6582[arg1].method15966(arg2, arg3 + 1);
         this.field6528[this.field6531++] = new class719(this.field6521, arg0, arg1, var14, var15, var15, var14, var18, var19, var19 - arg4, var18 - arg4, var16, var17, var17, var16);
      }

   }

   @deob.ObfuscatedName("os.k(IIII)V")
   public void method10416(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 != 8 && arg0 != 16) {
         class703 var5 = this.field6521.field6579[arg1][arg2][arg3];
         if (var5 != null) {
            if (arg0 == 1) {
               var5.field6485 = 0;
            } else if (arg0 == 2) {
               var5.field6488 = 0;
            }
         }

         this.method10433();
      } else {
         for(int var6 = 0; var6 < this.field6531; ++var6) {
            class719 var7 = this.field6528[var6];
            if (var7.field6647 == arg0 && var7.field6648 == arg1 && (var7.field6649 == arg2 && var7.field6651 == arg3 || var7.field6642 == arg2 && var7.field6652 == arg3)) {
               if (this.field6531 != var6) {
                  System.arraycopy(this.field6528, var6 + 1, this.field6528, var6, this.field6528.length - (var6 + 1));
               }

               --this.field6531;
               return;
            }
         }
      }

   }

   @deob.ObfuscatedName("os.d()V")
   public void method10423() {
      this.method10433();
   }

   @deob.ObfuscatedName("os.b()V")
   private void method10433() {
      for(int var1 = 0; var1 < this.field6529; ++var1) {
         this.field6522[var1] = null;
      }

      this.field6529 = 0;

      for(int var2 = 0; var2 < this.field6521.field6614; ++var2) {
         for(int var3 = 0; var3 < this.field6521.field6577; ++var3) {
            for(int var4 = 0; var4 < this.field6521.field6578; ++var4) {
               class703 var5 = this.field6521.field6579[var2][var4][var3];
               if (var5 != null) {
                  if (var5.field6485 > 0) {
                     var5.field6485 = (short)(var5.field6485 * -1);
                  }

                  if (var5.field6488 > 0) {
                     var5.field6488 = (short)(var5.field6488 * -1);
                  }
               }
            }
         }
      }

      for(int var6 = 0; var6 < this.field6521.field6614; ++var6) {
         for(int var7 = 0; var7 < this.field6521.field6577; ++var7) {
            for(int var8 = 0; var8 < this.field6521.field6578; ++var8) {
               class703 var9 = this.field6521.field6579[var6][var8][var7];
               if (var9 != null) {
                  boolean var10 = this.field6521.field6579[0][var8][var7] != null && this.field6521.field6579[0][var8][var7].field6478 != null;
                  if (var9.field6485 < 0) {
                     int var11 = var7;
                     int var12 = var7;
                     int var14 = var6;
                     class703 var15 = this.field6521.field6579[var6][var8][var7 - 1];
                     int var16 = this.field6521.field6582[var6].method15966(var8, var7);

                     while(var11 > 0 && var15 != null && var15.field6485 < 0 && var9.field6485 == var15.field6485 && var9.field6487 == var15.field6487 && var16 == this.field6521.field6582[var6].method15966(var8, var11 - 1) && (var11 - 1 <= 0 || var16 == this.field6521.field6582[var6].method15966(var8, var11 - 2)) && var12 - var11 <= 10) {
                        --var11;
                        var15 = this.field6521.field6579[var6][var8][var11 - 1];
                     }

                     for(class703 var17 = this.field6521.field6579[var6][var8][var12 + 1]; var12 < this.field6521.field6578 && var17 != null && var17.field6485 < 0 && var9.field6485 == var17.field6485 && var9.field6487 == var17.field6487 && var16 == this.field6521.field6582[var6].method15966(var8, var12 + 1) && (var12 + 1 >= this.field6521.field6578 || var16 == this.field6521.field6582[var6].method15966(var8, var12 + 2)) && var12 - var11 <= 10; var17 = this.field6521.field6579[var6][var8][var12 + 1]) {
                        ++var12;
                     }

                     int var18 = var6 - var6 + 1;
                     int var19 = this.field6521.field6582[var10 ? var6 + 1 : var6].method15966(var8, var11);
                     int var20 = var9.field6485 * var18 + var19;
                     int var21 = this.field6521.field6582[var10 ? var6 + 1 : var6].method15966(var8, var12 + 1);
                     int var22 = var9.field6485 * var18 + var21;
                     int var23 = var8 << this.field6521.field6567;
                     int var24 = var11 << this.field6521.field6567;
                     int var25 = (var12 << this.field6521.field6567) + this.field6521.field6605;
                     this.field6522[this.field6529++] = new class719(this.field6521, 1, var6, var9.field6487 + var23, var9.field6487 + var23, var9.field6487 + var23, var9.field6487 + var23, var19, var21, var22, var20, var24, var25, var25, var24);

                     for(int var26 = var6; var26 <= var14; ++var26) {
                        for(int var27 = var11; var27 <= var12; ++var27) {
                           this.field6521.field6579[var26][var8][var27].field6485 = (short)(this.field6521.field6579[var26][var8][var27].field6485 * -1);
                        }
                     }
                  }

                  if (var9.field6488 < 0) {
                     int var28 = var8;
                     int var29 = var8;
                     int var31 = var6;
                     class703 var32 = this.field6521.field6579[var6][var8 - 1][var7];
                     int var33 = this.field6521.field6582[var6].method15966(var8, var7);

                     while(var28 > 0 && var32 != null && var32.field6488 < 0 && var9.field6488 == var32.field6488 && var9.field6476 == var32.field6476 && var33 == this.field6521.field6582[var6].method15966(var28 - 1, var7) && (var28 - 1 <= 0 || var33 == this.field6521.field6582[var6].method15966(var28 - 2, var7)) && var29 - var28 <= 10) {
                        --var28;
                        var32 = this.field6521.field6579[var6][var28 - 1][var7];
                     }

                     for(class703 var34 = this.field6521.field6579[var6][var29 + 1][var7]; var29 < this.field6521.field6577 && var34 != null && var34.field6488 < 0 && var9.field6488 == var34.field6488 && var9.field6476 == var34.field6476 && var33 == this.field6521.field6582[var6].method15966(var29 + 1, var7) && (var29 + 1 >= this.field6521.field6577 || var33 == this.field6521.field6582[var6].method15966(var29 + 2, var7)) && var29 - var28 <= 10; var34 = this.field6521.field6579[var6][var29 + 1][var7]) {
                        ++var29;
                     }

                     int var35 = var6 - var6 + 1;
                     int var36 = this.field6521.field6582[var10 ? var6 + 1 : var6].method15966(var28, var7);
                     int var37 = var9.field6488 * var35 + var36;
                     int var38 = this.field6521.field6582[var10 ? var6 + 1 : var6].method15966(var29 + 1, var7);
                     int var39 = var9.field6488 * var35 + var38;
                     int var40 = var28 << this.field6521.field6567;
                     int var41 = (var29 << this.field6521.field6567) + this.field6521.field6605;
                     int var42 = var7 << this.field6521.field6567;
                     this.field6522[this.field6529++] = new class719(this.field6521, 2, var6, var40, var41, var41, var40, var36, var38, var39, var37, var9.field6476 + var42, var9.field6476 + var42, var9.field6476 + var42, var9.field6476 + var42);

                     for(int var43 = var6; var43 <= var31; ++var43) {
                        for(int var44 = var28; var44 <= var29; ++var44) {
                           this.field6521.field6579[var43][var44][var7].field6488 = (short)(this.field6521.field6579[var43][var44][var7].field6488 * -1);
                        }
                     }
                  }
               }
            }
         }
      }

      this.field6523 = true;
   }

   @deob.ObfuscatedName("os.r(IIIIIIII)V")
   public void method10397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.field6532[this.field6541++] = new class719(this.field6521, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
   }

   @deob.ObfuscatedName("os.p(Lra;I)V")
   public void method10393(class772 arg0, int arg1) {
      Statics.field6527 = arg0;
      if (this.field6516 && this.field6517) {
         if (this.field6546) {
            this.field6521.field6572.method15490();
         }

         Statics.field6527.method11497(this.field6543);
         if ((int)((float)this.field6543[0] / 3.0F) != this.field6544 || (int)((float)this.field6543[1] / 3.0F) != this.field6545) {
            this.field6544 = (int)((float)this.field6543[0] / 3.0F);
            this.field6545 = (int)((float)this.field6543[1] / 3.0F);
            this.field6540 = new int[this.field6545 * this.field6544];
         }

         this.field6533 = 0;

         for(int var3 = 0; var3 < this.field6541; ++var3) {
            this.method10399(Statics.field6527, this.field6532[var3], arg1);
         }

         for(int var4 = 0; var4 < this.field6529; ++var4) {
            this.method10399(Statics.field6527, this.field6522[var4], arg1);
         }

         for(int var5 = 0; var5 < this.field6531; ++var5) {
            this.method10399(Statics.field6527, this.field6528[var5], arg1);
         }

         this.field6520.field6496 = 0;
         if (this.field6533 > 0) {
            int var6 = this.field6540.length;
            int var7 = var6 - var6 & 7;
            int var8 = 0;

            while(var8 < var7) {
               this.field6540[var8++] = Integer.MAX_VALUE;
               this.field6540[var8++] = Integer.MAX_VALUE;
               this.field6540[var8++] = Integer.MAX_VALUE;
               this.field6540[var8++] = Integer.MAX_VALUE;
               this.field6540[var8++] = Integer.MAX_VALUE;
               this.field6540[var8++] = Integer.MAX_VALUE;
               this.field6540[var8++] = Integer.MAX_VALUE;
               this.field6540[var8++] = Integer.MAX_VALUE;
            }

            while(var8 < var6) {
               this.field6540[var8++] = Integer.MAX_VALUE;
            }

            this.field6520.field6502 = 1;

            for(int var9 = 0; var9 < this.field6533; ++var9) {
               class719 var10 = this.field6534[var9];
               this.field6520.method10354(var10.field6644[0], var10.field6644[1], var10.field6644[3], var10.field6656[0], var10.field6656[1], var10.field6656[3], var10.field6654[0], var10.field6654[1], var10.field6654[3]);
               this.field6520.method10354(var10.field6644[1], var10.field6644[2], var10.field6644[3], var10.field6656[1], var10.field6656[2], var10.field6656[3], var10.field6654[1], var10.field6654[2], var10.field6654[3]);
            }

            this.field6520.field6502 = 2;
         }

         if (this.field6546) {
            this.field6521.field6572.method15490();
         }

      } else {
         this.field6533 = 0;
      }
   }

   @deob.ObfuscatedName("os.o(Lra;Lpb;I)V")
   private void method10399(class772 arg0, class719 arg1, int arg2) {
      Statics.field6527 = arg0;
      if (this.field6535 != null && arg1.field6648 >= arg2) {
         for(int var4 = 0; var4 < this.field6535.length; ++var4) {
            if (this.field6535[var4] != -1000000 && (arg1.field6658[0] <= this.field6535[var4] || arg1.field6658[1] <= this.field6535[var4] || arg1.field6658[2] <= this.field6535[var4] || arg1.field6658[3] <= this.field6535[var4]) && (arg1.field6653[0] <= this.field6537[var4] || arg1.field6653[1] <= this.field6537[var4] || arg1.field6653[2] <= this.field6537[var4] || arg1.field6653[3] <= this.field6537[var4]) && (arg1.field6653[0] >= this.field6536[var4] || arg1.field6653[1] >= this.field6536[var4] || arg1.field6653[2] >= this.field6536[var4] || arg1.field6653[3] >= this.field6536[var4]) && (arg1.field6650[0] <= this.field6538[var4] || arg1.field6650[1] <= this.field6538[var4] || arg1.field6650[2] <= this.field6538[var4] || arg1.field6650[3] <= this.field6538[var4]) && (arg1.field6650[0] >= this.field6539[var4] || arg1.field6650[1] >= this.field6539[var4] || arg1.field6650[2] >= this.field6539[var4] || arg1.field6650[3] >= this.field6539[var4])) {
               return;
            }
         }
      }

      if (arg1.field6647 == 1) {
         int var5 = this.field6521.field6599 + (arg1.field6649 - this.field6521.field6603);
         if (var5 >= 0 && var5 <= this.field6521.field6599 + this.field6521.field6599) {
            int var6 = this.field6521.field6599 + (arg1.field6651 - this.field6521.field6604);
            if (var6 < 0) {
               var6 = 0;
            } else if (var6 > this.field6521.field6599 + this.field6521.field6599) {
               return;
            }

            int var7 = this.field6521.field6599 + (arg1.field6652 - this.field6521.field6604);
            if (var7 > this.field6521.field6599 + this.field6521.field6599) {
               var7 = this.field6521.field6599 + this.field6521.field6599;
            } else if (var7 < 0) {
               return;
            }

            boolean var8 = false;

            while(var6 <= var7) {
               if (this.field6521.field6616[var5][var6++]) {
                  var8 = true;
                  break;
               }
            }

            if (var8) {
               float var9 = (float)(this.field6521.field6594 - arg1.field6653[0]);
               if (var9 < 0.0F) {
                  var9 *= -1.0F;
               }

               if (!(var9 < (float)this.field6524)) {
                  if (this.method10444(arg1, 0)) {
                     if (this.method10444(arg1, 1)) {
                        if (this.method10444(arg1, 2)) {
                           if (this.method10444(arg1, 3)) {
                              this.field6534[this.field6533++] = arg1;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if (arg1.field6647 == 2) {
         int var10 = this.field6521.field6599 + (arg1.field6651 - this.field6521.field6604);
         if (var10 >= 0 && var10 <= this.field6521.field6599 + this.field6521.field6599) {
            int var11 = this.field6521.field6599 + (arg1.field6649 - this.field6521.field6603);
            if (var11 < 0) {
               var11 = 0;
            } else if (var11 > this.field6521.field6599 + this.field6521.field6599) {
               return;
            }

            int var12 = this.field6521.field6599 + (arg1.field6642 - this.field6521.field6603);
            if (var12 > this.field6521.field6599 + this.field6521.field6599) {
               var12 = this.field6521.field6599 + this.field6521.field6599;
            } else if (var12 < 0) {
               return;
            }

            boolean var13 = false;

            while(var11 <= var12) {
               if (this.field6521.field6616[var11++][var10]) {
                  var13 = true;
                  break;
               }
            }

            if (var13) {
               float var14 = (float)(this.field6521.field6606 - arg1.field6650[0]);
               if (var14 < 0.0F) {
                  var14 *= -1.0F;
               }

               if (!(var14 < (float)this.field6524)) {
                  if (this.method10444(arg1, 0)) {
                     if (this.method10444(arg1, 1)) {
                        if (this.method10444(arg1, 2)) {
                           if (this.method10444(arg1, 3)) {
                              this.field6534[this.field6533++] = arg1;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if (arg1.field6647 != 16 && arg1.field6647 != 8) {
         if (arg1.field6647 == 4) {
            float var15 = (float)(arg1.field6658[0] - this.field6521.field6607);
            if (!(var15 <= (float)this.field6525)) {
               int var16 = this.field6521.field6599 + (arg1.field6651 - this.field6521.field6604);
               if (var16 < 0) {
                  var16 = 0;
               } else if (var16 > this.field6521.field6599 + this.field6521.field6599) {
                  return;
               }

               int var17 = this.field6521.field6599 + (arg1.field6652 - this.field6521.field6604);
               if (var17 > this.field6521.field6599 + this.field6521.field6599) {
                  var17 = this.field6521.field6599 + this.field6521.field6599;
               } else if (var17 < 0) {
                  return;
               }

               int var18 = this.field6521.field6599 + (arg1.field6649 - this.field6521.field6603);
               if (var18 < 0) {
                  var18 = 0;
               } else if (var18 > this.field6521.field6599 + this.field6521.field6599) {
                  return;
               }

               int var19 = this.field6521.field6599 + (arg1.field6642 - this.field6521.field6603);
               if (var19 > this.field6521.field6599 + this.field6521.field6599) {
                  var19 = this.field6521.field6599 + this.field6521.field6599;
               } else if (var19 < 0) {
                  return;
               }

               boolean var20 = false;

               label291:
               for(int var21 = var18; var21 <= var19; ++var21) {
                  for(int var22 = var16; var22 <= var17; ++var22) {
                     if (this.field6521.field6616[var21][var22]) {
                        var20 = true;
                        break label291;
                     }
                  }
               }

               if (var20) {
                  if (this.method10444(arg1, 0)) {
                     if (this.method10444(arg1, 1)) {
                        if (this.method10444(arg1, 2)) {
                           if (this.method10444(arg1, 3)) {
                              this.field6534[this.field6533++] = arg1;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         int var23 = this.field6521.field6599 + (arg1.field6649 - this.field6521.field6603);
         if (var23 >= 0 && var23 <= this.field6521.field6599 + this.field6521.field6599) {
            int var24 = this.field6521.field6599 + (arg1.field6651 - this.field6521.field6604);
            if (var24 >= 0 && var24 <= this.field6521.field6599 + this.field6521.field6599) {
               if (this.field6521.field6616[var23][var24]) {
                  float var25 = (float)(this.field6521.field6594 - arg1.field6653[0]);
                  if (var25 < 0.0F) {
                     var25 *= -1.0F;
                  }

                  float var26 = (float)(this.field6521.field6606 - arg1.field6650[0]);
                  if (var26 < 0.0F) {
                     var26 *= -1.0F;
                  }

                  if (!(var25 < (float)this.field6524) || !(var26 < (float)this.field6524)) {
                     if (this.method10444(arg1, 0)) {
                        if (this.method10444(arg1, 1)) {
                           if (this.method10444(arg1, 2)) {
                              if (this.method10444(arg1, 3)) {
                                 this.field6534[this.field6533++] = arg1;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("os.a(Lpb;I)Z")
   private boolean method10444(class719 arg0, int arg1) {
      if (!this.method10401(arg0.field6653[arg1], arg0.field6658[arg1], arg0.field6650[arg1])) {
         return false;
      } else {
         arg0.field6656[arg1] = (short)((int)this.field6542[0]);
         arg0.field6644[arg1] = (short)((int)this.field6542[1]);
         arg0.field6654[arg1] = (short)((int)this.field6542[2]);
         return true;
      }
   }

   @deob.ObfuscatedName("os.x(III)Z")
   private final boolean method10401(int arg0, int arg1, int arg2) {
      Statics.field6527.method7736((float)arg0, (float)arg1, (float)arg2, this.field6542);
      if (this.field6542[2] < 50.0F) {
         return false;
      } else {
         this.field6542[0] /= 3.0F;
         this.field6542[1] /= 3.0F;
         return true;
      }
   }

   @deob.ObfuscatedName("os.s(III)Z")
   public boolean method10411(int arg0, int arg1, int arg2) {
      if (this.field6516 && this.field6517) {
         if (this.field6520.field6496 < 102) {
            return false;
         } else {
            int var4 = this.field6526[arg0][arg1][arg2];
            if (-this.field6521.field6576 == var4) {
               return false;
            } else if (this.field6521.field6576 == var4) {
               return true;
            } else if (this.field6521.field6584 == this.field6521.field6580) {
               return false;
            } else {
               int var5 = arg1 << this.field6521.field6567;
               int var6 = arg2 << this.field6521.field6567;
               if (this.method10445(var5 + 1, this.field6521.field6580[arg0].method15966(arg1, arg2), var6 + 1, this.field6521.field6605 + var5 - 1, this.field6521.field6580[arg0].method15966(arg1 + 1, arg2 + 1), this.field6521.field6605 + var6 - 1, var5 + 1, this.field6521.field6580[arg0].method15966(arg1, arg2 + 1), this.field6521.field6605 + var6 - 1) && this.method10445(var5 + 1, this.field6521.field6580[arg0].method15966(arg1, arg2), var6 + 1, this.field6521.field6605 + var5 - 1, this.field6521.field6580[arg0].method15966(arg1 + 1, arg2), var6 + 1, this.field6521.field6605 + var5 - 1, this.field6521.field6580[arg0].method15966(arg1 + 1, arg2 + 1), this.field6521.field6605 + var6 - 1)) {
                  this.field6526[arg0][arg1][arg2] = this.field6521.field6576;
                  return true;
               } else {
                  this.field6526[arg0][arg1][arg2] = -this.field6521.field6576;
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("os.l(Lakd;III)Z")
   public boolean method10402(class276 arg0, int arg1, int arg2, int arg3) {
      if (this.field6516 && this.field6517) {
         if (this.field6520.field6496 < 102) {
            return false;
         } else if (!this.method10411(arg1, arg2, arg3)) {
            return false;
         } else {
            int var5 = arg2 << this.field6521.field6567;
            int var6 = arg3 << this.field6521.field6567;
            int var7 = this.field6521.field6580[arg1].method15966(arg2, arg3) - 1;
            int var8 = var7 + arg0.method80();
            if (arg0.field1819 == 1) {
               if (!this.method10445(var5, var7, var6, var5, var8, var6, var5, var8, this.field6521.field6605 + var6)) {
                  return false;
               } else {
                  return this.method10445(var5, var7, var6, var5, var8, this.field6521.field6605 + var6, var5, var7, this.field6521.field6605 + var6);
               }
            } else if (arg0.field1819 == 2) {
               if (!this.method10445(var5, var7, this.field6521.field6605 + var6, this.field6521.field6605 + var5, var8, this.field6521.field6605 + var6, var5, var8, this.field6521.field6605 + var6)) {
                  return false;
               } else {
                  return this.method10445(var5, var7, this.field6521.field6605 + var6, this.field6521.field6605 + var5, var7, this.field6521.field6605 + var6, this.field6521.field6605 + var5, var8, this.field6521.field6605 + var6);
               }
            } else if (arg0.field1819 == 4) {
               if (!this.method10445(this.field6521.field6605 + var5, var7, var6, this.field6521.field6605 + var5, var8, var6, this.field6521.field6605 + var5, var8, this.field6521.field6605 + var6)) {
                  return false;
               } else {
                  return this.method10445(this.field6521.field6605 + var5, var7, var6, this.field6521.field6605 + var5, var8, this.field6521.field6605 + var6, this.field6521.field6605 + var5, var7, this.field6521.field6605 + var6);
               }
            } else if (arg0.field1819 == 8) {
               if (!this.method10445(var5, var7, var6, this.field6521.field6605 + var5, var8, var6, var5, var8, var6)) {
                  return false;
               } else {
                  return this.method10445(var5, var7, var6, this.field6521.field6605 + var5, var7, var6, this.field6521.field6605 + var5, var8, var6);
               }
            } else if (arg0.field1819 == 16) {
               return this.method10406(var5, var7, this.field6521.field6569 + var6, this.field6521.field6569, var8, this.field6521.field6569);
            } else if (arg0.field1819 == 32) {
               return this.method10406(this.field6521.field6569 + var5, var7, this.field6521.field6569 + var6, this.field6521.field6569, var8, this.field6521.field6569);
            } else if (arg0.field1819 == 64) {
               return this.method10406(this.field6521.field6569 + var5, var7, var6, this.field6521.field6569, var8, this.field6521.field6569);
            } else if (arg0.field1819 == 128) {
               return this.method10406(var5, var7, var6, this.field6521.field6569, var8, this.field6521.field6569);
            } else {
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("os.u(IIII)Z")
   public boolean method10398(int arg0, int arg1, int arg2, int arg3) {
      if (this.field6516 && this.field6517) {
         if (this.field6520.field6496 < 102) {
            return false;
         } else if (!this.method10411(arg0, arg1, arg2)) {
            return false;
         } else {
            int var5 = arg1 << this.field6521.field6567;
            int var6 = arg2 << this.field6521.field6567;
            return this.method10406(var5, this.field6521.field6580[arg0].method15966(arg1, arg2), var6, this.field6521.field6605, arg3, this.field6521.field6605);
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("os.v(IIIIILov;)Z")
   public boolean method10404(int arg0, int arg1, int arg2, int arg3, int arg4, class712 arg5) {
      if (this.field6516 && this.field6517) {
         if (this.field6520.field6496 < 102) {
            return false;
         } else if (arg1 == arg2 && arg3 == arg4) {
            if (!this.method10411(arg0, arg1, arg3)) {
               return false;
            } else {
               return this.method10405(arg5);
            }
         } else {
            for(int var7 = arg1; var7 <= arg2; ++var7) {
               for(int var8 = arg3; var8 <= arg4; ++var8) {
                  if (this.field6526[arg0][var7][var8] == -this.field6521.field6576) {
                     return false;
                  }
               }
            }

            if (!this.method10405(arg5)) {
               return false;
            } else {
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("os.g(Lov;)Z")
   private final boolean method10405(class712 arg0) {
      return arg0 == null ? false : this.method10406(arg0.field6556, arg0.field6562, arg0.field6564, arg0.field6561 - arg0.field6556, arg0.field6563 - arg0.field6562, arg0.field6565 - arg0.field6564);
   }

   @deob.ObfuscatedName("os.h(IIIIII)Z")
   private final boolean method10406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg0 + arg3;
      int var8 = arg1 + arg4;
      int var9 = arg2 + arg5;
      if (!this.method10445(arg0, var8, arg2, var7, var8, var9, arg0, var8, var9)) {
         return false;
      } else if (!this.method10445(arg0, var8, arg2, var7, var8, arg2, var7, var8, var9)) {
         return false;
      } else {
         if (arg0 < this.field6521.field6594) {
            if (!this.method10445(arg0, arg1, var9, arg0, var8, arg2, arg0, var8, var9)) {
               return false;
            }

            if (!this.method10445(arg0, arg1, var9, arg0, arg1, arg2, arg0, var8, arg2)) {
               return false;
            }
         } else {
            if (!this.method10445(var7, arg1, var9, var7, var8, arg2, var7, var8, var9)) {
               return false;
            }

            if (!this.method10445(var7, arg1, var9, var7, arg1, arg2, var7, var8, arg2)) {
               return false;
            }
         }

         if (arg2 < this.field6521.field6606) {
            if (!this.method10445(arg0, arg1, arg2, var7, var8, arg2, arg0, var8, arg2)) {
               return false;
            }

            if (!this.method10445(arg0, arg1, arg2, var7, arg1, arg2, var7, var8, arg2)) {
               return false;
            }
         } else {
            if (!this.method10445(arg0, arg1, var9, var7, var8, var9, arg0, var8, var9)) {
               return false;
            }

            if (!this.method10445(arg0, arg1, var9, var7, arg1, var9, var7, var8, var9)) {
               return false;
            }
         }

         return true;
      }
   }

   @deob.ObfuscatedName("os.e(IIIIIIIII)Z")
   private final boolean method10445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (!this.method10401(arg0, arg1, arg2)) {
         return false;
      } else {
         int var10 = (int)this.field6542[0];
         int var11 = (int)this.field6542[1];
         int var12 = (int)this.field6542[2];
         if (!this.method10401(arg3, arg4, arg5)) {
            return false;
         } else {
            int var13 = (int)this.field6542[0];
            int var14 = (int)this.field6542[1];
            int var15 = (int)this.field6542[2];
            if (!this.method10401(arg6, arg7, arg8)) {
               return false;
            } else {
               int var16 = (int)this.field6542[0];
               int var17 = (int)this.field6542[1];
               int var18 = (int)this.field6542[2];
               return this.field6520.method10354(var11, var14, var17, var10, var13, var16, var12, var15, var18);
            }
         }
      }
   }
}
