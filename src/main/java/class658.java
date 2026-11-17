import java.util.Iterator;

@deob.ObfuscatedName("mv")
public class class658 {
   @deob.ObfuscatedName("mv.o")
   private class723 field6026 = new class723();
   @deob.ObfuscatedName("mv.a")
   private class723 field6020 = new class723();
   @deob.ObfuscatedName("mv.t")
   private class642 field6021 = new class642(0, 0, 0, 0);
   @deob.ObfuscatedName("mv.q")
   private class648[] field6028 = new class648[4];
   @deob.ObfuscatedName("mv.ap")
   private int field6038 = 0;
   @deob.ObfuscatedName("mv.av")
   private int field6017 = 1;
   @deob.ObfuscatedName("mv.ax")
   private int field6029 = 0;
   @deob.ObfuscatedName("mv.af")
   private int field6030 = 1;
   @deob.ObfuscatedName("mv.ar")
   public boolean field6011 = false;
   @deob.ObfuscatedName("mv.n")
   private boolean field6007;
   @deob.ObfuscatedName("mv.c")
   private float field6006;
   @deob.ObfuscatedName("mv.z")
   private int field6000;
   @deob.ObfuscatedName("mv.s")
   private int field6003;
   @deob.ObfuscatedName("mv.e")
   private int field6009;
   @deob.ObfuscatedName("mv.l")
   private int field6010;
   @deob.ObfuscatedName("mv.x")
   private int field6015;
   @deob.ObfuscatedName("mv.u")
   private int field6022;
   @deob.ObfuscatedName("mv.as")
   public long field6045;
   @deob.ObfuscatedName("mv.m")
   private class252 field6008;
   @deob.ObfuscatedName("mv.b")
   private class441 field6027;
   @deob.ObfuscatedName("mv.r")
   private class54 field6004;
   @deob.ObfuscatedName("mv.p")
   private class54 field6005;
   @deob.ObfuscatedName("mv.h")
   private class611 field6014;
   @deob.ObfuscatedName("mv.ai")
   private class621 field6044;
   @deob.ObfuscatedName("mv.k")
   private class657 field6001;
   @deob.ObfuscatedName("mv.d")
   private class657 field6002;
   @deob.ObfuscatedName("mv.i")
   private class701 field6018;
   @deob.ObfuscatedName("mv.v")
   private class713 field6012;
   @deob.ObfuscatedName("mv.g")
   private class751 field6013;
   @deob.ObfuscatedName("mv.w")
   private class831 field6016;
   @deob.ObfuscatedName("mv.at")
   private int[] field6031;
   @deob.ObfuscatedName("mv.ah")
   private int[] field6032;
   @deob.ObfuscatedName("mv.aw")
   private int[] field6033;
   @deob.ObfuscatedName("mv.al")
   private int[] field6034;
   @deob.ObfuscatedName("mv.an")
   private int[] field6035;
   @deob.ObfuscatedName("mv.ag")
   private int[] field6036;
   @deob.ObfuscatedName("mv.aa")
   private byte[][] field6019;
   @deob.ObfuscatedName("mv.ao")
   private byte[][] field6039;
   @deob.ObfuscatedName("mv.ab")
   private byte[][] field6040;
   @deob.ObfuscatedName("mv.ae")
   private byte[][] field6041;
   @deob.ObfuscatedName("mv.az")
   private byte[][] field6042;
   @deob.ObfuscatedName("mv.y")
   private int[][] field6023;
   @deob.ObfuscatedName("mv.j")
   private int[][] field6024;
   @deob.ObfuscatedName("mv.ak")
   private int[][] field6037;
   @deob.ObfuscatedName("mv.f")
   private byte[][][] field6025;
   @deob.ObfuscatedName("mv.aq")
   private int[][][] field6043;

   public class658(boolean arg0) {
      this.field6007 = arg0;
   }

   @deob.ObfuscatedName("mv.n(I)Lmu;")
   public class657 method9626() {
      return this.field6001;
   }

   @deob.ObfuscatedName("mv.k(B)Lll;")
   public class621 method9508() {
      return this.field6044;
   }

   @deob.ObfuscatedName("mv.d(I)I")
   public int method9513() {
      return 100 - this.field6038 * 100 / this.field6017;
   }

   @deob.ObfuscatedName("mv.b(I)I")
   public int method9510() {
      return 100 - this.field6029 * 100 / this.field6030;
   }

   @deob.ObfuscatedName("mv.r(I)Lpf;")
   public class723 method9649() {
      return this.field6026;
   }

   @deob.ObfuscatedName("mv.p(I)I")
   public int method9648() {
      return this.field6010;
   }

   @deob.ObfuscatedName("mv.o(B)I")
   public int method9604() {
      return this.field6022;
   }

   @deob.ObfuscatedName("mv.a(S)Lok;")
   public class701 method9617() {
      return this.field6018;
   }

   @deob.ObfuscatedName("mv.x(I)Lmf;")
   public class642 method9514() {
      return this.field6021;
   }

   @deob.ObfuscatedName("mv.s(I)F")
   public float method9609() {
      return this.field6006;
   }

   @deob.ObfuscatedName("mv.l(I)I")
   public int method9516() {
      return this.field6009;
   }

   @deob.ObfuscatedName("mv.u(I)I")
   public int method9517() {
      return this.field6000;
   }

   @deob.ObfuscatedName("mv.v(B)Low;")
   public class713 method9639() {
      return this.field6012;
   }

   @deob.ObfuscatedName("mv.g(II)[[B")
   public byte[][] method9519(int arg0) {
      return this.field6005 != null && this.field6005.field5627 != null && this.field6005.field5627[arg0] != null ? this.field6005.field5627[arg0] : (byte[][])null;
   }

   @deob.ObfuscatedName("mv.h(B)Llb;")
   public class611 method9592() {
      return this.field6014;
   }

   @deob.ObfuscatedName("mv.e(II)Lml;")
   public class648 method9521(int arg0) {
      return this.field6028[arg0];
   }

   @deob.ObfuscatedName("mv.z(I)Lqg;")
   public class751 method9512() {
      return this.field6013;
   }

   @deob.ObfuscatedName("mv.m(I)Ltf;")
   public class831 method9636() {
      return this.field6016;
   }

   @deob.ObfuscatedName("mv.i(I)[[I")
   public int[][] method9518() {
      return this.field6023;
   }

   @deob.ObfuscatedName("mv.t(I)[[I")
   public int[][] method9525() {
      return this.field6024;
   }

   @deob.ObfuscatedName("mv.c(I)[[[B")
   public byte[][][] method9526() {
      return this.field6025;
   }

