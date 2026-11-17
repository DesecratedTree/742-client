@deob.ObfuscatedName("acp")
public class class72 extends class674 {
   @deob.ObfuscatedName("acp.b")
   private static final class875 field521 = new class875(32);
   @deob.ObfuscatedName("acp.r")
   private static final class737 field523 = new class737(11);
   @deob.ObfuscatedName("acp.o")
   private int[] field520 = new int[]{-1};
   @deob.ObfuscatedName("acp.a")
   private int[] field524 = new int[]{0};

   private class72() {
   }

   @deob.ObfuscatedName("aev.n(IIZI)I")
   public static int method2000(int arg0, int arg1, boolean arg2) {
      class72 var3 = method9227(arg0, arg2);
      if (var3 == null) {
         return -1;
      } else {
         return arg1 >= 0 && arg1 < var3.field520.length ? var3.field520[arg1] : -1;
      }
   }

   @deob.ObfuscatedName("jw.k(IIZI)I")
   public static int method8037(int arg0, int arg1, boolean arg2) {
      class72 var3 = method9227(arg0, arg2);
      if (var3 == null) {
         return 0;
      } else {
         return arg1 >= 0 && arg1 < var3.field524.length ? var3.field524[arg1] : 0;
      }
   }

   @deob.ObfuscatedName("tj.d(IIZI)I")
   public static int method14689(int arg0, int arg1, boolean arg2) {
      class72 var3 = method9227(arg0, arg2);
      if (var3 == null) {
         return 0;
      } else if (arg1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field524.length; ++var5) {
            if (var3.field520[var5] == arg1) {
               var4 += var3.field524[var5];
            }
         }

         return var4;
      }
   }

   @deob.ObfuscatedName("tk.b(IIZZI)I")
   public static int method14782(int arg0, int arg1, boolean arg2, boolean arg3) {
      class72 var4 = method9227(arg0, arg3);
      if (var4 == null) {
         return 0;
      } else {
         int var5 = 0;

         for(int var6 = 0; var6 < var4.field520.length; ++var6) {
            if (var4.field520[var6] >= 0 && var4.field520[var6] < Statics.field4196.field9087) {
               class899 var7 = Statics.field4196.method15540(var4.field520[var6]);
               int var8 = var7.method15630(arg1, Statics.field5946.method15930(arg1).field9388);
               if (arg2) {
                  var5 += var4.field524[var6] * var8;
               } else {
                  var5 += var8;
               }
            }
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("tc.r(IZB)I")
   public static int method14625(int arg0, boolean arg1) {
      if (arg1) {
         return 0;
      } else {
         class72 var2 = method9227(arg0, arg1);
         if (var2 == null) {
            return Statics.field9258.method15756(arg0).field928;
         } else {
            int var3 = 0;

            for(int var4 = 0; var4 < var2.field520.length; ++var4) {
               if (var2.field520[var4] == -1) {
                  ++var3;
               }
            }

            return var3 + (Statics.field9258.method15756(arg0).field928 - var2.field520.length);
         }
      }
   }

   @deob.ObfuscatedName("mc.p(IZS)Lacp;")
   public static class72 method9227(int arg0, boolean arg1) {
      long var2 = (long)(arg0 | (arg1 ? Integer.MIN_VALUE : 0));
      return (class72)field521.method15322(var2);
   }

   @deob.ObfuscatedName("aet.o(IIIIZI)V")
   public static void method1937(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      long var5 = (long)(arg0 | (arg4 ? Integer.MIN_VALUE : 0));
      class72 var7 = (class72)field521.method15322(var5);
      if (var7 == null) {
         var7 = new class72();
         field521.method15311(var7, var5);
      }

      if (var7.field520.length <= arg1) {
         int[] var8 = new int[arg1 + 1];
         int[] var9 = new int[arg1 + 1];

         for(int var10 = 0; var10 < var7.field520.length; ++var10) {
            var8[var10] = var7.field520[var10];
            var9[var10] = var7.field524[var10];
         }

         for(int var11 = var7.field520.length; var11 < arg1; ++var11) {
            var8[var11] = -1;
            var9[var11] = 0;
         }

         var7.field520 = var8;
         var7.field524 = var9;
      }

      var7.field520[arg1] = arg2;
      var7.field524[arg1] = arg3;
   }

   @deob.ObfuscatedName("re.a(IZI)V")
   public static void method11654(int arg0, boolean arg1) {
      class72 var2 = method9227(arg0, arg1);
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.field520.length; ++var3) {
            var2.field520[var3] = -1;
            var2.field524[var3] = 0;
         }

      }
   }

   @deob.ObfuscatedName("ou.x(IZI)V")
   public static void method10473(int arg0, boolean arg1) {
      class72 var2 = method9227(arg0, arg1);
      if (var2 != null) {
         var2.method9864();
      }
   }

   @deob.ObfuscatedName("aav.s(I)V")
   public static void method442() {
      field521.method15312();
   }

   @deob.ObfuscatedName("acp.l([II[IZI)J")
   private long method1034(int[] arg0, int arg1, int[] arg2, boolean arg3) {
      long[] var5 = class124.field929;
      long var6 = -1L;
      long var8 = var6 >>> 8 ^ var5[(int)((var6 ^ (long)(arg1 >> 8)) & 255L)];
      long var10 = var8 >>> 8 ^ var5[(int)((var8 ^ (long)arg1) & 255L)];

      for(int var12 = 0; var12 < arg0.length; ++var12) {
         long var13 = var10 >>> 8 ^ var5[(int)((var10 ^ (long)(arg0[var12] >> 24)) & 255L)];
         long var15 = var13 >>> 8 ^ var5[(int)((var13 ^ (long)(arg0[var12] >> 16)) & 255L)];
         long var17 = var15 >>> 8 ^ var5[(int)((var15 ^ (long)(arg0[var12] >> 8)) & 255L)];
         var10 = var17 >>> 8 ^ var5[(int)((var17 ^ (long)arg0[var12]) & 255L)];
      }

      if (arg2 != null) {
         for(int var19 = 0; var19 < 5; ++var19) {
            var10 = var10 >>> 8 ^ var5[(int)((var10 ^ (long)arg2[var19]) & 255L)];
         }
      }

      return var10 >>> 8 ^ var5[(int)((var10 ^ (long)(arg3 ? 1 : 0)) & 255L)];
   }

   @deob.ObfuscatedName("acp.u(Lra;ILtk;IZLqc;B)Lqa;")
   public final class745 method1035(class772 arg0, int arg1, class836 arg2, int arg3, boolean arg4, class747 arg5) {
      class745 var7 = null;
      int var8 = arg1;
      class743 var9 = null;
      if (arg3 != -1) {
         var9 = Statics.field8402.method10795(arg3);
      }

      int[] var10 = this.field520;
      if (var9 != null && var9.field6845 != null) {
         var10 = new int[var9.field6845.length];

         for(int var11 = 0; var11 < var9.field6845.length; ++var11) {
            int var12 = var9.field6845[var11];
            if (var12 >= 0 && var12 < this.field520.length) {
               var10[var11] = this.field520[var12];
            } else {
               var10[var11] = -1;
            }
         }
      }

      if (arg2 != null) {
         var8 = arg1 | arg2.method14779();
      }

      long var13 = this.method1034(var10, arg3, arg5 != null ? arg5.field6886 : null, arg4);
      if (field523 != null) {
         var7 = (class745)field523.method10909(var13);
      }

      if (var7 == null || arg0.method7534(var7.method6980(), var8) != 0) {
         if (var7 != null) {
            var8 = arg0.method7535(var8, var7.method6980());
         }

         int var15 = var8;
         boolean var16 = false;

         for(int var17 = 0; var17 < var10.length; ++var17) {
            if (var10[var17] != -1 && !Statics.field4196.method15540(var10[var17]).method15614(arg4, (class880)null)) {
               var16 = true;
            }
         }

         if (var16) {
            return null;
         }

         class396[] var18 = new class396[var10.length];

         for(int var19 = 0; var19 < var10.length; ++var19) {
            if (var10[var19] != -1) {
               var18[var19] = Statics.field4196.method15540(var10[var19]).method15615(arg4, (class880)null);
            }
         }

         if (var9 != null && var9.field6839 != null) {
            for(int var20 = 0; var20 < var9.field6839.length; ++var20) {
               if (var9.field6839[var20] != null && var18[var20] != null) {
                  int var21 = var9.field6839[var20][0];
                  int var22 = var9.field6839[var20][1];
                  int var23 = var9.field6839[var20][2];
                  int var24 = var9.field6839[var20][3];
                  int var25 = var9.field6839[var20][4];
                  int var26 = var9.field6839[var20][5];
                  if (var24 != 0 || var25 != 0 || var26 != 0) {
                     var18[var20].method5426(var24, var25, var26);
                  }

                  if (var21 != 0 || var22 != 0 || var23 != 0) {
                     var18[var20].method5425(var21, var22, var23);
                  }
               }
            }
         }

         class396 var27 = new class396(var18, var18.length);
         if (arg5 != null) {
            var15 = var8 | 16384;
         }

         var7 = arg0.method7528(var27, var15, Statics.field522, 64, 850);
         if (arg5 != null) {
            for(int var28 = 0; var28 < 10; ++var28) {
               for(int var29 = 0; var29 < Statics.field3671[var28].length; ++var29) {
                  if (arg5.field6886[var28] < Statics.field6884[var28][var29].length) {
                     var7.method7023(Statics.field3671[var28][var29], Statics.field6884[var28][var29][arg5.field6886[var28]]);
                  }
               }
            }
         }

         if (field523 != null) {
            var7.method6916(var8);
            field523.method10880(var7, var13);
         }
      }

      if (arg2 == null) {
         return var7;
      } else {
         class745 var30 = var7.method6914((byte)1, var8, true);
         arg2.method14704(var30, 0);
         return var30;
      }
   }

   @deob.ObfuscatedName("fy.z(IB)V")
   public static void method6546(int arg0) {
      Statics.field522 = arg0;
      field523.method10883();
   }

   @deob.ObfuscatedName("uv.t(I)V")
   public static void method15304() {
      field523.method10883();
   }
}
