@deob.ObfuscatedName("vx")
public class class903 {
   @deob.ObfuscatedName("vx.n")
   private final class612 field9227;
   @deob.ObfuscatedName("vx.k")
   private int field9228;
   @deob.ObfuscatedName("vx.d")
   private class258[] field9229;

   public class903(class801 arg0, class823 arg1, class612 arg2, boolean arg3) {
      this.field9227 = arg2;
      this.field9228 = this.field9227.method8792(class424.field3340.field3349);
      if (arg3) {
         this.field9229 = new class258[this.field9228];

         for(int var5 = 0; var5 < this.field9228; ++var5) {
            class612 var6 = this.field9227;
            byte[] var7;
            synchronized(this.field9227) {
               var7 = this.field9227.method8771(class424.field3340.field3349, var5);
            }

            class258 var9 = new class258();
            if (var7 != null) {
               var9.method3474(new class124(var7));
            }

            this.field9229[var5] = var9;
         }
      }

   }

   @deob.ObfuscatedName("vx.n(II)Lajm;")
   public class258 method15709(int arg0) {
      return arg0 < 0 ? new class258() : this.field9229[arg0];
   }
}
