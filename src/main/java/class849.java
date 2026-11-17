import java.util.Collection;
import java.util.Iterator;

@deob.ObfuscatedName("tx")
public class class849 implements Iterable, Collection {
   @deob.ObfuscatedName("tx.n")
   public class674 field8711 = new class674();
   @deob.ObfuscatedName("tx.k")
   private class674 field8712;

   public class849() {
      this.field8711.field6136 = this.field8711;
      this.field8711.field6135 = this.field8711;
   }

   @deob.ObfuscatedName("tx.n(I)V")
   public void method14958() {
      while(this.field8711.field6136 != this.field8711) {
         this.field8711.field6136.method9864();
      }

   }

   @deob.ObfuscatedName("tx.k(Lnk;B)V")
   public void method14959(class674 arg0) {
      if (arg0.field6135 != null) {
         arg0.method9864();
      }

      arg0.field6135 = this.field8711.field6135;
      arg0.field6136 = this.field8711;
      arg0.field6135.field6136 = arg0;
      arg0.field6136.field6135 = arg0;
   }

   @deob.ObfuscatedName("tx.d(Lnk;B)V")
   public void method14960(class674 arg0) {
      if (arg0.field6135 != null) {
         arg0.method9864();
      }

      arg0.field6135 = this.field8711;
      arg0.field6136 = this.field8711.field6136;
      arg0.field6135.field6136 = arg0;
      arg0.field6136.field6135 = arg0;
   }

   @deob.ObfuscatedName("ow.b(Lnk;Lnk;I)V")
   public static void method10638(class674 arg0, class674 arg1) {
      if (arg0.field6135 != null) {
         arg0.method9864();
      }

      arg0.field6135 = arg1.field6135;
      arg0.field6136 = arg1;
      arg0.field6135.field6136 = arg0;
      arg0.field6136.field6135 = arg0;
   }

   @deob.ObfuscatedName("tx.r(B)Lnk;")
   public class674 method14961() {
      class674 var1 = this.field8711.field6136;
      if (this.field8711 == var1) {
         return null;
      } else {
         var1.method9864();
         return var1;
      }
   }

   @deob.ObfuscatedName("tx.p(Ltx;Lnk;I)V")
   private void method15007(class849 arg0, class674 arg1) {
      class674 var3 = this.field8711.field6135;
      this.field8711.field6135 = arg1.field6135;
      arg1.field6135.field6136 = this.field8711;
      if (this.field8711 != arg1) {
         arg1.field6135 = arg0.field8711.field6135;
         arg1.field6135.field6136 = arg1;
         var3.field6136 = arg0.field8711;
         arg0.field8711.field6135 = var3;
      }

   }

   @deob.ObfuscatedName("tx.o(Ltx;I)V")
   public void method14963(class849 arg0) {
      if (this.field8711.field6136 != this.field8711) {
         this.method15007(arg0, this.field8711.field6136);
      }
   }

   @deob.ObfuscatedName("tx.a(B)Lnk;")
   public class674 method14964() {
      return this.method14988((class674)null);
   }

   @deob.ObfuscatedName("tx.x(Lnk;I)Lnk;")
   private class674 method14988(class674 arg0) {
      class674 var2;
      if (arg0 == null) {
         var2 = this.field8711.field6136;
      } else {
         var2 = arg0;
      }

      if (this.field8711 == var2) {
         this.field8712 = null;
         return null;
      } else {
         this.field8712 = var2.field6136;
         return var2;
      }
   }

   @deob.ObfuscatedName("tx.s(I)Lnk;")
   public class674 method14976() {
      return this.method14966((class674)null);
   }

   @deob.ObfuscatedName("tx.l(Lnk;I)Lnk;")
   private class674 method14966(class674 arg0) {
      class674 var2;
      if (arg0 == null) {
         var2 = this.field8711.field6135;
      } else {
         var2 = arg0;
      }

      if (this.field8711 == var2) {
         this.field8712 = null;
         return null;
      } else {
         this.field8712 = var2.field6135;
         return var2;
      }
   }

   @deob.ObfuscatedName("tx.u(I)Lnk;")
   public class674 method15006() {
      class674 var1 = this.field8712;
      if (this.field8711 == var1) {
         this.field8712 = null;
         return null;
      } else {
         this.field8712 = var1.field6136;
         return var1;
      }
   }

   @deob.ObfuscatedName("tx.v(B)Lnk;")
   public class674 method15010() {
      class674 var1 = this.field8712;
      if (this.field8711 == var1) {
         this.field8712 = null;
         return null;
      } else {
         this.field8712 = var1.field6135;
         return var1;
      }
   }

   @deob.ObfuscatedName("tx.g(I)I")
   public int method14972() {
      int var1 = 0;

      for(class674 var2 = this.field8711.field6136; this.field8711 != var2; var2 = var2.field6136) {
         ++var1;
      }

      return var1;
   }

   @deob.ObfuscatedName("tx.h(I)Z")
   public boolean method15024() {
      return this.field8711.field6136 == this.field8711;
   }

   @deob.ObfuscatedName("tx.e(S)[Lnk;")
   private class674[] method14969() {
      class674[] var1 = new class674[this.method14972()];
      int var2 = 0;

      for(class674 var3 = this.field8711.field6136; this.field8711 != var3; var3 = var3.field6136) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class844(this);
   }

   public int size() {
      return this.method14972();
   }

   public boolean isEmpty() {
      return this.method15024();
   }

   public boolean contains(Object arg0) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method14969();
   }

   public Object[] toArray(Object[] arg0) {
      int var2 = 0;

      for(class674 var3 = this.field8711.field6136; this.field8711 != var3; var3 = var3.field6136) {
         arg0[var2++] = var3;
      }

      return arg0;
   }

   @deob.ObfuscatedName("tx.z(Lnk;B)Z")
   private boolean method14973(class674 arg0) {
      this.method14959(arg0);
      return true;
   }

   public boolean remove(Object arg0) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection arg0) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection arg0) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection arg0) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection arg0) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method14958();
   }

   public boolean add(Object arg0) {
      return this.method14973((class674)arg0);
   }

   public boolean equals(Object arg0) {
      return super.equals(arg0);
   }

   public int hashCode() {
      return super.hashCode();
   }
}
