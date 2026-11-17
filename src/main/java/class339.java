import jaggl.OpenGL;

@deob.ObfuscatedName("bh")
public class class339 {
   @deob.ObfuscatedName("bh.b")
   private static final int[] field2142 = new int[1];
   @deob.ObfuscatedName("bh.k")
   private final class983 field2141;
   @deob.ObfuscatedName("bh.d")
   public final int field2143;

   @deob.ObfuscatedName("bh.n(Lyw;ILjava/lang/String;)Lbh;")
   public static class339 method4147(class983 arg0, int arg1, String arg2) {
      int var3 = OpenGL.glGenProgramARB();
      OpenGL.glBindProgramARB(arg1, var3);
      OpenGL.glProgramStringARB(arg1, 34933, arg2);
      OpenGL.glGetIntegerv(34379, field2142, 0);
      if (field2142[0] != -1) {
         OpenGL.glBindProgramARB(arg1, 0);
         return null;
      } else {
         OpenGL.glBindProgramARB(arg1, 0);
         return new class339(arg0, arg1, var3);
      }
   }

   private class339(class983 arg0, int arg1, int arg2) {
      this.field2141 = arg0;
      this.field2143 = arg2;
   }

   public void finalize() throws Throwable {
      this.field2141.method16663(this.field2143);
      super.finalize();
   }
}
