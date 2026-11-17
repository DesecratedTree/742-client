@deob.ObfuscatedName("alr")
public class class312 extends class290 {
   @deob.ObfuscatedName("alr.aw")
   private boolean field1951 = false;
   @deob.ObfuscatedName("alr.ab")
   private int field1945 = 0;
   @deob.ObfuscatedName("alr.ae")
   private boolean field1964 = false;
   @deob.ObfuscatedName("alr.aq")
   private int field1966 = 0;
   @deob.ObfuscatedName("alr.q")
   private final int field1953;
   @deob.ObfuscatedName("alr.f")
   public final int field1948;
   @deob.ObfuscatedName("alr.ai")
   public final int field1959;
   @deob.ObfuscatedName("alr.ap")
   private final int field1950;
   @deob.ObfuscatedName("alr.av")
   private final int field1949;
   @deob.ObfuscatedName("alr.ax")
   private final int field1957;
   @deob.ObfuscatedName("alr.af")
   public final int field1952;
   @deob.ObfuscatedName("alr.y")
   private final int field1946;
   @deob.ObfuscatedName("alr.j")
   public final int field1956;
   @deob.ObfuscatedName("alr.ah")
   private final boolean field1963;
   @deob.ObfuscatedName("alr.at")
   private final int field1954;
   @deob.ObfuscatedName("alr.ao")
   private final class836 field1962;
   @deob.ObfuscatedName("alr.ag")
   private double field1947;
   @deob.ObfuscatedName("alr.al")
   private double field1955;
   @deob.ObfuscatedName("alr.an")
   private double field1958;
   @deob.ObfuscatedName("alr.ak")
   private double field1960;
   @deob.ObfuscatedName("alr.aa")
   private double field1961;
   @deob.ObfuscatedName("alr.az")
   private class756 field1965;

   public class312(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
      super(arg0, arg2, arg3, arg4, client.method5777(arg4, arg5, arg2) - arg6, arg5, arg4 >> 9, arg4 >> 9, arg5 >> 9, arg5 >> 9, false, (byte)0);
      this.field1953 = arg1;
      this.field1948 = arg7;
      this.field1959 = arg8;
      this.field1950 = arg9;
      this.field1949 = arg10;
      this.field1957 = arg11;
      this.field1952 = arg12;
      this.field1946 = arg6;
      this.field1956 = arg13;
      this.field1963 = arg14;
      this.field1951 = false;
      this.field1954 = arg15;
      this.field1966 = arg16;
      int var18 = Statics.field3758.method14209(this.field1953).field8406;
      this.field1962 = new class184(this, false);
      this.field1962.method14694(var18);
      this.method2017(1);
   }

   @deob.ObfuscatedName("alr.bc(B)Z")
   public boolean method81() {
      return false;
   }

   @deob.ObfuscatedName("alr.bw(I)Z")
   public boolean method82() {
      return this.field1964;
   }

   @deob.ObfuscatedName("alr.by(B)I")
   public int method80() {
      return this.field1945;
   }

   @deob.ObfuscatedName("alr.n(I)I")
   public int method3919() {
      return this.field1966;
   }

   @deob.ObfuscatedName("alr.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return null;
   }

   @deob.ObfuscatedName("alr.k(IIIII)V")
   public final void method3914(int arg0, int arg1, int arg2, int arg3) {
      class584 var5 = class584.method8135(this.method11602().field5446);
      if (!this.field1951) {
         float var6 = (float)arg0 - var5.field5328;
         float var7 = (float)arg1 - var5.field5331;
         float var8 = (float)Math.sqrt((double)(var6 * var6 + var7 * var7));
         if (var8 != 0.0F) {
            var5.field5328 += (float)this.field1949 * var6 / var8;
            var5.field5331 += (float)this.field1949 * var7 / var8;
         }

         if (this.field1963) {
            var5.field5330 = (float)(client.method5777((int)var5.field5328, (int)var5.field5331, this.field1032) - this.field1946);
         }

         this.method11626(var5);
      }

      double var9 = (double)(this.field1959 + 1 - arg3);
      this.field1955 = (double)((float)arg0 - var5.field5328) / var9;
      this.field1958 = (double)((float)arg1 - var5.field5331) / var9;
      this.field1947 = Math.sqrt(this.field1958 * this.field1958 + this.field1955 * this.field1955);
      if (this.field1950 != -1) {
         if (!this.field1951) {
            this.field1960 = -this.field1947 * Math.tan((double)this.field1950 * 0.02454369D);
         }

         this.field1961 = ((double)((float)arg2 - var5.field5330) - this.field1960 * var9) * 2.0D / (var9 * var9);
      } else {
         this.field1960 = (double)((float)arg2 - var5.field5330) / var9;
      }

      var5.method8201();
   }

