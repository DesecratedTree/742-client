import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

@deob.ObfuscatedName("ra")
public abstract class class772 {
   @deob.ObfuscatedName("ra.o")
   private static boolean[] field7099 = new boolean[8];
   @deob.ObfuscatedName("ra.t")
   private int field7107 = -1;
   @deob.ObfuscatedName("ra.q")
   protected Hashtable field7111 = new Hashtable();
   @deob.ObfuscatedName("ra.y")
   private final class973[] field7122 = new class973[4];
   @deob.ObfuscatedName("ra.x")
   public final class637 field7118;
   @deob.ObfuscatedName("ra.a")
   public final int field7106;
   @deob.ObfuscatedName("ra.c")
   protected class403 field7109;
   @deob.ObfuscatedName("ra.w")
   protected class963 field7120;

   public class772(class637 arg0) {
      this.field7118 = arg0;
      int var2 = -1;

      for(int var3 = 0; var3 < 8; ++var3) {
         if (!field7099[var3]) {
            field7099[var3] = true;
            var2 = var3;
            break;
         }
      }

      if (var2 == -1) {
         throw new IllegalStateException("");
      } else {
         this.field7106 = var2;
      }
   }

   @deob.ObfuscatedName("pb.b(ILjava/awt/Canvas;Lma;Llc;II)Lra;")
   public static class772 method10665(int arg0, Canvas arg1, class637 arg2, class612 arg3, int arg4) {
      int var5 = 0;
      int var6 = 0;
      if (arg1 != null) {
         Dimension var7 = arg1.getSize();
         var5 = var7.width;
         var6 = var7.height;
      }

      return method6448(arg0, arg1, arg2, arg3, arg4, var5, var6);
   }

