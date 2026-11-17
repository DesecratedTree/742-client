import jaggl.OpenGL;

@deob.ObfuscatedName("xz")
public class class959 extends class344 {
   @deob.ObfuscatedName("xz.x")
   private boolean field9596 = false;
   @deob.ObfuscatedName("xz.g")
   private class339 field9585;
   @deob.ObfuscatedName("xz.v")
   private class339 field9595;
   @deob.ObfuscatedName("xz.u")
   private class339 field9594;
   @deob.ObfuscatedName("xz.l")
   private class339 field9593;
   @deob.ObfuscatedName("xz.s")
   private class939 field9584;
   @deob.ObfuscatedName("xz.p")
   private final boolean field9588;
   @deob.ObfuscatedName("xz.h")
   private static final float[] field9597 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @deob.ObfuscatedName("xz.a")
   private boolean field9590;
   @deob.ObfuscatedName("xz.o")
   private boolean field9592;

   public class959(class983 arg0) {
      super(arg0);
      if (this.field2169.field10383) {
         this.field9585 = class339.method4147(this.field2169, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
         this.field9595 = class339.method4147(this.field2169, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
         this.field9594 = class339.method4147(this.field2169, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
         this.field9593 = class339.method4147(this.field2169, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
         if (this.field9585 != null & this.field9595 != null & this.field9594 != null & this.field9593 != null) {
            this.field9584 = new class939(arg0, 3553, class372.field2735, class405.field3052, 2, 1, false, new byte[]{0, -1}, class372.field2735, false);
            this.field9584.method15984(false, false);
            this.field9588 = true;
         } else {
            this.field9588 = false;
         }
      } else {
         this.field9588 = false;
      }

   }

   @deob.ObfuscatedName("xz.n()Z")
   public boolean method4182() {
      return this.field9588;
   }

   @deob.ObfuscatedName("xz.k(Z)V")
   public void method4187(boolean arg0) {
      this.field9590 = arg0;
      this.field2169.method16638(1);
      this.field2169.method16639(this.field9584);
      this.field2169.method16642(34165, 7681);
      this.field2169.method16643(0, 34166, 768);
      this.field2169.method16643(2, 5890, 770);
      this.field2169.method16616(0, 34168, 770);
      this.field2169.method16638(0);
      this.method16052();
   }

   @deob.ObfuscatedName("xz.d(Z)V")
   public void method4184(boolean arg0) {
   }

   @deob.ObfuscatedName("xz.b()V")
   public void method4196() {
      if (this.field9592) {
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34820);
         OpenGL.glDisable(34336);
         this.field9592 = false;
      }

      this.field2169.method16638(1);
      this.field2169.method16639((class354)null);
      this.field2169.method16642(8448, 8448);
      this.field2169.method16643(0, 5890, 768);
      this.field2169.method16643(2, 34166, 770);
      this.field2169.method16616(0, 5890, 770);
      this.field2169.method16638(0);
      if (this.field9596) {
         this.field2169.method16643(0, 5890, 768);
         this.field2169.method16616(0, 5890, 770);
         this.field9596 = false;
      }

   }

   @deob.ObfuscatedName("xz.t()V")
   public void method16052() {
      class597 var1 = this.field2169.field10269;
      if (this.field9590) {
         OpenGL.glBindProgramARB(34336, this.field2169.field10348 == Integer.MAX_VALUE ? this.field9595.field2143 : this.field9593.field2143);
      } else {
         OpenGL.glBindProgramARB(34336, this.field2169.field10348 == Integer.MAX_VALUE ? this.field9585.field2143 : this.field9594.field2143);
      }

      float var2 = (float)this.field2169.field10348;
      float var3 = var1.field5413[4] * var2 + var1.field5413[12];
      float var4 = var1.field5413[5] * var2 + var1.field5413[13];
      float var5 = var1.field5413[6] * var2 + var1.field5413[14];
      field9597[0] = -var1.field5413[4];
      field9597[1] = -var1.field5413[5];
      field9597[2] = -var1.field5413[6];
      field9597[3] = -(field9597[2] * var5 + field9597[0] * var3 + field9597[1] * var4);
      OpenGL.glProgramLocalParameter4fARB(34336, 1, field9597[0], field9597[1], field9597[2], field9597[3]);
      OpenGL.glEnable(34336);
      this.field9592 = true;
      this.method16053();
   }

   @deob.ObfuscatedName("xz.c()V")
   public void method16053() {
      if (this.field9592) {
         float var1 = this.field2169.field10302;
         float var2 = this.field2169.field10392;
         float var3 = var1 - (var1 - var2) * 0.125F;
         float var4 = var1 - (var1 - var2) * 0.25F;
         OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, var3, 256.0F / (float)this.field2169.field10349.field2964, (float)this.field2169.field10349.field2962 / 255.0F);
         this.field2169.method16638(1);
         this.field2169.method16604(this.field2169.field10349.field2965);
         this.field2169.method16638(0);
      }

   }

   @deob.ObfuscatedName("xz.p(Lbw;I)V")
   public void method4183(class354 arg0, int arg1) {
      if (arg0 == null) {
         if (!this.field9596) {
            this.field2169.method16639(this.field2169.field10358);
            this.field2169.method16640(1);
            this.field2169.method16643(0, 34168, 768);
            this.field2169.method16616(0, 34168, 770);
            this.field9596 = true;
         }
      } else {
         if (this.field9596) {
            this.field2169.method16643(0, 5890, 768);
            this.field2169.method16616(0, 5890, 770);
            this.field9596 = false;
         }

         this.field2169.method16639(arg0);
         this.field2169.method16640(arg1);
      }

   }

   @deob.ObfuscatedName("xz.r(II)V")
   public void method4199(int arg0, int arg1) {
   }
}
