@deob.ObfuscatedName("dk")
public class class396 {
   @deob.ObfuscatedName("dk.n")
   public int field2934 = 12;
   @deob.ObfuscatedName("dk.k")
   public int field2908 = 0;
   @deob.ObfuscatedName("dk.d")
   public int field2909 = 0;
   @deob.ObfuscatedName("dk.x")
   public int field2914 = 0;
   @deob.ObfuscatedName("dk.t")
   public byte field2923 = 0;
   @deob.ObfuscatedName("dk.w")
   public int field2928 = 0;
   @deob.ObfuscatedName("dk.b")
   public int[] field2910;
   @deob.ObfuscatedName("dk.r")
   public int[] field2911;
   @deob.ObfuscatedName("dk.p")
   public int[] field2940;
   @deob.ObfuscatedName("dk.o")
   public int[] field2913;
   @deob.ObfuscatedName("dk.s")
   public short[] field2916;
   @deob.ObfuscatedName("dk.l")
   public short[] field2912;
   @deob.ObfuscatedName("dk.u")
   public short[] field2918;
   @deob.ObfuscatedName("dk.v")
   public byte[] field2919;
   @deob.ObfuscatedName("dk.g")
   public byte[] field2943;
   @deob.ObfuscatedName("dk.h")
   public byte[] field2921;
   @deob.ObfuscatedName("dk.e")
   public byte[] field2922;
   @deob.ObfuscatedName("dk.z")
   public short[] field2927;
   @deob.ObfuscatedName("dk.m")
   public short[] field2924;
   @deob.ObfuscatedName("dk.i")
   public int[] field2925;
   @deob.ObfuscatedName("dk.q")
   public byte[] field2920;
   @deob.ObfuscatedName("dk.y")
   public short[] field2930;
   @deob.ObfuscatedName("dk.j")
   public short[] field2931;
   @deob.ObfuscatedName("dk.f")
   public short[] field2932;
   @deob.ObfuscatedName("dk.ai")
   public int[] field2933;
   @deob.ObfuscatedName("dk.ap")
   public int[] field2917;
   @deob.ObfuscatedName("dk.av")
   public int[] field2935;
   @deob.ObfuscatedName("dk.ah")
   public byte[] field2939;
   @deob.ObfuscatedName("dk.aw")
   public byte[] field2915;
   @deob.ObfuscatedName("dk.ax")
   public int[] field2936;
   @deob.ObfuscatedName("dk.af")
   public int[] field2942;
   @deob.ObfuscatedName("dk.at")
   public int[] field2938;
   @deob.ObfuscatedName("dk.al")
   public class408[] field2941;
   @deob.ObfuscatedName("dk.an")
   public class370[] field2929;
   @deob.ObfuscatedName("dk.ag")
   public class395[] field2937;
   @deob.ObfuscatedName("dk.a")
   public short[] field2926;
   @deob.ObfuscatedName("dk.c")
   public short[] field2907;

   public class396(int arg0, int arg1, int arg2) {
      this.field2910 = new int[arg0];
      this.field2911 = new int[arg0];
      this.field2940 = new int[arg0];
      this.field2913 = new int[arg0];
      this.field2916 = new short[arg1];
      this.field2912 = new short[arg1];
      this.field2918 = new short[arg1];
      this.field2919 = new byte[arg1];
      this.field2943 = new byte[arg1];
      this.field2921 = new byte[arg1];
      this.field2922 = new byte[arg1];
      this.field2927 = new short[arg1];
      this.field2924 = new short[arg1];
      this.field2925 = new int[arg1];
      if (arg2 > 0) {
         this.field2920 = new byte[arg2];
         this.field2930 = new short[arg2];
         this.field2931 = new short[arg2];
         this.field2932 = new short[arg2];
         this.field2933 = new int[arg2];
         this.field2917 = new int[arg2];
         this.field2935 = new int[arg2];
         this.field2939 = new byte[arg2];
         this.field2915 = new byte[arg2];
         this.field2936 = new int[arg2];
         this.field2942 = new int[arg2];
         this.field2938 = new int[arg2];
      }

   }

