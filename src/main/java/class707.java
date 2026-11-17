@deob.ObfuscatedName("oq")
public class class707 {
   @deob.ObfuscatedName("oq.k")
   private final class737 field6506 = new class737(16);
   @deob.ObfuscatedName("oq.n")
   private final class612 field6507;

   public class707(class801 arg0, class823 arg1, class612 arg2) {
      this.field6507 = arg2;
      this.field6507.method8792(class424.field3343.field3349);
   }

   @deob.ObfuscatedName("oq.n(II)Loj;")
   private class700 method10374(int arg0) {
      class737 var2 = this.field6506;
      class700 var3;
      synchronized(this.field6506) {
         var3 = (class700)this.field6506.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field6507;
         byte[] var6;
         synchronized(this.field6507) {
            var6 = this.field6507.method8771(class424.field3343.field3349, arg0);
         }

         class700 var8 = new class700();
         if (var6 != null) {
            var8.method10303(new class124(var6));
         }

         class737 var9 = this.field6506;
         synchronized(this.field6506) {
            this.field6506.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("oq.k(IIIILff;I)Lmt;")
   public class656 method10375(int arg0, int arg1, int arg2, int arg3, class445 arg4) {
      class638[] var6 = null;
      class700 var7 = this.method10374(arg0);
      if (var7.field6463 != null) {
         var6 = new class638[var7.field6463.length];

         for(int var8 = 0; var8 < var6.length; ++var8) {
            class457 var9 = arg4.method6241(var7.field6463[var8]);
            var6[var8] = new class638(var9.field3778, var9.field3784, var9.field3779, var9.field3780, var9.field3781, var9.field3785, var9.field3783, var9.field3782, var9.field3787, var9.field3786, var9.field3777);
         }
      }

      return new class656(var7.field6459, var6, var7.field6460, arg1, arg2, arg3, var7.field6462, var7.field6461);
   }

   @deob.ObfuscatedName("oq.d(B)V")
   public void method10376() {
      class737 var1 = this.field6506;
      synchronized(this.field6506) {
         this.field6506.method10883();
      }
   }

   @deob.ObfuscatedName("oq.b(II)V")
   public void method10384(int arg0) {
      class737 var2 = this.field6506;
      synchronized(this.field6506) {
         this.field6506.method10882(arg0);
      }
   }

   @deob.ObfuscatedName("oq.r(S)V")
   public void method10378() {
      class737 var1 = this.field6506;
      synchronized(this.field6506) {
         this.field6506.method10887();
      }
   }
}
