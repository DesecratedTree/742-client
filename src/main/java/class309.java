@deob.ObfuscatedName("aln")
public class class309 extends class297 {
   @deob.ObfuscatedName("aln.i")
   public int field1933 = -1;
   @deob.ObfuscatedName("aln.c")
   public int field1932 = -1;
   @deob.ObfuscatedName("aln.q")
   public int field1927 = 0;
   @deob.ObfuscatedName("aln.y")
   private int field1934 = 0;
   @deob.ObfuscatedName("aln.j")
   private boolean field1925 = false;
   @deob.ObfuscatedName("aln.f")
   private int field1926;
   @deob.ObfuscatedName("aln.t")
   public int field1928;
   @deob.ObfuscatedName("aln.z")
   public int field1929;
   @deob.ObfuscatedName("aln.w")
   public int field1930;
   @deob.ObfuscatedName("aln.m")
   public int field1931;
   @deob.ObfuscatedName("aln.ai")
   private int field1935;
   @deob.ObfuscatedName("aln.ap")
   private int field1936;
   @deob.ObfuscatedName("aln.av")
   private int field1937;

   public class309(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
      this.method2017(3);
      this.method3910();
   }

   @deob.ObfuscatedName("aln.n(I)V")
   private void method3910() {
      this.field1926 = 32 + (int)(Math.random() * 4.0D);
      this.field1935 = 3 + (int)(Math.random() * 2.0D);
      this.field1936 = 16 + (int)(Math.random() * 3.0D);
      if (Statics.field9361.field972.method2268() == 1) {
         this.field1937 = (int)(Math.random() * 10.0D);
      } else {
         this.field1937 = (int)(Math.random() * 20.0D);
      }

   }

   @deob.ObfuscatedName("aln.bc(B)Z")
   public boolean method81() {
      return false;
   }

   @deob.ObfuscatedName("aln.bw(I)Z")
   public boolean method82() {
      return this.field1925;
   }

   @deob.ObfuscatedName("aln.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return null;
   }

   @deob.ObfuscatedName("aln.by(B)I")
   public int method80() {
      return -10;
   }

