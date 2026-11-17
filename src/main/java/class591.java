import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;

@deob.ObfuscatedName("ki")
public class class591 implements class592 {
   @deob.ObfuscatedName("ki.t")
   private int field5381;
   @deob.ObfuscatedName("ki.y")
   private int field5386;
   @deob.ObfuscatedName("ki.w")
   private int field5387;
   @deob.ObfuscatedName("ki.z")
   private int field5397;
   @deob.ObfuscatedName("ki.m")
   private int field5398;
   @deob.ObfuscatedName("ki.c")
   private int field5401;
   @deob.ObfuscatedName("ki.q")
   private int field5403;
   @deob.ObfuscatedName("ki.i")
   private int field5404;
   @deob.ObfuscatedName("ki.j")
   private int field5405;
   @deob.ObfuscatedName("ki.b")
   private Color field5384;
   @deob.ObfuscatedName("ki.k")
   private Font field5382;
   @deob.ObfuscatedName("ki.d")
   private FontMetrics field5383;
   @deob.ObfuscatedName("ki.r")
   private Image field5385;
   @deob.ObfuscatedName("ki.a")
   private Image field5388;
   @deob.ObfuscatedName("ki.o")
   private Image field5389;
   @deob.ObfuscatedName("ki.s")
   private Image field5390;
   @deob.ObfuscatedName("ki.v")
   private Image field5391;
   @deob.ObfuscatedName("ki.u")
   private Image field5392;
   @deob.ObfuscatedName("ki.p")
   private Image field5393;
   @deob.ObfuscatedName("ki.g")
   private Image field5394;
   @deob.ObfuscatedName("ki.x")
   private Image field5400;
   @deob.ObfuscatedName("ki.l")
   private Image field5402;
   @deob.ObfuscatedName("ki.h")
   private boolean field5395;
   @deob.ObfuscatedName("ki.e")
   private boolean field5396;
   @deob.ObfuscatedName("ki.n")
   private boolean field5399;

   @deob.ObfuscatedName("ki.n(IB)I")
   private final int method8328(int arg0) {
      return this.field5395 ? (Statics.field6104 - arg0) / 2 : 0;
   }

   @deob.ObfuscatedName("ki.k(IB)I")
   private final int method8338(int arg0) {
      return this.field5396 ? (Statics.field6354 - arg0) / 2 : 0;
   }

