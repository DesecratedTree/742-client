@deob.ObfuscatedName("agx")
public class class188 extends class973 {
   @deob.ObfuscatedName("agx.r")
   private int field1214 = 0;
   @deob.ObfuscatedName("agx.p")
   private int field1215 = 0;
   @deob.ObfuscatedName("agx.k")
   private class984 field1212;
   @deob.ObfuscatedName("agx.b")
   private class317 field1216;
   @deob.ObfuscatedName("agx.d")
   private class349 field1213;

   public class188(class984 arg0) {
      this.field1212 = arg0;
   }

   @deob.ObfuscatedName("agx.k()I")
   public int method566() {
      return this.field1214;
   }

   @deob.ObfuscatedName("agx.d()I")
   public int method559() {
      return this.field1215;
   }

   @deob.ObfuscatedName("agx.z(ILdm;)V")
   public void method2351(int arg0, class398 arg1) {
      if (arg0 != 0) {
         throw new RuntimeException();
      } else {
         class317 var3 = (class317)arg1;
         if (this.field1213 != null && var3 != null && (this.field1213.field2208 != var3.field1973 || this.field1213.field2207 != var3.field1974)) {
            throw new RuntimeException();
         } else {
            this.field1216 = var3;
            if (var3 != null) {
               this.field1214 = var3.field1973;
               this.field1215 = var3.field1974;
            } else if (this.field1213 == null) {
               this.field1214 = 0;
               this.field1215 = 0;
            }

            if (this == this.field1212.method11517()) {
               this.method540();
            }

         }
      }
   }

   @deob.ObfuscatedName("agx.n(Ldh;)V")
   public void method2352(class393 arg0) {
      class349 var2 = (class349)arg0;
      if (this.field1216 != null && var2 != null && (this.field1216.field1973 != var2.field2208 || this.field1216.field1974 != var2.field2207)) {
         throw new RuntimeException();
      } else {
         this.field1213 = var2;
         if (var2 != null) {
            this.field1214 = var2.field2208;
            this.field1215 = var2.field2207;
         } else if (this.field1216 == null) {
            this.field1214 = 0;
            this.field1215 = 0;
         }

         if (this == this.field1212.method11517()) {
            this.method540();
         }

      }
   }

   @deob.ObfuscatedName("agx.c()Z")
   public boolean method2354() {
      return true;
   }

   @deob.ObfuscatedName("agx.r()Z")
   public boolean method540() {
      this.field1212.method16841(this.field1214, this.field1215, this.field1216 == null ? null : this.field1216.field1975, this.field1213 == null ? null : this.field1213.field2206);
      return true;
   }

   @deob.ObfuscatedName("agx.p()Z")
   public boolean method541() {
      return true;
   }

   @deob.ObfuscatedName("agx.w(IIIIIIZZ)V")
   public void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      int[] var9 = null;
      int[] var10 = null;
      float[] var11 = null;
      float[] var12 = null;
      if (arg6 && this.field1216 != null) {
         var9 = this.field1216.field1975;
         var10 = this.field1212.field10406;
      }

      if (arg7 && this.field1213 != null) {
         var11 = this.field1213.field2206;
         var12 = this.field1212.field10414;
      }

      method9129(this.field1214, this.field1212.field10407, var9, var10, var11, var12, arg0, arg1, arg4, arg5, arg2, arg3);
   }

   @deob.ObfuscatedName("lv.ah(II[I[I[F[FIIIIIII)V")
   private static void method9129(int arg0, int arg1, int[] arg2, int[] arg3, float[] arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      int var12 = arg0 * arg7 + arg6;
      int var13 = arg1 * arg9 + arg8;
      int var14 = arg0 - arg10;
      int var15 = arg1 - arg10;
      if (arg2 == null) {
         for(int var16 = 0; var16 < arg11; ++var16) {
            int var17 = arg10 + var12;

            while(var12 < var17) {
               arg5[var13++] = arg4[var12++];
            }

            var12 += var14;
            var13 += var15;
         }
      } else if (arg4 == null) {
         for(int var18 = 0; var18 < arg11; ++var18) {
            int var19 = arg10 + var12;

            while(var12 < var19) {
               arg3[var13++] = arg2[var12++];
            }

            var12 += var14;
            var13 += var15;
         }
      } else {
         for(int var20 = 0; var20 < arg11; ++var20) {
            int var21 = arg10 + var12;

            while(var12 < var21) {
               arg3[var13] = arg2[var12];
               arg5[var13++] = arg4[var12++];
            }

            var12 += var14;
            var13 += var15;
         }
      }

   }

   @deob.ObfuscatedName("agx.b()V")
   public void method570() {
   }
}
