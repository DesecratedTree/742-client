import java.util.Iterator;

@deob.ObfuscatedName("ow")
public class class713 {
   @deob.ObfuscatedName("ow.n")
   public static boolean field6570 = true;
   @deob.ObfuscatedName("ow.r")
   private final int field6611 = 16;
   @deob.ObfuscatedName("ow.f")
   private int field6591 = 0;
   @deob.ObfuscatedName("ow.ai")
   private final int field6592 = 10062;
   @deob.ObfuscatedName("ow.ap")
   private final int field6598 = 5099;
   @deob.ObfuscatedName("ow.av")
   private final int field6623 = 5026;
   @deob.ObfuscatedName("ow.ac")
   private final float[] field6608 = new float[3];
   @deob.ObfuscatedName("ow.ay")
   private final class81[] field6617 = new class81[8];
   @deob.ObfuscatedName("ow.bf")
   private final int field6618 = 65008;
   @deob.ObfuscatedName("ow.p")
   public final class772 field6571;
   @deob.ObfuscatedName("ow.a")
   private final boolean field6573;
   @deob.ObfuscatedName("ow.k")
   public final int field6567;
   @deob.ObfuscatedName("ow.d")
   public final int field6605;
   @deob.ObfuscatedName("ow.b")
   public final int field6569;
   @deob.ObfuscatedName("ow.l")
   public int field6614;
   @deob.ObfuscatedName("ow.u")
   public final int field6577;
   @deob.ObfuscatedName("ow.v")
   public final int field6578;
   @deob.ObfuscatedName("ow.aq")
   public int field6599;
   /** Radius, in tiles, the visibility grids are allocated for; {@link #field6599} never exceeds it. */
   public final int maxRenderRadius;
   @deob.ObfuscatedName("ow.o")
   public class889 field6572;
   @deob.ObfuscatedName("ow.s")
   public final class709 field6566;
   @deob.ObfuscatedName("ow.e")
   public class703[][][] field6581;
   @deob.ObfuscatedName("ow.z")
   public class934[] field6582;
   @deob.ObfuscatedName("ow.t")
   private int[][] field6585;
   @deob.ObfuscatedName("ow.w")
   private byte[][] field6587;
   @deob.ObfuscatedName("ow.c")
   private short[][] field6586;
   @deob.ObfuscatedName("ow.q")
   private byte[][] field6588;
   @deob.ObfuscatedName("ow.y")
   private byte[][] field6622;
   @deob.ObfuscatedName("ow.j")
   private byte[][] field6590;
   @deob.ObfuscatedName("ow.m")
   public class703[][][] field6596;
   @deob.ObfuscatedName("ow.i")
   public class934[] field6584;
   @deob.ObfuscatedName("ow.bs")
   public long[][][] field6620;
   @deob.ObfuscatedName("ow.br")
   public class698[] field6621;
   @deob.ObfuscatedName("ow.ba")
   private boolean[] field6593;
   @deob.ObfuscatedName("ow.bp")
   private int field6619;
   @deob.ObfuscatedName("ow.ax")
   private final class134[] field6597;
   @deob.ObfuscatedName("ow.af")
   private final class134[] field6609;
   @deob.ObfuscatedName("ow.at")
   private final class134[] field6626;
   @deob.ObfuscatedName("ow.an")
   private final class134[] field6583;
   @deob.ObfuscatedName("ow.ah")
   private int field6595;
   @deob.ObfuscatedName("ow.al")
   private final class134[] field6600;
   @deob.ObfuscatedName("ow.aw")
   private int field6575;
   @deob.ObfuscatedName("ow.ag")
   private final class290[] field6602;
   @deob.ObfuscatedName("ow.bq")
   public boolean[][] field6616;
   @deob.ObfuscatedName("ow.bc")
   private boolean[][] field6624;
   @deob.ObfuscatedName("ow.bw")
   private final int[] field6568;
   @deob.ObfuscatedName("ow.bg")
   public class693 field6589;
   @deob.ObfuscatedName("ow.az")
   public int field6576;
   @deob.ObfuscatedName("ow.ao")
   public int field6594;
   @deob.ObfuscatedName("ow.as")
   private int field6601;
   @deob.ObfuscatedName("ow.ak")
   public int field6603;
   @deob.ObfuscatedName("ow.aa")
   public int field6604;
   @deob.ObfuscatedName("ow.ab")
   public int field6606;
   @deob.ObfuscatedName("ow.ae")
   public int field6607;
   @deob.ObfuscatedName("ow.am")
   private int field6610;
   @deob.ObfuscatedName("ow.au")
   private int field6612;
   @deob.ObfuscatedName("ow.ad")
   private int field6613;
   @deob.ObfuscatedName("ow.aj")
   private int field6615;
   @deob.ObfuscatedName("ow.ar")
   private int field6625;
   @deob.ObfuscatedName("ow.x")
   private boolean field6574;
   @deob.ObfuscatedName("ow.h")
   public class934[] field6580;
   @deob.ObfuscatedName("ow.by")
   private boolean[][] field6627;
   @deob.ObfuscatedName("ow.g")
   public class703[][][] field6579;

   public class713(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.field6571 = arg0;
      this.field6573 = this.field6571.method7499() > 0;
      this.field6567 = arg1;
      this.field6605 = 1 << this.field6567;
      this.field6569 = this.field6605 >> 1;
      this.field6614 = arg2;
      this.field6577 = arg3;
      this.field6578 = arg4;
      this.field6599 = arg5;
      this.maxRenderRadius = arg5;
      this.field6572 = new class889();
      this.field6566 = new class709(this);
      this.field6581 = new class703[arg2][this.field6577][this.field6578];
      this.field6582 = new class934[arg2];
      if (arg6) {
         this.field6585 = new int[this.field6577][this.field6578];
         this.field6587 = new byte[this.field6577][this.field6578];
         this.field6586 = new short[this.field6577][this.field6578];
         this.field6588 = new byte[this.field6577][this.field6578];
         this.field6622 = new byte[this.field6577][this.field6578];
         this.field6590 = new byte[this.field6577][this.field6578];
         this.field6596 = new class703[1][this.field6577][this.field6578];
         this.field6584 = new class934[1];
      }

      if (arg7) {
         this.field6620 = new long[arg2][arg3][arg4];
         this.field6621 = new class698[65008];
         this.field6593 = new boolean[65008];
         this.field6619 = 0;
      }

      this.method10481(false);
      this.field6597 = new class134[2];
      this.field6609 = new class134[2];
      this.field6626 = new class134[2];
      this.field6583 = new class134[10062];
      this.field6595 = 0;
      this.field6600 = new class134[5099];
      this.field6575 = 0;
      this.field6602 = new class290[5026];
      this.field6591 = 0;
      this.field6616 = new boolean[this.maxRenderRadius + this.maxRenderRadius + 1][this.maxRenderRadius + this.maxRenderRadius + 1];
      this.field6624 = new boolean[this.maxRenderRadius + this.maxRenderRadius + 2][this.maxRenderRadius + this.maxRenderRadius + 2];
      this.field6568 = new int[this.maxRenderRadius + this.maxRenderRadius + 2];
      this.field6589 = new class693(false);
   }

