import java.awt.Canvas;

@deob.ObfuscatedName("yx")
public class class984 extends class772 {
   @deob.ObfuscatedName("yx.j")
   private boolean field10436;
   @deob.ObfuscatedName("yx.ai")
   private boolean field10418;
   @deob.ObfuscatedName("yx.at")
   public int field10405;
   @deob.ObfuscatedName("yx.ah")
   public int field10411;
   @deob.ObfuscatedName("yx.aw")
   public int field10415;
   @deob.ObfuscatedName("yx.al")
   public int field10413;
   @deob.ObfuscatedName("yx.aa")
   public int field10417;
   @deob.ObfuscatedName("yx.ao")
   public int field10409;
   @deob.ObfuscatedName("yx.ab")
   public int field10419;
   @deob.ObfuscatedName("yx.as")
   public float[][] field10424;
   @deob.ObfuscatedName("yx.bs")
   public float field10403;
   @deob.ObfuscatedName("yx.br")
   public float field10434;
   @deob.ObfuscatedName("yx.bw")
   private class737 field10438;
   @deob.ObfuscatedName("yx.by")
   private int field10440;
   @deob.ObfuscatedName("yx.bc")
   private class737 field10437;
   @deob.ObfuscatedName("yx.ae")
   private class583 field10412;
   @deob.ObfuscatedName("yx.az")
   public class597 field10421;
   @deob.ObfuscatedName("yx.aq")
   public class597 field10426;
   @deob.ObfuscatedName("yx.ar")
   public class597 field10423;
   @deob.ObfuscatedName("yx.f")
   private int field10404;
   @deob.ObfuscatedName("yx.ac")
   public float field10429;
   @deob.ObfuscatedName("yx.ay")
   public float field10430;
   @deob.ObfuscatedName("yx.bf")
   public float field10431;
   @deob.ObfuscatedName("yx.bp")
   public float field10432;
   @deob.ObfuscatedName("yx.av")
   public int field10407;
   @deob.ObfuscatedName("yx.ak")
   public int field10410;
   @deob.ObfuscatedName("yx.ba")
   public int field10416;
   @deob.ObfuscatedName("yx.an")
   public int field10420;
   @deob.ObfuscatedName("yx.ax")
   private int field10422;
   @deob.ObfuscatedName("yx.au")
   private int field10425;
   @deob.ObfuscatedName("yx.am")
   private int field10427;
   @deob.ObfuscatedName("yx.aj")
   private int field10428;
   @deob.ObfuscatedName("yx.ad")
   private int field10433;
   @deob.ObfuscatedName("yx.ag")
   public int field10435;
   @deob.ObfuscatedName("yx.bq")
   private class383 field10439;
   @deob.ObfuscatedName("yx.af")
   public float[] field10414;
   @deob.ObfuscatedName("yx.ap")
   public int[] field10406;
   @deob.ObfuscatedName("yx.bg")
   private class321[] field10408;

   private class984(class637 arg0) {
      super(arg0);
      this.field10436 = false;
      this.field10418 = false;
      this.field10405 = 0;
      this.field10411 = 0;
      this.field10415 = 0;
      this.field10413 = 0;
      this.field10417 = 45823;
      this.field10409 = 78642;
      this.field10419 = 75518;
      this.field10424 = new float[6][4];
      this.field10403 = 1.0F;
      this.field10434 = 0.0F;
      this.field10438 = new class737(16);
      this.field10440 = -1;

      try {
         this.field10437 = new class737(6291456, 256);
         this.field10412 = new class583();
         this.field10421 = new class597();
         this.field10426 = new class597();
         this.field10423 = new class597();
         this.method16819(1);
         this.method16818(0);
         class789.method6469(true, true);
         this.field10418 = true;
         this.field10404 = (int)class431.method2169();
      } catch (Throwable var3) {
         var3.printStackTrace();
         this.method11494();
         throw new RuntimeException("");
      }
   }

   public class984(Canvas arg0, class637 arg1, int arg2, int arg3) {
      this(arg1);

      try {
         this.method11495(arg0, arg2, arg3);
         this.method11519(arg0);
      } catch (Throwable var6) {
         var6.printStackTrace();
         this.method11494();
         throw new RuntimeException("");
      }
   }

   @deob.ObfuscatedName("yx.s()Lcz;")
   public class384 method2505() {
      return new class384(0, "Pure Java", 1, "CPU", 0L);
   }

   @deob.ObfuscatedName("yx.u(II)V")
   protected void method2745(int arg0, int arg1) throws class165 {
      this.field7120.method543(arg0, arg1);
      if (this.field7118 != null) {
         this.field7118.method5113();
      }

   }

   @deob.ObfuscatedName("yx.v()V")
   public void method2507() {
   }

   @deob.ObfuscatedName("yx.e()V")
   protected void method2508() {
      if (this.field10418) {
         class789.method9269(true, false);
         this.field10418 = false;
      }

      this.field10436 = true;
   }

   @deob.ObfuscatedName("yx.i(I)V")
   public void method2580(int arg0) {
      int var2 = arg0 - this.field10404;

      for(class64 var3 = (class64)this.field10437.method10888(); var3 != null; var3 = (class64)this.field10437.method10906()) {
         if (var3.field456) {
            var3.field453 += var2;
            int var4 = var3.field453 / 50;
            if (var4 > 0) {
               class360 var5 = this.field7118.method5112(var3.field455);
               float var6 = (float)var5.field2315;
               var3.method970((int)((float)var2 / 1000.0F * (float)var5.field2330 / 64.0F * var6), (int)((float)var2 / 1000.0F * (float)var5.field2317 / 64.0F * var6));
               var3.field453 -= var4 * 50;
            }

            var3.field456 = false;
         }
      }

      this.field10404 = arg0;
      this.field10438.method10882(5);
      this.field10437.method10882(5);
   }

   @deob.ObfuscatedName("yx.za()I")
   public int method7488() {
      return 0;
   }

   @deob.ObfuscatedName("yx.n()Z")
   public boolean method16820() {
      return this.field10436;
   }

   @deob.ObfuscatedName("yx.k(I)[I")
   public int[] method16807(int arg0) {
      class737 var2 = this.field10437;
      class64 var3;
      synchronized(this.field10437) {
         var3 = (class64)this.field10437.method10909((long)arg0 | Long.MIN_VALUE);
         if (var3 == null) {
            class360 var4 = this.field7118.method5112(arg0);
            int var5 = var4.field2315;
            if (!this.field7118.method5108(arg0, class742.field6808, 0.7F, var5, var5, true)) {
               return null;
            }

            int[] var6;
            if (class725.field6684 == var4.field2323) {
               var6 = this.field7118.method5115(arg0, 0.7F, var5, var5, true);
            } else {
               var6 = this.field7118.method5146(arg0, 0.7F, var5, var5, true);
            }

            var3 = new class64(arg0, var5, var6, class725.field6683 != var4.field2323);
            this.field10437.method10881(var3, (long)arg0 | Long.MIN_VALUE, var5 * var5);
         }
      }

      var3.field456 = true;
      return var3.method973();
   }

   @deob.ObfuscatedName("yx.d(I)Z")
   public boolean method16858(int arg0) {
      class360 var2 = this.field7118.method5112(arg0);
      return this.field7118.method5108(arg0, class742.field6808, 0.7F, var2.field2315, var2.field2315, true);
   }

   @deob.ObfuscatedName("yx.h(I)I")
   public int method16845(int arg0) {
      return this.field7118.method5112(arg0).field2315;
   }

   @deob.ObfuscatedName("yx.z(I)Lph;")
   public class725 method16808(int arg0) {
      return this.field7118.method5112(arg0).field2323;
   }

   @deob.ObfuscatedName("yx.q(I)I")
   public int method16833(int arg0) {
      return this.field7118.method5112(arg0).field2322 & 65535;
   }

   @deob.ObfuscatedName("yx.y(I)Z")
   public boolean method16809(int arg0) {
      return this.field7118.method5112(arg0).field2320 || this.field7118.method5112(arg0).field2336;
   }

   @deob.ObfuscatedName("yx.t()Z")
   public boolean method7489() {
      return false;
   }

   @deob.ObfuscatedName("yx.w()Z")
   public boolean method7490() {
      return false;
   }

   @deob.ObfuscatedName("yx.j()Z")
   public boolean method7491() {
      return true;
   }

   @deob.ObfuscatedName("yx.ai()Z")
   public boolean method7492() {
      return false;
   }

   @deob.ObfuscatedName("yx.ap()Z")
   public boolean method7668() {
      return false;
   }

   @deob.ObfuscatedName("yx.f()Z")
   public boolean method7494() {
      return false;
   }

   @deob.ObfuscatedName("yx.av()Z")
   public boolean method7495() {
      return false;
   }

   @deob.ObfuscatedName("yx.ax()Z")
   public boolean method7496() {
      return false;
   }

   @deob.ObfuscatedName("yx.af()Z")
   public boolean method7497() {
      return false;
   }

   @deob.ObfuscatedName("yx.at()Z")
   public boolean method7484() {
      return true;
   }

   @deob.ObfuscatedName("yx.dc(Z)V")
   public void method2506(boolean arg0) {
   }

