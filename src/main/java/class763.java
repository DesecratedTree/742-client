@deob.ObfuscatedName("qs")
public class class763 {
   @deob.ObfuscatedName("qs.k")
   private class737 field7010 = new class737(64);
   @deob.ObfuscatedName("qs.n")
   private final class612 field7011;

   public class763(class801 arg0, class823 arg1, class612 arg2) {
      this.field7011 = arg2;
      if (this.field7011 != null) {
         this.field7011.method8792(class424.field3371.field3349);
      }

   }

   @deob.ObfuscatedName("qs.n(II)Lqq;")
   public class761 method11317(int arg0) {
      class737 var2 = this.field7010;
      class761 var3;
      synchronized(this.field7010) {
         var3 = (class761)this.field7010.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field7011;
         byte[] var6;
         synchronized(this.field7011) {
            var6 = this.field7011.method8771(class424.field3371.field3349, arg0);
         }

         class761 var8 = new class761();
         if (var6 != null) {
            var8.method11283(new class124(var6));
         }

         class737 var9 = this.field7010;
         synchronized(this.field7010) {
            this.field7010.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("qs.k(B)V")
   public void method11322() {
      class737 var1 = this.field7010;
      synchronized(this.field7010) {
         this.field7010.method10883();
      }
   }

   @deob.ObfuscatedName("qs.d(II)V")
   public void method11316(int arg0) {
      class737 var2 = this.field7010;
      synchronized(this.field7010) {
         this.field7010.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("qs.b(I)V")
   public void method11319() {
      class737 var1 = this.field7010;
      synchronized(this.field7010) {
         this.field7010.method10887();
      }
   }
}
