import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

@deob.ObfuscatedName("abq")
public class class46 extends class570 implements class511 {
   @deob.ObfuscatedName("abq.p")
   private final int field324;
   @deob.ObfuscatedName("abq.o")
   private final int field325;
   @deob.ObfuscatedName("abq.a")
   private final float field326;
   @deob.ObfuscatedName("abq.x")
   private final float field327;
   @deob.ObfuscatedName("abq.l")
   public boolean field328;
   @deob.ObfuscatedName("abq.s")
   public boolean field329;

   public class46(class197 arg0, class372 arg1, class405 arg2, int arg3, int arg4) {
      this(arg0, arg1, arg2, arg3, arg4, 0, 1);
   }

   protected class46(class197 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (!this.field5144.field1278) {
         this.field324 = class887.method4053(arg3);
         this.field325 = class887.method4053(arg4);
         this.field326 = (float)arg3 / (float)this.field324;
         this.field327 = (float)arg4 / (float)this.field325;
      } else {
         this.field324 = arg3;
         this.field325 = arg4;
         this.field326 = 1.0F;
         this.field327 = 1.0F;
      }

      this.field5147 = IDirect3DDevice.CreateTexture(this.field5144.field1256, arg3, arg4, 0, arg5, class197.method2581(this.field5143, this.field5145), arg6);
   }

   public class46(class197 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class372.field2736, class405.field3052, arg3 && arg0.field1275, arg1 * arg2);
      if (!this.field5144.field1278) {
         this.field324 = class887.method4053(arg1);
         this.field325 = class887.method4053(arg2);
         this.field326 = (float)arg1 / (float)this.field324;
         this.field327 = (float)arg2 / (float)this.field325;
         if (this.field324 != arg1 || this.field325 != arg2) {
            arg4 = this.method714(arg1, arg2, this.field324, this.field325, arg4, arg5, arg6);
            arg5 = 0;
            arg6 = this.field324;
         }
      } else {
         this.field324 = arg1;
         this.field325 = arg2;
         this.field326 = 1.0F;
         this.field327 = 1.0F;
      }

      if (arg3) {
         this.field5147 = IDirect3DDevice.CreateTexture(this.field5144.field1256, this.field324, this.field325, 0, 1024, 21, 1);
      } else {
         this.field5147 = IDirect3DDevice.CreateTexture(this.field5144.field1256, this.field324, this.field325, 1, 0, 21, 1);
      }

      if (arg6 == 0) {
         arg6 = this.field324;
      }

