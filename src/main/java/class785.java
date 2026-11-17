@deob.ObfuscatedName("rn")
public class class785 {
   @deob.ObfuscatedName("rn.d")
   private final class737 field7181 = new class737(64);
   @deob.ObfuscatedName("rn.b")
   public int field7183 = 0;
   @deob.ObfuscatedName("rn.n")
   private final class612 field7182;
   @deob.ObfuscatedName("rn.k")
   public int field7180;

   public class785(class801 arg0, class823 arg1, class612 arg2) {
      this.field7182 = arg2;
      this.field7180 = this.field7182.method8792(class424.field3318.field3349);
   }

   @deob.ObfuscatedName("rn.n(IB)Lru;")
   public class792 method14043(int arg0) {
      class737 var2 = this.field7181;
      class792 var3;
      synchronized(this.field7181) {
         var3 = (class792)this.field7181.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field7182;
         byte[] var6;
         synchronized(this.field7182) {
            var6 = this.field7182.method8771(class424.field3318.field3349, arg0);
         }

         class792 var8 = new class792();
         var8.field7231 = this;
         var8.field7229 = arg0;
         if (var6 != null) {
            var8.method14166(new class124(var6));
         }

         var8.method14158();
         class737 var9 = this.field7181;
         synchronized(this.field7181) {
            this.field7181.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("rn.k(I)V")
   public void method14042() {
      class737 var1 = this.field7181;
      synchronized(this.field7181) {
         this.field7181.method10883();
      }
   }

   @deob.ObfuscatedName("rn.d(II)V")
   public void method14054(int arg0) {
      class737 var2 = this.field7181;
      synchronized(this.field7181) {
         this.field7181.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("rn.b(B)V")
   public void method14055() {
      class737 var1 = this.field7181;
      synchronized(this.field7181) {
         this.field7181.method10887();
      }
   }
}
