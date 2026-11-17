@deob.ObfuscatedName("r")
public class class771 {
   private class771() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ed.n(Llc;B)V")
   public static void method5691(class612 arg0) {
      Statics.field7091 = arg0.method8786("p11_full");
      Statics.field7084 = arg0.method8786("p12_full");
      Statics.field4150 = arg0.method8786("b12_full");
   }

   @deob.ObfuscatedName("dj.k(Llc;B)V")
   public static void method5405(class612 arg0) {
      Statics.field7083 = arg0.method8786("headicons_pk");
      Statics.field7086 = arg0.method8786("headicons_prayer");
      Statics.field7087 = arg0.method8786("hint_headicons");
      Statics.field6640 = arg0.method8786("hint_mapmarkers");
      Statics.field7097 = arg0.method8786("mapflag");
      Statics.field7089 = arg0.method8786("cross");
      Statics.field7092 = arg0.method8786("mapdots");
      Statics.field7085 = arg0.method8786("name_icons");
      Statics.field6806 = arg0.method8786("floorshadows");
      Statics.field9 = arg0.method8786("compass");
      Statics.field7088 = arg0.method8786("otherlevel");
      Statics.field8401 = arg0.method8786("hint_mapedge");
   }

   @deob.ObfuscatedName("aau.d(B)[I")
   public static int[] method438() {
      return new int[]{Statics.field7091, Statics.field7084, Statics.field4150};
   }

   @deob.ObfuscatedName("id.b(Lra;I)V")
   public static void method7316(class772 arg0) {
      Statics.field5483 = (class609)Statics.field10616.method7870(client.field2430, Statics.field7091, true, true);
      Statics.field7093 = Statics.field10616.method7871(client.field2430, Statics.field7091);
      Statics.field6177 = (class609)Statics.field10616.method7870(client.field2430, Statics.field7084, true, true);
      Statics.field7094 = Statics.field10616.method7871(client.field2430, Statics.field7084);
      Statics.field7095 = (class609)Statics.field10616.method7870(client.field2430, Statics.field4150, true, true);
      Statics.field1855 = Statics.field10616.method7871(client.field2430, Statics.field4150);
   }

   @deob.ObfuscatedName("jm.r(Llc;B)I")
   public static int method7975(class612 arg0) {
      int var1 = 0;
      if (arg0.method8790(Statics.field7083)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field7086)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field7087)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field6640)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field7097)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field7089)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field7092)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field7085)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field6806)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field9)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field7088)) {
         ++var1;
      }

      if (arg0.method8790(Statics.field8401)) {
         ++var1;
      }

      return var1;
   }

   @deob.ObfuscatedName("tu.p(I)I")
   public static int method14947() {
      return 12;
   }

   @deob.ObfuscatedName("po.o(Lra;Llc;I)V")
   public static void method10818(class772 arg0, class612 arg1) {
      class407[] var2 = class375.method5064(arg1, Statics.field7083, 0);
      Statics.field6678 = new class383[var2.length];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Statics.field6678[var3] = arg0.method7529(var2[var3], true);
      }

      class407[] var4 = class375.method5064(arg1, Statics.field7086, 0);
      Statics.field7096 = new class383[var4.length];

      for(int var5 = 0; var5 < var4.length; ++var5) {
         Statics.field7096[var5] = arg0.method7529(var4[var5], true);
      }

      class407[] var6 = class375.method5064(arg1, Statics.field7087, 0);
      Statics.field3102 = new class383[var6.length];

      for(int var7 = 0; var7 < var6.length; ++var7) {
         Statics.field3102[var7] = arg0.method7529(var6[var7], true);
      }

      class407[] var8 = class375.method5064(arg1, Statics.field6640, 0);
      Statics.field7090 = new class383[var8.length];

      for(int var9 = 0; var9 < var8.length; ++var9) {
         Statics.field7090[var9] = arg0.method7529(var8[var9], true);
      }

      class407[] var10 = class375.method5064(arg1, Statics.field7097, 0);
      Statics.field3083 = new class383[var10.length];
      byte var11 = 25;

      for(int var12 = 0; var12 < var10.length; ++var12) {
         var10[var12].method5598(-var11 + (int)(Math.random() * (double)var11 * 2.0D), -var11 + (int)(Math.random() * (double)var11 * 2.0D), -var11 + (int)(Math.random() * (double)var11 * 2.0D));
         Statics.field3083[var12] = arg0.method7529(var10[var12], true);
      }

      class407[] var13 = class375.method5064(arg1, Statics.field7089, 0);
      Statics.field3594 = new class383[var13.length];

      for(int var14 = 0; var14 < var13.length; ++var14) {
         Statics.field3594[var14] = arg0.method7529(var13[var14], true);
      }

      class407[] var15 = class375.method5064(arg1, Statics.field7092, 0);
      Statics.field5594 = new class383[var15.length];
      byte var16 = 12;

      for(int var17 = 0; var17 < var15.length; ++var17) {
         var15[var17].method5598(-var16 + (int)(Math.random() * (double)var16 * 2.0D), -var16 + (int)(Math.random() * (double)var16 * 2.0D), -var16 + (int)(Math.random() * (double)var16 * 2.0D));
         Statics.field5594[var17] = arg0.method7529(var15[var17], true);
      }

      class407[] var18 = class375.method5064(arg1, Statics.field7085, 0);
      Statics.field6914 = new class383[var18.length];
      byte var19 = 12;

      for(int var20 = 0; var20 < var18.length; ++var20) {
         var18[var20].method5598(-var19 + (int)(Math.random() * (double)var19 * 2.0D), -var19 + (int)(Math.random() * (double)var19 * 2.0D), -var19 + (int)(Math.random() * (double)var19 * 2.0D));
         Statics.field6914[var20] = arg0.method7529(var18[var20], true);
      }

      Statics.field340 = arg0.method7529(class375.method5065(arg1, Statics.field9, 0), true);
      Statics.field9426 = arg0.method7529(class375.method5065(arg1, Statics.field7088, 0), true);
      class407[] var21 = class375.method5064(arg1, Statics.field8401, 0);
      Statics.field5489 = new class383[var21.length];

      for(int var22 = 0; var22 < var21.length; ++var22) {
         Statics.field5489[var22] = arg0.method7529(var21[var22], true);
      }

   }

   @deob.ObfuscatedName("vb.a(I)V")
   public static void method15379() {
      Statics.field5483 = null;
      Statics.field6177 = null;
      Statics.field7095 = null;
      Statics.field6678 = null;
      Statics.field7096 = null;
      Statics.field3102 = null;
      Statics.field7090 = null;
      Statics.field3083 = null;
      Statics.field3594 = null;
      Statics.field5594 = null;
      Statics.field6914 = null;
      Statics.field340 = null;
      Statics.field9426 = null;
      Statics.field5489 = null;
   }
}
