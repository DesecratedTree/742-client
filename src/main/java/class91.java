@deob.ObfuscatedName("adh")
public class class91 extends class674 {
   @deob.ObfuscatedName("adh.b")
   private int field695;
   @deob.ObfuscatedName("adh.r")
   private int field691;
   @deob.ObfuscatedName("adh.p")
   private int field697;
   @deob.ObfuscatedName("adh.o")
   private int field692;
   @deob.ObfuscatedName("adh.a")
   private int field693;
   @deob.ObfuscatedName("adh.x")
   public int field694;
   @deob.ObfuscatedName("adh.s")
   public int field689;
   @deob.ObfuscatedName("adh.l")
   public int field696;
   @deob.ObfuscatedName("adh.u")
   public int field690;

   public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      this.field695 = arg0;
      this.field691 = arg1;
      this.field697 = arg2;
      this.field692 = arg3;
      this.field693 = arg4;
      this.field694 = arg5;
      this.field689 = arg6;
      this.field696 = arg7;
      this.field690 = arg8;
   }

   @deob.ObfuscatedName("adh.n(III)Z")
   public boolean method1277(int arg0, int arg1) {
      return arg0 >= this.field691 && arg0 <= this.field692 && arg1 >= this.field697 && arg1 <= this.field693;
   }

   @deob.ObfuscatedName("adh.k(IIII)Z")
   public boolean method1278(int arg0, int arg1, int arg2) {
      return this.field695 == arg0 && arg1 >= this.field691 && arg1 <= this.field692 && arg2 >= this.field697 && arg2 <= this.field693;
   }

   @deob.ObfuscatedName("adh.d(III)Z")
   public boolean method1276(int arg0, int arg1) {
      return arg0 >= this.field694 && arg0 <= this.field696 && arg1 >= this.field689 && arg1 <= this.field690;
   }

   @deob.ObfuscatedName("adh.b(II[IB)V")
   public void method1279(int arg0, int arg1, int[] arg2) {
      arg2[0] = this.field695;
      arg2[1] = this.field691 - this.field694 + arg0;
      arg2[2] = this.field697 - this.field689 + arg1;
   }

   @deob.ObfuscatedName("adh.r(II[II)V")
   public void method1280(int arg0, int arg1, int[] arg2) {
      arg2[0] = 0;
      arg2[1] = this.field694 - this.field691 + arg0;
      arg2[2] = this.field689 - this.field697 + arg1;
   }
}
