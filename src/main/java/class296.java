@deob.ObfuscatedName("akx")
public final class class296 extends class225 {
   @deob.ObfuscatedName("akx.u")
   public int[] field1880 = null;
   @deob.ObfuscatedName("akx.v")
   public int[] field1881 = null;
   @deob.ObfuscatedName("akx.l")
   private class25 field1879;

   public class296(class25 arg0, class428 arg1) {
      super(arg1);
      this.field1879 = arg0;
      this.field1880 = arg1.field3578;
      this.field1881 = arg1.field3579;
   }

   @deob.ObfuscatedName("akx.n(I)Z")
   public boolean method3132(int arg0) {
      return true;
   }

   @deob.ObfuscatedName("akx.y()I")
   public final int method3811() {
      return this.field1880[this.field1879.method6018()];
   }

   @deob.ObfuscatedName("akx.j()I")
   public final int method3812() {
      return this.field1881[this.field1879.method6018()];
   }

   @deob.ObfuscatedName("akx.p(I)I")
   public final int method3122(int arg0) {
      int var2 = this.field1880[arg0];
      int var3 = this.field1881[arg0];
      if (var2 != -1) {
         return var2;
      } else {
         return var3 != -1 ? var3 | 65536 : -1;
      }
   }
}
