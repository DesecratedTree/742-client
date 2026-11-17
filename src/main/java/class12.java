import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@deob.ObfuscatedName("aaj")
public final class class12 extends class422 {
   @deob.ObfuscatedName("aaj.r")
   private boolean field134;
   @deob.ObfuscatedName("aaj.g")
   private final float[][] field143;
   @deob.ObfuscatedName("aaj.h")
   private final boolean[] field139;
   @deob.ObfuscatedName("aaj.s")
   private byte[] field144;
   @deob.ObfuscatedName("aaj.l")
   private byte[] field140;
   @deob.ObfuscatedName("aaj.x")
   private static final float[] field138 = new float[16];
   @deob.ObfuscatedName("aaj.p")
   private class197 field135;
   @deob.ObfuscatedName("aaj.b")
   private class25 field133;
   @deob.ObfuscatedName("aaj.o")
   public long field136;
   @deob.ObfuscatedName("aaj.a")
   public long field137;

   private class12(class197 arg0, class432 arg1) {
      this.field134 = false;
      this.field143 = new float[2][];
      this.field139 = new boolean[2];
      this.field3304 = arg1.field3598;
      if (arg1.field3596 != null) {
         this.field3305 = arg1.field3596;
         this.field144 = arg0.method2578(this.field3305);
      }

      if (arg1.field3599 != null) {
         this.field3303 = arg1.field3599;
         this.field140 = arg0.method2578(this.field3303);
      }

      arg0.method16317(this);
   }

   public class12(class197 arg0, class25 arg1, class432 arg2) {
      this(arg0, arg2);
      this.field135 = arg0;
      this.field133 = arg1;
   }

