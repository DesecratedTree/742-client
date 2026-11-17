@deob.ObfuscatedName("ajf")
public class class251 extends class124 {
   @deob.ObfuscatedName("ajf.v")
   private static final int[] field1656 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @deob.ObfuscatedName("ajf.g")
   private int field1655;
   @deob.ObfuscatedName("ajf.u")
   private class872 field1657;

   public class251(int arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("ajf.iv(Lut;I)V")
   public void method3384(class872 arg0) {
      this.field1657 = arg0;
   }

   @deob.ObfuscatedName("ajf.iy(II)V")
   public void method3385(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 + this.field1657.method15265());
   }

   @deob.ObfuscatedName("ajf.if(B)Z")
   public boolean method3402() {
      int var1 = this.field931[this.field935] - this.field1657.method15269() & 255;
      return var1 >= 128;
   }

   @deob.ObfuscatedName("ajf.ik(B)I")
   public int method3403() {
      int var1 = this.field931[++this.field935 - 1] - this.field1657.method15265() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field931[++this.field935 - 1] - this.field1657.method15265() & 255);
   }

   @deob.ObfuscatedName("ajf.ix([BIIB)V")
   public void method3388(byte[] arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < arg2; ++var4) {
         arg0[arg1 + var4] = (byte)(this.field931[++this.field935 - 1] - this.field1657.method15265());
      }

   }

   @deob.ObfuscatedName("ajf.ir(B)V")
   public void method3389() {
      this.field1655 = this.field935 * 8;
   }

   @deob.ObfuscatedName("ajf.ia(II)I")
   public int method3394(int arg0) {
      int var2 = this.field1655 >> 3;
      int var3 = 8 - (this.field1655 & 7);
      int var4 = 0;
      this.field1655 += arg0;

      while(arg0 > var3) {
         var4 += (this.field931[var2++] & field1656[var3]) << arg0 - var3;
         arg0 -= var3;
         var3 = 8;
      }

      int var5;
      if (arg0 == var3) {
         var5 = (this.field931[var2] & field1656[var3]) + var4;
      } else {
         var5 = (this.field931[var2] >> var3 - arg0 & field1656[arg0]) + var4;
      }

      return var5;
   }

   @deob.ObfuscatedName("ajf.iw(I)V")
   public void method3391() {
      this.field935 = (this.field1655 + 7) / 8;
   }

   @deob.ObfuscatedName("ajf.ic(IB)I")
   public int method3390(int arg0) {
      return arg0 * 8 - this.field1655;
   }
}
