import java.util.Iterator;

@deob.ObfuscatedName("aaf")
public class class8 extends class452 {
   @deob.ObfuscatedName("aaf.ax")
   private int field94 = 0;

   public class8(class448 arg0) {
      super(class462.field3809, arg0);
   }

   @deob.ObfuscatedName("aaf.eb(I)I")
   public int method246() {
      ++this.field94;
      if (this.field94 == 126) {
         this.field94 = 0;
      }

      return this.field94;
   }

   @deob.ObfuscatedName("aaf.ep(Laen;II)V")
   public void method244(class124 arg0, int arg1) {
      int var3 = arg0.field935;
      int var4 = arg0.method1688();
      this.method6291(class443.method3576(var4 & 1));
      class449 var5 = class449.method9879(var4 >> 1 & 3);
      if (this.field3718 != var5) {
         try {
            this.method6292(var5, true);
         } catch (class168 var20) {
            var20.printStackTrace();
         }
      }

      class444 var7 = class444.method14381(var4 >> 3 & 3);
      if (this.field3720 != var7) {
         try {
            this.method6293(var7, true);
         } catch (class168 var19) {
            var19.printStackTrace();
         }
      }

      if ((var4 >> 7 & 1) == 1) {
         int var9 = arg0.method1587();
         if ((var9 >> class456.field3769.field3775 & 1) == 1) {
            this.field3740.method8140(arg0);
         }

         if ((var9 >> class456.field3771.field3775 & 1) == 1) {
            this.field3727.method8140(arg0);
         }

         if ((var9 >> class456.field3762.field3775 & 1) == 1) {
            this.field3729.method8140(arg0);
         }

         if ((var9 >> class456.field3763.field3775 & 1) == 1) {
            this.field3730.method8140(arg0);
         }

         if ((var9 >> class456.field3764.field3775 & 1) == 1) {
            this.field3735 = arg0.method1660();
            this.field3742 = arg0.method1660();
         }

         if ((var9 >> class456.field3772.field3775 & 1) == 1) {
            this.field3737 = arg0.method1660();
            this.field3738 = arg0.method1660();
         }

         if ((var9 >> class456.field3773.field3775 & 1) == 1) {
            this.field3741 = class464.method9257(arg0.method1688());
         }

         if ((var9 >> class456.field3767.field3775 & 1) == 1) {
            this.field3724 = arg0.method1589();
            arg0.method1688();
         }

         if ((var9 >> class456.field3765.field3775 & 1) == 1) {
            int var10 = arg0.method1688();
            this.field3739 = (var10 & 1) == 1;
            this.field3736 = (var10 & 2) == 2;
         }

         if ((var9 >> class456.field3766.field3775 & 1) == 1) {
            int var11 = arg0.method1688();

            for(int var12 = 0; var12 < var11; ++var12) {
               int var13 = arg0.method1688();
               int var14 = arg0.method1688();
               if (var13 == 0) {
                  this.method6310(var14);
               } else {
                  class442 var15 = class442.method3949(arg0.method1688());
                  boolean var16 = true;
                  Iterator var17 = this.field3743.iterator();

                  while(var17.hasNext()) {
                     class260 var18 = (class260)var17.next();
                     if (var18.field1735 == var14) {
                        var18.method3499(arg0);
                        var16 = false;
                        break;
                     }
                  }

                  if (var16) {
                     this.method6309(class260.method2046(var14, var15, arg0));
                  }
               }
            }
         }

         if ((var9 >> class456.field3768.field3775 & 1) == 1) {
            this.field3716 = arg0.method1587();
            this.field3722 = arg0.method1660();
         }

         if ((var9 >> class456.field3760.field3775 & 1) == 1) {
            this.field3721 = class460.method14541(arg0.method1688());
         }

         if ((var9 >> class456.field3761.field3775 & 1) == 1) {
            this.field3728.method8140(arg0);
            this.field3732.method8140(arg0);
            this.field3733 = arg0.method1660();
            this.field3731 = arg0.method1660();
         }

         if ((var9 >> class456.field3770.field3775 & 1) == 1) {
            arg0.method1660();
         }

         if ((var9 >> class456.field3774.field3775 & 1) == 1) {
            this.field3725 = arg0.method1660();
         }
      }

      if (this.field3719 != null && (var4 >> 5 & 1) == 1) {
         this.field3719.method2296(arg0);
      }

      if (this.field3715 != null && (var4 >> 6 & 1) == 1) {
         this.field3715.method207(arg0);
      }

      if (arg0.field935 - var3 != arg1) {
         throw new RuntimeException(arg0.field935 - var3 + "," + arg1);
      }
   }
}
