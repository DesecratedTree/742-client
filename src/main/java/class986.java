@deob.ObfuscatedName("yz")
public abstract class class986 extends class383 {
   @deob.ObfuscatedName("yz.av")
   protected static int field10478 = 0;
   @deob.ObfuscatedName("yz.ax")
   protected static int field10475 = 0;
   @deob.ObfuscatedName("yz.af")
   protected static int field10480 = 0;
   @deob.ObfuscatedName("yz.at")
   protected static int field10481 = 0;
   @deob.ObfuscatedName("yz.ah")
   protected static int field10482 = 0;
   @deob.ObfuscatedName("yz.aw")
   private static int field10483 = 0;
   @deob.ObfuscatedName("yz.al")
   private static int field10471 = 0;
   @deob.ObfuscatedName("yz.an")
   protected static int field10485 = 0;
   @deob.ObfuscatedName("yz.n")
   protected class984 field10459;
   @deob.ObfuscatedName("yz.k")
   protected int field10465;
   @deob.ObfuscatedName("yz.d")
   protected int field10452;
   @deob.ObfuscatedName("yz.b")
   protected int field10453;
   @deob.ObfuscatedName("yz.r")
   protected int field10461;
   @deob.ObfuscatedName("yz.p")
   protected int field10469;
   @deob.ObfuscatedName("yz.o")
   protected int field10474;
   @deob.ObfuscatedName("yz.a")
   private int[] field10457;

   public class986(class984 arg0, int arg1, int arg2) {
      this.field10459 = arg0;
      this.field10465 = arg1;
      this.field10452 = arg2;
   }

   @deob.ObfuscatedName("yz.l(IIII)V")
   public void method5214(int arg0, int arg1, int arg2, int arg3) {
      this.field10453 = arg0;
      this.field10461 = arg1;
      this.field10469 = arg2;
      this.field10474 = arg3;
   }

   @deob.ObfuscatedName("yz.u([I)V")
   public void method5215(int[] arg0) {
      arg0[0] = this.field10453;
      arg0[1] = this.field10461;
      arg0[2] = this.field10469;
      arg0[3] = this.field10474;
   }

   @deob.ObfuscatedName("yz.v()I")
   public int method5216() {
      return this.field10465;
   }

   @deob.ObfuscatedName("yz.h()I")
   public int method5218() {
      return this.field10452;
   }

   @deob.ObfuscatedName("yz.g()I")
   public int method5259() {
      return this.field10465 + this.field10453 + this.field10469;
   }

   @deob.ObfuscatedName("yz.m()I")
   public int method5213() {
      return this.field10461 + this.field10452 + this.field10474;
   }

