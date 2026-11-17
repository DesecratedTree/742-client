import java.nio.ByteBuffer;
import sun.misc.Unsafe;

@deob.ObfuscatedName("yj")
public class class970 extends class934 {
   @deob.ObfuscatedName("yj.e")
   private float field9675 = Float.MAX_VALUE;
   @deob.ObfuscatedName("yj.z")
   private float field9676 = -3.4028235E38F;
   @deob.ObfuscatedName("yj.ai")
   private class849 field9686 = new class849();
   @deob.ObfuscatedName("yj.ar")
   private int[] field9704 = new int[1];
   @deob.ObfuscatedName("yj.as")
   private int[] field9705 = new int[1];
   @deob.ObfuscatedName("yj.ad")
   private int[] field9707 = new int[1];
   @deob.ObfuscatedName("yj.a")
   public final class979 field9682;
   @deob.ObfuscatedName("yj.x")
   private int field9668;
   @deob.ObfuscatedName("yj.s")
   private int field9672;
   @deob.ObfuscatedName("yj.l")
   private int field9670;
   @deob.ObfuscatedName("yj.u")
   private final int field9671;
   @deob.ObfuscatedName("yj.q")
   private int[][][] field9677;
   @deob.ObfuscatedName("yj.m")
   private class101[][][] field9683;
   @deob.ObfuscatedName("yj.c")
   public int[][][] field9696;
   @deob.ObfuscatedName("yj.w")
   public int[][][] field9695;
   @deob.ObfuscatedName("yj.i")
   public int[][][] field9678;
   @deob.ObfuscatedName("yj.t")
   private int[][][] field9679;
   @deob.ObfuscatedName("yj.h")
   public short[][] field9674;
   @deob.ObfuscatedName("yj.j")
   private byte[][] field9684;
   @deob.ObfuscatedName("yj.aw")
   private byte[][] field9702;
   @deob.ObfuscatedName("yj.al")
   private float[][] field9694;
   @deob.ObfuscatedName("yj.an")
   private float[][] field9680;
   @deob.ObfuscatedName("yj.ag")
   private float[][] field9673;
   @deob.ObfuscatedName("yj.ak")
   private class875 field9697;
   @deob.ObfuscatedName("yj.f")
   private class519 field9685;
   @deob.ObfuscatedName("yj.g")
   private int field9690;
   @deob.ObfuscatedName("yj.at")
   private int field9691;
   @deob.ObfuscatedName("yj.ao")
   private int field9699;
   @deob.ObfuscatedName("yj.v")
   private int field9700;
   @deob.ObfuscatedName("yj.ah")
   private int field9701;
   @deob.ObfuscatedName("yj.aq")
   private int field9703;
   @deob.ObfuscatedName("yj.au")
   private int field9706;
   @deob.ObfuscatedName("yj.ae")
   private long field9666;
   @deob.ObfuscatedName("yj.ab")
   private long field9667;
   @deob.ObfuscatedName("yj.az")
   private long field9688;
   @deob.ObfuscatedName("yj.af")
   private class505 field9692;
   @deob.ObfuscatedName("yj.av")
   private class508 field9669;
   @deob.ObfuscatedName("yj.ax")
   private class508 field9689;
   @deob.ObfuscatedName("yj.ap")
   private class674[] field9687;
   @deob.ObfuscatedName("yj.aa")
   private class674[] field9698;
   @deob.ObfuscatedName("yj.y")
   private int[][][] field9665;

   public class970(class979 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field9682 = arg0;
      this.field9668 = this.field9464 - 2;
      this.field9672 = 1 << this.field9668;
      this.field9670 = arg1;
      this.field9671 = arg2;
      this.field9677 = new int[arg3][arg4][];
      this.field9683 = new class101[arg3][arg4][];
      this.field9696 = new int[arg3][arg4][];
      this.field9695 = new int[arg3][arg4][];
      this.field9678 = new int[arg3][arg4][];
      this.field9679 = new int[arg3][arg4][];
      this.field9674 = new short[arg3 * arg4][];
      this.field9684 = new byte[arg3][arg4];
      this.field9702 = new byte[arg3 + 1][arg4 + 1];
      this.field9694 = new float[this.field9463 + 1][this.field9461 + 1];
      this.field9680 = new float[this.field9463 + 1][this.field9461 + 1];
      this.field9673 = new float[this.field9463 + 1][this.field9461 + 1];

      for(int var9 = 0; var9 <= this.field9461; ++var9) {
         for(int var10 = 0; var10 <= this.field9463; ++var10) {
            int var11 = this.field9462[var10][var9];
            if ((float)var11 < this.field9675) {
               this.field9675 = (float)var11;
            }

            if ((float)var11 > this.field9676) {
               this.field9676 = (float)var11;
            }

            if (var10 > 0 && var9 > 0 && var10 < this.field9463 && var9 < this.field9461) {
               int var12 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
               int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
               float var14 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
               this.field9694[var10][var9] = (float)var12 * var14;
               this.field9680[var10][var9] = (float)(-arg7 * 2) * var14;
               this.field9673[var10][var9] = (float)var13 * var14;
            }
         }
      }

      --this.field9675;
      ++this.field9676;
      this.field9697 = new class875(128);
      if ((this.field9671 & 16) != 0) {
         this.field9685 = new class519(this.field9682, this);
      }

   }