   @deob.ObfuscatedName("yx.aq(Ljava/awt/Canvas;II)Lyc;")
   protected class963 method2512(Canvas arg0, int arg1, int arg2) {
      return class216.method11590(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("yx.da(II[I[F)V")
   public void method16841(int arg0, int arg1, int[] arg2, float[] arg3) {
      this.field10407 = arg0;
      this.field10422 = arg1;
      this.field10406 = arg2;
      this.field10414 = arg3;

      for(int var5 = 0; var5 < this.field10416; ++var5) {
         this.field10408[var5].method3996();
      }

      this.method7508();
      this.method7503();
   }

   @deob.ObfuscatedName("yx.am(IIII)[I")
   public int[] method2609(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10406 == null) {
         throw new IllegalStateException("");
      } else {
         int[] var5 = new int[arg2 * arg3];
         int var6 = 0;

         for(int var7 = 0; var7 < arg3; ++var7) {
            int var8 = this.field10407 * (arg1 + var7) + arg0;

            for(int var9 = 0; var9 < arg2; ++var9) {
               var5[var6++] = this.field10406[var8 + var9];
            }
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("yx.aj()V")
   public void method2520() {
   }

   @deob.ObfuscatedName("yx.aw([I)V")
   public void method11497(int[] arg0) {
      arg0[0] = this.field10407;
      arg0[1] = this.field10422;
   }

   @deob.ObfuscatedName("yx.ma()V")
   public void method16860() {
      if (this.field10414 != null) {
         if (this.field10405 == 0 && this.field10411 == this.field10407 && this.field10415 == 0 && this.field10422 == this.field10413) {
            int var1 = this.field10414.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;

            while(var3 < var2) {
               this.field10414[var3++] = 2.1474836E9F;
               this.field10414[var3++] = 2.1474836E9F;
               this.field10414[var3++] = 2.1474836E9F;
               this.field10414[var3++] = 2.1474836E9F;
               this.field10414[var3++] = 2.1474836E9F;
               this.field10414[var3++] = 2.1474836E9F;
               this.field10414[var3++] = 2.1474836E9F;
               this.field10414[var3++] = 2.1474836E9F;
            }

            while(var3 < var1) {
               this.field10414[var3++] = 2.1474836E9F;
            }
         } else {
            int var4 = this.field10411 - this.field10405;
            int var5 = this.field10413 - this.field10415;
            int var6 = this.field10407 - var4;
            int var7 = this.field10415 * this.field10407 + this.field10405;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;

            for(int var11 = -var5; var11 < 0; ++var11) {
               if (var8 > 0) {
                  int var12 = var8;

                  do {
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     --var12;
                  } while(var12 > 0);
               }

               if (var9 > 0) {
                  int var13 = var9;

                  do {
                     ++var10;
                     this.field10414[var10] = 2.1474836E9F;
                     --var13;
                  } while(var13 > 0);
               }

               var10 += var6;
            }
         }

      }
   }

   @deob.ObfuscatedName("yx.RA(Z)V")
   public void method7551(boolean arg0) {
      class321 var2 = this.method16838(Thread.currentThread());
      var2.field2011 = arg0;
   }

   @deob.ObfuscatedName("yx.ac()V")
   public void method7503() {
      this.field10425 = 0;
      this.field10433 = 0;
      this.field10427 = this.field10407;
      this.field10428 = this.field10422;
      this.method16834();
   }

   @deob.ObfuscatedName("yx.ay(IIII)V")
   public void method7505(int arg0, int arg1, int arg2, int arg3) {
      this.field10425 = arg0;
      this.field10433 = arg1;
      this.field10427 = arg2;
      this.field10428 = arg3;
      this.method16834();
   }

   @deob.ObfuscatedName("yx.GA(FF)V")
   public void method7507(float arg0, float arg1) {
      this.field10403 = arg1 - arg0;
      this.field10434 = arg0 + arg1 - 1.0F;

      for(int var3 = 0; var3 < this.field10416; ++var3) {
         class321 var4 = this.field10408[var3];
         class350 var5 = var4.field2014;
         var5.field2215 = this.field10403;
         var5.field2221 = this.field10434;
      }

   }

   @deob.ObfuscatedName("yx.nu()V")
   private void method16834() {
      int var1 = this.field10411 - this.field10405;
      int var2 = this.field10413 - this.field10415;
      float var3 = this.field10429 = (float)this.field10427 / 2.0F;
      float var4 = this.field10431 = (float)this.field10428 / 2.0F;
      this.field10430 = (float)this.field10425 + var3;
      this.field10432 = (float)this.field10433 + var4;

      for(int var5 = 0; var5 < this.field10416; ++var5) {
         class321 var6 = this.field10408[var5];
         class350 var7 = var6.field2014;
         var7.field2214 = var3;
         var7.field2210 = var4;
         var7.field2217 = this.field10430 - (float)this.field10405;
         var7.field2226 = this.field10432 - (float)this.field10415;
         var7.field2225 = var1 * -845588081;
         var7.field2224 = var2;
      }

      int var8 = this.field10415 * this.field10407 + this.field10405;

      for(int var9 = this.field10415; var9 < this.field10413; ++var9) {
         for(int var10 = 0; var10 < this.field10416; ++var10) {
            this.field10408[var10].field2014.field2216[var9 - this.field10415] = var8;
         }

         var8 += this.field10407;
      }

   }

   @deob.ObfuscatedName("yx.L()V")
   public void method7508() {
      this.field10405 = 0;
      this.field10415 = 0;
      this.field10411 = this.field10407;
      this.field10413 = this.field10422;
      this.method16834();
   }

   @deob.ObfuscatedName("yx.r(IIII)V")
   public void method7716(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > this.field10407) {
         arg2 = this.field10407;
      }

      if (arg3 > this.field10422) {
         arg3 = this.field10422;
      }

      this.field10405 = arg0;
      this.field10411 = arg2;
      this.field10415 = arg1;
      this.field10413 = arg3;
      this.method16834();
   }

   @deob.ObfuscatedName("yx.o(IIII)V")
   public void method7510(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10405 < arg0) {
         this.field10405 = arg0;
      }

      if (this.field10415 < arg1) {
         this.field10415 = arg1;
      }

      if (this.field10411 > arg2) {
         this.field10411 = arg2;
      }

      if (this.field10413 > arg3) {
         this.field10413 = arg3;
      }

      this.method16834();
   }

   @deob.ObfuscatedName("yx.qa([I)V")
   public void method7511(int[] arg0) {
      arg0[0] = this.field10405;
      arg0[1] = this.field10415;
      arg0[2] = this.field10411;
      arg0[3] = this.field10413;
   }

   @deob.ObfuscatedName("yx.ba(II)V")
   public void method2522(int arg0, int arg1) {
      if ((arg0 & 1) != 0) {
         this.method7513(0, 0, this.field10407, this.field10422, arg1, 0);
      }

      if ((arg0 & 2) != 0) {
         this.method16860();
      }

   }

   @deob.ObfuscatedName("yx.bq(IIIIII)V")
   public void method7751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method7514(arg0, arg1, arg2, arg4, arg5);
      this.method7514(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method7516(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
      this.method7516(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
   }

   @deob.ObfuscatedName("yx.B(IIIIII)V")
   public void method7513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (this.field10406 != null) {
         if (arg0 < this.field10405) {
            arg2 -= this.field10405 - arg0;
            arg0 = this.field10405;
         }

         if (arg1 < this.field10415) {
            arg3 -= this.field10415 - arg1;
            arg1 = this.field10415;
         }

         if (arg0 + arg2 > this.field10411) {
            arg2 = this.field10411 - arg0;
         }

         if (arg1 + arg3 > this.field10413) {
            arg3 = this.field10413 - arg1;
         }

         if (arg2 > 0 && arg3 > 0 && arg0 <= this.field10411 && arg1 <= this.field10413) {
            int var7 = this.field10407 - arg2;
            int var8 = this.field10407 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
               int var22 = arg2 >> 3;
               int var23 = arg2 & 7;
               int var24 = var8 - 1;

               for(int var25 = -arg3; var25 < 0; ++var25) {
                  if (var22 > 0) {
                     int var26 = var22;

                     do {
                        ++var24;
                        this.field10406[var24] = arg4;
                        ++var24;
                        this.field10406[var24] = arg4;
                        ++var24;
                        this.field10406[var24] = arg4;
                        ++var24;
                        this.field10406[var24] = arg4;
                        ++var24;
                        this.field10406[var24] = arg4;
                        ++var24;
                        this.field10406[var24] = arg4;
                        ++var24;
                        this.field10406[var24] = arg4;
                        ++var24;
                        this.field10406[var24] = arg4;
                        --var26;
                     } while(var26 > 0);
                  }

                  if (var23 > 0) {
                     int var27 = var23;

                     do {
                        ++var24;
                        this.field10406[var24] = arg4;
                        --var27;
                     } while(var27 > 0);
                  }

                  var24 += var7;
               }
            } else if (arg5 == 1) {
               int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
               int var11 = 256 - var9;

               for(int var12 = 0; var12 < arg3; ++var12) {
                  for(int var13 = -arg2; var13 < 0; ++var13) {
                     int var14 = this.field10406[var8];
                     int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                     this.field10406[var8++] = var10 + var15;
                  }

                  var8 += var7;
               }
            } else {
               if (arg5 != 2) {
                  throw new IllegalArgumentException();
               }

               for(int var16 = 0; var16 < arg3; ++var16) {
                  for(int var17 = -arg2; var17 < 0; ++var17) {
                     int var18 = this.field10406[var8];
                     int var19 = arg4 + var18;
                     int var20 = (arg4 & 16711935) + (var18 & 16711935);
                     int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                     this.field10406[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                  }

                  var8 += var7;
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.N(IIIIII[BII)V")
   public void method7769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (this.field10406 != null) {
         if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field10407 * arg1 + arg0;
            int var15 = this.field10407 - arg2;
            if (arg1 + arg3 > this.field10413) {
               arg3 -= arg1 + arg3 - this.field10413;
            }

            if (arg1 < this.field10415) {
               int var16 = this.field10415 - arg1;
               arg3 -= var16;
               var14 += this.field10407 * var16;
               var11 += var13 * var16;
            }

            if (arg0 + arg2 > this.field10411) {
               int var17 = arg0 + arg2 - this.field10411;
               arg2 -= var17;
               var15 += var17;
            }

            if (arg0 < this.field10405) {
               int var18 = this.field10405 - arg0;
               arg2 -= var18;
               var14 += var18;
               var10 += var12 * var18;
               var15 += var18;
            }

            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
               if (arg8 == 1) {
                  int var21 = var10;

                  for(int var22 = -arg3; var22 < 0; ++var22) {
                     int var23 = (var11 >> 16) * arg7;

                     for(int var24 = -arg2; var24 < 0; ++var24) {
                        int var25 = arg4;
                        if (arg6[(var10 >> 16) + var23] != 0) {
                           var25 = arg5;
                        }

                        int var26 = var25 >>> 24;
                        int var27 = 255 - var26;
                        int var28 = this.field10406[var14];
                        this.field10406[var14++] = ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) + ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) >> 8;
                        var10 += var12;
                     }

                     var11 += var13;
                     var10 = var21;
                     var14 += var15;
                  }
               } else {
                  if (arg8 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var29 = var10;

                  for(int var30 = -arg3; var30 < 0; ++var30) {
                     int var31 = (var11 >> 16) * arg7;

                     for(int var32 = -arg2; var32 < 0; ++var32) {
                        int var33 = arg4;
                        if (arg6[(var10 >> 16) + var31] != 0) {
                           var33 = arg5;
                        }

                        if (var33 != 0) {
                           int var34 = this.field10406[var14];
                           int var35 = var33 + var34;
                           int var36 = (var33 & 16711935) + (var34 & 16711935);
                           int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                           this.field10406[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                        } else {
                           ++var14;
                        }

                        var10 += var12;
                     }

                     var11 += var13;
                     var10 = var29;
                     var14 += var15;
                  }
               }
            } else {
               int var38 = var10;

               for(int var39 = -arg3; var39 < 0; ++var39) {
                  int var40 = (var11 >> 16) * arg7;

                  for(int var41 = -arg2; var41 < 0; ++var41) {
                     if (arg6[(var10 >> 16) + var40] != 0) {
                        this.field10406[var14++] = arg5;
                     } else {
                        this.field10406[var14++] = arg4;
                     }

                     var10 += var12;
                  }

                  var11 += var13;
                  var10 = var38;
                  var14 += var15;
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.CA(IIIII)V")
   protected void method7519(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (this.field10406 != null) {
         if (arg2 < 0) {
            arg2 = -arg2;
         }

         int var6 = arg1 - arg2;
         if (var6 < this.field10415) {
            var6 = this.field10415;
         }

         int var7 = arg1 + arg2 + 1;
         if (var7 > this.field10413) {
            var7 = this.field10413;
         }

         int var8 = var6;
         int var9 = arg2 * arg2;
         int var10 = 0;
         int var11 = arg1 - var6;
         int var12 = var11 * var11;
         int var13 = var12 - var11;
         if (arg1 > var7) {
            arg1 = var7;
         }

         int var14 = arg3 >>> 24;
         if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while(var8 < arg1) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               int var55 = arg0 - var10 + 1;
               if (var55 < this.field10405) {
                  var55 = this.field10405;
               }

               int var56 = arg0 + var10;
               if (var56 > this.field10411) {
                  var56 = this.field10411;
               }

               int var57 = this.field10407 * var8 + var55;

               for(int var58 = var55; var58 < var56; ++var58) {
                  this.field10406[var57++] = arg3;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            int var59 = arg2;
            int var60 = var8 - arg1;
            int var61 = var60 * var60 + var9;
            int var62 = var61 - arg2;
            int var63 = var61 - var60;

            while(var8 < var7) {
               while(var63 > var9 && var62 > var9) {
                  var63 -= var59-- + var59;
                  var62 -= var59 + var59;
               }

               int var64 = arg0 - var59;
               if (var64 < this.field10405) {
                  var64 = this.field10405;
               }

               int var65 = arg0 + var59;
               if (var65 > this.field10411 - 1) {
                  var65 = this.field10411 - 1;
               }

               int var66 = this.field10407 * var8 + var64;

               for(int var67 = var64; var67 <= var65; ++var67) {
                  this.field10406[var66++] = arg3;
               }

               ++var8;
               var63 += var60 + var60;
               var62 += var60++ + var60;
            }

            return;
         } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 65280) * var14 >> 8 & 65280) + ((arg3 & 16711935) * var14 >> 8 & 16711935);
            int var16 = 256 - var14;

            while(var8 < arg1) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               int var17 = arg0 - var10 + 1;
               if (var17 < this.field10405) {
                  var17 = this.field10405;
               }

               int var18 = arg0 + var10;
               if (var18 > this.field10411) {
                  var18 = this.field10411;
               }

               int var19 = this.field10407 * var8 + var17;

               for(int var20 = var17; var20 < var18; ++var20) {
                  int var21 = this.field10406[var19];
                  int var22 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & 65280) * var16 >> 8 & 65280);
                  this.field10406[var19++] = var15 + var22;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            int var23 = arg2;
            int var24 = -var11;
            int var25 = var24 * var24 + var9;
            int var26 = var25 - arg2;
            int var27 = var25 - var24;

            while(var8 < var7) {
               while(var27 > var9 && var26 > var9) {
                  var27 -= var23-- + var23;
                  var26 -= var23 + var23;
               }

               int var28 = arg0 - var23;
               if (var28 < this.field10405) {
                  var28 = this.field10405;
               }

               int var29 = arg0 + var23;
               if (var29 > this.field10411 - 1) {
                  var29 = this.field10411 - 1;
               }

               int var30 = this.field10407 * var8 + var28;

               for(int var31 = var28; var31 <= var29; ++var31) {
                  int var32 = this.field10406[var30];
                  int var33 = ((var32 & 65280) * var16 >> 8 & 65280) + ((var32 & 16711935) * var16 >> 8 & 16711935);
                  this.field10406[var30++] = var15 + var33;
               }

               ++var8;
               var27 += var24 + var24;
               var26 += var24++ + var24;
            }
         } else {
            if (arg4 != 2) {
               throw new IllegalArgumentException();
            }

            while(var8 < arg1) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               int var34 = arg0 - var10 + 1;
               if (var34 < this.field10405) {
                  var34 = this.field10405;
               }

               int var35 = arg0 + var10;
               if (var35 > this.field10411) {
                  var35 = this.field10411;
               }

               int var36 = this.field10407 * var8 + var34;

               for(int var37 = var34; var37 < var35; ++var37) {
                  int var38 = this.field10406[var36];
                  int var39 = arg3 + var38;
                  int var40 = (arg3 & 16711935) + (var38 & 16711935);
                  int var41 = (var39 - var40 & 65536) + (var40 & 16777472);
                  this.field10406[var36++] = var39 - var41 | var41 - (var41 >>> 8);
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            int var42 = arg2;
            int var43 = -var11;
            int var44 = var43 * var43 + var9;
            int var45 = var44 - arg2;
            int var46 = var44 - var43;

            while(var8 < var7) {
               while(var46 > var9 && var45 > var9) {
                  var46 -= var42-- + var42;
                  var45 -= var42 + var42;
               }

               int var47 = arg0 - var42;
               if (var47 < this.field10405) {
                  var47 = this.field10405;
               }

               int var48 = arg0 + var42;
               if (var48 > this.field10411 - 1) {
                  var48 = this.field10411 - 1;
               }

               int var49 = this.field10407 * var8 + var47;

               for(int var50 = var47; var50 <= var48; ++var50) {
                  int var51 = this.field10406[var49];
                  int var52 = arg3 + var51;
                  int var53 = (arg3 & 16711935) + (var51 & 16711935);
                  int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                  this.field10406[var49++] = var52 - var54 | var54 - (var54 >>> 8);
               }

               ++var8;
               var46 += var43 + var43;
               var45 += var43++ + var43;
            }
         }

      }
   }

   @deob.ObfuscatedName("yx.XA(IIIII)V")
   public void method7514(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (this.field10406 != null) {
         if (arg1 >= this.field10415 && arg1 < this.field10413) {
            if (arg0 < this.field10405) {
               arg2 -= this.field10405 - arg0;
               arg0 = this.field10405;
            }

            if (arg0 + arg2 > this.field10411) {
               arg2 = this.field10411 - arg0;
            }

            int var6 = this.field10407 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 == 0 || arg4 == 1 && var7 == 255) {
               for(int var18 = 0; var18 < arg2; ++var18) {
                  this.field10406[var6 + var18] = arg3;
               }
            } else if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field10406[var6 + var10];
                  int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                  this.field10406[var6 + var10] = var8 + var12;
               }
            } else {
               if (arg4 != 2) {
                  throw new IllegalArgumentException();
               }

               for(int var13 = 0; var13 < arg2; ++var13) {
                  int var14 = this.field10406[var6 + var13];
                  int var15 = arg3 + var14;
                  int var16 = (arg3 & 16711935) + (var14 & 16711935);
                  int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                  this.field10406[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.ne(IIIIIIII)V")
   private void method16813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (this.field10406 != null) {
         if (arg1 >= this.field10415 && arg1 < this.field10413) {
            int var9 = this.field10407 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 == 0 || arg4 == 1 && var10 == 255) {
               int var23 = 0;

               while(var23 < arg2) {
                  if (arg0 + var23 >= this.field10405 && arg0 + var23 < this.field10411 && var12 < arg5) {
                     this.field10406[var9 + var23] = arg3;
                  }

                  ++var23;
                  ++var12;
                  var12 %= var11;
               }
            } else if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 65280) * var10 >> 8 & 65280) + ((arg3 & 16711935) * var10 >> 8 & 16711935);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg0 + var15 >= this.field10405 && arg0 + var15 < this.field10411 && var12 < arg5) {
                     int var16 = this.field10406[var9 + var15];
                     int var17 = ((var16 & 65280) * var14 >> 8 & 65280) + ((var16 & 16711935) * var14 >> 8 & 16711935);
                     this.field10406[var9 + var15] = var13 + var17;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }
            } else {
               if (arg4 != 2) {
                  throw new IllegalArgumentException();
               }

               int var18 = 0;

               while(var18 < arg2) {
                  if (arg0 + var18 >= this.field10405 && arg0 + var18 < this.field10411 && var12 < arg5) {
                     int var19 = this.field10406[var9 + var18];
                     int var20 = arg3 + var19;
                     int var21 = (arg3 & 16711935) + (var19 & 16711935);
                     int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.field10406[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                  }

                  ++var18;
                  ++var12;
                  var12 %= var11;
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.G(IIIII)V")
   public void method7516(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (this.field10406 != null) {
         if (arg0 >= this.field10405 && arg0 < this.field10411) {
            if (arg1 < this.field10415) {
               arg2 -= this.field10415 - arg1;
               arg1 = this.field10415;
            }

            if (arg1 + arg2 > this.field10413) {
               arg2 = this.field10413 - arg1;
            }

            int var6 = this.field10407 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 == 0 || arg4 == 1 && var7 == 255) {
               for(int var20 = 0; var20 < arg2; ++var20) {
                  this.field10406[this.field10407 * var20 + var6] = arg3;
               }
            } else if (arg4 == 1) {
               int var8 = (var7 << 24) + ((arg3 & 65280) * var7 >> 8 & 65280) + ((arg3 & 16711935) * var7 >> 8 & 16711935);
               int var9 = 256 - var7;

               for(int var10 = 0; var10 < arg2; ++var10) {
                  int var11 = this.field10407 * var10 + var6;
                  int var12 = this.field10406[var11];
                  int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field10406[var11] = var8 + var13;
               }
            } else {
               if (arg4 != 2) {
                  throw new IllegalArgumentException();
               }

               for(int var14 = 0; var14 < arg2; ++var14) {
                  int var15 = this.field10407 * var14 + var6;
                  int var16 = this.field10406[var15];
                  int var17 = arg3 + var16;
                  int var18 = (arg3 & 16711935) + (var16 & 16711935);
                  int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                  this.field10406[var15] = var17 - var19 | var19 - (var19 >>> 8);
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.np(IIIIIIII)V")
   private void method16814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (this.field10406 != null) {
         if (arg0 >= this.field10405 && arg0 < this.field10411) {
            int var9 = this.field10407 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 == 0 || arg4 == 1 && var10 == 255) {
               int var25 = 0;

               while(var25 < arg2) {
                  if (arg1 + var25 >= this.field10415 && arg1 + var25 < this.field10413 && var12 < arg5) {
                     this.field10406[this.field10407 * var25 + var9] = arg3;
                  }

                  ++var25;
                  ++var12;
                  var12 %= var11;
               }
            } else if (arg4 == 1) {
               int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
               int var14 = 256 - var10;
               int var15 = 0;

               while(var15 < arg2) {
                  if (arg1 + var15 >= this.field10415 && arg1 + var15 < this.field10413 && var12 < arg5) {
                     int var16 = this.field10407 * var15 + var9;
                     int var17 = this.field10406[var16];
                     int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                     this.field10406[var16] = var13 + var18;
                  }

                  ++var15;
                  ++var12;
                  var12 %= var11;
               }
            } else {
               if (arg4 != 2) {
                  throw new IllegalArgumentException();
               }

               int var19 = 0;

               while(var19 < arg2) {
                  if (arg1 + var19 >= this.field10415 && arg1 + var19 < this.field10413 && var12 < arg5) {
                     int var20 = this.field10407 * var19 + var9;
                     int var21 = this.field10406[var20];
                     int var22 = arg3 + var21;
                     int var23 = (arg3 & 16711935) + (var21 & 16711935);
                     int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                     this.field10406[var20] = var22 - var24 | var24 - (var24 >>> 8);
                  }

                  ++var19;
                  ++var12;
                  var12 %= var11;
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.bx(IIIIII)V")
   public void method7517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (this.field10406 != null) {
         int var7 = arg2 - arg0;
         int var8 = arg3 - arg1;
         if (var8 == 0) {
            if (var7 >= 0) {
               this.method7514(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
               this.method7514(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }

         } else if (var7 == 0) {
            if (var8 >= 0) {
               this.method7516(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
               this.method7516(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }

         } else {
            if (var7 + var8 < 0) {
               arg0 += var7;
               var7 = -var7;
               arg1 += var8;
               var8 = -var8;
            }

            if (var7 > var8) {
               int var9 = arg1 << 16;
               int var10 = var9 + 32768;
               int var11 = var8 << 16;
               int var12 = (int)Math.floor((double)var11 / (double)var7 + 0.5D);
               int var13 = arg0 + var7;
               if (arg0 < this.field10405) {
                  var10 += (this.field10405 - arg0) * var12;
                  arg0 = this.field10405;
               }

               if (var13 >= this.field10411) {
                  var13 = this.field10411 - 1;
               }

               int var14 = arg4 >>> 24;
               if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                  if (arg5 == 1) {
                     int var15 = (var14 << 24) + ((arg4 & 65280) * var14 >> 8 & 65280) + ((arg4 & 16711935) * var14 >> 8 & 16711935);
                     int var16 = 256 - var14;

                     while(arg0 <= var13) {
                        int var17 = var10 >> 16;
                        if (var17 >= this.field10415 && var17 < this.field10413) {
                           int var18 = this.field10407 * var17 + arg0;
                           int var19 = this.field10406[var18];
                           int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                           this.field10406[var18] = var15 + var20;
                        }

                        var10 += var12;
                        ++arg0;
                     }
                  } else {
                     if (arg5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(arg0 <= var13) {
                        int var21 = var10 >> 16;
                        if (var21 >= this.field10415 && var21 < this.field10413) {
                           int var22 = this.field10407 * var21 + arg0;
                           int var23 = this.field10406[var22];
                           int var24 = arg4 + var23;
                           int var25 = (arg4 & 16711935) + (var23 & 16711935);
                           int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                           this.field10406[var22] = var24 - var26 | var26 - (var26 >>> 8);
                        }

                        var10 += var12;
                        ++arg0;
                     }
                  }
               } else {
                  while(arg0 <= var13) {
                     int var27 = var10 >> 16;
                     if (var27 >= this.field10415 && var27 < this.field10413) {
                        this.field10406[this.field10407 * var27 + arg0] = arg4;
                     }

                     var10 += var12;
                     ++arg0;
                  }
               }
            } else {
               int var28 = arg0 << 16;
               int var29 = var28 + 32768;
               int var30 = var7 << 16;
               int var31 = (int)Math.floor((double)var30 / (double)var8 + 0.5D);
               int var32 = arg1 + var8;
               if (arg1 < this.field10415) {
                  var29 += (this.field10415 - arg1) * var31;
                  arg1 = this.field10415;
               }

               if (var32 >= this.field10413) {
                  var32 = this.field10413 - 1;
               }

               int var33 = arg4 >>> 24;
               if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                  while(arg1 <= var32) {
                     int var46 = var29 >> 16;
                     if (var46 >= this.field10405 && var46 < this.field10411) {
                        this.field10406[this.field10407 * arg1 + var46] = arg4;
                     }

                     var29 += var31;
                     ++arg1;
                  }
               } else if (arg5 == 1) {
                  int var34 = (var33 << 24) + ((arg4 & 65280) * var33 >> 8 & 65280) + ((arg4 & 16711935) * var33 >> 8 & 16711935);
                  int var35 = 256 - var33;

                  while(arg1 <= var32) {
                     int var36 = var29 >> 16;
                     if (var36 >= this.field10405 && var36 < this.field10411) {
                        int var37 = this.field10407 * arg1 + var36;
                        int var38 = this.field10406[var37];
                        int var39 = ((var38 & 65280) * var35 >> 8 & 65280) + ((var38 & 16711935) * var35 >> 8 & 16711935);
                        this.field10406[this.field10407 * arg1 + var36] = var34 + var39;
                     }

                     var29 += var31;
                     ++arg1;
                  }
               } else {
                  if (arg5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(arg1 <= var32) {
                     int var40 = var29 >> 16;
                     if (var40 >= this.field10405 && var40 < this.field10411) {
                        int var41 = this.field10407 * arg1 + var40;
                        int var42 = this.field10406[var41];
                        int var43 = arg4 + var42;
                        int var44 = (arg4 & 16711935) + (var42 & 16711935);
                        int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                        this.field10406[var41] = var43 - var45 | var45 - (var45 >>> 8);
                     }

                     var29 += var31;
                     ++arg1;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.bh(IIIIIIIII)V")
   public void method7522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (this.field10406 != null) {
         int var10 = arg2 - arg0;
         int var11 = arg3 - arg1;
         if (var11 == 0) {
            if (var10 >= 0) {
               this.method16813(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
               int var12 = arg6 + arg7;
               int var13 = arg8 % var12;
               int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
               int var15 = var14 % var12;
               if (var15 < 0) {
                  var15 += var12;
               }

               this.method16813(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }

         } else if (var10 == 0) {
            if (var11 >= 0) {
               this.method16814(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
               int var16 = arg6 + arg7;
               int var17 = arg8 % var16;
               int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
               int var19 = var18 % var16;
               if (var19 < 0) {
                  var19 += var16;
               }

               this.method16814(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }

         } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
               int var25 = (int)(Math.sqrt((double)(var10 * var10 + var11 * var11)) * 256.0D);
               int var26 = var25 % var23;
               int var27 = var21 + var23 - var24 - var26;
               var24 = var27 % var23;
               if (var24 < 0) {
                  var24 += var23;
               }

               arg0 += var10;
               var10 = -var10;
               arg1 += var11;
               var11 = -var11;
            }

            if (var10 > var11) {
               int var28 = arg1 << 16;
               int var29 = var28 + 32768;
               int var30 = var11 << 16;
               int var31 = (int)Math.floor((double)var30 / (double)var10 + 0.5D);
               int var32 = arg0 + var10;
               int var33 = arg4 >>> 24;
               int var34 = (int)Math.sqrt((double)((var31 >> 8) * (var31 >> 8) + 65536));
               if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                  if (arg5 == 1) {
                     int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                     int var36 = 256 - var33;

                     while(arg0 <= var32) {
                        int var37 = var29 >> 16;
                        if (arg0 >= this.field10405 && arg0 < this.field10411 && var37 >= this.field10415 && var37 < this.field10413 && var24 < var21) {
                           int var38 = this.field10407 * var37 + arg0;
                           int var39 = this.field10406[var38];
                           int var40 = ((var39 & 65280) * var36 >> 8 & 65280) + ((var39 & 16711935) * var36 >> 8 & 16711935);
                           this.field10406[var38] = var35 + var40;
                        }

                        var29 += var31;
                        ++arg0;
                        int var41 = var24 + var34;
                        var24 = var41 % var23;
                     }
                  } else {
                     if (arg5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(arg0 <= var32) {
                        int var42 = var29 >> 16;
                        if (arg0 >= this.field10405 && arg0 < this.field10411 && var42 >= this.field10415 && var42 < this.field10413 && var24 < var21) {
                           int var43 = this.field10407 * var42 + arg0;
                           int var44 = this.field10406[var43];
                           int var45 = arg4 + var44;
                           int var46 = (arg4 & 16711935) + (var44 & 16711935);
                           int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                           this.field10406[var43] = var45 - var47 | var47 - (var47 >>> 8);
                        }

                        var29 += var31;
                        ++arg0;
                        int var48 = var24 + var34;
                        var24 = var48 % var23;
                     }
                  }
               } else {
                  while(arg0 <= var32) {
                     int var49 = var29 >> 16;
                     if (arg0 >= this.field10405 && arg0 < this.field10411 && var49 >= this.field10415 && var49 < this.field10413 && var24 < var21) {
                        this.field10406[this.field10407 * var49 + arg0] = arg4;
                     }

                     var29 += var31;
                     ++arg0;
                     int var50 = var24 + var34;
                     var24 = var50 % var23;
                  }
               }
            } else {
               int var51 = arg0 << 16;
               int var52 = var51 + 32768;
               int var53 = var10 << 16;
               int var54 = (int)Math.floor((double)var53 / (double)var11 + 0.5D);
               int var55 = arg1 + var11;
               int var56 = arg4 >>> 24;
               int var57 = (int)Math.sqrt((double)((var54 >> 8) * (var54 >> 8) + 65536));
               if (arg5 == 0 || arg5 == 1 && var56 == 255) {
                  while(arg1 <= var55) {
                     int var72 = var52 >> 16;
                     if (arg1 >= this.field10415 && arg1 < this.field10413 && var72 >= this.field10405 && var72 < this.field10411 && var24 < var21) {
                        this.field10406[this.field10407 * arg1 + var72] = arg4;
                     }

                     var52 += var54;
                     ++arg1;
                     int var73 = var24 + var57;
                     var24 = var73 % var23;
                  }
               } else if (arg5 == 1) {
                  int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                  int var59 = 256 - var56;

                  while(arg1 <= var55) {
                     int var60 = var52 >> 16;
                     if (arg1 >= this.field10415 && arg1 < this.field10413 && var60 >= this.field10405 && var60 < this.field10411 && var24 < var21) {
                        int var61 = this.field10407 * arg1 + var60;
                        int var62 = this.field10406[var61];
                        int var63 = ((var62 & 65280) * var59 >> 8 & 65280) + ((var62 & 16711935) * var59 >> 8 & 16711935);
                        this.field10406[this.field10407 * arg1 + var60] = var58 + var63;
                     }

                     var52 += var54;
                     ++arg1;
                     int var64 = var24 + var57;
                     var24 = var64 % var23;
                  }
               } else {
                  if (arg5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(arg1 <= var55) {
                     int var65 = var52 >> 16;
                     if (arg1 >= this.field10415 && arg1 < this.field10413 && var65 >= this.field10405 && var65 < this.field10411 && var24 < var21) {
                        int var66 = this.field10407 * arg1 + var65;
                        int var67 = this.field10406[var66];
                        int var68 = arg4 + var67;
                        int var69 = (arg4 & 16711935) + (var67 & 16711935);
                        int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                        this.field10406[var66] = var68 - var70 | var70 - (var70 >>> 8);
                     }

                     var52 += var54;
                     ++arg1;
                     int var71 = var24 + var57;
                     var24 = var71 % var23;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.bm(IIIIIILta;II)V")
   public void method7518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8) {
      if (this.field10406 != null) {
         class962 var10 = (class962)arg6;
         int[] var11 = var10.field9621;
         int[] var12 = var10.field9622;
         int var13 = this.field10415 > arg8 ? this.field10415 : arg8;
         int var14 = this.field10413 < var11.length + arg8 ? this.field10413 : var11.length + arg8;
         int var15 = arg2 - arg0;
         int var16 = arg3 - arg1;
         if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
         }

         if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int)Math.floor((double)var19 / (double)var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field10405) {
               var18 += (this.field10405 - arg0) * var20;
               arg0 = this.field10405;
            }

            if (var21 >= this.field10411) {
               var21 = this.field10411 - 1;
            }

            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
               if (arg5 == 1) {
                  int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                  int var24 = 256 - var22;

                  while(arg0 <= var21) {
                     int var25 = var18 >> 16;
                     int var26 = var25 - arg8;
                     if (var25 >= var13 && var25 < var14) {
                        int var27 = var11[var26] + arg7;
                        if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                           int var28 = this.field10407 * var25 + arg0;
                           int var29 = this.field10406[var28];
                           int var30 = ((var29 & 65280) * var24 >> 8 & 65280) + ((var29 & 16711935) * var24 >> 8 & 16711935);
                           this.field10406[var28] = var23 + var30;
                        }
                     }

                     var18 += var20;
                     ++arg0;
                  }
               } else {
                  if (arg5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(arg0 <= var21) {
                     int var31 = var18 >> 16;
                     int var32 = var31 - arg8;
                     if (var31 >= var13 && var31 < var14) {
                        int var33 = var11[var32] + arg7;
                        if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                           int var34 = this.field10407 * var31 + arg0;
                           int var35 = this.field10406[var34];
                           int var36 = arg4 + var35;
                           int var37 = (arg4 & 16711935) + (var35 & 16711935);
                           int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                           this.field10406[var34] = var36 - var38 | var38 - (var38 >>> 8);
                        }
                     }

                     var18 += var20;
                     ++arg0;
                  }
               }
            } else {
               while(arg0 <= var21) {
                  int var39 = var18 >> 16;
                  int var40 = var39 - arg8;
                  if (var39 >= var13 && var39 < var14) {
                     int var41 = var11[var40] + arg7;
                     if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                        this.field10406[this.field10407 * var39 + arg0] = arg4;
                     }
                  }

                  var18 += var20;
                  ++arg0;
               }
            }
         } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int)Math.floor((double)var44 / (double)var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
               var43 += (var13 - arg1) * var45;
               arg1 = var13;
            }

            if (var46 >= var14) {
               var46 = var14 - 1;
            }

            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
               while(arg1 <= var46) {
                  int var64 = var43 >> 16;
                  int var65 = arg1 - arg8;
                  int var66 = var11[var65] + arg7;
                  if (var64 >= this.field10405 && var64 < this.field10411 && var64 >= var66 && var64 < var12[var65] + var66) {
                     this.field10406[this.field10407 * arg1 + var64] = arg4;
                  }

                  var43 += var45;
                  ++arg1;
               }
            } else if (arg5 == 1) {
               int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
               int var49 = 256 - var47;

               while(arg1 <= var46) {
                  int var50 = var43 >> 16;
                  int var51 = arg1 - arg8;
                  int var52 = var11[var51] + arg7;
                  if (var50 >= this.field10405 && var50 < this.field10411 && var50 >= var52 && var50 < var12[var51] + var52) {
                     int var53 = this.field10407 * arg1 + var50;
                     int var54 = this.field10406[var53];
                     int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                     this.field10406[this.field10407 * arg1 + var50] = var48 + var55;
                  }

                  var43 += var45;
                  ++arg1;
               }
            } else {
               if (arg5 != 2) {
                  throw new IllegalArgumentException();
               }

               while(arg1 <= var46) {
                  int var56 = var43 >> 16;
                  int var57 = arg1 - arg8;
                  int var58 = var11[var57] + arg7;
                  if (var56 >= this.field10405 && var56 < this.field10411 && var56 >= var58 && var56 < var12[var57] + var58) {
                     int var59 = this.field10407 * arg1 + var56;
                     int var60 = this.field10406[var59];
                     int var61 = arg4 + var60;
                     int var62 = (arg4 & 16711935) + (var60 & 16711935);
                     int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                     this.field10406[var59] = var61 - var63 | var63 - (var63 >>> 8);
                  }

                  var43 += var45;
                  ++arg1;
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yx.bn(IIIIIILta;IIIII)V")
   public void method7521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      if (this.field10406 != null) {
         class962 var13 = (class962)arg6;
         int[] var14 = var13.field9621;
         int[] var15 = var13.field9622;
         int var16 = this.field10415 > arg8 ? this.field10415 : arg8;
         int var17 = this.field10413 < var14.length + arg8 ? this.field10413 : var14.length + arg8;
         int var18 = arg11 << 8;
         int var19 = arg9 << 8;
         int var20 = arg10 << 8;
         int var21 = var19 + var20;
         int var22 = var18 % var21;
         int var23 = arg2 - arg0;
         int var24 = arg3 - arg1;
         if (var23 + var24 < 0) {
            int var25 = (int)(Math.sqrt((double)(var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
               var22 += var21;
            }

            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
         }

         if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int)Math.floor((double)var30 / (double)var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int)Math.sqrt((double)((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 == 0 || arg5 == 1 && var33 == 255) {
               while(arg0 <= var32) {
                  int var53 = var29 >> 16;
                  int var54 = var53 - arg8;
                  if (arg0 >= this.field10405 && arg0 < this.field10411 && var53 >= var16 && var53 < var17 && var22 < var19) {
                     int var55 = var14[var54] + arg7;
                     if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                        this.field10406[this.field10407 * var53 + arg0] = arg4;
                     }
                  }

                  var29 += var31;
                  ++arg0;
                  int var56 = var22 + var34;
                  var22 = var56 % var21;
               }
            } else if (arg5 == 1) {
               int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
               int var36 = 256 - var33;

               while(arg0 <= var32) {
                  int var37 = var29 >> 16;
                  int var38 = var37 - arg8;
                  if (arg0 >= this.field10405 && arg0 < this.field10411 && var37 >= var16 && var37 < var17 && var22 < var19) {
                     int var39 = var14[var38] + arg7;
                     if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                        int var40 = this.field10407 * var37 + arg0;
                        int var41 = this.field10406[var40];
                        int var42 = ((var41 & 65280) * var36 >> 8 & 65280) + ((var41 & 16711935) * var36 >> 8 & 16711935);
                        this.field10406[var40] = var35 + var42;
                     }
                  }

                  var29 += var31;
                  ++arg0;
                  int var43 = var22 + var34;
                  var22 = var43 % var21;
               }
            } else {
               if (arg5 != 2) {
                  throw new IllegalArgumentException();
               }

               while(arg0 <= var32) {
                  int var44 = var29 >> 16;
                  int var45 = var44 - arg8;
                  if (arg0 >= this.field10405 && arg0 < this.field10411 && var44 >= var16 && var44 < var17 && var22 < var19) {
                     int var46 = var14[var45] + arg7;
                     if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                        int var47 = this.field10407 * var44 + arg0;
                        int var48 = this.field10406[var47];
                        int var49 = arg4 + var48;
                        int var50 = (arg4 & 16711935) + (var48 & 16711935);
                        int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                        this.field10406[var47] = var49 - var51 | var51 - (var51 >>> 8);
                     }
                  }

                  var29 += var31;
                  ++arg0;
                  int var52 = var22 + var34;
                  var22 = var52 % var21;
               }
            }
         } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int)Math.floor((double)var59 / (double)var24 + 0.5D);
            int var61 = (int)Math.sqrt((double)((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
               while(arg1 <= var62) {
                  int var80 = var58 >> 16;
                  int var81 = arg1 - arg8;
                  if (arg1 >= var16 && arg1 < var17 && var80 >= this.field10405 && var80 < this.field10411 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                     this.field10406[this.field10407 * arg1 + var80] = arg4;
                  }

                  var58 += var60;
                  ++arg1;
                  int var82 = var22 + var61;
                  var22 = var82 % var21;
               }
            } else if (arg5 == 1) {
               int var64 = (var63 << 24) + ((arg4 & 65280) * var63 >> 8 & 65280) + ((arg4 & 16711935) * var63 >> 8 & 16711935);
               int var65 = 256 - var63;

               while(arg1 <= var62) {
                  int var66 = var58 >> 16;
                  int var67 = arg1 - arg8;
                  if (arg1 >= var16 && arg1 < var17 && var66 >= this.field10405 && var66 < this.field10411 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                     int var68 = this.field10407 * arg1 + var66;
                     int var69 = this.field10406[var68];
                     int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                     this.field10406[this.field10407 * arg1 + var66] = var64 + var70;
                  }

                  var58 += var60;
                  ++arg1;
                  int var71 = var22 + var61;
                  var22 = var71 % var21;
               }
            } else {
               if (arg5 != 2) {
                  throw new IllegalArgumentException();
               }

               while(arg1 <= var62) {
                  int var72 = var58 >> 16;
                  int var73 = arg1 - arg8;
                  if (arg1 >= var16 && arg1 < var17 && var72 >= this.field10405 && var72 < this.field10411 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                     int var74 = this.field10407 * arg1 + var72;
                     int var75 = this.field10406[var74];
                     int var76 = arg4 + var75;
                     int var77 = (arg4 & 16711935) + (var75 & 16711935);
                     int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                     this.field10406[var74] = var76 - var78 | var78 - (var78 >>> 8);
                  }

                  var58 += var60;
                  ++arg1;
                  int var79 = var22 + var61;
                  var22 = var79 % var21;
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("yx.bk(IIIIIII)V")
   public void method7727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field10406 != null) {
         class321 var8 = this.method16838(Thread.currentThread());
         class350 var9 = var8.field2014;
         int var10 = arg2 - arg0;
         int var11 = arg3 - arg1;
         int var12 = var10 >= 0 ? var10 : -var10;
         int var13 = var11 >= 0 ? var11 : -var11;
         int var14 = var12;
         if (var12 < var13) {
            var14 = var13;
         }

         if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
               var15 = -var15;
            } else {
               var16 = -var16;
            }

            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method4221();
            int var24 = arg1 - var9.method4222();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
               var9.field2213 = 0;
            } else {
               if (arg6 != 1) {
                  throw new IllegalArgumentException();
               }

               var9.field2213 = 255 - (arg4 >>> 24);
            }

            this.method7551(false);
            var9.field2238 = var25 < 0 || var25 > var9.field2225 * 824681839 || var26 < 0 || var26 > var9.field2225 * 824681839 || var27 < 0 || var27 > var9.field2225 * 824681839;
            var9.method4220(true, false, false, (float)var29, (float)var30, (float)var31, (float)var25, (float)var26, (float)var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field2238 = var25 < 0 || var25 > var9.field2225 * 824681839 || var27 < 0 || var27 > var9.field2225 * 824681839 || var28 < 0 || var28 > var9.field2225 * 824681839;
            var9.method4220(true, false, false, (float)var29, (float)var31, (float)var32, (float)var25, (float)var27, (float)var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method7551(true);
         }
      }
   }

   @deob.ObfuscatedName("yx.bo(IIIIII)I")
   public int method7523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = this.field10423.field5413[10] * (float)arg2 + this.field10423.field5413[6] * (float)arg1 + this.field10423.field5413[2] * (float)arg0 + this.field10423.field5413[14];
      float var9 = this.field10423.field5413[10] * (float)arg5 + this.field10423.field5413[6] * (float)arg4 + this.field10423.field5413[2] * (float)arg3 + this.field10423.field5413[14];
      float var10 = this.field10423.field5413[11] * (float)arg2 + this.field10423.field5413[7] * (float)arg1 + this.field10423.field5413[3] * (float)arg0 + this.field10423.field5413[15];
      float var11 = this.field10423.field5413[11] * (float)arg5 + this.field10423.field5413[7] * (float)arg4 + this.field10423.field5413[3] * (float)arg3 + this.field10423.field5413[15];
      if (var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if (var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.field10423.field5413[8] * (float)arg2 + this.field10423.field5413[4] * (float)arg1 + this.field10423.field5413[0] * (float)arg0 + this.field10423.field5413[12];
      float var13 = this.field10423.field5413[8] * (float)arg5 + this.field10423.field5413[4] * (float)arg4 + this.field10423.field5413[0] * (float)arg3 + this.field10423.field5413[12];
      if (var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if (var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.field10423.field5413[9] * (float)arg2 + this.field10423.field5413[5] * (float)arg1 + this.field10423.field5413[1] * (float)arg0 + this.field10423.field5413[13];
      float var15 = this.field10423.field5413[9] * (float)arg5 + this.field10423.field5413[5] * (float)arg4 + this.field10423.field5413[1] * (float)arg3 + this.field10423.field5413[13];
      if (var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if (var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   @deob.ObfuscatedName("yx.bj(I)Lv;")
   public class879 method7526(int arg0) {
      return null;
   }

   @deob.ObfuscatedName("yx.bv(Lv;)V")
   public void method7709(class879 arg0) {
   }

   @deob.ObfuscatedName("yx.bi(IIZZ)Lcy;")
   public class383 method7612(int arg0, int arg1, boolean arg2, boolean arg3) {
      return arg2 ? new class181(this, arg0, arg1) : new class176(this, arg0, arg1);
   }

   @deob.ObfuscatedName("yx.bz([IIIIIZ)Lcy;")
   public class383 method7654(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = false;
      int var8 = arg1;

      for(int var9 = 0; var9 < arg4; ++var9) {
         for(int var10 = 0; var10 < arg3; ++var10) {
            int var11 = arg0[var8++] >>> 24;
            if (var11 != 0 && var11 != 255) {
               var7 = true;
               return var7 ? new class181(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class176(this, arg0, arg1, arg2, arg3, arg4, arg5);
            }
         }
      }

      return var7 ? new class181(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class176(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("yx.be(Ldv;Z)Lcy;")
   public class383 method7529(class407 arg0, boolean arg1) {
      int var3 = arg0.method5551();
      int var4 = arg0.method5554();
      class986 var12;
      if (arg1 && !arg0.method5603() && arg0.method5562()) {
         class998 var5 = (class998)arg0;
         int[] var6 = new int[var5.field10578.length];
         byte[] var7 = new byte[var3 * var4];

         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = var3 * var8;

            for(int var10 = 0; var10 < var3; ++var10) {
               var7[var9 + var10] = var5.field10579[var9 + var10];
            }
         }

         for(int var11 = 0; var11 < var5.field10578.length; ++var11) {
            var6[var11] = var5.field10578[var11];
         }

         var12 = new class179(this, var7, var6, var3, var4);
      } else {
         int[] var13 = arg0.method5555(false);
         if (arg0.method5603()) {
            var12 = new class181(this, var13, var3, var4);
         } else {
            var12 = new class176(this, var13, var3, var4);
         }
      }

      var12.method5214(arg0.method5542(), arg0.method5544(), arg0.method5543(), arg0.method5545());
      return var12;
   }

   @deob.ObfuscatedName("yx.bb(IIIIZ)Lcy;")
   public class383 method7530(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      if (this.field10406 == null) {
         throw new IllegalStateException("");
      } else {
         int[] var6 = new int[arg2 * arg3];
         int var7 = this.field10407 * arg1 + arg0;
         int var8 = this.field10407 - arg2;

         for(int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;

            for(int var11 = 0; var11 < arg2; ++var11) {
               var6[var10 + var11] = this.field10406[var7++];
            }

            var7 += var8;
         }

         if (arg4) {
            return new class181(this, var6, arg2, arg3);
         } else {
            return new class176(this, var6, arg2, arg3);
         }
      }
   }

   @deob.ObfuscatedName("yx.co(II[I[I)Lta;")
   public class826 method7531(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class962(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("yx.DA(ILta;II)V")
   public void method7593(int arg0, class826 arg1, int arg2, int arg3) {
      if (this.field10406 != null) {
         class962 var5 = (class962)arg1;
         int[] var6 = var5.field9621;
         int[] var7 = var5.field9622;
         int var8;
         if (this.field10413 < var6.length + arg3) {
            var8 = this.field10413 - arg3;
         } else {
            var8 = var6.length;
         }

         int var9;
         if (this.field10415 > arg3) {
            var9 = this.field10415 - arg3;
            arg3 = this.field10415;
         } else {
            var9 = 0;
         }

         if (var8 - var9 > 0) {
            int var10 = this.field10407 * arg3;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var6[var11] + arg2;
               int var13 = var7[var11];
               if (this.field10405 > var12) {
                  var13 -= this.field10405 - var12;
                  var12 = this.field10405;
               }

               if (this.field10411 < var12 + var13) {
                  var13 = this.field10411 - var12;
               }

               int var14 = var10 + var12;

               for(int var15 = -var13; var15 < 0; ++var15) {
                  this.field10406[var14++] = arg0;
               }

               var10 += this.field10407;
            }

         }
      }
   }

   @deob.ObfuscatedName("yx.ca(Lvd;[Lzk;Z)Ll;")
   public class609 method7606(class883 arg0, class998[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].method5551();
         var5[var7] = arg1[var7].method5554();
         if (arg1[var7].method5603()) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class993(this, arg0, arg1, var4, var5);
         } else {
            return new class1012(this, arg0, arg1, var4, var5);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class1003(this, arg0, arg1, var4, var5);
      }
   }

   @deob.ObfuscatedName("yx.cj(I)V")
   public void method7695(int arg0) {
      class972.field9854 = arg0;
      class972.field9789 = arg0;
      if (this.field10416 > 1) {
         throw new IllegalStateException();
      } else {
         this.method16819(this.field10416);
         this.method16818(0);
      }
   }

   @deob.ObfuscatedName("yx.cw(Ldk;IIII)Lqa;")
   public class745 method7528(class396 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class972(this, arg0, arg1, arg3, arg4, arg2);
   }

   @deob.ObfuscatedName("yx.cd(II)I")
   public int method7534(int arg0, int arg1) {
      int var3 = arg0 | 133120;
      return var3 & arg1 ^ arg1;
   }

   @deob.ObfuscatedName("yx.ck(II)I")
   public int method7535(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @deob.ObfuscatedName("yx.cs(II[[I[[IIII)Lxa;")
   public class934 method7536(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class977(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("yx.ce()Lko;")
   public class597 method7509() {
      class321 var1 = this.method16838(Thread.currentThread());
      return var1.field2012;
   }

   @deob.ObfuscatedName("yx.cf()Lka;")
   public class583 method7763() {
      class321 var1 = this.method16838(Thread.currentThread());
      return var1.field2013;
   }

   @deob.ObfuscatedName("yx.ch()I")
   public int method7499() {
      return 0;
   }

   @deob.ObfuscatedName("yx.cu(IIIIIF)Lacy;")
   public class81 method11507(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return null;
   }

   @deob.ObfuscatedName("yx.cy(I[Lacy;)V")
   public void method7552(int arg0, class81[] arg1) {
   }

   @deob.ObfuscatedName("yx.nk(I)V")
   private void method16818(int arg0) {
      this.field10408[arg0].method3998(Thread.currentThread());
   }

   @deob.ObfuscatedName("yx.nl(I)V")
   private void method16819(int arg0) {
      this.field10416 = arg0;
      this.field10408 = new class321[this.field10416];

      for(int var2 = 0; var2 < this.field10416; ++var2) {
         this.field10408[var2] = new class321(this);
      }

   }

   @deob.ObfuscatedName("yx.nj(Ljava/lang/Runnable;)Laq;")
   public class321 method16838(Runnable arg0) {
      for(int var2 = 0; var2 < this.field10416; ++var2) {
         if (this.field10408[var2].field2040 == arg0) {
            return this.field10408[var2];
         }
      }

      return null;
   }

   @deob.ObfuscatedName("yx.cp(Ldf;)V")
   public void method7542(class391 arg0) {
      this.method16821(this.field10406 != null, this.field10414 != null, false, arg0);
   }

   @deob.ObfuscatedName("yx.na(ZZZLdf;)V")
   private void method16821(boolean arg0, boolean arg1, boolean arg2, class391 arg3) {
      class321 var5 = this.method16838(Thread.currentThread());

      for(class194 var6 = (class194)arg3.field2886.method14828(); var6 != null; var6 = (class194)arg3.field2886.method14821()) {
         int var7 = var6.field1246 >> 12;
         int var8 = var6.field1245 >> 12;
         int var9 = var6.field1244 >> 12;
         float var10 = this.field10423.field5413[10] * (float)var9 + this.field10423.field5413[2] * (float)var7 + this.field10423.field5413[6] * (float)var8 + this.field10423.field5413[14];
         float var11 = this.field10423.field5413[11] * (float)var9 + this.field10423.field5413[3] * (float)var7 + this.field10423.field5413[7] * (float)var8 + this.field10423.field5413[15];
         if (!(var10 < -var11)) {
            float var12 = this.field10403 * var10 / var11 + this.field10434;
            if (!(var10 > var5.field2004)) {
               float var13 = this.field10423.field5413[8] * (float)var9 + this.field10423.field5413[4] * (float)var8 + this.field10423.field5413[0] * (float)var7 + this.field10423.field5413[12];
               float var14 = this.field10423.field5413[9] * (float)var9 + this.field10423.field5413[1] * (float)var7 + this.field10423.field5413[5] * (float)var8 + this.field10423.field5413[13];
               if (!(var13 < -var11) && !(var13 > var11) && !(var14 < -var11) && !(var14 > var11)) {
                  float var15 = (float)var6.field1247 / 4096.0F;
                  float var16 = this.field10426.field5413[0] * var15 + var13;
                  float var17 = this.field10426.field5413[3] * var15 + var11;
                  float var18 = this.field10429 * var13 / var11 + this.field10430;
                  float var19 = this.field10431 * var14 / var11 + this.field10432;
                  float var20 = this.field10429 * var16 / var17 + this.field10430;
                  this.method16866(arg0, arg1, arg2, var6, (int)var18, (int)var19, var12, (int)(var20 < var18 ? var18 - var20 : var20 - var18));
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("yx.nr(ZZZLahc;IIFI)V")
   private void method16866(boolean arg0, boolean arg1, boolean arg2, class194 arg3, int arg4, int arg5, float arg6, int arg7) {
      int var9 = arg3.field1239;
      int var11 = arg7 << 1;
      if (var9 == -1) {
         this.method16867(arg1, arg4, arg5, arg6, arg7, arg3.field1241, 1);
      } else {
         if (this.field10440 != var9) {
            class383 var12 = (class383)this.field10438.method10909((long)var9);
            if (var12 == null) {
               int[] var13 = this.method16807(var9);
               if (var13 == null) {
                  return;
               }

               int var14 = this.field7118.method5112(var9).field2315;
               var12 = this.method11534(var13, 0, var14, var14, var14);
               this.field10438.method10880(var12, (long)var9);
            }

            this.field10440 = var9;
            this.field10439 = var12;
         }

         ++var11;
         ((class986)this.field10439).method2409(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, var11, var11, 0, arg3.field1241, 1, 1, false);
      }

   }

   @deob.ObfuscatedName("yx.ny(ZZZIIFIIIIII)V")
   public void method16822(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      if (arg6 != 0 && arg7 != 0) {
         if (arg8 != 65535) {
            class360 var13 = this.field7118.method5112(arg8);
            if (!var13.field2331) {
               if (this.field10440 != arg8) {
                  class383 var14 = (class383)this.field10438.method10909((long)arg8);
                  if (var14 == null) {
                     int[] var15 = this.method16807(arg8);
                     if (var15 == null) {
                        return;
                     }

                     int var16 = this.field7118.method5112(arg8).field2315;
                     var14 = this.method11534(var15, 0, var16, var16, var16);
                     this.field10438.method10880(var14, (long)arg8);
                  }

                  this.field10440 = arg8;
                  this.field10439 = var14;
               }

               ((class986)this.field10439).method2409(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, 1, class725.field6684 != var13.field2323);
               return;
            }
         }

         this.method16867(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
      }
   }

   @deob.ObfuscatedName("yx.nc(ZIIFIII)V")
   private void method16867(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6) {
      if (this.field10406 != null) {
         if (arg4 < 0) {
            arg4 = -arg4;
         }

         int var8 = arg2 - arg4;
         if (var8 < this.field10415) {
            var8 = this.field10415;
         }

         int var9 = arg2 + arg4 + 1;
         if (var9 > this.field10413) {
            var9 = this.field10413;
         }

         int var10 = var8;
         int var11 = arg4 * arg4;
         int var12 = 0;
         int var13 = arg2 - var8;
         int var14 = var13 * var13;
         int var15 = var14 - var13;
         if (arg2 > var9) {
            arg2 = var9;
         }

         int var16 = arg5 >>> 24;
         if (arg6 != 0 && (arg6 != 1 || var16 != 255)) {
            if (arg6 == 1) {
               int var17 = (var16 << 24) + ((arg5 & 65280) * var16 >> 8 & 65280) + ((arg5 & 16711935) * var16 >> 8 & 16711935);
               int var18 = 256 - var16;

               while(var10 < arg2) {
                  while(var15 <= var11 || var14 <= var11) {
                     var14 += var12 + var12;
                     var15 += var12++ + var12;
                  }

                  int var19 = arg1 - var12 + 1;
                  if (var19 < this.field10405) {
                     var19 = this.field10405;
                  }

                  int var20 = arg1 + var12;
                  if (var20 > this.field10411) {
                     var20 = this.field10411;
                  }

                  int var21 = this.field10407 * var10 + var19;

                  for(int var22 = var19; var22 < var20; ++var22) {
                     if (!arg0 || arg3 < this.field10414[var21]) {
                        int var23 = this.field10406[var21];
                        int var24 = ((var23 & 65280) * var18 >> 8 & 65280) + ((var23 & 16711935) * var18 >> 8 & 16711935);
                        this.field10406[var21] = var17 + var24;
                     }

                     ++var21;
                  }

                  ++var10;
                  var14 -= var13-- + var13;
                  var15 -= var13 + var13;
               }

               int var25 = arg4;
               int var26 = -var13;
               int var27 = var26 * var26 + var11;
               int var28 = var27 - arg4;
               int var29 = var27 - var26;

               while(var10 < var9) {
                  while(var29 > var11 && var28 > var11) {
                     var29 -= var25-- + var25;
                     var28 -= var25 + var25;
                  }

                  int var30 = arg1 - var25;
                  if (var30 < this.field10405) {
                     var30 = this.field10405;
                  }

                  int var31 = arg1 + var25;
                  if (var31 > this.field10411 - 1) {
                     var31 = this.field10411 - 1;
                  }

                  int var32 = this.field10407 * var10 + var30;

                  for(int var33 = var30; var33 <= var31; ++var33) {
                     if (!arg0 || arg3 < this.field10414[var32]) {
                        int var34 = this.field10406[var32];
                        int var35 = ((var34 & 65280) * var18 >> 8 & 65280) + ((var34 & 16711935) * var18 >> 8 & 16711935);
                        this.field10406[var32] = var17 + var35;
                     }

                     ++var32;
                  }

                  ++var10;
                  var29 += var26 + var26;
                  var28 += var26++ + var26;
               }
            } else {
               if (arg6 != 2) {
                  throw new IllegalArgumentException();
               }

               while(var10 < arg2) {
                  while(var15 <= var11 || var14 <= var11) {
                     var14 += var12 + var12;
                     var15 += var12++ + var12;
                  }

                  int var36 = arg1 - var12 + 1;
                  if (var36 < this.field10405) {
                     var36 = this.field10405;
                  }

                  int var37 = arg1 + var12;
                  if (var37 > this.field10411) {
                     var37 = this.field10411;
                  }

                  int var38 = this.field10407 * var10 + var36;

                  for(int var39 = var36; var39 < var37; ++var39) {
                     if (!arg0 || arg3 < this.field10414[var38]) {
                        int var40 = this.field10406[var38];
                        int var41 = arg5 + var40;
                        int var42 = (arg5 & 16711935) + (var40 & 16711935);
                        int var43 = (var41 - var42 & 65536) + (var42 & 16777472);
                        this.field10406[var38] = var41 - var43 | var43 - (var43 >>> 8);
                     }

                     ++var38;
                  }

                  ++var10;
                  var14 -= var13-- + var13;
                  var15 -= var13 + var13;
               }

               int var44 = arg4;
               int var45 = -var13;
               int var46 = var45 * var45 + var11;
               int var47 = var46 - arg4;
               int var48 = var46 - var45;

               while(var10 < var9) {
                  while(var48 > var11 && var47 > var11) {
                     var48 -= var44-- + var44;
                     var47 -= var44 + var44;
                  }

                  int var49 = arg1 - var44;
                  if (var49 < this.field10405) {
                     var49 = this.field10405;
                  }

                  int var50 = arg1 + var44;
                  if (var50 > this.field10411 - 1) {
                     var50 = this.field10411 - 1;
                  }

                  int var51 = this.field10407 * var10 + var49;

                  for(int var52 = var49; var52 <= var50; ++var52) {
                     if (!arg0 || arg3 < this.field10414[var51]) {
                        int var53 = this.field10406[var51];
                        int var54 = arg5 + var53;
                        int var55 = (arg5 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field10406[var51] = var54 - var56 | var56 - (var56 >>> 8);
                     }

                     ++var51;
                  }

                  ++var10;
                  var48 += var45 + var45;
                  var47 += var45++ + var45;
               }
            }
         } else {
            while(var10 < arg2) {
               while(var15 <= var11 || var14 <= var11) {
                  var14 += var12 + var12;
                  var15 += var12++ + var12;
               }

               int var57 = arg1 - var12 + 1;
               if (var57 < this.field10405) {
                  var57 = this.field10405;
               }

               int var58 = arg1 + var12;
               if (var58 > this.field10411) {
                  var58 = this.field10411;
               }

               int var59 = this.field10407 * var10 + var57;

               for(int var60 = var57; var60 < var58; ++var60) {
                  if (!arg0 || arg3 < this.field10414[var59]) {
                     this.field10406[var59] = arg5;
                  }

                  ++var59;
               }

               ++var10;
               var14 -= var13-- + var13;
               var15 -= var13 + var13;
            }

            int var61 = arg4;
            int var62 = var10 - arg2;
            int var63 = var62 * var62 + var11;
            int var64 = var63 - arg4;
            int var65 = var63 - var62;

            while(var10 < var9) {
               while(var65 > var11 && var64 > var11) {
                  var65 -= var61-- + var61;
                  var64 -= var61 + var61;
               }

               int var66 = arg1 - var61;
               if (var66 < this.field10405) {
                  var66 = this.field10405;
               }

               int var67 = arg1 + var61;
               if (var67 > this.field10411 - 1) {
                  var67 = this.field10411 - 1;
               }

               int var68 = this.field10407 * var10 + var66;

               for(int var69 = var66; var69 <= var67; ++var69) {
                  if (!arg0 || arg3 < this.field10414[var68]) {
                     this.field10406[var68] = arg5;
                  }

                  ++var68;
               }

               ++var10;
               var65 += var62 + var62;
               var64 += var62++ + var62;
            }

            return;
         }

      }
   }

   @deob.ObfuscatedName("yx.cv(Lka;)V")
   public void method7778(class583 arg0) {
      this.field10412 = arg0;
      this.method16811();
   }

   @deob.ObfuscatedName("yx.cr()Lka;")
   public class583 method7544() {
      return new class583(this.field10412);
   }

   @deob.ObfuscatedName("yx.cc(Lko;)V")
   public void method7545(class597 arg0) {
      this.field10426.method8386(arg0);
      this.method16811();
   }

   @deob.ObfuscatedName("yx.cx()Lko;")
   public class597 method7498() {
      return new class597(this.field10426);
   }

   @deob.ObfuscatedName("yx.IA(F)V")
   public void method7547(float arg0) {
      this.field10419 = (int)(arg0 * 65535.0F);
   }

   @deob.ObfuscatedName("yx.m(IFFFFF)V")
   public void method7588(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field10417 = (int)(arg1 * 65535.0F);
      this.field10409 = (int)(arg2 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
      this.field10420 = (int)(arg3 * 65535.0F / var7);
      this.field10435 = (int)(arg4 * 65535.0F / var7);
      this.field10410 = (int)(arg5 * 65535.0F / var7);
   }

   @deob.ObfuscatedName("yx.J(I)V")
   public void method7549(int arg0) {
   }

   @deob.ObfuscatedName("yx.c(III)V")
   public void method7550(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field10408.length; ++var4) {
         class321 var5 = this.field10408[var4];
         var5.field2006 = arg0 & 16777215;
         int var6 = var5.field2006 >>> 16 & 255;
         if (var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.field2006 >> 8 & 255;
         if (var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.field2006 & 255;
         if (var8 < 2) {
            var8 = 2;
         }

         var5.field2006 = var6 << 16 | var7 << 8 | var8;
         if (arg1 < 0) {
            var5.field2003 = false;
         } else {
            var5.field2003 = true;
         }
      }

   }

   @deob.ObfuscatedName("yx.nv()V")
   private void method16811() {
      this.field10421.method8391(this.field10412);
      this.field10423.method8386(this.field10421);
      this.field10423.method8388(this.field10426);
      this.field10423.method8409(this.field10424[0]);
      this.field10423.method8410(this.field10424[1]);
      this.field10423.method8405(this.field10424[2]);
      this.field10423.method8406(this.field10424[3]);
      this.field10423.method8464(this.field10424[4]);
      this.field10423.method8408(this.field10424[5]);
      float var1 = this.field10426.method8402();
      float var2 = (var1 - 255.0F) * this.field10426.field5413[10] + this.field10426.field5413[14];
      float var3 = this.field10426.field5413[10] * var1 + this.field10426.field5413[14];
      float var4 = var3 - var2;

      for(int var5 = 0; var5 < this.field10416; ++var5) {
         class321 var6 = this.field10408[var5];
         var6.field2004 = var2;
         var6.field2018 = var4;
      }

   }

   @deob.ObfuscatedName("yx.cl(IIIIII)Ldo;")
   public class400 method7553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @deob.ObfuscatedName("yx.cb(Ldo;Ldo;FLdo;)Ldo;")
   public class400 method2521(class400 arg0, class400 arg1, float arg2, class400 arg3) {
      return null;
   }

   @deob.ObfuscatedName("yx.ci(Ldo;)V")
   public void method7560(class400 arg0) {
   }

   @deob.ObfuscatedName("yx.cz()Z")
   public boolean method7558() {
      return false;
   }

   @deob.ObfuscatedName("yx.ct()V")
   public void method7559() {
   }

   @deob.ObfuscatedName("yx.cn()Z")
   public boolean method7574() {
      return false;
   }

   @deob.ObfuscatedName("yx.dr(FFFFFF)V")
   protected void method7561(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
   }

   @deob.ObfuscatedName("yx.do(IIII)V")
   public void method7556(int arg0, int arg1, int arg2, int arg3) {
   }

   @deob.ObfuscatedName("yx.df()V")
   public void method7557() {
   }

   @deob.ObfuscatedName("yx.dk(ILdq;)V")
   public void method7565(int arg0, class402 arg1) {
      for(int var3 = 0; var3 < this.field10408.length; ++var3) {
         this.field10408[var3].field2007 = this.field10408[var3].field2006;
         this.field10408[var3].field2039 = arg0;
         this.field10408[var3].field2006 = arg1.field2965;
         this.field10408[var3].field2010 = arg1.field2964;
         this.field10408[var3].field2008 = true;
      }

   }

   @deob.ObfuscatedName("yx.de(ILdq;)V")
   public void method7562(int arg0, class402 arg1) {
      class321 var3 = this.method16838(Thread.currentThread());
      var3.field2039 = arg0;
      var3.field2006 = arg1.field2965;
      var3.field2010 = arg1.field2964;
   }

   @deob.ObfuscatedName("yx.O()V")
   public void method7564() {
      for(int var1 = 0; var1 < this.field10408.length; ++var1) {
         this.field10408[var1].field2006 = this.field10408[var1].field2007;
         this.field10408[var1].field2008 = false;
      }

   }

   @deob.ObfuscatedName("yx.by(IIFIIFIIFIIII)V")
   public void method7475(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
      boolean var14 = this.field10406 != null;
      boolean var15 = this.field10414 != null;
      if (var14 || var15) {
         class321 var16 = this.method16838(Thread.currentThread());
         class350 var17 = var16.field2014;
         var17.field2229 = false;
         int var18 = arg0 - this.field10405;
         int var19 = arg3 - this.field10405;
         int var20 = arg6 - this.field10405;
         int var21 = arg1 - this.field10415;
         int var22 = arg4 - this.field10415;
         int var23 = arg7 - this.field10415;
         var17.field2238 = var18 < 0 || var18 > var17.field2225 * 824681839 || var19 < 0 || var19 > var17.field2225 * 824681839 || var20 < 0 || var20 > var17.field2225 * 824681839;
         int var24 = arg9 >>> 24;
         if (arg12 == 0 || arg12 == 1 && var24 == 255) {
            var17.field2213 = 0;
            var17.field2212 = false;
            var17.method4226(var14, var15, false, (float)var21, (float)var22, (float)var23, (float)var18, (float)var19, (float)var20, arg2, arg5, arg8, arg9, arg10, arg11);
         } else if (arg12 == 1) {
            var17.field2213 = 255 - var24;
            var17.field2212 = false;
            var17.method4226(var14, var15, false, (float)var21, (float)var22, (float)var23, (float)var18, (float)var19, (float)var20, arg2, arg5, arg8, arg9, arg10, arg11);
         } else {
            if (arg12 != 2) {
               throw new IllegalArgumentException();
            }

            var17.field2213 = 128;
            var17.field2212 = true;
            var17.method4226(var14, var15, false, (float)var21, (float)var22, (float)var23, (float)var18, (float)var19, (float)var20, arg2, arg5, arg8, arg9, arg10, arg11);
         }

         var17.field2229 = true;
      }
   }

   @deob.ObfuscatedName("yx.dh(FFF[F)V")
   public void method7736(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field10423.field5413[11] * arg2 + this.field10423.field5413[7] * arg1 + this.field10423.field5413[3] * arg0 + this.field10423.field5413[15];
      float var6 = this.field10423.field5413[8] * arg2 + this.field10423.field5413[4] * arg1 + this.field10423.field5413[0] * arg0 + this.field10423.field5413[12];
      float var7 = this.field10423.field5413[9] * arg2 + this.field10423.field5413[5] * arg1 + this.field10423.field5413[1] * arg0 + this.field10423.field5413[13];
      float var8 = this.field10421.field5413[10] * arg2 + this.field10421.field5413[6] * arg1 + this.field10421.field5413[2] * arg0 + this.field10421.field5413[14];
      arg3[0] = this.field10429 * var6 / var5 + this.field10430;
      arg3[1] = this.field10431 * var7 / var5 + this.field10432;
      arg3[2] = var8;
   }

   @deob.ObfuscatedName("yx.dp(FFF[F)V")
   public void method7525(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field10423.field5413[10] * arg2 + this.field10423.field5413[6] * arg1 + this.field10423.field5413[2] * arg0 + this.field10423.field5413[14];
      float var6 = this.field10423.field5413[11] * arg2 + this.field10423.field5413[7] * arg1 + this.field10423.field5413[3] * arg0 + this.field10423.field5413[15];
      if (!(var5 < -var6) && !(var5 > var6)) {
         float var7 = this.field10423.field5413[8] * arg2 + this.field10423.field5413[4] * arg1 + this.field10423.field5413[0] * arg0 + this.field10423.field5413[12];
         if (!(var7 < -var6) && !(var7 > var6)) {
            float var8 = this.field10423.field5413[9] * arg2 + this.field10423.field5413[5] * arg1 + this.field10423.field5413[1] * arg0 + this.field10423.field5413[13];
            if (!(var8 < -var6) && !(var8 > var6)) {
               float var9 = this.field10421.field5413[10] * arg2 + this.field10421.field5413[6] * arg1 + this.field10421.field5413[2] * arg0 + this.field10421.field5413[14];
               arg3[0] = this.field10429 * var7 / var6 + this.field10430;
               arg3[1] = this.field10431 * var8 / var6 + this.field10432;
               arg3[2] = var9;
            } else {
               arg3[2] = Float.NaN;
               arg3[1] = Float.NaN;
               arg3[0] = Float.NaN;
            }
         } else {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
         }
      } else {
         arg3[2] = Float.NaN;
         arg3[1] = Float.NaN;
         arg3[0] = Float.NaN;
      }
   }

   @deob.ObfuscatedName("yx.ar()Lym;")
   public class973 method2513() {
      return new class188(this);
   }

   @deob.ObfuscatedName("yx.ok(II)Ldm;")
   private class398 method16823(int arg0, int arg1) {
      return new class317(arg0, arg1);
   }

   @deob.ObfuscatedName("yx.as(IILcn;Ldt;I)Ldm;")
   public class398 method2679(int arg0, int arg1, class372 arg2, class405 arg3, int arg4) {
      return this.method16823(arg0, arg1);
   }

   @deob.ObfuscatedName("yx.au(II)Ldh;")
   public class393 method2514(int arg0, int arg1) {
      return new class349(arg0, arg1);
   }

   @deob.ObfuscatedName("yx.ad(III)Ldh;")
   public class393 method2649(int arg0, int arg1, int arg2) {
      return new class349(arg0, arg1);
   }
}
