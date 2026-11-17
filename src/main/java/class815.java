@deob.ObfuscatedName("sq")
public class class815 {
   @deob.ObfuscatedName("sq.b")
   public int field8406 = -1;
   @deob.ObfuscatedName("sq.l")
   private int field8412 = 128;
   @deob.ObfuscatedName("sq.u")
   private int field8414 = 128;
   @deob.ObfuscatedName("sq.v")
   private int field8403 = 0;
   @deob.ObfuscatedName("sq.g")
   private int field8416 = 0;
   @deob.ObfuscatedName("sq.h")
   private int field8417 = 0;
   @deob.ObfuscatedName("sq.e")
   public boolean field8418 = false;
   @deob.ObfuscatedName("sq.z")
   public byte field8419 = 0;
   @deob.ObfuscatedName("sq.m")
   private int field8420 = -1;
   @deob.ObfuscatedName("sq.k")
   public int field8404;
   @deob.ObfuscatedName("sq.d")
   private int field8405;
   @deob.ObfuscatedName("sq.n")
   public class796 field8415;
   @deob.ObfuscatedName("sq.x")
   private byte[] field8411;
   @deob.ObfuscatedName("sq.s")
   private byte[] field8413;
   @deob.ObfuscatedName("sq.p")
   private short[] field8407;
   @deob.ObfuscatedName("sq.o")
   private short[] field8408;
   @deob.ObfuscatedName("sq.r")
   private short[] field8409;
   @deob.ObfuscatedName("sq.a")
   private short[] field8410;

