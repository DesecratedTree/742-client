@deob.ObfuscatedName("ru")
public class class792 {
   @deob.ObfuscatedName("ru.b")
   public int field7233 = 0;
   @deob.ObfuscatedName("ru.r")
   public int field7241 = -1;
   @deob.ObfuscatedName("ru.p")
   public boolean field7232 = true;
   @deob.ObfuscatedName("ru.o")
   public int field7237 = -1;
   @deob.ObfuscatedName("ru.a")
   public int field7234 = 512;
   @deob.ObfuscatedName("ru.x")
   public boolean field7235 = true;
   @deob.ObfuscatedName("ru.s")
   public int field7236 = 8;
   @deob.ObfuscatedName("ru.l")
   public boolean field7228 = false;
   @deob.ObfuscatedName("ru.u")
   public int field7238 = 1190717;
   @deob.ObfuscatedName("ru.v")
   public int field7239 = 1101392064;
   @deob.ObfuscatedName("ru.g")
   public int field7240 = 255;
   @deob.ObfuscatedName("ru.h")
   public int field7227 = 63;
   @deob.ObfuscatedName("ru.e")
   public int field7242 = 0;
   @deob.ObfuscatedName("ru.z")
   public int field7243 = 64;
   @deob.ObfuscatedName("ru.d")
   public int field7229;
   @deob.ObfuscatedName("ru.k")
   public class785 field7231;

   @deob.ObfuscatedName("ru.n(Laen;I)V")
   public void method14166(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method14163(arg0, var2);
      }
   }

   @deob.ObfuscatedName("ru.k(Laen;II)V")
   private void method14163(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field7233 = method11280(arg0.method1589());
      } else if (arg1 == 2) {
         this.field7241 = arg0.method1688();
      } else if (arg1 == 3) {
         this.field7241 = arg0.method1587();
         if (this.field7241 == 65535) {
            this.field7241 = -1;
         }
      } else if (arg1 == 5) {
         this.field7232 = false;
      } else if (arg1 == 7) {
         this.field7237 = method11280(arg0.method1589());
      } else if (arg1 == 8) {
         this.field7231.field7183 = this.field7229;
      } else if (arg1 == 9) {
         this.field7234 = arg0.method1587() << 2;
      } else if (arg1 == 10) {
         this.field7235 = false;
      } else if (arg1 == 11) {
         this.field7236 = arg0.method1688();
      } else if (arg1 == 12) {
         this.field7228 = true;
      } else if (arg1 == 13) {
         this.field7238 = arg0.method1589();
      } else if (arg1 == 14) {
         this.field7239 = (arg0.method1688() << 2) * 218535843;
      } else if (arg1 == 16) {
         this.field7240 = arg0.method1688();
      } else if (arg1 == 20) {
         this.field7227 = arg0.method1587();
      } else if (arg1 == 21) {
         this.field7242 = arg0.method1688();
      } else if (arg1 == 22) {
         this.field7243 = arg0.method1587();
      }

   }

   @deob.ObfuscatedName("ru.d(I)V")
   public void method14158() {
      this.field7236 = this.field7236 << 8 | this.field7229;
   }

   @deob.ObfuscatedName("qo.b(II)I")
   private static int method11280(int arg0) {
      return arg0 == 16711935 ? -1 : Statics.method9136(arg0);
   }
}
