@deob.ObfuscatedName("tk")
public class class836 {
   @deob.ObfuscatedName("tk.s")
   private boolean field8532 = false;
   @deob.ObfuscatedName("tk.l")
   private boolean field8537 = false;
   @deob.ObfuscatedName("tk.u")
   private int field8534 = 0;
   @deob.ObfuscatedName("tk.v")
   private boolean field8535 = false;
   @deob.ObfuscatedName("tk.h")
   private final class838 field8536;
   @deob.ObfuscatedName("tk.e")
   private final class838 field8525;
   @deob.ObfuscatedName("tk.a")
   private int field8523;
   @deob.ObfuscatedName("tk.o")
   private int field8529;
   @deob.ObfuscatedName("tk.r")
   private int field8530;
   @deob.ObfuscatedName("tk.x")
   private int field8531;
   @deob.ObfuscatedName("tk.p")
   private int field8533;
   @deob.ObfuscatedName("tk.b")
   private class806 field8524;

   protected class836(boolean arg0) {
      this.field8537 = arg0;
      this.field8536 = new class838();
      if (this.field8537) {
         this.field8525 = new class838();
      } else {
         this.field8525 = null;
      }

   }

   @deob.ObfuscatedName("pg.n(Lst;I)V")
   public static void method10716(class818 arg0) {
      Statics.field6355 = arg0;
   }

   @deob.ObfuscatedName("tk.k(Ltk;I)V")
   public final void method14757(class836 arg0) {
      this.field8524 = arg0.field8524;
      this.field8532 = arg0.field8532;
      this.field8537 = arg0.field8537;
      this.field8533 = arg0.field8533;
      this.field8529 = arg0.field8529;
      this.field8523 = arg0.field8523;
      this.field8531 = arg0.field8531;
      this.field8530 = arg0.field8530;
      this.method14714();
   }

   @deob.ObfuscatedName("tk.d(I)Z")
   public final boolean method14691() {
      return this.field8524 != null;
   }

   @deob.ObfuscatedName("tk.b(I)Lsh;")
   public final class806 method14698() {
      return this.field8524;
   }

   @deob.ObfuscatedName("tk.r(I)I")
   public final int method14716() {
      return this.field8524 != null ? this.field8524.field8357 : -1;
   }

   @deob.ObfuscatedName("tk.p(IS)V")
   public final void method14694(int arg0) {
      this.method14690(arg0, 0, 0, false);
   }

   @deob.ObfuscatedName("tk.o(III)V")
   public final void method14777(int arg0, int arg1) {
      this.method14690(arg0, arg1, 0, false);
   }

   @deob.ObfuscatedName("tk.a(IZI)V")
   public final void method14696(int arg0, boolean arg1) {
      this.method14690(arg0, 0, 0, arg1);
   }

   @deob.ObfuscatedName("tk.x(IZZI)V")
   public final void method14697(int arg0, boolean arg1, boolean arg2) {
      this.method14699(arg0, 0, 0, arg1, arg2);
   }

   @deob.ObfuscatedName("tk.s(IIIZI)V")
   public final void method14690(int arg0, int arg1, int arg2, boolean arg3) {
      this.method14699(arg0, arg1, arg2, arg3, false);
   }

   @deob.ObfuscatedName("tk.l(IIIZZB)V")
   private final void method14699(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      if (arg0 != this.method14716()) {
         if (arg0 == -1) {
            this.field8524 = null;
         } else {
            if (this.field8524 != null && this.field8524.field8357 == arg0) {
               if (this.field8524.field8370 == 0) {
                  return;
               }
            } else {
               this.field8524 = Statics.field6355.method14475(arg0);
            }

            this.field8529 = 0;
            this.field8533 = arg1;
            this.field8534 = arg2;
            this.field8535 = arg4;
            if (arg3) {
               this.field8523 = (int)(Math.random() * (double)this.field8524.field8358.length);
               this.field8530 = (int)(Math.random() * (double)this.field8524.field8374[this.field8523]);
            } else {
               this.field8523 = 0;
               this.field8530 = 0;
            }

            this.field8531 = this.field8523 + 1;
            if (this.field8531 < 0 || this.field8531 >= this.field8524.field8358.length) {
               this.field8531 = -1;
            }

            if (this.field8533 == 0) {
               this.method2317(this.field8524, this.field8523);
            }

            this.field8532 = false;
         }

         this.method14714();
      }

   }

