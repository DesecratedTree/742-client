import java.util.Arrays;

@deob.ObfuscatedName("ko")
public final class class597 {
   @deob.ObfuscatedName("ko.n")
   public float[] field5413 = new float[16];
   @deob.ObfuscatedName("ko.k")
   public static final class597 field5414 = new class597();

   public class597(class597 arg0) {
      this.method8386(arg0);
   }

   public class597() {
      this.method8480();
   }

   @deob.ObfuscatedName("ko.n()V")
   public void method8480() {
      this.field5413[0] = 1.0F;
      this.field5413[1] = 0.0F;
      this.field5413[2] = 0.0F;
      this.field5413[3] = 0.0F;
      this.field5413[4] = 0.0F;
      this.field5413[5] = 1.0F;
      this.field5413[6] = 0.0F;
      this.field5413[7] = 0.0F;
      this.field5413[8] = 0.0F;
      this.field5413[9] = 0.0F;
      this.field5413[10] = 1.0F;
      this.field5413[11] = 0.0F;
      this.field5413[12] = 0.0F;
      this.field5413[13] = 0.0F;
      this.field5413[14] = 0.0F;
      this.field5413[15] = 1.0F;
   }

   @deob.ObfuscatedName("ko.k(Lko;)V")
   public void method8386(class597 arg0) {
      System.arraycopy(arg0.field5413, 0, this.field5413, 0, 16);
   }

   @deob.ObfuscatedName("ko.d(Lko;Lko;)V")
   public void method8387(class597 arg0, class597 arg1) {
      float var3 = arg0.field5413[3] * arg1.field5413[12] + arg0.field5413[2] * arg1.field5413[8] + arg0.field5413[0] * arg1.field5413[0] + arg0.field5413[1] * arg1.field5413[4];
      float var4 = arg0.field5413[3] * arg1.field5413[13] + arg0.field5413[2] * arg1.field5413[9] + arg0.field5413[0] * arg1.field5413[1] + arg0.field5413[1] * arg1.field5413[5];
      float var5 = arg0.field5413[3] * arg1.field5413[14] + arg0.field5413[2] * arg1.field5413[10] + arg0.field5413[0] * arg1.field5413[2] + arg0.field5413[1] * arg1.field5413[6];
      float var6 = arg0.field5413[3] * arg1.field5413[15] + arg0.field5413[2] * arg1.field5413[11] + arg0.field5413[0] * arg1.field5413[3] + arg0.field5413[1] * arg1.field5413[7];
      float var7 = arg0.field5413[7] * arg1.field5413[12] + arg0.field5413[6] * arg1.field5413[8] + arg0.field5413[4] * arg1.field5413[0] + arg0.field5413[5] * arg1.field5413[4];
      float var8 = arg0.field5413[7] * arg1.field5413[13] + arg0.field5413[6] * arg1.field5413[9] + arg0.field5413[4] * arg1.field5413[1] + arg0.field5413[5] * arg1.field5413[5];
      float var9 = arg0.field5413[7] * arg1.field5413[14] + arg0.field5413[6] * arg1.field5413[10] + arg0.field5413[4] * arg1.field5413[2] + arg0.field5413[5] * arg1.field5413[6];
      float var10 = arg0.field5413[7] * arg1.field5413[15] + arg0.field5413[6] * arg1.field5413[11] + arg0.field5413[4] * arg1.field5413[3] + arg0.field5413[5] * arg1.field5413[7];
      float var11 = arg0.field5413[11] * arg1.field5413[12] + arg0.field5413[10] * arg1.field5413[8] + arg0.field5413[8] * arg1.field5413[0] + arg0.field5413[9] * arg1.field5413[4];
      float var12 = arg0.field5413[11] * arg1.field5413[13] + arg0.field5413[10] * arg1.field5413[9] + arg0.field5413[8] * arg1.field5413[1] + arg0.field5413[9] * arg1.field5413[5];
      float var13 = arg0.field5413[11] * arg1.field5413[14] + arg0.field5413[10] * arg1.field5413[10] + arg0.field5413[8] * arg1.field5413[2] + arg0.field5413[9] * arg1.field5413[6];
      float var14 = arg0.field5413[11] * arg1.field5413[15] + arg0.field5413[10] * arg1.field5413[11] + arg0.field5413[8] * arg1.field5413[3] + arg0.field5413[9] * arg1.field5413[7];
      float var15 = arg0.field5413[15] * arg1.field5413[12] + arg0.field5413[14] * arg1.field5413[8] + arg0.field5413[12] * arg1.field5413[0] + arg0.field5413[13] * arg1.field5413[4];
      float var16 = arg0.field5413[15] * arg1.field5413[13] + arg0.field5413[14] * arg1.field5413[9] + arg0.field5413[12] * arg1.field5413[1] + arg0.field5413[13] * arg1.field5413[5];
      float var17 = arg0.field5413[15] * arg1.field5413[14] + arg0.field5413[14] * arg1.field5413[10] + arg0.field5413[12] * arg1.field5413[2] + arg0.field5413[13] * arg1.field5413[6];
      float var18 = arg0.field5413[15] * arg1.field5413[15] + arg0.field5413[14] * arg1.field5413[11] + arg0.field5413[12] * arg1.field5413[3] + arg0.field5413[13] * arg1.field5413[7];
      this.field5413[0] = var3;
      this.field5413[1] = var4;
      this.field5413[2] = var5;
      this.field5413[3] = var6;
      this.field5413[4] = var7;
      this.field5413[5] = var8;
      this.field5413[6] = var9;
      this.field5413[7] = var10;
      this.field5413[8] = var11;
      this.field5413[9] = var12;
      this.field5413[10] = var13;
      this.field5413[11] = var14;
      this.field5413[12] = var15;
      this.field5413[13] = var16;
      this.field5413[14] = var17;
      this.field5413[15] = var18;
   }

