@deob.ObfuscatedName("ff")
public class class445 {
   @deob.ObfuscatedName("ff.k")
   private final class737 field3679 = new class737(16);
   @deob.ObfuscatedName("ff.n")
   private final class612 field3680;

   public class445(class801 arg0, class823 arg1, class612 arg2) {
      this.field3680 = arg2;
      this.field3680.method8792(class424.field3344.field3349);
   }

   @deob.ObfuscatedName("ff.n(IB)Lfr;")
   public class457 method6241(int arg0) {
      class737 var2 = this.field3679;
      class457 var3;
      synchronized(this.field3679) {
         var3 = (class457)this.field3679.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field3680;
         byte[] var6;
         synchronized(this.field3680) {
            var6 = this.field3680.method8771(class424.field3344.field3349, arg0);
         }

         class457 var8 = new class457();
         if (var6 != null) {
            var8.method6481(new class124(var6));
         }

         class737 var9 = this.field3679;
         synchronized(this.field3679) {
            this.field3679.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("ff.k(B)V")
   public void method6242() {
      class737 var1 = this.field3679;
      synchronized(this.field3679) {
         this.field3679.method10883();
      }
   }

   @deob.ObfuscatedName("ff.d(II)V")
   public void method6243(int arg0) {
      class737 var2 = this.field3679;
      synchronized(this.field3679) {
         this.field3679.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("ff.b(B)V")
   public void method6250() {
      class737 var1 = this.field3679;
      synchronized(this.field3679) {
         this.field3679.method10887();
      }
   }
}
