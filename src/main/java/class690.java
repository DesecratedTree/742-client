@deob.ObfuscatedName("o")
public class class690 extends class973 {
   @deob.ObfuscatedName("o.d")
   private class440 field6238 = null;
   @deob.ObfuscatedName("o.b")
   private class691 field6239 = null;
   @deob.ObfuscatedName("o.r")
   private int field6237 = 0;
   @deob.ObfuscatedName("o.p")
   private int field6241 = 0;
   @deob.ObfuscatedName("o.k")
   private class548 field6240;

   public class690(class548 arg0) {
      this.field6240 = arg0;
   }

   @deob.ObfuscatedName("o.k()I")
   public int method566() {
      return this.field6237;
   }

   @deob.ObfuscatedName("o.d()I")
   public int method559() {
      return this.field6241;
   }

   @deob.ObfuscatedName("o.r()Z")
   public boolean method540() {
      this.field6240.method7631(this.field6238 == null ? 0L : this.field6238.nativeid, this.field6239 == null ? 0L : this.field6239.nativeid);
      return true;
   }

   @deob.ObfuscatedName("o.p()Z")
   public boolean method541() {
      return true;
   }

   @deob.ObfuscatedName("o.z(ILdm;)V")
   public void method2351(int arg0, class398 arg1) {
      if (arg0 != 0) {
         throw new RuntimeException();
      } else if (this.field6239 != null && arg1 != null && (this.field6239.method3939() != arg1.method3939() || this.field6239.method3938() != arg1.method3938())) {
         throw new RuntimeException();
      } else {
         this.field6238 = (class440)arg1;
         if (arg1 != null) {
            this.field6237 = arg1.method3939();
            this.field6241 = arg1.method3938();
         } else if (this.field6239 == null) {
            this.field6237 = 0;
            this.field6241 = 0;
         }

         if (this.field6240.method11517() == this) {
            this.method540();
         }

      }
   }

   @deob.ObfuscatedName("o.n(Ldh;)V")
   public void method2352(class393 arg0) {
      if (this.field6238 != null && arg0 != null && (this.field6238.method3939() != arg0.method3939() || this.field6238.method3938() != arg0.method3938())) {
         throw new RuntimeException();
      } else {
         this.field6239 = (class691)arg0;
         if (arg0 != null) {
            this.field6237 = arg0.method3939();
            this.field6241 = arg0.method3938();
         } else if (this.field6238 == null) {
            this.field6237 = 0;
            this.field6241 = 0;
         }

         if (this.field6240.method11517() == this) {
            this.method540();
         }

      }
   }

   @deob.ObfuscatedName("o.c()Z")
   public boolean method2354() {
      return true;
   }

   @deob.ObfuscatedName("o.w(IIIIIIZZ)V")
   public void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      long var9 = 0L;
      long var11 = 0L;
      if (this.field6238 == null) {
         arg6 = false;
      } else {
         var9 = this.field6238.nativeid;
      }

      if (this.field6239 == null) {
         arg7 = false;
      } else {
         var11 = this.field6239.nativeid;
      }

      this.method10116(this.field6240.nativeid, var9, var11, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @deob.ObfuscatedName("o.b()V")
   public void method570() {
   }

   @deob.ObfuscatedName("o.BA(JJJIIIIIIZZ)V")
   private native void method10116(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