   @deob.ObfuscatedName("ko.b(Lko;)V")
   public void method8388(class597 arg0) {
      float var2 = this.field5413[3] * arg0.field5413[12] + this.field5413[2] * arg0.field5413[8] + this.field5413[0] * arg0.field5413[0] + this.field5413[1] * arg0.field5413[4];
      float var3 = this.field5413[3] * arg0.field5413[13] + this.field5413[2] * arg0.field5413[9] + this.field5413[0] * arg0.field5413[1] + this.field5413[1] * arg0.field5413[5];
      float var4 = this.field5413[3] * arg0.field5413[14] + this.field5413[2] * arg0.field5413[10] + this.field5413[0] * arg0.field5413[2] + this.field5413[1] * arg0.field5413[6];
      float var5 = this.field5413[3] * arg0.field5413[15] + this.field5413[2] * arg0.field5413[11] + this.field5413[0] * arg0.field5413[3] + this.field5413[1] * arg0.field5413[7];
      float var6 = this.field5413[7] * arg0.field5413[12] + this.field5413[6] * arg0.field5413[8] + this.field5413[4] * arg0.field5413[0] + this.field5413[5] * arg0.field5413[4];
      float var7 = this.field5413[7] * arg0.field5413[13] + this.field5413[6] * arg0.field5413[9] + this.field5413[4] * arg0.field5413[1] + this.field5413[5] * arg0.field5413[5];
      float var8 = this.field5413[7] * arg0.field5413[14] + this.field5413[6] * arg0.field5413[10] + this.field5413[4] * arg0.field5413[2] + this.field5413[5] * arg0.field5413[6];
      float var9 = this.field5413[7] * arg0.field5413[15] + this.field5413[6] * arg0.field5413[11] + this.field5413[4] * arg0.field5413[3] + this.field5413[5] * arg0.field5413[7];
      float var10 = this.field5413[11] * arg0.field5413[12] + this.field5413[10] * arg0.field5413[8] + this.field5413[8] * arg0.field5413[0] + this.field5413[9] * arg0.field5413[4];
      float var11 = this.field5413[11] * arg0.field5413[13] + this.field5413[10] * arg0.field5413[9] + this.field5413[8] * arg0.field5413[1] + this.field5413[9] * arg0.field5413[5];
      float var12 = this.field5413[11] * arg0.field5413[14] + this.field5413[10] * arg0.field5413[10] + this.field5413[8] * arg0.field5413[2] + this.field5413[9] * arg0.field5413[6];
      float var13 = this.field5413[11] * arg0.field5413[15] + this.field5413[10] * arg0.field5413[11] + this.field5413[8] * arg0.field5413[3] + this.field5413[9] * arg0.field5413[7];
      float var14 = this.field5413[15] * arg0.field5413[12] + this.field5413[14] * arg0.field5413[8] + this.field5413[12] * arg0.field5413[0] + this.field5413[13] * arg0.field5413[4];
      float var15 = this.field5413[15] * arg0.field5413[13] + this.field5413[14] * arg0.field5413[9] + this.field5413[12] * arg0.field5413[1] + this.field5413[13] * arg0.field5413[5];
      float var16 = this.field5413[15] * arg0.field5413[14] + this.field5413[14] * arg0.field5413[10] + this.field5413[12] * arg0.field5413[2] + this.field5413[13] * arg0.field5413[6];
      float var17 = this.field5413[15] * arg0.field5413[15] + this.field5413[14] * arg0.field5413[11] + this.field5413[12] * arg0.field5413[3] + this.field5413[13] * arg0.field5413[7];
      this.field5413[0] = var2;
      this.field5413[1] = var3;
      this.field5413[2] = var4;
      this.field5413[3] = var5;
      this.field5413[4] = var6;
      this.field5413[5] = var7;
      this.field5413[6] = var8;
      this.field5413[7] = var9;
      this.field5413[8] = var10;
      this.field5413[9] = var11;
      this.field5413[10] = var12;
      this.field5413[11] = var13;
      this.field5413[12] = var14;
      this.field5413[13] = var15;
      this.field5413[14] = var16;
      this.field5413[15] = var17;
   }

