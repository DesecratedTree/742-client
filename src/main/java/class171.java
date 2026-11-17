@deob.ObfuscatedName("agg")
public class class171 extends class927 implements class829 {
   @deob.ObfuscatedName("agg.n(I)V")
   public void method2332() {
      class109 var1 = class109.method15110(class558.field4870, client.field2463.field832);
      var1.field814.method1772(this.field9403);
      var1.field814.method1571(this.field9402);
      var1.field814.method1571(this.field9416);
      var1.field814.method1750(this.field9407);
      var1.field814.method1750(this.field9415);
      var1.field814.method1700(this.field9418);
      var1.field814.method1772(this.field9420);
      client.field2463.method1408(var1);
   }

   @deob.ObfuscatedName("agg.a(II)V")
   public void method2326(int arg0) {
      this.field9403 = arg0;
   }

   @deob.ObfuscatedName("agg.x(II)V")
   public void method2327(int arg0) {
      this.field9407 |= arg0;
   }

   @deob.ObfuscatedName("agg.s(II)V")
   public void method2336(int arg0) {
      this.field9420 = arg0;
   }

   @deob.ObfuscatedName("agg.l(IIB)V")
   public void method2329(int arg0, int arg1) {
      if (arg0 == 0 && arg1 > 32767) {
         arg1 = 32767;
      } else if (arg1 > 8388607) {
         arg1 = 8388607;
      }

      switch(arg0) {
      case 0:
         this.field9415 = arg1;
         break;
      case 1:
         this.field9402 = arg1;
         break;
      case 2:
         this.field9416 = arg1;
         break;
      case 3:
         this.field9418 = arg1;
      }

   }
}
