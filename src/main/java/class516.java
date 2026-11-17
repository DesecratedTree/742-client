import java.nio.ByteBuffer;
import java.util.Vector;

@deob.ObfuscatedName("hw")
public class class516 {
   @deob.ObfuscatedName("hw.z")
   private Vector field4104 = new Vector();
   @deob.ObfuscatedName("hw.t")
   private int field4095 = 0;
   @deob.ObfuscatedName("hw.c")
   private int field4108 = 0;
   @deob.ObfuscatedName("hw.n")
   private class979 field4107;
   @deob.ObfuscatedName("hw.h")
   private class405 field4102;
   @deob.ObfuscatedName("hw.v")
   private int field4091;
   @deob.ObfuscatedName("hw.g")
   private int field4105;
   @deob.ObfuscatedName("hw.l")
   private class393 field4098;
   @deob.ObfuscatedName("hw.u")
   private class393 field4101;
   @deob.ObfuscatedName("hw.o")
   private class398 field4094;
   @deob.ObfuscatedName("hw.x")
   private class398 field4096;
   @deob.ObfuscatedName("hw.s")
   private class398 field4097;
   @deob.ObfuscatedName("hw.a")
   private class398 field4099;
   @deob.ObfuscatedName("hw.i")
   private class505 field4106;
   @deob.ObfuscatedName("hw.m")
   private class508 field4090;
   @deob.ObfuscatedName("hw.r")
   private class529 field4092;
   @deob.ObfuscatedName("hw.p")
   private class529 field4093;
   @deob.ObfuscatedName("hw.b")
   private class529 field4100;
   @deob.ObfuscatedName("hw.d")
   private class973 field4088;
   @deob.ObfuscatedName("hw.k")
   private class973 field4089;
   @deob.ObfuscatedName("hw.e")
   private boolean field4103;

   public class516(class979 arg0, int arg1, int arg2) {
      this.field4107 = arg0;
      this.field4102 = class405.field3052;
      this.field4091 = arg1;
      this.field4105 = arg2;
   }

   @deob.ObfuscatedName("hw.n()V")
   private void method7190() {
      if (this.field4090 == null) {
         this.field4090 = this.field4107.method2570(false);
         this.field4090.method728(12, 4);
         ByteBuffer var1 = this.field4107.field9975;
         var1.clear();
         var1.putFloat(0.0F);
         var1.putFloat(1.0F);
         var1.putFloat(2.0F);
         this.field4090.method700(0, var1.position(), this.field4107.field9976);
         this.field4106 = this.field4107.method2571(new class509[]{new class509(class496.field3989)});
      }
   }

   @deob.ObfuscatedName("hw.k()V")
   private void method7191() {
      this.field4107.method2539(0, this.field4090);
      this.field4107.method2572(this.field4106);
      this.field4107.method2575(class522.field4132, 0, 1);
   }

