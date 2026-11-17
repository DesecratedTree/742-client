import jaggl.OpenGL;

@deob.ObfuscatedName("ca")
public class class359 {
   @deob.ObfuscatedName("ca.r")
   private int field2289 = 0;
   @deob.ObfuscatedName("ca.p")
   private int field2291 = 0;
   @deob.ObfuscatedName("ca.o")
   private int field2292 = 1;
   @deob.ObfuscatedName("ca.a")
   private int field2293 = 1;
   @deob.ObfuscatedName("ca.s")
   private class849 field2295 = new class849();
   @deob.ObfuscatedName("ca.l")
   private boolean field2300 = true;
   @deob.ObfuscatedName("ca.u")
   private boolean field2296 = true;
   @deob.ObfuscatedName("ca.v")
   private boolean field2298 = true;
   @deob.ObfuscatedName("ca.g")
   private boolean field2299 = true;
   @deob.ObfuscatedName("ca.h")
   private class939[] field2286 = new class939[2];
   @deob.ObfuscatedName("ca.i")
   private boolean field2288 = false;
   @deob.ObfuscatedName("ca.t")
   private int field2304 = 0;
   @deob.ObfuscatedName("ca.c")
   private class405 field2306 = class405.field3052;
   @deob.ObfuscatedName("ca.n")
   private final class983 field2290;
   @deob.ObfuscatedName("ca.k")
   private class173 field2287;
   @deob.ObfuscatedName("ca.b")
   private class173 field2305;
   @deob.ObfuscatedName("ca.d")
   private class173 field2303;
   @deob.ObfuscatedName("ca.m")
   private class935 field2297;
   @deob.ObfuscatedName("ca.e")
   private class935 field2301;
   @deob.ObfuscatedName("ca.z")
   private class939 field2302;
   @deob.ObfuscatedName("ca.x")
   private boolean field2294;

   public class359(class983 arg0) {
      this.field2290 = arg0;
      if (this.field2290.field10331 && this.field2290.field10389) {
         this.field2305 = this.field2287 = new class173(this.field2290);
         if (this.field2290.field10252 > 1 && this.field2290.field10371 && this.field2290.field10266) {
            this.field2305 = this.field2303 = new class173(this.field2290);
         }
      }

   }

   @deob.ObfuscatedName("ca.n()V")
   public void method4429() {
      this.field2287 = null;
      this.field2303 = null;
      this.field2305 = null;
      this.field2297 = null;
      this.field2302 = null;
      this.field2286 = null;
      this.field2301 = null;
      if (!this.field2295.method15024()) {
         for(class674 var1 = this.field2295.method14964(); this.field2295.field8711 != var1; var1 = var1.field6136) {
            ((class59)var1).method925();
         }
      }

      this.field2293 = 1;
      this.field2292 = 1;
   }

   @deob.ObfuscatedName("ca.k()Z")
   public boolean method4420() {
      return this.field2305 != null;
   }

