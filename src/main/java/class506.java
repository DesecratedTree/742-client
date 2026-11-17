@deob.ObfuscatedName("hm")
public class class506 {
   @deob.ObfuscatedName("hm.d")
   private class737 field4052 = new class737(6291456, 256);
   @deob.ObfuscatedName("hm.n")
   private final class979 field4053;
   @deob.ObfuscatedName("hm.k")
   private final class637 field4054;

   public class506(class979 arg0, class637 arg1) {
      this.field4053 = arg0;
      this.field4054 = arg1;
   }

   @deob.ObfuscatedName("hm.n(I)Lhr;")
   public class511 method7115(int arg0) {
      return this.method7116(arg0, -1);
   }

   @deob.ObfuscatedName("hm.k(II)Lhr;")
   private class511 method7116(int arg0, int arg1) {
      long var3 = (long)(arg1 << 16 | arg0);
      class511 var5 = (class511)this.field4052.method10909(var3);
      if (var5 != null) {
         return var5;
      } else if (!this.method7117(arg0, arg1)) {
         return null;
      } else {
         class360 var6 = this.field4054.method5112(arg0);
         if (arg1 == -1) {
            arg1 = var6.field2315;
         }

         class511 var8;
         if (var6.field2332 && this.field4053.method7574()) {
            float[] var7 = this.field4054.method5110(arg0, 0.7F, arg1, arg1, false);
            var8 = this.field4053.method16330(class372.field2736, arg1, arg1, true, var7);
         } else {
            int[] var9;
            if (class725.field6684 != var6.field2323 && class360.method9505(var6.field2324)) {
               var9 = this.field4054.method5146(arg0, 0.7F, arg1, arg1, true);
            } else {
               var9 = this.field4054.method5115(arg0, 0.7F, arg1, arg1, false);
            }

            var8 = this.field4053.method16347(arg1, arg1, true, var9);
         }

         var8.method497(var6.field2320, var6.field2336);
         this.field4052.method10881(var8, var3, arg1 * arg1);
         return var8;
      }
   }

   @deob.ObfuscatedName("hm.d(II)Z")
   public boolean method7117(int arg0, int arg1) {
      class360 var3 = this.field4054.method5112(arg0);
      if (arg1 == -1) {
         arg1 = var3.field2315;
      }

      if (var3.field2332 && this.field4053.method7574()) {
         return this.field4054.method5108(arg0, class742.field6807, 0.7F, arg1, arg1, false);
      } else {
         return class725.field6684 != var3.field2323 && class360.method9505(var3.field2324) ? this.field4054.method5108(arg0, class742.field6809, 0.7F, arg1, arg1, true) : this.field4054.method5108(arg0, class742.field6808, 0.7F, arg1, arg1, false);
      }
   }

   @deob.ObfuscatedName("hm.b()V")
   public void method7122() {
      this.field4052.method10882(5);
   }

   @deob.ObfuscatedName("hm.r()V")
   public void method7118() {
      this.field4052.method10883();
   }
}
