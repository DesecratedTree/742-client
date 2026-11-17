@deob.ObfuscatedName("we")
public class class911 implements class760 {
   @deob.ObfuscatedName("we.k")
   private final class737 field9256 = new class737(64);
   @deob.ObfuscatedName("we.n")
   private final class612 field9257;

   public class911(class801 arg0, class823 arg1, class612 arg2) {
      this.field9257 = arg2;
      this.field9257.method8792(class424.field3319.field3349);
   }

   @deob.ObfuscatedName("we.n(II)Lael;")
   public class122 method15756(int arg0) {
      class737 var2 = this.field9256;
      class122 var3;
      synchronized(this.field9256) {
         var3 = (class122)this.field9256.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9257;
         byte[] var6;
         synchronized(this.field9257) {
            var6 = this.field9257.method8771(class424.field3319.field3349, arg0);
         }

         class122 var8 = new class122();
         if (var6 != null) {
            var8.method1555(new class124(var6));
         }

         class737 var9 = this.field9256;
         synchronized(this.field9256) {
            this.field9256.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }
}
