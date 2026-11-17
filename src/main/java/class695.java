@deob.ObfuscatedName("oe")
public class class695 {
   @deob.ObfuscatedName("oe.d")
   private final class737 field6372 = new class737(64);
   @deob.ObfuscatedName("oe.b")
   public class737 field6373 = new class737(20);
   @deob.ObfuscatedName("oe.k")
   public final class612 field6371;
   @deob.ObfuscatedName("oe.n")
   private final class612 field6370;

   public class695(class801 arg0, class823 arg1, class612 arg2, class612 arg3) {
      this.field6371 = arg3;
      this.field6370 = arg2;
      this.field6370.method8792(class424.field3369.field3349);
   }

   @deob.ObfuscatedName("oe.n(II)Lod;")
   public class694 method10171(int arg0) {
      class737 var2 = this.field6372;
      class694 var3;
      synchronized(this.field6372) {
         var3 = (class694)this.field6372.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field6370;
         byte[] var6;
         synchronized(this.field6370) {
            var6 = this.field6370.method8771(class424.field3369.field3349, arg0);
         }

         class694 var8 = new class694();
         var8.field6357 = this;
         if (var6 != null) {
            var8.method10146(new class124(var6));
         }

         class737 var9 = this.field6372;
         synchronized(this.field6372) {
            this.field6372.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("oe.k(B)V")
   public void method10169() {
      class737 var1 = this.field6372;
      synchronized(this.field6372) {
         this.field6372.method10883();
      }

      class737 var3 = this.field6373;
      synchronized(this.field6373) {
         this.field6373.method10883();
      }
   }

   @deob.ObfuscatedName("oe.d(II)V")
   public void method10170(int arg0) {
      class737 var2 = this.field6372;
      synchronized(this.field6372) {
         this.field6372.method10882(arg0);
      }

      class737 var4 = this.field6373;
      synchronized(this.field6373) {
         this.field6373.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("oe.b(I)V")
   public void method10173() {
      class737 var1 = this.field6372;
      synchronized(this.field6372) {
         this.field6372.method10887();
      }

      class737 var3 = this.field6373;
      synchronized(this.field6373) {
         this.field6373.method10887();
      }
   }
}
