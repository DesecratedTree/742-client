@deob.ObfuscatedName("pl")
public class class729 implements class760 {
   @deob.ObfuscatedName("pl.d")
   private class737 field6694 = new class737(64);
   @deob.ObfuscatedName("pl.k")
   private final class612 field6693;

   public class729(class801 arg0, class823 arg1, class612 arg2) {
      this.field6693 = arg2;
      if (this.field6693 != null) {
         int var4 = this.field6693.method8782() - 1;
         class424.field3328.method5801();
         this.field6693.method8792(var4);
      }

   }

   @deob.ObfuscatedName("pl.n(II)Lpi;")
   public class726 method10754(int arg0) {
      class737 var2 = this.field6694;
      class726 var3;
      synchronized(this.field6694) {
         var3 = (class726)this.field6694.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field6693;
         byte[] var6;
         synchronized(this.field6693) {
            var6 = this.field6693.method8771(class424.field3328.method5800(arg0), class424.field3328.method5803(arg0));
         }

         class726 var8 = new class726();
         if (var6 != null) {
            var8.method10730(new class124(var6));
         }

         class737 var9 = this.field6694;
         synchronized(this.field6694) {
            this.field6694.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("pl.k(B)V")
   public void method10752() {
      class737 var1 = this.field6694;
      synchronized(this.field6694) {
         this.field6694.method10883();
      }
   }

   @deob.ObfuscatedName("pl.d(II)V")
   public void method10759(int arg0) {
      class737 var2 = this.field6694;
      synchronized(this.field6694) {
         this.field6694.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("pl.b(I)V")
   public void method10753() {
      class737 var1 = this.field6694;
      synchronized(this.field6694) {
         this.field6694.method10887();
      }
   }

   @deob.ObfuscatedName("pl.r(II)V")
   public void method10755(int arg0) {
      class737 var2 = this.field6694;
      synchronized(this.field6694) {
         this.field6694.method10883();
         this.field6694 = new class737(arg0);
      }
   }
}
