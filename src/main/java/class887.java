import java.util.Random;

@deob.ObfuscatedName("vh")
public class class887 {
   private class887() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ta.n(IIB)I")
   public static int method14595(int arg0, int arg1) {
      int var2 = 1;

      while(arg1 > 1) {
         if ((arg1 & 1) != 0) {
            var2 = arg0 * var2;
         }

         arg0 *= arg0;
         arg1 >>= 1;
      }

      if (arg1 == 1) {
         return arg0 * var2;
      } else {
         return var2;
      }
   }

   @deob.ObfuscatedName("ks.k(III)I")
   public static int method8548(int arg0, int arg1) {
      if (arg1 > arg0) {
         int var2 = arg0;
         arg0 = arg1;
         arg1 = var2;
      }

      while(arg1 != 0) {
         int var3 = arg0 % arg1;
         arg0 = arg1;
         arg1 = var3;
      }

      return arg0;
   }

   @deob.ObfuscatedName("jb.d(II)I")
   public static int method7897(int arg0) {
      int var1 = (arg0 >>> 1 & 1431655765) + (arg0 & 1431655765);
      int var2 = (var1 >>> 2 & 858993459) + (var1 & 858993459);
      int var3 = (var2 >>> 4) + var2 & 252645135;
      int var4 = (var3 >>> 8) + var3;
      int var5 = (var4 >>> 16) + var4;
      return var5 & 255;
   }

   @deob.ObfuscatedName("av.b(II)I")
   public static int method4053(int arg0) {
      int var6 = arg0 - 1;
      int var1 = var6 | var6 >>> 1;
      int var2 = var1 | var1 >>> 2;
      int var3 = var2 | var2 >>> 4;
      int var4 = var3 | var3 >>> 8;
      int var5 = var4 | var4 >>> 16;
      return var5 + 1;
   }

   @deob.ObfuscatedName("tl.r(II)I")
   public static int method14787(int arg0) {
      int var1 = arg0 >>> 1;
      int var2 = var1 | var1 >>> 1;
      int var3 = var2 | var2 >>> 2;
      int var4 = var3 | var3 >>> 4;
      int var5 = var4 | var4 >>> 8;
      int var6 = var5 | var5 >>> 16;
      return arg0 & ~var6;
   }

   @deob.ObfuscatedName("ty.p(II)Z")
   public static boolean method15054(int arg0) {
      return (arg0 & -arg0) == arg0;
   }

   @deob.ObfuscatedName("client.o(IB)I")
   public static int method5009(int arg0) {
      int var1 = 0;
      if (arg0 < 0 || arg0 >= 65536) {
         arg0 >>>= 16;
         var1 += 16;
      }

      if (arg0 >= 256) {
         arg0 >>>= 8;
         var1 += 8;
      }

      if (arg0 >= 16) {
         arg0 >>>= 4;
         var1 += 4;
      }

      if (arg0 >= 4) {
         arg0 >>>= 2;
         var1 += 2;
      }

      if (arg0 >= 1) {
         arg0 >>>= 1;
         ++var1;
      }

      return arg0 + var1;
   }

   @deob.ObfuscatedName("rk.x(III)I")
   public static int method11735(int arg0, int arg1) {
      int var2 = arg0 >>> 31;
      return (arg0 + var2) / arg1 - var2;
   }

   @deob.ObfuscatedName("no.s(III)I")
   private static int method9957(int arg0, int arg1) {
      int var2 = arg0 >> 31 & arg1 - 1;
      return ((arg0 >>> 31) + arg0) % arg1 + var2;
   }

   @deob.ObfuscatedName("vj.l(Ljava/util/Random;II)I")
   public static int method15494(Random arg0, int arg1) {
      if (arg1 <= 0) {
         throw new IllegalArgumentException();
      } else if (method15054(arg1)) {
         return (int)(((long)arg0.nextInt() & 4294967295L) * (long)arg1 >> 32);
      } else {
         int var2 = Integer.MIN_VALUE - (int)(4294967296L % (long)arg1);

         int var3;
         do {
            var3 = arg0.nextInt();
         } while(var3 >= var2);

         return method9957(var3, arg1);
      }
   }
}