   @deob.ObfuscatedName("hw.d()V")
   public void method7193() {
      this.method7190();
      switch(this.field4095) {
      case 0:
         this.field4102 = class405.field3052;
         break;
      case 1:
         this.field4102 = class405.field3056;
         break;
      case 2:
         this.field4102 = class405.field3057;
         break;
      default:
         throw new RuntimeException();
      }

      this.field4088 = this.field4107.method2513();
      if (this.field4107.field10103 > 1 && this.field4107.field9972 && this.field4107.field10080) {
         this.field4089 = this.field4107.method2513();
         this.field4097 = this.field4107.method2679(this.field4091, this.field4105, class372.field2736, this.field4102, this.field4107.field10103);
         this.field4101 = this.field4107.method2649(this.field4091, this.field4105, this.field4107.field10103);
      }

      this.field4100 = this.field4107.method2545(class372.field2736, this.field4102, this.field4091, this.field4105);
      this.field4094 = this.field4100.method500(0);
      this.field4092 = this.field4107.method2545(class372.field2736, this.field4102, this.field4091, this.field4105);
      this.field4099 = this.field4092.method500(0);
      this.field4093 = this.field4107.method2545(class372.field2736, this.field4102, this.field4091, this.field4105);
      this.field4096 = this.field4093.method500(0);
      this.field4098 = this.field4107.method2514(this.field4091, this.field4105);
      int var1 = this.field4104.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         class499 var3 = (class499)this.field4104.elementAt(var2);
         var3.method603(this.field4091, this.field4105);
      }

   }

   @deob.ObfuscatedName("hw.b(Lhf;)Z")
   public boolean method7192(class499 arg0) {
      return this.method7201(this.field4104.size(), arg0);
   }

   @deob.ObfuscatedName("hw.r(ILhf;)Z")
   private boolean method7201(int arg0, class499 arg1) {
      if (!arg1.method597() && !arg1.method598()) {
         this.method7195(arg1);
         return true;
      } else {
         this.field4104.insertElementAt(arg1, arg0);
         arg1.method603(this.field4091, this.field4105);
         int var3 = arg1.method595();
         if (var3 > this.field4095) {
            this.field4095 = var3;
         }

         arg1.field4022 = true;
         return true;
      }
   }

   @deob.ObfuscatedName("hw.p(Lhf;)V")
   public void method7195(class499 arg0) {
      arg0.method599();
      arg0.field4022 = false;
      this.field4104.removeElement(arg0);
   }

   @deob.ObfuscatedName("hw.o(IIII)Z")
   public boolean method7209(int arg0, int arg1, int arg2, int arg3) {
      if (this.field4104.isEmpty()) {
         return false;
      } else {
         if (this.field4091 != arg2 || this.field4105 != arg3 || this.field4107.field10103 != this.field4108) {
            this.field4108 = this.field4107.field10103;
            this.field4091 = arg2;
            this.field4105 = arg3;
            this.method7199();
            this.method7193();
         }

         this.field4088.method2351(0, this.field4096);
         if (this.field4098 != null) {
            this.field4088.method2352(this.field4098);
         }

         if (this.field4089 != null) {
            this.field4089.method2351(0, this.field4097);
            this.field4089.method2352(this.field4101);
            this.field4107.method11502(this.field4089);
         } else {
            this.field4107.method11502(this.field4088);
         }

         this.field4107.method2522(3, -16777216);
         this.field4107.method2562(15);
         this.field4107.method16416(0);
         if (!this.field4088.method2354()) {
            throw new RuntimeException("");
         } else {
            this.field4103 = true;
            return true;
         }
      }
   }

   @deob.ObfuscatedName("hw.a()V")
   public void method7197() {
      if (this.field4103) {
         if (this.field4089 != null) {
            this.field4107.method11503(this.field4089);
            this.field4107.method11502(this.field4088);
            this.field4089.method2356(0, 0, this.field4091, this.field4105, 0, 0, true, this.field4098 != null);
         }

         this.method7198();
         this.field4103 = false;
      }

   }

   @deob.ObfuscatedName("hw.x()V")
   private void method7198() {
      this.field4107.method11504(true);
      this.field4107.method16368();
      this.field4107.method16521(0);
      this.field4107.method16353(1);
      this.field4107.method7508();
      this.field4088.method2352((class393)null);
      this.field4107.method16329(0, 0);
      int var1 = this.field4104.size();
      this.field4093.method501();

      for(int var2 = 0; var2 < var1; ++var2) {
         class499 var3 = (class499)this.field4104.elementAt(var2);
         int var4 = var3.method600();
         boolean var5 = var1 - 1 == var2;

         for(int var6 = 0; var6 < var4; ++var6) {
            if (var5 && var4 - 1 == var6) {
               this.field4107.method11503(this.field4088);
            } else {
               this.field4088.method2351(0, this.field4099);
            }

            class529 var7 = this.field4100;
            if (var6 == 0) {
               var7 = this.field4093;
            }

            var3.method601(var6, this.field4088, var7, this.field4098, this.field4093);
            this.method7191();
            var3.method602(var6);
            class529 var8 = this.field4100;
            this.field4100 = this.field4092;
            this.field4092 = var8;
            class398 var9 = this.field4094;
            this.field4094 = this.field4099;
            this.field4099 = var9;
         }
      }

      this.field4107.method16521(1);
      this.field4107.method16353(0);
      this.field4107.method11504(false);
   }

   @deob.ObfuscatedName("hw.s()V")
   public void method7199() {
      if (this.field4089 != null) {
         this.field4089.method570();
         this.field4089 = null;
      }

      if (this.field4097 != null) {
         this.field4097.method302();
         this.field4097 = null;
      }

      if (this.field4101 != null) {
         this.field4101.method302();
         this.field4101 = null;
      }

      this.field4088.method570();
      this.field4094.method302();
      this.field4099.method302();
      this.field4096.method302();
      this.field4100.method302();
      this.field4092.method302();
      this.field4093.method302();
      this.field4098.method302();
      int var1 = this.field4104.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         class499 var3 = (class499)this.field4104.elementAt(var2);
         var3.method599();
      }

   }
}
