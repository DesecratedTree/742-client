import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@deob.ObfuscatedName("ao")
public class class319 {
   @deob.ObfuscatedName("ao.r")
   private static int field1988 = 0;
   @deob.ObfuscatedName("ao.p")
   private static int field1983 = 0;
   @deob.ObfuscatedName("ao.o")
   public static String field1984 = "";
   @deob.ObfuscatedName("ao.a")
   private static int field1991 = 0;
   @deob.ObfuscatedName("ao.x")
   public static int field1986 = 0;
   @deob.ObfuscatedName("ao.s")
   private static int field1982 = 0;
   @deob.ObfuscatedName("ao.l")
   private static boolean field1989 = false;
   @deob.ObfuscatedName("ao.v")
   public static int field1985 = -1;

   private class319() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("qw.k(B)V")
   public static void method11427() {
      if (Statics.method10666()) {
         if (Statics.field1987 == null) {
            Statics.method14382();
         }

         field1989 = true;
         field1982 = 0;
      }

   }

   @deob.ObfuscatedName("acz.b(I)V")
   public static void method1138() {
      field1989 = false;
      client.method208();
   }

   @deob.ObfuscatedName("ais.r(I)V")
   public static void method3346() {
      if (Statics.field5808 != null) {
         try {
            Statics.field5808.close();
         } catch (IOException var1) {
         }
      }

      Statics.field5808 = null;
   }

   @deob.ObfuscatedName("lr.p(B)Z")
   public static boolean method9100() {
      return field1989;
   }

   @deob.ObfuscatedName("lr.a(I)V")
   public static void method9099() {
      if (field1982 < 102) {
         field1982 += 6;
      }

      if (field1985 != -1 && Statics.field10611 < class431.method2169()) {
         for(int var0 = field1985; var0 < Statics.field526.length; ++var0) {
            if (Statics.field526[var0].startsWith("pause")) {
               int var1 = 5;

               try {
                  var1 = Integer.parseInt(Statics.field526[var0].substring(6));
               } catch (Exception var14) {
               }

               method10037("Pausing for " + var1 + " seconds...");
               field1985 = var0 + 1;
               Statics.field10611 = class431.method2169() + (long)(var1 * 1000);
               return;
            }

            field1984 = Statics.field526[var0];
            method10930(false);
         }

         field1985 = -1;
      }

      if (client.field2718 != 0) {
         field1983 -= client.field2718 * 5;
         if (field1983 >= field1988) {
            field1983 = field1988 - 1;
         }

         if (field1983 < 0) {
            field1983 = 0;
         }

         client.field2718 = 0;
      }

      for(int var3 = 0; var3 < client.field2437; ++var3) {
         class708 var4 = client.field2438[var3];
         int var5 = var4.method1297();
         char var6 = var4.method1296();
         int var7 = var4.method1299();
         if (var5 == 84) {
            method10930(false);
         }

         if (var5 == 80) {
            method10930(true);
         } else if (var5 == 66 && (var7 & 4) != 0) {
            if (Statics.field991 != null) {
               String var8 = "";

               for(int var9 = Statics.field1987.length - 1; var9 >= 0; --var9) {
                  if (Statics.field1987[var9] != null && Statics.field1987[var9].length() > 0) {
                     var8 = var8 + Statics.field1987[var9] + '\n';
                  }
               }

               Statics.field991.setContents(new StringSelection(var8), (ClipboardOwner)null);
            }
         } else if (var5 == 67 && (var7 & 4) != 0) {
            if (Statics.field991 != null) {
               try {
                  Transferable var10 = Statics.field991.getContents((Object)null);
                  if (var10 != null) {
                     String var11 = (String)var10.getTransferData(DataFlavor.stringFlavor);
                     if (var11 != null) {
                        String[] var12 = Statics.method14220(var11, '\n');
                        Statics.method4084(var12);
                     }
                  }
               } catch (Exception var15) {
               }
            }
         } else if (var5 == 85 && field1986 > 0) {
            field1984 = field1984.substring(0, field1986 - 1) + field1984.substring(field1986);
            --field1986;
         } else if (var5 == 101 && field1986 < field1984.length()) {
            field1984 = field1984.substring(0, field1986) + field1984.substring(field1986 + 1);
         } else if (var5 == 96 && field1986 > 0) {
            --field1986;
         } else if (var5 == 97 && field1986 < field1984.length()) {
            ++field1986;
         } else if (var5 == 102) {
            field1986 = 0;
         } else if (var5 == 103) {
            field1986 = field1984.length();
         } else if (var5 == 104 && field1991 < Statics.field1987.length) {
            ++field1991;
            method15484();
            field1986 = field1984.length();
         } else if (var5 == 105 && field1991 > 0) {
            --field1991;
            method15484();
            field1986 = field1984.length();
         } else if (class816.method5270(var6) || "\\/.:, _-+[]~@".indexOf(var6) != -1) {
            field1984 = field1984.substring(0, field1986) + client.field2438[var3].method1296() + field1984.substring(field1986);
            ++field1986;
         }
      }

      client.field2437 = 0;
      client.field2458 = 0;
      client.method208();
   }

