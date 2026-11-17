@deob.ObfuscatedName("vm")
public class class892 implements class760 {
   @deob.ObfuscatedName("vm.o")
   private final class737 field9093 = new class737(64);
   @deob.ObfuscatedName("vm.a")
   public final class737 field9095 = new class737(50);
   @deob.ObfuscatedName("vm.x")
   public final class765 field9091 = new class765(250);
   @deob.ObfuscatedName("vm.s")
   private final class898 field9096 = new class898();
   @deob.ObfuscatedName("vm.n")
   private final class801 field9092;
   @deob.ObfuscatedName("vm.k")
   public final class823 field9098;
   @deob.ObfuscatedName("vm.d")
   private boolean field9089;
   @deob.ObfuscatedName("vm.l")
   private final class929 field9097;
   @deob.ObfuscatedName("vm.b")
   private final class612 field9090;
   @deob.ObfuscatedName("vm.r")
   public final class612 field9088;
   @deob.ObfuscatedName("vm.p")
   public int field9087;
   @deob.ObfuscatedName("vm.v")
   private final String[] field9099;
   @deob.ObfuscatedName("vm.g")
   private final String[] field9100;
   @deob.ObfuscatedName("vm.u")
   public int field9094;

   public class892(class801 arg0, class823 arg1, boolean arg2, class929 arg3, class612 arg4, class612 arg5) {
      this.field9092 = arg0;
      this.field9098 = arg1;
      this.field9089 = arg2;
      this.field9097 = arg3;
      this.field9090 = arg4;
      this.field9088 = arg5;
      if (this.field9090 != null) {
         int var7 = this.field9090.method8782() - 1;
         this.field9087 = var7 * class424.field3368.method5801() + this.field9090.method8792(var7);
      } else {
         this.field9087 = 0;
      }

      if (class801.field7297 == this.field9092) {
         this.field9099 = new String[]{null, null, class881.field8936.method15374(this.field9098), null, null, class881.field9009.method15374(this.field9098)};
      } else {
         this.field9099 = new String[]{null, null, class881.field8936.method15374(this.field9098), null, null, null};
      }

      this.field9100 = new String[]{null, null, null, null, class881.field8956.method15374(this.field9098)};
   }

   @deob.ObfuscatedName("vm.n(II)Lvt;")
   public class899 method15540(int arg0) {
      class737 var2 = this.field9093;
      class899 var3;
      synchronized(this.field9093) {
         var3 = (class899)this.field9093.method10909((long)arg0);
      }

      if (var3 != null) {
         return var3;
      } else {
         class612 var5 = this.field9090;
         byte[] var6;
         synchronized(this.field9090) {
            var6 = this.field9090.method8771(class424.field3368.method5800(arg0), class424.field3368.method5803(arg0));
         }

         class899 var8 = new class899();
         var8.field9126 = this;
         var8.field9143 = arg0;
         var8.field9147 = (String[])((String[])this.field9099.clone());
         var8.field9148 = (String[])((String[])this.field9100.clone());
         if (var6 != null) {
            var8.method15618(new class124(var6));
         }

         var8.method15638();
         if (var8.field9173 != -1) {
            var8.method15644(this.method15540(var8.field9173), this.method15540(var8.field9172));
         }

         if (var8.field9175 != -1) {
            var8.method15607(this.method15540(var8.field9175), this.method15540(var8.field9174));
         }

         if (var8.field9188 != -1) {
            var8.method15608(this.method15540(var8.field9188), this.method15540(var8.field9179));
         }

         if (!this.field9089 && var8.field9130) {
            var8.field9139 = 0;
            var8.field9147 = this.field9099;
            var8.field9148 = this.field9100;
            var8.field9182 = false;
            var8.field9185 = null;
            if (var8.field9184 != null) {
               boolean var9 = false;

               for(class674 var10 = var8.field9184.method15313(); var10 != null; var10 = var8.field9184.method15314()) {
                  class923 var11 = this.field9097.method15930((int)var10.field6137);
                  if (var11.field9390) {
                     var10.method9864();
                  } else {
                     var9 = true;
                  }
               }

               if (!var9) {
                  var8.field9184 = null;
               }
            }
         }

         class737 var12 = this.field9093;
         synchronized(this.field9093) {
            this.field9093.method10880(var8, (long)arg0);
            return var8;
         }
      }
   }

