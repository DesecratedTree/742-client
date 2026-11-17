import jaggl.OpenGL;

@deob.ObfuscatedName("xc")
public class class936 extends class354 {
   @deob.ObfuscatedName("xc.w")
   public final int field9479;

   public class936(class983 arg0, class372 arg1, class405 arg2, int arg3) {
      super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
      this.field9479 = arg3;
      this.field2264.method16639(this);

      for(int var5 = 0; var5 < 6; ++var5) {
         OpenGL.glTexImage2Dub(var5 + 34069, 0, class983.method16696(this.field2270, this.field2273), arg3, arg3, 0, class983.method16659(this.field2270), 5121, (byte[])null, 0);
      }

      this.method2448(true);
   }

   public class936(class983 arg0, class372 arg1, class405 arg2, int arg3, boolean arg4, int[][] arg5) {
      super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
      this.field9479 = arg3;
      this.field2264.method16639(this);
      if (arg4) {
         for(int var7 = 0; var7 < 6; ++var7) {
            method4283(var7 + 34069, class983.method16696(this.field2270, this.field2273), arg3, arg3, 32993, this.field2264.field10387, arg5[var7]);
         }
      } else {
         for(int var8 = 0; var8 < 6; ++var8) {
            OpenGL.glTexImage2Di(var8 + 34069, 0, class983.method16696(this.field2270, this.field2273), arg3, arg3, 0, 32993, this.field2264.field10387, arg5[var8], 0);
         }
      }

      this.method2448(true);
   }

   public class936(class983 arg0, class372 arg1, class405 arg2, int arg3, boolean arg4, byte[][] arg5, class372 arg6) {
      super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
      this.field9479 = arg3;
      this.field2264.method16639(this);

      for(int var8 = 0; var8 < 6; ++var8) {
         OpenGL.glTexImage2Dub(var8 + 34069, 0, class983.method16696(this.field2270, this.field2273), arg3, arg3, 0, class983.method16659(arg6), 5121, arg5[var8], 0);
      }

      this.method2448(true);
   }

   @deob.ObfuscatedName("xc.af(II)Ldm;")
   public class398 method15979(int arg0, int arg1) {
      return new class333(this, arg0, arg1);
   }
}
