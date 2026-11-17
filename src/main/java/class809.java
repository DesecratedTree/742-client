@deob.ObfuscatedName("sk")
public class class809 {
   @deob.ObfuscatedName("sk.n")
   private static int field8385 = 0;
   @deob.ObfuscatedName("sk.k")
   private static int field8384 = 0;
   @deob.ObfuscatedName("sk.d")
   private static int field8386 = 0;
   @deob.ObfuscatedName("sk.b")
   private static byte[][] field8387 = new byte[1000][];
   @deob.ObfuscatedName("sk.r")
   private static byte[][] field8388 = new byte[250][];
   @deob.ObfuscatedName("sk.p")
   private static byte[][] field8389 = new byte[50][];

   private class809() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("sk.n(II)[B")
   public static synchronized byte[] method14347(int arg0) {
      if (arg0 == 100 && field8385 > 0) {
         byte[] var1 = field8387[--field8385];
         field8387[field8385] = null;
         return var1;
      } else if (arg0 == 5000 && field8384 > 0) {
         byte[] var2 = field8388[--field8384];
         field8388[field8384] = null;
         return var2;
      } else if (arg0 == 30000 && field8386 > 0) {
         byte[] var3 = field8389[--field8386];
         field8389[field8386] = null;
         return var3;
      } else {
         if (Statics.field1103 != null) {
            for(int var4 = 0; var4 < Statics.field8522.length; ++var4) {
               if (Statics.field8522[var4] == arg0 && Statics.field8818[var4] > 0) {
                  byte[] var5 = Statics.field1103[var4][--Statics.field8818[var4]];
                  Statics.field1103[var4][Statics.field8818[var4]] = null;
                  return var5;
               }
            }
         }

         return new byte[arg0];
      }
   }

   @deob.ObfuscatedName("ey.k([BB)V")
   public static synchronized void method6126(byte[] arg0) {
      if (arg0.length == 100 && field8385 < 1000) {
         field8387[++field8385 - 1] = arg0;
      } else if (arg0.length == 5000 && field8384 < 250) {
         field8388[++field8384 - 1] = arg0;
      } else if (arg0.length == 30000 && field8386 < 50) {
         field8389[++field8386 - 1] = arg0;
      } else {
         if (Statics.field1103 != null) {
            for(int var1 = 0; var1 < Statics.field8522.length; ++var1) {
               if (Statics.field8522[var1] == arg0.length && Statics.field8818[var1] < Statics.field1103[var1].length) {
                  Statics.field1103[var1][Statics.field8818[var1]++] = arg0;
                  return;
               }
            }
         }

      }
   }
}
