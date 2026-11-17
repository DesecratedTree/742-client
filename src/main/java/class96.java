import java.nio.ByteBuffer;
import sun.misc.Unsafe;

@deob.ObfuscatedName("adm")
public class class96 extends class674 {
   @deob.ObfuscatedName("adm.l")
   private int field722 = 0;
   @deob.ObfuscatedName("adm.u")
   private int field716 = 0;
   @deob.ObfuscatedName("adm.v")
   private int field727 = 0;
   @deob.ObfuscatedName("adm.b")
   private final class979 field714;
   @deob.ObfuscatedName("adm.p")
   private final class81 field715;
   @deob.ObfuscatedName("adm.r")
   private final class970 field721;
   @deob.ObfuscatedName("adm.o")
   private int field728;
   @deob.ObfuscatedName("adm.a")
   private int field717;
   @deob.ObfuscatedName("adm.x")
   private int field718;
   @deob.ObfuscatedName("adm.s")
   private int field719;
   @deob.ObfuscatedName("adm.e")
   private float[][] field725;
   @deob.ObfuscatedName("adm.z")
   private float[][] field720;
   @deob.ObfuscatedName("adm.m")
   private float[][] field726;
   @deob.ObfuscatedName("adm.i")
   private class875 field713;
   @deob.ObfuscatedName("adm.t")
   private ByteBuffer field729;
   @deob.ObfuscatedName("adm.h")
   private class508 field724;
   @deob.ObfuscatedName("adm.g")
   private class534 field723;