      ByteBuffer var8 = this.field5144.field9975;
      var8.clear();
      var8.asIntBuffer().put(arg4, arg5, this.field325 * arg6);
      IDirect3DTexture.Upload(this.field5147, 0, 0, 0, this.field324, this.field325, this.field5143.field2744 * arg6, 0, this.field5144.field9976);
   }

   public class46(class197 arg0, class372 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class405.field3052, arg4 && arg0.field1275, arg2 * arg3);
      if (!this.field5144.field1278) {
         this.field324 = class887.method4053(arg2);
         this.field325 = class887.method4053(arg3);
         this.field326 = (float)arg2 / (float)this.field324;
         this.field327 = (float)arg3 / (float)this.field325;
         if (this.field324 != arg2 || this.field325 != arg3) {
            arg5 = this.method715(arg2, arg3, this.field324, this.field325, arg5, arg6, arg7, arg1.field2744);
            arg6 = 0;
            arg7 = this.field324;
         }
      } else {
         this.field324 = arg2;
         this.field325 = arg3;
         this.field326 = 1.0F;
         this.field327 = 1.0F;
      }

      if (arg4) {
         this.field5147 = IDirect3DDevice.CreateTexture(this.field5144.field1256, this.field324, this.field325, 0, 1024, class197.method2581(this.field5143, class405.field3052), 1);
      } else {
         this.field5147 = IDirect3DDevice.CreateTexture(this.field5144.field1256, this.field324, this.field325, 1, 0, class197.method2581(this.field5143, class405.field3052), 1);
      }

      if (arg7 == 0) {
         arg7 = this.field324;
      }

      ByteBuffer var9 = this.field5144.field9975;
      var9.clear();
      class372 var10001 = this.field5143;
      if (this.field5143 == class372.field2741) {
         var9.put(arg5, arg6, this.field325 * this.field324 / 2);
         IDirect3DTexture.Upload(this.field5147, 0, 0, 0, this.field324, this.field325 / 4, this.field324 / 4 * 8, 0, this.field5144.field9976);
      } else {
         var10001 = this.field5143;
         if (this.field5143 == class372.field2742) {
            var9.put(arg5, arg6, this.field325 * this.field324);
            IDirect3DTexture.Upload(this.field5147, 0, 0, 0, this.field324, this.field325 / 4, this.field324 / 4 * 16, 0, this.field5144.field9976);
         } else {
            var9.put(arg5, arg6, this.field325 * arg7);
            IDirect3DTexture.Upload(this.field5147, 0, 0, 0, this.field324, this.field325, this.field5143.field2744 * arg7, 0, this.field5144.field9976);
         }
      }

   }

   public class46(class197 arg0, class372 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class405.field3052, arg4 && arg0.field1275, arg2 * arg3);
      if (!this.field5144.field1278) {
         this.field324 = class887.method4053(arg2);
         this.field325 = class887.method4053(arg3);
         this.field326 = (float)arg2 / (float)this.field324;
         this.field327 = (float)arg3 / (float)this.field325;
         if (this.field324 != arg2 || this.field325 != arg3) {
            arg5 = this.method712(arg2, arg3, this.field324, this.field325, arg5, arg6, arg7, arg1.field2744);
            arg6 = 0;
            arg7 = this.field324;
         }
      } else {
         this.field324 = arg2;
         this.field325 = arg3;
         this.field326 = 1.0F;
         this.field327 = 1.0F;
      }

      if (arg4) {
         this.field5147 = IDirect3DDevice.CreateTexture(this.field5144.field1256, this.field324, this.field325, 0, 1024, class197.method2581(this.field5143, class405.field3057), 1);
      } else {
         this.field5147 = IDirect3DDevice.CreateTexture(this.field5144.field1256, this.field324, this.field325, 1, 0, class197.method2581(this.field5143, class405.field3057), 1);
      }

      if (arg7 == 0) {
         arg7 = this.field324;
      }

      ByteBuffer var9 = this.field5144.field9975;
      var9.clear();
      var9.asFloatBuffer().put(arg5, arg6, this.field5143.field2744 * this.field325 * arg7);
      IDirect3DTexture.Upload(this.field5147, 0, 0, 0, this.field324, this.field325, this.field5143.field2744 * arg7 * 4, 0, this.field5144.field9976);
   }

   @deob.ObfuscatedName("abq.n()I")
   public int method507() {
      return this.field324;
   }

   @deob.ObfuscatedName("abq.k()I")
   public int method491() {
      return this.field325;
   }

   @deob.ObfuscatedName("abq.b(F)F")
   public float method492(float arg0) {
      return arg0 / (float)this.field324;
   }

   @deob.ObfuscatedName("abq.r(F)F")
   public float method493(float arg0) {
      return arg0 / (float)this.field325;
   }

   @deob.ObfuscatedName("abq.v()F")
   public float method508() {
      return this.field326;
   }

   @deob.ObfuscatedName("abq.g()F")
   public float method495() {
      return this.field327;
   }

   @deob.ObfuscatedName("abq.p()Z")
   public boolean method496() {
      return true;
   }

   @deob.ObfuscatedName("abq.bf()J")
   public long method713() {
      return this.field5147;
   }

   @deob.ObfuscatedName("abq.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }

   @deob.ObfuscatedName("abq.o(ZZ)V")
   public void method497(boolean arg0, boolean arg1) {
      this.field329 = arg0;
      this.field328 = arg1;
   }

   @deob.ObfuscatedName("abq.a(IIII[III)V")
   public void method498(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      if (class372.field2736 == this.field5143 && class405.field3052 == this.field5145) {
         if (arg6 == 0) {
            arg6 = arg2;
         }

         ByteBuffer var8 = this.field5144.field9975;
         var8.clear();
         var8.asIntBuffer().put(arg4, arg5, arg3 * arg6);
         IDirect3DTexture.Upload(this.field5147, 0, arg0, arg1, arg2, arg3, this.field5143.field2744 * arg6, 0, this.field5144.field9976);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("abq.l(IIII[BLcn;II)V")
   public void method499(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class372 arg5, int arg6, int arg7) {
      if (this.field5143 == arg5 && class405.field3052 == this.field5145) {
         if (arg7 == 0) {
            arg7 = arg2;
         }

         ByteBuffer var9 = this.field5144.field9975;
         var9.clear();
         var9.put(arg4, arg6, arg3 * arg7);
         IDirect3DTexture.Upload(this.field5147, 0, arg0, arg1, arg2, arg3, this.field5143.field2744 * arg7, 0, this.field5144.field9976);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("abq.u(IIII[II)V")
   public void method535(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
      if (class372.field2736 == this.field5143 && class405.field3052 == this.field5145) {
         ByteBuffer var7 = this.field5144.field9975;
         var7.clear();
         IDirect3DTexture.Download(this.field5147, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.field5144.field9976);
         var7.asIntBuffer().get(arg4, arg5, arg2 * arg3);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("abq.aq()V")
   public void method502() {
      this.field5144.method2568(this);
   }

   @deob.ObfuscatedName("abq.h()Z")
   public boolean method501() {
      return false;
   }

   @deob.ObfuscatedName("abq.by(IIII[III)[I")
   private int[] method714(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      int[] var8 = new int[arg2 * arg3];
      if (arg6 == 0) {
         arg6 = arg0;
      }

      for(int var9 = 0; var9 < arg3; ++var9) {
         if (var9 >= arg1) {
            int var14 = (arg1 - 1) * arg2;

            for(int var15 = 0; var15 < arg2; ++var15) {
               var8[arg2 * var9 + var15] = var8[var14 + var15];
            }
         } else {
            int var10 = arg6 * var9 + arg5;

            for(int var11 = 0; var11 < arg0; ++var11) {
               var8[arg2 * var9 + var11] = arg4[var10 + var11];
            }

            int var12 = arg4[arg0 - 1 + var10];

            for(int var13 = arg0; var13 < arg2; ++var13) {
               var8[arg2 * var9 + var13] = var12;
            }
         }
      }

      return var8;
   }

   @deob.ObfuscatedName("abq.bx(IIII[FIII)[F")
   private float[] method712(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7) {
      float[] var9 = new float[arg2 * arg3 * arg7];
      if (arg6 == 0) {
         arg6 = arg0 * arg7;
      }

      for(int var10 = 0; var10 < arg3; ++var10) {
         if (var10 < arg1) {
            int var11 = arg6 * var10 + arg5;

            for(int var12 = 0; var12 < arg0; ++var12) {
               for(int var13 = 0; var13 < arg7; ++var13) {
                  var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
               }
            }

            float[] var14 = new float[arg7];

            for(int var15 = 0; var15 < arg7; ++var15) {
               var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
            }

            for(int var16 = arg0; var16 < arg2; ++var16) {
               for(int var17 = 0; var17 < arg7; ++var17) {
                  var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
               }
            }
         } else {
            int var18 = (arg1 - 1) * arg2 * arg7;

            for(int var19 = 0; var19 < arg2; ++var19) {
               for(int var20 = 0; var20 < arg7; ++var20) {
                  var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
               }
            }
         }
      }

      return var9;
   }

   @deob.ObfuscatedName("abq.bm(IIII[BIII)[B")
   private byte[] method715(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
      byte[] var9 = new byte[arg2 * arg3 * arg7];
      if (arg6 == 0) {
         arg6 = arg0 * arg7;
      }

      for(int var10 = 0; var10 < arg3; ++var10) {
         if (var10 < arg1) {
            int var11 = arg6 * var10 + arg5;

            for(int var12 = 0; var12 < arg0; ++var12) {
               for(int var13 = 0; var13 < arg7; ++var13) {
                  var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
               }
            }

            byte[] var14 = new byte[arg7];

            for(int var15 = 0; var15 < arg7; ++var15) {
               var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
            }

            for(int var16 = arg0; var16 < arg2; ++var16) {
               for(int var17 = 0; var17 < arg7; ++var17) {
                  var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
               }
            }
         } else {
            int var18 = (arg1 - 1) * arg2 * arg7;

            for(int var19 = 0; var19 < arg2; ++var19) {
               for(int var20 = 0; var20 < arg7; ++var20) {
                  var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
               }
            }
         }
      }

      return var9;
   }

   @deob.ObfuscatedName("abq.d()V")
   public void method302() {
      super.method302();
   }
}
