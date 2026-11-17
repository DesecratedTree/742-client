@deob.ObfuscatedName("uf")
public class class858 {
   @deob.ObfuscatedName("uf.k")
   private final class737 field8768 = new class737(128);
   @deob.ObfuscatedName("uf.n")
   private final class612 field8769;

   public class858(class801 arg0, class823 arg1, class612 arg2) {
      this.field8769 = arg2;
      this.field8769.method8792(class424.field3372.field3349);
   }

   @deob.ObfuscatedName("uf.n(IB)Luk;")
   public class863 method15099(int arg0) {
      class737 var2 = this.field8768;
      class863 var3;
      synchronized(this.field8768) {
         var3 = (class863)this.field8768.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field8769;
         byte[] var6;
         synchronized(this.field8769) {
            var6 = this.field8769.method8771(class424.field3372.field3349, arg0);
         }

         class863 var8 = new class863();
         if (var6 != null) {
            var8.method15196(new class124(var6));
         }

         class737 var9 = this.field8768;
         synchronized(this.field8768) {
            this.field8768.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("uf.k(B)V")
   public void method15106() {
      class737 var1 = this.field8768;
      synchronized(this.field8768) {
         this.field8768.method10883();
      }
   }

   @deob.ObfuscatedName("uf.d(II)V")
   public void method15100(int arg0) {
      class737 var2 = this.field8768;
      synchronized(this.field8768) {
         this.field8768.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("uf.b(B)V")
   public void method15108() {
      class737 var1 = this.field8768;
      synchronized(this.field8768) {
         this.field8768.method10887();
      }
   }
}
