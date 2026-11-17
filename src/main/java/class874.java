import java.util.Iterator;

@deob.ObfuscatedName("uv")
public class class874 implements Iterator {
   @deob.ObfuscatedName("uv.b")
   private class674 field8855 = null;
   @deob.ObfuscatedName("uv.n")
   private class875 field8856;
   @deob.ObfuscatedName("uv.d")
   private int field8858;
   @deob.ObfuscatedName("uv.k")
   private class674 field8857;

   public class874(class875 arg0) {
      this.field8856 = arg0;
      this.method15301();
   }

   @deob.ObfuscatedName("uv.o(B)V")
   private void method15301() {
      this.field8857 = this.field8856.field8860[0].field6136;
      this.field8858 = 1;
      this.field8855 = null;
   }

   @deob.ObfuscatedName("uv.a(I)Lnk;")
   public class674 method15293() {
      this.method15301();
      return (class674)this.next();
   }

   public Object next() {
      if (this.field8856.field8860[this.field8858 - 1] != this.field8857) {
         class674 var1 = this.field8857;
         this.field8857 = var1.field6136;
         this.field8855 = var1;
         return var1;
      } else {
         class674 var2;
         do {
            if (this.field8858 >= this.field8856.field8862) {
               return null;
            }

            var2 = this.field8856.field8860[++this.field8858 - 1].field6136;
         } while(this.field8856.field8860[this.field8858 - 1] == var2);

         this.field8857 = var2.field6136;
         this.field8855 = var2;
         return var2;
      }
   }

   public boolean hasNext() {
      if (this.field8856.field8860[this.field8858 - 1] != this.field8857) {
         return true;
      } else {
         while(this.field8858 < this.field8856.field8862) {
            if (this.field8856.field8860[++this.field8858 - 1].field6136 != this.field8856.field8860[this.field8858 - 1]) {
               this.field8857 = this.field8856.field8860[this.field8858 - 1].field6136;
               return true;
            }

            this.field8857 = this.field8856.field8860[this.field8858 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field8855 == null) {
         throw new IllegalStateException();
      } else {
         this.field8855.method9864();
         this.field8855 = null;
      }
   }
}
