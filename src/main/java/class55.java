@deob.ObfuscatedName("abz")
public class class55 extends class581 {
   @deob.ObfuscatedName("abz.m")
   private final int field404;
   @deob.ObfuscatedName("abz.i")
   private final int field405;
   @deob.ObfuscatedName("abz.t")
   private final int field406;
   @deob.ObfuscatedName("abz.v")
   private int field399;
   @deob.ObfuscatedName("abz.h")
   private int field398;
   @deob.ObfuscatedName("abz.g")
   private int field400;
   @deob.ObfuscatedName("abz.z")
   private int field401;
   @deob.ObfuscatedName("abz.e")
   private int field403;
   @deob.ObfuscatedName("abz.u")
   private byte[] field402;

   protected class55(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);
      this.field404 = (int)(arg7 * 4096.0F);
      this.field405 = (int)(arg6 * 4096.0F);
      this.field399 = this.field406 = (int)(Math.pow(0.5D, (double)(-arg5)) * 4096.0D);
   }

   @deob.ObfuscatedName("abz.k()V")
   protected void method817() {
      this.field403 = 0;
      this.field401 = 0;
   }

   @deob.ObfuscatedName("abz.b(II)V")
   protected void method820(int arg0, int arg1) {
      if (arg0 != 0) {
         this.field400 = this.field404 * this.field398 >> 12;
         if (this.field400 < 0) {
            this.field400 = 0;
         } else if (this.field400 > 4096) {
            this.field400 = 4096;
         }

         this.field398 = this.field405 - (arg1 < 0 ? -arg1 : arg1);
         this.field398 = this.field398 * this.field398 >> 12;
         this.field398 = this.field400 * this.field398 >> 12;
         this.field401 += this.field399 * this.field398 >> 12;
         this.field399 = this.field406 * this.field399 >> 12;
      } else {
         this.field398 = this.field405 - (arg1 < 0 ? -arg1 : arg1);
         this.field398 = this.field398 * this.field398 >> 12;
         this.field400 = 4096;
         this.field401 = this.field398;
      }

   }

   @deob.ObfuscatedName("abz.d()V")
   protected void method819() {
      this.field399 = this.field406;
      this.field401 >>= 4;
      if (this.field401 < 0) {
         this.field401 = 0;
      } else if (this.field401 > 255) {
         this.field401 = 255;
      }

      this.method889(this.field403++, (byte)this.field401);
      this.field401 = 0;
   }

   @deob.ObfuscatedName("abz.y(IB)V")
   protected void method889(int arg0, byte arg1) {
      this.field402[arg0] = arg1;
   }
}
