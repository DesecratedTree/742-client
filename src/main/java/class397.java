import net.ClientProt;

@deob.ObfuscatedName("dl")
public class class397 {
   @deob.ObfuscatedName("dl.n")
   public static class849 field2947 = new class849();
   @deob.ObfuscatedName("dl.o")
   public static class875 field2950 = new class875(32);
   @deob.ObfuscatedName("dl.a")
   public static int field2948 = 1;
   @deob.ObfuscatedName("dl.x")
   public static int field2949 = 0;
   @deob.ObfuscatedName("dl.s")
   public static int field2953 = 0;
   @deob.ObfuscatedName("dl.l")
   public static boolean field2951 = false;
   @deob.ObfuscatedName("dl.e")
   public static int field2954 = -1;
   @deob.ObfuscatedName("dl.z")
   private static int field2944 = -1;
   @deob.ObfuscatedName("dl.i")
   public static final class865 field2956 = new class399();

   private class397() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ael.n(II)Z")
   public static boolean method1562(int arg0) {
      if (field2944 != arg0 || Statics.field2955 == null) {
         method11737();
         Statics.field2955 = class386.field2840;
         field2944 = arg0;
      }

      if (class386.field2840 == Statics.field2955) {
         byte[] var1 = Statics.field160.method8809(arg0);
         if (var1 == null) {
            return false;
         }

         class124 var2 = new class124(var1);
         method10945(var2);
         int var3 = var2.method1688();

         for(int var4 = 0; var4 < var3; ++var4) {
            field2947.method14959(new class73(var2));
         }

         int var5 = var2.method1604();
         Statics.field2945 = new class392[var5];

         for(int var6 = 0; var6 < var5; ++var6) {
            Statics.field2945[var6] = new class392(var2);
         }

         int var7 = var2.method1604();
         Statics.field9261 = new class411[var7];

         for(int var8 = 0; var8 < var7; ++var8) {
            Statics.field9261[var8] = new class411(var2, var8);
         }

         int var9 = var2.method1604();
         Statics.field3643 = new class406[var9];

         for(int var10 = 0; var10 < var9; ++var10) {
            Statics.field3643[var10] = new class406(var2);
         }

         int var11 = var2.method1604();
         Statics.field2906 = new class410[var11];

         for(int var12 = 0; var12 < var11; ++var12) {
            Statics.field2906[var12] = new class410(var2);
         }

         int var13 = var2.method1604();
         Statics.field2946 = new class389[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            Statics.field2946[var14] = class389.method6897(var2);
         }

         Statics.field2955 = class386.field2841;
      }

      if (class386.field2841 == Statics.field2955) {
         boolean var15 = true;
         class411[] var16 = Statics.field9261;

         for(int var17 = 0; var17 < var16.length; ++var17) {
            class411 var18 = var16[var17];
            if (!var18.method5642()) {
               var15 = false;
            }
         }

         class389[] var19 = Statics.field2946;

         for(int var20 = 0; var20 < var19.length; ++var20) {
            class389 var21 = var19[var20];
            if (!var21.method239()) {
               var15 = false;
            }
         }

         class406[] var22 = Statics.field3643;

         for(int var23 = 0; var23 < var22.length; ++var23) {
            class406 var24 = var22[var23];
            if (!var24.method5528()) {
               var15 = false;
            }
         }

         if (!var15) {
            return false;
         }

         Statics.field2955 = class386.field2842;
      }

      return true;
   }

   @deob.ObfuscatedName("pw.k(Laen;I)V")
   private static void method10945(class124 arg0) {
      while(true) {
         int var1 = arg0.method1688();
         switch(var1) {
         case 0:
            field2949 = arg0.method1587();
            field2953 = arg0.method1587();
            break;
         case 255:
            return;
         }
      }
   }

   @deob.ObfuscatedName("rk.d(I)V")
   public static void method11737() {
      field2950.method15312();
      field2947.method14958();
      Statics.field2945 = null;
      Statics.field9261 = null;
      Statics.field3643 = null;
      Statics.field2906 = null;
      Statics.field2946 = null;
      field2948 = 1;
      field2949 = 0;
      field2953 = 0;
      Statics.field2955 = null;
      field2944 = -1;
      field2954 = -1;
      if (field2951) {
         client.field2687 = Statics.field10553;
         client.field2688 = Statics.field2952;
         client.field2629 = Statics.field1579;
         client.field2686 = Statics.field3819;
         field2951 = false;
      }

   }

   @deob.ObfuscatedName("xu.r(ZI)V")
   public static void method16041(boolean arg0) {
      if (client.field2476 != 1 && client.field2476 != 2) {
         if (!arg0) {
            class389[] var1 = Statics.field2946;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               class389 var3 = var1[var2];
               var3.method369();
            }

            if (field2954 != -1) {
               Statics.method1797();
               class677.field6149 = -1;
               class677.method5269(field2954, 255, 50);
            }
         }

         client.field2476 = 1;
         Statics.field2786 = (int[][])null;
         Statics.field3803 = null;
         client.field2477 = false;
         if (field2944 > 0) {
            class783.method14203(class932.field9456, field2944, -1);
         }

         method11737();
         class109 var4 = class109.method15110(ClientProt.CUTSCENE_FINISHED, client.field2463.field832);
         var4.field814.method1568(arg0 ? 1 : 0);
         client.field2463.method1408(var4);
      }
   }
}
