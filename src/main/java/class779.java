@deob.ObfuscatedName("rh")
public class class779 {
   @deob.ObfuscatedName("rh.n")
   private final class723 field7151;
   @deob.ObfuscatedName("rh.k")
   private final int field7150;
   @deob.ObfuscatedName("rh.d")
   private final int field7149;

   public class779(class723 arg0, int arg1, int arg2, int arg3) {
      this.field7151 = arg0;
      this.field7150 = arg1;
      this.field7149 = arg3;
   }

   @deob.ObfuscatedName("rh.n(I)I")
   private int method11681() {
      return client.field2474[this.field7150];
   }

   @deob.ObfuscatedName("rh.k(B)Lcr;")
   public class376 method11682() {
      class376 var1 = this.method11683();
      if (var1 == null) {
         return null;
      } else {
         return var1.method5093() != this.field7149 ? null : var1;
      }
   }

   @deob.ObfuscatedName("rh.d(B)Lcr;")
   private class376 method11683() {
      int var1 = this.field7151.field6675;
      class723 var2 = client.field2468.method9649();
      int var3 = this.field7151.field6676 - var2.field6676;
      int var4 = this.field7151.field6677 - var2.field6677;
      if (var3 >= 0 && var4 >= 0 && var3 < client.field2468.method9648() && var4 < client.field2468.method9604()) {
         switch(this.method11681()) {
         case 0:
            return (class376)client.field2468.method9639().method10510(var1, var3, var4);
         case 1:
            return (class376)client.field2468.method9639().method10577(var1, var3, var4);
         case 2:
            return (class376)client.field2468.method9639().method10514(var1, var3, var4, client.field2704);
         case 3:
            return (class376)client.field2468.method9639().method10516(var1, var3, var4);
         default:
            return null;
         }
      } else {
         return null;
      }
   }
}
