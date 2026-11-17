@deob.ObfuscatedName("cv")
public final class class380 {
   @deob.ObfuscatedName("cv.k")
   private final int field2764;
   @deob.ObfuscatedName("cv.n")
   private class875 field2765;

   public class380(int arg0) {
      this.field2764 = arg0;
   }

   @deob.ObfuscatedName("cv.n(I)V")
   public void method5194() {
      if (this.field2765 != null) {
         this.field2765.method15312();
      }

   }

   @deob.ObfuscatedName("cv.k(IIB)V")
   public void method5186(int arg0, int arg1) {
      if (this.field2765 == null) {
         this.field2765 = new class875(this.field2764);
      }

      class108 var3 = (class108)this.field2765.method15322((long)arg0);
      if (var3 != null) {
         var3.field811 = arg1;
      } else {
         class108 var4 = new class108(arg1);
         this.field2765.method15311(var4, (long)arg0);
      }

   }

   @deob.ObfuscatedName("cv.d(II)I")
   public int method5187(int arg0) {
      class108 var2 = (class108)this.field2765.method15322((long)arg0);
      if (var2 != null) {
         return var2.field811;
      } else {
         class561 var3 = Statics.field8710.method7908(arg0);
         return var3.field4904 != 'i' ? -1 : 0;
      }
   }

   @deob.ObfuscatedName("cv.b(II)I")
   public int method5188(int arg0) {
      class726 var2 = Statics.field5610.method10754(arg0);
      int var3 = var2.field6688;
      int var4 = var2.field6689 == 31 ? -1 : (1 << var2.field6689 + 1) - 1;
      return (this.method5187(var3) & var4) >>> var2.field6687;
   }
}
