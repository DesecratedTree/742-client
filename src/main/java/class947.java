import jaggl.OpenGL;

@deob.ObfuscatedName("xn")
public class class947 extends class344 {
   @deob.ObfuscatedName("xn.r")
   private boolean field9523 = false;
   @deob.ObfuscatedName("xn.p")
   private boolean field9524 = false;
   @deob.ObfuscatedName("xn.o")
   private class346 field9525;
   @deob.ObfuscatedName("xn.b")
   private class338 field9522;

   public class947(class983 arg0, class346 arg1) {
      super(arg0);
      this.field9525 = arg1;
      if (this.field9525.field2178 != null && this.field2169.field10384 && this.field2169.field10385) {
         class348 var3 = class348.method4212(this.field2169, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
         class348 var4 = class348.method4212(this.field2169, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
         this.field9522 = class338.method4142(this.field2169, new class348[]{var3, var4});
         this.field9524 = this.field9522 != null;
      }

   }

   @deob.ObfuscatedName("xn.n()Z")
   public boolean method4182() {
      return this.field9524;
   }

   @deob.ObfuscatedName("xn.k(Z)V")
   public void method4187(boolean arg0) {
      class936 var2 = this.field2169.method16626();
      if (this.field9524 && var2 != null) {
         this.field2169.method16638(1);
         this.field2169.method16639(var2);
         this.field2169.method16638(0);
         this.field2169.method16639(this.field9525.field2178);
         int var3 = this.field9522.field2137;
         OpenGL.glUseProgram(var3);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "normalSampler"), 0);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "envMapSampler"), 1);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var3, "sunDir"), -this.field2169.field10324[0], -this.field2169.field10324[1], -this.field2169.field10324[2]);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var3, "sunColour"), this.field2169.field10327, this.field2169.field10215, this.field2169.field10329, 1.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var3, "sunExponent"), 96.0F + Math.abs(this.field2169.field10324[1]) * 928.0F);
         this.field9523 = true;
      }

   }

   @deob.ObfuscatedName("xn.d(Z)V")
   public void method4184(boolean arg0) {
   }

   @deob.ObfuscatedName("xn.b()V")
   public void method4196() {
      if (this.field9523) {
         this.field2169.method16638(1);
         this.field2169.method16639((class354)null);
         this.field2169.method16638(0);
         this.field2169.method16639((class354)null);
         OpenGL.glUseProgram(0);
         this.field9523 = false;
      }

   }

   @deob.ObfuscatedName("xn.r(II)V")
   public void method4199(int arg0, int arg1) {
      if (this.field9523) {
         int var3 = 1 << (arg0 & 3);
         float var4 = (float)(1 << (arg0 >> 3 & 7)) / 32.0F;
         int var5 = arg1 & 65535;
         float var6 = (float)(arg1 >> 16 & 3) / 8.0F;
         int var7 = this.field9522.field2137;
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "time"), (float)(this.field2169.field10374 * var3 % 40000) / 40000.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "scale"), var4);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterDepth"), (float)var5);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterOffset"), var6);
      }

   }

   @deob.ObfuscatedName("xn.p(Lbw;I)V")
   public void method4183(class354 arg0, int arg1) {
      if (!this.field9523) {
         this.field2169.method16639(arg0);
         this.field2169.method16640(arg1);
      }

   }
}
