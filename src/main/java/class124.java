import java.math.BigInteger;

@deob.ObfuscatedName("aen")
public class class124 extends class674 {
   @deob.ObfuscatedName("aen.p")
   private static int[] field933 = new int[256];
   @deob.ObfuscatedName("aen.a")
   public static long[] field929;
   @deob.ObfuscatedName("aen.b")
   public byte[] field931;
   @deob.ObfuscatedName("aen.r")
   public int field935;

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = var0;

         for(int var2 = 0; var2 < 8; ++var2) {
            if ((var1 & 1) == 1) {
               var1 = var1 >>> 1 ^ -306674912;
            } else {
               var1 >>>= 1;
            }
         }

         field933[var0] = var1;
      }

      field929 = new long[256];

      for(int var3 = 0; var3 < 256; ++var3) {
         long var4 = (long)var3;

         for(int var6 = 0; var6 < 8; ++var6) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field929[var3] = var4;
      }

   }

   @deob.ObfuscatedName("if.n([BIII)I")
   private static int method7338(byte[] arg0, int arg1, int arg2) {
      int var3 = -1;

      for(int var4 = arg1; var4 < arg2; ++var4) {
         var3 = var3 >>> 8 ^ field933[(var3 ^ arg0[var4]) & 255];
      }

      return ~var3;
   }

   @deob.ObfuscatedName("vd.k([BII)I")
   public static int method15424(byte[] arg0, int arg1) {
      return method7338(arg0, 0, arg1);
   }

   public class124(int arg0) {
      this.field931 = class809.method14347(arg0);
      this.field935 = 0;
   }

   public class124(byte[] arg0) {
      this.field931 = arg0;
      this.field935 = 0;
   }

   @deob.ObfuscatedName("aen.d(I)V")
   public void method1567() {
      if (this.field931 != null) {
         class809.method6126(this.field931);
      }

      this.field931 = null;
   }

   @deob.ObfuscatedName("aen.b(II)V")
   public void method1568(int arg0) {
      this.field931[++this.field935 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("aen.r(II)V")
   public void method1569(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("aen.p(IB)V")
   public void method1668(int arg0) {
      this.field931[++this.field935 - 1] = (byte)arg0;
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
   }

   @deob.ObfuscatedName("aen.o(II)V")
   public void method1571(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 16);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("aen.a(II)V")
   public void method1572(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 24);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 16);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("aen.x(IB)V")
   public void method1573(int arg0) {
      this.field931[++this.field935 - 1] = (byte)arg0;
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 16);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 24);
   }

   @deob.ObfuscatedName("aen.s(J)V")
   public void method1574(long arg0) {
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 32));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 24));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 16));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 8));
      this.field931[++this.field935 - 1] = (byte)((int)arg0);
   }

   @deob.ObfuscatedName("aen.l(J)V")
   public void method1575(long arg0) {
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 56));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 48));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 40));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 32));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 24));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 16));
      this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> 8));
      this.field931[++this.field935 - 1] = (byte)((int)arg0);
   }

   @deob.ObfuscatedName("aen.u(JII)V")
   public void method1576(long arg0, int arg1) {
      int var5 = arg1 - 1;
      if (var5 >= 0 && var5 <= 7) {
         for(int var4 = var5 * 8; var4 >= 0; var4 -= 8) {
            this.field931[++this.field935 - 1] = (byte)((int)(arg0 >> var4));
         }

      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("add.z(Ljava/lang/String;I)I")
   public static int method1229(String arg0) {
      return arg0.length() + 1;
   }

   @deob.ObfuscatedName("aen.t(Ljava/lang/String;I)V")
   public void method1577(String arg0) {
      int var2 = arg0.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field935 += class813.method6582(arg0, 0, arg0.length(), this.field931, this.field935);
         this.field931[++this.field935 - 1] = 0;
      }
   }

   @deob.ObfuscatedName("sl.c(Ljava/lang/String;I)I")
   public static int method14353(String arg0) {
      return arg0.length() + 2;
   }

   @deob.ObfuscatedName("aen.w(Ljava/lang/String;I)V")
   public void method1578(String arg0) {
      int var2 = arg0.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field931[++this.field935 - 1] = 0;
         this.field935 += class813.method6582(arg0, 0, arg0.length(), this.field931, this.field935);
         this.field931[++this.field935 - 1] = 0;
      }
   }

   @deob.ObfuscatedName("aen.q(Ljava/lang/CharSequence;I)V")
   public void method1581(CharSequence arg0) {
      int var2 = class759.method9270(arg0);
      this.field931[++this.field935 - 1] = 0;
      this.method1585(var2);
      this.field935 += class759.method5522(this.field931, this.field935, arg0);
   }

   @deob.ObfuscatedName("aen.y([BIII)V")
   public void method1753(byte[] arg0, int arg1, int arg2) {
      for(int var4 = arg1; var4 < arg1 + arg2; ++var4) {
         this.field931[++this.field935 - 1] = arg0[var4];
      }

   }

   @deob.ObfuscatedName("aen.j(II)V")
   public void method1588(int arg0) {
      this.field931[this.field935 - arg0 - 4] = (byte)(arg0 >> 24);
      this.field931[this.field935 - arg0 - 3] = (byte)(arg0 >> 16);
      this.field931[this.field935 - arg0 - 2] = (byte)(arg0 >> 8);
      this.field931[this.field935 - arg0 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("aen.f(II)V")
   public void method1582(int arg0) {
      this.field931[this.field935 - arg0 - 2] = (byte)(arg0 >> 8);
      this.field931[this.field935 - arg0 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("aen.ai(II)V")
   public void method1664(int arg0) {
      this.field931[this.field935 - arg0 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("aen.ap(IS)V")
   public void method1638(int arg0) {
      if (arg0 >= 0 && arg0 < 128) {
         this.method1568(arg0);
      } else if (arg0 >= 0 && arg0 < 32768) {
         this.method1569(arg0 + 32768);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("aen.av(IB)V")
   public void method1585(int arg0) {
      if ((arg0 & -128) != 0) {
         if ((arg0 & -16384) != 0) {
            if ((arg0 & -2097152) != 0) {
               if ((arg0 & -268435456) != 0) {
                  this.method1568(arg0 >>> 28 | 128);
               }

               this.method1568(arg0 >>> 21 | 128);
            }

            this.method1568(arg0 >>> 14 | 128);
         }

         this.method1568(arg0 >>> 7 | 128);
      }

      this.method1568(arg0 & 127);
   }

   @deob.ObfuscatedName("aen.ax(B)I")
   public int method1688() {
      return this.field931[++this.field935 - 1] & 255;
   }

   @deob.ObfuscatedName("aen.af(I)B")
   public byte method1623() {
      return this.field931[++this.field935 - 1];
   }

   @deob.ObfuscatedName("aen.at(I)I")
   public int method1587() {
      this.field935 += 2;
      return ((this.field931[this.field935 - 2] & 255) << 8) + (this.field931[this.field935 - 1] & 255);
   }

   @deob.ObfuscatedName("aen.ah(B)I")
   public int method1723() {
      this.field935 += 2;
      int var1 = ((this.field931[this.field935 - 2] & 255) << 8) + (this.field931[this.field935 - 1] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @deob.ObfuscatedName("aen.aw(B)I")
   public int method1589() {
      this.field935 += 3;
      return (this.field931[this.field935 - 1] & 255) + ((this.field931[this.field935 - 3] & 255) << 16) + ((this.field931[this.field935 - 2] & 255) << 8);
   }

   @deob.ObfuscatedName("aen.al(S)I")
   public int method1590() {
      this.field935 += 3;
      int var1 = (this.field931[this.field935 - 1] & 255) + ((this.field931[this.field935 - 3] & 255) << 16) + ((this.field931[this.field935 - 2] & 255) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @deob.ObfuscatedName("aen.an(S)I")
   public int method1591() {
      this.field935 += 4;
      return (this.field931[this.field935 - 1] & 255) + ((this.field931[this.field935 - 2] & 255) << 8) + ((this.field931[this.field935 - 3] & 255) << 16) + ((this.field931[this.field935 - 4] & 255) << 24);
   }

   @deob.ObfuscatedName("aen.ag(I)I")
   public int method1592() {
      this.field935 += 4;
      return (this.field931[this.field935 - 4] & 255) + ((this.field931[this.field935 - 3] & 255) << 8) + ((this.field931[this.field935 - 2] & 255) << 16) + ((this.field931[this.field935 - 1] & 255) << 24);
   }

   @deob.ObfuscatedName("aen.ak(I)J")
   public long method1715() {
      long var1 = (long)this.method1688() & 4294967295L;
      long var3 = (long)this.method1591() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @deob.ObfuscatedName("aen.aa(B)J")
   public long method1621() {
      long var1 = (long)this.method1591() & 4294967295L;
      long var3 = (long)this.method1591() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @deob.ObfuscatedName("aen.ao(I)J")
   public long method1691() {
      long var1 = (long)this.method1592() & 4294967295L;
      long var3 = (long)this.method1592() & 4294967295L;
      return (var3 << 32) + var1;
   }

   @deob.ObfuscatedName("aen.ab(II)J")
   public long method1764(int arg0) {
      int var5 = arg0 - 1;
      if (var5 >= 0 && var5 <= 7) {
         int var2 = var5 * 8;
         long var3 = 0L;

         while(var2 >= 0) {
            var3 |= ((long)this.field931[++this.field935 - 1] & 255L) << var2;
            var2 -= 8;
         }

         return var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @deob.ObfuscatedName("aen.ae(B)F")
   public float method1660() {
      return Float.intBitsToFloat(this.method1591());
   }

   @deob.ObfuscatedName("aen.az(I)Ljava/lang/String;")
   public String method1598() {
      if (this.field931[this.field935] == 0) {
         ++this.field935;
         return null;
      } else {
         return this.method1599();
      }
   }

   @deob.ObfuscatedName("aen.aq(I)Ljava/lang/String;")
   public String method1599() {
      int var1 = this.field935;

      while(this.field931[++this.field935 - 1] != 0) {
      }

      int var2 = this.field935 - var1 - 1;
      return var2 == 0 ? "" : Statics.method5675(this.field931, var1, var2);
   }

   @deob.ObfuscatedName("aen.ar(I)Ljava/lang/String;")
   public String method1600() {
      byte var1 = this.field931[++this.field935 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.field935;

         while(this.field931[++this.field935 - 1] != 0) {
         }

         int var3 = this.field935 - var2 - 1;
         return var3 == 0 ? "" : Statics.method5675(this.field931, var2, var3);
      }
   }

   @deob.ObfuscatedName("aen.as(I)Ljava/lang/String;")
   public String method1641() {
      byte var1 = this.field931[++this.field935 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method1596();
         if (this.field935 + var2 > this.field931.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = class759.method3481(this.field931, this.field935, var2);
            this.field935 += var2;
            return var3;
         }
      }
   }

   @deob.ObfuscatedName("aen.au([BIII)V")
   public void method1602(byte[] arg0, int arg1, int arg2) {
      for(int var4 = arg1; var4 < arg1 + arg2; ++var4) {
         arg0[var4] = this.field931[++this.field935 - 1];
      }

   }

   @deob.ObfuscatedName("aen.ad(I)I")
   public int method1603() {
      int var1 = this.field931[this.field935] & 255;
      return var1 < 128 ? this.method1688() - 64 : this.method1587() - 49152;
   }

   @deob.ObfuscatedName("aen.am(S)I")
   public int method1604() {
      int var1 = this.field931[this.field935] & 255;
      return var1 < 128 ? this.method1688() : this.method1587() - 32768;
   }

   @deob.ObfuscatedName("aen.aj(I)I")
   public int method1566() {
      int var1 = this.field931[this.field935] & 255;
      return var1 < 128 ? this.method1688() - 1 : this.method1587() - 32769;
   }

   @deob.ObfuscatedName("aen.ac(I)I")
   public int method1606() {
      int var1 = 0;

      int var2;
      for(var2 = this.method1604(); var2 == 32767; var2 = this.method1604()) {
         var1 += 32767;
      }

      return var1 + var2;
   }

   @deob.ObfuscatedName("aen.ay(I)I")
   public int method1607() {
      return this.field931[this.field935] < 0 ? this.method1591() & Integer.MAX_VALUE : this.method1587();
   }

   @deob.ObfuscatedName("aen.bf(I)I")
   public int method1608() {
      if (this.field931[this.field935] < 0) {
         return this.method1591() & Integer.MAX_VALUE;
      } else {
         int var1 = this.method1587();
         return var1 == 32767 ? -1 : var1;
      }
   }

   @deob.ObfuscatedName("aen.bp(I)I")
   public int method1596() {
      byte var1 = this.field931[++this.field935 - 1];
      int var2 = 0;

      while(var1 < 0) {
         var2 = (var2 | var1 & 127) << 7;
         var1 = this.field931[++this.field935 - 1];
      }

      return var2 | var1;
   }

   @deob.ObfuscatedName("aen.bs([IB)V")
   public void method1610(int[] arg0) {
      int var2 = this.field935 / 8;
      this.field935 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method1591();
         int var5 = this.method1591();
         int var6 = -957401312;
         int var7 = -1640531527;
         int var8 = 32;

         while(var8-- > 0) {
            var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 3] + var6;
            var6 -= var7;
            var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 3] + var6;
         }

         this.field935 -= 8;
         this.method1572(var4);
         this.method1572(var5);
      }

   }

   @deob.ObfuscatedName("aen.br([IIII)V")
   public void method1673(int[] arg0, int arg1, int arg2) {
      int var4 = this.field935;
      this.field935 = arg1;
      int var5 = (arg2 - arg1) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method1591();
         int var8 = this.method1591();
         int var9 = 0;
         int var10 = -1640531527;
         int var11 = 32;

         while(var11-- > 0) {
            var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 3] + var9;
            var9 += var10;
            var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 3] + var9;
         }

         this.field935 -= 8;
         this.method1572(var7);
         this.method1572(var8);
      }

      this.field935 = var4;
   }

   @deob.ObfuscatedName("aen.ba([IIII)V")
   public void method1612(int[] arg0, int arg1, int arg2) {
      int var4 = this.field935;
      this.field935 = arg1;
      int var5 = (arg2 - arg1) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method1591();
         int var8 = this.method1591();
         int var9 = -957401312;
         int var10 = -1640531527;
         int var11 = 32;

         while(var11-- > 0) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 3] + var9;
            var9 -= var10;
            var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 3] + var9;
         }

         this.field935 -= 8;
         this.method1572(var7);
         this.method1572(var8);
      }

      this.field935 = var4;
   }

   @deob.ObfuscatedName("aen.bg(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
   public void method1601(BigInteger arg0, BigInteger arg1) {
      int var3 = this.field935;
      this.field935 = 0;
      byte[] var4 = new byte[var3];
      this.method1602(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(arg0, arg1);
      byte[] var7 = var6.toByteArray();
      this.field935 = 0;
      this.method1569(var7.length);
      this.method1753(var7, 0, var7.length);
   }

   @deob.ObfuscatedName("aen.bc(II)I")
   public int method1614(int arg0) {
      int var2 = method7338(this.field931, arg0, this.field935);
      this.method1572(var2);
      return var2;
   }

   @deob.ObfuscatedName("aen.bw(I)Z")
   public boolean method1615() {
      this.field935 -= 4;
      int var1 = method7338(this.field931, 0, this.field935);
      int var2 = this.method1591();
      return var1 == var2;
   }

   @deob.ObfuscatedName("aen.bq(II)V")
   public void method1616(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 + 128);
   }

   @deob.ObfuscatedName("aen.by(IB)V")
   public void method1772(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(0 - arg0);
   }

   @deob.ObfuscatedName("aen.bx(II)V")
   public void method1738(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(128 - arg0);
   }

   @deob.ObfuscatedName("aen.bm(I)I")
   public int method1619() {
      return this.field931[++this.field935 - 1] - 128 & 255;
   }

   @deob.ObfuscatedName("aen.bh(B)I")
   public int method1579() {
      return 0 - this.field931[++this.field935 - 1] & 255;
   }

   @deob.ObfuscatedName("aen.bn(B)I")
   public int method1778() {
      return 128 - this.field931[++this.field935 - 1] & 255;
   }

   @deob.ObfuscatedName("aen.bk(I)B")
   public byte method1622() {
      return (byte)(this.field931[++this.field935 - 1] - 128);
   }

   @deob.ObfuscatedName("aen.bo(I)B")
   public byte method1730() {
      return (byte)(0 - this.field931[++this.field935 - 1]);
   }

   @deob.ObfuscatedName("aen.bj(I)B")
   public byte method1594() {
      return (byte)(128 - this.field931[++this.field935 - 1]);
   }

   @deob.ObfuscatedName("aen.bv(II)V")
   public void method1718(int arg0) {
      this.field931[++this.field935 - 1] = (byte)arg0;
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
   }

   @deob.ObfuscatedName("aen.bd(II)V")
   public void method1750(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)(arg0 + 128);
   }

   @deob.ObfuscatedName("aen.bi(II)V")
   public void method1627(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 + 128);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
   }

   @deob.ObfuscatedName("aen.bz(I)I")
   public int method1628() {
      this.field935 += 2;
      return ((this.field931[this.field935 - 1] & 255) << 8) + (this.field931[this.field935 - 2] & 255);
   }

   @deob.ObfuscatedName("aen.bt(I)I")
   public int method1629() {
      this.field935 += 2;
      return ((this.field931[this.field935 - 2] & 255) << 8) + (this.field931[this.field935 - 1] - 128 & 255);
   }

   @deob.ObfuscatedName("aen.be(B)I")
   public int method1780() {
      this.field935 += 2;
      return ((this.field931[this.field935 - 1] & 255) << 8) + (this.field931[this.field935 - 2] - 128 & 255);
   }

   @deob.ObfuscatedName("aen.bb(I)I")
   public int method1754() {
      this.field935 += 2;
      int var1 = ((this.field931[this.field935 - 1] & 255) << 8) + (this.field931[this.field935 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @deob.ObfuscatedName("aen.bu(I)I")
   public int method1632() {
      this.field935 += 2;
      int var1 = ((this.field931[this.field935 - 1] & 255) << 8) + (this.field931[this.field935 - 2] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @deob.ObfuscatedName("aen.bl(II)V")
   public void method1700(int arg0) {
      this.field931[++this.field935 - 1] = (byte)arg0;
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 16);
   }

   @deob.ObfuscatedName("aen.cm(I)I")
   public int method1634() {
      this.field935 += 3;
      return (this.field931[this.field935 - 2] & 255) + ((this.field931[this.field935 - 3] & 255) << 16) + ((this.field931[this.field935 - 1] & 255) << 8);
   }

   @deob.ObfuscatedName("aen.co(II)V")
   public void method1635(int arg0) {
      this.field931[++this.field935 - 1] = (byte)arg0;
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 16);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 24);
   }

   @deob.ObfuscatedName("aen.ca(II)V")
   public void method1636(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
      this.field931[++this.field935 - 1] = (byte)arg0;
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 24);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 16);
   }

   @deob.ObfuscatedName("aen.ce(II)V")
   public void method1719(int arg0) {
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 16);
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 24);
      this.field931[++this.field935 - 1] = (byte)arg0;
      this.field931[++this.field935 - 1] = (byte)(arg0 >> 8);
   }

   @deob.ObfuscatedName("aen.cf(I)I")
   public int method1611() {
      this.field935 += 4;
      return (this.field931[this.field935 - 4] & 255) + ((this.field931[this.field935 - 3] & 255) << 8) + ((this.field931[this.field935 - 1] & 255) << 24) + ((this.field931[this.field935 - 2] & 255) << 16);
   }

   @deob.ObfuscatedName("aen.cj(B)I")
   public int method1639() {
      this.field935 += 4;
      return (this.field931[this.field935 - 3] & 255) + ((this.field931[this.field935 - 4] & 255) << 8) + ((this.field931[this.field935 - 1] & 255) << 16) + ((this.field931[this.field935 - 2] & 255) << 24);
   }

   @deob.ObfuscatedName("aen.cw(I)I")
   public int method1640() {
      this.field935 += 4;
      return (this.field931[this.field935 - 2] & 255) + ((this.field931[this.field935 - 1] & 255) << 8) + ((this.field931[this.field935 - 3] & 255) << 24) + ((this.field931[this.field935 - 4] & 255) << 16);
   }

   @deob.ObfuscatedName("aen.cd([BIIS)V")
   public void method1747(byte[] arg0, int arg1, int arg2) {
      for(int var4 = arg1 + arg2 - 1; var4 >= arg1; --var4) {
         arg0[var4] = this.field931[++this.field935 - 1];
      }

   }
}
