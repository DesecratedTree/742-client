@deob.ObfuscatedName("a")
public class class1 implements class853 {
   private long nativeid;
   @deob.ObfuscatedName("a.d")
   private class493[] field3 = new class493[7];
   @deob.ObfuscatedName("a.b")
   private class493[] field5 = new class493[7];
   @deob.ObfuscatedName("a.n")
   private class548 field2;
   @deob.ObfuscatedName("a.r")
   public class597 field1;
   @deob.ObfuscatedName("a.k")
   public Runnable field4;

   public class1(class548 arg0, int arg1, int arg2) {
      this.field2 = arg0;

      for(int var4 = 0; var4 < 7; ++var4) {
         this.field3[var4] = new class493(this.field2);
         this.field5[var4] = new class493(this.field2);
      }

      this.field1 = new class597();
      this.method4(this.nativeid, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("a.n()V")
   public void method2() {
      this.field4 = Thread.currentThread();
      this.method7();
   }

   @deob.ObfuscatedName("a.k(Lh;BIZ)Lqa;")
   public class745 method3(class493 arg0, byte arg1, int arg2, boolean arg3) {
      boolean var5 = false;
      class493 var6;
      class493 var7;
      if (arg1 > 0 && arg1 <= 7) {
         var6 = this.field5[arg1 - 1];
         var7 = this.field3[arg1 - 1];
         var5 = true;
      } else {
         var7 = var6 = new class493(this.field2);
      }

      arg0.method7012(var7, var6, arg2, var5, arg3);
      var7.field3968 = arg0.field3968;
      var7.field3967 = arg0.field3967;
      return var7;
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("a.ma(Z)V")
   public void method9(boolean arg0) {
      this.method19(this.nativeid, arg0);
   }

   @deob.ObfuscatedName("a.d()V")
   private void method7() {
      this.method8(this.nativeid);
   }

   @deob.ObfuscatedName("a.r(Lra;[I[I[I[SI)V")
   public void method28(class772 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
      this.method10(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("a.p(Lra;IIIIIII)V")
   public void method11(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method12(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @deob.ObfuscatedName("a.o(Lqa;Lqa;IIIZ)V")
   public void method41(class745 arg0, class745 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method30(this.nativeid, ((class493)arg0).nativeid, ((class493)arg1).nativeid, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("a.a(Lqa;Lka;[II)V")
   public void method27(class745 arg0, class583 arg1, int[] arg2, int arg3) {
      this.field1.method8391(arg1);
      this.method16(this.nativeid, ((class493)arg0).nativeid, this.field1.field5413, arg2, arg3);
   }

   @deob.ObfuscatedName("a.x(Lqa;IILka;Z)Z")
   public boolean method17(class745 arg0, int arg1, int arg2, class583 arg3, boolean arg4) {
      this.field1.method8391(arg3);
      return this.method18(this.nativeid, ((class493)arg0).nativeid, arg1, arg2, this.field1.field5413, arg4);
   }

   @deob.ObfuscatedName("a.s(Lqa;[ILka;)V")
   public void method1(class745 arg0, int[] arg1, class583 arg2) {
      this.field1.method8391(arg2);
      this.method20(this.nativeid, ((class493)arg0).nativeid, arg1, this.field1.field5413);
   }

   @deob.ObfuscatedName("a.l(Lxa;II)V")
   public void method21(class934 arg0, int arg1, int arg2) {
      this.method22(this.nativeid, ((class520)arg0).nativeid, arg1, arg2);
   }

   @deob.ObfuscatedName("a.u(Lxa;IIIIIII[[Z)V")
   public void method23(class934 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
      this.method24(this.nativeid, ((class520)arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @deob.ObfuscatedName("a.ha(JLra;II)V")
   private native void method4(long arg0, class772 arg1, int arg2, int arg3);

   @deob.ObfuscatedName("a.JA(J)V")
   private native void method8(long arg0);

   @deob.ObfuscatedName("a.b(JLra;[I[I[I[SI)V")
   private native void method10(long arg0, class772 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

   @deob.ObfuscatedName("a.K(JLra;IIIIIII)V")
   private native void method12(long arg0, class772 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @deob.ObfuscatedName("a.wa(JJ[F[II)V")
   private native void method16(long arg0, long arg1, float[] arg2, int[] arg3, int arg4);

   @deob.ObfuscatedName("a.ya(JJII[FZ)Z")
   private native boolean method18(long arg0, long arg1, int arg2, int arg3, float[] arg4, boolean arg5);

   @deob.ObfuscatedName("a.R(JZ)V")
   private native void method19(long arg0, boolean arg1);

   @deob.ObfuscatedName("a.J(JJ[I[F)V")
   private native void method20(long arg0, long arg1, int[] arg2, float[] arg3);

   @deob.ObfuscatedName("a.v(JJII)V")
   private native void method22(long arg0, long arg1, int arg2, int arg3);

   @deob.ObfuscatedName("a.i(JJIIIIIII[[Z)V")
   private native void method24(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

   @deob.ObfuscatedName("a.P(JJJIIIZ)V")
   private native void method30(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);
}
