@deob.ObfuscatedName("aic")
public class class221 extends class89 {
   @deob.ObfuscatedName("aic.x")
   private int field1480 = 256;
   @deob.ObfuscatedName("aic.s")
   private int field1482 = 256;
   @deob.ObfuscatedName("aic.l")
   private int field1508 = 1000000;
   @deob.ObfuscatedName("aic.u")
   private int[] field1505 = new int[16];
   @deob.ObfuscatedName("aic.v")
   private int[] field1484 = new int[16];
   @deob.ObfuscatedName("aic.g")
   private int[] field1485 = new int[16];
   @deob.ObfuscatedName("aic.h")
   private int[] field1486 = new int[16];
   @deob.ObfuscatedName("aic.e")
   private int[] field1487 = new int[16];
   @deob.ObfuscatedName("aic.z")
   private int[] field1488 = new int[16];
   @deob.ObfuscatedName("aic.m")
   private int[] field1495 = new int[16];
   @deob.ObfuscatedName("aic.i")
   private int[] field1479 = new int[16];
   @deob.ObfuscatedName("aic.t")
   private int[] field1491 = new int[16];
   @deob.ObfuscatedName("aic.c")
   private int[] field1492 = new int[16];
   @deob.ObfuscatedName("aic.j")
   public int[] field1512 = new int[16];
   @deob.ObfuscatedName("aic.f")
   private int[] field1497 = new int[16];
   @deob.ObfuscatedName("aic.ai")
   private int[] field1489 = new int[16];
   @deob.ObfuscatedName("aic.ap")
   public int[] field1499 = new int[16];
   @deob.ObfuscatedName("aic.av")
   private int[] field1500 = new int[16];
   @deob.ObfuscatedName("aic.ax")
   public int[] field1501 = new int[16];
   @deob.ObfuscatedName("aic.af")
   private class82[][] field1502 = new class82[16][128];
   @deob.ObfuscatedName("aic.at")
   private class82[][] field1503 = new class82[16][128];
   @deob.ObfuscatedName("aic.ah")
   private class433 field1504 = new class433();
   @deob.ObfuscatedName("aic.aa")
   private class219 field1493 = new class219(this);
   @deob.ObfuscatedName("aic.a")
   private class875 field1483;
   @deob.ObfuscatedName("aic.al")
   private int field1506;
   @deob.ObfuscatedName("aic.an")
   private int field1507;
   @deob.ObfuscatedName("aic.ab")
   private int field1513;
   @deob.ObfuscatedName("aic.ak")
   private long field1481;
   @deob.ObfuscatedName("aic.ag")
   private long field1498;
   @deob.ObfuscatedName("aic.ao")
   private class71 field1511;
   @deob.ObfuscatedName("aic.ae")
   private boolean field1496;
   @deob.ObfuscatedName("aic.aw")
   private boolean field1509;

   public class221(class221 arg0) {
      this.field1483 = arg0.field1483;
      this.method2969(-1, 256);
      this.method2990(true);
   }

   public class221() {
      this.field1483 = new class875(128);
      this.method2969(-1, 256);
      this.method2990(true);
   }

   @deob.ObfuscatedName("aic.ak(IB)V")
   public synchronized void method2966(int arg0) {
      this.field1480 = arg0;
   }

   @deob.ObfuscatedName("aic.aa(I)I")
   public int method2965() {
      return this.field1480;
   }

   @deob.ObfuscatedName("aic.ao(II)V")
   public synchronized void method2968(int arg0) {
      this.field1482 = arg0;
   }

