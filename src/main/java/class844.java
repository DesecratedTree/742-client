import java.util.Iterator;

@deob.ObfuscatedName("ts")
public class class844 implements Iterator {
   @deob.ObfuscatedName("ts.d")
   private class674 field8647 = null;
   @deob.ObfuscatedName("ts.n")
   private class849 field8648;
   @deob.ObfuscatedName("ts.k")
   private class674 field8649;

   public class844(class849 arg0) {
      this.field8648 = arg0;
      this.field8649 = this.field8648.field8711.field6136;
      this.field8647 = null;
   }

   @deob.ObfuscatedName("ts.o(Ltx;B)V")
   public void method14903(class849 arg0) {
      this.field8648 = arg0;
      this.field8649 = this.field8648.field8711.field6136;
      this.field8647 = null;
   }

   @deob.ObfuscatedName("ts.a(I)V")
   private void method14905() {
      this.field8649 = this.field8648.field8711.field6136;
      this.field8647 = null;
   }

   @deob.ObfuscatedName("ts.x(I)Lnk;")
   public class674 method14915() {
      this.method14905();
      return (class674)this.next();
   }

   public Object next() {
      class674 var1 = this.field8649;
      if (this.field8648.field8711 == var1) {
         var1 = null;
         this.field8649 = null;
      } else {
         this.field8649 = var1.field6136;
      }

      this.field8647 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field8648.field8711 != this.field8649;
   }

   public void remove() {
      if (this.field8647 == null) {
         throw new IllegalStateException();
      } else {
         this.field8647.method9864();
         this.field8647 = null;
      }
   }
}
