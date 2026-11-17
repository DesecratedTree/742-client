import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@deob.ObfuscatedName("vw")
public class class902 {
   @deob.ObfuscatedName("vw.n")
   private static final String[][] field9224 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}};
   @deob.ObfuscatedName("vw.d")
   private static Calendar field9225 = Calendar.getInstance();
   @deob.ObfuscatedName("vw.b")
   public static Calendar field9226 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

   private class902() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ef.n(JIB)Ljava/lang/String;")
   public static String method5745(long arg0, int arg1) {
      method8345(arg0);
      int var3 = field9225.get(5);
      int var4 = field9225.get(2);
      int var5 = field9225.get(1);
      return arg1 == 3 ? method15564(arg0, arg1) : Integer.toString(var3 / 10) + var3 % 10 + "-" + field9224[arg1][var4] + "-" + var5;
   }

   @deob.ObfuscatedName("cb.k(JIZI)Ljava/lang/String;")
   public static String method4442(long arg0, int arg1, boolean arg2) {
      Calendar var4;
      if (arg2) {
         method10032(arg0);
         var4 = field9226;
      } else {
         method8345(arg0);
         var4 = field9225;
      }

      int var5 = var4.get(5);
      int var6 = var4.get(2);
      int var7 = var4.get(1);
      int var8 = var4.get(11);
      int var9 = var4.get(12);
      return arg1 == 3 ? method9265(arg0, arg1, arg2) : Integer.toString(var5 / 10) + var5 % 10 + "-" + field9224[arg1][var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
   }

   @deob.ObfuscatedName("mf.d(JIZI)Ljava/lang/String;")
   private static String method9265(long arg0, int arg1, boolean arg2) {
      Calendar var4;
      if (arg2) {
         method10032(arg0);
         var4 = field9226;
      } else {
         method8345(arg0);
         var4 = field9225;
      }

      int var5 = var4.get(5);
      int var6 = var4.get(2) + 1;
      int var7 = var4.get(1);
      int var8 = var4.get(11);
      int var9 = var4.get(12);
      return Integer.toString(var5 / 10) + var5 % 10 + "/" + var6 / 10 + var6 % 10 + "/" + var7 % 100 / 10 + var7 % 10 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
   }

   @deob.ObfuscatedName("vp.b(JII)Ljava/lang/String;")
   private static String method15564(long arg0, int arg1) {
      method8345(arg0);
      int var3 = field9225.get(5);
      int var4 = field9225.get(2) + 1;
      int var5 = field9225.get(1);
      return Integer.toString(var3 / 10) + var3 % 10 + "/" + var4 / 10 + var4 % 10 + "/" + var5 % 100 / 10 + var5 % 10;
   }

   @deob.ObfuscatedName("pz.r(J)I")
   public static int method10985(long arg0) {
      return (int)(arg0 / 86400000L) - 11745;
   }

   @deob.ObfuscatedName("nu.p(J)V")
   private static void method10032(long arg0) {
      field9226.setTime(new Date(arg0));
   }

   @deob.ObfuscatedName("ki.o(J)V")
   private static void method8345(long arg0) {
      field9225.setTime(new Date(arg0));
   }

   @deob.ObfuscatedName("tg.a(II)[I")
   public static int[] method14664(int arg0) {
      int[] var1 = new int[3];
      method8345(method9394(arg0));
      var1[0] = field9225.get(5);
      var1[1] = field9225.get(2);
      var1[2] = field9225.get(1);
      return var1;
   }

   @deob.ObfuscatedName("ml.s(II)J")
   public static long method9394(int arg0) {
      return (long)(arg0 + 11745) * 86400000L;
   }

   @deob.ObfuscatedName("mt.l(J)I")
   public static int method9493(long arg0) {
      method8345(arg0);
      return field9225.get(1);
   }
}