   @deob.ObfuscatedName("yj.LA(III)V")
   public void method7246(int arg0, int arg1, int arg2) {
      if ((this.field9702[arg0][arg1] & 255) < arg2) {
         this.field9702[arg0][arg1] = (byte)arg2;
      }

   }

   @deob.ObfuscatedName("yj.n(II[I[I[I[I[I[I[I[ILdq;Z)V")
   public void method7247(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class402 arg10, boolean arg11) {
      class637 var13 = this.field9682.field7118;
      if (arg5 != null && this.field9665 == null) {
         this.field9665 = new int[this.field9463][this.field9461][];
      }

      if (arg3 != null && this.field9677 == null) {
         this.field9677 = new int[this.field9463][this.field9461][];
      }

      this.field9696[arg0][arg1] = arg2;
      this.field9695[arg0][arg1] = arg4;
      this.field9678[arg0][arg1] = arg6;
      this.field9679[arg0][arg1] = arg7;
      if (this.field9665 != null) {
         this.field9665[arg0][arg1] = arg5;
      }

      if (this.field9677 != null) {
         this.field9677[arg0][arg1] = arg3;
      }

      class101[] var14 = this.field9683[arg0][arg1] = new class101[arg6.length];

      for(int var15 = 0; var15 < arg6.length; ++var15) {
         int var16 = arg8[var15];
         int var17 = arg9[var15];
         if ((this.field9671 & 32) != 0 && var16 != -1 && var13.method5112(var16).field2331) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)arg10.field2962 << 48 | (long)arg10.field2964 << 42 | (long)arg10.field2965 << 28 | (long)(var17 << 14) | (long)var16;

         class674 var20;
         for(var20 = this.field9697.method15322(var18); var20 != null; var20 = this.field9697.method15308()) {
            class101 var21 = (class101)var20;
            if (var21.field778 == var16 && (float)var17 == var21.field779 && var21.field787.method5508(arg10)) {
               break;
            }
         }

         if (var20 == null) {
            var14[var15] = new class101(this, var16, var17, arg10);
            this.field9697.method15311(var14[var15], var18);
         } else {
            var14[var15] = (class101)var20;
         }
      }

      if (arg11) {
         this.field9684[arg0][arg1] = (byte)(this.field9684[arg0][arg1] | 1);
      }

      if (arg6.length > this.field9701) {
         this.field9701 = arg6.length;
      }

