@deob.ObfuscatedName("ahe")
public class class196 extends class52 {
   @deob.ObfuscatedName("ahe.e")
   private byte[] field1252;

   public class196() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @deob.ObfuscatedName("ahe.f(III)[B")
   public byte[] method2496(int arg0, int arg1, int arg2) {
      this.field1252 = new byte[arg0 * arg1 * arg2 * 2];
      this.method8041(arg0, arg1, arg2);
      return this.field1252;
   }

   @deob.ObfuscatedName("ahe.y(IB)V")
   protected void method816(int arg0, byte arg1) {
      int var3 = arg0 * 2;
      byte var4 = (byte)(((arg1 & 255) >> 1) + 127);
      int var10001 = var3;
      int var5 = var3 + 1;
      this.field1252[var10001] = var4;
      this.field1252[var5] = var4;
   }
}
