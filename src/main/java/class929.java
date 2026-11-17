@deob.ObfuscatedName("ww")
public class class929 {
   @deob.ObfuscatedName("ww.k")
   private final class737 field9428 = new class737(64);
   @deob.ObfuscatedName("ww.n")
   private final class612 field9427;

   public class929(class801 arg0, class823 arg1, class612 arg2) {
      this.field9427 = arg2;
      if (this.field9427 != null) {
         this.field9427.method8792(class424.field3325.field3349);
      }

   }

   @deob.ObfuscatedName("ww.n(II)Lwq;")
   public class923 method15930(int arg0) {
      class737 var2 = this.field9428;
      class923 var3;
      synchronized(this.field9428) {
         var3 = (class923)this.field9428.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9427;
         byte[] var6;
         synchronized(this.field9427) {
            var6 = this.field9427.method8771(class424.field3325.field3349, arg0);
         }

         class923 var8 = new class923();
         if (var6 != null) {
            var8.method15882(new class124(var6));
         }

         class737 var9 = this.field9428;
         synchronized(this.field9428) {
            this.field9428.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("ww.k(I)V")
   public void method15932() {
      class737 var1 = this.field9428;
      synchronized(this.field9428) {
         this.field9428.method10883();
      }
   }

   @deob.ObfuscatedName("ww.d(IB)V")
   public void method15933(int arg0) {
      class737 var2 = this.field9428;
      synchronized(this.field9428) {
         this.field9428.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("ww.b(I)V")
   public void method15940() {
      class737 var1 = this.field9428;
      synchronized(this.field9428) {
         this.field9428.method10887();
      }
   }
}
