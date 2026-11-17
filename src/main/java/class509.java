@deob.ObfuscatedName("hp")
public class class509 {
   @deob.ObfuscatedName("hp.k")
   private long field4062;
   @deob.ObfuscatedName("hp.n")
   private int field4061;

   public class509(class496 arg0) {
      this.field4062 = (long)arg0.field4001;
      this.field4061 = 1;
   }

   public class509(class496[] arg0) {
      for(int var2 = 0; var2 < arg0.length; ++var2) {
         this.method7140(arg0[var2]);
      }

   }

   @deob.ObfuscatedName("hp.n()I")
   public final int method7137() {
      return this.field4061;
   }

   @deob.ObfuscatedName("hp.k(I)Lhc;")
   public final class496 method7138(int arg0) {
      return class496.method7096(this.method7141(arg0));
   }

   @deob.ObfuscatedName("hp.d(I)I")
   private final int method7141(int arg0) {
      return (int)(this.field4062 >> class496.field3994 * arg0) & 15;
   }

   @deob.ObfuscatedName("hp.b(Lhc;)V")
   private final void method7140(class496 arg0) {
      this.field4062 |= (long)(arg0.field4001 << class496.field3994 * this.field4061++);
   }
}