   @deob.ObfuscatedName("vm.k(Lra;IIIIILqc;I)Lcy;")
   public class383 method15523(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class747 arg6) {
      this.field9096.field9115 = arg0.field7106;
      this.field9096.field9114 = arg1;
      this.field9096.field9119 = arg2;
      this.field9096.field9116 = arg3;
      this.field9096.field9117 = arg4;
      this.field9096.field9118 = arg5;
      this.field9096.field9113 = arg6 != null;
      return (class383)this.field9091.method11351(this.field9096);
   }

   @deob.ObfuscatedName("vm.d(Lra;Lra;IIIIZZILl;Lqc;I)Lcy;")
   public class383 method15524(class772 arg0, class772 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, class609 arg9, class747 arg10) {
      if (!arg7) {
         class383 var12 = this.method15523(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
         if (var12 != null) {
            return var12;
         }
      }

      class899 var13 = this.method15540(arg2);
      if (arg3 > 1 && var13.field9170 != null) {
         int var14 = -1;

         for(int var15 = 0; var15 < 10; ++var15) {
            if (arg3 >= var13.field9171[var15] && var13.field9171[var15] != 0) {
               var14 = var13.field9170[var15];
            }
         }

         if (var14 != -1) {
            var13 = this.method15540(var14);
         }
      }

      int[] var16 = var13.method15611(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10);
      if (var16 == null) {
         return null;
      } else {
         class383 var17;
         if (arg7) {
            var17 = arg0.method11534(var16, 0, 36, 36, 32);
         } else {
            var17 = arg1.method11534(var16, 0, 36, 36, 32);
         }

         if (!arg7) {
            class898 var18 = new class898();
            var18.field9115 = arg1.field7106;
            var18.field9114 = arg2;
            var18.field9119 = arg3;
            var18.field9116 = arg4;
            var18.field9117 = arg5;
            var18.field9118 = arg8;
            var18.field9113 = arg10 != null;
            this.field9091.method11354(var17, var18);
         }

         return var17;
      }
   }

   @deob.ObfuscatedName("vm.b(ZI)V")
   public void method15522(boolean arg0) {
      if (this.field9089 != arg0) {
         this.field9089 = arg0;
         this.method15527();
      }
   }

   @deob.ObfuscatedName("vm.r(II)V")
   public void method15546(int arg0) {
      this.field9094 = arg0;
      class737 var2 = this.field9095;
      synchronized(this.field9095) {
         this.field9095.method10883();
      }
   }

   @deob.ObfuscatedName("vm.p(I)V")
   public void method15527() {
      class737 var1 = this.field9093;
      synchronized(this.field9093) {
         this.field9093.method10883();
      }

      class737 var3 = this.field9095;
      synchronized(this.field9095) {
         this.field9095.method10883();
      }

      class765 var5 = this.field9091;
      synchronized(this.field9091) {
         this.field9091.method11357();
      }
   }

   @deob.ObfuscatedName("vm.o(I)V")
   public void method15528() {
      class765 var1 = this.field9091;
      synchronized(this.field9091) {
         this.field9091.method11357();
      }
   }

   @deob.ObfuscatedName("vm.a(I)V")
   public void method15529() {
      class737 var1 = this.field9095;
      synchronized(this.field9095) {
         this.field9095.method10883();
      }
   }

   @deob.ObfuscatedName("vm.x(II)V")
   public void method15530(int arg0) {
      class737 var2 = this.field9093;
      synchronized(this.field9093) {
         this.field9093.method10882(arg0);
      }

      class737 var4 = this.field9095;
      synchronized(this.field9095) {
         this.field9095.method10882(arg0);
      }

      class765 var6 = this.field9091;
      synchronized(this.field9091) {
         this.field9091.method11356(arg0);
      }
   }

   @deob.ObfuscatedName("vm.s(I)V")
   public void method15531() {
      class737 var1 = this.field9093;
      synchronized(this.field9093) {
         this.field9093.method10887();
      }

      class737 var3 = this.field9095;
      synchronized(this.field9095) {
         this.field9095.method10887();
      }

      class765 var5 = this.field9091;
      synchronized(this.field9091) {
         this.field9091.method11360();
      }
   }
}
