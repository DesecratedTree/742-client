@deob.ObfuscatedName("alf")
public class class304 extends class290 {
   @deob.ObfuscatedName("alf.q")
   private class684 field1912;
   @deob.ObfuscatedName("alf.y")
   private class745 field1913;

   public class304(class713 arg0, class684 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte)0);
      this.field1912 = arg1;
   }

   @deob.ObfuscatedName("alf.bo(Lra;IIB)Z")
   public boolean method2027(class772 arg0, int arg1, int arg2) {
      return false;
   }

   @deob.ObfuscatedName("alf.bj(I)Z")
   public boolean method2016() {
      return false;
   }

   @deob.ObfuscatedName("alf.bc(B)Z")
   public boolean method81() {
      if (this.field1913 != null) {
         return !this.field1913.method6956();
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("alf.bw(I)Z")
   public boolean method82() {
      return this.field1913 != null ? this.field1913.method6949() : false;
   }

   @deob.ObfuscatedName("alf.bv(Lra;Laex;IIIZI)V")
   public void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @deob.ObfuscatedName("alf.bd(I)V")
   public void method2028() {
   }

   @deob.ObfuscatedName("alf.bh(Lra;I)Loy;")
   public class715 method2009(class772 arg0) {
      if (this.field1913 == null) {
         this.field1913 = this.field1912.method10013(arg0);
      }

      if (this.field1913 != null) {
         class583 var2 = arg0.method7763();
         class583 var3 = this.method11605();
         class600 var4 = this.method11602();
         var2.method8089(var3);
         class703 var5 = this.field1033.field6579[this.field1032][(int)var4.field5446.field5328 >> 9][(int)var4.field5446.field5331 >> 9];
         if (var5 != null && var5.field6482 != null) {
            var2.method8072(0.0F, (float)(-var5.field6482.field1809), 0.0F);
         }

         this.field1913.method7001(var2, (class394)null, 0);
      }

      return null;
   }

   @deob.ObfuscatedName("alf.bn(Lra;I)V")
   public void method2044(class772 arg0) {
   }

   @deob.ObfuscatedName("alf.bx(Lra;I)Lov;")
   public class712 method2011(class772 arg0) {
      return null;
   }

   @deob.ObfuscatedName("alf.by(B)I")
   public int method80() {
      return this.field1913 != null ? this.field1913.method6941() : 0;
   }
}