   @deob.ObfuscatedName("ko.r(Lka;)V")
   public void method8391(class583 arg0) {
      this.field5413[0] = arg0.field5314;
      this.field5413[1] = arg0.field5315;
      this.field5413[2] = arg0.field5321;
      this.field5413[3] = 0.0F;
      this.field5413[4] = arg0.field5313;
      this.field5413[5] = arg0.field5318;
      this.field5413[6] = arg0.field5319;
      this.field5413[7] = 0.0F;
      this.field5413[8] = arg0.field5320;
      this.field5413[9] = arg0.field5322;
      this.field5413[10] = arg0.field5324;
      this.field5413[11] = 0.0F;
      this.field5413[12] = arg0.field5323;
      this.field5413[13] = arg0.field5316;
      this.field5413[14] = arg0.field5317;
      this.field5413[15] = 1.0F;
   }

   @deob.ObfuscatedName("ko.p()F")
   private float method8390() {
      return this.field5413[3] * this.field5413[6] * this.field5413[9] * this.field5413[12] + (this.field5413[3] * this.field5413[5] * this.field5413[8] * this.field5413[14] + this.field5413[3] * this.field5413[4] * this.field5413[10] * this.field5413[13] + (this.field5413[2] * this.field5413[7] * this.field5413[8] * this.field5413[13] + this.field5413[2] * this.field5413[5] * this.field5413[11] * this.field5413[12] + (this.field5413[2] * this.field5413[4] * this.field5413[9] * this.field5413[15] + this.field5413[1] * this.field5413[7] * this.field5413[10] * this.field5413[12] + (this.field5413[1] * this.field5413[6] * this.field5413[8] * this.field5413[15] + this.field5413[1] * this.field5413[4] * this.field5413[11] * this.field5413[14] + (this.field5413[0] * this.field5413[7] * this.field5413[9] * this.field5413[14] + this.field5413[0] * this.field5413[6] * this.field5413[11] * this.field5413[13] + (this.field5413[0] * this.field5413[5] * this.field5413[10] * this.field5413[15] - this.field5413[0] * this.field5413[5] * this.field5413[11] * this.field5413[14] - this.field5413[0] * this.field5413[6] * this.field5413[9] * this.field5413[15]) - this.field5413[0] * this.field5413[7] * this.field5413[10] * this.field5413[13] - this.field5413[1] * this.field5413[4] * this.field5413[10] * this.field5413[15]) - this.field5413[1] * this.field5413[6] * this.field5413[11] * this.field5413[12] - this.field5413[1] * this.field5413[7] * this.field5413[8] * this.field5413[14]) - this.field5413[2] * this.field5413[4] * this.field5413[11] * this.field5413[13] - this.field5413[2] * this.field5413[5] * this.field5413[8] * this.field5413[15]) - this.field5413[2] * this.field5413[7] * this.field5413[9] * this.field5413[12] - this.field5413[3] * this.field5413[4] * this.field5413[9] * this.field5413[14]) - this.field5413[3] * this.field5413[5] * this.field5413[10] * this.field5413[12] - this.field5413[3] * this.field5413[6] * this.field5413[8] * this.field5413[13]);
   }

