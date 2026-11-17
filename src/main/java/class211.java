@deob.ObfuscatedName("aht")
public class class211 extends class4 {
   @deob.ObfuscatedName("aht.cm")
   public byte field1396 = 0;
   @deob.ObfuscatedName("aht.ca")
   public int field1389 = -1;
   @deob.ObfuscatedName("aht.ce")
   public int field1388 = -1;
   @deob.ObfuscatedName("aht.cf")
   public int field1382 = 0;
   @deob.ObfuscatedName("aht.cj")
   public int field1390 = 0;
   @deob.ObfuscatedName("aht.cw")
   public int field1405 = -1;
   @deob.ObfuscatedName("aht.cd")
   public int field1392 = 0;
   @deob.ObfuscatedName("aht.ck")
   public int field1383 = -1;
   @deob.ObfuscatedName("aht.cs")
   public boolean field1394 = false;
   @deob.ObfuscatedName("aht.cg")
   public int field1395 = 0;
   @deob.ObfuscatedName("aht.cp")
   public int field1398 = -1;
   @deob.ObfuscatedName("aht.cv")
   public int field1397 = -1;
   @deob.ObfuscatedName("aht.cr")
   public int field1387 = -1;
   @deob.ObfuscatedName("aht.cc")
   public int field1399 = -1;
   @deob.ObfuscatedName("aht.cx")
   public boolean field1400 = false;
   @deob.ObfuscatedName("aht.ch")
   public int field1401 = 0;
   @deob.ObfuscatedName("aht.cu")
   public int field1393 = 255;
   @deob.ObfuscatedName("aht.cl")
   public boolean field1404 = false;
   @deob.ObfuscatedName("aht.cz")
   public boolean field1410 = false;
   @deob.ObfuscatedName("aht.ct")
   public boolean field1408 = false;
   @deob.ObfuscatedName("aht.cn")
   public boolean field1409 = false;
   @deob.ObfuscatedName("aht.cq")
   public final class380 field1402 = new class380(16);
   @deob.ObfuscatedName("aht.cy")
   private int field1403;
   @deob.ObfuscatedName("aht.ci")
   public int field1406;
   @deob.ObfuscatedName("aht.cb")
   public int field1407;
   @deob.ObfuscatedName("aht.co")
   public class747 field1386;
   @deob.ObfuscatedName("aht.bb")
   public String field1381;
   @deob.ObfuscatedName("aht.bl")
   private String field1384;
   @deob.ObfuscatedName("aht.bu")
   private String field1385;
   @deob.ObfuscatedName("aht.be")
   public String field1391;

   public class211(class713 arg0, int arg1) {
      super(arg0, arg1);
   }

