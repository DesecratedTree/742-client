@deob.ObfuscatedName("vr")
public class class897 {
   @deob.ObfuscatedName("vr.k")
   private final class737 field9111 = new class737(64);
   @deob.ObfuscatedName("vr.n")
   private final class612 field9112;

   public class897(class801 arg0, class823 arg1, class612 arg2) {
      this.field9112 = arg2;
      this.field9112.method8792(class424.field3345.field3349);
   }

   @deob.ObfuscatedName("vr.n(II)Lvl;")
   public class891 method15596(int arg0) {
      class737 var2 = this.field9111;
      class891 var3;
      synchronized(this.field9111) {
         var3 = (class891)this.field9111.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9112;
         byte[] var6;
         synchronized(this.field9112) {
            var6 = this.field9112.method8771(class424.field3345.field3349, arg0);
         }

         class891 var8 = new class891();
         if (var6 != null) {
            var8.method15510(new class124(var6));
         }

         class737 var9 = this.field9111;
         synchronized(this.field9111) {
            this.field9111.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("vr.k(I)V")
   public void method15590() {
      class737 var1 = this.field9111;
      synchronized(this.field9111) {
         this.field9111.method10883();
      }
   }

   @deob.ObfuscatedName("vr.d(II)V")
   public void method15591(int arg0) {
      class737 var2 = this.field9111;
      synchronized(this.field9111) {
         this.field9111.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("vr.b(B)V")
   public void method15592() {
      class737 var1 = this.field9111;
      synchronized(this.field9111) {
         this.field9111.method10887();
      }
   }
}
