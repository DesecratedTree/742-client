import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@deob.ObfuscatedName("oc")
public class class693 {
   @deob.ObfuscatedName("oc.n")
   public List field6351 = new LinkedList();
   @deob.ObfuscatedName("oc.k")
   public boolean field6353 = false;
   @deob.ObfuscatedName("oc.d")
   public int field6350 = 0;
   @deob.ObfuscatedName("oc.b")
   public int field6352 = 0;

   public class693(boolean arg0) {
      this.field6353 = arg0;
   }

   @deob.ObfuscatedName("oc.n(I)V")
   public void method10136() {
      Iterator var1 = this.field6351.iterator();

      while(var1.hasNext()) {
         class715 var2 = (class715)var1.next();
         var1.remove();
         Statics.method9134(var2);
      }

   }

   @deob.ObfuscatedName("oc.k(Loy;B)V")
   public void method10135(class715 arg0) {
      class134 var2 = arg0.field6632;
      boolean var3 = true;
      class394[] var4 = arg0.field6632.field1036;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         if (var4[var5].field2896) {
            var3 = false;
            break;
         }
      }

      if (!var3) {
         arg0.field6631 = this;
         if (this.field6353) {
            Iterator var6 = this.field6351.iterator();

            while(var6.hasNext()) {
               class715 var7 = (class715)var6.next();
               if (var7.field6632 == var2) {
                  var6.remove();
                  Statics.method9134(var7);
               }
            }
         }

         ListIterator var8 = this.field6351.listIterator();

         class715 var9;
         do {
            if (!var8.hasNext()) {
               this.field6351.add(arg0);
               return;
            }

            var9 = (class715)var8.next();
         } while(var2.field9959 < var9.field6632.field9959);

         var8.previous();
         var8.add(arg0);
      }
   }
}
