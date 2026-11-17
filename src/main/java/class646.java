import java.awt.Component;
import java.util.Arrays;

@deob.ObfuscatedName("mj")
public class class646 {
   @deob.ObfuscatedName("mj.n")
   private static boolean field5843 = false;
   @deob.ObfuscatedName("mj.x")
   private boolean field5850 = false;
   @deob.ObfuscatedName("mj.l")
   private int field5852 = 32;
   @deob.ObfuscatedName("mj.u")
   private long field5853 = class431.method2169();
   @deob.ObfuscatedName("mj.e")
   private long field5857 = 0L;
   @deob.ObfuscatedName("mj.z")
   private int field5858 = 0;
   @deob.ObfuscatedName("mj.m")
   private int field5859 = 0;
   @deob.ObfuscatedName("mj.i")
   private int field5860 = 0;
   @deob.ObfuscatedName("mj.t")
   private long field5851 = 0L;
   @deob.ObfuscatedName("mj.c")
   private boolean field5862 = true;
   @deob.ObfuscatedName("mj.ai")
   private int field5868 = 0;
   @deob.ObfuscatedName("mj.ap")
   private class89[] field5842 = new class89[8];
   @deob.ObfuscatedName("mj.av")
   private class89[] field5869 = new class89[8];
   @deob.ObfuscatedName("mj.g")
   int field5855;
   @deob.ObfuscatedName("mj.h")
   private int field5856;
   @deob.ObfuscatedName("mj.v")
   int field5870;
   @deob.ObfuscatedName("mj.s")
   private class89 field5864;
   @deob.ObfuscatedName("mj.a")
   protected int[] field5849;

