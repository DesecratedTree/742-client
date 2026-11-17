import jaggl.OpenGL;

@deob.ObfuscatedName("yy")
public class class985 extends class383 {
   @deob.ObfuscatedName("yy.b")
   private int field10444 = 0;
   @deob.ObfuscatedName("yy.r")
   private boolean field10448 = false;
   @deob.ObfuscatedName("yy.p")
   private int field10445 = 0;
   @deob.ObfuscatedName("yy.o")
   private int field10447 = 0;
   @deob.ObfuscatedName("yy.a")
   private int field10441 = 0;
   @deob.ObfuscatedName("yy.x")
   private int field10449 = 0;
   @deob.ObfuscatedName("yy.k")
   private final class983 field10446;
   @deob.ObfuscatedName("yy.n")
   private final class186 field10442;
   @deob.ObfuscatedName("yy.d")
   private class186 field10443;

   public class985(class983 arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field10446 = arg0;
      this.field10442 = class186.method2446(arg0, arg1, arg2, arg3, arg4);
   }

   public class985(class983 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      this.field10446 = arg0;
      this.field10442 = class186.method2444(arg0, arg1, arg2, false, arg3, arg5, arg4);
   }

   public class985(class983 arg0, int arg1, int arg2, boolean arg3) {
      this.field10446 = arg0;
      this.field10442 = class186.method2452(arg0, arg3 ? class372.field2736 : class372.field2733, class405.field3052, arg1, arg2);
   }

   @deob.ObfuscatedName("yy.l(IIII)V")
   public void method5214(int arg0, int arg1, int arg2, int arg3) {
      this.field10447 = arg0;
      this.field10445 = arg1;
      this.field10449 = arg2;
      this.field10441 = arg3;
      this.field10448 = this.field10447 != 0 || this.field10445 != 0 || this.field10449 != 0 || this.field10441 != 0;
   }

   @deob.ObfuscatedName("yy.u([I)V")
   public void method5215(int[] arg0) {
      arg0[0] = this.field10447;
      arg0[1] = this.field10445;
      arg0[2] = this.field10449;
      arg0[3] = this.field10441;
   }

   @deob.ObfuscatedName("yy.v()I")
   public int method5216() {
      return this.field10442.field1203;
   }

   @deob.ObfuscatedName("yy.g()I")
   public int method5259() {
      return this.field10442.field1203 + this.field10447 + this.field10449;
   }

   @deob.ObfuscatedName("yy.h()I")
   public int method5218() {
      return this.field10442.field1204;
   }

   @deob.ObfuscatedName("yy.m()I")
   public int method5213() {
      return this.field10442.field1204 + this.field10445 + this.field10441;
   }

   @deob.ObfuscatedName("yy.i()Ldm;")
   public class398 method2391() {
      return this.field10442.method15995(0);
   }

   @deob.ObfuscatedName("yy.t(IIIIII)V")
   public void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (this.field10446.field10366) {
         int[] var7 = this.field10446.method2609(arg4, arg5, arg2, arg3);
         if (var7 != null) {
            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] |= -16777216;
            }

