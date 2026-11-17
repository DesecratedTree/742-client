import jaggl.OpenGL;

@deob.ObfuscatedName("ce")
public class class363 {
   @deob.ObfuscatedName("ce.k")
   private final class983 field2346;
   @deob.ObfuscatedName("ce.d")
   private class338 field2345;

   public class363(class983 arg0) {
      this.field2346 = arg0;
   }

   @deob.ObfuscatedName("ce.n()Z")
   public boolean method4458() {
      if (this.field2346.field10331 && this.field2346.field10385 && this.field2345 == null) {
         class348 var1 = class348.method4212(this.field2346, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
         if (var1 != null) {
            this.field2345 = class338.method4142(this.field2346, new class348[]{var1});
         }
      }

      return this.field2345 != null;
   }

   @deob.ObfuscatedName("ce.k(Lxo;Lxo;F)Z")
   public boolean method4459(class948 arg0, class948 arg1, float arg2) {
      if (!this.method4458()) {
         return false;
      } else {
         class173 var4 = this.field2346.field10260;
         class935 var5 = new class935(this.field2346, class372.field2736, class405.field3052, arg0.field9526, arg0.field9527);
         boolean var6 = false;
         this.field2346.method11502(var4);
         var4.method2351(0, var5);
         if (var4.method2354()) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field9526, arg0.field9527);
            OpenGL.glUseProgram(this.field2345.field2137);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.field2345.field2137, "heightMap"), 0);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.field2345.field2137, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.field2345.field2137, "sampleSize"), 1.0F / (float)arg1.field9526, 1.0F / (float)arg1.field9527);

            for(int var7 = 0; var7 < arg0.field9528; ++var7) {
               float var8 = (float)var7 / (float)arg0.field9528;
               this.field2346.method16639(arg1);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord3f(0.0F, 0.0F, var8);
               OpenGL.glVertex2f(0.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 0.0F, var8);
               OpenGL.glVertex2f(1.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 1.0F, var8);
               OpenGL.glVertex2f(1.0F, 1.0F);
               OpenGL.glTexCoord3f(0.0F, 1.0F, var8);
               OpenGL.glVertex2f(0.0F, 1.0F);
               OpenGL.glEnd();
               arg0.method16017(0, 0, var7, arg0.field9526, arg0.field9527, 0, 0);
            }

            OpenGL.glUseProgram(0);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var6 = true;
         }

         var4.method2351(0, (class398)null);
         this.field2346.method11503(var4);
         return var6;
      }
   }
}
