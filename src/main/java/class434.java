@deob.ObfuscatedName("ev")
public abstract class class434 {
   @deob.ObfuscatedName("ev.o")
   protected int field3620 = -1;
   @deob.ObfuscatedName("ev.n")
   private String field3622;
   @deob.ObfuscatedName("ev.r")
   private int field3619;
   @deob.ObfuscatedName("ev.d")
   private class454 field3615;
   @deob.ObfuscatedName("ev.p")
   private int field3617;
   @deob.ObfuscatedName("ev.b")
   private class454 field3618;
   @deob.ObfuscatedName("ev.k")
   private class422[] field3616;
   @deob.ObfuscatedName("ev.a")
   private static final class451 field3621 = new class426();

   protected class434(class979 arg0, class414 arg1) {
      this.field3622 = arg1.field3112;
      this.field3619 = arg1.field3109.length;
      this.field3615 = new class454(this.field3619, field3621);

      for(int var3 = 0; var3 < this.field3619; ++var3) {
         this.field3615.method6456(var3, arg1.field3109[var3].field3576, this.method250(arg1.field3109[var3]));
      }

      this.field3617 = arg1.field3111.length;
      this.field3618 = new class454(this.field3617, field3621);

      for(int var4 = 0; var4 < this.field3617; ++var4) {
         this.field3618.method6456(var4, arg1.field3111[var4].field3576, this.method250(arg1.field3111[var4]));
      }

      this.field3616 = new class422[arg1.field3110.length];

      for(int var5 = 0; var5 < arg1.field3110.length; ++var5) {
         this.field3616[var5] = this.method251(arg0, arg1.field3110[var5]);
      }

   }

   @deob.ObfuscatedName("ev.b(B)Ljava/lang/String;")
   public String method6012() {
      return this.field3622;
   }

   @deob.ObfuscatedName("ev.p(Ljava/lang/String;I)Lej;")
   public class422 method6039(String arg0) throws class295 {
      class422[] var2 = this.field3616;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class422 var4 = var2[var3];
         String var5 = var4.method5790();
         if (var5 != null && var5.equals(arg0)) {
            if (!var4.method284()) {
               throw new class295(arg0);
            }

            return var4;
         }
      }

