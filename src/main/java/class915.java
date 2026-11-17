import java.util.Arrays;

@deob.ObfuscatedName("wi")
public class class915 {
   @deob.ObfuscatedName("wi.k")
   public static short[] field9279 = new short[256];
   @deob.ObfuscatedName("wi.r")
   public String field9282 = "null";
   @deob.ObfuscatedName("wi.p")
   public int field9328 = 1;
   @deob.ObfuscatedName("wi.s")
   public int field9287 = -1;
   @deob.ObfuscatedName("wi.c")
   private byte field9343 = 0;
   @deob.ObfuscatedName("wi.y")
   public int field9284 = -1;
   @deob.ObfuscatedName("wi.j")
   public boolean field9314 = true;
   @deob.ObfuscatedName("wi.f")
   public int field9303 = -1;
   @deob.ObfuscatedName("wi.ai")
   private int field9304 = 128;
   @deob.ObfuscatedName("wi.ap")
   private int field9313 = 128;
   @deob.ObfuscatedName("wi.av")
   public boolean field9302 = false;
   @deob.ObfuscatedName("wi.ax")
   public boolean field9307 = false;
   @deob.ObfuscatedName("wi.af")
   public boolean field9344 = false;
   @deob.ObfuscatedName("wi.at")
   private int field9309 = 0;
   @deob.ObfuscatedName("wi.ah")
   private int field9310 = 0;
   @deob.ObfuscatedName("wi.aw")
   public int field9300 = -1;
   @deob.ObfuscatedName("wi.al")
   public int field9312 = -1;
   @deob.ObfuscatedName("wi.an")
   public int field9306 = 32;
   @deob.ObfuscatedName("wi.ak")
   private int field9315 = -1;
   @deob.ObfuscatedName("wi.aa")
   private int field9316 = -1;
   @deob.ObfuscatedName("wi.ao")
   public boolean field9308 = true;
   @deob.ObfuscatedName("wi.ab")
   public boolean field9318 = true;
   @deob.ObfuscatedName("wi.ae")
   public boolean field9290 = true;
   @deob.ObfuscatedName("wi.az")
   public short field9320 = 0;
   @deob.ObfuscatedName("wi.aq")
   public short field9321 = 0;
   @deob.ObfuscatedName("wi.ar")
   public byte field9322 = -96;
   @deob.ObfuscatedName("wi.as")
   public byte field9323 = -16;
   @deob.ObfuscatedName("wi.au")
   public byte field9301 = 0;
   @deob.ObfuscatedName("wi.aj")
   public int field9327 = -1;
   @deob.ObfuscatedName("wi.ac")
   public int field9342 = -1;
   @deob.ObfuscatedName("wi.ay")
   public int field9329 = -1;
   @deob.ObfuscatedName("wi.bf")
   public int field9337 = -1;
   @deob.ObfuscatedName("wi.bp")
   public int field9278 = 0;
   @deob.ObfuscatedName("wi.bs")
   public int field9332 = 0;
   @deob.ObfuscatedName("wi.br")
   public int field9331 = 255;
   @deob.ObfuscatedName("wi.bc")
   public int field9336 = -1;
   @deob.ObfuscatedName("wi.bw")
   public class661 field9283 = class661.field6057;
   @deob.ObfuscatedName("wi.bq")
   public int field9338 = -1;
   @deob.ObfuscatedName("wi.bx")
   public byte field9340 = -1;
   @deob.ObfuscatedName("wi.bm")
   public int field9341 = -1;
   @deob.ObfuscatedName("wi.bh")
   public int field9311 = 256;
   @deob.ObfuscatedName("wi.bn")
   public int field9345 = 256;
   @deob.ObfuscatedName("wi.bk")
   public int field9295 = 0;
   @deob.ObfuscatedName("wi.bo")
   public boolean field9330 = true;
   @deob.ObfuscatedName("wi.m")
   private byte field9296;
   @deob.ObfuscatedName("wi.t")
   private byte field9297;
   @deob.ObfuscatedName("wi.i")
   private byte field9305;
   @deob.ObfuscatedName("wi.b")
   public int field9281;
   @deob.ObfuscatedName("wi.bg")
   private class875 field9335;
   @deob.ObfuscatedName("wi.d")
   public class919 field9280;
   @deob.ObfuscatedName("wi.ba")
   public boolean field9334;
   @deob.ObfuscatedName("wi.v")
   private byte[] field9285;
   @deob.ObfuscatedName("wi.e")
   public byte[] field9293;
   @deob.ObfuscatedName("wi.z")
   public byte[] field9294;
   @deob.ObfuscatedName("wi.a")
   public int[] field9298;
   @deob.ObfuscatedName("wi.ag")
   public int[] field9319;
   @deob.ObfuscatedName("wi.o")
   public int[] field9324;
   @deob.ObfuscatedName("wi.q")
   private int[] field9333;
   @deob.ObfuscatedName("wi.by")
   public int[] field9339;
   @deob.ObfuscatedName("wi.w")
   public String[] field9299;
   @deob.ObfuscatedName("wi.l")
   private short[] field9288;
   @deob.ObfuscatedName("wi.u")
   public short[] field9289;
   @deob.ObfuscatedName("wi.g")
   private short[] field9291;
   @deob.ObfuscatedName("wi.h")
   public short[] field9292;
   @deob.ObfuscatedName("wi.x")
   private int[][] field9286;

