import java.awt.Canvas;

@deob.ObfuscatedName("av")
public class class326 {
   @deob.ObfuscatedName("av.d")
   private static class849 field2070 = new class849();

   private class326() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("wo.n(Lra;Lem;I)V")
   public static void method15866(class772 arg0, class425 arg1) {
      boolean var2 = Statics.field4196.method15523(arg0, arg1.field3539, arg1.field3540, arg1.field3436, -16777216 | arg1.field3376, arg1.field3459, arg1.field3541 ? Statics.field5701.field1386 : null) == null;
      if (var2) {
         field2070.method14959(new class78(arg1.field3539, arg1.field3540, arg1.field3436, -16777216 | arg1.field3376, arg1.field3459, arg1.field3541));
         client.method7309(arg1);
      }

   }

   @deob.ObfuscatedName("aff.k(Lra;B)V")
   public static void method2098(class772 arg0) {
      if (field2070.method14972() != 0) {
         if (Statics.field9361.field974.method2236() == 0) {
            for(class78 var1 = (class78)field2070.method14964(); var1 != null; var1 = (class78)field2070.method15006()) {
               Statics.field4196.method15524(arg0, arg0, var1.field566, var1.field565, var1.field563, var1.field564, false, false, var1.field567, Statics.field5483, var1.field568 ? Statics.field5701.field1386 : null);
               var1.method9864();
            }

            client.method208();
         } else {
            if (Statics.field2069 == null) {
               Canvas var2 = new Canvas();
               var2.setSize(36, 32);
               Statics.field2069 = class772.method10665(0, var2, Statics.field6508, Statics.field6375, 0);
               Statics.field2068 = Statics.field2069.method7606(class883.method2003(Statics.field4891, Statics.field7091, 0), (class998[])((class998[])class375.method5064(Statics.field6723, Statics.field7091, 0)), true);
            }

            for(class78 var3 = (class78)field2070.method14964(); var3 != null; var3 = (class78)field2070.method15006()) {
               Statics.field4196.method15524(Statics.field2069, arg0, var3.field566, var3.field565, var3.field563, var3.field564, false, false, var3.field567, Statics.field2068, var3.field568 ? Statics.field5701.field1386 : null);
               var3.method9864();
            }
         }

      }
   }
}
