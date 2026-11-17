@deob.ObfuscatedName("pn")
public class class731 {
   @deob.ObfuscatedName("pn.k")
   private final class737 field6716 = new class737(64);
   @deob.ObfuscatedName("pn.n")
   private final class612 field6717;
   @deob.ObfuscatedName("pn.b")
   public final class794 field6718;
   @deob.ObfuscatedName("pn.d")
   public static final class743 field6715 = new class743();

   public class731(class801 arg0, class823 arg1, class612 arg2, class794 arg3) {
      this.field6717 = arg2;
      this.field6717.method8792(class424.field3346.field3349);
      this.field6718 = arg3;
   }

   @deob.ObfuscatedName("pn.n(II)Lpz;")
   public class743 method10795(int arg0) {
      class737 var2 = this.field6716;
      class743 var3;
      synchronized(this.field6716) {
         var3 = (class743)this.field6716.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field6717;
         byte[] var6;
         synchronized(this.field6717) {
            var6 = this.field6717.method8771(class424.field3346.field3349, arg0);
         }

         class743 var8 = new class743();
         var8.field6831 = this;
         if (var6 != null) {
            var8.method10963(new class124(var6));
         }

         class737 var9 = this.field6716;
         synchronized(this.field6716) {
            this.field6716.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("pn.k(I)V")
   public void method10797() {
      class737 var1 = this.field6716;
      synchronized(this.field6716) {
         this.field6716.method10883();
      }
   }

   @deob.ObfuscatedName("pn.d(II)V")
   public void method10800(int arg0) {
      class737 var2 = this.field6716;
      synchronized(this.field6716) {
         this.field6716.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("pn.b(I)V")
   public void method10798() {
      class737 var1 = this.field6716;
      synchronized(this.field6716) {
         this.field6716.method10887();
      }
   }
}