   @deob.ObfuscatedName("mv.w([[[BI)V")
   public void method9578(byte[][][] arg0) {
      this.field6025 = arg0;
   }

   @deob.ObfuscatedName("mv.q(I)Laby;")
   public class54 method9528() {
      return this.field6005;
   }

   @deob.ObfuscatedName("mv.y(Ltf;I)V")
   public void method9529(class831 arg0) {
      this.field6016 = arg0;
   }

   @deob.ObfuscatedName("mv.j(I)V")
   public void method9563() {
      this.field6026 = new class723();
      this.field6003 = 0;
      this.field6015 = 0;
   }

   @deob.ObfuscatedName("mv.f(I)V")
   public void method9613() {
      if (this.field6012 != null) {
         Statics.method8262();
         this.field6012.field6589.method10136();
         this.field6012 = null;
      }

   }

   @deob.ObfuscatedName("mv.ai(I)V")
   public void method9532() {
      this.field6044 = class621.field5597;
      this.field6038 = 0;
      this.field6017 = 1;
      this.field6029 = 0;
      this.field6030 = 1;
   }

   @deob.ObfuscatedName("mv.ap(I)V")
   public void method9533() {
      this.field6013 = new class751(Statics.field8847, this.field6010 >> 3, this.field6022 >> 3);
   }

   @deob.ObfuscatedName("mv.av(I)V")
   public void method9534() {
      this.field6009 = 200;
      this.field6000 = (int)((double)this.field6010 * 34.46D);
      this.field6000 <<= 2;
      if (Statics.field8847.method7497()) {
         this.field6000 += 512;
      }

   }

   @deob.ObfuscatedName("mv.ax(Lmv;B)V")
   private void method9535(class658 arg0) {
      boolean var2 = arg0.field6007;
      arg0.field6007 = this.field6007;
      this.field6007 = var2;
      class657 var3 = arg0.field6002;
      arg0.field6002 = this.field6002;
      this.field6002 = var3;
      arg0.field6020 = this.field6026;
      this.field6020 = arg0.field6026;
      this.field6013.method11145(arg0.method9512());
   }

   @deob.ObfuscatedName("mv.af(I)V")
   public void method9531() {
      if (this.field6007) {
         this.method9532();
         Statics.method15823(true);
         class658 var1 = client.field2468;
         this.field6031 = var1.field6031;
         this.field6032 = var1.field6032;
         this.field6033 = var1.field6033;
         this.field6034 = var1.field6034;
         this.field6035 = var1.field6035;
         this.field6036 = var1.field6036;
         this.field6037 = var1.field6037;
         this.field6019 = var1.field6019;
         this.field6039 = var1.field6039;
         this.field6040 = var1.field6040;
         this.field6041 = var1.field6041;
         this.field6042 = var1.field6042;
         this.field6028 = var1.field6028;
         this.field6014 = var1.field6014;
         this.field6013 = var1.field6013;
         this.field6043 = var1.field6043;
         this.field6009 = var1.field6009;
         this.field6000 = var1.field6000;
         this.field6008 = var1.field6008;
         this.field6018 = var1.field6018;
         this.field6023 = var1.field6023;
         this.field6024 = var1.field6024;
         this.field6025 = var1.field6025;
         this.field6001 = var1.field6001;
         this.field6027 = var1.field6027;
         this.field6026 = var1.field6026;
         this.field6020 = var1.field6020;
         this.field6015 = var1.field6015;
         this.field6003 = var1.field6003;
         this.field6010 = var1.field6010;
         this.field6022 = var1.field6022;
      } else if (client.field2410 == 6) {
         client.method14844(5);
      } else if (client.field2410 == 15) {
         client.method14844(19);
      } else if (client.field2410 == 11) {
         client.method14844(7);
      } else if (client.field2410 == 1) {
         client.method14844(16);
      } else if (client.field2410 == 14) {
         client.method14844(17);
      }

   }

   @deob.ObfuscatedName("mv.at(Lmn;I)V")
   public void method9537(class650 arg0) {
      this.field6001 = arg0.field5935;
      if (class657.field5997 == this.field6001) {
         this.method9635();
      } else if (class657.field5990 == this.field6001) {
         this.method9539(arg0.field5934);
      } else if (class657.field5993 == this.field6001) {
         this.method9541();
      } else if (this.field6001.method9494()) {
         this.method9540(arg0.field5934);
      }

   }

   @deob.ObfuscatedName("mv.ah(I)V")
   private void method9635() {
      this.method9543(class441.method14204(Statics.field9361.field961.method2096()));
      int var1 = this.field6026.field6676;
      int var2 = this.field6026.field6677;
      int var3 = (Statics.field337 >> 12) + (var1 >> 3);
      int var4 = (Statics.field3115 >> 12) + (var2 >> 3);
      Statics.field5701.field1032 = 0;
      Statics.field1977 = 0;
      Statics.field5701.method2865(8, 8);
      byte var5 = 18;
      this.field6037 = new int[var5][4];
      this.field6031 = new int[var5];
      this.field6032 = new int[var5];
      this.field6033 = new int[var5];
      this.field6034 = new int[var5];
      this.field6019 = new byte[var5][];
      this.field6039 = new byte[var5][];
      this.field6040 = new byte[var5][];
      this.field6035 = new int[var5];
      this.field6036 = new int[var5];
      this.field6041 = new byte[var5][];
      this.field6042 = new byte[var5][];
      int var6 = 0;

      for(int var7 = (var3 - (this.field6010 >> 4)) / 8; var7 <= ((this.field6010 >> 4) + var3) / 8; ++var7) {
         for(int var8 = (var4 - (this.field6022 >> 4)) / 8; var8 <= ((this.field6022 >> 4) + var4) / 8; ++var8) {
            int var9 = (var7 << 8) + var8;
            this.field6031[var6] = var9;
            this.field6032[var6] = Statics.field1805.method8786(this.method9566(true, false, var7, var8));
            this.field6033[var6] = Statics.field1805.method8786(this.method9566(false, false, var7, var8));
            this.field6034[var6] = Statics.field1805.method8786("n" + var7 + '_' + var8);
            this.field6035[var6] = Statics.field1805.method8786(this.method9566(true, true, var7, var8));
            this.field6036[var6] = Statics.field1805.method8786(this.method9566(false, true, var7, var8));
            if (this.field6034[var6] == -1) {
               this.field6032[var6] = -1;
               this.field6033[var6] = -1;
               this.field6035[var6] = -1;
               this.field6036[var6] = -1;
            }

            ++var6;
         }
      }

      for(int var10 = var6; var10 < this.field6034.length; ++var10) {
         this.field6034[var10] = -1;
         this.field6032[var10] = -1;
         this.field6033[var10] = -1;
         this.field6035[var10] = -1;
         this.field6036[var10] = -1;
      }

      byte var11;
      if (client.field2410 == 6) {
         var11 = 5;
      } else if (client.field2410 == 11) {
         var11 = 7;
      } else if (client.field2410 == 15) {
         var11 = 19;
      } else {
         if (client.field2410 != 14) {
            throw new RuntimeException("" + client.field2410);
         }

         var11 = 17;
      }

      this.method9545(var3, var4, var11, false);
   }

