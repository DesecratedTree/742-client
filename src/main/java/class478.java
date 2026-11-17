@deob.ObfuscatedName("gl")
public class class478 implements class479 {
   @deob.ObfuscatedName("gl.n")
   private final class523 field3875;
   @deob.ObfuscatedName("gl.k")
   private final class612 field3873;
   @deob.ObfuscatedName("gl.d")
   private final class612 field3872;
   @deob.ObfuscatedName("gl.b")
   private class609 field3874;

   public class478(class612 arg0, class612 arg1, class523 arg2) {
      this.field3875 = arg2;
      this.field3873 = arg0;
      this.field3872 = arg1;
   }

   @deob.ObfuscatedName("gl.n(I)V")
   public void method383() {
      class883 var1 = class883.method7898(this.field3872, this.field3875.field4146);
      this.field3874 = Statics.field8847.method7606(var1, (class998[])((class998[])class375.method5067(this.field3873, this.field3875.field4146)), true);
   }

   @deob.ObfuscatedName("gl.k(ZI)V")
   public void method394(boolean arg0) {
      if (arg0) {
         int var2 = this.field3875.field4137.method7443(this.field3875.field4144, client.field2555) + this.field3875.field4145;
         int var3 = this.field3875.field4138.method7329(this.field3875.field4136, client.field2556) + this.field3875.field4141;
         this.field3874.method8692(this.field3875.field4140, var2, var3, this.field3875.field4144, this.field3875.field4136, this.field3875.field4147, this.field3875.field4148, this.field3875.field4143, this.field3875.field4142, this.field3875.field4139, (class383[])null, (int[])null, (class826)null, 0, 0);
      }

   }

   @deob.ObfuscatedName("gl.d(B)Z")
   public boolean method384() {
      boolean var1 = true;
      if (!this.field3873.method8790(this.field3875.field4146)) {
         var1 = false;
      }

      if (!this.field3872.method8790(this.field3875.field4146)) {
         var1 = false;
      }

      return var1;
   }
}
