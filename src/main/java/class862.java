@deob.ObfuscatedName("uj")
public class class862 {
   @deob.ObfuscatedName("uj.n")
   public Object field8800;
   @deob.ObfuscatedName("uj.k")
   public Object field8801;

   public class862(Object arg0, Object arg1) {
      this.field8800 = arg0;
      this.field8801 = arg1;
   }

   public String toString() {
      return this.field8800 + ", " + this.field8801;
   }

   public boolean equals(Object arg0) {
      if (arg0 != null && arg0 instanceof class862) {
         class862 var2 = (class862)arg0;
         if (this.field8800 == null) {
            if (var2.field8800 != null) {
               return false;
            }
         } else if (!this.field8800.equals(var2.field8800)) {
            return false;
         }

         if (this.field8801 == null) {
            if (var2.field8801 != null) {
               return false;
            }
         } else if (!this.field8801.equals(var2.field8801)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field8800 != null) {
         var1 += this.field8800.hashCode();
      }

      if (this.field8801 != null) {
         var1 += 31 * this.field8801.hashCode();
      }

      return var1;
   }
}
