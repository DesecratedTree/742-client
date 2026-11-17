import jaggl.OpenGL;

@deob.ObfuscatedName("ahz")
public class class217 extends class59 {
   @deob.ObfuscatedName("ahz.o")
   public static float field1467 = 0.25F;
   @deob.ObfuscatedName("ahz.a")
   public static float field1453 = 1.0F;
   @deob.ObfuscatedName("ahz.x")
   public static float field1454 = 1.0F;
   @deob.ObfuscatedName("ahz.w")
   private int field1460;
   @deob.ObfuscatedName("ahz.i")
   private int field1464;
   @deob.ObfuscatedName("ahz.t")
   private int field1465;
   @deob.ObfuscatedName("ahz.c")
   private int field1466;
   @deob.ObfuscatedName("ahz.h")
   private class173 field1451;
   @deob.ObfuscatedName("ahz.g")
   private class173 field1459;
   @deob.ObfuscatedName("ahz.q")
   private class338 field1468;
   @deob.ObfuscatedName("ahz.y")
   private class338 field1469;
   @deob.ObfuscatedName("ahz.j")
   private class338 field1470;
   @deob.ObfuscatedName("ahz.f")
   private class338 field1471;
   @deob.ObfuscatedName("ahz.e")
   private class939 field1458;
   @deob.ObfuscatedName("ahz.z")
   private class939 field1461;
   @deob.ObfuscatedName("ahz.m")
   private class939[] field1463;

   public class217(class983 arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("ahz.ah()Z")
   public boolean method2941() {
      return this.field435.field10331 && this.field435.field10385 && this.field435.field10381;
   }

   @deob.ObfuscatedName("ahz.n()Z")
   public boolean method923() {
      return this.field1459 != null;
   }

   @deob.ObfuscatedName("ahz.k()Z")
   public boolean method924() {
      if (this.field435.field10331 && this.field435.field10385 && this.field435.field10381) {
         this.field1459 = new class173(this.field435);
         this.field1458 = new class939(this.field435, 3553, class372.field2736, class405.field3056, 256, 256);
         this.field1458.method15984(false, false);
         this.field1461 = new class939(this.field435, 3553, class372.field2736, class405.field3056, 256, 256);
         this.field1461.method15984(false, false);
         this.field435.method11502(this.field1459);
         this.field1459.method2351(0, this.field1458.method15995(0));
         this.field1459.method2351(1, this.field1461.method15995(0));
         this.field1459.method2368(0);
         if (!this.field1459.method2354()) {
            this.field435.method11503(this.field1459);
            return false;
         } else {
            this.field435.method11503(this.field1459);
            this.field1471 = class338.method4142(this.field435, new class348[]{class348.method4212(this.field435, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field1470 = class338.method4142(this.field435, new class348[]{class348.method4212(this.field435, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field1469 = class338.method4142(this.field435, new class348[]{class348.method4212(this.field435, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
            this.field1468 = class338.method4142(this.field435, new class348[]{class348.method4212(this.field435, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.field1470 != null && this.field1471 != null && this.field1469 != null && this.field1468 != null;
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("ahz.b(II)V")
   public void method926(int arg0, int arg1) {
      this.field1464 = arg0;
      this.field1465 = arg1;
      int var3 = class887.method14787(this.field1464);
      int var4 = class887.method14787(this.field1465);
      if (this.field1466 != var3 || this.field1460 != var4) {
         if (this.field1463 != null) {
            for(int var5 = 0; var5 < this.field1463.length; ++var5) {
               this.field1463[var5].method4279();
            }

            this.field1463 = null;
         }

         if (var3 <= 256 && var4 <= 256) {
            this.field1451 = null;
         } else {
            int var6 = var3;
            int var7 = var4;
            int var8 = 0;

            label61:
            while(true) {
               if (var6 <= 256 && var7 <= 256) {
                  if (this.field1451 == null) {
                     this.field1451 = new class173(this.field435);
                  }

                  this.field1463 = new class939[var8];
                  int var9 = var3;
                  int var10 = var4;
                  int var11 = 0;

                  while(true) {
                     if (var9 <= 256 && var10 <= 256) {
                        break label61;
                     }

                     this.field1463[var11++] = new class939(this.field435, 3553, class372.field2736, class405.field3056, var9, var10);
                     if (var9 > 256) {
                        var9 >>= 1;
                     }

                     if (var10 > 256) {
                        var10 >>= 1;
                     }
                  }
               }

               if (var6 > 256) {
                  var6 >>= 1;
               }

               if (var7 > 256) {
                  var7 >>= 1;
               }

               ++var8;
            }
         }

         this.field1466 = var3;
         this.field1460 = var4;
      }

   }

   @deob.ObfuscatedName("ahz.d()V")
   public void method925() {
      this.field1460 = -1;
      this.field1466 = -1;
      this.field1451 = null;
      this.field1463 = null;
      this.field1459 = null;
      this.field1458 = null;
      this.field1461 = null;
      this.field1471 = null;
      this.field1470 = null;
      this.field1469 = null;
      this.field1468 = null;
   }

   @deob.ObfuscatedName("ahz.r(ILxf;Lxf;)V")
   public void method927(int arg0, class939 arg1, class939 arg2) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      if (this.field1463 != null) {
         this.field435.method11502(this.field1451);
         int var4 = class887.method14787(this.field1464);
         int var5 = class887.method14787(this.field1465);
         int var6 = 0;

         while(var4 > 256 || var5 > 256) {
            OpenGL.glViewport(0, 0, var4, var5);
            this.field1451.method2351(0, this.field1463[var6].method15995(0));
            if (var6 == 0) {
               this.field435.method16639(arg1);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)this.field1464, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)this.field1464, (float)this.field1465);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.field1465);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.field435.method16639(this.field1463[var6 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if (var4 > 256) {
               var4 >>= 1;
            }

            if (var5 > 256) {
               var5 >>= 1;
            }

            ++var6;
         }

         this.field435.method11503(this.field1451);
         this.field435.method16639(this.field1463[var6 - 1]);
         this.field435.method11502(this.field1459);
         this.field1459.method2368(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var7 = this.field1470.field2137;
         OpenGL.glUseProgram(var7);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), field1454, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.field435.method16639(arg1);
         this.field435.method11502(this.field1459);
         this.field1459.method2368(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var8 = this.field1471.field2137;
         OpenGL.glUseProgram(var8);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var8, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var8, "params"), field1454, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.field1464, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.field1464, (float)this.field1465);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.field1465);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.field1459.method2368(1);
      this.field435.method16639(this.field1458);
      int var9 = this.field1468.field2137;
      OpenGL.glUseProgram(var9);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var9, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.field1459.method2368(0);
      this.field435.method16639(this.field1461);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.field435.method11503(this.field1459);
      int var10 = this.field1469.field2137;
      OpenGL.glUseProgram(var10);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var10, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var10, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var10, "params"), field1467, field1453, 0.0F);
      this.field435.method16638(1);
      this.field435.method16639(this.field1458);
      this.field435.method16638(0);
      this.field435.method16639(arg1);
   }

   @deob.ObfuscatedName("ahz.p(I)V")
   public void method930(int arg0) {
      OpenGL.glUseProgram(0);
      this.field435.method16638(1);
      this.field435.method16639((class354)null);
      this.field435.method16638(0);
   }

   @deob.ObfuscatedName("ahz.x()Ldt;")
   public class405 method941() {
      return class405.field3056;
   }
}
