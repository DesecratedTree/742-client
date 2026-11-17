@deob.ObfuscatedName("ald")
public class class302 extends class224 {
   @deob.ObfuscatedName("ald.x")
   public byte[] field1910;

   public class302(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field1520 = arg0;
      this.field1910 = arg1;
      this.field1521 = arg2;
      this.field1522 = arg3;
   }

   @deob.ObfuscatedName("ald.p(Lmc;)Lald;")
   public class302 method3889(class639 arg0) {
      this.field1910 = arg0.method9213(this.field1910);
      this.field1520 = arg0.method9222(this.field1520);
      if (this.field1522 == this.field1521) {
         this.field1521 = this.field1522 = arg0.method9221(this.field1521);
      } else {
         this.field1521 = arg0.method9221(this.field1521);
         this.field1522 = arg0.method9221(this.field1522);
         if (this.field1522 == this.field1521) {
            --this.field1521;
         }
      }

      return this;
   }

   @deob.ObfuscatedName("ald.n()I")
   public int method3113() {
      return this.field1910.length;
   }

   @deob.ObfuscatedName("ald.k(III)Laiq;")
   public class235 method3111(int arg0, int arg1, int arg2) {
      return this.field1910 != null && this.field1910.length != 0 ? new class294(this, arg0, arg1, arg2) : null;
   }
}
