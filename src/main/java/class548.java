import java.awt.Canvas;

@deob.ObfuscatedName("ja")
public class class548 extends class772 implements class853 {
   public long nativeid = 0L;
   @deob.ObfuscatedName("ja.j")
   private boolean field4397 = false;
   @deob.ObfuscatedName("ja.ai")
   private class849 field4367 = new class849();
   @deob.ObfuscatedName("ja.ap")
   private int field4368 = 4096;
   @deob.ObfuscatedName("ja.av")
   private int field4369 = 4096;
   @deob.ObfuscatedName("ja.bg")
   private boolean field4366 = false;
   @deob.ObfuscatedName("ja.ax")
   private class597 field4370;
   @deob.ObfuscatedName("ja.af")
   private class583 field4371;
   @deob.ObfuscatedName("ja.ah")
   private class597 field4373;
   @deob.ObfuscatedName("ja.aw")
   private class597 field4380;
   @deob.ObfuscatedName("ja.al")
   private class597 field4375;
   @deob.ObfuscatedName("ja.au")
   private static int[] field4392 = new int[Math.max(Math.max(104, 20), 24573)];
   @deob.ObfuscatedName("ja.ad")
   private static float[] field4391 = new float[20];
   @deob.ObfuscatedName("ja.am")
   public static int[] field4388 = new int[6];
   @deob.ObfuscatedName("ja.aj")
   private static int[] field4389 = field4392;
   @deob.ObfuscatedName("ja.ac")
   private static float[] field4390 = field4391;
   @deob.ObfuscatedName("ja.ay")
   public static int[] field4379 = field4392;
   @deob.ObfuscatedName("ja.bf")
   private static int[] field4394 = field4392;
   @deob.ObfuscatedName("ja.bp")
   private static int[] field4393 = new int[8191];
   @deob.ObfuscatedName("ja.bs")
   private static int[] field4374 = new int[8191];
   @deob.ObfuscatedName("ja.br")
   private static short[] field4387 = new short[8191];
   @deob.ObfuscatedName("ja.ba")
   private static byte[] field4396 = new byte[8191];
   @deob.ObfuscatedName("ja.an")
   private float field4376;
   @deob.ObfuscatedName("ja.ag")
   private float field4377;
   @deob.ObfuscatedName("ja.ak")
   private float field4378;
   @deob.ObfuscatedName("ja.aa")
   private float field4395;
   @deob.ObfuscatedName("ja.ao")
   public int field4365;
   @deob.ObfuscatedName("ja.f")
   private class332 field4385;
   @deob.ObfuscatedName("ja.at")
   private class583 field4372;
   @deob.ObfuscatedName("ja.ab")
   private class1[] field4381;

