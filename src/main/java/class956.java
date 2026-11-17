@deob.ObfuscatedName("xw")
public class class956 extends class275 implements class376 {
   @deob.ObfuscatedName("xw.g")
   private boolean field9569 = true;
   @deob.ObfuscatedName("xw.l")
   public class366 field9572;
   @deob.ObfuscatedName("xw.u")
   private boolean field9570;
   @deob.ObfuscatedName("xw.v")
   private class712 field9571;

   public class956(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
      super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field8622);
      this.field9572 = new class366(arg1, arg2, arg3, class850.field8730.field8736, arg10, arg4, arg5, this, arg9, arg11);
      this.field9570 = arg3.field8638 != 0 && !arg9;
      this.method2017(1);
   }

   @deob.ObfuscatedName("xw.bc(B)Z")
   public boolean method81() {
      return false;
   }

   @deob.ObfuscatedName("xw.bw(I)Z")
   public boolean method82() {
      return this.field9569;
   }

   @deob.ObfuscatedName("xw.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return this.field9571;
   }

   @deob.ObfuscatedName("xw.by(B)I")
   public int method80() {
      return this.field9572.method4511();
   }

   @deob.ObfuscatedName("xw.bm(B)I")
   public int method162() {
      return this.field9572.method4486();
   }

   @deob.ObfuscatedName("xw.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      class745 var2 = this.field9572.method4501(arg0, 2048, false, true);
      if (var2 == null) {
         return null;
      } else {
         class583 var3 = this.method11605();
         class600 var4 = this.method11602();
         class715 var5 = class715.method15306(this.field9570);
         int var6 = (int)var4.field5446.field5328 >> 9;
         int var7 = (int)var4.field5446.field5331 >> 9;
         this.field9572.method4488(arg0, var2, var3, var6, var6, var7, var7, true);
         var2.method7001(var3, this.field1036[0], 0);
         if (this.field9572.field2364 != null) {
            class391 var8 = this.field9572.field2364.method11223();
            arg0.method7542(var8);
         }

         this.field9569 = var2.method6949() || this.field9572.field2364 != null;
         if (this.field9571 == null) {
            this.field9571 = Statics.method15751((int)var4.field5446.field5328, (int)var4.field5446.field5330, (int)var4.field5446.field5331, var2);
         } else {
            class134.method2315(this.field9571, (int)var4.field5446.field5328, (int)var4.field5446.field5330, (int)var4.field5446.field5331, var2);
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("xw.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      class745 var2 = this.field9572.method4501(arg0, 262144, true, true);
      if (var2 != null) {
         class584 var3 = this.method11602().field5446;
         int var4 = (int)var3.field5328 >> 9;
         int var5 = (int)var3.field5331 >> 9;
         this.field9572.method4488(arg0, var2, this.method11605(), var4, var4, var5, var5, false);
      }

   }

   @deob.ObfuscatedName("xw.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.field9572.method4501(arg0, 131072, false, false);
      return var4 == null ? false : var4.method6935(arg1, arg2, this.method11605(), false, 0);
   }

   @deob.ObfuscatedName("xw.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("xw.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("xw.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("xw.n(I)I")
   public int method5093() {
      return this.field9572.field2362;
   }

   @deob.ObfuscatedName("xw.k(I)I")
   public int method5083() {
      return this.field9572.field2359;
   }

   @deob.ObfuscatedName("xw.d(B)I")
   public int method5084() {
      return this.field9572.field2357;
   }

   @deob.ObfuscatedName("xw.bq(Ltg;I)V")
   public void method16045(class832 arg0) {
      this.field9572.method4504(arg0);
   }

   @deob.ObfuscatedName("xw.b(I)V")
   public void method5085() {
   }

   @deob.ObfuscatedName("xw.r(I)Z")
   public boolean method5086() {
      return this.field9572.method4489();
   }

   @deob.ObfuscatedName("xw.p(Lra;I)V")
   public void method5101(class772 arg0) {
      this.field9572.method4490(arg0);
   }

   @deob.ObfuscatedName("xw.o(Lra;I)V")
   public void method5088(class772 arg0) {
      this.field9572.method4506(arg0);
   }
}
