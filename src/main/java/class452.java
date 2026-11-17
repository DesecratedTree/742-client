import java.util.Iterator;

@deob.ObfuscatedName("fm")
public abstract class class452 {
   @deob.ObfuscatedName("fm.u")
   protected final class584 field3740 = new class584();
   @deob.ObfuscatedName("fm.v")
   protected final class584 field3727 = new class584();
   @deob.ObfuscatedName("fm.h")
   protected final class584 field3729 = new class584();
   @deob.ObfuscatedName("fm.e")
   protected final class584 field3730 = new class584();
   @deob.ObfuscatedName("fm.z")
   protected final class584 field3728 = new class584();
   @deob.ObfuscatedName("fm.m")
   protected final class584 field3732 = new class584();
   @deob.ObfuscatedName("fm.ai")
   protected int field3716 = 0;
   @deob.ObfuscatedName("fm.ap")
   protected float field3722 = 1.0F;
   @deob.ObfuscatedName("fm.av")
   protected class875 field3743 = new class875(8);
   @deob.ObfuscatedName("fm.n")
   private final class462 field3717;
   @deob.ObfuscatedName("fm.a")
   private final class448 field3723;
   @deob.ObfuscatedName("fm.l")
   protected float field3725;
   @deob.ObfuscatedName("fm.t")
   protected float field3731;
   @deob.ObfuscatedName("fm.i")
   protected float field3733;
   @deob.ObfuscatedName("fm.c")
   protected float field3735;
   @deob.ObfuscatedName("fm.q")
   protected float field3737;
   @deob.ObfuscatedName("fm.y")
   protected float field3738;
   @deob.ObfuscatedName("fm.w")
   protected float field3742;
   @deob.ObfuscatedName("fm.s")
   protected int field3724;
   @deob.ObfuscatedName("fm.k")
   private class443 field3734;
   @deob.ObfuscatedName("fm.p")
   protected class444 field3720;
   @deob.ObfuscatedName("fm.b")
   protected class449 field3718;
   @deob.ObfuscatedName("fm.x")
   protected class460 field3721;
   @deob.ObfuscatedName("fm.d")
   protected class464 field3741;
   @deob.ObfuscatedName("fm.o")
   protected class485 field3715;
   @deob.ObfuscatedName("fm.r")
   protected class828 field3719;
   @deob.ObfuscatedName("fm.f")
   protected boolean field3736;
   @deob.ObfuscatedName("fm.j")
   protected boolean field3739;

   protected class452(class462 arg0, class448 arg1) {
      this.field3717 = arg0;
      this.field3723 = arg1;
      this.method6370(true);
   }

