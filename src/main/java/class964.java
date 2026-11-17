@deob.ObfuscatedName("yd")
public class class964 extends class290 implements class376 {
   @deob.ObfuscatedName("yd.l")
   private class831 field9627;
   @deob.ObfuscatedName("yd.h")
   private final int field9959;
   @deob.ObfuscatedName("yd.m")
   private final boolean field9631;
   @deob.ObfuscatedName("yd.e")
   private final byte field9629;
   @deob.ObfuscatedName("yd.z")
   private final byte field9625;
   @deob.ObfuscatedName("yd.i")
   private boolean field9632;
   @deob.ObfuscatedName("yd.t")
   private boolean field9633;
   @deob.ObfuscatedName("yd.c")
   private boolean field9624;
   @deob.ObfuscatedName("yd.u")
   public class745 field9634;
   @deob.ObfuscatedName("yd.v")
   private class664 field9626;
   @deob.ObfuscatedName("yd.g")
   private class712 field9630;

   public class964(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, boolean arg16) {
      super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.field8621 == 1, method5627(arg14, arg15));
      this.field9627 = arg2;
      this.field9959 = arg3.field8577;
      this.field1034 = (byte)arg5;
      this.field9631 = arg9;
      this.field9629 = (byte)arg14;
      this.field9625 = (byte)arg15;
      this.field9632 = arg3.field8638 != 0 && !arg9;
      this.field9633 = arg16;
      this.field9624 = arg1.method7494() && arg3.field8637 && !this.field9631 && Statics.field9361.field964.method2210() != 0;
      int var18 = 2048;
      if (this.field9633) {
         var18 |= 65536;
      }

      if (arg3.field8587) {
         var18 |= 524288;
      }

      class862 var19 = this.method16080(arg1, var18, this.field9624);
      if (var19 != null) {
         this.field9634 = (class745)var19.field8800;
         this.field9626 = (class664)var19.field8801;
         if (this.field9633 || arg3.field8587) {
            this.field9634 = this.field9634.method6914((byte)0, var18, false);
            if (arg3.field8587) {
               class642 var20 = client.field2468.method9514();
               this.field9634.method6953(var20.field5807, var20.field5804, var20.field5805, var20.field5806);
            }
         }
      }

      this.method2017(1);
   }

   @deob.ObfuscatedName("yd.bc(B)Z")
   public boolean method81() {
      if (this.field9634 != null) {
         return !this.field9634.method6956();
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("yd.bw(I)Z")
   public boolean method82() {
      return this.field9634 != null ? this.field9634.method6949() : false;
   }

   @deob.ObfuscatedName("dw.bq(III)B")
   private static byte method5627(int arg0, int arg1) {
      if (class850.field8717.field8736 != arg0) {
         return 0;
      } else {
         return (byte)((arg1 & 1) == 0 ? 1 : 2);
      }
   }

   @deob.ObfuscatedName("yd.by(B)I")
   public int method80() {
      return this.field9634 != null ? this.field9634.method6941() : 0;
   }

   @deob.ObfuscatedName("yd.bk(Lra;II)Lqa;")
   private class745 method16071(class772 arg0, int arg1) {
      if (this.field9634 != null && arg0.method7534(this.field9634.method6980(), arg1) == 0) {
         return this.field9634;
      } else {
         class862 var3 = this.method16080(arg0, arg1, false);
         return var3 != null ? (class745)var3.field8800 : null;
      }
   }

   @deob.ObfuscatedName("yd.cz(Lra;IZB)Luj;")
   private class862 method16080(class772 arg0, int arg1, boolean arg2) {
      class843 var4 = this.field9627.method14651(this.field9959);
      class934 var5;
      class934 var6;
      if (this.field9631) {
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
      return var4.method14850(arg0, arg1, class850.field8734.field8736 != this.field9629 ? this.field9629 : class850.field8733.field8736, class850.field8734.field8736 == this.field9629 ? this.field9625 + 4 : this.field9625, var5, var6, (int)var7.field5328, (int)var7.field5330, (int)var7.field5331, arg2, (class832)null);
   }

   @deob.ObfuscatedName("yd.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      if (this.field9630 == null) {
         this.field9630 = Statics.method15751((int)var2.field5328, (int)var2.field5330, (int)var2.field5331, this.method16071(arg0, 0));
      }

      return this.field9630;
   }

   @deob.ObfuscatedName("yd.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      if (this.field9634 == null) {
         return null;
      } else {
         class583 var2 = this.method11605();
         class715 var3 = class715.method15306(this.field9632);
         this.field9634.method7001(var2, this.field1036[0], 0);
         return var3;
      }
   }

   @deob.ObfuscatedName("yd.bn(Lra;I)V")
   public void method2044(class772 arg0) {
   }

   @deob.ObfuscatedName("yd.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.method16071(arg0, 131072);
      if (var4 != null) {
         class583 var5 = this.method11605();
         return var4.method6935(arg1, arg2, var5, false, 0);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("yd.bj(I)Z")
   public boolean method2016() {
      return this.field9633;
   }

   @deob.ObfuscatedName("yd.bv(Lra;Laex;IIIZI)V")
   public void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (arg1 instanceof class975) {
         class975 var7 = (class975)arg1;
         if (this.field9634 != null && var7.field9872 != null) {
            this.field9634.method6959(var7.field9872, arg2, arg3, arg4, arg5);
         }
      } else if (arg1 instanceof class964) {
         class964 var8 = (class964)arg1;
         if (this.field9634 != null && var8.field9634 != null) {
            this.field9634.method6959(var8.field9634, arg2, arg3, arg4, arg5);
         }
      }

   }

   @deob.ObfuscatedName("yd.bd(I)V")
   public void method2028() {
      this.field9633 = false;
      if (this.field9634 != null) {
         this.field9634.method6916(this.field9634.method6980() & -65537);
      }

   }

   @deob.ObfuscatedName("yd.n(I)I")
   public int method5093() {
      return this.field9959;
   }

   @deob.ObfuscatedName("yd.k(I)I")
   public int method5083() {
      return this.field9629;
   }

   @deob.ObfuscatedName("yd.d(B)I")
   public int method5084() {
      return this.field9625;
   }

   @deob.ObfuscatedName("yd.b(I)V")
   public void method5085() {
      if (this.field9634 != null) {
         this.field9634.method6918();
      }

   }

   @deob.ObfuscatedName("yd.r(I)Z")
   public boolean method5086() {
      return this.field9624;
   }

   @deob.ObfuscatedName("yd.p(Lra;I)V")
   public void method5101(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9626 == null && this.field9624) {
         class862 var3 = this.method16080(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9626;
         this.field9626 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10527(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }

   @deob.ObfuscatedName("yd.o(Lra;I)V")
   public void method5088(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9626 == null && this.field9624) {
         class862 var3 = this.method16080(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9626;
         this.field9626 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10528(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }

   @deob.ObfuscatedName("yd.ct(I)I")
   public int method16073() {
      return this.field9634 != null ? this.field9634.method7004() / 4 : 15;
   }
}
