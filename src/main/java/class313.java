@deob.ObfuscatedName("als")
public class class313 extends class264 {
   @deob.ObfuscatedName("als.u")
   public byte field1968;
   @deob.ObfuscatedName("als.l")
   public int field1967;
   @deob.ObfuscatedName("als.s")
   public class124 field1969;

   @deob.ObfuscatedName("als.n(B)[B")
   public byte[] method3514() {
      if (!this.field1758 && this.field1969.field935 >= this.field1969.field931.length - this.field1968) {
         return this.field1969.field931;
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("als.k(I)I")
   public int method3515() {
      return this.field1969 == null ? 0 : this.field1969.field935 * 100 / (this.field1969.field931.length - this.field1968);
   }
}