   @deob.ObfuscatedName("aln.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      class584 var2 = class584.method8135(this.method11602().field5446);
      class699 var3 = this.field1033.method10580(this.field1032, (int)var2.field5328 >> 9, (int)var2.field5331 >> 9);
      class275 var4 = this.field1033.method10516(this.field1032, (int)var2.field5328 >> 9, (int)var2.field5331 >> 9);
      int var5 = 0;
      if (var3 != null && var3.field6458.field9624) {
         var5 = var3.field6458.method80();
      }

      if (var4 != null && var4.field1809 > -var5) {
         var5 = -var4.field1809;
      }

      if (this.field1927 != var5) {
         var2.field5330 += (float)(var5 - this.field1927);
         this.method11626(var2);
         this.field1927 = var5;
      }

      class583 var6 = arg0.method7763();
      var6.method8059();
      if (this.field1927 == 0) {
         boolean var7 = false;
         boolean var8 = false;
         boolean var9 = false;
         class934 var10 = this.field1033.field6580[this.field1034];
         int var11 = this.field1934 << 1;
         int var13 = -var11 / 2;
         int var14 = -var11 / 2;
         int var15 = var10.method15965((int)var2.field5328 + var13, (int)var2.field5331 + var14);
         int var16 = var11 / 2;
         int var17 = -var11 / 2;
         int var18 = var10.method15965((int)var2.field5328 + var16, (int)var2.field5331 + var17);
         int var19 = -var11 / 2;
         int var20 = var11 / 2;
         int var21 = var10.method15965((int)var2.field5328 + var19, (int)var2.field5331 + var20);
         int var22 = var11 / 2;
         int var23 = var11 / 2;
         int var24 = var10.method15965((int)var2.field5328 + var22, (int)var2.field5331 + var23);
         int var25 = var15 < var18 ? var15 : var18;
         int var26 = var21 < var24 ? var21 : var24;
         int var27 = var18 < var24 ? var18 : var24;
         int var28 = var15 < var21 ? var15 : var21;
         if (var11 != 0) {
            int var29 = (int)(Math.atan2((double)(var25 - var26), (double)var11) * 2607.5945876176133D) & 16383;
            if (var29 != 0) {
               var6.method8126(1.0F, 0.0F, 0.0F, class603.method8577(var29));
            }
         }

         if (var11 != 0) {
            int var30 = (int)(Math.atan2((double)(var28 - var27), (double)var11) * 2607.5945876176133D) & 16383;
            if (var30 != 0) {
               var6.method8126(0.0F, 0.0F, 1.0F, class603.method8577(-var30));
            }
         }

         int var31 = var15 + var24;
         if (var18 + var21 < var31) {
            var31 = var18 + var21;
         }

         int var32 = (var31 >> 1) - (int)var2.field5330;
         if (var32 != 0) {
            var6.method8072(0.0F, (float)var32, 0.0F);
         }
      }

      var2.method8201();
      class584 var33 = this.method11602().field5446;
      var6.method8072(var33.field5328, var33.field5330 - 10.0F, var33.field5331);
      class715 var34 = class715.method15306(true);
      this.field1925 = false;
      this.field1934 = 0;
      if (this.field1932 != -1) {
         class745 var35 = Statics.field4196.method15540(this.field1932).method15609(arg0, 526336, this.field1930, (class747)null, (class836)null, this.field1926, this.field1935, this.field1936, this.field1937);
         if (var35 != null) {
            var35.method7001(var6, this.field1036[2], 0);
            this.field1925 |= var35.method6949();
            this.field1934 = var35.method6938();
         }
      }

      if (this.field1933 != -1) {
         class745 var36 = Statics.field4196.method15540(this.field1933).method15609(arg0, 526336, this.field1928, (class747)null, (class836)null, this.field1926, this.field1935, this.field1936, this.field1937);
         if (var36 != null) {
            var36.method7001(var6, this.field1036[1], 0);
            this.field1925 |= var36.method6949();
            if (var36.method6938() > this.field1934) {
               this.field1934 = var36.method6938();
            }
         }
      }

      class745 var37 = Statics.field4196.method15540(this.field1929).method15609(arg0, 526336, this.field1931, (class747)null, (class836)null, this.field1926, this.field1935, this.field1936, this.field1937);
      if (var37 != null) {
         var37.method7001(var6, this.field1036[0], 0);
         this.field1925 |= var37.method6949();
         if (var37.method6938() > this.field1934) {
            this.field1934 = var37.method6938();
         }
      }

      return var34;
   }

   @deob.ObfuscatedName("aln.bn(Lra;I)V")
   public void method2044(class772 arg0) {
   }

   @deob.ObfuscatedName("aln.fh(B)I")
   public int method2021() {
      class899 var1 = Statics.field4196.method15540(this.field1929);
      int var2 = var1.field9186;
      if (this.field1933 != -1) {
         class899 var3 = Statics.field4196.method15540(this.field1933);
         if (var3.field9186 > var2) {
            var2 = var3.field9186;
         }
      }

      if (this.field1932 != -1) {
         class899 var4 = Statics.field4196.method15540(this.field1932);
         if (var4.field9186 > var2) {
            var2 = var4.field9186;
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("aln.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      class583 var4 = arg0.method7763();
      var4.method8110(this.method11602());
      var4.method8072(0.0F, -10.0F, 0.0F);
      class745 var5 = Statics.field4196.method15540(this.field1929).method15609(arg0, 131072, this.field1931, (class747)null, (class836)null, 0, 0, 0, 0);
      if (var5 != null && var5.method6935(arg1, arg2, var4, true, 0)) {
         return true;
      } else {
         if (this.field1933 != -1) {
            class745 var6 = Statics.field4196.method15540(this.field1933).method15609(arg0, 131072, this.field1928, (class747)null, (class836)null, 0, 0, 0, 0);
            if (var6 != null && var6.method6935(arg1, arg2, var4, true, 0)) {
               return true;
            }
         }

         if (this.field1932 != -1) {
            class745 var7 = Statics.field4196.method15540(this.field1932).method15609(arg0, 131072, this.field1930, (class747)null, (class836)null, 0, 0, 0, 0);
            if (var7 != null && var7.method6935(arg1, arg2, var4, true, 0)) {
               return true;
            }
         }

         return false;
      }
   }

   @deob.ObfuscatedName("aln.bm(B)I")
   public int method162() {
      return this.field1927 - this.method80();
   }
}
