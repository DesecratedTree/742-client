@deob.ObfuscatedName("ms")
public class class655 {
   @deob.ObfuscatedName("ms.d")
   private class875 field5961 = new class875(256);
   @deob.ObfuscatedName("ms.b")
   private class875 field5959 = new class875(256);
   @deob.ObfuscatedName("ms.r")
   private class875 field5963 = new class875(256);
   @deob.ObfuscatedName("ms.n")
   private class612 field5962;
   @deob.ObfuscatedName("ms.k")
   private class612 field5960;

   public class655(class612 arg0, class612 arg1) {
      this.field5962 = arg0;
      this.field5960 = arg1;
   }

   @deob.ObfuscatedName("ms.n(II[II)Lald;")
   private class302 method9444(int arg0, int arg1, int[] arg2) {
      int var4 = arg1 ^ (arg0 << 4 & 65535 | arg0 >>> 12);
      int var5 = var4 | arg0 << 16;
      long var6 = (long)var5;
      class302 var8 = (class302)this.field5963.method15322(var6);
      if (var8 != null) {
         return var8;
      } else if (arg2 != null && arg2[0] <= 0) {
         return null;
      } else {
         class660 var9 = class660.method9661(this.field5962, arg0, arg1);
         if (var9 == null) {
            return null;
         } else {
            class302 var10 = var9.method9662();
            this.field5963.method15311(var10, var6);
            if (arg2 != null) {
               arg2[0] -= var10.field1910.length;
            }

            return var10;
         }
      }
   }

   @deob.ObfuscatedName("ms.k(II[IB)Lalw;")
   private class315 method9445(int arg0, int arg1, int[] arg2) {
      int var4 = arg1 ^ (arg0 << 4 & 65535 | arg0 >>> 12);
      int var5 = var4 | arg0 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      class315 var8 = (class315)this.field5959.method15322(var6);
      if (var8 != null) {
         return var8;
      } else if (arg2 != null && arg2[0] <= 0) {
         return null;
      } else {
         class86 var9 = (class86)this.field5961.method15322(var6);
         if (var9 == null) {
            var9 = class86.method1170(this.field5960, arg0, arg1);
            if (var9 == null) {
               return null;
            }

            this.field5961.method15311(var9, var6);
         }

         class315 var10 = var9.method1200();
         if (var10 == null) {
            return null;
         } else {
            var9.method9864();
            this.field5959.method15311(var10, var6);
            return var10;
         }
      }
   }

   @deob.ObfuscatedName("ms.d(I[II)Lald;")
   public class302 method9446(int arg0, int[] arg1) {
      if (this.field5962.method8782() == 1) {
         return this.method9444(0, arg0, arg1);
      } else if (this.field5962.method8792(arg0) == 1) {
         return this.method9444(arg0, 0, arg1);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("ms.b(I[II)Lalw;")
   public class315 method9456(int arg0, int[] arg1) {
      if (this.field5960.method8782() == 1) {
         return this.method9445(0, arg0, arg1);
      } else if (this.field5960.method8792(arg0) == 1) {
         return this.method9445(arg0, 0, arg1);
      } else {
         throw new RuntimeException();
      }
   }
}
