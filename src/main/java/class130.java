import java.io.IOException;

@deob.ObfuscatedName("aet")
public class class130 extends class688 {
   @deob.ObfuscatedName("aet.z")
   private final byte[][] field1012 = new byte[10][];
   @deob.ObfuscatedName("aet.w")
   private final class124 field1008 = new class124((byte[])null);
   @deob.ObfuscatedName("aet.q")
   private final class124 field1006 = new class124((byte[])null);
   @deob.ObfuscatedName("aet.m")
   private final class612 field1011;
   @deob.ObfuscatedName("aet.i")
   private final int field1009;
   @deob.ObfuscatedName("aet.c")
   private int field1013;
   @deob.ObfuscatedName("aet.t")
   private int[] field1010;

   public class130(int arg0, class612 arg1, int arg2) {
      super(arg0);
      this.field1011 = arg1;
      this.field1009 = arg2;
   }

   @deob.ObfuscatedName("aet.n([BI)I")
   protected int method1928(byte[] arg0) throws IOException {
      if (this.field1010 == null) {
         if (!this.field1011.method8773(this.field1009, 0)) {
            return 0;
         }

         byte[] var2 = this.field1011.method8771(this.field1009, 0);
         if (var2 == null) {
            throw new IllegalStateException("");
         }

         this.field1006.field931 = var2;
         this.field1006.field935 = 0;
         int var3 = var2.length >> 1;
         this.field1010 = new int[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field1010[var4] = this.field1006.method1587();
         }
      }

      if (this.field1013 >= this.field1010.length) {
         return -1;
      } else {
         this.method1929();
         this.field1006.field931 = arg0;
         this.field1006.field935 = 0;

         do {
            if (this.field1006.field935 >= this.field1006.field931.length) {
               this.field1006.field931 = null;
               return arg0.length;
            }

            if (this.field1008.field931 == null) {
               if (this.field1012[0] == null) {
                  this.field1006.field931 = null;
                  return this.field1006.field935;
               }

               this.field1008.field931 = this.field1012[0];
            }

            int var5 = this.field1006.field931.length - this.field1006.field935;
            int var6 = this.field1008.field931.length - this.field1008.field935;
            if (var5 < var6) {
               this.field1008.method1602(this.field1006.field931, this.field1006.field935, var5);
               this.field1006.field931 = null;
               return arg0.length;
            }

            this.field1006.method1753(this.field1008.field931, this.field1008.field935, var6);
            this.field1008.field931 = null;
            this.field1008.field935 = 0;
            ++this.field1013;

            for(int var7 = 0; var7 < 9; ++var7) {
               this.field1012[var7] = this.field1012[var7 + 1];
            }

            this.field1012[9] = null;
         } while(this.field1013 < this.field1010.length);

         this.field1006.field931 = null;
         return this.field1006.field935;
      }
   }

   @deob.ObfuscatedName("aet.az(I)V")
   public void method1929() {
      if (this.field1010 != null) {
         for(int var1 = 0; var1 < 10 && this.field1013 + var1 < this.field1010.length; ++var1) {
            if (this.field1012[var1] == null && this.field1011.method8773(this.field1010[this.field1013 + var1], 0)) {
               this.field1012[var1] = this.field1011.method8771(this.field1010[this.field1013 + var1], 0);
            }
         }

      }
   }
}
