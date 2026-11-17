@deob.ObfuscatedName("un")
public class class866 {
   @deob.ObfuscatedName("un.k")
   private final class737 field8812 = new class737(128);
   @deob.ObfuscatedName("un.n")
   private final class612 field8813;

   public class866(class801 arg0, class823 arg1, class612 arg2) {
      this.field8813 = arg2;
      if (this.field8813 != null) {
         int var4 = this.field8813.method8782() - 1;
         class424.field3322.method5801();
         this.field8813.method8792(var4);
      }

   }

   @deob.ObfuscatedName("un.n(II)Lus;")
   public class871 method15214(int arg0) {
      class737 var2 = this.field8812;
      class871 var3;
      synchronized(this.field8812) {
         var3 = (class871)this.field8812.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         byte[] var5 = this.field8813.method8771(class424.field3322.method5800(arg0), class424.field3322.method5803(arg0));
         class871 var6 = new class871();
         if (var5 != null) {
            var6.method15236(new class124(var5));
         }

         class737 var7 = this.field8812;
         synchronized(this.field8812) {
            this.field8812.method10880(var6, (long)arg0);
            return var6;
         }
      }
   }
}
