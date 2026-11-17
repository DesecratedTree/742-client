@deob.ObfuscatedName("akp")
public abstract class class288 extends class134 {
   @deob.ObfuscatedName("akp.z")
   public short field1862;
   @deob.ObfuscatedName("akp.m")
   public short field1861;

   protected class288(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      super(arg0);
      this.field1032 = (byte)arg4;
      this.field1034 = (byte)arg5;
      this.field1862 = (short)arg6;
      this.field1861 = (short)arg7;
      this.method11626(new class584((float)arg1, (float)arg2, (float)arg3));
   }

   @deob.ObfuscatedName("akp.fx([Lacy;B)I")
   public int method2012(class81[] arg0) {
      class584 var2 = this.method11602().field5446;
      return this.method2010((int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567, arg0);
   }

   @deob.ObfuscatedName("akp.gu(Lra;I)Z")
   public boolean method2015(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      return this.field1033.field6566.method10398(this.field1034, (int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567, this.method80());
   }

   @deob.ObfuscatedName("akp.gi(B)Z")
   public boolean method2014() {
      class584 var1 = this.method11602().field5446;
      return this.field1033.field6616[this.field1033.field6599 + (((int)var1.field5328 >> this.field1033.field6567) - this.field1033.field6603)][this.field1033.field6599 + (((int)var1.field5331 >> this.field1033.field6567) - this.field1033.field6604)];
   }

   @deob.ObfuscatedName("akp.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("akp.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("akp.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }
}