      throw new class295(arg0);
   }

   @deob.ObfuscatedName("ev.o(I)I")
   public final int method6014() {
      return this.field3616.length;
   }

   @deob.ObfuscatedName("ev.a(IB)Lej;")
   public final class422 method6015(int arg0) {
      return this.field3616[arg0];
   }

   @deob.ObfuscatedName("ev.x(Lej;B)I")
   public int method6016(class422 arg0) {
      for(int var2 = 0; var2 < this.field3616.length; ++var2) {
         if (this.field3616[var2] == arg0) {
            return var2;
         }
      }

      return -1;
   }

   @deob.ObfuscatedName("ev.s(B)Lej;")
   public class422 method6074() {
      class422[] var1 = this.field3616;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class422 var3 = var1[var2];
         if (var3.method284()) {
            return var3;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("ev.u(I)Lej;")
   public final class422 method6017() {
      return this.field3620 >= 0 ? this.field3616[this.field3620] : null;
   }

   @deob.ObfuscatedName("ev.v(B)I")
   public final int method6018() {
      return this.field3620;
   }

   @deob.ObfuscatedName("ev.h(Laig;FI)V")
   public final void method6020(class225 arg0, float arg1) {
      this.field3616[this.field3620].method285(arg0, arg1);
   }

   @deob.ObfuscatedName("ev.e(Laig;FFI)V")
   public final void method6098(class225 arg0, float arg1, float arg2) {
      this.field3616[this.field3620].method286(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ev.z(Laig;FFFI)V")
   public final void method6022(class225 arg0, float arg1, float arg2, float arg3) {
      this.field3616[this.field3620].method287(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ev.m(Laig;FFFFB)V")
   public final void method6023(class225 arg0, float arg1, float arg2, float arg3, float arg4) {
      this.field3616[this.field3620].method288(arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("ev.i(Laig;Lkb;I)V")
   public final void method6024(class225 arg0, class584 arg1) {
      this.field3616[this.field3620].method287(arg0, arg1.field5328, arg1.field5330, arg1.field5331);
   }

   @deob.ObfuscatedName("ev.t(Laig;Lkm;I)V")
   public final void method6043(class225 arg0, class595 arg1) {
      this.field3616[this.field3620].method288(arg0, arg1.field5411, arg1.field5410, arg1.field5412, arg1.field5409);
   }

   @deob.ObfuscatedName("ev.c(Laig;[FB)V")
   public final void method6029(class225 arg0, float[] arg1) {
      this.field3616[this.field3620].method333(arg0, arg1, arg1.length);
   }

   @deob.ObfuscatedName("ev.w(Laig;IB)V")
   public final void method6027(class225 arg0, int arg1) {
      float var3 = (float)(arg1 >> 16 & 255) / 255.0F;
      float var4 = (float)(arg1 >> 8 & 255) / 255.0F;
      float var5 = (float)(arg1 & 255) / 255.0F;
      float var6 = (float)(arg1 >> 24 & 255) / 255.0F;
      this.method6023(arg0, var3, var4, var5, var6);
   }

   @deob.ObfuscatedName("ev.q(Laig;Lko;I)V")
   public final void method6028(class225 arg0, class597 arg1) {
      this.field3616[this.field3620].method311(arg0, arg1);
   }

   @deob.ObfuscatedName("ev.y(Laig;Lko;B)V")
   public final void method6076(class225 arg0, class597 arg1) {
      this.field3616[this.field3620].method304(arg0, arg1);
   }

   @deob.ObfuscatedName("ev.j(Laig;ILip;B)V")
   public final void method6030(class225 arg0, int arg1, class536 arg2) {
      this.field3616[this.field3620].method283(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ev.f(IFFFB)V")
   public final void method6031(int arg0, float arg1, float arg2, float arg3) {
      this.field3616[this.field3620].method293(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ev.ai(IFFFFI)V")
   public final void method6035(int arg0, float arg1, float arg2, float arg3, float arg4) {
      this.field3616[this.field3620].method294(arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("ev.ap(ILkb;I)V")
   public final void method6052(int arg0, class584 arg1) {
      this.field3616[this.field3620].method293(arg0, arg1.field5328, arg1.field5330, arg1.field5331);
   }

   @deob.ObfuscatedName("ev.av(I[FII)V")
   public final void method6032(int arg0, float[] arg1, int arg2) {
      this.field3616[this.field3620].method327(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ev.ax(ILko;B)V")
   public final void method6025(int arg0, class597 arg1) {
      this.field3616[this.field3620].method299(arg0, arg1);
   }

   @deob.ObfuscatedName("ev.af(ILko;I)V")
   public final void method6040(int arg0, class597 arg1) {
      this.field3616[this.field3620].method296(arg0, arg1);
   }

   @deob.ObfuscatedName("ev.at(ILko;I)V")
   public final void method6099(int arg0, class597 arg1) {
      this.field3616[this.field3620].method336(arg0, arg1);
   }

   @deob.ObfuscatedName("ev.ah(IILip;B)V")
   public final void method6066(int arg0, int arg1, class536 arg2) {
      this.field3616[this.field3620].method301(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ev.aw(Ljava/lang/String;I)Laig;")
   public class225 method6037(String arg0) throws class283 {
      class225 var2 = (class225)this.field3615.method6454(arg0);
      if (var2 == null) {
         throw new class283(arg0);
      } else {
         return var2;
      }
   }

   @deob.ObfuscatedName("ev.al(I)I")
   public int method6081() {
      return this.field3617;
   }

   @deob.ObfuscatedName("ev.an(IS)Laig;")
   public class225 method6045(int arg0) {
      return (class225)this.field3618.method6461(arg0);
   }

   @deob.ObfuscatedName("ev.ag(Ljava/lang/String;S)Laig;")
   public class225 method6100(String arg0) {
      return (class225)this.field3618.method6454(arg0);
   }

   @deob.ObfuscatedName("ev.ak(B)I")
   public int method6041() {
      return this.field3619;
   }

   @deob.ObfuscatedName("ev.aa(II)Laig;")
   public class225 method6042(int arg0) {
      return (class225)this.field3615.method6461(arg0);
   }

   @deob.ObfuscatedName("ev.ao()V")
   protected void method252() {
   }

   @deob.ObfuscatedName("ev.n()V")
   public abstract void method264();

   @deob.ObfuscatedName("ev.k()V")
   public abstract void method254();

   @deob.ObfuscatedName("ev.r(Lys;Let;)Lej;")
   protected abstract class422 method251(class979 arg0, class432 arg1);

   @deob.ObfuscatedName("ev.d()Z")
   public abstract boolean method255();

   @deob.ObfuscatedName("ev.l(Lej;)Z")
   public abstract boolean method267(class422 arg0);

   @deob.ObfuscatedName("ev.g(Lep;)Laig;")
   protected abstract class225 method250(class428 arg0);
}
