import java.awt.Point;

@deob.ObfuscatedName("vd")
public class class883 {
   @deob.ObfuscatedName("vd.p")
   private static String[] field9057 = new String[100];
   @deob.ObfuscatedName("vd.n")
   private byte[] field9060;
   @deob.ObfuscatedName("vd.k")
   private byte[][] field9058;
   @deob.ObfuscatedName("vd.d")
   public int field9059;
   @deob.ObfuscatedName("vd.b")
   public int field9061;
   @deob.ObfuscatedName("vd.r")
   public int field9062;

   @deob.ObfuscatedName("aew.n(Llc;III)Lvd;")
   public static class883 method2003(class612 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method8771(arg1, arg2);
      return var3 == null ? null : new class883(var3);
   }

   @deob.ObfuscatedName("jb.k(Llc;II)Lvd;")
   public static class883 method7898(class612 arg0, int arg1) {
      byte[] var2 = arg0.method8809(arg1);
      return var2 == null ? null : new class883(var2);
   }

   private class883(byte[] arg0) {
      class124 var2 = new class124(arg0);
      int var3 = var2.method1688();
      if (var3 != 0) {
         throw new RuntimeException("");
      } else {
         boolean var4 = var2.method1688() == 1;
         this.field9060 = new byte[256];
         var2.method1602(this.field9060, 0, 256);
         if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];

            for(int var7 = 0; var7 < 256; ++var7) {
               var5[var7] = var2.method1688();
            }

            for(int var8 = 0; var8 < 256; ++var8) {
               var6[var8] = var2.method1688();
            }

            byte[][] var9 = new byte[256][];

            for(int var10 = 0; var10 < 256; ++var10) {
               var9[var10] = new byte[var5[var10]];
               byte var11 = 0;

               for(int var12 = 0; var12 < var9[var10].length; ++var12) {
                  var11 += var2.method1623();
                  var9[var10][var12] = var11;
               }
            }

            byte[][] var13 = new byte[256][];

            for(int var14 = 0; var14 < 256; ++var14) {
               var13[var14] = new byte[var5[var14]];
               byte var15 = 0;

               for(int var16 = 0; var16 < var13[var14].length; ++var16) {
                  var15 += var2.method1623();
                  var13[var14][var16] = var15;
               }
            }

            this.field9058 = new byte[256][256];

            for(int var17 = 0; var17 < 256; ++var17) {
               if (var17 != 32 && var17 != 160) {
                  for(int var18 = 0; var18 < 256; ++var18) {
                     if (var18 != 32 && var18 != 160) {
                        this.field9058[var17][var18] = (byte)method10651(var9, var13, var6, this.field9060, var5, var17, var18);
                     }
                  }
               }
            }

            this.field9059 = var5[32] + var6[32];
         } else {
            this.field9059 = var2.method1688();
         }

