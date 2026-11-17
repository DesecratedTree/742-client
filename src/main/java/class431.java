@deob.ObfuscatedName("es")
public final class class431 {
   private class431() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("afn.n(I)J")
   public static final synchronized long method2169() {
      long var0 = System.currentTimeMillis();
      if (var0 < Statics.field3592) {
         Statics.field3593 += Statics.field3592 - var0;
      }

      Statics.field3592 = var0;
      return Statics.field3593 + var0;
   }
}
