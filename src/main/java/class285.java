import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@deob.ObfuscatedName("akm")
public class class285 extends RuntimeException {
   @deob.ObfuscatedName("akm.p")
   private String field1850;
   @deob.ObfuscatedName("akm.o")
   private Throwable field1856;

   private class285(Throwable arg0, String arg1) {
      this.field1850 = arg1;
      this.field1856 = arg0;
      this.initCause(arg0);
   }

   @deob.ObfuscatedName("wm.n(Ljava/lang/String;Ljava/lang/Throwable;I)V")
   public static void method15864(String arg0, Throwable arg1) {
      try {
         String var2 = "";
         if (arg1 != null) {
            var2 = method1563(arg1);
         }

         if (arg0 != null) {
            if (arg1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + arg0;
         }

         method3426(var2);
         String var3 = class943.method15733(var2);
         if (Statics.field1851 == null) {
            return;
         }

         String var4 = "Unknown";
         String var5 = "1.1";

         try {
            var4 = System.getProperty("java.vendor");
            var5 = System.getProperty("java.version");
         } catch (Exception var10) {
         }

         URL var7 = new URL(Statics.field1851.getCodeBase(), "clienterror.ws?c=" + Statics.field1852 + "&cs=" + Statics.field1853 + "&u=" + (Statics.field1854 != null ? class943.method15733(Statics.field1854) : "" + Statics.field1857) + "&v1=" + class943.method15733(var4) + "&v2=" + class943.method15733(var5) + "&e=" + var3);
         DataInputStream var8 = new DataInputStream(var7.openStream());
         var8.read();
         var8.close();
      } catch (Exception var11) {
         var11.printStackTrace();
      }

   }

   @deob.ObfuscatedName("uu.k(Ljava/lang/Throwable;Ljava/lang/String;)Lakm;")
   public static class285 method15290(Throwable arg0, String arg1) {
      class285 var2;
      if (arg0 instanceof class285) {
         var2 = (class285)arg0;
         var2.field1850 = var2.field1850 + ' ' + arg1;
      } else {
         var2 = new class285(arg0, arg1);
      }

      return var2;
   }

   @deob.ObfuscatedName("ael.d(Ljava/lang/Throwable;I)Ljava/lang/String;")
   private static String method1563(Throwable arg0) throws IOException {
      String var2;
      if (arg0 instanceof class285) {
         class285 var1 = (class285)arg0;
         var2 = var1.field1850 + " | ";
         arg0 = var1.field1856;
      } else {
         var2 = "";
      }

      StringWriter var3 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var3);
      arg0.printStackTrace(var4);
      var4.close();
      String var5 = var3.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         String var8 = var6.readLine();
         if (var8 == null) {
            return var2 + "| " + var7;
         }

         int var10 = var8.indexOf(40);
         int var11 = var8.indexOf(41, var10 + 1);
         String var12;
         if (var10 != -1) {
            var12 = var8.substring(0, var10);
         } else {
            var12 = var8;
         }

         String var13 = var12.trim();
         String var14 = var13.substring(var13.lastIndexOf(32) + 1);
         String var15 = var14.substring(var14.lastIndexOf(9) + 1);
         String var16 = var2 + var15;
         if (var10 != -1 && var11 != -1) {
            int var17 = var8.indexOf(".java:", var10);
            if (var17 >= 0) {
               var16 = var16 + var8.substring(var17 + 5, var11);
            }
         }

         var2 = var16 + ' ';
      }
   }

   @deob.ObfuscatedName("ajg.b(Ljava/lang/String;B)V")
   private static final void method3426(String arg0) {
      System.out.println("Error: " + method2223(arg0, "%0a", "\n"));
   }

   @deob.ObfuscatedName("afu.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
   private static final String method2223(String arg0, String arg1, String arg2) {
      for(int var3 = arg0.indexOf(arg1); var3 != -1; var3 = arg0.indexOf(arg1, var3 + arg2.length())) {
         arg0 = arg0.substring(0, var3) + arg2 + arg0.substring(var3 + arg1.length());
      }

      return arg0;
   }
}
