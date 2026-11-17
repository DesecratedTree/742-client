import java.util.Iterator;

@deob.ObfuscatedName("tu")
public class class846 implements Iterable {
   @deob.ObfuscatedName("tu.n")
   public class107 field8664 = new class107();
   @deob.ObfuscatedName("tu.k")
   private class107 field8663;

   public class846() {
      this.field8664.field809 = this.field8664;
      this.field8664.field810 = this.field8664;
   }

   @deob.ObfuscatedName("tu.n(I)V")
   public void method14924() {
      while(this.field8664.field809 != this.field8664) {
         this.field8664.field809.method1393();
      }

   }

   @deob.ObfuscatedName("tu.k(Ladx;I)V")
   public void method14938(class107 arg0) {
      if (arg0.field810 != null) {
         arg0.method1393();
      }

      arg0.field810 = this.field8664.field810;
      arg0.field809 = this.field8664;
      arg0.field810.field809 = arg0;
      arg0.field809.field810 = arg0;
   }

   @deob.ObfuscatedName("eq.b(Ladx;Ladx;I)V")
   public static void method5941(class107 arg0, class107 arg1) {
      if (arg0.field810 != null) {
         arg0.method1393();
      }

      arg0.field810 = arg1;
      arg0.field809 = arg1.field809;
      arg0.field810.field809 = arg0;
      arg0.field809.field810 = arg0;
   }

   @deob.ObfuscatedName("tu.r(I)Ladx;")
   public class107 method14923() {
      class107 var1 = this.field8664.field809;
      if (this.field8664 == var1) {
         return null;
      } else {
         var1.method1393();
         return var1;
      }
   }

   @deob.ObfuscatedName("tu.p(S)Ladx;")
   public class107 method14944() {
      return this.method14928((class107)null);
   }

   @deob.ObfuscatedName("tu.o(Ladx;B)Ladx;")
   private class107 method14928(class107 arg0) {
      class107 var2;
      if (arg0 == null) {
         var2 = this.field8664.field809;
      } else {
         var2 = arg0;
      }

      if (this.field8664 == var2) {
         this.field8663 = null;
         return null;
      } else {
         this.field8663 = var2.field809;
         return var2;
      }
   }

   @deob.ObfuscatedName("tu.a(I)Ladx;")
   public class107 method14929() {
      class107 var1 = this.field8663;
      if (this.field8664 == var1) {
         this.field8663 = null;
         return null;
      } else {
         this.field8663 = var1.field809;
         return var1;
      }
   }

   @deob.ObfuscatedName("tu.x(I)I")
   public int method14930() {
      int var1 = 0;

      for(class107 var2 = this.field8664.field809; this.field8664 != var2; var2 = var2.field809) {
         ++var1;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class833(this);
   }
}