         var2.method1688();
         var2.method1688();
         this.field9061 = var2.method1688();
         this.field9062 = var2.method1688();
      }
   }

   @deob.ObfuscatedName("oy.d([[B[[B[I[B[IIII)I")
   private static int method10651(byte[][] arg0, byte[][] arg1, int[] arg2, byte[] arg3, int[] arg4, int arg5, int arg6) {
      int var7 = arg2[arg5];
      int var8 = arg4[arg5] + var7;
      int var9 = arg2[arg6];
      int var10 = arg4[arg6] + var9;
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = arg3[arg5] & 255;
      if ((arg3[arg6] & 255) < var13) {
         var13 = arg3[arg6] & 255;
      }

      byte[] var14 = arg1[arg5];
      byte[] var15 = arg0[arg6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @deob.ObfuscatedName("vd.b(ICS)I")
   public int method15382(int arg0, char arg1) {
      return this.field9058 != null ? this.field9058[arg0][arg1] : 0;
   }

   @deob.ObfuscatedName("vd.r(II)I")
   public int method15383(int arg0) {
      return this.field9060[arg0] & 255;
   }

   @deob.ObfuscatedName("vd.p(Ljava/lang/String;I)I")
   public int method15384(String arg0) {
      return this.method15393(arg0, (class894[])null);
   }

   @deob.ObfuscatedName("vd.o(Ljava/lang/String;[Lvo;I)I")
   public int method15393(String arg0, class894[] arg1) {
      if (arg0 == null) {
         return 0;
      } else {
         int var3 = -1;
         int var4 = -1;
         int var5 = 0;
         int var6 = arg0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = arg0.charAt(var7);
            if (var8 == '<') {
               var3 = var7;
            } else {
               if (var8 == '>' && var3 != -1) {
                  String var9 = arg0.substring(var3 + 1, var7);
                  var3 = -1;
                  if (var9.equals("lt")) {
                     var8 = '<';
                  } else if (var9.equals("gt")) {
                     var8 = '>';
                  } else if (var9.equals("nbsp")) {
                     var8 = 160;
                  } else if (var9.equals("shy")) {
                     var8 = 173;
                  } else if (var9.equals("times")) {
                     var8 = 215;
                  } else if (var9.equals("euro")) {
                     var8 = 8364;
                  } else if (var9.equals("copy")) {
                     var8 = 169;
                  } else {
                     if (!var9.equals("reg")) {
                        if (var9.startsWith("img=") && arg1 != null) {
                           try {
                              int var10 = class816.method5626(var9.substring(4));
                              var5 += arg1[var10].method5259();
                              var4 = -1;
                           } catch (Exception var12) {
                           }
                        }
                        continue;
                     }

                     var8 = 174;
                  }
               }

               if (var3 == -1) {
                  var5 += this.field9060[class813.method9501(var8) & 255] & 255;
                  if (this.field9058 != null && var4 != -1) {
                     var5 += this.field9058[var4][var8];
                  }

                  var4 = var8;
               }
            }
         }

         return var5;
      }
   }

   @deob.ObfuscatedName("vd.a(Ljava/lang/String;I[Lvo;B)Ljava/lang/String;")
   public String method15386(String arg0, int arg1, class894[] arg2) {
      if (this.method15393(arg0, arg2) <= arg1) {
         return arg0;
      } else {
         int var4 = arg1 - this.method15393("...", (class894[])null);
         int var5 = -1;
         int var6 = -1;
         int var7 = 0;
         int var8 = arg0.length();
         String var9 = "";

         for(int var10 = 0; var10 < var8; ++var10) {
            char var11 = arg0.charAt(var10);
            if (var11 == '<') {
               var5 = var10;
            } else {
               if (var11 == '>' && var5 != -1) {
                  String var12 = arg0.substring(var5 + 1, var10);
                  var5 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else if (var12.equals("gt")) {
                     var11 = '>';
                  } else if (var12.equals("nbsp")) {
                     var11 = 160;
                  } else if (var12.equals("shy")) {
                     var11 = 173;
                  } else if (var12.equals("times")) {
                     var11 = 215;
                  } else if (var12.equals("euro")) {
                     var11 = 8364;
                  } else if (var12.equals("copy")) {
                     var11 = 169;
                  } else {
                     if (!var12.equals("reg")) {
                        if (var12.startsWith("img=") && arg2 != null) {
                           try {
                              int var13 = class816.method5626(var12.substring(4));
                              var7 += arg2[var13].method5259();
                              var6 = -1;
                              if (var7 > var4) {
                                 return var9 + "...";
                              }

                              var9 = arg0.substring(0, var10 + 1);
                           } catch (Exception var16) {
                           }
                        }
                        continue;
                     }

                     var11 = 174;
                  }
               }

               if (var5 == -1) {
                  var7 += this.field9060[class813.method9501(var11) & 255] & 255;
                  if (this.field9058 != null && var6 != -1) {
                     var7 += this.field9058[var6][var11];
                  }

                  var6 = var11;
                  int var15 = var7;
                  if (this.field9058 != null) {
                     var15 = this.field9058[var11][46] + var7;
                  }

                  if (var15 > var4) {
                     return var9 + "...";
                  }

                  var9 = arg0.substring(0, var10 + 1);
               }
            }
         }

         return arg0;
      }
   }

   @deob.ObfuscatedName("vd.x(Ljava/lang/String;[I[Ljava/lang/String;[Lvo;B)I")
   public int method15400(String arg0, int[] arg1, String[] arg2, class894[] arg3) {
      return this.method15381(arg0, arg1, arg2, arg3, true);
   }

   @deob.ObfuscatedName("vd.s(Ljava/lang/String;[I[Ljava/lang/String;[Lvo;ZI)I")
   private int method15381(String arg0, int[] arg1, String[] arg2, class894[] arg3, boolean arg4) {
      if (arg0 == null) {
         return 0;
      } else {
         int var6 = 0;
         int var7 = 0;
         int var8 = -1;
         int var9 = 0;
         int var10 = 0;
         int var11 = -1;
         int var12 = -1;
         int var13 = 0;
         int var14 = arg0.length();

         for(int var15 = 0; var15 < var14; ++var15) {
            int var16 = class813.method9501(arg0.charAt(var15)) & 255;
            int var17 = 0;
            if (var16 == 60) {
               var11 = var15;
            } else {
               int var18;
               if (var11 != -1) {
                  if (var16 != 62) {
                     continue;
                  }

                  var18 = var11;
                  String var19 = arg0.substring(var11 + 1, var15);
                  var11 = -1;
                  if (var19.equals("br")) {
                     arg2[var13] = arg0.substring(var7, var15 + 1);
                     ++var13;
                     if (var13 >= arg2.length) {
                        return 0;
                     }

                     var7 = var15 + 1;
                     var6 = 0;
                     var8 = -1;
                     var12 = -1;
                     continue;
                  }

                  if (var19.equals("lt")) {
                     var17 += this.method15383(60);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][60];
                     }

                     var12 = 60;
                  } else if (var19.equals("gt")) {
                     var17 += this.method15383(62);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][62];
                     }

                     var12 = 62;
                  } else if (var19.equals("nbsp")) {
                     var17 += this.method15383(160);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][160];
                     }

                     var12 = 160;
                  } else if (var19.equals("shy")) {
                     var17 += this.method15383(173);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][173];
                     }

                     var12 = 173;
                  } else if (var19.equals("times")) {
                     var17 += this.method15383(215);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][215];
                     }

                     var12 = 215;
                  } else if (var19.equals("euro")) {
                     var17 += this.method15383(8364);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][8364];
                     }

                     var12 = 8364;
                  } else if (var19.equals("copy")) {
                     var17 += this.method15383(169);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][169];
                     }

                     var12 = 169;
                  } else if (var19.equals("reg")) {
                     var17 += this.method15383(174);
                     if (this.field9058 != null && var12 != -1) {
                        var17 += this.field9058[var12][174];
                     }

                     var12 = 174;
                  } else if (var19.startsWith("img=") && arg3 != null) {
                     try {
                        int var20 = class816.method5626(var19.substring(4));
                        var17 += arg3[var20].method5259();
                        var12 = -1;
                     } catch (Exception var22) {
                     }
                  }

                  var16 = -1;
               } else {
                  var18 = var15;
                  var17 += this.method15383(var16);
                  if (this.field9058 != null && var12 != -1) {
                     var17 += this.field9058[var12][var16];
                  }

                  var12 = var16;
               }

               if (var17 > 0) {
                  var6 += var17;
                  if (arg1 != null) {
                     if (var16 == 32) {
                        var8 = var15;
                        var9 = var6;
                        var10 = arg4 ? 1 : 0;
                     }

                     if (var6 > arg1[var13 < arg1.length ? var13 : arg1.length - 1]) {
                        if (var8 >= 0) {
                           arg2[var13] = arg0.substring(var7, var8 + 1 - var10);
                           ++var13;
                           if (var13 >= arg2.length) {
                              return 0;
                           }

                           var7 = var8 + 1;
                           var8 = -1;
                           var6 -= var9;
                           var12 = -1;
                        } else {
                           arg2[var13] = arg0.substring(var7, var18);
                           ++var13;
                           if (var13 >= arg2.length) {
                              return 0;
                           }

                           var7 = var18;
                           var8 = -1;
                           var6 = var17;
                           var12 = -1;
                        }
                     }

                     if (var16 == 45) {
                        var8 = var15;
                        var9 = var6;
                        var10 = 0;
                     }
                  }
               }
            }
         }

         if (arg0.length() > var7) {
            arg2[var13] = arg0.substring(var7, arg0.length());
            ++var13;
         }

         return var13;
      }
   }

   @deob.ObfuscatedName("vd.l(Ljava/lang/String;I[Lvo;I)I")
   public int method15388(String arg0, int arg1, class894[] arg2) {
      int var4 = this.method15400(arg0, new int[]{arg1}, field9057, arg2);
      int var5 = 0;

      for(int var6 = 0; var6 < var4; ++var6) {
         int var7 = this.method15393(field9057[var6], arg2);
         if (var7 > var5) {
            var5 = var7;
         }
      }

      return var5;
   }

   @deob.ObfuscatedName("vd.u(Ljava/lang/String;I[Lvo;I)I")
   public int method15406(String arg0, int arg1, class894[] arg2) {
      return this.method15400(arg0, new int[]{arg1}, field9057, arg2);
   }

   @deob.ObfuscatedName("vd.v(Ljava/lang/String;II[Lvo;I)I")
   public int method15390(String arg0, int arg1, int arg2, class894[] arg3) {
      if (arg2 == 0) {
         arg2 = this.field9059;
      }

      int var5 = this.method15400(arg0, new int[]{arg1}, field9057, arg3);
      int var6 = (var5 - 1) * arg2;
      return this.field9062 + this.field9061 + var6;
   }

   @deob.ObfuscatedName("vd.g(Ljava/lang/String;III[Lvo;I)Ljava/awt/Point;")
   public Point method15422(String arg0, int arg1, int arg2, int arg3, class894[] arg4) {
      if (arg3 <= 0) {
         return new Point(0, this.field9061 + arg2);
      } else {
         if (arg3 > arg0.length()) {
            arg3 = arg0.length();
         }

         if (arg2 == 0) {
            arg2 = this.field9059;
         }

         int var6 = this.method15381(arg0, new int[]{arg1}, field9057, arg4, false);
         int var7 = 0;

         for(int var8 = 0; var8 < var6; ++var8) {
            int var9 = field9057[var8].length();
            if (var7 + var9 > arg3 || var6 - 1 == var8 && arg3 == arg0.length()) {
               String var10 = arg0.substring(var7, arg3);
               if (var10.endsWith("<br>")) {
                  var10 = "";
                  int var10000 = var7 + var9;
                  ++var8;
               }

               int var12 = this.method15393(var10, arg4);
               int var13 = this.field9061 + arg2 * var8;
               return new Point(var12, var13);
            }

            var7 += var9;
         }

         return null;
      }
   }

   @deob.ObfuscatedName("vd.h(Ljava/lang/String;IIII[Lvo;I)I")
   public int method15392(String arg0, int arg1, int arg2, int arg3, int arg4, class894[] arg5) {
      if (arg2 == 0) {
         arg2 = this.field9059;
      }

      int var7 = this.method15400(arg0, new int[]{arg1}, field9057, arg5);
      if (var7 == 0) {
         return 0;
      } else {
         if (arg4 < 0) {
            arg4 = 0;
         }

         int var8 = arg4 / arg2;
         if (var8 >= var7) {
            var8 = var7 - 1;
         }

         String var9 = field9057[var8];
         int var10 = 0;
         int var11 = 0;

         int var12;
         for(var12 = 0; var12 < arg3 && var10 < var9.length(); var12 = this.method15393(var9.substring(0, var10), arg5)) {
            var11 = var12;
            ++var10;
         }

         if (var10 == var9.length() && var9.endsWith("<br>")) {
            var10 -= 4;
         }

         if (arg3 - var11 < var12 - arg3) {
            --var10;
         }

         for(int var13 = 0; var13 < var8; ++var13) {
            var10 += field9057[var13].length();
         }

         return var10;
      }
   }
}
