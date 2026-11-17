import jaclib.memory.Buffer;

@deob.ObfuscatedName("xp")
public class class949 extends class351 implements class341 {
   @deob.ObfuscatedName("xp.s")
   private int field9529;

   public class949(class983 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);
      this.field9529 = arg1;
   }

   public class949(class983 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);
      this.field9529 = arg1;
   }

   @deob.ObfuscatedName("xp.n()I")
   public int method4161() {
      return this.field2252;
   }

   @deob.ObfuscatedName("xp.k()I")
   public int method4163() {
      return this.field9529;
   }

   @deob.ObfuscatedName("xp.d()J")
   public long method4151() {
      return 0L;
   }

   @deob.ObfuscatedName("xp.z()V")
   protected void method4264() {
      this.field2248.method16734(this);
   }

   @deob.ObfuscatedName("xp.b(I[BI)V")
   public void method4156(int arg0, byte[] arg1, int arg2) {
      this.method4265(arg1, arg2);
      this.field9529 = arg0;
   }
}
