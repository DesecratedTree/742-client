import jaclib.memory.Stream;

@deob.ObfuscatedName("ajw")
public class class268 extends class124 {
   public class268(int arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("ajw.iv(F)V")
   public void method3569(float arg0) {
      int var2 = Stream.floatToRawIntBits(arg0);
      this.field931[++this.field935 - 1] = (byte)(var2 >> 24);
      this.field931[++this.field935 - 1] = (byte)(var2 >> 16);
      this.field931[++this.field935 - 1] = (byte)(var2 >> 8);
      this.field931[++this.field935 - 1] = (byte)var2;
   }

   @deob.ObfuscatedName("ajw.iy(F)V")
   public void method3570(float arg0) {
      int var2 = Stream.floatToRawIntBits(arg0);
      this.field931[++this.field935 - 1] = (byte)var2;
      this.field931[++this.field935 - 1] = (byte)(var2 >> 8);
      this.field931[++this.field935 - 1] = (byte)(var2 >> 16);
      this.field931[++this.field935 - 1] = (byte)(var2 >> 24);
   }
}
