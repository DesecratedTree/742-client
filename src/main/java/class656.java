@deob.ObfuscatedName("mt")
public class class656 {
   @deob.ObfuscatedName("mt.a")
   private int field5971 = -1;
   @deob.ObfuscatedName("mt.e")
   private boolean field5979 = true;
   @deob.ObfuscatedName("mt.x")
   private final int field5972;
   @deob.ObfuscatedName("mt.s")
   private final int field5984;
   @deob.ObfuscatedName("mt.l")
   private final int field5974;
   @deob.ObfuscatedName("mt.k")
   private final int field5965;
   @deob.ObfuscatedName("mt.r")
   private class638[] field5969;
   @deob.ObfuscatedName("mt.v")
   private class714 field5976;
   @deob.ObfuscatedName("mt.p")
   private class638[] field5966;
   @deob.ObfuscatedName("mt.b")
   private class638 field5967;
   @deob.ObfuscatedName("mt.i")
   private int field5980;
   @deob.ObfuscatedName("mt.g")
   private int field5968;
   @deob.ObfuscatedName("mt.o")
   private int field5970;
   @deob.ObfuscatedName("mt.h")
   private int field5978;
   @deob.ObfuscatedName("mt.y")
   private int field5981;
   @deob.ObfuscatedName("mt.d")
   private int field5983;
   @deob.ObfuscatedName("mt.j")
   private int field5986;
   @deob.ObfuscatedName("mt.f")
   private int field5987;
   @deob.ObfuscatedName("mt.u")
   private class383 field5977;
   @deob.ObfuscatedName("mt.q")
   private class656 field5975;
   @deob.ObfuscatedName("mt.t")
   private class745 field5964;
   @deob.ObfuscatedName("mt.w")
   private boolean field5973;
   @deob.ObfuscatedName("mt.c")
   private byte[] field5982;

   public class656(int arg0, class638[] arg1, int arg2, int arg3, int arg4, int arg5, class714 arg6, int arg7) {
      this.field5972 = arg3;
      this.field5984 = arg4;
      this.field5974 = arg5;
      this.field5965 = arg0;
      this.field5969 = arg1;
      this.field5976 = arg6;
      if (arg1 != null) {
         this.field5966 = new class638[arg1.length];
         this.field5967 = arg2 >= 0 ? arg1[arg2] : null;
      } else {
         this.field5966 = null;
         this.field5967 = null;
      }

      this.field5980 = arg7;
   }

   @deob.ObfuscatedName("dl.n(Llc;Lma;I)V")
   public static void method5480(class612 arg0, class637 arg1) {
      Statics.field4152 = arg0;
      Statics.field3640 = arg1;
   }

   @deob.ObfuscatedName("fs.k(I)V")
   public static void method6506() {
      class638.method9190();
   }

   @deob.ObfuscatedName("mt.d(IIB)V")
   public void method9473(int arg0, int arg1) {
      if (!this.field5973) {
      }

      this.field5981 = (arg1 - this.field5987) * arg0 / 255 + this.field5987;
   }

   @deob.ObfuscatedName("mt.b(Lmt;B)V")
   public void method9484(class656 arg0) {
      if (this.field5973) {
         this.field5987 = this.field5981;
      } else if (arg0 != null && arg0.field5973) {
         this.field5987 = 255 - arg0.field5981;
      } else {
         this.field5987 = 0;
      }

      this.field5973 = true;
      this.field5975 = arg0;
      this.field5981 = 0;
   }

   @deob.ObfuscatedName("mt.r(I)V")
   public void method9485() {
      this.field5973 = false;
      this.field5975 = null;
      this.field5981 = 0;
   }

   @deob.ObfuscatedName("mt.p(B)Z")
   public boolean method9467() {
      return this.field5973;
   }

   @deob.ObfuscatedName("mt.o(B)Lmt;")
   public class656 method9468() {
      return this.field5975;
   }