   @deob.ObfuscatedName("ko.o()V")
   public void method8423() {
      float var1 = 1.0F / this.method8390();
      float var2 = (this.field5413[7] * this.field5413[9] * this.field5413[14] + this.field5413[6] * this.field5413[11] * this.field5413[13] + (this.field5413[5] * this.field5413[10] * this.field5413[15] - this.field5413[5] * this.field5413[11] * this.field5413[14] - this.field5413[6] * this.field5413[9] * this.field5413[15]) - this.field5413[7] * this.field5413[10] * this.field5413[13]) * var1;
      float var3 = (this.field5413[3] * this.field5413[10] * this.field5413[13] + (this.field5413[2] * this.field5413[9] * this.field5413[15] + this.field5413[10] * -this.field5413[1] * this.field5413[15] + this.field5413[1] * this.field5413[11] * this.field5413[14] - this.field5413[2] * this.field5413[11] * this.field5413[13] - this.field5413[3] * this.field5413[9] * this.field5413[14])) * var1;
      float var4 = (this.field5413[3] * this.field5413[5] * this.field5413[14] + this.field5413[2] * this.field5413[7] * this.field5413[13] + (this.field5413[1] * this.field5413[6] * this.field5413[15] - this.field5413[1] * this.field5413[7] * this.field5413[14] - this.field5413[2] * this.field5413[5] * this.field5413[15]) - this.field5413[3] * this.field5413[6] * this.field5413[13]) * var1;
      float var5 = (this.field5413[3] * this.field5413[6] * this.field5413[9] + (this.field5413[2] * this.field5413[5] * this.field5413[11] + this.field5413[6] * -this.field5413[1] * this.field5413[11] + this.field5413[1] * this.field5413[7] * this.field5413[10] - this.field5413[2] * this.field5413[7] * this.field5413[9] - this.field5413[3] * this.field5413[5] * this.field5413[10])) * var1;
      float var6 = (this.field5413[7] * this.field5413[10] * this.field5413[12] + (this.field5413[6] * this.field5413[8] * this.field5413[15] + this.field5413[10] * -this.field5413[4] * this.field5413[15] + this.field5413[4] * this.field5413[11] * this.field5413[14] - this.field5413[6] * this.field5413[11] * this.field5413[12] - this.field5413[7] * this.field5413[8] * this.field5413[14])) * var1;
      float var7 = (this.field5413[3] * this.field5413[8] * this.field5413[14] + this.field5413[2] * this.field5413[11] * this.field5413[12] + (this.field5413[0] * this.field5413[10] * this.field5413[15] - this.field5413[0] * this.field5413[11] * this.field5413[14] - this.field5413[2] * this.field5413[8] * this.field5413[15]) - this.field5413[3] * this.field5413[10] * this.field5413[12]) * var1;
      float var8 = (this.field5413[3] * this.field5413[6] * this.field5413[12] + (this.field5413[2] * this.field5413[4] * this.field5413[15] + this.field5413[6] * -this.field5413[0] * this.field5413[15] + this.field5413[0] * this.field5413[7] * this.field5413[14] - this.field5413[2] * this.field5413[7] * this.field5413[12] - this.field5413[3] * this.field5413[4] * this.field5413[14])) * var1;
      float var9 = (this.field5413[3] * this.field5413[4] * this.field5413[10] + this.field5413[2] * this.field5413[7] * this.field5413[8] + (this.field5413[0] * this.field5413[6] * this.field5413[11] - this.field5413[0] * this.field5413[7] * this.field5413[10] - this.field5413[2] * this.field5413[4] * this.field5413[11]) - this.field5413[3] * this.field5413[6] * this.field5413[8]) * var1;
      float var10 = (this.field5413[7] * this.field5413[8] * this.field5413[13] + this.field5413[5] * this.field5413[11] * this.field5413[12] + (this.field5413[4] * this.field5413[9] * this.field5413[15] - this.field5413[4] * this.field5413[11] * this.field5413[13] - this.field5413[5] * this.field5413[8] * this.field5413[15]) - this.field5413[7] * this.field5413[9] * this.field5413[12]) * var1;
      float var11 = (this.field5413[3] * this.field5413[9] * this.field5413[12] + (this.field5413[1] * this.field5413[8] * this.field5413[15] + this.field5413[9] * -this.field5413[0] * this.field5413[15] + this.field5413[0] * this.field5413[11] * this.field5413[13] - this.field5413[1] * this.field5413[11] * this.field5413[12] - this.field5413[3] * this.field5413[8] * this.field5413[13])) * var1;
      float var12 = (this.field5413[3] * this.field5413[4] * this.field5413[13] + this.field5413[1] * this.field5413[7] * this.field5413[12] + (this.field5413[0] * this.field5413[5] * this.field5413[15] - this.field5413[0] * this.field5413[7] * this.field5413[13] - this.field5413[1] * this.field5413[4] * this.field5413[15]) - this.field5413[3] * this.field5413[5] * this.field5413[12]) * var1;
      float var13 = (this.field5413[3] * this.field5413[5] * this.field5413[8] + (this.field5413[1] * this.field5413[4] * this.field5413[11] + this.field5413[5] * -this.field5413[0] * this.field5413[11] + this.field5413[0] * this.field5413[7] * this.field5413[9] - this.field5413[1] * this.field5413[7] * this.field5413[8] - this.field5413[3] * this.field5413[4] * this.field5413[9])) * var1;
      float var14 = (this.field5413[6] * this.field5413[9] * this.field5413[12] + (this.field5413[5] * this.field5413[8] * this.field5413[14] + this.field5413[9] * -this.field5413[4] * this.field5413[14] + this.field5413[4] * this.field5413[10] * this.field5413[13] - this.field5413[5] * this.field5413[10] * this.field5413[12] - this.field5413[6] * this.field5413[8] * this.field5413[13])) * var1;
      float var15 = (this.field5413[2] * this.field5413[8] * this.field5413[13] + this.field5413[1] * this.field5413[10] * this.field5413[12] + (this.field5413[0] * this.field5413[9] * this.field5413[14] - this.field5413[0] * this.field5413[10] * this.field5413[13] - this.field5413[1] * this.field5413[8] * this.field5413[14]) - this.field5413[2] * this.field5413[9] * this.field5413[12]) * var1;
      float var16 = (this.field5413[2] * this.field5413[5] * this.field5413[12] + (this.field5413[1] * this.field5413[4] * this.field5413[14] + this.field5413[5] * -this.field5413[0] * this.field5413[14] + this.field5413[0] * this.field5413[6] * this.field5413[13] - this.field5413[1] * this.field5413[6] * this.field5413[12] - this.field5413[2] * this.field5413[4] * this.field5413[13])) * var1;
      float var17 = (this.field5413[2] * this.field5413[4] * this.field5413[9] + this.field5413[1] * this.field5413[6] * this.field5413[8] + (this.field5413[0] * this.field5413[5] * this.field5413[10] - this.field5413[0] * this.field5413[6] * this.field5413[9] - this.field5413[1] * this.field5413[4] * this.field5413[10]) - this.field5413[2] * this.field5413[5] * this.field5413[8]) * var1;
      this.field5413[0] = var2;
      this.field5413[1] = var3;
      this.field5413[2] = var4;
      this.field5413[3] = var5;
      this.field5413[4] = var6;
      this.field5413[5] = var7;
      this.field5413[6] = var8;
      this.field5413[7] = var9;
      this.field5413[8] = var10;
      this.field5413[9] = var11;
      this.field5413[10] = var12;
      this.field5413[11] = var13;
      this.field5413[12] = var14;
      this.field5413[13] = var15;
      this.field5413[14] = var16;
      this.field5413[15] = var17;
   }

