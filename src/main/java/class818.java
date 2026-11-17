@deob.ObfuscatedName("st")
public class class818 {
   @deob.ObfuscatedName("st.k")
   private final class737 field8424 = new class737(64);
   @deob.ObfuscatedName("st.d")
   private final class737 field8425 = new class737(100);
   @deob.ObfuscatedName("st.n")
   private final class612 field8426;

   public class818(class801 arg0, class823 arg1, class612 arg2, class612 arg3, class612 arg4) {
      this.field8426 = arg2;
      if (this.field8426 != null) {
         int var6 = this.field8426.method8782() - 1;
         class424.field3326.method5801();
         this.field8426.method8792(var6);
      }

      class247.method11184(arg3, arg4, 2);
   }

   @deob.ObfuscatedName("st.n(II)Lsh;")
   public class806 method14475(int arg0) {
      class737 var2 = this.field8424;
      class806 var3;
      synchronized(this.field8424) {
         var3 = (class806)this.field8424.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field8426;
         byte[] var6;
         synchronized(this.field8426) {
            var6 = this.field8426.method8771(class424.field3326.method5800(arg0), class424.field3326.method5803(arg0));
         }

         class806 var8 = new class806();
         var8.field8357 = arg0;
         var8.field8356 = this;
         if (var6 != null) {
            var8.method14320(new class124(var6));
         }

         var8.method14309();
         class737 var9 = this.field8424;
         synchronized(this.field8424) {
            this.field8424.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("st.k(II)Lajb;")
   public class247 method14480(int arg0) {
      class737 var2 = this.field8425;
      synchronized(this.field8425) {
         class247 var3 = (class247)this.field8425.method10909((long)arg0);
         if (var3 == null) {
            var3 = new class247(arg0);
            this.field8425.method10880(var3, (long)arg0);
         }

         return !var3.method3354() ? null : var3;
      }
   }

   @deob.ObfuscatedName("st.d(S)V")
   public void method14476() {
      class737 var1 = this.field8424;
      synchronized(this.field8424) {
         this.field8424.method10883();
      }

      class737 var3 = this.field8425;
      synchronized(this.field8425) {
         this.field8425.method10883();
      }
   }

   @deob.ObfuscatedName("st.b(II)V")
   public void method14477(int arg0) {
      class737 var2 = this.field8424;
      synchronized(this.field8424) {
         this.field8424.method10882(arg0);
      }

      class737 var4 = this.field8425;
      synchronized(this.field8425) {
         this.field8425.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("st.r(B)V")
   public void method14483() {
      class737 var1 = this.field8424;
      synchronized(this.field8424) {
         this.field8424.method10887();
      }

      class737 var3 = this.field8425;
      synchronized(this.field8425) {
         this.field8425.method10887();
      }
   }
}
