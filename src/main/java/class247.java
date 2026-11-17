@deob.ObfuscatedName("ajb")
public class class247 extends class107 {
   @deob.ObfuscatedName("ajb.x")
   private int field1636;
   @deob.ObfuscatedName("ajb.l")
   public class387[] field1638;
   @deob.ObfuscatedName("ajb.s")
   private byte[][] field1637;

   @deob.ObfuscatedName("qh.n(Llc;Llc;IB)V")
   public static void method11184(class612 arg0, class612 arg1, int arg2) {
      Statics.field7270 = arg0;
      Statics.field1635 = arg1;
   }

   public class247(int arg0) {
      this.field1636 = arg0;
   }

   @deob.ObfuscatedName("ajb.k(B)Z")
   public boolean method3354() {
      if (this.field1638 != null) {
         return true;
      } else {
         if (this.field1637 == null) {
            class612 var1 = Statics.field7270;
            synchronized(Statics.field7270) {
               if (!Statics.field7270.method8774(this.field1636)) {
                  return false;
               }

               int[] var2 = Statics.field7270.method8780(this.field1636);
               this.field1637 = new byte[var2.length][];

               for(int var3 = 0; var3 < var2.length; ++var3) {
                  this.field1637[var3] = Statics.field7270.method8771(this.field1636, var2[var3]);
               }
            }
         }

         boolean var5 = true;

         for(int var6 = 0; var6 < this.field1637.length; ++var6) {
            byte[] var7 = this.field1637[var6];
            class124 var8 = new class124(var7);
            var8.field935 = 1;
            int var9 = var8.method1587();
            class612 var10 = Statics.field1635;
            synchronized(Statics.field1635) {
               var5 &= Statics.field1635.method8790(var9);
            }
         }

         if (!var5) {
            return false;
         } else {
            class849 var12 = new class849();
            class612 var13 = Statics.field7270;
            int[] var15;
            synchronized(Statics.field7270) {
               int var14 = Statics.field7270.method8792(this.field1636);
               this.field1638 = new class387[var14];
               var15 = Statics.field7270.method8780(this.field1636);
            }

            for(int var17 = 0; var17 < var15.length; ++var17) {
               byte[] var18 = this.field1637[var17];
               class124 var19 = new class124(var18);
               var19.field935 = 1;
               int var20 = var19.method1587();
               class69 var21 = null;

               for(class69 var22 = (class69)var12.method14964(); var22 != null; var22 = (class69)var12.method15006()) {
                  if (var22.field508 == var20) {
                     var21 = var22;
                     break;
                  }
               }

               if (var21 == null) {
                  class612 var23 = Statics.field1635;
                  synchronized(Statics.field1635) {
                     var21 = new class69(var20, Statics.field1635.method8809(var20));
                  }

                  var12.method14959(var21);
               }

               this.field1638[var15[var17]] = new class387(var18, var21);
            }

            this.field1637 = (byte[][])null;
            return true;
         }
      }
   }

   @deob.ObfuscatedName("ajb.d(II)Z")
   public boolean method3368(int arg0) {
      return this.field1638[arg0].field2857;
   }

   @deob.ObfuscatedName("ajb.b(IB)Z")
   public boolean method3356(int arg0) {
      return this.field1638[arg0].field2858;
   }

   @deob.ObfuscatedName("ajb.r(IB)Z")
   public boolean method3365(int arg0) {
      return this.field1638[arg0].field2859;
   }
}
