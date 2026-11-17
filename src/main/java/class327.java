@deob.ObfuscatedName("aw")
public class class327 {
   private class327() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("adz.n(Lix;Lif;IIIIIIIIII)V")
   public static void method1404(class544 arg0, class526 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      Statics.field2079 = arg0;
      Statics.field2073 = arg1;
      Statics.field2074 = arg2;
      Statics.field2072 = arg3;
      Statics.field2076 = arg4;
      Statics.field2077 = arg5;
      Statics.field2075 = arg6;
      Statics.field2078 = arg7;
      Statics.field6781 = arg8;
      Statics.field2080 = null;
      Statics.field2081 = null;
      Statics.field1706 = null;
      Statics.field5408 = arg9;
      Statics.field912 = arg10;
      method14656();
      Statics.field3084 = true;
   }

   @deob.ObfuscatedName("tf.k(I)Z")
   private static boolean method14656() {
      boolean var0 = true;
      if (Statics.field2080 == null) {
         if (Statics.field6723.method8790(Statics.field2075)) {
            Statics.field2080 = class375.method5066(Statics.field6723, Statics.field2075);
         } else {
            var0 = false;
         }
      }

      if (Statics.field2081 == null) {
         if (Statics.field6723.method8790(Statics.field2078)) {
            Statics.field2081 = class375.method5066(Statics.field6723, Statics.field2078);
         } else {
            var0 = false;
         }
      }

      if (Statics.field1706 == null) {
         if (Statics.field6723.method8790(Statics.field6781)) {
            Statics.field1706 = class375.method5066(Statics.field6723, Statics.field6781);
         } else {
            var0 = false;
         }
      }

      if (Statics.field2082 == null) {
         if (Statics.field4891.method8790(Statics.field912)) {
            Statics.field2082 = class883.method7898(Statics.field4891, Statics.field912);
         } else {
            var0 = false;
         }
      }

      if (Statics.field2083 == null) {
         if (Statics.field6723.method8790(Statics.field912)) {
            Statics.field2083 = (class998[])((class998[])class375.method5067(Statics.field6723, Statics.field912));
         } else {
            var0 = false;
         }
      }

      return var0;
   }

   @deob.ObfuscatedName("dj.d(Ljava/lang/String;ZLra;Ll;Lvd;I)V")
   public static void method5400(String arg0, boolean arg1, class772 arg2, class609 arg3, class883 arg4) {
      boolean var5 = !Statics.field3084 || method14656();
      if (var5) {
         if (Statics.field3084 && var5) {
            class883 var6 = Statics.field2082;
            class609 var7 = arg2.method7606(var6, Statics.field2083, true);
            int var8 = var6.method15388(arg0, 250, (class894[])null);
            int var9 = var6.method15390(arg0, 250, var6.field9059, (class894[])null);
            int var10 = Statics.field2081.method5551();
            int var11 = var10 + 4;
            int var12 = var11 * 2 + var8;
            int var13 = var11 * 2 + var9;
            if (var12 < Statics.field2076) {
               var12 = Statics.field2076;
            }

            if (var13 < Statics.field2077) {
               var13 = Statics.field2077;
            }

            int var14 = Statics.field2079.method7443(var12, client.field2555) + Statics.field2074;
            int var15 = Statics.field2073.method7329(var13, client.field2556) + Statics.field2072;
            arg2.method7529(Statics.field1706, false).method5219(var14 + Statics.field2080.method5551(), var15 + Statics.field2080.method5554(), var12 - Statics.field2080.method5551() * 2, var13 - Statics.field2080.method5554() * 2, 1, -1, 0);
            arg2.method7529(Statics.field2080, true).method5221(var14, var15);
            Statics.field2080.method5540();
            arg2.method7529(Statics.field2080, true).method5221(var12 + var14 - var10, var15);
            Statics.field2080.method5570();
            arg2.method7529(Statics.field2080, true).method5221(var12 + var14 - var10, var13 + var15 - var10);
            Statics.field2080.method5540();
            arg2.method7529(Statics.field2080, true).method5221(var14, var13 + var15 - var10);
            Statics.field2080.method5570();
            arg2.method7529(Statics.field2081, true).method5235(var14, var15 + Statics.field2080.method5554(), var10, var13 - Statics.field2080.method5554() * 2);
            Statics.field2081.method5612();
            arg2.method7529(Statics.field2081, true).method5235(var14 + Statics.field2080.method5551(), var15, var12 - Statics.field2080.method5551() * 2, var10);
            Statics.field2081.method5612();
            arg2.method7529(Statics.field2081, true).method5235(var12 + var14 - var10, var15 + Statics.field2080.method5554(), var10, var13 - Statics.field2080.method5554() * 2);
            Statics.field2081.method5612();
            arg2.method7529(Statics.field2081, true).method5235(var14 + Statics.field2080.method5551(), var13 + var15 - var10, var12 - Statics.field2080.method5551() * 2, var10);
            Statics.field2081.method5612();
            var7.method8692(arg0, var11 + var14, var11 + var15, var12 - var11 * 2, var13 - var11 * 2, Statics.field5408 | -16777216, -1, 1, 1, 0, (class383[])null, (int[])null, (class826)null, 0, 0);
            client.method10741(var14, var15, var12, var13);
         } else {
            int var16 = arg4.method15388(arg0, 250, (class894[])null);
            int var17 = arg4.method15406(arg0, 250, (class894[])null) * 13;
            byte var18 = 4;
            int var19 = var18 + 6;
            int var20 = var18 + 6;
            arg2.method7513(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -16777216, 0);
            arg2.method7751(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -1, 0);
            arg3.method8692(arg0, var19, var20, var16, var17, -1, -1, 1, 1, 0, (class383[])null, (int[])null, (class826)null, 0, 0);
            client.method10741(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18);
         }

         if (arg1) {
            try {
               arg2.method11515();
               arg2.method11522();
            } catch (class165 var22) {
            }
         }

      }
   }
}
