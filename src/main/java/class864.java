import java.util.LinkedList;

@deob.ObfuscatedName("ul")
public class class864 {
   @deob.ObfuscatedName("ul.n")
   public static LinkedList field8811 = new LinkedList();

   private class864() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ky.n(Lagg;I)V")
   public static void method8680(class171 arg0) {
      method6228(arg0);
   }

   @deob.ObfuscatedName("nt.d(Lwk;I)V")
   public static void method10009(class917 arg0) {
      method6228(new class851(arg0));
   }

   @deob.ObfuscatedName("fc.b(Ltd;I)V")
   public static void method6228(class829 arg0) {
      while(field8811.size() > 10) {
         field8811.remove();
      }

      field8811.add(arg0);
   }
}
