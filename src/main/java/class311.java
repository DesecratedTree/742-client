import java.lang.ref.SoftReference;

@deob.ObfuscatedName("alq")
public class class311 extends class271 {
   @deob.ObfuscatedName("alq.x")
   private SoftReference field1944;

   public class311(class754 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field1944 = new SoftReference(arg1);
   }

   @deob.ObfuscatedName("alq.n()Ljava/lang/Object;")
   public Object method3608() {
      return this.field1944.get();
   }

   @deob.ObfuscatedName("alq.k()Z")
   public boolean method3606() {
      return true;
   }
}
