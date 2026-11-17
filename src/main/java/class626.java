@deob.ObfuscatedName("lq")
public class class626 {
   private class626() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("dw.n(IIII)I")
   public static int method5630(int arg0, int arg1, int arg2) {
      int var3 = arg2 & 3;
      if (var3 == 0) {
         return arg0;
      } else if (var3 == 1) {
         return arg1;
      } else {
         return var3 == 2 ? 7 - arg0 : 7 - arg1;
      }
   }

   @deob.ObfuscatedName("lg.k(IIIB)I")
   public static int method8889(int arg0, int arg1, int arg2) {
      int var3 = arg2 & 3;
      if (var3 == 0) {
         return arg1;
      } else if (var3 == 1) {
         return 7 - arg0;
      } else {
         return var3 == 2 ? 7 - arg1 : arg0;
      }
   }

   @deob.ObfuscatedName("ry.d(IIII)I")
   public static int method14217(int arg0, int arg1, int arg2) {
      int var3 = arg2 & 3;
      if (var3 == 0) {
         return arg0;
      } else if (var3 == 1) {
         return arg1;
      } else {
         return var3 == 2 ? 4095 - arg0 : 4095 - arg1;
      }
   }

   @deob.ObfuscatedName("pn.b(IIII)I")
   public static int method10808(int arg0, int arg1, int arg2) {
      int var3 = arg2 & 3;
      if (var3 == 0) {
         return arg1;
      } else if (var3 == 1) {
         return 4095 - arg0;
      } else {
         return var3 == 2 ? 4095 - arg1 : arg0;
      }
   }

   @deob.ObfuscatedName("jb.r(IIIIIIB)I")
   public static int method7900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if ((arg5 & 1) == 1) {
         int var6 = arg3;
         arg3 = arg4;
         arg4 = var6;
      }

      int var7 = arg2 & 3;
      if (var7 == 0) {
         return arg0;
      } else if (var7 == 1) {
         return arg1;
      } else {
         return var7 == 2 ? 7 - arg0 - (arg3 - 1) : 7 - arg1 - (arg4 - 1);
      }
   }

   @deob.ObfuscatedName("oj.p(IIIIIIB)I")
   public static int method10310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if ((arg5 & 1) == 1) {
         int var6 = arg3;
         arg3 = arg4;
         arg4 = var6;
      }

      int var7 = arg2 & 3;
      if (var7 == 0) {
         return arg1;
      } else if (var7 == 1) {
         return 7 - arg0 - (arg3 - 1);
      } else {
         return var7 == 2 ? 7 - arg1 - (arg4 - 1) : arg0;
      }
   }
}
