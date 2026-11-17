@deob.ObfuscatedName("bn")
public class class345 {
   @deob.ObfuscatedName("bn.k")
   private int field2176 = 0;
   @deob.ObfuscatedName("bn.d")
   private int field2172 = 0;
   @deob.ObfuscatedName("bn.b")
   private int field2173 = 0;
   @deob.ObfuscatedName("bn.r")
   private final class983 field2174;
   @deob.ObfuscatedName("bn.p")
   private final class346 field2171;
   @deob.ObfuscatedName("bn.n")
   private class344[] field2170;
   @deob.ObfuscatedName("bn.o")
   public final class959 field2175;

   public class345(class983 arg0) {
      this.field2174 = arg0;
      this.field2171 = new class346(arg0);
      this.field2170 = new class344[16];
      this.field2170[1] = new class944(arg0);
      this.field2170[2] = new class940(arg0, this.field2171);
      this.field2170[4] = new class958(arg0, this.field2171);
      this.field2170[5] = new class957(arg0, this.field2171);
      this.field2170[6] = new class945(arg0);
      this.field2170[7] = new class938(arg0);
      this.field2170[3] = this.field2175 = new class959(arg0);
      this.field2170[8] = new class947(arg0, this.field2171);
      this.field2170[9] = new class942(arg0, this.field2171);
      if (!this.field2170[8].method4182()) {
         this.field2170[8] = this.field2170[4];
      }

      if (!this.field2170[9].method4182()) {
         this.field2170[9] = this.field2170[8];
      }

   }

   @deob.ObfuscatedName("bn.n(I)Z")
   public boolean method4202(int arg0) {
      return this.field2170[arg0].method4182();
   }

   @deob.ObfuscatedName("bn.k(IIIZZ)V")
   public void method4200(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      boolean var6 = arg4 & this.field2174.method16801();
      if (!var6 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
         if (arg0 == 4) {
            arg2 = arg1;
         }

         arg0 = 2;
      }

      if (arg0 != 0 && arg3) {
         arg0 |= Integer.MIN_VALUE;
      }

      if (this.field2173 != arg0) {
         if (this.field2173 != 0) {
            this.field2170[this.field2173 & Integer.MAX_VALUE].method4196();
         }

         if (arg0 != 0) {
            this.field2170[arg0 & Integer.MAX_VALUE].method4187(arg3);
            this.field2170[arg0 & Integer.MAX_VALUE].method4184(arg3);
            this.field2170[arg0 & Integer.MAX_VALUE].method4199(arg1, arg2);
         }

         this.field2173 = arg0;
         this.field2176 = arg1;
         this.field2172 = arg2;
      } else if (this.field2173 != 0) {
         this.field2170[this.field2173 & Integer.MAX_VALUE].method4184(arg3);
         if (this.field2176 != arg1 || this.field2172 != arg2) {
            this.field2170[this.field2173 & Integer.MAX_VALUE].method4199(arg1, arg2);
            this.field2176 = arg1;
            this.field2172 = arg2;
         }
      }

   }

   @deob.ObfuscatedName("bn.d(Lbw;I)Z")
   public boolean method4203(class354 arg0, int arg1) {
      if (this.field2173 == 0) {
         return false;
      } else {
         this.field2170[this.field2173 & Integer.MAX_VALUE].method4183(arg0, arg1);
         return true;
      }
   }
}
