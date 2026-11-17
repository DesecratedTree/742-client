import jaggl.OpenGL;

@deob.ObfuscatedName("akn")
public class class286 extends class225 {
   @deob.ObfuscatedName("akn.u")
   public int[] field1858 = null;
   @deob.ObfuscatedName("akn.l")
   private class9 field1859;

   public class286(class9 arg0, class428 arg1) {
      super(arg1);
      this.field1859 = arg0;
   }

   @deob.ObfuscatedName("akn.y()I")
   public final int method3672() {
      return this.field1858[this.field1859.method6018()];
   }

   @deob.ObfuscatedName("akn.n(I)Z")
   public boolean method3132(int arg0) {
      if (this.field1858 == null) {
         this.field1858 = new int[this.field1859.method6014()];
      }

      class17 var2 = (class17)this.field1859.method6015(arg0);
      this.field1858[arg0] = OpenGL.glGetUniformLocation(var2.field177, this.method3118());
      return this.field1858[arg0] != -1;
   }

   @deob.ObfuscatedName("akn.p(I)I")
   public final int method3122(int arg0) {
      return this.field1858[arg0];
   }
}
