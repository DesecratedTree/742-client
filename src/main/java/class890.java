@deob.ObfuscatedName("vk")
public class class890 {
   @deob.ObfuscatedName("vk.b")
   public boolean field9078 = false;
   @deob.ObfuscatedName("vk.k")
   public int field9079;
   @deob.ObfuscatedName("vk.d")
   public int field9080;
   @deob.ObfuscatedName("vk.n")
   public class918 field9081;

   @deob.ObfuscatedName("vk.n(Laen;I)V")
   public void method15496(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15497(arg0, var2);
      }
   }

   @deob.ObfuscatedName("vk.k(Laen;II)V")
   private void method15497(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field9079 = arg0.method1608();
      } else if (arg1 == 2) {
         this.field9080 = arg0.method1589();
      } else if (arg1 == 3) {
         this.field9078 = true;
      } else if (arg1 == 4) {
         this.field9079 = -1;
      }

   }

   @deob.ObfuscatedName("vk.d(Lra;IZB)Lcy;")
   public class383 method15498(class772 arg0, int arg1, boolean arg2) {
      long var4 = (long)(this.field9079 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.field7106 << 19);
      class383 var6 = (class383)this.field9081.field9362.method10909(var4);
      if (var6 != null) {
         return var6;
      } else if (!this.field9081.field9363.method8790(this.field9079)) {
         return null;
      } else {
         class407 var7 = class375.method5065(this.field9081.field9363, this.field9079, 0);
         if (var7 != null) {
            var7.method5546();
            if (arg2) {
               var7.method5570();
            }

            for(int var8 = 0; var8 < arg1; ++var8) {
               var7.method5612();
            }
         }

         class383 var9 = arg0.method7529(var7, true);
         if (var9 != null) {
            this.field9081.field9362.method10880(var9, var4);
         }

         return var9;
      }
   }

   @deob.ObfuscatedName("vk.b(I)Z")
   public boolean method15499() {
      return this.field9081.field9363.method8790(this.field9079);
   }
}