   /** Moves the meshed radius (in tiles) without rebuilding the scene; clamped to the allocated grid. */
   public void setRenderRadius(int arg0) {
      if (arg0 < 8) {
         arg0 = 8;
      } else if (arg0 > this.maxRenderRadius) {
         arg0 = this.maxRenderRadius;
      }

      this.field6599 = arg0;
   }

   @deob.ObfuscatedName("ow.n(II)V")
   public void method10537(int arg0) {
   }

   @deob.ObfuscatedName("ow.k(Ll;B)V")
   public void method10616(class609 arg0) {
   }

   @deob.ObfuscatedName("ow.d(ZI)V")
   public void method10481(boolean arg0) {
      if (arg0) {
         this.field6579 = this.field6596;
         this.field6580 = this.field6584;
      } else {
         this.field6579 = this.field6581;
         this.field6580 = this.field6582;
      }

      this.field6614 = this.field6579.length;
   }

   @deob.ObfuscatedName("ow.b(I)V")
   public void method10482() {
      for(int var1 = 0; var1 < this.field6577; ++var1) {
         for(int var2 = 0; var2 < this.field6578; ++var2) {
            if (this.field6579[0][var1][var2] == null) {
               this.field6579[0][var1][var2] = new class703(0);
            }
         }
      }

   }

   @deob.ObfuscatedName("ow.r(III)V")
   public void method10483(int arg0, int arg1) {
      class703 var3 = this.field6579[0][arg0][arg1];

      for(int var4 = 0; var4 < 3; ++var4) {
         class703 var5 = this.field6579[var4][arg0][arg1] = this.field6579[var4 + 1][arg0][arg1];
         if (var5 != null) {
            for(class699 var6 = var5.field6484; var6 != null; var6 = var6.field6457) {
               class290 var7 = var6.field6458;
               if (var7.field1875 == arg0 && var7.field1874 == arg1) {
                  --var7.field1032;
               }
            }

            if (var5.field6482 != null) {
               --var5.field6482.field1032;
            }

            if (var5.field6481 != null) {
               --var5.field6481.field1032;
            }

            if (var5.field6479 != null) {
               --var5.field6479.field1032;
            }

            if (var5.field6480 != null) {
               --var5.field6480.field1032;
            }

            if (var5.field6486 != null) {
               --var5.field6486.field1032;
            }
         }
      }

      if (this.field6579[0][arg0][arg1] == null) {
         this.field6579[0][arg0][arg1] = new class703(0);
         this.field6579[0][arg0][arg1].field6477 = 1;
      }

      this.field6579[0][arg0][arg1].field6478 = var3;
      this.field6579[3][arg0][arg1] = null;
   }

   @deob.ObfuscatedName("ow.p(IIII)Lom;")
   private class703 method10484(int arg0, int arg1, int arg2) {
      if (this.field6579[arg0][arg1][arg2] == null) {
         boolean var4 = this.field6579[0][arg1][arg2] != null && this.field6579[0][arg1][arg2].field6478 != null;
         if (var4 && arg0 >= this.field6614 - 1) {
            return null;
         }

         this.method10485(arg0, arg1, arg2);
      }

      return this.field6579[arg0][arg1][arg2];
   }

   @deob.ObfuscatedName("ow.o(IIII)V")
   public void method10485(int arg0, int arg1, int arg2) {
      boolean var4 = this.field6579[0][arg1][arg2] != null && this.field6579[0][arg1][arg2].field6478 != null;

      for(int var5 = arg0; var5 >= 0; --var5) {
         if (this.field6579[var5][arg1][arg2] == null) {
            class703 var6 = this.field6579[var5][arg1][arg2] = new class703(var5);
            if (var4) {
               ++var6.field6477;
            }
         }
      }

   }

   @deob.ObfuscatedName("ow.a(ILxa;I)V")
   public void method10486(int arg0, class934 arg1) {
      this.field6580[arg0] = arg1;
   }

   @deob.ObfuscatedName("ow.x(III)I")
   public int method10523(int arg0, int arg1) {
      return this.field6586 != null ? this.field6586[arg0][arg1] & 65535 : 0;
   }

   @deob.ObfuscatedName("ow.s(IIB)I")
   public int method10488(int arg0, int arg1) {
      return this.field6585 != null ? this.field6585[arg0][arg1] & 16777215 : 0;
   }

   @deob.ObfuscatedName("ow.l(III)I")
   public int method10496(int arg0, int arg1) {
      return this.field6587 != null ? this.field6587[arg0][arg1] & 255 : 0;
   }

   @deob.ObfuscatedName("ow.u(III)I")
   public int method10490(int arg0, int arg1) {
      return this.field6588 != null ? this.field6588[arg0][arg1] & 255 : 0;
   }

   @deob.ObfuscatedName("ow.v(III)I")
   public int method10546(int arg0, int arg1) {
      return this.field6622 != null ? this.field6622[arg0][arg1] & 255 : 0;
   }

   @deob.ObfuscatedName("ow.g(III)I")
   public int method10492(int arg0, int arg1) {
      return this.field6590 != null ? this.field6590[arg0][arg1] & 255 : 0;
   }

   @deob.ObfuscatedName("ow.h(IIIIIIIIB)V")
   public void method10493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (this.field6585 != null) {
         this.field6585[arg0][arg1] = -16777216 | arg2;
      }

      if (this.field6586 != null) {
         this.field6586[arg0][arg1] = (short)arg3;
      }

      if (this.field6587 != null) {
         this.field6587[arg0][arg1] = (byte)arg4;
      }

      if (this.field6588 != null) {
         this.field6588[arg0][arg1] = (byte)arg5;
      }

      if (this.field6622 != null) {
         this.field6622[arg0][arg1] = (byte)arg6;
      }

