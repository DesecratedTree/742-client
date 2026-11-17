@deob.ObfuscatedName("vu")
public class class900 {
   @deob.ObfuscatedName("vu.d")
   private final class737 field9193 = new class737(64);
   @deob.ObfuscatedName("vu.n")
   private final class612 field9191;
   @deob.ObfuscatedName("vu.k")
   public int field9192;

   public class900(class801 arg0, class823 arg1, class612 arg2) {
      this.field9191 = arg2;
      this.field9192 = this.field9191.method8792(class424.field3324.field3349);
   }

   @deob.ObfuscatedName("vu.n(II)Lvz;")
   public class905 method15668(int arg0) {
      class737 var2 = this.field9193;
      class905 var3;
      synchronized(this.field9193) {
         var3 = (class905)this.field9193.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9191;
         byte[] var6;
         synchronized(this.field9191) {
            var6 = this.field9191.method8771(class424.field3324.field3349, arg0);
         }

         class905 var8 = new class905();
         if (var6 != null) {
            var8.method15720(new class124(var6));
         }

         class737 var9 = this.field9193;
         synchronized(this.field9193) {
            this.field9193.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }
}