   @deob.ObfuscatedName("mv.aw(Lajf;B)V")
   private void method9539(class251 arg0) {
      int var2 = arg0.method1619();
      int var3 = arg0.method1587();
      int var4 = arg0.method1587();
      boolean var5 = arg0.method1688() == 1;
      if (!this.field6007) {
         this.method9542();
      }

      this.method9543(class441.method14204(var2));
      int var6 = (arg0.field931.length - arg0.field935) / 16;
      this.field6037 = new int[var6][4];

      for(int var7 = 0; var7 < var6; ++var7) {
         for(int var8 = 0; var8 < 4; ++var8) {
            this.field6037[var7][var8] = arg0.method1591();
         }
      }

      this.field6031 = new int[var6];
      this.field6032 = new int[var6];
      this.field6033 = new int[var6];
      this.field6034 = null;
      this.field6019 = new byte[var6][];
      this.field6039 = new byte[var6][];
      this.field6040 = (byte[][])null;
      this.field6035 = new int[var6];
      this.field6036 = new int[var6];
      this.field6041 = new byte[var6][];
      this.field6042 = new byte[var6][];
      int var9 = 0;

      for(int var10 = (var4 - (this.field6010 >> 4)) / 8; var10 <= ((this.field6010 >> 4) + var4) / 8; ++var10) {
         for(int var11 = (var3 - (this.field6022 >> 4)) / 8; var11 <= ((this.field6022 >> 4) + var3) / 8; ++var11) {
            this.field6031[var9] = (var10 << 8) + var11;
            this.field6032[var9] = Statics.field1805.method8786(this.method9566(true, false, var10, var11));
            this.field6033[var9] = Statics.field1805.method8786(this.method9566(false, false, var10, var11));
            this.field6035[var9] = Statics.field1805.method8786(this.method9566(true, true, var10, var11));
            this.field6036[var9] = Statics.field1805.method8786(this.method9566(false, true, var10, var11));
            ++var9;
         }
      }

      this.method9545(var4, var3, 16, var5);
   }

   @deob.ObfuscatedName("mv.al(Lajf;I)V")
   private void method9540(class251 arg0) {
      int var2 = arg0.method1628();
      int var3 = arg0.method1579();
      boolean var4 = (var3 & 1) != 0;
      int var5 = arg0.method1629();
      int var6 = arg0.method1778();
      int var7 = arg0.method1688();
      if (var7 == 1) {
         this.field6001 = class657.field5991;
      } else if (var7 == 2) {
         this.field6001 = class657.field5995;
      } else if (var7 == 3) {
         this.field6001 = class657.field5988;
      } else if (var7 == 4) {
         this.field6001 = class657.field5994;
      }

      if (!this.field6007) {
         this.method9542();
      }

      this.method9543(class441.method14204(var6));
      arg0.method3389();

      for(int var8 = 0; var8 < 4; ++var8) {
         for(int var9 = 0; var9 < this.field6010 >> 3; ++var9) {
            for(int var10 = 0; var10 < this.field6022 >> 3; ++var10) {
               int var11 = arg0.method3394(1);
               if (var11 == 1) {
                  this.field6043[var8][var9][var10] = arg0.method3394(26);
               } else {
                  this.field6043[var8][var9][var10] = -1;
               }
            }
         }
      }

      arg0.method3391();
      int var12 = (arg0.field931.length - arg0.field935) / 16;
      this.field6037 = new int[var12][4];

      for(int var13 = 0; var13 < var12; ++var13) {
         for(int var14 = 0; var14 < 4; ++var14) {
            this.field6037[var13][var14] = arg0.method1591();
         }
      }

      this.field6031 = new int[var12];
      this.field6032 = new int[var12];
      this.field6033 = new int[var12];
      this.field6034 = null;
      this.field6019 = new byte[var12][];
      this.field6039 = new byte[var12][];
      this.field6040 = (byte[][])null;
      this.field6035 = new int[var12];
      this.field6036 = new int[var12];
      this.field6041 = new byte[var12][];
      this.field6042 = new byte[var12][];
      int var15 = 0;

      for(int var16 = 0; var16 < 4; ++var16) {
         for(int var17 = 0; var17 < this.field6010 >> 3; ++var17) {
            for(int var18 = 0; var18 < this.field6022 >> 3; ++var18) {
               int var19 = this.field6043[var16][var17][var18];
               if (var19 != -1) {
                  int var20 = var19 >> 14 & 1023;
                  int var21 = var19 >> 3 & 2047;
                  int var22 = (var20 / 8 << 8) + var21 / 8;

                  for(int var23 = 0; var23 < var15; ++var23) {
                     if (this.field6031[var23] == var22) {
                        var22 = -1;
                        break;
                     }
                  }

                  if (var22 != -1) {
                     this.field6031[var15] = var22;
                     int var24 = var22 >> 8 & 255;
                     int var25 = var22 & 255;
                     this.field6032[var15] = Statics.field1805.method8786(this.method9566(true, false, var24, var25));
                     this.field6033[var15] = Statics.field1805.method8786(this.method9566(false, false, var24, var25));
                     this.field6035[var15] = Statics.field1805.method8786(this.method9566(true, true, var24, var25));
                     this.field6036[var15] = Statics.field1805.method8786(this.method9566(false, true, var24, var25));
                     ++var15;
                  }
               }
            }
         }
      }

      this.method9545(var2, var5, 16, var4);
   }

