import jaggl.OpenGL;

@deob.ObfuscatedName("bg")
public class class338 {
   @deob.ObfuscatedName("bg.n")
   private static final int[] field2139 = new int[2];
   @deob.ObfuscatedName("bg.k")
   private final class983 field2138;
   @deob.ObfuscatedName("bg.d")
   public final int field2137;

   @deob.ObfuscatedName("bg.n(Lyw;[Lbq;)Lbg;")
   public static class338 method4142(class983 arg0, class348[] arg1) {
      for(int var2 = 0; var2 < arg1.length; ++var2) {
         if (arg1[var2] == null || arg1[var2].field2205 <= 0) {
            return null;
         }
      }

      int var3 = OpenGL.glCreateProgram();

      for(int var4 = 0; var4 < arg1.length; ++var4) {
         OpenGL.glAttachShader(var3, arg1[var4].field2205);
      }

      OpenGL.glLinkProgram(var3);
      OpenGL.glGetProgramiv(var3, 35714, field2139, 0);
      if (field2139[0] == 0) {
         OpenGL.glGetProgramiv(var3, 35716, field2139, 1);
         if (field2139[1] > 1) {
            byte[] var5 = new byte[field2139[1]];
            OpenGL.glGetProgramInfoLog(var3, field2139[1], field2139, 0, var5, 0);
            System.out.println(new String(var5));
         }

         if (field2139[0] == 0) {
            for(int var6 = 0; var6 < arg1.length; ++var6) {
               OpenGL.glDetachShader(var3, arg1[var6].field2205);
            }

            OpenGL.glDeleteProgram(var3);
            return null;
         }
      }

      return new class338(arg0, var3, arg1);
   }

   private class338(class983 arg0, int arg1, class348[] arg2) {
      this.field2138 = arg0;
      this.field2137 = arg1;
   }

   public void finalize() throws Throwable {
      this.field2138.method16658((long)this.field2137);
      super.finalize();
   }
}
