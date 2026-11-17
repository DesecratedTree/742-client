@deob.ObfuscatedName("rd")
public class class775 {
   @deob.ObfuscatedName("rd.n")
   private class600 field7133 = new class600();
   @deob.ObfuscatedName("rd.k")
   private class600 field7130 = new class600();
   @deob.ObfuscatedName("rd.d")
   private boolean field7131 = true;
   @deob.ObfuscatedName("rd.b")
   private class600 field7132 = new class600();
   @deob.ObfuscatedName("rd.r")
   private boolean field7138 = true;
   @deob.ObfuscatedName("rd.p")
   private class583 field7134;
   @deob.ObfuscatedName("rd.o")
   private boolean field7135;
   @deob.ObfuscatedName("rd.a")
   private class775 field7137;
   @deob.ObfuscatedName("rd.x")
   private class775 field7129;
   @deob.ObfuscatedName("rd.s")
   private class775 field7136;

   protected class775() {
      new class597();
      new class597();
      this.field7134 = new class583();
      this.field7135 = true;
      this.field7137 = null;
      this.field7129 = null;
      this.field7136 = null;
   }

   @deob.ObfuscatedName("rd.w()Lkr;")
   public final class600 method11622() {
      return this.field7133;
   }

   @deob.ObfuscatedName("rd.q()Lkr;")
   public final class600 method11602() {
      if (this.field7131) {
         this.field7131 = false;
         this.field7130.method8536(this.field7133);
         if (this.field7137 != null) {
            this.field7130.method8538(this.field7137.method11602());
         }
      }

      return this.field7130;
   }

   @deob.ObfuscatedName("rd.y()Lkr;")
   private final class600 method11603() {
      if (this.field7138) {
         this.field7138 = false;
         this.field7132.method8536(this.method11602());
         this.field7132.method8537();
      }

      return this.field7130;
   }

   @deob.ObfuscatedName("rd.j()Lka;")
   protected final class583 method11605() {
      if (this.field7135) {
         this.field7135 = false;
         this.field7134.method8075(this.method11602());
      }

      return this.field7134;
   }

   @deob.ObfuscatedName("rd.f(Lkr;)V")
   private final void method11607(class600 arg0) {
      this.field7133.method8536(arg0);
      this.method11610();
      if (this.field7129 != null) {
         this.field7129.method11611();
      }

   }

   @deob.ObfuscatedName("rd.ai(Lkx;)V")
   public final void method11606(class606 arg0) {
      this.field7133.field5447.method8645(arg0);
      this.method11610();
      if (this.field7129 != null) {
         this.field7129.method11611();
      }

   }

   @deob.ObfuscatedName("rd.ap(Lkb;)V")
   public final void method11626(class584 arg0) {
      this.field7133.field5446.method8177(arg0);
      this.method11610();
      if (this.field7129 != null) {
         this.field7129.method11611();
      }

   }

   @deob.ObfuscatedName("rd.av(FFF)V")
   public final void method11608(float arg0, float arg1, float arg2) {
      this.field7133.field5446.method8141(arg0, arg1, arg2);
      this.method11610();
      if (this.field7129 != null) {
         this.field7129.method11611();
      }

   }

   @deob.ObfuscatedName("rd.ax(Lkr;)V")
   protected final void method11609(class600 arg0) {
      if (this.field7137 != null) {
         class600 var2 = new class600(arg0);
         var2.method8538(this.field7137.method11603());
         this.method11607(var2);
      } else {
         this.method11607(arg0);
      }

   }

   @deob.ObfuscatedName("rd.af()V")
   private final void method11610() {
      this.field7131 = true;
      this.field7138 = true;
      this.field7135 = true;
   }

   @deob.ObfuscatedName("rd.at()V")
   private final void method11611() {
      this.method11610();
      if (this.field7129 != null) {
         this.field7129.method11611();
      }

      if (this.field7136 != null) {
         this.field7136.method11611();
      }

   }

   @deob.ObfuscatedName("rd.ah()V")
   public final void method11612() {
      if (this.field7137 != null) {
         class775 var1 = this.field7137.field7129;
         if (this == var1) {
            this.field7137.field7129 = this.field7136;
         } else {
            while(var1.field7136 != this) {
               var1 = var1.field7136;
            }

            var1.field7136 = this.field7136;
         }
      }

      this.method11610();
      if (this.field7129 != null) {
         this.field7129.method11611();
         class775 var2 = this.field7129;

         while(true) {
            var2.field7133.method8538(this.field7133);
            var2.field7137 = this.field7137;
            if (var2.field7136 == null) {
               var2.field7136 = this.field7137.field7129;
               this.field7137.field7129 = this.field7129;
               break;
            }

            var2 = var2.field7136;
         }
      }

      this.field7137 = null;
      this.field7136 = null;
      this.field7129 = null;
   }
}
