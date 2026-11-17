import java.util.zip.Inflater;

@deob.ObfuscatedName("xr")
public class class951 {
   @deob.ObfuscatedName("xr.n")
   private Inflater field9531;

   public class951() {
      this(-1, 1000000, 1000000);
   }

   private class951(int arg0, int arg1, int arg2) {
   }

   @deob.ObfuscatedName("xr.n([BI)[B")
   public byte[] method16023(byte[] arg0) {
      class124 var2 = new class124(arg0);
      var2.field935 = arg0.length - 4;
      int var3 = var2.method1592();
      byte[] var4 = new byte[var3];
      var2.field935 = 0;
      this.method16026(var2, var4);
      return var4;
   }

   @deob.ObfuscatedName("xr.k(Laen;[BI)V")
   public void method16026(class124 arg0, byte[] arg1) {
      if (arg0.field931[arg0.field935] == 31 && arg0.field931[arg0.field935 + 1] == -117) {
         if (this.field9531 == null) {
            this.field9531 = new Inflater(true);
         }

         try {
            this.field9531.setInput(arg0.field931, arg0.field935 + 10, arg0.field931.length - (arg0.field935 + 10 + 8));
            this.field9531.inflate(arg1);
         } catch (Exception var4) {
            this.field9531.reset();
            throw new RuntimeException("");
         }

         this.field9531.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
