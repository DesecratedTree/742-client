@deob.ObfuscatedName("oh")
public class class698 {
   @deob.ObfuscatedName("oh.f")
   public int field6448;
   @deob.ObfuscatedName("oh.y")
   public boolean field6446;
   @deob.ObfuscatedName("oh.j")
   public boolean field6453;
   @deob.ObfuscatedName("oh.ai")
   public short[] field6444;
   @deob.ObfuscatedName("oh.ap")
   public int field6450;
   @deob.ObfuscatedName("oh.af")
   private int field6431;
   @deob.ObfuscatedName("oh.av")
   private int field6443;
   @deob.ObfuscatedName("oh.ax")
   private int field6452;
   @deob.ObfuscatedName("oh.at")
   private int field6454;
   @deob.ObfuscatedName("oh.ah")
   private int field6455;
   @deob.ObfuscatedName("oh.q")
   public class81 field6435;

   public class698(class772 arg0, int arg1, class124 arg2, int arg3) {
      if (Statics.field5543 == null) {
         method14230();
      }

      this.field6448 = arg2.method1688();
      this.field6446 = (this.field6448 & 8) != 0;
      this.field6453 = (this.field6448 & 16) != 0;
      this.field6448 &= 7;
      int var5 = arg2.method1587() << arg3;
      int var6 = arg2.method1587() << arg3;
      int var7 = arg2.method1587() << arg3;
      int var8 = arg2.method1688();
      int var9 = var8 * 2 + 1;
      this.field6444 = new short[var9];

      for(int var10 = 0; var10 < this.field6444.length; ++var10) {
         short var11 = (short)arg2.method1587();
         int var12 = var11 >>> 8;
         int var13 = var11 & 255;
         if (var12 >= var9) {
            var12 = var9 - 1;
         }

         if (var13 > var9 - var12) {
            var13 = var9 - var12;
         }

         this.field6444[var10] = (short)(var12 << 8 | var13);
      }

      int var14 = (var8 << arg1) + (1 << arg1 >> 1);
      int var15 = Statics.field7196 != null ? Statics.field7196[arg2.method1587()] : Statics.field7263[Statics.method4006(arg2.method1587()) & 65535];
      int var16 = arg2.method1688();
      this.field6450 = var16 & 31;
      this.field6431 = (var16 & 224) << 3;
      if (this.field6450 != 31) {
         this.method10279();
      }

      this.method10271(arg0, var5, var7, var6, var14, var15);
   }

   @deob.ObfuscatedName("oh.n(Lra;IIIIII)V")
   private void method10271(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.field6435 = arg0.method11507(arg1, arg2, arg3, arg4, arg5, 1.0F);
   }

   @deob.ObfuscatedName("oh.k(IIIII)V")
   public void method10274(int arg0, int arg1, int arg2, int arg3) {
      this.field6443 = arg0;
      this.field6455 = arg3;
      this.field6454 = arg2;
      this.field6452 = arg1;
   }

   @deob.ObfuscatedName("oh.d(I)V")
   private void method10279() {
      switch(this.field6450) {
      case 2:
         this.field6443 = 1;
         this.field6455 = 0;
         this.field6454 = 2048;
         this.field6452 = 2048;
         break;
      case 3:
         this.field6443 = 1;
         this.field6455 = 0;
         this.field6454 = 2048;
         this.field6452 = 4096;
         break;
      case 4:
         this.field6443 = 4;
         this.field6455 = 0;
         this.field6454 = 2048;
         this.field6452 = 2048;
         break;
      case 5:
         this.field6443 = 4;
         this.field6455 = 0;
         this.field6454 = 2048;
         this.field6452 = 8192;
         break;
      case 6:
         this.field6443 = 3;
         this.field6455 = 1280;
         this.field6454 = 768;
         this.field6452 = 2048;
         break;
      case 7:
         this.field6443 = 3;
         this.field6455 = 1280;
         this.field6454 = 768;
         this.field6452 = 4096;
         break;
      case 8:
         this.field6443 = 3;
         this.field6455 = 1024;
         this.field6454 = 1024;
         this.field6452 = 2048;
         break;
      case 9:
         this.field6443 = 3;
         this.field6455 = 1024;
         this.field6454 = 1024;
         this.field6452 = 4096;
         break;
      case 10:
         this.field6443 = 3;
         this.field6455 = 1536;
         this.field6454 = 512;
         this.field6452 = 2048;
         break;
      case 11:
         this.field6443 = 3;
         this.field6455 = 1536;
         this.field6454 = 512;
         this.field6452 = 4096;
         break;
      case 12:
         this.field6443 = 2;
         this.field6455 = 0;
         this.field6454 = 2048;
         this.field6452 = 2048;
         break;
      case 13:
         this.field6443 = 2;
         this.field6455 = 0;
         this.field6454 = 2048;
         this.field6452 = 8192;
         break;
      case 14:
         this.field6443 = 1;
         this.field6455 = 1280;
         this.field6454 = 768;
         this.field6452 = 2048;
         break;
      case 15:
         this.field6443 = 1;
         this.field6455 = 1536;
         this.field6454 = 512;
         this.field6452 = 4096;
         break;
      case 16:
         this.field6443 = 1;
         this.field6455 = 1792;
         this.field6454 = 256;
         this.field6452 = 8192;
         break;
      default:
         this.field6455 = 0;
         this.field6443 = 0;
         this.field6454 = 2048;
         this.field6452 = 2048;
      }

   }

   @deob.ObfuscatedName("oh.b(IZS)V")
   public void method10273(int arg0, boolean arg1) {
      int var4;
      if (!arg1) {
         int var3 = this.field6452 * arg0 / 50 + this.field6431 & 2047;
         switch(this.field6443) {
         case 1:
            var4 = (class603.field5469[var3 << 3] >> 4) + 1024;
            break;
         case 2:
            var4 = var3;
            break;
         case 3:
            var4 = Statics.field5543[var3] >> 1;
            break;
         case 4:
            var4 = var3 >> 10 << 11;
            break;
         case 5:
            var4 = (var3 < 1024 ? var3 : 2048 - var3) << 1;
            break;
         default:
            var4 = 2048;
         }
      } else {
         var4 = 2048;
      }

      this.field6435.method1109((float)((this.field6454 * var4 >> 11) + this.field6455) / 2048.0F);
   }

   @deob.ObfuscatedName("s.r(I)V")
   private static void method14230() {
      Statics.field5543 = class257.method8006(2048, 35, 8, 8, 4, 0.4F, true);
   }
}
