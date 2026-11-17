@deob.ObfuscatedName("yr")
public class class978 extends class288 implements class376 {
   @deob.ObfuscatedName("yr.l")
   private class831 field9954;
   @deob.ObfuscatedName("yr.h")
   private final int field9959;
   @deob.ObfuscatedName("yr.m")
   private final boolean field9958;
   @deob.ObfuscatedName("yr.z")
   private final byte field9957;
   @deob.ObfuscatedName("yr.e")
   private final byte field9956;
   @deob.ObfuscatedName("yr.i")
   private boolean field9951;
   @deob.ObfuscatedName("yr.t")
   private boolean field9960;
   @deob.ObfuscatedName("yr.u")
   private class745 field9952;
   @deob.ObfuscatedName("yr.v")
   private class664 field9953;
   @deob.ObfuscatedName("yr.g")
   private class712 field9955;

   public class978(class713 arg0, class772 arg1, class831 arg2, class843 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
      super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
      this.field9954 = arg2;
      this.field9959 = arg3.field8577;
      this.field9958 = arg9;
      this.field9957 = (byte)arg13;
      this.field9956 = (byte)arg12;
      this.field9951 = arg3.field8638 != 0 && !arg9;
      this.field9960 = arg1.method7494() && arg3.field8637 && !this.field9958 && Statics.field9361.field964.method2210() != 0;
      int var15 = 2048;
      if (arg3.field8587) {
         var15 |= 524288;
      }

      class862 var16 = this.method16295(arg1, var15, this.field9960);
      if (var16 != null) {
         this.field9952 = (class745)var16.field8800;
         this.field9953 = (class664)var16.field8801;
         if (arg3.field8587) {
            this.field9952 = this.field9952.method6914((byte)0, var15, false);
            if (arg3.field8587) {
               class642 var17 = client.field2468.method9514();
               this.field9952.method6953(var17.field5807, var17.field5804, var17.field5805, var17.field5806);
            }
         }
      }

      this.method2017(1);
   }

   @deob.ObfuscatedName("yr.bc(B)Z")
   public boolean method81() {
      if (this.field9952 != null) {
         return !this.field9952.method6956();
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("yr.bw(I)Z")
   public boolean method82() {
      return this.field9952 != null ? this.field9952.method6949() : false;
   }

   @deob.ObfuscatedName("yr.by(B)I")
   public int method80() {
      return this.field9952 != null ? this.field9952.method6941() : 0;
   }

   @deob.ObfuscatedName("yr.bq(Lra;II)Lqa;")
   private class745 method16294(class772 arg0, int arg1) {
      if (this.field9952 != null && arg0.method7534(this.field9952.method6980(), arg1) == 0) {
         return this.field9952;
      } else {
         class862 var3 = this.method16295(arg0, arg1, false);
         return var3 != null ? (class745)var3.field8800 : null;
      }
   }

   @deob.ObfuscatedName("yr.bk(Lra;IZB)Luj;")
   private class862 method16295(class772 arg0, int arg1, boolean arg2) {
      class843 var4 = this.field9954.method14651(this.field9959);
      class934 var5;
      class934 var6;
      if (this.field9958) {
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
      return var4.method14850(arg0, arg1, this.field9956, this.field9957, var5, var6, (int)var7.field5328, (int)var7.field5330, (int)var7.field5331, arg2, (class832)null);
   }

   @deob.ObfuscatedName("yr.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      if (this.field9955 == null) {
         this.field9955 = Statics.method15751((int)var2.field5328, (int)var2.field5330, (int)var2.field5331, this.method16294(arg0, 0));
      }

      return this.field9955;
   }

   @deob.ObfuscatedName("yr.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      if (this.field9952 == null) {
         return null;
      } else {
         class583 var2 = arg0.method7763();
         var2.method8089(this.method11605());
         var2.method8072((float)this.field1862, 0.0F, (float)this.field1861);
         class715 var3 = class715.method15306(this.field9951);
         this.field9952.method7001(var2, this.field1036[0], 0);
         return var3;
      }
   }

   @deob.ObfuscatedName("yr.bn(Lra;I)V")
   public void method2044(class772 arg0) {
   }

   @deob.ObfuscatedName("yr.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class745 var4 = this.method16294(arg0, 131072);
      if (var4 != null) {
         class583 var5 = this.method11605();
         return var4.method6935(arg1, arg2, var5, false, 0);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("yr.n(I)I")
   public int method5093() {
      return this.field9959;
   }

   @deob.ObfuscatedName("yr.k(I)I")
   public int method5083() {
      return this.field9956;
   }

   @deob.ObfuscatedName("yr.d(B)I")
   public int method5084() {
      return this.field9957;
   }

   @deob.ObfuscatedName("yr.b(I)V")
   public void method5085() {
      if (this.field9952 != null) {
         this.field9952.method6918();
      }

   }

   @deob.ObfuscatedName("yr.r(I)Z")
   public boolean method5086() {
      return this.field9960;
   }

   @deob.ObfuscatedName("yr.p(Lra;I)V")
   public void method5101(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9953 == null && this.field9960) {
         class862 var3 = this.method16295(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9953;
         this.field9953 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10527(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }

   @deob.ObfuscatedName("yr.o(Lra;I)V")
   public void method5088(class772 arg0) {
      Object var2 = null;
      class664 var4;
      if (this.field9953 == null && this.field9960) {
         class862 var3 = this.method16295(arg0, 262144, true);
         var4 = (class664)(var3 != null ? var3.field8801 : null);
      } else {
         var4 = this.field9953;
         this.field9953 = null;
      }

      class584 var5 = this.method11602().field5446;
      if (var4 != null) {
         this.field1033.method10528(var4, this.field1034, (int)var5.field5328, (int)var5.field5331, (boolean[])null);
      }

   }
}
