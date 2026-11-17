@deob.ObfuscatedName("pw")
public class class740 {
   @deob.ObfuscatedName("pw.d")
   public class737 field6802 = new class737(20);
   @deob.ObfuscatedName("pw.b")
   private final class737 field6799 = new class737(64);
   @deob.ObfuscatedName("pw.k")
   public final class612 field6801;
   @deob.ObfuscatedName("pw.n")
   private final class612 field6800;

   public class740(class801 arg0, class823 arg1, class612 arg2, class612 arg3) {
      this.field6801 = arg3;
      this.field6800 = arg2;
      this.field6800.method8792(class424.field3360.field3349);
   }

   @deob.ObfuscatedName("pw.n(IB)Lpm;")
   public class730 method10934(int arg0) {
      class737 var2 = this.field6799;
      class730 var3;
      synchronized(this.field6799) {
         var3 = (class730)this.field6799.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field6800;
         byte[] var6;
         synchronized(this.field6800) {
            var6 = this.field6800.method8771(class424.field3360.field3349, arg0);
         }

         class730 var8 = new class730();
         var8.field6707 = this;
         if (var6 != null) {
            var8.method10763(new class124(var6));
         }

         class737 var9 = this.field6799;
         synchronized(this.field6799) {
            this.field6799.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("pw.k(I)V")
   public void method10935() {
      class737 var1 = this.field6799;
      synchronized(this.field6799) {
         this.field6799.method10883();
      }

      class737 var3 = this.field6802;
      synchronized(this.field6802) {
         this.field6802.method10883();
      }
   }

   @deob.ObfuscatedName("pw.d(IB)V")
   public void method10936(int arg0) {
      class737 var2 = this.field6799;
      synchronized(this.field6799) {
         this.field6799.method10882(arg0);
      }

      class737 var4 = this.field6802;
      synchronized(this.field6802) {
         this.field6802.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("pw.b(B)V")
   public void method10937() {
      class737 var1 = this.field6799;
      synchronized(this.field6799) {
         this.field6799.method10887();
      }

      class737 var3 = this.field6802;
      synchronized(this.field6802) {
         this.field6802.method10887();
      }
   }
}