            this.method16871(arg0, arg1, arg2, arg3, var7, 0, arg2);
         }
      } else {
         this.field10442.method15982(arg0, arg1, arg2, arg3, arg4, arg5);
      }

   }

   @deob.ObfuscatedName("yy.c(III)V")
   public void method2390(int arg0, int arg1, int arg2) {
      OpenGL.glPixelTransferf(3348, 0.5F);
      OpenGL.glPixelTransferf(3349, 0.499F);
      OpenGL.glPixelTransferf(3352, 0.5F);
      OpenGL.glPixelTransferf(3353, 0.499F);
      OpenGL.glPixelTransferf(3354, 0.5F);
      OpenGL.glPixelTransferf(3355, 0.499F);
      this.field10443 = class186.method2446(this.field10446, arg0, arg1, this.field10442.field1203, this.field10442.field1204);
      this.field10444 = arg2;
      OpenGL.glPixelTransferf(3348, 1.0F);
      OpenGL.glPixelTransferf(3349, 0.0F);
      OpenGL.glPixelTransferf(3352, 1.0F);
      OpenGL.glPixelTransferf(3353, 0.0F);
      OpenGL.glPixelTransferf(3354, 1.0F);
      OpenGL.glPixelTransferf(3355, 0.0F);
   }

   @deob.ObfuscatedName("yy.n(IIII[III)V")
   private void method16871(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      this.field10442.method15985(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
   }

   @deob.ObfuscatedName("yy.k(I)V")
   private void method16873(int arg0) {
      this.field10446.method16638(1);
      this.field10446.method16639(this.field10442);
      this.field10446.method16642(this.field10446.method16641(arg0), 7681);
      this.field10446.method16643(1, 34167, 768);
      this.field10446.method16616(0, 34168, 770);
      this.field10446.method16638(0);
      this.field10446.method16639(this.field10443);
      this.field10446.method16642(34479, 7681);
      this.field10446.method16643(1, 34166, 768);
      if (this.field10444 == 0) {
         this.field10446.method16711(1.0F, 0.5F, 0.5F, 0.0F);
      } else if (this.field10444 == 1) {
         this.field10446.method16711(0.5F, 1.0F, 0.5F, 0.0F);
      } else if (this.field10444 == 2) {
         this.field10446.method16711(0.5F, 0.5F, 1.0F, 0.0F);
      } else if (this.field10444 == 3) {
         this.field10446.method16711(128.5F, 128.5F, 128.5F, 0.0F);
      }

   }

   @deob.ObfuscatedName("yy.d()V")
   private void method16877() {
      this.field10446.method16638(1);
      this.field10446.method16639((class354)null);
      this.field10446.method16642(8448, 8448);
      this.field10446.method16643(1, 34168, 768);
      this.field10446.method16616(0, 5890, 770);
      this.field10446.method16638(0);
      this.field10446.method16643(1, 34168, 768);
   }

   @deob.ObfuscatedName("yy.q(IIIII)V")
   public void method2388(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field10442.method2448(false);
      this.field10446.method16634();
      this.field10446.method16652(arg4);
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      int var6 = this.field10447 + arg0;
      int var7 = this.field10445 + arg1;
      if (this.field10443 == null) {
         this.field10446.method16639(this.field10442);
         this.field10446.method16640(arg2);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
         OpenGL.glVertex2i(var6, var7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var6, this.field10442.field1204 + var7);
         OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
         OpenGL.glVertex2i(this.field10442.field1203 + var6, this.field10442.field1204 + var7);
         OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
         OpenGL.glVertex2i(this.field10442.field1203 + var6, var7);
         OpenGL.glEnd();
      } else {
         this.method16873(arg2);
         this.field10443.method2448(false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10442.field1205);
         OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
         OpenGL.glVertex2i(var6, var7);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var6, this.field10442.field1204 + var7);
         OpenGL.glMultiTexCoord2f(33985, this.field10442.field1206, 0.0F);
         OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
         OpenGL.glVertex2i(this.field10442.field1203 + var6, this.field10442.field1204 + var7);
         OpenGL.glMultiTexCoord2f(33985, this.field10442.field1206, this.field10442.field1205);
         OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
         OpenGL.glVertex2i(this.field10442.field1203 + var6, var7);
         OpenGL.glEnd();
         this.method16877();
      }

   }

   @deob.ObfuscatedName("yy.f(IILta;II)V")
   public void method2393(int arg0, int arg1, class826 arg2, int arg3, int arg4) {
      class980 var6 = (class980)arg2;
      class186 var7 = var6.field10131;
      this.field10442.method2448(false);
      this.field10446.method16634();
      this.field10446.method16639(this.field10442);
      this.field10446.method16640(1);
      this.field10446.method16638(1);
      this.field10446.method16639(var7);
      this.field10446.method16642(7681, 8448);
      this.field10446.method16643(0, 34168, 768);
      this.field10446.method16652(1);
      int var8 = this.field10447 + arg0;
      int var9 = this.field10445 + arg1;
      int var10 = this.field10442.field1203 + var8;
      int var11 = this.field10442.field1204 + var9;
      float var12 = var7.field1206 / (float)var7.field1203;
      float var13 = var7.field1205 / (float)var7.field1204;
      float var14 = (float)(var8 - arg3) * var12;
      float var15 = (float)(var10 - arg3) * var12;
      float var16 = var7.field1205 - (float)(var9 - arg4) * var13;
      float var17 = var7.field1205 - (float)(var11 - arg4) * var13;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field10442.field1205);
      OpenGL.glMultiTexCoord2f(33985, var14, var16);
      OpenGL.glVertex2i(var8, var9);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, var14, var17);
      OpenGL.glVertex2i(var8, this.field10442.field1204 + var9);
      OpenGL.glMultiTexCoord2f(33984, this.field10442.field1206, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, var15, var17);
      OpenGL.glVertex2i(this.field10442.field1203 + var8, this.field10442.field1204 + var9);
      OpenGL.glMultiTexCoord2f(33984, this.field10442.field1206, this.field10442.field1205);
      OpenGL.glMultiTexCoord2f(33985, var15, var16);
      OpenGL.glVertex2i(this.field10442.field1203 + var8, var9);
      OpenGL.glEnd();
      this.field10446.method16643(0, 5890, 768);
      this.field10446.method16640(0);
      this.field10446.method16639((class354)null);
      this.field10446.method16638(0);
   }

   @deob.ObfuscatedName("yy.av(IIIIIIII)V")
   protected void method2394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.field10442.method2448((arg7 & 1) != 0);
      this.field10446.method16634();
      this.field10446.method16652(arg6);
      OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
      if (this.field10448) {
         float var9 = (float)arg2 / (float)this.method5259();
         float var10 = (float)arg3 / (float)this.method5213();
         float var11 = (float)this.field10447 * var9 + (float)arg0;
         float var12 = (float)this.field10445 * var10 + (float)arg1;
         float var13 = (float)this.field10442.field1203 * var9 + var11;
         float var14 = (float)this.field10442.field1204 * var10 + var12;
         if (this.field10443 == null) {
            this.field10446.method16639(this.field10442);
            this.field10446.method16640(arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
         } else {
            this.method16873(arg4);
            this.field10443.method2448(true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10442.field1205);
            OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glMultiTexCoord2f(33985, this.field10442.field1206, 0.0F);
            OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glMultiTexCoord2f(33985, this.field10442.field1206, this.field10442.field1205);
            OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
            this.method16877();
         }
      } else if (this.field10443 == null) {
         this.field10446.method16639(this.field10442);
         this.field10446.method16640(arg4);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
         OpenGL.glVertex2i(arg0, arg1);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(arg0, arg1 + arg3);
         OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
         OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
         OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
         OpenGL.glVertex2i(arg0 + arg2, arg1);
         OpenGL.glEnd();
      } else {
         this.method16873(arg4);
         this.field10443.method2448(true);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field10442.field1205);
         OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
         OpenGL.glVertex2i(arg0, arg1);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(arg0, arg1 + arg3);
         OpenGL.glMultiTexCoord2f(33985, this.field10442.field1206, 0.0F);
         OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
         OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
         OpenGL.glMultiTexCoord2f(33985, this.field10442.field1206, this.field10442.field1205);
         OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
         OpenGL.glVertex2i(arg0 + arg2, arg1);
         OpenGL.glEnd();
         this.method16877();
      }

   }

   @deob.ObfuscatedName("yy.af(IIIIIII)V")
   public void method5219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = arg0 + arg2;
      int var9 = arg1 + arg3;
      this.field10442.method2448(false);
      this.field10446.method16634();
      this.field10446.method16639(this.field10442);
      this.field10446.method16652(arg6);
      this.field10446.method16640(arg4);
      OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
      if (this.field10442.field1208 && !this.field10448) {
         float var10 = (float)arg3 * this.field10442.field1205 / (float)this.field10442.field1204;
         float var11 = (float)arg2 * this.field10442.field1206 / (float)this.field10442.field1203;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var10);
         OpenGL.glVertex2i(arg0, arg1);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(arg0, var9);
         OpenGL.glTexCoord2f(var11, 0.0F);
         OpenGL.glVertex2i(var8, var9);
         OpenGL.glTexCoord2f(var11, var10);
         OpenGL.glVertex2i(var8, arg1);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)this.field10447, (float)this.field10445, 0.0F);
         int var12 = this.method5259();
         int var13 = this.method5213();
         int var14 = this.field10442.field1204 + arg1;
         OpenGL.glBegin(7);
         int var15 = arg1;

         while(var14 <= var9) {
            int var16 = this.field10442.field1203 + arg0;
            int var17 = arg0;

            while(var16 <= var8) {
               OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
               OpenGL.glVertex2i(var17, var15);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var17, var14);
               OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
               OpenGL.glVertex2i(var16, var14);
               OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
               OpenGL.glVertex2i(var16, var15);
               var16 += var12;
               var17 += var12;
            }

            if (var17 < var8) {
               float var18 = (float)(var8 - var17) * this.field10442.field1206 / (float)this.field10442.field1203;
               OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
               OpenGL.glVertex2i(var17, var15);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var17, var14);
               OpenGL.glTexCoord2f(var18, 0.0F);
               OpenGL.glVertex2i(var8, var14);
               OpenGL.glTexCoord2f(var18, this.field10442.field1205);
               OpenGL.glVertex2i(var8, var15);
            }

            var15 += var13;
            var14 += var13;
         }

         if (var15 < var9) {
            float var19 = (float)(this.field10442.field1204 - (var9 - var15)) * this.field10442.field1205 / (float)this.field10442.field1204;
            int var20 = this.field10442.field1203 + arg0;
            int var21 = arg0;

            while(var20 <= var8) {
               OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
               OpenGL.glVertex2i(var21, var15);
               OpenGL.glTexCoord2f(0.0F, var19);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(this.field10442.field1206, var19);
               OpenGL.glVertex2i(var20, var9);
               OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
               OpenGL.glVertex2i(var20, var15);
               var20 += var12;
               var21 += var12;
            }

            if (var21 < var8) {
               float var22 = (float)(var8 - var21) * this.field10442.field1206 / (float)this.field10442.field1203;
               OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
               OpenGL.glVertex2i(var21, var15);
               OpenGL.glTexCoord2f(0.0F, var19);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(var22, var19);
               OpenGL.glVertex2i(var8, var9);
               OpenGL.glTexCoord2f(var22, this.field10442.field1205);
               OpenGL.glVertex2i(var8, var15);
            }
         }

         OpenGL.glEnd();
         OpenGL.glPopMatrix();
      }

   }

   @deob.ObfuscatedName("yy.ak(FFFFFFIIII)V")
   protected void method5231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field10448) {
         float var11 = (float)this.method5259();
         float var12 = (float)this.method5213();
         float var13 = (arg2 - arg0) / var11;
         float var14 = (arg3 - arg1) / var11;
         float var15 = (arg4 - arg0) / var12;
         float var16 = (arg5 - arg1) / var12;
         float var17 = (float)this.field10445 * var15;
         float var18 = (float)this.field10445 * var16;
         float var19 = (float)this.field10447 * var13;
         float var20 = (float)this.field10447 * var14;
         float var21 = (float)this.field10449 * -var13;
         float var22 = (float)this.field10449 * -var14;
         float var23 = (float)this.field10441 * -var15;
         float var24 = (float)this.field10441 * -var16;
         arg0 = arg0 + var19 + var17;
         arg1 = arg1 + var20 + var18;
         arg2 = arg2 + var21 + var17;
         arg3 = arg3 + var22 + var18;
         arg4 = arg4 + var19 + var23;
         arg5 = arg5 + var20 + var24;
      }

      float var25 = arg2 - arg0 + arg4;
      float var26 = arg5 - arg1 + arg3;
      this.field10442.method2448((arg9 & 1) != 0);
      this.field10446.method16634();
      this.field10446.method16639(this.field10442);
      this.field10446.method16652(arg8);
      this.field10446.method16640(arg6);
      OpenGL.glColor4ub((byte)(arg7 >> 16), (byte)(arg7 >> 8), (byte)arg7, (byte)(arg7 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, this.field10442.field1205);
      OpenGL.glVertex2f(arg0, arg1);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(arg4, arg5);
      OpenGL.glTexCoord2f(this.field10442.field1206, 0.0F);
      OpenGL.glVertex2f(var25, var26);
      OpenGL.glTexCoord2f(this.field10442.field1206, this.field10442.field1205);
      OpenGL.glVertex2f(arg2, arg3);
      OpenGL.glEnd();
   }

   @deob.ObfuscatedName("yy.ab(FFFFFFILta;II)V")
   public void method5232(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class826 arg7, int arg8, int arg9) {
      class186 var11 = ((class980)arg7).field10131;
      if (this.field10448) {
         float var12 = (float)this.method5259();
         float var13 = (float)this.method5213();
         float var14 = (arg2 - arg0) / var12;
         float var15 = (arg3 - arg1) / var12;
         float var16 = (arg4 - arg0) / var13;
         float var17 = (arg5 - arg1) / var13;
         float var18 = (float)this.field10445 * var16;
         float var19 = (float)this.field10445 * var17;
         float var20 = (float)this.field10447 * var14;
         float var21 = (float)this.field10447 * var15;
         float var22 = (float)this.field10449 * -var14;
         float var23 = (float)this.field10449 * -var15;
         float var24 = (float)this.field10441 * -var16;
         float var25 = (float)this.field10441 * -var17;
         arg0 = arg0 + var20 + var18;
         arg1 = arg1 + var21 + var19;
         arg2 = arg2 + var22 + var18;
         arg3 = arg3 + var23 + var19;
         arg4 = arg4 + var20 + var24;
         arg5 = arg5 + var21 + var25;
      }

      float var26 = arg2 - arg0 + arg4;
      float var27 = arg5 - arg1 + arg3;
      this.field10442.method2448((arg6 & 1) != 0);
      this.field10446.method16634();
      this.field10446.method16639(this.field10442);
      this.field10446.method16640(1);
      this.field10446.method16638(1);
      this.field10446.method16639(var11);
      this.field10446.method16642(7681, 8448);
      this.field10446.method16643(0, 34168, 768);
      this.field10446.method16652(1);
      float var28 = var11.field1206 / (float)var11.field1203;
      float var29 = var11.field1205 / (float)var11.field1204;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field10442.field1205);
      OpenGL.glMultiTexCoord2f(33985, (arg0 - (float)arg8) * var28, var11.field1205 - (arg1 - (float)arg9) * var29);
      OpenGL.glVertex2f(arg0, arg1);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, (arg4 - (float)arg8) * var28, var11.field1205 - (arg5 - (float)arg9) * var29);
      OpenGL.glVertex2f(arg4, arg5);
      OpenGL.glMultiTexCoord2f(33984, this.field10442.field1206, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, (var26 - (float)arg8) * var28, var11.field1205 - (var27 - (float)arg9) * var29);
      OpenGL.glVertex2f(var26, var27);
      OpenGL.glMultiTexCoord2f(33984, this.field10442.field1206, this.field10442.field1205);
      OpenGL.glMultiTexCoord2f(33985, (arg2 - (float)arg8) * var28, var11.field1205 - (arg3 - (float)arg9) * var29);
      OpenGL.glVertex2f(arg2, arg3);
      OpenGL.glEnd();
      this.field10446.method16643(0, 5890, 768);
      this.field10446.method16640(0);
      this.field10446.method16639((class354)null);
      this.field10446.method16638(0);
   }
}
