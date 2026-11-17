import jaclib.ping.Ping;

@deob.ObfuscatedName("ks")
public class class601 {
   @deob.ObfuscatedName("ks.k")
   private static int field5449 = 0;
   @deob.ObfuscatedName("ks.d")
   private static int field5448 = 0;

   private class601() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("id.n(B)I")
   public static int method7317() {
      if (field5449 == 0) {
         class901.field9195.method15679(new class594("jaclib"));
         if (class901.field9195.method15675().method8265() != 100) {
            return 1;
         }

         if (!((class594)class901.field9195.method15675()).method8347()) {
            Statics.field561.method9775();
            class762.method5484();

            try {
               Ping.init();
            } catch (Throwable var19) {
            }
         }

         field5449 = 1;
      }

      if (field5449 == 1) {
         Statics.field5450 = class901.method15678();
         class901.field9196.method15679(new class607(Statics.field2838));
         class901.field9222.method15679(new class594("jaggl"));
         class901.field9197.method15679(new class594("jagdx"));
         class901.field9198.method15679(new class594("sw3d"));
         class901.field9199.method15679(new class594("hw3d"));
         class901.field9214.method15679(new class594("jagtheora"));
         class901.field9194.method15679(new class607(Statics.field6375));
         class901.field9202.method15679(new class607(Statics.field8465));
         class901.field9203.method15679(new class607(Statics.field3567));
         class901.field9204.method15679(new class607(Statics.field6724));
         class901.field9201.method15679(new class607(Statics.field8546));
         class901.field9216.method15679(new class607(Statics.field9437));
         class901.field9207.method15679(new class607(Statics.field452));
         class901.field9208.method15679(new class607(Statics.field1169));
         class901.field9209.method15679(new class607(Statics.field6084));
         class901.field9210.method15679(new class607(Statics.field6858));
         class901.field9211.method15679(new class607(Statics.field8783));
         class901.field9212.method15679(new class607(Statics.field1995));
         class901.field9213.method15679(new class607(Statics.field7197));
         class901.field9218.method15679(new class607(Statics.field9246));
         class901.field9200.method15679(new class589(Statics.field3937, "huffman"));
         class901.field9215.method15679(new class607(Statics.field132));
         class901.field9206.method15679(new class607(Statics.field3827));
         class901.field9205.method15679(new class607(Statics.field4891));
         class901.field9219.method15679(new class587(Statics.field2508, "details"));

         for(int var1 = 0; var1 < Statics.field5450.length; ++var1) {
            if (Statics.field5450[var1].method15675() == null) {
               throw new RuntimeException();
            }
         }

         int var2 = 0;
         class901[] var3 = Statics.field5450;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            class901 var5 = var3[var4];
            int var6 = var5.method15676();
            int var7 = var5.method15675().method8265();
            var2 += var6 * var7 / 100;
         }

         field5448 = var2;
         field5449 = 2;
      }

      if (Statics.field5450 == null) {
         return 100;
      } else {
         int var8 = 0;
         int var9 = 0;
         boolean var10 = true;
         class901[] var11 = Statics.field5450;

         for(int var12 = 0; var12 < var11.length; ++var12) {
            class901 var13 = var11[var12];
            int var14 = var13.method15676();
            int var15 = var13.method15675().method8265();
            if (var15 < 100) {
               var10 = false;
            }

            var8 += var14;
            var9 += var14 * var15 / 100;
         }

         if (var10) {
            if (!((class594)class901.field9214.method15675()).method8347()) {
               client.field2657 = Statics.field561.method9776();
            }

            Statics.field5450 = null;
         }

         int var16 = var9 - field5448;
         int var17 = var8 - field5448;
         int var18 = var17 > 0 ? var16 * 100 / var17 : 100;
         if (!var10 && var18 > 99) {
            var18 = 99;
         }

         return var18;
      }
   }
}
