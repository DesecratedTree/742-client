import java.util.Iterator;

@deob.ObfuscatedName("qm")
public abstract class class757 {
   @deob.ObfuscatedName("qm.n")
   private final class849 field6974 = new class849();
   @deob.ObfuscatedName("qm.k")
   private long field6973 = -1L;
   @deob.ObfuscatedName("qm.d")
   protected long field6975 = -1L;
   @deob.ObfuscatedName("qm.b")
   private int field6976 = -1;
   @deob.ObfuscatedName("qm.r")
   private int field6977 = -1;

   @deob.ObfuscatedName("qm.n(B)V")
   public void method11253() {
      if (this.method1471()) {
         class109 var1 = null;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         Iterator var5 = this.field6974.iterator();

         label102:
         while(true) {
            while(true) {
               if (!var5.hasNext()) {
                  break label102;
               }

               class102 var6 = (class102)var5.next();
               if (var1 != null && var1.field814.field935 - var2 >= 252 - (6 + this.method1474())) {
                  break label102;
               }

               var6.method9864();
               int var7 = var6.method1367();
               if (var7 < -1) {
                  var7 = -1;
               } else if (var7 > 65534) {
                  var7 = 65534;
               }

               int var8 = var6.method1375();
               if (var8 < -1) {
                  var8 = -1;
               } else if (var8 > 65534) {
                  var8 = 65534;
               }

               if (this.field6976 == var8 && this.field6977 == var7) {
                  var6.method1370();
               } else {
                  if (var1 == null) {
                     var1 = this.method1472();
                     var1.field814.method1568(0);
                     var2 = var1.field814.field935;
                     var1.field814.field935 += 2;
                     var3 = 0;
                     var4 = 0;
                  }

                  int var9;
                  int var10;
                  int var11;
                  if (this.field6975 != -1L) {
                     var9 = var8 - this.field6976;
                     var10 = var7 - this.field6977;
                     var11 = (int)((var6.method1377() - this.field6975) / 20L);
                     var3 = (int)((long)var3 + (var6.method1377() - this.field6975) % 20L);
                  } else {
                     var9 = var8;
                     var10 = var7;
                     var11 = Integer.MAX_VALUE;
                  }

                  this.field6976 = var8;
                  this.field6977 = var7;
                  if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                     var9 += 32;
                     var10 += 32;
                     var1.field814.method1569((var9 << 6) + (var11 << 12) + var10);
                  } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                     var9 += 128;
                     var10 += 128;
                     var1.field814.method1568(var11 + 128);
                     var1.field814.method1569((var9 << 8) + var10);
                  } else if (var11 < 32) {
                     var1.field814.method1568(var11 + 192);
                     if (var8 != -1 && var7 != -1) {
                        var1.field814.method1572(var8 | var7 << 16);
                     } else {
                        var1.field814.method1572(Integer.MIN_VALUE);
                     }
                  } else {
                     var1.field814.method1569((var11 & 8191) + 57344);
                     if (var8 != -1 && var7 != -1) {
                        var1.field814.method1572(var8 | var7 << 16);
                     } else {
                        var1.field814.method1572(Integer.MIN_VALUE);
                     }
                  }

                  ++var4;
                  this.method1475(var1.field814, var6);
                  this.field6975 = var6.method1377();
                  var6.method1370();
               }
            }
         }

         if (var1 != null) {
            var1.field814.method1664(var1.field814.field935 - var2);
            int var12 = var1.field814.field935;
            var1.field814.field935 = var2;
            var1.field814.method1568(var3 / var4);
            var1.field814.method1568(var3 % var4);
            var1.field814.field935 = var12;
            client.field2463.method1408(var1);
         }
      }

      this.method1489();
   }

   @deob.ObfuscatedName("qm.k(I)V")
   public void method11254() {
      this.field6974.method14958();
      this.field6973 = -1L;
      this.field6975 = -1L;
      this.field6976 = -1;
      this.field6977 = -1;
   }

   @deob.ObfuscatedName("qm.d(Lads;I)V")
   public void method11250(class102 arg0) {
      this.field6974.method14959(arg0);
   }

   @deob.ObfuscatedName("qm.b(Lads;IB)I")
   protected int method11251(class102 arg0, int arg1) {
      long var3;
      if (this.field6973 == -1L) {
         var3 = (long)arg1;
      } else {
         var3 = arg0.method1377() - this.field6973;
         if (var3 > (long)arg1) {
            var3 = (long)arg1;
         }
      }

      this.field6973 = arg0.method1377();
      return (int)var3;
   }

   @deob.ObfuscatedName("qm.r(I)I")
   protected abstract int method1474();

   @deob.ObfuscatedName("qm.o(I)V")
   protected abstract void method1489();

   @deob.ObfuscatedName("qm.a(I)Z")
   protected abstract boolean method1471();

   @deob.ObfuscatedName("qm.x(S)Ladz;")
   protected abstract class109 method1472();

   @deob.ObfuscatedName("qm.p(Laen;Lads;I)V")
   protected abstract void method1475(class124 arg0, class102 arg1);
}
