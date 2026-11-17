@deob.ObfuscatedName("nn")
public class class677 {
   @deob.ObfuscatedName("nn.a")
   public static int field6149 = -1;
   @deob.ObfuscatedName("nn.x")
   public static boolean field6153 = false;
   @deob.ObfuscatedName("nn.u")
   public static int field6157 = -1;
   @deob.ObfuscatedName("nn.i")
   public static int field6150 = 0;
   @deob.ObfuscatedName("nn.t")
   public static class678[] field6156 = new class678[50];
   @deob.ObfuscatedName("nn.c")
   public static class683 field6152 = null;
   @deob.ObfuscatedName("nn.w")
   public static class683 field6158 = null;

   private class677() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("is.n(I)V")
   public static void method7418() {
      class646.method9292(22050, Statics.field9361.field989.method2220() == 1, 2);
      Statics.field9102 = class646.method9319(Statics.field5796, 0, 22050);
      method14062(true, method8051((class221)null));
      Statics.field2063 = class646.method9319(Statics.field5796, 1, 2048);
      Statics.field1029 = new class223();
      Statics.field2063.method9297(Statics.field1029);
      Statics.field10564 = new class639(22050, Statics.field5854);
      method8735();
   }

   @deob.ObfuscatedName("k.k(Laic;B)Laic;")
   private static class221 method8051(class221 arg0) {
      class221 var1 = arg0 == null ? new class221() : new class221(arg0);
      var1.method2979(9, 128);
      return var1;
   }

   @deob.ObfuscatedName("aw.d(B)V")
   public static void method4068() {
      Statics.method7901();
      class646.method9292(22050, Statics.field9361.field989.method2220() == 1, 2);
      Statics.field9102 = class646.method9319(Statics.field5796, 0, 22050);
      method14062(true, method8051((class221)null));
      Statics.field2063 = class646.method9319(Statics.field5796, 1, 2048);
      Statics.field2063.method9297(Statics.field1029);
   }

   @deob.ObfuscatedName("ro.b(ZLaic;B)V")
   private static void method14062(boolean arg0, class221 arg1) {
      Statics.field9102.method9297(arg1);
      if (arg0) {
         class417.method10710(Statics.field6046, Statics.field7262, Statics.field2775, arg1, Statics.field9102);
      }

   }

   @deob.ObfuscatedName("vh.p(I)V")
   public static void method15481() {
      class644.method10852();
      class417.method10644();
      method9259();
      method6270();
   }

   @deob.ObfuscatedName("mf.o(S)V")
   public static void method9259() {
      if (Statics.field9102 != null) {
         Statics.field9102.method9294();
      }

      if (Statics.field2063 != null) {
         Statics.field2063.method9294();
      }

   }

   @deob.ObfuscatedName("dl.a(I)V")
   public static void method5481() {
      field6156 = new class678[50];
      field6150 = 0;
   }

