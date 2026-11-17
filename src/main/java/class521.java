@deob.ObfuscatedName("ia")
public class class521 extends class609 implements class853 {
   private long nativeid;

   public class521(class548 arg0, class332 arg1, class883 arg2, class998[] arg3, class383[] arg4) {
      super(arg0, arg2);
      byte[][] var6 = new byte[arg3.length][];
      int[] var7 = new int[arg3.length];
      int[] var8 = new int[arg3.length];
      int[] var9 = new int[arg3.length];
      int[] var10 = new int[arg3.length];

      for(int var11 = 0; var11 < arg3.length; ++var11) {
         var6[var11] = arg3[var11].field10579;
         var7[var11] = arg3[var11].field10574;
         var8[var11] = arg3[var11].field10572;
         var9[var11] = arg3[var11].field10575;
         var10[var11] = arg3[var11].field10576;
      }

      this.method7293(arg0, arg1, var6, arg3[0].field10578, var7, var8, var9, var10);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("ia.m(CIIIZLta;II)V")
   protected void method5671(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7) {
      this.method7300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @deob.ObfuscatedName("ia.EA(Lja;Lba;[[B[I[I[I[I[I)V")
   private native void method7293(class548 arg0, class332 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

   @deob.ObfuscatedName("ia.ma(Z)V")
   public native void method9(boolean arg0);

   @deob.ObfuscatedName("ia.UA(CIIIZ)V")
   protected native void method5659(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @deob.ObfuscatedName("ia.GA(CIIIZLta;II)V")
   private native void method7300(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7);
}
