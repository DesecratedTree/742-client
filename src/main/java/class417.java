@deob.ObfuscatedName("ee")
public class class417 {
   @deob.ObfuscatedName("ee.s")
   public static int field3124 = 0;

   private class417() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("pf.n(Llc;Llc;Llc;Laic;Lmj;I)Z")
   public static boolean method10710(class612 arg0, class612 arg1, class612 arg2, class221 arg3, class646 arg4) {
      Statics.field3123 = arg0;
      Statics.field3117 = arg1;
      Statics.field3118 = arg2;
      Statics.field3119 = arg3;
      Statics.field3120 = arg4;
      Statics.field8869 = new int[16];

      for(int var5 = 0; var5 < 16; ++var5) {
         Statics.field8869[var5] = 255;
      }

      return true;
   }

   @deob.ObfuscatedName("ux.k(Llc;IIIZI)V")
   public static void method15349(class612 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      method4216(arg0, arg1, arg2, arg3, arg4, 0L);
   }

   @deob.ObfuscatedName("abu.d(Llc;IIIZLaic;B)V")
   public static void method761(class612 arg0, int arg1, int arg2, int arg3, boolean arg4, class221 arg5) {
      method15349(arg0, arg1, arg2, arg3, arg4);
      Statics.field3876 = arg5;
   }

   @deob.ObfuscatedName("br.b(Llc;IIIZJ)V")
   private static void method4216(class612 arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5) {
      method5177(arg0, arg1, arg2, arg3, arg4, arg5, 0);
   }

   @deob.ObfuscatedName("cu.r(Llc;IIIZJII)V")
   private static void method5177(class612 arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5, int arg6) {
      field3124 = 1;
      Statics.field2071 = arg0;
      Statics.field8502 = arg1;
      Statics.field2050 = arg2;
      Statics.field3876 = null;
      Statics.field908 = arg3;
      Statics.field3951 = arg4;
      Statics.field3682 = 10000;
      Statics.field5371 = arg5;
      Statics.field3126 = arg6;
   }

   @deob.ObfuscatedName("lu.p(IB)V")
   public static void method9121(int arg0) {
      if (field3124 != 0) {
         Statics.field908 = arg0;
      } else {
         Statics.field3119.method2966(arg0);
      }

   }

   @deob.ObfuscatedName("wo.a(IIB)V")
   public static void method15865(int arg0, int arg1) {
      if (field3124 != 0) {
         if (arg0 < 0) {
            for(int var2 = 0; var2 < 16; ++var2) {
               Statics.field8869[var2] = arg1;
            }
         } else {
            Statics.field8869[arg0] = arg1;
         }
      }

      Statics.field3119.method2969(arg0, arg1);
   }

   @deob.ObfuscatedName("gc.l(II)V")
   public static void method6598(int arg0) {
      field3124 = 1;
      Statics.field2071 = null;
      Statics.field8502 = -1;
      Statics.field2050 = -1;
      Statics.field3876 = null;
      Statics.field908 = 0;
      Statics.field3951 = false;
      Statics.field3682 = arg0;
      Statics.field7192 = null;
   }

   @deob.ObfuscatedName("ie.u(ILlc;IIIZLec;I)V")
   public static void method7326(int arg0, class612 arg1, int arg2, int arg3, int arg4, boolean arg5, class415 arg6) {
      if (arg0 > 0) {
         field3124 = 1;
         Statics.field2071 = arg1;
         Statics.field8502 = arg2;
         Statics.field2050 = arg3;
         Statics.field3876 = null;
         Statics.field908 = arg4;
         Statics.field3951 = arg5;
         Statics.field3682 = Statics.field3119.method2965() / arg0;
         if (Statics.field3682 < 1) {
            Statics.field3682 = 1;
         }

         Statics.field7192 = arg6;
      } else {
         if (arg6 != null) {
            arg6.method432();
         }

         method15349(arg1, arg2, arg3, arg4, arg5);
      }

   }

   @deob.ObfuscatedName("dj.v(I)Z")
   public static boolean method5407() {
      return field3124 != 0 ? true : Statics.field3119.method2978();
   }

   @deob.ObfuscatedName("qe.g(I)Z")
   public static boolean method11104() {
      return field3124 != 0;
   }

   @deob.ObfuscatedName("ox.h(I)V")
   public static void method10644() {
      try {
         if (field3124 == 1) {
            int var0 = Statics.field3119.method2965();
            if (var0 > 0 && Statics.field3119.method2978()) {
               int var1 = var0 - Statics.field3682;
               if (var1 < 0) {
                  var1 = 0;
               }

               Statics.field3119.method2966(var1);
               return;
            }

            Statics.field3119.method3056();
            Statics.field3119.method2972();
            if (Statics.field2071 != null) {
               field3124 = 2;
            } else {
               field3124 = 0;
            }

            Statics.field1160 = null;
            Statics.field3127 = null;
         }

         if (field3124 == 3) {
            int var2 = Statics.field3119.method2965();
            if (var2 < Statics.field908 && Statics.field3119.method2978()) {
               int var3 = Statics.field3126 + var2;
               if (var3 > Statics.field908) {
                  var3 = Statics.field908;
               }

               Statics.field3119.method2966(var3);
               return;
            }

            Statics.field3126 = 0;
            field3124 = 0;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         Statics.field3119.method3056();
         method8016();
      }

   }

   @deob.ObfuscatedName("cx.z(Ler;IB)V")
   public static void method5209(class430 arg0, int arg1) {
      Statics.field3119.method3056();
      class221 var2 = arg0.method5944();
      if (var2 != null) {
         Statics.field3120.method9295();
         Statics.field3119 = var2;
         Statics.field3119.method3008(arg0.method5950(), false);
         Statics.field3119.method2966(arg1);
         if (Statics.field3120 != null) {
            Statics.field3120.method9297(Statics.field3119);
         }

         method8016();
      }
   }

   @deob.ObfuscatedName("jt.m(B)V")
   public static void method8016() {
      field3124 = 0;
      Statics.field1160 = null;
      Statics.field3127 = null;
      Statics.field2071 = null;
      Statics.field3876 = null;
   }

   @deob.ObfuscatedName("p.i(I)Laic;")
   public static class221 method10656() {
      return Statics.field3119;
   }
}
