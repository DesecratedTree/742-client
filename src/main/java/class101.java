import java.nio.ByteBuffer;

@deob.ObfuscatedName("adr")
public class class101 extends class674 {
   @deob.ObfuscatedName("adr.s")
   public int field782 = 0;
   @deob.ObfuscatedName("adr.u")
   public int field783 = 0;
   @deob.ObfuscatedName("adr.v")
   public int field776 = 0;
   @deob.ObfuscatedName("adr.g")
   public int field786 = 0;
   @deob.ObfuscatedName("adr.r")
   private final class970 field784;
   @deob.ObfuscatedName("adr.b")
   private final class979 field777;
   @deob.ObfuscatedName("adr.p")
   public final int field778;
   @deob.ObfuscatedName("adr.o")
   public final float field779;
   @deob.ObfuscatedName("adr.a")
   public class402 field787;
   @deob.ObfuscatedName("adr.l")
   private int[] field780;
   @deob.ObfuscatedName("adr.h")
   private long field785;
   @deob.ObfuscatedName("adr.x")
   public class508 field781;

   public class101(class970 arg0, int arg1, int arg2, class402 arg3) {
      this.field784 = arg0;
      this.field777 = this.field784.field9682;
      this.field778 = arg1;
      this.field779 = (float)arg2;
      this.field787 = arg3;
      this.field780 = new int[this.field784.field9463 * this.field784.field9461];
      byte var5 = 10;
      if (arg1 >= 0) {
         class360 var6 = this.field777.field7118.method5112(arg1);
         if (var6.field2324 > 0) {
            var5 = var6.field2324;
         }
      }

      this.field777.method16312(var5);
      this.field777.method16312(3);
   }

   @deob.ObfuscatedName("adr.n(I)V")
   public void method1347(int arg0) {
      this.field785 = this.field777.field9978.allocateMemory((long)(arg0 * 4));

      for(int var2 = 3; var2 < arg0 * 4; var2 += 4) {
         this.field777.field9978.putByte((long)var2 + this.field785, (byte)0);
      }

   }

   @deob.ObfuscatedName("adr.k(I)V")
   public void method1348(int arg0) {
      this.field777.field9978.putByte((long)(arg0 * 4) + this.field785 + 3L, (byte)-1);
   }

   @deob.ObfuscatedName("adr.d(III)V")
   public void method1349(int arg0, int arg1, int arg2) {
      this.field780[this.field784.field9463 * arg1 + arg0] |= 1 << arg2;
      ++this.field782;
   }

   @deob.ObfuscatedName("adr.b(IIIF)V")
   public void method1362(int arg0, int arg1, int arg2, float arg3) {
      if (this.field778 != -1) {
         class360 var5 = this.field777.field7118.method5112(this.field778);
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

      if (this.field777.field10108 == 0) {
         this.field777.field9978.putByte((long)(arg0 * 4) + this.field785 + 0L, (byte)(arg1 >> 16));
         this.field777.field9978.putByte((long)(arg0 * 4) + this.field785 + 1L, (byte)(arg1 >> 8));
         this.field777.field9978.putByte((long)(arg0 * 4) + this.field785 + 2L, (byte)arg1);
      } else {
         this.field777.field9978.putByte((long)(arg0 * 4) + this.field785 + 0L, (byte)arg1);
         this.field777.field9978.putByte((long)(arg0 * 4) + this.field785 + 1L, (byte)(arg1 >> 8));
         this.field777.field9978.putByte((long)(arg0 * 4) + this.field785 + 2L, (byte)(arg1 >> 16));
      }

   }

   @deob.ObfuscatedName("adr.r(I)V")
   public void method1351(int arg0) {
      this.field781 = this.field777.method2570(false);
      this.field781.method728(arg0 * 4, 4);
      this.field781.method700(0, arg0 * 4, this.field785);
      this.field777.field9978.freeMemory(this.field785);
   }

   @deob.ObfuscatedName("adr.p([II)V")
   public void method1352(int[] arg0, int arg1) {
      this.field783 = 0;
      this.field776 = 32767;
      this.field786 = -32768;
      ByteBuffer var3 = this.field777.field9975;

      label49:
      for(int var4 = 0; var4 < arg1; ++var4) {
         int var5 = arg0[var4];
         short[] var6 = this.field784.field9674[var5];
         int var7 = this.field780[var5];
         if (var7 != 0 && var6 != null) {
            int var8 = 0;
            int var9 = 0;

            while(true) {
               while(true) {
                  if (var9 >= var6.length) {
                     continue label49;
                  }

                  if ((var7 & 1 << var8++) != 0) {
                     for(int var10 = 0; var10 < 3; ++var10) {
                        int var11 = var6[var9++] & 65535;
                        if (var11 > this.field786) {
                           this.field786 = var11;
                        }

                        if (var11 < this.field776) {
                           this.field776 = var11;
                        }

                        var3.putShort((short)var11);
                     }

                     this.field783 += 3;
                  } else {
                     var9 += 3;
                  }
               }
            }
         }
      }

   }
}
