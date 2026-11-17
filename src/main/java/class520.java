@deob.ObfuscatedName("i")
public class class520 extends class934 implements class853 {
   public long nativeid;
   @deob.ObfuscatedName("i.o")
   private class849 field4128 = new class849();
   @deob.ObfuscatedName("i.p")
   private class548 field4127;

   public class520(class548 arg0, class332 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
      super(arg2, arg3, arg6, arg4);
      this.field4127 = arg0;
      this.method7265(this.field4127, arg1, arg2, arg3, this.field9462, arg5, arg6, arg7, arg8);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("i.n(II[I[I[I[I[I[I[I[ILdq;Z)V")
   public final void method7247(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class402 arg10, boolean arg11) {
      this.method7248(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10.field2965, arg10.field2964, arg10.field2962, arg11);
   }

   @deob.ObfuscatedName("i.k(II[I[I[I[I[I[I[I[I[I[I[ILdq;Z)V")
   public void method7250(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class402 arg13, boolean arg14) {
      boolean var16 = false;
      if (arg9 != null) {
         int[] var17 = arg9;

         for(int var18 = 0; var18 < var17.length; ++var18) {
            int var19 = var17[var18];
            if (var19 != -1) {
               var16 = true;
               break;
            }
         }
      }

      int var20 = arg9.length;
      int[] var21 = new int[var20 * 3];
      int[] var22 = new int[var20 * 3];
      int[] var23 = new int[var20 * 3];
      int[] var24 = new int[var20 * 3];
      int[] var25 = new int[var20 * 3];
      int[] var26 = arg10 != null ? new int[var20 * 3] : null;
      int[] var27 = arg3 != null ? new int[var20 * 3] : null;
      int[] var28 = arg5 != null ? new int[var20 * 3] : null;
      int var29 = 0;

      for(int var30 = 0; var30 < var20; ++var30) {
         int var31 = arg6[var30];
         int var32 = arg7[var30];
         int var33 = arg8[var30];
         var21[var29] = arg2[var31];
         var22[var29] = arg4[var31];
         var23[var29] = arg9[var30];
         var24[var29] = arg11[var30];
         var25[var29] = arg12[var30];
         if (arg10 != null) {
            var26[var29] = arg10[var30];
         }

         if (arg3 != null) {
            var27[var29] = arg3[var31];
         }

         if (arg5 != null) {
            var28[var29] = arg5[var31];
         }

         ++var29;
         var21[var29] = arg2[var32];
         var22[var29] = arg4[var32];
         var23[var29] = arg9[var30];
         var24[var29] = arg11[var30];
         var25[var29] = arg12[var30];
         if (arg10 != null) {
            var26[var29] = arg10[var30];
         }

         if (arg3 != null) {
            var27[var29] = arg3[var32];
         }

         if (arg5 != null) {
            var28[var29] = arg5[var32];
         }

         ++var29;
         var21[var29] = arg2[var33];
         var22[var29] = arg4[var33];
         var23[var29] = arg9[var30];
         var24[var29] = arg11[var30];
         var25[var29] = arg12[var30];
         if (arg10 != null) {
            var26[var29] = arg10[var30];
         }

         if (arg3 != null) {
            var27[var29] = arg3[var33];
         }

         if (arg5 != null) {
            var28[var29] = arg5[var33];
         }

         ++var29;
      }

      if (var16 || var26 != null) {
         this.method7248(arg0, arg1, var21, var27, var22, var28, var23, var26, var24, var25, arg13.field2965, arg13.field2964, arg13.field2962, arg14);
      }

   }

   @deob.ObfuscatedName("i.d(III[[ZZI)V")
   public void method7262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      int var7 = 0;
      float[] var8 = new float[this.field4128.method14972()];

      for(class81 var9 = (class81)this.field4128.method14964(); var9 != null; var9 = (class81)this.field4128.method15006()) {
         var8[var7++] = var9.method1114();
      }

      this.method7245(var8);

      for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
         for(int var11 = 0; var11 < arg2 + arg2; ++var11) {
            if (arg3[var10][var11]) {
               int var12 = arg0 - arg2 + var10;
               int var13 = arg1 - arg2 + var11;
               if (var12 >= 0 && var12 < this.field9463 && var13 >= 0 && var13 < this.field9461) {
                  this.field4127.method7541().method21(this, var12, var13);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("i.b(IIIIIII[[Z)V")
   public void method7288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      this.field4127.method7541().method23(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @deob.ObfuscatedName("i.o(Lna;IIIIZ)Z")
   public boolean method7278(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return true;
   }

   @deob.ObfuscatedName("i.a(Lacy;[I)V")
   public void method7257(class81 arg0, int[] arg1) {
      this.field4128.method14959(arg0);
      this.method7258(arg0.hashCode(), arg0.method1123(), arg0.method1110(), arg0.method1111(), arg0.method1112(), arg0.method1113(), arg1);
   }

   @deob.ObfuscatedName("i.t([F)V")
   private native void method7245(float[] arg0);

   @deob.ObfuscatedName("i.LA(III)V")
   public native void method7246(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("i.ya(II[I[I[I[I[I[I[I[IIIIZ)V")
   private native void method7248(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @deob.ObfuscatedName("i.SA()V")
   public native void method7249();

   @deob.ObfuscatedName("i.UA(Lna;IIIIZ)V")
   public native void method7251(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("i.w(IILna;)Lna;")
   public native class664 method7253(int arg0, int arg1, class664 arg2);

   @deob.ObfuscatedName("i.NA(Lna;IIIIZ)V")
   public native void method7255(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("i.A(IIIIII[I)V")
   private native void method7258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

   @deob.ObfuscatedName("i.G(Lja;Lba;II[[I[[IIII)V")
   private native void method7265(class548 arg0, class332 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

   @deob.ObfuscatedName("i.ma(Z)V")
   public native void method9(boolean arg0);
}
