@deob.ObfuscatedName("yg")
public class class967 extends class275 implements class376 {
   @deob.ObfuscatedName("yg.l")
   private class831 field9658;
   @deob.ObfuscatedName("yg.h")
   private final int field9959;
   @deob.ObfuscatedName("yg.z")
   private final boolean field9656;
   @deob.ObfuscatedName("yg.e")
   private final byte field9655;
   @deob.ObfuscatedName("yg.m")
   private boolean field9657;
   @deob.ObfuscatedName("yg.i")
   private boolean field9651;
   @deob.ObfuscatedName("yg.t")
   private boolean field9659;
   @deob.ObfuscatedName("yg.u")
   private class745 field9653;
   @deob.ObfuscatedName("yg.v")
   private class664 field9652;
   @deob.ObfuscatedName("yg.g")
   private class712 field9650;

   public class967(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11) {
      super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field8622);
      this.field9658 = arg2;
      this.field9959 = arg3.field8577;
      this.field9656 = arg9;
      this.field9655 = (byte)arg10;
      this.field9657 = arg3.field8638 != 0 && !arg9;
      this.field9651 = arg11;
      this.field9659 = arg1.method7494() && arg3.field8637 && !this.field9656 && Statics.field9361.field964.method2210() != 0;
      int var13 = 2048;
      if (this.field9651) {
         var13 |= 65536;
      }

      if (arg3.field8587) {
         var13 |= 524288;
      }

      class862 var14 = this.method16092(arg1, var13, this.field9659);
      if (var14 != null) {
         this.field9653 = (class745)var14.field8800;
         this.field9652 = (class664)var14.field8801;
         if (this.field9651 || arg3.field8587) {
            this.field9653 = this.field9653.method6914((byte)0, var13, false);
            if (arg3.field8587) {
               class642 var15 = client.field2468.method9514();
               this.field9653.method6953(var15.field5807, var15.field5804, var15.field5805, var15.field5806);
            }
         }
      }

      this.method2017(1);
   }

   @deob.ObfuscatedName("yg.bc(B)Z")
   public boolean method81() {
      if (this.field9653 != null) {
         return !this.field9653.method6956();
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("yg.bw(I)Z")
   public boolean method82() {
      return this.field9653 != null ? this.field9653.method6949() : false;
   }

   @deob.ObfuscatedName("yg.by(B)I")
   public int method80() {
      return this.field9653 != null ? this.field9653.method6941() : 0;
   }

   @deob.ObfuscatedName("yg.bq(Lra;IB)Lqa;")
   private class745 method16091(class772 arg0, int arg1) {
      if (this.field9653 != null && arg0.method7534(this.field9653.method6980(), arg1) == 0) {
         return this.field9653;
      } else {
         class862 var3 = this.method16092(arg0, arg1, false);
         return var3 != null ? (class745)var3.field8800 : null;
      }
   }

   @deob.ObfuscatedName("yg.bk(Lra;IZI)Luj;")
   private class862 method16092(class772 arg0, int arg1, boolean arg2) {
      class843 var4 = this.field9658.method14651(this.field9959);
      class934 var5;
      class934 var6;
      if (this.field9656) {
         var5 = this.field1033.field6584[this.field1034];
         var6 = this.field1033.field6582[0];
      } else {
         var5 = this.field1033.field6582[this.field1034];
         if (this.field1034 < 3) {
            var6 = this.field1033.field6582[this.field1034 + 1];
         } else {
            var6 = null;
         }
      }

      class584 var7 = this.method11602().field5446;
      return var4.method14850(arg0, arg1, class850.field8730.field8736, this.field9655, var5, var6, (int)var7.field5328, (int)var7.field5330, (int)var7.field5331, arg2, (class832)null);
   }

   @deob.ObfuscatedName("yg.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      if (this.field9650 == null) {
         this.field9650 = Statics.method15751((int)var2.field5328, (int)var2.field5330, (int)var2.field5331, this.method16091(arg0, 0));
      }

      return this.field9650;
   }

   @deob.ObfuscatedName("yg.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      if (this.field9653 == null) {
         return null;
      } else {
         class583 var2 = this.method11605();
         class715 var3 = class715.method15306(this.field9657);
         this.field9653.method7001(var2, this.field1036[0], 0);
         return var3;
      }
   }

   @deob.ObfuscatedName("yg.bn(Lra;I)V")
   public void method2044(class772 arg0) {
   }

   @deob.ObfuscatedName("yg.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.method16091(arg0, 131072);
      if (var4 != null) {
         class583 var5 = this.method11605();
         return var4.method6935(arg1, arg2, var5, false, 0);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("yg.bj(I)Z")
   public boolean method2016() {
      return this.field9651;
   }

   @deob.ObfuscatedName("yg.bv(Lra;Laex;IIIZI)V")
   public void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (arg1 instanceof class967) {
         class967 var7 = (class967)arg1;
         if (this.field9653 != null && var7.field9653 != null) {
            this.field9653.method6959(var7.field9653, arg2, arg3, arg4, arg5);
         }
      }

   }

   @deob.ObfuscatedName("yg.bd(I)V")
   public void method2028() {
      this.field9651 = false;
      if (this.field9653 != null) {
         this.field9653.method6916(this.field9653.method6980() & -65537);
      }

   }

   @deob.ObfuscatedName("yg.n(I)I")
   public int method5093() {
      return this.field9959;
   }

   @deob.ObfuscatedName("yg.k(I)I")
   public int method5083() {
      return class850.field8730.field8736;
   }

   @deob.ObfuscatedName("yg.d(B)I")
   public int method5084() {
      return this.field9655;
   }

   @deob.ObfuscatedName("yg.b(I)V")
   public void method5085() {
      if (this.field9653 != null) {
         this.field9653.method6918();
      }

   }

   @deob.ObfuscatedName("yg.r(I)Z")
   public boolean method5086() {
      return this.field9659;
   }

   @deob.ObfuscatedName("yg.p(Lra;I)V")
   public void method5101(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9652 == null && this.field9659) {
         class862 var3 = this.method16092(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9652;
         this.field9652 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10527(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }

   @deob.ObfuscatedName("yg.o(Lra;I)V")
   public void method5088(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9652 == null && this.field9659) {
         class862 var3 = this.method16092(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9652;
         this.field9652 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10528(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }
}