   @deob.ObfuscatedName("yz.af(IIIIIII)V")
   public void method5219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field10459.method16820()) {
         throw new IllegalStateException();
      } else {
         if (this.field10457 == null) {
            this.field10457 = new int[4];
         }

         this.field10459.method7511(this.field10457);
         this.field10459.method7510(this.field10459.field10405, this.field10459.field10415, arg0 + arg2, arg1 + arg3);
         int var8 = this.method5259();
         int var9 = this.method5213();
         int var10 = (arg2 + var8 - 1) / var8;
         int var11 = (arg3 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var9 * var12;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method2388(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
         }

         this.field10459.method7716(this.field10457[0], this.field10457[1], this.field10457[2], this.field10457[3]);
      }
   }

   @deob.ObfuscatedName("yz.k(FFFFFF)Z")
   private boolean method16879(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      int var7 = this.field10465 + this.field10453 + this.field10469;
      int var8 = this.field10461 + this.field10452 + this.field10474;
      if (this.field10465 != var7 || this.field10452 != var8) {
         float var9 = (arg2 - arg0) / (float)var7;
         float var10 = (arg3 - arg1) / (float)var7;
         float var11 = (arg4 - arg0) / (float)var8;
         float var12 = (arg5 - arg1) / (float)var8;
         float var13 = (float)this.field10461 * var11;
         float var14 = (float)this.field10461 * var12;
         float var15 = (float)this.field10453 * var9;
         float var16 = (float)this.field10453 * var10;
         float var17 = (float)this.field10469 * -var9;
         float var18 = (float)this.field10469 * -var10;
         float var19 = (float)this.field10474 * -var11;
         float var20 = (float)this.field10474 * -var12;
         arg0 += var13 + var15;
         arg1 += var14 + var16;
         arg2 += var13 + var17;
         arg3 += var14 + var18;
         arg4 += var15 + var19;
         arg5 += var16 + var20;
      }

      float var21 = arg2 - arg0 + arg4;
      float var22 = arg5 - arg1 + arg3;
      float var23;
      float var24;
      if (arg0 < arg2) {
         var23 = arg0;
         var24 = arg2;
      } else {
         var23 = arg2;
         var24 = arg0;
      }

      if (arg4 < var23) {
         var23 = arg4;
      }

      if (var21 < var23) {
         var23 = var21;
      }

      if (arg4 > var24) {
         var24 = arg4;
      }

      if (var21 > var24) {
         var24 = var21;
      }

      float var25;
      float var26;
      if (arg1 < arg3) {
         var25 = arg1;
         var26 = arg3;
      } else {
         var25 = arg3;
         var26 = arg1;
      }

      if (arg5 < var25) {
         var25 = arg5;
      }

      if (var22 < var25) {
         var25 = var22;
      }

      if (arg5 > var26) {
         var26 = arg5;
      }

      if (var22 > var26) {
         var26 = var22;
      }

      if (var23 < (float)this.field10459.field10405) {
         var23 = (float)this.field10459.field10405;
      }

      if (var24 > (float)this.field10459.field10411) {
         var24 = (float)this.field10459.field10411;
      }

      if (var25 < (float)this.field10459.field10415) {
         var25 = (float)this.field10459.field10415;
      }

      if (var26 > (float)this.field10459.field10413) {
         var26 = (float)this.field10459.field10413;
      }

      float var27 = var23 - var24;
      if (var27 >= 0.0F) {
         return false;
      } else {
         float var28 = var25 - var26;
         if (var28 >= 0.0F) {
            return false;
         } else {
            Statics.field10456 = this.field10459.field10407;
            Statics.field10466 = (int)((float)((int)var25 * Statics.field10456) + var23);
            float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
            float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
            Statics.field10467 = (int)((arg5 - arg1) * 4096.0F * (float)this.field10465 / var29);
            Statics.field10468 = (int)((arg3 - arg1) * 4096.0F * (float)this.field10452 / var30);
            Statics.field10451 = (int)((arg4 - arg0) * 4096.0F * (float)this.field10465 / var30);
            Statics.field10470 = (int)((arg2 - arg0) * 4096.0F * (float)this.field10452 / var29);
            Statics.field10476 = (int)(var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
            Statics.field10472 = (int)(var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
            Statics.field10473 = (this.field10465 >> 1 << 12) + (Statics.field10472 * Statics.field10451 >> 4);
            Statics.field10479 = (this.field10452 >> 1 << 12) + (Statics.field10472 * Statics.field10470 >> 4);
            Statics.field10484 = Statics.field10476 * Statics.field10467 >> 4;
            Statics.field10455 = Statics.field10476 * Statics.field10468 >> 4;
            Statics.field10450 = (int)var23;
            Statics.field10462 = (int)var27;
            Statics.field10463 = (int)var25;
            Statics.field10464 = (int)var28;
            return true;
         }
      }
   }

   @deob.ObfuscatedName("yz.ak(FFFFFFIIII)V")
   protected void method5231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field10459.method16820()) {
         throw new IllegalStateException();
      } else if (this.method16879(arg0, arg1, arg2, arg3, arg4, arg5)) {
         Statics.field10477 = arg7;
         if (arg6 != 1) {
            field10478 = arg7 >>> 24;
            field10475 = 256 - field10478;
            if (arg6 == 0) {
               field10480 = (arg7 & 16711680) >> 16;
               field10481 = (arg7 & 65280) >> 8;
               field10482 = arg7 & 255;
            } else if (arg6 == 2) {
               field10483 = arg7 >>> 24;
               field10471 = 256 - field10483;
               int var11 = (arg7 & 16711935) * field10471 & -16711936;
               int var12 = (arg7 & 65280) * field10471 & 16711680;
               field10485 = (var11 | var12) >>> 8;
            }
         }

         this.method2396(arg6, arg8);
      }
   }

   @deob.ObfuscatedName("yz.ab(FFFFFFILta;II)V")
   public void method5232(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class826 arg7, int arg8, int arg9) {
      if (this.field10459.method16820()) {
         throw new IllegalStateException();
      } else if (this.method16879(arg0, arg1, arg2, arg3, arg4, arg5)) {
         class962 var11 = (class962)arg7;
         this.method2397(var11.field9621, var11.field9622, Statics.field10450 - arg8, -arg9 - (Statics.field10464 - Statics.field10463));
      }
   }

   @deob.ObfuscatedName("yz.av(IIIIIIII)V")
   protected abstract void method2394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @deob.ObfuscatedName("yz.n(ZZZIIFIIIIIIZ)V")
   public abstract void method2409(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

   @deob.ObfuscatedName("yz.d(II)V")
   protected abstract void method2396(int arg0, int arg1);

   @deob.ObfuscatedName("yz.b([I[III)V")
   protected abstract void method2397(int[] arg0, int[] arg1, int arg2, int arg3);

   @deob.ObfuscatedName("yz.q(IIIII)V")
   public abstract void method2388(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("yz.f(IILta;II)V")
   public abstract void method2393(int arg0, int arg1, class826 arg2, int arg3, int arg4);
}
