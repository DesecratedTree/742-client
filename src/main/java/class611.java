@deob.ObfuscatedName("lb")
public class class611 {
   @deob.ObfuscatedName("lb.a")
   public byte[][][] field5520;

   public class611(int arg0, int arg1, int arg2) {
      this.field5520 = new byte[arg0][arg1][arg2];
   }

   @deob.ObfuscatedName("lb.n(I)V")
   public void method8757() {
      for(int var1 = 0; var1 < this.field5520.length; ++var1) {
         for(int var2 = 0; var2 < this.field5520[0].length; ++var2) {
            for(int var3 = 0; var3 < this.field5520[0][0].length; ++var3) {
               this.field5520[var1][var2][var3] = 0;
            }
         }
      }

   }

   @deob.ObfuscatedName("lb.k(III)Z")
   public boolean method8753(int arg0, int arg1) {
      if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field5520[3].length && arg1 < this.field5520[3][arg0].length) {
         return (this.field5520[3][arg0][arg1] & 2) != 0;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("lb.d(IIB)Z")
   public boolean method8746(int arg0, int arg1) {
      if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field5520[1].length && arg1 < this.field5520[1][arg0].length) {
         return (this.field5520[1][arg0][arg1] & 2) != 0;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("lb.b(IIIII)Z")
   public boolean method8750(int arg0, int arg1, int arg2, int arg3) {
      if ((this.field5520[0][arg2][arg3] & 2) != 0) {
         return true;
      } else if ((this.field5520[arg1][arg2][arg3] & 16) != 0) {
         return false;
      } else {
         return this.method8748(arg1, arg2, arg3) == arg0;
      }
   }

   @deob.ObfuscatedName("lb.r(IIIB)I")
   private int method8748(int arg0, int arg1, int arg2) {
      if ((this.field5520[arg0][arg1][arg2] & 8) != 0) {
         return 0;
      } else {
         return arg0 > 0 && (this.field5520[1][arg1][arg2] & 2) != 0 ? arg0 - 1 : arg0;
      }
   }
}
