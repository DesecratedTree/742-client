@deob.ObfuscatedName("fa")
public class class440 extends class383 implements class853, class398 {
   public long nativeid;
   @deob.ObfuscatedName("fa.n")
   private boolean field3654 = false;

   public class440(class548 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method6158(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   public class440(class548 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method6159(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   public class440(class548 arg0, int arg1, int arg2, boolean arg3) {
      this.field3654 = arg3;
      this.method6157(arg0, arg1, arg2);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("fa.ma(Z)V")
   public void method9(boolean arg0) {
      this.method6161(this.nativeid, arg0);
   }

   @deob.ObfuscatedName("fa.l(IIII)V")
   public void method5214(int arg0, int arg1, int arg2, int arg3) {
      this.method6177(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("fa.u([I)V")
   public void method5215(int[] arg0) {
      this.method6167(this.nativeid, arg0);
   }

   @deob.ObfuscatedName("fa.n()I")
   public int method3939() {
      return this.method6170(this.nativeid);
   }

   @deob.ObfuscatedName("fa.v()I")
   public int method5216() {
      return this.method6170(this.nativeid);
   }

   @deob.ObfuscatedName("fa.g()I")
   public int method5259() {
      return this.method6164(this.nativeid);
   }

   @deob.ObfuscatedName("fa.k()I")
   public int method3938() {
      return this.method6193(this.nativeid);
   }

   @deob.ObfuscatedName("fa.h()I")
   public int method5218() {
      return this.method6193(this.nativeid);
   }

   @deob.ObfuscatedName("fa.m()I")
   public int method5213() {
      return this.method6201(this.nativeid);
   }

   @deob.ObfuscatedName("fa.i()Ldm;")
   public class398 method2391() {
      return this.field3654 ? this : null;
   }

   @deob.ObfuscatedName("fa.t(IIIIII)V")
   public void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method6169(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("fa.c(III)V")
   public void method2390(int arg0, int arg1, int arg2) {
      this.method6156(this.nativeid, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("fa.q(IIIII)V")
   public void method2388(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method6204(this.nativeid, arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("fa.f(IILta;II)V")
   public void method2393(int arg0, int arg1, class826 arg2, int arg3, int arg4) {
      this.method6172(this.nativeid, arg0, arg1, ((class907)arg2).nativeid, arg3, arg4);
   }

   @deob.ObfuscatedName("fa.av(IIIIIIII)V")
   protected void method2394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method6173(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @deob.ObfuscatedName("fa.af(IIIIIII)V")
   public void method5219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method6175(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("fa.ak(FFFFFFIIII)V")
   protected void method5231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      this.method6197(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
   }

   @deob.ObfuscatedName("fa.ab(FFFFFFILta;II)V")
   public void method5232(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class826 arg7, int arg8, int arg9) {
      this.method6178(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class907)arg7).nativeid, arg8, arg9, this.field3654);
   }

   @deob.ObfuscatedName("fa.d()V")
   public void method302() {
   }

   @deob.ObfuscatedName("fa.j(JIII)V")
   private native void method6156(long arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("fa.UA(Lja;II)V")
   private native void method6157(class548 arg0, int arg1, int arg2);

   @deob.ObfuscatedName("fa.RA(Lja;[IIIIIZ)V")
   private native void method6158(class548 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @deob.ObfuscatedName("fa.K(Lja;IIIIZ)V")
   private native void method6159(class548 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("fa.M(JZ)V")
   private native void method6161(long arg0, boolean arg1);

   @deob.ObfuscatedName("fa.WA(J)I")
   private native int method6164(long arg0);

   @deob.ObfuscatedName("fa.F(J[I)V")
   private native void method6167(long arg0, int[] arg1);

   @deob.ObfuscatedName("fa.ea(JIIIIII)V")
   private native void method6169(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @deob.ObfuscatedName("fa.da(J)I")
   private native int method6170(long arg0);

   @deob.ObfuscatedName("fa.o(JIIJII)V")
   private native void method6172(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

   @deob.ObfuscatedName("fa.ha(JIIIIIIII)V")
   private native void method6173(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @deob.ObfuscatedName("fa.aa(JIIIIIII)V")
   private native void method6175(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @deob.ObfuscatedName("fa.U(JIIII)V")
   private native void method6177(long arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("fa.FA(JFFFFFFIJIIZ)V")
   private native void method6178(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10, boolean arg11);

   @deob.ObfuscatedName("fa.GA(J)I")
   private native int method6193(long arg0);

   @deob.ObfuscatedName("fa.e(JFFFFFFIIII)V")
   private native void method6197(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

   @deob.ObfuscatedName("fa.ba(J)I")
   private native int method6201(long arg0);

   @deob.ObfuscatedName("fa.Y(JIIIII)V")
   private native void method6204(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
