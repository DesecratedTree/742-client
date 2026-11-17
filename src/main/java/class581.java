import java.util.Random;

@deob.ObfuscatedName("jz")
public abstract class class581 {
   @deob.ObfuscatedName("jz.r")
   private short[] field5298 = new short[512];
   @deob.ObfuscatedName("jz.p")
   private int field5299 = 0;
   @deob.ObfuscatedName("jz.o")
   private int field5300 = 4;
   @deob.ObfuscatedName("jz.a")
   private int field5304 = 4;
   @deob.ObfuscatedName("jz.x")
   private int field5301 = 4;
   @deob.ObfuscatedName("jz.s")
   protected int field5297 = 4;
   @deob.ObfuscatedName("jz.l")
   public static final int[] field5294 = new int[4096];
   @deob.ObfuscatedName("jz.b")
   private short[] field5302;

   protected class581(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field5299 = arg0;
      this.field5300 = arg2;
      this.field5304 = arg3;
      this.field5301 = arg4;
      this.field5297 = arg1;
      this.method8043();
      this.method8039();
   }

   static {
      for(int var0 = 0; var0 < 4096; ++var0) {
         field5294[var0] = method8042(var0);
      }

   }

   @deob.ObfuscatedName("jz.n(III)V")
   protected void method8041(int arg0, int arg1, int arg2) {
      int[] var4 = new int[arg0];
      int[] var5 = new int[arg1];
      int[] var6 = new int[arg2];

      for(int var7 = 0; var7 < arg0; ++var7) {
         var4[var7] = (var7 << 12) / arg0;
      }

      for(int var8 = 0; var8 < arg1; ++var8) {
         var5[var8] = (var8 << 12) / arg1;
      }

      for(int var9 = 0; var9 < arg2; ++var9) {
         var6[var9] = (var9 << 12) / arg2;
      }

      this.method817();

      for(int var10 = 0; var10 < arg2; ++var10) {
         for(int var11 = 0; var11 < arg1; ++var11) {
            for(int var12 = 0; var12 < arg0; ++var12) {
               for(int var13 = 0; var13 < this.field5297; ++var13) {
                  int var14 = this.field5302[var13] << 12;
                  int var15 = this.field5300 * var14 >> 12;
                  int var16 = this.field5304 * var14 >> 12;
                  int var17 = this.field5301 * var14 >> 12;
                  int var18 = var4[var12] * var14 >> 12;
                  int var19 = var5[var11] * var14 >> 12;
                  int var20 = var6[var10] * var14 >> 12;
                  int var21 = this.field5300 * var18;
                  int var22 = this.field5304 * var19;
                  int var23 = this.field5301 * var20;
                  int var24 = var21 >> 12;
                  int var25 = var24 + 1;
                  int var26 = var24 & 255;
                  int var27 = var22 >> 12;
                  int var28 = var27 + 1;
                  int var29 = var27 & 255;
                  int var30 = var23 >> 12;
                  int var31 = var30 + 1;
                  int var32 = var30 & 255;
                  int var33;
                  if (var25 >= var15) {
                     var33 = 0;
                  } else {
                     var33 = var25 & 255;
                  }

                  int var34;
                  if (var28 >= var16) {
                     var34 = 0;
                  } else {
                     var34 = var28 & 255;
                  }

                  int var35;
                  if (var31 >= var17) {
                     var35 = 0;
                  } else {
                     var35 = var31 & 255;
                  }

                  int var36 = var21 & 4095;
                  int var37 = var22 & 4095;
                  int var38 = var23 & 4095;
                  int var39 = field5294[var36];
                  int var40 = field5294[var37];
                  int var41 = field5294[var38];
                  int var42 = var36 - 4096;
                  int var43 = var37 - 4096;
                  int var44 = var38 - 4096;
                  short var45 = this.field5298[var32];
                  short var46 = this.field5298[var35];
                  short var47 = this.field5298[var29 + var45];
                  short var48 = this.field5298[var34 + var45];
                  short var49 = this.field5298[var29 + var46];
                  short var50 = this.field5298[var34 + var46];
                  int var51 = method8040(this.field5298[var26 + var47], var36, var37, var38);
                  int var52 = method8040(this.field5298[var33 + var47], var42, var37, var38);
                  int var53 = ((var52 - var51) * var39 >> 12) + var51;
                  int var54 = method8040(this.field5298[var26 + var48], var36, var43, var38);
                  int var55 = method8040(this.field5298[var33 + var48], var42, var43, var38);
                  int var56 = ((var55 - var54) * var39 >> 12) + var54;
                  int var57 = ((var56 - var53) * var40 >> 12) + var53;
                  int var58 = method8040(this.field5298[var26 + var49], var36, var37, var44);
                  int var59 = method8040(this.field5298[var33 + var49], var42, var37, var44);
                  int var60 = ((var59 - var58) * var39 >> 12) + var58;
                  int var61 = method8040(this.field5298[var26 + var50], var36, var43, var44);
                  int var62 = method8040(this.field5298[var33 + var50], var42, var43, var44);
                  int var63 = ((var62 - var61) * var39 >> 12) + var61;
                  int var64 = ((var63 - var60) * var40 >> 12) + var60;
                  this.method820(var13, ((var64 - var57) * var41 >> 12) + var57);
               }

               this.method819();
            }
         }
      }

   }

   @deob.ObfuscatedName("jz.r()V")
   private void method8043() {
      this.field5302 = new short[this.field5297];

      for(int var1 = 0; var1 < this.field5297; ++var1) {
         this.field5302[var1] = (short)((int)Math.pow(2.0D, (double)var1));
      }

   }

   @deob.ObfuscatedName("jz.p(IIII)I")
   private static int method8040(int arg0, int arg1, int arg2, int arg3) {
      int var4 = arg0 & 15;
      int var5 = var4 < 8 ? arg1 : arg2;
      int var6 = var4 < 4 ? arg2 : (var4 != 12 && var4 != 14 ? arg3 : arg1);
      return ((var4 & 1) == 0 ? var5 : -var5) + ((var4 & 2) == 0 ? var6 : -var6);
   }

   @deob.ObfuscatedName("jz.o()V")
   private void method8039() {
      Random var1 = new Random((long)this.field5299);

      for(int var2 = 0; var2 < 255; ++var2) {
         this.field5298[var2] = (short)var2;
      }

      for(int var3 = 0; var3 < 255; ++var3) {
         int var4 = 255 - var3;
         int var5 = class887.method15494(var1, var4);
         short var6 = this.field5298[var5];
         this.field5298[var5] = this.field5298[var4];
         this.field5298[var4] = this.field5298[var4 + 256] = var6;
      }

   }

   @deob.ObfuscatedName("jz.a(I)I")
   private static final int method8042(int arg0) {
      int var1 = (arg0 * arg0 >> 12) * arg0 >> 12;
      int var2 = arg0 * 6 - 61440;
      int var3 = (arg0 * var2 >> 12) + 40960;
      return var1 * var3 >> 12;
   }

   @deob.ObfuscatedName("jz.k()V")
   protected abstract void method817();

   @deob.ObfuscatedName("jz.d()V")
   protected abstract void method819();

   @deob.ObfuscatedName("jz.b(II)V")
   protected abstract void method820(int arg0, int arg1);
}
