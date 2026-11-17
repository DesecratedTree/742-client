@deob.ObfuscatedName("vy")
public class class904 {
   @deob.ObfuscatedName("vy.d")
   public int field9230 = 0;
   @deob.ObfuscatedName("vy.b")
   public int field9231 = 0;
   @deob.ObfuscatedName("vy.r")
   private final class737 field9233 = new class737(64);
   @deob.ObfuscatedName("vy.a")
   private class748 field9237 = null;
   @deob.ObfuscatedName("vy.n")
   private final class612 field9234;
   @deob.ObfuscatedName("vy.k")
   private final class612 field9232;

   public class904(class823 arg0, class612 arg1, class612 arg2, class748 arg3) {
      this.field9234 = arg1;
      this.field9232 = arg2;
      this.field9237 = arg3;
      if (this.field9234 != null) {
         this.field9230 = this.field9234.method8792(1);
      }

      if (this.field9232 != null) {
         this.field9231 = this.field9232.method8792(1);
      }

   }

   @deob.ObfuscatedName("vy.n(IB)Lajy;")
   public class270 method15712(int arg0) {
      class270 var2 = (class270)this.field9233.method10909((long)arg0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3;
         if (arg0 >= 32768) {
            var3 = this.field9232.method8771(1, arg0 & 32767);
         } else {
            var3 = this.field9234.method8771(1, arg0);
         }

         class270 var4 = new class270();
         var4.field1795 = this;
         if (var3 != null) {
            var4.method3601(new class124(var3));
         }

         if (arg0 >= 32768) {
            var4.method3585();
         }

         this.field9233.method10880(var4, (long)arg0);
         return var4;
      }
   }

   @deob.ObfuscatedName("vy.k(Lqf;[IJ)Ljava/lang/String;")
   public String method15714(class750 arg0, int[] arg1, long arg2) {
      if (this.field9237 != null) {
         String var5 = this.field9237.method7456(arg0, arg1, arg2);
         if (var5 != null) {
            return var5;
         }
      }

      return Long.toString(arg2);
   }
}
