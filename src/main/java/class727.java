@deob.ObfuscatedName("pj")
public class class727 implements class722 {
   @deob.ObfuscatedName("pj.n")
   private final int[] field6690;

   private class727(int[] arg0) {
      this.field6690 = arg0;
   }

   @deob.ObfuscatedName("pj.n(Lads;[Lor;ILob;I)Z")
   public boolean method10704(class102 arg0, class708[] arg1, int arg2, class692 arg3) {
      int[] var5 = this.field6690;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         int var7 = var5[var6];
         if (!arg3.method1803(var7)) {
            return false;
         }
      }

      return true;
   }

   @deob.ObfuscatedName("nh.b(Laen;B)Lpj;")
   public static class727 method9837(class124 arg0) {
      int var1 = arg0.method1688();
      int[] var2 = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = arg0.method1688();
      }

      return new class727(var2);
   }
}
