import jaggl.OpenGL;

@deob.ObfuscatedName("abp")
public class class45 extends class619 implements class535 {
   public class45(class214 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, 34067, class372.field2736, class405.field3052, arg1 * arg1 * 6, arg2);
      this.field5576.method16470(this);
      if (arg2) {
         for(int var5 = 0; var5 < 6; ++var5) {
            this.method8928(var5 + 34069, arg1, arg1, arg3[var5]);
         }
      } else {
         for(int var6 = 0; var6 < 6; ++var6) {
            OpenGL.glTexImage2Di(var6 + 34069, 0, class214.method2903(this.field5574, this.field5581), arg1, arg1, 0, class214.method2900(this.field5574), this.field5576.field1418, arg3[var6], 0);
         }
      }

   }

   @deob.ObfuscatedName("abp.aq()V")
   public void method502() {
      super.method502();
   }

   @deob.ObfuscatedName("abp.ar(Lhg;)V")
   public void method503(class500 arg0) {
      super.method503(arg0);
   }

   @deob.ObfuscatedName("abp.d()V")
   public void method302() {
      super.method302();
   }
}
