@deob.ObfuscatedName("aaw")
public final class class25 extends class434 {
   @deob.ObfuscatedName("aaw.x")
   private final class197 field201;
   @deob.ObfuscatedName("aaw.l")
   private boolean field203;
   @deob.ObfuscatedName("aaw.s")
   private class12 field202;

   public class25(class197 arg0, class414 arg1) {
      super(arg0, arg1);
      this.field201 = arg0;
      this.field203 = false;
   }

   @deob.ObfuscatedName("aaw.r(Lys;Let;)Lej;")
   protected class422 method251(class979 arg0, class432 arg1) {
      return new class12((class197)arg0, this, arg1);
   }

   @deob.ObfuscatedName("aaw.l(Lej;)Z")
   public boolean method267(class422 arg0) {
      if (this.field202 == arg0) {
         return true;
      } else if (!arg0.method284()) {
         return false;
      } else {
         this.field202 = (class12)arg0;
         this.field3620 = this.method6016(arg0);
         if (this.field3620 == -1) {
            throw new IllegalArgumentException();
         } else {
            if (this.field203) {
               this.field201.method2526(this.field202.field136);
               this.field201.method2527(this.field202.field137);
               this.field201.field1271 = this.field202;
            }

            return true;
         }
      }
   }

   @deob.ObfuscatedName("aaw.g(Lep;)Laig;")
   protected class225 method250(class428 arg0) {
      return new class296(this, arg0);
   }

   @deob.ObfuscatedName("aaw.n()V")
   public void method264() {
      if (this.field202 == null) {
         throw new class298();
      } else {
         this.field201.method2526(this.field202.field136);
         this.field201.method2527(this.field202.field137);
         this.field201.field1271 = this.field202;
         this.field203 = true;
      }
   }

   @deob.ObfuscatedName("aaw.k()V")
   public void method254() {
      this.field201.method2526(0L);
      this.field201.method2527(0L);
      this.field203 = false;
      this.field201.field1271 = null;
      this.field201.method16351(1);
      this.field201.method16470((class536)null);
      this.field201.method16351(0);
      this.field201.method16470((class536)null);
   }

   @deob.ObfuscatedName("aaw.d()Z")
   public boolean method255() {
      return this.field201.field1271 == this.field202;
   }
}
