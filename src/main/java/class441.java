@deob.ObfuscatedName("fb")
public class class441 {
   @deob.ObfuscatedName("fb.n")
   public static final class441 field3655 = new class441(0, 104);
   @deob.ObfuscatedName("fb.k")
   private static final class441 field3660 = new class441(1, 120);
   @deob.ObfuscatedName("fb.d")
   public static final class441 field3656 = new class441(2, 136);
   @deob.ObfuscatedName("fb.b")
   public static final class441 field3658 = new class441(3, 168);
   @deob.ObfuscatedName("fb.r")
   public static final class441 field3659 = new class441(4, 72);
   @deob.ObfuscatedName("fb.p")
   public final int field3657;
   @deob.ObfuscatedName("fb.o")
   public final int field3661;

   @deob.ObfuscatedName("cl.n(I)[Lfb;")
   private static class441[] method4546() {
      return new class441[]{field3659, field3656, field3660, field3655, field3658};
   }

   private class441(int arg0, int arg1) {
      this.field3657 = arg0;
      this.field3661 = arg1;
   }

   @deob.ObfuscatedName("rx.k(II)Lfb;")
   public static class441 method14204(int arg0) {
      class441[] var1 = method4546();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class441 var3 = var1[var2];
         if (var3.field3657 == arg0) {
            return var3;
         }
      }

      return null;
   }
}