   @deob.ObfuscatedName("fm.n(ZI)V")
   private void method6370(boolean arg0) {
      this.field3741 = class464.field3817;
      this.field3718 = null;
      this.field3719 = null;
      this.field3720 = null;
      this.field3715 = null;
      if (class462.field3808 != this.field3717 && arg0) {
         this.field3734 = class443.field3668;
      } else {
         this.field3734 = class443.field3669;
      }

      this.field3721 = class460.field3802;
      this.field3740.method8141(100.0F, 100.0F, 100.0F);
      this.field3727.method8141(100.0F, 100.0F, 100.0F);
      this.field3725 = 0.05F;
      this.field3729.method8141(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      this.field3730.method8141(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      this.field3728.method8141(1.0F, 1.0F, 1.0F);
      this.field3732.method8141(1.0F, 1.0F, 1.0F);
      this.field3733 = 1.1F;
      this.field3731 = 1.1F;
      this.field3735 = 50.0F;
      this.field3742 = 10000.0F;
      this.field3738 = 1.5707964F;
      this.field3737 = 1.5707964F;
      this.field3724 = 5;
      this.field3739 = true;
      this.field3736 = true;
      this.field3716 = 0;
      this.field3722 = 1.0F;
      this.field3743.method15312();
   }

   @deob.ObfuscatedName("fm.k(FLml;[[[II)V")
   public void method6289(float arg0, class648 arg1, int[][][] arg2) {
      if (this.field3719 != null) {
         this.field3719.method2311(arg0);
      }

      if (this.field3715 != null) {
         this.field3715.method187(arg0, arg1, arg2);
      }

      Iterator var4 = this.field3743.iterator();

      while(var4.hasNext()) {
         class260 var5 = (class260)var4.next();
         var5.method3497(arg0);
      }

   }

   @deob.ObfuscatedName("fm.d(ZFLkb;Lkx;Lkb;Lkb;B)V")
   public void method6290(boolean arg0, float arg1, class584 arg2, class606 arg3, class584 arg4, class584 arg5) {
      if (class460.field3800 == this.field3721) {
         class728.method9963(arg1, arg2, arg4, arg5, arg0 ? this.field3730 : this.field3729, arg0 ? this.field3727 : this.field3740, (float)this.field3716, this.field3722);
      } else if (class460.field3802 == this.field3721) {
         class734.method15584(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field3730 : this.field3729, arg0 ? this.field3727 : this.field3740, (float)this.field3716, this.field3722);
      } else if (class460.field3799 == this.field3721) {
         class736.method9996(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field3732 : this.field3728, arg0 ? this.field3731 : this.field3733);
      }

   }

   @deob.ObfuscatedName("fm.b(Lfd;B)V")
   public void method6291(class443 arg0) {
      this.field3734 = arg0;
   }

   @deob.ObfuscatedName("fm.r(Lfj;ZI)Ltc;")
   public class828 method6292(class449 arg0, boolean arg1) throws class168 {
      if (class443.field3669 == this.field3734 && !arg1) {
         throw new class168();
      } else {
         this.field3718 = arg0;
         if (class449.field3709 == arg0) {
            this.field3719 = new class182(this);
         } else if (class449.field3708 == arg0) {
            this.field3719 = new class190(this);
         } else if (class449.field3707 == arg0) {
            this.field3719 = new class178(this);
         } else if (class449.field3706 == arg0) {
            this.field3719 = new class279(this);
         } else if (class449.field3710 == arg0) {
            this.field3719 = new class281(this);
         } else if (class449.field3711 == arg0) {
            this.field3719 = new class187(this);
         }

         return this.field3719;
      }
   }

   @deob.ObfuscatedName("fm.p(Lfe;ZI)Lgs;")
   public class485 method6293(class444 arg0, boolean arg1) throws class168 {
      if (class443.field3669 == this.field3734 && !arg1) {
         throw new class168();
      } else {
         this.field3720 = arg0;
         if (class444.field3672 == arg0) {
            this.field3715 = new class22(this);
         } else if (class444.field3676 == arg0) {
            this.field3715 = new class5(this);
         } else if (class444.field3674 == arg0) {
            this.field3715 = new class208(this);
         } else if (class444.field3675 == arg0) {
            this.field3715 = new class207(this);
         }

         return this.field3715;
      }
   }

   @deob.ObfuscatedName("fm.o(I)Z")
   private boolean method6294() {
      if (class462.field3808 == this.field3717 && class443.field3669 == this.field3734) {
         return true;
      } else {
         return class462.field3809 == this.field3717 && class443.field3668 == this.field3734;
      }
   }

   @deob.ObfuscatedName("fm.a(FI)V")
   public void method6421(float arg0) throws class168 {
      if (!this.method6294()) {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.x(FI)V")
   public void method6296(float arg0) throws class168 {
      if (!this.method6294()) {
         throw new class168();
      } else {
         this.field3725 = arg0;
      }
   }

   @deob.ObfuscatedName("fm.s(Lfu;I)V")
   public void method6297(class460 arg0) throws class168 {
      if (!this.method6294()) {
         throw new class168();
      } else {
         this.field3721 = arg0;
      }
   }

   @deob.ObfuscatedName("fm.l(Lkb;I)V")
   public void method6374(class584 arg0) throws class168 {
      if (this.method6294() && this.field3721.field3798) {
         this.field3729.method8177(arg0);
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.u(Lkb;I)V")
   public void method6299(class584 arg0) throws class168 {
      if (this.method6294() && this.field3721.field3798) {
         this.field3730.method8177(arg0);
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.v(Lkb;I)V")
   public void method6300(class584 arg0) throws class168 {
      if (this.method6294() && this.field3721.field3798) {
         this.field3740.method8177(arg0);
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.g(Lkb;B)V")
   public void method6301(class584 arg0) throws class168 {
      if (this.method6294() && this.field3721.field3798) {
         this.field3727.method8177(arg0);
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.h(Lkb;FI)V")
   public void method6302(class584 arg0, float arg1) throws class168 {
      if (this.method6294() && !this.field3721.field3798) {
         this.field3728.method8177(arg0);
         this.field3732.method8177(arg0);
         this.field3733 = arg1;
         this.field3731 = arg1;
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.e(Lkb;FI)V")
   public void method6357(class584 arg0, float arg1) throws class168 {
      if (this.method6294() && !this.field3721.field3798) {
         this.field3728.method8177(arg0);
         this.field3733 = arg1;
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.z(Lkb;FI)V")
   public void method6304(class584 arg0, float arg1) throws class168 {
      if (this.method6294() && !this.field3721.field3798) {
         this.field3732.method8177(arg0);
         this.field3731 = arg1;
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.m(FFI)V")
   public void method6392(float arg0, float arg1) throws class168 {
      if (!this.method6294()) {
         throw new class168();
      } else {
         this.field3735 = arg0;
         this.field3742 = arg1;
      }
   }

   @deob.ObfuscatedName("fm.i(FFI)V")
   public void method6306(float arg0, float arg1) throws class168 {
      if (!this.method6294()) {
         throw new class168();
      } else {
         this.field3737 = arg0;
         this.field3738 = arg1;
      }
   }

   @deob.ObfuscatedName("fm.t(ZZB)V")
   public void method6355(boolean arg0, boolean arg1) throws class168 {
      if (!this.method6294()) {
         throw new class168();
      } else {
         this.field3739 = arg0;
         this.field3736 = arg1;
      }
   }

   @deob.ObfuscatedName("fm.c(IFB)V")
   public void method6308(int arg0, float arg1) throws class168 {
      if (this.method6294() && this.field3721.field3798) {
         this.field3716 = arg0;
         this.field3722 = arg1;
      } else {
         throw new class168();
      }
   }

   @deob.ObfuscatedName("fm.w(Lajo;I)V")
   public void method6309(class260 arg0) {
      this.field3743.method15311(arg0, (long)arg0.field1735);
   }

   @deob.ObfuscatedName("fm.q(IB)V")
   public void method6310(int arg0) {
      class260 var2 = (class260)this.field3743.method15322((long)arg0);
      if (var2 != null) {
         var2.method9864();
      }

   }

   @deob.ObfuscatedName("fm.y(II)Lajo;")
   public class260 method6380(int arg0) {
      return (class260)this.field3743.method15322((long)arg0);
   }

   @deob.ObfuscatedName("fm.j(I)V")
   public void method6312() {
      this.field3743.method15312();
   }

   @deob.ObfuscatedName("fm.f(I)Z")
   public boolean method6366() {
      if (this.field3719 != null && this.field3715 != null) {
         if (!this.field3719.method2300()) {
            return false;
         } else {
            return this.field3715.method195();
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("fm.ai(Lfv;Lka;Lko;IIB)V")
   public void method6314(class461 arg0, class583 arg1, class597 arg2, int arg3, int arg4) {
      if (this.field3719 != null && this.field3715 != null) {
         this.field3719.method2302(arg0, arg1, arg3, arg4);
         this.field3715.method197(arg0, arg3, arg4);
         if (class464.field3817 == this.field3741) {
            arg2.method8398(this.field3735, this.field3742, this.field3737, this.field3738);
         } else {
            arg2.method8399(this.field3735, this.field3742, (float)this.field3724);
         }

         Iterator var6 = this.field3743.iterator();

         while(var6.hasNext()) {
            class260 var7 = (class260)var6.next();
            var7.method3496(arg0, arg1, arg2);
         }
      }

   }

   @deob.ObfuscatedName("fm.ap(I)Lfd;")
   public class443 method6433() {
      return this.field3734;
   }

   @deob.ObfuscatedName("fm.av(I)Lgs;")
   public class485 method6316() {
      return this.field3715;
   }

   @deob.ObfuscatedName("fm.ax(I)Ltc;")
   public class828 method6373() {
      return this.field3719;
   }

   @deob.ObfuscatedName("fm.af(I)Lfi;")
   public class448 method6318() {
      return this.field3723;
   }

   @deob.ObfuscatedName("fm.at(B)Lfj;")
   public class449 method6313() {
      return this.field3718;
   }

   @deob.ObfuscatedName("fm.ah(I)Lfe;")
   public class444 method6320() {
      return this.field3720;
   }

   @deob.ObfuscatedName("fm.aw(B)Lkb;")
   public class584 method6420() {
      return this.field3715 == null ? null : this.field3715.method188();
   }

   @deob.ObfuscatedName("fm.al(I)Lkb;")
   private class584 method6375() {
      return this.field3719 == null ? null : this.field3719.method2301();
   }

   @deob.ObfuscatedName("fm.an(I)Lade;")
   public class88 method6367() {
      return this.field3715 == null ? null : this.field3715.method190();
   }

   @deob.ObfuscatedName("fm.ag(I)F")
   private float method6324() {
      class584 var1 = this.method6420();
      class584 var2 = this.method6375();
      float var3 = 0.0F;
      if (var1 != null && var2 != null) {
         class584 var4 = class584.method8152(var2, var1);
         float var5 = (float)Math.sqrt((double)(var4.field5331 * var4.field5331 + var4.field5328 * var4.field5328));
         var3 = (float)Math.atan2((double)(-var4.field5330), (double)var5);
         var1.method8201();
         var2.method8201();
      }

      return var3;
   }

   @deob.ObfuscatedName("fm.ak(B)F")
   public float method6425() {
      class584 var1 = this.method6420();
      class584 var2 = this.method6375();
      float var3 = 0.0F;
      if (var1 != null && var2 != null) {
         class584 var4 = class584.method8152(var1, var2);
         var4.field5330 = 0.0F;
         var3 = (float)Math.atan2((double)var4.field5328, (double)var4.field5331);
         var1.method8201();
         var2.method8201();
      }

      return (float)(3.141592653589793D - (double)var3);
   }

   @deob.ObfuscatedName("fm.aa(B)F")
   private float method6424() {
      return 0.0F;
   }

   @deob.ObfuscatedName("fm.ao(I)Lkx;")
   public class606 method6418() {
      class606 var1 = class606.method8602();
      var1.method8613(this.method6425(), this.method6324(), this.method6424());
      return var1;
   }

   @deob.ObfuscatedName("fm.ab(B)Lkb;")
   public class584 method6328() {
      return this.field3729;
   }

   @deob.ObfuscatedName("fm.ae(I)Lkb;")
   public class584 method6329() {
      return this.field3730;
   }

   @deob.ObfuscatedName("fm.az(B)F")
   public float method6330() {
      return this.field3725;
   }

   @deob.ObfuscatedName("fm.aq(I)Lkb;")
   public class584 method6331() {
      return this.field3740;
   }

   @deob.ObfuscatedName("fm.ar(I)Lkb;")
   public class584 method6332() {
      return this.field3727;
   }

   @deob.ObfuscatedName("fm.as(B)F")
   public float method6311() {
      return this.field3735;
   }

   @deob.ObfuscatedName("fm.au(S)F")
   public float method6334() {
      return this.field3742;
   }

   @deob.ObfuscatedName("fm.ad(B)Z")
   public boolean method6335() {
      return this.field3739;
   }

   @deob.ObfuscatedName("fm.am(I)Z")
   public boolean method6336() {
      return this.field3736;
   }
}