   @deob.ObfuscatedName("ca.d()Z")
   private boolean method4421() {
      if (this.field2296) {
         if (this.field2297 != null) {
            this.field2297.method302();
            this.field2297 = null;
         }

         if (this.field2302 != null) {
            this.field2302.method4279();
            this.field2302 = null;
         }
      }

      if (this.field2300) {
         if (this.field2301 != null) {
            this.field2301.method302();
            this.field2301 = null;
         }

         if (this.field2286[0] != null) {
            this.field2286[0].method4279();
            this.field2286[0] = null;
         }

         if (this.field2286[1] != null) {
            this.field2286[1].method4279();
            this.field2286[1] = null;
         }
      }

      if (this.field2296) {
         if (this.field2303 != null) {
            this.field2297 = new class935(this.field2290, class372.field2738, class405.field3058, this.field2292, this.field2293, this.field2290.field10252);
         }

         if (this.field2288) {
            this.field2302 = new class939(this.field2290, 34037, class372.field2738, class405.field3058, this.field2292, this.field2293);
         } else if (this.field2297 == null) {
            this.field2297 = new class935(this.field2290, class372.field2738, class405.field3058, this.field2292, this.field2293);
         }

         this.field2296 = false;
         this.field2298 = true;
         this.field2299 = true;
      }

      if (this.field2300) {
         if (this.field2303 != null) {
            this.field2301 = new class935(this.field2290, class372.field2736, this.field2306, this.field2292, this.field2293, this.field2290.field10252);
         }

         this.field2286[0] = new class939(this.field2290, 34037, class372.field2736, this.field2306, this.field2292, this.field2293);
         this.field2286[1] = this.field2304 > 1 ? new class939(this.field2290, 34037, class372.field2736, this.field2306, this.field2292, this.field2293) : null;
         this.field2300 = false;
         this.field2298 = true;
         this.field2299 = true;
      }

      if (this.field2298) {
         if (this.field2303 != null) {
            this.field2290.method11502(this.field2287);
            this.field2287.method2352((class393)null);
            this.field2287.method2351(0, (class398)null);
            this.field2287.method2351(1, (class398)null);
            this.field2287.method2351(0, this.field2286[0].method15995(0));
            this.field2287.method2351(1, this.field2304 > 1 ? this.field2286[1].method15995(0) : null);
            if (this.field2288) {
               this.field2287.method2352(this.field2302.method15997(0));
            }

            this.field2290.method11503(this.field2287);
            this.field2290.method11502(this.field2303);
            this.field2303.method2352((class393)null);
            this.field2303.method2351(0, (class398)null);
            this.field2303.method2351(0, this.field2301);
            this.field2303.method2352(this.field2297);
            this.field2290.method11503(this.field2303);
         } else {
            this.field2290.method11502(this.field2287);
            this.field2287.method2352((class393)null);
            this.field2287.method2351(0, (class398)null);
            this.field2287.method2351(1, (class398)null);
            this.field2287.method2351(0, this.field2286[0].method15995(0));
            this.field2287.method2351(1, this.field2304 > 1 ? this.field2286[1].method15995(0) : null);
            if (this.field2288) {
               this.field2287.method2352(this.field2302.method15997(0));
            } else {
               this.field2287.method2352(this.field2297);
            }

            this.field2290.method11503(this.field2287);
         }

         this.field2298 = false;
         this.field2299 = true;
      }

      if (this.field2299) {
         this.field2290.method11502(this.field2305);
         this.field2299 = !this.field2305.method2354();
         this.field2290.method11503(this.field2305);
      }

      return !this.field2299;
   }

