@deob.ObfuscatedName("mm")
public class class649 {
   @deob.ObfuscatedName("mm.n")
   public int field5930;
   @deob.ObfuscatedName("mm.k")
   public int field5931;
   @deob.ObfuscatedName("mm.d")
   public int[] field5932;
   @deob.ObfuscatedName("mm.b")
   public int[] field5933;

   public class649() {
      class86.method1202(16);
      this.field5930 = class86.method1164() != 0 ? class86.method1202(4) + 1 : 1;
      if (class86.method1164() != 0) {
         class86.method1202(8);
      }

      class86.method1202(2);
      if (this.field5930 > 1) {
         this.field5931 = class86.method1202(4);
      }

      this.field5932 = new int[this.field5930];
      this.field5933 = new int[this.field5930];

      for(int var1 = 0; var1 < this.field5930; ++var1) {
         class86.method1202(8);
         this.field5932[var1] = class86.method1202(8);
         this.field5933[var1] = class86.method1202(8);
      }

   }
}
