import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@deob.ObfuscatedName("aep")
public class class126 extends IcmpService {
   @deob.ObfuscatedName("aep.k")
   private final List field945 = new ArrayList();

   @deob.ObfuscatedName("op.r(Lrt;I)V")
   public static void method10371(class791 arg0) {
      if (Statics.field944 == null) {
         throw new IllegalStateException("");
      } else {
         Statics.field944.field945.add(arg0);
      }
   }

   @deob.ObfuscatedName("mu.o(I)V")
   public static void method9504() {
      if (Statics.field944 != null) {
         try {
            Statics.field944.quit();
         } catch (Throwable var1) {
         }

         Statics.field944 = null;
      }
   }

   protected void notify(int arg0) {
      Iterator var2 = this.field945.iterator();

      while(var2.hasNext()) {
         class791 var3 = (class791)var2.next();
         var3.method11089(arg0 == 0);
      }

   }

   protected void notify(int arg0, int arg1, int arg2) {
      Iterator var4 = this.field945.iterator();

      while(var4.hasNext()) {
         class791 var5 = (class791)var4.next();
         var5.method11091(arg0, arg1, arg2);
      }

   }
}
