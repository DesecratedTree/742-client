import jaggl.OpenGL;

@deob.ObfuscatedName("aho")
public class class206 extends class969 {
   @deob.ObfuscatedName("aho.d")
   private static final int[] field1368 = new int[4];
   @deob.ObfuscatedName("aho.n")
   private final class983 field1366;
   @deob.ObfuscatedName("aho.k")
   private class936 field1367;

   public class206(class983 arg0, int arg1) {
      this.field1366 = arg0;
      this.field1367 = new class936(arg0, class372.field2736, class405.field3052, arg1);
   }

   @deob.ObfuscatedName("aho.d()I")
   public int method2852() {
      return this.field1367.field9479;
   }

   @deob.ObfuscatedName("aho.n()Lxc;")
   public class936 method2786() {
      return this.field1367;
   }

   @deob.ObfuscatedName("aho.b(Lxc;Lxc;F)Z")
   public boolean method2853(class936 arg0, class936 arg1, float arg2) {
      boolean var4 = true;
      class173 var5 = this.field1366.field10260;
      this.field1366.method7511(field1368);
      this.field1366.method7508();
      this.field1366.method16672();
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glPushAttrib(2048);
      OpenGL.glViewport(0, 0, this.field1367.field9479, this.field1367.field9479);
      this.field1366.method16646(false);
      this.field1366.method16610(false);
      this.field1366.method16649(false);
      this.field1366.method16714(false);
      this.field1366.method16617(-2);
      this.field1366.method16638(1);
      this.field1366.method16711(0.0F, 0.0F, 0.0F, arg2);
      this.field1366.method16642(34165, 34165);
      this.field1366.method16639(arg1);
      this.field1366.method16638(0);
      this.field1366.method16640(1);
      this.field1366.method16639(arg0);
      this.field1366.method11502(var5);

      for(int var6 = 0; var6 < 6; ++var6) {
         int var7 = var6 + 34069;
         var5.method2351(0, this.field1367.method15979(var7, 0));
         var5.method2368(0);
         if (!var5.method2354()) {
            var4 = false;
            break;
         }

         OpenGL.glBegin(7);
         switch(var7) {
         case 34069:
            OpenGL.glTexCoord3i(65535, 65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65535, 65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65535, -65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(65535, -65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34070:
            OpenGL.glTexCoord3i(-65535, 65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, 65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, -65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65535, -65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34071:
            OpenGL.glTexCoord3i(-65534, 65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, 65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, 65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, 65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34072:
            OpenGL.glTexCoord3i(-65534, -65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, -65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, -65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34073:
            OpenGL.glTexCoord3i(-65534, 65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, 65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, -65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34074:
            OpenGL.glTexCoord3i(65534, 65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, 65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, -65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(65534, -65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
            OpenGL.glVertex2f(0.0F, 1.0F);
         }

         OpenGL.glEnd();
      }

      var5.method2351(0, (class398)null);
      this.field1366.method11503(var5);
      this.field1366.method16638(1);
      this.field1366.method16639((class354)null);
      this.field1366.method16642(8448, 8448);
      this.field1366.method16638(0);
      this.field1366.method16639((class354)null);
      OpenGL.glPopAttrib();
      this.field1366.method7716(field1368[0], field1368[1], field1368[2], field1368[3]);
      if (var4 && !this.field1366.field10363) {
         this.field1367.method4277();
      }

      return var4;
   }
}
