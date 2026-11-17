@deob.ObfuscatedName("ajr")
public final class class263 extends class102 {
   @deob.ObfuscatedName("ajr.u")
   private static class263[] field1751 = new class263[0];
   @deob.ObfuscatedName("ajr.e")
   private int field1752;
   @deob.ObfuscatedName("ajr.z")
   private int field1753;
   @deob.ObfuscatedName("ajr.h")
   private int field1754;
   @deob.ObfuscatedName("ajr.i")
   private int field1755;
   @deob.ObfuscatedName("ajr.m")
   private long field1750;

   @deob.ObfuscatedName("acq.ap(IB)V")
   public static void method1072(int arg0) {
      Statics.field8871 = arg0;
      field1751 = new class263[arg0];
      Statics.field5712 = 0;
   }

   @deob.ObfuscatedName("ag.av(IIIJII)Lajr;")
   public static class263 method2290(int arg0, int arg1, int arg2, long arg3, int arg4) {
      class263[] var6 = field1751;
      synchronized(field1751) {
         class263 var7;
         if (Statics.field5712 == 0) {
            var7 = new class263();
         } else {
            var7 = field1751[--Statics.field5712];
         }

         var7.field1754 = arg0;
         var7.field1752 = arg1;
         var7.field1753 = arg2;
         var7.field1750 = arg3;
         var7.field1755 = arg4;
         return var7;
      }
   }

   private class263() {
   }

   @deob.ObfuscatedName("ajr.n(I)I")
   public int method1365() {
      return this.field1754;
   }

   @deob.ObfuscatedName("ajr.k(B)I")
   public int method1375() {
      return this.field1752;
   }

   @deob.ObfuscatedName("ajr.d(B)I")
   public int method1367() {
      return this.field1753;
   }

   @deob.ObfuscatedName("ajr.r(B)J")
   public long method1377() {
      return this.field1750;
   }

   @deob.ObfuscatedName("ajr.b(I)I")
   public int method1368() {
      return this.field1755;
   }

   @deob.ObfuscatedName("ajr.o(I)V")
   public void method1370() {
      class263[] var1 = field1751;
      synchronized(field1751) {
         if (Statics.field5712 < Statics.field8871 - 1) {
            field1751[++Statics.field5712 - 1] = this;
         }

      }
   }
}
