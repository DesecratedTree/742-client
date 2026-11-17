@deob.ObfuscatedName("va")
public class class880 {
   @deob.ObfuscatedName("va.r")
   public int[] field8879 = new int[3];
   @deob.ObfuscatedName("va.p")
   public int[] field8874 = new int[3];
   @deob.ObfuscatedName("va.o")
   public int[] field8880 = new int[2];
   @deob.ObfuscatedName("va.a")
   public int[] field8881 = new int[2];
   @deob.ObfuscatedName("va.x")
   public short[] field8882;
   @deob.ObfuscatedName("va.s")
   public short[] field8883;

   public class880(class899 arg0) {
      this.field8879[0] = arg0.field9154;
      this.field8879[1] = arg0.field9155;
      this.field8879[2] = arg0.field9145;
      this.field8874[0] = arg0.field9187;
      this.field8874[1] = arg0.field9190;
      this.field8874[2] = arg0.field9159;
      this.field8880[0] = arg0.field9166;
      this.field8880[1] = arg0.field9167;
      this.field8881[0] = arg0.field9135;
      this.field8881[1] = arg0.field9169;
      if (arg0.field9146 != null) {
         this.field8882 = new short[arg0.field9146.length];
         System.arraycopy(arg0.field9146, 0, this.field8882, 0, this.field8882.length);
      }

      if (arg0.field9134 != null) {
         this.field8883 = new short[arg0.field9134.length];
         System.arraycopy(arg0.field9134, 0, this.field8883, 0, this.field8883.length);
      }

   }
}
