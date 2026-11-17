@deob.ObfuscatedName("ahv")
public class class213 extends class55 {
   @deob.ObfuscatedName("ahv.c")
   private byte[] field1412;

   public class213() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @deob.ObfuscatedName("ahv.ai(III)[B")
   public byte[] method2886(int arg0, int arg1, int arg2) {
      this.field1412 = new byte[arg0 * arg1 * arg2 * 2];
      this.method8041(arg0, arg1, arg2);
      return this.field1412;
   }

   @deob.ObfuscatedName("ahv.y(IB)V")
   protected void method889(int arg0, byte arg1) {
      int var3 = arg0 * 2;
      int var4 = arg1 & 255;
      int var10001 = var3;
      int var5 = var3 + 1;
      this.field1412[var10001] = -1;
      this.field1412[var5] = (byte)(var4 * 3 >> 5);
   }
}
