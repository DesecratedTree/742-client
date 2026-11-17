import java.nio.ByteBuffer;

@deob.ObfuscatedName("ha")
public class class494 {
   @deob.ObfuscatedName("ha.r")
   private final int field3974 = 64;
   @deob.ObfuscatedName("ha.p")
   private final int field3984 = 768;
   @deob.ObfuscatedName("ha.o")
   private final int field3976 = 1600;
   @deob.ObfuscatedName("ha.a")
   private final int field3977 = class887.method5009(1600);
   @deob.ObfuscatedName("ha.x")
   private final int field3972 = 64;
   @deob.ObfuscatedName("ha.s")
   private int[] field3978 = new int[8191];
   @deob.ObfuscatedName("ha.l")
   private int[] field3980 = new int[1600];
   @deob.ObfuscatedName("ha.u")
   private int[] field3981 = new int[64];
   @deob.ObfuscatedName("ha.v")
   private class194[][] field3982 = new class194[1600][64];
   @deob.ObfuscatedName("ha.g")
   private class194[][] field3983 = new class194[64][768];
   @deob.ObfuscatedName("ha.h")
   private int field3973 = 0;
   @deob.ObfuscatedName("ha.d")
   private class505 field3979;
   @deob.ObfuscatedName("ha.n")
   private class508 field3975;
   @deob.ObfuscatedName("ha.k")
   private class508 field3971;
   @deob.ObfuscatedName("ha.b")
   private class534 field3985;

