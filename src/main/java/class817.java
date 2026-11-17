@deob.ObfuscatedName("ss")
public class class817 {
   @deob.ObfuscatedName("ss.k")
   private static class875 field8422 = new class875(4);
   @deob.ObfuscatedName("ss.d")
   private static final class799 field8423 = new class799();

   private class817() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ab.n(IIZI)V")
   public static void method486(int arg0, int arg1, boolean arg2) {
      if (field8422.method15322((long)arg0) == null) {
         if (!client.field2657) {
            Statics.method4441(arg0, arg2);
         } else {
            class94 var3 = new class94(arg0, new class130(4096, Statics.field7162, arg0), arg1, arg2);
            var3.field706.method10079(Statics.field243.method14526());
            field8422.method15311(var3, (long)arg0);
         }
      }

   }

   @deob.ObfuscatedName("dl.k(II)V")
   public static void method5482(int arg0) {
      class94 var1 = (class94)field8422.method15322((long)arg0);
      if (var1 != null) {
         var1.field707 = !var1.field707;
         var1.field706.method10074(var1.field707);
      }

   }

   @deob.ObfuscatedName("ky.d(IB)V")
   public static void method8682(int arg0) {
      class94 var1 = (class94)field8422.method15322((long)arg0);
      if (var1 != null) {
         var1.field706.method10073();
         Statics.method4441(var1.field710, var1.field709);
         var1.method9864();
      }

   }

   @deob.ObfuscatedName("ky.r(IB)Ljava/lang/String;")
   public static String method8681(int arg0) {
      class94 var1 = (class94)field8422.method15322((long)arg0);
      if (var1 != null) {
         class266 var2 = var1.field706.method10075();
         if (var2 != null) {
            double var3 = var1.field706.method10070();
            if ((double)var2.method3538() <= var3 && (double)var2.method3550() >= var3) {
               return var2.method3539();
            }
         }
      }

      return null;
   }

   @deob.ObfuscatedName("py.p(Lra;IS)Lcy;")
   public static class383 method10957(class772 arg0, int arg1) {
      class94 var2 = (class94)field8422.method15322((long)arg1);
      if (var2 != null) {
         class265 var3 = var2.field706.method10069();
         var2.field712 = true;
         if (var3 != null) {
            field8423.field7294 = arg0;
            return (class383)var3.method3521(field8423);
         }
      }

      return null;
   }

   @deob.ObfuscatedName("fw.o(B)V")
   public static void method6533() {
      for(class94 var0 = (class94)field8422.method15313(); var0 != null; var0 = (class94)field8422.method15314()) {
         if (var0.field706.method10072()) {
            method8682(var0.field710);
         } else {
            var0.field706.method1929();

            try {
               var0.field706.method10063();
            } catch (Exception var4) {
               class285.method15864("" + var0.field710, var4);
               method8682(var0.field710);
            }

            if (!var0.field711 && !var0.field707) {
               class259 var2 = var0.field706.method10071();
               if (var2 != null) {
                  class237 var3 = var2.method3484();
                  if (var3 != null) {
                     var3.method3327(var0.field708);
                     Statics.field1029.method3107(var3);
                     var0.field711 = true;
                  }
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ek.a(B)V")
   public static void method5796() {
      for(class94 var0 = (class94)field8422.method15313(); var0 != null; var0 = (class94)field8422.method15314()) {
         if (!var0.field712) {
            method8682(var0.field710);
         } else {
            var0.field712 = false;
         }
      }

   }

   @deob.ObfuscatedName("ms.x(I)V")
   public static void method9459() {
      for(class94 var0 = (class94)field8422.method15313(); var0 != null; var0 = (class94)field8422.method15314()) {
         method8682(var0.field710);
      }

   }
}
