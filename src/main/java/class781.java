@deob.ObfuscatedName("rj")
public class class781 {
   private class781() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("fo.n([Ljava/lang/String;[SI)V")
   public static void method6468(String[] arg0, short[] arg1) {
      method10747(arg0, arg1, 0, arg0.length - 1);
   }

   @deob.ObfuscatedName("pk.k([Ljava/lang/String;[SIII)V")
   private static void method10747(String[] arg0, short[] arg1, int arg2, int arg3) {
      if (arg2 < arg3) {
         int var4 = (arg2 + arg3) / 2;
         int var5 = arg2;
         String var6 = arg0[var4];
         arg0[var4] = arg0[arg3];
         arg0[arg3] = var6;
         short var7 = arg1[var4];
         arg1[var4] = arg1[arg3];
         arg1[arg3] = var7;

         for(int var8 = arg2; var8 < arg3; ++var8) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = arg0[var8];
               arg0[var8] = arg0[var5];
               arg0[var5] = var9;
               short var10 = arg1[var8];
               arg1[var8] = arg1[var5];
               arg1[var5++] = var10;
            }
         }

         arg0[arg3] = arg0[var5];
         arg0[var5] = var6;
         arg1[arg3] = arg1[var5];
         arg1[var5] = var7;
         method10747(arg0, arg1, arg2, var5 - 1);
         method10747(arg0, arg1, var5 + 1, arg3);
      }

   }

   @deob.ObfuscatedName("fb.d([Ljava/lang/String;[II)V")
   public static void method6216(String[] arg0, int[] arg1) {
      method14302(arg0, arg1, 0, arg0.length - 1);
   }

   @deob.ObfuscatedName("sf.b([Ljava/lang/String;[IIII)V")
   private static void method14302(String[] arg0, int[] arg1, int arg2, int arg3) {
      if (arg2 < arg3) {
         int var4 = (arg2 + arg3) / 2;
         int var5 = arg2;
         String var6 = arg0[var4];
         arg0[var4] = arg0[arg3];
         arg0[arg3] = var6;
         int var7 = arg1[var4];
         arg1[var4] = arg1[arg3];
         arg1[arg3] = var7;

         for(int var8 = arg2; var8 < arg3; ++var8) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = arg0[var8];
               arg0[var8] = arg0[var5];
               arg0[var5] = var9;
               int var10 = arg1[var8];
               arg1[var8] = arg1[var5];
               arg1[var5++] = var10;
            }
         }

         arg0[arg3] = arg0[var5];
         arg0[var5] = var6;
         arg1[arg3] = arg1[var5];
         arg1[var5] = var7;
         method14302(arg0, arg1, arg2, var5 - 1);
         method14302(arg0, arg1, var5 + 1, arg3);
      }

   }

   @deob.ObfuscatedName("sb.r([I[IIII)V")
   public static void method14256(int[] arg0, int[] arg1, int arg2, int arg3) {
      if (arg2 < arg3) {
         int var4 = (arg2 + arg3) / 2;
         int var5 = arg2;
         int var6 = arg0[var4];
         arg0[var4] = arg0[arg3];
         arg0[arg3] = var6;
         int var7 = arg1[var4];
         arg1[var4] = arg1[arg3];
         arg1[arg3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for(int var9 = arg2; var9 < arg3; ++var9) {
            if (arg0[var9] < (var9 & var8) + var6) {
               int var10 = arg0[var9];
               arg0[var9] = arg0[var5];
               arg0[var5] = var10;
               int var11 = arg1[var9];
               arg1[var9] = arg1[var5];
               arg1[var5++] = var11;
            }
         }

         arg0[arg3] = arg0[var5];
         arg0[var5] = var6;
         arg1[arg3] = arg1[var5];
         arg1[var5] = var7;
         method14256(arg0, arg1, arg2, var5 - 1);
         method14256(arg0, arg1, var5 + 1, arg3);
      }

   }

   @deob.ObfuscatedName("pt.p([J[IB)V")
   public static void method10914(long[] arg0, int[] arg1) {
      method10324(arg0, arg1, 0, arg0.length - 1);
   }

   @deob.ObfuscatedName("ol.o([J[IIII)V")
   private static void method10324(long[] arg0, int[] arg1, int arg2, int arg3) {
      if (arg2 < arg3) {
         int var4 = (arg2 + arg3) / 2;
         int var5 = arg2;
         long var6 = arg0[var4];
         arg0[var4] = arg0[arg3];
         arg0[arg3] = var6;
         int var8 = arg1[var4];
         arg1[var4] = arg1[arg3];
         arg1[arg3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for(int var10 = arg2; var10 < arg3; ++var10) {
            if (arg0[var10] < (long)(var10 & var9) + var6) {
               long var11 = arg0[var10];
               arg0[var10] = arg0[var5];
               arg0[var5] = var11;
               int var13 = arg1[var10];
               arg1[var10] = arg1[var5];
               arg1[var5++] = var13;
            }
         }

         arg0[arg3] = arg0[var5];
         arg0[var5] = var6;
         arg1[arg3] = arg1[var5];
         arg1[var5] = var8;
         method10324(arg0, arg1, arg2, var5 - 1);
         method10324(arg0, arg1, var5 + 1, arg3);
      }

   }

   @deob.ObfuscatedName("qv.a([I[Ljava/lang/Object;S)V")
   public static void method11384(int[] arg0, Object[] arg1) {
      method6516(arg0, arg1, 0, arg0.length - 1);
   }

   @deob.ObfuscatedName("ft.x([I[Ljava/lang/Object;III)V")
   public static void method6516(int[] arg0, Object[] arg1, int arg2, int arg3) {
      if (arg2 < arg3) {
         int var4 = (arg2 + arg3) / 2;
         int var5 = arg2;
         int var6 = arg0[var4];
         arg0[var4] = arg0[arg3];
         arg0[arg3] = var6;
         Object var7 = arg1[var4];
         arg1[var4] = arg1[arg3];
         arg1[arg3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for(int var9 = arg2; var9 < arg3; ++var9) {
            if (arg0[var9] < (var9 & var8) + var6) {
               int var10 = arg0[var9];
               arg0[var9] = arg0[var5];
               arg0[var5] = var10;
               Object var11 = arg1[var9];
               arg1[var9] = arg1[var5];
               arg1[var5++] = var11;
            }
         }

         arg0[arg3] = arg0[var5];
         arg0[var5] = var6;
         arg1[arg3] = arg1[var5];
         arg1[var5] = var7;
         method6516(arg0, arg1, arg2, var5 - 1);
         method6516(arg0, arg1, var5 + 1, arg3);
      }

   }

   @deob.ObfuscatedName("dr.s([J[Ljava/lang/Object;B)V")
   public static void method5516(long[] arg0, Object[] arg1) {
      method4476(arg0, arg1, 0, arg0.length - 1);
   }

   @deob.ObfuscatedName("cg.l([J[Ljava/lang/Object;III)V")
   private static void method4476(long[] arg0, Object[] arg1, int arg2, int arg3) {
      if (arg2 < arg3) {
         int var4 = (arg2 + arg3) / 2;
         int var5 = arg2;
         long var6 = arg0[var4];
         arg0[var4] = arg0[arg3];
         arg0[arg3] = var6;
         Object var8 = arg1[var4];
         arg1[var4] = arg1[arg3];
         arg1[arg3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for(int var10 = arg2; var10 < arg3; ++var10) {
            if (arg0[var10] < (long)(var10 & var9) + var6) {
               long var11 = arg0[var10];
               arg0[var10] = arg0[var5];
               arg0[var5] = var11;
               Object var13 = arg1[var10];
               arg1[var10] = arg1[var5];
               arg1[var5++] = var13;
            }
         }

         arg0[arg3] = arg0[var5];
         arg0[var5] = var6;
         arg1[arg3] = arg1[var5];
         arg1[var5] = var8;
         method4476(arg0, arg1, arg2, var5 - 1);
         method4476(arg0, arg1, var5 + 1, arg3);
      }

   }
}
