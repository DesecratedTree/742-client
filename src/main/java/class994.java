import jaggl.OpenGL;

@deob.ObfuscatedName("zg")
public class class994 extends class609 {
   @deob.ObfuscatedName("zg.g")
   private final class983 field10560;
   @deob.ObfuscatedName("zg.h")
   private final class186 field10561;
   @deob.ObfuscatedName("zg.z")
   private final boolean field10563;
   @deob.ObfuscatedName("zg.e")
   private final class355 field10562;

   public class994(class983 arg0, class883 arg1, class998[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field10560 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class998 var7 = arg2[var6];
         if (var7.field10572 > var5) {
            var5 = var7.field10572;
         }

         if (var7.field10574 > var5) {
            var5 = var7.field10574;
         }
      }

      int var8 = var5 * 16;
      if (arg3) {
         byte[] var9 = new byte[var8 * var8];

         for(int var10 = 0; var10 < 256; ++var10) {
            class998 var11 = arg2[var10];
            int var12 = var11.field10572;
            int var13 = var11.field10574;
            int var14 = var10 % 16 * var5;
            int var15 = var10 / 16 * var5;
            int var16 = var8 * var15 + var14;
            int var17 = 0;
            if (var11.field10573 == null) {
               byte[] var18 = var11.field10579;

               for(int var19 = 0; var19 < var12; ++var19) {
                  for(int var20 = 0; var20 < var13; ++var20) {
                     var9[var16++] = (byte)(var18[var17++] == 0 ? 0 : -1);
                  }

                  var16 += var8 - var13;
               }
            } else {
               byte[] var21 = var11.field10573;

               for(int var22 = 0; var22 < var12; ++var22) {
                  for(int var23 = 0; var23 < var13; ++var23) {
                     var9[var16++] = var21[var17++];
                  }

                  var16 += var8 - var13;
               }
            }
         }

         this.field10561 = class186.method2453(arg0, class372.field2735, class405.field3052, var8, var8, false, var9, class372.field2735);
         this.field10563 = true;
      } else {
         int[] var24 = new int[var8 * var8];

         for(int var25 = 0; var25 < 256; ++var25) {
            class998 var26 = arg2[var25];
            int[] var27 = var26.field10578;
            byte[] var28 = var26.field10573;
            byte[] var29 = var26.field10579;
            int var30 = var26.field10572;
            int var31 = var26.field10574;
            int var32 = var25 % 16 * var5;
            int var33 = var25 / 16 * var5;
            int var34 = var8 * var33 + var32;
            int var35 = 0;
            if (var28 != null) {
               for(int var36 = 0; var36 < var30; ++var36) {
                  for(int var37 = 0; var37 < var31; ++var37) {
                     var24[var34++] = var28[var35] << 24 | var27[var29[var35] & 255];
                     ++var35;
                  }

                  var34 += var8 - var31;
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

                  var34 += var8 - var31;
               }
            }
         }

         this.field10561 = class186.method2444(arg0, var8, var8, false, var24, 0, 0);
         this.field10563 = false;
      }

      this.field10561.method2448(false);
      this.field10562 = new class355(arg0, 256);
      float var41 = this.field10561.field1206 / (float)this.field10561.field1203;
      float var42 = this.field10561.field1205 / (float)this.field10561.field1204;

      for(int var43 = 0; var43 < 256; ++var43) {
         class998 var44 = arg2[var43];
         int var45 = var44.field10572;
         int var46 = var44.field10574;
         int var47 = var44.field10576;
         int var48 = var44.field10575;
         float var49 = (float)(var43 % 16 * var5);
         float var50 = (float)(var43 / 16 * var5);
         float var51 = var41 * var49;
         float var52 = var42 * var50;
         float var53 = ((float)var46 + var49) * var41;
         float var54 = ((float)var45 + var50) * var42;
         this.field10562.method4307(var43);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var51, this.field10561.field1205 - var52);
         OpenGL.glVertex2i(var48, var47);
         OpenGL.glTexCoord2f(var51, this.field10561.field1205 - var54);
         OpenGL.glVertex2i(var48, var45 + var47);
         OpenGL.glTexCoord2f(var53, this.field10561.field1205 - var54);
         OpenGL.glVertex2i(var46 + var48, var45 + var47);
         OpenGL.glTexCoord2f(var53, this.field10561.field1205 - var52);
         OpenGL.glVertex2i(var46 + var48, var47);
         OpenGL.glEnd();
         this.field10562.method4303();
      }

   }

   @deob.ObfuscatedName("zg.UA(CIIIZ)V")
   protected void method5659(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field10560.method16635();
      this.field10560.method16639(this.field10561);
      if (!this.field10563 && !arg4) {
         this.field10560.method16642(7681, 7681);
      } else {
         this.field10560.method16642(7681, 8448);
         this.field10560.method16643(0, 34168, 768);
      }

      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field10562.method4305(arg0);
      OpenGL.glLoadIdentity();
      if (this.field10563 || arg4) {
         this.field10560.method16643(0, 5890, 768);
      }

   }

   @deob.ObfuscatedName("zg.m(CIIIZLta;II)V")
   protected void method5671(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7) {
      class980 var9 = (class980)arg5;
      class186 var10 = var9.field10131;
      this.field10560.method16635();
      this.field10560.method16639(this.field10561);
      if (!this.field10563 && !arg4) {
         this.field10560.method16642(7681, 7681);
      } else {
         this.field10560.method16642(7681, 8448);
         this.field10560.method16643(0, 34168, 768);
      }

      this.field10560.method16638(1);
      this.field10560.method16639(var10);
      this.field10560.method16642(7681, 8448);
      this.field10560.method16643(0, 34168, 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field1206 / (float)var10.field1203;
      float var12 = var10.field1205 / (float)var10.field1204;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-arg6) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-arg7) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glTranslatef((float)arg1, (float)arg2, 0.0F);
      this.field10562.method4305(arg0);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field10560.method16643(0, 5890, 768);
      this.field10560.method16642(8448, 8448);
      this.field10560.method16639((class354)null);
      this.field10560.method16638(0);
      if (this.field10563 || arg4) {
         this.field10560.method16643(0, 5890, 768);
      }

   }
}
