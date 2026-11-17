@deob.ObfuscatedName("ahg")
public class class198 extends class1010 {
   @deob.ObfuscatedName("ahg.r")
   private final int field1286;
   @deob.ObfuscatedName("ahg.p")
   private final int field1285;
   @deob.ObfuscatedName("ahg.o")
   private final int field1284;

   public class198(class124 arg0) {
      super(arg0);
      int var2 = arg0.method1591();
      this.field1286 = var2 >>> 16;
      this.field1285 = var2 & 65535;
      this.field1284 = arg0.method1688();
   }

   @deob.ObfuscatedName("ahg.k(I)V")
   public void method74() {
      int var1 = this.field1286 * 512 + 256;
      int var2 = this.field1285 * 512 + 256;
      int var3 = this.field1284;
      if (var3 < 3 && client.field2468.method9592().method8746(this.field1286, this.field1285)) {
         ++var3;
      }

      class301 var4 = new class301(client.field2468.method9639(), this.field10639, 0, this.field1284, var3, var1, client.method5777(var1, var2, this.field1284) - this.field10640, var2, this.field1286, this.field1286, this.field1285, this.field1285, this.field10638, false, 0);
      client.field2494.method15311(new class244(var4), (long)(this.field1286 << 16 | this.field1285));
   }
}
