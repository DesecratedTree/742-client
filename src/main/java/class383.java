@deob.ObfuscatedName("cy")
public abstract class class383 implements class894 {
   protected class383() {
   }

   @deob.ObfuscatedName("cy.w(II)V")
   public final void method5221(int arg0, int arg1) {
      this.method2388(arg0, arg1, 1, -1, 1);
   }

   @deob.ObfuscatedName("cy.ai(IIII)V")
   public final void method5222(int arg0, int arg1, int arg2, int arg3) {
      this.method2394(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
   }

   @deob.ObfuscatedName("cy.ap(IIIIIII)V")
   public final void method5263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method2394(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }

   @deob.ObfuscatedName("cy.ax(IIII)V")
   public final void method5235(int arg0, int arg1, int arg2, int arg3) {
      this.method5219(arg0, arg1, arg2, arg3, 1, -1, 1);
   }

   @deob.ObfuscatedName("cy.at(FFII)V")
   public final void method5223(float arg0, float arg1, int arg2, int arg3) {
      this.method5234(arg0, arg1, (float)this.method5259() / 2.0F, (float)this.method5213() / 2.0F, arg2, arg3, 1, -1, 1);
   }

   @deob.ObfuscatedName("cy.ah(FFIIIII)V")
   public final void method5260(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method5234(arg0, arg1, (float)this.method5259() / 2.0F, (float)this.method5213() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("cy.aw(FFFFIIIII)V")
   private final void method5234(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-(-arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var16 = (((float)this.method5259() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method5259() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method5213() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (-(-arg2) * var12 + ((float)this.method5213() - arg3) * var13) / 4096.0F + arg1;
         this.method5230(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @deob.ObfuscatedName("cy.al(FFIILta;II)V")
   public final void method5255(float arg0, float arg1, int arg2, int arg3, class826 arg4, int arg5, int arg6) {
      this.method5229(arg0, arg1, (float)this.method5259() / 2.0F, (float)this.method5213() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @deob.ObfuscatedName("cy.an(FFFFIILta;II)V")
   public final void method5229(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-(-arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var16 = (((float)this.method5259() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method5259() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method5213() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (-(-arg2) * var12 + ((float)this.method5213() - arg3) * var13) / 4096.0F + arg1;
         this.method5262(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @deob.ObfuscatedName("cy.ag(FFFFFFIII)V")
   public final void method5230(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method5231(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @deob.ObfuscatedName("cy.ao(FFFFFFLta;II)V")
   private final void method5262(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class826 arg6, int arg7, int arg8) {
      this.method5232(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @deob.ObfuscatedName("cy.m()I")
   public abstract int method5213();

   @deob.ObfuscatedName("cy.l(IIII)V")
   public abstract void method5214(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("cy.u([I)V")
   public abstract void method5215(int[] arg0);

   @deob.ObfuscatedName("cy.v()I")
   public abstract int method5216();

   @deob.ObfuscatedName("cy.h()I")
   public abstract int method5218();

   @deob.ObfuscatedName("cy.af(IIIIIII)V")
   public abstract void method5219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @deob.ObfuscatedName("cy.i()Ldm;")
   public abstract class398 method2391();

   @deob.ObfuscatedName("cy.c(III)V")
   public abstract void method2390(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("cy.q(IIIII)V")
   public abstract void method2388(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("cy.f(IILta;II)V")
   public abstract void method2393(int arg0, int arg1, class826 arg2, int arg3, int arg4);

   @deob.ObfuscatedName("cy.av(IIIIIIII)V")
   protected abstract void method2394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @deob.ObfuscatedName("cy.ak(FFFFFFIIII)V")
   protected abstract void method5231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @deob.ObfuscatedName("cy.ab(FFFFFFILta;II)V")
   public abstract void method5232(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class826 arg7, int arg8, int arg9);

   @deob.ObfuscatedName("cy.g()I")
   public abstract int method5259();

   @deob.ObfuscatedName("cy.t(IIIIII)V")
   public abstract void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
