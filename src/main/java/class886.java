@deob.ObfuscatedName("vg")
public class class886 {
   @deob.ObfuscatedName("vg.d")
   private final class737 field9071 = new class737(64);
   @deob.ObfuscatedName("vg.b")
   public final class737 field9072 = new class737(2);
   @deob.ObfuscatedName("vg.n")
   private final class612 field9069;
   @deob.ObfuscatedName("vg.k")
   public final class612 field9070;

   public class886(class801 arg0, class823 arg1, class612 arg2, class612 arg3) {
      this.field9069 = arg2;
      this.field9070 = arg3;
      this.field9069.method8792(class424.field3315.field3349);
   }

   @deob.ObfuscatedName("vg.n(II)Lvf;")
   public class885 method15455(int arg0) {
      class737 var2 = this.field9071;
      class885 var3;
      synchronized(this.field9071) {
         var3 = (class885)this.field9071.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9069;
         byte[] var6;
         synchronized(this.field9069) {
            var6 = this.field9069.method8771(class424.field3315.field3349, arg0);
         }

         class885 var8 = new class885();
         var8.field9064 = this;
         if (var6 != null) {
            var8.method15432(new class124(var6));
         }

         class737 var9 = this.field9071;
         synchronized(this.field9071) {
            this.field9071.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("vg.k(I)V")
   public void method15450() {
      class737 var1 = this.field9071;
      synchronized(this.field9071) {
         this.field9071.method10883();
      }

      class737 var3 = this.field9072;
      synchronized(this.field9072) {
         this.field9072.method10883();
      }
   }

   @deob.ObfuscatedName("vg.d(II)V")
   public void method15446(int arg0) {
      class737 var2 = this.field9071;
      synchronized(this.field9071) {
         this.field9071.method10882(arg0);
      }

      class737 var4 = this.field9072;
      synchronized(this.field9072) {
         this.field9072.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("vg.b(B)V")
   public void method15447() {
      class737 var1 = this.field9071;
      synchronized(this.field9071) {
         this.field9071.method10887();
      }

      class737 var3 = this.field9072;
      synchronized(this.field9072) {
         this.field9072.method10887();
      }
   }
}
