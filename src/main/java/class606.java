@deob.ObfuscatedName("kx")
public final class class606 {
   @deob.ObfuscatedName("kx.n")
   private static class606[] field5479 = new class606[0];
   @deob.ObfuscatedName("kx.r")
   public float field5475;
   @deob.ObfuscatedName("kx.b")
   public float field5478;
   @deob.ObfuscatedName("kx.p")
   public float field5480;
   @deob.ObfuscatedName("kx.o")
   public float field5481;

   static {
      new class606();
   }

   @deob.ObfuscatedName("kx.n(I)V")
   public static void method8651(int arg0) {
      Statics.field5476 = arg0;
      field5479 = new class606[arg0];
      Statics.field5477 = 0;
   }

   @deob.ObfuscatedName("kx.k()Lkx;")
   public static class606 method8602() {
      class606[] var0 = field5479;
      synchronized(field5479) {
         if (Statics.field5477 == 0) {
            return new class606();
         } else {
            field5479[--Statics.field5477].method8614();
            return field5479[Statics.field5477];
         }
      }
   }

   @deob.ObfuscatedName("kx.d(FFFF)Lkx;")
   public static class606 method8607(float arg0, float arg1, float arg2, float arg3) {
      class606[] var4 = field5479;
      synchronized(field5479) {
         if (Statics.field5477 == 0) {
            return new class606(arg0, arg1, arg2, arg3);
         } else {
            field5479[--Statics.field5477].method8668(arg0, arg1, arg2, arg3);
            return field5479[Statics.field5477];
         }
      }
   }

   @deob.ObfuscatedName("kx.b(Lkx;)Lkx;")
   public static class606 method8604(class606 arg0) {
      class606[] var1 = field5479;
      synchronized(field5479) {
         if (Statics.field5477 == 0) {
            return new class606(arg0);
         } else {
            field5479[--Statics.field5477].method8645(arg0);
            return field5479[Statics.field5477];
         }
      }
   }

   @deob.ObfuscatedName("kx.r()V")
   public void method8654() {
      class606[] var1 = field5479;
      synchronized(field5479) {
         if (Statics.field5477 < Statics.field5476 - 1) {
            field5479[Statics.field5477++] = this;
         }

      }
   }

   public class606() {
      this.method8614();
   }

   public class606(float arg0, float arg1, float arg2, float arg3) {
      this.method8668(arg0, arg1, arg2, arg3);
   }

   public class606(class606 arg0) {
      this.method8645(arg0);
   }

