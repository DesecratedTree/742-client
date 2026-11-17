@deob.ObfuscatedName("aia")
public class class219 extends class89 {
   @deob.ObfuscatedName("aia.x")
   public class849 field1473 = new class849();
   @deob.ObfuscatedName("aia.s")
   public class223 field1474 = new class223();
   @deob.ObfuscatedName("aia.a")
   private class221 field1472;

   public class219(class221 arg0) {
      this.field1472 = arg0;
   }

   @deob.ObfuscatedName("aia.k()Ladf;")
   public class89 method1257() {
      class82 var1 = (class82)this.field1473.method14964();
      if (var1 == null) {
         return null;
      } else {
         return var1.field597 != null ? var1.field597 : this.method1245();
      }
   }

   @deob.ObfuscatedName("aia.d()Ladf;")
   public class89 method1245() {
      class82 var1;
      do {
         var1 = (class82)this.field1473.method15006();
         if (var1 == null) {
            return null;
         }
      } while(var1.field597 == null);

      return var1.field597;
   }

   @deob.ObfuscatedName("aia.b()I")
   public int method1246() {
      return 0;
   }

   @deob.ObfuscatedName("aia.p([III)V")
   public void method1244(int[] arg0, int arg1, int arg2) {
      this.field1474.method1244(arg0, arg1, arg2);

      for(class82 var4 = (class82)this.field1473.method14964(); var4 != null; var4 = (class82)this.field1473.method15006()) {
         if (!this.field1472.method3002(var4)) {
            int var5 = arg1;
            int var6 = arg2;

            do {
               if (var6 <= var4.field602) {
                  this.method2963(var4, arg0, var5, var6, var5 + var6);
                  var4.field602 -= var6;
                  break;
               }

               this.method2963(var4, arg0, var5, var4.field602, var5 + var6);
               var5 += var4.field602;
               var6 -= var4.field602;
            } while(!this.field1472.method3001(var4, arg0, var5, var6));
         }
      }

   }

   @deob.ObfuscatedName("aia.o(I)V")
   public void method1254(int arg0) {
      this.field1474.method1254(arg0);

      for(class82 var2 = (class82)this.field1473.method14964(); var2 != null; var2 = (class82)this.field1473.method15006()) {
         if (!this.field1472.method3002(var2)) {
            int var3 = arg0;

            do {
               if (var3 <= var2.field602) {
                  this.method2957(var2, var3);
                  var2.field602 -= var3;
                  break;
               }

               this.method2957(var2, var2.field602);
               var3 -= var2.field602;
            } while(!this.field1472.method3001(var2, (int[])null, 0, var3));
         }
      }

   }

   @deob.ObfuscatedName("aia.ak(Lacz;[IIIII)V")
   private void method2963(class82 arg0, int[] arg1, int arg2, int arg3, int arg4) {
      if ((this.field1472.field1512[arg0.field589] & 4) != 0 && arg0.field588 < 0) {
         int var6 = this.field1472.field1501[arg0.field589] / Statics.field5854;

         while(true) {
            int var7 = (var6 + 1048575 - arg0.field604) / var6;
            if (var7 > arg3) {
               arg0.field604 += arg3 * var6;
               break;
            }

            arg0.field597.method1244(arg1, arg2, var7);
            arg2 += var7;
            arg3 -= var7;
            arg0.field604 += var6 * var7 - 1048576;
            int var8 = Statics.field5854 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            class235 var10 = arg0.field597;
            if (this.field1472.field1499[arg0.field589] == 0) {
               arg0.field597 = arg0.field585.method3111(var10.method3262(), var10.method3252(), var10.method3253());
            } else {
               arg0.field597 = arg0.field585.method3111(var10.method3262(), 0, var10.method3253());
               this.field1472.method3055(arg0, arg0.field584.field451[arg0.field603] < 0);
               arg0.field597.method3258(var8, var10.method3252());
            }

            if (arg0.field584.field451[arg0.field603] < 0) {
               arg0.field597.method3313(-1);
            }

            var10.method3260(var8);
            var10.method1244(arg1, arg2, arg4 - arg2);
            if (var10.method3246()) {
               this.field1474.method3107(var10);
            }
         }
      }

      arg0.field597.method1244(arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("aia.aa(Lacz;II)V")
   private void method2957(class82 arg0, int arg1) {
      if ((this.field1472.field1512[arg0.field589] & 4) != 0 && arg0.field588 < 0) {
         int var3 = this.field1472.field1501[arg0.field589] / Statics.field5854;
         int var4 = (var3 + 1048575 - arg0.field604) / var3;
         arg0.field604 = arg0.field604 + arg1 * var3 & 1048575;
         if (var4 <= arg1) {
            class235 var5 = arg0.field597;
            if (this.field1472.field1499[arg0.field589] == 0) {
               arg0.field597 = arg0.field585.method3111(var5.method3262(), var5.method3252(), var5.method3253());
            } else {
               arg0.field597 = arg0.field585.method3111(var5.method3262(), 0, var5.method3253());
               this.field1472.method3055(arg0, arg0.field584.field451[arg0.field603] < 0);
            }

            if (arg0.field584.field451[arg0.field603] < 0) {
               arg0.field597.method3313(-1);
            }

            arg1 = arg0.field604 / var3;
         }
      }

      arg0.field597.method1254(arg1);
   }
}