   @deob.ObfuscatedName("mj.n(IZI)V")
   public static final void method9292(int arg0, boolean arg1, int arg2) {
      if (arg0 >= 8000 && arg0 <= 48000) {
         Statics.field5854 = arg0;
         Statics.field5844 = arg1;
         Statics.field5845 = arg2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("mj.k(Ljava/awt/Component;II)Lmj;")
   public static final class646 method9319(Component arg0, int arg1, int arg2) {
      if (Statics.field5854 == 0) {
         throw new IllegalStateException();
      } else if (arg1 >= 0 && arg1 < 2) {
         int var3 = arg2;
         if (arg2 < 256) {
            var3 = 256;
         }

         if (!field5843) {
            try {
               class53 var4 = new class53();
               var4.field5849 = new int[256 * (Statics.field5844 ? 2 : 1)];
               var4.field5855 = var3;
               var4.method834(arg0);
               var4.field5870 = (var3 & -1024) + 1024;
               if (var4.field5870 > 16384) {
                  var4.field5870 = 16384;
               }

               var4.method835(var4.field5870);
               if (Statics.field5845 > 0 && Statics.field5846 == null) {
                  Statics.field5846 = new class955();
                  Thread var5 = new Thread(Statics.field5846);
                  var5.setDaemon(true);
                  var5.start();
                  var5.setPriority(Statics.field5845);
               }

               if (Statics.field5846 != null) {
                  if (Statics.field5846.field5812[arg1] != null) {
                     throw new IllegalArgumentException();
                  }

                  Statics.field5846.field5812[arg1] = var4;
               }

               return var4;
            } catch (Throwable var7) {
            }
         }

         return new class646();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("mj.d(Ladf;)V")
   public final synchronized void method9297(class89 arg0) {
      this.field5864 = arg0;
   }

   @deob.ObfuscatedName("mj.b()V")
   public final synchronized void method9294() {
      if (!this.field5850) {
         long var1 = class431.method2169();

         try {
            if (var1 > this.field5853 + 6000L) {
               this.field5853 = var1 - 6000L;
            }

            while(var1 > this.field5853 + 5000L) {
               this.method9298(256);
               this.field5853 += (long)(256000 / Statics.field5854);
               var1 = class431.method2169();
            }
         } catch (Exception var8) {
            this.field5853 = var1;
         }

         if (this.field5849 != null) {
            try {
               if (this.field5857 != 0L) {
                  if (var1 < this.field5857) {
                     return;
                  }

                  this.method835(this.field5870);
                  this.field5857 = 0L;
                  this.field5862 = true;
               }

               int var4 = this.method833();
               if (this.field5860 - var4 > this.field5858) {
                  this.field5858 = this.field5860 - var4;
               }

               int var5 = this.field5856 + this.field5855;
               if (var5 + 256 > 16384) {
                  var5 = 16128;
               }

               if (var5 + 256 > this.field5870) {
                  this.field5870 += 1024;
                  if (this.field5870 > 16384) {
                     this.field5870 = 16384;
                  }

                  this.method838(false);
                  this.method835(this.field5870);
                  var4 = 0;
                  this.field5862 = true;
                  if (var5 + 256 > this.field5870) {
                     var5 = this.field5870 - 256;
                     this.field5856 = var5 - this.field5855;
                  }
               }

               while(var4 < var5) {
                  this.method9299(this.field5849, 256);
                  this.method837();
                  var4 += 256;
               }

               if (var1 > this.field5851) {
                  if (!this.field5862) {
                     if (this.field5858 == 0 && this.field5859 == 0) {
                        this.method838(false);
                        this.field5857 = var1 + 2000L;
                        return;
                     }

                     this.field5856 = Math.min(this.field5859, this.field5858);
                     this.field5859 = this.field5858;
                  } else {
                     this.field5862 = false;
                  }

                  this.field5858 = 0;
                  this.field5851 = var1 + 2000L;
               }

               this.field5860 = var4;
            } catch (Exception var7) {
               this.method838(false);
               this.field5857 = var1 + 2000L;
            }

         }
      }
   }

   @deob.ObfuscatedName("mj.r()V")
   public final synchronized void method9295() {
      this.field5862 = true;

      try {
         this.method843();
      } catch (Exception var2) {
         this.method838(false);
         this.field5857 = class431.method2169() + 2000L;
      }

   }

   @deob.ObfuscatedName("mj.p()V")
   public final synchronized void method9296() {
      this.method9310(false);
      this.method838(true);
      this.field5849 = null;
      this.field5850 = true;
   }

   @deob.ObfuscatedName("mj.o(Z)V")
   private final synchronized void method9310(boolean arg0) {
      if (Statics.field5846 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (arg0 || Statics.field5846.field5812[var3] == this) {
               Statics.field5846.field5812[var3] = null;
            }

            if (Statics.field5846.field5812[var3] != null) {
               var2 = false;
            }
         }

         if (var2) {
            Statics.field5846.field5811 = true;

            while(Statics.field5846.field5810) {
               Statics.method14813(50L);
            }

            Statics.field5846 = null;
         }
      }

   }

   @deob.ObfuscatedName("mj.a()V")
   protected void method9324() {
      this.method9310(true);
      this.field5849 = null;
      this.field5850 = true;
      field5843 = true;
   }

   @deob.ObfuscatedName("mj.x(I)V")
   private final void method9298(int arg0) {
      this.field5868 -= arg0;
      if (this.field5868 < 0) {
         this.field5868 = 0;
      }

      if (this.field5864 != null) {
         this.field5864.method1254(arg0);
      }

   }

   @deob.ObfuscatedName("mj.s([II)V")
   private final void method9299(int[] arg0, int arg1) {
      int var3 = arg1;
      if (Statics.field5844) {
         var3 = arg1 << 1;
      }

      Arrays.fill(arg0, 0, var3, 0);
      this.field5868 -= arg1;
      if (this.field5864 != null && this.field5868 <= 0) {
         this.field5868 += Statics.field5854 >> 4;
         method9300(this.field5864);
         this.method9301(this.field5864, this.field5864.method1270());
         int var4 = 0;
         int var5 = 255;
         int var6 = 7;

         label105:
         while(var5 != 0) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  class89 var10 = null;
                  class89 var11 = this.field5842[var7];

                  label99:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label99;
                        }

                        class92 var12 = var11.field675;
                        if (var12 != null && var12.field699 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field673;
                        } else {
                           var11.field676 = true;
                           int var13 = var11.method1246();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field699 += var13;
                           }

                           if (var4 >= this.field5852) {
                              break label105;
                           }

                           class89 var14 = var11.method1257();
                           if (var14 != null) {
                              int var15 = var11.field674;

                              while(var14 != null) {
                                 this.method9301(var14, var15 * var14.method1270() >> 8);
                                 var14 = var11.method1245();
                              }
                           }

                           class89 var16 = var11.field673;
                           var11.field673 = null;
                           if (var10 == null) {
                              this.field5842[var7] = var16;
                           } else {
                              var10.field673 = var16;
                           }

                           if (var16 == null) {
                              this.field5869[var7] = var10;
                           }

                           var11 = var16;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }

            --var6;
         }

         for(int var17 = 0; var17 < 8; ++var17) {
            class89 var18 = this.field5842[var17];
            class89[] var19 = this.field5842;
            this.field5869[var17] = null;
            var19[var17] = null;

            while(var18 != null) {
               class89 var21 = var18.field673;
               var18.field673 = null;
               var18 = var21;
            }
         }
      }

      if (this.field5868 < 0) {
         this.field5868 = 0;
      }

      if (this.field5864 != null) {
         this.field5864.method1244(arg0, 0, arg1);
      }

      this.field5853 = class431.method2169();
   }

   @deob.ObfuscatedName("mj.l(Ladf;)V")
   private static final void method9300(class89 arg0) {
      arg0.field676 = false;
      if (arg0.field675 != null) {
         arg0.field675.field699 = 0;
      }

      for(class89 var1 = arg0.method1257(); var1 != null; var1 = arg0.method1245()) {
         method9300(var1);
      }

   }

   @deob.ObfuscatedName("mj.u(Ladf;I)V")
   private final void method9301(class89 arg0, int arg1) {
      int var3 = arg1 >> 5;
      class89 var4 = this.field5869[var3];
      if (var4 == null) {
         this.field5842[var3] = arg0;
      } else {
         var4.field673 = arg0;
      }

      this.field5869[var3] = arg0;
      arg0.field674 = arg1;
   }

   @deob.ObfuscatedName("mj.v(Ljava/awt/Component;)V")
   protected void method834(Component arg0) throws Exception {
   }

   @deob.ObfuscatedName("mj.g(I)V")
   protected void method835(int arg0) throws Exception {
   }

   @deob.ObfuscatedName("mj.h()I")
   protected int method833() throws Exception {
      return this.field5870;
   }

   @deob.ObfuscatedName("mj.e()V")
   protected void method837() throws Exception {
   }

   @deob.ObfuscatedName("mj.z(Z)V")
   protected void method838(boolean arg0) {
   }

   @deob.ObfuscatedName("mj.m()V")
   protected void method843() throws Exception {
   }
}