   @deob.ObfuscatedName("gf.x(I)V")
   public static final void method6623() {
      method8528();

      for(int var0 = 0; var0 < field6150; ++var0) {
         class678 var1 = field6156[var0];
         boolean var2 = false;
         if (var1.field6174 == null) {
            --var1.field6167;
            if (var1.field6167 >= (var1.method9951() ? -1500 : -10)) {
               if (var1.field6168 == 1 && var1.field6171 == null) {
                  var1.field6171 = class660.method9661(Statics.field2775, var1.field6165, 0);
                  if (var1.field6171 == null) {
                     continue;
                  }

                  var1.field6167 += var1.field6171.method9668();
               } else if (var1.method9951() && (var1.field6169 == null || var1.field6173 == null)) {
                  if (var1.field6169 == null) {
                     var1.field6169 = class86.method1171(Statics.field7262, var1.field6165);
                  }

                  if (var1.field6169 == null) {
                     continue;
                  }

                  if (var1.field6173 == null) {
                     var1.field6173 = var1.field6169.method1200();
                     if (var1.field6173 == null) {
                        continue;
                     }
                  }
               }

               if (var1.field6167 < 0) {
                  int var3 = 8192;
                  int var13;
                  if (var1.field6164 != 0) {
                     int var4 = var1.field6164 >> 24 & 3;
                     if (Statics.field5701.field1032 == var4) {
                        int var5 = (var1.field6164 & 255) << 9;
                        int var6 = Statics.field5701.method96() << 8;
                        class584 var7 = Statics.field5701.method11602().field5446;
                        int var8 = var1.field6164 >> 16 & 255;
                        int var9 = (var8 << 9) + 256 - (int)var7.field5328 + var6;
                        int var10 = var1.field6164 >> 8 & 255;
                        int var11 = (var10 << 9) + 256 - (int)var7.field5331 + var6;
                        int var12 = Math.abs(var9) + Math.abs(var11) - 512;
                        if (var12 > var5) {
                           var1.field6167 = -99999;
                           continue;
                        }

                        if (var12 < 0) {
                           var12 = 0;
                        }

                        var13 = (var5 - var12) * Statics.field9361.field985.method2319() * var1.field6172 / var5 >> 2;
                        if (var1.field6175 != -1) {
                           int var14 = var1.field6175;
                           int var15 = var1.field6176;
                        }

                        if (var9 != 0 || var11 != 0) {
                           int var16 = -Statics.field7098 - (int)(Math.atan2((double)var9, (double)var11) * 2607.5945876176133D) - 4096 & 16383;
                           if (var16 > 8192) {
                              var16 = 16384 - var16;
                           }

                           int var17;
                           if (var12 <= 0) {
                              var17 = 8192;
                           } else if (var12 >= 4096) {
                              var17 = 16384;
                           } else {
                              var17 = (8192 - var12) / 4096 + 8192;
                           }

                           var3 = (16384 - var17 >> 1) + var16 * var17 / 8192;
                        }
                     } else {
                        var13 = 0;
                     }
                  } else {
                     var13 = var1.field6172 * (var1.field6168 == 3 ? Statics.field9361.field969.method2319() : Statics.field9361.field984.method2319()) >> 2;
                  }

                  if (var13 > 0) {
                     if (var1.field6168 == 1) {
                        Object var18 = null;
                        class302 var19 = var1.field6171.method9662().method3889(Statics.field10564);
                        var1.field6174 = var19.method3111(var1.field6170, var13, var3);
                     } else if (var1.method9951()) {
                        var1.field6174 = var1.field6173.method3111(var1.field6170, var13, var3);
                     }

                     var1.field6174.method3313(var1.field6166 - 1);
                     Statics.field1029.method3107(var1.field6174);
                  }
               }
            } else {
               var2 = true;
            }
         } else if (!var1.field6174.method9863()) {
            var2 = true;
         }

         if (var2) {
            --field6150;

            for(int var20 = var0; var20 < field6150; ++var20) {
               field6156[var20] = field6156[var20 + 1];
            }

            --var0;
         }
      }

      if (field6153 && !class417.method5407()) {
         if (Statics.field9361.field987.method2319() != 0 && field6149 != -1) {
            if (Statics.field6775 != null) {
               class417.method761(Statics.field6467, field6149, 0, Statics.field9361.field987.method2319(), false, Statics.field6775);
            } else {
               class417.method15349(Statics.field6467, field6149, 0, Statics.field9361.field987.method2319(), false);
            }
         }

         field6153 = false;
         Statics.field6775 = null;
      } else if (Statics.field9361.field987.method2319() != 0 && field6149 != -1 && !class417.method5407()) {
         class109 var21 = class109.method15110(class558.field4800, client.field2463.field832);
         var21.field814.method1572(field6149);
         client.field2463.method1408(var21);
         field6149 = -1;
      }

   }