   private class396(byte[] arg0) {
      if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
         this.method5413(arg0);
      } else {
         this.method5416(arg0);
      }

   }

   public class396(class396[] arg0, int arg1) {
      this.field2908 = 0;
      this.field2914 = 0;
      this.field2928 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      this.field2923 = -1;

      for(int var12 = 0; var12 < arg1; ++var12) {
         class396 var13 = arg0[var12];
         if (var13 != null) {
            this.field2908 += var13.field2908;
            this.field2914 += var13.field2914;
            this.field2928 += var13.field2928;
            if (var13.field2941 != null) {
               var3 += var13.field2941.length;
            }

            if (var13.field2929 != null) {
               var4 += var13.field2929.length;
            }

            if (var13.field2937 != null) {
               var5 += var13.field2937.length;
            }

            var6 |= var13.field2919 != null;
            if (var13.field2943 != null) {
               var7 = true;
            } else {
               if (this.field2923 == -1) {
                  this.field2923 = var13.field2923;
               }

               if (this.field2923 != var13.field2923) {
                  var7 = true;
               }
            }

            var8 |= var13.field2921 != null;
            var9 |= var13.field2922 != null;
            var10 |= var13.field2924 != null;
            var11 |= var13.field2925 != null;
         }
      }

      this.field2910 = new int[this.field2908];
      this.field2911 = new int[this.field2908];
      this.field2940 = new int[this.field2908];
      this.field2913 = new int[this.field2908];
      this.field2926 = new short[this.field2908];
      this.field2916 = new short[this.field2914];
      this.field2912 = new short[this.field2914];
      this.field2918 = new short[this.field2914];
      if (var6) {
         this.field2919 = new byte[this.field2914];
      }

      if (var7) {
         this.field2943 = new byte[this.field2914];
      }

      if (var8) {
         this.field2921 = new byte[this.field2914];
      }

      if (var9) {
         this.field2922 = new byte[this.field2914];
      }

      this.field2927 = new short[this.field2914];
      if (var10) {
         this.field2924 = new short[this.field2914];
      }

      if (var11) {
         this.field2925 = new int[this.field2914];
      }

      this.field2907 = new short[this.field2914];
      if (this.field2928 > 0) {
         this.field2920 = new byte[this.field2928];
         this.field2930 = new short[this.field2928];
         this.field2931 = new short[this.field2928];
         this.field2932 = new short[this.field2928];
         this.field2933 = new int[this.field2928];
         this.field2917 = new int[this.field2928];
         this.field2935 = new int[this.field2928];
         this.field2939 = new byte[this.field2928];
         this.field2915 = new byte[this.field2928];
         this.field2936 = new int[this.field2928];
         this.field2942 = new int[this.field2928];
         this.field2938 = new int[this.field2928];
      }

      if (var5 > 0) {
         this.field2937 = new class395[var5];
      }

      if (var3 > 0) {
         this.field2941 = new class408[var3];
      }

      if (var4 > 0) {
         this.field2929 = new class370[var4];
      }

      this.field2908 = 0;
      this.field2914 = 0;
      this.field2928 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;

      for(int var17 = 0; var17 < arg1; ++var17) {
         short var18 = (short)(1 << var17);
         class396 var19 = arg0[var17];
         if (var19 != null) {
            if (var19.field2937 != null) {
               for(int var20 = 0; var20 < var19.field2937.length; ++var20) {
                  class395 var21 = var19.field2937[var20];
                  this.field2937[var16++] = var21.method5397(var21.field2903 + this.field2914);
               }
            }

            for(int var22 = 0; var22 < var19.field2914; ++var22) {
               if (var6 && var19.field2919 != null) {
                  this.field2919[this.field2914] = var19.field2919[var22];
               }

               if (var7) {
                  if (var19.field2943 != null) {
                     this.field2943[this.field2914] = var19.field2943[var22];
                  } else {
                     this.field2943[this.field2914] = var19.field2923;
                  }
               }

               if (var8 && var19.field2921 != null) {
                  this.field2921[this.field2914] = var19.field2921[var22];
               }

               if (var10) {
                  if (var19.field2924 != null) {
                     this.field2924[this.field2914] = var19.field2924[var22];
                  } else {
                     this.field2924[this.field2914] = -1;
                  }
               }

               if (var11) {
                  if (var19.field2925 != null) {
                     this.field2925[this.field2914] = var19.field2925[var22];
                  } else {
                     this.field2925[this.field2914] = -1;
                  }
               }

               this.field2916[this.field2914] = (short)this.method5437(var19, var19.field2916[var22], var18);
               this.field2912[this.field2914] = (short)this.method5437(var19, var19.field2912[var22], var18);
               this.field2918[this.field2914] = (short)this.method5437(var19, var19.field2918[var22], var18);
               this.field2907[this.field2914] = var18;
               this.field2927[this.field2914] = var19.field2927[var22];
               ++this.field2914;
            }

            if (var19.field2941 != null) {
               for(int var23 = 0; var23 < var19.field2941.length; ++var23) {
                  int var24 = this.method5437(var19, var19.field2941[var23].field3079, var18);
                  int var25 = this.method5437(var19, var19.field2941[var23].field3071, var18);
                  int var26 = this.method5437(var19, var19.field2941[var23].field3068, var18);
                  this.field2941[var14] = var19.field2941[var23].method5618(var24, var25, var26);
                  ++var14;
               }
            }

            if (var19.field2929 != null) {
               for(int var27 = 0; var27 < var19.field2929.length; ++var27) {
                  int var28 = this.method5437(var19, var19.field2929[var27].field2383, var18);
                  this.field2929[var15] = var19.field2929[var27].method4542(var28);
                  ++var15;
               }
            }
         }
      }

      int var29 = 0;
      this.field2909 = this.field2908;

      for(int var30 = 0; var30 < arg1; ++var30) {
         short var31 = (short)(1 << var30);
         class396 var32 = arg0[var30];
         if (var32 != null) {
            for(int var33 = 0; var33 < var32.field2914; ++var33) {
               if (var9) {
                  this.field2922[var29++] = (byte)(var32.field2922 != null && var32.field2922[var33] != -1 ? var32.field2922[var33] + this.field2928 : -1);
               }
            }

            for(int var34 = 0; var34 < var32.field2928; ++var34) {
               byte var35 = this.field2920[this.field2928] = var32.field2920[var34];
               if (var35 == 0) {
                  this.field2930[this.field2928] = (short)this.method5437(var32, var32.field2930[var34], var31);
                  this.field2931[this.field2928] = (short)this.method5437(var32, var32.field2931[var34], var31);
                  this.field2932[this.field2928] = (short)this.method5437(var32, var32.field2932[var34], var31);
               }

               if (var35 >= 1 && var35 <= 3) {
                  this.field2930[this.field2928] = var32.field2930[var34];
                  this.field2931[this.field2928] = var32.field2931[var34];
                  this.field2932[this.field2928] = var32.field2932[var34];
                  this.field2933[this.field2928] = var32.field2933[var34];
                  this.field2917[this.field2928] = var32.field2917[var34];
                  this.field2935[this.field2928] = var32.field2935[var34];
                  this.field2939[this.field2928] = var32.field2939[var34];
                  this.field2915[this.field2928] = var32.field2915[var34];
                  this.field2936[this.field2928] = var32.field2936[var34];
               }

               if (var35 == 2) {
                  this.field2942[this.field2928] = var32.field2942[var34];
                  this.field2938[this.field2928] = var32.field2938[var34];
               }

               ++this.field2928;
            }
         }
      }

   }

   @deob.ObfuscatedName("dk.n(Llc;II)Ldk;")
   public static class396 method5419(class612 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method8771(arg1, arg2);
      return var3 == null ? null : new class396(var3);
   }

   @deob.ObfuscatedName("dk.k(Ldk;IS)I")
   private final int method5437(class396 arg0, int arg1, short arg2) {
      int var4 = arg0.field2910[arg1];
      int var5 = arg0.field2911[arg1];
      int var6 = arg0.field2940[arg1];

      for(int var7 = 0; var7 < this.field2908; ++var7) {
         if (this.field2910[var7] == var4 && this.field2911[var7] == var5 && this.field2940[var7] == var6) {
            this.field2926[var7] |= arg2;
            return var7;
         }
      }

      this.field2910[this.field2908] = var4;
      this.field2911[this.field2908] = var5;
      this.field2940[this.field2908] = var6;
      this.field2926[this.field2908] = arg2;
      this.field2913[this.field2908] = arg0.field2913 != null ? arg0.field2913[arg1] : -1;
      return this.field2908++;
   }

   @deob.ObfuscatedName("dk.d([B)V")
   private void method5413(byte[] arg0) {
      class124 var2 = new class124(arg0);
      class124 var3 = new class124(arg0);
      class124 var4 = new class124(arg0);
      class124 var5 = new class124(arg0);
      class124 var6 = new class124(arg0);
      class124 var7 = new class124(arg0);
      class124 var8 = new class124(arg0);
      var2.field935 = arg0.length - 23;
      this.field2908 = var2.method1587();
      this.field2914 = var2.method1587();
      this.field2928 = var2.method1688();
      int var9 = var2.method1688();
      boolean var10 = (var9 & 1) == 1;
      boolean var11 = (var9 & 2) == 2;
      boolean var12 = (var9 & 4) == 4;
      boolean var13 = (var9 & 8) == 8;
      boolean var14 = (var9 & 16) == 16;
      boolean var15 = (var9 & 32) == 32;
      boolean var16 = (var9 & 64) == 64;
      if (var13) {
         var2.field935 -= 7;
         this.field2934 = var2.method1688();
         var2.field935 += 6;
      }

      int var17 = var2.method1688();
      int var18 = var2.method1688();
      int var19 = var2.method1688();
      int var20 = var2.method1688();
      int var21 = var2.method1688();
      int var22 = var2.method1587();
      int var23 = var2.method1587();
      int var24 = var2.method1587();
      int var25 = var2.method1587();
      int var26 = var2.method1587();
      int var27;
      if (var14) {
         var27 = var2.method1587();
      } else if (var21 == 1) {
         var27 = this.field2908;
      } else {
         var27 = 0;
      }

      int var28;
      if (var15) {
         var28 = var2.method1587();
      } else if (var19 == 1) {
         var28 = this.field2914;
      } else {
         var28 = 0;
      }

      int var29 = 0;
      int var30 = 0;
      int var31 = 0;
      if (this.field2928 > 0) {
         this.field2920 = new byte[this.field2928];
         var2.field935 = 0;

         for(int var32 = 0; var32 < this.field2928; ++var32) {
            byte var33 = this.field2920[var32] = var2.method1623();
            if (var33 == 0) {
               ++var29;
            }

            if (var33 >= 1 && var33 <= 3) {
               ++var30;
            }

            if (var33 == 2) {
               ++var31;
            }
         }
      }

      int var34 = this.field2928;
      int var36 = this.field2908 + var34;
      int var37 = var36;
      if (var10) {
         var36 += this.field2914;
      }

      int var39 = this.field2914 + var36;
      int var40 = var39;
      if (var17 == 255) {
         var39 += this.field2914;
      }

      int var42 = var28 + var39;
      int var44 = var27 + var42;
      int var45 = var44;
      if (var18 == 1) {
         var44 += this.field2914;
      }

      int var47 = var25 + var44;
      int var48 = var47;
      if (var20 == 1) {
         var47 += this.field2914 * 2;
      }

      int var50 = var26 + var47;
      int var52 = this.field2914 * 2 + var50;
      int var54 = var22 + var52;
      int var56 = var23 + var54;
      int var58 = var24 + var56;
      int var60 = var29 * 6 + var58;
      int var62 = var30 * 6 + var60;
      byte var63 = 6;
      if (this.field2934 == 14) {
         var63 = 7;
      } else if (this.field2934 >= 15) {
         var63 = 9;
      }

      int var65 = var30 * var63 + var62;
      int var67 = var30 + var65;
      int var69 = var30 + var67;
      int var71 = var31 * 2 + var30 + var69;
      this.field2910 = new int[this.field2908];
      this.field2911 = new int[this.field2908];
      this.field2940 = new int[this.field2908];
      this.field2916 = new short[this.field2914];
      this.field2912 = new short[this.field2914];
      this.field2918 = new short[this.field2914];
      if (var21 == 1) {
         this.field2913 = new int[this.field2908];
      }

      if (var10) {
         this.field2919 = new byte[this.field2914];
      }

      if (var17 == 255) {
         this.field2943 = new byte[this.field2914];
      } else {
         this.field2923 = (byte)var17;
      }

      if (var18 == 1) {
         this.field2921 = new byte[this.field2914];
      }

      if (var19 == 1) {
         this.field2925 = new int[this.field2914];
      }

      if (var20 == 1) {
         this.field2924 = new short[this.field2914];
      }

      if (var20 == 1 && this.field2928 > 0) {
         this.field2922 = new byte[this.field2914];
      }

      this.field2927 = new short[this.field2914];
      if (this.field2928 > 0) {
         this.field2930 = new short[this.field2928];
         this.field2931 = new short[this.field2928];
         this.field2932 = new short[this.field2928];
         if (var30 > 0) {
            this.field2933 = new int[var30];
            this.field2917 = new int[var30];
            this.field2935 = new int[var30];
            this.field2939 = new byte[var30];
            this.field2915 = new byte[var30];
            this.field2936 = new int[var30];
         }

         if (var31 > 0) {
            this.field2942 = new int[var31];
            this.field2938 = new int[var31];
         }
      }

      var2.field935 = var34;
      var3.field935 = var52;
      var4.field935 = var54;
      var5.field935 = var56;
      var6.field935 = var42;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;

      for(int var76 = 0; var76 < this.field2908; ++var76) {
         int var77 = var2.method1688();
         int var78 = 0;
         if ((var77 & 1) != 0) {
            var78 = var3.method1603();
         }

         int var79 = 0;
         if ((var77 & 2) != 0) {
            var79 = var4.method1603();
         }

         int var80 = 0;
         if ((var77 & 4) != 0) {
            var80 = var5.method1603();
         }

         this.field2910[var76] = var73 + var78;
         this.field2911[var76] = var74 + var79;
         this.field2940[var76] = var75 + var80;
         var73 = this.field2910[var76];
         var74 = this.field2911[var76];
         var75 = this.field2940[var76];
         if (var21 == 1) {
            if (var14) {
               this.field2913[var76] = var6.method1566();
            } else {
               this.field2913[var76] = var6.method1688();
               if (this.field2913[var76] == 255) {
                  this.field2913[var76] = -1;
               }
            }
         }
      }

      var2.field935 = var50;
      var3.field935 = var37;
      var4.field935 = var40;
      var5.field935 = var45;
      var6.field935 = var39;
      var7.field935 = var48;
      var8.field935 = var47;

      for(int var81 = 0; var81 < this.field2914; ++var81) {
         this.field2927[var81] = (short)var2.method1587();
         if (var10) {
            this.field2919[var81] = var3.method1623();
         }

         if (var17 == 255) {
            this.field2943[var81] = var4.method1623();
         }

         if (var18 == 1) {
            this.field2921[var81] = var5.method1623();
         }

         if (var19 == 1) {
            if (var15) {
               this.field2925[var81] = var6.method1566();
            } else {
               this.field2925[var81] = var6.method1688();
               if (this.field2925[var81] == 255) {
                  this.field2925[var81] = -1;
               }
            }
         }

         if (var20 == 1) {
            this.field2924[var81] = (short)(var7.method1587() - 1);
         }

         if (this.field2922 != null) {
            if (this.field2924[var81] != -1) {
               this.field2922[var81] = (byte)(var8.method1688() - 1);
            } else {
               this.field2922[var81] = -1;
            }
         }
      }

      this.field2909 = -1;
      var2.field935 = var44;
      var3.field935 = var36;
      this.method5414(var2, var3);
      var2.field935 = var58;
      var3.field935 = var60;
      var4.field935 = var62;
      var5.field935 = var65;
      var6.field935 = var67;
      var7.field935 = var69;
      this.method5415(var2, var3, var4, var5, var6, var7);
      var2.field935 = var71;
      if (var11) {
         int var82 = var2.method1688();
         if (var82 > 0) {
            this.field2941 = new class408[var82];

            for(int var83 = 0; var83 < var82; ++var83) {
               int var84 = var2.method1587();
               int var85 = var2.method1587();
               byte var86;
               if (var17 == 255) {
                  var86 = this.field2943[var85];
               } else {
                  var86 = (byte)var17;
               }

               this.field2941[var83] = new class408(var84, this.field2916[var85], this.field2912[var85], this.field2918[var85], var86);
            }
         }

         int var87 = var2.method1688();
         if (var87 > 0) {
            this.field2929 = new class370[var87];

            for(int var88 = 0; var88 < var87; ++var88) {
               int var89 = var2.method1587();
               int var90 = var2.method1587();
               this.field2929[var88] = new class370(var89, var90);
            }
         }
      }

      if (var12) {
         int var91 = var2.method1688();
         if (var91 > 0) {
            this.field2937 = new class395[var91];

            for(int var92 = 0; var92 < var91; ++var92) {
               int var93 = var2.method1587();
               int var94 = var2.method1587();
               int var95;
               if (var16) {
                  var95 = var2.method1566();
               } else {
                  var95 = var2.method1688();
                  if (var95 == 255) {
                     var95 = -1;
                  }
               }

               byte var96 = var2.method1623();
               this.field2937[var92] = new class395(var93, var94, var95, var96);
            }
         }
      }

   }

   @deob.ObfuscatedName("dk.b(Laen;Laen;)V")
   private void method5414(class124 arg0, class124 arg1) {
      short var3 = 0;
      short var4 = 0;
      short var5 = 0;
      short var6 = 0;

      for(int var7 = 0; var7 < this.field2914; ++var7) {
         int var8 = arg1.method1688();
         if (var8 == 1) {
            var3 = (short)(arg0.method1603() + var6);
            var4 = (short)(arg0.method1603() + var3);
            var5 = (short)(arg0.method1603() + var4);
            var6 = var5;
            this.field2916[var7] = var3;
            this.field2912[var7] = var4;
            this.field2918[var7] = var5;
            if (var3 > this.field2909) {
               this.field2909 = var3;
            }

            if (var4 > this.field2909) {
               this.field2909 = var4;
            }

            if (var5 > this.field2909) {
               this.field2909 = var5;
            }
         }

         if (var8 == 2) {
            var4 = var5;
            var5 = (short)(arg0.method1603() + var6);
            var6 = var5;
            this.field2916[var7] = var3;
            this.field2912[var7] = var4;
            this.field2918[var7] = var5;
            if (var5 > this.field2909) {
               this.field2909 = var5;
            }
         }

         if (var8 == 3) {
            var3 = var5;
            var5 = (short)(arg0.method1603() + var6);
            var6 = var5;
            this.field2916[var7] = var3;
            this.field2912[var7] = var4;
            this.field2918[var7] = var5;
            if (var5 > this.field2909) {
               this.field2909 = var5;
            }
         }

         if (var8 == 4) {
            short var11 = var3;
            var3 = var4;
            var4 = var11;
            var5 = (short)(arg0.method1603() + var6);
            var6 = var5;
            this.field2916[var7] = var3;
            this.field2912[var7] = var11;
            this.field2918[var7] = var5;
            if (var5 > this.field2909) {
               this.field2909 = var5;
            }
         }
      }

      ++this.field2909;
   }

   @deob.ObfuscatedName("dk.r(Laen;Laen;Laen;Laen;Laen;Laen;)V")
   private void method5415(class124 arg0, class124 arg1, class124 arg2, class124 arg3, class124 arg4, class124 arg5) {
      for(int var7 = 0; var7 < this.field2928; ++var7) {
         int var8 = this.field2920[var7] & 255;
         if (var8 == 0) {
            this.field2930[var7] = (short)arg0.method1587();
            this.field2931[var7] = (short)arg0.method1587();
            this.field2932[var7] = (short)arg0.method1587();
         }

         if (var8 == 1) {
            this.field2930[var7] = (short)arg1.method1587();
            this.field2931[var7] = (short)arg1.method1587();
            this.field2932[var7] = (short)arg1.method1587();
            if (this.field2934 < 15) {
               this.field2933[var7] = arg2.method1587();
               if (this.field2934 < 14) {
                  this.field2917[var7] = arg2.method1587();
               } else {
                  this.field2917[var7] = arg2.method1589();
               }

               this.field2935[var7] = arg2.method1587();
            } else {
               this.field2933[var7] = arg2.method1589();
               this.field2917[var7] = arg2.method1589();
               this.field2935[var7] = arg2.method1589();
            }

            this.field2939[var7] = arg3.method1623();
            this.field2915[var7] = arg4.method1623();
            this.field2936[var7] = arg5.method1623();
         }

         if (var8 == 2) {
            this.field2930[var7] = (short)arg1.method1587();
            this.field2931[var7] = (short)arg1.method1587();
            this.field2932[var7] = (short)arg1.method1587();
            if (this.field2934 < 15) {
               this.field2933[var7] = arg2.method1587();
               if (this.field2934 < 14) {
                  this.field2917[var7] = arg2.method1587();
               } else {
                  this.field2917[var7] = arg2.method1589();
               }

               this.field2935[var7] = arg2.method1587();
            } else {
               this.field2933[var7] = arg2.method1589();
               this.field2917[var7] = arg2.method1589();
               this.field2935[var7] = arg2.method1589();
            }

            this.field2939[var7] = arg3.method1623();
            this.field2915[var7] = arg4.method1623();
            this.field2936[var7] = arg5.method1623();
            this.field2942[var7] = arg5.method1623();
            this.field2938[var7] = arg5.method1623();
         }

         if (var8 == 3) {
            this.field2930[var7] = (short)arg1.method1587();
            this.field2931[var7] = (short)arg1.method1587();
            this.field2932[var7] = (short)arg1.method1587();
            if (this.field2934 < 15) {
               this.field2933[var7] = arg2.method1587();
               if (this.field2934 < 14) {
                  this.field2917[var7] = arg2.method1587();
               } else {
                  this.field2917[var7] = arg2.method1589();
               }

               this.field2935[var7] = arg2.method1587();
            } else {
               this.field2933[var7] = arg2.method1589();
               this.field2917[var7] = arg2.method1589();
               this.field2935[var7] = arg2.method1589();
            }

            this.field2939[var7] = arg3.method1623();
            this.field2915[var7] = arg4.method1623();
            this.field2936[var7] = arg5.method1623();
         }
      }

   }

   @deob.ObfuscatedName("dk.p([B)V")
   private void method5416(byte[] arg0) {
      boolean var2 = false;
      boolean var3 = false;
      class124 var4 = new class124(arg0);
      class124 var5 = new class124(arg0);
      class124 var6 = new class124(arg0);
      class124 var7 = new class124(arg0);
      class124 var8 = new class124(arg0);
      var4.field935 = arg0.length - 18;
      this.field2908 = var4.method1587();
      this.field2914 = var4.method1587();
      this.field2928 = var4.method1688();
      int var9 = var4.method1688();
      int var10 = var4.method1688();
      int var11 = var4.method1688();
      int var12 = var4.method1688();
      int var13 = var4.method1688();
      int var14 = var4.method1587();
      int var15 = var4.method1587();
      int var16 = var4.method1587();
      int var17 = var4.method1587();
      byte var18 = 0;
      int var20 = this.field2908 + var18;
      int var22 = this.field2914 + var20;
      int var23 = var22;
      if (var10 == 255) {
         var22 += this.field2914;
      }

      int var24 = var22;
      if (var12 == 1) {
         var22 += this.field2914;
      }

      int var25 = var22;
      if (var9 == 1) {
         var22 += this.field2914;
      }

      int var26 = var22;
      if (var13 == 1) {
         var22 += this.field2908;
      }

      int var27 = var22;
      if (var11 == 1) {
         var22 += this.field2914;
      }

      int var29 = var17 + var22;
      int var31 = this.field2914 * 2 + var29;
      int var33 = this.field2928 * 6 + var31;
      int var35 = var14 + var33;
      int var37 = var15 + var35;
      int var10000 = var16 + var37;
      this.field2910 = new int[this.field2908];
      this.field2911 = new int[this.field2908];
      this.field2940 = new int[this.field2908];
      this.field2916 = new short[this.field2914];
      this.field2912 = new short[this.field2914];
      this.field2918 = new short[this.field2914];
      if (this.field2928 > 0) {
         this.field2920 = new byte[this.field2928];
         this.field2930 = new short[this.field2928];
         this.field2931 = new short[this.field2928];
         this.field2932 = new short[this.field2928];
      }

      if (var13 == 1) {
         this.field2913 = new int[this.field2908];
      }

      if (var9 == 1) {
         this.field2919 = new byte[this.field2914];
         this.field2922 = new byte[this.field2914];
         this.field2924 = new short[this.field2914];
      }

      if (var10 == 255) {
         this.field2943 = new byte[this.field2914];
      } else {
         this.field2923 = (byte)var10;
      }

      if (var11 == 1) {
         this.field2921 = new byte[this.field2914];
      }

      if (var12 == 1) {
         this.field2925 = new int[this.field2914];
      }

      this.field2927 = new short[this.field2914];
      var4.field935 = var18;
      var5.field935 = var33;
      var6.field935 = var35;
      var7.field935 = var37;
      var8.field935 = var26;
      int var40 = 0;
      int var41 = 0;
      int var42 = 0;

      for(int var43 = 0; var43 < this.field2908; ++var43) {
         int var44 = var4.method1688();
         int var45 = 0;
         if ((var44 & 1) != 0) {
            var45 = var5.method1603();
         }

         int var46 = 0;
         if ((var44 & 2) != 0) {
            var46 = var6.method1603();
         }

         int var47 = 0;
         if ((var44 & 4) != 0) {
            var47 = var7.method1603();
         }

         this.field2910[var43] = var40 + var45;
         this.field2911[var43] = var41 + var46;
         this.field2940[var43] = var42 + var47;
         var40 = this.field2910[var43];
         var41 = this.field2911[var43];
         var42 = this.field2940[var43];
         if (var13 == 1) {
            this.field2913[var43] = var8.method1688();
         }
      }

      var4.field935 = var29;
      var5.field935 = var25;
      var6.field935 = var23;
      var7.field935 = var27;
      var8.field935 = var24;

      for(int var48 = 0; var48 < this.field2914; ++var48) {
         this.field2927[var48] = (short)var4.method1587();
         if (var9 == 1) {
            int var49 = var5.method1688();
            if ((var49 & 1) == 1) {
               this.field2919[var48] = 1;
               var2 = true;
            } else {
               this.field2919[var48] = 0;
            }

            if ((var49 & 2) == 2) {
               this.field2922[var48] = (byte)(var49 >> 2);
               this.field2924[var48] = this.field2927[var48];
               this.field2927[var48] = 127;
               if (this.field2924[var48] != -1) {
                  var3 = true;
               }
            } else {
               this.field2922[var48] = -1;
               this.field2924[var48] = -1;
            }
         }

         if (var10 == 255) {
            this.field2943[var48] = var6.method1623();
         }

         if (var11 == 1) {
            this.field2921[var48] = var7.method1623();
         }

         if (var12 == 1) {
            this.field2925[var48] = var8.method1688();
         }
      }

      this.field2909 = -1;
      var4.field935 = var22;
      var5.field935 = var20;
      short var50 = 0;
      short var51 = 0;
      short var52 = 0;
      short var53 = 0;

      for(int var54 = 0; var54 < this.field2914; ++var54) {
         int var55 = var5.method1688();
         if (var55 == 1) {
            var50 = (short)(var4.method1603() + var53);
            var51 = (short)(var4.method1603() + var50);
            var52 = (short)(var4.method1603() + var51);
            var53 = var52;
            this.field2916[var54] = var50;
            this.field2912[var54] = var51;
            this.field2918[var54] = var52;
            if (var50 > this.field2909) {
               this.field2909 = var50;
            }

            if (var51 > this.field2909) {
               this.field2909 = var51;
            }

            if (var52 > this.field2909) {
               this.field2909 = var52;
            }
         }

         if (var55 == 2) {
            var51 = var52;
            var52 = (short)(var4.method1603() + var53);
            var53 = var52;
            this.field2916[var54] = var50;
            this.field2912[var54] = var51;
            this.field2918[var54] = var52;
            if (var52 > this.field2909) {
               this.field2909 = var52;
            }
         }

         if (var55 == 3) {
            var50 = var52;
            var52 = (short)(var4.method1603() + var53);
            var53 = var52;
            this.field2916[var54] = var50;
            this.field2912[var54] = var51;
            this.field2918[var54] = var52;
            if (var52 > this.field2909) {
               this.field2909 = var52;
            }
         }

         if (var55 == 4) {
            short var58 = var50;
            var50 = var51;
            var51 = var58;
            var52 = (short)(var4.method1603() + var53);
            var53 = var52;
            this.field2916[var54] = var50;
            this.field2912[var54] = var58;
            this.field2918[var54] = var52;
            if (var52 > this.field2909) {
               this.field2909 = var52;
            }
         }
      }

      ++this.field2909;
      var4.field935 = var31;

      for(int var59 = 0; var59 < this.field2928; ++var59) {
         this.field2920[var59] = 0;
         this.field2930[var59] = (short)var4.method1587();
         this.field2931[var59] = (short)var4.method1587();
         this.field2932[var59] = (short)var4.method1587();
      }

      if (this.field2922 != null) {
         boolean var60 = false;

         for(int var61 = 0; var61 < this.field2914; ++var61) {
            int var62 = this.field2922[var61] & 255;
            if (var62 != 255) {
               if ((this.field2930[var62] & 65535) == this.field2916[var61] && (this.field2931[var62] & 65535) == this.field2912[var61] && (this.field2932[var62] & 65535) == this.field2918[var61]) {
                  this.field2922[var61] = -1;
               } else {
                  var60 = true;
               }
            }
         }

         if (!var60) {
            this.field2922 = null;
         }
      }

      if (!var3) {
         this.field2924 = null;
      }

      if (!var2) {
         this.field2919 = null;
      }

   }

   @deob.ObfuscatedName("dk.o(III)I")
   public int method5417(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field2908; ++var4) {
         if (this.field2910[var4] == arg0 && this.field2911[var4] == arg1 && this.field2940[var4] == arg2) {
            return var4;
         }
      }

      this.field2910[this.field2908] = arg0;
      this.field2911[this.field2908] = arg1;
      this.field2940[this.field2908] = arg2;
      this.field2909 = this.field2908 + 1;
      return this.field2908++;
   }

   @deob.ObfuscatedName("dk.a(IIIBBSBS)I")
   public int method5436(int arg0, int arg1, int arg2, byte arg3, byte arg4, short arg5, byte arg6, short arg7) {
      this.field2916[this.field2914] = (short)arg0;
      this.field2912[this.field2914] = (short)arg1;
      this.field2918[this.field2914] = (short)arg2;
      this.field2919[this.field2914] = arg3;
      this.field2922[this.field2914] = arg4;
      this.field2927[this.field2914] = arg5;
      this.field2921[this.field2914] = arg6;
      this.field2924[this.field2914] = arg7;
      return this.field2914++;
   }

   @deob.ObfuscatedName("dk.x(SSSSSSBBB)B")
   public byte method5456(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, byte arg6, byte arg7, byte arg8) {
      if (this.field2928 >= 255) {
         throw new IllegalStateException();
      } else {
         this.field2920[this.field2928] = 3;
         this.field2930[this.field2928] = arg0;
         this.field2931[this.field2928] = arg1;
         this.field2932[this.field2928] = arg2;
         this.field2933[this.field2928] = arg3;
         this.field2917[this.field2928] = arg4;
         this.field2935[this.field2928] = arg5;
         this.field2939[this.field2928] = arg6;
         this.field2915[this.field2928] = arg7;
         this.field2936[this.field2928] = arg8;
         return (byte)(this.field2928++);
      }
   }

   @deob.ObfuscatedName("dk.s(Z)[[I")
   public int[][] method5420(boolean arg0) {
      int[] var2 = new int[256];
      int var3 = 0;
      int var4 = arg0 ? this.field2908 : this.field2909;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = this.field2913[var5];
         if (var6 >= 0) {
            int var10002 = var2[var6]++;
            if (var6 > var3) {
               var3 = var6;
            }
         }
      }

      int[][] var7 = new int[var3 + 1][];

      for(int var8 = 0; var8 <= var3; ++var8) {
         var7[var8] = new int[var2[var8]];
         var2[var8] = 0;
      }

      for(int var9 = 0; var9 < var4; ++var9) {
         int var10 = this.field2913[var9];
         if (var10 >= 0) {
            var7[var10][var2[var10]++] = var9;
         }
      }

      return var7;
   }

   @deob.ObfuscatedName("dk.l()[[I")
   public int[][] method5421() {
      int[] var1 = new int[256];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field2914; ++var3) {
         int var4 = this.field2925[var3];
         if (var4 >= 0) {
            int var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var5 = new int[var2 + 1][];

      for(int var6 = 0; var6 <= var2; ++var6) {
         var5[var6] = new int[var1[var6]];
         var1[var6] = 0;
      }

      for(int var7 = 0; var7 < this.field2914; ++var7) {
         int var8 = this.field2925[var7];
         if (var8 >= 0) {
            var5[var8][var1[var8]++] = var7;
         }
      }

      return var5;
   }

   @deob.ObfuscatedName("dk.u()[[I")
   public int[][] method5422() {
      int[] var1 = new int[256];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field2937.length; ++var3) {
         int var4 = this.field2937[var3].field2904;
         if (var4 >= 0) {
            int var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var5 = new int[var2 + 1][];

      for(int var6 = 0; var6 <= var2; ++var6) {
         var5[var6] = new int[var1[var6]];
         var1[var6] = 0;
      }

      for(int var7 = 0; var7 < this.field2937.length; ++var7) {
         int var8 = this.field2937[var7].field2904;
         if (var8 >= 0) {
            var5[var8][var1[var8]++] = var7;
         }
      }

      return var5;
   }

   @deob.ObfuscatedName("dk.v(SS)V")
   public void method5449(short arg0, short arg1) {
      for(int var3 = 0; var3 < this.field2914; ++var3) {
         if (this.field2927[var3] == arg0) {
            this.field2927[var3] = arg1;
         }
      }

   }

   @deob.ObfuscatedName("dk.g(SS)V")
   public void method5410(short arg0, short arg1) {
      if (this.field2924 != null) {
         for(int var3 = 0; var3 < this.field2914; ++var3) {
            if (this.field2924[var3] == arg0) {
               this.field2924[var3] = arg1;
            }
         }

      }
   }

   @deob.ObfuscatedName("dk.h(III)V")
   public void method5425(int arg0, int arg1, int arg2) {
      for(int var4 = 0; var4 < this.field2908; ++var4) {
         this.field2910[var4] += arg0;
         this.field2911[var4] += arg1;
         this.field2940[var4] += arg2;
      }

   }

   @deob.ObfuscatedName("dk.e(III)V")
   public void method5426(int arg0, int arg1, int arg2) {
      if (arg2 != 0) {
         int var4 = class603.field5469[arg2];
         int var5 = class603.field5471[arg2];

         for(int var6 = 0; var6 < this.field2908; ++var6) {
            int var7 = this.field2911[var6] * var4 + this.field2910[var6] * var5 >> 14;
            this.field2911[var6] = this.field2911[var6] * var5 - this.field2910[var6] * var4 >> 14;
            this.field2910[var6] = var7;
         }
      }

      if (arg0 != 0) {
         int var8 = class603.field5469[arg0];
         int var9 = class603.field5471[arg0];

         for(int var10 = 0; var10 < this.field2908; ++var10) {
            int var11 = this.field2911[var10] * var9 - this.field2940[var10] * var8 >> 14;
            this.field2940[var10] = this.field2940[var10] * var9 + this.field2911[var10] * var8 >> 14;
            this.field2911[var10] = var11;
         }
      }

      if (arg1 != 0) {
         int var12 = class603.field5469[arg1];
         int var13 = class603.field5471[arg1];

         for(int var14 = 0; var14 < this.field2908; ++var14) {
            int var15 = this.field2940[var14] * var12 + this.field2910[var14] * var13 >> 14;
            this.field2940[var14] = this.field2940[var14] * var13 - this.field2910[var14] * var12 >> 14;
            this.field2910[var14] = var15;
         }
      }

   }

   @deob.ObfuscatedName("dk.z(I)V")
   public void method5427(int arg0) {
      for(int var2 = 0; var2 < this.field2908; ++var2) {
         this.field2910[var2] <<= arg0;
         this.field2911[var2] <<= arg0;
         this.field2940[var2] <<= arg0;
      }

      if (this.field2928 > 0 && this.field2933 != null) {
         for(int var3 = 0; var3 < this.field2933.length; ++var3) {
            this.field2933[var3] <<= arg0;
            this.field2917[var3] <<= arg0;
            if (this.field2920[var3] != 1) {
               this.field2935[var3] <<= arg0;
            }
         }
      }

   }
}