   @deob.ObfuscatedName("aic.ab(IIB)V")
   public synchronized void method2969(int arg0, int arg1) {
      if (arg0 < 0) {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.field1505[var3] = arg1;
         }
      } else {
         this.field1505[arg0] = arg1;
      }

   }

   @deob.ObfuscatedName("aic.ae(Laco;Llc;Lms;II)Z")
   public synchronized boolean method2970(class71 arg0, class612 arg1, class655 arg2, int arg3) {
      arg0.method1024();
      boolean var5 = true;
      int[] var6 = null;
      if (arg3 > 0) {
         var6 = new int[]{arg3};
      }

      for(class106 var7 = (class106)arg0.field518.method15313(); var7 != null; var7 = (class106)arg0.field518.method15314()) {
         int var8 = (int)var7.field6137;
         class63 var9 = (class63)this.field1483.method15322((long)var8);
         if (var9 == null) {
            var9 = class63.method15718(arg1, var8);
            if (var9 == null) {
               var5 = false;
               continue;
            }

            this.field1483.method15311(var9, (long)var8);
         }

         if (!var9.method965(arg2, (byte[])((byte[])var7.field807), var6)) {
            var5 = false;
         }
      }

      if (var5) {
         arg0.method1023();
      }

      return var5;
   }

   @deob.ObfuscatedName("aic.az(I)V")
   public synchronized void method2971() {
      for(class63 var1 = (class63)this.field1483.method15313(); var1 != null; var1 = (class63)this.field1483.method15314()) {
         var1.method961();
      }

   }

   @deob.ObfuscatedName("aic.aq(I)V")
   public synchronized void method2972() {
      for(class63 var1 = (class63)this.field1483.method15313(); var1 != null; var1 = (class63)this.field1483.method15314()) {
         var1.method9864();
      }

   }

   @deob.ObfuscatedName("aic.ar(Laco;ZI)V")
   public synchronized void method3008(class71 arg0, boolean arg1) {
      this.method2974(arg0, arg1, true);
   }

   @deob.ObfuscatedName("aic.as(Laco;ZZI)V")
   private synchronized void method2974(class71 arg0, boolean arg1, boolean arg2) {
      this.method2977(arg2);
      this.field1504.method5972(arg0.field519);
      this.field1509 = arg1;
      this.field1498 = 0L;
      int var4 = this.field1504.method5977();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field1504.method5976(var5);
         this.field1504.method5979(var5);
         this.field1504.method5996(var5);
      }

      this.field1506 = this.field1504.method5978();
      this.field1507 = this.field1504.field3605[this.field1506];
      this.field1481 = this.field1504.method5983(this.field1507);
   }

   @deob.ObfuscatedName("aic.au(Laco;ZZJ)V")
   public synchronized void method2975(class71 arg0, boolean arg1, boolean arg2, long arg3) {
      this.method2974(arg0, arg1, arg2);
      this.method3000((long)this.field1504.field3604 * arg3);
   }

   @deob.ObfuscatedName("aic.ad(B)V")
   public synchronized void method3056() {
      this.method2977(true);
   }

   @deob.ObfuscatedName("aic.am(ZB)V")
   private synchronized void method2977(boolean arg0) {
      this.field1504.method5973();
      this.field1511 = null;
      this.method2990(arg0);
   }

   @deob.ObfuscatedName("aic.aj(B)Z")
   public synchronized boolean method2978() {
      return this.field1504.method5974();
   }

   @deob.ObfuscatedName("aic.ac(III)V")
   public synchronized void method2979(int arg0, int arg1) {
      this.method2980(arg0, arg1);
   }

   @deob.ObfuscatedName("aic.ay(IIB)V")
   private void method2980(int arg0, int arg1) {
      this.field1487[arg0] = arg1;
      this.field1495[arg0] = arg1 & -128;
      this.method3060(arg0, arg1);
   }

   @deob.ObfuscatedName("aic.bf(III)V")
   private void method3060(int arg0, int arg1) {
      if (this.field1488[arg0] != arg1) {
         this.field1488[arg0] = arg1;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field1503[arg0][var3] = null;
         }
      }

   }

   @deob.ObfuscatedName("aic.bp(IIIB)V")
   private void method2982(int arg0, int arg1, int arg2) {
      this.method2999(arg0, arg1, 64);
      if ((this.field1512[arg0] & 2) != 0) {
         for(class82 var4 = (class82)this.field1493.field1473.method14976(); var4 != null; var4 = (class82)this.field1493.field1473.method15010()) {
            if (var4.field589 == arg0 && var4.field588 < 0) {
               this.field1502[arg0][var4.field603] = null;
               this.field1502[arg0][arg1] = var4;
               int var5 = (var4.field599 * var4.field593 >> 12) + var4.field583;
               var4.field583 += arg1 - var4.field603 << 8;
               var4.field599 = var5 - var4.field583;
               var4.field593 = 4096;
               var4.field603 = arg1;
               return;
            }
         }
      }

      class63 var6 = (class63)this.field1483.method15322((long)this.field1488[arg0]);
      if (var6 != null) {
         class224 var7 = var6.field445[arg1];
         if (var7 != null) {
            class82 var8 = new class82();
            var8.field589 = arg0;
            var8.field584 = var6;
            var8.field585 = var7;
            var8.field586 = var6.field446[arg1];
            var8.field587 = var6.field444[arg1];
            var8.field603 = arg1;
            var8.field591 = var6.field447 * arg2 * arg2 * var6.field449[arg1] + 1024 >> 11;
            var8.field590 = var6.field448[arg1] & 255;
            var8.field583 = (arg1 << 8) - (var6.field451[arg1] & 32767);
            var8.field592 = 0;
            var8.field595 = 0;
            var8.field596 = 0;
            var8.field588 = -1;
            var8.field598 = 0;
            if (this.field1499[arg0] == 0) {
               var8.field597 = var7.method3111(this.method2995(var8), this.method2996(var8), this.method2997(var8));
            } else {
               var8.field597 = var7.method3111(this.method2995(var8), 0, this.method2997(var8));
               this.method3055(var8, var6.field451[arg1] < 0);
            }

            if (var6.field451[arg1] < 0) {
               var8.field597.method3313(-1);
            }

            if (var8.field587 >= 0) {
               class82 var9 = this.field1503[arg0][var8.field587];
               if (var9 != null && var9.field588 < 0) {
                  this.field1502[arg0][var9.field603] = null;
                  var9.field588 = 0;
               }

               this.field1503[arg0][var8.field587] = var8;
            }

            this.field1493.field1473.method14959(var8);
            this.field1502[arg0][arg1] = var8;
         }
      }
   }

   @deob.ObfuscatedName("aic.bs(Lacz;ZI)V")
   public void method3055(class82 arg0, boolean arg1) {
      int var3 = arg0.field585.method3113();
      int var5;
      if (arg1 && arg0.field585.field1523) {
         int var4 = var3 + var3 - arg0.field585.field1521;
         var5 = (int)((long)this.field1499[arg0.field589] * (long)var4 >> 6);
         int var6 = var3 << 8;
         if (var5 >= var6) {
            var5 = var6 + var6 - 1 - var5;
            arg0.field597.method3255(true);
         }
      } else {
         var5 = (int)((long)this.field1499[arg0.field589] * (long)var3 >> 6);
      }

      arg0.field597.method3254(var5);
   }

   @deob.ObfuscatedName("aic.br(IIII)V")
   private void method2999(int arg0, int arg1, int arg2) {
      class82 var4 = this.field1502[arg0][arg1];
      if (var4 != null) {
         this.field1502[arg0][arg1] = null;
         if ((this.field1512[arg0] & 2) != 0) {
            for(class82 var5 = (class82)this.field1493.field1473.method14964(); var5 != null; var5 = (class82)this.field1493.field1473.method15006()) {
               if (var4.field589 == var5.field589 && var5.field588 < 0 && var4 != var5) {
                  var4.field588 = 0;
                  break;
               }
            }
         } else {
            var4.field588 = 0;
         }

      }
   }

   @deob.ObfuscatedName("aic.ba(IIII)V")
   private void method2984(int arg0, int arg1, int arg2) {
   }

   @deob.ObfuscatedName("aic.bg(IIS)V")
   private void method2985(int arg0, int arg1) {
   }

   @deob.ObfuscatedName("aic.bc(III)V")
   private void method2986(int arg0, int arg1) {
      this.field1479[arg0] = arg1;
   }

   @deob.ObfuscatedName("aic.bw(IS)V")
   private void method2987(int arg0) {
      for(class82 var2 = (class82)this.field1493.field1473.method14964(); var2 != null; var2 = (class82)this.field1493.field1473.method15006()) {
         if (arg0 < 0 || var2.field589 == arg0) {
            if (var2.field597 != null) {
               var2.field597.method3260(Statics.field5854 / 100);
               if (var2.field597.method3246()) {
                  this.field1493.field1474.method3107(var2.field597);
               }

               var2.method1136();
            }

            if (var2.field588 < 0) {
               this.field1502[var2.field589][var2.field603] = null;
            }

            var2.method9864();
         }
      }

   }

   @deob.ObfuscatedName("aic.bq(II)V")
   private void method2988(int arg0) {
      if (arg0 >= 0) {
         this.field1484[arg0] = 12800;
         this.field1485[arg0] = 8192;
         this.field1486[arg0] = 16383;
         this.field1479[arg0] = 8192;
         this.field1491[arg0] = 0;
         this.field1492[arg0] = 8192;
         this.method2991(arg0);
         this.method2992(arg0);
         this.field1512[arg0] = 0;
         this.field1497[arg0] = 32767;
         this.field1489[arg0] = 256;
         this.field1499[arg0] = 0;
         this.method2994(arg0, 8192);
      } else {
         for(int var2 = 0; var2 < 16; ++var2) {
            this.method2988(var2);
         }

      }
   }

   @deob.ObfuscatedName("aic.by(II)V")
   private void method3035(int arg0) {
      for(class82 var2 = (class82)this.field1493.field1473.method14964(); var2 != null; var2 = (class82)this.field1493.field1473.method15006()) {
         if ((arg0 < 0 || var2.field589 == arg0) && var2.field588 < 0) {
            this.field1502[var2.field589][var2.field603] = null;
            var2.field588 = 0;
         }
      }

   }

   @deob.ObfuscatedName("aic.bx(ZI)V")
   private void method2990(boolean arg0) {
      if (arg0) {
         this.method2987(-1);
      } else {
         this.method3035(-1);
      }

      this.method2988(-1);

      for(int var2 = 0; var2 < 16; ++var2) {
         this.field1488[var2] = this.field1487[var2];
      }

      for(int var3 = 0; var3 < 16; ++var3) {
         this.field1495[var3] = this.field1487[var3] & -128;
      }

   }

   @deob.ObfuscatedName("aic.bm(II)V")
   private void method2991(int arg0) {
      if ((this.field1512[arg0] & 2) != 0) {
         for(class82 var2 = (class82)this.field1493.field1473.method14964(); var2 != null; var2 = (class82)this.field1493.field1473.method15006()) {
            if (var2.field589 == arg0 && this.field1502[arg0][var2.field603] == null && var2.field588 < 0) {
               var2.field588 = 0;
            }
         }
      }

   }

   @deob.ObfuscatedName("aic.bh(II)V")
   private void method2992(int arg0) {
      if ((this.field1512[arg0] & 4) != 0) {
         for(class82 var2 = (class82)this.field1493.field1473.method14964(); var2 != null; var2 = (class82)this.field1493.field1473.method15006()) {
            if (var2.field589 == arg0) {
               var2.field604 = 0;
            }
         }
      }

   }

   @deob.ObfuscatedName("aic.bn(II)V")
   private void method2993(int arg0) {
      int var2 = arg0 & 240;
      if (var2 == 128) {
         int var3 = arg0 & 15;
         int var4 = arg0 >> 8 & 127;
         int var5 = arg0 >> 16 & 127;
         this.method2999(var3, var4, var5);
      } else if (var2 == 144) {
         int var6 = arg0 & 15;
         int var7 = arg0 >> 8 & 127;
         int var8 = arg0 >> 16 & 127;
         if (var8 > 0) {
            this.method2982(var6, var7, var8);
         } else {
            this.method2999(var6, var7, 64);
         }

      } else if (var2 == 160) {
         int var9 = arg0 & 15;
         int var10 = arg0 >> 8 & 127;
         int var11 = arg0 >> 16 & 127;
         this.method2984(var9, var10, var11);
      } else if (var2 == 176) {
         int var12 = arg0 & 15;
         int var13 = arg0 >> 8 & 127;
         int var14 = arg0 >> 16 & 127;
         if (var13 == 0) {
            this.field1495[var12] = (var14 << 14) + (this.field1495[var12] & -2080769);
         }

         if (var13 == 32) {
            this.field1495[var12] = (var14 << 7) + (this.field1495[var12] & -16257);
         }

         if (var13 == 1) {
            this.field1491[var12] = (var14 << 7) + (this.field1491[var12] & -16257);
         }

         if (var13 == 33) {
            this.field1491[var12] = (this.field1491[var12] & -128) + var14;
         }

         if (var13 == 5) {
            this.field1492[var12] = (var14 << 7) + (this.field1492[var12] & -16257);
         }

         if (var13 == 37) {
            this.field1492[var12] = (this.field1492[var12] & -128) + var14;
         }

         if (var13 == 7) {
            this.field1484[var12] = (var14 << 7) + (this.field1484[var12] & -16257);
         }

         if (var13 == 39) {
            this.field1484[var12] = (this.field1484[var12] & -128) + var14;
         }

         if (var13 == 10) {
            this.field1485[var12] = (var14 << 7) + (this.field1485[var12] & -16257);
         }

         if (var13 == 42) {
            this.field1485[var12] = (this.field1485[var12] & -128) + var14;
         }

         if (var13 == 11) {
            this.field1486[var12] = (var14 << 7) + (this.field1486[var12] & -16257);
         }

         if (var13 == 43) {
            this.field1486[var12] = (this.field1486[var12] & -128) + var14;
         }

         if (var13 == 64) {
            if (var14 >= 64) {
               this.field1512[var12] |= 1;
            } else {
               this.field1512[var12] &= -2;
            }
         }

         if (var13 == 65) {
            if (var14 >= 64) {
               this.field1512[var12] |= 2;
            } else {
               this.method2991(var12);
               this.field1512[var12] &= -3;
            }
         }

         if (var13 == 99) {
            this.field1497[var12] = (var14 << 7) + (this.field1497[var12] & 127);
         }

         if (var13 == 98) {
            this.field1497[var12] = (this.field1497[var12] & 16256) + var14;
         }

         if (var13 == 101) {
            this.field1497[var12] = (var14 << 7) + (this.field1497[var12] & 127) + 16384;
         }

         if (var13 == 100) {
            this.field1497[var12] = (this.field1497[var12] & 16256) + 16384 + var14;
         }

         if (var13 == 120) {
            this.method2987(var12);
         }

         if (var13 == 121) {
            this.method2988(var12);
         }

         if (var13 == 123) {
            this.method3035(var12);
         }

         if (var13 == 6) {
            int var15 = this.field1497[var12];
            if (var15 == 16384) {
               this.field1489[var12] = (var14 << 7) + (this.field1489[var12] & -16257);
            }
         }

         if (var13 == 38) {
            int var16 = this.field1497[var12];
            if (var16 == 16384) {
               this.field1489[var12] = (this.field1489[var12] & -128) + var14;
            }
         }

         if (var13 == 16) {
            this.field1499[var12] = (var14 << 7) + (this.field1499[var12] & -16257);
         }

         if (var13 == 48) {
            this.field1499[var12] = (this.field1499[var12] & -128) + var14;
         }

         if (var13 == 81) {
            if (var14 >= 64) {
               this.field1512[var12] |= 4;
            } else {
               this.method2992(var12);
               this.field1512[var12] &= -5;
            }
         }

         if (var13 == 17) {
            this.method2994(var12, (var14 << 7) + (this.field1500[var12] & -16257));
         }

         if (var13 == 49) {
            this.method2994(var12, (this.field1500[var12] & -128) + var14);
         }

      } else if (var2 == 192) {
         int var17 = arg0 & 15;
         int var18 = arg0 >> 8 & 127;
         this.method3060(var17, this.field1495[var17] + var18);
      } else if (var2 == 208) {
         int var19 = arg0 & 15;
         int var20 = arg0 >> 8 & 127;
         this.method2985(var19, var20);
      } else if (var2 == 224) {
         int var21 = arg0 & 15;
         int var22 = (arg0 >> 9 & 16256) + (arg0 >> 8 & 127);
         this.method2986(var21, var22);
      } else {
         int var23 = arg0 & 255;
         if (var23 == 255) {
            this.method2990(true);
         }
      }
   }

   @deob.ObfuscatedName("aic.bk(IIB)V")
   private void method2994(int arg0, int arg1) {
      this.field1500[arg0] = arg1;
      this.field1501[arg0] = (int)(2097152.0D * Math.pow(2.0D, (double)arg1 * 5.4931640625E-4D) + 0.5D);
   }

   @deob.ObfuscatedName("aic.bo(Lacz;I)I")
   private int method2995(class82 arg0) {
      int var2 = (arg0.field599 * arg0.field593 >> 12) + arg0.field583;
      int var3 = ((this.field1479[arg0.field589] - 8192) * this.field1489[arg0.field589] >> 12) + var2;
      class423 var4 = arg0.field586;
      if (var4.field3313 > 0 && (var4.field3312 > 0 || this.field1491[arg0.field589] > 0)) {
         int var5 = var4.field3312 << 2;
         int var6 = var4.field3314 << 1;
         if (arg0.field601 < var6) {
            var5 = arg0.field601 * var5 / var6;
         }

         int var7 = (this.field1491[arg0.field589] >> 7) + var5;
         double var8 = Math.sin((double)(arg0.field600 & 511) * 0.01227184630308513D);
         var3 += (int)((double)var7 * var8);
      }

      int var10 = (int)((double)(arg0.field585.field1520 * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)Statics.field5854 + 0.5D);
      return var10 < 1 ? 1 : var10;
   }

   @deob.ObfuscatedName("aic.bj(Lacz;I)I")
   private int method2996(class82 arg0) {
      if (this.field1505[arg0.field589] == 0) {
         return 0;
      } else {
         class423 var2 = arg0.field586;
         int var3 = this.field1486[arg0.field589] * this.field1484[arg0.field589] + 4096 >> 13;
         int var4 = var3 * var3 + 16384 >> 15;
         int var5 = arg0.field591 * var4 + 16384 >> 15;
         int var6 = this.field1480 * var5 + 128 >> 8;
         int var7 = this.field1482 * var6 >> 8;
         int var8 = this.field1505[arg0.field589] * var7 + 128 >> 8;
         if (var2.field3308 > 0) {
            var8 = (int)((double)var8 * Math.pow(0.5D, (double)arg0.field592 * 1.953125E-5D * (double)var2.field3308) + 0.5D);
         }

         if (var2.field3307 != null) {
            int var9 = arg0.field595;
            int var10 = var2.field3307[arg0.field596 + 1];
            if (arg0.field596 < var2.field3307.length - 2) {
               int var11 = (var2.field3307[arg0.field596] & 255) << 8;
               int var12 = (var2.field3307[arg0.field596 + 2] & 255) << 8;
               var10 += (var2.field3307[arg0.field596 + 3] - var10) * (var9 - var11) / (var12 - var11);
            }

            var8 = var8 * var10 + 32 >> 6;
         }

         if (arg0.field588 > 0 && var2.field3311 != null) {
            int var13 = arg0.field588;
            int var14 = var2.field3311[arg0.field598 + 1];
            if (arg0.field598 < var2.field3311.length - 2) {
               int var15 = (var2.field3311[arg0.field598] & 255) << 8;
               int var16 = (var2.field3311[arg0.field598 + 2] & 255) << 8;
               var14 += (var2.field3311[arg0.field598 + 3] - var14) * (var13 - var15) / (var16 - var15);
            }

            var8 = var8 * var14 + 32 >> 6;
         }

         return var8;
      }
   }

   @deob.ObfuscatedName("aic.bv(Lacz;I)I")
   private int method2997(class82 arg0) {
      int var2 = this.field1485[arg0.field589];
      return var2 < 8192 ? arg0.field590 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field590) * (16384 - var2) + 32 >> 6);
   }

   @deob.ObfuscatedName("aic.k()Ladf;")
   public synchronized class89 method1257() {
      return this.field1493;
   }

   @deob.ObfuscatedName("aic.d()Ladf;")
   public synchronized class89 method1245() {
      return null;
   }

   @deob.ObfuscatedName("aic.b()I")
   public synchronized int method1246() {
      return 0;
   }

   @deob.ObfuscatedName("aic.p([III)V")
   public synchronized void method1244(int[] arg0, int arg1, int arg2) {
      if (this.field1504.method5974()) {
         int var4 = this.field1508 * this.field1504.field3604 / Statics.field5854;

         do {
            long var5 = (long)arg2 * (long)var4 + this.field1498;
            if (this.field1481 - var5 >= 0L) {
               this.field1498 = var5;
               break;
            }

            int var7 = (int)((this.field1481 - this.field1498 + (long)var4 - 1L) / (long)var4);
            this.field1498 += (long)var4 * (long)var7;
            this.field1493.method1244(arg0, arg1, var7);
            arg1 += var7;
            arg2 -= var7;
            this.method3087();
         } while(this.field1504.method5974());
      }

      this.field1493.method1244(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("aic.o(I)V")
   public synchronized void method1254(int arg0) {
      if (this.field1504.method5974()) {
         int var2 = this.field1508 * this.field1504.field3604 / Statics.field5854;

         do {
            long var3 = (long)arg0 * (long)var2 + this.field1498;
            if (this.field1481 - var3 >= 0L) {
               this.field1498 = var3;
               break;
            }

            int var5 = (int)((this.field1481 - this.field1498 + (long)var2 - 1L) / (long)var2);
            this.field1498 += (long)var2 * (long)var5;
            this.field1493.method1254(var5);
            arg0 -= var5;
            this.method3087();
         } while(this.field1504.method5974());
      }

      this.field1493.method1254(arg0);
   }

   @deob.ObfuscatedName("aic.bd(J)V")
   private void method3000(long arg0) {
      while(this.field1481 <= arg0) {
         int var3 = this.field1506;
         int var4 = this.field1507;
         long var5 = this.field1481;

         while(this.field1507 == var4) {
            while(this.field1504.field3605[var3] == var4) {
               this.field1504.method5976(var3);
               int var7 = this.field1504.method5975(var3);
               if (var7 == 1) {
                  this.field1504.method6006();
                  this.field1504.method5996(var3);
                  if (this.field1504.method5985()) {
                     if (!this.field1509 || var4 == 0) {
                        this.method2990(true);
                        this.field1504.method5973();
                        return;
                     }

                     this.field1504.method5988(var5);
                  }
                  break;
               }

               if ((var7 & 128) != 0 && (var7 & 240) != 144) {
                  this.method2993(var7);
               }

               this.field1504.method5979(var3);
               this.field1504.method5996(var3);
            }

            this.field1498 = var5;
            var3 = this.field1504.method5978();
            var4 = this.field1504.field3605[var3];
            var5 = this.field1504.method5983(var4);
         }

         this.field1506 = var3;
         this.field1507 = var4;
         this.field1481 = var5;
      }

   }

   @deob.ObfuscatedName("aic.bi(I)V")
   private void method3087() {
      int var1 = this.field1506;
      int var2 = this.field1507;
      long var3 = this.field1481;
      if (this.field1511 != null && this.field1513 == var2) {
         this.method2974(this.field1511, this.field1509, this.field1496);
         this.method3087();
      } else {
         while(this.field1507 == var2) {
            while(this.field1504.field3605[var1] == var2) {
               this.field1504.method5976(var1);
               int var5 = this.field1504.method5975(var1);
               if (var5 == 1) {
                  this.field1504.method6006();
                  this.field1504.method5996(var1);
                  if (this.field1504.method5985()) {
                     if (this.field1511 != null) {
                        this.method3008(this.field1511, this.field1509);
                        this.method3087();
                        return;
                     }

                     if (!this.field1509 || var2 == 0) {
                        this.method2990(true);
                        this.field1504.method5973();
                        return;
                     }

                     this.field1504.method5988(var3);
                  }
                  break;
               }

               if ((var5 & 128) != 0) {
                  this.method2993(var5);
               }

               this.field1504.method5979(var1);
               this.field1504.method5996(var1);
            }

            var1 = this.field1504.method5978();
            var2 = this.field1504.field3605[var1];
            var3 = this.field1504.method5983(var2);
         }

         this.field1506 = var1;
         this.field1507 = var2;
         this.field1481 = var3;
         if (this.field1511 != null && this.field1513 < var2) {
            this.field1506 = -1;
            this.field1507 = this.field1513;
            this.field1481 = this.field1504.method5983(this.field1507);
         }

      }
   }

   @deob.ObfuscatedName("aic.bz(Lacz;B)Z")
   public boolean method3002(class82 arg0) {
      if (arg0.field597 == null) {
         if (arg0.field588 >= 0) {
            arg0.method9864();
            if (arg0.field587 > 0 && this.field1503[arg0.field589][arg0.field587] == arg0) {
               this.field1503[arg0.field589][arg0.field587] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("aic.bt(Lacz;[IIII)Z")
   public boolean method3001(class82 arg0, int[] arg1, int arg2, int arg3) {
      arg0.field602 = Statics.field5854 / 100;
      if (arg0.field588 < 0 || arg0.field597 != null && !arg0.field597.method3256()) {
         int var5 = arg0.field593;
         if (var5 > 0) {
            int var6 = var5 - (int)(16.0D * Math.pow(2.0D, (double)this.field1492[arg0.field589] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
               var6 = 0;
            }

            arg0.field593 = var6;
         }

         arg0.field597.method3261(this.method2995(arg0));
         class423 var7 = arg0.field586;
         boolean var8 = false;
         ++arg0.field601;
         arg0.field600 += var7.field3313;
         double var9 = (double)((arg0.field603 - 60 << 8) + (arg0.field599 * arg0.field593 >> 12)) * 5.086263020833333E-6D;
         if (var7.field3308 > 0) {
            if (var7.field3306 > 0) {
               arg0.field592 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3306 * var9) + 0.5D);
            } else {
               arg0.field592 += 128;
            }

            if (arg0.field592 * var7.field3308 >= 819200) {
               var8 = true;
            }
         }

         if (var7.field3307 != null) {
            if (var7.field3309 > 0) {
               arg0.field595 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3309 * var9) + 0.5D);
            } else {
               arg0.field595 += 128;
            }

            while(arg0.field596 < var7.field3307.length - 2 && arg0.field595 > (var7.field3307[arg0.field596 + 2] & 255) << 8) {
               arg0.field596 += 2;
            }

            if (arg0.field596 == var7.field3307.length - 2 && var7.field3307[arg0.field596 + 1] == 0) {
               var8 = true;
            }
         }

         if (arg0.field588 >= 0 && var7.field3311 != null && (this.field1512[arg0.field589] & 1) == 0 && (arg0.field587 < 0 || this.field1503[arg0.field589][arg0.field587] != arg0)) {
            if (var7.field3310 > 0) {
               arg0.field588 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3310 * var9) + 0.5D);
            } else {
               arg0.field588 += 128;
            }

            while(arg0.field598 < var7.field3311.length - 2 && arg0.field588 > (var7.field3311[arg0.field598 + 2] & 255) << 8) {
               arg0.field598 += 2;
            }

            if (arg0.field598 == var7.field3311.length - 2) {
               var8 = true;
            }
         }

         if (var8) {
            arg0.field597.method3260(arg0.field602);
            if (arg1 != null) {
               arg0.field597.method1244(arg1, arg2, arg3);
            } else {
               arg0.field597.method1254(arg3);
            }

            if (arg0.field597.method3246()) {
               this.field1493.field1474.method3107(arg0.field597);
            }

            arg0.method1136();
            if (arg0.field588 >= 0) {
               arg0.method9864();
               if (arg0.field587 > 0 && this.field1503[arg0.field589][arg0.field587] == arg0) {
                  this.field1503[arg0.field589][arg0.field587] = null;
               }
            }

            return true;
         } else {
            arg0.field597.method3259(arg0.field602, this.method2996(arg0), this.method2997(arg0));
            return false;
         }
      } else {
         arg0.method1136();
         arg0.method9864();
         if (arg0.field587 > 0 && this.field1503[arg0.field589][arg0.field587] == arg0) {
            this.field1503[arg0.field589][arg0.field587] = null;
         }

         return true;
      }
   }
}
