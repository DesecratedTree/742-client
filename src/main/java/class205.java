@deob.ObfuscatedName("ahn")
public class class205 extends class55 {
   @deob.ObfuscatedName("ahn.c")
   private byte[] field1365;

   public class205() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @deob.ObfuscatedName("ahn.ai(III)[B")
   public byte[] method2848(int arg0, int arg1, int arg2) {
      this.field1365 = new byte[arg0 * arg1 * arg2 * 2];
      this.method8041(arg0, arg1, arg2);
      return this.field1365;
   }

   @deob.ObfuscatedName("ahn.y(IB)V")
   protected void method889(int arg0, byte arg1) {
      int var3 = arg0 * 2;
      int var4 = arg1 & 255;
      int var10001 = var3;
      int var5 = var3 + 1;
      this.field1365[var10001] = (byte)(var4 * 3 >> 5);
      this.field1365[var5] = (byte)(var4 * 3 >> 5);
   }
}