   @deob.ObfuscatedName("ko.a(FFFF)V")
   public void method8392(float arg0, float arg1, float arg2, float arg3) {
      this.field5413[0] = arg0;
      this.field5413[1] = 0.0F;
      this.field5413[2] = 0.0F;
      this.field5413[3] = 0.0F;
      this.field5413[4] = 0.0F;
      this.field5413[5] = arg1;
      this.field5413[6] = 0.0F;
      this.field5413[7] = 0.0F;
      this.field5413[8] = 0.0F;
      this.field5413[9] = 0.0F;
      this.field5413[10] = arg2;
      this.field5413[11] = 0.0F;
      this.field5413[12] = 0.0F;
      this.field5413[13] = 0.0F;
      this.field5413[14] = 0.0F;
      this.field5413[15] = arg3;
   }

   @deob.ObfuscatedName("ko.x()Z")
   public boolean method8393() {
      return this.field5413[0] == 1.0F && this.field5413[1] == 0.0F && this.field5413[2] == 0.0F && this.field5413[3] == 0.0F && this.field5413[4] == 0.0F && this.field5413[5] == 1.0F && this.field5413[6] == 0.0F && this.field5413[7] == 0.0F && this.field5413[8] == 0.0F && this.field5413[9] == 0.0F && this.field5413[10] == 1.0F && this.field5413[11] == 0.0F && this.field5413[12] == 0.0F && this.field5413[13] == 0.0F && this.field5413[14] == 0.0F && this.field5413[15] == 1.0F;
   }

   @deob.ObfuscatedName("ko.s(FFF[F)V")
   public void method8394(float arg0, float arg1, float arg2, float[] arg3) {
      arg3[0] = this.field5413[8] * arg2 + this.field5413[0] * arg0 + this.field5413[4] * arg1 + this.field5413[12];
      arg3[1] = this.field5413[9] * arg2 + this.field5413[1] * arg0 + this.field5413[5] * arg1 + this.field5413[13];
      arg3[2] = this.field5413[10] * arg2 + this.field5413[2] * arg0 + this.field5413[6] * arg1 + this.field5413[14];
      if (arg3.length > 3) {
         arg3[3] = this.field5413[11] * arg2 + this.field5413[3] * arg0 + this.field5413[7] * arg1 + this.field5413[15];
      }

   }

   @deob.ObfuscatedName("ko.l([F)V")
   public void method8420(float[] arg0) {
      float var2 = arg0[0];
      float var3 = arg0[1];
      float var4 = arg0[2];
      arg0[0] = this.field5413[8] * var4 + this.field5413[0] * var2 + this.field5413[4] * var3 + this.field5413[12];
      arg0[1] = this.field5413[9] * var4 + this.field5413[1] * var2 + this.field5413[5] * var3 + this.field5413[13];
      arg0[2] = this.field5413[10] * var4 + this.field5413[2] * var2 + this.field5413[6] * var3 + this.field5413[14];
   }

   @deob.ObfuscatedName("ko.u(FFF[F)V")
   public void method8396(float arg0, float arg1, float arg2, float[] arg3) {
      arg3[0] = this.field5413[8] * arg2 + this.field5413[0] * arg0 + this.field5413[4] * arg1;
      arg3[1] = this.field5413[9] * arg2 + this.field5413[1] * arg0 + this.field5413[5] * arg1;
      arg3[2] = this.field5413[10] * arg2 + this.field5413[2] * arg0 + this.field5413[6] * arg1;
      if (arg3.length > 3) {
         arg3[3] = this.field5413[11] * arg2 + this.field5413[3] * arg0 + this.field5413[7] * arg1;
      }

   }

