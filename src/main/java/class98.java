@deob.ObfuscatedName("ado")
public class class98 extends class674 {
   @deob.ObfuscatedName("ado.p")
   public static class849 field765 = new class849();
   @deob.ObfuscatedName("ado.o")
   public static class849 field733 = new class849();
   @deob.ObfuscatedName("ado.a")
   public static class875 field734 = new class875(16);
   @deob.ObfuscatedName("ado.j")
   public int field754 = 0;
   @deob.ObfuscatedName("ado.s")
   public int field731;
   @deob.ObfuscatedName("ado.aa")
   public int field732;
   @deob.ObfuscatedName("ado.l")
   public int field735;
   @deob.ObfuscatedName("ado.u")
   public int field736;
   @deob.ObfuscatedName("ado.x")
   public int field737;
   @deob.ObfuscatedName("ado.v")
   public int field738;
   @deob.ObfuscatedName("ado.aw")
   public int field739;
   @deob.ObfuscatedName("ado.h")
   public int field740;
   @deob.ObfuscatedName("ado.e")
   public int field741;
   @deob.ObfuscatedName("ado.av")
   public int field742;
   @deob.ObfuscatedName("ado.g")
   public int field745;
   @deob.ObfuscatedName("ado.z")
   public int field747;
   @deob.ObfuscatedName("ado.ap")
   public int field750;
   @deob.ObfuscatedName("ado.ai")
   public int field753;
   @deob.ObfuscatedName("ado.i")
   public class200 field748;
   @deob.ObfuscatedName("ado.t")
   public class211 field752;
   @deob.ObfuscatedName("ado.ah")
   public class235 field758;
   @deob.ObfuscatedName("ado.ao")
   public class235 field766;
   @deob.ObfuscatedName("ado.at")
   public class315 field757;
   @deob.ObfuscatedName("ado.ak")
   public class315 field764;
   @deob.ObfuscatedName("ado.m")
   private class843 field743;
   @deob.ObfuscatedName("ado.af")
   public class86 field756;
   @deob.ObfuscatedName("ado.ag")
   public class86 field763;
   @deob.ObfuscatedName("ado.f")
   public boolean field751;
   @deob.ObfuscatedName("ado.ax")
   public boolean field755;
   @deob.ObfuscatedName("ado.an")
   public boolean field762;
   @deob.ObfuscatedName("ado.al")
   public int[] field761;

   private class98() {
   }

   @deob.ObfuscatedName("zq.n(ZI)V")
   public static void method17090(boolean arg0) {
      for(class98 var1 = (class98)field765.method14964(); var1 != null; var1 = (class98)field765.method15006()) {
         if (var1.field758 != null) {
            Statics.field1029.method3091(var1.field758);
            var1.field758 = null;
         }

         if (var1.field766 != null) {
            Statics.field1029.method3091(var1.field766);
            var1.field766 = null;
         }

         var1.method9864();
      }

      if (arg0) {
         for(class98 var2 = (class98)field733.method14964(); var2 != null; var2 = (class98)field733.method15006()) {
            if (var2.field758 != null) {
               Statics.field1029.method3091(var2.field758);
               var2.field758 = null;
            }

            var2.method9864();
         }

         for(class98 var3 = (class98)field734.method15313(); var3 != null; var3 = (class98)field734.method15314()) {
            if (var3.field758 != null) {
               Statics.field1029.method3091(var3.field758);
               var3.field758 = null;
            }

            var3.method9864();
         }
      }

   }

   @deob.ObfuscatedName("ado.d(I)V")
   public void method1331() {
      int var1 = this.field742;
      boolean var2 = this.field755;
      if (this.field743 != null) {
         class843 var3 = this.field743.method14853(client.field2476 == 0 ? class397.field2956 : Statics.field10637);
         if (var3 != null) {
            this.field742 = var3.field8626;
            this.field755 = var3.field8630;
            this.field741 = var3.field8627 << 9;
            this.field747 = var3.field8629;
            this.field731 = var3.field8631;
            this.field739 = var3.field8597;
            this.field761 = var3.field8645;
            this.field762 = var3.field8634;
            this.field750 = var3.field8643;
            this.field753 = var3.field8610;
         } else {
            this.field742 = -1;
            this.field755 = false;
            this.field741 = 0;
            this.field747 = 0;
            this.field731 = 0;
            this.field739 = 0;
            this.field761 = null;
            this.field762 = false;
            this.field750 = 256;
            this.field753 = 256;
            this.field740 = 0;
         }
      } else if (this.field748 != null) {
         int var4 = Statics.method10036(this.field748);
         if (var1 != var4) {
            this.field742 = var4;
            class915 var5 = this.field748.field1312;
            if (var5.field9319 != null) {
               var5 = var5.method15778(Statics.field10637);
            }

            if (var5 != null) {
               this.field741 = var5.field9278 << 9;
               this.field740 = var5.field9332 << 9;
               this.field747 = var5.field9331;
               this.field755 = var5.field9334;
               this.field750 = var5.field9345;
               this.field753 = var5.field9311;
            } else {
               this.field740 = 0;
               this.field741 = 0;
               this.field747 = 0;
               this.field755 = this.field748.field1312.field9334;
               this.field750 = 256;
               this.field753 = 256;
            }
         }
      } else if (this.field752 != null) {
         this.field742 = Statics.method11103(this.field752);
         this.field755 = this.field752.field1400;
         this.field741 = this.field752.field1401 << 9;
         this.field740 = 0;
         this.field747 = this.field752.field1393;
         this.field750 = 256;
         this.field753 = 256;
      }

      if ((this.field742 != var1 || this.field755 != var2) && this.field758 != null) {
         Statics.field1029.method3091(this.field758);
         this.field758 = null;
         this.field757 = null;
         this.field756 = null;
      }

   }

