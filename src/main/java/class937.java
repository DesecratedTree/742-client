import jaclib.memory.Buffer;

@deob.ObfuscatedName("xd")
public class class937 extends class336 implements class341 {
   @deob.ObfuscatedName("xd.d")
   private int field9480;

   public class937(class983 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);
      this.field9480 = arg1;
   }

   public class937(class983 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);
      this.field9480 = arg1;
   }

   @deob.ObfuscatedName("xd.n()I")
   public int method4161() {
      return 0;
   }

   @deob.ObfuscatedName("xd.k()I")
   public int method4163() {
      return this.field9480;
   }

   @deob.ObfuscatedName("xd.d()J")
   public long method4151() {
      return this.field2128.method7783();
   }

   @deob.ObfuscatedName("xd.b(I[BI)V")
   public void method4156(int arg0, byte[] arg1, int arg2) {
      this.method4140(arg1, arg2);
      this.field9480 = arg0;
   }
}
