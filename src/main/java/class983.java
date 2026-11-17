import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;

@deob.ObfuscatedName("yw")
public class class983 extends class772 {
   @deob.ObfuscatedName("yw.bt")
   private class343 field10257 = new class343();
   @deob.ObfuscatedName("yw.be")
   private class597 field10258 = new class597();
   @deob.ObfuscatedName("yw.bb")
   public class597 field10259 = new class597();
   @deob.ObfuscatedName("yw.bu")
   private class583 field10379 = new class583();
   @deob.ObfuscatedName("yw.co")
   public int field10263 = 8;
   @deob.ObfuscatedName("yw.ca")
   public int field10264 = 3;
   @deob.ObfuscatedName("yw.ce")
   private boolean field10398 = false;
   @deob.ObfuscatedName("yw.cj")
   private class849 field10279 = new class849();
   @deob.ObfuscatedName("yw.cs")
   private class849 field10271 = new class849();
   @deob.ObfuscatedName("yw.cg")
   private class849 field10272 = new class849();
   @deob.ObfuscatedName("yw.cp")
   private class849 field10273 = new class849();
   @deob.ObfuscatedName("yw.cv")
   private class849 field10299 = new class849();
   @deob.ObfuscatedName("yw.cr")
   private class849 field10275 = new class849();
   @deob.ObfuscatedName("yw.cc")
   private class849 field10221 = new class849();
   @deob.ObfuscatedName("yw.cx")
   private class849 field10242 = new class849();
   @deob.ObfuscatedName("yw.cq")
   private class583 field10287 = new class583();
   @deob.ObfuscatedName("yw.dr")
   public class597 field10269 = new class597();
   @deob.ObfuscatedName("yw.do")
   public class597 field10289 = new class597();
   @deob.ObfuscatedName("yw.df")
   public class597 field10290 = new class597();
   @deob.ObfuscatedName("yw.dk")
   private class597 field10291 = new class597();
   @deob.ObfuscatedName("yw.de")
   public class597 field10292 = new class597();
   @deob.ObfuscatedName("yw.dp")
   public float[][] field10336 = new float[6][4];
   @deob.ObfuscatedName("yw.dh")
   public float[] field10294 = new float[4];
   @deob.ObfuscatedName("yw.dq")
   private float field10238 = 0.0F;
   @deob.ObfuscatedName("yw.db")
   private float field10300 = 1.0F;
   @deob.ObfuscatedName("yw.dt")
   public float field10392 = 0.0F;
   @deob.ObfuscatedName("yw.dv")
   public float field10302 = -1.0F;
   @deob.ObfuscatedName("yw.dj")
   public class583 field10303 = new class583();
   @deob.ObfuscatedName("yw.di")
   public class597 field10304 = new class597();
   @deob.ObfuscatedName("yw.dx")
   public class597 field10255 = new class597();
   @deob.ObfuscatedName("yw.dl")
   public float[] field10306 = new float[16];
   @deob.ObfuscatedName("yw.dg")
   private boolean field10308 = true;
   @deob.ObfuscatedName("yw.du")
   private int field10309 = 0;
   @deob.ObfuscatedName("yw.dn")
   private int field10310 = 0;
   @deob.ObfuscatedName("yw.dz")
   private int field10388 = 0;
   @deob.ObfuscatedName("yw.dd")
   private int field10312 = 0;
   @deob.ObfuscatedName("yw.dy")
   private int field10313 = 0;
   @deob.ObfuscatedName("yw.ea")
   private int field10314 = 0;
   @deob.ObfuscatedName("yw.ek")
   private float[] field10322 = new float[4];
   @deob.ObfuscatedName("yw.ew")
   private float[] field10323 = new float[4];
   @deob.ObfuscatedName("yw.el")
   public float[] field10324 = new float[4];
   @deob.ObfuscatedName("yw.ei")
   private float[] field10325 = new float[4];
   @deob.ObfuscatedName("yw.ex")
   private int field10337 = -1;
   @deob.ObfuscatedName("yw.eo")
   public float field10327 = 1.0F;
   @deob.ObfuscatedName("yw.em")
   public float field10215 = 1.0F;
   @deob.ObfuscatedName("yw.en")
   public float field10329 = 1.0F;
   @deob.ObfuscatedName("yw.ej")
   public float field10288 = -1.0F;
   @deob.ObfuscatedName("yw.ez")
   public float field10332 = -1.0F;
   @deob.ObfuscatedName("yw.eh")
   private class81[] field10333 = new class81[field10253];
   @deob.ObfuscatedName("yw.ey")
   public int field10339 = -1;
   @deob.ObfuscatedName("yw.fs")
   public int field10340 = -1;
   @deob.ObfuscatedName("yw.fk")
   public int field10261 = 0;
   @deob.ObfuscatedName("yw.fl")
   private float field10344 = 1.0F;
   @deob.ObfuscatedName("yw.fo")
   private float field10372 = 0.0F;
   @deob.ObfuscatedName("yw.fb")
   private boolean field10347 = false;
   @deob.ObfuscatedName("yw.fw")
   private int field10353 = 8448;
   @deob.ObfuscatedName("yw.fe")
   private int field10354 = 8448;
   @deob.ObfuscatedName("yw.gh")
   private float field10236 = -1.0F;
   @deob.ObfuscatedName("yw.ga")
   private float field10224 = -1.0F;
   @deob.ObfuscatedName("yw.gp")
   public class971[] field10390 = new class971[7];
   @deob.ObfuscatedName("yw.gg")
   public class971[] field10391 = new class971[7];
   @deob.ObfuscatedName("yw.he")
   public class268 field10296 = new class268(8192);
   @deob.ObfuscatedName("yw.hz")
   public int[] field10235 = new int[1];
   @deob.ObfuscatedName("yw.hn")
   public int[] field10400 = new int[1];
   @deob.ObfuscatedName("yw.hc")
   public int[] field10401 = new int[1];
   @deob.ObfuscatedName("yw.hy")
   public final byte[] field10402 = new byte[16384];
   @deob.ObfuscatedName("yw.bj")
   public int field10252;
   @deob.ObfuscatedName("yw.bo")
   public OpenGL field10251;
   @deob.ObfuscatedName("yw.fx")
   public boolean field10274;
   @deob.ObfuscatedName("yw.gk")
   public final int field10387;
   @deob.ObfuscatedName("yw.fa")
   private String field10362;
   @deob.ObfuscatedName("yw.gy")
   private boolean field10375;
   @deob.ObfuscatedName("yw.gd")
   public boolean field10377;
   @deob.ObfuscatedName("yw.gf")
   public boolean field10381;
   @deob.ObfuscatedName("yw.gs")
   public boolean field10389;
   @deob.ObfuscatedName("yw.gr")
   private boolean field10265;
   @deob.ObfuscatedName("yw.fm")
   public boolean field10363;
   @deob.ObfuscatedName("yw.fg")
   private String field10301;
   @deob.ObfuscatedName("yw.gb")
   public boolean field10331;
   @deob.ObfuscatedName("yw.gt")
   private boolean field10386;
   @deob.ObfuscatedName("yw.bv")
   public final class364 field10297;
   @deob.ObfuscatedName("yw.bl")
   public class363 field10213;
   @deob.ObfuscatedName("yw.bi")
   private class359 field10227;
   @deob.ObfuscatedName("yw.bz")
   private class217 field10256;
   @deob.ObfuscatedName("yw.bd")
   private class345 field10254;
   @deob.ObfuscatedName("yw.cu")
   private static int[] field10228 = new int[1000];
   @deob.ObfuscatedName("yw.ec")
   private static int field10253 = 4;
   @deob.ObfuscatedName("yw.hw")
   private static final float[] field10361 = new float[4];
   @deob.ObfuscatedName("yw.hm")
   private static final float[] field10397 = new float[4];
   @deob.ObfuscatedName("yw.ds")
   public float field10277;
   @deob.ObfuscatedName("yw.dm")
   public float field10295;
   @deob.ObfuscatedName("yw.et")
   public float field10330;
   @deob.ObfuscatedName("yw.dc")
   public float field10338;
   @deob.ObfuscatedName("yw.fc")
   public float field10342;
   @deob.ObfuscatedName("yw.fn")
   private float field10343;
   @deob.ObfuscatedName("yw.dw")
   public float field10356;
   @deob.ObfuscatedName("yw.eb")
   public int field10208;
   @deob.ObfuscatedName("yw.gj")
   private int field10214;
   @deob.ObfuscatedName("yw.ck")
   private int field10229;
   @deob.ObfuscatedName("yw.cl")
   private int field10232;
   @deob.ObfuscatedName("yw.gi")
   public int field10237;
   @deob.ObfuscatedName("yw.cd")
   public int field10262;
   @deob.ObfuscatedName("yw.cw")
   public int field10268;
   @deob.ObfuscatedName("yw.cy")
   private int field10280;
   @deob.ObfuscatedName("yw.da")
   private int field10307;
   @deob.ObfuscatedName("yw.fd")
   private int field10311;
   @deob.ObfuscatedName("yw.ef")
   private int field10315;
   @deob.ObfuscatedName("yw.cb")
   private int field10316;
   @deob.ObfuscatedName("yw.ed")
   private int field10317;
   @deob.ObfuscatedName("yw.ee")
   private int field10318;
   @deob.ObfuscatedName("yw.es")
   private int field10326;
   @deob.ObfuscatedName("yw.eq")
   private int field10334;
   @deob.ObfuscatedName("yw.ev")
   private int field10335;
   @deob.ObfuscatedName("yw.ft")
   public int field10348;
   @deob.ObfuscatedName("yw.fq")
   private int field10352;
   @deob.ObfuscatedName("yw.fh")
   private int field10364;
   @deob.ObfuscatedName("yw.gn")
   private int field10368;
   @deob.ObfuscatedName("yw.ep")
   public int field10370;
   @deob.ObfuscatedName("yw.cm")
   public int field10374;
   @deob.ObfuscatedName("yw.ch")
   private long field10278;
   @deob.ObfuscatedName("yw.ho")
   public class173 field10260;
   @deob.ObfuscatedName("yw.fp")
   private class186 field10360;
   @deob.ObfuscatedName("yw.hu")
   public class340 field10393;
   @deob.ObfuscatedName("yw.hl")
   public class340 field10394;
   @deob.ObfuscatedName("yw.fj")
   private class341 field10351;
   @deob.ObfuscatedName("yw.hf")
   private class341 field10395;
   @deob.ObfuscatedName("yw.ff")
   private class369 field10350;
   @deob.ObfuscatedName("yw.fr")
   public class402 field10349;
   @deob.ObfuscatedName("yw.fv")
   public class939 field10358;
   @deob.ObfuscatedName("yw.fi")
   private class969 field10249;
   @deob.ObfuscatedName("yw.cf")
   public NativeHeap field10267;
   @deob.ObfuscatedName("yw.eg")
   private boolean field10222;
   @deob.ObfuscatedName("yw.gw")
   public boolean field10266;
   @deob.ObfuscatedName("yw.gc")
   private boolean field10276;
   @deob.ObfuscatedName("yw.ci")
   private boolean field10283;
   @deob.ObfuscatedName("yw.cz")
   private boolean field10284;
   @deob.ObfuscatedName("yw.ct")
   private boolean field10285;
   @deob.ObfuscatedName("yw.gl")
   private boolean field10286;
   @deob.ObfuscatedName("yw.cn")
   private boolean field10298;
   @deob.ObfuscatedName("yw.er")
   private boolean field10320;
   @deob.ObfuscatedName("yw.eu")
   private boolean field10321;
   @deob.ObfuscatedName("yw.fz")
   public boolean field10346;
   @deob.ObfuscatedName("yw.fu")
   private boolean field10355;
   @deob.ObfuscatedName("yw.gu")
   public boolean field10366;
   @deob.ObfuscatedName("yw.gv")
   public boolean field10371;
   @deob.ObfuscatedName("yw.gz")
   private boolean field10373;
   @deob.ObfuscatedName("yw.gm")
   public boolean field10378;
   @deob.ObfuscatedName("yw.gq")
   public boolean field10382;
   @deob.ObfuscatedName("yw.ge")
   public boolean field10383;
   @deob.ObfuscatedName("yw.gx")
   public boolean field10384;
   @deob.ObfuscatedName("yw.go")
   public boolean field10385;
   @deob.ObfuscatedName("yw.fy")
   private class354[] field10357;

