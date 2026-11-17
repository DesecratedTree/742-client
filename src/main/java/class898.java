@deob.ObfuscatedName("vs")
public class class898 implements class754 {
   @deob.ObfuscatedName("vs.k")
   public int field9114;
   @deob.ObfuscatedName("vs.n")
   public int field9115;
   @deob.ObfuscatedName("vs.b")
   public int field9116;
   @deob.ObfuscatedName("vs.r")
   public int field9117;
   @deob.ObfuscatedName("vs.p")
   public int field9118;
   @deob.ObfuscatedName("vs.d")
   public int field9119;
   @deob.ObfuscatedName("vs.o")
   public boolean field9113;

   @deob.ObfuscatedName("vs.n()J")
   public long method11192() {
      long[] var1 = class124.field929;
      long var2 = -1L;
      long var4 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)this.field9115) & 255L)];
      long var6 = var4 >>> 8 ^ var1[(int)((var4 ^ (long)(this.field9114 >> 8)) & 255L)];
      long var8 = var6 >>> 8 ^ var1[(int)((var6 ^ (long)this.field9114) & 255L)];
      long var10 = var8 >>> 8 ^ var1[(int)((var8 ^ (long)(this.field9119 >> 24)) & 255L)];
      long var12 = var10 >>> 8 ^ var1[(int)((var10 ^ (long)(this.field9119 >> 16)) & 255L)];
      long var14 = var12 >>> 8 ^ var1[(int)((var12 ^ (long)(this.field9119 >> 8)) & 255L)];
      long var16 = var14 >>> 8 ^ var1[(int)((var14 ^ (long)this.field9119) & 255L)];
      long var18 = var16 >>> 8 ^ var1[(int)((var16 ^ (long)this.field9116) & 255L)];
      long var20 = var18 >>> 8 ^ var1[(int)((var18 ^ (long)(this.field9117 >> 24)) & 255L)];
      long var22 = var20 >>> 8 ^ var1[(int)((var20 ^ (long)(this.field9117 >> 16)) & 255L)];
      long var24 = var22 >>> 8 ^ var1[(int)((var22 ^ (long)(this.field9117 >> 8)) & 255L)];
      long var26 = var24 >>> 8 ^ var1[(int)((var24 ^ (long)this.field9117) & 255L)];
      long var28 = var26 >>> 8 ^ var1[(int)((var26 ^ (long)this.field9118) & 255L)];
      return var28 >>> 8 ^ var1[(int)((var28 ^ (long)(this.field9113 ? 1 : 0)) & 255L)];
   }

   @deob.ObfuscatedName("vs.k(Lqj;)Z")
   public boolean method11191(class754 arg0) {
      if (!(arg0 instanceof class898)) {
         return false;
      } else {
         class898 var2 = (class898)arg0;
         if (this.field9115 != var2.field9115) {
            return false;
         } else if (this.field9114 != var2.field9114) {
            return false;
         } else if (this.field9119 != var2.field9119) {
            return false;
         } else if (this.field9116 != var2.field9116) {
            return false;
         } else if (this.field9117 != var2.field9117) {
            return false;
         } else if (this.field9118 != var2.field9118) {
            return false;
         } else {
            return this.field9113 == var2.field9113;
         }
      }
   }
}
