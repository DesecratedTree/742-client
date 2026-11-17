import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@deob.ObfuscatedName("nz")
public class class689 {
   private class689() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("abm.n(Ljava/lang/String;ZZZZI)V")
   public static void method690(String arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
      method8031(arg0, arg1, arg2, "openjs", arg3, arg4);
   }

   @deob.ObfuscatedName("jw.k(Ljava/lang/String;ZZLjava/lang/String;ZZI)V")
   public static void method8031(String arg0, boolean arg1, boolean arg2, String arg3, boolean arg4, boolean arg5) {
      if (arg1) {
         if (!arg4 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(arg0));
               return;
            } catch (Exception var7) {
            }
         }

         if (Statics.field6120.startsWith("win") && !arg4) {
            Statics.method14242(arg0, 0);
            return;
         }

         if (Statics.field6120.startsWith("mac")) {
            method7945(arg0, 1, arg3);
            return;
         }

         Statics.method14242(arg0, 2);
      } else {
         Statics.method14242(arg0, 3);
      }

   }

   @deob.ObfuscatedName("jh.b(Ljava/lang/String;ILjava/lang/String;S)Z")
   public static boolean method7945(String arg0, int arg1, String arg2) {
      if (arg1 == 0) {
         try {
            if (!Statics.field6120.startsWith("win")) {
               throw new Exception();
            } else if (!arg0.startsWith("http://") && !arg0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < arg0.length(); ++var4) {
                  if (var3.indexOf(arg0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
               return true;
            }
         } catch (Throwable var11) {
            return false;
         }
      } else if (arg1 == 1) {
         try {
            Object var6 = class855.method15073(Statics.field6978, arg2, new Object[]{(new URL(Statics.field6978.getCodeBase(), arg0)).toString()});
            return var6 != null;
         } catch (Throwable var12) {
            return false;
         }
      } else if (arg1 == 2) {
         try {
            Statics.field6978.getAppletContext().showDocument(new URL(Statics.field6978.getCodeBase(), arg0), "_blank");
            return true;
         } catch (Exception var13) {
            return false;
         }
      } else if (arg1 == 3) {
         try {
            class855.method15072(Statics.field6978, "loggedout");
         } catch (Throwable var15) {
         }

         try {
            Statics.field6978.getAppletContext().showDocument(new URL(Statics.field6978.getCodeBase(), arg0), "_top");
            return true;
         } catch (Exception var14) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
