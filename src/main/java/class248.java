@deob.ObfuscatedName("ajc")
public class class248 extends class107 {
   @deob.ObfuscatedName("ajc.v")
   public int field1645;
   @deob.ObfuscatedName("ajc.g")
   public int field1646;
   @deob.ObfuscatedName("ajc.m")
   public int field1647;
   @deob.ObfuscatedName("ajc.z")
   public int field1649;
   @deob.ObfuscatedName("ajc.e")
   public int field1650;
   @deob.ObfuscatedName("ajc.h")
   public int field1651;
   @deob.ObfuscatedName("ajc.o")
   public class932 field1639;
   @deob.ObfuscatedName("ajc.a")
   public String field1640;
   @deob.ObfuscatedName("ajc.s")
   public int[] field1642;
   @deob.ObfuscatedName("ajc.u")
   public long[] field1644;
   @deob.ObfuscatedName("ajc.x")
   public class805[] field1641;
   @deob.ObfuscatedName("ajc.i")
   public class875[] field1648;
   @deob.ObfuscatedName("ajc.l")
   public Object[] field1643;

   public class248(class124 arg0) {
      int var2 = this.method3371(arg0);
      int var3 = 0;
      class805[] var4 = class805.method14201();

      while(arg0.field935 < var2) {
         class805 var5 = this.method3370(arg0, var4);
         this.method3372(arg0, var3, var5);
         ++var3;
      }

   }

   @deob.ObfuscatedName("ajc.n(Laen;[Lsg;B)Lsg;")
   private class805 method3370(class124 arg0, class805[] arg1) {
      int var3 = arg0.method1587();
      if (var3 >= 0 && var3 < arg1.length) {
         return arg1[var3];
      } else {
         throw new RuntimeException("");
      }
   }

   @deob.ObfuscatedName("ajc.k(Laen;B)I")
   private int method3371(class124 arg0) {
      arg0.field935 = arg0.field931.length - 2;
      int var2 = arg0.method1587();
      int var3 = arg0.field931.length - 2 - var2 - 16;
      arg0.field935 = var3;
      int var4 = arg0.method1591();
      this.field1645 = arg0.method1587();
      this.field1646 = arg0.method1587();
      this.field1651 = arg0.method1587();
      this.field1650 = arg0.method1587();
      this.field1649 = arg0.method1587();
      this.field1647 = arg0.method1587();
      int var5 = arg0.method1688();
      if (var5 > 0) {
         this.field1648 = new class875[var5];

         for(int var6 = 0; var6 < var5; ++var6) {
            int var7 = arg0.method1587();
            class875 var8 = new class875(class887.method4053(var7));
            this.field1648[var6] = var8;

            while(var7-- > 0) {
               int var9 = arg0.method1591();
               int var10 = arg0.method1591();
               var8.method15311(new class108(var10), (long)var9);
            }
         }
      }

      arg0.field935 = 0;
      this.field1640 = arg0.method1598();
      this.field1641 = new class805[var4];
      return var3;
   }

   @deob.ObfuscatedName("ajc.d(Laen;ILsg;I)V")
   private void method3372(class124 arg0, int arg1, class805 arg2) {
      int var4 = this.field1641.length;
      if (class805.field7311 == arg2) {
         if (this.field1643 == null) {
            this.field1643 = new String[var4];
         }

         this.field1643[arg1] = arg0.method1599().intern();
      } else if (class805.field7374 == arg2) {
         if (this.field1644 == null) {
            this.field1644 = new long[var4];
         }

         this.field1644[arg1] = arg0.method1621();
      } else {
         if (this.field1642 == null) {
            this.field1642 = new int[var4];
         }

         if (arg2.field8354) {
            this.field1642[arg1] = arg0.method1591();
         } else {
            this.field1642[arg1] = arg0.method1688();
         }
      }

      this.field1641[arg1] = arg2;
   }
}
