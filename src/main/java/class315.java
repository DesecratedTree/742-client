@deob.ObfuscatedName("alw")
public class class315 extends class224 {
   @deob.ObfuscatedName("alw.x")
   private float[] field1971;

   public class315(int arg0, class86 arg1, float[] arg2, int arg3, int arg4, boolean arg5) {
      this.field1520 = arg0;
      this.field1971 = arg2;
      this.field1521 = arg3;
      this.field1522 = arg4;
      this.field1523 = arg5;
   }

   @deob.ObfuscatedName("alw.n()I")
   public int method3113() {
      return this.field1971.length;
   }

   @deob.ObfuscatedName("alw.k(III)Laiq;")
   public class235 method3111(int arg0, int arg1, int arg2) {
      return this.field1971 != null && this.field1971.length != 0 ? new class287(this, arg0, arg1, arg2) : null;
   }

   @deob.ObfuscatedName("alw.p()[F")
   public float[] method3935() {
      return this.field1971;
   }
}
