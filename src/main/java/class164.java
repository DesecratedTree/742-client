@deob.ObfuscatedName("ag")
public class class164 {
   @deob.ObfuscatedName("ag.a")
   public int field1151 = -1;
   @deob.ObfuscatedName("ag.l")
   private static class737 field1158 = new class737(4);
   @deob.ObfuscatedName("ag.x")
   public int field1148;
   @deob.ObfuscatedName("ag.s")
   public int field1149;
   @deob.ObfuscatedName("ag.d")
   public int field1150;
   @deob.ObfuscatedName("ag.r")
   public int field1152;
   @deob.ObfuscatedName("ag.k")
   public int field1153;
   @deob.ObfuscatedName("ag.o")
   public int field1154;
   @deob.ObfuscatedName("ag.p")
   public int field1155;
   @deob.ObfuscatedName("ag.n")
   public int field1156;
   @deob.ObfuscatedName("ag.b")
   public int field1157;

   @deob.ObfuscatedName("lp.n(Lra;IIIIII)Lqa;")
   public static class745 method9073(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      long var6 = (long)arg5;
      class745 var8 = (class745)field1158.method10909(var6);
      short var9 = 2055;
      if (var8 == null) {
         class396 var10 = class396.method5419(Statics.field8828, arg5, 0);
         if (var10 == null) {
            return null;
         }

         if (var10.field2934 < 13) {
            var10.method5427(2);
         }

         var8 = arg0.method7528(var10, var9, Statics.field1159, 64, 768);
         field1158.method10880(var8, var6);
      }

      class745 var11 = var8.method6914((byte)6, var9, true);
      if (arg1 != 0) {
         var11.method7008(arg1);
      }

      if (arg2 != 0) {
         var11.method6921(arg2);
      }

      if (arg3 != 0) {
         var11.method6999(arg3);
      }

      if (arg4 != 0) {
         var11.method7078(0, arg4, 0);
      }

      return var11;
   }

   @deob.ObfuscatedName("fq.k(II)V")
   public static void method6476(int arg0) {
      Statics.field1159 = arg0;
      field1158.method10883();
   }

   @deob.ObfuscatedName("vj.d(I)V")
   public static void method15493() {
      field1158.method10883();
   }

   @deob.ObfuscatedName("kf.b(II)V")
   public static void method8284(int arg0) {
      field1158.method10882(arg0);
   }

   @deob.ObfuscatedName("nd.r(B)V")
   public static void method9726() {
      field1158.method10887();
   }
}