   @deob.ObfuscatedName("sq.n(Laen;I)V")
   public void method14385(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method14386(arg0, var2);
      }
   }

   @deob.ObfuscatedName("sq.k(Laen;II)V")
   private void method14386(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field8405 = arg0.method1608();
      } else if (arg1 == 2) {
         this.field8406 = arg0.method1608();
      } else if (arg1 == 4) {
         this.field8412 = arg0.method1587();
      } else if (arg1 == 5) {
         this.field8414 = arg0.method1587();
      } else if (arg1 == 6) {
         this.field8403 = arg0.method1587();
      } else if (arg1 == 7) {
         this.field8416 = arg0.method1688();
      } else if (arg1 == 8) {
         this.field8417 = arg0.method1688();
      } else if (arg1 == 9) {
         this.field8419 = 3;
         this.field8420 = 8224;
      } else if (arg1 == 10) {
         this.field8418 = true;
      } else if (arg1 == 11) {
         this.field8419 = 1;
      } else if (arg1 == 12) {
         this.field8419 = 4;
      } else if (arg1 == 13) {
         this.field8419 = 5;
      } else if (arg1 == 14) {
         this.field8419 = 2;
         this.field8420 = arg0.method1688() * 256;
      } else if (arg1 == 15) {
         this.field8419 = 3;
         this.field8420 = arg0.method1587();
      } else if (arg1 == 16) {
         this.field8419 = 3;
         this.field8420 = arg0.method1591();
      } else if (arg1 == 40) {
         int var3 = arg0.method1688();
         this.field8409 = new short[var3];
         this.field8407 = new short[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field8409[var4] = (short)arg0.method1587();
            this.field8407[var4] = (short)arg0.method1587();
         }
      } else if (arg1 == 41) {
         int var5 = arg0.method1688();
         this.field8408 = new short[var5];
         this.field8410 = new short[var5];

         for(int var6 = 0; var6 < var5; ++var6) {
            this.field8408[var6] = (short)arg0.method1587();
            this.field8410[var6] = (short)arg0.method1587();
         }
      } else if (arg1 == 44) {
         int var7 = arg0.method1587();
         int var8 = 0;

         for(int var9 = var7; var9 > 0; var9 >>= 1) {
            ++var8;
         }

         this.field8411 = new byte[var8];
         byte var10 = 0;

         for(int var11 = 0; var11 < var8; ++var11) {
            if ((var7 & 1 << var11) > 0) {
               this.field8411[var11] = var10++;
            } else {
               this.field8411[var11] = -1;
            }
         }
      } else if (arg1 == 45) {
         int var12 = arg0.method1587();
         int var13 = 0;

         for(int var14 = var12; var14 > 0; var14 >>= 1) {
            ++var13;
         }

         this.field8413 = new byte[var13];
         byte var15 = 0;

         for(int var16 = 0; var16 < var13; ++var16) {
            if ((var12 & 1 << var16) > 0) {
               this.field8413[var16] = var15++;
            } else {
               this.field8413[var16] = -1;
            }
         }
      }

   }

   @deob.ObfuscatedName("sq.d(Lra;ILtk;BS)Lqa;")
   public final class745 method14388(class772 arg0, int arg1, class836 arg2, byte arg3) {
      return this.method14387(arg0, arg1, false, (class934)null, (class934)null, 0, 0, 0, arg2, arg3);
   }

   @deob.ObfuscatedName("sq.b(Lra;IZLxa;Lxa;IIILtk;BI)Lqa;")
   public final class745 method14387(class772 arg0, int arg1, boolean arg2, class934 arg3, class934 arg4, int arg5, int arg6, int arg7, class836 arg8, byte arg9) {
      int var11 = arg1;
      boolean var12 = arg2 & this.field8419 != 0;
      if (arg8 != null) {
         var11 = arg1 | arg8.method14779();
      }

      if (var12) {
         var11 |= this.field8419 == 3 ? 7 : 2;
      }

      if (this.field8414 != 128) {
         var11 |= 2;
      }

      if (this.field8412 != 128 || this.field8403 != 0) {
         var11 |= 5;
      }

      class737 var13 = this.field8415.field7268;
      class745 var14;
      synchronized(this.field8415.field7268) {
         var14 = (class745)this.field8415.field7268.method10909((long)(this.field8404 |= arg0.field7106 << 29));
      }

      if (var14 == null || arg0.method7534(var14.method6980(), var11) != 0) {
         if (var14 != null) {
            var11 = arg0.method7535(var11, var14.method6980());
         }

         int var16 = var11;
         if (this.field8409 != null) {
            var16 = var11 | 16384;
         }

         if (this.field8408 != null) {
            var16 |= 32768;
         }

         class396 var17 = class396.method5419(this.field8415.field7266, this.field8405, 0);
         if (var17 == null) {
            return null;
         }

         if (var17.field2934 < 13) {
            var17.method5427(2);
         }

         var14 = arg0.method7528(var17, var16, this.field8415.field7269, this.field8416 + 64, this.field8417 + 850);
         if (this.field8409 != null) {
            for(int var18 = 0; var18 < this.field8409.length; ++var18) {
               var14.method7023(this.field8409[var18], this.field8407[var18]);
            }
         }

         if (this.field8408 != null) {
            for(int var19 = 0; var19 < this.field8408.length; ++var19) {
               var14.method6952(this.field8408[var19], this.field8410[var19]);
            }
         }

         var14.method6916(var11);
         class737 var20 = this.field8415.field7268;
         synchronized(this.field8415.field7268) {
            this.field8415.field7268.method10880(var14, (long)(this.field8404 |= arg0.field7106 << 29));
         }
      }

      class745 var22 = var14.method6914(arg9, var11, true);
      if (arg8 != null) {
         arg8.method14704(var22, 0);
      }

      if (this.field8412 != 128 || this.field8414 != 128) {
         var22.method6924(this.field8412, this.field8414, this.field8412);
      }

      if (this.field8403 != 0) {
         if (this.field8403 == 90) {
            var22.method7008(4096);
         }

         if (this.field8403 == 180) {
            var22.method7008(8192);
         }

         if (this.field8403 == 270) {
            var22.method7008(12288);
         }
      }

      if (var12) {
         var22.method6925(this.field8419, this.field8420, arg3, arg4, arg5, arg6, arg7);
      }

      var22.method6916(arg1);
      return var22;
   }

   @deob.ObfuscatedName("sq.r(I)Z")
   public final boolean method14384() {
      return this.field8405 == -1 ? true : this.field8415.field7266.method8773(this.field8405, 0);
   }
}
