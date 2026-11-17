import java.util.LinkedList;
import java.util.Queue;

@deob.ObfuscatedName("aec")
public class class113 extends class757 {
   @deob.ObfuscatedName("aec.p")
   private final Queue field893 = new LinkedList();

   @deob.ObfuscatedName("aec.aw(Laji;I)V")
   public void method1479(class254 arg0) {
      this.field893.add(arg0);
      if (this.field893.size() > 10) {
         this.field893.poll();
      }

   }

   @deob.ObfuscatedName("aec.o(I)V")
   protected void method1489() {
      class254 var1 = (class254)this.field893.poll();
      if (var1 != null) {
         class109 var2 = class109.method15110(class558.field4842, client.field2463.field832);
         var2.field814.method1750(this.method11251(var1, 65535));
         var2.field814.method1772(var1.method3428() << 1 | var1.method3427() & 1);
         var2.field814.method1635(var1.method1375() | var1.method1367() << 16);
         client.field2463.method1408(var2);
         var1.method1370();
      }
   }

   @deob.ObfuscatedName("aec.a(I)Z")
   protected boolean method1471() {
      return !this.field893.isEmpty() || this.field6975 < class431.method2169() - 2000L;
   }

   @deob.ObfuscatedName("aec.x(S)Ladz;")
   protected class109 method1472() {
      return class109.method15110(class558.field4879, client.field2463.field832);
   }

   @deob.ObfuscatedName("aec.al(Laen;Laji;B)V")
   private void method1473(class124 arg0, class254 arg1) {
      arg0.method1568(arg1.method3427());
   }

   @deob.ObfuscatedName("aec.r(I)I")
   protected int method1474() {
      return 1;
   }

   @deob.ObfuscatedName("aec.p(Laen;Lads;I)V")
   protected void method1475(class124 arg0, class102 arg1) {
      this.method1473(arg0, (class254)arg1);
   }
}