   @deob.ObfuscatedName("vi.x(B)V")
   private static void method15484() {
      if (field1991 > 0) {
         int var0 = 0;

         for(int var1 = 0; var1 < Statics.field1987.length; ++var1) {
            if (Statics.field1987[var1].indexOf("--> ") != -1) {
               ++var0;
               if (field1991 == var0) {
                  field1984 = Statics.field1987[var1].substring(Statics.field1987[var1].indexOf(62) + 2);
                  break;
               }
            }
         }
      } else {
         field1984 = "";
      }

   }

   @deob.ObfuscatedName("g.s(Ljava/lang/String;I)V")
   public static void method6571(String arg0) {
      field1984 = arg0;
      field1986 = field1984.length();
   }

   @deob.ObfuscatedName("pu.l(ZI)V")
   public static void method10930(boolean arg0) {
      field1984 = field1984.trim();
      if (field1984.length() != 0) {
         method10037("--> " + field1984);
         method8552(field1984, false, arg0);
         field1991 = 0;
         if (!arg0) {
            field1986 = 0;
            field1984 = "";
         } else {
            field1986 = field1984.length();
         }

      }
   }

   @deob.ObfuscatedName("nw.u(Ljava/lang/String;B)V")
   public static void method10037(String arg0) {
      if (Statics.field1987 == null) {
         Statics.method14382();
      }

      client.field2702.setTime(new Date(class431.method2169()));
      int var1 = client.field2702.get(11);
      int var2 = client.field2702.get(12);
      int var3 = client.field2702.get(13);
      String var4 = Integer.toString(var1 / 10) + var1 % 10 + ":" + var2 / 10 + var2 % 10 + ":" + var3 / 10 + var3 % 10;
      String[] var5 = Statics.method14220(arg0, '\n');

      for(int var6 = 0; var6 < var5.length; ++var6) {
         for(int var7 = field1988; var7 > 0; --var7) {
            Statics.field1987[var7] = Statics.field1987[var7 - 1];
         }

         Statics.field1987[0] = var4 + ": " + var5[var6];
         if (Statics.field5808 != null) {
            try {
               Statics.field5808.write(class813.method6450(Statics.field1987[0] + "\n"));
            } catch (IOException var9) {
            }
         }

         if (field1988 < Statics.field1987.length - 1) {
            ++field1988;
            if (field1983 > 0) {
               ++field1983;
            }
         }
      }

   }

