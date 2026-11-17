import java.lang.ref.SoftReference;

@deob.ObfuscatedName("ale")
public class class303 extends class249 {
   @deob.ObfuscatedName("ale.a")
   private SoftReference field1911;

   public class303(Object arg0, int arg1) {
      super(arg1);
      this.field1911 = new SoftReference(arg0);
   }

   @deob.ObfuscatedName("ale.n(I)Ljava/lang/Object;")
   public Object method3379() {
      return this.field1911.get();
   }

   @deob.ObfuscatedName("ale.k(B)Z")
   public boolean method3381() {
      return true;
   }
}