   @deob.ObfuscatedName("ki.d(ZI)V")
   public void method8234(boolean arg0) {
      if (!this.field5399 && this.field5382 == null) {
         try {
            String[] var2 = Statics.method14220(client.field2401, ',');
            if (var2.length != 23) {
               this.field5399 = true;
            }

            this.field5395 = Boolean.parseBoolean(var2[0]);
            this.field5396 = Boolean.parseBoolean(var2[1]);
            this.field5397 = class816.method5626(var2[2]);
            this.field5398 = class816.method5626(var2[3]);
            this.field5404 = class816.method5626(var2[4]);
            this.field5381 = class816.method5626(var2[5]);
            this.field5401 = class816.method5626(var2[6]);
            this.field5387 = class816.method5626(var2[7]);
            this.field5403 = class816.method5626(var2[8]);
            this.field5386 = class816.method5626(var2[9]);
            String var3 = var2[10];
            int var4 = class816.method5626(var2[11]);
            int var5 = class816.method14330(var2[12].substring(2), 16);
            this.field5382 = new Font(var3, 0, var4);
            this.field5383 = Statics.field5796.getFontMetrics(this.field5382);
            this.field5384 = new Color(var5);
            MediaTracker var6 = new MediaTracker(Statics.field5796);
            this.field5385 = this.method8329(var2[13]);
            var6.addImage(this.field5385, 0);
            this.field5393 = this.method8329(var2[14]);
            var6.addImage(this.field5393, 1);
            this.field5389 = this.method8329(var2[15]);
            var6.addImage(this.field5389, 2);
            this.field5388 = this.method8329(var2[16]);
            var6.addImage(this.field5388, 3);
            this.field5400 = this.method8329(var2[17]);
            var6.addImage(this.field5400, 4);
            this.field5390 = this.method8329(var2[18]);
            var6.addImage(this.field5390, 5);
            this.field5402 = this.method8329(var2[19]);
            var6.addImage(this.field5402, 6);
            this.field5392 = this.method8329(var2[20]);
            var6.addImage(this.field5392, 7);
            this.field5391 = this.method8329(var2[21]);
            var6.addImage(this.field5391, 8);
            var6.waitForAll();
            this.field5405 = class816.method5626(var2[22]);
         } catch (Exception var49) {
            this.field5399 = true;
         }
      }

      if (this.field5399) {
         this.method8330();
      } else {
         Graphics var8 = Statics.field5796.getGraphics();
         if (var8 != null) {
            try {
               int var9 = Statics.field9392.method8492();
               String var10 = Statics.field9392.method8493();
               if (Statics.field1652 == null) {
                  Statics.field1652 = Statics.field5796.createImage(Statics.field6104, Statics.field6354);
               }

               Graphics var11 = Statics.field1652.getGraphics();
               var11.setColor(Color.BLACK);
               var11.fillRect(0, 0, Statics.field6104, Statics.field6354);
               int var12 = this.field5402.getWidth((ImageObserver)null);
               int var13 = this.field5392.getWidth((ImageObserver)null);
               int var14 = this.field5391.getWidth((ImageObserver)null);
               int var15 = this.field5402.getHeight((ImageObserver)null);
               int var16 = this.field5392.getHeight((ImageObserver)null);
               int var17 = this.field5391.getHeight((ImageObserver)null);
               var11.drawImage(this.field5402, this.method8328(var12) + this.field5401 - this.field5403 / 2, this.method8338(var15) + this.field5387, (ImageObserver)null);
               int var18 = this.field5401 - this.field5403 / 2 + var12;
               int var19 = this.field5403 / 2 + this.field5401;

               for(int var20 = var18; var20 <= var19; var20 += var14) {
                  var11.drawImage(this.field5391, this.method8328(var12) + this.field5401 + var20, this.method8338(var17) + this.field5387, (ImageObserver)null);
               }

               var11.drawImage(this.field5392, this.method8328(var13) + this.field5401 + this.field5403 / 2, this.method8338(var16) + this.field5387, (ImageObserver)null);
               int var21 = this.field5389.getWidth((ImageObserver)null);
               int var22 = this.field5389.getHeight((ImageObserver)null);
               int var23 = this.field5388.getWidth((ImageObserver)null);
               int var24 = this.field5388.getHeight((ImageObserver)null);
               int var25 = this.field5390.getHeight((ImageObserver)null);
               int var26 = this.field5400.getWidth((ImageObserver)null);
               int var27 = this.field5400.getHeight((ImageObserver)null);
               int var28 = this.field5390.getWidth((ImageObserver)null);
               int var29 = this.field5385.getWidth((ImageObserver)null);
               int var30 = this.field5393.getWidth((ImageObserver)null);
               int var31 = this.method8328(this.field5404) + this.field5397;
               int var32 = this.method8338(this.field5381) + this.field5398;
               var11.drawImage(this.field5389, var31, (this.field5381 - var22) / 2 + var32, (ImageObserver)null);
               var11.drawImage(this.field5388, this.field5404 + var31 - var23, (this.field5381 - var24) / 2 + var32, (ImageObserver)null);
               if (this.field5394 == null) {
                  this.field5394 = Statics.field5796.createImage(this.field5404 - var21 - var23, this.field5381);
               }

               Graphics var33 = this.field5394.getGraphics();

               for(int var34 = 0; var34 < this.field5404 - var21 - var23; var34 += var26) {
                  var33.drawImage(this.field5400, var34, 0, (ImageObserver)null);
               }

               for(int var35 = 0; var35 < this.field5404 - var21 - var23; var35 += var28) {
                  var33.drawImage(this.field5390, var35, this.field5381 - var25, (ImageObserver)null);
               }

               int var36 = (this.field5404 - var21 - var23) * var9 / 100;
               if (var36 > 0) {
                  Image var37 = Statics.field5796.createImage(var36, this.field5381 - var27 - var25);
                  int var38 = var37.getWidth((ImageObserver)null);
                  Graphics var39 = var37.getGraphics();
                  int var40 = this.field5405 * class590.method2001() / 10 % var29;

                  for(int var41 = var40 - var29; var41 < var38; var41 += var29) {
                     var39.drawImage(this.field5385, var41, 0, (ImageObserver)null);
                  }

                  var33.drawImage(var37, 0, var27, (ImageObserver)null);
               }

               int var43 = this.field5404 - var21 - var23 - var36;
               if (var43 > 0) {
                  Image var44 = Statics.field5796.createImage(var43, this.field5381 - var27 - var25);
                  int var45 = var44.getWidth((ImageObserver)null);
                  Graphics var46 = var44.getGraphics();

                  for(int var47 = 0; var47 < var45; var47 += var30) {
                     var46.drawImage(this.field5393, var47, 0, (ImageObserver)null);
                  }

                  var33.drawImage(var44, var36, var27, (ImageObserver)null);
               }

               var11.drawImage(this.field5394, var21 + var31, var32, (ImageObserver)null);
               var11.setFont(this.field5382);
               var11.setColor(this.field5384);
               var11.drawString(var10, var31 + (this.field5404 - this.field5383.stringWidth(var10)) / 2, this.field5386 + this.field5381 / 2 + var32 + 4);
               var8.drawImage(Statics.field1652, 0, 0, (ImageObserver)null);
            } catch (Exception var50) {
               this.field5399 = true;
            }
         } else {
            Statics.field5796.repaint();
         }

      }
   }

   @deob.ObfuscatedName("ki.b(Ljava/lang/String;I)Ljava/awt/Image;")
   private Image method8329(String arg0) throws IOException {
      try {
         InputStream var2 = Statics.field6978.getClass().getClassLoader().getResourceAsStream(arg0);
         byte[] var3 = new byte[4000];
         int var4 = 0;

         int var5;
         while((var5 = var2.read()) != -1) {
            var3[var4++] = (byte)var5;
         }

         return Toolkit.getDefaultToolkit().createImage(var3);
      } catch (Exception var8) {
         throw new IOException();
      }
   }

   @deob.ObfuscatedName("ki.r(B)V")
   private void method8330() {
      class671.method9880(Statics.field9392.method8492(), Statics.field9392.method8493(), client.field2442[client.field2647], client.field2443[client.field2647], client.field2444[client.field2647]);
   }

   @deob.ObfuscatedName("ki.p(I)V")
   public void method8236() {
      Statics.method10870();
   }

   @deob.ObfuscatedName("ki.o(B)V")
   public void method8233() {
   }

   @deob.ObfuscatedName("ki.a(I)I")
   public int method8235() {
      return 100;
   }

   @deob.ObfuscatedName("ki.x(J)Z")
   public boolean method8237(long arg0) {
      return true;
   }

   @deob.ObfuscatedName("ki.s(I)I")
   public int method8259() {
      return 0;
   }
}
