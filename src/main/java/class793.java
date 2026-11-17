@deob.ObfuscatedName("rv")
public class class793 {
   @deob.ObfuscatedName("rv.x")
   public int field7252;
   @deob.ObfuscatedName("rv.a")
   public int field7253;
   @deob.ObfuscatedName("rv.b")
   public class722 field7244;
   @deob.ObfuscatedName("rv.d")
   public class722 field7246;
   @deob.ObfuscatedName("rv.k")
   public class722 field7247;
   @deob.ObfuscatedName("rv.n")
   public class722 field7251;
   @deob.ObfuscatedName("rv.p")
   public class727 field7245;
   @deob.ObfuscatedName("rv.r")
   public class727 field7248;
   @deob.ObfuscatedName("rv.o")
   public class727 field7250;
   @deob.ObfuscatedName("rv.s")
   public boolean field7249;

   public class793(class612 arg0) {
      byte[] var2 = arg0.method8809(class780.field7158.field7155);
      this.method14171(new class124(var2));
   }

   @deob.ObfuscatedName("rv.n(Laen;B)V")
   private void method14171(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.field7251 = Statics.method1512(arg0);
         } else if (var2 == 2) {
            this.field7247 = Statics.method1512(arg0);
         } else if (var2 == 3) {
            this.field7246 = Statics.method1512(arg0);
         } else if (var2 == 4) {
            this.field7244 = Statics.method1512(arg0);
         } else if (var2 == 5) {
            this.field7248 = class727.method9837(arg0);
         } else if (var2 == 6) {
            this.field7245 = class727.method9837(arg0);
         } else if (var2 == 7) {
            this.field7250 = class727.method9837(arg0);
         } else if (var2 == 8) {
            Statics.method1512(arg0);
         } else if (var2 == 9) {
            Statics.method1512(arg0);
         } else if (var2 == 10) {
            Statics.method1512(arg0);
         } else if (var2 == 11) {
            this.field7249 = true;
         } else if (var2 == 12) {
            this.field7253 = arg0.method1591();
         } else if (var2 == 13) {
            this.field7252 = arg0.method1591();
         }
      }
   }
}
