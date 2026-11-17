import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;

@deob.ObfuscatedName("za")
public class class988 extends class963 implements class853 {
   private long nativeid;
   @deob.ObfuscatedName("za.r")
   private static boolean field10540 = false;
   @deob.ObfuscatedName("za.b")
   private class548 field10539;
   @deob.ObfuscatedName("za.n")
   private Canvas field10536;
   @deob.ObfuscatedName("za.k")
   private int field10537;
   @deob.ObfuscatedName("za.d")
   private int field10535;

   public class988(class548 arg0, Canvas arg1, int arg2, int arg3) {
      this.field10539 = arg0;
      this.field10536 = arg1;
      this.field10537 = arg2;
      this.field10535 = arg3;
      this.method17041(arg0, this.field10536, arg2, arg3);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("za.c(Ljava/lang/Exception;)V")
   private void method17046(Exception arg0) {
      if (!field10540) {
         Statics.field10538 = class431.method2169();
         field10540 = true;
      } else {
         if (class431.method2169() - Statics.field10538 >= 30000L) {
            throw new RuntimeException(arg0.getMessage());
         }

         this.field10536.repaint();
      }

   }

   @deob.ObfuscatedName("za.w()I")
   public int method542() {
      return this.method543(0, 0);
   }

   @deob.ObfuscatedName("za.q(II)I")
   public int method543(int arg0, int arg1) {
      try {
         synchronized(this.field10536.getTreeLock()) {
            Component var4 = this.field10536;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = this.field10536.getWidth();

            while(var4 != null) {
               Container var9 = var4.getParent();
               if (var9 instanceof Frame) {
                  var7 = ((Frame)var9).getInsets().top;
               }

               if (var9 == null) {
                  break;
               }

               var5 += var4.getX();
               var6 += var4.getY();
               int var10 = var4.getWidth();
               if (var10 < var8) {
                  var8 = var10;
               }

               var4 = var9;
            }

            this.method17042(arg0, arg1, var5, var6, this.field10537, this.field10535, var8, var7);
            field10540 = false;
            return 0;
         }
      } catch (Exception var14) {
         this.method17046(var14);
         return -1;
      }
   }

   @deob.ObfuscatedName("za.j(II)V")
   public void method544(int arg0, int arg1) {
      this.field10537 = arg0;
      this.field10535 = arg1;
      this.method17043(this.field10536, arg0, arg1);
      if (this.field10539.method11517() == this) {
         this.method540();
      }

   }

   @deob.ObfuscatedName("za.k()I")
   public int method566() {
      return this.field10537;
   }

   @deob.ObfuscatedName("za.d()I")
   public int method559() {
      return this.field10535;
   }

   @deob.ObfuscatedName("za.b()V")
   public void method570() {
      if (this.field10539.method11517() == this) {
         this.method541();
      }

      this.method9(true);
      this.nativeid = 0L;
      this.field10536 = null;
   }

   @deob.ObfuscatedName("za.r()Z")
   public boolean method540() {
      this.field10539.method7502(this);
      return true;
   }

   @deob.ObfuscatedName("za.p()Z")
   public boolean method541() {
      return true;
   }

   @deob.ObfuscatedName("za.ma(Z)V")
   public native void method9(boolean arg0);

   @deob.ObfuscatedName("za.n(Lja;Ljava/awt/Canvas;II)V")
   private native void method17041(class548 arg0, Canvas arg1, int arg2, int arg3);

   @deob.ObfuscatedName("za.H(IIIIIIII)V")
   private native void method17042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @deob.ObfuscatedName("za.wa(Ljava/awt/Canvas;II)V")
   private native void method17043(Canvas arg0, int arg1, int arg2);
}
