import jaclib.memory.Buffer;

@deob.ObfuscatedName("be")
public class class336 {
   @deob.ObfuscatedName("be.n")
   private final class983 field2129;
   @deob.ObfuscatedName("be.k")
   protected Buffer field2128;

   protected class336(class983 arg0, byte[] arg1, int arg2) {
      this.field2129 = arg0;
      this.field2128 = this.field2129.field10267.method7793(arg2, false);
      if (arg1 != null) {
         this.field2128.method7784(arg1, 0, 0, arg2);
      }

   }

   protected class336(class983 arg0, Buffer arg1) {
      this.field2129 = arg0;
      this.field2128 = arg1;
   }

   @deob.ObfuscatedName("be.z([BI)V")
   protected void method4140(byte[] arg0, int arg1) {
      if (this.field2128 == null || this.field2128.method7782() < arg1) {
         this.field2128 = this.field2129.field10267.method7793(arg1, false);
      }

      this.field2128.method7784(arg0, 0, 0, arg1);
   }
}
