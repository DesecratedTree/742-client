import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@deob.ObfuscatedName("aes")
public class class129 extends class706 implements MouseListener, MouseMotionListener, MouseWheelListener {
   @deob.ObfuscatedName("aes.o")
   private class849 field999 = new class849();
   @deob.ObfuscatedName("aes.l")
   private class849 field1003 = new class849();
   @deob.ObfuscatedName("aes.v")
   private boolean field998;
   @deob.ObfuscatedName("aes.a")
   private int field1000;
   @deob.ObfuscatedName("aes.x")
   private int field1001;
   @deob.ObfuscatedName("aes.s")
   private int field1002;
   @deob.ObfuscatedName("aes.b")
   private int field994;
   @deob.ObfuscatedName("aes.p")
   private int field996;
   @deob.ObfuscatedName("aes.r")
   private int field997;
   @deob.ObfuscatedName("aes.u")
   private Component field1004;

   public class129(Component arg0, boolean arg1) {
      this.method1903(arg0);
      this.field998 = arg1;
   }

   @deob.ObfuscatedName("aes.aw(Ljava/awt/Component;B)V")
   private void method1903(Component arg0) {
      this.method1899();
      this.field1004 = arg0;
      this.field1004.addMouseListener(this);
      this.field1004.addMouseMotionListener(this);
      this.field1004.addMouseWheelListener(this);
   }

   @deob.ObfuscatedName("aes.al(B)V")
   private void method1899() {
      if (this.field1004 != null) {
         this.field1004.removeMouseWheelListener(this);
         this.field1004.removeMouseMotionListener(this);
         this.field1004.removeMouseListener(this);
         this.field1004 = null;
         this.field996 = 0;
         this.field997 = 0;
         this.field994 = 0;
         this.field1002 = 0;
         this.field1001 = 0;
         this.field1000 = 0;
         this.field999 = null;
         this.field1003 = null;
      }
   }

   @deob.ObfuscatedName("aes.an(IIIII)V")
   private void method1889(int arg0, int arg1, int arg2, int arg3) {
      class263 var5 = class263.method2290(arg0, arg1, arg2, class431.method2169(), arg3);
      this.field1003.method14959(var5);
   }

   @deob.ObfuscatedName("aes.ag(III)V")
   private void method1890(int arg0, int arg1) {
      this.field1000 = arg0;
      this.field1001 = arg1;
      if (this.field998) {
         this.method1889(-1, arg0, arg1, 0);
      }

   }

   @deob.ObfuscatedName("aes.s(I)Lads;")
   public class102 method1891() {
      return (class102)this.field999.method14961();
   }

   @deob.ObfuscatedName("aes.d(B)V")
   public synchronized void method1892() {
      this.field994 = this.field1000;
      this.field997 = this.field1001;
      this.field996 = this.field1002;
      class849 var1 = this.field999;
      this.field999 = this.field1003;
      this.field1003 = var1;
      this.field1003.method14958();
   }

   @deob.ObfuscatedName("aes.b(I)Z")
   public boolean method1893() {
      return (this.field996 & 1) != 0;
   }

   @deob.ObfuscatedName("aes.r(I)Z")
   public boolean method1894() {
      return (this.field996 & 2) != 0;
   }

   @deob.ObfuscatedName("aes.p(I)Z")
   public boolean method1895() {
      return (this.field996 & 4) != 0;
   }

   @deob.ObfuscatedName("aes.a(B)I")
   public int method1896() {
      return this.field994;
   }

   @deob.ObfuscatedName("aes.x(I)I")
   public int method1897() {
      return this.field997;
   }

   @deob.ObfuscatedName("aes.l(I)V")
   public void method1898() {
      this.method1899();
   }

   public synchronized void mouseClicked(MouseEvent arg0) {
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   public synchronized void mouseEntered(MouseEvent arg0) {
      this.method1890(arg0.getX(), arg0.getY());
   }

   public synchronized void mouseExited(MouseEvent arg0) {
      this.method1890(arg0.getX(), arg0.getY());
   }

   @deob.ObfuscatedName("aes.ak(Ljava/awt/event/MouseEvent;B)I")
   private int method1901(MouseEvent arg0) {
      if (arg0.getButton() == 1) {
         return arg0.isMetaDown() ? 4 : 1;
      } else if (arg0.getButton() == 2) {
         return 2;
      } else {
         return arg0.getButton() == 3 ? 4 : 0;
      }
   }

   public synchronized void mousePressed(MouseEvent arg0) {
      int var2 = this.method1901(arg0);
      if (var2 == 1) {
         this.method1889(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
      } else if (var2 == 4) {
         this.method1889(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
      } else if (var2 == 2) {
         this.method1889(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      this.field1002 |= var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   public synchronized void mouseReleased(MouseEvent arg0) {
      int var2 = this.method1901(arg0);
      if ((this.field1002 & var2) == 0) {
         var2 = this.field1002;
      }

      if ((var2 & 1) != 0) {
         this.method1889(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      if ((var2 & 4) != 0) {
         this.method1889(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      if ((var2 & 2) != 0) {
         this.method1889(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
      }

      this.field1002 &= ~var2;
      if (arg0.isPopupTrigger()) {
         arg0.consume();
      }

   }

   public synchronized void mouseDragged(MouseEvent arg0) {
      this.method1890(arg0.getX(), arg0.getY());
   }

   public synchronized void mouseMoved(MouseEvent arg0) {
      this.method1890(arg0.getX(), arg0.getY());
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
      int var2 = arg0.getX();
      int var3 = arg0.getY();
      int var4 = arg0.getWheelRotation();
      this.method1889(6, var2, var3, var4);
      arg0.consume();
   }
}
