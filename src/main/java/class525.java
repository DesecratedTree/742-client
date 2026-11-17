import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@deob.ObfuscatedName("ie")
public class class525 implements Iterator {
   @deob.ObfuscatedName("ie.k")
   private int field4153 = 0;
   @deob.ObfuscatedName("ie.n")
   private class284 field4154;
   @deob.ObfuscatedName("ie.d")
   private int field4155 = this.field4154.field1849;

   public class525(class284 arg0) {
      this.field4154 = arg0;
   }

   public boolean hasNext() {
      return this.field4153 < this.field4154.field1848;
   }

   public Object next() {
      if (this.field4154.field1849 != this.field4155) {
         throw new ConcurrentModificationException();
      } else if (this.field4153 < this.field4154.field1848) {
         Object var1 = this.field4154.field1845[this.field4153].field4334;
         ++this.field4153;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
