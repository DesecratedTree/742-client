import jaggl.OpenGL;

@deob.ObfuscatedName("xg")
public class class940 extends class344 {
   @deob.ObfuscatedName("xg.l")
   private static final float[] field9496 = new float[4];
   @deob.ObfuscatedName("xg.s")
   private final class346 field9495;
   @deob.ObfuscatedName("xg.x")
   private class339 field9494;
   @deob.ObfuscatedName("xg.o")
   private float[] field9492;
   @deob.ObfuscatedName("xg.a")
   private float field9493;
   @deob.ObfuscatedName("xg.p")
   private int field9489;
   @deob.ObfuscatedName("xg.r")
   private class355 field9488;

   public class940(class983 arg0, class346 arg1) {
      super(arg0);
      this.field9495 = arg1;
      if (this.field2169.field10383 && this.field2169.field10237 >= 2) {
         this.field9494 = class339.method4147(this.field2169, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
         if (this.field9494 == null) {
            return;
         }

         int[][] var3 = class257.method1441(64, 256, 0, 4, 4, 3, 0.4F, false);
         int[][] var4 = class257.method1441(64, 256, 8, 4, 4, 3, 0.4F, false);
         int var5 = 0;
         this.field9492 = new float[32768];

         for(int var6 = 0; var6 < 256; ++var6) {
            int[] var7 = var3[var6];
            int[] var8 = var4[var6];

            for(int var9 = 0; var9 < 64; ++var9) {
               this.field9492[var5++] = (float)var7[var9] / 4096.0F;
               this.field9492[var5++] = (float)var8[var9] / 4096.0F;
            }
         }

         this.method16003();
      }

   }

   @deob.ObfuscatedName("xg.n()Z")
   public boolean method4182() {
      return true;
   }

   @deob.ObfuscatedName("xg.t()V")
   private void method16003() {
      this.field9488 = new class355(this.field2169, 2);
      this.field9488.method4307(0);
      this.field2169.method16638(1);
      this.field2169.method16604(-16777216);
      this.field2169.method16642(260, 7681);
      this.field2169.method16616(0, 34166, 770);
      this.field2169.method16638(0);
      OpenGL.glBindProgramARB(34336, this.field9494.field2143);
      OpenGL.glEnable(34336);
      this.field9488.method4303();
      this.field9488.method4307(1);
      this.field2169.method16638(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      this.field2169.method16640(0);
      this.field2169.method16616(0, 5890, 770);
      this.field2169.method16638(0);
      OpenGL.glBindProgramARB(34336, 0);
      OpenGL.glDisable(34336);
      OpenGL.glDisable(34820);
      this.field9488.method4303();
   }

   @deob.ObfuscatedName("xg.k(Z)V")
   public void method4187(boolean arg0) {
      if (this.field9488 != null) {
         this.field9488.method4305('\u0000');
         this.field2169.method16638(1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.field2169.field10289.field5413, 0);
         OpenGL.glMatrixMode(5888);
         this.field2169.method16638(0);
         if (this.field2169.field10374 != this.field9489) {
            int var2 = this.field2169.field10374 % 5000 * 128 / 5000;

            for(int var3 = 0; var3 < 64; ++var3) {
               OpenGL.glProgramLocalParameter4fvARB(34336, var3, this.field9492, var2);
               var2 += 2;
            }

            if (this.field9495.field2181) {
               this.field9493 = (float)(this.field2169.field10374 % 4000) / 4000.0F;
            } else {
               OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            this.field9489 = this.field2169.field10374;
         }

      }
   }

   @deob.ObfuscatedName("xg.d(Z)V")
   public void method4184(boolean arg0) {
   }

   @deob.ObfuscatedName("xg.b()V")
   public void method4196() {
      if (this.field9488 != null) {
         this.field9488.method4305('\u0001');
         this.field2169.method16638(1);
         this.field2169.method16639((class354)null);
         this.field2169.method16638(0);
      }
   }

   @deob.ObfuscatedName("xg.r(II)V")
   public void method4199(int arg0, int arg1) {
      if (this.field9488 != null) {
         this.field2169.method16638(1);
         if ((arg0 & 128) == 0) {
            if ((arg1 & 1) == 1) {
               if (!this.field9495.field2181) {
                  int var3 = this.field2169.field10374 % 4000 * 16 / 4000;
                  this.field2169.method16639(this.field9495.field2182[var3]);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
               } else {
                  this.field2169.method16639(this.field9495.field2183);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field9493, 0.0F, 0.0F, 1.0F);
               }
            } else {
               if (this.field9495.field2181) {
                  this.field2169.method16639(this.field9495.field2183);
               } else {
                  this.field2169.method16639(this.field9495.field2182[0]);
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            this.field2169.method16639((class354)null);
         }

         this.field2169.method16638(0);
         if ((arg0 & 64) == 0) {
            field9496[0] = this.field2169.field10330 * this.field2169.field10327;
            field9496[1] = this.field2169.field10330 * this.field2169.field10215;
            field9496[2] = this.field2169.field10330 * this.field2169.field10329;
            OpenGL.glProgramLocalParameter4fvARB(34336, 66, field9496, 0);
         } else {
            OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         int var4 = arg0 & 3;
         if (var4 == 2) {
            OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
         } else if (var4 == 3) {
            OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
         } else {
            OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   @deob.ObfuscatedName("xg.p(Lbw;I)V")
   public void method4183(class354 arg0, int arg1) {
      this.field2169.method16639(arg0);
      this.field2169.method16640(arg1);
   }
}
