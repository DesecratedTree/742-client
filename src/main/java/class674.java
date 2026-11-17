@deob.ObfuscatedName("nk")
public class class674 {
   @deob.ObfuscatedName("nk.n")
   public long field6137;
   @deob.ObfuscatedName("nk.d")
   public class674 field6135;
   @deob.ObfuscatedName("nk.k")
   public class674 field6136;

   @deob.ObfuscatedName("nk.v(I)V")
   public void method9864() {
      if (this.field6135 != null) {
         this.field6135.field6136 = this.field6136;
         this.field6136.field6135 = this.field6135;
         this.field6136 = null;
         this.field6135 = null;
      }
   }

   @deob.ObfuscatedName("nk.g(I)Z")
   public boolean method9863() {
      return this.field6135 != null;
   }
}
