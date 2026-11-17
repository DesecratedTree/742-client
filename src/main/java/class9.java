import jaggl.OpenGL;

@deob.ObfuscatedName("aag")
public class class9 extends class434 {
   @deob.ObfuscatedName("aag.x")
   private final class214 field98;
   @deob.ObfuscatedName("aag.l")
   private int field97;
   @deob.ObfuscatedName("aag.s")
   private class17 field96;

   public class9(class214 arg0, class414 arg1) {
      super(arg0, arg1);
      this.field98 = arg0;
   }

   @deob.ObfuscatedName("aag.r(Lys;Let;)Lej;")
   protected class422 method251(class979 arg0, class432 arg1) {
      return new class17((class214)arg0, this, arg1);
   }

   @deob.ObfuscatedName("aag.l(Lej;)Z")
   public boolean method267(class422 arg0) {
      if (this.field96 == arg0) {
         return true;
      } else if (!arg0.method284()) {
         return false;
      } else {
         boolean var2 = this.method255();
         this.field96 = (class17)arg0;
         this.field3620 = this.method6016(arg0);
         if (this.field3620 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.field97 = this.field96.field177;
            if (var2) {
               OpenGL.glUseProgram(this.field97);
               this.field98.field1425 = this.field96;
            }

            return true;
         }
      }
   }

   @deob.ObfuscatedName("aag.g(Lep;)Laig;")
   protected class225 method250(class428 arg0) {
      return new class286(this, arg0);
   }

   @deob.ObfuscatedName("aag.n()V")
   public void method264() {
      if (this.field98.field1425 != this.field96) {
         if (this.field96 == null) {
            throw new class298();
         } else {
            OpenGL.glUseProgram(this.field97);
            this.field98.field1425 = this.field96;
         }
      }
   }

   @deob.ObfuscatedName("aag.k()V")
   public void method254() {
   }

   @deob.ObfuscatedName("aag.d()Z")
   public boolean method255() {
      return this.field98.field1425 == this.field96;
   }

   @deob.ObfuscatedName("aag.ao()V")
   protected void method252() {
      for(int var1 = 0; var1 < this.method6014(); ++var1) {
         ((class17)this.method6015(var1)).method302();
      }

      super.method252();
   }

   public void finalize() throws Throwable {
      this.method252();
      super.finalize();
   }
}
