import java.util.Iterator;
import java.util.LinkedList;

@deob.ObfuscatedName("qt")
public class class764 {
   @deob.ObfuscatedName("qt.d")
   public static int field7015 = 0;
   @deob.ObfuscatedName("qt.b")
   public static int field7016 = 0;
   @deob.ObfuscatedName("qt.p")
   public static int field7022 = 0;
   @deob.ObfuscatedName("qt.o")
   public static int field7019 = 0;
   @deob.ObfuscatedName("qt.a")
   public static int field7021 = 0;
   @deob.ObfuscatedName("qt.x")
   public static int field7014 = 0;
   @deob.ObfuscatedName("qt.s")
   public static class875 field7020 = new class875(8);
   @deob.ObfuscatedName("qt.l")
   public static int field7023 = 0;
   @deob.ObfuscatedName("qt.u")
   public static int field7024 = 2;

   private class764() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ox.n(Llc;I)V")
   public static void method10641(class612 arg0) {
      field7015 = 0;
      field7016 = 0;
      Statics.field7018 = new LinkedList();
      Statics.field7013 = new class289[1024];
      Statics.field7017 = new class756[class390.field2878[field7024] + 1];
      field7022 = 0;
      field7019 = 0;
      class539.method7307(arg0);
      class537.method3351(arg0);
   }

   @deob.ObfuscatedName("zo.k(Lra;J)V")
   public static void method17074(class772 arg0, long arg1) {
      field7014 = field7021;
      field7021 = 0;
      class431.method2169();
      Iterator var3 = Statics.field7018.iterator();

      while(var3.hasNext()) {
         class756 var4 = (class756)var3.next();
         boolean var5 = var4.method11215(arg0, arg1);
         if (!var5) {
            var3.remove();
            Statics.field7017[field7019] = var4;
            field7019 = field7019 + 1 & class390.field2878[field7024];
         }
      }

   }

   @deob.ObfuscatedName("cv.d(Low;Lra;I)V")
   public static void method5203(class713 arg0, class772 arg1) {
      Iterator var2 = Statics.field7018.iterator();

      while(var2.hasNext()) {
         class756 var3 = (class756)var2.next();
         if (var3.field6972) {
            var3.method11216(arg0, arg1);
         }
      }

   }

   @deob.ObfuscatedName("ct.b(I)V")
   public static void method5156() {
      field7020 = new class875(8);
      field7023 = 0;
      Iterator var0 = Statics.field7018.iterator();

      while(var0.hasNext()) {
         class756 var1 = (class756)var0.next();
         var1.method11212();
      }

   }

   @deob.ObfuscatedName("su.r(IB)V")
   public static void method14492(int arg0) {
      if (arg0 < 0 || arg0 > 2) {
         arg0 = 0;
      }

      field7024 = arg0;
      Statics.field7017 = new class756[class390.field2878[field7024] + 1];
      field7022 = 0;
      field7019 = 0;
   }

   @deob.ObfuscatedName("ef.p(B)I")
   public static int method5741() {
      return field7024;
   }
}
