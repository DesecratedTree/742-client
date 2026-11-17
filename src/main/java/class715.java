import java.util.Stack;

@deob.ObfuscatedName("oy")
public class class715 {
   @deob.ObfuscatedName("oy.n")
   public static Stack field6634 = new Stack();
   @deob.ObfuscatedName("oy.k")
   public class134 field6632;
   @deob.ObfuscatedName("oy.b")
   public class693 field6631;
   @deob.ObfuscatedName("oy.d")
   public boolean field6633;

   private class715() {
   }

   @deob.ObfuscatedName("uv.n(ZI)Loy;")
   public static class715 method15306(boolean arg0) {
      Stack var1 = field6634;
      synchronized(field6634) {
         class715 var2;
         if (field6634.isEmpty()) {
            var2 = new class715();
         } else {
            var2 = (class715)field6634.pop();
         }

         var2.field6633 = arg0;
         return var2;
      }
   }

   @deob.ObfuscatedName("oy.b(Lra;III)Z")
   public boolean method10645(class772 arg0, int arg1, int arg2) {
      int var4 = this.field6632.method2021();
      if (this.field6632.field1036 != null) {
         for(int var5 = 0; var5 < this.field6632.field1036.length; ++var5) {
            this.field6632.field1036[var5].field2901 <<= var4;
            if (this.field6632.field1036[var5].method5395(this.field6631.field6350 + arg1, this.field6631.field6352 + arg2) && this.field6632.method2027(arg0, arg1, arg2)) {
               this.field6632.field1036[var5].field2901 >>= var4;
               return true;
            }

            this.field6632.field1036[var5].field2901 >>= var4;
         }
      }

      return false;
   }
}
