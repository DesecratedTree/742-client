import java.util.Iterator;

@deob.ObfuscatedName("th")
public class class833 implements Iterator {
   @deob.ObfuscatedName("th.d")
   private class107 field8501 = null;
   @deob.ObfuscatedName("th.n")
   private class846 field8500;
   @deob.ObfuscatedName("th.k")
   private class107 field8499;

   public class833(class846 arg0) {
      this.field8500 = arg0;
      this.field8499 = this.field8500.field8664.field809;
      this.field8501 = null;
   }

   @deob.ObfuscatedName("th.o(B)V")
   private void method14667() {
      this.field8499 = this.field8500.field8664.field809;
      this.field8501 = null;
   }

   @deob.ObfuscatedName("th.a(B)Ladx;")
   public class107 method14668() {
      this.method14667();
      return (class107)this.next();
   }

   public Object next() {
      class107 var1 = this.field8499;
      if (this.field8500.field8664 == var1) {
         var1 = null;
         this.field8499 = null;
      } else {
         this.field8499 = var1.field809;
      }

      this.field8501 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field8500.field8664 != this.field8499;
   }

   public void remove() {
      if (this.field8501 == null) {
         throw new IllegalStateException();
      } else {
         this.field8501.method1393();
         this.field8501 = null;
      }
   }
}
