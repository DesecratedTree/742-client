@deob.ObfuscatedName("bo")
public class class346 {
   @deob.ObfuscatedName("bo.p")
   public class939[] field2182 = null;
   @deob.ObfuscatedName("bo.o")
   public class948 field2183 = null;
   @deob.ObfuscatedName("bo.a")
   public class939[] field2184 = null;
   @deob.ObfuscatedName("bo.x")
   public class948 field2177 = null;
   @deob.ObfuscatedName("bo.s")
   public class948 field2178 = null;
   @deob.ObfuscatedName("bo.r")
   public boolean field2181;

   public class346(class983 arg0) {
      this.field2181 = arg0.field10377;
      method4211(arg0);
      if (!this.field2181) {
         this.field2182 = new class939[16];

         for(int var2 = 0; var2 < 16; ++var2) {
            byte[] var3 = class830.method10724(Statics.field2187, var2 * 32768, 32768);
            this.field2182[var2] = new class939(arg0, 3553, class372.field2737, class405.field3052, 128, 128, true, var3, class372.field2737, false);
         }

         this.field2184 = new class939[16];

         for(int var4 = 0; var4 < 16; ++var4) {
            byte[] var5 = class830.method10724(Statics.field2188, var4 * 32768, 32768);
            this.field2184[var4] = new class939(arg0, 3553, class372.field2737, class405.field3052, 128, 128, true, var5, class372.field2737, false);
         }
      } else {
         byte[] var6 = class830.method14661(Statics.field2187, false);
         this.field2183 = new class948(arg0, class372.field2737, class405.field3052, 128, 128, 16, var6, class372.field2737);
         byte[] var7 = class830.method14661(Statics.field2188, false);
         this.field2177 = new class948(arg0, class372.field2737, class405.field3052, 128, 128, 16, var7, class372.field2737);
         class363 var8 = arg0.field10213;
         if (var8.method4458()) {
            byte[] var9 = class830.method14661(Statics.field2180, false);
            this.field2178 = new class948(arg0, class372.field2736, class405.field3052, 128, 128, 16);
            class948 var10 = new class948(arg0, class372.field2734, class405.field3052, 128, 128, 16, var9, class372.field2734);
            if (!var8.method4459(this.field2178, var10, 2.0F)) {
               this.field2178.method4280();
               this.field2178 = null;
            } else {
               this.field2178.method4277();
            }

            var10.method4280();
         }
      }

   }

   @deob.ObfuscatedName("bo.n(Lyw;)V")
   private static void method4211(class983 arg0) {
      if (Statics.field2187 == null) {
         class205 var1 = new class205();
         byte[] var2 = var1.method2848(128, 128, 16);
         Statics.field2187 = class830.method7357(var2, false);
      }

      if (Statics.field2188 == null) {
         class196 var3 = new class196();
         byte[] var4 = var3.method2496(128, 128, 16);
         Statics.field2188 = class830.method7357(var4, false);
      }

      class363 var5 = arg0.field10213;
      if (var5.method4458() && Statics.field2180 == null) {
         byte[] var6 = class673.method9857(128, 128, 16, 8, new class115(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
         Statics.field2180 = class830.method7357(var6, false);
      }

   }
}
