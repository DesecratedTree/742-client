import java.util.Random;

@deob.ObfuscatedName("wd")
public class class910 {
   @deob.ObfuscatedName("wd.k")
   private final class612 field9252;
   @deob.ObfuscatedName("wd.d")
   private final class912[] field9253;
   @deob.ObfuscatedName("wd.b")
   private final int field9251;

   public class910(class801 arg0, class823 arg1, class612 arg2) {
      this.field9252 = arg2;
      class124 var4 = new class124(this.field9252.method8771(0, 0));
      int var5 = var4.field931 != null && var4.field931.length >= 1 ? var4.method1688() : -1;
      if (var5 < 4) {
         this.field9253 = new class912[0];
         this.field9251 = -1;
      } else {
         int var6 = var4.method1688();
         class538[] var7 = class538.method11577();
         boolean var8 = true;
         if (var7.length != var6) {
            var8 = false;
         } else {
            for(int var9 = 0; var9 < var7.length; ++var9) {
               int var10 = var4.method1688();
               if (var7[var9].field4257 != var10) {
                  var8 = false;
                  break;
               }
            }
         }

         if (var8) {
            int var11 = var4.method1688();
            int var12 = var4.method1688();
            int var13;
            int var14;
            if (var5 > 2) {
               this.field9251 = var4.method1723();
               var13 = var4.method1589();
               var14 = var4.method1587();
            } else {
               this.field9251 = -1;
               var13 = 0;
               var14 = 0;
            }

            this.field9253 = new class912[var12 + 1];

            for(int var15 = 0; var15 < var11; ++var15) {
               int var16 = var4.method1688();
               boolean var17 = var4.method1688() == 1;
               int var18 = var4.method1587();
               class914[] var19;
               if (this.field9251 != -1) {
                  var19 = new class914[var18 + 1];
                  var19[0] = new class914(this.field9251, var13, var14);

                  for(int var24 = 0; var24 < var18; ++var24) {
                     int var25 = var4.method1587();
                     int var26 = var4.method1589();
                     int var27 = var4.method1587();
                     var19[var24 + 1] = new class914(var25, var26, var27);
                  }
               } else {
                  var19 = new class914[var18];

                  for(int var20 = 0; var20 < var18; ++var20) {
                     int var21 = var4.method1587();
                     int var22 = var4.method1589();
                     int var23 = var4.method1587();
                     var19[var20] = new class914(var21, var22, var23);
                  }

                  this.field9253[var16] = new class912(var17, var19);
               }

               this.field9253[var16] = new class912(var17, var19);
            }

            for(int var28 = 0; var28 < var12 + 1; ++var28) {
               if (this.field9253[var28] == null) {
                  this.field9253[var28] = this.method15742(var13, var14);
               }
            }
         } else {
            this.field9253 = new class912[0];
            this.field9251 = -1;
         }
      }

   }

   @deob.ObfuscatedName("wd.n(III)Lwf;")
   private class912 method15742(int arg0, int arg1) {
      if (this.field9251 == -1) {
         return new class912(false, new class914[0]);
      } else {
         class914 var3 = new class914(this.field9251, arg0, arg1);
         return new class912(false, new class914[]{var3});
      }
   }

   @deob.ObfuscatedName("wd.k(II)Lwj;")
   public class916 method15743(int arg0) {
      byte[] var2 = this.field9252.method8771(arg0, 0);
      class916 var3 = new class916();
      var3.method15819(new class124(var2));
      return var3;
   }

   @deob.ObfuscatedName("wd.d(II)[Lwh;")
   public class914[] method15744(int arg0) {
      if (arg0 >= 0 && arg0 < this.field9253.length) {
         class912 var2 = this.field9253[arg0];
         if (var2.field9262 && var2.field9263.length > 1) {
            int var3 = this.field9251 == -1 ? 0 : 1;
            Random var4 = new Random();
            class914[] var5 = new class914[var2.field9263.length];
            System.arraycopy(var2.field9263, 0, var5, 0, var5.length);

            for(int var6 = var3; var6 < var5.length; ++var6) {
               int var7 = class887.method15494(var4, var5.length - var3) + var3;
               class914 var8 = var2.field9263[var6];
               var5[var6] = var5[var7];
               var5[var7] = var8;
            }

            return var5;
         } else {
            return var2.field9263;
         }
      } else {
         return this.method15742(0, 0).field9263;
      }
   }

   @deob.ObfuscatedName("wd.b(I)Z")
   public boolean method15745() {
      return this.field9251 != -1;
   }
}
