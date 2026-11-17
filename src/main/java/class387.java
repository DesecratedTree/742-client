@deob.ObfuscatedName("db")
public class class387 {
   @deob.ObfuscatedName("db.n")
   private static short[] field2850 = new short[500];
   @deob.ObfuscatedName("db.k")
   private static short[] field2844 = new short[500];
   @deob.ObfuscatedName("db.d")
   private static short[] field2854 = new short[500];
   @deob.ObfuscatedName("db.b")
   private static short[] field2846 = new short[500];
   @deob.ObfuscatedName("db.r")
   private static short[] field2847 = new short[500];
   @deob.ObfuscatedName("db.p")
   private static byte[] field2848 = new byte[500];
   @deob.ObfuscatedName("db.o")
   public class69 field2849 = null;
   @deob.ObfuscatedName("db.a")
   public int field2856 = 0;
   @deob.ObfuscatedName("db.h")
   public boolean field2857 = false;
   @deob.ObfuscatedName("db.e")
   public boolean field2858 = false;
   @deob.ObfuscatedName("db.z")
   public boolean field2859 = false;
   @deob.ObfuscatedName("db.x")
   public short[] field2851;
   @deob.ObfuscatedName("db.s")
   public short[] field2855;
   @deob.ObfuscatedName("db.l")
   public short[] field2853;
   @deob.ObfuscatedName("db.u")
   public short[] field2860;
   @deob.ObfuscatedName("db.v")
   public short[] field2852;
   @deob.ObfuscatedName("db.g")
   public byte[] field2845;

   public class387(byte[] arg0, class69 arg1) {
      this.field2849 = arg1;

      try {
         class124 var3 = new class124(arg0);
         class124 var4 = new class124(arg0);
         var3.method1688();
         var3.field935 += 2;
         int var5 = var3.method1587();
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field935 = var3.field935 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field2849.field499[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method1688();
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field2850[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field2844[var6] = (short)var4.method1603();
               } else {
                  field2844[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field2854[var6] = (short)var4.method1603();
               } else {
                  field2854[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field2846[var6] = (short)var4.method1603();
               } else {
                  field2846[var6] = var12;
               }

               field2848[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field2844[var6] = (short)(field2844[var6] << 2 & 16383);
                  field2854[var6] = (short)(field2854[var6] << 2 & 16383);
                  field2846[var6] = (short)(field2846[var6] << 2 & 16383);
               }

               field2847[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field2857 = true;
                  } else if (var10 == 7) {
                     this.field2858 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field2859 = true;
                  }
               } else if (var7 > var8) {
                  field2847[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (var4.field935 != arg0.length) {
            throw new RuntimeException();
         }

         this.field2856 = var6;
         this.field2851 = new short[var6];
         this.field2855 = new short[var6];
         this.field2853 = new short[var6];
         this.field2860 = new short[var6];
         this.field2852 = new short[var6];
         this.field2845 = new byte[var6];

         for(int var13 = 0; var13 < var6; ++var13) {
            this.field2851[var13] = field2850[var13];
            this.field2855[var13] = field2844[var13];
            this.field2853[var13] = field2854[var13];
            this.field2860[var13] = field2846[var13];
            this.field2852[var13] = field2847[var13];
            this.field2845[var13] = field2848[var13];
         }
      } catch (Exception var15) {
         this.field2856 = 0;
         this.field2857 = false;
         this.field2858 = false;
      }

   }
}
