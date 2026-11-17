@deob.ObfuscatedName("pd")
public class class721 {
   @deob.ObfuscatedName("pd.r")
   private class737 field6671 = new class737(128);
   @deob.ObfuscatedName("pd.p")
   public class737 field6673 = new class737(64);
   @deob.ObfuscatedName("pd.n")
   private final class612 field6672;
   @deob.ObfuscatedName("pd.k")
   public final class612 field6669;

   public class721(class801 arg0, class823 arg1, class612 arg2, class612 arg3) {
      this.field6672 = arg2;
      this.field6669 = arg3;
      this.field6672.method8792(class424.field3350.field3349);
   }

   @deob.ObfuscatedName("pd.n(II)Lpp;")
   public class733 method10685(int arg0) {
      class737 var2 = this.field6671;
      class733 var3;
      synchronized(this.field6671) {
         var3 = (class733)this.field6671.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field6672;
         byte[] var6;
         synchronized(this.field6672) {
            var6 = this.field6672.method8771(class424.field3350.field3349, arg0);
         }

         class733 var8 = new class733();
         var8.field6726 = arg0;
         var8.field6734 = this;
         if (var6 != null) {
            var8.method10820(new class124(var6));
         }

         var8.method10819();
         class737 var9 = this.field6671;
         synchronized(this.field6671) {
            this.field6671.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("pd.k(III)V")
   public void method10690(int arg0, int arg1) {
      this.field6671 = new class737(arg0);
      this.field6673 = new class737(arg1);
   }

   @deob.ObfuscatedName("pd.d(I)V")
   public void method10687() {
      class737 var1 = this.field6671;
      synchronized(this.field6671) {
         this.field6671.method10883();
      }

      class737 var3 = this.field6673;
      synchronized(this.field6673) {
         this.field6673.method10883();
      }
   }

   @deob.ObfuscatedName("pd.b(IB)V")
   public void method10686(int arg0) {
      class737 var2 = this.field6671;
      synchronized(this.field6671) {
         this.field6671.method10882(arg0);
      }

      class737 var4 = this.field6673;
      synchronized(this.field6673) {
         this.field6673.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("pd.r(I)V")
   public void method10684() {
      class737 var1 = this.field6671;
      synchronized(this.field6671) {
         this.field6671.method10887();
      }

      class737 var3 = this.field6673;
      synchronized(this.field6673) {
         this.field6673.method10887();
      }
   }
}
