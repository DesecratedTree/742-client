@deob.ObfuscatedName("wj")
public class class916 {
   @deob.ObfuscatedName("wj.n")
   public class531[] field9347;

   @deob.ObfuscatedName("wj.n(Laen;I)V")
   public void method15819(class124 arg0) {
      this.field9347 = new class531[arg0.method1688()];
      class538[] var2 = class538.method11577();

      for(int var3 = 0; var3 < this.field9347.length; ++var3) {
         this.field9347[var3] = this.method15820(arg0, var2[arg0.method1688()]);
      }

   }

   @deob.ObfuscatedName("wj.k(Laen;Lir;I)Lik;")
   private class531 method15820(class124 arg0, class538 arg1) {
      if (class538.field4250 == arg1) {
         return class524.method11591(arg0);
      } else if (class538.field4248 == arg1) {
         return class49.method5339(arg0);
      } else if (class538.field4249 == arg1) {
         return class542.method16248(arg0);
      } else if (class538.field4253 == arg1) {
         return class35.method7308(arg0);
      } else if (class538.field4252 == arg1) {
         return class527.method10806(arg0);
      } else if (class538.field4247 == arg1) {
         return class36.method16047(arg0);
      } else if (class538.field4255 == arg1) {
         return class38.method9966(arg0);
      } else if (class538.field4254 == arg1) {
         return class523.method5789(arg0);
      } else if (class538.field4251 == arg1) {
         return class543.method10285(arg0);
      } else {
         return class538.field4256 == arg1 ? class215.method14240(arg0) : null;
      }
   }
}
