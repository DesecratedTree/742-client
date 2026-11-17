@deob.ObfuscatedName("aig")
public abstract class class225 extends class76 {
   @deob.ObfuscatedName("aig.p")
   private class420 field1526;
   @deob.ObfuscatedName("aig.o")
   private String field1525;
   @deob.ObfuscatedName("aig.a")
   private String field1524;
   @deob.ObfuscatedName("aig.x")
   private int field1527;
   @deob.ObfuscatedName("aig.s")
   private class420 field1528;

   protected class225(class428 arg0) {
      this.field1526 = arg0.field3573;
      this.field1525 = arg0.field3576;
      this.field1524 = arg0.field3577;
      this.field1527 = arg0.field3574;
      this.field1528 = arg0.field3575;
   }

   public String toString() {
      String var1 = this.field1526.toString() + " " + this.field1525;
      if (this.field1524 != null && !"".equals(this.field1524)) {
         var1 = var1 + " : " + this.field1524;
      }

      return var1;
   }

   @deob.ObfuscatedName("aig.k(I)Ljava/lang/String;")
   protected String method3118() {
      return this.field1525;
   }

   @deob.ObfuscatedName("aig.d(I)Leh;")
   public class420 method3119() {
      return this.field1526;
   }

   @deob.ObfuscatedName("aig.b(I)Leh;")
   public class420 method3120() {
      return this.field1528;
   }

   @deob.ObfuscatedName("aig.r(I)I")
   public int method3121() {
      if (class420.field3138 != this.field1526) {
         throw new class305(this, this.field1526.toString().toLowerCase());
      } else {
         return this.field1527;
      }
   }

   @deob.ObfuscatedName("aig.p(I)I")
   public abstract int method3122(int arg0);

   @deob.ObfuscatedName("aig.n(I)Z")
   public abstract boolean method3132(int arg0);
}
