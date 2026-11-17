@deob.ObfuscatedName("qb")
public class class746 {
   @deob.ObfuscatedName("qb.b")
   private int field6864 = 0;
   @deob.ObfuscatedName("qb.a")
   public boolean field6868 = false;
   @deob.ObfuscatedName("qb.x")
   public class770 field6869 = new class770();
   @deob.ObfuscatedName("qb.s")
   private class770 field6877 = new class770();
   @deob.ObfuscatedName("qb.m")
   private boolean field6878 = false;
   @deob.ObfuscatedName("qb.i")
   private boolean field6875 = false;
   @deob.ObfuscatedName("qb.n")
   public final class408 field6872;
   @deob.ObfuscatedName("qb.d")
   public final class756 field6863;
   @deob.ObfuscatedName("qb.o")
   private long field6867;
   @deob.ObfuscatedName("qb.k")
   public class539 field6862;
   @deob.ObfuscatedName("qb.r")
   public class839 field6865;
   @deob.ObfuscatedName("qb.g")
   private int field6861;
   @deob.ObfuscatedName("qb.p")
   public int field6866;
   @deob.ObfuscatedName("qb.l")
   private int field6870;
   @deob.ObfuscatedName("qb.z")
   private int field6871;
   @deob.ObfuscatedName("qb.v")
   private int field6873;
   @deob.ObfuscatedName("qb.h")
   private int field6874;
   @deob.ObfuscatedName("qb.e")
   private int field6876;
   @deob.ObfuscatedName("qb.u")
   private int field6879;

   public class746(class772 arg0, class408 arg1, class756 arg2, long arg3) {
      this.field6872 = arg1;
      this.field6863 = arg2;
      this.field6867 = arg3;
      this.field6862 = this.field6872.method5617();
      if (!arg0.method7496() && this.field6862.field4301 != -1) {
         this.field6862 = class539.method14660(this.field6862.field4301);
      }

      this.field6865 = new class839();
      this.field6864 = (int)((double)this.field6864 + Math.random() * 64.0D);
      this.method11038();
      this.field6877.field7075 = this.field6869.field7075;
      this.field6877.field7080 = this.field6869.field7080;
      this.field6877.field7070 = this.field6869.field7070;
      this.field6877.field7072 = this.field6869.field7072;
      this.field6877.field7073 = this.field6869.field7073;
      this.field6877.field7074 = this.field6869.field7074;
      this.field6877.field7079 = this.field6869.field7079;
      this.field6877.field7076 = this.field6869.field7076;
      this.field6877.field7069 = this.field6869.field7069;
   }

   @deob.ObfuscatedName("qb.n(B)V")
   public void method11038() {
      this.field6869.field7075 = this.field6872.field3074;
      this.field6869.field7080 = this.field6872.field3075;
      this.field6869.field7070 = this.field6872.field3076;
      this.field6869.field7072 = this.field6872.field3069;
      this.field6869.field7073 = this.field6872.field3077;
      this.field6869.field7074 = this.field6872.field3082;
      this.field6869.field7079 = this.field6872.field3080;
      this.field6869.field7076 = this.field6872.field3070;
      this.field6869.field7069 = this.field6872.field3078;
      if (this.field6869.field7075 == this.field6869.field7072 && this.field6869.field7079 == this.field6869.field7072 && this.field6869.field7080 == this.field6869.field7073 && this.field6869.field7076 == this.field6869.field7073 && this.field6869.field7074 == this.field6869.field7070 && this.field6869.field7074 == this.field6869.field7069) {
         this.field6878 = true;
      } else if (this.field6878) {
         this.field6878 = false;
         this.field6877.field7075 = this.field6869.field7075;
         this.field6877.field7080 = this.field6869.field7080;
         this.field6877.field7070 = this.field6869.field7070;
         this.field6877.field7072 = this.field6869.field7072;
         this.field6877.field7073 = this.field6869.field7073;
         this.field6877.field7074 = this.field6869.field7074;
         this.field6877.field7079 = this.field6869.field7079;
         this.field6877.field7076 = this.field6869.field7076;
         this.field6877.field7069 = this.field6869.field7069;
      }

   }

