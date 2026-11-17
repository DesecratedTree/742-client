@deob.ObfuscatedName("ahi")
public class class200 extends class4 {
   @deob.ObfuscatedName("ahi.bb")
   public int field1305 = -1;
   @deob.ObfuscatedName("ahi.bu")
   public int field1299 = -1;
   @deob.ObfuscatedName("ahi.ca")
   public int field1298 = -1;
   @deob.ObfuscatedName("ahi.cj")
   public final class361 field1306 = new class361(32);
   @deob.ObfuscatedName("ahi.cw")
   private int[] field1307 = new int[6];
   @deob.ObfuscatedName("ahi.cd")
   private int[] field1308 = new int[6];
   @deob.ObfuscatedName("ahi.cm")
   public static int field1301 = 1;
   @deob.ObfuscatedName("ahi.co")
   public static int field1297 = 1;
   @deob.ObfuscatedName("ahi.cp")
   private int field1303;
   @deob.ObfuscatedName("ahi.ce")
   public int field1304;
   @deob.ObfuscatedName("ahi.ck")
   private int field1309;
   @deob.ObfuscatedName("ahi.cs")
   private int field1310;
   @deob.ObfuscatedName("ahi.cg")
   private int field1311;
   @deob.ObfuscatedName("ahi.be")
   public class915 field1312;
   @deob.ObfuscatedName("ahi.bl")
   public class921 field1300;
   @deob.ObfuscatedName("ahi.cf")
   public String field1302;

   public class200(class713 arg0, int arg1) {
      super(arg0, arg1);
      this.method2789();
   }

   public class200(class713 arg0) {
      super(arg0);
      this.method2789();
   }

   @deob.ObfuscatedName("ahi.ge(B)V")
   private void method2789() {
      this.field1309 = 32 + (int)(Math.random() * 4.0D);
      this.field1310 = 3 + (int)(Math.random() * 2.0D);
      this.field1311 = 16 + (int)(Math.random() * 3.0D);
      if (Statics.field9361.field972.method2268() == 1) {
         this.field1303 = (int)(Math.random() * 6.0D);
      } else {
         this.field1303 = (int)(Math.random() * 12.0D);
      }

   }

   @deob.ObfuscatedName("ahi.gx(Lwi;I)V")
   public void method2811(class915 arg0) {
      if (this.field1312 != arg0 && class987.field10492 && class987.method11208(this.field12)) {
         class987.method11730();
      }

      this.field1312 = arg0;
      if (this.field1312 != null) {
         this.field1302 = this.field1312.field9282;
         this.field1304 = this.field1312.field9303;
      }

      if (this.field27 != null) {
         this.field27.method11211();
      }

   }

   @deob.ObfuscatedName("ahi.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return null;
   }

