@deob.ObfuscatedName("aex")
public abstract class class134 extends class775 {
   @deob.ObfuscatedName("aex.l")
   public class713 field1033;
   @deob.ObfuscatedName("aex.v")
   public byte field1032;
   @deob.ObfuscatedName("aex.g")
   public byte field1034;
   @deob.ObfuscatedName("aex.h")
   public int field9959;
   @deob.ObfuscatedName("aex.u")
   public class134 field1035;
   @deob.ObfuscatedName("aex.e")
   public class394[] field1036;

   protected class134(class713 arg0) {
      this.field1033 = arg0;
   }

   @deob.ObfuscatedName("aex.fh(B)I")
   public int method2021() {
      return 0;
   }

   @deob.ObfuscatedName("aex.gn(II[Lacy;I)I")
   protected int method2010(int arg0, int arg1, class81[] arg2) {
      long var4 = this.field1033.field6620[this.field1032][arg0][arg1];
      long var6 = 0L;
      int var8 = 0;

      while(var6 <= 48L) {
         int var9 = (int)(var4 >> (int)var6 & 65535L);
         if (var9 <= 0) {
            break;
         }

         arg2[var8++] = this.field1033.field6621[var9 - 1].field6435;
         var6 += 16L;
      }

      for(int var10 = var8; var10 < 4; ++var10) {
         arg2[var10] = null;
      }

      return var8;
   }

   @deob.ObfuscatedName("agd.gb(Lov;IIILqa;I)V")
   protected static void method2315(class712 arg0, int arg1, int arg2, int arg3, class745 arg4) {
      if (arg4 != null) {
         arg0.method10475(arg1, arg2, arg3, arg4.method7004(), arg4.method7033(), arg4.method6940(), arg4.method6941(), arg4.method6951(), arg4.method7046(), arg4.method6943());
      }
   }

   @deob.ObfuscatedName("aex.bm(B)I")
   public int method162() {
      return -this.method80();
   }

   @deob.ObfuscatedName("aex.gv(IB)V")
   protected void method2017(int arg0) {
      this.field1036 = new class394[arg0];

      for(int var2 = 0; var2 < this.field1036.length; ++var2) {
         this.field1036[var2] = new class394();
      }

   }

   @deob.ObfuscatedName("aex.bw(I)Z")
   public abstract boolean method82();

   @deob.ObfuscatedName("aex.bc(B)Z")
   public abstract boolean method81();

   @deob.ObfuscatedName("aex.bv(Lra;Laex;IIIZI)V")
   public abstract void method2008(class772 arg0, class134 arg1, int arg2, int arg3, int arg4, boolean arg5);

   @deob.ObfuscatedName("aex.bh(Lra;I)Loy;")
   public abstract class715 method2009(class772 arg0);

   @deob.ObfuscatedName("aex.bx(Lra;I)Lov;")
   public abstract class712 method2011(class772 arg0);

   @deob.ObfuscatedName("aex.fx([Lacy;B)I")
   public abstract int method2012(class81[] arg0);

   @deob.ObfuscatedName("aex.gi(B)Z")
   public abstract boolean method2014();

   @deob.ObfuscatedName("aex.by(B)I")
   public abstract int method80();

   @deob.ObfuscatedName("aex.gu(Lra;I)Z")
   public abstract boolean method2015(class772 arg0);

   @deob.ObfuscatedName("aex.bj(I)Z")
   public abstract boolean method2016();

   @deob.ObfuscatedName("aex.bo(Lra;IIB)Z")
   public abstract boolean method2027(class772 arg0, int arg1, int arg2);

   @deob.ObfuscatedName("aex.bd(I)V")
   public abstract void method2028();

   @deob.ObfuscatedName("aex.bn(Lra;I)V")
   public abstract void method2044(class772 arg0);
}
