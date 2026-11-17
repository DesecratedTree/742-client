@deob.ObfuscatedName("wm")
public class class919 {
   @deob.ObfuscatedName("wm.p")
   private final class737 field9373 = new class737(64);
   @deob.ObfuscatedName("wm.o")
   public final class737 field9375 = new class737(50);
   @deob.ObfuscatedName("wm.a")
   public final class737 field9368 = new class737(5);
   @deob.ObfuscatedName("wm.n")
   public final class801 field9372;
   @deob.ObfuscatedName("wm.k")
   private final class823 field9369;
   @deob.ObfuscatedName("wm.d")
   public boolean field9370;
   @deob.ObfuscatedName("wm.b")
   private final class612 field9371;
   @deob.ObfuscatedName("wm.r")
   public final class612 field9376;
   @deob.ObfuscatedName("wm.s")
   private final String[] field9377;
   @deob.ObfuscatedName("wm.x")
   public int field9374;

   public class919(class801 arg0, class823 arg1, boolean arg2, class612 arg3, class612 arg4) {
      this.field9372 = arg0;
      this.field9369 = arg1;
      this.field9370 = arg2;
      this.field9371 = arg3;
      this.field9376 = arg4;
      if (this.field9371 != null) {
         int var6 = this.field9371.method8782() - 1;
         class424.field3347.method5801();
         this.field9371.method8792(var6);
      }

      if (class801.field7297 == this.field9372) {
         this.field9377 = new String[]{null, null, null, null, null, class881.field9009.method15374(this.field9369)};
      } else {
         this.field9377 = new String[]{null, null, null, null, null, null};
      }

   }

   @deob.ObfuscatedName("wm.n(IB)Lwi;")
   public class915 method15857(int arg0) {
      class737 var2 = this.field9373;
      class915 var3;
      synchronized(this.field9373) {
         var3 = (class915)this.field9373.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9371;
         byte[] var6;
         synchronized(this.field9371) {
            var6 = this.field9371.method8771(class424.field3347.method5800(arg0), class424.field3347.method5803(arg0));
         }

         class915 var8 = new class915();
         var8.field9281 = arg0;
         var8.field9280 = this;
         var8.field9299 = (String[])((String[])this.field9377.clone());
         if (var6 != null) {
            var8.method15770(new class124(var6));
         }

         var8.method15785();
         class737 var9 = this.field9373;
         synchronized(this.field9373) {
            this.field9373.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("wm.k(ZI)V")
   public void method15845(boolean arg0) {
      if (this.field9370 != arg0) {
         this.field9370 = arg0;
         this.method15847();
      }
   }

   @deob.ObfuscatedName("wm.d(II)V")
   public void method15846(int arg0) {
      this.field9374 = arg0;
      class737 var2 = this.field9375;
      synchronized(this.field9375) {
         this.field9375.method10883();
      }

      class737 var4 = this.field9368;
      synchronized(this.field9368) {
         this.field9368.method10883();
      }
   }

   @deob.ObfuscatedName("wm.b(B)V")
   public void method15847() {
      class737 var1 = this.field9373;
      synchronized(this.field9373) {
         this.field9373.method10883();
      }

      class737 var3 = this.field9375;
      synchronized(this.field9375) {
         this.field9375.method10883();
      }

      class737 var5 = this.field9368;
      synchronized(this.field9368) {
         this.field9368.method10883();
      }
   }

   @deob.ObfuscatedName("wm.r(I)V")
   public void method15848() {
      class737 var1 = this.field9375;
      synchronized(this.field9375) {
         this.field9375.method10883();
      }

      class737 var3 = this.field9368;
      synchronized(this.field9368) {
         this.field9368.method10883();
      }
   }

   @deob.ObfuscatedName("wm.p(II)V")
   public void method15843(int arg0) {
      class737 var2 = this.field9373;
      synchronized(this.field9373) {
         this.field9373.method10882(arg0);
      }

      class737 var4 = this.field9375;
      synchronized(this.field9375) {
         this.field9375.method10882(arg0);
      }

      class737 var6 = this.field9368;
      synchronized(this.field9368) {
         this.field9368.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("wm.o(I)V")
   public void method15860() {
      class737 var1 = this.field9373;
      synchronized(this.field9373) {
         this.field9373.method10887();
      }

      class737 var3 = this.field9375;
      synchronized(this.field9375) {
         this.field9375.method10887();
      }

      class737 var5 = this.field9368;
      synchronized(this.field9368) {
         this.field9368.method10887();
      }
   }
}
