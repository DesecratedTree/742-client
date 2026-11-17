@deob.ObfuscatedName("dz")
public final class class411 {
   @deob.ObfuscatedName("dz.b")
   public boolean field3098 = false;
   @deob.ObfuscatedName("dz.r")
   private class200 field3097 = null;
   @deob.ObfuscatedName("dz.p")
   private class211 field3100 = null;
   @deob.ObfuscatedName("dz.k")
   private final int field3099;
   @deob.ObfuscatedName("dz.d")
   public final int field3096;
   @deob.ObfuscatedName("dz.o")
   private int[] field3101;

   public class411(class124 arg0, int arg1) {
      this.field3099 = arg1;
      int var3 = arg0.method1688();
      switch(var3) {
      case 0:
         this.field3096 = arg0.method1608();
         break;
      case 1:
         this.field3096 = -1;
         break;
      default:
         this.field3096 = -1;
      }

      arg0.method1599();
   }

   @deob.ObfuscatedName("dz.n(IIIIB)V")
   public void method5647(int arg0, int arg1, int arg2, int arg3) {
      if (!this.field3098) {
         this.field3098 = true;
         if (this.field3096 >= 0) {
            this.field3097 = new class200(client.field2468.method9639(), 25);
            this.field3097.field12 = this.field3099;
            this.field3097.field42 = client.field2418;
            this.field3097.method2811(Statics.field93.method15857(this.field3096));
            this.field3097.method95(this.field3097.field1312.field9328);
            this.field3097.field67 = this.field3097.field1312.field9306 << 3;
            this.field3097.field19 = ++class397.field2948 - 1;
         } else {
            this.field3100 = new class211(client.field2468.method9639(), 25);
            this.field3100.method2871(Statics.field3803);
            this.field3100.field12 = this.field3099;
            this.field3100.field42 = client.field2418;
            this.field3100.field19 = ++class397.field2948 - 1;
         }
      }

      if (this.field3096 >= 0) {
         this.field3097.method2805(arg2, arg0, arg1, true, this.field3097.method96());
         this.field3097.method117(arg3, true);
      } else {
         this.field3100.field1032 = this.field3100.field1034 = (byte)arg2;
         this.field3100.method2865(arg0, arg1);
         this.field3100.method117(arg3, true);
      }

   }

   @deob.ObfuscatedName("dz.k(B)V")
   public void method5643() {
      this.field3097 = null;
      this.field3100 = null;
      this.field3098 = false;
   }

   @deob.ObfuscatedName("dz.d(IIIS)V")
   public void method5644(int arg0, int arg1, int arg2) {
      if (this.field3097 != null) {
         this.field3097.method2805(arg0, arg1, arg2, true, this.field3097.method96());
      } else {
         this.field3100.field1032 = this.field3100.field1034 = (byte)arg0;
         this.field3100.method2865(arg1, arg2);
      }

   }

   @deob.ObfuscatedName("dz.b(I)Laab;")
   public class4 method5645() {
      return this.field3097 != null ? this.field3097 : this.field3100;
   }

   @deob.ObfuscatedName("dz.r(I)Z")
   public boolean method5642() {
      if (this.field3096 < 0) {
         return true;
      } else {
         class915 var1 = Statics.field93.method15857(this.field3096);
         boolean var2 = var1.method15812();
         if (this.field3101 == null) {
            class743 var3 = Statics.field8402.method10795(var1.field9287);
            this.field3101 = var3.method10981();
         }

         int[] var4 = this.field3101;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            int var6 = var4[var5];
            var2 &= Statics.field2046.method14475(var6).method14319();
         }

         return var2;
      }
   }
}
