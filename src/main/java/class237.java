@deob.ObfuscatedName("ais")
public class class237 extends class89 {
   @deob.ObfuscatedName("ais.x")
   private static class633 field1599 = new class633(64, class628.field5708);
   @deob.ObfuscatedName("ais.l")
   private final class849 field1601 = new class849();
   @deob.ObfuscatedName("ais.u")
   private int field1602 = 0;
   @deob.ObfuscatedName("ais.g")
   private int field1598 = 256;
   @deob.ObfuscatedName("ais.h")
   private int field1607 = 256;
   @deob.ObfuscatedName("ais.s")
   private final int field1605;
   @deob.ObfuscatedName("ais.v")
   private int field1603;
   @deob.ObfuscatedName("ais.z")
   private boolean field1600;
   @deob.ObfuscatedName("ais.e")
   private boolean field1606;

   public class237(int arg0) {
      this.field1605 = arg0;
   }

   @deob.ObfuscatedName("ais.ak(II)V")
   public void method3327(int arg0) {
      this.field1598 = arg0;
      this.field1607 = arg0;
   }

   @deob.ObfuscatedName("ais.p([III)V")
   public synchronized void method1244(int[] arg0, int arg1, int arg2) {
      if (!this.field1600) {
         if (this.method3319() == null) {
            if (this.field1606) {
               this.method9864();
               field1599.method9155();
            }

         } else {
            int var4 = arg1 + arg2;
            if (Statics.field5844) {
               var4 <<= 1;
            }

            byte var5 = 0;
            byte var6 = 0;
            if (this.field1605 == 2) {
               var6 = 1;
            }

            while(arg1 < var4) {
               class100 var7 = this.method3319();
               if (var7 == null) {
                  return;
               }

               short[][] var8 = var7.field775;

               while(arg1 < var4 && this.field1603 < var8[0].length) {
                  if (Statics.field5844) {
                     arg0[arg1++] = this.field1598 * var8[var5][this.field1603];
                     arg0[arg1++] = this.field1607 * var8[var6][this.field1603];
                  } else {
                     int var10001 = arg1++;
                     arg0[var10001] += this.field1607 * var8[var6][this.field1603] + this.field1598 * var8[var5][this.field1603];
                  }

                  ++this.field1603;
               }

               if (this.field1603 >= var8[0].length) {
                  this.method3320();
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("ais.o(I)V")
   public synchronized void method1254(int arg0) {
      if (!this.field1600) {
         while(true) {
            class100 var2 = this.method3319();
            if (var2 == null) {
               if (this.field1606) {
                  this.method9864();
                  field1599.method9155();
               }

               return;
            }

            if (var2.field775[0].length - this.field1603 > arg0) {
               this.field1603 += arg0;
               return;
            }

            arg0 -= var2.field775[0].length - this.field1603;
            this.method3320();
         }
      }
   }

   @deob.ObfuscatedName("ais.aa(I)I")
   public synchronized int method3318() {
      return this.field1602;
   }

   @deob.ObfuscatedName("ais.ao(I)Ladq;")
   private synchronized class100 method3319() {
      return (class100)this.field1601.method14964();
   }

   @deob.ObfuscatedName("ais.ab(I)V")
   private synchronized void method3320() {
      class100 var1 = this.method3319();
      if (var1 != null) {
         var1.method9864();
         this.field1603 = 0;
         --this.field1602;
         field1599.method9141(var1.method1344(), var1);
      }
   }

   @deob.ObfuscatedName("ais.ae(ID)Ladq;")
   public class100 method3321(int arg0, double arg1) {
      long var4 = (long)(this.field1605 << 32 | arg0);
      class100 var6 = (class100)field1599.method9140(var4);
      if (var6 != null) {
         var6.field774 = arg1;
         field1599.method9151(var4);
      } else {
         var6 = new class100(new short[this.field1605][arg0], arg1);
      }

      return var6;
   }

   @deob.ObfuscatedName("ais.az(Ladq;I)V")
   public synchronized void method3329(class100 arg0) {
      while(this.field1602 >= 100) {
         this.field1601.method14961();
         --this.field1602;
      }

      this.field1601.method14959(arg0);
      ++this.field1602;
   }

   @deob.ObfuscatedName("ais.aq(B)D")
   public synchronized double method3317() {
      if (this.field1602 < 1) {
         return -1.0D;
      } else {
         class100 var1 = (class100)this.field1601.method14964();
         return var1 == null ? -1.0D : var1.field774 - (double)((float)var1.field775[0].length / (float)Statics.field5854);
      }
   }

   @deob.ObfuscatedName("ais.ar(I)V")
   public synchronized void method3322() {
      this.field1606 = true;
   }

   @deob.ObfuscatedName("ais.as(ZI)V")
   public synchronized void method3323(boolean arg0) {
      this.field1600 = arg0;
   }

   @deob.ObfuscatedName("ais.b()I")
   public int method1246() {
      return 1;
   }

   @deob.ObfuscatedName("ais.d()Ladf;")
   public class89 method1245() {
      return null;
   }

   @deob.ObfuscatedName("ais.k()Ladf;")
   public class89 method1257() {
      return null;
   }
}