   @deob.ObfuscatedName("aah.v(Lra;I)V")
   public static void method274(class772 arg0) {
      arg0.method7716(0, 0, Statics.field6104, 350);
      arg0.method7513(0, 0, Statics.field6104, 350, field1982 << 24 | 3351159, 1);
      int var1 = 350 / Statics.field1980;
      if (field1988 > 0) {
         int var2 = 346 - Statics.field1980 - 4;
         int var3 = var1 * var2 / (field1988 + var1 - 1);
         int var4 = 4;
         if (field1988 > 1) {
            var4 += (field1988 - 1 - field1983) * (var2 - var3) / (field1988 - 1);
         }

         arg0.method7513(Statics.field6104 - 16, var4, 12, var3, field1982 << 24 | 3351159, 2);

         for(int var5 = field1983; var5 < field1983 + var1 && var5 < field1988; ++var5) {
            String[] var6 = Statics.method14220(Statics.field1987[var5], '\b');
            int var7 = (Statics.field6104 - 8 - 16) / var6.length;

            for(int var8 = 0; var8 < var6.length; ++var8) {
               int var9 = var7 * var8 + 8;
               arg0.method7716(var9, 0, var7 + var9 - 8, 350);
               Statics.field6177.method8709(method15971(var6[var8]), var9, 350 - Statics.field1979 - 2 - Statics.field7094.field9062 - Statics.field1980 * (var5 - field1983), -1, -16777216);
            }
         }
      }

      Statics.field5483.method8711("742 1", Statics.field6104 - 25, 330, -1, -16777216);
      arg0.method7716(0, 0, Statics.field6104, 350);
      arg0.method11493(0, 350 - Statics.field1979, Statics.field6104, -1);
      Statics.field7095.method8709("--> " + method15971(field1984), 10, 350 - Statics.field1855.field9062 - 1, -1, -16777216);
      if (Statics.field6857) {
         int var10 = -1;
         if (client.field2418 % 30 > 15) {
            var10 = 16777215;
         }

         arg0.method11506(10 + Statics.field1855.method15384("--> " + method15971(field1984).substring(0, field1986)), 350 - Statics.field1855.field9062 - 11, 12, var10);
      }

      arg0.method7508();
      Statics.method461();
   }

   @deob.ObfuscatedName("xa.g(Ljava/lang/String;B)Ljava/lang/String;")
   private static String method15971(String arg0) {
      String var1 = null;
      int var2 = arg0.indexOf("--> ");
      if (var2 >= 0) {
         var1 = arg0.substring(0, var2 + 4);
         arg0 = arg0.substring(var2 + 4);
      }

      if (arg0.startsWith("directlogin ")) {
         int var3 = arg0.indexOf(" ", "directlogin ".length());
         if (var3 >= 0) {
            int var4 = arg0.length();
            arg0 = arg0.substring(0, var3) + " ";

            for(int var5 = var3 + 1; var5 < var4; ++var5) {
               arg0 = arg0 + "*";
            }
         }
      }

      return var1 != null ? var1 + arg0 : arg0;
   }

