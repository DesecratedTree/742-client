@deob.ObfuscatedName("jd")
public class class559 implements class760 {
   @deob.ObfuscatedName("jd.d")
   private class737 field4895 = new class737(64);
   @deob.ObfuscatedName("jd.n")
   private final class612 field4893;
   @deob.ObfuscatedName("jd.k")
   public int field4894;

   public class559(class801 arg0, class823 arg1, class612 arg2) {
      this.field4893 = arg2;
      if (this.field4893 != null) {
         this.field4894 = this.field4893.method8792(class424.field3330.field3349);
      } else {
         this.field4894 = 0;
      }

   }

   @deob.ObfuscatedName("jd.n(II)Ljf;")
   public class561 method7908(int arg0) {
      class737 var2 = this.field4895;
      class561 var3;
      synchronized(this.field4895) {
         var3 = (class561)this.field4895.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field4893;
         byte[] var6;
         synchronized(this.field4893) {
            var6 = this.field4893.method8771(class424.field3330.field3349, arg0);
         }

         class561 var8 = new class561();
         if (var6 != null) {
            var8.method7926(new class124(var6));
         }

         class737 var9 = this.field4895;
         synchronized(this.field4895) {
            this.field4895.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("jd.k(I)V")
   public void method7909() {
      class737 var1 = this.field4895;
      synchronized(this.field4895) {
         this.field4895.method10883();
      }
   }

   @deob.ObfuscatedName("jd.d(II)V")
   public void method7910(int arg0) {
      class737 var2 = this.field4895;
      synchronized(this.field4895) {
         this.field4895.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("jd.b(I)V")
   public void method7907() {
      class737 var1 = this.field4895;
      synchronized(this.field4895) {
         this.field4895.method10887();
      }
   }
}
