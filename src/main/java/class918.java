@deob.ObfuscatedName("wl")
public class class918 {
   @deob.ObfuscatedName("wl.r")
   private class737 field9366 = new class737(64);
   @deob.ObfuscatedName("wl.p")
   public class737 field9362 = new class737(64);
   @deob.ObfuscatedName("wl.n")
   private final class612 field9367;
   @deob.ObfuscatedName("wl.k")
   public final class612 field9363;

   public class918(class801 arg0, class823 arg1, class612 arg2, class612 arg3) {
      this.field9367 = arg2;
      this.field9363 = arg3;
      this.field9367.method8792(class424.field3333.field3349);
      Math.random();
      Math.random();
      Math.random();
      Math.random();
   }

   @deob.ObfuscatedName("wl.n(IB)Lvk;")
   public class890 method15830(int arg0) {
      class737 var2 = this.field9366;
      class890 var3;
      synchronized(this.field9366) {
         var3 = (class890)this.field9366.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9367;
         byte[] var6;
         synchronized(this.field9367) {
            var6 = this.field9367.method8771(class424.field3333.field3349, arg0);
         }

         class890 var8 = new class890();
         var8.field9081 = this;
         if (var6 != null) {
            var8.method15496(new class124(var6));
         }

         class737 var9 = this.field9366;
         synchronized(this.field9366) {
            this.field9366.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("wl.k(IIB)V")
   public void method15832(int arg0, int arg1) {
      this.field9366 = new class737(arg0);
      this.field9362 = new class737(arg1);
   }

   @deob.ObfuscatedName("wl.d(I)V")
   public void method15839() {
      class737 var1 = this.field9366;
      synchronized(this.field9366) {
         this.field9366.method10883();
      }

      class737 var3 = this.field9362;
      synchronized(this.field9362) {
         this.field9362.method10883();
      }
   }

   @deob.ObfuscatedName("wl.b(II)V")
   public void method15833(int arg0) {
      class737 var2 = this.field9366;
      synchronized(this.field9366) {
         this.field9366.method10882(arg0);
      }

      class737 var4 = this.field9362;
      synchronized(this.field9362) {
         this.field9362.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("wl.r(B)V")
   public void method15834() {
      class737 var1 = this.field9366;
      synchronized(this.field9366) {
         this.field9366.method10887();
      }

      class737 var3 = this.field9362;
      synchronized(this.field9362) {
         this.field9362.method10887();
      }
   }
}
