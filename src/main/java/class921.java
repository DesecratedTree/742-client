@deob.ObfuscatedName("wo")
public class class921 {
   @deob.ObfuscatedName("wo.n")
   public long field9378;
   @deob.ObfuscatedName("wo.k")
   public int[] field9380;
   @deob.ObfuscatedName("wo.d")
   public short[] field9379;
   @deob.ObfuscatedName("wo.b")
   public short[] field9381;

   public class921(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      this.field9378 = arg0;
      this.field9380 = arg1;
      this.field9379 = arg2;
      this.field9381 = arg3;
   }

   public class921(class915 arg0, boolean arg1) {
      if (arg1) {
         this.field9380 = new int[arg0.field9324.length];
         System.arraycopy(arg0.field9324, 0, this.field9380, 0, this.field9380.length);
      } else {
         this.field9380 = new int[arg0.field9298.length];
         System.arraycopy(arg0.field9298, 0, this.field9380, 0, this.field9380.length);
      }

      if (arg0.field9289 != null) {
         this.field9379 = new short[arg0.field9289.length];
         System.arraycopy(arg0.field9289, 0, this.field9379, 0, this.field9379.length);
      }

      if (arg0.field9292 != null) {
         this.field9381 = new short[arg0.field9292.length];
         System.arraycopy(arg0.field9292, 0, this.field9381, 0, this.field9381.length);
      }

   }
}
