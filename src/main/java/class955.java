@deob.ObfuscatedName("xv")
public class class955 extends class643 implements Runnable {
   public void run() {
      this.field5810 = true;

      try {
         while(!this.field5811) {
            for(int var1 = 0; var1 < 2; ++var1) {
               class646 var2 = this.field5812[var1];
               if (var2 != null) {
                  var2.method9294();
               }
            }

            Statics.method14813(10L);
            class671.method9492((Object)null);
         }
      } catch (Exception var7) {
         class285.method15864((String)null, var7);
      } finally {
         this.field5810 = false;
      }

   }
}