   @deob.ObfuscatedName("tk.u(B)Z")
   public final boolean method14749() {
      return this.field8533 != 0;
   }

   @deob.ObfuscatedName("tk.v(B)I")
   public final int method14701() {
      return this.field8533;
   }

   @deob.ObfuscatedName("tk.g(II)V")
   public final void method14702(int arg0) {
      this.field8533 = arg0;
   }

   @deob.ObfuscatedName("tk.h(I)I")
   public final int method14779() {
      if (this.method14725()) {
         int var1 = 0;
         if (this.method14725()) {
            var1 |= this.field8536.field8544;
            if (this.field8537 && this.field8524.field8360 != null) {
               var1 |= this.field8525.field8544;
            }
         }

         return var1;
      } else {
         return 0;
      }
   }

   @deob.ObfuscatedName("tk.e(Lqa;II)V")
   public final void method14704(class745 arg0, int arg1) {
      if (this.field8524 != null) {
         if (this.field8524.field8358 != null && this.method14725()) {
            arg0.method11005(this.field8536.field8540, this.field8536.field8541, this.field8536.field8543, this.field8536.field8542, this.field8530, this.field8524.field8374[this.field8523], arg1, this.field8524.field8371);
            if (this.field8537 && this.field8524.field8360 != null && this.field8525.field8545) {
               arg0.method11005(this.field8525.field8540, this.field8525.field8541, this.field8525.field8543, this.field8525.field8542, this.field8530, this.field8524.field8374[this.field8523], arg1, this.field8524.field8371);
            }
         }

      }
   }

   @deob.ObfuscatedName("tk.z(Lqa;IIB)V")
   public final void method14734(class745 arg0, int arg1, int arg2) {
      if (this.field8524.field8358 != null && this.method14725()) {
         arg0.method11006(this.field8536.field8540, this.field8536.field8541, this.field8536.field8543, this.field8536.field8542, this.field8530, this.field8524.field8374[this.field8523], arg1, arg2, this.field8524.field8371, (int[])null);
         if (this.field8537 && this.field8524.field8360 != null && this.field8525.field8545) {
            arg0.method11006(this.field8525.field8540, this.field8525.field8541, this.field8525.field8543, this.field8525.field8542, this.field8530, this.field8524.field8374[this.field8523], arg1, arg2, this.field8524.field8371, (int[])null);
         }
      }

   }

   @deob.ObfuscatedName("tk.m(Lqa;I)V")
   public final void method14748(class745 arg0) {
      if (this.field8524.field8358 != null && this.method14725()) {
         arg0.method11008(this.field8536.field8540, this.field8536.field8541);
         if (this.field8537 && this.field8524.field8360 != null && this.field8525.field8545) {
            arg0.method11008(this.field8525.field8540, this.field8525.field8541);
         }
      }

   }

   @deob.ObfuscatedName("nh.i(Lqa;Ltk;Ltk;B)V")
   public static final void method9843(class745 arg0, class836 arg1, class836 arg2) {
      if (arg1.method14725() && arg2.method14725()) {
         class806 var3 = arg1.field8524;
         class806 var4 = arg2.field8524;
         arg0.method11007(arg1.field8536.field8540, arg1.field8536.field8541, arg1.field8536.field8543, arg1.field8536.field8542, arg1.field8530, var3.field8374[arg1.field8523], arg2.field8536.field8540, arg2.field8536.field8541, arg2.field8536.field8543, arg2.field8536.field8542, arg2.field8530, var4.field8374[arg2.field8523], var3.field8363, var3.field8371 | var4.field8371);
      }

   }

   @deob.ObfuscatedName("tk.t(B)Z")
   public final boolean method14707() {
      return this.field8532;
   }

   @deob.ObfuscatedName("tk.c(B)V")
   public final void method14737() {
      this.field8529 = 0;
   }

   @deob.ObfuscatedName("tk.w(I)V")
   public final void method14761() {
      this.method14710(0);
   }

