@deob.ObfuscatedName("aal")
public class class14 extends class463 {
   @deob.ObfuscatedName("aal.o")
   private final class597 field151 = new class597();
   @deob.ObfuscatedName("aal.p")
   private class225 field149;
   @deob.ObfuscatedName("aal.a")
   private class225 field150;
   @deob.ObfuscatedName("aal.x")
   private class225 field153;
   @deob.ObfuscatedName("aal.s")
   private class225 field154;
   @deob.ObfuscatedName("aal.r")
   private class434 field152;

   public class14(class979 arg0) throws class185 {
      super(arg0);
      this.method363();
   }

   @deob.ObfuscatedName("aal.a(B)Z")
   private boolean method363() throws class185 {
      this.field152 = this.field3811.method2579("Particle");
      this.field150 = this.field152.method6037("WVPMatrix");
      this.field149 = this.field152.method6037("DiffuseSampler");
      this.field153 = this.field152.method6037("TexCoordMatrix");
      this.field154 = this.field152.method6037("DiffuseColour");
      this.field152.method267(this.field152.method6074());
      return true;
   }

   @deob.ObfuscatedName("aal.n(Lko;)V")
   public void method358(class597 arg0) {
      this.field151.method8386(arg0);
      this.field151.method8388(this.field3811.field10076);
   }

   @deob.ObfuscatedName("aal.k(I)V")
   public void method356(int arg0) {
      this.method361();
      this.field3811.method2577(class522.field4132, 0, arg0 * 4, 0, arg0 * 2);
   }

   @deob.ObfuscatedName("aal.d()V")
   public void method360() {
      this.method361();
      this.field3811.method16362();
   }

   @deob.ObfuscatedName("aal.x(I)V")
   private void method361() {
      this.field152.method267(this.field152.method6074());
      this.field152.method264();
      this.field152.method6030(this.field149, 0, this.field3812);
      this.field152.method6076(this.field150, this.field151);
      this.field152.method6028(this.field153, this.field3810);
      this.field152.method6027(this.field154, this.field3813);
   }
}
