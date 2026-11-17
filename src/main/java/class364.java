@deob.ObfuscatedName("cf")
public class class364 {
   @deob.ObfuscatedName("cf.d")
   private final class737 field2350 = new class737(6291456, 256);
   @deob.ObfuscatedName("cf.n")
   private final class983 field2349;
   @deob.ObfuscatedName("cf.k")
   private final class637 field2348;

   public class364(class983 arg0, class637 arg1) {
      this.field2349 = arg0;
      this.field2348 = arg1;
   }

   @deob.ObfuscatedName("cf.n(I)Lxf;")
   public class939 method4464(int arg0) {
      return this.method4466(arg0, -1);
   }

   @deob.ObfuscatedName("cf.k(II)Lxf;")
   private class939 method4466(int arg0, int arg1) {
      class939 var3 = (class939)this.field2350.method10909((long)arg0);
      if (var3 != null) {
         return var3;
      } else if (!this.method4463(arg0, arg1)) {
         return null;
      } else {
         class360 var4 = this.field2348.method5112(arg0);
         if (arg1 == -1) {
            arg1 = var4.field2315;
         }

         class939 var6;
         if (var4.field2332 && this.field2349.method7574()) {
            float[] var5 = this.field2348.method5110(arg0, 0.7F, arg1, arg1, false);
            var6 = new class939(this.field2349, 3553, class372.field2736, class405.field3056, arg1, arg1, var4.field2335 != 0, var5, class372.field2736);
         } else {
            int[] var7;
            if (class725.field6684 != var4.field2323 && class360.method9505(var4.field2324)) {
               var7 = this.field2348.method5146(arg0, 0.7F, arg1, arg1, true);
            } else {
               var7 = this.field2348.method5115(arg0, 0.7F, arg1, arg1, false);
            }

            var6 = new class939(this.field2349, 3553, arg1, arg1, var4.field2335 != 0, var7, 0, 0, false);
         }

         var6.method15984(var4.field2320, var4.field2336);
         this.field2350.method10881(var6, (long)arg0, arg1 * arg1);
         return var6;
      }
   }

   @deob.ObfuscatedName("cf.d(II)Z")
   public boolean method4463(int arg0, int arg1) {
      class360 var3 = this.field2348.method5112(arg0);
      if (arg1 == -1) {
         arg1 = var3.field2315;
      }

      if (var3.field2332 && this.field2349.method7574()) {
         return this.field2348.method5108(arg0, class742.field6807, 0.7F, arg1, arg1, false);
      } else {
         return class725.field6684 != var3.field2323 && class360.method9505(var3.field2324) ? this.field2348.method5108(arg0, class742.field6809, 0.7F, arg1, arg1, true) : this.field2348.method5108(arg0, class742.field6808, 0.7F, arg1, arg1, false);
      }
   }

   @deob.ObfuscatedName("cf.b()V")
   public void method4465() {
      this.field2350.method10882(5);
   }

   @deob.ObfuscatedName("cf.r()V")
   public void method4468() {
      this.field2350.method10883();
   }
}