   @deob.ObfuscatedName("wi.n(Laen;I)V")
   public void method15770(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15771(arg0, var2);
      }
   }

   @deob.ObfuscatedName("wi.k(Laen;II)V")
   private void method15771(class124 arg0, int arg1) {
      if (arg1 == 1) {
         int var3 = arg0.method1688();
         this.field9324 = new int[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field9324[var4] = arg0.method1608();
         }
      } else if (arg1 == 2) {
         this.field9282 = arg0.method1599();
      } else if (arg1 == 12) {
         this.field9328 = arg0.method1688();
      } else if (arg1 >= 30 && arg1 < 35) {
         this.field9299[arg1 - 30] = arg0.method1599();
      } else if (arg1 == 40) {
         int var5 = arg0.method1688();
         this.field9288 = new short[var5];
         this.field9289 = new short[var5];

         for(int var6 = 0; var6 < var5; ++var6) {
            this.field9288[var6] = (short)arg0.method1587();
            this.field9289[var6] = (short)arg0.method1587();
         }
      } else if (arg1 == 41) {
         int var7 = arg0.method1688();
         this.field9291 = new short[var7];
         this.field9292 = new short[var7];

         for(int var8 = 0; var8 < var7; ++var8) {
            this.field9291[var8] = (short)arg0.method1587();
            this.field9292[var8] = (short)arg0.method1587();
         }
      } else if (arg1 == 42) {
         int var9 = arg0.method1688();
         this.field9285 = new byte[var9];

         for(int var10 = 0; var10 < var9; ++var10) {
            this.field9285[var10] = arg0.method1623();
         }
      } else if (arg1 == 44) {
         int var11 = arg0.method1587();
         int var12 = 0;

         for(int var13 = var11; var13 > 0; var13 >>= 1) {
            ++var12;
         }

         this.field9293 = new byte[var12];
         byte var14 = 0;

         for(int var15 = 0; var15 < var12; ++var15) {
            if ((var11 & 1 << var15) > 0) {
               this.field9293[var15] = var14++;
            } else {
               this.field9293[var15] = -1;
            }
         }
      } else if (arg1 == 45) {
         int var16 = arg0.method1587();
         int var17 = 0;

         for(int var18 = var16; var18 > 0; var18 >>= 1) {
            ++var17;
         }

         this.field9294 = new byte[var17];
         byte var19 = 0;

         for(int var20 = 0; var20 < var17; ++var20) {
            if ((var16 & 1 << var20) > 0) {
               this.field9294[var20] = var19++;
            } else {
               this.field9294[var20] = -1;
            }
         }
      } else if (arg1 == 60) {
         int var21 = arg0.method1688();
         this.field9298 = new int[var21];

         for(int var22 = 0; var22 < var21; ++var22) {
            this.field9298[var22] = arg0.method1608();
         }
      } else if (arg1 == 93) {
         this.field9314 = false;
      } else if (arg1 == 95) {
         this.field9303 = arg0.method1587();
      } else if (arg1 == 97) {
         this.field9304 = arg0.method1587();
      } else if (arg1 == 98) {
         this.field9313 = arg0.method1587();
      } else if (arg1 == 99) {
         this.field9302 = true;
      } else if (arg1 == 100) {
         this.field9309 = arg0.method1623();
      } else if (arg1 == 101) {
         this.field9310 = arg0.method1623();
      } else if (arg1 == 102) {
         this.field9300 = arg0.method1587();
      } else if (arg1 == 103) {
         this.field9306 = arg0.method1587();
      } else if (arg1 != 106 && arg1 != 118) {
         if (arg1 == 107) {
            this.field9308 = false;
         } else if (arg1 == 109) {
            this.field9318 = false;
         } else if (arg1 == 111) {
            this.field9290 = false;
         } else if (arg1 == 113) {
            this.field9320 = (short)arg0.method1587();
            this.field9321 = (short)arg0.method1587();
         } else if (arg1 == 114) {
            this.field9322 = arg0.method1623();
            this.field9323 = arg0.method1623();
         } else if (arg1 == 119) {
            this.field9301 = arg0.method1623();
         } else if (arg1 == 121) {
            this.field9286 = new int[this.field9324.length][];
            int var23 = arg0.method1688();

            for(int var24 = 0; var24 < var23; ++var24) {
               int var25 = arg0.method1688();
               int[] var26 = this.field9286[var25] = new int[3];
               var26[0] = arg0.method1623();
               var26[1] = arg0.method1623();
               var26[2] = arg0.method1623();
            }
         } else if (arg1 == 123) {
            this.field9336 = arg0.method1587();
         } else if (arg1 == 125) {
            this.field9283 = (class661)class814.method4102(class661.method7335(), arg0.method1623());
         } else if (arg1 == 127) {
            this.field9287 = arg0.method1587();
         } else if (arg1 == 128) {
            class814.method4102(class647.method15598(), arg0.method1688());
         } else if (arg1 == 134) {
            this.field9327 = arg0.method1587();
            if (this.field9327 == 65535) {
               this.field9327 = -1;
            }

            this.field9342 = arg0.method1587();
            if (this.field9342 == 65535) {
               this.field9342 = -1;
            }

            this.field9329 = arg0.method1587();
            if (this.field9329 == 65535) {
               this.field9329 = -1;
            }

            this.field9337 = arg0.method1587();
            if (this.field9337 == 65535) {
               this.field9337 = -1;
            }

            this.field9278 = arg0.method1688();
         } else if (arg1 != 135 && arg1 != 136) {
            if (arg1 == 137) {
               this.field9284 = arg0.method1587();
            } else if (arg1 == 138) {
               this.field9312 = arg0.method1608();
            } else if (arg1 == 140) {
               this.field9331 = arg0.method1688();
            } else if (arg1 == 141) {
               this.field9344 = true;
            } else if (arg1 == 142) {
               this.field9338 = arg0.method1587();
            } else if (arg1 == 143) {
               this.field9307 = true;
            } else if (arg1 >= 150 && arg1 < 155) {
               this.field9299[arg1 - 150] = arg0.method1599();
               if (!this.field9280.field9370) {
                  this.field9299[arg1 - 150] = null;
               }
            } else if (arg1 == 155) {
               this.field9296 = arg0.method1623();
               this.field9305 = arg0.method1623();
               this.field9297 = arg0.method1623();
               this.field9343 = arg0.method1623();
            } else if (arg1 == 158) {
               this.field9340 = 1;
            } else if (arg1 == 159) {
               this.field9340 = 0;
            } else if (arg1 == 160) {
               int var27 = arg0.method1688();
               this.field9339 = new int[var27];

               for(int var28 = 0; var28 < var27; ++var28) {
                  this.field9339[var28] = arg0.method1587();
               }
            } else if (arg1 == 162) {
               this.field9334 = true;
            } else if (arg1 == 163) {
               this.field9341 = arg0.method1688();
            } else if (arg1 == 164) {
               this.field9311 = arg0.method1587();
               this.field9345 = arg0.method1587();
            } else if (arg1 == 165) {
               this.field9295 = arg0.method1688();
            } else if (arg1 == 168) {
               this.field9332 = arg0.method1688();
            } else if (arg1 == 169) {
               this.field9330 = false;
            } else if (arg1 >= 170 && arg1 < 176) {
               if (this.field9333 == null) {
                  this.field9333 = new int[6];
                  Arrays.fill(this.field9333, -1);
               }

               int var29 = arg0.method1587();
               if (var29 == 65535) {
                  var29 = -1;
               }

               this.field9333[arg1 - 170] = var29;
            } else if (arg1 == 249) {
               int var30 = arg0.method1688();
               if (this.field9335 == null) {
                  int var31 = class887.method4053(var30);
                  this.field9335 = new class875(var31);
               }

               for(int var32 = 0; var32 < var30; ++var32) {
                  boolean var33 = arg0.method1688() == 1;
                  int var34 = arg0.method1589();
                  class674 var35;
                  if (var33) {
                     var35 = new class106(arg0.method1599());
                  } else {
                     var35 = new class108(arg0.method1591());
                  }

                  this.field9335.method15311(var35, (long)var34);
               }
            }
         } else {
            arg0.method1688();
            arg0.method1587();
         }
      } else {
         this.field9315 = arg0.method1587();
         if (this.field9315 == 65535) {
            this.field9315 = -1;
         }

         this.field9316 = arg0.method1587();
         if (this.field9316 == 65535) {
            this.field9316 = -1;
         }

         int var36 = -1;
         if (arg1 == 118) {
            var36 = arg0.method1587();
            if (var36 == 65535) {
               var36 = -1;
            }
         }

         int var37 = arg0.method1688();
         this.field9319 = new int[var37 + 2];

         for(int var38 = 0; var38 <= var37; ++var38) {
            this.field9319[var38] = arg0.method1587();
            if (this.field9319[var38] == 65535) {
               this.field9319[var38] = -1;
            }
         }

         this.field9319[var37 + 1] = var36;
      }

   }

   @deob.ObfuscatedName("wi.d(I)V")
   public void method15785() {
      if (this.field9324 == null) {
         this.field9324 = new int[0];
      }

      if (this.field9340 == -1) {
         if (class801.field7297 == this.field9280.field9372) {
            this.field9340 = 1;
         } else {
            this.field9340 = 0;
         }
      }

   }

   @deob.ObfuscatedName("wi.b(Lra;ILpn;Lum;Ltk;Ltk;[Ltk;[IILwo;B)Lqa;")
   public final class745 method15773(class772 arg0, int arg1, class731 arg2, class865 arg3, class836 arg4, class836 arg5, class836[] arg6, int[] arg7, int arg8, class921 arg9) {
      return this.method15798(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field9287, true);
   }

   @deob.ObfuscatedName("wi.r(Lra;ILpn;Lum;Ltk;Ltk;[Ltk;[IILwo;IZB)Lqa;")
   public final class745 method15798(class772 arg0, int arg1, class731 arg2, class865 arg3, class836 arg4, class836 arg5, class836[] arg6, int[] arg7, int arg8, class921 arg9, int arg10, boolean arg11) {
      if (this.field9319 != null) {
         class915 var13 = this.method15778(arg3);
         return var13 == null ? null : var13.method15798(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
      } else {
         int var14 = arg1;
         if (this.field9313 != 128) {
            var14 = arg1 | 2;
         }

         if (this.field9304 != 128) {
            var14 |= 5;
         }

         boolean var15 = false;
         int var16 = arg6 != null ? arg6.length : 0;

         for(int var17 = 0; var17 < var16; ++var17) {
            if (arg6[var17] != null) {
               var14 |= arg6[var17].method14779();
               var15 = true;
            }
         }

         if (arg4 != null) {
            var14 |= arg4.method14779();
            var15 = true;
         }

         if (arg5 != null) {
            var14 |= arg5.method14779();
            var15 = true;
         }

         long var18 = (long)(this.field9281 | arg0.field7106 << 16);
         if (arg9 != null) {
            var18 |= arg9.field9378 << 24;
         }

         class737 var20 = this.field9280.field9375;
         class745 var21;
         synchronized(this.field9280.field9375) {
            var21 = (class745)this.field9280.field9375.method10909(var18);
         }

         class743 var23 = null;
         if (!arg11 && arg10 != -1) {
            var23 = arg2.method10795(arg10);
         } else if (this.field9287 != -1) {
            var23 = arg2.method10795(this.field9287);
         }

         if (var21 == null || (var21.method6980() & var14) != var14) {
            if (var21 != null) {
               var14 |= var21.method6980();
            }

            int var24 = var14;
            if (this.field9288 != null) {
               var24 = var14 | 16384;
            }

            if (this.field9291 != null) {
               var24 |= 32768;
            }

            if (this.field9343 != 0) {
               var24 |= 524288;
            }

            int[] var25 = arg9 != null && arg9.field9380 != null ? arg9.field9380 : this.field9324;
            boolean var26 = false;
            class612 var27 = this.field9280.field9376;
            synchronized(this.field9280.field9376) {
               for(int var28 = 0; var28 < var25.length; ++var28) {
                  if (var25[var28] != -1 && !this.field9280.field9376.method8773(var25[var28], 0)) {
                     var26 = true;
                  }
               }
            }

            if (var26) {
               return null;
            }

            class396[] var30 = new class396[var25.length];

            for(int var31 = 0; var31 < var25.length; ++var31) {
               if (var25[var31] != -1) {
                  class612 var32 = this.field9280.field9376;
                  synchronized(this.field9280.field9376) {
                     var30[var31] = class396.method5419(this.field9280.field9376, var25[var31], 0);
                  }

                  if (var30[var31] != null) {
                     if (var30[var31].field2934 < 13) {
                        var30[var31].method5427(2);
                     }

                     if (this.field9286 != null && this.field9286[var31] != null) {
                        var30[var31].method5425(this.field9286[var31][0], this.field9286[var31][1], this.field9286[var31][2]);
                     }
                  }
               }
            }

            if (var23 != null && var23.field6839 != null) {
               for(int var34 = 0; var34 < var23.field6839.length; ++var34) {
                  if (var34 < var30.length && var30[var34] != null) {
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     if (var23.field6839[var34] != null) {
                        var35 = var23.field6839[var34][0];
                        var36 = var23.field6839[var34][1];
                        var37 = var23.field6839[var34][2];
                        var38 = var23.field6839[var34][3] << 3;
                        var39 = var23.field6839[var34][4] << 3;
                        var40 = var23.field6839[var34][5] << 3;
                     }

                     if (var38 != 0 || var39 != 0 || var40 != 0) {
                        var30[var34].method5426(var38, var39, var40);
                     }

                     if (var35 != 0 || var36 != 0 || var37 != 0) {
                        var30[var34].method5425(var35, var36, var37);
                     }
                  }
               }
            }

            class396 var41;
            if (var30.length == 1) {
               var41 = var30[0];
            } else {
               var41 = new class396(var30, var30.length);
            }

            var21 = arg0.method7528(var41, var24, this.field9280.field9374, this.field9309 + 64, this.field9310 * 5 + 850);
            if (this.field9288 != null) {
               short[] var42;
               if (arg9 != null && arg9.field9379 != null) {
                  var42 = arg9.field9379;
               } else {
                  var42 = this.field9289;
               }

               for(int var43 = 0; var43 < this.field9288.length; ++var43) {
                  if (this.field9285 != null && var43 < this.field9285.length) {
                     var21.method7023(this.field9288[var43], field9279[this.field9285[var43] & 255]);
                  } else {
                     var21.method7023(this.field9288[var43], var42[var43]);
                  }
               }
            }

            if (this.field9291 != null) {
               short[] var44;
               if (arg9 != null && arg9.field9381 != null) {
                  var44 = arg9.field9381;
               } else {
                  var44 = this.field9292;
               }

               for(int var45 = 0; var45 < this.field9291.length; ++var45) {
                  var21.method6952(this.field9291[var45], var44[var45]);
               }
            }

            if (this.field9343 != 0) {
               var21.method6953(this.field9296, this.field9305, this.field9297, this.field9343 & 255);
            }

            var21.method6916(var14);
            class737 var46 = this.field9280.field9375;
            synchronized(this.field9280.field9375) {
               this.field9280.field9375.method10880(var21, var18);
            }
         }

         class745 var48 = var21.method6914((byte)4, var14, true);
         boolean var49 = false;
         if (arg7 != null) {
            for(int var50 = 0; var50 < 12; ++var50) {
               if (arg7[var50] != -1) {
                  var49 = true;
               }
            }
         }

         if (!var15 && !var49) {
            return var48;
         } else {
            class583[] var51 = null;
            if (var23 != null) {
               var51 = var23.method10977();
            }

            if (var49 && var51 != null) {
               for(int var52 = 0; var52 < 12; ++var52) {
                  if (var51[var52] != null) {
                     var48.method6983(var51[var52], 1 << var52, true);
                  }
               }
            }

            int var53 = 0;
            int var54 = 1;

            while(var53 < var16) {
               if (arg6[var53] != null) {
                  arg6[var53].method14734(var48, 0, var54);
               }

               ++var53;
               var54 <<= 1;
            }

            if (var49) {
               for(int var55 = 0; var55 < 12; ++var55) {
                  if (arg7[var55] != -1) {
                     int var56 = arg7[var55] - arg8;
                     int var57 = var56 & 16383;
                     class583 var58 = new class583();
                     var58.method8128(0.0F, 1.0F, 0.0F, class603.method8577(var57));
                     var48.method6983(var58, 1 << var55, false);
                  }
               }
            }

            if (var49 && var51 != null) {
               for(int var59 = 0; var59 < 12; ++var59) {
                  if (var51[var59] != null) {
                     var48.method6983(var51[var59], 1 << var59, false);
                  }
               }
            }

            if (arg4 != null && arg5 != null) {
               class836.method9843(var48, arg4, arg5);
            } else if (arg4 != null) {
               arg4.method14704(var48, 0);
            } else if (arg5 != null) {
               arg5.method14704(var48, 0);
            }

            if (this.field9304 != 128 || this.field9313 != 128) {
               var48.method6924(this.field9304, this.field9313, this.field9304);
            }

            var48.method6916(arg1);
            return var48;
         }
      }
   }

   @deob.ObfuscatedName("wi.p(Lra;ILum;Ltk;Lwo;I)Lqa;")
   public final class745 method15775(class772 arg0, int arg1, class865 arg2, class836 arg3, class921 arg4) {
      if (this.field9319 != null) {
         class915 var6 = this.method15778(arg2);
         return var6 == null ? null : var6.method15775(arg0, arg1, arg2, arg3, arg4);
      } else if (this.field9298 == null && (arg4 == null || arg4.field9380 == null)) {
         return null;
      } else {
         int var7 = arg1;
         if (arg3 != null) {
            var7 = arg1 | arg3.method14779();
         }

         long var8 = (long)(this.field9281 | arg0.field7106 << 16);
         if (arg4 != null) {
            var8 |= arg4.field9378 << 24;
         }

         class737 var10 = this.field9280.field9368;
         class745 var11;
         synchronized(this.field9280.field9368) {
            var11 = (class745)this.field9280.field9368.method10909(var8);
         }

         if (var11 == null || (var11.method6980() & var7) != var7) {
            if (var11 != null) {
               var7 |= var11.method6980();
            }

            int var13 = var7;
            if (this.field9288 != null) {
               var13 = var7 | 16384;
            }

            if (this.field9291 != null) {
               var13 |= 32768;
            }

            if (this.field9343 != 0) {
               var13 |= 524288;
            }

            int[] var14 = arg4 != null && arg4.field9380 != null ? arg4.field9380 : this.field9298;
            boolean var15 = false;
            class612 var16 = this.field9280.field9376;
            synchronized(this.field9280.field9376) {
               int var17 = 0;

               while(true) {
                  if (var17 >= var14.length) {
                     break;
                  }

                  if (!this.field9280.field9376.method8773(var14[var17], 0)) {
                     var15 = true;
                  }

                  ++var17;
               }
            }

            if (var15) {
               return null;
            }

            class396[] var19 = new class396[var14.length];
            class612 var20 = this.field9280.field9376;
            synchronized(this.field9280.field9376) {
               for(int var21 = 0; var21 < var14.length; ++var21) {
                  var19[var21] = class396.method5419(this.field9280.field9376, var14[var21], 0);
               }
            }

            for(int var23 = 0; var23 < var14.length; ++var23) {
               if (var19[var23] != null && var19[var23].field2934 < 13) {
                  var19[var23].method5427(2);
               }
            }

            class396 var24;
            if (var19.length == 1) {
               var24 = var19[0];
            } else {
               var24 = new class396(var19, var19.length);
            }

            var11 = arg0.method7528(var24, var13, this.field9280.field9374, 64, 768);
            if (this.field9288 != null) {
               short[] var25;
               if (arg4 != null && arg4.field9379 != null) {
                  var25 = arg4.field9379;
               } else {
                  var25 = this.field9289;
               }

               for(int var26 = 0; var26 < this.field9288.length; ++var26) {
                  if (this.field9285 != null && var26 < this.field9285.length) {
                     var11.method7023(this.field9288[var26], field9279[this.field9285[var26] & 255]);
                  } else {
                     var11.method7023(this.field9288[var26], var25[var26]);
                  }
               }
            }

            if (this.field9291 != null) {
               short[] var27;
               if (arg4 != null && arg4.field9381 != null) {
                  var27 = arg4.field9381;
               } else {
                  var27 = this.field9292;
               }

               for(int var28 = 0; var28 < this.field9291.length; ++var28) {
                  var11.method6952(this.field9291[var28], var27[var28]);
               }
            }

            if (this.field9343 != 0) {
               var11.method6953(this.field9296, this.field9305, this.field9297, this.field9343 & 255);
            }

            var11.method6916(var7);
            class737 var29 = this.field9280.field9368;
            synchronized(this.field9280.field9368) {
               this.field9280.field9368.method10880(var11, var8);
            }
         }

         if (arg3 != null) {
            var11 = var11.method6914((byte)1, var7, true);
            arg3.method14704(var11, 0);
         }

         var11.method6916(arg1);
         return var11;
      }
   }

   @deob.ObfuscatedName("wi.o(I)Z")
   public final boolean method15812() {
      if (this.field9324 == null) {
         return true;
      } else {
         boolean var1 = true;
         int[] var2 = this.field9324;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            if (!this.field9280.field9376.method8773(var4, 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @deob.ObfuscatedName("wi.a(IIB)I")
   public int method15776(int arg0, int arg1) {
      if (this.field9335 == null) {
         return arg1;
      } else {
         class108 var3 = (class108)this.field9335.method15322((long)arg0);
         return var3 == null ? arg1 : var3.field811;
      }
   }

   @deob.ObfuscatedName("wi.x(ILjava/lang/String;B)Ljava/lang/String;")
   public String method15777(int arg0, String arg1) {
      if (this.field9335 == null) {
         return arg1;
      } else {
         class106 var3 = (class106)this.field9335.method15322((long)arg0);
         return var3 == null ? arg1 : (String)var3.field807;
      }
   }

   @deob.ObfuscatedName("wi.s(Lum;B)Lwi;")
   public final class915 method15778(class865 arg0) {
      int var2 = -1;
      if (this.field9315 != -1) {
         var2 = arg0.method5490(this.field9315);
      } else if (this.field9316 != -1) {
         var2 = arg0.method5491(this.field9316);
      }

      if (var2 >= 0 && var2 < this.field9319.length - 1) {
         return this.field9319[var2] == -1 ? null : this.field9280.method15857(this.field9319[var2]);
      } else {
         int var3 = this.field9319[this.field9319.length - 1];
         return var3 != -1 ? this.field9280.method15857(var3) : null;
      }
   }

   @deob.ObfuscatedName("wi.l(Lum;B)Z")
   public boolean method15779(class865 arg0) {
      if (this.field9319 == null) {
         return true;
      } else {
         int var2 = -1;
         if (this.field9315 != -1) {
            var2 = arg0.method5490(this.field9315);
         } else if (this.field9316 != -1) {
            var2 = arg0.method5491(this.field9316);
         }

         if (var2 >= 0 && var2 < this.field9319.length - 1) {
            return this.field9319[var2] != -1;
         } else {
            int var3 = this.field9319[this.field9319.length - 1];
            return var3 != -1;
         }
      }
   }

   @deob.ObfuscatedName("wi.u(I)Z")
   public boolean method15780() {
      if (this.field9319 == null) {
         return this.field9327 != -1 || this.field9329 != -1 || this.field9337 != -1;
      } else {
         for(int var1 = 0; var1 < this.field9319.length; ++var1) {
            if (this.field9319[var1] != -1) {
               class915 var2 = this.field9280.method15857(this.field9319[var1]);
               if (var2.field9327 != -1 || var2.field9329 != -1 || var2.field9337 != -1) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @deob.ObfuscatedName("wi.v(II)I")
   public int method15799(int arg0) {
      return this.field9333 == null ? -1 : this.field9333[arg0];
   }
}
