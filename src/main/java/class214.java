import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;

@deob.ObfuscatedName("ahw")
public final class class214 extends class979 {
   @deob.ObfuscatedName("ahw.gm")
   private class849 field1414 = new class849();
   @deob.ObfuscatedName("ahw.gl")
   private class849 field1415 = new class849();
   @deob.ObfuscatedName("ahw.gs")
   private class849 field1416 = new class849();
   @deob.ObfuscatedName("ahw.gf")
   private class849 field1421 = new class849();
   @deob.ObfuscatedName("ahw.gq")
   private class849 field1436 = new class849();
   @deob.ObfuscatedName("ahw.ge")
   private class849 field1419 = new class849();
   @deob.ObfuscatedName("ahw.gx")
   private class849 field1420 = new class849();
   @deob.ObfuscatedName("ahw.gt")
   private final int[] field1422 = new int[1000];
   @deob.ObfuscatedName("ahw.gg")
   private class48[] field1417 = new class48[16];
   @deob.ObfuscatedName("ahw.hg")
   private final float[] field1413;
   @deob.ObfuscatedName("ahw.ha")
   private final float[] field1442;
   @deob.ObfuscatedName("ahw.gd")
   public OpenGL field1439;
   @deob.ObfuscatedName("ahw.hf")
   private final String field1431;
   @deob.ObfuscatedName("ahw.hw")
   private final String field1432;
   @deob.ObfuscatedName("ahw.hm")
   private final int field1433;
   @deob.ObfuscatedName("ahw.he")
   public boolean field1434;
   @deob.ObfuscatedName("ahw.hz")
   private boolean field1435;
   @deob.ObfuscatedName("ahw.hn")
   private boolean field1429;
   @deob.ObfuscatedName("ahw.hc")
   private final boolean field1437;
   @deob.ObfuscatedName("ahw.hy")
   private final boolean field1438;
   @deob.ObfuscatedName("ahw.hu")
   public int[] field1428;
   @deob.ObfuscatedName("ahw.hr")
   public final int field1418;
   @deob.ObfuscatedName("ahw.gp")
   private int field1426;
   @deob.ObfuscatedName("ahw.go")
   private long field1441;
   @deob.ObfuscatedName("ahw.hl")
   public class17 field1425;
   @deob.ObfuscatedName("ahw.ho")
   private class43 field1430;
   @deob.ObfuscatedName("ahw.gk")
   private boolean field1423;
   @deob.ObfuscatedName("ahw.gh")
   private boolean field1424;
   @deob.ObfuscatedName("ahw.hb")
   private boolean field1427;
   @deob.ObfuscatedName("ahw.ga")
   private boolean field1440;

