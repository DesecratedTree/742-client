@deob.ObfuscatedName("lu")
public abstract class class630 {
   @deob.ObfuscatedName("lu.r")
   protected class846 field5723 = new class846();
   @deob.ObfuscatedName("lu.p")
   protected class846 field5721 = new class846();
   @deob.ObfuscatedName("lu.o")
   protected class846 field5725 = new class846();
   @deob.ObfuscatedName("lu.a")
   protected class846 field5722 = new class846();
   @deob.ObfuscatedName("lu.l")
   protected class124 field5729 = new class124(6);
   @deob.ObfuscatedName("lu.u")
   protected byte field5730 = 0;
   @deob.ObfuscatedName("lu.v")
   public volatile int field5732 = 0;
   @deob.ObfuscatedName("lu.g")
   public volatile int field5724 = 0;
   @deob.ObfuscatedName("lu.h")
   protected class124 field5733 = new class124(10);
   @deob.ObfuscatedName("lu.x")
   protected int field5719;
   @deob.ObfuscatedName("lu.s")
   protected long field5728;
   @deob.ObfuscatedName("lu.e")
   protected class313 field5734;

   @deob.ObfuscatedName("lu.n(IIBZI)Lals;")
   public class313 method9107(int arg0, int arg1, byte arg2, boolean arg3) {
      long var5 = ((long)arg0 << 32) + (long)arg1;
      class313 var7 = new class313();
      var7.field808 = var5;
      var7.field1968 = arg2;
      var7.field1756 = arg3;
      if (arg3) {
         if (this.method9116() >= 50) {
            throw new RuntimeException();
         }

         this.field5723.method14938(var7);
      } else {
         if (this.method9110() >= 20) {
            throw new RuntimeException();
         }

         this.field5725.method14938(var7);
      }

      return var7;
   }

   @deob.ObfuscatedName("lu.k(I)Z")
   public boolean method9108() {
      return this.method9110() >= 20;
   }

   @deob.ObfuscatedName("lu.d(B)Z")
   public boolean method9109() {
      return this.method9116() >= 50;
   }

   @deob.ObfuscatedName("lu.b(I)I")
   protected int method9110() {
      return this.field5725.method14930() + this.field5722.method14930();
   }

   @deob.ObfuscatedName("lu.r(I)I")
   public int method9116() {
      return this.field5723.method14930() + this.field5721.method14930();
   }

   @deob.ObfuscatedName("lu.p(I)V")
   public abstract void method668();

   @deob.ObfuscatedName("lu.o(I)Z")
   public abstract boolean method669();

   @deob.ObfuscatedName("lu.s(I)V")
   public abstract void method672();

   @deob.ObfuscatedName("lu.l(B)V")
   public abstract void method673();

   @deob.ObfuscatedName("lu.u(I)V")
   public abstract void method674();

   @deob.ObfuscatedName("lu.a(Ljava/lang/Object;ZB)V")
   public abstract void method682(Object arg0, boolean arg1);

   @deob.ObfuscatedName("lu.x(ZI)V")
   public abstract void method670(boolean arg0);
}