   @deob.ObfuscatedName("jf.b(IIIILtr;Lahi;Laht;B)V")
   public static void method7934(int arg0, int arg1, int arg2, int arg3, class843 arg4, class200 arg5, class211 arg6) {
      class98 var7 = new class98();
      var7.field735 = arg0;
      var7.field736 = arg1 << 9;
      var7.field737 = arg2 << 9;
      if (arg4 != null) {
         var7.field743 = arg4;
         int var8 = arg4.field8585;
         int var9 = arg4.field8570;
         if (arg3 == 1 || arg3 == 3) {
            var8 = arg4.field8570;
            var9 = arg4.field8585;
         }

         var7.field738 = arg1 + var8 << 9;
         var7.field745 = arg2 + var9 << 9;
         var7.field742 = arg4.field8626;
         var7.field755 = arg4.field8630;
         var7.field741 = arg4.field8627 << 9;
         var7.field747 = arg4.field8629;
         var7.field731 = arg4.field8631;
         var7.field739 = arg4.field8597;
         var7.field761 = arg4.field8645;
         var7.field762 = arg4.field8634;
         var7.field750 = arg4.field8643;
         var7.field753 = arg4.field8610;
         var7.field740 = arg4.field8646 << 9;
         if (arg4.field8609 != null) {
            var7.field751 = true;
            var7.method1331();
         }

         if (var7.field761 != null) {
            var7.field732 = var7.field731 + (int)(Math.random() * (double)(var7.field739 - var7.field731));
         }

         field765.method14959(var7);
      } else if (arg5 != null) {
         var7.field748 = arg5;
         class915 var10 = arg5.field1312;
         if (var10.field9319 != null) {
            var7.field751 = true;
            var10 = var10.method15778(Statics.field10637);
         }

         if (var10 != null) {
            var7.field738 = var10.field9328 + arg1 << 9;
            var7.field745 = var10.field9328 + arg2 << 9;
            var7.field742 = Statics.method10036(arg5);
            var7.field755 = var10.field9334;
            var7.field741 = var10.field9278 << 9;
            var7.field747 = var10.field9331;
            var7.field750 = var10.field9345;
            var7.field753 = var10.field9311;
            var7.field740 = var10.field9332 << 9;
         }

         field733.method14959(var7);
      } else if (arg6 != null) {
         var7.field752 = arg6;
         var7.field738 = arg1 + arg6.method96() << 9;
         var7.field745 = arg2 + arg6.method96() << 9;
         var7.field742 = Statics.method11103(arg6);
         var7.field755 = arg6.field1400;
         var7.field741 = arg6.field1401 << 9;
         var7.field747 = arg6.field1393;
         var7.field750 = 256;
         var7.field753 = 256;
         var7.field740 = 0;
         field734.method15311(var7, (long)arg6.field12);
      }

   }

   @deob.ObfuscatedName("id.r(IIILtr;B)V")
   public static void method7315(int arg0, int arg1, int arg2, class843 arg3) {
      for(class98 var4 = (class98)field765.method14964(); var4 != null; var4 = (class98)field765.method15006()) {
         if (var4.field735 == arg0 && arg1 << 9 == var4.field736 && arg2 << 9 == var4.field737 && var4.field743.field8577 == arg3.field8577) {
            if (var4.field758 != null) {
               Statics.field1029.method3091(var4.field758);
               var4.field758 = null;
            }

            if (var4.field766 != null) {
               Statics.field1029.method3091(var4.field766);
               var4.field766 = null;
            }

            var4.method9864();
            return;
         }
      }

   }

   @deob.ObfuscatedName("an.p(Lahi;I)V")
   public static void method3956(class200 arg0) {
      for(class98 var1 = (class98)field733.method14964(); var1 != null; var1 = (class98)field733.method15006()) {
         if (var1.field748 == arg0) {
            if (var1.field758 != null) {
               Statics.field1029.method3091(var1.field758);
               var1.field758 = null;
            }

            var1.method9864();
            return;
         }
      }

   }

   @deob.ObfuscatedName("aet.a(Laht;I)V")
   public static void method1938(class211 arg0) {
      class98 var1 = (class98)field734.method15322((long)arg0.field12);
      if (var1 == null) {
         method7934(arg0.field1032, arg0.field16[0], arg0.field62[0], 0, (class843)null, (class200)null, arg0);
      } else {
         var1.method1331();
      }

   }
}
