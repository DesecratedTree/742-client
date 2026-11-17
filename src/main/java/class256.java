@deob.ObfuscatedName("ajk")
public class class256 extends class107 {
   @deob.ObfuscatedName("ajk.o")
   public final String field1708;
   @deob.ObfuscatedName("ajk.a")
   public final class846 field1709;
   @deob.ObfuscatedName("ajk.x")
   public int field1707;

   public class256(String arg0) {
      this.field1708 = arg0;
      this.field1709 = new class846();
   }

   @deob.ObfuscatedName("ajk.n(B)I")
   public int method3447() {
      return this.field1709.field8664.field809 != this.field1709.field8664 ? ((class261)this.field1709.field8664.field809).field1747 : -1;
   }

   @deob.ObfuscatedName("ajk.k(Lajp;I)Z")
   public boolean method3443(class261 arg0) {
      boolean var2 = true;
      arg0.method1393();
      class261 var3 = (class261)this.field1709.method14944();

      while(var3 != null) {
         if (class987.method15972(arg0.field1747, var3.field1747)) {
            Statics.method14810(arg0, var3);
            ++this.field1707;
            return !var2;
         }

         var3 = (class261)this.field1709.method14929();
         var2 = false;
      }

      this.field1709.method14938(arg0);
      ++this.field1707;
      return var2;
   }

   @deob.ObfuscatedName("ajk.d(Lajp;S)Z")
   public boolean method3444(class261 arg0) {
      int var2 = this.method3447();
      arg0.method1393();
      --this.field1707;
      if (this.field1707 == 0) {
         this.method9864();
         this.method1393();
         --class987.field10502;
         class987.field10508.method10880(this, arg0.field1744);
         return false;
      } else {
         return var2 != this.method3447();
      }
   }
}
