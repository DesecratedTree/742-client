@deob.ObfuscatedName("wa")
public class class907 extends class826 implements class853 {
   public long nativeid;

   public class907(class548 arg0, class332 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      this.method15735(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("wa.l(Lja;Lba;II[I[I)V")
   private native void method15735(class548 arg0, class332 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

   @deob.ObfuscatedName("wa.ma(Z)V")
   public native void method9(boolean arg0);
}