   @deob.ObfuscatedName("ko.v(FFFFFF)V")
   public void method8397(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field5413[0] = 2.0F / (arg1 - arg0);
      this.field5413[1] = 0.0F;
      this.field5413[2] = 0.0F;
      this.field5413[3] = 0.0F;
      this.field5413[4] = 0.0F;
      this.field5413[5] = 2.0F / (arg3 - arg2);
      this.field5413[6] = 0.0F;
      this.field5413[7] = 0.0F;
      this.field5413[8] = 0.0F;
      this.field5413[9] = 0.0F;
      this.field5413[10] = 2.0F / (arg5 - arg4);
      this.field5413[11] = 0.0F;
      this.field5413[12] = -(arg0 + arg1) / (arg1 - arg0);
      this.field5413[13] = -(arg2 + arg3) / (arg3 - arg2);
      this.field5413[14] = -(arg4 + arg5) / (arg5 - arg4);
      this.field5413[15] = 1.0F;
   }

   @deob.ObfuscatedName("ko.g(FFFF)V")
   public void method8398(float arg0, float arg1, float arg2, float arg3) {
      float var5 = (float)(Math.tan((double)(arg2 / 2.0F)) * (double)arg0);
      float var6 = (float)(Math.tan((double)(arg3 / 2.0F)) * (double)arg0);
      this.method8400(-var5, var5, -var6, var6, arg0, arg1);
   }

