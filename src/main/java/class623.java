import java.util.LinkedList;

@deob.ObfuscatedName("ln")
public class class623 implements Runnable {
   @deob.ObfuscatedName("ln.n")
   private volatile boolean field5601 = false;
   @deob.ObfuscatedName("ln.k")
   private LinkedList field5600 = new LinkedList();
   @deob.ObfuscatedName("ln.d")
   private class658 field5602 = new class658(true);

   @deob.ObfuscatedName("ln.n(Ltf;B)V")
   public void method8953(class831 arg0) {
      this.field5602.method9529(arg0);
   }

   @deob.ObfuscatedName("ln.k(Lmn;I)V")
   public void method8954(class650 arg0) {
      LinkedList var2 = this.field5600;
      synchronized(this.field5600) {
         this.field5600.add(arg0);
         this.field5600.notify();
      }
   }

   @deob.ObfuscatedName("ln.d(S)Z")
   public boolean method8955() {
      return this.field5601;
   }

   @deob.ObfuscatedName("ln.b(I)Lmv;")
   public class658 method8956() {
      return this.field5602;
   }

   @deob.ObfuscatedName("ln.r(Lmv;I)V")
   public void method8957(class658 arg0) {
      this.field5602 = arg0;
   }

   public void run() {
      while(true) {
         this.method8968();
      }
   }

   @deob.ObfuscatedName("ln.p(I)V")
   private void method8968() {
      Object var1 = null;
      LinkedList var2 = this.field5600;
      class650 var4;
      synchronized(this.field5600) {
         try {
            this.field5600.wait();
         } catch (InterruptedException var14) {
         }

         var4 = (class650)this.field5600.pollFirst();
      }

      try {
         if (var4 != null) {
            this.field5601 = true;
            this.method8959(var4);
         }
      } catch (Exception var12) {
      } finally {
         this.field5601 = false;
      }

   }

   @deob.ObfuscatedName("ln.o(Lmn;B)V")
   private void method8959(class650 arg0) {
      if (class657.field5992 == arg0.field5935) {
         this.field5602.method9531();
      } else {
         this.field5602.method9537(arg0);
      }

      for(boolean var2 = this.field5602.method9548(); !var2; var2 = this.field5602.method9548()) {
      }

      this.field5602.method9532();
      client.field2468.method9532();
   }
}
