import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@deob.ObfuscatedName("aci")
public class class65 extends class674 {
   @deob.ObfuscatedName("aci.r")
   private final class976 field462;
   @deob.ObfuscatedName("aci.b")
   private final class983 field466;
   @deob.ObfuscatedName("aci.p")
   public final int field461;
   @deob.ObfuscatedName("aci.o")
   public final float field459;
   @deob.ObfuscatedName("aci.a")
   public final class402 field463;
   @deob.ObfuscatedName("aci.l")
   private int[] field460;
   @deob.ObfuscatedName("aci.s")
   private class946 field465;
   @deob.ObfuscatedName("aci.x")
   private class340 field464;
   @deob.ObfuscatedName("aci.v")
   private Stream field468;
   @deob.ObfuscatedName("aci.u")
   private NativeHeapBuffer field467;

   public class65(class976 arg0, int arg1, int arg2, class402 arg3) {
      this.field462 = arg0;
      this.field466 = this.field462.field9886;
      this.field461 = arg1;
      this.field459 = (float)arg2;
      this.field463 = arg3;
      this.field460 = new int[this.field462.field9463 * this.field462.field9461];
      this.field465 = new class946(this.field466, 5123, (byte[])null, 1);
   }

   @deob.ObfuscatedName("aci.n(I)V")
   public void method984(int arg0) {
      this.field467 = this.field466.field10267.method7793(arg0 * 4, true);
      this.field468 = new Stream(this.field467);
   }

   @deob.ObfuscatedName("aci.k(I)V")
   public void method986(int arg0) {
      this.field468.method7807(arg0 * 4 + 3);
      this.field468.method7808(-1);
   }

   @deob.ObfuscatedName("aci.d(III)V")
   public void method980(int arg0, int arg1, int arg2) {
      this.field460[this.field462.field9463 * arg1 + arg0] |= 1 << arg2;
   }

   @deob.ObfuscatedName("aci.b(IIIF)V")
   public void method981(int arg0, int arg1, int arg2, float arg3) {
      if (this.field461 != -1) {
         class360 var5 = this.field466.field7118.method5112(this.field461);
         int var6 = var5.field2328 & 255;
         if (var6 != 0 && var5.field2324 != 4) {
            int var7;
            if (arg2 < 0) {
               var7 = 0;
            } else if (arg2 > 127) {
               var7 = 16777215;
            } else {
               var7 = arg2 * 131586;
            }

            if (var6 == 256) {
               arg1 = var7;
            } else {
               int var9 = 256 - var6;
               arg1 = ((arg1 & 16711935) * var9 + (var7 & 16711935) * var6 & -16711936) + ((arg1 & 65280) * var9 + (var7 & 65280) * var6 & 16711680) >> 8;
            }
         }

         int var10 = var5.field2307 & 255;
         if (var10 != 0) {
            var10 += 256;
            int var11 = ((arg1 & 16711680) >> 16) * var10;
            if (var11 > 65535) {
               var11 = 65535;
            }

            int var12 = ((arg1 & 65280) >> 8) * var10;
            if (var12 > 65535) {
               var12 = 65535;
            }

            int var13 = (arg1 & 255) * var10;
            if (var13 > 65535) {
               var13 = 65535;
            }

            arg1 = (var13 >> 8) + (var11 << 8 & 16711680) + (var12 & 65280);
         }
      }

      if (arg3 != 1.0F) {
         int var14 = arg1 >> 16 & 255;
         int var15 = arg1 >> 8 & 255;
         int var16 = arg1 & 255;
         int var17 = (int)((float)var14 * arg3);
         if (var17 < 0) {
            var17 = 0;
         } else if (var17 > 255) {
            var17 = 255;
         }

         int var18 = (int)((float)var15 * arg3);
         if (var18 < 0) {
            var18 = 0;
         } else if (var18 > 255) {
            var18 = 255;
         }

         int var19 = (int)((float)var16 * arg3);
         if (var19 < 0) {
            var19 = 0;
         } else if (var19 > 255) {
            var19 = 255;
         }

         arg1 = var17 << 16 | var18 << 8 | var19;
      }

      this.field468.method7807(arg0 * 4);
      this.field468.method7808((byte)(arg1 >> 16));
      this.field468.method7808((byte)(arg1 >> 8));
      this.field468.method7808((byte)arg1);
   }

   @deob.ObfuscatedName("aci.r(I)V")
   public void method982(int arg0) {
      this.field468.method7811();
      class341 var2 = this.field466.method16628(4, this.field467, arg0 * 4, false);
      if (var2 instanceof class949) {
         this.field467.method7800();
      }

      this.field464 = new class340(var2, 5121, 4, 0);
      this.field467 = null;
      this.field468 = null;
   }

   @deob.ObfuscatedName("aci.p([II)V")
   public void method983(int[] arg0, int arg1) {
      int var3 = 0;
      class268 var4 = this.field466.field10296;
      var4.field935 = 0;
      if (this.field466.field10274) {
         for(int var5 = 0; var5 < arg1; ++var5) {
            int var6 = arg0[var5];
            short[] var7 = this.field462.field9893[var6];
            int var8 = this.field460[var6];
            if (var8 != 0 && var7 != null) {
               int var9 = 0;
               int var10 = 0;

               while(var10 < var7.length) {
                  if ((var8 & 1 << var9++) != 0) {
                     var4.method1569(var7[var10++] & 65535);
                     ++var3;
                     var4.method1569(var7[var10++] & 65535);
                     ++var3;
                     var4.method1569(var7[var10++] & 65535);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      } else {
         for(int var11 = 0; var11 < arg1; ++var11) {
            int var12 = arg0[var11];
            short[] var13 = this.field462.field9893[var12];
            int var14 = this.field460[var12];
            if (var14 != 0 && var13 != null) {
               int var15 = 0;
               int var16 = 0;

               while(var16 < var13.length) {
                  if ((var14 & 1 << var15++) != 0) {
                     var4.method1668(var13[var16++] & 65535);
                     ++var3;
                     var4.method1668(var13[var16++] & 65535);
                     ++var3;
                     var4.method1668(var13[var16++] & 65535);
                     ++var3;
                  } else {
                     var16 += 3;
                  }
               }
            }
         }
      }

      if (var3 > 0) {
         this.field465.method4539(5123, var4.field931, var4.field935);
         this.field466.method16631(this.field462.field9906, this.field462.field9908, this.field464, this.field462.field9909);
         this.field466.method16791(this.field461, (this.field462.field9890 & 7) != 0, (this.field462.field9890 & 8) != 0);
         if (this.field466.field10346) {
            this.field466.method7562(Integer.MAX_VALUE, this.field463);
         }

         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(1.0F / this.field459, 1.0F / this.field459, 1.0F);
         OpenGL.glMatrixMode(5888);
         this.field466.method16631(this.field462.field9906, this.field462.field9908, this.field464, this.field462.field9909);
         this.field466.method16633(this.field465, 4, 0, var3);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      }

   }
}
