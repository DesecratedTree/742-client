@deob.ObfuscatedName("aaz")
public final class class28 extends class475 {
   @deob.ObfuscatedName("aaz.q")
   private final class422[] field208 = new class422[3];
   @deob.ObfuscatedName("aaz.y")
   private final int[][] field222 = new int[3][7];
   @deob.ObfuscatedName("aaz.f")
   private class595 field220 = new class595(1.0F, 1.0F, 1.0F, 1.0F);
   @deob.ObfuscatedName("aaz.ai")
   private class595 field215 = new class595(0.0F, 0.0F, 0.0F, 0.0F);
   @deob.ObfuscatedName("aaz.s")
   private class434 field213;
   @deob.ObfuscatedName("aaz.j")
   private int[] field223;

   public class28(class979 arg0) throws class185 {
      super(arg0);
      this.method454();
   }

   @deob.ObfuscatedName("aaz.u(I)Z")
   private boolean method454() throws class185 {
      this.field213 = this.field3867.method2579("Sprite");
      class225 var1 = this.field213.method6037("WVPMatrix");
      class225 var2 = this.field213.method6037("SpriteSampler");
      class225 var3 = this.field213.method6037("MaskSampler");
      class225 var4 = this.field213.method6037("MulColour");
      class225 var5 = this.field213.method6037("AddColour");
      class225 var6 = this.field213.method6037("SpriteTexCoordMatrix");
      class225 var7 = this.field213.method6037("MaskTexCoordMatrix");
      this.field208[0] = this.field213.method6039("Normal");
      this.field208[1] = this.field213.method6039("Masked");
      this.field208[2] = this.field213.method6039("AlphaTex");

      for(int var8 = 0; var8 < 3; ++var8) {
         int var9 = this.field213.method6016(this.field208[var8]);
         this.field222[var8][0] = var1.method3122(var9);
         this.field222[var8][1] = var2.method3122(var9);
         this.field222[var8][2] = var3.method3122(var9);
         this.field222[var8][5] = var4.method3122(var9);
         this.field222[var8][6] = var5.method3122(var9);
         this.field222[var8][3] = var6.method3122(var9);
         this.field222[var8][4] = var7.method3122(var9);
      }

      this.field213.method267(this.field208[0]);
      return true;
   }

   @deob.ObfuscatedName("aaz.n(II)V")
   public void method405(int arg0, int arg1) {
      switch(arg0) {
      case 0:
         this.field220.method8358(arg1);
         this.field215.method8358(0);
         break;
      case 1:
         this.field220.method8358(-1);
         this.field215.method8358(0);
         break;
      case 2:
         this.field220.method8358(arg1);
         this.field215.method8358(0);
         break;
      case 3:
         this.field220.method8358(16777215 | arg1 & -16777216);
         this.field215.method8358(arg1 & 16777215);
         break;
      case 4:
         this.field220.method8358(-1);
         this.field215.method8358(arg1);
         this.field215.method8360();
      }

   }

   @deob.ObfuscatedName("aaz.v(I)V")
   private void method456() {
      this.field213.method6066(this.field223[1], 0, this.field3860);
      this.field3867.method2647(this.field3861);
      this.field213.method6099(this.field223[0], this.field3861);
      this.field213.method6040(this.field223[3], this.field3859);
      this.field213.method6035(this.field223[5], this.field220.field5411, this.field220.field5410, this.field220.field5412, this.field220.field5409);
      this.field213.method6035(this.field223[6], this.field215.field5411, this.field215.field5410, this.field215.field5412, this.field215.field5409);
      this.field3867.method2539(0, this.field3865);
      this.field3867.method2572(this.field3862);
      this.field3867.method2575(class522.field4129, this.field3863, 2);
   }

   @deob.ObfuscatedName("aaz.k()V")
   public void method406() {
      this.field213.method267(this.field208[0]);
      this.field213.method264();
      this.field223 = this.field222[this.field213.method6018()];
      this.method456();
   }

   @deob.ObfuscatedName("aaz.d()V")
   public void method407() {
      this.field213.method267(this.field208[1]);
      this.field213.method264();
      this.field223 = this.field222[this.field213.method6018()];
      this.field213.method6066(this.field223[2], 1, this.field3866);
      this.field213.method6040(this.field223[4], this.field3864);
      this.method456();
   }
}
