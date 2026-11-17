@deob.ObfuscatedName("ok")
public class class701 {
   @deob.ObfuscatedName("ok.n")
   public int field6465;
   @deob.ObfuscatedName("ok.k")
   public int[] field6466;
   @deob.ObfuscatedName("ok.d")
   public int[] field6464;

   public class701(int arg0) {
      this.field6465 = arg0;
      this.field6466 = new int[this.field6465];
      this.field6464 = new int[this.field6465];
   }

   @deob.ObfuscatedName("su.n(Llc;Ljava/lang/String;ZI)Lok;")
   public static class701 method14491(class612 arg0, String arg1, boolean arg2) {
      int var3 = arg0.method8786(arg1);
      if (var3 == -1) {
         return new class701(0);
      } else {
         int[] var4 = arg0.method8780(var3);
         class701 var5 = new class701(var4.length);
         int var6 = 0;
         int var7 = 0;

         while(true) {
            while(var6 < var5.field6465) {
               class124 var8 = new class124(arg0.method8771(var3, var4[var7++]));
               int var9 = var8.method1591();
               int var10 = var8.method1587();
               int var11 = var8.method1688();
               if (!arg2 && var11 == 1) {
                  --var5.field6465;
               } else {
                  var5.field6466[var6] = var9;
                  var5.field6464[var6] = var10;
                  ++var6;
               }
            }

            return var5;
         }
      }
   }
}
