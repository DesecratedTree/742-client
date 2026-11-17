@deob.ObfuscatedName("gj")
public class class476 implements class760 {
   @deob.ObfuscatedName("gj.d")
   private final class737 field3868 = new class737(64);
   @deob.ObfuscatedName("gj.n")
   private final class612 field3870;
   @deob.ObfuscatedName("gj.k")
   public final class612 field3869;

   public class476(class801 arg0, class823 arg1, class612 arg2, class612 arg3) {
      this.field3870 = arg2;
      this.field3869 = arg3;
      this.field3870.method8792(class424.field3317.field3349);
   }

   @deob.ObfuscatedName("gj.n(II)Lgn;")
   public class480 method6627(int arg0) {
      class737 var2 = this.field3868;
      class480 var3;
      synchronized(this.field3868) {
         var3 = (class480)this.field3868.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field3870;
         byte[] var6;
         synchronized(this.field3870) {
            var6 = this.field3870.method8771(class424.field3317.field3349, arg0);
         }

         class480 var8 = new class480();
         var8.field3881 = this;
         if (var6 != null) {
            var8.method6744(new class124(var6));
         }

         class737 var9 = this.field3868;
         synchronized(this.field3868) {
            this.field3868.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("gj.k(I)V")
   public void method6628() {
      class737 var1 = this.field3868;
      synchronized(this.field3868) {
         this.field3868.method10883();
      }
   }

   @deob.ObfuscatedName("gj.d(IB)V")
   public void method6629(int arg0) {
      class737 var2 = this.field3868;
      synchronized(this.field3868) {
         this.field3868.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("gj.b(B)V")
   public void method6638() {
      class737 var1 = this.field3868;
      synchronized(this.field3868) {
         this.field3868.method10887();
      }
   }
}