   @deob.ObfuscatedName("tk.q(IB)V")
   public final void method14710(int arg0) {
      this.field8523 = 0;
      this.field8531 = this.field8524.field8358.length > 1 ? 1 : -1;
      this.field8530 = 0;
      this.field8532 = false;
      this.field8533 = arg0;
      this.field8529 = 0;
      if (this.field8524 != null & this.field8524.field8358 != null) {
         this.method2317(this.field8524, this.field8523);
         this.method14714();
      }

   }

   @deob.ObfuscatedName("tk.y(II)Z")
   public final boolean method14711(int arg0) {
      if (this.field8524 != null && arg0 != 0) {
         if (this.field8533 > 0) {
            if (this.field8533 >= arg0) {
               this.field8533 -= arg0;
               return false;
            }

            arg0 -= this.field8533;
            this.field8533 = 0;
            this.method2317(this.field8524, this.field8523);
         }

         int var2 = this.field8530 + arg0;
         boolean var3 = this.field8524.field8372 | class806.field8355;
         if (var2 > 100 && this.field8524.field8362 > 0) {
            int var4 = this.field8524.field8358.length - this.field8524.field8362;

            while(this.field8523 < var4 && var2 > this.field8524.field8374[this.field8523]) {
               var2 -= this.field8524.field8374[this.field8523];
               ++this.field8523;
            }

            if (this.field8523 >= var4) {
               int var5 = 0;

               for(int var6 = var4; var6 < this.field8524.field8358.length; ++var6) {
                  var5 += this.field8524.field8374[var6];
               }

               if (this.field8534 == 0) {
                  this.field8529 += var2 / var5;
               }

               var2 %= var5;
            }

            this.field8531 = this.field8523 + 1;
            if (this.field8531 >= this.field8524.field8358.length) {
               if (this.field8524.field8362 == -1 && this.field8535) {
                  this.field8531 = 0;
               } else {
                  this.field8531 -= this.field8524.field8362;
               }

               if (this.field8531 < 0 || this.field8531 >= this.field8524.field8358.length) {
                  this.field8531 = -1;
               }
            }

            var3 = true;
         }

         while(var2 > this.field8524.field8374[this.field8523]) {
            var3 = true;
            var2 -= this.field8524.field8374[++this.field8523 - 1];
            if (this.field8523 >= this.field8524.field8358.length) {
               if (this.field8524.field8362 != -1 && this.field8534 != 2) {
                  this.field8523 -= this.field8524.field8362;
                  if (this.field8534 == 0) {
                     ++this.field8529;
                  }
               }

               if (this.field8529 >= this.field8524.field8364 || this.field8523 < 0 || this.field8523 >= this.field8524.field8358.length) {
                  this.field8532 = true;
                  break;
               }
            }

            this.method2317(this.field8524, this.field8523);
            this.field8531 = this.field8523 + 1;
            if (this.field8531 >= this.field8524.field8358.length) {
               if (this.field8524.field8362 == -1 && this.field8535) {
                  this.field8531 = 0;
               } else {
                  this.field8531 -= this.field8524.field8362;
               }

               if (this.field8531 < 0 || this.field8531 >= this.field8524.field8358.length) {
                  this.field8531 = -1;
               }
            }
         }

         this.field8530 = var2;
         if (var3) {
            this.method14714();
         }

         return var3;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("tk.j(II)Z")
   public final boolean method14712(int arg0) {
      int var2;
      return this.field8524 == null | (var2 = arg0 - this.field8533) <= 0 ? false : this.field8524.field8372 | this.field8530 + var2 > this.field8524.field8374[this.field8523];
   }

   @deob.ObfuscatedName("tk.f(Lsh;IB)V")
   protected void method2317(class806 arg0, int arg1) {
   }

   @deob.ObfuscatedName("tk.ai(I)Z")
   private final boolean method14725() {
      if (this.field8524 != null) {
         boolean var1 = this.field8536.method14789(Statics.field6355, this.field8524, this.field8523, this.field8531, this.field8524.field8358);
         if (var1 && this.field8537 && this.field8524.field8360 != null) {
            this.field8525.method14789(Statics.field6355, this.field8524, this.field8523, this.field8531, this.field8524.field8360);
         }

         return var1;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("tk.ap(B)V")
   private final void method14714() {
      this.field8536.method14790();
      if (this.field8537) {
         this.field8525.method14790();
      }

   }
}