   public class211(class713 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("aht.ge(Laen;B)V")
   public final void method2871(class124 arg0) {
      arg0.field935 = 0;
      int var2 = arg0.method1688();
      this.field1396 = (byte)(var2 & 1);
      boolean var3 = this.field1400;
      this.field1400 = (var2 & 2) != 0;
      boolean var4 = (var2 & 4) != 0;
      int var5 = super.method96();
      this.method95((var2 >> 3 & 7) + 1);
      boolean var6 = (var2 & 64) != 0;
      boolean var7 = (var2 & 128) != 0;
      class584 var8 = class584.method8135(this.method11602().field5446);
      var8.field5328 += (float)(this.method96() - var5 << 8);
      var8.field5331 += (float)(this.method96() - var5 << 8);
      this.method11626(var8);
      var8.method8201();
      if (var6) {
         this.field1385 = arg0.method1600();
      } else {
         this.field1385 = null;
      }

      if (var7) {
         this.field1384 = arg0.method1600();
      } else {
         this.field1384 = null;
      }

      this.field1389 = arg0.method1623();
      this.field1388 = arg0.method1623();
      this.field1408 = arg0.method1623() == 1;
      if (class819.field8428 == Statics.field4896 && client.field2562 >= 2) {
         this.field1408 = false;
      }

      int var9 = -1;
      this.field1395 = 0;
      int[] var10 = new int[Statics.field3828.field7256.length];
      class880[] var11 = new class880[Statics.field3828.field7256.length];
      class899[] var12 = new class899[Statics.field3828.field7256.length];

      for(int var13 = 0; var13 < Statics.field3828.field7256.length; ++var13) {
         if (Statics.field3828.field7256[var13] != 1) {
            int var14 = arg0.method1688();
            if (var14 == 0) {
               var10[var13] = 0;
            } else {
               int var15 = arg0.method1688();
               int var16 = (var14 << 8) + var15;
               if (var13 == 0 && var16 == 65535) {
                  var9 = arg0.method1608();
                  this.field1395 = arg0.method1688();
                  break;
               }

               if (var16 >= 16384) {
                  int var17 = var16 - 16384;
                  var10[var13] = var17 | 1073741824;
                  var12[var13] = Statics.field4196.method15540(var17);
                  int var18 = var12[var13].field9139;
                  if (var18 != 0) {
                     this.field1395 = var18;
                  }
               } else {
                  var10[var13] = var16 - 256 | Integer.MIN_VALUE;
               }
            }
         }
      }

      if (var9 == -1) {
         int var19 = arg0.method1587();
         int var20 = 0;

         for(int var21 = 0; var21 < Statics.field3828.field7256.length; ++var21) {
            if (Statics.field3828.field7256[var21] == 0) {
               if ((var19 & 1 << var20) != 0) {
                  var11[var21] = Statics.method14843(var12[var21], arg0);
               }

               ++var20;
            }
         }
      }

      int[] var22 = new int[10];

      for(int var23 = 0; var23 < 10; ++var23) {
         int var24 = arg0.method1688();
         if (Statics.field6884.length < 1 || var24 < 0 || var24 >= Statics.field6884[var23][0].length) {
            var24 = 0;
         }

         var22[var23] = var24;
      }

      this.field1403 = arg0.method1587();
      this.field1391 = arg0.method1599();
      this.field1381 = this.field1391;
      if (Statics.field5701 == this) {
         Statics.field1854 = this.field1391;
      }

      this.field1382 = arg0.method1688();
      if (var4) {
         this.field1392 = arg0.method1587();
         if (this.field1392 == 65535) {
            this.field1392 = -1;
         }

         this.field1390 = this.field1382;
         this.field1405 = -1;
      } else {
         this.field1392 = 0;
         this.field1390 = arg0.method1688();
         this.field1405 = arg0.method1688();
         if (this.field1405 == 255) {
            this.field1405 = -1;
         }
      }

      int var25 = this.field1401;
      this.field1401 = arg0.method1688();
      if (this.field1401 != 0) {
         int var26 = this.field1398;
         int var27 = this.field1397;
         int var28 = this.field1387;
         int var29 = this.field1399;
         int var30 = this.field1393;
         this.field1398 = arg0.method1587();
         this.field1397 = arg0.method1587();
         this.field1387 = arg0.method1587();
         this.field1399 = arg0.method1587();
         this.field1393 = arg0.method1688();
         if (this.field1400 != var3 || this.field1401 != var25 || this.field1398 != var26 || this.field1397 != var27 || this.field1387 != var28 || this.field1399 != var29 || this.field1393 != var30) {
            class98.method1938(this);
         }
      } else {
         Statics.method395(this);
      }

      if (this.field1386 == null) {
         this.field1386 = new class747();
      }

      int var31 = this.field1386.field6888;
      int[] var32 = this.field1386.field6886;
      this.field1386.method11053(this.method102(), var10, var11, var22, this.field1396 == 1, var9);
      if (var9 != var31) {
         class584 var33 = class584.method8135(this.method11602().field5446);
         var33.field5328 = (float)((this.field16[0] << 9) + (this.method96() << 8));
         var33.field5331 = (float)((this.field62[0] << 9) + (this.method96() << 8));
         this.method11626(var33);
         var33.method8201();
      }

      if (client.field2452 == this.field12 && var32 != null) {
         for(int var34 = 0; var34 < var22.length; ++var34) {
            if (var22[var34] != var32[var34]) {
               Statics.field4196.method15528();
               break;
            }
         }
      }

      if (this.field27 != null) {
         this.field27.method11211();
      }

      if (this.field35.method14691() && this.field35.field1200) {
         class743 var35 = this.method101();
         if (!var35.method10966(this.field35.method14716())) {
            this.field35.method14694(-1);
            this.field35.field1200 = false;
         }
      }

   }

   @deob.ObfuscatedName("aht.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return null;
   }

   @deob.ObfuscatedName("aht.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      if (this.field1386 != null && this.method2861(arg0, 2048)) {
         class583 var2 = arg0.method7763();
         class583 var3 = this.method11605();
         class600 var4 = this.method11602();
         int var5 = this.field57.method6560();
         class703 var6 = this.field1033.field6579[this.field1032][(int)var4.field5446.field5328 >> 9][(int)var4.field5446.field5331 >> 9];
         if (var6 != null && var6.field6482 != null) {
            int var7 = this.field23 - var6.field6482.field1809;
            this.field23 = (int)((float)this.field23 - (float)var7 / 10.0F);
         } else {
            this.field23 = (int)((float)this.field23 - (float)this.field23 / 10.0F);
         }

         var2.method8089(var3);
         var2.method8072(0.0F, (float)(-20 - this.field23), 0.0F);
         class715 var8 = null;
         this.field53 = false;
         if (Statics.field9361.field971.method2104() == 1) {
            class743 var9 = this.method101();
            if (var9.field6854 && (this.field1386.field6888 == -1 || Statics.field93.method15857(this.field1386.field6888).field9290)) {
               class836 var10 = this.field38.method14691() && this.field38.method14749() ? this.field38 : null;
               class183 var11 = !this.field35.method14691() || this.field35.field1200 && var10 != null ? null : this.field35;
               class745 var12 = class547.method10727(arg0, var5, this.field61, this.field21, this.field52, 1, this.field70[0], 0, 0, 160, 240, var11 != null ? var11 : var10);
               if (var12 != null) {
                  if (this.field1036 == null || this.field1036.length < this.field70.length + 1) {
                     this.method2017(this.field70.length + 1);
                  }

                  var8 = class715.method15306(true);
                  this.field53 = true;
                  arg0.method7551(false);
                  var12.method7001(var2, this.field1036[this.field70.length], 0);
                  arg0.method7551(true);
               }
            }
         }

         if (Statics.field5701 == this) {
            for(int var13 = client.field2423.length - 1; var13 >= 0; --var13) {
               class164 var14 = client.field2423[var13];
               if (var14 != null && var14.field1151 != -1) {
                  if (var14.field1156 == 1) {
                     class106 var15 = (class106)client.field2615.method15322((long)var14.field1150);
                     if (var15 != null) {
                        class200 var16 = (class200)var15.field807;
                        class584 var17 = class584.method8152(var16.method11602().field5446, Statics.field5701.method11602().field5446);
                        int var18 = (int)var17.field5328;
                        int var19 = (int)var17.field5331;
                        this.method2860(arg0, var2, this.field70[0], (long)var18, (long)var19, var14.field1151, 92160000L);
                     }
                  }

                  if (var14.field1156 == 2) {
                     class584 var20 = Statics.field5701.method11602().field5446;
                     long var21 = (long)(var14.field1152 - (int)var20.field5328);
                     long var23 = (long)(var14.field1155 - (int)var20.field5331);
                     long var25 = (long)(var14.field1148 << 9);
                     long var27 = var25 * var25;
                     this.method2860(arg0, var2, this.field70[0], var21, var23, var14.field1151, var27);
                  }

                  if (var14.field1156 == 10 && var14.field1150 >= 0 && var14.field1150 < client.field2408.length) {
                     class211 var29 = client.field2408[var14.field1150];
                     if (var29 != null) {
                        class584 var30 = class584.method8152(var29.method11602().field5446, Statics.field5701.method11602().field5446);
                        int var31 = (int)var30.field5328;
                        int var32 = (int)var30.field5331;
                        this.method2860(arg0, var2, this.field70[0], (long)var31, (long)var32, var14.field1151, 92160000L);
                     }
                  }
               }
            }
         }

         var2.method8089(var3);
         var2.method8072(0.0F, (float)(-5 - this.field23), 0.0F);
         if (this.field1036 == null || this.field1036.length < this.field70.length) {
            this.method2017(this.field70.length);
         }

         if (var8 == null) {
            var8 = class715.method15306(true);
         }

         this.method88(arg0, this.field70, var2, false);

         for(int var33 = 0; var33 < this.field70.length; ++var33) {
            if (this.field70[var33] != null) {
               this.field70[var33].method7001(var2, this.field1036[var33], Statics.field5701 == this ? 1 : 0);
            }
         }

         if (this.field27 != null) {
            class391 var34 = this.field27.method11223();
            arg0.method7542(var34);
         }

         for(int var35 = 0; var35 < this.field70.length; ++var35) {
            if (this.field70[var35] != null) {
               this.field53 |= this.field70[var35].method6949();
            }

            this.field70[var35] = null;
         }

         this.field9959 = client.field2530;
         return var8;
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("aht.bn(Lra;I)V")
   public void method2044(class772 arg0) {
      if (this.field1386 != null) {
         if (this.field68 || this.method2861(arg0, 0)) {
            class583 var2 = arg0.method7763();
            var2.method8110(this.method11602());
            var2.method8072(0.0F, -5.0F, 0.0F);
            this.method88(arg0, this.field70, var2, this.field68);

            for(int var3 = 0; var3 < this.field70.length; ++var3) {
               this.field70[var3] = null;
            }

         }
      }
   }

   @deob.ObfuscatedName("aht.gx(Lra;Lka;Lqa;JJIJ)V")
   private void method2860(class772 arg0, class583 arg1, class745 arg2, long arg3, long arg4, int arg5, long arg6) {
      long var11 = arg3 * arg3 + arg4 * arg4;
      if (var11 >= 262144L && var11 <= arg6) {
         int var13 = (int)(Math.atan2((double)arg3, (double)arg4) * 2607.5945876176133D - (double)this.field57.method6560()) & 16383;
         class745 var14 = class164.method9073(arg0, var13, this.field61, this.field21, this.field52, arg5);
         if (var14 != null) {
            arg0.method7551(false);
            var14.method7001(arg1, (class394)null, 0);
            arg0.method7551(true);
         }

      }
   }

   @deob.ObfuscatedName("aht.go(Lra;II)Z")
   private boolean method2861(class772 arg0, int arg1) {
      int var3 = arg1;
      class743 var4 = this.method101();
      class836 var5 = this.field38.method14691() && !this.field38.method14749() ? this.field38 : null;
      class183 var6 = !this.field35.method14691() || this.field1394 || this.field35.field1200 && var5 != null ? null : this.field35;
      int var7 = var4.field6835;
      int var8 = var4.field6836;
      if (var7 != 0 || var8 != 0 || var4.field6851 != 0 || var4.field6826 != 0) {
         arg1 |= 7;
      }

      int var9 = this.field57.method6560();
      boolean var10 = this.field50 != 0 && client.field2418 >= this.field45 && client.field2418 < this.field46;
      if (var10) {
         arg1 |= 524288;
      }

      class745 var11 = this.field70[0] = this.field1386.method11060(arg0, arg1, Statics.field8402, Statics.field9434, Statics.field93, Statics.field4196, Statics.field2046, Statics.field10637, var5, var6, this.field31, this.field24, var9, true, Statics.field3828);
      int var12 = class747.method6252();
      if (class671.field6130 < 96 && var12 > 50) {
         class318.method8926();
      }

      if (class819.field8428 != Statics.field4896 && var12 < 50) {
         int var13 = 50 - var12;

         while(var13 > client.field2595) {
            Statics.field9400[client.field2595] = new byte[102400];
            ++client.field2595;
         }

         while(var13 < client.field2595) {
            --client.field2595;
            Statics.field9400[client.field2595] = null;
         }
      } else if (class819.field8428 != Statics.field4896) {
         Statics.field9400 = new byte[50][];
         client.field2595 = 0;
      }

      if (var11 == null) {
         return false;
      } else {
         this.field15 = var11.method6941();
         var11.method6938();
         this.method98(var11);
         if (var7 == 0 && var8 == 0) {
            this.method100(var9, this.method96() << 9, this.method96() << 9, 0, 0);
         } else {
            this.method100(var9, var7, var8, var4.field6821, var4.field6842);
            if (this.field61 != 0) {
               var11.method6921(this.field61);
            }

            if (this.field21 != 0) {
               var11.method6999(this.field21);
            }

            if (this.field52 != 0) {
               var11.method7078(0, this.field52, 0);
            }
         }

         if (var10) {
            var11.method6953(this.field47, this.field48, this.field22, this.field50 & 255);
         }

         if (!this.field1394) {
            this.method99(arg0, var4, var3, var7, var8, var9);
         }

         return true;
      }
   }

   @deob.ObfuscatedName("aht.gt(ZI)Ljava/lang/String;")
   public String method2862(boolean arg0) {
      String var2 = "";
      if (this.field1385 != null) {
         var2 = this.field1385;
      }

      String var3;
      if (arg0) {
         var3 = var2 + this.field1391;
      } else {
         var3 = var2 + this.field1381;
      }

      if (this.field1384 != null) {
         var3 = var3 + this.field1384;
      }

      return var3;
   }

   @deob.ObfuscatedName("aht.gk(ZI)Ljava/lang/String;")
   public String method2863(boolean arg0) {
      return arg0 ? this.field1391 : this.field1381;
   }

   @deob.ObfuscatedName("aht.gh(IIBI)V")
   public final void method2864(int arg0, int arg1, byte arg2) {
      if (this.field38.method14691() && this.field38.method14698().field8369 == 1) {
         this.field41 = null;
         this.field38.method14694(-1);
      }

      for(int var4 = 0; var4 < this.field37.length; ++var4) {
         if (this.field37[var4].field2770 != -1) {
            class815 var5 = Statics.field3758.method14209(this.field37[var4].field2770);
            if (var5.field8418 && var5.field8406 != -1 && Statics.field2046.method14475(var5.field8406).field8369 == 1) {
               this.field37[var4].field2774.method14694(-1);
               this.field37[var4].field2770 = -1;
            }
         }
      }

      this.field1383 = -1;
      if (arg0 >= 0 && arg0 < client.field2468.method9648() && arg1 >= 0 && arg1 < client.field2468.method9604()) {
         if (this.field16[0] >= 0 && this.field16[0] < client.field2468.method9648() && this.field62[0] >= 0 && this.field62[0] < client.field2468.method9604()) {
            if (class647.field5874.field5871 == arg2) {
               client.method8290(this, arg0, arg1, class647.field5874.field5871);
            }

            this.method2866(arg0, arg1, arg2);
         } else {
            this.method2865(arg0, arg1);
         }
      } else {
         this.method2865(arg0, arg1);
      }

   }

   @deob.ObfuscatedName("aht.ga(IIB)V")
   public void method2865(int arg0, int arg1) {
      this.field60 = 0;
      this.field65 = 0;
      this.field71 = 0;
      this.field16[0] = arg0;
      this.field62[0] = arg1;
      int var3 = this.method96();
      class584 var4 = class584.method8135(this.method11602().field5446);
      var4.field5328 = (float)(this.field16[0] * 512 + var3 * 256);
      var4.field5331 = (float)(this.field62[0] * 512 + var3 * 256);
      this.method11626(var4);
      var4.method8201();
      if (Statics.field5701 == this) {
         client.field2468.method9512().method11128();
      }

      if (this.field27 != null) {
         this.field27.method11211();
      }

   }

   @deob.ObfuscatedName("aht.gp(IIBI)V")
   public final void method2866(int arg0, int arg1, byte arg2) {
      if (this.field60 < this.field16.length - 1) {
         ++this.field60;
      }

      for(int var4 = this.field60; var4 > 0; --var4) {
         this.field16[var4] = this.field16[var4 - 1];
         this.field62[var4] = this.field62[var4 - 1];
         this.field63[var4] = this.field63[var4 - 1];
      }

      this.field16[0] = arg0;
      this.field62[0] = arg1;
      this.field63[0] = arg2;
   }

   @deob.ObfuscatedName("aht.gg(B)Z")
   public final boolean method2867() {
      return this.field1386 != null;
   }

   @deob.ObfuscatedName("aht.ct(I)I")
   public int method96() {
      return this.field1386 != null && this.field1386.field6888 != -1 ? Statics.field93.method15857(this.field1386.field6888).field9328 : super.method96();
   }

   @deob.ObfuscatedName("aht.df(I)I")
   protected int method102() {
      return this.field1403;
   }

   @deob.ObfuscatedName("aht.dk(I)I")
   public int method103() {
      return -1;
   }

   @deob.ObfuscatedName("aht.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      if (this.field1386 != null && this.method2861(arg0, 131072)) {
         class583 var4 = this.method11605();
         boolean var5 = false;

         for(int var6 = 0; var6 < this.field70.length; ++var6) {
            if (this.field70[var6] != null && this.field70[var6].method6935(arg1, arg2, var4, true, 0)) {
               var5 = true;
               break;
            }
         }

         for(int var7 = 0; var7 < this.field70.length; ++var7) {
            this.field70[var7] = null;
         }

         return var5;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("aht.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("aht.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("aht.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("aht.dp(B)Z")
   public boolean method105() {
      return Statics.field5740.field7290;
   }

   @deob.ObfuscatedName("aht.dh(I)Lcu;")
   public class379 method97() {
      if (this.field55 != null) {
         if (this.field55.field2760 == null) {
            return null;
         }

         if (client.field2582 == 0 || client.field2582 == 3 || client.field2582 == 1 && client.method6111(this.field1381)) {
            return this.field55;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("aht.ho(Ljava/lang/String;IIB)V")
   public void method2869(String arg0, int arg1, int arg2) {
      this.method107(arg0, arg1, arg2, class671.method6226() * Statics.field5740.field7278);
   }

   @deob.ObfuscatedName("aht.n(I)Lade;")
   public class88 method2823() {
      class723 var1 = client.field2468.method9649();
      return class88.method15740(this.field1032, (int)this.method11602().field5446.field5328 + var1.field6676 * 512, -((int)this.method11602().field5446.field5330), (int)this.method11602().field5446.field5331 + var1.field6677 * 512);
   }

   @deob.ObfuscatedName("aht.k(I)Lkx;")
   public class606 method2797() {
      class606 var1 = class606.method8602();
      var1.method8613(class603.method8577(this.field57.field3820), 0.0F, 0.0F);
      return var1;
   }

   @deob.ObfuscatedName("aht.d(B)Lkb;")
   public class584 method2798() {
      return class584.method8133();
   }

   @deob.ObfuscatedName("aht.di(I)I")
   public int method138() {
      return -this.field12 - 1;
   }
}