   @deob.ObfuscatedName("ahi.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      if (this.field1312 != null && this.method2788(arg0, 526336)) {
         class583 var2 = this.method11605();
         class600 var3 = this.method11602();
         class583 var4 = arg0.method7763();
         int var5 = this.field57.method6560();
         class703 var6 = this.field1033.field6579[this.field1032][(int)var3.field5446.field5328 >> 9][(int)var3.field5446.field5331 >> 9];
         if (var6 != null && var6.field6482 != null) {
            int var7 = this.field23 - var6.field6482.field1809;
            this.field23 = (int)((float)this.field23 - (float)var7 / 10.0F);
         } else {
            this.field23 = (int)((float)this.field23 - (float)this.field23 / 10.0F);
         }

         var4.method8089(var2);
         var4.method8072(0.0F, (float)(-20 - this.field23), 0.0F);
         class743 var8 = this.method101();
         class915 var9 = this.field1312.field9319 != null ? this.field1312.method15778(Statics.field10637) : this.field1312;
         this.field53 = false;
         class715 var10 = null;
         if (Statics.field9361.field971.method2104() == 1 && var9.field9290 && var8.field6854) {
            class836 var11 = this.field38.method14691() && this.field38.method14749() ? this.field38 : null;
            class183 var12 = !this.field35.method14691() || this.field35.field1200 && var11 != null ? null : this.field35;
            class745 var13 = class547.method10727(arg0, var5, this.field61, this.field21, this.field52, this.field1312.field9328, this.field70[0], this.field1312.field9320 & 65535, this.field1312.field9321 & 65535, this.field1312.field9322 & 255, this.field1312.field9323 & 255, var12 != null ? var12 : var11);
            if (var13 != null) {
               if (this.field1036 == null || this.field1036.length < this.field70.length + 1) {
                  this.method2017(this.field70.length + 1);
               }

               var10 = class715.method15306(this.method2793());
               this.field53 = true;
               arg0.method7551(false);
               var13.method7001(var4, this.field1036[this.field70.length], 0);
               arg0.method7551(true);
            }
         }

         if (this.field1036 == null || this.field1036.length < this.field70.length) {
            this.method2017(this.field70.length);
         }

         if (var10 == null) {
            var10 = class715.method15306(this.method2793());
         }

         this.method88(arg0, this.field70, var4, false);

         for(int var14 = 0; var14 < this.field70.length; ++var14) {
            if (this.field70[var14] != null) {
               if (this.field1312.field9330) {
                  this.field70[var14].method6953(this.field1309, this.field1310, this.field1311, this.field1303);
               }

               this.field70[var14].method7001(var4, this.field1036[var14], 0);
            }
         }

         if (this.field27 != null) {
            class391 var15 = this.field27.method11223();
            arg0.method7542(var15);
         }

         for(int var16 = 0; var16 < this.field70.length; ++var16) {
            if (this.field70[var16] != null) {
               this.field53 |= this.field70[var16].method6949();
            }

            this.field70[var16] = null;
         }

         this.field9959 = client.field2530;
         return var10;
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("ahi.go(Lra;IS)Z")
   private boolean method2788(class772 arg0, int arg1) {
      int var3 = arg1;
      class743 var4 = this.method101();
      class836 var5 = this.field38.method14691() && !this.field38.method14749() ? this.field38 : null;
      class183 var6 = !this.field35.method14691() || this.field35.field1200 && var5 != null ? null : this.field35;
      int var7 = var4.field6835;
      int var8 = var4.field6836;
      if (var7 != 0 || var8 != 0 || var4.field6851 != 0 || var4.field6826 != 0) {
         arg1 |= 7;
      }

      boolean var9 = this.field50 != 0 && client.field2418 >= this.field45 && client.field2418 < this.field46;
      if (var9) {
         arg1 |= 524288;
      }

      int var10 = this.field57.method6560();
      class745 var11 = this.field70[0] = this.field1312.method15798(arg0, arg1, Statics.field8402, Statics.field10637, var5, var6, this.field31, this.field24, var10, this.field1300, this.method102(), false);
      if (var11 == null) {
         return false;
      } else {
         this.field15 = var11.method6941();
         var11.method6938();
         this.method98(var11);
         if (var7 == 0 && var8 == 0) {
            this.method100(var10, this.method96() << 9, this.method96() << 9, 0, 0);
         } else {
            this.method100(var10, var7, var8, var4.field6821, var4.field6842);
            if (this.field61 != 0) {
               this.field70[0].method6921(this.field61);
            }

            if (this.field21 != 0) {
               this.field70[0].method6999(this.field21);
            }

            if (this.field52 != 0) {
               this.field70[0].method7078(0, this.field52, 0);
            }
         }

         if (var9) {
            var11.method6953(this.field47, this.field48, this.field22, this.field50 & 255);
         }

         this.method99(arg0, var4, var3, var7, var8, var10);
         return true;
      }
   }

   @deob.ObfuscatedName("ahi.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      if (this.field1312 != null) {
         if (this.field68 || this.method2788(arg0, 0)) {
            class583 var2 = arg0.method7763();
            var2.method8089(this.method11605());
            var2.method8072(0.0F, -5.0F, 0.0F);
            this.method88(arg0, this.field70, var2, this.field68);

            for(int var3 = 0; var3 < this.field70.length; ++var3) {
               this.field70[var3] = null;
            }

         }
      }
   }

