@deob.ObfuscatedName("rw")
public class class794 {
   @deob.ObfuscatedName("rw.r")
   public int field7257 = -1;
   @deob.ObfuscatedName("rw.p")
   public int field7254 = -1;
   @deob.ObfuscatedName("rw.b")
   public int[] field7256;
   @deob.ObfuscatedName("rw.a")
   public int[] field7258;
   @deob.ObfuscatedName("rw.o")
   public int[] field7260;

   public class794(class612 arg0) {
      byte[] var2 = arg0.method8809(class780.field7154.field7155);
      this.method14180(new class124(var2));
      if (this.field7256 == null) {
         throw new RuntimeException("");
      }
   }

   @deob.ObfuscatedName("rw.n(Laen;B)V")
   private void method14180(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            int var3 = arg0.method1688();
            this.field7256 = new int[var3];

            for(int var4 = 0; var4 < this.field7256.length; ++var4) {
               this.field7256[var4] = arg0.method1688();
               if (this.field7256[var4] != 0 && this.field7256[var4] == 2) {
               }
            }
         } else if (var2 == 3) {
            this.field7257 = arg0.method1688();
         } else if (var2 == 4) {
            this.field7254 = arg0.method1688();
         } else if (var2 == 5) {
            this.field7260 = new int[arg0.method1688()];

            for(int var5 = 0; var5 < this.field7260.length; ++var5) {
               this.field7260[var5] = arg0.method1688();
            }
         } else if (var2 == 6) {
            this.field7258 = new int[arg0.method1688()];

            for(int var6 = 0; var6 < this.field7258.length; ++var6) {
               this.field7258[var6] = arg0.method1688();
            }
         }
      }
   }
}