   public class606(float arg0, float arg1, float arg2) {
      this.method8613(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("kx.p(Laen;)V")
   public void method8609(class124 arg0) {
      this.field5478 = arg0.method1660();
      this.field5475 = arg0.method1660();
      this.field5480 = arg0.method1660();
      this.field5481 = arg0.method1660();
   }

   @deob.ObfuscatedName("kx.o(FFFF)V")
   private void method8668(float arg0, float arg1, float arg2, float arg3) {
      this.field5478 = arg0;
      this.field5475 = arg1;
      this.field5480 = arg2;
      this.field5481 = arg3;
   }

   @deob.ObfuscatedName("kx.a(Lkx;)V")
   public void method8645(class606 arg0) {
      this.field5478 = arg0.field5478;
      this.field5475 = arg0.field5475;
      this.field5480 = arg0.field5480;
      this.field5481 = arg0.field5481;
   }

   @deob.ObfuscatedName("kx.x(Lkb;F)V")
   public void method8611(class584 arg0, float arg1) {
      this.method8612(arg0.field5328, arg0.field5330, arg0.field5331, arg1);
   }

   @deob.ObfuscatedName("kx.s(FFFF)V")
   public void method8612(float arg0, float arg1, float arg2, float arg3) {
      float var5 = (float)Math.sin((double)(arg3 * 0.5F));
      float var6 = (float)Math.cos((double)(arg3 * 0.5F));
      this.field5478 = arg0 * var5;
      this.field5475 = arg1 * var5;
      this.field5480 = arg2 * var5;
      this.field5481 = var6;
   }

   @deob.ObfuscatedName("kx.l(FFF)V")
   public void method8613(float arg0, float arg1, float arg2) {
      this.method8612(0.0F, 1.0F, 0.0F, arg0);
      class606 var4 = method8602();
      var4.method8612(1.0F, 0.0F, 0.0F, arg1);
      this.method8622(var4);
      var4.method8612(0.0F, 0.0F, 1.0F, arg2);
      this.method8622(var4);
      var4.method8654();
   }

   @deob.ObfuscatedName("kx.u()V")
   private final void method8614() {
      this.field5480 = 0.0F;
      this.field5475 = 0.0F;
      this.field5478 = 0.0F;
      this.field5481 = 1.0F;
   }

   @deob.ObfuscatedName("kx.v()V")
   private final void method8615() {
      this.field5478 = -this.field5478;
      this.field5475 = -this.field5475;
      this.field5480 = -this.field5480;
      this.field5481 = -this.field5481;
   }

   @deob.ObfuscatedName("kx.g()V")
   public final void method8616() {
      this.field5478 = -this.field5478;
      this.field5475 = -this.field5475;
      this.field5480 = -this.field5480;
   }

   @deob.ObfuscatedName("kx.h(Lkx;)Lkx;")
   public static final class606 method8617(class606 arg0) {
      class606 var1 = method8604(arg0);
      var1.method8616();
      return var1;
   }

   @deob.ObfuscatedName("kx.e()V")
   private final void method8603() {
      float var1 = 1.0F / method8621(this);
      this.field5478 *= var1;
      this.field5475 *= var1;
      this.field5480 *= var1;
      this.field5481 *= var1;
   }

   @deob.ObfuscatedName("kx.z(Lkx;)V")
   private final void method8619(class606 arg0) {
      this.field5478 += arg0.field5478;
      this.field5475 += arg0.field5475;
      this.field5480 += arg0.field5480;
      this.field5481 += arg0.field5481;
   }

   @deob.ObfuscatedName("kx.m(Lkx;)F")
   private final float method8608(class606 arg0) {
      return this.field5481 * arg0.field5481 + this.field5480 * arg0.field5480 + this.field5478 * arg0.field5478 + this.field5475 * arg0.field5475;
   }

   @deob.ObfuscatedName("kx.i(Lkx;Lkx;)F")
   private static final float method8659(class606 arg0, class606 arg1) {
      return arg0.method8608(arg1);
   }

   @deob.ObfuscatedName("kx.t(Lkx;)F")
   private static final float method8621(class606 arg0) {
      return (float)Math.sqrt((double)method8659(arg0, arg0));
   }

   @deob.ObfuscatedName("kx.c(Lkx;)V")
   public final void method8622(class606 arg0) {
      this.method8668(this.field5480 * arg0.field5475 + this.field5481 * arg0.field5478 + this.field5478 * arg0.field5481 - this.field5475 * arg0.field5480, this.field5478 * arg0.field5480 + this.field5481 * arg0.field5475 + (this.field5475 * arg0.field5481 - this.field5480 * arg0.field5478), this.field5481 * arg0.field5480 + (this.field5480 * arg0.field5481 + this.field5475 * arg0.field5478 - this.field5478 * arg0.field5475), this.field5481 * arg0.field5481 - this.field5478 * arg0.field5478 - this.field5475 * arg0.field5475 - this.field5480 * arg0.field5480);
   }

   @deob.ObfuscatedName("kx.w(Lkx;Lkx;)Lkx;")
   public static final class606 method8623(class606 arg0, class606 arg1) {
      class606 var2 = method8604(arg0);
      var2.method8622(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kx.q(F)V")
   private final void method8624(float arg0) {
      this.field5478 *= arg0;
      this.field5475 *= arg0;
      this.field5480 *= arg0;
      this.field5481 *= arg0;
   }

   @deob.ObfuscatedName("kx.y(Lkx;F)Lkx;")
   private static final class606 method8625(class606 arg0, float arg1) {
      class606 var2 = method8604(arg0);
      var2.method8624(arg1);
      return var2;
   }

   @deob.ObfuscatedName("kx.j(Lkx;F)V")
   public final void method8626(class606 arg0, float arg1) {
      if (this.method8608(arg0) < 0.0F) {
         this.method8615();
      }

      this.method8624(1.0F - arg1);
      class606 var3 = method8625(arg0, arg1);
      this.method8619(var3);
      var3.method8654();
      this.method8603();
   }

   public String toString() {
      return this.field5478 + "," + this.field5475 + "," + this.field5480 + "," + this.field5481;
   }
}