   public class494(class979 arg0) {
      this.field3979 = arg0.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3988, class496.field3990}), new class509(class496.field3993)});
      this.field3975 = arg0.method2570(true);
      this.field3971 = arg0.method2570(false);
      this.field3971.method728(393168, 12);
      this.field3985 = arg0.method2569(false);
      this.field3985.method695(49146);
      ByteBuffer var2 = arg0.field9975;
      var2.clear();

      for(int var3 = 0; var3 < 8191; ++var3) {
         int var4 = var3 * 4;
         var2.putShort((short)var4);
         var2.putShort((short)(var4 + 1));
         var2.putShort((short)(var4 + 2));
         var2.putShort((short)(var4 + 2));
         var2.putShort((short)(var4 + 3));
         var2.putShort((short)var4);
      }

      this.field3985.method700(0, var2.position(), arg0.field9976);
      var2.clear();

      for(int var5 = 0; var5 < 8191; ++var5) {
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
      }

      this.field3971.method700(0, var2.position(), arg0.field9976);
   }

   @deob.ObfuscatedName("ha.n(Lys;)V")
   public void method7081(class979 arg0) {
      this.field3975.method728(786336, 24);
   }

   @deob.ObfuscatedName("ha.k()V")
   public void method7082() {
      this.field3975.method302();
   }

   @deob.ObfuscatedName("ha.d(Lys;Ldf;)V")
   public void method7083(class979 arg0, class391 arg1) {
      arg0.method7551(false);
      Statics.field3970 = arg0.field10050;
      float var3 = arg0.field10066.field5413[2];
      float var4 = arg0.field10066.field5413[6];
      float var5 = arg0.field10066.field5413[10];
      float var6 = arg0.field10066.field5413[14];
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

         this.field3978[var7++] = var13;
      }

      int var14 = var9 - var8;
      int var15;
      if (var14 + 2 > 1600) {
         var15 = 1 + class887.method5009(var14) - this.field3977;
         var14 = (var14 >> var15) + 2;
      } else {
         var15 = 0;
         var14 += 2;
      }

      arg0.method2624(this.field3985);
      class463 var16 = arg0.field9968;
      var16.method358(class597.field5414);
      var16.field3810.method8480();
      var16.field3813 = -1;
      this.method7091(arg0, var10, var14, var8, var15, var16);
      if (Statics.field3970 != arg0.field10050) {
         arg0.method7547(Statics.field3970);
      }

      arg0.method7551(true);
   }

   @deob.ObfuscatedName("ha.b(Lys;Lack;IIILfx;)V")
   private void method7091(class979 arg0, class67 arg1, int arg2, int arg3, int arg4, class463 arg5) {
      class67 var7 = arg1.field489;
      int var8 = 0;
      int var9 = -2;
      boolean var10 = true;
      boolean var11 = true;

      while(arg1 != var7) {
         this.field3973 = 0;

         for(int var12 = 0; var12 < arg2; ++var12) {
            this.field3980[var12] = 0;
         }

         for(int var13 = 0; var13 < 64; ++var13) {
            this.field3981[var13] = 0;
         }

         while(arg1 != var7) {
            class194 var14 = (class194)var7;
            if (var11) {
               var9 = var14.field1239;
               var10 = var14.field1242;
               var11 = false;
            }

            if (var8 > 0 && (var14.field1239 != var9 || var14.field1242 != var10)) {
               var11 = true;
               break;
            }

            this.method7090(this.field3978[var8++] - arg3 >> arg4, var14);
            var7 = var7.field489;
         }

         arg5.field3812 = var9 >= 0 ? arg0.field10067.method7115(var9) : null;
         if (var10 && Statics.field3970 != arg0.field10050) {
            arg0.method7547(Statics.field3970);
         } else if (arg0.field10050 != 1.0F) {
            arg0.method7547(1.0F);
         }

         this.method7085(arg0, arg2);
      }

   }

   @deob.ObfuscatedName("ha.r(ILahc;)V")
   private void method7090(int arg0, class194 arg1) {
      if (arg0 < 1600) {
         if (this.field3980[arg0] < 64) {
            this.field3982[arg0][this.field3980[arg0]++] = arg1;
         } else {
            if (this.field3980[arg0] == 64) {
               if (this.field3973 == 64) {
                  return;
               }

               this.field3980[arg0] += 1 + this.field3973++;
            }

            this.field3983[this.field3980[arg0] - 64 - 1][this.field3981[this.field3980[arg0] - 64 - 1]++] = arg1;
         }
      }

   }

   @deob.ObfuscatedName("ha.p(Lys;I)V")
   private void method7085(class979 arg0, int arg1) {
      int var3 = 0;
      class597 var4 = arg0.field10066;
      float var5 = var4.field5413[0];
      float var6 = var4.field5413[4];
      float var7 = var4.field5413[8];
      float var8 = var4.field5413[1];
      float var9 = var4.field5413[5];
      float var10 = var4.field5413[9];
      float var11 = var5 + var8;
      float var12 = var6 + var9;
      float var13 = var7 + var10;
      float var14 = var5 - var8;
      float var15 = var6 - var9;
      float var16 = var7 - var10;
      float var17 = var8 - var5;
      float var18 = var9 - var6;
      float var19 = var10 - var7;
      ByteBuffer var20 = arg0.field9975;
      var20.clear();

      for(int var21 = arg1 - 1; var21 >= 0; --var21) {
         int var22 = this.field3980[var21] > 64 ? 64 : this.field3980[var21];
         if (var22 > 0) {
            for(int var23 = var22 - 1; var23 >= 0; --var23) {
               class194 var24 = this.field3982[var21][var23];
               int var25 = var24.field1241;
               byte var26 = (byte)(var25 >> 16);
               byte var27 = (byte)(var25 >> 8);
               byte var28 = (byte)var25;
               byte var29 = (byte)(var25 >>> 24);
               if (arg0.field10108 == 0) {
                  byte var30 = var26;
                  var26 = var28;
                  var28 = var30;
               }

               float var31 = (float)(var24.field1246 >> 12);
               float var32 = (float)(var24.field1245 >> 12);
               float var33 = (float)(var24.field1244 >> 12);
               int var34 = var24.field1247 >> 12;
               var20.putFloat((float)(-var34) * var11 + var31);
               var20.putFloat((float)(-var34) * var12 + var32);
               var20.putFloat((float)(-var34) * var13 + var33);
               var20.put(var26);
               var20.put(var27);
               var20.put(var28);
               var20.put(var29);
               var20.putFloat(0.0F);
               var20.putFloat(0.0F);
               var20.putFloat((float)var34 * var17 + var31);
               var20.putFloat((float)var34 * var18 + var32);
               var20.putFloat((float)var34 * var19 + var33);
               var20.put(var26);
               var20.put(var27);
               var20.put(var28);
               var20.put(var29);
               var20.putFloat(0.0F);
               var20.putFloat(1.0F);
               var20.putFloat((float)var34 * var11 + var31);
               var20.putFloat((float)var34 * var12 + var32);
               var20.putFloat((float)var34 * var13 + var33);
               var20.put(var26);
               var20.put(var27);
               var20.put(var28);
               var20.put(var29);
               var20.putFloat(1.0F);
               var20.putFloat(1.0F);
               var20.putFloat((float)var34 * var14 + var31);
               var20.putFloat((float)var34 * var15 + var32);
               var20.putFloat((float)var34 * var16 + var33);
               var20.put(var26);
               var20.put(var27);
               var20.put(var28);
               var20.put(var29);
               var20.putFloat(1.0F);
               var20.putFloat(0.0F);
               ++var3;
            }

            if (this.field3980[var21] > 64) {
               int var35 = this.field3980[var21] - 64 - 1;

               for(int var36 = this.field3981[var35] - 1; var36 >= 0; --var36) {
                  class194 var37 = this.field3983[var35][var36];
                  int var38 = var37.field1241;
                  byte var39 = (byte)(var38 >> 16);
                  byte var40 = (byte)(var38 >> 8);
                  byte var41 = (byte)var38;
                  byte var42 = (byte)(var38 >>> 24);
                  if (arg0.field10108 == 0) {
                     byte var43 = var39;
                     var39 = var41;
                     var41 = var43;
                  }

                  float var44 = (float)(var37.field1246 >> 12);
                  float var45 = (float)(var37.field1245 >> 12);
                  float var46 = (float)(var37.field1244 >> 12);
                  int var47 = var37.field1247 >> 12;
                  var20.putFloat((float)(-var47) * var11 + var44);
                  var20.putFloat((float)(-var47) * var12 + var45);
                  var20.putFloat((float)(-var47) * var13 + var46);
                  var20.put(var39);
                  var20.put(var40);
                  var20.put(var41);
                  var20.put(var42);
                  var20.putFloat(0.0F);
                  var20.putFloat(0.0F);
                  var20.putFloat((float)var47 * var17 + var44);
                  var20.putFloat((float)var47 * var18 + var45);
                  var20.putFloat((float)var47 * var19 + var46);
                  var20.put(var39);
                  var20.put(var40);
                  var20.put(var41);
                  var20.put(var42);
                  var20.putFloat(0.0F);
                  var20.putFloat(1.0F);
                  var20.putFloat((float)var47 * var11 + var44);
                  var20.putFloat((float)var47 * var12 + var45);
                  var20.putFloat((float)var47 * var13 + var46);
                  var20.put(var39);
                  var20.put(var40);
                  var20.put(var41);
                  var20.put(var42);
                  var20.putFloat(1.0F);
                  var20.putFloat(1.0F);
                  var20.putFloat((float)var47 * var14 + var44);
                  var20.putFloat((float)var47 * var15 + var45);
                  var20.putFloat((float)var47 * var16 + var46);
                  var20.put(var39);
                  var20.put(var40);
                  var20.put(var41);
                  var20.put(var42);
                  var20.putFloat(1.0F);
                  var20.putFloat(0.0F);
                  ++var3;
               }
            }
         }
      }

      this.field3975.method700(0, var20.position(), arg0.field9976);
      arg0.method2539(0, this.field3975);
      arg0.method2539(1, this.field3971);
      arg0.method2572(this.field3979);
      class463 var48 = arg0.field9968;
      var48.method356(var3);
   }
}