   @deob.ObfuscatedName("ahi.gt(Lmy;II)V")
   public final void method2803(class661 arg0, int arg1) {
      int var3 = this.field16[0];
      int var4 = this.field62[0];
      switch(arg0.field6056) {
      case 0:
         --var3;
         break;
      case 1:
         ++var3;
         ++var4;
         break;
      case 2:
         ++var4;
         break;
      case 3:
         ++var3;
         --var4;
         break;
      case 4:
         ++var3;
         break;
      case 5:
         --var4;
         break;
      case 6:
         --var3;
         --var4;
         break;
      case 7:
         --var3;
         ++var4;
      }

      if (this.field38.method14691() && this.field38.method14698().field8369 == 1) {
         this.field41 = null;
         this.field38.method14694(-1);
      }

      for(int var5 = 0; var5 < this.field37.length; ++var5) {
         if (this.field37[var5].field2770 != -1) {
            class815 var6 = Statics.field3758.method14209(this.field37[var5].field2770);
            if (var6.field8418 && var6.field8406 != -1 && Statics.field2046.method14475(var6.field8406).field8369 == 1) {
               this.field37[var5].field2774.method14694(-1);
               this.field37[var5].field2770 = -1;
            }
         }
      }

      if (this.field60 < this.field16.length - 1) {
         ++this.field60;
      }

      for(int var7 = this.field60; var7 > 0; --var7) {
         this.field16[var7] = this.field16[var7 - 1];
         this.field62[var7] = this.field62[var7 - 1];
         this.field63[var7] = this.field63[var7 - 1];
      }

      this.field16[0] = var3;
      this.field62[0] = var4;
      this.field63[0] = (byte)arg1;
   }

   @deob.ObfuscatedName("ahi.gk(IIIZII)V")
   public void method2805(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      this.field1032 = this.field1034 = (byte)arg0;
      if (client.field2468.method9592().method8746(arg1, arg2)) {
         ++this.field1034;
      }

      if (this.field38.method14691() && this.field38.method14698().field8369 == 1) {
         this.field41 = null;
         this.field38.method14694(-1);
      }

      for(int var6 = 0; var6 < this.field37.length; ++var6) {
         if (this.field37[var6].field2770 != -1) {
            class815 var7 = Statics.field3758.method14209(this.field37[var6].field2770);
            if (var7.field8418 && var7.field8406 != -1 && Statics.field2046.method14475(var7.field8406).field8369 == 1) {
               this.field37[var6].field2774.method14694(-1);
               this.field37[var6].field2770 = -1;
            }
         }
      }

      if (!arg3) {
         int var8 = arg1 - this.field16[0];
         int var9 = arg2 - this.field62[0];
         if (var8 >= -8 && var8 <= 8 && var9 >= -8 && var9 <= 8) {
            if (this.field60 < this.field16.length - 1) {
               ++this.field60;
            }

            for(int var10 = this.field60; var10 > 0; --var10) {
               this.field16[var10] = this.field16[var10 - 1];
               this.field62[var10] = this.field62[var10 - 1];
               this.field63[var10] = this.field63[var10 - 1];
            }

            this.field16[0] = arg1;
            this.field62[0] = arg2;
            this.field63[0] = class647.field5875.field5871;
            return;
         }
      }

      this.field60 = 0;
      this.field65 = 0;
      this.field71 = 0;
      this.field16[0] = arg1;
      this.field62[0] = arg2;
      class584 var11 = class584.method8135(this.method11602().field5446);
      var11.field5328 = (float)((this.field16[0] << 9) + (arg4 << 8));
      var11.field5331 = (float)((this.field62[0] << 9) + (arg4 << 8));
      this.method11626(var11);
      var11.method8201();
      if (this.field27 != null) {
         this.field27.method11211();
      }

   }

   @deob.ObfuscatedName("ahi.gh(I)Z")
   public final boolean method2791() {
      return this.field1312 != null;
   }

   @deob.ObfuscatedName("ahi.df(I)I")
   protected int method102() {
      if (this.field1298 != -1) {
         return this.field1298;
      } else {
         if (this.field1312.field9319 != null) {
            class915 var1 = this.field1312.method15778(Statics.field10637);
            if (var1 != null && var1.field9287 != -1) {
               return var1.field9287;
            }
         }

         return this.field1312.field9287;
      }
   }

