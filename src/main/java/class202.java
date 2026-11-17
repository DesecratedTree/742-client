@deob.ObfuscatedName("ahk")
public class class202 extends class52 {
   @deob.ObfuscatedName("ahk.e")
   private byte[] field1331;

   public class202() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @deob.ObfuscatedName("ahk.f(III)[B")
   public byte[] method2837(int arg0, int arg1, int arg2) {
      this.field1331 = new byte[arg0 * arg1 * arg2 * 2];
      this.method8041(arg0, arg1, arg2);
      return this.field1331;
   }

   @deob.ObfuscatedName("ahk.y(IB)V")
   protected void method816(int arg0, byte arg1) {
      int var3 = arg0 * 2;
      byte var4 = (byte)(((arg1 & 255) >> 1) + 127);
      int var10001 = var3;
      int var5 = var3 + 1;
      this.field1331[var10001] = var4;
      this.field1331[var5] = var4;
   }
}