   @deob.ObfuscatedName("ko.h(FFF)V")
   public void method8399(float arg0, float arg1, float arg2) {
      this.method8397(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
   }

   @deob.ObfuscatedName("ko.e(FFFFFF)V")
   private void method8400(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field5413[0] = arg4 * 2.0F / (arg1 - arg0);
      this.field5413[1] = 0.0F;
      this.field5413[2] = 0.0F;
      this.field5413[3] = 0.0F;
      this.field5413[4] = 0.0F;
      this.field5413[5] = arg4 * 2.0F / (arg3 - arg2);
      this.field5413[6] = 0.0F;
      this.field5413[7] = 0.0F;
      this.field5413[8] = (arg0 + arg1) / (arg1 - arg0);
      this.field5413[9] = (arg2 + arg3) / (arg3 - arg2);
      this.field5413[10] = (arg4 + arg5) / (arg5 - arg4);
      this.field5413[11] = 1.0F;
      this.field5413[12] = 0.0F;
      this.field5413[13] = 0.0F;
      this.field5413[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
      this.field5413[15] = 0.0F;
   }

   @deob.ObfuscatedName("ko.z(FFFFFFFF)V")
   public void method8411(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
      this.field5413[0] = arg2 * 2.0F / arg6;
      this.field5413[1] = 0.0F;
      this.field5413[2] = 0.0F;
      this.field5413[3] = 0.0F;
      this.field5413[4] = 0.0F;
      this.field5413[5] = arg3 * 2.0F / arg7;
      this.field5413[6] = 0.0F;
      this.field5413[7] = 0.0F;
      this.field5413[8] = arg0 * 2.0F / arg6 - 1.0F;
      this.field5413[9] = arg1 * 2.0F / arg7 - 1.0F;
      this.field5413[10] = (arg4 + arg5) / (arg5 - arg4);
      this.field5413[11] = 1.0F;
      this.field5413[12] = 0.0F;
      this.field5413[13] = 0.0F;
      this.field5413[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
      this.field5413[15] = 0.0F;
   }

   @deob.ObfuscatedName("ko.m(FFFFFFFFF)V")
   public void method8424(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
      this.method8397(-(arg0 * arg8) / arg2, (arg6 - arg0) * arg8 / arg2, -(arg1 * arg8) / arg3, (arg7 - arg1) * arg8 / arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ko.i()F")
   public float method8403() {
      return -(this.field5413[15] + this.field5413[14]) / (this.field5413[11] + this.field5413[10]);
   }

   @deob.ObfuscatedName("ko.t()F")
   public float method8402() {
      return (this.field5413[14] - this.field5413[15]) / (this.field5413[11] - this.field5413[10]);
   }

   @deob.ObfuscatedName("ko.c([F)[F")
   public float[] method8405(float[] arg0) {
      float var2 = this.field5413[3] + this.field5413[0];
      float var3 = this.field5413[7] + this.field5413[4];
      float var4 = this.field5413[11] + this.field5413[8];
      double var5 = Math.sqrt((double)(var4 * var4 + var2 * var2 + var3 * var3));
      arg0[0] = (float)((double)var2 / var5);
      arg0[1] = (float)((double)var3 / var5);
      arg0[2] = (float)((double)var4 / var5);
      arg0[3] = (float)((double)(this.field5413[15] + this.field5413[12]) / var5);
      return arg0;
   }

   @deob.ObfuscatedName("ko.w([F)[F")
   public float[] method8406(float[] arg0) {
      float var2 = this.field5413[3] - this.field5413[0];
      float var3 = this.field5413[7] - this.field5413[4];
      float var4 = this.field5413[11] - this.field5413[8];
      double var5 = Math.sqrt((double)(var4 * var4 + var2 * var2 + var3 * var3));
      arg0[0] = (float)((double)var2 / var5);
      arg0[1] = (float)((double)var3 / var5);
      arg0[2] = (float)((double)var4 / var5);
      arg0[3] = (float)((double)(this.field5413[15] - this.field5413[12]) / var5);
      return arg0;
   }

   @deob.ObfuscatedName("ko.q([F)[F")
   public float[] method8464(float[] arg0) {
      float var2 = this.field5413[3] + this.field5413[1];
      float var3 = this.field5413[7] + this.field5413[5];
      float var4 = this.field5413[11] + this.field5413[9];
      double var5 = Math.sqrt((double)(var4 * var4 + var2 * var2 + var3 * var3));
      arg0[0] = (float)((double)var2 / var5);
      arg0[1] = (float)((double)var3 / var5);
      arg0[2] = (float)((double)var4 / var5);
      arg0[3] = (float)((double)(this.field5413[15] + this.field5413[13]) / var5);
      return arg0;
   }

   @deob.ObfuscatedName("ko.y([F)[F")
   public float[] method8408(float[] arg0) {
      float var2 = this.field5413[3] - this.field5413[1];
      float var3 = this.field5413[7] - this.field5413[5];
      float var4 = this.field5413[11] - this.field5413[9];
      double var5 = Math.sqrt((double)(var4 * var4 + var2 * var2 + var3 * var3));
      arg0[0] = (float)((double)var2 / var5);
      arg0[1] = (float)((double)var3 / var5);
      arg0[2] = (float)((double)var4 / var5);
      arg0[3] = (float)((double)(this.field5413[15] - this.field5413[13]) / var5);
      return arg0;
   }

   @deob.ObfuscatedName("ko.j([F)[F")
   public float[] method8409(float[] arg0) {
      float var2 = this.field5413[3] + this.field5413[2];
      float var3 = this.field5413[7] + this.field5413[6];
      float var4 = this.field5413[11] + this.field5413[10];
      double var5 = Math.sqrt((double)(var4 * var4 + var2 * var2 + var3 * var3));
      arg0[0] = (float)((double)var2 / var5);
      arg0[1] = (float)((double)var3 / var5);
      arg0[2] = (float)((double)var4 / var5);
      arg0[3] = (float)((double)(this.field5413[15] + this.field5413[14]) / var5);
      return arg0;
   }

   @deob.ObfuscatedName("ko.f([F)[F")
   public float[] method8410(float[] arg0) {
      float var2 = this.field5413[3] - this.field5413[2];
      float var3 = this.field5413[7] - this.field5413[6];
      float var4 = this.field5413[11] - this.field5413[10];
      double var5 = Math.sqrt((double)(var4 * var4 + var2 * var2 + var3 * var3));
      arg0[0] = (float)((double)var2 / var5);
      arg0[1] = (float)((double)var3 / var5);
      arg0[2] = (float)((double)var4 / var5);
      arg0[3] = (float)((double)(this.field5413[15] - this.field5413[14]) / var5);
      return arg0;
   }

   @deob.ObfuscatedName("ko.ai()V")
   public void method8419() {
      float var1 = this.field5413[0];
      float var2 = this.field5413[4];
      float var3 = this.field5413[8];
      float var4 = this.field5413[12];
      float var5 = this.field5413[1];
      float var6 = this.field5413[5];
      float var7 = this.field5413[9];
      float var8 = this.field5413[13];
      float var9 = this.field5413[2];
      float var10 = this.field5413[6];
      float var11 = this.field5413[10];
      float var12 = this.field5413[14];
      float var13 = this.field5413[3];
      float var14 = this.field5413[7];
      float var15 = this.field5413[11];
      float var16 = this.field5413[15];
      this.field5413[0] = var1;
      this.field5413[1] = var2;
      this.field5413[2] = var3;
      this.field5413[3] = var4;
      this.field5413[4] = var5;
      this.field5413[5] = var6;
      this.field5413[6] = var7;
      this.field5413[7] = var8;
      this.field5413[8] = var9;
      this.field5413[9] = var10;
      this.field5413[10] = var11;
      this.field5413[11] = var12;
      this.field5413[12] = var13;
      this.field5413[13] = var14;
      this.field5413[14] = var15;
      this.field5413[15] = var16;
   }

   @deob.ObfuscatedName("ko.ap([F)[F")
   public float[] method8412(float[] arg0) {
      System.arraycopy(this.field5413, 0, arg0, 0, 16);
      return arg0;
   }

   @deob.ObfuscatedName("ko.av([F)[F")
   public float[] method8413(float[] arg0) {
      System.arraycopy(this.field5413, 0, arg0, 0, 16);
      arg0[3] = 0.0F;
      arg0[7] = 0.0F;
      arg0[11] = 0.0F;
      arg0[12] = 0.0F;
      arg0[13] = 0.0F;
      arg0[14] = 0.0F;
      arg0[15] = 1.0F;
      return arg0;
   }

   @deob.ObfuscatedName("ko.ax([F)[F")
   public float[] method8407(float[] arg0) {
      arg0[0] = this.field5413[0];
      arg0[1] = this.field5413[1];
      arg0[2] = this.field5413[2];
      arg0[3] = this.field5413[4];
      arg0[4] = this.field5413[5];
      arg0[5] = this.field5413[6];
      arg0[6] = this.field5413[8];
      arg0[7] = this.field5413[9];
      arg0[8] = this.field5413[10];
      return arg0;
   }

   @deob.ObfuscatedName("ko.af([F)[F")
   public float[] method8415(float[] arg0) {
      arg0[0] = this.field5413[0];
      arg0[1] = this.field5413[4];
      arg0[2] = this.field5413[8];
      arg0[3] = this.field5413[12];
      arg0[4] = this.field5413[1];
      arg0[5] = this.field5413[5];
      arg0[6] = this.field5413[9];
      arg0[7] = this.field5413[13];
      arg0[8] = this.field5413[2];
      arg0[9] = this.field5413[6];
      arg0[10] = this.field5413[10];
      arg0[11] = this.field5413[14];
      arg0[12] = this.field5413[3];
      arg0[13] = this.field5413[7];
      arg0[14] = this.field5413[11];
      arg0[15] = this.field5413[15];
      return arg0;
   }

   @deob.ObfuscatedName("ko.at([F)[F")
   public float[] method8477(float[] arg0) {
      arg0[0] = this.field5413[0];
      arg0[1] = this.field5413[1];
      arg0[2] = this.field5413[4];
      arg0[3] = this.field5413[5];
      arg0[4] = this.field5413[8];
      arg0[5] = this.field5413[9];
      arg0[6] = this.field5413[12];
      arg0[7] = this.field5413[13];
      return arg0;
   }

   @deob.ObfuscatedName("ko.ah([F)[F")
   public float[] method8442(float[] arg0) {
      arg0[0] = this.field5413[0];
      arg0[1] = this.field5413[4];
      arg0[2] = this.field5413[8];
      arg0[3] = this.field5413[12];
      arg0[4] = this.field5413[1];
      arg0[5] = this.field5413[5];
      arg0[6] = this.field5413[9];
      arg0[7] = this.field5413[13];
      return arg0;
   }

   @deob.ObfuscatedName("ko.aw([F)[F")
   public float[] method8384(float[] arg0) {
      arg0[0] = this.field5413[0];
      arg0[1] = this.field5413[1];
      arg0[2] = 0.0F;
      arg0[3] = 0.0F;
      arg0[4] = this.field5413[4];
      arg0[5] = this.field5413[5];
      arg0[6] = 0.0F;
      arg0[7] = 0.0F;
      arg0[8] = this.field5413[12];
      arg0[9] = this.field5413[13];
      arg0[10] = this.field5413[14];
      arg0[11] = 0.0F;
      arg0[12] = 0.0F;
      arg0[13] = 0.0F;
      arg0[14] = 0.0F;
      arg0[15] = 1.0F;
      return arg0;
   }

   @deob.ObfuscatedName("ko.al(IIIFFF)V")
   public void method8481(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
      if (arg0 != 0) {
         float var7 = class586.field5341[arg0 & 16383];
         float var8 = class586.field5340[arg0 & 16383];
         this.field5413[0] = (float)arg1 * var7;
         this.field5413[5] = (float)arg2 * var7;
         this.field5413[1] = (float)arg1 * var8;
         this.field5413[4] = (float)arg2 * -var8;
         this.field5413[10] = 1.0F;
         float[] var9 = this.field5413;
         float[] var10 = this.field5413;
         float[] var11 = this.field5413;
         this.field5413[9] = 0.0F;
         var11[8] = 0.0F;
         var10[6] = 0.0F;
         var9[2] = 0.0F;
      } else {
         this.field5413[0] = (float)arg1;
         this.field5413[5] = (float)arg2;
         this.field5413[10] = 1.0F;
         float[] var12 = this.field5413;
         float[] var13 = this.field5413;
         float[] var14 = this.field5413;
         float[] var15 = this.field5413;
         float[] var16 = this.field5413;
         this.field5413[9] = 0.0F;
         var16[8] = 0.0F;
         var15[6] = 0.0F;
         var14[4] = 0.0F;
         var13[2] = 0.0F;
         var12[1] = 0.0F;
      }

      float[] var17 = this.field5413;
      float[] var18 = this.field5413;
      this.field5413[11] = 0.0F;
      var18[7] = 0.0F;
      var17[3] = 0.0F;
      this.field5413[15] = 1.0F;
      this.field5413[12] = arg3;
      this.field5413[13] = arg4;
      this.field5413[14] = arg5;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            var1.append(this.field5413[var2 * 4 + var3]);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public int hashCode() {
      byte var1 = 1;
      return var1 * 31 + Arrays.hashCode(this.field5413);
   }

   public boolean equals(Object arg0) {
      if (!(arg0 instanceof class597)) {
         return false;
      } else {
         class597 var2 = (class597)arg0;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.field5413[var3] != var2.field5413[var3]) {
               return false;
            }
         }

         return true;
      }
   }
}
