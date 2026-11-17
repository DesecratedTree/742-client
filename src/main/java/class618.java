@deob.ObfuscatedName("li")
public class class618 implements Runnable {
   @deob.ObfuscatedName("li.n")
   private class846 field5569 = new class846();
   @deob.ObfuscatedName("li.k")
   public int field5568 = 0;
   @deob.ObfuscatedName("li.d")
   private boolean field5570 = false;
   @deob.ObfuscatedName("li.b")
   private Thread field5571 = new Thread(this);

   public class618() {
      this.field5571.setDaemon(true);
      this.field5571.start();
      this.field5571.setPriority(1);
   }

   @deob.ObfuscatedName("li.n(ILon;I)Lalo;")
   public class310 method8906(int arg0, class704 arg1) {
      class310 var3 = new class310();
      var3.field1942 = 1;
      class846 var4 = this.field5569;
      synchronized(this.field5569) {
         class310 var5 = (class310)this.field5569.method14944();

         while(true) {
            if (var5 == null) {
               break;
            }

            if (var5.field808 == (long)arg0 && var5.field1940 == arg1 && var5.field1942 == 2) {
               var3.field1943 = var5.field1943;
               var3.field1758 = false;
               return var3;
            }

            var5 = (class310)this.field5569.method14929();
         }
      }

      var3.field1943 = arg1.method10328(arg0);
      var3.field1758 = false;
      var3.field1756 = true;
      return var3;
   }

   @deob.ObfuscatedName("li.k(I[BLon;I)Lalo;")
   public class310 method8907(int arg0, byte[] arg1, class704 arg2) {
      class310 var4 = new class310();
      var4.field1942 = 2;
      var4.field808 = (long)arg0;
      var4.field1943 = arg1;
      var4.field1940 = arg2;
      var4.field1756 = false;
      this.method8904(var4);
      return var4;
   }

   @deob.ObfuscatedName("li.d(ILon;I)Lalo;")
   public class310 method8905(int arg0, class704 arg1) {
      class310 var3 = new class310();
      var3.field1942 = 3;
      var3.field808 = (long)arg0;
      var3.field1940 = arg1;
      var3.field1756 = false;
      this.method8904(var3);
      return var3;
   }

   @deob.ObfuscatedName("li.b(Lalo;B)V")
   private void method8904(class310 arg0) {
      class846 var2 = this.field5569;
      synchronized(this.field5569) {
         this.field5569.method14938(arg0);
         ++this.field5568;
         this.field5569.notifyAll();
      }
   }

   public void run() {
      while(!this.field5570) {
         class846 var1 = this.field5569;
         class310 var2;
         synchronized(this.field5569) {
            var2 = (class310)this.field5569.method14923();
            if (var2 == null) {
               try {
                  this.field5569.wait();
               } catch (InterruptedException var7) {
               }
               continue;
            }

            --this.field5568;
         }

         try {
            if (var2.field1942 == 2) {
               var2.field1940.method10329((int)var2.field808, var2.field1943, var2.field1943.length);
            } else if (var2.field1942 == 3) {
               var2.field1943 = var2.field1940.method10328((int)var2.field808);
            }
         } catch (Exception var6) {
            class285.method15864((String)null, var6);
         }

         var2.field1758 = false;
      }

   }

   @deob.ObfuscatedName("li.r(I)V")
   public void method8903() {
      this.field5570 = true;
      class846 var1 = this.field5569;
      synchronized(this.field5569) {
         this.field5569.notifyAll();
      }

      try {
         this.field5571.join();
      } catch (InterruptedException var4) {
      }

      this.field5571 = null;
   }
}
