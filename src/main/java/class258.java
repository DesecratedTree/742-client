@deob.ObfuscatedName("ajm")
public class class258 extends class107 {
   @deob.ObfuscatedName("ajm.o")
   private class875 field1725;

   @deob.ObfuscatedName("ajm.n(Laen;B)V")
   public void method3474(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method3473(arg0, var2);
      }
   }

   @deob.ObfuscatedName("ajm.k(Laen;II)V")
   private void method3473(class124 arg0, int arg1) {
      if (arg1 == 249) {
         int var3 = arg0.method1688();
         if (this.field1725 == null) {
            int var4 = class887.method4053(var3);
            this.field1725 = new class875(var4);
         }

         for(int var5 = 0; var5 < var3; ++var5) {
            boolean var6 = arg0.method1688() == 1;
            int var7 = arg0.method1589();
            class674 var8;
            if (var6) {
               var8 = new class106(arg0.method1599());
            } else {
               var8 = new class108(arg0.method1591());
            }

            this.field1725.method15311(var8, (long)var7);
         }
      }

   }

   @deob.ObfuscatedName("ajm.d(IIB)I")
   public int method3471(int arg0, int arg1) {
      if (this.field1725 == null) {
         return arg1;
      } else {
         class108 var3 = (class108)this.field1725.method15322((long)arg0);
         return var3 == null ? arg1 : var3.field811;
      }
   }

   @deob.ObfuscatedName("ajm.b(ILjava/lang/String;I)Ljava/lang/String;")
   public String method3472(int arg0, String arg1) {
      if (this.field1725 == null) {
         return arg1;
      } else {
         class106 var3 = (class106)this.field1725.method15322((long)arg0);
         return var3 == null ? arg1 : (String)var3.field807;
      }
   }
}
