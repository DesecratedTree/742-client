@deob.ObfuscatedName("tp")
public final class class841 {
   @deob.ObfuscatedName("tp.n")
   public class67 field8557 = new class67();
   @deob.ObfuscatedName("tp.k")
   private class67 field8556;

   public class841() {
      this.field8557.field489 = this.field8557;
      this.field8557.field488 = this.field8557;
   }

   @deob.ObfuscatedName("tp.n(Lack;I)V")
   public void method14831(class67 arg0) {
      if (arg0.field488 != null) {
         arg0.method1009();
      }

      arg0.field488 = this.field8557.field488;
      arg0.field489 = this.field8557;
      arg0.field488.field489 = arg0;
      arg0.field489.field488 = arg0;
   }

   @deob.ObfuscatedName("tp.k(B)Lack;")
   public class67 method14828() {
      class67 var1 = this.field8557.field489;
      if (this.field8557 == var1) {
         this.field8556 = null;
         return null;
      } else {
         this.field8556 = var1.field489;
         return var1;
      }
   }

   @deob.ObfuscatedName("tp.d(I)Lack;")
   public class67 method14821() {
      class67 var1 = this.field8556;
      if (this.field8557 == var1) {
         this.field8556 = null;
         return null;
      } else {
         this.field8556 = var1.field489;
         return var1;
      }
   }

   @deob.ObfuscatedName("tp.b(B)V")
   public void method14822() {
      while(true) {
         class67 var1 = this.field8557.field489;
         if (this.field8557 == var1) {
            this.field8556 = null;
            return;
         }

         var1.method1009();
      }
   }

   @deob.ObfuscatedName("tp.r(I)I")
   public int method14823() {
      int var1 = 0;

      for(class67 var2 = this.field8557.field489; this.field8557 != var2; var2 = var2.field489) {
         ++var1;
      }

      return var1;
   }

   @deob.ObfuscatedName("tp.p(I)Z")
   public boolean method14825() {
      return this.field8557.field489 == this.field8557;
   }
}
