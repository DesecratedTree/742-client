@deob.ObfuscatedName("f")
public class class439 implements class865 {
   @deob.ObfuscatedName("f.n")
   private static int[] field3648 = new int[32];
   @deob.ObfuscatedName("f.a")
   private class875 field3652 = new class875(128);
   @deob.ObfuscatedName("f.p")
   private int[] field3650 = new int[Statics.field8710.field4894];
   @deob.ObfuscatedName("f.o")
   public int[] field3651 = new int[Statics.field8710.field4894];

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field3648[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @deob.ObfuscatedName("f.n(ZB)I")
   public int method6142(boolean arg0) {
      long var2 = class431.method2169();

      for(class97 var4 = (class97)(arg0 ? this.field3652.method15313() : this.field3652.method15314()); var4 != null; var4 = (class97)this.field3652.method15314()) {
         if ((var4.field730 & 4611686018427387903L) < var2) {
            if ((var4.field730 & 4611686018427387904L) != 0L) {
               int var5 = (int)var4.field6137;
               this.field3651[var5] = this.field3650[var5];
               var4.method9864();
               return var5;
            }

            var4.method9864();
         }
      }

      return -1;
   }

   @deob.ObfuscatedName("f.k(I)V")
   public void method6141() {
      for(int var1 = 0; var1 < Statics.field8710.field4894; ++var1) {
         this.field3650[var1] = 0;
         this.field3651[var1] = 0;
      }

      this.field3652 = new class875(128);
   }

   @deob.ObfuscatedName("f.d(IIB)V")
   public void method6144(int arg0, int arg1) {
      this.field3651[arg0] = arg1;
      class97 var3 = (class97)this.field3652.method15322((long)arg0);
      if (var3 != null) {
         var3.field730 = class431.method2169() + 500L;
      } else {
         class97 var4 = new class97(class431.method2169() + 500L);
         this.field3652.method15311(var4, (long)arg0);
      }

   }

   @deob.ObfuscatedName("f.b(III)V")
   public void method6145(int arg0, int arg1) {
      this.field3650[arg0] = arg1;
      class97 var3 = (class97)this.field3652.method15322((long)arg0);
      if (var3 != null) {
         if (var3.field730 != 4611686018427387905L) {
            var3.field730 = class431.method2169() + 500L | 4611686018427387904L;
         }
      } else {
         class97 var4 = new class97(4611686018427387905L);
         this.field3652.method15311(var4, (long)arg0);
      }

   }

   @deob.ObfuscatedName("f.r(III)V")
   public void method6147(int arg0, int arg1) {
      class726 var3 = Statics.field5610.method10754(arg0);
      int var4 = var3.field6688;
      int var5 = var3.field6687;
      int var6 = var3.field6689;
      int var7 = field3648[var6 - var5];
      if (arg1 < 0 || arg1 > var7) {
         arg1 = 0;
      }

      int var8 = var7 << var5;
      this.method6144(var4, this.field3651[var4] & ~var8 | arg1 << var5 & var8);
   }

   @deob.ObfuscatedName("f.p(IIB)V")
   public void method6146(int arg0, int arg1) {
      class726 var3 = Statics.field5610.method10754(arg0);
      int var4 = var3.field6688;
      int var5 = var3.field6687;
      int var6 = var3.field6689;
      int var7 = field3648[var6 - var5];
      if (arg1 < 0 || arg1 > var7) {
         arg1 = 0;
      }

      int var8 = var7 << var5;
      this.method6145(var4, this.field3650[var4] & ~var8 | arg1 << var5 & var8);
   }

   @deob.ObfuscatedName("f.o(IB)I")
   public int method5491(int arg0) {
      return this.field3651[arg0];
   }

   @deob.ObfuscatedName("f.a(II)I")
   public int method5490(int arg0) {
      class726 var2 = Statics.field5610.method10754(arg0);
      int var3 = var2.field6688;
      int var4 = var2.field6687;
      int var5 = var2.field6689;
      int var6 = field3648[var5 - var4];
      return this.field3651[var3] >> var4 & var6;
   }
}
