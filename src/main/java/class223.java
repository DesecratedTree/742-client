@deob.ObfuscatedName("aie")
public class class223 extends class89 {
   @deob.ObfuscatedName("aie.a")
   private class849 field1516 = new class849();
   @deob.ObfuscatedName("aie.x")
   private class849 field1517 = new class849();
   @deob.ObfuscatedName("aie.s")
   private int field1518 = 0;
   @deob.ObfuscatedName("aie.l")
   private int field1519 = -1;

   @deob.ObfuscatedName("aie.ak(Ladf;)V")
   public final synchronized void method3107(class89 arg0) {
      this.field1516.method14960(arg0);
   }

   @deob.ObfuscatedName("aie.aa(Ladf;)V")
   public final synchronized void method3091(class89 arg0) {
      arg0.method9864();
   }

   @deob.ObfuscatedName("aie.ao()V")
   private void method3095() {
      if (this.field1518 > 0) {
         for(class85 var1 = (class85)this.field1517.method14964(); var1 != null; var1 = (class85)this.field1517.method15006()) {
            var1.field628 -= this.field1518;
         }

         this.field1519 -= this.field1518;
         this.field1518 = 0;
      }

   }

   @deob.ObfuscatedName("aie.ab(Lnk;Ladb;)V")
   private void method3092(class674 arg0, class85 arg1) {
      while(this.field1517.field8711 != arg0 && ((class85)arg0).field628 <= arg1.field628) {
         arg0 = arg0.field6136;
      }

      class849.method10638(arg1, arg0);
      this.field1519 = ((class85)this.field1517.field8711.field6136).field628;
   }

   @deob.ObfuscatedName("aie.ae(Ladb;)V")
   private void method3089(class85 arg0) {
      arg0.method9864();
      arg0.method1158();
      class674 var2 = this.field1517.field8711.field6136;
      if (this.field1517.field8711 == var2) {
         this.field1519 = -1;
      } else {
         this.field1519 = ((class85)var2).field628;
      }

   }

   @deob.ObfuscatedName("aie.k()Ladf;")
   public class89 method1257() {
      return (class89)this.field1516.method14964();
   }

   @deob.ObfuscatedName("aie.d()Ladf;")
   public class89 method1245() {
      return (class89)this.field1516.method15006();
   }

   @deob.ObfuscatedName("aie.b()I")
   public int method1246() {
      return 0;
   }

   @deob.ObfuscatedName("aie.p([III)V")
   public final synchronized void method1244(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field1519 < 0) {
            this.method3090(arg0, arg1, arg2);
            return;
         }

         if (this.field1518 + arg2 < this.field1519) {
            this.field1518 += arg2;
            this.method3090(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field1519 - this.field1518;
         this.method3090(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field1518 += var4;
         this.method3095();
         class85 var5 = (class85)this.field1517.method14964();
         synchronized(var5) {
            int var7 = var5.method1157(this);
            if (var7 < 0) {
               var5.field628 = 0;
               this.method3089(var5);
            } else {
               var5.field628 = var7;
               this.method3092(var5.field6136, var5);
            }
         }
      } while(arg2 != 0);

   }

   @deob.ObfuscatedName("aie.az([III)V")
   private void method3090(int[] arg0, int arg1, int arg2) {
      for(class89 var4 = (class89)this.field1516.method14964(); var4 != null; var4 = (class89)this.field1516.method15006()) {
         var4.method1247(arg0, arg1, arg2);
      }

   }

   @deob.ObfuscatedName("aie.o(I)V")
   public final synchronized void method1254(int arg0) {
      do {
         if (this.field1519 < 0) {
            this.method3094(arg0);
            return;
         }

         if (this.field1518 + arg0 < this.field1519) {
            this.field1518 += arg0;
            this.method3094(arg0);
            return;
         }

         int var2 = this.field1519 - this.field1518;
         this.method3094(var2);
         arg0 -= var2;
         this.field1518 += var2;
         this.method3095();
         class85 var3 = (class85)this.field1517.method14964();
         synchronized(var3) {
            int var5 = var3.method1157(this);
            if (var5 < 0) {
               var3.field628 = 0;
               this.method3089(var3);
            } else {
               var3.field628 = var5;
               this.method3092(var3.field6136, var3);
            }
         }
      } while(arg0 != 0);

   }

   @deob.ObfuscatedName("aie.aq(I)V")
   private void method3094(int arg0) {
      for(class89 var2 = (class89)this.field1516.method14964(); var2 != null; var2 = (class89)this.field1516.method15006()) {
         var2.method1254(arg0);
      }

   }
}