   @deob.ObfuscatedName("qb.k(Lra;JIZI)V")
   public void method11044(class772 arg0, long arg1, int arg2, boolean arg3) {
      if (this.field6868) {
         arg3 = false;
      } else if (class764.field7024 < this.field6862.field4299) {
         arg3 = false;
      } else if (class764.field7014 > class390.field2876[class764.field7024]) {
         arg3 = false;
      } else if (this.field6878) {
         arg3 = false;
      } else if (this.field6862.field4309 != -1) {
         int var6 = (int)(arg1 - this.field6867);
         if (!this.field6862.field4296 && var6 > this.field6862.field4309) {
            arg3 = false;
         } else {
            var6 %= this.field6862.field4309;
         }

         if (!this.field6862.field4295 && var6 < this.field6862.field4315) {
            arg3 = false;
         }

         if (this.field6862.field4295 && var6 >= this.field6862.field4315) {
            arg3 = false;
         }
      }

      this.field6866 = 0;

      for(class289 var7 = (class289)this.field6865.method14798(); var7 != null; var7 = (class289)this.field6865.method14793()) {
         var7.method3729(arg1, arg2);
         ++this.field6866;
      }

      if (arg3) {
         int var8 = (this.field6869.field7079 + this.field6869.field7075 + this.field6869.field7072) / 3;
         int var9 = (this.field6869.field7076 + this.field6869.field7080 + this.field6869.field7073) / 3;
         int var10 = (this.field6869.field7069 + this.field6869.field7074 + this.field6869.field7070) / 3;
         if (this.field6869.field7078 != var8 || this.field6869.field7071 != var9 || this.field6869.field7077 != var10 || !this.field6875) {
            this.field6869.field7078 = var8;
            this.field6869.field7071 = var9;
            this.field6869.field7077 = var10;
            int var11 = this.field6869.field7072 - this.field6869.field7075;
            int var12 = this.field6869.field7073 - this.field6869.field7080;
            int var13 = this.field6869.field7074 - this.field6869.field7070;
            int var14 = this.field6869.field7079 - this.field6869.field7075;
            int var15 = this.field6869.field7076 - this.field6869.field7080;
            int var16 = this.field6869.field7069 - this.field6869.field7070;
            this.field6870 = var12 * var16 - var13 * var15;
            this.field6879 = var13 * var14 - var11 * var16;
            this.field6873 = var11 * var15 - var12 * var14;

            while(true) {
               if (this.field6870 <= 32767 && this.field6879 <= 32767 && this.field6873 <= 32767 && this.field6870 >= -32767 && this.field6879 >= -32767 && this.field6873 >= -32767) {
                  int var17 = (int)Math.sqrt((double)(this.field6873 * this.field6873 + this.field6879 * this.field6879 + this.field6870 * this.field6870));
                  if (var17 <= 0) {
                     var17 = 1;
                  }

                  this.field6870 = this.field6870 * 32767 / var17;
                  this.field6879 = this.field6879 * 32767 / var17;
                  this.field6873 = this.field6873 * 32767 / var17;
                  if (this.field6862.field4298 > 0 || this.field6862.field4265 > 0) {
                     int var18 = (int)(Math.atan2((double)this.field6873, (double)this.field6870) * 2607.5945876176133D);
                     int var19 = (int)(Math.atan2((double)this.field6879, Math.sqrt((double)(this.field6873 * this.field6873 + this.field6870 * this.field6870))) * 2607.5945876176133D);
                     this.field6874 = this.field6862.field4298 - this.field6862.field4297;
                     this.field6861 = this.field6862.field4297 + var18 - (this.field6874 >> 1);
                     this.field6871 = this.field6862.field4265 - this.field6862.field4264;
                     this.field6876 = this.field6862.field4264 + var19 - (this.field6871 >> 1);
                  }

                  this.field6875 = true;
                  break;
               }

               this.field6870 >>= 1;
               this.field6879 >>= 1;
               this.field6873 >>= 1;
            }
         }

         this.field6864 += (int)((double)arg2 * ((double)this.field6862.field4293 + Math.random() * (double)(this.field6862.field4262 - this.field6862.field4293)));
         if (this.field6864 > 63) {
            int var20 = this.field6864 >> 6;
            this.field6864 &= 63;
            int var21 = (arg2 << 8) / var20;
            int var22 = 0;
            int var23 = 0;

            while(var23 < var20) {
               int var24;
               int var25;
               int var26;
               if (this.field6862.field4298 <= 0 && this.field6862.field4265 <= 0) {
                  var24 = this.field6870;
                  var25 = this.field6879;
                  var26 = this.field6873;
               } else {
                  int var27 = this.field6861 + (int)((double)this.field6874 * Math.random());
                  int var28 = var27 & 16383;
                  int var29 = class603.field5469[var28];
                  int var30 = class603.field5471[var28];
                  int var31 = this.field6876 + (int)((double)this.field6871 * Math.random());
                  int var32 = var31 & 8191;
                  int var33 = class603.field5469[var32];
                  int var34 = class603.field5471[var32];
                  byte var35 = 13;
                  var24 = var30 * var33 >> var35;
                  var25 = (var34 << 1) * -1;
                  var26 = var29 * var33 >> var35;
               }

               float var36 = (float)Math.random();
               float var37 = (float)Math.random();
               if (var36 + var37 > 1.0F) {
                  var36 = 1.0F - var36;
                  var37 = 1.0F - var37;
               }

               float var38 = 1.0F - (var36 + var37);
               int var39 = (int)((float)this.field6869.field7079 * var38 + (float)this.field6869.field7075 * var36 + (float)this.field6869.field7072 * var37);
               int var40 = (int)((float)this.field6869.field7076 * var38 + (float)this.field6869.field7080 * var36 + (float)this.field6869.field7073 * var37);
               int var41 = (int)((float)this.field6869.field7069 * var38 + (float)this.field6869.field7074 * var37 + (float)this.field6869.field7070 * var36);
               int var42 = this.field6862.field4291 + (int)(Math.random() * (double)(this.field6862.field4286 - this.field6862.field4291));
               int var43 = this.field6862.field4283 + (int)(Math.random() * (double)(this.field6862.field4284 - this.field6862.field4283));
               int var44 = this.field6862.field4272 + (int)(Math.random() * (double)(this.field6862.field4273 - this.field6862.field4272));
               int var47;
               if (this.field6862.field4278) {
                  double var45 = Math.random();
                  var47 = (int)((double)this.field6862.field4305 * var45 + (double)this.field6862.field4307) << 16 | (int)((double)this.field6862.field4312 * var45 + (double)this.field6862.field4310) << 8 | (int)((double)this.field6862.field4294 * var45 + (double)this.field6862.field4263) | (int)((double)this.field6862.field4316 + Math.random() * (double)this.field6862.field4288) << 24;
               } else {
                  var47 = (int)((double)this.field6862.field4307 + Math.random() * (double)this.field6862.field4305) << 16 | (int)((double)this.field6862.field4310 + Math.random() * (double)this.field6862.field4312) << 8 | (int)((double)this.field6862.field4263 + Math.random() * (double)this.field6862.field4294) | (int)((double)this.field6862.field4316 + Math.random() * (double)this.field6862.field4288) << 24;
               }

               int var48 = this.field6862.field4258;
               if (!arg0.method7496() && !this.field6862.field4282) {
                  var48 = -1;
               }

               class289 var49;
               if (class764.field7016 != class764.field7015) {
                  var49 = Statics.field7013[class764.field7015];
                  class764.field7015 = class764.field7015 + 1 & 1023;
                  var49.method3727(this, var39, var40, var41, var24, var25, var26, var42, var43, var47, var44, var48, this.field6862.field4270, this.field6862.field4303);
               } else {
                  var49 = new class289(this, var39, var40, var41, var24, var25, var26, var42, var43, var47, var44, var48, this.field6862.field4270, this.field6862.field4303);
               }

               if (var22 > 256) {
                  var49.method3729(arg1, var22 >> 8);
               }

               ++this.field6866;
               ++var23;
               var22 += var21;
            }
         }
      }

      if (!this.field6869.method11461(this.field6877)) {
         class770 var50 = this.field6877;
         this.field6877 = this.field6869;
         this.field6869 = var50;
         this.field6869.field7075 = this.field6872.field3074;
         this.field6869.field7080 = this.field6872.field3075;
         this.field6869.field7070 = this.field6872.field3076;
         this.field6869.field7072 = this.field6872.field3069;
         this.field6869.field7073 = this.field6872.field3077;
         this.field6869.field7074 = this.field6872.field3082;
         this.field6869.field7079 = this.field6872.field3080;
         this.field6869.field7076 = this.field6872.field3070;
         this.field6869.field7069 = this.field6872.field3078;
         this.field6869.field7078 = this.field6877.field7078;
         this.field6869.field7071 = this.field6877.field7071;
         this.field6869.field7077 = this.field6877.field7077;
      }

      class764.field7021 += this.field6866;
   }

   @deob.ObfuscatedName("qb.d(Low;Lra;J)V")
   public void method11040(class713 arg0, class772 arg1, long arg2) {
      for(class289 var5 = (class289)this.field6865.method14798(); var5 != null; var5 = (class289)this.field6865.method14793()) {
         var5.method3730(arg0, arg1, arg2);
      }

   }
}
