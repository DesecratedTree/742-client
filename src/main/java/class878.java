@deob.ObfuscatedName("uz")
public class class878 {
   @deob.ObfuscatedName("uz.k")
   private final class737 field8873 = new class737(64);
   @deob.ObfuscatedName("uz.n")
   private final class612 field8872;

   public class878(class801 arg0, class823 arg1, class612 arg2) {
      this.field8872 = arg2;
      if (this.field8872 != null) {
         this.field8872.method8792(class424.field3338.field3349);
      }

   }

   @deob.ObfuscatedName("uz.n(II)Lur;")
   public class870 method15356(int arg0) {
      class737 var2 = this.field8873;
      class870 var3;
      synchronized(this.field8873) {
         var3 = (class870)this.field8873.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         byte[] var5 = this.field8872.method8771(class424.field3338.field3349, arg0);
         class870 var6 = new class870();
         if (var5 != null) {
            var6.method15230(new class124(var5));
         }

         class737 var7 = this.field8873;
         synchronized(this.field8873) {
            this.field8873.method10880(var6, (long)arg0);
            return var6;
         }
      }
   }

   @deob.ObfuscatedName("uz.k(I)V")
   public void method15360() {
      class737 var1 = this.field8873;
      synchronized(this.field8873) {
         this.field8873.method10883();
      }
   }

   @deob.ObfuscatedName("uz.d(IB)V")
   public void method15358(int arg0) {
      class737 var2 = this.field8873;
      synchronized(this.field8873) {
         this.field8873.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("uz.b(I)V")
   public void method15359() {
      class737 var1 = this.field8873;
      synchronized(this.field8873) {
         this.field8873.method10887();
      }
   }
}
