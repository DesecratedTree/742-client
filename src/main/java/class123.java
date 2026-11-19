import net.ClientProt;

@deob.ObfuscatedName("aem")
public class class123 extends class757 {
   @deob.ObfuscatedName("aem.o(I)V")
   protected void method1489() {
      class102 var1 = this.method1564();
      if (var1 != null) {
         int var2 = this.method11251(var1, 32767);
         int var3 = var1.method1367();
         if (var3 < 0) {
            var3 = 0;
         } else if (var3 > 65535) {
            var3 = 65535;
         }

         int var4 = var1.method1375();
         if (var4 < 0) {
            var4 = 0;
         } else if (var4 > 65535) {
            var4 = 65535;
         }

         byte var5 = 0;
         if (var1.method1365() == 2) {
            var5 = 1;
         }

         class109 var6 = class109.method15110(ClientProt.EVENT_MOUSE_CLICK, client.field2463.field832);
         var6.field814.method1569(var2 | var5 << 15);
         var6.field814.method1572(var4 | var3 << 16);
         client.field2463.method1408(var6);
      }

   }

   @deob.ObfuscatedName("aem.a(I)Z")
   protected boolean method1471() {
      return this.method1564() != null || this.field6975 < class431.method2169() - 2000L;
   }

   @deob.ObfuscatedName("aem.aw(I)Lads;")
   private class102 method1564() {
      return (class102)client.field2434.method14964();
   }

   @deob.ObfuscatedName("aem.x(S)Ladz;")
   protected class109 method1472() {
      return class109.method15110(ClientProt.EVENT_MOUSE_MOVE, client.field2463.field832);
   }

   @deob.ObfuscatedName("aem.p(Laen;Lads;I)V")
   protected void method1475(class124 arg0, class102 arg1) {
   }

   @deob.ObfuscatedName("aem.r(I)I")
   protected int method1474() {
      return 0;
   }
}