   @deob.ObfuscatedName("mv.an(I)V")
   private void method9541() {
      this.field6002 = this.field6001;
      this.method9543(class441.field3655);

      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.field6010 >> 3; ++var2) {
            for(int var3 = 0; var3 < this.field6022 >> 3; ++var3) {
               this.field6043[var1][var2][var3] = -1;
            }
         }
      }

      for(class73 var4 = (class73)class397.field2947.method14964(); var4 != null; var4 = (class73)class397.field2947.method15006()) {
         int var5 = var4.field528;
         boolean var6 = (var5 & 1) == 1;
         int var7 = var4.field527 >> 3;
         int var8 = var4.field529 >> 3;
         int var9 = var4.field531;
         int var10 = var4.field532;
         int var11 = var4.field533;
         int var12 = var4.field530;
         int var13 = var4.field535;
         int var14 = var4.field534;
         int var15 = 0;
         int var16 = 0;
         byte var17 = 1;
         byte var18 = 1;
         if (var5 == 1) {
            var16 = var13 - 1;
            var17 = -1;
         } else if (var5 == 2) {
            var16 = var13 - 1;
            var15 = var14 - 1;
            var17 = -1;
            var18 = -1;
         } else if (var5 == 3) {
            var15 = var14 - 1;
            var17 = 1;
            var18 = -1;
         }

         int var19 = var8;

         while(var19 < var8 + var14) {
            int var20 = var16;
            int var21 = var7;

            while(var21 < var7 + var13) {
               if (var6) {
                  this.field6043[var12][var9 + var15][var10 + var20] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
               } else {
                  this.field6043[var12][var9 + var20][var10 + var15] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
               }

               ++var21;
               var20 += var17;
            }

            ++var19;
            var15 += var18;
         }
      }

      int var22 = Statics.field2786.length;
      this.field6031 = new int[var22];
      this.field6032 = new int[var22];
      this.field6033 = new int[var22];
      this.field6034 = null;
      this.field6019 = new byte[var22][];
      this.field6039 = new byte[var22][];
      this.field6040 = (byte[][])null;
      this.field6035 = new int[var22];
      this.field6036 = new int[var22];
      this.field6041 = new byte[var22][];
      this.field6042 = new byte[var22][];
      int var23 = 0;

      for(class73 var24 = (class73)class397.field2947.method14964(); var24 != null; var24 = (class73)class397.field2947.method15006()) {
         int var25 = var24.field527 >>> 3;
         int var26 = var24.field529 >>> 3;
         int var27 = var24.field535 + var25;
         if ((var27 & 7) == 0) {
            --var27;
         }

         int var28 = var27 >>> 3;
         int var29 = var24.field534 + var26;
         if ((var29 & 7) == 0) {
            --var29;
         }

         int var30 = var29 >>> 3;

         for(int var31 = var25 >>> 3; var31 <= var28; ++var31) {
            label82:
            for(int var32 = var26 >>> 3; var32 <= var30; ++var32) {
               int var33 = var31 << 8 | var32;

               for(int var34 = 0; var34 < var23; ++var34) {
                  if (this.field6031[var34] == var33) {
                     continue label82;
                  }
               }

               this.field6031[var23] = var33;
               this.field6032[var23] = Statics.field1805.method8786(this.method9566(true, false, var31, var32));
               this.field6033[var23] = Statics.field1805.method8786(this.method9566(false, false, var31, var32));
               this.field6035[var23] = Statics.field1805.method8786(this.method9566(true, true, var31, var32));
               this.field6036[var23] = Statics.field1805.method8786(this.method9566(false, true, var31, var32));
               ++var23;
            }
         }
      }

      this.field6037 = Statics.field2786;
      Statics.field2786 = (int[][])null;
      this.method9545(this.field6010 >> 4, this.field6022 >> 4, 16, false);
   }

   @deob.ObfuscatedName("mv.ag(ZZIII)Ljava/lang/String;")
   private String method9566(boolean arg0, boolean arg1, int arg2, int arg3) {
      String var5 = "";
      String var6;
      if (arg0) {
         var6 = var5 + "m" + arg2 + '_' + arg3;
      } else {
         var6 = var5 + "l" + arg2 + '_' + arg3;
      }

      if (arg1) {
         var6 = 'u' + var6;
      }

      return var6;
   }

   @deob.ObfuscatedName("mv.ak(Lfb;B)V")
   private void method9543(class441 arg0) {
      if (this.field6027 != arg0) {
         this.field6010 = this.field6022 = arg0.field3661;
         this.field6043 = new int[4][this.field6010 >> 3][this.field6022 >> 3];
         this.field6023 = new int[this.field6010][this.field6022];
         this.field6024 = new int[this.field6010][this.field6022];

         for(int var2 = 0; var2 < 4; ++var2) {
            this.field6028[var2] = class648.method4010(this.field6010, this.field6022);
         }

         this.field6025 = new byte[4][this.field6010][this.field6022];
         this.field6014 = new class611(4, this.field6010, this.field6022);
         this.method9533();
         this.field6027 = arg0;
      }
   }

   @deob.ObfuscatedName("mv.aa(I)V")
   private void method9542() {
      if (class657.field5993 != this.field6001 && class657.field5993 != this.field6002) {
         if (class657.field5991 == this.field6001 || class657.field5988 == this.field6001 || this.field6002 != this.field6001 && (class657.field5990 == this.field6001 || class657.field5990 == this.field6002)) {
            client.field2455 = 0;
            client.field2492 = 0;
            client.field2615.method15312();
         }

         this.field6002 = this.field6001;
      }
   }

   @deob.ObfuscatedName("mv.ao(IIIZS)V")
   private void method9545(int arg0, int arg1, int arg2, boolean arg3) {
      if (client.field2476 == 1) {
         if (this.field6007) {
            throw new IllegalStateException();
         }

         client.field2476 = 2;
         client.field2475 = -1;
      }

      if (arg3 || this.field6015 != arg0 || this.field6003 != arg1) {
         this.field6015 = arg0;
         this.field6003 = arg1;
         if (!this.field6007) {
            client.method14844(arg2);
            class327.method5400(class881.field8978.method15374(Statics.field243), true, Statics.field8847, Statics.field6177, Statics.field7094);
         }

         if (this.field6026 != null) {
            this.field6020 = this.field6026;
         } else {
            this.field6020 = new class723(0, 0, 0);
         }

         this.field6026 = new class723(0, (this.field6015 - (this.field6010 >> 4)) * 8, (this.field6003 - (this.field6022 >> 4)) * 8);
         this.field6008 = class697.method10206(this.field6026.field6676, this.field6026.field6677);
         this.field6018 = null;
         if (!this.field6007) {
            this.method9546(arg2);
         }

      }
   }

   @deob.ObfuscatedName("mv.ab(II)V")
   private void method9546(int arg0) {
      int var2 = this.field6026.field6676 - this.field6020.field6676;
      int var3 = this.field6026.field6677 - this.field6020.field6677;
      if (arg0 == 16) {
         for(int var4 = 0; var4 < client.field2492; ++var4) {
            class106 var5 = client.field2453[var4];
            if (var5 != null) {
               class200 var6 = (class200)var5.field807;

               for(int var7 = 0; var7 < var6.field16.length; ++var7) {
                  var6.field16[var7] -= var2;
                  var6.field62[var7] -= var3;
               }

               class584 var8 = class584.method8135(var6.method11602().field5446);
               var8.field5328 -= (float)(var2 * 512);
               var8.field5331 -= (float)(var3 * 512);
               var6.method11626(var8);
               var8.method8201();
            }
         }
      } else {
         boolean var9 = false;
         client.field2455 = 0;
         int var10 = this.field6010 * 512 - 512;
         int var11 = this.field6022 * 512 - 512;

         for(int var12 = 0; var12 < client.field2492; ++var12) {
            class106 var13 = client.field2453[var12];
            if (var13 != null) {
               class200 var14 = (class200)var13.field807;
               class584 var15 = class584.method8135(var14.method11602().field5446);
               var15.field5328 -= (float)(var2 * 512);
               var15.field5331 -= (float)(var3 * 512);
               var14.method11626(var15);
               if ((int)var15.field5328 >= 0 && (int)var15.field5328 <= var10 && (int)var15.field5331 >= 0 && (int)var15.field5331 <= var11) {
                  boolean var16 = true;

                  for(int var17 = 0; var17 < var14.field16.length; ++var17) {
                     var14.field16[var17] -= var2;
                     var14.field62[var17] -= var3;
                     if (var14.field16[var17] < 0 || var14.field16[var17] >= this.field6010 || var14.field62[var17] < 0 || var14.field62[var17] >= this.field6022) {
                        var16 = false;
                     }
                  }

                  if (var16) {
                     client.field2456[++client.field2455 - 1] = var14.field12;
                  } else {
                     var14.method2811((class915)null);
                     var13.method9864();
                     var9 = true;
                  }
               } else {
                  var14.method2811((class915)null);
                  var13.method9864();
                  var9 = true;
               }

               var15.method8201();
            }
         }

         if (var9) {
            client.field2492 = client.field2615.method15321();
            int var18 = 0;
            Iterator var19 = client.field2615.iterator();

            while(var19.hasNext()) {
               class106 var20 = (class106)var19.next();
               client.field2453[var18++] = var20;
            }
         }
      }

      for(int var21 = 0; var21 < 2048; ++var21) {
         class211 var22 = client.field2408[var21];
         if (var22 != null) {
            for(int var23 = 0; var23 < var22.field16.length; ++var23) {
               var22.field16[var23] -= var2;
               var22.field62[var23] -= var3;
            }

            class584 var24 = class584.method8135(var22.method11602().field5446);
            var24.field5328 -= (float)(var2 * 512);
            var24.field5331 -= (float)(var3 * 512);
            var22.method11626(var24);
            var24.method8201();
         }
      }

      class164[] var25 = client.field2423;

      for(int var26 = 0; var26 < var25.length; ++var26) {
         class164 var27 = var25[var26];
         if (var27 != null) {
            var27.field1152 -= var2 * 512;
            var27.field1155 -= var3 * 512;
         }
      }

      for(class75 var28 = (class75)class75.field556.method14964(); var28 != null; var28 = (class75)class75.field556.method15006()) {
         var28.field545 -= var2;
         var28.field546 -= var3;
         if (class657.field5994 != this.field6001 && (var28.field545 < 0 || var28.field546 < 0 || var28.field545 >= this.field6010 || var28.field546 >= this.field6022)) {
            var28.method9864();
         }
      }

      for(class75 var29 = (class75)class75.field544.method14964(); var29 != null; var29 = (class75)class75.field544.method15006()) {
         var29.field545 -= var2;
         var29.field546 -= var3;
         if (class657.field5994 != this.field6001 && (var29.field545 < 0 || var29.field546 < 0 || var29.field545 >= this.field6010 || var29.field546 >= this.field6022)) {
            var29.method9864();
         }
      }

      for(class79 var30 = (class79)client.field2576.method15313(); var30 != null; var30 = (class79)client.field2576.method15314()) {
         int var31 = (int)(var30.field6137 >> 28 & 3L);
         int var32 = (int)(var30.field6137 & 16383L);
         int var33 = var32 - this.field6026.field6676;
         int var34 = (int)(var30.field6137 >> 14 & 16383L);
         int var35 = var34 - this.field6026.field6677;
         if (this.field6012 != null) {
            if (var33 >= 0 && var35 >= 0 && var33 < this.field6010 && var35 < this.field6022 && var33 < this.field6012.field6577 && var35 < this.field6012.field6578) {
               if (this.field6012.field6579 != null) {
                  this.field6012.method10506(var31, var33, var35);
               }
            } else if (class657.field5994 != this.field6001) {
               var30.method9864();
            }
         }
      }

      if (class299.field1890 != 0) {
         class299.field1890 -= var2;
         class299.field1895 -= var3;
      }

      class677.method5481();
      class98.method17090(false);
      if (arg0 == 16) {
         client.field2506 -= var2 * 512;
         client.field2507 -= var3 * 512;
         Statics.field5542 -= var2 * 512;
         Statics.field9259 -= var3 * 512;
         if (Statics.field5998 != 5) {
            Statics.field5998 = 4;
            Statics.field6637 = -1;
            Statics.field5929 = -1;
         }
      } else {
         Statics.field5127 -= var2;
         Statics.field1994 -= var3;
         Statics.field262 -= var2;
         Statics.field8651 -= var3;
         Statics.field337 -= var2 * 512;
         Statics.field3115 -= var3 * 512;
         if (Math.abs(var2) > this.field6010 || Math.abs(var3) > this.field6022) {
            this.field6013.method11128();
         }
      }

      class987.method17094();
      class299.method8733();
      client.field2494.method15312();
      client.field2577.method14958();
      client.field2590.method14794();
      class764.method5156();
   }

   @deob.ObfuscatedName("mv.ae(I)V")
   private void method9547() {
      this.field6004 = null;
      this.field6005 = null;

      for(int var1 = 0; var1 < 4; ++var1) {
         if (this.field6028[var1] != null) {
            this.field6028[var1].method9345();
         }
      }

      if (this.field6014 != null) {
         this.field6014.method8757();
      }

      if (this.field6013 != null) {
         this.field6013.method11160();
      }

      if (this.field6012 != null) {
         this.field6012.field6589.method10136();
         this.field6012 = null;
      }

   }

   @deob.ObfuscatedName("mv.az(I)Z")
   public boolean method9548() {
      if (!this.field6007) {
         class641.method16069(false);
      }

      this.field6038 = 0;

      for(int var1 = 0; var1 < this.field6019.length; ++var1) {
         if (this.field6032[var1] != -1 && this.field6019[var1] == null) {
            this.field6019[var1] = Statics.field1805.method8771(this.field6032[var1], 0);
            if (this.field6019[var1] == null) {
               ++this.field6038;
            }
         }

         if (this.field6033[var1] != -1 && this.field6039[var1] == null) {
            this.field6039[var1] = Statics.field1805.method8781(this.field6033[var1], 0, this.field6037[var1]);
            if (this.field6039[var1] == null) {
               ++this.field6038;
            }
         }

         if (this.field6035[var1] != -1 && this.field6041[var1] == null) {
            this.field6041[var1] = Statics.field1805.method8771(this.field6035[var1], 0);
            if (this.field6041[var1] == null) {
               ++this.field6038;
            }
         }

         if (this.field6036[var1] != -1 && this.field6042[var1] == null) {
            this.field6042[var1] = Statics.field1805.method8771(this.field6036[var1], 0);
            if (this.field6042[var1] == null) {
               ++this.field6038;
            }
         }

         if (this.field6034 != null && this.field6040[var1] == null && this.field6034[var1] != -1) {
            this.field6040[var1] = Statics.field1805.method8781(this.field6034[var1], 0, this.field6037[var1]);
            if (this.field6040[var1] == null) {
               ++this.field6038;
            }
         }
      }

      if (this.field6018 == null) {
         if (this.field6008 != null && Statics.field2508.method8788(this.field6008.field1659 + "_staticelements")) {
            if (!Statics.field2508.method8793(this.field6008.field1659 + "_staticelements")) {
               ++this.field6038;
            } else {
               this.field6018 = class701.method14491(Statics.field2508, this.field6008.field1659 + "_staticelements", client.field2561);
            }
         } else {
            this.field6018 = new class701(0);
         }
      }

      if (this.field6038 > 0) {
         if (this.field6017 < this.field6038) {
            this.field6017 = this.field6038;
         }

         this.field6044 = class621.field5596;
         return false;
      } else {
         this.field6029 = 0;

         for(int var2 = 0; var2 < this.field6019.length; ++var2) {
            byte[] var3 = this.field6039[var2];
            if (var3 != null) {
               int var4 = (this.field6031[var2] >> 8) * 64 - this.field6026.field6676;
               int var5 = (this.field6031[var2] & 255) * 64 - this.field6026.field6677;
               if (this.field6001.method9494()) {
                  var4 = 10;
                  var5 = 10;
               }

               int var6 = class54.method16011(this.field6016, var3, var4, var5, this.field6010, this.field6022);
               if (var6 > 0) {
                  this.field6029 += var6;
               }
            }

            byte[] var7 = this.field6042[var2];
            if (var7 != null) {
               int var8 = (this.field6031[var2] >> 8) * 64 - this.field6026.field6676;
               int var9 = (this.field6031[var2] & 255) * 64 - this.field6026.field6677;
               if (this.field6001.method9494()) {
                  var8 = 10;
                  var9 = 10;
               }

               int var10 = class54.method16011(this.field6016, var7, var8, var9, this.field6010, this.field6022);
               if (var10 > 0) {
                  this.field6029 += var10;
               }
            }
         }

         if (this.field6029 > 0) {
            if (this.field6030 < this.field6029) {
               this.field6030 = this.field6029;
            }

            this.field6044 = class621.field5598;
            return false;
         } else {
            if (!this.field6007 && class621.field5597 != this.field6044) {
               class327.method5400(class881.field8978.method15374(Statics.field243) + class582.field5311 + "(100%)", true, Statics.field8847, Statics.field6177, Statics.field7094);
            }

            this.field6044 = class621.field5599;
            if (!this.field6007) {
               class677.method9259();
            }

            if (!this.field6007) {
               for(int var11 = 0; var11 < 2048; ++var11) {
                  class211 var12 = client.field2408[var11];
                  if (var12 != null) {
                     var12.field1033 = null;
                  }
               }

               for(int var13 = 0; var13 < client.field2453.length; ++var13) {
                  class106 var14 = client.field2453[var13];
                  if (var14 != null) {
                     ((class134)var14.field807).field1033 = null;
                  }
               }
            }

            if (!this.field6007) {
               client.method14300(true);
            }

            if (!this.field6007) {
               class817.method9459();
            }

            boolean var15 = false;
            if (Statics.field9361.field975.method2254() == 2) {
               for(int var16 = 0; var16 < this.field6019.length; ++var16) {
                  if (this.field6042[var16] != null || this.field6041[var16] != null) {
                     var15 = true;
                     break;
                  }
               }
            }

            int var17 = class459.method372(Statics.field9361.field957.method2262()).field3795 * 8;
            if (Statics.field8847.method7497()) {
               ++var17;
            }

            this.method9534();
            this.method9547();
            this.field6012 = new class713(Statics.field8847, 9, 4, this.field6010, this.field6022, var17, var15, Statics.field8847.method7499() > 0);
            this.field6012.method10481(false);
            this.field6012.method10537(client.field2412);
            if (client.field2412 != 0) {
               this.field6012.method10616(Statics.field5483);
            } else {
               this.field6012.method10616((class609)null);
            }

            this.field6021 = new class642();
            this.field6006 = -0.05F + (float)(Math.random() / 10.0D);
            this.field6005 = new class54(this.field6012, this.field6016, 4, this.field6010, this.field6022, false, this.field6014, this.field6013);
            this.field6005.method8995();
            this.field6005.field5673 = Statics.field9361.field964.method2210();
            this.field6005.field5618 = Statics.field9361.field975.method2254() == 2;
            this.field6005.field5619 = Statics.field9361.field951.method1448() == 1;
            this.field6005.field5620 = Statics.field9361.field960.method2128() == 1;
            this.field6005.field5635 = Statics.field9361.field972.method2268() == 1;
            if (!this.field6001.method9494()) {
               this.method9625(this.field6005, this.field6019);
            } else {
               this.method9551(this.field6005, this.field6019);
            }

            if (this.field6007) {
               this.method9549(50);
            }

            this.field6013.method11125(this.field6010 >> 4, this.field6022 >> 4);
            this.field6013.method11137(this);
            if (var15) {
               this.field6012.method10481(true);
               this.field6004 = new class54(this.field6012, this.field6016, 1, this.field6010, this.field6022, true, this.field6014, this.field6013);
               this.field6004.method8995();
               this.field6004.field5673 = Statics.field9361.field964.method2210();
               this.field6004.field5618 = Statics.field9361.field975.method2254() == 2;
               this.field6004.field5619 = Statics.field9361.field951.method1448() == 1;
               this.field6004.field5620 = Statics.field9361.field960.method2128() == 1;
               this.field6004.field5635 = Statics.field9361.field972.method2268() == 1;
               if (!this.field6001.method9494()) {
                  this.method9625(this.field6004, this.field6041);
                  if (!this.field6007) {
                     class641.method16069(true);
                  }
               } else {
                  this.method9551(this.field6004, this.field6041);
                  if (!this.field6007) {
                     class641.method16069(true);
                  }
               }

               this.field6004.method9007(0, this.field6005.field5626[0]);
               this.field6004.method9049(Statics.field8847, (int[][][])null, (class648[])null);
               this.field6012.method10481(false);
               if (this.field6007) {
                  this.method9549(50);
               }
            }

            this.field6005.method9049(Statics.field8847, var15 ? this.field6004.field5626 : (int[][][])null, this.field6028);
            if (!this.field6001.method9494()) {
               if (!this.field6007) {
                  class641.method16069(true);
               }

               this.method9552(this.field6005, this.field6039);
               if (this.field6040 != null) {
                  this.method9554();
               }
            } else {
               if (!this.field6007) {
                  class641.method16069(true);
               }

               this.method9553(this.field6005, this.field6039);
            }

            if (!this.field6007) {
               class641.method16069(true);
            }

            this.field6005.method9004(Statics.field8847, var15 ? this.field6012.field6584[0] : null, (class934)null);
            if (this.field6007) {
               this.method9549(75);
            }

            this.field6005.method866(Statics.field8847, false);
            if (this.field6007) {
               this.method9549(75);
            }

            if (!this.field6007) {
               class641.method16069(true);
            }

            if (var15) {
               this.field6012.method10481(true);
               if (!this.field6007) {
                  class641.method16069(true);
               }

               if (!this.field6001.method9494()) {
                  this.method9552(this.field6004, this.field6042);
               } else {
                  this.method9553(this.field6004, this.field6042);
               }

               if (!this.field6007) {
                  class641.method16069(true);
               }

               this.field6004.method9004(Statics.field8847, (class934)null, this.field6012.field6582[0]);
               this.field6004.method866(Statics.field8847, true);
               if (!this.field6007) {
                  class641.method16069(true);
               }

               this.field6012.method10481(false);
               if (this.field6007) {
                  this.method9549(50);
               }
            }

            this.field6005.method9003();
            if (this.field6004 != null) {
               this.field6004.method9003();
            }

            this.field6012.method10482();
            if (this.field6007) {
               class431.method2169();

               while(!Statics.field8847.method11501()) {
                  this.method9549(1);
               }
            }

            boolean var18 = false;
            if (this.field6007) {
               class658 var19 = client.field2468;
               this.method9535(var19);
               Statics.field4892.method8957(var19);
               var18 = true;
               class431.method2169();
               Object var20 = client.field2471;
               synchronized(client.field2471) {
                  client.field2469 = true;

                  try {
                     client.field2471.wait();
                  } catch (InterruptedException var38) {
                  }
               }

               client.field2468 = this;
               var19.method9547();
               this.method9546(16);
               this.method9542();
            } else {
               class677.method9259();
               this.field6013.method11122();
               class671.method5268();
            }

            for(int var23 = 0; var23 < 4; ++var23) {
               for(int var24 = 0; var24 < this.field6010; ++var24) {
                  for(int var25 = 0; var25 < this.field6022; ++var25) {
                     client.method10932(var23, var24, var25);
                  }
               }
            }

            for(int var26 = 0; var26 < client.field2424.length; ++var26) {
               if (client.field2424[var26] != null) {
                  client.field2424[var26].method10012(this.field6012);
               }
            }

            client.method15057();
            class75.method443();
            if (class671.method11178() == class686.field6209 && client.field2463.method1413() != null && client.field2410 == 16) {
               class109 var27 = class109.method15110(class558.field4809, client.field2463.field832);
               var27.field814.method1572(1057001181);
               client.field2463.method1408(var27);
            }

            if (!this.field6001.method9494()) {
               int var28 = (this.field6015 - (this.field6010 >> 4)) / 8;
               int var29 = ((this.field6010 >> 4) + this.field6015) / 8;
               int var30 = (this.field6003 - (this.field6022 >> 4)) / 8;
               int var31 = ((this.field6022 >> 4) + this.field6003) / 8;

               for(int var32 = var28 - 1; var32 <= var29 + 1; ++var32) {
                  for(int var33 = var30 - 1; var33 <= var31 + 1; ++var33) {
                     if (var32 < var28 || var32 > var29 || var33 < var30 || var33 > var31) {
                        Statics.field1805.method8832(this.method9566(true, false, var32, var33));
                        Statics.field1805.method8832(this.method9566(false, false, var32, var33));
                        Statics.field1805.method8832(this.method9566(true, true, var32, var33));
                        Statics.field1805.method8832(this.method9566(false, true, var32, var33));
                     }
                  }
               }
            }

            if (client.field2410 == 5) {
               client.method14844(6);
            } else if (client.field2410 == 19) {
               client.method14844(15);
            } else if (client.field2410 == 7) {
               client.method14844(11);
            } else if (client.field2410 == 17) {
               client.method14844(14);
            } else {
               client.method14844(1);
               if (client.field2463.method1413() != null) {
                  class109 var34 = class109.method15110(class558.field4845, client.field2463.field832);
                  client.field2463.method1408(var34);
               }
            }

            class131.method11281();
            if (this.field6011) {
               class319.method10037(Long.toString(class431.method2169() - this.field6045));
               this.field6011 = false;
            }

            if (var18) {
               Object var35 = client.field2470;
               synchronized(client.field2470) {
                  client.field2470.notify();
               }
            }

            return true;
         }
      }
   }

   @deob.ObfuscatedName("mv.aq(II)V")
   private void method9549(int arg0) {
      try {
         Thread.sleep((long)arg0);
      } catch (InterruptedException var3) {
      }

   }

   @deob.ObfuscatedName("mv.ar(Laby;[[BB)V")
   private void method9625(class54 arg0, byte[][] arg1) {
      int var3 = arg1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         byte[] var5 = arg1[var4];
         if (var5 != null) {
            class124 var6 = new class124(var5);
            int var7 = this.field6031[var4] >> 8;
            int var8 = this.field6031[var4] & 255;
            int var9 = var7 * 64 - this.field6026.field6676;
            int var10 = var8 * 64 - this.field6026.field6677;
            if (!this.field6007) {
               class677.method9259();
            }

            arg0.method8999(var6, var9, var10, this.field6026.field6676, this.field6026.field6677, this.field6028);
            arg0.method857(Statics.field8847, var6, var9, var10);
         }
      }

      for(int var11 = 0; var11 < var3; ++var11) {
         int var12 = (this.field6031[var11] >> 8) * 64 - this.field6026.field6676;
         int var13 = (this.field6031[var11] & 255) * 64 - this.field6026.field6677;
         byte[] var14 = arg1[var11];
         if (var14 == null && this.field6003 < 800) {
            if (!this.field6007) {
               class677.method9259();
            }

            arg0.method8997(var12, var13, 64, 64);
         }
      }

   }

   @deob.ObfuscatedName("mv.as(Laby;[[BI)V")
   private void method9551(class54 arg0, byte[][] arg1) {
      for(int var3 = 0; var3 < arg0.field5622; ++var3) {
         if (!this.field6007) {
            class677.method9259();
         }

         for(int var4 = 0; var4 < this.field6010 >> 3; ++var4) {
            for(int var5 = 0; var5 < this.field6022 >> 3; ++var5) {
               int var6 = this.field6043[var3][var4][var5];
               if (var6 != -1) {
                  int var7 = var6 >> 24 & 3;
                  if (!arg0.field5691 || var7 == 0) {
                     int var8 = var6 >> 1 & 3;
                     int var9 = var6 >> 14 & 1023;
                     int var10 = var6 >> 3 & 2047;
                     int var11 = (var9 / 8 << 8) + var10 / 8;

                     for(int var12 = 0; var12 < this.field6031.length; ++var12) {
                        if (this.field6031[var12] == var11 && arg1[var12] != null) {
                           class124 var13 = new class124(arg1[var12]);
                           arg0.method9000(var13, var3, var4 * 8, var5 * 8, var7, var9, var10, var8, this.field6028);
                           arg0.method858(Statics.field8847, var13, var3, var4 * 8, var5 * 8, var7, var9, var10, var8);
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      for(int var14 = 0; var14 < arg0.field5622; ++var14) {
         if (!this.field6007) {
            class677.method9259();
         }

         for(int var15 = 0; var15 < this.field6010 >> 3; ++var15) {
            for(int var16 = 0; var16 < this.field6022 >> 3; ++var16) {
               int var17 = this.field6043[var14][var15][var16];
               if (var17 == -1) {
                  arg0.method8998(var14, var15 * 8, var16 * 8, 8, 8);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("mv.au(Laby;[[BI)V")
   private void method9552(class54 arg0, byte[][] arg1) {
      int var3 = this.field6019.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         byte[] var5 = arg1[var4];
         if (var5 != null) {
            int var6 = (this.field6031[var4] >> 8) * 64 - this.field6026.field6676;
            int var7 = (this.field6031[var4] & 255) * 64 - this.field6026.field6677;
            if (!this.field6007) {
               class677.method9259();
            }

            arg0.method859(Statics.field8847, var5, var6, var7, this.field6028);
            if (this.field6007) {
               this.method9549(10);
            }
         }
      }

   }

   @deob.ObfuscatedName("mv.ad(Laby;[[BI)V")
   private void method9553(class54 arg0, byte[][] arg1) {
      for(int var3 = 0; var3 < arg0.field5622; ++var3) {
         if (!this.field6007) {
            class677.method9259();
         }

         for(int var4 = 0; var4 < this.field6010 >> 3; ++var4) {
            for(int var5 = 0; var5 < this.field6022 >> 3; ++var5) {
               int var6 = this.field6043[var3][var4][var5];
               if (var6 != -1) {
                  int var7 = var6 >> 24 & 3;
                  if (!arg0.field5691 || var7 == 0) {
                     int var8 = var6 >> 1 & 3;
                     int var9 = var6 >> 14 & 1023;
                     int var10 = var6 >> 3 & 2047;
                     int var11 = (var9 / 8 << 8) + var10 / 8;

                     for(int var12 = 0; var12 < this.field6031.length; ++var12) {
                        if (this.field6031[var12] == var11 && arg1[var12] != null) {
                           arg0.method860(Statics.field8847, arg1[var12], var3, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, this.field6028);
                           break;
                        }
                     }
                  }
               }

               if (this.field6007) {
                  this.method9549(5);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("mv.am(I)V")
   private void method9554() {
      int var1 = this.field6040.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field6040[var2] != null) {
            int var3 = -1;

            for(int var4 = 0; var4 < client.field2522; ++var4) {
               if (client.field2515[var4] == this.field6031[var2]) {
                  var3 = var4;
                  break;
               }
            }

            if (var3 == -1) {
               client.field2515[client.field2522] = this.field6031[var2];
               var3 = ++client.field2522 - 1;
            }

            class124 var5 = new class124(this.field6040[var2]);
            int var6 = 0;

            while(var5.field935 < this.field6040[var2].length && var6 < 511 && client.field2455 < 1023) {
               int var7 = var3 | var6++ << 6;
               int var8 = var5.method1587();
               int var9 = var8 >> 14;
               int var10 = var8 >> 7 & 63;
               int var11 = var8 & 63;
               int var12 = (this.field6031[var2] >> 8) * 64 - this.field6026.field6676 + var10;
               int var13 = (this.field6031[var2] & 255) * 64 - this.field6026.field6677 + var11;
               class915 var14 = Statics.field93.method15857(var5.method1587());
               class106 var15 = (class106)client.field2615.method15322((long)var7);
               if (var15 == null && (var14.field9301 & 1) > 0 && var12 >= 0 && var14.field9328 + var12 < this.field6010 && var13 >= 0 && var14.field9328 + var13 < this.field6022) {
                  class200 var16 = new class200(this.field6012);
                  var16.field12 = var7;
                  class106 var17 = new class106(var16);
                  client.field2615.method15311(var17, (long)var7);
                  client.field2453[++client.field2492 - 1] = var17;
                  client.field2456[++client.field2455 - 1] = var7;
                  var16.field42 = client.field2418;
                  var16.method2811(var14);
                  var16.method95(var16.field1312.field9328);
                  var16.field67 = var16.field1312.field9306 << 3;
                  var16.method117(var16.field1312.field9283.method9671().method9329() << 11 & 16383, true);
                  var16.method2805(var9, var12, var13, true, var16.method96());
               }
            }
         }
      }

   }
}
