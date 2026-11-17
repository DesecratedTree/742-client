@deob.ObfuscatedName("akc")
public abstract class class275 extends class134 {
   @deob.ObfuscatedName("akc.z")
   public short field1809;

   protected class275(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg0);
      this.field1032 = (byte)arg4;
      this.field1034 = (byte)arg5;
      this.field1809 = (short)arg6;
      this.method11626(new class584((float)arg1, (float)arg2, (float)arg3));
   }

   @deob.ObfuscatedName("akc.fx([Lacy;B)I")
   public int method2012(class81[] arg0) {
      class584 var2 = this.method11602().field5446;
      return this.method2010((int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567, arg0);
   }

   @deob.ObfuscatedName("akc.gu(Lra;I)Z")
   public boolean method2015(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      return this.field1033.field6566.method10411(this.field1034, (int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567);
   }

   @deob.ObfuscatedName("akc.gi(B)Z")
   public boolean method2014() {
      class584 var1 = this.method11602().field5446;
      return this.field1033.field6616[this.field1033.field6599 + (((int)var1.field5328 >> this.field1033.field6567) - this.field1033.field6603)][this.field1033.field6599 + (((int)var1.field5331 >> this.field1033.field6567) - this.field1033.field6604)];
   }
}
