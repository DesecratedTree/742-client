import java.awt.Frame;

@deob.ObfuscatedName("ub")
public final class class854 {
   @deob.ObfuscatedName("ub.n")
   public static boolean field8745 = true;

   private class854() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ed.n(Lux;B)[Luo;")
   public static class867[] method5690(class876 arg0) {
      int[] var1 = arg0.method15335();
      class867[] var2 = new class867[var1.length >> 2];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class867 var4 = new class867();
         var2[var3] = var4;
         var4.field8814 = var1[var3 << 2];
         var4.field8815 = var1[(var3 << 2) + 1];
         var4.field8816 = var1[(var3 << 2) + 2];
         var4.field8817 = var1[(var3 << 2) + 3];
      }

      return var2;
   }

   @deob.ObfuscatedName("n.k(Lux;IIIII)Ljava/awt/Frame;")
   public static Frame method9705(class876 arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg3 == 0) {
         class867[] var5 = method5690(arg0);
         if (var5 == null) {
            return null;
         }

         boolean var6 = false;

         for(int var7 = 0; var7 < var5.length; ++var7) {
            if (var5[var7].field8814 == arg1 && var5[var7].field8815 == arg2 && (arg4 == 0 || var5[var7].field8817 == arg4) && (!var6 || var5[var7].field8816 > arg3)) {
               arg3 = var5[var7].field8816;
               var6 = true;
            }
         }

         if (!var6) {
            return null;
         }
      }

      Frame var8 = new Frame("Jagex Full Screen");
      var8.setResizable(false);
      arg0.method15336(var8, arg1, arg2, arg3, arg4);
      return var8;
   }
}
