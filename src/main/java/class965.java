@deob.ObfuscatedName("ye")
public class class965 extends class276 implements class376 {
   @deob.ObfuscatedName("ye.g")
   private static final int[] field9639 = new int[]{1, 2, 4, 8};
   @deob.ObfuscatedName("ye.h")
   private static final int[] field9640 = new int[]{16, 32, 64, 128};
   @deob.ObfuscatedName("ye.e")
   private boolean field9637 = true;
   @deob.ObfuscatedName("ye.l")
   public class366 field9636;
   @deob.ObfuscatedName("ye.u")
   private boolean field9641;
   @deob.ObfuscatedName("ye.v")
   private class712 field9638;

   public class965(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12) {
      super(arg0, arg6, arg7, arg8, arg4, arg5, method9968(arg10, arg11));
      this.field9636 = new class366(arg1, arg2, arg3, arg10, arg11, this.field1032, arg5, this, arg9, arg12);
      this.field9641 = arg3.field8638 != 0 && !arg9;
      this.method2017(1);
   }

   @deob.ObfuscatedName("ye.bc(B)Z")
   public boolean method81() {
      return false;
   }

   @deob.ObfuscatedName("ye.bw(I)Z")
   public boolean method82() {
      return this.field9637;
   }

   @deob.ObfuscatedName("np.bq(IIB)I")
   private static int method9968(int arg0, int arg1) {
      return class850.field8716.field8736 != arg0 && class850.field8725.field8736 != arg0 ? field9639[arg1 & 3] : field9640[arg1 & 3];
   }

   @deob.ObfuscatedName("ye.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return this.field9638;
   }

   @deob.ObfuscatedName("ye.by(B)I")
   public int method80() {
      return this.field9636.method4511();
   }

   @deob.ObfuscatedName("ye.bm(B)I")
   public int method162() {
      return this.field9636.method4486();
   }

   @deob.ObfuscatedName("ye.bk(Ltg;B)V")
   public void method16087(class832 arg0) {
      this.field9636.method4504(arg0);
   }

   @deob.ObfuscatedName("ye.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      class745 var2 = this.field9636.method4501(arg0, 2048, false, true);
      if (var2 == null) {
         return null;
      } else {
         class583 var3 = this.method11605();
         class600 var4 = this.method11602();
         class715 var5 = class715.method15306(this.field9641);
         int var6 = (int)var4.field5446.field5328 >> 9;
         int var7 = (int)var4.field5446.field5331 >> 9;
         this.field9636.method4488(arg0, var2, var3, var6, var6, var7, var7, true);
         var2.method7001(var3, this.field1036[0], 0);
         if (this.field9636.field2364 != null) {
            class391 var8 = this.field9636.field2364.method11223();
            arg0.method7542(var8);
         }

         this.field9637 = var2.method6949() || this.field9636.field2364 != null;
         if (this.field9638 == null) {
            this.field9638 = Statics.method15751((int)var4.field5446.field5328, (int)var4.field5446.field5330, (int)var4.field5446.field5331, var2);
         } else {
            class134.method2315(this.field9638, (int)var4.field5446.field5328, (int)var4.field5446.field5330, (int)var4.field5446.field5331, var2);
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("ye.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      class745 var2 = this.field9636.method4501(arg0, 262144, true, true);
      if (var2 != null) {
         class583 var3 = this.method11605();
         class600 var4 = this.method11602();
         int var5 = (int)var4.field5446.field5328 >> 9;
         int var6 = (int)var4.field5446.field5331 >> 9;
         this.field9636.method4488(arg0, var2, var3, var5, var5, var6, var6, false);
      }

   }

   @deob.ObfuscatedName("ye.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.field9636.method4501(arg0, 131072, false, false);
      return var4 == null ? false : var4.method6935(arg1, arg2, this.method11605(), false, 0);
   }

   @deob.ObfuscatedName("ye.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("ye.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ye.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ye.n(I)I")
   public int method5093() {
      return this.field9636.field2362;
   }

   @deob.ObfuscatedName("ye.k(I)I")
   public int method5083() {
      return this.field9636.field2359;
   }

   @deob.ObfuscatedName("ye.d(B)I")
   public int method5084() {
      return this.field9636.field2357;
   }

   @deob.ObfuscatedName("ye.b(I)V")
   public void method5085() {
   }

   @deob.ObfuscatedName("ye.r(I)Z")
   public boolean method5086() {
      return this.field9636.method4489();
   }

   @deob.ObfuscatedName("ye.p(Lra;I)V")
   public void method5101(class772 arg0) {
      this.field9636.method4490(arg0);
   }

   @deob.ObfuscatedName("ye.o(Lra;I)V")
   public void method5088(class772 arg0) {
      this.field9636.method4506(arg0);
   }
}