   @deob.ObfuscatedName("fn.p(ILjava/awt/Canvas;Lma;Llc;IIII)Lra;")
   private static synchronized class772 method6448(int arg0, Canvas arg1, class637 arg2, class612 arg3, int arg4, int arg5, int arg6) {
      if (arg0 == 0) {
         return class323.method15672(arg1, arg2, arg5, arg6);
      } else if (arg0 == 2) {
         return class365.method15767(arg1, arg2, arg5, arg6);
      } else if (arg0 == 1) {
         return class377.method5103(arg1, arg2, arg4);
      } else if (arg0 == 5) {
         return class613.method8874(arg1, arg2, arg3, arg4);
      } else if (arg0 == 3) {
         return class579.method8038(arg1, arg2, arg3, arg4);
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @deob.ObfuscatedName("vy.a(II)Z")
   public static boolean method15719(int arg0) {
      return arg0 == 1 || arg0 == 3 || arg0 == 5;
   }

   @deob.ObfuscatedName("nt.x(IB)Z")
   public static boolean method10011(int arg0) {
      return arg0 == 0 || arg0 == 2;
   }

   @deob.ObfuscatedName("ra.l(I)V")
   public final void method11522() throws class165 {
      this.method2745(0, 0);
   }

   @deob.ObfuscatedName("ra.g(I)V")
   public void method11494() {
      field7099[this.field7106] = false;
      Enumeration var1 = this.field7111.keys();

      while(var1.hasMoreElements()) {
         Canvas var2 = (Canvas)var1.nextElement();
         class963 var3 = (class963)this.field7111.get(var2);
         var3.method570();
      }

      this.method2508();
   }

   public void finalize() {
      this.method11494();
   }

   @deob.ObfuscatedName("ct.ah(Ljava/awt/Canvas;I)V")
   public static void method5151(Canvas arg0) {
      try {
         Class var1 = Class.forName("java.awt.Canvas");
         Method var2 = var1.getMethod("setIgnoreRepaint", Boolean.TYPE);
         var2.invoke(arg0, Boolean.TRUE);
      } catch (Exception var4) {
      }

   }

   @deob.ObfuscatedName("ra.aw([I)V")
   public void method11497(int[] arg0) {
      if (this.field7120 != null) {
         arg0[0] = this.field7120.method566();
         arg0[1] = this.field7120.method559();
      } else {
         arg0[1] = 0;
         arg0[0] = 0;
      }

   }

   @deob.ObfuscatedName("ra.al(S)Ldr;")
   public final class403 method11517() {
      return this.field7109;
   }

   @deob.ObfuscatedName("ra.an(I)Lyc;")
   protected final class963 method11498() {
      return this.field7120;
   }

   @deob.ObfuscatedName("ra.ag(Ljava/awt/Canvas;III)V")
   public final void method11495(Canvas arg0, int arg1, int arg2) {
      if (!this.field7111.containsKey(arg0)) {
         method5151(arg0);
         this.method11499(arg0, this.method2512(arg0, arg1, arg2));
      }

   }

   @deob.ObfuscatedName("ra.ak(Ljava/awt/Canvas;Lyc;B)V")
   protected final void method11499(Canvas arg0, class963 arg1) {
      if (arg1 == null) {
         throw new RuntimeException();
      } else {
         this.field7111.put(arg0, arg1);
      }
   }

   @deob.ObfuscatedName("ra.aa(Ljava/awt/Canvas;I)V")
   public final void method11500(Canvas arg0) {
      if (this.field7111.containsKey(arg0)) {
         class963 var2 = (class963)this.field7111.get(arg0);
         var2.method570();
         this.field7111.remove(arg0);
      }

   }

   @deob.ObfuscatedName("ra.ao(Ljava/awt/Canvas;I)V")
   public final void method11519(Canvas arg0) {
      class963 var2 = (class963)this.field7111.get(arg0);
      if (var2 == null) {
         throw new RuntimeException();
      } else if (this.field7107 <= 0 && this.field7120 == this.field7109) {
         if (this.field7109 != null) {
            this.field7109.method541();
         }

         if (this.field7107 < 0) {
            this.field7109 = var2;
         }

         this.field7120 = var2;
         var2.method540();
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("ra.ab(Ljava/awt/Canvas;IIB)V")
   public final void method11521(Canvas arg0, int arg1, int arg2) {
      class963 var4 = (class963)this.field7111.get(arg0);
      if (var4 == null) {
         throw new RuntimeException();
      } else {
         var4.method544(arg1, arg2);
      }
   }

   @deob.ObfuscatedName("ra.ae(Lym;I)V")
   public final void method11502(class973 arg0) {
      if (this.field7107 >= 3) {
         throw new RuntimeException();
      } else {
         if (this.field7107 >= 0) {
            this.field7122[this.field7107].method541();
         } else {
            this.field7120.method541();
         }

         this.field7109 = this.field7122[++this.field7107] = arg0;
         arg0.method540();
      }
   }

   @deob.ObfuscatedName("ra.az(Lym;B)V")
   public final void method11503(class973 arg0) {
      if (this.field7107 >= 0 && this.field7122[this.field7107] == arg0) {
         this.field7122[--this.field7107 + 1] = null;
         arg0.method541();
         if (this.field7107 >= 0) {
            this.field7109 = this.field7122[this.field7107];
            this.field7122[this.field7107].method540();
         } else {
            this.field7109 = this.field7120;
            this.field7120.method540();
         }

      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("ra.bf(Z)V")
   public void method11504(boolean arg0) {
   }

   @deob.ObfuscatedName("ra.bp(IIIIII)V")
   public final void method11505(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method7751(arg0, arg1, arg2, arg3, arg4, 1);
   }

   @deob.ObfuscatedName("ra.bs(IIIIII)V")
   public final void method11524(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method7513(arg0, arg1, arg2, arg3, arg4, 1);
   }

   @deob.ObfuscatedName("ra.br(IIIII)V")
   public final void method11535(int arg0, int arg1, int arg2, int arg3) {
      this.method7519(arg0, arg1, arg2, arg3, 1);
   }

   @deob.ObfuscatedName("ra.bg(IIIII)V")
   public final void method11493(int arg0, int arg1, int arg2, int arg3) {
      this.method7514(arg0, arg1, arg2, arg3, 1);
   }

   @deob.ObfuscatedName("ra.bc(IIIII)V")
   public final void method11506(int arg0, int arg1, int arg2, int arg3) {
      this.method7516(arg0, arg1, arg2, arg3, 1);
   }

   @deob.ObfuscatedName("ra.bw(IIIIII)V")
   public final void method11529(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method7517(arg0, arg1, arg2, arg3, arg4, 1);
   }

   @deob.ObfuscatedName("ra.bd(IIZI)Lcy;")
   public class383 method11511(int arg0, int arg1, boolean arg2) {
      return this.method7612(arg0, arg1, arg2, false);
   }

   @deob.ObfuscatedName("ra.bt([IIIIII)Lcy;")
   public class383 method11534(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      return this.method7654(arg0, arg1, arg2, arg3, arg4, true);
   }

   @deob.ObfuscatedName("ra.bu()V")
   public void method11515() {
   }

   @deob.ObfuscatedName("ra.bl()V")
   public void method11513() {
   }

   @deob.ObfuscatedName("ra.cm()V")
   public void method11514() {
   }

   @deob.ObfuscatedName("ra.cg(B)Z")
   public boolean method11501() {
      return true;
   }

   @deob.ObfuscatedName("ra.cu(IIIIIF)Lacy;")
   public class81 method11507(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class81(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ra.cq(FFFB)V")
   public void method11516(float arg0, float arg1, float arg2) {
      this.method7561(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
   }

   @deob.ObfuscatedName("ra.ch()I")
   public abstract int method7499();

   @deob.ObfuscatedName("ra.o(IIII)V")
   public abstract void method7510(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ra.za()I")
   public abstract int method7488();

   @deob.ObfuscatedName("ra.t()Z")
   public abstract boolean method7489();

   @deob.ObfuscatedName("ra.bj(I)Lv;")
   public abstract class879 method7526(int arg0);

   @deob.ObfuscatedName("ra.ca(Lvd;[Lzk;Z)Ll;")
   public abstract class609 method7606(class883 arg0, class998[] arg1, boolean arg2);

   @deob.ObfuscatedName("ra.ap()Z")
   public abstract boolean method7668();

   @deob.ObfuscatedName("ra.af()Z")
   public abstract boolean method7497();

   @deob.ObfuscatedName("ra.cy(I[Lacy;)V")
   public abstract void method7552(int arg0, class81[] arg1);

   @deob.ObfuscatedName("ra.aq(Ljava/awt/Canvas;II)Lyc;")
   protected abstract class963 method2512(Canvas arg0, int arg1, int arg2);

   @deob.ObfuscatedName("ra.as(IILcn;Ldt;I)Ldm;")
   public abstract class398 method2679(int arg0, int arg1, class372 arg2, class405 arg3, int arg4);

   @deob.ObfuscatedName("ra.au(II)Ldh;")
   public abstract class393 method2514(int arg0, int arg1);

   @deob.ObfuscatedName("ra.ax()Z")
   public abstract boolean method7496();

   @deob.ObfuscatedName("ra.ac()V")
   public abstract void method7503();

   @deob.ObfuscatedName("ra.ay(IIII)V")
   public abstract void method7505(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ra.L()V")
   public abstract void method7508();

   @deob.ObfuscatedName("ra.r(IIII)V")
   public abstract void method7716(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ra.i(I)V")
   public abstract void method2580(int arg0);

   @deob.ObfuscatedName("ra.qa([I)V")
   public abstract void method7511(int[] arg0);

   @deob.ObfuscatedName("ra.ba(II)V")
   public abstract void method2522(int arg0, int arg1);

   @deob.ObfuscatedName("ra.cx()Lko;")
   public abstract class597 method7498();

   @deob.ObfuscatedName("ra.bm(IIIIIILta;II)V")
   public abstract void method7518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8);

   @deob.ObfuscatedName("ra.CA(IIIII)V")
   protected abstract void method7519(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ra.G(IIIII)V")
   public abstract void method7516(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ra.bx(IIIIII)V")
   public abstract void method7517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ra.bn(IIIIIILta;IIIII)V")
   public abstract void method7521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

   @deob.ObfuscatedName("ra.bi(IIZZ)Lcy;")
   public abstract class383 method7612(int arg0, int arg1, boolean arg2, boolean arg3);

   @deob.ObfuscatedName("ra.by(IIFIIFIIFIIII)V")
   public abstract void method7475(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12);

   @deob.ObfuscatedName("ra.be(Ldv;Z)Lcy;")
   public abstract class383 method7529(class407 arg0, boolean arg1);

   @deob.ObfuscatedName("ra.ad(III)Ldh;")
   public abstract class393 method2649(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("ra.at()Z")
   public abstract boolean method7484();

   @deob.ObfuscatedName("ra.cf()Lka;")
   public abstract class583 method7763();

   @deob.ObfuscatedName("ra.cd(II)I")
   public abstract int method7534(int arg0, int arg1);

   @deob.ObfuscatedName("ra.ck(II)I")
   public abstract int method7535(int arg0, int arg1);

   @deob.ObfuscatedName("ra.cp(Ldf;)V")
   public abstract void method7542(class391 arg0);

   @deob.ObfuscatedName("ra.cv(Lka;)V")
   public abstract void method7778(class583 arg0);

   @deob.ObfuscatedName("ra.cr()Lka;")
   public abstract class583 method7544();

   @deob.ObfuscatedName("ra.RA(Z)V")
   public abstract void method7551(boolean arg0);

   @deob.ObfuscatedName("ra.cn()Z")
   public abstract boolean method7574();

   @deob.ObfuscatedName("ra.cc(Lko;)V")
   public abstract void method7545(class597 arg0);

   @deob.ObfuscatedName("ra.IA(F)V")
   public abstract void method7547(float arg0);

   @deob.ObfuscatedName("ra.m(IFFFFF)V")
   public abstract void method7588(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @deob.ObfuscatedName("ra.J(I)V")
   public abstract void method7549(int arg0);

   @deob.ObfuscatedName("ra.ai()Z")
   public abstract boolean method7492();

   @deob.ObfuscatedName("ra.av()Z")
   public abstract boolean method7495();

   @deob.ObfuscatedName("ra.cj(I)V")
   public abstract void method7695(int arg0);

   @deob.ObfuscatedName("ra.cl(IIIIII)Ldo;")
   public abstract class400 method7553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ra.cb(Ldo;Ldo;FLdo;)Ldo;")
   public abstract class400 method2521(class400 arg0, class400 arg1, float arg2, class400 arg3);

   @deob.ObfuscatedName("ra.ci(Ldo;)V")
   public abstract void method7560(class400 arg0);

   @deob.ObfuscatedName("ra.cz()Z")
   public abstract boolean method7558();

   @deob.ObfuscatedName("ra.ct()V")
   public abstract void method7559();

   @deob.ObfuscatedName("ra.bq(IIIIII)V")
   public abstract void method7751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ra.dr(FFFFFF)V")
   protected abstract void method7561(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @deob.ObfuscatedName("ra.do(IIII)V")
   public abstract void method7556(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ra.df()V")
   public abstract void method7557();

   @deob.ObfuscatedName("ra.dk(ILdq;)V")
   public abstract void method7565(int arg0, class402 arg1);

   @deob.ObfuscatedName("ra.de(ILdq;)V")
   public abstract void method7562(int arg0, class402 arg1);

   @deob.ObfuscatedName("ra.O()V")
   public abstract void method7564();

   @deob.ObfuscatedName("ra.dc(Z)V")
   public abstract void method2506(boolean arg0);

   @deob.ObfuscatedName("ra.cw(Ldk;IIII)Lqa;")
   public abstract class745 method7528(class396 arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ra.j()Z")
   public abstract boolean method7491();

   @deob.ObfuscatedName("ra.ce()Lko;")
   public abstract class597 method7509();

   @deob.ObfuscatedName("ra.u(II)V")
   protected abstract void method2745(int arg0, int arg1) throws class165;

   @deob.ObfuscatedName("ra.f()Z")
   public abstract boolean method7494();

   @deob.ObfuscatedName("ra.bv(Lv;)V")
   public abstract void method7709(class879 arg0);

   @deob.ObfuscatedName("ra.co(II[I[I)Lta;")
   public abstract class826 method7531(int arg0, int arg1, int[] arg2, int[] arg3);

   @deob.ObfuscatedName("ra.cs(II[[I[[IIII)Lxa;")
   public abstract class934 method7536(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

   @deob.ObfuscatedName("ra.e()V")
   protected abstract void method2508();

   @deob.ObfuscatedName("ra.c(III)V")
   public abstract void method7550(int arg0, int arg1, int arg2);

   @deob.ObfuscatedName("ra.GA(FF)V")
   public abstract void method7507(float arg0, float arg1);

   @deob.ObfuscatedName("ra.bz([IIIIIZ)Lcy;")
   public abstract class383 method7654(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("ra.B(IIIIII)V")
   public abstract void method7513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ra.bh(IIIIIIIII)V")
   public abstract void method7522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @deob.ObfuscatedName("ra.N(IIIIII[BII)V")
   public abstract void method7769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @deob.ObfuscatedName("ra.w()Z")
   public abstract boolean method7490();

   @deob.ObfuscatedName("ra.ar()Lym;")
   public abstract class973 method2513();

   @deob.ObfuscatedName("ra.XA(IIIII)V")
   public abstract void method7514(int arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ra.bk(IIIIIII)V")
   public abstract void method7727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @deob.ObfuscatedName("ra.DA(ILta;II)V")
   public abstract void method7593(int arg0, class826 arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ra.aj()V")
   public abstract void method2520();

   @deob.ObfuscatedName("ra.dh(FFF[F)V")
   public abstract void method7736(float arg0, float arg1, float arg2, float[] arg3);

   @deob.ObfuscatedName("ra.v()V")
   public abstract void method2507();

   @deob.ObfuscatedName("ra.bb(IIIIZ)Lcy;")
   public abstract class383 method7530(int arg0, int arg1, int arg2, int arg3, boolean arg4);

   @deob.ObfuscatedName("ra.am(IIII)[I")
   public abstract int[] method2609(int arg0, int arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ra.dp(FFF[F)V")
   public abstract void method7525(float arg0, float arg1, float arg2, float[] arg3);

   @deob.ObfuscatedName("ra.s()Lcz;")
   public abstract class384 method2505();

   @deob.ObfuscatedName("ra.bo(IIIIII)I")
   public abstract int method7523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
