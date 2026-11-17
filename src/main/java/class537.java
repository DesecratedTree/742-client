@deob.ObfuscatedName("iq")
public class class537 {
   @deob.ObfuscatedName("iq.s")
   public static class537[] field4228 = new class537[16];
   @deob.ObfuscatedName("iq.l")
   private static int field4233 = 0;
   @deob.ObfuscatedName("iq.u")
   public static class875 field4230 = new class875(16);
   @deob.ObfuscatedName("iq.g")
   private static class737 field4237 = new class737(64);
   @deob.ObfuscatedName("iq.q")
   public int field4243 = 0;
   @deob.ObfuscatedName("iq.y")
   public int field4241 = 0;
   @deob.ObfuscatedName("iq.j")
   private boolean field4221 = false;
   @deob.ObfuscatedName("iq.f")
   public int field4219;
   @deob.ObfuscatedName("iq.z")
   private int field4229;
   @deob.ObfuscatedName("iq.i")
   public int field4231;
   @deob.ObfuscatedName("iq.m")
   public int field4235;
   @deob.ObfuscatedName("iq.t")
   public int field4236;
   @deob.ObfuscatedName("iq.c")
   public int field4238;
   @deob.ObfuscatedName("iq.w")
   public int field4239;
   @deob.ObfuscatedName("iq.e")
   public int field4240;
   @deob.ObfuscatedName("iq.h")
   public int field4242;
   @deob.ObfuscatedName("iq.ap")
   public int field4245;
   @deob.ObfuscatedName("iq.ai")
   public long field4244;

   private class537() {
   }

   @deob.ObfuscatedName("aj.n(Llc;I)V")
   public static void method3351(class612 arg0) {
      Statics.field2110 = arg0;
   }

   @deob.ObfuscatedName("eg.k(II)Liq;")
   public static class537 method5770(int arg0) {
      class537 var1 = (class537)field4237.method10909((long)arg0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Statics.field2110.method8771(1, arg0);
         class537 var3 = new class537();
         var3.field4242 = arg0;
         if (var2 != null) {
            var3.method7378(new class124(var2));
         }

         var3.method7380();
         if (var3.field4240 == 2 && field4230.method15322((long)arg0) == null) {
            field4230.method15311(new class108(field4233), (long)arg0);
            field4228[++field4233 - 1] = var3;
         }

         field4237.method10880(var3, (long)arg0);
         return var3;
      }
   }

   @deob.ObfuscatedName("iq.d(Laen;I)V")
   private void method7378(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method7388(arg0, var2);
      }
   }

   @deob.ObfuscatedName("iq.b(Laen;II)V")
   private void method7388(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field4229 = arg0.method1587();
      } else if (arg1 == 2) {
         arg0.method1688();
      } else if (arg1 == 3) {
         this.field4235 = arg0.method1591();
         this.field4231 = arg0.method1591();
         this.field4236 = arg0.method1591();
      } else if (arg1 == 4) {
         this.field4238 = arg0.method1688();
         this.field4239 = arg0.method1591();
      } else if (arg1 == 6) {
         this.field4240 = arg0.method1688();
      } else if (arg1 == 8) {
         this.field4243 = 1;
      } else if (arg1 == 9) {
         this.field4241 = 1;
      } else if (arg1 == 10) {
         this.field4221 = true;
      }

   }

   @deob.ObfuscatedName("iq.r(B)V")
   private void method7380() {
      this.field4245 = class603.field5471[this.field4229 << 3];
      long var1 = (long)this.field4235;
      long var3 = (long)this.field4231;
      long var5 = (long)this.field4236;
      this.field4219 = (int)Math.sqrt((double)(var5 * var5 + var1 * var1 + var3 * var3));
      if (this.field4239 == 0) {
         this.field4239 = 1;
      }

      if (this.field4238 == 0) {
         this.field4244 = 2147483647L;
      } else if (this.field4238 == 1) {
         this.field4244 = (long)(this.field4219 * 8 / this.field4239);
         this.field4244 *= this.field4244;
      } else if (this.field4238 == 2) {
         this.field4244 = (long)(this.field4219 * 8 / this.field4239);
      }

      if (this.field4221) {
         this.field4219 *= -1;
      }

   }

   @deob.ObfuscatedName("al.p(I)V")
   public static void method3850() {
      field4237.method10883();
   }
}