   @deob.ObfuscatedName("ahi.dk(I)I")
   public int method103() {
      if (this.field1312.field9319 != null) {
         class915 var1 = this.field1312.method15778(Statics.field10637);
         if (var1 != null && var1.field9312 != -1) {
            return var1.field9312;
         }
      }

      return this.field1312.field9312;
   }

   @deob.ObfuscatedName("ahi.bm(B)I")
   public int method162() {
      if (this.field1312.field9319 != null) {
         class915 var1 = this.field1312.method15778(Statics.field10637);
         if (var1 != null && var1.field9336 != -1) {
            return var1.field9336;
         }
      }

      return this.field1312.field9336 != -1 ? this.field1312.field9336 : super.method162();
   }

   @deob.ObfuscatedName("ahi.ga(I)Z")
   private boolean method2793() {
      return this.field1312.field9308;
   }

   @deob.ObfuscatedName("ahi.fh(B)I")
   public int method2021() {
      return this.field1312 == null ? 0 : this.field1312.field9295;
   }

   @deob.ObfuscatedName("ahi.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      if (this.field1312 != null && this.method2788(arg0, 131072)) {
         class583 var4 = this.method11605();
         boolean var5 = false;

         for(int var6 = 0; var6 < this.field70.length; ++var6) {
            if (this.field70[var6] != null) {
               boolean var10000;
               label42: {
                  label41: {
                     if (this.field1312.field9295 <= 0) {
                        if (this.field1312.field9341 == -1) {
                           if (this.field1312.field9328 != 1) {
                              break label41;
                           }
                        } else if (this.field1312.field9341 != 1) {
                           break label41;
                        }
                     }

                     var10000 = true;
                     break label42;
                  }

                  var10000 = false;
               }

               boolean var7 = var10000;
               boolean var8 = this.field70[var6].method6935(arg1, arg2, var4, var7, this.field1312.field9295);
               if (var8) {
                  var5 = true;
                  break;
               }
            }
         }

         for(int var9 = 0; var9 < this.field70.length; ++var9) {
            this.field70[var9] = null;
         }

         return var5;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("ahi.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("ahi.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ahi.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ahi.gp(II)I")
   public int method2794(int arg0) {
      return this.field1307[arg0];
   }

   @deob.ObfuscatedName("ahi.gg(II)I")
   public int method2796(int arg0) {
      return this.field1308[arg0];
   }

   @deob.ObfuscatedName("ahi.ho(IIIS)V")
   public void method2790(int arg0, int arg1, int arg2) {
      this.field1307[arg0] = arg1;
      this.field1308[arg0] = arg2;
   }

   @deob.ObfuscatedName("ahi.dp(B)Z")
   public boolean method105() {
      return Statics.field5740.field7288;
   }

   @deob.ObfuscatedName("ahi.dh(I)Lcu;")
   public class379 method97() {
      return this.field55 != null && this.field55.field2760 == null ? null : this.field55;
   }

   @deob.ObfuscatedName("ahi.hu(Ljava/lang/String;III)V")
   public void method2795(String arg0, int arg1, int arg2) {
      int var4 = class671.method6226() * Statics.field5740.field7289;
      this.method107(arg0, arg1, arg2, var4);
   }

   @deob.ObfuscatedName("ahi.di(I)I")
   public int method138() {
      return this.field12 + 1;
   }

   @deob.ObfuscatedName("ahi.n(I)Lade;")
   public class88 method2823() {
      class723 var1 = client.field2468.method9649();
      return class88.method15740(this.field1032, (int)this.method11602().field5446.field5328 + var1.field6676 * 512, -((int)this.method11602().field5446.field5330), (int)this.method11602().field5446.field5331 + var1.field6677 * 512);
   }

   @deob.ObfuscatedName("ahi.k(I)Lkx;")
   public class606 method2797() {
      class606 var1 = class606.method8602();
      var1.method8613(class603.method8577(this.field57.field3820), 0.0F, 0.0F);
      return var1;
   }

   @deob.ObfuscatedName("ahi.d(B)Lkb;")
   public class584 method2798() {
      return class584.method8133();
   }
}
