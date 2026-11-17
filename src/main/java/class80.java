@deob.ObfuscatedName("acx")
public class class80 extends class674 {
   @deob.ObfuscatedName("acx.b")
   public int field578 = Integer.MAX_VALUE;
   @deob.ObfuscatedName("acx.r")
   public int field570 = Integer.MIN_VALUE;
   @deob.ObfuscatedName("acx.p")
   public int field572 = Integer.MAX_VALUE;
   @deob.ObfuscatedName("acx.o")
   public int field573 = Integer.MIN_VALUE;
   @deob.ObfuscatedName("acx.a")
   public int field576 = Integer.MAX_VALUE;
   @deob.ObfuscatedName("acx.x")
   public int field575 = Integer.MIN_VALUE;
   @deob.ObfuscatedName("acx.s")
   public int field574 = Integer.MAX_VALUE;
   @deob.ObfuscatedName("acx.l")
   public int field577 = Integer.MIN_VALUE;
   @deob.ObfuscatedName("acx.u")
   public class99 field571;

   public class80(class99 arg0) {
      this.field571 = arg0;
   }

   @deob.ObfuscatedName("acx.n(III)Z")
   public boolean method1106(int arg0, int arg1) {
      if (arg0 >= this.field578 && arg0 <= this.field570 && arg1 >= this.field572 && arg1 <= this.field573) {
         return true;
      } else {
         return arg0 >= this.field576 && arg0 <= this.field575 && arg1 >= this.field574 && arg1 <= this.field577;
      }
   }
}
