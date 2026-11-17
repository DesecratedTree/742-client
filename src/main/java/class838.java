@deob.ObfuscatedName("tm")
public class class838 {
   @deob.ObfuscatedName("tm.p")
   public boolean field8545 = false;
   @deob.ObfuscatedName("tm.k")
   public int field8541;
   @deob.ObfuscatedName("tm.d")
   public int field8542;
   @deob.ObfuscatedName("tm.n")
   public int field8544;
   @deob.ObfuscatedName("tm.b")
   public class247 field8540;
   @deob.ObfuscatedName("tm.r")
   public class247 field8543;

   @deob.ObfuscatedName("tm.n(Lst;Lsh;II[II)Z")
   public final boolean method14789(class818 arg0, class806 arg1, int arg2, int arg3, int[] arg4) {
      if (!this.field8545) {
         if (arg2 >= arg4.length) {
            return false;
         } else {
            this.field8541 = arg4[arg2];
            this.field8540 = arg0.method14480(this.field8541 >> 16);
            this.field8541 &= 65535;
            if (this.field8540 != null) {
               if (arg1.field8372 && arg3 != -1 && arg3 < arg4.length) {
                  this.field8542 = arg4[arg3];
                  this.field8543 = arg0.method14480(this.field8542 >> 16);
                  this.field8542 &= 65535;
               }

               if (arg1.field8371) {
                  this.field8544 |= 512;
               }

               if (this.field8540.method3356(this.field8541)) {
                  this.field8544 |= 128;
               }

               if (this.field8540.method3368(this.field8541)) {
                  this.field8544 |= 256;
               }

               if (this.field8540.method3365(this.field8541)) {
                  this.field8544 |= 1024;
               }

               if (this.field8543 != null) {
                  if (this.field8543.method3356(this.field8542)) {
                     this.field8544 |= 128;
                  }

                  if (this.field8543.method3368(this.field8542)) {
                     this.field8544 |= 256;
                  }

                  if (this.field8543.method3365(this.field8542)) {
                     this.field8544 |= 1024;
                  }
               }

               this.field8544 |= 32;
               this.field8545 = true;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("tm.k(S)V")
   public final void method14790() {
      this.field8545 = false;
      this.field8544 = 0;
      this.field8543 = null;
      this.field8540 = null;
   }
}
