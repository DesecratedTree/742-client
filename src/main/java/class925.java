import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

@deob.ObfuscatedName("ws")
public final class class925 {
   @deob.ObfuscatedName("ws.d")
   private ReferenceQueue field9395 = new ReferenceQueue();
   @deob.ObfuscatedName("ws.k")
   private class274[] field9393 = new class274[16];
   @deob.ObfuscatedName("ws.n")
   private int field9394;

   @deob.ObfuscatedName("ws.n(Ljava/lang/Object;Ljava/lang/Object;I)V")
   public void method15895(Object arg0, Object arg1) {
      if (arg0 == null) {
         throw new NullPointerException();
      } else {
         this.method15898();
         int var3 = System.identityHashCode(arg0);
         int var4 = var3 & this.field9393.length - 1;
         class274 var5 = this.field9393[var4];
         if (var5 == null) {
            this.field9393[var4] = new class274(arg0, this.field9395, var3, arg1);
            ++this.field9394;
            if (this.field9394 >= this.field9393.length) {
               this.method15894();
            }
         } else {
            while(var5.get() != arg0) {
               if (var5.field1808 == null) {
                  var5.field1808 = new class274(arg0, this.field9395, var3, arg1);
                  ++this.field9394;
                  if (this.field9394 >= this.field9393.length) {
                     this.method15894();
                  }
                  break;
               }

               var5 = var5.field1808;
            }
         }

      }
   }

   @deob.ObfuscatedName("ws.k(Ljava/lang/Object;B)V")
   public void method15893(Object arg0) {
      if (arg0 == null) {
         throw new NullPointerException();
      } else {
         this.method15898();
         int var2 = System.identityHashCode(arg0);
         int var3 = var2 & this.field9393.length - 1;
         class274 var4 = this.field9393[var3];
         if (var4 != null) {
            if (var4.get() == arg0) {
               this.field9393[var3] = var4.field1808;
               --this.field9394;
            } else {
               while(true) {
                  class274 var5 = var4.field1808;
                  if (var5 == null) {
                     break;
                  }

                  if (var5.get() == arg0) {
                     var4.field1808 = var5.field1808;
                     --this.field9394;
                     break;
                  }

                  var4 = var5;
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("ws.d(I)Ljava/util/ArrayList;")
   public ArrayList method15896() {
      this.method15898();
      ArrayList var1 = new ArrayList(this.field9394);
      class274[] var2 = this.field9393;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         for(class274 var4 = var2[var3]; var4 != null; var4 = var4.field1808) {
            Object var5 = var4.get();
            if (var5 != null) {
               var1.add(var5);
            }
         }
      }

      return var1;
   }

   @deob.ObfuscatedName("ws.b(B)V")
   private void method15894() {
      class274[] var1 = this.field9393;
      this.field9393 = new class274[var1.length * 2];
      class274[] var2 = var1;

      class274 var5;
      for(int var3 = 0; var3 < var2.length; ++var3) {
         for(class274 var4 = var2[var3]; var4 != null; var4 = var5) {
            var5 = var4.field1808;
            int var6 = var4.field1807 & this.field9393.length - 1;
            var4.field1808 = this.field9393[var6];
            this.field9393[var6] = var4;
         }
      }

   }

   @deob.ObfuscatedName("ws.r(I)V")
   private void method15898() {
      while(true) {
         class274 var1 = (class274)this.field9395.poll();
         if (var1 == null) {
            return;
         }

         int var2 = var1.field1807 & this.field9393.length - 1;
         class274 var3 = this.field9393[var2];
         if (var1 == var3) {
            this.field9393[var2] = var1.field1808;
            --this.field9394;
         } else {
            while(var3 != null && var3.field1808 != var1) {
               var3 = var3.field1808;
            }

            if (var3 != null) {
               var3.field1808 = var1.field1808;
               --this.field9394;
            }
         }
      }
   }
}
