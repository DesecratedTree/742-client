@deob.ObfuscatedName("vf")
public class class885 {
   @deob.ObfuscatedName("vf.k")
   private int field9065;
   @deob.ObfuscatedName("vf.d")
   public int field9066;
   @deob.ObfuscatedName("vf.b")
   public int field9067;
   @deob.ObfuscatedName("vf.n")
   public class886 field9064;

   @deob.ObfuscatedName("vf.n(Laen;B)V")
   public void method15432(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15433(arg0, var2);
      }
   }

   @deob.ObfuscatedName("vf.k(Laen;II)V")
   private void method15433(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field9065 = arg0.method1608();
      } else if (arg1 == 2) {
         this.field9066 = arg0.method1688();
         this.field9067 = arg0.method1688();
      }

   }

   @deob.ObfuscatedName("vf.d(I)Ldv;")
   public synchronized class407 method15435() {
      class407 var1 = (class407)this.field9064.field9072.method10909((long)this.field9065);
      if (var1 != null) {
         return var1;
      } else {
         class407 var2 = class375.method5065(this.field9064.field9070, this.field9065, 0);
         if (var2 != null) {
            this.field9064.field9072.method10880(var2, (long)this.field9065);
         }

         return var2;
      }
   }
}
