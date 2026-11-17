@deob.ObfuscatedName("sb")
public class class800 {
   @deob.ObfuscatedName("sb.k")
   private final class737 field7295 = new class737(64);
   @deob.ObfuscatedName("sb.n")
   private final class612 field7296;

   public class800(class801 arg0, class823 arg1, class612 arg2) {
      this.field7296 = arg2;
      if (this.field7296 != null) {
         this.field7296.method8792(class424.field3339.field3349);
      }

   }

   @deob.ObfuscatedName("sb.n(IB)Lsx;")
   public class822 method14243(int arg0) {
      class737 var2 = this.field7295;
      class822 var3;
      synchronized(this.field7295) {
         var3 = (class822)this.field7295.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         byte[] var5 = this.field7296.method8771(class424.field3339.field3349, arg0);
         class822 var6 = new class822();
         if (var5 != null) {
            var6.method14520(new class124(var5));
         }

         class737 var7 = this.field7295;
         synchronized(this.field7295) {
            this.field7295.method10880(var6, (long)arg0);
            return var6;
         }
      }
   }

   @deob.ObfuscatedName("sb.k(B)V")
   public void method14250() {
      class737 var1 = this.field7295;
      synchronized(this.field7295) {
         this.field7295.method10883();
      }
   }

   @deob.ObfuscatedName("sb.d(IS)V")
   public void method14245(int arg0) {
      class737 var2 = this.field7295;
      synchronized(this.field7295) {
         this.field7295.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("sb.b(I)V")
   public void method14246() {
      class737 var1 = this.field7295;
      synchronized(this.field7295) {
         this.field7295.method10887();
      }
   }
}