   @deob.ObfuscatedName("ca.b(IIII)Z")
   public boolean method4422(int arg0, int arg1, int arg2, int arg3) {
      if (this.field2305 != null && !this.field2295.method15024()) {
         if (this.field2292 != arg2 || this.field2293 != arg3) {
            this.field2292 = arg2;
            this.field2293 = arg3;

            for(class674 var5 = this.field2295.method14964(); this.field2295.field8711 != var5; var5 = var5.field6136) {
               ((class59)var5).method926(this.field2292, this.field2293);
            }

            this.field2300 = true;
            this.field2296 = true;
            this.field2298 = true;
         }

         if (this.method4421()) {
            this.field2289 = arg0;
            this.field2291 = arg1;
            this.field2294 = true;
            this.field2290.method16608(-this.field2289, this.field2293 + this.field2291 - this.field2290.method11517().method559());
            this.field2290.method11502(this.field2305);
            this.field2290.method2522(3, 0);
            this.field2305.method2368(0);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("ca.r()V")
   public void method4428() {
      if (this.field2294) {
         if (this.field2303 != null) {
            this.field2290.method11503(this.field2303);
            this.field2290.method11502(this.field2287);
            this.field2287.method2368(0);
            this.field2303.method2356(0, 0, this.field2292, this.field2293, 0, 0, true, this.field2288);
         }

         this.field2290.method16634();
         this.field2290.method16652(0);
         this.field2290.method16640(1);
         this.field2290.method7508();
         int var1 = 0;
         int var2 = 1;

         class59 var4;
         for(class59 var3 = (class59)this.field2295.method14964(); var3 != null; var3 = var4) {
            var4 = (class59)this.field2295.method15006();
            int var5 = var3.method929();

            for(int var6 = 0; var6 < var5; ++var6) {
               var3.method927(var6, this.field2286[var1], this.field2302);
               if (var4 == null && var5 - 1 == var6) {
                  this.field2290.method11503(this.field2287);
                  this.field2290.method16608(0, 0);
                  OpenGL.glBegin(7);
                  OpenGL.glTexCoord2f(0.0F, (float)this.field2293);
                  OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                  OpenGL.glVertex2i(this.field2289, this.field2291);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                  OpenGL.glVertex2i(this.field2289, this.field2293 + this.field2291);
                  OpenGL.glTexCoord2f((float)this.field2292, 0.0F);
                  OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                  OpenGL.glVertex2i(this.field2292 + this.field2289, this.field2293 + this.field2291);
                  OpenGL.glTexCoord2f((float)this.field2292, (float)this.field2293);
                  OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                  OpenGL.glVertex2i(this.field2292 + this.field2289, this.field2291);
                  OpenGL.glEnd();
               } else {
                  this.field2287.method2368(var2);
                  OpenGL.glBegin(7);
                  OpenGL.glTexCoord2f(0.0F, (float)this.field2293);
                  OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                  OpenGL.glVertex2i(0, 0);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                  OpenGL.glVertex2i(0, this.field2293);
                  OpenGL.glTexCoord2f((float)this.field2292, 0.0F);
                  OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                  OpenGL.glVertex2i(this.field2292, this.field2293);
                  OpenGL.glTexCoord2f((float)this.field2292, (float)this.field2293);
                  OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                  OpenGL.glVertex2i(this.field2292, 0);
                  OpenGL.glEnd();
               }

               var3.method930(var6);
               var2 = var2 + 1 & 1;
               var1 = var1 + 1 & 1;
            }
         }

         this.field2294 = false;
      }
   }

   @deob.ObfuscatedName("ca.p(Lacc;)Z")
   public boolean method4424(class59 arg0) {
      if (this.field2305 != null) {
         if (arg0.method923() || arg0.method924()) {
            this.field2295.method14959(arg0);
            this.method4426();
            if (this.method4421()) {
               if (this.field2292 != -1 && this.field2293 != -1) {
                  arg0.method926(this.field2292, this.field2293);
               }

               arg0.field436 = true;
               return true;
            }
         }

         this.method4425(arg0);
      }

      return false;
   }

   @deob.ObfuscatedName("ca.o(Lacc;)V")
   public void method4425(class59 arg0) {
      arg0.field436 = false;
      arg0.method925();
      arg0.method9864();
      this.method4426();
   }

   @deob.ObfuscatedName("ca.a()V")
   private void method4426() {
      int var1 = 0;
      boolean var2 = false;
      class405 var3 = class405.field3052;

      for(class59 var4 = (class59)this.field2295.method14964(); var4 != null; var4 = (class59)this.field2295.method15006()) {
         class405 var5 = var4.method941();
         if (var5.field3055 > var3.field3055) {
            var3 = var5;
         }

         var2 |= var4.method922();
         var1 += var4.method929();
      }

      if (this.field2306 != var3) {
         this.field2306 = var3;
         this.field2300 = true;
      }

      int var6 = this.field2304 > 2 ? 2 : this.field2304;
      int var7 = var1 > 2 ? 2 : var1;
      if (var6 != var7) {
         this.field2300 = true;
         this.field2298 = true;
      }

      if (this.field2288 != var2) {
         this.field2288 = var2;
         this.field2296 = true;
      }

      this.field2304 = var1;
   }
}
