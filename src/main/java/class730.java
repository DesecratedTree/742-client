@deob.ObfuscatedName("pm")
public class class730 {
   @deob.ObfuscatedName("pm.o")
   public boolean field6701 = false;
   @deob.ObfuscatedName("pm.a")
   public int field6702 = -1;
   @deob.ObfuscatedName("pm.x")
   public int field6698 = 16777215;
   @deob.ObfuscatedName("pm.s")
   public int field6704 = 70;
   @deob.ObfuscatedName("pm.l")
   private int field6705 = -1;
   @deob.ObfuscatedName("pm.u")
   private int field6706 = -1;
   @deob.ObfuscatedName("pm.v")
   private int field6710 = -1;
   @deob.ObfuscatedName("pm.g")
   private int field6708 = -1;
   @deob.ObfuscatedName("pm.h")
   public int field6709 = 0;
   @deob.ObfuscatedName("pm.e")
   public int field6714 = 0;
   @deob.ObfuscatedName("pm.z")
   public int field6711 = -1;
   @deob.ObfuscatedName("pm.m")
   private String field6712 = "";
   @deob.ObfuscatedName("pm.i")
   public int field6713 = -1;
   @deob.ObfuscatedName("pm.t")
   public int field6703 = 0;
   @deob.ObfuscatedName("pm.n")
   public class740 field6707;

   @deob.ObfuscatedName("pm.n(Laen;I)V")
   public void method10763(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method10764(arg0, var2);
      }
   }

   @deob.ObfuscatedName("pm.k(Laen;II)V")
   private void method10764(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field6702 = arg0.method1608();
      } else if (arg1 == 2) {
         this.field6698 = arg0.method1589();
         this.field6701 = true;
      } else if (arg1 == 3) {
         this.field6705 = arg0.method1608();
      } else if (arg1 == 4) {
         this.field6710 = arg0.method1608();
      } else if (arg1 == 5) {
         this.field6706 = arg0.method1608();
      } else if (arg1 == 6) {
         this.field6708 = arg0.method1608();
      } else if (arg1 == 7) {
         this.field6709 = arg0.method1723();
      } else if (arg1 == 8) {
         this.field6712 = arg0.method1600();
      } else if (arg1 == 9) {
         this.field6704 = arg0.method1587();
      } else if (arg1 == 10) {
         this.field6714 = arg0.method1723();
      } else if (arg1 == 11) {
         this.field6711 = 0;
      } else if (arg1 == 12) {
         this.field6713 = arg0.method1688();
      } else if (arg1 == 13) {
         this.field6703 = arg0.method1723();
      } else if (arg1 == 14) {
         this.field6711 = arg0.method1587();
      }

   }

   @deob.ObfuscatedName("pm.d(IB)Ljava/lang/String;")
   public String method10765(int arg0) {
      String var2 = this.field6712;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + class816.method6109(arg0, false) + var2.substring(var3 + 2);
      }
   }

   @deob.ObfuscatedName("pm.b(Lra;I)Lcy;")
   public class383 method10766(class772 arg0) {
      if (this.field6705 < 0) {
         return null;
      } else {
         class383 var2 = (class383)this.field6707.field6802.method10909((long)this.field6705);
         if (var2 == null) {
            this.method10770(arg0);
            var2 = (class383)this.field6707.field6802.method10909((long)this.field6705);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("pm.r(Lra;I)Lcy;")
   public class383 method10767(class772 arg0) {
      if (this.field6706 < 0) {
         return null;
      } else {
         class383 var2 = (class383)this.field6707.field6802.method10909((long)this.field6706);
         if (var2 == null) {
            this.method10770(arg0);
            var2 = (class383)this.field6707.field6802.method10909((long)this.field6706);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("pm.p(Lra;I)Lcy;")
   public class383 method10768(class772 arg0) {
      if (this.field6710 < 0) {
         return null;
      } else {
         class383 var2 = (class383)this.field6707.field6802.method10909((long)this.field6710);
         if (var2 == null) {
            this.method10770(arg0);
            var2 = (class383)this.field6707.field6802.method10909((long)this.field6710);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("pm.o(Lra;B)Lcy;")
   public class383 method10776(class772 arg0) {
      if (this.field6708 < 0) {
         return null;
      } else {
         class383 var2 = (class383)this.field6707.field6802.method10909((long)this.field6708);
         if (var2 == null) {
            this.method10770(arg0);
            var2 = (class383)this.field6707.field6802.method10909((long)this.field6708);
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("pm.a(Lra;I)V")
   private void method10770(class772 arg0) {
      class612 var2 = this.field6707.field6801;
      if (this.field6705 >= 0 && this.field6707.field6802.method10909((long)this.field6705) == null && var2.method8790(this.field6705)) {
         class407 var3 = class375.method5066(var2, this.field6705);
         this.field6707.field6802.method10880(arg0.method7529(var3, true), (long)this.field6705);
      }

      if (this.field6706 >= 0 && this.field6707.field6802.method10909((long)this.field6706) == null && var2.method8790(this.field6706)) {
         class407 var4 = class375.method5066(var2, this.field6706);
         this.field6707.field6802.method10880(arg0.method7529(var4, true), (long)this.field6706);
      }

      if (this.field6710 >= 0 && this.field6707.field6802.method10909((long)this.field6710) == null && var2.method8790(this.field6710)) {
         class407 var5 = class375.method5066(var2, this.field6710);
         this.field6707.field6802.method10880(arg0.method7529(var5, true), (long)this.field6710);
      }

      if (this.field6708 >= 0 && this.field6707.field6802.method10909((long)this.field6708) == null && var2.method8790(this.field6708)) {
         class407 var6 = class375.method5066(var2, this.field6708);
         this.field6707.field6802.method10880(arg0.method7529(var6, true), (long)this.field6708);
      }

   }
}