   public class548(Canvas arg0, class637 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class926.method5940().method9973("sw3d")) {
            throw new RuntimeException("");
         } else {
            class374.method5052();
            this.method7632(this.field7118, this.field7118.method5135(), 0);
            class789.method6469(false, true);
            this.field4366 = true;
            this.field4370 = new class597();
            new class584();
            this.field4371 = new class583();
            new class606();
            this.field4373 = new class597();
            this.field4380 = new class597();
            this.field4375 = new class597();
            this.method7778(new class583());
            this.method7545(new class597());
            this.method7605(1);
            this.method7540(0);
            if (arg0 != null) {
               this.method11495(arg0, arg2, arg3);
               this.method11519(arg0);
            }

            int var5 = this.field7118.method5135();

            for(short var6 = 0; var6 < var5; ++var6) {
               class360 var7 = this.field7118.method5112(var6);
               if (var7 != null) {
                  this.method7483(var6, var7.field2322, var7.field2323.method9329(), var7.field2324, var7.field2325, var7.field2337, var7.field2315 == 64, var7.field2328, var7.field2307, var7.field2330, var7.field2317, var7.field2331, var7.field2333, var7.field2334, var7.field2320, var7.field2336, var7.field2335, var7.field2332, var7.field2339, var7.field2340);
               }
            }

         }
      } catch (Throwable var9) {
         this.method11494();
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("ja.h()V")
   private void method7485() {
      System.gc();
      System.runFinalization();
      class374.method5048();
   }

   public synchronized void finalize() {
      this.method11494();
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("ja.nu(Ldf;Z)V")
   private void method7487(class391 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class194 var8 = (class194)arg0.field2886.method14828(); var8 != null; var8 = (class194)arg0.field2886.method14821()) {
         field4394[var3++] = var8.field1246;
         field4394[var3++] = var8.field1245;
         field4394[var3++] = var8.field1244;
         field4393[var4++] = var8.field1241;
         field4387[var6++] = (short)var8.field1239;
         field4374[var5++] = var8.field1247;
         if (arg1) {
            field4396[var7++] = var8.field1248;
         }
      }

   }

   @deob.ObfuscatedName("ja.s()Lcz;")
   public class384 method2505() {
      return new class384(0, "SSE", 1, "CPU", 0L);
   }

   @deob.ObfuscatedName("ja.u(II)V")
   protected void method2745(int arg0, int arg1) throws class165 {
      class988 var3 = (class988)this.method11498();
      if (var3 == null) {
         throw new IllegalStateException();
      } else {
         var3.method543(arg0, arg1);
         if (this.field7118 != null) {
            this.field7118.method5113();
         }

      }
   }

   @deob.ObfuscatedName("ja.v()V")
   public void method2507() {
   }

   @deob.ObfuscatedName("ja.e()V")
   protected void method2508() {
      if (!this.field4397) {
         this.field4381 = null;
         this.field4385 = null;
         this.field4370 = null;

         for(class332 var1 = (class332)this.field4367.method14964(); var1 != null; var1 = (class332)this.field4367.method15006()) {
            var1.method4112();
         }

         this.field4367.method14958();
         this.method7477();
         if (this.field4366) {
            class789.method9269(false, true);
            this.field4366 = false;
         }

         this.method7485();
         class374.method5056();
         this.field4397 = true;
      }
   }

   @deob.ObfuscatedName("ja.i(I)V")
   public void method2580(int arg0) {
      class374.method5048();
      this.method7478(arg0);

      for(class332 var2 = (class332)this.field4367.method14964(); var2 != null; var2 = (class332)this.field4367.method15006()) {
         var2.method4118();
      }

   }

   @deob.ObfuscatedName("ja.t()Z")
   public boolean method7489() {
      return true;
   }

   @deob.ObfuscatedName("ja.w()Z")
   public boolean method7490() {
      return true;
   }

   @deob.ObfuscatedName("ja.j()Z")
   public boolean method7491() {
      return true;
   }

   @deob.ObfuscatedName("ja.ai()Z")
   public boolean method7492() {
      return false;
   }

   @deob.ObfuscatedName("ja.ap()Z")
   public boolean method7668() {
      return false;
   }

   @deob.ObfuscatedName("ja.f()Z")
   public boolean method7494() {
      return true;
   }

   @deob.ObfuscatedName("ja.av()Z")
   public boolean method7495() {
      return false;
   }

   @deob.ObfuscatedName("ja.ax()Z")
   public boolean method7496() {
      return true;
   }

   @deob.ObfuscatedName("ja.af()Z")
   public boolean method7497() {
      return true;
   }

   @deob.ObfuscatedName("ja.at()Z")
   public boolean method7484() {
      return true;
   }

   @deob.ObfuscatedName("ja.ch()I")
   public int method7499() {
      return 4;
   }

   @deob.ObfuscatedName("ja.dc(Z)V")
   public void method2506(boolean arg0) {
   }

   @deob.ObfuscatedName("ja.aj()V")
   public void method2520() {
   }

   @deob.ObfuscatedName("ja.aq(Ljava/awt/Canvas;II)Lyc;")
   protected class963 method2512(Canvas arg0, int arg1, int arg2) {
      return new class988(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ja.ac()V")
   public void method7503() {
      this.field4376 = (float)this.method11517().method566() / 2.0F;
      this.field4378 = (float)this.method11517().method559() / 2.0F;
      this.field4377 = this.field4376;
      this.field4395 = this.field4378;
      this.method7504();
   }

   @deob.ObfuscatedName("ja.ay(IIII)V")
   public void method7505(int arg0, int arg1, int arg2, int arg3) {
      this.field4376 = (float)arg2 / 2.0F;
      this.field4378 = (float)arg3 / 2.0F;
      this.field4377 = (float)arg0 + this.field4376;
      this.field4395 = (float)arg1 + this.field4378;
      this.method7532(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ja.bq(IIIIII)V")
   public void method7751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method7514(arg0, arg1, arg2, arg4, arg5);
      this.method7514(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method7516(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method7516(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @deob.ObfuscatedName("ja.by(IIFIIFIIFIIII)V")
   public void method7475(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ja.bx(IIIIII)V")
   public void method7517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method7744(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ja.bm(IIIIIILta;II)V")
   public void method7518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8) {
      this.method7476(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @deob.ObfuscatedName("ja.bk(IIIIIII)V")
   public void method7727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method7541().method11(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("ja.bn(IIIIIILta;IIIII)V")
   public void method7521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @deob.ObfuscatedName("ja.bh(IIIIIIIII)V")
   public void method7522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @deob.ObfuscatedName("ja.bo(IIIIII)I")
   public int method7523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = this.field4375.field5413[10] * (float)arg2 + this.field4375.field5413[6] * (float)arg1 + this.field4375.field5413[2] * (float)arg0 + this.field4375.field5413[14];
      float var9 = this.field4375.field5413[10] * (float)arg5 + this.field4375.field5413[6] * (float)arg4 + this.field4375.field5413[2] * (float)arg3 + this.field4375.field5413[14];
      float var10 = this.field4375.field5413[11] * (float)arg2 + this.field4375.field5413[7] * (float)arg1 + this.field4375.field5413[3] * (float)arg0 + this.field4375.field5413[15];
      float var11 = this.field4375.field5413[11] * (float)arg5 + this.field4375.field5413[7] * (float)arg4 + this.field4375.field5413[3] * (float)arg3 + this.field4375.field5413[15];
      if (var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if (var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.field4375.field5413[8] * (float)arg2 + this.field4375.field5413[4] * (float)arg1 + this.field4375.field5413[0] * (float)arg0 + this.field4375.field5413[12];
      float var13 = this.field4375.field5413[8] * (float)arg5 + this.field4375.field5413[4] * (float)arg4 + this.field4375.field5413[0] * (float)arg3 + this.field4375.field5413[12];
      if (var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if (var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.field4375.field5413[9] * (float)arg2 + this.field4375.field5413[5] * (float)arg1 + this.field4375.field5413[1] * (float)arg0 + this.field4375.field5413[13];
      float var15 = this.field4375.field5413[9] * (float)arg5 + this.field4375.field5413[5] * (float)arg4 + this.field4375.field5413[1] * (float)arg3 + this.field4375.field5413[13];
      if (var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if (var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   @deob.ObfuscatedName("ja.dh(FFF[F)V")
   public void method7736(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field4375.field5413[11] * arg2 + this.field4375.field5413[7] * arg1 + this.field4375.field5413[3] * arg0 + this.field4375.field5413[15];
      float var6 = this.field4375.field5413[8] * arg2 + this.field4375.field5413[4] * arg1 + this.field4375.field5413[0] * arg0 + this.field4375.field5413[12];
      float var7 = this.field4375.field5413[9] * arg2 + this.field4375.field5413[5] * arg1 + this.field4375.field5413[1] * arg0 + this.field4375.field5413[13];
      float var8 = this.field4373.field5413[10] * arg2 + this.field4373.field5413[6] * arg1 + this.field4373.field5413[2] * arg0 + this.field4373.field5413[14];
      arg3[0] = this.field4376 * var6 / var5 + this.field4377;
      arg3[1] = this.field4378 * var7 / var5 + this.field4395;
      arg3[2] = var8;
   }

   @deob.ObfuscatedName("ja.dp(FFF[F)V")
   public void method7525(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field4375.field5413[10] * arg2 + this.field4375.field5413[6] * arg1 + this.field4375.field5413[2] * arg0 + this.field4375.field5413[14];
      float var6 = this.field4375.field5413[11] * arg2 + this.field4375.field5413[7] * arg1 + this.field4375.field5413[3] * arg0 + this.field4375.field5413[15];
      if (!(var5 < -var6) && !(var5 > var6)) {
         float var7 = this.field4375.field5413[8] * arg2 + this.field4375.field5413[4] * arg1 + this.field4375.field5413[0] * arg0 + this.field4375.field5413[12];
         if (!(var7 < -var6) && !(var7 > var6)) {
            float var8 = this.field4375.field5413[9] * arg2 + this.field4375.field5413[5] * arg1 + this.field4375.field5413[1] * arg0 + this.field4375.field5413[13];
            if (!(var8 < -var6) && !(var8 > var6)) {
               float var9 = this.field4373.field5413[10] * arg2 + this.field4373.field5413[6] * arg1 + this.field4373.field5413[2] * arg0 + this.field4373.field5413[14];
               arg3[0] = this.field4376 * var7 / var6 + this.field4377;
               arg3[1] = this.field4378 * var8 / var6 + this.field4395;
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

   @deob.ObfuscatedName("ja.bj(I)Lv;")
   public class879 method7526(int arg0) {
      class332 var2 = new class332(this, arg0);
      this.field4367.method14959(var2);
      return var2;
   }

   @deob.ObfuscatedName("ja.bv(Lv;)V")
   public void method7709(class879 arg0) {
      this.field4385 = (class332)arg0;
      this.method7703(arg0);
   }

   @deob.ObfuscatedName("ja.bi(IIZZ)Lcy;")
   public class383 method7612(int arg0, int arg1, boolean arg2, boolean arg3) {
      return new class440(this, arg0, arg1, arg3);
   }

   @deob.ObfuscatedName("ja.bz([IIIIIZ)Lcy;")
   public class383 method7654(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class440(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @deob.ObfuscatedName("ja.be(Ldv;Z)Lcy;")
   public class383 method7529(class407 arg0, boolean arg1) {
      class440 var3 = new class440(this, arg0.method5555(false), 0, arg0.method5551(), arg0.method5551(), arg0.method5554(), false);
      var3.method5214(arg0.method5542(), arg0.method5544(), arg0.method5543(), arg0.method5545());
      return var3;
   }

   @deob.ObfuscatedName("ja.bb(IIIIZ)Lcy;")
   public class383 method7530(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class440(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @deob.ObfuscatedName("ja.co(II[I[I)Lta;")
   public class826 method7531(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class907(this, this.field4385, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ja.ca(Lvd;[Lzk;Z)Ll;")
   public class609 method7606(class883 arg0, class998[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field10574;
         var5[var7] = arg1[var7].field10572;
         if (arg1[var7].field10573 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            return new class413(this, this.field4385, arg0, arg1, (class383[])null);
         } else {
            return new class636(this, this.field4385, arg0, arg1, (class383[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException("");
      } else {
         return new class521(this, this.field4385, arg0, arg1, (class383[])null);
      }
   }

   @deob.ObfuscatedName("ja.cj(I)V")
   public void method7695(int arg0) {
      this.field4368 = this.field4369 = arg0;
      if (this.field4365 > 1) {
         throw new IllegalStateException();
      } else {
         this.method7605(this.field4365);
         this.method7540(0);
      }
   }

   @deob.ObfuscatedName("ja.cw(Ldk;IIII)Lqa;")
   public class745 method7528(class396 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class493(this, this.field4385, arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("ja.cd(II)I")
   public int method7534(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @deob.ObfuscatedName("ja.ck(II)I")
   public int method7535(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @deob.ObfuscatedName("ja.cs(II[[I[[IIII)Lxa;")
   public class934 method7536(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class520(this, this.field4385, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("ja.ce()Lko;")
   public class597 method7509() {
      return this.field4370;
   }

   @deob.ObfuscatedName("ja.cf()Lka;")
   public class583 method7763() {
      return this.field4371;
   }

   @deob.ObfuscatedName("ja.ne(I)V")
   private void method7605(int arg0) {
      this.field4365 = arg0;
      this.field4381 = new class1[this.field4365];

      for(int var2 = 0; var2 < this.field4365; ++var2) {
         this.field4381[var2] = new class1(this, this.field4368, this.field4369);
      }

   }

   @deob.ObfuscatedName("ja.np(I)V")
   private void method7540(int arg0) {
      this.field4381[arg0].method2();
   }

   @deob.ObfuscatedName("ja.nk()La;")
   public class1 method7541() {
      for(int var1 = 0; var1 < this.field4365; ++var1) {
         if (this.field4381[var1].field4 == Thread.currentThread()) {
            return this.field4381[var1];
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ja.cp(Ldf;)V")
   public void method7542(class391 arg0) {
      if (!arg0.field2886.method14825()) {
         this.method7487(arg0, false);
         this.method7541().method28(this, field4394, field4393, field4374, field4387, arg0.field2886.method14823());
      }
   }

   @deob.ObfuscatedName("ja.cv(Lka;)V")
   public void method7778(class583 arg0) {
      this.field4372 = arg0;
      this.field4373.method8391(arg0);
      this.method7590(this.field4373.field5413);
      this.field4375.method8387(this.field4373, this.field4380);
   }

   @deob.ObfuscatedName("ja.cr()Lka;")
   public class583 method7544() {
      return this.field4372;
   }

   @deob.ObfuscatedName("ja.cc(Lko;)V")
   public void method7545(class597 arg0) {
      this.field4380 = arg0;
      this.method7743(this.field4380.field5413);
      this.field4375.method8387(this.field4373, this.field4380);
   }

   @deob.ObfuscatedName("ja.cx()Lko;")
   public class597 method7498() {
      return this.field4380;
   }

   @deob.ObfuscatedName("ja.cy(I[Lacy;)V")
   public void method7552(int arg0, class81[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field4389[var3++] = arg1[var4].method1123();
         field4389[var3++] = arg1[var4].method1110();
         field4389[var3++] = arg1[var4].method1111();
         field4389[var3++] = arg1[var4].method1112();
         field4390[var4] = arg1[var4].method1114();
         field4389[var3++] = arg1[var4].method1113();
      }

      this.method7480(arg0, field4389, field4390);
   }

   @deob.ObfuscatedName("ja.cl(IIIIII)Ldo;")
   public class400 method7553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @deob.ObfuscatedName("ja.cb(Ldo;Ldo;FLdo;)Ldo;")
   public class400 method2521(class400 arg0, class400 arg1, float arg2, class400 arg3) {
      return null;
   }

   @deob.ObfuscatedName("ja.ci(Ldo;)V")
   public void method7560(class400 arg0) {
   }

   @deob.ObfuscatedName("ja.do(IIII)V")
   public void method7556(int arg0, int arg1, int arg2, int arg3) {
   }

   @deob.ObfuscatedName("ja.df()V")
   public void method7557() {
   }

   @deob.ObfuscatedName("ja.cz()Z")
   public boolean method7558() {
      return false;
   }

   @deob.ObfuscatedName("ja.ct()V")
   public void method7559() {
   }

   @deob.ObfuscatedName("ja.cn()Z")
   public boolean method7574() {
      return false;
   }

   @deob.ObfuscatedName("ja.dr(FFFFFF)V")
   protected void method7561(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
   }

   @deob.ObfuscatedName("ja.de(ILdq;)V")
   public final void method7562(int arg0, class402 arg1) {
      this.method7563(arg0, arg1.field2965, arg1.field2964, arg1.field2962);
   }

   @deob.ObfuscatedName("ja.dk(ILdq;)V")
   public final void method7565(int arg0, class402 arg1) {
      this.method7566(arg0, arg1.field2965, arg1.field2964, arg1.field2962);
   }

   @deob.ObfuscatedName("ja.ar()Lym;")
   public class973 method2513() {
      return new class690(this);
   }

   @deob.ObfuscatedName("ja.nl(II)Ldm;")
   private class398 method7568(int arg0, int arg1) {
      return (class440)this.method7612(arg0, arg1, false, true);
   }

   @deob.ObfuscatedName("ja.as(IILcn;Ldt;I)Ldm;")
   public class398 method2679(int arg0, int arg1, class372 arg2, class405 arg3, int arg4) {
      return this.method7568(arg0, arg1);
   }

   @deob.ObfuscatedName("ja.au(II)Ldh;")
   public class393 method2514(int arg0, int arg1) {
      return new class691(arg0, arg1);
   }

   @deob.ObfuscatedName("ja.ad(III)Ldh;")
   public class393 method2649(int arg0, int arg1, int arg2) {
      return new class691(arg0, arg1);
   }

   @deob.ObfuscatedName("ja.R(IIIIIILta;II)V")
   private native void method7476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8);

   @deob.ObfuscatedName("ja.da()V")
   private native void method7477();

   @deob.ObfuscatedName("ja.Y(I)V")
   private native void method7478(int arg0);

   @deob.ObfuscatedName("ja.Q(I[I[F)V")
   private native void method7480(int arg0, int[] arg1, float[] arg2);

   @deob.ObfuscatedName("ja.V(SSIBBIZBBBBZZZZZBZZI)V")
   private native void method7483(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @deob.ObfuscatedName("ja.ma(Z)V")
   public native void method9(boolean arg0);

   @deob.ObfuscatedName("ja.za()I")
   public native int method7488();

   @deob.ObfuscatedName("ja.am(IIII)[I")
   public native int[] method2609(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ja.PA(Lza;)V")
   public native void method7502(class988 arg0);

   @deob.ObfuscatedName("ja.k()V")
   private native void method7504();

   @deob.ObfuscatedName("ja.GA(FF)V")
   public native void method7507(float arg0, float arg1);

   @deob.ObfuscatedName("ja.L()V")
   public native void method7508();

   @deob.ObfuscatedName("ja.o(IIII)V")
   public native void method7510(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ja.qa([I)V")
   public native void method7511(int[] arg0);

   @deob.ObfuscatedName("ja.ba(II)V")
   public native void method2522(int arg0, int arg1);

   @deob.ObfuscatedName("ja.B(IIIIII)V")
   public native void method7513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ja.XA(IIIII)V")
   public native void method7514(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ja.G(IIIII)V")
   public native void method7516(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ja.CA(IIIII)V")
   protected native void method7519(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ja.A(IIII)V")
   private native void method7532(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ja.IA(F)V")
   public native void method7547(float arg0);

   @deob.ObfuscatedName("ja.J(I)V")
   public native void method7549(int arg0);

   @deob.ObfuscatedName("ja.c(III)V")
   public native void method7550(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("ja.RA(Z)V")
   public native void method7551(boolean arg0);

   @deob.ObfuscatedName("ja.JA(IIII)V")
   private native void method7563(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ja.O()V")
   public native void method7564();

   @deob.ObfuscatedName("ja.M(IIII)V")
   private native void method7566(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ja.m(IFFFFF)V")
   public native void method7588(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @deob.ObfuscatedName("ja.AA([F)V")
   private native void method7590(float[] arg0);

   @deob.ObfuscatedName("ja.DA(ILta;II)V")
   public native void method7593(int arg0, class826 arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ja.d(JJ)V")
   public native void method7631(long arg0, long arg1);

   @deob.ObfuscatedName("ja.q(Lma;II)V")
   private native void method7632(class637 arg0, int arg1, int arg2);

   @deob.ObfuscatedName("ja.n(Lv;)V")
   private native void method7703(class879 arg0);

   @deob.ObfuscatedName("ja.r(IIII)V")
   public native void method7716(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ja.wa([F)V")
   private native void method7743(float[] arg0);

   @deob.ObfuscatedName("ja.YA(IIIIII)V")
   private native void method7744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ja.F(S[ISIBBIZBBBBZZZZZBZZI)V")
   private native void method7768(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @deob.ObfuscatedName("ja.N(IIIIII[BII)V")
   public native void method7769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);
}
