@deob.ObfuscatedName("kb")
public class class584 {
   @deob.ObfuscatedName("kb.n")
   private static class584[] field5329;
   @deob.ObfuscatedName("kb.b")
   public float field5328;
   @deob.ObfuscatedName("kb.r")
   public float field5330;
   @deob.ObfuscatedName("kb.p")
   public float field5331;

   static {
      new class584(0.0F, 0.0F, 0.0F);
      field5329 = new class584[0];
   }

   @deob.ObfuscatedName("kb.n(I)V")
   public static void method8138(int arg0) {
      Statics.field5327 = arg0;
      field5329 = new class584[arg0];
      Statics.field5326 = 0;
   }

   @deob.ObfuscatedName("kb.k()Lkb;")
   public static class584 method8133() {
      class584[] var0 = field5329;
      synchronized(field5329) {
         if (Statics.field5326 == 0) {
            return new class584();
         } else {
            field5329[--Statics.field5326].method8143();
            return field5329[Statics.field5326];
         }
      }
   }

   @deob.ObfuscatedName("kb.d(FFF)Lkb;")
   public static class584 method8136(float arg0, float arg1, float arg2) {
      class584[] var3 = field5329;
      synchronized(field5329) {
         if (Statics.field5326 == 0) {
            return new class584(arg0, arg1, arg2);
         } else {
            field5329[--Statics.field5326].method8141(arg0, arg1, arg2);
            return field5329[Statics.field5326];
         }
      }
   }

   @deob.ObfuscatedName("kb.b(Lkb;)Lkb;")
   public static class584 method8135(class584 arg0) {
      class584[] var1 = field5329;
      synchronized(field5329) {
         if (Statics.field5326 == 0) {
            return new class584(arg0);
         } else {
            field5329[--Statics.field5326].method8177(arg0);
            return field5329[Statics.field5326];
         }
      }
   }

   @deob.ObfuscatedName("kb.r()V")
   public void method8201() {
      class584[] var1 = field5329;
      synchronized(field5329) {
         if (Statics.field5326 < Statics.field5327 - 1) {
            field5329[Statics.field5326++] = this;
         }

      }
   }

   public class584() {
   }

   public class584(float arg0, float arg1, float arg2) {
      this.field5328 = arg0;
      this.field5330 = arg1;
      this.field5331 = arg2;
   }

   private class584(class584 arg0) {
      this.field5328 = arg0.field5328;
      this.field5330 = arg0.field5330;
      this.field5331 = arg0.field5331;
   }

   public class584(class124 arg0) {
      this.field5328 = arg0.method1660();
      this.field5330 = arg0.method1660();
      this.field5331 = arg0.method1660();
   }

   @deob.ObfuscatedName("kb.p(Laen;)V")
   public void method8140(class124 arg0) {
      this.field5328 = arg0.method1660();
      this.field5330 = arg0.method1660();
      this.field5331 = arg0.method1660();
   }

   @deob.ObfuscatedName("kb.o(FFF)V")
   public void method8141(float arg0, float arg1, float arg2) {
      this.field5328 = arg0;
      this.field5330 = arg1;
      this.field5331 = arg2;
   }

   @deob.ObfuscatedName("kb.a(Lkb;)V")
   public void method8177(class584 arg0) {
      this.method8141(arg0.field5328, arg0.field5330, arg0.field5331);
   }

   @deob.ObfuscatedName("kb.x()V")
   public final void method8143() {
      this.field5331 = 0.0F;
      this.field5330 = 0.0F;
      this.field5328 = 0.0F;
   }

   @deob.ObfuscatedName("kb.s(Lkb;)Z")
   public boolean method8144(class584 arg0) {
      return this.field5328 == arg0.field5328 && this.field5330 == arg0.field5330 && this.field5331 == arg0.field5331;
   }

   @deob.ObfuscatedName("kb.l()V")
   public final void method8228() {
      this.field5328 = -this.field5328;
      this.field5330 = -this.field5330;
      this.field5331 = -this.field5331;
   }

   @deob.ObfuscatedName("kb.u()V")
   public final void method8146() {
      float var1 = 1.0F / this.method8157();
      this.field5328 *= var1;
      this.field5330 *= var1;
      this.field5331 *= var1;
   }

   @deob.ObfuscatedName("kb.v(Lkb;)V")
   public final void method8147(class584 arg0) {
      this.field5328 += arg0.field5328;
      this.field5330 += arg0.field5330;
      this.field5331 += arg0.field5331;
   }

   @deob.ObfuscatedName("kb.g(Lkb;F)V")
   public final void method8148(class584 arg0, float arg1) {
      this.field5328 += arg0.field5328 * arg1;
      this.field5330 += arg0.field5330 * arg1;
      this.field5331 += arg0.field5331 * arg1;
   }

