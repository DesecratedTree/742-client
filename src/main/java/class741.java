@deob.ObfuscatedName("px")
public class class741 implements class722 {
   @deob.ObfuscatedName("px.n")
   private final int field6804;
   @deob.ObfuscatedName("px.k")
   private final int field6805;

   private class741(int arg0, int arg1) {
      this.field6804 = arg0;
      this.field6805 = arg1;
   }

   @deob.ObfuscatedName("px.n(Lads;[Lor;ILob;I)Z")
   public boolean method10704(class102 arg0, class708[] arg1, int arg2, class692 arg3) {
      for(int var5 = 0; var5 < arg2 && var5 < arg1.length; ++var5) {
         class708 var6 = arg1[var5];
         if (var6 != null && var6.method1297() == this.field6804 && var6.method1299() == this.field6805) {
            return true;
         }
      }

      return false;
   }

   @deob.ObfuscatedName("dq.b(Laen;I)Lpx;")
   public static class741 method5509(class124 arg0) {
      int var1 = arg0.method1688();
      int var2 = arg0.method1688();
      return new class741(var1, var2);
   }
}
