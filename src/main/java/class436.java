@deob.ObfuscatedName("ex")
public class class436 {
   @deob.ObfuscatedName("ex.n")
   public final int field3629;
   @deob.ObfuscatedName("ex.k")
   public final int field3625;
   @deob.ObfuscatedName("ex.d")
   public final int[] field3626;
   @deob.ObfuscatedName("ex.b")
   public final int[] field3627;
   @deob.ObfuscatedName("ex.r")
   public final class826 field3624;
   @deob.ObfuscatedName("ex.p")
   public final int field3628;

   public class436(int arg0, int arg1, int[] arg2, int[] arg3, class826 arg4, int arg5) {
      this.field3629 = arg0;
      this.field3625 = arg1;
      this.field3626 = arg2;
      this.field3627 = arg3;
      this.field3624 = arg4;
      this.field3628 = arg5;
   }

   @deob.ObfuscatedName("ex.n(IIB)Z")
   public boolean method6118(int arg0, int arg1) {
      if (arg1 >= 0 && arg1 < this.field3627.length) {
         int var3 = this.field3627[arg1];
         if (arg0 >= var3 && arg0 <= this.field3626[arg1] + var3) {
            return true;
         }
      }

      return false;
   }
}
