@deob.ObfuscatedName("pt")
public final class class737 {
   @deob.ObfuscatedName("pt.b")
   private class846 field6780;
   @deob.ObfuscatedName("pt.n")
   private int field6778;
   @deob.ObfuscatedName("pt.k")
   private int field6777;
   @deob.ObfuscatedName("pt.d")
   private class875 field6779;

   public class737(int arg0, int arg1) {
      this.field6780 = new class846();
      this.field6778 = arg0;
      this.field6777 = arg0;

      int var3;
      for(var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
      }

      this.field6779 = new class875(var3);
   }

   public class737(int arg0) {
      this(arg0, arg0);
   }

   @deob.ObfuscatedName("pt.n(J)Ljava/lang/Object;")
   public Object method10909(long arg0) {
      class249 var3 = (class249)this.field6779.method15322(arg0);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.method3379();
         if (var4 == null) {
            var3.method9864();
            var3.method1393();
            this.field6777 += var3.field1653;
            return null;
         } else {
            if (var3.method3381()) {
               class314 var5 = new class314(var4, var3.field1653);
               this.field6779.method15311(var5, var3.field6137);
               this.field6780.method14938(var5);
               var5.field808 = 0L;
               var3.method9864();
               var3.method1393();
            } else {
               this.field6780.method14938(var3);
               var3.field808 = 0L;
            }

            return var4;
         }
      }
   }

   @deob.ObfuscatedName("pt.k(J)V")
   public void method10878(long arg0) {
      class249 var3 = (class249)this.field6779.method15322(arg0);
      this.method10902(var3);
   }

   @deob.ObfuscatedName("pt.d(Lajd;B)V")
   private void method10902(class249 arg0) {
      if (arg0 != null) {
         arg0.method9864();
         arg0.method1393();
         this.field6777 += arg0.field1653;
      }

   }

   @deob.ObfuscatedName("pt.b(Ljava/lang/Object;J)V")
   public void method10880(Object arg0, long arg1) {
      this.method10881(arg0, arg1, 1);
   }

   @deob.ObfuscatedName("pt.r(Ljava/lang/Object;JII)V")
   public void method10881(Object arg0, long arg1, int arg2) {
      if (arg2 > this.field6778) {
         throw new IllegalStateException();
      } else {
         this.method10878(arg1);
         this.field6777 -= arg2;

         while(this.field6777 < 0) {
            class249 var5 = (class249)this.field6780.method14923();
            this.method10902(var5);
         }

         class314 var6 = new class314(arg0, arg2);
         this.field6779.method15311(var6, arg1);
         this.field6780.method14938(var6);
         var6.field808 = 0L;
      }
   }

   @deob.ObfuscatedName("pt.p(II)V")
   public void method10882(int arg0) {
      for(class249 var2 = (class249)this.field6780.method14944(); var2 != null; var2 = (class249)this.field6780.method14929()) {
         if (var2.method3381()) {
            if (var2.method3379() == null) {
               var2.method9864();
               var2.method1393();
               this.field6777 += var2.field1653;
            }
         } else if (++var2.field808 > (long)arg0) {
            class303 var3 = new class303(var2.method3379(), var2.field1653);
            this.field6779.method15311(var3, var2.field6137);
            class846.method5941(var3, var2);
            var2.method9864();
            var2.method1393();
         }
      }

   }

   @deob.ObfuscatedName("pt.o(S)V")
   public void method10883() {
      this.field6780.method14924();
      this.field6779.method15312();
      this.field6777 = this.field6778;
   }

   @deob.ObfuscatedName("pt.a(B)I")
   public int method10884() {
      return this.field6778;
   }

   @deob.ObfuscatedName("pt.x(I)I")
   public int method10885() {
      return this.field6777;
   }

   @deob.ObfuscatedName("pt.s(I)I")
   public int method10886() {
      int var1 = 0;

      for(class249 var2 = (class249)this.field6780.method14944(); var2 != null; var2 = (class249)this.field6780.method14929()) {
         if (!var2.method3381()) {
            ++var1;
         }
      }

      return var1;
   }

   @deob.ObfuscatedName("pt.l(I)V")
   public void method10887() {
      for(class249 var1 = (class249)this.field6780.method14944(); var1 != null; var1 = (class249)this.field6780.method14929()) {
         if (var1.method3381()) {
            var1.method9864();
            var1.method1393();
            this.field6777 += var1.field1653;
         }
      }

   }

   @deob.ObfuscatedName("pt.u(I)Ljava/lang/Object;")
   public Object method10888() {
      class249 var1 = (class249)this.field6779.method15313();

      while(var1 != null) {
         Object var2 = var1.method3379();
         if (var2 != null) {
            return var2;
         }

         class249 var3 = var1;
         var1 = (class249)this.field6779.method15314();
         var3.method9864();
         var3.method1393();
         this.field6777 += var3.field1653;
      }

      return null;
   }

   @deob.ObfuscatedName("pt.v(I)Ljava/lang/Object;")
   public Object method10906() {
      class249 var1 = (class249)this.field6779.method15314();

      while(var1 != null) {
         Object var2 = var1.method3379();
         if (var2 != null) {
            return var2;
         }

         class249 var3 = var1;
         var1 = (class249)this.field6779.method15314();
         var3.method9864();
         var3.method1393();
         this.field6777 += var3.field1653;
      }

      return null;
   }
}