   @deob.ObfuscatedName("mt.a(Lra;IIB)Z")
   public boolean method9469(class772 arg0, int arg1, int arg2) {
      if (this.field5971 != arg1) {
         this.field5971 = arg1;
         int var4 = class887.method14787(arg1);
         if (var4 > 512) {
            var4 = 512;
         }

         if (var4 <= 0) {
            var4 = 1;
         }

         if (this.field5983 != var4) {
            this.field5983 = var4;
            this.field5977 = null;
         }

         if (this.field5969 != null) {
            this.field5970 = 0;
            int[] var5 = new int[this.field5969.length];

            for(int var6 = 0; var6 < this.field5969.length; ++var6) {
               class638 var7 = this.field5969[var6];
               if (var7.method9199(this.field5972, this.field5984, this.field5974, this.field5971)) {
                  var5[this.field5970] = var7.field5779;
                  this.field5966[++this.field5970 - 1] = var7;
               }
            }

            class781.method6516(var5, this.field5966, 0, this.field5970 - 1);
         }

         this.field5979 = true;
      }

      boolean var8 = false;
      if (this.field5979) {
         this.field5979 = false;

         for(int var9 = this.field5970 - 1; var9 >= 0; --var9) {
            boolean var10 = this.field5966[var9].method9191(arg0, this.field5967);
            this.field5979 |= !var10;
            var8 |= var10;
         }
      }

      if (arg2 != 0 && arg0.method7668()) {
         if (this.field5964 == null && this.field5980 >= 0) {
            this.method9476(arg0);
         }
      } else {
         this.field5964 = null;
      }

      if (this.field5975 != null && this.field5975 != this) {
         this.field5975.method9485();
         var8 |= this.field5975.method9469(arg0, arg1, arg2);
      }

      return var8;
   }

