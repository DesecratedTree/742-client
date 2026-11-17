@deob.ObfuscatedName("ch")
public class class366 {
   @deob.ObfuscatedName("ch.a")
   private boolean field2358 = false;
   @deob.ObfuscatedName("ch.u")
   private int field2369 = -1;
   @deob.ObfuscatedName("ch.v")
   private int field2363 = 0;
   @deob.ObfuscatedName("ch.g")
   private boolean field2351 = false;
   @deob.ObfuscatedName("ch.z")
   private boolean field2355 = false;
   @deob.ObfuscatedName("ch.n")
   private class831 field2368;
   @deob.ObfuscatedName("ch.r")
   public int field2362;
   @deob.ObfuscatedName("ch.p")
   public int field2359;
   @deob.ObfuscatedName("ch.o")
   public int field2357;
   @deob.ObfuscatedName("ch.b")
   private class134 field2354;
   @deob.ObfuscatedName("ch.k")
   private byte field2352;
   @deob.ObfuscatedName("ch.d")
   private byte field2356;
   @deob.ObfuscatedName("ch.h")
   private boolean field2365;
   @deob.ObfuscatedName("ch.s")
   private class836 field2360;
   @deob.ObfuscatedName("ch.l")
   private int field2361;
   @deob.ObfuscatedName("ch.e")
   private class664 field2366;
   @deob.ObfuscatedName("ch.x")
   private class745 field2367;
   @deob.ObfuscatedName("ch.i")
   public class756 field2364;
   @deob.ObfuscatedName("ch.t")
   private class832 field2370;
   @deob.ObfuscatedName("ch.m")
   private boolean[] field2353;

   public class366(class772 arg0, class831 arg1, class843 arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, boolean arg8, int arg9) {
      this.field2368 = arg1;
      this.field2362 = arg2.field8577;
      this.field2359 = arg3;
      this.field2357 = arg4;
      this.field2354 = arg7;
      this.field2351 = arg9 != -1;
      this.field2352 = (byte)arg5;
      this.field2356 = (byte)arg6;
      this.field2358 = arg8;
      this.field2365 = arg0.method7494() && arg2.field8637 && !this.field2358;
      this.field2360 = new class184(arg7, false);
      this.method4493(false, arg9, 1);
   }

   @deob.ObfuscatedName("ch.n(II)V")
   public void method4485(int arg0) {
      this.field2351 = true;
      this.method4493(false, arg0, 1);
   }

   @deob.ObfuscatedName("ch.k(B)I")
   public int method4511() {
      return this.field2363;
   }

   @deob.ObfuscatedName("ch.d(Ltg;I)V")
   public void method4504(class832 arg0) {
      this.field2370 = arg0;
      this.field2367 = null;
   }

   @deob.ObfuscatedName("ch.b(I)I")
   public int method4486() {
      return -this.method4511();
   }

   @deob.ObfuscatedName("ch.r(Lra;IZZB)Lqa;")
   public final class745 method4501(class772 arg0, int arg1, boolean arg2, boolean arg3) {
      class843 var5 = this.field2368.method14651(this.field2362);
      if (var5.field8609 != null) {
         var5 = var5.method14853(client.field2476 == 0 ? class397.field2956 : Statics.field10637);
      }

      if (var5 == null) {
         this.method4506(arg0);
         this.field2369 = -1;
         return null;
      } else {
         if (!this.field2351 && this.field2369 != var5.field8577) {
            this.method4493(true, -1, 0);
            this.field2355 = false;
            this.field2367 = null;
         }

         this.method4487(this.field2354);
         if (arg3) {
            arg3 &= this.field2365 & !this.field2355 & Statics.field9361.field964.method2210() != 0;
         }

         if (arg2 && !arg3) {
            this.field2369 = var5.field8577;
            return null;
         } else {
            class584 var6 = this.field2354.method11602().field5446;
            class713 var7 = client.field2468.method9639();
            if (arg3) {
               var7.method10528(this.field2366, this.field2356, (int)var6.field5328, (int)var6.field5331, this.field2353);
               this.field2355 = false;
            }

            class934 var8 = var7.field6580[this.field2356];
            class934 var9;
            if (this.field2358) {
               var9 = var7.field6582[0];
            } else {
               var9 = this.field2356 < 3 ? var7.field6580[this.field2356 + 1] : null;
            }

            class745 var10 = null;
            if (this.field2360.method14691()) {
               if (arg3) {
                  arg1 |= 262144;
               }

               var10 = var5.method14852(arg0, arg1, this.field2359 != 11 ? this.field2359 : 10, this.field2359 == 11 ? this.field2357 + 4 : this.field2357, var8, var9, (int)var6.field5328, var8.method15965((int)var6.field5328, (int)var6.field5331), (int)var6.field5331, this.field2360, this.field2370);
               if (var10 != null) {
                  if (arg3) {
                     if (this.field2353 == null) {
                        this.field2353 = new boolean[4];
                     }

                     this.field2366 = var10.method7072(this.field2366);
                     var7.method10527(this.field2366, this.field2356, (int)var6.field5328, (int)var6.field5331, this.field2353);
                     this.field2355 = true;
                  }

                  this.field2363 = var10.method6941();
                  var10.method6938();
               } else {
                  this.field2353 = null;
                  this.field2366 = null;
                  this.field2363 = 0;
               }

               this.field2367 = null;
            } else if (this.field2367 != null && (this.field2367.method6980() & arg1) == arg1 && this.field2369 == var5.field8577) {
               var10 = this.field2367;
            } else {
               if (this.field2367 != null) {
                  arg1 |= this.field2367.method6980();
               }

               class862 var11 = var5.method14850(arg0, arg1, this.field2359 != 11 ? this.field2359 : 10, this.field2359 == 11 ? this.field2357 + 4 : this.field2357, var8, var9, (int)var6.field5328, var8.method15965((int)var6.field5328, (int)var6.field5331), (int)var6.field5331, arg3, this.field2370);
               if (var11 != null) {
                  this.field2367 = var10 = (class745)var11.field8800;
                  if (arg3) {
                     this.field2366 = (class664)var11.field8801;
                     this.field2353 = null;
                     var7.method10527(this.field2366, this.field2356, (int)var6.field5328, (int)var6.field5331, (boolean[])null);
                     this.field2355 = true;
                  }

                  this.field2363 = var10.method6941();
                  var10.method6938();
               } else {
                  this.field2353 = null;
                  this.field2366 = null;
                  this.field2367 = null;
                  this.field2363 = 0;
               }
            }

            this.field2369 = var5.field8577;
            return var10;
         }
      }
   }

