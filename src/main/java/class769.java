@deob.ObfuscatedName("qy")
public class class769 {
   @deob.ObfuscatedName("qy.d")
   public float field7058;
   @deob.ObfuscatedName("qy.b")
   public float field7060;
   @deob.ObfuscatedName("qy.l")
   public float field7061;
   @deob.ObfuscatedName("qy.x")
   public float field7065;
   @deob.ObfuscatedName("qy.s")
   public float field7066;
   @deob.ObfuscatedName("qy.k")
   public float field7067;
   @deob.ObfuscatedName("qy.p")
   public int field7062;
   @deob.ObfuscatedName("qy.n")
   public int field7063;
   @deob.ObfuscatedName("qy.o")
   public int field7064;
   @deob.ObfuscatedName("qy.a")
   public class400 field7068;
   @deob.ObfuscatedName("qy.r")
   public class584 field7057;
   @deob.ObfuscatedName("qy.u")
   public class656 field7059;

   public class769() {
      this.method11444();
   }

   public class769(class124 arg0, class751 arg1) {
      this.method11449(arg0, arg1);
   }

   @deob.ObfuscatedName("qy.n(I)V")
   private void method11444() {
      this.field7063 = class751.field6919;
      this.field7057 = class584.method8136(-50.0F, -60.0F, -50.0F);
      this.field7067 = 1.1523438F;
      this.field7058 = 0.69921875F;
      this.field7060 = 1.2F;
      this.field7062 = class751.field6922;
      this.field7064 = 0;
      this.field7068 = Statics.field4166;
      this.field7065 = 1.0F;
      this.field7066 = 0.25F;
      this.field7061 = 1.0F;
      this.field7059 = Statics.field7146;
   }

   @deob.ObfuscatedName("qy.k(Lqy;I)V")
   public void method11432(class769 arg0) {
      this.field7063 = arg0.field7063;
      this.field7067 = arg0.field7067;
      this.field7058 = arg0.field7058;
      this.field7060 = arg0.field7060;
      this.field7057.method8177(arg0.field7057);
      this.field7062 = arg0.field7062;
      this.field7064 = arg0.field7064;
      this.field7068 = arg0.field7068;
      this.field7065 = arg0.field7065;
      this.field7066 = arg0.field7066;
      this.field7061 = arg0.field7061;
      this.field7059 = arg0.field7059;
   }

   @deob.ObfuscatedName("qy.d(Lra;Lqy;Lqy;FI)V")
   public void method11434(class772 arg0, class769 arg1, class769 arg2, float arg3) {
      this.field7063 = class789.method10708(arg1.field7063, arg2.field7063, arg3 * 255.0F);
      this.field7058 = (arg2.field7058 - arg1.field7058) * arg3 + arg1.field7058;
      this.field7060 = (arg2.field7060 - arg1.field7060) * arg3 + arg1.field7060;
      this.field7067 = (arg2.field7067 - arg1.field7067) * arg3 + arg1.field7067;
      this.field7061 = (arg2.field7061 - arg1.field7061) * arg3 + arg1.field7061;
      this.field7065 = (arg2.field7065 - arg1.field7065) * arg3 + arg1.field7065;
      this.field7066 = (arg2.field7066 - arg1.field7066) * arg3 + arg1.field7066;
      this.field7062 = class789.method10708(arg1.field7062, arg2.field7062, arg3 * 255.0F);
      this.field7064 = (int)((float)(arg2.field7064 - arg1.field7064) * arg3 + (float)arg1.field7064);
      if (arg1.field7068 != arg2.field7068) {
         this.field7068 = arg0.method2521(arg1.field7068, arg2.field7068, arg3, this.field7068);
      }

      if (arg1.field7059 != arg2.field7059) {
         if (arg1.field7059 == null) {
            this.field7059 = arg2.field7059;
            if (this.field7059 != null) {
               this.field7059.method9473((int)(arg3 * 255.0F), 0);
            }
         } else {
            this.field7059 = arg1.field7059;
            if (this.field7059 != null) {
               this.field7059.method9473((int)(arg3 * 255.0F), 255);
            }
         }
      }

   }

