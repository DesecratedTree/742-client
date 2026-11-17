@deob.ObfuscatedName("ud")
public class class856 {
   @deob.ObfuscatedName("ud.r")
   private static long[][] field8752 = new long[8][256];
   @deob.ObfuscatedName("ud.p")
   private static long[] field8753 = new long[11];
   @deob.ObfuscatedName("ud.o")
   private byte[] field8754 = new byte[32];
   @deob.ObfuscatedName("ud.a")
   private byte[] field8755 = new byte[64];
   @deob.ObfuscatedName("ud.x")
   private int field8756 = 0;
   @deob.ObfuscatedName("ud.s")
   private int field8757 = 0;
   @deob.ObfuscatedName("ud.l")
   private long[] field8758 = new long[8];
   @deob.ObfuscatedName("ud.u")
   private long[] field8759 = new long[8];
   @deob.ObfuscatedName("ud.v")
   private long[] field8760 = new long[8];
   @deob.ObfuscatedName("ud.g")
   private long[] field8748 = new long[8];
   @deob.ObfuscatedName("ud.h")
   private long[] field8762 = new long[8];

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         char var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
         long var2 = (var0 & 1) == 0 ? (long)(var1 >>> 8) : (long)(var1 & 255);
         long var4 = var2 << 1;
         if (var4 >= 256L) {
            var4 ^= 285L;
         }

         long var6 = var4 << 1;
         if (var6 >= 256L) {
            var6 ^= 285L;
         }

         long var8 = var6 ^ var2;
         long var10 = var6 << 1;
         if (var10 >= 256L) {
            var10 ^= 285L;
         }

         long var12 = var10 ^ var2;
         field8752[0][var0] = var2 << 56 | var2 << 48 | var6 << 40 | var2 << 32 | var10 << 24 | var8 << 16 | var4 << 8 | var12;

