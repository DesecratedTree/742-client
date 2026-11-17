@deob.ObfuscatedName("mz")
public class class662 {
   @deob.ObfuscatedName("mz.n")
   private int field6065 = 2;
   @deob.ObfuscatedName("mz.k")
   private int[] field6071 = new int[2];
   @deob.ObfuscatedName("mz.d")
   private int[] field6064 = new int[2];
   @deob.ObfuscatedName("mz.o")
   private int field6063;
   @deob.ObfuscatedName("mz.s")
   private int field6066;
   @deob.ObfuscatedName("mz.r")
   public int field6067;
   @deob.ObfuscatedName("mz.p")
   public int field6068;
   @deob.ObfuscatedName("mz.b")
   public int field6069;
   @deob.ObfuscatedName("mz.a")
   private int field6070;
   @deob.ObfuscatedName("mz.l")
   private int field6072;
   @deob.ObfuscatedName("mz.u")
   private int field6073;

   public class662() {
      this.field6071[0] = 0;
      this.field6071[1] = 65535;
      this.field6064[0] = 0;
      this.field6064[1] = 65535;
   }

   @deob.ObfuscatedName("mz.n(Laen;)V")
   public final void method9680(class124 arg0) {
      this.field6068 = arg0.method1688();
      this.field6069 = arg0.method1591();
      this.field6067 = arg0.method1591();
      this.method9682(arg0);
   }

   @deob.ObfuscatedName("mz.k(Laen;)V")
   public final void method9682(class124 arg0) {
      this.field6065 = arg0.method1688();
      this.field6071 = new int[this.field6065];
      this.field6064 = new int[this.field6065];

      for(int var2 = 0; var2 < this.field6065; ++var2) {
         this.field6071[var2] = arg0.method1587();
         this.field6064[var2] = arg0.method1587();
      }

   }

   @deob.ObfuscatedName("mz.d()V")
   public final void method9686() {
      this.field6063 = 0;
      this.field6070 = 0;
      this.field6066 = 0;
      this.field6072 = 0;
      this.field6073 = 0;
   }

   @deob.ObfuscatedName("mz.b(I)I")
   public final int method9690(int arg0) {
      if (this.field6073 >= this.field6063) {
         this.field6072 = this.field6064[this.field6070++] << 15;
         if (this.field6070 >= this.field6065) {
            this.field6070 = this.field6065 - 1;
         }

         this.field6063 = (int)((double)this.field6071[this.field6070] / 65536.0D * (double)arg0);
         if (this.field6063 > this.field6073) {
            this.field6066 = ((this.field6064[this.field6070] << 15) - this.field6072) / (this.field6063 - this.field6073);
         }
      }

      this.field6072 += this.field6066;
      ++this.field6073;
      return this.field6072 - this.field6066 >> 15;
   }
}
