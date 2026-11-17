import java.nio.ByteBuffer;

@deob.ObfuscatedName("zm")
public class class1000 extends class609 {
   @deob.ObfuscatedName("zm.z")
   private byte[] field10588 = new byte[512];
   @deob.ObfuscatedName("zm.g")
   private final class979 field10586;
   @deob.ObfuscatedName("zm.i")
   private int field10590;
   @deob.ObfuscatedName("zm.m")
   private int field10585;
   @deob.ObfuscatedName("zm.h")
   private final class511 field10589;
   @deob.ObfuscatedName("zm.e")
   private final class508 field10587;

   public class1000(class979 arg0, class883 arg1, class998[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field10586 = arg0;
      this.field10590 = 0;

      for(int var5 = 0; var5 < 256; ++var5) {
         class998 var6 = arg2[var5];
         if (var6.field10572 > this.field10590) {
            this.field10590 = var6.field10572;
         }

         if (var6.field10574 > this.field10590) {
            this.field10590 = var6.field10574;
         }
      }

      this.field10585 = this.field10590 * 16;
      if (arg3) {
         byte[] var7 = new byte[this.field10585 * this.field10585];

         for(int var8 = 0; var8 < 256; ++var8) {
            class998 var9 = arg2[var8];
            int var10 = var9.field10572;
            int var11 = var9.field10574;
            int var12 = var8 % 16 * this.field10590;
            int var13 = var8 / 16 * this.field10590;
            int var14 = this.field10585 * var13 + var12;
            int var15 = 0;
            if (var9.field10573 == null) {
               byte[] var16 = var9.field10579;

               for(int var17 = 0; var17 < var10; ++var17) {
                  for(int var18 = 0; var18 < var11; ++var18) {
                     var7[var14++] = (byte)(var16[var15++] == 0 ? 0 : -1);
                  }

                  var14 += this.field10585 - var11;
               }
            } else {
               byte[] var19 = var9.field10573;

               for(int var20 = 0; var20 < var10; ++var20) {
                  for(int var21 = 0; var21 < var11; ++var21) {
                     var7[var14++] = var19[var15++];
                  }

                  var14 += this.field10585 - var11;
               }
            }
         }

         int[] var22 = new int[var7.length];

         for(int var23 = 0; var23 < var7.length; ++var23) {
            var22[var23] = var7[var23] << 24 | var7[var23] << 16 | var7[var23] << 8 | var7[var23];
         }

         this.field10589 = arg0.method16347(this.field10585, this.field10585, false, var22);
      } else {
         int[] var24 = new int[this.field10585 * this.field10585];

         for(int var25 = 0; var25 < 256; ++var25) {
            class998 var26 = arg2[var25];
            int[] var27 = var26.field10578;
            byte[] var28 = var26.field10573;
            byte[] var29 = var26.field10579;
            int var30 = var26.field10572;
            int var31 = var26.field10574;
            int var32 = var25 % 16 * this.field10590;
            int var33 = var25 / 16 * this.field10590;
            int var34 = this.field10585 * var33 + var32;
            int var35 = 0;
            if (var28 != null) {
               for(int var36 = 0; var36 < var30; ++var36) {
                  for(int var37 = 0; var37 < var31; ++var37) {
                     var24[var34++] = var28[var35] << 24 | var27[var29[var35] & 255];
                     ++var35;
                  }

                  var34 += this.field10585 - var31;
               }
            } else {
               for(int var38 = 0; var38 < var30; ++var38) {
                  for(int var39 = 0; var39 < var31; ++var39) {
                     byte var40;
                     if ((var40 = var29[var35++]) != 0) {
                        var24[var34++] = -16777216 | var27[var40 & 255];
                     } else {
                        ++var34;
                     }
                  }

                  var34 += this.field10585 - var31;
               }
            }
         }

         this.field10589 = arg0.method16347(this.field10585, this.field10585, false, var24);
      }

      this.field10589.method503(class500.field4025);
      this.field10587 = arg0.method2570(false);
      this.field10587.method728(20480, 20);
      ByteBuffer var41 = this.field10586.field9975;
      var41.clear();
      float var42 = this.field10589.method492((float)this.field10585) / (float)this.field10585;
      float var43 = this.field10589.method493((float)this.field10585) / (float)this.field10585;

      for(int var44 = 0; var44 < 256; ++var44) {
         class998 var45 = arg2[var44];
         int var46 = var45.field10572;
         int var47 = var45.field10574;
         int var48 = var45.field10576;
         int var49 = var45.field10575;
         float var50 = (float)(var44 % 16 * this.field10590);
         float var51 = (float)(var44 / 16 * this.field10590);
         float var52 = var42 * var50;
         float var53 = var43 * var51;
         float var54 = ((float)var47 + var50) * var42;
         float var55 = ((float)var46 + var51) * var43;
         var41.putFloat((float)var49);
         var41.putFloat((float)var48);
         var41.putFloat(0.0F);
         var41.putFloat(var52);
         var41.putFloat(var53);
         var41.putFloat((float)var49);
         var41.putFloat((float)(var46 + var48));
         var41.putFloat(0.0F);
         var41.putFloat(var52);
         var41.putFloat(var55);
         var41.putFloat((float)(var47 + var49));
         var41.putFloat((float)(var46 + var48));
         var41.putFloat(0.0F);
         var41.putFloat(var54);
         var41.putFloat(var55);
         var41.putFloat((float)(var47 + var49));
         var41.putFloat((float)var48);
         var41.putFloat(0.0F);
         var41.putFloat(var54);
         var41.putFloat(var53);
      }

      this.field10587.method700(0, var41.position(), this.field10586.field9976);
      arg0.method16312(12);

      for(int var56 = 0; var56 < 256; ++var56) {
         class998 var57 = arg2[var56];
         this.field10588[var56 * 2] = (byte)var57.field10575;
         this.field10588[var56 * 2 + 1] = (byte)var57.field10576;
      }

   }

   @deob.ObfuscatedName("zm.UA(CIIIZ)V")
   protected void method5659(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      if (this.field10586.method16323() != class474.field3857) {
         int var6 = this.field10588[arg0 * 2] + arg1;
         int var7 = this.field10588[arg0 * 2 + 1] + arg2;
         this.field10586.field10079.method7155((float)var6, (float)var7, (float)(this.field10590 + var6), (float)(this.field10590 + var7), (float)(arg0 % 16) / 16.0F * this.field10589.method508(), (float)(arg0 / 16) / 16.0F * this.field10589.method495(), (float)(arg0 % 16 + 1) / 16.0F * this.field10589.method508(), (float)(arg0 / 16 + 1) / 16.0F * this.field10589.method495(), this.field10589, arg3);
      } else {
         this.field10586.method16338();
         this.field10586.method16521(1);
         class475 var8 = this.field10586.field10077;
         var8.field3860 = this.field10589;
         var8.method405(0, arg3);
         float var9 = (float)this.field10586.method11517().method566();
         float var10 = (float)this.field10586.method11517().method559();
         var8.field3861.method8392(2.0F / var9, 2.0F / var10, 1.0F, 1.0F);
         var8.field3861.field5413[12] = ((float)arg1 + this.field10586.method2510()) * 2.0F / var9 - 1.0F;
         var8.field3861.field5413[13] = ((float)arg2 + this.field10586.method2510()) * 2.0F / var10 - 1.0F;
         var8.field3861.field5413[14] = -1.0F;
         var8.field3859.method8480();
         var8.field3865 = this.field10587;
         var8.field3863 = arg0 * 4;
         var8.field3862 = this.field10586.field10039;
         var8.method406();
      }

   }

   @deob.ObfuscatedName("zm.m(CIIIZLta;II)V")
   protected void method5671(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7) {
   }
}
