import java.nio.ByteBuffer;

@deob.ObfuscatedName("he")
public class class498 {
   @deob.ObfuscatedName("he.o")
   public boolean field4013 = true;
   @deob.ObfuscatedName("he.a")
   private int field4007 = -1;
   @deob.ObfuscatedName("he.d")
   private final class979 field4017;
   @deob.ObfuscatedName("he.b")
   private final class519 field4010;
   @deob.ObfuscatedName("he.r")
   private final int field4011;
   @deob.ObfuscatedName("he.p")
   private final int field4009;
   @deob.ObfuscatedName("he.v")
   private int field4019;
   @deob.ObfuscatedName("he.u")
   private int field4014;
   @deob.ObfuscatedName("he.s")
   private class534 field4016;
   @deob.ObfuscatedName("he.x")
   public final int field4015;
   @deob.ObfuscatedName("he.l")
   private class511 field4012;
   @deob.ObfuscatedName("he.h")
   private byte[] field4021;
   @deob.ObfuscatedName("he.g")
   private int[] field4020;

   public class498(class979 arg0, class519 arg1, class970 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.field4017 = arg0;
      this.field4010 = arg1;
      this.field4011 = arg6;
      this.field4009 = arg7;
      int var9 = 1 << arg5;
      int var10 = 0;
      int var11 = arg3 << arg5;
      int var12 = arg4 << arg5;

      for(int var13 = 0; var13 < var9; ++var13) {
         int var14 = arg2.field9463 * (var12 + var13) + var11;

         for(int var15 = 0; var15 < var9; ++var15) {
            short[] var16 = arg2.field9674[var14++];
            if (var16 != null) {
               var10 += var16.length;
            }
         }
      }

      if (var10 > 0) {
         this.field4019 = Integer.MIN_VALUE;
         this.field4014 = Integer.MAX_VALUE;
         this.field4016 = this.field4017.method2569(false);
         this.field4016.method695(var10);
         ByteBuffer var17 = this.field4017.field9975;
         var17.clear();

         for(int var18 = 0; var18 < var9; ++var18) {
            int var19 = arg2.field9463 * (var12 + var18) + var11;

            for(int var20 = 0; var20 < var9; ++var20) {
               short[] var21 = arg2.field9674[var19++];
               if (var21 != null) {
                  for(int var22 = 0; var22 < var21.length; ++var22) {
                     int var23 = var21[var22] & 65535;
                     if (var23 < this.field4014) {
                        this.field4014 = var23;
                     }

                     if (var23 > this.field4019) {
                        this.field4019 = var23;
                     }

                     var17.putShort((short)var23);
                  }
               }
            }
         }

         this.field4016.method700(0, var17.position(), this.field4017.field9976);
         this.field4015 = var10 / 3;
      } else {
         this.field4015 = 0;
         this.field4012 = null;
      }

   }

   @deob.ObfuscatedName("he.n(Lfh;)V")
   public void method7101(class447 arg0) {
      this.method7103(arg0, this.field4016, 0, this.field4015);
   }

   @deob.ObfuscatedName("he.k(Lfh;Lin;II)V")
   public void method7103(class447 arg0, class534 arg1, int arg2, int arg3) {
      if (arg3 > 0) {
         this.method7104();
         this.field4017.method2624(arg1);
         arg0.field3687 = this.field4012;
         arg0.field3702 = this.field4014;
         arg0.field3703 = this.field4019 - this.field4014 + 1;
         arg0.field3686 = arg2;
         arg0.field3705 = arg3;
         arg0.method231(false);
      }

   }

   @deob.ObfuscatedName("he.d()V")
   private void method7104() {
      if (this.field4013) {
         this.field4013 = false;
         byte[] var1 = this.field4010.field4122;
         int var2 = 0;
         int var3 = this.field4010.field4120;
         int var4 = this.field4010.field4120 * this.field4009 + this.field4011;

         for(int var5 = -128; var5 < 0; ++var5) {
            var2 = (var2 << 8) - var2;

            for(int var6 = -128; var6 < 0; ++var6) {
               if (var1[var4++] != 0) {
                  ++var2;
               }
            }

            var4 += var3 - 128;
         }

         if (this.field4012 != null && this.field4007 == var2) {
            this.field4013 = false;
         } else {
            this.field4007 = var2;
            int var7 = 0;
            int var8 = this.field4009 * var3 + this.field4011;
            if (this.field4017.method2735(class372.field2735, class405.field3052)) {
               if (this.field4021 == null) {
                  this.field4021 = new byte[16384];
               }

               byte[] var9 = this.field4021;

               for(int var10 = -128; var10 < 0; ++var10) {
                  for(int var11 = -128; var11 < 0; ++var11) {
                     if (var1[var8] != 0) {
                        var9[var7++] = 68;
                     } else {
                        int var12 = 0;
                        if (var1[var8 - 1] != 0) {
                           ++var12;
                        }

                        if (var1[var8 + 1] != 0) {
                           ++var12;
                        }

                        if (var1[var8 - var3] != 0) {
                           ++var12;
                        }

                        if (var1[var3 + var8] != 0) {
                           ++var12;
                        }

                        var9[var7++] = (byte)(var12 * 17);
                     }

                     ++var8;
                  }

                  var8 += this.field4010.field4120 - 128;
               }

               if (this.field4012 == null) {
                  this.field4012 = this.field4017.method16348(class372.field2735, 128, 128, false, this.field4021);
                  this.field4012.method497(false, false);
               } else {
                  this.field4012.method499(0, 0, 128, 128, this.field4021, class372.field2735, 0, 128);
               }
            } else {
               if (this.field4020 == null) {
                  this.field4020 = new int[16384];
               }

               int[] var13 = this.field4020;

               for(int var14 = -128; var14 < 0; ++var14) {
                  for(int var15 = -128; var15 < 0; ++var15) {
                     if (var1[var8] != 0) {
                        var13[var7++] = 1140850688;
                     } else {
                        int var16 = 0;
                        if (var1[var8 - 1] != 0) {
                           ++var16;
                        }

                        if (var1[var8 + 1] != 0) {
                           ++var16;
                        }

                        if (var1[var8 - var3] != 0) {
                           ++var16;
                        }

                        if (var1[var3 + var8] != 0) {
                           ++var16;
                        }

                        var13[var7++] = var16 * 17 << 24;
                     }

                     ++var8;
                  }

                  var8 += this.field4010.field4120 - 128;
               }

               if (this.field4012 == null) {
                  this.field4012 = this.field4017.method16347(128, 128, false, this.field4020);
                  this.field4012.method497(false, false);
               } else {
                  this.field4012.method498(0, 0, 128, 128, this.field4020, 0, 128);
               }
            }

         }
      }
   }
}
