@deob.ObfuscatedName("rb")
public class class773 {
   @deob.ObfuscatedName("rb.n")
   private final class723 field7124;
   @deob.ObfuscatedName("rb.k")
   private final int field7123;

   public class773(class723 arg0, int arg1) {
      this.field7124 = arg0;
      this.field7123 = arg1;
   }

   @deob.ObfuscatedName("rb.n(I)Laln;")
   public class309 method11585() {
      class79 var1 = (class79)client.field2576.method15322((long)(this.field7124.field6675 << 28 | this.field7124.field6677 << 14 | this.field7124.field6676));
      if (var1 == null) {
         return null;
      } else {
         class723 var2 = client.field2468.method9649();
         int var3 = this.field7124.field6676 - var2.field6676;
         int var4 = this.field7124.field6677 - var2.field6677;
         if (var3 >= 0 && var4 >= 0 && var3 < client.field2468.method9648() && var4 < client.field2468.method9604()) {
            for(class62 var5 = (class62)var1.field569.method14964(); var5 != null; var5 = (class62)var1.field569.method15006()) {
               if (this.field7123 == var5.field442) {
                  return (class309)client.field2468.method9639().method10513(this.field7124.field6675, var3, var4);
               }
            }
         }

         return null;
      }
   }
}