   @deob.ObfuscatedName("kb.h(Lkb;Lkb;)Lkb;")
   public static final class584 method8149(class584 arg0, class584 arg1) {
      class584 var2 = method8135(arg0);
      var2.method8147(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kb.e(Lkb;)V")
   private final void method8153(class584 arg0) {
      this.field5328 -= arg0.field5328;
      this.field5330 -= arg0.field5330;
      this.field5331 -= arg0.field5331;
   }

   @deob.ObfuscatedName("kb.z(FFF)V")
   public final void method8151(float arg0, float arg1, float arg2) {
      this.field5328 -= arg0;
      this.field5330 -= arg1;
      this.field5331 -= arg2;
   }

   @deob.ObfuscatedName("kb.m(Lkb;Lkb;)Lkb;")
   public static final class584 method8152(class584 arg0, class584 arg1) {
      class584 var2 = method8135(arg0);
      var2.method8153(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kb.i(Lkb;)F")
   public final float method8231(class584 arg0) {
      return this.field5331 * arg0.field5331 + this.field5330 * arg0.field5330 + this.field5328 * arg0.field5328;
   }

   @deob.ObfuscatedName("kb.t(Lkb;Lkb;)F")
   public static final float method8154(class584 arg0, class584 arg1) {
      return arg0.method8231(arg1);
   }

   @deob.ObfuscatedName("kb.c(Lkb;)V")
   private final void method8155(class584 arg0) {
      this.method8141(this.field5330 * arg0.field5331 - this.field5331 * arg0.field5330, this.field5331 * arg0.field5328 - this.field5328 * arg0.field5331, this.field5328 * arg0.field5330 - this.field5330 * arg0.field5328);
   }

   @deob.ObfuscatedName("kb.w(Lkb;Lkb;)Lkb;")
   public static final class584 method8156(class584 arg0, class584 arg1) {
      class584 var2 = method8135(arg0);
      var2.method8155(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kb.q()F")
   public final float method8157() {
      return (float)Math.sqrt((double)(this.field5331 * this.field5331 + this.field5330 * this.field5330 + this.field5328 * this.field5328));
   }

   @deob.ObfuscatedName("kb.y()V")
   public final void method8195() {
      if (this.field5328 < 0.0F) {
         this.field5328 *= -1.0F;
      }

      if (this.field5330 < 0.0F) {
         this.field5330 *= -1.0F;
      }

      if (this.field5331 < 0.0F) {
         this.field5331 *= -1.0F;
      }

   }

   @deob.ObfuscatedName("kb.j(Lkb;)V")
   private final void method8166(class584 arg0) {
      this.field5328 *= arg0.field5328;
      this.field5330 *= arg0.field5330;
      this.field5331 *= arg0.field5331;
   }

   @deob.ObfuscatedName("kb.f(Lkb;Lkb;)Lkb;")
   public static final class584 method8160(class584 arg0, class584 arg1) {
      class584 var2 = method8135(arg0);
      var2.method8166(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kb.ai(F)V")
   public final void method8161(float arg0) {
      this.field5328 *= arg0;
      this.field5330 *= arg0;
      this.field5331 *= arg0;
   }

   @deob.ObfuscatedName("kb.ap(Lkb;)V")
   private final void method8162(class584 arg0) {
      this.field5328 /= arg0.field5328;
      this.field5330 /= arg0.field5330;
      this.field5331 /= arg0.field5331;
   }

   @deob.ObfuscatedName("kb.av(Lkb;Lkb;)Lkb;")
   public static final class584 method8212(class584 arg0, class584 arg1) {
      class584 var2 = method8135(arg0);
      var2.method8162(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kb.ax(F)V")
   public final void method8164(float arg0) {
      this.field5328 /= arg0;
      this.field5330 /= arg0;
      this.field5331 /= arg0;
   }

   @deob.ObfuscatedName("kb.af(Lkb;F)Lkb;")
   public static final class584 method8165(class584 arg0, float arg1) {
      class584 var2 = method8135(arg0);
      var2.method8161(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kb.at(Lkx;)V")
   public final void method8150(class606 arg0) {
      class606 var2 = class606.method8607(this.field5328, this.field5330, this.field5331, 0.0F);
      class606 var3 = class606.method8617(arg0);
      class606 var4 = class606.method8623(var3, var2);
      var4.method8622(arg0);
      this.method8141(var4.field5478, var4.field5475, var4.field5480);
      var2.method8654();
      var3.method8654();
      var4.method8654();
   }

   @deob.ObfuscatedName("kb.ah(Lka;)V")
   public final void method8167(class583 arg0) {
      float var2 = this.field5328;
      float var3 = this.field5330;
      this.field5328 = this.field5331 * arg0.field5320 + arg0.field5314 * var2 + arg0.field5313 * var3 + arg0.field5323;
      this.field5330 = this.field5331 * arg0.field5322 + arg0.field5318 * var3 + arg0.field5315 * var2 + arg0.field5316;
      this.field5331 = this.field5331 * arg0.field5324 + arg0.field5321 * var2 + arg0.field5319 * var3 + arg0.field5317;
   }

   @deob.ObfuscatedName("kb.aw(Lka;)V")
   public final void method8168(class583 arg0) {
      float var2 = this.field5328;
      float var3 = this.field5330;
      this.field5328 = this.field5331 * arg0.field5320 + arg0.field5314 * var2 + arg0.field5313 * var3;
      this.field5330 = this.field5331 * arg0.field5322 + arg0.field5318 * var3 + arg0.field5315 * var2;
      this.field5331 = this.field5331 * arg0.field5324 + arg0.field5321 * var2 + arg0.field5319 * var3;
   }

   @deob.ObfuscatedName("kb.al(Lkb;F)V")
   public final void method8169(class584 arg0, float arg1) {
      this.method8161(1.0F - arg1);
      this.method8147(method8165(arg0, arg1));
   }

   public String toString() {
      return this.field5328 + ", " + this.field5330 + ", " + this.field5331;
   }
}