   @deob.ObfuscatedName("ks.e(Ljava/lang/String;ZZB)V")
   public static void method8552(String arg0, boolean arg1, boolean arg2) {
      try {
         if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
            method10037("commands - This command");
            method10037("cls - Clear console");
            method10037("displayfps - Toggle FPS and other information");
            method10037("renderer - Print graphics renderer information");
            method10037("heap - Print java memory information");
            method10037("getcamerapos - Print location and direction of camera for use in bug reports");
            return;
         }

         if (arg0.equalsIgnoreCase("cls")) {
            field1988 = 0;
            field1983 = 0;
            return;
         }

         if (arg0.equalsIgnoreCase("displayfps")) {
            client.field2665 = !client.field2665;
            if (client.field2665) {
               method10037("FPS on");
            } else {
               method10037("FPS off");
            }

            return;
         }

         if (arg0.equals("renderer")) {
            class384 var3 = Statics.field8847.method2505();
            method10037("Toolkit ID: " + Statics.field9361.field974.method2236());
            method10037("Vendor: " + var3.field2781);
            method10037("Name: " + var3.field2782);
            method10037("Version: " + var3.field2783);
            method10037("Device: " + var3.field2784);
            method10037("Driver Version: " + var3.field2785);
            return;
         }

         if (arg0.equals("heap")) {
            method10037("Heap: " + class671.field6130 + "MB");
            return;
         }

         if (arg0.equalsIgnoreCase("getcamerapos")) {
            class723 var4 = client.field2468.method9649();
            method10037("Pos: " + Statics.field5701.field1032 + "," + ((Statics.field337 >> 9) + var4.field6676 >> 6) + "," + ((Statics.field3115 >> 9) + var4.field6677 >> 6) + "," + ((Statics.field337 >> 9) + var4.field6676 & 63) + "," + ((Statics.field3115 >> 9) + var4.field6677 & 63) + " Height: " + (client.method5777(Statics.field337, Statics.field3115, Statics.field5701.field1032) - Statics.field6719));
            method10037("Look: " + Statics.field5701.field1032 + "," + (Statics.field262 + var4.field6676 >> 6) + "," + (Statics.field8651 + var4.field6677 >> 6) + "," + (Statics.field262 + var4.field6676 & 63) + "," + (Statics.field8651 + var4.field6677 & 63) + " Height: " + (client.method5777(Statics.field262, Statics.field8651, Statics.field5701.field1032) - Statics.field3823));
            return;
         }
      } catch (Exception var33) {
         method10037(class881.field8886.method15374(Statics.field243));
         return;
      }

