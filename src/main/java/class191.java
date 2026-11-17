import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

@deob.ObfuscatedName("ah")
public class class191 {
   @deob.ObfuscatedName("ah.k")
   private static final int field1219 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();
   @deob.ObfuscatedName("ah.d")
   private static int[] field1221 = new int[256];
   @deob.ObfuscatedName("ah.b")
   private boolean field1222 = false;
   @deob.ObfuscatedName("ah.x")
   private int[] field1227 = new int[4];
   @deob.ObfuscatedName("ah.r")
   private class383[] field1223;
   @deob.ObfuscatedName("ah.p")
   private int[] field1226;
   @deob.ObfuscatedName("ah.a")
   private int field1220;
   @deob.ObfuscatedName("ah.o")
   private int field1225;

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field1221[var0] = var1;
      }

   }

   public class191(class772 arg0, int arg1, boolean arg2, Component arg3) {
      this.field1222 = false;
      this.field1223 = new class383[256];
      this.field1226 = new int[256];
      Font var5 = new Font("Helvetica", arg2 ? 1 : 0, arg1);
      FontMetrics var6 = arg3.getFontMetrics(var5);

      for(int var7 = 0; var7 < field1219; ++var7) {
         this.method2474(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
      }

      if (arg2 && this.field1222) {
         this.field1222 = false;
         Font var8 = new Font("Helvetica", 0, arg1);
         FontMetrics var9 = arg3.getFontMetrics(var8);

         for(int var10 = 0; var10 < field1219; ++var10) {
            this.method2474(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
         }

         if (!this.field1222) {
            this.field1222 = false;

            for(int var11 = 0; var11 < field1219; ++var11) {
               this.method2474(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
            }
         }
      }

   }

   @deob.ObfuscatedName("ah.n(Lra;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
   private void method2474(class772 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
      int var7 = arg2.charWidth(arg3);
      int var8 = var7;
      if (arg5) {
         try {
            if (arg3 == '/') {
               arg5 = false;
            }

            if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v' || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A' || arg3 == 'V' || arg3 == 'W') {
               ++var7;
            }
         } catch (Exception var25) {
         }
      }

      int var10 = arg2.getMaxAscent();
      int var11 = arg2.getMaxAscent() + arg2.getMaxDescent();
      int var12 = arg2.getHeight();
      Image var13 = Statics.field5796.createImage(var7, var11);
      Graphics var14 = var13.getGraphics();
      var14.setColor(Color.black);
      var14.fillRect(0, 0, var7, var11);
      var14.setColor(Color.white);
      var14.setFont(arg1);
      var14.drawString(arg3 + "", 0, var10);
      if (arg5) {
         var14.drawString(arg3 + "", 1, var10);
      }

      int[] var15 = new int[var7 * var11];
      PixelGrabber var16 = new PixelGrabber(var13, 0, 0, var7, var11, var15, 0, var7);

      try {
         var16.grabPixels();
      } catch (Exception var24) {
      }

      var13.flush();
      Object var18 = null;
      int var19 = 0;

      label64:
      for(int var20 = 0; var20 < var11; ++var20) {
         for(int var21 = 0; var21 < var7; ++var21) {
            int var22 = var15[var7 * var20 + var21];
            if ((var22 & 16777215) != 0) {
               var19 = var20;
               break label64;
            }
         }
      }

      for(int var23 = 0; var23 < var15.length; ++var23) {
         if ((var15[var23] & 16777215) == 0) {
            var15[var23] = 0;
         }
      }

      this.field1225 = var10 - var19;
      this.field1220 = var12;
      this.field1226[arg4] = var8;
      this.field1223[arg4] = arg0.method11534(var15, 0, var7, var7, var11);
   }

   @deob.ObfuscatedName("ah.k()I")
   public int method2475() {
      return this.field1225;
   }

   @deob.ObfuscatedName("ah.d()I")
   public int method2476() {
      return this.field1220 - 1;
   }

   @deob.ObfuscatedName("ah.b(Ljava/lang/String;)I")
   public int method2477(String arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < arg0.length(); ++var3) {
         int var4 = field1221[arg0.charAt(var3)];
         var2 += this.field1226[var4];
      }

      return var2;
   }

   @deob.ObfuscatedName("ah.r(Lra;Ljava/lang/String;IIIZ)V")
   public void method2484(class772 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
      int var7 = this.method2477(arg1) / 2;
      arg0.method7511(this.field1227);
      if (arg2 - var7 <= this.field1227[2]) {
         if (arg2 + var7 >= this.field1227[0]) {
            if (arg3 - this.field1225 <= this.field1227[3]) {
               if (this.field1220 + arg3 >= this.field1227[1]) {
                  this.method2479(arg0, arg1, this.field1227, arg2 - var7, arg3, arg4, arg5);
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("ah.p(Lra;Ljava/lang/String;[IIIIZ)V")
   private void method2479(class772 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      if (arg5 == 0) {
         arg6 = false;
      }

      int var8 = arg5 | -16777216;

      for(int var9 = 0; var9 < arg1.length(); ++var9) {
         int var10 = field1221[arg1.charAt(var9)];
         if (arg6) {
            this.field1223[var10].method2388(arg3 + 1, arg4 + 1, 0, -16777216, 1);
         }

         this.field1223[var10].method2388(arg3, arg4, 0, var8, 1);
         arg3 += this.field1226[var10];
      }

   }
}
