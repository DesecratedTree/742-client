@deob.ObfuscatedName("eo")
public class class427 {
   @deob.ObfuscatedName("eo.n")
   public class425[] field3569;
   @deob.ObfuscatedName("eo.d")
   public boolean field3570;
   @deob.ObfuscatedName("eo.k")
   private class425[] field3568;

   public class427(boolean arg0, class425[] arg1) {
      this.field3569 = arg1;
      this.field3570 = arg0;
   }

   @deob.ObfuscatedName("eo.n(B)[Lem;")
   public class425[] method5916() {
      return this.field3568 == null ? this.field3569 : this.field3568;
   }

   @deob.ObfuscatedName("eo.k(I)[Lem;")
   public class425[] method5919() {
      if (this.field3568 == null) {
         int var1 = this.field3569.length;
         this.field3568 = new class425[var1];
         System.arraycopy(this.field3569, 0, this.field3568, 0, this.field3569.length);
      }

      return this.field3568;
   }

   @deob.ObfuscatedName("eo.d(II)Lem;")
   public class425 method5917(int arg0) {
      if (this.field3569[0].field3465 >>> 16 != arg0 >>> 16) {
         throw new IllegalArgumentException();
      } else {
         return this.field3569[arg0 & 65535];
      }
   }
}
