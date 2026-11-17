@deob.ObfuscatedName("ew")
public final class class435 {
   private class435() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("do.n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z")
   public static final boolean method5506(String arg0, String arg1, String arg2, String arg3) {
      if (arg0 != null && arg2 != null) {
         return !arg0.startsWith("#") && !arg2.startsWith("#") ? arg1.equals(arg3) : arg0.equals(arg2);
      } else {
         return false;
      }
   }
}
