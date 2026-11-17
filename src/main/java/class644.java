import java.util.Iterator;
import java.util.LinkedList;

@deob.ObfuscatedName("mh")
public class class644 {
   @deob.ObfuscatedName("mh.n")
   private static LinkedList field5814 = new LinkedList();

   private class644() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("pq.n(B)V")
   public static void method10852() {
      int var0 = field5814.size();
      Iterator var1 = field5814.iterator();

      while(var1.hasNext()) {
         class86 var2 = (class86)var1.next();
         var2.method1168(var2.method1175() + var2.method1204() / (var0 * 2));
         if (!var2.method1176()) {
            var1.remove();
         }
      }

   }

   @deob.ObfuscatedName("fq.k(Ladc;I)V")
   public static void method6473(class86 arg0) {
      if (!field5814.contains(arg0)) {
         field5814.add(arg0);
      }

   }
}
