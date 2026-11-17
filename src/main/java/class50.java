@deob.ObfuscatedName("abu")
public class class50 extends class672 {
   @deob.ObfuscatedName("abu.n")
   private long field338 = 0L;
   @deob.ObfuscatedName("abu.k")
   private long field339 = 0L;
   @deob.ObfuscatedName("abu.d")
   private long field342 = 0L;
   @deob.ObfuscatedName("abu.b")
   private long[] field341 = new long[10];
   @deob.ObfuscatedName("abu.r")
   private int field344 = 0;
   @deob.ObfuscatedName("abu.p")
   private int field343 = 1;

   public class50() {
      this.field338 = System.nanoTime();
      this.field339 = System.nanoTime();
   }

   @deob.ObfuscatedName("abu.d(B)V")
   public void method743() {
      this.field342 = 0L;
      if (this.field339 > this.field338) {
         this.field338 += this.field339 - this.field338;
      }

   }

   @deob.ObfuscatedName("abu.b(I)J")
   protected long method744() {
      this.field338 += this.method759();
      return this.field339 > this.field338 ? (this.field339 - this.field338) / 1000000L : 0L;
   }

   @deob.ObfuscatedName("abu.r(J)I")
   protected int method745(long arg0) {
      if (this.field339 > this.field338) {
         this.field342 += this.field339 - this.field338;
         this.field338 += this.field339 - this.field338;
         this.field339 += arg0;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.field339 += arg0;
         } while(var3 < 10 && this.field339 < this.field338);

         if (this.field339 < this.field338) {
            this.field339 = this.field338;
         }

         return var3;
      }
   }

   @deob.ObfuscatedName("abu.p(B)J")
   public long method746() {
      return this.field338;
   }

   @deob.ObfuscatedName("abu.ai(B)J")
   private long method759() {
      long var1 = System.nanoTime();
      long var3 = var1 - this.field342;
      this.field342 = var1;
      if (var3 > -5000000000L && var3 < 5000000000L) {
         this.field341[this.field344] = var3;
         this.field344 = (this.field344 + 1) % 10;
         if (this.field343 < 1) {
            ++this.field343;
         }
      }

      long var5 = 0L;

      for(int var7 = 1; var7 <= this.field343; ++var7) {
         var5 += this.field341[(this.field344 - var7 + 10) % 10];
      }

      return var5 / (long)this.field343;
   }
}
