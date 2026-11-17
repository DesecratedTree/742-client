@deob.ObfuscatedName("zf")
public class class993 extends class609 {
   @deob.ObfuscatedName("zf.g")
   private class984 field10557;
   @deob.ObfuscatedName("zf.e")
   private int[] field10558;
   @deob.ObfuscatedName("zf.z")
   private int[] field10556;
   @deob.ObfuscatedName("zf.h")
   private byte[][] field10555;
   @deob.ObfuscatedName("zf.m")
   private int[] field10554;
   @deob.ObfuscatedName("zf.i")
   private int[] field10559;

   public class993(class984 arg0, class883 arg1, class998[] arg2, int[] arg3, int[] arg4) {
      super(arg0, arg1);
      this.field10557 = arg0;
      this.field10557 = arg0;
      this.field10558 = arg3;
      this.field10556 = arg4;
      this.field10555 = new byte[arg2.length][];
      this.field10554 = new int[arg2.length];
      this.field10559 = new int[arg2.length];

      for(int var6 = 0; var6 < arg2.length; ++var6) {
         class998 var7 = arg2[var6];
         if (var7.field10573 != null) {
            this.field10555[var6] = var7.field10573;
         } else {
            byte[] var8 = var7.field10579;
            byte[] var9 = this.field10555[var6] = new byte[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               var9[var10] = (byte)(var8[var10] == 0 ? 0 : -1);
            }
         }

         this.field10554[var6] = var7.field10576;
         this.field10559[var6] = var7.field10575;
      }

   }

   @deob.ObfuscatedName("zf.UA(CIIIZ)V")
   protected void method5659(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      if (this.field10557.field10406 != null) {
         int var6 = this.field10559[arg0] + arg1;
         int var7 = this.field10554[arg0] + arg2;
         int var8 = this.field10558[arg0];
         int var9 = this.field10556[arg0];
         int var10 = this.field10557.field10407;
         int var11 = var7 * var10 + var6;
         int var12 = var10 - var8;
         int var13 = 0;
         int var14 = 0;
         if (var7 < this.field10557.field10415) {
            int var15 = this.field10557.field10415 - var7;
            var9 -= var15;
            var7 = this.field10557.field10415;
            var14 += var8 * var15;
            var11 += var10 * var15;
         }

         if (var7 + var9 > this.field10557.field10413) {
            var9 -= var7 + var9 - this.field10557.field10413;
         }

         if (var6 < this.field10557.field10405) {
            int var16 = this.field10557.field10405 - var6;
            var8 -= var16;
            var6 = this.field10557.field10405;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
         }

         if (var6 + var8 > this.field10557.field10411) {
            int var17 = var6 + var8 - this.field10557.field10411;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
         }

         if (var8 > 0 && var9 > 0) {
            this.method17060(this.field10555[arg0], this.field10557.field10406, arg3, var14, var11, var8, var9, var12, var13);
         }
      }
   }

   @deob.ObfuscatedName("zf.n([B[IIIIIIII)V")
   private void method17060(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      for(int var10 = -arg6; var10 < 0; ++var10) {
         for(int var11 = -arg5; var11 < 0; ++var11) {
            int var12 = arg0[arg3++] & 255;
            if (var12 != 0) {
               int var13 = ((arg2 & 65280) * var12 & 16711680) + ((arg2 & 16711935) * var12 & -16711936) >> 8;
               int var14 = 256 - var12;
               int var15 = arg1[arg4];
               arg1[arg4++] = (((var15 & 16711935) * var14 & -16711936) + ((var15 & 65280) * var14 & 16711680) >> 8) + var13;
            } else {
               ++arg4;
            }
         }

         arg4 += arg7;
         arg3 += arg8;
      }

   }

   @deob.ObfuscatedName("zf.m(CIIIZLta;II)V")
   protected void method5671(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7) {
      if (this.field10557.field10406 != null) {
         if (arg5 == null) {
            this.method5659(arg0, arg1, arg2, arg3, arg4);
         } else {
            int var9 = this.field10559[arg0] + arg1;
            int var10 = this.field10554[arg0] + arg2;
            int var11 = this.field10558[arg0];
            int var12 = this.field10556[arg0];
            int var13 = this.field10557.field10407;
            int var14 = var10 * var13 + var9;
            int var15 = var13 - var11;
            int var16 = 0;
            int var17 = 0;
            if (var10 < this.field10557.field10415) {
               int var18 = this.field10557.field10415 - var10;
               var12 -= var18;
               var10 = this.field10557.field10415;
               var17 += var11 * var18;
               var14 += var13 * var18;
            }

            if (var10 + var12 > this.field10557.field10413) {
               var12 -= var10 + var12 - this.field10557.field10413;
            }

            if (var9 < this.field10557.field10405) {
               int var19 = this.field10557.field10405 - var9;
               var11 -= var19;
               var9 = this.field10557.field10405;
               var17 += var19;
               var14 += var19;
               var16 += var19;
               var15 += var19;
            }

            if (var9 + var11 > this.field10557.field10411) {
               int var20 = var9 + var11 - this.field10557.field10411;
               var11 -= var20;
               var16 += var20;
               var15 += var20;
            }

            if (var11 > 0 && var12 > 0) {
               this.method17058(this.field10555[arg0], this.field10557.field10406, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field10558[arg0], arg5, arg6, arg7);
            }
         }
      }
   }

   @deob.ObfuscatedName("zf.z([B[IIIIIIIIIIILta;II)V")
   private void method17058(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class826 arg12, int arg13, int arg14) {
      class962 var16 = (class962)arg12;
      int[] var17 = var16.field9621;
      int[] var18 = var16.field9622;
      int var19 = arg9 - this.field10557.field10405;
      int var20 = arg10;
      if (arg14 > arg10) {
         var20 = arg14;
         arg4 += this.field10557.field10407 * (arg14 - arg10);
         arg3 += (arg14 - arg10) * arg11;
      }

      int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var17[var22 - arg14] + arg13;
         int var24 = var18[var22 - arg14];
         int var25 = arg5;
         if (var19 > var23) {
            int var26 = var19 - var23;
            if (var26 >= var24) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            var24 -= var26;
         } else {
            int var27 = var23 - var19;
            if (var27 >= arg5) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            arg3 += var27;
            var25 = arg5 - var27;
            arg4 += var27;
         }

         int var28 = 0;
         if (var25 < var24) {
            var24 = var25;
         } else {
            var28 = var25 - var24;
         }

         for(int var29 = -var24; var29 < 0; ++var29) {
            int var30 = arg0[arg3++] & 255;
            if (var30 != 0) {
               int var31 = ((arg2 & 16711935) * var30 & -16711936) + ((arg2 & 65280) * var30 & 16711680) >> 8;
               int var32 = 256 - var30;
               int var33 = arg1[arg4];
               arg1[arg4++] = (((var33 & 65280) * var32 & 16711680) + ((var33 & 16711935) * var32 & -16711936) >> 8) + var31;
            } else {
               ++arg4;
            }
         }

         arg3 += arg8 + var28;
         arg4 += arg7 + var28;
      }

   }
}
