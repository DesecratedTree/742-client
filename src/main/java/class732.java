@deob.ObfuscatedName("po")
public class class732 implements class722 {
   @deob.ObfuscatedName("po.n")
   private final int field6720;
   @deob.ObfuscatedName("po.k")
   private final int field6721;
   @deob.ObfuscatedName("po.d")
   private final int[] field6722;

   private class732(int arg0, int arg1, int[] arg2) {
      this.field6720 = arg0;
      this.field6721 = arg1;
      this.field6722 = arg2;
   }

   @deob.ObfuscatedName("po.n(Lads;[Lor;ILob;I)Z")
   public boolean method10704(class102 arg0, class708[] arg1, int arg2, class692 arg3) {
      if (arg0 == null) {
         if (this.field6720 != -1) {
            return false;
         }
      } else {
         if (this.field6720 != arg0.method1365()) {
            return false;
         }

         if (this.field6721 > arg0.method1368()) {
            return false;
         }

         int[] var5 = this.field6722;

         for(int var6 = 0; var6 < var5.length; ++var6) {
            int var7 = var5[var6];
            if (!arg3.method1803(var7)) {
               return false;
            }
         }
      }

      return true;
   }

   @deob.ObfuscatedName("uf.b(Laen;B)Lpo;")
   public static class732 method15112(class124 arg0) {
      int var1 = arg0.method1688();
      int var2 = arg0.method1688();
      int var3 = arg0.method1688();
      int[] var4 = new int[var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = arg0.method1688();
      }

      return new class732(var1, var2, var4);
   }
}
