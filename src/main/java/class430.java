@deob.ObfuscatedName("er")
public class class430 {
   @deob.ObfuscatedName("er.a")
   private class655 field3590 = null;
   @deob.ObfuscatedName("er.x")
   private int field3591 = 0;
   @deob.ObfuscatedName("er.b")
   private final class612 field3584;
   @deob.ObfuscatedName("er.r")
   public final int field3587;
   @deob.ObfuscatedName("er.o")
   private class221 field3589;
   @deob.ObfuscatedName("er.p")
   private class71 field3586;

   public class430(class612 arg0, int arg1) {
      this.field3584 = arg0;
      this.field3587 = arg1;
      this.field3589 = new class221();
      this.field3589.method2979(9, 128);
   }

   @deob.ObfuscatedName("er.n(B)Laic;")
   public class221 method5944() {
      return this.field3589;
   }

   @deob.ObfuscatedName("er.k(I)Laco;")
   public class71 method5950() {
      return this.field3586;
   }

   @deob.ObfuscatedName("er.d(I)Z")
   public boolean method5954() {
      class417.method8016();
      if (this.field3591 == 0) {
         this.field3586 = class71.method1032(this.field3584, this.field3587, 0);
         if (this.field3586 == null) {
            return false;
         }

         this.field3590 = new class655(Statics.field3118, Statics.field3117);
         this.field3591 = 1;
      }

      if (this.field3591 == 1) {
         if (!this.field3589.method2970(this.field3586, Statics.field3123, this.field3590, 22050)) {
            return false;
         }

         this.field3591 = 2;
      }

      return true;
   }

   @deob.ObfuscatedName("er.b(B)Z")
   public boolean method5946() {
      return this.field3591 == 2;
   }
}
