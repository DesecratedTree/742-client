import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@deob.ObfuscatedName("akl")
public class class284 extends AbstractQueue {
   @deob.ObfuscatedName("akl.r")
   public int field1849;
   @deob.ObfuscatedName("akl.n")
   public class541[] field1845;
   @deob.ObfuscatedName("akl.k")
   private Map field1846;
   @deob.ObfuscatedName("akl.b")
   private final Comparator field1847;
   @deob.ObfuscatedName("akl.d")
   public int field1848;

   private class284(int arg0, Comparator arg1) {
      this.field1849 = 0;
      this.field1845 = new class541[arg0];
      this.field1846 = new HashMap();
      this.field1847 = arg1;
   }

   public class284(int arg0) {
      this(arg0, (Comparator)null);
   }

   @deob.ObfuscatedName("akl.n(I)V")
   private void method3636() {
      int var1 = (this.field1845.length << 1) + 1;
      this.field1845 = (class541[])((class541[])Arrays.copyOf(this.field1845, var1));
   }

   public int size() {
      return this.field1848;
   }

   public boolean offer(Object arg0) {
      if (this.field1846.containsKey(arg0)) {
         throw new IllegalArgumentException("");
      } else {
         ++this.field1849;
         int var2 = this.field1848;
         if (var2 >= this.field1845.length) {
            this.method3636();
         }

         ++this.field1848;
         if (var2 == 0) {
            this.field1845[0] = new class541(arg0, 0);
            this.field1846.put(arg0, this.field1845[0]);
         } else {
            this.field1845[var2] = new class541(arg0, var2);
            this.field1846.put(arg0, this.field1845[var2]);
            this.method3639(var2);
         }

         return true;
      }
   }

   public Object peek() {
      return this.field1848 == 0 ? null : this.field1845[0].field4334;
   }

   public Object poll() {
      if (this.field1848 == 0) {
         return null;
      } else {
         ++this.field1849;
         Object var1 = this.field1845[0].field4334;
         this.field1846.remove(var1);
         --this.field1848;
         if (this.field1848 == 0) {
            this.field1845[this.field1848] = null;
         } else {
            this.field1845[0] = this.field1845[this.field1848];
            this.field1845[0].field4333 = 0;
            this.field1845[this.field1848] = null;
            this.method3640(0);
         }

         return var1;
      }
   }

   public boolean remove(Object arg0) {
      class541 var2 = (class541)this.field1846.remove(arg0);
      if (var2 == null) {
         return false;
      } else {
         ++this.field1849;
         --this.field1848;
         if (this.field1848 == var2.field4333) {
            this.field1845[this.field1848] = null;
            return true;
         } else {
            class541 var3 = this.field1845[this.field1848];
            this.field1845[this.field1848] = null;
            this.field1845[var2.field4333] = var3;
            this.field1845[var2.field4333].field4333 = var2.field4333;
            this.method3640(var2.field4333);
            if (this.field1845[var2.field4333] == var3) {
               this.method3639(var2.field4333);
            }

            return true;
         }
      }
   }

   @deob.ObfuscatedName("akl.k(II)V")
   private void method3639(int arg0) {
      class541 var2 = this.field1845[arg0];

      while(arg0 > 0) {
         int var3 = arg0 - 1 >>> 1;
         class541 var4 = this.field1845[var3];
         if (this.field1847 != null) {
            if (this.field1847.compare(var2.field4334, var4.field4334) >= 0) {
               break;
            }
         } else if (((Comparable)var2.field4334).compareTo(var4.field4334) >= 0) {
            break;
         }

         this.field1845[arg0] = var4;
         this.field1845[arg0].field4333 = arg0;
         arg0 = var3;
      }

      this.field1845[arg0] = var2;
      this.field1845[arg0].field4333 = arg0;
   }

   @deob.ObfuscatedName("akl.d(IB)V")
   private void method3640(int arg0) {
      class541 var2 = this.field1845[arg0];
      int var3 = this.field1848 >>> 1;

      while(arg0 < var3) {
         int var4 = (arg0 << 1) + 1;
         class541 var5 = this.field1845[var4];
         int var6 = (arg0 << 1) + 2;
         class541 var7 = this.field1845[var6];
         int var8;
         if (this.field1847 != null) {
            if (var6 < this.field1848 && this.field1847.compare(var5.field4334, var7.field4334) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field1848 && ((Comparable)var5.field4334).compareTo(var7.field4334) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field1847 != null) {
            if (this.field1847.compare(var2.field4334, this.field1845[var8].field4334) <= 0) {
               break;
            }
         } else if (((Comparable)var2.field4334).compareTo(this.field1845[var8].field4334) <= 0) {
            break;
         }

         this.field1845[arg0] = this.field1845[var8];
         this.field1845[arg0].field4333 = arg0;
         arg0 = var8;
      }

      this.field1845[arg0] = var2;
      this.field1845[arg0].field4333 = arg0;
   }

   public boolean contains(Object arg0) {
      return this.field1846.containsKey(arg0);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.field1847 != null) {
         Arrays.sort(var1, this.field1847);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new class525(this);
   }
}
