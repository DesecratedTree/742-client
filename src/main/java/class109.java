import net.ClientPacket;

@deob.ObfuscatedName("adz")
public class class109 extends class674 {
   @deob.ObfuscatedName("adz.a")
   private static class109[] field812 = new class109[300];
   @deob.ObfuscatedName("adz.x")
   private static int field817 = 0;
   @deob.ObfuscatedName("adz.r")
   public int field813;
   @deob.ObfuscatedName("adz.p")
   public int field816;
   @deob.ObfuscatedName("adz.o")
   public class251 field814;
   @deob.ObfuscatedName("adz.b")
   public ClientPacket field815;

   private class109() {
   }

   @deob.ObfuscatedName("qh.n(B)Ladz;")
   public static class109 method11180() {
      return field817 == 0 ? new class109() : field812[--field817];
   }

   @deob.ObfuscatedName("uf.k(Ljc;Lut;I)Ladz;")
   public static class109 method15110(ClientPacket arg0, class872 arg1) {
      class109 var2 = method11180();
      var2.field815 = arg0;
      var2.field813 = arg0.size;
      if (var2.field813 == -1) {
         var2.field814 = new class251(260);
      } else if (var2.field813 == -2) {
         var2.field814 = new class251(10000);
      } else if (var2.field813 <= 18) {
         var2.field814 = new class251(20);
      } else if (var2.field813 <= 98) {
         var2.field814 = new class251(100);
      } else {
         var2.field814 = new class251(260);
      }

      var2.field814.method3384(arg1);
      var2.field814.method3385(var2.field815.getOpcode());
      var2.field816 = 0;
      return var2;
   }

   @deob.ObfuscatedName("adz.b(I)V")
   public void method1398() {
      if (field817 < field812.length) {
         field812[++field817 - 1] = this;
      }
   }
}