      if (class819.field8428 != Statics.field4896 || client.field2562 >= 2) {
         try {
            if (arg0.equalsIgnoreCase("wm1")) {
               client.method10176(1, -1, -1, false);
               if (client.method10038() == 1) {
                  method10037("Success");
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (arg0.equalsIgnoreCase("wm2")) {
               client.method10176(2, -1, -1, false);
               if (client.method10038() == 2) {
                  method10037("Success");
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (class854.field8745 && arg0.equalsIgnoreCase("wm3")) {
               client.method10176(3, 1024, 768, false);
               if (client.method10038() == 3) {
                  method10037("Success");
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (arg0.startsWith("setlobby ")) {
               int var6 = -1;
               Object var7 = null;
               String var8 = arg0.substring(9);
               int var9 = var8.indexOf(32);
               if (var9 == -1) {
                  method10037("Failure");
                  return;
               }

               try {
                  var6 = Integer.parseInt(var8.substring(0, var9));
               } catch (NumberFormatException var29) {
               }

               if (var6 == -1) {
                  method10037("Failure");
                  return;
               }

               String var11 = var8.substring(var9 + 1).trim() + ".runescape.com";
               class861.method451(var11, var6);
               method10037("Success");
               return;
            }

            if (arg0.equalsIgnoreCase("tk0")) {
               client.method5788(0, false);
               if (Statics.field9361.field974.method2236() == 0) {
                  method10037("Success");
                  Statics.field9361.method1857(Statics.field9361.field979, 0);
                  class29.method7336();
                  client.field2419 = false;
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (arg0.equalsIgnoreCase("tk1")) {
               client.method5788(1, false);
               if (Statics.field9361.field974.method2236() == 1) {
                  method10037("Success");
                  Statics.field9361.method1857(Statics.field9361.field979, 1);
                  class29.method7336();
                  client.field2419 = false;
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (arg0.equalsIgnoreCase("tk2")) {
               client.method5788(2, false);
               if (Statics.field9361.field974.method2236() == 2) {
                  method10037("Success");
                  Statics.field9361.method1857(Statics.field9361.field979, 2);
                  class29.method7336();
                  client.field2419 = false;
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (arg0.equalsIgnoreCase("tk3")) {
               client.method5788(3, false);
               if (Statics.field9361.field974.method2236() == 3) {
                  method10037("Success");
                  Statics.field9361.method1857(Statics.field9361.field979, 3);
                  class29.method7336();
                  client.field2419 = false;
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (arg0.equalsIgnoreCase("tk5")) {
               client.method5788(5, false);
               if (Statics.field9361.field974.method2236() == 5) {
                  method10037("Success");
                  Statics.field9361.method1857(Statics.field9361.field979, 5);
                  class29.method7336();
                  client.field2419 = false;
               } else {
                  method10037("Failure");
               }

               return;
            }

            if (arg0.equalsIgnoreCase("clientdrop")) {
               if (client.field2410 == 1) {
                  client.method248();
               } else if (client.field2410 == 16) {
                  client.field2463.field840 = true;
               }

               return;
            }

            if (arg0.equalsIgnoreCase("breakcon")) {
               class110[] var12 = client.field2464;

               for(int var13 = 0; var13 < var12.length; ++var13) {
                  class110 var14 = var12[var13];
                  if (var14.method1413() != null) {
                     var14.method1413().method1534();
                  }
               }

               Statics.field9401.method674();
               return;
            }

            if (arg0.startsWith("getclientvarpbit")) {
               int var15 = Integer.parseInt(arg0.substring(17));
               method10037("varpbit=" + Statics.field10637.method5490(var15));
               return;
            }

            if (arg0.startsWith("getclientvarp")) {
               int var16 = Integer.parseInt(arg0.substring(14));
               method10037("varp=" + Statics.field10637.method5491(var16));
               return;
            }

            if (arg0.startsWith("directlogin")) {
               String[] var17 = Statics.method14220(arg0.substring(12), ' ');
               if (var17.length == 2) {
                  class385.method8022(var17[0], var17[1]);
               }

               return;
            }

            if (arg0.startsWith("snlogin ")) {
               String[] var18 = Statics.method14220(arg0.substring(8), ' ');
               int var19 = Integer.parseInt(var18[0]);
               class385.method15760(var19);
               return;
            }

            if (arg0.startsWith("setoutput ")) {
               File var20 = new File(arg0.substring(10));
               if (var20.exists()) {
                  var20 = new File(arg0.substring(10) + "." + class431.method2169() + ".log");
                  if (var20.exists()) {
                     method10037("file already exists!");
                     return;
                  }
               }

               if (Statics.field5808 != null) {
                  Statics.field5808.close();
                  Statics.field5808 = null;
               }

               try {
                  Statics.field5808 = new FileOutputStream(var20);
                  return;
               } catch (FileNotFoundException var30) {
                  method10037("Could not create " + var20.getName());
                  return;
               } catch (SecurityException var31) {
                  method10037("Cannot write to " + var20.getName());
                  return;
               }
            }

            if (arg0.equals("closeoutput")) {
               if (Statics.field5808 != null) {
                  Statics.field5808.close();
               }

               Statics.field5808 = null;
               return;
            }

            if (arg0.startsWith("runscript ")) {
               File var23 = new File(arg0.substring(10));
               if (!var23.exists()) {
                  method10037("No such file");
                  return;
               }

               byte[] var24 = Statics.method485(var23);
               if (var24 == null) {
                  method10037("Failed to read file");
                  return;
               }

               String[] var25 = Statics.method14220(class816.method14128(class813.method664(var24), '\r', ""), '\n');
               Statics.method4084(var25);
            }

            if (client.field2410 == 1 || client.field2410 == 15) {
               class110 var26 = Statics.method8951();
               class109 var27 = class109.method15110(class558.field4849, var26.field832);
               var27.field814.method1568(arg0.length() + 3);
               var27.field814.method1568(arg1 ? 1 : 0);
               var27.field814.method1568(arg2 ? 1 : 0);
               var27.field814.method1577(arg0);
               var26.method1408(var27);
            }
         } catch (Exception var32) {
            method10037(class881.field8886.method15374(Statics.field243));
            return;
         }
      }

      if (client.field2410 != 1 && client.field2410 != 15) {
         method10037(class881.field8887.method15374(Statics.field243) + arg0);
      }

   }

   @deob.ObfuscatedName("ra.z(II)V")
   public static void method11576(int arg0) {
      if (arg0 == 7) {
         throw new Error();
      } else if (arg0 == 2) {
         throw new OutOfMemoryError();
      } else {
         try {
            if (arg0 == 25) {
               method1138();
            } else if (arg0 == 9) {
               method10037("" + class671.field6099);
            } else if (arg0 == 19) {
               class709 var1 = client.field2468.method9639().field6566;
               var1.field6516 = !var1.field6516;
            } else if (arg0 == 29) {
               client.field2665 = true;
            } else if (arg0 == 15) {
               client.field2665 = false;
            } else if (arg0 == 16) {
               client.field2590.method14794();
            } else if (arg0 == 4) {
               client.method5685();

               for(int var2 = 0; var2 < 10; ++var2) {
                  System.gc();
               }

               Runtime var3 = Runtime.getRuntime();
               int var4 = (int)((var3.totalMemory() - var3.freeMemory()) / 1024L);
               method10037("" + var4);
            } else if (arg0 == 6) {
               client.method5685();

               for(int var5 = 0; var5 < 10; ++var5) {
                  System.gc();
               }

               Runtime var6 = Runtime.getRuntime();
               int var7 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
               method10037("" + var7);
               class318.method8926();
               client.method5685();

               for(int var8 = 0; var8 < 10; ++var8) {
                  System.gc();
               }

               int var9 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
               method10037("" + var9);
            } else if (arg0 == 24) {
               method10037(Statics.field3855.method9975() ? "Success" : "Failure");
            } else if (arg0 == 13) {
               Statics.field8789.method15276();
            } else if (arg0 == 14) {
               Statics.field9401.method673();
            } else if (arg0 == 21) {
               Statics.field9401.method672();
            } else if (arg0 == 11) {
               Statics.field5796.setLocation(50, 50);
            } else if (arg0 == 17) {
               Statics.field5796.setLocation(class671.field6105, class671.field6119);
            } else if (arg0 == 8) {
               Statics.method9395();
            } else if (arg0 == 28) {
               client.field2468.field6045 = class431.method2169();
               client.field2468.field6011 = true;
               Statics.method9395();
            } else if (arg0 == 22) {
               class584 var10 = Statics.field5701.method11602().field5446;
               method10037(((int)var10.field5328 >> 9) + " " + ((int)var10.field5331 >> 9));
            } else if (arg0 == 26) {
               class584 var11 = Statics.field5701.method11602().field5446;
               method10037("" + client.field2468.method9639().field6580[Statics.field5701.field1032].method15966((int)var11.field5328 >> 9, (int)var11.field5331 >> 9));
            } else if (arg0 == 1) {
               method10037(class425.field3393.method10885() + " " + class425.field3393.method10884());
               method10037(class425.field3501.method10885() + " " + class425.field3501.method10884());
               method10037(Statics.field4196.field9091.method11359() + " " + Statics.field4196.field9091.method11350());
            } else if (arg0 == 10) {
               client.method14300(false);
            } else {
               if (arg0 == 27) {
                  client.field2503 = !client.field2503;
                  Statics.field8847.method2506(client.field2503);
                  Statics.method15483();
                  return;
               }

               if (arg0 == 23) {
                  client.field2412 = 0;
                  client.field2468.method9531();
               } else if (arg0 == 20) {
                  client.field2412 = 1;
                  client.field2468.method9531();
               } else if (arg0 == 5) {
                  client.field2412 = 2;
                  client.field2468.method9531();
               }
            }

         } catch (Exception var13) {
            method10037(class881.field8886.method15374(Statics.field243));
         }
      }
   }
}
