@deob.ObfuscatedName("pf")
public class class723 {
   @deob.ObfuscatedName("pf.n")
   public int field6675;
   @deob.ObfuscatedName("pf.k")
   public int field6676;
   @deob.ObfuscatedName("pf.d")
   public int field6677;

   public class723() {
      this.field6675 = -1;
   }

   public class723(int arg0, int arg1, int arg2) {
      this.field6675 = arg0;
      this.field6676 = arg1;
      this.field6677 = arg2;
   }

   public class723(int arg0) {
      if (arg0 == -1) {
         this.field6675 = -1;
      } else {
         this.field6675 = arg0 >> 28 & 3;
         this.field6676 = arg0 >> 14 & 16383;
         this.field6677 = arg0 & 16383;
      }

   }

   public String toString() {
      return this.field6675 + "," + (this.field6676 >> 6) + "," + (this.field6677 >> 6) + "," + (this.field6676 & 63) + "," + (this.field6677 & 63);
   }
}