   public class214(OpenGL arg0, Canvas arg1, long arg2, class637 arg3, class612 arg4, int arg5) {
      super(arg3, arg4, arg5, 1);
      new MapBuffer();
      new MapBuffer();
      this.field1413 = new float[4];
      this.field1442 = new float[16];
      int[] var8 = new int[1];

      try {
         this.field1439 = arg0;
         this.field1439.method7848();
         this.field1431 = OpenGL.glGetString(7936).toLowerCase();
         this.field1432 = OpenGL.glGetString(7937).toLowerCase();
         if (this.field1431.indexOf("microsoft") == -1 && this.field1431.indexOf("brian paul") == -1 && this.field1431.indexOf("mesa") == -1) {
            String var9 = OpenGL.glGetString(7938);
            String[] var10 = Statics.method14220(var9.replace('.', ' '), ' ');
            if (var10.length >= 2) {
               try {
                  int var11 = class816.method5626(var10[0]);
                  int var12 = class816.method5626(var10[1]);
                  this.field1433 = var11 * 10 + var12;
               } catch (NumberFormatException var25) {
                  throw new RuntimeException("");
               }

               if (this.field1433 < 12) {
                  throw new RuntimeException("");
               } else {
                  OpenGL.glGetIntegerv(34018, var8, 0);
                  this.field10099 = var8[0];
                  if (this.field10099 < 2) {
                     throw new RuntimeException("");
                  } else {
                     this.field9982 = 8;
                     this.field1434 = this.field1439.method7847("GL_ARB_vertex_buffer_object");
                     this.field10114 = this.field1439.method7847("GL_ARB_multisample");
                     this.field1435 = this.field1439.method7847("GL_ARB_texture_rectangle");
                     this.field1439.method7847("GL_ARB_texture_cube_map");
                     this.field1429 = this.field1439.method7847("GL_ARB_texture_non_power_of_two");
                     this.field10115 = true;
                     this.field1437 = this.field1439.method7847("GL_ARB_vertex_shader");
                     this.field1439.method7847("GL_ARB_vertex_program");
                     this.field1438 = this.field1439.method7847("GL_ARB_fragment_shader");
                     this.field1439.method7847("GL_ARB_fragment_program");
                     this.field1439.method7847("GL_EXT_framebuffer_object");
                     this.field1428 = new int[this.field10099];
                     this.field10111 = this.field1439.method7847("GL_EXT_framebuffer_object");
                     this.field9972 = this.field1439.method7847("GL_EXT_framebuffer_blit");
                     this.field10080 = this.field1439.method7847("GL_EXT_framebuffer_multisample");
                     if (!this.method2631() || !this.method2498()) {
                        if (!this.field1439.method7847("GL_ARB_multitexture")) {
                           throw new RuntimeException("");
                        }

                        if (!this.field1439.method7847("GL_ARB_texture_env_combine")) {
                           throw new RuntimeException("");
                        }
                     }

                     this.field1418 = Stream.method7812() ? 33639 : 5121;
                     if (this.field1432.indexOf("radeon") != -1) {
                        int var14 = 0;
                        boolean var15 = false;
                        boolean var16 = false;
                        String[] var17 = Statics.method14220(this.field1432.replace('/', ' '), ' ');

                        for(int var18 = 0; var18 < var17.length; ++var18) {
                           String var19 = var17[var18];

                           try {
                              if (var19.length() > 0) {
                                 if (var19.charAt(0) == 'x' && var19.length() >= 3 && class816.method14597(var19.substring(1, 3))) {
                                    var19 = var19.substring(1);
                                    var16 = true;
                                 }

                                 if (var19.equals("hd")) {
                                    var15 = true;
                                 } else {
                                    if (var19.startsWith("hd")) {
                                       var19 = var19.substring(2);
                                       var15 = true;
                                    }

                                    if (var19.length() >= 4 && class816.method14597(var19.substring(0, 4))) {
                                       var14 = class816.method5626(var19.substring(0, 4));
                                       break;
                                    }
                                 }
                              }
                           } catch (Exception var26) {
                           }
                        }

                        if (!var16 && !var15) {
                           if (var14 >= 7000 && var14 <= 7999) {
                              this.field1434 = false;
                           }

                           if (var14 >= 7000 && var14 <= 9250) {
                              this.field10115 = false;
                           }
                        }

                        this.field1435 &= this.field1439.method7847("GL_ARB_half_float_pixel");
                     }

                     if (this.field1431.indexOf("intel") != -1) {
                     }

                     if (this.field1434) {
                        try {
                           int[] var21 = new int[1];
                           OpenGL.glGenBuffersARB(1, var21, 0);
                        } catch (Throwable var24) {
                           throw new RuntimeException("");
                        }
                     }

                     this.method11499(arg1, new class280(this, arg1, arg2));
                     this.method11519(arg1);
                     this.method16322(32768, false);
                     this.method16322(32768, false);
                  }
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var27) {
         var27.printStackTrace();
         this.method11494();
         if (var27 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var27;
         } else {
            throw new RuntimeException("");
         }
      }
   }

   @deob.ObfuscatedName("ahw.acm(Ljava/lang/String;)[B")
   public byte[] method2909(String arg0) {
      return this.method16308("gl", arg0);
   }

   @deob.ObfuscatedName("ahw.y(Ljava/lang/String;)Lev;")
   public class434 method2579(String arg0) {
      byte[] var2 = this.method2909(arg0);
      if (var2 == null) {
         return null;
      } else {
         class414 var3 = this.method16391(var2);
         return new class9(this, var3);
      }
   }

   @deob.ObfuscatedName("ahw.h()Z")
   public boolean method2631() {
      return this.field1437;
   }

   @deob.ObfuscatedName("ahw.z()Z")
   public boolean method2498() {
      return this.field1438;
   }

   @deob.ObfuscatedName("ahw.nj()V")
   protected void method2549() {
      OpenGL.glDepthFunc(515);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);

      for(int var1 = this.field10099 - 1; var1 >= 0; --var1) {
         OpenGL.glActiveTexture(var1 + 33984);
         OpenGL.glTexEnvi(8960, 8704, 34160);
         OpenGL.glTexEnvi(8960, 34161, 8448);
         OpenGL.glTexEnvi(8960, 34178, 34166);
         OpenGL.glTexEnvi(8960, 34162, 8448);
         OpenGL.glTexEnvi(8960, 34186, 34166);
      }

      OpenGL.glTexEnvi(8960, 34186, 34168);
      OpenGL.glShadeModel(7425);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var2 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var3 = 0; var3 < 8; ++var3) {
         int var4 = var3 + 16384;
         OpenGL.glLightfv(var4, 4608, var2, 0);
         OpenGL.glLightf(var4, 4615, 0.0F);
         OpenGL.glLightf(var4, 4616, 0.0F);
      }

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      this.field1439.setSwapInterval(0);
      super.method2549();
   }

   @deob.ObfuscatedName("ahw.s()Lcz;")
   public class384 method2505() {
      int var1 = -1;
      if (this.field1431.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if (this.field1431.indexOf("intel") != -1) {
         var1 = 32902;
      } else if (this.field1431.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new class384(var1, "OpenGL", this.field1433, this.field1432, 0L);
   }

   @deob.ObfuscatedName("ahw.u(II)V")
   protected void method2745(int arg0, int arg1) throws class165 {
      this.field7120.method542();
      if (this.field7118 != null) {
         this.field7118.method5113();
      }

   }

   @deob.ObfuscatedName("ahw.v()V")
   public void method2507() {
      OpenGL.glFinish();
   }

   @deob.ObfuscatedName("ahw.e()V")
   protected void method2508() {
      super.method2508();
      if (this.field1439 != null) {
         this.field1439.method7849();
         this.field1439.release();
         this.field1439 = null;
      }

   }

   @deob.ObfuscatedName("ahw.og()F")
   public float method2510() {
      return 0.0F;
   }

   @deob.ObfuscatedName("ahw.aq(Ljava/awt/Canvas;II)Lyc;")
   protected class963 method2512(Canvas arg0, int arg1, int arg2) {
      return new class280(this, arg0);
   }

   @deob.ObfuscatedName("ahw.ar()Lym;")
   public class973 method2513() {
      return new class277(this);
   }

   @deob.ObfuscatedName("ahw.as(IILcn;Ldt;I)Ldm;")
   public class398 method2679(int arg0, int arg1, class372 arg2, class405 arg3, int arg4) {
      return new class629(this, arg2, arg3, arg0, arg1, arg4);
   }

   @deob.ObfuscatedName("ahw.au(II)Ldh;")
   public class393 method2514(int arg0, int arg1) {
      return new class629(this, class372.field2738, class405.field3058, arg0, arg1);
   }

   @deob.ObfuscatedName("ahw.ad(III)Ldh;")
   public class393 method2649(int arg0, int arg1, int arg2) {
      return new class629(this, class372.field2738, class405.field3058, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ahw.am(IIII)[I")
   public int[] method2609(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = new int[arg2 * arg3];
      int var6 = this.field7109.method559();

      for(int var7 = 0; var7 < arg3; ++var7) {
         OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.field1418, var5, arg2 * var7);
      }

      return var5;
   }

   @deob.ObfuscatedName("ahw.aj()V")
   public void method2520() {
      if (this.field7109 != null) {
         int var1 = this.field7109.method566();
         int var2 = this.field7109.method559();
         if (var1 > 0 || var2 > 0) {
            int var3 = this.field10030;
            int var4 = this.field10031;
            int var5 = this.field10032;
            int var6 = this.field10061;
            this.method7503();
            int var7 = this.field10024;
            int var8 = this.field9966;
            int var9 = this.field10022;
            int var10 = this.field10023;
            this.method7508();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method16337();
            this.method16364(false);
            this.method16343(false);
            this.method16420(false);
            this.method16381(false);
            this.method16470((class536)null);
            this.method16353(1);
            this.method16521(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method7716(var7, var9, var8, var10);
            this.method7505(var3, var4, var5, var6);
         }
      }
   }

   @deob.ObfuscatedName("ahw.cb(Ldo;Ldo;FLdo;)Ldo;")
   public class400 method2521(class400 arg0, class400 arg1, float arg2, class400 arg3) {
      return arg2 < 0.5F ? arg0 : arg1;
   }

   @deob.ObfuscatedName("ahw.ba(II)V")
   public void method2522(int arg0, int arg1) {
      int var3 = 0;
      if ((arg0 & 1) != 0) {
         OpenGL.glClearColor((float)(arg1 & 16711680) / 1.671168E7F, (float)(arg1 & 65280) / 65280.0F, (float)(arg1 & 255) / 255.0F, (float)(arg1 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if ((arg0 & 2) != 0) {
         this.method16381(true);
         var3 |= 256;
      }

      if ((arg0 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   @deob.ObfuscatedName("ahw.od()V")
   protected void method2523() {
      if (this.field7109 != null) {
         OpenGL.glViewport(this.field10034 + this.field10030, this.field10035 + this.field7109.method559() - this.field10031 - this.field10061, this.field10032, this.field10061);
      }

      OpenGL.glDepthRange(this.field10016, this.field10118);
   }

   @deob.ObfuscatedName("ahw.oe()V")
   protected void method2765() {
      if (this.field7109 != null) {
         int var1 = this.field10034 + this.field10024;
         int var2 = this.field10035 + this.field7109.method559() - this.field10023;
         int var3 = this.field9966 - this.field10024;
         int var4 = this.field10023 - this.field10022;
         if (var3 < 0) {
            var3 = 0;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   @deob.ObfuscatedName("ahw.oj()V")
   protected void method2525() {
      if (this.field10072) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   @deob.ObfuscatedName("ahw.nu(Lko;Lko;Lko;)V")
   public void method2528(class597 arg0, class597 arg1, class597 arg2) {
      OpenGL.glMatrixMode(5888);
      this.field9995.method8387(arg0, arg1);
      OpenGL.glLoadMatrixf(this.field9995.field5413, 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(arg2.field5413, 0);
   }

   @deob.ObfuscatedName("ahw.os(Lko;)V")
   public void method2647(class597 arg0) {
      float[] var2 = arg0.field5413;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   @deob.ObfuscatedName("ahw.pz()V")
   protected void method2529() {
      if (this.field10038) {
         OpenGL.glEnable(2929);
      } else {
         OpenGL.glDisable(2929);
      }

   }

   @deob.ObfuscatedName("ahw.pn()V")
   protected void method2531() {
      OpenGL.glDepthMask(this.field10036 && this.field10037);
   }

   @deob.ObfuscatedName("ahw.pw()V")
   protected void method2697() {
      if (this.field10004 && !this.field10090) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   @deob.ObfuscatedName("ahw.pp()V")
   protected void method2533() {
      this.field1413[0] = this.field10050 * this.field10047;
      this.field1413[1] = this.field10050 * this.field10048;
      this.field1413[2] = this.field10058 * this.field10050;
      this.field1413[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.field1413, 0);
   }

   @deob.ObfuscatedName("ahw.pd()V")
   protected void method2534() {
      this.field1413[0] = this.field10051 * this.field10047;
      this.field1413[1] = this.field10051 * this.field10048;
      this.field1413[2] = this.field10058 * this.field10051;
      this.field1413[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, this.field1413, 0);
      this.field1413[0] = -this.field9996 * this.field10047;
      this.field1413[1] = -this.field9996 * this.field10048;
      this.field1413[2] = -this.field9996 * this.field10058;
      this.field1413[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, this.field1413, 0);
   }

   @deob.ObfuscatedName("ahw.pe()V")
   protected void method2535() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field10066.field5413, 0);
      OpenGL.glLightfv(16384, 4611, this.field10042, 0);
      OpenGL.glLightfv(16385, 4611, this.field10043, 0);
   }

   @deob.ObfuscatedName("ahw.pa()V")
   protected void method2536() {
      if (this.field10075) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   @deob.ObfuscatedName("ahw.po()V")
   protected void method2732() {
   }

   @deob.ObfuscatedName("ahw.pu()V")
   protected void method2538() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field10066.field5413, 0);

      int var1;
      for(var1 = 0; var1 < this.field10055; ++var1) {
         class81 var2 = this.field9962[var1];
         int var3 = var2.method1113();
         int var4 = var1 + 16386;
         float var5 = var2.method1114() / 255.0F;
         this.field1413[0] = (float)var2.method1123();
         this.field1413[1] = (float)var2.method1110();
         this.field1413[2] = (float)var2.method1111();
         this.field1413[3] = 1.0F;
         OpenGL.glLightfv(var4, 4611, this.field1413, 0);
         this.field1413[0] = (float)(var3 >> 16 & 255) * var5;
         this.field1413[1] = (float)(var3 >> 8 & 255) * var5;
         this.field1413[2] = (float)(var3 & 255) * var5;
         this.field1413[3] = 1.0F;
         OpenGL.glLightfv(var4, 4609, this.field1413, 0);
         OpenGL.glLightf(var4, 4617, 1.0F / (float)(var2.method1112() * var2.method1112()));
         OpenGL.glEnable(var4);
      }

      while(var1 < this.field10045) {
         OpenGL.glDisable(var1 + 16386);
         ++var1;
      }

   }

   @deob.ObfuscatedName("ahw.pj(Lcn;Ldt;)Z")
   public boolean method2735(class372 arg0, class405 arg1) {
      return true;
   }

   @deob.ObfuscatedName("ahw.pt(Lcn;Ldt;)Z")
   public boolean method2540(class372 arg0, class405 arg1) {
      return this.field10115;
   }

   @deob.ObfuscatedName("ahw.py(Lcn;Ldt;II)Lhr;")
   public class511 method2541(class372 arg0, class405 arg1, int arg2, int arg3) {
      return this.method2545(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ahw.qu(IIZ[III)Lhr;")
   public class511 method2542(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
      if (!this.field1429 && (!class887.method15054(arg0) || !class887.method15054(arg1))) {
         if (this.field1435) {
            return new class30(this, arg0, arg1, arg3, arg4, arg5);
         } else {
            class32 var7 = new class32(this, class372.field2736, class405.field3052, class887.method4053(arg0), class887.method4053(arg1));
            var7.method498(0, 0, arg0, arg1, arg3, arg4, arg5);
            return var7;
         }
      } else {
         return new class32(this, arg0, arg1, arg2, arg3, arg4, arg5);
      }
   }

   @deob.ObfuscatedName("ahw.ph(Lcn;IIZ[BII)Lhr;")
   protected class511 method2543(class372 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
      if (!this.field1429 && (!class887.method15054(arg1) || !class887.method15054(arg2))) {
         if (this.field1435) {
            return new class30(this, arg0, arg1, arg2, arg4, arg5, arg6);
         } else {
            class32 var8 = new class32(this, arg0, class405.field3052, class887.method4053(arg1), class887.method4053(arg2));
            var8.method499(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
            return var8;
         }
      } else {
         return new class32(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
      }
   }

   @deob.ObfuscatedName("ahw.qj(Lcn;IIZ[FII)Lhr;")
   protected class511 method2544(class372 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
      if (!this.field1429 && (!class887.method15054(arg1) || !class887.method15054(arg2))) {
         if (this.field1435) {
            return new class30(this, arg0, arg1, arg2, arg4, arg5, arg6);
         } else {
            class32 var8 = new class32(this, arg0, class405.field3057, class887.method4053(arg1), class887.method4053(arg2));
            var8.method571(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
            return var8;
         }
      } else {
         return new class32(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
      }
   }

   @deob.ObfuscatedName("ahw.qk(Lcn;Ldt;II)Lii;")
   public class529 method2545(class372 arg0, class405 arg1, int arg2, int arg3) {
      if (!this.field1429 && (!class887.method15054(arg2) || !class887.method15054(arg3))) {
         return this.field1435 ? new class30(this, arg0, arg1, arg2, arg3) : new class32(this, arg0, arg1, class887.method4053(arg2), class887.method4053(arg3));
      } else {
         return new class32(this, arg0, arg1, arg2, arg3);
      }
   }

   @deob.ObfuscatedName("ahw.qi(IZ[[I)Lio;")
   public class535 method2596(int arg0, boolean arg1, int[][] arg2) {
      return new class45(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ahw.qh(Lcn;IIIZ[B)Lga;")
   public class467 method2547(class372 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
      return new class33(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ahw.qb()V")
   public void method2551() {
      int var1 = this.field1428[this.field10113];
      if (var1 != 0) {
         this.field1428[this.field10113] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   @deob.ObfuscatedName("ahw.qo()V")
   protected void method2552() {
      OpenGL.glMatrixMode(5890);
      if (this.field10063[this.field10113] != class503.field4043) {
         OpenGL.glLoadMatrixf(this.field10062[this.field10113].method8412(this.field1442), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }

   @deob.ObfuscatedName("ahw.qv()V")
   protected void method2695() {
      OpenGL.glActiveTexture(this.field10113 + 33984);
   }

   @deob.ObfuscatedName("ahw.qw()V")
   protected void method2554() {
      OpenGL.glTexEnvi(8960, 34161, method2906(this.field10064[this.field10113]));
   }

   @deob.ObfuscatedName("ahw.rr()V")
   protected void method2555() {
      OpenGL.glTexEnvi(8960, 34162, method2906(this.field10025[this.field10113]));
   }

   @deob.ObfuscatedName("ahw.qg(ILhk;ZZ)V")
   protected final void method2556(int arg0, class504 arg1, boolean arg2, boolean arg3) {
      OpenGL.glTexEnvi(8960, arg0 + 34176, method2898(arg1));
      if (arg2) {
         OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
      } else {
         OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
      }

   }

   @deob.ObfuscatedName("ahw.qc(ILhk;Z)V")
   protected final void method2557(int arg0, class504 arg1, boolean arg2) {
      OpenGL.glTexEnvi(8960, arg0 + 34184, method2898(arg1));
      OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
   }

   @deob.ObfuscatedName("ahw.qm()V")
   protected final void method2558() {
      this.field1413[0] = (float)(this.field9969 & 16711680) / 1.671168E7F;
      this.field1413[1] = (float)(this.field9969 & 65280) / 65280.0F;
      this.field1413[2] = (float)(this.field9969 & 255) / 255.0F;
      this.field1413[3] = (float)(this.field9969 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.field1413, 0);
   }

   @deob.ObfuscatedName("ahw.acy(Lhx;)I")
   private static final int method2906(class517 arg0) {
      if (class517.field4110 == arg0) {
         return 7681;
      } else if (class517.field4109 == arg0) {
         return 8448;
      } else if (class517.field4113 == arg0) {
         return 34165;
      } else if (class517.field4111 == arg0) {
         return 260;
      } else if (class517.field4112 == arg0) {
         return 34023;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("ahw.acq(Lhk;)I")
   private static final int method2898(class504 arg0) {
      if (class504.field4047 == arg0) {
         return 5890;
      } else if (class504.field4050 == arg0) {
         return 34167;
      } else if (class504.field4048 == arg0) {
         return 34168;
      } else if (class504.field4046 == arg0) {
         return 34166;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("ahw.rd(I)V")
   public void method2562(int arg0) {
      OpenGL.glColorMask((arg0 & 1) != 0, (arg0 & 2) != 0, (arg0 & 4) != 0, (arg0 & 8) != 0);
   }

   @deob.ObfuscatedName("ahw.rv()V")
   protected void method2563() {
      if (this.field10102) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

   }

   @deob.ObfuscatedName("ahw.rk()V")
   protected void method2509() {
      byte var1 = 0;
      byte var2 = 0;
      if (this.field10130 == 0) {
         var1 = 0;
         var2 = 0;
      } else if (this.field10130 == 1) {
         var1 = 1;
         var2 = 0;
      } else if (this.field10130 == 2) {
         var1 = 1;
         var2 = 1;
      }

      if (class513.field4079 == this.field10100) {
         OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
      } else if (class513.field4080 == this.field10100) {
         OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
      } else if (class513.field4083 == this.field10100) {
         OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
      }

   }

   @deob.ObfuscatedName("ahw.rc()V")
   protected void method2565() {
      if (this.field10101) {
         OpenGL.glEnable(3042);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   @deob.ObfuscatedName("ahw.rw()V")
   protected void method2566() {
      if (this.field10093 && this.field10092 && this.field10065 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   @deob.ObfuscatedName("ahw.rz()V")
   protected void method2550() {
      this.field10060 = this.field10021 - (float)this.field10041;
      this.field10109 = this.field10060 - (float)this.field10065;
      if (this.field10109 < this.field10020) {
         this.field10109 = this.field10020;
      }

      if (this.field9973) {
         OpenGL.glFogf(2915, this.field10109);
         OpenGL.glFogf(2916, this.field10060);
         this.field1413[0] = (float)(this.field10112 & 16711680) / 1.671168E7F;
         this.field1413[1] = (float)(this.field10112 & 65280) / 65280.0F;
         this.field1413[2] = (float)(this.field10112 & 255) / 255.0F;
         OpenGL.glFogfv(2918, this.field1413, 0);
      }

   }

   @deob.ObfuscatedName("ahw.rt(Z)V")
   protected void method2607(boolean arg0) {
      if (arg0) {
         OpenGL.glEnable(32925);
      } else {
         OpenGL.glDisable(32925);
      }

   }

   @deob.ObfuscatedName("ahw.rm(Z)Lho;")
   public final class508 method2570(boolean arg0) {
      return new class48(this, arg0);
   }

   @deob.ObfuscatedName("ahw.ro(Z)Lin;")
   public final class534 method2569(boolean arg0) {
      return new class43(this, class405.field3053, arg0);
   }

   @deob.ObfuscatedName("ahw.ra([Lhp;)Lhl;")
   public class505 method2571(class509[] arg0) {
      return new class40(arg0);
   }

   @deob.ObfuscatedName("ahw.rx(ILho;)V")
   public void method2539(int arg0, class508 arg1) {
      this.field1417[arg0] = (class48)arg1;
   }

   @deob.ObfuscatedName("ahw.rp(Lin;)V")
   public void method2624(class534 arg0) {
      this.field1430 = (class43)arg0;
      this.field1430.method8740();
   }

   @deob.ObfuscatedName("ahw.re(Lhl;)V")
   public void method2572(class505 arg0) {
      class509[] var2 = arg0.field4051;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      for(int var7 = 0; var7 < var2.length; ++var7) {
         class509 var8 = var2[var7];
         class48 var9 = this.field1417[var7];
         int var10 = 0;
         int var11 = var9.method729();
         long var12 = var9.method8739();
         var9.method8740();

         for(int var14 = 0; var14 < var8.method7137(); ++var14) {
            class496 var15 = var8.method7138(var14);
            switch(var15.field3998) {
            case 0:
               OpenGL.glColorPointer(4, 5121, var11, (long)var10 + var12);
               var4 = true;
               break;
            case 1:
               OpenGL.glClientActiveTexture(33984 + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, (long)var10 + var12);
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            default:
               break;
            case 6:
               OpenGL.glNormalPointer(5126, var11, (long)var10 + var12);
               var5 = true;
               break;
            case 7:
               OpenGL.glClientActiveTexture(33984 + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, (long)var10 + var12);
               break;
            case 8:
               OpenGL.glClientActiveTexture(33984 + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, (long)var10 + var12);
               break;
            case 10:
               OpenGL.glVertexPointer(3, 5126, var11, (long)var10 + var12);
               var6 = true;
               break;
            case 11:
               OpenGL.glClientActiveTexture(33984 + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, (long)var10 + var12);
            }

            var10 += var15.field4002;
         }
      }

      if (this.field1440 != var6) {
         if (var6) {
            OpenGL.glEnableClientState(32884);
         } else {
            OpenGL.glDisableClientState(32884);
         }

         this.field1440 = var6;
      }

      if (this.field1423 != var5) {
         if (var5) {
            OpenGL.glEnableClientState(32885);
         } else {
            OpenGL.glDisableClientState(32885);
         }

         this.field1423 = var5;
      }

      if (this.field1424 != var4) {
         if (var4) {
            OpenGL.glEnableClientState(32886);
         } else {
            OpenGL.glDisableClientState(32886);
         }

         this.field1424 = var4;
      }

      if (this.field1426 < var3) {
         for(int var16 = this.field1426; var16 < var3; ++var16) {
            OpenGL.glClientActiveTexture(var16 + 33984);
            OpenGL.glEnableClientState(32888);
         }

         this.field1426 = var3;
      } else if (this.field1426 > var3) {
         for(int var17 = var3; var17 < this.field1426; ++var17) {
            OpenGL.glClientActiveTexture(var17 + 33984);
            OpenGL.glDisableClientState(32888);
         }

         this.field1426 = var3;
      }

   }

   @deob.ObfuscatedName("ahw.rs(Lib;II)V")
   public final void method2575(class522 arg0, int arg1, int arg2) {
      byte var4;
      int var5;
      if (class522.field4134 == arg0) {
         var4 = 1;
         var5 = arg2 * 2;
      } else if (class522.field4130 == arg0) {
         var4 = 3;
         var5 = arg2 + 1;
      } else if (class522.field4132 == arg0) {
         var4 = 4;
         var5 = arg2 * 3;
      } else if (class522.field4129 == arg0) {
         var4 = 6;
         var5 = arg2 + 2;
      } else if (class522.field4133 == arg0) {
         var4 = 5;
         var5 = arg2 + 2;
      } else {
         var4 = 0;
         var5 = arg2;
      }

      OpenGL.glDrawArrays(var4, arg1, var5);
   }

   @deob.ObfuscatedName("ahw.rg(Lin;Lib;IIII)V")
   public final void method2736(class534 arg0, class522 arg1, int arg2, int arg3, int arg4, int arg5) {
      byte var7;
      int var8;
      if (class522.field4134 == arg1) {
         var7 = 1;
         var8 = arg5 * 2;
      } else if (class522.field4130 == arg1) {
         var7 = 3;
         var8 = arg5 + 1;
      } else if (class522.field4132 == arg1) {
         var7 = 4;
         var8 = arg5 * 3;
      } else if (class522.field4129 == arg1) {
         var7 = 6;
         var8 = arg5 + 2;
      } else if (class522.field4133 == arg1) {
         var7 = 5;
         var8 = arg5 + 2;
      } else {
         var7 = 0;
         var8 = arg5;
      }

      class405 var9 = arg0.method694();
      class43 var10 = (class43)arg0;
      var10.method8740();
      OpenGL.glDrawElements(var7, var8, method2918(var9), var10.method8739() + (long)(var9.field3055 * arg4));
   }

   @deob.ObfuscatedName("ahw.rb(Lib;IIII)V")
   public final void method2577(class522 arg0, int arg1, int arg2, int arg3, int arg4) {
      byte var6;
      int var7;
      if (class522.field4134 == arg0) {
         var6 = 1;
         var7 = arg4 * 2;
      } else if (class522.field4130 == arg0) {
         var6 = 3;
         var7 = arg4 + 1;
      } else if (class522.field4132 == arg0) {
         var6 = 4;
         var7 = arg4 * 3;
      } else if (class522.field4129 == arg0) {
         var6 = 6;
         var7 = arg4 + 2;
      } else if (class522.field4133 == arg0) {
         var6 = 5;
         var7 = arg4 + 2;
      } else {
         var6 = 0;
         var7 = arg4;
      }

      class405 var8 = this.field1430.method694();
      OpenGL.glDrawElements(var6, var7, method2918(var8), this.field1430.method8739() + (long)(var8.field3055 * arg3));
   }

   @deob.ObfuscatedName("ahw.i(I)V")
   public final synchronized void method2580(int arg0) {
      int var2 = 0;
      int var3 = arg0 & Integer.MAX_VALUE;

      while(!this.field1415.method15024()) {
         class108 var4 = (class108)this.field1415.method14961();
         this.field1422[var2++] = (int)var4.field6137;
         this.field9983 -= var4.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, this.field1422, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, this.field1422, 0);
         var2 = 0;
      }

      while(!this.field1416.method15024()) {
         class108 var5 = (class108)this.field1416.method14961();
         this.field1422[var2++] = (int)var5.field6137;
         this.field10017 -= var5.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteTextures(var2, this.field1422, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteTextures(var2, this.field1422, 0);
         var2 = 0;
      }

      while(!this.field1421.method15024()) {
         class108 var6 = (class108)this.field1421.method14961();
         this.field1422[var2++] = var6.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.field1422, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, this.field1422, 0);
         var2 = 0;
      }

      while(!this.field1436.method15024()) {
         class108 var7 = (class108)this.field1436.method14961();
         this.field1422[var2++] = (int)var7.field6137;
         this.field9984 -= var7.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.field1422, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, this.field1422, 0);
         boolean var8 = false;
      }

      while(!this.field1414.method15024()) {
         class108 var9 = (class108)this.field1414.method14961();
         OpenGL.glDeleteLists((int)var9.field6137, var9.field811);
      }

      while(!this.field1419.method15024()) {
         class674 var10 = this.field1419.method14961();
         OpenGL.glDeleteProgram((int)var10.field6137);
      }

      while(!this.field1420.method15024()) {
         class674 var11 = this.field1420.method14961();
         OpenGL.glDeleteShader((int)var11.field6137);
      }

      while(!this.field1414.method15024()) {
         class108 var12 = (class108)this.field1414.method14961();
         OpenGL.glDeleteLists((int)var12.field6137, var12.field811);
      }

      if (this.method7488() > 100663296 && class431.method2169() > this.field1441 + 60000L) {
         System.gc();
         this.field1441 = class431.method2169();
      }

      super.method2580(var3);
   }

   @deob.ObfuscatedName("ahw.aco(II)V")
   public final synchronized void method2897(int arg0, int arg1) {
      class108 var3 = new class108(arg1);
      var3.field6137 = (long)arg0;
      this.field1415.method14959(var3);
   }

   @deob.ObfuscatedName("ahw.acz(II)V")
   public final synchronized void method2921(int arg0, int arg1) {
      class108 var3 = new class108(arg1);
      var3.field6137 = (long)arg0;
      this.field1416.method14959(var3);
   }

   @deob.ObfuscatedName("ahw.acg(I)V")
   public final synchronized void method2895(int arg0) {
      class108 var2 = new class108(arg0);
      this.field1421.method14959(var2);
   }

   @deob.ObfuscatedName("ahw.acb(II)V")
   public final synchronized void method2891(int arg0, int arg1) {
      class108 var3 = new class108(arg1);
      var3.field6137 = (long)arg0;
      this.field1436.method14959(var3);
   }

   private final synchronized void add(int arg0, int arg1) {
      class108 var3 = new class108(arg1);
      var3.field6137 = (long)arg0;
      this.field1436.method14959(var3);
   }

   @deob.ObfuscatedName("ahw.act(J)V")
   public final synchronized void method2894(long arg0) {
      class674 var3 = new class674();
      var3.field6137 = arg0;
      this.field1420.method14959(var3);
   }

   @deob.ObfuscatedName("ahw.acu(I)V")
   public final synchronized void method2899(int arg0) {
      class674 var2 = new class674();
      var2.field6137 = (long)arg0;
      this.field1419.method14959(var2);
   }

   @deob.ObfuscatedName("ahw.ada(Ldt;)I")
   public static final int method2918(class405 arg0) {
      switch(arg0.field3054) {
      case 0:
         return 5125;
      case 1:
         return 5120;
      case 2:
         return 5131;
      case 3:
         return 5124;
      case 4:
         return 5126;
      case 5:
         return 5122;
      case 6:
         return 5123;
      case 7:
         return 5121;
      default:
         return 5121;
      }
   }

   @deob.ObfuscatedName("ahw.adl(Lcn;)I")
   public static int method2900(class372 arg0) {
      switch(arg0.field2743) {
      case 0:
         return 6410;
      case 1:
         return 6409;
      case 2:
      case 4:
      case 7:
      default:
         throw new IllegalStateException();
      case 3:
         return 6408;
      case 5:
         return 6407;
      case 6:
         return 6402;
      case 8:
         return 6406;
      }
   }

   @deob.ObfuscatedName("ahw.adr(Lcn;Ldt;)I")
   public static int method2903(class372 arg0, class405 arg1) {
      if (class405.field3052 == arg1) {
         switch(arg0.field2743) {
         case 0:
            return 6410;
         case 1:
            return 6409;
         case 2:
            return 33779;
         case 3:
            return 6408;
         case 4:
         case 6:
         case 7:
         default:
            throw new IllegalArgumentException();
         case 5:
            return 6407;
         case 8:
            return 6406;
         case 9:
            return 33777;
         }
      } else if (class405.field3053 == arg1) {
         switch(arg0.field2743) {
         case 0:
            return 36219;
         case 1:
            return 32834;
         case 2:
         case 4:
         case 7:
         default:
            throw new IllegalArgumentException();
         case 3:
            return 32859;
         case 5:
            return 32852;
         case 6:
            return 33189;
         case 8:
            return 32830;
         }
      } else if (class405.field3058 == arg1) {
         switch(arg0.field2743) {
         case 6:
            return 33190;
         default:
            throw new IllegalArgumentException();
         }
      } else if (class405.field3056 == arg1) {
         switch(arg0.field2743) {
         case 0:
            return 34847;
         case 1:
            return 34846;
         case 2:
         case 4:
         case 6:
         case 7:
         default:
            throw new IllegalArgumentException();
         case 3:
            return 34842;
         case 5:
            return 34843;
         case 8:
            return 34844;
         }
      } else if (class405.field3057 == arg1) {
         switch(arg0.field2743) {
         case 0:
            return 34841;
         case 1:
            return 34840;
         case 2:
         case 4:
         case 6:
         case 7:
         default:
            throw new IllegalArgumentException();
         case 3:
            return 34836;
         case 5:
            return 34837;
         case 8:
            return 34838;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("ahw.dc(Z)V")
   public void method2506(boolean arg0) {
   }

   @deob.ObfuscatedName("ahw.sg(I)V")
   public void method2500(int arg0) {
      if (!this.field1427) {
         OpenGL.glPolygonMode(1028, (arg0 & 2) != 0 ? 6913 : 6914);
      }

   }
}
