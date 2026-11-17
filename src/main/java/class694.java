@deob.ObfuscatedName("od")
public class class694 {
   @deob.ObfuscatedName("od.d")
   public int field6364 = 255;
   @deob.ObfuscatedName("od.b")
   public int field6359 = 255;
   @deob.ObfuscatedName("od.r")
   public int field6360 = -1;
   @deob.ObfuscatedName("od.p")
   public int field6361 = 1;
   @deob.ObfuscatedName("od.o")
   public int field6362 = 70;
   @deob.ObfuscatedName("od.a")
   private int field6356 = -1;
   @deob.ObfuscatedName("od.x")
   private int field6358 = -1;
   @deob.ObfuscatedName("od.s")
   private int field6365 = -1;
   @deob.ObfuscatedName("od.l")
   private int field6366 = -1;
   @deob.ObfuscatedName("od.n")
   public class695 field6357;

   @deob.ObfuscatedName("od.n(Laen;I)V")
   public void method10146(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method10144(arg0, var2);
      }
   }

   @deob.ObfuscatedName("od.k(Laen;IB)V")
   private void method10144(class124 arg0, int arg1) {
      if (arg1 == 1) {
         arg0.method1587();
      } else if (arg1 == 2) {
         this.field6364 = arg0.method1688();
      } else if (arg1 == 3) {
         this.field6359 = arg0.method1688();
      } else if (arg1 == 4) {
         this.field6360 = 0;
      } else if (arg1 == 5) {
         this.field6362 = arg0.method1587();
      } else if (arg1 == 6) {
         arg0.method1688();
      } else if (arg1 == 7) {
         this.field6356 = arg0.method1608();
      } else if (arg1 == 8) {
         this.field6358 = arg0.method1608();
      } else if (arg1 == 9) {
         this.field6365 = arg0.method1608();
      } else if (arg1 == 10) {
         this.field6366 = arg0.method1608();
      } else if (arg1 == 11) {
         this.field6360 = arg0.method1587();
      }

   }

   @deob.ObfuscatedName("od.d(Lra;B)Lcy;")
   public class383 method10145(class772 arg0) {
      if (this.field6356 < 0) {
         return null;
      } else {
         class383 var2 = (class383)this.field6357.field6373.method10909((long)this.field6356);
         if (var2 == null) {
            this.method10149(arg0);
            var2 = (class383)this.field6357.field6373.method10909((long)this.field6356);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("od.b(Lra;I)Lcy;")
   public class383 method10161(class772 arg0) {
      if (this.field6358 < 0) {
         return null;
      } else {
         class383 var2 = (class383)this.field6357.field6373.method10909((long)this.field6358);
         if (var2 == null) {
            this.method10149(arg0);
            var2 = (class383)this.field6357.field6373.method10909((long)this.field6358);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("od.r(Lra;B)Lcy;")
   public class383 method10157(class772 arg0) {
      if (this.field6365 < 0) {
         return this.method10145(arg0);
      } else {
         class383 var2 = (class383)this.field6357.field6373.method10909((long)this.field6365);
         if (var2 == null) {
            this.method10149(arg0);
            var2 = (class383)this.field6357.field6373.method10909((long)this.field6365);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("od.p(Lra;I)Lcy;")
   public class383 method10148(class772 arg0) {
      if (this.field6366 < 0) {
         return this.method10161(arg0);
      } else {
         class383 var2 = (class383)this.field6357.field6373.method10909((long)this.field6366);
         if (var2 == null) {
            this.method10149(arg0);
            var2 = (class383)this.field6357.field6373.method10909((long)this.field6366);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("od.o(Lra;B)V")
   private void method10149(class772 arg0) {
      class612 var2 = this.field6357.field6371;
      if (this.field6356 >= 0 && this.field6357.field6373.method10909((long)this.field6356) == null && var2.method8790(this.field6356)) {
         class407 var3 = class375.method5066(var2, this.field6356);
         this.field6357.field6373.method10880(arg0.method7529(var3, true), (long)this.field6356);
      }

      if (this.field6358 >= 0 && this.field6357.field6373.method10909((long)this.field6358) == null && var2.method8790(this.field6358)) {
         class407 var4 = class375.method5066(var2, this.field6358);
         this.field6357.field6373.method10880(arg0.method7529(var4, true), (long)this.field6358);
      }

      if (this.field6365 >= 0 && this.field6357.field6373.method10909((long)this.field6365) == null && var2.method8790(this.field6365)) {
         class407 var5 = class375.method5066(var2, this.field6365);
         this.field6357.field6373.method10880(arg0.method7529(var5, true), (long)this.field6365);
      }

      if (this.field6366 >= 0 && this.field6357.field6373.method10909((long)this.field6366) == null && var2.method8790(this.field6366)) {
         class407 var6 = class375.method5066(var2, this.field6366);
         this.field6357.field6373.method10880(arg0.method7529(var6, true), (long)this.field6366);
      }

   }
}
