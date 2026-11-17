@deob.ObfuscatedName("xa")
public abstract class class934 {
   @deob.ObfuscatedName("xa.n")
   public final int field9463;
   @deob.ObfuscatedName("xa.k")
   public final int field9461;
   @deob.ObfuscatedName("xa.d")
   public final int field9460;
   @deob.ObfuscatedName("xa.b")
   public final int field9464;
   @deob.ObfuscatedName("xa.r")
   public final int[][] field9462;

   protected class934(int arg0, int arg1, int arg2, int[][] arg3) {
      this.field9463 = arg0;
      this.field9461 = arg1;
      int var5 = 0;

      while(arg2 > 1) {
         ++var5;
         arg2 >>= 1;
      }

      this.field9460 = 1 << var5;
      this.field9464 = var5;
      this.field9462 = arg3;
   }

   @deob.ObfuscatedName("xa.r(III)I")
   public final int method15965(int arg0, int arg1) {
      int var3 = arg0 >> this.field9464;
      int var4 = arg1 >> this.field9464;
      if (var3 >= 0 && var4 >= 0 && var3 <= this.field9463 - 1 && var4 <= this.field9461 - 1) {
         int var5 = arg0 & this.field9460 - 1;
         int var6 = arg1 & this.field9460 - 1;
         int var7 = (this.field9460 - var5) * this.field9462[var3][var4] + this.field9462[var3 + 1][var4] * var5 >> this.field9464;
         int var8 = (this.field9460 - var5) * this.field9462[var3][var4 + 1] + this.field9462[var3 + 1][var4 + 1] * var5 >> this.field9464;
         return (this.field9460 - var6) * var7 + var6 * var8 >> this.field9464;
      } else {
         return 0;
      }
   }

   @deob.ObfuscatedName("xa.p(IIB)I")
   public final int method15966(int arg0, int arg1) {
      return this.field9462[arg0][arg1];
   }

   @deob.ObfuscatedName("xa.SA()V")
   public abstract void method7249();

   @deob.ObfuscatedName("xa.LA(III)V")
   public abstract void method7246(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("xa.k(II[I[I[I[I[I[I[I[I[I[I[ILdq;Z)V")
   public abstract void method7250(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class402 arg13, boolean arg14);

   @deob.ObfuscatedName("xa.w(IILna;)Lna;")
   public abstract class664 method7253(int arg0, int arg1, class664 arg2);

   @deob.ObfuscatedName("xa.n(II[I[I[I[I[I[I[I[ILdq;Z)V")
   public abstract void method7247(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class402 arg10, boolean arg11);

   @deob.ObfuscatedName("xa.o(Lna;IIIIZ)Z")
   public abstract boolean method7278(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("xa.UA(Lna;IIIIZ)V")
   public abstract void method7251(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("xa.NA(Lna;IIIIZ)V")
   public abstract void method7255(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("xa.d(III[[ZZI)V")
   public abstract void method7262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @deob.ObfuscatedName("xa.a(Lacy;[I)V")
   public abstract void method7257(class81 arg0, int[] arg1);

   @deob.ObfuscatedName("xa.b(IIIIIII[[Z)V")
   public abstract void method7288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
