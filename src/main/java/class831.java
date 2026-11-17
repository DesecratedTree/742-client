@deob.ObfuscatedName("tf")
public class class831 {
   @deob.ObfuscatedName("tf.o")
   private class737 field8488 = new class737(256);
   @deob.ObfuscatedName("tf.a")
   public final class737 field8484 = new class737(500);
   @deob.ObfuscatedName("tf.x")
   public final class737 field8487 = new class737(30);
   @deob.ObfuscatedName("tf.s")
   public final class737 field8481 = new class737(50);
   @deob.ObfuscatedName("tf.v")
   public class396[] field8491 = new class396[4];
   @deob.ObfuscatedName("tf.g")
   public class862 field8492 = new class862((Object)null, (Object)null);
   @deob.ObfuscatedName("tf.n")
   private final class801 field8486;
   @deob.ObfuscatedName("tf.k")
   private final class823 field8480;
   @deob.ObfuscatedName("tf.d")
   public boolean field8482;
   @deob.ObfuscatedName("tf.b")
   private final class612 field8479;
   @deob.ObfuscatedName("tf.r")
   public final class612 field8483;
   @deob.ObfuscatedName("tf.u")
   private final String[] field8490;
   @deob.ObfuscatedName("tf.l")
   public int field8489;

   public class831(class801 arg0, class823 arg1, boolean arg2, class612 arg3, class612 arg4) {
      this.field8486 = arg0;
      this.field8480 = arg1;
      this.field8482 = arg2;
      this.field8479 = arg3;
      this.field8483 = arg4;
      if (this.field8479 != null) {
         int var6 = this.field8479.method8782() - 1;
         class424.field3358.method5801();
         this.field8479.method8792(var6);
      }

      if (class801.field7297 == this.field8486) {
         this.field8490 = new String[]{null, null, null, null, null, class881.field9009.method15374(this.field8480)};
      } else {
         this.field8490 = new String[]{null, null, null, null, null, null};
      }

   }

   @deob.ObfuscatedName("tf.n(II)Ltr;")
   public class843 method14651(int arg0) {
      class737 var2 = this.field8488;
      class843 var3;
      synchronized(this.field8488) {
         var3 = (class843)this.field8488.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field8479;
         byte[] var6;
         synchronized(this.field8479) {
            var6 = this.field8479.method8771(class424.field3358.method5800(arg0), class424.field3358.method5803(arg0));
         }

         class843 var8 = new class843();
         var8.field8577 = arg0;
         var8.field8569 = this;
         var8.field8601 = (String[])((String[])this.field8490.clone());
         if (var6 != null) {
            var8.method14845(new class124(var6));
         }

         var8.method14847();
         if (var8.field8620) {
            var8.field8594 = 0;
            var8.field8586 = false;
         }

         if (!this.field8482 && var8.field8567) {
            var8.field8601 = null;
            var8.field8568 = null;
         }

         class737 var9 = this.field8488;
         synchronized(this.field8488) {
            this.field8488.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("tf.k(ZI)V")
   public void method14634(boolean arg0) {
      if (this.field8482 != arg0) {
         this.field8482 = arg0;
         this.method14641();
      }
   }

   @deob.ObfuscatedName("tf.d(II)V")
   public void method14635(int arg0) {
      this.field8489 = arg0;
      class737 var2 = this.field8484;
      synchronized(this.field8484) {
         this.field8484.method10883();
      }

      class737 var4 = this.field8487;
      synchronized(this.field8487) {
         this.field8487.method10883();
      }

      class737 var6 = this.field8481;
      synchronized(this.field8481) {
         this.field8481.method10883();
      }
   }

   @deob.ObfuscatedName("tf.b(II)V")
   public void method14636(int arg0) {
      this.field8488 = new class737(arg0);
   }

   @deob.ObfuscatedName("tf.r(I)V")
   public void method14641() {
      class737 var1 = this.field8488;
      synchronized(this.field8488) {
         this.field8488.method10883();
      }

      class737 var3 = this.field8484;
      synchronized(this.field8484) {
         this.field8484.method10883();
      }

      class737 var5 = this.field8487;
      synchronized(this.field8487) {
         this.field8487.method10883();
      }

      class737 var7 = this.field8481;
      synchronized(this.field8481) {
         this.field8481.method10883();
      }

      this.field8491 = new class396[4];
      this.field8492 = new class862((Object)null, (Object)null);
   }

   @deob.ObfuscatedName("tf.p(II)V")
   public void method14642(int arg0) {
      class737 var2 = this.field8488;
      synchronized(this.field8488) {
         this.field8488.method10882(arg0);
      }

      class737 var4 = this.field8484;
      synchronized(this.field8484) {
         this.field8484.method10882(arg0);
      }

      class737 var6 = this.field8487;
      synchronized(this.field8487) {
         this.field8487.method10882(arg0);
      }

      class737 var8 = this.field8481;
      synchronized(this.field8481) {
         this.field8481.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("tf.o(B)V")
   public void method14638() {
      class737 var1 = this.field8488;
      synchronized(this.field8488) {
         this.field8488.method10887();
      }

      class737 var3 = this.field8484;
      synchronized(this.field8484) {
         this.field8484.method10887();
      }

      class737 var5 = this.field8487;
      synchronized(this.field8487) {
         this.field8487.method10887();
      }

      class737 var7 = this.field8481;
      synchronized(this.field8481) {
         this.field8481.method10887();
      }
   }
}
