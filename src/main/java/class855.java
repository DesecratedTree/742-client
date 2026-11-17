import java.applet.Applet;
import netscape.javascript.JSObject;

@deob.ObfuscatedName("uc")
public class class855 {
   private class855() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("uc.n(Ljava/applet/Applet;Ljava/lang/String;I)V")
   public static void method15071(Applet arg0, String arg1) throws Throwable {
      JSObject.getWindow(arg0).eval(arg1);
   }

   @deob.ObfuscatedName("uc.k(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
   public static Object method15072(Applet arg0, String arg1) throws Throwable {
      return JSObject.getWindow(arg0).call(arg1, (Object[])null);
   }

   @deob.ObfuscatedName("uc.d(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
   public static Object method15073(Applet arg0, String arg1, Object[] arg2) throws Throwable {
      return JSObject.getWindow(arg0).call(arg1, arg2);
   }
}