   public class96(class979 arg0, class970 arg1, class81 arg2, int[] arg3) {
      this.field714 = arg0;
      this.field715 = arg2;
      this.field721 = arg1;
      int var5 = this.field715.method1112() - (arg1.field9460 >> 1);
      this.field728 = this.field715.method1123() - var5 >> arg1.field9464;
      this.field717 = this.field715.method1123() + var5 >> arg1.field9464;
      this.field718 = this.field715.method1111() - var5 >> arg1.field9464;
      this.field719 = this.field715.method1111() + var5 >> arg1.field9464;
      int var6 = this.field717 - this.field728 + 1;
      int var7 = this.field719 - this.field718 + 1;
      this.field725 = new float[var6 + 1][var7 + 1];
      this.field720 = new float[var6 + 1][var7 + 1];
      this.field726 = new float[var6 + 1][var7 + 1];

      for(int var8 = 0; var8 <= var7; ++var8) {
         int var9 = this.field718 + var8;
         if (var9 > 0 && var9 < this.field721.field9461 - 1) {
            for(int var10 = 0; var10 <= var6; ++var10) {
               int var11 = this.field728 + var10;
               if (var11 > 0 && var11 < this.field721.field9463 - 1) {
                  int var12 = arg1.method15966(var11 + 1, var9) - arg1.method15966(var11 - 1, var9);
                  int var13 = arg1.method15966(var11, var9 + 1) - arg1.method15966(var11, var9 - 1);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + var12 * var12 + 65536)));
                  this.field725[var10][var8] = (float)var12 * var14;
                  this.field720[var10][var8] = var14 * -256.0F;
                  this.field726[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      int var15 = 0;

      for(int var16 = this.field718; var16 <= this.field719; ++var16) {
         if (var16 >= 0 && var16 < arg1.field9461) {
            for(int var17 = this.field728; var17 <= this.field717; ++var17) {
               if (var17 >= 0 && var17 < arg1.field9463) {
                  int var18 = arg3[var15];
                  int[] var19 = arg1.field9678[var17][var16];
                  if (var19 != null && var18 != 0) {
                     if (var18 == 1) {
                        for(int var20 = 0; var20 < var19.length; var20 += 3) {
                           if (var19[var20] != -1 && var19[var20 + 1] != -1 && var19[var20 + 2] != -1) {
                              this.field716 += 3;
                           }
                        }
                     } else {
                        this.field716 += 3;
                     }
                  }
               }

               ++var15;
            }
         } else {
            var15 += this.field717 - this.field728;
         }
      }

      if (this.field716 > 0) {
         this.field713 = new class875(class887.method4053(this.field716));
         this.field729 = this.field714.field9975;
         this.field729.clear();
         this.field729.position(2097152);
         this.field729.slice();
         this.field729.position(0);
         this.field729.limit(2097152);
         int var21 = 0;
         int var22 = 0;

         for(int var23 = this.field718; var23 <= this.field719; ++var23) {
            if (var23 >= 0 && var23 < arg1.field9461) {
               int var24 = 0;

               for(int var25 = this.field728; var25 <= this.field717; ++var25) {
                  if (var25 >= 0 && var25 < arg1.field9463) {
                     int var26 = arg3[var22];
                     int[] var27 = arg1.field9678[var25][var23];
                     if (var27 != null && var26 != 0) {
                        if (var26 != 1) {
                           if (var26 == 3) {
                              this.method1324(var24, var21, var25, var23, 0, 0);
                              this.method1324(var24, var21, var25, var23, arg1.field9460, 0);
                              this.method1324(var24, var21, var25, var23, 0, arg1.field9460);
                           } else if (var26 == 2) {
                              this.method1324(var24, var21, var25, var23, arg1.field9460, 0);
                              this.method1324(var24, var21, var25, var23, arg1.field9460, arg1.field9460);
                              this.method1324(var24, var21, var25, var23, 0, 0);
                           } else if (var26 == 5) {
                              this.method1324(var24, var21, var25, var23, arg1.field9460, arg1.field9460);
                              this.method1324(var24, var21, var25, var23, 0, arg1.field9460);
                              this.method1324(var24, var21, var25, var23, arg1.field9460, 0);
                           } else if (var26 == 4) {
                              this.method1324(var24, var21, var25, var23, 0, arg1.field9460);
                              this.method1324(var24, var21, var25, var23, 0, 0);
                              this.method1324(var24, var21, var25, var23, arg1.field9460, arg1.field9460);
                           }
                        } else {
                           int[] var28 = arg1.field9696[var25][var23];
                           int[] var29 = arg1.field9695[var25][var23];
                           int var30 = 0;

                           label110:
                           while(true) {
                              while(true) {
                                 if (var30 >= var27.length) {
                                    break label110;
                                 }

                                 if (var27[var30] != -1 && var27[var30 + 1] != -1 && var27[var30 + 2] != -1) {
                                    this.method1324(var24, var21, var25, var23, var28[var30], var29[var30]);
                                    ++var30;
                                    this.method1324(var24, var21, var25, var23, var28[var30], var29[var30]);
                                    ++var30;
                                    this.method1324(var24, var21, var25, var23, var28[var30], var29[var30]);
                                    ++var30;
                                 } else {
                                    var30 += 3;
                                 }
                              }
                           }
                        }
                     }
                  }

                  ++var22;
                  ++var24;
               }
            } else {
               var22 += this.field717 - this.field728;
            }

            ++var21;
         }

         this.method1325();
      } else {
         this.field724 = null;
         this.field723 = null;
      }

      this.field713 = null;
      this.field726 = (float[][])null;
      this.field720 = (float[][])null;
      this.field725 = (float[][])null;
   }

   @deob.ObfuscatedName("adm.n()V")
   private void method1325() {
      this.field723 = this.field714.method2569(false);
      this.field723.method695(this.field727);
      this.field724 = this.field714.method2570(false);
      this.field724.method728(this.field722 * 16, 16);
      this.field724.method700(0, this.field722 * 16, this.field714.field9976);
      this.field723.method700(0, this.field727 * 2, this.field714.field9976 + 2097152L);
   }

   @deob.ObfuscatedName("adm.k(IIIIII)V")
   private void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      long var7 = -1L;
      int var9 = (arg2 << this.field721.field9464) + arg4;
      int var10 = (arg3 << this.field721.field9464) + arg5;
      int var11 = this.field721.method15965(var9, var10);
      if ((arg4 & 127) == 0 || (arg5 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         class674 var12 = this.field713.method15322(var7);
         if (var12 != null) {
            Unsafe var13 = this.field714.field9978;
            var13.putShort(this.field714.field9976 + 2097152L + (long)(this.field727 * 2), ((class103)var12).field796);
            ++this.field727;
            return;
         }
      }

      short var14 = (short)this.field722;
      if (var7 != -1L) {
         this.field713.method15311(new class103(var14), var7);
      }

      float var15;
      float var16;
      float var17;
      if (arg4 == 0 && arg5 == 0) {
         var15 = this.field725[arg0][arg1];
         var16 = this.field720[arg0][arg1];
         var17 = this.field726[arg0][arg1];
      } else if (this.field721.field9460 == arg4 && arg5 == 0) {
         var15 = this.field725[arg0 + 1][arg1];
         var16 = this.field720[arg0 + 1][arg1];
         var17 = this.field726[arg0 + 1][arg1];
      } else if (this.field721.field9460 == arg4 && this.field721.field9460 == arg5) {
         var15 = this.field725[arg0 + 1][arg1 + 1];
         var16 = this.field720[arg0 + 1][arg1 + 1];
         var17 = this.field726[arg0 + 1][arg1 + 1];
      } else if (arg4 == 0 && this.field721.field9460 == arg5) {
         var15 = this.field725[arg0][arg1 + 1];
         var16 = this.field720[arg0][arg1 + 1];
         var17 = this.field726[arg0][arg1 + 1];
      } else {
         float var18 = (float)arg4 / (float)this.field721.field9460;
         float var19 = (float)arg5 / (float)this.field721.field9460;
         float var20 = this.field725[arg0][arg1];
         float var21 = this.field720[arg0][arg1];
         float var22 = this.field726[arg0][arg1];
         float var23 = this.field725[arg0 + 1][arg1];
         float var24 = this.field720[arg0 + 1][arg1];
         float var25 = this.field726[arg0 + 1][arg1];
         float var26 = (this.field725[arg0][arg1 + 1] - var20) * var18 + var20;
         float var27 = (this.field720[arg0][arg1 + 1] - var21) * var18 + var21;
         float var28 = (this.field726[arg0][arg1 + 1] - var22) * var18 + var22;
         float var29 = (this.field725[arg0 + 1][arg1 + 1] - var23) * var18 + var23;
         float var30 = (this.field720[arg0 + 1][arg1 + 1] - var24) * var18 + var24;
         float var31 = (this.field726[arg0 + 1][arg1 + 1] - var25) * var18 + var25;
         var15 = (var29 - var26) * var19 + var26;
         var16 = (var30 - var27) * var19 + var27;
         var17 = (var31 - var28) * var19 + var28;
      }

      float var32 = (float)(this.field715.method1123() - var9);
      float var33 = (float)(this.field715.method1110() - var11);
      float var34 = (float)(this.field715.method1111() - var10);
      float var35 = (float)Math.sqrt((double)(var34 * var34 + var32 * var32 + var33 * var33));
      float var36 = 1.0F / var35;
      float var37 = var32 * var36;
      float var38 = var33 * var36;
      float var39 = var34 * var36;
      float var40 = var35 / (float)this.field715.method1112();
      float var41 = 1.0F - var40 * var40;
      if (var41 < 0.0F) {
         var41 = 0.0F;
      }

      float var42 = var17 * var39 + var15 * var37 + var16 * var38;
      if (var42 < 0.0F) {
         var42 = 0.0F;
      }

      float var43 = var41 * var42 * 2.0F;
      if (var43 > 1.0F) {
         var43 = 1.0F;
      }

      int var44 = this.field715.method1113();
      int var45 = (int)((float)(var44 >> 16 & 255) * var43);
      if (var45 > 255) {
         var45 = 255;
      }

      int var46 = (int)((float)(var44 >> 8 & 255) * var43);
      if (var46 > 255) {
         var46 = 255;
      }

      int var47 = (int)((float)(var44 & 255) * var43);
      if (var47 > 255) {
         var47 = 255;
      }

      Unsafe var48 = this.field714.field9978;
      var48.putFloat((long)(this.field722 * 16) + this.field714.field9976, (float)var9);
      var48.putFloat((long)(this.field722 * 16) + this.field714.field9976 + 4L, (float)var11);
      var48.putFloat((long)(this.field722 * 16) + this.field714.field9976 + 8L, (float)var10);
      if (this.field714.field10108 == 0) {
         var48.putByte((long)(this.field722 * 16) + this.field714.field9976 + 12L, (byte)var47);
         var48.putByte((long)(this.field722 * 16) + this.field714.field9976 + 13L, (byte)var46);
         var48.putByte((long)(this.field722 * 16) + this.field714.field9976 + 14L, (byte)var45);
      } else {
         var48.putByte((long)(this.field722 * 16) + this.field714.field9976 + 12L, (byte)var45);
         var48.putByte((long)(this.field722 * 16) + this.field714.field9976 + 13L, (byte)var46);
         var48.putByte((long)(this.field722 * 16) + this.field714.field9976 + 14L, (byte)var47);
      }

      var48.putByte((long)(this.field722 * 16) + this.field714.field9976 + 15L, (byte)-1);
      ++this.field722;
      var48.putShort(this.field714.field9976 + 2097152L + (long)(this.field727 * 2), var14);
      ++this.field727;
   }
}