   public class983(Canvas arg0, class637 arg1, int arg2) {
      super(arg1);

      try {
         this.field10252 = arg2;
         if (!class926.method5940().method9973("jaclib")) {
            throw new RuntimeException("");
         } else if (!class926.method5940().method9973("jaggl")) {
            throw new RuntimeException("");
         } else {
            this.field10251 = new OpenGL();
            long var4 = this.field10251.init(arg0, 8, 8, 8, 24, 0, this.field10252);
            if (var4 == 0L) {
               throw new RuntimeException("");
            } else {
               this.method16671();
               int var6 = this.method16739();
               if (var6 != 0) {
                  throw new RuntimeException("");
               } else {
                  this.field10387 = this.field10274 ? 33639 : 5121;
                  if (this.field10362.indexOf("radeon") != -1) {
                     int var7 = 0;
                     boolean var8 = false;
                     boolean var9 = false;
                     String[] var10 = Statics.method14220(this.field10362.replace('/', ' '), ' ');

                     for(int var11 = 0; var11 < var10.length; ++var11) {
                        String var12 = var10[var11];

                        try {
                           if (var12.length() > 0) {
                              if (var12.charAt(0) == 'x' && var12.length() >= 3 && class816.method14597(var12.substring(1, 3))) {
                                 var12 = var12.substring(1);
                                 var9 = true;
                              }

                              if (var12.equals("hd")) {
                                 var8 = true;
                              } else {
                                 if (var12.startsWith("hd")) {
                                    var12 = var12.substring(2);
                                    var8 = true;
                                 }

                                 if (var12.length() >= 4 && class816.method14597(var12.substring(0, 4))) {
                                    var7 = class816.method5626(var12.substring(0, 4));
                                    break;
                                 }
                              }
                           }
                        } catch (Exception var18) {
                        }
                     }

                     if (!var9 && !var8) {
                        if (var7 >= 7000 && var7 <= 7999) {
                           this.field10375 = false;
                        }

                        if (var7 >= 7000 && var7 <= 9250) {
                           this.field10377 = false;
                        }
                     }

                     if (!var8 || var7 < 4000) {
                        this.field10381 = false;
                     }

                     this.field10389 &= this.field10251.method7847("GL_ARB_half_float_pixel");
                     this.field10265 = this.field10375;
                     this.field10363 = true;
                  }

                  if (this.field10301.indexOf("intel") != -1) {
                     this.field10331 = false;
                  }

                  this.field10386 = !this.field10301.equals("s3 graphics");
                  if (this.field10375) {
                     try {
                        int[] var14 = new int[1];
                        OpenGL.glGenBuffersARB(1, var14, 0);
                     } catch (Throwable var17) {
                        throw new RuntimeException("");
                     }
                  }

                  class789.method6469(false, true);
                  this.field10398 = true;
                  this.field10297 = new class364(this, this.field7118);
                  this.method16747();
                  this.field10213 = new class363(this);
                  this.field10227 = new class359(this);
                  if (this.field10227.method4420()) {
                     this.field10256 = new class217(this);
                     if (!this.field10256.method2941()) {
                        this.field10256.method925();
                        this.field10256 = null;
                     }
                  }

                  this.method11499(arg0, new class210(this, arg0, var4));
                  this.method11519(arg0);
                  this.field10254 = new class345(this);
                  this.method16592();
                  this.method2520();
               }
            }
         }
      } catch (Throwable var19) {
         var19.printStackTrace();
         this.method11494();
         if (var19 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var19;
         } else {
            throw new RuntimeException("");
         }
      }
   }

   @deob.ObfuscatedName("yw.n()V")
   private void method16671() {
      int var1 = 0;

      while(!this.field10251.method7848()) {
         if (var1++ > 5) {
            throw new RuntimeException("");
         }

         Statics.method14813(1000L);
      }

   }

   @deob.ObfuscatedName("yw.k()I")
   private int method16739() {
      int var1 = 0;
      this.field10301 = OpenGL.glGetString(7936).toLowerCase();
      this.field10362 = OpenGL.glGetString(7937).toLowerCase();
      if (this.field10301.indexOf("microsoft") != -1) {
         var1 |= 1;
      }

      if (this.field10301.indexOf("brian paul") != -1 || this.field10301.indexOf("mesa") != -1) {
         var1 |= 1;
      }

      String var2 = OpenGL.glGetString(7938);
      String[] var3 = Statics.method14220(var2.replace('.', ' '), ' ');
      if (var3.length >= 2) {
         try {
            int var4 = class816.method5626(var3[0]);
            int var5 = class816.method5626(var3[1]);
            this.field10364 = var4 * 10 + var5;
         } catch (NumberFormatException var8) {
            var1 |= 4;
         }
      } else {
         var1 |= 4;
      }

      if (this.field10364 < 12) {
         var1 |= 2;
      }

      if (!this.field10251.method7847("GL_ARB_multitexture")) {
         var1 |= 8;
      }

      if (!this.field10251.method7847("GL_ARB_texture_env_combine")) {
         var1 |= 32;
      }

      int[] var7 = new int[1];
      OpenGL.glGetIntegerv(34018, var7, 0);
      this.field10237 = var7[0];
      OpenGL.glGetIntegerv(34929, var7, 0);
      this.field10368 = var7[0];
      OpenGL.glGetIntegerv(34930, var7, 0);
      this.field10214 = var7[0];
      if (this.field10237 < 2 || this.field10368 < 2 || this.field10214 < 2) {
         var1 |= 16;
      }

      this.field10274 = Stream.method7812();
      this.field10375 = this.field10251.method7847("GL_ARB_vertex_buffer_object");
      this.field10373 = this.field10251.method7847("GL_ARB_multisample");
      this.field10383 = this.field10251.method7847("GL_ARB_vertex_program");
      this.field10251.method7847("GL_ARB_fragment_program");
      this.field10384 = this.field10251.method7847("GL_ARB_vertex_shader");
      this.field10385 = this.field10251.method7847("GL_ARB_fragment_shader");
      this.field10377 = this.field10251.method7847("GL_EXT_texture3D");
      this.field10389 = this.field10251.method7847("GL_ARB_texture_rectangle");
      this.field10378 = this.field10251.method7847("GL_ARB_texture_cube_map");
      this.field10286 = this.field10251.method7847("GL_ARB_seamless_cube_map");
      this.field10381 = this.field10251.method7847("GL_ARB_texture_float");
      this.field10382 = false;
      this.field10331 = this.field10251.method7847("GL_EXT_framebuffer_object");
      this.field10371 = this.field10251.method7847("GL_EXT_framebuffer_blit");
      this.field10266 = this.field10251.method7847("GL_EXT_framebuffer_multisample");
      this.field10276 = this.field10371 & this.field10266;
      this.field10366 = class931.field9436.startsWith("mac");
      OpenGL.glGetFloatv(2834, field10361, 0);
      this.field10224 = field10361[0];
      this.field10236 = field10361[1];
      return var1 != 0 ? var1 : 0;
   }

   @deob.ObfuscatedName("yw.d()V")
   private void method16747() {
      this.field10357 = new class354[this.field10237];
      this.field10358 = new class939(this, 3553, class372.field2736, class405.field3052, 1, 1);
      new class939(this, 3553, class372.field2736, class405.field3052, 1, 1);
      new class939(this, 3553, class372.field2736, class405.field3052, 1, 1);

      for(int var1 = 0; var1 < 7; ++var1) {
         this.field10390[var1] = new class971(this);
         this.field10391[var1] = new class971(this);
      }

      if (this.field10331) {
         this.field10260 = new class173(this);
         new class173(this);
      }

   }

   @deob.ObfuscatedName("yw.h()V")
   private void method16592() {
      this.method16617(-2);

      for(int var1 = this.field10237 - 1; var1 >= 0; --var1) {
         this.method16638(var1);
         this.method16639((class354)null);
         OpenGL.glTexEnvi(8960, 8704, 34160);
      }

      this.method16642(8448, 8448);
      this.method16643(2, 34168, 770);
      this.method16622();
      this.field10232 = 1;
      OpenGL.glEnable(3042);
      OpenGL.glBlendFunc(770, 771);
      this.field10316 = 1;
      OpenGL.glEnable(3008);
      OpenGL.glAlphaFunc(516, 0.0F);
      this.field10284 = true;
      OpenGL.glColorMask(true, true, true, true);
      this.field10283 = true;
      this.method16646(true);
      this.method16610(true);
      this.method16649(true);
      this.method16714(true);
      this.method7507(0.0F, 1.0F);
      this.method16672();
      this.field10251.setSwapInterval(0);
      OpenGL.glShadeModel(7425);
      OpenGL.glClearDepth(1.0F);
      OpenGL.glDepthFunc(515);
      OpenGL.glPolygonMode(1028, 6914);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
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

      OpenGL.glEnable(16384);
      OpenGL.glEnable(16385);
      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      if (this.field10286) {
         OpenGL.glEnable(34895);
      }

      this.field10339 = -1;
      this.field10337 = -1;
      this.method7503();
      this.method7508();
   }

