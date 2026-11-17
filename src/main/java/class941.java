@deob.ObfuscatedName("xh")
public class class941 extends class290 implements class376 {
   @deob.ObfuscatedName("xh.g")
   private boolean field9499 = true;
   @deob.ObfuscatedName("xh.l")
   public class366 field9500;
   @deob.ObfuscatedName("xh.u")
   private boolean field9498;
   @deob.ObfuscatedName("xh.v")
   private class712 field9497;

   public class941(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
      super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.field8621 == 1, Statics.method9101(arg14, arg15));
      this.field9500 = new class366(arg1, arg2, arg3, arg14, arg15, this.field1032, arg5, this, arg9, arg16);
      this.field9498 = arg3.field8638 != 0 && !arg9;
      this.method2017(1);
   }

   @deob.ObfuscatedName("xh.bc(B)Z")
   public boolean method81() {
      return false;
   }

   @deob.ObfuscatedName("xh.bw(I)Z")
   public boolean method82() {
      return this.field9499;
   }

   @deob.ObfuscatedName("xh.by(B)I")
   public int method80() {
      return this.field9500.method4511();
   }

   @deob.ObfuscatedName("xh.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return this.field9497;
   }

   @deob.ObfuscatedName("xh.bm(B)I")
   public int method162() {
      return this.field9500.method4486();
   }

   @deob.ObfuscatedName("xh.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      class745 var2 = this.field9500.method4501(arg0, 2048, false, true);
      if (var2 == null) {
         return null;
      } else {
         class583 var3 = this.method11605();
         class715 var4 = class715.method15306(this.field9498);
         this.field9500.method4488(arg0, var2, var3, this.field1875, this.field1873, this.field1874, this.field1876, true);
         var2.method7001(var3, this.field1036[0], 0);
         if (this.field9500.field2364 != null) {
            class391 var5 = this.field9500.field2364.method11223();
            arg0.method7542(var5);
         }

         this.field9499 = var2.method6949() || this.field9500.field2364 != null;
         class600 var6 = this.method11602();
         if (this.field9497 == null) {
            this.field9497 = Statics.method15751((int)var6.field5446.field5328, (int)var6.field5446.field5330, (int)var6.field5446.field5331, var2);
         } else {
            class134.method2315(this.field9497, (int)var6.field5446.field5328, (int)var6.field5446.field5330, (int)var6.field5446.field5331, var2);
         }

         return var4;
      }
   }

   @deob.ObfuscatedName("xh.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      class745 var2 = this.field9500.method4501(arg0, 262144, true, true);
      if (var2 != null) {
         this.field9500.method4488(arg0, var2, this.method11605(), this.field1875, this.field1873, this.field1874, this.field1876, false);
      }

   }

   @deob.ObfuscatedName("xh.bk(Ltg;I)V")
   public void method16010(class832 arg0) {
      this.field9500.method4504(arg0);
   }

   @deob.ObfuscatedName("xh.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.field9500.method4501(arg0, 131072, false, false);
      return var4 == null ? false : var4.method6935(arg1, arg2, this.method11605(), false, 0);
   }

   @deob.ObfuscatedName("xh.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("xh.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("xh.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("xh.n(I)I")
   public int method5093() {
      return this.field9500.field2362;
   }

   @deob.ObfuscatedName("xh.k(I)I")
   public int method5083() {
      return this.field9500.field2359;
   }

   @deob.ObfuscatedName("xh.d(B)I")
   public int method5084() {
      return this.field9500.field2357;
   }

   @deob.ObfuscatedName("xh.b(I)V")
   public void method5085() {
   }

   @deob.ObfuscatedName("xh.r(I)Z")
   public boolean method5086() {
      return this.field9500.method4489();
   }

   @deob.ObfuscatedName("xh.p(Lra;I)V")
   public void method5101(class772 arg0) {
      this.field9500.method4490(arg0);
   }

   @deob.ObfuscatedName("xh.o(Lra;I)V")
   public void method5088(class772 arg0) {
      this.field9500.method4506(arg0);
   }
}
