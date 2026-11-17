@deob.ObfuscatedName("ei")
public class class421 {
   @deob.ObfuscatedName("ei.n")
   public static final class421 field3291 = new class421(0, "", false, false);
   @deob.ObfuscatedName("ei.k")
   public static final class421 field3263 = new class421(1, "", false, false);
   @deob.ObfuscatedName("ei.d")
   public static final class421 field3264 = new class421(2, "", true, false);
   @deob.ObfuscatedName("ei.b")
   public static final class421 field3265 = new class421(3, "", true, false);
   @deob.ObfuscatedName("ei.r")
   public static final class421 field3266 = new class421(4, "", false, false);
   @deob.ObfuscatedName("ei.p")
   public static final class421 field3301 = new class421(5, "", false, false);
   @deob.ObfuscatedName("ei.o")
   public static final class421 field3268 = new class421(6, "", false, false);
   @deob.ObfuscatedName("ei.a")
   public static final class421 field3269 = new class421(7, "", false, false);
   @deob.ObfuscatedName("ei.x")
   public static final class421 field3270 = new class421(8, "", false, false);
   @deob.ObfuscatedName("ei.s")
   public static final class421 field3299 = new class421(9, "", false, false);
   @deob.ObfuscatedName("ei.l")
   public static final class421 field3272 = new class421(10, "", false, false);
   @deob.ObfuscatedName("ei.u")
   public static final class421 field3283 = new class421(11, "", false, false);
   @deob.ObfuscatedName("ei.v")
   public static final class421 field3274 = new class421(12, "", false, false);
   @deob.ObfuscatedName("ei.g")
   public static final class421 field3275 = new class421(13, "", false, false);
   @deob.ObfuscatedName("ei.h")
   public static final class421 field3276 = new class421(14, "", false, false);
   @deob.ObfuscatedName("ei.e")
   public static final class421 field3277 = new class421(15, "", false, false);
   @deob.ObfuscatedName("ei.z")
   public static final class421 field3278 = new class421(16, "", true, false);
   @deob.ObfuscatedName("ei.m")
   public static final class421 field3279 = new class421(17, "", true, false);
   @deob.ObfuscatedName("ei.i")
   public static final class421 field3280 = new class421(18, "", true, false);
   @deob.ObfuscatedName("ei.t")
   public static final class421 field3281 = new class421(19, "", true, false);
   @deob.ObfuscatedName("ei.c")
   public static final class421 field3267 = new class421(20, "", true, false);
   @deob.ObfuscatedName("ei.w")
   public static final class421 field3262 = new class421(21, "", true, false);
   @deob.ObfuscatedName("ei.q")
   public static final class421 field3284 = new class421(22, "", true, false);
   @deob.ObfuscatedName("ei.y")
   public static final class421 field3285 = new class421(23, "", true, false);
   @deob.ObfuscatedName("ei.j")
   public static final class421 field3300 = new class421(24, "", true, false);
   @deob.ObfuscatedName("ei.f")
   public static final class421 field3287 = new class421(25, "", true, false);
   @deob.ObfuscatedName("ei.ai")
   public static final class421 field3288 = new class421(26, "", false, false);
   @deob.ObfuscatedName("ei.ap")
   public static final class421 field3289 = new class421(27, "", false, false);
   @deob.ObfuscatedName("ei.av")
   public static final class421 field3290 = new class421(28, "", false, false);
   @deob.ObfuscatedName("ei.ax")
   public static final class421 field3282 = new class421(29, "", false, false);
   @deob.ObfuscatedName("ei.af")
   public static final class421 field3292 = new class421(30, "", false, false);
   @deob.ObfuscatedName("ei.at")
   public static final class421 field3286 = new class421(31, "", false, false);
   @deob.ObfuscatedName("ei.ah")
   public static final class421 field3273 = new class421(32, "", false, false);
   @deob.ObfuscatedName("ei.aw")
   public static final class421 field3295 = new class421(33, "", false, false);
   @deob.ObfuscatedName("ei.al")
   public static final class421 field3296 = new class421(34, "", false, false);
   @deob.ObfuscatedName("ei.an")
   public static final class421 field3297 = new class421(35, "", true, false);
   @deob.ObfuscatedName("ei.ag")
   public static final class421 field3298 = new class421(36, "", false, false);
   @deob.ObfuscatedName("ei.ak")
   public static final class421 field3293 = new class421(37, "", false, false);
   @deob.ObfuscatedName("ei.ao")
   private static int field3271 = -1;
   @deob.ObfuscatedName("ei.aa")
   private final int field3294;

   private class421(int arg0, String arg1, boolean arg2, boolean arg3) {
      this.field3294 = arg0;
   }

   @deob.ObfuscatedName("ei.k(I)I")
   public int method5782() {
      return this.field3294;
   }

   @deob.ObfuscatedName("dt.d(I)I")
   public static int method5520() {
      if (field3271 == -1) {
         class421[] var0 = Statics.method7942();

         for(int var1 = 0; var1 < var0.length; ++var1) {
            class421 var2 = var0[var1];
            if (var2.field3294 > field3271) {
               field3271 = var2.field3294;
            }
         }

         ++field3271;
      }

      return field3271;
   }
}