   @deob.ObfuscatedName("aaj.k()Z")
   public boolean method284() {
      if (this.field134) {
         return true;
      } else {
         this.field136 = this.field144 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.field135.field1256, this.field144);
         this.field137 = this.field140 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.field135.field1256, this.field140);
         if (this.field136 == 0L && this.field137 == 0L) {
            return false;
         } else {
            int var1 = -1;

            for(int var2 = 0; var2 < this.field133.method6014(); ++var2) {
               if (this.field133.method6015(var2) == this) {
                  var1 = var2;
                  break;
               }
            }

            int var3 = this.field133.method6041();
            int var4 = this.field133.method6081();

            for(int var5 = 0; var5 < var3; ++var5) {
               class225 var6 = this.field133.method6042(var5);
               var6.method3132(var1);
            }

            for(int var7 = 0; var7 < var4; ++var7) {
               class225 var8 = this.field133.method6045(var7);
               var8.method3132(var1);
            }

            int var9 = 0;
            int var10 = 0;
            int var11 = this.field133.method6016(this);

            for(int var12 = 0; var12 < var3 + var4; ++var12) {
               class296 var13 = (class296)(var12 < var3 ? this.field133.method6042(var12) : this.field133.method6045(var12 - var3));
               class420 var14 = var13.method3119();
               int var15 = 1;
               if (class420.field3138 == var14) {
                  var14 = var13.method3120();
                  var15 = var13.method3121();
               }

               switch(var14.field3261) {
               case 0:
               case 13:
               case 77:
               case 123:
                  break;
               case 29:
               case 35:
               case 69:
               case 97:
                  var15 *= 3;
                  break;
               case 31:
               case 39:
               case 95:
               case 99:
                  var15 *= 2;
                  break;
               case 44:
               case 49:
               case 52:
               case 65:
                  var15 *= 4;
                  break;
               default:
                  var15 = 0;
               }

               if (var13.field1880[var11] >= 0) {
                  int var16 = var13.field1880[var11] + var15;
                  if (var9 < var16) {
                     var9 = var16;
                  }
               }

               if (var13.field1881[var11] >= 0) {
                  int var17 = var13.field1881[var11] + var15;
                  if (var10 < var17) {
                     var10 = var17;
                  }
               }
            }

            this.field143[0] = new float[var9 * 4];
            this.field143[1] = new float[var10 * 4];
            this.field134 = true;
            return true;
         }
      }
   }

   @deob.ObfuscatedName("aaj.b(Laig;F)V")
   public void method285(class225 arg0, float arg1) {
      int var3 = ((class296)arg0).method3811();
      int var4 = ((class296)arg0).method3812();
      if (arg0.method3119() != class420.field3205 && arg0.method3119() != class420.field3151) {
         throw new class305(arg0, "");
      } else {
         if (var3 >= 0) {
            int var5 = var3 * 4;
            this.field143[0][var5] = arg1;
            this.field139[0] = true;
         }

         if (var4 >= 0) {
            int var6 = var4 * 4;
            this.field143[1][var6] = arg1;
            this.field139[1] = true;
         }

      }
   }

   @deob.ObfuscatedName("aaj.r(Laig;FF)V")
   public void method286(class225 arg0, float arg1, float arg2) {
      int var4 = ((class296)arg0).method3811();
      int var5 = ((class296)arg0).method3812();
      if (arg0.method3119() != class420.field3161) {
         throw new class305(arg0, "");
      } else {
         if (var4 >= 0) {
            int var6 = var4 * 4;
            this.field143[0][var6 + 0] = arg1;
            this.field143[0][var6 + 1] = arg2;
            this.field139[0] = true;
         }

         if (var5 >= 0) {
            int var7 = var5 * 4;
            this.field143[1][var7 + 0] = arg1;
            this.field143[1][var7 + 1] = arg2;
            this.field139[1] = true;
         }

      }
   }

   @deob.ObfuscatedName("aaj.p(Laig;FFF)V")
   public void method287(class225 arg0, float arg1, float arg2, float arg3) {
      int var5 = ((class296)arg0).method3811();
      int var6 = ((class296)arg0).method3812();
      if (arg0.method3119() != class420.field3162) {
         throw new class305(arg0, "");
      } else {
         if (var5 >= 0) {
            int var7 = var5 * 4;
            this.field143[0][var7 + 0] = arg1;
            this.field143[0][var7 + 1] = arg2;
            this.field143[0][var7 + 2] = arg3;
            this.field139[0] = true;
         }

         if (var6 >= 0) {
            int var8 = var6 * 4;
            this.field143[1][var8 + 0] = arg1;
            this.field143[1][var8 + 1] = arg2;
            this.field143[1][var8 + 2] = arg3;
            this.field139[1] = true;
         }

      }
   }

   @deob.ObfuscatedName("aaj.o(Laig;FFFF)V")
   public void method288(class225 arg0, float arg1, float arg2, float arg3, float arg4) {
      int var6 = ((class296)arg0).method3811();
      int var7 = ((class296)arg0).method3812();
      if (arg0.method3119() != class420.field3169) {
         throw new class305(arg0, "");
      } else {
         if (var6 >= 0) {
            int var8 = var6 * 4;
            this.field143[0][var8 + 0] = arg1;
            this.field143[0][var8 + 1] = arg2;
            this.field143[0][var8 + 2] = arg3;
            this.field143[0][var8 + 3] = arg4;
            this.field139[0] = true;
         }

         if (var7 >= 0) {
            int var9 = var7 * 4;
            this.field143[1][var9 + 0] = arg1;
            this.field143[1][var9 + 1] = arg2;
            this.field143[1][var9 + 2] = arg3;
            this.field143[1][var9 + 3] = arg4;
            this.field139[1] = true;
         }

      }
   }

   @deob.ObfuscatedName("aaj.l(Laig;Lko;)V")
   public void method311(class225 arg0, class597 arg1) {
      int var3 = ((class296)arg0).method3811();
      int var4 = ((class296)arg0).method3812();
      if (arg0.method3119() != class420.field3256) {
         throw new class305(arg0, "");
      } else {
         if (var3 >= 0) {
            this.method346(var3, arg1.method8442(field138), 8);
         }

         if (var4 >= 0) {
            this.method300(var4, arg1.method8442(field138), 8);
         }

      }
   }

   @deob.ObfuscatedName("aaj.u(Laig;Lko;)V")
   public void method304(class225 arg0, class597 arg1) {
      int var3 = ((class296)arg0).method3811();
      int var4 = ((class296)arg0).method3812();
      if (arg0.method3119() != class420.field3179) {
         throw new class305(arg0, "");
      } else {
         if (var3 >= 0) {
            this.method346(var3, arg1.method8415(field138), 16);
         }

         if (var4 >= 0) {
            this.method300(var4, arg1.method8415(field138), 16);
         }

      }
   }

   @deob.ObfuscatedName("aaj.a(Laig;[FI)V")
   public void method333(class225 arg0, float[] arg1, int arg2) {
      int var4 = ((class296)arg0).method3811();
      int var5 = ((class296)arg0).method3812();
      if (arg0.method3119() != class420.field3138) {
         throw new class305(arg0, "");
      } else {
         if (var4 >= 0) {
            this.method346(var4, arg1, arg2);
         }

         if (var5 >= 0) {
            this.method300(var5, arg1, arg2);
         }

      }
   }

   @deob.ObfuscatedName("aaj.v(Laig;ILip;)V")
   public void method283(class225 arg0, int arg1, class536 arg2) {
      this.field135.method16351(arg1);
      this.field135.method16470(arg2);
   }

   @deob.ObfuscatedName("aaj.g(IFFF)V")
   public void method293(int arg0, float arg1, float arg2, float arg3) {
      int var5 = arg0 >> 16;
      int var6 = (arg0 & 65535) * 4;
      this.field143[var5][var6] = arg1;
      this.field143[var5][var6 + 1] = arg2;
      this.field143[var5][var6 + 2] = arg3;
      this.field139[var5] = true;
   }

   @deob.ObfuscatedName("aaj.h(IFFFF)V")
   public void method294(int arg0, float arg1, float arg2, float arg3, float arg4) {
      int var6 = arg0 >> 16;
      int var7 = (arg0 & 65535) * 4;
      this.field143[var6][var7] = arg1;
      this.field143[var6][var7 + 1] = arg2;
      this.field143[var6][var7 + 2] = arg3;
      this.field143[var6][var7 + 3] = arg4;
      this.field139[var6] = true;
   }

   @deob.ObfuscatedName("aaj.z(ILko;)V")
   public void method299(int arg0, class597 arg1) {
      int var3 = arg0 >> 16;
      int var4 = (arg0 & 65535) * 4;
      System.arraycopy(arg1.method8415(field138), 0, this.field143[var3], var4, 12);
      this.field139[var3] = true;
   }

   @deob.ObfuscatedName("aaj.m(ILko;)V")
   public void method296(int arg0, class597 arg1) {
      int var3 = arg0 >> 16;
      int var4 = (arg0 & 65535) * 4;
      System.arraycopy(arg1.method8442(field138), 0, this.field143[var3], var4, 8);
      this.field139[var3] = true;
   }

   @deob.ObfuscatedName("aaj.i(ILko;)V")
   public void method336(int arg0, class597 arg1) {
      int var3 = arg0 >> 16;
      int var4 = (arg0 & 65535) * 4;
      System.arraycopy(arg1.method8415(field138), 0, this.field143[var3], var4, 16);
      this.field139[var3] = true;
   }

   @deob.ObfuscatedName("aaj.e(I[FI)V")
   public void method327(int arg0, float[] arg1, int arg2) {
      int var4 = arg0 >> 16;
      int var5 = (arg0 & 65535) * 4;
      System.arraycopy(arg1, 0, this.field143[var4], var5, arg2);
      this.field139[var4] = true;
   }

   @deob.ObfuscatedName("aaj.bp(I[FI)V")
   private final void method346(int arg0, float[] arg1, int arg2) {
      class803.method14268(arg1, 0, this.field143[0], arg0 * 4, arg2);
      this.field139[0] = true;
   }

   @deob.ObfuscatedName("aaj.bs(I[FI)V")
   private final void method300(int arg0, float[] arg1, int arg2) {
      class803.method14268(arg1, 0, this.field143[1], arg0 * 4, arg2);
      this.field139[1] = true;
   }

   @deob.ObfuscatedName("aaj.t(IILip;)V")
   public void method301(int arg0, int arg1, class536 arg2) {
      this.field135.method16351(arg1);
      this.field135.method16470(arg2);
   }

   @deob.ObfuscatedName("aaj.br()V")
   public void method289() {
      if (this.field139[0]) {
         for(int var1 = 0; var1 < this.field143[0].length; ++var1) {
            this.field135.field9978.putFloat((long)(var1 * 4) + this.field135.field9976, this.field143[0][var1]);
         }

         IDirect3DDevice.SetVertexShaderConstantF(this.field135.field1256, 0, this.field135.field9976, this.field143[0].length / 4);
         this.field139[0] = false;
      }

      if (this.field139[1]) {
         for(int var2 = 0; var2 < this.field143[1].length; ++var2) {
            this.field135.field9978.putFloat((long)(var2 * 4) + this.field135.field9976, this.field143[1][var2]);
         }

         IDirect3DDevice.SetPixelShaderConstantF(this.field135.field1256, 0, this.field135.field9976, this.field143[1].length / 4);
         this.field139[1] = false;
      }

   }

   @deob.ObfuscatedName("aaj.d()V")
   public void method302() {
      if (this.field136 != 0L) {
         IUnknown.Release(this.field136);
         this.field136 = 0L;
      }

      if (this.field137 != 0L) {
         IUnknown.Release(this.field137);
         this.field137 = 0L;
      }

      this.field135.method16305(this);
   }

   @deob.ObfuscatedName("aaj.ba()V")
   private void method297() {
      if (this.field136 != 0L) {
         this.field135.method2586(this.field136);
         this.field136 = 0L;
      }

      if (this.field137 != 0L) {
         this.field135.method2586(this.field137);
         this.field137 = 0L;
      }

   }

   public void finalize() {
      this.method297();
   }
}
