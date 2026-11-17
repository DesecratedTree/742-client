@deob.ObfuscatedName("di")
public class class394 {
   @deob.ObfuscatedName("di.n")
   public boolean field2896 = false;
   @deob.ObfuscatedName("di.d")
   public int field2897;
   @deob.ObfuscatedName("di.r")
   public int field2898;
   @deob.ObfuscatedName("di.b")
   public int field2899;
   @deob.ObfuscatedName("di.k")
   public int field2900;
   @deob.ObfuscatedName("di.p")
   public int field2901;

   @deob.ObfuscatedName("di.n(II)Z")
   public boolean method5395(int arg0, int arg1) {
      if (!this.field2896) {
         return false;
      } else {
         int var3 = this.field2899 - this.field2900;
         int var4 = this.field2898 - this.field2897;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = arg0 * var3 + arg1 * var4 - (this.field2900 * var3 + this.field2897 * var4);
         if (var6 <= 0) {
            int var7 = this.field2900 - arg0;
            int var8 = this.field2897 - arg1;
            return var7 * var7 + var8 * var8 < this.field2901 * this.field2901;
         } else if (var6 > var5) {
            int var9 = this.field2899 - arg0;
            int var10 = this.field2898 - arg1;
            return var9 * var9 + var10 * var10 < this.field2901 * this.field2901;
         } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2900 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2897 - arg1;
            return var12 * var12 + var13 * var13 < this.field2901 * this.field2901;
         }
      }
   }
}
