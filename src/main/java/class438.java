@deob.ObfuscatedName("ez")
public class class438 {
   @deob.ObfuscatedName("ez.n")
   private byte[] field3641;
   @deob.ObfuscatedName("ez.k")
   private int field3642;

   public class438(byte[] arg0) {
      this.field3641 = arg0;
      this.field3642 = 0;
   }

   @deob.ObfuscatedName("ez.n(B)I")
   public int method6129() {
      short var1 = 0;

      for(int var2 = 0; var2 < 2; ++var2) {
         var1 = (short)(var1 | (this.field3641[++this.field3642 - 1] & 255) << var2 * 8);
      }

      return var1;
   }

   @deob.ObfuscatedName("ez.k(I)Ljava/lang/String;")
   public String method6128() {
      int var1 = this.method6129();
      if (var1 == -1) {
         return null;
      } else if (var1 > 256) {
         throw new class292();
      } else {
         String var2 = new String(this.field3641, this.field3642, var1);
         this.field3642 += var1;
         return var2;
      }
   }
}
