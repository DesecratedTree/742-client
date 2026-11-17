@deob.ObfuscatedName("akd")
public abstract class class276 extends class134 {
   @deob.ObfuscatedName("akd.j")
   private static final int[] field1818 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @deob.ObfuscatedName("akd.f")
   public short field1819;

   protected class276(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg0);
      this.field1032 = (byte)arg4;
      this.field1034 = (byte)arg5;
      this.field1819 = (short)arg6;
      this.method11626(new class584((float)arg1, (float)arg2, (float)arg3));
   }

   @deob.ObfuscatedName("akd.fx([Lacy;B)I")
   public int method2012(class81[] arg0) {
      class584 var2 = this.method11602().field5446;
      int var3 = (int)var2.field5328 >> this.field1033.field6567;
      int var4 = (int)var2.field5331 >> this.field1033.field6567;
      int var5 = 0;
      if (this.field1033.field6603 == var3) {
         ++var5;
      } else if (this.field1033.field6603 < var3) {
         var5 += 2;
      }

      if (this.field1033.field6604 == var4) {
         var5 += 3;
      } else if (this.field1033.field6604 > var4) {
         var5 += 6;
      }

      int var6 = field1818[var5];
      if ((this.field1819 & var6) != 0) {
         return this.method2010(var3, var4, arg0);
      } else if (this.field1819 == 1 && var3 > 0) {
         return this.method2010(var3 - 1, var4, arg0);
      } else if (this.field1819 == 4 && var3 <= this.field1033.field6577) {
         return this.method2010(var3 + 1, var4, arg0);
      } else if (this.field1819 == 8 && var4 > 0) {
         return this.method2010(var3, var4 - 1, arg0);
      } else if (this.field1819 == 2 && var4 <= this.field1033.field6578) {
         return this.method2010(var3, var4 + 1, arg0);
      } else if (this.field1819 == 16 && var3 > 0 && var4 <= this.field1033.field6578) {
         return this.method2010(var3 - 1, var4 + 1, arg0);
      } else if (this.field1819 == 32 && var3 <= this.field1033.field6577 && var4 <= this.field1033.field6578) {
         return this.method2010(var3 + 1, var4 + 1, arg0);
      } else if (this.field1819 == 128 && var3 > 0 && var4 > 0) {
         return this.method2010(var3 - 1, var4 - 1, arg0);
      } else if (this.field1819 == 64 && var3 <= this.field1033.field6577 && var4 > 0) {
         return this.method2010(var3 + 1, var4 - 1, arg0);
      } else {
         throw new RuntimeException("");
      }
   }

   @deob.ObfuscatedName("akd.gu(Lra;I)Z")
   public boolean method2015(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      return this.field1033.field6566.method10402(this, this.field1034, (int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567);
   }

   @deob.ObfuscatedName("akd.gi(B)Z")
   public boolean method2014() {
      class584 var1 = this.method11602().field5446;
      return this.field1033.field6616[this.field1033.field6599 + (((int)var1.field5328 >> this.field1033.field6567) - this.field1033.field6603)][this.field1033.field6599 + (((int)var1.field5331 >> this.field1033.field6567) - this.field1033.field6604)];
   }
}
