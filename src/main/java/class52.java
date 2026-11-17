@deob.ObfuscatedName("abw")
public class class52 extends class581 {
   @deob.ObfuscatedName("abw.h")
   private final int[] field375 = new int[this.field5297];
   @deob.ObfuscatedName("abw.g")
   private int field377;
   @deob.ObfuscatedName("abw.v")
   private int field378;
   @deob.ObfuscatedName("abw.u")
   private byte[] field376;

   protected class52(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      for(int var7 = 0; var7 < this.field5297; ++var7) {
         this.field375[var7] = (short)((int)(Math.pow((double)arg5, (double)var7) * 4096.0D));
      }

   }

   @deob.ObfuscatedName("abw.k()V")
   protected void method817() {
      this.field378 = 0;
      this.field377 = 0;
   }

   @deob.ObfuscatedName("abw.b(II)V")
   protected void method820(int arg0, int arg1) {
      this.field377 += this.field375[arg0] * arg1 >> 12;
   }

   @deob.ObfuscatedName("abw.d()V")
   protected void method819() {
      this.field377 = Math.abs(this.field377);
      if (this.field377 >= 4096) {
         this.field377 = 4095;
      }

      this.method816(this.field378++, (byte)(this.field377 >> 4));
      this.field377 = 0;
   }

   @deob.ObfuscatedName("abw.y(IB)V")
   protected void method816(int arg0, byte arg1) {
      this.field376[this.field378++] = (byte)(((arg1 & 255) >> 1) + 127);
   }
}
