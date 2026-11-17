@deob.ObfuscatedName("dg")
public class class392 {
   @deob.ObfuscatedName("dg.n")
   private final int[] field2889;
   @deob.ObfuscatedName("dg.k")
   private final int[] field2892;
   @deob.ObfuscatedName("dg.d")
   private final int[] field2890;
   @deob.ObfuscatedName("dg.b")
   private final int[] field2891;
   @deob.ObfuscatedName("dg.r")
   private final int[] field2893;
   @deob.ObfuscatedName("dg.p")
   private final int[] field2888;
   @deob.ObfuscatedName("dg.o")
   private final int[] field2894;

   public class392(class124 arg0) {
      int var2 = arg0.method1604();
      this.field2889 = new int[var2];
      this.field2892 = new int[var2];
      this.field2890 = new int[var2];
      this.field2891 = new int[var2];
      this.field2893 = new int[var2];
      this.field2888 = new int[var2];
      this.field2894 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field2889[var3] = arg0.method1587() - 5120;
         this.field2890[var3] = arg0.method1587() - 5120;
         this.field2892[var3] = arg0.method1723();
         this.field2893[var3] = arg0.method1587() - 5120;
         this.field2894[var3] = arg0.method1587() - 5120;
         this.field2888[var3] = arg0.method1723();
         this.field2891[var3] = arg0.method1723();
      }

   }

   @deob.ObfuscatedName("dg.n(II)V")
   public void method5388(int arg0) {
      int[][] var2 = new int[this.field2889.length << 1][4];

      for(int var3 = 0; var3 < this.field2889.length; ++var3) {
         var2[var3 * 2][0] = this.field2889[var3];
         var2[var3 * 2][1] = this.field2892[var3];
         var2[var3 * 2][2] = this.field2890[var3];
         var2[var3 * 2][3] = this.field2891[var3];
         var2[var3 * 2 + 1][0] = this.field2893[var3];
         var2[var3 * 2 + 1][1] = this.field2888[var3];
         var2[var3 * 2 + 1][2] = this.field2894[var3];
         var2[var3 * 2 + 1][3] = this.field2891[var3];
      }

      client.field2520[arg0] = var2;
   }
}