   @deob.ObfuscatedName("yw.s()Lcz;")
   public class384 method2505() {
      int var1 = -1;
      if (this.field10301.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if (this.field10301.indexOf("intel") != -1) {
         var1 = 32902;
      } else if (this.field10301.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new class384(var1, "OpenGL", this.field10364, this.field10362, 0L);
   }

   @deob.ObfuscatedName("yw.u(II)V")
   protected void method2745(int arg0, int arg1) throws class165 {
      try {
         this.field7120.method542();
      } catch (Exception var4) {
      }

      if (this.field7118 != null) {
         this.field7118.method5113();
      }

   }

   @deob.ObfuscatedName("yw.v()V")
   public void method2507() {
      OpenGL.glFinish();
   }

   @deob.ObfuscatedName("yw.e()V")
   protected void method2508() {
      for(class674 var1 = this.field10279.method14964(); var1 != null; var1 = this.field10279.method15006()) {
         ((class193)var1).method2492();
      }

      if (this.field10227 != null) {
         this.field10227.method4429();
      }

      if (this.field10398) {
         class789.method9269(false, true);
         this.field10398 = false;
      }

   }

   @deob.ObfuscatedName("yw.t()Z")
   public boolean method7489() {
      return true;
   }

   @deob.ObfuscatedName("yw.w()Z")
   public boolean method7490() {
      return true;
   }

   @deob.ObfuscatedName("yw.j()Z")
   public boolean method7491() {
      return true;
   }

   @deob.ObfuscatedName("yw.ai()Z")
   public boolean method7492() {
      return this.field10256 != null && (this.field10252 <= 1 || this.field10276);
   }

   @deob.ObfuscatedName("yw.ap()Z")
   public boolean method7668() {
      return true;
   }

   @deob.ObfuscatedName("yw.f()Z")
   public boolean method7494() {
      return true;
   }

   @deob.ObfuscatedName("yw.av()Z")
   public boolean method7495() {
      return this.field10373 && (!this.method7574() || this.field10276);
   }

   @deob.ObfuscatedName("yw.ax()Z")
   public boolean method7496() {
      return true;
   }

   @deob.ObfuscatedName("yw.z()Z")
   public boolean method16801() {
      return this.field10254.method4202(3);
   }

   @deob.ObfuscatedName("yw.af()Z")
   public boolean method7497() {
      return true;
   }

   @deob.ObfuscatedName("yw.at()Z")
   public boolean method7484() {
      return false;
   }

   @deob.ObfuscatedName("yw.aq(Ljava/awt/Canvas;II)Lyc;")
   protected class963 method2512(Canvas arg0, int arg1, int arg2) {
      return new class210(this, arg0);
   }

   @deob.ObfuscatedName("yw.q()V")
   public void method16598() {
      this.method16599();
   }

   @deob.ObfuscatedName("yw.y()V")
   public void method16599() {
      int var1 = this.field7109.method566();
      int var2 = this.field7109.method559();
      this.field10291.method8397(0.0F, (float)var1, 0.0F, (float)var2, -1.0F, 1.0F);
      this.method7503();
      this.method16672();
      this.method7508();
   }

   @deob.ObfuscatedName("yw.am(IIII)[I")
   public int[] method2609(int arg0, int arg1, int arg2, int arg3) {
      if (this.field7109 == null) {
         return null;
      } else {
         int[] var5 = new int[arg2 * arg3];
         int var6 = this.field7109.method559();

         for(int var7 = 0; var7 < arg3; ++var7) {
            OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.field10387, var5, arg2 * var7);
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("yw.aj()V")
   public void method2520() {
      if (this.field10386 && this.field7109 != null) {
         int var1 = this.field10388;
         int var2 = this.field10312;
         int var3 = this.field10309;
         int var4 = this.field10310;
         this.method7508();
         int var5 = this.field10315;
         int var6 = this.field10326;
         int var7 = this.field10317;
         int var8 = this.field10318;
         this.method7503();
         OpenGL.glReadBuffer(1028);
         OpenGL.glDrawBuffer(1029);
         this.method16672();
         this.method16646(false);
         this.method16610(false);
         this.method16649(false);
         this.method16714(false);
         this.method16639((class354)null);
         this.method16617(-2);
         this.method16640(1);
         this.method16652(0);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glRasterPos2i(0, 0);
         OpenGL.glCopyPixels(0, 0, this.field7109.method566(), this.field7109.method559(), 6144);
         OpenGL.glFlush();
         OpenGL.glReadBuffer(1029);
         OpenGL.glDrawBuffer(1029);
         this.method7716(var1, var3, var2, var4);
         this.method7505(var5, var6, var7, var8);
      }
   }

   @deob.ObfuscatedName("yw.ba(II)V")
   public void method2522(int arg0, int arg1) {
      int var3 = 0;
      if ((arg0 & 1) != 0) {
         OpenGL.glClearColor((float)(arg1 & 16711680) / 1.671168E7F, (float)(arg1 & 65280) / 65280.0F, (float)(arg1 & 255) / 255.0F, (float)(arg1 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if ((arg0 & 2) != 0) {
         this.method16714(true);
         var3 |= 256;
      }

      if ((arg0 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   @deob.ObfuscatedName("yw.bq(IIIIII)V")
   public void method7751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      float var7 = (float)arg0 + 0.35F;
      float var8 = (float)arg1 + 0.35F;
      float var9 = (float)arg2 + var7 - 1.0F;
      float var10 = (float)arg3 + var8 - 1.0F;
      this.method16669();
      this.method16652(arg5);
      OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
      if (this.field10373) {
         OpenGL.glDisable(32925);
      }

      OpenGL.glBegin(2);
      OpenGL.glVertex2f(var7, var8);
      OpenGL.glVertex2f(var7, var10);
      OpenGL.glVertex2f(var9, var10);
      OpenGL.glVertex2f(var9, var8);
      OpenGL.glEnd();
      if (this.field10373) {
         OpenGL.glEnable(32925);
      }

   }

   @deob.ObfuscatedName("yw.B(IIIIII)V")
   public void method7513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      float var7 = (float)arg0 + 0.35F;
      float var8 = (float)arg1 + 0.35F;
      float var9 = (float)arg2 + var7;
      float var10 = (float)arg3 + var8;
      this.method16669();
      this.method16652(arg5);
      OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
      if (this.field10373) {
         OpenGL.glDisable(32925);
      }

      OpenGL.glBegin(7);
      OpenGL.glVertex2f(var7, var8);
      OpenGL.glVertex2f(var7, var10);
      OpenGL.glVertex2f(var9, var10);
      OpenGL.glVertex2f(var9, var8);
      OpenGL.glEnd();
      if (this.field10373) {
         OpenGL.glEnable(32925);
      }

   }

   @deob.ObfuscatedName("yw.N(IIIIII[BII)V")
   public void method7769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      float var10;
      float var11;
      if (this.field10360 != null && this.field10360.field9486 >= arg2 && this.field10360.field9485 >= arg3) {
         this.field10360.method15983(0, 0, arg2, arg3, arg6, class372.field2735, 0, 0, false);
         var10 = (float)arg3 * this.field10360.field1205 / (float)this.field10360.field9485;
         var11 = (float)arg2 * this.field10360.field1206 / (float)this.field10360.field9486;
      } else {
         this.field10360 = class186.method2453(this, class372.field2735, class405.field3052, arg2, arg3, false, arg6, class372.field2735);
         this.field10360.method15984(false, false);
         var10 = this.field10360.field1205;
         var11 = this.field10360.field1206;
      }

      this.method16634();
      this.method16639(this.field10360);
      this.method16652(arg8);
      OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
      this.method16604(arg5);
      this.method16642(34165, 34165);
      this.method16643(0, 34166, 768);
      this.method16643(2, 5890, 770);
      this.method16616(0, 34166, 770);
      this.method16616(2, 5890, 770);
      float var12 = (float)arg0;
      float var13 = (float)arg1;
      float var14 = (float)arg2 + var12;
      float var15 = (float)arg3 + var13;
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var12, var13);
      OpenGL.glTexCoord2f(0.0F, var11);
      OpenGL.glVertex2f(var12, var15);
      OpenGL.glTexCoord2f(var10, var11);
      OpenGL.glVertex2f(var14, var15);
      OpenGL.glTexCoord2f(var10, 0.0F);
      OpenGL.glVertex2f(var14, var13);
      OpenGL.glEnd();
      this.method16643(0, 5890, 768);
      this.method16643(2, 34166, 770);
      this.method16616(0, 5890, 770);
      this.method16616(2, 34166, 770);
   }

   @deob.ObfuscatedName("yw.by(IIFIIFIIFIIII)V")
   public void method7475(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
      this.method16669();
      this.method16652(arg12);
      OpenGL.glBegin(4);
      OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
      OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, arg2);
      OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
      OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, arg5);
      OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
      OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, arg8);
      OpenGL.glEnd();
   }

   @deob.ObfuscatedName("yw.CA(IIIII)V")
   protected void method7519(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg2 < 0) {
         arg2 = -arg2;
      }

      if (arg0 + arg2 >= this.field10388 && arg0 - arg2 <= this.field10312 && arg1 + arg2 >= this.field10309 && arg1 - arg2 <= this.field10310) {
         this.method16669();
         this.method16652(arg4);
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         int var8 = arg2 << 1;
         if ((float)var8 < this.field10224) {
            OpenGL.glBegin(7);
            OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
            OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
            OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
            OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
            OpenGL.glEnd();
         } else {
            if ((float)var8 <= this.field10236) {
               OpenGL.glEnable(2832);
               OpenGL.glPointSize((float)var8);
               OpenGL.glBegin(0);
               OpenGL.glVertex2f(var6, var7);
               OpenGL.glEnd();
               OpenGL.glDisable(2832);
            } else {
               OpenGL.glBegin(6);
               OpenGL.glVertex2f(var6, var7);
               int var9 = 262144 / (arg2 * 6);
               if (var9 <= 64) {
                  var9 = 64;
               } else if (var9 > 512) {
                  var9 = 512;
               }

               int var10 = class887.method14787(var9);
               OpenGL.glVertex2f((float)arg2 + var6, var7);

               for(int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                  OpenGL.glVertex2f(class373.field2745[var11] * (float)arg2 + var6, class373.field2746[var11] * (float)arg2 + var7);
               }

               OpenGL.glVertex2f((float)arg2 + var6, var7);
               OpenGL.glEnd();
            }

         }
      }
   }

   @deob.ObfuscatedName("yw.XA(IIIII)V")
   public void method7514(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method16669();
      this.method16652(arg4);
      float var6 = (float)arg0 + 0.35F;
      float var7 = (float)arg1 + 0.35F;
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glVertex2f(var6, var7);
      OpenGL.glVertex2f((float)arg2 + var6, var7);
      OpenGL.glEnd();
   }

   @deob.ObfuscatedName("yw.G(IIIII)V")
   public void method7516(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method16669();
      this.method16652(arg4);
      float var6 = (float)arg0 + 0.35F;
      float var7 = (float)arg1 + 0.35F;
      OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glVertex2f(var6, var7);
      OpenGL.glVertex2f(var6, (float)arg2 + var7);
      OpenGL.glEnd();
   }

   @deob.ObfuscatedName("yw.bx(IIIIII)V")
   public void method7517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method16669();
      this.method16652(arg5);
      float var7 = (float)arg2 - (float)arg0;
      float var8 = (float)arg3 - (float)arg1;
      float var9;
      if (var7 == 0.0F && var8 == 0.0F) {
         var9 = 1.0F;
      } else {
         float var10 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
         var9 = var7 * var10;
         var8 *= var10;
      }

      OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
      OpenGL.glVertex2f((float)arg2 + var9 + 0.35F, (float)arg3 + var8 + 0.35F);
      OpenGL.glEnd();
   }

   @deob.ObfuscatedName("yw.bh(IIIIIIIII)V")
   public void method7522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg0 != arg2 || arg1 != arg3) {
         this.method16669();
         this.method16652(arg5);
         float var10 = (float)arg2 - (float)arg0;
         float var11 = (float)arg3 - (float)arg1;
         float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11)));
         float var13 = var10 * var12;
         float var14 = var11 * var12;
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         int var15 = arg8 % (arg6 + arg7);
         float var16 = (float)arg6 * var13;
         float var17 = (float)arg6 * var14;
         float var18 = 0.0F;
         float var19 = 0.0F;
         float var20 = var16;
         float var21 = var17;
         if (var15 > arg6) {
            var18 = (float)(arg6 + arg7 - var15) * var13;
            var19 = (float)(arg6 + arg7 - var15) * var14;
         } else {
            var20 = (float)(arg6 - var15) * var13;
            var21 = (float)(arg6 - var15) * var14;
         }

         float var22 = (float)arg0 + 0.35F + var18;
         float var23 = (float)arg1 + 0.35F + var19;
         float var24 = (float)arg7 * var13;
         float var25 = (float)arg7 * var14;

         while(true) {
            if (arg2 > arg0) {
               if (var22 > (float)arg2 + 0.35F) {
                  break;
               }

               if (var20 + var22 > (float)arg2) {
                  var20 = (float)arg2 - var22;
               }
            } else {
               if (var22 < (float)arg2 + 0.35F) {
                  break;
               }

               if (var20 + var22 < (float)arg2) {
                  var20 = (float)arg2 - var22;
               }
            }

            if (arg3 > arg1) {
               if (var23 > (float)arg3 + 0.35F) {
                  break;
               }

               if (var21 + var23 > (float)arg3) {
                  var21 = (float)arg3 - var23;
               }
            } else {
               if (var23 < (float)arg3 + 0.35F) {
                  break;
               }

               if (var21 + var23 < (float)arg3) {
                  var21 = (float)arg3 - var23;
               }
            }

            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var22, var23);
            OpenGL.glVertex2f(var20 + var22, var21 + var23);
            OpenGL.glEnd();
            var22 += var20 + var24;
            var23 += var21 + var25;
            var20 = var16;
            var21 = var17;
         }

      }
   }

   @deob.ObfuscatedName("yw.bm(IIIIIILta;II)V")
   public void method7518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8) {
      class980 var10 = (class980)arg6;
      class186 var11 = var10.field10131;
      this.method16634();
      this.method16639(var10.field10131);
      this.method16652(arg5);
      this.method16642(7681, 8448);
      this.method16643(0, 34167, 768);
      float var12 = var11.field1206 / (float)var11.field1203;
      float var13 = var11.field1205 / (float)var11.field1204;
      float var14 = (float)arg2 - (float)arg0;
      float var15 = (float)arg3 - (float)arg1;
      float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
      float var17 = var14 * var16;
      float var18 = var15 * var16;
      OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glTexCoord2f((float)(arg0 - arg7) * var12, (float)(arg1 - arg8) * var13);
      OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
      OpenGL.glTexCoord2f((float)(arg2 - arg7) * var12, (float)(arg3 - arg8) * var13);
      OpenGL.glVertex2f((float)arg2 + var17 + 0.35F, (float)arg3 + var18 + 0.35F);
      OpenGL.glEnd();
      this.method16643(0, 5890, 768);
   }

   @deob.ObfuscatedName("yw.bn(IIIIIILta;IIIII)V")
   public void method7521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      if (arg0 != arg2 || arg1 != arg3) {
         class980 var13 = (class980)arg6;
         class186 var14 = var13.field10131;
         this.method16634();
         this.method16639(var13.field10131);
         this.method16652(arg5);
         this.method16642(7681, 8448);
         this.method16643(0, 34167, 768);
         float var15 = var14.field1206 / (float)var14.field1203;
         float var16 = var14.field1205 / (float)var14.field1204;
         float var17 = (float)arg2 - (float)arg0;
         float var18 = (float)arg3 - (float)arg1;
         float var19 = (float)(1.0D / Math.sqrt((double)(var17 * var17 + var18 * var18)));
         float var20 = var17 * var19;
         float var21 = var18 * var19;
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         int var22 = arg11 % (arg9 + arg10);
         float var23 = (float)arg9 * var20;
         float var24 = (float)arg9 * var21;
         float var25 = 0.0F;
         float var26 = 0.0F;
         float var27 = var23;
         float var28 = var24;
         if (var22 > arg9) {
            var25 = (float)(arg9 + arg10 - var22) * var20;
            var26 = (float)(arg9 + arg10 - var22) * var21;
         } else {
            var27 = (float)(arg9 - var22) * var20;
            var28 = (float)(arg9 - var22) * var21;
         }

         float var29 = (float)arg0 + 0.35F + var25;
         float var30 = (float)arg1 + 0.35F + var26;
         float var31 = (float)arg10 * var20;
         float var32 = (float)arg10 * var21;

         while(true) {
            if (arg2 > arg0) {
               if (var29 > (float)arg2 + 0.35F) {
                  break;
               }

               if (var27 + var29 > (float)arg2) {
                  var27 = (float)arg2 - var29;
               }
            } else {
               if (var29 < (float)arg2 + 0.35F) {
                  break;
               }

               if (var27 + var29 < (float)arg2) {
                  var27 = (float)arg2 - var29;
               }
            }

            if (arg3 > arg1) {
               if (var30 > (float)arg3 + 0.35F) {
                  break;
               }

               if (var28 + var30 > (float)arg3) {
                  var28 = (float)arg3 - var30;
               }
            } else {
               if (var30 < (float)arg3 + 0.35F) {
                  break;
               }

               if (var28 + var30 < (float)arg3) {
                  var28 = (float)arg3 - var30;
               }
            }

            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f((var29 - (float)arg7) * var15, (var30 - (float)arg8) * var16);
            OpenGL.glVertex2f(var29, var30);
            OpenGL.glTexCoord2f((var27 + var29 - (float)arg7) * var15, (var28 + var30 - (float)arg8) * var16);
            OpenGL.glVertex2f(var27 + var29, var28 + var30);
            OpenGL.glEnd();
            var29 += var27 + var31;
            var30 += var28 + var32;
            var27 = var23;
            var28 = var24;
         }

         this.method16643(0, 5890, 768);
      }
   }

   @deob.ObfuscatedName("yw.bk(IIIIIII)V")
   public void method7727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      OpenGL.glLineWidth((float)arg5);
      this.method7517(arg0, arg1, arg2, arg3, arg4, arg6);
      OpenGL.glLineWidth(1.0F);
   }

   @deob.ObfuscatedName("yw.dh(FFF[F)V")
   public void method7736(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field10292.field5413[11] * arg2 + this.field10292.field5413[7] * arg1 + this.field10292.field5413[3] * arg0 + this.field10292.field5413[15];
      float var6 = this.field10292.field5413[8] * arg2 + this.field10292.field5413[4] * arg1 + this.field10292.field5413[0] * arg0 + this.field10292.field5413[12];
      float var7 = this.field10292.field5413[9] * arg2 + this.field10292.field5413[5] * arg1 + this.field10292.field5413[1] * arg0 + this.field10292.field5413[13];
      float var8 = this.field10269.field5413[10] * arg2 + this.field10269.field5413[6] * arg1 + this.field10269.field5413[2] * arg0 + this.field10269.field5413[14];
      arg3[0] = this.field10356 * var6 / var5 + this.field10338;
      arg3[1] = this.field10295 * var7 / var5 + this.field10277;
      arg3[2] = var8;
   }

   @deob.ObfuscatedName("yw.dp(FFF[F)V")
   public void method7525(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field10292.field5413[10] * arg2 + this.field10292.field5413[6] * arg1 + this.field10292.field5413[2] * arg0 + this.field10292.field5413[14];
      float var6 = this.field10292.field5413[11] * arg2 + this.field10292.field5413[7] * arg1 + this.field10292.field5413[3] * arg0 + this.field10292.field5413[15];
      if (!(var5 < -var6) && !(var5 > var6)) {
         float var7 = this.field10292.field5413[8] * arg2 + this.field10292.field5413[4] * arg1 + this.field10292.field5413[0] * arg0 + this.field10292.field5413[12];
         if (!(var7 < -var6) && !(var7 > var6)) {
            float var8 = this.field10292.field5413[9] * arg2 + this.field10292.field5413[5] * arg1 + this.field10292.field5413[1] * arg0 + this.field10292.field5413[13];
            if (!(var8 < -var6) && !(var8 > var6)) {
               float var9 = this.field10269.field5413[10] * arg2 + this.field10269.field5413[6] * arg1 + this.field10269.field5413[2] * arg0 + this.field10269.field5413[14];
               arg3[0] = this.field10356 * var7 / var6 + this.field10338;
               arg3[1] = this.field10295 * var8 / var6 + this.field10277;
               arg3[2] = var9;
            } else {
               arg3[2] = Float.NaN;
               arg3[1] = Float.NaN;
               arg3[0] = Float.NaN;
            }
         } else {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
         }
      } else {
         arg3[2] = Float.NaN;
         arg3[1] = Float.NaN;
         arg3[0] = Float.NaN;
      }
   }

   @deob.ObfuscatedName("yw.bo(IIIIII)I")
   public int method7523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = this.field10292.field5413[10] * (float)arg2 + this.field10292.field5413[6] * (float)arg1 + this.field10292.field5413[2] * (float)arg0 + this.field10292.field5413[14];
      float var9 = this.field10292.field5413[10] * (float)arg5 + this.field10292.field5413[6] * (float)arg4 + this.field10292.field5413[2] * (float)arg3 + this.field10292.field5413[14];
      float var10 = this.field10292.field5413[11] * (float)arg2 + this.field10292.field5413[7] * (float)arg1 + this.field10292.field5413[3] * (float)arg0 + this.field10292.field5413[15];
      float var11 = this.field10292.field5413[11] * (float)arg5 + this.field10292.field5413[7] * (float)arg4 + this.field10292.field5413[3] * (float)arg3 + this.field10292.field5413[15];
      if (var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if (var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.field10292.field5413[8] * (float)arg2 + this.field10292.field5413[4] * (float)arg1 + this.field10292.field5413[0] * (float)arg0 + this.field10292.field5413[12];
      float var13 = this.field10292.field5413[8] * (float)arg5 + this.field10292.field5413[4] * (float)arg4 + this.field10292.field5413[0] * (float)arg3 + this.field10292.field5413[12];
      if (var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if (var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.field10292.field5413[9] * (float)arg2 + this.field10292.field5413[5] * (float)arg1 + this.field10292.field5413[1] * (float)arg0 + this.field10292.field5413[13];
      float var15 = this.field10292.field5413[9] * (float)arg5 + this.field10292.field5413[5] * (float)arg4 + this.field10292.field5413[1] * (float)arg3 + this.field10292.field5413[13];
      if (var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if (var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   @deob.ObfuscatedName("yw.bj(I)Lv;")
   public class879 method7526(int arg0) {
      class193 var2 = new class193(arg0);
      this.field10279.method14959(var2);
      return var2;
   }

   @deob.ObfuscatedName("yw.bv(Lv;)V")
   public void method7709(class879 arg0) {
      this.field10267 = ((class193)arg0).field1238;
      if (this.field10395 == null) {
         class268 var2 = new class268(80);
         if (this.field10274) {
            var2.method3569(-1.0F);
            var2.method3569(-1.0F);
            var2.method3569(0.0F);
            var2.method3569(0.0F);
            var2.method3569(0.0F);
            var2.method3569(-1.0F);
            var2.method3569(1.0F);
            var2.method3569(0.0F);
            var2.method3569(0.0F);
            var2.method3569(1.0F);
            var2.method3569(1.0F);
            var2.method3569(1.0F);
            var2.method3569(0.0F);
            var2.method3569(1.0F);
            var2.method3569(1.0F);
            var2.method3569(1.0F);
            var2.method3569(-1.0F);
            var2.method3569(0.0F);
            var2.method3569(1.0F);
            var2.method3569(0.0F);
         } else {
            var2.method3570(-1.0F);
            var2.method3570(-1.0F);
            var2.method3570(0.0F);
            var2.method3570(0.0F);
            var2.method3570(0.0F);
            var2.method3570(-1.0F);
            var2.method3570(1.0F);
            var2.method3570(0.0F);
            var2.method3570(0.0F);
            var2.method3570(1.0F);
            var2.method3570(1.0F);
            var2.method3570(1.0F);
            var2.method3570(0.0F);
            var2.method3570(1.0F);
            var2.method3570(1.0F);
            var2.method3570(1.0F);
            var2.method3570(-1.0F);
            var2.method3570(0.0F);
            var2.method3570(1.0F);
            var2.method3570(0.0F);
         }

         this.field10395 = this.method16627(20, var2.field931, var2.field935, false);
         this.field10393 = new class340(this.field10395, 5126, 3, 0);
         this.field10394 = new class340(this.field10395, 5126, 2, 12);
         this.field10257.method4167(this);
      }

   }

   @deob.ObfuscatedName("yw.bi(IIZZ)Lcy;")
   public class383 method7612(int arg0, int arg1, boolean arg2, boolean arg3) {
      return new class985(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("yw.be(Ldv;Z)Lcy;")
   public class383 method7529(class407 arg0, boolean arg1) {
      int[] var3 = arg0.method5555(false);
      class383 var4 = this.method11534(var3, 0, arg0.method5551(), arg0.method5551(), arg0.method5554());
      var4.method5214(arg0.method5542(), arg0.method5544(), arg0.method5543(), arg0.method5545());
      return var4;
   }

   @deob.ObfuscatedName("yw.bz([IIIIIZ)Lcy;")
   public class383 method7654(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class985(this, arg3, arg4, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("yw.bb(IIIIZ)Lcy;")
   public class383 method7530(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class985(this, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("yw.co(II[I[I)Lta;")
   public class826 method7531(int arg0, int arg1, int[] arg2, int[] arg3) {
      return class980.method16522(this, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("yw.DA(ILta;II)V")
   public void method7593(int arg0, class826 arg1, int arg2, int arg3) {
      class980 var5 = (class980)arg1;
      class186 var6 = var5.field10131;
      this.method16634();
      this.method16639(var5.field10131);
      this.method16652(1);
      this.method16642(7681, 8448);
      this.method16643(0, 34167, 768);
      float var7 = var6.field1206 / (float)var6.field1203;
      float var8 = var6.field1205 / (float)var6.field1204;
      OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f((float)(this.field10388 - arg2) * var7, (float)(this.field10309 - arg3) * var8);
      OpenGL.glVertex2i(this.field10388, this.field10309);
      OpenGL.glTexCoord2f((float)(this.field10388 - arg2) * var7, (float)(this.field10310 - arg3) * var8);
      OpenGL.glVertex2i(this.field10388, this.field10310);
      OpenGL.glTexCoord2f((float)(this.field10312 - arg2) * var7, (float)(this.field10310 - arg3) * var8);
      OpenGL.glVertex2i(this.field10312, this.field10310);
      OpenGL.glTexCoord2f((float)(this.field10312 - arg2) * var7, (float)(this.field10309 - arg3) * var8);
      OpenGL.glVertex2i(this.field10312, this.field10309);
      OpenGL.glEnd();
      this.method16643(0, 5890, 768);
   }

   @deob.ObfuscatedName("yw.ca(Lvd;[Lzk;Z)Ll;")
   public class609 method7606(class883 arg0, class998[] arg1, boolean arg2) {
      return new class994(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("yw.cj(I)V")
   public void method7695(int arg0) {
   }

   @deob.ObfuscatedName("yw.cw(Ldk;IIII)Lqa;")
   public class745 method7528(class396 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class971(this, arg0, arg1, arg3, arg4, arg2);
   }

   @deob.ObfuscatedName("yw.cd(II)I")
   public int method7534(int arg0, int arg1) {
      return arg0 & arg1 ^ arg1;
   }

   @deob.ObfuscatedName("yw.ck(II)I")
   public int method7535(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @deob.ObfuscatedName("yw.cs(II[[I[[IIII)Lxa;")
   public class934 method7536(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class976(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("yw.ce()Lko;")
   public class597 method7509() {
      return this.field10258;
   }

   @deob.ObfuscatedName("yw.cf()Lka;")
   public class583 method7763() {
      return this.field10379;
   }

   @deob.ObfuscatedName("yw.cp(Ldf;)V")
   public void method7542(class391 arg0) {
      this.field10257.method4166(this, arg0);
   }

   @deob.ObfuscatedName("yw.dk(ILdq;)V")
   public void method7565(int arg0, class402 arg1) {
      this.field10348 = arg0;
      this.field10349 = arg1;
      this.field10346 = true;
   }

   @deob.ObfuscatedName("yw.de(ILdq;)V")
   public void method7562(int arg0, class402 arg1) {
      if (!this.field10346) {
         throw new RuntimeException("");
      } else {
         this.field10348 = arg0;
         this.field10349 = arg1;
         if (this.field10347) {
            this.field10254.field2175.method16052();
            this.field10254.field2175.method16053();
         }

      }
   }

   @deob.ObfuscatedName("yw.O()V")
   public void method7564() {
      this.field10346 = false;
   }

   @deob.ObfuscatedName("yw.ac()V")
   public void method7503() {
      this.field10315 = 0;
      this.field10326 = 0;
      this.field10317 = this.field7109.method566();
      this.field10318 = this.field7109.method559();
      this.method16621();
   }

   @deob.ObfuscatedName("yw.ay(IIII)V")
   public void method7505(int arg0, int arg1, int arg2, int arg3) {
      this.field10315 = arg0;
      this.field10326 = arg1;
      this.field10317 = arg2;
      this.field10318 = arg3;
      this.method16621();
   }

   @deob.ObfuscatedName("yw.GA(FF)V")
   public void method7507(float arg0, float arg1) {
      this.field10238 = arg0;
      this.field10300 = arg1;
      this.method16609();
   }

   @deob.ObfuscatedName("yw.qa([I)V")
   public final void method7511(int[] arg0) {
      arg0[0] = this.field10388;
      arg0[1] = this.field10309;
      arg0[2] = this.field10312;
      arg0[3] = this.field10310;
   }

   @deob.ObfuscatedName("yw.L()V")
   public final void method7508() {
      if (this.field7109 != null) {
         this.field10388 = 0;
         this.field10309 = 0;
         this.field10312 = this.field7109.method566();
         this.field10310 = this.field7109.method559();
         OpenGL.glDisable(3089);
      }
   }

   @deob.ObfuscatedName("yw.r(IIII)V")
   public final void method7716(int arg0, int arg1, int arg2, int arg3) {
      if (this.field7109 != null) {
         if (arg0 < 0) {
            arg0 = 0;
         }

         if (arg2 > this.field7109.method566()) {
            arg2 = this.field7109.method566();
         }

         if (arg1 < 0) {
            arg1 = 0;
         }

         if (arg3 > this.field7109.method559()) {
            arg3 = this.field7109.method559();
         }

         this.field10388 = arg0;
         this.field10309 = arg1;
         this.field10312 = arg2;
         this.field10310 = arg3;
         OpenGL.glEnable(3089);
         this.method16731();
      }
   }

   @deob.ObfuscatedName("yw.o(IIII)V")
   public final void method7510(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10388 < arg0) {
         this.field10388 = arg0;
      }

      if (this.field10312 > arg2) {
         this.field10312 = arg2;
      }

      if (this.field10309 < arg1) {
         this.field10309 = arg1;
      }

      if (this.field10310 > arg3) {
         this.field10310 = arg3;
      }

      OpenGL.glEnable(3089);
      this.method16731();
   }

   @deob.ObfuscatedName("yw.da(II)V")
   public final void method16608(int arg0, int arg1) {
      this.field10313 = arg0;
      this.field10314 = arg1;
      this.method16621();
      this.method16731();
   }

   @deob.ObfuscatedName("yw.ma()V")
   private final void method16621() {
      if (this.field7109 != null) {
         int var1;
         int var2;
         int var3;
         int var4;
         if (this.field10307 == 2) {
            var1 = this.field10315;
            var2 = this.field10326;
            var3 = this.field10317;
            var4 = this.field10318;
         } else {
            var1 = 0;
            var2 = 0;
            var3 = this.field7109.method566();
            var4 = this.field7109.method559();
         }

         if (var3 < 1) {
            var3 = 1;
         }

         if (var4 < 1) {
            var4 = 1;
         }

         OpenGL.glViewport(this.field10313 + var1, this.field10314 + this.field7109.method559() - var2 - var4, var3, var4);
         this.field10356 = (float)this.field10317 / 2.0F;
         this.field10295 = (float)this.field10318 / 2.0F;
         this.field10338 = (float)this.field10315 + this.field10356;
         this.field10277 = (float)this.field10326 + this.field10295;
      }

   }

   @deob.ObfuscatedName("yw.nu()V")
   private final void method16609() {
      if (this.field10307 == 2) {
         OpenGL.glDepthRange(this.field10238, this.field10300);
      } else {
         OpenGL.glDepthRange(0.0F, 1.0F);
      }

   }

   @deob.ObfuscatedName("yw.ne()V")
   private final void method16731() {
      if (this.field7109 != null && this.field10388 < this.field10312 && this.field10309 < this.field10310) {
         OpenGL.glScissor(this.field10388 + this.field10313, this.field10314 + this.field7109.method559() - this.field10310, this.field10312 - this.field10388, this.field10310 - this.field10309);
      } else {
         OpenGL.glScissor(0, 0, 0, 0);
      }

   }

   @deob.ObfuscatedName("yw.np()V")
   public final void method16611() {
      OpenGL.glPushMatrix();
   }

   @deob.ObfuscatedName("yw.nk(Lko;)V")
   public final void method16612(class597 arg0) {
      OpenGL.glPushMatrix();
      OpenGL.glMultMatrixf(arg0.field5413, 0);
   }

   @deob.ObfuscatedName("yw.nl(Lko;)V")
   public final void method16613(class597 arg0) {
      OpenGL.glLoadMatrixf(arg0.field5413, 0);
   }

   @deob.ObfuscatedName("yw.nj()V")
   public final void method16688() {
      OpenGL.glPopMatrix();
   }

   @deob.ObfuscatedName("yw.cv(Lka;)V")
   public final void method7778(class583 arg0) {
      this.field10287.method8089(arg0);
      this.field10269.method8391(this.field10287);
      this.field10303.method8089(arg0);
      this.field10303.method8130();
      this.field10289.method8391(this.field10303);
      this.method16653();
      if (this.field10307 != 1) {
         this.method16614();
      }

   }

   @deob.ObfuscatedName("yw.cr()Lka;")
   public class583 method7544() {
      return new class583(this.field10287);
   }

   @deob.ObfuscatedName("yw.na()V")
   private final void method16614() {
      OpenGL.glLoadIdentity();
      OpenGL.glMultMatrixf(this.field10269.field5413, 0);
      if (this.field10347) {
         this.field10254.field2175.method16052();
      }

      this.method16624();
      this.method16773();
   }

   @deob.ObfuscatedName("yw.cc(Lko;)V")
   public final void method7545(class597 arg0) {
      this.field10290.method8386(arg0);
      this.method16653();
      this.method16619();
   }

   @deob.ObfuscatedName("yw.cx()Lko;")
   public final class597 method7498() {
      return new class597(this.field10290);
   }

   @deob.ObfuscatedName("yw.nr()V")
   public final void method16672() {
      if (this.field10307 != 0) {
         this.field10307 = 0;
         this.method16621();
         this.method16609();
         this.field10280 &= -16;
      }

   }

   @deob.ObfuscatedName("yw.ny()V")
   private final void method16674() {
      if (this.field10307 != 1) {
         this.field10307 = 1;
         this.method16619();
         this.method16621();
         this.method16609();
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         this.field10280 &= -9;
      }

   }

   @deob.ObfuscatedName("yw.nc()V")
   private final void method16618() {
      if (this.field10307 != 2) {
         this.field10307 = 2;
         this.method16625(this.field10290.field5413);
         this.method16614();
         this.method16621();
         this.method16609();
         this.field10280 &= -8;
      }

   }

   @deob.ObfuscatedName("yw.nv()V")
   private final void method16619() {
      this.field10302 = this.field10290.method8402();
      this.field10392 = this.field10290.method8403();
      this.method16792();
      if (this.field10307 == 2) {
         this.method16625(this.field10290.field5413);
      } else if (this.field10307 == 1) {
         this.method16625(this.field10291.field5413);
      }

   }

   @deob.ObfuscatedName("yw.ok()V")
   private final void method16653() {
      this.field10292.method8386(this.field10269);
      this.field10292.method8388(this.field10290);
      this.field10292.method8409(this.field10336[0]);
      this.field10292.method8410(this.field10336[1]);
      this.field10292.method8405(this.field10336[2]);
      this.field10292.method8406(this.field10336[3]);
      this.field10292.method8464(this.field10336[4]);
      this.field10292.method8408(this.field10336[5]);
   }

   @deob.ObfuscatedName("yw.ol([F)V")
   private final void method16625(float[] arg0) {
      float[] var2 = new float[16];
      System.arraycopy(arg0, 0, var2, 0, 16);
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var2, 0);
      OpenGL.glMatrixMode(5888);
   }

   @deob.ObfuscatedName("yw.RA(Z)V")
   public void method7551(boolean arg0) {
      this.field10308 = arg0;
      this.method16651();
   }

   @deob.ObfuscatedName("yw.ch()I")
   public int method7499() {
      return 4;
   }

   @deob.ObfuscatedName("yw.cy(I[Lacy;)V")
   public void method7552(int arg0, class81[] arg1) {
      for(int var3 = 0; var3 < arg0; ++var3) {
         this.field10333[var3] = arg1[var3];
      }

      this.field10335 = arg0;
      if (this.field10307 != 1) {
         this.method16773();
      }

   }

   @deob.ObfuscatedName("yw.og()V")
   private void method16773() {
      int var1;
      for(var1 = 0; var1 < this.field10335; ++var1) {
         class81 var2 = this.field10333[var1];
         int var3 = var1 + 16386;
         field10397[0] = (float)var2.method1123();
         field10397[1] = (float)var2.method1110();
         field10397[2] = (float)var2.method1111();
         field10397[3] = 1.0F;
         OpenGL.glLightfv(var3, 4611, field10397, 0);
         int var4 = var2.method1113();
         float var5 = var2.method1114() / 255.0F;
         field10397[0] = (float)(var4 >> 16 & 255) * var5;
         field10397[1] = (float)(var4 >> 8 & 255) * var5;
         field10397[2] = (float)(var4 & 255) * var5;
         OpenGL.glLightfv(var3, 4609, field10397, 0);
         OpenGL.glLightf(var3, 4617, 1.0F / (float)(var2.method1112() * var2.method1112()));
         OpenGL.glEnable(var3);
      }

      while(var1 < this.field10334) {
         OpenGL.glDisable(var1 + 16386);
         ++var1;
      }

      this.field10334 = this.field10335;
   }

   @deob.ObfuscatedName("yw.IA(F)V")
   public final void method7547(float arg0) {
      if (this.field10330 != arg0) {
         this.field10330 = arg0;
         this.method16629();
      }

   }

   @deob.ObfuscatedName("yw.m(IFFFFF)V")
   public final void method7588(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      boolean var7 = this.field10337 != arg0;
      if (var7 || this.field10288 != arg1 || this.field10332 != arg2) {
         this.field10337 = arg0;
         this.field10288 = arg1;
         this.field10332 = arg2;
         if (var7) {
            this.field10327 = (float)(this.field10337 & 16711680) / 1.671168E7F;
            this.field10215 = (float)(this.field10337 & 65280) / 65280.0F;
            this.field10329 = (float)(this.field10337 & 255) / 255.0F;
            this.method16629();
         }

         this.method16657();
      }

      if (this.field10322[0] != arg3 || this.field10322[1] != arg4 || this.field10322[2] != arg5) {
         this.field10322[0] = arg3;
         this.field10322[1] = arg4;
         this.field10322[2] = arg5;
         this.field10323[0] = -arg3;
         this.field10323[1] = -arg4;
         this.field10323[2] = -arg5;
         float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
         this.field10324[0] = arg3 * var8;
         this.field10324[1] = arg4 * var8;
         this.field10324[2] = arg5 * var8;
         this.field10325[0] = -this.field10324[0];
         this.field10325[1] = -this.field10324[1];
         this.field10325[2] = -this.field10324[2];
         this.method16624();
         this.field10208 = (int)(arg3 * 256.0F / arg4);
         this.field10370 = (int)(arg5 * 256.0F / arg4);
      }

   }

   @deob.ObfuscatedName("yw.J(I)V")
   public final void method7549(int arg0) {
      this.field10264 = 0;

      while(arg0 > 1) {
         ++this.field10264;
         arg0 >>= 1;
      }

      this.field10263 = 1 << this.field10264;
   }

   @deob.ObfuscatedName("yw.c(III)V")
   public final void method7550(int arg0, int arg1, int arg2) {
      if (this.field10339 != arg0 || this.field10340 != arg1 || this.field10261 != arg2) {
         this.field10339 = arg0;
         this.field10340 = arg1;
         this.field10261 = arg2;
         this.method16792();
         this.method16729();
      }

   }

   @deob.ObfuscatedName("yw.of(FF)V")
   public final void method16650(float arg0, float arg1) {
      this.field10344 = arg0;
      this.field10372 = arg1;
      this.method16792();
   }

   @deob.ObfuscatedName("yw.on()V")
   private void method16629() {
      field10361[0] = this.field10330 * this.field10327;
      field10361[1] = this.field10330 * this.field10215;
      field10361[2] = this.field10330 * this.field10329;
      field10361[3] = 1.0F;
      OpenGL.glLightModelfv(2899, field10361, 0);
   }

   @deob.ObfuscatedName("yw.ou()V")
   private void method16657() {
      field10361[0] = this.field10327 * this.field10288;
      field10361[1] = this.field10288 * this.field10215;
      field10361[2] = this.field10329 * this.field10288;
      field10361[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, field10361, 0);
      field10361[0] = -this.field10332 * this.field10327;
      field10361[1] = -this.field10332 * this.field10215;
      field10361[2] = -this.field10332 * this.field10329;
      field10361[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, field10361, 0);
   }

   @deob.ObfuscatedName("yw.oa()V")
   public void method16624() {
      OpenGL.glLightfv(16384, 4611, this.field10324, 0);
      OpenGL.glLightfv(16385, 4611, this.field10325, 0);
   }

   @deob.ObfuscatedName("yw.ot()V")
   private void method16729() {
      if (this.field10222 && this.field10340 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   @deob.ObfuscatedName("yw.ob()V")
   private void method16792() {
      this.field10343 = this.field10302 - (float)this.field10261 - this.field10372;
      this.field10342 = this.field10343 - (float)this.field10340 * this.field10344;
      if (this.field10342 < this.field10392) {
         this.field10342 = this.field10392;
      }

      OpenGL.glFogf(2915, this.field10342);
      OpenGL.glFogf(2916, this.field10343);
      field10361[0] = (float)(this.field10339 & 16711680) / 1.671168E7F;
      field10361[1] = (float)(this.field10339 & 65280) / 65280.0F;
      field10361[2] = (float)(this.field10339 & 255) / 255.0F;
      OpenGL.glFogfv(2918, field10361, 0);
   }

   @deob.ObfuscatedName("yw.cl(IIIIII)Ldo;")
   public class400 method7553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return this.field10378 ? new class199(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
   }

   @deob.ObfuscatedName("yw.cb(Ldo;Ldo;FLdo;)Ldo;")
   public class400 method2521(class400 arg0, class400 arg1, float arg2, class400 arg3) {
      if (arg0 != null && arg1 != null && this.field10378 && this.field10331) {
         class206 var5 = null;
         class969 var6 = (class969)arg0;
         class969 var7 = (class969)arg1;
         class936 var8 = var6.method2786();
         class936 var9 = var7.method2786();
         if (var8 != null && var9 != null) {
            int var10 = var8.field9479 > var9.field9479 ? var8.field9479 : var9.field9479;
            if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class206) {
               class206 var11 = (class206)arg3;
               if (var11.method2852() == var10) {
                  var5 = var11;
               }
            }

            if (var5 == null) {
               var5 = new class206(this, var10);
            }

            if (var5.method2853(var8, var9, arg2)) {
               return var5;
            }
         }
      }

      return arg2 < 0.5F ? arg0 : arg1;
   }

   @deob.ObfuscatedName("yw.ci(Ldo;)V")
   public final void method7560(class400 arg0) {
      this.field10249 = (class969)arg0;
   }

   @deob.ObfuscatedName("yw.op()Lxc;")
   public final class936 method16626() {
      return this.field10249 != null ? this.field10249.method2786() : null;
   }

   @deob.ObfuscatedName("yw.cz()Z")
   public final boolean method7558() {
      if (this.field10256 != null) {
         if (!this.field10256.method932()) {
            if (!this.field10227.method4424(this.field10256)) {
               return false;
            }

            this.field10297.method4468();
         }

         return true;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("yw.ct()V")
   public final void method7559() {
      if (this.field10256 != null && this.field10256.method932()) {
         this.field10227.method4425(this.field10256);
         this.field10297.method4468();
      }

   }

   @deob.ObfuscatedName("yw.cn()Z")
   public final boolean method7574() {
      return this.field10256 != null && this.field10256.method932();
   }

   @deob.ObfuscatedName("yw.dr(FFFFFF)V")
   protected final void method7561(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      class217.field1454 = arg0;
      class217.field1453 = arg1;
      class217.field1467 = arg2;
   }

   @deob.ObfuscatedName("yw.do(IIII)V")
   public final void method7556(int arg0, int arg1, int arg2, int arg3) {
      this.field10227.method4422(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("yw.df()V")
   public final void method7557() {
      this.field10227.method4428();
   }

   @deob.ObfuscatedName("yw.ar()Lym;")
   public class973 method2513() {
      return new class173(this);
   }

   @deob.ObfuscatedName("yw.au(II)Ldh;")
   public class393 method2514(int arg0, int arg1) {
      return new class935(this, class372.field2738, class405.field3058, arg0, arg1);
   }

   @deob.ObfuscatedName("yw.ad(III)Ldh;")
   public class393 method2649(int arg0, int arg1, int arg2) {
      return new class935(this, class372.field2738, class405.field3058, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("yw.as(IILcn;Ldt;I)Ldm;")
   public class398 method2679(int arg0, int arg1, class372 arg2, class405 arg3, int arg4) {
      return new class935(this, arg2, arg3, arg0, arg1, arg4);
   }

   @deob.ObfuscatedName("yw.or(I[BIZ)Lck;")
   public final class369 method16746(int arg0, byte[] arg1, int arg2, boolean arg3) {
      return (class369)(!this.field10375 || arg3 && !this.field10265 ? new class946(this, arg0, arg1, arg2) : new class952(this, arg0, arg1, arg2, arg3));
   }

   @deob.ObfuscatedName("yw.od(I[BIZ)Lbj;")
   public final class341 method16627(int arg0, byte[] arg1, int arg2, boolean arg3) {
      return (class341)(!this.field10375 || arg3 && !this.field10265 ? new class937(this, arg0, arg1, arg2) : new class949(this, arg0, arg1, arg2, arg3));
   }

   @deob.ObfuscatedName("yw.oe(ILjaclib/memory/Buffer;IZ)Lbj;")
   public final class341 method16628(int arg0, Buffer arg1, int arg2, boolean arg3) {
      return (class341)(!this.field10375 || arg3 && !this.field10265 ? new class937(this, arg0, arg1) : new class949(this, arg0, arg1, arg2, arg3));
   }

   @deob.ObfuscatedName("yw.oj(Lbj;)V")
   public final void method16734(class341 arg0) {
      if (this.field10351 != arg0) {
         if (this.field10375) {
            OpenGL.glBindBufferARB(34962, arg0.method4161());
         }

         this.field10351 = arg0;
      }

   }

   @deob.ObfuscatedName("yw.oq(Lck;)V")
   public final void method16630(class369 arg0) {
      if (this.field10350 != arg0) {
         if (this.field10375) {
            OpenGL.glBindBufferARB(34963, arg0.method4538());
         }

         this.field10350 = arg0;
      }

   }

   @deob.ObfuscatedName("yw.ox(Lbi;Lbi;Lbi;Lbi;)V")
   public final void method16631(class340 arg0, class340 arg1, class340 arg2, class340 arg3) {
      if (arg0 != null) {
         this.method16734(arg0.field2144);
         OpenGL.glVertexPointer(arg0.field2145, arg0.field2146, this.field10351.method4163(), this.field10351.method4151() + (long)arg0.field2147);
         OpenGL.glEnableClientState(32884);
      } else {
         OpenGL.glDisableClientState(32884);
      }

      if (arg1 != null) {
         this.method16734(arg1.field2144);
         OpenGL.glNormalPointer(arg1.field2146, this.field10351.method4163(), this.field10351.method4151() + (long)arg1.field2147);
         OpenGL.glEnableClientState(32885);
      } else {
         OpenGL.glDisableClientState(32885);
      }

      if (arg2 != null) {
         this.method16734(arg2.field2144);
         OpenGL.glColorPointer(arg2.field2145, arg2.field2146, this.field10351.method4163(), this.field10351.method4151() + (long)arg2.field2147);
         OpenGL.glEnableClientState(32886);
      } else {
         OpenGL.glDisableClientState(32886);
      }

      if (arg3 != null) {
         this.method16734(arg3.field2144);
         OpenGL.glTexCoordPointer(arg3.field2145, arg3.field2146, this.field10351.method4163(), this.field10351.method4151() + (long)arg3.field2147);
         OpenGL.glEnableClientState(32888);
      } else {
         OpenGL.glDisableClientState(32888);
      }

   }

   @deob.ObfuscatedName("yw.oc(III)V")
   public final void method16632(int arg0, int arg1, int arg2) {
      OpenGL.glDrawArrays(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("yw.oo(Lck;III)V")
   public final void method16633(class369 arg0, int arg1, int arg2, int arg3) {
      this.method16630(arg0);
      OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method4532() + (long)(arg2 * 2));
   }

   @deob.ObfuscatedName("yw.ow()V")
   private final void method16669() {
      if (this.field10280 != 1) {
         this.method16674();
         this.method16646(false);
         this.method16610(false);
         this.method16649(false);
         this.method16714(false);
         this.method16639((class354)null);
         this.method16617(-2);
         this.method16640(1);
         this.field10280 = 1;
      }

   }

   @deob.ObfuscatedName("yw.om()V")
   public final void method16634() {
      if (this.field10280 != 2) {
         this.method16674();
         this.method16646(false);
         this.method16610(false);
         this.method16649(false);
         this.method16714(false);
         this.method16617(-2);
         this.field10280 = 2;
      }

   }

   @deob.ObfuscatedName("yw.oy()V")
   public final void method16635() {
      if (this.field10280 != 4) {
         this.method16674();
         this.method16646(false);
         this.method16610(false);
         this.method16649(false);
         this.method16714(false);
         this.method16617(-2);
         this.method16652(1);
         this.field10280 = 4;
      }

   }

   @deob.ObfuscatedName("yw.oz()V")
   public final void method16636() {
      if (this.field10280 != 8) {
         this.method16618();
         this.method16646(true);
         this.method16649(true);
         this.method16714(true);
         this.method16652(1);
         this.field10280 = 8;
      }

   }

   @deob.ObfuscatedName("yw.oh(I)V")
   public final void method16617(int arg0) {
      this.method16637(arg0, true);
   }

   @deob.ObfuscatedName("yw.os(IZ)V")
   public final void method16637(int arg0, boolean arg1) {
      this.method16791(arg0, arg1, true);
   }

   @deob.ObfuscatedName("yw.ov(IZZ)V")
   public final void method16791(int arg0, boolean arg1, boolean arg2) {
      if (this.field10352 != arg0 || this.field10347 != this.field10346) {
         class939 var4 = null;
         int var5 = 0;
         byte var6 = 0;
         int var7 = 0;
         int var8 = this.field10346 ? 3 : 0;
         if (arg0 < 0) {
            this.method16622();
         } else {
            var4 = this.field10297.method4464(arg0);
            class360 var9 = this.field7118.method5112(arg0);
            if (var9.field2330 == 0 && var9.field2317 == 0) {
               this.method16622();
            } else {
               this.method16644((float)(this.field10374 % 128000) / 1000.0F * (float)var9.field2330 / 64.0F % 1.0F, (float)(this.field10374 % 128000) / 1000.0F * (float)var9.field2317 / 64.0F % 1.0F, 0.0F);
            }

            if (!this.field10346) {
               var6 = var9.field2325;
               var7 = var9.field2337;
               var8 = var9.field2324;
            }

            var5 = var9.field2340;
         }

         this.field10254.method4200(var8, var6, var7, arg1, arg2);
         if (!this.field10254.method4203(var4, var5)) {
            this.method16639(var4);
            this.method16640(var5);
         }

         this.field10347 = this.field10346;
         this.field10352 = arg0;
      }

      this.field10280 &= -8;
   }

   @deob.ObfuscatedName("yw.oi(I)V")
   public final void method16638(int arg0) {
      if (this.field10311 != arg0) {
         OpenGL.glActiveTexture(arg0 + 33984);
         this.field10311 = arg0;
      }

   }

   @deob.ObfuscatedName("yw.pb(Lbw;)V")
   public final void method16639(class354 arg0) {
      class354 var2 = this.field10357[this.field10311];
      if (arg0 != var2) {
         if (arg0 != null) {
            if (var2 != null) {
               if (arg0.field2263 != var2.field2263) {
                  OpenGL.glDisable(var2.field2263);
                  OpenGL.glEnable(arg0.field2263);
               }
            } else {
               OpenGL.glEnable(arg0.field2263);
            }

            OpenGL.glBindTexture(arg0.field2263, arg0.field2271);
         } else {
            OpenGL.glDisable(var2.field2263);
         }

         this.field10357[this.field10311] = arg0;
      }

      this.field10280 &= -2;
   }

   @deob.ObfuscatedName("yw.pl(I)V")
   public final void method16640(int arg0) {
      if (arg0 == 1) {
         this.method16642(7681, 7681);
      } else if (arg0 == 0) {
         this.method16642(8448, 8448);
      } else if (arg0 == 2) {
         this.method16642(34165, 7681);
      } else if (arg0 == 3) {
         this.method16642(260, 8448);
      } else if (arg0 == 4) {
         this.method16642(34023, 34023);
      }

   }

   @deob.ObfuscatedName("yw.pi(I)I")
   public final int method16641(int arg0) {
      if (arg0 == 1) {
         return 7681;
      } else if (arg0 == 0) {
         return 8448;
      } else if (arg0 == 2) {
         return 34165;
      } else if (arg0 == 3) {
         return 260;
      } else if (arg0 == 4) {
         return 34023;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("yw.pc(II)V")
   public final void method16642(int arg0, int arg1) {
      if (this.field10311 == 0) {
         boolean var3 = false;
         if (this.field10353 != arg0) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            this.field10353 = arg0;
            var3 = true;
         }

         if (this.field10354 != arg1) {
            OpenGL.glTexEnvi(8960, 34162, arg1);
            this.field10354 = arg1;
            var3 = true;
         }

         if (var3) {
            this.field10280 &= -14;
         }
      } else {
         OpenGL.glTexEnvi(8960, 34161, arg0);
         OpenGL.glTexEnvi(8960, 34162, arg1);
      }

   }

   @deob.ObfuscatedName("yw.pg(III)V")
   public final void method16643(int arg0, int arg1, int arg2) {
      OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
      OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
   }

   @deob.ObfuscatedName("yw.ps(III)V")
   public final void method16616(int arg0, int arg1, int arg2) {
      OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
      OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
   }

   @deob.ObfuscatedName("yw.pk(I)V")
   public final void method16604(int arg0) {
      field10361[0] = (float)(arg0 & 16711680) / 1.671168E7F;
      field10361[1] = (float)(arg0 & 65280) / 65280.0F;
      field10361[2] = (float)(arg0 & 255) / 255.0F;
      field10361[3] = (float)(arg0 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, field10361, 0);
   }

   @deob.ObfuscatedName("yw.pq(FFFF)V")
   public final void method16711(float arg0, float arg1, float arg2, float arg3) {
      field10361[0] = arg0;
      field10361[1] = arg1;
      field10361[2] = arg2;
      field10361[3] = arg3;
      OpenGL.glTexEnvfv(8960, 8705, field10361, 0);
   }

   @deob.ObfuscatedName("yw.pz(FFF)V")
   private final void method16644(float arg0, float arg1, float arg2) {
      OpenGL.glMatrixMode(5890);
      if (this.field10355) {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glTranslatef(arg0, arg1, arg2);
      OpenGL.glMatrixMode(5888);
      this.field10355 = true;
   }

   @deob.ObfuscatedName("yw.pn()V")
   private final void method16622() {
      if (this.field10355) {
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         this.field10355 = false;
      }

   }

   @deob.ObfuscatedName("yw.pm(Z)V")
   public final void method16646(boolean arg0) {
      if (this.field10222 != arg0) {
         this.field10222 = arg0;
         this.method16729();
         this.field10280 &= -16;
      }

   }

   @deob.ObfuscatedName("yw.pw(Z)V")
   public final void method16610(boolean arg0) {
      if (this.field10320 != arg0) {
         this.field10320 = arg0;
         this.method16648();
         this.field10280 &= -8;
      }

   }

   @deob.ObfuscatedName("yw.pp(Z)V")
   public final void method16647(boolean arg0) {
      if (this.field10321 != arg0) {
         this.field10321 = arg0;
         this.method16648();
      }

   }

   @deob.ObfuscatedName("yw.pd()V")
   private void method16648() {
      if (this.field10320 && !this.field10321) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   @deob.ObfuscatedName("yw.pe(Z)V")
   public final void method16649(boolean arg0) {
      if (this.field10285 != arg0) {
         if (arg0) {
            OpenGL.glEnable(2929);
         } else {
            OpenGL.glDisable(2929);
         }

         this.field10285 = arg0;
         this.field10280 &= -16;
      }

   }

   @deob.ObfuscatedName("yw.po(Z)V")
   public final void method16714(boolean arg0) {
      if (this.field10298 != arg0) {
         this.field10298 = arg0;
         this.method16651();
         this.field10280 &= -16;
      }

   }

   @deob.ObfuscatedName("yw.pa()V")
   private final void method16651() {
      OpenGL.glDepthMask(this.field10298 && this.field10308);
   }

   @deob.ObfuscatedName("yw.px(I)V")
   public final void method16652(int arg0) {
      if (this.field10232 != arg0) {
         byte var2;
         boolean var3;
         boolean var4;
         if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
         } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
         } else if (arg0 == 128) {
            var2 = 3;
            var3 = true;
            var4 = true;
         } else {
            var2 = 0;
            var3 = true;
            var4 = false;
         }

         if (this.field10283 != var3) {
            OpenGL.glColorMask(var3, var3, var3, true);
            this.field10283 = var3;
         }

         if (this.field10284 != var4) {
            if (var4) {
               OpenGL.glEnable(3008);
            } else {
               OpenGL.glDisable(3008);
            }

            this.field10284 = var4;
         }

         if (this.field10316 != var2) {
            if (var2 == 1) {
               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(770, 771);
            } else if (var2 == 2) {
               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(1, 1);
            } else if (var2 == 3) {
               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(774, 1);
            } else {
               OpenGL.glDisable(3042);
            }

            this.field10316 = var2;
         }

         this.field10232 = arg0;
         this.field10280 &= -13;
      }

   }

   @deob.ObfuscatedName("yw.za()I")
   public final int method7488() {
      return this.field10268 + this.field10262 + this.field10229;
   }

   @deob.ObfuscatedName("yw.i(I)V")
   public final synchronized void method2580(int arg0) {
      int var2 = 0;
      int var3 = arg0 & Integer.MAX_VALUE;

      while(!this.field10272.method15024()) {
         class108 var4 = (class108)this.field10272.method14961();
         field10228[var2++] = (int)var4.field6137;
         this.field10262 -= var4.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, field10228, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, field10228, 0);
         var2 = 0;
      }

      while(!this.field10273.method15024()) {
         class108 var5 = (class108)this.field10273.method14961();
         field10228[var2++] = (int)var5.field6137;
         this.field10268 -= var5.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteTextures(var2, field10228, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteTextures(var2, field10228, 0);
         var2 = 0;
      }

      while(!this.field10299.method15024()) {
         class108 var6 = (class108)this.field10299.method14961();
         field10228[var2++] = var6.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, field10228, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, field10228, 0);
         var2 = 0;
      }

      while(!this.field10275.method15024()) {
         class108 var7 = (class108)this.field10275.method14961();
         field10228[var2++] = (int)var7.field6137;
         this.field10229 -= var7.field811;
         if (var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, field10228, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, field10228, 0);
         boolean var8 = false;
      }

      while(!this.field10271.method15024()) {
         class108 var9 = (class108)this.field10271.method14961();
         OpenGL.glDeleteLists((int)var9.field6137, var9.field811);
      }

      while(!this.field10221.method15024()) {
         class674 var10 = this.field10221.method14961();
         OpenGL.glDeleteProgramARB((int)var10.field6137);
      }

      while(!this.field10242.method15024()) {
         class674 var11 = this.field10242.method14961();
         OpenGL.glDeleteShader((int)var11.field6137);
      }

      while(!this.field10271.method15024()) {
         class108 var12 = (class108)this.field10271.method14961();
         OpenGL.glDeleteLists((int)var12.field6137, var12.field811);
      }

      this.field10297.method4465();
      if (this.method7488() > 100663296 && class431.method2169() > this.field10278 + 60000L) {
         System.gc();
         this.field10278 = class431.method2169();
      }

      this.field10374 = var3;
   }

   @deob.ObfuscatedName("yw.pu(II)V")
   public final synchronized void method16654(int arg0, int arg1) {
      class108 var3 = new class108(arg1);
      var3.field6137 = (long)arg0;
      this.field10272.method14959(var3);
   }

   @deob.ObfuscatedName("yw.pj(II)V")
   public final synchronized void method16655(int arg0, int arg1) {
      class108 var3 = new class108(arg1);
      var3.field6137 = (long)arg0;
      this.field10273.method14959(var3);
   }

   @deob.ObfuscatedName("yw.pt(I)V")
   public final synchronized void method16656(int arg0) {
      class108 var2 = new class108(arg0);
      this.field10299.method14959(var2);
   }

   @deob.ObfuscatedName("yw.pr(II)V")
   public final synchronized void method16615(int arg0, int arg1) {
      class108 var3 = new class108(arg1);
      var3.field6137 = (long)arg0;
      this.field10275.method14959(var3);
   }

   @deob.ObfuscatedName("yw.pf(J)V")
   public final synchronized void method16658(long arg0) {
      class674 var3 = new class674();
      var3.field6137 = arg0;
      this.field10242.method14959(var3);
   }

   @deob.ObfuscatedName("yw.pv(I)V")
   public final synchronized void method16663(int arg0) {
      class674 var2 = new class674();
      var2.field6137 = (long)arg0;
      this.field10221.method14959(var2);
   }

   @deob.ObfuscatedName("yw.py(Lcn;)I")
   public static int method16659(class372 arg0) {
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

   @deob.ObfuscatedName("yw.ph(Lcn;Ldt;)I")
   public static int method16696(class372 arg0, class405 arg1) {
      if (class405.field3052 == arg1) {
         switch(arg0.field2743) {
         case 0:
            return 6410;
         case 1:
            return 6409;
         case 2:
         case 4:
         case 6:
         case 7:
         default:
            throw new IllegalArgumentException();
         case 3:
            return 6408;
         case 5:
            return 6407;
         case 8:
            return 6406;
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

   @deob.ObfuscatedName("yw.dc(Z)V")
   public void method2506(boolean arg0) {
   }
}
