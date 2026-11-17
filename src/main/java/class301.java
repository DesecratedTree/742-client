@deob.ObfuscatedName("alc")
public class class301 extends class290 {
   @deob.ObfuscatedName("alc.y")
   private int field1904 = 0;
   @deob.ObfuscatedName("alc.f")
   private int field1906 = 0;
   @deob.ObfuscatedName("alc.ai")
   private boolean field1908 = true;
   @deob.ObfuscatedName("alc.av")
   private int field1903 = 0;
   @deob.ObfuscatedName("alc.q")
   private int field1907;
   @deob.ObfuscatedName("alc.j")
   private class836 field1905;
   @deob.ObfuscatedName("alc.ap")
   private class756 field1909;

   public class301(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
      super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte)0);
      this.field1907 = arg1;
      this.field1904 = arg12;
      this.field1903 = arg14;
      class815 var16 = Statics.field3758.method14209(this.field1907);
      int var17 = var16.field8406;
      if (var17 != -1) {
         this.field1905 = new class184(this, false);
         int var18 = var16.field8418 ? 0 : 2;
         if (arg13) {
            var18 = 1;
         }

         this.field1905.method14690(var17, arg2, var18, false);
      }

      this.method2017(1);
   }

   @deob.ObfuscatedName("alc.bc(B)Z")
   public boolean method81() {
      return false;
   }

   @deob.ObfuscatedName("alc.bw(I)Z")
   public boolean method82() {
      return this.field1908;
   }

   @deob.ObfuscatedName("alc.by(B)I")
   public int method80() {
      return this.field1906;
   }

   @deob.ObfuscatedName("alc.n(I)I")
   public int method3869() {
      return this.field1903;
   }

   @deob.ObfuscatedName("alc.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return null;
   }

   @deob.ObfuscatedName("alc.k(II)V")
   public final void method3870(int arg0) {
      if (this.field1905 != null && !this.field1905.method14707()) {
         this.field1905.method14711(arg0);
      }

   }

   @deob.ObfuscatedName("alc.d(I)Z")
   public final boolean method3871() {
      return this.field1905 != null && !this.field1905.method14749();
   }

   @deob.ObfuscatedName("alc.b(I)Z")
   public final boolean method3872() {
      return this.field1905 == null || this.field1905.method14707();
   }

   @deob.ObfuscatedName("alc.r(Lra;IIB)Lqa;")
   private class745 method3876(class772 arg0, int arg1, int arg2) {
      class815 var4 = Statics.field3758.method14209(arg2);
      class934 var5 = this.field1033.field6582[this.field1032];
      class934 var6 = this.field1034 < 3 ? this.field1033.field6582[this.field1034 + 1] : null;
      class584 var7 = this.method11602().field5446;
      return this.field1905 != null && !this.field1905.method14707() ? var4.method14387(arg0, arg1, true, var5, var6, (int)var7.field5328, (int)var7.field5330, (int)var7.field5331, this.field1905, (byte)2) : var4.method14387(arg0, arg1, true, var5, var6, (int)var7.field5328, (int)var7.field5330, (int)var7.field5331, (class836)null, (byte)2);
   }

   @deob.ObfuscatedName("alc.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      class745 var2 = this.method3876(arg0, 2048 | (this.field1904 != 0 ? 5 : 0), this.field1907);
      if (var2 == null) {
         return null;
      } else {
         if (this.field1904 != 0) {
            var2.method7008(this.field1904 * 2048);
         }

         class583 var3 = this.method11605();
         this.method3874(arg0, var2, var3);
         class715 var4 = class715.method15306(false);
         var2.method7001(var3, this.field1036[0], 0);
         if (this.field1909 != null) {
            class391 var5 = this.field1909.method11223();
            arg0.method7542(var5);
         }

         this.field1908 = var2.method6949();
         this.field1906 = var2.method6941();
         var2.method6938();
         return var4;
      }
   }

   @deob.ObfuscatedName("alc.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      class745 var2 = this.method3876(arg0, 0, this.field1907);
      if (var2 != null) {
         this.method3874(arg0, var2, this.method11605());
      }

   }

   @deob.ObfuscatedName("alc.p(Lra;Lqa;Lka;I)V")
   private void method3874(class772 arg0, class745 arg1, class583 arg2) {
      arg1.method7024(arg2);
      class408[] var4 = arg1.method6957();
      class370[] var5 = arg1.method6958();
      if ((this.field1909 == null || this.field1909.field6971) && (var4 != null || var5 != null)) {
         this.field1909 = class756.method11243(client.field2418, true);
      }

      if (this.field1909 != null) {
         this.field1909.method11235(arg0, (long)client.field2418, var4, var5, false);
         this.field1909.method11221(this.field1032, this.field1875, this.field1873, this.field1874, this.field1876);
      }

   }

   @deob.ObfuscatedName("alc.o(I)V")
   public void method3885() {
      if (this.field1909 != null) {
         this.field1909.method11213();
      }

   }

   @deob.ObfuscatedName("alc.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      return false;
   }

   @deob.ObfuscatedName("alc.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("alc.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("alc.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }
}