   @deob.ObfuscatedName("z.s(Lsh;ILaex;B)V")
   public static void method17035(class806 arg0, int arg1, class134 arg2) {
      if (field6150 < 50) {
         if (arg0 != null && arg0.field8375 != null && arg1 < arg0.field8375.length && arg0.field8375[arg1] != null) {
            if (Statics.field5701.field1032 == arg2.field1032) {
               int var3 = arg0.field8375[arg1][0];
               int var4 = var3 >> 8;
               int var5 = var3 >> 5 & 7;
               int var6 = var3 & 31;
               if (arg0.field8375[arg1].length > 1) {
                  int var7 = (int)(Math.random() * (double)arg0.field8375[arg1].length);
                  if (var7 > 0) {
                     var4 = arg0.field8375[arg1][var7];
                  }
               }

               int var8 = 256;
               if (arg0.field8373 != null && arg0.field8376 != null) {
                  var8 = (int)(Math.random() * (double)(arg0.field8376[arg1] - arg0.field8373[arg1])) + arg0.field8373[arg1];
               }

               int var9 = arg0.field8359 == null ? 255 : arg0.field8359[arg1];
               if (var6 == 0) {
                  if (Statics.field5701 == arg2) {
                     if (arg0.field8367) {
                        method6230(var4, var5, 0, var9, false, var8);
                     } else {
                        method1342(var4, var5, 0, var9, var8);
                     }
                  }

               } else {
                  if (Statics.field5701 == arg2) {
                     if (Statics.field9361.field984.method2319() == 0) {
                        return;
                     }
                  } else if (Statics.field9361.field985.method2319() == 0) {
                     return;
                  }

                  if (arg0.field8378 != -1) {
                     int var10 = 0;
                     if (arg2 instanceof class4) {
                        var10 = ((class4)arg2).method138();
                     } else if (arg2 instanceof class301) {
                        var10 = ((class301)arg2).method3869();
                     } else if (arg2 instanceof class312) {
                        var10 = ((class312)arg2).method3919();
                     }

                     if (var10 != 0 && var10 != Statics.field5701.method138() && client.field2406 != var10) {
                        var9 = arg0.field8378 * var9 / 100;
                        if (var9 < 0) {
                           var9 = 0;
                        } else if (var9 > 255) {
                           var9 = 255;
                        }
                     }
                  }

                  class584 var11 = arg2.method11602().field5446;
                  int var12 = (int)var11.field5328 - 256 >> 9;
                  int var13 = (int)var11.field5331 - 256 >> 9;
                  int var14 = Statics.field5701 == arg2 ? 0 : (var13 << 8) + (arg2.field1032 << 24) + (var12 << 16) + var6;
                  field6156[++field6150 - 1] = new class678((byte)(arg0.field8367 ? 2 : 1), var4, var5, 0, var9, var14, var8, arg2);
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("cn.l(Lsh;II)V")
   public static void method5042(class806 arg0, int arg1) {
      if (field6150 < 50) {
         if (arg0 != null && arg0.field8375 != null && arg1 < arg0.field8375.length && arg0.field8375[arg1] != null) {
            int var2 = arg0.field8375[arg1][0];
            int var3 = var2 >> 8;
            int var4 = var2 >> 5 & 7;
            if (arg0.field8375[arg1].length > 1) {
               int var5 = (int)(Math.random() * (double)arg0.field8375[arg1].length);
               if (var5 > 0) {
                  var3 = arg0.field8375[arg1][var5];
               }
            }

            int var6 = 256;
            if (arg0.field8373 != null && arg0.field8376 != null) {
               var6 = method8032(arg0.field8373[arg1], arg0.field8376[arg1]);
            }

            int var7 = arg0.field8359 == null ? 255 : arg0.field8359[arg1];
            if (arg0.field8367) {
               method6230(var3, var4, 0, var7, false, var6);
            } else {
               method1342(var3, var4, 0, var7, var6);
            }

         }
      }
   }

   @deob.ObfuscatedName("adp.u(IIIIIB)Lno;")
   public static class678 method1342(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (Statics.field9361.field984.method2319() != 0 && arg1 != 0 && field6150 < 50 && arg0 != -1) {
         class678 var5 = new class678((byte)1, arg0, arg1, arg2, arg3, 0, arg4, (class134)null);
         field6156[++field6150 - 1] = var5;
         return var5;
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("rg.v(IIIIIIB)Lno;")
   public static class678 method11674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (Statics.field9361.field984.method2319() != 0 && arg1 != 0 && field6150 < 50 && arg0 != -1) {
         class678 var6 = new class678((byte)1, arg0, arg1, arg2, arg3, arg4, arg5, (class134)null);
         field6156[++field6150 - 1] = var6;
         return var6;
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("fd.g(IIIIZII)Lno;")
   public static class678 method6230(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
      if ((arg4 ? Statics.field9361.field969.method2319() : Statics.field9361.field984.method2319()) != 0 && arg1 != 0 && field6150 < 50 && arg0 != -1) {
         class678 var6 = new class678((byte)(arg4 ? 3 : 2), arg0, arg1, arg2, arg3, 0, arg5, (class134)null);
         field6156[++field6150 - 1] = var6;
         return var6;
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("lg.h(IIIIIZII)Lno;")
   public static class678 method8892(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
      if ((arg5 ? Statics.field9361.field969.method2319() : Statics.field9361.field984.method2319()) != 0 && arg1 != 0 && field6150 < 50 && arg0 != -1) {
         class678 var7 = new class678((byte)(arg5 ? 3 : 2), arg0, arg1, arg2, arg3, arg4, arg6, (class134)null);
         field6156[++field6150 - 1] = var7;
         return var7;
      } else {
         return null;
      }
   }

   @deob.ObfuscatedName("ai.e(IIIIIIII)V")
   public static void method2952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      method5269(arg5, arg6, 100);
      field6158 = new class683(arg0, arg1 << 9, arg2 << 9, arg3 << 8, arg4 * 8);
   }

   @deob.ObfuscatedName("fj.z(I)V")
   private static void method6270() {
      if (field6152 != null) {
         class584 var0 = class584.method8135(Statics.field5701.method11602().field5446);
         class723 var1 = client.field2468.method9649();
         var0.field5328 += (float)(var1.field6676 << 9);
         var0.field5331 += (float)(var1.field6677 << 9);
         var0.method8151((float)field6152.field6195, var0.field5330, (float)field6152.field6192);
         float var2 = var0.method8157();
         var0.method8201();
         float var3 = 0.0F;
         float var4;
         if (var2 < (float)field6152.field6191) {
            var4 = 1.0F;
         } else if (var2 > (float)field6152.field6194) {
            var4 = 0.0F;
         } else {
            float var5 = var2 - (float)field6152.field6191;
            var4 = 1.0F - var5 / (float)field6152.field6193;
         }

         Statics.method14817((int)(var4 * 256.0F));
      }

   }

   @deob.ObfuscatedName("tn.m(I)V")
   private static void method14812() {
      if (field6152 != null) {
         field6152 = null;
         Statics.method14817(256);
      }

   }

   @deob.ObfuscatedName("cz.i(IIII)V")
   public static void method5269(int arg0, int arg1, int arg2) {
      if (Statics.field6155 != null && Statics.field6155.method5946() && Statics.field6155.field3587 == arg0) {
         method6478(Statics.field6155, arg1);
         field6149 = arg0;
         Statics.field6155 = null;
         Statics.field6775 = null;
         class109 var3 = class109.method15110(class558.field4841, client.field2463.field832);
         var3.field814.method1572(-1);
         client.field2463.method1408(var3);
      } else {
         int var4 = arg1 * Statics.field9361.field987.method2319() >> 8;
         if (arg0 == -1 && !field6153) {
            Statics.method1797();
         } else if (arg0 != -1 && (field6149 != arg0 || !class417.method5407()) && var4 != 0 && !field6153) {
            class417.method7326(arg2, Statics.field6467, arg0, 0, var4, false, new class23());
            method8735();
         }

         if (field6149 != arg0) {
            Statics.field6775 = null;
         }

         field6149 = arg0;
         field6158 = null;
      }

   }

   @deob.ObfuscatedName("fq.t(Ler;IB)V")
   public static void method6478(class430 arg0, int arg1) {
      int var2 = arg1 * Statics.field9361.field987.method2319() >> 8;
      if (arg0 == null) {
         Statics.method1797();
      } else {
         class417.method5209(arg0, var2);
         method14812();
      }
   }

   @deob.ObfuscatedName("dg.c(IIII)V")
   public static void method5390(int arg0, int arg1, int arg2) {
      int var3 = arg2 * Statics.field9361.field987.method2319() >> 8;
      if (var3 != 0 && arg0 != -1) {
         if (!field6153 && field6149 != -1 && class417.method5407() && !class417.method11104()) {
            Statics.field6775 = class417.method10656();
            method14812();
            class221 var4 = method8051(Statics.field6775);
            method14062(true, var4);
         }

         class417.method15349(Statics.field3965, arg0, 0, var3, false);
         class417.method15865(-1, 255);
         field6153 = true;
      }

   }

   @deob.ObfuscatedName("jw.w(IIB)I")
   public static int method8032(int arg0, int arg1) {
      double var2 = Math.log((double)arg1) / Math.log(2.0D);
      double var4 = Math.log((double)arg0) / Math.log(2.0D);
      double var6 = Math.random() * (var2 - var4) + var4;
      return (int)(Math.pow(2.0D, var6) + 0.5D);
   }

   @deob.ObfuscatedName("me.y(Lno;I)V")
   public static void method9251(class678 arg0) {
      if (arg0.field6174 != null) {
         Statics.field1029.method3091(arg0.field6174);
      } else {
         arg0.field6167 = Integer.MIN_VALUE;
      }

   }

   @deob.ObfuscatedName("l.j(S)V")
   public static void method8735() {
      class417.method15865(-1, 255);
   }

   @deob.ObfuscatedName("gj.f(III)V")
   public static void method6642(int arg0, int arg1) {
      class417.method15865(arg0, arg1);
   }

   @deob.ObfuscatedName("eq.ai(IB)V")
   public static void method5942(int arg0) {
      class109 var1 = class109.method15110(class558.field4841, client.field2463.field832);
      var1.field814.method1572(-1);
      client.field2463.method1408(var1);
      Statics.field6155 = new class430(Statics.field6467, arg0);
   }

   @deob.ObfuscatedName("kq.ap(I)V")
   private static void method8528() {
      if (Statics.field6155 != null && !Statics.field6155.method5946() && Statics.field6155.method5954()) {
         class109 var0 = class109.method15110(class558.field4841, client.field2463.field832);
         var0.field814.method1572(Statics.field6155.field3587);
         client.field2463.method1408(var0);
      }

   }
}
