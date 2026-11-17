@deob.ObfuscatedName("gc")
public class class469 {
   @deob.ObfuscatedName("gc.n")
   private final class612 field3830;
   @deob.ObfuscatedName("gc.k")
   private final class612 field3829;
   @deob.ObfuscatedName("gc.d")
   private class470 field3831;

   public class469(class612 arg0, class612 arg1) {
      this.field3830 = arg0;
      this.field3829 = arg1;
   }

   @deob.ObfuscatedName("gc.n(Lik;I)Lgm;")
   public class479 method6586(class531 arg0) {
      if (arg0 == null) {
         return null;
      } else {
         class538 var2 = arg0.method572();
         if (class538.field4250 == var2) {
            return new class484((class524)arg0);
         } else if (class538.field4249 == var2) {
            return new class488(this.method6588(), (class542)arg0);
         } else if (class538.field4252 == var2) {
            return new class468(this.field3830, (class527)arg0);
         } else if (class538.field4253 == var2) {
            return new class19(this.field3830, (class35)arg0);
         } else if (class538.field4248 == var2) {
            return new class16(this.field3830, this.field3829, (class49)arg0);
         } else if (class538.field4247 == var2) {
            return new class18(this.field3830, this.field3829, (class36)arg0);
         } else if (class538.field4255 == var2) {
            return new class24(this.field3830, this.field3829, (class38)arg0);
         } else if (class538.field4254 == var2) {
            return new class478(this.field3830, this.field3829, (class523)arg0);
         } else if (class538.field4251 == var2) {
            return new class491(this.field3830, (class543)arg0);
         } else {
            return class538.field4256 == var2 ? new class209(this.field3830, this.field3829, (class215)arg0) : null;
         }
      }
   }

   @deob.ObfuscatedName("gc.k(I)Lgd;")
   private class470 method6588() {
      if (this.field3831 == null) {
         this.field3831 = new class470();
      }

      return this.field3831;
   }
}