   @deob.ObfuscatedName("ch.p(Lra;Lqa;Lka;IIIIZI)V")
   public void method4488(class772 arg0, class745 arg1, class583 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      class408[] var9 = arg1.method6957();
      class370[] var10 = arg1.method6958();
      if ((this.field2364 == null || this.field2364.field6971) && (var9 != null || var10 != null)) {
         class843 var11 = this.field2368.method14651(this.field2362);
         if (var11.field8609 != null) {
            var11 = var11.method14853(client.field2476 == 0 ? class397.field2956 : Statics.field10637);
         }

         if (var11 != null) {
            this.field2364 = class756.method11243(client.field2418, true);
         }
      }

      if (this.field2364 != null) {
         arg1.method7024(arg2);
         if (arg7) {
            this.field2364.method11235(arg0, (long)client.field2418, var9, var10, false);
         } else {
            this.field2364.method11217((long)client.field2418);
         }

         this.field2364.method11221(this.field2352, arg3, arg4, arg5, arg6);
      }

   }

   @deob.ObfuscatedName("ch.o(I)Z")
   public boolean method4489() {
      return this.field2365;
   }

   @deob.ObfuscatedName("ch.a(Lra;I)V")
   public void method4490(class772 arg0) {
      this.method4501(arg0, 262144, true, true);
   }

   @deob.ObfuscatedName("ch.x(Lra;S)V")
   public void method4506(class772 arg0) {
      if (this.field2366 != null) {
         class584 var2 = this.field2354.method11602().field5446;
         client.field2468.method9639().method10528(this.field2366, this.field2356, (int)var2.field5328, (int)var2.field5331, this.field2353);
         this.field2353 = null;
         this.field2366 = null;
      }

   }

   @deob.ObfuscatedName("ch.s(Laex;I)V")
   private void method4487(class134 arg0) {
      if (this.field2360.method14691()) {
         if (this.field2360.method14711(client.field2418 - this.field2361)) {
            if (Statics.field9361.field964.method2210() == 2) {
               this.field2355 = false;
            }

            if (this.field2360.method14707()) {
               this.field2360.method14694(-1);
               this.field2351 = false;
               this.method4493(false, -1, 0);
            }
         }
      } else {
         this.method4493(false, -1, 0);
      }

      this.field2361 = client.field2418;
   }

   @deob.ObfuscatedName("ch.l(ZIII)V")
   private void method4493(boolean arg0, int arg1, int arg2) {
      int var4 = arg1;
      boolean var5 = false;
      if (arg1 == -1) {
         class843 var6 = this.field2368.method14651(this.field2362);
         class843 var7 = var6;
         if (var6.field8609 != null) {
            var6 = var6.method14853(client.field2476 == 0 ? class397.field2956 : Statics.field10637);
         }

         if (var6 == null) {
            return;
         }

         if (var6 == var7) {
            var7 = null;
         }

         if (var6.method14877()) {
            if (arg0 && this.field2360.method14691() && var6.method14861(this.field2360.method14716())) {
               return;
            }

            if (this.field2369 != var6.field8577) {
               var5 = var6.field8635;
            }

            var4 = var6.method14859();
            if (var6.method14858()) {
               arg2 = 0;
            } else {
               arg2 = 1;
            }
         } else if (var7 != null && var7.method14877()) {
            if (arg0 && this.field2360.method14691() && var7.method14861(this.field2360.method14716())) {
               return;
            }

            if (this.field2369 != var6.field8577) {
               var5 = var7.field8635;
            }

            var4 = var7.method14859();
            if (var7.method14858()) {
               arg2 = 0;
            } else {
               arg2 = 1;
            }
         }
      }

      if (var4 == -1) {
         this.field2360.method14696(-1, false);
      } else {
         this.field2360.method14690(var4, 0, arg2, var5);
         this.field2361 = client.field2418;
         this.field2355 = false;
         this.field2367 = null;
      }
   }
}
