@deob.ObfuscatedName("ea")
public class class413 extends class609 implements class853 {
   private long nativeid;

   public class413(class548 arg0, class332 arg1, class883 arg2, class998[] arg3, class383[] arg4) {
      super(arg0, arg2);
      byte[][] var6 = new byte[arg3.length][];
      int[] var7 = new int[arg3.length];
      int[] var8 = new int[arg3.length];
      int[] var9 = new int[arg3.length];
      int[] var10 = new int[arg3.length];

      for(int var11 = 0; var11 < arg3.length; ++var11) {
         class998 var12 = arg3[var11];
         if (var12.field10573 != null) {
            var6[var11] = var12.field10573;
         } else {
            byte[] var13 = var12.field10579;
            byte[] var14 = var6[var11] = new byte[var13.length];

            for(int var15 = 0; var15 < var13.length; ++var15) {
               var14[var15] = (byte)(var13[var15] == 0 ? 0 : -1);
            }
         }

         var7[var11] = var12.field10574;
         var8[var11] = var12.field10572;
         var9[var11] = var12.field10575;
         var10[var11] = var12.field10576;
      }

      this.method5662(arg0, arg1, var6, var7, var8, var9, var10);
   }

   public void finalize() {
      if (this.nativeid != 0L) {
         class374.method5047(this);
      }

   }

   @deob.ObfuscatedName("ea.m(CIIIZLta;II)V")
   protected void method5671(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7) {
      this.method5663(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @deob.ObfuscatedName("ea.UA(CIIIZ)V")
   protected native void method5659(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @deob.ObfuscatedName("ea.ma(Z)V")
   public native void method9(boolean arg0);

   @deob.ObfuscatedName("ea.n(Lja;Lba;[[B[I[I[I[I)V")
   private native void method5662(class548 arg0, class332 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

   @deob.ObfuscatedName("ea.P(CIIIZLta;II)V")
   private native void method5663(char arg0, int arg1, int arg2, int arg3, boolean arg4, class826 arg5, int arg6, int arg7);
}
