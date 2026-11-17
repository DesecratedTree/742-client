@deob.ObfuscatedName("yh")
public class class968 extends class288 implements class376 {
   @deob.ObfuscatedName("yh.g")
   private boolean field9660 = true;
   @deob.ObfuscatedName("yh.l")
   public class366 field9661;
   @deob.ObfuscatedName("yh.u")
   private boolean field9662;
   @deob.ObfuscatedName("yh.v")
   private class712 field9663;

   public class968(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
      this.field9661 = new class366(arg1, arg2, arg3, arg12, arg13, this.field1032, arg5, this, arg9, arg14);
      this.field9662 = arg3.field8638 != 0 && !arg9;
      this.method2017(1);
   }

   @deob.ObfuscatedName("yh.bc(B)Z")
   public boolean method81() {
      return false;
   }

   @deob.ObfuscatedName("yh.bw(I)Z")
   public boolean method82() {
      return this.field9660;
   }

   @deob.ObfuscatedName("yh.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return this.field9663;
   }

   @deob.ObfuscatedName("yh.by(B)I")
   public int method80() {
      return this.field9661.method4511();
   }

   @deob.ObfuscatedName("yh.bm(B)I")
   public int method162() {
      return this.field9661.method4486();
   }

   @deob.ObfuscatedName("yh.bq(Ltg;I)V")
   public void method16099(class832 arg0) {
      this.field9661.method4504(arg0);
   }

   @deob.ObfuscatedName("yh.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      class745 var2 = this.field9661.method4501(arg0, 2048, false, true);
      if (var2 == null) {
         return null;
      } else {
         class583 var3 = arg0.method7763();
         var3.method8089(this.method11605());
         var3.method8072((float)this.field1862, 0.0F, (float)this.field1861);
         class600 var4 = this.method11602();
         class715 var5 = class715.method15306(this.field9662);
         int var6 = (int)var4.field5446.field5328 >> 9;
         int var7 = (int)var4.field5446.field5331 >> 9;
         this.field9661.method4488(arg0, var2, var3, var6, var6, var7, var7, true);
         var2.method7001(var3, this.field1036[0], 0);
         if (this.field9661.field2364 != null) {
            class391 var8 = this.field9661.field2364.method11223();
            arg0.method7542(var8);
         }

         this.field9660 = var2.method6949() || this.field9661.field2364 != null;
         if (this.field9663 == null) {
            this.field9663 = Statics.method15751((int)var4.field5446.field5328, (int)var4.field5446.field5330, (int)var4.field5446.field5331, var2);
         } else {
            class134.method2315(this.field9663, (int)var4.field5446.field5328, (int)var4.field5446.field5330, (int)var4.field5446.field5331, var2);
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("yh.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      class745 var2 = this.field9661.method4501(arg0, 262144, false, true);
      if (var2 != null) {
         class583 var3 = this.method11605();
         class600 var4 = this.method11602();
         int var5 = (int)var4.field5446.field5328 >> 9;
         int var6 = (int)var4.field5446.field5331 >> 9;
         this.field9661.method4488(arg0, var2, var3, var5, var5, var6, var6, false);
      }

   }

   @deob.ObfuscatedName("yh.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.field9661.method4501(arg0, 131072, false, false);
      return var4 == null ? false : var4.method6935(arg1, arg2, this.method11605(), false, 0);
   }

   @deob.ObfuscatedName("yh.n(I)I")
   public int method5093() {
      return this.field9661.field2362;
   }

   @deob.ObfuscatedName("yh.k(I)I")
   public int method5083() {
      return this.field9661.field2359;
   }

   @deob.ObfuscatedName("yh.d(B)I")
   public int method5084() {
      return this.field9661.field2357;
   }

   @deob.ObfuscatedName("yh.b(I)V")
   public void method5085() {
   }

   @deob.ObfuscatedName("yh.r(I)Z")
   public boolean method5086() {
      return this.field9661.method4489();
   }

   @deob.ObfuscatedName("yh.p(Lra;I)V")
   public void method5101(class772 arg0) {
      this.field9661.method4490(arg0);
   }

   @deob.ObfuscatedName("yh.o(Lra;I)V")
   public void method5088(class772 arg0) {
      this.field9661.method4506(arg0);
   }
}
