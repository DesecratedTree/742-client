@deob.ObfuscatedName("lh")
public class class617 {
   @deob.ObfuscatedName("lh.d")
   private final class737 field5563 = new class737(64);
   @deob.ObfuscatedName("lh.n")
   private final class612 field5565;
   @deob.ObfuscatedName("lh.k")
   private final class612 field5564;

   public class617(class823 arg0, class612 arg1, class612 arg2) {
      this.field5565 = arg1;
      this.field5564 = arg2;
      if (this.field5565 != null) {
         this.field5565.method8792(0);
      }

      if (this.field5564 != null) {
         this.field5564.method8792(0);
      }

   }

   @deob.ObfuscatedName("lh.n(II)Lajv;")
   public class267 method8893(int arg0) {
      class267 var2 = (class267)this.field5563.method10909((long)arg0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3;
         if (arg0 >= 32768) {
            var3 = this.field5564.method8771(0, arg0 & 32767);
         } else {
            var3 = this.field5565.method8771(0, arg0);
         }

         class267 var4 = new class267();
         if (var3 != null) {
            var4.method3564(new class124(var3));
         }

         if (arg0 >= 32768) {
            var4.method3556();
         }

         this.field5563.method10880(var4, (long)arg0);
         return var4;
      }
   }
}