   @deob.ObfuscatedName("alr.d(B)V")
   public void method3915() {
      if (!this.field1951) {
         if (this.field1957 != 0) {
            class4 var1 = null;
            if (client.field2476 == 0) {
               var1 = Statics.field9261[this.field1957 - 1].method5645();
            } else if (this.field1957 < 0) {
               int var2 = -this.field1957 - 1;
               if (client.field2452 == var2) {
                  var1 = Statics.field5701;
               } else {
                  var1 = client.field2408[var2];
               }
            } else {
               int var3 = this.field1957 - 1;
               class106 var4 = (class106)client.field2615.method15322((long)var3);
               if (var4 != null) {
                  var1 = (class4)var4.field807;
               }
            }

            if (var1 != null) {
               class584 var5 = var1.method11602().field5446;
               this.method11608(var5.field5328, (float)(client.method5777((int)var5.field5328, (int)var5.field5331, this.field1032) - this.field1946), var5.field5331);
               if (this.field1954 >= 0) {
                  class743 var6 = var1.method101();
                  int var7 = 0;
                  int var8 = 0;
                  if (var6.field6839 != null && var6.field6839[this.field1954] != null) {
                     var7 += var6.field6839[this.field1954][0];
                     var8 += var6.field6839[this.field1954][2];
                  }

                  if (var6.field6840 != null && var6.field6840[this.field1954] != null) {
                     var7 += var6.field6840[this.field1954][0];
                     var8 += var6.field6840[this.field1954][2];
                  }

                  if (var7 != 0 || var8 != 0) {
                     int var9 = var1.field57.method6560();
                     int var10 = var9;
                     if (var1.field24 != null && var1.field24[this.field1954] != -1) {
                        var10 = var1.field24[this.field1954];
                     }

                     int var11 = var10 - var9 & 16383;
                     int var12 = class603.field5469[var11];
                     int var13 = class603.field5471[var11];
                     int var14 = var7 * var13 + var8 * var12 >> 14;
                     int var15 = var8 * var13 - var7 * var12 >> 14;
                     class584 var17 = class584.method8135(this.method11602().field5446);
                     var17.field5328 += (float)var14;
                     var17.field5331 += (float)var15;
                     this.method11626(var17);
                     var17.method8201();
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("alr.b(IB)V")
   public final void method3933(int arg0) {
      this.field1951 = true;
      class600 var2 = new class600(this.method11602());
      var2.field5446.field5328 = (float)((double)var2.field5446.field5328 + (double)arg0 * this.field1955);
      var2.field5446.field5331 = (float)((double)var2.field5446.field5331 + (double)arg0 * this.field1958);
      if (this.field1963) {
         var2.field5446.field5330 = (float)(client.method5777((int)var2.field5446.field5328, (int)var2.field5446.field5331, this.field1032) - this.field1946);
      } else if (this.field1950 != -1) {
         var2.field5446.field5330 = (float)((double)var2.field5446.field5330 + this.field1961 * 0.5D * (double)arg0 * (double)arg0 + (double)arg0 * this.field1960);
         this.field1960 += (double)arg0 * this.field1961;
      } else {
         var2.field5446.field5330 = (float)((double)var2.field5446.field5330 + (double)arg0 * this.field1960);
      }

      var2.field5447.method8612(1.0F, 0.0F, 0.0F, (float)Math.atan2(this.field1960, this.field1947));
      class606 var3 = class606.method8602();
      var3.method8612(0.0F, 1.0F, 0.0F, (float)Math.atan2(this.field1955, this.field1958) - 3.1415927F);
      var2.field5447.method8622(var3);
      var3.method8654();
      this.method11609(var2);
      if (this.field1962.method14711(1) && this.field1962.method14707()) {
         this.field1962.method14761();
      }

   }

   @deob.ObfuscatedName("alr.r(Lra;II)Lqa;")
   private class745 method3918(class772 arg0, int arg1) {
      class815 var3 = Statics.field3758.method14209(this.field1953);
      return var3.method14388(arg0, arg1, this.field1962, (byte)2);
   }

   @deob.ObfuscatedName("alr.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      class745 var2 = this.method3918(arg0, 2048);
      if (var2 == null) {
         return null;
      } else {
         class583 var3 = this.method11605();
         this.method3916(arg0, var2, var3);
         class715 var4 = class715.method15306(false);
         var2.method7001(var3, this.field1036[0], 0);
         if (this.field1965 != null) {
            class391 var5 = this.field1965.method11223();
            arg0.method7542(var5);
         }

         this.field1964 = var2.method6949();
         var2.method6938();
         this.field1945 = var2.method6941();
         return var4;
      }
   }

   @deob.ObfuscatedName("alr.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      class745 var2 = this.method3918(arg0, 0);
      if (var2 != null) {
         class583 var3 = this.method11605();
         this.field1945 = var2.method6941();
         var2.method6938();
         this.method3916(arg0, var2, var3);
      }
   }

   @deob.ObfuscatedName("alr.ds(B)V")
   public void method184() {
      class584 var1 = this.method11602().field5446;
      this.field1875 = this.field1873 = (short)((int)(var1.field5328 / 512.0F));
      this.field1874 = this.field1876 = (short)((int)(var1.field5331 / 512.0F));
   }

   @deob.ObfuscatedName("alr.p(Lra;Lqa;Lka;I)V")
   private void method3916(class772 arg0, class745 arg1, class583 arg2) {
      arg1.method7024(arg2);
      class408[] var4 = arg1.method6957();
      class370[] var5 = arg1.method6958();
      if ((this.field1965 == null || this.field1965.field6971) && (var4 != null || var5 != null)) {
         this.field1965 = class756.method11243(client.field2418, true);
      }

      if (this.field1965 != null) {
         this.field1965.method11235(arg0, (long)client.field2418, var4, var5, false);
         this.field1965.method11221(this.field1032, this.field1875, this.field1873, this.field1874, this.field1876);
      }

   }

   @deob.ObfuscatedName("alr.o(B)V")
   public void method3917() {
      if (this.field1965 != null) {
         this.field1965.method11213();
      }

   }

   @deob.ObfuscatedName("alr.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      return false;
   }

   @deob.ObfuscatedName("alr.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("alr.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("alr.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }
}