   @deob.ObfuscatedName("qy.b(Laen;Lqg;I)V")
   public void method11449(class124 arg0, class751 arg1) {
      int var3 = arg0.method1688();
      if (Statics.field9361.field951.method1448() == 1 && Statics.field8847.method7499() > 0) {
         if ((var3 & 1) != 0) {
            this.field7063 = arg0.method1591();
         } else {
            this.field7063 = class751.field6919;
         }

         if ((var3 & 2) != 0) {
            this.field7067 = (float)arg0.method1587() / 256.0F;
         } else {
            this.field7067 = 1.1523438F;
         }

         if ((var3 & 4) != 0) {
            this.field7058 = (float)arg0.method1587() / 256.0F;
         } else {
            this.field7058 = 0.69921875F;
         }

         if ((var3 & 8) != 0) {
            this.field7060 = (float)arg0.method1587() / 256.0F;
         } else {
            this.field7060 = 1.2F;
         }
      } else {
         if ((var3 & 1) != 0) {
            arg0.method1591();
         }

         if ((var3 & 2) != 0) {
            arg0.method1587();
         }

         if ((var3 & 4) != 0) {
            arg0.method1587();
         }

         if ((var3 & 8) != 0) {
            arg0.method1587();
         }

         this.field7063 = class751.field6919;
         this.field7060 = 1.2F;
         this.field7058 = 0.69921875F;
         this.field7067 = 1.1523438F;
      }

      if ((var3 & 16) != 0) {
         this.field7057 = class584.method8136((float)arg0.method1723(), (float)arg0.method1723(), (float)arg0.method1723());
      } else {
         this.field7057 = class584.method8136(-50.0F, -60.0F, -50.0F);
      }

      if ((var3 & 32) != 0) {
         this.field7062 = arg0.method1591();
      } else {
         this.field7062 = class751.field6922;
      }

      if ((var3 & 64) != 0) {
         this.field7064 = arg0.method1587();
      } else {
         this.field7064 = 0;
      }

      if ((var3 & 128) != 0) {
         int var4 = arg0.method1587();
         int var5 = arg0.method1587();
         int var6 = arg0.method1587();
         int var7 = arg0.method1587();
         int var8 = arg0.method1587();
         int var9 = arg0.method1587();
         this.field7068 = arg1.method11146(var4, var5, var6, var7, var8, var9);
      } else {
         this.field7068 = Statics.field4166;
      }

   }

   @deob.ObfuscatedName("qy.r(Laen;I)V")
   public void method11440(class124 arg0) {
      this.field7065 = (float)(arg0.method1688() * 8) / 255.0F;
      this.field7066 = (float)(arg0.method1688() * 8) / 255.0F;
      this.field7061 = (float)(arg0.method1688() * 8) / 255.0F;
   }

   @deob.ObfuscatedName("qy.p(Laen;Lqg;S)V")
   public void method11436(class124 arg0, class751 arg1) {
      int var3 = arg0.method1587();
      int var4 = arg0.method1723();
      int var5 = arg0.method1723();
      int var6 = arg0.method1723();
      int var7 = arg0.method1587();
      Statics.field1097 = var7;
      this.field7059 = arg1.method11148(var3, var4, var5, var6);
   }

   @deob.ObfuscatedName("qy.o(Lqy;I)Z")
   public boolean method11437(class769 arg0) {
      return this.field7063 == arg0.field7063 && this.field7067 == arg0.field7067 && this.field7058 == arg0.field7058 && this.field7060 == arg0.field7060 && this.field7066 == arg0.field7066 && this.field7065 == arg0.field7065 && this.field7061 == arg0.field7061 && this.field7062 == arg0.field7062 && this.field7064 == arg0.field7064 && this.field7068 == arg0.field7068 && this.field7059 == arg0.field7059;
   }

   @deob.ObfuscatedName("qy.a(I)I")
   public int method11438() {
      return this.field7062;
   }

   @deob.ObfuscatedName("qy.x(I)Lmt;")
   public class656 method11439() {
      return this.field7059;
   }
}
