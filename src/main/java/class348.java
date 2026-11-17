import jaggl.OpenGL;

@deob.ObfuscatedName("bq")
public class class348 {
   @deob.ObfuscatedName("bq.d")
   private static final int[] field2204 = new int[2];
   @deob.ObfuscatedName("bq.b")
   private final class983 field2201;
   @deob.ObfuscatedName("bq.r")
   public final int field2205;

   @deob.ObfuscatedName("bq.n(Lyw;ILjava/lang/String;)Lbq;")
   public static class348 method4212(class983 arg0, int arg1, String arg2) {
      int var3 = OpenGL.glCreateShader(arg1);
      OpenGL.glShaderSource(var3, arg2);
      OpenGL.glCompileShader(var3);
      OpenGL.glGetShaderiv(var3, 35713, field2204, 0);
      if (field2204[0] == 0) {
         if (field2204[0] == 0) {
            System.out.println("");
         }

         OpenGL.glGetShaderiv(var3, 35716, field2204, 1);
         if (field2204[1] > 1) {
            byte[] var4 = new byte[field2204[1]];
            OpenGL.glGetShaderInfoLog(var3, field2204[1], field2204, 0, var4, 0);
            System.out.println(new String(var4));
         }

         if (field2204[0] == 0) {
            OpenGL.glDeleteShader(var3);
            return null;
         }
      }

      return new class348(arg0, var3, arg1);
   }

   private class348(class983 arg0, int arg1, int arg2) {
      this.field2201 = arg0;
      this.field2205 = arg1;
   }

   public void finalize() throws Throwable {
      this.field2201.method16658((long)this.field2205);
      super.finalize();
   }
}
