@deob.ObfuscatedName("qu")
public class class765 {
   @deob.ObfuscatedName("qu.b")
   private class846 field7029 = new class846();
   @deob.ObfuscatedName("qu.n")
   private int field7026;
   @deob.ObfuscatedName("qu.k")
   private int field7028;
   @deob.ObfuscatedName("qu.d")
   private class875 field7027;

   public class765(int arg0) {
      this.field7026 = arg0;
      this.field7028 = arg0;

      int var2;
      for(var2 = 1; var2 + var2 < arg0; var2 += var2) {
      }

      this.field7027 = new class875(var2);
   }

   @deob.ObfuscatedName("qu.n(Lqj;)Ljava/lang/Object;")
   public final Object method11351(class754 arg0) {
      long var2 = arg0.method11192();

      for(class271 var4 = (class271)this.field7027.method15322(var2); var4 != null; var4 = (class271)this.field7027.method15308()) {
         if (var4.field1797.method11191(arg0)) {
            Object var5 = var4.method3608();
            if (var5 != null) {
               if (var4.method3606()) {
                  class306 var6 = new class306(arg0, var5, var4.field1798);
                  this.field7027.method15311(var6, var4.field6137);
                  this.field7029.method14938(var6);
                  var6.field808 = 0L;
                  var4.method9864();
                  var4.method1393();
               } else {
                  this.field7029.method14938(var4);
                  var4.field808 = 0L;
               }

               return var5;
            }

            var4.method9864();
            var4.method1393();
            this.field7028 += var4.field1798;
         }
      }

      return null;
   }

   @deob.ObfuscatedName("qu.k(Lqj;)V")
   private final void method11352(class754 arg0) {
      long var2 = arg0.method11192();

      for(class271 var4 = (class271)this.field7027.method15322(var2); var4 != null; var4 = (class271)this.field7027.method15308()) {
         if (var4.field1797.method11191(arg0)) {
            this.method11353(var4);
            break;
         }
      }

   }

   @deob.ObfuscatedName("qu.d(Lajz;)V")
   private final void method11353(class271 arg0) {
      if (arg0 != null) {
         arg0.method9864();
         arg0.method1393();
         this.field7028 += arg0.field1798;
      }

   }

   @deob.ObfuscatedName("qu.b(Ljava/lang/Object;Lqj;)V")
   public final void method11354(Object arg0, class754 arg1) {
      this.method11355(arg0, arg1, 1);
   }

   @deob.ObfuscatedName("qu.r(Ljava/lang/Object;Lqj;I)V")
   private final void method11355(Object arg0, class754 arg1, int arg2) {
      if (arg2 > this.field7026) {
         throw new IllegalStateException();
      } else {
         this.method11352(arg1);
         this.field7028 -= arg2;

         while(this.field7028 < 0) {
            class271 var4 = (class271)this.field7029.method14923();
            this.method11353(var4);
         }

         class306 var5 = new class306(arg1, arg0, arg2);
         this.field7027.method15311(var5, arg1.method11192());
         this.field7029.method14938(var5);
         var5.field808 = 0L;
      }
   }

   @deob.ObfuscatedName("qu.p(I)V")
   public final void method11356(int arg0) {
      for(class271 var2 = (class271)this.field7029.method14944(); var2 != null; var2 = (class271)this.field7029.method14929()) {
         if (var2.method3606()) {
            if (var2.method3608() == null) {
               var2.method9864();
               var2.method1393();
               this.field7028 += var2.field1798;
            }
         } else if (++var2.field808 > (long)arg0) {
            class311 var3 = new class311(var2.field1797, var2.method3608(), var2.field1798);
            this.field7027.method15311(var3, var2.field6137);
            class846.method5941(var3, var2);
            var2.method9864();
            var2.method1393();
         }
      }

   }

   @deob.ObfuscatedName("qu.o()V")
   public final void method11357() {
      this.field7029.method14924();
      this.field7027.method15312();
      this.field7028 = this.field7026;
   }

   @deob.ObfuscatedName("qu.a()I")
   public final int method11350() {
      return this.field7026;
   }

   @deob.ObfuscatedName("qu.x()I")
   public final int method11359() {
      return this.field7028;
   }

   @deob.ObfuscatedName("qu.s()V")
   public final void method11360() {
      for(class271 var1 = (class271)this.field7029.method14944(); var1 != null; var1 = (class271)this.field7029.method14929()) {
         if (var1.method3606()) {
            var1.method9864();
            var1.method1393();
            this.field7028 += var1.field1798;
         }
      }

   }
}
