@deob.ObfuscatedName("dc")
public class class388 {
   private class388() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("dc.n(Lra;[II)V")
   public static void method5354(class772 arg0, int[] arg1, int arg2) {
      method5350(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @deob.ObfuscatedName("dc.k(Lra;[II[I[I)V")
   public static void method5363(class772 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method5350(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("dc.d(Lra;[IIII[I[I)V")
   private static void method5350(class772 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method7511(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method5348();
         method5352(arg1, arg2, arg3);
         method5353(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method5351(var7[3])) {
                  return;
               }

               var8 = Statics.field2864;
               var9 = Statics.field2866;
               var10 = Statics.field2869;
               if (arg5 == null) {
                  break;
               }

               int var11 = var10 - var7[1];
               if (var8 < arg5[var11] + var7[0]) {
                  var8 = arg5[var11] + var7[0];
               }

               if (var9 > arg5[var11] + arg6[var11] + var7[0]) {
                  var9 = arg5[var11] + arg6[var11] + var7[0];
               }
            } while(var9 - var8 <= 0);

            arg0.method7514(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @deob.ObfuscatedName("dc.b()V")
   private static void method5348() {
      Statics.field2867 = 0;
   }

   @deob.ObfuscatedName("dc.r([III)V")
   private static void method5352(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + Statics.field2867;
      if (Statics.field2863 == null || Statics.field2863.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < Statics.field2867; ++var5) {
            var4[var5] = Statics.field2863[var5];
         }

         Statics.field2863 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            Statics.field2863[Statics.field2867++] = arg0[var7];
            Statics.field2863[Statics.field2867++] = var9;
            Statics.field2863[Statics.field2867++] = arg0[var8];
            Statics.field2863[Statics.field2867++] = var10;
         } else if (var10 < var9) {
            Statics.field2863[Statics.field2867++] = arg0[var8];
            Statics.field2863[Statics.field2867++] = var10;
            Statics.field2863[Statics.field2867++] = arg0[var7];
            Statics.field2863[Statics.field2867++] = var9;
         }

         var7 = var8;
      }

   }

   @deob.ObfuscatedName("dc.p(I)V")
   private static void method5353(int arg0) {
      if (Statics.field2867 < 0) {
         Statics.field2870 = 0;
         Statics.field2865 = 0;
         Statics.field2868 = 0;
         Statics.field2869 = 2147483646;
      } else {
         method5355(0, Statics.field2867);
         int var1 = Statics.field2863[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < Statics.field2867; var3 += 4) {
            int var4 = Statics.field2863[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = Statics.field2863[var3];
            int var6 = Statics.field2863[var3 + 2];
            int var7 = Statics.field2863[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            Statics.field2863[var3] = (var1 - var4) * var8 + var9;
            Statics.field2863[var3 + 2] = var8;
         }

         Statics.field2868 = var2;
         Statics.field2865 = var3;
         Statics.field2870 = var3;
         Statics.field2869 = var1 - 1;
      }
   }

   @deob.ObfuscatedName("dc.o(I)Z")
   private static boolean method5351(int arg0) {
      int var1 = Statics.field2865;
      int var2 = Statics.field2870;
      int var3 = Statics.field2869;

      while(var2 >= var1) {
         ++var3;
         Statics.field2869 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = Statics.field2868;

         while(var1 < Statics.field2867) {
            int var5 = Statics.field2863[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = Statics.field2863[var1];
            int var7 = Statics.field2863[var1 + 2];
            int var8 = Statics.field2863[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            Statics.field2863[var1] = var10;
            Statics.field2863[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = Statics.field2863[var11 + 3];
            if (var3 >= var12) {
               Statics.field2863[var11] = Statics.field2863[var4];
               Statics.field2863[var11 + 1] = Statics.field2863[var4 + 1];
               Statics.field2863[var11 + 2] = Statics.field2863[var4 + 2];
               Statics.field2863[var11 + 3] = Statics.field2863[var4 + 3];
               var4 += 4;
            }
         }

         if (Statics.field2867 == var4) {
            Statics.field2867 = 0;
            return false;
         }

         method5365(var4, var1);
         Statics.field2868 = var4;
         Statics.field2865 = var1;
         var2 = var4;
      }

      Statics.field2864 = Statics.field2863[var2] >> 16;
      Statics.field2866 = Statics.field2863[var2 + 4] >> 16;
      Statics.field2863[var2] += Statics.field2863[var2 + 2];
      Statics.field2863[var2 + 4] += Statics.field2863[var2 + 6];
      var2 += 8;
      Statics.field2870 = var2;
      return true;
   }

   @deob.ObfuscatedName("dc.a(II)V")
   private static void method5355(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = Statics.field2863[arg0];
         int var4 = Statics.field2863[arg0 + 1];
         int var5 = Statics.field2863[arg0 + 2];
         int var6 = Statics.field2863[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = Statics.field2863[var7 + 1];
            if (var8 < var4) {
               Statics.field2863[var2] = Statics.field2863[var7];
               Statics.field2863[var2 + 1] = var8;
               Statics.field2863[var2 + 2] = Statics.field2863[var7 + 2];
               Statics.field2863[var2 + 3] = Statics.field2863[var7 + 3];
               var2 += 4;
               Statics.field2863[var7] = Statics.field2863[var2];
               Statics.field2863[var7 + 1] = Statics.field2863[var2 + 1];
               Statics.field2863[var7 + 2] = Statics.field2863[var2 + 2];
               Statics.field2863[var7 + 3] = Statics.field2863[var2 + 3];
            }
         }

         Statics.field2863[var2] = var3;
         Statics.field2863[var2 + 1] = var4;
         Statics.field2863[var2 + 2] = var5;
         Statics.field2863[var2 + 3] = var6;
         method5355(arg0, var2);
         method5355(var2 + 4, arg1);
      }
   }

   @deob.ObfuscatedName("dc.x(II)V")
   private static void method5365(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = Statics.field2863[var3 - 4];
               int var5 = Statics.field2863[var3];
               if (var4 > var5) {
                  var2 = false;
                  Statics.field2863[var3 - 4] = var5;
                  Statics.field2863[var3] = var4;
                  int var6 = Statics.field2863[var3 - 2];
                  Statics.field2863[var3 - 2] = Statics.field2863[var3 + 2];
                  Statics.field2863[var3 + 2] = var6;
                  int var7 = Statics.field2863[var3 - 1];
                  Statics.field2863[var3 - 1] = Statics.field2863[var3 + 3];
                  Statics.field2863[var3 + 3] = var7;
               }
            }

            if (!var2) {
               arg1 -= 4;
               continue;
            }
         }

         return;
      }
   }
}