         for(int var14 = 1; var14 < 8; ++var14) {
            field8752[var14][var0] = field8752[var14 - 1][var0] >>> 8 | field8752[var14 - 1][var0] << 56;
         }
      }

      field8753[0] = 0L;

      for(int var15 = 1; var15 <= 10; ++var15) {
         int var16 = (var15 - 1) * 8;
         field8753[var15] = field8752[0][var16] & -72057594037927936L ^ field8752[1][var16 + 1] & 71776119061217280L ^ field8752[2][var16 + 2] & 280375465082880L ^ field8752[3][var16 + 3] & 1095216660480L ^ field8752[4][var16 + 4] & 4278190080L ^ field8752[5][var16 + 5] & 16711680L ^ field8752[6][var16 + 6] & 65280L ^ field8752[7][var16 + 7] & 255L;
      }

   }

   private class856() {
   }

   @deob.ObfuscatedName("ud.n(I)V")
   private void method15080() {
      int var1 = 0;
      int var2 = 0;

      while(var1 < 8) {
         this.field8748[var1] = (long)this.field8755[var2] << 56 ^ ((long)this.field8755[var2 + 1] & 255L) << 48 ^ ((long)this.field8755[var2 + 2] & 255L) << 40 ^ ((long)this.field8755[var2 + 3] & 255L) << 32 ^ ((long)this.field8755[var2 + 4] & 255L) << 24 ^ ((long)this.field8755[var2 + 5] & 255L) << 16 ^ ((long)this.field8755[var2 + 6] & 255L) << 8 ^ (long)this.field8755[var2 + 7] & 255L;
         ++var1;
         var2 += 8;
      }

      for(int var3 = 0; var3 < 8; ++var3) {
         this.field8762[var3] = this.field8748[var3] ^ (this.field8759[var3] = this.field8758[var3]);
      }

      for(int var4 = 1; var4 <= 10; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            this.field8760[var5] = 0L;
            int var6 = 0;
            int var7 = 56;

            while(var6 < 8) {
               this.field8760[var5] ^= field8752[var6][(int)(this.field8759[var5 - var6 & 7] >>> var7) & 255];
               ++var6;
               var7 -= 8;
            }
         }

         for(int var8 = 0; var8 < 8; ++var8) {
            this.field8759[var8] = this.field8760[var8];
         }

         this.field8759[0] ^= field8753[var4];

         for(int var9 = 0; var9 < 8; ++var9) {
            this.field8760[var9] = this.field8759[var9];
            int var10 = 0;
            int var11 = 56;

            while(var10 < 8) {
               this.field8760[var9] ^= field8752[var10][(int)(this.field8762[var9 - var10 & 7] >>> var11) & 255];
               ++var10;
               var11 -= 8;
            }
         }

         for(int var12 = 0; var12 < 8; ++var12) {
            this.field8762[var12] = this.field8760[var12];
         }
      }

      for(int var13 = 0; var13 < 8; ++var13) {
         this.field8758[var13] ^= this.field8762[var13] ^ this.field8748[var13];
      }

   }

   @deob.ObfuscatedName("ud.k(B)V")
   private void method15079() {
      for(int var1 = 0; var1 < 32; ++var1) {
         this.field8754[var1] = 0;
      }

      this.field8757 = 0;
      this.field8756 = 0;
      this.field8755[0] = 0;

      for(int var2 = 0; var2 < 8; ++var2) {
         this.field8758[var2] = 0L;
      }

   }

   @deob.ObfuscatedName("ud.d([BJ)V")
   private void method15085(byte[] arg0, long arg1) {
      int var4 = 0;
      int var5 = 8 - ((int)arg1 & 7) & 7;
      int var6 = this.field8756 & 7;
      long var7 = arg1;
      int var9 = 31;
      int var10 = 0;

      while(var9 >= 0) {
         int var11 = (this.field8754[var9] & 255) + ((int)var7 & 255) + var10;
         this.field8754[var9] = (byte)var11;
         var10 = var11 >>> 8;
         var7 >>>= 8;
         --var9;
      }

      while(arg1 > 8L) {
         int var12 = arg0[var4] << var5 & 255 | (arg0[var4 + 1] & 255) >>> 8 - var5;
         if (var12 < 0 || var12 >= 256) {
            throw new RuntimeException();
         }

         this.field8755[this.field8757 * -2089877941 * 1034771299] = (byte)(this.field8755[this.field8757 * -2089877941 * 1034771299] | var12 >>> var6);
         ++this.field8757;
         this.field8756 += 8 - var6;
         if (this.field8756 == 512) {
            this.method15080();
            this.field8757 = 0;
            this.field8756 = 0;
         }

         this.field8755[this.field8757] = (byte)(var12 << 8 - var6 & 255);
         this.field8756 += var6;
         arg1 -= 8L;
         ++var4;
      }

      int var13;
      if (arg1 > 0L) {
         var13 = arg0[var4] << var5 & 255;
         this.field8755[this.field8757 * -2089877941 * 1034771299] = (byte)(this.field8755[this.field8757 * -2089877941 * 1034771299] | var13 >>> var6);
      } else {
         var13 = 0;
      }

      if ((long)var6 + arg1 < 8L) {
         this.field8756 = (int)((long)(this.field8756 * 513304005) + arg1 * 513304005L) * 441045261;
      } else {
         ++this.field8757;
         this.field8756 += 8 - var6;
         long var14 = arg1 - (long)(8 - var6);
         if (this.field8756 == 512) {
            this.method15080();
            this.field8757 = 0;
            this.field8756 = 0;
         }

         this.field8755[this.field8757] = (byte)(var13 << 8 - var6 & 255);
         this.field8756 += (int)var14;
      }

   }

   @deob.ObfuscatedName("ud.b([BII)V")
   private void method15082(byte[] arg0, int arg1) {
      this.field8755[this.field8757 * -2089877941 * 1034771299] = (byte)(this.field8755[this.field8757 * -2089877941 * 1034771299] | 128 >>> (this.field8756 & 7));
      ++this.field8757;
      if (this.field8757 > 32) {
         while(true) {
            if (this.field8757 >= 64) {
               this.method15080();
               this.field8757 = 0;
               break;
            }

            this.field8755[++this.field8757 - 1] = 0;
         }
      }

      while(this.field8757 < 32) {
         this.field8755[++this.field8757 - 1] = 0;
      }

      System.arraycopy(this.field8754, 0, this.field8755, 32, 32);
      this.method15080();
      int var3 = 0;
      int var4 = arg1;

      while(var3 < 8) {
         long var5 = this.field8758[var3];
         arg0[var4] = (byte)((int)(var5 >>> 56));
         arg0[var4 + 1] = (byte)((int)(var5 >>> 48));
         arg0[var4 + 2] = (byte)((int)(var5 >>> 40));
         arg0[var4 + 3] = (byte)((int)(var5 >>> 32));
         arg0[var4 + 4] = (byte)((int)(var5 >>> 24));
         arg0[var4 + 5] = (byte)((int)(var5 >>> 16));
         arg0[var4 + 6] = (byte)((int)(var5 >>> 8));
         arg0[var4 + 7] = (byte)((int)var5);
         ++var3;
         var4 += 8;
      }

   }

   @deob.ObfuscatedName("dq.r([BIII)[B")
   public static byte[] method5512(byte[] arg0, int arg1, int arg2) {
      byte[] var3;
      if (arg1 > 0) {
         var3 = new byte[arg2];

         for(int var4 = 0; var4 < arg2; ++var4) {
            var3[var4] = arg0[arg1 + var4];
         }
      } else {
         var3 = arg0;
      }

      class856 var5 = new class856();
      var5.method15079();
      var5.method15085(var3, (long)(arg2 * 8));
      byte[] var6 = new byte[64];
      var5.method15082(var6, 0);
      return var6;
   }
}
