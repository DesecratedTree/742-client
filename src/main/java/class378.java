import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@deob.ObfuscatedName("ct")
public class class378 implements class637 {
   @deob.ObfuscatedName("ct.n")
   private class612 field2753;
   @deob.ObfuscatedName("ct.k")
   private class612 field2754;
   @deob.ObfuscatedName("ct.b")
   private int field2756;
   @deob.ObfuscatedName("ct.d")
   private class360[] field2755;

   public class378(class612 arg0, class612 arg1, class612 arg2) {
      this.field2753 = arg1;
      this.field2754 = arg2;
      class124 var4 = new class124(arg0.method8771(0, 0));
      this.field2756 = var4.method1587();
      this.field2755 = new class360[this.field2756];

      for(int var5 = 0; var5 < this.field2756; ++var5) {
         if (var4.method1688() == 1) {
            this.field2755[var5] = new class360();
         }
      }

      for(int var6 = 0; var6 < this.field2756; ++var6) {
         if (this.field2755[var6] != null) {
            this.field2755[var6].field2331 = var4.method1688() == 0;
         }
      }

      for(int var7 = 0; var7 < this.field2756; ++var7) {
         if (this.field2755[var7] != null) {
            this.field2755[var7].field2315 = class360.method3991(var4.method1688());
         }
      }

      for(int var8 = 0; var8 < this.field2756; ++var8) {
         if (this.field2755[var8] != null) {
            this.field2755[var8].field2333 = var4.method1688() == 1;
         }
      }

      for(int var9 = 0; var9 < this.field2756; ++var9) {
         if (this.field2755[var9] != null) {
            this.field2755[var9].field2307 = var4.method1623();
         }
      }

      for(int var10 = 0; var10 < this.field2756; ++var10) {
         if (this.field2755[var10] != null) {
            this.field2755[var10].field2328 = var4.method1623();
         }
      }

      for(int var11 = 0; var11 < this.field2756; ++var11) {
         if (this.field2755[var11] != null) {
            this.field2755[var11].field2324 = var4.method1623();
         }
      }

      for(int var12 = 0; var12 < this.field2756; ++var12) {
         if (this.field2755[var12] != null) {
            this.field2755[var12].field2325 = var4.method1623();
         }
      }

      for(int var13 = 0; var13 < this.field2756; ++var13) {
         if (this.field2755[var13] != null) {
            this.field2755[var13].field2322 = (short)var4.method1587();
         }
      }

      for(int var14 = 0; var14 < this.field2756; ++var14) {
         if (this.field2755[var14] != null) {
            this.field2755[var14].field2330 = var4.method1623();
         }
      }

      for(int var15 = 0; var15 < this.field2756; ++var15) {
         if (this.field2755[var15] != null) {
            this.field2755[var15].field2317 = var4.method1623();
         }
      }

      for(int var16 = 0; var16 < this.field2756; ++var16) {
         if (this.field2755[var16] != null) {
            this.field2755[var16].field2334 = var4.method1688() == 1;
         }
      }

      for(int var17 = 0; var17 < this.field2756; ++var17) {
         if (this.field2755[var17] != null) {
            this.field2755[var17].field2339 = var4.method1688() == 1;
         }
      }

      for(int var18 = 0; var18 < this.field2756; ++var18) {
         if (this.field2755[var18] != null) {
            this.field2755[var18].field2335 = var4.method1623();
         }
      }

      for(int var19 = 0; var19 < this.field2756; ++var19) {
         if (this.field2755[var19] != null) {
            this.field2755[var19].field2320 = var4.method1688() == 1;
         }
      }

      for(int var20 = 0; var20 < this.field2756; ++var20) {
         if (this.field2755[var20] != null) {
            this.field2755[var20].field2336 = var4.method1688() == 1;
         }
      }

      for(int var21 = 0; var21 < this.field2756; ++var21) {
         if (this.field2755[var21] != null) {
            this.field2755[var21].field2332 = var4.method1688() == 1;
         }
      }

      for(int var22 = 0; var22 < this.field2756; ++var22) {
         if (this.field2755[var22] != null) {
            this.field2755[var22].field2340 = var4.method1688();
         }
      }

      for(int var23 = 0; var23 < this.field2756; ++var23) {
         if (this.field2755[var23] != null) {
            this.field2755[var23].field2337 = var4.method1591();
         }
      }

      for(int var24 = 0; var24 < this.field2756; ++var24) {
         if (this.field2755[var24] != null) {
            this.field2755[var24].field2323 = (class725)class814.method4102(class725.method14068(), var4.method1688());
         }
      }

   }