      this.field9691 += arg6.length;
   }

   @deob.ObfuscatedName("yj.k(II[I[I[I[I[I[I[I[I[I[I[ILdq;Z)V")
   public void method7250(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class402 arg13, boolean arg14) {
      int var16 = arg9.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = new int[var16 * 3];
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = arg3 != null ? new int[var16 * 3] : null;
      int[] var24 = arg5 != null ? new int[var16 * 3] : null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = arg6[var26];
         int var28 = arg7[var26];
         int var29 = arg8[var26];
         var17[var25] = arg2[var27];
         var18[var25] = arg4[var27];
         var19[var25] = arg9[var26];
         var21[var25] = arg11[var26];
         var22[var25] = arg12[var26];
         var20[var25] = arg10 != null ? arg10[var26] : arg9[var26];
         if (arg3 != null) {
            var23[var25] = arg3[var27];
         }

         if (arg5 != null) {
            var24[var25] = arg5[var27];
         }

         ++var25;
         var17[var25] = arg2[var28];
         var18[var25] = arg4[var28];
         var19[var25] = arg9[var26];
         var21[var25] = arg11[var26];
         var22[var25] = arg12[var26];
         var20[var25] = arg10 != null ? arg10[var26] : arg9[var26];
         if (arg3 != null) {
            var23[var25] = arg3[var28];
         }

         if (arg5 != null) {
            var24[var25] = arg5[var28];
         }

         ++var25;
         var17[var25] = arg2[var29];
         var18[var25] = arg4[var29];
         var19[var25] = arg9[var26];
         var21[var25] = arg11[var26];
         var22[var25] = arg12[var26];
         var20[var25] = arg10 != null ? arg10[var26] : arg9[var26];
         if (arg3 != null) {
            var23[var25] = arg3[var29];
         }

         if (arg5 != null) {
            var24[var25] = arg5[var29];
         }

         ++var25;
      }

      this.method7247(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
   }

   @deob.ObfuscatedName("yj.SA()V")
   public void method7249() {
      if (this.field9691 <= 0) {
         this.field9685 = null;
         this.method16106();
      } else {
         byte[][] var1 = new byte[this.field9463 + 1][this.field9461 + 1];

         for(int var2 = 1; var2 < this.field9463; ++var2) {
            for(int var3 = 1; var3 < this.field9461; ++var3) {
               var1[var2][var3] = (byte)((this.field9702[var2][var3] >> 1) + (this.field9702[var2][var3 + 1] >> 3) + (this.field9702[var2][var3 - 1] >> 2) + (this.field9702[var2 - 1][var3] >> 2) + (this.field9702[var2 + 1][var3] >> 3));
            }
         }

         this.field9698 = new class674[this.field9697.method15321()];
         this.field9697.method15317(this.field9698);

         for(int var4 = 0; var4 < this.field9698.length; ++var4) {
            ((class101)this.field9698[var4]).method1347(this.field9691);
         }

         this.field9703 = 20;
         if (this.field9665 != null) {
            this.field9703 += 4;
         }

         if ((this.field9671 & 7) != 0) {
            this.field9703 += 12;
         }

         this.field9688 = this.field9682.field9978.allocateMemory((long)(this.field9703 * this.field9691 + this.field9691 * 4));
         this.field9667 = this.field9688;
         this.field9666 = (long)(this.field9691 * 4) + this.field9688;
         class101[] var5 = new class101[this.field9691];
         int var6 = class887.method14787(this.field9691 / 4);
         if (var6 < 1) {
            var6 = 1;
         }

         class875 var7 = new class875(var6);
         class101[] var8 = new class101[this.field9701];

         for(int var9 = 0; var9 < this.field9463; ++var9) {
            for(int var10 = 0; var10 < this.field9461; ++var10) {
               this.method16108(var9, var10, var1, var8, var7, var5);
            }
         }

         for(int var11 = 0; var11 < this.field9700; ++var11) {
            class101 var12 = var5[var11];
            if (var12 != null) {
               var12.method1348(var11);
            }
         }

         for(int var13 = 0; var13 < this.field9463; ++var13) {
            for(int var14 = 0; var14 < this.field9461; ++var14) {
               short[] var15 = this.field9674[this.field9463 * var14 + var13];
               if (var15 != null) {
                  int var16 = 0;
                  int var17 = 0;

                  while(var17 < var15.length) {
                     int var18 = var15[var17++] & 65535;
                     int var19 = var15[var17++] & 65535;
                     int var20 = var15[var17++] & 65535;
                     class101 var21 = var5[var18];
                     class101 var22 = var5[var19];
                     class101 var23 = var5[var20];
                     class101 var24 = null;
                     if (var21 != null) {
                        var21.method1349(var13, var14, var16);
                        var24 = var21;
                     }

                     if (var22 != null) {
                        var22.method1349(var13, var14, var16);
                        if (var24 == null || var22.field6137 < var24.field6137) {
                           var24 = var22;
                        }
                     }

                     if (var23 != null) {
                        var23.method1349(var13, var14, var16);
                        if (var24 == null || var23.field6137 < var24.field6137) {
                           var24 = var23;
                        }
                     }

                     if (var24 != null) {
                        if (var21 != null) {
                           var24.method1348(var18);
                        }

                        if (var22 != null) {
                           var24.method1348(var19);
                        }

                        if (var23 != null) {
                           var24.method1348(var20);
                        }

                        var24.method1349(var13, var14, var16);
                     }

                     ++var16;
                  }
               }
            }
         }

         this.field9699 = 0;

         for(int var25 = 0; var25 < this.field9698.length; ++var25) {
            class101 var26 = (class101)this.field9698[var25];
            if (var26.field782 > 0) {
               this.field9698[this.field9699++] = var26;
            }
         }

         this.field9687 = new class674[this.field9699];
         long[] var27 = new long[this.field9699];

         for(int var28 = 0; var28 < this.field9699; ++var28) {
            class101 var29 = (class101)this.field9698[var28];
            var27[var28] = var29.field6137;
            this.field9687[var28] = var29;
         }

         class781.method5516(var27, this.field9687);
         this.method16105();
      }
   }

   @deob.ObfuscatedName("yj.z()V")
   private void method16105() {
      this.field9689 = this.field9682.method2570(false);
      this.field9689.method728(this.field9700 * 4, 4);
      this.field9689.method700(0, this.field9700 * 4, this.field9688);
      this.field9669 = this.field9682.method2570(false);
      this.field9669.method728(this.field9703 * this.field9700, this.field9703);
      this.field9669.method700(0, this.field9703 * this.field9700, (long)(this.field9691 * 4) + this.field9688);
      this.field9682.field9978.freeMemory(this.field9688);
      if ((this.field9671 & 7) != 0) {
         if (this.field9665 != null) {
            this.field9692 = this.field9682.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3990, class496.field3989, class496.field3993}), new class509(class496.field3988)});
         } else {
            this.field9692 = this.field9682.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3990, class496.field3993}), new class509(class496.field3988)});
         }
      } else if (this.field9665 != null) {
         this.field9692 = this.field9682.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3990, class496.field3989}), new class509(class496.field3988)});
      } else {
         this.field9692 = this.field9682.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3990}), new class509(class496.field3988)});
      }

      for(int var1 = 0; var1 < this.field9699; ++var1) {
         class101 var2 = (class101)this.field9698[var1];
         var2.method1351(this.field9700);
      }

      if (this.field9685 != null) {
         this.field9685.method7213();
      }

      this.method16106();
   }

   @deob.ObfuscatedName("yj.t()V")
   private void method16106() {
      if ((this.field9670 & 2) == 0) {
         this.field9695 = (int[][][])null;
         this.field9696 = (int[][][])null;
         this.field9678 = (int[][][])null;
      }

      this.field9665 = (int[][][])null;
      this.field9679 = (int[][][])null;
      this.field9677 = (int[][][])null;
      this.field9683 = (class101[][][])null;
      this.field9702 = (byte[][])null;
      this.field9697 = null;
      this.field9698 = null;
      this.field9673 = (float[][])null;
      this.field9680 = (float[][])null;
      this.field9694 = (float[][])null;
   }

   @deob.ObfuscatedName("yj.y(II[[B[Ladr;Luw;[Ladr;)V")
   private void method16108(int arg0, int arg1, byte[][] arg2, class101[] arg3, class875 arg4, class101[] arg5) {
      if (this.field9678[arg0][arg1] != null) {
         class101[] var7 = this.field9683[arg0][arg1];
         int[] var8 = this.field9696[arg0][arg1];
         int[] var9 = this.field9695[arg0][arg1];
         int[] var10 = this.field9679[arg0][arg1];
         int[] var11 = this.field9678[arg0][arg1];
         int[] var12 = this.field9677 != null ? this.field9677[arg0][arg1] : null;
         int[] var13 = this.field9665 != null ? this.field9665[arg0][arg1] : null;
         if (var10 == null) {
            var10 = var11;
         }

         float var14 = this.field9694[arg0][arg1];
         float var15 = this.field9680[arg0][arg1];
         float var16 = this.field9673[arg0][arg1];
         float var17 = this.field9694[arg0][arg1 + 1];
         float var18 = this.field9680[arg0][arg1 + 1];
         float var19 = this.field9673[arg0][arg1 + 1];
         float var20 = this.field9694[arg0 + 1][arg1 + 1];
         float var21 = this.field9680[arg0 + 1][arg1 + 1];
         float var22 = this.field9673[arg0 + 1][arg1 + 1];
         float var23 = this.field9694[arg0 + 1][arg1];
         float var24 = this.field9680[arg0 + 1][arg1];
         float var25 = this.field9673[arg0 + 1][arg1];
         int var26 = arg2[arg0][arg1] & 255;
         int var27 = arg2[arg0][arg1 + 1] & 255;
         int var28 = arg2[arg0 + 1][arg1 + 1] & 255;
         int var29 = arg2[arg0 + 1][arg1] & 255;
         int var30 = 0;

         label185:
         for(int var31 = 0; var31 < var11.length; ++var31) {
            class101 var32 = var7[var31];

            for(int var33 = 0; var33 < var30; ++var33) {
               if (arg3[var33] == var32) {
                  continue label185;
               }
            }

            arg3[var30++] = var32;
         }

         short[] var34 = this.field9674[this.field9463 * arg1 + arg0] = new short[var11.length];

         for(int var35 = 0; var35 < var11.length; ++var35) {
            int var36 = (arg0 << this.field9464) + var8[var35];
            int var37 = (arg1 << this.field9464) + var9[var35];
            int var38 = var36 >> this.field9668;
            int var39 = var37 >> this.field9668;
            int var40 = var11[var35];
            int var41 = var10[var35];
            int var42 = var12 != null ? var12[var35] : 0;
            long var43 = (long)var41 << 48 | (long)var40 << 32 | (long)(var38 << 16) | (long)var39;
            int var45 = var8[var35];
            int var46 = var9[var35];
            byte var47 = 74;
            int var48 = 0;
            float var49 = 1.0F;
            float var50;
            float var51;
            float var52;
            int var53;
            if (var45 == 0 && var46 == 0) {
               var50 = var14;
               var51 = var15;
               var52 = var16;
               var53 = var47 - var26;
            } else if (var45 == 0 && this.field9460 == var46) {
               var50 = var17;
               var51 = var18;
               var52 = var19;
               var53 = var47 - var27;
            } else if (this.field9460 == var45 && this.field9460 == var46) {
               var50 = var20;
               var51 = var21;
               var52 = var22;
               var53 = var47 - var28;
            } else if (this.field9460 == var45 && var46 == 0) {
               var50 = var23;
               var51 = var24;
               var52 = var25;
               var53 = var47 - var29;
            } else {
               float var54 = (float)var45 / (float)this.field9460;
               float var55 = (float)var46 / (float)this.field9460;
               float var56 = (var23 - var14) * var54 + var14;
               float var57 = (var24 - var15) * var54 + var15;
               float var58 = (var25 - var16) * var54 + var16;
               float var59 = (var20 - var17) * var54 + var17;
               float var60 = (var21 - var18) * var54 + var18;
               float var61 = (var22 - var19) * var54 + var19;
               var50 = (var59 - var56) * var55 + var56;
               var51 = (var60 - var57) * var55 + var57;
               var52 = (var61 - var58) * var55 + var58;
               int var62 = ((var29 - var26) * var45 >> this.field9464) + var26;
               int var63 = ((var28 - var27) * var45 >> this.field9464) + var27;
               var53 = var47 - (((var63 - var62) * var46 >> this.field9464) + var62);
            }

            if (var40 != -1) {
               int var64 = (var40 & 127) * var53 >> 7;
               if (var64 < 2) {
                  var64 = 2;
               } else if (var64 > 126) {
                  var64 = 126;
               }

               var48 = Statics.field7193[var40 & 65408 | var64];
               if ((this.field9671 & 7) == 0) {
                  float var65 = this.field9682.field10042[2] * var52 + this.field9682.field10042[0] * var50 + this.field9682.field10042[1] * var51;
                  var49 = this.field9682.field10050 + var65 * (var65 > 0.0F ? this.field9682.field10051 : this.field9682.field9996);
               }
            }

            class674 var66 = null;
            if ((var36 & this.field9672 - 1) == 0 && (var37 & this.field9672 - 1) == 0) {
               var66 = arg4.method15322(var43);
            }

            int var81;
            if (var66 == null) {
               int var68;
               if (var40 != var41) {
                  int var67 = (var41 & 127) * var53 >> 7;
                  if (var67 < 2) {
                     var67 = 2;
                  } else if (var67 > 126) {
                     var67 = 126;
                  }

                  var68 = Statics.field7193[var41 & 65408 | var67];
                  if ((this.field9671 & 7) == 0) {
                     float var69 = this.field9682.field10042[2] * var52 + this.field9682.field10042[0] * var50 + this.field9682.field10042[1] * var51;
                     float var70 = this.field9682.field10050 + var49 * (var49 > 0.0F ? this.field9682.field10051 : this.field9682.field9996);
                     int var71 = var68 >> 16 & 255;
                     int var72 = var68 >> 8 & 255;
                     int var73 = var68 & 255;
                     int var74 = (int)((float)var71 * var70);
                     if (var74 < 0) {
                        var74 = 0;
                     } else if (var74 > 255) {
                        var74 = 255;
                     }

                     int var75 = (int)((float)var72 * var70);
                     if (var75 < 0) {
                        var75 = 0;
                     } else if (var75 > 255) {
                        var75 = 255;
                     }

                     int var76 = (int)((float)var73 * var70);
                     if (var76 < 0) {
                        var76 = 0;
                     } else if (var76 > 255) {
                        var76 = 255;
                     }

                     var68 = var74 << 16 | var75 << 8 | var76;
                  }
               } else {
                  var68 = var48;
               }

               Unsafe var77 = this.field9682.field9978;
               var77.putFloat(this.field9666, (float)var36);
               this.field9666 += 4L;
               var77.putFloat(this.field9666, (float)(this.method15965(var36, var37) + var42));
               this.field9666 += 4L;
               var77.putFloat(this.field9666, (float)var37);
               this.field9666 += 4L;
               var77.putFloat(this.field9666, (float)var36);
               this.field9666 += 4L;
               var77.putFloat(this.field9666, (float)var37);
               this.field9666 += 4L;
               if (this.field9665 != null) {
                  var77.putFloat(this.field9666, var13 != null ? (float)(var13[var35] - 1) : 0.0F);
                  this.field9666 += 4L;
               }

               if ((this.field9671 & 7) != 0) {
                  var77.putFloat(this.field9666, var50);
                  this.field9666 += 4L;
                  var77.putFloat(this.field9666, var51);
                  this.field9666 += 4L;
                  var77.putFloat(this.field9666, var52);
                  this.field9666 += 4L;
               }

               if (this.field9682.field10108 == 0) {
                  int var78 = var68 & -16711936;
                  int var79 = var78 | (var68 & 16711680) >> 16;
                  int var80 = var79 | (var68 & 255) << 16;
                  var68 = var80;
               }

               var77.putInt(this.field9667, -16777216 | var68);
               this.field9667 += 4L;
               var81 = this.field9700++;
               var34[var35] = (short)var81;
               if (var40 != -1) {
                  arg5[var81] = var7[var35];
               }

               arg4.method15311(new class103(var34[var35]), var43);
            } else {
               var34[var35] = ((class103)var66).field796;
               var81 = var34[var35] & 65535;
               if (var40 != -1 && var7[var35].field6137 < arg5[var81].field6137) {
                  arg5[var81] = var7[var35];
               }
            }

            for(int var82 = 0; var82 < var30; ++var82) {
               arg3[var82].method1362(var81, var48, var53, var49);
            }

            ++this.field9690;
         }

      }
   }

   @deob.ObfuscatedName("yj.d(III[[ZZI)V")
   public void method7262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      if (this.field9687 != null) {
         int var7 = arg2 + arg2 + 1;
         int var8 = var7 * var7;
         if (this.field9707.length < var8) {
            this.field9707 = new int[var8];
         }

         int var9 = arg0 - arg2;
         int var10 = var9;
         if (var9 < 0) {
            var9 = 0;
         }

         int var11 = arg1 - arg2;
         int var12 = var11;
         if (var11 < 0) {
            var11 = 0;
         }

         int var13 = arg0 + arg2;
         if (var13 > this.field9463 - 1) {
            var13 = this.field9463 - 1;
         }

         int var14 = arg1 + arg2;
         if (var14 > this.field9461 - 1) {
            var14 = this.field9461 - 1;
         }

         this.field9706 = 0;

         for(int var15 = var9; var15 <= var13; ++var15) {
            boolean[] var16 = arg3[var15 - var10];

            for(int var17 = var11; var17 <= var14; ++var17) {
               if (var16[var17 - var12]) {
                  this.field9707[this.field9706++] = this.field9463 * var17 + var15;
               }
            }
         }

         ByteBuffer var18 = this.field9682.field9975;
         var18.clear();

         for(int var19 = 0; var19 < this.field9687.length; ++var19) {
            class101 var20 = (class101)this.field9687[var19];
            var20.method1352(this.field9707, this.field9706);
         }

         int var21 = var18.position();
         class447 var22 = this.field9682.field10033;
         if (var21 != 0) {
            class534 var23 = this.field9682.method16446(var21 / 2);
            var23.method700(0, var21, this.field9682.field9976);
            this.field9682.method16383();
            this.field9682.method2539(0, this.field9669);
            this.field9682.method2624(var23);
            var22.method212(class597.field5414);
            if (this.field9682.field10065 > 0) {
               var22.field3695.method8356(0.0F, 0.0F, 1.0F, -this.field9682.field10109);
               var22.field3685.method8141((float)(this.field9682.field10112 >> 16 & 255) / 255.0F, (float)(this.field9682.field10112 >> 8 & 255) / 255.0F, (float)(this.field9682.field10112 >> 0 & 255) / 255.0F);
               this.field9682.field9995.method8386(this.field9682.field10066);
               this.field9682.field9995.method8419();
               var22.field3695.method8368(this.field9682.field9995);
               var22.field3695.method8369(1.0F / (this.field9682.field10060 - this.field9682.field10109));
            } else {
               var22.field3695.method8356(0.0F, 0.0F, 0.0F, 0.0F);
               var22.field3685.method8141(0.0F, 0.0F, 0.0F);
            }

            if ((this.field9671 & 7) == 0) {
               int var24 = 0;

               for(int var25 = 0; var25 < this.field9687.length; ++var25) {
                  class101 var26 = (class101)this.field9687[var25];
                  if (var26.field783 != 0) {
                     if (this.field9682.field10088) {
                        this.field9682.method7562(0, var26.field787);
                        var22.field3689.method8356(0.0F, 1.0F, 0.0F, (float)var26.field787.field2962 / 255.0F * (float)var26.field787.field2964 + (float)this.field9682.field9963);
                        var22.field3689.method8369(1.0F / (float)var26.field787.field2964);
                        var22.field3694.method8141((float)(var26.field787.field2965 >> 16 & 255) / 255.0F, (float)(var26.field787.field2965 >> 8 & 255) / 255.0F, (float)(var26.field787.field2965 >> 0 & 255) / 255.0F);
                     } else {
                        var22.field3689.method8356(0.0F, 0.0F, 0.0F, 0.0F);
                        var22.field3694.method8141(0.0F, 0.0F, 0.0F);
                     }

                     boolean var27 = false;
                     if (var26.field778 != -1) {
                        var22.field3687 = this.field9682.field10067.method7115(var26.field778);
                        class360 var28 = this.field9682.field7118.method5112(var26.field778);
                        var27 = !class360.method9505(var28.field2324);
                     } else {
                        var22.field3687 = this.field9682.field10068;
                     }

                     this.field9682.method2539(1, var26.field781);
                     this.field9682.method2572(this.field9692);
                     var22.field3696.method8392(1.0F / var26.field779, 1.0F / var26.field779, 1.0F, 1.0F);
                     var22.field3702 = var26.field776;
                     var22.field3703 = var26.field786 - var26.field776 + 1;
                     var22.field3686 = var24;
                     var22.field3705 = var26.field783 / 3;
                     var22.method231(var27);
                     var24 += var26.field783;
                  }
               }
            } else {
               var22.field3697.method8141(this.field9682.field10042[0], this.field9682.field10042[1], this.field9682.field10042[2]);
               var22.field3688.method8141(this.field9682.field10051 * this.field9682.field10047, this.field9682.field10051 * this.field9682.field10048, this.field9682.field10058 * this.field9682.field10051);
               var22.field3699.method8141(-this.field9682.field9996 * this.field9682.field10047, -this.field9682.field9996 * this.field9682.field10048, -this.field9682.field9996 * this.field9682.field10058);
               var22.field3690.method8141(this.field9682.field10050 * this.field9682.field10047, this.field9682.field10050 * this.field9682.field10048, this.field9682.field10058 * this.field9682.field10050);
               int var29 = 0;

               for(int var30 = 0; var30 < this.field9687.length; ++var30) {
                  class101 var31 = (class101)this.field9687[var30];
                  if (var31.field783 > 0) {
                     if (this.field9682.field10088) {
                        this.field9682.method7562(0, var31.field787);
                        float var32 = 0.15F;
                        var22.field3689.method8356(0.0F, 1.0F / ((float)var31.field787.field2964 * var32), 0.0F, 256.0F / ((float)var31.field787.field2964 * var32));
                        var22.field3694.method8141((float)(var31.field787.field2965 >> 16 & 255) / 255.0F, (float)(var31.field787.field2965 >> 8 & 255) / 255.0F, (float)(var31.field787.field2965 >> 0 & 255) / 255.0F);
                     } else {
                        var22.field3689.method8356(0.0F, 0.0F, 0.0F, 0.0F);
                        var22.field3694.method8141(0.0F, 0.0F, 0.0F);
                     }

                     byte var33 = 11;
                     if (var31.field778 != -1) {
                        class360 var34 = this.field9682.field7118.method5112(var31.field778);
                        var33 = var34.field2324;
                        var22.field3687 = this.field9682.field10067.method7115(var31.field778);
                        var22.method6259(var34);
                     } else {
                        var22.field3687 = this.field9682.field10068;
                     }

                     this.field9682.method2539(1, var31.field781);
                     this.field9682.method2572(this.field9692);
                     var22.field3696.method8392(1.0F / var31.field779, 1.0F / var31.field779, 1.0F, 1.0F);
                     var22.field3702 = var31.field776;
                     var22.field3703 = var31.field786 - var31.field776 + 1;
                     var22.field3686 = var29;
                     var22.field3705 = var31.field783 / 3;
                     switch(var33) {
                     case 1:
                        var22.field3698.method8141(this.field9682.field9970.field5413[12], this.field9682.field9970.field5413[13], this.field9682.field9970.field5413[14]);
                        if (this.field9682.field10088) {
                           var22.method216();
                        } else {
                           var22.method222(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if (!this.field9682.field9973 && (this.field9671 & 8) != 0 && this.field9682.field10081.method2840()) {
                           class203 var35 = this.field9682.field10081;
                           if (var33 == 2) {
                              var35 = this.field9682.field10125;
                           }

                           var35.field1358.method8386(this.field9682.field10076);
                           var35.field1339.method8392(1.0F / ((float)var31.field787.field2961 * var31.field779), 1.0F / ((float)var31.field787.field2961 * var31.field779), 1.0F, 1.0F);
                           var35.field1341.method8141(this.field9682.field9970.field5413[12], this.field9682.field9970.field5413[13], this.field9682.field9970.field5413[14]);
                           class360 var36 = this.field9682.field7118.method5112(var31.field778);
                           var35.field1342 = var36.field2325;
                           var35.field1357 = var31.field776;
                           var35.field1332 = var31.field786 - var31.field776 + 1;
                           var35.field1337 = var29;
                           var35.field1353 = var31.field783 / 3;
                           var35.field1361.method8357(var22.field3689);
                           var35.field1352.method8177(var22.field3694);
                           var35.field1354.method8357(var22.field3695);
                           var35.field1356.method8177(var22.field3685);
                           var35.method2841();
                        } else {
                           var22.method215(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if (this.field9682.field10088) {
                           var22.method218();
                        } else {
                           var22.method215(0);
                        }
                        break;
                     case 6:
                        var22.method231(!class360.method9505(var33));
                        break;
                     case 7:
                        var22.field3698.method8141(this.field9682.field9970.field5413[12], this.field9682.field9970.field5413[13], this.field9682.field9970.field5413[14]);
                        var22.field3701.method8480();
                        var22.field3683 = this.field9682.method16497();
                        var22.method217(0);
                     }

                     var29 += var31.field783;
                  }
               }
            }
         }

         if (this.field9685 != null) {
            this.field9682.method16521(1);
            this.field9682.method2539(0, this.field9669);
            this.field9682.method2539(1, this.field9689);
            this.field9682.method2572(this.field9692);
            this.field9685.method7214(var22, arg0, arg1, arg2, arg3, arg4);
         }
      }

   }

   @deob.ObfuscatedName("yj.b(IIIIIII[[Z)V")
   public void method7288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      if (this.field9691 > 0) {
         class534 var9 = this.field9682.method16446(this.field9690);
         int var10 = 0;
         int var11 = 32767;
         int var12 = -32768;
         ByteBuffer var13 = this.field9682.field9975;
         var13.clear();

         for(int var14 = arg4; var14 < arg6; ++var14) {
            int var15 = this.field9463 * var14 + arg3;

            for(int var16 = arg3; var16 < arg5; ++var16) {
               if (arg7[var16 - arg3][var14 - arg4]) {
                  short[] var17 = this.field9674[var15];
                  if (var17 != null) {
                     for(int var18 = 0; var18 < var17.length; ++var18) {
                        int var19 = var17[var18] & 65535;
                        if (var19 > var12) {
                           var12 = var19;
                        }

                        if (var19 < var11) {
                           var11 = var19;
                        }

                        var13.putShort((short)var19);
                        ++var10;
                     }
                  }
               }

               ++var15;
            }
         }

         var9.method700(0, var13.position(), this.field9682.field9976);
         if (var10 > 0) {
            this.field9682.method16383();
            class447 var20 = this.field9682.field10033;
            this.field9682.method2539(0, this.field9669);
            this.field9682.method2539(1, this.field9689);
            this.field9682.method2572(this.field9692);
            this.field9682.method2624(var9);
            this.field9682.method7778(class583.field5325);
            float var21 = (float)this.field9682.method11517().method566();
            float var22 = (float)this.field9682.method11517().method559();
            class583 var23 = new class583();
            class583 var24 = new class583();
            var23.method8062(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
            var24.method8069((float)arg2 / ((float)this.field9460 * 256.0F), (float)(-arg2) / ((float)this.field9460 * 256.0F), 1.0F / (this.field9676 - this.field9675));
            var24.method8072((float)arg0 - (float)(arg2 * arg3) / 256.0F, (float)(arg2 * arg6) / 256.0F + (float)arg1, -this.field9675 / (this.field9676 - this.field9675));
            var24.method8070(2.0F / var21, 2.0F / var22, 1.0F);
            var24.method8072(-1.0F, -1.0F, 0.0F);
            this.field9682.field9994.method8074(var23, var24);
            this.field9682.field9995.method8391(this.field9682.field9994);
            this.field9682.method7545(this.field9682.field9995);
            var20.method212(class597.field5414);
            var20.field3695.method8356(0.0F, 0.0F, 0.0F, 0.0F);
            var20.field3685.method8141(0.0F, 0.0F, 0.0F);
            var20.field3689.method8356(0.0F, 0.0F, 0.0F, 0.0F);
            var20.field3694.method8141(0.0F, 0.0F, 0.0F);
            var20.field3687 = this.field9682.field10068;
            var20.field3696.method8480();
            var20.field3702 = var11;
            var20.field3703 = var12 - var11 + 1;
            var20.field3686 = 0;
            var20.field3705 = var10 / 3;
            if (this.field9682.field10036) {
               this.field9682.method7551(false);
               var20.method231(false);
               this.field9682.method7551(true);
            } else {
               var20.method231(false);
            }
         }

      }
   }

   @deob.ObfuscatedName("yj.w(IILna;)Lna;")
   public class664 method7253(int arg0, int arg1, class664 arg2) {
      if ((this.field9684[arg0][arg1] & 1) == 0) {
         return null;
      } else {
         int var4 = this.field9460 >> this.field9682.field10057;
         class300 var5 = (class300)arg2;
         class300 var6;
         if (var5 != null && var5.method3857(var4, var4)) {
            var6 = var5;
            var5.method3858();
         } else {
            var6 = new class300(this.field9682, var4, var4);
         }

         var6.method3855(0, 0, var4, var4);
         this.method16107(var6, arg0, arg1);
         return var6;
      }
   }

   @deob.ObfuscatedName("yj.ab(Lala;II)V")
   private void method16107(class300 arg0, int arg1, int arg2) {
      int[] var4 = this.field9696[arg1][arg2];
      int[] var5 = this.field9695[arg1][arg2];
      int var6 = var4.length;
      if (this.field9704.length < var6) {
         this.field9704 = new int[var6];
         this.field9705 = new int[var6];
      }

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field9704[var7] = var4[var7] >> this.field9682.field10057;
         this.field9705[var7] = var5[var7] >> this.field9682.field10057;
      }

      int var8 = 0;

      while(var8 < var6) {
         int var9 = this.field9704[var8];
         int var10 = this.field9705[var8++];
         int var11 = this.field9704[var8];
         int var12 = this.field9705[var8++];
         int var13 = this.field9704[var8];
         int var14 = this.field9705[var8++];
         if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
            arg0.method3856(var10, var12, var14, var9, var11, var13);
         }
      }

   }

   @deob.ObfuscatedName("yj.o(Lna;IIIIZ)Z")
   public boolean method7278(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (this.field9685 != null && arg0 != null) {
         int var7 = arg1 - (this.field9682.field10019 * arg2 >> 8) >> this.field9682.field10057;
         int var8 = arg3 - (this.field9682.field9993 * arg2 >> 8) >> this.field9682.field10057;
         return this.field9685.method7217(arg0, var7, var8);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("yj.UA(Lna;IIIIZ)V")
   public void method7251(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (this.field9685 != null && arg0 != null) {
         int var7 = arg1 - (this.field9682.field10019 * arg2 >> 8) >> this.field9682.field10057;
         int var8 = arg3 - (this.field9682.field9993 * arg2 >> 8) >> this.field9682.field10057;
         this.field9685.method7224(arg0, var7, var8);
      }
   }

   @deob.ObfuscatedName("yj.NA(Lna;IIIIZ)V")
   public void method7255(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (this.field9685 != null && arg0 != null) {
         int var7 = arg1 - (this.field9682.field10019 * arg2 >> 8) >> this.field9682.field10057;
         int var8 = arg3 - (this.field9682.field9993 * arg2 >> 8) >> this.field9682.field10057;
         this.field9685.method7216(arg0, var7, var8);
      }
   }

   @deob.ObfuscatedName("yj.a(Lacy;[I)V")
   public void method7257(class81 arg0, int[] arg1) {
      this.field9686.method14959(new class96(this.field9682, this, arg0, arg1));
   }
}
