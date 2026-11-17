@deob.ObfuscatedName("adq")
public class class100 extends class674 {
   @deob.ObfuscatedName("adq.b")
   public final short[][] field775;
   @deob.ObfuscatedName("adq.r")
   public double field774;

   public class100(short[][] arg0, double arg1) {
      this.field775 = arg0;
      this.field774 = arg1;
   }

   @deob.ObfuscatedName("adq.n(S)J")
   public long method1344() {
      return (long)(this.field775.length << 32 | this.field775[0].length);
   }
}
