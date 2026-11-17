import java.nio.ByteBuffer;
import sun.misc.Unsafe;

@deob.ObfuscatedName("hs")
public class class512 {
   @deob.ObfuscatedName("hs.k")
   private class474 field4078 = class474.field3856;
   @deob.ObfuscatedName("hs.b")
   private int field4075 = 128;
   @deob.ObfuscatedName("hs.r")
   private int field4070 = 0;
   @deob.ObfuscatedName("hs.p")
   private float[] field4071 = new float[this.field4075 * 16];
   @deob.ObfuscatedName("hs.o")
   private class511[] field4072 = new class511[this.field4075];
   @deob.ObfuscatedName("hs.a")
   private int[] field4073 = new int[this.field4075];
   @deob.ObfuscatedName("hs.v")
   private int[] field4066 = new int[4];
   @deob.ObfuscatedName("hs.n")
   private final class979 field4076;
   @deob.ObfuscatedName("hs.s")
   private class508 field4074;
   @deob.ObfuscatedName("hs.l")
   private class505 field4069;
   @deob.ObfuscatedName("hs.u")
   private class534 field4067;
   @deob.ObfuscatedName("hs.x")
   private int field4077;
   @deob.ObfuscatedName("hs.d")
   private class474 field4068;

   public class512(class979 arg0, int arg1) {
      this.field4076 = arg0;
      this.field4074 = this.field4076.method2570(true);
      this.field4074.method728(arg1 * 96, 24);
      this.field4069 = this.field4076.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3990, class496.field3988})});
      this.field4067 = this.field4076.method2569(false);
      int var3 = arg1 * 6;
      this.field4067.method695(var3);
      ByteBuffer var4 = this.field4076.field9975;
      var4.clear();

      for(int var5 = 0; var5 < arg1; ++var5) {
         var4.putShort((short)(var5 * 4));
         var4.putShort((short)(var5 * 4 + 2));
         var4.putShort((short)(var5 * 4 + 1));
         var4.putShort((short)(var5 * 4 + 2));
         var4.putShort((short)(var5 * 4 + 3));
         var4.putShort((short)(var5 * 4 + 1));
      }

      this.field4067.method700(0, var3 * this.field4067.method694().field3055, this.field4076.field9976);
      this.field4077 = arg1;
      this.field4070 = 0;
   }

   @deob.ObfuscatedName("hs.n()V")
   public void method7153() {
      this.field4074.method302();
      this.field4067.method302();
      this.field4074 = null;
      this.field4067 = null;
      this.field4069 = null;
      this.field4070 = 0;
   }

   @deob.ObfuscatedName("hs.k()V")
   public void method7154() {
      if (this.field4070 != 0) {
         this.field4076.method16368();
         this.field4076.method16521(1);
         this.field4076.method2624(this.field4067);
         this.field4076.method2539(0, this.field4074);
         this.field4076.method2572(this.field4069);
         class487 var1 = this.field4076.field10078;
         Unsafe var2 = this.field4076.field9978;
         ByteBuffer var3 = this.field4076.field9975;
         var3.clear();
         int var4 = (this.field4077 + this.field4070 - 1) / this.field4077;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = Math.min(this.field4077, this.field4070 - var5);
            long var9 = this.field4074.method698(0, var8 * 96);
            int var11 = this.field4077 * var7 + var8;

            for(int var12 = var5; var12 < var11; ++var12) {
               for(int var13 = 0; var13 < 4; ++var13) {
                  var2.putFloat(var9, this.field4071[var6++]);
                  long var14 = var9 + 4L;
                  var2.putFloat(var14, this.field4071[var6++]);
                  long var16 = var14 + 4L;
                  var2.putFloat(var16, 0.0F);
                  long var18 = var16 + 4L;
                  var2.putFloat(var18, this.field4071[var6++]);
                  long var20 = var18 + 4L;
                  var2.putFloat(var20, this.field4071[var6++]);
                  long var22 = var20 + 4L;
                  var2.putInt(var22, this.field4073[var12]);
                  var9 = var22 + 4L;
               }
            }

            this.field4074.method699();
            class511 var24 = this.field4072[var5];
            int var25 = 1;
            int var26 = 0;

            for(int var27 = var5 + 1; var27 < var11; ++var27) {
               if (this.field4072[var27] == var24) {
                  ++var25;
               } else {
                  var1.field3942 = var24;
                  var1.method444();
                  this.field4076.method2736(this.field4067, class522.field4132, var26 * 4, var25 * 4, var26 * 6, var25 * 2);
                  var24 = this.field4072[var27];
                  var25 = 1;
                  var26 = var27 - var5;
               }
            }

            var1.field3942 = var24;
            var1.method444();
            this.field4076.method2736(this.field4067, class522.field4132, var26 * 4, var25 * 4, var26 * 6, var25 * 2);
            var5 += this.field4077;
         }

         this.field4070 = 0;
      }
   }

   @deob.ObfuscatedName("hs.d(FFFFFFFFLhr;I)V")
   public void method7155(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, class511 arg8, int arg9) {
      if ((arg9 & -16777216) != 0) {
         this.field4076.method7511(this.field4066);
         int var11 = this.field4066[0];
         int var12 = this.field4066[1];
         int var13 = this.field4066[2];
         int var14 = this.field4066[3];
         if (!(arg0 > (float)var13)) {
            if (!(arg1 > (float)var14)) {
               if (!(arg2 < (float)var11)) {
                  if (!(arg3 < (float)var12)) {
                     float var15 = arg2 - arg0;
                     float var16 = arg3 - arg1;
                     float var17 = arg6 - arg4;
                     float var18 = arg7 - arg5;
                     if (arg0 < (float)var11) {
                        arg4 += ((float)var11 - arg0) / var15 * var17;
                        arg0 = (float)var11;
                     }

                     if (arg1 < (float)var12) {
                        arg5 += ((float)var12 - arg1) / var16 * var18;
                        arg1 = (float)var12;
                     }

                     if (arg2 > (float)var13) {
                        arg6 -= (arg2 - (float)var13) / var15 * var17;
                        arg2 = (float)var13;
                     }

                     if (arg3 > (float)var14) {
                        arg7 -= (arg3 - (float)var14) / var16 * var18;
                        arg3 = (float)var14;
                     }

                     this.method7172();
                     float var19 = this.method7176(arg0);
                     float var20 = this.method7166(arg1);
                     float var21 = this.method7176(arg2);
                     float var22 = this.method7166(arg3);
                     this.field4071[this.field4070 * 16 + 0] = var19;
                     this.field4071[this.field4070 * 16 + 1] = var20;
                     this.field4071[this.field4070 * 16 + 2] = arg4;
                     this.field4071[this.field4070 * 16 + 3] = arg5;
                     this.field4071[this.field4070 * 16 + 4] = var21;
                     this.field4071[this.field4070 * 16 + 5] = var20;
                     this.field4071[this.field4070 * 16 + 6] = arg6;
                     this.field4071[this.field4070 * 16 + 7] = arg5;
                     this.field4071[this.field4070 * 16 + 8] = var19;
                     this.field4071[this.field4070 * 16 + 9] = var22;
                     this.field4071[this.field4070 * 16 + 10] = arg4;
                     this.field4071[this.field4070 * 16 + 11] = arg7;
                     this.field4071[this.field4070 * 16 + 12] = var21;
                     this.field4071[this.field4070 * 16 + 13] = var22;
                     this.field4071[this.field4070 * 16 + 14] = arg6;
                     this.field4071[this.field4070 * 16 + 15] = arg7;
                     this.field4072[this.field4070] = arg8;
                     this.field4073[this.field4070] = arg9;
                     ++this.field4070;
                     if (class474.field3858 == this.field4078) {
                        this.method7154();
                     }

                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("hs.b(FFFFFFFFFFFFFFFFLhr;I)V")
   public void method7156(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, class511 arg16, int arg17) {
      if ((arg17 & -16777216) != 0) {
         this.field4076.method7511(this.field4066);
         int var19 = this.field4066[0];
         int var20 = this.field4066[1];
         int var21 = this.field4066[2];
         int var22 = this.field4066[3];
         byte var23 = 0;
         int var24 = (arg0 < (float)var19 ? 1 : 0) + (arg2 < (float)var19 ? 1 : 0) + (arg4 < (float)var19 ? 1 : 0) + (arg6 < (float)var19 ? 1 : 0);
         if (var24 != 4) {
            int var25 = var23 | var24;
            int var26 = (arg0 > (float)var21 ? 1 : 0) + (arg2 > (float)var21 ? 1 : 0) + (arg4 > (float)var21 ? 1 : 0) + (arg6 > (float)var21 ? 1 : 0);
            if (var26 != 4) {
               int var27 = var25 | var26;
               int var28 = (arg1 < (float)var20 ? 1 : 0) + (arg3 < (float)var20 ? 1 : 0) + (arg5 < (float)var20 ? 1 : 0) + (arg7 < (float)var20 ? 1 : 0);
               if (var28 != 4) {
                  int var29 = var27 | var28;
                  int var30 = (arg1 > (float)var22 ? 1 : 0) + (arg3 > (float)var22 ? 1 : 0) + (arg5 > (float)var22 ? 1 : 0) + (arg7 > (float)var22 ? 1 : 0);
                  if (var30 != 4) {
                     int var31 = var29 | var30;
                     if (var31 != 0) {
                        this.method7154();
                        this.field4076.method11504(true);
                        this.field4076.method7716(var19, var20, var21, var22);
                     }

                     this.method7172();
                     float var32 = this.method7176(arg0);
                     float var33 = this.method7166(arg1);
                     float var34 = this.method7176(arg2);
                     float var35 = this.method7166(arg3);
                     float var36 = this.method7176(arg4);
                     float var37 = this.method7166(arg5);
                     float var38 = this.method7176(arg6);
                     float var39 = this.method7166(arg7);
                     this.field4071[this.field4070 * 16 + 0] = var32;
                     this.field4071[this.field4070 * 16 + 1] = var33;
                     this.field4071[this.field4070 * 16 + 2] = arg8;
                     this.field4071[this.field4070 * 16 + 3] = arg9;
                     this.field4071[this.field4070 * 16 + 4] = var34;
                     this.field4071[this.field4070 * 16 + 5] = var35;
                     this.field4071[this.field4070 * 16 + 6] = arg10;
                     this.field4071[this.field4070 * 16 + 7] = arg11;
                     this.field4071[this.field4070 * 16 + 8] = var36;
                     this.field4071[this.field4070 * 16 + 9] = var37;
                     this.field4071[this.field4070 * 16 + 10] = arg12;
                     this.field4071[this.field4070 * 16 + 11] = arg13;
                     this.field4071[this.field4070 * 16 + 12] = var38;
                     this.field4071[this.field4070 * 16 + 13] = var39;
                     this.field4071[this.field4070 * 16 + 14] = arg14;
                     this.field4071[this.field4070 * 16 + 15] = arg15;
                     this.field4072[this.field4070] = arg16;
                     this.field4073[this.field4070] = arg17;
                     ++this.field4070;
                     if (class474.field3858 == this.field4078 || var31 > 0) {
                        this.method7154();
                     }

                     if (var31 != 0) {
                        this.field4076.method11504(false);
                        this.field4076.method7508();
                        this.field4076.method7716(var19, var20, var21, var22);
                     }

                  }
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("hs.r()V")
   private void method7172() {
      if (this.field4075 == this.field4070) {
         this.field4075 *= 2;
         float[] var1 = new float[this.field4075 * 16];

         for(int var2 = 0; var2 < this.field4070 * 16; ++var2) {
            var1[var2] = this.field4071[var2];
         }

         this.field4071 = var1;
         class511[] var3 = new class511[this.field4075];
         int[] var4 = new int[this.field4075];

         for(int var5 = 0; var5 < this.field4070; ++var5) {
            var3[var5] = this.field4072[var5];
            var4[var5] = this.field4073[var5];
         }

         this.field4072 = var3;
         this.field4073 = var4;
      }

   }

   @deob.ObfuscatedName("hs.p(F)F")
   private float method7176(float arg0) {
      int var2 = this.field4076.method11517().method566();
      return (arg0 + this.field4076.method2510()) / (float)var2 * 2.0F - 1.0F;
   }

   @deob.ObfuscatedName("hs.o(F)F")
   private float method7166(float arg0) {
      int var2 = this.field4076.method11517().method559();
      return (1.0F - (arg0 + this.field4076.method2510()) / (float)var2) * 2.0F - 1.0F;
   }

   @deob.ObfuscatedName("hs.a()V")
   public void method7160() {
      this.field4068 = this.field4078;
      this.field4078 = class474.field3857;
   }

   @deob.ObfuscatedName("hs.x()V")
   public void method7161() {
      if (this.field4068 != null) {
         this.field4078 = this.field4068;
         this.field4068 = null;
      }

   }

   @deob.ObfuscatedName("hs.s()Lgh;")
   public class474 method7152() {
      return this.field4078;
   }
}