   @deob.ObfuscatedName("mt.x(Lra;I)V")
   private void method9476(class772 arg0) {
      try {
         boolean var2 = Statics.field4152.method8774(this.field5980);
         if (var2) {
            arg0.method7588(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            class396 var3 = class396.method5419(Statics.field4152, this.field5980, 0);
            this.field5964 = arg0.method7528(var3, 1099776, 0, 255, 1);
            byte[] var4 = this.field5964.method6948();
            if (var4 == null) {
               this.field5982 = null;
            } else {
               this.field5982 = new byte[var4.length];
               System.arraycopy(var4, 0, this.field5982, 0, var4.length);
            }
         }
      } catch (Exception var6) {
      }

   }

   @deob.ObfuscatedName("mt.s(Lra;IIIIIIIIII)V")
   public void method9471(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      this.method9472(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false);
   }

   @deob.ObfuscatedName("mt.l(Lra;IIIIIIIIIZZS)V")
   public void method9472(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11) {
      int var13 = 0;
      if (this.field5973) {
         var13 = this.field5981;
      }

      if (this.field5975 != null) {
         class656 var14 = this;
         class656 var15 = this.field5975;
         if (this.hashCode() > var15.hashCode()) {
            var14 = this.field5975;
            var15 = this;
            var13 = 255 - var13;
         }

         var14.method9470(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var13);
         var15.method9470(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - var13);
      } else {
         this.method9470(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var13);
      }

   }

   @deob.ObfuscatedName("mt.u(Lra;IIIIIIIIIZZII)V")
   private void method9470(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12) {
      int var14 = 255 - arg12;
      arg0.method11513();
      if (this.field5964 == null) {
         arg0.method2522(2, 0);
         arg7 = arg1 + arg7 & 16383;
         if (this.field5965 != -1 && this.field5983 != 0) {
            class360 var15 = Statics.field3640.method5112(this.field5965);
            if (this.field5977 == null && Statics.field3640.method5108(this.field5965, class725.field6684 == var15.field2323 ? class742.field6808 : class742.field6809, 0.7F, this.field5983, this.field5983, false)) {
               int[] var16 = class725.field6684 == var15.field2323 ? Statics.field3640.method5115(this.field5965, 0.7F, this.field5983, this.field5983, false) : Statics.field3640.method5146(this.field5965, 0.7F, this.field5983, this.field5983, false);
               this.field5968 = var16[0];
               this.field5978 = var16[var16.length - 1];
               this.field5977 = arg0.method11534(var16, 0, var15.field2315, var15.field2315, var15.field2315);
            }

            int var17 = var14 == 255 ? (class725.field6684 == var15.field2323 ? 1 : 0) : 1;
            if (var17 == 1 && arg10) {
               arg0.method7513(arg2, arg3, arg4, arg5, arg9, 0);
            }

            if (this.field5977 != null) {
               int var18 = arg5 * arg6 / -4096;

               int var19;
               for(var19 = arg5 * arg7 / 4096 + (arg4 - arg5) / 2; var19 > arg5; var19 -= arg5) {
               }

               while(var19 < 0) {
                  var19 += arg5;
               }

               if (class714.field6628 != this.field5976) {
                  while(var18 > arg5) {
                     var18 -= arg5;
                  }

                  while(var18 < 0) {
                     var18 += arg5;
                  }

                  for(int var21 = var19 - arg5; var21 < arg4; var21 += arg5) {
                     for(int var22 = var18 - arg5; var22 < arg5; var22 += arg5) {
                        this.field5977.method5263(arg2 + var21, arg3 + var22, arg5, arg5, 0, var14 << 24 | 16777215, var17);
                     }
                  }
               } else {
                  for(int var20 = var19 - arg5; var20 < arg4; var20 += arg5) {
                     this.field5977.method5263(arg2 + var20, arg3 + var18, arg5, arg5, 0, var14 << 24 | 16777215, var17);
                  }

                  if ((this.field5968 & -16777216) != 0) {
                     arg0.method11524(0, 0, arg4, arg3 + var18 + 1, this.field5968);
                  }

                  if ((this.field5978 & -16777216) != 0) {
                     arg0.method11524(0, arg3 + var18 + arg5, arg4, arg5 - (arg3 + var18 + arg5), this.field5978);
                  }
               }
            }
         } else {
            arg0.method7513(arg2, arg3, arg4, arg5, var14 << 24 | arg9, 1);
         }
      } else if (arg11) {
         class597 var23 = arg0.method7498();
         class597 var24 = arg0.method7498();
         var23.field5413[2] = var23.field5413[3];
         var23.field5413[6] = var23.field5413[7];
         var23.field5413[10] = var23.field5413[11];
         var23.field5413[14] = var23.field5413[15];
         arg0.method7545(var23);
         this.method9474(arg0, arg6, arg7, arg8, arg12);
         arg0.method7545(var24);
      } else {
         if (arg10) {
            arg0.method2522(3, arg9);
         }

         this.method9474(arg0, arg6, arg7, arg8, arg12);
      }

      for(int var25 = this.field5970 - 1; var25 >= 0; --var25) {
         this.field5966[var25].method9203(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.field5972, this.field5984, this.field5974, var14);
      }

      arg0.method2522(2, 0);
      arg0.method11514();
   }

   @deob.ObfuscatedName("mt.v(Lra;IIIII)V")
   private void method9474(class772 arg0, int arg1, int arg2, int arg3, int arg4) {
      class583 var6 = arg0.method7544();
      class583 var7 = new class583();
      var7.method8071(0.0F, 0.0F, 0.0F);
      var7.method8126(0.0F, -1.0F, 0.0F, class603.method8577(-arg2 & 16383));
      var7.method8126(-1.0F, 0.0F, 0.0F, class603.method8577(-arg1 & 16383));
      var7.method8126(0.0F, 0.0F, -1.0F, class603.method8577(-arg3 & 16383));
      arg0.method7778(var7);
      class583 var8 = new class583();
      if (this.field5986 != arg4) {
         this.field5964.method6950((byte)arg4, this.field5982);
         this.field5986 = arg4;
      }

      this.field5964.method7001(var8, (class394)null, 0);
      arg0.method7778(var6);
   }
}
