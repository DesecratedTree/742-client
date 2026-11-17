@deob.ObfuscatedName("aky")
public abstract class class297 extends class134 {
   public class297(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0);
      this.field1032 = (byte)arg4;
      this.field1034 = (byte)arg5;
      this.method11626(new class584((float)arg1, (float)arg2, (float)arg3));
   }

   @deob.ObfuscatedName("aky.fx([Lacy;B)I")
   public int method2012(class81[] arg0) {
      class584 var2 = this.method11602().field5446;
      return this.method2010((int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567, arg0);
   }

   @deob.ObfuscatedName("aky.gu(Lra;I)Z")
   public boolean method2015(class772 arg0) {
      class584 var2 = this.method11602().field5446;
      class699 var3 = this.field1033.method10580(this.field1032, (int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567);
      return var3 != null && var3.field6458.field9624 ? this.field1033.field6566.method10398(this.field1032, (int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567, var3.field6458.method80() + this.method80()) : this.field1033.field6566.method10411(this.field1032, (int)var2.field5328 >> this.field1033.field6567, (int)var2.field5331 >> this.field1033.field6567);
   }

   @deob.ObfuscatedName("aky.gi(B)Z")
   public boolean method2014() {
      class584 var1 = this.method11602().field5446;
      return this.field1033.field6616[this.field1033.field6599 + (((int)var1.field5328 >> this.field1033.field6567) - this.field1033.field6603)][this.field1033.field6599 + (((int)var1.field5331 >> this.field1033.field6567) - this.field1033.field6604)];
   }

   @deob.ObfuscatedName("aky.bj(I)Z")
   public final boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("aky.bv(Lra;Laex;IIIZI)V")
   public final void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("aky.bd(I)V")
   public final void method2028() {
      throw new IllegalStateException();
   }
}
