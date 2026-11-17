import jaggl.OpenGL;

@deob.ObfuscatedName("bl")
public class class343 {
   @deob.ObfuscatedName("bl.n")
   private float[] field2161 = new float[16];
   @deob.ObfuscatedName("bl.k")
   private class268 field2152 = new class268(786336);
   @deob.ObfuscatedName("bl.o")
   private final int field2164 = 64;
   @deob.ObfuscatedName("bl.a")
   private final int field2158 = 768;
   @deob.ObfuscatedName("bl.x")
   private final int field2157 = 1600;
   @deob.ObfuscatedName("bl.s")
   private final int field2160 = class887.method5009(1600);
   @deob.ObfuscatedName("bl.l")
   private final int field2163 = 64;
   @deob.ObfuscatedName("bl.u")
   private int[] field2155 = new int[8191];
   @deob.ObfuscatedName("bl.v")
   private int[] field2151 = new int[1600];
   @deob.ObfuscatedName("bl.g")
   private int[] field2159 = new int[64];
   @deob.ObfuscatedName("bl.h")
   private class194[][] field2165 = new class194[1600][64];
   @deob.ObfuscatedName("bl.e")
   private class194[][] field2166 = new class194[64][768];
   @deob.ObfuscatedName("bl.z")
   private int field2167 = 0;
   @deob.ObfuscatedName("bl.b")
   private class340 field2154;
   @deob.ObfuscatedName("bl.p")
   private class340 field2156;
   @deob.ObfuscatedName("bl.r")
   private class340 field2162;
   @deob.ObfuscatedName("bl.d")
   private class341 field2153;

   @deob.ObfuscatedName("bl.n(Lyw;)V")
   public void method4167(class983 arg0) {
      this.field2153 = arg0.method16627(24, (byte[])null, 196584, true);
      this.field2156 = new class340(this.field2153, 5126, 2, 0);
      this.field2154 = new class340(this.field2153, 5126, 3, 8);
      this.field2162 = new class340(this.field2153, 5121, 4, 20);
   }

   @deob.ObfuscatedName("bl.k(Lyw;Ldf;)V")
   public void method4166(class983 arg0, class391 arg1) {
      if (arg0.field10269 != null) {
         this.method4168(arg0);
         float var3 = arg0.field10269.field5413[2];
         float var4 = arg0.field10269.field5413[6];
         float var5 = arg0.field10269.field5413[10];
         float var6 = arg0.field10269.field5413[14];

         try {
            int var7 = 0;
            int var8 = Integer.MAX_VALUE;
            int var9 = 0;
            class67 var10 = arg1.field2886.field8557;

            for(class67 var11 = var10.field489; var10 != var11; var11 = var11.field489) {
               class194 var12 = (class194)var11;
               int var13 = (int)((float)(var12.field1244 >> 12) * var5 + (float)(var12.field1246 >> 12) * var3 + (float)(var12.field1245 >> 12) * var4 + var6);
               if (var13 > var9) {
                  var9 = var13;
               }

               if (var13 < var8) {
                  var8 = var13;
               }

               this.field2155[var7++] = var13;
            }

            int var14 = var9 - var8;
            int var15;
            if (var14 + 2 > 1600) {
               var15 = 1 + class887.method5009(var14) - this.field2160;
               var14 = (var14 >> var15) + 2;
            } else {
               var15 = 0;
               var14 += 2;
            }

            class67 var16 = var10.field489;
            int var17 = 0;
            int var18 = -2;
            boolean var19 = true;
            boolean var20 = true;

            while(var10 != var16) {
               this.field2167 = 0;

               for(int var21 = 0; var21 < var14; ++var21) {
                  this.field2151[var21] = 0;
               }

               for(int var22 = 0; var22 < 64; ++var22) {
                  this.field2159[var22] = 0;
               }

               while(var10 != var16) {
                  class194 var23 = (class194)var16;
                  if (var20) {
                     var18 = var23.field1239;
                     var19 = var23.field1242;
                     var20 = false;
                  }

                  if (var17 > 0 && (var23.field1239 != var18 || var23.field1242 != var19)) {
                     var20 = true;
                     break;
                  }

                  int var24 = this.field2155[var17++] - var8 >> var15;
                  if (var24 < 1600) {
                     if (this.field2151[var24] < 64) {
                        this.field2165[var24][this.field2151[var24]++] = var23;
                     } else {
                        label91: {
                           if (this.field2151[var24] == 64) {
                              if (this.field2167 == 64) {
                                 break label91;
                              }

                              this.field2151[var24] += 1 + this.field2167++;
                           }

                           this.field2166[this.field2151[var24] - 64 - 1][this.field2159[this.field2151[var24] - 64 - 1]++] = var23;
                        }
                     }
                  }

                  var16 = var16.field489;
               }

               if (var18 >= 0) {
                  arg0.method16617(var18);
               } else {
                  arg0.method16617(-1);
               }

               if (var19 && Statics.field2168 != arg0.field10330) {
                  arg0.method7547(Statics.field2168);
               } else if (arg0.field10330 != 1.0F) {
                  arg0.method7547(1.0F);
               }

               this.method4175(arg0, var14);
            }
         } catch (Exception var26) {
         }

         this.method4169(arg0);
      }
   }

