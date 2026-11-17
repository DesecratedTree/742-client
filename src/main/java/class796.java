@deob.ObfuscatedName("ry")
public class class796 {
   @deob.ObfuscatedName("ry.d")
   private final class737 field7265 = new class737(64);
   @deob.ObfuscatedName("ry.b")
   public final class737 field7268 = new class737(60);
   @deob.ObfuscatedName("ry.n")
   private final class612 field7267;
   @deob.ObfuscatedName("ry.k")
   public final class612 field7266;
   @deob.ObfuscatedName("ry.r")
   public int field7269;

   public class796(class801 arg0, class823 arg1, class612 arg2, class612 arg3) {
      this.field7267 = arg2;
      this.field7266 = arg3;
      int var5 = this.field7267.method8782() - 1;
      class424.field3327.method5801();
      this.field7267.method8792(var5);
   }

   @deob.ObfuscatedName("ry.n(IB)Lsq;")
   public class815 method14209(int arg0) {
      class737 var2 = this.field7265;
      class815 var3;
      synchronized(this.field7265) {
         var3 = (class815)this.field7265.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field7267;
         byte[] var6;
         synchronized(this.field7267) {
            var6 = this.field7267.method8771(class424.field3327.method5800(arg0), class424.field3327.method5803(arg0));
         }

         class815 var8 = new class815();
         var8.field8415 = this;
         var8.field8404 = arg0;
         if (var6 != null) {
            var8.method14385(new class124(var6));
         }

         class737 var9 = this.field7265;
         synchronized(this.field7265) {
            this.field7265.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("ry.k(IB)V")
   public void method14206(int arg0) {
      this.field7269 = arg0;
      class737 var2 = this.field7268;
      synchronized(this.field7268) {
         this.field7268.method10883();
      }
   }

   @deob.ObfuscatedName("ry.d(B)V")
   public void method14207() {
      class737 var1 = this.field7265;
      synchronized(this.field7265) {
         this.field7265.method10883();
      }

      class737 var3 = this.field7268;
      synchronized(this.field7268) {
         this.field7268.method10883();
      }
   }

   @deob.ObfuscatedName("ry.b(II)V")
   public void method14205(int arg0) {
      class737 var2 = this.field7265;
      synchronized(this.field7265) {
         this.field7265.method10882(arg0);
      }

      class737 var4 = this.field7268;
      synchronized(this.field7268) {
         this.field7268.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("ry.r(I)V")
   public void method14212() {
      class737 var1 = this.field7265;
      synchronized(this.field7265) {
         this.field7265.method10887();
      }

      class737 var3 = this.field7268;
      synchronized(this.field7268) {
         this.field7268.method10887();
      }
   }
}
