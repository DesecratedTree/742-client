@deob.ObfuscatedName("yo")
public class class975 extends class276 implements class376 {
   @deob.ObfuscatedName("yo.l")
   private static final int[] field9878 = new int[]{1, 2, 4, 8};
   @deob.ObfuscatedName("yo.u")
   private static final int[] field9870 = new int[]{16, 32, 64, 128};
   @deob.ObfuscatedName("yo.v")
   private class831 field9871;
   @deob.ObfuscatedName("yo.z")
   private final int field9875;
   @deob.ObfuscatedName("yo.t")
   private final boolean field9876;
   @deob.ObfuscatedName("yo.i")
   private final byte field9877;
   @deob.ObfuscatedName("yo.m")
   private final byte field9873;
   @deob.ObfuscatedName("yo.c")
   private boolean field9879;
   @deob.ObfuscatedName("yo.w")
   private boolean field9874;
   @deob.ObfuscatedName("yo.q")
   private boolean field9881;
   @deob.ObfuscatedName("yo.g")
   public class745 field9872;
   @deob.ObfuscatedName("yo.h")
   private class664 field9880;
   @deob.ObfuscatedName("yo.e")
   private class712 field9869;

   public class975(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, boolean arg12) {
      super(arg0, arg6, arg7, arg8, arg4, arg5, method11580(arg10, arg11));
      this.field9871 = arg2;
      this.field9875 = arg3.field8577;
      this.field9876 = arg9;
      this.field9877 = (byte)arg10;
      this.field9873 = (byte)arg11;
      this.field9879 = arg3.field8638 != 0 && !arg9;
      this.field9874 = arg12;
      this.field9881 = arg1.method7494() && arg3.field8637 && !this.field9876 && Statics.field9361.field964.method2210() != 0;
      int var14 = 2048;
      if (this.field9874) {
         var14 |= 65536;
      }

      if (arg3.field8587) {
         var14 |= 524288;
      }

      class862 var15 = this.method16251(arg1, var14, this.field9881);
      if (var15 != null) {
         this.field9872 = (class745)var15.field8800;
         this.field9880 = (class664)var15.field8801;
         if (this.field9874 || arg3.field8587) {
            this.field9872 = this.field9872.method6914((byte)0, var14, false);
            if (arg3.field8587) {
               class642 var16 = client.field2468.method9514();
               this.field9872.method6953(var16.field5807, var16.field5804, var16.field5805, var16.field5806);
            }
         }
      }

      this.method2017(1);
   }

   @deob.ObfuscatedName("yo.bc(B)Z")
   public boolean method81() {
      if (this.field9872 != null) {
         return !this.field9872.method6956();
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("yo.bw(I)Z")
   public boolean method82() {
      return this.field9872 != null ? this.field9872.method6949() : false;
   }

   @deob.ObfuscatedName("yo.by(B)I")
   public int method80() {
      return this.field9872 != null ? this.field9872.method6941() : 0;
   }

   @deob.ObfuscatedName("ra.bq(IIB)I")
   private static int method11580(int arg0, int arg1) {
      return class850.field8716.field8736 != arg0 && class850.field8725.field8736 != arg0 ? field9878[arg1 & 3] : field9870[arg1 & 3];
   }

   @deob.ObfuscatedName("yo.bk(Lra;IB)Lqa;")
   private class745 method16250(class772 arg0, int arg1) {
      if (this.field9872 != null && arg0.method7534(this.field9872.method6980(), arg1) == 0) {
         return this.field9872;
      } else {
         class862 var3 = this.method16251(arg0, arg1, false);
         return var3 != null ? (class745)var3.field8800 : null;
      }
   }

   @deob.ObfuscatedName("yo.cz(Lra;IZB)Luj;")
   private class862 method16251(class772 arg0, int arg1, boolean arg2) {
      class843 var4 = this.field9871.method14651(this.field9875);
      class934 var5;
      class934 var6;
      if (this.field9876) {
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
      return var4.method14850(arg0, arg1, this.field9877, this.field9873, var5, var6, (int)var7.field5328, (int)var7.field5330, (int)var7.field5331, arg2, (class832)null);
   }

   @deob.ObfuscatedName("yo.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      if (this.field9869 == null) {
         this.field9869 = Statics.method15751((int)var2.field5328, (int)var2.field5330, (int)var2.field5331, this.method16250(arg0, 0));
      }

      return this.field9869;
   }

   @deob.ObfuscatedName("yo.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      if (this.field9872 == null) {
         return null;
      } else {
         class583 var2 = this.method11605();
         class715 var3 = class715.method15306(this.field9879);
         this.field9872.method7001(var2, this.field1036[0], 0);
         return var3;
      }
   }

   @deob.ObfuscatedName("yo.bn(Lra;I)V")
   public void method2044(class772 arg0) {
   }

   @deob.ObfuscatedName("yo.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.method16250(arg0, 131072);
      if (var4 != null) {
         class583 var5 = this.method11605();
         return var4.method6935(arg1, arg2, var5, false, 0);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("yo.bj(I)Z")
   public boolean method2016() {
      return this.field9874;
   }

   @deob.ObfuscatedName("yo.bv(Lra;Laex;IIIZI)V")
   public void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      if (arg1 instanceof class975) {
         class975 var7 = (class975)arg1;
         if (this.field9872 != null && var7.field9872 != null) {
            this.field9872.method6959(var7.field9872, arg2, arg3, arg4, arg5);
         }
      } else if (arg1 instanceof class964) {
         class964 var8 = (class964)arg1;
         if (this.field9872 != null && var8.field9634 != null) {
            this.field9872.method6959(var8.field9634, arg2, arg3, arg4, arg5);
         }
      }

   }

   @deob.ObfuscatedName("yo.bd(I)V")
   public void method2028() {
      this.field9874 = false;
      if (this.field9872 != null) {
         this.field9872.method6916(this.field9872.method6980() & -65537);
      }

   }

   @deob.ObfuscatedName("yo.n(I)I")
   public int method5093() {
      return this.field9875;
   }

   @deob.ObfuscatedName("yo.k(I)I")
   public int method5083() {
      return this.field9877;
   }

   @deob.ObfuscatedName("yo.d(B)I")
   public int method5084() {
      return this.field9873;
   }

   @deob.ObfuscatedName("yo.b(I)V")
   public void method5085() {
      if (this.field9872 != null) {
         this.field9872.method6918();
      }

   }

   @deob.ObfuscatedName("yo.r(I)Z")
   public boolean method5086() {
      return this.field9881;
   }

   @deob.ObfuscatedName("yo.p(Lra;I)V")
   public void method5101(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9880 == null && this.field9881) {
         class862 var3 = this.method16251(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9880;
         this.field9880 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10527(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }

   @deob.ObfuscatedName("yo.o(Lra;I)V")
   public void method5088(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9880 == null && this.field9881) {
         class862 var3 = this.method16251(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9880;
         this.field9880 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10528(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }
}
