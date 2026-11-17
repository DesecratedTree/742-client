@deob.ObfuscatedName("wv")
public class class928 {
   @deob.ObfuscatedName("wv.d")
   private class737 field9425 = new class737(64);
   @deob.ObfuscatedName("wv.n")
   private final class612 field9423;
   @deob.ObfuscatedName("wv.k")
   public int field9424;

   public class928(class801 arg0, class823 arg1, class612 arg2) {
      this.field9423 = arg2;
      if (this.field9423 != null) {
         this.field9424 = this.field9423.method8792(class424.field3361.field3349);
      } else {
         this.field9424 = 0;
      }

   }

   @deob.ObfuscatedName("wv.n(IB)Lwp;")
   public class922 method15922(int arg0) {
      class737 var2 = this.field9425;
      class922 var3;
      synchronized(this.field9425) {
         var3 = (class922)this.field9425.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9423;
         byte[] var6;
         synchronized(this.field9423) {
            var6 = this.field9423.method8771(class424.field3361.field3349, arg0);
         }

         class922 var8 = new class922();
         if (var6 != null) {
            var8.method15869(new class124(var6));
         }

         class737 var9 = this.field9425;
         synchronized(this.field9425) {
            this.field9425.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("wv.k(I)V")
   public void method15923() {
      class737 var1 = this.field9425;
      synchronized(this.field9425) {
         this.field9425.method10883();
      }
   }

   @deob.ObfuscatedName("wv.d(II)V")
   public void method15924(int arg0) {
      class737 var2 = this.field9425;
      synchronized(this.field9425) {
         this.field9425.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("wv.b(B)V")
   public void method15925() {
      class737 var1 = this.field9425;
      synchronized(this.field9425) {
         this.field9425.method10887();
      }
   }
}
