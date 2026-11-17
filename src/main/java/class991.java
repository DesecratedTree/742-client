@deob.ObfuscatedName("zd")
public class class991 extends class389 {
   @deob.ObfuscatedName("zd.k")
   private final long field10550;
   @deob.ObfuscatedName("zd.d")
   private final int field10549;

   public class991(class124 arg0, boolean arg1) {
      super(arg0);
      int var3 = arg0.method1587();
      if (arg1) {
         this.field10550 = 4294967296L | (long)var3;
      } else {
         this.field10550 = (long)var3;
      }

      this.field10549 = arg0.method1591();
   }

   @deob.ObfuscatedName("zd.k(I)V")
   public void method74() {
      class108 var1 = (class108)class397.field2950.method15322(this.field10550);
      if (var1 != null) {
         var1.field811 = this.field10549;
      } else {
         class397.field2950.method15311(new class108(this.field10549), this.field10550);
      }
   }
}
