@deob.ObfuscatedName("cc")
public final class class361 {
   @deob.ObfuscatedName("cc.k")
   private final int field2342;
   @deob.ObfuscatedName("cc.n")
   private class875 field2341;

   public class361(int arg0) {
      this.field2342 = arg0;
   }

   @deob.ObfuscatedName("cc.n(I)V")
   public void method4445() {
      if (this.field2341 != null) {
         this.field2341.method15312();
      }

   }

   @deob.ObfuscatedName("cc.k(III)V")
   public void method4446(int arg0, int arg1) {
      if (this.field2341 == null) {
         this.field2341 = new class875(this.field2342);
      }

      class108 var3 = (class108)this.field2341.method15322((long)arg0);
      if (var3 != null) {
         var3.field811 = arg1;
      } else {
         class108 var4 = new class108(arg1);
         this.field2341.method15311(var4, (long)arg0);
      }

   }

   @deob.ObfuscatedName("cc.d(IB)I")
   public int method4447(int arg0) {
      class108 var2 = (class108)this.field2341.method15322((long)arg0);
      if (var2 != null) {
         return var2.field811;
      } else {
         class870 var3 = Statics.field490.method15356(arg0);
         return var3.field8827 != 'i' ? -1 : 0;
      }
   }

   @deob.ObfuscatedName("cc.b(II)I")
   public int method4444(int arg0) {
      class822 var2 = Statics.field3060.method14243(arg0);
      int var3 = var2.field8440;
      int var4 = var2.field8441 == 31 ? -1 : (1 << var2.field8441 + 1) - 1;
      return (this.method4447(var3) & var4) >>> var2.field8439;
   }
}
