@deob.ObfuscatedName("gv")
public class class488 implements class479 {
   @deob.ObfuscatedName("gv.n")
   private final class542 field3943;
   @deob.ObfuscatedName("gv.k")
   private final class470 field3944;

   public class488(class470 arg0, class542 arg1) {
      this.field3943 = arg1;
      this.field3944 = arg0;
   }

   @deob.ObfuscatedName("gv.d(B)Z")
   public boolean method384() {
      return this.field3944.method6601();
   }

   @deob.ObfuscatedName("gv.n(I)V")
   public void method383() {
   }

   @deob.ObfuscatedName("gv.k(ZI)V")
   public void method394(boolean arg0) {
      class492 var2 = this.field3944.method6600(this.field3943.field4347);
      if (var2 != null) {
         int var3 = this.field3943.field4346.method7443(this.field3943.field4338, client.field2555) + this.field3943.field4339;
         int var4 = this.field3943.field4344.method7329(this.field3943.field4340, client.field2556) + this.field3943.field4341;
         if (this.field3943.field4348) {
            Statics.field8847.method7751(var3, var4, this.field3943.field4338, this.field3943.field4340, this.field3943.field4345, 0);
         }

         int var5 = var4 + this.method6880(Statics.field7095, var2.field3963, var3, var4, 5) * 12;
         int var8 = var5 + 8;
         if (this.field3943.field4348) {
            Statics.field8847.method7517(var3, var8, this.field3943.field4338 + var3 - 1, var8, this.field3943.field4345, 0);
         }

         var5 = var8 + 1;
         int var6 = var5 + this.method6880(Statics.field7095, var2.field3962, var3, var5, 5) * 12;
         int var9 = var6 + 5;
         int var10000 = var9 + this.method6880(Statics.field7095, var2.field3964, var3, var9, 5) * 12;
      }

   }

   @deob.ObfuscatedName("gv.x(Ll;Ljava/lang/String;IIII)I")
   private int method6880(class609 arg0, String arg1, int arg2, int arg3, int arg4) {
      return arg0.method8692(arg1, arg2 + arg4, arg3 + arg4, this.field3943.field4338 - arg4 * 2, this.field3943.field4340 - arg4 * 2, this.field3943.field4342, this.field3943.field4343, 0, 0, 0, (class383[])null, (int[])null, (class826)null, 0, 0);
   }
}
