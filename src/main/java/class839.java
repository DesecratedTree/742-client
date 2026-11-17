@deob.ObfuscatedName("tn")
public class class839 {
   @deob.ObfuscatedName("tn.n")
   private class679 field8548 = new class679();
   @deob.ObfuscatedName("tn.k")
   private class679 field8547;

   public class839() {
      this.field8548.field6178 = this.field8548;
      this.field8548.field6179 = this.field8548;
   }

   @deob.ObfuscatedName("tn.n(I)V")
   public void method14794() {
      while(true) {
         class679 var1 = this.field8548.field6178;
         if (this.field8548 == var1) {
            this.field8547 = null;
            return;
         }

         var1.method9960();
      }
   }

   @deob.ObfuscatedName("tn.k(Lnp;I)V")
   public void method14795(class679 arg0) {
      if (arg0.field6179 != null) {
         arg0.method9960();
      }

      arg0.field6179 = this.field8548.field6179;
      arg0.field6178 = this.field8548;
      arg0.field6179.field6178 = arg0;
      arg0.field6178.field6179 = arg0;
   }

   @deob.ObfuscatedName("tn.d(Lnp;I)V")
   public void method14809(class679 arg0) {
      if (arg0.field6179 != null) {
         arg0.method9960();
      }

      arg0.field6179 = this.field8548;
      arg0.field6178 = this.field8548.field6178;
      arg0.field6179.field6178 = arg0;
      arg0.field6178.field6179 = arg0;
   }

   @deob.ObfuscatedName("zl.b(Lnp;Lnp;I)V")
   public static void method17072(class679 arg0, class679 arg1) {
      if (arg0.field6179 != null) {
         arg0.method9960();
      }

      arg0.field6179 = arg1;
      arg0.field6178 = arg1.field6178;
      arg0.field6179.field6178 = arg0;
      arg0.field6178.field6179 = arg0;
   }

   @deob.ObfuscatedName("tn.r(I)Lnp;")
   public class679 method14797() {
      class679 var1 = this.field8548.field6178;
      if (this.field8548 == var1) {
         return null;
      } else {
         var1.method9960();
         return var1;
      }
   }

   @deob.ObfuscatedName("tn.p(I)Lnp;")
   public class679 method14798() {
      class679 var1 = this.field8548.field6178;
      if (this.field8548 == var1) {
         this.field8547 = null;
         return null;
      } else {
         this.field8547 = var1.field6178;
         return var1;
      }
   }

   @deob.ObfuscatedName("tn.o(B)Lnp;")
   public class679 method14793() {
      class679 var1 = this.field8547;
      if (this.field8548 == var1) {
         this.field8547 = null;
         return null;
      } else {
         this.field8547 = var1.field6178;
         return var1;
      }
   }

   @deob.ObfuscatedName("tn.a(S)Z")
   public boolean method14805() {
      return this.field8548.field6178 == this.field8548;
   }
}
