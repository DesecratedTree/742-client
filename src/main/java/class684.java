import java.util.Iterator;
import java.util.LinkedList;

@deob.ObfuscatedName("nu")
public class class684 {
   @deob.ObfuscatedName("nu.n")
   private static int field6197 = 0;
   @deob.ObfuscatedName("nu.k")
   private final int field6196;
   @deob.ObfuscatedName("nu.d")
   private final int field6200;
   @deob.ObfuscatedName("nu.b")
   private final int[] field6199;
   @deob.ObfuscatedName("nu.r")
   private final int[] field6198;
   @deob.ObfuscatedName("nu.p")
   private LinkedList field6201;

   public class684(class772 arg0, class124 arg1, int arg2) {
      this.field6196 = arg2;
      this.field6200 = arg1.method1603();
      this.field6199 = new int[this.field6200];
      this.field6198 = new int[this.field6200];
      int var4 = arg1.method1587();
      int var5 = arg1.method1587();

      for(int var6 = 0; var6 < this.field6200; ++var6) {
         this.field6199[var6] = var4 + arg1.method1623();
         this.field6198[var6] = var5 + arg1.method1623();
      }

      this.method10013(arg0);
   }

   @deob.ObfuscatedName("nu.n(Lra;I)Lqa;")
   public class745 method10013(class772 arg0) {
      class396 var2 = class396.method5419(Statics.field8828, this.field6196, 0);
      if (var2 == null) {
         return null;
      } else {
         if (var2.field2934 < 13) {
            var2.method5427(2);
         }

         return arg0.method7528(var2, 2048, field6197, 64, 768);
      }
   }

   @deob.ObfuscatedName("nu.k(Low;I)V")
   public void method10012(class713 arg0) {
      if (arg0 != null && this.field6200 > 0) {
         this.method10025(arg0);
         Iterator var2 = this.field6201.iterator();

         while(var2.hasNext()) {
            class304 var3 = (class304)var2.next();
            arg0.method10498(var3, false);
         }
      }

   }

   @deob.ObfuscatedName("nu.d(Low;I)V")
   public void method10023(class713 arg0) {
      if (arg0 != null && this.field6201 != null) {
         Iterator var2 = this.field6201.iterator();

         while(var2.hasNext()) {
            class304 var3 = (class304)var2.next();
            arg0.method10507(var3.field1032, var3.field1875, var3.field1874, new class668(var3));
         }
      }

   }

   @deob.ObfuscatedName("nu.b(Low;B)V")
   private void method10025(class713 arg0) {
      this.field6201 = new LinkedList();
      class611 var2 = client.field2468.method9592();
      class723 var3 = client.field2468.method9649();
      class723 var4 = new class723(Statics.field1977, this.field6199[0], this.field6198[0]);

      for(int var5 = 1; var5 < this.field6200; ++var5) {
         class723 var6 = new class723(Statics.field1977, this.field6199[var5], this.field6198[var5]);

         while(var4.field6676 != var6.field6676 || var4.field6677 != var6.field6677) {
            if (var4.field6676 < var6.field6676) {
               ++var4.field6676;
            } else if (var4.field6676 > var6.field6676) {
               --var4.field6676;
            }

            if (var4.field6677 < var6.field6677) {
               ++var4.field6677;
            } else if (var4.field6677 > var6.field6677) {
               --var4.field6677;
            }

            int var7 = Statics.field1977;
            int var8 = var4.field6676 - var3.field6676;
            int var9 = var4.field6677 - var3.field6677;
            if (var8 >= 0 && var8 < arg0.field6577 && var9 >= 0 && var9 < arg0.field6578) {
               int var10 = (var8 << 9) + 256;
               int var11 = (var9 << 9) + 256;
               if (var2.method8746(var8, var9)) {
                  ++var7;
               }

               this.field6201.add(new class304(arg0, this, Statics.field1977, var7, var10, client.method5777(var10, var11, Statics.field1977), var11));
            }
         }

         var4 = var6;
      }

   }

   @deob.ObfuscatedName("abg.r(IB)V")
   public static void method583(int arg0) {
      field6197 = arg0;
   }
}
