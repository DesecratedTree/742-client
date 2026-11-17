@deob.ObfuscatedName("to")
public class class840 {
   @deob.ObfuscatedName("to.n")
   public static final class840 field8549 = new class840("LIVE", 0);
   @deob.ObfuscatedName("to.k")
   public static final class840 field8555 = new class840("BUILDLIVE", 3);
   @deob.ObfuscatedName("to.d")
   public static final class840 field8551 = new class840("RC", 1);
   @deob.ObfuscatedName("to.b")
   public static final class840 field8550 = new class840("WIP", 2);
   @deob.ObfuscatedName("to.r")
   private static final class840 field8553 = new class840("INTBETA", 4);
   @deob.ObfuscatedName("to.p")
   public final String field8554;
   @deob.ObfuscatedName("to.o")
   public final int field8552;

   @deob.ObfuscatedName("lh.n(S)[Lto;")
   private static class840[] method8900() {
      return new class840[]{field8555, field8550, field8549, field8551, field8553};
   }

   private class840(String arg0, int arg1) {
      this.field8554 = arg0;
      this.field8552 = arg1;
   }

   @deob.ObfuscatedName("gw.k(IB)Lto;")
   public static class840 method6888(int arg0) {
      class840[] var1 = method8900();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class840 var3 = var1[var2];
         if (var3.field8552 == arg0) {
            return var3;
         }
      }

      return null;
   }
}
