import java.util.HashMap;
import java.util.Map;

@deob.ObfuscatedName("lx")
public final class class633 {
   @deob.ObfuscatedName("lx.b")
   private final long field5745;
   @deob.ObfuscatedName("lx.p")
   private final int field5742;
   @deob.ObfuscatedName("lx.r")
   private final class628 field5747;
   @deob.ObfuscatedName("lx.n")
   private final Map field5743;
   @deob.ObfuscatedName("lx.k")
   private final class284 field5746;
   @deob.ObfuscatedName("lx.d")
   private final class284 field5744;

   public class633(int arg0, class628 arg1) {
      this(-1L, arg0, arg1);
   }

   private class633(long arg0, int arg1, class628 arg2) {
      this.field5745 = arg0;
      this.field5742 = arg1;
      this.field5747 = arg2;
      if (this.field5742 == -1) {
         this.field5743 = new HashMap(64);
         this.field5746 = new class284(64);
         this.field5744 = null;
      } else {
         if (this.field5747 == null) {
            throw new IllegalArgumentException("");
         }

         this.field5743 = new HashMap(this.field5742);
         this.field5746 = new class284(this.field5742);
         this.field5744 = new class284(this.field5742);
      }

   }

   @deob.ObfuscatedName("lx.n(I)Z")
   private boolean method9139() {
      return this.field5742 != -1;
   }

   @deob.ObfuscatedName("lx.k(Ljava/lang/Object;I)Ljava/lang/Object;")
   public Object method9140(Object arg0) {
      synchronized(this) {
         if (this.field5745 != -1L) {
            this.method9143();
         }

         class627 var3 = (class627)this.field5743.get(arg0);
         if (var3 == null) {
            return null;
         } else {
            this.method9142(var3, false);
            return var3.field5705;
         }
      }
   }

   @deob.ObfuscatedName("lx.d(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;")
   public Object method9141(Object arg0, Object arg1) {
      synchronized(this) {
         if (this.field5745 != -1L) {
            this.method9143();
         }

         class627 var4 = (class627)this.field5743.get(arg0);
         if (var4 != null) {
            Object var5 = var4.field5705;
            var4.field5705 = arg1;
            this.method9142(var4, false);
            return var5;
         } else {
            if (this.method9139() && this.field5743.size() == this.field5742) {
               class627 var6 = (class627)this.field5744.remove();
               this.field5743.remove(var6.field5707);
               this.field5746.remove(var6);
            }

            class627 var7 = new class627(arg1, arg0);
            this.field5743.put(arg0, var7);
            this.method9142(var7, true);
            return null;
         }
      }
   }

   @deob.ObfuscatedName("lx.b(Ljava/lang/Object;B)Ljava/lang/Object;")
   public Object method9151(Object arg0) {
      synchronized(this) {
         if (this.field5745 != -1L) {
            this.method9143();
         }

         class627 var3 = (class627)this.field5743.remove(arg0);
         if (var3 != null) {
            this.field5746.remove(var3);
            if (this.method9139()) {
               this.field5744.remove(var3);
            }

            return var3.field5705;
         } else {
            return null;
         }
      }
   }

   @deob.ObfuscatedName("lx.r(Llr;ZI)V")
   private void method9142(class627 arg0, boolean arg1) {
      if (!arg1) {
         this.field5746.remove(arg0);
         if (this.method9139() && !this.field5744.remove(arg0)) {
            throw new IllegalStateException("");
         }
      }

      arg0.field5706 = System.currentTimeMillis();
      if (this.method9139()) {
         switch(this.field5747.field5710) {
         case 0:
            arg0.field5704 = arg0.field5706;
            break;
         case 1:
            ++arg0.field5704;
         }

         this.field5744.add(arg0);
      }

      this.field5746.add(arg0);
   }

   @deob.ObfuscatedName("lx.p(I)V")
   private void method9143() {
      if (this.field5745 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - this.field5745;

         while(!this.field5746.isEmpty()) {
            class627 var3 = (class627)this.field5746.peek();
            if (var3.field5706 >= var1) {
               return;
            }

            this.field5743.remove(var3.field5707);
            this.field5746.remove(var3);
            if (this.method9139()) {
               this.field5744.remove(var3);
            }
         }

      }
   }

   @deob.ObfuscatedName("lx.o(I)V")
   public void method9155() {
      synchronized(this) {
         this.field5743.clear();
         this.field5746.clear();
         if (this.method9139()) {
            this.field5744.clear();
         }

      }
   }
}
