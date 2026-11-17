import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@deob.ObfuscatedName("aeo")
public final class class125 extends class692 implements KeyListener, FocusListener {
   @deob.ObfuscatedName("aeo.de")
   private class849 field937 = new class849();
   @deob.ObfuscatedName("aeo.dp")
   private class849 field940 = new class849();
   @deob.ObfuscatedName("aeo.dh")
   private boolean[] field941 = new boolean[112];
   @deob.ObfuscatedName("aeo.dw")
   private static int[] field943 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @deob.ObfuscatedName("aeo.dc")
   private Component field942;

   public class125(Component arg0) {
      method6140();
      this.method1817(arg0);
   }

   @deob.ObfuscatedName("ez.z(B)V")
   private static void method6140() {
      field943[44] = 71;
      field943[45] = 26;
      field943[46] = 72;
      field943[47] = 73;
      field943[59] = 57;
      field943[61] = 27;
      field943[91] = 42;
      field943[92] = 74;
      field943[93] = 43;
      field943[192] = 28;
      field943[222] = 58;
      field943[520] = 59;
   }

   @deob.ObfuscatedName("aeo.m(Ljava/awt/Component;I)V")
   private void method1817(Component arg0) {
      this.method1800();
      this.field942 = arg0;
      this.field942.addKeyListener(this);
      this.field942.addFocusListener(this);
   }

   @deob.ObfuscatedName("aeo.i(I)V")
   private void method1800() {
      if (this.field942 != null) {
         this.field942.removeKeyListener(this);
         this.field942.removeFocusListener(this);
         this.field942 = null;

         for(int var1 = 0; var1 < 112; ++var1) {
            this.field941[var1] = false;
         }

         this.field937.method14958();
         this.field940.method14958();
      }
   }

   @deob.ObfuscatedName("aeo.t(ICIB)V")
   private void method1801(int arg0, char arg1, int arg2) {
      class93 var4 = new class93();
      var4.field701 = arg0;
      var4.field700 = arg1;
      var4.field703 = arg2;
      var4.field704 = class431.method2169();
      this.field940.method14959(var4);
   }

   @deob.ObfuscatedName("aeo.b(B)Lor;")
   public class708 method1808() {
      return (class708)this.field937.method14961();
   }

   @deob.ObfuscatedName("aeo.d(II)Z")
   public boolean method1803(int arg0) {
      return arg0 >= 0 && arg0 < 112 ? this.field941[arg0] : false;
   }

   @deob.ObfuscatedName("aeo.k(I)V")
   public synchronized void method1804() {
      this.field937.method14958();

      for(class93 var1 = (class93)this.field940.method14961(); var1 != null; var1 = (class93)this.field940.method14961()) {
         var1.field705 = this.method1809();
         if (var1.field701 == 0) {
            if (!this.field941[var1.field703]) {
               class93 var2 = new class93();
               var2.field701 = 0;
               var2.field700 = (char)65535;
               var2.field703 = var1.field703;
               var2.field704 = var1.field704;
               var2.field705 = var1.field705;
               this.field937.method14959(var2);
               this.field941[var1.field703] = true;
            }

            var1.field701 = 2;
            this.field937.method14959(var1);
         } else if (var1.field701 == 1) {
            if (this.field941[var1.field703]) {
               this.field937.method14959(var1);
               this.field941[var1.field703] = false;
            }
         } else if (var1.field701 == -1) {
            for(int var3 = 0; var3 < 112; ++var3) {
               if (this.field941[var3]) {
                  class93 var4 = new class93();
                  var4.field701 = 1;
                  var4.field700 = (char)65535;
                  var4.field703 = var3;
                  var4.field704 = var1.field704;
                  var4.field705 = var1.field705;
                  this.field937.method14959(var4);
                  this.field941[var3] = false;
               }
            }
         } else if (var1.field701 == 3) {
            this.field937.method14959(var1);
         }
      }

   }

   @deob.ObfuscatedName("aeo.c(B)I")
   private int method1809() {
      int var1 = 0;
      if (this.field941[81]) {
         var1 |= 1;
      }

      if (this.field941[82]) {
         var1 |= 4;
      }

      if (this.field941[86]) {
         var1 |= 2;
      }

      return var1;
   }

   @deob.ObfuscatedName("aeo.r(I)V")
   public void method1806() {
      this.method1800();
   }

   @deob.ObfuscatedName("aeo.w(Ljava/awt/event/KeyEvent;II)V")
   private void method1807(KeyEvent arg0, int arg1) {
      int var3 = arg0.getKeyCode();
      int var5;
      if (var3 != 0) {
         if (var3 >= 0 && var3 < field943.length) {
            int var4 = field943[var3];
            if (arg1 == 0 && (var4 & 128) != 0) {
               var5 = 0;
            } else {
               var5 = var4 & -129;
            }
         } else {
            var5 = 0;
         }
      } else {
         var5 = 0;
      }

      if (var5 != 0) {
         this.method1801(arg1, (char)65535, var5);
         arg0.consume();
      }
   }

   public synchronized void keyPressed(KeyEvent arg0) {
      this.method1807(arg0, 0);
   }

   public synchronized void keyReleased(KeyEvent arg0) {
      this.method1807(arg0, 1);
   }

   public synchronized void keyTyped(KeyEvent arg0) {
      char var2 = arg0.getKeyChar();
      if (var2 != 65535 && class813.method6238(var2)) {
         this.method1801(3, var2, -1);
         arg0.consume();
      }
   }

   public void focusGained(FocusEvent arg0) {
   }

   public synchronized void focusLost(FocusEvent arg0) {
      this.method1801(-1, '\u0000', 0);
   }
}
