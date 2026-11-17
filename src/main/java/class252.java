@deob.ObfuscatedName("ajg")
public class class252 extends class107 {
   @deob.ObfuscatedName("ajg.u")
   public int field1663 = -1;
   @deob.ObfuscatedName("ajg.v")
   public int field1664 = -1;
   @deob.ObfuscatedName("ajg.g")
   public int field1665 = 12800;
   @deob.ObfuscatedName("ajg.h")
   public int field1661 = 0;
   @deob.ObfuscatedName("ajg.e")
   public int field1669 = 12800;
   @deob.ObfuscatedName("ajg.z")
   public int field1668 = 0;
   @deob.ObfuscatedName("ajg.m")
   public boolean field1667 = true;
   @deob.ObfuscatedName("ajg.o")
   public int field1666;
   @deob.ObfuscatedName("ajg.a")
   public String field1659;
   @deob.ObfuscatedName("ajg.x")
   public String field1660;
   @deob.ObfuscatedName("ajg.l")
   public int field1658;
   @deob.ObfuscatedName("ajg.s")
   private class849 field1662;

   private class252(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      this.field1666 = arg0;
      this.field1659 = arg1;
      this.field1660 = arg2;
      this.field1658 = arg3;
      this.field1663 = arg4;
      this.field1667 = arg5;
      this.field1664 = arg6;
      if (this.field1664 == 255) {
         this.field1664 = 0;
      }

      class441.method14204(arg7);
      this.field1662 = new class849();
   }

   @deob.ObfuscatedName("ajg.n(IIB)Z")
   public boolean method3425(int arg0, int arg1) {
      for(class91 var3 = (class91)this.field1662.method14964(); var3 != null; var3 = (class91)this.field1662.method15006()) {
         if (var3.method1277(arg0, arg1)) {
            return true;
         }
      }

      return false;
   }

   @deob.ObfuscatedName("ajg.k(II[II)Z")
   public boolean method3410(int arg0, int arg1, int[] arg2) {
      for(class91 var4 = (class91)this.field1662.method14964(); var4 != null; var4 = (class91)this.field1662.method15006()) {
         if (var4.method1276(arg0, arg1)) {
            var4.method1279(arg0, arg1, arg2);
            return true;
         }
      }

      return false;
   }

   @deob.ObfuscatedName("ajg.d(II[II)Z")
   public boolean method3409(int arg0, int arg1, int[] arg2) {
      for(class91 var4 = (class91)this.field1662.method14964(); var4 != null; var4 = (class91)this.field1662.method15006()) {
         if (var4.method1277(arg0, arg1)) {
            var4.method1280(arg0, arg1, arg2);
            return true;
         }
      }

      return false;
   }

   @deob.ObfuscatedName("ajg.b(III[IB)Z")
   public boolean method3412(int arg0, int arg1, int arg2, int[] arg3) {
      for(class91 var5 = (class91)this.field1662.method14964(); var5 != null; var5 = (class91)this.field1662.method15006()) {
         if (var5.method1278(arg0, arg1, arg2)) {
            var5.method1280(arg1, arg2, arg3);
            return true;
         }
      }

      return false;
   }

   @deob.ObfuscatedName("ajg.r(I)V")
   private void method3411() {
      this.field1665 = 12800;
      this.field1661 = 0;
      this.field1669 = 12800;
      this.field1668 = 0;

      for(class91 var1 = (class91)this.field1662.method14964(); var1 != null; var1 = (class91)this.field1662.method15006()) {
         if (var1.field694 < this.field1665) {
            this.field1665 = var1.field694;
         }

         if (var1.field696 > this.field1661) {
            this.field1661 = var1.field696;
         }

         if (var1.field689 < this.field1669) {
            this.field1669 = var1.field689;
         }

         if (var1.field690 > this.field1668) {
            this.field1668 = var1.field690;
         }
      }

   }

   @deob.ObfuscatedName("oe.p(Llc;IIB)Lajg;")
   public static class252 method10178(class612 arg0, int arg1, int arg2) {
      class124 var3 = new class124(arg0.method8771(arg1, arg2));
      class252 var4 = new class252(arg2, var3.method1599(), var3.method1599(), var3.method1591(), var3.method1591(), var3.method1688() == 1, var3.method1688(), var3.method1688());
      int var5 = var3.method1688();

      for(int var6 = 0; var6 < var5; ++var6) {
         var4.field1662.method14959(new class91(var3.method1688(), var3.method1587(), var3.method1587(), var3.method1587(), var3.method1587(), var3.method1587(), var3.method1587(), var3.method1587(), var3.method1587()));
      }

      var4.method3411();
      return var4;
   }
}