   @deob.ObfuscatedName("ct.n(I)I")
   public int method5135() {
      return this.field2756;
   }

   @deob.ObfuscatedName("ct.k(ILpy;FIIZI)Z")
   public boolean method5108(int arg0, class742 arg1, float arg2, int arg3, int arg4, boolean arg5) {
      boolean var7 = true;
      if (this.field2755[arg0].field2332) {
         var7 = this.field2754.method8790(arg0);
      }

      return var7 & this.field2753.method8790(arg0);
   }

   @deob.ObfuscatedName("ct.d(II)[I")
   private int[] method5109(int arg0) {
      int[] var2 = this.method5132(arg0);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         if ((var2[var3] & 16777215) != 0) {
            var2[var3] |= -16777216;
         } else {
            var2[var3] &= 16777215;
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("ct.b(II)[I")
   private int[] method5132(int arg0) {
      byte[] var2 = this.field2753.method8809(arg0);
      if (var2 == null) {
         return null;
      } else {
         try {
            return this.method5116(var2);
         } catch (IOException var5) {
            return null;
         }
      }
   }

   @deob.ObfuscatedName("ct.r(II)[F")
   private float[] method5120(int arg0) {
      int[] var2 = this.method5132(arg0);
      if (var2 == null) {
         return null;
      } else {
         int[] var3 = null;
         int var4 = this.field2755[arg0].field2315;
         if (this.field2755[arg0].field2332) {
            byte[] var5 = this.field2754.method8809(arg0);
            if (var5 != null) {
               try {
                  var3 = this.method5116(var5);

                  for(int var6 = 0; var6 < var3.length; ++var6) {
                     var3[var6] &= 4095;
                  }
               } catch (IOException var17) {
               }
            }
         }

         if (var3 == null) {
            var3 = new int[var4 * var4];
         }

         float[] var8 = new float[var2.length * 4];
         int var9 = 0;

         for(int var10 = 0; var10 < var2.length; ++var10) {
            int var11 = var2[var10];
            int var12 = var11 >>> 24;
            int var13 = (var11 & 16711680) >> 16;
            int var14 = (var11 & 65280) >> 8;
            int var15 = var11 & 255;
            float var16 = (float)var3[var10] * 31.0F / 4096.0F + 1.0F;
            var8[var9++] = (float)var13 * var16 / 255.0F;
            var8[var9++] = (float)var14 * var16 / 255.0F;
            var8[var9++] = (float)var15 * var16 / 255.0F;
            var8[var9++] = (float)var12 / 255.0F;
         }

         return var8;
      }
   }

   @deob.ObfuscatedName("ct.p(II)Lcb;")
   public class360 method5112(int arg0) {
      return this.field2755[arg0];
   }

   @deob.ObfuscatedName("ct.o(I)V")
   public void method5113() {
   }

   @deob.ObfuscatedName("ct.a(IFIIZI)[I")
   public int[] method5146(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
      return this.method5109(arg0);
   }

   @deob.ObfuscatedName("ct.x(IFIIZI)[I")
   public int[] method5115(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
      return this.method5132(arg0);
   }

   @deob.ObfuscatedName("ct.s(IFIIZI)[F")
   public float[] method5110(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
      return this.method5120(arg0);
   }

   @deob.ObfuscatedName("ct.l([BI)[I")
   private int[] method5116(byte[] arg0) throws IOException {
      BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
      if (var2.getType() != 10 && var2.getType() != 0) {
         return var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
      } else {
         Object var3 = null;
         int[] var4 = var2.getRaster().getPixels(0, 0, var2.getWidth(), var2.getHeight(), (int[])var3);
         int[] var5 = new int[var2.getWidth() * var2.getHeight()];
         if (var2.getType() == 10) {
            for(int var6 = 0; var6 < var5.length; ++var6) {
               var5[var6] = (var4[var6] << 8) + (var4[var6] << 16) + var4[var6] + -16777216;
            }
         } else {
            for(int var7 = 0; var7 < var5.length; ++var7) {
               int var8 = var7 * 2;
               var5[var7] = (var4[var8 + 1] << 24) + var4[var8] + (var4[var8] << 16) + (var4[var8] << 8);
            }
         }

         return var5;
      }
   }
}
