import jaclib.nanotime.QueryPerformanceCounter;

@deob.ObfuscatedName("acl")
public class class68 extends class672 {
   @deob.ObfuscatedName("acl.n")
   private long field494 = 0L;
   @deob.ObfuscatedName("acl.k")
   private long field493 = 0L;
   @deob.ObfuscatedName("acl.d")
   private long field492 = 0L;
   @deob.ObfuscatedName("acl.b")
   private long[] field497 = new long[10];
   @deob.ObfuscatedName("acl.r")
   private int field496 = 0;
   @deob.ObfuscatedName("acl.p")
   private int field495 = 1;

   public class68() {
      this.field493 = this.field494 = QueryPerformanceCounter.nanoTime();
      if (this.field494 == 0L) {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("acl.d(B)V")
   public void method743() {
      this.field492 = 0L;
      if (this.field493 > this.field494) {
         this.field494 += this.field493 - this.field494;
      }

   }

   @deob.ObfuscatedName("acl.b(I)J")
   protected long method744() {
      this.field494 += this.method1013();
      return this.field493 > this.field494 ? (this.field493 - this.field494) / 1000000L : 0L;
   }

   @deob.ObfuscatedName("acl.r(J)I")
   protected int method745(long arg0) {
      if (this.field493 > this.field494) {
         this.field492 += this.field493 - this.field494;
         this.field494 += this.field493 - this.field494;
         this.field493 += arg0;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.field493 += arg0;
         } while(var3 < 10 && this.field493 < this.field494);

         if (this.field493 < this.field494) {
            this.field493 = this.field494;
         }

         return var3;
      }
   }

   @deob.ObfuscatedName("acl.p(B)J")
   public long method746() {
      return this.field494;
   }

   @deob.ObfuscatedName("acl.ai(I)J")
   private long method1013() {
      long var1 = QueryPerformanceCounter.nanoTime();
      long var3 = var1 - this.field492;
      this.field492 = var1;
      if (var3 > -5000000000L && var3 < 5000000000L) {
         this.field497[this.field496] = var3;
         this.field496 = (this.field496 + 1) % 10;
         if (this.field495 < 1) {
            ++this.field495;
         }
      }

      long var5 = 0L;

      for(int var7 = 1; var7 <= this.field495; ++var7) {
         var5 += this.field497[(this.field496 - var7 + 10) % 10];
      }

      return var5 / (long)this.field495;
   }
}
