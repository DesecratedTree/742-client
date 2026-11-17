import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

@deob.ObfuscatedName("ef")
public final class class418 {
   @deob.ObfuscatedName("ef.k")
   private static final HashMap field3128 = new HashMap();

   static {
      Calendar.getInstance(method5733("Europe/London"));
   }

   private class418() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ef.n(Ljava/util/Date;Ljava/lang/String;I)Ljava/lang/String;")
   public static String method5730(Date arg0, String arg1) {
      return method5739(arg0, arg1, method5732(), class823.field8446);
   }

   @deob.ObfuscatedName("ef.k(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lsy;I)Ljava/lang/String;")
   private static String method5739(Date arg0, String arg1, TimeZone arg2, class823 arg3) {
      if (Statics.field3129 == null) {
         Statics.field3129 = new HashMap(7);
         class823[] var4 = class823.method14539();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            class823 var6 = var4[var5];
            Statics.field3129.put(var6, new ConcurrentLinkedQueue());
         }
      }

      ConcurrentLinkedQueue var7 = (ConcurrentLinkedQueue)Statics.field3129.get(arg3);
      SimpleDateFormat var8 = (SimpleDateFormat)var7.poll();
      if (var8 == null) {
         var8 = new SimpleDateFormat(arg1, arg3.method14528());
      } else {
         var8.applyPattern(arg1);
      }

      var8.setTimeZone(arg2);
      String var9 = var8.format(arg0);
      var7.add(var8);
      return var9;
   }

   @deob.ObfuscatedName("ef.d(I)Ljava/util/TimeZone;")
   private static TimeZone method5732() {
      return method5733("Europe/London");
   }

   @deob.ObfuscatedName("ef.b(Ljava/lang/String;I)Ljava/util/TimeZone;")
   private static TimeZone method5733(String arg0) {
      HashMap var1 = field3128;
      synchronized(field3128) {
         TimeZone var2 = (TimeZone)field3128.get(arg0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(arg0);
            field3128.put(arg0, var2);
         }

         return var2;
      }
   }
}