   @deob.ObfuscatedName("bl.d(Lyw;I)V")
   private void method4175(class983 arg0, int arg1) {
      OpenGL.glGetFloatv(2982, this.field2161, 0);
      float var3 = this.field2161[0];
      float var4 = this.field2161[4];
      float var5 = this.field2161[8];
      float var6 = this.field2161[1];
      float var7 = this.field2161[5];
      float var8 = this.field2161[9];
      float var9 = var3 + var6;
      float var10 = var4 + var7;
      float var11 = var5 + var8;
      float var12 = var3 - var6;
      float var13 = var4 - var7;
      float var14 = var5 - var8;
      float var15 = var6 - var3;
      float var16 = var7 - var4;
      float var17 = var8 - var5;
      this.field2152.field935 = 0;
      if (arg0.field10274) {
         for(int var18 = arg1 - 1; var18 >= 0; --var18) {
            int var19 = this.field2151[var18] > 64 ? 64 : this.field2151[var18];
            if (var19 > 0) {
               for(int var20 = var19 - 1; var20 >= 0; --var20) {
                  class194 var21 = this.field2165[var18][var20];
                  int var22 = var21.field1241;
                  byte var23 = (byte)(var22 >> 16);
                  byte var24 = (byte)(var22 >> 8);
                  byte var25 = (byte)var22;
                  byte var26 = (byte)(var22 >>> 24);
                  float var27 = (float)(var21.field1246 >> 12);
                  float var28 = (float)(var21.field1245 >> 12);
                  float var29 = (float)(var21.field1244 >> 12);
                  int var30 = var21.field1247 >> 12;
                  this.field2152.method3569(0.0F);
                  this.field2152.method3569(0.0F);
                  this.field2152.method3569((float)(-var30) * var9 + var27);
                  this.field2152.method3569((float)(-var30) * var10 + var28);
                  this.field2152.method3569((float)(-var30) * var11 + var29);
                  this.field2152.method1568(var23);
                  this.field2152.method1568(var24);
                  this.field2152.method1568(var25);
                  this.field2152.method1568(var26);
                  this.field2152.method3569(0.0F);
                  this.field2152.method3569(1.0F);
                  this.field2152.method3569((float)var30 * var15 + var27);
                  this.field2152.method3569((float)var30 * var16 + var28);
                  this.field2152.method3569((float)var30 * var17 + var29);
                  this.field2152.method1568(var23);
                  this.field2152.method1568(var24);
                  this.field2152.method1568(var25);
                  this.field2152.method1568(var26);
                  this.field2152.method3569(1.0F);
                  this.field2152.method3569(1.0F);
                  this.field2152.method3569((float)var30 * var9 + var27);
                  this.field2152.method3569((float)var30 * var10 + var28);
                  this.field2152.method3569((float)var30 * var11 + var29);
                  this.field2152.method1568(var23);
                  this.field2152.method1568(var24);
                  this.field2152.method1568(var25);
                  this.field2152.method1568(var26);
                  this.field2152.method3569(1.0F);
                  this.field2152.method3569(0.0F);
                  this.field2152.method3569((float)var30 * var12 + var27);
                  this.field2152.method3569((float)var30 * var13 + var28);
                  this.field2152.method3569((float)var30 * var14 + var29);
                  this.field2152.method1568(var23);
                  this.field2152.method1568(var24);
                  this.field2152.method1568(var25);
                  this.field2152.method1568(var26);
               }

               if (this.field2151[var18] > 64) {
                  int var31 = this.field2151[var18] - 64 - 1;

                  for(int var32 = this.field2159[var31] - 1; var32 >= 0; --var32) {
                     class194 var33 = this.field2166[var31][var32];
                     int var34 = var33.field1241;
                     byte var35 = (byte)(var34 >> 16);
                     byte var36 = (byte)(var34 >> 8);
                     byte var37 = (byte)var34;
                     byte var38 = (byte)(var34 >>> 24);
                     float var39 = (float)(var33.field1246 >> 12);
                     float var40 = (float)(var33.field1245 >> 12);
                     float var41 = (float)(var33.field1244 >> 12);
                     int var42 = var33.field1247 >> 12;
                     this.field2152.method3569(0.0F);
                     this.field2152.method3569(0.0F);
                     this.field2152.method3569((float)(-var42) * var9 + var39);
                     this.field2152.method3569((float)(-var42) * var10 + var40);
                     this.field2152.method3569((float)(-var42) * var11 + var41);
                     this.field2152.method1568(var35);
                     this.field2152.method1568(var36);
                     this.field2152.method1568(var37);
                     this.field2152.method1568(var38);
                     this.field2152.method3569(0.0F);
                     this.field2152.method3569(1.0F);
                     this.field2152.method3569((float)var42 * var15 + var39);
                     this.field2152.method3569((float)var42 * var16 + var40);
                     this.field2152.method3569((float)var42 * var17 + var41);
                     this.field2152.method1568(var35);
                     this.field2152.method1568(var36);
                     this.field2152.method1568(var37);
                     this.field2152.method1568(var38);
                     this.field2152.method3569(1.0F);
                     this.field2152.method3569(1.0F);
                     this.field2152.method3569((float)var42 * var9 + var39);
                     this.field2152.method3569((float)var42 * var10 + var40);
                     this.field2152.method3569((float)var42 * var11 + var41);
                     this.field2152.method1568(var35);
                     this.field2152.method1568(var36);
                     this.field2152.method1568(var37);
                     this.field2152.method1568(var38);
                     this.field2152.method3569(1.0F);
                     this.field2152.method3569(0.0F);
                     this.field2152.method3569((float)var42 * var12 + var39);
                     this.field2152.method3569((float)var42 * var13 + var40);
                     this.field2152.method3569((float)var42 * var14 + var41);
                     this.field2152.method1568(var35);
                     this.field2152.method1568(var36);
                     this.field2152.method1568(var37);
                     this.field2152.method1568(var38);
                  }
               }
            }
         }
      } else {
         for(int var43 = arg1 - 1; var43 >= 0; --var43) {
            int var44 = this.field2151[var43] > 64 ? 64 : this.field2151[var43];
            if (var44 > 0) {
               for(int var45 = var44 - 1; var45 >= 0; --var45) {
                  class194 var46 = this.field2165[var43][var45];
                  int var47 = var46.field1241;
                  byte var48 = (byte)(var47 >> 16);
                  byte var49 = (byte)(var47 >> 8);
                  byte var50 = (byte)var47;
                  byte var51 = (byte)(var47 >>> 24);
                  float var52 = (float)(var46.field1246 >> 12);
                  float var53 = (float)(var46.field1245 >> 12);
                  float var54 = (float)(var46.field1244 >> 12);
                  int var55 = var46.field1247 >> 12;
                  this.field2152.method3570(0.0F);
                  this.field2152.method3570(0.0F);
                  this.field2152.method3570((float)(-var55) * var9 + var52);
                  this.field2152.method3570((float)(-var55) * var10 + var53);
                  this.field2152.method3570((float)(-var55) * var11 + var54);
                  this.field2152.method1568(var48);
                  this.field2152.method1568(var49);
                  this.field2152.method1568(var50);
                  this.field2152.method1568(var51);
                  this.field2152.method3570(0.0F);
                  this.field2152.method3570(1.0F);
                  this.field2152.method3570((float)var55 * var15 + var52);
                  this.field2152.method3570((float)var55 * var16 + var53);
                  this.field2152.method3570((float)var55 * var17 + var54);
                  this.field2152.method1568(var48);
                  this.field2152.method1568(var49);
                  this.field2152.method1568(var50);
                  this.field2152.method1568(var51);
                  this.field2152.method3570(1.0F);
                  this.field2152.method3570(1.0F);
                  this.field2152.method3570((float)var55 * var9 + var52);
                  this.field2152.method3570((float)var55 * var10 + var53);
                  this.field2152.method3570((float)var55 * var11 + var54);
                  this.field2152.method1568(var48);
                  this.field2152.method1568(var49);
                  this.field2152.method1568(var50);
                  this.field2152.method1568(var51);
                  this.field2152.method3570(1.0F);
                  this.field2152.method3570(0.0F);
                  this.field2152.method3570((float)var55 * var12 + var52);
                  this.field2152.method3570((float)var55 * var13 + var53);
                  this.field2152.method3570((float)var55 * var14 + var54);
                  this.field2152.method1568(var48);
                  this.field2152.method1568(var49);
                  this.field2152.method1568(var50);
                  this.field2152.method1568(var51);
               }

               if (this.field2151[var43] > 64) {
                  int var56 = this.field2151[var43] - 64 - 1;

                  for(int var57 = this.field2159[var56] - 1; var57 >= 0; --var57) {
                     class194 var58 = this.field2166[var56][var57];
                     int var59 = var58.field1241;
                     byte var60 = (byte)(var59 >> 16);
                     byte var61 = (byte)(var59 >> 8);
                     byte var62 = (byte)var59;
                     byte var63 = (byte)(var59 >>> 24);
                     float var64 = (float)(var58.field1246 >> 12);
                     float var65 = (float)(var58.field1245 >> 12);
                     float var66 = (float)(var58.field1244 >> 12);
                     int var67 = var58.field1247 >> 12;
                     this.field2152.method3570(0.0F);
                     this.field2152.method3570(0.0F);
                     this.field2152.method3570((float)(-var67) * var9 + var64);
                     this.field2152.method3570((float)(-var67) * var10 + var65);
                     this.field2152.method3570((float)(-var67) * var11 + var66);
                     this.field2152.method1568(var60);
                     this.field2152.method1568(var61);
                     this.field2152.method1568(var62);
                     this.field2152.method1568(var63);
                     this.field2152.method3570(0.0F);
                     this.field2152.method3570(1.0F);
                     this.field2152.method3570((float)var67 * var15 + var64);
                     this.field2152.method3570((float)var67 * var16 + var65);
                     this.field2152.method3570((float)var67 * var17 + var66);
                     this.field2152.method1568(var60);
                     this.field2152.method1568(var61);
                     this.field2152.method1568(var62);
                     this.field2152.method1568(var63);
                     this.field2152.method3570(1.0F);
                     this.field2152.method3570(1.0F);
                     this.field2152.method3570((float)var67 * var9 + var64);
                     this.field2152.method3570((float)var67 * var10 + var65);
                     this.field2152.method3570((float)var67 * var11 + var66);
                     this.field2152.method1568(var60);
                     this.field2152.method1568(var61);
                     this.field2152.method1568(var62);
                     this.field2152.method1568(var63);
                     this.field2152.method3570(1.0F);
                     this.field2152.method3570(0.0F);
                     this.field2152.method3570((float)var67 * var12 + var64);
                     this.field2152.method3570((float)var67 * var13 + var65);
                     this.field2152.method3570((float)var67 * var14 + var66);
                     this.field2152.method1568(var60);
                     this.field2152.method1568(var61);
                     this.field2152.method1568(var62);
                     this.field2152.method1568(var63);
                  }
               }
            }
         }
      }

      if (this.field2152.field935 != 0) {
         this.field2153.method4156(24, this.field2152.field931, this.field2152.field935);
         arg0.method16631(this.field2154, (class340)null, this.field2162, this.field2156);
         arg0.method16632(7, 0, this.field2152.field935 / 24);
      }

   }

   @deob.ObfuscatedName("bl.b(Lyw;)V")
   private void method4168(class983 arg0) {
      Statics.field2168 = arg0.field10330;
      arg0.method16636();
      OpenGL.glDisable(16384);
      OpenGL.glDisable(16385);
      arg0.method16714(false);
      OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
   }

   @deob.ObfuscatedName("bl.r(Lyw;)V")
   private void method4169(class983 arg0) {
      arg0.method16714(true);
      OpenGL.glEnable(16384);
      OpenGL.glEnable(16385);
      if (Statics.field2168 != arg0.field10330) {
         arg0.method7547(Statics.field2168);
      }

   }
}