      if (this.field6590 != null) {
         this.field6590[arg0][arg1] = (byte)arg7;
      }

   }

   @deob.ObfuscatedName("ow.e(IIILakc;I)V")
   public void method10494(int arg0, int arg1, int arg2, class275 arg3) {
      class703 var5 = this.method10484(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field6482 = arg3;
         int var6 = this.field6584 == this.field6580 ? 1 : 0;
         if (arg3.method81()) {
            if (arg3.method82()) {
               arg3.field1035 = this.field6609[var6];
               this.field6609[var6] = arg3;
            } else {
               arg3.field1035 = this.field6597[var6];
               this.field6597[var6] = arg3;
            }
         } else {
            arg3.field1035 = this.field6626[var6];
            this.field6626[var6] = arg3;
         }
      }

   }

   @deob.ObfuscatedName("ow.z(IIIILaky;B)V")
   public void method10518(int arg0, int arg1, int arg2, int arg3, class297 arg4) {
      class703 var6 = this.method10484(arg0, arg1, arg2);
      if (var6 != null) {
         arg4.method11626(new class584((float)((arg1 << this.field6567) + this.field6569), (float)arg3, (float)((arg2 << this.field6567) + this.field6569)));
         var6.field6483 = arg4;
         int var7 = this.field6584 == this.field6580 ? 1 : 0;
         if (arg4.method81()) {
            if (arg4.method82()) {
               arg4.field1035 = this.field6609[var7];
               this.field6609[var7] = arg4;
            } else {
               arg4.field1035 = this.field6597[var7];
               this.field6597[var7] = arg4;
            }
         } else {
            arg4.field1035 = this.field6626[var7];
            this.field6626[var7] = arg4;
         }
      }

   }

   @deob.ObfuscatedName("ow.m(IIILakd;Lakd;B)V")
   public void method10560(int arg0, int arg1, int arg2, class276 arg3, class276 arg4) {
      class703 var6 = this.method10484(arg0, arg1, arg2);
      if (var6 != null) {
         var6.field6481 = arg3;
         var6.field6479 = arg4;
         int var7 = this.field6584 == this.field6580 ? 1 : 0;
         if (arg3.method81()) {
            if (arg3.method82()) {
               arg3.field1035 = this.field6609[var7];
               this.field6609[var7] = arg3;
            } else {
               arg3.field1035 = this.field6597[var7];
               this.field6597[var7] = arg3;
            }
         } else {
            arg3.field1035 = this.field6626[var7];
            this.field6626[var7] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method81()) {
               if (arg4.method82()) {
                  arg4.field1035 = this.field6609[var7];
                  this.field6609[var7] = arg4;
               } else {
                  arg4.field1035 = this.field6597[var7];
                  this.field6597[var7] = arg4;
               }
            } else {
               arg4.field1035 = this.field6626[var7];
               this.field6626[var7] = arg4;
            }
         }
      }

   }

   @deob.ObfuscatedName("ow.i(IIILakp;Lakp;I)V")
   public void method10497(int arg0, int arg1, int arg2, class288 arg3, class288 arg4) {
      class703 var6 = this.method10484(arg0, arg1, arg2);
      if (var6 != null) {
         var6.field6480 = arg3;
         var6.field6486 = arg4;
         int var7 = this.field6584 == this.field6580 ? 1 : 0;
         if (arg3.method81()) {
            if (arg3.method82()) {
               arg3.field1035 = this.field6609[var7];
               this.field6609[var7] = arg3;
            } else {
               arg3.field1035 = this.field6597[var7];
               this.field6597[var7] = arg3;
            }
         } else {
            arg3.field1035 = this.field6626[var7];
            this.field6626[var7] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method81()) {
               if (arg4.method82()) {
                  arg4.field1035 = this.field6609[var7];
                  this.field6609[var7] = arg4;
               } else {
                  arg4.field1035 = this.field6597[var7];
                  this.field6597[var7] = arg4;
               }
            } else {
               arg4.field1035 = this.field6626[var7];
               this.field6626[var7] = arg4;
            }
         }
      }

   }

   @deob.ObfuscatedName("ow.t(Lakr;ZI)Z")
   public boolean method10498(class290 arg0, boolean arg1) {
      boolean var3 = this.field6584 == this.field6580;
      int var4 = 0;
      short var5 = 0;
      byte var6 = 0;
      arg0.method184();
      if (arg0.field1875 >= 0 && arg0.field1874 >= 0 && arg0.field1873 < this.field6577 && arg0.field1876 < this.field6578) {
         short var7 = 0;

         for(int var8 = arg0.field1875; var8 <= arg0.field1873; ++var8) {
            for(int var9 = arg0.field1874; var9 <= arg0.field1876; ++var9) {
               class703 var10 = this.method10484(arg0.field1032, var8, var9);
               if (var10 != null) {
                  class699 var11 = class699.method4063(arg0);
                  class699 var12 = var10.field6484;
                  if (var12 == null) {
                     var10.field6484 = var11;
                  } else {
                     while(var12.field6457 != null) {
                        var12 = var12.field6457;
                     }

                     var12.field6457 = var11;
                  }

                  if (var3 && (this.field6585[var8][var9] & -16777216) != 0) {
                     var4 = this.field6585[var8][var9];
                     var5 = this.field6586[var8][var9];
                     var6 = this.field6587[var8][var9];
                  }

                  if (!arg1 && var10.field6482 != null && var10.field6482.field1809 > var7) {
                     var7 = var10.field6482.field1809;
                  }
               }
            }
         }

         if (var3 && (var4 & -16777216) != 0) {
            for(int var13 = arg0.field1875; var13 <= arg0.field1873; ++var13) {
               for(int var14 = arg0.field1874; var14 <= arg0.field1876; ++var14) {
                  if ((this.field6585[var13][var14] & -16777216) == 0) {
                     this.field6585[var13][var14] = var4;
                     this.field6586[var13][var14] = var5;
                     this.field6587[var13][var14] = var6;
                  }
               }
            }
         }

         if (arg1) {
            this.field6602[++this.field6591 - 1] = arg0;
            arg0.field1033 = this;
         } else {
            int var15 = this.field6584 == this.field6580 ? 1 : 0;
            if (arg0.method81()) {
               if (arg0.method82()) {
                  arg0.field1035 = this.field6609[var15];
                  this.field6609[var15] = arg0;
               } else {
                  arg0.field1035 = this.field6597[var15];
                  this.field6597[var15] = arg0;
               }
            } else {
               arg0.field1035 = this.field6626[var15];
               this.field6626[var15] = arg0;
            }
         }

         if (arg1) {
            class584 var16 = class584.method8135(arg0.method11602().field5446);
            var16.field5330 -= (float)var7;
            arg0.method11626(var16);
            var16.method8201();
         }

         return true;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("ow.c(IIIIB)V")
   public void method10499(int arg0, int arg1, int arg2, int arg3) {
      class703 var5 = this.field6579[arg0][arg1][arg2];
      if (var5 != null) {
         class288 var6 = var5.field6480;
         class288 var7 = var5.field6486;
         if (var6 != null) {
            var6.field1862 = (short)(var6.field1862 * arg3 / (16 << this.field6567 - 7));
            var6.field1861 = (short)(var6.field1861 * arg3 / (16 << this.field6567 - 7));
         }

         if (var7 != null) {
            var7.field1862 = (short)(var7.field1862 * arg3 / (16 << this.field6567 - 7));
            var7.field1861 = (short)(var7.field1861 * arg3 / (16 << this.field6567 - 7));
         }

      }
   }

   @deob.ObfuscatedName("ow.w(B)V")
   public void method10578() {
      for(int var1 = 0; var1 < this.field6591; ++var1) {
         class290 var2 = this.field6602[var1];
         this.method10508(var2, true);
         this.field6602[var1] = null;
      }

      this.field6591 = 0;
   }

   @deob.ObfuscatedName("ow.q(IIII)Lakd;")
   public class276 method10501(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      if (var4 != null) {
         this.method10509(var4.field6481);
         if (var4.field6481 != null) {
            class276 var5 = var4.field6481;
            var4.field6481 = null;
            return var5;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ow.y(IIII)Lakd;")
   public class276 method10502(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      if (var4 != null) {
         this.method10509(var4.field6479);
         if (var4.field6479 != null) {
            class276 var5 = var4.field6479;
            var4.field6479 = null;
            return var5;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ow.j(IIII)Lakp;")
   public class288 method10620(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      if (var4 != null) {
         this.method10509(var4.field6480);
         if (var4.field6480 != null) {
            class288 var5 = var4.field6480;
            var4.field6480 = null;
            return var5;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ow.f(IIII)Lakp;")
   public class288 method10504(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      if (var4 != null) {
         this.method10509(var4.field6486);
         if (var4.field6486 != null) {
            class288 var5 = var4.field6486;
            var4.field6486 = null;
            return var5;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ow.ai(IIIB)Lakc;")
   public class275 method10505(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         this.method10509(var4.field6482);
         if (var4.field6482 != null) {
            class275 var5 = var4.field6482;
            var4.field6482 = null;
            return var5;
         } else {
            return null;
         }
      }
   }

   @deob.ObfuscatedName("ow.ap(IIII)Laky;")
   public class297 method10506(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         class297 var5 = var4.field6483;
         var4.field6483 = null;
         this.method10509(var5);
         return var5;
      }
   }

   @deob.ObfuscatedName("ow.av(IIILoz;B)Lakr;")
   public class290 method10507(int arg0, int arg1, int arg2, class716 arg3) {
      class703 var5 = this.field6579[arg0][arg1][arg2];
      if (var5 == null) {
         return null;
      } else {
         for(class699 var6 = var5.field6484; var6 != null; var6 = var6.field6457) {
            class290 var7 = var6.field6458;
            if ((arg3 == null || arg3.method9729(var7)) && var7.field1875 == arg1 && var7.field1874 == arg2) {
               this.method10508(var7, false);
               return var7;
            }
         }

         return null;
      }
   }

   @deob.ObfuscatedName("ow.ax(Lakr;ZI)V")
   private void method10508(class290 arg0, boolean arg1) {
      for(int var3 = arg0.field1875; var3 <= arg0.field1873; ++var3) {
         for(int var4 = arg0.field1874; var4 <= arg0.field1876; ++var4) {
            class703 var5 = this.field6579[arg0.field1032][var3][var4];
            if (var5 != null) {
               class699 var6 = var5.field6484;
               class699 var7 = null;

               while(var6 != null) {
                  if (var6.field6458 == arg0) {
                     if (var7 != null) {
                        var7.field6457 = var6.field6457;
                     } else {
                        var5.field6484 = var6.field6457;
                     }

                     var6.method10288();
                     break;
                  }

                  var7 = var6;
                  var6 = var6.field6457;
               }
            }
         }
      }

      if (!arg1) {
         this.method10509(arg0);
      }

   }

   @deob.ObfuscatedName("ow.af(Laex;I)V")
   private void method10509(class134 arg0) {
      if (arg0 != null) {
         arg0.method11612();

         for(int var2 = 0; var2 < 2; ++var2) {
            class134 var3 = null;

            for(class134 var4 = this.field6597[var2]; var4 != null; var4 = var4.field1035) {
               if (arg0 == var4) {
                  if (var3 != null) {
                     var3.field1035 = var4.field1035;
                  } else {
                     this.field6597[var2] = var4.field1035;
                  }

                  return;
               }

               var3 = var4;
            }

            class134 var5 = null;

            for(class134 var6 = this.field6609[var2]; var6 != null; var6 = var6.field1035) {
               if (arg0 == var6) {
                  if (var5 != null) {
                     var5.field1035 = var6.field1035;
                  } else {
                     this.field6609[var2] = var6.field1035;
                  }

                  return;
               }

               var5 = var6;
            }

            class134 var7 = null;

            for(class134 var8 = this.field6626[var2]; var8 != null; var8 = var8.field1035) {
               if (arg0 == var8) {
                  if (var7 != null) {
                     var7.field1035 = var8.field1035;
                  } else {
                     this.field6626[var2] = var8.field1035;
                  }

                  return;
               }

               var7 = var8;
            }
         }

      }
   }

   @deob.ObfuscatedName("ow.at(IIII)Lakd;")
   public class276 method10510(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      return var4 == null ? null : var4.field6481;
   }

   @deob.ObfuscatedName("ow.ah(IIII)Lakd;")
   public class276 method10491(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      return var4 == null ? null : var4.field6479;
   }

   @deob.ObfuscatedName("ow.aw(IIII)Lakp;")
   public class288 method10577(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      return var4 == null ? null : var4.field6480;
   }

   @deob.ObfuscatedName("ow.al(IIII)Laky;")
   public class297 method10513(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      return var4 == null ? null : var4.field6483;
   }

   @deob.ObfuscatedName("ow.an(IIILoz;I)Lakr;")
   public class290 method10514(int arg0, int arg1, int arg2, class716 arg3) {
      class703 var5 = this.field6579[arg0][arg1][arg2];
      if (var5 == null) {
         return null;
      } else {
         for(class699 var6 = var5.field6484; var6 != null; var6 = var6.field6457) {
            class290 var7 = var6.field6458;
            if ((arg3 == null || arg3.method9729(var7)) && var7.field1875 == arg1 && var7.field1874 == arg2) {
               return var7;
            }
         }

         return null;
      }
   }

   @deob.ObfuscatedName("ow.ag(IIII)Loi;")
   public class699 method10580(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      return var4 == null ? null : var4.field6484;
   }

   @deob.ObfuscatedName("ow.ak(IIII)Lakc;")
   public class275 method10516(int arg0, int arg1, int arg2) {
      class703 var4 = this.field6579[arg0][arg1][arg2];
      return var4 != null && var4.field6482 != null ? var4.field6482 : null;
   }

   @deob.ObfuscatedName("ow.aa()V")
   public void method10517() {
      for(int var1 = 0; var1 < this.field6614; ++var1) {
         for(int var2 = 0; var2 < this.field6577; ++var2) {
            for(int var3 = 0; var3 < this.field6578; ++var3) {
               class703 var4 = this.field6579[var1][var2][var3];
               if (var4 != null) {
                  class276 var5 = var4.field6481;
                  class276 var6 = var4.field6479;
                  if (var5 != null && var5.method2016()) {
                     this.method10536(var5, var1, var2, var3, 1, 1);
                     if (var6 != null && var6.method2016()) {
                        this.method10536(var6, var1, var2, var3, 1, 1);
                        var6.method2008(this.field6571, var5, 0, 0, 0, false);
                        var6.method2028();
                     }

                     var5.method2028();
                  }

                  for(class699 var7 = var4.field6484; var7 != null; var7 = var7.field6457) {
                     class290 var8 = var7.field6458;
                     if (var8 != null && var8.method2016()) {
                        this.method10536(var8, var1, var2, var3, var8.field1873 - var8.field1875 + 1, var8.field1876 - var8.field1874 + 1);
                        var8.method2028();
                     }
                  }

                  class275 var9 = var4.field6482;
                  if (var9 != null && var9.method2016()) {
                     this.method10635(var9, var1, var2, var3);
                     var9.method2028();
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ow.ao(Laex;IIII)V")
   private void method10635(class134 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < this.field6577) {
         class703 var5 = this.field6579[arg1][arg2 + 1][arg3];
         if (var5 != null && var5.field6482 != null && var5.field6482.method2016()) {
            int var6 = (this.field6580[arg1].method15966(arg2 + 1, arg3) + this.field6580[arg1].method15966(arg2 + 1 + 1, arg3) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1 + 1, arg3 + 1)) / 4 - (this.field6580[arg1].method15966(arg2, arg3) + this.field6580[arg1].method15966(arg2 + 1, arg3) + this.field6580[arg1].method15966(arg2, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1)) / 4;
            arg0.method2008(this.field6571, var5.field6482, this.field6605, var6, 0, true);
         }
      }

      if (arg3 < this.field6577) {
         class703 var7 = this.field6579[arg1][arg2][arg3 + 1];
         if (var7 != null && var7.field6482 != null && var7.field6482.method2016()) {
            int var8 = (this.field6580[arg1].method15966(arg2, arg3) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1) + this.field6580[arg1].method15966(arg2, arg3 + 1 + 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1 + 1)) / 4 - (this.field6580[arg1].method15966(arg2, arg3) + this.field6580[arg1].method15966(arg2 + 1, arg3) + this.field6580[arg1].method15966(arg2, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1)) / 4;
            arg0.method2008(this.field6571, var7.field6482, 0, var8, this.field6605, true);
         }
      }

      if (arg2 < this.field6577 && arg3 < this.field6578) {
         class703 var9 = this.field6579[arg1][arg2 + 1][arg3 + 1];
         if (var9 != null && var9.field6482 != null && var9.field6482.method2016()) {
            int var10 = (this.field6580[arg1].method15966(arg2 + 1, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1 + 1, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1 + 1) + this.field6580[arg1].method15966(arg2 + 1 + 1, arg3 + 1 + 1)) / 4 - (this.field6580[arg1].method15966(arg2, arg3) + this.field6580[arg1].method15966(arg2 + 1, arg3) + this.field6580[arg1].method15966(arg2, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1)) / 4;
            arg0.method2008(this.field6571, var9.field6482, this.field6605, var10, this.field6605, true);
         }
      }

      if (arg2 < this.field6577 && arg3 > 0) {
         class703 var11 = this.field6579[arg1][arg2 + 1][arg3 - 1];
         if (var11 != null && var11.field6482 != null && var11.field6482.method2016()) {
            int var12 = (this.field6580[arg1].method15966(arg2 + 1, arg3 - 1) + this.field6580[arg1].method15966(arg2 + 1 + 1, arg3 - 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1 - 1) + this.field6580[arg1].method15966(arg2 + 1 + 1, arg3 + 1 - 1)) / 4 - (this.field6580[arg1].method15966(arg2, arg3) + this.field6580[arg1].method15966(arg2 + 1, arg3) + this.field6580[arg1].method15966(arg2, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1)) / 4;
            arg0.method2008(this.field6571, var11.field6482, this.field6605, var12, -this.field6605, true);
         }
      }

   }

   @deob.ObfuscatedName("ow.ab(Laex;IIIII)V")
   private void method10536(class134 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = true;
      int var8 = arg2;
      int var9 = arg2 + arg4;
      int var10 = arg3 - 1;
      int var11 = arg3 + arg5;

      for(int var12 = arg1; var12 <= arg1 + 1; ++var12) {
         if (this.field6614 != var12) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field6577) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field6578 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && arg2 != var13)) {
                        class703 var15 = this.field6579[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.field6580[var12].method15966(var13, var14) + this.field6580[var12].method15966(var13 + 1, var14) + this.field6580[var12].method15966(var13, var14 + 1) + this.field6580[var12].method15966(var13 + 1, var14 + 1)) / 4 - (this.field6580[arg1].method15966(arg2, arg3) + this.field6580[arg1].method15966(arg2 + 1, arg3) + this.field6580[arg1].method15966(arg2, arg3 + 1) + this.field6580[arg1].method15966(arg2 + 1, arg3 + 1)) / 4;
                           class276 var17 = var15.field6481;
                           class276 var18 = var15.field6479;
                           if (var17 != null && var17.method2016()) {
                              arg0.method2008(this.field6571, var17, this.field6605 * (var13 - arg2) + this.field6569 * (1 - arg4), var16, this.field6605 * (var14 - arg3) + this.field6569 * (1 - arg5), var7);
                           }

                           if (var18 != null && var18.method2016()) {
                              arg0.method2008(this.field6571, var18, this.field6605 * (var13 - arg2) + this.field6569 * (1 - arg4), var16, this.field6605 * (var14 - arg3) + this.field6569 * (1 - arg5), var7);
                           }

                           for(class699 var19 = var15.field6484; var19 != null; var19 = var19.field6457) {
                              class290 var20 = var19.field6458;
                              if (var20 != null && var20.method2016() && (var20.field1875 == var13 || var8 == var13) && (var20.field1874 == var14 || var10 == var14)) {
                                 int var21 = var20.field1873 - var20.field1875 + 1;
                                 int var22 = var20.field1876 - var20.field1874 + 1;
                                 arg0.method2008(this.field6571, var20, this.field6605 * (var20.field1875 - arg2) + this.field6569 * (var21 - arg4), var16, this.field6605 * (var20.field1874 - arg3) + this.field6569 * (var22 - arg5), var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @deob.ObfuscatedName("ow.ae(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
   public void method10614(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, boolean arg17) {
      this.field6566.field6517 = true;
      this.field6574 = arg15;
      this.field6603 = arg1 >> this.field6567;
      this.field6604 = arg3 >> this.field6567;
      this.field6594 = arg1;
      this.field6606 = arg3;
      this.field6607 = arg2;
      this.field6612 = this.field6603 - this.field6599;
      if (this.field6612 < 0) {
         this.field6625 = -(this.field6612 * -1605033669) * 1120735219;
         this.field6612 = 0;
      } else {
         this.field6625 = 0;
      }

      this.field6610 = this.field6604 - this.field6599;
      if (this.field6610 < 0) {
         this.field6601 = -(this.field6610 * -739553393) * -1104220305;
         this.field6610 = 0;
      } else {
         this.field6601 = 0;
      }

      this.field6613 = this.field6603 + this.field6599;
      if (this.field6613 > this.field6577) {
         this.field6613 = this.field6577;
      }

      this.field6615 = this.field6604 + this.field6599;
      if (this.field6615 > this.field6578) {
         this.field6615 = this.field6578;
      }

      boolean[][] var19 = this.field6616;
      boolean[][] var20 = this.field6624;
      if (this.field6574) {
         for(int var21 = 0; var21 < this.field6599 + this.field6599 + 2; ++var21) {
            int var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < this.field6599 + this.field6599 + 2; ++var24) {
               if (var24 > 1) {
                  this.field6568[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = this.field6603 - this.field6599 + var21;
               int var26 = this.field6604 - this.field6599 + var24;
               if (var25 >= 0 && var26 >= 0 && var25 < this.field6577 && var26 < this.field6578) {
                  int var27 = var25 << this.field6567;
                  int var28 = var26 << this.field6567;
                  int var29 = this.field6582[this.field6582.length - 1].method15966(var25, var26) - (1000 << this.field6567 - 7);
                  int var30 = (this.field6584 != null ? this.field6584[0].method15966(var25, var26) + this.field6605 : this.field6582[0].method15966(var25, var26) + this.field6605) + (1000 << this.field6567 - 7);
                  var23 = this.field6571.method7523(var27, var29, var28, var27, var30, var28);
                  this.field6624[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  this.field6624[var21][var24] = false;
               }

               if (var21 > 0 && var24 > 0) {
                  int var31 = this.field6568[var24 - 1] & this.field6568[var24] & var22 & var23;
                  this.field6616[var21 - 1][var24 - 1] = var31 == 0;
               }
            }

            this.field6568[this.field6599 + this.field6599] = var22;
            this.field6568[this.field6599 + this.field6599 + 1] = var23;
         }

         if (!arg17) {
            this.field6566.field6517 = false;
         } else {
            this.field6566.field6535 = arg5;
            this.field6566.field6536 = arg6;
            this.field6566.field6537 = arg7;
            this.field6566.field6538 = arg8;
            this.field6566.field6539 = arg9;
            this.field6566.method10393(this.field6571, arg10);
         }
      } else {
         if (this.field6627 == null) {
            this.field6627 = new boolean[this.maxRenderRadius + this.maxRenderRadius + 2][this.maxRenderRadius + this.maxRenderRadius + 2];
         }

         for(int var32 = 0; var32 < this.field6627.length; ++var32) {
            for(int var33 = 0; var33 < this.field6627[0].length; ++var33) {
               this.field6627[var32][var33] = true;
            }
         }

         this.field6624 = this.field6627;
         this.field6616 = this.field6627;
         this.field6612 = 0;
         this.field6610 = 0;
         this.field6613 = this.field6577;
         this.field6615 = this.field6578;
         this.field6566.field6517 = false;
      }

      class764.method5203(this, this.field6571);
      if (!this.field6589.field6353) {
         Iterator var34 = this.field6589.field6351.iterator();

         while(var34.hasNext()) {
            class715 var35 = (class715)var34.next();
            var34.remove();
            Statics.method9134(var35);
         }
      }

      if (this.field6573) {
         for(int var36 = 0; var36 < this.field6619; ++var36) {
            this.field6621[var36].method10273(arg0, arg14);
         }
      }

      if (this.field6596 != null) {
         this.method10481(true);
         this.field6571.method7565(-1, new class402(1583160, 40, 127, 63, 0, 0, 0));
         this.method10521(true, arg4, arg10, arg11, arg16);
         this.field6571.method7564();
         this.method10481(false);
      }

      this.method10521(false, arg4, arg10, arg11, arg16);
      if (!this.field6574) {
         this.field6616 = var19;
         this.field6624 = var20;
      }

   }

   @deob.ObfuscatedName("ow.az(Z[[[BIBI)V")
   private void method10521(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4) {
      int var6 = arg0 ? 1 : 0;
      this.field6595 = 0;
      this.field6575 = 0;
      ++this.field6576;
      if ((arg4 & 2) == 0) {
         for(class134 var7 = this.field6597[var6]; var7 != null; var7 = var7.field1035) {
            this.method10522(var7);
            if (var7.field9959 != -1 && !this.method10503(var7, arg0, arg1, arg2, arg3)) {
               this.field6583[++this.field6595 - 1] = var7;
            }
         }
      }

      if ((arg4 & 1) == 0) {
         for(class134 var8 = this.field6609[var6]; var8 != null; var8 = var8.field1035) {
            this.method10522(var8);
            if (var8.field9959 != -1 && !this.method10503(var8, arg0, arg1, arg2, arg3)) {
               this.field6600[++this.field6575 - 1] = var8;
            }
         }

         for(class134 var9 = this.field6626[var6]; var9 != null; var9 = var9.field1035) {
            this.method10522(var9);
            if (var9.field9959 != -1 && !this.method10503(var9, arg0, arg1, arg2, arg3)) {
               if (var9.method82()) {
                  this.field6600[++this.field6575 - 1] = var9;
               } else {
                  this.field6583[++this.field6595 - 1] = var9;
               }
            }
         }

         if (!arg0) {
            for(int var10 = 0; var10 < this.field6591; ++var10) {
               this.method10522(this.field6602[var10]);
               if (this.field6602[var10].field9959 != -1 && !this.method10503(this.field6602[var10], arg0, arg1, arg2, arg3)) {
                  if (this.field6602[var10].method82()) {
                     this.field6600[++this.field6575 - 1] = this.field6602[var10];
                  } else {
                     this.field6583[++this.field6595 - 1] = this.field6602[var10];
                  }
               }
            }
         }
      }

      if (this.field6595 > 0) {
         this.method10585(this.field6583, 0, this.field6595 - 1);

         for(int var11 = 0; var11 < this.field6595; ++var11) {
            this.method10631(this.field6583[var11], this.field6617);
         }
      }

      if (this.field6573) {
         this.field6571.method7552(0, (class81[])null);
      }

      if ((arg4 & 2) == 0) {
         for(int var12 = 0; var12 < this.field6614; ++var12) {
            if (var12 >= arg2 && arg1 != null) {
               // Grid index field6625 is tile field6612, so the low-edge offset belongs in the end
               // bound too: tiles [field6612, field6577) map to [field6625, field6625 + w - field6612).
               int var13 = Math.min(this.field6599 + this.field6599 + 1, this.field6625 + this.field6577 - this.field6612);
               int var14 = Math.min(this.field6599 + this.field6599 + 1, this.field6601 + this.field6578 - this.field6610);

               boolean[][] var15 = this.field6624;
               if (this.field6574) {
                  for(int var16 = this.field6625; var16 < var13; ++var16) {
                     int var17 = this.field6612 + var16 - this.field6625;

                     for(int var18 = this.field6601; var18 < var14; ++var18) {
                        var15[var16][var18] = false;
                        if (this.field6616[var16][var18]) {
                           int var19 = this.field6610 + var18 - this.field6601;

                           for(int var20 = var12; var20 >= 0; --var20) {
                              if (this.field6579[var20][var17][var19] != null && this.field6579[var20][var17][var19].field6477 == var12) {
                                 if ((var20 < arg2 || arg1[var20][var17][var19] != arg3) && !this.field6566.method10411(var12, var17, var19)) {
                                    var15[var16][var18] = true;
                                    break;
                                 }

                                 var15[var16][var18] = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               this.field6580[var12].method7262(this.field6603, this.field6604, this.field6599, this.field6624, false, arg4);
            } else {
               int var21 = Math.min(this.field6599 + this.field6599 + 1, this.field6625 + this.field6577 - this.field6612);
               int var22 = Math.min(this.field6599 + this.field6599 + 1, this.field6601 + this.field6578 - this.field6610);

               boolean[][] var23 = this.field6624;
               if (this.field6574) {
                  for(int var24 = this.field6625; var24 < var21; ++var24) {
                     int var25 = this.field6612 + var24 - this.field6625;

                     for(int var26 = this.field6601; var26 < var22; ++var26) {
                        if (this.field6616[var24][var26] && !this.field6566.method10411(var12, var25, this.field6610 + var26 - this.field6601)) {
                           var23[var24][var26] = true;
                        } else {
                           var23[var24][var26] = false;
                        }
                     }
                  }
               }

               this.field6580[var12].method7262(this.field6603, this.field6604, this.field6599, this.field6624, true, arg4);
            }
         }
      }

      if (this.field6575 > 0) {
         this.method10495(this.field6600, 0, this.field6575 - 1);

         for(int var27 = 0; var27 < this.field6575; ++var27) {
            this.method10631(this.field6600[var27], this.field6617);
         }
      }

   }

   @deob.ObfuscatedName("ow.aq(Laex;I)V")
   private void method10522(class134 arg0) {
      class584 var2 = arg0.method11602().field5446;
      this.field6571.method7736((float)((int)var2.field5328), (float)((int)var2.field5330 + (arg0.method80() >> 1)), (float)((int)var2.field5331), this.field6608);
      arg0.field9959 = (int)this.field6608[2];
   }

   @deob.ObfuscatedName("ow.ar([Laex;II)V")
   private void method10495(class134[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var4 = (arg1 + arg2) / 2;
         int var5 = arg1;
         class134 var6 = arg0[var4];
         arg0[var4] = arg0[arg2];
         arg0[arg2] = var6;
         int var7 = var6.field9959;

         for(int var8 = arg1; var8 < arg2; ++var8) {
            if (arg0[var8].field9959 > (var8 & 1) + var7) {
               class134 var9 = arg0[var8];
               arg0[var8] = arg0[var5];
               arg0[var5++] = var9;
            }
         }

         arg0[arg2] = arg0[var5];
         arg0[var5] = var6;
         this.method10495(arg0, arg1, var5 - 1);
         this.method10495(arg0, var5 + 1, arg2);
      }

   }

   @deob.ObfuscatedName("ow.as([Laex;II)V")
   private void method10585(class134[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var4 = (arg1 + arg2) / 2;
         int var5 = arg1;
         class134 var6 = arg0[var4];
         arg0[var4] = arg0[arg2];
         arg0[arg2] = var6;
         int var7 = var6.field9959;

         for(int var8 = arg1; var8 < arg2; ++var8) {
            if (arg0[var8].field9959 < (var8 & 1) + var7) {
               class134 var9 = arg0[var8];
               arg0[var8] = arg0[var5];
               arg0[var5++] = var9;
            }
         }

         arg0[arg2] = arg0[var5];
         arg0[var5] = var6;
         this.method10585(arg0, arg1, var5 - 1);
         this.method10585(arg0, var5 + 1, arg2);
      }

   }

   @deob.ObfuscatedName("ow.au(Laex;Z[[[BIB)Z")
   private boolean method10503(class134 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
      if (!this.field6574) {
         return false;
      } else if (arg0 instanceof class290) {
         short var6 = ((class290)arg0).field1873;
         short var7 = ((class290)arg0).field1876;
         short var8 = ((class290)arg0).field1875;
         short var9 = ((class290)arg0).field1874;

         for(int var10 = var8; var10 <= var6; ++var10) {
            for(int var11 = var9; var11 <= var7; ++var11) {
               if (arg0.field1034 < this.field6614 && var10 >= this.field6612 && var10 < this.field6613 && var11 >= this.field6610 && var11 < this.field6615) {
                  if ((arg2 == null || arg0.field1032 < arg3 || arg2[arg0.field1032][var10][var11] != arg4) && arg0.method2014() && !arg0.method2015(this.field6571)) {
                     return false;
                  }

                  if (!arg1 && var10 >= this.field6603 - 16 && var10 <= this.field6603 + 16 && var11 >= this.field6604 - 16 && var11 <= this.field6604 + 16) {
                     arg0.method2044(this.field6571);
                  }

                  return true;
               }
            }
         }

         return true;
      } else {
         class584 var12 = arg0.method11602().field5446;
         int var13 = (int)var12.field5328 >> this.field6567;
         int var14 = (int)var12.field5331 >> this.field6567;
         if (arg0.field1034 < this.field6614 && var13 >= this.field6612 && var13 < this.field6613 && var14 >= this.field6610 && var14 < this.field6615) {
            if ((arg2 == null || arg0.field1032 < arg3 || arg2[arg0.field1032][var13][var14] != arg4) && arg0.method2014() && !arg0.method2015(this.field6571)) {
               return false;
            } else {
               if (!arg1 && var13 >= this.field6603 - 16 && var13 <= this.field6603 + 16 && var14 >= this.field6604 - 16 && var14 <= this.field6604 + 16) {
                  arg0.method2044(this.field6571);
               }

               return true;
            }
         } else {
            return true;
         }
      }
   }

   @deob.ObfuscatedName("ow.ad(Laex;[Lacy;)V")
   private void method10631(class134 arg0, class81[] arg1) {
      if (this.field6573) {
         int var3 = arg0.method2012(arg1);
         this.field6571.method7552(var3, arg1);
      }

      if (this.field6584 == this.field6580) {
         boolean var4 = false;
         boolean var5 = false;
         class584 var6 = arg0.method11602().field5446;
         int var7;
         int var8;
         if (arg0 instanceof class290) {
            var7 = ((class290)arg0).field1875;
            var8 = ((class290)arg0).field1874;
         } else {
            var7 = (int)var6.field5328 >> this.field6567;
            var8 = (int)var6.field5331 >> this.field6567;
         }

         class402 var9 = new class402();
         var9.field2965 = this.method10488(var7, var8);
         var9.field2964 = this.method10523(var7, var8);
         var9.field2962 = this.method10496(var7, var8);
         var9.field2961 = this.method10490(var7, var8);
         var9.field2960 = this.method10546(var7, var8);
         var9.field2966 = this.method10492(var7, var8);
         this.field6571.method7562(this.field6582[0].method15965((int)var6.field5328, (int)var6.field5331), var9);
      }

      class715 var10 = arg0.method2009(this.field6571);
      if (var10 != null) {
         if (var10.field6633) {
            var10.field6632 = arg0;
            this.field6589.method10135(var10);
         } else {
            Statics.method9134(var10);
         }
      }

   }

   @deob.ObfuscatedName("ow.am(Lna;III[ZS)Z")
   public boolean method10527(class664 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      boolean var6 = false;
      if (this.field6584 != this.field6580) {
         int var7 = this.field6582[arg1].method15965(arg2, arg3);

         for(int var8 = 0; var8 <= arg1; ++var8) {
            class934 var9 = this.field6582[var8];
            if (var9 != null) {
               int var10 = var7 - var9.method15965(arg2, arg3);
               if (arg4 != null) {
                  arg4[var8] = var9.method7278(arg0, arg2, var10, arg3, 0, false);
                  if (!arg4[var8]) {
                     continue;
                  }
               }

               var9.method7251(arg0, arg2, var10, arg3, 0, false);
               var6 = true;
            }
         }
      }

      return var6;
   }

   @deob.ObfuscatedName("ow.aj(Lna;III[ZI)V")
   public void method10528(class664 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (this.field6584 != this.field6580) {
         int var6 = this.field6582[arg1].method15965(arg2, arg3);

         for(int var7 = 0; var7 <= arg1; ++var7) {
            if (arg4 == null || arg4[var7]) {
               class934 var8 = this.field6582[var7];
               if (var8 != null) {
                  var8.method7255(arg0, arg2, var6 - var8.method15965(arg2, arg3), arg3, 0, false);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ow.ac(III)V")
   private void method10529(int arg0, int arg1) {
      class664 var3 = null;

      for(int var4 = arg0; var4 < arg1; ++var4) {
         class934 var5 = this.field6582[var4];
         if (var5 != null) {
            for(int var6 = 0; var6 < this.field6578; ++var6) {
               for(int var7 = 0; var7 < this.field6577; ++var7) {
                  var3 = var5.method7253(var7, var6, var3);
                  if (var3 != null) {
                     int var8 = var7 << this.field6567;
                     int var9 = var6 << this.field6567;

                     for(int var10 = var4 - 1; var10 >= 0; --var10) {
                        class934 var11 = this.field6582[var10];
                        if (var11 != null) {
                           int var12 = var5.method15966(var7, var6) - var11.method15966(var7, var6);
                           int var13 = var5.method15966(var7 + 1, var6) - var11.method15966(var7 + 1, var6);
                           int var14 = var5.method15966(var7 + 1, var6 + 1) - var11.method15966(var7 + 1, var6 + 1);
                           int var15 = var5.method15966(var7, var6 + 1) - var11.method15966(var7, var6 + 1);
                           var11.method7251(var3, var8, (var12 + var13 + var14 + var15) / 4, var9, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ow.ay(I)V")
   public void method10615() {
      this.method10529(1, this.field6614);
   }

   @deob.ObfuscatedName("ow.bf(Loh;B)V")
   public void method10531(class698 arg0) {
      if (this.field6619 < 65008) {
         class81 var2 = arg0.field6435;
         this.field6621[this.field6619] = arg0;
         this.field6593[this.field6619] = false;
         ++this.field6619;
         int var3 = arg0.field6448;
         if (arg0.field6453) {
            var3 = 0;
         }

         int var4 = arg0.field6448;
         if (arg0.field6446) {
            var4 = this.field6614 - 1;
         }

         for(int var5 = var3; var5 <= var4; ++var5) {
            int var6 = 0;
            int var7 = var2.method1111() - var2.method1112() + this.field6569 >> this.field6567;
            if (var7 < 0) {
               var6 -= var7;
               var7 = 0;
            }

            int var8 = var2.method1111() + var2.method1112() - this.field6569 >> this.field6567;
            if (var8 >= this.field6578) {
               var8 = this.field6578 - 1;
            }

            for(int var9 = var7; var9 <= var8; ++var9) {
               short var10 = arg0.field6444[var6++];
               int var11 = (var2.method1123() - var2.method1112() + this.field6569 >> this.field6567) + (var10 >>> 8);
               int var12 = (var10 & 255) + var11 - 1;
               if (var11 < 0) {
                  var11 = 0;
               }

               if (var12 >= this.field6577) {
                  var12 = this.field6577 - 1;
               }

               for(int var13 = var11; var13 <= var12; ++var13) {
                  long var14 = this.field6620[var5][var13][var9];
                  if ((var14 & 65535L) == 0L) {
                     this.field6620[var5][var13][var9] = var14 | (long)this.field6619;
                  } else if ((var14 & 4294901760L) == 0L) {
                     this.field6620[var5][var13][var9] = var14 | (long)this.field6619 << 16;
                  } else if ((var14 & 281470681743360L) == 0L) {
                     this.field6620[var5][var13][var9] = var14 | (long)this.field6619 << 32;
                  } else if ((var14 & -281474976710656L) == 0L) {
                     this.field6620[var5][var13][var9] = var14 | (long)this.field6619 << 48;
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("ow.bp(S)V")
   public void method10532() {
      for(int var1 = 0; var1 < this.field6619; ++var1) {
         if (!this.field6593[var1]) {
            class698 var2 = this.field6621[var1];
            class81 var3 = var2.field6435;
            int var4 = var2.field6448;
            int var5 = var3.method1112() - this.field6569;
            int var6 = (var5 * 2 >> this.field6567) + 1;
            int var7 = 0;
            int[] var8 = new int[var6 * var6];
            int var9 = var3.method1123() - var5 >> this.field6567;
            int var10 = var3.method1111() - var5 >> this.field6567;
            int var11 = var3.method1111() + var5 >> this.field6567;
            if (var10 < 0) {
               var7 -= var10;
               var10 = 0;
            }

            if (var11 >= this.field6578) {
               var11 = this.field6578 - 1;
            }

            for(int var12 = var10; var12 <= var11; ++var12) {
               short var13 = var2.field6444[var7];
               int var14 = var13 >>> 8;
               int var15 = var6 * var7 + var14;
               int var16 = (var13 >>> 8) + var9;
               int var17 = (var13 & 255) + var16 - 1;
               if (var16 < 0) {
                  var15 -= var16;
                  var16 = 0;
               }

               if (var17 >= this.field6577) {
                  var17 = this.field6577 - 1;
               }

               for(int var18 = var16; var18 <= var17; ++var18) {
                  byte var19 = 1;
                  class290 var20 = this.method10514(var4, var18, var12, (class716)null);
                  if (var20 != null && var20.field1877 != 0) {
                     if (var20.field1877 == 1) {
                        boolean var21 = var18 - 1 >= var16;
                        boolean var22 = var18 + 1 <= var17;
                        if (!var21 && var12 + 1 <= var11) {
                           short var23 = var2.field6444[var7 + 1];
                           int var24 = (var23 >>> 8) + var9;
                           int var25 = (var23 & 255) + var24;
                           var21 = var18 > var24 && var18 < var25;
                        }

                        if (!var22 && var12 - 1 >= var10) {
                           short var26 = var2.field6444[var7 - 1];
                           int var27 = (var26 >>> 8) + var9;
                           int var28 = (var26 & 255) + var27;
                           var22 = var18 > var27 && var18 < var28;
                        }

                        if (var21 && !var22) {
                           var19 = 4;
                        } else if (var22 && !var21) {
                           var19 = 2;
                        }
                     } else {
                        boolean var29 = var18 - 1 >= var16;
                        boolean var30 = var18 + 1 <= var17;
                        if (!var29 && var12 - 1 >= var10) {
                           short var31 = var2.field6444[var7 - 1];
                           int var32 = (var31 >>> 8) + var9;
                           int var33 = (var31 & 255) + var32;
                           var29 = var18 > var32 && var18 < var33;
                        }

                        if (!var30 && var12 + 1 <= var11) {
                           short var34 = var2.field6444[var7 + 1];
                           int var35 = (var34 >>> 8) + var9;
                           int var36 = (var34 & 255) + var35;
                           var30 = var18 > var35 && var18 < var36;
                        }

                        if (var29 && !var30) {
                           var19 = 3;
                        } else if (var30 && !var29) {
                           var19 = 5;
                        }
                     }
                  }

                  var8[var15++] = var19;
               }

               ++var7;
            }

            this.field6593[var1] = true;
            if (field6570) {
               this.field6580[var4].method7257(var3, var8);
            }
         }
      }

   }
}
