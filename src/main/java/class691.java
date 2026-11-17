@deob.ObfuscatedName("oa")
public class class691 implements class393, class853 {
   public long nativeid = 0L;
   @deob.ObfuscatedName("oa.n")
   private int field6242;
   @deob.ObfuscatedName("oa.k")
   private int field6243;

   public class691(int arg0, int arg1) {
      this.field6242 = arg0;
      this.field6243 = arg1;
      this.method10120(arg0, arg1);
   }

   @deob.ObfuscatedName("oa.n()I")
   public int method3939() {
      return this.field6242;
   }

   @deob.ObfuscatedName("oa.k()I")
   public int method3938() {
      return this.field6243;
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("oa.ma(Z)V")
   public void method9(boolean arg0) {
      this.method10123(this.nativeid, arg0);
   }

   @deob.ObfuscatedName("oa.d()V")
   public void method302() {
      this.method9(false);
   }

   @deob.ObfuscatedName("oa.g(II)V")
   private native void method10120(int arg0, int arg1);

   @deob.ObfuscatedName("oa.za(JZ)V")
   private native void method10123(long arg0, boolean arg1);
}
