@deob.ObfuscatedName("h")
public class class493 extends class745 implements class853 {
   public long nativeid;
   @deob.ObfuscatedName("h.d")
   private class548 field3969;
   @deob.ObfuscatedName("h.b")
   private class332 field3966;
   @deob.ObfuscatedName("h.r")
   public class408[] field3968;
   @deob.ObfuscatedName("h.p")
   public class370[] field3967;

   public class493(class548 arg0, class332 arg1, class396 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field3969 = arg0;
      this.field3966 = arg1;
      this.field3968 = arg2.field2941;
      this.field3967 = arg2.field2929;
      int var8 = arg2.field2941 == null ? 0 : arg2.field2941.length;
      int var9 = arg2.field2929 == null ? 0 : arg2.field2929.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field3968[var12].field3079;
         var11[var10++] = this.field3968[var12].field3071;
         var11[var10++] = this.field3968[var12].field3068;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field3967[var13].field2383;
      }

      int var14 = arg2.field2937 == null ? 0 : arg2.field2937.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class395 var18 = arg2.field2937[var17];
         class532 var19 = class532.method8879(var18.field2905);
         var15[var16++] = var18.field2903;
         var15[var16++] = var19.field4190;
         var15[var16++] = var19.field4187;
         var15[var16++] = var19.field4189;
         var15[var16++] = var19.field4191;
         var15[var16++] = var19.field4194;
         var15[var16++] = var19.field4195 ? -1 : 0;
      }

      for(int var20 = 0; var20 < var14; ++var20) {
         class395 var21 = arg2.field2937[var20];
         var15[var16++] = var21.field2904;
      }

      this.method7050(this.field3969, this.field3966, arg2.field2908, arg2.field2909, arg2.field2910, arg2.field2911, arg2.field2940, arg2.field2913, arg2.field2926, arg2.field2914, arg2.field2916, arg2.field2912, arg2.field2918, arg2.field2919, arg2.field2943, arg2.field2921, arg2.field2922, arg2.field2927, arg2.field2924, arg2.field2925, arg2.field2923, arg2.field2907, arg2.field2928, arg2.field2920, arg2.field2930, arg2.field2931, arg2.field2932, arg2.field2933, arg2.field2917, arg2.field2935, arg2.field2939, arg2.field2915, arg2.field2936, arg2.field2942, arg2.field2938, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   public class493(class548 arg0) {
      this.field3969 = arg0;
      this.field3966 = null;
      this.method6909(arg0);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("h.ak(Lka;)V")
   public void method7024(class583 arg0) {
      this.method6913(class548.field4379, arg0);
      int var2 = 0;
      if (this.field3968 != null) {
         for(int var3 = 0; var3 < this.field3968.length; ++var3) {
            class408 var4 = this.field3968[var3];
            var4.field3074 = class548.field4379[var2++];
            var4.field3075 = class548.field4379[var2++];
            var4.field3076 = class548.field4379[var2++];
            var4.field3069 = class548.field4379[var2++];
            var4.field3077 = class548.field4379[var2++];
            var4.field3082 = class548.field4379[var2++];
            var4.field3080 = class548.field4379[var2++];
            var4.field3070 = class548.field4379[var2++];
            var4.field3078 = class548.field4379[var2++];
         }
      }

      if (this.field3967 != null) {
         for(int var5 = 0; var5 < this.field3967.length; ++var5) {
            class370 var6 = this.field3967[var5];
            class370 var7 = var6;
            if (var6.field2387 != null) {
               var7 = var6.field2387;
            }

            if (var6.field2386 == null) {
               var6.field2386 = new class597();
            }

            var6.field2386.method8391(arg0);
            var7.field2384 = class548.field4379[var2++];
            var7.field2381 = class548.field4379[var2++];
            var7.field2385 = class548.field4379[var2++];
         }
      }

   }

   @deob.ObfuscatedName("h.fp([ILka;)V")
   private void method6913(int[] arg0, class583 arg1) {
      this.field3969.method7541().method1(this, arg0, arg1);
   }

   @deob.ObfuscatedName("h.s(BIZ)Lqa;")
   public class745 method6914(byte arg0, int arg1, boolean arg2) {
      return this.field3969.method7541().method3(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("h.l()V")
   public void method6918() {
   }

   @deob.ObfuscatedName("h.g()V")
   protected void method6926() {
      if (this.field3969.field4365 > 1) {
         synchronized(this) {
            while(this.field6860) {
               try {
                  this.wait();
               } catch (InterruptedException var4) {
               }
            }

            this.field6860 = true;
         }
      }

   }

   @deob.ObfuscatedName("h.h()V")
   protected void method7027() {
      if (this.field3969.field4365 > 1) {
         synchronized(this) {
            this.field6860 = false;
            this.notifyAll();
         }
      }

   }

   @deob.ObfuscatedName("h.af(I[IIIIIZ)V")
   protected final void method6928(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method6929(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("h.at(Lka;IZ)V")
   public void method6983(class583 arg0, int arg1, boolean arg2) {
      class597 var4 = this.field3969.method7541().field1;
      var4.method8391(arg0);
      this.method7079(var4.field5413, arg1, arg2);
   }

   @deob.ObfuscatedName("h.ah(Lka;Ldi;I)V")
   public void method7001(class583 arg0, class394 arg1, int arg2) {
      if (arg1 == null) {
         this.field3969.method7541().method27(this, arg0, (int[])null, arg2);
      } else {
         class548.field4388[5] = 0;
         this.field3969.method7541().method27(this, arg0, class548.field4388, arg2);
         arg1.field2900 = class548.field4388[0];
         arg1.field2897 = class548.field4388[1];
         arg1.field2899 = class548.field4388[2];
         arg1.field2898 = class548.field4388[3];
         arg1.field2901 = class548.field4388[4];
         arg1.field2896 = class548.field4388[5] != 0;
      }

   }

   @deob.ObfuscatedName("h.aw(IILka;ZI)Z")
   public boolean method6935(int arg0, int arg1, class583 arg2, boolean arg3, int arg4) {
      return this.field3969.method7541().method17(this, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("h.an(B[B)V")
   public void method6950(byte arg0, byte[] arg1) {
      this.method6915(arg0, arg1);
   }

   @deob.ObfuscatedName("h.ag()Z")
   public boolean method6954() {
      return true;
   }

   @deob.ObfuscatedName("h.ao()[Ldw;")
   public class408[] method6957() {
      return this.field3968;
   }

   @deob.ObfuscatedName("h.ab()[Lcl;")
   public class370[] method6958() {
      return this.field3967;
   }

   @deob.ObfuscatedName("h.ae(Lqa;IIIZ)V")
   public void method6959(class745 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field3969.method7541().method41(this, arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("h.ba(Lja;)V")
   private native void method6909(class548 arg0);

   @deob.ObfuscatedName("h.IA(B[B)V")
   private native void method6915(byte arg0, byte[] arg1);

   @deob.ObfuscatedName("h.KA(I)V")
   public native void method6916(int arg0);

   @deob.ObfuscatedName("h.S(I)V")
   public native void method6920(int arg0);

   @deob.ObfuscatedName("h.t(I)V")
   public native void method6921(int arg0);

   @deob.ObfuscatedName("h.oa(III)V")
   public native void method6924(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("h.pa(IILxa;Lxa;III)V")
   public native void method6925(int arg0, int arg1, class934 arg2, class934 arg3, int arg4, int arg5, int arg6);

   @deob.ObfuscatedName("h.ma(Z)V")
   public native void method9(boolean arg0);

   @deob.ObfuscatedName("h.ea()Z")
   protected native boolean method6927();

   @deob.ObfuscatedName("h.J(JI[IIIIIZ)V")
   private native void method6929(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @deob.ObfuscatedName("h.e(I[IIIIZI[I)V")
   protected native void method6930(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @deob.ObfuscatedName("h.w(IIII)V")
   protected native void method6931(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("h.ka()V")
   protected native void method6932();

   @deob.ObfuscatedName("h.n()I")
   public native int method6938();

   @deob.ObfuscatedName("h.ya()I")
   public native int method6940();

   @deob.ObfuscatedName("h.YA()I")
   public native int method6941();

   @deob.ObfuscatedName("h.ha()I")
   public native int method6943();

   @deob.ObfuscatedName("h.p(I)V")
   public native void method6944(int arg0);

   @deob.ObfuscatedName("h.c()I")
   public native int method6946();

   @deob.ObfuscatedName("h.Z()I")
   public native int method6947();

   @deob.ObfuscatedName("h.al()[B")
   public native byte[] method6948();

   @deob.ObfuscatedName("h.i()Z")
   public native boolean method6949();

   @deob.ObfuscatedName("h.o()I")
   public native int method6951();

   @deob.ObfuscatedName("h.W(SS)V")
   public native void method6952(short arg0, short arg1);

   @deob.ObfuscatedName("h.PA(IIII)V")
   public native void method6953(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("h.u()Z")
   public native boolean method6956();

   @deob.ObfuscatedName("h.Q(I)V")
   public native void method6969(int arg0);

   @deob.ObfuscatedName("h.m()I")
   public native int method6980();

   @deob.ObfuscatedName("h.EA(I)V")
   public native void method6999(int arg0);

   @deob.ObfuscatedName("h.N()I")
   public native int method7004();

   @deob.ObfuscatedName("h.f(I)V")
   public native void method7008(int arg0);

   @deob.ObfuscatedName("h.BA(Lh;Lh;IZZ)V")
   public native void method7012(class493 arg0, class493 arg1, int arg2, boolean arg3, boolean arg4);

   @deob.ObfuscatedName("h.X(SS)V")
   public native void method7023(short arg0, short arg1);

   @deob.ObfuscatedName("h.RA()I")
   public native int method7033();

   @deob.ObfuscatedName("h.AA()I")
   public native int method7046();

   @deob.ObfuscatedName("h.U(Lja;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
   private native void method7050(class548 arg0, class332 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

   @deob.ObfuscatedName("h.ga(Lna;)Lna;")
   public native class664 method7072(class664 arg0);

   @deob.ObfuscatedName("h.wa()V")
   public native void method7075();

   @deob.ObfuscatedName("h.ia(III)V")
   public native void method7078(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("h.aa([FIZ)V")
   private native void method7079(float[] arg0, int arg1, boolean arg2);
}
