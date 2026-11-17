@deob.ObfuscatedName("du")
public class class406 {
   @deob.ObfuscatedName("du.n")
   private final int field3061;
   @deob.ObfuscatedName("du.k")
   public final class850 field3066;
   @deob.ObfuscatedName("du.p")
   public int field3062;
   @deob.ObfuscatedName("du.d")
   public int field3063;
   @deob.ObfuscatedName("du.b")
   public int field3064;
   @deob.ObfuscatedName("du.r")
   public int field3065;

   public class406(class124 arg0) {
      this.field3061 = arg0.method1608();
      this.field3066 = (class850)class814.method4102(class850.method10283(), arg0.method1688());
   }

   @deob.ObfuscatedName("du.n(IIIII)V")
   public void method5531(int arg0, int arg1, int arg2, int arg3) {
      class75.method14184(arg0, arg1, arg2, this.field3066.field8737, this.field3061, this.field3066.field8736, arg3);
      this.field3063 = arg0;
      this.field3064 = arg1;
      this.field3065 = arg2;
      this.field3062 = arg3;
   }

   @deob.ObfuscatedName("du.k(I)V")
   public void method5527() {
      class75.method14184(this.field3063, this.field3064, this.field3065, this.field3066.field8737, -1, this.field3066.field8736, this.field3062);
   }

   @deob.ObfuscatedName("du.d(S)Z")
   public boolean method5528() {
      if (this.field3061 < 0) {
         return true;
      } else {
         class843 var1 = Statics.field9422.method14651(this.field3061);
         boolean var2 = var1.method14848(this.field3066.field8736);
         int[] var3 = var1.method14899();
         if (var3 != null) {
            int[] var4 = var3;

            for(int var5 = 0; var5 < var4.length; ++var5) {
               int var6 = var4[var5];
               var2 &= Statics.field2046.method14475(var6).method14319();
            }
         }

         return var2;
      }
   }
}
