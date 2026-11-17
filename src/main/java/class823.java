import java.util.Locale;

@deob.ObfuscatedName("sy")
public class class823 implements class802 {
   @deob.ObfuscatedName("sy.n")
   public static final class823 field8446 = new class823("EN", "en", "English", class819.field8428, 0, "GB");
   @deob.ObfuscatedName("sy.k")
   public static final class823 field8444 = new class823("DE", "de", "German", class819.field8428, 1, "DE");
   @deob.ObfuscatedName("sy.d")
   public static final class823 field8442 = new class823("FR", "fr", "French", class819.field8428, 2, "FR");
   @deob.ObfuscatedName("sy.b")
   public static final class823 field8445 = new class823("PT", "pt", "Portuguese", class819.field8428, 3, "BR");
   @deob.ObfuscatedName("sy.r")
   private static final class823 field8443 = new class823("NL", "nl", "Dutch", class819.field8432, 4, "NL");
   @deob.ObfuscatedName("sy.p")
   public static final class823 field8447 = new class823("ES", "es", "Spanish", class819.field8432, 5, "ES");
   @deob.ObfuscatedName("sy.u")
   private static final class823[] field8453;
   @deob.ObfuscatedName("sy.o")
   private final String field8448;
   @deob.ObfuscatedName("sy.x")
   private final String field8450;
   @deob.ObfuscatedName("sy.s")
   private final int field8451;
   @deob.ObfuscatedName("sy.l")
   private final Locale field8452;

   static {
      class823[] var0 = method14539();
      field8453 = new class823[var0.length];
      class823[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class823 var3 = var1[var2];
         if (field8453[var3.field8451] != null) {
            throw new IllegalStateException();
         }

         field8453[var3.field8451] = var3;
      }

   }

   @deob.ObfuscatedName("sy.n(S)[Lsy;")
   public static class823[] method14539() {
      return new class823[]{field8444, field8447, field8442, field8446, field8443, field8445};
   }

   private class823(String arg0, String arg1, String arg2, class819 arg3, int arg4, String arg5) {
      this.field8448 = arg0;
      this.field8450 = arg1;
      this.field8451 = arg4;
      if (arg5 != null) {
         this.field8452 = new Locale(arg1.substring(0, 2), arg5);
      } else {
         this.field8452 = new Locale(arg1.substring(0, 2));
      }

   }

   @deob.ObfuscatedName("sy.d(B)Ljava/lang/String;")
   public String method14526() {
      return this.field8450;
   }

   @deob.ObfuscatedName("sy.k(I)I")
   public int method9329() {
      return this.field8451;
   }

   @deob.ObfuscatedName("sy.b(I)Ljava/util/Locale;")
   public Locale method14528() {
      return this.field8452;
   }

   @deob.ObfuscatedName("sy.a(IB)Lsy;")
   public static class823 method14529(int arg0) {
      return arg0 >= 0 && arg0 < field8453.length ? field8453[arg0] : null;
   }

   public String toString() {
      return this.method14526().toLowerCase(Locale.ENGLISH);
   }
}
