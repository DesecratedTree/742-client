@deob.ObfuscatedName("all")
public class class307 extends class260 {
   @deob.ObfuscatedName("all.a")
   private class453 field1916;
   @deob.ObfuscatedName("all.x")
   private float field1915;
   @deob.ObfuscatedName("all.s")
   private float field1917;
   @deob.ObfuscatedName("all.l")
   private float field1918;

   public class307(int arg0, class453 arg1, float arg2, float arg3) {
      super(arg0);
      this.field1916 = arg1;
      this.field1915 = arg2;
      this.field1917 = arg3;
   }

   public class307(int arg0, class124 arg1) {
      super(arg0);
      this.field1916 = class453.method5178(arg1.method1688());
      this.field1915 = arg1.method1660();
      this.field1917 = arg1.method1660();
   }

   @deob.ObfuscatedName("all.k(FB)V")
   public void method3497(float arg0) {
      this.field1918 += this.field1917 * arg0;
   }

   @deob.ObfuscatedName("all.d(Lfv;Lka;Lko;I)V")
   public void method3496(class461 arg0, class583 arg1, class597 arg2) {
      float var4 = (float)Math.sin((double)this.field1918);
      float var5 = this.field1915 * var4;
      if (class453.field3744 == this.field1916) {
         arg0.field3806 = (int)((float)arg0.field3806 + var5);
         arg1.method8072(var5, 0.0F, 0.0F);
      } else if (class453.field3745 == this.field1916) {
         arg0.field3807 = (int)((float)arg0.field3807 + var5);
         arg1.method8072(0.0F, var5, 0.0F);
      } else if (class453.field3748 == this.field1916) {
         arg0.field3805 = (int)((float)arg0.field3805 + var5);
         arg1.method8072(0.0F, 0.0F, var5);
      } else if (class453.field3747 == this.field1916) {
         arg1.method8126(1.0F, 0.0F, 0.0F, var5);
      } else if (class453.field3746 == this.field1916) {
         arg1.method8126(0.0F, 1.0F, 0.0F, var5);
      } else if (class453.field3749 == this.field1916) {
         arg1.method8126(0.0F, 0.0F, 1.0F, var5);
      }

   }

   @deob.ObfuscatedName("all.b(Laen;I)V")
   public void method3499(class124 arg0) {
      this.field1916 = class453.method5178(arg0.method1688());
      this.field1915 = arg0.method1660();
      this.field1917 = arg0.method1660();
   }
}
